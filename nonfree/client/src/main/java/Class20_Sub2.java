import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "B")
	private byte aByte49;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "[Lclient!qfa;")
	private Class269[] aClass269Array1;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "Lclient!nr;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!mo", name = "E", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!mo", name = "G", descriptor = "[Lclient!fd;")
	private Class90[] aClass90Array4;

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!mo", name = "U", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!mo", name = "Z", descriptor = "I")
	private int anInt5758;

	@OriginalMember(owner = "client!mo", name = "bb", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!mo", name = "cb", descriptor = "[Lclient!et;")
	private Class85[] aClass85Array4;

	@OriginalMember(owner = "client!mo", name = "eb", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!mo", name = "nb", descriptor = "[Lclient!du;")
	private Class75[] aClass75Array1;

	@OriginalMember(owner = "client!mo", name = "ob", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!mo", name = "pb", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!mo", name = "qb", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!mo", name = "vb", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!mo", name = "Bb", descriptor = "[F")
	private float[] aFloatArray48;

	@OriginalMember(owner = "client!mo", name = "Fb", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!mo", name = "Hb", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!mo", name = "Ob", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!mo", name = "Qb", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!mo", name = "Sb", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!mo", name = "Tb", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!mo", name = "Vb", descriptor = "[F")
	private float[] aFloatArray49;

	@OriginalMember(owner = "client!mo", name = "Xb", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!mo", name = "Yb", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!mo", name = "Zb", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!mo", name = "ac", descriptor = "Lclient!wb;")
	private Interface24 anInterface24_3;

	@OriginalMember(owner = "client!mo", name = "cc", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!mo", name = "ec", descriptor = "I")
	private int anInt5789;

	@OriginalMember(owner = "client!mo", name = "gc", descriptor = "Lclient!ad;")
	private Interface1 anInterface1_4;

	@OriginalMember(owner = "client!mo", name = "jc", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!mo", name = "mc", descriptor = "I")
	private int anInt5795;

	@OriginalMember(owner = "client!mo", name = "pc", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
	private int anInt5753 = 0;

	@OriginalMember(owner = "client!mo", name = "yb", descriptor = "Z")
	private boolean aBoolean405 = true;

	@OriginalMember(owner = "client!mo", name = "Cb", descriptor = "I")
	private int anInt5776 = 0;

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
	private int anInt5750 = 0;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!mo", name = "jb", descriptor = "I")
	private int anInt5765 = 0;

	@OriginalMember(owner = "client!mo", name = "Nb", descriptor = "I")
	private int anInt5784 = 0;

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_27;

	@OriginalMember(owner = "client!mo", name = "R", descriptor = "Lclient!ce;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!mo", name = "Jb", descriptor = "Lclient!ce;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!mo", name = "lb", descriptor = "Lclient!ce;")
	private Class45 lb;

	@OriginalMember(owner = "client!mo", name = "Ub", descriptor = "Lclient!ce;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!mo", name = "Pb", descriptor = "Lclient!gw;")
	private Class122 aClass122_1;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class20_Sub2(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aClass14_Sub3_27 = arg0;
		this.aClass45_3 = new Class45(null, 5126, 3, 0);
		this.aClass45_4 = new Class45(null, 5126, 2, 0);
		this.lb = new Class45(null, 5126, 3, 0);
		this.aClass45_5 = new Class45(null, 5121, 4, 0);
		this.aClass122_1 = new Class122();
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!jaa;Lclient!nj;IIII)V")
	public Class20_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5789 = arg2;
		this.aClass14_Sub3_27 = arg0;
		this.anInt5758 = arg5;
		if (Static493.method6727(arg2, arg5)) {
			this.aClass45_3 = new Class45(null, 5126, 3, 0);
		}
		if (Static31.method4023(arg2, arg5)) {
			this.aClass45_4 = new Class45(null, 5126, 2, 0);
		}
		if (Static481.method6626(arg5, arg2)) {
			this.lb = new Class45(null, 5126, 3, 0);
		}
		if (Static441.method6277(arg2, arg5)) {
			this.aClass45_5 = new Class45(null, 5121, 4, 0);
		}
		if (Static289.method4659(arg2, arg5)) {
			this.aClass122_1 = new Class122();
		}
		@Pc(102) Interface4 local102 = arg0.anInterface4_15;
		@Pc(106) int[] local106 = new int[arg1.anInt6188];
		this.anIntArray432 = new int[arg1.anInt6186 + 1];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt6188; local115++) {
			if ((arg1.aByteArray75 == null || arg1.aByteArray75[local115] != 2) && (arg1.aShortArray72 == null || arg1.aShortArray72[local115] == -1 || !local102.method4234(arg1.aShortArray72[local115] & 0xFFFF).aBoolean592)) {
				local106[this.anInt5776++] = local115;
				this.anIntArray432[arg1.aShortArray68[local115]]++;
				this.anIntArray432[arg1.aShortArray75[local115]]++;
				this.anIntArray432[arg1.aShortArray77[local115]]++;
			}
		}
		this.anInt5750 = this.anInt5776;
		@Pc(202) long[] local202 = new long[this.anInt5776];
		@Pc(214) boolean local214 = (this.anInt5789 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(369) int local369;
		label495: for (@Pc(216) int local216 = 0; local216 < this.anInt5776; local216++) {
			@Pc(222) int local222 = local106[local216];
			@Pc(224) Class313 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass265Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass265Array1.length; local237++) {
					@Pc(244) Class265 local244 = arg1.aClass265Array1[local237];
					if (local222 == local244.anInt7251) {
						@Pc(253) Class97 local253 = Static154.method2911(local244.anInt7256);
						if (local253.aBoolean229) {
							local202[local216] = Long.MAX_VALUE;
							this.anInt5750--;
							continue label495;
						}
					}
				}
			}
			@Pc(276) short local276 = -1;
			if (arg1.aShortArray72 != null) {
				local276 = arg1.aShortArray72[local222];
				if (local276 != -1) {
					local224 = local102.method4234(local276 & 0xFFFF);
					local230 = local224.aByte98;
					local232 = local224.aByte99;
				}
			}
			@Pc(325) boolean local325 = arg1.aByteArray76 != null && arg1.aByteArray76[local222] != 0 || local224 != null && local224.aBoolean596 | !local224.aBoolean590;
			if ((local214 || local325) && arg1.aByteArray70 != null) {
				local226 += arg1.aByteArray70[local222] << 17;
			}
			if (local325) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local226 += local232 & 0xFF;
			local369 = local228 + ((local276 & 0xFFFF) << 16);
			@Pc(375) int local375 = local369 + (local216 & 0xFFFF);
			local202[local216] = ((long) local226 << 32) + ((long) local375);
		}
		Static400.method5854(local106, local202);
		this.anIntArray433 = arg1.anIntArray455;
		this.anInt5753 = arg1.anInt6195;
		this.anInt5765 = arg1.anInt6186;
		this.anIntArray429 = arg1.anIntArray454;
		this.aShortArray59 = arg1.aShortArray70;
		this.anIntArray430 = arg1.anIntArray456;
		this.aClass90Array4 = arg1.aClass90Array5;
		this.aClass85Array4 = arg1.aClass85Array5;
		@Pc(431) Class67[] local431 = new Class67[this.anInt5765];
		@Pc(451) int local451;
		@Pc(465) int local465;
		if (arg1.aClass265Array1 != null) {
			this.anInt5795 = arg1.aClass265Array1.length;
			this.aClass75Array1 = new Class75[this.anInt5795];
			this.aClass269Array1 = new Class269[this.anInt5795];
			for (local451 = 0; local451 < this.anInt5795; local451++) {
				@Pc(458) Class265 local458 = arg1.aClass265Array1[local451];
				@Pc(463) Class97 local463 = Static154.method2911(local458.anInt7256);
				local465 = -1;
				for (@Pc(467) int local467 = 0; local467 < this.anInt5776; local467++) {
					if (local106[local467] == local458.anInt7251) {
						local465 = local467;
						break;
					}
				}
				if (local465 == -1) {
					throw new RuntimeException();
				}
				local237 = Static171.anIntArray212[arg1.aShortArray71[local458.anInt7251] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray76 == null ? 0 : arg1.aByteArray76[local458.anInt7251]) << 24;
				this.aClass75Array1[local451] = new Class75(local465, arg1.aShortArray68[local458.anInt7251], arg1.aShortArray75[local458.anInt7251], arg1.aShortArray77[local458.anInt7251], local463.anInt3123, local463.anInt3116, local463.anInt3120, local463.anInt3122, local463.anInt3119, local463.aBoolean229, local463.aBoolean230, local458.anInt7249);
				this.aClass269Array1[local451] = new Class269(local237);
			}
		}
		local451 = this.anInt5776 * 3;
		this.aShortArray57 = new short[local451];
		this.aShortArray67 = new short[local451];
		this.aShortArray63 = new short[this.anInt5776];
		this.aByteArray68 = new byte[local451];
		this.aShortArray65 = new short[this.anInt5776];
		this.aShort74 = (short) arg3;
		this.aShort69 = (short) arg4;
		this.aShortArray64 = new short[this.anInt5776];
		this.aFloatArray48 = new float[local451];
		this.aShortArray62 = new short[local451];
		this.aShortArray61 = new short[local451];
		this.aByteArray67 = new byte[this.anInt5776];
		if (arg1.aShortArray74 != null) {
			this.aShortArray66 = new short[this.anInt5776];
		}
		Static399.aLongArray13 = new long[local451];
		this.aFloatArray49 = new float[local451];
		this.aShortArray58 = new short[this.anInt5776];
		this.aShortArray60 = new short[this.anInt5776];
		local226 = 0;
		for (local369 = 0; local369 < arg1.anInt6186; local369++) {
			local465 = this.anIntArray432[local369];
			this.anIntArray432[local369] = local226;
			local431[local369] = new Class67();
			local226 += local465;
		}
		this.anIntArray432[arg1.anInt6186] = local226;
		@Pc(694) int[] local694 = null;
		@Pc(696) int[] local696 = null;
		@Pc(698) int[] local698 = null;
		@Pc(700) float[][] local700 = null;
		@Pc(726) int local726;
		@Pc(774) int local774;
		@Pc(780) int local780;
		@Pc(793) int local793;
		@Pc(795) int local795;
		@Pc(826) int local826;
		@Pc(831) int local831;
		@Pc(972) float local972;
		@Pc(1003) float local1003;
		@Pc(974) float local974;
		if (arg1.aByteArray74 != null) {
			@Pc(706) int local706 = arg1.anInt6183;
			@Pc(709) int[] local709 = new int[local706];
			@Pc(712) int[] local712 = new int[local706];
			@Pc(715) int[] local715 = new int[local706];
			@Pc(718) int[] local718 = new int[local706];
			@Pc(721) int[] local721 = new int[local706];
			@Pc(724) int[] local724 = new int[local706];
			for (local726 = 0; local726 < local706; local726++) {
				local709[local726] = Integer.MAX_VALUE;
				local712[local726] = -2147483647;
				local715[local726] = Integer.MAX_VALUE;
				local718[local726] = -2147483647;
				local721[local726] = Integer.MAX_VALUE;
				local724[local726] = -2147483647;
			}
			local694 = new int[local706];
			local700 = new float[local706][];
			local696 = new int[local706];
			local698 = new int[local706];
			for (local774 = 0; local774 < this.anInt5776; local774++) {
				local780 = local106[local774];
				if (arg1.aByteArray74[local780] != -1) {
					local793 = arg1.aByteArray74[local780] & 0xFF;
					for (local795 = 0; local795 < 3; local795++) {
						@Pc(807) short local807;
						if (local795 == 0) {
							local807 = arg1.aShortArray68[local780];
						} else if (local795 == 1) {
							local807 = arg1.aShortArray75[local780];
						} else {
							local807 = arg1.aShortArray77[local780];
						}
						local826 = arg1.anIntArray454[local807];
						local831 = arg1.anIntArray456[local807];
						@Pc(836) int local836 = arg1.anIntArray455[local807];
						if (local826 < local709[local793]) {
							local709[local793] = local826;
						}
						if (local826 > local712[local793]) {
							local712[local793] = local826;
						}
						if (local831 < local715[local793]) {
							local715[local793] = local831;
						}
						if (local718[local793] < local831) {
							local718[local793] = local831;
						}
						if (local836 < local721[local793]) {
							local721[local793] = local836;
						}
						if (local836 > local724[local793]) {
							local724[local793] = local836;
						}
					}
				}
			}
			for (local780 = 0; local780 < local706; local780++) {
				@Pc(922) byte local922 = arg1.aByteArray71[local780];
				if (local922 > 0) {
					local694[local780] = (local709[local780] + local712[local780]) / 2;
					local696[local780] = (local718[local780] + local715[local780]) / 2;
					local698[local780] = (local724[local780] + local721[local780]) / 2;
					if (local922 == 1) {
						local831 = arg1.anIntArray449[local780];
						if (local831 == 0) {
							local972 = 1.0F;
							local974 = 1.0F;
						} else if (local831 <= 0) {
							local972 = (float) -local831 / 1024.0F;
							local974 = 1.0F;
						} else {
							local974 = (float) local831 / 1024.0F;
							local972 = 1.0F;
						}
						local1003 = 64.0F / (float) arg1.anIntArray458[local780];
					} else if (local922 == 2) {
						local974 = 64.0F / (float) arg1.anIntArray459[local780];
						local972 = 64.0F / (float) arg1.anIntArray449[local780];
						local1003 = 64.0F / (float) arg1.anIntArray458[local780];
					} else {
						local1003 = (float) arg1.anIntArray458[local780] / 1024.0F;
						local974 = (float) arg1.anIntArray459[local780] / 1024.0F;
						local972 = (float) arg1.anIntArray449[local780] / 1024.0F;
					}
					local700[local780] = Static345.method5316(local1003, arg1.aShortArray76[local780], local972, arg1.aShortArray73[local780], local974, arg1.aShortArray69[local780], arg1.aByteArray73[local780] & 0xFF);
				}
			}
		}
		@Pc(1098) Class171[] local1098 = new Class171[arg1.anInt6188];
		@Pc(1117) short local1117;
		@Pc(1128) int local1128;
		@Pc(1139) int local1139;
		@Pc(1199) int local1199;
		for (@Pc(1100) int local1100 = 0; local1100 < arg1.anInt6188; local1100++) {
			@Pc(1107) short local1107 = arg1.aShortArray68[local1100];
			@Pc(1112) short local1112 = arg1.aShortArray75[local1100];
			local1117 = arg1.aShortArray77[local1100];
			local1128 = this.anIntArray429[local1112] - this.anIntArray429[local1107];
			local1139 = this.anIntArray430[local1112] - this.anIntArray430[local1107];
			local726 = this.anIntArray433[local1112] - this.anIntArray433[local1107];
			local774 = this.anIntArray429[local1117] - this.anIntArray429[local1107];
			local780 = this.anIntArray430[local1117] - this.anIntArray430[local1107];
			local793 = this.anIntArray433[local1117] - this.anIntArray433[local1107];
			local795 = local1139 * local793 - local726 * local780;
			local1199 = local774 * local726 - local793 * local1128;
			local826 = local780 * local1128 - local1139 * local774;
			while (local795 > 8192 || local1199 > 8192 || local826 > 8192 || local795 < -8192 || local1199 < -8192 || local826 < -8192) {
				local1199 >>= 0x1;
				local826 >>= 0x1;
				local795 >>= 0x1;
			}
			local831 = (int) Math.sqrt((double) (local826 * local826 + local795 * local795 + local1199 * local1199));
			if (local831 <= 0) {
				local831 = 1;
			}
			local795 = local795 * 256 / local831;
			local1199 = local1199 * 256 / local831;
			local826 = local826 * 256 / local831;
			@Pc(1295) byte local1295 = arg1.aByteArray75 == null ? 0 : arg1.aByteArray75[local1100];
			if (local1295 == 0) {
				@Pc(1304) Class67 local1304 = local431[local1107];
				local1304.anInt1721 += local795;
				local1304.anInt1723 += local826;
				local1304.anInt1720 += local1199;
				local1304.anInt1724++;
				@Pc(1332) Class67 local1332 = local431[local1112];
				local1332.anInt1720 += local1199;
				local1332.anInt1721 += local795;
				local1332.anInt1724++;
				local1332.anInt1723 += local826;
				@Pc(1360) Class67 local1360 = local431[local1117];
				local1360.anInt1723 += local826;
				local1360.anInt1721 += local795;
				local1360.anInt1720 += local1199;
				local1360.anInt1724++;
			} else if (local1295 == 1) {
				@Pc(1399) Class171 local1399 = local1098[local1100] = new Class171();
				local1399.anInt4936 = local795;
				local1399.anInt4935 = local826;
				local1399.anInt4934 = local1199;
			}
		}
		@Pc(1425) int local1425;
		for (@Pc(1419) int local1419 = 0; local1419 < this.anInt5776; local1419++) {
			local1425 = local106[local1419];
			@Pc(1432) int local1432 = arg1.aShortArray71[local1425] & 0xFFFF;
			@Pc(1440) short local1440;
			if (arg1.aShortArray72 == null) {
				local1440 = -1;
			} else {
				local1440 = arg1.aShortArray72[local1425];
			}
			if (arg1.aByteArray74 == null) {
				local1139 = -1;
			} else {
				local1139 = arg1.aByteArray74[local1425];
			}
			if (arg1.aByteArray76 == null) {
				local726 = 0;
			} else {
				local726 = arg1.aByteArray76[local1425] & 0xFF;
			}
			@Pc(1472) float local1472 = 0.0F;
			@Pc(1474) float local1474 = 0.0F;
			@Pc(1476) float local1476 = 0.0F;
			local972 = 0.0F;
			local1003 = 0.0F;
			local974 = 0.0F;
			@Pc(1484) byte local1484 = 0;
			@Pc(1486) byte local1486 = 0;
			@Pc(1488) int local1488 = 0;
			@Pc(1505) byte local1505;
			@Pc(1522) short local1522;
			@Pc(1527) short local1527;
			@Pc(1532) short local1532;
			if (local1440 != -1) {
				if (local1139 == -1) {
					local1486 = 2;
					local1474 = 1.0F;
					local972 = 1.0F;
					local1003 = 0.0F;
					local974 = 0.0F;
					local1476 = 1.0F;
					local1484 = 1;
					local1472 = 0.0F;
				} else {
					local1139 &= 0xFF;
					local1505 = arg1.aByteArray71[local1139];
					@Pc(1512) short local1512;
					@Pc(1517) short local1517;
					@Pc(1555) float local1555;
					@Pc(1564) float local1564;
					@Pc(1573) float local1573;
					@Pc(1659) float local1659;
					@Pc(1667) float local1667;
					@Pc(1676) float local1676;
					@Pc(1685) float local1685;
					@Pc(1694) float local1694;
					@Pc(1702) float local1702;
					if (local1505 == 0) {
						local1512 = arg1.aShortArray68[local1425];
						local1517 = arg1.aShortArray75[local1425];
						local1522 = arg1.aShortArray77[local1425];
						local1527 = arg1.aShortArray76[local1139];
						local1532 = arg1.aShortArray73[local1139];
						@Pc(1537) short local1537 = arg1.aShortArray69[local1139];
						@Pc(1543) float local1543 = (float) arg1.anIntArray454[local1527];
						@Pc(1549) float local1549 = (float) arg1.anIntArray456[local1527];
						local1555 = arg1.anIntArray455[local1527];
						local1564 = (float) arg1.anIntArray454[local1532] - local1543;
						local1573 = (float) arg1.anIntArray456[local1532] - local1549;
						@Pc(1581) float local1581 = (float) arg1.anIntArray455[local1532] - local1555;
						@Pc(1589) float local1589 = (float) arg1.anIntArray454[local1537] - local1543;
						@Pc(1597) float local1597 = (float) arg1.anIntArray456[local1537] - local1549;
						@Pc(1606) float local1606 = (float) arg1.anIntArray455[local1537] - local1555;
						@Pc(1615) float local1615 = (float) arg1.anIntArray454[local1512] - local1543;
						@Pc(1624) float local1624 = (float) arg1.anIntArray456[local1512] - local1549;
						@Pc(1633) float local1633 = (float) arg1.anIntArray455[local1512] - local1555;
						@Pc(1642) float local1642 = (float) arg1.anIntArray454[local1517] - local1543;
						@Pc(1651) float local1651 = (float) arg1.anIntArray456[local1517] - local1549;
						local1659 = (float) arg1.anIntArray455[local1517] - local1555;
						local1667 = (float) arg1.anIntArray454[local1522] - local1543;
						local1676 = (float) arg1.anIntArray456[local1522] - local1549;
						local1685 = (float) arg1.anIntArray455[local1522] - local1555;
						local1694 = local1606 * local1573 - local1597 * local1581;
						local1702 = local1589 * local1581 - local1564 * local1606;
						@Pc(1710) float local1710 = local1597 * local1564 - local1573 * local1589;
						@Pc(1719) float local1719 = local1710 * local1597 - local1702 * local1606;
						@Pc(1728) float local1728 = local1694 * local1606 - local1710 * local1589;
						@Pc(1736) float local1736 = local1589 * local1702 - local1597 * local1694;
						@Pc(1750) float local1750 = 1.0F / (local1719 * local1564 + local1573 * local1728 + local1581 * local1736);
						local1476 = local1750 * (local1728 * local1651 + local1719 * local1642 + local1736 * local1659);
						local1003 = local1750 * (local1736 * local1685 + local1676 * local1728 + local1667 * local1719);
						local1472 = (local1728 * local1624 + local1719 * local1615 + local1736 * local1633) * local1750;
						@Pc(1801) float local1801 = local1702 * local1564 - local1573 * local1694;
						@Pc(1810) float local1810 = local1694 * local1581 - local1710 * local1564;
						@Pc(1819) float local1819 = local1573 * local1710 - local1581 * local1702;
						@Pc(1833) float local1833 = 1.0F / (local1606 * local1801 + local1810 * local1597 + local1819 * local1589);
						local972 = local1833 * (local1810 * local1651 + local1819 * local1642 + local1801 * local1659);
						local974 = local1833 * (local1810 * local1676 + local1667 * local1819 + local1801 * local1685);
						local1474 = local1833 * (local1615 * local1819 + local1810 * local1624 + local1801 * local1633);
					} else {
						local1512 = arg1.aShortArray68[local1425];
						local1517 = arg1.aShortArray75[local1425];
						local1522 = arg1.aShortArray77[local1425];
						@Pc(1896) int local1896 = local694[local1139];
						@Pc(1900) int local1900 = local696[local1139];
						@Pc(1904) int local1904 = local698[local1139];
						@Pc(1908) float[] local1908 = local700[local1139];
						@Pc(1913) byte local1913 = arg1.aByteArray72[local1139];
						local1555 = (float) arg1.anIntArray451[local1139] / 256.0F;
						if (local1505 == 1) {
							local1564 = (float) arg1.anIntArray459[local1139] / 1024.0F;
							Static425.method6110(arg1.anIntArray455[local1512], local1904, local1900, local1896, local1913, local1564, local1908, local1555, arg1.anIntArray454[local1512], arg1.anIntArray456[local1512]);
							local1472 = Static66.aFloat18;
							local1474 = Static195.aFloat81;
							Static425.method6110(arg1.anIntArray455[local1517], local1904, local1900, local1896, local1913, local1564, local1908, local1555, arg1.anIntArray454[local1517], arg1.anIntArray456[local1517]);
							local972 = Static195.aFloat81;
							local1476 = Static66.aFloat18;
							Static425.method6110(arg1.anIntArray455[local1522], local1904, local1900, local1896, local1913, local1564, local1908, local1555, arg1.anIntArray454[local1522], arg1.anIntArray456[local1522]);
							local974 = Static195.aFloat81;
							local1003 = Static66.aFloat18;
							local1573 = local1564 / 2.0F;
							if ((local1913 & 0x1) == 0) {
								if (local1476 - local1472 > local1573) {
									local1484 = 1;
									local1476 -= local1564;
								} else if (local1472 - local1476 > local1573) {
									local1476 += local1564;
									local1484 = 2;
								}
								if (local1003 - local1472 > local1573) {
									local1486 = 1;
									local1003 -= local1564;
								} else if (local1573 < local1472 - local1003) {
									local1003 += local1564;
									local1486 = 2;
								}
							} else {
								if (local972 - local1474 > local1573) {
									local1484 = 1;
									local972 -= local1564;
								} else if (local1573 < local1474 - local972) {
									local1484 = 2;
									local972 += local1564;
								}
								if (local974 - local1474 > local1573) {
									local974 -= local1564;
									local1486 = 1;
								} else if (local1573 < local1474 - local974) {
									local974 += local1564;
									local1486 = 2;
								}
							}
						} else if (local1505 == 2) {
							local1564 = (float) arg1.anIntArray450[local1139] / 256.0F;
							local1573 = (float) arg1.anIntArray453[local1139] / 256.0F;
							@Pc(2353) int local2353 = arg1.anIntArray454[local1517] - arg1.anIntArray454[local1512];
							@Pc(2364) int local2364 = arg1.anIntArray456[local1517] - arg1.anIntArray456[local1512];
							@Pc(2375) int local2375 = arg1.anIntArray455[local1517] - arg1.anIntArray455[local1512];
							@Pc(2385) int local2385 = arg1.anIntArray454[local1522] - arg1.anIntArray454[local1512];
							@Pc(2396) int local2396 = arg1.anIntArray456[local1522] - arg1.anIntArray456[local1512];
							@Pc(2406) int local2406 = arg1.anIntArray455[local1522] - arg1.anIntArray455[local1512];
							@Pc(2415) int local2415 = local2364 * local2406 - local2375 * local2396;
							@Pc(2423) int local2423 = local2385 * local2375 - local2406 * local2353;
							@Pc(2432) int local2432 = local2353 * local2396 - local2385 * local2364;
							local1659 = 64.0F / (float) arg1.anIntArray449[local1139];
							local1667 = 64.0F / (float) arg1.anIntArray458[local1139];
							local1676 = 64.0F / (float) arg1.anIntArray459[local1139];
							local1685 = (local1908[2] * (float) local2432 + (float) local2415 * local1908[0] + (float) local2423 * local1908[1]) / local1659;
							local1694 = ((float) local2432 * local1908[5] + local1908[4] * (float) local2423 + local1908[3] * (float) local2415) / local1667;
							local1702 = ((float) local2432 * local1908[8] + (float) local2415 * local1908[6] + local1908[7] * (float) local2423) / local1676;
							local1488 = Static584.method7741(local1694, local1702, local1685);
							Static116.method2032(arg1.anIntArray455[local1512], local1573, arg1.anIntArray456[local1512], local1896, local1913, local1488, local1904, arg1.anIntArray454[local1512], local1564, local1555, local1900, local1908);
							local1472 = Static248.aFloat134;
							local1474 = Static417.aFloat157;
							Static116.method2032(arg1.anIntArray455[local1517], local1573, arg1.anIntArray456[local1517], local1896, local1913, local1488, local1904, arg1.anIntArray454[local1517], local1564, local1555, local1900, local1908);
							local1476 = Static248.aFloat134;
							local972 = Static417.aFloat157;
							Static116.method2032(arg1.anIntArray455[local1522], local1573, arg1.anIntArray456[local1522], local1896, local1913, local1488, local1904, arg1.anIntArray454[local1522], local1564, local1555, local1900, local1908);
							local1003 = Static248.aFloat134;
							local974 = Static417.aFloat157;
						} else if (local1505 == 3) {
							Static386.method5697(local1913, local1900, arg1.anIntArray455[local1512], local1896, local1904, local1908, arg1.anIntArray456[local1512], local1555, arg1.anIntArray454[local1512]);
							local1474 = Static343.aFloat141;
							local1472 = Static445.aFloat162;
							Static386.method5697(local1913, local1900, arg1.anIntArray455[local1517], local1896, local1904, local1908, arg1.anIntArray456[local1517], local1555, arg1.anIntArray454[local1517]);
							local972 = Static343.aFloat141;
							local1476 = Static445.aFloat162;
							Static386.method5697(local1913, local1900, arg1.anIntArray455[local1522], local1896, local1904, local1908, arg1.anIntArray456[local1522], local1555, arg1.anIntArray454[local1522]);
							local974 = Static343.aFloat141;
							local1003 = Static445.aFloat162;
							if ((local1913 & 0x1) == 0) {
								if (local1003 - local1472 > 0.5F) {
									local1003--;
									local1486 = 1;
								} else if (local1472 - local1003 > 0.5F) {
									local1003++;
									local1486 = 2;
								}
								if (local1476 - local1472 > 0.5F) {
									local1476--;
									local1484 = 1;
								} else if (local1472 - local1476 > 0.5F) {
									local1484 = 2;
									local1476++;
								}
							} else {
								if (local974 - local1474 > 0.5F) {
									local1486 = 1;
									local974--;
								} else if (local1474 - local974 > 0.5F) {
									local1486 = 2;
									local974++;
								}
								if (local972 - local1474 > 0.5F) {
									local972--;
									local1484 = 1;
								} else if (local1474 - local972 > 0.5F) {
									local1484 = 2;
									local972++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray75 == null) {
				local1505 = 0;
			} else {
				local1505 = arg1.aByteArray75[local1425];
			}
			if (local1505 == 0) {
				@Pc(2788) long local2788 = (long) (local1139 << 2) + ((long) local726 + (long) (local1488 << 24) + (long) (local1432 << 8) << 32);
				local1522 = arg1.aShortArray68[local1425];
				local1527 = arg1.aShortArray75[local1425];
				local1532 = arg1.aShortArray77[local1425];
				@Pc(2807) Class67 local2807 = local431[local1522];
				this.aShortArray64[local1419] = this.method4957(local1472, local1474, local2807.anInt1723, local2807.anInt1724, local1522, local2788, arg1, local2807.anInt1720, local2807.anInt1721);
				@Pc(2831) Class67 local2831 = local431[local1527];
				this.aShortArray60[local1419] = this.method4957(local1476, local972, local2831.anInt1723, local2831.anInt1724, local1527, (long) local1484 + local2788, arg1, local2831.anInt1720, local2831.anInt1721);
				@Pc(2858) Class67 local2858 = local431[local1532];
				this.aShortArray65[local1419] = this.method4957(local1003, local974, local2858.anInt1723, local2858.anInt1724, local1532, local2788 + (long) local1486, arg1, local2858.anInt1720, local2858.anInt1721);
			} else if (local1505 == 1) {
				@Pc(2653) Class171 local2653 = local1098[local1425];
				@Pc(2694) long local2694 = (long) ((local2653.anInt4934 + 256 << 12) + (local2653.anInt4936 <= 0 ? 2048 : 1024) + (local1139 << 2) + (local2653.anInt4935 - -256 << 22)) + ((long) local726 + (long) (local1432 << 8) + (long) (local1488 << 24) << 32);
				this.aShortArray64[local1419] = this.method4957(local1472, local1474, local2653.anInt4935, 0, arg1.aShortArray68[local1425], local2694, arg1, local2653.anInt4934, local2653.anInt4936);
				this.aShortArray60[local1419] = this.method4957(local1476, local972, local2653.anInt4935, 0, arg1.aShortArray75[local1425], (long) local1484 + local2694, arg1, local2653.anInt4934, local2653.anInt4936);
				this.aShortArray65[local1419] = this.method4957(local1003, local974, local2653.anInt4935, 0, arg1.aShortArray77[local1425], (long) local1486 + local2694, arg1, local2653.anInt4934, local2653.anInt4936);
			}
			if (arg1.aShortArray72 == null) {
				this.aShortArray63[local1419] = -1;
			} else {
				this.aShortArray63[local1419] = arg1.aShortArray72[local1425];
			}
			if (arg1.aByteArray76 != null) {
				this.aByteArray67[local1419] = arg1.aByteArray76[local1425];
			}
			if (arg1.aShortArray74 != null) {
				this.aShortArray66[local1419] = arg1.aShortArray74[local1425];
			}
			this.aShortArray58[local1419] = arg1.aShortArray71[local1425];
		}
		local1425 = 0;
		local1117 = -10000;
		for (local1128 = 0; local1128 < this.anInt5750; local1128++) {
			@Pc(2951) short local2951 = this.aShortArray63[local1128];
			if (local1117 != local2951) {
				local1117 = local2951;
				local1425++;
			}
		}
		this.anIntArray431 = new int[local1425 + 1];
		local1117 = -10000;
		local1425 = 0;
		for (local1139 = 0; local1139 < this.anInt5750; local1139++) {
			@Pc(2985) short local2985 = this.aShortArray63[local1139];
			if (local1117 != local2985) {
				this.anIntArray431[local1425++] = local1139;
				local1117 = local2985;
			}
		}
		this.anIntArray431[local1425] = this.anInt5750;
		Static399.aLongArray13 = null;
		this.aShortArray62 = Static286.method4666(this.anInt5784, this.aShortArray62);
		this.aShortArray67 = Static286.method4666(this.anInt5784, this.aShortArray67);
		this.aShortArray57 = Static286.method4666(this.anInt5784, this.aShortArray57);
		this.aByteArray68 = Static121.method2518(this.aByteArray68, this.anInt5784);
		this.aFloatArray48 = Static502.method6784(this.anInt5784, this.aFloatArray48);
		this.aFloatArray49 = Static502.method6784(this.anInt5784, this.aFloatArray49);
		if (arg1.anIntArray452 != null && Static508.method7070(this.anInt5758, arg2)) {
			this.anIntArrayArray56 = arg1.method5299(false);
		}
		if (arg1.aClass265Array1 != null && Static514.method7116(arg2, this.anInt5758)) {
			this.anIntArrayArray54 = arg1.method5303();
		}
		if (arg1.anIntArray457 != null && Static175.method3222(arg2, this.anInt5758)) {
			local726 = 0;
			@Pc(3104) int[] local3104 = new int[256];
			for (local780 = 0; local780 < this.anInt5776; local780++) {
				local793 = arg1.anIntArray457[local106[local780]];
				if (local793 >= 0) {
					@Pc(3121) int local3121 = local3104[local793]++;
					if (local793 > local726) {
						local726 = local793;
					}
				}
			}
			this.anIntArrayArray55 = new int[local726 + 1][];
			for (local793 = 0; local793 <= local726; local793++) {
				this.anIntArrayArray55[local793] = new int[local3104[local793]];
				local3104[local793] = 0;
			}
			for (local795 = 0; local795 < this.anInt5776; local795++) {
				local1199 = arg1.anIntArray457[local106[local795]];
				if (local1199 >= 0) {
					this.anIntArrayArray55[local1199][local3104[local1199]++] = local795;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
	private void method4946(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass45_5 != null && this.aClass45_5.anInterface1_1 == null;
		@Pc(27) boolean local27 = this.lb != null && this.lb.anInterface1_1 == null;
		@Pc(38) boolean local38 = this.aClass45_3 != null && this.aClass45_3.anInterface1_1 == null;
		@Pc(49) boolean local49 = this.aClass45_4 != null && this.aClass45_4.anInterface1_1 == null;
		if (arg0) {
			local27 &= (this.aByte49 & 0x4) != 0;
			local16 &= (this.aByte49 & 0x2) != 0;
			local38 &= (this.aByte49 & 0x1) != 0;
			local49 &= (this.aByte49 & 0x8) != 0;
		}
		@Pc(97) byte local97 = 0;
		@Pc(101) byte local101 = 0;
		@Pc(103) byte local103 = 0;
		@Pc(105) byte local105 = 0;
		if (local38) {
			local97 = 12;
		}
		if (local16) {
			local101 = local97;
			local97 = (byte) (local97 + 4);
		}
		if (local27) {
			local103 = local97;
			local97 = (byte) (local97 + 12);
		}
		if (local49) {
			local105 = local97;
			local97 = (byte) (local97 + 8);
		}
		if (local97 == 0) {
			return;
		}
		if (this.anInt5784 * local97 > this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1.aByteArray93.length) {
			this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1 = new Class6_Sub21_Sub1((this.anInt5784 + 100) * local97);
		} else {
			this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1.anInt7338 = 0;
		}
		@Pc(178) Class6_Sub21_Sub1 local178 = this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1;
		@Pc(186) int local186;
		@Pc(195) int local195;
		@Pc(223) int local223;
		@Pc(232) int local232;
		if (local38) {
			@Pc(202) int local202;
			@Pc(209) int local209;
			@Pc(214) int local214;
			@Pc(221) int local221;
			if (this.aClass14_Sub3_27.aBoolean298) {
				for (local186 = 0; local186 < this.anInt5765; local186++) {
					local195 = Stream.floatToRawIntBits((float) this.anIntArray429[local186]);
					local202 = Stream.floatToRawIntBits((float) this.anIntArray430[local186]);
					local209 = Stream.floatToRawIntBits((float) this.anIntArray433[local186]);
					local214 = this.anIntArray432[local186];
					local221 = this.anIntArray432[local186 + 1];
					for (local223 = local214; local223 < local221; local223++) {
						local232 = this.aShortArray61[local223] - 1;
						if (local232 == -1) {
							break;
						}
						local178.anInt7338 = local97 * local232;
						local178.method6033(local195);
						local178.method6033(local202);
						local178.method6033(local209);
					}
				}
			} else {
				for (local186 = 0; local186 < this.anInt5765; local186++) {
					local195 = Stream.floatToRawIntBits((float) this.anIntArray429[local186]);
					local202 = Stream.floatToRawIntBits((float) this.anIntArray430[local186]);
					local209 = Stream.floatToRawIntBits((float) this.anIntArray433[local186]);
					local214 = this.anIntArray432[local186];
					local221 = this.anIntArray432[local186 + 1];
					for (local223 = local214; local223 < local221; local223++) {
						local232 = this.aShortArray61[local223] - 1;
						if (local232 == -1) {
							break;
						}
						local178.anInt7338 = local97 * local232;
						local178.method6047(local195);
						local178.method6047(local202);
						local178.method6047(local209);
					}
				}
			}
		}
		@Pc(482) float local482;
		@Pc(364) short[] local364;
		@Pc(358) short[] local358;
		@Pc(355) short[] local355;
		@Pc(361) byte[] local361;
		@Pc(518) float local518;
		if (local16) {
			if (this.lb == null) {
				if (this.aClass227_1 == null) {
					local355 = this.aShortArray57;
					local358 = this.aShortArray67;
					local361 = this.aByteArray68;
					local364 = this.aShortArray62;
				} else {
					local364 = this.aClass227_1.aShortArray78;
					local358 = this.aClass227_1.aShortArray80;
					local361 = this.aClass227_1.aByteArray78;
					local355 = this.aClass227_1.aShortArray79;
				}
				@Pc(388) float local388 = this.aClass14_Sub3_27.aFloatArray40[0];
				@Pc(394) float local394 = this.aClass14_Sub3_27.aFloatArray40[1];
				@Pc(400) float local400 = this.aClass14_Sub3_27.aFloatArray40[2];
				@Pc(404) float local404 = this.aClass14_Sub3_27.aFloat90;
				@Pc(414) float local414 = this.aClass14_Sub3_27.aFloat106 * 768.0F / (float) this.aShort69;
				@Pc(424) float local424 = this.aClass14_Sub3_27.aFloat107 * 768.0F / (float) this.aShort69;
				for (@Pc(426) int local426 = 0; local426 < this.anInt5776; local426++) {
					@Pc(446) int local446 = this.method4953(this.aShortArray63[local426], this.aShort74, this.aByteArray67[local426], this.aShortArray58[local426]);
					@Pc(455) float local455 = (float) (local446 >>> 24) * this.aClass14_Sub3_27.aFloat103;
					@Pc(460) short local460 = this.aShortArray64[local426];
					@Pc(471) float local471 = (float) (local446 >> 8 & 0xFF) * this.aClass14_Sub3_27.aFloat108;
					local482 = this.aClass14_Sub3_27.aFloat93 * (float) (local446 >> 16 & 0xFF);
					@Pc(487) short local487 = (short) local361[local460];
					if (local487 == 0) {
						local518 = (local400 * (float) local355[local460] + local394 * (float) local358[local460] + (float) local364[local460] * local388) * 0.0026041667F;
					} else {
						local518 = (local394 * (float) local358[local460] + local388 * (float) local364[local460] + (float) local355[local460] * local400) / (float) (local487 * 256);
					}
					@Pc(555) float local555 = local404 + (local518 < 0.0F ? local424 : local414) * local518;
					@Pc(560) int local560 = (int) (local455 * local555);
					if (local560 < 0) {
						local560 = 0;
					} else if (local560 > 255) {
						local560 = 255;
					}
					@Pc(581) int local581 = (int) (local482 * local555);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					@Pc(600) int local600 = (int) (local555 * local471);
					local178.anInt7338 = local101 + local97 * local460;
					if (local600 < 0) {
						local600 = 0;
					} else if (local600 > 255) {
						local600 = 255;
					}
					local178.method6062(local560);
					local178.method6062(local581);
					local178.method6062(local600);
					local178.method6062(255 - (this.aByteArray67[local426] & 0xFF));
					local460 = this.aShortArray60[local426];
					local487 = local361[local460];
					if (local487 == 0) {
						local518 = ((float) local355[local460] * local400 + local394 * (float) local358[local460] + (float) local364[local460] * local388) * 0.0026041667F;
					} else {
						local518 = ((float) local355[local460] * local400 + (float) local358[local460] * local394 + (float) local364[local460] * local388) / (float) (local487 * 256);
					}
					local555 = local404 + (local518 < 0.0F ? local424 : local414) * local518;
					local560 = (int) (local555 * local455);
					if (local560 < 0) {
						local560 = 0;
					} else if (local560 > 255) {
						local560 = 255;
					}
					local581 = (int) (local555 * local482);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					local600 = (int) (local471 * local555);
					if (local600 < 0) {
						local600 = 0;
					} else if (local600 > 255) {
						local600 = 255;
					}
					local178.anInt7338 = local101 + local460 * local97;
					local178.method6062(local560);
					local178.method6062(local581);
					local178.method6062(local600);
					local178.method6062(255 - (this.aByteArray67[local426] & 0xFF));
					local460 = this.aShortArray65[local426];
					local487 = local361[local460];
					if (local487 == 0) {
						local518 = ((float) local355[local460] * local400 + (float) local364[local460] * local388 + local394 * (float) local358[local460]) * 0.0026041667F;
					} else {
						local518 = (local400 * (float) local355[local460] + local388 * (float) local364[local460] + (float) local358[local460] * local394) / (float) (local487 * 256);
					}
					local555 = local518 * (local518 < 0.0F ? local424 : local414) + local404;
					local560 = (int) (local455 * local555);
					local581 = (int) (local482 * local555);
					if (local560 < 0) {
						local560 = 0;
					} else if (local560 > 255) {
						local560 = 255;
					}
					local600 = (int) (local471 * local555);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					local178.anInt7338 = local460 * local97 + local101;
					if (local600 < 0) {
						local600 = 0;
					} else if (local600 > 255) {
						local600 = 255;
					}
					local178.method6062(local560);
					local178.method6062(local581);
					local178.method6062(local600);
					local178.method6062(255 - (this.aByteArray67[local426] & 0xFF));
				}
			} else {
				for (local186 = 0; local186 < this.anInt5776; local186++) {
					local195 = this.method4953(this.aShortArray63[local186], this.aShort74, this.aByteArray67[local186], this.aShortArray58[local186]);
					local178.anInt7338 = local101 + this.aShortArray64[local186] * local97;
					local178.method6033(local195);
					local178.anInt7338 = local101 + this.aShortArray60[local186] * local97;
					local178.method6033(local195);
					local178.anInt7338 = local101 + local97 * this.aShortArray65[local186];
					local178.method6033(local195);
				}
			}
		}
		if (local27) {
			if (this.aClass227_1 == null) {
				local358 = this.aShortArray67;
				local364 = this.aShortArray62;
				local355 = this.aShortArray57;
				local361 = this.aByteArray68;
			} else {
				local355 = this.aClass227_1.aShortArray79;
				local358 = this.aClass227_1.aShortArray80;
				local361 = this.aClass227_1.aByteArray78;
				local364 = this.aClass227_1.aShortArray78;
			}
			@Pc(1094) float local1094 = 3.0F / (float) this.aShort69;
			local178.anInt7338 = local103;
			local518 = 3.0F / (float) (this.aShort69 + this.aShort69 / 2);
			if (this.aClass14_Sub3_27.aBoolean298) {
				for (local223 = 0; local223 < this.anInt5784; local223++) {
					local232 = local361[local223] & 0xFF;
					if (local232 == 0) {
						local178.method3128((float) local364[local223] * local518);
						local178.method3128(local518 * (float) local358[local223]);
						local178.method3128((float) local355[local223] * local518);
					} else {
						local482 = local1094 / (float) local232;
						local178.method3128((float) local364[local223] * local482);
						local178.method3128((float) local358[local223] * local482);
						local178.method3128((float) local355[local223] * local482);
					}
					local178.anInt7338 += local97 - 12;
				}
			} else {
				for (local223 = 0; local223 < this.anInt5784; local223++) {
					local232 = local361[local223] & 0xFF;
					if (local232 == 0) {
						local178.method3126(local518 * (float) local364[local223]);
						local178.method3126((float) local358[local223] * local518);
						local178.method3126((float) local355[local223] * local518);
					} else {
						local482 = local1094 / (float) local232;
						local178.method3126((float) local364[local223] * local482);
						local178.method3126((float) local358[local223] * local482);
						local178.method3126(local482 * (float) local355[local223]);
					}
					local178.anInt7338 += local97 - 12;
				}
			}
		}
		if (local49) {
			local178.anInt7338 = local105;
			if (this.aClass14_Sub3_27.aBoolean298) {
				for (local186 = 0; local186 < this.anInt5784; local186++) {
					local178.method3128(this.aFloatArray48[local186]);
					local178.method3128(this.aFloatArray49[local186]);
					local178.anInt7338 += local97 - 8;
				}
			} else {
				for (local186 = 0; local186 < this.anInt5784; local186++) {
					local178.method3126(this.aFloatArray48[local186]);
					local178.method3126(this.aFloatArray49[local186]);
					local178.anInt7338 += local97 - 8;
				}
			}
		}
		local178.anInt7338 = local97 * this.anInt5784;
		@Pc(1400) Interface1 local1400;
		if (arg0) {
			if (this.anInterface1_4 == null) {
				this.anInterface1_4 = this.aClass14_Sub3_27.method3927(local178.aByteArray93, local178.anInt7338, local97, true);
			} else {
				this.anInterface1_4.method5393(local97, local178.anInt7338, local178.aByteArray93);
			}
			local1400 = this.anInterface1_4;
			this.aByte49 = 0;
		} else {
			local1400 = this.aClass14_Sub3_27.method3927(local178.aByteArray93, local178.anInt7338, local97, false);
			this.aBoolean405 = true;
		}
		if (local38) {
			this.aClass45_3.anInterface1_1 = local1400;
			this.aClass45_3.aByte23 = 0;
		}
		if (local49) {
			this.aClass45_4.anInterface1_1 = local1400;
			this.aClass45_4.aByte23 = local105;
		}
		if (local16) {
			this.aClass45_5.anInterface1_1 = local1400;
			this.aClass45_5.aByte23 = local101;
		}
		if (local27) {
			this.lb.anInterface1_1 = local1400;
			this.lb.aByte23 = local103;
		}
	}

	@OriginalMember(owner = "client!mo", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5765; local15++) {
			@Pc(33) int local33 = this.anIntArray429[local15] * local13 + this.anIntArray430[local15] * local9 >> 14;
			this.anIntArray430[local15] = this.anIntArray430[local15] * local13 - local9 * this.anIntArray429[local15] >> 14;
			this.anIntArray429[local15] = local33;
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "()Z")
	@Override
	public boolean method7254() {
		if (this.aShortArray63 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray63.length; local12++) {
			if (this.aShortArray63[local12] != -1 && !this.aClass14_Sub3_27.anInterface4_15.method4233(this.aShortArray63[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	private void method4948() {
		if (!this.aBoolean405) {
			return;
		}
		this.aBoolean405 = false;
		if (this.aClass85Array4 == null && this.aClass90Array4 == null && this.aClass75Array1 == null) {
			if (this.anIntArray429 != null && !Static463.method6484(this.anInt5789, this.anInt5758)) {
				if (this.aClass45_3 != null && this.aClass45_3.anInterface1_1 == null) {
					this.aBoolean405 = true;
				} else {
					if (!this.aBoolean404) {
						this.method4949();
					}
					this.anIntArray429 = null;
				}
			}
			if (this.anIntArray430 != null && !Static66.method1312(this.anInt5758, this.anInt5789)) {
				if (this.aClass45_3 != null && this.aClass45_3.anInterface1_1 == null) {
					this.aBoolean405 = true;
				} else {
					if (!this.aBoolean404) {
						this.method4949();
					}
					this.anIntArray430 = null;
				}
			}
			if (this.anIntArray433 != null && !Static462.method6479(this.anInt5789, this.anInt5758)) {
				if (this.aClass45_3 != null && this.aClass45_3.anInterface1_1 == null) {
					this.aBoolean405 = true;
				} else {
					if (!this.aBoolean404) {
						this.method4949();
					}
					this.anIntArray433 = null;
				}
			}
		}
		if (this.aShortArray61 != null && this.anIntArray429 == null && this.anIntArray430 == null && this.anIntArray433 == null) {
			this.anIntArray432 = null;
			this.aShortArray61 = null;
		}
		if (this.aByteArray68 != null && !Static90.method7592(this.anInt5758, this.anInt5789)) {
			if (this.lb == null) {
				if (this.aClass45_5 != null && this.aClass45_5.anInterface1_1 == null) {
					this.aBoolean405 = true;
				} else {
					this.aByteArray68 = null;
					this.aShortArray62 = this.aShortArray67 = this.aShortArray57 = null;
				}
			} else if (this.lb.anInterface1_1 == null) {
				this.aBoolean405 = true;
			} else {
				this.aShortArray62 = this.aShortArray67 = this.aShortArray57 = null;
				this.aByteArray68 = null;
			}
		}
		if (this.aShortArray58 != null && !Static212.method3740(this.anInt5758, this.anInt5789)) {
			if (this.aClass45_5 != null && this.aClass45_5.anInterface1_1 == null) {
				this.aBoolean405 = true;
			} else {
				this.aShortArray58 = null;
			}
		}
		if (this.aByteArray67 != null && !Static259.method4376(this.anInt5789, this.anInt5758)) {
			if (this.aClass45_5 != null && this.aClass45_5.anInterface1_1 == null) {
				this.aBoolean405 = true;
			} else {
				this.aByteArray67 = null;
			}
		}
		if (this.aFloatArray48 != null && !Static494.method6739(this.anInt5758, this.anInt5789)) {
			if (this.aClass45_4 != null && this.aClass45_4.anInterface1_1 == null) {
				this.aBoolean405 = true;
			} else {
				this.aFloatArray48 = this.aFloatArray49 = null;
			}
		}
		if (this.aShortArray63 != null && !Static490.method6708(this.anInt5758, this.anInt5789)) {
			if (this.aClass45_5 != null && this.aClass45_5.anInterface1_1 == null) {
				this.aBoolean405 = true;
			} else {
				this.aShortArray63 = null;
			}
		}
		if (this.aShortArray64 != null && !Static261.method4391(this.anInt5758, this.anInt5789)) {
			if ((this.aClass122_1 == null || this.aClass122_1.anInterface24_1 != null) && (this.aClass45_5 == null || this.aClass45_5.anInterface1_1 != null)) {
				this.aShortArray64 = this.aShortArray60 = this.aShortArray65 = null;
			} else {
				this.aBoolean405 = true;
			}
		}
		if (this.anIntArrayArray55 != null && !Static175.method3222(this.anInt5789, this.anInt5758)) {
			this.aShortArray66 = null;
			this.anIntArrayArray55 = null;
		}
		if (this.anIntArrayArray56 != null && !Static508.method7070(this.anInt5758, this.anInt5789)) {
			this.aShortArray59 = null;
			this.anIntArrayArray56 = null;
		}
		if (this.anIntArrayArray54 != null && !Static514.method7116(this.anInt5789, this.anInt5758)) {
			this.anIntArrayArray54 = null;
		}
		if (this.anIntArray431 != null && (this.anInt5789 & 0x800) == 0 && (this.anInt5789 & 0x40000) == 0) {
			this.anIntArray431 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5765; local3++) {
			this.anIntArray433[local3] = -this.anIntArray433[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5784; local25++) {
			this.aShortArray57[local25] = (short) -this.aShortArray57[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5776; local44++) {
			@Pc(51) short local51 = this.aShortArray64[local44];
			this.aShortArray64[local44] = this.aShortArray65[local44];
			this.aShortArray65[local44] = local51;
		}
		if (this.lb == null && this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
		}
		if (this.lb != null) {
			this.lb.anInterface1_1 = null;
		}
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
		this.aBoolean404 = false;
		if (this.aClass122_1 != null) {
			this.aClass122_1.anInterface24_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	private void method4949() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5765; local29++) {
			@Pc(36) int local36 = this.anIntArray429[local29];
			@Pc(41) int local41 = this.anIntArray430[local29];
			if (local13 < local36) {
				local13 = local36;
			}
			if (local9 > local41) {
				local9 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local15 < local41) {
				local15 = local41;
			}
			@Pc(74) int local74 = this.anIntArray433[local29];
			if (local74 > local17) {
				local17 = local74;
			}
			if (local11 > local74) {
				local11 = local74;
			}
			@Pc(100) int local100 = local74 * local74 + local36 * local36;
			if (local19 < local100) {
				local19 = local100;
			}
			local100 = local36 * local36 + local74 * local74 + local41 * local41;
			if (local27 < local100) {
				local27 = local100;
			}
		}
		this.aShort71 = (short) local13;
		this.aShort73 = (short) local17;
		this.aShort66 = (short) local11;
		this.aShort72 = (short) local9;
		this.aShort70 = (short) local15;
		this.aShort67 = (short) local7;
		this.aShort68 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local27);
		this.aBoolean404 = true;
	}

	@OriginalMember(owner = "client!mo", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5765; local15++) {
			@Pc(34) int local34 = this.anIntArray430[local15] * local13 - this.anIntArray433[local15] * local9 >> 14;
			this.anIntArray433[local15] = this.anIntArray433[local15] * local13 + local9 * this.anIntArray430[local15] >> 14;
			this.anIntArray430[local15] = local34;
		}
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	private void method4950() {
		if (this.anInt5750 == 0) {
			return;
		}
		if (this.aByte49 != 0) {
			this.method4946(true);
		}
		this.method4946(false);
		if (this.aClass122_1 != null) {
			if (this.aClass122_1.anInterface24_1 == null) {
				this.method4959((this.aByte49 & 0x10) != 0);
			}
			if (this.aClass122_1.anInterface24_1 != null) {
				this.aClass14_Sub3_27.method3921(this.lb != null);
				this.aClass14_Sub3_27.method3981(this.aClass45_4, this.aClass45_5, this.aClass45_3, this.lb);
				@Pc(79) int local79 = this.anIntArray431.length - 1;
				for (@Pc(81) int local81 = 0; local81 < local79; local81++) {
					@Pc(88) int local88 = this.anIntArray431[local81];
					@Pc(95) int local95 = this.anIntArray431[local81 + 1];
					@Pc(102) int local102 = this.aShortArray63[local88] & 0xFFFF;
					if (local102 == 65535) {
						local102 = -1;
					}
					this.aClass14_Sub3_27.method3961(this.lb != null, local102);
					this.aClass14_Sub3_27.method3920(this.aClass122_1.anInterface24_1, local88 * 3, (local95 - local88) * 3);
				}
			}
		}
		this.method4948();
	}

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	private void method4951() {
		if (this.aClass75Array1 == null) {
			return;
		}
		@Pc(8) Class54_Sub2 local8 = this.aClass14_Sub3_27.aClass54_Sub2_2;
		@Pc(12) float local12 = this.aClass14_Sub3_27.method3944();
		@Pc(16) float local16 = this.aClass14_Sub3_27.method3929();
		this.aClass14_Sub3_27.method3971();
		this.aClass14_Sub3_27.method6880(false);
		this.aClass14_Sub3_27.method3921(false);
		this.aClass14_Sub3_27.method3981(this.aClass14_Sub3_27.aClass45_1, null, this.aClass14_Sub3_27.aClass45_2, null);
		for (@Pc(43) int local43 = 0; local43 < this.anInt5795; local43++) {
			@Pc(50) Class75 local50 = this.aClass75Array1[local43];
			@Pc(55) Class269 local55 = this.aClass269Array1[local43];
			if (!local50.aBoolean135 || !this.aClass14_Sub3_27.method6887()) {
				@Pc(84) float local84 = (float) (this.anIntArray429[local50.anInt1915] + this.anIntArray429[local50.anInt1917] + this.anIntArray429[local50.anInt1916]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray430[local50.anInt1916] + this.anIntArray430[local50.anInt1917] + this.anIntArray430[local50.anInt1915]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray433[local50.anInt1917] + this.anIntArray433[local50.anInt1916] + this.anIntArray433[local50.anInt1915]) * 0.3333333F;
				@Pc(142) float local142 = Static550.aFloat194 + Static541.aFloat156 * local128 + Static257.aFloat116 * local106 + local84 * Static379.aFloat155;
				@Pc(156) float local156 = Static270.aFloat130 + local128 * Static150.aFloat66 + Static313.aFloat136 * local106 + local84 * Static226.aFloat113;
				@Pc(170) float local170 = Static545.aFloat192 + local128 * Static559.aFloat196 + local84 * Static517.aFloat186 + Static155.aFloat67 * local106;
				local8.method4412((float) local55.anInt7377 + local142, -local170, local55.anInt7372 * local50.aShort25 >> 7, local50.aShort24 * local55.anInt7375 >> 7, local55.anInt7373, (float) local55.anInt7371 - local156);
				this.aClass14_Sub3_27.method3914(local8);
				this.aClass14_Sub3_27.ka(local16, local12 - (float) local50.anInt1918 * 1.5F);
				@Pc(222) int local222 = local55.anInt7370;
				OpenGL.glColor4ub((byte) (local222 >> 16), (byte) (local222 >> 8), (byte) local222, (byte) (local222 >> 24));
				this.aClass14_Sub3_27.method3962(local50.aShort26);
				this.aClass14_Sub3_27.method3937(local50.aByte25);
				this.aClass14_Sub3_27.method3911(4);
			}
		}
		this.aClass14_Sub3_27.ka(local16, local12);
		this.aClass14_Sub3_27.method6880(true);
		this.aClass14_Sub3_27.method3963();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class54_Sub2 local8 = (Class54_Sub2) arg2;
		@Pc(12) Class54_Sub2 local12 = this.aClass14_Sub3_27.aClass54_Sub2_4;
		@Pc(33) float local33 = local12.aFloat126 * local8.aFloat128 + local8.aFloat118 * local12.aFloat120 + local8.aFloat121 * local12.aFloat119 + local12.aFloat128;
		@Pc(54) float local54 = local8.aFloat118 * local12.aFloat129 + local12.aFloat125 * local8.aFloat128 + local8.aFloat121 * local12.aFloat124 + local12.aFloat118;
		Static313.aFloat136 = local8.aFloat122 * local12.aFloat124 + local8.aFloat129 * local12.aFloat129 + local8.aFloat120 * local12.aFloat125;
		Static517.aFloat186 = local12.aFloat127 * local8.aFloat123 + local8.aFloat126 * local12.aFloat123 + local8.aFloat125 * local12.aFloat122;
		Static257.aFloat116 = local8.aFloat122 * local12.aFloat119 + local12.aFloat120 * local8.aFloat129 + local8.aFloat120 * local12.aFloat126;
		Static150.aFloat66 = local8.aFloat124 * local12.aFloat129 + local8.aFloat119 * local12.aFloat125 + local12.aFloat124 * local8.aFloat127;
		Static379.aFloat155 = local12.aFloat126 * local8.aFloat126 + local8.aFloat125 * local12.aFloat120 + local8.aFloat123 * local12.aFloat119;
		Static559.aFloat196 = local8.aFloat127 * local12.aFloat127 + local12.aFloat122 * local8.aFloat124 + local8.aFloat119 * local12.aFloat123;
		@Pc(183) float local183 = local12.aFloat121 + local12.aFloat122 * local8.aFloat118 + local8.aFloat128 * local12.aFloat123 + local12.aFloat127 * local8.aFloat121;
		Static541.aFloat156 = local8.aFloat127 * local12.aFloat119 + local8.aFloat124 * local12.aFloat120 + local8.aFloat119 * local12.aFloat126;
		Static226.aFloat113 = local8.aFloat123 * local12.aFloat124 + local8.aFloat125 * local12.aFloat129 + local8.aFloat126 * local12.aFloat125;
		Static155.aFloat67 = local8.aFloat120 * local12.aFloat123 + local12.aFloat122 * local8.aFloat129 + local8.aFloat122 * local12.aFloat127;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass14_Sub3_27.anInt4570;
		@Pc(255) int local255 = this.aClass14_Sub3_27.anInt4567;
		if (!this.aBoolean404) {
			this.method4949();
		}
		Static2.anIntArray1[0] = this.aShort67;
		Static519.anIntArray646[0] = this.aShort72;
		Static365.anIntArray476[0] = this.aShort66;
		Static2.anIntArray1[1] = this.aShort71;
		Static519.anIntArray646[1] = this.aShort72;
		Static2.anIntArray1[2] = this.aShort67;
		Static365.anIntArray476[1] = this.aShort66;
		Static519.anIntArray646[2] = this.aShort70;
		Static365.anIntArray476[2] = this.aShort66;
		Static2.anIntArray1[3] = this.aShort71;
		Static519.anIntArray646[3] = this.aShort70;
		Static2.anIntArray1[4] = this.aShort67;
		Static365.anIntArray476[3] = this.aShort66;
		Static519.anIntArray646[4] = this.aShort72;
		Static365.anIntArray476[4] = this.aShort73;
		Static2.anIntArray1[5] = this.aShort71;
		Static519.anIntArray646[5] = this.aShort72;
		Static365.anIntArray476[5] = this.aShort73;
		Static2.anIntArray1[6] = this.aShort67;
		Static519.anIntArray646[6] = this.aShort70;
		Static2.anIntArray1[7] = this.aShort71;
		Static365.anIntArray476[6] = this.aShort73;
		Static519.anIntArray646[7] = this.aShort70;
		Static365.anIntArray476[7] = this.aShort73;
		@Pc(414) float local414;
		@Pc(442) float local442;
		@Pc(428) float local428;
		@Pc(400) float local400;
		@Pc(390) float local390;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static519.anIntArray646[local383];
			local395 = Static365.anIntArray476[local383];
			local400 = Static2.anIntArray1[local383];
			local414 = local33 + local395 * Static541.aFloat156 + local390 * Static257.aFloat116 + local400 * Static379.aFloat155;
			local428 = Static559.aFloat196 * local395 + Static517.aFloat186 * local400 + local390 * Static155.aFloat67 + local183;
			local442 = Static150.aFloat66 * local395 + Static313.aFloat136 * local390 + Static226.aFloat113 * local400 + local54;
			if ((float) this.aClass14_Sub3_27.anInt4588 <= local428) {
				@Pc(461) float local461 = (float) this.aClass14_Sub3_27.anInt4601 + (float) local251 * local414 / local428;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				@Pc(485) float local485 = local442 * (float) local255 / local428 + (float) this.aClass14_Sub3_27.anInt4573;
				local239 = true;
				if (local485 < local245) {
					local245 = local485;
				}
				if (local485 > local247) {
					local247 = local485;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && local245 < (float) arg1 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt5784 > this.aClass14_Sub3_27.anIntArray274.length) {
				this.aClass14_Sub3_27.anIntArray274 = new int[this.anInt5784];
				this.aClass14_Sub3_27.anIntArray275 = new int[this.anInt5784];
			}
			@Pc(556) int[] local556 = this.aClass14_Sub3_27.anIntArray274;
			@Pc(560) int[] local560 = this.aClass14_Sub3_27.anIntArray275;
			@Pc(636) int local636;
			for (@Pc(562) int local562 = 0; local562 < this.anInt5765; local562++) {
				local395 = this.anIntArray433[local562];
				local400 = this.anIntArray429[local562];
				local390 = this.anIntArray430[local562];
				local414 = Static257.aFloat116 * local390 + Static379.aFloat155 * local400 + Static541.aFloat156 * local395 + local33;
				local428 = local183 + local400 * Static517.aFloat186 + Static155.aFloat67 * local390 + local395 * Static559.aFloat196;
				local442 = local54 + local390 * Static313.aFloat136 + Static226.aFloat113 * local400 + local395 * Static150.aFloat66;
				@Pc(643) int local643;
				@Pc(645) int local645;
				@Pc(654) int local654;
				if ((float) this.aClass14_Sub3_27.anInt4588 <= local428) {
					local636 = (int) (local414 * (float) local251 / local428 + (float) this.aClass14_Sub3_27.anInt4601);
					local643 = (int) ((float) this.aClass14_Sub3_27.anInt4573 + (float) local255 * local442 / local428);
					local645 = this.anIntArray432[local562];
					local654 = this.anIntArray432[local562 + 1];
					for (@Pc(713) int local713 = local645; local713 < local654; local713++) {
						@Pc(722) int local722 = this.aShortArray61[local713] - 1;
						if (local722 == -1) {
							break;
						}
						local556[local722] = local636;
						local560[local722] = local643;
					}
				} else {
					local636 = this.anIntArray432[local562];
					local643 = this.anIntArray432[local562 + 1];
					for (local645 = local636; local645 < local643; local645++) {
						local654 = this.aShortArray61[local645] - 1;
						if (local654 == -1) {
							break;
						}
						local556[this.aShortArray61[local645] - 1] = -999999;
					}
				}
			}
			for (local636 = 0; local636 < this.anInt5776; local636++) {
				if (local556[this.aShortArray64[local636]] != -999999 && local556[this.aShortArray60[local636]] != -999999 && local556[this.aShortArray65[local636]] != -999999 && this.method4956(arg0, local560[this.aShortArray64[local636]], local556[this.aShortArray60[local636]], local556[this.aShortArray64[local636]], local556[this.aShortArray65[local636]], arg1, local560[this.aShortArray60[local636]], local560[this.aShortArray65[local636]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5765; local7++) {
			if (arg0 != 0) {
				this.anIntArray429[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray430[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray433[local7] += arg2;
			}
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			Static424.anInt7397 = 0;
			Static431.anInt7513 = 0;
			local28 = 0;
			Static324.anInt7485 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray56.length) {
					local52 = this.anIntArrayArray56[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static424.anInt7397 += this.anIntArray429[local60];
						Static431.anInt7513 += this.anIntArray430[local60];
						local28++;
						Static324.anInt7485 += this.anIntArray433[local60];
					}
				}
			}
			if (local28 <= 0) {
				Static324.anInt7485 = local18;
				Static424.anInt7397 = local14;
				Static431.anInt7513 = local22;
			} else {
				Static324.anInt7485 = local18 + Static324.anInt7485 / local28;
				Static424.anInt7397 = local14 + Static424.anInt7397 / local28;
				Static431.anInt7513 = Static431.anInt7513 / local28 + local22;
			}
			return;
		}
		@Pc(168) int[] local168;
		@Pc(170) int local170;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			local14 = arg2 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray56.length) {
					local168 = this.anIntArrayArray56[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local54 = local168[local170];
						this.anIntArray429[local54] += local14;
						this.anIntArray430[local54] += local22;
						this.anIntArray433[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(281) int local281;
		@Pc(299) int local299;
		@Pc(749) int local749;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray56.length) {
					local168 = this.anIntArrayArray56[local32];
					if ((arg5 & 0x1) == 0) {
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							this.anIntArray429[local54] -= Static424.anInt7397;
							this.anIntArray430[local54] -= Static431.anInt7513;
							this.anIntArray433[local54] -= Static324.anInt7485;
							if (arg4 != 0) {
								local60 = Class6_Sub2_Sub7.anIntArray178[arg4];
								local281 = Class6_Sub2_Sub7.anIntArray177[arg4];
								local299 = this.anIntArray430[local54] * local60 + this.anIntArray429[local54] * local281 + 16383 >> 14;
								this.anIntArray430[local54] = local281 * this.anIntArray430[local54] + 16383 - this.anIntArray429[local54] * local60 >> 14;
								this.anIntArray429[local54] = local299;
							}
							if (arg2 != 0) {
								local60 = Class6_Sub2_Sub7.anIntArray178[arg2];
								local281 = Class6_Sub2_Sub7.anIntArray177[arg2];
								local299 = local281 * this.anIntArray430[local54] + 16383 - local60 * this.anIntArray433[local54] >> 14;
								this.anIntArray433[local54] = local60 * this.anIntArray430[local54] + this.anIntArray433[local54] * local281 + 16383 >> 14;
								this.anIntArray430[local54] = local299;
							}
							if (arg3 != 0) {
								local60 = Class6_Sub2_Sub7.anIntArray178[arg3];
								local281 = Class6_Sub2_Sub7.anIntArray177[arg3];
								local299 = this.anIntArray429[local54] * local281 + local60 * this.anIntArray433[local54] + 16383 >> 14;
								this.anIntArray433[local54] = this.anIntArray433[local54] * local281 + 16383 - local60 * this.anIntArray429[local54] >> 14;
								this.anIntArray429[local54] = local299;
							}
							this.anIntArray429[local54] += Static424.anInt7397;
							this.anIntArray430[local54] += Static431.anInt7513;
							this.anIntArray433[local54] += Static324.anInt7485;
						}
					} else {
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							this.anIntArray429[local54] -= Static424.anInt7397;
							this.anIntArray430[local54] -= Static431.anInt7513;
							this.anIntArray433[local54] -= Static324.anInt7485;
							if (arg2 != 0) {
								local60 = Class6_Sub2_Sub7.anIntArray178[arg2];
								local281 = Class6_Sub2_Sub7.anIntArray177[arg2];
								local299 = this.anIntArray430[local54] * local281 + 16383 - this.anIntArray433[local54] * local60 >> 14;
								this.anIntArray433[local54] = this.anIntArray433[local54] * local281 + this.anIntArray430[local54] * local60 + 16383 >> 14;
								this.anIntArray430[local54] = local299;
							}
							if (arg4 != 0) {
								local60 = Class6_Sub2_Sub7.anIntArray178[arg4];
								local281 = Class6_Sub2_Sub7.anIntArray177[arg4];
								local299 = local281 * this.anIntArray429[local54] + this.anIntArray430[local54] * local60 + 16383 >> 14;
								this.anIntArray430[local54] = this.anIntArray430[local54] * local281 + 16383 - local60 * this.anIntArray429[local54] >> 14;
								this.anIntArray429[local54] = local299;
							}
							if (arg3 != 0) {
								local60 = Class6_Sub2_Sub7.anIntArray178[arg3];
								local281 = Class6_Sub2_Sub7.anIntArray177[arg3];
								local299 = local281 * this.anIntArray429[local54] + this.anIntArray433[local54] * local60 + 16383 >> 14;
								this.anIntArray433[local54] = this.anIntArray433[local54] * local281 + 16383 - local60 * this.anIntArray429[local54] >> 14;
								this.anIntArray429[local54] = local299;
							}
							this.anIntArray429[local54] += Static424.anInt7397;
							this.anIntArray430[local54] += Static431.anInt7513;
							this.anIntArray433[local54] += Static324.anInt7485;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray56.length > local38) {
						local52 = this.anIntArrayArray56[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local281 = this.anIntArray432[local60];
							local299 = this.anIntArray432[local60 + 1];
							for (local749 = local281; local749 < local299; local749++) {
								@Pc(758) int local758 = this.aShortArray61[local749] - 1;
								if (local758 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local771 = Class6_Sub2_Sub7.anIntArray178[arg4];
									local775 = Class6_Sub2_Sub7.anIntArray177[arg4];
									local794 = local771 * this.aShortArray67[local758] + local775 * this.aShortArray62[local758] + 16383 >> 14;
									this.aShortArray67[local758] = (short) (this.aShortArray67[local758] * local775 + 16383 - local771 * this.aShortArray62[local758] >> 14);
									this.aShortArray62[local758] = (short) local794;
								}
								if (arg2 != 0) {
									local771 = Class6_Sub2_Sub7.anIntArray178[arg2];
									local775 = Class6_Sub2_Sub7.anIntArray177[arg2];
									local794 = local775 * this.aShortArray67[local758] + 16383 - this.aShortArray57[local758] * local771 >> 14;
									this.aShortArray57[local758] = (short) (this.aShortArray67[local758] * local771 + local775 * this.aShortArray57[local758] + 16383 >> 14);
									this.aShortArray67[local758] = (short) local794;
								}
								if (arg3 != 0) {
									local771 = Class6_Sub2_Sub7.anIntArray178[arg3];
									local775 = Class6_Sub2_Sub7.anIntArray177[arg3];
									local794 = local771 * this.aShortArray57[local758] + this.aShortArray62[local758] * local775 + 16383 >> 14;
									this.aShortArray57[local758] = (short) (local775 * this.aShortArray57[local758] + 16383 - local771 * this.aShortArray62[local758] >> 14);
									this.aShortArray62[local758] = (short) local794;
								}
							}
						}
					}
				}
				if (this.lb == null && this.aClass45_5 != null) {
					this.aClass45_5.anInterface1_1 = null;
				}
				if (this.lb != null) {
					this.lb.anInterface1_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray56.length > local32) {
					local168 = this.anIntArrayArray56[local32];
					for (local170 = 0; local170 < local168.length; local170++) {
						local54 = local168[local170];
						this.anIntArray429[local54] -= Static424.anInt7397;
						this.anIntArray430[local54] -= Static431.anInt7513;
						this.anIntArray433[local54] -= Static324.anInt7485;
						this.anIntArray429[local54] = arg2 * this.anIntArray429[local54] >> 7;
						this.anIntArray430[local54] = arg3 * this.anIntArray430[local54] >> 7;
						this.anIntArray433[local54] = arg4 * this.anIntArray433[local54] >> 7;
						this.anIntArray429[local54] += Static424.anInt7397;
						this.anIntArray430[local54] += Static431.anInt7513;
						this.anIntArray433[local54] += Static324.anInt7485;
					}
				}
			}
		} else {
			@Pc(1206) Class75 local1206;
			@Pc(1211) Class269 local1211;
			if (arg0 == 5) {
				if (this.anIntArrayArray55 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray55.length > local32) {
							local168 = this.anIntArrayArray55[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local54 = local168[local170];
								local60 = (this.aByteArray67[local54] & 0xFF) + arg2 * 8;
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray67[local54] = (byte) local60;
							}
							if (local168.length > 0 && this.aClass45_5 != null) {
								this.aClass45_5.anInterface1_1 = null;
							}
						}
					}
					if (this.aClass75Array1 != null) {
						for (local32 = 0; local32 < this.anInt5795; local32++) {
							local1206 = this.aClass75Array1[local32];
							local1211 = this.aClass269Array1[local32];
							local1211.anInt7370 = 255 - (this.aByteArray67[local1206.anInt1921] & 0xFF) << 24 | local1211.anInt7370 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1452) Class269 local1452;
				if (arg0 == 8) {
					if (this.anIntArrayArray54 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray54.length > local32) {
								local168 = this.anIntArrayArray54[local32];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1452 = this.aClass269Array1[local168[local170]];
									local1452.anInt7377 += arg2;
									local1452.anInt7371 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray54 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray54.length) {
								local168 = this.anIntArrayArray54[local32];
								for (local170 = 0; local170 < local168.length; local170++) {
									local1452 = this.aClass269Array1[local168[local170]];
									local1452.anInt7375 = arg2 * local1452.anInt7375 >> 7;
									local1452.anInt7372 = local1452.anInt7372 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray54.length > local32) {
							local168 = this.anIntArrayArray54[local32];
							for (local170 = 0; local170 < local168.length; local170++) {
								local1452 = this.aClass269Array1[local168[local170]];
								local1452.anInt7373 = local1452.anInt7373 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray55 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray55.length > local32) {
						local168 = this.anIntArrayArray55[local32];
						for (local170 = 0; local170 < local168.length; local170++) {
							local54 = local168[local170];
							local60 = this.aShortArray58[local54] & 0xFFFF;
							local281 = local60 >> 10 & 0x3F;
							local299 = local60 >> 7 & 0x7;
							@Pc(1295) int local1295 = arg2 + local281 & 0x3F;
							local299 += arg3 / 4;
							local749 = local60 & 0x7F;
							if (local299 < 0) {
								local299 = 0;
							} else if (local299 > 7) {
								local299 = 7;
							}
							local749 += arg4;
							if (local749 < 0) {
								local749 = 0;
							} else if (local749 > 127) {
								local749 = 127;
							}
							this.aShortArray58[local54] = (short) (local749 | local1295 << 10 | local299 << 7);
						}
						if (local168.length > 0 && this.aClass45_5 != null) {
							this.aClass45_5.anInterface1_1 = null;
						}
					}
				}
				if (this.aClass75Array1 != null) {
					for (local32 = 0; local32 < this.anInt5795; local32++) {
						local1206 = this.aClass75Array1[local32];
						local1211 = this.aClass269Array1[local32];
						local1211.anInt7370 = Static171.anIntArray212[this.aShortArray58[local1206.anInt1921] & 0xFFFF] & 0xFFFFFF | local1211.anInt7370 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!mo", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7263(@OriginalArg(0) Class54 arg0) {
		@Pc(8) Class54_Sub2 local8 = (Class54_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass85Array4 != null) {
			for (local13 = 0; local13 < this.aClass85Array4.length; local13++) {
				@Pc(20) Class85 local20 = this.aClass85Array4[local13];
				@Pc(22) Class85 local22 = local20;
				if (local20.aClass85_1 != null) {
					local22 = local20.aClass85_1;
				}
				local22.anInt2862 = (int) ((float) this.anIntArray433[local20.anInt2868] * local8.aFloat119 + (float) this.anIntArray430[local20.anInt2868] * local8.aFloat120 + local8.aFloat126 * (float) this.anIntArray429[local20.anInt2868] + local8.aFloat128);
				local22.anInt2874 = (int) (local8.aFloat129 * (float) this.anIntArray430[local20.anInt2868] + (float) this.anIntArray429[local20.anInt2868] * local8.aFloat125 + local8.aFloat124 * (float) this.anIntArray433[local20.anInt2868] + local8.aFloat118);
				local22.anInt2875 = (int) ((float) this.anIntArray429[local20.anInt2868] * local8.aFloat123 + (float) this.anIntArray430[local20.anInt2868] * local8.aFloat122 + (float) this.anIntArray433[local20.anInt2868] * local8.aFloat127 + local8.aFloat121);
				local22.anInt2863 = (int) (local8.aFloat128 + local8.aFloat119 * (float) this.anIntArray433[local20.anInt2870] + local8.aFloat126 * (float) this.anIntArray429[local20.anInt2870] + (float) this.anIntArray430[local20.anInt2870] * local8.aFloat120);
				local22.anInt2865 = (int) (local8.aFloat118 + (float) this.anIntArray433[local20.anInt2870] * local8.aFloat124 + local8.aFloat129 * (float) this.anIntArray430[local20.anInt2870] + (float) this.anIntArray429[local20.anInt2870] * local8.aFloat125);
				local22.anInt2873 = (int) (local8.aFloat121 + (float) this.anIntArray433[local20.anInt2870] * local8.aFloat127 + (float) this.anIntArray430[local20.anInt2870] * local8.aFloat122 + local8.aFloat123 * (float) this.anIntArray429[local20.anInt2870]);
				local22.anInt2864 = (int) (local8.aFloat128 + (float) this.anIntArray433[local20.anInt2866] * local8.aFloat119 + (float) this.anIntArray430[local20.anInt2866] * local8.aFloat120 + (float) this.anIntArray429[local20.anInt2866] * local8.aFloat126);
				local22.anInt2869 = (int) ((float) this.anIntArray429[local20.anInt2866] * local8.aFloat125 + local8.aFloat129 * (float) this.anIntArray430[local20.anInt2866] + local8.aFloat124 * (float) this.anIntArray433[local20.anInt2866] + local8.aFloat118);
				local22.anInt2878 = (int) ((float) this.anIntArray430[local20.anInt2866] * local8.aFloat122 + local8.aFloat123 * (float) this.anIntArray429[local20.anInt2866] + local8.aFloat127 * (float) this.anIntArray433[local20.anInt2866] + local8.aFloat121);
			}
		}
		if (this.aClass90Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass90Array4.length; local13++) {
			@Pc(361) Class90 local361 = this.aClass90Array4[local13];
			@Pc(363) Class90 local363 = local361;
			if (local361.aClass90_1 != null) {
				local363 = local361.aClass90_1;
			}
			if (local361.aClass54_5 == null) {
				local361.aClass54_5 = local8.method7693();
			} else {
				local361.aClass54_5.la(local8);
			}
			local363.anInt2971 = (int) (local8.aFloat128 + (float) this.anIntArray433[local361.anInt2975] * local8.aFloat119 + (float) this.anIntArray429[local361.anInt2975] * local8.aFloat126 + (float) this.anIntArray430[local361.anInt2975] * local8.aFloat120);
			local363.anInt2976 = (int) (local8.aFloat118 + (float) this.anIntArray429[local361.anInt2975] * local8.aFloat125 + (float) this.anIntArray430[local361.anInt2975] * local8.aFloat129 + (float) this.anIntArray433[local361.anInt2975] * local8.aFloat124);
			local363.anInt2974 = (int) ((float) this.anIntArray433[local361.anInt2975] * local8.aFloat127 + (float) this.anIntArray429[local361.anInt2975] * local8.aFloat123 + (float) this.anIntArray430[local361.anInt2975] * local8.aFloat122 + local8.aFloat121);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!q;Lclient!po;I)V")
	@Override
	public void method7256(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5784 == 0) {
			return;
		}
		@Pc(13) Class54_Sub2 local13 = this.aClass14_Sub3_27.aClass54_Sub2_4;
		@Pc(16) Class54_Sub2 local16 = (Class54_Sub2) arg0;
		if (!this.aBoolean404) {
			this.method4949();
		}
		Static155.aFloat67 = local13.aFloat122 * local16.aFloat129 + local13.aFloat123 * local16.aFloat120 + local13.aFloat127 * local16.aFloat122;
		Static545.aFloat192 = local16.aFloat118 * local13.aFloat122 + local16.aFloat128 * local13.aFloat123 + local16.aFloat121 * local13.aFloat127 + local13.aFloat121;
		@Pc(69) float local69 = Static545.aFloat192 + (float) this.aShort72 * Static155.aFloat67;
		@Pc(77) float local77 = Static545.aFloat192 + Static155.aFloat67 * (float) this.aShort70;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local93 = (float) -this.aShort68 + local77;
			local87 = (float) this.aShort68 + local69;
		} else {
			local87 = local77 + (float) this.aShort68;
			local93 = local69 - (float) this.aShort68;
		}
		if (this.aClass14_Sub3_27.aFloat100 <= local93 || local87 <= (float) this.aClass14_Sub3_27.anInt4588) {
			return;
		}
		Static550.aFloat194 = local13.aFloat119 * local16.aFloat121 + local13.aFloat126 * local16.aFloat128 + local13.aFloat120 * local16.aFloat118 + local13.aFloat128;
		Static257.aFloat116 = local13.aFloat119 * local16.aFloat122 + local16.aFloat129 * local13.aFloat120 + local13.aFloat126 * local16.aFloat120;
		@Pc(170) float local170 = (float) this.aShort72 * Static257.aFloat116 + Static550.aFloat194;
		@Pc(178) float local178 = Static550.aFloat194 + Static257.aFloat116 * (float) this.aShort70;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local178 < local170) {
			local193 = (float) this.aClass14_Sub3_27.anInt4570 * ((float) -this.aShort68 + local178);
			local204 = (local170 + (float) this.aShort68) * (float) this.aClass14_Sub3_27.anInt4570;
		} else {
			local193 = (float) this.aClass14_Sub3_27.anInt4570 * (local170 - (float) this.aShort68);
			local204 = (float) this.aClass14_Sub3_27.anInt4570 * ((float) this.aShort68 + local178);
		}
		if (local193 / local87 >= this.aClass14_Sub3_27.aFloat95 || local204 / local87 <= this.aClass14_Sub3_27.aFloat87) {
			return;
		}
		Static270.aFloat130 = local13.aFloat125 * local16.aFloat128 + local13.aFloat129 * local16.aFloat118 + local13.aFloat124 * local16.aFloat121 + local13.aFloat118;
		Static313.aFloat136 = local13.aFloat125 * local16.aFloat120 + local13.aFloat129 * local16.aFloat129 + local13.aFloat124 * local16.aFloat122;
		@Pc(294) float local294 = (float) this.aShort72 * Static313.aFloat136 + Static270.aFloat130;
		@Pc(302) float local302 = Static313.aFloat136 * (float) this.aShort70 + Static270.aFloat130;
		@Pc(328) float local328;
		@Pc(317) float local317;
		if (local294 > local302) {
			local328 = (float) this.aClass14_Sub3_27.anInt4567 * ((float) -this.aShort68 + local302);
			local317 = ((float) this.aShort68 + local294) * (float) this.aClass14_Sub3_27.anInt4567;
		} else {
			local317 = (local302 + (float) this.aShort68) * (float) this.aClass14_Sub3_27.anInt4567;
			local328 = (local294 - (float) this.aShort68) * (float) this.aClass14_Sub3_27.anInt4567;
		}
		if (this.aClass14_Sub3_27.aFloat97 <= local328 / local87 || this.aClass14_Sub3_27.aFloat99 >= local317 / local87) {
			return;
		}
		if (arg1 != null || this.aClass75Array1 != null) {
			Static150.aFloat66 = local16.aFloat127 * local13.aFloat124 + local16.aFloat124 * local13.aFloat129 + local13.aFloat125 * local16.aFloat119;
			Static517.aFloat186 = local16.aFloat126 * local13.aFloat123 + local16.aFloat125 * local13.aFloat122 + local16.aFloat123 * local13.aFloat127;
			Static379.aFloat155 = local16.aFloat123 * local13.aFloat119 + local16.aFloat126 * local13.aFloat126 + local13.aFloat120 * local16.aFloat125;
			Static559.aFloat196 = local16.aFloat124 * local13.aFloat122 + local16.aFloat119 * local13.aFloat123 + local13.aFloat127 * local16.aFloat127;
			Static226.aFloat113 = local13.aFloat124 * local16.aFloat123 + local16.aFloat126 * local13.aFloat125 + local13.aFloat129 * local16.aFloat125;
			Static541.aFloat156 = local13.aFloat120 * local16.aFloat124 + local16.aFloat119 * local13.aFloat126 + local16.aFloat127 * local13.aFloat119;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(498) int local498 = this.aShort71 + this.aShort67 >> 1;
			@Pc(507) int local507 = this.aShort66 + this.aShort73 >> 1;
			@Pc(526) int local526 = (int) (Static257.aFloat116 * (float) this.aShort72 + Static379.aFloat155 * (float) local498 + Static550.aFloat194 + Static541.aFloat156 * (float) local507);
			@Pc(545) int local545 = (int) ((float) local507 * Static150.aFloat66 + (float) this.aShort72 * Static313.aFloat136 + (float) local498 * Static226.aFloat113 + Static270.aFloat130);
			@Pc(564) int local564 = (int) (Static545.aFloat192 + (float) local498 * Static517.aFloat186 + Static155.aFloat67 * (float) this.aShort72 + (float) local507 * Static559.aFloat196);
			if (local564 >= this.aClass14_Sub3_27.anInt4588) {
				arg1.anInt7044 = this.aClass14_Sub3_27.anInt4573 + this.aClass14_Sub3_27.anInt4567 * local545 / local564;
				arg1.anInt7042 = this.aClass14_Sub3_27.anInt4601 + this.aClass14_Sub3_27.anInt4570 * local526 / local564;
			} else {
				local488 = true;
			}
			@Pc(622) int local622 = (int) (Static257.aFloat116 * (float) this.aShort70 + Static379.aFloat155 * (float) local498 + Static550.aFloat194 + Static541.aFloat156 * (float) local507);
			@Pc(641) int local641 = (int) (Static150.aFloat66 * (float) local507 + Static313.aFloat136 * (float) this.aShort70 + Static270.aFloat130 + (float) local498 * Static226.aFloat113);
			@Pc(660) int local660 = (int) ((float) local498 * Static517.aFloat186 + Static545.aFloat192 + Static155.aFloat67 * (float) this.aShort70 + (float) local507 * Static559.aFloat196);
			if (this.aClass14_Sub3_27.anInt4588 <= local660) {
				arg1.anInt7045 = local641 * this.aClass14_Sub3_27.anInt4567 / local660 + this.aClass14_Sub3_27.anInt4573;
				arg1.anInt7043 = this.aClass14_Sub3_27.anInt4570 * local622 / local660 + this.aClass14_Sub3_27.anInt4601;
			} else {
				local488 = true;
			}
			if (local488) {
				if (local564 < this.aClass14_Sub3_27.anInt4588 && this.aClass14_Sub3_27.anInt4588 > local660) {
					local490 = false;
				} else {
					@Pc(747) int local747;
					@Pc(757) int local757;
					@Pc(768) int local768;
					if (this.aClass14_Sub3_27.anInt4588 > local564) {
						local747 = (local660 - this.aClass14_Sub3_27.anInt4588 << 16) / (local660 - local564);
						local757 = (local747 * (local622 - local526) >> 16) + local622;
						local768 = (local747 * (local641 - local545) >> 16) + local641;
						arg1.anInt7042 = this.aClass14_Sub3_27.anInt4601 + this.aClass14_Sub3_27.anInt4570 * local757 / this.aClass14_Sub3_27.anInt4588;
						arg1.anInt7044 = this.aClass14_Sub3_27.anInt4567 * local768 / this.aClass14_Sub3_27.anInt4588 + this.aClass14_Sub3_27.anInt4573;
					} else if (local660 < this.aClass14_Sub3_27.anInt4588) {
						local747 = (local564 - this.aClass14_Sub3_27.anInt4588 << 16) / (local564 - local660);
						local757 = ((local526 - local622) * local747 >> 16) + local526;
						local768 = (local747 * (local545 - local641) >> 16) + local545;
						arg1.anInt7042 = local757 * this.aClass14_Sub3_27.anInt4570 / this.aClass14_Sub3_27.anInt4588 + this.aClass14_Sub3_27.anInt4601;
						arg1.anInt7044 = this.aClass14_Sub3_27.anInt4567 * local768 / this.aClass14_Sub3_27.anInt4588 + this.aClass14_Sub3_27.anInt4573;
					}
				}
			}
			if (local490) {
				if (local564 <= local660) {
					arg1.anInt7041 = this.aClass14_Sub3_27.anInt4601 + (local622 + this.aShort68) * this.aClass14_Sub3_27.anInt4570 / local660 - arg1.anInt7043;
				} else {
					arg1.anInt7041 = this.aClass14_Sub3_27.anInt4601 + this.aClass14_Sub3_27.anInt4570 * (this.aShort68 + local526) / local564 - arg1.anInt7042;
				}
				arg1.aBoolean491 = true;
			}
		}
		this.aClass14_Sub3_27.method3913();
		this.aClass14_Sub3_27.method3907(local16);
		this.method4950();
		this.aClass14_Sub3_27.method3963();
		this.method4951();
	}

	@OriginalMember(owner = "client!mo", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass14_Sub3_27.anInterface4_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5776; local11++) {
			if (arg0 == this.aShortArray63[local11]) {
				this.aShortArray63[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class313 local52 = local9.method4234(arg0 & 0xFFFF);
			local39 = local52.aByte101;
			local41 = local52.aByte100;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class313 local73 = local9.method4234(arg1 & 0xFFFF);
			local60 = local73.aByte101;
			local62 = local73.aByte100;
		}
		if (!(local60 != local39 | local41 != local62)) {
			return;
		}
		if (this.aClass75Array1 != null) {
			for (@Pc(98) int local98 = 0; local98 < this.anInt5795; local98++) {
				@Pc(105) Class75 local105 = this.aClass75Array1[local98];
				@Pc(110) Class269 local110 = this.aClass269Array1[local98];
				local110.anInt7370 = Static171.anIntArray212[this.aShortArray58[local105.anInt1921] & 0xFFFF] & 0xFFFFFF | local110.anInt7370 & 0xFF000000;
			}
		}
		if (this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mo", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean404) {
			this.method4949();
		}
		@Pc(16) int local16 = this.aShort67 + arg4;
		@Pc(21) int local21 = this.aShort71 + arg4;
		@Pc(27) int local27 = arg6 + this.aShort66;
		@Pc(32) int local32 = this.aShort73 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9641 + local21 >> arg2.anInt9638 >= arg2.anInt9640 || local27 < 0 || arg2.anInt9639 <= local32 + arg2.anInt9641 >> arg2.anInt9638)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9641 + local21 >> arg3.anInt9638 >= arg3.anInt9640 || local27 < 0 || arg3.anInt9639 <= local32 + arg3.anInt9641 >> arg3.anInt9638) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9638;
			local21 = local21 + arg2.anInt9641 - 1 >> arg2.anInt9638;
			local27 >>= arg2.anInt9638;
			local32 = arg2.anInt9641 + local32 - 1 >> arg2.anInt9638;
			if (arg5 == arg2.JA(local16, local27) && arg5 == arg2.JA(local21, local27) && arg5 == arg2.JA(local16, local32) && arg2.JA(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(204) int local204;
		if (arg0 == 1) {
			for (local204 = 0; local204 < this.anInt5765; local204++) {
				this.anIntArray430[local204] = this.anIntArray430[local204] + arg2.sa(this.anIntArray429[local204] + arg4, this.anIntArray433[local204] + arg6) - arg5;
			}
		} else {
			@Pc(253) int local253;
			@Pc(264) int local264;
			if (arg0 == 2) {
				@Pc(245) short local245 = this.aShort72;
				if (local245 == 0) {
					return;
				}
				for (local253 = 0; local253 < this.anInt5765; local253++) {
					local264 = (this.anIntArray430[local253] << 16) / local245;
					if (local264 < arg1) {
						this.anIntArray430[local253] += (arg1 - local264) * (-arg5 + arg2.sa(arg4 + this.anIntArray429[local253], arg6 + this.anIntArray433[local253])) / arg1;
					}
				}
			} else {
				@Pc(347) int local347;
				if (arg0 == 3) {
					local204 = (arg1 & 0xFF) * 4;
					local253 = (arg1 >> 8 & 0xFF) * 4;
					local264 = (arg1 >> 16 & 0xFF) << 6;
					local347 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local204 >> 1) < 0 || arg2.anInt9640 << arg2.anInt9638 <= arg2.anInt9641 + (local204 >> 1) + arg4 || arg6 - (local253 >> 1) < 0 || arg2.anInt9641 + (local253 >> 1) + arg6 >= arg2.anInt9639 << arg2.anInt9638) {
						return;
					}
					this.method7269(local264, local253, local204, arg5, arg2, local347, arg6, arg4);
				} else if (arg0 == 4) {
					local204 = this.aShort70 - this.aShort72;
					for (local253 = 0; local253 < this.anInt5765; local253++) {
						this.anIntArray430[local253] = this.anIntArray430[local253] + arg3.sa(arg4 + this.anIntArray429[local253], arg6 + this.anIntArray433[local253]) + local204 - arg5;
					}
				} else if (arg0 == 5) {
					local204 = this.aShort70 - this.aShort72;
					for (local253 = 0; local253 < this.anInt5765; local253++) {
						local264 = arg4 + this.anIntArray429[local253];
						local347 = arg6 + this.anIntArray433[local253];
						@Pc(352) int local352 = arg2.sa(local264, local347);
						@Pc(357) int local357 = arg3.sa(local264, local347);
						@Pc(364) int local364 = local352 - arg1 - local357;
						this.anIntArray430[local253] = (local364 * ((this.anIntArray430[local253] << 8) / local204) >> 8) + local352 - arg5;
					}
				}
			}
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort74;
	}

	@OriginalMember(owner = "client!mo", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class6_Sub2_Sub14 Z(@OriginalArg(0) Class6_Sub2_Sub14 arg0) {
		if (this.anInt5784 == 0) {
			return null;
		}
		if (!this.aBoolean404) {
			this.method4949();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass14_Sub3_27.anInt4583 <= 0) {
			local40 = this.aShort67 - (this.aShort72 * this.aClass14_Sub3_27.anInt4583 >> 8) >> this.aClass14_Sub3_27.anInt4556;
			local57 = this.aShort71 - (this.aShort70 * this.aClass14_Sub3_27.anInt4583 >> 8) >> this.aClass14_Sub3_27.anInt4556;
		} else {
			local40 = this.aShort67 - (this.aShort70 * this.aClass14_Sub3_27.anInt4583 >> 8) >> this.aClass14_Sub3_27.anInt4556;
			local57 = this.aShort71 - (this.aClass14_Sub3_27.anInt4583 * this.aShort72 >> 8) >> this.aClass14_Sub3_27.anInt4556;
		}
		@Pc(117) int local117;
		@Pc(133) int local133;
		if (this.aClass14_Sub3_27.anInt4594 <= 0) {
			local117 = this.aShort66 - (this.aShort72 * this.aClass14_Sub3_27.anInt4594 >> 8) >> this.aClass14_Sub3_27.anInt4556;
			local133 = this.aShort73 - (this.aShort70 * this.aClass14_Sub3_27.anInt4594 >> 8) >> this.aClass14_Sub3_27.anInt4556;
		} else {
			local117 = this.aShort66 - (this.aClass14_Sub3_27.anInt4594 * this.aShort70 >> 8) >> this.aClass14_Sub3_27.anInt4556;
			local133 = this.aShort73 - (this.aClass14_Sub3_27.anInt4594 * this.aShort72 >> 8) >> this.aClass14_Sub3_27.anInt4556;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(182) int local182 = local133 + 1 - local117;
		@Pc(185) Class6_Sub2_Sub14_Sub2 local185 = (Class6_Sub2_Sub14_Sub2) arg0;
		@Pc(195) Class6_Sub2_Sub14_Sub2 local195;
		if (local185 != null && local185.method7413(local176, local182)) {
			local195 = local185;
			local185.method7411();
		} else {
			local195 = new Class6_Sub2_Sub14_Sub2(this.aClass14_Sub3_27, local176, local182);
		}
		local195.method7410(local133, local40, local57, local117);
		this.method4954(local195);
		return local195;
	}

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5765; local15++) {
			local34 = local9 * this.anIntArray433[local15] + this.anIntArray429[local15] * local13 >> 14;
			this.anIntArray433[local15] = local13 * this.anIntArray433[local15] - this.anIntArray429[local15] * local9 >> 14;
			this.anIntArray429[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5784; local34++) {
			@Pc(88) int local88 = local13 * this.aShortArray62[local34] + this.aShortArray57[local34] * local9 >> 14;
			this.aShortArray57[local34] = (short) (this.aShortArray57[local34] * local13 - this.aShortArray62[local34] * local9 >> 14);
			this.aShortArray62[local34] = (short) local88;
		}
		if (this.lb == null && this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
		}
		if (this.lb != null) {
			this.lb.anInterface1_1 = null;
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method7258(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class20_Sub2 local8 = (Class20_Sub2) arg0;
		if (this.anInt5776 == 0 || local8.anInt5776 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5765;
		@Pc(21) int[] local21 = local8.anIntArray429;
		@Pc(24) int[] local24 = local8.anIntArray430;
		@Pc(27) int[] local27 = local8.anIntArray433;
		@Pc(30) short[] local30 = local8.aShortArray62;
		@Pc(33) short[] local33 = local8.aShortArray67;
		@Pc(36) short[] local36 = local8.aShortArray57;
		@Pc(39) byte[] local39 = local8.aByteArray68;
		@Pc(46) short[] local46;
		@Pc(50) short[] local50;
		@Pc(44) short[] local44;
		@Pc(48) byte[] local48;
		if (this.aClass227_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local46 = this.aClass227_1.aShortArray78;
			local50 = this.aClass227_1.aShortArray80;
			local48 = this.aClass227_1.aByteArray78;
			local44 = this.aClass227_1.aShortArray79;
		}
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(73) short[] local73;
		@Pc(77) byte[] local77;
		if (local8.aClass227_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local77 = local8.aClass227_1.aByteArray78;
			local73 = local8.aClass227_1.aShortArray79;
			local79 = local8.aClass227_1.aShortArray78;
			local75 = local8.aClass227_1.aShortArray80;
		}
		@Pc(100) int[] local100 = local8.anIntArray432;
		@Pc(103) short[] local103 = local8.aShortArray61;
		if (!local8.aBoolean404) {
			local8.method4949();
		}
		@Pc(112) short local112 = local8.aShort72;
		@Pc(115) short local115 = local8.aShort70;
		@Pc(118) short local118 = local8.aShort67;
		@Pc(121) short local121 = local8.aShort71;
		@Pc(124) short local124 = local8.aShort66;
		@Pc(127) short local127 = local8.aShort73;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5765; local129++) {
			@Pc(139) int local139 = this.anIntArray430[local129] - arg2;
			if (local112 <= local139 && local115 >= local139) {
				@Pc(163) int local163 = this.anIntArray429[local129] - arg1;
				if (local163 >= local118 && local163 <= local121) {
					@Pc(183) int local183 = this.anIntArray433[local129] - arg3;
					if (local183 >= local124 && local127 >= local183) {
						@Pc(197) int local197 = -1;
						@Pc(202) int local202 = this.anIntArray432[local129];
						@Pc(209) int local209 = this.anIntArray432[local129 + 1];
						for (@Pc(211) int local211 = local202; local211 < local209; local211++) {
							local197 = this.aShortArray61[local211] - 1;
							if (local197 == -1 || this.aByteArray68[local197] != 0) {
								break;
							}
						}
						if (local197 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local18; local244++) {
								if (local21[local244] == local163 && local27[local244] == local183 && local24[local244] == local139) {
									local209 = local100[local244 + 1];
									local202 = local100[local244];
									@Pc(285) int local285 = -1;
									for (@Pc(287) int local287 = local202; local287 < local209; local287++) {
										local285 = local103[local287] - 1;
										if (local285 == -1 || local39[local285] != 0) {
											break;
										}
									}
									if (local285 != -1) {
										if (local46 == null) {
											this.aClass227_1 = new Class227();
											local46 = this.aClass227_1.aShortArray78 = Static320.method5060(this.aShortArray62);
											local50 = this.aClass227_1.aShortArray80 = Static320.method5060(this.aShortArray67);
											local44 = this.aClass227_1.aShortArray79 = Static320.method5060(this.aShortArray57);
											local48 = this.aClass227_1.aByteArray78 = Static78.method1611(this.aByteArray68);
										}
										if (local79 == null) {
											@Pc(364) Class227 local364 = local8.aClass227_1 = new Class227();
											local79 = local364.aShortArray78 = Static320.method5060(local30);
											local75 = local364.aShortArray80 = Static320.method5060(local33);
											local73 = local364.aShortArray79 = Static320.method5060(local36);
											local77 = local364.aByteArray78 = Static78.method1611(local39);
										}
										@Pc(397) short local397 = this.aShortArray62[local197];
										@Pc(402) short local402 = this.aShortArray67[local197];
										@Pc(407) short local407 = this.aShortArray57[local197];
										local202 = local100[local244];
										local209 = local100[local244 + 1];
										@Pc(422) byte local422 = this.aByteArray68[local197];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local202; local424 < local209; local424++) {
											local432 = local103[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local77[local432] != 0) {
												local79[local432] += local397;
												local75[local432] += local402;
												local73[local432] += local407;
												local77[local432] += local422;
											}
										}
										local422 = local39[local285];
										local202 = this.anIntArray432[local129];
										local209 = this.anIntArray432[local129 + 1];
										local397 = local30[local285];
										local402 = local33[local285];
										local407 = local36[local285];
										for (local432 = local202; local432 < local209; local432++) {
											@Pc(522) int local522 = this.aShortArray61[local432] - 1;
											if (local522 == -1) {
												break;
											}
											if (local48[local522] != 0) {
												local46[local522] += local397;
												local50[local522] += local402;
												local44[local522] += local407;
												local48[local522] += local422;
											}
										}
										if (this.lb == null && this.aClass45_5 != null) {
											this.aClass45_5.anInterface1_1 = null;
										}
										if (this.lb != null) {
											this.lb.anInterface1_1 = null;
										}
										if (local8.lb == null && local8.aClass45_5 != null) {
											local8.aClass45_5.anInterface1_1 = null;
										}
										if (local8.lb != null) {
											local8.lb.anInterface1_1 = null;
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

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "()[Lclient!et;")
	@Override
	public Class85[] method7267() {
		return this.aClass85Array4;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "()[Lclient!fd;")
	@Override
	public Class90[] method7261() {
		return this.aClass90Array4;
	}

	@OriginalMember(owner = "client!mo", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5753; local3++) {
			this.anIntArray429[local3] = this.anIntArray429[local3] + 7 >> 4;
			this.anIntArray430[local3] = this.anIntArray430[local3] + 7 >> 4;
			this.anIntArray433[local3] = this.anIntArray433[local3] + 7 >> 4;
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray56 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5753; local12++) {
			this.anIntArray429[local12] <<= 0x4;
			this.anIntArray430[local12] <<= 0x4;
			this.anIntArray433[local12] <<= 0x4;
		}
		Static424.anInt7397 = 0;
		Static324.anInt7485 = 0;
		Static431.anInt7513 = 0;
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static424.anInt7397 = 0;
			local11 = 0;
			Static431.anInt7513 = 0;
			Static324.anInt7485 = 0;
			for (local17 = 0; local17 < this.anInt5765; local17++) {
				Static424.anInt7397 += this.anIntArray429[local17];
				Static431.anInt7513 += this.anIntArray430[local17];
				Static324.anInt7485 += this.anIntArray433[local17];
				local11++;
			}
			if (local11 > 0) {
				Static424.anInt7397 = Static424.anInt7397 / local11 + arg1;
				Static324.anInt7485 = Static324.anInt7485 / local11 + arg3;
				Static431.anInt7513 = Static431.anInt7513 / local11 + arg2;
			} else {
				Static424.anInt7397 = arg1;
				Static324.anInt7485 = arg3;
				Static431.anInt7513 = arg2;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt5765; local11++) {
				this.anIntArray429[local11] += arg1;
				this.anIntArray430[local11] += arg2;
				this.anIntArray433[local11] += arg3;
			}
		} else {
			@Pc(156) int local156;
			@Pc(174) int local174;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt5765; local11++) {
					this.anIntArray429[local11] -= Static424.anInt7397;
					this.anIntArray430[local11] -= Static431.anInt7513;
					this.anIntArray433[local11] -= Static324.anInt7485;
					if (arg3 != 0) {
						local17 = Class6_Sub2_Sub7.anIntArray178[arg3];
						local156 = Class6_Sub2_Sub7.anIntArray177[arg3];
						local174 = this.anIntArray429[local11] * local156 + this.anIntArray430[local11] * local17 + 16383 >> 14;
						this.anIntArray430[local11] = local156 * this.anIntArray430[local11] + 16383 - this.anIntArray429[local11] * local17 >> 14;
						this.anIntArray429[local11] = local174;
					}
					if (arg1 != 0) {
						local17 = Class6_Sub2_Sub7.anIntArray178[arg1];
						local156 = Class6_Sub2_Sub7.anIntArray177[arg1];
						local174 = local156 * this.anIntArray430[local11] + 16383 - local17 * this.anIntArray433[local11] >> 14;
						this.anIntArray433[local11] = local17 * this.anIntArray430[local11] + this.anIntArray433[local11] * local156 + 16383 >> 14;
						this.anIntArray430[local11] = local174;
					}
					if (arg2 != 0) {
						local17 = Class6_Sub2_Sub7.anIntArray178[arg2];
						local156 = Class6_Sub2_Sub7.anIntArray177[arg2];
						local174 = this.anIntArray429[local11] * local156 + this.anIntArray433[local11] * local17 + 16383 >> 14;
						this.anIntArray433[local11] = this.anIntArray433[local11] * local156 + 16383 - this.anIntArray429[local11] * local17 >> 14;
						this.anIntArray429[local11] = local174;
					}
					this.anIntArray429[local11] += Static424.anInt7397;
					this.anIntArray430[local11] += Static431.anInt7513;
					this.anIntArray433[local11] += Static324.anInt7485;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt5765; local11++) {
					this.anIntArray429[local11] -= Static424.anInt7397;
					this.anIntArray430[local11] -= Static431.anInt7513;
					this.anIntArray433[local11] -= Static324.anInt7485;
					this.anIntArray429[local11] = arg1 * this.anIntArray429[local11] / 128;
					this.anIntArray430[local11] = arg2 * this.anIntArray430[local11] / 128;
					this.anIntArray433[local11] = arg3 * this.anIntArray433[local11] / 128;
					this.anIntArray429[local11] += Static424.anInt7397;
					this.anIntArray430[local11] += Static431.anInt7513;
					this.anIntArray433[local11] += Static324.anInt7485;
				}
			} else {
				@Pc(499) Class75 local499;
				@Pc(504) Class269 local504;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt5776; local11++) {
						local17 = arg1 * 8 + (this.aByteArray67[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray67[local11] = (byte) local17;
					}
					if (this.aClass45_5 != null) {
						this.aClass45_5.anInterface1_1 = null;
					}
					if (this.aClass75Array1 != null) {
						for (local17 = 0; local17 < this.anInt5795; local17++) {
							local499 = this.aClass75Array1[local17];
							local504 = this.aClass269Array1[local17];
							local504.anInt7370 = 255 - (this.aByteArray67[local499.anInt1921] & 0xFF) << 24 | local504.anInt7370 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt5776; local11++) {
						local17 = this.aShortArray58[local11] & 0xFFFF;
						local156 = local17 >> 10 & 0x3F;
						local174 = local17 >> 7 & 0x7;
						local174 += arg2 / 4;
						@Pc(567) int local567 = arg1 + local156 & 0x3F;
						@Pc(571) int local571 = local17 & 0x7F;
						if (local174 < 0) {
							local174 = 0;
						} else if (local174 > 7) {
							local174 = 7;
						}
						local571 += arg3;
						if (local571 < 0) {
							local571 = 0;
						} else if (local571 > 127) {
							local571 = 127;
						}
						this.aShortArray58[local11] = (short) (local571 | local174 << 7 | local567 << 10);
					}
					if (this.aClass45_5 != null) {
						this.aClass45_5.anInterface1_1 = null;
					}
					if (this.aClass75Array1 != null) {
						for (local17 = 0; local17 < this.anInt5795; local17++) {
							local499 = this.aClass75Array1[local17];
							local504 = this.aClass269Array1[local17];
							local504.anInt7370 = local504.anInt7370 & 0xFF000000 | Static171.anIntArray212[this.aShortArray58[local499.anInt1921] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(683) Class269 local683;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt5795; local11++) {
							local683 = this.aClass269Array1[local11];
							local683.anInt7371 += arg2;
							local683.anInt7377 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt5795; local11++) {
							local683 = this.aClass269Array1[local11];
							local683.anInt7375 = arg1 * local683.anInt7375 >> 7;
							local683.anInt7372 = arg2 * local683.anInt7372 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt5795; local11++) {
							local683 = this.aClass269Array1[local11];
							local683.anInt7373 = arg1 + local683.anInt7373 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(SIBII)I")
	private int method4953(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(17) int local17 = Static171.anIntArray212[Static82.method1635(arg3, arg1)];
		if (arg0 != -1) {
			@Pc(29) Class313 local29 = this.aClass14_Sub3_27.anInterface4_15.method4234(arg0 & 0xFFFF);
			@Pc(34) int local34 = local29.aByte101 & 0xFF;
			@Pc(50) int local50;
			@Pc(71) int local71;
			if (local34 != 0) {
				if (arg1 < 0) {
					local50 = 0;
				} else if (arg1 <= 127) {
					local50 = arg1 * 131586;
				} else {
					local50 = 16777215;
				}
				if (local34 == 256) {
					local17 = local50;
				} else {
					local71 = 256 - local34;
					local17 = (local34 * (local50 & 0xFF00) + local71 * (local17 & 0xFF00) & 0xFF0000) + (local71 * (local17 & 0xFF00FF) + local34 * (local50 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local50 = local29.aByte100 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(120) int local120 = (local17 >> 16 & 0xFF) * local50;
				if (local120 > 65535) {
					local120 = 65535;
				}
				local71 = (local17 >> 8 & 0xFF) * local50;
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(148) int local148 = (local17 & 0xFF) * local50;
				if (local148 > 65535) {
					local148 = 65535;
				}
				local17 = (local148 >> 8) + ((local120 & 0x4400FF00) << 8) + (local71 & 0xFF00);
			}
		}
		return (local17 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!mo", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!uu;)V")
	private void method4954(@OriginalArg(1) Class6_Sub2_Sub14_Sub2 arg0) {
		if (this.aClass14_Sub3_27.anIntArray274.length < this.anInt5784) {
			this.aClass14_Sub3_27.anIntArray274 = new int[this.anInt5784];
			this.aClass14_Sub3_27.anIntArray275 = new int[this.anInt5784];
		}
		@Pc(32) int[] local32 = this.aClass14_Sub3_27.anIntArray274;
		@Pc(36) int[] local36 = this.aClass14_Sub3_27.anIntArray275;
		@Pc(64) int local64;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt5765; local38++) {
			local64 = (this.anIntArray429[local38] - (this.aClass14_Sub3_27.anInt4583 * this.anIntArray430[local38] >> 8) >> this.aClass14_Sub3_27.anInt4556) - arg0.anInt9058;
			@Pc(89) int local89 = (this.anIntArray433[local38] - (this.aClass14_Sub3_27.anInt4594 * this.anIntArray430[local38] >> 8) >> this.aClass14_Sub3_27.anInt4556) - arg0.anInt9053;
			@Pc(94) int local94 = this.anIntArray432[local38];
			@Pc(101) int local101 = this.anIntArray432[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray61[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local64;
				local36[local112] = local89;
			}
		}
		for (local64 = 0; local64 < this.anInt5750; local64++) {
			if (this.aByteArray67 == null || this.aByteArray67[local64] <= 128) {
				@Pc(155) short local155 = this.aShortArray64[local64];
				@Pc(160) short local160 = this.aShortArray60[local64];
				@Pc(165) short local165 = this.aShortArray65[local64];
				local103 = local32[local155];
				local112 = local32[local160];
				@Pc(177) int local177 = local32[local165];
				@Pc(181) int local181 = local36[local155];
				@Pc(185) int local185 = local36[local160];
				@Pc(189) int local189 = local36[local165];
				if ((local103 - local112) * (local185 - local189) - (local177 - local112) * (local185 - local181) > 0) {
					arg0.method7412(local185, local177, local112, local103, local181, local189);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		this.anInt5789 = arg0;
		if (this.aClass227_1 != null && (this.anInt5789 & 0x10000) == 0) {
			this.aByteArray68 = this.aClass227_1.aByteArray78;
			this.aShortArray67 = this.aClass227_1.aShortArray80;
			this.aShortArray62 = this.aClass227_1.aShortArray78;
			this.aShortArray57 = this.aClass227_1.aShortArray79;
			this.aClass227_1 = null;
		}
		this.aBoolean405 = true;
		this.method4948();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class20 method7264(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class20_Sub2 local18;
		@Pc(14) Class20_Sub2 local14;
		if (arg0 == 1) {
			local14 = this.aClass14_Sub3_27.aClass20_Sub2_5;
			local18 = this.aClass14_Sub3_27.aClass20_Sub2_10;
		} else if (arg0 == 2) {
			local18 = this.aClass14_Sub3_27.aClass20_Sub2_8;
			local14 = this.aClass14_Sub3_27.aClass20_Sub2_9;
		} else if (arg0 == 3) {
			local14 = this.aClass14_Sub3_27.aClass20_Sub2_3;
			local18 = this.aClass14_Sub3_27.aClass20_Sub2_6;
		} else if (arg0 == 4) {
			local18 = this.aClass14_Sub3_27.aClass20_Sub2_4;
			local14 = this.aClass14_Sub3_27.aClass20_Sub2_2;
		} else if (arg0 == 5) {
			local14 = this.aClass14_Sub3_27.aClass20_Sub2_7;
			local18 = this.aClass14_Sub3_27.aClass20_Sub2_1;
		} else {
			local18 = local14 = new Class20_Sub2(this.aClass14_Sub3_27);
		}
		return this.method4958(local18, arg0 != 0, local14, arg1, arg2);
	}

	@OriginalMember(owner = "client!mo", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5776; local3++) {
			if (arg0 == this.aShortArray58[local3]) {
				this.aShortArray58[local3] = arg1;
			}
		}
		if (this.aClass75Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt5795; local38++) {
				@Pc(45) Class75 local45 = this.aClass75Array1[local38];
				@Pc(50) Class269 local50 = this.aClass269Array1[local38];
				local50.anInt7370 = local50.anInt7370 & 0xFF000000 | Static171.anIntArray212[this.aShortArray58[local45.anInt1921] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!mo", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		if (this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
		}
		this.aShort69 = (short) arg0;
		if (this.lb != null) {
			this.lb.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean404) {
			this.method4949();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "()V")
	@Override
	public void method7271() {
		if (this.anInt5784 <= 0 || this.anInt5750 <= 0) {
			return;
		}
		this.method4946(false);
		if ((this.aByte49 & 0x10) == 0 && this.aClass122_1.anInterface24_1 == null) {
			this.method4959(false);
		}
		this.method4948();
	}

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5765; local3++) {
			if (arg0 != 128) {
				this.anIntArray429[local3] = arg0 * this.anIntArray429[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray430[local3] = arg1 * this.anIntArray430[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray433[local3] = arg2 * this.anIntArray433[local3] >> 7;
			}
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!q;Lclient!po;II)V")
	@Override
	public void method7259(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5784 == 0) {
			return;
		}
		@Pc(13) Class54_Sub2 local13 = this.aClass14_Sub3_27.aClass54_Sub2_4;
		if (!this.aBoolean404) {
			this.method4949();
		}
		@Pc(22) Class54_Sub2 local22 = (Class54_Sub2) arg0;
		Static155.aFloat67 = local13.aFloat122 * local22.aFloat129 + local13.aFloat123 * local22.aFloat120 + local13.aFloat127 * local22.aFloat122;
		Static545.aFloat192 = local13.aFloat127 * local22.aFloat121 + local22.aFloat118 * local13.aFloat122 + local13.aFloat123 * local22.aFloat128 + local13.aFloat121;
		@Pc(69) float local69 = Static545.aFloat192 + Static155.aFloat67 * (float) this.aShort72;
		@Pc(77) float local77 = Static545.aFloat192 + Static155.aFloat67 * (float) this.aShort70;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = (float) this.aShort68 + local69;
			local94 = (float) -this.aShort68 + local77;
		} else {
			local94 = local69 - (float) this.aShort68;
			local87 = (float) this.aShort68 + local77;
		}
		if (this.aClass14_Sub3_27.aFloat101 <= local94 || local87 <= (float) this.aClass14_Sub3_27.anInt4588) {
			return;
		}
		Static257.aFloat116 = local13.aFloat120 * local22.aFloat129 + local13.aFloat126 * local22.aFloat120 + local22.aFloat122 * local13.aFloat119;
		Static550.aFloat194 = local13.aFloat128 + local22.aFloat128 * local13.aFloat126 + local22.aFloat118 * local13.aFloat120 + local22.aFloat121 * local13.aFloat119;
		@Pc(170) float local170 = Static550.aFloat194 + (float) this.aShort72 * Static257.aFloat116;
		@Pc(178) float local178 = Static550.aFloat194 + (float) this.aShort70 * Static257.aFloat116;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local204 = (float) this.aClass14_Sub3_27.anInt4570 * ((float) -this.aShort68 + local178);
			local193 = ((float) this.aShort68 + local170) * (float) this.aClass14_Sub3_27.anInt4570;
		} else {
			local193 = (float) this.aClass14_Sub3_27.anInt4570 * (local178 + (float) this.aShort68);
			local204 = (float) this.aClass14_Sub3_27.anInt4570 * (local170 - (float) this.aShort68);
		}
		if (local204 / (float) arg2 >= this.aClass14_Sub3_27.aFloat95 || this.aClass14_Sub3_27.aFloat87 >= local193 / (float) arg2) {
			return;
		}
		Static313.aFloat136 = local13.aFloat125 * local22.aFloat120 + local22.aFloat129 * local13.aFloat129 + local13.aFloat124 * local22.aFloat122;
		Static270.aFloat130 = local22.aFloat118 * local13.aFloat129 + local22.aFloat128 * local13.aFloat125 + local22.aFloat121 * local13.aFloat124 + local13.aFloat118;
		@Pc(296) float local296 = (float) this.aShort72 * Static313.aFloat136 + Static270.aFloat130;
		@Pc(304) float local304 = (float) this.aShort70 * Static313.aFloat136 + Static270.aFloat130;
		@Pc(330) float local330;
		@Pc(319) float local319;
		if (local304 < local296) {
			local319 = (float) this.aClass14_Sub3_27.anInt4567 * (local296 + (float) this.aShort68);
			local330 = (local304 - (float) this.aShort68) * (float) this.aClass14_Sub3_27.anInt4567;
		} else {
			local319 = (local304 + (float) this.aShort68) * (float) this.aClass14_Sub3_27.anInt4567;
			local330 = (float) this.aClass14_Sub3_27.anInt4567 * (local296 - (float) this.aShort68);
		}
		if (local330 / (float) arg2 >= this.aClass14_Sub3_27.aFloat97 || local319 / (float) arg2 <= this.aClass14_Sub3_27.aFloat99) {
			return;
		}
		if (arg1 != null || this.aClass75Array1 != null) {
			Static226.aFloat113 = local22.aFloat126 * local13.aFloat125 + local13.aFloat129 * local22.aFloat125 + local22.aFloat123 * local13.aFloat124;
			Static379.aFloat155 = local22.aFloat126 * local13.aFloat126 + local13.aFloat120 * local22.aFloat125 + local22.aFloat123 * local13.aFloat119;
			Static541.aFloat156 = local22.aFloat127 * local13.aFloat119 + local22.aFloat119 * local13.aFloat126 + local22.aFloat124 * local13.aFloat120;
			Static517.aFloat186 = local22.aFloat123 * local13.aFloat127 + local22.aFloat126 * local13.aFloat123 + local13.aFloat122 * local22.aFloat125;
			Static150.aFloat66 = local22.aFloat119 * local13.aFloat125 + local13.aFloat129 * local22.aFloat124 + local22.aFloat127 * local13.aFloat124;
			Static559.aFloat196 = local22.aFloat127 * local13.aFloat127 + local22.aFloat119 * local13.aFloat123 + local22.aFloat124 * local13.aFloat122;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.aShort67 + this.aShort71 >> 1;
			@Pc(505) int local505 = this.aShort73 + this.aShort66 >> 1;
			@Pc(524) int local524 = (int) ((float) this.aShort72 * Static257.aFloat116 + Static550.aFloat194 + (float) local497 * Static379.aFloat155 + (float) local505 * Static541.aFloat156);
			@Pc(543) int local543 = (int) (Static150.aFloat66 * (float) local505 + (float) local497 * Static226.aFloat113 + Static270.aFloat130 + Static313.aFloat136 * (float) this.aShort72);
			@Pc(562) int local562 = (int) (Static559.aFloat196 * (float) local505 + (float) this.aShort72 * Static155.aFloat67 + Static545.aFloat192 + (float) local497 * Static517.aFloat186);
			@Pc(581) int local581 = (int) ((float) this.aShort70 * Static257.aFloat116 + Static550.aFloat194 + (float) local497 * Static379.aFloat155 + Static541.aFloat156 * (float) local505);
			@Pc(600) int local600 = (int) (Static313.aFloat136 * (float) this.aShort70 + Static226.aFloat113 * (float) local497 + Static270.aFloat130 + (float) local505 * Static150.aFloat66);
			arg1.anInt7042 = this.aClass14_Sub3_27.anInt4601 + this.aClass14_Sub3_27.anInt4570 * local524 / arg2;
			arg1.anInt7043 = this.aClass14_Sub3_27.anInt4601 + this.aClass14_Sub3_27.anInt4570 * local581 / arg2;
			arg1.anInt7045 = this.aClass14_Sub3_27.anInt4573 + local600 * this.aClass14_Sub3_27.anInt4567 / arg2;
			arg1.anInt7044 = this.aClass14_Sub3_27.anInt4573 + local543 * this.aClass14_Sub3_27.anInt4567 / arg2;
			@Pc(673) int local673 = (int) (Static545.aFloat192 + (float) local497 * Static517.aFloat186 + Static155.aFloat67 * (float) this.aShort70 + Static559.aFloat196 * (float) local505);
			if (local562 < this.aClass14_Sub3_27.anInt4588 && local673 < this.aClass14_Sub3_27.anInt4588) {
				arg1.anInt7041 = (local524 + this.aShort68) * this.aClass14_Sub3_27.anInt4570 / arg2 + this.aClass14_Sub3_27.anInt4601 - arg1.anInt7042;
				arg1.aBoolean491 = true;
			}
		}
		this.aClass14_Sub3_27.method3950((float) arg2);
		this.aClass14_Sub3_27.method3908();
		this.aClass14_Sub3_27.method3907(local22);
		this.method4950();
		this.aClass14_Sub3_27.method3963();
		this.method4951();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5776; local7++) {
			local16 = this.aShortArray58[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 -= -(arg3 * (arg2 - local32) >> 7);
			}
			this.aShortArray58[local7] = (short) (local32 | local28 << 7 | local22 << 10);
		}
		if (this.aClass75Array1 != null) {
			for (local16 = 0; local16 < this.anInt5795; local16++) {
				@Pc(111) Class75 local111 = this.aClass75Array1[local16];
				@Pc(116) Class269 local116 = this.aClass269Array1[local16];
				local116.anInt7370 = local116.anInt7370 & 0xFF000000 | Static171.anIntArray212[this.aShortArray58[local111.anInt1921] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIBII)Z")
	private boolean method4956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > arg5 && arg5 < arg6 && arg5 < arg7) {
			return false;
		} else if (arg1 < arg5 && arg5 > arg6 && arg7 < arg5) {
			return false;
		} else if (arg0 < arg3 && arg0 < arg2 && arg4 > arg0) {
			return false;
		} else {
			return arg3 >= arg0 || arg2 >= arg0 || arg4 >= arg0;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFIIIJILclient!nj;II)S")
	private short method4957(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(7) Class220 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray432[arg4];
		@Pc(17) int local17 = this.anIntArray432[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray61[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg5 == Static399.aLongArray13[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray61[local19] = (short) (this.anInt5784 + 1);
		Static399.aLongArray13[local19] = arg5;
		this.aShortArray62[this.anInt5784] = (short) arg8;
		this.aShortArray67[this.anInt5784] = (short) arg7;
		this.aShortArray57[this.anInt5784] = (short) arg2;
		this.aByteArray68[this.anInt5784] = (byte) arg3;
		this.aFloatArray48[this.anInt5784] = arg0;
		this.aFloatArray49[this.anInt5784] = arg1;
		return (short) this.anInt5784++;
	}

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		if (this.aClass45_5 != null) {
			this.aClass45_5.anInterface1_1 = null;
		}
		this.aShort74 = (short) arg0;
	}

	@OriginalMember(owner = "client!mo", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort69;
	}

	@OriginalMember(owner = "client!mo", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub7.anIntArray178[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub7.anIntArray177[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5765; local15++) {
			@Pc(34) int local34 = this.anIntArray433[local15] * local9 + this.anIntArray429[local15] * local13 >> 14;
			this.anIntArray433[local15] = this.anIntArray433[local15] * local13 - local9 * this.anIntArray429[local15] >> 14;
			this.anIntArray429[local15] = local34;
		}
		this.aBoolean404 = false;
		if (this.aClass45_3 != null) {
			this.aClass45_3.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!mo;ZLclient!mo;BIZ)Lclient!ba;")
	private Class20 method4958(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class20_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt5750 = this.anInt5750;
		arg0.anInt5784 = this.anInt5784;
		arg0.anInt5776 = this.anInt5776;
		arg0.anInt5795 = this.anInt5795;
		arg0.aByte49 = 0;
		arg0.aShort74 = this.aShort74;
		arg0.anInt5789 = arg3;
		arg0.anInt5765 = this.anInt5765;
		arg0.aShort69 = this.aShort69;
		arg0.anInt5758 = this.anInt5758;
		arg0.anInt5753 = this.anInt5753;
		@Pc(55) boolean local55 = Static294.method4726(arg3, this.anInt5758);
		@Pc(61) boolean local61 = Static167.method3163(arg3, this.anInt5758);
		@Pc(67) boolean local67 = Static234.method4077(arg3, this.anInt5758);
		@Pc(73) boolean local73 = local61 | local55 | local67;
		@Pc(182) int local182;
		if (local73) {
			if (!local55) {
				arg0.anIntArray429 = this.anIntArray429;
			} else if (arg2.anIntArray429 == null || arg2.anIntArray429.length < this.anInt5753) {
				arg0.anIntArray429 = arg2.anIntArray429 = new int[this.anInt5753];
			} else {
				arg0.anIntArray429 = arg2.anIntArray429;
			}
			if (!local61) {
				arg0.anIntArray430 = this.anIntArray430;
			} else if (arg2.anIntArray430 == null || this.anInt5753 > arg2.anIntArray430.length) {
				arg0.anIntArray430 = arg2.anIntArray430 = new int[this.anInt5753];
			} else {
				arg0.anIntArray430 = arg2.anIntArray430;
			}
			if (!local67) {
				arg0.anIntArray433 = this.anIntArray433;
			} else if (arg2.anIntArray433 == null || this.anInt5753 > arg2.anIntArray433.length) {
				arg0.anIntArray433 = arg2.anIntArray433 = new int[this.anInt5753];
			} else {
				arg0.anIntArray433 = arg2.anIntArray433;
			}
			for (local182 = 0; local182 < this.anInt5753; local182++) {
				if (local55) {
					arg0.anIntArray429[local182] = this.anIntArray429[local182];
				}
				if (local61) {
					arg0.anIntArray430[local182] = this.anIntArray430[local182];
				}
				if (local67) {
					arg0.anIntArray433[local182] = this.anIntArray433[local182];
				}
			}
		} else {
			arg0.anIntArray429 = this.anIntArray429;
			arg0.anIntArray433 = this.anIntArray433;
			arg0.anIntArray430 = this.anIntArray430;
		}
		if (Static297.method992(arg3, this.anInt5758)) {
			if (arg1) {
				arg0.aByte49 = (byte) (arg0.aByte49 | 0x1);
			}
			arg0.aClass45_3 = arg2.aClass45_3;
			arg0.aClass45_3.aByte23 = this.aClass45_3.aByte23;
			arg0.aClass45_3.anInterface1_1 = this.aClass45_3.anInterface1_1;
		} else if (Static493.method6727(arg3, this.anInt5758)) {
			arg0.aClass45_3 = this.aClass45_3;
		} else {
			arg0.aClass45_3 = null;
		}
		if (Static571.method7639(arg3, this.anInt5758)) {
			if (arg2.aShortArray58 == null || arg2.aShortArray58.length < this.anInt5776) {
				arg0.aShortArray58 = arg2.aShortArray58 = new short[this.anInt5776];
			} else {
				arg0.aShortArray58 = arg2.aShortArray58;
			}
			for (local182 = 0; local182 < this.anInt5776; local182++) {
				arg0.aShortArray58[local182] = this.aShortArray58[local182];
			}
		} else {
			arg0.aShortArray58 = this.aShortArray58;
		}
		if (Static38.method1002(arg3, this.anInt5758)) {
			if (arg2.aByteArray67 == null || this.anInt5776 > arg2.aByteArray67.length) {
				arg0.aByteArray67 = arg2.aByteArray67 = new byte[this.anInt5776];
			} else {
				arg0.aByteArray67 = arg2.aByteArray67;
			}
			for (local182 = 0; local182 < this.anInt5776; local182++) {
				arg0.aByteArray67[local182] = this.aByteArray67[local182];
			}
		} else {
			arg0.aByteArray67 = this.aByteArray67;
		}
		if (Static516.method7139(arg3, this.anInt5758)) {
			if (arg1) {
				arg0.aByte49 = (byte) (arg0.aByte49 | 0x2);
			}
			arg0.aClass45_5 = arg2.aClass45_5;
			arg0.aClass45_5.aByte23 = this.aClass45_5.aByte23;
			arg0.aClass45_5.anInterface1_1 = this.aClass45_5.anInterface1_1;
		} else if (Static441.method6277(arg3, this.anInt5758)) {
			arg0.aClass45_5 = this.aClass45_5;
		} else {
			arg0.aClass45_5 = null;
		}
		@Pc(541) int local541;
		if (Static263.method4410(arg3, this.anInt5758)) {
			if (arg2.aShortArray62 == null || arg2.aShortArray62.length < this.anInt5784) {
				local182 = this.anInt5784;
				arg0.aShortArray57 = arg2.aShortArray57 = new short[local182];
				arg0.aShortArray67 = arg2.aShortArray67 = new short[local182];
				arg0.aShortArray62 = arg2.aShortArray62 = new short[local182];
			} else {
				arg0.aShortArray67 = arg2.aShortArray67;
				arg0.aShortArray57 = arg2.aShortArray57;
				arg0.aShortArray62 = arg2.aShortArray62;
			}
			if (this.aClass227_1 == null) {
				for (local182 = 0; local182 < this.anInt5784; local182++) {
					arg0.aShortArray62[local182] = this.aShortArray62[local182];
					arg0.aShortArray67[local182] = this.aShortArray67[local182];
					arg0.aShortArray57[local182] = this.aShortArray57[local182];
				}
			} else {
				if (arg2.aClass227_1 == null) {
					arg2.aClass227_1 = new Class227();
				}
				@Pc(529) Class227 local529 = arg0.aClass227_1 = arg2.aClass227_1;
				if (local529.aShortArray78 == null || this.anInt5784 > local529.aShortArray78.length) {
					local541 = this.anInt5784;
					local529.aShortArray79 = new short[local541];
					local529.aShortArray80 = new short[local541];
					local529.aShortArray78 = new short[local541];
					local529.aByteArray78 = new byte[local541];
				}
				for (local541 = 0; local541 < this.anInt5784; local541++) {
					arg0.aShortArray62[local541] = this.aShortArray62[local541];
					arg0.aShortArray67[local541] = this.aShortArray67[local541];
					arg0.aShortArray57[local541] = this.aShortArray57[local541];
					local529.aShortArray78[local541] = this.aClass227_1.aShortArray78[local541];
					local529.aShortArray80[local541] = this.aClass227_1.aShortArray80[local541];
					local529.aShortArray79[local541] = this.aClass227_1.aShortArray79[local541];
					local529.aByteArray78[local541] = this.aClass227_1.aByteArray78[local541];
				}
			}
			arg0.aByteArray68 = this.aByteArray68;
		} else {
			arg0.aClass227_1 = this.aClass227_1;
			arg0.aByteArray68 = this.aByteArray68;
			arg0.aShortArray57 = this.aShortArray57;
			arg0.aShortArray62 = this.aShortArray62;
			arg0.aShortArray67 = this.aShortArray67;
		}
		if (Static585.method7760(arg3, this.anInt5758)) {
			if (arg1) {
				arg0.aByte49 = (byte) (arg0.aByte49 | 0x4);
			}
			arg0.lb = arg2.lb;
			arg0.lb.aByte23 = this.lb.aByte23;
			arg0.lb.anInterface1_1 = this.lb.anInterface1_1;
		} else if (Static481.method6626(this.anInt5758, arg3)) {
			arg0.lb = this.lb;
		} else {
			arg0.lb = null;
		}
		if (Static474.method7118(arg3, this.anInt5758)) {
			if (arg2.aFloatArray48 == null || arg2.aFloatArray48.length < this.anInt5776) {
				local182 = this.anInt5784;
				arg0.aFloatArray49 = arg2.aFloatArray49 = new float[local182];
				arg0.aFloatArray48 = arg2.aFloatArray48 = new float[local182];
			} else {
				arg0.aFloatArray48 = arg2.aFloatArray48;
				arg0.aFloatArray49 = arg2.aFloatArray49;
			}
			for (local182 = 0; local182 < this.anInt5784; local182++) {
				arg0.aFloatArray48[local182] = this.aFloatArray48[local182];
				arg0.aFloatArray49[local182] = this.aFloatArray49[local182];
			}
		} else {
			arg0.aFloatArray48 = this.aFloatArray48;
			arg0.aFloatArray49 = this.aFloatArray49;
		}
		if (Static318.method4955(this.anInt5758, arg3)) {
			if (arg1) {
				arg0.aByte49 = (byte) (arg0.aByte49 | 0x8);
			}
			arg0.aClass45_4 = arg2.aClass45_4;
			arg0.aClass45_4.aByte23 = this.aClass45_4.aByte23;
			arg0.aClass45_4.anInterface1_1 = this.aClass45_4.anInterface1_1;
		} else if (Static31.method4023(arg3, this.anInt5758)) {
			arg0.aClass45_4 = this.aClass45_4;
		} else {
			arg0.aClass45_4 = null;
		}
		if (Static354.method6852(arg3, this.anInt5758)) {
			if (arg2.aShortArray64 == null || this.anInt5776 > arg2.aShortArray64.length) {
				local182 = this.anInt5776;
				arg0.aShortArray65 = arg2.aShortArray65 = new short[local182];
				arg0.aShortArray64 = arg2.aShortArray64 = new short[local182];
				arg0.aShortArray60 = arg2.aShortArray60 = new short[local182];
			} else {
				arg0.aShortArray60 = arg2.aShortArray60;
				arg0.aShortArray65 = arg2.aShortArray65;
				arg0.aShortArray64 = arg2.aShortArray64;
			}
			for (local182 = 0; local182 < this.anInt5776; local182++) {
				arg0.aShortArray64[local182] = this.aShortArray64[local182];
				arg0.aShortArray60[local182] = this.aShortArray60[local182];
				arg0.aShortArray65[local182] = this.aShortArray65[local182];
			}
		} else {
			arg0.aShortArray65 = this.aShortArray65;
			arg0.aShortArray60 = this.aShortArray60;
			arg0.aShortArray64 = this.aShortArray64;
		}
		if (Static112.method1995(arg3, this.anInt5758)) {
			arg0.aClass122_1 = arg2.aClass122_1;
			if (arg1) {
				arg0.aByte49 = (byte) (arg0.aByte49 | 0x10);
			}
			arg0.aClass122_1.anInterface24_1 = this.aClass122_1.anInterface24_1;
		} else if (Static289.method4659(arg3, this.anInt5758)) {
			arg0.aClass122_1 = this.aClass122_1;
		} else {
			arg0.aClass122_1 = null;
		}
		if (Static190.method3451(this.anInt5758, arg3)) {
			if (arg2.aShortArray63 == null || arg2.aShortArray63.length < this.anInt5776) {
				local182 = this.anInt5776;
				arg0.aShortArray63 = arg2.aShortArray63 = new short[local182];
			} else {
				arg0.aShortArray63 = arg2.aShortArray63;
			}
			for (local182 = 0; local182 < this.anInt5776; local182++) {
				arg0.aShortArray63[local182] = this.aShortArray63[local182];
			}
		} else {
			arg0.aShortArray63 = this.aShortArray63;
		}
		if (!Static565.method5598(this.anInt5758, arg3)) {
			arg0.aClass269Array1 = this.aClass269Array1;
		} else if (arg2.aClass269Array1 == null || this.anInt5795 > arg2.aClass269Array1.length) {
			local182 = this.anInt5795;
			arg0.aClass269Array1 = arg2.aClass269Array1 = new Class269[local182];
			for (local541 = 0; local541 < this.anInt5795; local541++) {
				arg0.aClass269Array1[local541] = this.aClass269Array1[local541].method6087();
			}
		} else {
			arg0.aClass269Array1 = arg2.aClass269Array1;
			for (local182 = 0; local182 < this.anInt5795; local182++) {
				arg0.aClass269Array1[local182].method6088(this.aClass269Array1[local182]);
			}
		}
		arg0.anIntArray432 = this.anIntArray432;
		arg0.anIntArrayArray55 = this.anIntArrayArray55;
		arg0.anIntArray431 = this.anIntArray431;
		arg0.aShortArray61 = this.aShortArray61;
		arg0.aClass85Array4 = this.aClass85Array4;
		arg0.aShortArray66 = this.aShortArray66;
		if (this.aBoolean404) {
			arg0.aShort72 = this.aShort72;
			arg0.aShort66 = this.aShort66;
			arg0.aShort73 = this.aShort73;
			arg0.aShort70 = this.aShort70;
			arg0.aShort71 = this.aShort71;
			arg0.aShort68 = this.aShort68;
			arg0.aShort67 = this.aShort67;
			arg0.aBoolean404 = true;
		} else {
			arg0.aBoolean404 = false;
		}
		arg0.anIntArrayArray56 = this.anIntArrayArray56;
		arg0.aClass75Array1 = this.aClass75Array1;
		arg0.anIntArrayArray54 = this.anIntArrayArray54;
		arg0.aShortArray59 = this.aShortArray59;
		arg0.aClass90Array4 = this.aClass90Array4;
		return arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	private void method4959(@OriginalArg(1) boolean arg0) {
		if (this.anInt5750 * 6 > this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1.aByteArray93.length) {
			this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1 = new Class6_Sub21_Sub1((this.anInt5750 + 100) * 6);
		} else {
			this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1.anInt7338 = 0;
		}
		@Pc(38) Class6_Sub21_Sub1 local38 = this.aClass14_Sub3_27.aClass6_Sub21_Sub1_1;
		@Pc(44) int local44;
		if (this.aClass14_Sub3_27.aBoolean298) {
			for (local44 = 0; local44 < this.anInt5750; local44++) {
				local38.method6052(this.aShortArray64[local44]);
				local38.method6052(this.aShortArray60[local44]);
				local38.method6052(this.aShortArray65[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt5750; local44++) {
				local38.method6032(this.aShortArray64[local44]);
				local38.method6032(this.aShortArray60[local44]);
				local38.method6032(this.aShortArray65[local44]);
			}
		}
		if (local38.anInt7338 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface24_3 == null) {
				this.anInterface24_3 = this.aClass14_Sub3_27.method3941(local38.aByteArray93, local38.anInt7338, true);
			} else {
				this.anInterface24_3.method5683(local38.aByteArray93, local38.anInt7338);
			}
			this.aClass122_1.anInterface24_1 = this.anInterface24_3;
		} else {
			this.aClass122_1.anInterface24_1 = this.aClass14_Sub3_27.method3941(local38.aByteArray93, local38.anInt7338, false);
		}
		if (!arg0) {
			this.aBoolean405 = true;
		}
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt5789;
	}

	@OriginalMember(owner = "client!mo", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static324.anInt7485 = 0;
			Static424.anInt7397 = 0;
			Static431.anInt7513 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray56.length > local38) {
					local52 = this.anIntArrayArray56[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local60]) != 0) {
							Static424.anInt7397 += this.anIntArray429[local60];
							Static431.anInt7513 += this.anIntArray430[local60];
							local30++;
							Static324.anInt7485 += this.anIntArray433[local60];
						}
					}
				}
			}
			if (local30 <= 0) {
				Static324.anInt7485 = arg4;
				Static431.anInt7513 = arg3;
				Static424.anInt7397 = arg2;
			} else {
				Static431.anInt7513 = Static431.anInt7513 / local30 + arg3;
				Static324.anInt7485 = Static324.anInt7485 / local30 + arg4;
				Static424.anInt7397 = Static424.anInt7397 / local30 + arg2;
				Static383.aBoolean87 = true;
			}
			return;
		}
		@Pc(251) int[] local251;
		@Pc(253) int local253;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg7[4] * arg3 + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg3 * arg7[7] + arg2 * arg7[6] + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg2 = local30;
				arg3 = local32;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray56.length) {
					local251 = this.anIntArrayArray56[local32];
					for (local253 = 0; local253 < local251.length; local253++) {
						local54 = local251[local253];
						if (this.aShortArray59 == null || (this.aShortArray59[local54] & arg6) != 0) {
							this.anIntArray429[local54] += arg2;
							this.anIntArray430[local54] += arg3;
							this.anIntArray433[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(372) int local372;
		@Pc(394) int local394;
		@Pc(420) int local420;
		@Pc(451) int local451;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(471) int local471;
		@Pc(479) int local479;
		@Pc(635) int local635;
		@Pc(660) int local660;
		@Pc(664) int local664;
		@Pc(673) int local673;
		@Pc(678) int local678;
		@Pc(682) int local682;
		@Pc(686) int local686;
		@Pc(688) int local688;
		@Pc(821) int[] local821;
		@Pc(823) int local823;
		@Pc(827) int local827;
		@Pc(831) int local831;
		@Pc(833) int local833;
		@Pc(964) int local964;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray56.length > local32) {
						local251 = this.anIntArrayArray56[local32];
						for (local253 = 0; local253 < local251.length; local253++) {
							local54 = local251[local253];
							if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local54]) != 0) {
								this.anIntArray429[local54] -= Static424.anInt7397;
								this.anIntArray430[local54] -= Static431.anInt7513;
								this.anIntArray433[local54] -= Static324.anInt7485;
								if (arg4 != 0) {
									local60 = Class6_Sub2_Sub7.anIntArray178[arg4];
									local372 = Class6_Sub2_Sub7.anIntArray177[arg4];
									local394 = this.anIntArray429[local54] * local372 + this.anIntArray430[local54] * local60 + 16383 >> 14;
									this.anIntArray430[local54] = local372 * this.anIntArray430[local54] + 16383 - this.anIntArray429[local54] * local60 >> 14;
									this.anIntArray429[local54] = local394;
								}
								if (arg2 != 0) {
									local60 = Class6_Sub2_Sub7.anIntArray178[arg2];
									local372 = Class6_Sub2_Sub7.anIntArray177[arg2];
									local394 = local372 * this.anIntArray430[local54] + 16383 - local60 * this.anIntArray433[local54] >> 14;
									this.anIntArray433[local54] = this.anIntArray433[local54] * local372 + local60 * this.anIntArray430[local54] + 16383 >> 14;
									this.anIntArray430[local54] = local394;
								}
								if (arg3 != 0) {
									local60 = Class6_Sub2_Sub7.anIntArray178[arg3];
									local372 = Class6_Sub2_Sub7.anIntArray177[arg3];
									local394 = local60 * this.anIntArray433[local54] + this.anIntArray429[local54] * local372 + 16383 >> 14;
									this.anIntArray433[local54] = local372 * this.anIntArray433[local54] + 16383 - local60 * this.anIntArray429[local54] >> 14;
									this.anIntArray429[local54] = local394;
								}
								this.anIntArray429[local54] += Static424.anInt7397;
								this.anIntArray430[local54] += Static431.anInt7513;
								this.anIntArray433[local54] += Static324.anInt7485;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray56.length > local38) {
							local52 = this.anIntArrayArray56[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray59 == null || (this.aShortArray59[local60] & arg6) != 0) {
									local372 = this.anIntArray432[local60];
									local394 = this.anIntArray432[local60 + 1];
									for (local420 = local372; local420 < local394; local420++) {
										local451 = this.aShortArray61[local420] - 1;
										if (local451 == -1) {
											break;
										}
										if (arg4 != 0) {
											local455 = Class6_Sub2_Sub7.anIntArray178[arg4];
											local459 = Class6_Sub2_Sub7.anIntArray177[arg4];
											local463 = local459 * this.aShortArray62[local451] + this.aShortArray67[local451] * local455 + 16383 >> 14;
											this.aShortArray67[local451] = (short) (local459 * this.aShortArray67[local451] + 16383 - this.aShortArray62[local451] * local455 >> 14);
											this.aShortArray62[local451] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class6_Sub2_Sub7.anIntArray178[arg2];
											local459 = Class6_Sub2_Sub7.anIntArray177[arg2];
											local463 = local459 * this.aShortArray67[local451] + 16383 - local455 * this.aShortArray57[local451] >> 14;
											this.aShortArray57[local451] = (short) (local455 * this.aShortArray67[local451] + this.aShortArray57[local451] * local459 + 16383 >> 14);
											this.aShortArray67[local451] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class6_Sub2_Sub7.anIntArray178[arg3];
											local459 = Class6_Sub2_Sub7.anIntArray177[arg3];
											local463 = local455 * this.aShortArray57[local451] + local459 * this.aShortArray62[local451] + 16383 >> 14;
											this.aShortArray57[local451] = (short) (this.aShortArray57[local451] * local459 + 16383 - this.aShortArray62[local451] * local455 >> 14);
											this.aShortArray62[local451] = (short) local463;
										}
									}
								}
							}
						}
					}
					if (this.lb == null && this.aClass45_5 != null) {
						this.aClass45_5.anInterface1_1 = null;
					}
					if (this.lb != null) {
						this.lb.anInterface1_1 = null;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local253 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static383.aBoolean87) {
					local372 = arg7[6] * Static324.anInt7485 + Static431.anInt7513 * arg7[3] + Static424.anInt7397 * arg7[0] + 8192 >> 14;
					local394 = Static324.anInt7485 * arg7[7] + Static431.anInt7513 * arg7[4] + Static424.anInt7397 * arg7[1] + 8192 >> 14;
					local394 += local54;
					local420 = Static324.anInt7485 * arg7[8] + Static431.anInt7513 * arg7[5] + Static424.anInt7397 * arg7[2] + 8192 >> 14;
					local372 += local253;
					local420 += local60;
					Static424.anInt7397 = local372;
					Static431.anInt7513 = local394;
					Static383.aBoolean87 = false;
					Static324.anInt7485 = local420;
				}
				@Pc(439) int[] local439 = new int[9];
				local394 = Class6_Sub2_Sub7.anIntArray177[arg2];
				local420 = Class6_Sub2_Sub7.anIntArray178[arg2];
				local451 = Class6_Sub2_Sub7.anIntArray177[arg3];
				local455 = Class6_Sub2_Sub7.anIntArray178[arg3];
				local459 = Class6_Sub2_Sub7.anIntArray177[arg4];
				local463 = Class6_Sub2_Sub7.anIntArray178[arg4];
				local471 = local420 * local459 + 8192 >> 14;
				local479 = local420 * local463 + 8192 >> 14;
				local439[8] = local451 * local394 + 8192 >> 14;
				local439[4] = local459 * local394 + 8192 >> 14;
				local439[6] = local479 * local451 + -local455 * local459 + 8192 >> 14;
				local439[0] = local459 * local451 + local455 * local479 + 8192 >> 14;
				local439[7] = local463 * local455 + local471 * local451 + 8192 >> 14;
				local439[5] = -local420;
				local439[2] = local394 * local455 + 8192 >> 14;
				local439[3] = local463 * local394 + 8192 >> 14;
				local439[1] = -local451 * local463 + local455 * local471 + 8192 >> 14;
				@Pc(610) int local610 = -Static424.anInt7397 * local439[0] + local439[1] * -Static431.anInt7513 + local439[2] * -Static324.anInt7485 + 8192 >> 14;
				local635 = -Static431.anInt7513 * local439[4] + -Static424.anInt7397 * local439[3] + -Static324.anInt7485 * local439[5] + 8192 >> 14;
				local660 = local439[7] * -Static431.anInt7513 + local439[6] * -Static424.anInt7397 + -Static324.anInt7485 * local439[8] + 8192 >> 14;
				local664 = Static424.anInt7397 + local610;
				@Pc(669) int local669 = local635 + Static431.anInt7513;
				local673 = Static324.anInt7485 + local660;
				@Pc(676) int[] local676 = new int[9];
				for (local678 = 0; local678 < 3; local678++) {
					for (local682 = 0; local682 < 3; local682++) {
						local686 = 0;
						for (local688 = 0; local688 < 3; local688++) {
							local686 += arg7[local682 * 3 + local688] * local439[local678 * 3 + local688];
						}
						local676[local682 + local678 * 3] = local686 + 8192 >> 14;
					}
				}
				local682 = local253 * local439[0] + local54 * local439[1] + local60 * local439[2] + 8192 >> 14;
				local686 = local439[3] * local253 + local439[4] * local54 + local60 * local439[5] + 8192 >> 14;
				local688 = local60 * local439[8] + local439[6] * local253 + local54 * local439[7] + 8192 >> 14;
				local686 += local669;
				local682 += local664;
				local688 += local673;
				local821 = new int[9];
				for (local823 = 0; local823 < 3; local823++) {
					for (local827 = 0; local827 < 3; local827++) {
						local831 = 0;
						for (local833 = 0; local833 < 3; local833++) {
							local831 += local676[local827 + local833 * 3] * arg7[local823 * 3 + local833];
						}
						local821[local827 + local823 * 3] = local831 + 8192 >> 14;
					}
				}
				local827 = arg7[2] * local688 + local682 * arg7[0] + arg7[1] * local686 + 8192 >> 14;
				local831 = arg7[5] * local688 + arg7[3] * local682 + local686 * arg7[4] + 8192 >> 14;
				local827 += local30;
				local831 += local32;
				local833 = local688 * arg7[8] + arg7[6] * local682 + arg7[7] * local686 + 8192 >> 14;
				local833 += local38;
				for (local964 = 0; local964 < local8; local964++) {
					@Pc(970) int local970 = arg1[local964];
					if (local970 < this.anIntArrayArray56.length) {
						@Pc(980) int[] local980 = this.anIntArrayArray56[local970];
						for (@Pc(982) int local982 = 0; local982 < local980.length; local982++) {
							@Pc(988) int local988 = local980[local982];
							if (this.aShortArray59 == null || (this.aShortArray59[local988] & arg6) != 0) {
								@Pc(1029) int local1029 = this.anIntArray433[local988] * local821[2] + local821[0] * this.anIntArray429[local988] + local821[1] * this.anIntArray430[local988] + 8192 >> 14;
								@Pc(1060) int local1060 = this.anIntArray430[local988] * local821[4] + this.anIntArray429[local988] * local821[3] + this.anIntArray433[local988] * local821[5] + 8192 >> 14;
								@Pc(1064) int local1064 = local1060 + local831;
								@Pc(1068) int local1068 = local1029 + local827;
								@Pc(1100) int local1100 = local821[6] * this.anIntArray429[local988] + local821[7] * this.anIntArray430[local988] + local821[8] * this.anIntArray433[local988] + 8192 >> 14;
								@Pc(1104) int local1104 = local1100 + local833;
								this.anIntArray429[local988] = local1068;
								this.anIntArray430[local988] = local1064;
								this.anIntArray433[local988] = local1104;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2587) Class75 local2587;
			@Pc(2592) Class269 local2592;
			if (arg0 == 5) {
				if (this.anIntArrayArray55 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray55.length) {
							local251 = this.anIntArrayArray55[local32];
							for (local253 = 0; local253 < local251.length; local253++) {
								local54 = local251[local253];
								if (this.aShortArray66 == null || (this.aShortArray66[local54] & arg6) != 0) {
									local60 = arg2 * 8 + (this.aByteArray67[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray67[local54] = (byte) local60;
									if (this.aClass45_5 != null) {
										this.aClass45_5.anInterface1_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass75Array1 != null) {
						for (local32 = 0; local32 < this.anInt5795; local32++) {
							local2587 = this.aClass75Array1[local32];
							local2592 = this.aClass269Array1[local32];
							local2592.anInt7370 = 255 - (this.aByteArray67[local2587.anInt1921] & 0xFF) << 24 | local2592.anInt7370 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2843) Class269 local2843;
				if (arg0 == 8) {
					if (this.anIntArrayArray54 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray54.length) {
								local251 = this.anIntArrayArray54[local32];
								for (local253 = 0; local253 < local251.length; local253++) {
									local2843 = this.aClass269Array1[local251[local253]];
									local2843.anInt7371 += arg3;
									local2843.anInt7377 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray54 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray54.length > local32) {
								local251 = this.anIntArrayArray54[local32];
								for (local253 = 0; local253 < local251.length; local253++) {
									local2843 = this.aClass269Array1[local251[local253]];
									local2843.anInt7375 = local2843.anInt7375 * arg2 >> 7;
									local2843.anInt7372 = arg3 * local2843.anInt7372 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray54 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray54.length) {
							local251 = this.anIntArrayArray54[local32];
							for (local253 = 0; local253 < local251.length; local253++) {
								local2843 = this.aClass269Array1[local251[local253]];
								local2843.anInt7373 = local2843.anInt7373 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray55 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray55.length > local32) {
						local251 = this.anIntArrayArray55[local32];
						for (local253 = 0; local253 < local251.length; local253++) {
							local54 = local251[local253];
							if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local54]) != 0) {
								local60 = this.aShortArray58[local54] & 0xFFFF;
								local372 = local60 >> 10 & 0x3F;
								local394 = local60 >> 7 & 0x7;
								local394 += arg3 / 4;
								@Pc(2700) int local2700 = arg2 + local372 & 0x3F;
								local420 = local60 & 0x7F;
								if (local394 < 0) {
									local394 = 0;
								} else if (local394 > 7) {
									local394 = 7;
								}
								local420 += arg4;
								if (local420 < 0) {
									local420 = 0;
								} else if (local420 > 127) {
									local420 = 127;
								}
								this.aShortArray58[local54] = (short) (local420 | local394 << 7 | local2700 << 10);
								if (this.aClass45_5 != null) {
									this.aClass45_5.anInterface1_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass75Array1 != null) {
					for (local32 = 0; local32 < this.anInt5795; local32++) {
						local2587 = this.aClass75Array1[local32];
						local2592 = this.aClass269Array1[local32];
						local2592.anInt7370 = local2592.anInt7370 & 0xFF000000 | Static171.anIntArray212[this.aShortArray58[local2587.anInt1921] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray56.length) {
					local251 = this.anIntArrayArray56[local32];
					for (local253 = 0; local253 < local251.length; local253++) {
						local54 = local251[local253];
						if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local54]) != 0) {
							this.anIntArray429[local54] -= Static424.anInt7397;
							this.anIntArray430[local54] -= Static431.anInt7513;
							this.anIntArray433[local54] -= Static324.anInt7485;
							this.anIntArray429[local54] = arg2 * this.anIntArray429[local54] >> 7;
							this.anIntArray430[local54] = arg3 * this.anIntArray430[local54] >> 7;
							this.anIntArray433[local54] = this.anIntArray433[local54] * arg4 >> 7;
							this.anIntArray429[local54] += Static424.anInt7397;
							this.anIntArray430[local54] += Static431.anInt7513;
							this.anIntArray433[local54] += Static324.anInt7485;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local253 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static383.aBoolean87) {
				local372 = Static424.anInt7397 * arg7[0] + arg7[3] * Static431.anInt7513 + Static324.anInt7485 * arg7[6] + 8192 >> 14;
				local394 = arg7[7] * Static324.anInt7485 + Static424.anInt7397 * arg7[1] + arg7[4] * Static431.anInt7513 + 8192 >> 14;
				local394 += local54;
				local420 = arg7[8] * Static324.anInt7485 + Static431.anInt7513 * arg7[5] + Static424.anInt7397 * arg7[2] + 8192 >> 14;
				local372 += local253;
				Static431.anInt7513 = local394;
				local420 += local60;
				Static424.anInt7397 = local372;
				Static324.anInt7485 = local420;
				Static383.aBoolean87 = false;
			}
			local372 = arg2 << 15 >> 7;
			local394 = arg3 << 15 >> 7;
			local420 = arg4 << 15 >> 7;
			local451 = -Static424.anInt7397 * local372 + 8192 >> 14;
			local455 = -Static431.anInt7513 * local394 + 8192 >> 14;
			local459 = local420 * -Static324.anInt7485 + 8192 >> 14;
			local463 = Static424.anInt7397 + local451;
			local471 = local455 + Static431.anInt7513;
			local479 = Static324.anInt7485 + local459;
			@Pc(2020) int[] local2020 = new int[] { local372 * arg7[0] + 8192 >> 14, local372 * arg7[3] + 8192 >> 14, arg7[6] * local372 + 8192 >> 14, local394 * arg7[1] + 8192 >> 14, local394 * arg7[4] + 8192 >> 14, arg7[7] * local394 + 8192 >> 14, arg7[2] * local420 + 8192 >> 14, local420 * arg7[5] + 8192 >> 14, local420 * arg7[8] + 8192 >> 14 };
			local635 = local253 * local372 + 8192 >> 14;
			local660 = local54 * local394 + 8192 >> 14;
			local664 = local60 * local420 + 8192 >> 14;
			@Pc(2156) int local2156 = local635 + local463;
			@Pc(2160) int local2160 = local660 + local471;
			@Pc(2164) int local2164 = local664 + local479;
			@Pc(2167) int[] local2167 = new int[9];
			@Pc(2173) int local2173;
			for (local673 = 0; local673 < 3; local673++) {
				for (local2173 = 0; local2173 < 3; local2173++) {
					local678 = 0;
					for (local682 = 0; local682 < 3; local682++) {
						local678 += local2020[local682 * 3 + local2173] * arg7[local673 * 3 + local682];
					}
					local2167[local2173 + local673 * 3] = local678 + 8192 >> 14;
				}
			}
			local2173 = arg7[2] * local2164 + local2160 * arg7[1] + local2156 * arg7[0] + 8192 >> 14;
			local678 = local2164 * arg7[5] + local2160 * arg7[4] + arg7[3] * local2156 + 8192 >> 14;
			local2173 += local30;
			local682 = arg7[6] * local2156 + local2160 * arg7[7] + arg7[8] * local2164 + 8192 >> 14;
			local678 += local32;
			local682 += local38;
			for (local686 = 0; local686 < local8; local686++) {
				local688 = arg1[local686];
				if (local688 < this.anIntArrayArray56.length) {
					local821 = this.anIntArrayArray56[local688];
					for (local823 = 0; local823 < local821.length; local823++) {
						local827 = local821[local823];
						if (this.aShortArray59 == null || (arg6 & this.aShortArray59[local827]) != 0) {
							local831 = local2167[2] * this.anIntArray433[local827] + local2167[0] * this.anIntArray429[local827] + local2167[1] * this.anIntArray430[local827] + 8192 >> 14;
							local833 = this.anIntArray433[local827] * local2167[5] + this.anIntArray430[local827] * local2167[4] + local2167[3] * this.anIntArray429[local827] + 8192 >> 14;
							@Pc(2414) int local2414 = local833 + local678;
							@Pc(2418) int local2418 = local831 + local2173;
							local964 = local2167[6] * this.anIntArray429[local827] + this.anIntArray430[local827] * local2167[7] + local2167[8] * this.anIntArray433[local827] + 8192 >> 14;
							@Pc(2453) int local2453 = local964 + local682;
							this.anIntArray429[local827] = local2418;
							this.anIntArray430[local827] = local2414;
							this.anIntArray433[local827] = local2453;
						}
					}
				}
			}
		}
	}
}
