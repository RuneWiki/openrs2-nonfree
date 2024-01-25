import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
	public static int anInt6657;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean437 = false;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
	public static int method5714(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public static void method5715(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static469.anInt8256 == 1) {
			Static117.aClass100_5.method8855(arg1, arg0, Static240.anInt4801, Static617.anInt10193);
		} else {
			Static117.aClass100_5.method8855(arg1, arg0, 0, 0);
		}
	}
}
