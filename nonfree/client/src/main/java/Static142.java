import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_9 = new Class238();

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!oj;)V")
	public static void method2433(@OriginalArg(1) Class48 arg0) {
		arg0.method2496(0, 0, Static7.anInt157, 350);
		arg0.method2470(0, 0, Static7.anInt157, 350, Static64.anInt1440 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		@Pc(35) int local35;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static313.anIntArray502[local25];
			local35 = Static212.anIntArray312[local25];
			arg0.method2470(local31, local35, 2, 2, Static183.anIntArray292[local25] << 24 | 0xFFFFFF, 1);
		}
		local31 = 350 / Static255.anInt4901;
		if (Static195.anInt4058 > 0) {
			local35 = 346 - Static255.anInt4901 - 4;
			@Pc(79) int local79 = local35 * local31 / (local31 + Static195.anInt4058 - 1);
			@Pc(81) int local81 = 4;
			if (Static195.anInt4058 > 1) {
				local81 = (local35 - local79) * (Static195.anInt4058 + -1 + -Static372.anInt6826) / (Static195.anInt4058 - 1) + 4;
			}
			arg0.method2470(Static7.anInt157 - 16, local81, 12, local79, Static64.anInt1440 << 24 | 0x332277, 2);
			for (@Pc(120) int local120 = Static372.anInt6826; local120 < local31 + Static372.anInt6826 && Static195.anInt4058 > local120; local120++) {
				@Pc(129) String[] local129 = Static71.method1265(Static389.aStringArray45[local120], '\b');
				@Pc(138) int local138 = (Static7.anInt157 - 8 - 16) / local129.length;
				for (@Pc(140) int local140 = 0; local140 < local129.length; local140++) {
					@Pc(149) int local149 = local138 * local140 + 8;
					arg0.method2496(local149, 0, local138 + local149 - 8, 350);
					Static31.aClass44_1.method4652(-16777216, 348 - Static209.aClass24_6.anInt418 - Static159.anInt3285 - Static255.anInt4901 * (local120 + -Static372.anInt6826), local149, -1, local129[local140]);
				}
			}
		}
		arg0.method2496(0, 0, Static7.anInt157, 350);
		arg0.method2493(-1, 0, 350 - Static159.anInt3285, Static7.anInt157);
		Static180.aClass44_4.method4652(-16777216, 350 - Static121.aClass24_10.anInt418 - 1, 10, -1, "--> " + Static231.aString41);
		local35 = -1;
		if (Static339.anInt6265 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method2514(350 - Static121.aClass24_10.anInt418 - 11, 10 - -Static121.aClass24_10.method325("--> " + Static231.aString41.substring(0, Static174.anInt3548)), local35, 12);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method2435() {
		Static313.aClass126_5.method3298();
		Static14.aClass233_1.method5624();
		Static182.aClass170_2.method4305();
		Static230.aClass96_4.method2294();
		Static207.aClass32_1.method574();
		Static57.aClass196_1.method4828();
		Static333.aClass50_2.method1170();
		Static153.aClass116_1.method2789();
		Static19.aClass132_1.method3433();
		Static179.aClass204_1.method5026();
		Static59.aClass194_1.method4755();
		Static78.aClass195_2.method4812();
		Static197.aClass30_2.method536();
		Static57.aClass79_1.method1852();
		Static261.aClass97_1.method2362();
		Static194.aClass52_1.method1201();
		Static371.aClass162_1.method4139();
		Static15.aClass36_1.method600();
		Static253.aClass67_2.method1491();
		Static80.aClass172_1.method4330();
		Static16.method190();
		Static43.method4504();
		Static147.method2660();
		Static339.method5454();
		Static263.aClass41_59.method826(5);
		Static189.aClass41_3.method826(5);
		Static253.aClass41_58.method826(5);
		Static230.aClass41_53.method826(5);
		Static351.aClass41_71.method826(5);
	}
}
