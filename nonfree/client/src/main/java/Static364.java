import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "[B")
	public static byte[] aByteArray6;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_12 = new Class303(34, 7);

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "Lclient!ib;")
	public static final Class140 aClass140_5 = new Class140(0, 1);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	public static void method575() {
		if (Static237.aClass258_3.aBoolean523) {
			Static350.anInt6083 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static350.anInt6083 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBZI)I")
	public static int method578(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class3_Sub45 local15 = Static162.method826(arg0, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg2 >= 0 && local15.anIntArray510.length > arg2) {
			return local15.anIntArray510[arg2];
		} else {
			return 0;
		}
	}
}
