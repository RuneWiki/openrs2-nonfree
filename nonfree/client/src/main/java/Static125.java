import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "Lclient!nea;")
	public static Class235 aClass235_83;

	@OriginalMember(owner = "client!faa", name = "A", descriptor = "I")
	public static int anInt2496;

	@OriginalMember(owner = "client!faa", name = "q", descriptor = "S")
	public static short aShort36 = 256;

	@OriginalMember(owner = "client!faa", name = "z", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_22 = new Class70(77, 11);

	@OriginalMember(owner = "client!faa", name = "E", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_84 = new Class235(42, -1);

	@OriginalMember(owner = "client!faa", name = "F", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_85 = new Class235(109, -1);

	@OriginalMember(owner = "client!faa", name = "H", descriptor = "I")
	public static final int anInt2499 = 0;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIFIZI)[I")
	public static int[] method1976(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub1_Sub31 local10 = new Class1_Sub1_Sub31();
		local10.anInt7550 = 4;
		local10.anInt7548 = 8;
		local10.anInt7551 = 35;
		local10.anInt7553 = (int) (arg0 * 4096.0F);
		local10.aBoolean589 = true;
		local10.anInt7549 = 8;
		local10.method7699();
		Static122.method1913(2048, 1);
		local10.method6012(local6, 0);
		return local6;
	}
}
