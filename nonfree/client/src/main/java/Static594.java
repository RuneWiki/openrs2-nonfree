import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
	public static int anInt9650;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray37 = new byte[1000][];

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	public static int anInt9653 = -1;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	public static int anInt9654 = 0;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "[I")
	public static final int[] anIntArray739 = new int[5];

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[5];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!mo;I)Lclient!ui;")
	public static Class43_Sub4 method7868(@OriginalArg(0) Class1_Sub35 arg0) {
		return new Class43_Sub4(arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5738(), arg0.method5797(), arg0.method5750());
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IBI)V")
	public static void method7869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class119 local9 = Static204.aClass119ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static369.anInt6131 = local9.anInt2924;
			Static223.anInt4253 = local9.anInt2927;
			Static18.anInt221 = local9.anInt2930;
		}
		Static343.method4699();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)V")
	public static void method7870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static395.method5455(local7.aClass8_Sub3_Sub2_2);
		Static395.method5455(local7.aClass8_Sub3_Sub2_1);
		if (local7.aClass8_Sub3_Sub2_2 != null) {
			local7.aClass8_Sub3_Sub2_2 = null;
		}
		if (local7.aClass8_Sub3_Sub2_1 != null) {
			local7.aClass8_Sub3_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public static void method7871() {
		Static158.aClass222_18.method4428();
	}
}
