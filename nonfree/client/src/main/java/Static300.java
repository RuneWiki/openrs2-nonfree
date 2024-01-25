import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!te", name = "F", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public static int anInt5860;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray4 = new Rectangle[100];

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	public static int anInt5863 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!tq;Lclient!tq;ILclient!tq;Lclient!tq;)V")
	public static void method5150(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(3) Class191 arg2, @OriginalArg(4) Class191 arg3) {
		Static273.aClass191_178 = arg3;
		Static267.aClass191_173 = arg2;
		Static328.aClass191_211 = arg0;
		Static252.aClass191_161 = arg1;
		Static265.aClass146ArrayArray41 = new Class146[Static252.aClass191_161.method5460()][];
		Static104.aBooleanArray24 = new boolean[Static252.aClass191_161.method5460()];
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public static void method5153() {
		Static117.anInt2590 = 0;
		Static91.aClass216_22.method5991();
		Static91.aClass216_22.method5995(Static357.aClass2_Sub13_1);
		Static117.anInt2590++;
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
	public static void method5154() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static95.anInt6381; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static237.anInt4532; local21++) {
				if (Static159.method3018(local7, local17, true, Static275.aClass8ArrayArrayArray4, local21)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
