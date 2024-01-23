import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_2;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
	public static int[] anIntArray23 = new int[14];

	@OriginalMember(owner = "client!al", name = "d", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public static void method171() {
		Static292.method4399();
		Static239.method3827();
		Static31.method533();
		Static179.method3037();
		Static188.method3178();
		Static16.method243();
		Static235.method3791();
		Static5.method105();
		Static206.method3438();
		Static278.method4264();
		Static215.method3494();
		Static250.method3912();
		Static310.method4598();
		Static23.method467();
		Static228.method3657();
		Static91.method1738();
		Static270.method4173();
		Static78.method1613();
		Static149.method764();
		Static276.method4235();
		Static218.method3530();
		Static31.aClass175_6.method4294();
		Static238.aClass175_30.method4294();
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)I")
	public static int method173(@OriginalArg(0) int arg0) {
		@Pc(12) Class16 local12 = Static311.method4642(arg0);
		@Pc(15) int local15 = local12.anInt538;
		@Pc(18) int local18 = local12.anInt539;
		@Pc(25) int local25 = Class110.anIntArray296[local18 - local15];
		@Pc(28) int local28 = local12.anInt535;
		return Static99.anIntArray148[local28] >> local15 & local25;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method174() {
		Static199.aClass175_31.method4288(5);
		Static22.aClass175_4.method4288(5);
		Static181.aClass175_27.method4288(5);
	}
}
