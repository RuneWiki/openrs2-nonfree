import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class12_Sub1_Sub33 extends Class12_Sub1 {

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "[S")
	private short[] aShortArray115;

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "[S")
	private short[] aShortArray116;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
	public int anInt8609 = 4;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	public int anInt8608 = 4;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	public int anInt8613 = 1638;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "[B")
	private byte[] aByteArray108 = new byte[512];

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
	public int anInt8610 = 0;

	@OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
	public int anInt8619 = 4;

	@OriginalMember(owner = "client!tj", name = "X", descriptor = "Z")
	public boolean aBoolean611 = true;

	static {
		new Class88("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)I")
	private int method7076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg5 & 0xFFF;
		if (arg3 <= local13) {
			local13 = 0;
		}
		@Pc(30) int local30 = local21 - 4096;
		local13 &= 0xFF;
		@Pc(43) int local43 = arg2 - 4096;
		@Pc(53) int local53 = this.aByteArray108[local17 + arg4] & 0x3;
		@Pc(57) int local57 = Class224.anIntArray451[local21];
		@Pc(73) int local73;
		if (local53 > 1) {
			local73 = local53 == 2 ? local21 - arg2 : -local21 - arg2;
		} else {
			local73 = local53 == 0 ? local21 + arg2 : arg2 - local21;
		}
		local53 = this.aByteArray108[local13 + arg4] & 0x3;
		@Pc(117) int local117;
		if (local53 <= 1) {
			local117 = local53 == 0 ? arg2 + local30 : arg2 + -local30;
		} else {
			local117 = local53 == 2 ? local30 - arg2 : -local30 - arg2;
		}
		local53 = this.aByteArray108[arg0 + local17] & 0x3;
		@Pc(153) int local153 = local73 + (local57 * (local117 - local73) >> 12);
		if (local53 > 1) {
			local73 = local53 == 2 ? local21 - local43 : -local43 + -local21;
		} else {
			local73 = local53 == 0 ? local21 + local43 : -local21 + local43;
		}
		local53 = this.aByteArray108[local13 + arg0] & 0x3;
		if (local53 <= 1) {
			local117 = local53 == 0 ? local43 + local30 : local43 - local30;
		} else {
			local117 = local53 == 2 ? local30 - local43 : -local43 + -local30;
		}
		@Pc(236) int local236 = local73 + ((local117 - local73) * local57 >> 12);
		return local153 + (arg1 * (local236 - local153) >> 12);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean611 = arg0.method5216() == 1;
		} else if (arg1 == 1) {
			this.anInt8619 = arg0.method5216();
		} else if (arg1 == 2) {
			this.anInt8613 = arg0.method5217();
			if (this.anInt8613 < 0) {
				this.aShortArray115 = new short[this.anInt8619];
				for (@Pc(67) int local67 = 0; local67 < this.anInt8619; local67++) {
					this.aShortArray115[local67] = (short) arg0.method5217();
				}
			}
		} else if (arg1 == 3) {
			this.anInt8609 = this.anInt8608 = arg0.method5216();
		} else if (arg1 == 4) {
			this.anInt8610 = arg0.method5216();
		} else if (arg1 == 5) {
			this.anInt8609 = arg0.method5216();
		} else if (arg1 == 6) {
			this.anInt8608 = arg0.method5216();
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
	private void method7077() {
		@Pc(39) int local39;
		if (this.anInt8613 > 0) {
			this.aShortArray115 = new short[this.anInt8619];
			this.aShortArray116 = new short[this.anInt8619];
			for (local39 = 0; local39 < this.anInt8619; local39++) {
				this.aShortArray115[local39] = (short) (Math.pow((double) ((float) this.anInt8613 / 4096.0F), (double) local39) * 4096.0D);
				this.aShortArray116[local39] = (short) Math.pow(2.0D, (double) local39);
			}
		} else if (this.aShortArray115 != null && this.aShortArray115.length == this.anInt8619) {
			this.aShortArray116 = new short[this.anInt8619];
			for (local39 = 0; local39 < this.anInt8619; local39++) {
				this.aShortArray116[local39] = (short) Math.pow(2.0D, (double) local39);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			this.method7080(arg0, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.aByteArray108 = Static4.method195(this.anInt8610);
		this.method7077();
		for (@Pc(25) int local25 = this.anInt8619 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray115[local25];
			if (local32 > 8) {
				return;
			}
			if (local32 < -8) {
				return;
			}
			this.anInt8619--;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[I)V")
	public void method7080(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static353.anIntArray458[arg0] * this.anInt8608;
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(102) int local102;
		@Pc(40) int local40;
		@Pc(54) int local54;
		@Pc(47) int local47;
		@Pc(97) int local97;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(93) int local93;
		@Pc(84) int local84;
		if (this.anInt8619 == 1) {
			local27 = this.aShortArray115[0];
			local34 = this.aShortArray116[0] << 12;
			local40 = local34 * local12 >> 12;
			local47 = this.anInt8608 * local34 >> 12;
			local54 = local34 * this.anInt8609 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			local40 &= 0xFFF;
			if (local62 >= local47) {
				local62 = 0;
			}
			local84 = this.aByteArray108[local62 & 0xFF] & 0xFF;
			local93 = this.aByteArray108[local58 & 0xFF] & 0xFF;
			local97 = Class224.anIntArray451[local40];
			if (this.aBoolean611) {
				for (local102 = 0; local102 < Static357.anInt6670; local102++) {
					local111 = Static347.anIntArray455[local102] * this.anInt8609;
					local125 = this.method7076(local84, local97, local40, local54, local93, local34 * local111 >> 12);
					local125 = local27 * local125 >> 12;
					arg1[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static357.anInt6670; local102++) {
					local111 = this.anInt8609 * Static347.anIntArray455[local102];
					local125 = this.method7076(local84, local97, local40, local54, local93, local34 * local111 >> 12);
					arg1[local102] = local125 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray115[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray116[0] << 12;
			local54 = local34 * this.anInt8609 >> 12;
			local40 = local34 * local12 >> 12;
			local47 = this.anInt8608 * local34 >> 12;
			local58 = local40 >> 12;
			local62 = local58 + 1;
			@Pc(236) int local236 = local40 & 0xFFF;
			if (local47 <= local62) {
				local62 = 0;
			}
			local93 = this.aByteArray108[local58 & 0xFF] & 0xFF;
			local84 = this.aByteArray108[local62 & 0xFF] & 0xFF;
			local97 = Class224.anIntArray451[local236];
			for (local102 = 0; local102 < Static357.anInt6670; local102++) {
				local111 = this.anInt8609 * Static347.anIntArray455[local102];
				local125 = this.method7076(local84, local97, local236, local54, local93, local34 * local111 >> 12);
				arg1[local102] = local27 * local125 >> 12;
			}
		}
		for (@Pc(310) int local310 = 1; local310 < this.anInt8619; local310++) {
			local27 = this.aShortArray115[local310];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray116[local310] << 12;
				local40 = local34 * local12 >> 12;
				local54 = local34 * this.anInt8609 >> 12;
				local47 = this.anInt8608 * local34 >> 12;
				local58 = local40 >> 12;
				local62 = local58 + 1;
				if (local47 <= local62) {
					local62 = 0;
				}
				local40 &= 0xFFF;
				local97 = Class224.anIntArray451[local40];
				local84 = this.aByteArray108[local62 & 0xFF] & 0xFF;
				local93 = this.aByteArray108[local58 & 0xFF] & 0xFF;
				if (this.aBoolean611 && local310 == this.anInt8619 - 1) {
					for (local102 = 0; local102 < Static357.anInt6670; local102++) {
						local111 = Static347.anIntArray455[local102] * this.anInt8609;
						local125 = this.method7076(local84, local97, local40, local54, local93, local34 * local111 >> 12);
						local125 = (local125 * local27 >> 12) + arg1[local102];
						arg1[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static357.anInt6670; local102++) {
						local111 = this.anInt8609 * Static347.anIntArray455[local102];
						local125 = this.method7076(local84, local97, local40, local54, local93, local111 * local34 >> 12);
						arg1[local102] += local27 * local125 >> 12;
					}
				}
			}
		}
	}
}
