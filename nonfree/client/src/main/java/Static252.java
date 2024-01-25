import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!uda;")
	public static final Class292 aClass292_9 = new Class292(3);

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	public static final int anInt4917 = 50;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
	public static final int[] anIntArray472 = new int[anInt4917];

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!im;")
	public static final Class140 aClass140_73 = new Class140(9, 0);

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "[I")
	public static final int[] anIntArray473 = new int[anInt4917];

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "[I")
	public static final int[] anIntArray474 = new int[anInt4917];

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[C")
	public static final char[] aCharArray27 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
	public static final int[] anIntArray475 = new int[anInt4917];

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "[I")
	public static final int[] anIntArray476 = new int[anInt4917];

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
	public static final int[] anIntArray477 = new int[anInt4917];

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[anInt4917];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZII)Lclient!of;")
	public static Class1_Sub35 method4236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub35 local7 = new Class1_Sub35();
		local7.anInt6103 = arg1;
		local7.anInt6102 = arg0;
		Static468.aClass17_36.method737(local7, (long) arg3);
		Static475.method5209(arg1);
		@Pc(31) Class156 local31 = Static182.method2888(arg3);
		if (local31 != null) {
			Static473.method6593(local31);
		}
		if (Static64.aClass156_3 != null) {
			Static473.method6593(Static64.aClass156_3);
			Static64.aClass156_3 = null;
		}
		Static309.method4868();
		if (local31 != null) {
			Static193.method6045(local31, !arg2);
		}
		if (!arg2) {
			Static180.method2684(arg1);
		}
		if (!arg2 && Static170.anInt3050 != -1) {
			Static168.method4650(1, Static170.anInt3050);
		}
		return local7;
	}
}
