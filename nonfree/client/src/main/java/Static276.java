import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
	public static int anInt5860;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
	public static final int anInt5848 = 50;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "[I")
	public static final int[] anIntArray353 = new int[anInt5848];

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "[I")
	public static final int[] anIntArray354 = new int[anInt5848];

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "Lclient!ffa;")
	public static final Class100 aClass100_4 = new Class100();

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "[I")
	public static final int[] anIntArray355 = new int[1000];

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "[I")
	public static final int[] anIntArray356 = new int[anInt5848];

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[anInt5848];

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "[I")
	public static final int[] anIntArray357 = new int[anInt5848];

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
	public static final int[] anIntArray358 = new int[anInt5848];

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "[I")
	public static final int[] anIntArray359 = new int[anInt5848];

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_59 = new Class230(0, 7);

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_70 = new Class276(104, 7);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(CB)Z")
	public static boolean method4818(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ji;Ljava/lang/String;II)Lclient!mt;")
	public static Class218 method4820(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static449.anIntArray519, 0);
		if (Static449.anIntArray519[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class218(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static464.anInt8682 = arg1;
		Static439.anInt8397 = arg2;
		Static34.anInt967 = arg4;
		Static480.anInt8972 = arg3;
		Static332.anInt6909 = arg0;
		if (Static332.anInt6909 >= 100) {
			@Pc(28) int local28 = Static464.anInt8682 * 512 + 256;
			@Pc(34) int local34 = Static480.anInt8972 * 512 + 256;
			@Pc(43) int local43 = Static274.method4782(local34, Static212.anInt4380, local28) - Static439.anInt8397;
			@Pc(48) int local48 = local28 - Static594.anInt10391;
			@Pc(53) int local53 = local43 - Static360.anInt1771;
			@Pc(58) int local58 = local34 - Static496.anInt9269;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local58 * local58 + local48 * local48));
			Static522.anInt9554 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static104.anInt2511 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			if (Static522.anInt9554 < 1024) {
				Static522.anInt9554 = 1024;
			}
			Static235.anInt4860 = 0;
			if (Static522.anInt9554 > 3072) {
				Static522.anInt9554 = 3072;
			}
		}
		Static267.anInt5668 = 2;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIIILclient!cn;)V")
	public static void method4822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub10 arg3) {
		@Pc(14) long local14 = (long) (arg2 << 14 | arg0 << 28 | arg1);
		@Pc(20) Class3_Sub30 local20 = (Class3_Sub30) Static30.aClass25_5.method946(local14);
		if (local20 == null) {
			local20 = new Class3_Sub30();
			Static30.aClass25_5.method945(local20, local14);
			local20.aClass183_37.method4792(arg3);
			return;
		}
		@Pc(48) Class18 local48 = Static517.aClass23_2.method901(arg3.anInt1852);
		@Pc(51) int local51 = local48.anInt619;
		if (local48.anInt680 == 1) {
			local51 *= arg3.anInt1853 + 1;
		}
		for (@Pc(70) Class3_Sub10 local70 = (Class3_Sub10) local20.aClass183_37.method4795(); local70 != null; local70 = (Class3_Sub10) local20.aClass183_37.method4793()) {
			local48 = Static517.aClass23_2.method901(local70.anInt1852);
			@Pc(80) int local80 = local48.anInt619;
			if (local48.anInt680 == 1) {
				local80 *= local70.anInt1853 + 1;
			}
			if (local80 < local51) {
				Static552.method8061(local70, arg3);
				return;
			}
		}
		local20.aClass183_37.method4792(arg3);
	}
}
