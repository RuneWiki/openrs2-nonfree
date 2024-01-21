import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!hc", name = "cb", descriptor = "Lclient!jb;")
	public static Class25 aClass25_8;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "Lclient!nc;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "Lclient!qf;")
	private static Class60 aClass60_611 = Static59.method1195("Attack");

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "Lclient!qf;")
	public static Class60 aClass60_612 = aClass60_611;

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_614 = Static59.method1195("Please reload this page)3");

	@OriginalMember(owner = "client!hc", name = "X", descriptor = "Lclient!qf;")
	public static Class60 aClass60_613 = aClass60_614;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "Z")
	public static boolean aBoolean45 = false;

	@OriginalMember(owner = "client!hc", name = "jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_615 = Static59.method1195("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_616 = Static59.method1195("Hierhin gehen");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZIII)V")
	public static void method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = 2048 - arg5 & 0x7FF;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg3;
		@Pc(20) int local20 = 0;
		@Pc(26) int local26 = 2048 - arg4 & 0x7FF;
		@Pc(39) int local39;
		@Pc(35) int local35;
		@Pc(50) int local50;
		if (local26 != 0) {
			local35 = Class3_Sub1_Sub2_Sub1.anIntArray39[local26];
			local39 = Class3_Sub1_Sub2_Sub1.anIntArray41[local26];
			local50 = local35 * 0 - arg3 * local39 >> 16;
			local18 = arg3 * local35 + local39 * 0 >> 16;
			local16 = local50;
		}
		if (local5 != 0) {
			local35 = Class3_Sub1_Sub2_Sub1.anIntArray39[local5];
			local39 = Class3_Sub1_Sub2_Sub1.anIntArray41[local5];
			local50 = local18 * local39 + local35 * 0 >> 16;
			local18 = local35 * local18 - local39 * 0 >> 16;
			local20 = local50;
		}
		Static115.anInt3199 = arg1 - local16;
		Static98.anInt2824 = arg2 - local18;
		Static22.anInt871 = arg5;
		Static71.anInt1493 = arg0 - local20;
		Static63.anInt2908 = arg4;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!qf;B)V")
	public static void method965(@OriginalArg(0) Class60 arg0) {
		if (arg0 == null || arg0.method1836() == 0) {
			Static15.anInt627 = 0;
			return;
		}
		@Pc(19) Class60 local19 = arg0;
		@Pc(22) Class60[] local22 = new Class60[100];
		@Pc(24) int local24 = 0;
		while (true) {
			@Pc(40) int local40 = local19.method1841();
			if (local40 == -1) {
				local19 = local19.method1827();
				if (local19.method1836() > 0) {
					local22[local24++] = local19.method1846();
				}
				Static15.anInt627 = 0;
				label46: for (local40 = 0; local40 < Static39.anInt1295; local40++) {
					@Pc(101) Class3_Sub1_Sub11 local101 = Static22.method568(local40);
					if (local101.anInt1848 == -1 && local101.aClass60_816 != null) {
						@Pc(113) Class60 local113 = local101.aClass60_816.method1846();
						for (@Pc(115) int local115 = 0; local115 < local24; local115++) {
							if (local113.method1847(local22[local115]) == -1) {
								continue label46;
							}
						}
						Static58.aClass60Array7[Static15.anInt627] = local113;
						Static60.anIntArray206[Static15.anInt627] = local40;
						Static15.anInt627++;
						if (Static15.anInt627 >= Static58.aClass60Array7.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(52) Class60 local52 = local19.method1864(0, local40).method1827();
			if (local52.method1836() > 0) {
				local22[local24++] = local52.method1846();
			}
			local19 = local19.method1829(local40 + 1);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method966() {
		if (Static14.aBoolean15 && Static119.anInt3243 != Static54.anInt1750) {
			Static129.method2294(Static2.anInt118, Static77.anInt2427, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static119.anInt3243);
		} else if (Static119.anInt3243 != Static55.anInt1762) {
			Static55.anInt1762 = Static119.anInt3243;
			Static108.method2038(Static119.anInt3243);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!ve;III)V")
	public static void method967(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub6 local7 = new Class3_Sub6();
		local7.anIntArray76 = arg1.anIntArray386;
		local7.anInt763 = arg1.anInt3423 * 128;
		local7.anInt767 = arg1.anInt3415;
		local7.anInt761 = arg1.anInt3414;
		local7.anInt759 = arg0 * 128;
		local7.anInt762 = arg2;
		local7.anInt770 = arg1.anInt3425;
		local7.anInt757 = arg4 * 128;
		@Pc(50) int local50 = arg1.anInt3441;
		@Pc(53) int local53 = arg1.anInt3449;
		if (arg3 == 1 || arg3 == 3) {
			local53 = arg1.anInt3441;
			local50 = arg1.anInt3449;
		}
		local7.anInt766 = (arg4 + local50) * 128;
		local7.anInt756 = (arg0 + local53) * 128;
		if (arg1.anIntArray387 != null) {
			local7.aClass3_Sub1_Sub17_1 = arg1;
			local7.method504();
		}
		Static53.aClass5_14.method87(local7);
		if (local7.anIntArray76 != null) {
			local7.anInt769 = local7.anInt770 + (int) (Math.random() * (double) (local7.anInt761 - local7.anInt770));
		}
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
	public static void method969() {
		aClass47_2 = null;
		aClass25_8 = null;
		aClass60_615 = null;
		aClass60_613 = null;
		aClass60_611 = null;
		aClass60_614 = null;
		aClass60_612 = null;
		aClass60_616 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!df;")
	public static Class16 method971(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class16_Sub1");
			@Pc(10) Class16 local10 = (Class16) local6.getDeclaredConstructor().newInstance();
			local10.method1669(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class16_Sub2 local31 = new Class16_Sub2();
			local31.method1669(arg0, arg1, arg2);
			return local31;
		}
	}
}
