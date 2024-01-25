import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public static int anInt4069;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array11;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "I")
	public static int anInt4073;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "Lclient!kb;")
	public static Class52 aClass52_23;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
	public static int method3639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static12.anIntArray27[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method3640(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static229.aClass49ArrayArrayArray6 = Static289.aClass49ArrayArrayArray5;
			Static331.aClass8Array5 = Static251.aClass8Array6;
		} else {
			Static229.aClass49ArrayArrayArray6 = Static252.aClass49ArrayArrayArray7;
			Static331.aClass8Array5 = Static136.aClass8Array3;
		}
		Static41.anInt1075 = Static229.aClass49ArrayArrayArray6.length;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
	public static void method3641() {
		Static67.method5324();
		Static321.method5188();
		Static195.method3488();
		Static268.method4491();
		Static151.method2966();
		Static275.method4593();
		Static275.method4597();
		Static346.method5567();
		Static133.method2668();
		Static337.method5367();
		Static237.method4095();
		Static318.method469();
		Static2.method15();
		Static211.method3759();
		Static168.method3218();
		Static342.method5551();
		Static275.method4596();
		Static80.method1714();
		Static263.method4431();
		Static196.method3494();
		Static222.method3935();
		Static301.method4879();
		if (Static250.anInt4912 != 0) {
			for (@Pc(58) int local58 = 0; local58 < Static345.aByteArrayArray21.length; local58++) {
				Static345.aByteArrayArray21[local58] = null;
			}
			Static218.anInt4343 = 0;
		}
		Static307.method4980();
		Static298.method4860();
		Static256.method4312();
		Static304.method4916();
		Static132.method2667();
		Static83.aClass103_21.method2678();
		Static128.aClass89_3.method5410();
		Static122.aClass154_2.method4075();
		Static175.method3279();
		Static193.aClass180_51.method4558();
		Static251.aClass180_94.method4558();
		Static282.aClass180_75.method4558();
		Static318.aClass180_6.method4558();
		Static284.aClass180_77.method4558();
		Static87.aClass180_80.method4558();
		Static226.aClass180_57.method4558();
		Static247.aClass180_64.method4558();
		Static312.aClass180_89.method4558();
		Static286.aClass180_78.method4558();
		Static159.aClass180_44.method4558();
		Static65.aClass180_18.method4558();
		Static194.aClass180_21.method4558();
		Static139.aClass180_36.method4558();
		Static85.aClass180_23.method4558();
		Static100.aClass180_29.method4558();
		Static36.aClass180_9.method4558();
		Static257.aClass180_67.method4558();
		Static131.aClass180_35.method4558();
		Static284.aClass180_76.method4558();
		Static200.aClass180_53.method4558();
		Static273.aClass180_72.method4558();
		Static334.aClass180_95.method4558();
		Static87.aClass180_81.method4558();
		Static100.aClass180_30.method4558();
		Static304.aClass180_85.method4558();
		Static309.aClass180_87.method4558();
		Static239.aClass180_60.method4558();
		Static42.aClass180_10.method4558();
		Static54.aClass103_14.method2678();
		Static263.aClass103_53.method2678();
		Static171.aClass103_28.method2678();
		Static33.aClass103_9.method2678();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!cq;")
	public static RuntimeException_Sub1 method3642(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString96 = local12.aString96 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
	public static void method3643() {
		Static259.anInt5013 = -1;
		Static35.anInt1025 = -1;
		Static348.anInt6562 = 0;
	}
}
