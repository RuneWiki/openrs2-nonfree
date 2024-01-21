import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Lclient!ld;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
	public static int[] anIntArray247 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!af;")
	private static Class5 aClass5_788 = Static45.method1937("Login");

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "Lclient!af;")
	public static Class5 aClass5_785 = aClass5_788;

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lclient!af;")
	public static Class5 aClass5_786 = Static45.method1937(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "Lclient!af;")
	public static Class5 aClass5_787 = Static45.method1937("title_mute");

	@OriginalMember(owner = "client!kd", name = "Hb", descriptor = "J")
	public static long aLong48 = 0L;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_42 = null;

	@OriginalMember(owner = "client!kd", name = "Ub", descriptor = "Lclient!af;")
	public static Class5 aClass5_789 = Static45.method1937("Clientscript error in: ");

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public static void method1147() {
		aClass1_Sub17_42 = null;
		aClass5_789 = null;
		aClass5_788 = null;
		aClass5_787 = null;
		aClass5_785 = null;
		aBooleanArray18 = null;
		aClass5_786 = null;
		anIntArray247 = null;
		aClass47_1 = null;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2 method1167() {
		@Pc(9) Class1_Sub3_Sub1_Sub2 local9 = new Class1_Sub3_Sub1_Sub2();
		local9.anInt1014 = Static75.anIntArray290[0];
		local9.anInt1015 = Static76.anIntArray296[0];
		local9.anInt1016 = Static48.anIntArray196[0];
		local9.anInt1018 = Static109.anIntArray409[0];
		local9.anInt1013 = Static116.anInt2900;
		@Pc(38) int local38 = local9.anInt1015 * local9.anInt1018;
		local9.anInt1017 = Static11.anInt327;
		@Pc(45) byte[] local45 = Static73.aByteArrayArray7[0];
		local9.anIntArray171 = new int[local38];
		for (@Pc(51) int local51 = 0; local51 < local38; local51++) {
			local9.anIntArray171[local51] = Static27.anIntArray97[local45[local51] & 0xFF];
		}
		Static50.method890();
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBII)I")
	public static int method1170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg1 / 32 << 7) + (arg0 / 4 << 10) + arg2 / 2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kb;BII)Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 method1171(@OriginalArg(0) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static58.method1055(arg2, arg1, arg0) ? Static36.method682() : null;
	}
}
