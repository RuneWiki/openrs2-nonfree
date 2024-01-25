import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	public static int anInt7325;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_18 = new Class254(4);

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_14 = new Class254(1);

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_11 = new Class254(1);

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_12 = new Class254(2);

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_13 = new Class254(4);

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_15 = new Class254(2);

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_16 = new Class254(4);

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "Lclient!ps;")
	public static final Class254 aClass254_17 = new Class254(2);

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_49 = new Class330(50);

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_91 = new Class316(51, 4);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
	public static boolean method5853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static23.method346(arg0, arg1) || Static369.method5433(arg0, arg1);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I")
	public static int method5854(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local24 * arg0 >> 12) + 40960;
		return local33 * local13 >> 12;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(CZ)Z")
	public static boolean method5855(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
