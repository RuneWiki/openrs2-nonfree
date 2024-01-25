import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!ii;")
	public static Class144 aClass144_1;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_236 = new Class123(34, -2);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BBIIII)Z")
	public static boolean method5724(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class3_Sub26 local20 = new Class3_Sub26(arg0);
		@Pc(22) int local22 = -1;
		label68: while (true) {
			@Pc(26) int local26 = local20.method6804();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(103) Class194 local103;
				do {
					@Pc(73) int local73;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local20.method6832();
										if (local42 == 0) {
											continue label68;
										}
										local20.method6814();
									}
									local42 = local20.method6832();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local20.method6814() >> 2;
									local73 = arg2 + local63;
									local77 = arg4 + local57;
								} while (local73 <= 0);
							} while (local77 <= 0);
						} while (local73 >= arg3 - 1);
					} while (arg1 - 1 <= local77);
					local103 = Static536.aClass146_4.method3721(local22);
				} while (local69 == 22 && !Static348.aClass3_Sub51_Sub1_5.aBoolean682 && local103.anInt5831 == 0 && local103.anInt5839 != 1 && !local103.aBoolean396);
				local36 = true;
				if (!local103.method4703()) {
					local15 = false;
					Static218.anInt8725++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	public static void method5725(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static79.anInt2118 != -1) {
				Static530.method7269(Static79.anInt2118);
			}
			for (@Pc(14) Class3_Sub49 local14 = (Class3_Sub49) Static204.aClass297_16.method6529(); local14 != null; local14 = (Class3_Sub49) Static204.aClass297_16.method6532()) {
				if (!local14.method8129()) {
					local14 = (Class3_Sub49) Static204.aClass297_16.method6529();
					if (local14 == null) {
						break;
					}
				}
				Static46.method1171(true, false, local14);
			}
			Static79.anInt2118 = -1;
			Static204.aClass297_16 = new Class297(8);
			Static50.method1227();
			Static79.anInt2118 = Static472.anInt8218;
			Static542.method7422(false);
			Static246.method3899();
			Static583.method7926(Static79.anInt2118);
		}
		Static262.aBoolean331 = true;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method5726() {
		Static196.aClass31_8.ra(((float) Static348.aClass3_Sub51_Sub1_5.anInt9950 * 0.1F + 0.7F) * Static108.aFloat133);
		Static196.aClass31_8.VA(Static121.anInt2823, Static271.aFloat123, Static471.aFloat174, (float) (Static222.anInt4596 << 2), (float) (Static9.anInt82 << 2), (float) (Static462.anInt8079 << 2));
		Static196.aClass31_8.method8068(Static111.aClass47_1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5727(@OriginalArg(1) String arg0) {
		return Static536.method7339(10, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method5728() {
		return Static289.aBoolean370 || Static330.aClass3_Sub13_2 == null ? "" : Static330.aClass3_Sub13_2.aString44;
	}
}
