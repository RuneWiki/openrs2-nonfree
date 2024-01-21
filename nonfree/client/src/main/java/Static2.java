import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
	public static boolean aBoolean1;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!md;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_2;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_12 = Static33.method650("p11_full");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!oa;")
	private static Class56 aClass56_15 = Static33.method650("glow3:");

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_13 = aClass56_15;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!oa;")
	private static Class56 aClass56_18 = Static33.method650("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_14 = aClass56_18;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_16 = Static33.method650("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "Lclient!oa;")
	private static Class56 aClass56_21 = Static33.method650("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_17 = aClass56_21;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!oa;")
	public static Class56 aClass56_19 = aClass56_15;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Lclient!oa;")
	public static Class56 aClass56_20 = Static33.method650("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "Z")
	private static boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILclient!td;IIIB)V")
	public static void method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub16 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (aBoolean2) {
			Static44.anInt1162 = 32;
		} else {
			Static44.anInt1162 = 0;
		}
		aBoolean2 = false;
		@Pc(157) int local157;
		if (arg2 <= arg5 && arg2 + 16 > arg5 && arg1 <= arg7 && arg1 + 16 > arg7) {
			if (arg6 == 1) {
				Static115.aBoolean157 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				Static12.aBoolean17 = true;
			}
			arg4.anInt2806 -= Static49.anInt1493 * 4;
		} else if (arg2 <= arg5 && arg5 < arg2 + 16 && arg7 >= arg0 + arg1 - 16 && arg0 + arg1 > arg7) {
			if (arg6 == 1) {
				Static115.aBoolean157 = true;
			}
			arg4.anInt2806 += Static49.anInt1493 * 4;
			if (arg6 == 2 || arg6 == 3) {
				Static12.aBoolean17 = true;
			}
		} else if (arg5 >= arg2 - Static44.anInt1162 && Static44.anInt1162 + arg2 + 16 > arg5 && arg1 + 16 <= arg7 && arg7 < arg0 + arg1 - 16 && Static49.anInt1493 > 0) {
			if (arg6 == 2 || arg6 == 3) {
				Static12.aBoolean17 = true;
			}
			if (arg6 == 1) {
				Static115.aBoolean157 = true;
			}
			aBoolean2 = true;
			local157 = arg0 * (arg0 - 32) / arg3;
			if (local157 < 8) {
				local157 = 8;
			}
			@Pc(169) int local169 = arg0 - local157 - 32;
			@Pc(180) int local180 = arg7 - arg1 - local157 / 2 - 16;
			arg4.anInt2806 = local180 * (arg3 - arg0) / local169;
		}
		if (Static123.anInt3045 == 0) {
			return;
		}
		local157 = arg4.anInt2854;
		if (arg6 == -1) {
			local157 = 479;
		}
		if (arg5 < arg2 - local157 || arg1 > arg7 || arg5 >= arg2 + 16 || arg7 > arg0 + arg1) {
			return;
		}
		if (arg6 == 2 || arg6 == 3) {
			Static12.aBoolean17 = true;
		}
		arg4.anInt2806 += Static123.anInt3045 * 45;
		if (arg6 == 1) {
			Static115.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
	public static boolean method15(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0 && arg0 == Static51.anInt1495) {
			return true;
		} else if (arg1 == 1 && arg0 == Static12.anInt300) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static79.anInt2111;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!o;")
	public static Class3_Sub1_Sub10 method16(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub10 local15 = (Class3_Sub1_Sub10) Static45.aClass52_27.method1342((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static79.aClass44_47.method1146(1, arg0);
		local15 = new Class3_Sub1_Sub10();
		if (local25 != null) {
			local15.method1409(new Class3_Sub2(local25), arg0);
		}
		local15.method1412();
		Static45.aClass52_27.method1344(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method18() {
		aClass56_13 = null;
		aClass56_21 = null;
		aClass56_15 = null;
		aClass56_20 = null;
		aClass56_16 = null;
		aClass44_Sub1_2 = null;
		aClass56_19 = null;
		aClass56_12 = null;
		aClass56_18 = null;
		aClass30_1 = null;
		aClass56_17 = null;
		aClass56_14 = null;
		aClass44_Sub1_1 = null;
	}
}
