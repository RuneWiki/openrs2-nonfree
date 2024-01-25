import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_386 = new Class305(64, 5);

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
	public static int anInt7490 = 2;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!dn;)V")
	public static void method6694(@OriginalArg(1) Class69 arg0) {
		Static134.aClass69_30 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BIII)V")
	public static void method6696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(11, arg0);
		local8.method6693();
		local8.anInt7487 = arg2;
		local8.anInt7482 = arg1;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(III)Z")
	public static boolean method6697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!et;)V")
	public static void method6701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class91 arg2) {
		@Pc(8) Class28 local8 = arg2.method2287(Static455.aClass4_11);
		if (local8 == null) {
			return;
		}
		Static455.aClass4_11.N(arg0, arg1, arg2.anInt2399 + arg0, arg2.anInt2378 + arg1);
		if (Static235.anInt4528 < 3) {
			Static197.aClass104_17.method7709((float) arg2.anInt2399 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt2378 / 2.0F, ((int) -Static135.aFloat193 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static455.aClass4_11.G(-16777216, local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
	public static int method6703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static200.aShortArrayArray3 == null ? 0 : Static200.aShortArrayArray3[arg0][arg1] & 0xFFFF;
	}
}
