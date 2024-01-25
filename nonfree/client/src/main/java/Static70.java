import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!oi;")
	public static Class185 aClass185_77;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray111 = new boolean[8];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Z")
	public static boolean aBoolean452 = true;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt4903 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
	public static boolean method3912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static329.method4322(arg0, arg1) & Static392.method5095(arg1, arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!oi;Z)I")
	public static int method3914(@OriginalArg(0) Class185 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4000(Static249.anInt4442)) {
			local5++;
		}
		if (arg0.method4000(Static28.anInt421)) {
			local5++;
		}
		return local5;
	}
}
