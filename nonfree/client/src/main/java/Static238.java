import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZIIII)V", line = 18)
	public static void method4403(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class2_Sub10.anInt1760 == 0) {
			Static224.method4193(false);
		} else {
			Class12_Sub1.anInt4455 = Class2_Sub10.anInt1760;
			Static74.method5702(0);
		}
		Class128.anInt3432 = arg1;
		Class15_Sub1.anInt519 = arg3;
		Class2_Sub3_Sub29.aBoolean399 = arg0;
		Static321.method5519(arg2);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!wm;Lclient!hp;IIIII)V", line = 45)
	public static void method4404(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static86.anInt1912) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static68.anInt1682) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static196.anInt3769 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class67 local62 = Static307.aClass67ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static340.aClass6Array4[local17].method5720(local23, local32) + Static340.aClass6Array4[local17].method5720(local23 + 1, local32) + Static340.aClass6Array4[local17].method5720(local23, local32 + 1) + Static340.aClass6Array4[local17].method5720(local23 + 1, local32 + 1)) / 4 - (Static340.aClass6Array4[arg2].method5720(arg3, arg4) + Static340.aClass6Array4[arg2].method5720(arg3 + 1, arg4) + Static340.aClass6Array4[arg2].method5720(arg3, arg4 + 1) + Static340.aClass6Array4[arg2].method5720(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class11_Sub1 local143 = local62.aClass11_Sub1_3;
									@Pc(146) Class11_Sub1 local146 = local62.aClass11_Sub1_2;
									if (local143 != null && local143.method6077()) {
										arg1.method6076((local23 - arg3) * Class11_Sub5_Sub3.anInt4707 + (1 - arg5) * Static233.anInt4684, (local32 - arg4) * Class11_Sub5_Sub3.anInt4707 + (1 - arg6) * Static233.anInt4684, local140, arg0, local1, local143);
									}
									if (local146 != null && local146.method6077()) {
										arg1.method6076((local23 - arg3) * Class11_Sub5_Sub3.anInt4707 + (1 - arg5) * Static233.anInt4684, (local32 - arg4) * Class11_Sub5_Sub3.anInt4707 + (1 - arg6) * Static233.anInt4684, local140, arg0, local1, local146);
									}
									for (@Pc(219) Class22 local219 = local62.aClass22_2; local219 != null; local219 = local219.aClass22_1) {
										@Pc(223) Class11_Sub5 local223 = local219.aClass11_Sub5_1;
										if (local223 != null && local223.method6077() && (local23 == local223.aShort103 || local23 == local3) && (local32 == local223.aShort101 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort104 + 1 - local223.aShort103;
											@Pc(260) int local260 = local223.aShort102 + 1 - local223.aShort101;
											arg1.method6076((local223.aShort103 - arg3) * Class11_Sub5_Sub3.anInt4707 + (local252 - arg5) * Static233.anInt4684, (local223.aShort101 - arg4) * Class11_Sub5_Sub3.anInt4707 + (local260 - arg6) * Static233.anInt4684, local140, arg0, local1, local223);
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

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 138)
	public static void method4405(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static126.method2539(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Class2_Sub3_Sub30.anInt5688; local25++) {
			@Pc(31) String local31 = Class2_Sub3_Sub22.aStringArray35[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static126.method2539(local31);
			if (local31 != null && local31.equals(local20)) {
				Class2_Sub3_Sub30.anInt5688--;
				for (@Pc(55) int local55 = local25; local55 < Class2_Sub3_Sub30.anInt5688; local55++) {
					Class2_Sub3_Sub22.aStringArray35[local55] = Class2_Sub3_Sub22.aStringArray35[local55 + 1];
					Class11_Sub3_Sub2.aStringArray39[local55] = Class11_Sub3_Sub2.aStringArray39[local55 + 1];
					Class173_Sub4.aStringArray66[local55] = Class173_Sub4.aStringArray66[local55 + 1];
					Class2_Sub3_Sub20.aStringArray28[local55] = Class2_Sub3_Sub20.aStringArray28[local55 + 1];
					Class119.aBooleanArray31[local55] = Class119.aBooleanArray31[local55 + 1];
				}
				Class11_Sub4.anInt3966 = Class65.anInt1874;
				Static85.method1962(Class226.aClass145_231);
				Class14.aClass2_Sub4_Sub2_4.method4843(Static26.method872(arg0));
				Class14.aClass2_Sub4_Sub2_4.method4823(arg0);
				break;
			}
		}
	}
}
