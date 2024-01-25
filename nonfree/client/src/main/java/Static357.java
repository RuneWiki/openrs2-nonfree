import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public static int anInt6083;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	public static int anInt6084;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_213 = new Class48(19, 0);

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "[I")
	public static final int[] anIntArray723 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)Lclient!pm;")
	public static Class1_Sub6_Sub13 method5242(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub6_Sub13 local15 = (Class1_Sub6_Sub13) Static271.aClass219_4.method4799((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static226.aClass230_57.method4985(arg0 & 0x7FFF, 1);
		} else {
			local30 = Static26.aClass230_7.method4985(arg0, 1);
		}
		local15 = new Class1_Sub6_Sub13();
		if (local30 != null) {
			local15.method4175(new Class1_Sub33(local30));
		}
		if (arg0 >= 32768) {
			local15.method4177();
		}
		Static271.aClass219_4.method4801((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!h;II)V")
	public static void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt2333 && arg0 != -1) {
			@Pc(92) Class185 local92 = Static25.aClass67_1.method1227(arg0);
			@Pc(95) int local95 = local92.anInt4802;
			if (local95 == 1) {
				arg1.anInt2323 = arg2;
				arg1.anInt2359 = 0;
				arg1.anInt2322 = 0;
				arg1.anInt2354 = 0;
				arg1.anInt2325 = 1;
				Static4.method52(arg1.anInt2322, arg1.anInt6080, false, arg1.aByte70, local92, arg1.anInt6077);
			}
			if (local95 == 2) {
				arg1.anInt2359 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt2333 == -1 || Static25.aClass67_1.method1227(arg0).anInt4805 >= Static25.aClass67_1.method1227(arg1.anInt2333).anInt4805) {
			arg1.anInt2323 = arg2;
			arg1.anInt2322 = 0;
			arg1.anInt2354 = 0;
			arg1.anInt2379 = arg1.anInt2381;
			arg1.anInt2359 = 0;
			arg1.anInt2333 = arg0;
			arg1.anInt2325 = 1;
			if (arg1.anInt2333 != -1) {
				Static4.method52(arg1.anInt2322, arg1.anInt6080, false, arg1.aByte70, Static25.aClass67_1.method1227(arg1.anInt2333), arg1.anInt6077);
				return;
			}
		} else {
			return;
		}
	}
}
