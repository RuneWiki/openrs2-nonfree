import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!bl", name = "U", descriptor = "[I")
	public static final int[] anIntArray96 = new int[50];

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[100];

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method618(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static99.method1780(local21) : local21;
		} else if (arg0 instanceof Class72) {
			@Pc(35) Class72 local35 = (Class72) arg0;
			return local35.method4862();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIIII)V")
	public static void method619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg3, 8);
		local8.method410();
		local8.anInt348 = arg2;
		local8.anInt343 = arg1;
		local8.anInt341 = arg0;
	}
}
