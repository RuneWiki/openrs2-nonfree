import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class2_Sub2_Sub28 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pu", name = "bb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!pu", name = "cb", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
	public int anInt5837 = 4;

	@OriginalMember(owner = "client!pu", name = "Q", descriptor = "Z")
	public boolean aBoolean408 = true;

	@OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
	public int anInt5840 = 1638;

	@OriginalMember(owner = "client!pu", name = "U", descriptor = "[B")
	private byte[] aByteArray63 = new byte[512];

	@OriginalMember(owner = "client!pu", name = "T", descriptor = "I")
	public int anInt5844 = 4;

	@OriginalMember(owner = "client!pu", name = "ab", descriptor = "I")
	public int anInt5848 = 4;

	@OriginalMember(owner = "client!pu", name = "eb", descriptor = "I")
	public int anInt5850 = 0;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		this.aByteArray63 = Static240.method3277(this.anInt5850);
		this.method4643();
		for (@Pc(27) int local27 = this.anInt5844 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray83[local27];
			if (local34 > 8 || local34 < -8) {
				return;
			}
			this.anInt5844--;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean408 = arg0.method6138() == 1;
		} else if (arg1 == 1) {
			this.anInt5844 = arg0.method6138();
		} else if (arg1 == 2) {
			this.anInt5840 = arg0.method6149();
			if (this.anInt5840 < 0) {
				this.aShortArray83 = new short[this.anInt5844];
				for (@Pc(68) int local68 = 0; local68 < this.anInt5844; local68++) {
					this.aShortArray83[local68] = (short) arg0.method6149();
				}
			}
		} else if (arg1 == 3) {
			this.anInt5848 = this.anInt5837 = arg0.method6138();
		} else if (arg1 == 4) {
			this.anInt5850 = arg0.method6138();
		} else if (arg1 == 5) {
			this.anInt5848 = arg0.method6138();
		} else if (arg1 == 6) {
			this.anInt5837 = arg0.method6138();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI[I)V")
	public void method4641(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt5837 * Static168.anIntArray524[arg0];
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(46) int local46;
		@Pc(29) short local29;
		@Pc(111) int local111;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(53) int local53;
		@Pc(109) int local109;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(96) int local96;
		@Pc(105) int local105;
		if (this.anInt5844 == 1) {
			local29 = this.aShortArray83[0];
			local46 = this.aShortArray84[0] << 12;
			local66 = local46 * this.anInt5848 >> 12;
			local59 = local12 * local46 >> 12;
			local53 = local46 * this.anInt5837 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			if (local53 <= local74) {
				local74 = 0;
			}
			local59 &= 0xFFF;
			local105 = this.aByteArray63[local74 & 0xFF] & 0xFF;
			local96 = this.aByteArray63[local70 & 0xFF] & 0xFF;
			local109 = Class168.anIntArray389[local59];
			if (this.aBoolean408) {
				for (local111 = 0; local111 < Static398.anInt6955; local111++) {
					local120 = this.anInt5848 * Static427.anIntArray587[local111];
					local134 = this.method4642(local109, local66, local59, local96, local105, local46 * local120 >> 12);
					local134 = local134 * local29 >> 12;
					arg1[local111] = (local134 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static398.anInt6955; local111++) {
					local120 = this.anInt5848 * Static427.anIntArray587[local111];
					local134 = this.method4642(local109, local66, local59, local96, local105, local46 * local120 >> 12);
					arg1[local111] = local134 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray83[0];
		if (local29 > 8 || local29 < -8) {
			local46 = this.aShortArray84[0] << 12;
			local53 = local46 * this.anInt5837 >> 12;
			local59 = local12 * local46 >> 12;
			local66 = this.anInt5848 * local46 >> 12;
			local70 = local59 >> 12;
			local74 = local70 + 1;
			local59 &= 0xFFF;
			if (local74 >= local53) {
				local74 = 0;
			}
			local96 = this.aByteArray63[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray63[local74 & 0xFF] & 0xFF;
			local109 = Class168.anIntArray389[local59];
			for (local111 = 0; local111 < Static398.anInt6955; local111++) {
				local120 = this.anInt5848 * Static427.anIntArray587[local111];
				local134 = this.method4642(local109, local66, local59, local96, local105, local120 * local46 >> 12);
				arg1[local111] = local134 * local29 >> 12;
			}
		}
		for (@Pc(152) int local152 = 1; local152 < this.anInt5844; local152++) {
			local29 = this.aShortArray83[local152];
			if (local29 > 8 || local29 < -8) {
				local46 = this.aShortArray84[local152] << 12;
				local66 = this.anInt5848 * local46 >> 12;
				local53 = local46 * this.anInt5837 >> 12;
				local59 = local12 * local46 >> 12;
				local70 = local59 >> 12;
				local74 = local70 + 1;
				local59 &= 0xFFF;
				if (local74 >= local53) {
					local74 = 0;
				}
				local109 = Class168.anIntArray389[local59];
				local96 = this.aByteArray63[local70 & 0xFF] & 0xFF;
				local105 = this.aByteArray63[local74 & 0xFF] & 0xFF;
				if (this.aBoolean408 && this.anInt5844 - 1 == local152) {
					for (local111 = 0; local111 < Static398.anInt6955; local111++) {
						local120 = this.anInt5848 * Static427.anIntArray587[local111];
						local134 = this.method4642(local109, local66, local59, local96, local105, local46 * local120 >> 12);
						local134 = (local134 * local29 >> 12) + arg1[local111];
						arg1[local111] = (local134 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static398.anInt6955; local111++) {
						local120 = Static427.anIntArray587[local111] * this.anInt5848;
						local134 = this.method4642(local109, local66, local59, local96, local105, local46 * local120 >> 12);
						arg1[local111] += local134 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII)I")
	private int method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg5 & 0xFFF;
		if (arg1 <= local13) {
			local13 = 0;
		}
		@Pc(30) int local30 = local21 - 4096;
		@Pc(40) int local40 = arg2 - 4096;
		local13 &= 0xFF;
		@Pc(48) int local48 = Class168.anIntArray389[local21];
		@Pc(58) int local58 = this.aByteArray63[local17 + arg3] & 0x3;
		@Pc(74) int local74;
		if (local58 > 1) {
			local74 = local58 == 2 ? local21 - arg2 : -arg2 + -local21;
		} else {
			local74 = local58 == 0 ? arg2 + local21 : arg2 - local21;
		}
		local58 = this.aByteArray63[arg3 + local13] & 0x3;
		@Pc(112) int local112;
		if (local58 <= 1) {
			local112 = local58 == 0 ? arg2 + local30 : -local30 + arg2;
		} else {
			local112 = local58 == 2 ? local30 - arg2 : -local30 + -arg2;
		}
		local58 = this.aByteArray63[local17 + arg4] & 0x3;
		@Pc(151) int local151 = (local48 * (local112 - local74) >> 12) + local74;
		if (local58 <= 1) {
			local74 = local58 == 0 ? local40 + local21 : -local21 + local40;
		} else {
			local74 = local58 == 2 ? local21 - local40 : -local40 + -local21;
		}
		local58 = this.aByteArray63[local13 + arg4] & 0x3;
		if (local58 > 1) {
			local112 = local58 == 2 ? local30 - local40 : -local40 + -local30;
		} else {
			local112 = local58 == 0 ? local30 + local40 : -local30 + local40;
		}
		@Pc(235) int local235 = local74 + (local48 * (local112 - local74) >> 12);
		return local151 + ((local235 - local151) * arg0 >> 12);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			this.method4641(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V")
	private void method4643() {
		@Pc(32) int local32;
		if (this.anInt5840 > 0) {
			this.aShortArray84 = new short[this.anInt5844];
			this.aShortArray83 = new short[this.anInt5844];
			for (local32 = 0; local32 < this.anInt5844; local32++) {
				this.aShortArray83[local32] = (short) (Math.pow((double) ((float) this.anInt5840 / 4096.0F), (double) local32) * 4096.0D);
				this.aShortArray84[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		} else if (this.aShortArray83 != null && this.anInt5844 == this.aShortArray83.length) {
			this.aShortArray84 = new short[this.anInt5844];
			for (local32 = 0; local32 < this.anInt5844; local32++) {
				this.aShortArray84[local32] = (short) Math.pow(2.0D, (double) local32);
			}
			return;
		}
	}
}
