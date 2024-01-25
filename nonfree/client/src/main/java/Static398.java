import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "Lclient!xa;")
	public static Class58 aClass58_37;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	public static int anInt6974;

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_94;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_95;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!rr;III)V")
	public static void method5831(@OriginalArg(0) Class292 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray4 != null) {
			@Pc(13) Class6_Sub43 local13 = new Class6_Sub43();
			local13.anObjectArray34 = arg0.anObjectArray4;
			local13.aClass292_12 = arg0;
			Static446.method6319(local13);
		}
		Static199.aBoolean458 = true;
		Static245.anInt4901 = arg0.anInt7952;
		Static188.anInt3896 = arg0.anInt7933;
		Static348.anInt6222 = arg1;
		Static115.anInt2199 = arg0.anInt7964;
		Static593.anInt9601 = arg0.anInt7890;
		Static592.anInt9588 = arg2;
		Static209.anInt4228 = arg0.anInt7913;
		Static464.method6502(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)I")
	public static int method5832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(24) int local24 = local7 >= 8 ? arg3 : arg0;
		@Pc(41) int local41 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg1) : arg3;
		return ((local7 & 0x1) == 0 ? local24 : -local24) + ((local7 & 0x2) == 0 ? local41 : -local41);
	}
}
