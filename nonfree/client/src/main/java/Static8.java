import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public static int anInt6463;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
	public static int[] anIntArray703;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[Lclient!ml;")
	public static final Class157[] aClass157Array119 = new Class157[6];

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray148 = new boolean[5];

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_130 = new Class240("", 10);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!ak;")
	public static Class10 method5701(@OriginalArg(0) Component arg0) {
		return new Class10_Sub1(arg0, true);
	}
}
