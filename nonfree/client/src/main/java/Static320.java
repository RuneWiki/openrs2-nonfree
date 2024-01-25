import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
	public static int anInt10345;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Ljava/lang/Object;")
	public static Object anObject23;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "Lclient!ks;")
	public static final Class209 aClass209_13 = new Class209("", 11);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I")
	public static int method8636(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(39) int local39 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}
}
