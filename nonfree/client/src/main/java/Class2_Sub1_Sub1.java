import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
	private int anInt95;

	@OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
	private int anInt96;

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!aa", name = "vb", descriptor = "I")
	private int anInt98;

	@OriginalMember(owner = "client!aa", name = "zb", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!aa", name = "Ab", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)[I")
	private int[] method59(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt88;
		arg2 += this.anInt93;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		@Pc(51) int local51 = arg1 * this.anInt92 >> 12;
		@Pc(58) int local58 = arg2 * this.anInt95 >> 12;
		@Pc(60) int local60 = -1;
		@Pc(62) int local62 = Integer.MAX_VALUE;
		@Pc(64) int local64 = -1;
		@Pc(66) int local66 = Integer.MAX_VALUE;
		@Pc(79) int local79 = this.anInt95 <= 2 ? this.anInt95 - 1 : 2;
		@Pc(92) int local92 = this.anInt92 > 2 ? 2 : this.anInt92 - 1;
		@Pc(100) int local100;
		@Pc(107) int local107;
		@Pc(130) int local130;
		@Pc(157) int local157;
		@Pc(164) int local164;
		for (@Pc(95) int local95 = -local79; local95 <= local79; local95++) {
			for (local100 = -local92; local100 <= local92; local100++) {
				local107 = local58 + local95;
				if (local107 < 0) {
					local107 += this.anInt95;
				}
				if (this.anInt95 <= local107) {
					local107 -= this.anInt95;
				}
				local130 = local51 + local100;
				if (local130 < 0) {
					local130 += this.anInt92;
				}
				if (this.anInt92 <= local130) {
					local130 -= this.anInt92;
				}
				local157 = local107 + local130 * this.anInt95;
				local164 = this.anIntArrayArray1[local157][0];
				@Pc(171) int local171 = this.anIntArrayArray1[local157][1];
				@Pc(176) int local176 = arg1 - local171;
				if (local176 < 0) {
					local176 = -local176;
				}
				if (local176 > 2048) {
					local176 = 4096 - local176;
				}
				@Pc(199) int local199 = arg2 - local164;
				if (local199 < 0) {
					local199 = -local199;
				}
				if (local199 > 2048) {
					local199 = 4096 - local199;
				}
				@Pc(225) int local225 = local199 * local199 + local176 * local176 >> 12;
				if (local225 < local66) {
					if (local64 == -1) {
						local64 = local157;
						local62 = local225;
					} else {
						local64 = local60;
						local62 = local66;
					}
					local66 = local225;
					local60 = local157;
				} else if (local60 == local64 && local157 != local64 || local62 > local225 && local60 != local157) {
					local62 = local225;
					local64 = local157;
				}
			}
		}
		local100 = arg2 - this.anIntArrayArray1[local60][0];
		if (local100 < 0) {
			local100 = -local100;
		}
		if (local100 > 2048) {
			local100 = 4096 - local100;
		}
		local107 = arg1 - this.anIntArrayArray1[local60][1];
		if (local107 < 0) {
			local107 = -local107;
		}
		if (local107 > 2048) {
			local107 = 4096 - local107;
		}
		local130 = arg2 - this.anIntArrayArray1[local64][0];
		if (local130 < 0) {
			local130 = -local130;
		}
		if (local130 > 2048) {
			local130 = 4096 - local130;
		}
		local157 = arg1 - this.anIntArrayArray1[local64][1];
		if (local157 < 0) {
			local157 = -local157;
		}
		if (local157 > 2048) {
			local157 = 4096 - local157;
		}
		local164 = this.anInt98;
		if (local164 == 1) {
			local66 = (int) Math.sqrt((double) (local107 * local107 + local100 * local100));
			local62 = (int) Math.sqrt((double) (local130 * local130 + local157 * local157));
		} else if (local164 == 2) {
			local66 = Math.max(local100, local107);
			local62 = Math.max(local130, local157);
		} else {
			local66 = local100 * local100 + local107 * local107;
			local62 = local157 * local157 + local130 * local130;
		}
		local8[0] = local66 * this.anInt85;
		if (arg0 > 1) {
			local8[1] = local62 * this.anInt85;
		}
		return local8;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt95 = this.anInt92 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt86 = arg0.method2387();
		} else if (arg1 == 2) {
			this.anInt96 = arg0.method2353();
		} else if (arg1 == 3) {
			this.anInt101 = arg0.method2387();
		} else if (arg1 == 4) {
			this.anInt98 = arg0.method2387();
		} else if (arg1 == 5) {
			this.anInt95 = arg0.method2387();
		} else if (arg1 == 6) {
			this.anInt92 = arg0.method2387();
		}
	}

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "(I)V")
	private void method60() {
		@Pc(12) Random local12 = new Random((long) this.anInt86);
		this.anInt102 = this.anInt95 * this.anInt92;
		@Pc(24) int local24 = 4096 / this.anInt95;
		this.anIntArrayArray1 = new int[this.anInt102][2];
		@Pc(35) int local35 = 4096 / this.anInt92;
		this.anInt88 = local35 >> 1;
		this.anInt93 = local24 >> 1;
		@Pc(53) int local53 = this.anInt93 * this.anInt96 >> 12;
		@Pc(61) int local61 = this.anInt88 * this.anInt96 >> 12;
		for (@Pc(63) int local63 = 0; local63 < this.anInt92; local63++) {
			@Pc(69) int local69 = local63 * local35;
			for (@Pc(71) int local71 = 0; local71 < this.anInt95; local71++) {
				@Pc(80) int local80 = local71 + this.anInt95 * local63;
				@Pc(91) int local91 = (Static41.method805(local12, 8192) - 4096) * local53 >> 12;
				@Pc(102) int local102 = (Static41.method805(local12, 8192) - 4096) * local61 >> 12;
				this.anIntArrayArray1[local80][0] = local91 + local24 * local71;
				this.anIntArrayArray1[local80][1] = local69 + local102;
			}
		}
		this.anInt85 = this.anInt92 >= this.anInt95 ? this.anInt92 : this.anInt95;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(24) int local24 = Static166.anIntArray619[arg0];
			@Pc(27) int local27 = this.anInt101;
			@Pc(47) int local47;
			if (local27 == 2) {
				for (local27 = 0; local27 < Static129.anInt3118; local27++) {
					local47 = Static163.anIntArray577[local27];
					@Pc(54) int[] local54 = this.method59(2, local24, local47);
					local16[local27] = local54[1] - local54[0];
				}
			} else if (local27 == 1) {
				for (local27 = 0; local27 < Static129.anInt3118; local27++) {
					local47 = Static163.anIntArray577[local27];
					local16[local27] = this.method59(2, local24, local47)[1];
				}
			} else {
				for (local27 = 0; local27 < Static129.anInt3118; local27++) {
					local47 = Static163.anIntArray577[local27];
					local16[local27] = this.method59(1, local24, local47)[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		this.method60();
	}
}
