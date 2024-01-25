import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eba", name = "Jb", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!eba", name = "xb", descriptor = "I")
	public static int anInt1981;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!qga;II)V")
	public static void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) Class31 local15 = arg1.method7439(Static103.aClass144_3);
		if (local15 == null) {
			return;
		}
		Static103.aClass144_3.KA(arg0, arg2, arg0 + arg1.anInt8573, arg2 + arg1.anInt8547);
		if (Static553.anInt9258 < 3) {
			Static389.aClass45_20.method7498((float) arg0 + (float) arg1.anInt8573 / 2.0F, (float) arg1.anInt8547 / 2.0F + (float) arg2, ((int) -Static139.aFloat16 & 0x3FFF) << 2, local15.aClass1_1, arg0, arg2);
		} else {
			Static103.aClass144_3.A(-16777216, local15.aClass1_1, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[Lclient!cr;Lclient!md;)Lclient!nu;")
	public static Class257 method1912(@OriginalArg(1) Class66[] arg0, @OriginalArg(2) Class144_Sub1_Sub2 arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			if (arg0[local13] == null || arg0[local13].aLong65 <= 0L) {
				return null;
			}
		}
		@Pc(41) long local41 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(43) int local43 = 0; local43 < arg0.length; local43++) {
			OpenGL.glAttachObjectARB(local41, arg0[local43].aLong65);
		}
		OpenGL.glLinkProgramARB(local41);
		OpenGL.glGetObjectParameterivARB(local41, 35714, Static119.anIntArray109, 0);
		if (Static119.anIntArray109[0] == 0) {
			if (Static119.anIntArray109[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local41, 35716, Static119.anIntArray109, 1);
			if (Static119.anIntArray109[1] > 1) {
				@Pc(106) byte[] local106 = new byte[Static119.anIntArray109[1]];
				OpenGL.glGetInfoLogARB(local41, Static119.anIntArray109[1], Static119.anIntArray109, 0, local106, 0);
				System.out.println(new String(local106));
			}
			if (Static119.anIntArray109[0] == 0) {
				for (@Pc(127) int local127 = 0; local127 < arg0.length; local127++) {
					OpenGL.glDetachObjectARB(local41, arg0[local127].aLong65);
				}
				OpenGL.glDeleteObjectARB(local41);
				return null;
			}
		}
		return new Class257(arg1, local41, arg0);
	}

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "(III)I")
	public static int method1921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(26) double local26 = local17 + (local10 - local17) * Math.random();
		return (int) (Math.pow(2.0D, local26) + 0.5D);
	}
}
