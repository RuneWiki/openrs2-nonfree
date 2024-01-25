import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Z")
	public static boolean aBoolean71;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public static int anInt990;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public static int anInt992;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public static final int anInt983 = 12;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "[I")
	public static final int[] anIntArray91 = new int[500];

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public static int anInt995 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[Lclient!wn;)V")
	public static void method851(@OriginalArg(1) Class95[] arg0) {
		Static251.anInt4981 = arg0.length;
		Static303.aClass95Array15 = new Class95[Static251.anInt4981 + 10];
		Static34.anIntArray70 = new int[Static251.anInt4981 + 10];
		Static368.method5427(arg0, 0, Static303.aClass95Array15, 0, Static251.anInt4981);
		for (@Pc(24) int local24 = 0; local24 < Static251.anInt4981; local24++) {
			Static34.anIntArray70[local24] = Static303.aClass95Array15[local24].method5494();
		}
		for (@Pc(47) int local47 = Static251.anInt4981; local47 < Static303.aClass95Array15.length; local47++) {
			Static34.anIntArray70[local47] = 12;
		}
	}

	@OriginalMember(owner = "client!db", name = "i", descriptor = "(I)I")
	public static int method854() {
		return 6;
	}
}
