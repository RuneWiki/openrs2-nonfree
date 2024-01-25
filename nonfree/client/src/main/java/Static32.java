import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "[Lclient!pg;")
	public static Class158[] aClass158Array1;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "C")
	public static char aChar1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIII)I")
	public static int method619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static160.aByteArrayArrayArray9[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static160.aByteArrayArrayArray9[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method622(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static115.aString85 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static149.aString111 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method623(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 3);
		local8.method2509();
		local8.aString117 = arg1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method624(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg1;
			return arg0 ? Static28.method583(local17) : local17;
		} else if (arg1 instanceof Class89) {
			@Pc(31) Class89 local31 = (Class89) arg1;
			return local31.method3743();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IC)Z")
	public static boolean method626(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
