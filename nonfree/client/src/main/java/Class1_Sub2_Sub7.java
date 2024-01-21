import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!eb", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "I")
	private int anInt1040;

	@OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
	private int anInt1038;

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1044 = this.anInt1031 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt1045 = arg0.method861();
		} else if (arg1 == 2) {
			this.anInt1040 = arg0.method878();
		} else if (arg1 == 3) {
			this.anInt1042 = arg0.method861();
		} else if (arg1 == 4) {
			this.anInt1039 = arg0.method861();
		} else if (arg1 == 5) {
			this.anInt1044 = arg0.method861();
		} else if (arg1 == 6) {
			this.anInt1031 = arg0.method861();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(25) int local25 = Static37.anIntArray125[arg0];
			@Pc(28) int local28 = this.anInt1042;
			@Pc(44) int local44;
			if (local28 == 2) {
				for (local28 = 0; local28 < Static110.anInt2825; local28++) {
					local44 = Static86.anIntArray294[local28];
					@Pc(51) int[] local51 = this.method625(2, local44, local25);
					local17[local28] = local51[1] - local51[0];
				}
			} else if (local28 == 1) {
				for (local28 = 0; local28 < Static110.anInt2825; local28++) {
					local44 = Static86.anIntArray294[local28];
					local17[local28] = this.method625(2, local44, local25)[1];
				}
			} else {
				for (local28 = 0; local28 < Static110.anInt2825; local28++) {
					local44 = Static86.anIntArray294[local28];
					local17[local28] = this.method625(1, local44, local25)[0];
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		this.method624();
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	private void method624() {
		@Pc(8) Random local8 = new Random((long) this.anInt1045);
		@Pc(17) int local17 = 4096 / this.anInt1044;
		this.anInt1028 = local17 >> 1;
		@Pc(27) int local27 = 4096 / this.anInt1031;
		this.anInt1038 = this.anInt1044 * this.anInt1031;
		this.anIntArrayArray7 = new int[this.anInt1038][2];
		this.anInt1029 = local27 >> 1;
		@Pc(53) int local53 = this.anInt1029 * this.anInt1040 >> 12;
		@Pc(61) int local61 = this.anInt1040 * this.anInt1028 >> 12;
		for (@Pc(63) int local63 = 0; local63 < this.anInt1031; local63++) {
			@Pc(69) int local69 = local63 * local27;
			for (@Pc(71) int local71 = 0; local71 < this.anInt1044; local71++) {
				@Pc(80) int local80 = local71 + this.anInt1044 * local63;
				@Pc(91) int local91 = local61 * (Static137.method2402(local8, 8192) - 4096) >> 12;
				@Pc(102) int local102 = local53 * (Static137.method2402(local8, 8192) - 4096) >> 12;
				this.anIntArrayArray7[local80][0] = local91 + local71 * local17;
				this.anIntArrayArray7[local80][1] = local69 + local102;
			}
		}
		this.anInt1046 = this.anInt1031 >= this.anInt1044 ? this.anInt1031 : this.anInt1044;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIII)[I")
	private int[] method625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg2 += this.anInt1029;
		arg1 += this.anInt1028;
		@Pc(32) int local32 = -1;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = Integer.MAX_VALUE;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(53) int local53 = this.anInt1031 * arg2 >> 12;
		@Pc(60) int local60 = this.anInt1044 * arg1 >> 12;
		@Pc(62) int local62 = Integer.MAX_VALUE;
		@Pc(73) int local73 = this.anInt1044 <= 2 ? this.anInt1044 - 1 : 2;
		@Pc(86) int local86 = this.anInt1031 <= 2 ? this.anInt1031 - 1 : 2;
		@Pc(94) int local94;
		@Pc(128) int local128;
		@Pc(101) int local101;
		@Pc(151) int local151;
		@Pc(158) int local158;
		for (@Pc(89) int local89 = -local73; local89 <= local73; local89++) {
			for (local94 = -local86; local94 <= local86; local94++) {
				local101 = local53 + local94;
				if (local101 < 0) {
					local101 += this.anInt1031;
				}
				if (this.anInt1031 <= local101) {
					local101 -= this.anInt1031;
				}
				local128 = local89 + local60;
				if (local128 < 0) {
					local128 += this.anInt1044;
				}
				if (this.anInt1044 <= local128) {
					local128 -= this.anInt1044;
				}
				local151 = local128 + local101 * this.anInt1044;
				local158 = this.anIntArrayArray7[local151][0];
				@Pc(165) int local165 = this.anIntArrayArray7[local151][1];
				@Pc(170) int local170 = arg1 - local158;
				if (local170 < 0) {
					local170 = -local170;
				}
				@Pc(183) int local183 = arg2 - local165;
				if (local183 < 0) {
					local183 = -local183;
				}
				if (local183 > 2048) {
					local183 = 4096 - local183;
				}
				if (local170 > 2048) {
					local170 = 4096 - local170;
				}
				@Pc(217) int local217 = local170 * local170 + local183 * local183 >> 12;
				if (local217 < local36) {
					if (local32 == -1) {
						local62 = local217;
						local32 = local151;
					} else {
						local62 = local36;
						local32 = local34;
					}
					local34 = local151;
					local36 = local217;
				} else if (local34 == local32 && local151 != local32 || local62 > local217 && local151 != local34) {
					local32 = local151;
					local62 = local217;
				}
			}
		}
		local94 = arg1 - this.anIntArrayArray7[local34][0];
		local101 = arg1 - this.anIntArrayArray7[local32][0];
		if (local94 < 0) {
			local94 = -local94;
		}
		local128 = arg2 - this.anIntArrayArray7[local34][1];
		if (local101 < 0) {
			local101 = -local101;
		}
		local151 = arg2 - this.anIntArrayArray7[local32][1];
		if (local151 < 0) {
			local151 = -local151;
		}
		if (local128 < 0) {
			local128 = -local128;
		}
		if (local151 > 2048) {
			local151 = 4096 - local151;
		}
		if (local94 > 2048) {
			local94 = 4096 - local94;
		}
		if (local101 > 2048) {
			local101 = 4096 - local101;
		}
		if (local128 > 2048) {
			local128 = 4096 - local128;
		}
		local158 = this.anInt1039;
		if (local158 == 1) {
			local36 = (int) Math.sqrt((double) (local128 * local128 + local94 * local94));
			local62 = (int) Math.sqrt((double) (local101 * local101 + local151 * local151));
		} else if (local158 == 2) {
			local36 = Math.max(local94, local128);
			local62 = Math.max(local101, local151);
		} else {
			local62 = local151 * local151 + local101 * local101;
			local36 = local94 * local94 + local128 * local128;
		}
		if (arg0 > 1) {
			local8[1] = this.anInt1046 * local62;
		}
		local8[0] = local36 * this.anInt1046;
		return local8;
	}
}
