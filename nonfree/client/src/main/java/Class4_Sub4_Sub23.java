import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class4_Sub4_Sub23 extends Class4_Sub4 {

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
	public int anInt4293 = 1638;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
	public int anInt4292 = 4;

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "Z")
	public boolean aBoolean357 = true;

	@OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
	public int anInt4290 = 0;

	@OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
	public int anInt4294 = 4;

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "[B")
	private byte[] aByteArray50 = new byte[512];

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "I")
	public int anInt4297 = 4;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	private void method3607() {
		@Pc(21) int local21;
		if (this.anInt4293 > 0) {
			this.aShortArray66 = new short[this.anInt4292];
			this.aShortArray65 = new short[this.anInt4292];
			for (local21 = 0; local21 < this.anInt4292; local21++) {
				this.aShortArray66[local21] = (short) (Math.pow((double) ((float) this.anInt4293 / 4096.0F), (double) local21) * 4096.0D);
				this.aShortArray65[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		} else if (this.aShortArray66 != null && this.anInt4292 == this.aShortArray66.length) {
			this.aShortArray65 = new short[this.anInt4292];
			for (local21 = 0; local21 < this.anInt4292; local21++) {
				this.aShortArray65[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean357 = arg1.method2380() == 1;
		} else if (arg0 == 1) {
			this.anInt4292 = arg1.method2380();
		} else if (arg0 == 2) {
			this.anInt4293 = arg1.method2396();
			if (this.anInt4293 < 0) {
				this.aShortArray66 = new short[this.anInt4292];
				for (@Pc(72) int local72 = 0; local72 < this.anInt4292; local72++) {
					this.aShortArray66[local72] = (short) arg1.method2396();
				}
			}
		} else if (arg0 == 3) {
			this.anInt4294 = this.anInt4297 = arg1.method2380();
		} else if (arg0 == 4) {
			this.anInt4290 = arg1.method2380();
		} else if (arg0 == 5) {
			this.anInt4294 = arg1.method2380();
		} else if (arg0 == 6) {
			this.anInt4297 = arg1.method2380();
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		this.aByteArray50 = Static110.method2038(this.anInt4290);
		this.method3607();
		for (@Pc(19) int local19 = this.anInt4292 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray66[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt4292--;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)I")
	private int method3609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg0) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg4 & 0xFFF;
		@Pc(30) int local30 = local26 - 4096;
		@Pc(34) int local34 = arg1 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = Class4_Sub12.anIntArray497[local26];
		@Pc(51) int local51 = this.aByteArray50[local17 + arg5] & 0x3;
		@Pc(69) int local69;
		if (local51 <= 1) {
			local69 = local51 == 0 ? arg1 + local26 : arg1 - local26;
		} else {
			local69 = local51 == 2 ? local26 - arg1 : -local26 - arg1;
		}
		local51 = this.aByteArray50[arg5 + local13] & 0x3;
		@Pc(113) int local113;
		if (local51 > 1) {
			local113 = local51 == 2 ? local30 - arg1 : -arg1 + -local30;
		} else {
			local113 = local51 == 0 ? arg1 + local30 : arg1 - local30;
		}
		local51 = this.aByteArray50[arg3 + local17] & 0x3;
		@Pc(147) int local147 = (local42 * (local113 - local69) >> 12) + local69;
		if (local51 > 1) {
			local69 = local51 == 2 ? local26 - local34 : -local26 + -local34;
		} else {
			local69 = local51 == 0 ? local34 + local26 : local34 - local26;
		}
		local51 = this.aByteArray50[local13 + arg3] & 0x3;
		if (local51 > 1) {
			local113 = local51 == 2 ? local30 - local34 : -local30 - local34;
		} else {
			local113 = local51 == 0 ? local34 + local30 : -local30 + local34;
		}
		@Pc(244) int local244 = ((local113 - local69) * local42 >> 12) + local69;
		return ((local244 - local147) * arg2 >> 12) + local147;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			this.method3614(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[II)V")
	public void method3614(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static64.anIntArray148[arg1] * this.anInt4297;
		@Pc(120) int local120;
		@Pc(136) int local136;
		@Pc(46) int local46;
		@Pc(29) short local29;
		@Pc(111) int local111;
		@Pc(59) int local59;
		@Pc(53) int local53;
		@Pc(66) int local66;
		@Pc(100) int local100;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(96) int local96;
		@Pc(109) int local109;
		if (this.anInt4292 == 1) {
			local46 = this.aShortArray65[0] << 12;
			local29 = this.aShortArray66[0];
			local53 = this.anInt4294 * local46 >> 12;
			local59 = local46 * local12 >> 12;
			local66 = local46 * this.anInt4297 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			if (local74 >= local66) {
				local74 = 0;
			}
			local59 &= 0xFFF;
			local109 = this.aByteArray50[local74 & 0xFF] & 0xFF;
			local100 = Class4_Sub12.anIntArray497[local59];
			local96 = this.aByteArray50[local70 & 0xFF] & 0xFF;
			if (this.aBoolean357) {
				for (local111 = 0; local111 < Static124.anInt3576; local111++) {
					local120 = Static149.anIntArray298[local111] * this.anInt4294;
					local136 = this.method3609(local53, local59, local100, local109, local120 * local46 >> 12, local96);
					@Pc(490) int local490 = local136 * local29 >> 12;
					arg0[local111] = (local490 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static124.anInt3576; local111++) {
					local120 = this.anInt4294 * Static149.anIntArray298[local111];
					local136 = this.method3609(local53, local59, local100, local109, local46 * local120 >> 12, local96);
					arg0[local111] = local29 * local136 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray66[0];
		if (local29 > 8 || local29 < -8) {
			local46 = this.aShortArray65[0] << 12;
			local53 = this.anInt4294 * local46 >> 12;
			local59 = local46 * local12 >> 12;
			local66 = local46 * this.anInt4297 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			local59 &= 0xFFF;
			if (local66 <= local74) {
				local74 = 0;
			}
			local96 = this.aByteArray50[local70 & 0xFF] & 0xFF;
			local100 = Class4_Sub12.anIntArray497[local59];
			local109 = this.aByteArray50[local74 & 0xFF] & 0xFF;
			for (local111 = 0; local111 < Static124.anInt3576; local111++) {
				local120 = this.anInt4294 * Static149.anIntArray298[local111];
				local136 = this.method3609(local53, local59, local100, local109, local120 * local46 >> 12, local96);
				arg0[local111] = local136 * local29 >> 12;
			}
		}
		for (@Pc(150) int local150 = 1; local150 < this.anInt4292; local150++) {
			local29 = this.aShortArray66[local150];
			if (local29 > 8 || local29 < -8) {
				local46 = this.aShortArray65[local150] << 12;
				local66 = this.anInt4297 * local46 >> 12;
				local59 = local46 * local12 >> 12;
				local53 = this.anInt4294 * local46 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				local59 &= 0xFFF;
				if (local66 <= local74) {
					local74 = 0;
				}
				local96 = this.aByteArray50[local70 & 0xFF] & 0xFF;
				local100 = Class4_Sub12.anIntArray497[local59];
				local109 = this.aByteArray50[local74 & 0xFF] & 0xFF;
				if (this.aBoolean357 && local150 == this.anInt4292 - 1) {
					for (local111 = 0; local111 < Static124.anInt3576; local111++) {
						local120 = Static149.anIntArray298[local111] * this.anInt4294;
						local136 = this.method3609(local53, local59, local100, local109, local120 * local46 >> 12, local96);
						local136 = (local29 * local136 >> 12) + arg0[local111];
						arg0[local111] = (local136 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static124.anInt3576; local111++) {
						local120 = this.anInt4294 * Static149.anIntArray298[local111];
						local136 = this.method3609(local53, local59, local100, local109, local120 * local46 >> 12, local96);
						arg0[local111] += local136 * local29 >> 12;
					}
				}
			}
		}
	}
}
