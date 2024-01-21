import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YMQGRGSI")
public final class Class47 {

	@OriginalMember(owner = "client!YMQGRGSI", name = "c", descriptor = "I")
	private static int anInt792;

	@OriginalMember(owner = "client!YMQGRGSI", name = "f", descriptor = "I")
	public static int anInt794;

	@OriginalMember(owner = "client!YMQGRGSI", name = "g", descriptor = "[Lclient!YMQGRGSI;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!YMQGRGSI", name = "d", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!YMQGRGSI", name = "i", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!YMQGRGSI", name = "a", descriptor = "I")
	private int anInt791 = 16191;

	@OriginalMember(owner = "client!YMQGRGSI", name = "b", descriptor = "Z")
	private boolean aBoolean202 = true;

	@OriginalMember(owner = "client!YMQGRGSI", name = "e", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!YMQGRGSI", name = "h", descriptor = "I")
	public int anInt795 = -1;

	@OriginalMember(owner = "client!YMQGRGSI", name = "j", descriptor = "[I")
	private int[] anIntArray201 = new int[6];

	@OriginalMember(owner = "client!YMQGRGSI", name = "k", descriptor = "[I")
	private int[] anIntArray202 = new int[6];

	@OriginalMember(owner = "client!YMQGRGSI", name = "l", descriptor = "[I")
	private int[] anIntArray203 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!YMQGRGSI", name = "m", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!YMQGRGSI", name = "a", descriptor = "(ILclient!SPZBTZXL;)V")
	public static void method548(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method491("idk.dat", null), anInt792);
			anInt794 = local10.method361();
			if (aClass47Array1 == null) {
				aClass47Array1 = new Class47[anInt794];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt794; local29++) {
				if (aClass47Array1[local29] == null) {
					aClass47Array1[local29] = new Class47();
				}
				aClass47Array1[local29].method549(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("20164, " + 68 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YMQGRGSI", name = "<init>", descriptor = "()V")
	private Class47() {
	}

	@OriginalMember(owner = "client!YMQGRGSI", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	private void method549(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (this.anInt791 != 16191) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg0.method359();
					if (local12 == 0) {
						return;
					}
					if (local12 == 1) {
						this.anInt795 = arg0.method359();
					} else if (local12 == 2) {
						@Pc(30) int local30 = arg0.method359();
						this.anIntArray200 = new int[local30];
						for (@Pc(36) int local36 = 0; local36 < local30; local36++) {
							this.anIntArray200[local36] = arg0.method361();
						}
					} else if (local12 == 3) {
						this.aBoolean204 = true;
					} else if (local12 >= 40 && local12 < 50) {
						this.anIntArray201[local12 - 40] = arg0.method361();
					} else if (local12 >= 50 && local12 < 60) {
						this.anIntArray202[local12 - 50] = arg0.method361();
					} else if (local12 >= 60 && local12 < 70) {
						this.anIntArray203[local12 - 60] = arg0.method361();
					} else {
						System.out.println("Error unrecognised config code: " + local12);
					}
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("526, " + arg0 + ", " + 16191 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YMQGRGSI", name = "a", descriptor = "(I)Z")
	public boolean method550() {
		try {
			if (this.anIntArray200 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray200.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub4.method271(this.anIntArray200[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("65417, " + -852 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YMQGRGSI", name = "b", descriptor = "(I)Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 method551(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray200 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub4[] local11 = new Class1_Sub1_Sub1_Sub4[this.anIntArray200.length];
			@Pc(15) boolean local15 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray200.length; local17++) {
				local11[local17] = Class1_Sub1_Sub1_Sub4.method270(this.anIntArray200[local17]);
			}
			@Pc(42) Class1_Sub1_Sub1_Sub4 local42;
			if (local11.length == 1) {
				local42 = local11[0];
			} else {
				local42 = new Class1_Sub1_Sub1_Sub4((byte) 6, local11.length, local11);
			}
			for (@Pc(54) int local54 = 0; local54 < 6 && this.anIntArray201[local54] != 0; local54++) {
				local42.method284(this.anIntArray201[local54], this.anIntArray202[local54]);
			}
			return local42;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("8091, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YMQGRGSI", name = "a", descriptor = "(Z)Z")
	public boolean method552() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray203[local3] != -1 && !Class1_Sub1_Sub1_Sub4.method271(this.anIntArray203[local3])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("95748, " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YMQGRGSI", name = "b", descriptor = "(Z)Lclient!HEQROJXW;")
	public Class1_Sub1_Sub1_Sub4 method553() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub4[] local4 = new Class1_Sub1_Sub1_Sub4[5];
			@Pc(6) int local6 = 0;
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray203[local18] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub4.method270(this.anIntArray203[local18]);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub4 local47 = new Class1_Sub1_Sub1_Sub4((byte) 6, local6, local4);
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray201[local49] != 0; local49++) {
				local47.method284(this.anIntArray201[local49], this.anIntArray202[local49]);
			}
			return local47;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("51472, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
