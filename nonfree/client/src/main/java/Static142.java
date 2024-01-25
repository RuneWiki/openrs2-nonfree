import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
	public static int anInt2786;

	@OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
	public static int anInt2787;

	@OriginalMember(owner = "client!jj", name = "R", descriptor = "Lclient!qf;")
	public static Class1_Sub31_Sub2 aClass1_Sub31_Sub2_1;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "Lclient!vk;")
	public static final Class207 aClass207_22 = new Class207(8);

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
	public static final int anInt2785 = 12;

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "[I")
	public static int[] anIntArray277 = new int[2];

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "Lclient!wf;")
	public static final Class1_Sub21_Sub2 aClass1_Sub21_Sub2_1 = new Class1_Sub21_Sub2(5000);

	@OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
	public static int anInt2788 = 127;

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "[I")
	public static final int[] anIntArray279 = new int[1000];

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString102 = null;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!nj;ZI)Ljava/lang/String;")
	public static String method2377(@OriginalArg(0) Class1_Sub21 arg0) {
		try {
			@Pc(12) int local12 = arg0.method5699();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt6611 += Static183.aClass216_1.method5776(0, arg0.aByteArray82, local12, local20, arg0.anInt6611);
			return Static333.method5566(0, local12, local20);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Z")
	public static boolean method2378(@OriginalArg(1) int arg0) {
		Static106.aBoolean164 = true;
		Static248.anInt27 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	public static void method2379() {
		Static152.aClass105_9.method4286(((float) Static182.anInt3805 * 0.1F + 0.7F) * 1.1523438F);
		Static152.aClass105_9.method4243(Static331.anInt3765, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static152.aClass105_9.method4281(Static8.anInt112, -1);
		Static152.aClass105_9.method4256(Static12.aClass78_1);
	}
}
