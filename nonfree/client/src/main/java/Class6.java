import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CSHXCUHU")
public final class Class6 {

	@OriginalMember(owner = "client!CSHXCUHU", name = "c", descriptor = "I")
	public static int anInt106;

	@OriginalMember(owner = "client!CSHXCUHU", name = "d", descriptor = "[Lclient!CSHXCUHU;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!CSHXCUHU", name = "b", descriptor = "Z")
	private static boolean aBoolean23 = true;

	@OriginalMember(owner = "client!CSHXCUHU", name = "a", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!CSHXCUHU", name = "f", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!CSHXCUHU", name = "e", descriptor = "I")
	public int anInt107 = -1;

	@OriginalMember(owner = "client!CSHXCUHU", name = "g", descriptor = "[I")
	private int[] anIntArray19 = new int[6];

	@OriginalMember(owner = "client!CSHXCUHU", name = "h", descriptor = "[I")
	private int[] anIntArray20 = new int[6];

	@OriginalMember(owner = "client!CSHXCUHU", name = "i", descriptor = "[I")
	private int[] anIntArray21 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!CSHXCUHU", name = "j", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!CSHXCUHU", name = "a", descriptor = "(Lclient!FNOQZAYQ;I)V")
	public static void method64(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method165("idk.dat", null), aBoolean23);
			anInt106 = local8.method96();
			@Pc(15) int local15 = 66 / arg1;
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt106];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt106; local22++) {
				if (aClass6Array1[local22] == null) {
					aClass6Array1[local22] = new Class6();
				}
				aClass6Array1[local22].method65(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("64767, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXCUHU", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!CSHXCUHU", name = "a", descriptor = "(Lclient!DNRIFKTO;I)V")
	private void method65(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method94();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt107 = arg0.method94();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method94();
					this.anIntArray18 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray18[local34] = arg0.method96();
					}
				} else if (local10 == 3) {
					this.aBoolean24 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray19[local10 - 40] = arg0.method96();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray20[local10 - 50] = arg0.method96();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray21[local10 - 60] = arg0.method96();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("63327, " + arg0 + ", " + -25 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXCUHU", name = "a", descriptor = "(I)Z")
	public boolean method66() {
		try {
			if (this.anIntArray18 == null) {
				return true;
			}
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray18.length; local13++) {
				if (!Class2_Sub1_Sub2_Sub5.method385(this.anIntArray18[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("99957, " + -980 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXCUHU", name = "b", descriptor = "(I)Lclient!SNMMQNPZ;")
	public Class2_Sub1_Sub2_Sub5 method67(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray18 == null) {
				return null;
			}
			@Pc(11) Class2_Sub1_Sub2_Sub5[] local11 = new Class2_Sub1_Sub2_Sub5[this.anIntArray18.length];
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray18.length; local17++) {
				local11[local17] = Class2_Sub1_Sub2_Sub5.method384(this.anIntArray18[local17]);
			}
			@Pc(41) Class2_Sub1_Sub2_Sub5 local41;
			if (local11.length == 1) {
				local41 = local11[0];
			} else {
				local41 = new Class2_Sub1_Sub2_Sub5(local11.length, false, local11);
			}
			for (@Pc(53) int local53 = 0; local53 < 6 && this.anIntArray19[local53] != 0; local53++) {
				local41.method398(this.anIntArray19[local53], this.anIntArray20[local53]);
			}
			return local41;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("71320, " + arg0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXCUHU", name = "c", descriptor = "(I)Z")
	public boolean method68(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
				if (this.anIntArray21[local7] != -1 && !Class2_Sub1_Sub2_Sub5.method385(this.anIntArray21[local7])) {
					local5 = false;
				}
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("38995, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSHXCUHU", name = "a", descriptor = "(Z)Lclient!SNMMQNPZ;")
	public Class2_Sub1_Sub2_Sub5 method69() {
		try {
			@Pc(4) Class2_Sub1_Sub2_Sub5[] local4 = new Class2_Sub1_Sub2_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray21[local14] != -1) {
					local4[local6++] = Class2_Sub1_Sub2_Sub5.method384(this.anIntArray21[local14]);
				}
			}
			@Pc(42) Class2_Sub1_Sub2_Sub5 local42 = new Class2_Sub1_Sub2_Sub5(local6, false, local4);
			for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray19[local44] != 0; local44++) {
				local42.method398(this.anIntArray19[local44], this.anIntArray20[local44]);
			}
			return local42;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("13625, " + false + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
