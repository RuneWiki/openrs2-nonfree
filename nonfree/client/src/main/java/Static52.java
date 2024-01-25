import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_18 = new Class11(47, 5);

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[I")
	public static final int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
	public static final int[] anIntArray216 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public static void method874() {
		if (Static82.anInt1484 < 0) {
			Static24.anInt533 = -1;
			Static280.anInt4835 = -1;
			Static82.anInt1484 = 0;
		}
		if (Static82.anInt1484 > Static338.anInt3306) {
			Static24.anInt533 = -1;
			Static280.anInt4835 = -1;
			Static82.anInt1484 = Static338.anInt3306;
		}
		if (Static308.anInt5181 < 0) {
			Static24.anInt533 = -1;
			Static308.anInt5181 = 0;
			Static280.anInt4835 = -1;
		}
		if (Static338.anInt3296 < Static308.anInt5181) {
			Static24.anInt533 = -1;
			Static308.anInt5181 = Static338.anInt3296;
			Static280.anInt4835 = -1;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public static void method877(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub10_Sub2 local12 = Static217.method3611(arg0, 10);
		local12.method859();
	}
}
