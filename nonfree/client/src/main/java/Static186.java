import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "Lclient!ir;")
	public static Class100 aClass100_68;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public static int anInt3094;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	public static int anInt3096;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
	public static int anInt3102 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "([ILclient!kg;I[I[I)V")
	public static void method2537(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5_Sub4_Sub4_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg0[local8];
			@Pc(22) int local22 = arg2[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && arg1.aClass46Array3.length > local24; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg1.aClass46Array3[local24] = null;
					} else {
						@Pc(41) Class131 local41 = Static343.method5604(local14);
						@Pc(44) int local44 = local41.anInt3986;
						@Pc(49) Class46 local49 = arg1.aClass46Array3[local24];
						if (local49 != null) {
							if (local49.anInt1286 == local14) {
								if (local44 == 0) {
									local49 = arg1.aClass46Array3[local24] = null;
								} else if (local44 == 1) {
									local49.anInt1287 = 1;
									local49.anInt1285 = 0;
									local49.anInt1290 = 0;
									local49.anInt1291 = local22;
									local49.anInt1289 = 0;
									Static161.method2570(0, Static349.aClass5_Sub4_Sub4_Sub1_2 == arg1, arg1.anInt5905, local41, arg1.anInt5901);
								} else if (local44 == 2) {
									local49.anInt1289 = 0;
								}
							} else if (local41.anInt3993 >= Static343.method5604(local49.anInt1286).anInt3993) {
								local49 = arg1.aClass46Array3[local24] = null;
							}
						}
						if (local49 == null) {
							local49 = arg1.aClass46Array3[local24] = new Class46();
							local49.anInt1289 = 0;
							local49.anInt1285 = 0;
							local49.anInt1287 = 1;
							local49.anInt1286 = local14;
							local49.anInt1291 = local22;
							local49.anInt1290 = 0;
							Static161.method2570(0, arg1 == Static349.aClass5_Sub4_Sub4_Sub1_2, arg1.anInt5905, local41, arg1.anInt5901);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2538(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static179.method2994("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)V")
	public static void method2540() {
		Static12.aClass198_5.method5236();
		Static15.aClass198_6.method5236();
	}
}
