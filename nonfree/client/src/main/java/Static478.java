import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qca", name = "h", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_161 = new Class126(21, 3);

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_17 = new Class387(2, 4, 4, 0);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IB)Lclient!fp;")
	public static Class3_Sub6_Sub9 method6826(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub6_Sub9 local10 = (Class3_Sub6_Sub9) Static252.aClass30_1.method1092((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static560.aClass143_128.method3125(0, arg0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static533.method7419(local20);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static252.aClass30_1.method1094(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BJ)V")
	public static void method6828(@OriginalArg(1) long arg0) {
		Static635.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILjava/lang/String;ILclient!hk;)Lclient!wea;")
	public static Class386 method6830(@OriginalArg(1) String arg0, @OriginalArg(3) Class16_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static51.anIntArray60, 0);
		if (Static51.anIntArray60[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class386(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
