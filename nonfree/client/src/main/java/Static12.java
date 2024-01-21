import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Lclient!vb;")
	public static Class82 aClass82_73;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public static int anInt4130;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	public static int anInt4133;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Ljava/awt/Image;")
	public static Image anImage44;

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
	public static int anInt4139;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "[I")
	public static int[] anIntArray434 = new int[1000];

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1445 = Static120.method2057("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1446 = Static120.method2057("<br>(X100(U(Y");

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1447 = Static120.method2057("::errortest");

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1448 = null;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(III)V")
	public static void method3142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass62_1 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!tg;")
	public static Class81 method3147(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static149.method2548(arg0) : Static25.aClass81_218;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method3152() {
		anIntArray434 = null;
		aClass81_1448 = null;
		aClass81_1445 = null;
		aClass81_1447 = null;
		anImage44 = null;
		aClass82_73 = null;
		aClass81_1446 = null;
	}
}
