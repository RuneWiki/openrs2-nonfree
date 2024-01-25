import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!ur;")
	public static Class1_Sub43 aClass1_Sub43_5;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!m;")
	public static Interface8 anInterface8_11;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_243 = new Class137(43, 6);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!di;")
	public static final Class51 aClass51_4 = new Class51();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!sm;)V")
	public static void method4915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2 arg3) {
		@Pc(4) Class82 local4 = Static15.method238(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass20_Sub2_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method4917() {
		Static108.anInt1918 = 0;
		@Pc(18) boolean local18 = Static154.aClass1_Sub11_Sub1_3.method4465() == 1;
		@Pc(22) int local22 = Static154.aClass1_Sub11_Sub1_3.method4485();
		@Pc(26) int local26 = Static154.aClass1_Sub11_Sub1_3.method4463();
		@Pc(30) int local30 = Static154.aClass1_Sub11_Sub1_3.method4485();
		Static381.method4865(local26);
		@Pc(40) int local40 = (Static329.anInt5393 - Static154.aClass1_Sub11_Sub1_3.anInt5766) / 16;
		Static148.anIntArrayArray62 = new int[local40][4];
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			for (@Pc(50) int local50 = 0; local50 < 4; local50++) {
				Static148.anIntArrayArray62[local46][local50] = Static154.aClass1_Sub11_Sub1_3.method4487();
			}
		}
		Static356.anIntArray348 = null;
		Static342.aByteArrayArray41 = new byte[local40][];
		Static346.anIntArray341 = new int[local40];
		Static137.anIntArray112 = new int[local40];
		Static334.anIntArray331 = new int[local40];
		Static109.aByteArrayArray15 = new byte[local40][];
		Static383.aByteArrayArray44 = new byte[local40][];
		Static7.anIntArray394 = new int[local40];
		Static59.aByteArrayArray9 = null;
		Static288.anIntArray250 = new int[local40];
		Static207.aByteArrayArray28 = new byte[local40][];
		local40 = 0;
		for (@Pc(118) int local118 = (local22 - (Static425.anInt6922 >> 4)) / 8; local118 <= (local22 + (Static425.anInt6922 >> 4)) / 8; local118++) {
			for (@Pc(129) int local129 = (local30 - (Static251.anInt4072 >> 4)) / 8; local129 <= ((Static251.anInt4072 >> 4) + local30) / 8; local129++) {
				Static334.anIntArray331[local40] = (local118 << 8) + local129;
				Static346.anIntArray341[local40] = Static310.aClass113_97.method2269("m" + local118 + "_" + local129);
				Static137.anIntArray112[local40] = Static310.aClass113_97.method2269("l" + local118 + "_" + local129);
				Static7.anIntArray394[local40] = Static310.aClass113_97.method2269("um" + local118 + "_" + local129);
				Static288.anIntArray250[local40] = Static310.aClass113_97.method2269("ul" + local118 + "_" + local129);
				local40++;
			}
		}
		Static369.method3951(local30, local22, false, local18);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!dh;IB)Ljava/lang/String;")
	public static String method4918(@OriginalArg(0) Class1_Sub11 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4469();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt5766 += Static225.aClass54_1.method1216(arg0.aByteArray64, local19, arg0.anInt5766, 0, local7);
			return Static257.method5311(local7, 0, local19);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}
}
