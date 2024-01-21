import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class21 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Z")
	public boolean aBoolean41;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[I[IZI)V")
	public void method631(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static57.anInt1421; local12++) {
					@Pc(18) Class1_Sub2_Sub15 local18 = Static21.method478(local12);
					if (local18 != null && !local18.aBoolean120 && (arg2 ? 7 : 0) + local8 == local18.anInt2626) {
						arg0[Static177.anIntArray336[local8]] = Integer.MIN_VALUE | local12;
						break;
					}
				}
			}
		}
		this.anInt889 = arg3;
		this.aBoolean41 = arg2;
		this.anIntArray78 = arg1;
		this.anIntArray77 = arg0;
		this.method641();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
	public void method632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static177.anIntArray336[arg1];
		if (this.anIntArray77[local3] != 0 && Static21.method478(arg0) != null) {
			this.anIntArray77[local3] = arg0 | Integer.MIN_VALUE;
			this.method641();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!td;ILclient!td;B)Lclient!lg;")
	public Class5_Sub1 method633(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2_Sub22 arg3) {
		if (this.anInt889 != -1) {
			return Static135.method2296(this.anInt889).method3048(arg2, arg3, arg0, arg1);
		}
		@Pc(29) long local29 = this.aLong29;
		@Pc(32) int[] local32 = this.anIntArray77;
		if (arg3 != null && (arg3.anInt3999 >= 0 || arg3.anInt4002 >= 0)) {
			local32 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local32[local48] = this.anIntArray77[local48];
			}
			if (arg3.anInt3999 >= 0) {
				if (arg3.anInt3999 == 65535) {
					local32[5] = 0;
					local29 ^= 0xFFFFFFFF00000000L;
				} else {
					local32[5] = arg3.anInt3999 | 0x40000000;
					local29 ^= (long) local32[5] << 32;
				}
			}
			if (arg3.anInt4002 >= 0) {
				if (arg3.anInt4002 == 65535) {
					local32[3] = 0;
					local29 ^= 0xFFFFFFFFL;
				} else {
					local32[3] = arg3.anInt4002 | 0x40000000;
					local29 ^= local32[3];
				}
			}
		}
		@Pc(138) Class5_Sub1 local138 = (Class5_Sub1) Static190.aClass46_12.method1588(local29);
		if (local138 == null) {
			@Pc(142) boolean local142 = false;
			for (@Pc(144) int local144 = 0; local144 < 12; local144++) {
				@Pc(150) int local150 = local32[local144];
				if ((local150 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local150) != 0 && !Static21.method478(local150 & 0x3FFFFFFF).method2010()) {
						local142 = true;
					}
				} else if (!Static168.method2886(local150 & 0x3FFFFFFF).method3249(this.aBoolean41)) {
					local142 = true;
				}
			}
			if (local142) {
				if (this.aLong28 != -1L) {
					local138 = (Class5_Sub1) Static190.aClass46_12.method1588(this.aLong28);
				}
				if (local138 == null) {
					return null;
				}
			}
			if (local138 == null) {
				@Pc(212) Class5_Sub6[] local212 = new Class5_Sub6[12];
				@Pc(214) int local214 = 0;
				for (@Pc(216) int local216 = 0; local216 < 12; local216++) {
					@Pc(222) int local222 = local32[local216];
					@Pc(244) Class5_Sub6 local244;
					if ((local222 & 0x40000000) != 0) {
						local244 = Static168.method2886(local222 & 0x3FFFFFFF).method3244(this.aBoolean41);
						if (local244 != null) {
							local212[local214++] = local244;
						}
					} else if ((Integer.MIN_VALUE & local222) != 0) {
						local244 = Static21.method478(local222 & 0x3FFFFFFF).method2009();
						if (local244 != null) {
							local212[local214++] = local244;
						}
					}
				}
				@Pc(282) Class5_Sub6 local282 = new Class5_Sub6(local212, local214);
				for (@Pc(284) int local284 = 0; local284 < 5; local284++) {
					if (this.anIntArray78[local284] < Static142.aShortArrayArray28[local284].length) {
						local282.method2936(Static126.aShortArray35[local284], Static142.aShortArrayArray28[local284][this.anIntArray78[local284]]);
					}
					if (Static205.aShortArrayArray45[local284].length > this.anIntArray78[local284]) {
						local282.method2936(Static10.aShortArray27[local284], Static205.aShortArrayArray45[local284][this.anIntArray78[local284]]);
					}
				}
				local138 = local282.method2942(64, 850, -30, -50, -30);
				Static190.aClass46_12.method1586(local138, local29);
				this.aLong28 = local29;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local138;
		}
		@Pc(372) Class5_Sub1 local372;
		if (arg3 != null && arg1 != null) {
			local372 = arg3.method3074(local138, arg0, arg1, arg2);
		} else if (arg3 == null) {
			local372 = arg1.method3072(arg2, local138);
		} else {
			local372 = arg3.method3072(arg0, local138);
		}
		return local372;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!td;B)Lclient!lg;")
	public Class5_Sub1 method635(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub22 arg1) {
		if (this.anInt889 != -1) {
			return Static135.method2296(this.anInt889).method3040(arg0, arg1);
		}
		@Pc(33) Class5_Sub1 local33 = (Class5_Sub1) Static147.aClass46_7.method1588(this.aLong29);
		if (local33 == null) {
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				@Pc(46) int local46 = this.anIntArray77[local39];
				if ((local46 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local46) != 0 && !Static21.method478(local46 & 0x3FFFFFFF).method2005()) {
						local37 = true;
					}
				} else if (!Static168.method2886(local46 & 0x3FFFFFFF).method3257(this.aBoolean41)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(94) Class5_Sub6[] local94 = new Class5_Sub6[12];
			@Pc(96) int local96 = 0;
			for (@Pc(98) int local98 = 0; local98 < 12; local98++) {
				@Pc(105) int local105 = this.anIntArray77[local98];
				@Pc(123) Class5_Sub6 local123;
				if ((local105 & 0x40000000) != 0) {
					local123 = Static168.method2886(local105 & 0x3FFFFFFF).method3253(this.aBoolean41);
					if (local123 != null) {
						local94[local96++] = local123;
					}
				} else if ((local105 & Integer.MIN_VALUE) != 0) {
					local123 = Static21.method478(local105 & 0x3FFFFFFF).method2011();
					if (local123 != null) {
						local94[local96++] = local123;
					}
				}
			}
			@Pc(161) Class5_Sub6 local161 = new Class5_Sub6(local94, local96);
			for (@Pc(163) int local163 = 0; local163 < 5; local163++) {
				if (this.anIntArray78[local163] < Static142.aShortArrayArray28[local163].length) {
					local161.method2936(Static126.aShortArray35[local163], Static142.aShortArrayArray28[local163][this.anIntArray78[local163]]);
				}
				if (this.anIntArray78[local163] < Static205.aShortArrayArray45[local163].length) {
					local161.method2936(Static10.aShortArray27[local163], Static205.aShortArrayArray45[local163][this.anIntArray78[local163]]);
				}
			}
			local33 = local161.method2942(64, 768, -50, -10, -50);
			Static147.aClass46_7.method1586(local33, this.aLong29);
		}
		if (arg1 != null) {
			local33 = arg1.method3079(arg0, local33);
		}
		return local33;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
	public int method636() {
		return this.anInt889 == -1 ? (this.anIntArray77[8] << 10) + (this.anIntArray77[0] << 15) + (this.anIntArray78[0] << 25) + (this.anIntArray78[4] << 20) + (this.anIntArray77[11] << 5) + this.anIntArray77[1] : Static135.method2296(this.anInt889).anInt3946 + 305419896;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
	public void method638(@OriginalArg(0) boolean arg0) {
		this.aBoolean41 = arg0;
		this.method641();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	public void method639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray78[arg0] = arg1;
		this.method641();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	private void method641() {
		@Pc(6) long local6 = this.aLong29;
		@Pc(8) long[] local8 = Class1_Sub2_Sub4.aLongArray7;
		this.aLong29 = -1L;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			this.aLong29 = local8[(int) (((long) (this.anIntArray77[local21] >> 24) ^ this.aLong29) & 0xFFL)] ^ this.aLong29 >>> 8;
			this.aLong29 = local8[(int) (((long) (this.anIntArray77[local21] >> 16) ^ this.aLong29) & 0xFFL)] ^ this.aLong29 >>> 8;
			this.aLong29 = local8[(int) (((long) (this.anIntArray77[local21] >> 8) ^ this.aLong29) & 0xFFL)] ^ this.aLong29 >>> 8;
			this.aLong29 = this.aLong29 >>> 8 ^ local8[(int) ((this.aLong29 ^ (long) this.anIntArray77[local21]) & 0xFFL)];
		}
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			this.aLong29 = this.aLong29 >>> 8 ^ local8[(int) (((long) this.anIntArray78[local114] ^ this.aLong29) & 0xFFL)];
		}
		this.aLong29 = local8[(int) (((long) (this.aBoolean41 ? 1 : 0) ^ this.aLong29) & 0xFFL)] ^ this.aLong29 >>> 8;
		if (local6 != 0L && this.aLong29 != local6) {
			Static190.aClass46_12.method1584(local6);
		}
	}
}
