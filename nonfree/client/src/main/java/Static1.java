import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "A", descriptor = "I")
	public static int anInt25 = 0;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
	public static int[] anIntArray3 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V")
	public static void method20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class1_Sub28 local10 = (Class1_Sub28) Static25.aClass3_3.method30(); local10 != null; local10 = (Class1_Sub28) Static25.aClass3_3.method33()) {
			Static232.method3869(arg2, arg0, arg1, local10, arg3);
		}
		for (@Pc(31) Class1_Sub28 local31 = (Class1_Sub28) Static87.aClass3_10.method30(); local31 != null; local31 = (Class1_Sub28) Static87.aClass3_10.method33()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class59 local40 = local31.aClass9_Sub1_Sub2_1.method207();
			if (local40.anInt2744 == local31.aClass9_Sub1_Sub2_1.anInt451) {
				local35 = 0;
			} else if (local40.anInt2726 == local31.aClass9_Sub1_Sub2_1.anInt451 || local31.aClass9_Sub1_Sub2_1.anInt451 == local40.anInt2729 || local40.anInt2725 == local31.aClass9_Sub1_Sub2_1.anInt451 || local31.aClass9_Sub1_Sub2_1.anInt451 == local40.anInt2741) {
				local35 = 2;
			} else if (local40.anInt2758 == local31.aClass9_Sub1_Sub2_1.anInt451 || local40.anInt2756 == local31.aClass9_Sub1_Sub2_1.anInt451 || local40.anInt2750 == local31.aClass9_Sub1_Sub2_1.anInt451 || local40.anInt2739 == local31.aClass9_Sub1_Sub2_1.anInt451) {
				local35 = 3;
			}
			if (local35 != local31.anInt4861) {
				@Pc(129) int local129 = Static136.method2538(local31.aClass9_Sub1_Sub2_1);
				if (local31.anInt4858 != local129) {
					if (local31.aClass1_Sub4_Sub3_2 != null) {
						Static24.aClass1_Sub4_Sub4_1.method3081(local31.aClass1_Sub4_Sub3_2);
						local31.aClass1_Sub4_Sub3_2 = null;
					}
					local31.anInt4858 = local129;
				}
				local31.anInt4861 = local35;
			}
			local31.anInt4863 = local31.aClass9_Sub1_Sub2_1.anInt427;
			local31.anInt4857 = local31.aClass9_Sub1_Sub2_1.anInt427 + local31.aClass9_Sub1_Sub2_1.method208() * 64;
			local31.anInt4856 = local31.aClass9_Sub1_Sub2_1.anInt479;
			local31.anInt4865 = local31.aClass9_Sub1_Sub2_1.anInt479 + local31.aClass9_Sub1_Sub2_1.method208() * 64;
			Static232.method3869(arg2, arg0, arg1, local31, arg3);
		}
		for (@Pc(207) Class1_Sub28 local207 = (Class1_Sub28) Static32.aClass140_1.method4012(); local207 != null; local207 = (Class1_Sub28) Static32.aClass140_1.method4013()) {
			@Pc(214) Class59 local214 = local207.aClass9_Sub1_Sub1_2.method207();
			@Pc(216) byte local216 = 1;
			if (local214.anInt2744 == local207.aClass9_Sub1_Sub1_2.anInt451) {
				local216 = 0;
			} else if (local214.anInt2726 == local207.aClass9_Sub1_Sub1_2.anInt451 || local214.anInt2729 == local207.aClass9_Sub1_Sub1_2.anInt451 || local214.anInt2725 == local207.aClass9_Sub1_Sub1_2.anInt451 || local207.aClass9_Sub1_Sub1_2.anInt451 == local214.anInt2741) {
				local216 = 2;
			} else if (local207.aClass9_Sub1_Sub1_2.anInt451 == local214.anInt2758 || local207.aClass9_Sub1_Sub1_2.anInt451 == local214.anInt2756 || local214.anInt2750 == local207.aClass9_Sub1_Sub1_2.anInt451 || local207.aClass9_Sub1_Sub1_2.anInt451 == local214.anInt2739) {
				local216 = 3;
			}
			if (local216 != local207.anInt4861) {
				@Pc(313) int local313 = Static217.method3554(local207.aClass9_Sub1_Sub1_2);
				if (local207.anInt4858 != local313) {
					if (local207.aClass1_Sub4_Sub3_2 != null) {
						Static24.aClass1_Sub4_Sub4_1.method3081(local207.aClass1_Sub4_Sub3_2);
						local207.aClass1_Sub4_Sub3_2 = null;
					}
					local207.anInt4858 = local313;
				}
				local207.anInt4861 = local216;
			}
			local207.anInt4863 = local207.aClass9_Sub1_Sub1_2.anInt427;
			local207.anInt4857 = local207.aClass9_Sub1_Sub1_2.anInt427 + local207.aClass9_Sub1_Sub1_2.method208() * 64;
			local207.anInt4856 = local207.aClass9_Sub1_Sub1_2.anInt479;
			local207.anInt4865 = local207.aClass9_Sub1_Sub1_2.anInt479 + local207.aClass9_Sub1_Sub1_2.method208() * 64;
			Static232.method3869(arg2, arg0, arg1, local207, arg3);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBLclient!hc;)[Lclient!ke;")
	public static Class1_Sub2_Sub4[] method21(@OriginalArg(1) int arg0, @OriginalArg(3) Class51 arg1) {
		return Static96.method2050(arg1, 0, arg0) ? Static22.method2183() : null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
	public static void method22(@OriginalArg(0) int arg0) {
		Static206.anInt4549 = -1;
		Static206.anInt4549 = -1;
		Static239.anInt5151 = arg0;
		Static99.method2088();
	}
}
