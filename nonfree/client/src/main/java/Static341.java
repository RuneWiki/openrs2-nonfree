import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_110 = new Class286(14, 3);

	@OriginalMember(owner = "client!mo", name = "E", descriptor = "Lclient!lt;")
	public static final Class213 aClass213_5 = new Class213();

	@OriginalMember(owner = "client!mo", name = "F", descriptor = "Z")
	public static boolean aBoolean494 = true;

	@OriginalMember(owner = "client!mo", name = "G", descriptor = "[S")
	public static final short[] aShortArray97 = new short[] { 8, 12, 49, 59, 15, 3, 9, 44 };

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!pl;IZLjava/lang/String;)Lclient!rn;")
	public static Class288 method5172(@OriginalArg(0) Class259 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg0.method5961(arg2);
		if (local10 == -1) {
			return new Class288(0);
		}
		@Pc(24) int[] local24 = arg0.method5973(local10);
		@Pc(30) Class288 local30 = new Class288(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt7989 > local32) {
				@Pc(50) Class2_Sub15 local50 = new Class2_Sub15(arg0.method5985(local24[local34++], local10));
				@Pc(54) int local54 = local50.method4307();
				@Pc(58) int local58 = local50.method4294();
				@Pc(62) int local62 = local50.method4325();
				if (!arg1 && local62 == 1) {
					local30.anInt7989--;
				} else {
					local30.anIntArray530[local32] = local54;
					local30.anIntArray528[local32] = local58;
					local32++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLclient!ni;)V")
	public static void method5173(@OriginalArg(1) Class6_Sub1_Sub1_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt7415 - Static412.anInt575;
		@Pc(26) int local26 = arg0.anInt7340 * 512 + arg0.method6165() * 256;
		@Pc(37) int local37 = arg0.anInt7397 * 512 + arg0.method6165() * 256;
		arg0.anInt7421 = 0;
		arg0.anInt8761 += (local26 - arg0.anInt8761) / local14;
		arg0.anInt8764 += (local37 - arg0.anInt8764) / local14;
		if (arg0.anInt7367 == 0) {
			arg0.method6163(8192);
		}
		if (arg0.anInt7367 == 1) {
			arg0.method6163(12288);
		}
		if (arg0.anInt7367 == 2) {
			arg0.method6163(0);
		}
		if (arg0.anInt7367 == 3) {
			arg0.method6163(4096);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5174(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(36) int local36 = arg0.indexOf(" ", "directlogin ".length());
			if (local36 >= 0) {
				@Pc(41) int local41 = arg0.length();
				arg0 = arg0.substring(0, local36) + " ";
				for (@Pc(57) int local57 = local36 + 1; local57 < local41; local57++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}
}
