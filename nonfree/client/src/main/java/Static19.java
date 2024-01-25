import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Lclient!iq;")
	public static Class104 aClass104_14;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "Lclient!iq;")
	public static Class104 aClass104_15;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_18 = new Class157(11, 16);

	@OriginalMember(owner = "client!at", name = "o", descriptor = "Lclient!cm;")
	public static final Class41 aClass41_2 = new Class41(8);

	@OriginalMember(owner = "client!at", name = "v", descriptor = "I")
	public static int anInt314 = 0;

	@OriginalMember(owner = "client!at", name = "z", descriptor = "[I")
	public static final int[] anIntArray39 = new int[14];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IBLclient!ef;)Ljava/lang/String;")
	public static String method271(@OriginalArg(2) Class2_Sub12 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3153();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt3606 += Static51.aClass218_1.method5691(arg0.anInt3606, arg0.aByteArray30, local7, 0, local19);
			return Static272.method4035(local19, local7, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BILclient!mr;II)V")
	public static void method272(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class142 local16 = arg1.method5778();
		@Pc(26) int local26 = arg1.anInt6927 - arg1.aClass219_7.anInt6829 & 0x3FFF;
		if (arg2 == -1) {
			if (local26 != 0 || arg1.anInt6953 > 25) {
				if (arg3 < 0 && local16.anInt4874 != -1) {
					arg1.anInt6901 = local16.anInt4874;
				} else if (arg3 <= 0 || local16.anInt4864 == -1) {
					arg1.anInt6901 = local16.anInt4875;
				} else {
					arg1.anInt6901 = local16.anInt4864;
				}
				arg1.aBoolean613 = false;
			} else if (!arg1.aBoolean613 || !local16.method4175(arg1.anInt6901)) {
				arg1.anInt6901 = local16.method4173();
				arg1.aBoolean613 = arg1.anInt6901 != -1;
			}
		} else if (arg1.anInt6916 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(49) int local49 = Static366.anIntArray338[arg0] - arg1.aClass219_7.anInt6829 & 0x3FFF;
			if (arg2 == 2 && local16.anInt4869 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local16.anInt4881 != -1) {
					arg1.anInt6901 = local16.anInt4881;
				} else if (local49 >= 10240 && local49 < 14336 && local16.anInt4873 != -1) {
					arg1.anInt6901 = local16.anInt4873;
				} else if (local49 <= 6144 || local49 >= 10240 || local16.anInt4870 == -1) {
					arg1.anInt6901 = local16.anInt4869;
				} else {
					arg1.anInt6901 = local16.anInt4870;
				}
			} else if (arg2 == 0 && local16.anInt4879 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local16.anInt4893 != -1) {
					arg1.anInt6901 = local16.anInt4893;
				} else if (local49 >= 10240 && local49 < 14336 && local16.anInt4866 != -1) {
					arg1.anInt6901 = local16.anInt4866;
				} else if (local49 <= 6144 || local49 >= 10240 || local16.anInt4895 == -1) {
					arg1.anInt6901 = local16.anInt4879;
				} else {
					arg1.anInt6901 = local16.anInt4895;
				}
			} else if (local49 > 2048 && local49 <= 6144 && local16.anInt4891 != -1) {
				arg1.anInt6901 = local16.anInt4891;
			} else if (local49 >= 10240 && local49 < 14336 && local16.anInt4877 != -1) {
				arg1.anInt6901 = local16.anInt4877;
			} else if (local49 <= 6144 || local49 >= 10240 || local16.anInt4872 == -1) {
				arg1.anInt6901 = local16.anInt4875;
			} else {
				arg1.anInt6901 = local16.anInt4872;
			}
			arg1.aBoolean613 = false;
		} else if (local26 == 0 && arg1.anInt6953 <= 25) {
			if (arg2 == 2 && local16.anInt4869 != -1) {
				arg1.anInt6901 = local16.anInt4869;
			} else if (arg2 == 0 && local16.anInt4879 != -1) {
				arg1.anInt6901 = local16.anInt4879;
			} else {
				arg1.anInt6901 = local16.anInt4875;
			}
			arg1.aBoolean613 = false;
		} else {
			arg1.aBoolean613 = false;
			if (arg2 == 2 && local16.anInt4869 != -1) {
				if (arg3 < 0 && local16.anInt4862 != -1) {
					arg1.anInt6901 = local16.anInt4862;
				} else if (arg3 <= 0 || local16.anInt4902 == -1) {
					arg1.anInt6901 = local16.anInt4869;
				} else {
					arg1.anInt6901 = local16.anInt4902;
				}
			} else if (arg2 == 0 && local16.anInt4879 != -1) {
				if (arg3 < 0 && local16.anInt4898 != -1) {
					arg1.anInt6901 = local16.anInt4898;
				} else if (arg3 <= 0 || local16.anInt4886 == -1) {
					arg1.anInt6901 = local16.anInt4879;
				} else {
					arg1.anInt6901 = local16.anInt4886;
				}
			} else if (arg3 < 0 && local16.anInt4871 != -1) {
				arg1.anInt6901 = local16.anInt4871;
			} else if (arg3 <= 0 || local16.anInt4860 == -1) {
				arg1.anInt6901 = local16.anInt4875;
			} else {
				arg1.anInt6901 = local16.anInt4860;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!iq;ZLclient!iq;Lclient!iq;Lclient!iq;)V")
	public static void method275(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(3) Class104 arg2, @OriginalArg(4) Class104 arg3) {
		Static32.aClass104_25 = arg2;
		Static334.aClass104_176 = arg3;
		Static44.aClass104_191 = arg1;
		Static14.aClass104_9 = arg0;
		Static264.aClass68ArrayArray1 = new Class68[Static14.aClass104_9.method2757()][];
		Static230.aBooleanArray26 = new boolean[Static14.aClass104_9.method2757()];
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
	public static void method276() {
		@Pc(1) Class107 local1 = Static294.aClass107_45;
		synchronized (Static294.aClass107_45) {
			Static294.aClass107_45.method3012();
		}
	}
}
