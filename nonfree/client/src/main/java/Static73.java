import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public static int anInt1827;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!bw;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	public static int anInt1832;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_26 = new Class119(33, 3);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ck;B)V")
	public static void method1424(@OriginalArg(0) Class3_Sub7_Sub1 arg0) {
		arg0.method1064();
		@Pc(8) int local8 = Static319.anInt1936;
		@Pc(18) Class7_Sub2_Sub3_Sub2 local18 = Static379.aClass7_Sub2_Sub3_Sub2_2 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local8] = new Class7_Sub2_Sub3_Sub2();
		local18.anInt4391 = local8;
		@Pc(26) int local26 = arg0.method1063(30);
		@Pc(31) byte local31 = (byte) (local26 >> 28);
		@Pc(37) int local37 = local26 >> 14 & 0x3FFF;
		@Pc(41) int local41 = local26 & 0x3FFF;
		local18.anIntArray287[0] = local37 - Static223.anInt7618;
		local18.anInt4318 = (local18.anIntArray287[0] << 7) + (local18.method3499() << 6);
		local18.anIntArray288[0] = local41 - Static57.anInt5085;
		local18.anInt4321 = (local18.anIntArray288[0] << 7) + (local18.method3499() << 6);
		Static6.anInt93 = local18.aByte77 = local31;
		if (Static13.aClass3_Sub7Array1[local8] != null) {
			local18.method3523(Static13.aClass3_Sub7Array1[local8]);
		}
		Static160.anInt3271 = 0;
		Static162.anIntArray212[Static160.anInt3271++] = local8;
		Static170.aByteArray47[local8] = 0;
		Static207.anInt4005 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local8 != local125) {
				@Pc(134) int local134 = arg0.method1063(18);
				@Pc(138) int local138 = local134 >> 16;
				@Pc(144) int local144 = local134 >> 8 & 0xFF;
				@Pc(148) int local148 = local134 & 0xFF;
				@Pc(156) Class64 local156 = Static365.aClass64Array1[local125] = new Class64();
				local156.anInt2168 = local148 + (local138 << 28) + (local144 << 14);
				local156.aBoolean171 = false;
				local156.anInt2167 = 0;
				local156.anInt2170 = -1;
				Static131.anIntArray168[Static207.anInt4005++] = local125;
				Static170.aByteArray47[local125] = 0;
			}
		}
		arg0.method1065();
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V")
	public static void method1425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub4_Sub12 local16 = Static393.method5080(arg0, 1);
		local16.method3248();
		local16.anInt4063 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIZILclient!bu;)V")
	public static void method1426(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class32 arg2) {
		Static181.anInt3614 = arg1;
		Static410.anInt6753 = 1;
		Static50.aClass32_21 = arg2;
		Static61.anInt1580 = arg0;
		Static193.aBoolean332 = false;
		Static301.anInt2467 = 10000;
		Static120.anInt2585 = 0;
	}
}
