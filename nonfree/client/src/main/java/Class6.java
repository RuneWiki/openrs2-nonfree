import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CWNXCHDT")
public final class Class6 {

	@OriginalMember(owner = "client!CWNXCHDT", name = "b", descriptor = "Z")
	private static boolean aBoolean27;

	@OriginalMember(owner = "client!CWNXCHDT", name = "c", descriptor = "I")
	public static int anInt91;

	@OriginalMember(owner = "client!CWNXCHDT", name = "d", descriptor = "[Lclient!CWNXCHDT;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!CWNXCHDT", name = "f", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "I")
	private int anInt90 = 709;

	@OriginalMember(owner = "client!CWNXCHDT", name = "e", descriptor = "I")
	public int anInt92 = -1;

	@OriginalMember(owner = "client!CWNXCHDT", name = "g", descriptor = "[I")
	private int[] anIntArray14 = new int[6];

	@OriginalMember(owner = "client!CWNXCHDT", name = "h", descriptor = "[I")
	private int[] anIntArray15 = new int[6];

	@OriginalMember(owner = "client!CWNXCHDT", name = "i", descriptor = "[I")
	private int[] anIntArray16 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!CWNXCHDT", name = "j", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "(Lclient!FUZJMGZB;I)V")
	public static void method77(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("idk.dat", null));
			anInt91 = local8.method269();
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt91];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt91; local27++) {
				if (aClass6Array1[local27] == null) {
					aClass6Array1[local27] = new Class6();
				}
				aClass6Array1[local27].method78(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("75751, " + arg0 + ", " + 5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNXCHDT", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	private void method78(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method267();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt92 = arg0.method267();
				} else if (local11 == 2) {
					@Pc(29) int local29 = arg0.method267();
					this.anIntArray13 = new int[local29];
					for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
						this.anIntArray13[local35] = arg0.method269();
					}
				} else if (local11 == 3) {
					this.aBoolean28 = true;
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray14[local11 - 40] = arg0.method269();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray15[local11 - 50] = arg0.method269();
				} else if (local11 >= 60 && local11 < 70) {
					this.anIntArray16[local11 - 60] = arg0.method269();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("82332, " + arg0 + ", " + 59 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNXCHDT", name = "a", descriptor = "(I)Z")
	public boolean method79() {
		try {
			if (this.anIntArray13 == null) {
				return true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray13.length; local14++) {
				if (!Class2_Sub1_Sub1_Sub2.method92(this.anIntArray13[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("12564, " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNXCHDT", name = "b", descriptor = "(I)Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 method80() {
		try {
			if (this.anIntArray13 == null) {
				return null;
			}
			@Pc(18) Class2_Sub1_Sub1_Sub2[] local18 = new Class2_Sub1_Sub1_Sub2[this.anIntArray13.length];
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray13.length; local20++) {
				local18[local20] = Class2_Sub1_Sub1_Sub2.method91(this.anIntArray13[local20]);
			}
			@Pc(44) Class2_Sub1_Sub1_Sub2 local44;
			if (local18.length == 1) {
				local44 = local18[0];
			} else {
				local44 = new Class2_Sub1_Sub1_Sub2(local18, 3, local18.length);
			}
			for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray14[local56] != 0; local56++) {
				local44.method105(this.anIntArray14[local56], this.anIntArray15[local56]);
			}
			return local44;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("20176, " + 18390 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNXCHDT", name = "c", descriptor = "(I)Z")
	public boolean method81() {
		try {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray16[local15] != -1 && !Class2_Sub1_Sub1_Sub2.method92(this.anIntArray16[local15])) {
					local13 = false;
				}
			}
			return local13;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("13308, " + 2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNXCHDT", name = "d", descriptor = "(I)Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Class2_Sub1_Sub1_Sub2[] local4 = new Class2_Sub1_Sub1_Sub2[5];
			@Pc(8) boolean local8 = false;
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
				if (this.anIntArray16[local12] != -1) {
					local4[local10++] = Class2_Sub1_Sub1_Sub2.method91(this.anIntArray16[local12]);
				}
			}
			@Pc(40) Class2_Sub1_Sub1_Sub2 local40 = new Class2_Sub1_Sub1_Sub2(local4, 3, local10);
			for (@Pc(42) int local42 = 0; local42 < 6 && this.anIntArray14[local42] != 0; local42++) {
				local40.method105(this.anIntArray14[local42], this.anIntArray15[local42]);
			}
			return local40;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("88377, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
