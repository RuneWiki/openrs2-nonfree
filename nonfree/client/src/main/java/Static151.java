import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt3234;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
	public static int anInt3239;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString117 = "glow2:";

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "[I")
	public static final int[] anIntArray285 = new int[14];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
	public static void method3006() {
		if (Static311.aClass26_12 != null) {
			Static311.aClass26_12.method4217();
		}
		if (Static115.aClass26_7 != null) {
			Static115.aClass26_7.method4217();
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Z")
	public static boolean method3009() {
		return Static174.aBoolean233;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	public static void method3011() {
		@Pc(1) Class11 local1 = Static328.aClass11_139;
		synchronized (Static328.aClass11_139) {
			Static328.aClass11_139.method213();
		}
	}
}
