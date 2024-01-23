import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
	public static int[] anIntArray10;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[Lclient!fe;")
	public static Class41_Sub1[] aClass41_Sub1Array1;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_3;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "[Lclient!pb;")
	public static Class83[] aClass83Array1 = new Class83[100];

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!ia;")
	private static Class51 aClass51_56 = Static64.method1101("glow1:");

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!ia;")
	public static Class51 aClass51_54 = aClass51_56;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!ia;")
	public static Class51 aClass51_55 = aClass51_56;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_57 = Static64.method1101("; Expires=");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IBIIIII)I")
	public static int method110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg5;
			arg5 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg3;
		} else if (local14 == 1) {
			return arg0;
		} else if (local14 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return 1 + 7 - arg5 - arg0;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIIII)I")
	public static int method111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg2;
			arg2 = local8;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return 1 + 7 - arg0 - arg5;
		} else if (local20 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lclient!fk;")
	public static Class1_Sub2_Sub5 method112(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub5 local10 = (Class1_Sub2_Sub5) Static155.aClass123_9.method3640((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static177.aClass70_36.method3509(arg0, 11);
		local10 = new Class1_Sub2_Sub5();
		if (local20 != null) {
			local10.method1082(new Class1_Sub16(local20));
		}
		Static155.aClass123_9.method3644(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(JB)V")
	public static void method114(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static113.anInt2474; local19++) {
			if (Static181.aLongArray11[local19] == arg0) {
				Static113.anInt2474--;
				for (@Pc(37) int local37 = local19; local37 < Static113.anInt2474; local37++) {
					Static181.aLongArray11[local37] = Static181.aLongArray11[local37 + 1];
					Static7.aClass51Array1[local37] = Static7.aClass51Array1[local37 + 1];
				}
				Static99.anInt2154 = Static27.anInt651;
				Static167.aClass1_Sub16_Sub1_2.method3823(120);
				Static167.aClass1_Sub16_Sub1_2.method3786(arg0);
				return;
			}
		}
	}
}
