import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ida", name = "J", descriptor = "I")
	public static int anInt3940;

	@OriginalMember(owner = "client!ida", name = "K", descriptor = "Lclient!gba;")
	public static Class112 aClass112_5;

	@OriginalMember(owner = "client!ida", name = "U", descriptor = "Lclient!gda;")
	public static Class114 aClass114_7;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "Lclient!hu;")
	public static final Class147 aClass147_8 = new Class147("", 11);

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!ida", name = "Q", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_65 = new Class173(82, -1);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)Z")
	public static boolean method3518() {
		if (Static429.aBoolean557) {
			try {
				Static604.method8248(Static110.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bd;")
	public static RuntimeException_Sub1 method3520(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
