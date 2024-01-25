import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_115 = new Class341(1, 8);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!gga;Z)V")
	public static void method9744(@OriginalArg(0) Class124 arg0) {
		Static307.anInt5549 = arg0.method3638("p11_full");
		Static366.anInt6933 = arg0.method3638("p12_full");
		Static473.anInt8441 = arg0.method3638("b12_full");
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!nfa;IIIII)V")
	public static void method9746(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static60.anInt1169) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static585.anInt10170) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static202.anInt4238 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class291 local62 = Static193.aClass291ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static245.aClass18Array14[local17].method8537(local32, local23) + Static245.aClass18Array14[local17].method8537(local32, local23 + 1) + Static245.aClass18Array14[local17].method8537(local32 + 1, local23) + Static245.aClass18Array14[local17].method8537(local32 + 1, local23 + 1)) / 4 - (Static245.aClass18Array14[arg1].method8537(arg3, arg2) + Static245.aClass18Array14[arg1].method8537(arg3, arg2 + 1) + Static245.aClass18Array14[arg1].method8537(arg3 + 1, arg2) + Static245.aClass18Array14[arg1].method8537(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class15_Sub3_Sub4 local151 = local62.aClass15_Sub3_Sub4_1;
									@Pc(154) Class15_Sub3_Sub4 local154 = local62.aClass15_Sub3_Sub4_2;
									if (local151 != null && local151.method9439()) {
										arg0.method9426((local23 - arg2) * Static536.anInt4502 + (1 - arg4) * Static124.anInt2431, (local32 - arg3) * Static536.anInt4502 + (1 - arg5) * Static124.anInt2431, Static64.aClass101_1, local151, local1, local148);
									}
									if (local154 != null && local154.method9439()) {
										arg0.method9426((local23 - arg2) * Static536.anInt4502 + (1 - arg4) * Static124.anInt2431, (local32 - arg3) * Static536.anInt4502 + (1 - arg5) * Static124.anInt2431, Static64.aClass101_1, local154, local1, local148);
									}
									for (@Pc(227) Class27 local227 = local62.aClass27_3; local227 != null; local227 = local227.aClass27_1) {
										@Pc(231) Class15_Sub3_Sub3 local231 = local227.aClass15_Sub3_Sub3_1;
										if (local231 != null && local231.method9439() && (local23 == local231.aShort62 || local23 == local3) && (local32 == local231.aShort64 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort63 + 1 - local231.aShort62;
											@Pc(268) int local268 = local231.aShort65 + 1 - local231.aShort64;
											arg0.method9426((local231.aShort62 - arg2) * Static536.anInt4502 + (local260 - arg4) * Static124.anInt2431, (local231.aShort64 - arg3) * Static536.anInt4502 + (local268 - arg5) * Static124.anInt2431, Static64.aClass101_1, local231, local1, local148);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
