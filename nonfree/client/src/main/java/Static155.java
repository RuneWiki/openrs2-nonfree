import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fga", name = "S", descriptor = "Lclient!ge;")
	public static Class121 aClass121_2;

	@OriginalMember(owner = "client!fga", name = "R", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_37 = new Class179(15, 3);

	@OriginalMember(owner = "client!fga", name = "T", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_38 = new Class179(83, 4);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIBI)V")
	public static void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class2_Sub2_Sub4 local16 = Static566.method7763(arg2, 10);
		local16.method662();
		local16.anInt821 = arg0;
		local16.anInt817 = arg1;
		local16.anInt823 = arg3;
	}

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "(I)V")
	public static void method2313() {
		Static230.method3180();
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(II)I")
	public static int method2315(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0xF3333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(42) int local42 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg6 + arg7 && arg1 + arg2 > arg7) {
			return arg0 < arg5 + arg3 && arg3 < arg0 + arg4;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(II)Z")
	public static boolean method2317(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
