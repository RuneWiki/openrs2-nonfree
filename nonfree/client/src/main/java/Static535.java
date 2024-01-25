import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_94 = new Class77(7, 8);

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public static int anInt9522 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Z")
	public static boolean method7883(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!an;IIZ)V")
	public static void method7885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		Static224.anInt8484 = 10000;
		Static111.anInt2588 = 1;
		Static512.anInt9218 = arg1;
		Static105.anInt2408 = arg0;
		Static83.anInt2006 = 0;
		Static444.aClass16_104 = arg2;
		Static340.aBoolean475 = false;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!vw;I)V")
	public static void method7886(@OriginalArg(0) Class7_Sub8 arg0) {
		arg0.aClass30_1 = null;
		@Pc(12) int local12 = arg0.aClass7_Sub4Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			arg0.aClass7_Sub4Array1[local22].aBoolean404 = false;
		}
		@Pc(36) Class149[] local36 = Class212.aClass149Array1;
		synchronized (Class212.aClass149Array1) {
			if (local12 < Class212.aClass149Array1.length && Static330.anIntArray435[local12] < 200) {
				Class212.aClass149Array1[local12].method3984(arg0);
				@Pc(59) int local59 = Static330.anIntArray435[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!nj;)V")
	public static void method7887(@OriginalArg(1) Class12_Sub8_Sub2 arg0) {
		arg0.method5241();
		@Pc(10) int local10 = Static396.anInt7452;
		@Pc(20) Class30_Sub1_Sub1_Sub1 local20 = Static440.aClass30_Sub1_Sub1_Sub1_2 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local10] = new Class30_Sub1_Sub1_Sub1();
		local20.anInt4197 = local10;
		@Pc(28) int local28 = arg0.method5238(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray316[0] = local39 - Static61.anInt1459;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt9418 = (local20.anIntArray316[0] << 7) + (local20.method3591() << 6);
		local20.anIntArray317[0] = local51 - Static203.anInt4534;
		local20.anInt9416 = (local20.anIntArray317[0] << 7) + (local20.method3591() << 6);
		Static56.anInt1418 = local20.aByte99 = local33;
		if (Static494.aClass12_Sub8Array1[local10] != null) {
			local20.method784(Static494.aClass12_Sub8Array1[local10]);
		}
		Static381.anInt7254 = 0;
		Static496.anIntArray465[Static381.anInt7254++] = local10;
		Static329.aByteArray84[local10] = 0;
		Static436.anInt8037 = 0;
		for (@Pc(120) int local120 = 1; local120 < 2048; local120++) {
			if (local10 != local120) {
				@Pc(134) int local134 = arg0.method5238(18);
				@Pc(138) int local138 = local134 >> 16;
				@Pc(144) int local144 = local134 >> 8 & 0xFF;
				@Pc(148) int local148 = local134 & 0xFF;
				@Pc(156) Class211 local156 = Static111.aClass211Array1[local120] = new Class211();
				local156.anInt6044 = -1;
				local156.anInt6042 = 0;
				local156.anInt6041 = local148 + (local138 << 28) + (local144 << 14);
				local156.aBoolean459 = false;
				Static153.anIntArray285[Static436.anInt8037++] = local120;
				Static329.aByteArray84[local120] = 0;
			}
		}
		arg0.method5240();
	}
}
