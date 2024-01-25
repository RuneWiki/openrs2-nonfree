import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class3_Sub1_Sub38 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "[S")
	private short[] aShortArray196;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "[S")
	private short[] aShortArray197;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "[B")
	private byte[] aByteArray117 = new byte[512];

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
	public int anInt9303 = 1638;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	public int anInt9308 = 4;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Z")
	public boolean aBoolean681 = true;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
	public int anInt9302 = 0;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	public int anInt9307 = 4;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	public int anInt9300 = 4;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.aBoolean681 = arg1.method7548() == 1;
		} else if (arg0 == 1) {
			this.anInt9300 = arg1.method7548();
		} else if (arg0 == 2) {
			this.anInt9303 = arg1.method7604();
			if (this.anInt9303 < 0) {
				this.aShortArray196 = new short[this.anInt9300];
				for (@Pc(70) int local70 = 0; local70 < this.anInt9300; local70++) {
					this.aShortArray196[local70] = (short) arg1.method7604();
				}
			}
		} else if (arg0 == 3) {
			this.anInt9307 = this.anInt9308 = arg1.method7548();
		} else if (arg0 == 4) {
			this.anInt9302 = arg1.method7548();
		} else if (arg0 == 5) {
			this.anInt9307 = arg1.method7548();
		} else if (arg0 == 6) {
			this.anInt9308 = arg1.method7548();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	private void method7688() {
		@Pc(22) int local22;
		if (this.anInt9303 > 0) {
			this.aShortArray196 = new short[this.anInt9300];
			this.aShortArray197 = new short[this.anInt9300];
			for (local22 = 0; local22 < this.anInt9300; local22++) {
				this.aShortArray196[local22] = (short) (Math.pow((double) ((float) this.anInt9303 / 4096.0F), (double) local22) * 4096.0D);
				this.aShortArray197[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		} else if (this.aShortArray196 != null && this.aShortArray196.length == this.anInt9300) {
			this.aShortArray197 = new short[this.anInt9300];
			for (local22 = 0; local22 < this.anInt9300; local22++) {
				this.aShortArray197[local22] = (short) Math.pow(2.0D, (double) local22);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		this.aByteArray117 = Static15.method661(this.anInt9302);
		this.method7688();
		for (@Pc(27) int local27 = this.anInt9300 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray196[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt9300--;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			this.method7692(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B[II)V")
	public void method7692(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9308 * Static402.anIntArray741[arg1];
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(33) int local33;
		@Pc(38) short local38;
		@Pc(102) int local102;
		@Pc(51) int local51;
		@Pc(45) int local45;
		@Pc(58) int local58;
		@Pc(88) int local88;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(97) int local97;
		@Pc(84) int local84;
		if (this.anInt9300 == 1) {
			local33 = this.aShortArray197[0] << 12;
			local38 = this.aShortArray196[0];
			local45 = this.anInt9307 * local33 >> 12;
			local51 = local33 * local12 >> 12;
			local58 = local33 * this.anInt9308 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local66 >= local58) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local84 = this.aByteArray117[local66 & 0xFF] & 0xFF;
			local88 = Class3_Sub4_Sub1.anIntArray399[local51];
			local97 = this.aByteArray117[local62 & 0xFF] & 0xFF;
			if (this.aBoolean681) {
				for (local102 = 0; local102 < Static307.anInt4846; local102++) {
					local111 = this.anInt9307 * Static241.anIntArray759[local102];
					local125 = this.method7694(local88, local84, local33 * local111 >> 12, local45, local51, local97);
					local125 = local38 * local125 >> 12;
					arg0[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static307.anInt4846; local102++) {
					local111 = Static241.anIntArray759[local102] * this.anInt9307;
					local125 = this.method7694(local88, local84, local33 * local111 >> 12, local45, local51, local97);
					arg0[local102] = local125 * local38 >> 12;
				}
			}
			return;
		}
		local38 = this.aShortArray196[0];
		if (local38 > 8 || local38 < -8) {
			local33 = this.aShortArray197[0] << 12;
			local58 = this.anInt9308 * local33 >> 12;
			local51 = local12 * local33 >> 12;
			local45 = this.anInt9307 * local33 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local58 <= local66) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local84 = this.aByteArray117[local66 & 0xFF] & 0xFF;
			local97 = this.aByteArray117[local62 & 0xFF] & 0xFF;
			local88 = Class3_Sub4_Sub1.anIntArray399[local51];
			for (local102 = 0; local102 < Static307.anInt4846; local102++) {
				local111 = this.anInt9307 * Static241.anIntArray759[local102];
				local125 = this.method7694(local88, local84, local111 * local33 >> 12, local45, local51, local97);
				arg0[local102] = local38 * local125 >> 12;
			}
		}
		for (@Pc(308) int local308 = 1; local308 < this.anInt9300; local308++) {
			local38 = this.aShortArray196[local308];
			if (local38 > 8 || local38 < -8) {
				local33 = this.aShortArray197[local308] << 12;
				local51 = local12 * local33 >> 12;
				local45 = local33 * this.anInt9307 >> 12;
				local58 = this.anInt9308 * local33 >> 12;
				local62 = local51 >> 12;
				local66 = local62 + 1;
				local51 &= 0xFFF;
				if (local58 <= local66) {
					local66 = 0;
				}
				local97 = this.aByteArray117[local62 & 0xFF] & 0xFF;
				local84 = this.aByteArray117[local66 & 0xFF] & 0xFF;
				local88 = Class3_Sub4_Sub1.anIntArray399[local51];
				if (this.aBoolean681 && this.anInt9300 - 1 == local308) {
					for (local102 = 0; local102 < Static307.anInt4846; local102++) {
						local111 = this.anInt9307 * Static241.anIntArray759[local102];
						local125 = this.method7694(local88, local84, local33 * local111 >> 12, local45, local51, local97);
						local125 = (local125 * local38 >> 12) + arg0[local102];
						arg0[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static307.anInt4846; local102++) {
						local111 = Static241.anIntArray759[local102] * this.anInt9307;
						local125 = this.method7694(local88, local84, local111 * local33 >> 12, local45, local51, local97);
						arg0[local102] += local125 * local38 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)I")
	private int method7694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		@Pc(30) int local30 = arg2 & 0xFFF;
		@Pc(34) int local34 = arg4 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local30 - 4096;
		@Pc(51) int local51 = this.aByteArray117[arg5 + local17] & 0x3;
		@Pc(55) int local55 = Class3_Sub4_Sub1.anIntArray399[local30];
		@Pc(71) int local71;
		if (local51 <= 1) {
			local71 = local51 == 0 ? arg4 + local30 : -local30 + arg4;
		} else {
			local71 = local51 == 2 ? local30 - arg4 : -arg4 + -local30;
		}
		local51 = this.aByteArray117[local13 + arg5] & 0x3;
		@Pc(121) int local121;
		if (local51 > 1) {
			local121 = local51 == 2 ? local42 - arg4 : -local42 + -arg4;
		} else {
			local121 = local51 == 0 ? local42 + arg4 : -local42 + arg4;
		}
		@Pc(148) int local148 = ((local121 - local71) * local55 >> 12) + local71;
		local51 = this.aByteArray117[arg1 + local17] & 0x3;
		if (local51 <= 1) {
			local71 = local51 == 0 ? local30 + local34 : local34 + -local30;
		} else {
			local71 = local51 == 2 ? local30 - local34 : -local30 - local34;
		}
		local51 = this.aByteArray117[local13 + arg1] & 0x3;
		if (local51 > 1) {
			local121 = local51 == 2 ? local42 - local34 : -local42 + -local34;
		} else {
			local121 = local51 == 0 ? local42 + local34 : local34 + -local42;
		}
		@Pc(245) int local245 = local71 + (local55 * (local121 - local71) >> 12);
		return local148 + (arg0 * (local245 - local148) >> 12);
	}
}
