import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
	public static int anInt4211;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
	public static int anInt4205 = -1;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	public static void method3529(@OriginalArg(1) int arg0) {
		Static155.method2593();
		Static243.method4116();
		@Pc(18) int local18 = Static255.method4308(arg0).anInt606;
		if (local18 == 0) {
			return;
		}
		@Pc(27) int local27 = Static161.anIntArray347[arg0];
		if (local18 == 9) {
			Static219.anInt4296 = local27;
		}
		if (local18 == 6) {
			Static105.anInt1947 = local27;
		}
		if (local18 == 5) {
			Static11.anInt5182 = local27;
		}
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
	public static void method3530() {
		Static204.aClass3_Sub15_Sub4_3.method4592();
		Static94.anInt1711 = 1;
		Static310.aClass155_122 = null;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)Lclient!dd;")
	public static Class32 method3532(@OriginalArg(1) int arg0) {
		@Pc(11) Class32 local11 = (Class32) Static217.aClass98_37.method2570((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26 = Static18.aClass155_12.method4121(30, arg0);
		local11 = new Class32();
		if (local26 != null) {
			local11.method790(arg0, new Class3_Sub26(local26));
		}
		Static217.aClass98_37.method2568(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IC)Z")
	public static boolean method3533(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static202.aCharArray30;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(48) char local48 = local34[local36];
				if (local48 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V")
	public static void method3535() {
		Static29.aClass98_7.method2572();
		Static28.aClass98_5.method2572();
		Static20.aClass98_3.method2572();
	}
}
