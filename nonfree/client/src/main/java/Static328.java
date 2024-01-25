import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[Lclient!wo;")
	public static final Class315[] aClass315Array1 = new Class315[6];

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[B")
	public static byte[] method5197(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub2_Sub4 local17 = (Class5_Sub2_Sub4) Static405.aClass291_2.method6850((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static542.method7398(local28, local50);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local17 = new Class5_Sub2_Sub4(local22);
			Static405.aClass291_2.method6851((long) arg0, local17);
		}
		return local17.aByteArray14;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5198(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static86.method1503(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static150.anInt3101; local25++) {
			@Pc(31) String local31 = Static3.aStringArray3[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static86.method1503(local31);
			if (local31 != null && local31.equals(local20)) {
				Static150.anInt3101--;
				for (@Pc(55) int local55 = local25; local55 < Static150.anInt3101; local55++) {
					Static3.aStringArray3[local55] = Static3.aStringArray3[local55 + 1];
					Static357.aStringArray30[local55] = Static357.aStringArray30[local55 + 1];
					Static207.aStringArray20[local55] = Static207.aStringArray20[local55 + 1];
					Static13.aStringArray6[local55] = Static13.aStringArray6[local55 + 1];
					Static324.aBooleanArray22[local55] = Static324.aBooleanArray22[local55 + 1];
				}
				Static49.anInt1093 = Static356.anInt6716;
				Static415.method5995(Static536.aClass236_98);
				Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(arg0));
				Static164.aClass5_Sub3_Sub1_2.method4208(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!pb;II)V")
	public static void method5199(@OriginalArg(1) Class227 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static227.aClass227ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
	public static void method5200(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4) {
		Static81.method1437(arg3, arg1, null, arg0, -1, arg4, arg2);
	}
}
