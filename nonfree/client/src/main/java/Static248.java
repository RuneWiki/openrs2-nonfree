import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "Lclient!gba;")
	public static Class125 aClass125_8;

	@OriginalMember(owner = "client!is", name = "W", descriptor = "Z")
	public static boolean aBoolean396 = true;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z")
	public static boolean method4049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public static void method4051() {
		for (@Pc(20) Class2_Sub5_Sub2 local20 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4280(); local20 != null; local20 = (Class2_Sub5_Sub2) Static61.aClass175_2.method4288()) {
			if (local20.anInt964 > 1) {
				local20.anInt964 = 0;
				Static465.aClass233_42.method5662(local20, ((Class2_Sub5_Sub20) local20.aClass175_1.aClass2_Sub5_34.aClass2_Sub5_66).aLong277);
				local20.aClass175_1.method4283();
			}
		}
		Static90.anInt1824 = 0;
		Static178.anInt3981 = 0;
		Static261.aClass238_28.method5841();
		Static294.aClass222_18.method5469();
		Static61.aClass175_2.method4283();
		Static174.method3221(Static563.aClass2_Sub5_Sub20_22);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!gs;IIIII)V")
	public static void method4055(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static330.anInt4381) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static347.anInt6411) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static191.anInt6006 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class217 local62 = Static440.aClass217ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static331.aClass112Array3[local17].method7819(local32, local23) + Static331.aClass112Array3[local17].method7819(local32, local23 + 1) + Static331.aClass112Array3[local17].method7819(local32 + 1, local23) + Static331.aClass112Array3[local17].method7819(local32 + 1, local23 + 1)) / 4 - (Static331.aClass112Array3[arg1].method7819(arg3, arg2) + Static331.aClass112Array3[arg1].method7819(arg3, arg2 + 1) + Static331.aClass112Array3[arg1].method7819(arg3 + 1, arg2) + Static331.aClass112Array3[arg1].method7819(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class11_Sub1_Sub2 local151 = local62.aClass11_Sub1_Sub2_1;
									@Pc(154) Class11_Sub1_Sub2 local154 = local62.aClass11_Sub1_Sub2_2;
									if (local151 != null && local151.method8313()) {
										arg0.method8316((local23 - arg2) * Static312.anInt5690 + (1 - arg4) * Static290.anInt5464, Static328.aClass87_6, local151, local1, local148, (local32 - arg3) * Static312.anInt5690 + (1 - arg5) * Static290.anInt5464);
									}
									if (local154 != null && local154.method8313()) {
										arg0.method8316((local23 - arg2) * Static312.anInt5690 + (1 - arg4) * Static290.anInt5464, Static328.aClass87_6, local154, local1, local148, (local32 - arg3) * Static312.anInt5690 + (1 - arg5) * Static290.anInt5464);
									}
									for (@Pc(227) Class61 local227 = local62.aClass61_2; local227 != null; local227 = local227.aClass61_1) {
										@Pc(231) Class11_Sub1_Sub1 local231 = local227.aClass11_Sub1_Sub1_1;
										if (local231 != null && local231.method8313() && (local23 == local231.aShort95 || local23 == local3) && (local32 == local231.aShort97 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort96 + 1 - local231.aShort95;
											@Pc(268) int local268 = local231.aShort94 + 1 - local231.aShort97;
											arg0.method8316((local231.aShort95 - arg2) * Static312.anInt5690 + (local260 - arg4) * Static290.anInt5464, Static328.aClass87_6, local231, local1, local148, (local231.aShort97 - arg3) * Static312.anInt5690 + (local268 - arg5) * Static290.anInt5464);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
