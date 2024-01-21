import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PMDEXOWJ")
public final class Class29 {

	@OriginalMember(owner = "client!PMDEXOWJ", name = "c", descriptor = "I")
	private static int anInt541;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "d", descriptor = "[Lclient!PMDEXOWJ;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "a", descriptor = "I")
	private static int anInt539 = 41598;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "p", descriptor = "Lclient!EOJHVRZF;")
	public static Class10 aClass10_8 = new Class10(10369, 30);

	@OriginalMember(owner = "client!PMDEXOWJ", name = "e", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "f", descriptor = "I")
	private int anInt543;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "h", descriptor = "Lclient!RIUJHZLL;")
	public Class33 aClass33_2;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "m", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "n", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "o", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "b", descriptor = "I")
	private int anInt540 = -192;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "g", descriptor = "I")
	private int anInt544 = -1;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "i", descriptor = "[I")
	private int[] anIntArray125 = new int[6];

	@OriginalMember(owner = "client!PMDEXOWJ", name = "j", descriptor = "[I")
	private int[] anIntArray126 = new int[6];

	@OriginalMember(owner = "client!PMDEXOWJ", name = "k", descriptor = "I")
	public int anInt545 = 128;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "l", descriptor = "I")
	public int anInt546 = 128;

	@OriginalMember(owner = "client!PMDEXOWJ", name = "a", descriptor = "(ILclient!RVLWVPJQ;)V")
	public static void method359(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(12) Class6_Sub2_Sub3 local12 = new Class6_Sub2_Sub3(741, arg0.method381("spotanim.dat", null));
			anInt541 = local12.method404();
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt541];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt541; local22++) {
				if (aClass29Array1[local22] == null) {
					aClass29Array1[local22] = new Class29();
				}
				aClass29Array1[local22].anInt542 = local22;
				aClass29Array1[local22].method360(local12);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("71013, " + 0 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMDEXOWJ", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!PMDEXOWJ", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	private void method360(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method402();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt543 = arg0.method404();
				} else if (local10 == 2) {
					this.anInt544 = arg0.method404();
					if (Class33.aClass33Array1 != null) {
						this.aClass33_2 = Class33.aClass33Array1[this.anInt544];
					}
				} else if (local10 == 4) {
					this.anInt545 = arg0.method404();
				} else if (local10 == 5) {
					this.anInt546 = arg0.method404();
				} else if (local10 == 6) {
					this.anInt547 = arg0.method404();
				} else if (local10 == 7) {
					this.anInt548 = arg0.method402();
				} else if (local10 == 8) {
					this.anInt549 = arg0.method402();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray125[local10 - 40] = arg0.method404();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray126[local10 - 50] = arg0.method404();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("86697, " + -7321 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMDEXOWJ", name = "a", descriptor = "()Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 method361() {
		@Pc(6) Class6_Sub2_Sub1_Sub6 local6 = (Class6_Sub2_Sub1_Sub6) aClass10_8.method75((long) this.anInt542);
		if (local6 != null) {
			return local6;
		}
		local6 = Class6_Sub2_Sub1_Sub6.method487(892, this.anInt543);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray125[0] != 0) {
				local6.method501(this.anIntArray125[local21], this.anIntArray126[local21]);
			}
		}
		aClass10_8.method76((long) this.anInt542, local6);
		return local6;
	}
}
