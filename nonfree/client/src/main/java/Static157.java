import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	public static int anInt2942;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "Lclient!rn;")
	public static Class155 aClass155_64;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!l;")
	public static Class98 aClass98_24 = new Class98(64);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ua;Lclient!ug;B)V")
	public static void method2608(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class3_Sub26 arg2) {
		@Pc(5) Class3_Sub19 local5 = new Class3_Sub19();
		local5.anInt2790 = arg2.method3915();
		local5.anInt2792 = arg2.method3896();
		local5.anIntArray322 = new int[local5.anInt2790];
		local5.aClass178Array2 = new Class178[local5.anInt2790];
		local5.anIntArray323 = new int[local5.anInt2790];
		local5.aClass178Array1 = new Class178[local5.anInt2790];
		local5.anIntArray324 = new int[local5.anInt2790];
		local5.aByteArrayArrayArray16 = new byte[local5.anInt2790][][];
		for (@Pc(57) int local57 = 0; local57 < local5.anInt2790; local57++) {
			try {
				@Pc(65) int local65 = arg2.method3915();
				@Pc(91) String local91;
				@Pc(95) String local95;
				@Pc(99) int local99;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local99 = 0;
					local91 = arg2.method3931();
					local95 = arg2.method3931();
					if (local65 == 1) {
						local99 = arg2.method3896();
					}
					local5.anIntArray322[local57] = local65;
					local5.anIntArray323[local57] = local99;
					local5.aClass178Array1[local57] = arg1.method4513(Static251.method4245(local91), local95);
				} else if (local65 == 3 || local65 == 4) {
					local91 = arg2.method3931();
					local95 = arg2.method3931();
					local99 = arg2.method3915();
					@Pc(102) String[] local102 = new String[local99];
					for (@Pc(104) int local104 = 0; local104 < local99; local104++) {
						local102[local104] = arg2.method3931();
					}
					@Pc(123) byte[][] local123 = new byte[local99][];
					@Pc(142) int local142;
					if (local65 == 3) {
						for (@Pc(131) int local131 = 0; local131 < local99; local131++) {
							local142 = arg2.method3896();
							local123[local131] = new byte[local142];
							arg2.method3935(local142, local123[local131]);
						}
					}
					local5.anIntArray322[local57] = local65;
					@Pc(166) Class[] local166 = new Class[local99];
					for (local142 = 0; local142 < local99; local142++) {
						local166[local142] = Static251.method4245(local102[local142]);
					}
					local5.aClass178Array2[local57] = arg1.method4519(local166, local95, Static251.method4245(local91));
					local5.aByteArrayArrayArray16[local57] = local123;
				}
			} catch (@Pc(246) ClassNotFoundException local246) {
				local5.anIntArray324[local57] = -1;
			} catch (@Pc(253) SecurityException local253) {
				local5.anIntArray324[local57] = -2;
			} catch (@Pc(260) NullPointerException local260) {
				local5.anIntArray324[local57] = -3;
			} catch (@Pc(267) Exception local267) {
				local5.anIntArray324[local57] = -4;
			} catch (@Pc(274) Throwable local274) {
				local5.anIntArray324[local57] = -5;
			}
		}
		Static155.aClass56_10.method1282(local5);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method2610() {
		@Pc(5) String local5 = "www";
		if (Static252.anInt5207 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(21) String local21 = "";
		if (Static62.aString50 != null) {
			local21 = "/p=" + Static62.aString50;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static134.anInt4352 + "/a=" + Static60.anInt723 + local21 + "/";
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lclient!jl;")
	public static Class88 method2611(@OriginalArg(1) int arg0) {
		@Pc(18) Class88 local18 = (Class88) Static28.aClass98_6.method2570((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(29) byte[] local29 = Static204.aClass155_86.method4121(3, arg0);
		local18 = new Class88();
		if (local29 != null) {
			local18.method2323(new Class3_Sub26(local29));
		}
		Static28.aClass98_6.method2568(local18, (long) arg0);
		return local18;
	}
}
