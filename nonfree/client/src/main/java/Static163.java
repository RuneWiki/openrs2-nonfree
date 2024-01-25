import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIB)V")
	public static void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = Static155.aClass8_Sub25_6.aClass36_Sub6_2.method3331() * arg0 >> 8;
		if (local8 == 0 || arg2 == -1) {
			return;
		}
		if (!Static424.aBoolean575 && Static505.anInt8909 != -1 && Static495.method1941() && !Static357.method3201()) {
			Static454.aClass8_Sub16_Sub1_2 = Static360.method5655();
			@Pc(42) Class8_Sub16_Sub1 local42 = Static176.method3414(Static454.aClass8_Sub16_Sub1_2);
			Static400.method6359(local42);
		}
		Static540.method7649(local8, Static393.aClass237_102, arg2);
		Static313.method5170(-1, 255);
		Static424.aBoolean575 = true;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public static void method3266() {
		@Pc(7) client local7 = Static227.aClient1;
		synchronized (Static227.aClient1) {
			if (Static197.aFrame1 == null) {
				@Pc(20) Container local20;
				if (Static602.aFrame3 != null) {
					local20 = Static602.aFrame3;
				} else if (Static152.anApplet1 == null) {
					local20 = Static370.anApplet_Sub1_1;
				} else {
					local20 = Static152.anApplet1;
				}
				Static354.anInt6829 = local20.getSize().width;
				Static69.anInt7730 = local20.getSize().height;
				@Pc(42) Insets local42;
				if (Static602.aFrame3 == local20) {
					local42 = Static602.aFrame3.getInsets();
					Static69.anInt7730 -= local42.bottom + local42.top;
					Static354.anInt6829 -= local42.right + local42.left;
				}
				if (Static383.method6158() == 1) {
					Static235.anInt5298 = Static328.anInt9768;
					Static313.anInt6355 = Static594.anInt10159;
					Static34.anInt8073 = 0;
					Static508.anInt8942 = (Static354.anInt6829 - Static328.anInt9768) / 2;
				} else {
					Static132.method2910();
				}
				if (Static277.aClass313_9 != Static101.aClass313_5) {
					@Pc(91) boolean local91;
					if (Static235.anInt5298 < 1024 && Static313.anInt6355 < 768) {
						local91 = true;
					} else {
						local91 = false;
					}
				}
				Static549.aCanvas13.setSize(Static235.anInt5298, Static313.anInt6355);
				if (Static171.aClass16_5 != null) {
					if (Static513.aBoolean642) {
						Static188.method3577(Static549.aCanvas13);
					} else {
						Static171.aClass16_5.method6129(Static549.aCanvas13, Static235.anInt5298, Static313.anInt6355);
					}
				}
				if (Static602.aFrame3 == local20) {
					local42 = Static602.aFrame3.getInsets();
					Static549.aCanvas13.setLocation(Static508.anInt8942 + local42.left, local42.top + Static34.anInt8073);
				} else {
					Static549.aCanvas13.setLocation(Static508.anInt8942, Static34.anInt8073);
				}
				if (Static212.anInt4965 != -1) {
					Static131.method2902(true);
				}
				Static582.method8106();
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!wp;Lclient!efa;BII)V")
	public static void method3267(@OriginalArg(0) Class8_Sub8_Sub2 arg0, @OriginalArg(1) Class15_Sub1_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if ((arg3 & 0x4000) != 0) {
			local18 = arg0.method8576();
			local22 = arg0.method8553();
			if (local18 == 65535) {
				local18 = -1;
			}
			local33 = arg0.method8552();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg1.method6693(local37, true, local18, local43, local22);
		}
		if ((arg3 & 0x200) != 0) {
			arg1.anInt8128 = arg0.method8574();
			arg1.anInt8132 = arg0.method8521();
			arg1.anInt8066 = arg0.method8521();
			arg1.anInt8048 = arg0.method8521();
			arg1.anInt8101 = arg0.method8576() + Static435.anInt8192;
			arg1.anInt8124 = arg0.method8541() + Static435.anInt8192;
			arg1.anInt8084 = arg0.method8525();
			if (arg1.aBoolean248) {
				arg1.anInt8137 = 0;
				arg1.anInt8132 += arg1.anInt3279;
				arg1.anInt8128 += arg1.anInt3314;
				arg1.anInt8048 += arg1.anInt3279;
				arg1.anInt8066 += arg1.anInt3314;
			} else {
				arg1.anInt8128 += arg1.anIntArray435[0];
				arg1.anInt8048 += arg1.anIntArray436[0];
				arg1.anInt8066 += arg1.anIntArray435[0];
				arg1.anInt8137 = 1;
				arg1.anInt8132 += arg1.anIntArray436[0];
			}
			arg1.anInt8140 = 0;
		}
		@Pc(209) int local209;
		@Pc(195) int[] local195;
		@Pc(198) int[] local198;
		if ((arg3 & 0x100) != 0) {
			local18 = arg0.method8552();
			local195 = new int[local18];
			local198 = new int[local18];
			@Pc(201) int[] local201 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				local209 = arg0.method8545();
				if (local209 == 65535) {
					local209 = -1;
				}
				local195[local43] = local209;
				local198[local43] = arg0.method8552();
				local201[local43] = arg0.method8545();
			}
			Static517.method7403(local201, local195, local198, arg1);
		}
		if ((arg3 & 0x2) != 0) {
			local18 = arg0.method8578();
			if (local18 == 65535) {
				local18 = -1;
			}
			arg1.anInt8108 = local18;
		}
		if ((arg3 & 0x4) != 0) {
			arg1.anInt3316 = arg0.method8578();
			if (arg1.anInt8137 == 0) {
				arg1.method6700(arg1.anInt3316);
				arg1.anInt3316 = -1;
			}
		}
		if ((arg3 & 0x2000) != 0) {
			arg1.aString85 = arg0.method8570();
			if (arg1.aString85.charAt(0) == '~') {
				arg1.aString85 = arg1.aString85.substring(1);
				Static170.method3363(arg1.aString85, arg1.method2759(), 2, 0, arg1.method2762(), arg1.aString36);
			} else if (arg1 == Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2) {
				Static170.method3363(arg1.aString85, arg1.method2759(), 2, 0, arg1.method2762(), arg1.aString36);
			}
			arg1.anInt8123 = 0;
			arg1.anInt8053 = 150;
			arg1.anInt8121 = 0;
		}
		if ((arg3 & 0x8) != 0) {
			local18 = arg0.method8578();
			if (local18 == 65535) {
				local18 = -1;
			}
			local22 = arg0.method8540();
			local33 = arg0.method8527();
			local37 = local33 & 0x7;
			local43 = local33 >> 3 & 0xF;
			if (local43 == 15) {
				local43 = -1;
			}
			arg1.method6693(local37, false, local18, local43, local22);
		}
		if ((arg3 & 0x80) != 0) {
			@Pc(413) int[] local413 = new int[4];
			for (local22 = 0; local22 < 4; local22++) {
				local413[local22] = arg0.method8576();
				if (local413[local22] == 65535) {
					local413[local22] = -1;
				}
			}
			local33 = arg0.method8525();
			Static639.method8612(local33, arg1, local413);
		}
		if ((arg3 & 0x20) != 0) {
			Static607.aByteArray60[arg2] = arg0.method8539();
		}
		if ((arg3 & 0x20000) != 0) {
			local18 = Static435.anInt8192;
			local22 = arg0.method8565();
			local33 = arg0.method8528();
			arg1.method6684(local18, local22, local33);
		}
		if ((arg3 & 0x40) != 0) {
			local18 = arg0.method8527();
			@Pc(496) byte[] local496 = new byte[local18];
			@Pc(501) Class8_Sub8 local501 = new Class8_Sub8(local496);
			arg0.method8544(local18, local496);
			Static524.aClass8_Sub8Array1[arg2] = local501;
			arg1.method2763(local501);
		}
		if ((arg3 & 0x800) != 0) {
			local7 = arg0.method8550();
		}
		if ((arg3 & 0x10000) != 0) {
			local18 = arg0.method8528();
			local195 = new int[local18];
			local198 = new int[local18];
			for (local37 = 0; local37 < local18; local37++) {
				local43 = arg0.method8541();
				if ((local43 & 0xC000) == 49152) {
					local209 = arg0.method8576();
					local195[local37] = local43 << 16 | local209;
				} else {
					local195[local37] = local43;
				}
				local198[local37] = arg0.method8541();
			}
			arg1.method6699(local198, local195);
		}
		if ((arg3 & 0x400) != 0) {
			arg1.aBoolean249 = arg0.method8527() == 1;
		}
		if ((arg3 & 0x40000) != 0) {
			arg1.aByte85 = arg0.method8574();
			arg1.aByte83 = arg0.method8521();
			arg1.aByte84 = arg0.method8521();
			arg1.aByte86 = (byte) arg0.method8552();
			arg1.anInt8087 = Static435.anInt8192 + arg0.method8545();
			arg1.anInt8062 = Static435.anInt8192 + arg0.method8576();
		}
		if ((arg3 & 0x8000) != 0) {
			local18 = arg0.method8578();
			arg1.anInt8130 = arg0.method8525();
			arg1.anInt8090 = arg0.method8528();
			arg1.anInt8079 = local18 & 0x7FFF;
			arg1.aBoolean584 = (local18 & 0x8000) != 0;
			arg1.anInt8127 = arg1.anInt8130 + arg1.anInt8079 + Static435.anInt8192;
		}
		if ((arg3 & 0x10) != 0) {
			local18 = arg0.method8565();
			local22 = arg0.method8552();
			arg1.method6684(Static435.anInt8192, local18, local22);
			arg1.anInt8136 = Static435.anInt8192 + 300;
			arg1.anInt8052 = arg0.method8528();
		}
		if (!arg1.aBoolean248) {
			return;
		}
		if (local7 == 127) {
			arg1.method2761(arg1.anInt3314, arg1.anInt3279);
			return;
		}
		@Pc(727) byte local727;
		if (local7 == -1) {
			local727 = Static607.aByteArray60[arg2];
		} else {
			local727 = local7;
		}
		Static213.method4051(arg1, local727);
		arg1.method2769(arg1.anInt3314, local727, arg1.anInt3279);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "()V")
	public static void method3268() {
		for (@Pc(1) int local1 = 0; local1 < Static394.aClass124Array1.length; local1++) {
			Static394.aClass124Array1[local1].method3582();
		}
		Static394.aClass124Array1 = null;
	}
}
