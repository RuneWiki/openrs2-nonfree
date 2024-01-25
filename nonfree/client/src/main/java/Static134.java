import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Lclient!kba;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array5;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_32 = new Class136(10);

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static297.method991(arg3, 0, arg0, arg1, arg2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIZI)V")
	public static void method2630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(19) int local19 = arg2 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(46) int local46 = Static290.aShort65 + (Static364.aShort84 - Static290.aShort65) * local19 / 100;
		if (local46 < Static422.aShort94) {
			local46 = Static422.aShort94;
		} else if (local46 > Static499.aShort106) {
			local46 = Static499.aShort106;
		}
		@Pc(68) int local68 = arg2 * 512 * local46 / (arg0 * 334);
		@Pc(102) int local102;
		@Pc(108) int local108;
		@Pc(73) short local73;
		if (Static369.aShort87 > local68) {
			local73 = Static369.aShort87;
			local46 = arg0 * 334 * local73 / (arg2 * 512);
			if (local46 > Static499.aShort106) {
				local46 = Static499.aShort106;
				local102 = arg2 * 512 * local46 / (local73 * 334);
				local108 = (arg0 - local102) / 2;
				if (arg3) {
					Static240.aClass14_7.F();
					Static240.aClass14_7.method6859(local108, arg4, arg1, -16777216, arg2);
					Static240.aClass14_7.method6859(local108, arg4, arg1 + arg0 - local108, -16777216, arg2);
				}
				arg0 -= local108 * 2;
				arg1 += local108;
			}
		} else if (Static347.aShort83 < local68) {
			local73 = Static347.aShort83;
			local46 = arg0 * 334 * local73 / (arg2 * 512);
			if (Static422.aShort94 > local46) {
				local46 = Static422.aShort94;
				local102 = local73 * 334 * arg0 / (local46 * 512);
				local108 = (arg2 - local102) / 2;
				if (arg3) {
					Static240.aClass14_7.F();
					Static240.aClass14_7.method6859(arg0, arg4, arg1, -16777216, local108);
					Static240.aClass14_7.method6859(arg0, arg2 + arg4 - local108, arg1, -16777216, local108);
				}
				arg2 -= local108 * 2;
				arg4 += local108;
			}
		}
		Static216.anInt4316 = (short) arg0;
		Static536.anInt8904 = (short) arg2;
		Static122.anInt2872 = arg4;
		Static239.anInt4851 = local46 * arg2 / 334;
		Static306.anInt5622 = arg1;
	}
}
