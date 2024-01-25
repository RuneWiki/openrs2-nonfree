import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wba", name = "R", descriptor = "Lclient!mv;")
	public static Class229 aClass229_128;

	@OriginalMember(owner = "client!wba", name = "V", descriptor = "I")
	public static int anInt9400;

	@OriginalMember(owner = "client!wba", name = "pb", descriptor = "Lclient!fa;")
	public static Interface9 anInterface9_12;

	@OriginalMember(owner = "client!wba", name = "M", descriptor = "I")
	public static int anInt9393 = 0;

	@OriginalMember(owner = "client!wba", name = "P", descriptor = "[S")
	public static short[] aShortArray138 = new short[256];

	@OriginalMember(owner = "client!wba", name = "kb", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IILclient!mv;)Lclient!uw;")
	public static Class2_Sub48 method7521(@OriginalArg(0) int arg0, @OriginalArg(2) Class229 arg1) {
		@Pc(16) byte[] local16 = arg1.method4966(arg0);
		return local16 == null ? null : new Class2_Sub48(local16);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
	public static void method7524(@OriginalArg(0) boolean arg0) {
		Static580.method7356(Static172.anInt2621, Static122.anInt2094, arg0, Static187.anInt8962);
	}
}
