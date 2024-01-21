import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
	private int anInt1487;

	@OriginalMember(owner = "client!fh", name = "vb", descriptor = "I")
	private int anInt1493;

	@OriginalMember(owner = "client!fh", name = "wb", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!fh", name = "Db", descriptor = "I")
	private int anInt1499;

	@OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
	private int anInt1485;

	@OriginalMember(owner = "client!fh", name = "pb", descriptor = "I")
	private int anInt1489;

	@OriginalMember(owner = "client!fh", name = "xb", descriptor = "I")
	private int anInt1494;

	@OriginalMember(owner = "client!fh", name = "sb", descriptor = "I")
	private int anInt1491;

	@OriginalMember(owner = "client!fh", name = "ub", descriptor = "I")
	private int anInt1492;

	@OriginalMember(owner = "client!fh", name = "rb", descriptor = "I")
	private int anInt1490;

	@OriginalMember(owner = "client!fh", name = "Cb", descriptor = "I")
	private int anInt1498;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(26) int local26 = Static21.anIntArray50[arg0];
			@Pc(29) int local29 = this.anInt1490;
			@Pc(47) int local47;
			if (local29 == 2) {
				for (local29 = 0; local29 < Static54.anInt1423; local29++) {
					local47 = Static36.anIntArray74[local29];
					@Pc(54) int[] local54 = this.method1029(local47, local26, 2);
					local18[local29] = local54[1] - local54[0];
				}
			} else if (local29 == 1) {
				for (local29 = 0; local29 < Static54.anInt1423; local29++) {
					local47 = Static36.anIntArray74[local29];
					local18[local29] = this.method1029(local47, local26, 2)[1];
				}
			} else {
				for (local29 = 0; local29 < Static54.anInt1423; local29++) {
					local47 = Static36.anIntArray74[local29];
					local18[local29] = this.method1029(local47, local26, 1)[0];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		this.method1027();
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(Z)V")
	private void method1027() {
		@Pc(12) Random local12 = new Random((long) this.anInt1498);
		@Pc(17) int local17 = 4096 / this.anInt1491;
		this.anInt1499 = local17 >> 1;
		this.anInt1485 = this.anInt1491 * this.anInt1489;
		@Pc(34) int local34 = 4096 / this.anInt1489;
		this.anIntArrayArray8 = new int[this.anInt1485][2];
		this.anInt1493 = local34 >> 1;
		@Pc(59) int local59 = this.anInt1499 * this.anInt1492 >> 12;
		@Pc(67) int local67 = this.anInt1492 * this.anInt1493 >> 12;
		for (@Pc(69) int local69 = 0; local69 < this.anInt1491; local69++) {
			@Pc(75) int local75 = local17 * local69;
			for (@Pc(77) int local77 = 0; local77 < this.anInt1489; local77++) {
				@Pc(86) int local86 = local77 + local69 * this.anInt1489;
				@Pc(97) int local97 = local67 * (Static90.method1619(local12, 8192) - 4096) >> 12;
				@Pc(108) int local108 = (Static90.method1619(local12, 8192) - 4096) * local59 >> 12;
				this.anIntArrayArray8[local86][0] = local97 + local77 * local34;
				this.anIntArrayArray8[local86][1] = local75 + local108;
			}
		}
		this.anInt1487 = this.anInt1491 >= this.anInt1489 ? this.anInt1491 : this.anInt1489;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIII)[I")
	private int[] method1029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg2];
		for (@Pc(10) int local10 = 0; local10 < arg2; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt1499;
		arg0 += this.anInt1493;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(42) int local42 = -1;
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		@Pc(59) int local59 = arg1 * this.anInt1491 >> 12;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = Integer.MAX_VALUE;
		@Pc(70) int local70 = arg0 * this.anInt1489 >> 12;
		@Pc(72) int local72 = Integer.MAX_VALUE;
		@Pc(85) int local85 = this.anInt1489 > 2 ? 2 : this.anInt1489 - 1;
		@Pc(96) int local96 = this.anInt1491 > 2 ? 2 : this.anInt1491 - 1;
		@Pc(104) int local104;
		@Pc(110) int local110;
		@Pc(137) int local137;
		@Pc(163) int local163;
		@Pc(170) int local170;
		for (@Pc(99) int local99 = -local85; local99 <= local85; local99++) {
			for (local104 = -local96; local104 <= local96; local104++) {
				local110 = local99 + local70;
				if (local110 < 0) {
					local110 += this.anInt1489;
				}
				if (local110 >= this.anInt1489) {
					local110 -= this.anInt1489;
				}
				local137 = local104 + local59;
				if (local137 < 0) {
					local137 += this.anInt1491;
				}
				if (this.anInt1491 <= local137) {
					local137 -= this.anInt1491;
				}
				local163 = local110 + local137 * this.anInt1489;
				local170 = this.anIntArrayArray8[local163][0];
				@Pc(177) int local177 = this.anIntArrayArray8[local163][1];
				@Pc(181) int local181 = arg0 - local170;
				@Pc(186) int local186 = arg1 - local177;
				if (local181 < 0) {
					local181 = -local181;
				}
				if (local181 > 2048) {
					local181 = 4096 - local181;
				}
				if (local186 < 0) {
					local186 = -local186;
				}
				if (local186 > 2048) {
					local186 = 4096 - local186;
				}
				@Pc(230) int local230 = local181 * local181 + local186 * local186 >> 12;
				if (local63 > local230) {
					if (local61 == -1) {
						local72 = local230;
						local61 = local163;
					} else {
						local72 = local63;
						local61 = local42;
					}
					local63 = local230;
					local42 = local163;
				} else if (local42 == local61 && local163 != local61 || local230 < local72 && local163 != local42) {
					local72 = local230;
					local61 = local163;
				}
			}
		}
		local104 = arg0 - this.anIntArrayArray8[local42][0];
		if (local104 < 0) {
			local104 = -local104;
		}
		if (local104 > 2048) {
			local104 = 4096 - local104;
		}
		local137 = arg0 - this.anIntArrayArray8[local61][0];
		local110 = arg1 - this.anIntArrayArray8[local42][1];
		if (local137 < 0) {
			local137 = -local137;
		}
		if (local110 < 0) {
			local110 = -local110;
		}
		if (local137 > 2048) {
			local137 = 4096 - local137;
		}
		if (local110 > 2048) {
			local110 = 4096 - local110;
		}
		local163 = arg1 - this.anIntArrayArray8[local61][1];
		if (local163 < 0) {
			local163 = -local163;
		}
		if (local163 > 2048) {
			local163 = 4096 - local163;
		}
		local170 = this.anInt1494;
		if (local170 == 1) {
			local63 = (int) Math.sqrt((double) (local104 * local104 + local110 * local110));
			local72 = (int) Math.sqrt((double) (local137 * local137 + local163 * local163));
		} else if (local170 == 2) {
			local63 = Math.max(local104, local110);
			local72 = Math.max(local137, local163);
		} else {
			local63 = local110 * local110 + local104 * local104;
			local72 = local163 * local163 + local137 * local137;
		}
		if (arg2 > 1) {
			local8[1] = this.anInt1487 * local72;
		}
		local8[0] = local63 * this.anInt1487;
		return local8;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1489 = this.anInt1491 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt1498 = arg1.method1698();
		} else if (arg0 == 2) {
			this.anInt1492 = arg1.method1680();
		} else if (arg0 == 3) {
			this.anInt1490 = arg1.method1698();
		} else if (arg0 == 4) {
			this.anInt1494 = arg1.method1698();
		} else if (arg0 == 5) {
			this.anInt1489 = arg1.method1698();
		} else if (arg0 == 6) {
			this.anInt1491 = arg1.method1698();
		}
	}
}
