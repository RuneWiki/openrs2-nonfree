import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
	private int anInt2386;

	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
	private int anInt2387;

	@OriginalMember(owner = "client!nh", name = "ib", descriptor = "I")
	private int anInt2391;

	@OriginalMember(owner = "client!nh", name = "lb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	private int anInt2375;

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
	private int anInt2379;

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	private int anInt2378;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
	private int anInt2383;

	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "I")
	private int anInt2390;

	@OriginalMember(owner = "client!nh", name = "jb", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!nh", name = "pb", descriptor = "I")
	private int anInt2396;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		this.method1944();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(29) int local29 = Static50.anIntArray106[arg0];
			@Pc(32) int local32 = this.anInt2379;
			@Pc(50) int local50;
			if (local32 == 2) {
				for (local32 = 0; local32 < Static53.anInt1184; local32++) {
					local50 = Static43.anIntArray102[local32];
					@Pc(57) int[] local57 = this.method1941(2, local29, local50);
					local11[local32] = local57[1] - local57[0];
				}
			} else if (local32 == 1) {
				for (local32 = 0; local32 < Static53.anInt1184; local32++) {
					local50 = Static43.anIntArray102[local32];
					local11[local32] = this.method1941(2, local29, local50)[1];
				}
			} else {
				for (local32 = 0; local32 < Static53.anInt1184; local32++) {
					local50 = Static43.anIntArray102[local32];
					local11[local32] = this.method1941(1, local29, local50)[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)[I")
	private int[] method1941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int[] local4 = new int[arg0];
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			local4[local6] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt2386;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		arg2 += this.anInt2387;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		@Pc(49) int local49 = arg2 * this.anInt2396 >> 12;
		@Pc(56) int local56 = this.anInt2390 * arg1 >> 12;
		@Pc(58) int local58 = -1;
		@Pc(60) int local60 = -1;
		@Pc(62) int local62 = Integer.MAX_VALUE;
		@Pc(75) int local75 = this.anInt2396 <= 2 ? this.anInt2396 - 1 : 2;
		@Pc(77) int local77 = Integer.MAX_VALUE;
		@Pc(90) int local90 = this.anInt2390 > 2 ? 2 : this.anInt2390 - 1;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(128) int local128;
		@Pc(154) int local154;
		@Pc(168) int local168;
		for (@Pc(93) int local93 = -local75; local93 <= local75; local93++) {
			for (local98 = -local90; local98 <= local90; local98++) {
				local104 = local93 + local49;
				if (local104 < 0) {
					local104 += this.anInt2396;
				}
				if (this.anInt2396 <= local104) {
					local104 -= this.anInt2396;
				}
				local128 = local56 + local98;
				if (local128 < 0) {
					local128 += this.anInt2390;
				}
				if (this.anInt2390 <= local128) {
					local128 -= this.anInt2390;
				}
				local154 = local104 + this.anInt2396 * local128;
				@Pc(161) int local161 = this.anIntArrayArray24[local154][1];
				local168 = this.anIntArrayArray24[local154][0];
				@Pc(173) int local173 = arg1 - local161;
				@Pc(178) int local178 = arg2 - local168;
				if (local173 < 0) {
					local173 = -local173;
				}
				if (local173 > 2048) {
					local173 = 4096 - local173;
				}
				if (local178 < 0) {
					local178 = -local178;
				}
				if (local178 > 2048) {
					local178 = 4096 - local178;
				}
				@Pc(213) int local213 = local173 * local173 + local178 * local178 >> 12;
				if (local213 < local77) {
					if (local58 == -1) {
						local62 = local213;
						local58 = local154;
					} else {
						local62 = local77;
						local58 = local60;
					}
					local77 = local213;
					local60 = local154;
				} else if (local60 == local58 && local154 != local58 || local213 < local62 && local154 != local60) {
					local58 = local154;
					local62 = local213;
				}
			}
		}
		local98 = arg2 - this.anIntArrayArray24[local60][0];
		if (local98 < 0) {
			local98 = -local98;
		}
		if (local98 > 2048) {
			local98 = 4096 - local98;
		}
		local104 = arg1 - this.anIntArrayArray24[local60][1];
		if (local104 < 0) {
			local104 = -local104;
		}
		local128 = arg2 - this.anIntArrayArray24[local58][0];
		local154 = arg1 - this.anIntArrayArray24[local58][1];
		if (local154 < 0) {
			local154 = -local154;
		}
		if (local128 < 0) {
			local128 = -local128;
		}
		if (local104 > 2048) {
			local104 = 4096 - local104;
		}
		if (local128 > 2048) {
			local128 = 4096 - local128;
		}
		if (local154 > 2048) {
			local154 = 4096 - local154;
		}
		local168 = this.anInt2392;
		if (local168 == 1) {
			local77 = (int) Math.sqrt((double) (local98 * local98 + local104 * local104));
			local62 = (int) Math.sqrt((double) (local154 * local154 + local128 * local128));
		} else if (local168 == 2) {
			local77 = Math.max(local98, local104);
			local62 = Math.max(local128, local154);
		} else {
			local62 = local128 * local128 + local154 * local154;
			local77 = local104 * local104 + local98 * local98;
		}
		local4[0] = local77 * this.anInt2391;
		if (arg0 > 1) {
			local4[1] = local62 * this.anInt2391;
		}
		return local4;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt2396 = this.anInt2390 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt2375 = arg1.method2962();
		} else if (arg0 == 2) {
			this.anInt2378 = arg1.method2933();
		} else if (arg0 == 3) {
			this.anInt2379 = arg1.method2962();
		} else if (arg0 == 4) {
			this.anInt2392 = arg1.method2962();
		} else if (arg0 == 5) {
			this.anInt2396 = arg1.method2962();
		} else if (arg0 == 6) {
			this.anInt2390 = arg1.method2962();
		}
	}

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
	private void method1944() {
		@Pc(12) Random local12 = new Random((long) this.anInt2375);
		this.anInt2383 = this.anInt2396 * this.anInt2390;
		this.anIntArrayArray24 = new int[this.anInt2383][2];
		@Pc(30) int local30 = 4096 / this.anInt2396;
		this.anInt2387 = local30 >> 1;
		@Pc(44) int local44 = 4096 / this.anInt2390;
		this.anInt2386 = local44 >> 1;
		@Pc(57) int local57 = this.anInt2387 * this.anInt2378 >> 12;
		@Pc(65) int local65 = this.anInt2386 * this.anInt2378 >> 12;
		for (@Pc(67) int local67 = 0; local67 < this.anInt2390; local67++) {
			@Pc(73) int local73 = local44 * local67;
			for (@Pc(75) int local75 = 0; local75 < this.anInt2396; local75++) {
				@Pc(84) int local84 = local75 + this.anInt2396 * local67;
				@Pc(95) int local95 = local57 * (Static108.method1830(8192, local12) - 4096) >> 12;
				@Pc(106) int local106 = local65 * (Static108.method1830(8192, local12) - 4096) >> 12;
				this.anIntArrayArray24[local84][0] = local95 + local75 * local30;
				this.anIntArrayArray24[local84][1] = local106 + local73;
			}
		}
		this.anInt2391 = this.anInt2390 >= this.anInt2396 ? this.anInt2390 : this.anInt2396;
	}
}
