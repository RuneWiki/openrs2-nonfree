import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_30 = new Class211(80, 8);

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_5 = new Class213("", 17);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)V")
	public static void method1208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static25.aClass132ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg1 | arg0 << 28 | arg2 << 14);
		@Pc(25) Class1_Sub12 local25 = (Class1_Sub12) Static338.aClass77_34.method1368(local19);
		if (local25 == null) {
			Static93.method1364(arg0, arg1, arg2);
			return;
		}
		@Pc(39) Class1_Sub11 local39 = (Class1_Sub11) local25.aClass17_12.method202();
		if (local39 == null) {
			Static93.method1364(arg0, arg1, arg2);
			return;
		}
		@Pc(53) Class25_Sub2_Sub1 local53 = (Class25_Sub2_Sub1) Static93.method1364(arg0, arg1, arg2);
		if (local53 == null) {
			local53 = new Class25_Sub2_Sub1();
		} else {
			local53.anInt858 = local53.anInt864 = -1;
		}
		local53.anInt863 = local39.anInt1462;
		local53.anInt856 = local39.anInt1460;
		label44: while (true) {
			@Pc(86) Class1_Sub11 local86 = (Class1_Sub11) local25.aClass17_12.method207();
			if (local86 == null) {
				break;
			}
			if (local86.anInt1462 != local53.anInt863) {
				local53.anInt858 = local86.anInt1462;
				local53.anInt869 = local86.anInt1460;
				while (true) {
					@Pc(107) Class1_Sub11 local107 = (Class1_Sub11) local25.aClass17_12.method207();
					if (local107 == null) {
						break label44;
					}
					if (local107.anInt1462 != local53.anInt863 && local107.anInt1462 != local53.anInt858) {
						local53.anInt865 = local107.anInt1460;
						local53.anInt864 = local107.anInt1462;
					}
				}
			}
		}
		@Pc(147) int local147 = Static236.method3260(arg0, (arg2 << 7) + 64, (arg1 << 7) + 64);
		Static38.method575(arg0, arg1, arg2, local147, local53);
	}
}
