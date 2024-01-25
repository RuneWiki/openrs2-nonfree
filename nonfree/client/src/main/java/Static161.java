import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Lclient!tb;")
	public static Class231 aClass231_2;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "Lclient!fq;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
	public static int anInt2686 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIII)V")
	public static void method2329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(14) int local14 = arg4 - arg2;
		if (local10 == 0) {
			if (local14 != 0) {
				Static226.method3263(arg1, arg3, arg2, arg4);
			}
		} else if (local14 == 0) {
			Static131.method2046(arg3, arg0, arg2, arg1);
		} else {
			@Pc(43) int local43 = (local14 << 12) / local10;
			@Pc(60) int local60 = arg2 - (arg1 * local43 >> 12);
			@Pc(73) int local73;
			@Pc(71) int local71;
			if (Static427.anInt7214 > arg1) {
				local71 = local60 + (local43 * Static427.anInt7214 >> 12);
				local73 = Static427.anInt7214;
			} else if (Static434.anInt7302 >= arg1) {
				local71 = arg2;
				local73 = arg1;
			} else {
				local71 = (Static434.anInt7302 * local43 >> 12) + local60;
				local73 = Static434.anInt7302;
			}
			@Pc(110) int local110;
			@Pc(112) int local112;
			if (Static427.anInt7214 > arg0) {
				local112 = (Static427.anInt7214 * local43 >> 12) + local60;
				local110 = Static427.anInt7214;
			} else if (Static434.anInt7302 >= arg0) {
				local110 = arg0;
				local112 = arg4;
			} else {
				local110 = Static434.anInt7302;
				local112 = (Static434.anInt7302 * local43 >> 12) + local60;
			}
			if (Static289.anInt5053 > local112) {
				local110 = (Static289.anInt5053 - local60 << 12) / local43;
				local112 = Static289.anInt5053;
			} else if (Static93.anInt1676 < local112) {
				local112 = Static93.anInt1676;
				local110 = (Static93.anInt1676 - local60 << 12) / local43;
			}
			if (local71 < Static289.anInt5053) {
				local71 = Static289.anInt5053;
				local73 = (Static289.anInt5053 - local60 << 12) / local43;
			} else if (local71 > Static93.anInt1676) {
				local73 = (Static93.anInt1676 - local60 << 12) / local43;
				local71 = Static93.anInt1676;
			}
			Static369.method4905(local112, local110, local73, arg3, local71);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBI)V")
	public static void method2330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub5_Sub11 local18 = Static188.method2688(arg0, 7);
		local18.method2661();
		local18.anInt3213 = arg1;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method2331(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static468.method5036(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
