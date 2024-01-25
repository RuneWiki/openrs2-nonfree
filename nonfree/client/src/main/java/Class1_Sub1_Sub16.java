import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ht", name = "U", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ht", name = "Z", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
	public int anInt2673 = 4;

	@OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
	public int anInt2671 = 4;

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "[B")
	private byte[] aByteArray25 = new byte[512];

	@OriginalMember(owner = "client!ht", name = "X", descriptor = "I")
	public int anInt2677 = 1638;

	@OriginalMember(owner = "client!ht", name = "L", descriptor = "I")
	public int anInt2669 = 4;

	@OriginalMember(owner = "client!ht", name = "V", descriptor = "Z")
	public boolean aBoolean213 = true;

	@OriginalMember(owner = "client!ht", name = "Y", descriptor = "I")
	public int anInt2678 = 0;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIIII)I")
	private int method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17 = arg5 >> 12;
		@Pc(21) int local21 = local17 + 1;
		@Pc(25) int local25 = arg5 & 0xFFF;
		@Pc(29) int local29 = local17 & 0xFF;
		if (arg0 <= local21) {
			local21 = 0;
		}
		@Pc(38) int local38 = arg1 - 4096;
		local21 &= 0xFF;
		@Pc(46) int local46 = local25 - 4096;
		@Pc(50) int local50 = Class123.anIntArray166[local25];
		@Pc(59) int local59 = this.aByteArray25[arg4 + local29] & 0x3;
		@Pc(72) int local72;
		if (local59 <= 1) {
			local72 = local59 == 0 ? arg1 + local25 : arg1 - local25;
		} else {
			local72 = local59 == 2 ? local25 - arg1 : -arg1 + -local25;
		}
		local59 = this.aByteArray25[local21 + arg4] & 0x3;
		@Pc(117) int local117;
		if (local59 <= 1) {
			local117 = local59 == 0 ? local46 + arg1 : -local46 + arg1;
		} else {
			local117 = local59 == 2 ? local46 - arg1 : -arg1 + -local46;
		}
		local59 = this.aByteArray25[local29 + arg3] & 0x3;
		@Pc(155) int local155 = (local50 * (local117 - local72) >> 12) + local72;
		if (local59 > 1) {
			local72 = local59 == 2 ? local25 - local38 : -local25 - local38;
		} else {
			local72 = local59 == 0 ? local25 + local38 : local38 + -local25;
		}
		local59 = this.aByteArray25[arg3 + local21] & 0x3;
		if (local59 <= 1) {
			local117 = local59 == 0 ? local46 + local38 : local38 + -local46;
		} else {
			local117 = local59 == 2 ? local46 - local38 : -local46 - local38;
		}
		@Pc(243) int local243 = local72 + ((local117 - local72) * local50 >> 12);
		return local155 + ((local243 - local155) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
	private void method2232() {
		@Pc(35) int local35;
		if (this.anInt2677 > 0) {
			this.aShortArray40 = new short[this.anInt2669];
			this.aShortArray39 = new short[this.anInt2669];
			for (local35 = 0; local35 < this.anInt2669; local35++) {
				this.aShortArray39[local35] = (short) (Math.pow((double) ((float) this.anInt2677 / 4096.0F), (double) local35) * 4096.0D);
				this.aShortArray40[local35] = (short) Math.pow(2.0D, (double) local35);
			}
		} else if (this.aShortArray39 != null && this.aShortArray39.length == this.anInt2669) {
			this.aShortArray40 = new short[this.anInt2669];
			for (local35 = 0; local35 < this.anInt2669; local35++) {
				this.aShortArray40[local35] = (short) Math.pow(2.0D, (double) local35);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean213 = arg1.method4463() == 1;
		} else if (arg0 == 1) {
			this.anInt2669 = arg1.method4463();
		} else if (arg0 == 2) {
			this.anInt2677 = arg1.method4482();
			if (this.anInt2677 < 0) {
				this.aShortArray39 = new short[this.anInt2669];
				for (@Pc(73) int local73 = 0; local73 < this.anInt2669; local73++) {
					this.aShortArray39[local73] = (short) arg1.method4482();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt2671 = this.anInt2673 = arg1.method4463();
			return;
		} else if (arg0 == 4) {
			this.anInt2678 = arg1.method4463();
			return;
		} else if (arg0 == 5) {
			this.anInt2671 = arg1.method4463();
			return;
		} else if (arg0 == 6) {
			this.anInt2673 = arg1.method4463();
			return;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "([III)V")
	public void method2234(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt2673 * Static221.anIntArray194[arg1];
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(41) int local41;
		@Pc(28) short local28;
		@Pc(102) int local102;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(91) int local91;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(87) int local87;
		@Pc(100) int local100;
		if (this.anInt2669 == 1) {
			local41 = this.aShortArray40[0] << 12;
			local28 = this.aShortArray39[0];
			local47 = local41 * local17 >> 12;
			local54 = this.anInt2671 * local41 >> 12;
			local61 = local41 * this.anInt2673 >> 12;
			local65 = local47 >> 12;
			local69 = local65 + 1;
			if (local69 >= local61) {
				local69 = 0;
			}
			local47 &= 0xFFF;
			local100 = this.aByteArray25[local69 & 0xFF] & 0xFF;
			local87 = this.aByteArray25[local65 & 0xFF] & 0xFF;
			local91 = Class123.anIntArray166[local47];
			if (this.aBoolean213) {
				for (local102 = 0; local102 < Static434.anInt4326; local102++) {
					local111 = Static280.anIntArray238[local102] * this.anInt2671;
					local125 = this.method2231(local54, local47, local91, local100, local87, local41 * local111 >> 12);
					local125 = local125 * local28 >> 12;
					arg0[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static434.anInt4326; local102++) {
					local111 = Static280.anIntArray238[local102] * this.anInt2671;
					local125 = this.method2231(local54, local47, local91, local100, local87, local111 * local41 >> 12);
					arg0[local102] = local28 * local125 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray39[0];
		if (local28 > 8 || local28 < -8) {
			local41 = this.aShortArray40[0] << 12;
			local47 = local41 * local17 >> 12;
			local54 = this.anInt2671 * local41 >> 12;
			local61 = this.anInt2673 * local41 >> 12;
			local65 = local47 >> 12;
			local69 = local65 + 1;
			local47 &= 0xFFF;
			if (local69 >= local61) {
				local69 = 0;
			}
			local87 = this.aByteArray25[local65 & 0xFF] & 0xFF;
			local91 = Class123.anIntArray166[local47];
			local100 = this.aByteArray25[local69 & 0xFF] & 0xFF;
			for (local102 = 0; local102 < Static434.anInt4326; local102++) {
				local111 = Static280.anIntArray238[local102] * this.anInt2671;
				local125 = this.method2231(local54, local47, local91, local100, local87, local41 * local111 >> 12);
				arg0[local102] = local125 * local28 >> 12;
			}
		}
		for (@Pc(143) int local143 = 1; local143 < this.anInt2669; local143++) {
			local28 = this.aShortArray39[local143];
			if (local28 > 8 || local28 < -8) {
				local41 = this.aShortArray40[local143] << 12;
				local54 = this.anInt2671 * local41 >> 12;
				local47 = local41 * local17 >> 12;
				local61 = local41 * this.anInt2673 >> 12;
				local65 = local47 >> 12;
				local69 = local65 + 1;
				local47 &= 0xFFF;
				if (local69 >= local61) {
					local69 = 0;
				}
				local100 = this.aByteArray25[local69 & 0xFF] & 0xFF;
				local87 = this.aByteArray25[local65 & 0xFF] & 0xFF;
				local91 = Class123.anIntArray166[local47];
				if (this.aBoolean213 && this.anInt2669 - 1 == local143) {
					for (local102 = 0; local102 < Static434.anInt4326; local102++) {
						local111 = this.anInt2671 * Static280.anIntArray238[local102];
						local125 = this.method2231(local54, local47, local91, local100, local87, local41 * local111 >> 12);
						local125 = arg0[local102] + (local125 * local28 >> 12);
						arg0[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static434.anInt4326; local102++) {
						local111 = this.anInt2671 * Static280.anIntArray238[local102];
						local125 = this.method2231(local54, local47, local91, local100, local87, local41 * local111 >> 12);
						arg0[local102] += local28 * local125 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			this.method2234(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		this.aByteArray25 = Static143.method1881(this.anInt2678);
		this.method2232();
		for (@Pc(24) int local24 = this.anInt2669 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray39[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt2669--;
		}
	}
}
