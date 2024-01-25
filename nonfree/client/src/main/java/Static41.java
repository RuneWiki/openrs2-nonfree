import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!da;")
	public static Class80 aClass80_2;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!el;")
	public static final Class109 aClass109_20 = new Class109(79, 17);

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_13 = new Class387(56, -1);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	public static boolean method691(@OriginalArg(0) int arg0) {
		return Static496.anInt8290 == 0 ? Static28.aClass5_Sub16_Sub4_6.method6376() : true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([BII)[B")
	public static byte[] method692(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = new byte[arg1];
		Static682.method799(arg0, 0, local13, 0, arg1);
		return local13;
	}
}
