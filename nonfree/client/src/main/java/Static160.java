import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "Lclient!vk;")
	public static final Class372 aClass372_6 = new Class372(1);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method2605(@OriginalArg(0) String arg0) {
		return Static481.method7135(aea.class, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BC)Z")
	public static boolean method2607(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!mea;I)V")
	public static void method2608(@OriginalArg(0) Class230 arg0) {
		if (Static7.anInt53 != arg0.anInt6693) {
			return;
		}
		if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35 == null) {
			arg0.anInt6674 = 0;
			arg0.anInt6648 = 0;
			return;
		}
		arg0.anInt6640 = 150;
		arg0.anInt6685 = (int) (Math.sin((double) Static87.anInt1951 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6674 = Static568.anInt9800;
		arg0.anInt6680 = 5;
		arg0.anInt6648 = Static328.method5138(Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aString35);
		arg0.anInt6666 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.lb;
		arg0.anInt6637 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2960;
		arg0.anInt6728 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2942;
		arg0.anInt6723 = 0;
		@Pc(80) Class275 local80 = arg0.anInt6637 == -1 ? null : Static501.aClass191_2.method4322(arg0.anInt6637);
		if (local80 != null) {
			Static493.method7314(local80, arg0.anInt6728);
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
	public static void method2609() {
		Static559.aClass230ArrayArray2 = new Class230[Static561.aClass386_120.method9189()][];
		Static46.aClass230ArrayArray1 = new Class230[Static561.aClass386_120.method9189()][];
		Static44.aBooleanArray3 = new boolean[Static561.aClass386_120.method9189()];
	}
}
