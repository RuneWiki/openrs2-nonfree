import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Lclient!ns;")
	public static Class166 aClass166_20;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "I")
	public static final int anInt385 = 1403;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_7 = new Class36(26, 18);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIC)I")
	public static int method315(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;Lclient!qv;III)V")
	public static void method316(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class53 local12;
		if (arg3 < Static301.anInt5434) {
			local12 = Static40.aClass53ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass6_Sub4_1 != null && local12.aClass6_Sub4_1.method5633()) {
				arg1.method5636(local12.aClass6_Sub4_1, arg0, 0, true, Static205.anInt3908, 0);
			}
		}
		if (arg4 < Static301.anInt5434) {
			local12 = Static40.aClass53ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass6_Sub4_1 != null && local12.aClass6_Sub4_1.method5633()) {
				arg1.method5636(local12.aClass6_Sub4_1, arg0, Static205.anInt3908, true, 0, 0);
			}
		}
		if (arg3 < Static301.anInt5434 && arg4 < Static241.anInt4414) {
			local12 = Static40.aClass53ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass6_Sub4_1 != null && local12.aClass6_Sub4_1.method5633()) {
				arg1.method5636(local12.aClass6_Sub4_1, arg0, Static205.anInt3908, true, Static205.anInt3908, 0);
			}
		}
		if (arg3 < Static301.anInt5434 && arg4 > 0) {
			local12 = Static40.aClass53ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass6_Sub4_1 != null && local12.aClass6_Sub4_1.method5633()) {
				arg1.method5636(local12.aClass6_Sub4_1, arg0, -Static205.anInt3908, true, Static205.anInt3908, 0);
			}
		}
	}
}
