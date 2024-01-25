import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class6_Sub8_Sub15 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
	public int anInt5361 = 4;

	@OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
	public int anInt5360 = 4;

	@OriginalMember(owner = "client!kg", name = "E", descriptor = "I")
	public int anInt5364 = 1638;

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "[B")
	private byte[] aByteArray50 = new byte[512];

	@OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
	public int anInt5367 = 0;

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "Z")
	public boolean aBoolean405 = true;

	@OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
	public int anInt5371 = 4;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		this.aByteArray50 = Static105.method2020(this.anInt5367);
		this.method4913();
		for (@Pc(24) int local24 = this.anInt5371 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray53[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt5371--;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	private void method4913() {
		@Pc(37) int local37;
		if (this.anInt5364 > 0) {
			this.aShortArray54 = new short[this.anInt5371];
			this.aShortArray53 = new short[this.anInt5371];
			for (local37 = 0; local37 < this.anInt5371; local37++) {
				this.aShortArray53[local37] = (short) (int) (Math.pow((double) ((float) this.anInt5364 / 4096.0F), (double) local37) * 4096.0D);
				this.aShortArray54[local37] = (short) (int) Math.pow(2.0D, (double) local37);
			}
		} else if (this.aShortArray53 != null && this.anInt5371 == this.aShortArray53.length) {
			this.aShortArray54 = new short[this.anInt5371];
			for (local37 = 0; local37 < this.anInt5371; local37++) {
				this.aShortArray54[local37] = (short) (int) Math.pow(2.0D, (double) local37);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			this.method4916(arg0, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.aBoolean405 = arg1.method3030() == 1;
		} else if (arg0 == 1) {
			this.anInt5371 = arg1.method3030();
		} else if (arg0 == 2) {
			this.anInt5364 = arg1.method2989();
			if (this.anInt5364 < 0) {
				this.aShortArray53 = new short[this.anInt5371];
				for (@Pc(95) int local95 = 0; local95 < this.anInt5371; local95++) {
					this.aShortArray53[local95] = (short) arg1.method2989();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt5360 = this.anInt5361 = arg1.method3030();
			return;
		} else if (arg0 == 4) {
			this.anInt5367 = arg1.method3030();
			return;
		} else if (arg0 == 5) {
			this.anInt5360 = arg1.method3030();
			return;
		} else if (arg0 == 6) {
			this.anInt5361 = arg1.method3030();
			return;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB[I)V")
	public void method4916(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(27) int local27 = this.anInt5361 * Static424.anIntArray466[arg0];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(45) int local45;
		@Pc(38) short local38;
		@Pc(113) int local113;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(90) int local90;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(99) int local99;
		@Pc(108) int local108;
		if (this.anInt5371 == 1) {
			local38 = this.aShortArray53[0];
			local45 = this.aShortArray54[0] << 12;
			local51 = local27 * local45 >> 12;
			local58 = local45 * this.anInt5360 >> 12;
			local65 = this.anInt5361 * local45 >> 12;
			local69 = local51 >> 12;
			local73 = local69 + 1;
			if (local65 <= local73) {
				local73 = 0;
			}
			local51 &= 0xFFF;
			local90 = Class100.anIntArray137[local51];
			local99 = this.aByteArray50[local69 & 0xFF] & 0xFF;
			local108 = this.aByteArray50[local73 & 0xFF] & 0xFF;
			if (this.aBoolean405) {
				for (local113 = 0; local113 < Static83.anInt1268; local113++) {
					local122 = Static2.anIntArray1[local113] * this.anInt5360;
					local136 = this.method4917(local99, local122 * local45 >> 12, local90, local51, local58, local108);
					local136 = local38 * local136 >> 12;
					arg1[local113] = (local136 >> 1) + 2048;
				}
			} else {
				for (local113 = 0; local113 < Static83.anInt1268; local113++) {
					local122 = this.anInt5360 * Static2.anIntArray1[local113];
					local136 = this.method4917(local99, local122 * local45 >> 12, local90, local51, local58, local108);
					arg1[local113] = local136 * local38 >> 12;
				}
			}
			return;
		}
		local38 = this.aShortArray53[0];
		if (local38 > 8 || local38 < -8) {
			local45 = this.aShortArray54[0] << 12;
			local58 = this.anInt5360 * local45 >> 12;
			local65 = this.anInt5361 * local45 >> 12;
			local51 = local27 * local45 >> 12;
			local69 = local51 >> 12;
			local73 = local69 + 1;
			if (local65 <= local73) {
				local73 = 0;
			}
			local51 &= 0xFFF;
			local108 = this.aByteArray50[local73 & 0xFF] & 0xFF;
			local99 = this.aByteArray50[local69 & 0xFF] & 0xFF;
			local90 = Class100.anIntArray137[local51];
			for (local113 = 0; local113 < Static83.anInt1268; local113++) {
				local122 = Static2.anIntArray1[local113] * this.anInt5360;
				local136 = this.method4917(local99, local45 * local122 >> 12, local90, local51, local58, local108);
				arg1[local113] = local136 * local38 >> 12;
			}
		}
		for (@Pc(325) int local325 = 1; local325 < this.anInt5371; local325++) {
			local38 = this.aShortArray53[local325];
			if (local38 > 8 || local38 < -8) {
				local45 = this.aShortArray54[local325] << 12;
				local65 = this.anInt5361 * local45 >> 12;
				local58 = this.anInt5360 * local45 >> 12;
				local51 = local45 * local27 >> 12;
				local69 = local51 >> 12;
				local73 = local69 + 1;
				local51 &= 0xFFF;
				if (local65 <= local73) {
					local73 = 0;
				}
				local108 = this.aByteArray50[local73 & 0xFF] & 0xFF;
				local90 = Class100.anIntArray137[local51];
				local99 = this.aByteArray50[local69 & 0xFF] & 0xFF;
				if (this.aBoolean405 && this.anInt5371 - 1 == local325) {
					for (local113 = 0; local113 < Static83.anInt1268; local113++) {
						local122 = Static2.anIntArray1[local113] * this.anInt5360;
						local136 = this.method4917(local99, local122 * local45 >> 12, local90, local51, local58, local108);
						local136 = arg1[local113] + (local38 * local136 >> 12);
						arg1[local113] = (local136 >> 1) + 2048;
					}
				} else {
					for (local113 = 0; local113 < Static83.anInt1268; local113++) {
						local122 = this.anInt5360 * Static2.anIntArray1[local113];
						local136 = this.method4917(local99, local122 * local45 >> 12, local90, local51, local58, local108);
						arg1[local113] += local38 * local136 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)I")
	private int method4917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg1 & 0xFFF;
		if (local13 >= arg4) {
			local13 = 0;
		}
		local9 &= 0xFF;
		@Pc(30) int local30 = local17 - 4096;
		@Pc(41) int local41 = arg3 - 4096;
		local13 &= 0xFF;
		@Pc(49) int local49 = Class100.anIntArray137[local17];
		@Pc(58) int local58 = this.aByteArray50[arg0 + local9] & 0x3;
		@Pc(78) int local78;
		if (local58 > 1) {
			local78 = local58 == 2 ? local17 - arg3 : -arg3 + -local17;
		} else {
			local78 = local58 == 0 ? local17 + arg3 : arg3 - local17;
		}
		local58 = this.aByteArray50[local13 + arg0] & 0x3;
		@Pc(128) int local128;
		if (local58 > 1) {
			local128 = local58 == 2 ? local30 - arg3 : -arg3 + -local30;
		} else {
			local128 = local58 == 0 ? local30 + arg3 : arg3 - local30;
		}
		@Pc(158) int local158 = local78 + ((local128 - local78) * local49 >> 12);
		local58 = this.aByteArray50[arg5 + local9] & 0x3;
		if (local58 > 1) {
			local78 = local58 == 2 ? local17 - local41 : -local17 - local41;
		} else {
			local78 = local58 == 0 ? local41 + local17 : -local17 + local41;
		}
		local58 = this.aByteArray50[arg5 + local13] & 0x3;
		if (local58 <= 1) {
			local128 = local58 == 0 ? local41 + local30 : local41 + -local30;
		} else {
			local128 = local58 == 2 ? local30 - local41 : -local30 + -local41;
		}
		@Pc(266) int local266 = local78 + (local49 * (local128 - local78) >> 12);
		return (arg2 * (local266 - local158) >> 12) + local158;
	}
}
