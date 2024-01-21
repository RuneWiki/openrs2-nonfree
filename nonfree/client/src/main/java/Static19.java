import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub2Array14;

	@OriginalMember(owner = "client!client", name = "Fb", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Gb", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_12;

	@OriginalMember(owner = "client!client", name = "Jb", descriptor = "Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
	public static int anInt592;

	@OriginalMember(owner = "client!client", name = "Mb", descriptor = "Lclient!tb;")
	public static Class44 aClass44_10;

	@OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
	public static int anInt593;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!n;")
	public static Class52 aClass52_12 = new Class52(260);

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_277 = Static33.method650("Offline");

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_278 = Static33.method650("glow2:");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_279 = aClass56_278;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!oa;")
	public static Class56 aClass56_280 = aClass56_278;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_282 = Static33.method650(" is already on your friend list");

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_281 = aClass56_282;

	@OriginalMember(owner = "client!client", name = "Hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_283 = Static33.method650(" )2>");

	@OriginalMember(owner = "client!client", name = "Ib", descriptor = "Lclient!oa;")
	private static Class56 aClass56_284 = Static33.method650("Loading)3)3)3");

	@OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
	public static int anInt591 = 0;

	@OriginalMember(owner = "client!client", name = "Nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_285 = aClass56_284;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
	public static boolean method398(@OriginalArg(0) int arg0) {
		if (Static98.aBooleanArray11[arg0]) {
			return true;
		} else if (Static57.aClass44_36.method1134(arg0)) {
			@Pc(23) int local23 = Static57.aClass44_36.method1151(arg0);
			if (local23 == 0) {
				Static98.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static31.aClass3_Sub1_Sub16ArrayArray1[arg0] == null) {
				Static31.aClass3_Sub1_Sub16ArrayArray1[arg0] = new Class3_Sub1_Sub16[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static57.aClass44_36.method1146(arg0, local50);
					if (local64 != null) {
						Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local50] = new Class3_Sub1_Sub16();
						Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local50].anInt2817 = local50 + (arg0 << 16);
						if (local64[0] == -1) {
							Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local50].method1858(new Class3_Sub2(local64));
						} else {
							Static31.aClass3_Sub1_Sub16ArrayArray1[arg0][local50].method1854(new Class3_Sub2(local64));
						}
					}
				}
			}
			Static98.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 method400() {
		@Pc(17) Class3_Sub1_Sub1_Sub1 local17 = new Class3_Sub1_Sub1_Sub1(Static69.anIntArray161, Static51.anIntArray103, Static76.anIntArray179, Static69.anIntArray163, Static116.aByteArrayArray10);
		Static127.method2040();
		return local17;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!be;B)V")
	public static void method401(@OriginalArg(0) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub4_5 != null) {
			arg0.aClass3_Sub4_5.anInt2497 = 0;
		}
		arg0.aBoolean171 = false;
		for (@Pc(18) Class3_Sub3 local18 = arg0.method2060(); local18 != null; local18 = arg0.method2059()) {
			method401(local18);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!td;)Lclient!td;")
	public static Class3_Sub1_Sub16 method402(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		@Pc(11) int local11 = Static60.method1198(Static34.method652(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			arg0 = Static96.method1688(arg0.anInt2845);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	public static void method405() {
		aClass56_281 = null;
		aClass56_284 = null;
		aClass44_Sub1_18 = null;
		aClass3_Sub1_Sub1_Sub2_2 = null;
		aClass3_Sub1_Sub1_Sub4_12 = null;
		client.anIntArray33 = null;
		aClass52_12 = null;
		aClass56_279 = null;
		aClass56_285 = null;
		aClass56_283 = null;
		aClass56_278 = null;
		aClass56_277 = null;
		aClass3_Sub1_Sub1_Sub2Array14 = null;
		aClass56_280 = null;
		aClass56_282 = null;
		aClass44_10 = null;
	}
}
