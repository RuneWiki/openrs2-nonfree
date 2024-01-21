import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class90 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Z")
	public boolean aBoolean169;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I")
	public int method3111() {
		return this.anInt4102 == -1 ? this.anIntArray431[1] + (this.anIntArray431[11] << 5) + (this.anIntArray431[8] << 10) + (this.anIntArray432[4] << 20) + (this.anIntArray432[0] << 25) + (this.anIntArray431[0] << 15) : Static171.method3011(this.anInt4102).anInt1016 + 305419896;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	public void method3112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static162.anIntArray388[arg1];
		if (this.anIntArray431[local13] != 0 && Static25.method552(arg0) != null) {
			this.anIntArray431[local13] = arg0 | Integer.MIN_VALUE;
			this.method3114();
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	private void method3114() {
		@Pc(8) long local8 = this.aLong147;
		@Pc(10) long[] local10 = Class84.aLongArray9;
		this.aLong147 = -1L;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong147 = local10[(int) (((long) (this.anIntArray431[local15] >> 24) ^ this.aLong147) & 0xFFL)] ^ this.aLong147 >>> 8;
			this.aLong147 = local10[(int) ((this.aLong147 ^ (long) (this.anIntArray431[local15] >> 16)) & 0xFFL)] ^ this.aLong147 >>> 8;
			this.aLong147 = this.aLong147 >>> 8 ^ local10[(int) (((long) (this.anIntArray431[local15] >> 8) ^ this.aLong147) & 0xFFL)];
			this.aLong147 = this.aLong147 >>> 8 ^ local10[(int) (((long) this.anIntArray431[local15] ^ this.aLong147) & 0xFFL)];
		}
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			this.aLong147 = this.aLong147 >>> 8 ^ local10[(int) (((long) this.anIntArray432[local111] ^ this.aLong147) & 0xFFL)];
		}
		this.aLong147 = local10[(int) (((long) (this.aBoolean169 ? 1 : 0) ^ this.aLong147) & 0xFFL)] ^ this.aLong147 >>> 8;
		if (local8 != 0L && local8 != this.aLong147) {
			Static14.aClass59_2.method1971(local8);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[IZI[I)V")
	public void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static157.anInt3571; local20++) {
					@Pc(26) Class1_Sub2_Sub15 local26 = Static25.method552(local20);
					if (local26 != null && !local26.aBoolean144 && local26.anInt3329 == local16 + (arg2 ? 7 : 0)) {
						arg3[Static162.anIntArray388[local16]] = local20 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt4102 = arg0;
		this.anIntArray431 = arg3;
		this.anIntArray432 = arg1;
		this.aBoolean169 = arg2;
		this.method3114();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ub;II)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method3117(@OriginalArg(0) Class1_Sub2_Sub18 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4102 != -1) {
			return Static171.method3011(this.anInt4102).method762(arg1, arg0);
		}
		@Pc(27) Class1_Sub2_Sub1_Sub4 local27 = (Class1_Sub2_Sub1_Sub4) Static31.aClass59_6.method1970(this.aLong147);
		if (local27 == null) {
			@Pc(31) boolean local31 = false;
			for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
				@Pc(40) int local40 = this.anIntArray431[local33];
				if ((local40 & 0x40000000) == 0) {
					if ((local40 & Integer.MIN_VALUE) != 0 && !Static25.method552(local40 & 0x3FFFFFFF).method2545()) {
						local31 = true;
					}
				} else if (!Static54.method969(local40 & 0x3FFFFFFF).method1803(this.aBoolean169)) {
					local31 = true;
				}
			}
			if (local31) {
				return null;
			}
			@Pc(88) int local88 = 0;
			@Pc(91) Class1_Sub2_Sub1_Sub6[] local91 = new Class1_Sub2_Sub1_Sub6[12];
			for (@Pc(93) int local93 = 0; local93 < 12; local93++) {
				@Pc(100) int local100 = this.anIntArray431[local93];
				@Pc(116) Class1_Sub2_Sub1_Sub6 local116;
				if ((local100 & 0x40000000) != 0) {
					local116 = Static54.method969(local100 & 0x3FFFFFFF).method1808(this.aBoolean169);
					if (local116 != null) {
						local91[local88++] = local116;
					}
				} else if ((local100 & Integer.MIN_VALUE) != 0) {
					local116 = Static25.method552(local100 & 0x3FFFFFFF).method2546();
					if (local116 != null) {
						local91[local88++] = local116;
					}
				}
			}
			@Pc(154) Class1_Sub2_Sub1_Sub6 local154 = new Class1_Sub2_Sub1_Sub6(local91, local88);
			for (@Pc(156) int local156 = 0; local156 < 5; local156++) {
				if (Static118.aShortArrayArray5[local156].length > this.anIntArray432[local156]) {
					local154.method2752(Static6.aShortArray1[local156], Static118.aShortArrayArray5[local156][this.anIntArray432[local156]]);
				}
				if (this.anIntArray432[local156] < Static58.aShortArrayArray2[local156].length) {
					local154.method2752(Static108.aShortArray24[local156], Static58.aShortArrayArray2[local156][this.anIntArray432[local156]]);
				}
			}
			local27 = local154.method2745(64, 768, -50, -10, -50, true);
			Static31.aClass59_6.method1973(local27, this.aLong147);
		}
		if (arg0 != null) {
			local27 = arg0.method2889(local27, arg1);
		}
		return local27;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!ub;IILclient!ub;)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method3118(@OriginalArg(1) Class1_Sub2_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub18 arg3) {
		if (this.anInt4102 != -1) {
			return Static171.method3011(this.anInt4102).method758(arg2, arg3, arg0, arg1);
		}
		@Pc(23) long local23 = this.aLong147;
		@Pc(26) int[] local26 = this.anIntArray431;
		if (arg0 != null && (arg0.anInt3803 >= 0 || arg0.anInt3797 >= 0)) {
			local26 = new int[12];
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local26[local42] = this.anIntArray431[local42];
			}
			if (arg0.anInt3803 >= 0) {
				if (arg0.anInt3803 == 65535) {
					local23 ^= 0xFFFFFFFF00000000L;
					local26[5] = 0;
				} else {
					local26[5] = arg0.anInt3803 | 0x40000000;
					local23 ^= (long) local26[5] << 32;
				}
			}
			if (arg0.anInt3797 >= 0) {
				if (arg0.anInt3797 == 65535) {
					local23 ^= 0xFFFFFFFFL;
					local26[3] = 0;
				} else {
					local26[3] = arg0.anInt3797 | 0x40000000;
					local23 ^= local26[3];
				}
			}
		}
		@Pc(132) Class1_Sub2_Sub1_Sub4 local132 = (Class1_Sub2_Sub1_Sub4) Static14.aClass59_2.method1970(local23);
		if (local132 == null) {
			@Pc(136) boolean local136 = false;
			for (@Pc(138) int local138 = 0; local138 < 12; local138++) {
				@Pc(144) int local144 = local26[local138];
				if ((local144 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local144) != 0 && !Static25.method552(local144 & 0x3FFFFFFF).method2543()) {
						local136 = true;
					}
				} else if (!Static54.method969(local144 & 0x3FFFFFFF).method1798(this.aBoolean169)) {
					local136 = true;
				}
			}
			if (local136) {
				if (this.aLong146 != -1L) {
					local132 = (Class1_Sub2_Sub1_Sub4) Static14.aClass59_2.method1970(this.aLong146);
				}
				if (local132 == null) {
					return null;
				}
			}
			if (local132 == null) {
				@Pc(211) Class1_Sub2_Sub1_Sub6[] local211 = new Class1_Sub2_Sub1_Sub6[12];
				@Pc(213) int local213 = 0;
				for (@Pc(215) int local215 = 0; local215 < 12; local215++) {
					@Pc(221) int local221 = local26[local215];
					@Pc(240) Class1_Sub2_Sub1_Sub6 local240;
					if ((local221 & 0x40000000) != 0) {
						local240 = Static54.method969(local221 & 0x3FFFFFFF).method1802(this.aBoolean169);
						if (local240 != null) {
							local211[local213++] = local240;
						}
					} else if ((local221 & Integer.MIN_VALUE) != 0) {
						local240 = Static25.method552(local221 & 0x3FFFFFFF).method2549();
						if (local240 != null) {
							local211[local213++] = local240;
						}
					}
				}
				@Pc(278) Class1_Sub2_Sub1_Sub6 local278 = new Class1_Sub2_Sub1_Sub6(local211, local213);
				for (@Pc(280) int local280 = 0; local280 < 5; local280++) {
					if (Static118.aShortArrayArray5[local280].length > this.anIntArray432[local280]) {
						local278.method2752(Static6.aShortArray1[local280], Static118.aShortArrayArray5[local280][this.anIntArray432[local280]]);
					}
					if (this.anIntArray432[local280] < Static58.aShortArrayArray2[local280].length) {
						local278.method2752(Static108.aShortArray24[local280], Static58.aShortArrayArray2[local280][this.anIntArray432[local280]]);
					}
				}
				local132 = local278.method2745(64, 850, -30, -50, -30, true);
				Static14.aClass59_2.method1973(local132, local23);
				this.aLong146 = local23;
			}
		}
		if (arg0 == null && arg3 == null) {
			return local132;
		}
		@Pc(368) Class1_Sub2_Sub1_Sub4 local368;
		if (arg0 != null && arg3 != null) {
			local368 = arg0.method2899(local132, arg2, arg1, arg3);
		} else if (arg0 == null) {
			local368 = arg3.method2887(arg1, local132);
		} else {
			local368 = arg0.method2887(arg2, local132);
		}
		return local368;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)V")
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray432[arg1] = arg0;
		this.method3114();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public void method3121(@OriginalArg(1) boolean arg0) {
		this.aBoolean169 = arg0;
		this.method3114();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZII)V")
	public void method3122(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean169) {
			return;
		}
		@Pc(25) int local25 = this.anIntArray431[Static162.anIntArray388[arg1]];
		if (local25 == 0) {
			return;
		}
		local25 &= 0x3FFFFFFF;
		@Pc(53) Class1_Sub2_Sub15 local53;
		do {
			if (arg0) {
				local25++;
				if (Static157.anInt3571 <= local25) {
					local25 = 0;
				}
			} else {
				local25--;
				if (local25 < 0) {
					local25 = Static157.anInt3571 - 1;
				}
			}
			local53 = Static25.method552(local25);
		} while (local53 == null || local53.aBoolean144 || (this.aBoolean169 ? 7 : 0) + arg1 != local53.anInt3329);
		this.anIntArray431[Static162.anIntArray388[arg1]] = Integer.MIN_VALUE | local25;
		this.method3114();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZ)V")
	public void method3123(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray432[arg0];
		if (arg1) {
			local8++;
			if (local8 >= Static118.aShortArrayArray5[arg0].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static118.aShortArrayArray5[arg0].length - 1;
			}
		}
		this.anIntArray432[arg0] = local8;
		this.method3114();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZB)V")
	public void method3124(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean169) {
			this.method3116(-1, this.anIntArray432, arg0, null);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ka;I)V")
	public void method3125(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.method331(this.aBoolean169 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray431[Static162.anIntArray388[local16]];
			if ((local25 & Integer.MIN_VALUE) == 0) {
				arg0.method337(65535);
			} else {
				arg0.method337(local25 & 0x3FFFFFFF);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method331(this.anIntArray432[local25]);
		}
	}
}
