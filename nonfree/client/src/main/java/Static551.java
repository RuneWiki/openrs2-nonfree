import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static551 {

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "Lclient!wh;")
	public static Class392 aClass392_1;

	@OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
	public static int anInt8913 = 0;

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!rw;")
	public static Class148 method7803(@OriginalArg(0) Component arg0) {
		return new Class148_Sub1(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILclient!lga;IBZ)V")
	public static void method7805(@OriginalArg(1) int arg0, @OriginalArg(2) Class223 arg1, @OriginalArg(3) int arg2) {
		Static592.method8221(arg0, arg1, 0L, arg2);
	}
}
