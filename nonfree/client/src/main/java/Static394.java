import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "Lclient!nca;")
	public static Class254 aClass254_113;

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
	public static int anInt6507 = 0;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I[S)[S")
	public static short[] method5844(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static728.method271(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
