import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	private int anInt1477 = 1638;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "[B")
	private byte[] aByteArray18 = new byte[512];

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
	private int anInt1474 = 4;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
	private int anInt1473 = 4;

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
	private int anInt1484 = 4;

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
	private int anInt1483 = 0;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(5) int[] local5 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			this.method1115(arg0, local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[II)V")
	private void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = this.anInt1474 * Static147.anIntArray321[arg0];
		@Pc(111) int local111;
		@Pc(127) int local127;
		@Pc(41) int local41;
		@Pc(26) short local26;
		@Pc(102) int local102;
		@Pc(47) int local47;
		@Pc(74) int local74;
		@Pc(54) int local54;
		@Pc(100) int local100;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(83) int local83;
		@Pc(92) int local92;
		if (this.anInt1473 == 1) {
			local41 = this.aShortArray22[0] << 12;
			local54 = local41 * this.anInt1474 >> 12;
			local74 = local41 * this.anInt1484 >> 12;
			local47 = local12 * local41 >> 12;
			local26 = this.aShortArray23[0];
			local58 = local47 >> 12;
			@Pc(383) int local383 = local47 & 0xFFF;
			local62 = local58 + 1;
			local100 = Class5_Sub1_Sub4.anIntArray40[local383];
			if (local62 >= local54) {
				local62 = 0;
			}
			local83 = this.aByteArray18[local58 & 0xFF] & 0xFF;
			local92 = this.aByteArray18[local62 & 0xFF] & 0xFF;
			if (this.aBoolean77) {
				for (local102 = 0; local102 < Static174.anInt3489; local102++) {
					local111 = this.anInt1484 * Static117.anIntArray274[local102];
					local127 = this.method1116(local41 * local111 >> 12, local74, local92, local383, local100, local83);
					@Pc(492) int local492 = local26 * local127 >> 12;
					arg1[local102] = (local492 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static174.anInt3489; local102++) {
					local111 = Static117.anIntArray274[local102] * this.anInt1484;
					local127 = this.method1116(local41 * local111 >> 12, local74, local92, local383, local100, local83);
					arg1[local102] = local26 * local127 >> 12;
				}
			}
			return;
		}
		local26 = this.aShortArray23[0];
		if (local26 > 8 || local26 < -8) {
			local41 = this.aShortArray22[0] << 12;
			local47 = local41 * local12 >> 12;
			local54 = this.anInt1474 * local41 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			if (local54 <= local62) {
				local62 = 0;
			}
			local74 = local41 * this.anInt1484 >> 12;
			local83 = this.aByteArray18[local58 & 0xFF] & 0xFF;
			local92 = this.aByteArray18[local62 & 0xFF] & 0xFF;
			local47 &= 0xFFF;
			local100 = Class5_Sub1_Sub4.anIntArray40[local47];
			for (local102 = 0; local102 < Static174.anInt3489; local102++) {
				local111 = this.anInt1484 * Static117.anIntArray274[local102];
				local127 = this.method1116(local111 * local41 >> 12, local74, local92, local47, local100, local83);
				arg1[local102] = local127 * local26 >> 12;
			}
		}
		for (@Pc(145) int local145 = 1; local145 < this.anInt1473; local145++) {
			local26 = this.aShortArray23[local145];
			if (local26 > 8 || local26 < -8) {
				local41 = this.aShortArray22[local145] << 12;
				local74 = local41 * this.anInt1484 >> 12;
				local54 = this.anInt1474 * local41 >> 12;
				local47 = local12 * local41 >> 12;
				local58 = local47 >> 12;
				local83 = this.aByteArray18[local58 & 0xFF] & 0xFF;
				local47 &= 0xFFF;
				local100 = Class5_Sub1_Sub4.anIntArray40[local47];
				local62 = local58 + 1;
				if (local62 >= local54) {
					local62 = 0;
				}
				local92 = this.aByteArray18[local62 & 0xFF] & 0xFF;
				if (this.aBoolean77 && this.anInt1473 - 1 == local145) {
					for (local102 = 0; local102 < Static174.anInt3489; local102++) {
						local111 = this.anInt1484 * Static117.anIntArray274[local102];
						local127 = this.method1116(local41 * local111 >> 12, local74, local92, local47, local100, local83);
						local127 = arg1[local102] + (local26 * local127 >> 12);
						arg1[local102] = (local127 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static174.anInt3489; local102++) {
						local111 = this.anInt1484 * Static117.anIntArray274[local102];
						local127 = this.method1116(local41 * local111 >> 12, local74, local92, local47, local100, local83);
						arg1[local102] += local127 * local26 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)I")
	private int method1116(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg3 - 4096;
		@Pc(18) int local18 = arg0 >> 12;
		@Pc(22) int local22 = local18 + 1;
		if (arg1 <= local22) {
			local22 = 0;
		}
		@Pc(31) int local31 = arg0 & 0xFFF;
		local22 &= 0xFF;
		local18 &= 0xFF;
		@Pc(43) int local43 = local31 - 4096;
		@Pc(52) int local52 = this.aByteArray18[arg5 + local18] & 0x3;
		@Pc(56) int local56 = Class5_Sub1_Sub4.anIntArray40[local31];
		@Pc(75) int local75;
		if (local52 <= 1) {
			local75 = local52 == 0 ? arg3 + local31 : -local31 + arg3;
		} else {
			local75 = local52 == 2 ? local31 - arg3 : -local31 - arg3;
		}
		local52 = this.aByteArray18[local22 + arg5] & 0x3;
		@Pc(118) int local118;
		if (local52 > 1) {
			local118 = local52 == 2 ? local43 - arg3 : -local43 + -arg3;
		} else {
			local118 = local52 == 0 ? arg3 + local43 : -local43 + arg3;
		}
		local52 = this.aByteArray18[local18 + arg2] & 0x3;
		@Pc(150) int local150 = local75 + ((local118 - local75) * local56 >> 12);
		if (local52 > 1) {
			local75 = local52 == 2 ? local31 - local14 : -local14 + -local31;
		} else {
			local75 = local52 == 0 ? local31 + local14 : -local31 + local14;
		}
		local52 = this.aByteArray18[local22 + arg2] & 0x3;
		if (local52 <= 1) {
			local118 = local52 == 0 ? local43 + local14 : local14 + -local43;
		} else {
			local118 = local52 == 2 ? local43 - local14 : -local14 + -local43;
		}
		@Pc(244) int local244 = local75 + (local56 * (local118 - local75) >> 12);
		return (arg4 * (local244 - local150) >> 12) + local150;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean77 = arg0.method3062() == 1;
		} else if (arg1 == 1) {
			this.anInt1473 = arg0.method3062();
		} else if (arg1 == 2) {
			this.anInt1477 = arg0.method3075();
			if (this.anInt1477 < 0) {
				this.aShortArray23 = new short[this.anInt1473];
				for (@Pc(76) int local76 = 0; local76 < this.anInt1473; local76++) {
					this.aShortArray23[local76] = (short) arg0.method3075();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt1484 = this.anInt1474 = arg0.method3062();
			return;
		} else if (arg1 == 4) {
			this.anInt1483 = arg0.method3062();
			return;
		} else if (arg1 == 5) {
			this.anInt1484 = arg0.method3062();
			return;
		} else if (arg1 == 6) {
			this.anInt1474 = arg0.method3062();
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
	private void method1120() {
		@Pc(27) int local27;
		if (this.anInt1477 > 0) {
			this.aShortArray22 = new short[this.anInt1473];
			this.aShortArray23 = new short[this.anInt1473];
			for (local27 = 0; local27 < this.anInt1473; local27++) {
				this.aShortArray23[local27] = (short) (Math.pow((double) ((float) this.anInt1477 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray22[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray23 != null && this.aShortArray23.length == this.anInt1473) {
			this.aShortArray22 = new short[this.anInt1473];
			for (local27 = 0; local27 < this.anInt1473; local27++) {
				this.aShortArray22[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		this.aByteArray18 = Static186.method2816(this.anInt1483);
		this.method1120();
		for (@Pc(19) int local19 = this.anInt1473 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray23[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt1473--;
		}
	}
}
