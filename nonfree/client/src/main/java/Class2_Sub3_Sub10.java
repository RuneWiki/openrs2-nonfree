import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!et", name = "G", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!et", name = "L", descriptor = "I")
	public int anInt1628 = 1638;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "I")
	public int anInt1634 = 4;

	@OriginalMember(owner = "client!et", name = "O", descriptor = "[B")
	private byte[] aByteArray15 = new byte[512];

	@OriginalMember(owner = "client!et", name = "U", descriptor = "I")
	public int anInt1635 = 4;

	@OriginalMember(owner = "client!et", name = "V", descriptor = "I")
	public int anInt1636 = 0;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "I")
	public int anInt1633 = 4;

	@OriginalMember(owner = "client!et", name = "W", descriptor = "Z")
	public boolean aBoolean147 = true;

	static {
		new Class140("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			this.method1740(arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.aBoolean147 = arg1.method3124() == 1;
		} else if (arg0 == 1) {
			this.anInt1634 = arg1.method3124();
		} else if (arg0 == 2) {
			this.anInt1628 = arg1.method3108();
			if (this.anInt1628 < 0) {
				this.aShortArray20 = new short[this.anInt1634];
				for (@Pc(71) int local71 = 0; local71 < this.anInt1634; local71++) {
					this.aShortArray20[local71] = (short) arg1.method3108();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt1635 = this.anInt1633 = arg1.method3124();
			return;
		} else if (arg0 == 4) {
			this.anInt1636 = arg1.method3124();
			return;
		} else if (arg0 == 5) {
			this.anInt1635 = arg1.method3124();
			return;
		} else if (arg0 == 6) {
			this.anInt1633 = arg1.method3124();
			return;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)I")
	private int method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg4 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = arg4 & 0xFFF;
		@Pc(21) int local21 = local9 & 0xFF;
		if (arg3 <= local13) {
			local13 = 0;
		}
		local13 &= 0xFF;
		@Pc(43) int local43 = local17 - 4096;
		@Pc(47) int local47 = arg0 - 4096;
		@Pc(57) int local57 = this.aByteArray15[local21 + arg2] & 0x3;
		@Pc(61) int local61 = Class173.anIntArray449[local17];
		@Pc(77) int local77;
		if (local57 <= 1) {
			local77 = local57 == 0 ? local17 + arg0 : -local17 + arg0;
		} else {
			local77 = local57 == 2 ? local17 - arg0 : -local17 + -arg0;
		}
		local57 = this.aByteArray15[arg2 + local13] & 0x3;
		@Pc(121) int local121;
		if (local57 <= 1) {
			local121 = local57 == 0 ? arg0 + local43 : arg0 + -local43;
		} else {
			local121 = local57 == 2 ? local43 - arg0 : -local43 - arg0;
		}
		local57 = this.aByteArray15[arg1 + local21] & 0x3;
		@Pc(155) int local155 = (local61 * (local121 - local77) >> 12) + local77;
		if (local57 <= 1) {
			local77 = local57 == 0 ? local47 + local17 : local47 + -local17;
		} else {
			local77 = local57 == 2 ? local17 - local47 : -local47 + -local17;
		}
		local57 = this.aByteArray15[arg1 + local13] & 0x3;
		if (local57 <= 1) {
			local121 = local57 == 0 ? local43 + local47 : -local43 + local47;
		} else {
			local121 = local57 == 2 ? local43 - local47 : -local43 + -local47;
		}
		@Pc(246) int local246 = ((local121 - local77) * local61 >> 12) + local77;
		return local155 + (arg5 * (local246 - local155) >> 12);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(B)V")
	private void method1739() {
		@Pc(23) int local23;
		if (this.anInt1628 > 0) {
			this.aShortArray21 = new short[this.anInt1634];
			this.aShortArray20 = new short[this.anInt1634];
			for (local23 = 0; local23 < this.anInt1634; local23++) {
				this.aShortArray20[local23] = (short) (Math.pow((double) ((float) this.anInt1628 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray21[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray20 != null && this.aShortArray20.length == this.anInt1634) {
			this.aShortArray21 = new short[this.anInt1634];
			for (local23 = 0; local23 < this.anInt1634; local23++) {
				this.aShortArray21[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[I)V")
	public void method1740(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static76.anIntArray121[arg0] * this.anInt1633;
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(98) int local98;
		@Pc(54) int local54;
		@Pc(48) int local48;
		@Pc(41) int local41;
		@Pc(84) int local84;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(93) int local93;
		@Pc(80) int local80;
		if (this.anInt1634 == 1) {
			local27 = this.aShortArray20[0];
			local34 = this.aShortArray21[0] << 12;
			local41 = local34 * this.anInt1633 >> 12;
			local48 = this.anInt1635 * local34 >> 12;
			local54 = local34 * local12 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			if (local62 >= local41) {
				local62 = 0;
			}
			local54 &= 0xFFF;
			local80 = this.aByteArray15[local62 & 0xFF] & 0xFF;
			local84 = Class173.anIntArray449[local54];
			local93 = this.aByteArray15[local58 & 0xFF] & 0xFF;
			if (this.aBoolean147) {
				for (local98 = 0; local98 < Static263.anInt5504; local98++) {
					local107 = Static269.anIntArray507[local98] * this.anInt1635;
					local121 = this.method1738(local54, local80, local93, local48, local34 * local107 >> 12, local84);
					local121 = local121 * local27 >> 12;
					arg1[local98] = (local121 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static263.anInt5504; local98++) {
					local107 = this.anInt1635 * Static269.anIntArray507[local98];
					local121 = this.method1738(local54, local80, local93, local48, local107 * local34 >> 12, local84);
					arg1[local98] = local121 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray20[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray21[0] << 12;
			local48 = this.anInt1635 * local34 >> 12;
			local41 = local34 * this.anInt1633 >> 12;
			local54 = local34 * local12 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			@Pc(230) int local230 = local54 & 0xFFF;
			if (local62 >= local41) {
				local62 = 0;
			}
			local84 = Class173.anIntArray449[local230];
			local80 = this.aByteArray15[local62 & 0xFF] & 0xFF;
			local93 = this.aByteArray15[local58 & 0xFF] & 0xFF;
			for (local98 = 0; local98 < Static263.anInt5504; local98++) {
				local107 = this.anInt1635 * Static269.anIntArray507[local98];
				local121 = this.method1738(local230, local80, local93, local48, local34 * local107 >> 12, local84);
				arg1[local98] = local27 * local121 >> 12;
			}
		}
		for (@Pc(304) int local304 = 1; local304 < this.anInt1634; local304++) {
			local27 = this.aShortArray20[local304];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray21[local304] << 12;
				local48 = local34 * this.anInt1635 >> 12;
				local54 = local12 * local34 >> 12;
				local41 = this.anInt1633 * local34 >> 12;
				local58 = local54 >> 12;
				local62 = local58 + 1;
				if (local62 >= local41) {
					local62 = 0;
				}
				local54 &= 0xFFF;
				local84 = Class173.anIntArray449[local54];
				local93 = this.aByteArray15[local58 & 0xFF] & 0xFF;
				local80 = this.aByteArray15[local62 & 0xFF] & 0xFF;
				if (this.aBoolean147 && local304 == this.anInt1634 - 1) {
					for (local98 = 0; local98 < Static263.anInt5504; local98++) {
						local107 = Static269.anIntArray507[local98] * this.anInt1635;
						local121 = this.method1738(local54, local80, local93, local48, local34 * local107 >> 12, local84);
						local121 = (local27 * local121 >> 12) + arg1[local98];
						arg1[local98] = (local121 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static263.anInt5504; local98++) {
						local107 = Static269.anIntArray507[local98] * this.anInt1635;
						local121 = this.method1738(local54, local80, local93, local48, local107 * local34 >> 12, local84);
						arg1[local98] += local27 * local121 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.aByteArray15 = Static6.method86(this.anInt1636);
		this.method1739();
		for (@Pc(19) int local19 = this.anInt1634 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray20[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt1634--;
		}
	}
}
