import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class128_Sub3 extends Class128 {

	@OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
	private int anInt7463;

	@OriginalMember(owner = "client!oca", name = "y", descriptor = "I")
	private int anInt7468;

	@OriginalMember(owner = "client!oca", name = "E", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!oca", name = "H", descriptor = "Lclient!ti;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!oca", name = "M", descriptor = "Lclient!ti;")
	private Class318 aClass318_2;

	@OriginalMember(owner = "client!oca", name = "N", descriptor = "I")
	private int anInt7476;

	@OriginalMember(owner = "client!oca", name = "R", descriptor = "Lclient!ti;")
	private Class318 aClass318_3;

	@OriginalMember(owner = "client!oca", name = "T", descriptor = "I")
	private int anInt7481;

	@OriginalMember(owner = "client!oca", name = "Z", descriptor = "I")
	private int anInt7486;

	@OriginalMember(owner = "client!oca", name = "cb", descriptor = "I")
	private int anInt7487;

	@OriginalMember(owner = "client!oca", name = "rb", descriptor = "I")
	private int anInt7496;

	@OriginalMember(owner = "client!oca", name = "tb", descriptor = "Z")
	private boolean aBoolean642;

	@OriginalMember(owner = "client!oca", name = "Eb", descriptor = "Lclient!ffa;")
	private Class96 aClass96_1;

	@OriginalMember(owner = "client!oca", name = "Fb", descriptor = "I")
	private int anInt7506;

	@OriginalMember(owner = "client!oca", name = "Pb", descriptor = "I")
	private int anInt7512;

	@OriginalMember(owner = "client!oca", name = "Ub", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_13;

	@OriginalMember(owner = "client!oca", name = "Xb", descriptor = "I")
	private int anInt7519;

	@OriginalMember(owner = "client!oca", name = "Zb", descriptor = "Z")
	private boolean aBoolean643;

	@OriginalMember(owner = "client!oca", name = "ac", descriptor = "Lclient!ti;")
	private Class318 aClass318_4;

	@OriginalMember(owner = "client!oca", name = "fc", descriptor = "Lclient!ul;")
	private Class340 aClass340_1;

	@OriginalMember(owner = "client!oca", name = "wc", descriptor = "I")
	private int anInt7529;

	@OriginalMember(owner = "client!oca", name = "xc", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!oca", name = "xb", descriptor = "I")
	private int anInt7501;

	@OriginalMember(owner = "client!oca", name = "Bb", descriptor = "I")
	private int anInt7503;

	@OriginalMember(owner = "client!oca", name = "tc", descriptor = "Z")
	private boolean aBoolean644;

	@OriginalMember(owner = "client!oca", name = "fb", descriptor = "Z")
	private boolean aBoolean641;

	@OriginalMember(owner = "client!oca", name = "X", descriptor = "I")
	private int anInt7484;

	@OriginalMember(owner = "client!oca", name = "dc", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!oca", name = "Ab", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
	private int anInt7467;

	@OriginalMember(owner = "client!oca", name = "zb", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!oca", name = "kc", descriptor = "[Lclient!al;")
	private Class18[] aClass18Array5;

	@OriginalMember(owner = "client!oca", name = "hc", descriptor = "[Lclient!mi;")
	private Class215[] aClass215Array5;

	@OriginalMember(owner = "client!oca", name = "Gc", descriptor = "I")
	private int anInt7537;

	@OriginalMember(owner = "client!oca", name = "oc", descriptor = "[Lclient!bc;")
	private Class27[] aClass27Array1;

	@OriginalMember(owner = "client!oca", name = "Lc", descriptor = "[Lclient!vb;")
	private Class347[] aClass347Array1;

	@OriginalMember(owner = "client!oca", name = "ob", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!oca", name = "bb", descriptor = "[F")
	private float[] aFloatArray59;

	@OriginalMember(owner = "client!oca", name = "ic", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!oca", name = "gb", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!oca", name = "vc", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!oca", name = "t", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!oca", name = "qc", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!oca", name = "Nc", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!oca", name = "Hb", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!oca", name = "uc", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!oca", name = "rc", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!oca", name = "W", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!oca", name = "kb", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!oca", name = "gc", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!oca", name = "Mb", descriptor = "[S")
	private short[] aShortArray117;

	@OriginalMember(owner = "client!oca", name = "jc", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!oca", name = "J", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!oca", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!oca", name = "K", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!oca", name = "yc", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!oca", name = "Ib", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!oca", name = "Hc", descriptor = "[[I")
	private int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!oca", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!oca", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray72;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!bm;Lclient!id;IIII)V")
	public Class128_Sub3(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface5 local11 = arg0.anInterface5_11;
		@Pc(15) int[] local15 = new int[arg1.anInt5154];
		this.anIntArray469 = new int[arg1.anInt5152 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5154; local24++) {
			if (arg1.aByteArray54 == null || arg1.aByteArray54[local24] != 2) {
				if (arg1.aShortArray75 != null && arg1.aShortArray75[local24] != -1) {
					@Pc(54) Class156 local54 = local11.method6869(arg1.aShortArray75[local24] & 0xFFFF);
					if (((this.anInt7529 & 0x40) == 0 || !local54.aBoolean497) && local54.aBoolean496) {
						continue;
					}
				}
				local15[this.anInt7501++] = local24;
				this.anIntArray469[arg1.aShortArray68[local24]]++;
				this.anIntArray469[arg1.aShortArray74[local24]]++;
				this.anIntArray469[arg1.aShortArray73[local24]]++;
			}
		}
		this.anInt7503 = this.anInt7501;
		@Pc(123) long[] local123 = new long[this.anInt7501];
		@Pc(135) boolean local135 = (this.anInt7468 & 0x100) != 0;
		@Pc(147) int local147;
		@Pc(160) int local160;
		@Pc(319) int local319;
		for (@Pc(137) int local137 = 0; local137 < this.anInt7501; local137++) {
			@Pc(143) int local143 = local15[local137];
			@Pc(145) Class156 local145 = null;
			local147 = 0;
			@Pc(149) byte local149 = 0;
			@Pc(151) byte local151 = 0;
			@Pc(153) byte local153 = 0;
			if (arg1.aClass223Array1 != null) {
				@Pc(158) boolean local158 = false;
				for (local160 = 0; local160 < arg1.aClass223Array1.length; local160++) {
					@Pc(167) Class223 local167 = arg1.aClass223Array1[local160];
					if (local167.anInt6988 == local143) {
						@Pc(176) Class346 local176 = Static328.method5503(local167.anInt6992);
						if (local176.aBoolean809) {
							local158 = true;
						}
						if (local176.anInt9795 != -1) {
							@Pc(192) Class156 local192 = local11.method6869(local176.anInt9795);
							if (local192.anInt5679 == 2) {
								this.aBoolean644 = true;
							}
						}
					}
				}
				if (local158) {
					local123[local137] = Long.MAX_VALUE;
					this.anInt7503--;
					continue;
				}
			}
			@Pc(223) short local223 = -1;
			if (arg1.aShortArray75 != null) {
				local223 = arg1.aShortArray75[local143];
				if (local223 != -1) {
					local145 = local11.method6869(local223 & 0xFFFF);
					if ((this.anInt7529 & 0x40) != 0 && local145.aBoolean497) {
						local223 = -1;
						local145 = null;
					} else {
						local153 = local145.aByte72;
						local151 = local145.aByte69;
					}
				}
			}
			@Pc(281) boolean local281 = arg1.aByteArray51 != null && arg1.aByteArray51[local143] != 0 || local145 != null && local145.anInt5679 != 0;
			if ((local135 || local281) && arg1.aByteArray53 != null) {
				local147 += arg1.aByteArray53[local143] << 17;
			}
			if (local281) {
				local147 += 65536;
			}
			local147 += (local151 & 0xFF) << 8;
			local319 = local149 + ((local223 & 0xFFFF) << 16);
			local147 += local153 & 0xFF;
			@Pc(331) int local331 = local319 + (local137 & 0xFFFF);
			local123[local137] = ((long) local147 << 32) + ((long) local331);
			this.aBoolean641 |= local145 != null && (local145.aByte68 != 0 || local145.aByte73 != 0);
			this.aBoolean644 |= local281;
		}
		Static542.method7686(local15, local123);
		this.anInt7484 = arg1.anInt5152;
		this.anIntArray468 = arg1.anIntArray293;
		this.anIntArray465 = arg1.anIntArray301;
		this.aShortArray113 = arg1.aShortArray72;
		this.anInt7467 = arg1.anInt5171;
		this.anIntArray464 = arg1.anIntArray299;
		this.aClass18Array5 = arg1.aClass18Array4;
		@Pc(412) Class90[] local412 = new Class90[this.anInt7484];
		this.aClass215Array5 = arg1.aClass215Array4;
		@Pc(436) int local436;
		@Pc(450) int local450;
		@Pc(488) int local488;
		if (arg1.aClass223Array1 != null) {
			this.anInt7537 = arg1.aClass223Array1.length;
			this.aClass27Array1 = new Class27[this.anInt7537];
			this.aClass347Array1 = new Class347[this.anInt7537];
			for (local436 = 0; local436 < this.anInt7537; local436++) {
				@Pc(443) Class223 local443 = arg1.aClass223Array1[local436];
				@Pc(448) Class346 local448 = Static328.method5503(local443.anInt6992);
				local450 = -1;
				for (@Pc(452) int local452 = 0; local452 < this.anInt7501; local452++) {
					if (local15[local452] == local443.anInt6988) {
						local450 = local452;
						break;
					}
				}
				if (local450 == -1) {
					throw new RuntimeException();
				}
				local488 = Static120.anIntArray152[arg1.aShortArray70[local443.anInt6988] & 0xFFFF] & 0xFFFFFF;
				@Pc(506) int local506 = local488 | 255 - (arg1.aByteArray51 == null ? 0 : arg1.aByteArray51[local443.anInt6988]) << 24;
				this.aClass347Array1[local436] = new Class347(local450, arg1.aShortArray68[local443.anInt6988], arg1.aShortArray74[local443.anInt6988], arg1.aShortArray73[local443.anInt6988], local448.anInt9796, local448.anInt9797, local448.anInt9795, local448.anInt9794, local448.anInt9798, local448.aBoolean809, local448.aBoolean808, local443.anInt6994);
				this.aClass27Array1[local436] = new Class27(local506);
			}
		}
		local436 = this.anInt7501 * 3;
		this.aByteArray76 = new byte[this.anInt7501];
		this.aFloatArray59 = new float[local436];
		this.aShortArray119 = new short[this.anInt7501];
		this.aShortArray115 = new short[this.anInt7501];
		this.aShortArray123 = new short[local436];
		this.aShortArray112 = new short[this.anInt7501];
		this.aShortArray121 = new short[local436];
		this.aShort99 = (short) arg3;
		this.aShortArray116 = new short[this.anInt7501];
		this.aByteArray77 = new byte[local436];
		this.aShortArray122 = new short[local436];
		this.aShort98 = (short) arg4;
		this.aFloatArray60 = new float[local436];
		if (arg1.aShortArray71 != null) {
			this.aShortArray118 = new short[this.anInt7501];
		}
		this.aShortArray117 = new short[local436];
		Static584.aLongArray15 = new long[local436];
		this.aShortArray120 = new short[local436];
		this.aShortArray114 = new short[local436];
		this.lb = new short[this.anInt7501];
		local147 = 0;
		for (local319 = 0; local319 < arg1.anInt5152; local319++) {
			local450 = this.anIntArray469[local319];
			this.anIntArray469[local319] = local147;
			local147 += local450;
			local412[local319] = new Class90();
		}
		this.anIntArray469[arg1.anInt5152] = local147;
		@Pc(696) Class382 local696 = Static243.method4636(local15, this.anInt7501, arg1);
		@Pc(700) Class336[] local700 = new Class336[arg1.anInt5154];
		@Pc(740) int local740;
		@Pc(750) int local750;
		@Pc(761) int local761;
		@Pc(719) short local719;
		@Pc(729) int local729;
		for (local488 = 0; local488 < arg1.anInt5154; local488++) {
			@Pc(709) short local709 = arg1.aShortArray68[local488];
			@Pc(714) short local714 = arg1.aShortArray74[local488];
			local719 = arg1.aShortArray73[local488];
			local729 = this.anIntArray465[local714] - this.anIntArray465[local709];
			local740 = this.anIntArray468[local714] - this.anIntArray468[local709];
			local750 = this.anIntArray464[local714] - this.anIntArray464[local709];
			local761 = this.anIntArray465[local719] - this.anIntArray465[local709];
			@Pc(772) int local772 = this.anIntArray468[local719] - this.anIntArray468[local709];
			@Pc(783) int local783 = this.anIntArray464[local719] - this.anIntArray464[local709];
			@Pc(792) int local792 = local783 * local740 - local772 * local750;
			@Pc(800) int local800 = local761 * local750 - local783 * local729;
			@Pc(808) int local808;
			for (local808 = local772 * local729 - local740 * local761; local792 > 8192 || local800 > 8192 || local808 > 8192 || local792 < -8192 || local800 < -8192 || local808 < -8192; local808 >>= 0x1) {
				local792 >>= 0x1;
				local800 >>= 0x1;
			}
			@Pc(865) int local865 = (int) Math.sqrt((double) (local800 * local800 + local792 * local792 + local808 * local808));
			if (local865 <= 0) {
				local865 = 1;
			}
			local808 = local808 * 256 / local865;
			local800 = local800 * 256 / local865;
			local792 = local792 * 256 / local865;
			@Pc(897) byte local897 = arg1.aByteArray54 == null ? 0 : arg1.aByteArray54[local488];
			if (local897 == 0) {
				@Pc(906) Class90 local906 = local412[local709];
				local906.anInt3524 += local792;
				local906.anInt3522 += local800;
				local906.anInt3523++;
				local906.anInt3525 += local808;
				@Pc(934) Class90 local934 = local412[local714];
				local934.anInt3525 += local808;
				local934.anInt3524 += local792;
				local934.anInt3523++;
				local934.anInt3522 += local800;
				@Pc(962) Class90 local962 = local412[local719];
				local962.anInt3525 += local808;
				local962.anInt3522 += local800;
				local962.anInt3523++;
				local962.anInt3524 += local792;
			} else if (local897 == 1) {
				@Pc(999) Class336 local999 = local700[local488] = new Class336();
				local999.anInt9690 = local800;
				local999.anInt9692 = local792;
				local999.anInt9693 = local808;
			}
		}
		@Pc(1025) int local1025;
		@Pc(1068) short local1068;
		for (local160 = 0; local160 < this.anInt7501; local160++) {
			local1025 = local15[local160];
			@Pc(1032) int local1032 = arg1.aShortArray70[local1025] & 0xFFFF;
			if (arg1.aByteArray56 == null) {
				local729 = -1;
			} else {
				local729 = arg1.aByteArray56[local1025];
			}
			if (arg1.aByteArray51 == null) {
				local740 = 0;
			} else {
				local740 = arg1.aByteArray51[local1025] & 0xFF;
			}
			local1068 = arg1.aShortArray75 == null ? -1 : arg1.aShortArray75[local1025];
			if (local1068 != -1 && (this.anInt7529 & 0x40) != 0) {
				@Pc(1084) Class156 local1084 = local11.method6869(local1068 & 0xFFFF);
				if (local1084.aBoolean497) {
					local1068 = -1;
				}
			}
			@Pc(1091) float local1091 = 0.0F;
			@Pc(1093) float local1093 = 0.0F;
			@Pc(1095) float local1095 = 0.0F;
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) float local1099 = 0.0F;
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) byte local1103 = 0;
			@Pc(1105) byte local1105 = 0;
			@Pc(1107) int local1107 = 0;
			@Pc(1124) byte local1124;
			@Pc(1141) short local1141;
			@Pc(1931) short local1931;
			@Pc(1936) short local1936;
			if (local1068 != -1) {
				if (local729 == -1) {
					local1103 = 1;
					local1099 = 0.0F;
					local1093 = 1.0F;
					local1091 = 0.0F;
					local1105 = 2;
					local1095 = 1.0F;
					local1097 = 1.0F;
					local1101 = 0.0F;
				} else {
					local729 &= 0xFF;
					local1124 = arg1.aByteArray52[local729];
					@Pc(1131) short local1131;
					@Pc(1136) short local1136;
					@Pc(1174) float local1174;
					@Pc(1397) float local1397;
					@Pc(1405) float local1405;
					@Pc(1502) float local1502;
					@Pc(1510) float local1510;
					@Pc(1518) float local1518;
					@Pc(1541) float local1541;
					@Pc(1564) float local1564;
					@Pc(1587) float local1587;
					if (local1124 == 0) {
						local1131 = arg1.aShortArray68[local1025];
						local1136 = arg1.aShortArray74[local1025];
						local1141 = arg1.aShortArray73[local1025];
						local1931 = arg1.aShortArray67[local729];
						local1936 = arg1.aShortArray66[local729];
						@Pc(1941) short local1941 = arg1.aShortArray69[local729];
						@Pc(1947) float local1947 = (float) arg1.anIntArray301[local1931];
						@Pc(1953) float local1953 = (float) arg1.anIntArray293[local1931];
						local1174 = arg1.anIntArray299[local1931];
						local1397 = (float) arg1.anIntArray301[local1936] - local1947;
						local1405 = (float) arg1.anIntArray293[local1936] - local1953;
						@Pc(1985) float local1985 = (float) arg1.anIntArray299[local1936] - local1174;
						@Pc(1994) float local1994 = (float) arg1.anIntArray301[local1941] - local1947;
						@Pc(2003) float local2003 = (float) arg1.anIntArray293[local1941] - local1953;
						@Pc(2012) float local2012 = (float) arg1.anIntArray299[local1941] - local1174;
						@Pc(2021) float local2021 = (float) arg1.anIntArray301[local1131] - local1947;
						@Pc(2030) float local2030 = (float) arg1.anIntArray293[local1131] - local1953;
						@Pc(2039) float local2039 = (float) arg1.anIntArray299[local1131] - local1174;
						@Pc(2047) float local2047 = (float) arg1.anIntArray301[local1136] - local1947;
						@Pc(2056) float local2056 = (float) arg1.anIntArray293[local1136] - local1953;
						local1502 = (float) arg1.anIntArray299[local1136] - local1174;
						local1510 = (float) arg1.anIntArray301[local1141] - local1947;
						local1518 = (float) arg1.anIntArray293[local1141] - local1953;
						local1541 = (float) arg1.anIntArray299[local1141] - local1174;
						local1564 = local2012 * local1405 - local1985 * local2003;
						local1587 = local1994 * local1985 - local1397 * local2012;
						@Pc(2117) float local2117 = local2003 * local1397 - local1994 * local1405;
						@Pc(2125) float local2125 = local2003 * local2117 - local2012 * local1587;
						@Pc(2133) float local2133 = local1564 * local2012 - local1994 * local2117;
						@Pc(2141) float local2141 = local1587 * local1994 - local2003 * local1564;
						@Pc(2155) float local2155 = 1.0F / (local2141 * local1985 + local1397 * local2125 + local2133 * local1405);
						local1091 = (local2021 * local2125 + local2133 * local2030 + local2141 * local2039) * local2155;
						local1095 = (local1502 * local2141 + local2125 * local2047 + local2056 * local2133) * local2155;
						local1099 = (local1541 * local2141 + local2133 * local1518 + local2125 * local1510) * local2155;
						@Pc(2206) float local2206 = local1397 * local1587 - local1564 * local1405;
						@Pc(2214) float local2214 = local1405 * local2117 - local1587 * local1985;
						@Pc(2223) float local2223 = local1985 * local1564 - local2117 * local1397;
						@Pc(2237) float local2237 = 1.0F / (local2223 * local2003 + local2214 * local1994 + local2012 * local2206);
						local1097 = local2237 * (local1502 * local2206 + local2214 * local2047 + local2056 * local2223);
						local1101 = local2237 * (local2206 * local1541 + local2214 * local1510 + local1518 * local2223);
						local1093 = (local2039 * local2206 + local2214 * local2021 + local2030 * local2223) * local2237;
					} else {
						local1131 = arg1.aShortArray68[local1025];
						local1136 = arg1.aShortArray74[local1025];
						local1141 = arg1.aShortArray73[local1025];
						@Pc(1146) int local1146 = local696.anIntArray631[local729];
						@Pc(1151) int local1151 = local696.anIntArray630[local729];
						@Pc(1156) int local1156 = local696.anIntArray629[local729];
						@Pc(1161) float[] local1161 = local696.aFloatArrayArray18[local729];
						@Pc(1166) byte local1166 = arg1.aByteArray55[local729];
						local1174 = (float) arg1.anIntArray295[local729] / 256.0F;
						if (local1124 == 1) {
							local1397 = (float) arg1.anIntArray303[local729] / 1024.0F;
							Static430.method6593(arg1.anIntArray293[local1131], local1397, local1174, local1161, local1146, local1156, local1151, arg1.anIntArray299[local1131], arg1.anIntArray301[local1131], local1166, Static44.aFloatArray25);
							local1093 = Static44.aFloatArray25[1];
							local1091 = Static44.aFloatArray25[0];
							Static430.method6593(arg1.anIntArray293[local1136], local1397, local1174, local1161, local1146, local1156, local1151, arg1.anIntArray299[local1136], arg1.anIntArray301[local1136], local1166, Static44.aFloatArray25);
							local1097 = Static44.aFloatArray25[1];
							local1095 = Static44.aFloatArray25[0];
							Static430.method6593(arg1.anIntArray293[local1141], local1397, local1174, local1161, local1146, local1156, local1151, arg1.anIntArray299[local1141], arg1.anIntArray301[local1141], local1166, Static44.aFloatArray25);
							local1101 = Static44.aFloatArray25[1];
							local1099 = Static44.aFloatArray25[0];
							local1405 = local1397 / 2.0F;
							if ((local1166 & 0x1) == 0) {
								if (local1405 < local1099 - local1091) {
									local1099 -= local1397;
									local1105 = 1;
								} else if (local1405 < local1091 - local1099) {
									local1099 += local1397;
									local1105 = 2;
								}
								if (local1095 - local1091 > local1405) {
									local1095 -= local1397;
									local1103 = 1;
								} else if (local1405 < local1091 - local1095) {
									local1103 = 2;
									local1095 += local1397;
								}
							} else {
								if (local1101 - local1093 > local1405) {
									local1101 -= local1397;
									local1105 = 1;
								} else if (local1405 < local1093 - local1101) {
									local1101 += local1397;
									local1105 = 2;
								}
								if (local1097 - local1093 > local1405) {
									local1103 = 1;
									local1097 -= local1397;
								} else if (local1405 < local1093 - local1097) {
									local1097 += local1397;
									local1103 = 2;
								}
							}
						} else if (local1124 == 2) {
							local1397 = (float) arg1.anIntArray300[local729] / 256.0F;
							local1405 = (float) arg1.anIntArray296[local729] / 256.0F;
							@Pc(1415) int local1415 = arg1.anIntArray301[local1136] - arg1.anIntArray301[local1131];
							@Pc(1426) int local1426 = arg1.anIntArray293[local1136] - arg1.anIntArray293[local1131];
							@Pc(1437) int local1437 = arg1.anIntArray299[local1136] - arg1.anIntArray299[local1131];
							@Pc(1447) int local1447 = arg1.anIntArray301[local1141] - arg1.anIntArray301[local1131];
							@Pc(1458) int local1458 = arg1.anIntArray293[local1141] - arg1.anIntArray293[local1131];
							@Pc(1468) int local1468 = arg1.anIntArray299[local1141] - arg1.anIntArray299[local1131];
							@Pc(1476) int local1476 = local1468 * local1426 - local1458 * local1437;
							@Pc(1485) int local1485 = local1437 * local1447 - local1415 * local1468;
							@Pc(1494) int local1494 = local1458 * local1415 - local1447 * local1426;
							local1502 = 64.0F / (float) arg1.anIntArray302[local729];
							local1510 = 64.0F / (float) arg1.anIntArray294[local729];
							local1518 = 64.0F / (float) arg1.anIntArray303[local729];
							local1541 = (local1161[2] * (float) local1494 + (float) local1476 * local1161[0] + local1161[1] * (float) local1485) / local1502;
							local1564 = (local1161[3] * (float) local1476 + local1161[4] * (float) local1485 + local1161[5] * (float) local1494) / local1510;
							local1587 = (local1161[7] * (float) local1485 + local1161[6] * (float) local1476 + local1161[8] * (float) local1494) / local1518;
							local1107 = Static394.method6308(local1541, local1587, local1564);
							Static622.method7869(local1166, local1156, local1174, local1107, local1405, Static44.aFloatArray25, arg1.anIntArray293[local1131], local1146, local1151, local1161, arg1.anIntArray299[local1131], arg1.anIntArray301[local1131], local1397);
							local1091 = Static44.aFloatArray25[0];
							local1093 = Static44.aFloatArray25[1];
							Static622.method7869(local1166, local1156, local1174, local1107, local1405, Static44.aFloatArray25, arg1.anIntArray293[local1136], local1146, local1151, local1161, arg1.anIntArray299[local1136], arg1.anIntArray301[local1136], local1397);
							local1095 = Static44.aFloatArray25[0];
							local1097 = Static44.aFloatArray25[1];
							Static622.method7869(local1166, local1156, local1174, local1107, local1405, Static44.aFloatArray25, arg1.anIntArray293[local1141], local1146, local1151, local1161, arg1.anIntArray299[local1141], arg1.anIntArray301[local1141], local1397);
							local1101 = Static44.aFloatArray25[1];
							local1099 = Static44.aFloatArray25[0];
						} else if (local1124 == 3) {
							Static35.method700(Static44.aFloatArray25, arg1.anIntArray293[local1131], local1166, local1161, local1174, local1151, arg1.anIntArray299[local1131], local1146, arg1.anIntArray301[local1131], local1156);
							local1093 = Static44.aFloatArray25[1];
							local1091 = Static44.aFloatArray25[0];
							Static35.method700(Static44.aFloatArray25, arg1.anIntArray293[local1136], local1166, local1161, local1174, local1151, arg1.anIntArray299[local1136], local1146, arg1.anIntArray301[local1136], local1156);
							local1095 = Static44.aFloatArray25[0];
							local1097 = Static44.aFloatArray25[1];
							Static35.method700(Static44.aFloatArray25, arg1.anIntArray293[local1141], local1166, local1161, local1174, local1151, arg1.anIntArray299[local1141], local1146, arg1.anIntArray301[local1141], local1156);
							local1101 = Static44.aFloatArray25[1];
							local1099 = Static44.aFloatArray25[0];
							if ((local1166 & 0x1) == 0) {
								if (local1099 - local1091 > 0.5F) {
									local1099--;
									local1105 = 1;
								} else if (local1091 - local1099 > 0.5F) {
									local1099++;
									local1105 = 2;
								}
								if (local1095 - local1091 > 0.5F) {
									local1103 = 1;
									local1095--;
								} else if (local1091 - local1095 > 0.5F) {
									local1095++;
									local1103 = 2;
								}
							} else {
								if (local1101 - local1093 > 0.5F) {
									local1105 = 1;
									local1101--;
								} else if (local1093 - local1101 > 0.5F) {
									local1101++;
									local1105 = 2;
								}
								if (local1097 - local1093 > 0.5F) {
									local1097--;
									local1103 = 1;
								} else if (local1093 - local1097 > 0.5F) {
									local1097++;
									local1103 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray54 == null) {
				local1124 = 0;
			} else {
				local1124 = arg1.aByteArray54[local1025];
			}
			if (local1124 == 0) {
				@Pc(2332) long local2332 = ((long) local740 + (long) (local1107 << 24) + (long) (local1032 << 8) << 32) + (long) (local729 << 2);
				local1141 = arg1.aShortArray68[local1025];
				local1931 = arg1.aShortArray74[local1025];
				local1936 = arg1.aShortArray73[local1025];
				@Pc(2351) Class90 local2351 = local412[local1141];
				this.aShortArray115[local160] = this.method6314(local1141, arg1, local2351.anInt3524, local2332, local1093, local160, local2351.anInt3523, local2351.anInt3522, local1091, local2351.anInt3525);
				@Pc(2376) Class90 local2376 = local412[local1931];
				this.aShortArray116[local160] = this.method6314(local1931, arg1, local2376.anInt3524, local2332 + (long) local1103, local1097, local160, local2376.anInt3523, local2376.anInt3522, local1095, local2376.anInt3525);
				@Pc(2404) Class90 local2404 = local412[local1936];
				this.aShortArray119[local160] = this.method6314(local1936, arg1, local2404.anInt3524, local2332 + (long) local1105, local1101, local160, local2404.anInt3523, local2404.anInt3522, local1099, local2404.anInt3525);
			} else if (local1124 == 1) {
				@Pc(2439) Class336 local2439 = local700[local1025];
				@Pc(2482) long local2482 = (long) ((local2439.anInt9693 + 256 << 22) + ((local729 << 2) + (local2439.anInt9692 <= 0 ? 2048 : 1024) + (local2439.anInt9690 + 256 << 12))) + ((long) (local1107 << 24) + (long) (local1032 << 8) + (long) local740 << 32);
				this.aShortArray115[local160] = this.method6314(arg1.aShortArray68[local1025], arg1, local2439.anInt9692, local2482, local1093, local160, 0, local2439.anInt9690, local1091, local2439.anInt9693);
				this.aShortArray116[local160] = this.method6314(arg1.aShortArray74[local1025], arg1, local2439.anInt9692, (long) local1103 + local2482, local1097, local160, 0, local2439.anInt9690, local1095, local2439.anInt9693);
				this.aShortArray119[local160] = this.method6314(arg1.aShortArray73[local1025], arg1, local2439.anInt9692, local2482 + (long) local1105, local1101, local160, 0, local2439.anInt9690, local1099, local2439.anInt9693);
			}
			if (arg1.aByteArray51 != null) {
				this.aByteArray76[local160] = arg1.aByteArray51[local1025];
			}
			if (arg1.aShortArray71 != null) {
				this.aShortArray118[local160] = arg1.aShortArray71[local1025];
			}
			this.aShortArray112[local160] = arg1.aShortArray70[local1025];
			this.lb[local160] = local1068;
		}
		if (this.anInt7503 > 0) {
			local1025 = 1;
			local719 = this.lb[0];
			for (local729 = 0; local729 < this.anInt7503; local729++) {
				@Pc(2619) short local2619 = this.lb[local729];
				if (local719 != local2619) {
					local1025++;
					local719 = local2619;
				}
			}
			this.anIntArray463 = new int[local1025];
			this.anIntArray470 = new int[local1025];
			this.anIntArray466 = new int[local1025 + 1];
			this.anIntArray466[0] = 0;
			local740 = this.anInt7512;
			local1068 = 0;
			local1025 = 0;
			local719 = this.lb[0];
			for (local761 = 0; local761 < this.anInt7503; local761++) {
				@Pc(2670) short local2670 = this.lb[local761];
				if (local2670 != local719) {
					this.anIntArray470[local1025] = local740;
					this.anIntArray463[local1025] = local1068 + 1 - local740;
					local1025++;
					this.anIntArray466[local1025] = local761;
					local719 = local2670;
					local740 = this.anInt7512;
					local1068 = 0;
				}
				@Pc(2706) short local2706 = this.aShortArray115[local761];
				if (local2706 > local1068) {
					local1068 = local2706;
				}
				if (local2706 < local740) {
					local740 = local2706;
				}
				local2706 = this.aShortArray116[local761];
				if (local1068 < local2706) {
					local1068 = local2706;
				}
				if (local740 > local2706) {
					local740 = local2706;
				}
				local2706 = this.aShortArray119[local761];
				if (local740 > local2706) {
					local740 = local2706;
				}
				if (local1068 < local2706) {
					local1068 = local2706;
				}
			}
			this.anIntArray470[local1025] = local740;
			this.anIntArray463[local1025] = local1068 + 1 - local740;
			local1025++;
			this.anIntArray466[local1025] = this.anInt7503;
		}
		Static584.aLongArray15 = null;
		this.aShortArray121 = Static70.method1782(this.anInt7512, this.aShortArray121);
		this.aShortArray120 = Static70.method1782(this.anInt7512, this.aShortArray120);
		this.aShortArray123 = Static70.method1782(this.anInt7512, this.aShortArray123);
		this.aShortArray117 = Static70.method1782(this.anInt7512, this.aShortArray117);
		this.aShortArray114 = Static70.method1782(this.anInt7512, this.aShortArray114);
		this.aByteArray77 = Static342.method5641(this.anInt7512, this.aByteArray77);
		this.aFloatArray59 = Static491.method7211(this.aFloatArray59, this.anInt7512);
		this.aFloatArray60 = Static491.method7211(this.aFloatArray60, this.anInt7512);
		if (arg1.anIntArray297 != null && Static51.method1166(this.anInt7529, arg2)) {
			this.anIntArrayArray73 = arg1.method4363(false);
		}
		if (arg1.aClass223Array1 != null && Static178.method3628(arg2, this.anInt7529)) {
			this.anIntArrayArray71 = arg1.method4364();
		}
		if (arg1.anIntArray298 != null && Static493.method7237(this.anInt7529, arg2)) {
			local1025 = 0;
			@Pc(2898) int[] local2898 = new int[256];
			for (local729 = 0; local729 < this.anInt7501; local729++) {
				local740 = arg1.anIntArray298[local15[local729]];
				if (local740 >= 0) {
					if (local1025 < local740) {
						local1025 = local740;
					}
					@Pc(2927) int local2927 = local2898[local740]++;
				}
			}
			this.anIntArrayArray72 = new int[local1025 + 1][];
			for (local740 = 0; local740 <= local1025; local740++) {
				this.anIntArrayArray72[local740] = new int[local2898[local740]];
				local2898[local740] = 0;
			}
			for (local750 = 0; local750 < this.anInt7501; local750++) {
				local761 = arg1.anIntArray298[local15[local750]];
				if (local761 >= 0) {
					this.anIntArrayArray72[local761][local2898[local761]++] = local750;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!bm;IIZZ)V")
	public Class128_Sub3(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7484 = 0;
		this.anInt7503 = 0;
		this.anInt7467 = 0;
		this.anInt7512 = 0;
		this.aBoolean643 = false;
		this.aBoolean642 = false;
		this.aBoolean644 = false;
		this.aBoolean641 = false;
		this.aBoolean640 = true;
		this.anInt7501 = 0;
		this.anInt7468 = arg1;
		this.aBoolean642 = arg4;
		this.anInt7529 = arg2;
		this.aClass33_Sub1_13 = arg0;
		if (arg3 || Static78.method1880(this.anInt7529, this.anInt7468)) {
			this.aClass318_1 = new Class318(Static631.method8541(this.anInt7468, this.anInt7529));
		}
		if (arg3 || Static7.method101(this.anInt7468, this.anInt7529)) {
			this.aClass318_3 = new Class318(Static25.method426(this.anInt7529, this.anInt7468));
		}
		if (arg3 || Static509.method7394(this.anInt7529, this.anInt7468)) {
			this.aClass318_2 = new Class318(Static350.method5752(this.anInt7529, this.anInt7468));
		}
		if (arg3 || Static232.method4483(this.anInt7529, this.anInt7468)) {
			this.aClass318_4 = new Class318(Static618.method8385(this.anInt7529, this.anInt7468));
		}
		if (arg3 || Static266.method6987(this.anInt7468, this.anInt7529)) {
			this.aClass96_1 = new Class96(Static420.method6551(this.anInt7529, this.anInt7468));
		}
	}

	@OriginalMember(owner = "client!oca", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static185.anInt4395 = 0;
			Static470.anInt8512 = 0;
			local16 = 0;
			Static409.anInt6025 = 0;
			for (local20 = 0; local20 < this.anInt7484; local20++) {
				Static409.anInt6025 += this.anIntArray465[local20];
				Static185.anInt4395 += this.anIntArray468[local20];
				local16++;
				Static470.anInt8512 += this.anIntArray464[local20];
			}
			if (local16 <= 0) {
				Static470.anInt8512 = arg3;
				Static185.anInt4395 = arg2;
				Static409.anInt6025 = arg1;
			} else {
				Static409.anInt6025 = Static409.anInt6025 / local16 + arg1;
				Static185.anInt4395 = arg2 + Static185.anInt4395 / local16;
				Static470.anInt8512 = Static470.anInt8512 / local16 + arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt7484; local16++) {
				this.anIntArray465[local16] += arg1;
				this.anIntArray468[local16] += arg2;
				this.anIntArray464[local16] += arg3;
			}
		} else {
			@Pc(159) int local159;
			@Pc(177) int local177;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt7484; local16++) {
					this.anIntArray465[local16] -= Static409.anInt6025;
					this.anIntArray468[local16] -= Static185.anInt4395;
					this.anIntArray464[local16] -= Static470.anInt8512;
					if (arg3 != 0) {
						local20 = Class3_Sub1_Sub2.anIntArray84[arg3];
						local159 = Class3_Sub1_Sub2.anIntArray85[arg3];
						local177 = local159 * this.anIntArray465[local16] + local20 * this.anIntArray468[local16] + 16383 >> 14;
						this.anIntArray468[local16] = this.anIntArray468[local16] * local159 + 16383 - local20 * this.anIntArray465[local16] >> 14;
						this.anIntArray465[local16] = local177;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub1_Sub2.anIntArray84[arg1];
						local159 = Class3_Sub1_Sub2.anIntArray85[arg1];
						local177 = this.anIntArray468[local16] * local159 + 16383 - this.anIntArray464[local16] * local20 >> 14;
						this.anIntArray464[local16] = this.anIntArray468[local16] * local20 + local159 * this.anIntArray464[local16] + 16383 >> 14;
						this.anIntArray468[local16] = local177;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub1_Sub2.anIntArray84[arg2];
						local159 = Class3_Sub1_Sub2.anIntArray85[arg2];
						local177 = this.anIntArray465[local16] * local159 + local20 * this.anIntArray464[local16] + 16383 >> 14;
						this.anIntArray464[local16] = this.anIntArray464[local16] * local159 + 16383 - local20 * this.anIntArray465[local16] >> 14;
						this.anIntArray465[local16] = local177;
					}
					this.anIntArray465[local16] += Static409.anInt6025;
					this.anIntArray468[local16] += Static185.anInt4395;
					this.anIntArray464[local16] += Static470.anInt8512;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt7484; local16++) {
					this.anIntArray465[local16] -= Static409.anInt6025;
					this.anIntArray468[local16] -= Static185.anInt4395;
					this.anIntArray464[local16] -= Static470.anInt8512;
					this.anIntArray465[local16] = arg1 * this.anIntArray465[local16] / 128;
					this.anIntArray468[local16] = arg2 * this.anIntArray468[local16] / 128;
					this.anIntArray464[local16] = this.anIntArray464[local16] * arg3 / 128;
					this.anIntArray465[local16] += Static409.anInt6025;
					this.anIntArray468[local16] += Static185.anInt4395;
					this.anIntArray464[local16] += Static470.anInt8512;
				}
			} else {
				@Pc(499) Class347 local499;
				@Pc(504) Class27 local504;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt7501; local16++) {
						local20 = (this.aByteArray76[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray76[local16] = (byte) local20;
					}
					if (this.aClass347Array1 != null) {
						for (local20 = 0; local20 < this.anInt7537; local20++) {
							local499 = this.aClass347Array1[local20];
							local504 = this.aClass27Array1[local20];
							local504.anInt569 = local504.anInt569 & 0xFFFFFF | 255 - (this.aByteArray76[local499.anInt9854] & 0xFF) << 24;
						}
					}
					this.method6302();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt7501; local16++) {
						local20 = this.aShortArray112[local16] & 0xFFFF;
						local159 = local20 >> 10 & 0x3F;
						local177 = local20 >> 7 & 0x7;
						local177 += arg2 / 4;
						@Pc(572) int local572 = local20 & 0x7F;
						@Pc(579) int local579 = local159 + arg1 & 0x3F;
						if (local177 < 0) {
							local177 = 0;
						} else if (local177 > 7) {
							local177 = 7;
						}
						local572 += arg3;
						if (local572 < 0) {
							local572 = 0;
						} else if (local572 > 127) {
							local572 = 127;
						}
						this.aShortArray112[local16] = (short) (local572 | local579 << 10 | local177 << 7);
					}
					if (this.aClass347Array1 != null) {
						for (local20 = 0; local20 < this.anInt7537; local20++) {
							local499 = this.aClass347Array1[local20];
							local504 = this.aClass27Array1[local20];
							local504.anInt569 = Static120.anIntArray152[this.aShortArray112[local499.anInt9854] & 0xFFFF] & 0xFFFFFF | local504.anInt569 & 0xFF000000;
						}
					}
					this.method6302();
				} else {
					@Pc(690) Class27 local690;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt7537; local16++) {
							local690 = this.aClass27Array1[local16];
							local690.anInt577 += arg2;
							local690.anInt574 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt7537; local16++) {
							local690 = this.aClass27Array1[local16];
							local690.anInt566 = local690.anInt566 * arg1 >> 7;
							local690.anInt578 = local690.anInt578 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt7537; local16++) {
							local690 = this.aClass27Array1[local16];
							local690.anInt579 = local690.anInt579 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7484; local15++) {
			local33 = local13 * this.anIntArray465[local15] + this.anIntArray464[local15] * local9 >> 14;
			this.anIntArray464[local15] = local13 * this.anIntArray464[local15] - this.anIntArray465[local15] * local9 >> 14;
			this.anIntArray465[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7512; local33++) {
			@Pc(83) int local83 = this.aShortArray114[local33] * local9 + local13 * this.aShortArray123[local33] >> 14;
			this.aShortArray114[local33] = (short) (local13 * this.aShortArray114[local33] - this.aShortArray123[local33] * local9 >> 14);
			this.aShortArray123[local33] = (short) local83;
		}
		this.method6298();
		this.method6304();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7487;
	}

	@OriginalMember(owner = "client!oca", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7467; local3++) {
			this.anIntArray465[local3] = this.anIntArray465[local3] + 7 >> 4;
			this.anIntArray468[local3] = this.anIntArray468[local3] + 7 >> 4;
			this.anIntArray464[local3] = this.anIntArray464[local3] + 7 >> 4;
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7501; local3++) {
			if (this.aShortArray112[local3] == arg0) {
				this.aShortArray112[local3] = arg1;
			}
		}
		if (this.aClass347Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt7537; local38++) {
				@Pc(45) Class347 local45 = this.aClass347Array1[local38];
				@Pc(50) Class27 local50 = this.aClass27Array1[local38];
				local50.anInt569 = local50.anInt569 & 0xFF000000 | Static120.anIntArray152[this.aShortArray112[local45.anInt9854] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6302();
	}

	@OriginalMember(owner = "client!oca", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7506;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!oca;IILclient!oca;ZZ)Lclient!ka;")
	private Class128 method6297(@OriginalArg(0) Class128_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class128_Sub3 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt7512 = this.anInt7512;
		if ((arg1 & 0x100) == 0) {
			arg2.aBoolean644 = this.aBoolean644;
		} else {
			arg2.aBoolean644 = true;
		}
		arg2.anInt7468 = arg1;
		arg2.aShort98 = this.aShort98;
		arg2.aBoolean641 = this.aBoolean641;
		arg2.anInt7503 = this.anInt7503;
		arg2.anInt7467 = this.anInt7467;
		arg2.anInt7484 = this.anInt7484;
		arg2.aShort99 = this.aShort99;
		arg2.anInt7529 = this.anInt7529;
		arg2.anInt7537 = this.anInt7537;
		arg2.anInt7501 = this.anInt7501;
		@Pc(75) boolean local75 = Static63.method1346(arg1, this.anInt7529);
		@Pc(81) boolean local81 = Static191.method3803(this.anInt7529, arg1);
		@Pc(87) boolean local87 = Static487.method7149(this.anInt7529, arg1);
		@Pc(93) boolean local93 = local87 | local75 | local81;
		@Pc(216) int local216;
		if (local93) {
			if (!local75) {
				arg2.anIntArray465 = this.anIntArray465;
			} else if (arg0.anIntArray465 == null || arg0.anIntArray465.length < this.anInt7467) {
				arg2.anIntArray465 = arg0.anIntArray465 = new int[this.anInt7467];
			} else {
				arg2.anIntArray465 = arg0.anIntArray465;
			}
			if (!local81) {
				arg2.anIntArray468 = this.anIntArray468;
			} else if (arg0.anIntArray468 == null || this.anInt7467 > arg0.anIntArray468.length) {
				arg2.anIntArray468 = arg0.anIntArray468 = new int[this.anInt7467];
			} else {
				arg2.anIntArray468 = arg0.anIntArray468;
			}
			if (!local87) {
				arg2.anIntArray464 = this.anIntArray464;
			} else if (arg0.anIntArray464 == null || this.anInt7467 > arg0.anIntArray464.length) {
				arg2.anIntArray464 = arg0.anIntArray464 = new int[this.anInt7467];
			} else {
				arg2.anIntArray464 = arg0.anIntArray464;
			}
			for (local216 = 0; local216 < this.anInt7467; local216++) {
				if (local75) {
					arg2.anIntArray465[local216] = this.anIntArray465[local216];
				}
				if (local81) {
					arg2.anIntArray468[local216] = this.anIntArray468[local216];
				}
				if (local87) {
					arg2.anIntArray464[local216] = this.anIntArray464[local216];
				}
			}
		} else {
			arg2.anIntArray468 = this.anIntArray468;
			arg2.anIntArray465 = this.anIntArray465;
			arg2.anIntArray464 = this.anIntArray464;
		}
		if (Static631.method8541(arg1, this.anInt7529)) {
			arg2.aClass318_1 = arg0.aClass318_1;
			arg2.aClass318_1.aBoolean788 = true;
			arg2.aClass318_1.anInterface26_15 = this.aClass318_1.anInterface26_15;
			arg2.aClass318_1.aBoolean789 = this.aClass318_1.aBoolean789;
		} else if (Static78.method1880(this.anInt7529, arg1)) {
			arg2.aClass318_1 = this.aClass318_1;
		} else {
			arg2.aClass318_1 = null;
		}
		if (Static281.method5317(this.anInt7529, arg1)) {
			if (arg0.aShortArray112 == null || this.anInt7501 > arg0.aShortArray112.length) {
				arg2.aShortArray112 = arg0.aShortArray112 = new short[this.anInt7501];
			} else {
				arg2.aShortArray112 = arg0.aShortArray112;
			}
			for (local216 = 0; local216 < this.anInt7501; local216++) {
				arg2.aShortArray112[local216] = this.aShortArray112[local216];
			}
		} else {
			arg2.aShortArray112 = this.aShortArray112;
		}
		if (Static43.method789(arg1, this.anInt7529)) {
			if (arg0.aByteArray76 == null || arg0.aByteArray76.length < this.anInt7501) {
				arg2.aByteArray76 = arg0.aByteArray76 = new byte[this.anInt7501];
			} else {
				arg2.aByteArray76 = arg0.aByteArray76;
			}
			for (local216 = 0; local216 < this.anInt7501; local216++) {
				arg2.aByteArray76[local216] = this.aByteArray76[local216];
			}
		} else {
			arg2.aByteArray76 = this.aByteArray76;
		}
		if (Static350.method5752(this.anInt7529, arg1)) {
			arg2.aClass318_2 = arg0.aClass318_2;
			arg2.aClass318_2.aBoolean789 = this.aClass318_2.aBoolean789;
			arg2.aClass318_2.anInterface26_15 = this.aClass318_2.anInterface26_15;
			arg2.aClass318_2.aBoolean788 = true;
		} else if (Static509.method7394(this.anInt7529, arg1)) {
			arg2.aClass318_2 = this.aClass318_2;
		} else {
			arg2.aClass318_2 = null;
		}
		@Pc(575) int local575;
		if (Static297.method5114(arg1, this.anInt7529)) {
			if (arg0.aShortArray123 == null || arg0.aShortArray123.length < this.anInt7512) {
				local216 = this.anInt7512;
				arg2.aShortArray117 = arg0.aShortArray117 = new short[local216];
				arg2.aShortArray114 = arg0.aShortArray114 = new short[local216];
				arg2.aShortArray123 = arg0.aShortArray123 = new short[local216];
			} else {
				arg2.aShortArray117 = arg0.aShortArray117;
				arg2.aShortArray114 = arg0.aShortArray114;
				arg2.aShortArray123 = arg0.aShortArray123;
			}
			if (this.aClass340_1 == null) {
				arg2.aClass340_1 = null;
				for (local216 = 0; local216 < this.anInt7512; local216++) {
					arg2.aShortArray123[local216] = this.aShortArray123[local216];
					arg2.aShortArray117[local216] = this.aShortArray117[local216];
					arg2.aShortArray114[local216] = this.aShortArray114[local216];
				}
			} else {
				if (arg0.aClass340_1 == null) {
					arg0.aClass340_1 = new Class340();
				}
				@Pc(559) Class340 local559 = arg2.aClass340_1 = arg0.aClass340_1;
				if (local559.aShortArray136 == null || this.anInt7512 > local559.aShortArray136.length) {
					local575 = this.anInt7512;
					local559.aShortArray137 = new short[local575];
					local559.aByteArray96 = new byte[local575];
					local559.aShortArray138 = new short[local575];
					local559.aShortArray136 = new short[local575];
				}
				for (local575 = 0; local575 < this.anInt7512; local575++) {
					arg2.aShortArray123[local575] = this.aShortArray123[local575];
					arg2.aShortArray117[local575] = this.aShortArray117[local575];
					arg2.aShortArray114[local575] = this.aShortArray114[local575];
					local559.aShortArray136[local575] = this.aClass340_1.aShortArray136[local575];
					local559.aShortArray138[local575] = this.aClass340_1.aShortArray138[local575];
					local559.aShortArray137[local575] = this.aClass340_1.aShortArray137[local575];
					local559.aByteArray96[local575] = this.aClass340_1.aByteArray96[local575];
				}
			}
			arg2.aByteArray77 = this.aByteArray77;
		} else {
			arg2.aClass340_1 = this.aClass340_1;
			arg2.aShortArray117 = this.aShortArray117;
			arg2.aShortArray123 = this.aShortArray123;
			arg2.aByteArray77 = this.aByteArray77;
			arg2.aShortArray114 = this.aShortArray114;
		}
		if (Static618.method8385(this.anInt7529, arg1)) {
			arg2.aClass318_4 = arg0.aClass318_4;
			arg2.aClass318_4.aBoolean789 = this.aClass318_4.aBoolean789;
			arg2.aClass318_4.anInterface26_15 = this.aClass318_4.anInterface26_15;
			arg2.aClass318_4.aBoolean788 = true;
		} else if (Static232.method4483(this.anInt7529, arg1)) {
			arg2.aClass318_4 = this.aClass318_4;
		} else {
			arg2.aClass318_4 = null;
		}
		if (Static398.method6370(this.anInt7529, arg1)) {
			if (arg0.aFloatArray59 == null || arg0.aFloatArray59.length < this.anInt7501) {
				local216 = this.anInt7512;
				arg2.aFloatArray60 = arg0.aFloatArray60 = new float[local216];
				arg2.aFloatArray59 = arg0.aFloatArray59 = new float[local216];
			} else {
				arg2.aFloatArray60 = arg0.aFloatArray60;
				arg2.aFloatArray59 = arg0.aFloatArray59;
			}
			for (local216 = 0; local216 < this.anInt7512; local216++) {
				arg2.aFloatArray59[local216] = this.aFloatArray59[local216];
				arg2.aFloatArray60[local216] = this.aFloatArray60[local216];
			}
		} else {
			arg2.aFloatArray60 = this.aFloatArray60;
			arg2.aFloatArray59 = this.aFloatArray59;
		}
		if (Static25.method426(this.anInt7529, arg1)) {
			arg2.aClass318_3 = arg0.aClass318_3;
			arg2.aClass318_3.anInterface26_15 = this.aClass318_3.anInterface26_15;
			arg2.aClass318_3.aBoolean789 = this.aClass318_3.aBoolean789;
			arg2.aClass318_3.aBoolean788 = true;
		} else if (Static7.method101(arg1, this.anInt7529)) {
			arg2.aClass318_3 = this.aClass318_3;
		} else {
			arg2.aClass318_3 = null;
		}
		if (Static199.method3939(arg1, this.anInt7529)) {
			if (arg0.aShortArray115 == null || arg0.aShortArray115.length < this.anInt7501) {
				local216 = this.anInt7501;
				arg2.aShortArray115 = arg0.aShortArray115 = new short[local216];
				arg2.aShortArray116 = arg0.aShortArray116 = new short[local216];
				arg2.aShortArray119 = arg0.aShortArray119 = new short[local216];
			} else {
				arg2.aShortArray116 = arg0.aShortArray116;
				arg2.aShortArray119 = arg0.aShortArray119;
				arg2.aShortArray115 = arg0.aShortArray115;
			}
			for (local216 = 0; local216 < this.anInt7501; local216++) {
				arg2.aShortArray115[local216] = this.aShortArray115[local216];
				arg2.aShortArray116[local216] = this.aShortArray116[local216];
				arg2.aShortArray119[local216] = this.aShortArray119[local216];
			}
		} else {
			arg2.aShortArray119 = this.aShortArray119;
			arg2.aShortArray116 = this.aShortArray116;
			arg2.aShortArray115 = this.aShortArray115;
		}
		if (Static420.method6551(this.anInt7529, arg1)) {
			arg2.aClass96_1 = arg0.aClass96_1;
			arg2.aClass96_1.anInterface23_6 = this.aClass96_1.anInterface23_6;
			arg2.aClass96_1.aBoolean318 = true;
			arg2.aClass96_1.aBoolean319 = this.aClass96_1.aBoolean319;
		} else if (Static266.method6987(arg1, this.anInt7529)) {
			arg2.aClass96_1 = this.aClass96_1;
		} else {
			arg2.aClass96_1 = null;
		}
		if (Static232.method4482(this.anInt7529, arg1)) {
			if (arg0.lb == null || arg0.lb.length < this.anInt7501) {
				local216 = this.anInt7501;
				arg2.lb = arg0.lb = new short[local216];
			} else {
				arg2.lb = arg0.lb;
			}
			for (local216 = 0; local216 < this.anInt7501; local216++) {
				arg2.lb[local216] = this.lb[local216];
			}
		} else {
			arg2.lb = this.lb;
		}
		if (!Static135.method3116(this.anInt7529, arg1)) {
			arg2.aClass27Array1 = this.aClass27Array1;
		} else if (arg0.aClass27Array1 == null || this.anInt7537 > arg0.aClass27Array1.length) {
			local216 = this.anInt7537;
			arg2.aClass27Array1 = arg0.aClass27Array1 = new Class27[local216];
			for (local575 = 0; local575 < this.anInt7537; local575++) {
				arg2.aClass27Array1[local575] = this.aClass27Array1[local575].method576();
			}
		} else {
			arg2.aClass27Array1 = arg0.aClass27Array1;
			for (local216 = 0; local216 < this.anInt7537; local216++) {
				arg2.aClass27Array1[local216].method569(this.aClass27Array1[local216]);
			}
		}
		arg2.anIntArrayArray71 = this.anIntArrayArray71;
		arg2.anIntArrayArray73 = this.anIntArrayArray73;
		arg2.aClass215Array5 = this.aClass215Array5;
		arg2.anIntArray470 = this.anIntArray470;
		if (this.aBoolean643) {
			arg2.anInt7496 = this.anInt7496;
			arg2.anInt7486 = this.anInt7486;
			arg2.anInt7463 = this.anInt7463;
			arg2.anInt7487 = this.anInt7487;
			arg2.anInt7481 = this.anInt7481;
			arg2.aBoolean643 = true;
			arg2.anInt7506 = this.anInt7506;
			arg2.anInt7476 = this.anInt7476;
			arg2.anInt7519 = this.anInt7519;
		} else {
			arg2.aBoolean643 = false;
		}
		arg2.aClass18Array5 = this.aClass18Array5;
		arg2.aShortArray121 = this.aShortArray121;
		arg2.anIntArray463 = this.anIntArray463;
		arg2.anIntArray469 = this.anIntArray469;
		arg2.anIntArrayArray72 = this.anIntArrayArray72;
		arg2.aShortArray118 = this.aShortArray118;
		arg2.anIntArray466 = this.anIntArray466;
		arg2.aClass347Array1 = this.aClass347Array1;
		arg2.aShortArray122 = this.aShortArray122;
		arg2.aShortArray113 = this.aShortArray113;
		arg2.aShortArray120 = this.aShortArray120;
		return arg2;
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "()V")
	@Override
	protected void method6288() {
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILclient!wc;ZI)Z")
	@Override
	public boolean method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6313(arg1, arg4, -1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "()V")
	@Override
	protected void method6291() {
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
	private void method6298() {
		if (this.aClass318_1 != null) {
			this.aClass318_1.aBoolean789 = false;
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
	private void method6299() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7484; local23++) {
			@Pc(30) int local30 = this.anIntArray465[local23];
			@Pc(35) int local35 = this.anIntArray468[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			@Pc(63) int local63 = this.anIntArray464[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local11 > local63) {
				local11 = local63;
			}
			if (local63 > local17) {
				local17 = local63;
			}
			@Pc(86) int local86 = local63 * local63 + local30 * local30;
			if (local86 > local19) {
				local19 = local86;
			}
			local86 = local35 * local35 + local30 * local30 + local63 * local63;
			if (local86 > local21) {
				local21 = local86;
			}
		}
		this.anInt7506 = local17;
		this.anInt7481 = local11;
		this.anInt7486 = local9;
		this.anInt7496 = local7;
		this.anInt7476 = local15;
		this.anInt7519 = local13;
		this.anInt7487 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt7463 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean643 = true;
	}

	@OriginalMember(owner = "client!oca", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7486;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V")
	private void method6300() {
		if (this.anInt7503 == 0) {
			return;
		}
		if (this.method6306() && this.method6316()) {
			this.aClass33_Sub1_13.method2046(this.aClass318_1.anInterface26_15, 0);
			this.aClass33_Sub1_13.method2046(this.aClass318_2.anInterface26_15, 1);
			this.aClass33_Sub1_13.method2046(this.aClass318_3.anInterface26_15, 2);
			@Pc(54) boolean local54;
			if ((this.anInt7529 & 0x37) == 0) {
				this.aClass33_Sub1_13.method2044(false);
				local54 = false;
				this.aClass33_Sub1_13.method2003(this.aClass33_Sub1_13.aClass34_17);
			} else {
				local54 = true;
				this.aClass33_Sub1_13.method2044(true);
				this.aClass33_Sub1_13.method2046(this.aClass318_4.anInterface26_15, 3);
				this.aClass33_Sub1_13.method2003(this.aClass33_Sub1_13.aClass34_18);
			}
			for (@Pc(92) int local92 = 0; local92 < this.anIntArray470.length; local92++) {
				@Pc(99) int local99 = this.anIntArray466[local92];
				@Pc(106) int local106 = this.anIntArray466[local92 + 1];
				@Pc(113) int local113 = this.lb[local99] & 0xFFFF;
				if (local113 == 65535) {
					local113 = -1;
				}
				this.aClass33_Sub1_13.method2012(true, local113, local54);
				this.aClass33_Sub1_13.method2091(this.anIntArray470[local92], Static338.aClass304_5, local99 * 3, local106 - local99, this.aClass96_1.anInterface23_6, this.anIntArray463[local92]);
			}
		}
		this.method6301();
	}

	@OriginalMember(owner = "client!oca", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7484; local7++) {
			if (arg0 != 128) {
				this.anIntArray465[local7] = this.anIntArray465[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray468[local7] = this.anIntArray468[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray464[local7] = this.anIntArray464[local7] * arg2 >> 7;
			}
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V")
	private void method6301() {
		if (!this.aBoolean640) {
			return;
		}
		this.aBoolean640 = false;
		if (this.aClass18Array5 == null && this.aClass215Array5 == null && this.aClass347Array1 == null) {
			if (this.anIntArray465 != null && !Static89.method2280(this.anInt7468, this.anInt7529)) {
				if (this.aClass318_1 == null || this.aClass318_1.method7728()) {
					if (!this.aBoolean643) {
						this.method6299();
					}
					this.anIntArray465 = null;
				} else {
					this.aBoolean640 = true;
				}
			}
			if (this.anIntArray468 != null && !Static268.method4905(this.anInt7468, this.anInt7529)) {
				if (this.aClass318_1 == null || this.aClass318_1.method7728()) {
					if (!this.aBoolean643) {
						this.method6299();
					}
					this.anIntArray468 = null;
				} else {
					this.aBoolean640 = true;
				}
			}
			if (this.anIntArray464 != null && !Static377.method5990(this.anInt7529, this.anInt7468)) {
				if (this.aClass318_1 == null || this.aClass318_1.method7728()) {
					if (!this.aBoolean643) {
						this.method6299();
					}
					this.anIntArray464 = null;
				} else {
					this.aBoolean640 = true;
				}
			}
		}
		if (this.aShortArray122 != null && this.anIntArray465 == null && this.anIntArray468 == null && this.anIntArray464 == null) {
			this.anIntArray469 = null;
			this.aShortArray122 = null;
		}
		if (this.aByteArray77 != null && !Static354.method5798(this.anInt7468, this.anInt7529)) {
			label197: {
				label196: {
					@Pc(159) boolean local159;
					if ((this.anInt7529 & 0x37) == 0) {
						if (this.aClass318_2 == null || this.aClass318_2.method7728()) {
							break label196;
						}
						local159 = false;
					} else {
						if (this.aClass318_4 == null || this.aClass318_4.method7728()) {
							break label196;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean640 = true;
						break label197;
					}
				}
				this.aByteArray77 = null;
				this.aShortArray123 = this.aShortArray117 = this.aShortArray114 = null;
			}
		}
		if (this.aShortArray112 != null && !Static525.method7484(this.anInt7529, this.anInt7468)) {
			if (this.aClass318_2 == null || this.aClass318_2.method7728()) {
				this.aShortArray112 = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.aByteArray76 != null && !Static622.method7875(this.anInt7468, this.anInt7529)) {
			if (this.aClass318_2 == null || this.aClass318_2.method7728()) {
				this.aByteArray76 = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.aFloatArray59 != null && !Static393.method2873(this.anInt7468, this.anInt7529)) {
			if (this.aClass318_3 == null || this.aClass318_3.method7728()) {
				this.aFloatArray59 = this.aFloatArray60 = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.lb != null && !Static524.method7477(this.anInt7468, this.anInt7529)) {
			if (this.aClass318_2 == null || this.aClass318_2.method7728()) {
				this.lb = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.aShortArray115 != null && !Static17.method257(this.anInt7529, this.anInt7468)) {
			if ((this.aClass96_1 == null || this.aClass96_1.method3254()) && (this.aClass318_2 == null || this.aClass318_2.method7728())) {
				this.aShortArray115 = this.aShortArray116 = this.aShortArray119 = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.aShortArray121 != null) {
			if (this.aClass318_1 == null || this.aClass318_1.method7728()) {
				this.aShortArray121 = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.aShortArray120 != null) {
			if (this.aClass318_2 == null || this.aClass318_2.method7728()) {
				this.aShortArray120 = null;
			} else {
				this.aBoolean640 = true;
			}
		}
		if (this.anIntArrayArray72 != null && !Static493.method7237(this.anInt7529, this.anInt7468)) {
			this.anIntArrayArray72 = null;
			this.aShortArray118 = null;
		}
		if (this.anIntArrayArray73 != null && !Static51.method1166(this.anInt7529, this.anInt7468)) {
			this.aShortArray113 = null;
			this.anIntArrayArray73 = null;
		}
		if (this.anIntArrayArray71 != null && !Static178.method3628(this.anInt7468, this.anInt7529)) {
			this.anIntArrayArray71 = null;
		}
		if (this.anIntArray466 != null && (this.anInt7468 & 0x800) == 0 && (this.anInt7468 & 0x40000) == 0) {
			this.anIntArray463 = null;
			this.anIntArray470 = null;
			this.anIntArray466 = null;
		}
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)V")
	private void method6302() {
		if (this.aClass318_2 != null) {
			this.aClass318_2.aBoolean789 = false;
		}
	}

	@OriginalMember(owner = "client!oca", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7484; local7++) {
			this.anIntArray464[local7] = -this.anIntArray464[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7512; local29++) {
			this.aShortArray114[local29] = (short) -this.aShortArray114[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7501; local48++) {
			@Pc(55) short local55 = this.aShortArray115[local48];
			this.aShortArray115[local48] = this.aShortArray119[local48];
			this.aShortArray119[local48] = local55;
		}
		this.method6298();
		this.method6304();
		this.method6309();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6274(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class128_Sub3 local8 = (Class128_Sub3) arg0;
		if (this.anInt7501 == 0 || local8.anInt7501 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt7484;
		@Pc(27) int[] local27 = local8.anIntArray465;
		@Pc(30) int[] local30 = local8.anIntArray468;
		@Pc(33) int[] local33 = local8.anIntArray464;
		@Pc(36) short[] local36 = local8.aShortArray123;
		@Pc(39) short[] local39 = local8.aShortArray117;
		@Pc(42) short[] local42 = local8.aShortArray114;
		@Pc(45) byte[] local45 = local8.aByteArray77;
		@Pc(56) short[] local56;
		@Pc(50) short[] local50;
		@Pc(54) short[] local54;
		@Pc(52) byte[] local52;
		if (this.aClass340_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass340_1.aShortArray136;
			local50 = this.aClass340_1.aShortArray138;
			local54 = this.aClass340_1.aShortArray137;
			local52 = this.aClass340_1.aByteArray96;
		}
		@Pc(83) short[] local83;
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(79) byte[] local79;
		if (local8.aClass340_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local85 = local8.aClass340_1.aShortArray138;
			local81 = local8.aClass340_1.aShortArray137;
			local83 = local8.aClass340_1.aShortArray136;
			local79 = local8.aClass340_1.aByteArray96;
		}
		@Pc(106) int[] local106 = local8.anIntArray469;
		@Pc(109) short[] local109 = local8.aShortArray122;
		if (!local8.aBoolean643) {
			local8.method6299();
		}
		@Pc(118) int local118 = local8.anInt7486;
		@Pc(121) int local121 = local8.anInt7476;
		@Pc(124) int local124 = local8.anInt7496;
		@Pc(127) int local127 = local8.anInt7519;
		@Pc(130) int local130 = local8.anInt7481;
		@Pc(133) int local133 = local8.anInt7506;
		for (@Pc(135) int local135 = 0; local135 < this.anInt7484; local135++) {
			@Pc(145) int local145 = this.anIntArray468[local135] - arg2;
			if (local118 <= local145 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray465[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(189) int local189 = this.anIntArray464[local135] - arg3;
					if (local130 <= local189 && local133 >= local189) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray469[local135];
						@Pc(215) int local215 = this.anIntArray469[local135 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.aShortArray122[local217] - 1;
							if (local203 == -1 || this.aByteArray77[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(250) int local250 = 0; local250 < local24; local250++) {
								if (local27[local250] == local165 && local33[local250] == local189 && local30[local250] == local145) {
									local215 = local106[local250 + 1];
									@Pc(279) int local279 = -1;
									local208 = local106[local250];
									for (@Pc(285) int local285 = local208; local285 < local215; local285++) {
										local279 = local109[local285] - 1;
										if (local279 == -1 || local45[local279] != 0) {
											break;
										}
									}
									if (local279 != -1) {
										if (local56 == null) {
											this.aClass340_1 = new Class340();
											local56 = this.aClass340_1.aShortArray136 = Static537.method7639(this.aShortArray123);
											local50 = this.aClass340_1.aShortArray138 = Static537.method7639(this.aShortArray117);
											local54 = this.aClass340_1.aShortArray137 = Static537.method7639(this.aShortArray114);
											local52 = this.aClass340_1.aByteArray96 = Static322.method5435(this.aByteArray77);
										}
										if (local83 == null) {
											@Pc(362) Class340 local362 = local8.aClass340_1 = new Class340();
											local83 = local362.aShortArray136 = Static537.method7639(local36);
											local85 = local362.aShortArray138 = Static537.method7639(local39);
											local81 = local362.aShortArray137 = Static537.method7639(local42);
											local79 = local362.aByteArray96 = Static322.method5435(local45);
										}
										@Pc(395) short local395 = this.aShortArray123[local203];
										@Pc(400) short local400 = this.aShortArray117[local203];
										@Pc(405) short local405 = this.aShortArray114[local203];
										local208 = local106[local250];
										local215 = local106[local250 + 1];
										@Pc(420) byte local420 = this.aByteArray77[local203];
										@Pc(430) int local430;
										for (@Pc(422) int local422 = local208; local422 < local215; local422++) {
											local430 = local109[local422] - 1;
											if (local430 == -1) {
												break;
											}
											if (local79[local430] != 0) {
												local83[local430] += local395;
												local85[local430] += local400;
												local81[local430] += local405;
												local79[local430] += local420;
											}
										}
										local420 = local45[local279];
										local400 = local39[local279];
										local395 = local36[local279];
										local208 = this.anIntArray469[local135];
										local215 = this.anIntArray469[local135 + 1];
										local405 = local42[local279];
										for (local430 = local208; local430 < local215; local430++) {
											@Pc(516) int local516 = this.aShortArray122[local430] - 1;
											if (local516 == -1) {
												break;
											}
											if (local52[local516] != 0) {
												local56[local516] += local395;
												local50[local516] += local400;
												local54[local516] += local405;
												local52[local516] += local420;
											}
										}
										local8.method6304();
										this.method6304();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7496;
	}

	@OriginalMember(owner = "client!oca", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface5 local9 = this.aClass33_Sub1_13.anInterface5_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7501; local11++) {
			if (arg0 == this.lb[local11]) {
				this.lb[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class156 local51 = local9.method6869(arg0 & 0xFFFF);
			local41 = local51.aByte74;
			local39 = local51.aByte71;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(71) Class156 local71 = local9.method6869(arg1 & 0xFFFF);
			local61 = local71.aByte74;
			if (local71.aByte68 != 0 || local71.aByte73 != 0) {
				this.aBoolean641 = true;
			}
			local59 = local71.aByte71;
		}
		if (!(local61 != local41 | local59 != local39)) {
			return;
		}
		if (this.aClass347Array1 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.anInt7537; local116++) {
				@Pc(123) Class347 local123 = this.aClass347Array1[local116];
				@Pc(128) Class27 local128 = this.aClass27Array1[local116];
				local128.anInt569 = local128.anInt569 & 0xFF000000 | Static120.anIntArray152[this.aShortArray112[local123.anInt9854] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6302();
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)V")
	public void method6303() {
		if (this.aClass318_1 != null) {
			this.aClass318_1.method7727();
		}
		if (this.aClass318_3 != null) {
			this.aClass318_3.method7727();
		}
		if (this.aClass318_2 != null) {
			this.aClass318_2.method7727();
		}
		if (this.aClass318_4 != null) {
			this.aClass318_4.method7727();
		}
		if (this.aClass96_1 != null) {
			this.aClass96_1.method3255();
		}
	}

	@OriginalMember(owner = "client!oca", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static470.anInt8512 = 0;
			Static185.anInt4395 = 0;
			Static409.anInt6025 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray73.length > local38) {
					local52 = this.anIntArrayArray73[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local60]) != 0) {
							Static409.anInt6025 += this.anIntArray465[local60];
							Static185.anInt4395 += this.anIntArray468[local60];
							local30++;
							Static470.anInt8512 += this.anIntArray464[local60];
						}
					}
				}
			}
			if (local30 > 0) {
				Static185.anInt4395 = Static185.anInt4395 / local30 + arg3;
				Static465.aBoolean723 = true;
				Static470.anInt8512 = arg4 + Static470.anInt8512 / local30;
				Static409.anInt6025 = Static409.anInt6025 / local30 + arg2;
			} else {
				Static470.anInt8512 = arg4;
				Static409.anInt6025 = arg2;
				Static185.anInt4395 = arg3;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local32;
				arg2 = local30;
				arg4 = local38;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray73.length) {
					local250 = this.anIntArrayArray73[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray113 == null || (this.aShortArray113[local54] & arg6) != 0) {
							this.anIntArray465[local54] += arg2;
							this.anIntArray468[local54] += arg3;
							this.anIntArray464[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(384) int local384;
		@Pc(403) int local403;
		@Pc(638) int local638;
		@Pc(647) int local647;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(679) int local679;
		@Pc(1009) int local1009;
		@Pc(1017) int local1017;
		@Pc(1173) int local1173;
		@Pc(1198) int local1198;
		@Pc(1202) int local1202;
		@Pc(1210) int local1210;
		@Pc(1215) int local1215;
		@Pc(1219) int local1219;
		@Pc(1223) int local1223;
		@Pc(1225) int local1225;
		@Pc(1350) int[] local1350;
		@Pc(1352) int local1352;
		@Pc(1356) int local1356;
		@Pc(1360) int local1360;
		@Pc(1362) int local1362;
		@Pc(1490) int local1490;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray73.length > local32) {
						local250 = this.anIntArrayArray73[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
								this.anIntArray465[local54] -= Static409.anInt6025;
								this.anIntArray468[local54] -= Static185.anInt4395;
								this.anIntArray464[local54] -= Static470.anInt8512;
								if (arg4 != 0) {
									local60 = Class3_Sub1_Sub2.anIntArray84[arg4];
									local384 = Class3_Sub1_Sub2.anIntArray85[arg4];
									local403 = this.anIntArray468[local54] * local60 + local384 * this.anIntArray465[local54] + 16383 >> 14;
									this.anIntArray468[local54] = this.anIntArray468[local54] * local384 + 16383 - local60 * this.anIntArray465[local54] >> 14;
									this.anIntArray465[local54] = local403;
								}
								if (arg2 != 0) {
									local60 = Class3_Sub1_Sub2.anIntArray84[arg2];
									local384 = Class3_Sub1_Sub2.anIntArray85[arg2];
									local403 = this.anIntArray468[local54] * local384 + 16383 - local60 * this.anIntArray464[local54] >> 14;
									this.anIntArray464[local54] = this.anIntArray464[local54] * local384 + this.anIntArray468[local54] * local60 + 16383 >> 14;
									this.anIntArray468[local54] = local403;
								}
								if (arg3 != 0) {
									local60 = Class3_Sub1_Sub2.anIntArray84[arg3];
									local384 = Class3_Sub1_Sub2.anIntArray85[arg3];
									local403 = local384 * this.anIntArray465[local54] + this.anIntArray464[local54] * local60 + 16383 >> 14;
									this.anIntArray464[local54] = this.anIntArray464[local54] * local384 + 16383 - local60 * this.anIntArray465[local54] >> 14;
									this.anIntArray465[local54] = local403;
								}
								this.anIntArray465[local54] += Static409.anInt6025;
								this.anIntArray468[local54] += Static185.anInt4395;
								this.anIntArray464[local54] += Static470.anInt8512;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray73.length > local38) {
							local52 = this.anIntArrayArray73[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local60]) != 0) {
									local384 = this.anIntArray469[local60];
									local403 = this.anIntArray469[local60 + 1];
									for (local638 = local384; local638 < local403; local638++) {
										local647 = this.aShortArray122[local638] - 1;
										if (local647 == -1) {
											break;
										}
										if (arg4 != 0) {
											local657 = Class3_Sub1_Sub2.anIntArray84[arg4];
											local661 = Class3_Sub1_Sub2.anIntArray85[arg4];
											local679 = this.aShortArray117[local647] * local657 + this.aShortArray123[local647] * local661 + 16383 >> 14;
											this.aShortArray117[local647] = (short) (this.aShortArray117[local647] * local661 + 16383 - local657 * this.aShortArray123[local647] >> 14);
											this.aShortArray123[local647] = (short) local679;
										}
										if (arg2 != 0) {
											local657 = Class3_Sub1_Sub2.anIntArray84[arg2];
											local661 = Class3_Sub1_Sub2.anIntArray85[arg2];
											local679 = this.aShortArray117[local647] * local661 + 16383 - this.aShortArray114[local647] * local657 >> 14;
											this.aShortArray114[local647] = (short) (local657 * this.aShortArray117[local647] + this.aShortArray114[local647] * local661 + 16383 >> 14);
											this.aShortArray117[local647] = (short) local679;
										}
										if (arg3 != 0) {
											local657 = Class3_Sub1_Sub2.anIntArray84[arg3];
											local661 = Class3_Sub1_Sub2.anIntArray85[arg3];
											local679 = this.aShortArray123[local647] * local661 + this.aShortArray114[local647] * local657 + 16383 >> 14;
											this.aShortArray114[local647] = (short) (this.aShortArray114[local647] * local661 + 16383 - local657 * this.aShortArray123[local647] >> 14);
											this.aShortArray123[local647] = (short) local679;
										}
									}
								}
							}
						}
					}
					this.method6304();
					return;
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static465.aBoolean723) {
					local384 = arg7[6] * Static470.anInt8512 + arg7[0] * Static409.anInt6025 + arg7[3] * Static185.anInt4395 + 8192 >> 14;
					local403 = arg7[7] * Static470.anInt8512 + arg7[4] * Static185.anInt4395 + arg7[1] * Static409.anInt6025 + 8192 >> 14;
					local638 = arg7[8] * Static470.anInt8512 + arg7[2] * Static409.anInt6025 + Static185.anInt4395 * arg7[5] + 8192 >> 14;
					local384 += local252;
					local403 += local54;
					Static409.anInt6025 = local384;
					Static185.anInt4395 = local403;
					local638 += local60;
					Static470.anInt8512 = local638;
					Static465.aBoolean723 = false;
				}
				@Pc(977) int[] local977 = new int[9];
				local403 = Class3_Sub1_Sub2.anIntArray85[arg2];
				local638 = Class3_Sub1_Sub2.anIntArray84[arg2];
				local647 = Class3_Sub1_Sub2.anIntArray85[arg3];
				local657 = Class3_Sub1_Sub2.anIntArray84[arg3];
				local661 = Class3_Sub1_Sub2.anIntArray85[arg4];
				local679 = Class3_Sub1_Sub2.anIntArray84[arg4];
				local1009 = local661 * local638 + 8192 >> 14;
				local1017 = local679 * local638 + 8192 >> 14;
				local977[7] = local647 * local1009 + local657 * local679 + 8192 >> 14;
				local977[2] = local657 * local403 + 8192 >> 14;
				local977[8] = local647 * local403 + 8192 >> 14;
				local977[3] = local403 * local679 + 8192 >> 14;
				local977[0] = local647 * local661 + local1017 * local657 + 8192 >> 14;
				local977[4] = local403 * local661 + 8192 >> 14;
				local977[6] = -local657 * local661 + local1017 * local647 + 8192 >> 14;
				local977[1] = local657 * local1009 + local679 * -local647 + 8192 >> 14;
				local977[5] = -local638;
				@Pc(1147) int local1147 = local977[2] * -Static470.anInt8512 + local977[0] * -Static409.anInt6025 + -Static185.anInt4395 * local977[1] + 8192 >> 14;
				local1173 = -Static409.anInt6025 * local977[3] + local977[4] * -Static185.anInt4395 + local977[5] * -Static470.anInt8512 + 8192 >> 14;
				local1198 = local977[8] * -Static470.anInt8512 + -Static185.anInt4395 * local977[7] + local977[6] * -Static409.anInt6025 + 8192 >> 14;
				local1202 = Static409.anInt6025 + local1147;
				@Pc(1206) int local1206 = local1173 + Static185.anInt4395;
				local1210 = local1198 + Static470.anInt8512;
				@Pc(1213) int[] local1213 = new int[9];
				for (local1215 = 0; local1215 < 3; local1215++) {
					for (local1219 = 0; local1219 < 3; local1219++) {
						local1223 = 0;
						for (local1225 = 0; local1225 < 3; local1225++) {
							local1223 += arg7[local1225 + local1219 * 3] * local977[local1215 * 3 + local1225];
						}
						local1213[local1215 * 3 + local1219] = local1223 + 8192 >> 14;
					}
				}
				local1219 = local252 * local977[0] + local977[1] * local54 + local60 * local977[2] + 8192 >> 14;
				local1223 = local977[5] * local60 + local977[4] * local54 + local977[3] * local252 + 8192 >> 14;
				local1219 += local1202;
				local1225 = local977[6] * local252 + local977[7] * local54 + local60 * local977[8] + 8192 >> 14;
				local1223 += local1206;
				local1225 += local1210;
				local1350 = new int[9];
				for (local1352 = 0; local1352 < 3; local1352++) {
					for (local1356 = 0; local1356 < 3; local1356++) {
						local1360 = 0;
						for (local1362 = 0; local1362 < 3; local1362++) {
							local1360 += local1213[local1362 * 3 + local1356] * arg7[local1362 + local1352 * 3];
						}
						local1350[local1356 + local1352 * 3] = local1360 + 8192 >> 14;
					}
				}
				local1356 = arg7[0] * local1219 + local1223 * arg7[1] + arg7[2] * local1225 + 8192 >> 14;
				local1360 = local1225 * arg7[5] + arg7[3] * local1219 + local1223 * arg7[4] + 8192 >> 14;
				local1356 += local30;
				local1362 = local1225 * arg7[8] + arg7[6] * local1219 + arg7[7] * local1223 + 8192 >> 14;
				local1360 += local32;
				local1362 += local38;
				for (local1490 = 0; local1490 < local8; local1490++) {
					@Pc(1496) int local1496 = arg1[local1490];
					if (this.anIntArrayArray73.length > local1496) {
						@Pc(1510) int[] local1510 = this.anIntArrayArray73[local1496];
						for (@Pc(1512) int local1512 = 0; local1512 < local1510.length; local1512++) {
							@Pc(1518) int local1518 = local1510[local1512];
							if (this.aShortArray113 == null || (this.aShortArray113[local1518] & arg6) != 0) {
								@Pc(1562) int local1562 = local1350[1] * this.anIntArray468[local1518] + local1350[0] * this.anIntArray465[local1518] + local1350[2] * this.anIntArray464[local1518] + 8192 >> 14;
								@Pc(1594) int local1594 = local1350[3] * this.anIntArray465[local1518] + this.anIntArray468[local1518] * local1350[4] + this.anIntArray464[local1518] * local1350[5] + 8192 >> 14;
								@Pc(1598) int local1598 = local1562 + local1356;
								@Pc(1629) int local1629 = local1350[8] * this.anIntArray464[local1518] + local1350[6] * this.anIntArray465[local1518] + local1350[7] * this.anIntArray468[local1518] + 8192 >> 14;
								@Pc(1633) int local1633 = local1594 + local1360;
								this.anIntArray465[local1518] = local1598;
								@Pc(1642) int local1642 = local1629 + local1362;
								this.anIntArray468[local1518] = local1633;
								this.anIntArray464[local1518] = local1642;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2578) Class27 local2578;
			@Pc(2460) boolean local2460;
			@Pc(2573) Class347 local2573;
			if (arg0 == 5) {
				if (this.anIntArrayArray72 != null) {
					local2460 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray72.length > local38) {
							local52 = this.anIntArrayArray72[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray118 == null || (this.aShortArray118[local60] & arg6) != 0) {
									local384 = (this.aByteArray76[local60] & 0xFF) + (arg2 * 8);
									if (local384 < 0) {
										local384 = 0;
									} else if (local384 > 255) {
										local384 = 255;
									}
									this.aByteArray76[local60] = (byte) local384;
								}
							}
							local2460 |= local52.length > 0;
						}
					}
					if (local2460) {
						if (this.aClass347Array1 != null) {
							for (local38 = 0; local38 < this.anInt7537; local38++) {
								local2573 = this.aClass347Array1[local38];
								local2578 = this.aClass27Array1[local38];
								local2578.anInt569 = local2578.anInt569 & 0xFFFFFF | 255 - (this.aByteArray76[local2573.anInt9854] & 0xFF) << 24;
							}
						}
						this.method6302();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray72 != null) {
					local2460 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray72.length > local38) {
							local52 = this.anIntArrayArray72[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray118 == null || (this.aShortArray118[local60] & arg6) != 0) {
									local384 = this.aShortArray112[local60] & 0xFFFF;
									local403 = local384 >> 10 & 0x3F;
									local638 = local384 >> 7 & 0x7;
									@Pc(2677) int local2677 = local403 + arg2 & 0x3F;
									local638 += arg3 / 4;
									local647 = local384 & 0x7F;
									if (local638 < 0) {
										local638 = 0;
									} else if (local638 > 7) {
										local638 = 7;
									}
									local647 += arg4;
									if (local647 < 0) {
										local647 = 0;
									} else if (local647 > 127) {
										local647 = 127;
									}
									this.aShortArray112[local60] = (short) (local647 | local638 << 7 | local2677 << 10);
								}
							}
							local2460 |= local52.length > 0;
						}
					}
					if (local2460) {
						if (this.aClass347Array1 != null) {
							for (local38 = 0; local38 < this.anInt7537; local38++) {
								local2573 = this.aClass347Array1[local38];
								local2578 = this.aClass27Array1[local38];
								local2578.anInt569 = Static120.anIntArray152[this.aShortArray112[local2573.anInt9854] & 0xFFFF] & 0xFFFFFF | local2578.anInt569 & 0xFF000000;
							}
						}
						this.method6302();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray71 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray71.length) {
							local250 = this.anIntArrayArray71[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2578 = this.aClass27Array1[local250[local252]];
								local2578.anInt574 += arg2;
								local2578.anInt577 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray71 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray71.length > local32) {
							local250 = this.anIntArrayArray71[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2578 = this.aClass27Array1[local250[local252]];
								local2578.anInt578 = local2578.anInt578 * arg3 >> 7;
								local2578.anInt566 = local2578.anInt566 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray71 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray71.length > local32) {
						local250 = this.anIntArrayArray71[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local2578 = this.aClass27Array1[local250[local252]];
							local2578.anInt579 = local2578.anInt579 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray73.length > local32) {
					local250 = this.anIntArrayArray73[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
							this.anIntArray465[local54] -= Static409.anInt6025;
							this.anIntArray468[local54] -= Static185.anInt4395;
							this.anIntArray464[local54] -= Static470.anInt8512;
							this.anIntArray465[local54] = arg2 * this.anIntArray465[local54] >> 7;
							this.anIntArray468[local54] = this.anIntArray468[local54] * arg3 >> 7;
							this.anIntArray464[local54] = arg4 * this.anIntArray464[local54] >> 7;
							this.anIntArray465[local54] += Static409.anInt6025;
							this.anIntArray468[local54] += Static185.anInt4395;
							this.anIntArray464[local54] += Static470.anInt8512;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static465.aBoolean723) {
				local384 = arg7[6] * Static470.anInt8512 + Static185.anInt4395 * arg7[3] + arg7[0] * Static409.anInt6025 + 8192 >> 14;
				local403 = arg7[1] * Static409.anInt6025 + arg7[4] * Static185.anInt4395 + arg7[7] * Static470.anInt8512 + 8192 >> 14;
				local638 = Static470.anInt8512 * arg7[8] + Static409.anInt6025 * arg7[2] + Static185.anInt4395 * arg7[5] + 8192 >> 14;
				local403 += local54;
				local384 += local252;
				Static409.anInt6025 = local384;
				Static185.anInt4395 = local403;
				local638 += local60;
				Static470.anInt8512 = local638;
				Static465.aBoolean723 = false;
			}
			local384 = arg2 << 15 >> 7;
			local403 = arg3 << 15 >> 7;
			local638 = arg4 << 15 >> 7;
			local647 = -Static409.anInt6025 * local384 + 8192 >> 14;
			local657 = local403 * -Static185.anInt4395 + 8192 >> 14;
			local661 = -Static470.anInt8512 * local638 + 8192 >> 14;
			local679 = local647 + Static409.anInt6025;
			local1009 = Static185.anInt4395 + local657;
			local1017 = Static470.anInt8512 + local661;
			@Pc(1997) int[] local1997 = new int[] { local384 * arg7[0] + 8192 >> 14, local384 * arg7[3] + 8192 >> 14, local384 * arg7[6] + 8192 >> 14, local403 * arg7[1] + 8192 >> 14, local403 * arg7[4] + 8192 >> 14, arg7[7] * local403 + 8192 >> 14, local638 * arg7[2] + 8192 >> 14, arg7[5] * local638 + 8192 >> 14, arg7[8] * local638 + 8192 >> 14 };
			local1173 = local252 * local384 + 8192 >> 14;
			local1198 = local403 * local54 + 8192 >> 14;
			local1202 = local60 * local638 + 8192 >> 14;
			@Pc(2133) int local2133 = local1173 + local679;
			@Pc(2137) int local2137 = local1198 + local1009;
			@Pc(2141) int local2141 = local1202 + local1017;
			@Pc(2144) int[] local2144 = new int[9];
			@Pc(2150) int local2150;
			for (local1210 = 0; local1210 < 3; local1210++) {
				for (local2150 = 0; local2150 < 3; local2150++) {
					local1215 = 0;
					for (local1219 = 0; local1219 < 3; local1219++) {
						local1215 += arg7[local1219 + local1210 * 3] * local1997[local1219 * 3 + local2150];
					}
					local2144[local2150 + local1210 * 3] = local1215 + 8192 >> 14;
				}
			}
			local2150 = arg7[2] * local2141 + arg7[0] * local2133 + local2137 * arg7[1] + 8192 >> 14;
			local1215 = local2141 * arg7[5] + arg7[4] * local2137 + arg7[3] * local2133 + 8192 >> 14;
			local1219 = arg7[8] * local2141 + arg7[6] * local2133 + local2137 * arg7[7] + 8192 >> 14;
			local1215 += local32;
			local2150 += local30;
			local1219 += local38;
			for (local1223 = 0; local1223 < local8; local1223++) {
				local1225 = arg1[local1223];
				if (local1225 < this.anIntArrayArray73.length) {
					local1350 = this.anIntArrayArray73[local1225];
					for (local1352 = 0; local1352 < local1350.length; local1352++) {
						local1356 = local1350[local1352];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local1356]) != 0) {
							local1360 = this.anIntArray465[local1356] * local2144[0] + this.anIntArray468[local1356] * local2144[1] + local2144[2] * this.anIntArray464[local1356] + 8192 >> 14;
							local1362 = this.anIntArray464[local1356] * local2144[5] + this.anIntArray465[local1356] * local2144[3] + local2144[4] * this.anIntArray468[local1356] + 8192 >> 14;
							@Pc(2388) int local2388 = local1360 + local2150;
							local1490 = this.anIntArray465[local1356] * local2144[6] + this.anIntArray468[local1356] * local2144[7] + this.anIntArray464[local1356] * local2144[8] + 8192 >> 14;
							@Pc(2423) int local2423 = local1362 + local1215;
							@Pc(2427) int local2427 = local1490 + local1219;
							this.anIntArray465[local1356] = local2388;
							this.anIntArray468[local1356] = local2423;
							this.anIntArray464[local1356] = local2427;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(B)V")
	private void method6304() {
		if ((this.anInt7529 & 0x37) == 0) {
			if (this.aClass318_2 != null) {
				this.aClass318_2.aBoolean789 = false;
			}
		} else if (this.aClass318_4 != null) {
			this.aClass318_4.aBoolean789 = false;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!wc;IZ)V")
	@Override
	public void method6272(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray113 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7484; local14++) {
			if ((this.aShortArray113[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method7864(this.anIntArray465[local14], this.anIntArray468[local14], this.anIntArray464[local14], local12);
				} else {
					arg0.method7868(this.anIntArray465[local14], this.anIntArray468[local14], this.anIntArray464[local14], local12);
				}
				this.anIntArray465[local14] = local12[0];
				this.anIntArray468[local14] = local12[1];
				this.anIntArray464[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7484; local15++) {
			@Pc(34) int local34 = this.anIntArray468[local15] * local9 + this.anIntArray465[local15] * local13 >> 14;
			this.anIntArray468[local15] = this.anIntArray468[local15] * local13 - local9 * this.anIntArray465[local15] >> 14;
			this.anIntArray465[local15] = local34;
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7484; local15++) {
			@Pc(33) int local33 = this.anIntArray465[local15] * local13 + local9 * this.anIntArray464[local15] >> 14;
			this.anIntArray464[local15] = local13 * this.anIntArray464[local15] - local9 * this.anIntArray465[local15] >> 14;
			this.anIntArray465[local15] = local33;
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!wc;Lclient!fda;II)V")
	@Override
	public void method6294(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7512 == 0) {
			return;
		}
		@Pc(13) Class47_Sub3 local13 = this.aClass33_Sub1_13.aClass47_Sub3_16;
		@Pc(16) Class47_Sub3 local16 = (Class47_Sub3) arg0;
		if (!this.aBoolean643) {
			this.method6299();
		}
		Static296.aFloat176 = local13.aFloat263 + local16.aFloat256 * local13.aFloat260 + local16.aFloat254 * local13.aFloat259 + local16.aFloat263 * local13.aFloat258;
		Static335.aFloat186 = local13.aFloat258 * local16.aFloat260 + local13.aFloat259 * local16.aFloat261 + local16.aFloat255 * local13.aFloat260;
		@Pc(69) float local69 = Static296.aFloat176 + (float) this.anInt7486 * Static335.aFloat186;
		@Pc(77) float local77 = Static296.aFloat176 + (float) this.anInt7476 * Static335.aFloat186;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt7487 + local77;
			local94 = (float) this.anInt7487 + local69;
		} else {
			local94 = local77 + (float) this.anInt7487;
			local88 = local69 - (float) this.anInt7487;
		}
		if (this.aClass33_Sub1_13.aFloat76 <= local88 || (float) this.aClass33_Sub1_13.anInt2161 >= local94) {
			return;
		}
		Static170.aFloat143 = local13.aFloat253 * local16.aFloat260 + local16.aFloat261 * local13.aFloat257 + local13.aFloat261 * local16.aFloat255;
		Static259.aFloat167 = local13.aFloat254 + local16.aFloat254 * local13.aFloat257 + local16.aFloat256 * local13.aFloat261 + local16.aFloat263 * local13.aFloat253;
		@Pc(170) float local170 = Static170.aFloat143 * (float) this.anInt7486 + Static259.aFloat167;
		@Pc(178) float local178 = Static170.aFloat143 * (float) this.anInt7476 + Static259.aFloat167;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local178 < local170) {
			local194 = (float) this.aClass33_Sub1_13.anInt2185 * ((float) -this.anInt7487 + local178);
			local205 = (local170 + (float) this.anInt7487) * (float) this.aClass33_Sub1_13.anInt2185;
		} else {
			local205 = ((float) this.anInt7487 + local178) * (float) this.aClass33_Sub1_13.anInt2185;
			local194 = (float) this.aClass33_Sub1_13.anInt2185 * ((float) -this.anInt7487 + local170);
		}
		if (this.aClass33_Sub1_13.aFloat83 <= local194 / (float) arg2 || local205 / (float) arg2 <= this.aClass33_Sub1_13.aFloat82) {
			return;
		}
		Static540.aFloat249 = local16.aFloat255 * local13.aFloat255 + local16.aFloat261 * local13.aFloat264 + local13.aFloat262 * local16.aFloat260;
		Static300.aFloat177 = local16.aFloat254 * local13.aFloat264 + local13.aFloat255 * local16.aFloat256 + local16.aFloat263 * local13.aFloat262 + local13.aFloat256;
		@Pc(297) float local297 = Static540.aFloat249 * (float) this.anInt7486 + Static300.aFloat177;
		@Pc(305) float local305 = Static300.aFloat177 + Static540.aFloat249 * (float) this.anInt7476;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local305 < local297) {
			local321 = ((float) -this.anInt7487 + local305) * (float) this.aClass33_Sub1_13.anInt2180;
			local332 = (float) this.aClass33_Sub1_13.anInt2180 * ((float) this.anInt7487 + local297);
		} else {
			local321 = (local297 - (float) this.anInt7487) * (float) this.aClass33_Sub1_13.anInt2180;
			local332 = (local305 + (float) this.anInt7487) * (float) this.aClass33_Sub1_13.anInt2180;
		}
		if (local321 / (float) arg2 >= this.aClass33_Sub1_13.aFloat74 || this.aClass33_Sub1_13.aFloat78 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass347Array1 != null) {
			Static434.aFloat219 = local13.aFloat259 * local16.aFloat253 + local13.aFloat260 * local16.aFloat262 + local13.aFloat258 * local16.aFloat258;
			Static411.aFloat209 = local13.aFloat262 * local16.aFloat259 + local16.aFloat257 * local13.aFloat264 + local16.aFloat264 * local13.aFloat255;
			Static1.aFloat281 = local13.aFloat261 * local16.aFloat264 + local13.aFloat257 * local16.aFloat257 + local13.aFloat253 * local16.aFloat259;
			Static3.aFloat284 = local13.aFloat257 * local16.aFloat253 + local16.aFloat262 * local13.aFloat261 + local13.aFloat253 * local16.aFloat258;
			Static288.aFloat172 = local16.aFloat253 * local13.aFloat264 + local13.aFloat255 * local16.aFloat262 + local16.aFloat258 * local13.aFloat262;
			Static630.aFloat282 = local16.aFloat259 * local13.aFloat258 + local16.aFloat257 * local13.aFloat259 + local13.aFloat260 * local16.aFloat264;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt7519 + this.anInt7496 >> 1;
			@Pc(508) int local508 = this.anInt7481 + this.anInt7506 >> 1;
			@Pc(527) int local527 = (int) (Static3.aFloat284 * (float) local508 + Static259.aFloat167 + (float) local499 * Static1.aFloat281 + Static170.aFloat143 * (float) this.anInt7486);
			@Pc(546) int local546 = (int) (Static288.aFloat172 * (float) local508 + Static411.aFloat209 * (float) local499 + Static300.aFloat177 + Static540.aFloat249 * (float) this.anInt7486);
			@Pc(565) int local565 = (int) ((float) local499 * Static630.aFloat282 + Static296.aFloat176 + Static335.aFloat186 * (float) this.anInt7486 + Static434.aFloat219 * (float) local508);
			@Pc(584) int local584 = (int) ((float) this.anInt7476 * Static170.aFloat143 + Static259.aFloat167 + Static1.aFloat281 * (float) local499 + Static3.aFloat284 * (float) local508);
			@Pc(603) int local603 = (int) ((float) local508 * Static288.aFloat172 + Static300.aFloat177 + Static411.aFloat209 * (float) local499 + Static540.aFloat249 * (float) this.anInt7476);
			arg1.anInt3614 = this.aClass33_Sub1_13.anInt2177 + this.aClass33_Sub1_13.anInt2180 * local603 / arg2;
			arg1.anInt3613 = local546 * this.aClass33_Sub1_13.anInt2180 / arg2 + this.aClass33_Sub1_13.anInt2177;
			arg1.anInt3617 = this.aClass33_Sub1_13.anInt2174 + local527 * this.aClass33_Sub1_13.anInt2185 / arg2;
			@Pc(661) int local661 = (int) (Static630.aFloat282 * (float) local499 + Static296.aFloat176 + (float) this.anInt7476 * Static335.aFloat186 + Static434.aFloat219 * (float) local508);
			arg1.anInt3615 = this.aClass33_Sub1_13.anInt2185 * local584 / arg2 + this.aClass33_Sub1_13.anInt2174;
			if (this.aClass33_Sub1_13.anInt2161 <= local565 || local661 >= this.aClass33_Sub1_13.anInt2161) {
				arg1.anInt3616 = this.aClass33_Sub1_13.anInt2185 * (this.anInt7487 + local527) / arg2 + this.aClass33_Sub1_13.anInt2174 - arg1.anInt3617;
				arg1.aBoolean303 = true;
			}
		}
		this.aClass33_Sub1_13.method2011((float) arg2);
		this.aClass33_Sub1_13.method2004();
		this.aClass33_Sub1_13.method2030(local16);
		this.method6300();
		this.method6315();
	}

	@OriginalMember(owner = "client!oca", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean644;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "()Z")
	@Override
	public boolean method6270() {
		if (this.lb == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.lb.length; local12++) {
			if (this.lb[local12] != -1 && !this.aClass33_Sub1_13.anInterface5_11.method6867(this.lb[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "()[Lclient!al;")
	@Override
	public Class18[] method6277() {
		return this.aClass18Array5;
	}

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "(I)Z")
	private boolean method6306() {
		@Pc(13) boolean local13 = !this.aClass318_2.aBoolean789;
		@Pc(29) boolean local29 = (this.anInt7529 & 0x37) != 0 && !this.aClass318_4.aBoolean789;
		@Pc(37) boolean local37 = !this.aClass318_1.aBoolean789;
		@Pc(45) boolean local45 = !this.aClass318_3.aBoolean789;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(57) boolean local57 = true;
		@Pc(76) Interface26 local76;
		@Pc(90) Buffer local90;
		if (local37) {
			if (this.aClass318_1.anInterface26_16 == null) {
				this.aClass318_1.anInterface26_16 = this.aClass33_Sub1_13.method2008(this.aBoolean642);
			}
			local76 = this.aClass318_1.anInterface26_16;
			local76.method7633(12, this.anInt7512 * 12);
			local90 = local76.method7632();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass33_Sub1_13.aNativeInterface3.copyPositions(this.anIntArray465, this.anIntArray468, this.anIntArray464, this.aShortArray121, 0, 12, this.anInt7512, local90.getAddress());
				if (local76.method7635()) {
					this.aClass318_1.anInterface26_15 = local76;
					this.aClass318_1.aBoolean789 = true;
				} else {
					local57 = false;
				}
			}
		}
		@Pc(190) short[] local190;
		@Pc(193) short[] local193;
		@Pc(184) short[] local184;
		@Pc(187) byte[] local187;
		if (local13) {
			if (this.aClass318_2.anInterface26_16 == null) {
				this.aClass318_2.anInterface26_16 = this.aClass33_Sub1_13.method2008(this.aBoolean642);
			}
			local76 = this.aClass318_2.anInterface26_16;
			local76.method7633(4, this.anInt7512 * 4);
			local90 = local76.method7632();
			if (local90 == null) {
				local57 = false;
			} else {
				if ((this.anInt7529 & 0x37) == 0) {
					if (this.aClass340_1 == null) {
						local184 = this.aShortArray114;
						local187 = this.aByteArray77;
						local190 = this.aShortArray123;
						local193 = this.aShortArray117;
					} else {
						local187 = this.aClass340_1.aByteArray96;
						local184 = this.aClass340_1.aShortArray137;
						local190 = this.aClass340_1.aShortArray136;
						local193 = this.aClass340_1.aShortArray138;
					}
					this.aClass33_Sub1_13.aNativeInterface3.copyLighting(this.aShortArray112, this.aByteArray76, this.lb, local190, local193, local184, local187, this.aShort99, this.aShort98, this.aShortArray120, 0, 4, this.anInt7512, local90.getAddress());
				} else {
					this.aClass33_Sub1_13.aNativeInterface3.copyColours(this.aShortArray112, this.aByteArray76, this.lb, this.aShort99, this.aShortArray120, 0, 4, this.anInt7512, local90.getAddress());
				}
				if (local76.method7635()) {
					this.aClass318_2.aBoolean789 = true;
					this.aClass318_2.anInterface26_15 = local76;
				} else {
					local57 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass318_4.anInterface26_16 == null) {
				this.aClass318_4.anInterface26_16 = this.aClass33_Sub1_13.method2008(this.aBoolean642);
			}
			local76 = this.aClass318_4.anInterface26_16;
			local76.method7633(12, this.anInt7512 * 12);
			local90 = local76.method7632();
			if (local90 == null) {
				local57 = false;
			} else {
				if (this.aClass340_1 == null) {
					local187 = this.aByteArray77;
					local193 = this.aShortArray117;
					local190 = this.aShortArray123;
					local184 = this.aShortArray114;
				} else {
					local187 = this.aClass340_1.aByteArray96;
					local184 = this.aClass340_1.aShortArray137;
					local193 = this.aClass340_1.aShortArray138;
					local190 = this.aClass340_1.aShortArray136;
				}
				this.aClass33_Sub1_13.aNativeInterface3.copyNormals(local190, local193, local184, local187, 3.0F / (float) this.aShort98, 3.0F / (float) (this.aShort98 / 2 + this.aShort98), 0, 12, this.anInt7512, local90.getAddress());
				if (local76.method7635()) {
					this.aClass318_4.aBoolean789 = true;
					this.aClass318_4.anInterface26_15 = local76;
				} else {
					local57 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass318_3.anInterface26_16 == null) {
				this.aClass318_3.anInterface26_16 = this.aClass33_Sub1_13.method2008(this.aBoolean642);
			}
			local76 = this.aClass318_3.anInterface26_16;
			local76.method7633(8, this.anInt7512 * 8);
			local90 = local76.method7632();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass33_Sub1_13.aNativeInterface3.copyTexCoords(this.aFloatArray59, this.aFloatArray60, 0, 8, this.anInt7512, local90.getAddress());
				if (local76.method7635()) {
					this.aClass318_3.anInterface26_15 = local76;
					this.aClass318_3.aBoolean789 = true;
				} else {
					local57 = false;
				}
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static185.anInt4395 = 0;
			local29 = 0;
			Static470.anInt8512 = 0;
			Static409.anInt6025 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray73.length > local41) {
					local55 = this.anIntArrayArray73[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static409.anInt6025 += this.anIntArray465[local63];
						Static185.anInt4395 += this.anIntArray468[local63];
						local29++;
						Static470.anInt8512 += this.anIntArray464[local63];
					}
				}
			}
			if (local29 <= 0) {
				Static470.anInt8512 = local25;
				Static185.anInt4395 = local17;
				Static409.anInt6025 = local21;
			} else {
				Static470.anInt8512 = Static470.anInt8512 / local29 + local25;
				Static185.anInt4395 = Static185.anInt4395 / local29 + local17;
				Static409.anInt6025 = local21 + Static409.anInt6025 / local29;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local25 = arg4 << 4;
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray73.length > local35) {
					local164 = this.anIntArrayArray73[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray465[local57] += local21;
						this.anIntArray468[local57] += local17;
						this.anIntArray464[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(293) int local293;
		@Pc(311) int local311;
		@Pc(767) int local767;
		@Pc(776) int local776;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray73.length > local35) {
					local164 = this.anIntArrayArray73[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray465[local57] -= Static409.anInt6025;
							this.anIntArray468[local57] -= Static185.anInt4395;
							this.anIntArray464[local57] -= Static470.anInt8512;
							if (arg4 != 0) {
								local63 = Class3_Sub1_Sub2.anIntArray84[arg4];
								local293 = Class3_Sub1_Sub2.anIntArray85[arg4];
								local311 = local293 * this.anIntArray465[local57] + this.anIntArray468[local57] * local63 + 16383 >> 14;
								this.anIntArray468[local57] = this.anIntArray468[local57] * local293 + 16383 - local63 * this.anIntArray465[local57] >> 14;
								this.anIntArray465[local57] = local311;
							}
							if (arg2 != 0) {
								local63 = Class3_Sub1_Sub2.anIntArray84[arg2];
								local293 = Class3_Sub1_Sub2.anIntArray85[arg2];
								local311 = local293 * this.anIntArray468[local57] + 16383 - this.anIntArray464[local57] * local63 >> 14;
								this.anIntArray464[local57] = this.anIntArray468[local57] * local63 + this.anIntArray464[local57] * local293 + 16383 >> 14;
								this.anIntArray468[local57] = local311;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub1_Sub2.anIntArray84[arg3];
								local293 = Class3_Sub1_Sub2.anIntArray85[arg3];
								local311 = local63 * this.anIntArray464[local57] + local293 * this.anIntArray465[local57] + 16383 >> 14;
								this.anIntArray464[local57] = local293 * this.anIntArray464[local57] + 16383 - local63 * this.anIntArray465[local57] >> 14;
								this.anIntArray465[local57] = local311;
							}
							this.anIntArray465[local57] += Static409.anInt6025;
							this.anIntArray468[local57] += Static185.anInt4395;
							this.anIntArray464[local57] += Static470.anInt8512;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray465[local57] -= Static409.anInt6025;
							this.anIntArray468[local57] -= Static185.anInt4395;
							this.anIntArray464[local57] -= Static470.anInt8512;
							if (arg2 != 0) {
								local63 = Class3_Sub1_Sub2.anIntArray84[arg2];
								local293 = Class3_Sub1_Sub2.anIntArray85[arg2];
								local311 = local293 * this.anIntArray468[local57] + 16383 - local63 * this.anIntArray464[local57] >> 14;
								this.anIntArray464[local57] = this.anIntArray468[local57] * local63 + this.anIntArray464[local57] * local293 + 16383 >> 14;
								this.anIntArray468[local57] = local311;
							}
							if (arg4 != 0) {
								local63 = Class3_Sub1_Sub2.anIntArray84[arg4];
								local293 = Class3_Sub1_Sub2.anIntArray85[arg4];
								local311 = this.anIntArray465[local57] * local293 + local63 * this.anIntArray468[local57] + 16383 >> 14;
								this.anIntArray468[local57] = this.anIntArray468[local57] * local293 + 16383 - local63 * this.anIntArray465[local57] >> 14;
								this.anIntArray465[local57] = local311;
							}
							if (arg3 != 0) {
								local63 = Class3_Sub1_Sub2.anIntArray84[arg3];
								local293 = Class3_Sub1_Sub2.anIntArray85[arg3];
								local311 = local293 * this.anIntArray465[local57] + this.anIntArray464[local57] * local63 + 16383 >> 14;
								this.anIntArray464[local57] = local293 * this.anIntArray464[local57] + 16383 - local63 * this.anIntArray465[local57] >> 14;
								this.anIntArray465[local57] = local311;
							}
							this.anIntArray465[local57] += Static409.anInt6025;
							this.anIntArray468[local57] += Static185.anInt4395;
							this.anIntArray464[local57] += Static470.anInt8512;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray73.length) {
						local55 = this.anIntArrayArray73[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local293 = this.anIntArray469[local63];
							local311 = this.anIntArray469[local63 + 1];
							for (local767 = local293; local767 < local311; local767++) {
								local776 = this.aShortArray122[local767] - 1;
								if (local776 == -1) {
									break;
								}
								@Pc(786) int local786;
								@Pc(790) int local790;
								@Pc(808) int local808;
								if (arg4 != 0) {
									local786 = Class3_Sub1_Sub2.anIntArray84[arg4];
									local790 = Class3_Sub1_Sub2.anIntArray85[arg4];
									local808 = this.aShortArray117[local776] * local786 + local790 * this.aShortArray123[local776] + 16383 >> 14;
									this.aShortArray117[local776] = (short) (this.aShortArray117[local776] * local790 + 16383 - this.aShortArray123[local776] * local786 >> 14);
									this.aShortArray123[local776] = (short) local808;
								}
								if (arg2 != 0) {
									local786 = Class3_Sub1_Sub2.anIntArray84[arg2];
									local790 = Class3_Sub1_Sub2.anIntArray85[arg2];
									local808 = local790 * this.aShortArray117[local776] + 16383 - local786 * this.aShortArray114[local776] >> 14;
									this.aShortArray114[local776] = (short) (this.aShortArray117[local776] * local786 + this.aShortArray114[local776] * local790 + 16383 >> 14);
									this.aShortArray117[local776] = (short) local808;
								}
								if (arg3 != 0) {
									local786 = Class3_Sub1_Sub2.anIntArray84[arg3];
									local790 = Class3_Sub1_Sub2.anIntArray85[arg3];
									local808 = local786 * this.aShortArray114[local776] + this.aShortArray123[local776] * local790 + 16383 >> 14;
									this.aShortArray114[local776] = (short) (this.aShortArray114[local776] * local790 + 16383 - this.aShortArray123[local776] * local786 >> 14);
									this.aShortArray123[local776] = (short) local808;
								}
							}
						}
					}
				}
				this.method6304();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray73.length) {
					local164 = this.anIntArrayArray73[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray465[local57] -= Static409.anInt6025;
						this.anIntArray468[local57] -= Static185.anInt4395;
						this.anIntArray464[local57] -= Static470.anInt8512;
						this.anIntArray465[local57] = arg2 * this.anIntArray465[local57] >> 7;
						this.anIntArray468[local57] = this.anIntArray468[local57] * arg3 >> 7;
						this.anIntArray464[local57] = this.anIntArray464[local57] * arg4 >> 7;
						this.anIntArray465[local57] += Static409.anInt6025;
						this.anIntArray468[local57] += Static185.anInt4395;
						this.anIntArray464[local57] += Static470.anInt8512;
					}
				}
			}
		} else {
			@Pc(1212) Class27 local1212;
			@Pc(1114) boolean local1114;
			@Pc(1207) Class347 local1207;
			if (arg0 == 5) {
				if (this.anIntArrayArray72 != null) {
					local1114 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray72.length) {
							local55 = this.anIntArrayArray72[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local293 = arg2 * 8 + (this.aByteArray76[local63] & 0xFF);
								if (local293 < 0) {
									local293 = 0;
								} else if (local293 > 255) {
									local293 = 255;
								}
								this.aByteArray76[local63] = (byte) local293;
							}
							local1114 |= local55.length > 0;
						}
					}
					if (local1114) {
						if (this.aClass347Array1 != null) {
							for (local41 = 0; local41 < this.anInt7537; local41++) {
								local1207 = this.aClass347Array1[local41];
								local1212 = this.aClass27Array1[local41];
								local1212.anInt569 = 255 - (this.aByteArray76[local1207.anInt9854] & 0xFF) << 24 | local1212.anInt569 & 0xFFFFFF;
							}
						}
						this.method6302();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray72 != null) {
					local1114 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray72.length > local41) {
							local55 = this.anIntArrayArray72[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local293 = this.aShortArray112[local63] & 0xFFFF;
								local311 = local293 >> 10 & 0x3F;
								local767 = local293 >> 7 & 0x7;
								@Pc(1301) int local1301 = arg2 + local311 & 0x3F;
								local767 += arg3 / 4;
								local776 = local293 & 0x7F;
								local776 += arg4;
								if (local767 < 0) {
									local767 = 0;
								} else if (local767 > 7) {
									local767 = 7;
								}
								if (local776 < 0) {
									local776 = 0;
								} else if (local776 > 127) {
									local776 = 127;
								}
								this.aShortArray112[local63] = (short) (local776 | local767 << 7 | local1301 << 10);
							}
							local1114 |= local55.length > 0;
						}
					}
					if (local1114) {
						if (this.aClass347Array1 != null) {
							for (local41 = 0; local41 < this.anInt7537; local41++) {
								local1207 = this.aClass347Array1[local41];
								local1212 = this.aClass27Array1[local41];
								local1212.anInt569 = local1212.anInt569 & 0xFF000000 | Static120.anIntArray152[this.aShortArray112[local1207.anInt9854] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6302();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray71 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray71.length > local35) {
							local164 = this.anIntArrayArray71[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1212 = this.aClass27Array1[local164[local166]];
								local1212.anInt577 += arg3;
								local1212.anInt574 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray71 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray71.length > local35) {
							local164 = this.anIntArrayArray71[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1212 = this.aClass27Array1[local164[local166]];
								local1212.anInt578 = local1212.anInt578 * arg3 >> 7;
								local1212.anInt566 = local1212.anInt566 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray71 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray71.length > local35) {
						local164 = this.anIntArrayArray71[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local1212 = this.aClass27Array1[local164[local166]];
							local1212.anInt579 = arg2 + local1212.anInt579 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!hj;)V")
	private void method6307(@OriginalArg(1) Class3_Sub1_Sub6_Sub1 arg0) {
		if (Static52.anIntArray55.length < this.anInt7512) {
			Static449.anIntArray510 = new int[this.anInt7512];
			Static52.anIntArray55 = new int[this.anInt7512];
		}
		@Pc(47) int local47;
		@Pc(85) int local85;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7484; local20++) {
			local47 = (this.anIntArray465[local20] - (this.aClass33_Sub1_13.anInt2176 * this.anIntArray468[local20] >> 8) >> this.aClass33_Sub1_13.anInt2165) - arg0.anInt4906;
			@Pc(71) int local71 = (this.anIntArray464[local20] - (this.aClass33_Sub1_13.anInt2158 * this.anIntArray468[local20] >> 8) >> this.aClass33_Sub1_13.anInt2165) - arg0.anInt4907;
			@Pc(76) int local76 = this.anIntArray469[local20];
			@Pc(83) int local83 = this.anIntArray469[local20 + 1];
			for (local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray122[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static52.anIntArray55[local94] = local47;
				Static449.anIntArray510[local94] = local71;
			}
		}
		for (local47 = 0; local47 < this.anInt7503; local47++) {
			if (this.aByteArray76 == null || this.aByteArray76[local47] <= 128) {
				@Pc(140) short local140 = this.aShortArray115[local47];
				@Pc(145) short local145 = this.aShortArray116[local47];
				@Pc(150) short local150 = this.aShortArray119[local47];
				local85 = Static52.anIntArray55[local140];
				local94 = Static52.anIntArray55[local145];
				@Pc(162) int local162 = Static52.anIntArray55[local150];
				@Pc(166) int local166 = Static449.anIntArray510[local140];
				@Pc(170) int local170 = Static449.anIntArray510[local145];
				@Pc(174) int local174 = Static449.anIntArray510[local150];
				if ((local85 - local94) * (-local174 + local170) - (local170 - local166) * (-local94 + local162) > 0) {
					arg0.method4158(local162, local166, local94, local170, local174, local85);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7519;
	}

	@OriginalMember(owner = "client!oca", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class274 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean643) {
			this.method6299();
		}
		@Pc(16) int local16 = this.anInt7496 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt7519;
		@Pc(27) int local27 = arg6 + this.anInt7481;
		@Pc(33) int local33 = arg6 + this.anInt7506;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9726 <= local21 + arg2.anInt9722 >> arg2.anInt9727 || local27 < 0 || arg2.anInt9723 <= arg2.anInt9722 + local33 >> arg2.anInt9727)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9726 <= local21 + arg3.anInt9722 >> arg3.anInt9727 || local27 < 0 || arg3.anInt9723 <= local33 + arg3.anInt9722 >> arg3.anInt9727) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9727;
			local21 = arg2.anInt9722 + local21 - 1 >> arg2.anInt9727;
			local27 >>= arg2.anInt9727;
			local33 = local33 + arg2.anInt9722 - 1 >> arg2.anInt9727;
			if (arg5 == arg2.method8041(local16, local27) && arg2.method8041(local21, local27) == arg5 && arg2.method8041(local16, local33) == arg5 && arg2.method8041(local21, local33) == arg5) {
				return;
			}
		}
		@Pc(204) int local204;
		if (arg0 == 1) {
			for (local204 = 0; local204 < this.anInt7484; local204++) {
				this.anIntArray468[local204] += arg2.method8043(arg6 + this.anIntArray464[local204], arg4 + this.anIntArray465[local204]) - arg5;
			}
		} else {
			@Pc(212) int local212;
			@Pc(223) int local223;
			if (arg0 == 2) {
				local204 = this.anInt7486;
				if (local204 == 0) {
					return;
				}
				for (local212 = 0; local212 < this.anInt7484; local212++) {
					local223 = (this.anIntArray468[local212] << 16) / local204;
					if (local223 < arg1) {
						this.anIntArray468[local212] += (arg2.method8043(this.anIntArray464[local212] + arg6, arg4 + this.anIntArray465[local212]) - arg5) * (-local223 + arg1) / arg1;
					}
				}
			} else {
				@Pc(314) int local314;
				if (arg0 == 3) {
					local204 = (arg1 & 0xFF) * 4;
					local212 = (arg1 >> 8 & 0xFF) * 4;
					local223 = (arg1 >> 16 & 0xFF) << 6;
					local314 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local204 >> 1) < 0 || arg2.anInt9726 << arg2.anInt9727 <= arg2.anInt9722 + (local204 >> 1) + arg4 || arg6 - (local212 >> 1) < 0 || arg2.anInt9722 + (local212 >> 1) + arg6 >= arg2.anInt9723 << arg2.anInt9727) {
						return;
					}
					this.method6276(arg2, arg4, arg5, local314, local223, arg6, local204, local212);
				} else if (arg0 == 4) {
					local204 = this.anInt7476 - this.anInt7486;
					for (local212 = 0; local212 < this.anInt7484; local212++) {
						this.anIntArray468[local212] = local204 + this.anIntArray468[local212] + arg3.method8043(this.anIntArray464[local212] + arg6, arg4 + this.anIntArray465[local212]) - arg5;
					}
				} else if (arg0 == 5) {
					local204 = this.anInt7476 - this.anInt7486;
					for (local212 = 0; local212 < this.anInt7484; local212++) {
						local223 = this.anIntArray465[local212] + arg4;
						local314 = arg6 + this.anIntArray464[local212];
						@Pc(320) int local320 = arg2.method8043(local314, local223);
						@Pc(326) int local326 = arg3.method8043(local314, local223);
						@Pc(334) int local334 = local320 - local326 - arg1;
						this.anIntArray468[local212] = (local334 * ((this.anIntArray468[local212] << 8) / local204) >> 8) + (local320 - arg5);
					}
				}
			}
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7476;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!wc;Lclient!fda;I)V")
	@Override
	public void method6281(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7512 == 0) {
			return;
		}
		@Pc(13) Class47_Sub3 local13 = this.aClass33_Sub1_13.aClass47_Sub3_16;
		@Pc(16) Class47_Sub3 local16 = (Class47_Sub3) arg0;
		if (!this.aBoolean643) {
			this.method6299();
		}
		Static296.aFloat176 = local13.aFloat259 * local16.aFloat254 + local16.aFloat256 * local13.aFloat260 + local16.aFloat263 * local13.aFloat258 + local13.aFloat263;
		Static335.aFloat186 = local13.aFloat259 * local16.aFloat261 + local16.aFloat255 * local13.aFloat260 + local16.aFloat260 * local13.aFloat258;
		@Pc(69) float local69 = Static296.aFloat176 + (float) this.anInt7486 * Static335.aFloat186;
		@Pc(77) float local77 = Static296.aFloat176 + Static335.aFloat186 * (float) this.anInt7476;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.anInt7487;
			local94 = (float) -this.anInt7487 + local77;
		} else {
			local87 = local77 + (float) this.anInt7487;
			local94 = (float) -this.anInt7487 + local69;
		}
		if (local94 >= this.aClass33_Sub1_13.aFloat75 || (float) this.aClass33_Sub1_13.anInt2161 >= local87) {
			return;
		}
		Static170.aFloat143 = local16.aFloat260 * local13.aFloat253 + local13.aFloat261 * local16.aFloat255 + local16.aFloat261 * local13.aFloat257;
		Static259.aFloat167 = local13.aFloat254 + local13.aFloat253 * local16.aFloat263 + local16.aFloat256 * local13.aFloat261 + local16.aFloat254 * local13.aFloat257;
		@Pc(171) float local171 = Static259.aFloat167 + Static170.aFloat143 * (float) this.anInt7486;
		@Pc(179) float local179 = Static170.aFloat143 * (float) this.anInt7476 + Static259.aFloat167;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local171 > local179) {
			local206 = (local179 - (float) this.anInt7487) * (float) this.aClass33_Sub1_13.anInt2185;
			local194 = (float) this.aClass33_Sub1_13.anInt2185 * ((float) this.anInt7487 + local171);
		} else {
			local194 = (float) this.aClass33_Sub1_13.anInt2185 * ((float) this.anInt7487 + local179);
			local206 = ((float) -this.anInt7487 + local171) * (float) this.aClass33_Sub1_13.anInt2185;
		}
		if (local206 / local87 >= this.aClass33_Sub1_13.aFloat83 || local194 / local87 <= this.aClass33_Sub1_13.aFloat82) {
			return;
		}
		Static540.aFloat249 = local16.aFloat260 * local13.aFloat262 + local16.aFloat255 * local13.aFloat255 + local13.aFloat264 * local16.aFloat261;
		Static300.aFloat177 = local13.aFloat256 + local13.aFloat264 * local16.aFloat254 + local13.aFloat255 * local16.aFloat256 + local16.aFloat263 * local13.aFloat262;
		@Pc(295) float local295 = Static300.aFloat177 + (float) this.anInt7486 * Static540.aFloat249;
		@Pc(303) float local303 = Static300.aFloat177 + (float) this.anInt7476 * Static540.aFloat249;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local295 > local303) {
			local330 = (float) this.aClass33_Sub1_13.anInt2180 * ((float) -this.anInt7487 + local303);
			local318 = (local295 + (float) this.anInt7487) * (float) this.aClass33_Sub1_13.anInt2180;
		} else {
			local318 = (float) this.aClass33_Sub1_13.anInt2180 * (local303 + (float) this.anInt7487);
			local330 = (float) this.aClass33_Sub1_13.anInt2180 * ((float) -this.anInt7487 + local295);
		}
		if (this.aClass33_Sub1_13.aFloat74 <= local330 / local87 || local318 / local87 <= this.aClass33_Sub1_13.aFloat78) {
			return;
		}
		if (arg1 != null || this.aClass347Array1 != null) {
			Static1.aFloat281 = local16.aFloat264 * local13.aFloat261 + local13.aFloat257 * local16.aFloat257 + local16.aFloat259 * local13.aFloat253;
			Static630.aFloat282 = local16.aFloat259 * local13.aFloat258 + local16.aFloat257 * local13.aFloat259 + local16.aFloat264 * local13.aFloat260;
			Static288.aFloat172 = local16.aFloat258 * local13.aFloat262 + local13.aFloat264 * local16.aFloat253 + local16.aFloat262 * local13.aFloat255;
			Static3.aFloat284 = local16.aFloat258 * local13.aFloat253 + local13.aFloat257 * local16.aFloat253 + local13.aFloat261 * local16.aFloat262;
			Static411.aFloat209 = local16.aFloat259 * local13.aFloat262 + local16.aFloat257 * local13.aFloat264 + local13.aFloat255 * local16.aFloat264;
			Static434.aFloat219 = local16.aFloat262 * local13.aFloat260 + local16.aFloat253 * local13.aFloat259 + local16.aFloat258 * local13.aFloat258;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.anInt7496 + this.anInt7519 >> 1;
			@Pc(508) int local508 = this.anInt7481 + this.anInt7506 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static3.aFloat284 + (float) this.anInt7486 * Static170.aFloat143 + Static1.aFloat281 * (float) local500 + Static259.aFloat167);
			@Pc(546) int local546 = (int) (Static288.aFloat172 * (float) local508 + (float) this.anInt7486 * Static540.aFloat249 + Static300.aFloat177 + Static411.aFloat209 * (float) local500);
			@Pc(565) int local565 = (int) (Static335.aFloat186 * (float) this.anInt7486 + (float) local500 * Static630.aFloat282 + Static296.aFloat176 + (float) local508 * Static434.aFloat219);
			if (local565 < this.aClass33_Sub1_13.anInt2161) {
				local490 = true;
			} else {
				arg1.anInt3617 = local527 * this.aClass33_Sub1_13.anInt2185 / local565 + this.aClass33_Sub1_13.anInt2174;
				arg1.anInt3613 = this.aClass33_Sub1_13.anInt2180 * local546 / local565 + this.aClass33_Sub1_13.anInt2177;
			}
			@Pc(623) int local623 = (int) (Static3.aFloat284 * (float) local508 + Static259.aFloat167 + (float) local500 * Static1.aFloat281 + (float) this.anInt7476 * Static170.aFloat143);
			@Pc(642) int local642 = (int) (Static540.aFloat249 * (float) this.anInt7476 + Static300.aFloat177 + Static411.aFloat209 * (float) local500 + Static288.aFloat172 * (float) local508);
			@Pc(661) int local661 = (int) ((float) this.anInt7476 * Static335.aFloat186 + Static630.aFloat282 * (float) local500 + Static296.aFloat176 + (float) local508 * Static434.aFloat219);
			if (local661 >= this.aClass33_Sub1_13.anInt2161) {
				arg1.anInt3614 = local642 * this.aClass33_Sub1_13.anInt2180 / local661 + this.aClass33_Sub1_13.anInt2177;
				arg1.anInt3615 = this.aClass33_Sub1_13.anInt2185 * local623 / local661 + this.aClass33_Sub1_13.anInt2174;
			} else {
				local490 = true;
			}
			if (local490) {
				if (this.aClass33_Sub1_13.anInt2161 > local565 && this.aClass33_Sub1_13.anInt2161 > local661) {
					local492 = false;
				} else {
					@Pc(735) int local735;
					@Pc(746) int local746;
					@Pc(773) int local773;
					if (local565 < this.aClass33_Sub1_13.anInt2161) {
						local735 = (local661 - this.aClass33_Sub1_13.anInt2161 << 16) / (local661 - local565);
						local746 = local623 + (local735 * (local623 - local527) >> 16);
						arg1.anInt3617 = this.aClass33_Sub1_13.anInt2174 + local746 * this.aClass33_Sub1_13.anInt2185 / this.aClass33_Sub1_13.anInt2161;
						local773 = local642 + ((local642 - local546) * local735 >> 16);
						arg1.anInt3613 = this.aClass33_Sub1_13.anInt2177 + this.aClass33_Sub1_13.anInt2180 * local773 / this.aClass33_Sub1_13.anInt2161;
					} else if (local661 < this.aClass33_Sub1_13.anInt2161) {
						local735 = (local565 - this.aClass33_Sub1_13.anInt2161 << 16) / (local565 - local661);
						local746 = ((local527 - local623) * local735 >> 16) + local527;
						local773 = local546 + ((local546 - local642) * local735 >> 16);
						arg1.anInt3617 = this.aClass33_Sub1_13.anInt2185 * local746 / this.aClass33_Sub1_13.anInt2161 + this.aClass33_Sub1_13.anInt2174;
						arg1.anInt3613 = this.aClass33_Sub1_13.anInt2180 * local773 / this.aClass33_Sub1_13.anInt2161 + this.aClass33_Sub1_13.anInt2177;
					}
				}
			}
			if (local492) {
				if (local661 >= local565) {
					arg1.anInt3616 = this.aClass33_Sub1_13.anInt2174 + (local623 - -this.anInt7487) * this.aClass33_Sub1_13.anInt2185 / local661 - arg1.anInt3615;
				} else {
					arg1.anInt3616 = this.aClass33_Sub1_13.anInt2174 + this.aClass33_Sub1_13.anInt2185 * (local527 + this.anInt7487) / local565 - arg1.anInt3617;
				}
				arg1.aBoolean303 = true;
			}
		}
		this.aClass33_Sub1_13.method2031();
		this.aClass33_Sub1_13.method2030(local16);
		this.method6300();
		this.method6315();
	}

	@OriginalMember(owner = "client!oca", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub1_Sub2.anIntArray84[arg0];
		@Pc(13) int local13 = Class3_Sub1_Sub2.anIntArray85[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7484; local15++) {
			@Pc(34) int local34 = this.anIntArray468[local15] * local13 - local9 * this.anIntArray464[local15] >> 14;
			this.anIntArray464[local15] = local13 * this.anIntArray464[local15] + local9 * this.anIntArray468[local15] >> 14;
			this.anIntArray468[local15] = local34;
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort99;
	}

	@OriginalMember(owner = "client!oca", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort98;
	}

	@OriginalMember(owner = "client!oca", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub1_Sub6 ba(@OriginalArg(0) Class3_Sub1_Sub6 arg0) {
		if (this.anInt7512 == 0) {
			return null;
		}
		if (!this.aBoolean643) {
			this.method6299();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass33_Sub1_13.anInt2176 > 0) {
			local43 = this.anInt7496 - (this.anInt7476 * this.aClass33_Sub1_13.anInt2176 >> 8) >> this.aClass33_Sub1_13.anInt2165;
			local59 = this.anInt7519 - (this.aClass33_Sub1_13.anInt2176 * this.anInt7486 >> 8) >> this.aClass33_Sub1_13.anInt2165;
		} else {
			local43 = this.anInt7496 - (this.aClass33_Sub1_13.anInt2176 * this.anInt7486 >> 8) >> this.aClass33_Sub1_13.anInt2165;
			local59 = this.anInt7519 - (this.anInt7476 * this.aClass33_Sub1_13.anInt2176 >> 8) >> this.aClass33_Sub1_13.anInt2165;
		}
		@Pc(117) int local117;
		@Pc(134) int local134;
		if (this.aClass33_Sub1_13.anInt2158 > 0) {
			local117 = this.anInt7481 - (this.anInt7476 * this.aClass33_Sub1_13.anInt2158 >> 8) >> this.aClass33_Sub1_13.anInt2165;
			local134 = this.anInt7506 - (this.anInt7486 * this.aClass33_Sub1_13.anInt2158 >> 8) >> this.aClass33_Sub1_13.anInt2165;
		} else {
			local117 = this.anInt7481 - (this.anInt7486 * this.aClass33_Sub1_13.anInt2158 >> 8) >> this.aClass33_Sub1_13.anInt2165;
			local134 = this.anInt7506 - (this.aClass33_Sub1_13.anInt2158 * this.anInt7476 >> 8) >> this.aClass33_Sub1_13.anInt2165;
		}
		@Pc(176) int local176 = local59 + 1 - local43;
		@Pc(183) int local183 = local134 + 1 - local117;
		@Pc(186) Class3_Sub1_Sub6_Sub1 local186 = (Class3_Sub1_Sub6_Sub1) arg0;
		@Pc(202) Class3_Sub1_Sub6_Sub1 local202;
		if (local186 != null && local186.method4162(local176, local183)) {
			local202 = local186;
			local186.method4164();
		} else {
			local202 = new Class3_Sub1_Sub6_Sub1(this.aClass33_Sub1_13, local176, local183);
		}
		local202.method4157(local59, local43, local117, local134);
		this.method6307(local202);
		return local202;
	}

	@OriginalMember(owner = "client!oca", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort99 = (short) arg0;
		this.method6302();
	}

	@OriginalMember(owner = "client!oca", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7481;
	}

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "(I)V")
	private void method6309() {
		if (this.aClass96_1 != null) {
			this.aClass96_1.aBoolean319 = false;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt7501; local3++) {
			local12 = this.aShortArray112[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += arg3 * (arg2 - local28) >> 7;
			}
			this.aShortArray112[local3] = (short) (local24 << 7 | local18 << 10 | local28);
		}
		if (this.aClass347Array1 != null) {
			for (local12 = 0; local12 < this.anInt7537; local12++) {
				@Pc(107) Class347 local107 = this.aClass347Array1[local12];
				@Pc(112) Class27 local112 = this.aClass27Array1[local12];
				local112.anInt569 = local112.anInt569 & 0xFF000000 | Static120.anIntArray152[this.aShortArray112[local107.anInt9854] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6302();
	}

	@OriginalMember(owner = "client!oca", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7468;
	}

	@OriginalMember(owner = "client!oca", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7484; local3++) {
			if (arg0 != 0) {
				this.anIntArray465[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray468[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray464[local3] += arg2;
			}
		}
		this.method6298();
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!oca", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort98 = (short) arg0;
		this.method6298();
		this.method6304();
	}

	@OriginalMember(owner = "client!oca", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean641;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class128 method6279(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class128_Sub3 local14;
		@Pc(18) Class128_Sub3 local18;
		if (arg0 == 1) {
			local14 = this.aClass33_Sub1_13.aClass128_Sub3_30;
			local18 = this.aClass33_Sub1_13.aClass128_Sub3_28;
		} else if (arg0 == 2) {
			local14 = this.aClass33_Sub1_13.aClass128_Sub3_29;
			local18 = this.aClass33_Sub1_13.aClass128_Sub3_27;
		} else if (arg0 == 3) {
			local14 = this.aClass33_Sub1_13.aClass128_Sub3_25;
			local18 = this.aClass33_Sub1_13.aClass128_Sub3_21;
		} else if (arg0 == 4) {
			local18 = this.aClass33_Sub1_13.aClass128_Sub3_23;
			local14 = this.aClass33_Sub1_13.aClass128_Sub3_26;
		} else if (arg0 == 5) {
			local18 = this.aClass33_Sub1_13.aClass128_Sub3_22;
			local14 = this.aClass33_Sub1_13.aClass128_Sub3_24;
		} else {
			local14 = local18 = new Class128_Sub3(this.aClass33_Sub1_13, 0, 0, true, false);
		}
		return this.method6297(local18, arg1, local14, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < arg1 && arg6 > arg7 && arg7 < arg5) {
			return false;
		} else if (arg7 > arg1 && arg7 > arg6 && arg7 > arg5) {
			return false;
		} else if (arg3 > arg0 && arg0 < arg4 && arg2 > arg0) {
			return false;
		} else {
			return arg0 <= arg3 || arg0 <= arg4 || arg2 >= arg0;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIBIZLclient!wc;I)Z")
	private boolean method6313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		@Pc(16) Class47_Sub3 local16 = (Class47_Sub3) arg4;
		@Pc(20) Class47_Sub3 local20 = this.aClass33_Sub1_13.aClass47_Sub3_16;
		@Pc(41) float local41 = local20.aFloat254 + local16.aFloat263 * local20.aFloat253 + local20.aFloat261 * local16.aFloat256 + local16.aFloat254 * local20.aFloat257;
		@Pc(62) float local62 = local20.aFloat256 + local16.aFloat254 * local20.aFloat264 + local20.aFloat255 * local16.aFloat256 + local16.aFloat263 * local20.aFloat262;
		Static1.aFloat281 = local20.aFloat257 * local16.aFloat257 + local20.aFloat261 * local16.aFloat264 + local20.aFloat253 * local16.aFloat259;
		@Pc(101) float local101 = local16.aFloat254 * local20.aFloat259 + local20.aFloat260 * local16.aFloat256 + local16.aFloat263 * local20.aFloat258 + local20.aFloat263;
		Static3.aFloat284 = local20.aFloat253 * local16.aFloat258 + local20.aFloat261 * local16.aFloat262 + local20.aFloat257 * local16.aFloat253;
		Static170.aFloat143 = local20.aFloat261 * local16.aFloat255 + local20.aFloat257 * local16.aFloat261 + local16.aFloat260 * local20.aFloat253;
		Static630.aFloat282 = local20.aFloat258 * local16.aFloat259 + local16.aFloat264 * local20.aFloat260 + local20.aFloat259 * local16.aFloat257;
		Static411.aFloat209 = local16.aFloat259 * local20.aFloat262 + local20.aFloat264 * local16.aFloat257 + local16.aFloat264 * local20.aFloat255;
		Static288.aFloat172 = local16.aFloat258 * local20.aFloat262 + local16.aFloat262 * local20.aFloat255 + local16.aFloat253 * local20.aFloat264;
		Static335.aFloat186 = local16.aFloat261 * local20.aFloat259 + local16.aFloat255 * local20.aFloat260 + local20.aFloat258 * local16.aFloat260;
		Static434.aFloat219 = local16.aFloat258 * local20.aFloat258 + local16.aFloat253 * local20.aFloat259 + local20.aFloat260 * local16.aFloat262;
		Static540.aFloat249 = local20.aFloat262 * local16.aFloat260 + local16.aFloat261 * local20.aFloat264 + local16.aFloat255 * local20.aFloat255;
		@Pc(247) boolean local247 = false;
		@Pc(249) float local249 = Float.MAX_VALUE;
		@Pc(251) float local251 = -3.4028235E38F;
		@Pc(253) float local253 = Float.MAX_VALUE;
		@Pc(255) float local255 = -3.4028235E38F;
		@Pc(259) int local259 = this.aClass33_Sub1_13.anInt2185;
		@Pc(263) int local263 = this.aClass33_Sub1_13.anInt2180;
		if (!this.aBoolean643) {
			this.method6299();
		}
		@Pc(277) int local277 = this.anInt7519 - this.anInt7496 >> 1;
		@Pc(285) int local285 = this.anInt7476 - this.anInt7486 >> 1;
		@Pc(293) int local293 = this.anInt7506 - this.anInt7481 >> 1;
		@Pc(298) int local298 = local277 + this.anInt7496;
		@Pc(303) int local303 = local285 + this.anInt7486;
		@Pc(308) int local308 = local293 + this.anInt7481;
		@Pc(315) int local315 = local298 - (local277 << arg1);
		@Pc(322) int local322 = local303 - (local285 << arg1);
		@Pc(328) int local328 = local308 - (local293 << arg1);
		@Pc(334) int local334 = (local277 << arg1) + local298;
		@Pc(340) int local340 = local303 + (local285 << arg1);
		Static595.anIntArray597[0] = local315;
		@Pc(350) int local350 = (local293 << arg1) + local308;
		Static567.anIntArray587[0] = local322;
		Static628.anIntArray621[0] = local328;
		Static595.anIntArray597[1] = local334;
		Static567.anIntArray587[1] = local322;
		Static628.anIntArray621[1] = local328;
		Static595.anIntArray597[2] = local315;
		Static567.anIntArray587[2] = local340;
		Static628.anIntArray621[2] = local328;
		Static595.anIntArray597[3] = local334;
		Static567.anIntArray587[3] = local340;
		Static595.anIntArray597[4] = local315;
		Static628.anIntArray621[3] = local328;
		Static567.anIntArray587[4] = local322;
		Static628.anIntArray621[4] = local350;
		Static595.anIntArray597[5] = local334;
		Static567.anIntArray587[5] = local322;
		Static595.anIntArray597[6] = local315;
		Static628.anIntArray621[5] = local350;
		Static567.anIntArray587[6] = local340;
		Static628.anIntArray621[6] = local350;
		Static595.anIntArray597[7] = local334;
		Static567.anIntArray587[7] = local340;
		Static628.anIntArray621[7] = local350;
		@Pc(475) float local475;
		@Pc(503) float local503;
		@Pc(489) float local489;
		@Pc(461) float local461;
		@Pc(456) float local456;
		@Pc(451) float local451;
		for (@Pc(444) int local444 = 0; local444 < 8; local444++) {
			local451 = Static628.anIntArray621[local444];
			local456 = Static567.anIntArray587[local444];
			local461 = Static595.anIntArray597[local444];
			local475 = local456 * Static170.aFloat143 + Static1.aFloat281 * local461 + local451 * Static3.aFloat284 + local41;
			local489 = local461 * Static630.aFloat282 + local456 * Static335.aFloat186 + local451 * Static434.aFloat219 + local101;
			local503 = local62 + Static288.aFloat172 * local451 + Static411.aFloat209 * local461 + local456 * Static540.aFloat249;
			if ((float) this.aClass33_Sub1_13.anInt2161 <= local489) {
				if (arg2 > 0) {
					local489 = arg2;
				}
				@Pc(530) float local530 = (float) this.aClass33_Sub1_13.anInt2174 + (float) local259 * local475 / local489;
				if (local249 > local530) {
					local249 = local530;
				}
				@Pc(548) float local548 = (float) local263 * local503 / local489 + (float) this.aClass33_Sub1_13.anInt2177;
				if (local251 < local530) {
					local251 = local530;
				}
				if (local255 < local548) {
					local255 = local548;
				}
				local247 = true;
				if (local253 > local548) {
					local253 = local548;
				}
			}
		}
		if (local247 && (float) arg5 > local249 && local251 > (float) arg5 && (float) arg0 > local253 && local255 > (float) arg0) {
			if (arg3) {
				return true;
			}
			if (Static52.anIntArray55.length < this.anInt7512) {
				Static449.anIntArray510 = new int[this.anInt7512];
				Static52.anIntArray55 = new int[this.anInt7512];
			}
			@Pc(703) int local703;
			for (@Pc(613) int local613 = 0; local613 < this.anInt7484; local613++) {
				local451 = this.anIntArray464[local613];
				local456 = this.anIntArray468[local613];
				local461 = this.anIntArray465[local613];
				local503 = local451 * Static288.aFloat172 + local456 * Static540.aFloat249 + Static411.aFloat209 * local461 + local62;
				local475 = local41 + local451 * Static3.aFloat284 + Static170.aFloat143 * local456 + Static1.aFloat281 * local461;
				local489 = local101 + Static434.aFloat219 * local451 + Static335.aFloat186 * local456 + local461 * Static630.aFloat282;
				@Pc(716) int local716;
				@Pc(721) int local721;
				@Pc(728) int local728;
				if (local489 >= (float) this.aClass33_Sub1_13.anInt2161) {
					if (arg2 > 0) {
						local489 = arg2;
					}
					local703 = (int) ((float) this.aClass33_Sub1_13.anInt2174 + (float) local259 * local475 / local489);
					local716 = (int) ((float) this.aClass33_Sub1_13.anInt2177 + (float) local263 * local503 / local489);
					local721 = this.anIntArray469[local613];
					local728 = this.anIntArray469[local613 + 1];
					for (@Pc(730) int local730 = local721; local730 < local728; local730++) {
						@Pc(739) int local739 = this.aShortArray122[local730] - 1;
						if (local739 == -1) {
							break;
						}
						Static52.anIntArray55[local739] = local703;
						Static449.anIntArray510[local739] = local716;
					}
				} else {
					local703 = this.anIntArray469[local613];
					local716 = this.anIntArray469[local613 + 1];
					for (local721 = local703; local721 < local716; local721++) {
						local728 = this.aShortArray122[local721] - 1;
						if (local728 == -1) {
							break;
						}
						Static52.anIntArray55[this.aShortArray122[local721] - 1] = -999999;
					}
				}
			}
			for (local703 = 0; local703 < this.anInt7501; local703++) {
				if (Static52.anIntArray55[this.aShortArray115[local703]] != -999999 && Static52.anIntArray55[this.aShortArray116[local703]] != -999999 && Static52.anIntArray55[this.aShortArray119[local703]] != -999999 && this.method6312(arg5, Static449.anIntArray510[this.aShortArray115[local703]], Static52.anIntArray55[this.aShortArray119[local703]], Static52.anIntArray55[this.aShortArray115[local703]], Static52.anIntArray55[this.aShortArray116[local703]], Static449.anIntArray510[this.aShortArray119[local703]], Static449.anIntArray510[this.aShortArray116[local703]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!id;IJFIIIBFI)S")
	private short method6314(@OriginalArg(0) int arg0, @OriginalArg(1) Class142 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray469[arg0];
		@Pc(17) int local17 = this.anIntArray469[arg0 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local10; local27 < local17; local27++) {
			@Pc(34) short local34 = this.aShortArray122[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (Static584.aLongArray15[local27] == arg3) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray122[local25] = (short) (this.anInt7512 + 1);
		Static584.aLongArray15[local25] = arg3;
		this.aShortArray120[this.anInt7512] = (short) arg5;
		this.aShortArray121[this.anInt7512] = (short) arg0;
		this.aShortArray123[this.anInt7512] = (short) arg2;
		this.aShortArray117[this.anInt7512] = (short) arg7;
		this.aShortArray114[this.anInt7512] = (short) arg9;
		this.aByteArray77[this.anInt7512] = (byte) arg6;
		this.aFloatArray59[this.anInt7512] = arg8;
		this.aFloatArray60[this.anInt7512] = arg4;
		return (short) this.anInt7512++;
	}

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "(I)V")
	private void method6315() {
		if (this.aClass347Array1 == null) {
			return;
		}
		this.aClass33_Sub1_13.C(!this.aBoolean644);
		this.aClass33_Sub1_13.method2044(false);
		this.aClass33_Sub1_13.method2098(1, Static139.aClass371_3);
		this.aClass33_Sub1_13.method1991(Static139.aClass371_3, 1);
		for (@Pc(36) int local36 = 0; local36 < this.anInt7537; local36++) {
			@Pc(43) Class347 local43 = this.aClass347Array1[local36];
			@Pc(48) Class27 local48 = this.aClass27Array1[local36];
			if (!local43.aBoolean814 || !this.aClass33_Sub1_13.method6185()) {
				@Pc(76) float local76 = (float) (this.anIntArray465[local43.anInt9850] + this.anIntArray465[local43.anInt9849] + this.anIntArray465[local43.anInt9851]) * 0.3333333F;
				@Pc(97) float local97 = (float) (this.anIntArray468[local43.anInt9850] + this.anIntArray468[local43.anInt9849] + this.anIntArray468[local43.anInt9851]) * 0.3333333F;
				@Pc(119) float local119 = (float) (this.anIntArray464[local43.anInt9849] + this.anIntArray464[local43.anInt9851] + this.anIntArray464[local43.anInt9850]) * 0.3333333F;
				@Pc(133) float local133 = Static259.aFloat167 + Static3.aFloat284 * local119 + Static170.aFloat143 * local97 + Static1.aFloat281 * local76;
				@Pc(147) float local147 = Static300.aFloat177 + Static288.aFloat172 * local119 + Static411.aFloat209 * local76 + Static540.aFloat249 * local97;
				@Pc(161) float local161 = local119 * Static434.aFloat219 + local76 * Static630.aFloat282 + local97 * Static335.aFloat186 + Static296.aFloat176;
				@Pc(182) float local182 = (float) (1.0D / Math.sqrt((double) (local161 * local161 + local133 * local133 + local147 * local147))) * (float) local43.anInt9852;
				@Pc(187) Class47_Sub3 local187 = this.aClass33_Sub1_13.method2052();
				local187.method7903(local161 - local182 * local161, local43.aShort114 * local48.anInt578 >> 7, (float) local48.anInt577 + local147 - local147 * local182, (float) local48.anInt574 + local133 - local133 * local182, local48.anInt579, local48.anInt566 * local43.aShort115 >> 7);
				local187.method7892(this.aClass33_Sub1_13.aClass47_Sub3_17);
				this.aClass33_Sub1_13.method2042();
				@Pc(244) int local244 = local48.anInt569;
				this.aClass33_Sub1_13.method2012(false, local43.aShort113, false);
				this.aClass33_Sub1_13.method2032(local43.aByte121);
				this.aClass33_Sub1_13.method1996(local244);
				this.aClass33_Sub1_13.method2065();
			}
		}
		this.aClass33_Sub1_13.method1991(Static25.aClass371_1, 1);
		this.aClass33_Sub1_13.method2098(1, Static25.aClass371_1);
		this.aClass33_Sub1_13.C(true);
	}

	@OriginalMember(owner = "client!oca", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray73 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7467; local12++) {
			this.anIntArray465[local12] <<= 0x4;
			this.anIntArray468[local12] <<= 0x4;
			this.anIntArray464[local12] <<= 0x4;
		}
		Static185.anInt4395 = 0;
		Static409.anInt6025 = 0;
		Static470.anInt8512 = 0;
		return true;
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "()[Lclient!mi;")
	@Override
	public Class215[] method6278() {
		return this.aClass215Array5;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!wc;)V")
	@Override
	public void method6287(@OriginalArg(0) Class47 arg0) {
		@Pc(8) Class47_Sub3 local8 = (Class47_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass18Array5 != null) {
			for (local13 = 0; local13 < this.aClass18Array5.length; local13++) {
				@Pc(20) Class18 local20 = this.aClass18Array5[local13];
				@Pc(22) Class18 local22 = local20;
				if (local20.aClass18_1 != null) {
					local22 = local20.aClass18_1;
				}
				local22.anInt198 = (int) (local8.aFloat254 + (float) this.anIntArray464[local20.anInt196] * local8.aFloat253 + local8.aFloat261 * (float) this.anIntArray468[local20.anInt196] + local8.aFloat257 * (float) this.anIntArray465[local20.anInt196]);
				local22.anInt199 = (int) (local8.aFloat255 * (float) this.anIntArray468[local20.anInt196] + local8.aFloat264 * (float) this.anIntArray465[local20.anInt196] + (float) this.anIntArray464[local20.anInt196] * local8.aFloat262 + local8.aFloat256);
				local22.anInt204 = (int) (local8.aFloat258 * (float) this.anIntArray464[local20.anInt196] + local8.aFloat260 * (float) this.anIntArray468[local20.anInt196] + (float) this.anIntArray465[local20.anInt196] * local8.aFloat259 + local8.aFloat263);
				local22.anInt194 = (int) (local8.aFloat257 * (float) this.anIntArray465[local20.anInt197] + (float) this.anIntArray468[local20.anInt197] * local8.aFloat261 + local8.aFloat253 * (float) this.anIntArray464[local20.anInt197] + local8.aFloat254);
				local22.anInt201 = (int) ((float) this.anIntArray464[local20.anInt197] * local8.aFloat262 + local8.aFloat264 * (float) this.anIntArray465[local20.anInt197] + local8.aFloat255 * (float) this.anIntArray468[local20.anInt197] + local8.aFloat256);
				local22.anInt200 = (int) (local8.aFloat263 + (float) this.anIntArray464[local20.anInt197] * local8.aFloat258 + (float) this.anIntArray465[local20.anInt197] * local8.aFloat259 + local8.aFloat260 * (float) this.anIntArray468[local20.anInt197]);
				local22.anInt208 = (int) ((float) this.anIntArray465[local20.anInt203] * local8.aFloat257 + (float) this.anIntArray468[local20.anInt203] * local8.aFloat261 + (float) this.anIntArray464[local20.anInt203] * local8.aFloat253 + local8.aFloat254);
				local22.anInt207 = (int) (local8.aFloat256 + local8.aFloat255 * (float) this.anIntArray468[local20.anInt203] + (float) this.anIntArray465[local20.anInt203] * local8.aFloat264 + local8.aFloat262 * (float) this.anIntArray464[local20.anInt203]);
				local22.anInt206 = (int) ((float) this.anIntArray464[local20.anInt203] * local8.aFloat258 + local8.aFloat260 * (float) this.anIntArray468[local20.anInt203] + local8.aFloat259 * (float) this.anIntArray465[local20.anInt203] + local8.aFloat263);
			}
		}
		if (this.aClass215Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass215Array5.length; local13++) {
			@Pc(365) Class215 local365 = this.aClass215Array5[local13];
			@Pc(367) Class215 local367 = local365;
			if (local365.aClass215_1 != null) {
				local367 = local365.aClass215_1;
			}
			if (local365.aClass47_3 == null) {
				local365.aClass47_3 = local8.method7867();
			} else {
				local365.aClass47_3.method7877(local8);
			}
			local367.anInt6806 = (int) (local8.aFloat254 + (float) this.anIntArray465[local365.anInt6805] * local8.aFloat257 + local8.aFloat261 * (float) this.anIntArray468[local365.anInt6805] + local8.aFloat253 * (float) this.anIntArray464[local365.anInt6805]);
			local367.anInt6804 = (int) (local8.aFloat256 + local8.aFloat255 * (float) this.anIntArray468[local365.anInt6805] + local8.aFloat264 * (float) this.anIntArray465[local365.anInt6805] + (float) this.anIntArray464[local365.anInt6805] * local8.aFloat262);
			local367.anInt6810 = (int) (local8.aFloat258 * (float) this.anIntArray464[local365.anInt6805] + local8.aFloat259 * (float) this.anIntArray465[local365.anInt6805] + local8.aFloat260 * (float) this.anIntArray468[local365.anInt6805] + local8.aFloat263);
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILclient!wc;ZII)Z")
	@Override
	public boolean method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6313(arg1, arg4, arg5, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "()V")
	@Override
	public void method6295() {
		if (this.anInt7512 > 0 && this.anInt7503 > 0) {
			this.method6306();
			this.method6316();
			this.method6301();
		}
	}

	@OriginalMember(owner = "client!oca", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean643) {
			this.method6299();
		}
		return this.anInt7463;
	}

	@OriginalMember(owner = "client!oca", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass318_1 != null) {
			this.aClass318_1.aBoolean788 = Static631.method8541(arg0, this.anInt7529);
		}
		if (this.aClass318_3 != null) {
			this.aClass318_3.aBoolean788 = Static25.method426(this.anInt7529, arg0);
		}
		if (this.aClass318_2 != null) {
			this.aClass318_2.aBoolean788 = Static350.method5752(this.anInt7529, arg0);
		}
		if (this.aClass318_4 != null) {
			this.aClass318_4.aBoolean788 = Static618.method8385(this.anInt7529, arg0);
		}
		this.anInt7468 = arg0;
		this.aBoolean640 = true;
		if (this.aClass340_1 != null && (this.anInt7468 & 0x10000) == 0) {
			this.aShortArray123 = this.aClass340_1.aShortArray136;
			this.aShortArray114 = this.aClass340_1.aShortArray137;
			this.aShortArray117 = this.aClass340_1.aShortArray138;
			this.aByteArray77 = this.aClass340_1.aByteArray96;
			this.aClass340_1 = null;
		}
		this.method6301();
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)Z")
	private boolean method6316() {
		if (this.aClass96_1.aBoolean319) {
			return true;
		}
		if (this.aClass96_1.anInterface23_5 == null) {
			this.aClass96_1.anInterface23_5 = this.aClass33_Sub1_13.method1998(this.aBoolean642);
		}
		@Pc(33) Interface23 local33 = this.aClass96_1.anInterface23_5;
		local33.method7624(this.anInt7503 * 6);
		@Pc(45) Buffer local45 = local33.method4807();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass33_Sub1_13.method2092(local45);
			@Pc(57) int local57;
			if (Stream.b()) {
				for (local57 = 0; local57 < this.anInt7503; local57++) {
					local53.e(this.aShortArray115[local57]);
					local53.e(this.aShortArray116[local57]);
					local53.e(this.aShortArray119[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt7503; local57++) {
					local53.a(this.aShortArray115[local57]);
					local53.a(this.aShortArray116[local57]);
					local53.a(this.aShortArray119[local57]);
				}
			}
			local53.a();
			if (local33.method4806()) {
				this.aClass96_1.anInterface23_6 = local33;
				this.aClass96_1.aBoolean319 = true;
				this.aBoolean640 = true;
				return true;
			}
		}
		return false;
	}
}
