import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!maa", name = "t", descriptor = "[Lclient!cu;")
	public static Class62[] aClass62Array2;

	@OriginalMember(owner = "client!maa", name = "u", descriptor = "I")
	public static int anInt6000 = 0;

	@OriginalMember(owner = "client!maa", name = "v", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!maa", name = "z", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!maa", name = "c", descriptor = "(II)Z")
	public static boolean method5178(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 16 || arg0 == 5 || arg0 == 18 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "(I)V")
	public static void method5181() {
		@Pc(1) Class69 local1 = Static248.aClass69_25;
		synchronized (Static248.aClass69_25) {
			Static248.aClass69_25.method1905();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!cc;[I[I[I)V")
	public static void method5182(@OriginalArg(1) Class16_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg3[local11];
			@Pc(25) int local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg0.aClass148Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg0.aClass148Array3[local27] = null;
					} else {
						@Pc(45) Class228 local45 = Static479.aClass308_2.method7075(local17);
						@Pc(48) int local48 = local45.anInt6220;
						@Pc(53) Class148 local53 = arg0.aClass148Array3[local27];
						if (local53 != null) {
							if (local53.anInt4066 == local17) {
								if (local48 == 0) {
									local53 = arg0.aClass148Array3[local27] = null;
								} else if (local48 == 1) {
									local53.anInt4072 = 0;
									local53.anInt4069 = local25;
									local53.anInt4065 = 1;
									local53.anInt4067 = 0;
									local53.anInt4062 = 0;
									if (!arg0.aBoolean587) {
										Static145.method2602(0, arg0, local45);
									}
								} else if (local48 == 2) {
									local53.anInt4062 = 0;
								}
							} else if (local45.anInt6227 >= Static479.aClass308_2.method7075(local53.anInt4066).anInt6227) {
								local53 = arg0.aClass148Array3[local27] = null;
							}
						}
						if (local53 == null) {
							local53 = arg0.aClass148Array3[local27] = new Class148();
							local53.anInt4067 = 0;
							local53.anInt4072 = 0;
							local53.anInt4069 = local25;
							local53.anInt4062 = 0;
							local53.anInt4065 = 1;
							local53.anInt4066 = local17;
							if (!arg0.aBoolean587) {
								Static145.method2602(0, arg0, local45);
							}
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}
}
