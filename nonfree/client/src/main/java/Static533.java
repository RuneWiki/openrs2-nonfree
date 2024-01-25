import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public static int anInt8992;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!uj;")
	public static final Class371 aClass371_8 = new Class371("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7503(@OriginalArg(0) Class67 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static178.aBoolean264) {
			local7 = Static448.method6652();
			local9 = Static143.method2382();
		}
		arg0.KA(local7, local9, local7 + Static575.anInt9435, 350 - -local9);
		arg0.aa(local7, local9, Static575.anInt9435, 350, Static332.anInt5825 << 24 | 0x332277, 1);
		Static30.method402(local9, local7 + Static575.anInt9435, local7, local9 + 350);
		@Pc(56) int local56 = 350 / Static514.anInt8777;
		@Pc(65) int local65;
		if (Static159.anInt2951 > 0) {
			local65 = 346 - Static514.anInt8777 - 4;
			@Pc(76) int local76 = local65 * local56 / (local56 + Static159.anInt2951 - 1);
			@Pc(78) int local78 = 4;
			if (Static159.anInt2951 > 1) {
				local78 = (local65 - local76) * (-Static112.anInt2245 + -1 + Static159.anInt2951) / (Static159.anInt2951 - 1) + 4;
			}
			arg0.aa(local7 + Static575.anInt9435 - 16, local78 + local9, 12, local76, Static332.anInt5825 << 24 | 0x332277, 2);
			for (@Pc(119) int local119 = Static112.anInt2245; local119 < local56 + Static112.anInt2245 && local119 < Static159.anInt2951; local119++) {
				@Pc(128) String[] local128 = Static349.method5051('\b', Static527.aStringArray34[local119]);
				@Pc(137) int local137 = (Static575.anInt9435 - 8 - 16) / local128.length;
				for (@Pc(139) int local139 = 0; local139 < local128.length; local139++) {
					@Pc(147) int local147 = local137 * local139 + 8;
					arg0.KA(local147 + local7, local9, local137 + local7 + local147 - 8, local9 - -350);
					Static418.aClass44_32.method8129(-1, Static72.method921(local128[local139]), -16777216, local147 + local7, -Static380.anInt6816 + -2 + local9 + 350 + -Static687.aClass330_13.anInt9393 + -((local119 + -Static112.anInt2245) * Static514.anInt8777));
				}
			}
		}
		Static705.aClass44_53.method8117(-16777216, "Build: 663", -1, local9 + 350 - 20, local7 + Static575.anInt9435 + -25);
		arg0.KA(local7, local9, local7 + Static575.anInt9435, local9 + 350);
		arg0.method7701(local7, local9 + 350 - Static380.anInt6816, Static575.anInt9435, -1);
		if (-26814 != -26814) {
			method7508(true, false);
		}
		Static427.aClass44_34.method8129(-1, "--> " + Static72.method921(Static140.aString44), -16777216, local7 + 10, local9 + -1 - (-350 - -Static381.aClass330_7.anInt9393));
		if (!Static153.aBoolean230) {
			return;
		}
		local65 = -1;
		if (Static269.anInt4883 % 30 > 15) {
			local65 = 16777215;
		}
		arg0.method7690(12, local65, local7 + Static381.aClass330_7.method7911(99, "--> " + Static72.method921(Static140.aString44).substring(0, Static663.anInt10567)) + 10, -Static381.aClass330_7.anInt9393 + -11 + 350 + local9);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
	public static void method7506() {
		@Pc(23) Class3_Sub48 local23 = Static89.method1200(Static225.aClass286_37, Static532.aClass400_3.aClass399_2);
		Static532.aClass400_3.method9223(local23);
		for (@Pc(32) Class3_Sub52 local32 = (Class3_Sub52) Static170.aClass136_19.method3509(); local32 != null; local32 = (Class3_Sub52) Static170.aClass136_19.method3506()) {
			if (!local32.method9443()) {
				local32 = (Class3_Sub52) Static170.aClass136_19.method3509();
				if (local32 == null) {
					break;
				}
			}
			if (local32.anInt10201 == 0) {
				Static65.method813(true, true, local32);
			}
		}
		if (Static70.aClass20_4 != null) {
			Static391.method5905(Static70.aClass20_4);
			Static70.aClass20_4 = null;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	public static void method7507() {
		Static510.aClass67_17.method7682(Static311.aFloat92, Static643.aFloat194, Static104.aFloat19);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZBZ)V")
	public static void method7508(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static375.anInt6391++;
			Static95.method1284();
		}
		if (arg1) {
			Static708.anInt11077++;
			Static405.method6052();
		}
	}
}
