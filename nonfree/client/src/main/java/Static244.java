import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_160 = new Class123(40, 2);

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Z")
	public static boolean aBoolean313 = false;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)Lclient!lp;")
	public static Class187 method3849() {
		try {
			return (Class187) Class.forName("Class187_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!k;ILjava/awt/Frame;)V")
	public static void method3850(@OriginalArg(0) Class168 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class309 local6 = arg0.method4089(arg1);
			while (local6.anInt8650 == 0) {
				Static373.method5240(10L);
			}
			if (local6.anInt8650 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static373.method5240(100L);
		}
	}
}
