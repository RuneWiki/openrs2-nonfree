import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_58 = new Class85("glow1:", "", "", "");

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_61 = new Class103();

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!le;")
	public static final Class122 aClass122_5 = new Class122(128);

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
	public static final int[] anIntArray219 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	public static int anInt2269 = 500;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method2136(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static37.anInt671 = arg2;
		Static26.aString6 = arg0;
		Static9.aString3 = arg1;
		if (Static9.aString3.equals("") || Static26.aString6.equals("")) {
			Static333.anInt6433 = 3;
		} else if (Static48.anInt918 == -1) {
			Static129.anInt2452 = 0;
			Static153.anInt2976 = 1;
			Static52.anInt971 = 0;
			Static333.anInt6433 = -3;
			@Pc(39) Class5_Sub12 local39 = new Class5_Sub12(128);
			local39.method5089(10);
			local39.method5070((int) (Math.random() * 9.9999999E7D));
			local39.method5065(Static269.method4712(Static9.aString3));
			local39.method5070((int) ((double) 99999999 * Math.random()));
			local39.method5094(Static26.aString6);
			local39.method5070((int) (Math.random() * 9.9999999E7D));
			local39.method5078(Static304.aBigInteger5, Static292.aBigInteger4);
			Static125.aClass5_Sub12_Sub2_3.anInt5731 = 0;
			Static125.aClass5_Sub12_Sub2_3.method5089(24);
			Static125.aClass5_Sub12_Sub2_3.method5089(local39.anInt5731 + 2);
			Static125.aClass5_Sub12_Sub2_3.method5084(565);
			Static125.aClass5_Sub12_Sub2_3.method5110(local39.anInt5731, local39.aByteArray90);
		} else {
			Static170.method3098();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method2137() {
		if (Static280.anInt5512 != -1) {
			Static348.method5935(Static280.anInt5512, -1, -1, false);
			Static280.anInt5512 = -1;
		}
	}
}
