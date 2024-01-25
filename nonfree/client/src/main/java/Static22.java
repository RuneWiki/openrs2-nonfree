import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!am", name = "R", descriptor = "Lclient!bp;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "I")
	public static int anInt553 = 100;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
	public static void method527(@OriginalArg(0) Canvas arg0) {
		@Pc(10) Dimension local10 = arg0.getSize();
		Static57.method1069(local10.height, local10.width);
		if (Static471.anInt7481 == 1) {
			Static565.aClass95_13.method8067(arg0, Static233.anInt4125, Static320.anInt5358);
		} else {
			Static565.aClass95_13.method8067(arg0, Static8.anInt105, Static516.anInt8123);
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V")
	public static void method529() {
		Static447.anInt7216 = 0;
		@Pc(23) boolean local23 = Static459.aClass3_Sub4_Sub1_1.method7934() == 1;
		@Pc(27) int local27 = Static459.aClass3_Sub4_Sub1_1.method7934();
		@Pc(31) int local31 = Static459.aClass3_Sub4_Sub1_1.method7935();
		@Pc(35) int local35 = Static459.aClass3_Sub4_Sub1_1.method7951();
		Static105.method1690();
		Static385.method5400(local27);
		@Pc(48) int local48 = (Static147.anInt2709 - Static459.aClass3_Sub4_Sub1_1.anInt9739) / 16;
		Static517.anIntArrayArray49 = new int[local48][4];
		@Pc(58) int local58;
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			for (local58 = 0; local58 < 4; local58++) {
				Static517.anIntArrayArray49[local54][local58] = Static459.aClass3_Sub4_Sub1_1.method7895();
			}
		}
		Static315.aByteArrayArray15 = new byte[local48][];
		Static312.anIntArray296 = new int[local48];
		Static572.anIntArray485 = new int[local48];
		Static322.aByteArrayArray16 = new byte[local48][];
		Static144.anIntArray149 = new int[local48];
		Static455.aByteArrayArray21 = new byte[local48][];
		Static448.anIntArray394 = new int[local48];
		Static376.aByteArrayArray18 = new byte[local48][];
		Static115.anIntArray118 = new int[local48];
		Static110.aByteArrayArray7 = null;
		Static614.anIntArray542 = null;
		local48 = 0;
		for (local58 = (local31 - (Static98.anInt361 >> 4)) / 8; local58 <= ((Static98.anInt361 >> 4) + local31) / 8; local58++) {
			for (@Pc(131) int local131 = (local35 - (Static438.anInt7120 >> 4)) / 8; local131 <= ((Static438.anInt7120 >> 4) + local35) / 8; local131++) {
				Static448.anIntArray394[local48] = (local58 << 8) + local131;
				Static312.anIntArray296[local48] = Static405.aClass362_87.method8353("m" + local58 + "_" + local131);
				Static144.anIntArray149[local48] = Static405.aClass362_87.method8353("l" + local58 + "_" + local131);
				Static115.anIntArray118[local48] = Static405.aClass362_87.method8353("um" + local58 + "_" + local131);
				Static572.anIntArray485[local48] = Static405.aClass362_87.method8353("ul" + local58 + "_" + local131);
				local48++;
			}
		}
		Static469.method6284(local35, local23, local31, 11);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILclient!ofa;)V")
	public static void method531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class265 arg2) {
		if (Static264.aClass265_8 != null || Static532.aBoolean580 || (arg2 == null || Static474.method6317(arg2) == null)) {
			return;
		}
		Static264.aClass265_8 = arg2;
		Static478.aClass265_12 = Static474.method6317(arg2);
		Static310.anInt5192 = 0;
		Static479.aBoolean676 = false;
		Static548.anInt8559 = arg0;
		Static260.anInt4561 = arg1;
	}
}
