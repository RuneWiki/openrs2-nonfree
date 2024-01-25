import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	private int anInt4643;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "S")
	private short aShort48;

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "[Lclient!mf;")
	private Class155[] aClass155Array1;

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "Lclient!nn;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!oj", name = "M", descriptor = "B")
	private byte aByte53;

	@OriginalMember(owner = "client!oj", name = "P", descriptor = "[Lclient!oq;")
	private Class182[] aClass182Array1;

	@OriginalMember(owner = "client!oj", name = "S", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!oj", name = "U", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!oj", name = "ab", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!oj", name = "db", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!oj", name = "eb", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!oj", name = "fb", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!oj", name = "gb", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!oj", name = "hb", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!oj", name = "ib", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!oj", name = "kb", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!oj", name = "lb", descriptor = "Lclient!fw;")
	private Interface5 lb;

	@OriginalMember(owner = "client!oj", name = "ob", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!oj", name = "pb", descriptor = "[Lclient!qe;")
	private Class199[] aClass199Array1;

	@OriginalMember(owner = "client!oj", name = "qb", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!oj", name = "zb", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!oj", name = "Ab", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!oj", name = "Bb", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!oj", name = "Db", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!oj", name = "Eb", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!oj", name = "Gb", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!oj", name = "Kb", descriptor = "I")
	private int anInt4683;

	@OriginalMember(owner = "client!oj", name = "Mb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!oj", name = "Nb", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!oj", name = "Pb", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!oj", name = "Rb", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!oj", name = "Yb", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!oj", name = "dc", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!oj", name = "fc", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!oj", name = "hc", descriptor = "Lclient!gj;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!oj", name = "kc", descriptor = "[Lclient!vt;")
	private Class259[] aClass259Array1;

	@OriginalMember(owner = "client!oj", name = "nc", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!oj", name = "qc", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "Z")
	private boolean aBoolean331 = true;

	@OriginalMember(owner = "client!oj", name = "xb", descriptor = "I")
	private int anInt4677 = 0;

	@OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
	private int anInt4665 = 0;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
	private boolean aBoolean330 = false;

	@OriginalMember(owner = "client!oj", name = "ub", descriptor = "I")
	private int anInt4675 = 0;

	@OriginalMember(owner = "client!oj", name = "Fb", descriptor = "I")
	private int anInt4679 = 0;

	@OriginalMember(owner = "client!oj", name = "bc", descriptor = "I")
	private int anInt4695 = 0;

	@OriginalMember(owner = "client!oj", name = "ec", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_31;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "Lclient!hf;")
	private Class100 aClass100_11;

	@OriginalMember(owner = "client!oj", name = "Y", descriptor = "Lclient!hf;")
	private Class100 aClass100_12;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Lclient!hf;")
	private Class100 aClass100_10;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "Lclient!hf;")
	private Class100 aClass100_9;

	@OriginalMember(owner = "client!oj", name = "vb", descriptor = "Lclient!fb;")
	private Class73 aClass73_1;

	static {
		new Class134("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class59_Sub1(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aClass163_Sub2_31 = arg0;
		this.aClass100_11 = new Class100(null, 5126, 3, 0);
		this.aClass100_12 = new Class100(null, 5126, 2, 0);
		this.aClass100_10 = new Class100(null, 5126, 3, 0);
		this.aClass100_9 = new Class100(null, 5121, 4, 0);
		this.aClass73_1 = new Class73();
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!pg;Lclient!qq;IIII)V")
	public Class59_Sub1(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4683 = arg2;
		this.aClass163_Sub2_31 = arg0;
		this.anInt4643 = arg5;
		if (Static221.method2935(arg2, arg5)) {
			this.aClass100_11 = new Class100(null, 5126, 3, 0);
		}
		if (Static369.method4838(arg2, arg5)) {
			this.aClass100_12 = new Class100(null, 5126, 2, 0);
		}
		if (Static49.method693(arg5, arg2)) {
			this.aClass100_10 = new Class100(null, 5126, 3, 0);
		}
		if (Static176.method68(arg5, arg2)) {
			this.aClass100_9 = new Class100(null, 5121, 4, 0);
		}
		if (Static40.method624(arg2, arg5)) {
			this.aClass73_1 = new Class73();
		}
		@Pc(102) Interface9 local102 = arg0.anInterface9_12;
		@Pc(106) int[] local106 = new int[arg1.anInt5608];
		this.anIntArray403 = new int[arg1.anInt5607 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt5608; local115++) {
			if ((arg1.aByteArray73 == null || arg1.aByteArray73[local115] != 2) && (arg1.aShortArray65 == null || arg1.aShortArray65[local115] == -1 || !local102.method1769(arg1.aShortArray65[local115] & 0xFFFF).aBoolean281)) {
				local106[this.anInt4675++] = local115;
				this.anIntArray403[arg1.aShortArray67[local115]]++;
				this.anIntArray403[arg1.aShortArray60[local115]]++;
				this.anIntArray403[arg1.aShortArray61[local115]]++;
			}
		}
		this.anInt4665 = this.anInt4675;
		@Pc(205) long[] local205 = new long[this.anInt4675];
		@Pc(214) boolean local214 = (this.anInt4683 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(368) int local368;
		label490: for (@Pc(216) int local216 = 0; local216 < this.anInt4675; local216++) {
			@Pc(222) int local222 = local106[local216];
			@Pc(224) Class158 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass55Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass55Array1.length; local237++) {
					@Pc(244) Class55 local244 = arg1.aClass55Array1[local237];
					if (local244.anInt1462 == local222) {
						@Pc(257) Class24 local257 = Static260.method3499(local244.anInt1458);
						if (local257.aBoolean57) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt4665--;
							continue label490;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray65 != null) {
				local280 = arg1.aShortArray65[local222];
				if (local280 != -1) {
					local224 = local102.method1769(local280 & 0xFFFF);
					local230 = local224.aByte43;
					local232 = local224.aByte44;
				}
			}
			@Pc(324) boolean local324 = arg1.aByteArray74 != null && arg1.aByteArray74[local222] != 0 || local224 != null && !local224.aBoolean280;
			if ((local214 || local324) && arg1.aByteArray75 != null) {
				local226 += arg1.aByteArray75[local222] << 17;
			}
			if (local324) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local226 += local232 & 0xFF;
			local368 = local228 + ((local280 & 0xFFFF) << 16);
			@Pc(374) int local374 = local368 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + ((long) local374);
		}
		Static402.method5076(local205, local106);
		this.anInt4677 = arg1.anInt5607;
		this.anIntArray402 = arg1.anIntArray489;
		this.anIntArray401 = arg1.anIntArray492;
		this.aShortArray44 = arg1.aShortArray62;
		this.anInt4695 = arg1.anInt5609;
		this.anIntArray405 = arg1.anIntArray494;
		@Pc(422) Class117[] local422 = new Class117[this.anInt4677];
		this.aClass155Array1 = arg1.aClass155Array2;
		this.aClass199Array1 = arg1.aClass199Array2;
		@Pc(450) int local450;
		@Pc(464) int local464;
		if (arg1.aClass55Array1 != null) {
			this.anInt4664 = arg1.aClass55Array1.length;
			this.aClass259Array1 = new Class259[this.anInt4664];
			this.aClass182Array1 = new Class182[this.anInt4664];
			for (local450 = 0; local450 < this.anInt4664; local450++) {
				@Pc(457) Class55 local457 = arg1.aClass55Array1[local450];
				@Pc(462) Class24 local462 = Static260.method3499(local457.anInt1458);
				local464 = -1;
				for (@Pc(466) int local466 = 0; local466 < this.anInt4675; local466++) {
					if (local106[local466] == local457.anInt1462) {
						local464 = local466;
						break;
					}
				}
				if (local464 == -1) {
					throw new RuntimeException();
				}
				local237 = Static237.anIntArray330[arg1.aShortArray68[local457.anInt1462] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray74 == null ? 0 : arg1.aByteArray74[local457.anInt1462]) << 24;
				this.aClass259Array1[local450] = new Class259(local464, arg1.aShortArray67[local457.anInt1462], arg1.aShortArray60[local457.anInt1462], arg1.aShortArray61[local457.anInt1462], local462.anInt590, local462.anInt595, local462.anInt588, local462.anInt591, local462.anInt592, local462.aBoolean57, local462.aBoolean58, local457.anInt1456);
				this.aClass182Array1[local450] = new Class182(local237);
			}
		}
		local450 = this.anInt4675 * 3;
		this.aShort49 = (short) arg4;
		this.aShortArray42 = new short[local450];
		this.aFloatArray24 = new float[local450];
		this.aShortArray43 = new short[this.anInt4675];
		this.aFloatArray25 = new float[local450];
		if (arg1.aShortArray66 != null) {
			this.aShortArray51 = new short[this.anInt4675];
		}
		this.aShort56 = (short) arg3;
		this.aByteArray55 = new byte[this.anInt4675];
		this.aShortArray48 = new short[local450];
		this.aShortArray50 = new short[this.anInt4675];
		this.aShortArray46 = new short[local450];
		this.aShortArray49 = new short[this.anInt4675];
		this.aByteArray54 = new byte[local450];
		Static103.aLongArray3 = new long[local450];
		this.aShortArray47 = new short[local450];
		this.aShortArray45 = new short[this.anInt4675];
		this.aShortArray41 = new short[this.anInt4675];
		local226 = 0;
		for (local368 = 0; local368 < arg1.anInt5607; local368++) {
			local464 = this.anIntArray403[local368];
			this.anIntArray403[local368] = local226;
			local422[local368] = new Class117();
			local226 += local464;
		}
		this.anIntArray403[arg1.anInt5607] = local226;
		@Pc(709) int[] local709 = null;
		@Pc(711) int[] local711 = null;
		@Pc(713) int[] local713 = null;
		@Pc(715) float[][] local715 = null;
		@Pc(741) int local741;
		@Pc(773) int local773;
		@Pc(779) int local779;
		@Pc(792) int local792;
		@Pc(794) int local794;
		@Pc(827) int local827;
		@Pc(832) int local832;
		@Pc(1002) float local1002;
		@Pc(995) float local995;
		@Pc(1004) float local1004;
		if (arg1.aByteArray72 != null) {
			@Pc(721) int local721 = arg1.anInt5610;
			@Pc(724) int[] local724 = new int[local721];
			@Pc(727) int[] local727 = new int[local721];
			@Pc(730) int[] local730 = new int[local721];
			@Pc(733) int[] local733 = new int[local721];
			@Pc(736) int[] local736 = new int[local721];
			@Pc(739) int[] local739 = new int[local721];
			for (local741 = 0; local741 < local721; local741++) {
				local724[local741] = Integer.MAX_VALUE;
				local727[local741] = -2147483647;
				local730[local741] = Integer.MAX_VALUE;
				local733[local741] = -2147483647;
				local736[local741] = Integer.MAX_VALUE;
				local739[local741] = -2147483647;
			}
			for (local773 = 0; local773 < this.anInt4675; local773++) {
				local779 = local106[local773];
				if (arg1.aByteArray72[local779] != -1) {
					local792 = arg1.aByteArray72[local779] & 0xFF;
					for (local794 = 0; local794 < 3; local794++) {
						@Pc(803) short local803;
						if (local794 == 0) {
							local803 = arg1.aShortArray67[local779];
						} else if (local794 == 1) {
							local803 = arg1.aShortArray60[local779];
						} else {
							local803 = arg1.aShortArray61[local779];
						}
						local827 = arg1.anIntArray494[local803];
						local832 = arg1.anIntArray489[local803];
						@Pc(837) int local837 = arg1.anIntArray492[local803];
						if (local724[local792] > local827) {
							local724[local792] = local827;
						}
						if (local727[local792] < local827) {
							local727[local792] = local827;
						}
						if (local832 < local730[local792]) {
							local730[local792] = local832;
						}
						if (local733[local792] < local832) {
							local733[local792] = local832;
						}
						if (local736[local792] > local837) {
							local736[local792] = local837;
						}
						if (local739[local792] < local837) {
							local739[local792] = local837;
						}
					}
				}
			}
			local713 = new int[local721];
			local715 = new float[local721][];
			local711 = new int[local721];
			local709 = new int[local721];
			for (local779 = 0; local779 < local721; local779++) {
				@Pc(941) byte local941 = arg1.aByteArray70[local779];
				if (local941 > 0) {
					local709[local779] = (local724[local779] + local727[local779]) / 2;
					local711[local779] = (local730[local779] + local733[local779]) / 2;
					local713[local779] = (local739[local779] + local736[local779]) / 2;
					if (local941 == 1) {
						local832 = arg1.anIntArray485[local779];
						local995 = 64.0F / (float) arg1.anIntArray486[local779];
						if (local832 == 0) {
							local1002 = 1.0F;
							local1004 = 1.0F;
						} else if (local832 > 0) {
							local1004 = (float) local832 / 1024.0F;
							local1002 = 1.0F;
						} else {
							local1004 = 1.0F;
							local1002 = (float) -local832 / 1024.0F;
						}
					} else if (local941 == 2) {
						local1004 = 64.0F / (float) arg1.anIntArray488[local779];
						local995 = 64.0F / (float) arg1.anIntArray486[local779];
						local1002 = 64.0F / (float) arg1.anIntArray485[local779];
					} else {
						local1002 = (float) arg1.anIntArray485[local779] / 1024.0F;
						local1004 = (float) arg1.anIntArray488[local779] / 1024.0F;
						local995 = (float) arg1.anIntArray486[local779] / 1024.0F;
					}
					local715[local779] = Static391.method5005(arg1.aShortArray64[local779], local995, arg1.aShortArray69[local779], arg1.aShortArray63[local779], local1004, arg1.aByteArray71[local779] & 0xFF, local1002);
				}
			}
		}
		@Pc(1121) Class33[] local1121 = new Class33[arg1.anInt5608];
		@Pc(1140) short local1140;
		@Pc(1150) int local1150;
		@Pc(1160) int local1160;
		@Pc(1222) int local1222;
		for (@Pc(1123) int local1123 = 0; local1123 < arg1.anInt5608; local1123++) {
			@Pc(1130) short local1130 = arg1.aShortArray67[local1123];
			@Pc(1135) short local1135 = arg1.aShortArray60[local1123];
			local1140 = arg1.aShortArray61[local1123];
			local1150 = this.anIntArray405[local1135] - this.anIntArray405[local1130];
			local1160 = this.anIntArray402[local1135] - this.anIntArray402[local1130];
			local741 = this.anIntArray401[local1135] - this.anIntArray401[local1130];
			local773 = this.anIntArray405[local1140] - this.anIntArray405[local1130];
			local779 = this.anIntArray402[local1140] - this.anIntArray402[local1130];
			local792 = this.anIntArray401[local1140] - this.anIntArray401[local1130];
			local794 = local792 * local1160 - local741 * local779;
			local1222 = local773 * local741 - local792 * local1150;
			local827 = local779 * local1150 - local1160 * local773;
			while (local794 > 8192 || local1222 > 8192 || local827 > 8192 || local794 < -8192 || local1222 < -8192 || local827 < -8192) {
				local1222 >>= 0x1;
				local827 >>= 0x1;
				local794 >>= 0x1;
			}
			local832 = (int) Math.sqrt((double) (local827 * local827 + local1222 * local1222 + local794 * local794));
			if (local832 <= 0) {
				local832 = 1;
			}
			local1222 = local1222 * 256 / local832;
			local827 = local827 * 256 / local832;
			local794 = local794 * 256 / local832;
			@Pc(1323) byte local1323 = arg1.aByteArray73 == null ? 0 : arg1.aByteArray73[local1123];
			if (local1323 == 0) {
				@Pc(1354) Class117 local1354 = local422[local1130];
				local1354.anInt3051 += local827;
				local1354.anInt3049++;
				local1354.anInt3048 += local1222;
				local1354.anInt3047 += local794;
				@Pc(1382) Class117 local1382 = local422[local1135];
				local1382.anInt3048 += local1222;
				local1382.anInt3051 += local827;
				local1382.anInt3047 += local794;
				local1382.anInt3049++;
				@Pc(1410) Class117 local1410 = local422[local1140];
				local1410.anInt3048 += local1222;
				local1410.anInt3049++;
				local1410.anInt3047 += local794;
				local1410.anInt3051 += local827;
			} else if (local1323 == 1) {
				@Pc(1339) Class33 local1339 = local1121[local1123] = new Class33();
				local1339.anInt815 = local827;
				local1339.anInt816 = local794;
				local1339.anInt818 = local1222;
			}
		}
		@Pc(1447) int local1447;
		for (@Pc(1441) int local1441 = 0; local1441 < this.anInt4675; local1441++) {
			local1447 = local106[local1441];
			@Pc(1454) int local1454 = arg1.aShortArray68[local1447] & 0xFFFF;
			@Pc(1459) short local1459;
			if (arg1.aShortArray65 == null) {
				local1459 = -1;
			} else {
				local1459 = arg1.aShortArray65[local1447];
			}
			if (arg1.aByteArray72 == null) {
				local1160 = -1;
			} else {
				local1160 = arg1.aByteArray72[local1447];
			}
			if (arg1.aByteArray74 == null) {
				local741 = 0;
			} else {
				local741 = arg1.aByteArray74[local1447] & 0xFF;
			}
			@Pc(1494) float local1494 = 0.0F;
			@Pc(1496) float local1496 = 0.0F;
			@Pc(1498) float local1498 = 0.0F;
			local1002 = 0.0F;
			local995 = 0.0F;
			local1004 = 0.0F;
			@Pc(1506) byte local1506 = 0;
			@Pc(1508) byte local1508 = 0;
			@Pc(1510) int local1510 = 0;
			@Pc(1544) byte local1544;
			@Pc(1561) short local1561;
			@Pc(2310) short local2310;
			@Pc(2315) short local2315;
			if (local1459 != -1) {
				if (local1160 == -1) {
					local1002 = 1.0F;
					local995 = 0.0F;
					local1506 = 1;
					local1498 = 1.0F;
					local1494 = 0.0F;
					local1004 = 0.0F;
					local1496 = 1.0F;
					local1508 = 2;
				} else {
					local1160 &= 0xFF;
					local1544 = arg1.aByteArray70[local1160];
					@Pc(1551) short local1551;
					@Pc(1556) short local1556;
					@Pc(1590) float local1590;
					@Pc(1603) float local1603;
					@Pc(1682) float local1682;
					@Pc(1921) float local1921;
					@Pc(1929) float local1929;
					@Pc(1937) float local1937;
					@Pc(1960) float local1960;
					@Pc(1983) float local1983;
					@Pc(2006) float local2006;
					if (local1544 == 0) {
						local1551 = arg1.aShortArray67[local1447];
						local1556 = arg1.aShortArray60[local1447];
						local1561 = arg1.aShortArray61[local1447];
						local2310 = arg1.aShortArray64[local1160];
						local2315 = arg1.aShortArray69[local1160];
						@Pc(2320) short local2320 = arg1.aShortArray63[local1160];
						@Pc(2326) float local2326 = (float) arg1.anIntArray494[local2310];
						@Pc(2332) float local2332 = (float) arg1.anIntArray489[local2310];
						local1590 = arg1.anIntArray492[local2310];
						local1603 = (float) arg1.anIntArray494[local2315] - local2326;
						local1682 = (float) arg1.anIntArray489[local2315] - local2332;
						@Pc(2364) float local2364 = (float) arg1.anIntArray492[local2315] - local1590;
						@Pc(2372) float local2372 = (float) arg1.anIntArray494[local2320] - local2326;
						@Pc(2380) float local2380 = (float) arg1.anIntArray489[local2320] - local2332;
						@Pc(2389) float local2389 = (float) arg1.anIntArray492[local2320] - local1590;
						@Pc(2397) float local2397 = (float) arg1.anIntArray494[local1551] - local2326;
						@Pc(2406) float local2406 = (float) arg1.anIntArray489[local1551] - local2332;
						@Pc(2414) float local2414 = (float) arg1.anIntArray492[local1551] - local1590;
						@Pc(2422) float local2422 = (float) arg1.anIntArray494[local1556] - local2326;
						@Pc(2431) float local2431 = (float) arg1.anIntArray489[local1556] - local2332;
						local1921 = (float) arg1.anIntArray492[local1556] - local1590;
						local1929 = (float) arg1.anIntArray494[local1561] - local2326;
						local1937 = (float) arg1.anIntArray489[local1561] - local2332;
						local1960 = (float) arg1.anIntArray492[local1561] - local1590;
						local1983 = local1682 * local2389 - local2380 * local2364;
						local2006 = local2364 * local2372 - local2389 * local1603;
						@Pc(2491) float local2491 = local2380 * local1603 - local1682 * local2372;
						@Pc(2499) float local2499 = local2491 * local2380 - local2389 * local2006;
						@Pc(2508) float local2508 = local1983 * local2389 - local2491 * local2372;
						@Pc(2516) float local2516 = local2372 * local2006 - local1983 * local2380;
						@Pc(2530) float local2530 = 1.0F / (local2516 * local2364 + local2508 * local1682 + local2499 * local1603);
						local995 = (local1960 * local2516 + local1929 * local2499 + local1937 * local2508) * local2530;
						local1494 = (local2414 * local2516 + local2499 * local2397 + local2508 * local2406) * local2530;
						local1498 = (local2516 * local1921 + local2508 * local2431 + local2499 * local2422) * local2530;
						@Pc(2581) float local2581 = local1603 * local2006 - local1983 * local1682;
						@Pc(2589) float local2589 = local2364 * local1983 - local1603 * local2491;
						@Pc(2598) float local2598 = local2491 * local1682 - local2364 * local2006;
						@Pc(2612) float local2612 = 1.0F / (local2581 * local2389 + local2598 * local2372 + local2380 * local2589);
						local1004 = local2612 * (local2589 * local1937 + local2598 * local1929 + local1960 * local2581);
						local1496 = (local2414 * local2581 + local2397 * local2598 + local2589 * local2406) * local2612;
						local1002 = local2612 * (local2431 * local2589 + local2422 * local2598 + local1921 * local2581);
					} else {
						local1551 = arg1.aShortArray67[local1447];
						local1556 = arg1.aShortArray60[local1447];
						local1561 = arg1.aShortArray61[local1447];
						@Pc(1565) int local1565 = local709[local1160];
						@Pc(1569) int local1569 = local711[local1160];
						@Pc(1573) int local1573 = local713[local1160];
						@Pc(1577) float[] local1577 = local715[local1160];
						@Pc(1582) byte local1582 = arg1.aByteArray69[local1160];
						local1590 = (float) arg1.anIntArray487[local1160] / 256.0F;
						if (local1544 == 1) {
							local1603 = (float) arg1.anIntArray488[local1160] / 1024.0F;
							Static115.method1744(arg1.anIntArray489[local1551], local1582, local1603, local1590, arg1.anIntArray494[local1551], local1569, arg1.anIntArray492[local1551], local1573, local1565, local1577);
							local1494 = Static229.aFloat38;
							local1496 = Static156.aFloat28;
							Static115.method1744(arg1.anIntArray489[local1556], local1582, local1603, local1590, arg1.anIntArray494[local1556], local1569, arg1.anIntArray492[local1556], local1573, local1565, local1577);
							local1002 = Static156.aFloat28;
							local1498 = Static229.aFloat38;
							Static115.method1744(arg1.anIntArray489[local1561], local1582, local1603, local1590, arg1.anIntArray494[local1561], local1569, arg1.anIntArray492[local1561], local1573, local1565, local1577);
							local995 = Static229.aFloat38;
							local1004 = Static156.aFloat28;
							local1682 = local1603 / 2.0F;
							if ((local1582 & 0x1) == 0) {
								if (local1682 < local1498 - local1494) {
									local1498 -= local1603;
									local1506 = 1;
								} else if (local1682 < local1494 - local1498) {
									local1506 = 2;
									local1498 += local1603;
								}
								if (local995 - local1494 > local1682) {
									local1508 = 1;
									local995 -= local1603;
								} else if (local1682 < local1494 - local995) {
									local1508 = 2;
									local995 += local1603;
								}
							} else {
								if (local1682 < local1002 - local1496) {
									local1002 -= local1603;
									local1506 = 1;
								} else if (local1496 - local1002 > local1682) {
									local1002 += local1603;
									local1506 = 2;
								}
								if (local1682 < local1004 - local1496) {
									local1004 -= local1603;
									local1508 = 1;
								} else if (local1496 - local1004 > local1682) {
									local1508 = 2;
									local1004 += local1603;
								}
							}
						} else if (local1544 == 2) {
							local1603 = (float) arg1.anIntArray490[local1160] / 256.0F;
							local1682 = (float) arg1.anIntArray491[local1160] / 256.0F;
							@Pc(1834) int local1834 = arg1.anIntArray494[local1556] - arg1.anIntArray494[local1551];
							@Pc(1845) int local1845 = arg1.anIntArray489[local1556] - arg1.anIntArray489[local1551];
							@Pc(1856) int local1856 = arg1.anIntArray492[local1556] - arg1.anIntArray492[local1551];
							@Pc(1867) int local1867 = arg1.anIntArray494[local1561] - arg1.anIntArray494[local1551];
							@Pc(1877) int local1877 = arg1.anIntArray489[local1561] - arg1.anIntArray489[local1551];
							@Pc(1887) int local1887 = arg1.anIntArray492[local1561] - arg1.anIntArray492[local1551];
							@Pc(1895) int local1895 = local1845 * local1887 - local1856 * local1877;
							@Pc(1904) int local1904 = local1867 * local1856 - local1834 * local1887;
							@Pc(1913) int local1913 = local1877 * local1834 - local1845 * local1867;
							local1921 = 64.0F / (float) arg1.anIntArray485[local1160];
							local1929 = 64.0F / (float) arg1.anIntArray486[local1160];
							local1937 = 64.0F / (float) arg1.anIntArray488[local1160];
							local1960 = ((float) local1895 * local1577[0] + (float) local1904 * local1577[1] + (float) local1913 * local1577[2]) / local1921;
							local1983 = (local1577[3] * (float) local1895 + (float) local1904 * local1577[4] + local1577[5] * (float) local1913) / local1929;
							local2006 = ((float) local1895 * local1577[6] + (float) local1904 * local1577[7] + local1577[8] * (float) local1913) / local1937;
							local1510 = Static459.method3279(local2006, local1983, local1960);
							Static209.method2809(arg1.anIntArray489[local1551], local1573, local1590, local1582, local1565, local1510, local1569, local1682, local1603, arg1.anIntArray492[local1551], arg1.anIntArray494[local1551], local1577);
							local1494 = Static62.aFloat15;
							local1496 = Static250.aFloat44;
							Static209.method2809(arg1.anIntArray489[local1556], local1573, local1590, local1582, local1565, local1510, local1569, local1682, local1603, arg1.anIntArray492[local1556], arg1.anIntArray494[local1556], local1577);
							local1498 = Static62.aFloat15;
							local1002 = Static250.aFloat44;
							Static209.method2809(arg1.anIntArray489[local1561], local1573, local1590, local1582, local1565, local1510, local1569, local1682, local1603, arg1.anIntArray492[local1561], arg1.anIntArray494[local1561], local1577);
							local995 = Static62.aFloat15;
							local1004 = Static250.aFloat44;
						} else if (local1544 == 3) {
							Static215.method2850(local1565, arg1.anIntArray494[local1551], local1569, arg1.anIntArray489[local1551], local1577, local1582, local1573, arg1.anIntArray492[local1551], local1590);
							local1496 = Static53.aFloat11;
							local1494 = Static142.aFloat27;
							Static215.method2850(local1565, arg1.anIntArray494[local1556], local1569, arg1.anIntArray489[local1556], local1577, local1582, local1573, arg1.anIntArray492[local1556], local1590);
							local1498 = Static142.aFloat27;
							local1002 = Static53.aFloat11;
							Static215.method2850(local1565, arg1.anIntArray494[local1561], local1569, arg1.anIntArray489[local1561], local1577, local1582, local1573, arg1.anIntArray492[local1561], local1590);
							local995 = Static142.aFloat27;
							local1004 = Static53.aFloat11;
							if ((local1582 & 0x1) == 0) {
								if (local1498 - local1494 > 0.5F) {
									local1506 = 1;
									local1498--;
								} else if (local1494 - local1498 > 0.5F) {
									local1498++;
									local1506 = 2;
								}
								if (local995 - local1494 > 0.5F) {
									local1508 = 1;
									local995--;
								} else if (local1494 - local995 > 0.5F) {
									local1508 = 2;
									local995++;
								}
							} else {
								if (local1004 - local1496 > 0.5F) {
									local1508 = 1;
									local1004--;
								} else if (local1496 - local1004 > 0.5F) {
									local1508 = 2;
									local1004++;
								}
								if (local1002 - local1496 > 0.5F) {
									local1002--;
									local1506 = 1;
								} else if (local1496 - local1002 > 0.5F) {
									local1506 = 2;
									local1002++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray73 == null) {
				local1544 = 0;
			} else {
				local1544 = arg1.aByteArray73[local1447];
			}
			if (local1544 == 0) {
				@Pc(2816) long local2816 = ((long) local741 + (long) (local1454 << 8) + (long) (local1510 << 24) << 32) + (long) (local1160 << 2);
				local1561 = arg1.aShortArray67[local1447];
				local2310 = arg1.aShortArray60[local1447];
				local2315 = arg1.aShortArray61[local1447];
				@Pc(2835) Class117 local2835 = local422[local1561];
				this.aShortArray49[local1441] = this.method3811(local2835.anInt3048, local1494, local2835.anInt3047, local2835.anInt3051, local1496, local2816, local1561, arg1, local2835.anInt3049);
				@Pc(2859) Class117 local2859 = local422[local2310];
				this.aShortArray41[local1441] = this.method3811(local2859.anInt3048, local1498, local2859.anInt3047, local2859.anInt3051, local1002, (long) local1506 + local2816, local2310, arg1, local2859.anInt3049);
				@Pc(2886) Class117 local2886 = local422[local2315];
				this.aShortArray50[local1441] = this.method3811(local2886.anInt3048, local995, local2886.anInt3047, local2886.anInt3051, local1004, (long) local1508 + local2816, local2315, arg1, local2886.anInt3049);
			} else if (local1544 == 1) {
				@Pc(2678) Class33 local2678 = local1121[local1447];
				@Pc(2722) long local2722 = ((long) (local1510 << 24) + (long) (local1454 << 8) + (long) local741 << 32) + (long) ((local2678.anInt818 + 256 << 12) + (local2678.anInt816 > 0 ? 1024 : 2048) + ((local1160 << 2) - -(local2678.anInt815 + 256 << 22)));
				this.aShortArray49[local1441] = this.method3811(local2678.anInt818, local1494, local2678.anInt816, local2678.anInt815, local1496, local2722, arg1.aShortArray67[local1447], arg1, 0);
				this.aShortArray41[local1441] = this.method3811(local2678.anInt818, local1498, local2678.anInt816, local2678.anInt815, local1002, local2722 + (long) local1506, arg1.aShortArray60[local1447], arg1, 0);
				this.aShortArray50[local1441] = this.method3811(local2678.anInt818, local995, local2678.anInt816, local2678.anInt815, local1004, (long) local1508 + local2722, arg1.aShortArray61[local1447], arg1, 0);
			}
			if (arg1.aShortArray65 == null) {
				this.aShortArray43[local1441] = -1;
			} else {
				this.aShortArray43[local1441] = arg1.aShortArray65[local1447];
			}
			if (arg1.aByteArray74 != null) {
				this.aByteArray55[local1441] = arg1.aByteArray74[local1447];
			}
			if (arg1.aShortArray66 != null) {
				this.aShortArray51[local1441] = arg1.aShortArray66[local1447];
			}
			this.aShortArray45[local1441] = arg1.aShortArray68[local1447];
		}
		local1447 = 0;
		local1140 = -10000;
		for (local1150 = 0; local1150 < this.anInt4665; local1150++) {
			@Pc(2975) short local2975 = this.aShortArray43[local1150];
			if (local2975 != local1140) {
				local1140 = local2975;
				local1447++;
			}
		}
		this.anIntArray404 = new int[local1447 + 1];
		local1447 = 0;
		local1140 = -10000;
		for (local1160 = 0; local1160 < this.anInt4665; local1160++) {
			@Pc(3013) short local3013 = this.aShortArray43[local1160];
			if (local1140 != local3013) {
				local1140 = local3013;
				this.anIntArray404[local1447++] = local1160;
			}
		}
		this.anIntArray404[local1447] = this.anInt4665;
		Static103.aLongArray3 = null;
		this.aShortArray42 = Static256.method2305(this.anInt4679, this.aShortArray42);
		this.aShortArray47 = Static256.method2305(this.anInt4679, this.aShortArray47);
		this.aShortArray46 = Static256.method2305(this.anInt4679, this.aShortArray46);
		this.aByteArray54 = Static172.method2447(this.anInt4679, this.aByteArray54);
		this.aFloatArray24 = Static97.method1506(this.aFloatArray24, this.anInt4679);
		this.aFloatArray25 = Static97.method1506(this.aFloatArray25, this.anInt4679);
		if (arg1.anIntArray493 != null && Static58.method838(arg2, this.anInt4643)) {
			this.anIntArrayArray35 = arg1.method4442();
		}
		if (arg1.aClass55Array1 != null && Static44.method4795(arg2, this.anInt4643)) {
			this.anIntArrayArray36 = arg1.method4438();
		}
		if (arg1.anIntArray484 != null && Static68.method4000(arg2, this.anInt4643)) {
			local741 = 0;
			@Pc(3131) int[] local3131 = new int[256];
			for (local779 = 0; local779 < this.anInt4675; local779++) {
				local792 = arg1.anIntArray484[local106[local779]];
				if (local792 >= 0) {
					if (local792 > local741) {
						local741 = local792;
					}
					@Pc(3157) int local3157 = local3131[local792]++;
				}
			}
			this.anIntArrayArray37 = new int[local741 + 1][];
			for (local792 = 0; local792 <= local741; local792++) {
				this.anIntArrayArray37[local792] = new int[local3131[local792]];
				local3131[local792] = 0;
			}
			for (local794 = 0; local794 < this.anInt4675; local794++) {
				local1222 = arg1.anIntArray484[local106[local794]];
				if (local1222 >= 0) {
					this.anIntArrayArray37[local1222][local3131[local1222]++] = local794;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!sh;B)V")
	private void method3807(@OriginalArg(0) Class31_Sub2 arg0) {
		@Pc(6) int local6;
		if (this.aClass155Array1 != null) {
			for (local6 = 0; local6 < this.aClass155Array1.length; local6++) {
				@Pc(13) Class155 local13 = this.aClass155Array1[local6];
				@Pc(15) Class155 local15 = local13;
				if (local13.aClass155_2 != null) {
					local15 = local13.aClass155_2;
				}
				local15.anInt3985 = (int) (arg0.aFloat90 + (float) this.anIntArray401[local13.anInt3981] * arg0.aFloat91 + arg0.aFloat85 * (float) this.anIntArray402[local13.anInt3981] + arg0.aFloat84 * (float) this.anIntArray405[local13.anInt3981]);
				local15.anInt3976 = (int) (arg0.aFloat87 + (float) this.anIntArray402[local13.anInt3981] * arg0.aFloat94 + (float) this.anIntArray405[local13.anInt3981] * arg0.aFloat93 + arg0.aFloat89 * (float) this.anIntArray401[local13.anInt3981]);
				local15.anInt3989 = (int) (arg0.aFloat92 + (float) this.anIntArray402[local13.anInt3981] * arg0.aFloat95 + arg0.aFloat86 * (float) this.anIntArray405[local13.anInt3981] + arg0.aFloat88 * (float) this.anIntArray401[local13.anInt3981]);
				local15.anInt3977 = (int) ((float) this.anIntArray402[local13.anInt3982] * arg0.aFloat85 + (float) this.anIntArray405[local13.anInt3982] * arg0.aFloat84 + (float) this.anIntArray401[local13.anInt3982] * arg0.aFloat91 + arg0.aFloat90);
				local15.anInt3980 = (int) (arg0.aFloat93 * (float) this.anIntArray405[local13.anInt3982] + (float) this.anIntArray402[local13.anInt3982] * arg0.aFloat94 + (float) this.anIntArray401[local13.anInt3982] * arg0.aFloat89 + arg0.aFloat87);
				local15.anInt3991 = (int) (arg0.aFloat92 + (float) this.anIntArray401[local13.anInt3982] * arg0.aFloat88 + (float) this.anIntArray402[local13.anInt3982] * arg0.aFloat95 + (float) this.anIntArray405[local13.anInt3982] * arg0.aFloat86);
				local15.anInt3987 = (int) ((float) this.anIntArray401[local13.anInt3983] * arg0.aFloat91 + (float) this.anIntArray402[local13.anInt3983] * arg0.aFloat85 + arg0.aFloat84 * (float) this.anIntArray405[local13.anInt3983] + arg0.aFloat90);
				local15.anInt3986 = (int) (arg0.aFloat87 + arg0.aFloat93 * (float) this.anIntArray405[local13.anInt3983] + (float) this.anIntArray402[local13.anInt3983] * arg0.aFloat94 + (float) this.anIntArray401[local13.anInt3983] * arg0.aFloat89);
				local15.anInt3978 = (int) ((float) this.anIntArray405[local13.anInt3983] * arg0.aFloat86 + arg0.aFloat95 * (float) this.anIntArray402[local13.anInt3983] + arg0.aFloat88 * (float) this.anIntArray401[local13.anInt3983] + arg0.aFloat92);
			}
		}
		if (this.aClass199Array1 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass199Array1.length; local6++) {
			@Pc(364) Class199 local364 = this.aClass199Array1[local6];
			@Pc(366) Class199 local366 = local364;
			if (local364.aClass199_2 != null) {
				local366 = local364.aClass199_2;
			}
			if (local364.aClass31_4 == null) {
				local364.aClass31_4 = arg0.method4797();
			} else {
				local364.aClass31_4.ha(arg0);
			}
			local366.anInt5502 = (int) (arg0.aFloat91 * (float) this.anIntArray401[local364.anInt5505] + arg0.aFloat85 * (float) this.anIntArray402[local364.anInt5505] + arg0.aFloat84 * (float) this.anIntArray405[local364.anInt5505] + arg0.aFloat90);
			local366.anInt5496 = (int) (arg0.aFloat89 * (float) this.anIntArray401[local364.anInt5505] + arg0.aFloat94 * (float) this.anIntArray402[local364.anInt5505] + (float) this.anIntArray405[local364.anInt5505] * arg0.aFloat93 + arg0.aFloat87);
			local366.anInt5497 = (int) ((float) this.anIntArray402[local364.anInt5505] * arg0.aFloat95 + arg0.aFloat86 * (float) this.anIntArray405[local364.anInt5505] + (float) this.anIntArray401[local364.anInt5505] * arg0.aFloat88 + arg0.aFloat92);
		}
	}

	@OriginalMember(owner = "client!oj", name = "KA", descriptor = "()V")
	@Override
	protected void KA() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4695; local3++) {
			this.anIntArray405[local3] = this.anIntArray405[local3] + 7 >> 4;
			this.anIntArray402[local3] = this.anIntArray402[local3] + 7 >> 4;
			this.anIntArray401[local3] = this.anIntArray401[local3] + 7 >> 4;
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "()Z")
	@Override
	protected boolean h() {
		if (this.anIntArrayArray35 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4695; local12++) {
			this.anIntArray405[local12] <<= 0x4;
			this.anIntArray402[local12] <<= 0x4;
			this.anIntArray401[local12] <<= 0x4;
		}
		Static400.anInt6546 = 0;
		Static310.anInt5369 = 0;
		Static232.anInt3746 = 0;
		return true;
	}

	@OriginalMember(owner = "client!oj", name = "ta", descriptor = "()I")
	@Override
	public int ta() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort50;
	}

	@OriginalMember(owner = "client!oj", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		return this.aShort56;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILclient!c;Z)Z")
	@Override
	public boolean method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class31_Sub2 local8 = (Class31_Sub2) arg2;
		@Pc(12) Class31_Sub2 local12 = this.aClass163_Sub2_31.aClass31_Sub2_4;
		@Pc(33) float local33 = local12.aFloat90 + local12.aFloat84 * local8.aFloat90 + local8.aFloat87 * local12.aFloat85 + local12.aFloat91 * local8.aFloat92;
		@Pc(54) float local54 = local12.aFloat87 + local12.aFloat89 * local8.aFloat92 + local12.aFloat93 * local8.aFloat90 + local8.aFloat87 * local12.aFloat94;
		Static317.aFloat101 = local8.aFloat88 * local12.aFloat89 + local12.aFloat94 * local8.aFloat89 + local8.aFloat91 * local12.aFloat93;
		Static40.aFloat9 = local12.aFloat84 * local8.aFloat85 + local8.aFloat94 * local12.aFloat85 + local8.aFloat95 * local12.aFloat91;
		Static322.aFloat79 = local8.aFloat93 * local12.aFloat94 + local8.aFloat84 * local12.aFloat93 + local12.aFloat89 * local8.aFloat86;
		@Pc(129) float local129 = local12.aFloat92 + local8.aFloat90 * local12.aFloat86 + local12.aFloat95 * local8.aFloat87 + local12.aFloat88 * local8.aFloat92;
		Static226.aFloat37 = local8.aFloat86 * local12.aFloat88 + local8.aFloat84 * local12.aFloat86 + local12.aFloat95 * local8.aFloat93;
		Static112.aFloat41 = local8.aFloat95 * local12.aFloat88 + local12.aFloat95 * local8.aFloat94 + local8.aFloat85 * local12.aFloat86;
		Static281.aFloat55 = local8.aFloat86 * local12.aFloat91 + local8.aFloat84 * local12.aFloat84 + local12.aFloat85 * local8.aFloat93;
		Static115.aFloat20 = local8.aFloat94 * local12.aFloat94 + local8.aFloat85 * local12.aFloat93 + local8.aFloat95 * local12.aFloat89;
		Static443.aFloat104 = local8.aFloat88 * local12.aFloat91 + local8.aFloat91 * local12.aFloat84 + local12.aFloat85 * local8.aFloat89;
		Static47.aFloat10 = local12.aFloat86 * local8.aFloat91 + local8.aFloat89 * local12.aFloat95 + local8.aFloat88 * local12.aFloat88;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass163_Sub2_31.anInt5248;
		@Pc(255) int local255 = this.aClass163_Sub2_31.anInt5235;
		if (!this.aBoolean330) {
			this.method3817();
		}
		Static93.anIntArray140[0] = this.aShort50;
		Static4.anIntArray8[0] = this.aShort51;
		Static93.anIntArray140[1] = this.aShort52;
		Static370.anIntArray537[0] = this.aShort55;
		Static4.anIntArray8[1] = this.aShort51;
		Static370.anIntArray537[1] = this.aShort55;
		Static93.anIntArray140[2] = this.aShort50;
		Static4.anIntArray8[2] = this.aShort54;
		Static370.anIntArray537[2] = this.aShort55;
		Static93.anIntArray140[3] = this.aShort52;
		Static4.anIntArray8[3] = this.aShort54;
		Static370.anIntArray537[3] = this.aShort55;
		Static93.anIntArray140[4] = this.aShort50;
		Static4.anIntArray8[4] = this.aShort51;
		Static93.anIntArray140[5] = this.aShort52;
		Static370.anIntArray537[4] = this.aShort53;
		Static4.anIntArray8[5] = this.aShort51;
		Static370.anIntArray537[5] = this.aShort53;
		Static93.anIntArray140[6] = this.aShort50;
		Static4.anIntArray8[6] = this.aShort54;
		Static93.anIntArray140[7] = this.aShort52;
		Static370.anIntArray537[6] = this.aShort53;
		Static4.anIntArray8[7] = this.aShort54;
		Static370.anIntArray537[7] = this.aShort53;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(390) float local390;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static4.anIntArray8[local383];
			local395 = Static370.anIntArray537[local383];
			local400 = Static93.anIntArray140[local383];
			local414 = local395 * Static443.aFloat104 + local390 * Static40.aFloat9 + local400 * Static281.aFloat55 + local33;
			local428 = local129 + Static112.aFloat41 * local390 + Static226.aFloat37 * local400 + local395 * Static47.aFloat10;
			local442 = local54 + local400 * Static322.aFloat79 + local390 * Static115.aFloat20 + local395 * Static317.aFloat101;
			if (local428 >= (float) this.aClass163_Sub2_31.anInt5239) {
				@Pc(461) float local461 = (float) local251 * local414 / local428 + (float) this.aClass163_Sub2_31.anInt5230;
				if (local461 < local241) {
					local241 = local461;
				}
				if (local243 < local461) {
					local243 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass163_Sub2_31.anInt5234 + (float) local255 * local442 / local428;
				local239 = true;
				if (local245 > local485) {
					local245 = local485;
				}
				if (local247 < local485) {
					local247 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt4679 > this.aClass163_Sub2_31.anIntArray429.length) {
				this.aClass163_Sub2_31.anIntArray429 = new int[this.anInt4679];
				this.aClass163_Sub2_31.anIntArray428 = new int[this.anInt4679];
			}
			@Pc(552) int[] local552 = this.aClass163_Sub2_31.anIntArray429;
			@Pc(556) int[] local556 = this.aClass163_Sub2_31.anIntArray428;
			@Pc(640) int local640;
			for (@Pc(558) int local558 = 0; local558 < this.anInt4677; local558++) {
				local395 = this.anIntArray401[local558];
				local390 = this.anIntArray402[local558];
				local400 = this.anIntArray405[local558];
				local442 = local54 + Static317.aFloat101 * local395 + local400 * Static322.aFloat79 + local390 * Static115.aFloat20;
				local428 = Static47.aFloat10 * local395 + Static112.aFloat41 * local390 + Static226.aFloat37 * local400 + local129;
				local414 = local33 + Static443.aFloat104 * local395 + local390 * Static40.aFloat9 + local400 * Static281.aFloat55;
				@Pc(653) int local653;
				@Pc(658) int local658;
				@Pc(665) int local665;
				if ((float) this.aClass163_Sub2_31.anInt5239 <= local428) {
					local640 = (int) (local414 * (float) local251 / local428 + (float) this.aClass163_Sub2_31.anInt5230);
					local653 = (int) ((float) this.aClass163_Sub2_31.anInt5234 + (float) local255 * local442 / local428);
					local658 = this.anIntArray403[local558];
					local665 = this.anIntArray403[local558 + 1];
					for (@Pc(667) int local667 = local658; local667 < local665; local667++) {
						@Pc(676) int local676 = this.aShortArray48[local667] - 1;
						if (local676 == -1) {
							break;
						}
						local552[local676] = local640;
						local556[local676] = local653;
					}
				} else {
					local640 = this.anIntArray403[local558];
					local653 = this.anIntArray403[local558 + 1];
					for (local658 = local640; local658 < local653; local658++) {
						local665 = this.aShortArray48[local658] - 1;
						if (local665 == -1) {
							break;
						}
						local552[this.aShortArray48[local658] - 1] = -999999;
					}
				}
			}
			for (local640 = 0; local640 < this.anInt4675; local640++) {
				if (local552[this.aShortArray49[local640]] != -999999 && local552[this.aShortArray41[local640]] != -999999 && local552[this.aShortArray50[local640]] != -999999 && this.method3810(arg0, local552[this.aShortArray50[local640]], local552[this.aShortArray49[local640]], local556[this.aShortArray50[local640]], arg1, local552[this.aShortArray41[local640]], local556[this.aShortArray49[local640]], local556[this.aShortArray41[local640]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "(III)V")
	@Override
	public void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4677; local7++) {
			if (arg0 != 128) {
				this.anIntArray405[local7] = arg0 * this.anIntArray405[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray402[local7] = arg1 * this.anIntArray402[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray401[local7] = this.anIntArray401[local7] * arg2 >> 7;
			}
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IISBI)I")
	private int method3809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3) {
		@Pc(18) int local18 = Static237.anIntArray330[Static361.method4754(arg1, arg0)];
		if (arg2 != -1) {
			@Pc(31) Class158 local31 = this.aClass163_Sub2_31.anInterface9_12.method1769(arg2 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte47 & 0xFF;
			@Pc(45) int local45;
			@Pc(64) int local64;
			if (local36 != 0) {
				if (arg1 < 0) {
					local45 = 0;
				} else if (arg1 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg1 * 131586;
				}
				if (local36 == 256) {
					local18 = local45;
				} else {
					local64 = 256 - local36;
					local18 = ((local45 & 0xFF00) * local36 + local64 * (local18 & 0xFF00) & 0xFF0000) + (local36 * (local45 & 0xFF00FF) + ((local18 & 0xFF00FF) * local64) & 0xFF00FF00) >> 8;
				}
			}
			local45 = local31.aByte45 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(116) int local116 = local45 * (local18 >> 16 & 0xFF);
				if (local116 > 65535) {
					local116 = 65535;
				}
				local64 = local45 * (local18 >> 8 & 0xFF);
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(142) int local142 = local45 * (local18 & 0xFF);
				if (local142 > 65535) {
					local142 = 65535;
				}
				local18 = ((local116 & 0x8A00FF00) << 8) - (-(local64 & 0xFF00) - (local142 >> 8));
			}
		}
		return (local18 << 8) - ((arg3 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIBI)Z")
	private boolean method3810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg6 && arg4 < arg7 && arg4 < arg3) {
			return false;
		} else if (arg6 < arg4 && arg4 > arg7 && arg4 > arg3) {
			return false;
		} else if (arg2 > arg0 && arg5 > arg0 && arg1 > arg0) {
			return false;
		} else {
			return arg0 <= arg2 || arg0 <= arg5 || arg0 <= arg1;
		}
	}

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "()I")
	@Override
	public int B() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort51;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFIIFJBILclient!qq;I)S")
	private short method3811(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class205 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray403[arg6];
		@Pc(17) int local17 = this.anIntArray403[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray48[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static103.aLongArray3[local21] == arg5) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray48[local19] = (short) (this.anInt4679 + 1);
		Static103.aLongArray3[local19] = arg5;
		this.aShortArray42[this.anInt4679] = (short) arg2;
		this.aShortArray47[this.anInt4679] = (short) arg0;
		this.aShortArray46[this.anInt4679] = (short) arg3;
		this.aByteArray54[this.anInt4679] = (byte) arg8;
		this.aFloatArray24[this.anInt4679] = arg1;
		this.aFloatArray25[this.anInt4679] = arg4;
		return (short) this.anInt4679++;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!ok;)V")
	private void method3812(@OriginalArg(1) Class2_Sub5_Sub7_Sub1 arg0) {
		if (this.anInt4679 > this.aClass163_Sub2_31.anIntArray429.length) {
			this.aClass163_Sub2_31.anIntArray428 = new int[this.anInt4679];
			this.aClass163_Sub2_31.anIntArray429 = new int[this.anInt4679];
		}
		@Pc(36) int[] local36 = this.aClass163_Sub2_31.anIntArray429;
		@Pc(40) int[] local40 = this.aClass163_Sub2_31.anIntArray428;
		@Pc(68) int local68;
		@Pc(107) int local107;
		@Pc(116) int local116;
		for (@Pc(42) int local42 = 0; local42 < this.anInt4677; local42++) {
			local68 = (this.anIntArray405[local42] - (this.aClass163_Sub2_31.anInt5256 * this.anIntArray402[local42] >> 8) >> this.aClass163_Sub2_31.anInt5220) - arg0.anInt4719;
			@Pc(93) int local93 = (this.anIntArray401[local42] - (this.aClass163_Sub2_31.anInt5262 * this.anIntArray402[local42] >> 8) >> this.aClass163_Sub2_31.anInt5220) - arg0.anInt4726;
			@Pc(98) int local98 = this.anIntArray403[local42];
			@Pc(105) int local105 = this.anIntArray403[local42 + 1];
			for (local107 = local98; local107 < local105; local107++) {
				local116 = this.aShortArray48[local107] - 1;
				if (local116 == -1) {
					break;
				}
				local36[local116] = local68;
				local40[local116] = local93;
			}
		}
		for (local68 = 0; local68 < this.anInt4665; local68++) {
			if (this.aByteArray55 == null || this.aByteArray55[local68] <= 128) {
				@Pc(162) short local162 = this.aShortArray49[local68];
				@Pc(167) short local167 = this.aShortArray41[local68];
				@Pc(172) short local172 = this.aShortArray50[local68];
				local107 = local36[local162];
				local116 = local36[local167];
				@Pc(184) int local184 = local36[local172];
				@Pc(188) int local188 = local40[local162];
				@Pc(192) int local192 = local40[local167];
				@Pc(196) int local196 = local40[local172];
				if (-((local192 - local188) * (local184 - local116)) + (local192 - local196) * (local107 - local116) > 0) {
					arg0.method3839(local188, local196, local107, local116, local192, local184);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "(I)V")
	@Override
	public void A(@OriginalArg(0) int arg0) {
		this.aShort49 = (short) arg0;
		if (this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
		}
		if (this.aClass100_10 != null) {
			this.aClass100_10.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "S", descriptor = "()I")
	@Override
	public int S() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort53;
	}

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "(SS)V")
	@Override
	public void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass163_Sub2_31.anInterface9_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4675; local11++) {
			if (this.aShortArray43[local11] == arg0) {
				this.aShortArray43[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class158 local44 = local9.method1769(arg0 & 0xFFFF);
			local31 = local44.aByte47;
			local33 = local44.aByte45;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class158 local64 = local9.method1769(arg1 & 0xFFFF);
			local52 = local64.aByte47;
			local54 = local64.aByte45;
		}
		if (!(local33 != local54 | local31 != local52)) {
			return;
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(89) int local89 = 0; local89 < this.anInt4664; local89++) {
				@Pc(96) Class259 local96 = this.aClass259Array1[local89];
				@Pc(101) Class182 local101 = this.aClass182Array1[local89];
				local101.anInt4808 = Static237.anIntArray330[this.aShortArray45[local96.anInt7047] & 0xFFFF] & 0xFFFFFF | local101.anInt4808 & 0xFF000000;
			}
		}
		if (this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	private void method3813() {
		if (this.anInt4665 == 0) {
			return;
		}
		if (this.aByte53 != 0) {
			this.method3821(true);
		}
		this.method3821(false);
		if (this.aClass73_1 != null) {
			if (this.aClass73_1.anInterface5_2 == null) {
				this.method3815((this.aByte53 & 0x10) != 0);
			}
			if (this.aClass73_1.anInterface5_2 != null) {
				this.aClass163_Sub2_31.method4177(this.aClass100_10 != null);
				this.aClass163_Sub2_31.method4114(this.aClass100_12, this.aClass100_10, this.aClass100_9, this.aClass100_11);
				@Pc(85) int local85 = this.anIntArray404.length - 1;
				for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
					@Pc(94) int local94 = this.anIntArray404[local87];
					@Pc(101) int local101 = this.anIntArray404[local87 + 1];
					@Pc(108) int local108 = this.aShortArray43[local94] & 0xFFFF;
					if (local108 == 65535) {
						local108 = -1;
					}
					this.aClass163_Sub2_31.method4110(local108, this.aClass100_10 != null);
					this.aClass163_Sub2_31.method4105(local94 * 3, this.aClass73_1.anInterface5_2, (local101 - local94) * 3);
				}
			}
		}
		this.method3818();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!c;Lclient!rr;II)V")
	@Override
	public void method5751(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4679 == 0) {
			return;
		}
		@Pc(16) Class31_Sub2 local16 = this.aClass163_Sub2_31.aClass31_Sub2_4;
		@Pc(19) Class31_Sub2 local19 = (Class31_Sub2) arg0;
		if (!this.aBoolean330) {
			this.method3817();
		}
		Static112.aFloat41 = local16.aFloat95 * local19.aFloat94 + local16.aFloat86 * local19.aFloat85 + local16.aFloat88 * local19.aFloat95;
		Static274.aFloat53 = local19.aFloat92 * local16.aFloat88 + local19.aFloat87 * local16.aFloat95 + local16.aFloat86 * local19.aFloat90 + local16.aFloat92;
		@Pc(72) float local72 = Static274.aFloat53 + (float) this.aShort51 * Static112.aFloat41;
		@Pc(80) float local80 = (float) this.aShort54 * Static112.aFloat41 + Static274.aFloat53;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = (float) -this.aShort48 + local80;
			local96 = (float) this.aShort48 + local72;
		} else {
			local90 = local72 - (float) this.aShort48;
			local96 = (float) this.aShort48 + local80;
		}
		if (local90 >= this.aClass163_Sub2_31.aFloat71 || local96 <= (float) this.aClass163_Sub2_31.anInt5239) {
			return;
		}
		Static97.aFloat17 = local16.aFloat90 + local16.aFloat91 * local19.aFloat92 + local16.aFloat84 * local19.aFloat90 + local16.aFloat85 * local19.aFloat87;
		Static40.aFloat9 = local19.aFloat95 * local16.aFloat91 + local19.aFloat94 * local16.aFloat85 + local16.aFloat84 * local19.aFloat85;
		@Pc(173) float local173 = (float) this.aShort51 * Static40.aFloat9 + Static97.aFloat17;
		@Pc(181) float local181 = (float) this.aShort54 * Static40.aFloat9 + Static97.aFloat17;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local207 = ((float) -this.aShort48 + local181) * (float) this.aClass163_Sub2_31.anInt5248;
			local196 = (float) this.aClass163_Sub2_31.anInt5248 * (local173 + (float) this.aShort48);
		} else {
			local196 = (float) this.aClass163_Sub2_31.anInt5248 * (local181 + (float) this.aShort48);
			local207 = (local173 - (float) this.aShort48) * (float) this.aClass163_Sub2_31.anInt5248;
		}
		if (local207 / (float) arg2 >= this.aClass163_Sub2_31.aFloat61 || this.aClass163_Sub2_31.aFloat57 >= local196 / (float) arg2) {
			return;
		}
		Static115.aFloat20 = local16.aFloat89 * local19.aFloat95 + local16.aFloat93 * local19.aFloat85 + local19.aFloat94 * local16.aFloat94;
		Static375.aFloat98 = local16.aFloat89 * local19.aFloat92 + local19.aFloat87 * local16.aFloat94 + local19.aFloat90 * local16.aFloat93 + local16.aFloat87;
		@Pc(299) float local299 = (float) this.aShort51 * Static115.aFloat20 + Static375.aFloat98;
		@Pc(307) float local307 = Static375.aFloat98 + Static115.aFloat20 * (float) this.aShort54;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local299 > local307) {
			local333 = ((float) this.aShort48 + local299) * (float) this.aClass163_Sub2_31.anInt5235;
			local322 = ((float) -this.aShort48 + local307) * (float) this.aClass163_Sub2_31.anInt5235;
		} else {
			local322 = (float) this.aClass163_Sub2_31.anInt5235 * (local299 - (float) this.aShort48);
			local333 = (local307 + (float) this.aShort48) * (float) this.aClass163_Sub2_31.anInt5235;
		}
		if (this.aClass163_Sub2_31.aFloat75 <= local322 / (float) arg2 || local333 / (float) arg2 <= this.aClass163_Sub2_31.aFloat69) {
			return;
		}
		if (arg1 != null || this.aClass259Array1 != null) {
			Static317.aFloat101 = local19.aFloat89 * local16.aFloat94 + local16.aFloat93 * local19.aFloat91 + local19.aFloat88 * local16.aFloat89;
			Static281.aFloat55 = local16.aFloat91 * local19.aFloat86 + local19.aFloat93 * local16.aFloat85 + local19.aFloat84 * local16.aFloat84;
			Static443.aFloat104 = local19.aFloat89 * local16.aFloat85 + local16.aFloat84 * local19.aFloat91 + local16.aFloat91 * local19.aFloat88;
			Static47.aFloat10 = local16.aFloat95 * local19.aFloat89 + local16.aFloat86 * local19.aFloat91 + local19.aFloat88 * local16.aFloat88;
			Static322.aFloat79 = local19.aFloat86 * local16.aFloat89 + local19.aFloat93 * local16.aFloat94 + local16.aFloat93 * local19.aFloat84;
			Static226.aFloat37 = local19.aFloat86 * local16.aFloat88 + local19.aFloat84 * local16.aFloat86 + local16.aFloat95 * local19.aFloat93;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort50 + this.aShort52 >> 1;
			@Pc(510) int local510 = this.aShort55 + this.aShort53 >> 1;
			@Pc(529) int local529 = (int) (Static281.aFloat55 * (float) local501 + Static97.aFloat17 + Static40.aFloat9 * (float) this.aShort51 + (float) local510 * Static443.aFloat104);
			@Pc(548) int local548 = (int) (Static322.aFloat79 * (float) local501 + Static375.aFloat98 + (float) this.aShort51 * Static115.aFloat20 + (float) local510 * Static317.aFloat101);
			@Pc(567) int local567 = (int) (Static47.aFloat10 * (float) local510 + Static274.aFloat53 + Static226.aFloat37 * (float) local501 + (float) this.aShort51 * Static112.aFloat41);
			@Pc(586) int local586 = (int) ((float) local510 * Static443.aFloat104 + Static97.aFloat17 + (float) local501 * Static281.aFloat55 + (float) this.aShort54 * Static40.aFloat9);
			@Pc(605) int local605 = (int) ((float) this.aShort54 * Static115.aFloat20 + Static322.aFloat79 * (float) local501 + Static375.aFloat98 + Static317.aFloat101 * (float) local510);
			arg1.anInt5998 = this.aClass163_Sub2_31.anInt5248 * local529 / arg2 + this.aClass163_Sub2_31.anInt5230;
			arg1.anInt6002 = this.aClass163_Sub2_31.anInt5234 + this.aClass163_Sub2_31.anInt5235 * local548 / arg2;
			@Pc(651) int local651 = (int) ((float) local510 * Static47.aFloat10 + Static226.aFloat37 * (float) local501 + Static274.aFloat53 + (float) this.aShort54 * Static112.aFloat41);
			arg1.anInt6000 = this.aClass163_Sub2_31.anInt5248 * local586 / arg2 + this.aClass163_Sub2_31.anInt5230;
			arg1.anInt6001 = this.aClass163_Sub2_31.anInt5235 * local605 / arg2 + this.aClass163_Sub2_31.anInt5234;
			if (this.aClass163_Sub2_31.anInt5239 > local567 && this.aClass163_Sub2_31.anInt5239 > local651) {
				arg1.aBoolean436 = true;
				arg1.anInt5999 = (this.aShort48 + local529) * this.aClass163_Sub2_31.anInt5248 / arg2 + this.aClass163_Sub2_31.anInt5230 - arg1.anInt5998;
			}
		}
		this.aClass163_Sub2_31.method4154((float) arg2);
		this.aClass163_Sub2_31.method4156();
		this.aClass163_Sub2_31.method4178(local19);
		this.method3813();
		this.aClass163_Sub2_31.method4112();
		this.method3819();
	}

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4677; local7++) {
			this.anIntArray401[local7] = -this.anIntArray401[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4679; local25++) {
			this.aShortArray46[local25] = (short) -this.aShortArray46[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt4675; local48++) {
			@Pc(55) short local55 = this.aShortArray49[local48];
			this.aShortArray49[local48] = this.aShortArray50[local48];
			this.aShortArray50[local48] = local55;
		}
		if (this.aClass100_10 == null && this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
		}
		if (this.aClass100_10 != null) {
			this.aClass100_10.anInterface11_2 = null;
		}
		if (this.aClass73_1 != null) {
			this.aClass73_1.anInterface5_2 = null;
		}
		this.aBoolean330 = false;
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class155.anIntArray342[arg0];
		@Pc(13) int local13 = Class155.anIntArray341[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4677; local15++) {
			local33 = this.anIntArray405[local15] * local13 + this.anIntArray401[local15] * local9 >> 15;
			this.anIntArray401[local15] = local13 * this.anIntArray401[local15] - this.anIntArray405[local15] * local9 >> 15;
			this.anIntArray405[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4679; local33++) {
			@Pc(82) int local82 = local13 * this.aShortArray42[local33] + this.aShortArray46[local33] * local9 >> 15;
			this.aShortArray46[local33] = (short) (this.aShortArray46[local33] * local13 - this.aShortArray42[local33] * local9 >> 15);
			this.aShortArray42[local33] = (short) local82;
		}
		if (this.aClass100_10 == null && this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
		}
		if (this.aClass100_10 != null) {
			this.aClass100_10.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!oj;ZIZILclient!oj;)Lclient!e;")
	private Class59 method3814(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class59_Sub1 arg4) {
		arg4.anInt4664 = this.anInt4664;
		arg4.anInt4677 = this.anInt4677;
		arg4.anInt4665 = this.anInt4665;
		arg4.aShort49 = this.aShort49;
		arg4.aShort56 = this.aShort56;
		arg4.anInt4683 = arg2;
		arg4.anInt4675 = this.anInt4675;
		arg4.anInt4679 = this.anInt4679;
		arg4.anInt4643 = this.anInt4643;
		arg4.aByte53 = 0;
		arg4.anInt4695 = this.anInt4695;
		@Pc(53) boolean local53 = Static320.method4350(this.anInt4643, arg2);
		@Pc(59) boolean local59 = Static404.method5118(arg2, this.anInt4643);
		@Pc(67) boolean local67 = Static169.method2370(this.anInt4643, arg2);
		@Pc(73) boolean local73 = local53 | local59 | local67;
		@Pc(174) int local174;
		if (local73) {
			if (!local53) {
				arg4.anIntArray405 = this.anIntArray405;
			} else if (arg0.anIntArray405 == null || this.anInt4695 > arg0.anIntArray405.length) {
				arg4.anIntArray405 = arg0.anIntArray405 = new int[this.anInt4695];
			} else {
				arg4.anIntArray405 = arg0.anIntArray405;
			}
			if (!local59) {
				arg4.anIntArray402 = this.anIntArray402;
			} else if (arg0.anIntArray402 == null || arg0.anIntArray402.length < this.anInt4695) {
				arg4.anIntArray402 = arg0.anIntArray402 = new int[this.anInt4695];
			} else {
				arg4.anIntArray402 = arg0.anIntArray402;
			}
			if (!local67) {
				arg4.anIntArray401 = this.anIntArray401;
			} else if (arg0.anIntArray401 == null || this.anInt4695 > arg0.anIntArray401.length) {
				arg4.anIntArray401 = arg0.anIntArray401 = new int[this.anInt4695];
			} else {
				arg4.anIntArray401 = arg0.anIntArray401;
			}
			for (local174 = 0; local174 < this.anInt4695; local174++) {
				if (local53) {
					arg4.anIntArray405[local174] = this.anIntArray405[local174];
				}
				if (local59) {
					arg4.anIntArray402[local174] = this.anIntArray402[local174];
				}
				if (local67) {
					arg4.anIntArray401[local174] = this.anIntArray401[local174];
				}
			}
		} else {
			arg4.anIntArray402 = this.anIntArray402;
			arg4.anIntArray405 = this.anIntArray405;
			arg4.anIntArray401 = this.anIntArray401;
		}
		if (Static255.method3255(arg2, this.anInt4643)) {
			arg4.aClass100_11 = arg0.aClass100_11;
			if (arg3) {
				arg4.aByte53 = (byte) (arg4.aByte53 | 0x1);
			}
			arg4.aClass100_11.aByte26 = this.aClass100_11.aByte26;
			arg4.aClass100_11.anInterface11_2 = this.aClass100_11.anInterface11_2;
		} else if (Static221.method2935(arg2, this.anInt4643)) {
			arg4.aClass100_11 = this.aClass100_11;
		} else {
			arg4.aClass100_11 = null;
		}
		if (Static314.method4289(this.anInt4643, arg2)) {
			if (arg0.aShortArray45 == null || arg0.aShortArray45.length < this.anInt4675) {
				arg4.aShortArray45 = arg0.aShortArray45 = new short[this.anInt4675];
			} else {
				arg4.aShortArray45 = arg0.aShortArray45;
			}
			for (local174 = 0; local174 < this.anInt4675; local174++) {
				arg4.aShortArray45[local174] = this.aShortArray45[local174];
			}
		} else {
			arg4.aShortArray45 = this.aShortArray45;
		}
		if (Static104.method1553(arg2, this.anInt4643)) {
			if (arg0.aByteArray55 == null || this.anInt4675 > arg0.aByteArray55.length) {
				arg4.aByteArray55 = arg0.aByteArray55 = new byte[this.anInt4675];
			} else {
				arg4.aByteArray55 = arg0.aByteArray55;
			}
			for (local174 = 0; local174 < this.anInt4675; local174++) {
				arg4.aByteArray55[local174] = this.aByteArray55[local174];
			}
		} else {
			arg4.aByteArray55 = this.aByteArray55;
		}
		if (Static261.method1844(arg2, this.anInt4643)) {
			if (arg3) {
				arg4.aByte53 = (byte) (arg4.aByte53 | 0x2);
			}
			arg4.aClass100_9 = arg0.aClass100_9;
			arg4.aClass100_9.aByte26 = this.aClass100_9.aByte26;
			arg4.aClass100_9.anInterface11_2 = this.aClass100_9.anInterface11_2;
		} else if (Static176.method68(this.anInt4643, arg2)) {
			arg4.aClass100_9 = this.aClass100_9;
		} else {
			arg4.aClass100_9 = null;
		}
		@Pc(578) int local578;
		if (Static225.method2960(this.anInt4643, arg2)) {
			if (arg0.aShortArray42 == null || arg0.aShortArray42.length < this.anInt4679) {
				local174 = this.anInt4679;
				arg4.aShortArray47 = arg0.aShortArray47 = new short[local174];
				arg4.aShortArray46 = arg0.aShortArray46 = new short[local174];
				arg4.aShortArray42 = arg0.aShortArray42 = new short[local174];
			} else {
				arg4.aShortArray46 = arg0.aShortArray46;
				arg4.aShortArray42 = arg0.aShortArray42;
				arg4.aShortArray47 = arg0.aShortArray47;
			}
			if (this.aClass87_1 == null) {
				for (local174 = 0; local174 < this.anInt4679; local174++) {
					arg4.aShortArray42[local174] = this.aShortArray42[local174];
					arg4.aShortArray47[local174] = this.aShortArray47[local174];
					arg4.aShortArray46[local174] = this.aShortArray46[local174];
				}
			} else {
				if (arg0.aClass87_1 == null) {
					arg0.aClass87_1 = new Class87();
				}
				@Pc(566) Class87 local566 = arg4.aClass87_1 = arg0.aClass87_1;
				if (local566.aShortArray6 == null || this.anInt4679 > local566.aShortArray6.length) {
					local578 = this.anInt4679;
					local566.aShortArray7 = new short[local578];
					local566.aShortArray6 = new short[local578];
					local566.aShortArray8 = new short[local578];
					local566.aByteArray17 = new byte[local578];
				}
				for (local578 = 0; local578 < this.anInt4679; local578++) {
					arg4.aShortArray42[local578] = this.aShortArray42[local578];
					arg4.aShortArray47[local578] = this.aShortArray47[local578];
					arg4.aShortArray46[local578] = this.aShortArray46[local578];
					local566.aShortArray6[local578] = this.aClass87_1.aShortArray6[local578];
					local566.aShortArray8[local578] = this.aClass87_1.aShortArray8[local578];
					local566.aShortArray7[local578] = this.aClass87_1.aShortArray7[local578];
					local566.aByteArray17[local578] = this.aClass87_1.aByteArray17[local578];
				}
			}
			arg4.aByteArray54 = this.aByteArray54;
		} else {
			arg4.aByteArray54 = this.aByteArray54;
			arg4.aShortArray42 = this.aShortArray42;
			arg4.aShortArray47 = this.aShortArray47;
			arg4.aShortArray46 = this.aShortArray46;
			arg4.aClass87_1 = this.aClass87_1;
		}
		if (Static387.method4962(this.anInt4643, arg2)) {
			if (arg3) {
				arg4.aByte53 = (byte) (arg4.aByte53 | 0x4);
			}
			arg4.aClass100_10 = arg0.aClass100_10;
			arg4.aClass100_10.anInterface11_2 = this.aClass100_10.anInterface11_2;
			arg4.aClass100_10.aByte26 = this.aClass100_10.aByte26;
		} else if (Static49.method693(this.anInt4643, arg2)) {
			arg4.aClass100_10 = this.aClass100_10;
		} else {
			arg4.aClass100_10 = null;
		}
		if (Static297.method3932(this.anInt4643, arg2)) {
			if (arg0.aFloatArray24 == null || arg0.aFloatArray24.length < this.anInt4675) {
				local174 = this.anInt4679;
				arg4.aFloatArray24 = arg0.aFloatArray24 = new float[local174];
				arg4.aFloatArray25 = arg0.aFloatArray25 = new float[local174];
			} else {
				arg4.aFloatArray25 = arg0.aFloatArray25;
				arg4.aFloatArray24 = arg0.aFloatArray24;
			}
			for (local174 = 0; local174 < this.anInt4679; local174++) {
				arg4.aFloatArray24[local174] = this.aFloatArray24[local174];
				arg4.aFloatArray25[local174] = this.aFloatArray25[local174];
			}
		} else {
			arg4.aFloatArray24 = this.aFloatArray24;
			arg4.aFloatArray25 = this.aFloatArray25;
		}
		if (Static5.method78(this.anInt4643, arg2)) {
			arg4.aClass100_12 = arg0.aClass100_12;
			if (arg3) {
				arg4.aByte53 = (byte) (arg4.aByte53 | 0x8);
			}
			arg4.aClass100_12.anInterface11_2 = this.aClass100_12.anInterface11_2;
			arg4.aClass100_12.aByte26 = this.aClass100_12.aByte26;
		} else if (Static369.method4838(arg2, this.anInt4643)) {
			arg4.aClass100_12 = this.aClass100_12;
		} else {
			arg4.aClass100_12 = null;
		}
		if (Static100.method1527(this.anInt4643, arg2)) {
			if (arg0.aShortArray49 == null || this.anInt4675 > arg0.aShortArray49.length) {
				local174 = this.anInt4675;
				arg4.aShortArray41 = arg0.aShortArray41 = new short[local174];
				arg4.aShortArray50 = arg0.aShortArray50 = new short[local174];
				arg4.aShortArray49 = arg0.aShortArray49 = new short[local174];
			} else {
				arg4.aShortArray41 = arg0.aShortArray41;
				arg4.aShortArray49 = arg0.aShortArray49;
				arg4.aShortArray50 = arg0.aShortArray50;
			}
			for (local174 = 0; local174 < this.anInt4675; local174++) {
				arg4.aShortArray49[local174] = this.aShortArray49[local174];
				arg4.aShortArray41[local174] = this.aShortArray41[local174];
				arg4.aShortArray50[local174] = this.aShortArray50[local174];
			}
		} else {
			arg4.aShortArray50 = this.aShortArray50;
			arg4.aShortArray49 = this.aShortArray49;
			arg4.aShortArray41 = this.aShortArray41;
		}
		if (Static177.method2477(this.anInt4643, arg2)) {
			if (arg3) {
				arg4.aByte53 = (byte) (arg4.aByte53 | 0x10);
			}
			arg4.aClass73_1 = arg0.aClass73_1;
			arg4.aClass73_1.anInterface5_2 = this.aClass73_1.anInterface5_2;
		} else if (Static40.method624(arg2, this.anInt4643)) {
			arg4.aClass73_1 = this.aClass73_1;
		} else {
			arg4.aClass73_1 = null;
		}
		if (Static360.method4753(this.anInt4643, arg2)) {
			if (arg0.aShortArray43 == null || this.anInt4675 > arg0.aShortArray43.length) {
				local174 = this.anInt4675;
				arg4.aShortArray43 = arg0.aShortArray43 = new short[local174];
			} else {
				arg4.aShortArray43 = arg0.aShortArray43;
			}
			for (local174 = 0; local174 < this.anInt4675; local174++) {
				arg4.aShortArray43[local174] = this.aShortArray43[local174];
			}
		} else {
			arg4.aShortArray43 = this.aShortArray43;
		}
		if (!Static406.method5145(arg2, this.anInt4643)) {
			arg4.aClass182Array1 = this.aClass182Array1;
		} else if (arg0.aClass182Array1 == null || arg0.aClass182Array1.length < this.anInt4664) {
			local174 = this.anInt4664;
			arg4.aClass182Array1 = arg0.aClass182Array1 = new Class182[local174];
			for (local578 = 0; local578 < this.anInt4664; local578++) {
				arg4.aClass182Array1[local578] = this.aClass182Array1[local578].method3894();
			}
		} else {
			arg4.aClass182Array1 = arg0.aClass182Array1;
			for (local174 = 0; local174 < this.anInt4664; local174++) {
				arg4.aClass182Array1[local174].method3896(this.aClass182Array1[local174]);
			}
		}
		arg4.aShortArray48 = this.aShortArray48;
		arg4.aClass259Array1 = this.aClass259Array1;
		arg4.aClass199Array1 = this.aClass199Array1;
		arg4.anIntArrayArray35 = this.anIntArrayArray35;
		arg4.aClass155Array1 = this.aClass155Array1;
		arg4.anIntArrayArray36 = this.anIntArrayArray36;
		arg4.aShortArray44 = this.aShortArray44;
		arg4.aShortArray51 = this.aShortArray51;
		if (this.aBoolean330) {
			arg4.aBoolean330 = true;
			arg4.aShort48 = this.aShort48;
			arg4.aShort51 = this.aShort51;
			arg4.aShort55 = this.aShort55;
			arg4.aShort53 = this.aShort53;
			arg4.aShort54 = this.aShort54;
			arg4.aShort52 = this.aShort52;
			arg4.aShort50 = this.aShort50;
		} else {
			arg4.aBoolean330 = false;
		}
		arg4.anIntArray403 = this.anIntArray403;
		arg4.anIntArrayArray37 = this.anIntArrayArray37;
		arg4.anIntArray404 = this.anIntArray404;
		return arg4;
	}

	@OriginalMember(owner = "client!oj", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class155.anIntArray342[arg0];
		@Pc(13) int local13 = Class155.anIntArray341[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4677; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray402[local15] - local9 * this.anIntArray401[local15] >> 15;
			this.anIntArray401[local15] = this.anIntArray401[local15] * local13 + this.anIntArray402[local15] * local9 >> 15;
			this.anIntArray402[local15] = local34;
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4677; local7++) {
			if (arg0 != 0) {
				this.anIntArray405[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray402[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray401[local7] += arg2;
			}
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	@Override
	public Class2_Sub5_Sub7 EA(@OriginalArg(0) Class2_Sub5_Sub7 arg0) {
		if (this.anInt4679 == 0) {
			return null;
		}
		if (!this.aBoolean330) {
			this.method3817();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass163_Sub2_31.anInt5256 > 0) {
			local40 = this.aShort50 - (this.aShort54 * this.aClass163_Sub2_31.anInt5256 >> 8) >> this.aClass163_Sub2_31.anInt5220;
			local57 = this.aShort52 - (this.aShort51 * this.aClass163_Sub2_31.anInt5256 >> 8) >> this.aClass163_Sub2_31.anInt5220;
		} else {
			local40 = this.aShort50 - (this.aShort51 * this.aClass163_Sub2_31.anInt5256 >> 8) >> this.aClass163_Sub2_31.anInt5220;
			local57 = this.aShort52 - (this.aShort54 * this.aClass163_Sub2_31.anInt5256 >> 8) >> this.aClass163_Sub2_31.anInt5220;
		}
		@Pc(113) int local113;
		@Pc(129) int local129;
		if (this.aClass163_Sub2_31.anInt5262 > 0) {
			local113 = this.aShort55 - (this.aShort54 * this.aClass163_Sub2_31.anInt5262 >> 8) >> this.aClass163_Sub2_31.anInt5220;
			local129 = this.aShort53 - (this.aShort51 * this.aClass163_Sub2_31.anInt5262 >> 8) >> this.aClass163_Sub2_31.anInt5220;
		} else {
			local113 = this.aShort55 - (this.aShort51 * this.aClass163_Sub2_31.anInt5262 >> 8) >> this.aClass163_Sub2_31.anInt5220;
			local129 = this.aShort53 - (this.aClass163_Sub2_31.anInt5262 * this.aShort54 >> 8) >> this.aClass163_Sub2_31.anInt5220;
		}
		@Pc(171) int local171 = local57 + 1 - local40;
		@Pc(178) int local178 = local129 + 1 - local113;
		@Pc(181) Class2_Sub5_Sub7_Sub1 local181 = (Class2_Sub5_Sub7_Sub1) arg0;
		@Pc(191) Class2_Sub5_Sub7_Sub1 local191;
		if (local181 != null && local181.method3838(local178, local171)) {
			local191 = local181;
			local181.method3836();
		} else {
			local191 = new Class2_Sub5_Sub7_Sub1(this.aClass163_Sub2_31, local171, local178);
		}
		local191.method3834(local113, local57, local40, local129);
		this.method3812(local191);
		return local191;
	}

	@OriginalMember(owner = "client!oj", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class155.anIntArray342[arg0];
		@Pc(13) int local13 = Class155.anIntArray341[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4677; local15++) {
			@Pc(34) int local34 = this.anIntArray401[local15] * local9 + this.anIntArray405[local15] * local13 >> 15;
			this.anIntArray401[local15] = this.anIntArray401[local15] * local13 - this.anIntArray405[local15] * local9 >> 15;
			this.anIntArray405[local15] = local34;
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt4683;
	}

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort54;
	}

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class155.anIntArray342[arg0];
		@Pc(13) int local13 = Class155.anIntArray341[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4677; local15++) {
			@Pc(33) int local33 = this.anIntArray405[local15] * local13 + this.anIntArray402[local15] * local9 >> 15;
			this.anIntArray402[local15] = local13 * this.anIntArray402[local15] - local9 * this.anIntArray405[local15] >> 15;
			this.anIntArray405[local15] = local33;
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!c;Lclient!rr;I)V")
	@Override
	public void method5736(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4679 == 0) {
			return;
		}
		@Pc(13) Class31_Sub2 local13 = this.aClass163_Sub2_31.aClass31_Sub2_4;
		if (!this.aBoolean330) {
			this.method3817();
		}
		@Pc(22) Class31_Sub2 local22 = (Class31_Sub2) arg0;
		this.method3807(local22);
		Static112.aFloat41 = local22.aFloat94 * local13.aFloat95 + local22.aFloat85 * local13.aFloat86 + local22.aFloat95 * local13.aFloat88;
		Static274.aFloat53 = local13.aFloat92 + local22.aFloat87 * local13.aFloat95 + local13.aFloat86 * local22.aFloat90 + local13.aFloat88 * local22.aFloat92;
		@Pc(73) float local73 = Static112.aFloat41 * (float) this.aShort51 + Static274.aFloat53;
		@Pc(81) float local81 = Static112.aFloat41 * (float) this.aShort54 + Static274.aFloat53;
		@Pc(92) float local92;
		@Pc(98) float local98;
		if (local81 < local73) {
			local92 = (float) -this.aShort48 + local81;
			local98 = (float) this.aShort48 + local73;
		} else {
			local92 = local73 - (float) this.aShort48;
			local98 = local81 + (float) this.aShort48;
		}
		if (this.aClass163_Sub2_31.aFloat73 <= local92 || (float) this.aClass163_Sub2_31.anInt5239 >= local98) {
			return;
		}
		Static40.aFloat9 = local22.aFloat95 * local13.aFloat91 + local13.aFloat85 * local22.aFloat94 + local13.aFloat84 * local22.aFloat85;
		Static97.aFloat17 = local13.aFloat90 + local22.aFloat87 * local13.aFloat85 + local22.aFloat90 * local13.aFloat84 + local22.aFloat92 * local13.aFloat91;
		@Pc(174) float local174 = Static97.aFloat17 + Static40.aFloat9 * (float) this.aShort51;
		@Pc(182) float local182 = (float) this.aShort54 * Static40.aFloat9 + Static97.aFloat17;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local174 > local182) {
			local198 = ((float) -this.aShort48 + local182) * (float) this.aClass163_Sub2_31.anInt5248;
			local209 = ((float) this.aShort48 + local174) * (float) this.aClass163_Sub2_31.anInt5248;
		} else {
			local198 = ((float) -this.aShort48 + local174) * (float) this.aClass163_Sub2_31.anInt5248;
			local209 = ((float) this.aShort48 + local182) * (float) this.aClass163_Sub2_31.anInt5248;
		}
		if (local198 / local98 >= this.aClass163_Sub2_31.aFloat61 || local209 / local98 <= this.aClass163_Sub2_31.aFloat57) {
			return;
		}
		Static375.aFloat98 = local13.aFloat87 + local22.aFloat92 * local13.aFloat89 + local22.aFloat87 * local13.aFloat94 + local13.aFloat93 * local22.aFloat90;
		Static115.aFloat20 = local22.aFloat94 * local13.aFloat94 + local22.aFloat85 * local13.aFloat93 + local13.aFloat89 * local22.aFloat95;
		@Pc(299) float local299 = Static375.aFloat98 + (float) this.aShort51 * Static115.aFloat20;
		@Pc(307) float local307 = Static375.aFloat98 + (float) this.aShort54 * Static115.aFloat20;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local307 < local299) {
			local323 = (local307 - (float) this.aShort48) * (float) this.aClass163_Sub2_31.anInt5235;
			local334 = (float) this.aClass163_Sub2_31.anInt5235 * ((float) this.aShort48 + local299);
		} else {
			local323 = ((float) -this.aShort48 + local299) * (float) this.aClass163_Sub2_31.anInt5235;
			local334 = (float) this.aClass163_Sub2_31.anInt5235 * ((float) this.aShort48 + local307);
		}
		if (local323 / local98 >= this.aClass163_Sub2_31.aFloat75 || this.aClass163_Sub2_31.aFloat69 >= local334 / local98) {
			return;
		}
		if (arg1 != null || this.aClass259Array1 != null) {
			Static281.aFloat55 = local22.aFloat84 * local13.aFloat84 + local22.aFloat93 * local13.aFloat85 + local22.aFloat86 * local13.aFloat91;
			Static226.aFloat37 = local13.aFloat88 * local22.aFloat86 + local13.aFloat86 * local22.aFloat84 + local22.aFloat93 * local13.aFloat95;
			Static47.aFloat10 = local22.aFloat91 * local13.aFloat86 + local22.aFloat89 * local13.aFloat95 + local13.aFloat88 * local22.aFloat88;
			Static322.aFloat79 = local22.aFloat93 * local13.aFloat94 + local13.aFloat93 * local22.aFloat84 + local13.aFloat89 * local22.aFloat86;
			Static443.aFloat104 = local13.aFloat91 * local22.aFloat88 + local13.aFloat84 * local22.aFloat91 + local13.aFloat85 * local22.aFloat89;
			Static317.aFloat101 = local13.aFloat93 * local22.aFloat91 + local13.aFloat94 * local22.aFloat89 + local13.aFloat89 * local22.aFloat88;
		}
		if (arg1 != null) {
			@Pc(493) boolean local493 = false;
			@Pc(495) boolean local495 = true;
			@Pc(503) int local503 = this.aShort50 + this.aShort52 >> 1;
			@Pc(511) int local511 = this.aShort53 + this.aShort55 >> 1;
			@Pc(530) int local530 = (int) ((float) local503 * Static281.aFloat55 + Static97.aFloat17 + (float) this.aShort51 * Static40.aFloat9 + Static443.aFloat104 * (float) local511);
			@Pc(549) int local549 = (int) ((float) this.aShort51 * Static115.aFloat20 + Static375.aFloat98 + Static322.aFloat79 * (float) local503 + (float) local511 * Static317.aFloat101);
			@Pc(568) int local568 = (int) ((float) local503 * Static226.aFloat37 + Static274.aFloat53 + (float) this.aShort51 * Static112.aFloat41 + (float) local511 * Static47.aFloat10);
			if (local568 >= this.aClass163_Sub2_31.anInt5239) {
				arg1.anInt5998 = local530 * this.aClass163_Sub2_31.anInt5248 / local568 + this.aClass163_Sub2_31.anInt5230;
				arg1.anInt6002 = this.aClass163_Sub2_31.anInt5235 * local549 / local568 + this.aClass163_Sub2_31.anInt5234;
			} else {
				local493 = true;
			}
			@Pc(626) int local626 = (int) (Static97.aFloat17 + (float) local503 * Static281.aFloat55 + Static40.aFloat9 * (float) this.aShort54 + Static443.aFloat104 * (float) local511);
			@Pc(645) int local645 = (int) (Static115.aFloat20 * (float) this.aShort54 + Static322.aFloat79 * (float) local503 + Static375.aFloat98 + Static317.aFloat101 * (float) local511);
			@Pc(664) int local664 = (int) ((float) local511 * Static47.aFloat10 + (float) local503 * Static226.aFloat37 + Static274.aFloat53 + (float) this.aShort54 * Static112.aFloat41);
			if (this.aClass163_Sub2_31.anInt5239 > local664) {
				local493 = true;
			} else {
				arg1.anInt6000 = this.aClass163_Sub2_31.anInt5230 + local626 * this.aClass163_Sub2_31.anInt5248 / local664;
				arg1.anInt6001 = this.aClass163_Sub2_31.anInt5234 + local645 * this.aClass163_Sub2_31.anInt5235 / local664;
			}
			if (local493) {
				if (local568 < this.aClass163_Sub2_31.anInt5239 && local664 < this.aClass163_Sub2_31.anInt5239) {
					local495 = false;
				} else {
					@Pc(739) int local739;
					@Pc(749) int local749;
					@Pc(776) int local776;
					if (this.aClass163_Sub2_31.anInt5239 > local568) {
						local739 = (local664 - this.aClass163_Sub2_31.anInt5239 << 16) / (local664 - local568);
						local749 = ((local626 - local530) * local739 >> 16) + local626;
						local776 = local645 + ((local645 - local549) * local739 >> 16);
						arg1.anInt5998 = this.aClass163_Sub2_31.anInt5230 + local749 * this.aClass163_Sub2_31.anInt5248 / this.aClass163_Sub2_31.anInt5239;
						arg1.anInt6002 = this.aClass163_Sub2_31.anInt5234 + this.aClass163_Sub2_31.anInt5235 * local776 / this.aClass163_Sub2_31.anInt5239;
					} else if (this.aClass163_Sub2_31.anInt5239 > local664) {
						local739 = (local568 - this.aClass163_Sub2_31.anInt5239 << 16) / (local568 - local664);
						local749 = (local739 * (local530 - local626) >> 16) + local530;
						arg1.anInt5998 = this.aClass163_Sub2_31.anInt5230 + this.aClass163_Sub2_31.anInt5248 * local749 / this.aClass163_Sub2_31.anInt5239;
						local776 = local549 + ((local549 - local645) * local739 >> 16);
						arg1.anInt6002 = this.aClass163_Sub2_31.anInt5234 + this.aClass163_Sub2_31.anInt5235 * local776 / this.aClass163_Sub2_31.anInt5239;
					}
				}
			}
			if (local495) {
				if (local664 < local568) {
					arg1.anInt5999 = this.aClass163_Sub2_31.anInt5230 + this.aClass163_Sub2_31.anInt5248 * (local530 + this.aShort48) / local568 - arg1.anInt5998;
				} else {
					arg1.anInt5999 = this.aClass163_Sub2_31.anInt5230 + (this.aShort48 + local626) * this.aClass163_Sub2_31.anInt5248 / local664 - arg1.anInt6000;
				}
				arg1.aBoolean436 = true;
			}
		}
		this.aClass163_Sub2_31.method4171();
		this.aClass163_Sub2_31.method4178(local22);
		this.method3813();
		this.aClass163_Sub2_31.method4112();
		this.method3819();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIZ)Lclient!e;")
	@Override
	public Class59 method5737(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class59_Sub1 local23;
		@Pc(19) Class59_Sub1 local19;
		if (arg0 == 1) {
			local23 = this.aClass163_Sub2_31.aClass59_Sub1_6;
			local19 = this.aClass163_Sub2_31.aClass59_Sub1_4;
		} else if (arg0 == 2) {
			local19 = this.aClass163_Sub2_31.aClass59_Sub1_8;
			local23 = this.aClass163_Sub2_31.aClass59_Sub1_10;
		} else if (arg0 == 3) {
			local23 = this.aClass163_Sub2_31.aClass59_Sub1_2;
			local19 = this.aClass163_Sub2_31.aClass59_Sub1_7;
		} else if (arg0 == 4) {
			local19 = this.aClass163_Sub2_31.aClass59_Sub1_5;
			local23 = this.aClass163_Sub2_31.aClass59_Sub1_9;
		} else if (arg0 == 5) {
			local19 = this.aClass163_Sub2_31.aClass59_Sub1_1;
			local23 = this.aClass163_Sub2_31.aClass59_Sub1_3;
		} else {
			local23 = local19 = new Class59_Sub1(this.aClass163_Sub2_31);
		}
		return this.method3814(local19, arg2, arg1, arg0 != 0, local23);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZB)V")
	private void method3815(@OriginalArg(0) boolean arg0) {
		if (this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3.aByteArray52.length >= this.anInt4665 * 6) {
			this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3.anInt4347 = 0;
		} else {
			this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1((this.anInt4665 + 100) * 6);
		}
		@Pc(47) Class2_Sub13_Sub1 local47 = this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3;
		@Pc(53) int local53;
		if (this.aClass163_Sub2_31.aBoolean374) {
			for (local53 = 0; local53 < this.anInt4665; local53++) {
				local47.method3568(this.aShortArray49[local53]);
				local47.method3568(this.aShortArray41[local53]);
				local47.method3568(this.aShortArray50[local53]);
			}
		} else {
			for (local53 = 0; local53 < this.anInt4665; local53++) {
				local47.method3540(this.aShortArray49[local53]);
				local47.method3540(this.aShortArray41[local53]);
				local47.method3540(this.aShortArray50[local53]);
			}
		}
		if (local47.anInt4347 == 0) {
			return;
		}
		if (arg0) {
			if (this.lb == null) {
				this.lb = this.aClass163_Sub2_31.method4147(local47.aByteArray52, true, local47.anInt4347);
			} else {
				this.lb.method5172(local47.anInt4347, local47.aByteArray52);
			}
			this.aClass73_1.anInterface5_2 = this.lb;
		} else {
			this.aClass73_1.anInterface5_2 = this.aClass163_Sub2_31.method4147(local47.aByteArray52, false, local47.anInt4347);
		}
		if (!arg0) {
			this.aBoolean331 = true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "()V")
	@Override
	public void method5745() {
		if (this.anInt4679 <= 0 || this.anInt4665 <= 0) {
			return;
		}
		this.method3821(false);
		if ((this.aByte53 & 0x10) == 0 && this.aClass73_1.anInterface5_2 == null) {
			this.method3815(false);
		}
		this.method3818();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method5743(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class59_Sub1 local8 = (Class59_Sub1) arg0;
		if (this.anInt4675 == 0 || local8.anInt4675 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt4677;
		@Pc(21) int[] local21 = local8.anIntArray405;
		@Pc(24) int[] local24 = local8.anIntArray402;
		@Pc(27) int[] local27 = local8.anIntArray401;
		@Pc(30) short[] local30 = local8.aShortArray42;
		@Pc(33) short[] local33 = local8.aShortArray47;
		@Pc(36) short[] local36 = local8.aShortArray46;
		@Pc(39) byte[] local39 = local8.aByteArray54;
		@Pc(58) short[] local58;
		@Pc(46) short[] local46;
		@Pc(50) short[] local50;
		@Pc(54) byte[] local54;
		if (this.aClass87_1 == null) {
			local54 = null;
			local58 = null;
			local50 = null;
			local46 = null;
		} else {
			local46 = this.aClass87_1.aShortArray8;
			local50 = this.aClass87_1.aShortArray7;
			local54 = this.aClass87_1.aByteArray17;
			local58 = this.aClass87_1.aShortArray6;
		}
		@Pc(75) short[] local75;
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(87) byte[] local87;
		if (local8.aClass87_1 == null) {
			local87 = null;
			local79 = null;
			local75 = null;
			local83 = null;
		} else {
			local75 = local8.aClass87_1.aShortArray6;
			local79 = local8.aClass87_1.aShortArray8;
			local83 = local8.aClass87_1.aShortArray7;
			local87 = local8.aClass87_1.aByteArray17;
		}
		@Pc(100) int[] local100 = local8.anIntArray403;
		@Pc(103) short[] local103 = local8.aShortArray48;
		if (!local8.aBoolean330) {
			local8.method3817();
		}
		@Pc(112) short local112 = local8.aShort51;
		@Pc(115) short local115 = local8.aShort54;
		@Pc(118) short local118 = local8.aShort50;
		@Pc(121) short local121 = local8.aShort52;
		@Pc(124) short local124 = local8.aShort55;
		@Pc(127) short local127 = local8.aShort53;
		for (@Pc(129) int local129 = 0; local129 < this.anInt4677; local129++) {
			@Pc(139) int local139 = this.anIntArray402[local129] - arg2;
			if (local139 >= local112 && local139 <= local115) {
				@Pc(155) int local155 = this.anIntArray405[local129] - arg1;
				if (local118 <= local155 && local155 <= local121) {
					@Pc(179) int local179 = this.anIntArray401[local129] - arg3;
					if (local179 >= local124 && local179 <= local127) {
						@Pc(193) int local193 = -1;
						@Pc(198) int local198 = this.anIntArray403[local129];
						@Pc(205) int local205 = this.anIntArray403[local129 + 1];
						for (@Pc(207) int local207 = local198; local207 < local205; local207++) {
							local193 = this.aShortArray48[local207] - 1;
							if (local193 == -1 || this.aByteArray54[local193] != 0) {
								break;
							}
						}
						if (local193 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local18; local243++) {
								if (local21[local243] == local155 && local27[local243] == local179 && local139 == local24[local243]) {
									local198 = local100[local243];
									@Pc(274) int local274 = -1;
									local205 = local100[local243 + 1];
									for (@Pc(282) int local282 = local198; local282 < local205; local282++) {
										local274 = local103[local282] - 1;
										if (local274 == -1 || local39[local274] != 0) {
											break;
										}
									}
									if (local274 != -1) {
										if (local58 == null) {
											this.aClass87_1 = new Class87();
											local58 = this.aClass87_1.aShortArray6 = Static236.method3054(this.aShortArray42);
											local46 = this.aClass87_1.aShortArray8 = Static236.method3054(this.aShortArray47);
											local50 = this.aClass87_1.aShortArray7 = Static236.method3054(this.aShortArray46);
											local54 = this.aClass87_1.aByteArray17 = Static104.method1552(this.aByteArray54);
										}
										if (local75 == null) {
											@Pc(367) Class87 local367 = local8.aClass87_1 = new Class87();
											local75 = local367.aShortArray6 = Static236.method3054(local30);
											local79 = local367.aShortArray8 = Static236.method3054(local33);
											local83 = local367.aShortArray7 = Static236.method3054(local36);
											local87 = local367.aByteArray17 = Static104.method1552(local39);
										}
										@Pc(400) short local400 = this.aShortArray42[local193];
										@Pc(405) short local405 = this.aShortArray47[local193];
										@Pc(410) short local410 = this.aShortArray46[local193];
										local198 = local100[local243];
										local205 = local100[local243 + 1];
										@Pc(425) byte local425 = this.aByteArray54[local193];
										@Pc(435) int local435;
										for (@Pc(427) int local427 = local198; local427 < local205; local427++) {
											local435 = local103[local427] - 1;
											if (local435 == -1) {
												break;
											}
											if (local87[local435] != 0) {
												local75[local435] += local400;
												local79[local435] += local405;
												local83[local435] += local410;
												local87[local435] += local425;
											}
										}
										local425 = local39[local274];
										local405 = local33[local274];
										local198 = this.anIntArray403[local129];
										local205 = this.anIntArray403[local129 + 1];
										local410 = local36[local274];
										local400 = local30[local274];
										for (local435 = local198; local435 < local205; local435++) {
											@Pc(525) int local525 = this.aShortArray48[local435] - 1;
											if (local525 == -1) {
												break;
											}
											if (local54[local525] != 0) {
												local58[local525] += local400;
												local46[local525] += local405;
												local50[local525] += local410;
												local54[local525] += local425;
											}
										}
										if (this.aClass100_10 == null && this.aClass100_9 != null) {
											this.aClass100_9.anInterface11_2 = null;
										}
										if (this.aClass100_10 != null) {
											this.aClass100_10.anInterface11_2 = null;
										}
										if (local8.aClass100_10 == null && local8.aClass100_9 != null) {
											local8.aClass100_9.anInterface11_2 = null;
										}
										if (local8.aClass100_10 != null) {
											local8.aClass100_10.anInterface11_2 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "za", descriptor = "(IIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static232.anInt3746 = 0;
			Static400.anInt6546 = 0;
			Static310.anInt5369 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt4677; local20++) {
				Static232.anInt3746 += this.anIntArray405[local20];
				Static310.anInt5369 += this.anIntArray402[local20];
				local18++;
				Static400.anInt6546 += this.anIntArray401[local20];
			}
			if (local18 <= 0) {
				Static232.anInt3746 = arg1;
				Static400.anInt6546 = arg3;
				Static310.anInt5369 = arg2;
			} else {
				Static400.anInt6546 = arg3 + Static400.anInt6546 / local18;
				Static310.anInt5369 = Static310.anInt5369 / local18 + arg2;
				Static232.anInt3746 = Static232.anInt3746 / local18 + arg1;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt4677; local18++) {
				this.anIntArray405[local18] += arg1;
				this.anIntArray402[local18] += arg2;
				this.anIntArray401[local18] += arg3;
			}
		} else {
			@Pc(156) int local156;
			@Pc(174) int local174;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt4677; local18++) {
					this.anIntArray405[local18] -= Static232.anInt3746;
					this.anIntArray402[local18] -= Static310.anInt5369;
					this.anIntArray401[local18] -= Static400.anInt6546;
					if (arg3 != 0) {
						local20 = Class155.anIntArray342[arg3];
						local156 = Class155.anIntArray341[arg3];
						local174 = this.anIntArray405[local18] * local156 + local20 * this.anIntArray402[local18] + 32767 >> 15;
						this.anIntArray402[local18] = local156 * this.anIntArray402[local18] + 32767 - this.anIntArray405[local18] * local20 >> 15;
						this.anIntArray405[local18] = local174;
					}
					if (arg1 != 0) {
						local20 = Class155.anIntArray342[arg1];
						local156 = Class155.anIntArray341[arg1];
						local174 = this.anIntArray402[local18] * local156 + 32767 - local20 * this.anIntArray401[local18] >> 15;
						this.anIntArray401[local18] = local156 * this.anIntArray401[local18] + this.anIntArray402[local18] * local20 + 32767 >> 15;
						this.anIntArray402[local18] = local174;
					}
					if (arg2 != 0) {
						local20 = Class155.anIntArray342[arg2];
						local156 = Class155.anIntArray341[arg2];
						local174 = this.anIntArray405[local18] * local156 + local20 * this.anIntArray401[local18] + 32767 >> 15;
						this.anIntArray401[local18] = this.anIntArray401[local18] * local156 + 32767 - this.anIntArray405[local18] * local20 >> 15;
						this.anIntArray405[local18] = local174;
					}
					this.anIntArray405[local18] += Static232.anInt3746;
					this.anIntArray402[local18] += Static310.anInt5369;
					this.anIntArray401[local18] += Static400.anInt6546;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt4677; local18++) {
					this.anIntArray405[local18] -= Static232.anInt3746;
					this.anIntArray402[local18] -= Static310.anInt5369;
					this.anIntArray401[local18] -= Static400.anInt6546;
					this.anIntArray405[local18] = this.anIntArray405[local18] * arg1 / 128;
					this.anIntArray402[local18] = this.anIntArray402[local18] * arg2 / 128;
					this.anIntArray401[local18] = this.anIntArray401[local18] * arg3 / 128;
					this.anIntArray405[local18] += Static232.anInt3746;
					this.anIntArray402[local18] += Static310.anInt5369;
					this.anIntArray401[local18] += Static400.anInt6546;
				}
			} else {
				@Pc(513) Class259 local513;
				@Pc(518) Class182 local518;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt4675; local18++) {
						local20 = (this.aByteArray55[local18] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray55[local18] = (byte) local20;
					}
					if (this.aClass100_9 != null) {
						this.aClass100_9.anInterface11_2 = null;
					}
					if (this.aClass259Array1 != null) {
						for (local20 = 0; local20 < this.anInt4664; local20++) {
							local513 = this.aClass259Array1[local20];
							local518 = this.aClass182Array1[local20];
							local518.anInt4808 = local518.anInt4808 & 0xFFFFFF | 255 - (this.aByteArray55[local513.anInt7047] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt4675; local18++) {
						local20 = this.aShortArray45[local18] & 0xFFFF;
						local156 = local20 >> 10 & 0x3F;
						local174 = local20 >> 7 & 0x7;
						local174 += arg2 / 4;
						@Pc(585) int local585 = local20 & 0x7F;
						@Pc(592) int local592 = local156 + arg1 & 0x3F;
						if (local174 < 0) {
							local174 = 0;
						} else if (local174 > 7) {
							local174 = 7;
						}
						local585 += arg3;
						if (local585 < 0) {
							local585 = 0;
						} else if (local585 > 127) {
							local585 = 127;
						}
						this.aShortArray45[local18] = (short) (local585 | local174 << 7 | local592 << 10);
					}
					if (this.aClass100_9 != null) {
						this.aClass100_9.anInterface11_2 = null;
					}
					if (this.aClass259Array1 != null) {
						for (local20 = 0; local20 < this.anInt4664; local20++) {
							local513 = this.aClass259Array1[local20];
							local518 = this.aClass182Array1[local20];
							local518.anInt4808 = Static237.anIntArray330[this.aShortArray45[local513.anInt7047] & 0xFFFF] & 0xFFFFFF | local518.anInt4808 & 0xFF000000;
						}
					}
				} else {
					@Pc(702) Class182 local702;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt4664; local18++) {
							local702 = this.aClass182Array1[local18];
							local702.anInt4806 += arg2;
							local702.anInt4801 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt4664; local18++) {
							local702 = this.aClass182Array1[local18];
							local702.anInt4807 = arg1 * local702.anInt4807 >> 7;
							local702.anInt4804 = arg2 * local702.anInt4804 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt4664; local18++) {
							local702 = this.aClass182Array1[local18];
							local702.anInt4803 = arg1 + local702.anInt4803 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "va", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static400.anInt6546 = 0;
			Static232.anInt3746 = 0;
			local31 = 0;
			Static310.anInt5369 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray35.length) {
					local55 = this.anIntArrayArray35[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static232.anInt3746 += this.anIntArray405[local63];
						Static310.anInt5369 += this.anIntArray402[local63];
						Static400.anInt6546 += this.anIntArray401[local63];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static400.anInt6546 = local25;
				Static310.anInt5369 = local17;
				Static232.anInt3746 = local21;
			} else {
				Static400.anInt6546 = Static400.anInt6546 / local31 + local25;
				Static310.anInt5369 = local17 + Static310.anInt5369 / local31;
				Static232.anInt3746 = local21 + Static232.anInt3746 / local31;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local21 = arg2 << 4;
			local17 = arg3 << 4;
			local25 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray35.length) {
					local166 = this.anIntArrayArray35[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local57 = local166[local168];
						this.anIntArray405[local57] += local21;
						this.anIntArray402[local57] += local17;
						this.anIntArray401[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(285) int local285;
		@Pc(304) int local304;
		@Pc(764) int local764;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray35.length > local35) {
					local166 = this.anIntArrayArray35[local35];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							this.anIntArray405[local57] -= Static232.anInt3746;
							this.anIntArray402[local57] -= Static310.anInt5369;
							this.anIntArray401[local57] -= Static400.anInt6546;
							if (arg4 != 0) {
								local63 = Class155.anIntArray342[arg4];
								local285 = Class155.anIntArray341[arg4];
								local304 = local63 * this.anIntArray402[local57] + this.anIntArray405[local57] * local285 + 32767 >> 15;
								this.anIntArray402[local57] = this.anIntArray402[local57] * local285 + 32767 - this.anIntArray405[local57] * local63 >> 15;
								this.anIntArray405[local57] = local304;
							}
							if (arg2 != 0) {
								local63 = Class155.anIntArray342[arg2];
								local285 = Class155.anIntArray341[arg2];
								local304 = local285 * this.anIntArray402[local57] + 32767 - local63 * this.anIntArray401[local57] >> 15;
								this.anIntArray401[local57] = local285 * this.anIntArray401[local57] + local63 * this.anIntArray402[local57] + 32767 >> 15;
								this.anIntArray402[local57] = local304;
							}
							if (arg3 != 0) {
								local63 = Class155.anIntArray342[arg3];
								local285 = Class155.anIntArray341[arg3];
								local304 = this.anIntArray401[local57] * local63 + local285 * this.anIntArray405[local57] + 32767 >> 15;
								this.anIntArray401[local57] = local285 * this.anIntArray401[local57] + 32767 - local63 * this.anIntArray405[local57] >> 15;
								this.anIntArray405[local57] = local304;
							}
							this.anIntArray405[local57] += Static232.anInt3746;
							this.anIntArray402[local57] += Static310.anInt5369;
							this.anIntArray401[local57] += Static400.anInt6546;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							this.anIntArray405[local57] -= Static232.anInt3746;
							this.anIntArray402[local57] -= Static310.anInt5369;
							this.anIntArray401[local57] -= Static400.anInt6546;
							if (arg2 != 0) {
								local63 = Class155.anIntArray342[arg2];
								local285 = Class155.anIntArray341[arg2];
								local304 = local285 * this.anIntArray402[local57] + 32767 - this.anIntArray401[local57] * local63 >> 15;
								this.anIntArray401[local57] = this.anIntArray402[local57] * local63 + local285 * this.anIntArray401[local57] + 32767 >> 15;
								this.anIntArray402[local57] = local304;
							}
							if (arg4 != 0) {
								local63 = Class155.anIntArray342[arg4];
								local285 = Class155.anIntArray341[arg4];
								local304 = this.anIntArray402[local57] * local63 + this.anIntArray405[local57] * local285 + 32767 >> 15;
								this.anIntArray402[local57] = local285 * this.anIntArray402[local57] + 32767 - local63 * this.anIntArray405[local57] >> 15;
								this.anIntArray405[local57] = local304;
							}
							if (arg3 != 0) {
								local63 = Class155.anIntArray342[arg3];
								local285 = Class155.anIntArray341[arg3];
								local304 = this.anIntArray405[local57] * local285 + this.anIntArray401[local57] * local63 + 32767 >> 15;
								this.anIntArray401[local57] = this.anIntArray401[local57] * local285 + 32767 - this.anIntArray405[local57] * local63 >> 15;
								this.anIntArray405[local57] = local304;
							}
							this.anIntArray405[local57] += Static232.anInt3746;
							this.anIntArray402[local57] += Static310.anInt5369;
							this.anIntArray401[local57] += Static400.anInt6546;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray35.length) {
						local55 = this.anIntArrayArray35[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local285 = this.anIntArray403[local63];
							local304 = this.anIntArray403[local63 + 1];
							for (local764 = local285; local764 < local304; local764++) {
								@Pc(773) int local773 = this.aShortArray48[local764] - 1;
								if (local773 == -1) {
									break;
								}
								@Pc(785) int local785;
								@Pc(789) int local789;
								@Pc(807) int local807;
								if (arg4 != 0) {
									local785 = Class155.anIntArray342[arg4];
									local789 = Class155.anIntArray341[arg4];
									local807 = local789 * this.aShortArray42[local773] + local785 * this.aShortArray47[local773] + 32767 >> 15;
									this.aShortArray47[local773] = (short) (local789 * this.aShortArray47[local773] + 32767 - local785 * this.aShortArray42[local773] >> 15);
									this.aShortArray42[local773] = (short) local807;
								}
								if (arg2 != 0) {
									local785 = Class155.anIntArray342[arg2];
									local789 = Class155.anIntArray341[arg2];
									local807 = local789 * this.aShortArray47[local773] + 32767 - this.aShortArray46[local773] * local785 >> 15;
									this.aShortArray46[local773] = (short) (this.aShortArray46[local773] * local789 + local785 * this.aShortArray47[local773] + 32767 >> 15);
									this.aShortArray47[local773] = (short) local807;
								}
								if (arg3 != 0) {
									local785 = Class155.anIntArray342[arg3];
									local789 = Class155.anIntArray341[arg3];
									local807 = this.aShortArray46[local773] * local785 + this.aShortArray42[local773] * local789 + 32767 >> 15;
									this.aShortArray46[local773] = (short) (this.aShortArray46[local773] * local789 + 32767 - local785 * this.aShortArray42[local773] >> 15);
									this.aShortArray42[local773] = (short) local807;
								}
							}
						}
					}
				}
				if (this.aClass100_10 == null && this.aClass100_9 != null) {
					this.aClass100_9.anInterface11_2 = null;
				}
				if (this.aClass100_10 != null) {
					this.aClass100_10.anInterface11_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray35.length) {
					local166 = this.anIntArrayArray35[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local57 = local166[local168];
						this.anIntArray405[local57] -= Static232.anInt3746;
						this.anIntArray402[local57] -= Static310.anInt5369;
						this.anIntArray401[local57] -= Static400.anInt6546;
						this.anIntArray405[local57] = this.anIntArray405[local57] * arg2 >> 7;
						this.anIntArray402[local57] = arg3 * this.anIntArray402[local57] >> 7;
						this.anIntArray401[local57] = arg4 * this.anIntArray401[local57] >> 7;
						this.anIntArray405[local57] += Static232.anInt3746;
						this.anIntArray402[local57] += Static310.anInt5369;
						this.anIntArray401[local57] += Static400.anInt6546;
					}
				}
			}
		} else {
			@Pc(1228) Class259 local1228;
			@Pc(1233) Class182 local1233;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray37.length > local35) {
							local166 = this.anIntArrayArray37[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local57 = local166[local168];
								local63 = (this.aByteArray55[local57] & 0xFF) + arg2 * 8;
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray55[local57] = (byte) local63;
							}
							if (local166.length > 0 && this.aClass100_9 != null) {
								this.aClass100_9.anInterface11_2 = null;
							}
						}
					}
					if (this.aClass259Array1 != null) {
						for (local35 = 0; local35 < this.anInt4664; local35++) {
							local1228 = this.aClass259Array1[local35];
							local1233 = this.aClass182Array1[local35];
							local1233.anInt4808 = 255 - (this.aByteArray55[local1228.anInt7047] & 0xFF) << 24 | local1233.anInt4808 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1481) Class182 local1481;
				if (arg0 == 8) {
					if (this.anIntArrayArray36 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray36.length > local35) {
								local166 = this.anIntArrayArray36[local35];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1481 = this.aClass182Array1[local166[local168]];
									local1481.anInt4801 += arg2;
									local1481.anInt4806 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray36 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray36.length > local35) {
								local166 = this.anIntArrayArray36[local35];
								for (local168 = 0; local168 < local166.length; local168++) {
									local1481 = this.aClass182Array1[local166[local168]];
									local1481.anInt4807 = local1481.anInt4807 * arg2 >> 7;
									local1481.anInt4804 = local1481.anInt4804 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray36 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray36.length) {
							local166 = this.anIntArrayArray36[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1481 = this.aClass182Array1[local166[local168]];
								local1481.anInt4803 = local1481.anInt4803 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray37 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray37.length) {
						local166 = this.anIntArrayArray37[local35];
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							local63 = this.aShortArray45[local57] & 0xFFFF;
							local285 = local63 >> 10 & 0x3F;
							local304 = local63 >> 7 & 0x7;
							@Pc(1315) int local1315 = arg2 + local285 & 0x3F;
							local304 += arg3 / 4;
							local764 = local63 & 0x7F;
							local764 += arg4;
							if (local304 < 0) {
								local304 = 0;
							} else if (local304 > 7) {
								local304 = 7;
							}
							if (local764 < 0) {
								local764 = 0;
							} else if (local764 > 127) {
								local764 = 127;
							}
							this.aShortArray45[local57] = (short) (local304 << 7 | local1315 << 10 | local764);
						}
						if (local166.length > 0 && this.aClass100_9 != null) {
							this.aClass100_9.anInterface11_2 = null;
						}
					}
				}
				if (this.aClass259Array1 != null) {
					for (local35 = 0; local35 < this.anInt4664; local35++) {
						local1228 = this.aClass259Array1[local35];
						local1233 = this.aClass182Array1[local35];
						local1233.anInt4808 = local1233.anInt4808 & 0xFF000000 | Static237.anIntArray330[this.aShortArray45[local1228.anInt7047] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		if (this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
		}
		this.aShort56 = (short) arg0;
	}

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "(SS)V")
	@Override
	public void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4675; local3++) {
			if (arg0 == this.aShortArray45[local3]) {
				this.aShortArray45[local3] = arg1;
			}
		}
		if (this.aClass259Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt4664; local38++) {
				@Pc(45) Class259 local45 = this.aClass259Array1[local38];
				@Pc(50) Class182 local50 = this.aClass182Array1[local38];
				local50.anInt4808 = local50.anInt4808 & 0xFF000000 | Static237.anIntArray330[this.aShortArray45[local45.anInt7047] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	private void method3817() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4677; local23++) {
			@Pc(30) int local30 = this.anIntArray405[local23];
			@Pc(35) int local35 = this.anIntArray402[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(72) int local72 = this.anIntArray401[local23];
			if (local72 < local11) {
				local11 = local72;
			}
			if (local72 > local17) {
				local17 = local72;
			}
			@Pc(91) int local91 = local30 * local30 + local72 * local72;
			if (local91 > local19) {
				local19 = local91;
			}
			local91 = local35 * local35 + local30 * local30 + local72 * local72;
			if (local91 > local21) {
				local21 = local91;
			}
		}
		this.aShort55 = (short) local11;
		this.aShort54 = (short) local15;
		this.aShort52 = (short) local13;
		this.aShort51 = (short) local9;
		this.aShort53 = (short) local17;
		this.aShort50 = (short) local7;
		this.aShort48 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	private void method3818() {
		if (!this.aBoolean331) {
			return;
		}
		this.aBoolean331 = false;
		if (this.aClass155Array1 == null && this.aClass199Array1 == null && this.aClass259Array1 == null) {
			if (this.anIntArray405 != null && !Static226.method2967(this.anInt4683, this.anInt4643)) {
				if (this.aClass100_11 != null && this.aClass100_11.anInterface11_2 == null) {
					this.aBoolean331 = true;
				} else {
					if (!this.aBoolean330) {
						this.method3817();
					}
					this.anIntArray405 = null;
				}
			}
			if (this.anIntArray402 != null && !Static210.method2810(this.anInt4643, this.anInt4683)) {
				if (this.aClass100_11 != null && this.aClass100_11.anInterface11_2 == null) {
					this.aBoolean331 = true;
				} else {
					if (!this.aBoolean330) {
						this.method3817();
					}
					this.anIntArray402 = null;
				}
			}
			if (this.anIntArray401 != null && !Static27.method2044(this.anInt4643, this.anInt4683)) {
				if (this.aClass100_11 != null && this.aClass100_11.anInterface11_2 == null) {
					this.aBoolean331 = true;
				} else {
					if (!this.aBoolean330) {
						this.method3817();
					}
					this.anIntArray401 = null;
				}
			}
		}
		if (this.aShortArray48 != null && this.anIntArray405 == null && this.anIntArray402 == null && this.anIntArray401 == null) {
			this.anIntArray403 = null;
			this.aShortArray48 = null;
		}
		if (this.aByteArray54 != null && !Static244.method3100(this.anInt4683, this.anInt4643)) {
			if (this.aClass100_10 == null) {
				if (this.aClass100_9 != null && this.aClass100_9.anInterface11_2 == null) {
					this.aBoolean331 = true;
				} else {
					this.aShortArray42 = this.aShortArray47 = this.aShortArray46 = null;
					this.aByteArray54 = null;
				}
			} else if (this.aClass100_10.anInterface11_2 == null) {
				this.aBoolean331 = true;
			} else {
				this.aShortArray42 = this.aShortArray47 = this.aShortArray46 = null;
				this.aByteArray54 = null;
			}
		}
		if (this.aShortArray45 != null && !Static144.method2119(this.anInt4683, this.anInt4643)) {
			if (this.aClass100_9 != null && this.aClass100_9.anInterface11_2 == null) {
				this.aBoolean331 = true;
			} else {
				this.aShortArray45 = null;
			}
		}
		if (this.aByteArray55 != null && !Static283.method3768(this.anInt4643, this.anInt4683)) {
			if (this.aClass100_9 != null && this.aClass100_9.anInterface11_2 == null) {
				this.aBoolean331 = true;
			} else {
				this.aByteArray55 = null;
			}
		}
		if (this.aFloatArray24 != null && !Static382.method4910(this.anInt4643, this.anInt4683)) {
			if (this.aClass100_12 != null && this.aClass100_12.anInterface11_2 == null) {
				this.aBoolean331 = true;
			} else {
				this.aFloatArray24 = this.aFloatArray25 = null;
			}
		}
		if (this.aShortArray43 != null && !Static61.method905(this.anInt4683, this.anInt4643)) {
			if (this.aClass100_9 != null && this.aClass100_9.anInterface11_2 == null) {
				this.aBoolean331 = true;
			} else {
				this.aShortArray43 = null;
			}
		}
		if (this.aShortArray49 != null && !Static140.method2074(this.anInt4643, this.anInt4683)) {
			if (this.aClass73_1 != null && this.aClass73_1.anInterface5_2 == null || this.aClass100_9 != null && this.aClass100_9.anInterface11_2 == null) {
				this.aBoolean331 = true;
			} else {
				this.aShortArray49 = this.aShortArray41 = this.aShortArray50 = null;
			}
		}
		if (this.anIntArrayArray37 != null && !Static68.method4000(this.anInt4683, this.anInt4643)) {
			this.aShortArray51 = null;
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArrayArray35 != null && !Static58.method838(this.anInt4683, this.anInt4643)) {
			this.anIntArrayArray35 = null;
			this.aShortArray44 = null;
		}
		if (this.anIntArrayArray36 != null && !Static44.method4795(this.anInt4683, this.anInt4643)) {
			this.anIntArrayArray36 = null;
		}
		if (this.anIntArray404 != null && (this.anInt4683 & 0x800) == 0 && (this.anInt4683 & 0x40000) == 0) {
			this.anIntArray404 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4675; local7++) {
			local16 = this.aShortArray45[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			@Pc(63) int local63 = local16 & 0x7F;
			if (arg2 != -1) {
				local63 -= -(arg3 * (arg2 - local63) >> 7);
			}
			this.aShortArray45[local7] = (short) (local22 << 10 | local28 << 7 | local63);
		}
		if (this.aClass259Array1 != null) {
			for (local16 = 0; local16 < this.anInt4664; local16++) {
				@Pc(110) Class259 local110 = this.aClass259Array1[local16];
				@Pc(115) Class182 local115 = this.aClass182Array1[local16];
				local115.anInt4808 = Static237.anIntArray330[this.aShortArray45[local110.anInt7047] & 0xFFFF] & 0xFFFFFF | local115.anInt4808 & 0xFF000000;
			}
		}
		if (this.aClass100_9 != null) {
			this.aClass100_9.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "()Z")
	@Override
	public boolean method5752() {
		if (this.aShortArray43 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray43.length; local12++) {
			if (this.aShortArray43[local12] != -1 && !this.aClass163_Sub2_31.anInterface9_12.method1773(this.aShortArray43[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "()I")
	@Override
	public int k() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort48;
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
	private void method3819() {
		if (this.aClass259Array1 == null) {
			return;
		}
		@Pc(12) Class31_Sub2 local12 = this.aClass163_Sub2_31.aClass31_Sub2_2;
		@Pc(16) float local16 = this.aClass163_Sub2_31.aa();
		@Pc(20) float local20 = this.aClass163_Sub2_31.T();
		this.aClass163_Sub2_31.method4182();
		this.aClass163_Sub2_31.method5534(false);
		this.aClass163_Sub2_31.method4177(false);
		this.aClass163_Sub2_31.method4114(this.aClass163_Sub2_31.aClass100_13, null, null, this.aClass163_Sub2_31.aClass100_14);
		for (@Pc(49) int local49 = 0; local49 < this.anInt4664; local49++) {
			@Pc(56) Class259 local56 = this.aClass259Array1[local49];
			@Pc(61) Class182 local61 = this.aClass182Array1[local49];
			if (!local56.aBoolean510 || !this.aClass163_Sub2_31.method5555()) {
				@Pc(91) float local91 = (float) (this.anIntArray405[local56.anInt7046] + this.anIntArray405[local56.anInt7044] + this.anIntArray405[local56.anInt7048]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray402[local56.anInt7046] + this.anIntArray402[local56.anInt7044] + this.anIntArray402[local56.anInt7048]) * 0.3333333F;
				@Pc(134) float local134 = (float) (this.anIntArray401[local56.anInt7046] + this.anIntArray401[local56.anInt7044] + this.anIntArray401[local56.anInt7048]) * 0.3333333F;
				@Pc(148) float local148 = local112 * Static40.aFloat9 + Static281.aFloat55 * local91 + local134 * Static443.aFloat104 + Static97.aFloat17;
				@Pc(162) float local162 = Static375.aFloat98 + Static317.aFloat101 * local134 + local112 * Static115.aFloat20 + Static322.aFloat79 * local91;
				@Pc(176) float local176 = Static274.aFloat53 + local112 * Static112.aFloat41 + Static226.aFloat37 * local91 + local134 * Static47.aFloat10;
				local12.method4799(local148 + (float) local61.anInt4801, local61.anInt4807 * local56.aShort104 >> 7, -local176, (float) local61.anInt4806 - local162, local56.aShort102 * local61.anInt4804 >> 7, local61.anInt4803);
				this.aClass163_Sub2_31.method4144(local12);
				this.aClass163_Sub2_31.da(local20, local16 - (float) local56.anInt7045 * 1.5F);
				@Pc(230) int local230 = local61.anInt4808;
				OpenGL.glColor4ub((byte) (local230 >> 16), (byte) (local230 >> 8), (byte) local230, (byte) (local230 >> 24));
				this.aClass163_Sub2_31.method4139(local56.aShort103);
				this.aClass163_Sub2_31.method4174(local56.aByte97);
				this.aClass163_Sub2_31.method4107(local56.aByte98);
				this.aClass163_Sub2_31.method4103(4);
			}
		}
		this.aClass163_Sub2_31.da(local20, local16);
		this.aClass163_Sub2_31.method5534(true);
		this.aClass163_Sub2_31.method4112();
	}

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.anInt4683 = arg0;
		if (this.aClass87_1 != null && (this.anInt4683 & 0x10000) == 0) {
			this.aShortArray42 = this.aClass87_1.aShortArray6;
			this.aShortArray46 = this.aClass87_1.aShortArray7;
			this.aByteArray54 = this.aClass87_1.aByteArray17;
			this.aShortArray47 = this.aClass87_1.aShortArray8;
			this.aClass87_1 = null;
		}
		this.aBoolean331 = true;
		this.method3818();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
	private void method3821(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass100_9 != null && this.aClass100_9.anInterface11_2 == null;
		@Pc(27) boolean local27 = this.aClass100_10 != null && this.aClass100_10.anInterface11_2 == null;
		@Pc(38) boolean local38 = this.aClass100_11 != null && this.aClass100_11.anInterface11_2 == null;
		@Pc(49) boolean local49 = this.aClass100_12 != null && this.aClass100_12.anInterface11_2 == null;
		if (arg0) {
			local38 &= (this.aByte53 & 0x1) != 0;
			local16 &= (this.aByte53 & 0x2) != 0;
			local49 &= (this.aByte53 & 0x8) != 0;
			local27 &= (this.aByte53 & 0x4) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (local38) {
			local103 = 12;
		}
		@Pc(120) byte local120 = 0;
		if (local16) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local120 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3.aByteArray52.length < local103 * this.anInt4679) {
			this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3 = new Class2_Sub13_Sub1(local103 * (this.anInt4679 + 100));
		} else {
			this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3.anInt4347 = 0;
		}
		@Pc(202) Class2_Sub13_Sub1 local202 = this.aClass163_Sub2_31.aClass2_Sub13_Sub1_3;
		@Pc(210) int local210;
		@Pc(219) int local219;
		@Pc(247) int local247;
		@Pc(256) int local256;
		if (local38) {
			@Pc(226) int local226;
			@Pc(233) int local233;
			@Pc(238) int local238;
			@Pc(245) int local245;
			if (this.aClass163_Sub2_31.aBoolean374) {
				for (local210 = 0; local210 < this.anInt4677; local210++) {
					local219 = NativeStream.floatToRawIntBits((float) this.anIntArray405[local210]);
					local226 = NativeStream.floatToRawIntBits((float) this.anIntArray402[local210]);
					local233 = NativeStream.floatToRawIntBits((float) this.anIntArray401[local210]);
					local238 = this.anIntArray403[local210];
					local245 = this.anIntArray403[local210 + 1];
					for (local247 = local238; local247 < local245; local247++) {
						local256 = this.aShortArray48[local247] - 1;
						if (local256 == -1) {
							break;
						}
						local202.anInt4347 = local103 * local256;
						local202.method3569(local219);
						local202.method3569(local226);
						local202.method3569(local233);
					}
				}
			} else {
				for (local210 = 0; local210 < this.anInt4677; local210++) {
					local219 = NativeStream.floatToRawIntBits((float) this.anIntArray405[local210]);
					local226 = NativeStream.floatToRawIntBits((float) this.anIntArray402[local210]);
					local233 = NativeStream.floatToRawIntBits((float) this.anIntArray401[local210]);
					local238 = this.anIntArray403[local210];
					local245 = this.anIntArray403[local210 + 1];
					for (local247 = local238; local247 < local245; local247++) {
						local256 = this.aShortArray48[local247] - 1;
						if (local256 == -1) {
							break;
						}
						local202.anInt4347 = local256 * local103;
						local202.method3565(local219);
						local202.method3565(local226);
						local202.method3565(local233);
					}
				}
			}
		}
		@Pc(493) float local493;
		@Pc(385) short[] local385;
		@Pc(389) short[] local389;
		@Pc(393) short[] local393;
		@Pc(381) byte[] local381;
		@Pc(540) float local540;
		if (local16) {
			if (this.aClass100_10 == null) {
				if (this.aClass87_1 == null) {
					local389 = this.aShortArray47;
					local385 = this.aShortArray42;
					local393 = this.aShortArray46;
					local381 = this.aByteArray54;
				} else {
					local381 = this.aClass87_1.aByteArray17;
					local385 = this.aClass87_1.aShortArray6;
					local389 = this.aClass87_1.aShortArray8;
					local393 = this.aClass87_1.aShortArray7;
				}
				@Pc(413) float local413 = this.aClass163_Sub2_31.aFloatArray27[0];
				@Pc(419) float local419 = this.aClass163_Sub2_31.aFloatArray27[1];
				@Pc(425) float local425 = this.aClass163_Sub2_31.aFloatArray27[2];
				@Pc(429) float local429 = this.aClass163_Sub2_31.aFloat60;
				@Pc(439) float local439 = this.aClass163_Sub2_31.aFloat59 * 768.0F / (float) this.aShort49;
				@Pc(449) float local449 = this.aClass163_Sub2_31.aFloat58 * 768.0F / (float) this.aShort49;
				for (@Pc(451) int local451 = 0; local451 < this.anInt4675; local451++) {
					@Pc(471) int local471 = this.method3809(this.aShortArray45[local451], this.aShort56, this.aShortArray43[local451], this.aByteArray55[local451]);
					@Pc(482) float local482 = this.aClass163_Sub2_31.aFloat77 * (float) (local471 >> 8 & 0xFF);
					local493 = (float) (local471 >> 16 & 0xFF) * this.aClass163_Sub2_31.aFloat74;
					@Pc(498) short local498 = this.aShortArray49[local451];
					@Pc(507) float local507 = this.aClass163_Sub2_31.aFloat63 * (float) (local471 >>> 24);
					@Pc(512) short local512 = (short) local381[local498];
					if (local512 == 0) {
						local540 = (local419 * (float) local389[local498] + (float) local385[local498] * local413 + (float) local393[local498] * local425) * 0.0026041667F;
					} else {
						local540 = (local425 * (float) local393[local498] + (float) local385[local498] * local413 + (float) local389[local498] * local419) / (float) (local512 * 256);
					}
					@Pc(577) float local577 = local429 + local540 * (local540 < 0.0F ? local449 : local439);
					@Pc(582) int local582 = (int) (local507 * local577);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					@Pc(603) int local603 = (int) (local493 * local577);
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					@Pc(621) int local621 = (int) (local482 * local577);
					local202.anInt4347 = local103 * local498 + local107;
					if (local621 < 0) {
						local621 = 0;
					} else if (local621 > 255) {
						local621 = 255;
					}
					local202.method3602(local582);
					local202.method3602(local603);
					local202.method3602(local621);
					local202.method3602(255 - (this.aByteArray55[local451] & 0xFF));
					local498 = this.aShortArray41[local451];
					local512 = local381[local498];
					if (local512 == 0) {
						local540 = (local419 * (float) local389[local498] + (float) local385[local498] * local413 + local425 * (float) local393[local498]) * 0.0026041667F;
					} else {
						local540 = ((float) local389[local498] * local419 + (float) local385[local498] * local413 + (float) local393[local498] * local425) / (float) (local512 * 256);
					}
					local577 = local429 + (local540 < 0.0F ? local449 : local439) * local540;
					local582 = (int) (local577 * local507);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					local603 = (int) (local493 * local577);
					local621 = (int) (local482 * local577);
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local202.anInt4347 = local107 + local498 * local103;
					if (local621 < 0) {
						local621 = 0;
					} else if (local621 > 255) {
						local621 = 255;
					}
					local202.method3602(local582);
					local202.method3602(local603);
					local202.method3602(local621);
					local202.method3602(255 - (this.aByteArray55[local451] & 0xFF));
					local498 = this.aShortArray50[local451];
					local512 = local381[local498];
					if (local512 == 0) {
						local540 = (local425 * (float) local393[local498] + local419 * (float) local389[local498] + local413 * (float) local385[local498]) * 0.0026041667F;
					} else {
						local540 = (local413 * (float) local385[local498] + local419 * (float) local389[local498] + (float) local393[local498] * local425) / (float) (local512 * 256);
					}
					local577 = local429 + (local540 < 0.0F ? local449 : local439) * local540;
					local582 = (int) (local577 * local507);
					local603 = (int) (local577 * local493);
					if (local582 < 0) {
						local582 = 0;
					} else if (local582 > 255) {
						local582 = 255;
					}
					local621 = (int) (local577 * local482);
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local202.anInt4347 = local103 * local498 + local107;
					if (local621 < 0) {
						local621 = 0;
					} else if (local621 > 255) {
						local621 = 255;
					}
					local202.method3602(local582);
					local202.method3602(local603);
					local202.method3602(local621);
					local202.method3602(255 - (this.aByteArray55[local451] & 0xFF));
				}
			} else {
				for (local210 = 0; local210 < this.anInt4675; local210++) {
					local219 = this.method3809(this.aShortArray45[local210], this.aShort56, this.aShortArray43[local210], this.aByteArray55[local210]);
					local202.anInt4347 = local107 + local103 * this.aShortArray49[local210];
					local202.method3569(local219);
					local202.anInt4347 = local107 + this.aShortArray41[local210] * local103;
					local202.method3569(local219);
					local202.anInt4347 = local107 + local103 * this.aShortArray50[local210];
					local202.method3569(local219);
				}
			}
		}
		if (local27) {
			if (this.aClass87_1 == null) {
				local389 = this.aShortArray47;
				local393 = this.aShortArray46;
				local385 = this.aShortArray42;
				local381 = this.aByteArray54;
			} else {
				local389 = this.aClass87_1.aShortArray8;
				local393 = this.aClass87_1.aShortArray7;
				local381 = this.aClass87_1.aByteArray17;
				local385 = this.aClass87_1.aShortArray6;
			}
			@Pc(1116) float local1116 = 3.0F / (float) this.aShort49;
			local540 = 3.0F / (float) (this.aShort49 / 2 + this.aShort49);
			local202.anInt4347 = local109;
			if (this.aClass163_Sub2_31.aBoolean374) {
				for (local247 = 0; local247 < this.anInt4679; local247++) {
					local256 = local381[local247] & 0xFF;
					if (local256 == 0) {
						local202.method1353(local540 * (float) local385[local247]);
						local202.method1353((float) local389[local247] * local540);
						local202.method1353(local540 * (float) local393[local247]);
					} else {
						local493 = local1116 / (float) local256;
						local202.method1353(local493 * (float) local385[local247]);
						local202.method1353((float) local389[local247] * local493);
						local202.method1353(local493 * (float) local393[local247]);
					}
					local202.anInt4347 += local103 - 12;
				}
			} else {
				for (local247 = 0; local247 < this.anInt4679; local247++) {
					local256 = local381[local247] & 0xFF;
					if (local256 == 0) {
						local202.method1354((float) local385[local247] * local540);
						local202.method1354(local540 * (float) local389[local247]);
						local202.method1354((float) local393[local247] * local540);
					} else {
						local493 = local1116 / (float) local256;
						local202.method1354((float) local385[local247] * local493);
						local202.method1354(local493 * (float) local389[local247]);
						local202.method1354(local493 * (float) local393[local247]);
					}
					local202.anInt4347 += local103 - 12;
				}
			}
		}
		if (local49) {
			local202.anInt4347 = local120;
			if (this.aClass163_Sub2_31.aBoolean374) {
				for (local210 = 0; local210 < this.anInt4679; local210++) {
					local202.method1353(this.aFloatArray24[local210]);
					local202.method1353(this.aFloatArray25[local210]);
					local202.anInt4347 += local103 - 8;
				}
			} else {
				for (local210 = 0; local210 < this.anInt4679; local210++) {
					local202.method1354(this.aFloatArray24[local210]);
					local202.method1354(this.aFloatArray25[local210]);
					local202.anInt4347 += local103 - 8;
				}
			}
		}
		local202.anInt4347 = this.anInt4679 * local103;
		@Pc(1415) Interface11 local1415;
		if (arg0) {
			if (this.anInterface11_5 == null) {
				this.anInterface11_5 = this.aClass163_Sub2_31.method4124(local202.anInt4347, true, local103, local202.aByteArray52);
			} else {
				this.anInterface11_5.method1891(local202.anInt4347, local103, local202.aByteArray52);
			}
			local1415 = this.anInterface11_5;
			this.aByte53 = 0;
		} else {
			local1415 = this.aClass163_Sub2_31.method4124(local202.anInt4347, false, local103, local202.aByteArray52);
			this.aBoolean331 = true;
		}
		if (local38) {
			this.aClass100_11.anInterface11_2 = local1415;
			this.aClass100_11.aByte26 = 0;
		}
		if (local49) {
			this.aClass100_12.anInterface11_2 = local1415;
			this.aClass100_12.aByte26 = local120;
		}
		if (local16) {
			this.aClass100_9.aByte26 = local107;
			this.aClass100_9.anInterface11_2 = local1415;
		}
		if (local27) {
			this.aClass100_10.aByte26 = local109;
			this.aClass100_10.anInterface11_2 = local1415;
		}
	}

	@OriginalMember(owner = "client!oj", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return this.aShort49;
	}

	@OriginalMember(owner = "client!oj", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) Class162 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean330) {
			this.method3817();
		}
		@Pc(16) int local16 = arg4 + this.aShort50;
		@Pc(21) int local21 = this.aShort52 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort55;
		@Pc(32) int local32 = this.aShort53 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt4134 >> arg2.anInt4139 >= arg2.anInt4138 || local27 < 0 || arg2.anInt4137 <= local32 + arg2.anInt4134 >> arg2.anInt4139)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt4134 >> arg3.anInt4139 >= arg3.anInt4138 || local27 < 0 || local32 + arg3.anInt4134 >> arg3.anInt4139 >= arg3.anInt4137) {
				return;
			}
		} else {
			local16 >>= arg2.anInt4139;
			local21 = arg2.anInt4134 + local21 - 1 >> arg2.anInt4139;
			local27 >>= arg2.anInt4139;
			local32 = arg2.anInt4134 + local32 - 1 >> arg2.anInt4139;
			if (arg5 == arg2.ua(local16, local27) && arg2.ua(local21, local27) == arg5 && arg2.ua(local16, local32) == arg5 && arg2.ua(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(268) int local268;
		if (arg0 == 1) {
			for (local268 = 0; local268 < this.anInt4677; local268++) {
				this.anIntArray402[local268] -= arg5 - arg2.ca(arg4 + this.anIntArray405[local268], this.anIntArray401[local268] + arg6);
			}
		} else {
			@Pc(203) int local203;
			@Pc(214) int local214;
			if (arg0 == 2) {
				@Pc(198) short local198 = this.aShort51;
				if (local198 == 0) {
					return;
				}
				for (local203 = 0; local203 < this.anInt4677; local203++) {
					local214 = (this.anIntArray402[local203] << 16) / local198;
					if (arg1 > local214) {
						this.anIntArray402[local203] -= -((arg2.ca(this.anIntArray405[local203] + arg4, this.anIntArray401[local203] + arg6) - arg5) * (-local214 + arg1) / arg1);
					}
				}
			} else {
				@Pc(292) int local292;
				if (arg0 == 3) {
					local268 = (arg1 & 0xFF) * 4;
					local203 = (arg1 >> 8 & 0xFF) * 4;
					local214 = (arg1 >> 16 & 0xFF) << 6;
					local292 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local268 >> 1) < 0 || arg2.anInt4138 << arg2.anInt4139 <= arg4 + (local268 >> 1) + arg2.anInt4134 || arg6 - (local203 >> 1) < 0 || arg2.anInt4137 << arg2.anInt4139 <= arg6 + (local203 >> 1) + arg2.anInt4134) {
						return;
					}
					this.method5741(arg6, local292, arg5, local214, local268, local203, arg2, arg4);
				} else if (arg0 == 4) {
					local268 = this.aShort54 - this.aShort51;
					for (local203 = 0; local203 < this.anInt4677; local203++) {
						this.anIntArray402[local203] = local268 + this.anIntArray402[local203] + arg3.ca(arg4 + this.anIntArray405[local203], arg6 + this.anIntArray401[local203]) - arg5;
					}
				} else if (arg0 == 5) {
					local268 = this.aShort54 - this.aShort51;
					for (local203 = 0; local203 < this.anInt4677; local203++) {
						local214 = this.anIntArray405[local203] + arg4;
						local292 = arg6 + this.anIntArray401[local203];
						@Pc(395) int local395 = arg2.ca(local214, local292);
						@Pc(400) int local400 = arg3.ca(local214, local292);
						@Pc(405) int local405 = local395 - local400;
						this.anIntArray402[local203] = local395 + (local405 * ((this.anIntArray402[local203] << 8) / local268) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass100_11 != null) {
			this.aClass100_11.anInterface11_2 = null;
		}
		this.aBoolean330 = false;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "()[Lclient!mf;")
	@Override
	public Class155[] method5742() {
		return this.aClass155Array1;
	}

	@OriginalMember(owner = "client!oj", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort55;
	}

	@OriginalMember(owner = "client!oj", name = "MA", descriptor = "()I")
	@Override
	public int MA() {
		if (!this.aBoolean330) {
			this.method3817();
		}
		return this.aShort52;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "()[Lclient!qe;")
	@Override
	public Class199[] method5749() {
		return this.aClass199Array1;
	}

	@OriginalMember(owner = "client!oj", name = "aa", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			local24 = 0;
			Static310.anInt5369 = 0;
			Static400.anInt6546 = 0;
			Static232.anInt3746 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray35.length) {
					local48 = this.anIntArrayArray35[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray44 == null || (this.aShortArray44[local56] & arg6) != 0) {
							Static232.anInt3746 += this.anIntArray405[local56];
							Static310.anInt5369 += this.anIntArray402[local56];
							local24++;
							Static400.anInt6546 += this.anIntArray401[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static400.anInt6546 = arg4 + Static400.anInt6546 / local24;
				Static232.anInt3746 = Static232.anInt3746 / local24 + arg2;
				Static310.anInt5369 = Static310.anInt5369 / local24 + arg3;
				Static121.aBoolean149 = true;
			} else {
				Static310.anInt5369 = arg3;
				Static400.anInt6546 = arg4;
				Static232.anInt3746 = arg2;
			}
			return;
		}
		@Pc(252) int[] local252;
		@Pc(254) int local254;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[0] * arg2 + arg3 * arg7[1] + arg4 * arg7[2] + 16384 >> 15;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 16384 >> 15;
				local38 = arg4 * arg7[8] + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
				arg4 = local38;
				arg2 = local24;
				arg3 = local32;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray35.length) {
					local252 = this.anIntArrayArray35[local32];
					for (local254 = 0; local254 < local252.length; local254++) {
						local50 = local252[local254];
						if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local50]) != 0) {
							this.anIntArray405[local50] += arg2;
							this.anIntArray402[local50] += arg3;
							this.anIntArray401[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(390) int local390;
		@Pc(408) int local408;
		@Pc(638) int local638;
		@Pc(647) int local647;
		@Pc(656) int local656;
		@Pc(660) int local660;
		@Pc(678) int local678;
		@Pc(1019) int local1019;
		@Pc(1027) int local1027;
		@Pc(1181) int local1181;
		@Pc(1208) int local1208;
		@Pc(1212) int local1212;
		@Pc(1221) int local1221;
		@Pc(1226) int local1226;
		@Pc(1230) int local1230;
		@Pc(1234) int local1234;
		@Pc(1236) int local1236;
		@Pc(1361) int[] local1361;
		@Pc(1363) int local1363;
		@Pc(1367) int local1367;
		@Pc(1371) int local1371;
		@Pc(1373) int local1373;
		@Pc(1502) int local1502;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray35.length > local32) {
						local252 = this.anIntArrayArray35[local32];
						for (local254 = 0; local254 < local252.length; local254++) {
							local50 = local252[local254];
							if (this.aShortArray44 == null || (this.aShortArray44[local50] & arg6) != 0) {
								this.anIntArray405[local50] -= Static232.anInt3746;
								this.anIntArray402[local50] -= Static310.anInt5369;
								this.anIntArray401[local50] -= Static400.anInt6546;
								if (arg4 != 0) {
									local56 = Class155.anIntArray342[arg4];
									local390 = Class155.anIntArray341[arg4];
									local408 = this.anIntArray405[local50] * local390 + local56 * this.anIntArray402[local50] + 32767 >> 15;
									this.anIntArray402[local50] = local390 * this.anIntArray402[local50] + 32767 - this.anIntArray405[local50] * local56 >> 15;
									this.anIntArray405[local50] = local408;
								}
								if (arg2 != 0) {
									local56 = Class155.anIntArray342[arg2];
									local390 = Class155.anIntArray341[arg2];
									local408 = this.anIntArray402[local50] * local390 + 32767 - local56 * this.anIntArray401[local50] >> 15;
									this.anIntArray401[local50] = this.anIntArray401[local50] * local390 + this.anIntArray402[local50] * local56 + 32767 >> 15;
									this.anIntArray402[local50] = local408;
								}
								if (arg3 != 0) {
									local56 = Class155.anIntArray342[arg3];
									local390 = Class155.anIntArray341[arg3];
									local408 = local56 * this.anIntArray401[local50] + this.anIntArray405[local50] * local390 + 32767 >> 15;
									this.anIntArray401[local50] = local390 * this.anIntArray401[local50] + 32767 - local56 * this.anIntArray405[local50] >> 15;
									this.anIntArray405[local50] = local408;
								}
								this.anIntArray405[local50] += Static232.anInt3746;
								this.anIntArray402[local50] += Static310.anInt5369;
								this.anIntArray401[local50] += Static400.anInt6546;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray35.length > local38) {
							local48 = this.anIntArrayArray35[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray44 == null || (this.aShortArray44[local56] & arg6) != 0) {
									local390 = this.anIntArray403[local56];
									local408 = this.anIntArray403[local56 + 1];
									for (local638 = local390; local638 < local408; local638++) {
										local647 = this.aShortArray48[local638] - 1;
										if (local647 == -1) {
											break;
										}
										if (arg4 != 0) {
											local656 = Class155.anIntArray342[arg4];
											local660 = Class155.anIntArray341[arg4];
											local678 = this.aShortArray42[local647] * local660 + this.aShortArray47[local647] * local656 + 32767 >> 15;
											this.aShortArray47[local647] = (short) (this.aShortArray47[local647] * local660 + 32767 - local656 * this.aShortArray42[local647] >> 15);
											this.aShortArray42[local647] = (short) local678;
										}
										if (arg2 != 0) {
											local656 = Class155.anIntArray342[arg2];
											local660 = Class155.anIntArray341[arg2];
											local678 = this.aShortArray47[local647] * local660 + 32767 - local656 * this.aShortArray46[local647] >> 15;
											this.aShortArray46[local647] = (short) (local656 * this.aShortArray47[local647] + this.aShortArray46[local647] * local660 + 32767 >> 15);
											this.aShortArray47[local647] = (short) local678;
										}
										if (arg3 != 0) {
											local656 = Class155.anIntArray342[arg3];
											local660 = Class155.anIntArray341[arg3];
											local678 = this.aShortArray46[local647] * local656 + this.aShortArray42[local647] * local660 + 32767 >> 15;
											this.aShortArray46[local647] = (short) (local660 * this.aShortArray46[local647] + 32767 - this.aShortArray42[local647] * local656 >> 15);
											this.aShortArray42[local647] = (short) local678;
										}
									}
								}
							}
						}
					}
					if (this.aClass100_10 == null && this.aClass100_9 != null) {
						this.aClass100_9.anInterface11_2 = null;
					}
					if (this.aClass100_10 != null) {
						this.aClass100_10.anInterface11_2 = null;
						return;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local254 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static121.aBoolean149) {
					local390 = arg7[3] * Static310.anInt5369 + arg7[0] * Static232.anInt3746 + arg7[6] * Static400.anInt6546 + 16384 >> 15;
					local408 = arg7[7] * Static400.anInt6546 + Static310.anInt5369 * arg7[4] + arg7[1] * Static232.anInt3746 + 16384 >> 15;
					local408 += local50;
					local390 += local254;
					local638 = arg7[5] * Static310.anInt5369 + Static232.anInt3746 * arg7[2] + arg7[8] * Static400.anInt6546 + 16384 >> 15;
					Static232.anInt3746 = local390;
					local638 += local56;
					Static310.anInt5369 = local408;
					Static121.aBoolean149 = false;
					Static400.anInt6546 = local638;
				}
				@Pc(987) int[] local987 = new int[9];
				local408 = Class155.anIntArray341[arg2];
				local638 = Class155.anIntArray342[arg2];
				local647 = Class155.anIntArray341[arg3];
				local656 = Class155.anIntArray342[arg3];
				local660 = Class155.anIntArray341[arg4];
				local678 = Class155.anIntArray342[arg4];
				local1019 = local660 * local638 + 16384 >> 15;
				local1027 = local678 * local638 + 16384 >> 15;
				local987[5] = -local638;
				local987[6] = -local656 * local660 + local647 * local1027 + 16384 >> 15;
				local987[2] = local408 * local656 + 16384 >> 15;
				local987[0] = local1027 * local656 + local660 * local647 + 16384 >> 15;
				local987[3] = local678 * local408 + 16384 >> 15;
				local987[4] = local408 * local660 + 16384 >> 15;
				local987[1] = local1019 * local656 + local678 * -local647 + 16384 >> 15;
				local987[7] = local647 * local1019 + local656 * local678 + 16384 >> 15;
				local987[8] = local408 * local647 + 16384 >> 15;
				@Pc(1155) int local1155 = local987[2] * -Static400.anInt6546 + local987[1] * -Static310.anInt5369 + local987[0] * -Static232.anInt3746 + 16384 >> 15;
				local1181 = -Static310.anInt5369 * local987[4] + local987[3] * -Static232.anInt3746 + local987[5] * -Static400.anInt6546 + 16384 >> 15;
				local1208 = local987[6] * -Static232.anInt3746 + local987[7] * -Static310.anInt5369 + local987[8] * -Static400.anInt6546 + 16384 >> 15;
				local1212 = local1155 + Static232.anInt3746;
				@Pc(1217) int local1217 = local1181 + Static310.anInt5369;
				local1221 = Static400.anInt6546 + local1208;
				@Pc(1224) int[] local1224 = new int[9];
				for (local1226 = 0; local1226 < 3; local1226++) {
					for (local1230 = 0; local1230 < 3; local1230++) {
						local1234 = 0;
						for (local1236 = 0; local1236 < 3; local1236++) {
							local1234 += arg7[local1236 + local1230 * 3] * local987[local1236 + local1226 * 3];
						}
						local1224[local1230 + local1226 * 3] = local1234 + 16384 >> 15;
					}
				}
				local1230 = local50 * local987[1] + local987[0] * local254 + local987[2] * local56 + 16384 >> 15;
				local1234 = local987[4] * local50 + local254 * local987[3] + local987[5] * local56 + 16384 >> 15;
				local1236 = local56 * local987[8] + local987[7] * local50 + local254 * local987[6] + 16384 >> 15;
				local1230 += local1212;
				local1234 += local1217;
				local1236 += local1221;
				local1361 = new int[9];
				for (local1363 = 0; local1363 < 3; local1363++) {
					for (local1367 = 0; local1367 < 3; local1367++) {
						local1371 = 0;
						for (local1373 = 0; local1373 < 3; local1373++) {
							local1371 += local1224[local1373 * 3 + local1367] * arg7[local1363 * 3 + local1373];
						}
						local1361[local1363 * 3 + local1367] = local1371 + 16384 >> 15;
					}
				}
				local1367 = local1230 * arg7[0] + arg7[1] * local1234 + arg7[2] * local1236 + 16384 >> 15;
				local1371 = local1236 * arg7[5] + local1230 * arg7[3] + local1234 * arg7[4] + 16384 >> 15;
				local1371 += local32;
				local1373 = local1236 * arg7[8] + arg7[6] * local1230 + arg7[7] * local1234 + 16384 >> 15;
				local1367 += local24;
				local1373 += local38;
				for (local1502 = 0; local1502 < local8; local1502++) {
					@Pc(1508) int local1508 = arg1[local1502];
					if (local1508 < this.anIntArrayArray35.length) {
						@Pc(1518) int[] local1518 = this.anIntArrayArray35[local1508];
						for (@Pc(1520) int local1520 = 0; local1520 < local1518.length; local1520++) {
							@Pc(1526) int local1526 = local1518[local1520];
							if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local1526]) != 0) {
								@Pc(1570) int local1570 = local1361[2] * this.anIntArray401[local1526] + local1361[1] * this.anIntArray402[local1526] + this.anIntArray405[local1526] * local1361[0] + 16384 >> 15;
								@Pc(1601) int local1601 = this.anIntArray405[local1526] * local1361[3] + this.anIntArray402[local1526] * local1361[4] + this.anIntArray401[local1526] * local1361[5] + 16384 >> 15;
								@Pc(1632) int local1632 = this.anIntArray402[local1526] * local1361[7] + local1361[6] * this.anIntArray405[local1526] + this.anIntArray401[local1526] * local1361[8] + 16384 >> 15;
								@Pc(1636) int local1636 = local1601 + local1371;
								@Pc(1640) int local1640 = local1570 + local1367;
								@Pc(1644) int local1644 = local1632 + local1373;
								this.anIntArray405[local1526] = local1640;
								this.anIntArray402[local1526] = local1636;
								this.anIntArray401[local1526] = local1644;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2573) Class259 local2573;
			@Pc(2578) Class182 local2578;
			if (arg0 == 5) {
				if (this.anIntArrayArray37 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray37.length > local32) {
							local252 = this.anIntArrayArray37[local32];
							for (local254 = 0; local254 < local252.length; local254++) {
								local50 = local252[local254];
								if (this.aShortArray51 == null || (arg6 & this.aShortArray51[local50]) != 0) {
									local56 = (this.aByteArray55[local50] & 0xFF) + arg2 * 8;
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray55[local50] = (byte) local56;
									if (this.aClass100_9 != null) {
										this.aClass100_9.anInterface11_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass259Array1 != null) {
						for (local32 = 0; local32 < this.anInt4664; local32++) {
							local2573 = this.aClass259Array1[local32];
							local2578 = this.aClass182Array1[local32];
							local2578.anInt4808 = 255 - (this.aByteArray55[local2573.anInt7047] & 0xFF) << 24 | local2578.anInt4808 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2841) Class182 local2841;
				if (arg0 == 8) {
					if (this.anIntArrayArray36 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray36.length > local32) {
								local252 = this.anIntArrayArray36[local32];
								for (local254 = 0; local254 < local252.length; local254++) {
									local2841 = this.aClass182Array1[local252[local254]];
									local2841.anInt4801 += arg2;
									local2841.anInt4806 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray36 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray36.length > local32) {
								local252 = this.anIntArrayArray36[local32];
								for (local254 = 0; local254 < local252.length; local254++) {
									local2841 = this.aClass182Array1[local252[local254]];
									local2841.anInt4804 = local2841.anInt4804 * arg3 >> 7;
									local2841.anInt4807 = local2841.anInt4807 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray36 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray36.length) {
							local252 = this.anIntArrayArray36[local32];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2841 = this.aClass182Array1[local252[local254]];
								local2841.anInt4803 = arg2 + local2841.anInt4803 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray37 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray37.length) {
						local252 = this.anIntArrayArray37[local32];
						for (local254 = 0; local254 < local252.length; local254++) {
							local50 = local252[local254];
							if (this.aShortArray51 == null || (arg6 & this.aShortArray51[local50]) != 0) {
								local56 = this.aShortArray45[local50] & 0xFFFF;
								local390 = local56 >> 10 & 0x3F;
								local408 = local56 >> 7 & 0x7;
								@Pc(2682) int local2682 = local390 + arg2 & 0x3F;
								local408 += arg3 / 4;
								local638 = local56 & 0x7F;
								local638 += arg4;
								if (local408 < 0) {
									local408 = 0;
								} else if (local408 > 7) {
									local408 = 7;
								}
								if (local638 < 0) {
									local638 = 0;
								} else if (local638 > 127) {
									local638 = 127;
								}
								this.aShortArray45[local50] = (short) (local638 | local408 << 7 | local2682 << 10);
								if (this.aClass100_9 != null) {
									this.aClass100_9.anInterface11_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass259Array1 != null) {
					for (local32 = 0; local32 < this.anInt4664; local32++) {
						local2573 = this.aClass259Array1[local32];
						local2578 = this.aClass182Array1[local32];
						local2578.anInt4808 = local2578.anInt4808 & 0xFF000000 | Static237.anIntArray330[this.aShortArray45[local2573.anInt7047] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray35.length > local32) {
					local252 = this.anIntArrayArray35[local32];
					for (local254 = 0; local254 < local252.length; local254++) {
						local50 = local252[local254];
						if (this.aShortArray44 == null || (arg6 & this.aShortArray44[local50]) != 0) {
							this.anIntArray405[local50] -= Static232.anInt3746;
							this.anIntArray402[local50] -= Static310.anInt5369;
							this.anIntArray401[local50] -= Static400.anInt6546;
							this.anIntArray405[local50] = arg2 * this.anIntArray405[local50] >> 7;
							this.anIntArray402[local50] = arg3 * this.anIntArray402[local50] >> 7;
							this.anIntArray401[local50] = arg4 * this.anIntArray401[local50] >> 7;
							this.anIntArray405[local50] += Static232.anInt3746;
							this.anIntArray402[local50] += Static310.anInt5369;
							this.anIntArray401[local50] += Static400.anInt6546;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local254 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static121.aBoolean149) {
				local390 = arg7[6] * Static400.anInt6546 + arg7[3] * Static310.anInt5369 + arg7[0] * Static232.anInt3746 + 16384 >> 15;
				local408 = Static232.anInt3746 * arg7[1] + arg7[4] * Static310.anInt5369 + arg7[7] * Static400.anInt6546 + 16384 >> 15;
				local408 += local50;
				local390 += local254;
				local638 = arg7[8] * Static400.anInt6546 + arg7[2] * Static232.anInt3746 + arg7[5] * Static310.anInt5369 + 16384 >> 15;
				local638 += local56;
				Static232.anInt3746 = local390;
				Static310.anInt5369 = local408;
				Static121.aBoolean149 = false;
				Static400.anInt6546 = local638;
			}
			local390 = arg2 << 15 >> 7;
			local408 = arg3 << 15 >> 7;
			local638 = arg4 << 15 >> 7;
			local647 = local390 * -Static232.anInt3746 + 16384 >> 15;
			local656 = -Static310.anInt5369 * local408 + 16384 >> 15;
			local660 = local638 * -Static400.anInt6546 + 16384 >> 15;
			local678 = Static232.anInt3746 + local647;
			local1019 = local656 + Static310.anInt5369;
			local1027 = Static400.anInt6546 + local660;
			@Pc(1999) int[] local1999 = new int[] { local390 * arg7[0] + 16384 >> 15, arg7[3] * local390 + 16384 >> 15, local390 * arg7[6] + 16384 >> 15, local408 * arg7[1] + 16384 >> 15, local408 * arg7[4] + 16384 >> 15, local408 * arg7[7] + 16384 >> 15, arg7[2] * local638 + 16384 >> 15, arg7[5] * local638 + 16384 >> 15, arg7[8] * local638 + 16384 >> 15 };
			local1181 = local254 * local390 + 16384 >> 15;
			local1208 = local50 * local408 + 16384 >> 15;
			local1212 = local56 * local638 + 16384 >> 15;
			@Pc(2135) int local2135 = local1208 + local1019;
			@Pc(2139) int local2139 = local1181 + local678;
			@Pc(2143) int local2143 = local1212 + local1027;
			@Pc(2146) int[] local2146 = new int[9];
			@Pc(2152) int local2152;
			for (local1221 = 0; local1221 < 3; local1221++) {
				for (local2152 = 0; local2152 < 3; local2152++) {
					local1226 = 0;
					for (local1230 = 0; local1230 < 3; local1230++) {
						local1226 += local1999[local2152 + local1230 * 3] * arg7[local1230 + local1221 * 3];
					}
					local2146[local1221 * 3 + local2152] = local1226 + 16384 >> 15;
				}
			}
			local2152 = local2143 * arg7[2] + arg7[0] * local2139 + arg7[1] * local2135 + 16384 >> 15;
			local1226 = local2135 * arg7[4] + local2139 * arg7[3] + local2143 * arg7[5] + 16384 >> 15;
			local1230 = local2143 * arg7[8] + local2139 * arg7[6] + arg7[7] * local2135 + 16384 >> 15;
			local2152 += local24;
			local1226 += local32;
			local1230 += local38;
			for (local1234 = 0; local1234 < local8; local1234++) {
				local1236 = arg1[local1234];
				if (local1236 < this.anIntArrayArray35.length) {
					local1361 = this.anIntArrayArray35[local1236];
					for (local1363 = 0; local1363 < local1361.length; local1363++) {
						local1367 = local1361[local1363];
						if (this.aShortArray44 == null || (this.aShortArray44[local1367] & arg6) != 0) {
							local1371 = this.anIntArray402[local1367] * local2146[1] + this.anIntArray405[local1367] * local2146[0] + local2146[2] * this.anIntArray401[local1367] + 16384 >> 15;
							local1373 = local2146[5] * this.anIntArray401[local1367] + this.anIntArray402[local1367] * local2146[4] + this.anIntArray405[local1367] * local2146[3] + 16384 >> 15;
							@Pc(2385) int local2385 = local1373 + local1226;
							local1502 = this.anIntArray401[local1367] * local2146[8] + this.anIntArray405[local1367] * local2146[6] + this.anIntArray402[local1367] * local2146[7] + 16384 >> 15;
							@Pc(2420) int local2420 = local1371 + local2152;
							@Pc(2424) int local2424 = local1502 + local1230;
							this.anIntArray405[local1367] = local2420;
							this.anIntArray402[local1367] = local2385;
							this.anIntArray401[local1367] = local2424;
						}
					}
				}
			}
		}
	}
}
