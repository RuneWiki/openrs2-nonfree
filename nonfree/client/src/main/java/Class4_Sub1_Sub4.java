import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	public int anInt675 = 1638;

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
	public int anInt676 = 4;

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
	public int anInt679 = 4;

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
	public int anInt683 = 4;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
	public int anInt681 = 0;

	@OriginalMember(owner = "client!bq", name = "U", descriptor = "Z")
	public boolean aBoolean35 = true;

	@OriginalMember(owner = "client!bq", name = "W", descriptor = "[B")
	private byte[] aByteArray6 = new byte[512];

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIZI)I")
	private int method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = arg0 >> 12;
		@Pc(21) int local21 = local17 + 1;
		@Pc(25) int local25 = local17 & 0xFF;
		if (local21 >= arg3) {
			local21 = 0;
		}
		@Pc(38) int local38 = arg0 & 0xFFF;
		@Pc(42) int local42 = local38 - 4096;
		local21 &= 0xFF;
		@Pc(50) int local50 = arg1 - 4096;
		@Pc(59) int local59 = this.aByteArray6[local25 + arg4] & 0x3;
		@Pc(63) int local63 = Class4_Sub1_Sub26.anIntArray369[local38];
		@Pc(81) int local81;
		if (local59 <= 1) {
			local81 = local59 == 0 ? local38 + arg1 : arg1 - local38;
		} else {
			local81 = local59 == 2 ? local38 - arg1 : -local38 + -arg1;
		}
		local59 = this.aByteArray6[local21 + arg4] & 0x3;
		@Pc(127) int local127;
		if (local59 <= 1) {
			local127 = local59 == 0 ? local42 + arg1 : arg1 + -local42;
		} else {
			local127 = local59 == 2 ? local42 - arg1 : -local42 + -arg1;
		}
		@Pc(153) int local153 = (local63 * (local127 - local81) >> 12) + local81;
		local59 = this.aByteArray6[local25 + arg5] & 0x3;
		if (local59 <= 1) {
			local81 = local59 == 0 ? local50 + local38 : -local38 + local50;
		} else {
			local81 = local59 == 2 ? local38 - local50 : -local38 + -local50;
		}
		local59 = this.aByteArray6[local21 + arg5] & 0x3;
		if (local59 <= 1) {
			local127 = local59 == 0 ? local50 + local42 : -local42 + local50;
		} else {
			local127 = local59 == 2 ? local42 - local50 : -local42 + -local50;
		}
		@Pc(244) int local244 = (local63 * (local127 - local81) >> 12) + local81;
		return local153 + (arg2 * (local244 - local153) >> 12);
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)V")
	private void method631() {
		@Pc(25) int local25;
		if (this.anInt675 > 0) {
			this.aShortArray3 = new short[this.anInt679];
			this.aShortArray4 = new short[this.anInt679];
			for (local25 = 0; local25 < this.anInt679; local25++) {
				this.aShortArray4[local25] = (short) (Math.pow((double) ((float) this.anInt675 / 4096.0F), (double) local25) * 4096.0D);
				this.aShortArray3[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		} else if (this.aShortArray4 != null && this.aShortArray4.length == this.anInt679) {
			this.aShortArray3 = new short[this.anInt679];
			for (local25 = 0; local25 < this.anInt679; local25++) {
				this.aShortArray3[local25] = (short) Math.pow(2.0D, (double) local25);
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[II)V")
	public void method632(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt683 * Static442.anIntArray449[arg1];
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(38) int local38;
		@Pc(31) short local31;
		@Pc(102) int local102;
		@Pc(58) int local58;
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(88) int local88;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(84) int local84;
		@Pc(97) int local97;
		if (this.anInt679 == 1) {
			local31 = this.aShortArray4[0];
			local38 = this.aShortArray3[0] << 12;
			local45 = this.anInt676 * local38 >> 12;
			local52 = local38 * this.anInt683 >> 12;
			local58 = local20 * local38 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			local58 &= 0xFFF;
			if (local66 >= local52) {
				local66 = 0;
			}
			local84 = this.aByteArray6[local62 & 0xFF] & 0xFF;
			local88 = Class4_Sub1_Sub26.anIntArray369[local58];
			local97 = this.aByteArray6[local66 & 0xFF] & 0xFF;
			if (this.aBoolean35) {
				for (local102 = 0; local102 < Static376.anInt7260; local102++) {
					local111 = Static292.anIntArray394[local102] * this.anInt676;
					local125 = this.method630(local38 * local111 >> 12, local58, local88, local45, local84, local97);
					local125 = local125 * local31 >> 12;
					arg0[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static376.anInt7260; local102++) {
					local111 = this.anInt676 * Static292.anIntArray394[local102];
					local125 = this.method630(local38 * local111 >> 12, local58, local88, local45, local84, local97);
					arg0[local102] = local125 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray4[0];
		if (local31 > 8 || local31 < -8) {
			local38 = this.aShortArray3[0] << 12;
			local58 = local20 * local38 >> 12;
			local52 = this.anInt683 * local38 >> 12;
			local45 = this.anInt676 * local38 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			@Pc(238) int local238 = local58 & 0xFFF;
			if (local66 >= local52) {
				local66 = 0;
			}
			local97 = this.aByteArray6[local66 & 0xFF] & 0xFF;
			local88 = Class4_Sub1_Sub26.anIntArray369[local238];
			local84 = this.aByteArray6[local62 & 0xFF] & 0xFF;
			for (local102 = 0; local102 < Static376.anInt7260; local102++) {
				local111 = Static292.anIntArray394[local102] * this.anInt676;
				local125 = this.method630(local111 * local38 >> 12, local238, local88, local45, local84, local97);
				arg0[local102] = local31 * local125 >> 12;
			}
		}
		for (@Pc(312) int local312 = 1; local312 < this.anInt679; local312++) {
			local31 = this.aShortArray4[local312];
			if (local31 > 8 || local31 < -8) {
				local38 = this.aShortArray3[local312] << 12;
				local45 = local38 * this.anInt676 >> 12;
				local52 = local38 * this.anInt683 >> 12;
				local58 = local38 * local20 >> 12;
				local62 = local58 >> 12;
				local66 = local62 + 1;
				if (local52 <= local66) {
					local66 = 0;
				}
				local58 &= 0xFFF;
				local84 = this.aByteArray6[local62 & 0xFF] & 0xFF;
				local97 = this.aByteArray6[local66 & 0xFF] & 0xFF;
				local88 = Class4_Sub1_Sub26.anIntArray369[local58];
				if (this.aBoolean35 && this.anInt679 - 1 == local312) {
					for (local102 = 0; local102 < Static376.anInt7260; local102++) {
						local111 = this.anInt676 * Static292.anIntArray394[local102];
						local125 = this.method630(local111 * local38 >> 12, local58, local88, local45, local84, local97);
						local125 = arg0[local102] + (local125 * local31 >> 12);
						arg0[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static376.anInt7260; local102++) {
						local111 = this.anInt676 * Static292.anIntArray394[local102];
						local125 = this.method630(local111 * local38 >> 12, local58, local88, local45, local84, local97);
						arg0[local102] += local31 * local125 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			this.method632(local17, arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		this.aByteArray6 = Static392.method6207(this.anInt681);
		this.method631();
		for (@Pc(22) int local22 = this.anInt679 - 1; local22 >= 1; local22--) {
			@Pc(29) short local29 = this.aShortArray4[local22];
			if (local29 > 8 || local29 < -8) {
				return;
			}
			this.anInt679--;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean35 = arg1.method4905() == 1;
		} else if (arg0 == 1) {
			this.anInt679 = arg1.method4905();
		} else if (arg0 == 2) {
			this.anInt675 = arg1.method4946();
			if (this.anInt675 < 0) {
				this.aShortArray4 = new short[this.anInt679];
				for (@Pc(65) int local65 = 0; local65 < this.anInt679; local65++) {
					this.aShortArray4[local65] = (short) arg1.method4946();
				}
			}
		} else if (arg0 == 3) {
			this.anInt676 = this.anInt683 = arg1.method4905();
		} else if (arg0 == 4) {
			this.anInt681 = arg1.method4905();
		} else if (arg0 == 5) {
			this.anInt676 = arg1.method4905();
		} else if (arg0 == 6) {
			this.anInt683 = arg1.method4905();
		}
	}
}
