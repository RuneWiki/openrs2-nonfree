import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class32 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	private int anInt2091;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[I")
	private int[] anIntArray207;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	private void method1572() {
		@Pc(8) long local8 = this.aLong69;
		this.aLong69 = -1L;
		@Pc(18) long[] local18 = Class87.aLongArray9;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			this.aLong69 = local18[(int) (((long) (this.anIntArray208[local20] >> 24) ^ this.aLong69) & 0xFFL)] ^ this.aLong69 >>> 8;
			this.aLong69 = local18[(int) ((this.aLong69 ^ (long) (this.anIntArray208[local20] >> 16)) & 0xFFL)] ^ this.aLong69 >>> 8;
			this.aLong69 = this.aLong69 >>> 8 ^ local18[(int) ((this.aLong69 ^ (long) (this.anIntArray208[local20] >> 8)) & 0xFFL)];
			this.aLong69 = this.aLong69 >>> 8 ^ local18[(int) (((long) this.anIntArray208[local20] ^ this.aLong69) & 0xFFL)];
		}
		for (@Pc(116) int local116 = 0; local116 < 5; local116++) {
			this.aLong69 = local18[(int) ((this.aLong69 ^ (long) this.anIntArray207[local116]) & 0xFFL)] ^ this.aLong69 >>> 8;
		}
		this.aLong69 = local18[(int) (((long) (this.aBoolean88 ? 1 : 0) ^ this.aLong69) & 0xFFL)] ^ this.aLong69 >>> 8;
		if (local8 != 0L && this.aLong69 != local8) {
			Static70.aClass89_22.method3434(local8);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZB)V")
	public void method1573(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean88) {
			this.method1579(this.anIntArray207, null, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZZ)V")
	public void method1574(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean88) {
			return;
		}
		@Pc(23) int local23 = this.anIntArray208[Static64.anIntArray182[arg0]];
		if (local23 == 0) {
			return;
		}
		local23 &= 0x3FFFFFFF;
		@Pc(54) Class2_Sub1_Sub11 local54;
		do {
			if (arg1) {
				local23++;
				if (local23 >= Static117.anInt966) {
					local23 = 0;
				}
			} else {
				local23--;
				if (local23 < 0) {
					local23 = Static117.anInt966 - 1;
				}
			}
			local54 = Static43.method944(local23);
		} while (local54 == null || local54.aBoolean78 || arg0 + (this.aBoolean88 ? 7 : 0) != local54.anInt1893);
		this.anIntArray208[Static64.anIntArray182[arg0]] = Integer.MIN_VALUE | local23;
		this.method1572();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public void method1575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static64.anIntArray182[arg1];
		if (this.anIntArray208[local3] != 0 && Static43.method944(arg0) != null) {
			this.anIntArray208[local3] = Integer.MIN_VALUE | arg0;
			this.method1572();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!og;I)V")
	public void method1577(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method224(this.aBoolean88 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray208[Static64.anIntArray182[local16]];
			if ((local25 & Integer.MIN_VALUE) == 0) {
				arg0.method199(65535);
			} else {
				arg0.method199(local25 & 0x3FFFFFFF);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method224(this.anIntArray207[local25]);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
	public int method1578() {
		return this.anInt2091 == -1 ? (this.anIntArray208[11] << 5) + (this.anIntArray208[8] << 10) + (this.anIntArray208[0] << 15) + (this.anIntArray207[0] << 25) + (this.anIntArray207[4] << 20) + this.anIntArray208[1] : 305419896 - -Static50.method1143(this.anInt2091).anInt322;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([I[IIIZ)V")
	public void method1579(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static117.anInt966; local16++) {
					@Pc(22) Class2_Sub1_Sub11 local22 = Static43.method944(local16);
					if (local22 != null && !local22.aBoolean78 && local22.anInt1893 == local12 + (arg3 ? 7 : 0)) {
						arg1[Static64.anIntArray182[local12]] = local16 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray208 = arg1;
		this.aBoolean88 = arg3;
		this.anIntArray207 = arg0;
		this.anInt2091 = arg2;
		this.method1572();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIILclient!ce;Lclient!ce;)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method1580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub5 arg2, @OriginalArg(4) Class2_Sub1_Sub5 arg3) {
		if (this.anInt2091 != -1) {
			return Static50.method1143(this.anInt2091).method278(arg1, arg3, arg2, arg0);
		}
		@Pc(28) int[] local28 = this.anIntArray208;
		@Pc(31) long local31 = this.aLong69;
		if (arg3 != null && (arg3.anInt788 >= 0 || arg3.anInt790 >= 0)) {
			local28 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local28[local47] = this.anIntArray208[local47];
			}
			if (arg3.anInt788 >= 0) {
				if (arg3.anInt788 == 65535) {
					local28[5] = 0;
					local31 ^= 0xFFFFFFFF00000000L;
				} else {
					local28[5] = arg3.anInt788 | 0x40000000;
					local31 ^= (long) local28[5] << 32;
				}
			}
			if (arg3.anInt790 >= 0) {
				if (arg3.anInt790 == 65535) {
					local28[3] = 0;
					local31 ^= 0xFFFFFFFFL;
				} else {
					local28[3] = arg3.anInt790 | 0x40000000;
					local31 ^= local28[3];
				}
			}
		}
		@Pc(139) Class2_Sub1_Sub1_Sub4 local139 = (Class2_Sub1_Sub1_Sub4) Static70.aClass89_22.method3437(local31);
		if (local139 == null) {
			@Pc(143) boolean local143 = false;
			for (@Pc(145) int local145 = 0; local145 < 12; local145++) {
				@Pc(151) int local151 = local28[local145];
				if ((local151 & 0x40000000) == 0) {
					if ((local151 & Integer.MIN_VALUE) != 0 && !Static43.method944(local151 & 0x3FFFFFFF).method1426()) {
						local143 = true;
					}
				} else if (!Static88.method2046(local151 & 0x3FFFFFFF).method1156(this.aBoolean88)) {
					local143 = true;
				}
			}
			if (local143) {
				if (this.aLong68 != -1L) {
					local139 = (Class2_Sub1_Sub1_Sub4) Static70.aClass89_22.method3437(this.aLong68);
				}
				if (local139 == null) {
					return null;
				}
			}
			if (local139 == null) {
				@Pc(218) Class2_Sub1_Sub1_Sub1[] local218 = new Class2_Sub1_Sub1_Sub1[12];
				@Pc(220) int local220 = 0;
				for (@Pc(222) int local222 = 0; local222 < 12; local222++) {
					@Pc(228) int local228 = local28[local222];
					@Pc(242) Class2_Sub1_Sub1_Sub1 local242;
					if ((local228 & 0x40000000) != 0) {
						local242 = Static88.method2046(local228 & 0x3FFFFFFF).method1158(this.aBoolean88);
						if (local242 != null) {
							local218[local220++] = local242;
						}
					} else if ((Integer.MIN_VALUE & local228) != 0) {
						local242 = Static43.method944(local228 & 0x3FFFFFFF).method1428();
						if (local242 != null) {
							local218[local220++] = local242;
						}
					}
				}
				@Pc(283) Class2_Sub1_Sub1_Sub1 local283 = new Class2_Sub1_Sub1_Sub1(local218, local220);
				for (@Pc(285) int local285 = 0; local285 < 5; local285++) {
					if (Static100.aShortArrayArray4[local285].length > this.anIntArray207[local285]) {
						local283.method588(Static93.aShortArray48[local285], Static100.aShortArrayArray4[local285][this.anIntArray207[local285]]);
					}
					if (Static127.aShortArrayArray6[local285].length > this.anIntArray207[local285]) {
						local283.method588(Static70.aShortArray42[local285], Static127.aShortArrayArray6[local285][this.anIntArray207[local285]]);
					}
				}
				local139 = local283.method595(64, 850, -30, -50, -30);
				Static70.aClass89_22.method3432(local139, local31);
				this.aLong68 = local31;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local139;
		}
		@Pc(371) Class2_Sub1_Sub1_Sub4 local371;
		if (arg3 != null && arg2 != null) {
			local371 = arg3.method647(local139, arg2, arg1, arg0);
		} else if (arg3 == null) {
			local371 = arg2.method645(local139, arg1);
		} else {
			local371 = arg3.method645(local139, arg0);
		}
		return local371;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BZ)V")
	public void method1581(@OriginalArg(1) boolean arg0) {
		this.aBoolean88 = arg0;
		this.method1572();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLclient!ce;)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method1582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub5 arg1) {
		if (this.anInt2091 != -1) {
			return Static50.method1143(this.anInt2091).method275(arg0, arg1);
		}
		@Pc(25) Class2_Sub1_Sub1_Sub4 local25 = (Class2_Sub1_Sub1_Sub4) Static110.aClass89_41.method3437(this.aLong69);
		if (local25 == null) {
			@Pc(29) boolean local29 = false;
			for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
				@Pc(38) int local38 = this.anIntArray208[local31];
				if ((local38 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local38) != 0 && !Static43.method944(local38 & 0x3FFFFFFF).method1421()) {
						local29 = true;
					}
				} else if (!Static88.method2046(local38 & 0x3FFFFFFF).method1153(this.aBoolean88)) {
					local29 = true;
				}
			}
			if (local29) {
				return null;
			}
			@Pc(82) int local82 = 0;
			@Pc(85) Class2_Sub1_Sub1_Sub1[] local85 = new Class2_Sub1_Sub1_Sub1[12];
			for (@Pc(87) int local87 = 0; local87 < 12; local87++) {
				@Pc(94) int local94 = this.anIntArray208[local87];
				@Pc(110) Class2_Sub1_Sub1_Sub1 local110;
				if ((local94 & 0x40000000) != 0) {
					local110 = Static88.method2046(local94 & 0x3FFFFFFF).method1144(this.aBoolean88);
					if (local110 != null) {
						local85[local82++] = local110;
					}
				} else if ((local94 & Integer.MIN_VALUE) != 0) {
					local110 = Static43.method944(local94 & 0x3FFFFFFF).method1427();
					if (local110 != null) {
						local85[local82++] = local110;
					}
				}
			}
			@Pc(146) Class2_Sub1_Sub1_Sub1 local146 = new Class2_Sub1_Sub1_Sub1(local85, local82);
			for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
				if (Static100.aShortArrayArray4[local148].length > this.anIntArray207[local148]) {
					local146.method588(Static93.aShortArray48[local148], Static100.aShortArrayArray4[local148][this.anIntArray207[local148]]);
				}
				if (this.anIntArray207[local148] < Static127.aShortArrayArray6[local148].length) {
					local146.method588(Static70.aShortArray42[local148], Static127.aShortArrayArray6[local148][this.anIntArray207[local148]]);
				}
			}
			local25 = local146.method595(64, 768, -50, -10, -50);
			Static110.aClass89_41.method3432(local25, this.aLong69);
		}
		if (arg1 != null) {
			local25 = arg1.method646(local25, arg0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZI)V")
	public void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray207[arg0];
		if (arg1) {
			local8++;
			if (Static100.aShortArrayArray4[arg0].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static100.aShortArrayArray4[arg0].length - 1;
			}
		}
		this.anIntArray207[arg0] = local8;
		this.method1572();
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public void method1584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray207[arg1] = arg0;
		this.method1572();
	}
}
