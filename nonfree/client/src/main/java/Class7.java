import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BLFCIBLQ")
public final class Class7 {

	@OriginalMember(owner = "client!BLFCIBLQ", name = "e", descriptor = "I")
	public static int anInt38;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "f", descriptor = "[Lclient!BLFCIBLQ;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "a", descriptor = "Z")
	private static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "c", descriptor = "Z")
	private static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "d", descriptor = "Z")
	private static boolean aBoolean29 = true;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "h", descriptor = "[I")
	private int[] anIntArray8;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "b", descriptor = "I")
	private int anInt37 = 4006;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "g", descriptor = "I")
	public int anInt39 = -1;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "i", descriptor = "[I")
	private int[] anIntArray9 = new int[6];

	@OriginalMember(owner = "client!BLFCIBLQ", name = "j", descriptor = "[I")
	private int[] anIntArray10 = new int[6];

	@OriginalMember(owner = "client!BLFCIBLQ", name = "k", descriptor = "[I")
	private int[] anIntArray11 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!BLFCIBLQ", name = "l", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!BLFCIBLQ", name = "a", descriptor = "(ZLclient!MJLXHQTQ;)V")
	public static void method27(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(16) Class5_Sub1_Sub4 local16 = new Class5_Sub1_Sub4(arg0.method227("idk.dat", null), -82);
			anInt38 = local16.method439();
			if (aClass7Array1 == null) {
				aClass7Array1 = new Class7[anInt38];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt38; local26++) {
				if (aClass7Array1[local26] == null) {
					aClass7Array1[local26] = new Class7();
				}
				aClass7Array1[local26].method28(aBoolean27, local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("39106, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BLFCIBLQ", name = "<init>", descriptor = "()V")
	private Class7() {
	}

	@OriginalMember(owner = "client!BLFCIBLQ", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	private void method28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			@Pc(5) int local5;
			if (!arg0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				while (true) {
					local5 = arg1.method437();
					if (local5 == 0) {
						return;
					}
					if (local5 == 1) {
						this.anInt39 = arg1.method437();
					} else if (local5 == 2) {
						@Pc(31) int local31 = arg1.method437();
						this.anIntArray8 = new int[local31];
						for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
							this.anIntArray8[local37] = arg1.method439();
						}
					} else if (local5 == 3) {
						this.aBoolean30 = true;
					} else if (local5 >= 40 && local5 < 50) {
						this.anIntArray9[local5 - 40] = arg1.method439();
					} else if (local5 >= 50 && local5 < 60) {
						this.anIntArray10[local5 - 50] = arg1.method439();
					} else if (local5 >= 60 && local5 < 70) {
						this.anIntArray11[local5 - 60] = arg1.method439();
					} else {
						System.out.println("Error unrecognised config code: " + local5);
					}
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("73051, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BLFCIBLQ", name = "a", descriptor = "(I)Z")
	public boolean method29(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray8 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			if (arg0 != 0) {
				aBoolean28 = !aBoolean28;
			}
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray8.length; local16++) {
				if (!Class5_Sub1_Sub1_Sub6.method378(this.anIntArray8[local16])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("8034, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BLFCIBLQ", name = "a", descriptor = "(B)Lclient!VYUQHOMO;")
	public Class5_Sub1_Sub1_Sub6 method30(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray8 == null) {
				return null;
			}
			@Pc(22) Class5_Sub1_Sub1_Sub6[] local22 = new Class5_Sub1_Sub1_Sub6[this.anIntArray8.length];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray8.length; local24++) {
				local22[local24] = Class5_Sub1_Sub1_Sub6.method377(this.anIntArray8[local24]);
			}
			@Pc(48) Class5_Sub1_Sub1_Sub6 local48;
			if (local22.length == 1) {
				local48 = local22[0];
			} else {
				local48 = new Class5_Sub1_Sub1_Sub6(local22, this.anInt37, local22.length);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray9[local61] != 0; local61++) {
				local48.method391(this.anIntArray9[local61], this.anIntArray10[local61]);
			}
			return local48;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("87761, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BLFCIBLQ", name = "b", descriptor = "(I)Z")
	public boolean method31() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
				if (this.anIntArray11[local11] != -1 && !Class5_Sub1_Sub1_Sub6.method378(this.anIntArray11[local11])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("45277, " + 259 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BLFCIBLQ", name = "b", descriptor = "(B)Lclient!VYUQHOMO;")
	public Class5_Sub1_Sub1_Sub6 method32() {
		try {
			@Pc(4) Class5_Sub1_Sub1_Sub6[] local4 = new Class5_Sub1_Sub1_Sub6[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray11[local8] != -1) {
					local4[local6++] = Class5_Sub1_Sub1_Sub6.method377(this.anIntArray11[local8]);
				}
			}
			@Pc(37) Class5_Sub1_Sub1_Sub6 local37 = new Class5_Sub1_Sub1_Sub6(local4, this.anInt37, local6);
			for (@Pc(39) int local39 = 0; local39 < 6 && this.anIntArray9[local39] != 0; local39++) {
				local37.method391(this.anIntArray9[local39], this.anIntArray10[local39]);
			}
			return local37;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("30978, " + 7 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
