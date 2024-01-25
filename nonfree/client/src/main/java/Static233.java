import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[SB)[S")
	public static short[] method3995(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static555.method5091(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public static void method4003() {
		@Pc(1) Class316 local1 = Static538.aClass316_64;
		synchronized (Static538.aClass316_64) {
			Static538.aClass316_64.method7791(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(Z)V")
	public static void method4004() {
		Static179.aClass174_11.method4423();
		Static61.aClass174_4.method4423();
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(Z)Lclient!jj;")
	public static Class1_Sub25 method4005() {
		if (Static451.aClass38_28 == null || Static328.aClass157_1 == null) {
			return null;
		}
		Static328.aClass157_1.method4035(Static451.aClass38_28);
		@Pc(24) Class1_Sub25 local24 = (Class1_Sub25) Static328.aClass157_1.method4036();
		if (local24 == null) {
			return null;
		} else {
			@Pc(34) Class24 local34 = Static451.aClass250_3.method6143(local24.anInt4556);
			return local34 != null && local34.aBoolean100 && local34.method1184(Static451.anInterface10_2) ? local24 : Static180.method3465();
		}
	}
}
