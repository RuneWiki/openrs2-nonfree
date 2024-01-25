import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!ji;")
	public static Class124 aClass124_2;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
	public static int anInt752 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!mq;II)J")
	public static long method652(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(27) Class141 local27 = Static259.aClass95_3.method1821(arg1.method5124());
		@Pc(50) long local50 = (long) ((arg2 | 0x800000) << 7 | arg0 | arg1.method5125() << 14 | arg1.method5122() << 20);
		if (local27.anInt3379 == 0) {
			local50 |= local9;
		}
		if (local27.anInt3429 == 1) {
			local50 |= local5;
		}
		if (local27.aBoolean269) {
			local50 |= local7;
		}
		return local50 | (long) arg1.method5124() << 32;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!ic;II)Lclient!je;")
	public static Class122 method653(@OriginalArg(1) Class113 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte[] local18 = arg0.method2274(arg1, 0);
		return local18 == null ? null : new Class122(local18);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZZ)Z")
	public static boolean method654(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
	public static void method655() {
		if (Static260.aClass77_5 != null) {
			Static260.aClass77_5.method4272();
		}
		if (Static343.aClass77_4 != null) {
			Static343.aClass77_4.method4272();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZIIIZ)V")
	public static void method656(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static154.method4417(0, arg2, arg0, arg3, arg1, Static237.aClass114_Sub1Array3.length - 1);
		Static317.aClass1_Sub10_2 = null;
		Static108.anInt1921 = 0;
	}
}
