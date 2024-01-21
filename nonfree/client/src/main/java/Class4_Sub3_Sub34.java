import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub3_Sub34 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	private int anInt3810;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
	private int anInt3813;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!ue", name = "ob", descriptor = "I")
	private int anInt3823;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
	private int anInt3808;

	@OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
	private int anInt3807;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	private int anInt3806;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
	private int anInt3817;

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "I")
	private int anInt3819;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
	private int anInt3814;

	@OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)[I")
	private int[] method2911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg1];
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg2 += this.anInt3823;
		arg0 += this.anInt3810;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		@Pc(49) int local49 = this.anInt3807 * arg0 >> 12;
		@Pc(56) int local56 = this.anInt3819 * arg2 >> 12;
		@Pc(58) int local58 = -1;
		@Pc(60) int local60 = -1;
		@Pc(62) int local62 = Integer.MAX_VALUE;
		@Pc(64) int local64 = Integer.MAX_VALUE;
		@Pc(75) int local75 = this.anInt3819 > 2 ? 2 : this.anInt3819 - 1;
		@Pc(88) int local88 = this.anInt3807 > 2 ? 2 : this.anInt3807 - 1;
		@Pc(96) int local96;
		@Pc(107) int local107;
		@Pc(102) int local102;
		@Pc(156) int local156;
		@Pc(163) int local163;
		for (@Pc(91) int local91 = -local88; local91 <= local88; local91++) {
			for (local96 = -local75; local96 <= local75; local96++) {
				local102 = local96 + local56;
				local107 = local49 + local91;
				if (local102 < 0) {
					local102 += this.anInt3819;
				}
				if (local107 < 0) {
					local107 += this.anInt3807;
				}
				if (this.anInt3819 <= local102) {
					local102 -= this.anInt3819;
				}
				if (this.anInt3807 <= local107) {
					local107 -= this.anInt3807;
				}
				local156 = local107 + this.anInt3807 * local102;
				local163 = this.anIntArrayArray36[local156][0];
				@Pc(170) int local170 = this.anIntArrayArray36[local156][1];
				@Pc(175) int local175 = arg2 - local170;
				@Pc(180) int local180 = arg0 - local163;
				if (local175 < 0) {
					local175 = -local175;
				}
				if (local175 > 2048) {
					local175 = 4096 - local175;
				}
				if (local180 < 0) {
					local180 = -local180;
				}
				if (local180 > 2048) {
					local180 = 4096 - local180;
				}
				@Pc(223) int local223 = local175 * local175 + local180 * local180 >> 12;
				if (local223 < local62) {
					if (local60 == -1) {
						local60 = local156;
						local64 = local223;
					} else {
						local64 = local62;
						local60 = local58;
					}
					local58 = local156;
					local62 = local223;
				} else if (local60 == local58 && local60 != local156 || local64 > local223 && local58 != local156) {
					local60 = local156;
					local64 = local223;
				}
			}
		}
		local96 = arg0 - this.anIntArrayArray36[local58][0];
		local102 = arg0 - this.anIntArrayArray36[local60][0];
		if (local102 < 0) {
			local102 = -local102;
		}
		local107 = arg2 - this.anIntArrayArray36[local58][1];
		if (local107 < 0) {
			local107 = -local107;
		}
		if (local96 < 0) {
			local96 = -local96;
		}
		if (local107 > 2048) {
			local107 = 4096 - local107;
		}
		if (local96 > 2048) {
			local96 = 4096 - local96;
		}
		if (local102 > 2048) {
			local102 = 4096 - local102;
		}
		local156 = arg2 - this.anIntArrayArray36[local60][1];
		if (local156 < 0) {
			local156 = -local156;
		}
		if (local156 > 2048) {
			local156 = 4096 - local156;
		}
		local163 = this.anInt3818;
		if (local163 == 1) {
			local62 = (int) Math.sqrt((double) (local107 * local107 + local96 * local96));
			local64 = (int) Math.sqrt((double) (local156 * local156 + local102 * local102));
		} else if (local163 == 2) {
			local62 = Math.max(local96, local107);
			local64 = Math.max(local102, local156);
		} else {
			local64 = local156 * local156 + local102 * local102;
			local62 = local107 * local107 + local96 * local96;
		}
		local8[0] = local62 * this.anInt3813;
		if (arg1 > 1) {
			local8[1] = local64 * this.anInt3813;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(B)V")
	private void method2913() {
		@Pc(12) Random local12 = new Random((long) this.anInt3814);
		@Pc(17) int local17 = 4096 / this.anInt3819;
		this.anInt3817 = this.anInt3819 * this.anInt3807;
		this.anIntArrayArray36 = new int[this.anInt3817][2];
		@Pc(35) int local35 = 4096 / this.anInt3807;
		this.anInt3810 = local35 >> 1;
		this.anInt3823 = local17 >> 1;
		@Pc(53) int local53 = this.anInt3810 * this.anInt3806 >> 12;
		@Pc(61) int local61 = this.anInt3806 * this.anInt3823 >> 12;
		for (@Pc(71) int local71 = 0; local71 < this.anInt3819; local71++) {
			@Pc(77) int local77 = local17 * local71;
			for (@Pc(79) int local79 = 0; local79 < this.anInt3807; local79++) {
				@Pc(88) int local88 = local71 * this.anInt3807 + local79;
				@Pc(99) int local99 = (Static38.method679(8192, local12) - 4096) * local53 >> 12;
				@Pc(110) int local110 = (Static38.method679(8192, local12) - 4096) * local61 >> 12;
				this.anIntArrayArray36[local88][0] = local79 * local35 + local99;
				this.anIntArrayArray36[local88][1] = local110 + local77;
			}
		}
		this.anInt3813 = this.anInt3807 > this.anInt3819 ? this.anInt3807 : this.anInt3819;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		this.method2913();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3807 = this.anInt3819 = arg1.method1253();
		} else if (arg0 == 1) {
			this.anInt3814 = arg1.method1253();
		} else if (arg0 == 2) {
			this.anInt3806 = arg1.method1252();
		} else if (arg0 == 3) {
			this.anInt3808 = arg1.method1253();
		} else if (arg0 == 4) {
			this.anInt3818 = arg1.method1253();
		} else if (arg0 == 5) {
			this.anInt3807 = arg1.method1253();
		} else if (arg0 == 6) {
			this.anInt3819 = arg1.method1253();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(23) int local23 = Static148.anIntArray321[arg0];
			@Pc(26) int local26 = this.anInt3808;
			@Pc(44) int local44;
			if (local26 == 2) {
				for (local26 = 0; local26 < Static134.anInt3188; local26++) {
					local44 = Static67.anIntArray170[local26];
					@Pc(51) int[] local51 = this.method2911(local44, 2, local23);
					local15[local26] = local51[1] - local51[0];
				}
			} else if (local26 == 1) {
				for (local26 = 0; local26 < Static134.anInt3188; local26++) {
					local44 = Static67.anIntArray170[local26];
					local15[local26] = this.method2911(local44, 2, local23)[1];
				}
			} else {
				for (local26 = 0; local26 < Static134.anInt3188; local26++) {
					local44 = Static67.anIntArray170[local26];
					local15[local26] = this.method2911(local44, 1, local23)[0];
				}
			}
		}
		return local15;
	}
}
