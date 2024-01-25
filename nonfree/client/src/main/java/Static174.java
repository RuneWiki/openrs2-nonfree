import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!fha", name = "l", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!fha", name = "k", descriptor = "Lclient!hda;")
	public static final Class150 aClass150_3 = new Class150("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!fha", name = "n", descriptor = "[I")
	public static final int[] anIntArray225 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fha", name = "b", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(II[Ljava/lang/Object;B[J)V")
	public static void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) Object local30 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local30;
		@Pc(51) int local51 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg1; local53 < arg0; local53++) {
			if (local16 + (long) (local51 & local53) > arg3[local53]) {
				@Pc(72) long local72 = arg3[local53];
				arg3[local53] = arg3[local12];
				arg3[local12] = local72;
				@Pc(86) Object local86 = arg2[local53];
				arg2[local53] = arg2[local12];
				arg2[local12++] = local86;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg2[arg0] = arg2[local12];
		arg2[local12] = local30;
		method2603(local12 - 1, arg1, arg2, arg3);
		method2603(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fha", name = "c", descriptor = "(I)V")
	public static void method2604() {
		Static183.method2654((long) Static528.anInt8386, Static396.aClass145_6);
		if (Static542.anInt8552 != -1) {
			Static170.method2534(Static542.anInt8552);
		}
		for (@Pc(20) int local20 = 0; local20 < Static172.anInt2988; local20++) {
			if (Static537.aBooleanArray25[local20]) {
				Static356.aBooleanArray26[local20] = true;
			}
			Static279.aBooleanArray21[local20] = Static537.aBooleanArray25[local20];
			Static537.aBooleanArray25[local20] = false;
		}
		Static482.anInt7720 = Static528.anInt8386;
		if (Static542.anInt8552 != -1) {
			Static172.anInt2988 = 0;
			Static25.method308();
		}
		Static396.aClass145_6.la();
		Static547.method7637(Static396.aClass145_6);
		@Pc(72) int local72 = Static220.method3083();
		if (local72 == -1) {
			local72 = Static85.anInt1436;
		}
		if (local72 == -1) {
			local72 = Static288.anInt4456;
		}
		Static693.method9336(local72);
		Static371.anInt5922 = 0;
	}

	@OriginalMember(owner = "client!fha", name = "d", descriptor = "(I)Z")
	public static boolean method2605() {
		if (Static122.aClass2_Sub6_Sub20_3 == null) {
			return false;
		} else {
			if (Static122.aClass2_Sub6_Sub20_3.anInt9603 >= 2000) {
				Static122.aClass2_Sub6_Sub20_3.anInt9603 -= 2000;
			}
			return Static122.aClass2_Sub6_Sub20_3.anInt9603 == 1001;
		}
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Lclient!mba;[BII)Lclient!su;")
	public static Class345 method2606(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(19) long local19 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local19, arg1);
		OpenGL.glCompileShaderARB(local19);
		OpenGL.glGetObjectParameterivARB(local19, 35713, Static284.anIntArray321, 0);
		if (Static284.anIntArray321[0] == 0) {
			if (Static284.anIntArray321[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local19, 35716, Static284.anIntArray321, 1);
			if (Static284.anIntArray321[1] > 1) {
				@Pc(67) byte[] local67 = new byte[Static284.anIntArray321[1]];
				OpenGL.glGetInfoLogARB(local19, Static284.anIntArray321[1], Static284.anIntArray321, 0, local67, 0);
				System.out.println(new String(local67));
			}
			if (Static284.anIntArray321[0] == 0) {
				OpenGL.glDeleteObjectARB(local19);
				return null;
			}
		}
		return new Class345(arg0, local19, arg2);
	}
}
