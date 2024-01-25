import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
	public static int anInt7384;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_43 = new Class220(512);

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray181 = new int[6][];

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
	public static int anInt7382 = 0;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "F")
	public static float aFloat95 = 1.0F;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public static void method5929() {
		Static242.aClass181_16 = new Class181();
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method5931() {
		@Pc(5) Class188 local5 = Static270.aClass188_40;
		synchronized (Static270.aClass188_40) {
			Static270.aClass188_40.method4156();
		}
		local5 = Static194.aClass188_32;
		synchronized (Static194.aClass188_32) {
			Static194.aClass188_32.method4156();
		}
	}
}
