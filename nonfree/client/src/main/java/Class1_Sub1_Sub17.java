import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Ljava/lang/String;")
	public String aString86;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "[I")
	public int[] anIntArray556;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(CB)I")
	public int method5686(@OriginalArg(0) char arg0) {
		if (this.anIntArray555 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray555.length; local12++) {
			if (this.aCharArray6[local12] == arg0) {
				return this.anIntArray555[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method5687(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.aString86 = arg1.method4509();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg0 == 2) {
			local24 = arg1.method4548();
			this.aCharArray6 = new char[local24];
			this.anIntArray555 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray555[local34] = arg1.method4498();
				local47 = arg1.method4529();
				this.aCharArray6[local34] = local47 == 0 ? 0 : Static375.method5900(local47);
			}
		} else if (arg0 == 3) {
			local24 = arg1.method4548();
			this.anIntArray556 = new int[local24];
			this.aCharArray5 = new char[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray556[local34] = arg1.method4498();
				local47 = arg1.method4529();
				this.aCharArray5[local34] = local47 == 0 ? 0 : Static375.method5900(local47);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	public void method5689() {
		@Pc(6) int local6;
		if (this.anIntArray556 != null) {
			for (local6 = 0; local6 < this.anIntArray556.length; local6++) {
				this.anIntArray556[local6] |= 0x8000;
			}
		}
		if (this.anIntArray555 != null) {
			for (local6 = 0; local6 < this.anIntArray555.length; local6++) {
				this.anIntArray555[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method5690(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method5687(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(CB)I")
	public int method5691(@OriginalArg(0) char arg0) {
		if (this.anIntArray556 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray556.length; local17++) {
			if (arg0 == this.aCharArray5[local17]) {
				return this.anIntArray556[local17];
			}
		}
		return -1;
	}
}
