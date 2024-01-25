import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "Lclient!pr;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
	public static int anInt3345 = 765;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([Lclient!sca;Lclient!gi;I)Lclient!iu;")
	public static Class150 method3025(@OriginalArg(0) Class272[] arg0, @OriginalArg(1) Class42_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong208 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(40) int local40 = 0; local40 < arg0.length; local40++) {
			OpenGL.glAttachObjectARB(local33, arg0[local40].aLong208);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static412.anIntArray553, 0);
		if (Static412.anIntArray553[0] == 0) {
			if (Static412.anIntArray553[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static412.anIntArray553, 1);
			if (Static412.anIntArray553[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static412.anIntArray553[1]];
				OpenGL.glGetInfoLogARB(local33, Static412.anIntArray553[1], Static412.anIntArray553, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static412.anIntArray553[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local33, arg0[local115].aLong208);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class150(arg1, local33, arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	public static void method3026() {
		@Pc(13) int local13 = Static230.aByteArrayArray9.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static230.aByteArrayArray9[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static487.anInt8859; local25++) {
					if (Static443.anIntArray607[local15] == Static141.anIntArray235[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static141.anIntArray235[Static487.anInt8859] = Static443.anIntArray607[local15];
					local23 = Static487.anInt8859++;
				}
				@Pc(72) Class12_Sub8 local72 = new Class12_Sub8(Static230.aByteArrayArray9[local15]);
				@Pc(74) int local74 = 0;
				while (local72.anInt6217 < Static230.aByteArrayArray9[local15].length && local74 < 511 && Static451.anInt4553 < 1023) {
					@Pc(91) int local91 = local74++ << 6 | local23;
					@Pc(95) int local95 = local72.method5199();
					@Pc(99) int local99 = local95 >> 14;
					@Pc(105) int local105 = local95 >> 7 & 0x3F;
					@Pc(109) int local109 = local95 & 0x3F;
					@Pc(122) int local122 = (Static443.anIntArray607[local15] >> 8) * 64 + local105 - Static61.anInt1459;
					@Pc(135) int local135 = local109 + (Static443.anIntArray607[local15] & 0xFF) * 64 - Static203.anInt4534;
					@Pc(142) Class130 local142 = Static161.aClass110_3.method3018(local72.method5199());
					@Pc(149) Class12_Sub41 local149 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local91);
					if (local149 == null && (local142.aByte47 & 0x1) > 0 && local99 == Static415.anInt3783 && local122 >= 0 && Static37.anInt7512 > local122 + local142.anInt4113 && local135 >= 0 && local142.anInt4113 + local135 < Static329.anInt6247) {
						@Pc(196) Class30_Sub1_Sub1_Sub2 local196 = new Class30_Sub1_Sub1_Sub2();
						local196.anInt4197 = local91;
						@Pc(204) Class12_Sub41 local204 = new Class12_Sub41(local196);
						Static29.aClass68_7.method1916(local204, (long) local91);
						Static352.aClass12_Sub41Array1[Static328.anInt6238++] = local204;
						Static11.anIntArray16[Static451.anInt4553++] = local91;
						local196.anInt4151 = Static409.anInt7683;
						local196.method3609(local142);
						local196.method3599(local196.aClass130_1.anInt4113);
						local196.anInt4199 = local196.aClass130_1.anInt4085 << 3;
						local196.method3594(true, (local196.aClass130_1.aByte52 + 4 & 0x40C00007) << 11);
						local196.method3604(true, local122, local135, local99, local196.method3591());
					}
				}
			}
		}
	}
}
