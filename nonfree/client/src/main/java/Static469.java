import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
	public static int anInt8066;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_12 = new Class273(2, 4, 4, 0);

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "[S")
	public static short[] aShortArray138 = new short[256];

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString68 = "";

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString69 = null;

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_127 = new Class6(58, 8);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLclient!kda;I)Lclient!fd;")
	public static Class86 method6840(@OriginalArg(0) int arg0, @OriginalArg(2) Class160 arg1) {
		@Pc(14) byte[] local14 = arg1.method4198(0, arg0);
		return local14 == null ? null : new Class86(local14);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BC)Z")
	public static boolean method6842(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZIZI)I")
	public static int method6843(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class1_Sub49 local8 = Static393.method5919(false, arg1);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local8.anIntArray747.length; local16++) {
			if (local8.anIntArray747[local16] >= 0 && Static454.aClass153_2.anInt4594 > local8.anIntArray747[local16]) {
				@Pc(44) Class192 local44 = Static454.aClass153_2.method4007(local8.anIntArray747[local16]);
				@Pc(54) int local54 = local44.method5020(Static162.aClass98_11.method3006(arg2).anInt4335, arg2);
				if (arg0) {
					local14 += local8.anIntArray746[local16] * local54;
				} else {
					local14 += local54;
				}
			}
		}
		return local14;
	}
}
