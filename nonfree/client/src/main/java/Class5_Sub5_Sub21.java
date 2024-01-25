import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class5_Sub5_Sub21 extends Class5_Sub5 {

	@OriginalMember(owner = "client!wja", name = "t", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!wja", name = "w", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!wja", name = "D", descriptor = "Ljava/lang/String;")
	public String aString138;

	@OriginalMember(owner = "client!wja", name = "C", descriptor = "[I")
	public int[] anIntArray616;

	@OriginalMember(owner = "client!wja", name = "z", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(CB)I")
	public int method9189(@OriginalArg(0) char arg0) {
		if (this.anIntArray616 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray616.length; local21++) {
			if (this.aCharArray6[local21] == arg0) {
				return this.anIntArray616[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wja", name = "g", descriptor = "(I)V")
	public void method9190() {
		@Pc(6) int local6;
		if (this.anIntArray616 != null) {
			for (local6 = 0; local6 < this.anIntArray616.length; local6++) {
				this.anIntArray616[local6] |= 0x8000;
			}
		}
		if (this.anIntArray615 != null) {
			for (local6 = 0; local6 < this.anIntArray615.length; local6++) {
				this.anIntArray615[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(ILclient!ib;I)V")
	private void method9193(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub23 arg1) {
		if (arg0 == 1) {
			this.aString138 = arg1.method8497();
			return;
		}
		@Pc(34) int local34;
		@Pc(44) int local44;
		@Pc(59) byte local59;
		if (arg0 == 2) {
			local34 = arg1.method8529();
			this.anIntArray615 = new int[local34];
			this.aCharArray7 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray615[local44] = arg1.method8519();
				local59 = arg1.method8488();
				this.aCharArray7[local44] = local59 == 0 ? 0 : Static101.method1448(local59);
			}
		} else if (arg0 == 3) {
			local34 = arg1.method8529();
			this.anIntArray616 = new int[local34];
			this.aCharArray6 = new char[local34];
			for (local44 = 0; local44 < local34; local44++) {
				this.anIntArray616[local44] = arg1.method8519();
				local59 = arg1.method8488();
				this.aCharArray6[local44] = local59 == 0 ? 0 : Static101.method1448(local59);
			}
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(BC)I")
	public int method9195(@OriginalArg(1) char arg0) {
		if (this.anIntArray615 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray615.length; local21++) {
			if (this.aCharArray7[local21] == arg0) {
				return this.anIntArray615[local21];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(BLclient!ib;)V")
	public void method9196(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8529();
			if (local9 == 0) {
				return;
			}
			this.method9193(local9, arg0);
		}
	}
}
