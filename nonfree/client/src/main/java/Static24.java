import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "I")
	public static int anInt646 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
	public static boolean method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZIILclient!pl;BI)V")
	public static void method443(@OriginalArg(2) int arg0, @OriginalArg(3) Class259 arg1, @OriginalArg(5) int arg2) {
		Static511.method7097(0L, arg1, arg2, arg0);
	}
}
