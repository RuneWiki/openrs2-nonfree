import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt5805;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public static int anInt5806;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_186 = new Class189("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!op;)Z")
	public static boolean method4537(@OriginalArg(1) Class182 arg0) {
		return arg0 == Static272.aClass182_9 || Static21.aClass182_2 == arg0 || Static289.aClass182_8 == arg0 || Static121.aClass182_5 == arg0;
	}
}
