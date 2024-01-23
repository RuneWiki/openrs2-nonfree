import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!i;")
	public static Class73 aClass73_2;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public static int anInt2664;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public static int anInt2661 = 50;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString92 = "Loaded world list data";

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Z")
	public static boolean aBoolean186 = true;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
	public static int[] anIntArray325 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "[I")
	public static int[] anIntArray327 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
	public static int[] anIntArray328 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
	public static int[] anIntArray329 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
	public static int[] anIntArray330 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11 = new String[anInt2661];

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
	public static int[] anIntArray331 = new int[2048];

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "[I")
	public static int[] anIntArray332 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "[I")
	public static int[] anIntArray333 = new int[anInt2661];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ak;IIILclient!ak;)Lclient!kh;")
	public static Class1_Sub2_Sub12 method2250(@OriginalArg(0) Class7 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class7 arg2) {
		return Static139.method2193(arg0, arg1, 0) ? Static44.method813(arg2.method253(0, arg1)) : null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!qm;I[I[I[I)V")
	public static void method2251(@OriginalArg(0) Class6_Sub6_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(19) int local19 = arg3[local7];
			@Pc(23) int local23 = arg2[local7];
			@Pc(27) int local27 = arg1[local7];
			@Pc(29) int local29 = 0;
			while (local27 != 0 && arg0.aClass160Array3.length > local29) {
				if ((local27 & 0x1) != 0) {
					if (local19 == -1) {
						arg0.aClass160Array3[local29] = null;
					} else {
						@Pc(60) Class133 local60 = Static262.method4031(local19);
						@Pc(63) int local63 = local60.anInt4021;
						@Pc(68) Class160 local68 = arg0.aClass160Array3[local29];
						if (local68 != null) {
							if (local68.anInt5254 == local19) {
								if (local63 == 0) {
									local68 = arg0.aClass160Array3[local29] = null;
								} else if (local63 == 1) {
									local68.anInt5252 = 0;
									local68.anInt5257 = 0;
									local68.anInt5253 = 1;
									local68.anInt5250 = 0;
									local68.anInt5251 = local23;
									Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == arg0, local60, arg0.anInt4569, 0, arg0.anInt4562);
								} else if (local63 == 2) {
									local68.anInt5252 = 0;
								}
							} else if (local60.anInt4013 >= Static262.method4031(local68.anInt5254).anInt4013) {
								local68 = arg0.aClass160Array3[local29] = null;
							}
						}
						if (local68 == null) {
							local68 = arg0.aClass160Array3[local29] = new Class160();
							local68.anInt5253 = 1;
							local68.anInt5251 = local23;
							local68.anInt5250 = 0;
							local68.anInt5252 = 0;
							local68.anInt5254 = local19;
							local68.anInt5257 = 0;
							Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == arg0, local60, arg0.anInt4569, 0, arg0.anInt4562);
						}
					}
				}
				local29++;
				local27 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2252(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
