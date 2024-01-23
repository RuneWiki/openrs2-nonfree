import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!wf", name = "S", descriptor = "[I")
	public static int[] anIntArray627;

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "[I")
	public static int[] anIntArray628;

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray43;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
	public static void method4968() {
		Static293.anInt5842 = 0;
		@Pc(19) int local19 = (Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7) + Static101.anInt1844;
		@Pc(26) int local26 = Static43.anInt798 + (Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7);
		if (local19 >= 3053 && local19 <= 3156 && local26 >= 3056 && local26 <= 3136) {
			Static293.anInt5842 = 1;
		}
		if (local19 >= 3072 && local19 <= 3118 && local26 >= 9492 && local26 <= 9535) {
			Static293.anInt5842 = 1;
		}
		if (Static293.anInt5842 == 1 && local19 >= 3139 && local19 <= 3199 && local26 >= 3008 && local26 <= 3062) {
			Static293.anInt5842 = 0;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V")
	public static void method4969(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static289.aBoolean414) {
			Static289.aBoolean414 = arg0;
			Static18.method301();
		}
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)[Lclient!t;")
	public static Class165[] method4970() {
		if (Static140.aClass165Array1 == null) {
			@Pc(19) Class165[] local19 = Static3.method47(Static274.aClass176_4);
			@Pc(23) Class165[] local23 = new Class165[local19.length];
			@Pc(25) int local25 = 0;
			label53: for (@Pc(27) int local27 = 0; local27 < local19.length; local27++) {
				@Pc(35) Class165 local35 = local19[local27];
				if ((local35.anInt5352 <= 0 || local35.anInt5352 >= 24) && local35.anInt5349 >= 800 && local35.anInt5350 >= 600) {
					for (@Pc(59) int local59 = 0; local59 < local25; local59++) {
						@Pc(66) Class165 local66 = local23[local59];
						if (local66.anInt5349 == local35.anInt5349 && local66.anInt5350 == local35.anInt5350) {
							if (local66.anInt5352 < local35.anInt5352) {
								local23[local59] = local35;
							}
							continue label53;
						}
					}
					local23[local25] = local35;
					local25++;
				}
			}
			Static140.aClass165Array1 = new Class165[local25];
			Static326.method4272(local23, 0, Static140.aClass165Array1, 0, local25);
			@Pc(120) int[] local120 = new int[Static140.aClass165Array1.length];
			for (@Pc(122) int local122 = 0; local122 < Static140.aClass165Array1.length; local122++) {
				@Pc(130) Class165 local130 = Static140.aClass165Array1[local122];
				local120[local122] = local130.anInt5349 * local130.anInt5350;
			}
			Static124.method2079(local120, Static140.aClass165Array1);
		}
		return Static140.aClass165Array1;
	}
}
