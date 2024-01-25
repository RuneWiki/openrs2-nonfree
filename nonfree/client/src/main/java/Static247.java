import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!is", name = "O", descriptor = "Lclient!wu;")
	public static Class380 aClass380_64;

	@OriginalMember(owner = "client!is", name = "D", descriptor = "I")
	public static int anInt3970 = 0;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_22 = new Class118(512);

	@OriginalMember(owner = "client!is", name = "M", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_43 = new Class32(4);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method3406(@OriginalArg(0) Class95 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static319.aBoolean356) {
			local7 = Static274.method3801();
			local9 = Static69.method966();
		}
		Static272.method3792(Static467.anInt7465, local9 + Static139.anInt2567, arg0, local7 + Static46.anInt975, Static408.anInt6345);
		Static194.aClass62_22.method5684(local7 + Static46.anInt975 + 3, Static434.aClass271_24.method5972(Static483.anInt7694), local9 + Static139.anInt2567 + 14, -10660793, -1);
		@Pc(58) int local58 = Static507.aClass335_1.method7811() + local7;
		@Pc(65) int local65 = Static507.aClass335_1.method7821() + local9;
		@Pc(74) int local74;
		@Pc(92) int local92;
		if (Static187.aBoolean234) {
			local74 = 0;
			for (@Pc(79) Class2_Sub2_Sub12 local79 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local79 != null; local79 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
				local92 = local9 + Static139.anInt2567 + local74 * 16 + 31;
				if (local79.anInt4924 == 1) {
					Static636.method8571(local92, local7 + Static46.anInt975, -1, Static408.anInt6345, local9 + Static139.anInt2567, (Class2_Sub2_Sub11) local79.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67, Static467.anInt7465, arg0, -256, local58, local65);
				} else {
					Static242.method3398(local7 + Static46.anInt975, local9 + Static139.anInt2567, Static408.anInt6345, Static467.anInt7465, local65, local58, -1, -256, arg0, local79, local92);
				}
				local74++;
			}
			if (Static446.aClass2_Sub2_Sub12_2 != null) {
				Static272.method3792(Static104.anInt1917, Static346.anInt5444, arg0, Static621.anInt9974, Static351.anInt5494);
				Static194.aClass62_22.method5684(Static621.anInt9974 + 3, Static446.aClass2_Sub2_Sub12_2.aString52, Static346.anInt5444 + 14, -10660793, -1);
				local74 = 0;
				for (@Pc(178) Class2_Sub2_Sub11 local178 = (Class2_Sub2_Sub11) Static446.aClass2_Sub2_Sub12_2.aClass75_9.method1573(); local178 != null; local178 = (Class2_Sub2_Sub11) Static446.aClass2_Sub2_Sub12_2.aClass75_9.method1568()) {
					@Pc(188) int local188 = local74 * 16 + Static346.anInt5444 + 31;
					local74++;
					Static636.method8571(local188, Static621.anInt9974, -1, Static351.anInt5494, Static346.anInt5444, local178, Static104.anInt1917, arg0, -256, local58, local65);
				}
				Static594.method8048(Static346.anInt5444, Static621.anInt9974, Static104.anInt1917, Static351.anInt5494);
			}
		} else {
			local74 = 0;
			for (@Pc(225) Class2_Sub2_Sub11 local225 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local225 != null; local225 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
				local92 = (Static474.anInt7600 - local74 - 1) * 16 + local9 + Static139.anInt2567 + 31;
				Static636.method8571(local92, Static46.anInt975 + local7, -1, Static408.anInt6345, Static139.anInt2567 + local9, local225, Static467.anInt7465, arg0, -256, local58, local65);
				local74++;
			}
		}
		Static594.method8048(Static139.anInt2567 + local9, Static46.anInt975 + local7, Static467.anInt7465, Static408.anInt6345);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method3407(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static314.aClass76Array2 != Static313.aClass76Array1) {
			@Pc(12) int local12 = Static462.aClass76Array3[arg1].method7398(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class76 local19 = Static462.aClass76Array3[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7398(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7397(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!is", name = "i", descriptor = "(I)V")
	public static void method3408() {
		Static206.aClass61Array7 = null;
		Static4.aClass61Array1 = null;
		Static505.aClass62_21 = null;
		Static22.aClass61Array2 = null;
		Static83.aClass61_3 = null;
		Static194.aClass62_22 = null;
		Static607.aClass61Array15 = null;
		Static611.aClass61Array16 = null;
		Static236.aClass61Array9 = null;
		Static401.aClass61Array12 = null;
		Static139.aClass62_7 = null;
		Static535.aClass61Array13 = null;
		Static366.aClass61Array11 = null;
		Static205.aClass61_19 = null;
		Static364.aClass61Array10 = null;
		Static176.aClass61Array5 = null;
		Static564.aClass61Array14 = null;
		Static179.aClass61Array8 = null;
	}
}
