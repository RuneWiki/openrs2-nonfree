import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ts", name = "J", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!ts", name = "N", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
	public int anInt7038 = 4;

	@OriginalMember(owner = "client!ts", name = "T", descriptor = "Z")
	public boolean aBoolean589 = true;

	@OriginalMember(owner = "client!ts", name = "V", descriptor = "I")
	public int anInt7045 = 0;

	@OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
	public int anInt7042 = 4;

	@OriginalMember(owner = "client!ts", name = "W", descriptor = "I")
	public int anInt7046 = 4;

	@OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
	public int anInt7040 = 1638;

	@OriginalMember(owner = "client!ts", name = "X", descriptor = "[B")
	private byte[] aByteArray85 = new byte[512];

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIII)I")
	private int method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg2 >> 12;
		@Pc(18) int local18 = local14 + 1;
		if (arg5 <= local18) {
			local18 = 0;
		}
		local14 &= 0xFF;
		@Pc(31) int local31 = arg2 & 0xFFF;
		@Pc(35) int local35 = arg4 - 4096;
		local18 &= 0xFF;
		@Pc(43) int local43 = local31 - 4096;
		@Pc(47) int local47 = Class76_Sub5.anIntArray346[local31];
		@Pc(56) int local56 = this.aByteArray85[local14 + arg3] & 0x3;
		@Pc(69) int local69;
		if (local56 <= 1) {
			local69 = local56 == 0 ? arg4 + local31 : arg4 - local31;
		} else {
			local69 = local56 == 2 ? local31 - arg4 : -local31 + -arg4;
		}
		local56 = this.aByteArray85[arg3 + local18] & 0x3;
		@Pc(115) int local115;
		if (local56 > 1) {
			local115 = local56 == 2 ? local43 - arg4 : -arg4 + -local43;
		} else {
			local115 = local56 == 0 ? arg4 + local43 : -local43 + arg4;
		}
		@Pc(139) int local139 = ((local115 - local69) * local47 >> 12) + local69;
		local56 = this.aByteArray85[local14 + arg0] & 0x3;
		if (local56 > 1) {
			local69 = local56 == 2 ? local31 - local35 : -local35 + -local31;
		} else {
			local69 = local56 == 0 ? local35 + local31 : local35 - local31;
		}
		local56 = this.aByteArray85[local18 + arg0] & 0x3;
		if (local56 <= 1) {
			local115 = local56 == 0 ? local35 + local43 : -local43 + local35;
		} else {
			local115 = local56 == 2 ? local43 - local35 : -local43 + -local35;
		}
		@Pc(238) int local238 = local69 + ((local115 - local69) * local47 >> 12);
		return (arg1 * (local238 - local139) >> 12) + local139;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)V")
	private void method5428() {
		@Pc(31) int local31;
		if (this.anInt7040 > 0) {
			this.aShortArray111 = new short[this.anInt7038];
			this.aShortArray110 = new short[this.anInt7038];
			for (local31 = 0; local31 < this.anInt7038; local31++) {
				this.aShortArray110[local31] = (short) (Math.pow((double) ((float) this.anInt7040 / 4096.0F), (double) local31) * 4096.0D);
				this.aShortArray111[local31] = (short) Math.pow(2.0D, (double) local31);
			}
		} else if (this.aShortArray110 != null && this.anInt7038 == this.aShortArray110.length) {
			this.aShortArray111 = new short[this.anInt7038];
			for (local31 = 0; local31 < this.anInt7038; local31++) {
				this.aShortArray111[local31] = (short) Math.pow(2.0D, (double) local31);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		this.aByteArray85 = Static50.method691(this.anInt7045);
		this.method5428();
		for (@Pc(27) int local27 = this.anInt7038 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray110[local27];
			if (local34 > 8 || local34 < -8) {
				return;
			}
			this.anInt7038--;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean589 = arg0.method4548() == 1;
		} else if (arg1 == 1) {
			this.anInt7038 = arg0.method4548();
		} else if (arg1 == 2) {
			this.anInt7040 = arg0.method4531();
			if (this.anInt7040 < 0) {
				this.aShortArray110 = new short[this.anInt7038];
				for (@Pc(81) int local81 = 0; local81 < this.anInt7038; local81++) {
					this.aShortArray110[local81] = (short) arg0.method4531();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt7042 = this.anInt7046 = arg0.method4548();
			return;
		} else if (arg1 == 4) {
			this.anInt7045 = arg0.method4548();
			return;
		} else if (arg1 == 5) {
			this.anInt7042 = arg0.method4548();
			return;
		} else if (arg1 == 6) {
			this.anInt7046 = arg0.method4548();
			return;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[II)V")
	public void method5430(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7046 * Static285.anIntArray17[arg1];
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(30) int local30;
		@Pc(35) short local35;
		@Pc(99) int local99;
		@Pc(48) int local48;
		@Pc(42) int local42;
		@Pc(55) int local55;
		@Pc(76) int local76;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (this.anInt7038 == 1) {
			local30 = this.aShortArray111[0] << 12;
			local35 = this.aShortArray110[0];
			local42 = local30 * this.anInt7042 >> 12;
			local48 = local30 * local12 >> 12;
			local55 = this.anInt7046 * local30 >> 12;
			local59 = local48 >> 12;
			local63 = local59 + 1;
			if (local63 >= local55) {
				local63 = 0;
			}
			local48 &= 0xFFF;
			local76 = Class76_Sub5.anIntArray346[local48];
			local85 = this.aByteArray85[local59 & 0xFF] & 0xFF;
			local94 = this.aByteArray85[local63 & 0xFF] & 0xFF;
			if (this.aBoolean589) {
				for (local99 = 0; local99 < Static410.anInt7198; local99++) {
					local108 = this.anInt7042 * Static400.anIntArray525[local99];
					local122 = this.method5426(local94, local76, local108 * local30 >> 12, local85, local48, local42);
					local122 = local35 * local122 >> 12;
					arg0[local99] = (local122 >> 1) + 2048;
				}
			} else {
				for (local99 = 0; local99 < Static410.anInt7198; local99++) {
					local108 = this.anInt7042 * Static400.anIntArray525[local99];
					local122 = this.method5426(local94, local76, local108 * local30 >> 12, local85, local48, local42);
					arg0[local99] = local122 * local35 >> 12;
				}
			}
			return;
		}
		local35 = this.aShortArray110[0];
		if (local35 > 8 || local35 < -8) {
			local30 = this.aShortArray111[0] << 12;
			local55 = this.anInt7046 * local30 >> 12;
			local42 = local30 * this.anInt7042 >> 12;
			local48 = local30 * local12 >> 12;
			local59 = local48 >> 12;
			local63 = local59 + 1;
			@Pc(229) int local229 = local48 & 0xFFF;
			if (local55 <= local63) {
				local63 = 0;
			}
			local85 = this.aByteArray85[local59 & 0xFF] & 0xFF;
			local94 = this.aByteArray85[local63 & 0xFF] & 0xFF;
			local76 = Class76_Sub5.anIntArray346[local229];
			for (local99 = 0; local99 < Static410.anInt7198; local99++) {
				local108 = Static400.anIntArray525[local99] * this.anInt7042;
				local122 = this.method5426(local94, local76, local30 * local108 >> 12, local85, local229, local42);
				arg0[local99] = local35 * local122 >> 12;
			}
		}
		for (@Pc(299) int local299 = 1; local299 < this.anInt7038; local299++) {
			local35 = this.aShortArray110[local299];
			if (local35 > 8 || local35 < -8) {
				local30 = this.aShortArray111[local299] << 12;
				local42 = this.anInt7042 * local30 >> 12;
				local55 = this.anInt7046 * local30 >> 12;
				local48 = local30 * local12 >> 12;
				local59 = local48 >> 12;
				local63 = local59 + 1;
				local48 &= 0xFFF;
				if (local63 >= local55) {
					local63 = 0;
				}
				local94 = this.aByteArray85[local63 & 0xFF] & 0xFF;
				local76 = Class76_Sub5.anIntArray346[local48];
				local85 = this.aByteArray85[local59 & 0xFF] & 0xFF;
				if (this.aBoolean589 && local299 == this.anInt7038 - 1) {
					for (local99 = 0; local99 < Static410.anInt7198; local99++) {
						local108 = this.anInt7042 * Static400.anIntArray525[local99];
						local122 = this.method5426(local94, local76, local108 * local30 >> 12, local85, local48, local42);
						local122 = arg0[local99] + (local122 * local35 >> 12);
						arg0[local99] = (local122 >> 1) + 2048;
					}
				} else {
					for (local99 = 0; local99 < Static410.anInt7198; local99++) {
						local108 = this.anInt7042 * Static400.anIntArray525[local99];
						local122 = this.method5426(local94, local76, local30 * local108 >> 12, local85, local48, local42);
						arg0[local99] += local122 * local35 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			this.method5430(local15, arg0);
		}
		return local15;
	}
}
