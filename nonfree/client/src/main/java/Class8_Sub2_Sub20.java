import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class8_Sub2_Sub20 extends Class8_Sub2 {

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
	public int anInt5426 = 4;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	public int anInt5421 = 4;

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
	public int anInt5430 = 0;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "Z")
	public boolean aBoolean400 = true;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	public int anInt5427 = 1638;

	@OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
	public int anInt5432 = 4;

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "[B")
	private byte[] aByteArray34 = new byte[512];

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)I")
	private int method4459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = arg2 >> 12;
		@Pc(21) int local21 = local17 + 1;
		@Pc(25) int local25 = local17 & 0xFF;
		if (local21 >= arg5) {
			local21 = 0;
		}
		@Pc(38) int local38 = arg2 & 0xFFF;
		@Pc(42) int local42 = arg4 - 4096;
		local21 &= 0xFF;
		@Pc(50) int local50 = local38 - 4096;
		@Pc(54) int local54 = Class8_Sub5_Sub19.anIntArray584[local38];
		@Pc(64) int local64 = this.aByteArray34[local25 + arg0] & 0x3;
		@Pc(78) int local78;
		if (local64 <= 1) {
			local78 = local64 == 0 ? arg4 + local38 : arg4 + -local38;
		} else {
			local78 = local64 == 2 ? local38 - arg4 : -arg4 + -local38;
		}
		local64 = this.aByteArray34[local21 + arg0] & 0x3;
		@Pc(125) int local125;
		if (local64 > 1) {
			local125 = local64 == 2 ? local50 - arg4 : -local50 + -arg4;
		} else {
			local125 = local64 == 0 ? local50 + arg4 : -local50 + arg4;
		}
		@Pc(153) int local153 = local78 + ((local125 - local78) * local54 >> 12);
		local64 = this.aByteArray34[arg1 + local25] & 0x3;
		if (local64 > 1) {
			local78 = local64 == 2 ? local38 - local42 : -local38 + -local42;
		} else {
			local78 = local64 == 0 ? local38 + local42 : local42 - local38;
		}
		local64 = this.aByteArray34[arg1 + local21] & 0x3;
		if (local64 > 1) {
			local125 = local64 == 2 ? local50 - local42 : -local42 + -local50;
		} else {
			local125 = local64 == 0 ? local42 + local50 : local42 + -local50;
		}
		@Pc(246) int local246 = local78 + ((local125 - local78) * local54 >> 12);
		return (arg3 * (local246 - local153) >> 12) + local153;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			this.method4463(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
	private void method4461() {
		@Pc(20) int local20;
		if (this.anInt5427 > 0) {
			this.aShortArray53 = new short[this.anInt5432];
			this.aShortArray52 = new short[this.anInt5432];
			for (local20 = 0; local20 < this.anInt5432; local20++) {
				this.aShortArray52[local20] = (short) (Math.pow((double) ((float) this.anInt5427 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray53[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray52 != null && this.aShortArray52.length == this.anInt5432) {
			this.aShortArray53 = new short[this.anInt5432];
			for (local20 = 0; local20 < this.anInt5432; local20++) {
				this.aShortArray53[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean400 = arg1.method8525() == 1;
		} else if (arg0 == 1) {
			this.anInt5432 = arg1.method8525();
		} else if (arg0 == 2) {
			this.anInt5427 = arg1.method8568();
			if (this.anInt5427 < 0) {
				this.aShortArray52 = new short[this.anInt5432];
				for (@Pc(76) int local76 = 0; local76 < this.anInt5432; local76++) {
					this.aShortArray52[local76] = (short) arg1.method8568();
				}
			}
		} else if (arg0 == 3) {
			this.anInt5421 = this.anInt5426 = arg1.method8525();
		} else if (arg0 == 4) {
			this.anInt5430 = arg1.method8525();
		} else if (arg0 == 5) {
			this.anInt5421 = arg1.method8525();
		} else if (arg0 == 6) {
			this.anInt5426 = arg1.method8525();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB[I)V")
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static426.anIntArray424[arg0] * this.anInt5426;
		@Pc(113) int local113;
		@Pc(127) int local127;
		@Pc(43) int local43;
		@Pc(28) short local28;
		@Pc(104) int local104;
		@Pc(49) int local49;
		@Pc(63) int local63;
		@Pc(56) int local56;
		@Pc(93) int local93;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(89) int local89;
		@Pc(102) int local102;
		if (this.anInt5432 == 1) {
			local28 = this.aShortArray52[0];
			local43 = this.aShortArray53[0] << 12;
			local63 = local43 * this.anInt5421 >> 12;
			local56 = this.anInt5426 * local43 >> 12;
			local49 = local12 * local43 >> 12;
			local67 = local49 >> 12;
			local71 = local67 + 1;
			@Pc(378) int local378 = local49 & 0xFFF;
			if (local71 >= local56) {
				local71 = 0;
			}
			local89 = this.aByteArray34[local67 & 0xFF] & 0xFF;
			local102 = this.aByteArray34[local71 & 0xFF] & 0xFF;
			local93 = Class8_Sub5_Sub19.anIntArray584[local378];
			if (this.aBoolean400) {
				for (local104 = 0; local104 < Static538.anInt9297; local104++) {
					local113 = this.anInt5421 * Static93.anIntArray111[local104];
					local127 = this.method4459(local89, local102, local113 * local43 >> 12, local93, local378, local63);
					@Pc(487) int local487 = local28 * local127 >> 12;
					arg1[local104] = (local487 >> 1) + 2048;
				}
			} else {
				for (local104 = 0; local104 < Static538.anInt9297; local104++) {
					local113 = Static93.anIntArray111[local104] * this.anInt5421;
					local127 = this.method4459(local89, local102, local43 * local113 >> 12, local93, local378, local63);
					arg1[local104] = local127 * local28 >> 12;
				}
			}
			return;
		}
		local28 = this.aShortArray52[0];
		if (local28 > 8 || local28 < -8) {
			local43 = this.aShortArray53[0] << 12;
			local49 = local43 * local12 >> 12;
			local56 = this.anInt5426 * local43 >> 12;
			local63 = local43 * this.anInt5421 >> 12;
			local67 = local49 >> 12;
			local71 = local67 + 1;
			if (local71 >= local56) {
				local71 = 0;
			}
			local49 &= 0xFFF;
			local89 = this.aByteArray34[local67 & 0xFF] & 0xFF;
			local93 = Class8_Sub5_Sub19.anIntArray584[local49];
			local102 = this.aByteArray34[local71 & 0xFF] & 0xFF;
			for (local104 = 0; local104 < Static538.anInt9297; local104++) {
				local113 = Static93.anIntArray111[local104] * this.anInt5421;
				local127 = this.method4459(local89, local102, local43 * local113 >> 12, local93, local49, local63);
				arg1[local104] = local28 * local127 >> 12;
			}
		}
		for (@Pc(141) int local141 = 1; local141 < this.anInt5432; local141++) {
			local28 = this.aShortArray52[local141];
			if (local28 > 8 || local28 < -8) {
				local43 = this.aShortArray53[local141] << 12;
				local63 = this.anInt5421 * local43 >> 12;
				local49 = local43 * local12 >> 12;
				local56 = local43 * this.anInt5426 >> 12;
				local67 = local49 >> 12;
				local71 = local67 + 1;
				local49 &= 0xFFF;
				if (local56 <= local71) {
					local71 = 0;
				}
				local102 = this.aByteArray34[local71 & 0xFF] & 0xFF;
				local93 = Class8_Sub5_Sub19.anIntArray584[local49];
				local89 = this.aByteArray34[local67 & 0xFF] & 0xFF;
				if (this.aBoolean400 && local141 == this.anInt5432 - 1) {
					for (local104 = 0; local104 < Static538.anInt9297; local104++) {
						local113 = this.anInt5421 * Static93.anIntArray111[local104];
						local127 = this.method4459(local89, local102, local113 * local43 >> 12, local93, local49, local63);
						local127 = arg1[local104] + (local28 * local127 >> 12);
						arg1[local104] = (local127 >> 1) + 2048;
					}
				} else {
					for (local104 = 0; local104 < Static538.anInt9297; local104++) {
						local113 = this.anInt5421 * Static93.anIntArray111[local104];
						local127 = this.method4459(local89, local102, local113 * local43 >> 12, local93, local49, local63);
						arg1[local104] += local28 * local127 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		this.aByteArray34 = Static405.method6420(this.anInt5430);
		this.method4461();
		for (@Pc(24) int local24 = this.anInt5432 - 1; local24 >= 1; local24--) {
			@Pc(31) short local31 = this.aShortArray52[local24];
			if (local31 > 8 || local31 < -8) {
				return;
			}
			this.anInt5432--;
		}
	}
}
