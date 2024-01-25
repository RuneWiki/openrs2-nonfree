import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Lclient!sf;")
	public static Class1_Sub7_Sub3 aClass1_Sub7_Sub3_3;

	@OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
	public static int anInt5734;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_9 = new Class146(13, 7);

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	public static final int anInt5727 = 12;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
	public static int anInt5733 = 0;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Z")
	public static final boolean aBoolean372 = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!a;ILclient!tf;)V")
	public static void method4602(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26_Sub2_Sub2_Sub1 arg3) {
		if ((arg0 & 0x1000) != 0) {
			arg3.aBoolean432 = arg1.method4086() == 1;
		}
		@Pc(23) byte local23 = -1;
		@Pc(34) int local34;
		if ((arg0 & 0x40) != 0) {
			local34 = arg1.method4130();
			@Pc(37) byte[] local37 = new byte[local34];
			@Pc(42) Class1_Sub1 local42 = new Class1_Sub1(local37);
			arg1.method4147(local34, local37);
			Static154.aClass1_Sub1Array1[arg2] = local42;
			arg3.method5262(local42);
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		if ((arg0 & 0x4) != 0) {
			local34 = arg1.method4088();
			local75 = arg1.method4129();
			local79 = arg1.method4086();
			@Pc(82) int local82 = arg1.anInt5056;
			@Pc(93) boolean local93 = (local34 & 0x8000) != 0;
			if (arg3.aString51 != null && arg3.aClass127_1 != null) {
				@Pc(101) boolean local101 = false;
				if (local75 <= 1) {
					if (!local93 && (Static273.aBoolean326 && !Static411.aBoolean461 || Static443.aBoolean484)) {
						local101 = true;
					} else if (Static149.method2259(arg3.aString51)) {
						local101 = true;
					}
				}
				if (!local101 && Static372.anInt7405 == 0) {
					Static346.aClass1_Sub1_5.anInt5056 = 0;
					arg1.method4102(Static346.aClass1_Sub1_5.aByteArray66, local79);
					Static346.aClass1_Sub1_5.anInt5056 = 0;
					@Pc(145) int local145 = -1;
					@Pc(164) String local164;
					if (local93) {
						local34 &= 0x7FFF;
						@Pc(155) Class85 local155 = Static281.method4021(Static346.aClass1_Sub1_5);
						local145 = local155.anInt2018;
						local164 = local155.aClass1_Sub2_Sub14_1.method4411(Static346.aClass1_Sub1_5);
					} else {
						local164 = Static118.method3303(Static259.method5040(Static346.aClass1_Sub1_5));
					}
					arg3.aString55 = local164.trim();
					arg3.anInt7114 = 150;
					arg3.anInt7115 = local34 >> 8;
					arg3.anInt7078 = local34 & 0xFF;
					@Pc(203) int local203;
					if (local75 == 1 || local75 == 2) {
						local203 = local93 ? 17 : 1;
					} else {
						local203 = local93 ? 17 : 2;
					}
					if (local75 == 2) {
						Static27.method486(0, "<img=1>" + arg3.method5259(), "<img=1>" + arg3.method5252(), null, local145, local164, local203);
					} else if (local75 == 1) {
						Static27.method486(0, "<img=0>" + arg3.method5259(), "<img=0>" + arg3.method5252(), null, local145, local164, local203);
					} else {
						Static27.method486(0, arg3.method5259(), arg3.method5252(), null, local145, local164, local203);
					}
				}
			}
			arg1.anInt5056 = local79 + local82;
		}
		if ((arg0 & 0x80) != 0) {
			Static444.aByteArray87[arg2] = arg1.method4112();
		}
		if ((arg0 & 0x40000) != 0) {
			local34 = arg1.method4124();
			if (local34 == 65535) {
				local34 = -1;
			}
			local75 = arg1.method4126();
			local79 = arg1.method4086();
			arg3.method5532(local79, local34, local75, true);
		}
		if ((arg0 & 0x2000) != 0) {
			arg3.aString55 = arg1.method4137();
			if (arg3.aString55.charAt(0) == '~') {
				arg3.aString55 = arg3.aString55.substring(1);
				Static130.method1888(arg3.method5252(), 0, 2, arg3.aString55, arg3.method5259());
			} else if (Static196.aClass26_Sub2_Sub2_Sub1_1 == arg3) {
				Static130.method1888(arg3.method5252(), 0, 2, arg3.aString55, arg3.method5259());
			}
			arg3.anInt7114 = 150;
			arg3.anInt7078 = 0;
			arg3.anInt7115 = 0;
		}
		if ((arg0 & 0x2) != 0) {
			local34 = arg1.method4096();
			local75 = arg1.method4118();
			arg3.method5531(Static403.anInt6978, local34, local75);
			arg3.anInt7139 = Static403.anInt6978 + 300;
			arg3.anInt7118 = arg1.method4086();
		}
		if ((arg0 & 0x20000) != 0) {
			arg3.aByte97 = arg1.method4121();
			arg3.aByte99 = arg1.method4121();
			arg3.aByte96 = arg1.method4128();
			arg3.aByte98 = (byte) arg1.method4118();
			arg3.anInt7117 = Static403.anInt6978 + arg1.method4093();
			arg3.anInt7083 = Static403.anInt6978 + arg1.method4124();
		}
		if ((arg0 & 0x4000) != 0) {
			local34 = arg1.method4093();
			local75 = arg1.method4133();
			if (local34 == 65535) {
				local34 = -1;
			}
			local79 = arg1.method4086();
			arg3.method5532(local79, local34, local75, false);
		}
		if ((arg0 & 0x1) != 0) {
			local34 = arg1.method4088();
			if (local34 == 65535) {
				local34 = -1;
			}
			arg3.anInt7090 = local34;
		}
		if ((arg0 & 0x10) != 0) {
			arg3.anInt6644 = arg1.method4095();
			if (arg3.anInt7148 == 0) {
				arg3.method5526(arg3.anInt6644);
				arg3.anInt6644 = -1;
			}
		}
		if ((arg0 & 0x400) != 0) {
			local23 = arg1.method4112();
		}
		if ((arg0 & 0x800) != 0) {
			local34 = arg1.method4095();
			arg3.anInt7130 = arg1.method4086();
			arg3.anInt7084 = arg1.method4129();
			arg3.anInt7124 = local34 & 0x7FFF;
			arg3.aBoolean456 = (local34 & 0x8000) != 0;
			arg3.anInt7096 = Static403.anInt6978 + arg3.anInt7124 + arg3.anInt7130;
		}
		if ((arg0 & 0x200) != 0) {
			local34 = Static403.anInt6978;
			local75 = arg1.method4096();
			local79 = arg1.method4118();
			arg3.method5531(local34, local75, local79);
		}
		if ((arg0 & 0x20) != 0) {
			local34 = arg1.method4088();
			if (local34 == 65535) {
				local34 = -1;
			}
			local75 = arg1.method4129();
			Static204.method3122(arg3, local75, local34);
		}
		if ((arg0 & 0x100) != 0) {
			arg3.anInt7137 = arg1.method4090();
			arg3.anInt7142 = arg1.method4121();
			arg3.anInt7094 = arg1.method4121();
			arg3.anInt7143 = arg1.method4128();
			arg3.anInt7088 = arg1.method4095() + Static403.anInt6978;
			arg3.anInt7103 = arg1.method4095() + Static403.anInt6978;
			arg3.anInt7093 = arg1.method4130();
			arg3.anInt7147 = 0;
			if (arg3.aBoolean434) {
				arg3.anInt7094 += arg3.anInt6656;
				arg3.anInt7142 += arg3.anInt6650;
				arg3.anInt7148 = 0;
				arg3.anInt7137 += arg3.anInt6656;
				arg3.anInt7143 += arg3.anInt6650;
			} else {
				arg3.anInt7137 += arg3.anIntArray590[0];
				arg3.anInt7148 = 1;
				arg3.anInt7142 += arg3.anIntArray589[0];
				arg3.anInt7143 += arg3.anIntArray589[0];
				arg3.anInt7094 += arg3.anIntArray590[0];
			}
		}
		if ((arg0 & 0x10000) != 0) {
			local34 = arg1.method4086();
			@Pc(797) int[] local797 = new int[local34];
			@Pc(800) int[] local800 = new int[local34];
			@Pc(803) int[] local803 = new int[local34];
			for (@Pc(805) int local805 = 0; local805 < local34; local805++) {
				@Pc(811) int local811 = arg1.method4093();
				if (local811 == 65535) {
					local811 = -1;
				}
				local797[local805] = local811;
				local800[local805] = arg1.method4130();
				local803[local805] = arg1.method4124();
			}
			Static408.method5511(arg3, local797, local803, local800);
		}
		if (!arg3.aBoolean434) {
			return;
		}
		if (local23 == 127) {
			arg3.method5256(arg3.anInt6656, arg3.anInt6650);
			return;
		}
		@Pc(853) byte local853;
		if (local23 == -1) {
			local853 = Static444.aByteArray87[arg2];
		} else {
			local853 = local23;
		}
		arg3.method5255(arg3.anInt6650, arg3.anInt6656, local853);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method4603() {
		if (Static227.aClass100_7 == null) {
			return;
		}
		if (Static227.aClass100_7.anInt2365 == 1) {
			Static227.aClass100_7 = null;
			return;
		}
		if (Static227.aClass100_7.anInt2365 == 2) {
			Static185.method2824(Static230.aClass138_2, Static238.aString35, 2);
			Static227.aClass100_7 = null;
			return;
		}
	}
}
