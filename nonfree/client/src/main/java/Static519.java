import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rha", name = "r", descriptor = "I")
	public static int anInt8230;

	@OriginalMember(owner = "client!rha", name = "p", descriptor = "I")
	public static int anInt8235;

	@OriginalMember(owner = "client!rha", name = "w", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!rha", name = "q", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_215 = new Class381(22, 11);

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "(I)V")
	public static void method7088() {
		for (@Pc(15) int local15 = 0; local15 < Static65.anInt1087; local15++) {
			@Pc(21) Class248 local21 = Static24.aClass248Array1[local15];
			if (local21.aByte88 == 3) {
				if (local21.aClass5_Sub4_Sub4_3 == null) {
					local21.anInt6530 = Integer.MIN_VALUE;
				} else {
					Static265.aClass5_Sub4_Sub1_2.method332(local21.aClass5_Sub4_Sub4_3);
				}
			}
		}
	}
}
