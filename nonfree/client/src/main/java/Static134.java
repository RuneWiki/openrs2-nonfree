import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString83 = " is already on your friend list.";

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	public static boolean aBoolean153 = true;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "[I")
	public static int[] anIntArray273 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!im;)Lclient!rh;")
	public static Class68_Sub3 method2294(@OriginalArg(1) Class1_Sub16 arg0) {
		return new Class68_Sub3(arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2645(), arg0.method2634(), arg0.method2634(), arg0.method2655());
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ILclient!ek;[I[I)V")
	public static void method2295(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class25_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(15) int local15 = arg0[local3];
			@Pc(19) int local19 = arg3[local3];
			@Pc(23) int local23 = arg2[local3];
			@Pc(25) int local25 = 0;
			while (local19 != 0 && local25 < arg1.aClass86Array3.length) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg1.aClass86Array3[local25] = null;
					} else {
						@Pc(54) Class163 local54 = Static115.method1895(local15);
						@Pc(57) int local57 = local54.anInt5911;
						@Pc(62) Class86 local62 = arg1.aClass86Array3[local25];
						if (local62 != null) {
							if (local62.anInt3241 == local15) {
								if (local57 == 0) {
									local62 = arg1.aClass86Array3[local25] = null;
								} else if (local57 == 1) {
									local62.anInt3240 = 0;
									local62.anInt3232 = local23;
									local62.anInt3239 = 0;
									local62.anInt3242 = 0;
									local62.anInt3236 = 1;
									Static188.method3369(arg1.anInt1604, local54, 0, arg1.anInt1635, false);
								} else if (local57 == 2) {
									local62.anInt3240 = 0;
								}
							} else if (local54.anInt5905 >= Static115.method1895(local62.anInt3241).anInt5905) {
								local62 = arg1.aClass86Array3[local25] = null;
							}
						}
						if (local62 == null) {
							local62 = arg1.aClass86Array3[local25] = new Class86();
							local62.anInt3240 = 0;
							local62.anInt3236 = 1;
							local62.anInt3241 = local15;
							local62.anInt3232 = local23;
							local62.anInt3239 = 0;
							local62.anInt3242 = 0;
							Static188.method3369(arg1.anInt1604, local54, 0, arg1.anInt1635, false);
						}
					}
				}
				local25++;
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIZ)V")
	public static void method2296(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static163.aLong154 = 0L;
		@Pc(8) int local8 = Static277.method4610();
		if (arg2 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (Static93.aString65.startsWith("mac") && arg2 > 0) {
			arg0 = true;
		}
		@Pc(28) boolean local28 = false;
		if (arg2 > 0 == local8 <= 0) {
			local28 = true;
		}
		if (arg0 && arg2 > 0) {
			local28 = true;
		}
		Static57.method1135(arg1, arg2, local8, arg3, local28, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)Lclient!rg;")
	public static Class1_Sub2_Sub16_Sub2 method2298(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(24) Class1_Sub2_Sub16_Sub2 local24 = new Class1_Sub2_Sub16_Sub2(arg0, Static298.anIntArray623, Static121.anIntArray257, Static166.anIntArray343, Static81.anIntArray204, Static200.aByteArrayArray83);
			Static265.method4490();
			return local24;
		}
	}
}
