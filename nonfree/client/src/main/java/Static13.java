import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "Lclient!sd;")
	public static Class29 aClass29_10;

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!mb;")
	public static Class45 aClass45_196 = Static63.method1251("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	public static int anInt415 = 0;

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "Lclient!mb;")
	public static Class45 aClass45_197 = Static63.method1251("::noclip");

	@OriginalMember(owner = "client!cd", name = "F", descriptor = "Lclient!mb;")
	private static Class45 aClass45_198 = Static63.method1251("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!cd", name = "G", descriptor = "Lclient!mb;")
	private static Class45 aClass45_199 = Static63.method1251("Loading config )2 ");

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "Lclient!mb;")
	public static Class45 aClass45_200 = aClass45_198;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "Lclient!mb;")
	public static Class45 aClass45_201 = Static63.method1251("T");

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "Lclient!mb;")
	public static Class45 aClass45_202 = aClass45_199;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "[I")
	public static int[] anIntArray55 = new int[5];

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public static void method264() {
		aClass45_200 = null;
		aClass29_10 = null;
		anIntArray55 = null;
		aClass45_198 = null;
		aClass45_197 = null;
		aClass45_199 = null;
		aClass45_201 = null;
		aClass45_196 = null;
		aClass45_202 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Lclient!db;")
	public static Class5_Sub2_Sub5 method265(@OriginalArg(1) int arg0) {
		@Pc(6) Class5_Sub2_Sub5 local6 = (Class5_Sub2_Sub5) Static121.aClass67_19.method1823((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static12.aClass29_82.method733(arg0, 1);
		local6 = new Class5_Sub2_Sub5();
		if (local25 != null) {
			local6.method383(arg0, new Class5_Sub9(local25));
		}
		local6.method381();
		Static121.aClass67_19.method1818(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;IBZLclient!sd;)Lclient!qe;")
	public static Class5_Sub2_Sub12 method266(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class29 arg2) {
		@Pc(8) int[] local8 = arg0.method756(arg1);
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < local8.length; local12++) {
			@Pc(25) byte[] local25 = arg0.method749(local8[local12], arg1);
			if (local25 == null) {
				local10 = false;
			} else {
				@Pc(44) int local44 = (local25[0] & 0xFF) << 8 | local25[1] & 0xFF;
				@Pc(52) byte[] local52 = arg2.method749(0, local44);
				if (local52 == null) {
					local10 = false;
				}
			}
		}
		if (!local10) {
			return null;
		}
		try {
			return new Class5_Sub2_Sub12(arg0, arg2, arg1, false);
		} catch (@Pc(85) Exception local85) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public static void method267() {
		while (true) {
			@Pc(10) Class10 local10 = Static19.aClass10_4;
			@Pc(19) Class5_Sub14 local19;
			synchronized (Static19.aClass10_4) {
				local19 = (Class5_Sub14) Static61.aClass10_8.method229();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass29_Sub1_26.method773((int) local19.aLong146, false, local19.aClass68_3, local19.aByteArray26);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)I")
	public static int method268(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)I")
	public static int method269() {
		return 6;
	}
}
