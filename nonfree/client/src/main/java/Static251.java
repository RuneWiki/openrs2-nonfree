import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt6509;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!b;")
	public static Class16 aClass16_27;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[I")
	public static final int[] anIntArray807 = new int[13];

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray24 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public static int anInt6512 = 100;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qj;ILclient!qj;)V")
	public static void method5679(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		Static67.aClass165_30 = arg1;
		Static185.aClass165_19 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
	public static void method5682() {
		Static232.method5545();
		Static187.method3642();
		Static333.method4243();
		Static311.method5243();
		Static105.method1977();
		Static244.method4320();
		Static229.method1642();
		Static291.method4952();
		Static325.method4282();
		Static85.method1627();
		Static87.method1674();
		Static195.method3682();
		Static257.method4558();
		Static157.method2975();
		Static69.method1396();
		Static24.method737();
		Static116.method2098();
		Static108.method2028();
		Static200.method3750();
		Static326.method5481();
		Static142.method2985();
		Static252.method4472();
		Static129.method2438();
		Static122.aClass140_67.method3824(5);
		Static326.aClass140_166.method3824(5);
		Static243.aClass140_127.method3824(5);
		Static68.aClass140_38.method3824(5);
		Static98.aClass140_55.method3824(5);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lclient!sq;")
	public static Class193 method5685(@OriginalArg(0) int arg0) {
		@Pc(10) Class193 local10 = (Class193) Static267.aClass140_139.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static127.aClass165_46.method4508(arg0, 0);
		local10 = new Class193();
		if (local25 != null) {
			local10.method4945(new Class1_Sub7(local25));
		}
		local10.method4946();
		Static267.aClass140_139.method3817((long) arg0, local10);
		return local10;
	}
}
