import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	public static int anInt2527 = 0;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!gaa;")
	public static final Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "Lclient!uea;")
	public static final Class314 aClass314_2 = new Class314("runescape", 0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method2140() {
		@Pc(1) Class332 local1 = Static23.aClass332_14;
		synchronized (Static23.aClass332_14) {
			Static23.aClass332_14.method7510();
		}
		local1 = Static234.aClass332_102;
		synchronized (Static234.aClass332_102) {
			Static234.aClass332_102.method7510();
		}
	}
}
