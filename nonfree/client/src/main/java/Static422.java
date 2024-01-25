import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qaa", name = "Q", descriptor = "I")
	public static int anInt7224;

	@OriginalMember(owner = "client!qaa", name = "O", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!qaa", name = "T", descriptor = "I")
	public static int anInt7227 = 0;

	@OriginalMember(owner = "client!qaa", name = "V", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_209 = new Class363(52, 1);

	@OriginalMember(owner = "client!qaa", name = "gb", descriptor = "I")
	public static int anInt7237 = 0;

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)V")
	public static void method6079() {
		@Pc(1) Class313 local1 = Static210.aClass313_25;
		synchronized (Static210.aClass313_25) {
			Static210.aClass313_25.method6982(5);
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(CI)Z")
	public static boolean method6080(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
