import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub4_Sub34 extends Class1_Sub4 {

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
	private int anInt4484;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
	private int anInt4494;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
	private int anInt4497;

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray128;

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
	private int anInt4498;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "I")
	private int anInt4487;

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
	private int anInt4492;

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "I")
	private int anInt4500;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
	private int anInt4491;

	@OriginalMember(owner = "client!v", name = "vb", descriptor = "I")
	private int anInt4502;

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
	private int anInt4503;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4498 = this.anInt4500 = arg0.method544();
		} else if (arg1 == 1) {
			this.anInt4491 = arg0.method544();
		} else if (arg1 == 2) {
			this.anInt4492 = arg0.method546();
		} else if (arg1 == 3) {
			this.anInt4487 = arg0.method544();
		} else if (arg1 == 4) {
			this.anInt4503 = arg0.method544();
		} else if (arg1 == 5) {
			this.anInt4498 = arg0.method544();
		} else if (arg1 == 6) {
			this.anInt4500 = arg0.method544();
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(29) int local29 = Static150.anIntArray383[arg0];
			@Pc(32) int local32 = this.anInt4487;
			@Pc(50) int local50;
			if (local32 == 2) {
				for (local32 = 0; local32 < Static73.anInt1888; local32++) {
					local50 = Static171.anIntArray421[local32];
					@Pc(57) int[] local57 = this.method3045(local50, local29, 2);
					local7[local32] = local57[1] - local57[0];
				}
			} else if (local32 == 1) {
				for (local32 = 0; local32 < Static73.anInt1888; local32++) {
					local50 = Static171.anIntArray421[local32];
					local7[local32] = this.method3045(local50, local29, 2)[1];
				}
			} else {
				for (local32 = 0; local32 < Static73.anInt1888; local32++) {
					local50 = Static171.anIntArray421[local32];
					local7[local32] = this.method3045(local50, local29, 1)[0];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII)[I")
	private int[] method3045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int[] local13 = new int[arg2];
		for (@Pc(15) int local15 = 0; local15 < arg2; local15++) {
			local13[local15] = Integer.MAX_VALUE;
		}
		arg0 += this.anInt4497;
		arg1 += this.anInt4494;
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(50) int local50 = this.anInt4498 * arg0 >> 12;
		@Pc(57) int local57 = arg1 * this.anInt4500 >> 12;
		@Pc(59) int local59 = Integer.MAX_VALUE;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = Integer.MAX_VALUE;
		@Pc(76) int local76 = this.anInt4498 <= 2 ? this.anInt4498 - 1 : 2;
		@Pc(87) int local87 = this.anInt4500 <= 2 ? this.anInt4500 - 1 : 2;
		@Pc(95) int local95;
		@Pc(101) int local101;
		@Pc(112) int local112;
		@Pc(149) int local149;
		@Pc(156) int local156;
		for (@Pc(90) int local90 = -local76; local90 <= local76; local90++) {
			for (local95 = -local87; local95 <= local87; local95++) {
				local101 = local90 + local50;
				if (local101 < 0) {
					local101 += this.anInt4498;
				}
				local112 = local95 + local57;
				if (this.anInt4498 <= local101) {
					local101 -= this.anInt4498;
				}
				if (local112 < 0) {
					local112 += this.anInt4500;
				}
				if (this.anInt4500 <= local112) {
					local112 -= this.anInt4500;
				}
				local149 = local112 * this.anInt4498 + local101;
				local156 = this.anIntArrayArray128[local149][0];
				@Pc(163) int local163 = this.anIntArrayArray128[local149][1];
				@Pc(168) int local168 = arg0 - local156;
				if (local168 < 0) {
					local168 = -local168;
				}
				@Pc(181) int local181 = arg1 - local163;
				if (local181 < 0) {
					local181 = -local181;
				}
				if (local181 > 2048) {
					local181 = 4096 - local181;
				}
				if (local168 > 2048) {
					local168 = 4096 - local168;
				}
				@Pc(212) int local212 = local181 * local181 + local168 * local168 >> 12;
				if (local212 < local59) {
					if (local61 == -1) {
						local65 = local212;
						local61 = local149;
					} else {
						local65 = local59;
						local61 = local63;
					}
					local63 = local149;
					local59 = local212;
				} else if (local63 == local61 && local61 != local149 || local212 < local65 && local149 != local63) {
					local61 = local149;
					local65 = local212;
				}
			}
		}
		local95 = arg0 - this.anIntArrayArray128[local63][0];
		local101 = arg1 - this.anIntArrayArray128[local63][1];
		if (local95 < 0) {
			local95 = -local95;
		}
		if (local95 > 2048) {
			local95 = 4096 - local95;
		}
		local112 = arg0 - this.anIntArrayArray128[local61][0];
		if (local112 < 0) {
			local112 = -local112;
		}
		local149 = arg1 - this.anIntArrayArray128[local61][1];
		if (local112 > 2048) {
			local112 = 4096 - local112;
		}
		if (local101 < 0) {
			local101 = -local101;
		}
		if (local101 > 2048) {
			local101 = 4096 - local101;
		}
		if (local149 < 0) {
			local149 = -local149;
		}
		if (local149 > 2048) {
			local149 = 4096 - local149;
		}
		local156 = this.anInt4503;
		if (local156 == 1) {
			local59 = (int) Math.sqrt((double) (local95 * local95 + local101 * local101));
			local65 = (int) Math.sqrt((double) (local112 * local112 + local149 * local149));
		} else if (local156 == 2) {
			local59 = Math.max(local95, local101);
			local65 = Math.max(local112, local149);
		} else {
			local65 = local112 * local112 + local149 * local149;
			local59 = local95 * local95 + local101 * local101;
		}
		if (arg2 > 1) {
			local13[1] = local65 * this.anInt4484;
		}
		local13[0] = local59 * this.anInt4484;
		return local13;
	}

	@OriginalMember(owner = "client!v", name = "k", descriptor = "(I)V")
	private void method3048() {
		@Pc(18) Random local18 = new Random((long) this.anInt4491);
		@Pc(23) int local23 = 4096 / this.anInt4500;
		this.anInt4502 = this.anInt4500 * this.anInt4498;
		this.anIntArrayArray128 = new int[this.anInt4502][2];
		this.anInt4494 = local23 >> 1;
		@Pc(49) int local49 = this.anInt4492 * this.anInt4494 >> 12;
		@Pc(54) int local54 = 4096 / this.anInt4498;
		this.anInt4497 = local54 >> 1;
		@Pc(67) int local67 = this.anInt4492 * this.anInt4497 >> 12;
		for (@Pc(69) int local69 = 0; local69 < this.anInt4500; local69++) {
			@Pc(75) int local75 = local69 * local23;
			for (@Pc(77) int local77 = 0; local77 < this.anInt4498; local77++) {
				@Pc(87) int local87 = this.anInt4498 * local69 + local77;
				@Pc(98) int local98 = local67 * (Static49.method1046(8192, local18) - 4096) >> 12;
				@Pc(109) int local109 = local49 * (Static49.method1046(8192, local18) - 4096) >> 12;
				this.anIntArrayArray128[local87][0] = local54 * local77 + local98;
				this.anIntArrayArray128[local87][1] = local109 + local75;
			}
		}
		this.anInt4484 = this.anInt4498 > this.anInt4500 ? this.anInt4498 : this.anInt4500;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	@Override
	public void method3207() {
		this.method3048();
	}
}
