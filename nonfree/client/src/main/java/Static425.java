import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "Lclient!hk;")
	public static Class155 aClass155_23;

	@OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
	public static int anInt7106 = 0;

	@OriginalMember(owner = "client!oia", name = "f", descriptor = "[I")
	public static final int[] anIntArray429 = new int[25];

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "([BIILclient!tia;)Lclient!taa;")
	public static Class342 method6180(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100_Sub1_Sub2 arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local16, arg0);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static635.anIntArray588, 0);
		if (Static635.anIntArray588[0] == 0) {
			if (Static635.anIntArray588[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static635.anIntArray588, 1);
			if (Static635.anIntArray588[1] > 1) {
				@Pc(72) byte[] local72 = new byte[Static635.anIntArray588[1]];
				OpenGL.glGetInfoLogARB(local16, Static635.anIntArray588[1], Static635.anIntArray588, 0, local72, 0);
				System.out.println(new String(local72));
			}
			if (Static635.anIntArray588[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class342(arg2, local16, arg1);
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lclient!mj;IIILclient!ha;IIILclient!aa;)V")
	public static void method6181(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(23) Class313 local23 = Static583.aClass327_4.method7413(arg6);
		if (local23 == null || !local23.aBoolean548 || !local23.method7057(Static23.aClass247_1)) {
			return;
		}
		@Pc(49) int local49;
		if (local23.anIntArray472 != null) {
			@Pc(47) int[] local47 = new int[local23.anIntArray472.length];
			@Pc(61) int local61;
			@Pc(74) int local74;
			@Pc(78) int local78;
			for (local49 = 0; local49 < local47.length / 2; local49++) {
				if (Static426.anInt7111 == 4) {
					local61 = (int) Static243.aFloat117 & 0x3FFF;
				} else {
					local61 = (int) Static243.aFloat117 + Static271.anInt4907 & 0x3FFF;
				}
				local74 = Class42.anIntArray51[local61];
				local78 = Class42.anIntArray52[local61];
				if (Static426.anInt7111 != 4) {
					local78 = local78 * 256 / (Static283.anInt5029 + 256);
					local74 = local74 * 256 / (Static283.anInt5029 + 256);
				}
				local47[local49 * 2] = arg0.anInt5985 / 2 + arg1 + ((arg2 + local23.anIntArray472[local49 * 2] * 4) * local78 + (local23.anIntArray472[local49 * 2 + 1] * 4 + arg5) * local74 >> 14);
				local47[local49 * 2 + 1] = arg0.anInt5973 / 2 + arg3 - (local78 * (local23.anIntArray472[local49 * 2 + 1] * 4 + arg5) - (arg2 + local23.anIntArray472[local49 * 2] * 4) * local74 >> 14);
			}
			Static400.method5834(arg4, local47, local23.anInt8193, arg0.anIntArray352, arg0.anIntArray353);
			if (local23.anInt8187 > 0) {
				@Pc(235) int local235;
				@Pc(245) int local245;
				@Pc(254) int local254;
				@Pc(256) int local256;
				for (local61 = 0; local61 < local47.length / 2 - 1; local61++) {
					local74 = local47[local61 * 2];
					local78 = local47[local61 * 2 + 1];
					local235 = local47[local61 * 2 + 2];
					local245 = local47[(local61 + 1) * 2 + 1];
					if (local235 < local74) {
						local254 = local74;
						local256 = local78;
						local74 = local235;
						local235 = local254;
						local78 = local245;
						local245 = local256;
					} else if (local235 == local74 && local78 > local245) {
						local254 = local78;
						local78 = local245;
						local245 = local254;
					}
					arg4.method8605(local74, local78, local235, local245, local23.anIntArray473[local23.aByteArray88[local61] & 0xFF], arg7, arg1, arg3, local23.anInt8187, local23.anInt8184, local23.anInt8180);
				}
				local74 = local47[local47.length - 2];
				local78 = local47[local47.length - 1];
				local235 = local47[0];
				local245 = local47[1];
				if (local235 < local74) {
					local254 = local74;
					local256 = local78;
					local74 = local235;
					local78 = local245;
					local235 = local254;
					local245 = local256;
				} else if (local235 == local74 && local78 > local245) {
					local254 = local78;
					local78 = local245;
					local245 = local254;
				}
				arg4.method8605(local74, local78, local235, local245, local23.anIntArray473[local23.aByteArray88[local23.aByteArray88.length - 1] & 0xFF], arg7, arg1, arg3, local23.anInt8187, local23.anInt8184, local23.anInt8180);
			} else {
				for (local61 = 0; local61 < local47.length / 2 - 1; local61++) {
					arg4.method8592(local47[local61 * 2], local47[local61 * 2 + 1], local47[local61 * 2 + 2], local47[(local61 + 1) * 2 + 1], local23.anIntArray473[local23.aByteArray88[local61] & 0xFF], arg7, arg1, arg3);
				}
				arg4.method8592(local47[local47.length - 2], local47[local47.length - 1], local47[0], local47[1], local23.anIntArray473[local23.aByteArray88[local23.aByteArray88.length - 1] & 0xFF], arg7, arg1, arg3);
			}
		}
		@Pc(521) Class155 local521 = null;
		if (local23.anInt8179 != -1) {
			local521 = local23.method7063(false, arg4);
			if (local521 != null) {
				Static301.method4698(local521, arg5, arg1, arg3, arg7, arg0, arg2);
			}
		}
		if (local23.aString93 == null) {
			return;
		}
		local49 = 0;
		if (local521 != null) {
			local49 = local521.method7198();
		}
		@Pc(557) Class70 local557 = Static510.aClass70_11;
		@Pc(559) Class196 local559 = Static511.aClass196_36;
		if (local23.anInt8192 == 1) {
			local559 = Static85.aClass196_38;
			local557 = Static414.aClass70_6;
		}
		if (local23.anInt8192 == 2) {
			local557 = Static196.aClass70_3;
			local559 = Static73.aClass196_5;
		}
		Static368.method5502(arg7, arg3, local49, arg0, local23.anInt8173, arg1, arg5, local23.aString93, local559, arg2, local557);
		return;
	}
}
