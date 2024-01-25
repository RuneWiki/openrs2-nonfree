import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public static int anInt1250;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_26 = new Class34("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)V")
	public static void method909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static30.anIntArray104[arg1] = arg0;
		@Pc(20) Class1_Sub12 local20 = (Class1_Sub12) Static192.aClass197_17.method5157((long) arg1);
		if (local20 == null) {
			local20 = new Class1_Sub12(Static162.method3252() + 500L);
			Static192.aClass197_17.method5166(local20, (long) arg1);
		} else {
			local20.aLong55 = Static162.method3252() + 500L;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIBI)I")
	public static int method910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static298.aClass53Array3 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(19) int local19 = arg4 >> 7;
			@Pc(23) int local23 = arg2 >> 7;
			if (arg0 < 0 || arg1 < 0 || Static233.anInt5573 - 1 < arg0 || arg1 > Static134.anInt2971 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static233.anInt5573 - 1 && local23 <= Static134.anInt2971 - 1) {
				@Pc(97) boolean local97 = (Static200.aByteArrayArrayArray8[1][arg4 >> 7][arg2 >> 7] & 0x2) != 0;
				@Pc(119) boolean local119;
				@Pc(135) boolean local135;
				if ((arg4 & 0x7F) == 0) {
					local119 = (Static200.aByteArrayArrayArray8[1][local19 - 1][arg2 >> 7] & 0x2) != 0;
					local135 = (Static200.aByteArrayArrayArray8[1][local19][arg2 >> 7] & 0x2) != 0;
					if (local119 != local135) {
						local97 = (Static200.aByteArrayArrayArray8[1][arg0][arg1] & 0x2) != 0;
					}
				}
				if ((arg2 & 0x7F) == 0) {
					local119 = (Static200.aByteArrayArrayArray8[1][arg4 >> 7][local23 - 1] & 0x2) != 0;
					local135 = (Static200.aByteArrayArrayArray8[1][arg4 >> 7][local23] & 0x2) != 0;
					if (local119 != local135) {
						local97 = (Static200.aByteArrayArrayArray8[1][arg0][arg1] & 0x2) != 0;
					}
				}
				if (local97) {
					arg3++;
				}
				return Static298.aClass53Array3[arg3].method2792(arg4, arg2);
			} else {
				return 0;
			}
		} else {
			return Static298.aClass53Array3[arg3].method2792(arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method912(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static342.aClass1_Sub8_Sub1_7.method3229(56);
			Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(arg0));
			Static342.aClass1_Sub8_Sub1_7.method4531(arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ki;)V")
	public static void method913(@OriginalArg(1) Class17_Sub1_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt4873 - Static5.anInt208;
		@Pc(21) int local21 = arg0.anInt4825 * 128 + arg0.method4318() * 64;
		@Pc(32) int local32 = arg0.anInt4862 * 128 + arg0.method4318() * 64;
		arg0.anInt4887 = 0;
		arg0.anInt5109 += (local21 - arg0.anInt5109) / local9;
		arg0.anInt5108 += (local32 - arg0.anInt5108) / local9;
		if (arg0.anInt4826 == 0) {
			arg0.method4320(8192);
		}
		if (arg0.anInt4826 == 1) {
			arg0.method4320(12288);
		}
		if (arg0.anInt4826 == 2) {
			arg0.method4320(0);
		}
		if (arg0.anInt4826 == 3) {
			arg0.method4320(4096);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V")
	public static void method914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= Static197.anInt4211 && Static326.anInt2469 >= arg3) {
			@Pc(24) int local24 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg1);
			@Pc(30) int local30 = Static223.method5338(Static268.anInt5477, Static342.anInt3000, arg0);
			Static300.method5086(arg2, local30, local24, arg3);
		}
	}
}
