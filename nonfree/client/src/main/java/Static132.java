import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!hba;")
	public static final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
	public static final int[] anIntArray324 = new int[32];

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!qa;B)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2) {
		Static525.aClass39_12 = arg2;
		Static355.aClass142ArrayArray1 = new Class142[arg1][arg0];
		if (Static253.anIntArray431 != null) {
			Static282.aClass58_4 = Static69.method1445(Static253.anIntArray431[0], Static253.anIntArray431[2], Static253.anIntArray431[4], Static253.anIntArray431[3], Static253.anIntArray431[5], Static253.anIntArray431[1]);
		}
		Static438.aClass142_1 = new Class142();
		Static501.method7360();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JBLclient!qa;)V")
	public static void method2415(@OriginalArg(0) long arg0, @OriginalArg(2) Class39 arg1) {
		Static252.anInt4585 = 0;
		Static213.anInt3839 = Static160.anInt2910;
		Static160.anInt2910 = 0;
		@Pc(14) long local14 = Static143.method2502();
		for (@Pc(26) Class6_Sub7 local26 = (Class6_Sub7) Static218.aClass107_3.method2832(); local26 != null; local26 = (Class6_Sub7) Static218.aClass107_3.method2835()) {
			if (local26.method6394(arg1, arg0)) {
				Static252.anInt4585++;
			}
		}
		if (Static80.aBoolean120 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static218.aClass107_3.method2833() + ", running: " + Static252.anInt4585 + ". Particles: " + Static160.anInt2910 + ". Time taken: " + (Static143.method2502() - local14) + "ms");
		}
	}
}
