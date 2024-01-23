import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class1_Sub4_Sub20 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!jk", name = "bb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	public int anInt2665 = 0;

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
	public int anInt2663 = 4;

	@OriginalMember(owner = "client!jk", name = "R", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
	public int anInt2668 = 4;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "[B")
	private byte[] aByteArray31 = new byte[512];

	@OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
	public int anInt2673 = 1638;

	@OriginalMember(owner = "client!jk", name = "cb", descriptor = "I")
	public int anInt2676 = 4;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		this.aByteArray31 = Static47.method897(this.anInt2665);
		this.method2317();
		for (@Pc(25) int local25 = this.anInt2668 - 1; local25 >= 1; local25--) {
			@Pc(35) short local35 = this.aShortArray47[local25];
			if (local35 > 8 || local35 < -8) {
				break;
			}
			this.anInt2668--;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			this.method2318(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	private void method2317() {
		@Pc(28) int local28;
		if (this.anInt2673 > 0) {
			this.aShortArray46 = new short[this.anInt2668];
			this.aShortArray47 = new short[this.anInt2668];
			for (local28 = 0; local28 < this.anInt2668; local28++) {
				this.aShortArray47[local28] = (short) (Math.pow((double) ((float) this.anInt2673 / 4096.0F), (double) local28) * 4096.0D);
				this.aShortArray46[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		} else if (this.aShortArray47 != null && this.aShortArray47.length == this.anInt2668) {
			this.aShortArray46 = new short[this.anInt2668];
			for (local28 = 0; local28 < this.anInt2668; local28++) {
				this.aShortArray46[local28] = (short) Math.pow(2.0D, (double) local28);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[II)V")
	public void method2318(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(12) int local12 = Static250.anIntArray398[arg0] * this.anInt2676;
		@Pc(117) int local117;
		@Pc(131) int local131;
		@Pc(45) int local45;
		@Pc(29) short local29;
		@Pc(107) int local107;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(52) int local52;
		@Pc(77) int local77;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (this.anInt2668 == 1) {
			local45 = this.aShortArray46[0] << 12;
			local52 = this.anInt2676 * local45 >> 12;
			local65 = this.anInt2663 * local45 >> 12;
			local29 = this.aShortArray47[0];
			local58 = local12 * local45 >> 12;
			local69 = local58 >> 12;
			local81 = local69 + 1;
			local96 = this.aByteArray31[local69 & 0xFF] & 0xFF;
			if (local52 <= local81) {
				local81 = 0;
			}
			local105 = this.aByteArray31[local81 & 0xFF] & 0xFF;
			local58 &= 0xFFF;
			local77 = Class77.anIntArray216[local58];
			if (this.aBoolean167) {
				for (local107 = 0; local107 < Static182.anInt3492; local107++) {
					local117 = this.anInt2663 * Static279.anIntArray454[local107];
					local131 = this.method2319(local105, local65, local45 * local117 >> 12, local96, local58, local77);
					local131 = local29 * local131 >> 12;
					arg1[local107] = (local131 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static182.anInt3492; local107++) {
					local117 = Static279.anIntArray454[local107] * this.anInt2663;
					local131 = this.method2319(local105, local65, local45 * local117 >> 12, local96, local58, local77);
					arg1[local107] = local131 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray47[0];
		if (local29 > 8 || local29 < -8) {
			local45 = this.aShortArray46[0] << 12;
			local52 = this.anInt2676 * local45 >> 12;
			local58 = local45 * local12 >> 12;
			local65 = this.anInt2663 * local45 >> 12;
			local69 = local58 >> 12;
			@Pc(73) int local73 = local58 & 0xFFF;
			local77 = Class77.anIntArray216[local73];
			local81 = local69 + 1;
			if (local52 <= local81) {
				local81 = 0;
			}
			local96 = this.aByteArray31[local69 & 0xFF] & 0xFF;
			local105 = this.aByteArray31[local81 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static182.anInt3492; local107++) {
				local117 = this.anInt2663 * Static279.anIntArray454[local107];
				local131 = this.method2319(local105, local65, local45 * local117 >> 12, local96, local73, local77);
				arg1[local107] = local131 * local29 >> 12;
			}
		}
		for (@Pc(144) int local144 = 1; local144 < this.anInt2668; local144++) {
			local29 = this.aShortArray47[local144];
			if (local29 > 8 || local29 < -8) {
				local45 = this.aShortArray46[local144] << 12;
				local65 = local45 * this.anInt2663 >> 12;
				local52 = local45 * this.anInt2676 >> 12;
				local58 = local12 * local45 >> 12;
				local69 = local58 >> 12;
				local96 = this.aByteArray31[local69 & 0xFF] & 0xFF;
				local58 &= 0xFFF;
				local81 = local69 + 1;
				local77 = Class77.anIntArray216[local58];
				if (local81 >= local52) {
					local81 = 0;
				}
				local105 = this.aByteArray31[local81 & 0xFF] & 0xFF;
				if (this.aBoolean167 && this.anInt2668 - 1 == local144) {
					for (local107 = 0; local107 < Static182.anInt3492; local107++) {
						local117 = this.anInt2663 * Static279.anIntArray454[local107];
						local131 = this.method2319(local105, local65, local45 * local117 >> 12, local96, local58, local77);
						local131 = (local29 * local131 >> 12) + arg1[local107];
						arg1[local107] = (local131 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static182.anInt3492; local107++) {
						local117 = this.anInt2663 * Static279.anIntArray454[local107];
						local131 = this.method2319(local105, local65, local45 * local117 >> 12, local96, local58, local77);
						arg1[local107] += local29 * local131 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIII)I")
	private int method2319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg2 >> 12;
		@Pc(19) int local19 = arg2 & 0xFFF;
		@Pc(23) int local23 = local19 - 4096;
		@Pc(27) int local27 = Class77.anIntArray216[local19];
		@Pc(31) int local31 = local15 + 1;
		@Pc(35) int local35 = local15 & 0xFF;
		if (local31 >= arg1) {
			local31 = 0;
		}
		local31 &= 0xFF;
		@Pc(54) int local54 = this.aByteArray31[arg3 + local35] & 0x3;
		@Pc(58) int local58 = arg4 - 4096;
		@Pc(77) int local77;
		if (local54 > 1) {
			local77 = local54 == 2 ? local19 - arg4 : -local19 + -arg4;
		} else {
			local77 = local54 == 0 ? arg4 + local19 : arg4 + -local19;
		}
		local54 = this.aByteArray31[arg3 + local31] & 0x3;
		@Pc(120) int local120;
		if (local54 > 1) {
			local120 = local54 == 2 ? local23 - arg4 : -arg4 + -local23;
		} else {
			local120 = local54 == 0 ? local23 + arg4 : arg4 + -local23;
		}
		local54 = this.aByteArray31[local35 + arg0] & 0x3;
		@Pc(155) int local155 = ((local120 - local77) * local27 >> 12) + local77;
		if (local54 <= 1) {
			local77 = local54 == 0 ? local58 + local19 : -local19 + local58;
		} else {
			local77 = local54 == 2 ? local19 - local58 : -local19 - local58;
		}
		local54 = this.aByteArray31[local31 + arg0] & 0x3;
		if (local54 > 1) {
			local120 = local54 == 2 ? local23 - local58 : -local23 + -local58;
		} else {
			local120 = local54 == 0 ? local23 + local58 : local58 + -local23;
		}
		@Pc(241) int local241 = local77 + ((local120 - local77) * local27 >> 12);
		return local155 + ((local241 - local155) * arg5 >> 12);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean167 = arg0.method1378() == 1;
		} else if (arg1 == 1) {
			this.anInt2668 = arg0.method1378();
		} else if (arg1 == 2) {
			this.anInt2673 = arg0.method1356();
			if (this.anInt2673 < 0) {
				this.aShortArray47 = new short[this.anInt2668];
				for (@Pc(81) int local81 = 0; local81 < this.anInt2668; local81++) {
					this.aShortArray47[local81] = (short) arg0.method1356();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2663 = this.anInt2676 = arg0.method1378();
		} else if (arg1 == 4) {
			this.anInt2665 = arg0.method1378();
		} else if (arg1 == 5) {
			this.anInt2663 = arg0.method1378();
		} else if (arg1 == 6) {
			this.anInt2676 = arg0.method1378();
		}
	}
}
