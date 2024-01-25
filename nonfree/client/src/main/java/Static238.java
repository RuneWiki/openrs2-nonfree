import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "[Lclient!av;")
	public static Class20[] aClass20Array3;

	@OriginalMember(owner = "client!hga", name = "s", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_22 = new Class136(32);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZI)I")
	public static int method3674(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(31) int local31 = (local10 & 0x33333333) + (local10 >>> 2 & 0xB3333333);
		@Pc(39) int local39 = (local31 >>> 4) + local31 & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}
}
