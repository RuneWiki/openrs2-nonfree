import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CFPLMOQH")
public final class Class6 {

	@OriginalMember(owner = "client!CFPLMOQH", name = "e", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!CFPLMOQH", name = "f", descriptor = "[Lclient!CFPLMOQH;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "I")
	private static int anInt63 = 536;

	@OriginalMember(owner = "client!CFPLMOQH", name = "d", descriptor = "I")
	private static int anInt65 = 3;

	@OriginalMember(owner = "client!CFPLMOQH", name = "h", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!CFPLMOQH", name = "b", descriptor = "I")
	private int anInt64 = 980;

	@OriginalMember(owner = "client!CFPLMOQH", name = "c", descriptor = "Z")
	private boolean aBoolean20 = true;

	@OriginalMember(owner = "client!CFPLMOQH", name = "g", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!CFPLMOQH", name = "i", descriptor = "[I")
	private int[] anIntArray11 = new int[6];

	@OriginalMember(owner = "client!CFPLMOQH", name = "j", descriptor = "[I")
	private int[] anIntArray12 = new int[6];

	@OriginalMember(owner = "client!CFPLMOQH", name = "k", descriptor = "[I")
	private int[] anIntArray13 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!CFPLMOQH", name = "l", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(ILclient!UUIGNTAD;)V")
	public static void method35(@OriginalArg(1) Class38 arg0) {
		try {
			if (anInt65 <= 3 && anInt65 >= 3) {
				@Pc(15) Class1_Sub1_Sub3 local15 = new Class1_Sub1_Sub3(arg0.method512("idk.dat", null), anInt63);
				anInt66 = local15.method57();
				if (aClass6Array1 == null) {
					aClass6Array1 = new Class6[anInt66];
				}
				for (@Pc(25) int local25 = 0; local25 < anInt66; local25++) {
					if (aClass6Array1[local25] == null) {
						aClass6Array1[local25] = new Class6();
					}
					aClass6Array1[local25].method36(local15);
				}
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("29801, " + 3 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFPLMOQH", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private void method36(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method55();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt67 = arg0.method55();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method55();
					this.anIntArray10 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray10[local37] = arg0.method57();
					}
				} else if (local13 == 3) {
					this.aBoolean21 = true;
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray11[local13 - 40] = arg0.method57();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray12[local13 - 50] = arg0.method57();
				} else if (local13 >= 60 && local13 < 70) {
					this.anIntArray13[local13 - 60] = arg0.method57();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("22027, " + arg0 + ", " + -593 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(Z)Z")
	public boolean method37() {
		try {
			if (this.anIntArray10 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray10.length; local14++) {
				if (!Class1_Sub1_Sub1_Sub2.method144(this.anIntArray10[local14])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("46253, " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFPLMOQH", name = "b", descriptor = "(Z)Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 method38() {
		try {
			if (this.anIntArray10 == null) {
				return null;
			}
			@Pc(17) Class1_Sub1_Sub1_Sub2[] local17 = new Class1_Sub1_Sub1_Sub2[this.anIntArray10.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray10.length; local19++) {
				local17[local19] = Class1_Sub1_Sub1_Sub2.method143(this.anIntArray10[local19]);
			}
			@Pc(43) Class1_Sub1_Sub1_Sub2 local43;
			if (local17.length == 1) {
				local43 = local17[0];
			} else {
				local43 = new Class1_Sub1_Sub1_Sub2(local17, local17.length, this.aBoolean20);
			}
			for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray11[local56] != 0; local56++) {
				local43.method157(this.anIntArray11[local56], this.anIntArray12[local56]);
			}
			return local43;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("67685, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(B)Z")
	public boolean method39(@OriginalArg(0) byte arg0) {
		try {
			@Pc(1) boolean local1 = true;
			if (arg0 != -60) {
				this.aBoolean20 = !this.aBoolean20;
			}
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray13[local14] != -1 && !Class1_Sub1_Sub1_Sub2.method144(this.anIntArray13[local14])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("92297, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFPLMOQH", name = "a", descriptor = "(I)Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 method40() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub2[] local4 = new Class1_Sub1_Sub1_Sub2[5];
			@Pc(6) int local6 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray13[local14] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub2.method143(this.anIntArray13[local14]);
				}
			}
			@Pc(43) Class1_Sub1_Sub1_Sub2 local43 = new Class1_Sub1_Sub1_Sub2(local4, local6, this.aBoolean20);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray11[local45] != 0; local45++) {
				local43.method157(this.anIntArray11[local45], this.anIntArray12[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("30047, " + 2 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
