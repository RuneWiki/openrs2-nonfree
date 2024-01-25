import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!f;")
	public static Class8 aClass8_5;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Lclient!an;")
	public static final Class11 aClass11_11 = new Class11(512);

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "[Lclient!wg;")
	public static final Class3_Sub4_Sub16[] aClass3_Sub4_Sub16Array2 = new Class3_Sub4_Sub16[14];

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public static int anInt1822 = 0;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)S")
	public static short method1421(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local24 * local20 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(48) int local48 = local44 + local24;
		@Pc(59) int local59;
		if (local48 == 0) {
			local59 = local44 << 1;
		} else {
			local59 = (local44 << 8) / local48;
		}
		return (short) (local48 | local14 << 10 | local59 >> 4 << 7);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIILclient!mq;)V")
	public static void method1422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class156 arg2) {
		@Pc(8) Class58 local8 = arg2.method3762(Static121.aClass172_3);
		if (local8 == null) {
			return;
		}
		Static121.aClass172_3.pa(arg1, arg0, arg1 + arg2.anInt4853, arg0 - -arg2.anInt4823);
		if (Static311.anInt5499 >= 3) {
			Static121.aClass172_3.j(-16777216, local8, arg1, arg0);
		} else {
			Static123.aClass8_9.method6000((float) arg2.anInt4853 / 2.0F + (float) arg1, (float) arg2.anInt4823 / 2.0F + (float) arg0, ((int) -Static252.aFloat47 & 0x3FFF) << 2, local8, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!bu;)V")
	public static void method1423(@OriginalArg(1) Class32 arg0) {
		Static228.aClass32_52 = arg0;
	}
}
