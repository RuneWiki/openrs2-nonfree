import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class95 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "J")
	private long aLong231;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	private int anInt4355;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
	public void method3297(@OriginalArg(0) boolean arg0) {
		this.aBoolean236 = arg0;
		this.method3306();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!re;Lclient!re;I)Lclient!ee;")
	public Class8_Sub5 method3298(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub20 arg1, @OriginalArg(3) Class1_Sub3_Sub20 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt4355 != -1) {
			return Static27.method494(this.anInt4355).method1580(arg0, arg2, arg1, arg3);
		}
		@Pc(23) long local23 = this.aLong232;
		@Pc(26) int[] local26 = this.anIntArray354;
		if (arg2 != null && (arg2.anInt3402 >= 0 || arg2.anInt3388 >= 0)) {
			local26 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local26[local42] = this.anIntArray354[local42];
			}
			if (arg2.anInt3402 >= 0) {
				if (arg2.anInt3402 == 65535) {
					local26[5] = 0;
					local23 ^= 0xFFFFFFFF00000000L;
				} else {
					local26[5] = arg2.anInt3402 | 0x40000000;
					local23 ^= (long) local26[5] << 32;
				}
			}
			if (arg2.anInt3388 >= 0) {
				if (arg2.anInt3388 == 65535) {
					local23 ^= 0xFFFFFFFFL;
					local26[3] = 0;
				} else {
					local26[3] = arg2.anInt3388 | 0x40000000;
					local23 ^= local26[3];
				}
			}
		}
		@Pc(130) Class8_Sub5 local130 = (Class8_Sub5) Static110.aClass77_7.method2259(local23);
		if (local130 == null) {
			@Pc(140) boolean local140 = false;
			for (@Pc(142) int local142 = 0; local142 < 12; local142++) {
				@Pc(148) int local148 = local26[local142];
				if ((local148 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local148) != 0 && !Static123.method1825(local148 & 0x3FFFFFFF).method1822()) {
						local140 = true;
					}
				} else if (!Static102.method1549(local148 & 0x3FFFFFFF).method2924(this.aBoolean236)) {
					local140 = true;
				}
			}
			if (local140) {
				if (this.aLong231 != -1L) {
					local130 = (Class8_Sub5) Static110.aClass77_7.method2259(this.aLong231);
				}
				if (local130 == null) {
					return null;
				}
			}
			if (local130 == null) {
				@Pc(213) int local213 = 0;
				@Pc(216) Class8_Sub7[] local216 = new Class8_Sub7[12];
				for (@Pc(218) int local218 = 0; local218 < 12; local218++) {
					@Pc(224) int local224 = local26[local218];
					@Pc(241) Class8_Sub7 local241;
					if ((local224 & 0x40000000) != 0) {
						local241 = Static102.method1549(local224 & 0x3FFFFFFF).method2939(this.aBoolean236);
						if (local241 != null) {
							local216[local213++] = local241;
						}
					} else if ((Integer.MIN_VALUE & local224) != 0) {
						local241 = Static123.method1825(local224 & 0x3FFFFFFF).method1819();
						if (local241 != null) {
							local216[local213++] = local241;
						}
					}
				}
				@Pc(284) Class8_Sub7 local284 = new Class8_Sub7(local216, local213);
				for (@Pc(286) int local286 = 0; local286 < 5; local286++) {
					if (this.anIntArray353[local286] < Static186.aShortArrayArray4[local286].length) {
						local284.method2006(Static129.aShortArray26[local286], Static186.aShortArrayArray4[local286][this.anIntArray353[local286]]);
					}
					if (this.anIntArray353[local286] < Static195.aShortArrayArray6[local286].length) {
						local284.method2006(Static90.aShortArray12[local286], Static195.aShortArrayArray6[local286][this.anIntArray353[local286]]);
					}
				}
				local130 = local284.method2007(64, 850, -30, -50, -30);
				Static110.aClass77_7.method2257(local130, local23);
				this.aLong231 = local23;
			}
		}
		if (arg2 == null && arg1 == null) {
			return local130;
		}
		@Pc(380) Class8_Sub5 local380;
		if (arg2 != null && arg1 != null) {
			local380 = arg2.method2547(arg3, local130, arg1, arg0);
		} else if (arg2 == null) {
			local380 = arg1.method2556(arg0, local130);
		} else {
			local380 = arg2.method2556(arg3, local130);
		}
		return local380;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
	public void method3299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray353[arg1] = arg0;
		this.method3306();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	public int method3302() {
		return this.anInt4355 == -1 ? (this.anIntArray354[11] << 5) + (this.anIntArray354[0] << 15) + (this.anIntArray353[4] << 20) + (this.anIntArray353[0] << 25) + (this.anIntArray354[8] << 10) + this.anIntArray354[1] : 305419896 - -Static27.method494(this.anInt4355).anInt2268;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[II[II)V")
	public void method3303(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static173.anInt3695; local12++) {
					@Pc(18) Class1_Sub3_Sub17 local18 = Static123.method1825(local12);
					if (local18 != null && !local18.aBoolean150 && (arg0 ? 7 : 0) + local8 == local18.anInt2596) {
						arg1[Static76.anIntArray134[local8]] = Integer.MIN_VALUE | local12;
						break;
					}
				}
			}
		}
		this.anIntArray353 = arg3;
		this.anInt4355 = arg2;
		this.aBoolean236 = arg0;
		this.anIntArray354 = arg1;
		this.method3306();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)V")
	public void method3305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static76.anIntArray134[arg1];
		if (this.anIntArray354[local3] != 0 && Static123.method1825(arg0) != null) {
			this.anIntArray354[local3] = arg0 | Integer.MIN_VALUE;
			this.method3306();
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	private void method3306() {
		@Pc(7) long[] local7 = Class6.aLongArray1;
		@Pc(10) long local10 = this.aLong232;
		this.aLong232 = -1L;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) (((long) (this.anIntArray354[local15] >> 24) ^ this.aLong232) & 0xFFL)];
			this.aLong232 = local7[(int) ((this.aLong232 ^ (long) (this.anIntArray354[local15] >> 16)) & 0xFFL)] ^ this.aLong232 >>> 8;
			this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) (((long) (this.anIntArray354[local15] >> 8) ^ this.aLong232) & 0xFFL)];
			this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) (((long) this.anIntArray354[local15] ^ this.aLong232) & 0xFFL)];
		}
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			this.aLong232 = this.aLong232 >>> 8 ^ local7[(int) ((this.aLong232 ^ (long) this.anIntArray353[local111]) & 0xFFL)];
		}
		this.aLong232 = local7[(int) ((this.aLong232 ^ (long) (this.aBoolean236 ? 1 : 0)) & 0xFFL)] ^ this.aLong232 >>> 8;
		if (local10 != 0L && local10 != this.aLong232) {
			Static110.aClass77_7.method2264(local10);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!re;II)Lclient!ee;")
	public Class8_Sub5 method3308(@OriginalArg(0) Class1_Sub3_Sub20 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4355 != -1) {
			return Static27.method494(this.anInt4355).method1575(arg1, arg0);
		}
		@Pc(25) Class8_Sub5 local25 = (Class8_Sub5) Static200.aClass77_10.method2259(this.aLong232);
		if (local25 == null) {
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
				@Pc(43) int local43 = this.anIntArray354[local36];
				if ((local43 & 0x40000000) == 0) {
					if ((local43 & Integer.MIN_VALUE) != 0 && !Static123.method1825(local43 & 0x3FFFFFFF).method1824()) {
						local34 = true;
					}
				} else if (!Static102.method1549(local43 & 0x3FFFFFFF).method2927(this.aBoolean236)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(91) Class8_Sub7[] local91 = new Class8_Sub7[12];
			@Pc(93) int local93 = 0;
			for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
				@Pc(102) int local102 = this.anIntArray354[local95];
				@Pc(121) Class8_Sub7 local121;
				if ((local102 & 0x40000000) != 0) {
					local121 = Static102.method1549(local102 & 0x3FFFFFFF).method2935(this.aBoolean236);
					if (local121 != null) {
						local91[local93++] = local121;
					}
				} else if ((Integer.MIN_VALUE & local102) != 0) {
					local121 = Static123.method1825(local102 & 0x3FFFFFFF).method1818();
					if (local121 != null) {
						local91[local93++] = local121;
					}
				}
			}
			@Pc(159) Class8_Sub7 local159 = new Class8_Sub7(local91, local93);
			for (@Pc(161) int local161 = 0; local161 < 5; local161++) {
				if (this.anIntArray353[local161] < Static186.aShortArrayArray4[local161].length) {
					local159.method2006(Static129.aShortArray26[local161], Static186.aShortArrayArray4[local161][this.anIntArray353[local161]]);
				}
				if (this.anIntArray353[local161] < Static195.aShortArrayArray6[local161].length) {
					local159.method2006(Static90.aShortArray12[local161], Static195.aShortArrayArray6[local161][this.anIntArray353[local161]]);
				}
			}
			local25 = local159.method2007(64, 768, -50, -10, -50);
			Static200.aClass77_10.method2257(local25, this.aLong232);
		}
		if (arg0 != null) {
			local25 = arg0.method2555(arg1, local25);
		}
		return local25;
	}
}
