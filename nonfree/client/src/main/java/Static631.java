import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!dn;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!vr;")
	public static Class33 aClass33_34;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public static int anInt10060;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "Lclient!aj;")
	public static Class15 aClass15_155;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!ha;")
	public static Class13 aClass13_17;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray53 = new boolean[8];

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_203 = new Class180(99, 6);

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "[I")
	public static final int[] anIntArray875 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8807(@OriginalArg(0) Class13 arg0) {
		if (Static450.anInt7444 < 2 && !Static624.aBoolean698 || Static678.aClass260_21 != null) {
			return;
		}
		@Pc(49) String local49;
		if (Static624.aBoolean698 && Static450.anInt7444 < 2) {
			local49 = Static90.aString119 + Static601.aClass346_34.method8440(Static609.anInt9834) + Static103.aString17 + " ->";
		} else if (Static332.aBoolean403 && Static440.aClass19_1.method2352(81) && Static450.anInt7444 > 2) {
			local49 = Static532.method7683(Static150.aClass3_Sub11_Sub14_2);
		} else {
			@Pc(42) Class3_Sub11_Sub14 local42 = Static150.aClass3_Sub11_Sub14_2;
			if (local42 == null) {
				return;
			}
			local49 = Static532.method7683(local42);
			@Pc(51) int[] local51 = null;
			if (Static14.method197(local42.anInt6738)) {
				local51 = Static170.aClass370_1.method8900((int) local42.aLong211).anIntArray908;
			} else if (local42.anInt6740 != -1) {
				local51 = Static170.aClass370_1.method8900(local42.anInt6740).anIntArray908;
			} else if (Static494.method7103(local42.anInt6738)) {
				@Pc(91) Class3_Sub3 local91 = (Class3_Sub3) Static522.aClass83_34.method2368((long) (int) local42.aLong211);
				if (local91 != null) {
					@Pc(96) Class28_Sub1_Sub1_Sub1_Sub2 local96 = local91.aClass28_Sub1_Sub1_Sub1_Sub2_1;
					@Pc(99) Class300 local99 = local96.aClass300_1;
					if (local99.anIntArray696 != null) {
						local99 = local99.method7258(Static131.aClass66_1);
					}
					if (local99 != null) {
						local51 = local99.anIntArray693;
					}
				}
			} else if (Static364.method5315(local42.anInt6738)) {
				@Pc(135) Class277 local135;
				if (local42.anInt6738 == 1008) {
					local135 = Static652.aClass267_4.method6682((int) local42.aLong211);
				} else {
					local135 = Static652.aClass267_4.method6682((int) (local42.aLong211 >>> 32 & 0x7FFFFFFFL));
				}
				if (local135.anIntArray660 != null) {
					local135 = local135.method6815(Static131.aClass66_1);
				}
				if (local135 != null) {
					local51 = local135.anIntArray658;
				}
			}
			if (local51 != null) {
				local49 = local49 + Static583.method8202(local51);
			}
		}
		if (Static450.anInt7444 > 2) {
			local49 = local49 + "<col=ffffff> / " + (Static450.anInt7444 - 2) + Static601.aClass346_27.method8440(Static609.anInt9834);
		}
		if (Static329.aClass260_12 != null) {
			@Pc(257) Class69 local257 = Static329.aClass260_12.method6253(arg0);
			if (local257 == null) {
				local257 = Static303.aClass69_6;
			}
			local257.method8860(Static329.aClass260_12.anInt6963, Static329.aClass260_12.anInt6936, Static561.aClass33Array25, Static402.anInt6382, Static329.aClass260_12.anInt6971, Static398.anInt6250, Static13.anIntArray19, Static394.aRandom1, local49, Static584.anInt9404, Static329.aClass260_12.anInt6967, Static329.aClass260_12.anInt6953, Static502.anIntArray361, Static329.aClass260_12.anInt7002);
			Static609.method8658(Static13.anIntArray19[0], Static13.anIntArray19[3], Static13.anIntArray19[1], Static13.anIntArray19[2]);
		} else if (Static218.aClass260_10 != null && Static55.aClass118_2 == Static438.aClass118_6) {
			@Pc(238) int local238 = Static303.aClass69_6.method8850(Static584.anInt9404, local49, Static561.aClass33Array25, Static651.anInt10355 + 16, Static394.aRandom1, Static53.anInt1109 + 4, Static502.anIntArray361);
			Static609.method8658(Static53.anInt1109 + 4, 16, Static651.anInt10355, local238 + Static59.aClass88_1.method2502(local49));
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public static void method8809() {
		Static57.aBoolean88 = false;
		Static540.method7765();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
	public static void method8810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub11_Sub4 local14 = Static583.method8201(7, (long) arg0);
		local14.method2195();
		local14.anInt2394 = arg1;
	}
}
