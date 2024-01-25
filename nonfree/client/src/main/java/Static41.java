import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_10 = new Class242(41, 8);

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLclient!za;Lclient!am;II)V")
	public static void method561(@OriginalArg(1) Class117 arg0, @OriginalArg(2) Class14 arg1) {
		Static350.aClass14_40.method204();
		if (Static288.aBoolean442) {
			return;
		}
		for (@Pc(21) Class1_Sub15 local21 = (Class1_Sub15) arg1.method203(); local21 != null; local21 = (Class1_Sub15) arg1.method208()) {
			@Pc(29) Class128 local29 = Static430.aClass36_4.method659(local21.anInt1847);
			if (Static247.method3520(local29)) {
				@Pc(41) boolean local41 = Static169.method4134(arg0, local21, local29);
				if (local41) {
					Static311.method4113(local21, local29, arg0);
				}
			}
		}
	}
}
