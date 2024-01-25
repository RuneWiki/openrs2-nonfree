import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!us", name = "m", descriptor = "I")
	public static int anInt6908;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "I")
	public static int anInt6909 = 0;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "[I")
	public static final int[] anIntArray595 = new int[14];

	@OriginalMember(owner = "client!us", name = "p", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_108 = new Class25(15, 7);

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
	public static void method5605() {
		Static290.anInt4868 = Static196.aClass201_4.anInt5071 + Static196.aClass201_4.anInt5070 + 2;
		Static341.anInt5728 = Static252.aClass201_5.anInt5071 + Static252.aClass201_5.anInt5070 + 2;
		Static183.aStringArray40 = new String[500];
		for (@Pc(27) int local27 = 0; local27 < Static183.aStringArray40.length; local27++) {
			Static183.aStringArray40[local27] = "";
		}
	}
}
