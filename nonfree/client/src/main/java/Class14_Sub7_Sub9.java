import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class14_Sub7_Sub9 extends Class14_Sub7 {

	@OriginalMember(owner = "client!eja", name = "W", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!eja", name = "J", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!eja", name = "O", descriptor = "I")
	public int anInt2126 = 0;

	@OriginalMember(owner = "client!eja", name = "ab", descriptor = "I")
	public int anInt2128 = 1638;

	@OriginalMember(owner = "client!eja", name = "bb", descriptor = "Z")
	public boolean aBoolean148 = true;

	@OriginalMember(owner = "client!eja", name = "M", descriptor = "I")
	public int anInt2136 = 4;

	@OriginalMember(owner = "client!eja", name = "T", descriptor = "I")
	public int anInt2129 = 4;

	@OriginalMember(owner = "client!eja", name = "U", descriptor = "[B")
	private byte[] aByteArray37 = new byte[512];

	@OriginalMember(owner = "client!eja", name = "K", descriptor = "I")
	public int anInt2137 = 4;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			this.method2055(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIIIIII)I")
	private int method2052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg4 >> 12;
		@Pc(19) int local19 = local15 + 1;
		@Pc(23) int local23 = arg4 & 0xFFF;
		@Pc(27) int local27 = local15 & 0xFF;
		if (local19 >= arg1) {
			local19 = 0;
		}
		local19 &= 0xFF;
		@Pc(40) int local40 = arg3 - 4096;
		@Pc(44) int local44 = local23 - 4096;
		@Pc(48) int local48 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local23];
		@Pc(57) int local57 = this.aByteArray37[local27 + arg5] & 0x3;
		@Pc(77) int local77;
		if (local57 <= 1) {
			local77 = local57 == 0 ? local23 + arg3 : arg3 + -local23;
		} else {
			local77 = local57 == 2 ? local23 - arg3 : -local23 + -arg3;
		}
		local57 = this.aByteArray37[arg5 + local19] & 0x3;
		@Pc(125) int local125;
		if (local57 > 1) {
			local125 = local57 == 2 ? local44 - arg3 : -arg3 + -local44;
		} else {
			local125 = local57 == 0 ? local44 + arg3 : arg3 - local44;
		}
		local57 = this.aByteArray37[local27 + arg2] & 0x3;
		@Pc(161) int local161 = local77 + (local48 * (local125 - local77) >> 12);
		if (local57 <= 1) {
			local77 = local57 == 0 ? local23 + local40 : local40 - local23;
		} else {
			local77 = local57 == 2 ? local23 - local40 : -local40 + -local23;
		}
		local57 = this.aByteArray37[arg2 + local19] & 0x3;
		if (local57 > 1) {
			local125 = local57 == 2 ? local44 - local40 : -local44 - local40;
		} else {
			local125 = local57 == 0 ? local40 + local44 : -local44 + local40;
		}
		@Pc(249) int local249 = local77 + (local48 * (local125 - local77) >> 12);
		return local161 + (arg0 * (local249 - local161) >> 12);
	}

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "(B)V")
	private void method2053() {
		@Pc(30) int local30;
		if (this.anInt2128 > 0) {
			this.aShortArray32 = new short[this.anInt2136];
			this.aShortArray31 = new short[this.anInt2136];
			for (local30 = 0; local30 < this.anInt2136; local30++) {
				this.aShortArray32[local30] = (short) (int) (Math.pow((double) ((float) this.anInt2128 / 4096.0F), (double) local30) * 4096.0D);
				this.aShortArray31[local30] = (short) (int) Math.pow(2.0D, (double) local30);
			}
		} else if (this.aShortArray32 != null && this.anInt2136 == this.aShortArray32.length) {
			this.aShortArray31 = new short[this.anInt2136];
			for (local30 = 0; local30 < this.anInt2136; local30++) {
				this.aShortArray31[local30] = (short) (int) Math.pow(2.0D, (double) local30);
			}
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.aBoolean148 = arg1.method7695(106) == 1;
		} else if (arg0 == 1) {
			this.anInt2136 = arg1.method7695(123);
		} else if (arg0 == 2) {
			this.anInt2128 = arg1.method7752();
			if (this.anInt2128 < 0) {
				this.aShortArray32 = new short[this.anInt2136];
				for (@Pc(86) int local86 = 0; local86 < this.anInt2136; local86++) {
					this.aShortArray32[local86] = (short) arg1.method7752();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2129 = this.anInt2137 = arg1.method7695(111);
		} else if (arg0 == 4) {
			this.anInt2126 = arg1.method7695(115);
		} else if (arg0 == 5) {
			this.anInt2129 = arg1.method7695(100);
		} else if (arg0 == 6) {
			this.anInt2137 = arg1.method7695(95);
		}
	}

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		this.aByteArray37 = Static574.method8194(this.anInt2126);
		this.method2053();
		for (@Pc(17) int local17 = this.anInt2136 - 1; local17 >= 1; local17--) {
			@Pc(23) short local23 = this.aShortArray32[local17];
			if (local23 > 8 || local23 < -8) {
				break;
			}
			this.anInt2136--;
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "([III)V")
	public void method2055(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = Static655.anIntArray573[arg1] * this.anInt2137;
		@Pc(106) int local106;
		@Pc(120) int local120;
		@Pc(34) int local34;
		@Pc(27) short local27;
		@Pc(98) int local98;
		@Pc(54) int local54;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(75) int local75;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(84) int local84;
		@Pc(93) int local93;
		if (this.anInt2136 == 1) {
			local27 = this.aShortArray32[0];
			local34 = this.aShortArray31[0] << 12;
			local41 = local34 * this.anInt2129 >> 12;
			local48 = local34 * this.anInt2137 >> 12;
			local54 = local34 * local10 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			if (local62 >= local48) {
				local62 = 0;
			}
			local54 &= 0xFFF;
			local75 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local54];
			local84 = this.aByteArray37[local58 & 0xFF] & 0xFF;
			local93 = this.aByteArray37[local62 & 0xFF] & 0xFF;
			if (this.aBoolean148) {
				for (local98 = 0; local98 < Static613.anInt10114; local98++) {
					local106 = Static588.anIntArray506[local98] * this.anInt2129;
					local120 = this.method2052(local75, local41, local93, local54, local106 * local34 >> 12, local84);
					local120 = local27 * local120 >> 12;
					arg0[local98] = (local120 >> 1) + 2048;
				}
			} else {
				for (local98 = 0; local98 < Static613.anInt10114; local98++) {
					local106 = this.anInt2129 * Static588.anIntArray506[local98];
					local120 = this.method2052(local75, local41, local93, local54, local106 * local34 >> 12, local84);
					arg0[local98] = local27 * local120 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray32[0];
		if (local27 > 8 || local27 < -8) {
			local34 = this.aShortArray31[0] << 12;
			local41 = local34 * this.anInt2129 >> 12;
			local54 = local10 * local34 >> 12;
			local48 = this.anInt2137 * local34 >> 12;
			local58 = local54 >> 12;
			local62 = local58 + 1;
			@Pc(234) int local234 = local54 & 0xFFF;
			if (local62 >= local48) {
				local62 = 0;
			}
			local75 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local234];
			local93 = this.aByteArray37[local62 & 0xFF] & 0xFF;
			local84 = this.aByteArray37[local58 & 0xFF] & 0xFF;
			for (local98 = 0; local98 < Static613.anInt10114; local98++) {
				local106 = this.anInt2129 * Static588.anIntArray506[local98];
				local120 = this.method2052(local75, local41, local93, local234, local34 * local106 >> 12, local84);
				arg0[local98] = local27 * local120 >> 12;
			}
		}
		for (@Pc(299) int local299 = 1; local299 < this.anInt2136; local299++) {
			local27 = this.aShortArray32[local299];
			if (local27 > 8 || local27 < -8) {
				local34 = this.aShortArray31[local299] << 12;
				local41 = local34 * this.anInt2129 >> 12;
				local48 = local34 * this.anInt2137 >> 12;
				local54 = local34 * local10 >> 12;
				local58 = local54 >> 12;
				local62 = local58 + 1;
				local54 &= 0xFFF;
				if (local48 <= local62) {
					local62 = 0;
				}
				local75 = Class4_Sub3_Sub3_Sub3_Sub1.anIntArray173[local54];
				local84 = this.aByteArray37[local58 & 0xFF] & 0xFF;
				local93 = this.aByteArray37[local62 & 0xFF] & 0xFF;
				if (this.aBoolean148 && local299 == this.anInt2136 - 1) {
					for (local98 = 0; local98 < Static613.anInt10114; local98++) {
						local106 = this.anInt2129 * Static588.anIntArray506[local98];
						local120 = this.method2052(local75, local41, local93, local54, local106 * local34 >> 12, local84);
						local120 = arg0[local98] + (local120 * local27 >> 12);
						arg0[local98] = (local120 >> 1) + 2048;
					}
				} else {
					for (local98 = 0; local98 < Static613.anInt10114; local98++) {
						local106 = this.anInt2129 * Static588.anIntArray506[local98];
						local120 = this.method2052(local75, local41, local93, local54, local34 * local106 >> 12, local84);
						arg0[local98] += local27 * local120 >> 12;
					}
				}
			}
		}
	}
}
