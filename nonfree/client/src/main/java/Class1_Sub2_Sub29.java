import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
	private int anInt3540;

	@OriginalMember(owner = "client!pg", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!pg", name = "fb", descriptor = "I")
	private int anInt3546;

	@OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
	private int anInt3550;

	@OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
	private int anInt3545;

	@OriginalMember(owner = "client!pg", name = "tb", descriptor = "I")
	private int anInt3555;

	@OriginalMember(owner = "client!pg", name = "gb", descriptor = "I")
	private int anInt3547;

	@OriginalMember(owner = "client!pg", name = "rb", descriptor = "I")
	private int anInt3554;

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
	private int anInt3536;

	@OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
	private int anInt3542;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(24) int local24 = Static160.anIntArray399[arg0];
			@Pc(27) int local27 = this.anInt3542;
			@Pc(47) int local47;
			if (local27 == 2) {
				for (local27 = 0; local27 < Static22.anInt596; local27++) {
					local47 = Static167.anIntArray417[local27];
					@Pc(54) int[] local54 = this.method2647(2, local24, local47);
					local7[local27] = local54[1] - local54[0];
				}
			} else if (local27 == 1) {
				for (local27 = 0; local27 < Static22.anInt596; local27++) {
					local47 = Static167.anIntArray417[local27];
					local7[local27] = this.method2647(2, local24, local47)[1];
				}
			} else {
				for (local27 = 0; local27 < Static22.anInt596; local27++) {
					local47 = Static167.anIntArray417[local27];
					local7[local27] = this.method2647(1, local24, local47)[0];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(B)V")
	private void method2646() {
		@Pc(12) Random local12 = new Random((long) this.anInt3541);
		this.anInt3555 = this.anInt3536 * this.anInt3554;
		this.anIntArrayArray29 = new int[this.anInt3555][2];
		@Pc(30) int local30 = 4096 / this.anInt3554;
		this.anInt3550 = local30 >> 1;
		@Pc(43) int local43 = this.anInt3545 * this.anInt3550 >> 12;
		@Pc(48) int local48 = 4096 / this.anInt3536;
		this.anInt3540 = local48 >> 1;
		@Pc(61) int local61 = this.anInt3545 * this.anInt3540 >> 12;
		for (@Pc(63) int local63 = 0; local63 < this.anInt3536; local63++) {
			@Pc(69) int local69 = local63 * local48;
			for (@Pc(71) int local71 = 0; local71 < this.anInt3554; local71++) {
				@Pc(80) int local80 = local63 * this.anInt3554 + local71;
				@Pc(91) int local91 = local43 * (Static152.method1616(8192, local12) - 4096) >> 12;
				@Pc(102) int local102 = local61 * (Static152.method1616(8192, local12) - 4096) >> 12;
				this.anIntArrayArray29[local80][0] = local91 + local71 * local30;
				this.anIntArrayArray29[local80][1] = local102 + local69;
			}
		}
		this.anInt3546 = this.anInt3554 > this.anInt3536 ? this.anInt3554 : this.anInt3536;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3554 = this.anInt3536 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt3541 = arg1.method1234();
		} else if (arg0 == 2) {
			this.anInt3545 = arg1.method1280();
		} else if (arg0 == 3) {
			this.anInt3542 = arg1.method1234();
		} else if (arg0 == 4) {
			this.anInt3547 = arg1.method1234();
		} else if (arg0 == 5) {
			this.anInt3554 = arg1.method1234();
		} else if (arg0 == 6) {
			this.anInt3536 = arg1.method1234();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)[I")
	private int[] method2647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int[] local8 = new int[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg2 += this.anInt3550;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		arg1 += this.anInt3540;
		@Pc(47) int local47 = arg2 * this.anInt3554 >> 12;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(58) int local58 = arg1 * this.anInt3536 >> 12;
		@Pc(60) int local60 = -1;
		@Pc(62) int local62 = Integer.MAX_VALUE;
		@Pc(64) int local64 = -1;
		@Pc(66) int local66 = Integer.MAX_VALUE;
		@Pc(77) int local77 = this.anInt3554 <= 2 ? this.anInt3554 - 1 : 2;
		@Pc(88) int local88 = this.anInt3536 <= 2 ? this.anInt3536 - 1 : 2;
		@Pc(96) int local96;
		@Pc(102) int local102;
		@Pc(122) int local122;
		@Pc(148) int local148;
		@Pc(162) int local162;
		for (@Pc(91) int local91 = -local77; local91 <= local77; local91++) {
			for (local96 = -local88; local96 <= local88; local96++) {
				local102 = local91 + local47;
				if (local102 < 0) {
					local102 += this.anInt3554;
				}
				if (local102 >= this.anInt3554) {
					local102 -= this.anInt3554;
				}
				local122 = local96 + local58;
				if (local122 < 0) {
					local122 += this.anInt3536;
				}
				if (this.anInt3536 <= local122) {
					local122 -= this.anInt3536;
				}
				local148 = local102 + this.anInt3554 * local122;
				@Pc(155) int local155 = this.anIntArrayArray29[local148][1];
				local162 = this.anIntArrayArray29[local148][0];
				@Pc(166) int local166 = arg2 - local162;
				if (local166 < 0) {
					local166 = -local166;
				}
				@Pc(176) int local176 = arg1 - local155;
				if (local176 < 0) {
					local176 = -local176;
				}
				if (local166 > 2048) {
					local166 = 4096 - local166;
				}
				if (local176 > 2048) {
					local176 = 4096 - local176;
				}
				@Pc(210) int local210 = local176 * local176 + local166 * local166 >> 12;
				if (local62 > local210) {
					if (local60 == -1) {
						local60 = local148;
						local66 = local210;
					} else {
						local66 = local62;
						local60 = local64;
					}
					local62 = local210;
					local64 = local148;
				} else if (local60 == local64 && local60 != local148 || local210 < local66 && local148 != local64) {
					local60 = local148;
					local66 = local210;
				}
			}
		}
		local96 = arg2 - this.anIntArrayArray29[local64][0];
		local102 = arg1 - this.anIntArrayArray29[local64][1];
		if (local102 < 0) {
			local102 = -local102;
		}
		if (local102 > 2048) {
			local102 = 4096 - local102;
		}
		local122 = arg2 - this.anIntArrayArray29[local60][0];
		local148 = arg1 - this.anIntArrayArray29[local60][1];
		if (local96 < 0) {
			local96 = -local96;
		}
		if (local148 < 0) {
			local148 = -local148;
		}
		if (local148 > 2048) {
			local148 = 4096 - local148;
		}
		if (local122 < 0) {
			local122 = -local122;
		}
		if (local122 > 2048) {
			local122 = 4096 - local122;
		}
		if (local96 > 2048) {
			local96 = 4096 - local96;
		}
		local162 = this.anInt3547;
		if (local162 == 1) {
			local62 = (int) Math.sqrt((double) (local102 * local102 + local96 * local96));
			local66 = (int) Math.sqrt((double) (local122 * local122 + local148 * local148));
		} else if (local162 == 2) {
			local62 = Math.max(local96, local102);
			local66 = Math.max(local122, local148);
		} else {
			local62 = local102 * local102 + local96 * local96;
			local66 = local122 * local122 + local148 * local148;
		}
		if (arg0 > 1) {
			local8[1] = local66 * this.anInt3546;
		}
		local8[0] = local62 * this.anInt3546;
		return local8;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		this.method2646();
	}
}
