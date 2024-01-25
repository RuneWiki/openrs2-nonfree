import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)V")
	public static void method8525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static534.anInt8753 + arg1;
		@Pc(18) int local18 = arg2 + Static234.anInt4239;
		if (Static441.aClass351ArrayArrayArray1 == null || arg1 < 0 || arg2 < 0 || arg1 >= Static491.anInt9856 || arg2 >= Static393.anInt6574 || Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 0 && arg0 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140) {
			return;
		}
		@Pc(62) long local62 = (long) (local9 | arg0 << 28 | local18 << 14);
		@Pc(68) Class6_Sub52 local68 = (Class6_Sub52) Static33.aClass209_3.method5038(local62);
		if (local68 == null) {
			Static48.method966(arg0, arg1, arg2);
			return;
		}
		@Pc(82) Class6_Sub3 local82 = (Class6_Sub3) local68.aClass362_61.method8538();
		if (local82 == null) {
			Static48.method966(arg0, arg1, arg2);
			return;
		}
		@Pc(96) Class2_Sub1_Sub5_Sub1 local96 = (Class2_Sub1_Sub5_Sub1) Static48.method966(arg0, arg1, arg2);
		if (local96 == null) {
			local96 = new Class2_Sub1_Sub5_Sub1(arg1 << 9, Static289.aClass12Array3[arg0].method7846(arg1, arg2), arg2 << 9, arg0, arg0);
		} else {
			local96.anInt8397 = local96.anInt8390 = -1;
		}
		local96.anInt8394 = local82.anInt439;
		local96.lb = local82.anInt441;
		label56: while (true) {
			@Pc(139) Class6_Sub3 local139 = (Class6_Sub3) local68.aClass362_61.method8530();
			if (local139 == null) {
				break;
			}
			if (local139.anInt439 != local96.anInt8394) {
				local96.anInt8397 = local139.anInt439;
				local96.anInt8392 = local139.anInt441;
				while (true) {
					@Pc(164) Class6_Sub3 local164 = (Class6_Sub3) local68.aClass362_61.method8530();
					if (local164 == null) {
						break label56;
					}
					if (local96.anInt8394 != local164.anInt439 && local164.anInt439 != local96.anInt8397) {
						local96.anInt8393 = local164.anInt441;
						local96.anInt8390 = local164.anInt439;
					}
				}
			}
		}
		@Pc(212) int local212 = Static284.method4118((arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
		local96.aByte141 = (byte) arg0;
		local96.anInt10004 = local212;
		local96.aByte140 = (byte) arg0;
		local96.anInt10006 = arg1 << 9;
		local96.anInt10001 = arg2 << 9;
		local96.anInt8384 = 0;
		if (Static250.method3635(arg1, arg2)) {
			local96.aByte141++;
		}
		Static284.method4119(arg0, arg1, arg2, local212, local96);
	}
}
