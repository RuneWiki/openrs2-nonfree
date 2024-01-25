import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[I")
	private int[] anIntArray411;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray144;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!or", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray145;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!or", name = "M", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!or", name = "N", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!or", name = "O", descriptor = "I")
	private int anInt5189;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "[Lclient!mk;")
	private Class156[] aClass156Array1;

	@OriginalMember(owner = "client!or", name = "V", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!or", name = "W", descriptor = "[Lclient!it;")
	private Class122[] aClass122Array2;

	@OriginalMember(owner = "client!or", name = "ab", descriptor = "[F")
	private float[] aFloatArray26;

	@OriginalMember(owner = "client!or", name = "db", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!or", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray146;

	@OriginalMember(owner = "client!or", name = "jb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!or", name = "nb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!or", name = "tb", descriptor = "[I")
	private int[] anIntArray413;

	@OriginalMember(owner = "client!or", name = "ub", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!or", name = "wb", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!or", name = "yb", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!or", name = "Ab", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!or", name = "Db", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!or", name = "Fb", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!or", name = "Hb", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!or", name = "Kb", descriptor = "[F")
	private float[] aFloatArray27;

	@OriginalMember(owner = "client!or", name = "Mb", descriptor = "Lclient!bu;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!or", name = "Nb", descriptor = "Lclient!bm;")
	private Interface1 anInterface1_6;

	@OriginalMember(owner = "client!or", name = "Pb", descriptor = "I")
	private int anInt5214;

	@OriginalMember(owner = "client!or", name = "Qb", descriptor = "Lclient!nk;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!or", name = "Rb", descriptor = "I")
	private int anInt5215;

	@OriginalMember(owner = "client!or", name = "Sb", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!or", name = "Ub", descriptor = "[Lclient!od;")
	private Class175[] aClass175Array1;

	@OriginalMember(owner = "client!or", name = "Vb", descriptor = "[Lclient!vj;")
	private Class252[] aClass252Array2;

	@OriginalMember(owner = "client!or", name = "Xb", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!or", name = "ec", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!or", name = "jc", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!or", name = "lc", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!or", name = "mc", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!or", name = "nc", descriptor = "B")
	private byte aByte60;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	private int anInt5175 = 0;

	@OriginalMember(owner = "client!or", name = "X", descriptor = "Z")
	private boolean aBoolean336 = false;

	@OriginalMember(owner = "client!or", name = "mb", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!or", name = "rb", descriptor = "I")
	private int anInt5204 = 0;

	@OriginalMember(owner = "client!or", name = "bb", descriptor = "I")
	private int anInt5195 = 0;

	@OriginalMember(owner = "client!or", name = "Ob", descriptor = "I")
	private int anInt5213 = 0;

	@OriginalMember(owner = "client!or", name = "kc", descriptor = "I")
	private int anInt5227 = 0;

	@OriginalMember(owner = "client!or", name = "Gb", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_35;

	@OriginalMember(owner = "client!or", name = "xb", descriptor = "Lclient!ds;")
	private Class58 aClass58_11;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "Lclient!ds;")
	private Class58 aClass58_9;

	@OriginalMember(owner = "client!or", name = "y", descriptor = "Lclient!ds;")
	private Class58 aClass58_10;

	@OriginalMember(owner = "client!or", name = "fc", descriptor = "Lclient!ds;")
	private Class58 aClass58_12;

	@OriginalMember(owner = "client!or", name = "Jb", descriptor = "Lclient!re;")
	private Class197 aClass197_1;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class37_Sub2(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aClass109_Sub1_35 = arg0;
		this.aClass58_11 = new Class58(this.aClass109_Sub1_35, null, 5126, 3, 0);
		this.aClass58_9 = new Class58(this.aClass109_Sub1_35, null, 5126, 2, 0);
		this.aClass58_10 = new Class58(this.aClass109_Sub1_35, null, 5126, 3, 0);
		this.aClass58_12 = new Class58(this.aClass109_Sub1_35, null, 5121, 4, 0);
		this.aClass197_1 = new Class197();
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!ht;Lclient!wk;IIII)V")
	public Class37_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class264 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5214 = arg2;
		this.aClass109_Sub1_35 = arg0;
		this.anInt5215 = arg5;
		if (Static412.method5565(arg2, arg5)) {
			this.aClass58_11 = new Class58(this.aClass109_Sub1_35, null, 5126, 3, 0);
		}
		if (Static177.method4487(arg2, arg5)) {
			this.aClass58_9 = new Class58(this.aClass109_Sub1_35, null, 5126, 2, 0);
		}
		if (Static226.method3405(arg5, arg2)) {
			this.aClass58_10 = new Class58(this.aClass109_Sub1_35, null, 5126, 3, 0);
		}
		if (Static127.method2923(arg2, arg5)) {
			this.aClass58_12 = new Class58(this.aClass109_Sub1_35, null, 5121, 4, 0);
		}
		if (Static289.method4077(arg2, arg5)) {
			this.aClass197_1 = new Class197();
		}
		@Pc(110) Interface7 local110 = arg0.anInterface7_9;
		@Pc(114) int[] local114 = new int[arg1.anInt7629];
		this.anIntArray411 = new int[arg1.anInt7628 + 1];
		for (@Pc(123) int local123 = 0; local123 < arg1.anInt7629; local123++) {
			if ((arg1.aByteArray90 == null || arg1.aByteArray90[local123] != 2) && (arg1.aShortArray106 == null || arg1.aShortArray106[local123] == -1 || !local110.method4836(arg1.aShortArray106[local123] & 0xFFFF).aBoolean289)) {
				local114[this.anInt5204++] = local123;
				this.anIntArray411[arg1.aShortArray109[local123]]++;
				this.anIntArray411[arg1.aShortArray108[local123]]++;
				this.anIntArray411[arg1.aShortArray102[local123]]++;
			}
		}
		this.anInt5175 = this.anInt5204;
		@Pc(212) long[] local212 = new long[this.anInt5204];
		@Pc(221) boolean local221 = (this.anInt5214 & 0x100) != 0;
		@Pc(233) int local233;
		@Pc(244) int local244;
		@Pc(369) int local369;
		label488: for (@Pc(223) int local223 = 0; local223 < this.anInt5204; local223++) {
			@Pc(229) int local229 = local114[local223];
			@Pc(231) Class151 local231 = null;
			local233 = 0;
			@Pc(235) byte local235 = 0;
			@Pc(237) byte local237 = 0;
			@Pc(239) byte local239 = 0;
			if (arg1.aClass152Array1 != null) {
				for (local244 = 0; local244 < arg1.aClass152Array1.length; local244++) {
					@Pc(251) Class152 local251 = arg1.aClass152Array1[local244];
					if (local251.anInt4303 == local229) {
						@Pc(260) Class210 local260 = Static128.method1876(local251.anInt4304);
						if (local260.aBoolean396) {
							local212[local223] = Long.MAX_VALUE;
							this.anInt5175--;
							continue label488;
						}
					}
				}
			}
			@Pc(283) short local283 = -1;
			if (arg1.aShortArray106 != null) {
				local283 = arg1.aShortArray106[local229];
				if (local283 != -1) {
					local231 = local110.method4836(local283 & 0xFFFF);
					local239 = local231.aByte56;
					local237 = local231.aByte52;
				}
			}
			@Pc(325) boolean local325 = arg1.aByteArray91 != null && arg1.aByteArray91[local229] != 0 || local231 != null && !local231.aBoolean296;
			if ((local221 || local325) && arg1.aByteArray93 != null) {
				local233 += arg1.aByteArray93[local229] << 17;
			}
			if (local325) {
				local233 += 65536;
			}
			local233 += (local237 & 0xFF) << 8;
			local233 += local239 & 0xFF;
			local369 = local235 + ((local283 & 0xFFFF) << 16);
			@Pc(375) int local375 = local369 + (local223 & 0xFFFF);
			local212[local223] = ((long) local233 << 32) + (long) local375;
		}
		Static69.method1195(local212, local114);
		this.anInt5227 = arg1.anInt7628;
		this.anIntArray414 = arg1.anIntArray672;
		this.anIntArray415 = arg1.anIntArray671;
		this.anIntArray412 = arg1.anIntArray666;
		this.aShortArray70 = arg1.aShortArray105;
		this.anInt5195 = arg1.anInt7622;
		this.aClass122Array2 = arg1.aClass122Array4;
		this.aClass252Array2 = arg1.aClass252Array4;
		@Pc(430) Class11[] local430 = new Class11[this.anInt5227];
		@Pc(450) int local450;
		@Pc(464) int local464;
		if (arg1.aClass152Array1 != null) {
			this.anInt5189 = arg1.aClass152Array1.length;
			this.aClass175Array1 = new Class175[this.anInt5189];
			this.aClass156Array1 = new Class156[this.anInt5189];
			for (local450 = 0; local450 < this.anInt5189; local450++) {
				@Pc(457) Class152 local457 = arg1.aClass152Array1[local450];
				@Pc(462) Class210 local462 = Static128.method1876(local457.anInt4304);
				local464 = -1;
				for (@Pc(466) int local466 = 0; local466 < this.anInt5204; local466++) {
					if (local457.anInt4303 == local114[local466]) {
						local464 = local466;
						break;
					}
				}
				if (local464 == -1) {
					throw new RuntimeException();
				}
				local244 = Static389.anIntArray561[arg1.aShortArray111[local457.anInt4303] & 0xFFFF] & 0xFFFFFF;
				local244 |= 255 - (arg1.aByteArray91 == null ? 0 : arg1.aByteArray91[local457.anInt4303]) << 24;
				this.aClass156Array1[local450] = new Class156(local464, arg1.aShortArray109[local457.anInt4303], arg1.aShortArray108[local457.anInt4303], arg1.aShortArray102[local457.anInt4303], local462.anInt6116, local462.anInt6122, local462.anInt6119, local462.anInt6124, local462.anInt6118, local462.aBoolean396, local462.aBoolean395, local457.anInt4301);
				this.aClass175Array1[local450] = new Class175(local244);
			}
		}
		local450 = this.anInt5204 * 3;
		this.aFloatArray27 = new float[local450];
		this.aShortArray68 = new short[this.anInt5204];
		this.aShortArray69 = new short[local450];
		this.aByteArray68 = new byte[this.anInt5204];
		this.aShort58 = (short) arg4;
		this.aShort57 = (short) arg3;
		this.aShortArray71 = new short[this.anInt5204];
		this.aShortArray67 = new short[this.anInt5204];
		this.aShortArray62 = new short[this.anInt5204];
		this.aFloatArray26 = new float[local450];
		this.aShortArray65 = new short[local450];
		this.aByteArray69 = new byte[local450];
		this.aShortArray63 = new short[local450];
		this.aShortArray72 = new short[this.anInt5204];
		Static319.aLongArray6 = new long[local450];
		if (arg1.aShortArray104 != null) {
			this.aShortArray66 = new short[this.anInt5204];
		}
		this.aShortArray64 = new short[local450];
		local233 = 0;
		for (local369 = 0; local369 < arg1.anInt7628; local369++) {
			local464 = this.anIntArray411[local369];
			this.anIntArray411[local369] = local233;
			local430[local369] = new Class11();
			local233 += local464;
		}
		this.anIntArray411[arg1.anInt7628] = local233;
		@Pc(702) int[] local702 = null;
		@Pc(704) int[] local704 = null;
		@Pc(706) int[] local706 = null;
		@Pc(708) float[][] local708 = null;
		@Pc(734) int local734;
		@Pc(769) int local769;
		@Pc(775) int local775;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(827) int local827;
		@Pc(832) int local832;
		@Pc(996) float local996;
		@Pc(1004) float local1004;
		@Pc(988) float local988;
		if (arg1.aByteArray89 != null) {
			@Pc(714) int local714 = arg1.anInt7636;
			@Pc(717) int[] local717 = new int[local714];
			@Pc(720) int[] local720 = new int[local714];
			@Pc(723) int[] local723 = new int[local714];
			@Pc(726) int[] local726 = new int[local714];
			@Pc(729) int[] local729 = new int[local714];
			@Pc(732) int[] local732 = new int[local714];
			for (local734 = 0; local734 < local714; local734++) {
				local717[local734] = Integer.MAX_VALUE;
				local720[local734] = -2147483647;
				local723[local734] = Integer.MAX_VALUE;
				local726[local734] = -2147483647;
				local729[local734] = Integer.MAX_VALUE;
				local732[local734] = -2147483647;
			}
			local702 = new int[local714];
			for (local769 = 0; local769 < this.anInt5204; local769++) {
				local775 = local114[local769];
				if (arg1.aByteArray89[local775] != -1) {
					local789 = arg1.aByteArray89[local775] & 0xFF;
					for (local791 = 0; local791 < 3; local791++) {
						@Pc(803) short local803;
						if (local791 == 0) {
							local803 = arg1.aShortArray109[local775];
						} else if (local791 == 1) {
							local803 = arg1.aShortArray108[local775];
						} else {
							local803 = arg1.aShortArray102[local775];
						}
						local827 = arg1.anIntArray672[local803];
						local832 = arg1.anIntArray666[local803];
						@Pc(837) int local837 = arg1.anIntArray671[local803];
						if (local717[local789] > local827) {
							local717[local789] = local827;
						}
						if (local827 > local720[local789]) {
							local720[local789] = local827;
						}
						if (local832 < local723[local789]) {
							local723[local789] = local832;
						}
						if (local726[local789] < local832) {
							local726[local789] = local832;
						}
						if (local837 < local729[local789]) {
							local729[local789] = local837;
						}
						if (local732[local789] < local837) {
							local732[local789] = local837;
						}
					}
				}
			}
			local708 = new float[local714][];
			local704 = new int[local714];
			local706 = new int[local714];
			for (local775 = 0; local775 < local714; local775++) {
				@Pc(936) byte local936 = arg1.aByteArray94[local775];
				if (local936 > 0) {
					local702[local775] = (local717[local775] + local720[local775]) / 2;
					local704[local775] = (local726[local775] + local723[local775]) / 2;
					local706[local775] = (local732[local775] + local729[local775]) / 2;
					if (local936 == 1) {
						local832 = arg1.anIntArray675[local775];
						local1004 = 64.0F / (float) arg1.anIntArray667[local775];
						if (local832 == 0) {
							local988 = 1.0F;
							local996 = 1.0F;
						} else if (local832 > 0) {
							local996 = 1.0F;
							local988 = (float) local832 / 1024.0F;
						} else {
							local996 = (float) -local832 / 1024.0F;
							local988 = 1.0F;
						}
					} else if (local936 == 2) {
						local1004 = 64.0F / (float) arg1.anIntArray667[local775];
						local996 = 64.0F / (float) arg1.anIntArray675[local775];
						local988 = 64.0F / (float) arg1.anIntArray670[local775];
					} else {
						local988 = (float) arg1.anIntArray670[local775] / 1024.0F;
						local996 = (float) arg1.anIntArray675[local775] / 1024.0F;
						local1004 = (float) arg1.anIntArray667[local775] / 1024.0F;
					}
					local708[local775] = Static27.method485(arg1.aShortArray110[local775], arg1.aShortArray103[local775], arg1.aShortArray107[local775], arg1.aByteArray92[local775] & 0xFF, local988, local1004, local996);
				}
			}
		}
		@Pc(1116) Class261[] local1116 = new Class261[arg1.anInt7629];
		@Pc(1135) short local1135;
		@Pc(1146) int local1146;
		@Pc(1156) int local1156;
		@Pc(1216) int local1216;
		for (@Pc(1118) int local1118 = 0; local1118 < arg1.anInt7629; local1118++) {
			@Pc(1125) short local1125 = arg1.aShortArray109[local1118];
			@Pc(1130) short local1130 = arg1.aShortArray108[local1118];
			local1135 = arg1.aShortArray102[local1118];
			local1146 = this.anIntArray414[local1130] - this.anIntArray414[local1125];
			local1156 = this.anIntArray412[local1130] - this.anIntArray412[local1125];
			local734 = this.anIntArray415[local1130] - this.anIntArray415[local1125];
			local769 = this.anIntArray414[local1135] - this.anIntArray414[local1125];
			local775 = this.anIntArray412[local1135] - this.anIntArray412[local1125];
			local789 = this.anIntArray415[local1135] - this.anIntArray415[local1125];
			local791 = local789 * local1156 - local775 * local734;
			local1216 = local769 * local734 - local789 * local1146;
			for (local827 = local1146 * local775 - local769 * local1156; local791 > 8192 || local1216 > 8192 || local827 > 8192 || local791 < -8192 || local1216 < -8192 || local827 < -8192; local827 >>= 0x1) {
				local1216 >>= 0x1;
				local791 >>= 0x1;
			}
			local832 = (int) Math.sqrt((double) (local791 * local791 + local1216 * local1216 + local827 * local827));
			if (local832 <= 0) {
				local832 = 1;
			}
			local827 = local827 * 256 / local832;
			local791 = local791 * 256 / local832;
			local1216 = local1216 * 256 / local832;
			@Pc(1311) byte local1311 = arg1.aByteArray90 == null ? 0 : arg1.aByteArray90[local1118];
			if (local1311 == 0) {
				@Pc(1320) Class11 local1320 = local430[local1125];
				local1320.anInt333 += local827;
				local1320.anInt329 += local1216;
				local1320.anInt332++;
				local1320.anInt331 += local791;
				@Pc(1348) Class11 local1348 = local430[local1130];
				local1348.anInt332++;
				local1348.anInt333 += local827;
				local1348.anInt329 += local1216;
				local1348.anInt331 += local791;
				@Pc(1376) Class11 local1376 = local430[local1135];
				local1376.anInt329 += local1216;
				local1376.anInt332++;
				local1376.anInt333 += local827;
				local1376.anInt331 += local791;
			} else if (local1311 == 1) {
				@Pc(1415) Class261 local1415 = local1116[local1118] = new Class261();
				local1415.anInt7582 = local791;
				local1415.anInt7579 = local1216;
				local1415.anInt7580 = local827;
			}
		}
		@Pc(1441) int local1441;
		for (@Pc(1435) int local1435 = 0; local1435 < this.anInt5204; local1435++) {
			local1441 = local114[local1435];
			@Pc(1448) int local1448 = arg1.aShortArray111[local1441] & 0xFFFF;
			@Pc(1453) short local1453;
			if (arg1.aShortArray106 == null) {
				local1453 = -1;
			} else {
				local1453 = arg1.aShortArray106[local1441];
			}
			if (arg1.aByteArray89 == null) {
				local1156 = -1;
			} else {
				local1156 = arg1.aByteArray89[local1441];
			}
			if (arg1.aByteArray91 == null) {
				local734 = 0;
			} else {
				local734 = arg1.aByteArray91[local1441] & 0xFF;
			}
			@Pc(1488) float local1488 = 0.0F;
			@Pc(1490) float local1490 = 0.0F;
			@Pc(1492) float local1492 = 0.0F;
			local996 = 0.0F;
			local1004 = 0.0F;
			local988 = 0.0F;
			@Pc(1500) byte local1500 = 0;
			@Pc(1502) byte local1502 = 0;
			@Pc(1504) int local1504 = 0;
			@Pc(1521) byte local1521;
			@Pc(1541) short local1541;
			@Pc(1546) short local1546;
			@Pc(1551) short local1551;
			if (local1453 != -1) {
				if (local1156 == -1) {
					local1004 = 0.0F;
					local1500 = 1;
					local1502 = 2;
					local1492 = 1.0F;
					local1488 = 0.0F;
					local1490 = 1.0F;
					local988 = 0.0F;
					local996 = 1.0F;
				} else {
					local1156 &= 0xFF;
					local1521 = arg1.aByteArray94[local1156];
					@Pc(1531) short local1531;
					@Pc(1536) short local1536;
					@Pc(1574) float local1574;
					@Pc(1582) float local1582;
					@Pc(1590) float local1590;
					@Pc(1674) float local1674;
					@Pc(1683) float local1683;
					@Pc(1692) float local1692;
					@Pc(1701) float local1701;
					@Pc(1709) float local1709;
					@Pc(1717) float local1717;
					if (local1521 == 0) {
						local1531 = arg1.aShortArray109[local1441];
						local1536 = arg1.aShortArray108[local1441];
						local1541 = arg1.aShortArray102[local1441];
						local1546 = arg1.aShortArray107[local1156];
						local1551 = arg1.aShortArray110[local1156];
						@Pc(1556) short local1556 = arg1.aShortArray103[local1156];
						@Pc(1562) float local1562 = (float) arg1.anIntArray672[local1546];
						@Pc(1568) float local1568 = (float) arg1.anIntArray666[local1546];
						local1574 = arg1.anIntArray671[local1546];
						local1582 = (float) arg1.anIntArray672[local1551] - local1562;
						local1590 = (float) arg1.anIntArray666[local1551] - local1568;
						@Pc(1598) float local1598 = (float) arg1.anIntArray671[local1551] - local1574;
						@Pc(1606) float local1606 = (float) arg1.anIntArray672[local1556] - local1562;
						@Pc(1615) float local1615 = (float) arg1.anIntArray666[local1556] - local1568;
						@Pc(1624) float local1624 = (float) arg1.anIntArray671[local1556] - local1574;
						@Pc(1633) float local1633 = (float) arg1.anIntArray672[local1531] - local1562;
						@Pc(1642) float local1642 = (float) arg1.anIntArray666[local1531] - local1568;
						@Pc(1650) float local1650 = (float) arg1.anIntArray671[local1531] - local1574;
						@Pc(1658) float local1658 = (float) arg1.anIntArray672[local1536] - local1562;
						@Pc(1666) float local1666 = (float) arg1.anIntArray666[local1536] - local1568;
						local1674 = (float) arg1.anIntArray671[local1536] - local1574;
						local1683 = (float) arg1.anIntArray672[local1541] - local1562;
						local1692 = (float) arg1.anIntArray666[local1541] - local1568;
						local1701 = (float) arg1.anIntArray671[local1541] - local1574;
						local1709 = local1624 * local1590 - local1598 * local1615;
						local1717 = local1598 * local1606 - local1624 * local1582;
						@Pc(1725) float local1725 = local1582 * local1615 - local1606 * local1590;
						@Pc(1733) float local1733 = local1725 * local1615 - local1624 * local1717;
						@Pc(1741) float local1741 = local1709 * local1624 - local1606 * local1725;
						@Pc(1750) float local1750 = local1606 * local1717 - local1709 * local1615;
						@Pc(1764) float local1764 = 1.0F / (local1598 * local1750 + local1741 * local1590 + local1582 * local1733);
						local1004 = local1764 * (local1701 * local1750 + local1692 * local1741 + local1733 * local1683);
						local1492 = local1764 * (local1666 * local1741 + local1733 * local1658 + local1674 * local1750);
						local1488 = local1764 * (local1750 * local1650 + local1633 * local1733 + local1642 * local1741);
						@Pc(1814) float local1814 = local1590 * local1725 - local1598 * local1717;
						@Pc(1823) float local1823 = local1598 * local1709 - local1582 * local1725;
						@Pc(1832) float local1832 = local1582 * local1717 - local1590 * local1709;
						@Pc(1846) float local1846 = 1.0F / (local1624 * local1832 + local1615 * local1823 + local1606 * local1814);
						local1490 = (local1832 * local1650 + local1814 * local1633 + local1823 * local1642) * local1846;
						local988 = (local1814 * local1683 + local1692 * local1823 + local1701 * local1832) * local1846;
						local996 = (local1674 * local1832 + local1658 * local1814 + local1666 * local1823) * local1846;
					} else {
						local1531 = arg1.aShortArray109[local1441];
						local1536 = arg1.aShortArray108[local1441];
						local1541 = arg1.aShortArray102[local1441];
						@Pc(1909) int local1909 = local702[local1156];
						@Pc(1913) int local1913 = local704[local1156];
						@Pc(1917) int local1917 = local706[local1156];
						@Pc(1921) float[] local1921 = local708[local1156];
						@Pc(1926) byte local1926 = arg1.aByteArray88[local1156];
						local1574 = (float) arg1.anIntArray673[local1156] / 256.0F;
						if (local1521 == 1) {
							local1582 = (float) arg1.anIntArray670[local1156] / 1024.0F;
							Static208.method3193(local1574, arg1.anIntArray672[local1531], local1917, local1921, local1926, arg1.anIntArray671[local1531], local1909, arg1.anIntArray666[local1531], local1582, local1913);
							local1488 = Static203.aFloat66;
							local1490 = Static147.aFloat37;
							Static208.method3193(local1574, arg1.anIntArray672[local1536], local1917, local1921, local1926, arg1.anIntArray671[local1536], local1909, arg1.anIntArray666[local1536], local1582, local1913);
							local1492 = Static203.aFloat66;
							local996 = Static147.aFloat37;
							Static208.method3193(local1574, arg1.anIntArray672[local1541], local1917, local1921, local1926, arg1.anIntArray671[local1541], local1909, arg1.anIntArray666[local1541], local1582, local1913);
							local988 = Static147.aFloat37;
							local1004 = Static203.aFloat66;
							local1590 = local1582 / 2.0F;
							if ((local1926 & 0x1) == 0) {
								if (local1590 < local1004 - local1488) {
									local1502 = 1;
									local1004 -= local1582;
								} else if (local1488 - local1004 > local1590) {
									local1502 = 2;
									local1004 += local1582;
								}
								if (local1492 - local1488 > local1590) {
									local1492 -= local1582;
									local1500 = 1;
								} else if (local1590 < local1488 - local1492) {
									local1492 += local1582;
									local1500 = 2;
								}
							} else {
								if (local996 - local1490 > local1590) {
									local996 -= local1582;
									local1500 = 1;
								} else if (local1490 - local996 > local1590) {
									local1500 = 2;
									local996 += local1582;
								}
								if (local988 - local1490 > local1590) {
									local988 -= local1582;
									local1502 = 1;
								} else if (local1490 - local988 > local1590) {
									local1502 = 2;
									local988 += local1582;
								}
							}
						} else if (local1521 == 2) {
							local1582 = (float) arg1.anIntArray668[local1156] / 256.0F;
							local1590 = (float) arg1.anIntArray674[local1156] / 256.0F;
							@Pc(2366) int local2366 = arg1.anIntArray672[local1536] - arg1.anIntArray672[local1531];
							@Pc(2376) int local2376 = arg1.anIntArray666[local1536] - arg1.anIntArray666[local1531];
							@Pc(2386) int local2386 = arg1.anIntArray671[local1536] - arg1.anIntArray671[local1531];
							@Pc(2396) int local2396 = arg1.anIntArray672[local1541] - arg1.anIntArray672[local1531];
							@Pc(2407) int local2407 = arg1.anIntArray666[local1541] - arg1.anIntArray666[local1531];
							@Pc(2418) int local2418 = arg1.anIntArray671[local1541] - arg1.anIntArray671[local1531];
							@Pc(2427) int local2427 = local2418 * local2376 - local2407 * local2386;
							@Pc(2436) int local2436 = local2396 * local2386 - local2418 * local2366;
							@Pc(2444) int local2444 = local2366 * local2407 - local2396 * local2376;
							local1674 = 64.0F / (float) arg1.anIntArray675[local1156];
							local1683 = 64.0F / (float) arg1.anIntArray667[local1156];
							local1692 = 64.0F / (float) arg1.anIntArray670[local1156];
							local1701 = ((float) local2444 * local1921[2] + (float) local2427 * local1921[0] + local1921[1] * (float) local2436) / local1674;
							local1709 = ((float) local2436 * local1921[4] + (float) local2427 * local1921[3] + local1921[5] * (float) local2444) / local1683;
							local1717 = ((float) local2427 * local1921[6] + (float) local2436 * local1921[7] + local1921[8] * (float) local2444) / local1692;
							local1504 = Static366.method4345(local1701, local1709, local1717);
							Static77.method1349(local1909, local1917, local1574, local1921, arg1.anIntArray671[local1531], arg1.anIntArray672[local1531], local1913, local1590, local1926, arg1.anIntArray666[local1531], local1504, local1582);
							local1488 = Static45.aFloat24;
							local1490 = Static424.aFloat93;
							Static77.method1349(local1909, local1917, local1574, local1921, arg1.anIntArray671[local1536], arg1.anIntArray672[local1536], local1913, local1590, local1926, arg1.anIntArray666[local1536], local1504, local1582);
							local996 = Static424.aFloat93;
							local1492 = Static45.aFloat24;
							Static77.method1349(local1909, local1917, local1574, local1921, arg1.anIntArray671[local1541], arg1.anIntArray672[local1541], local1913, local1590, local1926, arg1.anIntArray666[local1541], local1504, local1582);
							local1004 = Static45.aFloat24;
							local988 = Static424.aFloat93;
						} else if (local1521 == 3) {
							Static145.method2174(arg1.anIntArray671[local1531], local1574, local1921, arg1.anIntArray666[local1531], local1913, local1926, local1917, local1909, arg1.anIntArray672[local1531]);
							local1488 = Static288.aFloat80;
							local1490 = Static452.aFloat97;
							Static145.method2174(arg1.anIntArray671[local1536], local1574, local1921, arg1.anIntArray666[local1536], local1913, local1926, local1917, local1909, arg1.anIntArray672[local1536]);
							local996 = Static452.aFloat97;
							local1492 = Static288.aFloat80;
							Static145.method2174(arg1.anIntArray671[local1541], local1574, local1921, arg1.anIntArray666[local1541], local1913, local1926, local1917, local1909, arg1.anIntArray672[local1541]);
							local1004 = Static288.aFloat80;
							local988 = Static452.aFloat97;
							if ((local1926 & 0x1) == 0) {
								if (local1492 - local1488 > 0.5F) {
									local1492--;
									local1500 = 1;
								} else if (local1488 - local1492 > 0.5F) {
									local1500 = 2;
									local1492++;
								}
								if (local1004 - local1488 > 0.5F) {
									local1502 = 1;
									local1004--;
								} else if (local1488 - local1004 > 0.5F) {
									local1502 = 2;
									local1004++;
								}
							} else {
								if (local988 - local1490 > 0.5F) {
									local988--;
									local1502 = 1;
								} else if (local1490 - local988 > 0.5F) {
									local1502 = 2;
									local988++;
								}
								if (local996 - local1490 > 0.5F) {
									local996--;
									local1500 = 1;
								} else if (local1490 - local996 > 0.5F) {
									local996++;
									local1500 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray90 == null) {
				local1521 = 0;
			} else {
				local1521 = arg1.aByteArray90[local1441];
			}
			if (local1521 == 0) {
				@Pc(2806) long local2806 = ((long) local734 + (long) (local1448 << 8) + (long) (local1504 << 24) << 32) + (long) (local1156 << 2);
				local1541 = arg1.aShortArray109[local1441];
				local1546 = arg1.aShortArray108[local1441];
				local1551 = arg1.aShortArray102[local1441];
				@Pc(2825) Class11 local2825 = local430[local1541];
				this.aShortArray68[local1435] = this.method4212(local1490, local1488, local2806, arg1, local2825.anInt332, local2825.anInt333, local2825.anInt331, local2825.anInt329, local1541);
				@Pc(2849) Class11 local2849 = local430[local1546];
				this.aShortArray67[local1435] = this.method4212(local996, local1492, local2806 + (long) local1500, arg1, local2849.anInt332, local2849.anInt333, local2849.anInt331, local2849.anInt329, local1546);
				@Pc(2876) Class11 local2876 = local430[local1551];
				this.aShortArray62[local1435] = this.method4212(local988, local1004, local2806 + (long) local1502, arg1, local2876.anInt332, local2876.anInt333, local2876.anInt331, local2876.anInt329, local1551);
			} else if (local1521 == 1) {
				@Pc(2668) Class261 local2668 = local1116[local1441];
				@Pc(2712) long local2712 = ((long) local734 + (long) (local1504 << 24) + (long) (local1448 << 8) << 32) + (long) ((local2668.anInt7580 + 256 << 22) + (local2668.anInt7579 + 256 << 12) + (local2668.anInt7582 <= 0 ? 2048 : 1024) + (local1156 << 2));
				this.aShortArray68[local1435] = this.method4212(local1490, local1488, local2712, arg1, 0, local2668.anInt7580, local2668.anInt7582, local2668.anInt7579, arg1.aShortArray109[local1441]);
				this.aShortArray67[local1435] = this.method4212(local996, local1492, local2712 + (long) local1500, arg1, 0, local2668.anInt7580, local2668.anInt7582, local2668.anInt7579, arg1.aShortArray108[local1441]);
				this.aShortArray62[local1435] = this.method4212(local988, local1004, (long) local1502 + local2712, arg1, 0, local2668.anInt7580, local2668.anInt7582, local2668.anInt7579, arg1.aShortArray102[local1441]);
			}
			if (arg1.aShortArray106 == null) {
				this.aShortArray71[local1435] = -1;
			} else {
				this.aShortArray71[local1435] = arg1.aShortArray106[local1441];
			}
			if (arg1.aByteArray91 != null) {
				this.aByteArray68[local1435] = arg1.aByteArray91[local1441];
			}
			if (arg1.aShortArray104 != null) {
				this.aShortArray66[local1435] = arg1.aShortArray104[local1441];
			}
			this.aShortArray72[local1435] = arg1.aShortArray111[local1441];
		}
		local1441 = 0;
		local1135 = -10000;
		for (local1146 = 0; local1146 < this.anInt5175; local1146++) {
			@Pc(2969) short local2969 = this.aShortArray71[local1146];
			if (local1135 != local2969) {
				local1441++;
				local1135 = local2969;
			}
		}
		this.anIntArray413 = new int[local1441 + 1];
		local1135 = -10000;
		local1441 = 0;
		for (local1156 = 0; local1156 < this.anInt5175; local1156++) {
			@Pc(2999) short local2999 = this.aShortArray71[local1156];
			if (local2999 != local1135) {
				this.anIntArray413[local1441++] = local1156;
				local1135 = local2999;
			}
		}
		this.anIntArray413[local1441] = this.anInt5175;
		Static319.aLongArray6 = null;
		this.aShortArray65 = Static450.method6023(this.aShortArray65, this.anInt5213);
		this.aShortArray64 = Static450.method6023(this.aShortArray64, this.anInt5213);
		this.aShortArray63 = Static450.method6023(this.aShortArray63, this.anInt5213);
		this.aByteArray69 = Static138.method1955(this.aByteArray69, this.anInt5213);
		this.aFloatArray26 = Static68.method1191(this.aFloatArray26, this.anInt5213);
		this.aFloatArray27 = Static68.method1191(this.aFloatArray27, this.anInt5213);
		if (arg1.anIntArray676 != null && Static237.method3521(this.anInt5215, arg2)) {
			this.anIntArrayArray146 = arg1.method5913();
		}
		if (arg1.aClass152Array1 != null && Static440.method5875(this.anInt5215, arg2)) {
			this.anIntArrayArray144 = arg1.method5906();
		}
		if (arg1.anIntArray669 != null && Static95.method1503(this.anInt5215, arg2)) {
			local734 = 0;
			@Pc(3117) int[] local3117 = new int[256];
			for (local775 = 0; local775 < this.anInt5204; local775++) {
				local789 = arg1.anIntArray669[local114[local775]];
				if (local789 >= 0) {
					@Pc(3137) int local3137 = local3117[local789]++;
					if (local734 < local789) {
						local734 = local789;
					}
				}
			}
			this.anIntArrayArray145 = new int[local734 + 1][];
			for (local789 = 0; local789 <= local734; local789++) {
				this.anIntArrayArray145[local789] = new int[local3117[local789]];
				local3117[local789] = 0;
			}
			for (local791 = 0; local791 < this.anInt5204; local791++) {
				local1216 = arg1.anIntArray669[local114[local791]];
				if (local1216 >= 0) {
					this.anIntArrayArray145[local1216][local3117[local1216]++] = local791;
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "()[Lclient!vj;")
	@Override
	public Class252[] method4225() {
		return this.aClass252Array2;
	}

	@OriginalMember(owner = "client!or", name = "C", descriptor = "()I")
	@Override
	public int C() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort55;
	}

	@OriginalMember(owner = "client!or", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4.anIntArray7[arg0];
		@Pc(13) int local13 = Class4.anIntArray6[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5227; local15++) {
			local34 = local9 * this.anIntArray415[local15] + local13 * this.anIntArray414[local15] >> 15;
			this.anIntArray415[local15] = this.anIntArray415[local15] * local13 - this.anIntArray414[local15] * local9 >> 15;
			this.anIntArray414[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5213; local34++) {
			@Pc(85) int local85 = this.aShortArray63[local34] * local9 + this.aShortArray65[local34] * local13 >> 15;
			this.aShortArray63[local34] = (short) (local13 * this.aShortArray63[local34] - local9 * this.aShortArray65[local34] >> 15);
			this.aShortArray65[local34] = (short) local85;
		}
		if (this.aClass58_10 == null && this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
		}
		if (this.aClass58_10 != null) {
			this.aClass58_10.anInterface1_1 = null;
		}
		this.aBoolean336 = false;
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "ra", descriptor = "()I")
	@Override
	public int ra() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!or", name = "FA", descriptor = "()Z")
	@Override
	protected boolean FA() {
		if (this.anIntArrayArray146 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5195; local12++) {
			this.anIntArray414[local12] <<= 0x4;
			this.anIntArray412[local12] <<= 0x4;
			this.anIntArray415[local12] <<= 0x4;
		}
		Static95.anInt1787 = 0;
		Static273.anInt4871 = 0;
		Static201.anInt3736 = 0;
		return true;
	}

	@OriginalMember(owner = "client!or", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	@Override
	public Class1_Sub2_Sub11 ua(@OriginalArg(0) Class1_Sub2_Sub11 arg0) {
		if (this.anInt5213 == 0) {
			return null;
		}
		if (!this.aBoolean336) {
			this.method4208();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass109_Sub1_35.anInt3002 <= 0) {
			local40 = this.aShort63 - (this.aShort62 * this.aClass109_Sub1_35.anInt3002 >> 8) >> this.aClass109_Sub1_35.anInt2976;
			local57 = this.aShort56 - (this.aShort59 * this.aClass109_Sub1_35.anInt3002 >> 8) >> this.aClass109_Sub1_35.anInt2976;
		} else {
			local40 = this.aShort63 - (this.aShort59 * this.aClass109_Sub1_35.anInt3002 >> 8) >> this.aClass109_Sub1_35.anInt2976;
			local57 = this.aShort56 - (this.aShort62 * this.aClass109_Sub1_35.anInt3002 >> 8) >> this.aClass109_Sub1_35.anInt2976;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass109_Sub1_35.anInt2997 <= 0) {
			local114 = this.aShort60 - (this.aClass109_Sub1_35.anInt2997 * this.aShort62 >> 8) >> this.aClass109_Sub1_35.anInt2976;
			local131 = this.aShort55 - (this.aClass109_Sub1_35.anInt2997 * this.aShort59 >> 8) >> this.aClass109_Sub1_35.anInt2976;
		} else {
			local114 = this.aShort60 - (this.aClass109_Sub1_35.anInt2997 * this.aShort59 >> 8) >> this.aClass109_Sub1_35.anInt2976;
			local131 = this.aShort55 - (this.aClass109_Sub1_35.anInt2997 * this.aShort62 >> 8) >> this.aClass109_Sub1_35.anInt2976;
		}
		@Pc(174) int local174 = local57 + 1 - local40;
		@Pc(181) int local181 = local131 + 1 - local114;
		@Pc(184) Class1_Sub2_Sub11_Sub1 local184 = (Class1_Sub2_Sub11_Sub1) arg0;
		@Pc(194) Class1_Sub2_Sub11_Sub1 local194;
		if (local184 != null && local184.method3999(local181, local174)) {
			local194 = local184;
			local184.method3997();
		} else {
			local194 = new Class1_Sub2_Sub11_Sub1(this.aClass109_Sub1_35, local174, local181);
		}
		local194.method4000(local114, local131, local40, local57);
		this.method4211(local194);
		return local194;
	}

	@OriginalMember(owner = "client!or", name = "YA", descriptor = "(SS)V")
	@Override
	public void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass109_Sub1_35.anInterface7_9;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5204; local11++) {
			if (this.aShortArray71[local11] == arg0) {
				this.aShortArray71[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class151 local47 = local9.method4836(arg0 & 0xFFFF);
			local35 = local47.aByte53;
			local37 = local47.aByte51;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class151 local68 = local9.method4836(arg1 & 0xFFFF);
			local55 = local68.aByte53;
			local57 = local68.aByte51;
		}
		if (!(local35 != local55 | local57 != local37)) {
			return;
		}
		if (this.aClass156Array1 != null) {
			for (@Pc(93) int local93 = 0; local93 < this.anInt5189; local93++) {
				@Pc(100) Class156 local100 = this.aClass156Array1[local93];
				@Pc(105) Class175 local105 = this.aClass175Array1[local93];
				local105.anInt4950 = local105.anInt4950 & 0xFF000000 | Static389.anIntArray561[this.aShortArray72[local100.anInt4482] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!or", name = "ja", descriptor = "(III)V")
	@Override
	public void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5227; local7++) {
			if (arg0 != 0) {
				this.anIntArray414[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray412[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray415[local7] += arg2;
			}
		}
		this.aBoolean336 = false;
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIIZII)Z")
	private boolean method4200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg3 && arg5 > arg4 && arg0 > arg4) {
			return false;
		} else if (arg4 > arg3 && arg5 < arg4 && arg4 > arg0) {
			return false;
		} else if (arg1 > arg6 && arg7 > arg6 && arg6 < arg2) {
			return false;
		} else {
			return arg1 >= arg6 || arg6 <= arg7 || arg6 <= arg2;
		}
	}

	@OriginalMember(owner = "client!or", name = "XA", descriptor = "(III)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5227; local3++) {
			if (arg0 != 128) {
				this.anIntArray414[local3] = this.anIntArray414[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray412[local3] = this.anIntArray412[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray415[local3] = arg2 * this.anIntArray415[local3] >> 7;
			}
		}
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
		this.aBoolean336 = false;
	}

	@OriginalMember(owner = "client!or", name = "n", descriptor = "()I")
	@Override
	public int n() {
		return this.anInt5214;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "()V")
	@Override
	public void method4236() {
		if (this.anInt5213 <= 0 || this.anInt5175 <= 0) {
			return;
		}
		this.method4213(false);
		if ((this.aByte60 & 0x10) == 0 && this.aClass197_1.anInterface8_4 == null) {
			this.method4209(false);
		}
		this.method4201();
	}

	@OriginalMember(owner = "client!or", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	@Override
	public void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(3) Class136 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean336) {
			this.method4208();
		}
		@Pc(17) int local17 = arg4 + this.aShort63;
		@Pc(23) int local23 = arg4 + this.aShort56;
		@Pc(28) int local28 = this.aShort60 + arg6;
		@Pc(33) int local33 = arg6 + this.aShort55;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt7662 <= arg2.anInt7661 + local23 >> arg2.anInt7660 || local28 < 0 || arg2.anInt7661 + local33 >> arg2.anInt7660 >= arg2.anInt7664)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || local23 + arg3.anInt7661 >> arg3.anInt7660 >= arg3.anInt7662 || local28 < 0 || local33 + arg3.anInt7661 >> arg3.anInt7660 >= arg3.anInt7664) {
				return;
			}
		} else {
			local17 >>= arg2.anInt7660;
			local23 = local23 + arg2.anInt7661 - 1 >> arg2.anInt7660;
			local28 >>= arg2.anInt7660;
			local33 = local33 + arg2.anInt7661 - 1 >> arg2.anInt7660;
			if (arg2.I(local17, local28) == arg5 && arg2.I(local23, local28) == arg5 && arg2.I(local17, local33) == arg5 && arg5 == arg2.I(local23, local33)) {
				return;
			}
		}
		@Pc(198) int local198;
		if (arg0 == 1) {
			for (local198 = 0; local198 < this.anInt5227; local198++) {
				this.anIntArray412[local198] = this.anIntArray412[local198] + arg2.va(arg4 + this.anIntArray414[local198], this.anIntArray415[local198] + arg6) - arg5;
			}
		} else {
			@Pc(254) int local254;
			@Pc(265) int local265;
			if (arg0 == 2) {
				@Pc(246) short local246 = this.aShort62;
				if (local246 == 0) {
					return;
				}
				for (local254 = 0; local254 < this.anInt5227; local254++) {
					local265 = (this.anIntArray412[local254] << 16) / local246;
					if (local265 < arg1) {
						this.anIntArray412[local254] -= -((arg1 - local265) * (arg2.va(this.anIntArray414[local254] - -arg4, this.anIntArray415[local254] - -arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(404) int local404;
				if (arg0 == 3) {
					local198 = (arg1 & 0xFF) * 4;
					local254 = (arg1 >> 8 & 0xFF) * 4;
					local265 = (arg1 >> 16 & 0xFF) << 6;
					local404 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local198 >> 1) < 0 || arg2.anInt7662 << arg2.anInt7660 <= (local198 >> 1) + arg4 + arg2.anInt7661 || arg6 - (local254 >> 1) < 0 || arg2.anInt7664 << arg2.anInt7660 <= arg6 + (local254 >> 1) + arg2.anInt7661) {
						return;
					}
					this.method4234(arg5, local265, local254, local198, local404, arg4, arg2, arg6);
				} else if (arg0 == 4) {
					local198 = this.aShort59 - this.aShort62;
					for (local254 = 0; local254 < this.anInt5227; local254++) {
						this.anIntArray412[local254] = this.anIntArray412[local254] + arg3.va(arg4 + this.anIntArray414[local254], arg6 + this.anIntArray415[local254]) + local198 - arg5;
					}
				} else if (arg0 == 5) {
					local198 = this.aShort59 - this.aShort62;
					for (local254 = 0; local254 < this.anInt5227; local254++) {
						local265 = this.anIntArray414[local254] + arg4;
						local404 = this.anIntArray415[local254] + arg6;
						@Pc(409) int local409 = arg2.va(local265, local404);
						@Pc(414) int local414 = arg3.va(local265, local404);
						@Pc(418) int local418 = local409 - local414;
						this.anIntArray412[local254] = local409 + (local418 * ((this.anIntArray412[local254] << 8) / local198) >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean336 = false;
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BIZ)Lclient!c;")
	@Override
	public Class37 method4221(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(28) Class37_Sub2 local28;
		@Pc(32) Class37_Sub2 local32;
		if (arg0 == 1) {
			local32 = this.aClass109_Sub1_35.aClass37_Sub2_10;
			local28 = this.aClass109_Sub1_35.aClass37_Sub2_1;
		} else if (arg0 == 2) {
			local28 = this.aClass109_Sub1_35.aClass37_Sub2_9;
			local32 = this.aClass109_Sub1_35.aClass37_Sub2_7;
		} else if (arg0 == 3) {
			local28 = this.aClass109_Sub1_35.aClass37_Sub2_8;
			local32 = this.aClass109_Sub1_35.aClass37_Sub2_2;
		} else if (arg0 == 4) {
			local28 = this.aClass109_Sub1_35.aClass37_Sub2_6;
			local32 = this.aClass109_Sub1_35.aClass37_Sub2_5;
		} else if (arg0 == 5) {
			local28 = this.aClass109_Sub1_35.aClass37_Sub2_4;
			local32 = this.aClass109_Sub1_35.aClass37_Sub2_3;
		} else {
			local28 = local32 = new Class37_Sub2(this.aClass109_Sub1_35);
		}
		return this.method4210(arg2, local28, arg1, local32, arg0 != 0);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	private void method4201() {
		if (!this.aBoolean337) {
			return;
		}
		this.aBoolean337 = false;
		if (this.aClass252Array2 == null && this.aClass122Array2 == null && this.aClass156Array1 == null) {
			if (this.anIntArray414 != null && !Static398.method5420(this.anInt5215, this.anInt5214)) {
				if (this.aClass58_11 != null && this.aClass58_11.anInterface1_1 == null) {
					this.aBoolean337 = true;
				} else {
					if (!this.aBoolean336) {
						this.method4208();
					}
					this.anIntArray414 = null;
				}
			}
			if (this.anIntArray412 != null && !Static6.method197(this.anInt5214, this.anInt5215)) {
				if (this.aClass58_11 != null && this.aClass58_11.anInterface1_1 == null) {
					this.aBoolean337 = true;
				} else {
					if (!this.aBoolean336) {
						this.method4208();
					}
					this.anIntArray412 = null;
				}
			}
			if (this.anIntArray415 != null && !Static167.method2672(this.anInt5215, this.anInt5214)) {
				if (this.aClass58_11 != null && this.aClass58_11.anInterface1_1 == null) {
					this.aBoolean337 = true;
				} else {
					if (!this.aBoolean336) {
						this.method4208();
					}
					this.anIntArray415 = null;
				}
			}
		}
		if (this.aShortArray69 != null && this.anIntArray414 == null && this.anIntArray412 == null && this.anIntArray415 == null) {
			this.anIntArray411 = null;
			this.aShortArray69 = null;
		}
		if (this.aByteArray69 != null && !Static364.method5016(this.anInt5215, this.anInt5214)) {
			if (this.aClass58_10 == null) {
				if (this.aClass58_12 != null && this.aClass58_12.anInterface1_1 == null) {
					this.aBoolean337 = true;
				} else {
					this.aByteArray69 = null;
					this.aShortArray65 = this.aShortArray64 = this.aShortArray63 = null;
				}
			} else if (this.aClass58_10.anInterface1_1 == null) {
				this.aBoolean337 = true;
			} else {
				this.aByteArray69 = null;
				this.aShortArray65 = this.aShortArray64 = this.aShortArray63 = null;
			}
		}
		if (this.aShortArray72 != null && !Static340.method4803(this.anInt5214, this.anInt5215)) {
			if (this.aClass58_12 != null && this.aClass58_12.anInterface1_1 == null) {
				this.aBoolean337 = true;
			} else {
				this.aShortArray72 = null;
			}
		}
		if (this.aByteArray68 != null && !Static360.method5082(this.anInt5214, this.anInt5215)) {
			if (this.aClass58_12 != null && this.aClass58_12.anInterface1_1 == null) {
				this.aBoolean337 = true;
			} else {
				this.aByteArray68 = null;
			}
		}
		if (this.aFloatArray26 != null && !Static241.method3555(this.anInt5214, this.anInt5215)) {
			if (this.aClass58_9 != null && this.aClass58_9.anInterface1_1 == null) {
				this.aBoolean337 = true;
			} else {
				this.aFloatArray26 = this.aFloatArray27 = null;
			}
		}
		if (this.aShortArray71 != null && !Static306.method4387(this.anInt5215, this.anInt5214)) {
			if (this.aClass58_12 != null && this.aClass58_12.anInterface1_1 == null) {
				this.aBoolean337 = true;
			} else {
				this.aShortArray71 = null;
			}
		}
		if (this.aShortArray68 != null && !Static402.method5428(this.anInt5214, this.anInt5215)) {
			if ((this.aClass197_1 == null || this.aClass197_1.anInterface8_4 != null) && (this.aClass58_12 == null || this.aClass58_12.anInterface1_1 != null)) {
				this.aShortArray68 = this.aShortArray67 = this.aShortArray62 = null;
			} else {
				this.aBoolean337 = true;
			}
		}
		if (this.anIntArrayArray145 != null && !Static95.method1503(this.anInt5215, this.anInt5214)) {
			this.aShortArray66 = null;
			this.anIntArrayArray145 = null;
		}
		if (this.anIntArrayArray146 != null && !Static237.method3521(this.anInt5215, this.anInt5214)) {
			this.aShortArray70 = null;
			this.anIntArrayArray146 = null;
		}
		if (this.anIntArrayArray144 != null && !Static440.method5875(this.anInt5215, this.anInt5214)) {
			this.anIntArrayArray144 = null;
		}
		if (this.anIntArray413 != null && (this.anInt5214 & 0x800) == 0 && (this.anInt5214 & 0x40000) == 0) {
			this.anIntArray413 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ia;Lclient!nh;I)V")
	@Override
	public void method4230(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class39_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5213 == 0) {
			return;
		}
		@Pc(13) Class18_Sub1 local13 = this.aClass109_Sub1_35.aClass18_Sub1_3;
		if (!this.aBoolean336) {
			this.method4208();
		}
		@Pc(22) Class18_Sub1 local22 = (Class18_Sub1) arg0;
		this.method4205(local22);
		Static44.aFloat23 = local22.aFloat4 * local13.aFloat9 + local22.aFloat6 * local13.aFloat7 + local22.aFloat8 * local13.aFloat11 + local13.aFloat8;
		Static411.aFloat91 = local22.aFloat13 * local13.aFloat7 + local22.aFloat15 * local13.aFloat9 + local22.aFloat7 * local13.aFloat11;
		@Pc(73) float local73 = (float) this.aShort62 * Static411.aFloat91 + Static44.aFloat23;
		@Pc(81) float local81 = Static44.aFloat23 + (float) this.aShort59 * Static411.aFloat91;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local81 < local73) {
			local91 = local81 - (float) this.aShort61;
			local97 = local73 + (float) this.aShort61;
		} else {
			local97 = local81 + (float) this.aShort61;
			local91 = local73 - (float) this.aShort61;
		}
		if (local91 >= this.aClass109_Sub1_35.aFloat42 || local97 <= (float) this.aClass109_Sub1_35.anInt2989) {
			return;
		}
		Static103.aFloat32 = local13.aFloat10 * local22.aFloat7 + local13.aFloat15 * local22.aFloat13 + local13.aFloat5 * local22.aFloat15;
		Static236.aFloat83 = local22.aFloat4 * local13.aFloat5 + local13.aFloat15 * local22.aFloat6 + local22.aFloat8 * local13.aFloat10 + local13.aFloat4;
		@Pc(173) float local173 = Static236.aFloat83 + (float) this.aShort62 * Static103.aFloat32;
		@Pc(181) float local181 = Static236.aFloat83 + Static103.aFloat32 * (float) this.aShort59;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local181 < local173) {
			local207 = (float) this.aClass109_Sub1_35.anInt2986 * ((float) this.aShort61 + local173);
			local196 = (float) this.aClass109_Sub1_35.anInt2986 * (local181 - (float) this.aShort61);
		} else {
			local196 = (float) this.aClass109_Sub1_35.anInt2986 * (local173 - (float) this.aShort61);
			local207 = (float) this.aClass109_Sub1_35.anInt2986 * (local181 + (float) this.aShort61);
		}
		if (this.aClass109_Sub1_35.aFloat48 <= local196 / local97 || local207 / local97 <= this.aClass109_Sub1_35.aFloat44) {
			return;
		}
		Static62.aFloat30 = local13.aFloat12 * local22.aFloat4 + local22.aFloat6 * local13.aFloat13 + local13.aFloat14 * local22.aFloat8 + local13.aFloat6;
		Static433.aFloat94 = local13.aFloat12 * local22.aFloat15 + local22.aFloat13 * local13.aFloat13 + local13.aFloat14 * local22.aFloat7;
		@Pc(296) float local296 = (float) this.aShort62 * Static433.aFloat94 + Static62.aFloat30;
		@Pc(304) float local304 = Static433.aFloat94 * (float) this.aShort59 + Static62.aFloat30;
		@Pc(331) float local331;
		@Pc(319) float local319;
		if (local296 > local304) {
			local331 = ((float) -this.aShort61 + local304) * (float) this.aClass109_Sub1_35.anInt2992;
			local319 = (float) this.aClass109_Sub1_35.anInt2992 * (local296 + (float) this.aShort61);
		} else {
			local319 = (float) this.aClass109_Sub1_35.anInt2992 * (local304 + (float) this.aShort61);
			local331 = (float) this.aClass109_Sub1_35.anInt2992 * ((float) -this.aShort61 + local296);
		}
		if (local331 / local97 >= this.aClass109_Sub1_35.aFloat45 || local319 / local97 <= this.aClass109_Sub1_35.aFloat58) {
			return;
		}
		if (arg1 != null || this.aClass156Array1 != null) {
			Static357.aFloat86 = local13.aFloat11 * local22.aFloat9 + local13.aFloat9 * local22.aFloat5 + local13.aFloat7 * local22.aFloat12;
			Static317.aFloat65 = local13.aFloat14 * local22.aFloat9 + local13.aFloat12 * local22.aFloat5 + local13.aFloat13 * local22.aFloat12;
			Static382.aFloat89 = local13.aFloat15 * local22.aFloat12 + local22.aFloat5 * local13.aFloat5 + local13.aFloat10 * local22.aFloat9;
			Static26.aFloat68 = local22.aFloat11 * local13.aFloat11 + local13.aFloat7 * local22.aFloat14 + local22.aFloat10 * local13.aFloat9;
			Static96.aFloat31 = local22.aFloat14 * local13.aFloat13 + local22.aFloat10 * local13.aFloat12 + local13.aFloat14 * local22.aFloat11;
			Static381.aFloat81 = local22.aFloat11 * local13.aFloat10 + local13.aFloat5 * local22.aFloat10 + local22.aFloat14 * local13.aFloat15;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort56 + this.aShort63 >> 1;
			@Pc(510) int local510 = this.aShort60 + this.aShort55 >> 1;
			@Pc(529) int local529 = (int) ((float) local510 * Static381.aFloat81 + (float) this.aShort62 * Static103.aFloat32 + (float) local501 * Static382.aFloat89 + Static236.aFloat83);
			@Pc(548) int local548 = (int) ((float) local501 * Static317.aFloat65 + Static62.aFloat30 + Static433.aFloat94 * (float) this.aShort62 + (float) local510 * Static96.aFloat31);
			@Pc(567) int local567 = (int) ((float) local510 * Static26.aFloat68 + (float) this.aShort62 * Static411.aFloat91 + Static44.aFloat23 + (float) local501 * Static357.aFloat86);
			if (this.aClass109_Sub1_35.anInt2989 <= local567) {
				arg1.anInt4794 = local529 * this.aClass109_Sub1_35.anInt2986 / local567 + this.aClass109_Sub1_35.anInt3015;
				arg1.anInt4797 = this.aClass109_Sub1_35.anInt2992 * local548 / local567 + this.aClass109_Sub1_35.anInt3016;
			} else {
				local491 = true;
			}
			@Pc(625) int local625 = (int) ((float) local510 * Static381.aFloat81 + (float) this.aShort59 * Static103.aFloat32 + Static382.aFloat89 * (float) local501 + Static236.aFloat83);
			@Pc(644) int local644 = (int) (Static317.aFloat65 * (float) local501 + Static62.aFloat30 + Static433.aFloat94 * (float) this.aShort59 + (float) local510 * Static96.aFloat31);
			@Pc(663) int local663 = (int) (Static26.aFloat68 * (float) local510 + Static44.aFloat23 + Static357.aFloat86 * (float) local501 + (float) this.aShort59 * Static411.aFloat91);
			if (this.aClass109_Sub1_35.anInt2989 <= local663) {
				arg1.anInt4793 = this.aClass109_Sub1_35.anInt3015 + this.aClass109_Sub1_35.anInt2986 * local625 / local663;
				arg1.anInt4795 = this.aClass109_Sub1_35.anInt3016 + this.aClass109_Sub1_35.anInt2992 * local644 / local663;
			} else {
				local491 = true;
			}
			if (local491) {
				if (local567 < this.aClass109_Sub1_35.anInt2989 && this.aClass109_Sub1_35.anInt2989 > local663) {
					local493 = false;
				} else {
					@Pc(737) int local737;
					@Pc(748) int local748;
					@Pc(775) int local775;
					if (local567 < this.aClass109_Sub1_35.anInt2989) {
						local737 = (local663 - this.aClass109_Sub1_35.anInt2989 << 16) / (local663 - local567);
						local748 = (local737 * (local625 - local529) >> 16) + local625;
						arg1.anInt4794 = local748 * this.aClass109_Sub1_35.anInt2986 / this.aClass109_Sub1_35.anInt2989 + this.aClass109_Sub1_35.anInt3015;
						local775 = local644 + ((local644 - local548) * local737 >> 16);
						arg1.anInt4797 = local775 * this.aClass109_Sub1_35.anInt2992 / this.aClass109_Sub1_35.anInt2989 + this.aClass109_Sub1_35.anInt3016;
					} else if (local663 < this.aClass109_Sub1_35.anInt2989) {
						local737 = (local567 - this.aClass109_Sub1_35.anInt2989 << 16) / (local567 - local663);
						local748 = local529 + (local737 * (local529 - local625) >> 16);
						arg1.anInt4794 = this.aClass109_Sub1_35.anInt3015 + local748 * this.aClass109_Sub1_35.anInt2986 / this.aClass109_Sub1_35.anInt2989;
						local775 = local548 + ((local548 - local644) * local737 >> 16);
						arg1.anInt4797 = local775 * this.aClass109_Sub1_35.anInt2992 / this.aClass109_Sub1_35.anInt2989 + this.aClass109_Sub1_35.anInt3016;
					}
				}
			}
			if (local493) {
				if (local663 < local567) {
					arg1.anInt4796 = (local529 + this.aShort61) * this.aClass109_Sub1_35.anInt2986 / local567 + this.aClass109_Sub1_35.anInt3015 - arg1.anInt4794;
				} else {
					arg1.anInt4796 = this.aClass109_Sub1_35.anInt2986 * (local625 + this.aShort61) / local663 + this.aClass109_Sub1_35.anInt3015 - arg1.anInt4793;
				}
				arg1.aBoolean325 = true;
			}
		}
		this.aClass109_Sub1_35.method2554();
		this.aClass109_Sub1_35.method2544(local22);
		this.method4204();
		this.aClass109_Sub1_35.method2541();
		this.method4207();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIBS)I")
	private int method4202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3) {
		@Pc(17) int local17 = Static389.anIntArray561[Static233.method3450(arg0, arg1)];
		if (arg3 != -1) {
			@Pc(30) Class151 local30 = this.aClass109_Sub1_35.anInterface7_9.method4836(arg3 & 0xFFFF);
			@Pc(35) int local35 = local30.aByte53 & 0xFF;
			@Pc(49) int local49;
			@Pc(73) int local73;
			if (local35 != 0) {
				if (arg1 < 0) {
					local49 = 0;
				} else if (arg1 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg1 * 131586;
				}
				if (local35 == 256) {
					local17 = local49;
				} else {
					local73 = 256 - local35;
					local17 = ((local17 & 0xFF00) * local73 + (local49 & 0xFF00) * local35 & 0xFF0000) + (local73 * (local17 & 0xFF00FF) + local35 * (local49 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local49 = local30.aByte51 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(122) int local122 = (local17 >> 16 & 0xFF) * local49;
				if (local122 > 65535) {
					local122 = 65535;
				}
				local73 = local49 * (local17 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(148) int local148 = (local17 & 0xFF) * local49;
				if (local148 > 65535) {
					local148 = 65535;
				}
				local17 = (local148 >> 8) + ((local122 & 0xD600FF00) << 8) + (local73 & 0xFF00);
			}
		}
		return (local17 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "()I")
	@Override
	public int b() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort62;
	}

	@OriginalMember(owner = "client!or", name = "oa", descriptor = "(I)V")
	@Override
	public void oa(@OriginalArg(0) int arg0) {
		this.aShort58 = (short) arg0;
		if (this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
		}
		if (this.aClass58_10 != null) {
			this.aClass58_10.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
	private void method4204() {
		if (this.anInt5175 == 0) {
			return;
		}
		if (this.aByte60 != 0) {
			this.method4213(true);
		}
		this.method4213(false);
		if (this.aClass197_1 != null) {
			if (this.aClass197_1.anInterface8_4 == null) {
				this.method4209((this.aByte60 & 0x10) != 0);
			}
			if (this.aClass197_1.anInterface8_4 != null) {
				this.aClass109_Sub1_35.method2599(this.aClass58_10 != null);
				this.aClass109_Sub1_35.method2605(this.aClass58_9, this.aClass58_11, this.aClass58_12, this.aClass58_10);
				@Pc(74) int local74 = this.anIntArray413.length - 1;
				for (@Pc(76) int local76 = 0; local76 < local74; local76++) {
					@Pc(83) int local83 = this.anIntArray413[local76];
					@Pc(90) int local90 = this.anIntArray413[local76 + 1];
					@Pc(97) int local97 = this.aShortArray71[local83] & 0xFFFF;
					if (local97 == 65535) {
						local97 = -1;
					}
					this.aClass109_Sub1_35.method2583(local97, this.aClass58_10 != null);
					this.aClass109_Sub1_35.method2586(local83 * 3, (local90 - local83) * 3, this.aClass197_1.anInterface8_4);
				}
			}
		}
		this.method4201();
	}

	@OriginalMember(owner = "client!or", name = "WA", descriptor = "(I)V")
	@Override
	public void WA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4.anIntArray7[arg0];
		@Pc(13) int local13 = Class4.anIntArray6[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5227; local15++) {
			@Pc(33) int local33 = this.anIntArray412[local15] * local13 - this.anIntArray415[local15] * local9 >> 15;
			this.anIntArray415[local15] = this.anIntArray415[local15] * local13 + local9 * this.anIntArray412[local15] >> 15;
			this.anIntArray412[local15] = local33;
		}
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
		this.aBoolean336 = false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!aw;)V")
	private void method4205(@OriginalArg(1) Class18_Sub1 arg0) {
		@Pc(6) int local6;
		if (this.aClass252Array2 != null) {
			for (local6 = 0; local6 < this.aClass252Array2.length; local6++) {
				@Pc(13) Class252 local13 = this.aClass252Array2[local6];
				@Pc(15) Class252 local15 = local13;
				if (local13.aClass252_2 != null) {
					local15 = local13.aClass252_2;
				}
				local15.anInt7344 = (int) (arg0.aFloat4 + arg0.aFloat10 * (float) this.anIntArray415[local13.anInt7339] + arg0.aFloat15 * (float) this.anIntArray412[local13.anInt7339] + arg0.aFloat5 * (float) this.anIntArray414[local13.anInt7339]);
				local15.anInt7335 = (int) (arg0.aFloat6 + arg0.aFloat12 * (float) this.anIntArray414[local13.anInt7339] + (float) this.anIntArray412[local13.anInt7339] * arg0.aFloat13 + arg0.aFloat14 * (float) this.anIntArray415[local13.anInt7339]);
				local15.anInt7337 = (int) (arg0.aFloat8 + arg0.aFloat7 * (float) this.anIntArray412[local13.anInt7339] + arg0.aFloat9 * (float) this.anIntArray414[local13.anInt7339] + arg0.aFloat11 * (float) this.anIntArray415[local13.anInt7339]);
				local15.anInt7331 = (int) ((float) this.anIntArray415[local13.anInt7338] * arg0.aFloat10 + (float) this.anIntArray412[local13.anInt7338] * arg0.aFloat15 + (float) this.anIntArray414[local13.anInt7338] * arg0.aFloat5 + arg0.aFloat4);
				local15.anInt7343 = (int) ((float) this.anIntArray415[local13.anInt7338] * arg0.aFloat14 + arg0.aFloat12 * (float) this.anIntArray414[local13.anInt7338] + (float) this.anIntArray412[local13.anInt7338] * arg0.aFloat13 + arg0.aFloat6);
				local15.anInt7342 = (int) (arg0.aFloat8 + (float) this.anIntArray414[local13.anInt7338] * arg0.aFloat9 + (float) this.anIntArray412[local13.anInt7338] * arg0.aFloat7 + arg0.aFloat11 * (float) this.anIntArray415[local13.anInt7338]);
				local15.anInt7340 = (int) (arg0.aFloat10 * (float) this.anIntArray415[local13.anInt7345] + (float) this.anIntArray412[local13.anInt7345] * arg0.aFloat15 + (float) this.anIntArray414[local13.anInt7345] * arg0.aFloat5 + arg0.aFloat4);
				local15.anInt7336 = (int) (arg0.aFloat6 + arg0.aFloat14 * (float) this.anIntArray415[local13.anInt7345] + (float) this.anIntArray414[local13.anInt7345] * arg0.aFloat12 + (float) this.anIntArray412[local13.anInt7345] * arg0.aFloat13);
				local15.anInt7333 = (int) ((float) this.anIntArray415[local13.anInt7345] * arg0.aFloat11 + (float) this.anIntArray414[local13.anInt7345] * arg0.aFloat9 + (float) this.anIntArray412[local13.anInt7345] * arg0.aFloat7 + arg0.aFloat8);
			}
		}
		if (this.aClass122Array2 == null) {
			return;
		}
		for (local6 = 0; local6 < this.aClass122Array2.length; local6++) {
			@Pc(366) Class122 local366 = this.aClass122Array2[local6];
			@Pc(368) Class122 local368 = local366;
			if (local366.aClass122_1 != null) {
				local368 = local366.aClass122_1;
			}
			if (local366.aClass18_4 == null) {
				local366.aClass18_4 = arg0.method4939();
			} else {
				local366.aClass18_4.ba(arg0);
			}
			local368.anInt3362 = (int) (arg0.aFloat10 * (float) this.anIntArray415[local366.anInt3358] + (float) this.anIntArray412[local366.anInt3358] * arg0.aFloat15 + arg0.aFloat5 * (float) this.anIntArray414[local366.anInt3358] + arg0.aFloat4);
			local368.anInt3357 = (int) (arg0.aFloat13 * (float) this.anIntArray412[local366.anInt3358] + (float) this.anIntArray414[local366.anInt3358] * arg0.aFloat12 + (float) this.anIntArray415[local366.anInt3358] * arg0.aFloat14 + arg0.aFloat6);
			local368.anInt3356 = (int) ((float) this.anIntArray415[local366.anInt3358] * arg0.aFloat11 + arg0.aFloat7 * (float) this.anIntArray412[local366.anInt3358] + (float) this.anIntArray414[local366.anInt3358] * arg0.aFloat9 + arg0.aFloat8);
		}
	}

	@OriginalMember(owner = "client!or", name = "xa", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			Static201.anInt3736 = 0;
			Static95.anInt1787 = 0;
			Static273.anInt4871 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray146.length) {
					local48 = this.anIntArrayArray146[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static95.anInt1787 += this.anIntArray414[local56];
						Static273.anInt4871 += this.anIntArray412[local56];
						Static201.anInt3736 += this.anIntArray415[local56];
						local30++;
					}
				}
			}
			if (local30 <= 0) {
				Static201.anInt3736 = local18;
				Static95.anInt1787 = local22;
				Static273.anInt4871 = local14;
			} else {
				Static201.anInt3736 = Static201.anInt3736 / local30 + local18;
				Static273.anInt4871 = local14 + Static273.anInt4871 / local30;
				Static95.anInt1787 = local22 + Static95.anInt1787 / local30;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local14 = arg3 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray146.length) {
					local157 = this.anIntArrayArray146[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local50 = local157[local159];
						this.anIntArray414[local50] += local22;
						this.anIntArray412[local50] += local14;
						this.anIntArray415[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(749) int local749;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray146.length > local32) {
					local157 = this.anIntArrayArray146[local32];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							this.anIntArray414[local50] -= Static95.anInt1787;
							this.anIntArray412[local50] -= Static273.anInt4871;
							this.anIntArray415[local50] -= Static201.anInt3736;
							if (arg4 != 0) {
								local56 = Class4.anIntArray7[arg4];
								local274 = Class4.anIntArray6[arg4];
								local292 = this.anIntArray412[local50] * local56 + local274 * this.anIntArray414[local50] + 32767 >> 15;
								this.anIntArray412[local50] = local274 * this.anIntArray412[local50] + 32767 - local56 * this.anIntArray414[local50] >> 15;
								this.anIntArray414[local50] = local292;
							}
							if (arg2 != 0) {
								local56 = Class4.anIntArray7[arg2];
								local274 = Class4.anIntArray6[arg2];
								local292 = local274 * this.anIntArray412[local50] + 32767 - local56 * this.anIntArray415[local50] >> 15;
								this.anIntArray415[local50] = this.anIntArray412[local50] * local56 + this.anIntArray415[local50] * local274 + 32767 >> 15;
								this.anIntArray412[local50] = local292;
							}
							if (arg3 != 0) {
								local56 = Class4.anIntArray7[arg3];
								local274 = Class4.anIntArray6[arg3];
								local292 = this.anIntArray414[local50] * local274 + this.anIntArray415[local50] * local56 + 32767 >> 15;
								this.anIntArray415[local50] = local274 * this.anIntArray415[local50] + 32767 - local56 * this.anIntArray414[local50] >> 15;
								this.anIntArray414[local50] = local292;
							}
							this.anIntArray414[local50] += Static95.anInt1787;
							this.anIntArray412[local50] += Static273.anInt4871;
							this.anIntArray415[local50] += Static201.anInt3736;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							this.anIntArray414[local50] -= Static95.anInt1787;
							this.anIntArray412[local50] -= Static273.anInt4871;
							this.anIntArray415[local50] -= Static201.anInt3736;
							if (arg2 != 0) {
								local56 = Class4.anIntArray7[arg2];
								local274 = Class4.anIntArray6[arg2];
								local292 = local274 * this.anIntArray412[local50] + 32767 - this.anIntArray415[local50] * local56 >> 15;
								this.anIntArray415[local50] = this.anIntArray415[local50] * local274 + local56 * this.anIntArray412[local50] + 32767 >> 15;
								this.anIntArray412[local50] = local292;
							}
							if (arg4 != 0) {
								local56 = Class4.anIntArray7[arg4];
								local274 = Class4.anIntArray6[arg4];
								local292 = local274 * this.anIntArray414[local50] + this.anIntArray412[local50] * local56 + 32767 >> 15;
								this.anIntArray412[local50] = this.anIntArray412[local50] * local274 + 32767 - this.anIntArray414[local50] * local56 >> 15;
								this.anIntArray414[local50] = local292;
							}
							if (arg3 != 0) {
								local56 = Class4.anIntArray7[arg3];
								local274 = Class4.anIntArray6[arg3];
								local292 = this.anIntArray414[local50] * local274 + this.anIntArray415[local50] * local56 + 32767 >> 15;
								this.anIntArray415[local50] = this.anIntArray415[local50] * local274 + 32767 - this.anIntArray414[local50] * local56 >> 15;
								this.anIntArray414[local50] = local292;
							}
							this.anIntArray414[local50] += Static95.anInt1787;
							this.anIntArray412[local50] += Static273.anInt4871;
							this.anIntArray415[local50] += Static201.anInt3736;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray146.length) {
						local48 = this.anIntArrayArray146[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local274 = this.anIntArray411[local56];
							local292 = this.anIntArray411[local56 + 1];
							for (local749 = local274; local749 < local292; local749++) {
								@Pc(758) int local758 = this.aShortArray69[local749] - 1;
								if (local758 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class4.anIntArray7[arg4];
									local774 = Class4.anIntArray6[arg4];
									local792 = local770 * this.aShortArray64[local758] + local774 * this.aShortArray65[local758] + 32767 >> 15;
									this.aShortArray64[local758] = (short) (local774 * this.aShortArray64[local758] + 32767 - local770 * this.aShortArray65[local758] >> 15);
									this.aShortArray65[local758] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class4.anIntArray7[arg2];
									local774 = Class4.anIntArray6[arg2];
									local792 = this.aShortArray64[local758] * local774 + 32767 - this.aShortArray63[local758] * local770 >> 15;
									this.aShortArray63[local758] = (short) (this.aShortArray64[local758] * local770 + local774 * this.aShortArray63[local758] + 32767 >> 15);
									this.aShortArray64[local758] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class4.anIntArray7[arg3];
									local774 = Class4.anIntArray6[arg3];
									local792 = this.aShortArray65[local758] * local774 + local770 * this.aShortArray63[local758] + 32767 >> 15;
									this.aShortArray63[local758] = (short) (this.aShortArray63[local758] * local774 + 32767 - local770 * this.aShortArray65[local758] >> 15);
									this.aShortArray65[local758] = (short) local792;
								}
							}
						}
					}
				}
				if (this.aClass58_10 == null && this.aClass58_12 != null) {
					this.aClass58_12.anInterface1_1 = null;
				}
				if (this.aClass58_10 != null) {
					this.aClass58_10.anInterface1_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray146.length) {
					local157 = this.anIntArrayArray146[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local50 = local157[local159];
						this.anIntArray414[local50] -= Static95.anInt1787;
						this.anIntArray412[local50] -= Static273.anInt4871;
						this.anIntArray415[local50] -= Static201.anInt3736;
						this.anIntArray414[local50] = this.anIntArray414[local50] * arg2 >> 7;
						this.anIntArray412[local50] = arg3 * this.anIntArray412[local50] >> 7;
						this.anIntArray415[local50] = this.anIntArray415[local50] * arg4 >> 7;
						this.anIntArray414[local50] += Static95.anInt1787;
						this.anIntArray412[local50] += Static273.anInt4871;
						this.anIntArray415[local50] += Static201.anInt3736;
					}
				}
			}
		} else {
			@Pc(1201) Class156 local1201;
			@Pc(1206) Class175 local1206;
			if (arg0 == 5) {
				if (this.anIntArrayArray145 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray145.length > local32) {
							local157 = this.anIntArrayArray145[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local50 = local157[local159];
								local56 = arg2 * 8 + (this.aByteArray68[local50] & 0xFF);
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray68[local50] = (byte) local56;
							}
							if (local157.length > 0 && this.aClass58_12 != null) {
								this.aClass58_12.anInterface1_1 = null;
							}
						}
					}
					if (this.aClass156Array1 != null) {
						for (local32 = 0; local32 < this.anInt5189; local32++) {
							local1201 = this.aClass156Array1[local32];
							local1206 = this.aClass175Array1[local32];
							local1206.anInt4950 = 255 - (this.aByteArray68[local1201.anInt4482] & 0xFF) << 24 | local1206.anInt4950 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1454) Class175 local1454;
				if (arg0 == 8) {
					if (this.anIntArrayArray144 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray144.length > local32) {
								local157 = this.anIntArrayArray144[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1454 = this.aClass175Array1[local157[local159]];
									local1454.anInt4951 += arg3;
									local1454.anInt4954 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray144 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray144.length > local32) {
								local157 = this.anIntArrayArray144[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1454 = this.aClass175Array1[local157[local159]];
									local1454.anInt4955 = arg3 * local1454.anInt4955 >> 7;
									local1454.anInt4953 = local1454.anInt4953 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray144 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray144.length) {
							local157 = this.anIntArrayArray144[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1454 = this.aClass175Array1[local157[local159]];
								local1454.anInt4952 = local1454.anInt4952 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray145 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray145.length > local32) {
						local157 = this.anIntArrayArray145[local32];
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							local56 = this.aShortArray72[local50] & 0xFFFF;
							local274 = local56 >> 10 & 0x3F;
							local292 = local56 >> 7 & 0x7;
							@Pc(1298) int local1298 = arg2 + local274 & 0x3F;
							local292 += arg3 / 4;
							local749 = local56 & 0x7F;
							if (local292 < 0) {
								local292 = 0;
							} else if (local292 > 7) {
								local292 = 7;
							}
							local749 += arg4;
							if (local749 < 0) {
								local749 = 0;
							} else if (local749 > 127) {
								local749 = 127;
							}
							this.aShortArray72[local50] = (short) (local1298 << 10 | local292 << 7 | local749);
						}
						if (local157.length > 0 && this.aClass58_12 != null) {
							this.aClass58_12.anInterface1_1 = null;
						}
					}
				}
				if (this.aClass156Array1 != null) {
					for (local32 = 0; local32 < this.anInt5189; local32++) {
						local1201 = this.aClass156Array1[local32];
						local1206 = this.aClass175Array1[local32];
						local1206.anInt4950 = Static389.anIntArray561[this.aShortArray72[local1201.anInt4482] & 0xFFFF] & 0xFFFFFF | local1206.anInt4950 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "W", descriptor = "()V")
	@Override
	protected void W() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5195; local7++) {
			this.anIntArray414[local7] = this.anIntArray414[local7] + 7 >> 4;
			this.anIntArray412[local7] = this.anIntArray412[local7] + 7 >> 4;
			this.anIntArray415[local7] = this.anIntArray415[local7] + 7 >> 4;
		}
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
		this.aBoolean336 = false;
	}

	@OriginalMember(owner = "client!or", name = "X", descriptor = "()I")
	@Override
	public int X() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort60;
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "()[Lclient!it;")
	@Override
	public Class122[] method4232() {
		return this.aClass122Array2;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5204; local7++) {
			local16 = this.aShortArray72[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(60) int local60 = local16 & 0x7F;
			if (arg2 != -1) {
				local60 += (arg2 - local60) * arg3 >> 7;
			}
			this.aShortArray72[local7] = (short) (local60 | local22 << 10 | local28 << 7);
		}
		if (this.aClass156Array1 != null) {
			for (local16 = 0; local16 < this.anInt5189; local16++) {
				@Pc(105) Class156 local105 = this.aClass156Array1[local16];
				@Pc(110) Class175 local110 = this.aClass175Array1[local16];
				local110.anInt4950 = Static389.anIntArray561[this.aShortArray72[local105.anInt4482] & 0xFFFF] & 0xFFFFFF | local110.anInt4950 & 0xFF000000;
			}
		}
		if (this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "()Z")
	@Override
	public boolean method4238() {
		if (this.aShortArray71 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray71.length; local12++) {
			if (this.aShortArray71[local12] != -1 && !this.aClass109_Sub1_35.anInterface7_9.method4837(this.aShortArray71[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
	private void method4207() {
		if (this.aClass156Array1 == null) {
			return;
		}
		@Pc(12) Class18_Sub1 local12 = this.aClass109_Sub1_35.aClass18_Sub1_2;
		@Pc(16) float local16 = this.aClass109_Sub1_35.w();
		@Pc(20) float local20 = this.aClass109_Sub1_35.la();
		this.aClass109_Sub1_35.method2559();
		this.aClass109_Sub1_35.method4733(false);
		this.aClass109_Sub1_35.method2599(false);
		this.aClass109_Sub1_35.method2605(this.aClass109_Sub1_35.aClass58_2, this.aClass109_Sub1_35.aClass58_1, null, null);
		for (@Pc(47) int local47 = 0; local47 < this.anInt5189; local47++) {
			@Pc(54) Class156 local54 = this.aClass156Array1[local47];
			@Pc(59) Class175 local59 = this.aClass175Array1[local47];
			if (!local54.aBoolean307 || !this.aClass109_Sub1_35.method4687()) {
				@Pc(87) float local87 = (float) (this.anIntArray414[local54.anInt4485] + this.anIntArray414[local54.anInt4484] + this.anIntArray414[local54.anInt4481]) * 0.3333333F;
				@Pc(109) float local109 = (float) (this.anIntArray412[local54.anInt4481] + this.anIntArray412[local54.anInt4484] + this.anIntArray412[local54.anInt4485]) * 0.3333333F;
				@Pc(131) float local131 = (float) (this.anIntArray415[local54.anInt4485] + this.anIntArray415[local54.anInt4481] + this.anIntArray415[local54.anInt4484]) * 0.3333333F;
				@Pc(145) float local145 = Static236.aFloat83 + Static381.aFloat81 * local131 + local87 * Static382.aFloat89 + Static103.aFloat32 * local109;
				@Pc(159) float local159 = Static62.aFloat30 + Static96.aFloat31 * local131 + local87 * Static317.aFloat65 + local109 * Static433.aFloat94;
				@Pc(173) float local173 = local109 * Static411.aFloat91 + Static357.aFloat86 * local87 + local131 * Static26.aFloat68 + Static44.aFloat23;
				local12.method430((float) local59.anInt4951 - local159, -local173, local59.anInt4952, local59.anInt4955 * local54.aShort50 >> 7, local145 + (float) local59.anInt4954, local54.aShort52 * local59.anInt4953 >> 7);
				this.aClass109_Sub1_35.method2606(local12);
				this.aClass109_Sub1_35.o(local20, local16 - (float) local54.anInt4479 * 1.5F);
				@Pc(224) int local224 = local59.anInt4950;
				OpenGL.glColor4ub((byte) (local224 >> 16), (byte) (local224 >> 8), (byte) local224, (byte) (local224 >> 24));
				this.aClass109_Sub1_35.method2532(local54.aShort51);
				this.aClass109_Sub1_35.method2522(local54.aByte58);
				this.aClass109_Sub1_35.method2531(local54.aByte57);
				this.aClass109_Sub1_35.method2567(4);
			}
		}
		this.aClass109_Sub1_35.o(local20, local16);
		this.aClass109_Sub1_35.method4733(true);
		this.aClass109_Sub1_35.method2541();
	}

	@OriginalMember(owner = "client!or", name = "sa", descriptor = "()V")
	@Override
	public void sa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5227; local3++) {
			this.anIntArray415[local3] = -this.anIntArray415[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5213; local25++) {
			this.aShortArray63[local25] = (short) -this.aShortArray63[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5204; local44++) {
			@Pc(51) short local51 = this.aShortArray68[local44];
			this.aShortArray68[local44] = this.aShortArray62[local44];
			this.aShortArray62[local44] = local51;
		}
		if (this.aClass58_10 == null && this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
		}
		if (this.aClass58_10 != null) {
			this.aClass58_10.anInterface1_1 = null;
		}
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
		if (this.aClass197_1 != null) {
			this.aClass197_1.anInterface8_4 = null;
		}
		this.aBoolean336 = false;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	private void method4208() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5227; local23++) {
			@Pc(30) int local30 = this.anIntArray414[local23];
			@Pc(35) int local35 = this.anIntArray412[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(72) int local72 = this.anIntArray415[local23];
			if (local17 < local72) {
				local17 = local72;
			}
			if (local72 < local11) {
				local11 = local72;
			}
			@Pc(98) int local98 = local72 * local72 + local30 * local30;
			if (local98 > local19) {
				local19 = local98;
			}
			local98 = local35 * local35 + local30 * local30 + local72 * local72;
			if (local98 > local21) {
				local21 = local98;
			}
		}
		this.aShort60 = (short) local11;
		this.aShort55 = (short) local17;
		this.aShort62 = (short) local9;
		this.aShort59 = (short) local15;
		this.aShort56 = (short) local13;
		this.aShort63 = (short) local7;
		this.aShort61 = (short) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean336 = true;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BZ)V")
	private void method4209(@OriginalArg(1) boolean arg0) {
		if (this.anInt5175 * 6 <= Static408.aClass1_Sub1_Sub2_3.aByteArray66.length) {
			Static408.aClass1_Sub1_Sub2_3.anInt5056 = 0;
		} else {
			Static408.aClass1_Sub1_Sub2_3 = new Class1_Sub1_Sub2(this.anInt5175 * 6 + 600);
		}
		@Pc(42) int local42;
		if (this.aClass109_Sub1_35.aBoolean163) {
			for (local42 = 0; local42 < this.anInt5175; local42++) {
				Static408.aClass1_Sub1_Sub2_3.method4101(this.aShortArray68[local42]);
				Static408.aClass1_Sub1_Sub2_3.method4101(this.aShortArray67[local42]);
				Static408.aClass1_Sub1_Sub2_3.method4101(this.aShortArray62[local42]);
			}
		} else {
			for (local42 = 0; local42 < this.anInt5175; local42++) {
				Static408.aClass1_Sub1_Sub2_3.method4146(this.aShortArray68[local42]);
				Static408.aClass1_Sub1_Sub2_3.method4146(this.aShortArray67[local42]);
				Static408.aClass1_Sub1_Sub2_3.method4146(this.aShortArray62[local42]);
			}
		}
		if (Static408.aClass1_Sub1_Sub2_3.anInt5056 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface8_3 == null) {
				this.anInterface8_3 = this.aClass109_Sub1_35.method2568(Static408.aClass1_Sub1_Sub2_3.anInt5056, Static408.aClass1_Sub1_Sub2_3.aByteArray66, true);
			} else {
				this.anInterface8_3.method5609(Static408.aClass1_Sub1_Sub2_3.aByteArray66, Static408.aClass1_Sub1_Sub2_3.anInt5056);
			}
			this.aClass197_1.anInterface8_4 = this.anInterface8_3;
		} else {
			this.aClass197_1.anInterface8_4 = this.aClass109_Sub1_35.method2568(Static408.aClass1_Sub1_Sub2_3.anInt5056, Static408.aClass1_Sub1_Sub2_3.aByteArray66, false);
		}
		if (!arg0) {
			this.aBoolean337 = true;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZLclient!or;ILclient!or;Z)Lclient!c;")
	private Class37 method4210(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class37_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class37_Sub2 arg3, @OriginalArg(5) boolean arg4) {
		arg1.anInt5215 = this.anInt5215;
		arg1.aByte60 = 0;
		arg1.anInt5213 = this.anInt5213;
		arg1.anInt5175 = this.anInt5175;
		arg1.anInt5227 = this.anInt5227;
		arg1.aShort58 = this.aShort58;
		arg1.anInt5214 = arg2;
		arg1.anInt5195 = this.anInt5195;
		arg1.anInt5204 = this.anInt5204;
		arg1.aShort57 = this.aShort57;
		arg1.anInt5189 = this.anInt5189;
		@Pc(53) boolean local53 = Static108.method1668(arg2, this.anInt5215);
		@Pc(59) boolean local59 = Static147.method2220(arg2, this.anInt5215);
		@Pc(65) boolean local65 = Static396.method5371(arg2, this.anInt5215);
		@Pc(71) boolean local71 = local53 | local59 | local65;
		@Pc(192) int local192;
		if (local71) {
			if (!local53) {
				arg1.anIntArray414 = this.anIntArray414;
			} else if (arg3.anIntArray414 == null || arg3.anIntArray414.length < this.anInt5195) {
				arg1.anIntArray414 = arg3.anIntArray414 = new int[this.anInt5195];
			} else {
				arg1.anIntArray414 = arg3.anIntArray414;
			}
			if (!local59) {
				arg1.anIntArray412 = this.anIntArray412;
			} else if (arg3.anIntArray412 == null || this.anInt5195 > arg3.anIntArray412.length) {
				arg1.anIntArray412 = arg3.anIntArray412 = new int[this.anInt5195];
			} else {
				arg1.anIntArray412 = arg3.anIntArray412;
			}
			if (!local65) {
				arg1.anIntArray415 = this.anIntArray415;
			} else if (arg3.anIntArray415 == null || this.anInt5195 > arg3.anIntArray415.length) {
				arg1.anIntArray415 = arg3.anIntArray415 = new int[this.anInt5195];
			} else {
				arg1.anIntArray415 = arg3.anIntArray415;
			}
			for (local192 = 0; local192 < this.anInt5195; local192++) {
				if (local53) {
					arg1.anIntArray414[local192] = this.anIntArray414[local192];
				}
				if (local59) {
					arg1.anIntArray412[local192] = this.anIntArray412[local192];
				}
				if (local65) {
					arg1.anIntArray415[local192] = this.anIntArray415[local192];
				}
			}
		} else {
			arg1.anIntArray415 = this.anIntArray415;
			arg1.anIntArray412 = this.anIntArray412;
			arg1.anIntArray414 = this.anIntArray414;
		}
		if (Static243.method3589(arg2, this.anInt5215)) {
			if (arg4) {
				arg1.aByte60 = (byte) (arg1.aByte60 | 0x1);
			}
			arg1.aClass58_11 = arg3.aClass58_11;
			arg1.aClass58_11.aByte11 = this.aClass58_11.aByte11;
			arg1.aClass58_11.anInterface1_1 = this.aClass58_11.anInterface1_1;
		} else if (Static412.method5565(arg2, this.anInt5215)) {
			arg1.aClass58_11 = this.aClass58_11;
		} else {
			arg1.aClass58_11 = null;
		}
		if (Static268.method4072(this.anInt5215, arg2)) {
			if (arg3.aShortArray72 == null || this.anInt5204 > arg3.aShortArray72.length) {
				arg1.aShortArray72 = arg3.aShortArray72 = new short[this.anInt5204];
			} else {
				arg1.aShortArray72 = arg3.aShortArray72;
			}
			for (local192 = 0; local192 < this.anInt5204; local192++) {
				arg1.aShortArray72[local192] = this.aShortArray72[local192];
			}
		} else {
			arg1.aShortArray72 = this.aShortArray72;
		}
		if (Static269.method3932(arg2, this.anInt5215)) {
			if (arg3.aByteArray68 == null || arg3.aByteArray68.length < this.anInt5204) {
				arg1.aByteArray68 = arg3.aByteArray68 = new byte[this.anInt5204];
			} else {
				arg1.aByteArray68 = arg3.aByteArray68;
			}
			for (local192 = 0; local192 < this.anInt5204; local192++) {
				arg1.aByteArray68[local192] = this.aByteArray68[local192];
			}
		} else {
			arg1.aByteArray68 = this.aByteArray68;
		}
		if (Static161.method2443(arg2, this.anInt5215)) {
			if (arg4) {
				arg1.aByte60 = (byte) (arg1.aByte60 | 0x2);
			}
			arg1.aClass58_12 = arg3.aClass58_12;
			arg1.aClass58_12.anInterface1_1 = this.aClass58_12.anInterface1_1;
			arg1.aClass58_12.aByte11 = this.aClass58_12.aByte11;
		} else if (Static127.method2923(arg2, this.anInt5215)) {
			arg1.aClass58_12 = this.aClass58_12;
		} else {
			arg1.aClass58_12 = null;
		}
		@Pc(541) int local541;
		if (Static383.method5219(arg2, this.anInt5215)) {
			if (arg3.aShortArray65 == null || arg3.aShortArray65.length < this.anInt5213) {
				local192 = this.anInt5213;
				arg1.aShortArray64 = arg3.aShortArray64 = new short[local192];
				arg1.aShortArray65 = arg3.aShortArray65 = new short[local192];
				arg1.aShortArray63 = arg3.aShortArray63 = new short[local192];
			} else {
				arg1.aShortArray64 = arg3.aShortArray64;
				arg1.aShortArray63 = arg3.aShortArray63;
				arg1.aShortArray65 = arg3.aShortArray65;
			}
			if (this.aClass34_1 == null) {
				for (local192 = 0; local192 < this.anInt5213; local192++) {
					arg1.aShortArray65[local192] = this.aShortArray65[local192];
					arg1.aShortArray64[local192] = this.aShortArray64[local192];
					arg1.aShortArray63[local192] = this.aShortArray63[local192];
				}
			} else {
				if (arg3.aClass34_1 == null) {
					arg3.aClass34_1 = new Class34();
				}
				@Pc(529) Class34 local529 = arg1.aClass34_1 = arg3.aClass34_1;
				if (local529.aShortArray11 == null || local529.aShortArray11.length < this.anInt5213) {
					local541 = this.anInt5213;
					local529.aShortArray12 = new short[local541];
					local529.aByteArray14 = new byte[local541];
					local529.aShortArray10 = new short[local541];
					local529.aShortArray11 = new short[local541];
				}
				for (local541 = 0; local541 < this.anInt5213; local541++) {
					arg1.aShortArray65[local541] = this.aShortArray65[local541];
					arg1.aShortArray64[local541] = this.aShortArray64[local541];
					arg1.aShortArray63[local541] = this.aShortArray63[local541];
					local529.aShortArray11[local541] = this.aClass34_1.aShortArray11[local541];
					local529.aShortArray10[local541] = this.aClass34_1.aShortArray10[local541];
					local529.aShortArray12[local541] = this.aClass34_1.aShortArray12[local541];
					local529.aByteArray14[local541] = this.aClass34_1.aByteArray14[local541];
				}
			}
			arg1.aByteArray69 = this.aByteArray69;
		} else {
			arg1.aByteArray69 = this.aByteArray69;
			arg1.aShortArray64 = this.aShortArray64;
			arg1.aShortArray65 = this.aShortArray65;
			arg1.aClass34_1 = this.aClass34_1;
			arg1.aShortArray63 = this.aShortArray63;
		}
		if (Static349.method1151(arg2, this.anInt5215)) {
			arg1.aClass58_10 = arg3.aClass58_10;
			if (arg4) {
				arg1.aByte60 = (byte) (arg1.aByte60 | 0x4);
			}
			arg1.aClass58_10.anInterface1_1 = this.aClass58_10.anInterface1_1;
			arg1.aClass58_10.aByte11 = this.aClass58_10.aByte11;
		} else if (Static226.method3405(this.anInt5215, arg2)) {
			arg1.aClass58_10 = this.aClass58_10;
		} else {
			arg1.aClass58_10 = null;
		}
		if (Static428.method5727(arg2, this.anInt5215)) {
			if (arg3.aFloatArray26 == null || arg3.aFloatArray26.length < this.anInt5204) {
				local192 = this.anInt5213;
				arg1.aFloatArray27 = arg3.aFloatArray27 = new float[local192];
				arg1.aFloatArray26 = arg3.aFloatArray26 = new float[local192];
			} else {
				arg1.aFloatArray27 = arg3.aFloatArray27;
				arg1.aFloatArray26 = arg3.aFloatArray26;
			}
			for (local192 = 0; local192 < this.anInt5213; local192++) {
				arg1.aFloatArray26[local192] = this.aFloatArray26[local192];
				arg1.aFloatArray27[local192] = this.aFloatArray27[local192];
			}
		} else {
			arg1.aFloatArray26 = this.aFloatArray26;
			arg1.aFloatArray27 = this.aFloatArray27;
		}
		if (Static300.method4296(arg2, this.anInt5215)) {
			arg1.aClass58_9 = arg3.aClass58_9;
			if (arg4) {
				arg1.aByte60 = (byte) (arg1.aByte60 | 0x8);
			}
			arg1.aClass58_9.aByte11 = this.aClass58_9.aByte11;
			arg1.aClass58_9.anInterface1_1 = this.aClass58_9.anInterface1_1;
		} else if (Static177.method4487(arg2, this.anInt5215)) {
			arg1.aClass58_9 = this.aClass58_9;
		} else {
			arg1.aClass58_9 = null;
		}
		if (Static133.method1904(this.anInt5215, arg2)) {
			if (arg3.aShortArray68 == null || this.anInt5204 > arg3.aShortArray68.length) {
				local192 = this.anInt5204;
				arg1.aShortArray62 = arg3.aShortArray62 = new short[local192];
				arg1.aShortArray67 = arg3.aShortArray67 = new short[local192];
				arg1.aShortArray68 = arg3.aShortArray68 = new short[local192];
			} else {
				arg1.aShortArray68 = arg3.aShortArray68;
				arg1.aShortArray67 = arg3.aShortArray67;
				arg1.aShortArray62 = arg3.aShortArray62;
			}
			for (local192 = 0; local192 < this.anInt5204; local192++) {
				arg1.aShortArray68[local192] = this.aShortArray68[local192];
				arg1.aShortArray67[local192] = this.aShortArray67[local192];
				arg1.aShortArray62[local192] = this.aShortArray62[local192];
			}
		} else {
			arg1.aShortArray62 = this.aShortArray62;
			arg1.aShortArray67 = this.aShortArray67;
			arg1.aShortArray68 = this.aShortArray68;
		}
		if (Static428.method5726(arg2, this.anInt5215)) {
			if (arg4) {
				arg1.aByte60 = (byte) (arg1.aByte60 | 0x10);
			}
			arg1.aClass197_1 = arg3.aClass197_1;
			arg1.aClass197_1.anInterface8_4 = this.aClass197_1.anInterface8_4;
		} else if (Static289.method4077(arg2, this.anInt5215)) {
			arg1.aClass197_1 = this.aClass197_1;
		} else {
			arg1.aClass197_1 = null;
		}
		if (Static397.method5408(arg2, this.anInt5215)) {
			if (arg3.aShortArray71 == null || arg3.aShortArray71.length < this.anInt5204) {
				local192 = this.anInt5204;
				arg1.aShortArray71 = arg3.aShortArray71 = new short[local192];
			} else {
				arg1.aShortArray71 = arg3.aShortArray71;
			}
			for (local192 = 0; local192 < this.anInt5204; local192++) {
				arg1.aShortArray71[local192] = this.aShortArray71[local192];
			}
		} else {
			arg1.aShortArray71 = this.aShortArray71;
		}
		if (!Static1.method147(this.anInt5215, arg2)) {
			arg1.aClass175Array1 = this.aClass175Array1;
		} else if (arg3.aClass175Array1 == null || this.anInt5189 > arg3.aClass175Array1.length) {
			local192 = this.anInt5189;
			arg1.aClass175Array1 = arg3.aClass175Array1 = new Class175[local192];
			for (local541 = 0; local541 < this.anInt5189; local541++) {
				arg1.aClass175Array1[local541] = this.aClass175Array1[local541].method4022();
			}
		} else {
			arg1.aClass175Array1 = arg3.aClass175Array1;
			for (local192 = 0; local192 < this.anInt5189; local192++) {
				arg1.aClass175Array1[local192].method4024(this.aClass175Array1[local192]);
			}
		}
		if (this.aBoolean336) {
			arg1.aShort59 = this.aShort59;
			arg1.aBoolean336 = true;
			arg1.aShort60 = this.aShort60;
			arg1.aShort55 = this.aShort55;
			arg1.aShort63 = this.aShort63;
			arg1.aShort62 = this.aShort62;
			arg1.aShort61 = this.aShort61;
			arg1.aShort56 = this.aShort56;
		} else {
			arg1.aBoolean336 = false;
		}
		arg1.aClass252Array2 = this.aClass252Array2;
		arg1.aShortArray66 = this.aShortArray66;
		arg1.anIntArray413 = this.anIntArray413;
		arg1.anIntArrayArray144 = this.anIntArrayArray144;
		arg1.aClass122Array2 = this.aClass122Array2;
		arg1.anIntArray411 = this.anIntArray411;
		arg1.aClass156Array1 = this.aClass156Array1;
		arg1.aShortArray70 = this.aShortArray70;
		arg1.aShortArray69 = this.aShortArray69;
		arg1.anIntArrayArray146 = this.anIntArrayArray146;
		arg1.anIntArrayArray145 = this.anIntArrayArray145;
		return arg1;
	}

	@OriginalMember(owner = "client!or", name = "VA", descriptor = "()I")
	@Override
	public int VA() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort56;
	}

	@OriginalMember(owner = "client!or", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		return this.aShort57;
	}

	@OriginalMember(owner = "client!or", name = "va", descriptor = "(I[IIIIZI[I)V")
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
			Static273.anInt4871 = 0;
			Static95.anInt1787 = 0;
			local31 = 0;
			Static201.anInt3736 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray146.length) {
					local55 = this.anIntArrayArray146[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local63]) != 0) {
							Static95.anInt1787 += this.anIntArray414[local63];
							Static273.anInt4871 += this.anIntArray412[local63];
							Static201.anInt3736 += this.anIntArray415[local63];
							local31++;
						}
					}
				}
			}
			if (local31 <= 0) {
				Static201.anInt3736 = arg4;
				Static273.anInt4871 = arg3;
				Static95.anInt1787 = arg2;
			} else {
				Static416.aBoolean465 = true;
				Static201.anInt3736 = arg4 + Static201.anInt3736 / local31;
				Static273.anInt4871 = Static273.anInt4871 / local31 + arg3;
				Static95.anInt1787 = arg2 + Static95.anInt1787 / local31;
			}
			return;
		}
		@Pc(258) int[] local258;
		@Pc(260) int local260;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg4 * arg7[2] + arg2 * arg7[0] + arg7[1] * arg3 + 16384 >> 15;
				local35 = arg7[3] * arg2 + arg3 * arg7[4] + arg7[5] * arg4 + 16384 >> 15;
				local41 = arg4 * arg7[8] + arg2 * arg7[6] + arg7[7] * arg3 + 16384 >> 15;
				arg4 = local41;
				arg3 = local35;
				arg2 = local31;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray146.length > local35) {
					local258 = this.anIntArrayArray146[local35];
					for (local260 = 0; local260 < local258.length; local260++) {
						local57 = local258[local260];
						if (this.aShortArray70 == null || (this.aShortArray70[local57] & arg6) != 0) {
							this.anIntArray414[local57] += arg2;
							this.anIntArray412[local57] += arg3;
							this.anIntArray415[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(379) int local379;
		@Pc(401) int local401;
		@Pc(427) int local427;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(486) int local486;
		@Pc(643) int local643;
		@Pc(668) int local668;
		@Pc(673) int local673;
		@Pc(681) int local681;
		@Pc(686) int local686;
		@Pc(690) int local690;
		@Pc(694) int local694;
		@Pc(696) int local696;
		@Pc(826) int[] local826;
		@Pc(828) int local828;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(838) int local838;
		@Pc(965) int local965;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray146.length) {
						local258 = this.anIntArrayArray146[local35];
						for (local260 = 0; local260 < local258.length; local260++) {
							local57 = local258[local260];
							if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local57]) != 0) {
								this.anIntArray414[local57] -= Static95.anInt1787;
								this.anIntArray412[local57] -= Static273.anInt4871;
								this.anIntArray415[local57] -= Static201.anInt3736;
								if (arg4 != 0) {
									local63 = Class4.anIntArray7[arg4];
									local379 = Class4.anIntArray6[arg4];
									local401 = this.anIntArray414[local57] * local379 + this.anIntArray412[local57] * local63 + 32767 >> 15;
									this.anIntArray412[local57] = local379 * this.anIntArray412[local57] + 32767 - this.anIntArray414[local57] * local63 >> 15;
									this.anIntArray414[local57] = local401;
								}
								if (arg2 != 0) {
									local63 = Class4.anIntArray7[arg2];
									local379 = Class4.anIntArray6[arg2];
									local401 = local379 * this.anIntArray412[local57] + 32767 - this.anIntArray415[local57] * local63 >> 15;
									this.anIntArray415[local57] = this.anIntArray412[local57] * local63 + local379 * this.anIntArray415[local57] + 32767 >> 15;
									this.anIntArray412[local57] = local401;
								}
								if (arg3 != 0) {
									local63 = Class4.anIntArray7[arg3];
									local379 = Class4.anIntArray6[arg3];
									local401 = this.anIntArray415[local57] * local63 + this.anIntArray414[local57] * local379 + 32767 >> 15;
									this.anIntArray415[local57] = local379 * this.anIntArray415[local57] + 32767 - this.anIntArray414[local57] * local63 >> 15;
									this.anIntArray414[local57] = local401;
								}
								this.anIntArray414[local57] += Static95.anInt1787;
								this.anIntArray412[local57] += Static273.anInt4871;
								this.anIntArray415[local57] += Static201.anInt3736;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray146.length) {
							local55 = this.anIntArrayArray146[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local63]) != 0) {
									local379 = this.anIntArray411[local63];
									local401 = this.anIntArray411[local63 + 1];
									for (local427 = local379; local427 < local401; local427++) {
										local458 = this.aShortArray69[local427] - 1;
										if (local458 == -1) {
											break;
										}
										if (arg4 != 0) {
											local462 = Class4.anIntArray7[arg4];
											local466 = Class4.anIntArray6[arg4];
											local470 = this.aShortArray64[local458] * local462 + this.aShortArray65[local458] * local466 + 32767 >> 15;
											this.aShortArray64[local458] = (short) (local466 * this.aShortArray64[local458] + 32767 - local462 * this.aShortArray65[local458] >> 15);
											this.aShortArray65[local458] = (short) local470;
										}
										if (arg2 != 0) {
											local462 = Class4.anIntArray7[arg2];
											local466 = Class4.anIntArray6[arg2];
											local470 = local466 * this.aShortArray64[local458] + 32767 - local462 * this.aShortArray63[local458] >> 15;
											this.aShortArray63[local458] = (short) (this.aShortArray64[local458] * local462 + this.aShortArray63[local458] * local466 + 32767 >> 15);
											this.aShortArray64[local458] = (short) local470;
										}
										if (arg3 != 0) {
											local462 = Class4.anIntArray7[arg3];
											local466 = Class4.anIntArray6[arg3];
											local470 = this.aShortArray65[local458] * local466 + this.aShortArray63[local458] * local462 + 32767 >> 15;
											this.aShortArray63[local458] = (short) (this.aShortArray63[local458] * local466 + 32767 - this.aShortArray65[local458] * local462 >> 15);
											this.aShortArray65[local458] = (short) local470;
										}
									}
								}
							}
						}
					}
					if (this.aClass58_10 == null && this.aClass58_12 != null) {
						this.aClass58_12.anInterface1_1 = null;
					}
					if (this.aClass58_10 != null) {
						this.aClass58_10.anInterface1_1 = null;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local260 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static416.aBoolean465) {
					local379 = Static273.anInt4871 * arg7[3] + Static95.anInt1787 * arg7[0] + arg7[6] * Static201.anInt3736 + 16384 >> 15;
					local401 = Static95.anInt1787 * arg7[1] + Static273.anInt4871 * arg7[4] + arg7[7] * Static201.anInt3736 + 16384 >> 15;
					local401 += local57;
					local427 = Static201.anInt3736 * arg7[8] + arg7[5] * Static273.anInt4871 + arg7[2] * Static95.anInt1787 + 16384 >> 15;
					local379 += local260;
					local427 += local63;
					Static273.anInt4871 = local401;
					Static95.anInt1787 = local379;
					Static201.anInt3736 = local427;
					Static416.aBoolean465 = false;
				}
				@Pc(446) int[] local446 = new int[9];
				local401 = Class4.anIntArray6[arg2];
				local427 = Class4.anIntArray7[arg2];
				local458 = Class4.anIntArray6[arg3];
				local462 = Class4.anIntArray7[arg3];
				local466 = Class4.anIntArray6[arg4];
				local470 = Class4.anIntArray7[arg4];
				local478 = local427 * local466 + 16384 >> 15;
				local486 = local470 * local427 + 16384 >> 15;
				local446[4] = local401 * local466 + 16384 >> 15;
				local446[1] = local470 * -local458 + local478 * local462 + 16384 >> 15;
				local446[5] = -local427;
				local446[2] = local401 * local462 + 16384 >> 15;
				local446[0] = local486 * local462 + local458 * local466 + 16384 >> 15;
				local446[3] = local470 * local401 + 16384 >> 15;
				local446[8] = local458 * local401 + 16384 >> 15;
				local446[7] = local458 * local478 + local462 * local470 + 16384 >> 15;
				local446[6] = local466 * -local462 + local486 * local458 + 16384 >> 15;
				@Pc(617) int local617 = -Static95.anInt1787 * local446[0] + -Static273.anInt4871 * local446[1] + -Static201.anInt3736 * local446[2] + 16384 >> 15;
				local643 = local446[3] * -Static95.anInt1787 + -Static273.anInt4871 * local446[4] + -Static201.anInt3736 * local446[5] + 16384 >> 15;
				local668 = -Static201.anInt3736 * local446[8] + -Static95.anInt1787 * local446[6] + -Static273.anInt4871 * local446[7] + 16384 >> 15;
				local673 = local617 + Static95.anInt1787;
				@Pc(677) int local677 = Static273.anInt4871 + local643;
				local681 = Static201.anInt3736 + local668;
				@Pc(684) int[] local684 = new int[9];
				for (local686 = 0; local686 < 3; local686++) {
					for (local690 = 0; local690 < 3; local690++) {
						local694 = 0;
						for (local696 = 0; local696 < 3; local696++) {
							local694 += local446[local696 + local686 * 3] * arg7[local696 + local690 * 3];
						}
						local684[local686 * 3 + local690] = local694 + 16384 >> 15;
					}
				}
				local690 = local63 * local446[2] + local260 * local446[0] + local446[1] * local57 + 16384 >> 15;
				local694 = local446[5] * local63 + local446[4] * local57 + local260 * local446[3] + 16384 >> 15;
				local696 = local63 * local446[8] + local57 * local446[7] + local446[6] * local260 + 16384 >> 15;
				local694 += local677;
				local690 += local673;
				local696 += local681;
				local826 = new int[9];
				for (local828 = 0; local828 < 3; local828++) {
					for (local832 = 0; local832 < 3; local832++) {
						local836 = 0;
						for (local838 = 0; local838 < 3; local838++) {
							local836 += local684[local838 * 3 + local832] * arg7[local828 * 3 + local838];
						}
						local826[local832 + local828 * 3] = local836 + 16384 >> 15;
					}
				}
				local832 = local696 * arg7[2] + local690 * arg7[0] + local694 * arg7[1] + 16384 >> 15;
				local836 = local690 * arg7[3] + arg7[4] * local694 + local696 * arg7[5] + 16384 >> 15;
				local836 += local35;
				local832 += local31;
				local838 = arg7[8] * local696 + local694 * arg7[7] + arg7[6] * local690 + 16384 >> 15;
				local838 += local41;
				for (local965 = 0; local965 < local8; local965++) {
					@Pc(971) int local971 = arg1[local965];
					if (this.anIntArrayArray146.length > local971) {
						@Pc(985) int[] local985 = this.anIntArrayArray146[local971];
						for (@Pc(987) int local987 = 0; local987 < local985.length; local987++) {
							@Pc(993) int local993 = local985[local987];
							if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local993]) != 0) {
								@Pc(1037) int local1037 = local826[2] * this.anIntArray415[local993] + local826[1] * this.anIntArray412[local993] + local826[0] * this.anIntArray414[local993] + 16384 >> 15;
								@Pc(1070) int local1070 = this.anIntArray414[local993] * local826[3] + local826[4] * this.anIntArray412[local993] + this.anIntArray415[local993] * local826[5] + 16384 >> 15;
								@Pc(1074) int local1074 = local1037 + local832;
								@Pc(1105) int local1105 = local826[7] * this.anIntArray412[local993] + this.anIntArray414[local993] * local826[6] + this.anIntArray415[local993] * local826[8] + 16384 >> 15;
								@Pc(1109) int local1109 = local1070 + local836;
								this.anIntArray414[local993] = local1074;
								@Pc(1118) int local1118 = local1105 + local838;
								this.anIntArray412[local993] = local1109;
								this.anIntArray415[local993] = local1118;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2596) Class156 local2596;
			@Pc(2601) Class175 local2601;
			if (arg0 == 5) {
				if (this.anIntArrayArray145 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray145.length > local35) {
							local258 = this.anIntArrayArray145[local35];
							for (local260 = 0; local260 < local258.length; local260++) {
								local57 = local258[local260];
								if (this.aShortArray66 == null || (this.aShortArray66[local57] & arg6) != 0) {
									local63 = (this.aByteArray68[local57] & 0xFF) + (arg2 * 8);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray68[local57] = (byte) local63;
									if (this.aClass58_12 != null) {
										this.aClass58_12.anInterface1_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass156Array1 != null) {
						for (local35 = 0; local35 < this.anInt5189; local35++) {
							local2596 = this.aClass156Array1[local35];
							local2601 = this.aClass175Array1[local35];
							local2601.anInt4950 = 255 - (this.aByteArray68[local2596.anInt4482] & 0xFF) << 24 | local2601.anInt4950 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2852) Class175 local2852;
				if (arg0 == 8) {
					if (this.anIntArrayArray144 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray144.length) {
								local258 = this.anIntArrayArray144[local35];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2852 = this.aClass175Array1[local258[local260]];
									local2852.anInt4951 += arg3;
									local2852.anInt4954 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray144 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray144.length > local35) {
								local258 = this.anIntArrayArray144[local35];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2852 = this.aClass175Array1[local258[local260]];
									local2852.anInt4955 = local2852.anInt4955 * arg3 >> 7;
									local2852.anInt4953 = local2852.anInt4953 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray144 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray144.length) {
							local258 = this.anIntArrayArray144[local35];
							for (local260 = 0; local260 < local258.length; local260++) {
								local2852 = this.aClass175Array1[local258[local260]];
								local2852.anInt4952 = local2852.anInt4952 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray145 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray145.length) {
						local258 = this.anIntArrayArray145[local35];
						for (local260 = 0; local260 < local258.length; local260++) {
							local57 = local258[local260];
							if (this.aShortArray66 == null || (this.aShortArray66[local57] & arg6) != 0) {
								local63 = this.aShortArray72[local57] & 0xFFFF;
								local379 = local63 >> 10 & 0x3F;
								local401 = local63 >> 7 & 0x7;
								local427 = local63 & 0x7F;
								local401 += arg3 / 4;
								@Pc(2706) int local2706 = arg2 + local379 & 0x3F;
								if (local401 < 0) {
									local401 = 0;
								} else if (local401 > 7) {
									local401 = 7;
								}
								local427 += arg4;
								if (local427 < 0) {
									local427 = 0;
								} else if (local427 > 127) {
									local427 = 127;
								}
								this.aShortArray72[local57] = (short) (local401 << 7 | local2706 << 10 | local427);
								if (this.aClass58_12 != null) {
									this.aClass58_12.anInterface1_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass156Array1 != null) {
					for (local35 = 0; local35 < this.anInt5189; local35++) {
						local2596 = this.aClass156Array1[local35];
						local2601 = this.aClass175Array1[local35];
						local2601.anInt4950 = Static389.anIntArray561[this.aShortArray72[local2596.anInt4482] & 0xFFFF] & 0xFFFFFF | local2601.anInt4950 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray146.length) {
					local258 = this.anIntArrayArray146[local35];
					for (local260 = 0; local260 < local258.length; local260++) {
						local57 = local258[local260];
						if (this.aShortArray70 == null || (this.aShortArray70[local57] & arg6) != 0) {
							this.anIntArray414[local57] -= Static95.anInt1787;
							this.anIntArray412[local57] -= Static273.anInt4871;
							this.anIntArray415[local57] -= Static201.anInt3736;
							this.anIntArray414[local57] = arg2 * this.anIntArray414[local57] >> 7;
							this.anIntArray412[local57] = arg3 * this.anIntArray412[local57] >> 7;
							this.anIntArray415[local57] = this.anIntArray415[local57] * arg4 >> 7;
							this.anIntArray414[local57] += Static95.anInt1787;
							this.anIntArray412[local57] += Static273.anInt4871;
							this.anIntArray415[local57] += Static201.anInt3736;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local260 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static416.aBoolean465) {
				local379 = Static201.anInt3736 * arg7[6] + Static95.anInt1787 * arg7[0] + arg7[3] * Static273.anInt4871 + 16384 >> 15;
				local401 = Static273.anInt4871 * arg7[4] + arg7[1] * Static95.anInt1787 + Static201.anInt3736 * arg7[7] + 16384 >> 15;
				local427 = arg7[5] * Static273.anInt4871 + arg7[2] * Static95.anInt1787 + Static201.anInt3736 * arg7[8] + 16384 >> 15;
				local401 += local57;
				local379 += local260;
				Static95.anInt1787 = local379;
				local427 += local63;
				Static273.anInt4871 = local401;
				Static416.aBoolean465 = false;
				Static201.anInt3736 = local427;
			}
			local379 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local427 = arg4 << 15 >> 7;
			local458 = -Static95.anInt1787 * local379 + 16384 >> 15;
			local462 = -Static273.anInt4871 * local401 + 16384 >> 15;
			local466 = local427 * -Static201.anInt3736 + 16384 >> 15;
			local470 = local458 + Static95.anInt1787;
			local478 = Static273.anInt4871 + local462;
			local486 = Static201.anInt3736 + local466;
			@Pc(1882) int[] local1882 = new int[] { arg7[0] * local379 + 16384 >> 15, local379 * arg7[3] + 16384 >> 15, arg7[6] * local379 + 16384 >> 15, local401 * arg7[1] + 16384 >> 15, arg7[4] * local401 + 16384 >> 15, arg7[7] * local401 + 16384 >> 15, local427 * arg7[2] + 16384 >> 15, local427 * arg7[5] + 16384 >> 15, arg7[8] * local427 + 16384 >> 15 };
			local643 = local260 * local379 + 16384 >> 15;
			local668 = local401 * local57 + 16384 >> 15;
			@Pc(2010) int local2010 = local643 + local470;
			local673 = local427 * local63 + 16384 >> 15;
			@Pc(2022) int local2022 = local668 + local478;
			@Pc(2026) int local2026 = local673 + local486;
			@Pc(2029) int[] local2029 = new int[9];
			@Pc(2035) int local2035;
			for (local681 = 0; local681 < 3; local681++) {
				for (local2035 = 0; local2035 < 3; local2035++) {
					local686 = 0;
					for (local690 = 0; local690 < 3; local690++) {
						local686 += local1882[local690 * 3 + local2035] * arg7[local690 + local681 * 3];
					}
					local2029[local2035 + local681 * 3] = local686 + 16384 >> 15;
				}
			}
			local2035 = arg7[2] * local2026 + local2010 * arg7[0] + local2022 * arg7[1] + 16384 >> 15;
			local686 = local2010 * arg7[3] + arg7[4] * local2022 + arg7[5] * local2026 + 16384 >> 15;
			local686 += local35;
			local690 = arg7[8] * local2026 + local2022 * arg7[7] + local2010 * arg7[6] + 16384 >> 15;
			local2035 += local31;
			local690 += local41;
			for (local694 = 0; local694 < local8; local694++) {
				local696 = arg1[local694];
				if (local696 < this.anIntArrayArray146.length) {
					local826 = this.anIntArrayArray146[local696];
					for (local828 = 0; local828 < local826.length; local828++) {
						local832 = local826[local828];
						if (this.aShortArray70 == null || (arg6 & this.aShortArray70[local832]) != 0) {
							local836 = local2029[2] * this.anIntArray415[local832] + local2029[0] * this.anIntArray414[local832] + local2029[1] * this.anIntArray412[local832] + 16384 >> 15;
							local838 = this.anIntArray415[local832] * local2029[5] + this.anIntArray412[local832] * local2029[4] + local2029[3] * this.anIntArray414[local832] + 16384 >> 15;
							local965 = local2029[8] * this.anIntArray415[local832] + local2029[6] * this.anIntArray414[local832] + this.anIntArray412[local832] * local2029[7] + 16384 >> 15;
							@Pc(2306) int local2306 = local838 + local686;
							@Pc(2310) int local2310 = local836 + local2035;
							this.anIntArray414[local832] = local2310;
							@Pc(2319) int local2319 = local965 + local690;
							this.anIntArray412[local832] = local2306;
							this.anIntArray415[local832] = local2319;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "o", descriptor = "(I)V")
	@Override
	public void o(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4.anIntArray7[arg0];
		@Pc(13) int local13 = Class4.anIntArray6[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5227; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray412[local15] + this.anIntArray414[local15] * local13 >> 15;
			this.anIntArray412[local15] = local13 * this.anIntArray412[local15] - this.anIntArray414[local15] * local9 >> 15;
			this.anIntArray414[local15] = local33;
		}
		this.aBoolean336 = false;
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	@Override
	public void method4237(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class37_Sub2 local8 = (Class37_Sub2) arg0;
		if (this.anInt5204 == 0 || local8.anInt5204 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5227;
		@Pc(21) int[] local21 = local8.anIntArray414;
		@Pc(24) int[] local24 = local8.anIntArray412;
		@Pc(27) int[] local27 = local8.anIntArray415;
		@Pc(30) short[] local30 = local8.aShortArray65;
		@Pc(33) short[] local33 = local8.aShortArray64;
		@Pc(36) short[] local36 = local8.aShortArray63;
		@Pc(39) byte[] local39 = local8.aByteArray69;
		@Pc(50) short[] local50;
		@Pc(46) short[] local46;
		@Pc(58) short[] local58;
		@Pc(54) byte[] local54;
		if (this.aClass34_1 == null) {
			local46 = null;
			local50 = null;
			local58 = null;
			local54 = null;
		} else {
			local46 = this.aClass34_1.aShortArray10;
			local50 = this.aClass34_1.aShortArray11;
			local54 = this.aClass34_1.aByteArray14;
			local58 = this.aClass34_1.aShortArray12;
		}
		@Pc(75) short[] local75;
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(87) byte[] local87;
		if (local8.aClass34_1 == null) {
			local83 = null;
			local75 = null;
			local79 = null;
			local87 = null;
		} else {
			local75 = local8.aClass34_1.aShortArray11;
			local79 = local8.aClass34_1.aShortArray10;
			local83 = local8.aClass34_1.aShortArray12;
			local87 = local8.aClass34_1.aByteArray14;
		}
		@Pc(100) int[] local100 = local8.anIntArray411;
		@Pc(103) short[] local103 = local8.aShortArray69;
		if (!local8.aBoolean336) {
			local8.method4208();
		}
		@Pc(112) short local112 = local8.aShort62;
		@Pc(115) short local115 = local8.aShort59;
		@Pc(118) short local118 = local8.aShort63;
		@Pc(121) short local121 = local8.aShort56;
		@Pc(124) short local124 = local8.aShort60;
		@Pc(127) short local127 = local8.aShort55;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5227; local129++) {
			@Pc(139) int local139 = this.anIntArray412[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(158) int local158 = this.anIntArray414[local129] - arg1;
				if (local158 >= local118 && local121 >= local158) {
					@Pc(178) int local178 = this.anIntArray415[local129] - arg3;
					if (local178 >= local124 && local178 <= local127) {
						@Pc(188) int local188 = -1;
						@Pc(193) int local193 = this.anIntArray411[local129];
						@Pc(200) int local200 = this.anIntArray411[local129 + 1];
						for (@Pc(202) int local202 = local193; local202 < local200; local202++) {
							local188 = this.aShortArray69[local202] - 1;
							if (local188 == -1 || this.aByteArray69[local188] != 0) {
								break;
							}
						}
						if (local188 != -1) {
							for (@Pc(233) int local233 = 0; local233 < local18; local233++) {
								if (local21[local233] == local158 && local178 == local27[local233] && local139 == local24[local233]) {
									@Pc(256) int local256 = -1;
									local193 = local100[local233];
									local200 = local100[local233 + 1];
									for (@Pc(268) int local268 = local193; local268 < local200; local268++) {
										local256 = local103[local268] - 1;
										if (local256 == -1 || local39[local256] != 0) {
											break;
										}
									}
									if (local256 != -1) {
										if (local50 == null) {
											this.aClass34_1 = new Class34();
											local50 = this.aClass34_1.aShortArray11 = Static47.method802(this.aShortArray65);
											local46 = this.aClass34_1.aShortArray10 = Static47.method802(this.aShortArray64);
											local58 = this.aClass34_1.aShortArray12 = Static47.method802(this.aShortArray63);
											local54 = this.aClass34_1.aByteArray14 = Static365.method5029(this.aByteArray69);
										}
										if (local75 == null) {
											@Pc(351) Class34 local351 = local8.aClass34_1 = new Class34();
											local75 = local351.aShortArray11 = Static47.method802(local30);
											local79 = local351.aShortArray10 = Static47.method802(local33);
											local83 = local351.aShortArray12 = Static47.method802(local36);
											local87 = local351.aByteArray14 = Static365.method5029(local39);
										}
										@Pc(384) short local384 = this.aShortArray65[local188];
										@Pc(389) short local389 = this.aShortArray64[local188];
										@Pc(394) short local394 = this.aShortArray63[local188];
										local200 = local100[local233 + 1];
										local193 = local100[local233];
										@Pc(409) byte local409 = this.aByteArray69[local188];
										@Pc(419) int local419;
										for (@Pc(411) int local411 = local193; local411 < local200; local411++) {
											local419 = local103[local411] - 1;
											if (local419 == -1) {
												break;
											}
											if (local87[local419] != 0) {
												local75[local419] += local384;
												local79[local419] += local389;
												local83[local419] += local394;
												local87[local419] += local409;
											}
										}
										local384 = local30[local256];
										local409 = local39[local256];
										local394 = local36[local256];
										local193 = this.anIntArray411[local129];
										local200 = this.anIntArray411[local129 + 1];
										local389 = local33[local256];
										for (local419 = local193; local419 < local200; local419++) {
											@Pc(506) int local506 = this.aShortArray69[local419] - 1;
											if (local506 == -1) {
												break;
											}
											if (local54[local506] != 0) {
												local50[local506] += local384;
												local46[local506] += local389;
												local58[local506] += local394;
												local54[local506] += local409;
											}
										}
										if (this.aClass58_10 == null && this.aClass58_12 != null) {
											this.aClass58_12.anInterface1_1 = null;
										}
										if (this.aClass58_10 != null) {
											this.aClass58_10.anInterface1_1 = null;
										}
										if (local8.aClass58_10 == null && local8.aClass58_12 != null) {
											local8.aClass58_12.anInterface1_1 = null;
										}
										if (local8.aClass58_10 != null) {
											local8.aClass58_10.anInterface1_1 = null;
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

	@OriginalMember(owner = "client!or", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4.anIntArray7[arg0];
		@Pc(13) int local13 = Class4.anIntArray6[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5227; local15++) {
			@Pc(33) int local33 = this.anIntArray415[local15] * local9 + this.anIntArray414[local15] * local13 >> 15;
			this.anIntArray415[local15] = this.anIntArray415[local15] * local13 - local9 * this.anIntArray414[local15] >> 15;
			this.anIntArray414[local15] = local33;
		}
		this.aBoolean336 = false;
		if (this.aClass58_11 != null) {
			this.aClass58_11.anInterface1_1 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "E", descriptor = "()I")
	@Override
	public int E() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!or", name = "u", descriptor = "(I)V")
	@Override
	public void u(@OriginalArg(0) int arg0) {
		this.anInt5214 = arg0;
		if (this.aClass34_1 != null && (this.anInt5214 & 0x10000) == 0) {
			this.aShortArray64 = this.aClass34_1.aShortArray10;
			this.aShortArray63 = this.aClass34_1.aShortArray12;
			this.aByteArray69 = this.aClass34_1.aByteArray14;
			this.aShortArray65 = this.aClass34_1.aShortArray11;
			this.aClass34_1 = null;
		}
		this.aBoolean337 = true;
		this.method4201();
	}

	@OriginalMember(owner = "client!or", name = "la", descriptor = "()I")
	@Override
	public int la() {
		if (!this.aBoolean336) {
			this.method4208();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ia;Lclient!nh;II)V")
	@Override
	public void method4223(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class39_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5213 == 0) {
			return;
		}
		@Pc(13) Class18_Sub1 local13 = this.aClass109_Sub1_35.aClass18_Sub1_3;
		@Pc(16) Class18_Sub1 local16 = (Class18_Sub1) arg0;
		if (!this.aBoolean336) {
			this.method4208();
		}
		Static411.aFloat91 = local16.aFloat13 * local13.aFloat7 + local13.aFloat9 * local16.aFloat15 + local13.aFloat11 * local16.aFloat7;
		Static44.aFloat23 = local16.aFloat6 * local13.aFloat7 + local16.aFloat4 * local13.aFloat9 + local16.aFloat8 * local13.aFloat11 + local13.aFloat8;
		@Pc(69) float local69 = (float) this.aShort62 * Static411.aFloat91 + Static44.aFloat23;
		@Pc(77) float local77 = (float) this.aShort59 * Static411.aFloat91 + Static44.aFloat23;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.aShort61;
			local93 = local69 + (float) this.aShort61;
		} else {
			local87 = local69 - (float) this.aShort61;
			local93 = (float) this.aShort61 + local77;
		}
		if (this.aClass109_Sub1_35.aFloat51 <= local87 || (float) this.aClass109_Sub1_35.anInt2989 >= local93) {
			return;
		}
		Static236.aFloat83 = local16.aFloat8 * local13.aFloat10 + local13.aFloat15 * local16.aFloat6 + local16.aFloat4 * local13.aFloat5 + local13.aFloat4;
		Static103.aFloat32 = local16.aFloat7 * local13.aFloat10 + local16.aFloat15 * local13.aFloat5 + local13.aFloat15 * local16.aFloat13;
		@Pc(169) float local169 = Static103.aFloat32 * (float) this.aShort62 + Static236.aFloat83;
		@Pc(177) float local177 = Static103.aFloat32 * (float) this.aShort59 + Static236.aFloat83;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local169 > local177) {
			local193 = ((float) -this.aShort61 + local177) * (float) this.aClass109_Sub1_35.anInt2986;
			local204 = (float) this.aClass109_Sub1_35.anInt2986 * ((float) this.aShort61 + local169);
		} else {
			local204 = (float) this.aClass109_Sub1_35.anInt2986 * (local177 + (float) this.aShort61);
			local193 = (local169 - (float) this.aShort61) * (float) this.aClass109_Sub1_35.anInt2986;
		}
		if (local193 / (float) arg2 >= this.aClass109_Sub1_35.aFloat48 || local204 / (float) arg2 <= this.aClass109_Sub1_35.aFloat44) {
			return;
		}
		Static433.aFloat94 = local16.aFloat7 * local13.aFloat14 + local16.aFloat13 * local13.aFloat13 + local13.aFloat12 * local16.aFloat15;
		Static62.aFloat30 = local13.aFloat12 * local16.aFloat4 + local16.aFloat6 * local13.aFloat13 + local13.aFloat14 * local16.aFloat8 + local13.aFloat6;
		@Pc(295) float local295 = Static62.aFloat30 + (float) this.aShort62 * Static433.aFloat94;
		@Pc(303) float local303 = Static62.aFloat30 + (float) this.aShort59 * Static433.aFloat94;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = (float) this.aClass109_Sub1_35.anInt2992 * ((float) this.aShort61 + local295);
			local330 = ((float) -this.aShort61 + local303) * (float) this.aClass109_Sub1_35.anInt2992;
		} else {
			local318 = (local303 + (float) this.aShort61) * (float) this.aClass109_Sub1_35.anInt2992;
			local330 = (float) this.aClass109_Sub1_35.anInt2992 * (local295 - (float) this.aShort61);
		}
		if (this.aClass109_Sub1_35.aFloat45 <= local330 / (float) arg2 || local318 / (float) arg2 <= this.aClass109_Sub1_35.aFloat58) {
			return;
		}
		if (arg1 != null || this.aClass156Array1 != null) {
			Static381.aFloat81 = local13.aFloat10 * local16.aFloat11 + local13.aFloat5 * local16.aFloat10 + local13.aFloat15 * local16.aFloat14;
			Static26.aFloat68 = local16.aFloat10 * local13.aFloat9 + local13.aFloat7 * local16.aFloat14 + local13.aFloat11 * local16.aFloat11;
			Static96.aFloat31 = local16.aFloat11 * local13.aFloat14 + local13.aFloat12 * local16.aFloat10 + local13.aFloat13 * local16.aFloat14;
			Static382.aFloat89 = local13.aFloat5 * local16.aFloat5 + local13.aFloat15 * local16.aFloat12 + local16.aFloat9 * local13.aFloat10;
			Static317.aFloat65 = local16.aFloat9 * local13.aFloat14 + local16.aFloat5 * local13.aFloat12 + local16.aFloat12 * local13.aFloat13;
			Static357.aFloat86 = local16.aFloat5 * local13.aFloat9 + local16.aFloat12 * local13.aFloat7 + local13.aFloat11 * local16.aFloat9;
		}
		if (arg1 != null) {
			@Pc(497) int local497 = this.aShort63 + this.aShort56 >> 1;
			@Pc(506) int local506 = this.aShort60 + this.aShort55 >> 1;
			@Pc(525) int local525 = (int) ((float) local506 * Static381.aFloat81 + (float) this.aShort62 * Static103.aFloat32 + (float) local497 * Static382.aFloat89 + Static236.aFloat83);
			@Pc(544) int local544 = (int) (Static62.aFloat30 + (float) local497 * Static317.aFloat65 + (float) this.aShort62 * Static433.aFloat94 + Static96.aFloat31 * (float) local506);
			@Pc(563) int local563 = (int) (Static411.aFloat91 * (float) this.aShort62 + Static357.aFloat86 * (float) local497 + Static44.aFloat23 + (float) local506 * Static26.aFloat68);
			@Pc(582) int local582 = (int) ((float) this.aShort59 * Static103.aFloat32 + Static236.aFloat83 + (float) local497 * Static382.aFloat89 + Static381.aFloat81 * (float) local506);
			@Pc(601) int local601 = (int) (Static433.aFloat94 * (float) this.aShort59 + Static62.aFloat30 + (float) local497 * Static317.aFloat65 + Static96.aFloat31 * (float) local506);
			arg1.anInt4794 = this.aClass109_Sub1_35.anInt3015 + this.aClass109_Sub1_35.anInt2986 * local525 / arg2;
			@Pc(633) int local633 = (int) (Static26.aFloat68 * (float) local506 + (float) this.aShort59 * Static411.aFloat91 + Static44.aFloat23 + Static357.aFloat86 * (float) local497);
			arg1.anInt4793 = this.aClass109_Sub1_35.anInt2986 * local582 / arg2 + this.aClass109_Sub1_35.anInt3015;
			arg1.anInt4797 = this.aClass109_Sub1_35.anInt3016 + local544 * this.aClass109_Sub1_35.anInt2992 / arg2;
			arg1.anInt4795 = this.aClass109_Sub1_35.anInt3016 + local601 * this.aClass109_Sub1_35.anInt2992 / arg2;
			if (this.aClass109_Sub1_35.anInt2989 > local563 && local633 < this.aClass109_Sub1_35.anInt2989) {
				arg1.aBoolean325 = true;
				arg1.anInt4796 = this.aClass109_Sub1_35.anInt3015 + (this.aShort61 + local525) * this.aClass109_Sub1_35.anInt2986 / arg2 - arg1.anInt4794;
			}
		}
		this.aClass109_Sub1_35.method2537((float) arg2);
		this.aClass109_Sub1_35.method2569();
		this.aClass109_Sub1_35.method2544(local16);
		this.method4204();
		this.aClass109_Sub1_35.method2541();
		this.method4207();
	}

	@OriginalMember(owner = "client!or", name = "K", descriptor = "(IIII)V")
	@Override
	protected void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static201.anInt3736 = 0;
			Static95.anInt1787 = 0;
			Static273.anInt4871 = 0;
			for (local17 = 0; local17 < this.anInt5227; local17++) {
				Static95.anInt1787 += this.anIntArray414[local17];
				Static273.anInt4871 += this.anIntArray412[local17];
				Static201.anInt3736 += this.anIntArray415[local17];
				local9++;
			}
			if (local9 <= 0) {
				Static201.anInt3736 = arg3;
				Static273.anInt4871 = arg2;
				Static95.anInt1787 = arg1;
			} else {
				Static201.anInt3736 = arg3 + Static201.anInt3736 / local9;
				Static95.anInt1787 = Static95.anInt1787 / local9 + arg1;
				Static273.anInt4871 = Static273.anInt4871 / local9 + arg2;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt5227; local9++) {
				this.anIntArray414[local9] += arg1;
				this.anIntArray412[local9] += arg2;
				this.anIntArray415[local9] += arg3;
			}
		} else {
			@Pc(160) int local160;
			@Pc(178) int local178;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt5227; local9++) {
					this.anIntArray414[local9] -= Static95.anInt1787;
					this.anIntArray412[local9] -= Static273.anInt4871;
					this.anIntArray415[local9] -= Static201.anInt3736;
					if (arg3 != 0) {
						local17 = Class4.anIntArray7[arg3];
						local160 = Class4.anIntArray6[arg3];
						local178 = this.anIntArray412[local9] * local17 + local160 * this.anIntArray414[local9] + 32767 >> 15;
						this.anIntArray412[local9] = local160 * this.anIntArray412[local9] + 32767 - local17 * this.anIntArray414[local9] >> 15;
						this.anIntArray414[local9] = local178;
					}
					if (arg1 != 0) {
						local17 = Class4.anIntArray7[arg1];
						local160 = Class4.anIntArray6[arg1];
						local178 = this.anIntArray412[local9] * local160 + 32767 - this.anIntArray415[local9] * local17 >> 15;
						this.anIntArray415[local9] = local17 * this.anIntArray412[local9] + this.anIntArray415[local9] * local160 + 32767 >> 15;
						this.anIntArray412[local9] = local178;
					}
					if (arg2 != 0) {
						local17 = Class4.anIntArray7[arg2];
						local160 = Class4.anIntArray6[arg2];
						local178 = local17 * this.anIntArray415[local9] + local160 * this.anIntArray414[local9] + 32767 >> 15;
						this.anIntArray415[local9] = this.anIntArray415[local9] * local160 + 32767 - local17 * this.anIntArray414[local9] >> 15;
						this.anIntArray414[local9] = local178;
					}
					this.anIntArray414[local9] += Static95.anInt1787;
					this.anIntArray412[local9] += Static273.anInt4871;
					this.anIntArray415[local9] += Static201.anInt3736;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt5227; local9++) {
					this.anIntArray414[local9] -= Static95.anInt1787;
					this.anIntArray412[local9] -= Static273.anInt4871;
					this.anIntArray415[local9] -= Static201.anInt3736;
					this.anIntArray414[local9] = this.anIntArray414[local9] * arg1 / 128;
					this.anIntArray412[local9] = arg2 * this.anIntArray412[local9] / 128;
					this.anIntArray415[local9] = this.anIntArray415[local9] * arg3 / 128;
					this.anIntArray414[local9] += Static95.anInt1787;
					this.anIntArray412[local9] += Static273.anInt4871;
					this.anIntArray415[local9] += Static201.anInt3736;
				}
			} else {
				@Pc(514) Class156 local514;
				@Pc(519) Class175 local519;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt5204; local9++) {
						local17 = arg1 * 8 + (this.aByteArray68[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray68[local9] = (byte) local17;
					}
					if (this.aClass58_12 != null) {
						this.aClass58_12.anInterface1_1 = null;
					}
					if (this.aClass156Array1 != null) {
						for (local17 = 0; local17 < this.anInt5189; local17++) {
							local514 = this.aClass156Array1[local17];
							local519 = this.aClass175Array1[local17];
							local519.anInt4950 = local519.anInt4950 & 0xFFFFFF | 255 - (this.aByteArray68[local514.anInt4482] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt5204; local9++) {
						local17 = this.aShortArray72[local9] & 0xFFFF;
						local160 = local17 >> 10 & 0x3F;
						local178 = local17 >> 7 & 0x7;
						local178 += arg2 / 4;
						@Pc(584) int local584 = arg1 + local160 & 0x3F;
						@Pc(588) int local588 = local17 & 0x7F;
						local588 += arg3;
						if (local178 < 0) {
							local178 = 0;
						} else if (local178 > 7) {
							local178 = 7;
						}
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray72[local9] = (short) (local178 << 7 | local584 << 10 | local588);
					}
					if (this.aClass58_12 != null) {
						this.aClass58_12.anInterface1_1 = null;
					}
					if (this.aClass156Array1 != null) {
						for (local17 = 0; local17 < this.anInt5189; local17++) {
							local514 = this.aClass156Array1[local17];
							local519 = this.aClass175Array1[local17];
							local519.anInt4950 = Static389.anIntArray561[this.aShortArray72[local514.anInt4482] & 0xFFFF] & 0xFFFFFF | local519.anInt4950 & 0xFF000000;
						}
					}
				} else {
					@Pc(710) Class175 local710;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt5189; local9++) {
							local710 = this.aClass175Array1[local9];
							local710.anInt4951 += arg2;
							local710.anInt4954 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt5189; local9++) {
							local710 = this.aClass175Array1[local9];
							local710.anInt4955 = arg2 * local710.anInt4955 >> 7;
							local710.anInt4953 = local710.anInt4953 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt5189; local9++) {
							local710 = this.aClass175Array1[local9];
							local710.anInt4952 = local710.anInt4952 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "ZA", descriptor = "(I)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0) {
		if (this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
		}
		this.aShort57 = (short) arg0;
	}

	@OriginalMember(owner = "client!or", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aShort58;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!nu;)V")
	private void method4211(@OriginalArg(1) Class1_Sub2_Sub11_Sub1 arg0) {
		if (Static313.anIntArray441.length < this.anInt5213) {
			Static313.anIntArray441 = new int[this.anInt5213];
			Static106.anIntArray174 = new int[this.anInt5213];
		}
		@Pc(56) int local56;
		@Pc(95) int local95;
		@Pc(104) int local104;
		for (@Pc(30) int local30 = 0; local30 < this.anInt5227; local30++) {
			local56 = (this.anIntArray414[local30] - (this.anIntArray412[local30] * this.aClass109_Sub1_35.anInt3002 >> 8) >> this.aClass109_Sub1_35.anInt2976) - arg0.anInt4916;
			@Pc(81) int local81 = (this.anIntArray415[local30] - (this.anIntArray412[local30] * this.aClass109_Sub1_35.anInt2997 >> 8) >> this.aClass109_Sub1_35.anInt2976) - arg0.anInt4914;
			@Pc(86) int local86 = this.anIntArray411[local30];
			@Pc(93) int local93 = this.anIntArray411[local30 + 1];
			for (local95 = local86; local95 < local93; local95++) {
				local104 = this.aShortArray69[local95] - 1;
				if (local104 == -1) {
					break;
				}
				Static313.anIntArray441[local104] = local56;
				Static106.anIntArray174[local104] = local81;
			}
		}
		for (local56 = 0; local56 < this.anInt5175; local56++) {
			if (this.aByteArray68 == null || this.aByteArray68[local56] <= 128) {
				@Pc(150) short local150 = this.aShortArray68[local56];
				@Pc(155) short local155 = this.aShortArray67[local56];
				@Pc(160) short local160 = this.aShortArray62[local56];
				local95 = Static313.anIntArray441[local150];
				local104 = Static313.anIntArray441[local155];
				@Pc(172) int local172 = Static313.anIntArray441[local160];
				@Pc(176) int local176 = Static106.anIntArray174[local150];
				@Pc(180) int local180 = Static106.anIntArray174[local155];
				@Pc(184) int local184 = Static106.anIntArray174[local160];
				if (-((local180 - local176) * (-local104 + local172)) + (local180 - local184) * (local95 - local104) > 0) {
					arg0.method3996(local172, local176, local180, local95, local104, local184);
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(FFJLclient!wk;BIIIII)S")
	private short method4212(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class264 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray411[arg8];
		@Pc(17) int local17 = this.anIntArray411[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray69[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static319.aLongArray6[local21] == arg2) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray69[local19] = (short) (this.anInt5213 + 1);
		Static319.aLongArray6[local19] = arg2;
		this.aShortArray65[this.anInt5213] = (short) arg6;
		this.aShortArray64[this.anInt5213] = (short) arg7;
		this.aShortArray63[this.anInt5213] = (short) arg5;
		this.aByteArray69[this.anInt5213] = (byte) arg4;
		this.aFloatArray26[this.anInt5213] = arg1;
		this.aFloatArray27[this.anInt5213] = arg0;
		return (short) this.anInt5213++;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZZ)V")
	private void method4213(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass58_12 != null && this.aClass58_12.anInterface1_1 == null;
		@Pc(27) boolean local27 = this.aClass58_10 != null && this.aClass58_10.anInterface1_1 == null;
		@Pc(38) boolean local38 = this.aClass58_11 != null && this.aClass58_11.anInterface1_1 == null;
		@Pc(49) boolean local49 = this.aClass58_9 != null && this.aClass58_9.anInterface1_1 == null;
		if (arg0) {
			local38 &= (this.aByte60 & 0x1) != 0;
			local16 &= (this.aByte60 & 0x2) != 0;
			local49 &= (this.aByte60 & 0x8) != 0;
			local27 &= (this.aByte60 & 0x4) != 0;
		}
		@Pc(109) byte local109 = 0;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (local38) {
			local109 = 12;
		}
		@Pc(126) byte local126 = 0;
		if (local16) {
			local113 = local109;
			local109 = (byte) (local109 + 4);
		}
		if (local27) {
			local115 = local109;
			local109 = (byte) (local109 + 12);
		}
		if (local49) {
			local126 = local109;
			local109 = (byte) (local109 + 8);
		}
		if (local109 == 0) {
			return;
		}
		if (this.anInt5213 * local109 <= Static408.aClass1_Sub1_Sub2_3.aByteArray66.length) {
			Static408.aClass1_Sub1_Sub2_3.anInt5056 = 0;
		} else {
			Static408.aClass1_Sub1_Sub2_3 = new Class1_Sub1_Sub2((this.anInt5213 + 100) * local109);
		}
		@Pc(187) int local187;
		@Pc(196) int local196;
		@Pc(224) int local224;
		@Pc(233) int local233;
		if (local38) {
			@Pc(203) int local203;
			@Pc(210) int local210;
			@Pc(215) int local215;
			@Pc(222) int local222;
			if (this.aClass109_Sub1_35.aBoolean163) {
				for (local187 = 0; local187 < this.anInt5227; local187++) {
					local196 = NativeStream.floatToRawIntBits((float) this.anIntArray414[local187]);
					local203 = NativeStream.floatToRawIntBits((float) this.anIntArray412[local187]);
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray415[local187]);
					local215 = this.anIntArray411[local187];
					local222 = this.anIntArray411[local187 + 1];
					for (local224 = local215; local224 < local222; local224++) {
						local233 = this.aShortArray69[local224] - 1;
						if (local233 == -1) {
							break;
						}
						Static408.aClass1_Sub1_Sub2_3.anInt5056 = local109 * local233;
						Static408.aClass1_Sub1_Sub2_3.method4105(local196);
						Static408.aClass1_Sub1_Sub2_3.method4105(local203);
						Static408.aClass1_Sub1_Sub2_3.method4105(local210);
					}
				}
			} else {
				for (local187 = 0; local187 < this.anInt5227; local187++) {
					local196 = NativeStream.floatToRawIntBits((float) this.anIntArray414[local187]);
					local203 = NativeStream.floatToRawIntBits((float) this.anIntArray412[local187]);
					local210 = NativeStream.floatToRawIntBits((float) this.anIntArray415[local187]);
					local215 = this.anIntArray411[local187];
					local222 = this.anIntArray411[local187 + 1];
					for (local224 = local215; local224 < local222; local224++) {
						local233 = this.aShortArray69[local224] - 1;
						if (local233 == -1) {
							break;
						}
						Static408.aClass1_Sub1_Sub2_3.anInt5056 = local109 * local233;
						Static408.aClass1_Sub1_Sub2_3.method4106(local196);
						Static408.aClass1_Sub1_Sub2_3.method4106(local203);
						Static408.aClass1_Sub1_Sub2_3.method4106(local210);
					}
				}
			}
		}
		@Pc(489) float local489;
		@Pc(376) short[] local376;
		@Pc(380) short[] local380;
		@Pc(372) short[] local372;
		@Pc(368) byte[] local368;
		@Pc(527) float local527;
		if (local16) {
			if (this.aClass58_10 == null) {
				if (this.aClass34_1 == null) {
					local368 = this.aByteArray69;
					local372 = this.aShortArray63;
					local380 = this.aShortArray64;
					local376 = this.aShortArray65;
				} else {
					local368 = this.aClass34_1.aByteArray14;
					local372 = this.aClass34_1.aShortArray12;
					local376 = this.aClass34_1.aShortArray11;
					local380 = this.aClass34_1.aShortArray10;
				}
				@Pc(400) float local400 = this.aClass109_Sub1_35.aFloatArray21[0];
				@Pc(406) float local406 = this.aClass109_Sub1_35.aFloatArray21[1];
				@Pc(412) float local412 = this.aClass109_Sub1_35.aFloatArray21[2];
				@Pc(416) float local416 = this.aClass109_Sub1_35.aFloat56;
				@Pc(426) float local426 = this.aClass109_Sub1_35.aFloat43 * 768.0F / (float) this.aShort58;
				@Pc(436) float local436 = this.aClass109_Sub1_35.aFloat50 * 768.0F / (float) this.aShort58;
				for (@Pc(438) int local438 = 0; local438 < this.anInt5204; local438++) {
					@Pc(458) int local458 = this.method4202(this.aShortArray72[local438], this.aShort57, this.aByteArray68[local438], this.aShortArray71[local438]);
					@Pc(467) float local467 = this.aClass109_Sub1_35.aFloat55 * (float) (local458 >>> 24);
					@Pc(478) float local478 = this.aClass109_Sub1_35.aFloat62 * (float) (local458 >> 8 & 0xFF);
					local489 = (float) (local458 >> 16 & 0xFF) * this.aClass109_Sub1_35.aFloat47;
					@Pc(494) short local494 = this.aShortArray68[local438];
					@Pc(499) short local499 = (short) local368[local494];
					if (local499 == 0) {
						local527 = ((float) local372[local494] * local412 + local406 * (float) local380[local494] + local400 * (float) local376[local494]) * 0.0026041667F;
					} else {
						local527 = (local400 * (float) local376[local494] + local406 * (float) local380[local494] + (float) local372[local494] * local412) / (float) (local499 * 256);
					}
					@Pc(564) float local564 = (local527 < 0.0F ? local436 : local426) * local527 + local416;
					@Pc(569) int local569 = (int) (local467 * local564);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					@Pc(588) int local588 = (int) (local564 * local489);
					@Pc(593) int local593 = (int) (local564 * local478);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					if (local593 < 0) {
						local593 = 0;
					} else if (local593 > 255) {
						local593 = 255;
					}
					Static408.aClass1_Sub1_Sub2_3.anInt5056 = local109 * local494 + local113;
					Static408.aClass1_Sub1_Sub2_3.method4115(local569);
					Static408.aClass1_Sub1_Sub2_3.method4115(local588);
					Static408.aClass1_Sub1_Sub2_3.method4115(local593);
					Static408.aClass1_Sub1_Sub2_3.method4115(255 - (this.aByteArray68[local438] & 0xFF));
					local494 = this.aShortArray67[local438];
					local499 = local368[local494];
					if (local499 == 0) {
						local527 = ((float) local376[local494] * local400 + local406 * (float) local380[local494] + (float) local372[local494] * local412) * 0.0026041667F;
					} else {
						local527 = (local400 * (float) local376[local494] + local406 * (float) local380[local494] + local412 * (float) local372[local494]) / (float) (local499 * 256);
					}
					local564 = local416 + (local527 < 0.0F ? local436 : local426) * local527;
					local569 = (int) (local564 * local467);
					local588 = (int) (local564 * local489);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					local593 = (int) (local564 * local478);
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					if (local593 < 0) {
						local593 = 0;
					} else if (local593 > 255) {
						local593 = 255;
					}
					Static408.aClass1_Sub1_Sub2_3.anInt5056 = local109 * local494 + local113;
					Static408.aClass1_Sub1_Sub2_3.method4115(local569);
					Static408.aClass1_Sub1_Sub2_3.method4115(local588);
					Static408.aClass1_Sub1_Sub2_3.method4115(local593);
					Static408.aClass1_Sub1_Sub2_3.method4115(255 - (this.aByteArray68[local438] & 0xFF));
					local494 = this.aShortArray62[local438];
					local499 = local368[local494];
					if (local499 == 0) {
						local527 = ((float) local380[local494] * local406 + local400 * (float) local376[local494] + (float) local372[local494] * local412) * 0.0026041667F;
					} else {
						local527 = (local412 * (float) local372[local494] + (float) local380[local494] * local406 + local400 * (float) local376[local494]) / (float) (local499 * 256);
					}
					local564 = local527 * (local527 < 0.0F ? local436 : local426) + local416;
					local569 = (int) (local467 * local564);
					local588 = (int) (local564 * local489);
					if (local569 < 0) {
						local569 = 0;
					} else if (local569 > 255) {
						local569 = 255;
					}
					if (local588 < 0) {
						local588 = 0;
					} else if (local588 > 255) {
						local588 = 255;
					}
					local593 = (int) (local478 * local564);
					if (local593 < 0) {
						local593 = 0;
					} else if (local593 > 255) {
						local593 = 255;
					}
					Static408.aClass1_Sub1_Sub2_3.anInt5056 = local494 * local109 + local113;
					Static408.aClass1_Sub1_Sub2_3.method4115(local569);
					Static408.aClass1_Sub1_Sub2_3.method4115(local588);
					Static408.aClass1_Sub1_Sub2_3.method4115(local593);
					Static408.aClass1_Sub1_Sub2_3.method4115(255 - (this.aByteArray68[local438] & 0xFF));
				}
			} else {
				for (local187 = 0; local187 < this.anInt5204; local187++) {
					local196 = this.method4202(this.aShortArray72[local187], this.aShort57, this.aByteArray68[local187], this.aShortArray71[local187]);
					Static408.aClass1_Sub1_Sub2_3.anInt5056 = local113 + this.aShortArray68[local187] * local109;
					Static408.aClass1_Sub1_Sub2_3.method4105(local196);
					Static408.aClass1_Sub1_Sub2_3.anInt5056 = this.aShortArray67[local187] * local109 + local113;
					Static408.aClass1_Sub1_Sub2_3.method4105(local196);
					Static408.aClass1_Sub1_Sub2_3.anInt5056 = local113 + local109 * this.aShortArray62[local187];
					Static408.aClass1_Sub1_Sub2_3.method4105(local196);
				}
			}
		}
		if (local27) {
			if (this.aClass34_1 == null) {
				local368 = this.aByteArray69;
				local372 = this.aShortArray63;
				local380 = this.aShortArray64;
				local376 = this.aShortArray65;
			} else {
				local368 = this.aClass34_1.aByteArray14;
				local376 = this.aClass34_1.aShortArray11;
				local380 = this.aClass34_1.aShortArray10;
				local372 = this.aClass34_1.aShortArray12;
			}
			@Pc(1114) float local1114 = 3.0F / (float) this.aShort58;
			Static408.aClass1_Sub1_Sub2_3.anInt5056 = local115;
			local527 = 3.0F / (float) (this.aShort58 + this.aShort58 / 2);
			if (this.aClass109_Sub1_35.aBoolean163) {
				for (local224 = 0; local224 < this.anInt5213; local224++) {
					local233 = local368[local224] & 0xFF;
					if (local233 == 0) {
						Static408.aClass1_Sub1_Sub2_3.method4149(local527 * (float) local376[local224]);
						Static408.aClass1_Sub1_Sub2_3.method4149((float) local380[local224] * local527);
						Static408.aClass1_Sub1_Sub2_3.method4149((float) local372[local224] * local527);
					} else {
						local489 = local1114 / (float) local233;
						Static408.aClass1_Sub1_Sub2_3.method4149(local489 * (float) local376[local224]);
						Static408.aClass1_Sub1_Sub2_3.method4149((float) local380[local224] * local489);
						Static408.aClass1_Sub1_Sub2_3.method4149((float) local372[local224] * local489);
					}
					Static408.aClass1_Sub1_Sub2_3.anInt5056 += local109 - 12;
				}
			} else {
				for (local224 = 0; local224 < this.anInt5213; local224++) {
					local233 = local368[local224] & 0xFF;
					if (local233 == 0) {
						Static408.aClass1_Sub1_Sub2_3.method4148(local527 * (float) local376[local224]);
						Static408.aClass1_Sub1_Sub2_3.method4148((float) local380[local224] * local527);
						Static408.aClass1_Sub1_Sub2_3.method4148((float) local372[local224] * local527);
					} else {
						local489 = local1114 / (float) local233;
						Static408.aClass1_Sub1_Sub2_3.method4148(local489 * (float) local376[local224]);
						Static408.aClass1_Sub1_Sub2_3.method4148((float) local380[local224] * local489);
						Static408.aClass1_Sub1_Sub2_3.method4148((float) local372[local224] * local489);
					}
					Static408.aClass1_Sub1_Sub2_3.anInt5056 += local109 - 12;
				}
			}
		}
		if (local49) {
			Static408.aClass1_Sub1_Sub2_3.anInt5056 = local126;
			if (this.aClass109_Sub1_35.aBoolean163) {
				for (local187 = 0; local187 < this.anInt5213; local187++) {
					Static408.aClass1_Sub1_Sub2_3.method4149(this.aFloatArray26[local187]);
					Static408.aClass1_Sub1_Sub2_3.method4149(this.aFloatArray27[local187]);
					Static408.aClass1_Sub1_Sub2_3.anInt5056 += local109 - 8;
				}
			} else {
				for (local187 = 0; local187 < this.anInt5213; local187++) {
					Static408.aClass1_Sub1_Sub2_3.method4148(this.aFloatArray26[local187]);
					Static408.aClass1_Sub1_Sub2_3.method4148(this.aFloatArray27[local187]);
					Static408.aClass1_Sub1_Sub2_3.anInt5056 += local109 - 8;
				}
			}
		}
		Static408.aClass1_Sub1_Sub2_3.anInt5056 = local109 * this.anInt5213;
		@Pc(1411) Interface1 local1411;
		if (arg0) {
			if (this.anInterface1_6 == null) {
				this.anInterface1_6 = this.aClass109_Sub1_35.method2555(true, local109, Static408.aClass1_Sub1_Sub2_3.aByteArray66, Static408.aClass1_Sub1_Sub2_3.anInt5056);
			} else {
				this.anInterface1_6.method3256(Static408.aClass1_Sub1_Sub2_3.aByteArray66, local109, Static408.aClass1_Sub1_Sub2_3.anInt5056);
			}
			this.aByte60 = 0;
			local1411 = this.anInterface1_6;
		} else {
			local1411 = this.aClass109_Sub1_35.method2555(false, local109, Static408.aClass1_Sub1_Sub2_3.aByteArray66, Static408.aClass1_Sub1_Sub2_3.anInt5056);
			this.aBoolean337 = true;
		}
		if (local38) {
			this.aClass58_11.aByte11 = 0;
			this.aClass58_11.anInterface1_1 = local1411;
		}
		if (local49) {
			this.aClass58_9.aByte11 = local126;
			this.aClass58_9.anInterface1_1 = local1411;
		}
		if (local16) {
			this.aClass58_12.aByte11 = local113;
			this.aClass58_12.anInterface1_1 = local1411;
		}
		if (local27) {
			this.aClass58_10.anInterface1_1 = local1411;
			this.aClass58_10.aByte11 = local115;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!ia;Z)Z")
	@Override
	public boolean method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class18_Sub1 local8 = (Class18_Sub1) arg2;
		@Pc(12) Class18_Sub1 local12 = this.aClass109_Sub1_35.aClass18_Sub1_3;
		@Pc(33) float local33 = local8.aFloat8 * local12.aFloat10 + local12.aFloat5 * local8.aFloat4 + local12.aFloat15 * local8.aFloat6 + local12.aFloat4;
		@Pc(54) float local54 = local8.aFloat8 * local12.aFloat14 + local12.aFloat13 * local8.aFloat6 + local12.aFloat12 * local8.aFloat4 + local12.aFloat6;
		Static357.aFloat86 = local8.aFloat5 * local12.aFloat9 + local8.aFloat12 * local12.aFloat7 + local8.aFloat9 * local12.aFloat11;
		Static433.aFloat94 = local8.aFloat7 * local12.aFloat14 + local12.aFloat13 * local8.aFloat13 + local8.aFloat15 * local12.aFloat12;
		Static317.aFloat65 = local8.aFloat9 * local12.aFloat14 + local12.aFloat12 * local8.aFloat5 + local12.aFloat13 * local8.aFloat12;
		@Pc(129) float local129 = local12.aFloat11 * local8.aFloat8 + local8.aFloat6 * local12.aFloat7 + local8.aFloat4 * local12.aFloat9 + local12.aFloat8;
		Static381.aFloat81 = local8.aFloat11 * local12.aFloat10 + local12.aFloat15 * local8.aFloat14 + local8.aFloat10 * local12.aFloat5;
		Static103.aFloat32 = local12.aFloat5 * local8.aFloat15 + local12.aFloat15 * local8.aFloat13 + local12.aFloat10 * local8.aFloat7;
		Static411.aFloat91 = local8.aFloat15 * local12.aFloat9 + local8.aFloat13 * local12.aFloat7 + local8.aFloat7 * local12.aFloat11;
		Static382.aFloat89 = local12.aFloat15 * local8.aFloat12 + local12.aFloat5 * local8.aFloat5 + local8.aFloat9 * local12.aFloat10;
		Static96.aFloat31 = local12.aFloat13 * local8.aFloat14 + local12.aFloat12 * local8.aFloat10 + local8.aFloat11 * local12.aFloat14;
		Static26.aFloat68 = local8.aFloat14 * local12.aFloat7 + local8.aFloat10 * local12.aFloat9 + local8.aFloat11 * local12.aFloat11;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass109_Sub1_35.anInt2986;
		@Pc(255) int local255 = this.aClass109_Sub1_35.anInt2992;
		if (!this.aBoolean336) {
			this.method4208();
		}
		Static168.anIntArray265[0] = this.aShort63;
		Static46.anIntArray58[0] = this.aShort62;
		Static168.anIntArray265[1] = this.aShort56;
		Static78.anIntArray143[0] = this.aShort60;
		Static46.anIntArray58[1] = this.aShort62;
		Static168.anIntArray265[2] = this.aShort63;
		Static78.anIntArray143[1] = this.aShort60;
		Static46.anIntArray58[2] = this.aShort59;
		Static168.anIntArray265[3] = this.aShort56;
		Static78.anIntArray143[2] = this.aShort60;
		Static46.anIntArray58[3] = this.aShort59;
		Static78.anIntArray143[3] = this.aShort60;
		Static168.anIntArray265[4] = this.aShort63;
		Static46.anIntArray58[4] = this.aShort62;
		Static78.anIntArray143[4] = this.aShort55;
		Static168.anIntArray265[5] = this.aShort56;
		Static46.anIntArray58[5] = this.aShort62;
		Static78.anIntArray143[5] = this.aShort55;
		Static168.anIntArray265[6] = this.aShort63;
		Static46.anIntArray58[6] = this.aShort59;
		Static168.anIntArray265[7] = this.aShort56;
		Static78.anIntArray143[6] = this.aShort55;
		Static46.anIntArray58[7] = this.aShort59;
		Static78.anIntArray143[7] = this.aShort55;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(395) float local395;
		@Pc(400) float local400;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static168.anIntArray265[local383];
			local395 = Static46.anIntArray58[local383];
			local400 = Static78.anIntArray143[local383];
			local414 = local33 + Static382.aFloat89 * local390 + Static103.aFloat32 * local395 + local400 * Static381.aFloat81;
			local428 = local54 + local400 * Static96.aFloat31 + Static433.aFloat94 * local395 + local390 * Static317.aFloat65;
			local442 = Static357.aFloat86 * local390 + Static411.aFloat91 * local395 + Static26.aFloat68 * local400 + local129;
			if (local442 >= (float) this.aClass109_Sub1_35.anInt2989) {
				@Pc(461) float local461 = (float) this.aClass109_Sub1_35.anInt3015 + (float) local251 * local414 / local442;
				@Pc(473) float local473 = (float) local255 * local428 / local442 + (float) this.aClass109_Sub1_35.anInt3016;
				if (local241 > local461) {
					local241 = local461;
				}
				if (local461 > local243) {
					local243 = local461;
				}
				if (local247 < local473) {
					local247 = local473;
				}
				local239 = true;
				if (local245 > local473) {
					local245 = local473;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && (float) arg1 > local245 && (float) arg1 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt5213 > Static313.anIntArray441.length) {
				Static106.anIntArray174 = new int[this.anInt5213];
				Static313.anIntArray441 = new int[this.anInt5213];
			}
			@Pc(618) int local618;
			for (@Pc(544) int local544 = 0; local544 < this.anInt5227; local544++) {
				local395 = this.anIntArray412[local544];
				local400 = this.anIntArray415[local544];
				local390 = this.anIntArray414[local544];
				local414 = Static381.aFloat81 * local400 + Static103.aFloat32 * local395 + Static382.aFloat89 * local390 + local33;
				local428 = local395 * Static433.aFloat94 + local390 * Static317.aFloat65 + local400 * Static96.aFloat31 + local54;
				local442 = local129 + local395 * Static411.aFloat91 + local390 * Static357.aFloat86 + local400 * Static26.aFloat68;
				@Pc(625) int local625;
				@Pc(627) int local627;
				@Pc(636) int local636;
				if ((float) this.aClass109_Sub1_35.anInt2989 <= local442) {
					local618 = (int) ((float) this.aClass109_Sub1_35.anInt3015 + (float) local251 * local414 / local442);
					local625 = (int) ((float) this.aClass109_Sub1_35.anInt3016 + (float) local255 * local428 / local442);
					local627 = this.anIntArray411[local544];
					local636 = this.anIntArray411[local544 + 1];
					for (@Pc(698) int local698 = local627; local698 < local636; local698++) {
						@Pc(707) int local707 = this.aShortArray69[local698] - 1;
						if (local707 == -1) {
							break;
						}
						Static313.anIntArray441[local707] = local618;
						Static106.anIntArray174[local707] = local625;
					}
				} else {
					local618 = this.anIntArray411[local544];
					local625 = this.anIntArray411[local544 + 1];
					for (local627 = local618; local627 < local625; local627++) {
						local636 = this.aShortArray69[local627] - 1;
						if (local636 == -1) {
							break;
						}
						Static313.anIntArray441[this.aShortArray69[local627] - 1] = -999999;
					}
				}
			}
			for (local618 = 0; local618 < this.anInt5204; local618++) {
				if (Static313.anIntArray441[this.aShortArray68[local618]] != -999999 && Static313.anIntArray441[this.aShortArray67[local618]] != -999999 && Static313.anIntArray441[this.aShortArray62[local618]] != -999999 && this.method4200(Static106.anIntArray174[this.aShortArray62[local618]], Static313.anIntArray441[this.aShortArray68[local618]], Static313.anIntArray441[this.aShortArray62[local618]], Static106.anIntArray174[this.aShortArray68[local618]], arg1, Static106.anIntArray174[this.aShortArray67[local618]], arg0, Static313.anIntArray441[this.aShortArray67[local618]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!or", name = "N", descriptor = "(SS)V")
	@Override
	public void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5204; local3++) {
			if (arg0 == this.aShortArray72[local3]) {
				this.aShortArray72[local3] = arg1;
			}
		}
		if (this.aClass156Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt5189; local30++) {
				@Pc(37) Class156 local37 = this.aClass156Array1[local30];
				@Pc(42) Class175 local42 = this.aClass175Array1[local30];
				local42.anInt4950 = local42.anInt4950 & 0xFF000000 | Static389.anIntArray561[this.aShortArray72[local37.anInt4482] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass58_12 != null) {
			this.aClass58_12.anInterface1_1 = null;
		}
	}
}
