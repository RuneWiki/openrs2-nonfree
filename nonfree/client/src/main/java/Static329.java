import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[B")
	public static final byte[] aByteArray84 = new byte[2048];

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_59 = new Class77(53, 3);

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	public static int anInt6247 = 104;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIZIII)V")
	public static void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class7_Sub6 local10 = (Class7_Sub6) Static259.aClass149_4.method3989(); local10 != null; local10 = (Class7_Sub6) Static259.aClass149_4.method3986()) {
			if (Static409.anInt7683 >= local10.anInt8435) {
				local10.method7760();
			} else {
				Static231.method4126(arg0 >> 1, arg2 >> 1, local10.anInt8437 * 2, (local10.anInt8440 << 7) + 64, (local10.anInt8441 << 7) + 64, local10.anInt8436);
				Static12.aClass80_1.method7772(Static147.anIntArray243[1] + arg1, local10.anInt8434 | 0xFF000000, Static147.anIntArray243[0] + arg3, local10.aString97, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILclient!hv;)Ljava/lang/String;")
	public static String method5245(@OriginalArg(1) Class12_Sub20 arg0) {
		return arg0.aString41 == null || arg0.aString41.length() <= 0 ? arg0.aString40 : arg0.aString40 + Static409.aClass88_222.method2391(Static345.anInt6495) + arg0.aString41;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!jc;")
	public static Class6 method5247(@OriginalArg(1) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class6_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class6) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class6_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!bea;[II[I[I)V")
	public static void method5248(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg1[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg0.aClass288Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass288Array3[local19] = null;
					} else {
						@Pc(37) Class64 local37 = Static47.aClass41_1.method911(local9);
						@Pc(40) int local40 = local37.anInt1972;
						@Pc(45) Class288 local45 = arg0.aClass288Array3[local19];
						if (local45 != null) {
							if (local45.anInt8706 == local9) {
								if (local40 == 0) {
									local45 = arg0.aClass288Array3[local19] = null;
								} else if (local40 == 1) {
									local45.anInt8704 = 1;
									local45.anInt8702 = 0;
									local45.anInt8701 = 0;
									local45.anInt8708 = 0;
									local45.anInt8707 = local17;
									Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, 0, local37, arg0.anInt9418);
								} else if (local40 == 2) {
									local45.anInt8702 = 0;
								}
							} else if (local37.anInt1968 >= Static47.aClass41_1.method911(local45.anInt8706).anInt1968) {
								local45 = arg0.aClass288Array3[local19] = null;
							}
						}
						if (local45 == null) {
							local45 = arg0.aClass288Array3[local19] = new Class288();
							local45.anInt8706 = local9;
							local45.anInt8704 = 1;
							local45.anInt8701 = 0;
							local45.anInt8708 = 0;
							local45.anInt8707 = local17;
							local45.anInt8702 = 0;
							Static349.method5479(arg0.anInt9416, arg0.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == arg0, 0, local37, arg0.anInt9418);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
