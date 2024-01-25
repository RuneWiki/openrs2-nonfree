import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "Lclient!wh;")
	public static final Class356 aClass356_27 = new Class356(16);

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_105 = new Class319(36, 0);

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_139 = new Class81(41, 3);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static300.method4703(arg4)) {
			return;
		}
		if (Static440.aClass365ArrayArray4[arg4] == null) {
			Static72.method1567(Static249.aClass365ArrayArray3[arg4], -1, arg5, arg1, arg2, arg8, arg7, arg0, arg6, arg3);
		} else {
			Static72.method1567(Static440.aClass365ArrayArray4[arg4], -1, arg5, arg1, arg2, arg8, arg7, arg0, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method4985() {
		if (Static246.aClass114_10.aBoolean213) {
			Static72.anInt1778 = 96;
			return;
		}
		try {
			@Pc(33) Method local33 = Runtime.class.getMethod("maxMemory");
			if (local33 != null) {
				try {
					@Pc(37) Runtime local37 = Runtime.getRuntime();
					@Pc(43) Long local43 = (Long) local33.invoke(local37, (Object[]) null);
					Static72.anInt1778 = (int) (local43 / 1048576L) + 1;
				} catch (@Pc(53) Throwable local53) {
				}
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIZ)I")
	public static int method4986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub46 local8 = Static365.method5363(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray577.length) {
			return local8.anIntArray577[arg0];
		} else {
			return -1;
		}
	}
}
