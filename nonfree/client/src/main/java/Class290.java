import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class290 {

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "[Z")
	public boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "[I")
	public int[] anIntArray604;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "[I")
	private int[] anIntArray605;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	public int anInt7809;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray172;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "Lclient!ln;")
	public Class211 aClass211_2;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
	public boolean aBoolean599 = false;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public int anInt7796 = -1;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public int anInt7806 = -1;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public int anInt7800 = 99;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "Z")
	public boolean aBoolean603 = false;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public int anInt7802 = 5;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "Z")
	public boolean aBoolean602 = false;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public int anInt7805 = -1;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Z")
	public boolean aBoolean600 = false;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public int anInt7801 = 2;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public int anInt7803 = -1;

	@OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
	public int anInt7812 = -1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIILclient!da;B)Lclient!da;")
	public Class63 method6259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class63 arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray603[arg1];
		@Pc(13) int local13 = this.anIntArray604[arg1];
		@Pc(25) Class1_Sub6_Sub1 local25 = this.aClass211_2.method4272(local13 >> 16);
		@Pc(29) int local29 = local13 & 0xFFFF;
		if (local25 == null) {
			return arg5.method7417(arg6, arg0, true);
		}
		@Pc(39) Class1_Sub6_Sub1 local39 = null;
		if ((this.aBoolean599 || Static444.aBoolean410) && arg4 != -1 && this.anIntArray604.length > arg4) {
			@Pc(58) int local58 = this.anIntArray604[arg4];
			local39 = this.aClass211_2.method4272(local58 >> 16);
			arg4 = local58 & 0xFFFF;
		}
		if (this.aBoolean603) {
			arg0 |= 0x200;
		}
		if (local25.method348(local29)) {
			arg0 |= 0x80;
		}
		if (local25.method346(local29)) {
			arg0 |= 0x100;
		}
		if (local25.method353(local29)) {
			arg0 |= 0x400;
		}
		if (local39 != null) {
			if (local39.method348(arg4)) {
				arg0 |= 0x80;
			}
			if (local39.method346(arg4)) {
				arg0 |= 0x100;
			}
			if (local39.method353(arg4)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(143) Class63 local143 = arg5.method7417(arg6, arg0, true);
		local143.method7410(arg2 - 1, local8, local39, arg3, this.aBoolean603, local29, arg4, local25);
		return local143;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIII)I")
	public int method6261(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray604[arg2];
		@Pc(19) Class1_Sub6_Sub1 local19 = null;
		@Pc(27) Class1_Sub6_Sub1 local27 = this.aClass211_2.method4272(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean599 || Static444.aBoolean410) && arg1 != -1 && this.anIntArray604.length > arg1) {
			local12 = this.anIntArray604[arg1];
			local19 = this.aClass211_2.method4272(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean603) {
			local5 = 512;
		}
		if (local27.method348(local31)) {
			local5 |= 0x80;
		}
		if (local27.method346(local31)) {
			local5 |= 0x100;
		}
		if (local27.method353(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method348(local12)) {
				local5 |= 0x80;
			}
			if (local19.method346(local12)) {
				local5 |= 0x100;
			}
			if (local19.method353(local12)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray605 != null && arg0) {
			@Pc(144) int local144;
			@Pc(155) Class1_Sub6_Sub1 local155;
			if (arg2 < this.anIntArray605.length) {
				local144 = this.anIntArray605[arg2];
				if (local144 != 65535) {
					local155 = this.aClass211_2.method4272(local144 >> 16);
					local144 &= 0xFFFF;
					if (local155 != null) {
						if (local155.method348(local144)) {
							local5 |= 0x80;
						}
						if (local155.method346(local144)) {
							local5 |= 0x100;
						}
						if (local155.method353(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean599 || Static444.aBoolean410) && arg1 != -1 && arg1 < this.anIntArray605.length) {
				local144 = this.anIntArray605[arg1];
				if (local144 != 65535) {
					local155 = this.aClass211_2.method4272(local144 >> 16);
					local144 &= 0xFFFF;
					if (local155 != null) {
						if (local155.method348(local144)) {
							local5 |= 0x80;
						}
						if (local155.method346(local144)) {
							local5 |= 0x100;
						}
						if (local155.method353(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!mo;)V")
	private void method6263(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub35 arg1) {
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(47) int local47;
		@Pc(66) int local66;
		if (arg0 == 1) {
			local22 = arg1.method5771();
			this.anIntArray603 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray603[local28] = arg1.method5771();
			}
			this.anIntArray604 = new int[local22];
			for (local47 = 0; local47 < local22; local47++) {
				this.anIntArray604[local47] = arg1.method5771();
			}
			for (local66 = 0; local66 < local22; local66++) {
				this.anIntArray604[local66] = (arg1.method5771() << 16) + this.anIntArray604[local66];
			}
		} else if (arg0 == 2) {
			this.anInt7806 = arg1.method5771();
		} else if (arg0 == 3) {
			this.aBooleanArray17 = new boolean[256];
			local22 = arg1.method5750();
			for (local28 = 0; local28 < local22; local28++) {
				this.aBooleanArray17[arg1.method5750()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt7802 = arg1.method5750();
		} else if (arg0 == 6) {
			this.anInt7803 = arg1.method5771();
		} else if (arg0 == 7) {
			this.anInt7812 = arg1.method5771();
		} else if (arg0 == 8) {
			this.anInt7800 = arg1.method5750();
		} else if (arg0 == 9) {
			this.anInt7805 = arg1.method5750();
		} else if (arg0 == 10) {
			this.anInt7796 = arg1.method5750();
		} else if (arg0 == 11) {
			this.anInt7801 = arg1.method5750();
		} else if (arg0 == 12) {
			local22 = arg1.method5750();
			this.anIntArray605 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray605[local28] = arg1.method5771();
			}
			for (local47 = 0; local47 < local22; local47++) {
				this.anIntArray605[local47] = (arg1.method5771() << 16) + this.anIntArray605[local47];
			}
		} else if (arg0 == 13) {
			local22 = arg1.method5771();
			this.anIntArrayArray172 = new int[local22][];
			for (local28 = 0; local28 < local22; local28++) {
				local47 = arg1.method5750();
				if (local47 > 0) {
					this.anIntArrayArray172[local28] = new int[local47];
					this.anIntArrayArray172[local28][0] = arg1.method5797();
					for (local66 = 1; local66 < local47; local66++) {
						this.anIntArrayArray172[local28][local66] = arg1.method5771();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean603 = true;
		} else if (arg0 == 15) {
			this.aBoolean599 = true;
		} else if (arg0 == 16) {
			this.aBoolean602 = true;
		} else if (arg0 == 18) {
			this.aBoolean600 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!da;IIZ)Lclient!da;")
	public Class63 method6264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray603[arg4];
		@Pc(13) int local13 = this.anIntArray604[arg4];
		@Pc(21) Class1_Sub6_Sub1 local21 = this.aClass211_2.method4272(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method7417((byte) 1, arg3, true);
		}
		@Pc(35) Class1_Sub6_Sub1 local35 = null;
		if ((this.aBoolean599 || Static444.aBoolean410) && arg1 != -1 && arg1 < this.anIntArray604.length) {
			@Pc(53) int local53 = this.anIntArray604[arg1];
			local35 = this.aClass211_2.method4272(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		@Pc(67) Class1_Sub6_Sub1 local67 = null;
		@Pc(69) Class1_Sub6_Sub1 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray605 != null) {
			if (this.anIntArray605.length > arg4) {
				local71 = this.anIntArray605[arg4];
				if (local71 != 65535) {
					local67 = this.aClass211_2.method4272(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean599 || Static444.aBoolean410) && arg1 != -1 && arg1 < this.anIntArray605.length) {
				local73 = this.anIntArray605[arg1];
				if (local73 != 65535) {
					local69 = this.aClass211_2.method4272(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean603) {
			arg3 |= 0x200;
		}
		if (local21.method348(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method346(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method353(local25)) {
			arg3 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method348(local71)) {
				arg3 |= 0x80;
			}
			if (local67.method346(local71)) {
				arg3 |= 0x100;
			}
			if (local67.method353(local71)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method348(arg1)) {
				arg3 |= 0x80;
			}
			if (local35.method346(arg1)) {
				arg3 |= 0x100;
			}
			if (local35.method353(arg1)) {
				arg3 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method348(local73)) {
				arg3 |= 0x80;
			}
			if (local69.method346(local73)) {
				arg3 |= 0x100;
			}
			if (local69.method353(local73)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(273) Class63 local273 = arg2.method7417((byte) 1, arg3, true);
		local273.method7410(arg0 - 1, local8, local35, 0, this.aBoolean603, local25, arg1, local21);
		if (local67 != null) {
			local273.method7410(arg0 - 1, local8, local69, 0, this.aBoolean603, local71, local73, local67);
		}
		return local273;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!mo;)V")
	public void method6265(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method6263(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
	public void method6267() {
		if (this.anInt7805 == -1) {
			if (this.aBooleanArray17 == null) {
				this.anInt7805 = 0;
			} else {
				this.anInt7805 = 2;
			}
		}
		if (this.anInt7796 != -1) {
			return;
		}
		if (this.aBooleanArray17 == null) {
			this.anInt7796 = 0;
		} else {
			this.anInt7796 = 2;
		}
	}
}
