import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
	public static final int[] anIntArray59 = new int[1000];

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!fda;")
	public static final Class112 aClass112_1 = new Class112();

	@OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
	public static final int[] anIntArray60 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;Lclient!rv;)I")
	public static int method886(@OriginalArg(1) String arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		@Pc(6) int local6 = arg1.anInt4144;
		@Pc(10) byte[] local10 = Static637.method8445(arg0);
		arg1.method3686(local10.length);
		arg1.anInt4144 += Static651.aClass211_1.method5090(local10.length, local10, arg1.anInt4144, arg1.aByteArray45, 0);
		return arg1.anInt4144 - local6;
	}
}
