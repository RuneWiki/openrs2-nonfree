import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "I")
	public static int anInt3571;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(II)Z")
	public static boolean method3070(@OriginalArg(0) int arg0) {
		if (Static555.aBooleanArray22[arg0]) {
			return true;
		} else if (Static182.aClass223_48.method5965(arg0)) {
			@Pc(23) int local23 = Static182.aClass223_48.method5970(arg0);
			if (local23 == 0) {
				Static555.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static299.aClass302ArrayArray2[arg0] == null) {
				Static299.aClass302ArrayArray2[arg0] = new Class302[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static299.aClass302ArrayArray2[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static182.aClass223_48.method5954(local45, arg0);
					if (local59 != null) {
						@Pc(71) Class302 local71 = Static299.aClass302ArrayArray2[arg0][local45] = new Class302();
						local71.anInt8867 = (arg0 << 16) + local45;
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method7344(new Class6_Sub8(local59));
					}
				}
			}
			Static555.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method3071(@OriginalArg(0) Class100 arg0) {
		Static418.aClass100_1 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
	public static void method3072() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static356.anInt6904 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
