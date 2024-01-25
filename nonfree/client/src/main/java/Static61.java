import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cu", name = "T", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_43 = new Class131(29, -1);

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "(I)V")
	public static void method1095() {
		if (Static216.aBoolean272) {
			return;
		}
		Static216.aBoolean272 = true;
		Static255.aBoolean311 = true;
		if (Static389.aClass128_Sub1_1.aBoolean233) {
			Static144.aFloat36 = (int) Static144.aFloat36 - 17 & 0xFFFFFFF0;
		} else {
			Static8.aFloat3 += (-12.0F - Static8.aFloat3) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!dm;)V")
	public static void method1096(@OriginalArg(1) Class1_Sub7 arg0) {
		arg0.aBoolean486 = false;
		if (arg0.aClass1_Sub32_5 != null) {
			arg0.aClass1_Sub32_5.anInt4939 = 0;
		}
		for (@Pc(23) Class1_Sub7 local23 = arg0.method5930(); local23 != null; local23 = arg0.method5932()) {
			method1096(local23);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1098(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (arg0.charAt(local12) - local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BILclient!pk;ILclient!qa;I)V")
	public static void method1099(@OriginalArg(1) int arg0, @OriginalArg(2) Class182 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class109 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class158 local9 = Static231.aClass126_3.method2905(arg1.anInt5491);
		if (local9.anInt4566 == -1) {
			return;
		}
		if (arg1.aBoolean351) {
			@Pc(27) int local27 = arg2 + arg1.anInt5498;
			arg2 = local27 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(43) Class80 local43 = local9.method3737(arg3, arg1.aBoolean350, arg2);
		if (local43 == null) {
			return;
		}
		@Pc(49) int local49 = arg1.anInt5486;
		@Pc(52) int local52 = arg1.anInt5487;
		if ((arg2 & 0x1) == 1) {
			local49 = arg1.anInt5487;
			local52 = arg1.anInt5486;
		}
		@Pc(66) int local66 = local43.ja();
		@Pc(69) int local69 = local43.JA();
		if (local9.aBoolean310) {
			local66 = local49 * 4;
			local69 = local52 * 4;
		}
		if (local9.anInt4565 == 0) {
			local43.method6093(arg0, arg4 + 4 - local52 * 4, local66, local69);
		} else {
			local43.M(arg0, arg4 + 4 - local52 * 4, local66, local69, 0, local9.anInt4565 | 0xFF000000, 1);
		}
	}
}
