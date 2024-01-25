import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!sl;Ljava/lang/String;I)I")
	public static int method6755(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) String arg1) {
		@Pc(12) int local12 = arg0.anInt3378;
		@Pc(16) byte[] local16 = Static284.method4523(arg1);
		arg0.method2877(local16.length);
		arg0.anInt3378 += Static618.aClass346_1.method8018(0, local16.length, local16, arg0.aByteArray26, arg0.anInt3378);
		return arg0.anInt3378 - local12;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)Z")
	public static boolean method6756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6757(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static529.method7327(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static289.anInt5236; local23++) {
			@Pc(28) String local28 = Static514.aStringArray44[local23];
			if (local28.startsWith("*")) {
				local28 = local28.substring(1);
			}
			local28 = Static529.method7327(local28);
			if (local28 != null && local28.equals(local18)) {
				Static289.anInt5236--;
				for (@Pc(54) int local54 = local23; local54 < Static289.anInt5236; local54++) {
					Static514.aStringArray44[local54] = Static514.aStringArray44[local54 + 1];
					Static83.aStringArray7[local54] = Static83.aStringArray7[local54 + 1];
					Static521.anIntArray622[local54] = Static521.anIntArray622[local54 + 1];
					Static384.aStringArray31[local54] = Static384.aStringArray31[local54 + 1];
					Static89.anIntArray463[local54] = Static89.anIntArray463[local54 + 1];
					Static471.aBooleanArray22[local54] = Static471.aBooleanArray22[local54 + 1];
				}
				Static76.anInt1945 = Static148.anInt3063;
				@Pc(122) Class2_Sub31 local122 = Static275.method4480(Static640.aClass314_2, Static565.aClass145_164);
				local122.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(arg0));
				local122.aClass2_Sub17_Sub1_2.method2856(arg0);
				Static526.method7309(local122);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;IILclient!bi;)Lclient!jq;")
	public static Class187 method6758(@OriginalArg(0) String arg0, @OriginalArg(3) Class13_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static628.anIntArray725, 0);
		if (Static628.anIntArray725[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class187(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
