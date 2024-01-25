import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ab", name = "X", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
	public int anInt56 = 4;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
	public int anInt54 = 4;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
	public int anInt59 = 1638;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
	public int anInt66 = 0;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ab", name = "cb", descriptor = "I")
	public int anInt69 = 4;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "[B")
	private byte[] aByteArray1 = new byte[512];

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
	private void method53() {
		@Pc(35) int local35;
		if (this.anInt59 > 0) {
			this.aShortArray2 = new short[this.anInt56];
			this.aShortArray1 = new short[this.anInt56];
			for (local35 = 0; local35 < this.anInt56; local35++) {
				this.aShortArray1[local35] = (short) (Math.pow((double) ((float) this.anInt59 / 4096.0F), (double) local35) * 4096.0D);
				this.aShortArray2[local35] = (short) Math.pow(2.0D, (double) local35);
			}
		} else if (this.aShortArray1 != null && this.anInt56 == this.aShortArray1.length) {
			this.aShortArray2 = new short[this.anInt56];
			for (local35 = 0; local35 < this.anInt56; local35++) {
				this.aShortArray2[local35] = (short) Math.pow(2.0D, (double) local35);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean6 = arg0.method2739() == 1;
		} else if (arg1 == 1) {
			this.anInt56 = arg0.method2739();
		} else if (arg1 == 2) {
			this.anInt59 = arg0.method2740();
			if (this.anInt59 < 0) {
				this.aShortArray1 = new short[this.anInt56];
				for (@Pc(75) int local75 = 0; local75 < this.anInt56; local75++) {
					this.aShortArray1[local75] = (short) arg0.method2740();
				}
			}
		} else if (arg1 == 3) {
			this.anInt54 = this.anInt69 = arg0.method2739();
		} else if (arg1 == 4) {
			this.anInt66 = arg0.method2739();
		} else if (arg1 == 5) {
			this.anInt54 = arg0.method2739();
		} else if (arg1 == 6) {
			this.anInt69 = arg0.method2739();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBIIII)I")
	private int method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (local13 >= arg2) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg5 & 0xFFF;
		local9 &= 0xFF;
		@Pc(34) int local34 = arg4 - 4096;
		local13 &= 0xFF;
		@Pc(42) int local42 = local26 - 4096;
		@Pc(51) int local51 = this.aByteArray1[arg1 + local9] & 0x3;
		@Pc(55) int local55 = Class4.anIntArray8[local26];
		@Pc(73) int local73;
		if (local51 <= 1) {
			local73 = local51 == 0 ? local26 + arg4 : -local26 + arg4;
		} else {
			local73 = local51 == 2 ? local26 - arg4 : -arg4 + -local26;
		}
		local51 = this.aByteArray1[arg1 + local13] & 0x3;
		@Pc(116) int local116;
		if (local51 <= 1) {
			local116 = local51 == 0 ? local42 + arg4 : -local42 + arg4;
		} else {
			local116 = local51 == 2 ? local42 - arg4 : -local42 + -arg4;
		}
		@Pc(145) int local145 = ((local116 - local73) * local55 >> 12) + local73;
		local51 = this.aByteArray1[arg0 + local9] & 0x3;
		if (local51 > 1) {
			local73 = local51 == 2 ? local26 - local34 : -local26 - local34;
		} else {
			local73 = local51 == 0 ? local26 + local34 : local34 - local26;
		}
		local51 = this.aByteArray1[local13 + arg0] & 0x3;
		if (local51 <= 1) {
			local116 = local51 == 0 ? local42 + local34 : -local42 + local34;
		} else {
			local116 = local51 == 2 ? local42 - local34 : -local42 + -local34;
		}
		@Pc(248) int local248 = (local55 * (local116 - local73) >> 12) + local73;
		return local145 + ((local248 - local145) * arg3 >> 12);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		this.aByteArray1 = Static82.method1362(this.anInt66);
		this.method53();
		for (@Pc(23) int local23 = this.anInt56 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray1[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt56--;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			this.method58(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[I)V")
	public void method58(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = this.anInt69 * Static351.anIntArray371[arg0];
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(41) int local41;
		@Pc(26) short local26;
		@Pc(106) int local106;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(48) int local48;
		@Pc(104) int local104;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(100) int local100;
		@Pc(91) int local91;
		if (this.anInt56 == 1) {
			local41 = this.aShortArray2[0] << 12;
			local26 = this.aShortArray1[0];
			local61 = this.anInt54 * local41 >> 12;
			local54 = local12 * local41 >> 12;
			local48 = this.anInt69 * local41 >> 12;
			local65 = local54 >> 12;
			local69 = local65 + 1;
			@Pc(384) int local384 = local54 & 0xFFF;
			if (local48 <= local69) {
				local69 = 0;
			}
			local91 = this.aByteArray1[local69 & 0xFF] & 0xFF;
			local104 = Class4.anIntArray8[local384];
			local100 = this.aByteArray1[local65 & 0xFF] & 0xFF;
			if (this.aBoolean6) {
				for (local106 = 0; local106 < Static238.anInt4221; local106++) {
					local115 = this.anInt54 * Static187.anIntArray379[local106];
					local129 = this.method54(local91, local100, local61, local104, local384, local115 * local41 >> 12);
					local129 = local129 * local26 >> 12;
					arg1[local106] = (local129 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static238.anInt4221; local106++) {
					local115 = Static187.anIntArray379[local106] * this.anInt54;
					local129 = this.method54(local91, local100, local61, local104, local384, local115 * local41 >> 12);
					arg1[local106] = local26 * local129 >> 12;
				}
			}
			return;
		}
		local26 = this.aShortArray1[0];
		if (local26 > 8 || local26 < -8) {
			local41 = this.aShortArray2[0] << 12;
			local48 = this.anInt69 * local41 >> 12;
			local54 = local12 * local41 >> 12;
			local61 = local41 * this.anInt54 >> 12;
			local65 = local54 >> 12;
			local69 = local65 + 1;
			local54 &= 0xFFF;
			if (local69 >= local48) {
				local69 = 0;
			}
			local91 = this.aByteArray1[local69 & 0xFF] & 0xFF;
			local100 = this.aByteArray1[local65 & 0xFF] & 0xFF;
			local104 = Class4.anIntArray8[local54];
			for (local106 = 0; local106 < Static238.anInt4221; local106++) {
				local115 = this.anInt54 * Static187.anIntArray379[local106];
				local129 = this.method54(local91, local100, local61, local104, local54, local115 * local41 >> 12);
				arg1[local106] = local129 * local26 >> 12;
			}
		}
		for (@Pc(147) int local147 = 1; local147 < this.anInt56; local147++) {
			local26 = this.aShortArray1[local147];
			if (local26 > 8 || local26 < -8) {
				local41 = this.aShortArray2[local147] << 12;
				local54 = local12 * local41 >> 12;
				local61 = this.anInt54 * local41 >> 12;
				local48 = this.anInt69 * local41 >> 12;
				local65 = local54 >> 12;
				local69 = local65 + 1;
				if (local69 >= local48) {
					local69 = 0;
				}
				local54 &= 0xFFF;
				local91 = this.aByteArray1[local69 & 0xFF] & 0xFF;
				local100 = this.aByteArray1[local65 & 0xFF] & 0xFF;
				local104 = Class4.anIntArray8[local54];
				if (this.aBoolean6 && local147 == this.anInt56 - 1) {
					for (local106 = 0; local106 < Static238.anInt4221; local106++) {
						local115 = this.anInt54 * Static187.anIntArray379[local106];
						local129 = this.method54(local91, local100, local61, local104, local54, local41 * local115 >> 12);
						local129 = (local26 * local129 >> 12) + arg1[local106];
						arg1[local106] = (local129 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static238.anInt4221; local106++) {
						local115 = this.anInt54 * Static187.anIntArray379[local106];
						local129 = this.method54(local91, local100, local61, local104, local54, local41 * local115 >> 12);
						arg1[local106] += local26 * local129 >> 12;
					}
				}
			}
		}
	}
}
