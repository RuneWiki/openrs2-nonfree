import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!tj;")
	public static Class193 aClass193_8;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
	public static final int[] anIntArray647 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[100];

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	public static int anInt6424 = 0;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public static int anInt6425 = 0;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "[Lclient!ja;")
	public static final Class112[] aClass112Array1 = new Class112[16];

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public static void method5521() {
		for (@Pc(15) int local15 = 0; local15 < Static271.anInt5578; local15++) {
			@Pc(21) int local21 = Static79.anIntArray672[local15];
			@Pc(25) Class10_Sub1_Sub2_Sub1 local25 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local21];
			if (local25 != null) {
				Static283.method4991(local25.aClass60_1.anInt1504, local25);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lclient!rf;")
	public static Class1_Sub2_Sub13 method5522(@OriginalArg(1) int arg0) {
		@Pc(10) Class37 local10 = Static50.aClass37_23;
		@Pc(21) Class1_Sub2_Sub13 local21;
		synchronized (Static50.aClass37_23) {
			local21 = (Class1_Sub2_Sub13) Static50.aClass37_23.method915((long) arg0);
			if (local21 == null) {
				local21 = new Class1_Sub2_Sub13(arg0);
				Static50.aClass37_23.method922((long) arg0, local21);
			}
		}
		synchronized (local21) {
			return local21.method4659() ? local21 : null;
		}
	}
}
