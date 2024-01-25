import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!up", name = "M", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!up", name = "R", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!up", name = "F", descriptor = "Z")
	public boolean aBoolean587 = true;

	@OriginalMember(owner = "client!up", name = "H", descriptor = "I")
	public int anInt6731 = 4;

	@OriginalMember(owner = "client!up", name = "G", descriptor = "I")
	public int anInt6730 = 1638;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "[B")
	private byte[] aByteArray90 = new byte[512];

	@OriginalMember(owner = "client!up", name = "O", descriptor = "I")
	public int anInt6737 = 4;

	@OriginalMember(owner = "client!up", name = "U", descriptor = "I")
	public int anInt6740 = 0;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "I")
	public int anInt6734 = 4;

	static {
		new Class142("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)V")
	private void method5342() {
		@Pc(23) int local23;
		if (this.anInt6730 > 0) {
			this.aShortArray106 = new short[this.anInt6737];
			this.aShortArray107 = new short[this.anInt6737];
			for (local23 = 0; local23 < this.anInt6737; local23++) {
				this.aShortArray107[local23] = (short) (Math.pow((double) ((float) this.anInt6730 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray106[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray107 != null && this.anInt6737 == this.aShortArray107.length) {
			this.aShortArray106 = new short[this.anInt6737];
			for (local23 = 0; local23 < this.anInt6737; local23++) {
				this.aShortArray106[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBIIIII)I")
	private int method5343(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg3 >> 12;
		@Pc(18) int local18 = local14 + 1;
		if (arg2 <= local18) {
			local18 = 0;
		}
		local14 &= 0xFF;
		@Pc(35) int local35 = arg3 & 0xFFF;
		@Pc(39) int local39 = arg0 - 4096;
		@Pc(43) int local43 = local35 - 4096;
		local18 &= 0xFF;
		@Pc(56) int local56 = this.aByteArray90[arg1 + local14] & 0x3;
		@Pc(60) int local60 = Class217.anIntArray415[local35];
		@Pc(78) int local78;
		if (local56 <= 1) {
			local78 = local56 == 0 ? local35 + arg0 : -local35 + arg0;
		} else {
			local78 = local56 == 2 ? local35 - arg0 : -arg0 + -local35;
		}
		local56 = this.aByteArray90[local18 + arg1] & 0x3;
		@Pc(120) int local120;
		if (local56 <= 1) {
			local120 = local56 == 0 ? arg0 + local43 : arg0 + -local43;
		} else {
			local120 = local56 == 2 ? local43 - arg0 : -local43 + -arg0;
		}
		@Pc(147) int local147 = local78 + ((local120 - local78) * local60 >> 12);
		local56 = this.aByteArray90[local14 + arg4] & 0x3;
		if (local56 > 1) {
			local78 = local56 == 2 ? local35 - local39 : -local39 + -local35;
		} else {
			local78 = local56 == 0 ? local35 + local39 : -local35 + local39;
		}
		local56 = this.aByteArray90[arg4 + local18] & 0x3;
		if (local56 > 1) {
			local120 = local56 == 2 ? local43 - local39 : -local43 + -local39;
		} else {
			local120 = local56 == 0 ? local39 + local43 : -local43 + local39;
		}
		@Pc(241) int local241 = ((local120 - local78) * local60 >> 12) + local78;
		return ((local241 - local147) * arg5 >> 12) + local147;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean587 = arg0.method2915() == 1;
		} else if (arg1 == 1) {
			this.anInt6737 = arg0.method2915();
		} else if (arg1 == 2) {
			this.anInt6730 = arg0.method2929();
			if (this.anInt6730 < 0) {
				this.aShortArray107 = new short[this.anInt6737];
				for (@Pc(73) int local73 = 0; local73 < this.anInt6737; local73++) {
					this.aShortArray107[local73] = (short) arg0.method2929();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt6734 = this.anInt6731 = arg0.method2915();
			return;
		} else if (arg1 == 4) {
			this.anInt6740 = arg0.method2915();
			return;
		} else if (arg1 == 5) {
			this.anInt6734 = arg0.method2915();
			return;
		} else if (arg1 == 6) {
			this.anInt6731 = arg0.method2915();
			return;
		}
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		this.aByteArray90 = Static336.method4404(this.anInt6740);
		this.method5342();
		for (@Pc(25) int local25 = this.anInt6737 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray107[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt6737--;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI[I)V")
	public void method5346(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(16) int local16 = Static258.anIntArray335[arg0] * this.anInt6731;
		@Pc(112) int local112;
		@Pc(126) int local126;
		@Pc(42) int local42;
		@Pc(25) short local25;
		@Pc(103) int local103;
		@Pc(48) int local48;
		@Pc(62) int local62;
		@Pc(55) int local55;
		@Pc(101) int local101;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(97) int local97;
		@Pc(88) int local88;
		if (this.anInt6737 == 1) {
			local42 = this.aShortArray106[0] << 12;
			local25 = this.aShortArray107[0];
			local48 = local42 * local16 >> 12;
			local62 = local42 * this.anInt6734 >> 12;
			local55 = this.anInt6731 * local42 >> 12;
			local66 = local48 >> 12;
			local70 = local66 + 1;
			if (local55 <= local70) {
				local70 = 0;
			}
			local48 &= 0xFFF;
			local101 = Class217.anIntArray415[local48];
			local88 = this.aByteArray90[local70 & 0xFF] & 0xFF;
			local97 = this.aByteArray90[local66 & 0xFF] & 0xFF;
			if (this.aBoolean587) {
				for (local103 = 0; local103 < Static218.anInt3990; local103++) {
					local112 = this.anInt6734 * Static434.anIntArray495[local103];
					local126 = this.method5343(local48, local97, local62, local112 * local42 >> 12, local88, local101);
					@Pc(490) int local490 = local126 * local25 >> 12;
					arg1[local103] = (local490 >> 1) + 2048;
				}
			} else {
				for (local103 = 0; local103 < Static218.anInt3990; local103++) {
					local112 = this.anInt6734 * Static434.anIntArray495[local103];
					local126 = this.method5343(local48, local97, local62, local42 * local112 >> 12, local88, local101);
					arg1[local103] = local25 * local126 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray107[0];
		if (local25 > 8 || local25 < -8) {
			local42 = this.aShortArray106[0] << 12;
			local48 = local42 * local16 >> 12;
			local55 = local42 * this.anInt6731 >> 12;
			local62 = this.anInt6734 * local42 >> 12;
			local66 = local48 >> 12;
			local70 = local66 + 1;
			if (local70 >= local55) {
				local70 = 0;
			}
			local48 &= 0xFFF;
			local88 = this.aByteArray90[local70 & 0xFF] & 0xFF;
			local97 = this.aByteArray90[local66 & 0xFF] & 0xFF;
			local101 = Class217.anIntArray415[local48];
			for (local103 = 0; local103 < Static218.anInt3990; local103++) {
				local112 = Static434.anIntArray495[local103] * this.anInt6734;
				local126 = this.method5343(local48, local97, local62, local112 * local42 >> 12, local88, local101);
				arg1[local103] = local25 * local126 >> 12;
			}
		}
		for (@Pc(144) int local144 = 1; local144 < this.anInt6737; local144++) {
			local25 = this.aShortArray107[local144];
			if (local25 > 8 || local25 < -8) {
				local42 = this.aShortArray106[local144] << 12;
				local48 = local42 * local16 >> 12;
				local62 = local42 * this.anInt6734 >> 12;
				local55 = local42 * this.anInt6731 >> 12;
				local66 = local48 >> 12;
				local70 = local66 + 1;
				local48 &= 0xFFF;
				if (local55 <= local70) {
					local70 = 0;
				}
				local88 = this.aByteArray90[local70 & 0xFF] & 0xFF;
				local97 = this.aByteArray90[local66 & 0xFF] & 0xFF;
				local101 = Class217.anIntArray415[local48];
				if (this.aBoolean587 && local144 == this.anInt6737 - 1) {
					for (local103 = 0; local103 < Static218.anInt3990; local103++) {
						local112 = Static434.anIntArray495[local103] * this.anInt6734;
						local126 = this.method5343(local48, local97, local62, local42 * local112 >> 12, local88, local101);
						local126 = (local126 * local25 >> 12) + arg1[local103];
						arg1[local103] = (local126 >> 1) + 2048;
					}
				} else {
					for (local103 = 0; local103 < Static218.anInt3990; local103++) {
						local112 = Static434.anIntArray495[local103] * this.anInt6734;
						local126 = this.method5343(local48, local97, local62, local42 * local112 >> 12, local88, local101);
						arg1[local103] += local126 * local25 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			this.method5346(arg0, local9);
		}
		return local9;
	}
}
