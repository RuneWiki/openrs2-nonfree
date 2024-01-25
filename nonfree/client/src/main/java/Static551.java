import java.awt.Component;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	public static int anInt8936;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
	public static int anInt8941;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!ou;")
	public static Class177 method7465(@OriginalArg(0) Component arg0) {
		return new Class177_Sub1(arg0);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class153 local13 = local7.aClass153_3; local13 != null; local13 = local13.aClass153_1) {
			@Pc(17) Class6_Sub1_Sub1 local17 = local13.aClass6_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort85 == arg1 && local17.aShort83 == arg2) {
				Static340.method5157(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(III)Z")
	public static boolean method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static521.aByteArrayArrayArray45[1].length > arg1 && Static521.aByteArrayArrayArray45[1][arg1].length > arg0) {
			return (Static521.aByteArrayArrayArray45[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public static void method7478() {
		@Pc(12) Class2_Sub42 local12 = Static249.method3910(Static434.aClass286_85, Static400.aClass145_2);
		local12.aClass2_Sub15_Sub2_2.method4333(0);
		Static531.method7296(local12);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
	public static void method7481(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(12, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IBI)I")
	public static int method7486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static18.anInt503 == -1) {
			return 1;
		}
		if (Static391.anInt6846 != arg0) {
			Static404.method5910(arg0, Static290.aClass198_15.method4365(Static52.anInt1264));
			if (Static391.anInt6846 != arg0) {
				return -1;
			}
		}
		try {
			@Pc(37) Dimension local37 = Static471.aCanvas12.getSize();
			Static458.method6493(Static307.aClass100_6, true, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_15.method4365(Static52.anInt1264));
			@Pc(53) Class93 local53 = Static117.method1747(Static18.anInt503, Static22.aClass259_16);
			@Pc(56) long local56 = Static548.method7437();
			Static307.aClass100_6.JA();
			Static509.aClass68_7.NA(0, Static81.anInt1767, 0);
			Static307.aClass100_6.method6217(Static509.aClass68_7);
			Static307.aClass100_6.la(local37.width / 2, local37.height / 2, 512, 512);
			Static307.aClass100_6.ra(1.0F);
			Static307.aClass100_6.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(102) Class66 local102 = Static307.aClass100_6.method6191(local53, 2048, 64, 64, 768);
			@Pc(104) int local104 = 0;
			label41: for (@Pc(106) int local106 = 0; local106 < 500; local106++) {
				Static307.aClass100_6.ja(0);
				Static307.aClass100_6.ya();
				for (@Pc(115) int local115 = 15; local115 >= 0; local115--) {
					for (@Pc(119) int local119 = 0; local119 <= local115; local119++) {
						Static46.aClass68_1.NA((int) ((float) Static33.anInt857 * ((float) local119 - (float) local115 / 2.0F)), 0, Static33.anInt857 * (local115 + 1));
						local102.method7558(Static46.aClass68_1, null, 0);
						local104++;
						if ((long) arg1 <= Static548.method7437() - local56) {
							break label41;
						}
					}
				}
			}
			Static307.aClass100_6.method6203();
			@Pc(186) long local186 = (long) (local104 * 1000) / (Static548.method7437() - local56);
			Static307.aClass100_6.ja(0);
			Static307.aClass100_6.ya();
			return (int) local186;
		} catch (@Pc(195) Throwable local195) {
			local195.printStackTrace();
			return -1;
		}
	}
}
