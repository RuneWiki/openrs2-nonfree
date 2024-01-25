import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!mu;")
	public static Class155 aClass155_2;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public static int anInt6924;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Lclient!oj;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "J")
	public static long aLong212;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
	public static int anInt6931;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "[B")
	public static final byte[] aByteArray99 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!iv;B)Lclient!vq;")
	public static Class257 method5378(@OriginalArg(0) Class4_Sub12 arg0) {
		@Pc(15) Class257 local15 = new Class257();
		local15.anInt7070 = arg0.method2536();
		local15.aClass4_Sub1_Sub3_1 = Static445.aClass81_2.method2258(local15.anInt7070);
		return local15;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)V")
	public static void method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass16_Sub2_2 != null) {
			local7.aClass16_Sub2_2 = null;
		}
		if (local7.aClass16_Sub2_3 != null) {
			local7.aClass16_Sub2_3 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V")
	public static void method5383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static429.method5476(Static228.aClass215_30);
		}
		if (arg1 == 1) {
			Static429.method5476(Static88.aClass215_20);
		}
		Static3.aClass4_Sub12_Sub1_5.method2551(Static384.aClass244_1.method5489(82) ? 1 : 0);
		Static3.aClass4_Sub12_Sub1_5.method2524(arg0 + Static180.anInt3453);
		Static3.aClass4_Sub12_Sub1_5.method2524(arg2 + Static86.anInt1771);
		Static60.anInt1094 = arg2;
		Static343.anInt771 = arg0;
		Static350.aBoolean556 = false;
		Static75.method1365();
	}
}
