import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!gj;")
	public static Class31 aClass31_23;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Lclient!js;")
	public static Class105 aClass105_1;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
	public static int anInt792;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt780 = 0;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_10 = new Class93("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "[I")
	public static final int[] anIntArray77 = new int[13];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZILjava/awt/Component;Lclient!rd;)Lclient!ir;")
	public static Class94 method936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class168 arg3) {
		if (Static65.anInt1429 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class94 local35 = (Class94) Class.forName("Class94_Sub1").getDeclaredConstructor().newInstance();
			local35.anInt6954 = arg1;
			local35.anIntArray508 = new int[(Static18.aBoolean55 ? 2 : 1) * 256];
			local35.method5977(arg2);
			local35.anInt6953 = (arg1 & 0xFFFFFC00) + 1024;
			if (local35.anInt6953 > 16384) {
				local35.anInt6953 = 16384;
			}
			local35.method5968(local35.anInt6953);
			if (Static283.anInt5721 > 0 && Static290.aClass135_1 == null) {
				Static290.aClass135_1 = new Class135();
				Static290.aClass135_1.aClass168_3 = arg3;
				arg3.method4856(Static290.aClass135_1, Static283.anInt5721);
			}
			if (Static290.aClass135_1 != null) {
				if (Static290.aClass135_1.aClass94Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static290.aClass135_1.aClass94Array1[arg0] = local35;
			}
			return local35;
		} catch (@Pc(115) Throwable local115) {
			try {
				@Pc(121) Class94_Sub2 local121 = new Class94_Sub2(arg3, arg0);
				local121.anIntArray508 = new int[(Static18.aBoolean55 ? 2 : 1) * 256];
				local121.anInt6954 = arg1;
				local121.method5977(arg2);
				local121.anInt6953 = 16384;
				local121.method5968(local121.anInt6953);
				if (Static283.anInt5721 > 0 && Static290.aClass135_1 == null) {
					Static290.aClass135_1 = new Class135();
					Static290.aClass135_1.aClass168_3 = arg3;
					arg3.method4856(Static290.aClass135_1, Static283.anInt5721);
				}
				if (Static290.aClass135_1 != null) {
					if (Static290.aClass135_1.aClass94Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static290.aClass135_1.aClass94Array1[arg0] = local121;
				}
				return local121;
			} catch (@Pc(180) Throwable local180) {
				return new Class94();
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
	public static boolean method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static26.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == -Static90.anInt5360) {
			return false;
		} else if (local7 == Static90.anInt5360) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static97.method5912(local22 + 1, Static301.aClass73Array31[arg0].method4931(arg1, arg2), local26 + 1) && Static97.method5912(local22 + 128 - 1, Static301.aClass73Array31[arg0].method4931(arg1 + 1, arg2), local26 + 1) && Static97.method5912(local22 + 128 - 1, Static301.aClass73Array31[arg0].method4931(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static97.method5912(local22 + 1, Static301.aClass73Array31[arg0].method4931(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static26.anIntArrayArrayArray1[arg0][arg1][arg2] = Static90.anInt5360;
				return true;
			} else {
				Static26.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static90.anInt5360;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)S")
	public static short method939(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(41) int local41 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(45) int local45 = local19 + local41;
		@Pc(53) int local53;
		if (local45 == 0) {
			local53 = local41 << 1;
		} else {
			local53 = (local41 << 8) / local45;
		}
		return (short) (local9 << 10 | local53 >> 4 << 7 | local45);
	}
}
