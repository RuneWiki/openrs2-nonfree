import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[Lclient!th;")
	public static Class348[] aClass348Array1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!pd;")
	public static final Class276 aClass276_1 = new Class276(0);

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
	public static boolean aBoolean55 = true;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!kja;)V")
	public static void method945(@OriginalArg(1) Class2_Sub8_Sub2 arg0) {
		arg0.method5231();
		@Pc(10) int local10 = Static659.anInt11273;
		@Pc(20) Class15_Sub3_Sub3_Sub1_Sub1 local20 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local10] = new Class15_Sub3_Sub3_Sub1_Sub1();
		local20.anInt3977 = local10;
		@Pc(28) int local28 = arg0.method5233(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray189[0] = local39 - Static640.anInt11085;
		local20.anInt11022 = (local20.anIntArray189[0] << 9) + (local20.method3690() << 8);
		local20.anIntArray188[0] = local43 - Static490.anInt8763;
		local20.anInt11024 = (local20.anIntArray188[0] << 9) + (local20.method3690() << 8);
		Static547.anInt9550 = local20.aByte142 = local20.aByte141 = local33;
		if (method947(local20.anIntArray189[0], local20.anIntArray188[0])) {
			local20.aByte141++;
		}
		if (Static510.aClass2_Sub8Array1[local10] != null) {
			local20.method2225(Static510.aClass2_Sub8Array1[local10]);
		}
		Static383.anInt7249 = 0;
		Static404.anIntArray362[Static383.anInt7249++] = local10;
		Static363.aByteArray67[local10] = 0;
		Static92.anInt11207 = 0;
		for (@Pc(140) int local140 = 1; local140 < 2048; local140++) {
			if (local10 != local140) {
				@Pc(150) int local150 = arg0.method5233(18);
				@Pc(154) int local154 = local150 >> 16;
				@Pc(160) int local160 = local150 >> 8 & 0xFF;
				@Pc(164) int local164 = local150 & 0xFF;
				@Pc(172) Class245 local172 = Static221.aClass245Array1[local140] = new Class245();
				local172.aBoolean554 = false;
				local172.aBoolean555 = false;
				local172.anInt7390 = (local154 << 28) + (local160 << 14) + local164;
				local172.anInt7392 = -1;
				local172.anInt7393 = 0;
				Static231.anIntArray215[Static92.anInt11207++] = local140;
				Static363.aByteArray67[local140] = 0;
			}
		}
		arg0.method5234();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public static void method946() {
		Static167.aClass2_Sub1_Sub13_1 = new Class2_Sub1_Sub13(Static205.aClass134_4.method3906(Static204.anInt8130), "", Static113.anInt2045, 1002, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
	public static boolean method947(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static96.aByteArrayArrayArray10[1].length > arg0 && arg1 < Static96.aByteArrayArrayArray10[1][arg0].length) {
			return (Static96.aByteArrayArrayArray10[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)I")
	public static int method948(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
