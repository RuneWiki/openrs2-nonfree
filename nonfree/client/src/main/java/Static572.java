import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public static int anInt9441;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "D")
	public static double aDouble32;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_127 = new Class130(32, -1);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!du;[[BI)V")
	public static void method8138(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static29.aByteArrayArray1.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static351.anIntArray405[local10] >> 8) * 64 - Static299.anInt5307;
				@Pc(40) int local40 = (Static351.anIntArray405[local10] & 0xFF) * 64 - Static171.anInt3340;
				Static1.method8294();
				arg0.method2294(Static323.aClass5_9, Static271.aClass105Array1, local40, local16, local29);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!la;Lclient!d;B)V")
	public static void method8139(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Interface7 arg1) {
		Static390.anInterface7_13 = arg1;
		Static542.aClass196_112 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZBII)Lclient!la;")
	public static Class196 method8140(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class209 local13 = null;
		if (Static607.aClass173_7 != null) {
			local13 = new Class209(arg2, Static607.aClass173_7, Static497.aClass173Array1[arg2], 1000000);
		}
		Static534.aClass147_Sub1Array2[arg2] = Static618.aClass295_1.method7329(local13, arg2, Static479.aClass209_4);
		Static534.aClass147_Sub1Array2[arg2].method7354();
		return new Class196(Static534.aClass147_Sub1Array2[arg2], arg0, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!jf;")
	public static Class4_Sub1_Sub2 method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class128 local14 = local7.aClass128_1; local14 != null; local14 = local14.aClass128_2) {
			@Pc(18) Class4_Sub1_Sub2 local18 = local14.aClass4_Sub1_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort118 == arg1 && local18.aShort116 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
