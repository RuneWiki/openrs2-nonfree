import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIII)V")
	public static void method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static193.method2984(Static356.aClass179_73);
		}
		if (arg1 == 1) {
			Static193.method2984(Static255.aClass179_54);
		}
		Static92.aClass1_Sub5_Sub1_1.method5393(Static165.anInt3049 + arg0);
		Static92.aClass1_Sub5_Sub1_1.method5375(arg2 + Static345.anInt5799);
		Static92.aClass1_Sub5_Sub1_1.method5394(Static306.aClass155_1.method3516(82) ? 1 : 0);
		Static414.anInt6715 = arg0;
		Static207.anInt3927 = arg2;
		Static229.aBoolean295 = false;
		Static246.method4273();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
	public static boolean method1786(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static378.anInt4251; local1 < Static68.anInt1553; local1++) {
			@Pc(6) Class80[][] local6 = client.lb[local1];
			for (@Pc(9) int local9 = -Static75.anInt1695; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static398.anInt6395 + local9;
				@Pc(18) int local18 = Static398.anInt6395 - local9;
				if (local14 >= Static397.anInt6377 || local18 < Static190.anInt3419) {
					for (@Pc(27) int local27 = -Static75.anInt1695; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static350.anInt5829 + local27;
						@Pc(36) int local36 = Static350.anInt5829 - local27;
						@Pc(48) Class80 local48;
						if (local14 >= Static397.anInt6377) {
							if (local32 >= Static312.anInt5398) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean143) {
									Static185.aBoolean200 = arg0;
									Static135.aClass6_1.method5195(local48);
									Static135.aClass6_1.method5192();
								}
							}
							if (local36 < Static27.anInt608) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean143) {
									Static185.aBoolean200 = arg0;
									Static135.aClass6_1.method5195(local48);
									Static135.aClass6_1.method5192();
								}
							}
						}
						if (local18 < Static190.anInt3419) {
							if (local32 >= Static312.anInt5398) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean143) {
									Static185.aBoolean200 = arg0;
									Static135.aClass6_1.method5195(local48);
									Static135.aClass6_1.method5192();
								}
							}
							if (local36 < Static27.anInt608) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean143) {
									Static185.aBoolean200 = arg0;
									Static135.aClass6_1.method5195(local48);
									Static135.aClass6_1.method5192();
								}
							}
						}
						if (Static187.anInt3381 == 0) {
							if (Static293.aBoolean372) {
								Static135.aClass6_1.method5191(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BII)Z")
	public static boolean method1788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
