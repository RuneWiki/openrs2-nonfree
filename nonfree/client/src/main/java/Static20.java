import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!ap", name = "A", descriptor = "[I")
	public static final int[] anIntArray29 = new int[1];

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_1 = new Class392(0, 1);

	@OriginalMember(owner = "client!ap", name = "M", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_9 = new Class156(42, 6);

	@OriginalMember(owner = "client!ap", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[5];

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)Z")
	public static boolean method345(@OriginalArg(1) int arg0) {
		if (Static383.aBooleanArray19[arg0]) {
			return true;
		} else if (Static90.aClass126_53.method3084(arg0)) {
			@Pc(25) int local25 = Static90.aClass126_53.method3062(arg0);
			if (local25 == 0) {
				Static383.aBooleanArray19[arg0] = true;
				return true;
			}
			if (Static397.aClass238ArrayArray2[arg0] == null) {
				Static397.aClass238ArrayArray2[arg0] = new Class238[local25];
			}
			for (@Pc(54) int local54 = 0; local54 < local25; local54++) {
				if (Static397.aClass238ArrayArray2[arg0][local54] == null) {
					@Pc(70) byte[] local70 = Static90.aClass126_53.method3086(local54, arg0);
					if (local70 != null) {
						@Pc(82) Class238 local82 = Static397.aClass238ArrayArray2[arg0][local54] = new Class238();
						local82.anInt5971 = (arg0 << 16) + local54;
						if (local70[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local82.method5309(new Class5_Sub36(local70));
					}
				}
			}
			Static383.aBooleanArray19[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)V")
	public static void method347(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg0, 7);
		local9.method7444();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZII)V")
	public static void method348(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static3.aClass306_1.method6943((long) arg2) != null) {
			return;
		}
		if (Static379.aBoolean421) {
			@Pc(22) Class5_Sub11 local22 = new Class5_Sub11(arg2, new Class275_Sub1(4096, Static609.aClass126_198, arg2), arg0, arg1);
			local22.aClass275_Sub1_1.method6310(Static665.aStringArray24[Static375.anInt7800]);
			Static3.aClass306_1.method6944(local22, (long) arg2, -12002);
		} else {
			Static267.method4322(arg2, arg1);
		}
	}
}
