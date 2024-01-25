import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!ir;")
	public static Class100 aClass100_90;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!os;")
	public static Class120 aClass120_4;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt4490;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt4480 = 0;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString167 = "Connection lost.";

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public static int anInt4482 = 0;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	public static int anInt4483 = 0;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt4484 = 0;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public static int anInt4489 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!ir;Lclient!ir;)V")
	public static void method3803(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class100 arg1) {
		Static121.aClass100_56 = arg1;
		Static95.aClass100_35 = arg0;
		Static271.anInt5444 = Static95.aClass100_35.method2309(3);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
	public static void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub7_Sub11 local15 = Static116.method2029(0, 15);
		local15.method2509();
		local15.anInt3054 = arg0;
		local15.anInt3053 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!fb;)Lclient!rq;")
	public static Class35_Sub2 method3806(@OriginalArg(1) Class3_Sub4 arg0) {
		return new Class35_Sub2(arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3622(), arg0.method3659(), arg0.method3643());
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method3807(@OriginalArg(0) Class122 arg0) {
		if (Static170.anInt6279 < 2 && Static235.anInt4719 == 0 && !Static155.aBoolean96) {
			return;
		}
		@Pc(43) String local43;
		if (Static235.anInt4719 == 1 && Static170.anInt6279 < 2) {
			local43 = Static87.aString57 + Static127.aString101 + Static200.aString156 + " ->";
		} else if (Static155.aBoolean96 && Static170.anInt6279 < 2) {
			local43 = Static303.aString199 + Static127.aString101 + Static309.aString229 + " ->";
		} else if (Static309.aBoolean418 && Static192.aBooleanArray19[81] && Static170.anInt6279 > 2) {
			local43 = Static23.method436((Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247.aClass3_247);
		} else {
			@Pc(61) Class3_Sub26 local61 = (Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247;
			local43 = Static23.method436(local61);
			@Pc(67) int[] local67 = null;
			if (Static128.method2209(local61.anInt2734)) {
				local67 = Static230.method5537((int) local61.aLong100).anIntArray79;
			} else if (Static72.method1116(local61.anInt2734)) {
				@Pc(112) Class5_Sub4_Sub4_Sub2 local112 = Static244.aClass5_Sub4_Sub4_Sub2Array1[(int) local61.aLong100];
				if (local112 != null) {
					local67 = local112.aClass119_1.anIntArray249;
				}
			} else if (Static85.method1379(local61.anInt2734)) {
				if (local61.anInt2734 == 1011) {
					local67 = Static268.method4553((int) local61.aLong100).anIntArray422;
				} else {
					local67 = Static268.method4553((int) (local61.aLong100 >>> 32 & 0x7FFFFFFFL)).anIntArray422;
				}
			}
			if (local67 != null) {
				local43 = local43 + Static48.method840(local67);
			}
		}
		if (Static170.anInt6279 > 2) {
			local43 = local43 + "<col=ffffff> / " + (Static170.anInt6279 - 2) + Static99.aString75;
		}
		if (Static91.aClass181_16 != null) {
			@Pc(230) Class120 local230 = Static91.aClass181_16.method4920(arg0);
			if (local230 == null) {
				local230 = Static243.aClass120_6;
			}
			local230.method5532(Static273.anInt5484, Static91.aClass181_16.anInt5718, Static91.aClass181_16.anInt5772, Static342.aRandom1, Static29.anInt728, Static91.aClass181_16.anInt5679, Static216.anIntArray358, Static91.aClass181_16.anInt5704, Static274.aClass57Array22, Static91.aClass181_16.anInt5721, Static301.anInt5984, local43, Static327.anIntArray527, Static91.aClass181_16.anInt5736);
			Static171.method2843(Static216.anIntArray358[3], Static216.anIntArray358[2], Static216.anIntArray358[1], Static216.anIntArray358[0]);
		} else if (Static276.aClass181_45 != null && Static309.anInt6133 == 0) {
			@Pc(210) int local210 = Static243.aClass120_6.method5529(Static97.anInt2040 + 16, Static327.anIntArray527, Static301.anInt5984, Static274.aClass57Array22, Static20.anInt549 + 4, local43, Static342.aRandom1);
			Static171.method2843(16, local210 + Static191.aClass209_6.method5510(local43), Static97.anInt2040, Static20.anInt549 + 4);
		}
	}
}
