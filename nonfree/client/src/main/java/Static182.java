import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!vb;IIILjava/lang/String;IILclient!ss;Lclient!ms;ILclient!oj;)V")
	public static void method2942(@OriginalArg(1) Class201 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class216 arg7, @OriginalArg(9) Class155 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class13 arg10) {
		@Pc(21) int local21;
		if (Static283.anInt5017 == 4) {
			local21 = (int) Static18.aFloat8 & 0x3FFF;
		} else {
			local21 = Static232.anInt4267 + (int) Static18.aFloat8 & 0x3FFF;
		}
		@Pc(40) int local40 = Math.max(arg8.anInt4170 / 2, arg8.anInt4214 / 2) + 10;
		@Pc(48) int local48 = arg3 * arg3 + arg5 * arg5;
		if (local40 * local40 < local48) {
			return;
		}
		@Pc(58) int local58 = Class104.anIntArray705[local21];
		@Pc(62) int local62 = Class104.anIntArray706[local21];
		if (Static283.anInt5017 != 4) {
			local58 = local58 * 256 / (Static48.anInt942 + 256);
			local62 = local62 * 256 / (Static48.anInt942 + 256);
		}
		@Pc(93) int local93 = local58 * arg3 + local62 * arg5 >> 15;
		@Pc(104) int local104 = arg3 * local62 - local58 * arg5 >> 15;
		@Pc(113) int local113 = arg7.method5078(arg4, 100, null);
		@Pc(119) int local119 = local93 - local113 / 2;
		@Pc(127) int local127 = arg7.method5070(arg4, null);
		if (-arg8.anInt4170 <= local119 && local119 <= arg8.anInt4170 && -arg8.anInt4214 <= local104 && arg8.anInt4214 >= local104) {
			arg10.method5611(arg1, arg8.anInt4214 / 2 + arg6 - local127 - local104 - arg9, 0, 0, 50, 1, arg0, arg1 + local119 + arg8.anInt4170 / 2, 0, arg4, arg6, local113, arg2, null, null);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
	public static void method2943(@OriginalArg(0) int arg0) {
		if (Static35.anInt745 == 0) {
			Static222.aClass2_Sub2_Sub3_1.method3415(arg0);
		} else {
			Static261.anInt4643 = arg0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
	public static void method2945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static19.method552(Static83.aClass41_43);
		Static39.aClass2_Sub13_Sub2_4.method4238(arg0);
		Static39.aClass2_Sub13_Sub2_4.method4224(arg1);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!n;")
	public static RuntimeException_Sub1 method2947(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString40 = local12.aString40 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}
}
