import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public static int anInt2783;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!ug;")
	public static Class43 aClass43_17;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_9 = new Class197(13, 0, 1, 0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ha;ILclient!oh;BI)V")
	public static void method2459(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class273 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(19) int local19 = 63; local19 >= 0; local19--) {
			Static669.method9116(false, true);
			@Pc(43) int local43 = (local19 & 0x3F) << 10 | 0x380 | 0x3F;
			@Pc(47) int local47 = Static555.anIntArray633[local43];
			Static503.method2433(false, true);
			arg0.aa(arg1, (arg2.anInt7385 * (63 - local19) >> 6) + arg3, arg2.anInt7402, (arg2.anInt7385 >> 6) + 1, local47, 0);
		}
	}
}
