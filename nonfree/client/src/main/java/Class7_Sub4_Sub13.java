import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class7_Sub4_Sub13 extends Class7_Sub4 {

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt3154 = 4;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt3156 = 0;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
	public int anInt3160 = 4;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "Z")
	public boolean aBoolean238 = true;

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	public int anInt3165 = 4;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "[B")
	private byte[] aByteArray34 = new byte[512];

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
	public int anInt3167 = 1638;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V")
	private void method2910() {
		@Pc(18) int local18;
		if (this.anInt3167 > 0) {
			this.aShortArray50 = new short[this.anInt3165];
			this.aShortArray49 = new short[this.anInt3165];
			for (local18 = 0; local18 < this.anInt3165; local18++) {
				this.aShortArray50[local18] = (short) (Math.pow((double) ((float) this.anInt3167 / 4096.0F), (double) local18) * 4096.0D);
				this.aShortArray49[local18] = (short) Math.pow(2.0D, (double) local18);
			}
		} else if (this.aShortArray50 != null && this.aShortArray50.length == this.anInt3165) {
			this.aShortArray49 = new short[this.anInt3165];
			for (local18 = 0; local18 < this.anInt3165; local18++) {
				this.aShortArray49[local18] = (short) Math.pow(2.0D, (double) local18);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIBIII)I")
	private int method2912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = arg5 & 0xFFF;
		if (arg1 <= local11) {
			local11 = 0;
		}
		local7 &= 0xFF;
		local11 &= 0xFF;
		@Pc(36) int local36 = local15 - 4096;
		@Pc(40) int local40 = arg0 - 4096;
		@Pc(57) int local57 = this.aByteArray34[arg2 + local7] & 0x3;
		@Pc(61) int local61 = Class119.anIntArray460[local15];
		@Pc(78) int local78;
		if (local57 <= 1) {
			local78 = local57 == 0 ? arg0 + local15 : -local15 + arg0;
		} else {
			local78 = local57 == 2 ? local15 - arg0 : -local15 - arg0;
		}
		local57 = this.aByteArray34[local11 + arg2] & 0x3;
		@Pc(122) int local122;
		if (local57 > 1) {
			local122 = local57 == 2 ? local36 - arg0 : -local36 - arg0;
		} else {
			local122 = local57 == 0 ? arg0 + local36 : -local36 + arg0;
		}
		@Pc(148) int local148 = local78 + ((local122 - local78) * local61 >> 12);
		local57 = this.aByteArray34[local7 + arg3] & 0x3;
		if (local57 <= 1) {
			local78 = local57 == 0 ? local40 + local15 : -local15 + local40;
		} else {
			local78 = local57 == 2 ? local15 - local40 : -local15 - local40;
		}
		local57 = this.aByteArray34[arg3 + local11] & 0x3;
		if (local57 <= 1) {
			local122 = local57 == 0 ? local36 + local40 : local40 - local36;
		} else {
			local122 = local57 == 2 ? local36 - local40 : -local40 + -local36;
		}
		@Pc(243) int local243 = local78 + (local61 * (local122 - local78) >> 12);
		return ((local243 - local148) * arg4 >> 12) + local148;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean238 = arg0.method2772() == 1;
		} else if (arg1 == 1) {
			this.anInt3165 = arg0.method2772();
		} else if (arg1 == 2) {
			this.anInt3167 = arg0.method2744();
			if (this.anInt3167 < 0) {
				this.aShortArray50 = new short[this.anInt3165];
				for (@Pc(77) int local77 = 0; local77 < this.anInt3165; local77++) {
					this.aShortArray50[local77] = (short) arg0.method2744();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt3154 = this.anInt3160 = arg0.method2772();
			return;
		} else if (arg1 == 4) {
			this.anInt3156 = arg0.method2772();
			return;
		} else if (arg1 == 5) {
			this.anInt3154 = arg0.method2772();
			return;
		} else if (arg1 == 6) {
			this.anInt3160 = arg0.method2772();
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		this.aByteArray34 = Static74.method1491(this.anInt3156);
		this.method2910();
		for (@Pc(17) int local17 = this.anInt3165 - 1; local17 >= 1; local17--) {
			@Pc(23) short local23 = this.aShortArray50[local17];
			if (local23 > 8 || local23 < -8) {
				break;
			}
			this.anInt3165--;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			this.method2914(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[I)V")
	public void method2914(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(10) int local10 = this.anInt3160 * Static314.anIntArray756[arg0];
		@Pc(117) int local117;
		@Pc(131) int local131;
		@Pc(44) int local44;
		@Pc(27) short local27;
		@Pc(109) int local109;
		@Pc(64) int local64;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(107) int local107;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(94) int local94;
		@Pc(103) int local103;
		if (this.anInt3165 == 1) {
			local27 = this.aShortArray50[0];
			local44 = this.aShortArray49[0] << 12;
			local64 = local10 * local44 >> 12;
			local58 = this.anInt3160 * local44 >> 12;
			local51 = this.anInt3154 * local44 >> 12;
			local68 = local64 >> 12;
			local72 = local68 + 1;
			@Pc(388) int local388 = local64 & 0xFFF;
			if (local72 >= local58) {
				local72 = 0;
			}
			local107 = Class119.anIntArray460[local388];
			local94 = this.aByteArray34[local68 & 0xFF] & 0xFF;
			local103 = this.aByteArray34[local72 & 0xFF] & 0xFF;
			if (this.aBoolean238) {
				for (local109 = 0; local109 < Static201.anInt4174; local109++) {
					local117 = Static129.anIntArray375[local109] * this.anInt3154;
					local131 = this.method2912(local388, local51, local94, local103, local107, local44 * local117 >> 12);
					@Pc(489) int local489 = local27 * local131 >> 12;
					arg1[local109] = (local489 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static201.anInt4174; local109++) {
					local117 = Static129.anIntArray375[local109] * this.anInt3154;
					local131 = this.method2912(local388, local51, local94, local103, local107, local44 * local117 >> 12);
					arg1[local109] = local27 * local131 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray50[0];
		if (local27 > 8 || local27 < -8) {
			local44 = this.aShortArray49[0] << 12;
			local51 = this.anInt3154 * local44 >> 12;
			local58 = local44 * this.anInt3160 >> 12;
			local64 = local10 * local44 >> 12;
			local68 = local64 >> 12;
			local72 = local68 + 1;
			local64 &= 0xFFF;
			if (local72 >= local58) {
				local72 = 0;
			}
			local94 = this.aByteArray34[local68 & 0xFF] & 0xFF;
			local103 = this.aByteArray34[local72 & 0xFF] & 0xFF;
			local107 = Class119.anIntArray460[local64];
			for (local109 = 0; local109 < Static201.anInt4174; local109++) {
				local117 = Static129.anIntArray375[local109] * this.anInt3154;
				local131 = this.method2912(local64, local51, local94, local103, local107, local117 * local44 >> 12);
				arg1[local109] = local27 * local131 >> 12;
			}
		}
		for (@Pc(149) int local149 = 1; local149 < this.anInt3165; local149++) {
			local27 = this.aShortArray50[local149];
			if (local27 > 8 || local27 < -8) {
				local44 = this.aShortArray49[local149] << 12;
				local64 = local44 * local10 >> 12;
				local58 = local44 * this.anInt3160 >> 12;
				local51 = this.anInt3154 * local44 >> 12;
				local68 = local64 >> 12;
				local72 = local68 + 1;
				if (local72 >= local58) {
					local72 = 0;
				}
				local64 &= 0xFFF;
				local107 = Class119.anIntArray460[local64];
				local103 = this.aByteArray34[local72 & 0xFF] & 0xFF;
				local94 = this.aByteArray34[local68 & 0xFF] & 0xFF;
				if (this.aBoolean238 && this.anInt3165 - 1 == local149) {
					for (local109 = 0; local109 < Static201.anInt4174; local109++) {
						local117 = this.anInt3154 * Static129.anIntArray375[local109];
						local131 = this.method2912(local64, local51, local94, local103, local107, local44 * local117 >> 12);
						local131 = (local27 * local131 >> 12) + arg1[local109];
						arg1[local109] = (local131 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static201.anInt4174; local109++) {
						local117 = Static129.anIntArray375[local109] * this.anInt3154;
						local131 = this.method2912(local64, local51, local94, local103, local107, local44 * local117 >> 12);
						arg1[local109] += local131 * local27 >> 12;
					}
				}
			}
		}
	}
}
