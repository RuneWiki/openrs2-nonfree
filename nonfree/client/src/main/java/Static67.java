import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ds", name = "R", descriptor = "Lclient!i;")
	public static Class108 aClass108_3;

	@OriginalMember(owner = "client!ds", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ds", name = "L", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_32 = new Class77(75, 3);

	@OriginalMember(owner = "client!ds", name = "P", descriptor = "J")
	public static long aLong47 = 0L;

	@OriginalMember(owner = "client!ds", name = "U", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_49 = new Class221(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Lclient!ll;")
	public static Class143 method1240(@OriginalArg(1) int arg0) {
		@Pc(14) Class143[] local14 = Static286.method4399();
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class143 local22 = local14[local16];
			if (arg0 == local22.anInt3718) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)Z")
	public static boolean method1242() {
		return Static35.anInt745 == 0 ? Static222.aClass2_Sub2_Sub3_1.method3420() : true;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!fc;I)Lclient!gr;")
	public static Class91 method1243(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1) {
		@Pc(9) byte[] local9 = arg1.method1555(arg0, 0);
		return local9 == null ? null : new Class91(local9);
	}
}
