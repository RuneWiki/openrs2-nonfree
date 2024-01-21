import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MKJLFPRH")
public final class Class25 {

	@OriginalMember(owner = "client!MKJLFPRH", name = "a", descriptor = "I")
	private static int anInt471;

	@OriginalMember(owner = "client!MKJLFPRH", name = "b", descriptor = "[Lclient!MKJLFPRH;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!MKJLFPRH", name = "n", descriptor = "Lclient!JETHVCIV;")
	public static Class15 aClass15_7 = new Class15(false, 30);

	@OriginalMember(owner = "client!MKJLFPRH", name = "c", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!MKJLFPRH", name = "d", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!MKJLFPRH", name = "f", descriptor = "Lclient!OXBPHQKK;")
	public Class29 aClass29_1;

	@OriginalMember(owner = "client!MKJLFPRH", name = "k", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!MKJLFPRH", name = "l", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!MKJLFPRH", name = "m", descriptor = "I")
	public int anInt479;

	@OriginalMember(owner = "client!MKJLFPRH", name = "e", descriptor = "I")
	private int anInt474 = -1;

	@OriginalMember(owner = "client!MKJLFPRH", name = "g", descriptor = "[I")
	private int[] anIntArray126 = new int[6];

	@OriginalMember(owner = "client!MKJLFPRH", name = "h", descriptor = "[I")
	private int[] anIntArray127 = new int[6];

	@OriginalMember(owner = "client!MKJLFPRH", name = "i", descriptor = "I")
	public int anInt475 = 128;

	@OriginalMember(owner = "client!MKJLFPRH", name = "j", descriptor = "I")
	public int anInt476 = 128;

	@OriginalMember(owner = "client!MKJLFPRH", name = "a", descriptor = "(Lclient!MNPBQFWE;B)V")
	public static void method332(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(11) Class1_Sub1_Sub2 local11 = new Class1_Sub1_Sub2(false, arg0.method340("spotanim.dat", null));
			anInt471 = local11.method24();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt471];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt471; local21++) {
				if (aClass25Array1[local21] == null) {
					aClass25Array1[local21] = new Class25();
				}
				aClass25Array1[local21].anInt472 = local21;
				aClass25Array1[local21].method333(local11);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("72218, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKJLFPRH", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!MKJLFPRH", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	private void method333(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method22();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt473 = arg0.method24();
				} else if (local10 == 2) {
					this.anInt474 = arg0.method24();
					if (Class29.aClass29Array1 != null) {
						this.aClass29_1 = Class29.aClass29Array1[this.anInt474];
					}
				} else if (local10 == 4) {
					this.anInt475 = arg0.method24();
				} else if (local10 == 5) {
					this.anInt476 = arg0.method24();
				} else if (local10 == 6) {
					this.anInt477 = arg0.method24();
				} else if (local10 == 7) {
					this.anInt478 = arg0.method22();
				} else if (local10 == 8) {
					this.anInt479 = arg0.method22();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray126[local10 - 40] = arg0.method24();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray127[local10 - 50] = arg0.method24();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("73032, " + 674 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MKJLFPRH", name = "a", descriptor = "()Lclient!JLNSJQDR;")
	public Class1_Sub1_Sub1_Sub4 method334() {
		@Pc(6) Class1_Sub1_Sub1_Sub4 local6 = (Class1_Sub1_Sub1_Sub4) aClass15_7.method222((long) this.anInt472);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub4.method239(this.anInt473);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray126[0] != 0) {
				local6.method253(this.anIntArray126[local21], this.anIntArray127[local21]);
			}
		}
		aClass15_7.method223(local6, (long) this.anInt472);
		return local6;
	}
}
