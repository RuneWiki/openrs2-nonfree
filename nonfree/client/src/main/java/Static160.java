import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Z")
	public static boolean aBoolean278 = false;

	@OriginalMember(owner = "client!gk", name = "N", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_43 = new Class158(72, -1);

	@OriginalMember(owner = "client!gk", name = "ib", descriptor = "[I")
	public static final int[] anIntArray372 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZI[B)V")
	public static void method3123(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static388.aClass3_Sub27_9 == null) {
			Static388.aClass3_Sub27_9 = new Class3_Sub27(20000);
		}
		Static388.aClass3_Sub27_9.method7569(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static222.method4042(Static388.aClass3_Sub27_9.aByteArray114);
		Static527.aClass68_Sub1Array2 = new Class68_Sub1[Static267.anInt5563];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static32.anInt850; local40 <= Static205.anInt4555; local40++) {
			@Pc(46) Class68_Sub1 local46 = Static45.method983(local40);
			if (local46 != null) {
				Static527.aClass68_Sub1Array2[local38++] = local46;
			}
		}
		Static202.aBoolean328 = false;
		Static414.aLong234 = Static12.method647();
		Static388.aClass3_Sub27_9 = null;
	}
}
