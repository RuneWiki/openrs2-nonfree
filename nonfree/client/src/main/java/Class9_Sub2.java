import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "B")
	private byte aByte103;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "[S")
	private short[] aShortArray146;

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "[Lclient!qh;")
	private Class203[] aClass203Array1;

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
	private int anInt7299;

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "Lclient!bc;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!vq", name = "bb", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!vq", name = "db", descriptor = "[Lclient!nk;")
	private Class165[] aClass165Array4;

	@OriginalMember(owner = "client!vq", name = "gb", descriptor = "I")
	private int anInt7313;

	@OriginalMember(owner = "client!vq", name = "hb", descriptor = "I")
	private int anInt7314;

	@OriginalMember(owner = "client!vq", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!vq", name = "mb", descriptor = "[I")
	private int[] anIntArray515;

	@OriginalMember(owner = "client!vq", name = "ob", descriptor = "Lclient!u;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!vq", name = "rb", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!vq", name = "tb", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!vq", name = "ub", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!vq", name = "Ab", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!vq", name = "Bb", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!vq", name = "Db", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!vq", name = "Eb", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!vq", name = "Fb", descriptor = "[S")
	private short[] aShortArray151;

	@OriginalMember(owner = "client!vq", name = "Gb", descriptor = "[Lclient!ep;")
	private Class67[] aClass67Array1;

	@OriginalMember(owner = "client!vq", name = "Ib", descriptor = "[B")
	private byte[] aByteArray91;

	@OriginalMember(owner = "client!vq", name = "Kb", descriptor = "Lclient!nh;")
	private Interface6 anInterface6_7;

	@OriginalMember(owner = "client!vq", name = "Lb", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!vq", name = "Pb", descriptor = "[S")
	private short[] aShortArray152;

	@OriginalMember(owner = "client!vq", name = "Rb", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!vq", name = "Tb", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!vq", name = "Ub", descriptor = "[B")
	private byte[] aByteArray92;

	@OriginalMember(owner = "client!vq", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!vq", name = "Wb", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!vq", name = "Yb", descriptor = "[S")
	private short[] aShortArray153;

	@OriginalMember(owner = "client!vq", name = "Zb", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!vq", name = "ac", descriptor = "[F")
	private float[] aFloatArray33;

	@OriginalMember(owner = "client!vq", name = "cc", descriptor = "[I")
	private int[] anIntArray518;

	@OriginalMember(owner = "client!vq", name = "ec", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!vq", name = "fc", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!vq", name = "lc", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!vq", name = "pc", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!vq", name = "sc", descriptor = "[Lclient!wv;")
	private Class269[] aClass269Array4;

	@OriginalMember(owner = "client!vq", name = "tc", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "Z")
	private boolean aBoolean631 = false;

	@OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
	private int anInt7307 = 0;

	@OriginalMember(owner = "client!vq", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!vq", name = "Mb", descriptor = "I")
	private int anInt7328 = 0;

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
	private int anInt7294 = 0;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
	private int anInt7289 = 0;

	@OriginalMember(owner = "client!vq", name = "qc", descriptor = "Z")
	private boolean aBoolean632 = true;

	@OriginalMember(owner = "client!vq", name = "zc", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_41;

	@OriginalMember(owner = "client!vq", name = "Nb", descriptor = "Lclient!kd;")
	private Class127 aClass127_14;

	@OriginalMember(owner = "client!vq", name = "kc", descriptor = "Lclient!kd;")
	private Class127 aClass127_16;

	@OriginalMember(owner = "client!vq", name = "jc", descriptor = "Lclient!kd;")
	private Class127 aClass127_15;

	@OriginalMember(owner = "client!vq", name = "W", descriptor = "Lclient!kd;")
	private Class127 aClass127_13;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "Lclient!tt;")
	private Class239 aClass239_1;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class9_Sub2(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aClass172_Sub2_41 = arg0;
		this.aClass127_14 = new Class127(null, 5126, 3, 0);
		this.aClass127_16 = new Class127(null, 5126, 2, 0);
		this.aClass127_15 = new Class127(null, 5126, 3, 0);
		this.aClass127_13 = new Class127(null, 5121, 4, 0);
		this.aClass239_1 = new Class239();
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!vj;Lclient!nd;IIII)V")
	public Class9_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass172_Sub2_41 = arg0;
		this.anInt7299 = arg5;
		this.anInt7314 = arg2;
		if (Static131.method2042(arg5, arg2)) {
			this.aClass127_14 = new Class127(null, 5126, 3, 0);
		}
		if (Static274.method3901(arg2, arg5)) {
			this.aClass127_16 = new Class127(null, 5126, 2, 0);
		}
		if (Static332.method4457(arg2, arg5)) {
			this.aClass127_15 = new Class127(null, 5126, 3, 0);
		}
		if (Static104.method1811(arg5, arg2)) {
			this.aClass127_13 = new Class127(null, 5121, 4, 0);
		}
		if (Static261.method664(arg5, arg2)) {
			this.aClass239_1 = new Class239();
		}
		@Pc(102) Interface5 local102 = arg0.anInterface5_8;
		this.anIntArray518 = new int[arg1.anInt4982 + 1];
		@Pc(113) int[] local113 = new int[arg1.anInt4975];
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt4975; local115++) {
			if ((arg1.aByteArray65 == null || arg1.aByteArray65[local115] != 2) && (arg1.aShortArray89 == null || arg1.aShortArray89[local115] == -1 || !local102.method3918(arg1.aShortArray89[local115] & 0xFFFF).aBoolean209)) {
				local113[this.anInt7328++] = local115;
				this.anIntArray518[arg1.aShortArray82[local115]]++;
				this.anIntArray518[arg1.aShortArray90[local115]]++;
				this.anIntArray518[arg1.aShortArray83[local115]]++;
			}
		}
		this.anInt7307 = this.anInt7328;
		@Pc(205) long[] local205 = new long[this.anInt7328];
		@Pc(214) boolean local214 = (this.anInt7314 & 0x100) != 0;
		@Pc(226) int local226;
		@Pc(237) int local237;
		@Pc(363) int local363;
		label492: for (@Pc(216) int local216 = 0; local216 < this.anInt7328; local216++) {
			@Pc(222) int local222 = local113[local216];
			@Pc(224) Class76 local224 = null;
			local226 = 0;
			@Pc(228) byte local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			if (arg1.aClass185Array1 != null) {
				for (local237 = 0; local237 < arg1.aClass185Array1.length; local237++) {
					@Pc(244) Class185 local244 = arg1.aClass185Array1[local237];
					if (local222 == local244.anInt5324) {
						@Pc(253) Class15 local253 = Static174.method2791(local244.anInt5329);
						if (local253.aBoolean35) {
							local205[local216] = Long.MAX_VALUE;
							this.anInt7307--;
							continue label492;
						}
					}
				}
			}
			@Pc(280) short local280 = -1;
			if (arg1.aShortArray89 != null) {
				local280 = arg1.aShortArray89[local222];
				if (local280 != -1) {
					local224 = local102.method3918(local280 & 0xFFFF);
					local232 = local224.aByte40;
					local230 = local224.aByte46;
				}
			}
			@Pc(325) boolean local325 = arg1.aByteArray62 != null && arg1.aByteArray62[local222] != 0 || local224 != null && !local224.aBoolean212;
			if ((local214 || local325) && arg1.aByteArray61 != null) {
				local226 += arg1.aByteArray61[local222] << 17;
			}
			if (local325) {
				local226 += 65536;
			}
			local226 += (local230 & 0xFF) << 8;
			local363 = local228 + ((local280 & 0xFFFF) << 16);
			local226 += local232 & 0xFF;
			@Pc(375) int local375 = local363 + (local216 & 0xFFFF);
			local205[local216] = ((long) local226 << 32) + (long) local375;
		}
		Static121.method1959(local113, local205);
		this.lb = arg1.anInt4993;
		this.anIntArray516 = arg1.anIntArray334;
		this.anIntArray515 = arg1.anIntArray329;
		this.anInt7294 = arg1.anInt4982;
		this.anIntArray517 = arg1.anIntArray337;
		this.aShortArray155 = arg1.aShortArray87;
		@Pc(426) Class230[] local426 = new Class230[this.anInt7294];
		this.aClass165Array4 = arg1.aClass165Array2;
		this.aClass269Array4 = arg1.aClass269Array2;
		@Pc(454) int local454;
		@Pc(468) int local468;
		if (arg1.aClass185Array1 != null) {
			this.anInt7313 = arg1.aClass185Array1.length;
			this.aClass203Array1 = new Class203[this.anInt7313];
			this.aClass67Array1 = new Class67[this.anInt7313];
			for (local454 = 0; local454 < this.anInt7313; local454++) {
				@Pc(461) Class185 local461 = arg1.aClass185Array1[local454];
				@Pc(466) Class15 local466 = Static174.method2791(local461.anInt5329);
				local468 = -1;
				for (@Pc(470) int local470 = 0; local470 < this.anInt7328; local470++) {
					if (local461.anInt5324 == local113[local470]) {
						local468 = local470;
						break;
					}
				}
				if (local468 == -1) {
					throw new RuntimeException();
				}
				local237 = Static135.anIntArray174[arg1.aShortArray86[local461.anInt5324] & 0xFFFF] & 0xFFFFFF;
				local237 |= 255 - (arg1.aByteArray62 == null ? 0 : arg1.aByteArray62[local461.anInt5324]) << 24;
				this.aClass67Array1[local454] = new Class67(local468, arg1.aShortArray82[local461.anInt5324], arg1.aShortArray90[local461.anInt5324], arg1.aShortArray83[local461.anInt5324], local466.anInt485, local466.anInt487, local466.anInt479, local466.anInt489, local466.anInt481, local466.aBoolean35, local466.aBoolean34, local461.anInt5328);
				this.aClass203Array1[local454] = new Class203(local237);
			}
		}
		local454 = this.anInt7328 * 3;
		this.aShortArray147 = new short[this.anInt7328];
		this.aFloatArray32 = new float[local454];
		this.aShortArray153 = new short[this.anInt7328];
		this.aFloatArray33 = new float[local454];
		this.aShortArray149 = new short[local454];
		Static176.aLongArray5 = new long[local454];
		this.aShort98 = (short) arg4;
		this.aShort99 = (short) arg3;
		this.aShortArray152 = new short[this.anInt7328];
		this.aShortArray145 = new short[local454];
		this.aShortArray146 = new short[this.anInt7328];
		this.aShortArray151 = new short[local454];
		this.aByteArray91 = new byte[local454];
		this.aByteArray92 = new byte[this.anInt7328];
		if (arg1.aShortArray81 != null) {
			this.aShortArray148 = new short[this.anInt7328];
		}
		this.aShortArray154 = new short[local454];
		this.aShortArray150 = new short[this.anInt7328];
		local226 = 0;
		for (local363 = 0; local363 < arg1.anInt4982; local363++) {
			local468 = this.anIntArray518[local363];
			this.anIntArray518[local363] = local226;
			local426[local363] = new Class230();
			local226 += local468;
		}
		this.anIntArray518[arg1.anInt4982] = local226;
		@Pc(706) int[] local706 = null;
		@Pc(708) int[] local708 = null;
		@Pc(710) int[] local710 = null;
		@Pc(712) float[][] local712 = null;
		@Pc(738) int local738;
		@Pc(770) int local770;
		@Pc(776) int local776;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(825) int local825;
		@Pc(830) int local830;
		@Pc(992) float local992;
		@Pc(1021) float local1021;
		@Pc(990) float local990;
		if (arg1.aByteArray64 != null) {
			@Pc(718) int local718 = arg1.anInt4977;
			@Pc(721) int[] local721 = new int[local718];
			@Pc(724) int[] local724 = new int[local718];
			@Pc(727) int[] local727 = new int[local718];
			@Pc(730) int[] local730 = new int[local718];
			@Pc(733) int[] local733 = new int[local718];
			@Pc(736) int[] local736 = new int[local718];
			for (local738 = 0; local738 < local718; local738++) {
				local721[local738] = Integer.MAX_VALUE;
				local724[local738] = -2147483647;
				local727[local738] = Integer.MAX_VALUE;
				local730[local738] = -2147483647;
				local733[local738] = Integer.MAX_VALUE;
				local736[local738] = -2147483647;
			}
			for (local770 = 0; local770 < this.anInt7328; local770++) {
				local776 = local113[local770];
				if (arg1.aByteArray64[local776] != -1) {
					local789 = arg1.aByteArray64[local776] & 0xFF;
					for (local791 = 0; local791 < 3; local791++) {
						@Pc(806) short local806;
						if (local791 == 0) {
							local806 = arg1.aShortArray82[local776];
						} else if (local791 == 1) {
							local806 = arg1.aShortArray90[local776];
						} else {
							local806 = arg1.aShortArray83[local776];
						}
						local825 = arg1.anIntArray334[local806];
						local830 = arg1.anIntArray329[local806];
						@Pc(835) int local835 = arg1.anIntArray337[local806];
						if (local825 < local721[local789]) {
							local721[local789] = local825;
						}
						if (local724[local789] < local825) {
							local724[local789] = local825;
						}
						if (local830 < local727[local789]) {
							local727[local789] = local830;
						}
						if (local830 > local730[local789]) {
							local730[local789] = local830;
						}
						if (local733[local789] > local835) {
							local733[local789] = local835;
						}
						if (local736[local789] < local835) {
							local736[local789] = local835;
						}
					}
				}
			}
			local712 = new float[local718][];
			local706 = new int[local718];
			local710 = new int[local718];
			local708 = new int[local718];
			for (local776 = 0; local776 < local718; local776++) {
				@Pc(935) byte local935 = arg1.aByteArray60[local776];
				if (local935 > 0) {
					local706[local776] = (local724[local776] + local721[local776]) / 2;
					local708[local776] = (local727[local776] + local730[local776]) / 2;
					local710[local776] = (local733[local776] + local736[local776]) / 2;
					if (local935 == 1) {
						local830 = arg1.anIntArray330[local776];
						if (local830 == 0) {
							local990 = 1.0F;
							local992 = 1.0F;
						} else if (local830 <= 0) {
							local990 = 1.0F;
							local992 = (float) -local830 / 1024.0F;
						} else {
							local992 = 1.0F;
							local990 = (float) local830 / 1024.0F;
						}
						local1021 = 64.0F / (float) arg1.anIntArray335[local776];
					} else if (local935 == 2) {
						local990 = 64.0F / (float) arg1.anIntArray332[local776];
						local1021 = 64.0F / (float) arg1.anIntArray335[local776];
						local992 = 64.0F / (float) arg1.anIntArray330[local776];
					} else {
						local1021 = (float) arg1.anIntArray335[local776] / 1024.0F;
						local990 = (float) arg1.anIntArray332[local776] / 1024.0F;
						local992 = (float) arg1.anIntArray330[local776] / 1024.0F;
					}
					local712[local776] = Static228.method3430(arg1.aShortArray85[local776], arg1.aShortArray84[local776], arg1.aByteArray59[local776] & 0xFF, local990, local992, local1021, arg1.aShortArray88[local776]);
				}
			}
		}
		@Pc(1116) Class200[] local1116 = new Class200[arg1.anInt4975];
		@Pc(1135) short local1135;
		@Pc(1145) int local1145;
		@Pc(1156) int local1156;
		@Pc(1216) int local1216;
		for (@Pc(1118) int local1118 = 0; local1118 < arg1.anInt4975; local1118++) {
			@Pc(1125) short local1125 = arg1.aShortArray82[local1118];
			@Pc(1130) short local1130 = arg1.aShortArray90[local1118];
			local1135 = arg1.aShortArray83[local1118];
			local1145 = this.anIntArray516[local1130] - this.anIntArray516[local1125];
			local1156 = this.anIntArray515[local1130] - this.anIntArray515[local1125];
			local738 = this.anIntArray517[local1130] - this.anIntArray517[local1125];
			local770 = this.anIntArray516[local1135] - this.anIntArray516[local1125];
			local776 = this.anIntArray515[local1135] - this.anIntArray515[local1125];
			local789 = this.anIntArray517[local1135] - this.anIntArray517[local1125];
			local791 = local1156 * local789 - local738 * local776;
			local1216 = local738 * local770 - local1145 * local789;
			local825 = local776 * local1145 - local1156 * local770;
			while (local791 > 8192 || local1216 > 8192 || local825 > 8192 || local791 < -8192 || local1216 < -8192 || local825 < -8192) {
				local791 >>= 0x1;
				local825 >>= 0x1;
				local1216 >>= 0x1;
			}
			local830 = (int) Math.sqrt((double) (local1216 * local1216 + local791 * local791 + local825 * local825));
			if (local830 <= 0) {
				local830 = 1;
			}
			local791 = local791 * 256 / local830;
			local825 = local825 * 256 / local830;
			local1216 = local1216 * 256 / local830;
			@Pc(1311) byte local1311 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1118];
			if (local1311 == 0) {
				@Pc(1342) Class230 local1342 = local426[local1125];
				local1342.anInt6262++;
				local1342.anInt6269 += local1216;
				local1342.anInt6268 += local791;
				local1342.anInt6266 += local825;
				@Pc(1370) Class230 local1370 = local426[local1130];
				local1370.anInt6262++;
				local1370.anInt6266 += local825;
				local1370.anInt6268 += local791;
				local1370.anInt6269 += local1216;
				@Pc(1398) Class230 local1398 = local426[local1135];
				local1398.anInt6269 += local1216;
				local1398.anInt6268 += local791;
				local1398.anInt6262++;
				local1398.anInt6266 += local825;
			} else if (local1311 == 1) {
				@Pc(1327) Class200 local1327 = local1116[local1118] = new Class200();
				local1327.anInt5559 = local791;
				local1327.anInt5560 = local1216;
				local1327.anInt5561 = local825;
			}
		}
		@Pc(1439) int local1439;
		for (@Pc(1433) int local1433 = 0; local1433 < this.anInt7328; local1433++) {
			local1439 = local113[local1433];
			@Pc(1446) int local1446 = arg1.aShortArray86[local1439] & 0xFFFF;
			@Pc(1451) short local1451;
			if (arg1.aShortArray89 == null) {
				local1451 = -1;
			} else {
				local1451 = arg1.aShortArray89[local1439];
			}
			if (arg1.aByteArray64 == null) {
				local1156 = -1;
			} else {
				local1156 = arg1.aByteArray64[local1439];
			}
			if (arg1.aByteArray62 == null) {
				local738 = 0;
			} else {
				local738 = arg1.aByteArray62[local1439] & 0xFF;
			}
			@Pc(1486) float local1486 = 0.0F;
			@Pc(1488) float local1488 = 0.0F;
			@Pc(1490) float local1490 = 0.0F;
			local992 = 0.0F;
			local1021 = 0.0F;
			local990 = 0.0F;
			@Pc(1498) byte local1498 = 0;
			@Pc(1500) byte local1500 = 0;
			@Pc(1502) int local1502 = 0;
			@Pc(1537) byte local1537;
			@Pc(1554) short local1554;
			@Pc(1559) short local1559;
			@Pc(1564) short local1564;
			if (local1451 != -1) {
				if (local1156 == -1) {
					local1488 = 1.0F;
					local1021 = 0.0F;
					local1500 = 2;
					local1490 = 1.0F;
					local992 = 1.0F;
					local1486 = 0.0F;
					local990 = 0.0F;
					local1498 = 1;
				} else {
					local1156 &= 0xFF;
					local1537 = arg1.aByteArray60[local1156];
					@Pc(1544) short local1544;
					@Pc(1549) short local1549;
					@Pc(1587) float local1587;
					@Pc(1596) float local1596;
					@Pc(1604) float local1604;
					@Pc(1687) float local1687;
					@Pc(1695) float local1695;
					@Pc(1703) float local1703;
					@Pc(1711) float local1711;
					@Pc(1719) float local1719;
					@Pc(1727) float local1727;
					if (local1537 == 0) {
						local1544 = arg1.aShortArray82[local1439];
						local1549 = arg1.aShortArray90[local1439];
						local1554 = arg1.aShortArray83[local1439];
						local1559 = arg1.aShortArray85[local1156];
						local1564 = arg1.aShortArray88[local1156];
						@Pc(1569) short local1569 = arg1.aShortArray84[local1156];
						@Pc(1575) float local1575 = (float) arg1.anIntArray334[local1559];
						@Pc(1581) float local1581 = (float) arg1.anIntArray329[local1559];
						local1587 = arg1.anIntArray337[local1559];
						local1596 = (float) arg1.anIntArray334[local1564] - local1575;
						local1604 = (float) arg1.anIntArray329[local1564] - local1581;
						@Pc(1613) float local1613 = (float) arg1.anIntArray337[local1564] - local1587;
						@Pc(1621) float local1621 = (float) arg1.anIntArray334[local1569] - local1575;
						@Pc(1630) float local1630 = (float) arg1.anIntArray329[local1569] - local1581;
						@Pc(1638) float local1638 = (float) arg1.anIntArray337[local1569] - local1587;
						@Pc(1646) float local1646 = (float) arg1.anIntArray334[local1544] - local1575;
						@Pc(1655) float local1655 = (float) arg1.anIntArray329[local1544] - local1581;
						@Pc(1663) float local1663 = (float) arg1.anIntArray337[local1544] - local1587;
						@Pc(1671) float local1671 = (float) arg1.anIntArray334[local1549] - local1575;
						@Pc(1679) float local1679 = (float) arg1.anIntArray329[local1549] - local1581;
						local1687 = (float) arg1.anIntArray337[local1549] - local1587;
						local1695 = (float) arg1.anIntArray334[local1554] - local1575;
						local1703 = (float) arg1.anIntArray329[local1554] - local1581;
						local1711 = (float) arg1.anIntArray337[local1554] - local1587;
						local1719 = local1604 * local1638 - local1613 * local1630;
						local1727 = local1613 * local1621 - local1596 * local1638;
						@Pc(1736) float local1736 = local1596 * local1630 - local1604 * local1621;
						@Pc(1745) float local1745 = local1630 * local1736 - local1727 * local1638;
						@Pc(1754) float local1754 = local1638 * local1719 - local1621 * local1736;
						@Pc(1762) float local1762 = local1727 * local1621 - local1630 * local1719;
						@Pc(1776) float local1776 = 1.0F / (local1604 * local1754 + local1596 * local1745 + local1613 * local1762);
						local1486 = local1776 * (local1663 * local1762 + local1646 * local1745 + local1754 * local1655);
						local1021 = local1776 * (local1762 * local1711 + local1695 * local1745 + local1754 * local1703);
						local1490 = (local1762 * local1687 + local1679 * local1754 + local1745 * local1671) * local1776;
						@Pc(1827) float local1827 = local1719 * local1613 - local1596 * local1736;
						@Pc(1836) float local1836 = local1596 * local1727 - local1719 * local1604;
						@Pc(1844) float local1844 = local1736 * local1604 - local1727 * local1613;
						@Pc(1858) float local1858 = 1.0F / (local1621 * local1844 + local1630 * local1827 + local1638 * local1836);
						local990 = (local1711 * local1836 + local1844 * local1695 + local1703 * local1827) * local1858;
						local992 = (local1827 * local1679 + local1671 * local1844 + local1687 * local1836) * local1858;
						local1488 = (local1836 * local1663 + local1827 * local1655 + local1844 * local1646) * local1858;
					} else {
						local1544 = arg1.aShortArray82[local1439];
						local1549 = arg1.aShortArray90[local1439];
						local1554 = arg1.aShortArray83[local1439];
						@Pc(1921) int local1921 = local706[local1156];
						@Pc(1925) int local1925 = local708[local1156];
						@Pc(1929) int local1929 = local710[local1156];
						@Pc(1933) float[] local1933 = local712[local1156];
						@Pc(1938) byte local1938 = arg1.aByteArray63[local1156];
						local1587 = (float) arg1.anIntArray331[local1156] / 256.0F;
						if (local1537 == 1) {
							local1596 = (float) arg1.anIntArray332[local1156] / 1024.0F;
							Static276.method3915(local1587, local1925, local1933, arg1.anIntArray334[local1544], local1921, local1929, local1596, local1938, arg1.anIntArray337[local1544], arg1.anIntArray329[local1544]);
							local1486 = Static119.aFloat18;
							local1488 = Static286.aFloat7;
							Static276.method3915(local1587, local1925, local1933, arg1.anIntArray334[local1549], local1921, local1929, local1596, local1938, arg1.anIntArray337[local1549], arg1.anIntArray329[local1549]);
							local1490 = Static119.aFloat18;
							local992 = Static286.aFloat7;
							Static276.method3915(local1587, local1925, local1933, arg1.anIntArray334[local1554], local1921, local1929, local1596, local1938, arg1.anIntArray337[local1554], arg1.anIntArray329[local1554]);
							local990 = Static286.aFloat7;
							local1021 = Static119.aFloat18;
							local1604 = local1596 / 2.0F;
							if ((local1938 & 0x1) == 0) {
								if (local1021 - local1486 > local1604) {
									local1021 -= local1596;
									local1500 = 1;
								} else if (local1486 - local1021 > local1604) {
									local1021 += local1596;
									local1500 = 2;
								}
								if (local1490 - local1486 > local1604) {
									local1498 = 1;
									local1490 -= local1596;
								} else if (local1604 < local1486 - local1490) {
									local1490 += local1596;
									local1498 = 2;
								}
							} else {
								if (local992 - local1488 > local1604) {
									local992 -= local1596;
									local1498 = 1;
								} else if (local1488 - local992 > local1604) {
									local992 += local1596;
									local1498 = 2;
								}
								if (local1604 < local990 - local1488) {
									local1500 = 1;
									local990 -= local1596;
								} else if (local1488 - local990 > local1604) {
									local990 += local1596;
									local1500 = 2;
								}
							}
						} else if (local1537 == 2) {
							local1596 = (float) arg1.anIntArray338[local1156] / 256.0F;
							local1604 = (float) arg1.anIntArray328[local1156] / 256.0F;
							@Pc(2187) int local2187 = arg1.anIntArray334[local1549] - arg1.anIntArray334[local1544];
							@Pc(2198) int local2198 = arg1.anIntArray329[local1549] - arg1.anIntArray329[local1544];
							@Pc(2209) int local2209 = arg1.anIntArray337[local1549] - arg1.anIntArray337[local1544];
							@Pc(2219) int local2219 = arg1.anIntArray334[local1554] - arg1.anIntArray334[local1544];
							@Pc(2230) int local2230 = arg1.anIntArray329[local1554] - arg1.anIntArray329[local1544];
							@Pc(2240) int local2240 = arg1.anIntArray337[local1554] - arg1.anIntArray337[local1544];
							@Pc(2249) int local2249 = local2240 * local2198 - local2209 * local2230;
							@Pc(2258) int local2258 = local2209 * local2219 - local2187 * local2240;
							@Pc(2267) int local2267 = local2230 * local2187 - local2198 * local2219;
							local1687 = 64.0F / (float) arg1.anIntArray330[local1156];
							local1695 = 64.0F / (float) arg1.anIntArray335[local1156];
							local1703 = 64.0F / (float) arg1.anIntArray332[local1156];
							local1711 = (local1933[1] * (float) local2258 + (float) local2249 * local1933[0] + (float) local2267 * local1933[2]) / local1687;
							local1719 = (local1933[5] * (float) local2267 + (float) local2249 * local1933[3] + local1933[4] * (float) local2258) / local1695;
							local1727 = (local1933[6] * (float) local2249 + local1933[7] * (float) local2258 + local1933[8] * (float) local2267) / local1703;
							local1502 = Static58.method1219(local1719, local1711, local1727);
							Static229.method3440(arg1.anIntArray334[local1544], local1587, local1921, local1933, local1938, arg1.anIntArray329[local1544], local1929, local1596, local1502, local1925, arg1.anIntArray337[local1544], local1604);
							local1486 = Static256.aFloat48;
							local1488 = Static150.aFloat32;
							Static229.method3440(arg1.anIntArray334[local1549], local1587, local1921, local1933, local1938, arg1.anIntArray329[local1549], local1929, local1596, local1502, local1925, arg1.anIntArray337[local1549], local1604);
							local992 = Static150.aFloat32;
							local1490 = Static256.aFloat48;
							Static229.method3440(arg1.anIntArray334[local1554], local1587, local1921, local1933, local1938, arg1.anIntArray329[local1554], local1929, local1596, local1502, local1925, arg1.anIntArray337[local1554], local1604);
							local990 = Static150.aFloat32;
							local1021 = Static256.aFloat48;
						} else if (local1537 == 3) {
							Static426.method5450(local1938, arg1.anIntArray329[local1544], local1921, arg1.anIntArray334[local1544], local1929, arg1.anIntArray337[local1544], local1933, local1925, local1587);
							local1488 = Static344.aFloat66;
							local1486 = Static406.aFloat73;
							Static426.method5450(local1938, arg1.anIntArray329[local1549], local1921, arg1.anIntArray334[local1549], local1929, arg1.anIntArray337[local1549], local1933, local1925, local1587);
							local1490 = Static406.aFloat73;
							local992 = Static344.aFloat66;
							Static426.method5450(local1938, arg1.anIntArray329[local1554], local1921, arg1.anIntArray334[local1554], local1929, arg1.anIntArray337[local1554], local1933, local1925, local1587);
							local990 = Static344.aFloat66;
							local1021 = Static406.aFloat73;
							if ((local1938 & 0x1) == 0) {
								if (local1490 - local1486 > 0.5F) {
									local1498 = 1;
									local1490--;
								} else if (local1486 - local1490 > 0.5F) {
									local1490++;
									local1498 = 2;
								}
								if (local1021 - local1486 > 0.5F) {
									local1021--;
									local1500 = 1;
								} else if (local1486 - local1021 > 0.5F) {
									local1021++;
									local1500 = 2;
								}
							} else {
								if (local992 - local1488 > 0.5F) {
									local1498 = 1;
									local992--;
								} else if (local1488 - local992 > 0.5F) {
									local992++;
									local1498 = 2;
								}
								if (local990 - local1488 > 0.5F) {
									local990--;
									local1500 = 1;
								} else if (local1488 - local990 > 0.5F) {
									local990++;
									local1500 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1537 = 0;
			} else {
				local1537 = arg1.aByteArray65[local1439];
			}
			if (local1537 == 0) {
				@Pc(2672) long local2672 = ((long) local738 + (long) (local1502 << 24) + (long) (local1446 << 8) << 32) + (long) (local1156 << 2);
				local1554 = arg1.aShortArray82[local1439];
				local1559 = arg1.aShortArray90[local1439];
				local1564 = arg1.aShortArray83[local1439];
				@Pc(2691) Class230 local2691 = local426[local1554];
				this.aShortArray153[local1433] = this.method5702(local1488, local1554, arg1, local2691.anInt6266, local2691.anInt6268, local2691.anInt6269, local2691.anInt6262, local2672, local1486);
				@Pc(2715) Class230 local2715 = local426[local1559];
				this.aShortArray150[local1433] = this.method5702(local992, local1559, arg1, local2715.anInt6266, local2715.anInt6268, local2715.anInt6269, local2715.anInt6262, local2672 + (long) local1498, local1490);
				@Pc(2742) Class230 local2742 = local426[local1564];
				this.aShortArray146[local1433] = this.method5702(local990, local1564, arg1, local2742.anInt6266, local2742.anInt6268, local2742.anInt6269, local2742.anInt6262, local2672 + (long) local1500, local1021);
			} else if (local1537 == 1) {
				@Pc(2774) Class200 local2774 = local1116[local1439];
				@Pc(2818) long local2818 = ((long) (local1502 << 24) + (long) (local1446 << 8) + (long) local738 << 32) + (long) ((local2774.anInt5560 + 256 << 12) + (local2774.anInt5559 > 0 ? 1024 : 2048) + (local1156 << 2) + (local2774.anInt5561 - -256 << 22));
				this.aShortArray153[local1433] = this.method5702(local1488, arg1.aShortArray82[local1439], arg1, local2774.anInt5561, local2774.anInt5559, local2774.anInt5560, 0, local2818, local1486);
				this.aShortArray150[local1433] = this.method5702(local992, arg1.aShortArray90[local1439], arg1, local2774.anInt5561, local2774.anInt5559, local2774.anInt5560, 0, local2818 + (long) local1498, local1490);
				this.aShortArray146[local1433] = this.method5702(local990, arg1.aShortArray83[local1439], arg1, local2774.anInt5561, local2774.anInt5559, local2774.anInt5560, 0, local2818 + (long) local1500, local1021);
			}
			if (arg1.aShortArray89 == null) {
				this.aShortArray147[local1433] = -1;
			} else {
				this.aShortArray147[local1433] = arg1.aShortArray89[local1439];
			}
			if (arg1.aByteArray62 != null) {
				this.aByteArray92[local1433] = arg1.aByteArray62[local1439];
			}
			if (arg1.aShortArray81 != null) {
				this.aShortArray148[local1433] = arg1.aShortArray81[local1439];
			}
			this.aShortArray152[local1433] = arg1.aShortArray86[local1439];
		}
		local1439 = 0;
		local1135 = -10000;
		for (local1145 = 0; local1145 < this.anInt7307; local1145++) {
			@Pc(2960) short local2960 = this.aShortArray147[local1145];
			if (local1135 != local2960) {
				local1439++;
				local1135 = local2960;
			}
		}
		this.anIntArray514 = new int[local1439 + 1];
		local1439 = 0;
		local1135 = -10000;
		for (local1156 = 0; local1156 < this.anInt7307; local1156++) {
			@Pc(2990) short local2990 = this.aShortArray147[local1156];
			if (local2990 != local1135) {
				local1135 = local2990;
				this.anIntArray514[local1439++] = local1156;
			}
		}
		this.anIntArray514[local1439] = this.anInt7307;
		Static176.aLongArray5 = null;
		this.aShortArray145 = Static398.method5107(this.anInt7289, this.aShortArray145);
		this.aShortArray154 = Static398.method5107(this.anInt7289, this.aShortArray154);
		this.aShortArray151 = Static398.method5107(this.anInt7289, this.aShortArray151);
		this.aByteArray91 = Static300.method4230(this.aByteArray91, this.anInt7289);
		this.aFloatArray32 = Static86.method1642(this.anInt7289, this.aFloatArray32);
		this.aFloatArray33 = Static86.method1642(this.anInt7289, this.aFloatArray33);
		if (arg1.anIntArray333 != null && Static291.method4106(this.anInt7299, arg2)) {
			this.anIntArrayArray56 = arg1.method3824();
		}
		if (arg1.aClass185Array1 != null && Static182.method2886(this.anInt7299, arg2)) {
			this.anIntArrayArray55 = arg1.method3825();
		}
		if (arg1.anIntArray336 != null && Static430.method2673(arg2, this.anInt7299)) {
			local738 = 0;
			@Pc(3104) int[] local3104 = new int[256];
			for (local776 = 0; local776 < this.anInt7328; local776++) {
				local789 = arg1.anIntArray336[local113[local776]];
				if (local789 >= 0) {
					if (local738 < local789) {
						local738 = local789;
					}
					@Pc(3126) int local3126 = local3104[local789]++;
				}
			}
			this.anIntArrayArray57 = new int[local738 + 1][];
			for (local789 = 0; local789 <= local738; local789++) {
				this.anIntArrayArray57[local789] = new int[local3104[local789]];
				local3104[local789] = 0;
			}
			for (local791 = 0; local791 < this.anInt7328; local791++) {
				local1216 = arg1.anIntArray336[local113[local791]];
				if (local1216 >= 0) {
					this.anIntArrayArray57[local1216][local3104[local1216]++] = local791;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub17.anIntArray289[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub17.anIntArray290[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7294; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray516[local15] + this.anIntArray515[local15] * local9 >> 15;
			this.anIntArray515[local15] = this.anIntArray515[local15] * local13 - local9 * this.anIntArray516[local15] >> 15;
			this.anIntArray516[local15] = local33;
		}
		this.aBoolean631 = false;
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BZ)V")
	private void method5701(@OriginalArg(1) boolean arg0) {
		if (Static435.aClass3_Sub7_Sub2_3.aByteArray46.length < this.anInt7307 * 6) {
			Static435.aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2((this.anInt7307 + 100) * 6);
		} else {
			Static435.aClass3_Sub7_Sub2_3.anInt3235 = 0;
		}
		@Pc(34) int local34;
		if (this.aClass172_Sub2_41.aBoolean621) {
			for (local34 = 0; local34 < this.anInt7307; local34++) {
				Static435.aClass3_Sub7_Sub2_3.method2613(this.aShortArray153[local34]);
				Static435.aClass3_Sub7_Sub2_3.method2613(this.aShortArray150[local34]);
				Static435.aClass3_Sub7_Sub2_3.method2613(this.aShortArray146[local34]);
			}
		} else {
			for (local34 = 0; local34 < this.anInt7307; local34++) {
				Static435.aClass3_Sub7_Sub2_3.method2585(this.aShortArray153[local34]);
				Static435.aClass3_Sub7_Sub2_3.method2585(this.aShortArray150[local34]);
				Static435.aClass3_Sub7_Sub2_3.method2585(this.aShortArray146[local34]);
			}
		}
		if (Static435.aClass3_Sub7_Sub2_3.anInt3235 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface10_5 == null) {
				this.anInterface10_5 = this.aClass172_Sub2_41.method5560(Static435.aClass3_Sub7_Sub2_3.anInt3235, Static435.aClass3_Sub7_Sub2_3.aByteArray46, true);
			} else {
				this.anInterface10_5.method5070(Static435.aClass3_Sub7_Sub2_3.aByteArray46, Static435.aClass3_Sub7_Sub2_3.anInt3235);
			}
			this.aClass239_1.anInterface10_3 = this.anInterface10_5;
		} else {
			this.aClass239_1.anInterface10_3 = this.aClass172_Sub2_41.method5560(Static435.aClass3_Sub7_Sub2_3.anInt3235, Static435.aClass3_Sub7_Sub2_3.aByteArray46, false);
		}
		if (!arg0) {
			this.aBoolean632 = true;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method5696(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class9_Sub2 local8 = (Class9_Sub2) arg0;
		if (this.anInt7328 == 0 || local8.anInt7328 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7294;
		@Pc(24) int[] local24 = local8.anIntArray516;
		@Pc(27) int[] local27 = local8.anIntArray515;
		@Pc(30) int[] local30 = local8.anIntArray517;
		@Pc(33) short[] local33 = local8.aShortArray145;
		@Pc(36) short[] local36 = local8.aShortArray154;
		@Pc(39) short[] local39 = local8.aShortArray151;
		@Pc(42) byte[] local42 = local8.aByteArray91;
		@Pc(57) short[] local57;
		@Pc(61) short[] local61;
		@Pc(53) short[] local53;
		@Pc(49) byte[] local49;
		if (this.aClass18_1 == null) {
			local53 = null;
			local57 = null;
			local61 = null;
			local49 = null;
		} else {
			local49 = this.aClass18_1.aByteArray11;
			local53 = this.aClass18_1.aShortArray17;
			local57 = this.aClass18_1.aShortArray18;
			local61 = this.aClass18_1.aShortArray16;
		}
		@Pc(90) short[] local90;
		@Pc(86) short[] local86;
		@Pc(82) short[] local82;
		@Pc(78) byte[] local78;
		if (local8.aClass18_1 == null) {
			local86 = null;
			local90 = null;
			local82 = null;
			local78 = null;
		} else {
			local78 = local8.aClass18_1.aByteArray11;
			local82 = local8.aClass18_1.aShortArray17;
			local86 = local8.aClass18_1.aShortArray16;
			local90 = local8.aClass18_1.aShortArray18;
		}
		@Pc(103) int[] local103 = local8.anIntArray518;
		@Pc(106) short[] local106 = local8.aShortArray149;
		if (!local8.aBoolean631) {
			local8.method5703();
		}
		@Pc(115) short local115 = local8.aShort94;
		@Pc(118) short local118 = local8.aShort100;
		@Pc(121) short local121 = local8.aShort95;
		@Pc(124) short local124 = local8.aShort96;
		@Pc(127) short local127 = local8.aShort97;
		@Pc(130) short local130 = local8.aShort93;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7294; local132++) {
			@Pc(141) int local141 = this.anIntArray515[local132] - arg2;
			if (local141 >= local115 && local118 >= local141) {
				@Pc(161) int local161 = this.anIntArray516[local132] - arg1;
				if (local121 <= local161 && local161 <= local124) {
					@Pc(180) int local180 = this.anIntArray517[local132] - arg3;
					if (local127 <= local180 && local180 <= local130) {
						@Pc(198) int local198 = -1;
						@Pc(203) int local203 = this.anIntArray518[local132];
						@Pc(210) int local210 = this.anIntArray518[local132 + 1];
						for (@Pc(212) int local212 = local203; local212 < local210; local212++) {
							local198 = this.aShortArray149[local212] - 1;
							if (local198 == -1 || this.aByteArray91[local198] != 0) {
								break;
							}
						}
						if (local198 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local21; local247++) {
								if (local161 == local24[local247] && local30[local247] == local180 && local27[local247] == local141) {
									local210 = local103[local247 + 1];
									@Pc(276) int local276 = -1;
									local203 = local103[local247];
									for (@Pc(282) int local282 = local203; local282 < local210; local282++) {
										local276 = local106[local282] - 1;
										if (local276 == -1 || local42[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local57 == null) {
											this.aClass18_1 = new Class18();
											local57 = this.aClass18_1.aShortArray18 = Static110.method1881(this.aShortArray145);
											local61 = this.aClass18_1.aShortArray16 = Static110.method1881(this.aShortArray154);
											local53 = this.aClass18_1.aShortArray17 = Static110.method1881(this.aShortArray151);
											local49 = this.aClass18_1.aByteArray11 = Static108.method1850(this.aByteArray91);
										}
										if (local90 == null) {
											@Pc(358) Class18 local358 = local8.aClass18_1 = new Class18();
											local90 = local358.aShortArray18 = Static110.method1881(local33);
											local86 = local358.aShortArray16 = Static110.method1881(local36);
											local82 = local358.aShortArray17 = Static110.method1881(local39);
											local78 = local358.aByteArray11 = Static108.method1850(local42);
										}
										@Pc(391) short local391 = this.aShortArray145[local198];
										@Pc(396) short local396 = this.aShortArray154[local198];
										@Pc(401) short local401 = this.aShortArray151[local198];
										local203 = local103[local247];
										local210 = local103[local247 + 1];
										@Pc(416) byte local416 = this.aByteArray91[local198];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local203; local418 < local210; local418++) {
											local426 = local106[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local78[local426] != 0) {
												local90[local426] += local391;
												local86[local426] += local396;
												local82[local426] += local401;
												local78[local426] += local416;
											}
										}
										local396 = local36[local276];
										local416 = local42[local276];
										local203 = this.anIntArray518[local132];
										local210 = this.anIntArray518[local132 + 1];
										local391 = local33[local276];
										local401 = local39[local276];
										for (local426 = local203; local426 < local210; local426++) {
											@Pc(511) int local511 = this.aShortArray149[local426] - 1;
											if (local511 == -1) {
												break;
											}
											if (local49[local511] != 0) {
												local57[local511] += local391;
												local61[local511] += local396;
												local53[local511] += local401;
												local49[local511] += local416;
											}
										}
										if (this.aClass127_15 == null && this.aClass127_13 != null) {
											this.aClass127_13.anInterface6_3 = null;
										}
										if (this.aClass127_15 != null) {
											this.aClass127_15.anInterface6_3 = null;
										}
										if (local8.aClass127_15 == null && local8.aClass127_13 != null) {
											local8.aClass127_13.anInterface6_3 = null;
										}
										if (local8.aClass127_15 != null) {
											local8.aClass127_15.anInterface6_3 = null;
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

	@OriginalMember(owner = "client!vq", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass172_Sub2_41.anInterface5_8;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7328; local11++) {
			if (this.aShortArray147[local11] == arg0) {
				this.aShortArray147[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class76 local43 = local9.method3918(arg0 & 0xFFFF);
			local33 = local43.aByte44;
			local31 = local43.aByte45;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(63) Class76 local63 = local9.method3918(arg1 & 0xFFFF);
			local51 = local63.aByte45;
			local53 = local63.aByte44;
		}
		if (!(local31 != local51 | local53 != local33)) {
			return;
		}
		if (this.aClass67Array1 != null) {
			for (@Pc(92) int local92 = 0; local92 < this.anInt7313; local92++) {
				@Pc(99) Class67 local99 = this.aClass67Array1[local92];
				@Pc(104) Class203 local104 = this.aClass203Array1[local92];
				local104.anInt5603 = local104.anInt5603 & 0xFF000000 | Static135.anIntArray174[this.aShortArray152[local99.anInt2192] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt7314 = arg0;
		if (this.aClass18_1 != null && (this.anInt7314 & 0x10000) == 0) {
			this.aShortArray145 = this.aClass18_1.aShortArray18;
			this.aByteArray91 = this.aClass18_1.aByteArray11;
			this.aShortArray151 = this.aClass18_1.aShortArray17;
			this.aShortArray154 = this.aClass18_1.aShortArray16;
			this.aClass18_1 = null;
		}
		this.aBoolean632 = true;
		this.method5710();
	}

	@OriginalMember(owner = "client!vq", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		if (this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
		}
		this.aShort99 = (short) arg0;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7328; local7++) {
			local16 = this.aShortArray152[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			if (arg2 != -1) {
				local46 -= -(arg3 * (arg2 - local46) >> 7);
			}
			this.aShortArray152[local7] = (short) (local46 | local28 << 7 | local22 << 10);
		}
		if (this.aClass67Array1 != null) {
			for (local16 = 0; local16 < this.anInt7313; local16++) {
				@Pc(106) Class67 local106 = this.aClass67Array1[local16];
				@Pc(111) Class203 local111 = this.aClass203Array1[local16];
				local111.anInt5603 = Static135.anIntArray174[this.aShortArray152[local106.anInt2192] & 0xFFFF] & 0xFFFFFF | local111.anInt5603 & 0xFF000000;
			}
		}
		if (this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static298.anInt5740 = 0;
			Static378.anInt6354 = 0;
			Static281.anInt7445 = 0;
			for (local20 = 0; local20 < this.anInt7294; local20++) {
				Static281.anInt7445 += this.anIntArray516[local20];
				Static298.anInt5740 += this.anIntArray515[local20];
				Static378.anInt6354 += this.anIntArray517[local20];
				local12++;
			}
			if (local12 > 0) {
				Static378.anInt6354 = Static378.anInt6354 / local12 + arg3;
				Static298.anInt5740 = arg2 + Static298.anInt5740 / local12;
				Static281.anInt7445 = Static281.anInt7445 / local12 + arg1;
			} else {
				Static298.anInt5740 = arg2;
				Static378.anInt6354 = arg3;
				Static281.anInt7445 = arg1;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt7294; local12++) {
				this.anIntArray516[local12] += arg1;
				this.anIntArray515[local12] += arg2;
				this.anIntArray517[local12] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt7294; local12++) {
					this.anIntArray516[local12] -= Static281.anInt7445;
					this.anIntArray515[local12] -= Static298.anInt5740;
					this.anIntArray517[local12] -= Static378.anInt6354;
					if (arg3 != 0) {
						local20 = Class3_Sub2_Sub17.anIntArray289[arg3];
						local164 = Class3_Sub2_Sub17.anIntArray290[arg3];
						local182 = local20 * this.anIntArray515[local12] + this.anIntArray516[local12] * local164 + 32767 >> 15;
						this.anIntArray515[local12] = local164 * this.anIntArray515[local12] + 32767 - local20 * this.anIntArray516[local12] >> 15;
						this.anIntArray516[local12] = local182;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub2_Sub17.anIntArray289[arg1];
						local164 = Class3_Sub2_Sub17.anIntArray290[arg1];
						local182 = local164 * this.anIntArray515[local12] + 32767 - this.anIntArray517[local12] * local20 >> 15;
						this.anIntArray517[local12] = this.anIntArray515[local12] * local20 + this.anIntArray517[local12] * local164 + 32767 >> 15;
						this.anIntArray515[local12] = local182;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub2_Sub17.anIntArray289[arg2];
						local164 = Class3_Sub2_Sub17.anIntArray290[arg2];
						local182 = local164 * this.anIntArray516[local12] + local20 * this.anIntArray517[local12] + 32767 >> 15;
						this.anIntArray517[local12] = local164 * this.anIntArray517[local12] + 32767 - this.anIntArray516[local12] * local20 >> 15;
						this.anIntArray516[local12] = local182;
					}
					this.anIntArray516[local12] += Static281.anInt7445;
					this.anIntArray515[local12] += Static298.anInt5740;
					this.anIntArray517[local12] += Static378.anInt6354;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt7294; local12++) {
					this.anIntArray516[local12] -= Static281.anInt7445;
					this.anIntArray515[local12] -= Static298.anInt5740;
					this.anIntArray517[local12] -= Static378.anInt6354;
					this.anIntArray516[local12] = arg1 * this.anIntArray516[local12] / 128;
					this.anIntArray515[local12] = arg2 * this.anIntArray515[local12] / 128;
					this.anIntArray517[local12] = arg3 * this.anIntArray517[local12] / 128;
					this.anIntArray516[local12] += Static281.anInt7445;
					this.anIntArray515[local12] += Static298.anInt5740;
					this.anIntArray517[local12] += Static378.anInt6354;
				}
			} else {
				@Pc(510) Class67 local510;
				@Pc(515) Class203 local515;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt7328; local12++) {
						local20 = arg1 * 8 + (this.aByteArray92[local12] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray92[local12] = (byte) local20;
					}
					if (this.aClass127_13 != null) {
						this.aClass127_13.anInterface6_3 = null;
					}
					if (this.aClass67Array1 != null) {
						for (local20 = 0; local20 < this.anInt7313; local20++) {
							local510 = this.aClass67Array1[local20];
							local515 = this.aClass203Array1[local20];
							local515.anInt5603 = local515.anInt5603 & 0xFFFFFF | 255 - (this.aByteArray92[local510.anInt2192] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt7328; local12++) {
						local20 = this.aShortArray152[local12] & 0xFFFF;
						local164 = local20 >> 10 & 0x3F;
						local182 = local20 >> 7 & 0x7;
						@Pc(577) int local577 = local164 + arg1 & 0x3F;
						@Pc(581) int local581 = local20 & 0x7F;
						local182 += arg2 / 4;
						local581 += arg3;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						if (local581 < 0) {
							local581 = 0;
						} else if (local581 > 127) {
							local581 = 127;
						}
						this.aShortArray152[local12] = (short) (local581 | local182 << 7 | local577 << 10);
					}
					if (this.aClass127_13 != null) {
						this.aClass127_13.anInterface6_3 = null;
					}
					if (this.aClass67Array1 != null) {
						for (local20 = 0; local20 < this.anInt7313; local20++) {
							local510 = this.aClass67Array1[local20];
							local515 = this.aClass203Array1[local20];
							local515.anInt5603 = Static135.anIntArray174[this.aShortArray152[local510.anInt2192] & 0xFFFF] & 0xFFFFFF | local515.anInt5603 & 0xFF000000;
						}
					}
				} else {
					@Pc(702) Class203 local702;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt7313; local12++) {
							local702 = this.aClass203Array1[local12];
							local702.anInt5596 += arg2;
							local702.anInt5598 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt7313; local12++) {
							local702 = this.aClass203Array1[local12];
							local702.anInt5602 = local702.anInt5602 * arg2 >> 7;
							local702.anInt5601 = arg1 * local702.anInt5601 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt7313; local12++) {
							local702 = this.aClass203Array1[local12];
							local702.anInt5600 = arg1 + local702.anInt5600 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!vq", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort99;
	}

	@OriginalMember(owner = "client!vq", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort101;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(FILclient!nd;IIIIJIF)S")
	private short method5702(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray518[arg1];
		@Pc(17) int local17 = this.anIntArray518[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray149[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static176.aLongArray5[local21] == arg7) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray149[local19] = (short) (this.anInt7289 + 1);
		Static176.aLongArray5[local19] = arg7;
		this.aShortArray145[this.anInt7289] = (short) arg4;
		this.aShortArray154[this.anInt7289] = (short) arg5;
		this.aShortArray151[this.anInt7289] = (short) arg3;
		this.aByteArray91[this.anInt7289] = (byte) arg6;
		this.aFloatArray32[this.anInt7289] = arg8;
		this.aFloatArray33[this.anInt7289] = arg0;
		return (short) this.anInt7289++;
	}

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort98;
	}

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort100;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	private void method5703() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7294; local23++) {
			@Pc(30) int local30 = this.anIntArray516[local23];
			@Pc(35) int local35 = this.anIntArray515[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(54) int local54 = this.anIntArray517[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local54 > local17) {
				local17 = local54;
			}
			if (local54 < local11) {
				local11 = local54;
			}
			@Pc(95) int local95 = local30 * local30 + local54 * local54;
			if (local95 > local19) {
				local19 = local95;
			}
			local95 = local54 * local54 + local30 * local30 + local35 * local35;
			if (local21 < local95) {
				local21 = local95;
			}
		}
		this.aShort95 = (short) local7;
		this.aShort96 = (short) local13;
		this.aShort94 = (short) local9;
		this.aShort97 = (short) local11;
		this.aShort100 = (short) local15;
		this.aShort93 = (short) local17;
		this.aShort101 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean631 = true;
	}

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7328; local3++) {
			if (this.aShortArray152[local3] == arg0) {
				this.aShortArray152[local3] = arg1;
			}
		}
		if (this.aClass67Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7313; local34++) {
				@Pc(41) Class67 local41 = this.aClass67Array1[local34];
				@Pc(46) Class203 local46 = this.aClass203Array1[local34];
				local46.anInt5603 = Static135.anIntArray174[this.aShortArray152[local41.anInt2192] & 0xFFFF] & 0xFFFFFF | local46.anInt5603 & 0xFF000000;
			}
		}
		if (this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg5 && arg6 < arg2 && arg6 < arg1) {
			return false;
		} else if (arg6 > arg5 && arg2 < arg6 && arg6 > arg1) {
			return false;
		} else if (arg4 > arg0 && arg7 > arg0 && arg3 > arg0) {
			return false;
		} else {
			return arg0 <= arg4 || arg0 <= arg7 || arg0 <= arg3;
		}
	}

	@OriginalMember(owner = "client!vq", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			Static281.anInt7445 = 0;
			Static378.anInt6354 = 0;
			Static298.anInt5740 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray56.length > local38) {
					local52 = this.anIntArrayArray56[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static281.anInt7445 += this.anIntArray516[local60];
						Static298.anInt5740 += this.anIntArray515[local60];
						Static378.anInt6354 += this.anIntArray517[local60];
						local30++;
					}
				}
			}
			if (local30 > 0) {
				Static298.anInt5740 = local22 + Static298.anInt5740 / local30;
				Static378.anInt6354 = local14 + Static378.anInt6354 / local30;
				Static281.anInt7445 = local18 + Static281.anInt7445 / local30;
			} else {
				Static378.anInt6354 = local14;
				Static298.anInt5740 = local22;
				Static281.anInt7445 = local18;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local18 = arg2 << 4;
			local22 = arg3 << 4;
			local14 = arg4 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray56.length > local32) {
					local158 = this.anIntArrayArray56[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local54 = local158[local160];
						this.anIntArray516[local54] += local18;
						this.anIntArray515[local54] += local22;
						this.anIntArray517[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(293) int local293;
		@Pc(748) int local748;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray56.length) {
					local158 = this.anIntArrayArray56[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							this.anIntArray516[local54] -= Static281.anInt7445;
							this.anIntArray515[local54] -= Static298.anInt5740;
							this.anIntArray517[local54] -= Static378.anInt6354;
							if (arg4 != 0) {
								local60 = Class3_Sub2_Sub17.anIntArray289[arg4];
								local274 = Class3_Sub2_Sub17.anIntArray290[arg4];
								local293 = local60 * this.anIntArray515[local54] + this.anIntArray516[local54] * local274 + 32767 >> 15;
								this.anIntArray515[local54] = local274 * this.anIntArray515[local54] + 32767 - local60 * this.anIntArray516[local54] >> 15;
								this.anIntArray516[local54] = local293;
							}
							if (arg2 != 0) {
								local60 = Class3_Sub2_Sub17.anIntArray289[arg2];
								local274 = Class3_Sub2_Sub17.anIntArray290[arg2];
								local293 = this.anIntArray515[local54] * local274 + 32767 - local60 * this.anIntArray517[local54] >> 15;
								this.anIntArray517[local54] = this.anIntArray515[local54] * local60 + this.anIntArray517[local54] * local274 + 32767 >> 15;
								this.anIntArray515[local54] = local293;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub2_Sub17.anIntArray289[arg3];
								local274 = Class3_Sub2_Sub17.anIntArray290[arg3];
								local293 = local274 * this.anIntArray516[local54] + local60 * this.anIntArray517[local54] + 32767 >> 15;
								this.anIntArray517[local54] = this.anIntArray517[local54] * local274 + 32767 - this.anIntArray516[local54] * local60 >> 15;
								this.anIntArray516[local54] = local293;
							}
							this.anIntArray516[local54] += Static281.anInt7445;
							this.anIntArray515[local54] += Static298.anInt5740;
							this.anIntArray517[local54] += Static378.anInt6354;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							this.anIntArray516[local54] -= Static281.anInt7445;
							this.anIntArray515[local54] -= Static298.anInt5740;
							this.anIntArray517[local54] -= Static378.anInt6354;
							if (arg2 != 0) {
								local60 = Class3_Sub2_Sub17.anIntArray289[arg2];
								local274 = Class3_Sub2_Sub17.anIntArray290[arg2];
								local293 = this.anIntArray515[local54] * local274 + 32767 - local60 * this.anIntArray517[local54] >> 15;
								this.anIntArray517[local54] = this.anIntArray517[local54] * local274 + this.anIntArray515[local54] * local60 + 32767 >> 15;
								this.anIntArray515[local54] = local293;
							}
							if (arg4 != 0) {
								local60 = Class3_Sub2_Sub17.anIntArray289[arg4];
								local274 = Class3_Sub2_Sub17.anIntArray290[arg4];
								local293 = local60 * this.anIntArray515[local54] + local274 * this.anIntArray516[local54] + 32767 >> 15;
								this.anIntArray515[local54] = local274 * this.anIntArray515[local54] + 32767 - local60 * this.anIntArray516[local54] >> 15;
								this.anIntArray516[local54] = local293;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub2_Sub17.anIntArray289[arg3];
								local274 = Class3_Sub2_Sub17.anIntArray290[arg3];
								local293 = local274 * this.anIntArray516[local54] + local60 * this.anIntArray517[local54] + 32767 >> 15;
								this.anIntArray517[local54] = local274 * this.anIntArray517[local54] + 32767 - local60 * this.anIntArray516[local54] >> 15;
								this.anIntArray516[local54] = local293;
							}
							this.anIntArray516[local54] += Static281.anInt7445;
							this.anIntArray515[local54] += Static298.anInt5740;
							this.anIntArray517[local54] += Static378.anInt6354;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray56.length) {
						local52 = this.anIntArrayArray56[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local274 = this.anIntArray518[local60];
							local293 = this.anIntArray518[local60 + 1];
							for (local748 = local274; local748 < local293; local748++) {
								@Pc(757) int local757 = this.aShortArray149[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class3_Sub2_Sub17.anIntArray289[arg4];
									local774 = Class3_Sub2_Sub17.anIntArray290[arg4];
									local792 = local774 * this.aShortArray145[local757] + this.aShortArray154[local757] * local770 + 32767 >> 15;
									this.aShortArray154[local757] = (short) (this.aShortArray154[local757] * local774 + 32767 - local770 * this.aShortArray145[local757] >> 15);
									this.aShortArray145[local757] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class3_Sub2_Sub17.anIntArray289[arg2];
									local774 = Class3_Sub2_Sub17.anIntArray290[arg2];
									local792 = local774 * this.aShortArray154[local757] + 32767 - this.aShortArray151[local757] * local770 >> 15;
									this.aShortArray151[local757] = (short) (local774 * this.aShortArray151[local757] + this.aShortArray154[local757] * local770 + 32767 >> 15);
									this.aShortArray154[local757] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class3_Sub2_Sub17.anIntArray289[arg3];
									local774 = Class3_Sub2_Sub17.anIntArray290[arg3];
									local792 = this.aShortArray145[local757] * local774 + this.aShortArray151[local757] * local770 + 32767 >> 15;
									this.aShortArray151[local757] = (short) (this.aShortArray151[local757] * local774 + 32767 - this.aShortArray145[local757] * local770 >> 15);
									this.aShortArray145[local757] = (short) local792;
								}
							}
						}
					}
				}
				if (this.aClass127_15 == null && this.aClass127_13 != null) {
					this.aClass127_13.anInterface6_3 = null;
				}
				if (this.aClass127_15 != null) {
					this.aClass127_15.anInterface6_3 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray56.length) {
					local158 = this.anIntArrayArray56[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local54 = local158[local160];
						this.anIntArray516[local54] -= Static281.anInt7445;
						this.anIntArray515[local54] -= Static298.anInt5740;
						this.anIntArray517[local54] -= Static378.anInt6354;
						this.anIntArray516[local54] = arg2 * this.anIntArray516[local54] >> 7;
						this.anIntArray515[local54] = this.anIntArray515[local54] * arg3 >> 7;
						this.anIntArray517[local54] = arg4 * this.anIntArray517[local54] >> 7;
						this.anIntArray516[local54] += Static281.anInt7445;
						this.anIntArray515[local54] += Static298.anInt5740;
						this.anIntArray517[local54] += Static378.anInt6354;
					}
				}
			}
		} else {
			@Pc(1203) Class67 local1203;
			@Pc(1208) Class203 local1208;
			if (arg0 == 5) {
				if (this.anIntArrayArray57 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray57.length > local32) {
							local158 = this.anIntArrayArray57[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local54 = local158[local160];
								local60 = (this.aByteArray92[local54] & 0xFF) + arg2 * 8;
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray92[local54] = (byte) local60;
							}
							if (local158.length > 0 && this.aClass127_13 != null) {
								this.aClass127_13.anInterface6_3 = null;
							}
						}
					}
					if (this.aClass67Array1 != null) {
						for (local32 = 0; local32 < this.anInt7313; local32++) {
							local1203 = this.aClass67Array1[local32];
							local1208 = this.aClass203Array1[local32];
							local1208.anInt5603 = 255 - (this.aByteArray92[local1203.anInt2192] & 0xFF) << 24 | local1208.anInt5603 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1457) Class203 local1457;
				if (arg0 == 8) {
					if (this.anIntArrayArray55 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray55.length) {
								local158 = this.anIntArrayArray55[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1457 = this.aClass203Array1[local158[local160]];
									local1457.anInt5598 += arg2;
									local1457.anInt5596 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray55 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray55.length) {
								local158 = this.anIntArrayArray55[local32];
								for (local160 = 0; local160 < local158.length; local160++) {
									local1457 = this.aClass203Array1[local158[local160]];
									local1457.anInt5601 = arg2 * local1457.anInt5601 >> 7;
									local1457.anInt5602 = local1457.anInt5602 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray55 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray55.length) {
							local158 = this.anIntArrayArray55[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1457 = this.aClass203Array1[local158[local160]];
								local1457.anInt5600 = local1457.anInt5600 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray57 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray57.length) {
						local158 = this.anIntArrayArray57[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local54 = local158[local160];
							local60 = this.aShortArray152[local54] & 0xFFFF;
							local274 = local60 >> 10 & 0x3F;
							local293 = local60 >> 7 & 0x7;
							local748 = local60 & 0x7F;
							local293 += arg3 / 4;
							@Pc(1301) int local1301 = local274 + arg2 & 0x3F;
							if (local293 < 0) {
								local293 = 0;
							} else if (local293 > 7) {
								local293 = 7;
							}
							local748 += arg4;
							if (local748 < 0) {
								local748 = 0;
							} else if (local748 > 127) {
								local748 = 127;
							}
							this.aShortArray152[local54] = (short) (local748 | local1301 << 10 | local293 << 7);
						}
						if (local158.length > 0 && this.aClass127_13 != null) {
							this.aClass127_13.anInterface6_3 = null;
						}
					}
				}
				if (this.aClass67Array1 != null) {
					for (local32 = 0; local32 < this.anInt7313; local32++) {
						local1203 = this.aClass67Array1[local32];
						local1208 = this.aClass203Array1[local32];
						local1208.anInt5603 = local1208.anInt5603 & 0xFF000000 | Static135.anIntArray174[this.aShortArray152[local1203.anInt2192] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "()V")
	@Override
	public void method5682() {
		if (this.anInt7289 <= 0 || this.anInt7307 <= 0) {
			return;
		}
		this.method5709(false);
		if ((this.aByte103 & 0x10) == 0 && this.aClass239_1.anInterface10_3 == null) {
			this.method5701(false);
		}
		this.method5710();
	}

	@OriginalMember(owner = "client!vq", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(3) int local3 = 0; local3 < this.lb; local3++) {
			this.anIntArray516[local3] = this.anIntArray516[local3] + 7 >> 4;
			this.anIntArray515[local3] = this.anIntArray515[local3] + 7 >> 4;
			this.anIntArray517[local3] = this.anIntArray517[local3] + 7 >> 4;
		}
		this.aBoolean631 = false;
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub17.anIntArray289[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub17.anIntArray290[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7294; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray517[local15] + local13 * this.anIntArray516[local15] >> 15;
			this.anIntArray517[local15] = local13 * this.anIntArray517[local15] - local9 * this.anIntArray516[local15] >> 15;
			this.anIntArray516[local15] = local34;
		}
		this.aBoolean631 = false;
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z")
	@Override
	public boolean method5690() {
		if (this.aShortArray147 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray147.length; local12++) {
			if (this.aShortArray147[local12] != -1 && !this.aClass172_Sub2_41.anInterface5_8.method3921(this.aShortArray147[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		if (this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
		}
		this.aShort98 = (short) arg0;
		if (this.aClass127_15 != null) {
			this.aClass127_15.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7294; local7++) {
			this.anIntArray517[local7] = -this.anIntArray517[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7289; local25++) {
			this.aShortArray151[local25] = (short) -this.aShortArray151[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt7328; local44++) {
			@Pc(51) short local51 = this.aShortArray153[local44];
			this.aShortArray153[local44] = this.aShortArray146[local44];
			this.aShortArray146[local44] = local51;
		}
		if (this.aClass127_15 == null && this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
		}
		if (this.aClass127_15 != null) {
			this.aClass127_15.anInterface6_3 = null;
		}
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
		this.aBoolean631 = false;
		if (this.aClass239_1 != null) {
			this.aClass239_1.anInterface10_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	private void method5706() {
		if (this.anInt7307 == 0) {
			return;
		}
		if (this.aByte103 != 0) {
			this.method5709(true);
		}
		this.method5709(false);
		if (this.aClass239_1 != null) {
			if (this.aClass239_1.anInterface10_3 == null) {
				this.method5701((this.aByte103 & 0x10) != 0);
			}
			if (this.aClass239_1.anInterface10_3 != null) {
				this.aClass172_Sub2_41.method5581(this.aClass127_15 != null);
				this.aClass172_Sub2_41.method5622(this.aClass127_13, this.aClass127_16, this.aClass127_14, this.aClass127_15);
				@Pc(81) int local81 = this.anIntArray514.length - 1;
				for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
					@Pc(90) int local90 = this.anIntArray514[local83];
					@Pc(97) int local97 = this.anIntArray514[local83 + 1];
					@Pc(104) int local104 = this.aShortArray147[local90] & 0xFFFF;
					if (local104 == 65535) {
						local104 = -1;
					}
					this.aClass172_Sub2_41.method5579(this.aClass127_15 != null, local104);
					this.aClass172_Sub2_41.method5628((local97 - local90) * 3, this.aClass239_1.anInterface10_3, local90 * 3);
				}
			}
		}
		this.method5710();
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!vq", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray56 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.lb; local12++) {
			this.anIntArray516[local12] <<= 0x4;
			this.anIntArray515[local12] <<= 0x4;
			this.anIntArray517[local12] <<= 0x4;
		}
		Static298.anInt5740 = 0;
		Static281.anInt7445 = 0;
		Static378.anInt6354 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "()[Lclient!nk;")
	@Override
	public Class165[] method5685() {
		return this.aClass165Array4;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!vq;ILclient!vq;ZB)Lclient!c;")
	private Class9 method5707(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub2 arg3, @OriginalArg(4) boolean arg4) {
		arg1.anInt7328 = this.anInt7328;
		arg1.anInt7294 = this.anInt7294;
		arg1.lb = this.lb;
		arg1.anInt7299 = this.anInt7299;
		arg1.aByte103 = 0;
		arg1.aShort99 = this.aShort99;
		arg1.anInt7314 = arg2;
		arg1.anInt7289 = this.anInt7289;
		arg1.anInt7307 = this.anInt7307;
		arg1.aShort98 = this.aShort98;
		arg1.anInt7313 = this.anInt7313;
		@Pc(53) boolean local53 = Static452.method5952(arg2, this.anInt7299);
		@Pc(59) boolean local59 = Static23.method511(arg2, this.anInt7299);
		@Pc(65) boolean local65 = Static262.method3815(arg2, this.anInt7299);
		@Pc(71) boolean local71 = local53 | local59 | local65;
		@Pc(190) int local190;
		if (local71) {
			if (!local53) {
				arg1.anIntArray516 = this.anIntArray516;
			} else if (arg3.anIntArray516 == null || this.lb > arg3.anIntArray516.length) {
				arg1.anIntArray516 = arg3.anIntArray516 = new int[this.lb];
			} else {
				arg1.anIntArray516 = arg3.anIntArray516;
			}
			if (!local59) {
				arg1.anIntArray515 = this.anIntArray515;
			} else if (arg3.anIntArray515 == null || this.lb > arg3.anIntArray515.length) {
				arg1.anIntArray515 = arg3.anIntArray515 = new int[this.lb];
			} else {
				arg1.anIntArray515 = arg3.anIntArray515;
			}
			if (!local65) {
				arg1.anIntArray517 = this.anIntArray517;
			} else if (arg3.anIntArray517 == null || this.lb > arg3.anIntArray517.length) {
				arg1.anIntArray517 = arg3.anIntArray517 = new int[this.lb];
			} else {
				arg1.anIntArray517 = arg3.anIntArray517;
			}
			for (local190 = 0; local190 < this.lb; local190++) {
				if (local53) {
					arg1.anIntArray516[local190] = this.anIntArray516[local190];
				}
				if (local59) {
					arg1.anIntArray515[local190] = this.anIntArray515[local190];
				}
				if (local65) {
					arg1.anIntArray517[local190] = this.anIntArray517[local190];
				}
			}
		} else {
			arg1.anIntArray515 = this.anIntArray515;
			arg1.anIntArray517 = this.anIntArray517;
			arg1.anIntArray516 = this.anIntArray516;
		}
		if (Static40.method776(this.anInt7299, arg2)) {
			arg1.aClass127_14 = arg3.aClass127_14;
			if (arg4) {
				arg1.aByte103 = (byte) (arg1.aByte103 | 0x1);
			}
			arg1.aClass127_14.aByte75 = this.aClass127_14.aByte75;
			arg1.aClass127_14.anInterface6_3 = this.aClass127_14.anInterface6_3;
		} else if (Static131.method2042(this.anInt7299, arg2)) {
			arg1.aClass127_14 = this.aClass127_14;
		} else {
			arg1.aClass127_14 = null;
		}
		if (Static13.method309(this.anInt7299, arg2)) {
			if (arg3.aShortArray152 == null || this.anInt7328 > arg3.aShortArray152.length) {
				arg1.aShortArray152 = arg3.aShortArray152 = new short[this.anInt7328];
			} else {
				arg1.aShortArray152 = arg3.aShortArray152;
			}
			for (local190 = 0; local190 < this.anInt7328; local190++) {
				arg1.aShortArray152[local190] = this.aShortArray152[local190];
			}
		} else {
			arg1.aShortArray152 = this.aShortArray152;
		}
		if (Static14.method323(this.anInt7299, arg2)) {
			if (arg3.aByteArray92 == null || this.anInt7328 > arg3.aByteArray92.length) {
				arg1.aByteArray92 = arg3.aByteArray92 = new byte[this.anInt7328];
			} else {
				arg1.aByteArray92 = arg3.aByteArray92;
			}
			for (local190 = 0; local190 < this.anInt7328; local190++) {
				arg1.aByteArray92[local190] = this.aByteArray92[local190];
			}
		} else {
			arg1.aByteArray92 = this.aByteArray92;
		}
		if (Static120.method1956(arg2, this.anInt7299)) {
			arg1.aClass127_13 = arg3.aClass127_13;
			if (arg4) {
				arg1.aByte103 = (byte) (arg1.aByte103 | 0x2);
			}
			arg1.aClass127_13.anInterface6_3 = this.aClass127_13.anInterface6_3;
			arg1.aClass127_13.aByte75 = this.aClass127_13.aByte75;
		} else if (Static104.method1811(this.anInt7299, arg2)) {
			arg1.aClass127_13 = this.aClass127_13;
		} else {
			arg1.aClass127_13 = null;
		}
		@Pc(582) int local582;
		if (Static164.method2715(arg2, this.anInt7299)) {
			if (arg3.aShortArray145 == null || this.anInt7289 > arg3.aShortArray145.length) {
				local190 = this.anInt7289;
				arg1.aShortArray154 = arg3.aShortArray154 = new short[local190];
				arg1.aShortArray145 = arg3.aShortArray145 = new short[local190];
				arg1.aShortArray151 = arg3.aShortArray151 = new short[local190];
			} else {
				arg1.aShortArray154 = arg3.aShortArray154;
				arg1.aShortArray145 = arg3.aShortArray145;
				arg1.aShortArray151 = arg3.aShortArray151;
			}
			if (this.aClass18_1 == null) {
				for (local190 = 0; local190 < this.anInt7289; local190++) {
					arg1.aShortArray145[local190] = this.aShortArray145[local190];
					arg1.aShortArray154[local190] = this.aShortArray154[local190];
					arg1.aShortArray151[local190] = this.aShortArray151[local190];
				}
			} else {
				if (arg3.aClass18_1 == null) {
					arg3.aClass18_1 = new Class18();
				}
				@Pc(570) Class18 local570 = arg1.aClass18_1 = arg3.aClass18_1;
				if (local570.aShortArray18 == null || local570.aShortArray18.length < this.anInt7289) {
					local582 = this.anInt7289;
					local570.aShortArray18 = new short[local582];
					local570.aByteArray11 = new byte[local582];
					local570.aShortArray17 = new short[local582];
					local570.aShortArray16 = new short[local582];
				}
				for (local582 = 0; local582 < this.anInt7289; local582++) {
					arg1.aShortArray145[local582] = this.aShortArray145[local582];
					arg1.aShortArray154[local582] = this.aShortArray154[local582];
					arg1.aShortArray151[local582] = this.aShortArray151[local582];
					local570.aShortArray18[local582] = this.aClass18_1.aShortArray18[local582];
					local570.aShortArray16[local582] = this.aClass18_1.aShortArray16[local582];
					local570.aShortArray17[local582] = this.aClass18_1.aShortArray17[local582];
					local570.aByteArray11[local582] = this.aClass18_1.aByteArray11[local582];
				}
			}
			arg1.aByteArray91 = this.aByteArray91;
		} else {
			arg1.aClass18_1 = this.aClass18_1;
			arg1.aShortArray151 = this.aShortArray151;
			arg1.aShortArray145 = this.aShortArray145;
			arg1.aShortArray154 = this.aShortArray154;
			arg1.aByteArray91 = this.aByteArray91;
		}
		if (Static348.method4624(this.anInt7299, arg2)) {
			if (arg4) {
				arg1.aByte103 = (byte) (arg1.aByte103 | 0x4);
			}
			arg1.aClass127_15 = arg3.aClass127_15;
			arg1.aClass127_15.aByte75 = this.aClass127_15.aByte75;
			arg1.aClass127_15.anInterface6_3 = this.aClass127_15.anInterface6_3;
		} else if (Static332.method4457(arg2, this.anInt7299)) {
			arg1.aClass127_15 = this.aClass127_15;
		} else {
			arg1.aClass127_15 = null;
		}
		if (Static435.method5712(arg2, this.anInt7299)) {
			if (arg3.aFloatArray32 == null || arg3.aFloatArray32.length < this.anInt7328) {
				local190 = this.anInt7289;
				arg1.aFloatArray33 = arg3.aFloatArray33 = new float[local190];
				arg1.aFloatArray32 = arg3.aFloatArray32 = new float[local190];
			} else {
				arg1.aFloatArray32 = arg3.aFloatArray32;
				arg1.aFloatArray33 = arg3.aFloatArray33;
			}
			for (local190 = 0; local190 < this.anInt7289; local190++) {
				arg1.aFloatArray32[local190] = this.aFloatArray32[local190];
				arg1.aFloatArray33[local190] = this.aFloatArray33[local190];
			}
		} else {
			arg1.aFloatArray32 = this.aFloatArray32;
			arg1.aFloatArray33 = this.aFloatArray33;
		}
		if (Static286.method1099(this.anInt7299, arg2)) {
			if (arg4) {
				arg1.aByte103 = (byte) (arg1.aByte103 | 0x8);
			}
			arg1.aClass127_16 = arg3.aClass127_16;
			arg1.aClass127_16.anInterface6_3 = this.aClass127_16.anInterface6_3;
			arg1.aClass127_16.aByte75 = this.aClass127_16.aByte75;
		} else if (Static274.method3901(arg2, this.anInt7299)) {
			arg1.aClass127_16 = this.aClass127_16;
		} else {
			arg1.aClass127_16 = null;
		}
		if (Static93.method1695(arg2, this.anInt7299)) {
			if (arg3.aShortArray153 == null || this.anInt7328 > arg3.aShortArray153.length) {
				local190 = this.anInt7328;
				arg1.aShortArray146 = arg3.aShortArray146 = new short[local190];
				arg1.aShortArray153 = arg3.aShortArray153 = new short[local190];
				arg1.aShortArray150 = arg3.aShortArray150 = new short[local190];
			} else {
				arg1.aShortArray153 = arg3.aShortArray153;
				arg1.aShortArray146 = arg3.aShortArray146;
				arg1.aShortArray150 = arg3.aShortArray150;
			}
			for (local190 = 0; local190 < this.anInt7328; local190++) {
				arg1.aShortArray153[local190] = this.aShortArray153[local190];
				arg1.aShortArray150[local190] = this.aShortArray150[local190];
				arg1.aShortArray146[local190] = this.aShortArray146[local190];
			}
		} else {
			arg1.aShortArray153 = this.aShortArray153;
			arg1.aShortArray150 = this.aShortArray150;
			arg1.aShortArray146 = this.aShortArray146;
		}
		if (Static8.method4685(arg2, this.anInt7299)) {
			if (arg4) {
				arg1.aByte103 = (byte) (arg1.aByte103 | 0x10);
			}
			arg1.aClass239_1 = arg3.aClass239_1;
			arg1.aClass239_1.anInterface10_3 = this.aClass239_1.anInterface10_3;
		} else if (Static261.method664(this.anInt7299, arg2)) {
			arg1.aClass239_1 = this.aClass239_1;
		} else {
			arg1.aClass239_1 = null;
		}
		if (Static408.method5247(this.anInt7299, arg2)) {
			if (arg3.aShortArray147 == null || this.anInt7328 > arg3.aShortArray147.length) {
				local190 = this.anInt7328;
				arg1.aShortArray147 = arg3.aShortArray147 = new short[local190];
			} else {
				arg1.aShortArray147 = arg3.aShortArray147;
			}
			for (local190 = 0; local190 < this.anInt7328; local190++) {
				arg1.aShortArray147[local190] = this.aShortArray147[local190];
			}
		} else {
			arg1.aShortArray147 = this.aShortArray147;
		}
		if (!Static9.method114(arg2, this.anInt7299)) {
			arg1.aClass203Array1 = this.aClass203Array1;
		} else if (arg3.aClass203Array1 == null || arg3.aClass203Array1.length < this.anInt7313) {
			local190 = this.anInt7313;
			arg1.aClass203Array1 = arg3.aClass203Array1 = new Class203[local190];
			for (local582 = 0; local582 < this.anInt7313; local582++) {
				arg1.aClass203Array1[local582] = this.aClass203Array1[local582].method4385();
			}
		} else {
			arg1.aClass203Array1 = arg3.aClass203Array1;
			for (local190 = 0; local190 < this.anInt7313; local190++) {
				arg1.aClass203Array1[local190].method4388(this.aClass203Array1[local190]);
			}
		}
		arg1.aClass67Array1 = this.aClass67Array1;
		arg1.anIntArrayArray55 = this.anIntArrayArray55;
		arg1.aClass165Array4 = this.aClass165Array4;
		if (this.aBoolean631) {
			arg1.aShort95 = this.aShort95;
			arg1.aShort101 = this.aShort101;
			arg1.aBoolean631 = true;
			arg1.aShort100 = this.aShort100;
			arg1.aShort96 = this.aShort96;
			arg1.aShort94 = this.aShort94;
			arg1.aShort97 = this.aShort97;
			arg1.aShort93 = this.aShort93;
		} else {
			arg1.aBoolean631 = false;
		}
		arg1.aShortArray155 = this.aShortArray155;
		arg1.anIntArrayArray57 = this.anIntArrayArray57;
		arg1.aShortArray148 = this.aShortArray148;
		arg1.anIntArray518 = this.anIntArray518;
		arg1.aClass269Array4 = this.aClass269Array4;
		arg1.aShortArray149 = this.aShortArray149;
		arg1.anIntArrayArray56 = this.anIntArrayArray56;
		arg1.anIntArray514 = this.anIntArray514;
		return arg1;
	}

	@OriginalMember(owner = "client!vq", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort96;
	}

	@OriginalMember(owner = "client!vq", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean631) {
			this.method5703();
		}
		@Pc(16) int local16 = arg4 + this.aShort95;
		@Pc(21) int local21 = arg4 + this.aShort96;
		@Pc(26) int local26 = arg6 + this.aShort97;
		@Pc(31) int local31 = this.aShort93 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt6189 <= arg2.anInt6190 + local21 >> arg2.anInt6193 || local26 < 0 || arg2.anInt6192 <= arg2.anInt6190 + local31 >> arg2.anInt6193)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt6190 >> arg3.anInt6193 >= arg3.anInt6189 || local26 < 0 || arg3.anInt6192 <= arg3.anInt6190 + local31 >> arg3.anInt6193) {
				return;
			}
		} else {
			local16 >>= arg2.anInt6193;
			local21 = arg2.anInt6190 + local21 - 1 >> arg2.anInt6193;
			local26 >>= arg2.anInt6193;
			local31 = local31 + arg2.anInt6190 - 1 >> arg2.anInt6193;
			if (arg5 == arg2.I(local16, local26) && arg2.I(local21, local26) == arg5 && arg5 == arg2.I(local16, local31) && arg5 == arg2.I(local21, local31)) {
				return;
			}
		}
		@Pc(198) int local198;
		if (arg0 == 1) {
			for (local198 = 0; local198 < this.anInt7294; local198++) {
				this.anIntArray515[local198] = this.anIntArray515[local198] + arg2.va(arg4 + this.anIntArray516[local198], arg6 + this.anIntArray517[local198]) - arg5;
			}
		} else {
			@Pc(255) int local255;
			@Pc(263) int local263;
			if (arg0 == 2) {
				@Pc(460) short local460 = this.aShort94;
				if (local460 == 0) {
					return;
				}
				for (local255 = 0; local255 < this.anInt7294; local255++) {
					local263 = (this.anIntArray515[local255] << 16) / local460;
					if (arg1 > local263) {
						this.anIntArray515[local255] += (arg2.va(this.anIntArray516[local255] + arg4, arg6 + this.anIntArray517[local255]) - arg5) * (-local263 + arg1) / arg1;
					}
				}
			} else {
				@Pc(271) int local271;
				if (arg0 == 3) {
					local198 = (arg1 & 0xFF) * 4;
					local255 = (arg1 >> 8 & 0xFF) * 4;
					local263 = (arg1 >> 16 & 0xFF) << 6;
					local271 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local198 >> 1) < 0 || arg4 + (local198 >> 1) + arg2.anInt6190 >= arg2.anInt6189 << arg2.anInt6193 || arg6 - (local255 >> 1) < 0 || arg2.anInt6192 << arg2.anInt6193 <= arg2.anInt6190 + arg6 + (local255 >> 1)) {
						return;
					}
					this.method5681(arg6, local198, local255, arg5, arg2, local271, arg4, local263);
				} else if (arg0 == 4) {
					local198 = this.aShort100 - this.aShort94;
					for (local255 = 0; local255 < this.anInt7294; local255++) {
						this.anIntArray515[local255] += arg3.va(this.anIntArray516[local255] + arg4, arg6 + this.anIntArray517[local255]) + local198 - arg5;
					}
				} else if (arg0 == 5) {
					local198 = this.aShort100 - this.aShort94;
					for (local255 = 0; local255 < this.anInt7294; local255++) {
						local263 = this.anIntArray516[local255] + arg4;
						local271 = arg6 + this.anIntArray517[local255];
						@Pc(368) int local368 = arg2.va(local263, local271);
						@Pc(373) int local373 = arg3.va(local263, local271);
						@Pc(378) int local378 = local368 - local373;
						this.anIntArray515[local255] = ((this.anIntArray515[local255] << 8) / local198 * local378 >> 8) + local368 - arg5;
					}
				}
			}
		}
		this.aBoolean631 = false;
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class107_Sub1 local8 = (Class107_Sub1) arg2;
		@Pc(12) Class107_Sub1 local12 = this.aClass172_Sub2_41.aClass107_Sub1_4;
		@Pc(33) float local33 = local8.aFloat44 * local12.aFloat41 + local8.aFloat42 * local12.aFloat43 + local8.aFloat35 * local12.aFloat36 + local12.aFloat42;
		@Pc(54) float local54 = local12.aFloat44 + local8.aFloat35 * local12.aFloat40 + local8.aFloat44 * local12.aFloat38 + local12.aFloat37 * local8.aFloat42;
		Static150.aFloat31 = local8.aFloat46 * local12.aFloat39 + local12.aFloat46 * local8.aFloat38 + local12.aFloat45 * local8.aFloat41;
		Static193.aFloat30 = local8.aFloat36 * local12.aFloat37 + local12.aFloat38 * local8.aFloat40 + local8.aFloat39 * local12.aFloat40;
		Static305.aFloat60 = local12.aFloat39 * local8.aFloat39 + local8.aFloat40 * local12.aFloat46 + local12.aFloat45 * local8.aFloat36;
		Static401.aFloat72 = local8.aFloat38 * local12.aFloat41 + local8.aFloat41 * local12.aFloat43 + local8.aFloat46 * local12.aFloat36;
		Static152.aFloat25 = local12.aFloat40 * local8.aFloat45 + local12.aFloat37 * local8.aFloat43 + local8.aFloat37 * local12.aFloat38;
		@Pc(165) float local165 = local12.aFloat35 + local12.aFloat39 * local8.aFloat35 + local12.aFloat45 * local8.aFloat42 + local12.aFloat46 * local8.aFloat44;
		Static133.aFloat20 = local12.aFloat36 * local8.aFloat39 + local12.aFloat43 * local8.aFloat36 + local12.aFloat41 * local8.aFloat40;
		Static422.aFloat74 = local8.aFloat37 * local12.aFloat46 + local12.aFloat45 * local8.aFloat43 + local12.aFloat39 * local8.aFloat45;
		Static125.aFloat19 = local12.aFloat36 * local8.aFloat45 + local8.aFloat37 * local12.aFloat41 + local8.aFloat43 * local12.aFloat43;
		Static83.aFloat14 = local8.aFloat38 * local12.aFloat38 + local12.aFloat37 * local8.aFloat41 + local12.aFloat40 * local8.aFloat46;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass172_Sub2_41.anInt7185;
		@Pc(255) int local255 = this.aClass172_Sub2_41.anInt7200;
		if (!this.aBoolean631) {
			this.method5703();
		}
		Static310.anIntArray369[0] = this.aShort95;
		Static160.anIntArray207[0] = this.aShort94;
		Static310.anIntArray369[1] = this.aShort96;
		Static244.anIntArray298[0] = this.aShort97;
		Static160.anIntArray207[1] = this.aShort94;
		Static310.anIntArray369[2] = this.aShort95;
		Static244.anIntArray298[1] = this.aShort97;
		Static160.anIntArray207[2] = this.aShort100;
		Static244.anIntArray298[2] = this.aShort97;
		Static310.anIntArray369[3] = this.aShort96;
		Static160.anIntArray207[3] = this.aShort100;
		Static244.anIntArray298[3] = this.aShort97;
		Static310.anIntArray369[4] = this.aShort95;
		Static160.anIntArray207[4] = this.aShort94;
		Static244.anIntArray298[4] = this.aShort93;
		Static310.anIntArray369[5] = this.aShort96;
		Static160.anIntArray207[5] = this.aShort94;
		Static244.anIntArray298[5] = this.aShort93;
		Static310.anIntArray369[6] = this.aShort95;
		Static160.anIntArray207[6] = this.aShort100;
		Static310.anIntArray369[7] = this.aShort96;
		Static244.anIntArray298[6] = this.aShort93;
		Static160.anIntArray207[7] = this.aShort100;
		Static244.anIntArray298[7] = this.aShort93;
		@Pc(442) float local442;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static310.anIntArray369[local383];
			local395 = Static244.anIntArray298[local383];
			local400 = Static160.anIntArray207[local383];
			local414 = local400 * Static83.aFloat14 + local390 * Static152.aFloat25 + local395 * Static193.aFloat30 + local54;
			local428 = local165 + local390 * Static422.aFloat74 + Static150.aFloat31 * local400 + Static305.aFloat60 * local395;
			local442 = local33 + local390 * Static125.aFloat19 + local400 * Static401.aFloat72 + Static133.aFloat20 * local395;
			if ((float) this.aClass172_Sub2_41.anInt7196 <= local428) {
				@Pc(461) float local461 = (float) local251 * local442 / local428 + (float) this.aClass172_Sub2_41.anInt7197;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local241 > local461) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass172_Sub2_41.anInt7170 + local414 * (float) local255 / local428;
				if (local245 > local485) {
					local245 = local485;
				}
				local239 = true;
				if (local485 > local247) {
					local247 = local485;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (Static188.anIntArray238.length < this.anInt7289) {
				Static253.anIntArray307 = new int[this.anInt7289];
				Static188.anIntArray238 = new int[this.anInt7289];
			}
			@Pc(620) int local620;
			for (@Pc(546) int local546 = 0; local546 < this.anInt7294; local546++) {
				local395 = this.anIntArray517[local546];
				local400 = this.anIntArray515[local546];
				local390 = this.anIntArray516[local546];
				local414 = local54 + Static193.aFloat30 * local395 + local400 * Static83.aFloat14 + local390 * Static152.aFloat25;
				local442 = local33 + Static133.aFloat20 * local395 + Static401.aFloat72 * local400 + Static125.aFloat19 * local390;
				local428 = local165 + Static305.aFloat60 * local395 + Static422.aFloat74 * local390 + Static150.aFloat31 * local400;
				@Pc(627) int local627;
				@Pc(629) int local629;
				@Pc(638) int local638;
				if (local428 >= (float) this.aClass172_Sub2_41.anInt7196) {
					local620 = (int) ((float) local251 * local442 / local428 + (float) this.aClass172_Sub2_41.anInt7197);
					local627 = (int) ((float) this.aClass172_Sub2_41.anInt7170 + local414 * (float) local255 / local428);
					local629 = this.anIntArray518[local546];
					local638 = this.anIntArray518[local546 + 1];
					for (@Pc(700) int local700 = local629; local700 < local638; local700++) {
						@Pc(709) int local709 = this.aShortArray149[local700] - 1;
						if (local709 == -1) {
							break;
						}
						Static188.anIntArray238[local709] = local620;
						Static253.anIntArray307[local709] = local627;
					}
				} else {
					local620 = this.anIntArray518[local546];
					local627 = this.anIntArray518[local546 + 1];
					for (local629 = local620; local629 < local627; local629++) {
						local638 = this.aShortArray149[local629] - 1;
						if (local638 == -1) {
							break;
						}
						Static188.anIntArray238[this.aShortArray149[local629] - 1] = -999999;
					}
				}
			}
			for (local620 = 0; local620 < this.anInt7328; local620++) {
				if (Static188.anIntArray238[this.aShortArray153[local620]] != -999999 && Static188.anIntArray238[this.aShortArray150[local620]] != -999999 && Static188.anIntArray238[this.aShortArray146[local620]] != -999999 && this.method5704(arg0, Static253.anIntArray307[this.aShortArray146[local620]], Static253.anIntArray307[this.aShortArray150[local620]], Static188.anIntArray238[this.aShortArray146[local620]], Static188.anIntArray238[this.aShortArray153[local620]], Static253.anIntArray307[this.aShortArray153[local620]], arg1, Static188.anIntArray238[this.aShortArray150[local620]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(ZI)V")
	private void method5709(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass127_13 != null && this.aClass127_13.anInterface6_3 == null;
		@Pc(27) boolean local27 = this.aClass127_15 != null && this.aClass127_15.anInterface6_3 == null;
		@Pc(38) boolean local38 = this.aClass127_14 != null && this.aClass127_14.anInterface6_3 == null;
		@Pc(49) boolean local49 = this.aClass127_16 != null && this.aClass127_16.anInterface6_3 == null;
		if (arg0) {
			local49 &= (this.aByte103 & 0x8) != 0;
			local27 &= (this.aByte103 & 0x4) != 0;
			local16 &= (this.aByte103 & 0x2) != 0;
			local38 &= (this.aByte103 & 0x1) != 0;
		}
		@Pc(109) byte local109 = 0;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (local38) {
			local109 = 12;
		}
		if (local16) {
			local113 = local109;
			local109 = (byte) (local109 + 4);
		}
		if (local27) {
			local115 = local109;
			local109 = (byte) (local109 + 12);
		}
		if (local49) {
			local117 = local109;
			local109 = (byte) (local109 + 8);
		}
		if (local109 == 0) {
			return;
		}
		if (Static435.aClass3_Sub7_Sub2_3.aByteArray46.length < this.anInt7289 * local109) {
			Static435.aClass3_Sub7_Sub2_3 = new Class3_Sub7_Sub2((this.anInt7289 + 100) * local109);
		} else {
			Static435.aClass3_Sub7_Sub2_3.anInt3235 = 0;
		}
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local38) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass172_Sub2_41.aBoolean621) {
				for (local191 = 0; local191 < this.anInt7294; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray516[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray515[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray517[local191]);
					local219 = this.anIntArray518[local191];
					local226 = this.anIntArray518[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray149[local228] - 1;
						if (local237 == -1) {
							break;
						}
						Static435.aClass3_Sub7_Sub2_3.anInt3235 = local237 * local109;
						Static435.aClass3_Sub7_Sub2_3.method2636(local200);
						Static435.aClass3_Sub7_Sub2_3.method2636(local207);
						Static435.aClass3_Sub7_Sub2_3.method2636(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt7294; local191++) {
					local200 = NativeStream.floatToRawIntBits((float) this.anIntArray516[local191]);
					local207 = NativeStream.floatToRawIntBits((float) this.anIntArray515[local191]);
					local214 = NativeStream.floatToRawIntBits((float) this.anIntArray517[local191]);
					local219 = this.anIntArray518[local191];
					local226 = this.anIntArray518[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray149[local228] - 1;
						if (local237 == -1) {
							break;
						}
						Static435.aClass3_Sub7_Sub2_3.anInt3235 = local237 * local109;
						Static435.aClass3_Sub7_Sub2_3.method2615(local200);
						Static435.aClass3_Sub7_Sub2_3.method2615(local207);
						Static435.aClass3_Sub7_Sub2_3.method2615(local214);
					}
				}
			}
		}
		@Pc(466) float local466;
		@Pc(367) short[] local367;
		@Pc(363) short[] local363;
		@Pc(375) short[] local375;
		@Pc(371) byte[] local371;
		@Pc(527) float local527;
		if (local16) {
			if (this.aClass127_15 == null) {
				if (this.aClass18_1 == null) {
					local367 = this.aShortArray145;
					local363 = this.aShortArray154;
					local371 = this.aByteArray91;
					local375 = this.aShortArray151;
				} else {
					local363 = this.aClass18_1.aShortArray16;
					local367 = this.aClass18_1.aShortArray18;
					local371 = this.aClass18_1.aByteArray11;
					local375 = this.aClass18_1.aShortArray17;
				}
				@Pc(395) float local395 = this.aClass172_Sub2_41.aFloatArray26[0];
				@Pc(401) float local401 = this.aClass172_Sub2_41.aFloatArray26[1];
				@Pc(407) float local407 = this.aClass172_Sub2_41.aFloatArray26[2];
				@Pc(411) float local411 = this.aClass172_Sub2_41.aFloat77;
				@Pc(421) float local421 = this.aClass172_Sub2_41.aFloat78 * 768.0F / (float) this.aShort98;
				@Pc(431) float local431 = this.aClass172_Sub2_41.aFloat95 * 768.0F / (float) this.aShort98;
				for (@Pc(433) int local433 = 0; local433 < this.anInt7328; local433++) {
					@Pc(455) int local455 = this.method5714(this.aByteArray92[local433], this.aShortArray152[local433], this.aShort99, this.aShortArray147[local433]);
					local466 = (float) (local455 >> 16 & 0xFF) * this.aClass172_Sub2_41.aFloat85;
					@Pc(477) float local477 = this.aClass172_Sub2_41.aFloat76 * (float) (local455 >> 8 & 0xFF);
					@Pc(482) short local482 = this.aShortArray153[local433];
					@Pc(491) float local491 = this.aClass172_Sub2_41.aFloat84 * (float) (local455 >>> 24);
					@Pc(496) short local496 = (short) local371[local482];
					if (local496 == 0) {
						local527 = (local401 * (float) local363[local482] + (float) local367[local482] * local395 + (float) local375[local482] * local407) * 0.0026041667F;
					} else {
						local527 = (local401 * (float) local363[local482] + (float) local367[local482] * local395 + (float) local375[local482] * local407) / (float) (local496 * 256);
					}
					@Pc(564) float local564 = (local527 < 0.0F ? local431 : local421) * local527 + local411;
					@Pc(569) int local569 = (int) (local491 * local564);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					@Pc(587) int local587 = (int) (local564 * local466);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					@Pc(608) int local608 = (int) (local564 * local477);
					Static435.aClass3_Sub7_Sub2_3.anInt3235 = local113 + local109 * local482;
					if (local608 < 0) {
						local608 = 0;
					} else if (local608 > 255) {
						local608 = 255;
					}
					Static435.aClass3_Sub7_Sub2_3.method2628(local569);
					Static435.aClass3_Sub7_Sub2_3.method2628(local587);
					Static435.aClass3_Sub7_Sub2_3.method2628(local608);
					Static435.aClass3_Sub7_Sub2_3.method2628(255 - (this.aByteArray92[local433] & 0xFF));
					local482 = this.aShortArray150[local433];
					local496 = local371[local482];
					if (local496 == 0) {
						local527 = ((float) local375[local482] * local407 + local395 * (float) local367[local482] + local401 * (float) local363[local482]) * 0.0026041667F;
					} else {
						local527 = (local407 * (float) local375[local482] + local401 * (float) local363[local482] + (float) local367[local482] * local395) / (float) (local496 * 256);
					}
					local564 = (local527 < 0.0F ? local431 : local421) * local527 + local411;
					local569 = (int) (local564 * local491);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					local587 = (int) (local466 * local564);
					local608 = (int) (local564 * local477);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					Static435.aClass3_Sub7_Sub2_3.anInt3235 = local113 + local482 * local109;
					if (local608 < 0) {
						local608 = 0;
					} else if (local608 > 255) {
						local608 = 255;
					}
					Static435.aClass3_Sub7_Sub2_3.method2628(local569);
					Static435.aClass3_Sub7_Sub2_3.method2628(local587);
					Static435.aClass3_Sub7_Sub2_3.method2628(local608);
					Static435.aClass3_Sub7_Sub2_3.method2628(255 - (this.aByteArray92[local433] & 0xFF));
					local482 = this.aShortArray146[local433];
					local496 = local371[local482];
					if (local496 == 0) {
						local527 = ((float) local375[local482] * local407 + (float) local367[local482] * local395 + (float) local363[local482] * local401) * 0.0026041667F;
					} else {
						local527 = (local407 * (float) local375[local482] + (float) local363[local482] * local401 + (float) local367[local482] * local395) / (float) (local496 * 256);
					}
					local564 = local411 + local527 * (local527 < 0.0F ? local431 : local421);
					local569 = (int) (local564 * local491);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					local587 = (int) (local564 * local466);
					if (local587 < 0) {
						local587 = 0;
					} else if (local587 > 255) {
						local587 = 255;
					}
					local608 = (int) (local564 * local477);
					if (local608 < 0) {
						local608 = 0;
					} else if (local608 > 255) {
						local608 = 255;
					}
					Static435.aClass3_Sub7_Sub2_3.anInt3235 = local113 + local482 * local109;
					Static435.aClass3_Sub7_Sub2_3.method2628(local569);
					Static435.aClass3_Sub7_Sub2_3.method2628(local587);
					Static435.aClass3_Sub7_Sub2_3.method2628(local608);
					Static435.aClass3_Sub7_Sub2_3.method2628(255 - (this.aByteArray92[local433] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt7328; local191++) {
					local200 = this.method5714(this.aByteArray92[local191], this.aShortArray152[local191], this.aShort99, this.aShortArray147[local191]);
					Static435.aClass3_Sub7_Sub2_3.anInt3235 = local109 * this.aShortArray153[local191] + local113;
					Static435.aClass3_Sub7_Sub2_3.method2636(local200);
					Static435.aClass3_Sub7_Sub2_3.anInt3235 = this.aShortArray150[local191] * local109 + local113;
					Static435.aClass3_Sub7_Sub2_3.method2636(local200);
					Static435.aClass3_Sub7_Sub2_3.anInt3235 = local113 + local109 * this.aShortArray146[local191];
					Static435.aClass3_Sub7_Sub2_3.method2636(local200);
				}
			}
		}
		if (local27) {
			if (this.aClass18_1 == null) {
				local367 = this.aShortArray145;
				local371 = this.aByteArray91;
				local375 = this.aShortArray151;
				local363 = this.aShortArray154;
			} else {
				local371 = this.aClass18_1.aByteArray11;
				local375 = this.aClass18_1.aShortArray17;
				local367 = this.aClass18_1.aShortArray18;
				local363 = this.aClass18_1.aShortArray16;
			}
			@Pc(1116) float local1116 = 3.0F / (float) this.aShort98;
			Static435.aClass3_Sub7_Sub2_3.anInt3235 = local115;
			local527 = 3.0F / (float) (this.aShort98 / 2 + this.aShort98);
			if (this.aClass172_Sub2_41.aBoolean621) {
				for (local228 = 0; local228 < this.anInt7289; local228++) {
					local237 = local371[local228] & 0xFF;
					if (local237 == 0) {
						Static435.aClass3_Sub7_Sub2_3.method2645(local527 * (float) local367[local228]);
						Static435.aClass3_Sub7_Sub2_3.method2645((float) local363[local228] * local527);
						Static435.aClass3_Sub7_Sub2_3.method2645(local527 * (float) local375[local228]);
					} else {
						local466 = local1116 / (float) local237;
						Static435.aClass3_Sub7_Sub2_3.method2645((float) local367[local228] * local466);
						Static435.aClass3_Sub7_Sub2_3.method2645((float) local363[local228] * local466);
						Static435.aClass3_Sub7_Sub2_3.method2645((float) local375[local228] * local466);
					}
					Static435.aClass3_Sub7_Sub2_3.anInt3235 += local109 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt7289; local228++) {
					local237 = local371[local228] & 0xFF;
					if (local237 == 0) {
						Static435.aClass3_Sub7_Sub2_3.method2643(local527 * (float) local367[local228]);
						Static435.aClass3_Sub7_Sub2_3.method2643((float) local363[local228] * local527);
						Static435.aClass3_Sub7_Sub2_3.method2643(local527 * (float) local375[local228]);
					} else {
						local466 = local1116 / (float) local237;
						Static435.aClass3_Sub7_Sub2_3.method2643((float) local367[local228] * local466);
						Static435.aClass3_Sub7_Sub2_3.method2643(local466 * (float) local363[local228]);
						Static435.aClass3_Sub7_Sub2_3.method2643((float) local375[local228] * local466);
					}
					Static435.aClass3_Sub7_Sub2_3.anInt3235 += local109 - 12;
				}
			}
		}
		if (local49) {
			Static435.aClass3_Sub7_Sub2_3.anInt3235 = local117;
			if (this.aClass172_Sub2_41.aBoolean621) {
				for (local191 = 0; local191 < this.anInt7289; local191++) {
					Static435.aClass3_Sub7_Sub2_3.method2645(this.aFloatArray32[local191]);
					Static435.aClass3_Sub7_Sub2_3.method2645(this.aFloatArray33[local191]);
					Static435.aClass3_Sub7_Sub2_3.anInt3235 += local109 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt7289; local191++) {
					Static435.aClass3_Sub7_Sub2_3.method2643(this.aFloatArray32[local191]);
					Static435.aClass3_Sub7_Sub2_3.method2643(this.aFloatArray33[local191]);
					Static435.aClass3_Sub7_Sub2_3.anInt3235 += local109 - 8;
				}
			}
		}
		Static435.aClass3_Sub7_Sub2_3.anInt3235 = this.anInt7289 * local109;
		@Pc(1418) Interface6 local1418;
		if (arg0) {
			if (this.anInterface6_7 == null) {
				this.anInterface6_7 = this.aClass172_Sub2_41.method5586(true, Static435.aClass3_Sub7_Sub2_3.anInt3235, Static435.aClass3_Sub7_Sub2_3.aByteArray46, local109);
			} else {
				this.anInterface6_7.method4768(Static435.aClass3_Sub7_Sub2_3.aByteArray46, Static435.aClass3_Sub7_Sub2_3.anInt3235, local109);
			}
			local1418 = this.anInterface6_7;
			this.aByte103 = 0;
		} else {
			local1418 = this.aClass172_Sub2_41.method5586(false, Static435.aClass3_Sub7_Sub2_3.anInt3235, Static435.aClass3_Sub7_Sub2_3.aByteArray46, local109);
			this.aBoolean632 = true;
		}
		if (local38) {
			this.aClass127_14.anInterface6_3 = local1418;
			this.aClass127_14.aByte75 = 0;
		}
		if (local49) {
			this.aClass127_16.aByte75 = local117;
			this.aClass127_16.anInterface6_3 = local1418;
		}
		if (local16) {
			this.aClass127_13.anInterface6_3 = local1418;
			this.aClass127_13.aByte75 = local113;
		}
		if (local27) {
			this.aClass127_15.aByte75 = local115;
			this.aClass127_15.anInterface6_3 = local1418;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	private void method5710() {
		if (!this.aBoolean632) {
			return;
		}
		this.aBoolean632 = false;
		if (this.aClass269Array4 == null && this.aClass165Array4 == null && this.aClass67Array1 == null) {
			if (this.anIntArray516 != null && !Static348.method4623(this.anInt7299, this.anInt7314)) {
				if (this.aClass127_14 != null && this.aClass127_14.anInterface6_3 == null) {
					this.aBoolean632 = true;
				} else {
					if (!this.aBoolean631) {
						this.method5703();
					}
					this.anIntArray516 = null;
				}
			}
			if (this.anIntArray515 != null && !Static178.method2831(this.anInt7299, this.anInt7314)) {
				if (this.aClass127_14 != null && this.aClass127_14.anInterface6_3 == null) {
					this.aBoolean632 = true;
				} else {
					if (!this.aBoolean631) {
						this.method5703();
					}
					this.anIntArray515 = null;
				}
			}
			if (this.anIntArray517 != null && !Static152.method2473(this.anInt7299, this.anInt7314)) {
				if (this.aClass127_14 != null && this.aClass127_14.anInterface6_3 == null) {
					this.aBoolean632 = true;
				} else {
					if (!this.aBoolean631) {
						this.method5703();
					}
					this.anIntArray517 = null;
				}
			}
		}
		if (this.aShortArray149 != null && this.anIntArray516 == null && this.anIntArray515 == null && this.anIntArray517 == null) {
			this.aShortArray149 = null;
			this.anIntArray518 = null;
		}
		if (this.aByteArray91 != null && !Static420.method5371(this.anInt7299, this.anInt7314)) {
			if (this.aClass127_15 == null) {
				if (this.aClass127_13 != null && this.aClass127_13.anInterface6_3 == null) {
					this.aBoolean632 = true;
				} else {
					this.aShortArray145 = this.aShortArray154 = this.aShortArray151 = null;
					this.aByteArray91 = null;
				}
			} else if (this.aClass127_15.anInterface6_3 == null) {
				this.aBoolean632 = true;
			} else {
				this.aByteArray91 = null;
				this.aShortArray145 = this.aShortArray154 = this.aShortArray151 = null;
			}
		}
		if (this.aShortArray152 != null && !Static378.method4939(this.anInt7299, this.anInt7314)) {
			if (this.aClass127_13 != null && this.aClass127_13.anInterface6_3 == null) {
				this.aBoolean632 = true;
			} else {
				this.aShortArray152 = null;
			}
		}
		if (this.aByteArray92 != null && !Static271.method3882(this.anInt7299, this.anInt7314)) {
			if (this.aClass127_13 != null && this.aClass127_13.anInterface6_3 == null) {
				this.aBoolean632 = true;
			} else {
				this.aByteArray92 = null;
			}
		}
		if (this.aFloatArray32 != null && !Static319.method1503(this.anInt7299, this.anInt7314)) {
			if (this.aClass127_16 != null && this.aClass127_16.anInterface6_3 == null) {
				this.aBoolean632 = true;
			} else {
				this.aFloatArray32 = this.aFloatArray33 = null;
			}
		}
		if (this.aShortArray147 != null && !Static417.method5343(this.anInt7314, this.anInt7299)) {
			if (this.aClass127_13 != null && this.aClass127_13.anInterface6_3 == null) {
				this.aBoolean632 = true;
			} else {
				this.aShortArray147 = null;
			}
		}
		if (this.aShortArray153 != null && !Static110.method1879(this.anInt7314, this.anInt7299)) {
			if ((this.aClass239_1 == null || this.aClass239_1.anInterface10_3 != null) && (this.aClass127_13 == null || this.aClass127_13.anInterface6_3 != null)) {
				this.aShortArray153 = this.aShortArray150 = this.aShortArray146 = null;
			} else {
				this.aBoolean632 = true;
			}
		}
		if (this.anIntArrayArray57 != null && !Static430.method2673(this.anInt7314, this.anInt7299)) {
			this.aShortArray148 = null;
			this.anIntArrayArray57 = null;
		}
		if (this.anIntArrayArray56 != null && !Static291.method4106(this.anInt7299, this.anInt7314)) {
			this.anIntArrayArray56 = null;
			this.aShortArray155 = null;
		}
		if (this.anIntArrayArray55 != null && !Static182.method2886(this.anInt7299, this.anInt7314)) {
			this.anIntArrayArray55 = null;
		}
		if (this.anIntArray514 != null && (this.anInt7314 & 0x800) == 0 && (this.anInt7314 & 0x40000) == 0) {
			this.anIntArray514 = null;
		}
	}

	@OriginalMember(owner = "client!vq", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class3_Sub4_Sub4 ua(@OriginalArg(0) Class3_Sub4_Sub4 arg0) {
		if (this.anInt7289 == 0) {
			return null;
		}
		if (!this.aBoolean631) {
			this.method5703();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass172_Sub2_41.anInt7183 > 0) {
			local43 = this.aShort95 - (this.aClass172_Sub2_41.anInt7183 * this.aShort100 >> 8) >> this.aClass172_Sub2_41.anInt7162;
			local60 = this.aShort96 - (this.aShort94 * this.aClass172_Sub2_41.anInt7183 >> 8) >> this.aClass172_Sub2_41.anInt7162;
		} else {
			local43 = this.aShort95 - (this.aShort94 * this.aClass172_Sub2_41.anInt7183 >> 8) >> this.aClass172_Sub2_41.anInt7162;
			local60 = this.aShort96 - (this.aShort100 * this.aClass172_Sub2_41.anInt7183 >> 8) >> this.aClass172_Sub2_41.anInt7162;
		}
		@Pc(119) int local119;
		@Pc(135) int local135;
		if (this.aClass172_Sub2_41.anInt7191 <= 0) {
			local119 = this.aShort97 - (this.aClass172_Sub2_41.anInt7191 * this.aShort94 >> 8) >> this.aClass172_Sub2_41.anInt7162;
			local135 = this.aShort93 - (this.aShort100 * this.aClass172_Sub2_41.anInt7191 >> 8) >> this.aClass172_Sub2_41.anInt7162;
		} else {
			local119 = this.aShort97 - (this.aShort100 * this.aClass172_Sub2_41.anInt7191 >> 8) >> this.aClass172_Sub2_41.anInt7162;
			local135 = this.aShort93 - (this.aClass172_Sub2_41.anInt7191 * this.aShort94 >> 8) >> this.aClass172_Sub2_41.anInt7162;
		}
		@Pc(178) int local178 = local60 + 1 - local43;
		@Pc(185) int local185 = local135 + 1 - local119;
		@Pc(188) Class3_Sub4_Sub4_Sub1 local188 = (Class3_Sub4_Sub4_Sub1) arg0;
		@Pc(198) Class3_Sub4_Sub4_Sub1 local198;
		if (local188 != null && local188.method1168(local178, local185)) {
			local198 = local188;
			local188.method1170();
		} else {
			local198 = new Class3_Sub4_Sub4_Sub1(this.aClass172_Sub2_41, local178, local185);
		}
		local198.method1167(local43, local119, local60, local135);
		this.method5715(local198);
		return local198;
	}

	@OriginalMember(owner = "client!vq", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub17.anIntArray289[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub17.anIntArray290[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7294; local15++) {
			local33 = this.anIntArray516[local15] * local13 + this.anIntArray517[local15] * local9 >> 15;
			this.anIntArray517[local15] = this.anIntArray517[local15] * local13 - local9 * this.anIntArray516[local15] >> 15;
			this.anIntArray516[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7289; local33++) {
			@Pc(83) int local83 = this.aShortArray151[local33] * local9 + this.aShortArray145[local33] * local13 >> 15;
			this.aShortArray151[local33] = (short) (local13 * this.aShortArray151[local33] - local9 * this.aShortArray145[local33] >> 15);
			this.aShortArray145[local33] = (short) local83;
		}
		if (this.aClass127_15 == null && this.aClass127_13 != null) {
			this.aClass127_13.anInterface6_3 = null;
		}
		if (this.aClass127_15 != null) {
			this.aClass127_15.anInterface6_3 = null;
		}
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!vq", name = "va", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static298.anInt5740 = 0;
			Static281.anInt7445 = 0;
			local31 = 0;
			Static378.anInt6354 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray56.length) {
					local55 = this.anIntArrayArray56[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray155 == null || (arg6 & this.aShortArray155[local63]) != 0) {
							Static281.anInt7445 += this.anIntArray516[local63];
							Static298.anInt5740 += this.anIntArray515[local63];
							Static378.anInt6354 += this.anIntArray517[local63];
							local31++;
						}
					}
				}
			}
			if (local31 <= 0) {
				Static281.anInt7445 = arg2;
				Static378.anInt6354 = arg4;
				Static298.anInt5740 = arg3;
			} else {
				Static112.aBoolean221 = true;
				Static298.anInt5740 = arg3 + Static298.anInt5740 / local31;
				Static378.anInt6354 = arg4 + Static378.anInt6354 / local31;
				Static281.anInt7445 = arg2 + Static281.anInt7445 / local31;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg4 * arg7[2] + arg7[0] * arg2 + arg3 * arg7[1] + 16384 >> 15;
				local35 = arg7[3] * arg2 + arg7[4] * arg3 + arg4 * arg7[5] + 16384 >> 15;
				local41 = arg7[8] * arg4 + arg7[7] * arg3 + arg2 * arg7[6] + 16384 >> 15;
				arg4 = local41;
				arg3 = local35;
				arg2 = local31;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray56.length) {
					local255 = this.anIntArrayArray56[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray155 == null || (arg6 & this.aShortArray155[local57]) != 0) {
							this.anIntArray516[local57] += arg2;
							this.anIntArray515[local57] += arg3;
							this.anIntArray517[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(391) int local391;
		@Pc(409) int local409;
		@Pc(641) int local641;
		@Pc(650) int local650;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(685) int local685;
		@Pc(1024) int local1024;
		@Pc(1032) int local1032;
		@Pc(1187) int local1187;
		@Pc(1212) int local1212;
		@Pc(1216) int local1216;
		@Pc(1224) int local1224;
		@Pc(1229) int local1229;
		@Pc(1233) int local1233;
		@Pc(1237) int local1237;
		@Pc(1239) int local1239;
		@Pc(1372) int[] local1372;
		@Pc(1374) int local1374;
		@Pc(1378) int local1378;
		@Pc(1382) int local1382;
		@Pc(1384) int local1384;
		@Pc(1510) int local1510;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray56.length > local35) {
						local255 = this.anIntArrayArray56[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray155 == null || (arg6 & this.aShortArray155[local57]) != 0) {
								this.anIntArray516[local57] -= Static281.anInt7445;
								this.anIntArray515[local57] -= Static298.anInt5740;
								this.anIntArray517[local57] -= Static378.anInt6354;
								if (arg4 != 0) {
									local63 = Class3_Sub2_Sub17.anIntArray289[arg4];
									local391 = Class3_Sub2_Sub17.anIntArray290[arg4];
									local409 = local391 * this.anIntArray516[local57] + local63 * this.anIntArray515[local57] + 32767 >> 15;
									this.anIntArray515[local57] = local391 * this.anIntArray515[local57] + 32767 - this.anIntArray516[local57] * local63 >> 15;
									this.anIntArray516[local57] = local409;
								}
								if (arg2 != 0) {
									local63 = Class3_Sub2_Sub17.anIntArray289[arg2];
									local391 = Class3_Sub2_Sub17.anIntArray290[arg2];
									local409 = this.anIntArray515[local57] * local391 + 32767 - this.anIntArray517[local57] * local63 >> 15;
									this.anIntArray517[local57] = local391 * this.anIntArray517[local57] + this.anIntArray515[local57] * local63 + 32767 >> 15;
									this.anIntArray515[local57] = local409;
								}
								if (arg3 != 0) {
									local63 = Class3_Sub2_Sub17.anIntArray289[arg3];
									local391 = Class3_Sub2_Sub17.anIntArray290[arg3];
									local409 = local63 * this.anIntArray517[local57] + local391 * this.anIntArray516[local57] + 32767 >> 15;
									this.anIntArray517[local57] = this.anIntArray517[local57] * local391 + 32767 - local63 * this.anIntArray516[local57] >> 15;
									this.anIntArray516[local57] = local409;
								}
								this.anIntArray516[local57] += Static281.anInt7445;
								this.anIntArray515[local57] += Static298.anInt5740;
								this.anIntArray517[local57] += Static378.anInt6354;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray56.length > local41) {
							local55 = this.anIntArrayArray56[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray155 == null || (this.aShortArray155[local63] & arg6) != 0) {
									local391 = this.anIntArray518[local63];
									local409 = this.anIntArray518[local63 + 1];
									for (local641 = local391; local641 < local409; local641++) {
										local650 = this.aShortArray149[local641] - 1;
										if (local650 == -1) {
											break;
										}
										if (arg4 != 0) {
											local663 = Class3_Sub2_Sub17.anIntArray289[arg4];
											local667 = Class3_Sub2_Sub17.anIntArray290[arg4];
											local685 = this.aShortArray154[local650] * local663 + this.aShortArray145[local650] * local667 + 32767 >> 15;
											this.aShortArray154[local650] = (short) (local667 * this.aShortArray154[local650] + 32767 - this.aShortArray145[local650] * local663 >> 15);
											this.aShortArray145[local650] = (short) local685;
										}
										if (arg2 != 0) {
											local663 = Class3_Sub2_Sub17.anIntArray289[arg2];
											local667 = Class3_Sub2_Sub17.anIntArray290[arg2];
											local685 = this.aShortArray154[local650] * local667 + 32767 - local663 * this.aShortArray151[local650] >> 15;
											this.aShortArray151[local650] = (short) (local663 * this.aShortArray154[local650] + local667 * this.aShortArray151[local650] + 32767 >> 15);
											this.aShortArray154[local650] = (short) local685;
										}
										if (arg3 != 0) {
											local663 = Class3_Sub2_Sub17.anIntArray289[arg3];
											local667 = Class3_Sub2_Sub17.anIntArray290[arg3];
											local685 = local667 * this.aShortArray145[local650] + local663 * this.aShortArray151[local650] + 32767 >> 15;
											this.aShortArray151[local650] = (short) (local667 * this.aShortArray151[local650] + 32767 - local663 * this.aShortArray145[local650] >> 15);
											this.aShortArray145[local650] = (short) local685;
										}
									}
								}
							}
						}
					}
					if (this.aClass127_15 == null && this.aClass127_13 != null) {
						this.aClass127_13.anInterface6_3 = null;
					}
					if (this.aClass127_15 != null) {
						this.aClass127_15.anInterface6_3 = null;
						return;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static112.aBoolean221) {
					local391 = arg7[6] * Static378.anInt6354 + Static281.anInt7445 * arg7[0] + Static298.anInt5740 * arg7[3] + 16384 >> 15;
					local409 = arg7[7] * Static378.anInt6354 + Static298.anInt5740 * arg7[4] + Static281.anInt7445 * arg7[1] + 16384 >> 15;
					local409 += local57;
					local391 += local257;
					local641 = arg7[2] * Static281.anInt7445 + Static298.anInt5740 * arg7[5] + Static378.anInt6354 * arg7[8] + 16384 >> 15;
					Static298.anInt5740 = local409;
					local641 += local63;
					Static281.anInt7445 = local391;
					Static378.anInt6354 = local641;
					Static112.aBoolean221 = false;
				}
				@Pc(992) int[] local992 = new int[9];
				local409 = Class3_Sub2_Sub17.anIntArray290[arg2];
				local641 = Class3_Sub2_Sub17.anIntArray289[arg2];
				local650 = Class3_Sub2_Sub17.anIntArray290[arg3];
				local663 = Class3_Sub2_Sub17.anIntArray289[arg3];
				local667 = Class3_Sub2_Sub17.anIntArray290[arg4];
				local685 = Class3_Sub2_Sub17.anIntArray289[arg4];
				local1024 = local641 * local667 + 16384 >> 15;
				local1032 = local685 * local641 + 16384 >> 15;
				local992[2] = local663 * local409 + 16384 >> 15;
				local992[1] = local685 * -local650 + local663 * local1024 + 16384 >> 15;
				local992[0] = local667 * local650 + local663 * local1032 + 16384 >> 15;
				local992[8] = local650 * local409 + 16384 >> 15;
				local992[4] = local409 * local667 + 16384 >> 15;
				local992[5] = -local641;
				local992[3] = local685 * local409 + 16384 >> 15;
				local992[6] = local667 * -local663 + local650 * local1032 + 16384 >> 15;
				local992[7] = local650 * local1024 + local685 * local663 + 16384 >> 15;
				@Pc(1162) int local1162 = local992[1] * -Static298.anInt5740 + local992[0] * -Static281.anInt7445 + local992[2] * -Static378.anInt6354 + 16384 >> 15;
				local1187 = local992[4] * -Static298.anInt5740 + -Static281.anInt7445 * local992[3] + local992[5] * -Static378.anInt6354 + 16384 >> 15;
				local1212 = local992[8] * -Static378.anInt6354 + local992[7] * -Static298.anInt5740 + local992[6] * -Static281.anInt7445 + 16384 >> 15;
				local1216 = local1162 + Static281.anInt7445;
				@Pc(1220) int local1220 = Static298.anInt5740 + local1187;
				local1224 = Static378.anInt6354 + local1212;
				@Pc(1227) int[] local1227 = new int[9];
				for (local1229 = 0; local1229 < 3; local1229++) {
					for (local1233 = 0; local1233 < 3; local1233++) {
						local1237 = 0;
						for (local1239 = 0; local1239 < 3; local1239++) {
							local1237 += arg7[local1233 * 3 + local1239] * local992[local1229 * 3 + local1239];
						}
						local1227[local1229 * 3 + local1233] = local1237 + 16384 >> 15;
					}
				}
				local1233 = local992[0] * local257 + local57 * local992[1] + local992[2] * local63 + 16384 >> 15;
				local1237 = local63 * local992[5] + local992[3] * local257 + local992[4] * local57 + 16384 >> 15;
				local1233 += local1216;
				local1239 = local63 * local992[8] + local992[6] * local257 + local57 * local992[7] + 16384 >> 15;
				local1237 += local1220;
				local1239 += local1224;
				local1372 = new int[9];
				for (local1374 = 0; local1374 < 3; local1374++) {
					for (local1378 = 0; local1378 < 3; local1378++) {
						local1382 = 0;
						for (local1384 = 0; local1384 < 3; local1384++) {
							local1382 += local1227[local1384 * 3 + local1378] * arg7[local1384 + local1374 * 3];
						}
						local1372[local1374 * 3 + local1378] = local1382 + 16384 >> 15;
					}
				}
				local1378 = arg7[1] * local1237 + local1233 * arg7[0] + arg7[2] * local1239 + 16384 >> 15;
				local1382 = arg7[4] * local1237 + arg7[3] * local1233 + local1239 * arg7[5] + 16384 >> 15;
				local1382 += local35;
				local1378 += local31;
				local1384 = arg7[8] * local1239 + local1237 * arg7[7] + arg7[6] * local1233 + 16384 >> 15;
				local1384 += local41;
				for (local1510 = 0; local1510 < local8; local1510++) {
					@Pc(1516) int local1516 = arg1[local1510];
					if (local1516 < this.anIntArrayArray56.length) {
						@Pc(1526) int[] local1526 = this.anIntArrayArray56[local1516];
						for (@Pc(1528) int local1528 = 0; local1528 < local1526.length; local1528++) {
							@Pc(1534) int local1534 = local1526[local1528];
							if (this.aShortArray155 == null || (this.aShortArray155[local1534] & arg6) != 0) {
								@Pc(1578) int local1578 = local1372[2] * this.anIntArray517[local1534] + local1372[1] * this.anIntArray515[local1534] + this.anIntArray516[local1534] * local1372[0] + 16384 >> 15;
								@Pc(1610) int local1610 = this.anIntArray515[local1534] * local1372[4] + this.anIntArray516[local1534] * local1372[3] + local1372[5] * this.anIntArray517[local1534] + 16384 >> 15;
								@Pc(1614) int local1614 = local1578 + local1378;
								@Pc(1618) int local1618 = local1610 + local1382;
								@Pc(1650) int local1650 = this.anIntArray515[local1534] * local1372[7] + this.anIntArray516[local1534] * local1372[6] + this.anIntArray517[local1534] * local1372[8] + 16384 >> 15;
								this.anIntArray516[local1534] = local1614;
								@Pc(1659) int local1659 = local1650 + local1384;
								this.anIntArray515[local1534] = local1618;
								this.anIntArray517[local1534] = local1659;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2594) Class67 local2594;
			@Pc(2599) Class203 local2599;
			if (arg0 == 5) {
				if (this.anIntArrayArray57 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray57.length) {
							local255 = this.anIntArrayArray57[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local57 = local255[local257];
								if (this.aShortArray148 == null || (arg6 & this.aShortArray148[local57]) != 0) {
									local63 = (this.aByteArray92[local57] & 0xFF) + arg2 * 8;
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray92[local57] = (byte) local63;
									if (this.aClass127_13 != null) {
										this.aClass127_13.anInterface6_3 = null;
									}
								}
							}
						}
					}
					if (this.aClass67Array1 != null) {
						for (local35 = 0; local35 < this.anInt7313; local35++) {
							local2594 = this.aClass67Array1[local35];
							local2599 = this.aClass203Array1[local35];
							local2599.anInt5603 = local2599.anInt5603 & 0xFFFFFF | 255 - (this.aByteArray92[local2594.anInt2192] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2861) Class203 local2861;
				if (arg0 == 8) {
					if (this.anIntArrayArray55 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray55.length) {
								local255 = this.anIntArrayArray55[local35];
								for (local257 = 0; local257 < local255.length; local257++) {
									local2861 = this.aClass203Array1[local255[local257]];
									local2861.anInt5598 += arg2;
									local2861.anInt5596 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray55 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray55.length > local35) {
								local255 = this.anIntArrayArray55[local35];
								for (local257 = 0; local257 < local255.length; local257++) {
									local2861 = this.aClass203Array1[local255[local257]];
									local2861.anInt5601 = arg2 * local2861.anInt5601 >> 7;
									local2861.anInt5602 = local2861.anInt5602 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray55 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray55.length > local35) {
							local255 = this.anIntArrayArray55[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2861 = this.aClass203Array1[local255[local257]];
								local2861.anInt5600 = arg2 + local2861.anInt5600 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray57 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray57.length > local35) {
						local255 = this.anIntArrayArray57[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray148 == null || (arg6 & this.aShortArray148[local57]) != 0) {
								local63 = this.aShortArray152[local57] & 0xFFFF;
								local391 = local63 >> 10 & 0x3F;
								local409 = local63 >> 7 & 0x7;
								local641 = local63 & 0x7F;
								@Pc(2707) int local2707 = local391 + arg2 & 0x3F;
								local409 += arg3 / 4;
								local641 += arg4;
								if (local409 < 0) {
									local409 = 0;
								} else if (local409 > 7) {
									local409 = 7;
								}
								if (local641 < 0) {
									local641 = 0;
								} else if (local641 > 127) {
									local641 = 127;
								}
								this.aShortArray152[local57] = (short) (local641 | local2707 << 10 | local409 << 7);
								if (this.aClass127_13 != null) {
									this.aClass127_13.anInterface6_3 = null;
								}
							}
						}
					}
				}
				if (this.aClass67Array1 != null) {
					for (local35 = 0; local35 < this.anInt7313; local35++) {
						local2594 = this.aClass67Array1[local35];
						local2599 = this.aClass203Array1[local35];
						local2599.anInt5603 = Static135.anIntArray174[this.aShortArray152[local2594.anInt2192] & 0xFFFF] & 0xFFFFFF | local2599.anInt5603 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray56.length > local35) {
					local255 = this.anIntArrayArray56[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray155 == null || (arg6 & this.aShortArray155[local57]) != 0) {
							this.anIntArray516[local57] -= Static281.anInt7445;
							this.anIntArray515[local57] -= Static298.anInt5740;
							this.anIntArray517[local57] -= Static378.anInt6354;
							this.anIntArray516[local57] = this.anIntArray516[local57] * arg2 >> 7;
							this.anIntArray515[local57] = arg3 * this.anIntArray515[local57] >> 7;
							this.anIntArray517[local57] = this.anIntArray517[local57] * arg4 >> 7;
							this.anIntArray516[local57] += Static281.anInt7445;
							this.anIntArray515[local57] += Static298.anInt5740;
							this.anIntArray517[local57] += Static378.anInt6354;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local257 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static112.aBoolean221) {
				local391 = arg7[6] * Static378.anInt6354 + Static298.anInt5740 * arg7[3] + arg7[0] * Static281.anInt7445 + 16384 >> 15;
				local409 = arg7[7] * Static378.anInt6354 + arg7[4] * Static298.anInt5740 + Static281.anInt7445 * arg7[1] + 16384 >> 15;
				local409 += local57;
				local641 = Static378.anInt6354 * arg7[8] + Static298.anInt5740 * arg7[5] + Static281.anInt7445 * arg7[2] + 16384 >> 15;
				local391 += local257;
				Static298.anInt5740 = local409;
				Static281.anInt7445 = local391;
				local641 += local63;
				Static378.anInt6354 = local641;
				Static112.aBoolean221 = false;
			}
			local391 = arg2 << 15 >> 7;
			local409 = arg3 << 15 >> 7;
			local641 = arg4 << 15 >> 7;
			local650 = local391 * -Static281.anInt7445 + 16384 >> 15;
			local663 = local409 * -Static298.anInt5740 + 16384 >> 15;
			local667 = -Static378.anInt6354 * local641 + 16384 >> 15;
			local685 = local650 + Static281.anInt7445;
			local1024 = local663 + Static298.anInt5740;
			local1032 = local667 + Static378.anInt6354;
			@Pc(1881) int[] local1881 = new int[] { local391 * arg7[0] + 16384 >> 15, arg7[3] * local391 + 16384 >> 15, local391 * arg7[6] + 16384 >> 15, arg7[1] * local409 + 16384 >> 15, local409 * arg7[4] + 16384 >> 15, local409 * arg7[7] + 16384 >> 15, arg7[2] * local641 + 16384 >> 15, local641 * arg7[5] + 16384 >> 15, local641 * arg7[8] + 16384 >> 15 };
			local1187 = local391 * local257 + 16384 >> 15;
			local1212 = local57 * local409 + 16384 >> 15;
			@Pc(2009) int local2009 = local1187 + local685;
			local1216 = local63 * local641 + 16384 >> 15;
			@Pc(2021) int local2021 = local1212 + local1024;
			@Pc(2025) int local2025 = local1216 + local1032;
			@Pc(2028) int[] local2028 = new int[9];
			@Pc(2034) int local2034;
			for (local1224 = 0; local1224 < 3; local1224++) {
				for (local2034 = 0; local2034 < 3; local2034++) {
					local1229 = 0;
					for (local1233 = 0; local1233 < 3; local1233++) {
						local1229 += arg7[local1224 * 3 + local1233] * local1881[local1233 * 3 + local2034];
					}
					local2028[local1224 * 3 + local2034] = local1229 + 16384 >> 15;
				}
			}
			local2034 = local2025 * arg7[2] + arg7[0] * local2009 + arg7[1] * local2021 + 16384 >> 15;
			local1229 = local2025 * arg7[5] + arg7[3] * local2009 + arg7[4] * local2021 + 16384 >> 15;
			local2034 += local31;
			local1229 += local35;
			local1233 = arg7[8] * local2025 + local2021 * arg7[7] + arg7[6] * local2009 + 16384 >> 15;
			local1233 += local41;
			for (local1237 = 0; local1237 < local8; local1237++) {
				local1239 = arg1[local1237];
				if (this.anIntArrayArray56.length > local1239) {
					local1372 = this.anIntArrayArray56[local1239];
					for (local1374 = 0; local1374 < local1372.length; local1374++) {
						local1378 = local1372[local1374];
						if (this.aShortArray155 == null || (arg6 & this.aShortArray155[local1378]) != 0) {
							local1382 = this.anIntArray516[local1378] * local2028[0] + local2028[1] * this.anIntArray515[local1378] + local2028[2] * this.anIntArray517[local1378] + 16384 >> 15;
							local1384 = local2028[5] * this.anIntArray517[local1378] + local2028[4] * this.anIntArray515[local1378] + this.anIntArray516[local1378] * local2028[3] + 16384 >> 15;
							@Pc(2274) int local2274 = local1384 + local1229;
							local1510 = this.anIntArray515[local1378] * local2028[7] + local2028[6] * this.anIntArray516[local1378] + local2028[8] * this.anIntArray517[local1378] + 16384 >> 15;
							@Pc(2310) int local2310 = local1382 + local2034;
							@Pc(2314) int local2314 = local1510 + local1233;
							this.anIntArray516[local1378] = local2310;
							this.anIntArray515[local1378] = local2274;
							this.anIntArray517[local1378] = local2314;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub2_Sub17.anIntArray289[arg0];
		@Pc(13) int local13 = Class3_Sub2_Sub17.anIntArray290[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7294; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray515[local15] - local9 * this.anIntArray517[local15] >> 15;
			this.anIntArray517[local15] = this.anIntArray515[local15] * local9 + this.anIntArray517[local15] * local13 >> 15;
			this.anIntArray515[local15] = local34;
		}
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	private void method5711() {
		if (this.aClass67Array1 == null) {
			return;
		}
		@Pc(8) Class107_Sub1 local8 = this.aClass172_Sub2_41.aClass107_Sub1_2;
		@Pc(12) float local12 = this.aClass172_Sub2_41.w();
		@Pc(16) float local16 = this.aClass172_Sub2_41.la();
		this.aClass172_Sub2_41.method5555();
		this.aClass172_Sub2_41.method5527(false);
		this.aClass172_Sub2_41.method5581(false);
		this.aClass172_Sub2_41.method5622(null, this.aClass172_Sub2_41.aClass127_11, this.aClass172_Sub2_41.aClass127_12, null);
		for (@Pc(49) int local49 = 0; local49 < this.anInt7313; local49++) {
			@Pc(56) Class67 local56 = this.aClass67Array1[local49];
			@Pc(61) Class203 local61 = this.aClass203Array1[local49];
			if (!local56.aBoolean176 || !this.aClass172_Sub2_41.method5539()) {
				@Pc(89) float local89 = (float) (this.anIntArray516[local56.anInt2194] + this.anIntArray516[local56.anInt2193] + this.anIntArray516[local56.anInt2191]) * 0.3333333F;
				@Pc(112) float local112 = (float) (this.anIntArray515[local56.anInt2193] + this.anIntArray515[local56.anInt2191] + this.anIntArray515[local56.anInt2194]) * 0.3333333F;
				@Pc(133) float local133 = (float) (this.anIntArray517[local56.anInt2194] + this.anIntArray517[local56.anInt2193] + this.anIntArray517[local56.anInt2191]) * 0.3333333F;
				@Pc(147) float local147 = local89 * Static125.aFloat19 + local112 * Static401.aFloat72 + local133 * Static133.aFloat20 + Static319.aFloat13;
				@Pc(161) float local161 = local112 * Static83.aFloat14 + Static152.aFloat25 * local89 + local133 * Static193.aFloat30 + Static12.aFloat1;
				@Pc(175) float local175 = Static176.aFloat26 + local133 * Static305.aFloat60 + local112 * Static150.aFloat31 + Static422.aFloat74 * local89;
				local8.method3752(local56.aShort44 * local61.anInt5601 >> 7, local147 + (float) local61.anInt5598, local61.anInt5602 * local56.aShort45 >> 7, -local175, (float) local61.anInt5596 - local161, local61.anInt5600);
				this.aClass172_Sub2_41.method5595(local8);
				this.aClass172_Sub2_41.o(local16, local12 - (float) local56.anInt2190 * 1.5F);
				@Pc(226) int local226 = local61.anInt5603;
				OpenGL.glColor4ub((byte) (local226 >> 16), (byte) (local226 >> 8), (byte) local226, (byte) (local226 >> 24));
				this.aClass172_Sub2_41.method5610(local56.aShort46);
				this.aClass172_Sub2_41.method5574(local56.aByte38);
				this.aClass172_Sub2_41.method5629(local56.aByte39);
				this.aClass172_Sub2_41.method5616(4);
			}
		}
		this.aClass172_Sub2_41.o(local16, local12);
		this.aClass172_Sub2_41.method5527(true);
		this.aClass172_Sub2_41.method5587();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "()[Lclient!wv;")
	@Override
	public Class269[] method5680() {
		return this.aClass269Array4;
	}

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt7314;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ia;Lclient!lc;I)V")
	@Override
	public void method5695(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class6_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7289 == 0) {
			return;
		}
		@Pc(16) Class107_Sub1 local16 = this.aClass172_Sub2_41.aClass107_Sub1_4;
		@Pc(19) Class107_Sub1 local19 = (Class107_Sub1) arg0;
		if (!this.aBoolean631) {
			this.method5703();
		}
		this.method5716(local19);
		Static150.aFloat31 = local16.aFloat39 * local19.aFloat46 + local16.aFloat45 * local19.aFloat41 + local19.aFloat38 * local16.aFloat46;
		Static176.aFloat26 = local19.aFloat35 * local16.aFloat39 + local19.aFloat44 * local16.aFloat46 + local16.aFloat45 * local19.aFloat42 + local16.aFloat35;
		@Pc(76) float local76 = Static150.aFloat31 * (float) this.aShort94 + Static176.aFloat26;
		@Pc(84) float local84 = Static176.aFloat26 + (float) this.aShort100 * Static150.aFloat31;
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (local84 < local76) {
			local94 = (float) this.aShort101 + local76;
			local100 = local84 - (float) this.aShort101;
		} else {
			local94 = (float) this.aShort101 + local84;
			local100 = local76 - (float) this.aShort101;
		}
		if (local100 >= this.aClass172_Sub2_41.aFloat81 || (float) this.aClass172_Sub2_41.anInt7196 >= local94) {
			return;
		}
		Static401.aFloat72 = local16.aFloat36 * local19.aFloat46 + local19.aFloat38 * local16.aFloat41 + local19.aFloat41 * local16.aFloat43;
		Static319.aFloat13 = local16.aFloat41 * local19.aFloat44 + local19.aFloat42 * local16.aFloat43 + local16.aFloat36 * local19.aFloat35 + local16.aFloat42;
		@Pc(176) float local176 = Static319.aFloat13 + Static401.aFloat72 * (float) this.aShort94;
		@Pc(184) float local184 = Static319.aFloat13 + (float) this.aShort100 * Static401.aFloat72;
		@Pc(200) float local200;
		@Pc(211) float local211;
		if (local176 > local184) {
			local200 = ((float) -this.aShort101 + local184) * (float) this.aClass172_Sub2_41.anInt7185;
			local211 = (float) this.aClass172_Sub2_41.anInt7185 * (local176 + (float) this.aShort101);
		} else {
			local211 = (float) this.aClass172_Sub2_41.anInt7185 * ((float) this.aShort101 + local184);
			local200 = (float) this.aClass172_Sub2_41.anInt7185 * (local176 - (float) this.aShort101);
		}
		if (this.aClass172_Sub2_41.aFloat93 <= local200 / local94 || this.aClass172_Sub2_41.aFloat82 >= local211 / local94) {
			return;
		}
		Static83.aFloat14 = local16.aFloat40 * local19.aFloat46 + local19.aFloat38 * local16.aFloat38 + local19.aFloat41 * local16.aFloat37;
		Static12.aFloat1 = local16.aFloat44 + local16.aFloat40 * local19.aFloat35 + local19.aFloat44 * local16.aFloat38 + local16.aFloat37 * local19.aFloat42;
		@Pc(300) float local300 = Static12.aFloat1 + (float) this.aShort94 * Static83.aFloat14;
		@Pc(308) float local308 = Static12.aFloat1 + Static83.aFloat14 * (float) this.aShort100;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local308 < local300) {
			local324 = ((float) -this.aShort101 + local308) * (float) this.aClass172_Sub2_41.anInt7200;
			local335 = (float) this.aClass172_Sub2_41.anInt7200 * (local300 + (float) this.aShort101);
		} else {
			local335 = ((float) this.aShort101 + local308) * (float) this.aClass172_Sub2_41.anInt7200;
			local324 = (float) this.aClass172_Sub2_41.anInt7200 * (local300 - (float) this.aShort101);
		}
		if (this.aClass172_Sub2_41.aFloat88 <= local324 / local94 || this.aClass172_Sub2_41.aFloat80 >= local335 / local94) {
			return;
		}
		if (arg1 != null || this.aClass67Array1 != null) {
			Static152.aFloat25 = local16.aFloat40 * local19.aFloat45 + local16.aFloat38 * local19.aFloat37 + local16.aFloat37 * local19.aFloat43;
			Static305.aFloat60 = local16.aFloat46 * local19.aFloat40 + local16.aFloat45 * local19.aFloat36 + local16.aFloat39 * local19.aFloat39;
			Static422.aFloat74 = local16.aFloat39 * local19.aFloat45 + local19.aFloat43 * local16.aFloat45 + local16.aFloat46 * local19.aFloat37;
			Static133.aFloat20 = local16.aFloat36 * local19.aFloat39 + local16.aFloat41 * local19.aFloat40 + local19.aFloat36 * local16.aFloat43;
			Static125.aFloat19 = local16.aFloat41 * local19.aFloat37 + local16.aFloat43 * local19.aFloat43 + local16.aFloat36 * local19.aFloat45;
			Static193.aFloat30 = local19.aFloat40 * local16.aFloat38 + local16.aFloat37 * local19.aFloat36 + local19.aFloat39 * local16.aFloat40;
		}
		if (arg1 != null) {
			@Pc(494) boolean local494 = false;
			@Pc(496) boolean local496 = true;
			@Pc(504) int local504 = this.aShort96 + this.aShort95 >> 1;
			@Pc(512) int local512 = this.aShort93 + this.aShort97 >> 1;
			@Pc(531) int local531 = (int) (Static133.aFloat20 * (float) local512 + (float) local504 * Static125.aFloat19 + Static319.aFloat13 + (float) this.aShort94 * Static401.aFloat72);
			@Pc(550) int local550 = (int) ((float) local512 * Static193.aFloat30 + (float) local504 * Static152.aFloat25 + Static12.aFloat1 + (float) this.aShort94 * Static83.aFloat14);
			@Pc(569) int local569 = (int) (Static305.aFloat60 * (float) local512 + (float) local504 * Static422.aFloat74 + Static176.aFloat26 + Static150.aFloat31 * (float) this.aShort94);
			if (local569 >= this.aClass172_Sub2_41.anInt7196) {
				arg1.anInt4183 = this.aClass172_Sub2_41.anInt7170 + local550 * this.aClass172_Sub2_41.anInt7200 / local569;
				arg1.anInt4182 = this.aClass172_Sub2_41.anInt7197 + local531 * this.aClass172_Sub2_41.anInt7185 / local569;
			} else {
				local494 = true;
			}
			@Pc(624) int local624 = (int) (Static133.aFloat20 * (float) local512 + (float) this.aShort100 * Static401.aFloat72 + (float) local504 * Static125.aFloat19 + Static319.aFloat13);
			@Pc(643) int local643 = (int) (Static83.aFloat14 * (float) this.aShort100 + (float) local504 * Static152.aFloat25 + Static12.aFloat1 + Static193.aFloat30 * (float) local512);
			@Pc(662) int local662 = (int) ((float) local512 * Static305.aFloat60 + (float) this.aShort100 * Static150.aFloat31 + Static176.aFloat26 + Static422.aFloat74 * (float) local504);
			if (this.aClass172_Sub2_41.anInt7196 <= local662) {
				arg1.anInt4180 = this.aClass172_Sub2_41.anInt7197 + local624 * this.aClass172_Sub2_41.anInt7185 / local662;
				arg1.anInt4181 = local643 * this.aClass172_Sub2_41.anInt7200 / local662 + this.aClass172_Sub2_41.anInt7170;
			} else {
				local494 = true;
			}
			if (local494) {
				if (local569 < this.aClass172_Sub2_41.anInt7196 && local662 < this.aClass172_Sub2_41.anInt7196) {
					local496 = false;
				} else {
					@Pc(740) int local740;
					@Pc(751) int local751;
					@Pc(778) int local778;
					if (local569 < this.aClass172_Sub2_41.anInt7196) {
						local740 = (local662 - this.aClass172_Sub2_41.anInt7196 << 16) / (local662 - local569);
						local751 = local624 + ((local624 - local531) * local740 >> 16);
						arg1.anInt4182 = this.aClass172_Sub2_41.anInt7197 + this.aClass172_Sub2_41.anInt7185 * local751 / this.aClass172_Sub2_41.anInt7196;
						local778 = ((local643 - local550) * local740 >> 16) + local643;
						arg1.anInt4183 = local778 * this.aClass172_Sub2_41.anInt7200 / this.aClass172_Sub2_41.anInt7196 + this.aClass172_Sub2_41.anInt7170;
					} else if (local662 < this.aClass172_Sub2_41.anInt7196) {
						local740 = (local569 - this.aClass172_Sub2_41.anInt7196 << 16) / (local569 - local662);
						local751 = ((local531 - local624) * local740 >> 16) + local531;
						arg1.anInt4182 = this.aClass172_Sub2_41.anInt7197 + local751 * this.aClass172_Sub2_41.anInt7185 / this.aClass172_Sub2_41.anInt7196;
						local778 = local550 + ((local550 - local643) * local740 >> 16);
						arg1.anInt4183 = this.aClass172_Sub2_41.anInt7170 + local778 * this.aClass172_Sub2_41.anInt7200 / this.aClass172_Sub2_41.anInt7196;
					}
				}
			}
			if (local496) {
				arg1.aBoolean358 = true;
				if (local569 <= local662) {
					arg1.anInt4184 = this.aClass172_Sub2_41.anInt7185 * (local624 + this.aShort101) / local662 + this.aClass172_Sub2_41.anInt7197 - arg1.anInt4180;
				} else {
					arg1.anInt4184 = (local531 + this.aShort101) * this.aClass172_Sub2_41.anInt7185 / local569 + this.aClass172_Sub2_41.anInt7197 - arg1.anInt4182;
				}
			}
		}
		this.aClass172_Sub2_41.method5627();
		this.aClass172_Sub2_41.method5602(local19);
		this.method5706();
		this.aClass172_Sub2_41.method5587();
		this.method5711();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ia;Lclient!lc;II)V")
	@Override
	public void method5683(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class6_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7289 == 0) {
			return;
		}
		@Pc(16) Class107_Sub1 local16 = this.aClass172_Sub2_41.aClass107_Sub1_4;
		if (!this.aBoolean631) {
			this.method5703();
		}
		@Pc(25) Class107_Sub1 local25 = (Class107_Sub1) arg0;
		Static176.aFloat26 = local16.aFloat46 * local25.aFloat44 + local25.aFloat42 * local16.aFloat45 + local16.aFloat39 * local25.aFloat35 + local16.aFloat35;
		Static150.aFloat31 = local16.aFloat45 * local25.aFloat41 + local25.aFloat38 * local16.aFloat46 + local16.aFloat39 * local25.aFloat46;
		@Pc(72) float local72 = Static150.aFloat31 * (float) this.aShort94 + Static176.aFloat26;
		@Pc(80) float local80 = Static150.aFloat31 * (float) this.aShort100 + Static176.aFloat26;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = local72 + (float) this.aShort101;
			local97 = (float) -this.aShort101 + local80;
		} else {
			local90 = local80 + (float) this.aShort101;
			local97 = (float) -this.aShort101 + local72;
		}
		if (this.aClass172_Sub2_41.aFloat94 <= local97 || (float) this.aClass172_Sub2_41.anInt7196 >= local90) {
			return;
		}
		Static401.aFloat72 = local25.aFloat38 * local16.aFloat41 + local16.aFloat43 * local25.aFloat41 + local16.aFloat36 * local25.aFloat46;
		Static319.aFloat13 = local16.aFloat42 + local25.aFloat35 * local16.aFloat36 + local25.aFloat42 * local16.aFloat43 + local16.aFloat41 * local25.aFloat44;
		@Pc(174) float local174 = (float) this.aShort94 * Static401.aFloat72 + Static319.aFloat13;
		@Pc(182) float local182 = (float) this.aShort100 * Static401.aFloat72 + Static319.aFloat13;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local182 < local174) {
			local197 = ((float) -this.aShort101 + local182) * (float) this.aClass172_Sub2_41.anInt7185;
			local208 = (float) this.aClass172_Sub2_41.anInt7185 * (local174 + (float) this.aShort101);
		} else {
			local197 = (local174 - (float) this.aShort101) * (float) this.aClass172_Sub2_41.anInt7185;
			local208 = (float) this.aClass172_Sub2_41.anInt7185 * ((float) this.aShort101 + local182);
		}
		if (local197 / (float) arg2 >= this.aClass172_Sub2_41.aFloat93 || this.aClass172_Sub2_41.aFloat82 >= local208 / (float) arg2) {
			return;
		}
		Static12.aFloat1 = local25.aFloat42 * local16.aFloat37 + local16.aFloat38 * local25.aFloat44 + local16.aFloat40 * local25.aFloat35 + local16.aFloat44;
		Static83.aFloat14 = local25.aFloat41 * local16.aFloat37 + local25.aFloat38 * local16.aFloat38 + local25.aFloat46 * local16.aFloat40;
		@Pc(300) float local300 = (float) this.aShort94 * Static83.aFloat14 + Static12.aFloat1;
		@Pc(308) float local308 = Static12.aFloat1 + Static83.aFloat14 * (float) this.aShort100;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local300 > local308) {
			local335 = (float) this.aClass172_Sub2_41.anInt7200 * ((float) this.aShort101 + local300);
			local324 = ((float) -this.aShort101 + local308) * (float) this.aClass172_Sub2_41.anInt7200;
		} else {
			local324 = (float) this.aClass172_Sub2_41.anInt7200 * ((float) -this.aShort101 + local300);
			local335 = ((float) this.aShort101 + local308) * (float) this.aClass172_Sub2_41.anInt7200;
		}
		if (local324 / (float) arg2 >= this.aClass172_Sub2_41.aFloat88 || this.aClass172_Sub2_41.aFloat80 >= local335 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass67Array1 != null) {
			Static152.aFloat25 = local16.aFloat40 * local25.aFloat45 + local25.aFloat43 * local16.aFloat37 + local16.aFloat38 * local25.aFloat37;
			Static125.aFloat19 = local16.aFloat41 * local25.aFloat37 + local16.aFloat43 * local25.aFloat43 + local16.aFloat36 * local25.aFloat45;
			Static193.aFloat30 = local16.aFloat40 * local25.aFloat39 + local16.aFloat37 * local25.aFloat36 + local16.aFloat38 * local25.aFloat40;
			Static133.aFloat20 = local16.aFloat36 * local25.aFloat39 + local25.aFloat40 * local16.aFloat41 + local16.aFloat43 * local25.aFloat36;
			Static422.aFloat74 = local16.aFloat46 * local25.aFloat37 + local25.aFloat43 * local16.aFloat45 + local25.aFloat45 * local16.aFloat39;
			Static305.aFloat60 = local25.aFloat40 * local16.aFloat46 + local25.aFloat36 * local16.aFloat45 + local16.aFloat39 * local25.aFloat39;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.aShort96 + this.aShort95 >> 1;
			@Pc(511) int local511 = this.aShort97 + this.aShort93 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static133.aFloat20 + Static401.aFloat72 * (float) this.aShort94 + Static319.aFloat13 + (float) local503 * Static125.aFloat19);
			@Pc(549) int local549 = (int) (Static193.aFloat30 * (float) local511 + Static83.aFloat14 * (float) this.aShort94 + Static12.aFloat1 + (float) local503 * Static152.aFloat25);
			@Pc(568) int local568 = (int) (Static305.aFloat60 * (float) local511 + Static176.aFloat26 + Static422.aFloat74 * (float) local503 + (float) this.aShort94 * Static150.aFloat31);
			@Pc(587) int local587 = (int) ((float) local511 * Static133.aFloat20 + Static125.aFloat19 * (float) local503 + Static319.aFloat13 + (float) this.aShort100 * Static401.aFloat72);
			@Pc(606) int local606 = (int) (Static12.aFloat1 + Static152.aFloat25 * (float) local503 + Static83.aFloat14 * (float) this.aShort100 + (float) local511 * Static193.aFloat30);
			arg1.anInt4183 = local549 * this.aClass172_Sub2_41.anInt7200 / arg2 + this.aClass172_Sub2_41.anInt7170;
			arg1.anInt4182 = this.aClass172_Sub2_41.anInt7197 + local530 * this.aClass172_Sub2_41.anInt7185 / arg2;
			arg1.anInt4181 = this.aClass172_Sub2_41.anInt7200 * local606 / arg2 + this.aClass172_Sub2_41.anInt7170;
			@Pc(665) int local665 = (int) ((float) local511 * Static305.aFloat60 + Static150.aFloat31 * (float) this.aShort100 + (float) local503 * Static422.aFloat74 + Static176.aFloat26);
			arg1.anInt4180 = this.aClass172_Sub2_41.anInt7185 * local587 / arg2 + this.aClass172_Sub2_41.anInt7197;
			if (this.aClass172_Sub2_41.anInt7196 > local568 && local665 < this.aClass172_Sub2_41.anInt7196) {
				arg1.anInt4184 = this.aClass172_Sub2_41.anInt7197 + this.aClass172_Sub2_41.anInt7185 * (local530 + this.aShort101) / arg2 - arg1.anInt4182;
				arg1.aBoolean358 = true;
			}
		}
		this.aClass172_Sub2_41.method5580((float) arg2);
		this.aClass172_Sub2_41.method5598();
		this.aClass172_Sub2_41.method5602(local25);
		this.method5706();
		this.aClass172_Sub2_41.method5587();
		this.method5711();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class9 method5699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class9_Sub2 local19;
		@Pc(23) Class9_Sub2 local23;
		if (arg0 == 1) {
			local23 = this.aClass172_Sub2_41.aClass9_Sub2_6;
			local19 = this.aClass172_Sub2_41.aClass9_Sub2_10;
		} else if (arg0 == 2) {
			local19 = this.aClass172_Sub2_41.aClass9_Sub2_4;
			local23 = this.aClass172_Sub2_41.aClass9_Sub2_7;
		} else if (arg0 == 3) {
			local23 = this.aClass172_Sub2_41.aClass9_Sub2_2;
			local19 = this.aClass172_Sub2_41.aClass9_Sub2_8;
		} else if (arg0 == 4) {
			local23 = this.aClass172_Sub2_41.aClass9_Sub2_1;
			local19 = this.aClass172_Sub2_41.aClass9_Sub2_3;
		} else if (arg0 == 5) {
			local19 = this.aClass172_Sub2_41.aClass9_Sub2_5;
			local23 = this.aClass172_Sub2_41.aClass9_Sub2_9;
		} else {
			local19 = local23 = new Class9_Sub2(this.aClass172_Sub2_41);
		}
		return this.method5707(arg2, local19, arg1, local23, arg0 != 0);
	}

	@OriginalMember(owner = "client!vq", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7294; local3++) {
			if (arg0 != 128) {
				this.anIntArray516[local3] = arg0 * this.anIntArray516[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray515[local3] = this.anIntArray515[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray517[local3] = this.anIntArray517[local3] * arg2 >> 7;
			}
		}
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BIISI)I")
	private int method5714(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(18) int local18 = Static135.anIntArray174[Static128.method2017(arg1, arg2)];
		if (arg3 != -1) {
			@Pc(31) Class76 local31 = this.aClass172_Sub2_41.anInterface5_8.method3918(arg3 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte45 & 0xFF;
			@Pc(45) int local45;
			@Pc(69) int local69;
			if (local36 != 0) {
				if (arg2 < 0) {
					local45 = 0;
				} else if (arg2 <= 127) {
					local45 = arg2 * 131586;
				} else {
					local45 = 16777215;
				}
				if (local36 == 256) {
					local18 = local45;
				} else {
					local69 = 256 - local36;
					local18 = (local36 * (local45 & 0xFF00) + (local18 & 0xFF00) * local69 & 0xFF0000) + (local36 * (local45 & 0xFF00FF) + (local18 & 0xFF00FF) * local69 & 0xFF00FF00) >> 8;
				}
			}
			local45 = local31.aByte44 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(123) int local123 = (local18 >> 16 & 0xFF) * local45;
				if (local123 > 65535) {
					local123 = 65535;
				}
				local69 = (local18 >> 8 & 0xFF) * local45;
				if (local69 > 65535) {
					local69 = 65535;
				}
				@Pc(147) int local147 = local45 * (local18 & 0xFF);
				if (local147 > 65535) {
					local147 = 65535;
				}
				local18 = (local123 << 8 & 0xFF00FF) + (local69 & 0xFF00) + (local147 >> 8);
			}
		}
		return (local18 << 8) - ((arg0 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLclient!co;)V")
	private void method5715(@OriginalArg(1) Class3_Sub4_Sub4_Sub1 arg0) {
		if (Static188.anIntArray238.length < this.anInt7289) {
			Static188.anIntArray238 = new int[this.anInt7289];
			Static253.anIntArray307 = new int[this.anInt7289];
		}
		@Pc(46) int local46;
		@Pc(84) int local84;
		@Pc(93) int local93;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7294; local20++) {
			local46 = (this.anIntArray516[local20] - (this.aClass172_Sub2_41.anInt7183 * this.anIntArray515[local20] >> 8) >> this.aClass172_Sub2_41.anInt7162) - arg0.anInt1511;
			@Pc(70) int local70 = (this.anIntArray517[local20] - (this.anIntArray515[local20] * this.aClass172_Sub2_41.anInt7191 >> 8) >> this.aClass172_Sub2_41.anInt7162) - arg0.anInt1513;
			@Pc(75) int local75 = this.anIntArray518[local20];
			@Pc(82) int local82 = this.anIntArray518[local20 + 1];
			for (local84 = local75; local84 < local82; local84++) {
				local93 = this.aShortArray149[local84] - 1;
				if (local93 == -1) {
					break;
				}
				Static188.anIntArray238[local93] = local46;
				Static253.anIntArray307[local93] = local70;
			}
		}
		for (local46 = 0; local46 < this.anInt7307; local46++) {
			if (this.aByteArray92 == null || this.aByteArray92[local46] <= 128) {
				@Pc(147) short local147 = this.aShortArray153[local46];
				@Pc(152) short local152 = this.aShortArray150[local46];
				@Pc(157) short local157 = this.aShortArray146[local46];
				local84 = Static188.anIntArray238[local147];
				local93 = Static188.anIntArray238[local152];
				@Pc(169) int local169 = Static188.anIntArray238[local157];
				@Pc(173) int local173 = Static253.anIntArray307[local147];
				@Pc(177) int local177 = Static253.anIntArray307[local152];
				@Pc(181) int local181 = Static253.anIntArray307[local157];
				if ((local177 - local181) * (local84 - local93) - (local169 - local93) * (local177 - local173) > 0) {
					arg0.method1171(local181, local177, local169, local173, local93, local84);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean631) {
			this.method5703();
		}
		return this.aShort95;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!mn;Z)V")
	private void method5716(@OriginalArg(0) Class107_Sub1 arg0) {
		@Pc(20) int local20;
		if (this.aClass269Array4 != null) {
			for (local20 = 0; local20 < this.aClass269Array4.length; local20++) {
				@Pc(27) Class269 local27 = this.aClass269Array4[local20];
				@Pc(29) Class269 local29 = local27;
				if (local27.aClass269_2 != null) {
					local29 = local27.aClass269_2;
				}
				local29.anInt7673 = (int) (arg0.aFloat42 + arg0.aFloat41 * (float) this.anIntArray515[local27.anInt7675] + arg0.aFloat43 * (float) this.anIntArray516[local27.anInt7675] + (float) this.anIntArray517[local27.anInt7675] * arg0.aFloat36);
				local29.anInt7664 = (int) (arg0.aFloat44 + (float) this.anIntArray517[local27.anInt7675] * arg0.aFloat40 + arg0.aFloat38 * (float) this.anIntArray515[local27.anInt7675] + arg0.aFloat37 * (float) this.anIntArray516[local27.anInt7675]);
				local29.anInt7674 = (int) (arg0.aFloat35 + (float) this.anIntArray517[local27.anInt7675] * arg0.aFloat39 + (float) this.anIntArray515[local27.anInt7675] * arg0.aFloat46 + arg0.aFloat45 * (float) this.anIntArray516[local27.anInt7675]);
				local29.anInt7677 = (int) ((float) this.anIntArray517[local27.anInt7671] * arg0.aFloat36 + arg0.aFloat43 * (float) this.anIntArray516[local27.anInt7671] + (float) this.anIntArray515[local27.anInt7671] * arg0.aFloat41 + arg0.aFloat42);
				local29.anInt7667 = (int) ((float) this.anIntArray517[local27.anInt7671] * arg0.aFloat40 + (float) this.anIntArray516[local27.anInt7671] * arg0.aFloat37 + arg0.aFloat38 * (float) this.anIntArray515[local27.anInt7671] + arg0.aFloat44);
				local29.anInt7662 = (int) (arg0.aFloat45 * (float) this.anIntArray516[local27.anInt7671] + arg0.aFloat46 * (float) this.anIntArray515[local27.anInt7671] + (float) this.anIntArray517[local27.anInt7671] * arg0.aFloat39 + arg0.aFloat35);
				local29.anInt7665 = (int) ((float) this.anIntArray517[local27.anInt7670] * arg0.aFloat36 + arg0.aFloat43 * (float) this.anIntArray516[local27.anInt7670] + (float) this.anIntArray515[local27.anInt7670] * arg0.aFloat41 + arg0.aFloat42);
				local29.anInt7669 = (int) (arg0.aFloat44 + (float) this.anIntArray515[local27.anInt7670] * arg0.aFloat38 + (float) this.anIntArray516[local27.anInt7670] * arg0.aFloat37 + (float) this.anIntArray517[local27.anInt7670] * arg0.aFloat40);
				local29.anInt7663 = (int) ((float) this.anIntArray517[local27.anInt7670] * arg0.aFloat39 + (float) this.anIntArray516[local27.anInt7670] * arg0.aFloat45 + (float) this.anIntArray515[local27.anInt7670] * arg0.aFloat46 + arg0.aFloat35);
			}
		}
		if (this.aClass165Array4 == null) {
			return;
		}
		for (local20 = 0; local20 < this.aClass165Array4.length; local20++) {
			@Pc(372) Class165 local372 = this.aClass165Array4[local20];
			@Pc(374) Class165 local374 = local372;
			if (local372.aClass165_2 != null) {
				local374 = local372.aClass165_2;
			}
			if (local372.aClass107_3 == null) {
				local372.aClass107_3 = arg0.method4904();
			} else {
				local372.aClass107_3.ba(arg0);
			}
			local374.anInt5048 = (int) (arg0.aFloat42 + (float) this.anIntArray515[local372.anInt5052] * arg0.aFloat41 + arg0.aFloat43 * (float) this.anIntArray516[local372.anInt5052] + arg0.aFloat36 * (float) this.anIntArray517[local372.anInt5052]);
			local374.anInt5047 = (int) (arg0.aFloat38 * (float) this.anIntArray515[local372.anInt5052] + arg0.aFloat37 * (float) this.anIntArray516[local372.anInt5052] + (float) this.anIntArray517[local372.anInt5052] * arg0.aFloat40 + arg0.aFloat44);
			local374.anInt5054 = (int) (arg0.aFloat39 * (float) this.anIntArray517[local372.anInt5052] + arg0.aFloat45 * (float) this.anIntArray516[local372.anInt5052] + arg0.aFloat46 * (float) this.anIntArray515[local372.anInt5052] + arg0.aFloat35);
		}
	}

	@OriginalMember(owner = "client!vq", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7294; local7++) {
			if (arg0 != 0) {
				this.anIntArray516[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray515[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray517[local7] += arg2;
			}
		}
		if (this.aClass127_14 != null) {
			this.aClass127_14.anInterface6_3 = null;
		}
		this.aBoolean631 = false;
	}
}
