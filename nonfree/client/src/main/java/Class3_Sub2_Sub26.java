import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!of", name = "X", descriptor = "I")
	private int anInt2829;

	@OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
	private int anInt2834;

	@OriginalMember(owner = "client!of", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
	private int anInt2840;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "I")
	private int anInt2828;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
	private int anInt2831;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
	private int anInt2836;

	@OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
	private int anInt2830;

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
	private int anInt2835;

	@OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
	private int anInt2843;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
	private void method2090() {
		@Pc(12) Random local12 = new Random((long) this.anInt2833);
		@Pc(17) int local17 = 4096 / this.anInt2843;
		this.anInt2831 = this.anInt2830 * this.anInt2843;
		@Pc(29) int local29 = 4096 / this.anInt2830;
		this.anIntArrayArray31 = new int[this.anInt2831][2];
		this.anInt2840 = local17 >> 1;
		@Pc(48) int local48 = this.anInt2840 * this.anInt2836 >> 12;
		this.anInt2829 = local29 >> 1;
		@Pc(71) int local71 = this.anInt2836 * this.anInt2829 >> 12;
		for (@Pc(73) int local73 = 0; local73 < this.anInt2843; local73++) {
			@Pc(79) int local79 = local73 * local17;
			for (@Pc(81) int local81 = 0; local81 < this.anInt2830; local81++) {
				@Pc(91) int local91 = local73 * this.anInt2830 + local81;
				@Pc(102) int local102 = (Static12.method194(local12, 8192) - 4096) * local71 >> 12;
				@Pc(113) int local113 = (Static12.method194(local12, 8192) - 4096) * local48 >> 12;
				this.anIntArrayArray31[local91][0] = local81 * local29 + local102;
				this.anIntArrayArray31[local91][1] = local79 + local113;
			}
		}
		this.anInt2834 = this.anInt2843 >= this.anInt2830 ? this.anInt2843 : this.anInt2830;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(19) int local19 = Static123.anIntArray308[arg0];
			@Pc(22) int local22 = this.anInt2835;
			@Pc(40) int local40;
			if (local22 == 2) {
				for (local22 = 0; local22 < Static86.anInt1942; local22++) {
					local40 = Static165.anIntArray17[local22];
					@Pc(47) int[] local47 = this.method2092(2, local40, local19);
					local7[local22] = local47[1] - local47[0];
				}
			} else if (local22 == 1) {
				for (local22 = 0; local22 < Static86.anInt1942; local22++) {
					local40 = Static165.anIntArray17[local22];
					local7[local22] = this.method2092(2, local40, local19)[1];
				}
			} else {
				for (local22 = 0; local22 < Static86.anInt1942; local22++) {
					local40 = Static165.anIntArray17[local22];
					local7[local22] = this.method2092(1, local40, local19)[0];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)[I")
	private int[] method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int[] local8 = new int[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt2829;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(38) int local38 = arg1 * this.anInt2830 >> 12;
		arg2 += this.anInt2840;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		@Pc(54) int local54 = arg2 * this.anInt2843 >> 12;
		@Pc(56) int local56 = -1;
		@Pc(58) int local58 = -1;
		@Pc(60) int local60 = Integer.MAX_VALUE;
		@Pc(67) int local67 = Integer.MAX_VALUE;
		@Pc(78) int local78 = this.anInt2843 <= 2 ? this.anInt2843 - 1 : 2;
		@Pc(89) int local89 = this.anInt2830 > 2 ? 2 : this.anInt2830 - 1;
		@Pc(97) int local97;
		@Pc(103) int local103;
		@Pc(114) int local114;
		@Pc(153) int local153;
		@Pc(160) int local160;
		for (@Pc(92) int local92 = -local89; local92 <= local89; local92++) {
			for (local97 = -local78; local97 <= local78; local97++) {
				local103 = local92 + local38;
				if (local103 < 0) {
					local103 += this.anInt2830;
				}
				local114 = local54 + local97;
				if (local114 < 0) {
					local114 += this.anInt2843;
				}
				if (this.anInt2830 <= local103) {
					local103 -= this.anInt2830;
				}
				if (local114 >= this.anInt2843) {
					local114 -= this.anInt2843;
				}
				local153 = local103 + this.anInt2830 * local114;
				local160 = this.anIntArrayArray31[local153][0];
				@Pc(165) int local165 = arg1 - local160;
				@Pc(172) int local172 = this.anIntArrayArray31[local153][1];
				if (local165 < 0) {
					local165 = -local165;
				}
				@Pc(182) int local182 = arg2 - local172;
				if (local165 > 2048) {
					local165 = 4096 - local165;
				}
				if (local182 < 0) {
					local182 = -local182;
				}
				if (local182 > 2048) {
					local182 = 4096 - local182;
				}
				@Pc(214) int local214 = local182 * local182 + local165 * local165 >> 12;
				if (local214 < local67) {
					if (local58 == -1) {
						local58 = local153;
						local60 = local214;
					} else {
						local58 = local56;
						local60 = local67;
					}
					local67 = local214;
					local56 = local153;
				} else if (local56 == local58 && local58 != local153 || local60 > local214 && local56 != local153) {
					local58 = local153;
					local60 = local214;
				}
			}
		}
		local97 = arg1 - this.anIntArrayArray31[local56][0];
		if (local97 < 0) {
			local97 = -local97;
		}
		if (local97 > 2048) {
			local97 = 4096 - local97;
		}
		local103 = arg2 - this.anIntArrayArray31[local56][1];
		local153 = arg2 - this.anIntArrayArray31[local58][1];
		if (local103 < 0) {
			local103 = -local103;
		}
		if (local103 > 2048) {
			local103 = 4096 - local103;
		}
		if (local153 < 0) {
			local153 = -local153;
		}
		local114 = arg1 - this.anIntArrayArray31[local58][0];
		if (local114 < 0) {
			local114 = -local114;
		}
		if (local114 > 2048) {
			local114 = 4096 - local114;
		}
		if (local153 > 2048) {
			local153 = 4096 - local153;
		}
		local160 = this.anInt2828;
		if (local160 == 1) {
			local67 = (int) Math.sqrt((double) (local103 * local103 + local97 * local97));
			local60 = (int) Math.sqrt((double) (local114 * local114 + local153 * local153));
		} else if (local160 == 2) {
			local67 = Math.max(local97, local103);
			local60 = Math.max(local114, local153);
		} else {
			local67 = local103 * local103 + local97 * local97;
			local60 = local153 * local153 + local114 * local114;
		}
		if (arg0 > 1) {
			local8[1] = this.anInt2834 * local60;
		}
		local8[0] = local67 * this.anInt2834;
		return local8;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2830 = this.anInt2843 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt2833 = arg0.method1354();
		} else if (arg1 == 2) {
			this.anInt2836 = arg0.method1359();
		} else if (arg1 == 3) {
			this.anInt2835 = arg0.method1354();
		} else if (arg1 == 4) {
			this.anInt2828 = arg0.method1354();
		} else if (arg1 == 5) {
			this.anInt2830 = arg0.method1354();
		} else if (arg1 == 6) {
			this.anInt2843 = arg0.method1354();
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		this.method2090();
	}
}
