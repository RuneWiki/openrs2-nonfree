import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XWNROHZR")
public final class Class44 {

	@OriginalMember(owner = "client!XWNROHZR", name = "b", descriptor = "I")
	private static int anInt760;

	@OriginalMember(owner = "client!XWNROHZR", name = "c", descriptor = "[Lclient!XWNROHZR;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!XWNROHZR", name = "o", descriptor = "Lclient!UECXVCCS;")
	public static Class36 aClass36_9 = new Class36(30, (byte) -2);

	@OriginalMember(owner = "client!XWNROHZR", name = "d", descriptor = "I")
	private int anInt761;

	@OriginalMember(owner = "client!XWNROHZR", name = "e", descriptor = "I")
	private int anInt762;

	@OriginalMember(owner = "client!XWNROHZR", name = "g", descriptor = "Lclient!UVDKTGZK;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!XWNROHZR", name = "l", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!XWNROHZR", name = "m", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!XWNROHZR", name = "n", descriptor = "I")
	public int anInt768;

	@OriginalMember(owner = "client!XWNROHZR", name = "a", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!XWNROHZR", name = "f", descriptor = "I")
	private int anInt763 = -1;

	@OriginalMember(owner = "client!XWNROHZR", name = "h", descriptor = "[I")
	private int[] anIntArray204 = new int[6];

	@OriginalMember(owner = "client!XWNROHZR", name = "i", descriptor = "[I")
	private int[] anIntArray205 = new int[6];

	@OriginalMember(owner = "client!XWNROHZR", name = "j", descriptor = "I")
	public int anInt764 = 128;

	@OriginalMember(owner = "client!XWNROHZR", name = "k", descriptor = "I")
	public int anInt765 = 128;

	@OriginalMember(owner = "client!XWNROHZR", name = "a", descriptor = "(Lclient!GWOEELWB;B)V")
	public static void method550(@OriginalArg(0) Class13 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(true, arg0.method140("spotanim.dat", null));
			@Pc(15) boolean local15 = false;
			anInt760 = local10.method202();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt760];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt760; local28++) {
				if (aClass44Array1[local28] == null) {
					aClass44Array1[local28] = new Class44();
				}
				aClass44Array1[local28].anInt761 = local28;
				aClass44Array1[local28].method551(local10);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("90083, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWNROHZR", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!XWNROHZR", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	private void method551(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method200();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt762 = arg0.method202();
				} else if (local15 == 2) {
					this.anInt763 = arg0.method202();
					if (Class38.aClass38Array1 != null) {
						this.aClass38_2 = Class38.aClass38Array1[this.anInt763];
					}
				} else if (local15 == 4) {
					this.anInt764 = arg0.method202();
				} else if (local15 == 5) {
					this.anInt765 = arg0.method202();
				} else if (local15 == 6) {
					this.anInt766 = arg0.method202();
				} else if (local15 == 7) {
					this.anInt767 = arg0.method200();
				} else if (local15 == 8) {
					this.anInt768 = arg0.method200();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray204[local15 - 40] = arg0.method202();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray205[local15 - 50] = arg0.method202();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("75699, " + arg0 + ", " + 2 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XWNROHZR", name = "a", descriptor = "()Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 method552() {
		@Pc(6) Class3_Sub1_Sub1_Sub1 local6 = (Class3_Sub1_Sub1_Sub1) aClass36_9.method513((long) this.anInt761);
		if (local6 != null) {
			return local6;
		}
		local6 = Class3_Sub1_Sub1_Sub1.method22(this.anInt762);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray204[0] != 0) {
				local6.method36(this.anIntArray204[local20], this.anIntArray205[local20]);
			}
		}
		aClass36_9.method514(local6, (long) this.anInt761);
		return local6;
	}
}
