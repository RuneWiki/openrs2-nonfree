import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_179 = new Class254(114, 14);

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_180 = new Class254(73, 0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
	public static int method8100(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(29) int local29 = (local18 & 0x33333333) + (local18 >>> 2 & 0x33333333);
		@Pc(37) int local37 = local29 + (local29 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
