import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
	private int anInt1065;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
	private int anInt1077;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1077 = this.anInt1061 = arg1.method191();
		} else if (arg0 == 1) {
			this.anInt1064 = arg1.method191();
		} else if (arg0 == 2) {
			this.anInt1063 = arg1.method208();
		} else if (arg0 == 3) {
			this.anInt1073 = arg1.method191();
		} else if (arg0 == 4) {
			this.anInt1070 = arg1.method191();
		} else if (arg0 == 5) {
			this.anInt1077 = arg1.method191();
		} else if (arg0 == 6) {
			this.anInt1061 = arg1.method191();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(19) int local19 = Static125.anIntArray336[arg0];
			@Pc(22) int local22 = this.anInt1073;
			@Pc(42) int local42;
			if (local22 == 2) {
				for (local22 = 0; local22 < Static141.anInt3261; local22++) {
					local42 = Static85.anIntArray47[local22];
					@Pc(49) int[] local49 = this.method686(local19, 2, local42);
					local11[local22] = local49[1] - local49[0];
				}
			} else if (local22 == 1) {
				for (local22 = 0; local22 < Static141.anInt3261; local22++) {
					local42 = Static85.anIntArray47[local22];
					local11[local22] = this.method686(local19, 2, local42)[1];
				}
			} else {
				for (local22 = 0; local22 < Static141.anInt3261; local22++) {
					local42 = Static85.anIntArray47[local22];
					local11[local22] = this.method686(local19, 1, local42)[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		this.method684();
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
	private void method684() {
		@Pc(12) Random local12 = new Random((long) this.anInt1064);
		@Pc(17) int local17 = 4096 / this.anInt1077;
		this.anInt1072 = this.anInt1061 * this.anInt1077;
		this.anInt1065 = local17 >> 1;
		this.anIntArrayArray4 = new int[this.anInt1072][2];
		@Pc(40) int local40 = 4096 / this.anInt1061;
		this.anInt1062 = local40 >> 1;
		@Pc(53) int local53 = this.anInt1063 * this.anInt1065 >> 12;
		@Pc(61) int local61 = this.anInt1063 * this.anInt1062 >> 12;
		for (@Pc(63) int local63 = 0; local63 < this.anInt1061; local63++) {
			@Pc(69) int local69 = local40 * local63;
			for (@Pc(71) int local71 = 0; local71 < this.anInt1077; local71++) {
				@Pc(80) int local80 = local71 + this.anInt1077 * local63;
				@Pc(91) int local91 = local53 * (Static54.method1020(8192, local12) - 4096) >> 12;
				@Pc(102) int local102 = local61 * (Static54.method1020(8192, local12) - 4096) >> 12;
				this.anIntArrayArray4[local80][0] = local91 + local71 * local17;
				this.anIntArrayArray4[local80][1] = local69 + local102;
			}
		}
		this.anInt1066 = this.anInt1061 < this.anInt1077 ? this.anInt1077 : this.anInt1061;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIBI)[I")
	private int[] method686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int[] local8 = new int[arg1];
		for (@Pc(10) int local10 = 0; local10 < arg1; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg0 += this.anInt1062;
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		arg2 += this.anInt1065;
		if (arg2 > 4096) {
			arg2 -= 4096;
		}
		@Pc(57) int local57 = arg0 * this.anInt1061 >> 12;
		@Pc(64) int local64 = arg2 * this.anInt1077 >> 12;
		@Pc(66) int local66 = -1;
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = Integer.MAX_VALUE;
		@Pc(81) int local81 = this.anInt1077 <= 2 ? this.anInt1077 - 1 : 2;
		@Pc(83) int local83 = Integer.MAX_VALUE;
		@Pc(94) int local94 = this.anInt1061 > 2 ? 2 : this.anInt1061 - 1;
		@Pc(102) int local102;
		@Pc(112) int local112;
		@Pc(108) int local108;
		@Pc(154) int local154;
		@Pc(161) int local161;
		for (@Pc(97) int local97 = -local81; local97 <= local81; local97++) {
			for (local102 = -local94; local102 <= local94; local102++) {
				local108 = local102 + local57;
				local112 = local64 + local97;
				if (local108 < 0) {
					local108 += this.anInt1061;
				}
				if (local112 < 0) {
					local112 += this.anInt1077;
				}
				if (local112 >= this.anInt1077) {
					local112 -= this.anInt1077;
				}
				if (local108 >= this.anInt1061) {
					local108 -= this.anInt1061;
				}
				local154 = local112 + this.anInt1077 * local108;
				local161 = this.anIntArrayArray4[local154][0];
				@Pc(165) int local165 = arg2 - local161;
				@Pc(172) int local172 = this.anIntArrayArray4[local154][1];
				@Pc(177) int local177 = arg0 - local172;
				if (local177 < 0) {
					local177 = -local177;
				}
				if (local165 < 0) {
					local165 = -local165;
				}
				if (local165 > 2048) {
					local165 = 4096 - local165;
				}
				if (local177 > 2048) {
					local177 = 4096 - local177;
				}
				@Pc(220) int local220 = local177 * local177 + local165 * local165 >> 12;
				if (local70 > local220) {
					if (local66 == -1) {
						local66 = local154;
						local83 = local220;
					} else {
						local66 = local68;
						local83 = local70;
					}
					local68 = local154;
					local70 = local220;
				} else if (local66 == local68 && local154 != local66 || local83 > local220 && local68 != local154) {
					local83 = local220;
					local66 = local154;
				}
			}
		}
		local112 = arg0 - this.anIntArrayArray4[local68][1];
		if (local112 < 0) {
			local112 = -local112;
		}
		if (local112 > 2048) {
			local112 = 4096 - local112;
		}
		local102 = arg2 - this.anIntArrayArray4[local68][0];
		local108 = arg2 - this.anIntArrayArray4[local66][0];
		local154 = arg0 - this.anIntArrayArray4[local66][1];
		if (local154 < 0) {
			local154 = -local154;
		}
		if (local108 < 0) {
			local108 = -local108;
		}
		if (local154 > 2048) {
			local154 = 4096 - local154;
		}
		if (local102 < 0) {
			local102 = -local102;
		}
		if (local102 > 2048) {
			local102 = 4096 - local102;
		}
		if (local108 > 2048) {
			local108 = 4096 - local108;
		}
		local161 = this.anInt1070;
		if (local161 == 1) {
			local70 = (int) Math.sqrt((double) (local112 * local112 + local102 * local102));
			local83 = (int) Math.sqrt((double) (local154 * local154 + local108 * local108));
		} else if (local161 == 2) {
			local70 = Math.max(local102, local112);
			local83 = Math.max(local108, local154);
		} else {
			local70 = local112 * local112 + local102 * local102;
			local83 = local108 * local108 + local154 * local154;
		}
		if (arg1 > 1) {
			local8[1] = this.anInt1066 * local83;
		}
		local8[0] = this.anInt1066 * local70;
		return local8;
	}
}
