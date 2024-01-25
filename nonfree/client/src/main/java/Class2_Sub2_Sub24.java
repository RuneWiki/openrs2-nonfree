import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "[B")
	private byte[] aByteArray53 = new byte[512];

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
	public int anInt4591 = 4;

	@OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
	public int anInt4594 = 4;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	public int anInt4593 = 1638;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "Z")
	public boolean aBoolean327 = true;

	@OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
	public int anInt4600 = 0;

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
	public int anInt4599 = 4;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			this.method3744(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		this.aByteArray53 = Static308.method4223(this.anInt4600);
		this.method3743();
		for (@Pc(19) int local19 = this.anInt4594 - 1; local19 >= 1; local19--) {
			@Pc(32) short local32 = this.aShortArray40[local19];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt4594--;
		}
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
	private void method3743() {
		@Pc(17) int local17;
		if (this.anInt4593 > 0) {
			this.aShortArray39 = new short[this.anInt4594];
			this.aShortArray40 = new short[this.anInt4594];
			for (local17 = 0; local17 < this.anInt4594; local17++) {
				this.aShortArray40[local17] = (short) (Math.pow((double) ((float) this.anInt4593 / 4096.0F), (double) local17) * 4096.0D);
				this.aShortArray39[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		} else if (this.aShortArray40 != null && this.anInt4594 == this.aShortArray40.length) {
			this.aShortArray39 = new short[this.anInt4594];
			for (local17 = 0; local17 < this.anInt4594; local17++) {
				this.aShortArray39[local17] = (short) Math.pow(2.0D, (double) local17);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[II)V")
	public void method3744(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt4591 * Static405.anIntArray555[arg1];
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(46) int local46;
		@Pc(31) short local31;
		@Pc(111) int local111;
		@Pc(52) int local52;
		@Pc(66) int local66;
		@Pc(59) int local59;
		@Pc(100) int local100;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(109) int local109;
		@Pc(96) int local96;
		if (this.anInt4594 == 1) {
			local31 = this.aShortArray40[0];
			local46 = this.aShortArray39[0] << 12;
			local52 = local12 * local46 >> 12;
			local59 = this.anInt4591 * local46 >> 12;
			local66 = local46 * this.anInt4599 >> 12;
			local70 = local52 >> 12;
			local74 = local70 + 1;
			@Pc(397) int local397 = local52 & 0xFFF;
			if (local59 <= local74) {
				local74 = 0;
			}
			local100 = Class2_Sub2_Sub16.anIntArray208[local397];
			local96 = this.aByteArray53[local74 & 0xFF] & 0xFF;
			local109 = this.aByteArray53[local70 & 0xFF] & 0xFF;
			if (this.aBoolean327) {
				for (local111 = 0; local111 < Static217.anInt3574; local111++) {
					local120 = Static145.anIntArray199[local111] * this.anInt4599;
					local134 = this.method3746(local109, local397, local96, local66, local120 * local46 >> 12, local100);
					local134 = local31 * local134 >> 12;
					arg0[local111] = (local134 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static217.anInt3574; local111++) {
					local120 = Static145.anIntArray199[local111] * this.anInt4599;
					local134 = this.method3746(local109, local397, local96, local66, local120 * local46 >> 12, local100);
					arg0[local111] = local134 * local31 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray40[0];
		if (local31 > 8 || local31 < -8) {
			local46 = this.aShortArray39[0] << 12;
			local52 = local12 * local46 >> 12;
			local59 = local46 * this.anInt4591 >> 12;
			local66 = local46 * this.anInt4599 >> 12;
			local70 = local52 >> 12;
			local74 = local70 + 1;
			if (local74 >= local59) {
				local74 = 0;
			}
			local52 &= 0xFFF;
			local96 = this.aByteArray53[local74 & 0xFF] & 0xFF;
			local100 = Class2_Sub2_Sub16.anIntArray208[local52];
			local109 = this.aByteArray53[local70 & 0xFF] & 0xFF;
			for (local111 = 0; local111 < Static217.anInt3574; local111++) {
				local120 = this.anInt4599 * Static145.anIntArray199[local111];
				local134 = this.method3746(local109, local52, local96, local66, local120 * local46 >> 12, local100);
				arg0[local111] = local134 * local31 >> 12;
			}
		}
		for (@Pc(152) int local152 = 1; local152 < this.anInt4594; local152++) {
			local31 = this.aShortArray40[local152];
			if (local31 > 8 || local31 < -8) {
				local46 = this.aShortArray39[local152] << 12;
				local66 = local46 * this.anInt4599 >> 12;
				local59 = local46 * this.anInt4591 >> 12;
				local52 = local12 * local46 >> 12;
				local70 = local52 >> 12;
				local74 = local70 + 1;
				local52 &= 0xFFF;
				if (local59 <= local74) {
					local74 = 0;
				}
				local96 = this.aByteArray53[local74 & 0xFF] & 0xFF;
				local109 = this.aByteArray53[local70 & 0xFF] & 0xFF;
				local100 = Class2_Sub2_Sub16.anIntArray208[local52];
				if (this.aBoolean327 && local152 == this.anInt4594 - 1) {
					for (local111 = 0; local111 < Static217.anInt3574; local111++) {
						local120 = Static145.anIntArray199[local111] * this.anInt4599;
						local134 = this.method3746(local109, local52, local96, local66, local120 * local46 >> 12, local100);
						local134 = (local134 * local31 >> 12) + arg0[local111];
						arg0[local111] = (local134 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static217.anInt3574; local111++) {
						local120 = Static145.anIntArray199[local111] * this.anInt4599;
						local134 = this.method3746(local109, local52, local96, local66, local120 * local46 >> 12, local100);
						arg0[local111] += local31 * local134 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean327 = arg0.method3580() == 1;
		} else if (arg1 == 1) {
			this.anInt4594 = arg0.method3580();
		} else if (arg1 == 2) {
			this.anInt4593 = arg0.method3558();
			if (this.anInt4593 < 0) {
				this.aShortArray40 = new short[this.anInt4594];
				for (@Pc(75) int local75 = 0; local75 < this.anInt4594; local75++) {
					this.aShortArray40[local75] = (short) arg0.method3558();
				}
			}
		} else if (arg1 == 3) {
			this.anInt4599 = this.anInt4591 = arg0.method3580();
		} else if (arg1 == 4) {
			this.anInt4600 = arg0.method3580();
		} else if (arg1 == 5) {
			this.anInt4599 = arg0.method3580();
		} else if (arg1 == 6) {
			this.anInt4591 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)I")
	private int method3746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg4 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (local13 >= arg3) {
			local13 = 0;
		}
		@Pc(34) int local34 = arg1 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local17 - 4096;
		@Pc(51) int local51 = this.aByteArray53[arg0 + local21] & 0x3;
		@Pc(55) int local55 = Class2_Sub2_Sub16.anIntArray208[local17];
		@Pc(70) int local70;
		if (local51 <= 1) {
			local70 = local51 == 0 ? local17 + arg1 : -local17 + arg1;
		} else {
			local70 = local51 == 2 ? local17 - arg1 : -local17 + -arg1;
		}
		local51 = this.aByteArray53[local13 + arg0] & 0x3;
		@Pc(115) int local115;
		if (local51 <= 1) {
			local115 = local51 == 0 ? arg1 + local42 : arg1 - local42;
		} else {
			local115 = local51 == 2 ? local42 - arg1 : -arg1 + -local42;
		}
		@Pc(142) int local142 = local70 + (local55 * (local115 - local70) >> 12);
		local51 = this.aByteArray53[arg2 + local21] & 0x3;
		if (local51 > 1) {
			local70 = local51 == 2 ? local17 - local34 : -local34 + -local17;
		} else {
			local70 = local51 == 0 ? local17 + local34 : local34 + -local17;
		}
		local51 = this.aByteArray53[local13 + arg2] & 0x3;
		if (local51 > 1) {
			local115 = local51 == 2 ? local42 - local34 : -local34 + -local42;
		} else {
			local115 = local51 == 0 ? local34 + local42 : -local42 + local34;
		}
		@Pc(243) int local243 = ((local115 - local70) * local55 >> 12) + local70;
		return ((local243 - local142) * arg5 >> 12) + local142;
	}
}
