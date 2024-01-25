import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public static int anInt5954;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_96 = new Class73(115, 8);

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	public static int anInt5953 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method4959() {
		Static309.anInt6228 = 0;
		Static471.anInt5158 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static123.anInt3102; local11++) {
			@Pc(17) int local17 = Static354.anInt6877 * local11;
			for (@Pc(19) int local19 = 0; local19 < Static354.anInt6877; local19++) {
				@Pc(25) int local25 = local19 + local17;
				Static320.anInterface20Array1[local25].method8479(Static361.anInt6971 * local19, Static633.anInt10652 * local11, Static361.anInt6971, Static633.anInt10652, true);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public static void method4960() {
		Static102.method2421();
		Static321.aClass73_107 = null;
		Static96.anInt2770 = 0;
		Static125.anInt3103 = 0;
		Static340.aClass73_118 = null;
		Static84.aClass6_Sub8_Sub1_1.anInt10061 = 0;
		Static165.aClass73_55 = null;
		Static461.aClass73_148 = null;
		Static85.anInt2620 = 0;
		Static393.method6210();
		Static437.method6711();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local35] = null;
		}
		Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 = null;
		for (@Pc(51) int local51 = 0; local51 < Static337.anInt6701; local51++) {
			@Pc(58) Class9_Sub4_Sub2_Sub1_Sub1 local58 = Static303.aClass6_Sub42Array1[local51].aClass9_Sub4_Sub2_Sub1_Sub1_1;
			if (local58 != null) {
				local58.anInt4293 = -1;
			}
		}
		Static537.method7610();
		Static594.anInt10048 = -1;
		Static214.anInt4587 = -1;
		Static554.anInt9497 = 1;
		Static119.method2558(10);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static366.aBooleanArray16[local80] = true;
		}
		Static182.method3421();
		Static500.aClass6_Sub7_8 = null;
		Static23.aLong13 = 0L;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!bi;I)V")
	public static void method4961(@OriginalArg(0) Class6_Sub8_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt2534; local3++) {
			@Pc(9) int local9 = Static125.anIntArray119[local3];
			@Pc(13) Class9_Sub4_Sub2_Sub1_Sub2 local13 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local9];
			@Pc(17) int local17 = arg0.method8246();
			if ((local17 & 0x20) != 0) {
				local17 += arg0.method8246() << 8;
			}
			if ((local17 & 0x800) != 0) {
				local17 += arg0.method8246() << 16;
			}
			Static131.method2667(local13, local17, arg0, local9);
		}
	}
}
