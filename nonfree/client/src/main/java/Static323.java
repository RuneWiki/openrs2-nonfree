import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "[Lclient!vb;")
	public static Class247[] aClass247Array2;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!d;")
	public static final Class44 aClass44_51 = new Class44(8);

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static int anInt5038 = 0;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public static int anInt5039 = 1;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public static void method3977() {
		if (Static309.aBoolean335) {
			return;
		}
		if (Static216.aClass1_Sub1_1.aBoolean297) {
			Static10.aFloat7 = (int) Static10.aFloat7 - 17 & 0xFFFFFFF0;
		} else {
			Static346.aFloat136 += (-Static346.aFloat136 - 12.0F) / 2.0F;
		}
		Static324.aBoolean348 = true;
		Static309.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3979(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(2, arg0);
		local8.method3026();
		local8.aString42 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
	public static void method3980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static85.anInt1538 == 1) {
			Static122.method1733(arg1, arg0, Static256.aClass5_Sub41_2);
		} else if (Static85.anInt1538 == 2) {
			Static244.method3149(arg0, arg1);
		}
		Static85.anInt1538 = 0;
		Static256.aClass5_Sub41_2 = null;
	}
}
