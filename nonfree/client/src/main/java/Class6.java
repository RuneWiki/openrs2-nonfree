import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class6 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Z")
	public boolean aBoolean19;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ab;B)V")
	public void method405(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method1700(this.aBoolean19 ? 1 : 0);
		@Pc(27) int local27;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local27 = this.anIntArray42[Static130.anIntArray276[local16]];
			if ((Integer.MIN_VALUE & local27) == 0) {
				arg0.method1696(65535);
			} else {
				arg0.method1696(local27 & 0x3FFFFFFF);
			}
		}
		for (local27 = 0; local27 < 5; local27++) {
			arg0.method1700(this.anIntArray43[local27]);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
	public void method406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = Static130.anIntArray276[arg1];
		if (this.anIntArray42[local3] != 0 && Static72.method1305(arg0) != null) {
			this.anIntArray42[local3] = arg0 | Integer.MIN_VALUE;
			this.method407();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	private void method407() {
		@Pc(12) long local12 = this.aLong25;
		@Pc(14) long[] local14 = Class2_Sub3_Sub2.aLongArray1;
		this.aLong25 = -1L;
		for (@Pc(19) int local19 = 0; local19 < 12; local19++) {
			this.aLong25 = local14[(int) (((long) (this.anIntArray42[local19] >> 24) ^ this.aLong25) & 0xFFL)] ^ this.aLong25 >>> 8;
			this.aLong25 = this.aLong25 >>> 8 ^ local14[(int) (((long) (this.anIntArray42[local19] >> 16) ^ this.aLong25) & 0xFFL)];
			this.aLong25 = this.aLong25 >>> 8 ^ local14[(int) ((this.aLong25 ^ (long) (this.anIntArray42[local19] >> 8)) & 0xFFL)];
			this.aLong25 = this.aLong25 >>> 8 ^ local14[(int) ((this.aLong25 ^ (long) this.anIntArray42[local19]) & 0xFFL)];
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong25 = this.aLong25 >>> 8 ^ local14[(int) (((long) this.anIntArray43[local113] ^ this.aLong25) & 0xFFL)];
		}
		this.aLong25 = this.aLong25 >>> 8 ^ local14[(int) ((this.aLong25 ^ (long) (this.aBoolean19 ? 1 : 0)) & 0xFFL)];
		if (local12 != 0L && local12 != this.aLong25) {
			Static157.aClass14_176.method600(local12);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!ah;I)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method409(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub2 arg1) {
		if (this.anInt649 != -1) {
			return Static127.method2066(this.anInt649).method583(arg1, arg0);
		}
		@Pc(25) Class2_Sub4_Sub1_Sub3 local25 = (Class2_Sub4_Sub1_Sub3) Static127.aClass14_154.method603(this.aLong25);
		if (local25 == null) {
			@Pc(29) boolean local29 = false;
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				@Pc(38) int local38 = this.anIntArray42[local31];
				if ((local38 & 0x40000000) == 0) {
					if ((local38 & Integer.MIN_VALUE) != 0 && !Static72.method1305(local38 & 0x3FFFFFFF).method2580()) {
						local29 = true;
					}
				} else if (!Static58.method1034(local38 & 0x3FFFFFFF).method1559(this.aBoolean19)) {
					local29 = true;
				}
			}
			if (local29) {
				return null;
			}
			@Pc(84) Class2_Sub4_Sub1_Sub5[] local84 = new Class2_Sub4_Sub1_Sub5[12];
			@Pc(86) int local86 = 0;
			for (@Pc(88) int local88 = 0; local88 < 12; local88++) {
				@Pc(95) int local95 = this.anIntArray42[local88];
				@Pc(109) Class2_Sub4_Sub1_Sub5 local109;
				if ((local95 & 0x40000000) != 0) {
					local109 = Static58.method1034(local95 & 0x3FFFFFFF).method1572(this.aBoolean19);
					if (local109 != null) {
						local84[local86++] = local109;
					}
				} else if ((Integer.MIN_VALUE & local95) != 0) {
					local109 = Static72.method1305(local95 & 0x3FFFFFFF).method2588();
					if (local109 != null) {
						local84[local86++] = local109;
					}
				}
			}
			@Pc(152) Class2_Sub4_Sub1_Sub5 local152 = new Class2_Sub4_Sub1_Sub5(local84, local86);
			for (@Pc(154) int local154 = 0; local154 < 5; local154++) {
				if (this.anIntArray43[local154] < Static69.aShortArrayArray5[local154].length) {
					local152.method1531(Static64.aShortArray17[local154], Static69.aShortArrayArray5[local154][this.anIntArray43[local154]]);
				}
				if (Static36.aShortArrayArray2[local154].length > this.anIntArray43[local154]) {
					local152.method1531(Static157.aShortArray35[local154], Static36.aShortArrayArray2[local154][this.anIntArray43[local154]]);
				}
			}
			local25 = local152.method1544(64, 768, -50, -10, -50, true);
			Static127.aClass14_154.method607(this.aLong25, local25);
		}
		if (arg1 != null) {
			local25 = arg1.method311(arg0, local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)V")
	public void method410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray43[arg0] = arg1;
		this.method407();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([IZ[III)V")
	public void method412(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static57.anInt1501; local12++) {
					@Pc(18) Class2_Sub4_Sub17 local18 = Static72.method1305(local12);
					if (local18 != null && !local18.aBoolean160 && (arg1 ? 7 : 0) + local8 == local18.anInt3703) {
						arg0[Static130.anIntArray276[local8]] = local12 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray43 = arg2;
		this.anInt649 = arg3;
		this.aBoolean19 = arg1;
		this.anIntArray42 = arg0;
		this.method407();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V")
	public void method413(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean19) {
			this.method412(null, arg0, this.anIntArray43, -1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIZ)V")
	public void method415(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean19) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray42[Static130.anIntArray276[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 &= 0x3FFFFFFF;
		@Pc(47) Class2_Sub4_Sub17 local47;
		do {
			if (arg1) {
				local19++;
				if (local19 >= Static57.anInt1501) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static57.anInt1501 - 1;
				}
			}
			local47 = Static72.method1305(local19);
		} while (local47 == null || local47.aBoolean160 || local47.anInt3703 != arg0 + (this.aBoolean19 ? 7 : 0));
		this.anIntArray42[Static130.anIntArray276[arg0]] = Integer.MIN_VALUE | local19;
		this.method407();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
	public void method416(@OriginalArg(0) boolean arg0) {
		this.aBoolean19 = arg0;
		this.method407();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I")
	public int method417() {
		return this.anInt649 == -1 ? (this.anIntArray42[11] << 5) + (this.anIntArray43[0] << 25) + (this.anIntArray43[4] << 20) + (this.anIntArray42[0] << 15) + (this.anIntArray42[8] << 10) + this.anIntArray42[1] : Static127.method2066(this.anInt649).anInt869 + 305419896;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZBI)V")
	public void method418(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray43[arg1];
		if (arg0) {
			local8++;
			if (Static69.aShortArrayArray5[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static69.aShortArrayArray5[arg1].length - 1;
			}
		}
		this.anIntArray43[arg1] = local8;
		this.method407();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ah;ILclient!ah;II)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method419(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub4_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt649 != -1) {
			return Static127.method2066(this.anInt649).method589(arg2, arg1, arg3, arg0);
		}
		@Pc(33) long local33 = this.aLong25;
		@Pc(36) int[] local36 = this.anIntArray42;
		if (arg2 != null && (arg2.anInt485 >= 0 || arg2.anInt481 >= 0)) {
			local36 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local36[local49] = this.anIntArray42[local49];
			}
			if (arg2.anInt485 >= 0) {
				if (arg2.anInt485 == 65535) {
					local33 ^= 0xFFFFFFFF00000000L;
					local36[5] = 0;
				} else {
					local36[5] = arg2.anInt485 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg2.anInt481 >= 0) {
				if (arg2.anInt481 == 65535) {
					local33 ^= 0xFFFFFFFFL;
					local36[3] = 0;
				} else {
					local36[3] = arg2.anInt481 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(142) Class2_Sub4_Sub1_Sub3 local142 = (Class2_Sub4_Sub1_Sub3) Static157.aClass14_176.method603(local33);
		if (local142 == null) {
			@Pc(146) boolean local146 = false;
			for (@Pc(148) int local148 = 0; local148 < 12; local148++) {
				@Pc(154) int local154 = local36[local148];
				if ((local154 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local154) != 0 && !Static72.method1305(local154 & 0x3FFFFFFF).method2585()) {
						local146 = true;
					}
				} else if (!Static58.method1034(local154 & 0x3FFFFFFF).method1568(this.aBoolean19)) {
					local146 = true;
				}
			}
			if (local146) {
				if (this.aLong26 != -1L) {
					local142 = (Class2_Sub4_Sub1_Sub3) Static157.aClass14_176.method603(this.aLong26);
				}
				if (local142 == null) {
					return null;
				}
			}
			if (local142 == null) {
				@Pc(223) Class2_Sub4_Sub1_Sub5[] local223 = new Class2_Sub4_Sub1_Sub5[12];
				@Pc(225) int local225 = 0;
				for (@Pc(227) int local227 = 0; local227 < 12; local227++) {
					@Pc(233) int local233 = local36[local227];
					@Pc(251) Class2_Sub4_Sub1_Sub5 local251;
					if ((local233 & 0x40000000) != 0) {
						local251 = Static58.method1034(local233 & 0x3FFFFFFF).method1565(this.aBoolean19);
						if (local251 != null) {
							local223[local225++] = local251;
						}
					} else if ((Integer.MIN_VALUE & local233) != 0) {
						local251 = Static72.method1305(local233 & 0x3FFFFFFF).method2586();
						if (local251 != null) {
							local223[local225++] = local251;
						}
					}
				}
				@Pc(291) Class2_Sub4_Sub1_Sub5 local291 = new Class2_Sub4_Sub1_Sub5(local223, local225);
				for (@Pc(293) int local293 = 0; local293 < 5; local293++) {
					if (Static69.aShortArrayArray5[local293].length > this.anIntArray43[local293]) {
						local291.method1531(Static64.aShortArray17[local293], Static69.aShortArrayArray5[local293][this.anIntArray43[local293]]);
					}
					if (this.anIntArray43[local293] < Static36.aShortArrayArray2[local293].length) {
						local291.method1531(Static157.aShortArray35[local293], Static36.aShortArrayArray2[local293][this.anIntArray43[local293]]);
					}
				}
				local142 = local291.method1544(64, 850, -30, -50, -30, true);
				Static157.aClass14_176.method607(local33, local142);
				this.aLong26 = local33;
			}
		}
		if (arg2 == null && arg0 == null) {
			return local142;
		}
		@Pc(387) Class2_Sub4_Sub1_Sub3 local387;
		if (arg2 != null && arg0 != null) {
			local387 = arg2.method306(arg0, arg3, arg1, local142);
		} else if (arg2 == null) {
			local387 = arg0.method315(arg3, local142);
		} else {
			local387 = arg2.method315(arg1, local142);
		}
		return local387;
	}
}
