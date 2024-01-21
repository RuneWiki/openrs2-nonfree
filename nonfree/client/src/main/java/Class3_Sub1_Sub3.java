import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!ba", name = "kb", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!ba", name = "pb", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!ba", name = "qb", descriptor = "I")
	private int anInt321;

	@OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!ba", name = "tb", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)[I")
	private int[] method285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg2 += this.anInt318;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		arg1 += this.anInt308;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(49) int local49 = this.anInt312 * arg1 >> 12;
		@Pc(51) int local51 = -1;
		@Pc(58) int local58 = this.anInt314 * arg2 >> 12;
		@Pc(60) int local60 = -1;
		@Pc(62) int local62 = Integer.MAX_VALUE;
		@Pc(75) int local75 = this.anInt314 <= 2 ? this.anInt314 - 1 : 2;
		@Pc(88) int local88 = this.anInt312 > 2 ? 2 : this.anInt312 - 1;
		@Pc(90) int local90 = Integer.MAX_VALUE;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(123) int local123;
		@Pc(159) int local159;
		@Pc(166) int local166;
		for (@Pc(101) int local101 = -local88; local101 <= local88; local101++) {
			for (local106 = -local75; local106 <= local75; local106++) {
				local112 = local49 + local101;
				if (local112 < 0) {
					local112 += this.anInt312;
				}
				local123 = local58 + local106;
				if (local123 < 0) {
					local123 += this.anInt314;
				}
				if (local112 >= this.anInt312) {
					local112 -= this.anInt312;
				}
				if (this.anInt314 <= local123) {
					local123 -= this.anInt314;
				}
				local159 = this.anInt312 * local123 + local112;
				local166 = this.anIntArrayArray10[local159][0];
				@Pc(173) int local173 = this.anIntArrayArray10[local159][1];
				@Pc(178) int local178 = arg1 - local166;
				if (local178 < 0) {
					local178 = -local178;
				}
				if (local178 > 2048) {
					local178 = 4096 - local178;
				}
				@Pc(198) int local198 = arg2 - local173;
				if (local198 < 0) {
					local198 = -local198;
				}
				if (local198 > 2048) {
					local198 = 4096 - local198;
				}
				@Pc(224) int local224 = local198 * local198 + local178 * local178 >> 12;
				if (local62 > local224) {
					if (local60 == -1) {
						local90 = local224;
						local60 = local159;
					} else {
						local60 = local51;
						local90 = local62;
					}
					local62 = local224;
					local51 = local159;
				} else if (local51 == local60 && local159 != local60 || local224 < local90 && local159 != local51) {
					local90 = local224;
					local60 = local159;
				}
			}
		}
		local106 = arg1 - this.anIntArrayArray10[local51][0];
		local112 = arg2 - this.anIntArrayArray10[local51][1];
		if (local112 < 0) {
			local112 = -local112;
		}
		if (local106 < 0) {
			local106 = -local106;
		}
		local123 = arg1 - this.anIntArrayArray10[local60][0];
		if (local106 > 2048) {
			local106 = 4096 - local106;
		}
		local159 = arg2 - this.anIntArrayArray10[local60][1];
		if (local123 < 0) {
			local123 = -local123;
		}
		if (local123 > 2048) {
			local123 = 4096 - local123;
		}
		if (local159 < 0) {
			local159 = -local159;
		}
		if (local112 > 2048) {
			local112 = 4096 - local112;
		}
		if (local159 > 2048) {
			local159 = 4096 - local159;
		}
		local166 = this.anInt311;
		if (local166 == 1) {
			local62 = (int) Math.sqrt((double) (local106 * local106 + local112 * local112));
			local90 = (int) Math.sqrt((double) (local123 * local123 + local159 * local159));
		} else if (local166 == 2) {
			local62 = Math.max(local106, local112);
			local90 = Math.max(local123, local159);
		} else {
			local62 = local106 * local106 + local112 * local112;
			local90 = local123 * local123 + local159 * local159;
		}
		if (arg0 > 1) {
			local8[1] = this.anInt321 * local90;
		}
		local8[0] = local62 * this.anInt321;
		return local8;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		this.method286();
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	private void method286() {
		@Pc(20) Random local20 = new Random((long) this.anInt323);
		@Pc(25) int local25 = 4096 / this.anInt314;
		this.anInt309 = this.anInt314 * this.anInt312;
		this.anIntArrayArray10 = new int[this.anInt309][2];
		this.anInt318 = local25 >> 1;
		@Pc(48) int local48 = 4096 / this.anInt312;
		@Pc(56) int local56 = this.anInt318 * this.anInt319 >> 12;
		this.anInt308 = local48 >> 1;
		@Pc(69) int local69 = this.anInt319 * this.anInt308 >> 12;
		for (@Pc(71) int local71 = 0; local71 < this.anInt314; local71++) {
			@Pc(77) int local77 = local25 * local71;
			for (@Pc(79) int local79 = 0; local79 < this.anInt312; local79++) {
				@Pc(88) int local88 = local79 + local71 * this.anInt312;
				@Pc(99) int local99 = (Static42.method1009(8192, local20) - 4096) * local69 >> 12;
				@Pc(110) int local110 = local56 * (Static42.method1009(8192, local20) - 4096) >> 12;
				this.anIntArrayArray10[local88][0] = local79 * local48 + local99;
				this.anIntArrayArray10[local88][1] = local77 + local110;
			}
		}
		this.anInt321 = this.anInt312 <= this.anInt314 ? this.anInt314 : this.anInt312;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(19) int local19 = Static22.anIntArray152[arg0];
			@Pc(22) int local22 = this.anInt322;
			@Pc(40) int local40;
			if (local22 == 2) {
				for (local22 = 0; local22 < Static129.anInt3285; local22++) {
					local40 = Static146.anIntArray618[local22];
					@Pc(47) int[] local47 = this.method285(2, local40, local19);
					local7[local22] = local47[1] - local47[0];
				}
			} else if (local22 == 1) {
				for (local22 = 0; local22 < Static129.anInt3285; local22++) {
					local40 = Static146.anIntArray618[local22];
					local7[local22] = this.method285(2, local40, local19)[1];
				}
			} else {
				for (local22 = 0; local22 < Static129.anInt3285; local22++) {
					local40 = Static146.anIntArray618[local22];
					local7[local22] = this.method285(1, local40, local19)[0];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt312 = this.anInt314 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt323 = arg1.method1545();
		} else if (arg0 == 2) {
			this.anInt319 = arg1.method1510();
		} else if (arg0 == 3) {
			this.anInt322 = arg1.method1545();
		} else if (arg0 == 4) {
			this.anInt311 = arg1.method1545();
		} else if (arg0 == 5) {
			this.anInt312 = arg1.method1545();
		} else if (arg0 == 6) {
			this.anInt314 = arg1.method1545();
		}
	}
}
