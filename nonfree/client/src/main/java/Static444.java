import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[Lclient!na;")
	public static Class159[] aClass159Array3;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_16 = new Class95(12, 18);

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
	public static final int[] anIntArray524 = new int[250];

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_238 = new Class189("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
	public static void method5851(@OriginalArg(0) int arg0) {
		Static238.anInt4569 = 100;
		Static374.anInt6289 = 3;
		Static233.anInt4469 = arg0;
		Static128.anInt2675 = -1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZILclient!bu;)Lclient!et;")
	public static Class3_Sub4_Sub8 method5852(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32 arg2) {
		@Pc(14) Class3_Sub7 local14 = new Class3_Sub7(arg2.method785(arg0, arg1));
		@Pc(45) Class3_Sub4_Sub8 local45 = new Class3_Sub4_Sub8(arg0, local14.method2620(), local14.method2620(), local14.method2589(), local14.method2589(), local14.method2582() == 1, local14.method2582(), local14.method2582());
		@Pc(49) int local49 = local14.method2582();
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local45.aClass243_15.method5198(new Class3_Sub44(local14.method2582(), local14.method2588(), local14.method2588(), local14.method2588(), local14.method2588(), local14.method2588(), local14.method2588(), local14.method2588(), local14.method2588()));
		}
		local45.method1745();
		return local45;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([Ljava/lang/Object;[JIII)V")
	public static void method5853(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg3) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg2; local52 < arg3; local52++) {
			if ((long) (local52 & local50) + local16 > arg1[local52]) {
				@Pc(73) long local73 = arg1[local52];
				arg1[local52] = arg1[local12];
				arg1[local12] = local73;
				@Pc(87) Object local87 = arg0[local52];
				arg0[local52] = arg0[local12];
				arg0[local12++] = local87;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method5853(arg0, arg1, arg2, local12 - 1);
		method5853(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)V")
	public static void method5855(@OriginalArg(1) long arg0) {
		if (Static263.aClass118ArrayArrayArray2 != null) {
			if (Static161.anInt3316 == 1 || Static161.anInt3316 == 5) {
				Static221.method3342(arg0);
			} else if (Static161.anInt3316 == 4) {
				Static69.method1367(arg0);
			}
		}
		Static368.method4824(Static121.aClass172_3, (long) Static253.anInt4787);
		if (Static226.anInt4225 != -1) {
			Static17.method369(Static226.anInt4225);
		}
		for (@Pc(39) int local39 = 0; local39 < Static246.anInt4693; local39++) {
			if (Static55.aBooleanArray8[local39]) {
				Static78.aBooleanArray11[local39] = true;
			}
			Static128.aBooleanArray12[local39] = Static55.aBooleanArray8[local39];
			Static55.aBooleanArray8[local39] = false;
		}
		Static36.anInt1021 = Static253.anInt4787;
		if (Static121.aClass172_3.method5483()) {
			Static284.aBoolean456 = true;
		}
		if (Static226.anInt4225 != -1) {
			Static246.anInt4693 = 0;
			Static7.method49();
		}
		Static121.aClass172_3.va();
		Static398.method5109(Static121.aClass172_3);
		@Pc(95) int local95 = Static271.method3880();
		if (local95 == -1) {
			local95 = Static25.anInt849;
		}
		if (local95 == -1) {
			local95 = Static58.anInt1564;
		}
		Static31.method4739(local95);
		Static143.method1464(Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77, Static115.anInt2498, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321);
		Static115.anInt2498 = 0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!vj;Ljava/lang/String;)Lclient!hq;")
	public static Class104 method5856(@OriginalArg(1) int arg0, @OriginalArg(2) Class172_Sub2 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static196.anIntArray247, 0);
		if (Static196.anIntArray247[0] == 0) {
			if (Static196.anIntArray247[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static196.anIntArray247, 1);
			if (Static196.anIntArray247[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static196.anIntArray247[1]];
				OpenGL.glGetInfoLogARB(local6, Static196.anIntArray247[1], Static196.anIntArray247, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static196.anIntArray247[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class104(arg1, local6, arg0);
	}
}
