import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "[I")
	public static int[] anIntArray452;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public static int anInt6121;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "Lclient!gj;")
	public static Class31 aClass31_123;

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_185 = new Class119(64);

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "Z")
	public static boolean aBoolean545 = true;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
	public static int anInt6124 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!tq;ZLclient!tq;)V")
	public static void method5345(@OriginalArg(0) Class191 arg0, @OriginalArg(2) Class191 arg1) {
		Static217.aClass191_142 = arg1;
		Static187.aClass191_119 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIILclient!tq;)V")
	public static void method5347(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class191 arg2) {
		Static144.aClass191_93 = arg2;
		Static75.aBoolean146 = false;
		Static68.anInt1466 = 10000;
		Static237.anInt4541 = 1;
		Static122.anInt4369 = arg0;
		Static300.anInt5860 = arg1;
		Static10.anInt231 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII)V")
	public static void method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static53.anInt1131; local1++) {
			@Pc(9) Rectangle local9 = Class20_Sub1.aRectangleArray1[local1];
			if (arg2 < local9.x + local9.width && local9.x < arg0 + arg2 && arg3 < local9.height + local9.y && arg3 + arg1 > local9.y) {
				Static135.aBooleanArray12[local1] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V")
	public static void method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static275.aClass8ArrayArrayArray4 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg1 << 14 | arg2 << 28 | arg0);
		@Pc(25) Class2_Sub1 local25 = (Class2_Sub1) Static136.aClass199_12.method5751(local19);
		if (local25 == null) {
			Static85.method1907(arg2, arg0, arg1);
			return;
		}
		@Pc(39) Class2_Sub4 local39 = (Class2_Sub4) local25.aClass216_1.method5992();
		if (local39 == null) {
			Static85.method1907(arg2, arg0, arg1);
			return;
		}
		@Pc(53) Class62_Sub2_Sub1 local53 = (Class62_Sub2_Sub1) Static85.method1907(arg2, arg0, arg1);
		if (local53 == null) {
			local53 = new Class62_Sub2_Sub1();
		} else {
			local53.anInt2533 = local53.anInt2532 = -1;
		}
		local53.anInt2537 = local39.anInt379;
		local53.anInt2536 = local39.anInt380;
		label44: while (true) {
			@Pc(81) Class2_Sub4 local81 = (Class2_Sub4) local25.aClass216_1.method6000();
			if (local81 == null) {
				break;
			}
			if (local53.anInt2537 != local81.anInt379) {
				local53.anInt2541 = local81.anInt380;
				local53.anInt2533 = local81.anInt379;
				while (true) {
					@Pc(102) Class2_Sub4 local102 = (Class2_Sub4) local25.aClass216_1.method6000();
					if (local102 == null) {
						break label44;
					}
					if (local102.anInt379 != local53.anInt2537 && local102.anInt379 != local53.anInt2533) {
						local53.anInt2532 = local102.anInt379;
						local53.anInt2544 = local102.anInt380;
					}
				}
			}
		}
		@Pc(151) int local151 = Static138.method2745(arg2, (arg0 << 7) + 64, (arg1 << 7) + 64);
		Static185.method3332(arg2, arg0, arg1, local151, local53);
	}
}
