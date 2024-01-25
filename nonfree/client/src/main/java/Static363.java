import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "Lclient!in;")
	public static Class157 aClass157_188;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_72 = new Class94(13, 2);

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_73 = new Class94(15, 8);

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "Lclient!gba;")
	public static final Class2_Sub18 aClass2_Sub18_1 = new Class2_Sub18(0, 0);

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BII)Z")
	public static boolean method6138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V")
	public static void method6140() {
		if (Static268.aClass370_3.aBoolean740) {
			Static514.anInt9425 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static514.anInt9425 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}
}
