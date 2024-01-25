import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_76 = new Class56(28, -2);

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!dba;")
	public static final Class63 aClass63_9 = new Class63();

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "[Lclient!bd;")
	public static final Class30_Sub1[] aClass30_Sub1Array1 = new Class30_Sub1[35];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!oh;)V")
	public static void method3145(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub1 arg0) {
		for (@Pc(14) Class3_Sub18 local14 = (Class3_Sub18) Static350.aClass112_47.method3088(); local14 != null; local14 = (Class3_Sub18) Static350.aClass112_47.method3084()) {
			if (arg0 == local14.aClass41_Sub2_Sub1_Sub4_Sub1_1) {
				if (local14.aClass3_Sub4_Sub1_3 != null) {
					Static353.aClass3_Sub4_Sub2_1.method639(local14.aClass3_Sub4_Sub1_3);
					local14.aClass3_Sub4_Sub1_3 = null;
				}
				local14.method7825();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public static void method3147() {
		Static569.aClass3_Sub43_2 = new Class3_Sub43(Static544.aClass343_8.method7222(Static256.anInt4535), "", Static69.anInt1582, 1009, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZ)Z")
	public static boolean method3148(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Lclient!hfa;")
	public static Class41_Sub2_Sub3 method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass41_Sub2_Sub3_1;
	}
}
