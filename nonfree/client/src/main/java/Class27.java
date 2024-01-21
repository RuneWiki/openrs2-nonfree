import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MHWTJCHJ")
public final class Class27 {

	@OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "Z")
	private static boolean aBoolean120;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "c", descriptor = "I")
	private static int anInt396;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "d", descriptor = "[Lclient!MHWTJCHJ;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "p", descriptor = "Lclient!BMKJVFXV;")
	public static Class5 aClass5_2 = new Class5(688, 30);

	@OriginalMember(owner = "client!MHWTJCHJ", name = "e", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "f", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "h", descriptor = "Lclient!JZQVOFSF;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "m", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "n", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "o", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "b", descriptor = "B")
	private byte aByte33 = -108;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "g", descriptor = "I")
	private int anInt399 = -1;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "i", descriptor = "[I")
	private int[] anIntArray77 = new int[6];

	@OriginalMember(owner = "client!MHWTJCHJ", name = "j", descriptor = "[I")
	private int[] anIntArray78 = new int[6];

	@OriginalMember(owner = "client!MHWTJCHJ", name = "k", descriptor = "I")
	public int anInt400 = 128;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "l", descriptor = "I")
	public int anInt401 = 128;

	@OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "(Lclient!SMIVAFST;I)V")
	public static void method314(@OriginalArg(0) Class35 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method485("spotanim.dat", null), (byte) 3);
			anInt396 = local8.method96();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt396];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt396; local27++) {
				if (aClass27Array1[local27] == null) {
					aClass27Array1[local27] = new Class27();
				}
				aClass27Array1[local27].anInt397 = local27;
				aClass27Array1[local27].method315(local8);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("43884, " + arg0 + ", " + -29636 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MHWTJCHJ", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	private void method315(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(17) int local17 = arg0.method94();
				if (local17 == 0) {
					return;
				}
				if (local17 == 1) {
					this.anInt398 = arg0.method96();
				} else if (local17 == 2) {
					this.anInt399 = arg0.method96();
					if (Class22.aClass22Array1 != null) {
						this.aClass22_1 = Class22.aClass22Array1[this.anInt399];
					}
				} else if (local17 == 4) {
					this.anInt400 = arg0.method96();
				} else if (local17 == 5) {
					this.anInt401 = arg0.method96();
				} else if (local17 == 6) {
					this.anInt402 = arg0.method96();
				} else if (local17 == 7) {
					this.anInt403 = arg0.method94();
				} else if (local17 == 8) {
					this.anInt404 = arg0.method94();
				} else if (local17 >= 40 && local17 < 50) {
					this.anIntArray77[local17 - 40] = arg0.method96();
				} else if (local17 >= 50 && local17 < 60) {
					this.anIntArray78[local17 - 50] = arg0.method96();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local17);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("93308, " + 7 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MHWTJCHJ", name = "a", descriptor = "()Lclient!RMLAXPMV;")
	public Class2_Sub1_Sub3_Sub4 method316() {
		@Pc(6) Class2_Sub1_Sub3_Sub4 local6 = (Class2_Sub1_Sub3_Sub4) aClass5_2.method77((long) this.anInt397);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub3_Sub4.method431(this.anInt398);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray77[0] != 0) {
				local6.method445(this.anIntArray77[local20], this.anIntArray78[local20]);
			}
		}
		aClass5_2.method78((long) this.anInt397, local6, this.aByte33);
		return local6;
	}
}
