import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static313 {

	@OriginalMember(owner = "client!kja", name = "l", descriptor = "I")
	public static int anInt9097;

	@OriginalMember(owner = "client!kja", name = "m", descriptor = "[Lclient!ofa;")
	public static Class265[] aClass265Array6;

	@OriginalMember(owner = "client!kja", name = "k", descriptor = "I")
	public static int anInt9096 = 1;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method7417(@OriginalArg(1) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static471.anInt7481 == 1) {
			Static565.aClass95_13.method8048(arg0, arg1, Static117.anInt2122, Static212.anInt3685);
		} else {
			Static565.aClass95_13.method8048(arg0, arg1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(BI)I")
	public static int method7418(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
