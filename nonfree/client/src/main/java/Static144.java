import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!el", name = "H", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_25 = new Class305(56, 8);

	@OriginalMember(owner = "client!el", name = "K", descriptor = "[I")
	public static final int[] anIntArray129 = new int[250];

	@OriginalMember(owner = "client!el", name = "R", descriptor = "I")
	public static int anInt2921 = -1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Lclient!uaa;")
	public static Class345 method2595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class345 local7 = Static264.method4120(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass345Array1 == null || local7.aClass345Array1.length <= arg1) {
			return null;
		} else {
			return local7.aClass345Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!wm;B)V")
	public static void method2596(@OriginalArg(0) Class390 arg0) {
		Static162.anInt3301 = 0;
		Static102.anInt2210 = 0;
		Static288.aClass156_3 = new Class156();
		Static133.aClass28_Sub3_Sub1_Sub1Array1 = new Class28_Sub3_Sub1_Sub1[1024];
		Static529.aClass28_Sub5Array5 = new Class28_Sub5[Static637.anIntArray563[Static537.anInt3990] + 1];
		Static75.anInt1090 = 0;
		Static678.anInt10875 = 0;
		Static13.method7326(arg0);
		Static375.method5608(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)I")
	public static int method2598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg1 < arg0) {
			local14 = arg1;
			arg1 = arg0;
			arg0 = local14;
		}
		while (arg0 != 0) {
			local14 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local14;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BB)C")
	public static char method2600(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static528.aCharArray14[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!wm;IB)Lclient!pu;")
	public static Class50 method2605(@OriginalArg(0) Class390 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class50 local15 = (Class50) Static142.aClass340_15.method7999((long) arg1);
		if (local15 == null) {
			if (Static212.aBoolean330) {
				local15 = Static208.aClass65_7.method6898(Static689.method8548(arg0, arg1), true);
			} else {
				local15 = Static67.method916(arg0.method8923(arg1));
			}
			Static142.aClass340_15.method7986((long) arg1, local15);
		}
		return local15;
	}
}
