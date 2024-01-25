import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "[S")
	private short[] aShortArray119;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
	public int anInt5938 = 0;

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "[B")
	private byte[] aByteArray79 = new byte[512];

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
	public int anInt5937 = 4;

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
	public int anInt5942 = 4;

	@OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
	public int anInt5941 = 4;

	@OriginalMember(owner = "client!rk", name = "bb", descriptor = "Z")
	public boolean aBoolean514 = true;

	@OriginalMember(owner = "client!rk", name = "W", descriptor = "I")
	public int anInt5945 = 1638;

	static {
		new Class189("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean514 = arg0.method2582() == 1;
		} else if (arg1 == 1) {
			this.anInt5941 = arg0.method2582();
		} else if (arg1 == 2) {
			this.anInt5945 = arg0.method2641();
			if (this.anInt5945 < 0) {
				this.aShortArray120 = new short[this.anInt5941];
				for (@Pc(70) int local70 = 0; local70 < this.anInt5941; local70++) {
					this.aShortArray120[local70] = (short) arg0.method2641();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5942 = this.anInt5937 = arg0.method2582();
		} else if (arg1 == 4) {
			this.anInt5938 = arg0.method2582();
		} else if (arg1 == 5) {
			this.anInt5942 = arg0.method2582();
		} else if (arg1 == 6) {
			this.anInt5937 = arg0.method2582();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[IB)V")
	public void method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(10) int local10 = this.anInt5937 * Static441.anIntArray522[arg0];
		@Pc(103) int local103;
		@Pc(117) int local117;
		@Pc(34) int local34;
		@Pc(19) short local19;
		@Pc(95) int local95;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(75) int local75;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(93) int local93;
		@Pc(84) int local84;
		if (this.anInt5941 == 1) {
			local34 = this.aShortArray119[0] << 12;
			local19 = this.aShortArray120[0];
			local40 = local34 * local10 >> 12;
			local54 = local34 * this.anInt5937 >> 12;
			local47 = this.anInt5942 * local34 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			local40 &= 0xFFF;
			if (local62 >= local54) {
				local62 = 0;
			}
			local93 = this.aByteArray79[local58 & 0xFF] & 0xFF;
			local75 = Class3_Sub2_Sub23.anIntArray363[local40];
			local84 = this.aByteArray79[local62 & 0xFF] & 0xFF;
			if (this.aBoolean514) {
				for (local95 = 0; local95 < Static406.anInt6694; local95++) {
					local103 = Static86.anIntArray125[local95] * this.anInt5942;
					local117 = this.method4644(local40, local93, local75, local103 * local34 >> 12, local47, local84);
					local117 = local117 * local19 >> 12;
					arg1[local95] = (local117 >> 1) + 2048;
				}
			} else {
				for (local95 = 0; local95 < Static406.anInt6694; local95++) {
					local103 = Static86.anIntArray125[local95] * this.anInt5942;
					local117 = this.method4644(local40, local93, local75, local34 * local103 >> 12, local47, local84);
					arg1[local95] = local19 * local117 >> 12;
				}
			}
			return;
		}
		local19 = this.aShortArray120[0];
		if (local19 > 8 || local19 < -8) {
			local34 = this.aShortArray119[0] << 12;
			local40 = local10 * local34 >> 12;
			local47 = local34 * this.anInt5942 >> 12;
			local54 = this.anInt5937 * local34 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			@Pc(66) int local66 = local40 & 0xFFF;
			if (local62 >= local54) {
				local62 = 0;
			}
			local75 = Class3_Sub2_Sub23.anIntArray363[local66];
			local84 = this.aByteArray79[local62 & 0xFF] & 0xFF;
			local93 = this.aByteArray79[local58 & 0xFF] & 0xFF;
			for (local95 = 0; local95 < Static406.anInt6694; local95++) {
				local103 = this.anInt5942 * Static86.anIntArray125[local95];
				local117 = this.method4644(local66, local93, local75, local103 * local34 >> 12, local47, local84);
				arg1[local95] = local117 * local19 >> 12;
			}
		}
		for (@Pc(135) int local135 = 1; local135 < this.anInt5941; local135++) {
			local19 = this.aShortArray120[local135];
			if (local19 > 8 || local19 < -8) {
				local34 = this.aShortArray119[local135] << 12;
				local40 = local34 * local10 >> 12;
				local54 = local34 * this.anInt5937 >> 12;
				local47 = local34 * this.anInt5942 >> 12;
				local58 = local40 >> 12;
				local62 = local58 + 1;
				local40 &= 0xFFF;
				if (local62 >= local54) {
					local62 = 0;
				}
				local84 = this.aByteArray79[local62 & 0xFF] & 0xFF;
				local93 = this.aByteArray79[local58 & 0xFF] & 0xFF;
				local75 = Class3_Sub2_Sub23.anIntArray363[local40];
				if (this.aBoolean514 && this.anInt5941 - 1 == local135) {
					for (local95 = 0; local95 < Static406.anInt6694; local95++) {
						local103 = this.anInt5942 * Static86.anIntArray125[local95];
						local117 = this.method4644(local40, local93, local75, local103 * local34 >> 12, local47, local84);
						local117 = (local117 * local19 >> 12) + arg1[local95];
						arg1[local95] = (local117 >> 1) + 2048;
					}
				} else {
					for (local95 = 0; local95 < Static406.anInt6694; local95++) {
						local103 = this.anInt5942 * Static86.anIntArray125[local95];
						local117 = this.method4644(local40, local93, local75, local34 * local103 >> 12, local47, local84);
						arg1[local95] += local19 * local117 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIBII)I")
	private int method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = local7 & 0xFF;
		if (arg4 <= local11) {
			local11 = 0;
		}
		@Pc(28) int local28 = arg3 & 0xFFF;
		local11 &= 0xFF;
		@Pc(36) int local36 = arg0 - 4096;
		@Pc(40) int local40 = local28 - 4096;
		@Pc(49) int local49 = this.aByteArray79[local15 + arg1] & 0x3;
		@Pc(53) int local53 = Class3_Sub2_Sub23.anIntArray363[local28];
		@Pc(72) int local72;
		if (local49 > 1) {
			local72 = local49 == 2 ? local28 - arg0 : -arg0 + -local28;
		} else {
			local72 = local49 == 0 ? arg0 + local28 : -local28 + arg0;
		}
		local49 = this.aByteArray79[arg1 + local11] & 0x3;
		@Pc(112) int local112;
		if (local49 > 1) {
			local112 = local49 == 2 ? local40 - arg0 : -arg0 + -local40;
		} else {
			local112 = local49 == 0 ? local40 + arg0 : arg0 + -local40;
		}
		@Pc(138) int local138 = local72 + ((local112 - local72) * local53 >> 12);
		local49 = this.aByteArray79[arg5 + local15] & 0x3;
		if (local49 > 1) {
			local72 = local49 == 2 ? local28 - local36 : -local36 + -local28;
		} else {
			local72 = local49 == 0 ? local36 + local28 : local36 + -local28;
		}
		local49 = this.aByteArray79[arg5 + local11] & 0x3;
		if (local49 > 1) {
			local112 = local49 == 2 ? local40 - local36 : -local40 + -local36;
		} else {
			local112 = local49 == 0 ? local36 + local40 : local36 - local40;
		}
		@Pc(235) int local235 = (local53 * (local112 - local72) >> 12) + local72;
		return ((local235 - local138) * arg2 >> 12) + local138;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			this.method4643(arg0, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
	private void method4645() {
		@Pc(17) int local17;
		if (this.anInt5945 > 0) {
			this.aShortArray119 = new short[this.anInt5941];
			this.aShortArray120 = new short[this.anInt5941];
			for (local17 = 0; local17 < this.anInt5941; local17++) {
				this.aShortArray120[local17] = (short) (Math.pow((double) ((float) this.anInt5945 / 4096.0F), (double) local17) * 4096.0D);
				this.aShortArray119[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		} else if (this.aShortArray120 != null && this.anInt5941 == this.aShortArray120.length) {
			this.aShortArray119 = new short[this.anInt5941];
			for (local17 = 0; local17 < this.anInt5941; local17++) {
				this.aShortArray119[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		this.aByteArray79 = Static436.method5722(this.anInt5938);
		this.method4645();
		for (@Pc(23) int local23 = this.anInt5941 - 1; local23 >= 1; local23--) {
			@Pc(29) short local29 = this.aShortArray120[local23];
			if (local29 > 8) {
				return;
			}
			if (local29 < -8) {
				return;
			}
			this.anInt5941--;
		}
	}
}
