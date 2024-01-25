import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!oh", name = "kd", descriptor = "I")
	public static int anInt6690;

	@OriginalMember(owner = "client!oh", name = "dc", descriptor = "Lclient!em;")
	public static final Class86 aClass86_9 = new Class86();

	@OriginalMember(owner = "client!oh", name = "ed", descriptor = "I")
	public static int anInt6684 = 0;

	@OriginalMember(owner = "client!oh", name = "md", descriptor = "Z")
	public static boolean aBoolean473 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
	public static void method5481(@OriginalArg(1) int arg0) {
		if (!Static300.aClass5_Sub28_Sub1_1.aBoolean332) {
			arg0 = -1;
		}
		if (arg0 == Static422.anInt7463) {
			return;
		}
		if (arg0 != -1) {
			@Pc(24) Class235 local24 = Static454.aClass231_2.method5642(arg0);
			@Pc(28) Class96 local28 = local24.method5673();
			if (local28 == null) {
				arg0 = -1;
			} else {
				Static159.aClass9_10.method284(local28.method2428(), local28.method2426(), new Point(local24.anInt6975, local24.anInt6981), Static209.aCanvas6, local28.method2432());
				Static422.anInt7463 = arg0;
			}
		}
		if (arg0 == -1 && Static422.anInt7463 != -1) {
			Static159.aClass9_10.method284(-1, null, new Point(), Static209.aCanvas6, -1);
			Static422.anInt7463 = -1;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!jba;IIIII)V")
	public static void method5487(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5117 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static479.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class250 local35 = Static24.aClass250Array3[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5117; local37++) {
							if (arg0.aClass5_Sub10Array5[local37] == local35.aClass5_Sub10_3) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass5_Sub10Array5[arg0.anInt5117++] = local35.aClass5_Sub10_3;
						if (arg0.anInt5117 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5117; local7 < 4; local7++) {
			arg0.aClass5_Sub10Array5[local7] = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ap;IIII)V")
	public static void method5488(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 | arg2 << 28 | arg1 << 14);
		@Pc(22) Class5_Sub7 local22 = (Class5_Sub7) Static181.aClass42_11.method1109(local16);
		if (local22 == null) {
			local22 = new Class5_Sub7();
			Static181.aClass42_11.method1106(local16, local22);
			local22.aClass99_12.method2513(arg0);
			return;
		}
		@Pc(55) Class22 local55 = Static451.aClass67_2.method2006(arg0.anInt469);
		@Pc(58) int local58 = local55.anInt576;
		if (local55.anInt589 == 1) {
			local58 *= arg0.anInt468 + 1;
		}
		for (@Pc(77) Class5_Sub4 local77 = (Class5_Sub4) local22.aClass99_12.method2526(); local77 != null; local77 = (Class5_Sub4) local22.aClass99_12.method2519()) {
			local55 = Static451.aClass67_2.method2006(local77.anInt469);
			@Pc(88) int local88 = local55.anInt576;
			if (local55.anInt589 == 1) {
				local88 *= local77.anInt468 + 1;
			}
			if (local88 < local58) {
				Static135.method2553(local77, arg0);
				return;
			}
		}
		local22.aClass99_12.method2513(arg0);
	}
}
