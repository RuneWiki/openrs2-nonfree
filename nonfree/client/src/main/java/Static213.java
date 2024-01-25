import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "Lclient!so;")
	public static Class184 aClass184_2;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!ir;)V")
	public static void method3730(@OriginalArg(1) Class100 arg0) {
		Static14.aClass100_9 = arg0;
		Static14.aClass100_9.method2309(35);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ir;B)V")
	public static void method3732(@OriginalArg(0) Class100 arg0) {
		Static246.aClass100_99 = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIBIIII)V")
	public static void method3733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class181 local8 = Static214.method3735(arg3, arg0);
		if (local8 != null && local8.anObjectArray10 != null) {
			@Pc(17) Class3_Sub41 local17 = new Class3_Sub41();
			local17.aClass181_54 = local8;
			local17.anObjectArray34 = local8.anObjectArray10;
			Static139.method2275(local17);
		}
		Static203.anInt4169 = arg3;
		Static299.anInt5948 = arg1;
		Static244.anInt4838 = arg2;
		Static164.anInt6256 = arg5;
		Static58.anInt1273 = arg4;
		Static147.anInt2908 = arg0;
		Static155.aBoolean96 = true;
		Static316.method5250(local8);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z")
	public static boolean method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static285.anIntArrayArrayArray11[arg0][arg1][arg2];
		if (local7 == -Static287.anInt5782) {
			return false;
		} else if (local7 == Static287.anInt5782) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static20.method420(local22 + 1, Static69.aClass22Array1[arg0].method4672(arg1, arg2), local26 + 1) && Static20.method420(local22 + 128 - 1, Static69.aClass22Array1[arg0].method4672(arg1 + 1, arg2), local26 + 1) && Static20.method420(local22 + 128 - 1, Static69.aClass22Array1[arg0].method4672(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static20.method420(local22 + 1, Static69.aClass22Array1[arg0].method4672(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static285.anIntArrayArrayArray11[arg0][arg1][arg2] = Static287.anInt5782;
				return true;
			} else {
				Static285.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static287.anInt5782;
				return false;
			}
		}
	}
}
