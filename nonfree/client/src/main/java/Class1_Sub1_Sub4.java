import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "[B")
	private byte[] aByteArray1 = new byte[512];

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "Z")
	private boolean aBoolean34 = true;

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
	private int anInt357 = 0;

	@OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
	private int anInt362 = 4;

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	private int anInt356 = 4;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
	private int anInt355 = 1638;

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "I")
	private int anInt365 = 4;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(26) int local26 = this.anInt362 * Static193.anIntArray277[arg0];
			@Pc(119) int local119;
			@Pc(133) int local133;
			@Pc(37) int local37;
			@Pc(52) short local52;
			@Pc(110) int local110;
			@Pc(43) int local43;
			@Pc(59) int local59;
			@Pc(66) int local66;
			@Pc(78) int local78;
			@Pc(47) int local47;
			@Pc(74) int local74;
			@Pc(105) int local105;
			@Pc(96) int local96;
			if (this.anInt365 == 1) {
				local37 = this.aShortArray2[0] << 12;
				local43 = local37 * local26 >> 12;
				local47 = local43 >> 12;
				local52 = this.aShortArray1[0];
				local59 = local37 * this.anInt356 >> 12;
				local66 = local37 * this.anInt362 >> 12;
				@Pc(70) int local70 = local43 & 0xFFF;
				local74 = local47 + 1;
				local78 = Class53.anIntArray164[local70];
				if (local74 >= local66) {
					local74 = 0;
				}
				local96 = this.aByteArray1[local74 & 0xFF] & 0xFF;
				local105 = this.aByteArray1[local47 & 0xFF] & 0xFF;
				if (this.aBoolean34) {
					for (local110 = 0; local110 < Static107.anInt2321; local110++) {
						local119 = Static204.anIntArray179[local110] * this.anInt356;
						local133 = this.method232(local70, local119 * local37 >> 12, local78, local96, local59, local105);
						local133 = local52 * local133 >> 12;
						local11[local110] = (local133 >> 1) + 2048;
					}
				} else {
					for (local110 = 0; local110 < Static107.anInt2321; local110++) {
						local119 = this.anInt356 * Static204.anIntArray179[local110];
						local133 = this.method232(local70, local37 * local119 >> 12, local78, local96, local59, local105);
						local11[local110] = local133 * local52 >> 12;
					}
				}
			} else {
				local52 = this.aShortArray1[0];
				if (local52 > 8 || local52 < -8) {
					local37 = this.aShortArray2[0] << 12;
					local66 = this.anInt362 * local37 >> 12;
					local59 = local37 * this.anInt356 >> 12;
					local43 = local26 * local37 >> 12;
					local47 = local43 >> 12;
					local105 = this.aByteArray1[local47 & 0xFF] & 0xFF;
					local74 = local47 + 1;
					local43 &= 0xFFF;
					local78 = Class53.anIntArray164[local43];
					if (local66 <= local74) {
						local74 = 0;
					}
					local96 = this.aByteArray1[local74 & 0xFF] & 0xFF;
					for (local110 = 0; local110 < Static107.anInt2321; local110++) {
						local119 = this.anInt356 * Static204.anIntArray179[local110];
						local133 = this.method232(local43, local119 * local37 >> 12, local78, local96, local59, local105);
						local11[local110] = local133 * local52 >> 12;
					}
				}
				for (@Pc(310) int local310 = 1; local310 < this.anInt365; local310++) {
					local52 = this.aShortArray1[local310];
					if (local52 > 8 || local52 < -8) {
						local37 = this.aShortArray2[local310] << 12;
						local66 = this.anInt362 * local37 >> 12;
						local43 = local26 * local37 >> 12;
						local59 = this.anInt356 * local37 >> 12;
						local47 = local43 >> 12;
						local74 = local47 + 1;
						local105 = this.aByteArray1[local47 & 0xFF] & 0xFF;
						local43 &= 0xFFF;
						if (local66 <= local74) {
							local74 = 0;
						}
						local96 = this.aByteArray1[local74 & 0xFF] & 0xFF;
						local78 = Class53.anIntArray164[local43];
						if (this.aBoolean34 && local310 == this.anInt365 - 1) {
							for (local110 = 0; local110 < Static107.anInt2321; local110++) {
								local119 = Static204.anIntArray179[local110] * this.anInt356;
								local133 = this.method232(local43, local37 * local119 >> 12, local78, local96, local59, local105);
								local133 = (local133 * local52 >> 12) + local11[local110];
								local11[local110] = (local133 >> 1) + 2048;
							}
						} else {
							for (local110 = 0; local110 < Static107.anInt2321; local110++) {
								local119 = this.anInt356 * Static204.anIntArray179[local110];
								local133 = this.method232(local43, local37 * local119 >> 12, local78, local96, local59, local105);
								local11[local110] += local52 * local133 >> 12;
							}
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
	private void method230() {
		@Pc(32) int local32;
		if (this.anInt355 > 0) {
			this.aShortArray1 = new short[this.anInt365];
			this.aShortArray2 = new short[this.anInt365];
			for (local32 = 0; local32 < this.anInt365; local32++) {
				this.aShortArray1[local32] = (short) (Math.pow((double) ((float) this.anInt355 / 4096.0F), (double) local32) * 4096.0D);
				this.aShortArray2[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		} else if (this.aShortArray1 != null && this.aShortArray1.length == this.anInt365) {
			this.aShortArray2 = new short[this.anInt365];
			for (local32 = 0; local32 < this.anInt365; local32++) {
				this.aShortArray2[local32] = (short) Math.pow(2.0D, (double) local32);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIZ)I")
	private int method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg0 - 4096;
		@Pc(13) int local13 = arg1 >> 12;
		@Pc(17) int local17 = local13 + 1;
		@Pc(21) int local21 = arg1 & 0xFFF;
		@Pc(25) int local25 = local13 & 0xFF;
		if (arg4 <= local17) {
			local17 = 0;
		}
		@Pc(43) int local43 = this.aByteArray1[arg5 + local25] & 0x3;
		local17 &= 0xFF;
		@Pc(51) int local51 = Class53.anIntArray164[local21];
		@Pc(66) int local66;
		if (local43 > 1) {
			local66 = local43 == 2 ? local21 - arg0 : -local21 - arg0;
		} else {
			local66 = local43 == 0 ? arg0 + local21 : -local21 + arg0;
		}
		@Pc(91) int local91 = local21 - 4096;
		local43 = this.aByteArray1[local17 + arg5] & 0x3;
		@Pc(119) int local119;
		if (local43 > 1) {
			local119 = local43 == 2 ? local91 - arg0 : -arg0 + -local91;
		} else {
			local119 = local43 == 0 ? arg0 + local91 : arg0 + -local91;
		}
		local43 = this.aByteArray1[local25 + arg3] & 0x3;
		@Pc(156) int local156 = local66 + ((local119 - local66) * local51 >> 12);
		if (local43 > 1) {
			local66 = local43 == 2 ? local21 - local9 : -local9 + -local21;
		} else {
			local66 = local43 == 0 ? local21 + local9 : -local21 + local9;
		}
		local43 = this.aByteArray1[arg3 + local17] & 0x3;
		if (local43 <= 1) {
			local119 = local43 == 0 ? local91 + local9 : local9 - local91;
		} else {
			local119 = local43 == 2 ? local91 - local9 : -local9 + -local91;
		}
		@Pc(245) int local245 = local66 + (local51 * (local119 - local66) >> 12);
		return local156 + ((local245 - local156) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean34 = arg0.method3010() == 1;
		} else if (arg1 == 1) {
			this.anInt365 = arg0.method3010();
		} else if (arg1 == 2) {
			this.anInt355 = arg0.method3048();
			if (this.anInt355 < 0) {
				this.aShortArray1 = new short[this.anInt365];
				for (@Pc(70) int local70 = 0; local70 < this.anInt365; local70++) {
					this.aShortArray1[local70] = (short) arg0.method3048();
				}
			}
		} else if (arg1 == 3) {
			this.anInt356 = this.anInt362 = arg0.method3010();
		} else if (arg1 == 4) {
			this.anInt357 = arg0.method3010();
		} else if (arg1 == 5) {
			this.anInt356 = arg0.method3010();
		} else if (arg1 == 6) {
			this.anInt362 = arg0.method3010();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		this.aByteArray1 = Static3.method3257(this.anInt357);
		this.method230();
		for (@Pc(23) int local23 = this.anInt365 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray1[local23];
			if (local30 > 8 || local30 < -8) {
				return;
			}
			this.anInt365--;
		}
	}
}
