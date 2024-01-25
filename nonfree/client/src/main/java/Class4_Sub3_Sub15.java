import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class4_Sub3_Sub15 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Z")
	public boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "[B")
	private byte[] aByteArray53 = new byte[512];

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	public int anInt3765 = 4;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
	public int anInt3761 = 4;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
	public int anInt3769 = 1638;

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
	public int anInt3771 = 0;

	@OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
	public int anInt3774 = 4;

	static {
		new Class21("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean237 = arg1.method4614() == 1;
		} else if (arg0 == 1) {
			this.anInt3761 = arg1.method4614();
		} else if (arg0 == 2) {
			this.anInt3769 = arg1.method4586();
			if (this.anInt3769 < 0) {
				this.aShortArray50 = new short[this.anInt3761];
				for (@Pc(68) int local68 = 0; local68 < this.anInt3761; local68++) {
					this.aShortArray50[local68] = (short) arg1.method4586();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3774 = this.anInt3765 = arg1.method4614();
		} else if (arg0 == 4) {
			this.anInt3771 = arg1.method4614();
		} else if (arg0 == 5) {
			this.anInt3774 = arg1.method4614();
		} else if (arg0 == 6) {
			this.anInt3765 = arg1.method4614();
		}
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		this.aByteArray53 = Static74.method1630(this.anInt3771);
		this.method3388();
		for (@Pc(25) int local25 = this.anInt3761 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray50[local25];
			if (local32 > 8 || local32 < -8) {
				return;
			}
			this.anInt3761--;
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			this.method3386(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V")
	public void method3386(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt3765 * Static376.anIntArray531[arg1];
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(102) int local102;
		@Pc(47) int local47;
		@Pc(41) int local41;
		@Pc(54) int local54;
		@Pc(88) int local88;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(84) int local84;
		@Pc(97) int local97;
		if (this.anInt3761 == 1) {
			local27 = this.aShortArray50[0];
			local34 = this.aShortArray49[0] << 12;
			local41 = this.anInt3774 * local34 >> 12;
			local47 = local34 * local12 >> 12;
			local54 = this.anInt3765 * local34 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			local47 &= 0xFFF;
			if (local54 <= local62) {
				local62 = 0;
			}
			local84 = this.aByteArray53[local58 & 0xFF] & 0xFF;
			local88 = Class138.anIntArray442[local47];
			local97 = this.aByteArray53[local62 & 0xFF] & 0xFF;
			if (this.aBoolean237) {
				for (local102 = 0; local102 < Static304.anInt5637; local102++) {
					local111 = this.anInt3774 * Static231.anIntArray368[local102];
					local125 = this.method3387(local111 * local34 >> 12, local47, local41, local97, local84, local88);
					local125 = local125 * local27 >> 12;
					arg0[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static304.anInt5637; local102++) {
					local111 = Static231.anIntArray368[local102] * this.anInt3774;
					local125 = this.method3387(local111 * local34 >> 12, local47, local41, local97, local84, local88);
					arg0[local102] = local125 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray50[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray49[0] << 12;
			local54 = local34 * this.anInt3765 >> 12;
			local47 = local12 * local34 >> 12;
			local41 = local34 * this.anInt3774 >> 12;
			local58 = local47 >> 12;
			local62 = local58 + 1;
			@Pc(234) int local234 = local47 & 0xFFF;
			if (local54 <= local62) {
				local62 = 0;
			}
			local84 = this.aByteArray53[local58 & 0xFF] & 0xFF;
			local97 = this.aByteArray53[local62 & 0xFF] & 0xFF;
			local88 = Class138.anIntArray442[local234];
			for (local102 = 0; local102 < Static304.anInt5637; local102++) {
				local111 = Static231.anIntArray368[local102] * this.anInt3774;
				local125 = this.method3387(local111 * local34 >> 12, local234, local41, local97, local84, local88);
				arg0[local102] = local125 * local27 >> 12;
			}
		}
		for (@Pc(304) int local304 = 1; local304 < this.anInt3761; local304++) {
			local27 = this.aShortArray50[local304];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray49[local304] << 12;
				local41 = this.anInt3774 * local34 >> 12;
				local47 = local12 * local34 >> 12;
				local54 = local34 * this.anInt3765 >> 12;
				local58 = local47 >> 12;
				local62 = local58 + 1;
				if (local54 <= local62) {
					local62 = 0;
				}
				local47 &= 0xFFF;
				local97 = this.aByteArray53[local62 & 0xFF] & 0xFF;
				local84 = this.aByteArray53[local58 & 0xFF] & 0xFF;
				local88 = Class138.anIntArray442[local47];
				if (this.aBoolean237 && this.anInt3761 - 1 == local304) {
					for (local102 = 0; local102 < Static304.anInt5637; local102++) {
						local111 = Static231.anIntArray368[local102] * this.anInt3774;
						local125 = this.method3387(local111 * local34 >> 12, local47, local41, local97, local84, local88);
						local125 = arg0[local102] + (local27 * local125 >> 12);
						arg0[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static304.anInt5637; local102++) {
						local111 = this.anInt3774 * Static231.anIntArray368[local102];
						local125 = this.method3387(local34 * local111 >> 12, local47, local41, local97, local84, local88);
						arg0[local102] += local27 * local125 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIII)I")
	private int method3387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = arg0 & 0xFFF;
		if (arg2 <= local18) {
			local18 = 0;
		}
		local14 &= 0xFF;
		local18 &= 0xFF;
		@Pc(39) int local39 = arg1 - 4096;
		@Pc(43) int local43 = local22 - 4096;
		@Pc(47) int local47 = Class138.anIntArray442[local22];
		@Pc(56) int local56 = this.aByteArray53[arg4 + local14] & 0x3;
		@Pc(74) int local74;
		if (local56 > 1) {
			local74 = local56 == 2 ? local22 - arg1 : -local22 + -arg1;
		} else {
			local74 = local56 == 0 ? arg1 + local22 : -local22 + arg1;
		}
		local56 = this.aByteArray53[local18 + arg4] & 0x3;
		@Pc(110) int local110;
		if (local56 <= 1) {
			local110 = local56 == 0 ? local43 + arg1 : -local43 + arg1;
		} else {
			local110 = local56 == 2 ? local43 - arg1 : -local43 - arg1;
		}
		@Pc(139) int local139 = local74 + (local47 * (local110 - local74) >> 12);
		local56 = this.aByteArray53[local14 + arg3] & 0x3;
		if (local56 <= 1) {
			local74 = local56 == 0 ? local39 + local22 : local39 + -local22;
		} else {
			local74 = local56 == 2 ? local22 - local39 : -local39 + -local22;
		}
		local56 = this.aByteArray53[arg3 + local18] & 0x3;
		if (local56 > 1) {
			local110 = local56 == 2 ? local43 - local39 : -local43 - local39;
		} else {
			local110 = local56 == 0 ? local43 + local39 : local39 - local43;
		}
		@Pc(231) int local231 = local74 + (local47 * (local110 - local74) >> 12);
		return ((local231 - local139) * arg5 >> 12) + local139;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	private void method3388() {
		@Pc(19) int local19;
		if (this.anInt3769 > 0) {
			this.aShortArray50 = new short[this.anInt3761];
			this.aShortArray49 = new short[this.anInt3761];
			for (local19 = 0; local19 < this.anInt3761; local19++) {
				this.aShortArray50[local19] = (short) (Math.pow((double) ((float) this.anInt3769 / 4096.0F), (double) local19) * 4096.0D);
				this.aShortArray49[local19] = (short) Math.pow(2.0D, (double) local19);
			}
		} else if (this.aShortArray50 != null && this.aShortArray50.length == this.anInt3761) {
			this.aShortArray49 = new short[this.anInt3761];
			for (local19 = 0; local19 < this.anInt3761; local19++) {
				this.aShortArray49[local19] = (short) Math.pow(2.0D, (double) local19);
			}
		}
	}
}
