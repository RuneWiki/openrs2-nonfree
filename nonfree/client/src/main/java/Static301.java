import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	public static int anInt5026;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_85 = new Class96("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!qg;IIZII[B)Lclient!ls;")
	public static Class21_Sub2_Sub1 method4106(@OriginalArg(1) Class121_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg0.aBoolean461 || Static362.method5163(arg2) && Static362.method5163(arg1)) {
			return new Class21_Sub2_Sub1(arg0, 3553, 6406, arg2, arg1, false, arg3, 6406);
		} else if (arg0.aBoolean484) {
			return new Class21_Sub2_Sub1(arg0, 34037, 6406, arg2, arg1, false, arg3, 6406);
		} else {
			return new Class21_Sub2_Sub1(arg0, 6406, arg2, arg1, Static30.method427(arg2), Static30.method427(arg1), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method4107(@OriginalArg(0) int[] arg0) {
		@Pc(7) StringBuffer local7 = new StringBuffer();
		@Pc(9) int local9 = Static169.anInt3023;
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(23) Class218 local23 = Static183.aClass30_1.method485(arg0[local11]);
			if (local23.anInt6600 != -1) {
				@Pc(35) Class78 local35 = (Class78) Static320.aClass151_136.method3288((long) local23.anInt6600);
				if (local35 == null) {
					@Pc(43) Class63 local43 = Static457.method1163(Static353.aClass109_79, local23.anInt6600, 0);
					if (local43 != null) {
						local35 = Static447.aClass121_11.method4589(local43);
						Static320.aClass151_136.method3291((long) local23.anInt6600, local35);
					}
				}
				if (local35 != null) {
					Static13.aClass78Array1[local9] = local35;
					local7.append(" <img=").append(local9).append(">");
					local9++;
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	public static int method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}
}
