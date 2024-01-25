import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!qt", name = "J", descriptor = "Z")
	public static boolean aBoolean618 = false;

	@OriginalMember(owner = "client!qt", name = "O", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!qt", name = "S", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_126 = new Class216(80, -1);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ID)V")
	public static void method6839(@OriginalArg(1) double arg0) {
		if (Static278.aDouble19 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static61.anIntArray88[local15] = local27 <= 255 ? local27 : 255;
		}
		Static278.aDouble19 = arg0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIBII)V")
	public static void method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static139.anInt10520 = arg0;
		Static309.anInt4819 = arg3;
		Static661.anInt9641 = arg2;
		Static538.anInt8328 = arg1;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)I")
	public static int method6841(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
