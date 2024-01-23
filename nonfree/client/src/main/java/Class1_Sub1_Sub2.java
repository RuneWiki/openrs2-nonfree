import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!cb", name = "tb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
	private int anInt483 = 0;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
	private int anInt488 = 4;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
	private int anInt487 = 1638;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
	private int anInt491 = 4;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
	private int anInt494 = 4;

	@OriginalMember(owner = "client!cb", name = "wb", descriptor = "[B")
	private byte[] aByteArray15 = new byte[512];

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	private void method454() {
		@Pc(23) int local23;
		if (this.anInt487 > 0) {
			this.aShortArray9 = new short[this.anInt494];
			this.aShortArray10 = new short[this.anInt494];
			for (local23 = 0; local23 < this.anInt494; local23++) {
				this.aShortArray10[local23] = (short) (Math.pow((double) ((float) this.anInt487 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray9[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray10 != null && this.aShortArray10.length == this.anInt494) {
			this.aShortArray9 = new short[this.anInt494];
			for (local23 = 0; local23 < this.anInt494; local23++) {
				this.aShortArray9[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			this.method455(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[II)V")
	private void method455(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23 = this.anInt491 * Static187.anIntArray345[arg1];
		@Pc(118) int local118;
		@Pc(132) int local132;
		@Pc(41) int local41;
		@Pc(34) short local34;
		@Pc(109) int local109;
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(73) int local73;
		@Pc(65) int local65;
		@Pc(77) int local77;
		@Pc(104) int local104;
		@Pc(95) int local95;
		if (this.anInt494 == 1) {
			local34 = this.aShortArray10[0];
			local41 = this.aShortArray9[0] << 12;
			local47 = local41 * local23 >> 12;
			local54 = this.anInt488 * local41 >> 12;
			local61 = local41 * this.anInt491 >> 12;
			local65 = local47 >> 12;
			local47 &= 0xFFF;
			local73 = Class1_Sub1_Sub36.anIntArray370[local47];
			local77 = local65 + 1;
			if (local61 <= local77) {
				local77 = 0;
			}
			local95 = this.aByteArray15[local77 & 0xFF] & 0xFF;
			local104 = this.aByteArray15[local65 & 0xFF] & 0xFF;
			if (this.aBoolean40) {
				for (local109 = 0; local109 < Static11.anInt294; local109++) {
					local118 = this.anInt488 * Static36.anIntArray81[local109];
					local132 = this.method459(local104, local41 * local118 >> 12, local73, local54, local95, local47);
					local132 = local34 * local132 >> 12;
					arg0[local109] = (local132 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static11.anInt294; local109++) {
					local118 = this.anInt488 * Static36.anIntArray81[local109];
					local132 = this.method459(local104, local41 * local118 >> 12, local73, local54, local95, local47);
					arg0[local109] = local132 * local34 >> 12;
				}
			}
			return;
		}
		local34 = this.aShortArray10[0];
		if (local34 > 8 || local34 < -8) {
			local41 = this.aShortArray9[0] << 12;
			local61 = local41 * this.anInt491 >> 12;
			local47 = local23 * local41 >> 12;
			local54 = local41 * this.anInt488 >> 12;
			local65 = local47 >> 12;
			local104 = this.aByteArray15[local65 & 0xFF] & 0xFF;
			local77 = local65 + 1;
			@Pc(252) int local252 = local47 & 0xFFF;
			if (local61 <= local77) {
				local77 = 0;
			}
			local73 = Class1_Sub1_Sub36.anIntArray370[local252];
			local95 = this.aByteArray15[local77 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static11.anInt294; local109++) {
				local118 = this.anInt488 * Static36.anIntArray81[local109];
				local132 = this.method459(local104, local118 * local41 >> 12, local73, local54, local95, local252);
				arg0[local109] = local34 * local132 >> 12;
			}
		}
		for (@Pc(313) int local313 = 1; local313 < this.anInt494; local313++) {
			local34 = this.aShortArray10[local313];
			if (local34 > 8 || local34 < -8) {
				local41 = this.aShortArray9[local313] << 12;
				local47 = local23 * local41 >> 12;
				local54 = this.anInt488 * local41 >> 12;
				local65 = local47 >> 12;
				local61 = this.anInt491 * local41 >> 12;
				local47 &= 0xFFF;
				local77 = local65 + 1;
				local73 = Class1_Sub1_Sub36.anIntArray370[local47];
				if (local77 >= local61) {
					local77 = 0;
				}
				local104 = this.aByteArray15[local65 & 0xFF] & 0xFF;
				local95 = this.aByteArray15[local77 & 0xFF] & 0xFF;
				if (this.aBoolean40 && this.anInt494 - 1 == local313) {
					for (local109 = 0; local109 < Static11.anInt294; local109++) {
						local118 = this.anInt488 * Static36.anIntArray81[local109];
						local132 = this.method459(local104, local41 * local118 >> 12, local73, local54, local95, local47);
						local132 = arg0[local109] + (local34 * local132 >> 12);
						arg0[local109] = (local132 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static11.anInt294; local109++) {
						local118 = Static36.anIntArray81[local109] * this.anInt488;
						local132 = this.method459(local104, local118 * local41 >> 12, local73, local54, local95, local47);
						arg0[local109] += local132 * local34 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		this.aByteArray15 = Static133.method2212(this.anInt483);
		this.method454();
		for (@Pc(23) int local23 = this.anInt494 - 1; local23 >= 1; local23--) {
			@Pc(30) short local30 = this.aShortArray10[local23];
			if (local30 > 8) {
				return;
			}
			if (local30 < -8) {
				return;
			}
			this.anInt494--;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean40 = arg0.method2945() == 1;
		} else if (arg1 == 1) {
			this.anInt494 = arg0.method2945();
		} else if (arg1 == 2) {
			this.anInt487 = arg0.method2944();
			if (this.anInt487 < 0) {
				this.aShortArray10 = new short[this.anInt494];
				for (@Pc(74) int local74 = 0; local74 < this.anInt494; local74++) {
					this.aShortArray10[local74] = (short) arg0.method2944();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt488 = this.anInt491 = arg0.method2945();
			return;
		} else if (arg1 == 4) {
			this.anInt483 = arg0.method2945();
			return;
		} else if (arg1 == 5) {
			this.anInt488 = arg0.method2945();
			return;
		} else if (arg1 == 6) {
			this.anInt491 = arg0.method2945();
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)I")
	private int method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 >> 12;
		@Pc(13) int local13 = arg1 & 0xFFF;
		@Pc(17) int local17 = local9 + 1;
		@Pc(21) int local21 = local9 & 0xFF;
		@Pc(33) int local33 = local13 - 4096;
		if (local17 >= arg3) {
			local17 = 0;
		}
		@Pc(42) int local42 = arg5 - 4096;
		@Pc(46) int local46 = Class1_Sub1_Sub36.anIntArray370[local13];
		local17 &= 0xFF;
		@Pc(59) int local59 = this.aByteArray15[local21 + arg0] & 0x3;
		@Pc(77) int local77;
		if (local59 > 1) {
			local77 = local59 == 2 ? local13 - arg5 : -arg5 + -local13;
		} else {
			local77 = local59 == 0 ? local13 + arg5 : -local13 + arg5;
		}
		local59 = this.aByteArray15[local17 + arg0] & 0x3;
		@Pc(118) int local118;
		if (local59 <= 1) {
			local118 = local59 == 0 ? arg5 + local33 : arg5 + -local33;
		} else {
			local118 = local59 == 2 ? local33 - arg5 : -arg5 + -local33;
		}
		local59 = this.aByteArray15[arg4 + local21] & 0x3;
		@Pc(152) int local152 = local77 + ((local118 - local77) * local46 >> 12);
		if (local59 <= 1) {
			local77 = local59 == 0 ? local13 + local42 : -local13 + local42;
		} else {
			local77 = local59 == 2 ? local13 - local42 : -local42 + -local13;
		}
		local59 = this.aByteArray15[arg4 + local17] & 0x3;
		if (local59 > 1) {
			local118 = local59 == 2 ? local33 - local42 : -local33 + -local42;
		} else {
			local118 = local59 == 0 ? local33 + local42 : -local33 + local42;
		}
		@Pc(238) int local238 = ((local118 - local77) * local46 >> 12) + local77;
		return local152 + ((local238 - local152) * arg2 >> 12);
	}
}
