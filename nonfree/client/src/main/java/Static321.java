import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static int anInt5494;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt5490 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
	public static int anInt5491 = 0;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Z")
	public static boolean aBoolean622 = false;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_129 = new Class119(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B[Lclient!pi;Lclient!ur;)Lclient!uq;")
	public static Class246 method4318(@OriginalArg(1) Class188[] arg0, @OriginalArg(2) Class34_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong161 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local29, arg0[local36].aLong161);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static450.anIntArray510, 0);
		if (Static450.anIntArray510[0] == 0) {
			if (Static450.anIntArray510[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static450.anIntArray510, 1);
			if (Static450.anIntArray510[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static450.anIntArray510[1]];
				OpenGL.glGetInfoLogARB(local29, Static450.anIntArray510[1], Static450.anIntArray510, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static450.anIntArray510[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg0.length; local112++) {
					OpenGL.glDetachObjectARB(local29, arg0[local112].aLong161);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class246(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public static boolean method4319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	public static boolean method4320(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local33; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local46 >= '0' && local46 <= '9') {
				local74 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local74 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local74 = local46 - 'W';
			} else {
				return false;
			}
			if (local74 >= 10) {
				return false;
			}
			if (local26) {
				local74 = -local74;
			}
			@Pc(114) int local114 = local30 * 10 + local74;
			if (local114 / 10 != local30) {
				return false;
			}
			local30 = local114;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method4321(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static215.anInt4460 = 7;
		Static5.anInt78 = 0x1 << Static215.anInt4460;
		Static341.anInt5832 = Static5.anInt78 >> 1;
		Static309.anInt5377 = (int) Math.sqrt((double) (Static341.anInt5832 * Static341.anInt5832 + Static341.anInt5832 * Static341.anInt5832));
		Static111.anInt2103 = Static5.anInt78 >> 2;
		Static40.anInt698 = Static5.anInt78;
		Static37.anInt666 = arg0;
		Static408.anInt6716 = arg1;
		Static179.anInt3132 = arg2;
		Static7.aClass169ArrayArrayArray1 = new Class169[4][Static37.anInt666][Static408.anInt6716];
		Static330.aClass157Array2 = new Class157[4];
		if (arg3) {
			Static47.anIntArrayArray10 = new int[Static37.anInt666][Static408.anInt6716];
			Static438.aByteArrayArray19 = new byte[Static37.anInt666][Static408.anInt6716];
			Static142.aShortArrayArray4 = new short[Static37.anInt666][Static408.anInt6716];
			Static145.aClass169ArrayArrayArray4 = new Class169[1][Static37.anInt666][Static408.anInt6716];
			Static343.aClass157Array3 = new Class157[1];
		} else {
			Static47.anIntArrayArray10 = null;
			Static438.aByteArrayArray19 = null;
			Static142.aShortArrayArray4 = null;
			Static145.aClass169ArrayArrayArray4 = null;
			Static343.aClass157Array3 = null;
		}
		if (arg4) {
			Static261.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static45.aClass137Array4 = new Class137[65535];
			aBooleanArray19 = new boolean[65535];
			Static358.anInt1533 = 0;
		} else {
			Static261.aLongArrayArrayArray1 = null;
			Static45.aClass137Array4 = null;
			aBooleanArray19 = null;
			Static358.anInt1533 = 0;
		}
		Static253.method3631(false);
		Static78.aClass252Array5 = new Class252[1000];
		Static278.anInt4935 = 0;
		Static443.aClass252Array8 = new Class252[1000];
		Static97.anInt1738 = 0;
		Static271.anIntArrayArrayArray15 = new int[4][Static37.anInt666 + 1][Static408.anInt6716 + 1];
		Static372.aClass25_Sub5Array2 = new Class25_Sub5[5000];
		Static131.anInt2379 = 0;
		Static44.aBooleanArrayArray1 = new boolean[Static179.anInt3132 + Static179.anInt3132 + 1][Static179.anInt3132 + Static179.anInt3132 + 1];
		Static431.aBooleanArrayArray6 = new boolean[Static179.anInt3132 + Static179.anInt3132 + 2][Static179.anInt3132 + Static179.anInt3132 + 2];
		Static344.aClass58_1 = null;
	}
}
