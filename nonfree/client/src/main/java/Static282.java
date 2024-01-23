import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics2;

	@OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
	private static int anInt955;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
	public static int anInt929 = 2;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
	public static int anInt952 = -1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method648(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static236.anIntArray356[local3] = Static236.anIntArray356[local3 - 1];
			Static203.aStringArray64[local3] = Static203.aStringArray64[local3 - 1];
			Static137.aStringArray27[local3] = Static137.aStringArray27[local3 - 1];
			Static264.aStringArray82[local3] = Static264.aStringArray82[local3 - 1];
			Static114.anIntArray189[local3] = Static114.anIntArray189[local3 - 1];
		}
		Static202.anInt4175 = Static157.anInt5706;
		Static236.anIntArray356[0] = arg0;
		Static114.anIntArray189[0] = arg1;
		Static288.anInt1350++;
		Static203.aStringArray64[0] = arg2;
		Static137.aStringArray27[0] = arg3;
		Static264.aStringArray82[0] = arg4;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)V")
	public static void method659() {
		Static243.aClass61_47.method1378();
	}
}
