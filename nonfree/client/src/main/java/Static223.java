import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_37 = new Class305(37, 16);

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt4119 = 0;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_71 = new Class359(120, 4);

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_23 = new Class114();

	@OriginalMember(owner = "client!he", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_72 = new Class359(6, 0);

	@OriginalMember(owner = "client!he", name = "j", descriptor = "[I")
	public static final int[] anIntArray206 = new int[5];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!mc;)Lclient!af;")
	public static Class10 method3495(@OriginalArg(1) Class5_Sub41 arg0) {
		@Pc(10) Class275 local10 = Static393.method5771()[arg0.method7816()];
		@Pc(17) Class81 local17 = Static584.method8024()[arg0.method7816()];
		@Pc(21) int local21 = arg0.method7849();
		@Pc(27) int local27 = arg0.method7849();
		@Pc(36) int local36 = arg0.method7860();
		@Pc(40) int local40 = arg0.method7860();
		@Pc(44) int local44 = arg0.method7849();
		@Pc(48) int local48 = arg0.method7804();
		@Pc(52) int local52 = arg0.method7804();
		return new Class10(local10, local17, local21, local27, local36, local40, local44, local48, local52);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method3496() {
		for (@Pc(6) Class5_Sub40 local6 = (Class5_Sub40) Static133.aClass300_10.method7182(); local6 != null; local6 = (Class5_Sub40) Static133.aClass300_10.method7192()) {
			if (local6.aClass140_Sub1_1.method7255()) {
				Static231.method3572(local6.anInt6338);
			} else {
				local6.aClass140_Sub1_1.method7263();
				try {
					local6.aClass140_Sub1_1.method7244();
				} catch (@Pc(23) Exception local23) {
					Static234.method3615(local23, "TV: " + local6.anInt6338);
					Static231.method3572(local6.anInt6338);
				}
				if (!local6.aBoolean561 && !local6.aBoolean562) {
					@Pc(49) Class5_Sub9_Sub1 local49 = local6.aClass140_Sub1_1.method7254();
					if (local49 != null) {
						@Pc(55) Class5_Sub17_Sub3 local55 = local49.method2739();
						if (local55 != null) {
							local55.method3989(local6.anInt6339);
							Static245.aClass5_Sub17_Sub4_2.method6191(local55);
							local6.aBoolean561 = true;
						}
					}
				}
			}
		}
	}
}
