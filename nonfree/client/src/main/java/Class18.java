import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JEPDVFCL")
public final class Class18 {

	@OriginalMember(owner = "client!JEPDVFCL", name = "c", descriptor = "I")
	private static int anInt313;

	@OriginalMember(owner = "client!JEPDVFCL", name = "d", descriptor = "[Lclient!JEPDVFCL;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "I")
	private static int anInt311 = 536;

	@OriginalMember(owner = "client!JEPDVFCL", name = "b", descriptor = "I")
	private static int anInt312 = 3;

	@OriginalMember(owner = "client!JEPDVFCL", name = "p", descriptor = "Lclient!HARAZQMH;")
	public static Class15 aClass15_1 = new Class15((byte) 5, 30);

	@OriginalMember(owner = "client!JEPDVFCL", name = "e", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!JEPDVFCL", name = "f", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!JEPDVFCL", name = "h", descriptor = "Lclient!XRDQTWLL;")
	public Class46 aClass46_2;

	@OriginalMember(owner = "client!JEPDVFCL", name = "m", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "client!JEPDVFCL", name = "n", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!JEPDVFCL", name = "o", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!JEPDVFCL", name = "g", descriptor = "I")
	private int anInt316 = -1;

	@OriginalMember(owner = "client!JEPDVFCL", name = "i", descriptor = "[I")
	private int[] anIntArray115 = new int[6];

	@OriginalMember(owner = "client!JEPDVFCL", name = "j", descriptor = "[I")
	private int[] anIntArray116 = new int[6];

	@OriginalMember(owner = "client!JEPDVFCL", name = "k", descriptor = "I")
	public int anInt317 = 128;

	@OriginalMember(owner = "client!JEPDVFCL", name = "l", descriptor = "I")
	public int anInt318 = 128;

	@OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "(ILclient!UUIGNTAD;)V")
	public static void method232(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method512("spotanim.dat", null), anInt311);
			anInt313 = local8.method57();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt313];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt313; local18++) {
				if (aClass18Array1[local18] == null) {
					aClass18Array1[local18] = new Class18();
				}
				aClass18Array1[local18].anInt314 = local18;
				aClass18Array1[local18].method233(local8);
			}
			if (anInt312 > 3 || anInt312 < 3) {
				;
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("17877, " + 3 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JEPDVFCL", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private void method233(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method55();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt315 = arg0.method57();
				} else if (local15 == 2) {
					this.anInt316 = arg0.method57();
					if (Class46.aClass46Array1 != null) {
						this.aClass46_2 = Class46.aClass46Array1[this.anInt316];
					}
				} else if (local15 == 4) {
					this.anInt317 = arg0.method57();
				} else if (local15 == 5) {
					this.anInt318 = arg0.method57();
				} else if (local15 == 6) {
					this.anInt319 = arg0.method57();
				} else if (local15 == 7) {
					this.anInt320 = arg0.method55();
				} else if (local15 == 8) {
					this.anInt321 = arg0.method55();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray115[local15 - 40] = arg0.method57();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray116[local15 - 50] = arg0.method57();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("22050, " + arg0 + ", " + -593 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JEPDVFCL", name = "a", descriptor = "()Lclient!GCSAWSJV;")
	public Class1_Sub1_Sub1_Sub2 method234() {
		@Pc(6) Class1_Sub1_Sub1_Sub2 local6 = (Class1_Sub1_Sub1_Sub2) aClass15_1.method182((long) this.anInt314);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub2.method143(this.anInt315);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray115[0] != 0) {
				local6.method157(this.anIntArray115[local20], this.anIntArray116[local20]);
			}
		}
		aClass15_1.method183((long) this.anInt314, local6);
		return local6;
	}
}
