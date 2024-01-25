import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array11;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_61 = new Class221(22, 12);

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_50 = new Class157(48, 11);

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
	public static final int[] anIntArray123 = new int[32];

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_51 = new Class157(66, 3);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZLclient!sc;Ljava/lang/String;Z)V")
	public static void method1596(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class179 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg0) {
			Static360.method5741(arg2, arg1, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static293.aString57.startsWith("win") && Static293.anInt5826 != 3) {
			local14 = null;
			if (arg1.anApplet1 != null) {
				local14 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(34) Class26 local34 = Static360.method5741(arg2, arg1, 0);
				Static126.aString27 = arg2;
				Static43.aClass179_3 = arg1;
				Static17.aClass26_1 = local34;
				return;
			}
		}
		if (Static293.aString57.startsWith("mac")) {
			local14 = null;
			if (arg1.anApplet1 != null) {
				local14 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg3) {
				Static360.method5741(arg2, arg1, 1);
				return;
			}
		}
		Static360.method5741(arg2, arg1, 2);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1597(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static306.anInt4216 > 0) {
			local21 = Static251.aByteArrayArray13[--Static306.anInt4216];
			Static251.aByteArrayArray13[Static306.anInt4216] = null;
			return local21;
		} else if (arg0 == 5000 && Static43.anInt2554 > 0) {
			local21 = Static287.aByteArrayArray19[--Static43.anInt2554];
			Static287.aByteArrayArray19[Static43.anInt2554] = null;
			return local21;
		} else if (arg0 == 30000 && Static201.anInt4410 > 0) {
			local21 = Static285.aByteArrayArray18[--Static201.anInt4410];
			Static285.aByteArrayArray18[Static201.anInt4410] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIB)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static290.anInt5812 = arg1;
		Static28.anInt435 = arg2;
		Static176.anInt3972 = arg0;
		Static115.anInt2454 = arg3;
	}
}
