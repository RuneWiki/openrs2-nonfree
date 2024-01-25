import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public static void method5979() {
		@Pc(7) Class268 local7 = null;
		try {
			local7 = Static688.method9263("2");
			@Pc(20) Class2_Sub20 local20 = new Class2_Sub20(Static413.anInt6774 * 6 + 3);
			local20.method8584(1);
			local20.method8551(Static413.anInt6774);
			for (@Pc(30) int local30 = 0; local30 < Static41.anIntArray266.length; local30++) {
				if (Static317.aBooleanArray27[local30]) {
					local20.method8551(local30);
					local20.method8577(Static41.anIntArray266[local30]);
				}
			}
			local7.method6517(local20.aByteArray111, local20.anInt9723, 0);
		} catch (@Pc(67) Exception local67) {
		}
		try {
			if (local7 != null) {
				local7.method6511();
			}
		} catch (@Pc(74) Exception local74) {
		}
		Static162.aLong97 = Static567.method7863();
		Static330.aBoolean430 = false;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([Lclient!dma;ILclient!uja;)Lclient!kj;")
	public static Class212 method5980(@OriginalArg(0) Class87[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145_Sub3 arg2) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong72 <= 0L) {
				return null;
			}
		}
		if (arg1 <= 48) {
			aFloat112 = -0.12405562F;
		}
		@Pc(51) long local51 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(53) int local53 = 0; local53 < arg0.length; local53++) {
			OpenGL.glAttachObjectARB(local51, arg0[local53].aLong72);
		}
		OpenGL.glLinkProgramARB(local51);
		OpenGL.glGetObjectParameterivARB(local51, 35714, Static429.anIntArray124, 0);
		if (Static429.anIntArray124[0] == 0) {
			if (Static429.anIntArray124[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local51, 35716, Static429.anIntArray124, 1);
			if (Static429.anIntArray124[1] > 1) {
				@Pc(113) byte[] local113 = new byte[Static429.anIntArray124[1]];
				OpenGL.glGetInfoLogARB(local51, Static429.anIntArray124[1], Static429.anIntArray124, 0, local113, 0);
				System.out.println(new String(local113));
			}
			if (Static429.anIntArray124[0] == 0) {
				for (@Pc(137) int local137 = 0; local137 < arg0.length; local137++) {
					OpenGL.glDetachObjectARB(local51, arg0[local137].aLong72);
				}
				OpenGL.glDeleteObjectARB(local51);
				return null;
			}
		}
		return new Class212(arg2, local51, arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIII)J")
	public static long method5981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2) {
		Static246.aCalendar4.clear();
		Static246.aCalendar4.set(arg1, arg0, arg2, 12, 0, 0);
		return Static246.aCalendar4.getTime().getTime();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method5982(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18 += 4) {
			@Pc(30) int local30 = Static692.method9326(arg1.charAt(local18));
			@Pc(51) int local51 = local16 > local18 + 1 ? Static692.method9326(arg1.charAt(local18 + 1)) : -1;
			@Pc(71) int local71 = local16 > local18 + 2 ? Static692.method9326(arg1.charAt(local18 + 2)) : -1;
			@Pc(93) int local93 = local18 + 3 >= local16 ? -1 : Static692.method9326(arg1.charAt(local18 + 3));
			arg0[arg2++] = (byte) (local30 << 2 | local51 >>> 4);
			if (local71 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local71 >>> 2 | (local51 & 0xF) << 4);
			if (local93 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local93 | (local71 & 0x3) << 6);
		}
		return arg2;
	}
}
