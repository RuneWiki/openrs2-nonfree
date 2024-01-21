import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2097 = Static193.method3027("<col=ffffff>");

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[J")
	public static final long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2098 = Static193.method3027(")2");

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2101 = Static193.method3027(" seconds)3");

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2099 = aClass70_2101;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2100 = Static193.method3027("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public static int anInt4256 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)I")
	public static int method3309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return (arg0 + (arg0 >>> 31)) % arg1 + local16;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	public static void method3317() {
		@Pc(5) Class9 local5 = Static35.aClass9_1;
		synchronized (Static35.aClass9_1) {
			Static116.anInt3353++;
			Static202.anInt4135 = Static113.anInt2291;
			Static8.anInt187 = Static150.anInt3086;
			Static167.anInt3403 = Static6.anInt116;
			Static15.anInt343 = Static52.anInt1120;
			Static124.anInt3874 = Static190.anInt3866;
			Static96.anInt2006 = Static82.anInt1622;
			Static88.aLong55 = Static41.aLong26;
			Static52.anInt1120 = 0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)I")
	public static int method3318() {
		if (Static178.aDouble94 == 3.0D) {
			return 37;
		} else if (Static178.aDouble94 == 4.0D) {
			return 50;
		} else if (Static178.aDouble94 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}
}
