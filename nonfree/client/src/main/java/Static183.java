import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
	public static int anInt4054;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Lclient!oa;")
	public static final Class144 aClass144_4 = new Class144(64);

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
	public static void method3477() {
		Static81.aStringArray8 = new String[500];
		Static201.anInt4407 = Static99.aClass82_3.anInt2400 + Static99.aClass82_3.anInt2404 + 2;
		Static12.anInt206 = Static213.aClass82_7.anInt2404 + Static213.aClass82_7.anInt2400 + 2;
		for (@Pc(27) int local27 = 0; local27 < Static81.aStringArray8.length; local27++) {
			Static81.aStringArray8[local27] = "";
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)B")
	public static byte method3480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3482(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static9.anInt173;
		@Pc(9) int[] local9 = Static195.anIntArray322;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class1_Sub2_Sub3_Sub1 local21 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local9[local13]];
			if (local21 != null && Static177.aClass1_Sub2_Sub3_Sub1_1 != local21 && local21.aString34 != null && local21.aString34.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static300.method5057(Static13.aClass157_13);
					Static197.aClass2_Sub12_Sub2_2.method3147(0);
					Static197.aClass2_Sub12_Sub2_2.method3115(local9[local13]);
				} else if (arg1 == 4) {
					Static300.method5057(Static276.aClass157_177);
					Static197.aClass2_Sub12_Sub2_2.method3141(0);
					Static197.aClass2_Sub12_Sub2_2.method3158(local9[local13]);
				} else if (arg1 == 5) {
					Static300.method5057(Static157.aClass157_111);
					Static197.aClass2_Sub12_Sub2_2.method3147(0);
					Static197.aClass2_Sub12_Sub2_2.method3158(local9[local13]);
				} else if (arg1 == 6) {
					Static300.method5057(Static207.aClass157_133);
					Static197.aClass2_Sub12_Sub2_2.method3158(local9[local13]);
					Static197.aClass2_Sub12_Sub2_2.method3152(0);
				} else if (arg1 == 7) {
					Static300.method5057(Static229.aClass157_150);
					Static197.aClass2_Sub12_Sub2_2.method3133(0);
					Static197.aClass2_Sub12_Sub2_2.method3115(local9[local13]);
				}
				break;
			}
		}
		if (!local11) {
			Static225.method4191(Static86.aClass140_36.method4155(Static239.anInt2803) + arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	public static void method3484() {
		Static79.aClass37_2.method3717(((float) Static333.anInt6458 * 0.1F + 0.7F) * 1.1523438F);
		Static79.aClass37_2.method3664(Static341.anInt463, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static79.aClass37_2.method3701(Static328.anInt6689, -1);
		Static79.aClass37_2.method3735(Static128.aClass3_2);
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
	public static void method3485() {
		if (Static260.anInt5453 != 2) {
			try {
				Static381.method5669(Static2.aClient1, "tbrefresh");
			} catch (@Pc(16) Throwable local16) {
			}
		}
	}
}
