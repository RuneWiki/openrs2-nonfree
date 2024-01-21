import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XPVGEAJJ")
public final class Class46 {

	@OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "I")
	public static int anInt680;

	@OriginalMember(owner = "client!XPVGEAJJ", name = "b", descriptor = "[Lclient!XPVGEAJJ;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!XPVGEAJJ", name = "d", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!XPVGEAJJ", name = "c", descriptor = "I")
	public int anInt681 = -1;

	@OriginalMember(owner = "client!XPVGEAJJ", name = "e", descriptor = "[I")
	private int[] anIntArray169 = new int[6];

	@OriginalMember(owner = "client!XPVGEAJJ", name = "f", descriptor = "[I")
	private int[] anIntArray170 = new int[6];

	@OriginalMember(owner = "client!XPVGEAJJ", name = "g", descriptor = "[I")
	private int[] anIntArray171 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!XPVGEAJJ", name = "h", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(ZLclient!AKPFVPPG;)V")
	public static void method482(@OriginalArg(1) Class2 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method7("idk.dat", null), (byte) 3);
			anInt680 = local8.method104();
			if (aClass46Array1 == null) {
				aClass46Array1 = new Class46[anInt680];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt680; local21++) {
				if (aClass46Array1[local21] == null) {
					aClass46Array1[local21] = new Class46();
				}
				aClass46Array1[local21].method483(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("49540, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPVGEAJJ", name = "<init>", descriptor = "()V")
	private Class46() {
	}

	@OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private void method483(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method102();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt681 = arg0.method102();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method102();
					this.anIntArray168 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray168[local37] = arg0.method104();
					}
				} else if (local13 == 3) {
					this.aBoolean183 = true;
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray169[local13 - 40] = arg0.method104();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray170[local13 - 50] = arg0.method104();
				} else if (local13 >= 60 && local13 < 70) {
					this.anIntArray171[local13 - 60] = arg0.method104();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("31087, " + arg0 + ", " + 799 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(Z)Z")
	public boolean method484() {
		try {
			if (this.anIntArray168 == null) {
				return true;
			}
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray168.length; local19++) {
				if (!Class4_Sub1_Sub2_Sub3.method256(this.anIntArray168[local19])) {
					local17 = false;
				}
			}
			return local17;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("55635, " + true + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPVGEAJJ", name = "a", descriptor = "(I)Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 method485() {
		try {
			if (this.anIntArray168 == null) {
				return null;
			}
			@Pc(11) Class4_Sub1_Sub2_Sub3[] local11 = new Class4_Sub1_Sub2_Sub3[this.anIntArray168.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray168.length; local13++) {
				local11[local13] = Class4_Sub1_Sub2_Sub3.method255(this.anIntArray168[local13]);
			}
			@Pc(37) Class4_Sub1_Sub2_Sub3 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class4_Sub1_Sub2_Sub3(local11.length, local11, 127);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray169[local49] != 0; local49++) {
				local37.method269(this.anIntArray169[local49], this.anIntArray170[local49]);
			}
			return local37;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("41137, " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPVGEAJJ", name = "b", descriptor = "(I)Z")
	public boolean method486() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray171[local9] != -1 && !Class4_Sub1_Sub2_Sub3.method256(this.anIntArray171[local9])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("82810, " + -516 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XPVGEAJJ", name = "b", descriptor = "(Z)Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 method487(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) Class4_Sub1_Sub2_Sub3[] local4 = new Class4_Sub1_Sub2_Sub3[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray171[local8] != -1) {
					local4[local6++] = Class4_Sub1_Sub2_Sub3.method255(this.anIntArray171[local8]);
				}
			}
			@Pc(36) Class4_Sub1_Sub2_Sub3 local36 = new Class4_Sub1_Sub2_Sub3(local6, local4, 127);
			for (@Pc(38) int local38 = 0; local38 < 6 && this.anIntArray169[local38] != 0; local38++) {
				local36.method269(this.anIntArray169[local38], this.anIntArray170[local38]);
			}
			if (arg0) {
				for (@Pc(63) int local63 = 1; local63 > 0; local63++) {
				}
			}
			return local36;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("4526, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
