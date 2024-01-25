import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "L", descriptor = "I")
	public static int anInt312;

	@OriginalMember(owner = "client!al", name = "H", descriptor = "I")
	public static int anInt309 = 0;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!al", name = "V", descriptor = "Lclient!uc;")
	public static Class198 aClass198_5 = new Class198(64);

	@OriginalMember(owner = "client!al", name = "X", descriptor = "I")
	public static int anInt322 = -1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BIII)I")
	public static int method219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(21) int local21 = 128 - arg0;
		@Pc(35) int local35 = local21 * (arg2 & 0x7F) + arg0 * (arg1 & 0x7F) >> 7;
		@Pc(49) int local49 = arg0 * (arg1 & 0x380) + (arg2 & 0x380) * local21 >> 7;
		@Pc(64) int local64 = (arg2 & 0xFC00) * local21 + arg0 * (arg1 & 0xFC00) >> 7;
		return local49 & 0x380 | local64 & 0xFC00 | local35 & 0x7F;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V")
	public static void method220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static140.method2321(local35, true);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([BII)I")
	public static int method221(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static54.method918(arg0, arg1, 0);
	}
}
