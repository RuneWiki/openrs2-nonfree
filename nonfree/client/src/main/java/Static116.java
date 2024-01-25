import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
	public static int anInt2540;

	@OriginalMember(owner = "client!eba", name = "w", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!eba", name = "y", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!eba", name = "B", descriptor = "D")
	public static double aDouble7;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B[Ljava/lang/String;[SII)V")
	public static void method2391(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local20;
		@Pc(34) short local34 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(71) String local71 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local71;
				@Pc(85) short local85 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16++] = local85;
			}
		}
		arg0[arg3] = arg0[local16];
		arg0[local16] = local20;
		arg1[arg3] = arg1[local16];
		arg1[local16] = local34;
		method2391(arg0, arg1, arg2, local16 - 1);
		method2391(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!kw;I[Lclient!tn;)Lclient!dc;")
	public static Class65 method2392(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) Class324[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong248 <= 0L) {
				return null;
			}
		}
		@Pc(43) long local43 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(45) int local45 = 0; local45 < arg1.length; local45++) {
			OpenGL.glAttachObjectARB(local43, arg1[local45].aLong248);
		}
		OpenGL.glLinkProgramARB(local43);
		OpenGL.glGetObjectParameterivARB(local43, 35714, Static404.anIntArray456, 0);
		if (Static404.anIntArray456[0] == 0) {
			if (Static404.anIntArray456[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local43, 35716, Static404.anIntArray456, 1);
			if (Static404.anIntArray456[1] > 1) {
				@Pc(100) byte[] local100 = new byte[Static404.anIntArray456[1]];
				OpenGL.glGetInfoLogARB(local43, Static404.anIntArray456[1], Static404.anIntArray456, 0, local100, 0);
				System.out.println(new String(local100));
			}
			if (Static404.anIntArray456[0] == 0) {
				for (@Pc(124) int local124 = 0; local124 < arg1.length; local124++) {
					OpenGL.glDetachObjectARB(local43, arg1[local124].aLong248);
				}
				OpenGL.glDeleteObjectARB(local43);
				return null;
			}
		}
		return new Class65(arg0, local43, arg1);
	}
}
