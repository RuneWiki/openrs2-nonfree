import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_84;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	public static int anInt2431;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!fj;")
	public static Class1_Sub7 aClass1_Sub7_2;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "Lclient!jj;")
	public static Class53 aClass53_3;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_727 = Static81.method1507("Fps:");

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_729 = Static81.method1507("Loaded update list");

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!dj;")
	public static Class24 aClass24_728 = aClass24_729;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public static int anInt2435 = -1;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "I")
	public static int anInt2439 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)J")
	public static long method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass49_1 == null ? 0L : local7.aClass49_1.aLong62;
	}
}
