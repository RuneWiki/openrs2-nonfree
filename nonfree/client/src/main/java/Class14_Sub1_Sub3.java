import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class14_Sub1_Sub3 extends Class14_Sub1 {

	@OriginalMember(owner = "client!c", name = "J", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!c", name = "N", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!c", name = "E", descriptor = "I")
	public int anInt1419 = 1638;

	@OriginalMember(owner = "client!c", name = "M", descriptor = "I")
	public int anInt1424 = 4;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "[B")
	private byte[] aByteArray20 = new byte[512];

	@OriginalMember(owner = "client!c", name = "S", descriptor = "I")
	public int anInt1428 = 4;

	@OriginalMember(owner = "client!c", name = "O", descriptor = "I")
	public int anInt1425 = 0;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "I")
	public int anInt1421 = 4;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean116 = arg0.method5866() == 1;
		} else if (arg1 == 1) {
			this.anInt1421 = arg0.method5866();
		} else if (arg1 == 2) {
			this.anInt1419 = arg0.method5890();
			if (this.anInt1419 < 0) {
				this.aShortArray12 = new short[this.anInt1421];
				for (@Pc(76) int local76 = 0; local76 < this.anInt1421; local76++) {
					this.aShortArray12[local76] = (short) arg0.method5890();
				}
			}
		} else if (arg1 == 3) {
			this.anInt1424 = this.anInt1428 = arg0.method5866();
		} else if (arg1 == 4) {
			this.anInt1425 = arg0.method5866();
		} else if (arg1 == 5) {
			this.anInt1424 = arg0.method5866();
		} else if (arg1 == 6) {
			this.anInt1428 = arg0.method5866();
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	private void method1226() {
		@Pc(19) int local19;
		if (this.anInt1419 > 0) {
			this.aShortArray12 = new short[this.anInt1421];
			this.aShortArray13 = new short[this.anInt1421];
			for (local19 = 0; local19 < this.anInt1421; local19++) {
				this.aShortArray12[local19] = (short) (int) (Math.pow((double) ((float) this.anInt1419 / 4096.0F), (double) local19) * 4096.0D);
				this.aShortArray13[local19] = (short) (int) Math.pow(2.0D, (double) local19);
			}
		} else if (this.aShortArray12 != null && this.aShortArray12.length == this.anInt1421) {
			this.aShortArray13 = new short[this.anInt1421];
			for (local19 = 0; local19 < this.anInt1421; local19++) {
				this.aShortArray13[local19] = (short) (int) Math.pow(2.0D, (double) local19);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIIIII)I")
	private int method1228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg2) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg5 & 0xFFF;
		local9 &= 0xFF;
		@Pc(34) int local34 = arg3 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local26 - 4096;
		@Pc(46) int local46 = Class14_Sub27_Sub2.anIntArray430[local26];
		@Pc(55) int local55 = this.aByteArray20[local9 + arg1] & 0x3;
		@Pc(72) int local72;
		if (local55 > 1) {
			local72 = local55 == 2 ? local26 - arg3 : -local26 + -arg3;
		} else {
			local72 = local55 == 0 ? local26 + arg3 : -local26 + arg3;
		}
		local55 = this.aByteArray20[local13 + arg1] & 0x3;
		@Pc(114) int local114;
		if (local55 <= 1) {
			local114 = local55 == 0 ? arg3 + local42 : arg3 + -local42;
		} else {
			local114 = local55 == 2 ? local42 - arg3 : -local42 - arg3;
		}
		local55 = this.aByteArray20[local9 + arg4] & 0x3;
		@Pc(155) int local155 = local72 + ((local114 - local72) * local46 >> 12);
		if (local55 <= 1) {
			local72 = local55 == 0 ? local34 + local26 : local34 + -local26;
		} else {
			local72 = local55 == 2 ? local26 - local34 : -local26 - local34;
		}
		local55 = this.aByteArray20[local13 + arg4] & 0x3;
		if (local55 <= 1) {
			local114 = local55 == 0 ? local42 + local34 : local34 - local42;
		} else {
			local114 = local55 == 2 ? local42 - local34 : -local34 + -local42;
		}
		@Pc(238) int local238 = ((local114 - local72) * local46 >> 12) + local72;
		return local155 + ((local238 - local155) * arg0 >> 12);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			this.method1229(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[I)V")
	public void method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt1428 * Static336.anIntArray458[arg0];
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(42) int local42;
		@Pc(25) short local25;
		@Pc(107) int local107;
		@Pc(62) int local62;
		@Pc(56) int local56;
		@Pc(49) int local49;
		@Pc(87) int local87;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(105) int local105;
		@Pc(96) int local96;
		if (this.anInt1421 == 1) {
			local25 = this.aShortArray12[0];
			local42 = this.aShortArray13[0] << 12;
			local56 = local42 * this.anInt1424 >> 12;
			local49 = this.anInt1428 * local42 >> 12;
			local62 = local42 * local12 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local62 &= 0xFFF;
			local87 = Class14_Sub27_Sub2.anIntArray430[local62];
			local105 = this.aByteArray20[local66 & 0xFF] & 0xFF;
			local96 = this.aByteArray20[local70 & 0xFF] & 0xFF;
			if (this.aBoolean116) {
				for (local107 = 0; local107 < Static371.anInt6835; local107++) {
					local116 = Static160.anIntArray258[local107] * this.anInt1424;
					local130 = this.method1228(local87, local105, local56, local62, local96, local42 * local116 >> 12);
					local130 = local25 * local130 >> 12;
					arg1[local107] = (local130 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static371.anInt6835; local107++) {
					local116 = this.anInt1424 * Static160.anIntArray258[local107];
					local130 = this.method1228(local87, local105, local56, local62, local96, local116 * local42 >> 12);
					arg1[local107] = local130 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray12[0];
		if (local25 > 8 || local25 < -8) {
			local42 = this.aShortArray13[0] << 12;
			local49 = local42 * this.anInt1428 >> 12;
			local56 = this.anInt1424 * local42 >> 12;
			local62 = local42 * local12 >> 12;
			local66 = local62 >> 12;
			local70 = local66 + 1;
			if (local70 >= local49) {
				local70 = 0;
			}
			local62 &= 0xFFF;
			local87 = Class14_Sub27_Sub2.anIntArray430[local62];
			local96 = this.aByteArray20[local70 & 0xFF] & 0xFF;
			local105 = this.aByteArray20[local66 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static371.anInt6835; local107++) {
				local116 = Static160.anIntArray258[local107] * this.anInt1424;
				local130 = this.method1228(local87, local105, local56, local62, local96, local42 * local116 >> 12);
				arg1[local107] = local130 * local25 >> 12;
			}
		}
		for (@Pc(144) int local144 = 1; local144 < this.anInt1421; local144++) {
			local25 = this.aShortArray12[local144];
			if (local25 > 8 || local25 < -8) {
				local42 = this.aShortArray13[local144] << 12;
				local56 = local42 * this.anInt1424 >> 12;
				local62 = local12 * local42 >> 12;
				local49 = this.anInt1428 * local42 >> 12;
				local66 = local62 >> 12;
				local70 = local66 + 1;
				if (local49 <= local70) {
					local70 = 0;
				}
				local62 &= 0xFFF;
				local105 = this.aByteArray20[local66 & 0xFF] & 0xFF;
				local96 = this.aByteArray20[local70 & 0xFF] & 0xFF;
				local87 = Class14_Sub27_Sub2.anIntArray430[local62];
				if (this.aBoolean116 && local144 == this.anInt1421 - 1) {
					for (local107 = 0; local107 < Static371.anInt6835; local107++) {
						local116 = Static160.anIntArray258[local107] * this.anInt1424;
						local130 = this.method1228(local87, local105, local56, local62, local96, local116 * local42 >> 12);
						local130 = (local130 * local25 >> 12) + arg1[local107];
						arg1[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static371.anInt6835; local107++) {
						local116 = this.anInt1424 * Static160.anIntArray258[local107];
						local130 = this.method1228(local87, local105, local56, local62, local96, local116 * local42 >> 12);
						arg1[local107] += local25 * local130 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		this.aByteArray20 = Static411.method6080(this.anInt1425);
		this.method1226();
		for (@Pc(23) int local23 = this.anInt1421 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray12[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt1421--;
		}
	}
}
