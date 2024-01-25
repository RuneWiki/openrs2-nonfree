import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
	public static int anInt1724;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
	public static int anInt1725;

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "[I")
	public static final int[] anIntArray199 = new int[50];

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_23 = new Class67(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!dda", name = "M", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_18 = new Class158(74, 1);

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)V")
	public static void method1629() {
		if (Static401.aClass285_11.aBoolean624) {
			Class5_Sub1.lb = 96;
			return;
		}
		try {
			@Pc(24) Method local24 = Runtime.class.getMethod("maxMemory");
			if (local24 != null) {
				try {
					@Pc(28) Runtime local28 = Runtime.getRuntime();
					@Pc(34) Long local34 = (Long) local24.invoke(local28, (Object[]) null);
					Class5_Sub1.lb = (int) (local34 / 1048576L) + 1;
					return;
				} catch (@Pc(44) Throwable local44) {
					return;
				}
			}
		} catch (@Pc(46) Exception local46) {
			return;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
	public static int method1630(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZI)Lclient!qf;")
	public static Class245 method1631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class245 local12 = Static46.method1005(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass245Array2 == null || local12.aClass245Array2.length <= arg0) {
			return null;
		} else {
			return local12.aClass245Array2[arg0];
		}
	}
}
