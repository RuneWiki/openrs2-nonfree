import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "J")
	public static long aLong229;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BZ)V")
	public static void method7235(@OriginalArg(1) boolean arg0) {
		Static100.method2182(Static375.anInt7256, Static554.anInt9828, Static332.anInt6370, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method7236(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static146.method2803(0, arg1, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!kga;Ljava/lang/String;II)Lclient!bba;")
	public static Class27 method7237(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static433.anIntArray424, 0);
		if (Static433.anIntArray424[0] == 0) {
			if (Static433.anIntArray424[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static433.anIntArray424, 1);
			if (Static433.anIntArray424[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static433.anIntArray424[1]];
				OpenGL.glGetInfoLogARB(local6, Static433.anIntArray424[1], Static433.anIntArray424, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static433.anIntArray424[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class27(arg0, local6, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "([Lclient!n;II)V")
	public static void method7238(@OriginalArg(0) Class225[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class225 local9 = arg0[local3];
			if (local9 != null && arg1 == local9.anInt6559 && !Static69.method1181(local9)) {
				if (local9.anInt6508 == 0) {
					method7238(arg0, local9.anInt6555);
					if (local9.aClass225Array1 != null) {
						method7238(local9.aClass225Array1, local9.anInt6555);
					}
					@Pc(47) Class4_Sub37 local47 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local9.anInt6555);
					if (local47 != null) {
						Static26.method343(local47.anInt8141);
					}
				}
				if (local9.anInt6508 == 6 && local9.anInt6510 != -1) {
					@Pc(68) Class365 local68 = Static61.aClass48_1.method1016(local9.anInt6510);
					if (local68 != null) {
						local9.anInt6512 += Static356.anInt6930;
						@Pc(79) int local79 = local9.anInt6541;
						while (local68.anIntArray552[local9.anInt6541] < local9.anInt6512) {
							local9.anInt6512 -= local68.anIntArray552[local9.anInt6541];
							local9.anInt6541++;
							if (local9.anInt6541 >= local68.anIntArray551.length) {
								local9.anInt6541 -= local68.anInt10217;
								if (local9.anInt6541 < 0 || local68.anIntArray551.length <= local9.anInt6541) {
									local9.anInt6541 = 0;
								}
							}
							local9.anInt6530 = local9.anInt6541 + 1;
							if (local68.anIntArray551.length <= local9.anInt6530) {
								local9.anInt6530 -= local68.anInt10217;
								if (local9.anInt6530 < 0 || local9.anInt6530 >= local68.anIntArray551.length) {
									local9.anInt6530 = -1;
								}
							}
							Static92.method2100(local9);
						}
						if (local79 != local9.anInt6541) {
							Static594.method8374(local9.anInt6541, local68);
						}
					}
				}
			}
		}
	}
}
