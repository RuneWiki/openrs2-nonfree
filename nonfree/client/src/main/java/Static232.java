import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "Lclient!ue;")
	public static Class196 aClass196_5;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_77 = new Class70(16);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!vj;IILclient!cj;Ljava/awt/Canvas;I)Lclient!ja;")
	public static Class81 method4110(@OriginalArg(0) Class206 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Class local6 = Class.forName("Class81_Sub1");
			@Pc(57) Constructor local57 = local6.getConstructor(Canvas.class, cj.class, Integer.TYPE, Integer.TYPE, vj.class);
			return (Class81) local57.newInstance(arg3, arg2, Integer.valueOf(arg4), new Integer(arg1), arg0);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BB)V")
	public static void method4111(@OriginalArg(1) byte arg0) {
		if (Static37.aByteArrayArrayArray2 == null) {
			Static37.aByteArrayArrayArray2 = new byte[4][Static153.anInt2883][Static246.anInt4606];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static153.anInt2883; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static246.anInt4606; local22++) {
					Static37.aByteArrayArrayArray2[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
	public static void method4112(@OriginalArg(1) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(19) byte local19;
		@Pc(17) byte[][] local17;
		if (arg0) {
			local19 = 1;
			local17 = Static308.aByteArrayArray18;
		} else {
			local17 = Static303.aByteArrayArray17;
			local19 = 4;
		}
		for (@Pc(27) int local27 = 0; local27 < local19; local27++) {
			Static24.method359();
			for (@Pc(32) int local32 = 0; local32 < Static153.anInt2883 >> 3; local32++) {
				for (@Pc(36) int local36 = 0; local36 < Static246.anInt4606 >> 3; local36++) {
					@Pc(40) boolean local40 = false;
					@Pc(48) int local48 = Static176.anIntArrayArrayArray5[local27][local32][local36];
					if (local48 != -1) {
						@Pc(58) int local58 = local48 >> 24 & 0x3;
						if (!arg0 || local58 == 0) {
							@Pc(68) int local68 = local48 >> 1 & 0x3;
							@Pc(74) int local74 = local48 >> 14 & 0x3FF;
							@Pc(80) int local80 = local48 >> 3 & 0x7FF;
							@Pc(91) int local91 = (local74 / 8 << 8) + (local80 / 8);
							for (@Pc(93) int local93 = 0; local93 < Static303.anIntArray647.length; local93++) {
								if (Static303.anIntArray647[local93] == local91 && local17[local93] != null) {
									@Pc(124) int[] local124 = Static213.method3829(Static289.aClass81_7, local32 * 8, local68, arg0, local74, local58, local80, local27, Static334.aClass27Array1, local36 * 8, local17[local93]);
									if (local7 == null && local124 != null) {
										local7 = local124;
									}
									local40 = true;
									break;
								}
							}
						}
					}
					if (!local40) {
						Static106.method2159(local32 * 8, 8, local27, 8, local36 * 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static309.aClass125_1 = null;
		} else {
			Static309.aClass125_1 = Static214.method3835(local7[0], local7[1], local7[2], local7[3]);
			Static177.anInt3319 = local7[4];
		}
	}
}
