import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_72 = new Class244(5, 2);

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "[I")
	public static final int[] anIntArray570 = new int[250];

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
	public static int anInt5150 = 0;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	public static int anInt5152 = -2;

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg0 < 1 || Static12.anInt161 - 2 < arg7 || arg0 > Static44.anInt787 - 2) {
			return;
		}
		@Pc(29) int local29 = arg1;
		if (arg1 < 3 && Static25.method318(arg7, arg0)) {
			local29 = arg1 + 1;
		}
		if (!Static164.aClass154_Sub1_1.method5400(Static2.anInt68) && !Static11.method5237(Static24.anInt332, arg0, local29, arg7)) {
			return;
		}
		if (Static69.aClass48ArrayArrayArray1 == null) {
			return;
		}
		Static198.aClass117_Sub1_3.method2448(arg4, arg0, Static160.aClass67Array3[arg1], arg7, arg1, Static347.aClass155_9);
		if (arg5 >= 0) {
			@Pc(75) boolean local75 = Static164.aClass154_Sub1_1.aBoolean475;
			Static164.aClass154_Sub1_1.aBoolean475 = true;
			Static198.aClass117_Sub1_3.method2446(arg0, arg5, arg1, arg7, arg6, Static347.aClass155_9, local29, Static160.aClass67Array3[arg1], arg3, arg2);
			Static164.aClass154_Sub1_1.aBoolean475 = local75;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4598(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(40) long local40 = arg0;
			while (local40 != 0L) {
				local40 /= 37L;
				local31++;
			}
			@Pc(58) StringBuffer local58 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(62) long local62 = arg0;
				arg0 /= 37L;
				@Pc(76) char local76 = Static82.aCharArray4[(int) (local62 - arg0 * 37L)];
				if (local76 == '_') {
					@Pc(86) int local86 = local58.length() - 1;
					local58.setCharAt(local86, Character.toUpperCase(local58.charAt(local86)));
					local76 = ' ';
				}
				local58.append(local76);
			}
			local58.reverse();
			local58.setCharAt(0, Character.toUpperCase(local58.charAt(0)));
			return local58.toString();
		}
	}
}
