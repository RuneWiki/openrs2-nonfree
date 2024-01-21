import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UDOLPBTU")
public final class Class36 {

	@OriginalMember(owner = "client!UDOLPBTU", name = "b", descriptor = "I")
	private static int anInt720;

	@OriginalMember(owner = "client!UDOLPBTU", name = "c", descriptor = "[Lclient!UDOLPBTU;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!UDOLPBTU", name = "a", descriptor = "I")
	private static int anInt719 = 6;

	@OriginalMember(owner = "client!UDOLPBTU", name = "d", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!UDOLPBTU", name = "e", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!UDOLPBTU", name = "f", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!UDOLPBTU", name = "g", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!UDOLPBTU", name = "j", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!UDOLPBTU", name = "h", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!UDOLPBTU", name = "i", descriptor = "I")
	private int anInt724 = -1;

	@OriginalMember(owner = "client!UDOLPBTU", name = "k", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!UDOLPBTU", name = "a", descriptor = "(Lclient!LKPVZAQN;I)V")
	public static void method446(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class3_Sub3_Sub4 local8 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("varbit.dat", null));
			anInt720 = local8.method470();
			@Pc(15) boolean local15 = false;
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt720];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt720; local22++) {
				if (aClass36Array1[local22] == null) {
					aClass36Array1[local22] = new Class36();
				}
				aClass36Array1[local22].method447(local8, local22, anInt719);
				if (aClass36Array1[local22].aBoolean163) {
					Class44.aClass44Array1[aClass36Array1[local22].anInt721].aBoolean175 = true;
				}
			}
			if (local8.anInt738 != local8.aByteArray20.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("22895, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDOLPBTU", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!UDOLPBTU", name = "a", descriptor = "(Lclient!WBEWPIXO;II)V")
	private void method447(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 == 6) {
				while (true) {
					@Pc(8) int local8 = arg0.method468();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt721 = arg0.method470();
						this.anInt722 = arg0.method468();
						this.anInt723 = arg0.method468();
					} else if (local8 == 10) {
						this.aString15 = arg0.method475();
					} else if (local8 == 2) {
						this.aBoolean163 = true;
					} else if (local8 == 3) {
						this.anInt724 = arg0.method473();
					} else if (local8 == 4) {
						this.anInt725 = arg0.method473();
					} else if (local8 == 5) {
						this.aBoolean164 = false;
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("15837, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
