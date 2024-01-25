import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!is;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!bm;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public static int anInt2423;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public static int anInt2424;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array13;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
	public static int anInt2426;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
	public static int anInt2425 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
	public static void method2250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static69.anIntArray80[arg0] = arg1;
		@Pc(18) Class5_Sub35 local18 = (Class5_Sub35) Static352.aClass42_61.method1052((long) arg0);
		if (local18 == null) {
			local18 = new Class5_Sub35(Static284.method4783() + 500L);
			Static352.aClass42_61.method1050((long) arg0, local18);
		} else {
			local18.aLong175 = Static284.method4783() + 500L;
		}
	}
}
