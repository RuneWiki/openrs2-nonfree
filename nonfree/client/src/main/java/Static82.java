import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt1521;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_31 = new Class211(8, 8);

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_13 = new Class227(20);

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!tb;")
	public static final Class219 aClass219_2 = new Class219(64);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!cl;)V")
	public static void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1) {
		Static229.aClass42Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method1216(@OriginalArg(1) Class164 arg0) {
		if (Static215.anInt3678 < 2 && !Static90.aBoolean144 || Static227.aClass117_14 != null) {
			return;
		}
		@Pc(43) String local43;
		if (Static90.aBoolean144 && Static215.anInt3678 < 2) {
			local43 = Static114.aString18 + Static294.aClass169_276.method3680(Static48.anInt952) + Static28.aString7 + " ->";
		} else if (Static327.aBoolean516 && Static264.aClass154_1.method3994(81) && Static215.anInt3678 > 2) {
			local43 = Static180.method2597((Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244.aClass1_244);
		} else {
			@Pc(70) Class1_Sub40 local70 = (Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244;
			local43 = Static180.method2597(local70);
			@Pc(76) int[] local76 = null;
			if (Static5.method56(local70.anInt5411)) {
				local76 = Static263.aClass102_2.method2172((int) local70.aLong172).anIntArray261;
			} else if (local70.anInt5412 != -1) {
				local76 = Static263.aClass102_2.method2172(local70.anInt5412).anIntArray261;
			} else if (Static70.method1142(local70.anInt5411)) {
				@Pc(141) Class25_Sub1_Sub1_Sub2 local141 = Static171.aClass25_Sub1_Sub1_Sub2Array1[(int) local70.aLong172];
				if (local141 != null) {
					@Pc(146) Class59 local146 = local141.aClass59_1;
					if (local146.anIntArray186 != null) {
						local146 = local146.method1150(Static230.aClass72_3);
					}
					if (local146 != null) {
						local76 = local146.anIntArray188;
					}
				}
			} else if (Static265.method4069(local70.anInt5411)) {
				@Pc(113) Class236 local113;
				if (local70.anInt5411 == 1008) {
					local113 = Static54.aClass153_1.method3081((int) local70.aLong172);
				} else {
					local113 = Static54.aClass153_1.method3081((int) (local70.aLong172 >>> 32 & 0x7FFFFFFFL));
				}
				if (local113.anIntArray706 != null) {
					local113 = local113.method5074(Static230.aClass72_3);
				}
				if (local113 != null) {
					local76 = local113.anIntArray707;
				}
			}
			if (local76 != null) {
				local43 = local43 + Static139.method2130(local76);
			}
		}
		if (Static215.anInt3678 > 2) {
			local43 = local43 + "<col=ffffff> / " + (Static215.anInt3678 - 2) + Static331.aClass169_301.method3680(Static48.anInt952);
		}
		if (Static329.aClass117_10 != null) {
			@Pc(254) Class137 local254 = Static329.aClass117_10.method2513(arg0);
			if (local254 == null) {
				local254 = Static101.aClass137_2;
			}
			local254.method5090(Static19.anIntArray32, Static329.aClass117_10.anInt3051, Static329.aClass117_10.anInt3074, Static329.aClass117_10.anInt3091, Static87.anIntArray210, local43, Static329.aClass117_10.anInt3082, Static393.aRandom1, Static266.anInt4620, Static245.anInt1950, Static284.anInt4915, Static329.aClass117_10.anInt3071, Static329.aClass117_10.anInt3084, Static134.aClass51Array10);
			Static83.method1220(Static19.anIntArray32[1], Static19.anIntArray32[2], Static19.anIntArray32[0], Static19.anIntArray32[3]);
		} else if (Static248.aClass117_12 != null && Static59.aClass94_3 == Static313.aClass94_8) {
			@Pc(234) int local234 = Static101.aClass137_2.method5111(Static220.anInt3773 + 16, Static134.aClass51Array10, Static114.anInt2044 + 4, local43, Static245.anInt1950, Static393.aRandom1, Static87.anIntArray210);
			Static83.method1220(Static220.anInt3773, Static102.aClass110_3.method2413(local43) + local234, Static114.anInt2044 + 4, 16);
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method1218(@OriginalArg(1) int arg0) {
		Static368.anInt5965 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1219(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static137.method2032("\n", arg0, "%0a"));
	}
}
