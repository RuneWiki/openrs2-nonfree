import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "Z")
	public static boolean aBoolean666;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	public static int anInt9488 = 1;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_192 = new Class156(81, 6);

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "Z")
	public static boolean aBoolean665 = true;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
	public static void method8101() {
		@Pc(5) Class168 local5 = Static62.aClass168_11;
		synchronized (Static62.aClass168_11) {
			Static62.aClass168_11.method3852(5);
		}
		local5 = Static101.aClass168_18;
		synchronized (Static101.aClass168_18) {
			Static101.aClass168_18.method3852(5);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)V")
	public static void method8104(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}
}
