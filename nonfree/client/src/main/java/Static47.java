import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "Lclient!hd;")
	public static Class1_Sub5_Sub3 aClass1_Sub5_Sub3_12;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "I")
	public static int anInt4239;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "Lclient!gh;")
	public static Class25 aClass25_11;

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "I")
	public static int anInt4240;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public static int anInt4241;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	public static int anInt4242;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1084 = Static8.method128("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "[[B")
	public static byte[][] aByteArrayArray18 = new byte[50][];

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1085 = aClass18_1084;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Lclient!pg;")
	public static Class59 aClass59_56 = new Class59();

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1086 = Static8.method128("welle2:");

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
	public static void method2891() {
		aClass18_1084 = null;
		aClass1_Sub5_Sub3_12 = null;
		aClass59_56 = null;
		aClass25_11 = null;
		aClass18_1086 = null;
		aByteArrayArray18 = null;
		aClass18_1085 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method2892(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		if (arg0.anInt214 == 0) {
			local1 = Static87.aClass68_1.method2648(arg0.anInt212, arg0.anInt228, arg0.anInt222);
		}
		@Pc(34) int local34 = 0;
		if (arg0.anInt214 == 1) {
			local1 = Static87.aClass68_1.method2620(arg0.anInt212, arg0.anInt228, arg0.anInt222);
		}
		if (arg0.anInt214 == 2) {
			local1 = Static87.aClass68_1.method2646(arg0.anInt212, arg0.anInt228, arg0.anInt222);
		}
		if (arg0.anInt214 == 3) {
			local1 = Static87.aClass68_1.method2617(arg0.anInt212, arg0.anInt228, arg0.anInt222);
		}
		if (local1 != 0) {
			@Pc(88) int local88 = Static87.aClass68_1.method2657(arg0.anInt212, arg0.anInt228, arg0.anInt222, local1);
			local5 = local1 >> 14 & 0x7FFF;
			local34 = local88 >> 6 & 0x3;
			local3 = local88 & 0x1F;
		}
		arg0.anInt223 = local5;
		arg0.anInt220 = local3;
		arg0.anInt226 = local34;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lclient!ea;")
	public static Class18 method2894(@OriginalArg(0) int arg0) {
		@Pc(7) Class18 local7 = new Class18();
		local7.anInt1129 = 0;
		local7.aByteArray6 = new byte[arg0];
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)[Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3[] method2895() {
		@Pc(16) Class1_Sub1_Sub8_Sub3[] local16 = new Class1_Sub1_Sub8_Sub3[Static22.anInt615];
		for (@Pc(18) int local18 = 0; local18 < Static22.anInt615; local18++) {
			@Pc(24) Class1_Sub1_Sub8_Sub3 local24 = new Class1_Sub1_Sub8_Sub3();
			local24.anInt2316 = anInt4239;
			local24.anInt2315 = Static101.anInt3032;
			local24.anInt2319 = Static131.anIntArray333[local18];
			local24.anInt2318 = Static129.anIntArray331[local18];
			local24.anInt2314 = Static26.anIntArray54[local18];
			local24.anInt2317 = Static145.anIntArray375[local18];
			@Pc(56) int local56 = local24.anInt2314 * local24.anInt2317;
			@Pc(60) byte[] local60 = Static22.aByteArrayArray4[local18];
			local24.anIntArray203 = new int[local56];
			for (@Pc(66) int local66 = 0; local66 < local56; local66++) {
				local24.anIntArray203[local66] = Static9.anIntArray13[local60[local66] & 0xFF];
			}
			local16[local18] = local24;
		}
		Static76.method1682();
		return local16;
	}
}
