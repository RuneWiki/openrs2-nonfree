import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public static int anInt6373;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	public static int anInt6375;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	public static int anInt6371 = 1;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_172 = new Class363(31, 6);

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "J")
	public static volatile long aLong169 = 0L;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_16 = new Class28(4, 1, 1, 1);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)I")
	public static int method5287(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(42) int local42 = local31 | local31 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([BI)[B")
	public static byte[] method5288(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static598.method1137(arg0, 0, local9, 0, local6);
		return local9;
	}
}
