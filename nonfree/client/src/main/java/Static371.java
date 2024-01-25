import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!gp;")
	public static Class117 aClass117_157;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_106 = new Class40(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!oh;I)V")
	public static void method5605(@OriginalArg(0) Class220 arg0) {
		if (arg0.anInt6618 != Static67.anInt9072) {
			return;
		}
		if (Static35.aClass15_Sub2_Sub1_Sub1_1.aString18 == null) {
			arg0.anInt6637 = 0;
			arg0.anInt6612 = 0;
			return;
		}
		arg0.anInt6683 = 150;
		arg0.anInt6617 = (int) (Math.sin((double) Static481.anInt8318 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6612 = Static510.anInt8653;
		arg0.anInt6675 = 5;
		arg0.anInt6637 = Static449.method6335(Static35.aClass15_Sub2_Sub1_Sub1_1.aString18);
		arg0.anInt6649 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt4682;
		arg0.anInt6643 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt4725;
		arg0.anInt6604 = Static35.aClass15_Sub2_Sub1_Sub1_1.anInt4703;
		arg0.anInt6619 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIZJIILjava/lang/String;ZLjava/lang/String;)V")
	public static void method5606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9) {
		if (!Static218.aBoolean250 && Static257.anInt5147 < 500) {
			@Pc(16) int local16 = arg0 == -1 ? Static92.anInt2142 : arg0;
			@Pc(30) Class5_Sub47 local30 = new Class5_Sub47(arg7, arg9, local16, arg2, arg3, arg5, arg6, arg1, arg4, arg8);
			Static521.aClass99_78.method2513(local30);
			Static257.anInt5147++;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method5607(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
