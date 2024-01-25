import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "J")
	public static long aLong363 = 0L;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_367 = new Class296(68, 2);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!kr;I)V")
	public static void method7096(@OriginalArg(0) Class171 arg0) {
		Static290.aClass171_148 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Z")
	public static boolean method7097(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method7098(@OriginalArg(1) Class1_Sub6 arg0) {
		if (arg0.aByteArray66.length - arg0.anInt4555 < 1) {
			return;
		}
		@Pc(27) int local27 = arg0.method3922();
		if (local27 < 0 || local27 > 1 || arg0.aByteArray66.length - arg0.anInt4555 < 2) {
			return;
		}
		@Pc(49) int local49 = arg0.method3967();
		if (local49 * 6 > arg0.aByteArray66.length - arg0.anInt4555) {
			return;
		}
		for (@Pc(67) int local67 = 0; local67 < local49; local67++) {
			@Pc(73) int local73 = arg0.method3967();
			@Pc(77) int local77 = arg0.method3925();
			if (local73 < Static42.anIntArray119.length && Static303.aBooleanArray39[local73] && (Static343.aClass99_1.method2335(local73).aChar1 != '1' || local77 >= -1 && local77 <= 1)) {
				Static42.anIntArray119[local73] = local77;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(FZ)F")
	public static float method7099(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ds;")
	public static RuntimeException_Sub1 method7100(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString19 = local12.aString19 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
