import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ai", name = "X", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
	public int anInt167 = 0;

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
	public int anInt170 = 1638;

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
	public int anInt168 = 4;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "[B")
	private byte[] aByteArray1 = new byte[512];

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	public int anInt175 = 4;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
	public int anInt176 = 4;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		this.aByteArray1 = Static41.method588(this.anInt167);
		this.method135();
		for (@Pc(21) int local21 = this.anInt175 - 1; local21 >= 1; local21--) {
			@Pc(28) short local28 = this.aShortArray2[local21];
			if (local28 > 8) {
				return;
			}
			if (local28 < -8) {
				return;
			}
			this.anInt175--;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)I")
	private int method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = local9 + 1;
		if (arg3 <= local13) {
			local13 = 0;
		}
		@Pc(22) int local22 = arg1 & 0xFFF;
		local9 &= 0xFF;
		@Pc(30) int local30 = arg0 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = local22 - 4096;
		@Pc(47) int local47 = this.aByteArray1[arg5 + local9] & 0x3;
		@Pc(51) int local51 = Class1_Sub4_Sub22.anIntArray236[local22];
		@Pc(67) int local67;
		if (local47 <= 1) {
			local67 = local47 == 0 ? arg0 + local22 : -local22 + arg0;
		} else {
			local67 = local47 == 2 ? local22 - arg0 : -local22 - arg0;
		}
		local47 = this.aByteArray1[arg5 + local13] & 0x3;
		@Pc(107) int local107;
		if (local47 <= 1) {
			local107 = local47 == 0 ? local38 + arg0 : arg0 + -local38;
		} else {
			local107 = local47 == 2 ? local38 - arg0 : -arg0 + -local38;
		}
		local47 = this.aByteArray1[local9 + arg2] & 0x3;
		@Pc(154) int local154 = local67 + (local51 * (local107 - local67) >> 12);
		if (local47 <= 1) {
			local67 = local47 == 0 ? local30 + local22 : local30 + -local22;
		} else {
			local67 = local47 == 2 ? local22 - local30 : -local22 + -local30;
		}
		local47 = this.aByteArray1[arg2 + local13] & 0x3;
		if (local47 > 1) {
			local107 = local47 == 2 ? local38 - local30 : -local30 + -local38;
		} else {
			local107 = local47 == 0 ? local30 + local38 : -local38 + local30;
		}
		@Pc(238) int local238 = ((local107 - local67) * local51 >> 12) + local67;
		return ((local238 - local154) * arg4 >> 12) + local154;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean17 = arg0.method5337() == 1;
		} else if (arg1 == 1) {
			this.anInt175 = arg0.method5337();
		} else if (arg1 == 2) {
			this.anInt170 = arg0.method5382();
			if (this.anInt170 < 0) {
				this.aShortArray2 = new short[this.anInt175];
				for (@Pc(79) int local79 = 0; local79 < this.anInt175; local79++) {
					this.aShortArray2[local79] = (short) arg0.method5382();
				}
			}
		} else if (arg1 == 3) {
			this.anInt176 = this.anInt168 = arg0.method5337();
		} else if (arg1 == 4) {
			this.anInt167 = arg0.method5337();
		} else if (arg1 == 5) {
			this.anInt176 = arg0.method5337();
		} else if (arg1 == 6) {
			this.anInt168 = arg0.method5337();
		}
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)V")
	private void method135() {
		@Pc(41) int local41;
		if (this.anInt170 > 0) {
			this.aShortArray2 = new short[this.anInt175];
			this.aShortArray1 = new short[this.anInt175];
			for (local41 = 0; local41 < this.anInt175; local41++) {
				this.aShortArray2[local41] = (short) (Math.pow((double) ((float) this.anInt170 / 4096.0F), (double) local41) * 4096.0D);
				this.aShortArray1[local41] = (short) Math.pow(2.0D, (double) local41);
			}
		} else if (this.aShortArray2 != null && this.anInt175 == this.aShortArray2.length) {
			this.aShortArray1 = new short[this.anInt175];
			for (local41 = 0; local41 < this.anInt175; local41++) {
				this.aShortArray1[local41] = (short) Math.pow(2.0D, (double) local41);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			this.method136(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([IBI)V")
	public void method136(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static419.anIntArray472[arg1] * this.anInt168;
		@Pc(116) int local116;
		@Pc(130) int local130;
		@Pc(46) int local46;
		@Pc(31) short local31;
		@Pc(107) int local107;
		@Pc(52) int local52;
		@Pc(66) int local66;
		@Pc(59) int local59;
		@Pc(96) int local96;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(105) int local105;
		@Pc(92) int local92;
		if (this.anInt175 == 1) {
			local46 = this.aShortArray1[0] << 12;
			local31 = this.aShortArray2[0];
			local59 = this.anInt168 * local46 >> 12;
			local66 = local46 * this.anInt176 >> 12;
			local52 = local12 * local46 >> 12;
			local70 = local52 >> 12;
			local74 = local70 + 1;
			@Pc(378) int local378 = local52 & 0xFFF;
			if (local59 <= local74) {
				local74 = 0;
			}
			local105 = this.aByteArray1[local70 & 0xFF] & 0xFF;
			local92 = this.aByteArray1[local74 & 0xFF] & 0xFF;
			local96 = Class1_Sub4_Sub22.anIntArray236[local378];
			if (this.aBoolean17) {
				for (local107 = 0; local107 < Static395.anInt6592; local107++) {
					local116 = this.anInt176 * Static119.anIntArray146[local107];
					local130 = this.method134(local378, local46 * local116 >> 12, local92, local66, local96, local105);
					local130 = local130 * local31 >> 12;
					arg0[local107] = (local130 >> 1) + 2048;
				}
			} else {
				for (local107 = 0; local107 < Static395.anInt6592; local107++) {
					local116 = Static119.anIntArray146[local107] * this.anInt176;
					local130 = this.method134(local378, local46 * local116 >> 12, local92, local66, local96, local105);
					arg0[local107] = local31 * local130 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray2[0];
		if (local31 > 8 || local31 < -8) {
			local46 = this.aShortArray1[0] << 12;
			local52 = local46 * local12 >> 12;
			local59 = local46 * this.anInt168 >> 12;
			local66 = this.anInt176 * local46 >> 12;
			local70 = local52 >> 12;
			local74 = local70 + 1;
			if (local59 <= local74) {
				local74 = 0;
			}
			local52 &= 0xFFF;
			local92 = this.aByteArray1[local74 & 0xFF] & 0xFF;
			local96 = Class1_Sub4_Sub22.anIntArray236[local52];
			local105 = this.aByteArray1[local70 & 0xFF] & 0xFF;
			for (local107 = 0; local107 < Static395.anInt6592; local107++) {
				local116 = this.anInt176 * Static119.anIntArray146[local107];
				local130 = this.method134(local52, local46 * local116 >> 12, local92, local66, local96, local105);
				arg0[local107] = local31 * local130 >> 12;
			}
		}
		for (@Pc(144) int local144 = 1; local144 < this.anInt175; local144++) {
			local31 = this.aShortArray2[local144];
			if (local31 > 8 || local31 < -8) {
				local46 = this.aShortArray1[local144] << 12;
				local59 = this.anInt168 * local46 >> 12;
				local66 = local46 * this.anInt176 >> 12;
				local52 = local12 * local46 >> 12;
				local70 = local52 >> 12;
				local74 = local70 + 1;
				local52 &= 0xFFF;
				if (local59 <= local74) {
					local74 = 0;
				}
				local92 = this.aByteArray1[local74 & 0xFF] & 0xFF;
				local96 = Class1_Sub4_Sub22.anIntArray236[local52];
				local105 = this.aByteArray1[local70 & 0xFF] & 0xFF;
				if (this.aBoolean17 && local144 == this.anInt175 - 1) {
					for (local107 = 0; local107 < Static395.anInt6592; local107++) {
						local116 = this.anInt176 * Static119.anIntArray146[local107];
						local130 = this.method134(local52, local116 * local46 >> 12, local92, local66, local96, local105);
						local130 = arg0[local107] + (local31 * local130 >> 12);
						arg0[local107] = (local130 >> 1) + 2048;
					}
				} else {
					for (local107 = 0; local107 < Static395.anInt6592; local107++) {
						local116 = this.anInt176 * Static119.anIntArray146[local107];
						local130 = this.method134(local52, local46 * local116 >> 12, local92, local66, local96, local105);
						arg0[local107] += local130 * local31 >> 12;
					}
				}
			}
		}
	}
}
