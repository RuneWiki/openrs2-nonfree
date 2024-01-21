import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "[I")
	private int[] anIntArray439;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "[I")
	private final int[] anIntArray440 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
	public int anInt2619 = -1;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "[S")
	private final short[] aShortArray12 = new short[6];

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Z")
	public boolean method1805() {
		if (this.anIntArray439 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray439.length; local20++) {
			if (!Static42.aClass56_39.method1265(this.anIntArray439[local20], 0)) {
				local18 = false;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1806() {
		if (this.anIntArray439 == null) {
			return null;
		}
		@Pc(15) Class1_Sub2_Sub3_Sub7[] local15 = new Class1_Sub2_Sub3_Sub7[this.anIntArray439.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray439.length; local17++) {
			local15[local17] = Static117.method1886(Static42.aClass56_39, this.anIntArray439[local17]);
		}
		@Pc(46) Class1_Sub2_Sub3_Sub7 local46;
		if (local15.length == 1) {
			local46 = local15[0];
		} else {
			local46 = new Class1_Sub2_Sub3_Sub7(local15, local15.length);
		}
		for (@Pc(60) int local60 = 0; local60 < 6 && this.aShortArray11[local60] != 0; local60++) {
			local46.method1888(this.aShortArray11[local60], this.aShortArray12[local60]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1808() {
		@Pc(16) Class1_Sub2_Sub3_Sub7[] local16 = new Class1_Sub2_Sub3_Sub7[5];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 5; local20++) {
			if (this.anIntArray440[local20] != -1) {
				local16[local18++] = Static117.method1886(Static42.aClass56_39, this.anIntArray440[local20]);
			}
		}
		@Pc(51) Class1_Sub2_Sub3_Sub7 local51 = new Class1_Sub2_Sub3_Sub7(local16, local18);
		for (@Pc(53) int local53 = 0; local53 < 6 && this.aShortArray11[local53] != 0; local53++) {
			local51.method1888(this.aShortArray11[local53], this.aShortArray12[local53]);
		}
		return local51;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!dc;BI)V")
	private void method1809(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2619 = arg0.method672();
		} else if (arg1 == 2) {
			@Pc(86) int local86 = arg0.method672();
			this.anIntArray439 = new int[local86];
			for (@Pc(92) int local92 = 0; local92 < local86; local92++) {
				this.anIntArray439[local92] = arg0.method651();
			}
		} else if (arg1 == 3) {
			this.aBoolean117 = true;
		} else if (arg1 < 40 || arg1 >= 50) {
			if (arg1 >= 50 && arg1 < 60) {
				this.aShortArray12[arg1 - 50] = (short) arg0.method651();
				return;
			}
			if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray440[arg1 - 60] = arg0.method651();
				return;
			}
		} else {
			this.aShortArray11[arg1 - 40] = (short) arg0.method651();
			return;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!dc;I)V")
	public void method1810(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method672();
			if (local5 == 0) {
				return;
			}
			this.method1809(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Z")
	public boolean method1811() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray440[local5] != -1 && !Static42.aClass56_39.method1265(this.anIntArray440[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}
}
