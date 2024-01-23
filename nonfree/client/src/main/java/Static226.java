import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!qg", name = "K", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
	public static int anInt4247;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString145 = "Please remove ";

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public static int anInt4228 = 0;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString146 = "Cancel";

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public static int anInt4234 = 0;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	public static int anInt4236 = -1;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
	public static int anInt4237 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)Lclient!bk;")
	public static Class15 method3632(@OriginalArg(1) int arg0) {
		@Pc(11) Class15 local11 = (Class15) Static201.aClass175_32.method4295((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29 = Static89.aClass119_38.method3235(Static253.method3960(arg0), Static99.method1926(arg0));
		local11 = new Class15();
		local11.anInt519 = arg0;
		if (local29 != null) {
			local11.method498(new Class1_Sub13(local29));
		}
		Static201.aClass175_32.method4285(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIII)Lclient!oj;")
	public static Class126 method3634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = ((long) arg3 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 32 | ((long) arg2 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(37) Class126 local37 = (Class126) Static43.aClass175_8.method4295(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(52) Class184[] local52 = null;
		@Pc(56) Class144 local56 = Static210.method3473(arg0);
		if (local56.anIntArray498 != null) {
			local52 = new Class184[local56.anIntArray498.length];
			for (@Pc(67) int local67 = 0; local67 < local52.length; local67++) {
				@Pc(78) Class79 local78 = Static16.method240(local56.anIntArray498[local67]);
				local52[local67] = new Class184(local78.anInt2255, local78.anInt2263, local78.anInt2264, local78.anInt2260, local78.anInt2257, local78.anInt2265, local78.anInt2256, local78.aBoolean197);
			}
		}
		local37 = new Class126(local56.anInt4461, local52, local56.anInt4465, arg3, arg1, arg2);
		Static43.aClass175_8.method4285(local37, local31);
		return local37;
	}
}
