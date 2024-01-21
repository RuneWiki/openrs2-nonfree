import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class3_Sub5_Sub26 extends Class3_Sub5 {

	@OriginalMember(owner = "client!r", name = "P", descriptor = "I")
	private int anInt3379;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
	private int anInt3387;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	private int anInt3393;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
	private int anInt3384;

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
	private int anInt3380;

	@OriginalMember(owner = "client!r", name = "N", descriptor = "I")
	private int anInt3377;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "I")
	private int anInt3383;

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "I")
	private int anInt3378;

	@OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
	private int anInt3391;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBI)[I")
	private int[] method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int[] local4 = new int[arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			local4[local6] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt3387;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		arg0 += this.anInt3379;
		@Pc(47) int local47 = -1;
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		@Pc(58) int local58 = this.anInt3383 * arg0 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt3378 >> 12;
		@Pc(67) int local67 = Integer.MAX_VALUE;
		@Pc(69) int local69 = Integer.MAX_VALUE;
		@Pc(80) int local80 = this.anInt3383 <= 2 ? this.anInt3383 - 1 : 2;
		@Pc(91) int local91 = this.anInt3378 <= 2 ? this.anInt3378 - 1 : 2;
		@Pc(93) int local93 = -1;
		@Pc(101) int local101;
		@Pc(107) int local107;
		@Pc(111) int local111;
		@Pc(154) int local154;
		@Pc(168) int local168;
		for (@Pc(96) int local96 = -local80; local96 <= local80; local96++) {
			for (local101 = -local91; local101 <= local91; local101++) {
				local107 = local58 + local96;
				local111 = local101 + local65;
				if (local111 < 0) {
					local111 += this.anInt3378;
				}
				if (this.anInt3378 <= local111) {
					local111 -= this.anInt3378;
				}
				if (local107 < 0) {
					local107 += this.anInt3383;
				}
				if (local107 >= this.anInt3383) {
					local107 -= this.anInt3383;
				}
				local154 = local107 + this.anInt3383 * local111;
				@Pc(161) int local161 = this.anIntArrayArray35[local154][1];
				local168 = this.anIntArrayArray35[local154][0];
				@Pc(173) int local173 = arg1 - local161;
				if (local173 < 0) {
					local173 = -local173;
				}
				if (local173 > 2048) {
					local173 = 4096 - local173;
				}
				@Pc(193) int local193 = arg0 - local168;
				if (local193 < 0) {
					local193 = -local193;
				}
				if (local193 > 2048) {
					local193 = 4096 - local193;
				}
				@Pc(217) int local217 = local173 * local173 + local193 * local193 >> 12;
				if (local217 < local67) {
					if (local93 == -1) {
						local93 = local154;
						local69 = local217;
					} else {
						local93 = local47;
						local69 = local67;
					}
					local47 = local154;
					local67 = local217;
				} else if (local47 == local93 && local154 != local93 || local69 > local217 && local47 != local154) {
					local93 = local154;
					local69 = local217;
				}
			}
		}
		local101 = arg0 - this.anIntArrayArray35[local47][0];
		if (local101 < 0) {
			local101 = -local101;
		}
		local111 = arg0 - this.anIntArrayArray35[local93][0];
		local107 = arg1 - this.anIntArrayArray35[local47][1];
		if (local101 > 2048) {
			local101 = 4096 - local101;
		}
		local154 = arg1 - this.anIntArrayArray35[local93][1];
		if (local107 < 0) {
			local107 = -local107;
		}
		if (local154 < 0) {
			local154 = -local154;
		}
		if (local111 < 0) {
			local111 = -local111;
		}
		if (local154 > 2048) {
			local154 = 4096 - local154;
		}
		if (local107 > 2048) {
			local107 = 4096 - local107;
		}
		if (local111 > 2048) {
			local111 = 4096 - local111;
		}
		local168 = this.anInt3380;
		if (local168 == 1) {
			local67 = (int) Math.sqrt((double) (local107 * local107 + local101 * local101));
			local69 = (int) Math.sqrt((double) (local154 * local154 + local111 * local111));
		} else if (local168 == 2) {
			local67 = Math.max(local101, local107);
			local69 = Math.max(local111, local154);
		} else {
			local69 = local111 * local111 + local154 * local154;
			local67 = local101 * local101 + local107 * local107;
		}
		if (arg2 > 1) {
			local4[1] = this.anInt3393 * local69;
		}
		local4[0] = this.anInt3393 * local67;
		return local4;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		this.method2412();
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	private void method2412() {
		@Pc(12) Random local12 = new Random((long) this.anInt3377);
		@Pc(17) int local17 = 4096 / this.anInt3383;
		@Pc(22) int local22 = 4096 / this.anInt3378;
		this.anInt3387 = local22 >> 1;
		@Pc(35) int local35 = this.anInt3385 * this.anInt3387 >> 12;
		this.anInt3391 = this.anInt3378 * this.anInt3383;
		this.anInt3379 = local17 >> 1;
		@Pc(55) int local55 = this.anInt3385 * this.anInt3379 >> 12;
		this.anIntArrayArray35 = new int[this.anInt3391][2];
		for (@Pc(63) int local63 = 0; local63 < this.anInt3378; local63++) {
			@Pc(69) int local69 = local22 * local63;
			for (@Pc(71) int local71 = 0; local71 < this.anInt3383; local71++) {
				@Pc(80) int local80 = local71 + local63 * this.anInt3383;
				@Pc(91) int local91 = local55 * (Static141.method2188(8192, local12) - 4096) >> 12;
				@Pc(102) int local102 = (Static141.method2188(8192, local12) - 4096) * local35 >> 12;
				this.anIntArrayArray35[local80][0] = local91 + local71 * local17;
				this.anIntArrayArray35[local80][1] = local69 + local102;
			}
		}
		this.anInt3393 = this.anInt3378 >= this.anInt3383 ? this.anInt3378 : this.anInt3383;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3383 = this.anInt3378 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt3377 = arg1.method2107();
		} else if (arg0 == 2) {
			this.anInt3385 = arg1.method2111();
		} else if (arg0 == 3) {
			this.anInt3384 = arg1.method2107();
		} else if (arg0 == 4) {
			this.anInt3380 = arg1.method2107();
		} else if (arg0 == 5) {
			this.anInt3383 = arg1.method2107();
		} else if (arg0 == 6) {
			this.anInt3378 = arg1.method2107();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(27) int local27 = Static94.anIntArray277[arg0];
			@Pc(30) int local30 = this.anInt3384;
			@Pc(46) int local46;
			if (local30 == 2) {
				for (local30 = 0; local30 < Static104.anInt2195; local30++) {
					local46 = Static124.anIntArray355[local30];
					@Pc(53) int[] local53 = this.method2410(local46, local27, 2);
					local11[local30] = local53[1] - local53[0];
				}
			} else if (local30 == 1) {
				for (local30 = 0; local30 < Static104.anInt2195; local30++) {
					local46 = Static124.anIntArray355[local30];
					local11[local30] = this.method2410(local46, local27, 2)[1];
				}
			} else {
				for (local30 = 0; local30 < Static104.anInt2195; local30++) {
					local46 = Static124.anIntArray355[local30];
					local11[local30] = this.method2410(local46, local27, 1)[0];
				}
			}
		}
		return local11;
	}
}
