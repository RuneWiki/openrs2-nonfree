import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!ica", name = "q", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	public static final int anInt4067 = 1338;

	@OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
	public static int anInt4074 = 0;

	@OriginalMember(owner = "client!ica", name = "J", descriptor = "I")
	public static int anInt4084 = 0;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!wq;)Ljava/lang/String;")
	public static String method3739(@OriginalArg(1) Class5_Sub36 arg0) {
		return Static142.method6600(arg0);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIII)I")
	public static int method3740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg2) {
			return arg2 > arg0 ? arg0 : arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "(I)V")
	public static void method3741() {
		@Pc(15) Class5_Sub36_Sub2 local15 = Static4.aClass389_17.aClass5_Sub36_Sub2_2;
		local15.method7336();
		@Pc(23) int local23 = local15.method7343(8);
		@Pc(28) int local28;
		if (Static438.anInt7239 > local23) {
			for (local28 = local23; local28 < Static438.anInt7239; local28++) {
				Static451.anIntArray436[Static558.anInt8795++] = Static558.anIntArray500[local28];
			}
		}
		if (Static438.anInt7239 < local23) {
			throw new RuntimeException("gnpov1");
		}
		Static438.anInt7239 = 0;
		for (local28 = 0; local28 < local23; local28++) {
			@Pc(73) int local73 = Static558.anIntArray500[local28];
			@Pc(81) Class4_Sub1_Sub1_Sub2_Sub2 local81 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) local73)).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			@Pc(86) int local86 = local15.method7343(1);
			if (local86 == 0) {
				Static558.anIntArray500[Static438.anInt7239++] = local73;
				local81.anInt6827 = Static115.anInt1871;
			} else {
				@Pc(108) int local108 = local15.method7343(2);
				if (local108 == 0) {
					Static558.anIntArray500[Static438.anInt7239++] = local73;
					local81.anInt6827 = Static115.anInt1871;
					Static669.anIntArray619[Static149.anInt2925++] = local73;
				} else {
					@Pc(157) int local157;
					@Pc(167) int local167;
					if (local108 == 1) {
						Static558.anIntArray500[Static438.anInt7239++] = local73;
						local81.anInt6827 = Static115.anInt1871;
						local157 = local15.method7343(3);
						local81.method5944(1, local157);
						local167 = local15.method7343(1);
						if (local167 == 1) {
							Static669.anIntArray619[Static149.anInt2925++] = local73;
						}
					} else if (local108 == 2) {
						Static558.anIntArray500[Static438.anInt7239++] = local73;
						local81.anInt6827 = Static115.anInt1871;
						if (local15.method7343(1) == 1) {
							local157 = local15.method7343(3);
							local81.method5944(2, local157);
							local167 = local15.method7343(3);
							local81.method5944(2, local167);
						} else {
							local157 = local15.method7343(3);
							local81.method5944(0, local157);
						}
						local157 = local15.method7343(1);
						if (local157 == 1) {
							Static669.anIntArray619[Static149.anInt2925++] = local73;
						}
					} else if (local108 == 3) {
						Static451.anIntArray436[Static558.anInt8795++] = local73;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "(I)I")
	public static int method3747(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static165.anInt3244 - 1; local3++) {
			if (arg0 < Static349.anIntArray335[local3] + Static288.anIntArray296[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static165.anInt3244 - 1;
		}
		return local1;
	}
}
