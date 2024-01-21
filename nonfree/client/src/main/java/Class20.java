import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HTWOTIWO")
public final class Class20 {

	@OriginalMember(owner = "client!HTWOTIWO", name = "d", descriptor = "I")
	private static int anInt205;

	@OriginalMember(owner = "client!HTWOTIWO", name = "e", descriptor = "[Lclient!HTWOTIWO;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!HTWOTIWO", name = "a", descriptor = "Z")
	private static boolean aBoolean57 = true;

	@OriginalMember(owner = "client!HTWOTIWO", name = "q", descriptor = "Lclient!WIUIWDML;")
	public static Class45 aClass45_3 = new Class45(-99, 30);

	@OriginalMember(owner = "client!HTWOTIWO", name = "b", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!HTWOTIWO", name = "f", descriptor = "I")
	private int anInt206;

	@OriginalMember(owner = "client!HTWOTIWO", name = "g", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!HTWOTIWO", name = "i", descriptor = "Lclient!DWUJPTWU;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!HTWOTIWO", name = "n", descriptor = "I")
	public int anInt211;

	@OriginalMember(owner = "client!HTWOTIWO", name = "o", descriptor = "I")
	public int anInt212;

	@OriginalMember(owner = "client!HTWOTIWO", name = "p", descriptor = "I")
	public int anInt213;

	@OriginalMember(owner = "client!HTWOTIWO", name = "c", descriptor = "I")
	private int anInt204 = 635;

	@OriginalMember(owner = "client!HTWOTIWO", name = "h", descriptor = "I")
	private int anInt208 = -1;

	@OriginalMember(owner = "client!HTWOTIWO", name = "j", descriptor = "[I")
	private int[] anIntArray71 = new int[6];

	@OriginalMember(owner = "client!HTWOTIWO", name = "k", descriptor = "[I")
	private int[] anIntArray72 = new int[6];

	@OriginalMember(owner = "client!HTWOTIWO", name = "l", descriptor = "I")
	public int anInt209 = 128;

	@OriginalMember(owner = "client!HTWOTIWO", name = "m", descriptor = "I")
	public int anInt210 = 128;

	@OriginalMember(owner = "client!HTWOTIWO", name = "a", descriptor = "(ILclient!TXPLZUUI;)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		try {
			if (arg0 != 3) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(20) Class5_Sub1_Sub4 local20 = new Class5_Sub1_Sub4(arg1.method464("spotanim.dat", null), 0);
			anInt205 = local20.method242();
			if (aClass20Array1 == null) {
				aClass20Array1 = new Class20[anInt205];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt205; local30++) {
				if (aClass20Array1[local30] == null) {
					aClass20Array1[local30] = new Class20();
				}
				aClass20Array1[local30].anInt206 = local30;
				aClass20Array1[local30].method131(local20, aBoolean57);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("52004, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTWOTIWO", name = "<init>", descriptor = "()V")
	private Class20() {
	}

	@OriginalMember(owner = "client!HTWOTIWO", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private void method131(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.anInt203 = 161;
			}
			while (true) {
				while (true) {
					@Pc(9) int local9 = arg0.method240();
					if (local9 == 0) {
						return;
					}
					if (local9 == 1) {
						this.anInt207 = arg0.method242();
					} else if (local9 == 2) {
						this.anInt208 = arg0.method242();
						if (Class11.aClass11Array1 != null) {
							this.aClass11_1 = Class11.aClass11Array1[this.anInt208];
						}
					} else if (local9 == 4) {
						this.anInt209 = arg0.method242();
					} else if (local9 == 5) {
						this.anInt210 = arg0.method242();
					} else if (local9 == 6) {
						this.anInt211 = arg0.method242();
					} else if (local9 == 7) {
						this.anInt212 = arg0.method240();
					} else if (local9 == 8) {
						this.anInt213 = arg0.method240();
					} else if (local9 >= 40 && local9 < 50) {
						this.anIntArray71[local9 - 40] = arg0.method242();
					} else if (local9 >= 50 && local9 < 60) {
						this.anIntArray72[local9 - 50] = arg0.method242();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local9);
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("94036, " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HTWOTIWO", name = "a", descriptor = "()Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 method132() {
		@Pc(6) Class5_Sub1_Sub2_Sub5 local6 = (Class5_Sub1_Sub2_Sub5) aClass45_3.method477((long) this.anInt206);
		if (local6 != null) {
			return local6;
		}
		local6 = Class5_Sub1_Sub2_Sub5.method324(this.anInt207);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray71[0] != 0) {
				local6.method338(this.anIntArray71[local20], this.anIntArray72[local20]);
			}
		}
		aClass45_3.method478(this.anInt204, (long) this.anInt206, local6);
		return local6;
	}
}
