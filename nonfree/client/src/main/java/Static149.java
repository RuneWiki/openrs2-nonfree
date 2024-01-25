import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
	public static int anInt2316;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_82 = new Class251(34, 6);

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
	public static int anInt2318 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public static void method2184() {
		for (@Pc(3) int local3 = 0; local3 < Static446.aByteArrayArrayArray12.length; local3++) {
			for (@Pc(17) int local17 = 0; local17 < Static446.aByteArrayArrayArray12[0].length; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static446.aByteArrayArrayArray12[0][0].length; local21++) {
					Static446.aByteArrayArrayArray12[local3][local17][local21] = 0;
				}
			}
		}
		anInt2315++;
	}
}
