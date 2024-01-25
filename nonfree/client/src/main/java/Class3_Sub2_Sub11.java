import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
	public int anInt3949 = 0;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
	public int anInt3943 = 4;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
	public int anInt3950 = 1638;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "[B")
	private byte[] aByteArray22 = new byte[512];

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	public int anInt3951 = 4;

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
	public int anInt3952 = 4;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "Z")
	public boolean aBoolean331 = true;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI[I)V")
	public void method3321(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static123.anIntArray113[arg0] * this.anInt3952;
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(45) int local45;
		@Pc(28) short local28;
		@Pc(106) int local106;
		@Pc(65) int local65;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(104) int local104;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (this.anInt3951 == 1) {
			local45 = this.aShortArray65[0] << 12;
			local28 = this.aShortArray64[0];
			local52 = this.anInt3943 * local45 >> 12;
			local65 = local45 * local12 >> 12;
			local59 = local45 * this.anInt3952 >> 12;
			local69 = local65 >> 12;
			local73 = local69 + 1;
			if (local59 <= local73) {
				local73 = 0;
			}
			local65 &= 0xFFF;
			local104 = Class3_Sub2_Sub7.anIntArray92[local65];
			local100 = this.aByteArray22[local73 & 0xFF] & 0xFF;
			local91 = this.aByteArray22[local69 & 0xFF] & 0xFF;
			if (this.aBoolean331) {
				for (local106 = 0; local106 < Static636.anInt10302; local106++) {
					local115 = Static508.anIntArray472[local106] * this.anInt3943;
					local129 = this.method3325(local100, local91, local104, local115 * local45 >> 12, local52, local65);
					local129 = local129 * local28 >> 12;
					arg1[local106] = (local129 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static636.anInt10302; local106++) {
					local115 = Static508.anIntArray472[local106] * this.anInt3943;
					local129 = this.method3325(local100, local91, local104, local45 * local115 >> 12, local52, local65);
					arg1[local106] = local129 * local28 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray64[0];
		if (local28 > 8 || local28 < -8) {
			local45 = this.aShortArray65[0] << 12;
			local52 = this.anInt3943 * local45 >> 12;
			local59 = local45 * this.anInt3952 >> 12;
			local65 = local12 * local45 >> 12;
			local69 = local65 >> 12;
			local73 = local69 + 1;
			local65 &= 0xFFF;
			if (local73 >= local59) {
				local73 = 0;
			}
			local91 = this.aByteArray22[local69 & 0xFF] & 0xFF;
			local100 = this.aByteArray22[local73 & 0xFF] & 0xFF;
			local104 = Class3_Sub2_Sub7.anIntArray92[local65];
			for (local106 = 0; local106 < Static636.anInt10302; local106++) {
				local115 = this.anInt3943 * Static508.anIntArray472[local106];
				local129 = this.method3325(local100, local91, local104, local45 * local115 >> 12, local52, local65);
				arg1[local106] = local28 * local129 >> 12;
			}
		}
		for (@Pc(147) int local147 = 1; local147 < this.anInt3951; local147++) {
			local28 = this.aShortArray64[local147];
			if (local28 > 8 || local28 < -8) {
				local45 = this.aShortArray65[local147] << 12;
				local65 = local45 * local12 >> 12;
				local59 = this.anInt3952 * local45 >> 12;
				local52 = this.anInt3943 * local45 >> 12;
				local69 = local65 >> 12;
				local73 = local69 + 1;
				if (local59 <= local73) {
					local73 = 0;
				}
				local65 &= 0xFFF;
				local91 = this.aByteArray22[local69 & 0xFF] & 0xFF;
				local100 = this.aByteArray22[local73 & 0xFF] & 0xFF;
				local104 = Class3_Sub2_Sub7.anIntArray92[local65];
				if (this.aBoolean331 && local147 == this.anInt3951 - 1) {
					for (local106 = 0; local106 < Static636.anInt10302; local106++) {
						local115 = this.anInt3943 * Static508.anIntArray472[local106];
						local129 = this.method3325(local100, local91, local104, local45 * local115 >> 12, local52, local65);
						local129 = arg1[local106] + (local129 * local28 >> 12);
						arg1[local106] = (local129 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static636.anInt10302; local106++) {
						local115 = this.anInt3943 * Static508.anIntArray472[local106];
						local129 = this.method3325(local100, local91, local104, local115 * local45 >> 12, local52, local65);
						arg1[local106] += local129 * local28 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	@Override
	public void method9205() {
		this.aByteArray22 = Static523.method7449(this.anInt3949);
		this.method3326();
		for (@Pc(28) int local28 = this.anInt3951 - 1; local28 >= 1; local28--) {
			@Pc(35) short local35 = this.aShortArray64[local28];
			if (local35 > 8) {
				return;
			}
			if (local35 < -8) {
				return;
			}
			this.anInt3951--;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.aBoolean331 = arg1.method5322(-123) == 1;
		} else if (arg0 == 1) {
			this.anInt3951 = arg1.method5322(-116);
		} else if (arg0 == 2) {
			this.anInt3950 = arg1.method5281();
			if (this.anInt3950 < 0) {
				this.aShortArray64 = new short[this.anInt3951];
				for (@Pc(91) int local91 = 0; local91 < this.anInt3951; local91++) {
					this.aShortArray64[local91] = (short) arg1.method5281();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3943 = this.anInt3952 = arg1.method5322(-91);
		} else if (arg0 == 4) {
			this.anInt3949 = arg1.method5322(-64);
		} else if (arg0 == 5) {
			this.anInt3943 = arg1.method5322(-38);
		} else if (arg0 == 6) {
			this.anInt3952 = arg1.method5322(-20);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			this.method3321(arg0, local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIII)I")
	private int method3325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = arg3 >> 12;
		@Pc(20) int local20 = local16 + 1;
		@Pc(24) int local24 = arg3 & 0xFFF;
		if (local20 >= arg4) {
			local20 = 0;
		}
		local16 &= 0xFF;
		@Pc(37) int local37 = arg5 - 4096;
		local20 &= 0xFF;
		@Pc(45) int local45 = local24 - 4096;
		@Pc(49) int local49 = Class3_Sub2_Sub7.anIntArray92[local24];
		@Pc(58) int local58 = this.aByteArray22[arg1 + local16] & 0x3;
		@Pc(75) int local75;
		if (local58 <= 1) {
			local75 = local58 == 0 ? local24 + arg5 : -local24 + arg5;
		} else {
			local75 = local58 == 2 ? local24 - arg5 : -arg5 + -local24;
		}
		local58 = this.aByteArray22[arg1 + local20] & 0x3;
		@Pc(123) int local123;
		if (local58 <= 1) {
			local123 = local58 == 0 ? local45 + arg5 : arg5 + -local45;
		} else {
			local123 = local58 == 2 ? local45 - arg5 : -arg5 + -local45;
		}
		local58 = this.aByteArray22[arg0 + local16] & 0x3;
		@Pc(164) int local164 = local75 + ((local123 - local75) * local49 >> 12);
		if (local58 <= 1) {
			local75 = local58 == 0 ? local37 + local24 : local37 - local24;
		} else {
			local75 = local58 == 2 ? local24 - local37 : -local37 + -local24;
		}
		local58 = this.aByteArray22[local20 + arg0] & 0x3;
		if (local58 > 1) {
			local123 = local58 == 2 ? local45 - local37 : -local45 - local37;
		} else {
			local123 = local58 == 0 ? local45 + local37 : local37 - local45;
		}
		@Pc(257) int local257 = local75 + ((local123 - local75) * local49 >> 12);
		return ((local257 - local164) * arg2 >> 12) + local164;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(Z)V")
	private void method3326() {
		@Pc(16) int local16;
		if (this.anInt3950 > 0) {
			this.aShortArray64 = new short[this.anInt3951];
			this.aShortArray65 = new short[this.anInt3951];
			for (local16 = 0; local16 < this.anInt3951; local16++) {
				this.aShortArray64[local16] = (short) (int) (Math.pow((double) ((float) this.anInt3950 / 4096.0F), (double) local16) * 4096.0D);
				this.aShortArray65[local16] = (short) (int) Math.pow(2.0D, (double) local16);
			}
		} else if (this.aShortArray64 != null && this.anInt3951 == this.aShortArray64.length) {
			this.aShortArray65 = new short[this.anInt3951];
			for (local16 = 0; local16 < this.anInt3951; local16++) {
				this.aShortArray65[local16] = (short) (int) Math.pow(2.0D, (double) local16);
			}
		}
	}
}
