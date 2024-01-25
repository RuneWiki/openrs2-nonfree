import jaggl.OpenGL;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
	public static int anInt5650;

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([IIZILclient!gi;Z)Lclient!es;")
	public static Class79_Sub2_Sub1 method4740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class42_Sub3 arg3) {
		if (arg3.aBoolean288 || Static78.method1703(arg2) && Static78.method1703(arg1)) {
			return new Class79_Sub2_Sub1(arg3, 3553, arg2, arg1, false, arg0);
		} else if (arg3.aBoolean291) {
			return new Class79_Sub2_Sub1(arg3, 34037, arg2, arg1, false, arg0);
		} else {
			return new Class79_Sub2_Sub1(arg3, arg2, arg1, Static37.method6277(arg2), Static37.method6277(arg1), arg0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(III)I")
	public static int method4741(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static449.anInt8180 == -1) {
			return 1;
		}
		if (Static148.anInt6867 != arg0) {
			Static201.method3814(arg0);
			if (arg0 != Static148.anInt6867) {
				return -1;
			}
		}
		try {
			@Pc(28) Dimension local28 = Static301.aCanvas11.getSize();
			Static178.method3537(Static395.aClass88_212.method2391(Static345.anInt6495), true, Static56.aClass80_2);
			@Pc(42) Class192 local42 = Static510.method7591(Static449.anInt8180, Static103.aClass16_21);
			@Pc(53) long local53 = Static76.method1679();
			Static243.aClass42_4.n();
			Static180.aClass91_5.oa(0, Static225.anInt4810, 0);
			Static243.aClass42_4.method5855(Static180.aClass91_5);
			Static243.aClass42_4.b(local28.width / 2, local28.height / 2, 512, 512);
			Static243.aClass42_4.M(1.0F);
			Static243.aClass42_4.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(94) Class26 local94 = Static243.aClass42_4.method5812(local42, 2048, 64, 64, 768);
			@Pc(96) int local96 = 0;
			label41: for (@Pc(98) int local98 = 0; local98 < 500; local98++) {
				Static243.aClass42_4.Z(0);
				Static243.aClass42_4.method5792();
				for (@Pc(107) int local107 = 15; local107 >= 0; local107--) {
					for (@Pc(111) int local111 = 0; local111 <= local107; local111++) {
						Static110.aClass91_4.oa((int) ((float) Static316.anInt6040 * (-((float) local107 / 2.0F) + (float) local111)), 0, Static316.anInt6040 * (local107 + 1));
						local94.method8003(Static110.aClass91_4, null, 0);
						local96++;
						if ((long) arg1 <= Static76.method1679() - local53) {
							break label41;
						}
					}
				}
			}
			Static243.aClass42_4.method5810();
			@Pc(176) long local176 = (long) (local96 * 1000) / (Static76.method1679() - local53);
			Static243.aClass42_4.Z(0);
			Static243.aClass42_4.method5792();
			return (int) local176;
		} catch (@Pc(185) Throwable local185) {
			local185.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBZ)Lclient!ib;")
	public static Class12_Sub23 method4742(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class12_Sub23) Static321.aClass68_49.method1917(local17);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;ILclient!gi;)Lclient!mv;")
	public static Class209 method4743(@OriginalArg(1) String arg0, @OriginalArg(3) Class42_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static280.anIntArray384, 0);
		if (Static280.anIntArray384[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class209(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZZ)V")
	public static void method4744(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static182.anInt4220++;
			Static283.method7817();
		}
		if (arg0) {
			Static23.anInt9179++;
			Static492.method6699();
		}
	}
}
