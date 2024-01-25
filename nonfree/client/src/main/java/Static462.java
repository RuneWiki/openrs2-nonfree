import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
	public static int anInt8629;

	@OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
	public static int anInt8633;

	@OriginalMember(owner = "client!rr", name = "L", descriptor = "Lclient!jr;")
	public static Class178 aClass178_1;

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_193 = new Class362(63, 8);

	@OriginalMember(owner = "client!rr", name = "Q", descriptor = "[I")
	public static final int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
	public static void method7038(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class4 local9 = Static307.aClass350_24.method8198(); local9 != null; local9 = Static307.aClass350_24.method8205()) {
			if ((long) arg0 == (local9.aLong268 >> 48 & 0xFFFFL)) {
				local9.method8379();
			}
		}
	}
}
