import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!rn", name = "G", descriptor = "Z")
	public static boolean aBoolean680 = false;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "[I")
	public static final int[] anIntArray744 = new int[3];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!kf;)[I")
	public static int[] method7625(@OriginalArg(1) Class3_Sub34 arg0) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8614(10);
		local10.method8588(local13[0]);
		local10.method8588(local13[1]);
		local10.method8588(local13[2]);
		local10.method8588(local13[3]);
		for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
			local10.method8588((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8649((int) (Math.random() * 9.9999999E7D));
		local10.method8601(Static644.aBigInteger6, Static607.aBigInteger5);
		arg0.aClass3_Sub25_Sub1_2.method8637(local10.aByteArray106, local10.anInt9765, 0);
		return local13;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(IIB)Z")
	public static boolean method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!gaa;Z)V")
	public static void method7627(@OriginalArg(0) Class3_Sub25_Sub1 arg0) {
		arg0.method3399();
		@Pc(10) int local10 = Static106.anInt2205;
		@Pc(20) Class28_Sub1_Sub1_Sub1_Sub1 local20 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local10] = new Class28_Sub1_Sub1_Sub1_Sub1();
		local20.anInt10762 = local10;
		@Pc(28) int local28 = arg0.method3402(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray956[0] = local39 - Static287.anInt4910;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt10729 = (local20.anIntArray956[0] << 9) + (local20.method9314() << 8);
		local20.anIntArray955[0] = local51 - Static72.anInt1361;
		local20.anInt10731 = (local20.anIntArray955[0] << 9) + (local20.method9314() << 8);
		Static309.anInt5138 = local20.aByte174 = local20.aByte173 = local33;
		if (Static488.method7052(local20.anIntArray956[0], local20.anIntArray955[0])) {
			local20.aByte173++;
		}
		if (Static188.aClass3_Sub25Array1[local10] != null) {
			local20.method9104(Static188.aClass3_Sub25Array1[local10]);
		}
		Static393.anInt6147 = 0;
		Static430.anIntArray612[Static393.anInt6147++] = local10;
		Static44.aByteArray8[local10] = 0;
		Static340.anInt5684 = 0;
		for (@Pc(142) int local142 = 1; local142 < 2048; local142++) {
			if (local10 != local142) {
				@Pc(156) int local156 = arg0.method3402(18);
				@Pc(160) int local160 = local156 >> 16;
				@Pc(166) int local166 = local156 >> 8 & 0xFF;
				@Pc(170) int local170 = local156 & 0xFF;
				@Pc(178) Class251 local178 = Static583.aClass251Array1[local142] = new Class251();
				local178.anInt6814 = -1;
				local178.aBoolean487 = false;
				local178.anInt6812 = 0;
				local178.anInt6816 = local170 + (local166 << 14) + (local160 << 28);
				local178.aBoolean488 = false;
				Static416.anIntArray588[Static340.anInt5684++] = local142;
				Static44.aByteArray8[local142] = 0;
			}
		}
		arg0.method3393();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!gw;Lclient!aj;Lclient!dr;Lclient!aj;Lclient!aj;I)Z")
	public static boolean method7629(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Class15 arg4) {
		Static154.aClass15_42 = arg1;
		Static231.anIntArray387 = new int[16];
		Static366.aClass3_Sub1_Sub3_4 = arg2;
		Static527.aClass15_133 = arg3;
		Static597.aClass15_148 = arg4;
		Static343.aClass127_5 = arg0;
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			Static231.anIntArray387[local26] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V")
	public static void method7630() {
		Static7.aClass368Array1 = null;
	}
}
