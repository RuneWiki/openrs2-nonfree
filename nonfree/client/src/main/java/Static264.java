import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public static int anInt4916;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "Lclient!u;")
	public static Class357 aClass357_2;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
	public static final int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([Lclient!ei;Lclient!pi;I)Lclient!tw;")
	public static Class356 method4385(@OriginalArg(0) Class95[] arg0, @OriginalArg(1) Class144_Sub3 arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			if (arg0[local15] == null || arg0[local15].aLong90 <= 0L) {
				return null;
			}
		}
		@Pc(41) long local41 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(43) int local43 = 0; local43 < arg0.length; local43++) {
			OpenGL.glAttachObjectARB(local41, arg0[local43].aLong90);
		}
		OpenGL.glLinkProgramARB(local41);
		OpenGL.glGetObjectParameterivARB(local41, 35714, Static652.anIntArray569, 0);
		if (Static652.anIntArray569[0] == 0) {
			if (Static652.anIntArray569[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local41, 35716, Static652.anIntArray569, 1);
			if (Static652.anIntArray569[1] > 1) {
				@Pc(99) byte[] local99 = new byte[Static652.anIntArray569[1]];
				OpenGL.glGetInfoLogARB(local41, Static652.anIntArray569[1], Static652.anIntArray569, 0, local99, 0);
				System.out.println(new String(local99));
			}
			if (Static652.anIntArray569[0] == 0) {
				for (@Pc(123) int local123 = 0; local123 < arg0.length; local123++) {
					OpenGL.glDetachObjectARB(local41, arg0[local123].aLong90);
				}
				OpenGL.glDeleteObjectARB(local41);
				return null;
			}
		}
		return new Class356(arg1, local41, arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IBLjava/lang/Object;I)[B")
	public static byte[] method4388(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return Static541.method7945(local14, arg0);
		} else if (arg1 instanceof Class191) {
			@Pc(26) Class191 local26 = (Class191) arg1;
			return local26.method7610(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
	public static void method4390() {
		Static606.method8532(Static103.aClass144_3, (long) Static530.anInt9105);
		if (Static358.anInt6145 != -1) {
			Static380.method5854(Static358.anInt6145);
		}
		for (@Pc(21) int local21 = 0; local21 < Static132.anInt2080; local21++) {
			if (Static415.aBooleanArray17[local21]) {
				Static655.aBooleanArray27[local21] = true;
			}
			Static234.aBooleanArray13[local21] = Static415.aBooleanArray17[local21];
			Static415.aBooleanArray17[local21] = false;
		}
		Static511.anInt8868 = Static530.anInt9105;
		if (59 != 59) {
			return;
		}
		if (Static358.anInt6145 != -1) {
			Static132.anInt2080 = 0;
			Static539.method7936();
		}
		Static103.aClass144_3.la();
		Static203.method3031(Static103.aClass144_3);
		@Pc(81) int local81 = Static610.method8615();
		if (local81 == -1) {
			local81 = Static573.anInt9481;
		}
		if (local81 == -1) {
			local81 = Static292.anInt5309;
		}
		Static114.method1816(local81);
		Static468.anInt7945 = 0;
	}
}
