import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class2_Sub6_Sub20 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "[I")
	public int[] anIntArray659;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "Ljava/lang/String;")
	public String aString104;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "[I")
	public int[] anIntArray660;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!cea;)V")
	public void method8502(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8383();
			if (local17 == 0) {
				return;
			}
			this.method8508(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BC)I")
	public int method8503(@OriginalArg(1) char arg0) {
		if (this.anIntArray659 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray659.length; local12++) {
			if (arg0 == this.aCharArray6[local12]) {
				return this.anIntArray659[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)V")
	public void method8505() {
		@Pc(6) int local6;
		if (this.anIntArray659 != null) {
			for (local6 = 0; local6 < this.anIntArray659.length; local6++) {
				this.anIntArray659[local6] |= 0x8000;
			}
		}
		if (this.anIntArray660 != null) {
			for (local6 = 0; local6 < this.anIntArray660.length; local6++) {
				this.anIntArray660[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(CI)I")
	public int method8507(@OriginalArg(0) char arg0) {
		if (this.anIntArray660 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray660.length; local12++) {
			if (this.aCharArray7[local12] == arg0) {
				return this.anIntArray660[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method8508(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString104 = arg0.method8373();
			return;
		}
		@Pc(15) int local15;
		@Pc(25) int local25;
		@Pc(38) byte local38;
		if (arg1 == 2) {
			local15 = arg0.method8383();
			this.anIntArray660 = new int[local15];
			this.aCharArray7 = new char[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray660[local25] = arg0.method8326();
				local38 = arg0.method8384();
				this.aCharArray7[local25] = local38 == 0 ? 0 : Static172.method3629(local38);
			}
		} else if (arg1 == 3) {
			local15 = arg0.method8383();
			this.aCharArray6 = new char[local15];
			this.anIntArray659 = new int[local15];
			for (local25 = 0; local25 < local15; local25++) {
				this.anIntArray659[local25] = arg0.method8326();
				local38 = arg0.method8384();
				this.aCharArray6[local25] = local38 == 0 ? 0 : Static172.method3629(local38);
			}
		}
	}
}
