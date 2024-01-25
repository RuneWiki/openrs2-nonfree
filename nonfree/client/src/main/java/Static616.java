import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static616 {

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
	public static int anInt11226;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString130 = null;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIB)Z")
	public static boolean method9601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static326.method5371(arg1, arg0) | Static544.method8346(arg0, arg1) | Static388.method6538(arg0, arg1)) & Static185.method3573(arg1, arg0);
	}
}
