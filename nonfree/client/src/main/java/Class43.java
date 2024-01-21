import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XBHNZKGU")
public final class Class43 {

	@OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "I")
	private static int anInt754;

	@OriginalMember(owner = "client!XBHNZKGU", name = "b", descriptor = "[Lclient!XBHNZKGU;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!XBHNZKGU", name = "n", descriptor = "Lclient!NQQFCAPC;")
	public static Class25 aClass25_9 = new Class25(30, 285);

	@OriginalMember(owner = "client!XBHNZKGU", name = "c", descriptor = "I")
	private int anInt755;

	@OriginalMember(owner = "client!XBHNZKGU", name = "d", descriptor = "I")
	private int anInt756;

	@OriginalMember(owner = "client!XBHNZKGU", name = "f", descriptor = "Lclient!XETSOHUA;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!XBHNZKGU", name = "k", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!XBHNZKGU", name = "l", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!XBHNZKGU", name = "m", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!XBHNZKGU", name = "e", descriptor = "I")
	private int anInt757 = -1;

	@OriginalMember(owner = "client!XBHNZKGU", name = "g", descriptor = "[I")
	private int[] anIntArray195 = new int[6];

	@OriginalMember(owner = "client!XBHNZKGU", name = "h", descriptor = "[I")
	private int[] anIntArray196 = new int[6];

	@OriginalMember(owner = "client!XBHNZKGU", name = "i", descriptor = "I")
	public int anInt758 = 128;

	@OriginalMember(owner = "client!XBHNZKGU", name = "j", descriptor = "I")
	public int anInt759 = 128;

	@OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "(Lclient!LKPVZAQN;I)V")
	public static void method514(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class3_Sub3_Sub4 local12 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("spotanim.dat", null));
			anInt754 = local12.method470();
			if (aClass43Array1 == null) {
				aClass43Array1 = new Class43[anInt754];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt754; local22++) {
				if (aClass43Array1[local22] == null) {
					aClass43Array1[local22] = new Class43();
				}
				aClass43Array1[local22].anInt755 = local22;
				aClass43Array1[local22].method515(local12);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("53112, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBHNZKGU", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	private void method515(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method468();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt756 = arg0.method470();
				} else if (local10 == 2) {
					this.anInt757 = arg0.method470();
					if (Class46.aClass46Array1 != null) {
						this.aClass46_1 = Class46.aClass46Array1[this.anInt757];
					}
				} else if (local10 == 4) {
					this.anInt758 = arg0.method470();
				} else if (local10 == 5) {
					this.anInt759 = arg0.method470();
				} else if (local10 == 6) {
					this.anInt760 = arg0.method470();
				} else if (local10 == 7) {
					this.anInt761 = arg0.method468();
				} else if (local10 == 8) {
					this.anInt762 = arg0.method468();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray195[local10 - 40] = arg0.method470();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray196[local10 - 50] = arg0.method470();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("7995, " + arg0 + ", " + 767 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBHNZKGU", name = "a", descriptor = "()Lclient!FCIDIKVY;")
	public Class3_Sub3_Sub2_Sub3 method516() {
		@Pc(6) Class3_Sub3_Sub2_Sub3 local6 = (Class3_Sub3_Sub2_Sub3) aClass25_9.method218((long) this.anInt755);
		if (local6 != null) {
			return local6;
		}
		local6 = Class3_Sub3_Sub2_Sub3.method80(this.anInt756);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray195[0] != 0) {
				local6.method94(this.anIntArray195[local20], this.anIntArray196[local20]);
			}
		}
		aClass25_9.method219(97, (long) this.anInt755, local6);
		return local6;
	}
}
