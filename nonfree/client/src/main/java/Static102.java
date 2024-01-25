import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "J")
	public static long aLong262;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "[I")
	public static int[] anIntArray598;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_139 = new Class218(90, 10);

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
	public static int anInt9953 = 0;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	public static void method8166() {
		Static29.aClass112_5.method3638();
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I")
	public static int method8169(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(31) int local31 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(39) int local39 = (local31 >>> 4) + local31 & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}
}
