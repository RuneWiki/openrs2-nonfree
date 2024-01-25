import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "Lclient!wu;")
	public static Class384 aClass384_86;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Z")
	public static boolean aBoolean492 = true;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!rt;")
	public static final Class150 aClass150_1 = Static221.method3411();

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method5249() {
		@Pc(9) int local9;
		if (Static218.aClass4Array2 != null) {
			for (local9 = 0; local9 < Static541.anInt8998; local9++) {
				Static218.aClass4Array2[local9] = null;
			}
			Static218.aClass4Array2 = null;
		}
		if (Static311.aClass4Array4 != null) {
			for (local9 = 0; local9 < Static278.anInt4554; local9++) {
				Static311.aClass4Array4[local9] = null;
			}
			Static311.aClass4Array4 = null;
		}
		if (Static232.aClass4Array3 != null) {
			for (local9 = 0; local9 < Static156.anInt2751; local9++) {
				Static232.aClass4Array3[local9] = null;
			}
			Static232.aClass4Array3 = null;
		}
		Static195.aClass4Array1 = null;
		Static174.anIntArray272 = null;
		Static471.anIntArrayArrayArray11 = null;
		Static106.anInt1658 = -1;
		Static536.anInt8903 = -1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method5250(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static299.aClass40Array1 != Static327.aClass40Array2) {
			@Pc(12) int local12 = Static492.aClass40Array3[arg1].method8447(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class40 local19 = Static492.aClass40Array3[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8447(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8440(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[[F[[S)[[S")
	public static short[][] method5251(@OriginalArg(1) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < arg1[local8].length; local12++) {
				arg1[local8][local12] = (short) (int) (arg0[local8][local12] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
	public static void method5253() {
		if (Static262.anInt4377 < 0) {
			return;
		}
		@Pc(17) long local17 = Static205.method3179();
		Static262.anInt4377 = (int) ((long) Static262.anInt4377 + Static447.aLong212 - local17);
		if (Static262.anInt4377 > 0) {
			@Pc(37) int local37 = (Static262.anInt4377 << 8) / Static580.anInt10244;
			@Pc(41) int local41 = 255 - local37;
			@Pc(46) float local46 = (float) local37 / 255.0F;
			@Pc(50) float local50 = 1.0F - local46;
			Static186.anInt3362 = ((Static526.anInt8775 & 0xFF00) * local37 + (Static323.aClass248_2.anInt6766 & 0xFF00) * local41 & 0xFF0000) + (local41 * (Static323.aClass248_2.anInt6766 & 0xFF00FF) + (Static526.anInt8775 & 0xFF00FF) * local37 & 0xFF00FF00) >>> 8;
			Static591.aFloat198 = local50 * (Static323.aClass248_2.aFloat139 - Static183.aFloat41) + Static183.aFloat41;
			Static618.aFloat202 = (Static323.aClass248_2.aFloat137 - Static287.aFloat69) * local50 + Static287.aFloat69;
			Static637.aFloat205 = Static390.aFloat142 + (Static323.aClass248_2.aFloat138 - Static390.aFloat142) * local50;
			Static375.anInt6599 = (local37 * (Static48.anInt751 & 0xFF00) + (Static323.aClass248_2.anInt6774 & 0xFF00) * local41 & 0xFF0000) + ((Static323.aClass248_2.anInt6774 & 0xFF00FF) * local41 + local37 * (Static48.anInt751 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static528.aFloat190 = (Static323.aClass248_2.aFloat141 - Static360.aFloat133) * local50 + Static360.aFloat133;
			Static91.anInt1475 = local37 * Static286.anInt9323 + Static323.aClass248_2.anInt6765 * local41 >> 8;
			Static252.aFloat61 = local50 * (Static323.aClass248_2.aFloat136 - Static320.aFloat111) + Static320.aFloat111;
			Static13.aFloat5 = Static563.aFloat194 + local50 * (Static323.aClass248_2.aFloat140 - Static563.aFloat194);
			if (Static88.aClass91_1 != Static323.aClass248_2.aClass91_3) {
				Static339.aClass91_2 = Static540.aClass126_21.method7003(Static88.aClass91_1, Static323.aClass248_2.aClass91_3, local50, Static339.aClass91_2);
			}
		} else {
			Static262.anInt4377 = -1;
			Static375.anInt6599 = Static323.aClass248_2.anInt6774;
			Static13.aFloat5 = Static323.aClass248_2.aFloat140;
			Static339.aClass91_2 = Static323.aClass248_2.aClass91_3;
			Static637.aFloat205 = Static323.aClass248_2.aFloat138;
			Static91.anInt1475 = Static323.aClass248_2.anInt6765;
			Static591.aFloat198 = Static323.aClass248_2.aFloat139;
			Static252.aFloat61 = Static323.aClass248_2.aFloat136;
			Static618.aFloat202 = Static323.aClass248_2.aFloat137;
			Static528.aFloat190 = Static323.aClass248_2.aFloat141;
			Static186.anInt3362 = Static323.aClass248_2.anInt6766;
		}
		Static447.aLong212 = local17;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public static void method5254() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static274.aBooleanArray60[local7] = false;
		}
		Static229.anInt3965 = -1;
		Static454.anInt7639 = Static218.anInt3744;
		Static467.anInt7868 = -1;
		Static18.anInt422 = Static235.anInt3998;
		Static315.anInt5510 = 0;
		Static58.anInt927 = Static216.anInt3726;
		Static609.anInt9978 = -1;
		Static394.anInt6873 = -1;
		Static408.anInt7026 = Static70.anInt9231;
		Static584.anInt9543 = 5;
		Static606.anInt9947 = Static608.anInt9971;
		Static87.anInt1434 = 0;
		Static290.anInt4705 = Static646.anInt10445;
	}
}
