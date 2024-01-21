import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCYXYCPV")
public final class Class14 {

	@OriginalMember(owner = "client!GCYXYCPV", name = "b", descriptor = "I")
	public static int anInt240;

	@OriginalMember(owner = "client!GCYXYCPV", name = "c", descriptor = "[Lclient!GCYXYCPV;")
	public static Class14[] aClass14Array1;

	@OriginalMember(owner = "client!GCYXYCPV", name = "e", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!GCYXYCPV", name = "d", descriptor = "I")
	public int anInt241 = -1;

	@OriginalMember(owner = "client!GCYXYCPV", name = "f", descriptor = "[I")
	private int[] anIntArray36 = new int[6];

	@OriginalMember(owner = "client!GCYXYCPV", name = "g", descriptor = "[I")
	private int[] anIntArray37 = new int[6];

	@OriginalMember(owner = "client!GCYXYCPV", name = "h", descriptor = "[I")
	private int[] anIntArray38 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!GCYXYCPV", name = "i", descriptor = "Z")
	public boolean aBoolean60 = false;

	static {
		aBoolean59 = true;
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "a", descriptor = "(ZLclient!XRWUKRPO;)V")
	public static void method140(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(16) Class8_Sub1_Sub3 local16 = new Class8_Sub1_Sub3(arg0.method553("idk.dat", null), -49015);
			anInt240 = local16.method167();
			if (aClass14Array1 == null) {
				aClass14Array1 = new Class14[anInt240];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt240; local26++) {
				if (aClass14Array1[local26] == null) {
					aClass14Array1[local26] = new Class14();
				}
				aClass14Array1[local26].method141((byte) 8, local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("12959, " + false + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "<init>", descriptor = "()V")
	private Class14() {
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	private void method141(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(17) int local17 = arg1.method165();
					if (local17 == 0) {
						return;
					}
					if (local17 == 1) {
						this.anInt241 = arg1.method165();
					} else if (local17 == 2) {
						@Pc(35) int local35 = arg1.method165();
						this.anIntArray35 = new int[local35];
						for (@Pc(41) int local41 = 0; local41 < local35; local41++) {
							this.anIntArray35[local41] = arg1.method167();
						}
					} else if (local17 == 3) {
						this.aBoolean60 = true;
					} else if (local17 >= 40 && local17 < 50) {
						this.anIntArray36[local17 - 40] = arg1.method167();
					} else if (local17 >= 50 && local17 < 60) {
						this.anIntArray37[local17 - 50] = arg1.method167();
					} else if (local17 >= 60 && local17 < 70) {
						this.anIntArray38[local17 - 60] = arg1.method167();
					} else {
						System.out.println("Error unrecognised config code: " + local17);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("53178, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "a", descriptor = "(B)Z")
	public boolean method142(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 2) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			if (this.anIntArray35 == null) {
				return true;
			}
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray35.length; local20++) {
				if (!Class8_Sub1_Sub2_Sub5.method464(this.anIntArray35[local20])) {
					local18 = false;
				}
			}
			return local18;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("57042, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "b", descriptor = "(B)Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 method143() {
		try {
			if (this.anIntArray35 == null) {
				return null;
			}
			@Pc(11) Class8_Sub1_Sub2_Sub5[] local11 = new Class8_Sub1_Sub2_Sub5[this.anIntArray35.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray35.length; local13++) {
				local11[local13] = Class8_Sub1_Sub2_Sub5.method463(this.anIntArray35[local13]);
			}
			@Pc(38) Class8_Sub1_Sub2_Sub5 local38;
			if (local11.length == 1) {
				local38 = local11[0];
			} else {
				local38 = new Class8_Sub1_Sub2_Sub5(local11.length, local11, -11616);
			}
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray36[local50] != 0; local50++) {
				local38.method477(this.anIntArray36[local50], this.anIntArray37[local50]);
			}
			return local38;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("92554, " + 4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "a", descriptor = "(I)Z")
	public boolean method144() {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray38[local9] != -1 && !Class8_Sub1_Sub2_Sub5.method464(this.anIntArray38[local9])) {
					local7 = false;
				}
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("55274, " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCYXYCPV", name = "b", descriptor = "(I)Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 method145() {
		try {
			@Pc(4) Class8_Sub1_Sub2_Sub5[] local4 = new Class8_Sub1_Sub2_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray38[local14] != -1) {
					local4[local6++] = Class8_Sub1_Sub2_Sub5.method463(this.anIntArray38[local14]);
				}
			}
			@Pc(43) Class8_Sub1_Sub2_Sub5 local43 = new Class8_Sub1_Sub2_Sub5(local6, local4, -11616);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray36[local45] != 0; local45++) {
				local43.method477(this.anIntArray36[local45], this.anIntArray37[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("20882, " + 0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
