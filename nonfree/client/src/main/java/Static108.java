import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "Lclient!vt;")
	public static Class263 aClass263_1;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
	public static int anInt2167 = 64;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!mn;")
	public static final Class167 aClass167_11 = new Class167(8);

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Z")
	public static volatile boolean aBoolean137 = true;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_43 = new Class27(25, -1);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1892(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static60.anInt7169 >= 100 && !Static314.aBoolean360 || Static60.anInt7169 >= 200) {
			Static404.method5326(Static38.aClass182_32.method4155(Static191.anInt3842));
			return;
		}
		@Pc(29) String local29 = Static179.method2957(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(34) int local34 = 0; local34 < Static60.anInt7169; local34++) {
			@Pc(44) String local44 = Static179.method2957(Static325.aStringArray36[local34]);
			if (local44 != null && local44.equals(local29)) {
				Static404.method5326(arg0 + Static98.aClass182_76.method4155(Static191.anInt3842));
				return;
			}
			if (Static347.aStringArray40[local34] != null) {
				local74 = Static179.method2957(Static347.aStringArray40[local34]);
				if (local74 != null && local74.equals(local29)) {
					Static404.method5326(arg0 + Static98.aClass182_76.method4155(Static191.anInt3842));
					return;
				}
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static107.anInt2161; local109++) {
			local74 = Static179.method2957(Static369.aStringArray44[local109]);
			if (local74 != null && local74.equals(local29)) {
				Static404.method5326(Static88.aClass182_236.method4155(Static191.anInt3842) + arg0 + Static42.aClass182_35.method4155(Static191.anInt3842));
				return;
			}
			if (Static99.aStringArray17[local109] != null) {
				@Pc(156) String local156 = Static179.method2957(Static99.aStringArray17[local109]);
				if (local156 != null && local156.equals(local29)) {
					Static404.method5326(Static88.aClass182_236.method4155(Static191.anInt3842) + arg0 + Static42.aClass182_35.method4155(Static191.anInt3842));
					return;
				}
			}
		}
		if (Static179.method2957(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58).equals(local29)) {
			Static404.method5326(Static279.aClass182_172.method4155(Static191.anInt3842));
		} else {
			Static310.method4308(Static274.aClass27_77);
			Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(arg0));
			Static337.aClass10_Sub8_Sub2_2.method2465(arg0);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(15) int local15 = arg0;
			arg0 = arg2;
			arg2 = local15;
		}
		@Pc(23) int local23 = arg4 & 0x3;
		if (local23 == 0) {
			return arg3;
		} else if (local23 == 1) {
			return 1 + 7 - arg0 - arg5;
		} else if (local23 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg5;
		}
	}
}
