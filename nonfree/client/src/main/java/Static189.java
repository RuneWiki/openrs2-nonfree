import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_9;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_123 = new Class180(27, 6);

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_83 = new Class218(58, 6);

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static int anInt5580 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Z")
	public static boolean method5093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method5094() {
		@Pc(14) int local14 = Static635.aByteArrayArray28.length;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			if (Static635.aByteArrayArray28[local16] != null) {
				@Pc(24) int local24 = -1;
				for (@Pc(26) int local26 = 0; local26 < Static240.anInt4426; local26++) {
					if (Static77.anIntArray125[local16] == Static483.anIntArray678[local26]) {
						local24 = local26;
						break;
					}
				}
				if (local24 == -1) {
					Static483.anIntArray678[Static240.anInt4426] = Static77.anIntArray125[local16];
					local24 = Static240.anInt4426++;
				}
				@Pc(66) Class3_Sub25 local66 = new Class3_Sub25(Static635.aByteArrayArray28[local16]);
				@Pc(68) int local68 = 0;
				while (local66.anInt9765 < Static635.aByteArrayArray28[local16].length && local68 < 511 && Static561.anInt9114 < 1023) {
					@Pc(85) int local85 = local24 | local68++ << 6;
					@Pc(89) int local89 = local66.method8593();
					@Pc(93) int local93 = local89 >> 14;
					@Pc(99) int local99 = local89 >> 7 & 0x3F;
					@Pc(103) int local103 = local89 & 0x3F;
					@Pc(115) int local115 = local99 + (Static77.anIntArray125[local16] >> 8) * 64 - Static287.anInt4910;
					@Pc(128) int local128 = local103 + (Static77.anIntArray125[local16] & 0xFF) * 64 - Static72.anInt1361;
					@Pc(135) Class300 local135 = Static580.aClass36_2.method1057(local66.method8593());
					@Pc(142) Class3_Sub3 local142 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local85);
					if (local142 == null && (local135.aByte124 & 0x1) > 0 && local93 == Static34.anInt808 && local115 >= 0 && local115 + local135.anInt8313 < Static158.anInt927 && local128 >= 0 && Static515.anInt8292 > local135.anInt8313 + local128) {
						@Pc(183) Class28_Sub1_Sub1_Sub1_Sub2 local183 = new Class28_Sub1_Sub1_Sub1_Sub2();
						local183.anInt10762 = local85;
						@Pc(191) Class3_Sub3 local191 = new Class3_Sub3(local183);
						Static522.aClass83_34.method2377((long) local85, local191);
						Static84.aClass3_Sub3Array1[Static567.anInt5909++] = local191;
						Static131.anIntArray226[Static561.anInt9114++] = local85;
						local183.anInt10786 = Static588.anInt9467;
						local183.method9335(local135);
						local183.method9322(local183.aClass300_1.anInt8313);
						local183.anInt10745 = local183.aClass300_1.anInt8314 << 3;
						local183.method9324(true, (local183.aClass300_1.aByte125 + 4 & 0xE4400007) << 11);
						local183.method9334(local93, local115, local128, local183.method9314(), true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!dia;ILjava/lang/String;)Lclient!kd;")
	public static Class184 method5096(@OriginalArg(0) int arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static34.anIntArray67, 0);
		if (Static34.anIntArray67[0] == 0) {
			if (Static34.anIntArray67[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static34.anIntArray67, 1);
			if (Static34.anIntArray67[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static34.anIntArray67[1]];
				OpenGL.glGetInfoLogARB(local11, Static34.anIntArray67[1], Static34.anIntArray67, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static34.anIntArray67[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class184(arg1, local11, arg0);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method5097(@OriginalArg(0) Class28_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(18) Class3_Sub8 local18 = (Class3_Sub8) Static533.aClass83_35.method2368((long) arg0.anInt10762);
		if (local18 == null) {
			return;
		}
		if (local18.aClass3_Sub1_Sub1_1 != null) {
			Static313.aClass3_Sub1_Sub2_1.method931(local18.aClass3_Sub1_Sub1_1);
			local18.aClass3_Sub1_Sub1_1 = null;
		}
		local18.method9380();
	}
}
