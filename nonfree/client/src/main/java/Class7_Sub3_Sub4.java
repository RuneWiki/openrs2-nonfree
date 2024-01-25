import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class7_Sub3_Sub4 extends Class7_Sub3 {

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "[B")
	private byte[] aByteArray7 = new byte[512];

	@OriginalMember(owner = "client!bk", name = "P", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
	public int anInt526 = 0;

	@OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
	public int anInt525 = 4;

	@OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
	public int anInt522 = 4;

	@OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
	public int anInt530 = 4;

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
	public int anInt519 = 1638;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		this.aByteArray7 = Static383.method4916(this.anInt526);
		this.method412();
		for (@Pc(24) int local24 = this.anInt522 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray6[local24];
			if (local31 > 8) {
				return;
			}
			if (local31 < -8) {
				return;
			}
			this.anInt522--;
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
	private void method412() {
		@Pc(20) int local20;
		if (this.anInt519 > 0) {
			this.aShortArray7 = new short[this.anInt522];
			this.aShortArray6 = new short[this.anInt522];
			for (local20 = 0; local20 < this.anInt522; local20++) {
				this.aShortArray6[local20] = (short) (Math.pow((double) ((float) this.anInt519 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray7[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray6 != null && this.anInt522 == this.aShortArray6.length) {
			this.aShortArray7 = new short[this.anInt522];
			for (local20 = 0; local20 < this.anInt522; local20++) {
				this.aShortArray7[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[II)V")
	public void method413(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static203.anIntArray322[arg1] * this.anInt530;
		@Pc(118) int local118;
		@Pc(132) int local132;
		@Pc(44) int local44;
		@Pc(31) short local31;
		@Pc(109) int local109;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(98) int local98;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(107) int local107;
		@Pc(94) int local94;
		if (this.anInt522 == 1) {
			local44 = this.aShortArray7[0] << 12;
			local31 = this.aShortArray6[0];
			local50 = local12 * local44 >> 12;
			local64 = this.anInt530 * local44 >> 12;
			local57 = this.anInt525 * local44 >> 12;
			local68 = local50 >> 12;
			local72 = local68 + 1;
			@Pc(382) int local382 = local50 & 0xFFF;
			if (local72 >= local64) {
				local72 = 0;
			}
			local94 = this.aByteArray7[local72 & 0xFF] & 0xFF;
			local107 = this.aByteArray7[local68 & 0xFF] & 0xFF;
			local98 = Class26_Sub3.anIntArray532[local382];
			if (this.aBoolean19) {
				for (local109 = 0; local109 < Static58.anInt1052; local109++) {
					local118 = Static185.anIntArray298[local109] * this.anInt525;
					local132 = this.method414(local382, local94, local107, local98, local57, local118 * local44 >> 12);
					@Pc(481) int local481 = local132 * local31 >> 12;
					arg0[local109] = (local481 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static58.anInt1052; local109++) {
					local118 = Static185.anIntArray298[local109] * this.anInt525;
					local132 = this.method414(local382, local94, local107, local98, local57, local118 * local44 >> 12);
					arg0[local109] = local132 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray6[0];
		if (local31 > 8 || local31 < -8) {
			local44 = this.aShortArray7[0] << 12;
			local50 = local44 * local12 >> 12;
			local57 = local44 * this.anInt525 >> 12;
			local64 = this.anInt530 * local44 >> 12;
			local68 = local50 >> 12;
			local72 = local68 + 1;
			if (local64 <= local72) {
				local72 = 0;
			}
			local50 &= 0xFFF;
			local94 = this.aByteArray7[local72 & 0xFF] & 0xFF;
			local98 = Class26_Sub3.anIntArray532[local50];
			local107 = this.aByteArray7[local68 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static58.anInt1052; local109++) {
				local118 = this.anInt525 * Static185.anIntArray298[local109];
				local132 = this.method414(local50, local94, local107, local98, local57, local44 * local118 >> 12);
				arg0[local109] = local31 * local132 >> 12;
			}
		}
		for (@Pc(146) int local146 = 1; local146 < this.anInt522; local146++) {
			local31 = this.aShortArray6[local146];
			if (local31 > 8 || local31 < -8) {
				local44 = this.aShortArray7[local146] << 12;
				local57 = local44 * this.anInt525 >> 12;
				local64 = local44 * this.anInt530 >> 12;
				local50 = local12 * local44 >> 12;
				local68 = local50 >> 12;
				local72 = local68 + 1;
				if (local72 >= local64) {
					local72 = 0;
				}
				local50 &= 0xFFF;
				local98 = Class26_Sub3.anIntArray532[local50];
				local107 = this.aByteArray7[local68 & 0xFF] & 0xFF;
				local94 = this.aByteArray7[local72 & 0xFF] & 0xFF;
				if (this.aBoolean19 && this.anInt522 - 1 == local146) {
					for (local109 = 0; local109 < Static58.anInt1052; local109++) {
						local118 = Static185.anIntArray298[local109] * this.anInt525;
						local132 = this.method414(local50, local94, local107, local98, local57, local118 * local44 >> 12);
						local132 = arg0[local109] + (local132 * local31 >> 12);
						arg0[local109] = (local132 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static58.anInt1052; local109++) {
						local118 = this.anInt525 * Static185.anIntArray298[local109];
						local132 = this.method414(local50, local94, local107, local98, local57, local44 * local118 >> 12);
						arg0[local109] += local132 * local31 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.aBoolean19 = arg1.method3981() == 1;
		} else if (arg0 == 1) {
			this.anInt522 = arg1.method3981();
		} else if (arg0 == 2) {
			this.anInt519 = arg1.method3961();
			if (this.anInt519 < 0) {
				this.aShortArray6 = new short[this.anInt522];
				for (@Pc(73) int local73 = 0; local73 < this.anInt522; local73++) {
					this.aShortArray6[local73] = (short) arg1.method3961();
				}
			}
		} else if (arg0 == 3) {
			this.anInt525 = this.anInt530 = arg1.method3981();
		} else if (arg0 == 4) {
			this.anInt526 = arg1.method3981();
		} else if (arg0 == 5) {
			this.anInt525 = arg1.method3981();
		} else if (arg0 == 6) {
			this.anInt530 = arg1.method3981();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			this.method413(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)I")
	private int method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (arg4 <= local13) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg5 & 0xFFF;
		local13 &= 0xFF;
		@Pc(34) int local34 = local26 - 4096;
		@Pc(38) int local38 = arg0 - 4096;
		@Pc(42) int local42 = Class26_Sub3.anIntArray532[local26];
		@Pc(51) int local51 = this.aByteArray7[arg2 + local17] & 0x3;
		@Pc(70) int local70;
		if (local51 > 1) {
			local70 = local51 == 2 ? local26 - arg0 : -arg0 + -local26;
		} else {
			local70 = local51 == 0 ? local26 + arg0 : -local26 + arg0;
		}
		local51 = this.aByteArray7[local13 + arg2] & 0x3;
		@Pc(111) int local111;
		if (local51 <= 1) {
			local111 = local51 == 0 ? arg0 + local34 : arg0 - local34;
		} else {
			local111 = local51 == 2 ? local34 - arg0 : -local34 - arg0;
		}
		@Pc(138) int local138 = local70 + (local42 * (local111 - local70) >> 12);
		local51 = this.aByteArray7[arg1 + local17] & 0x3;
		if (local51 <= 1) {
			local70 = local51 == 0 ? local26 + local38 : -local26 + local38;
		} else {
			local70 = local51 == 2 ? local26 - local38 : -local26 + -local38;
		}
		local51 = this.aByteArray7[arg1 + local13] & 0x3;
		if (local51 <= 1) {
			local111 = local51 == 0 ? local38 + local34 : local38 + -local34;
		} else {
			local111 = local51 == 2 ? local34 - local38 : -local38 + -local34;
		}
		@Pc(238) int local238 = local70 + (local42 * (local111 - local70) >> 12);
		return (arg3 * (local238 - local138) >> 12) + local138;
	}
}
