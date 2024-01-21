import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt3790;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1418 = Static161.method2452("welle:");

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1419 = Static161.method2452("mapflag");

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1420 = Static161.method2452("");

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_36 = new Class8(20);

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array31 = new Class20[500];

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1421 = Static161.method2452("loc)3dat");

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1422 = Static161.method2452("sl_back");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
	public static int method2878(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(44) int local44 = local33 + (local33 >>> 16);
		return local44 & 0xFF;
	}
}
