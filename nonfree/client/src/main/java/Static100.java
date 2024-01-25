import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray11 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
	public static int anInt2086 = -1;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public static void method1903() {
		@Pc(5) Class140 local5 = Static306.aClass140_155;
		synchronized (Static306.aClass140_155) {
			Static306.aClass140_155.method3819();
		}
		local5 = Static95.aClass140_53;
		synchronized (Static95.aClass140_53) {
			Static95.aClass140_53.method3819();
		}
	}
}
