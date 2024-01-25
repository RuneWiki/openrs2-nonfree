import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!em;")
	public static final Class83 aClass83_168 = new Class83(59, 6);

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "[I")
	public static final int[] anIntArray469 = new int[8];

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "[Lclient!hr;")
	public static Class144[] aClass144Array1 = null;

	@OriginalMember(owner = "client!re", name = "ib", descriptor = "Lclient!em;")
	public static Class83 aClass83_169 = new Class83(44, 8);

	@OriginalMember(owner = "client!re", name = "jb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!re", name = "kb", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_96 = new Class208(45, 3);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!sea;ILclient!sea;Lclient!jca;Lclient!sea;Lclient!jba;)Z")
	public static boolean method6278(@OriginalArg(0) Class308 arg0, @OriginalArg(2) Class308 arg1, @OriginalArg(3) Class76 arg2, @OriginalArg(4) Class308 arg3, @OriginalArg(5) Class1_Sub6_Sub2 arg4) {
		Static182.aClass308_73 = arg0;
		Static319.aClass308_113 = arg3;
		Static193.aClass76_6 = arg2;
		Static527.anIntArray557 = new int[16];
		Static54.aClass1_Sub6_Sub2_2 = arg4;
		Static588.aClass308_196 = arg1;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static527.anIntArray557[local25] = 255;
		}
		return true;
	}
}
