import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!on", name = "h", descriptor = "I")
	public static int anInt4755;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!up;")
	public static final Class250 aClass250_17 = new Class250(1, 2);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([JZ[Ljava/lang/Object;)V")
	public static void method3773(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static286.method3748(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Lclient!ui;")
	public static Class4_Sub2_Sub17 method3774() {
		@Pc(8) Class4_Sub2_Sub17 local8 = (Class4_Sub2_Sub17) Static96.aClass239_5.method5125();
		if (local8 != null) {
			local8.method6059();
			local8.method5538();
			return local8;
		}
		do {
			local8 = (Class4_Sub2_Sub17) Static309.aClass239_8.method5125();
			if (local8 == null) {
				return null;
			}
			if (local8.method5528() > Static266.method3498()) {
				return null;
			}
			local8.method6059();
			local8.method5538();
		} while ((Long.MIN_VALUE & local8.aLong208) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII)I")
	public static int method3775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
