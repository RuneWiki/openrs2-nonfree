import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BDUNOHSG")
public final class Class4 {

	@OriginalMember(owner = "client!BDUNOHSG", name = "e", descriptor = "I")
	public static int anInt100;

	@OriginalMember(owner = "client!BDUNOHSG", name = "f", descriptor = "[Lclient!BDUNOHSG;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!BDUNOHSG", name = "a", descriptor = "I")
	private static int anInt97 = 8;

	@OriginalMember(owner = "client!BDUNOHSG", name = "h", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!BDUNOHSG", name = "b", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!BDUNOHSG", name = "c", descriptor = "I")
	private int anInt98 = 25292;

	@OriginalMember(owner = "client!BDUNOHSG", name = "d", descriptor = "I")
	private int anInt99 = -948;

	@OriginalMember(owner = "client!BDUNOHSG", name = "g", descriptor = "I")
	public int anInt101 = -1;

	@OriginalMember(owner = "client!BDUNOHSG", name = "i", descriptor = "[I")
	private int[] anIntArray12 = new int[6];

	@OriginalMember(owner = "client!BDUNOHSG", name = "j", descriptor = "[I")
	private int[] anIntArray13 = new int[6];

	@OriginalMember(owner = "client!BDUNOHSG", name = "k", descriptor = "[I")
	private int[] anIntArray14 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!BDUNOHSG", name = "l", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!BDUNOHSG", name = "a", descriptor = "(Lclient!BYZSQZUF;Z)V")
	public static void method59(@OriginalArg(0) Class5 arg0) {
		try {
			@Pc(19) Class3_Sub1_Sub3 local19 = new Class3_Sub1_Sub3(0, arg0.method66("idk.dat", null));
			anInt100 = local19.method148();
			if (aClass4Array1 == null) {
				aClass4Array1 = new Class4[anInt100];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt100; local29++) {
				if (aClass4Array1[local29] == null) {
					aClass4Array1[local29] = new Class4();
				}
				aClass4Array1[local29].method60(anInt97, local19);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("22084, " + arg0 + ", " + false + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDUNOHSG", name = "<init>", descriptor = "()V")
	private Class4() {
	}

	@OriginalMember(owner = "client!BDUNOHSG", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private void method60(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				this.anInt99 = -494;
			}
			while (true) {
				while (true) {
					@Pc(10) int local10 = arg1.method146();
					if (local10 == 0) {
						return;
					}
					if (local10 == 1) {
						this.anInt101 = arg1.method146();
					} else if (local10 == 2) {
						@Pc(28) int local28 = arg1.method146();
						this.anIntArray11 = new int[local28];
						for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
							this.anIntArray11[local34] = arg1.method148();
						}
					} else if (local10 == 3) {
						this.aBoolean34 = true;
					} else if (local10 >= 40 && local10 < 50) {
						this.anIntArray12[local10 - 40] = arg1.method148();
					} else if (local10 >= 50 && local10 < 60) {
						this.anIntArray13[local10 - 50] = arg1.method148();
					} else if (local10 >= 60 && local10 < 70) {
						this.anIntArray14[local10 - 60] = arg1.method148();
					} else {
						System.out.println("Error unrecognised config code: " + local10);
					}
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("82743, " + arg0 + ", " + arg1 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDUNOHSG", name = "a", descriptor = "(I)Z")
	public boolean method61(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anIntArray11 == null) {
				return true;
			}
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray11.length; local12++) {
				if (!Class3_Sub1_Sub2_Sub6.method511(this.anIntArray11[local12])) {
					local10 = false;
				}
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("64090, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDUNOHSG", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 method62() {
		try {
			if (this.anIntArray11 == null) {
				return null;
			}
			@Pc(11) Class3_Sub1_Sub2_Sub6[] local11 = new Class3_Sub1_Sub2_Sub6[this.anIntArray11.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray11.length; local18++) {
				local11[local18] = Class3_Sub1_Sub2_Sub6.method510(this.anIntArray11[local18]);
			}
			@Pc(43) Class3_Sub1_Sub2_Sub6 local43;
			if (local11.length == 1) {
				local43 = local11[0];
			} else {
				local43 = new Class3_Sub1_Sub2_Sub6(local11, true, local11.length);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray12[local55] != 0; local55++) {
				local43.method524(this.anIntArray12[local55], this.anIntArray13[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("22366, " + true + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDUNOHSG", name = "b", descriptor = "(I)Z")
	public boolean method63(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt98) {
				throw new NullPointerException();
			}
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
				if (this.anIntArray14[local11] != -1 && !Class3_Sub1_Sub2_Sub6.method511(this.anIntArray14[local11])) {
					local9 = false;
				}
			}
			return local9;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("6827, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDUNOHSG", name = "c", descriptor = "(I)Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 method64(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Class3_Sub1_Sub2_Sub6[] local4 = new Class3_Sub1_Sub2_Sub6[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray14[local8] != -1) {
					local4[local6++] = Class3_Sub1_Sub2_Sub6.method510(this.anIntArray14[local8]);
				}
			}
			@Pc(37) Class3_Sub1_Sub2_Sub6 local37 = new Class3_Sub1_Sub2_Sub6(local4, true, local6);
			for (@Pc(39) int local39 = 0; local39 < 6 && this.anIntArray12[local39] != 0; local39++) {
				local37.method524(this.anIntArray12[local39], this.anIntArray13[local39]);
			}
			if (arg0 != 3) {
				for (@Pc(65) int local65 = 1; local65 > 0; local65++) {
				}
			}
			return local37;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("70618, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
