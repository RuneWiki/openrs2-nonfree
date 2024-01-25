import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "(I)Z")
	public static boolean method4826() {
		return Static76.anInt1078 > 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
	public static void method4827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static315.anInt5207 + arg0;
		@Pc(13) int local13 = Static47.anInt676 + arg2;
		if (Static259.aClass216ArrayArrayArray3 == null || arg0 < 0 || arg2 < 0 || Static147.anInt2300 <= arg0 || arg2 >= Static293.anInt4886) {
			return;
		}
		@Pc(40) long local40 = (long) (arg1 << 28 | local13 << 14 | local9);
		@Pc(46) Class1_Sub32 local46 = (Class1_Sub32) Static402.aClass208_37.method4405(local40);
		if (local46 == null) {
			Static318.method4202(arg1, arg0, arg2);
			return;
		}
		@Pc(60) Class1_Sub39 local60 = (Class1_Sub39) local46.aClass14_26.method203();
		if (local60 == null) {
			Static318.method4202(arg1, arg0, arg2);
			return;
		}
		@Pc(74) Class11_Sub5_Sub1 local74 = (Class11_Sub5_Sub1) Static318.method4202(arg1, arg0, arg2);
		if (local74 == null) {
			local74 = new Class11_Sub5_Sub1();
		} else {
			local74.anInt5786 = local74.anInt5789 = -1;
		}
		local74.anInt5791 = local60.anInt5805;
		local74.anInt5796 = local60.anInt5803;
		label46: while (true) {
			@Pc(102) Class1_Sub39 local102 = (Class1_Sub39) local46.aClass14_26.method208();
			if (local102 == null) {
				break;
			}
			if (local102.anInt5803 != local74.anInt5796) {
				local74.anInt5786 = local102.anInt5803;
				local74.anInt5788 = local102.anInt5805;
				while (true) {
					@Pc(127) Class1_Sub39 local127 = (Class1_Sub39) local46.aClass14_26.method208();
					if (local127 == null) {
						break label46;
					}
					if (local74.anInt5796 != local127.anInt5803 && local74.anInt5786 != local127.anInt5803) {
						local74.anInt5789 = local127.anInt5803;
						local74.anInt5787 = local127.anInt5805;
					}
				}
			}
		}
		@Pc(175) int local175 = Static135.method1732((arg0 << 7) + 64, (arg2 << 7) + 64, arg1);
		Static48.method653(arg1, arg0, arg2, local175, local74);
	}
}
