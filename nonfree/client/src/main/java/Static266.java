import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!hca;")
	public static Class1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!qb;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[B")
	public static final byte[] aByteArray86 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public static int anInt4919 = 13156520;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_56 = new Class243(4, 7);

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
	public static int anInt4923 = -1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method4288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) byte[] local12;
		if (arg0 <= 0) {
			local12 = arg2;
		} else {
			local12 = new byte[arg1];
			for (@Pc(19) int local19 = 0; local19 < arg1; local19++) {
				local12[local19] = arg2[arg0 + local19];
			}
		}
		@Pc(37) Class13 local37 = new Class13();
		local37.method467();
		local37.method465((long) (arg1 * 8), local12);
		@Pc(59) byte[] local59 = new byte[64];
		local37.method468(local59);
		return local59;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method4290() {
		Static235.aClass310ArrayArray2 = new Class310[Static298.aClass53_85.method1607()][];
		Static196.aClass310ArrayArray1 = new Class310[Static298.aClass53_85.method1607()][];
		Static99.aBooleanArray13 = new boolean[Static298.aClass53_85.method1607()];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I")
	public static int method4292(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public static void method4293() {
		Static288.method5996();
		Static282.aClass58_4 = null;
		Static355.aClass142ArrayArray1 = null;
		Static525.aClass39_12 = null;
		Static12.aClass58_1 = null;
		Static16.aClass58_2 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z")
	public static boolean method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static156.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local7 == -Static230.anInt4157) {
			return false;
		} else if (local7 == Static230.anInt4157) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static175.anInt3259;
			@Pc(26) int local26 = arg2 << Static175.anInt3259;
			if (Static468.method7043(local22 + 1, Static532.aClass75Array3[arg0].ba(arg1, arg2), local26 + 1) && Static468.method7043(local22 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg2), local26 + 1) && Static468.method7043(local22 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg2 + 1), local26 + Static136.anInt2574 - 1) && Static468.method7043(local22 + 1, Static532.aClass75Array3[arg0].ba(arg1, arg2 + 1), local26 + Static136.anInt2574 - 1) && Static468.method7043(local22 + Static392.anInt7455, Static532.aClass75Array3[arg0].ba(arg1, arg2), local26 + 1) && Static468.method7043(local22 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg2), local26 + Static392.anInt7455) && Static468.method7043(local22 + Static392.anInt7455, Static532.aClass75Array3[arg0].ba(arg1, arg2 + 1), local26 + Static136.anInt2574 - 1) && Static468.method7043(local22 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1, arg2), local26 + Static392.anInt7455) && Static468.method7043(local22 + Static392.anInt7455, Static532.aClass75Array3[arg0].ba(arg1, arg2), local26 + Static392.anInt7455)) {
				Static156.anIntArrayArrayArray8[arg0][arg1][arg2] = Static230.anInt4157;
				return true;
			} else {
				Static156.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static230.anInt4157;
				return false;
			}
		}
	}
}
