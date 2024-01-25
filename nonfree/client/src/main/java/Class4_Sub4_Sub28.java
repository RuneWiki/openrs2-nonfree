import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class4_Sub4_Sub28 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
	public int anInt7442 = 4;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
	public int anInt7445 = 1638;

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
	public int anInt7444 = 0;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "I")
	public int anInt7448 = 4;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	public int anInt7439 = 4;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "[B")
	private byte[] aByteArray101 = new byte[512];

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "Z")
	public boolean aBoolean530 = true;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([III)V")
	public void method6163(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static450.anIntArray619[arg1] * this.anInt7439;
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(102) int local102;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(41) int local41;
		@Pc(79) int local79;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (this.anInt7442 == 1) {
			local27 = this.aShortArray138[0];
			local34 = this.aShortArray139[0] << 12;
			local41 = local34 * this.anInt7439 >> 12;
			local47 = local34 * local12 >> 12;
			local54 = this.anInt7448 * local34 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			if (local62 >= local41) {
				local62 = 0;
			}
			local47 &= 0xFFF;
			local79 = Class131.anIntArray370[local47];
			local88 = this.aByteArray101[local58 & 0xFF] & 0xFF;
			local97 = this.aByteArray101[local62 & 0xFF] & 0xFF;
			if (this.aBoolean530) {
				for (local102 = 0; local102 < Static560.anInt9394; local102++) {
					local111 = Static80.anIntArray212[local102] * this.anInt7448;
					local125 = this.method6166(local47, local79, local54, local111 * local34 >> 12, local97, local88);
					local125 = local125 * local27 >> 12;
					arg0[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static560.anInt9394; local102++) {
					local111 = this.anInt7448 * Static80.anIntArray212[local102];
					local125 = this.method6166(local47, local79, local54, local34 * local111 >> 12, local97, local88);
					arg0[local102] = local27 * local125 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray138[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray139[0] << 12;
			local41 = local34 * this.anInt7439 >> 12;
			local47 = local12 * local34 >> 12;
			local54 = local34 * this.anInt7448 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			if (local41 <= local62) {
				local62 = 0;
			}
			local47 &= 0xFFF;
			local97 = this.aByteArray101[local62 & 0xFF] & 0xFF;
			local79 = Class131.anIntArray370[local47];
			local88 = this.aByteArray101[local58 & 0xFF] & 0xFF;
			for (local102 = 0; local102 < Static560.anInt9394; local102++) {
				local111 = Static80.anIntArray212[local102] * this.anInt7448;
				local125 = this.method6166(local47, local79, local54, local111 * local34 >> 12, local97, local88);
				arg0[local102] = local27 * local125 >> 12;
			}
		}
		for (@Pc(302) int local302 = 1; local302 < this.anInt7442; local302++) {
			local27 = this.aShortArray138[local302];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray139[local302] << 12;
				local41 = this.anInt7439 * local34 >> 12;
				local47 = local12 * local34 >> 12;
				local54 = local34 * this.anInt7448 >> 12;
				local58 = local47 >> 12;
				local62 = local58 + 1;
				if (local62 >= local41) {
					local62 = 0;
				}
				local47 &= 0xFFF;
				local97 = this.aByteArray101[local62 & 0xFF] & 0xFF;
				local79 = Class131.anIntArray370[local47];
				local88 = this.aByteArray101[local58 & 0xFF] & 0xFF;
				if (this.aBoolean530 && this.anInt7442 - 1 == local302) {
					for (local102 = 0; local102 < Static560.anInt9394; local102++) {
						local111 = Static80.anIntArray212[local102] * this.anInt7448;
						local125 = this.method6166(local47, local79, local54, local111 * local34 >> 12, local97, local88);
						local125 = arg0[local102] + (local125 * local27 >> 12);
						arg0[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static560.anInt9394; local102++) {
						local111 = this.anInt7448 * Static80.anIntArray212[local102];
						local125 = this.method6166(local47, local79, local54, local34 * local111 >> 12, local97, local88);
						arg0[local102] += local125 * local27 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.aBoolean530 = arg1.method6015() == 1;
		} else if (arg0 == 1) {
			this.anInt7442 = arg1.method6015();
		} else if (arg0 == 2) {
			this.anInt7445 = arg1.method6003();
			if (this.anInt7445 < 0) {
				this.aShortArray138 = new short[this.anInt7442];
				for (@Pc(70) int local70 = 0; local70 < this.anInt7442; local70++) {
					this.aShortArray138[local70] = (short) arg1.method6003();
				}
			}
		} else if (arg0 == 3) {
			this.anInt7448 = this.anInt7439 = arg1.method6015();
		} else if (arg0 == 4) {
			this.anInt7444 = arg1.method6015();
		} else if (arg0 == 5) {
			this.anInt7448 = arg1.method6015();
		} else if (arg0 == 6) {
			this.anInt7439 = arg1.method6015();
		}
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
	private void method6164() {
		@Pc(24) int local24;
		if (this.anInt7445 > 0) {
			this.aShortArray139 = new short[this.anInt7442];
			this.aShortArray138 = new short[this.anInt7442];
			for (local24 = 0; local24 < this.anInt7442; local24++) {
				this.aShortArray138[local24] = (short) (Math.pow((double) ((float) this.anInt7445 / 4096.0F), (double) local24) * 4096.0D);
				this.aShortArray139[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		} else if (this.aShortArray138 != null && this.anInt7442 == this.aShortArray138.length) {
			this.aShortArray139 = new short[this.anInt7442];
			for (local24 = 0; local24 < this.anInt7442; local24++) {
				this.aShortArray139[local24] = (short) Math.pow(2.0D, (double) local24);
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			this.method6163(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		this.aByteArray101 = Static457.method6434(this.anInt7444);
		this.method6164();
		for (@Pc(23) int local23 = this.anInt7442 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray138[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt7442--;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIBI)I")
	private int method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg3 & 0xFFF;
		if (arg2 <= local13) {
			local13 = 0;
		}
		@Pc(34) int local34 = local21 - 4096;
		@Pc(38) int local38 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(64) int local64 = this.aByteArray101[local17 + arg5] & 0x3;
		@Pc(68) int local68 = Class131.anIntArray370[local21];
		@Pc(87) int local87;
		if (local64 <= 1) {
			local87 = local64 == 0 ? arg0 + local21 : arg0 + -local21;
		} else {
			local87 = local64 == 2 ? local21 - arg0 : -arg0 + -local21;
		}
		local64 = this.aByteArray101[arg5 + local13] & 0x3;
		@Pc(129) int local129;
		if (local64 <= 1) {
			local129 = local64 == 0 ? local34 + arg0 : -local34 + arg0;
		} else {
			local129 = local64 == 2 ? local34 - arg0 : -local34 - arg0;
		}
		@Pc(156) int local156 = (local68 * (local129 - local87) >> 12) + local87;
		local64 = this.aByteArray101[arg4 + local17] & 0x3;
		if (local64 > 1) {
			local87 = local64 == 2 ? local21 - local38 : -local21 + -local38;
		} else {
			local87 = local64 == 0 ? local21 + local38 : local38 + -local21;
		}
		local64 = this.aByteArray101[arg4 + local13] & 0x3;
		if (local64 > 1) {
			local129 = local64 == 2 ? local34 - local38 : -local38 + -local34;
		} else {
			local129 = local64 == 0 ? local38 + local34 : local38 + -local34;
		}
		@Pc(249) int local249 = ((local129 - local87) * local68 >> 12) + local87;
		return ((local249 - local156) * arg1 >> 12) + local156;
	}
}
