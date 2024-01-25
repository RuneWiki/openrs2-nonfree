import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!aq", name = "W", descriptor = "I")
	public static int anInt394;

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject1 = null;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)Z")
	public static boolean method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static300.method4404(arg0, arg1) & (Static402.method5909(arg1, arg0) | (arg0 & 0x2000) != 0 | Static93.method8793(arg0, arg1));
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)Z")
	public static boolean method379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
