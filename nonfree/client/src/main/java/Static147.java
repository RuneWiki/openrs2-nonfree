import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public static int anInt3144;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1080 = Static151.method2243("l");

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1081 = Static151.method2243(" weitere Optionen");

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1082 = Static151.method2243(")1 ");

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1083 = Static151.method2243("Loading textures )2 ");

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1084 = aClass62_1083;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "[I")
	public static final int[] anIntArray281 = new int[500];

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "Lclient!kd;")
	public static final Class2_Sub11 aClass2_Sub11_2 = new Class2_Sub11(8);

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1085 = Static151.method2243("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1086 = Static151.method2243("<col=ff0000>");

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBIII)V")
	public static void method2195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg2 + 1;
		Static19.method345(arg0, Static55.anIntArrayArray8[arg2], arg1, arg3);
		@Pc(18) int local18 = arg4 - 1;
		Static19.method345(arg0, Static55.anIntArrayArray8[arg4], arg1, arg3);
		for (@Pc(25) int local25 = local5; local25 <= local18; local25++) {
			@Pc(38) int[] local38 = Static55.anIntArrayArray8[local25];
			local38[arg1] = local38[arg3] = arg0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!pb;BI)[Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1[] method2197(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(3) int arg2) {
		return Static157.method2317(arg2, arg1, arg0) ? Static127.method1981() : null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!pb;BLclient!pb;)V")
	public static void method2198(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Class71 arg1) {
		Static22.aClass71_4 = arg0;
		Static142.aClass71_28 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZBZ)I")
	public static int method2200() {
		return Static179.anInt3757 + Static96.anInt2150;
	}
}
