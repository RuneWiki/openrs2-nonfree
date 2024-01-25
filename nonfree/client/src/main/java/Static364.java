import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mv", name = "o", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_131 = new Class136(3, -1);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!dh;I)Z")
	public static boolean method5690(@OriginalArg(0) Class72 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean120) {
			return false;
		} else if (!arg0.method1445(Static203.anInterface4_2)) {
			return false;
		} else if (Static271.aClass81_41.method1599((long) arg0.anInt1519) == null) {
			return Static151.aClass81_24.method1599((long) arg0.anInt1513) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(III)Z")
	public static boolean method5693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILclient!d;ILjava/awt/Canvas;)Lclient!ha;")
	public static Class126 method5694(@OriginalArg(1) int arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new Class126_Sub1(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(B)V")
	public static void method5695() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static26.aClass112Array1[local3] = null;
		}
		Static73.anInt1144 = 0;
	}
}
