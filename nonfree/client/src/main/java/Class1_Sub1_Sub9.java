import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!de", name = "eb", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	public int anInt1103 = 0;

	@OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
	public int anInt1109 = 4;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "[B")
	private byte[] aByteArray15 = new byte[512];

	@OriginalMember(owner = "client!de", name = "db", descriptor = "I")
	public int anInt1112 = 1638;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	public int anInt1106 = 4;

	@OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
	public int anInt1114 = 4;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V")
	private void method901() {
		@Pc(27) int local27;
		if (this.anInt1112 > 0) {
			this.aShortArray21 = new short[this.anInt1106];
			this.aShortArray22 = new short[this.anInt1106];
			for (local27 = 0; local27 < this.anInt1106; local27++) {
				this.aShortArray21[local27] = (short) (Math.pow((double) ((float) this.anInt1112 / 4096.0F), (double) local27) * 4096.0D);
				this.aShortArray22[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		} else if (this.aShortArray21 != null && this.aShortArray21.length == this.anInt1106) {
			this.aShortArray22 = new short[this.anInt1106];
			for (local27 = 0; local27 < this.anInt1106; local27++) {
				this.aShortArray22[local27] = (short) Math.pow(2.0D, (double) local27);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([III)V")
	public void method902(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1114 * Static219.anIntArray515[arg1];
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(40) int local40;
		@Pc(24) short local24;
		@Pc(106) int local106;
		@Pc(46) int local46;
		@Pc(60) int local60;
		@Pc(53) int local53;
		@Pc(104) int local104;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(87) int local87;
		@Pc(96) int local96;
		if (this.anInt1106 == 1) {
			local24 = this.aShortArray21[0];
			local40 = this.aShortArray22[0] << 12;
			local46 = local12 * local40 >> 12;
			local60 = local40 * this.anInt1109 >> 12;
			local53 = this.anInt1114 * local40 >> 12;
			local64 = local46 >> 12;
			local68 = local64 + 1;
			local46 &= 0xFFF;
			if (local53 <= local68) {
				local68 = 0;
			}
			local96 = this.aByteArray15[local68 & 0xFF] & 0xFF;
			local104 = Class1_Sub2_Sub1_Sub2.anIntArray374[local46];
			local87 = this.aByteArray15[local64 & 0xFF] & 0xFF;
			if (this.aBoolean94) {
				for (local106 = 0; local106 < Static131.anInt2513; local106++) {
					local120 = Static105.anIntArray261[local106] * this.anInt1109;
					local134 = this.method903(local120 * local40 >> 12, local46, local96, local60, local104, local87);
					local134 = local24 * local134 >> 12;
					arg0[local106] = (local134 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static131.anInt2513; local106++) {
					local120 = this.anInt1109 * Static105.anIntArray261[local106];
					local134 = this.method903(local40 * local120 >> 12, local46, local96, local60, local104, local87);
					arg0[local106] = local134 * local24 >> 12;
				}
			}
			return;
		}
		local24 = this.aShortArray21[0];
		if (local24 > 8 || local24 < -8) {
			local40 = this.aShortArray22[0] << 12;
			local46 = local40 * local12 >> 12;
			local53 = local40 * this.anInt1114 >> 12;
			local60 = local40 * this.anInt1109 >> 12;
			local64 = local46 >> 12;
			local68 = local64 + 1;
			if (local68 >= local53) {
				local68 = 0;
			}
			local87 = this.aByteArray15[local64 & 0xFF] & 0xFF;
			local96 = this.aByteArray15[local68 & 0xFF] & 0xFF;
			local46 &= 0xFFF;
			local104 = Class1_Sub2_Sub1_Sub2.anIntArray374[local46];
			for (local106 = 0; local106 < Static131.anInt2513; local106++) {
				local120 = this.anInt1109 * Static105.anIntArray261[local106];
				local134 = this.method903(local120 * local40 >> 12, local46, local96, local60, local104, local87);
				arg0[local106] = local24 * local134 >> 12;
			}
		}
		for (@Pc(147) int local147 = 1; local147 < this.anInt1106; local147++) {
			local24 = this.aShortArray21[local147];
			if (local24 > 8 || local24 < -8) {
				local40 = this.aShortArray22[local147] << 12;
				local60 = this.anInt1109 * local40 >> 12;
				local53 = this.anInt1114 * local40 >> 12;
				local46 = local40 * local12 >> 12;
				local64 = local46 >> 12;
				local68 = local64 + 1;
				local87 = this.aByteArray15[local64 & 0xFF] & 0xFF;
				local46 &= 0xFFF;
				local104 = Class1_Sub2_Sub1_Sub2.anIntArray374[local46];
				if (local68 >= local53) {
					local68 = 0;
				}
				local96 = this.aByteArray15[local68 & 0xFF] & 0xFF;
				if (this.aBoolean94 && this.anInt1106 - 1 == local147) {
					for (local106 = 0; local106 < Static131.anInt2513; local106++) {
						local120 = Static105.anIntArray261[local106] * this.anInt1109;
						local134 = this.method903(local120 * local40 >> 12, local46, local96, local60, local104, local87);
						local134 = (local134 * local24 >> 12) + arg0[local106];
						arg0[local106] = (local134 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static131.anInt2513; local106++) {
						local120 = this.anInt1109 * Static105.anIntArray261[local106];
						local134 = this.method903(local120 * local40 >> 12, local46, local96, local60, local104, local87);
						arg0[local106] += local134 * local24 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			this.method902(local9, arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean94 = arg0.method3122() == 1;
		} else if (arg1 == 1) {
			this.anInt1106 = arg0.method3122();
		} else if (arg1 == 2) {
			this.anInt1112 = arg0.method3064();
			if (this.anInt1112 < 0) {
				this.aShortArray21 = new short[this.anInt1106];
				for (@Pc(86) int local86 = 0; local86 < this.anInt1106; local86++) {
					this.aShortArray21[local86] = (short) arg0.method3064();
				}
			}
		} else if (arg1 == 3) {
			this.anInt1109 = this.anInt1114 = arg0.method3122();
		} else if (arg1 == 4) {
			this.anInt1103 = arg0.method3122();
		} else if (arg1 == 5) {
			this.anInt1109 = arg0.method3122();
		} else if (arg1 == 6) {
			this.anInt1114 = arg0.method3122();
		}
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		this.aByteArray15 = Static286.method3892(this.anInt1103);
		this.method901();
		for (@Pc(27) int local27 = this.anInt1106 - 1; local27 >= 1; local27--) {
			@Pc(37) short local37 = this.aShortArray21[local27];
			if (local37 > 8 || local37 < -8) {
				break;
			}
			this.anInt1106--;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)I")
	private int method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 - 4096;
		@Pc(21) int local21 = arg0 >> 12;
		@Pc(25) int local25 = arg0 & 0xFFF;
		@Pc(29) int local29 = Class1_Sub2_Sub1_Sub2.anIntArray374[local25];
		@Pc(33) int local33 = local25 - 4096;
		@Pc(37) int local37 = local21 + 1;
		if (arg3 <= local37) {
			local37 = 0;
		}
		local37 &= 0xFF;
		local21 &= 0xFF;
		@Pc(60) int local60 = this.aByteArray15[local21 + arg5] & 0x3;
		@Pc(80) int local80;
		if (local60 <= 1) {
			local80 = local60 == 0 ? local25 + arg1 : -local25 + arg1;
		} else {
			local80 = local60 == 2 ? local25 - arg1 : -arg1 + -local25;
		}
		local60 = this.aByteArray15[local37 + arg5] & 0x3;
		@Pc(127) int local127;
		if (local60 > 1) {
			local127 = local60 == 2 ? local33 - arg1 : -arg1 + -local33;
		} else {
			local127 = local60 == 0 ? local33 + arg1 : arg1 - local33;
		}
		local60 = this.aByteArray15[local21 + arg2] & 0x3;
		@Pc(162) int local162 = local80 + (local29 * (local127 - local80) >> 12);
		if (local60 <= 1) {
			local80 = local60 == 0 ? local9 + local25 : -local25 + local9;
		} else {
			local80 = local60 == 2 ? local25 - local9 : -local25 - local9;
		}
		local60 = this.aByteArray15[local37 + arg2] & 0x3;
		if (local60 > 1) {
			local127 = local60 == 2 ? local33 - local9 : -local33 + -local9;
		} else {
			local127 = local60 == 0 ? local33 + local9 : local9 + -local33;
		}
		@Pc(247) int local247 = local80 + ((local127 - local80) * local29 >> 12);
		return ((local247 - local162) * arg4 >> 12) + local162;
	}
}
