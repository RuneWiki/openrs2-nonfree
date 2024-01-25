import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public static int anInt7920;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public static int anInt7916 = 104;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!he;")
	public static final Class128 aClass128_35 = new Class128(512);

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "F")
	public static float aFloat164 = 0.0F;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_42 = new Class166(8);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6787(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!vd;Lclient!d;I)V")
	public static void method6788(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Interface4 arg1) {
		Static199.anInterface4_6 = arg1;
		Static285.aClass353_43 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
	public static boolean method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
