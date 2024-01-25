import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[Lclient!vu;")
	public static Class5_Sub1_Sub21[] aClass5_Sub1_Sub21Array1;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!d;")
	public static Interface7 anInterface7_8;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "Lclient!jm;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!vh;")
	public static final Class377 aClass377_1 = new Class377();

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
	public static final int[] anIntArray311 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public static int anInt5207 = 0;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIIZ)V")
	public static void method4692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static20.method345(arg1)) {
			Static537.method7384(arg3, Static397.aClass238ArrayArray2[arg1], -1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method4693() {
		Static265.method4290(Static273.aClass100_6, (long) Static565.anInt8921);
		if (Static381.anInt6411 != -1) {
			Static57.method1021(Static381.anInt6411);
		}
		for (@Pc(20) int local20 = 0; local20 < Static171.anInt5360; local20++) {
			if (Static325.aBooleanArray15[local20]) {
				Static528.aBooleanArray23[local20] = true;
			}
			Static38.aBooleanArray1[local20] = Static325.aBooleanArray15[local20];
			Static325.aBooleanArray15[local20] = false;
		}
		Static547.anInt8691 = Static565.anInt8921;
		if (Static381.anInt6411 != -1) {
			Static171.anInt5360 = 0;
			Static7.method122();
		}
		Static273.aClass100_6.la();
		Static567.method7658(Static273.aClass100_6);
		@Pc(71) int local71 = Static542.method7428();
		if (local71 == -1) {
			local71 = Static586.anInt9462;
		}
		if (local71 == -1) {
			local71 = Static27.anInt363;
		}
		Static310.method4802(local71);
		Static675.anInt10854 = 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!mj;)Lclient!mj;")
	public static Class238 method4694(@OriginalArg(1) Class238 arg0) {
		if (arg0.anInt5963 != -1) {
			return Static305.method4761(arg0.anInt5963);
		}
		@Pc(22) int local22 = arg0.anInt5971 >>> 16;
		@Pc(27) Class159 local27 = new Class159(Static438.aClass306_31);
		for (@Pc(34) Class5_Sub38 local34 = (Class5_Sub38) local27.method3548(); local34 != null; local34 = (Class5_Sub38) local27.method3550()) {
			if (local34.anInt6418 == local22) {
				return Static305.method4761((int) local34.aLong312);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V")
	public static void method4695() {
		@Pc(15) Class5_Sub41 local15 = Static647.method8905(Static23.aClass381_12, Static4.aClass389_17.aClass393_2);
		Static4.aClass389_17.method9079(local15);
		for (@Pc(26) Class5_Sub38 local26 = (Class5_Sub38) Static438.aClass306_31.method6941(); local26 != null; local26 = (Class5_Sub38) Static438.aClass306_31.method6940()) {
			if (!local26.method9219()) {
				local26 = (Class5_Sub38) Static438.aClass306_31.method6941();
				if (local26 == null) {
					break;
				}
			}
			if (local26.anInt6419 == 0) {
				Static655.method9010(true, local26, true);
			}
		}
		if (Static64.aClass238_1 != null) {
			Static333.method5032(Static64.aClass238_1);
			Static64.aClass238_1 = null;
		}
	}
}
