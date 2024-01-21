import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SDNQJNMP")
public final class Class33 {

	@OriginalMember(owner = "client!SDNQJNMP", name = "b", descriptor = "I")
	private static int anInt473;

	@OriginalMember(owner = "client!SDNQJNMP", name = "c", descriptor = "[Lclient!SDNQJNMP;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "I")
	private static int anInt472 = 182;

	@OriginalMember(owner = "client!SDNQJNMP", name = "o", descriptor = "Lclient!BVBRKPZH;")
	public static Class4 aClass4_5 = new Class4(-21657, 30);

	@OriginalMember(owner = "client!SDNQJNMP", name = "d", descriptor = "I")
	private int anInt474;

	@OriginalMember(owner = "client!SDNQJNMP", name = "e", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!SDNQJNMP", name = "g", descriptor = "Lclient!VYXELYSX;")
	public Class39 aClass39_2;

	@OriginalMember(owner = "client!SDNQJNMP", name = "l", descriptor = "I")
	public int anInt479;

	@OriginalMember(owner = "client!SDNQJNMP", name = "m", descriptor = "I")
	public int anInt480;

	@OriginalMember(owner = "client!SDNQJNMP", name = "n", descriptor = "I")
	public int anInt481;

	@OriginalMember(owner = "client!SDNQJNMP", name = "f", descriptor = "I")
	private int anInt476 = -1;

	@OriginalMember(owner = "client!SDNQJNMP", name = "h", descriptor = "[I")
	private int[] anIntArray144 = new int[6];

	@OriginalMember(owner = "client!SDNQJNMP", name = "i", descriptor = "[I")
	private int[] anIntArray145 = new int[6];

	@OriginalMember(owner = "client!SDNQJNMP", name = "j", descriptor = "I")
	public int anInt477 = 128;

	@OriginalMember(owner = "client!SDNQJNMP", name = "k", descriptor = "I")
	public int anInt478 = 128;

	@OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "(ILclient!MAARFNGV;)V")
	public static void method316(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3(arg0.method218("spotanim.dat", null), true);
			anInt473 = local8.method99();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt473];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt473; local22++) {
				if (aClass33Array1[local22] == null) {
					aClass33Array1[local22] = new Class33();
				}
				aClass33Array1[local22].anInt474 = local22;
				aClass33Array1[local22].method317(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("89828, " + 0 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDNQJNMP", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "(ILclient!EMWAMCXW;)V")
	private void method317(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method97();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt475 = arg0.method99();
				} else if (local9 == 2) {
					this.anInt476 = arg0.method99();
					if (Class39.aClass39Array1 != null) {
						this.aClass39_2 = Class39.aClass39Array1[this.anInt476];
					}
				} else if (local9 == 4) {
					this.anInt477 = arg0.method99();
				} else if (local9 == 5) {
					this.anInt478 = arg0.method99();
				} else if (local9 == 6) {
					this.anInt479 = arg0.method99();
				} else if (local9 == 7) {
					this.anInt480 = arg0.method97();
				} else if (local9 == 8) {
					this.anInt481 = arg0.method97();
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray144[local9 - 40] = arg0.method99();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray145[local9 - 50] = arg0.method99();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local9);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("28969, " + 1016 + ", " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SDNQJNMP", name = "a", descriptor = "()Lclient!IEHKDFMR;")
	public Class2_Sub1_Sub2_Sub2 method318() {
		@Pc(6) Class2_Sub1_Sub2_Sub2 local6 = (Class2_Sub1_Sub2_Sub2) aClass4_5.method37((long) this.anInt474);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub2_Sub2.method151(this.anInt475);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray144[0] != 0) {
				local6.method165(this.anIntArray144[local20], this.anIntArray145[local20]);
			}
		}
		aClass4_5.method38((long) this.anInt474, local6);
		return local6;
	}
}
