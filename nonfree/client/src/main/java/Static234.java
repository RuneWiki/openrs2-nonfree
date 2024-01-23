import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!ke;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
	public static int anInt4385 = 0;

	@OriginalMember(owner = "client!ra", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString154 = "Loading textures - ";

	@OriginalMember(owner = "client!ra", name = "F", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)J")
	public static long method3768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass39_1 == null ? 0L : local7.aClass39_1.aLong48;
	}
}
