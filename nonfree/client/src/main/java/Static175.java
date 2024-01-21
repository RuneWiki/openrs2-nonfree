import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!fa;")
	public static Class23 aClass23_14;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1596 = Static51.method932("event_opbase");

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt3777 = 0;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1597 = Static51.method932("<col=ffff00>");

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt3786 = 0;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1598 = Static51.method932("::qa_op_test");

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!sa;")
	public static Class72 aClass72_27 = new Class72(200);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!va;)Lclient!cd;")
	public static Class10 method2694(@OriginalArg(2) Class2_Sub11 arg0) {
		try {
			@Pc(7) Class10 local7 = new Class10();
			local7.anInt513 = arg0.method1469();
			if (local7.anInt513 > 32767) {
				local7.anInt513 = 32767;
			}
			local7.aByteArray7 = new byte[local7.anInt513];
			arg0.anInt2077 += Static4.aClass37_1.method1162(local7.aByteArray7, arg0.anInt2077, 0, arg0.aByteArray24, local7.anInt513);
			return local7;
		} catch (@Pc(51) Exception local51) {
			return Static3.aClass10_36;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method2695() {
		aClass10_1596 = null;
		aRandom1 = null;
		aClass10_1598 = null;
		aClass72_27 = null;
		aClass23_14 = null;
		aClass10_1597 = null;
	}
}
