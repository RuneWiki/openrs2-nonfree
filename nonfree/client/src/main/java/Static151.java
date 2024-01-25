import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_67 = new Class25(1, 6);

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_68 = new Class25(24, 2);

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
	public static int anInt2763 = 0;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "Lclient!of;")
	public static final Class188 aClass188_29 = new Class188(64);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BZ)[B")
	public static byte[] method2286(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static472.method5022(arg0, 0, local14, 0, local11);
		return local14;
	}
}
