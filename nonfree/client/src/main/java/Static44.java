import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public static int anInt3934;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public static int anInt3941;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1368 = Static170.method3101("::errortest");

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!pa;")
	public static Class63 aClass63_28 = new Class63(30);

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
	public static int anInt3938 = 0;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
	public static int anInt3939 = 0;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt3940 = 0;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1369 = Static170.method3101("mapmarker");

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1370 = Static170.method3101("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1371 = Static170.method3101("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1372 = Static170.method3101(" <col=ffff00>");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method3004() {
		aClass28_1371 = null;
		aClass28_1368 = null;
		aClass63_28 = null;
		aClass28_1372 = null;
		aClass28_1369 = null;
		aClass28_1370 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ah;I)V")
	public static void method3005(@OriginalArg(0) Class7 arg0) {
		Static90.aClass7_42 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)I")
	public static int method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 2 << 10) - (-(arg0 >> 5 << 7) - (arg2 >> 1));
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)I")
	public static int method3008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)J")
	public static long method3009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass55_1 == null ? 0L : local7.aClass55_1.aLong89;
	}
}
