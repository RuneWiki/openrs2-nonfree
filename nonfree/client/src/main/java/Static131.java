import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!er", name = "e", descriptor = "Lclient!tf;")
	public static Class322 aClass322_52;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_7 = new Class137("", 17);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2611(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local16 < local19 && Static560.method7563(arg0.charAt(local16))) {
			local16++;
		}
		while (local16 < local19 && Static560.method7563(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(58) int local58 = local19 - local16;
		if (local58 < 1 || local58 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local58);
		for (@Pc(73) int local73 = local16; local73 < local19; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static491.method6646(local79)) {
				@Pc(89) char local89 = Static156.method2927(local79);
				if (local89 != '\u0000') {
					local71.append(local89);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLclient!vj;Ljava/lang/String;)Lclient!mc;")
	public static Class203 method2612(@OriginalArg(0) int arg0, @OriginalArg(2) Class45_Sub3 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static180.anIntArray180, 0);
		if (Static180.anIntArray180[0] == 0) {
			if (Static180.anIntArray180[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static180.anIntArray180, 1);
			if (Static180.anIntArray180[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static180.anIntArray180[1]];
				OpenGL.glGetInfoLogARB(local11, Static180.anIntArray180[1], Static180.anIntArray180, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static180.anIntArray180[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class203(arg1, local11, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2614(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(23) char local23 = arg0.charAt(local12);
			if (local23 <= '\u007f') {
				local10++;
			} else if (local23 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}
}
