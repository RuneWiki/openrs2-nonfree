import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "Lclient!ah;")
	public static Class6 aClass6_6;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)I")
	public static int method3104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!nm;ILclient!nm;)V")
	public static void method3105(@OriginalArg(0) Class119 arg0, @OriginalArg(2) Class119 arg1) {
		Static299.aClass119_92 = arg0;
		Static125.aClass119_47 = arg1;
		Static299.aClass119_92.method3217(34);
		@Pc(19) int local19 = (int) (Math.random() * 21.0D) - 10;
		@Pc(26) int local26 = (int) (Math.random() * 21.0D) - 10;
		@Pc(33) int local33 = (int) (Math.random() * 41.0D) - 20;
		@Pc(40) int local40 = (int) (Math.random() * 21.0D) - 10;
		Static112.anInt5358 = local19 + local33;
		Static135.anInt2658 = local26 + local33;
		Static90.anInt1907 = local40 + local33;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method3106() {
		Static280.aClass1_Sub5_Sub18_6 = null;
		Static24.aClass1_Sub5_Sub18_1 = null;
		Static42.aClass1_Sub5_Sub18_3 = null;
		Static34.aClass1_Sub5_Sub18_2 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!nm;IIB)[Lclient!lj;")
	public static Class1_Sub5_Sub6[] method3107(@OriginalArg(0) Class119 arg0, @OriginalArg(2) int arg1) {
		return Static114.method2083(arg1, arg0, 0) ? Static63.method1128() : null;
	}
}
