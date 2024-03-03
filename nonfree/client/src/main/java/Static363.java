import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Lclient!r;")
	public static Class197 aClass197_66;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIII)V", line = 17)
	public static void method4488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 + 1;
		Static94.method2165(arg1, Static332.anIntArrayArray58[arg2], arg4, arg0);
		@Pc(18) int local18 = arg3 - 1;
		Static94.method2165(arg1, Static332.anIntArrayArray58[arg3], arg4, arg0);
		for (@Pc(29) int local29 = local9; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static332.anIntArrayArray58[local29];
			local35[arg0] = local35[arg1] = arg4;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/String;IIIZJIIZZLjava/lang/String;)V", line = 60)
	public static void method4489(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class2_Sub4 local28 = new Class2_Sub4(128);
		local28.method4843(10);
		local28.method4844((arg7 ? 4 : 0) | (arg8 ? 2 : 0) | (arg3 ? 1 : 0));
		local28.method4833(arg4);
		local28.method4814(local8[0]);
		local28.method4823(arg0);
		local28.method4814(local8[1]);
		local28.method4844(Class116.anInt3145);
		local28.method4843(arg1);
		local28.method4843(arg6);
		local28.method4814(local8[2]);
		local28.method4844(arg5);
		local28.method4844(arg2);
		local28.method4814(local8[3]);
		local28.method4835(Class2_Sub35.aBigInteger2, Class135.aBigInteger1);
		@Pc(118) Class2_Sub4 local118 = new Class2_Sub4(350);
		local118.method4823(arg9);
		@Pc(131) int local131 = 8 - Static26.method872(arg9) % 8;
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			local118.method4843((int) (Math.random() * 255.0D));
		}
		local118.method4863(local8);
		Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
		Class14.aClass2_Sub4_Sub2_4.method4843(Class2_Sub2_Sub3.aClass242_8.anInt7025);
		Class14.aClass2_Sub4_Sub2_4.method4844(local28.anInt5289 + local118.anInt5289 + 2);
		Class14.aClass2_Sub4_Sub2_4.method4844(578);
		Class14.aClass2_Sub4_Sub2_4.method4858(local28.aByteArray73, local28.anInt5289);
		Class14.aClass2_Sub4_Sub2_4.method4858(local118.aByteArray73, local118.anInt5289);
		Class2_Sub3_Sub15.anInt2649 = 1;
		Class2_Sub3_Sub9.anInt1623 = 0;
		Class213.anInt5956 = -3;
		Class219.anInt6097 = 0;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 231)
	public static void method4491() {
		Static263.method4922();
		Static61.aClass19_3 = null;
		Static23.aClass42_2 = null;
		Static309.aClass21ArrayArray3 = null;
		Static75.aClass42_4 = null;
		Static58.aClass42_5 = null;
	}
}
