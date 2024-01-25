import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
	public static int anInt6292 = -1;

	@OriginalMember(owner = "client!nca", name = "J", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_72 = new Class181(19, 8);

	@OriginalMember(owner = "client!nca", name = "L", descriptor = "Lclient!tf;")
	public static final Class6_Sub44 aClass6_Sub44_2 = new Class6_Sub44(0, -1);

	@OriginalMember(owner = "client!nca", name = "M", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[4];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZIIII)V")
	public static void method5354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(4, arg3);
		local8.method3826();
		local8.anInt4403 = arg0;
		local8.anInt4405 = arg1;
		local8.anInt4399 = arg2;
	}

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "(I)V")
	public static void method5355() {
		Static345.aClass6_Sub26_Sub2_1.method5002();
		@Pc(13) int local13 = Static345.aClass6_Sub26_Sub2_1.method5008(8);
		@Pc(22) int local22;
		if (Static208.anInt4409 > local13) {
			for (local22 = local13; local22 < Static208.anInt4409; local22++) {
				Static426.anIntArray565[Static421.anInt7828++] = Static70.anIntArray111[local22];
			}
		}
		if (Static208.anInt4409 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static208.anInt4409 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static70.anIntArray111[local22];
			@Pc(72) Class11_Sub1_Sub1_Sub1 local72 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) local64)).aClass11_Sub1_Sub1_Sub1_2;
			@Pc(77) int local77 = Static345.aClass6_Sub26_Sub2_1.method5008(1);
			if (local77 == 0) {
				Static70.anIntArray111[Static208.anInt4409++] = local64;
				local72.anInt7354 = Static508.anInt8998;
			} else {
				@Pc(100) int local100 = Static345.aClass6_Sub26_Sub2_1.method5008(2);
				if (local100 == 0) {
					Static70.anIntArray111[Static208.anInt4409++] = local64;
					local72.anInt7354 = Static508.anInt8998;
					Static388.anIntArray510[Static561.anInt2408++] = local64;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local100 == 1) {
						Static70.anIntArray111[Static208.anInt4409++] = local64;
						local72.anInt7354 = Static508.anInt8998;
						local145 = Static345.aClass6_Sub26_Sub2_1.method5008(3);
						local72.method615(1, local145);
						local155 = Static345.aClass6_Sub26_Sub2_1.method5008(1);
						if (local155 == 1) {
							Static388.anIntArray510[Static561.anInt2408++] = local64;
						}
					} else if (local100 == 2) {
						Static70.anIntArray111[Static208.anInt4409++] = local64;
						local72.anInt7354 = Static508.anInt8998;
						if (Static345.aClass6_Sub26_Sub2_1.method5008(1) == 1) {
							local145 = Static345.aClass6_Sub26_Sub2_1.method5008(3);
							local72.method615(2, local145);
							local155 = Static345.aClass6_Sub26_Sub2_1.method5008(3);
							local72.method615(2, local155);
						} else {
							local145 = Static345.aClass6_Sub26_Sub2_1.method5008(3);
							local72.method615(0, local145);
						}
						local145 = Static345.aClass6_Sub26_Sub2_1.method5008(1);
						if (local145 == 1) {
							Static388.anIntArray510[Static561.anInt2408++] = local64;
						}
					} else if (local100 == 3) {
						Static426.anIntArray565[Static421.anInt7828++] = local64;
					}
				}
			}
		}
	}
}
