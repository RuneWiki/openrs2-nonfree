import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class11_Sub2_Sub20 extends Class11_Sub2 {

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "I")
	public int anInt3416 = 4;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "I")
	public int anInt3422 = 4;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "I")
	public int anInt3421 = 0;

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
	public int anInt3424 = 1638;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "[B")
	private byte[] aByteArray46 = new byte[512];

	@OriginalMember(owner = "client!la", name = "V", descriptor = "I")
	public int anInt3427 = 4;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIB)I")
	private int method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg0 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (arg2 <= local13) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg0 & 0xFFF;
		@Pc(30) int local30 = local26 - 4096;
		@Pc(34) int local34 = arg5 - 4096;
		local13 &= 0xFF;
		@Pc(48) int local48 = Class11_Sub2_Sub29_Sub1.anIntArray384[local26];
		@Pc(58) int local58 = this.aByteArray46[local17 + arg1] & 0x3;
		@Pc(75) int local75;
		if (local58 <= 1) {
			local75 = local58 == 0 ? arg5 + local26 : -local26 + arg5;
		} else {
			local75 = local58 == 2 ? local26 - arg5 : -arg5 + -local26;
		}
		local58 = this.aByteArray46[arg1 + local13] & 0x3;
		@Pc(117) int local117;
		if (local58 > 1) {
			local117 = local58 == 2 ? local30 - arg5 : -local30 - arg5;
		} else {
			local117 = local58 == 0 ? local30 + arg5 : arg5 - local30;
		}
		@Pc(143) int local143 = (local48 * (local117 - local75) >> 12) + local75;
		local58 = this.aByteArray46[local17 + arg3] & 0x3;
		if (local58 <= 1) {
			local75 = local58 == 0 ? local26 + local34 : local34 - local26;
		} else {
			local75 = local58 == 2 ? local26 - local34 : -local26 - local34;
		}
		local58 = this.aByteArray46[arg3 + local13] & 0x3;
		if (local58 > 1) {
			local117 = local58 == 2 ? local30 - local34 : -local30 - local34;
		} else {
			local117 = local58 == 0 ? local34 + local30 : -local30 + local34;
		}
		@Pc(234) int local234 = (local48 * (local117 - local75) >> 12) + local75;
		return local143 + ((local234 - local143) * arg4 >> 12);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean217 = arg0.method5185() == 1;
		} else if (arg1 == 1) {
			this.anInt3422 = arg0.method5185();
		} else if (arg1 == 2) {
			this.anInt3424 = arg0.method5220();
			if (this.anInt3424 < 0) {
				this.aShortArray53 = new short[this.anInt3422];
				for (@Pc(68) int local68 = 0; local68 < this.anInt3422; local68++) {
					this.aShortArray53[local68] = (short) arg0.method5220();
				}
			}
		} else if (arg1 == 3) {
			this.anInt3416 = this.anInt3427 = arg0.method5185();
		} else if (arg1 == 4) {
			this.anInt3421 = arg0.method5185();
		} else if (arg1 == 5) {
			this.anInt3416 = arg0.method5185();
		} else if (arg1 == 6) {
			this.anInt3427 = arg0.method5185();
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V")
	private void method2813() {
		@Pc(32) int local32;
		if (this.anInt3424 > 0) {
			this.aShortArray52 = new short[this.anInt3422];
			this.aShortArray53 = new short[this.anInt3422];
			for (local32 = 0; local32 < this.anInt3422; local32++) {
				this.aShortArray53[local32] = (short) (Math.pow((double) ((float) this.anInt3424 / 4096.0F), (double) local32) * 4096.0D);
				this.aShortArray52[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		} else if (this.aShortArray53 != null && this.anInt3422 == this.aShortArray53.length) {
			this.aShortArray52 = new short[this.anInt3422];
			for (local32 = 0; local32 < this.anInt3422; local32++) {
				this.aShortArray52[local32] = (short) Math.pow(2.0D, (double) local32);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[I)V")
	public void method2814(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static155.anIntArray196[arg0] * this.anInt3427;
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(42) int local42;
		@Pc(27) short local27;
		@Pc(107) int local107;
		@Pc(62) int local62;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(87) int local87;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(105) int local105;
		@Pc(96) int local96;
		if (this.anInt3422 == 1) {
			local42 = this.aShortArray52[0] << 12;
			local27 = this.aShortArray53[0];
			local62 = local42 * local12 >> 12;
			local56 = local42 * this.anInt3416 >> 12;
			local49 = this.anInt3427 * local42 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			@Pc(382) int local382 = local62 & 0xFFF;
			if (local70 >= local49) {
				local70 = 0;
			}
			local87 = Class11_Sub2_Sub29_Sub1.anIntArray384[local382];
			local105 = this.aByteArray46[local66 & 0xFF] & 0xFF;
			local96 = this.aByteArray46[local70 & 0xFF] & 0xFF;
			if (this.aBoolean217) {
				for (local107 = 0; local107 < Static339.anInt6549; local107++) {
					local116 = Static73.anIntArray91[local107] * this.anInt3416;
					local130 = this.method2810(local116 * local42 >> 12, local105, local56, local96, local87, local382);
					@Pc(481) int local481 = local27 * local130 >> 12;
					arg1[local107] = (local481 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static339.anInt6549; local107++) {
					local116 = this.anInt3416 * Static73.anIntArray91[local107];
					local130 = this.method2810(local116 * local42 >> 12, local105, local56, local96, local87, local382);
					arg1[local107] = local130 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray53[0];
		if (local27 > 8 || local27 < -8) {
			local42 = this.aShortArray52[0] << 12;
			local49 = local42 * this.anInt3427 >> 12;
			local56 = local42 * this.anInt3416 >> 12;
			local62 = local12 * local42 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local62 &= 0xFFF;
			local87 = Class11_Sub2_Sub29_Sub1.anIntArray384[local62];
			local96 = this.aByteArray46[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray46[local66 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static339.anInt6549; local107++) {
				local116 = this.anInt3416 * Static73.anIntArray91[local107];
				local130 = this.method2810(local116 * local42 >> 12, local105, local56, local96, local87, local62);
				arg1[local107] = local27 * local130 >> 12;
			}
		}
		for (@Pc(144) int local144 = 1; local144 < this.anInt3422; local144++) {
			local27 = this.aShortArray53[local144];
			if (local27 > 8 || local27 < -8) {
				local42 = this.aShortArray52[local144] << 12;
				local62 = local12 * local42 >> 12;
				local56 = local42 * this.anInt3416 >> 12;
				local49 = this.anInt3427 * local42 >> 12;
				local66 = local62 >> 12;
				local70 = local66 + 1;
				local62 &= 0xFFF;
				if (local70 >= local49) {
					local70 = 0;
				}
				local105 = this.aByteArray46[local66 & 0xFF] & 0xFF;
				local87 = Class11_Sub2_Sub29_Sub1.anIntArray384[local62];
				local96 = this.aByteArray46[local70 & 0xFF] & 0xFF;
				if (this.aBoolean217 && local144 == this.anInt3422 - 1) {
					for (local107 = 0; local107 < Static339.anInt6549; local107++) {
						local116 = this.anInt3416 * Static73.anIntArray91[local107];
						local130 = this.method2810(local116 * local42 >> 12, local105, local56, local96, local87, local62);
						local130 = (local130 * local27 >> 12) + arg1[local107];
						arg1[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static339.anInt6549; local107++) {
						local116 = this.anInt3416 * Static73.anIntArray91[local107];
						local130 = this.method2810(local42 * local116 >> 12, local105, local56, local96, local87, local62);
						arg1[local107] += local27 * local130 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			this.method2814(arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.aByteArray46 = Static209.method3746(this.anInt3421);
		this.method2813();
		for (@Pc(27) int local27 = this.anInt3422 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray53[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt3422--;
		}
	}
}
