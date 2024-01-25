import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "[Lclient!ta;")
	public static Class64[] aClass64Array3;

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "[[[Lclient!hg;")
	public static Class106[][][] aClass106ArrayArrayArray3;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "Lclient!l;")
	public static Class17 aClass17_57;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_161 = new Class209("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_60 = new Class171(50);

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	public static int anInt7216 = 1;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	public static int anInt7217 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ya;Lclient!ij;III)V")
	public static void method5701(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class106 local12;
		if (arg3 < Static42.anInt4340) {
			local12 = aClass106ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass3_Sub1_2 != null && local12.aClass3_Sub1_2.method5135()) {
				arg1.method5136(arg0, Static8.anInt242, true, local12.aClass3_Sub1_2, 0, 0);
			}
		}
		if (arg4 < Static42.anInt4340) {
			local12 = aClass106ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub1_2 != null && local12.aClass3_Sub1_2.method5135()) {
				arg1.method5136(arg0, 0, true, local12.aClass3_Sub1_2, Static8.anInt242, 0);
			}
		}
		if (arg3 < Static42.anInt4340 && arg4 < Static386.anInt6463) {
			local12 = aClass106ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub1_2 != null && local12.aClass3_Sub1_2.method5135()) {
				arg1.method5136(arg0, Static8.anInt242, true, local12.aClass3_Sub1_2, Static8.anInt242, 0);
			}
		}
		if (arg3 < Static42.anInt4340 && arg4 > 0) {
			local12 = aClass106ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass3_Sub1_2 != null && local12.aClass3_Sub1_2.method5135()) {
				arg1.method5136(arg0, Static8.anInt242, true, local12.aClass3_Sub1_2, -Static8.anInt242, 0);
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLjava/lang/String;ZI)Z")
	public static boolean method5702(@OriginalArg(1) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(66) int local66;
			if (local43 >= '0' && local43 <= '9') {
				local66 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local66 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local66 = local43 - 'W';
			} else {
				return false;
			}
			if (local66 >= 10) {
				return false;
			}
			if (local28) {
				local66 = -local66;
			}
			@Pc(104) int local104 = local32 * 10 + local66;
			if (local104 / 10 != local32) {
				return false;
			}
			local32 = local104;
			local30 = true;
		}
		return local30;
	}
}
