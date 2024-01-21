import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class49 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	public boolean aBoolean100;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	private int anInt1880;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	public int method1510() {
		return this.anInt1880 == -1 ? this.anIntArray182[1] + (this.anIntArray182[0] << 15) + (this.anIntArray183[4] << 20) + (this.anIntArray183[0] << 25) + (this.anIntArray182[8] << 10) + (this.anIntArray182[11] << 5) : 305419896 - -Static133.method2214(this.anInt1880).anInt3201;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[I[IZI)V")
	public void method1512(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static156.anInt4254; local12++) {
					@Pc(18) Class2_Sub2_Sub23 local18 = Static32.method671(local12);
					if (local18 != null && !local18.aBoolean143 && local18.anInt2999 == (arg2 ? 7 : 0) + local8) {
						arg0[Static44.anIntArray92[local8]] = local12 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray182 = arg0;
		this.aBoolean100 = arg2;
		this.anIntArray183 = arg1;
		this.anInt1880 = arg3;
		this.method1514();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
	public void method1513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray183[arg1] = arg0;
		this.method1514();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	private void method1514() {
		@Pc(15) long[] local15 = Class35_Sub3.aLongArray2;
		@Pc(18) long local18 = this.aLong60;
		this.aLong60 = -1L;
		for (@Pc(23) int local23 = 0; local23 < 12; local23++) {
			this.aLong60 = local15[(int) (((long) (this.anIntArray182[local23] >> 24) ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
			this.aLong60 = local15[(int) ((this.aLong60 ^ (long) (this.anIntArray182[local23] >> 16)) & 0xFFL)] ^ this.aLong60 >>> 8;
			this.aLong60 = local15[(int) (((long) (this.anIntArray182[local23] >> 8) ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
			this.aLong60 = local15[(int) (((long) this.anIntArray182[local23] ^ this.aLong60) & 0xFFL)] ^ this.aLong60 >>> 8;
		}
		for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
			this.aLong60 = this.aLong60 >>> 8 ^ local15[(int) ((this.aLong60 ^ (long) this.anIntArray183[local119]) & 0xFFL)];
		}
		this.aLong60 = this.aLong60 >>> 8 ^ local15[(int) ((this.aLong60 ^ (long) (this.aBoolean100 ? 1 : 0)) & 0xFFL)];
		if (local18 != 0L && local18 != this.aLong60) {
			Static99.aClass91_6.method2706(local18);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
	public void method1516(@OriginalArg(1) boolean arg0) {
		this.aBoolean100 = arg0;
		this.method1514();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!ki;)Lclient!gj;")
	public Class24_Sub3 method1517(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub16 arg1) {
		if (this.anInt1880 != -1) {
			return Static133.method2214(this.anInt1880).method2445(arg0, arg1);
		}
		@Pc(34) Class24_Sub3 local34 = (Class24_Sub3) Static36.aClass91_2.method2702(this.aLong60);
		if (local34 == null) {
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
				@Pc(47) int local47 = this.anIntArray182[local40];
				if ((local47 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local47) != 0 && !Static32.method671(local47 & 0x3FFFFFFF).method2297()) {
						local38 = true;
					}
				} else if (!Static113.method1987(local47 & 0x3FFFFFFF).method331(this.aBoolean100)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(95) Class24_Sub7[] local95 = new Class24_Sub7[12];
			@Pc(97) int local97 = 0;
			for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
				@Pc(106) int local106 = this.anIntArray182[local99];
				@Pc(123) Class24_Sub7 local123;
				if ((local106 & 0x40000000) != 0) {
					local123 = Static113.method1987(local106 & 0x3FFFFFFF).method343(this.aBoolean100);
					if (local123 != null) {
						local95[local97++] = local123;
					}
				} else if ((Integer.MIN_VALUE & local106) != 0) {
					local123 = Static32.method671(local106 & 0x3FFFFFFF).method2295();
					if (local123 != null) {
						local95[local97++] = local123;
					}
				}
			}
			@Pc(166) Class24_Sub7 local166 = new Class24_Sub7(local95, local97);
			for (@Pc(168) int local168 = 0; local168 < 5; local168++) {
				if (this.anIntArray183[local168] < Static105.aShortArrayArray3[local168].length) {
					local166.method2986(Static3.aShortArray1[local168], Static105.aShortArrayArray3[local168][this.anIntArray183[local168]]);
				}
				if (this.anIntArray183[local168] < Static3.aShortArrayArray1[local168].length) {
					local166.method2986(Static46.aShortArray13[local168], Static3.aShortArrayArray1[local168][this.anIntArray183[local168]]);
				}
			}
			local34 = local166.method2991(64, 768, -50, -10, -50);
			Static36.aClass91_2.method2710(this.aLong60, local34);
		}
		if (arg1 != null) {
			local34 = arg1.method1764(arg0, local34);
		}
		return local34;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static44.anIntArray92[arg1];
		if (this.anIntArray182[local3] != 0 && Static32.method671(arg0) != null) {
			this.anIntArray182[local3] = Integer.MIN_VALUE | arg0;
			this.method1514();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ki;IBLclient!ki;I)Lclient!gj;")
	public Class24_Sub3 method1521(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub16 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1880 != -1) {
			return Static133.method2214(this.anInt1880).method2451(arg1, arg0, arg3, arg2);
		}
		@Pc(23) int[] local23 = this.anIntArray182;
		@Pc(26) long local26 = this.aLong60;
		if (arg2 != null && (arg2.anInt2345 >= 0 || arg2.anInt2338 >= 0)) {
			local23 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local23[local45] = this.anIntArray182[local45];
			}
			if (arg2.anInt2345 >= 0) {
				if (arg2.anInt2345 == 65535) {
					local23[5] = 0;
					local26 ^= 0xFFFFFFFF00000000L;
				} else {
					local23[5] = arg2.anInt2345 | 0x40000000;
					local26 ^= (long) local23[5] << 32;
				}
			}
			if (arg2.anInt2338 >= 0) {
				if (arg2.anInt2338 == 65535) {
					local26 ^= 0xFFFFFFFFL;
					local23[3] = 0;
				} else {
					local23[3] = arg2.anInt2338 | 0x40000000;
					local26 ^= local23[3];
				}
			}
		}
		@Pc(133) Class24_Sub3 local133 = (Class24_Sub3) Static99.aClass91_6.method2702(local26);
		if (local133 == null) {
			@Pc(143) boolean local143 = false;
			for (@Pc(145) int local145 = 0; local145 < 12; local145++) {
				@Pc(151) int local151 = local23[local145];
				if ((local151 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local151) != 0 && !Static32.method671(local151 & 0x3FFFFFFF).method2300()) {
						local143 = true;
					}
				} else if (!Static113.method1987(local151 & 0x3FFFFFFF).method333(this.aBoolean100)) {
					local143 = true;
				}
			}
			if (local143) {
				if (this.aLong62 != -1L) {
					local133 = (Class24_Sub3) Static99.aClass91_6.method2702(this.aLong62);
				}
				if (local133 == null) {
					return null;
				}
			}
			if (local133 == null) {
				@Pc(212) int local212 = 0;
				@Pc(215) Class24_Sub7[] local215 = new Class24_Sub7[12];
				for (@Pc(217) int local217 = 0; local217 < 12; local217++) {
					@Pc(223) int local223 = local23[local217];
					@Pc(240) Class24_Sub7 local240;
					if ((local223 & 0x40000000) != 0) {
						local240 = Static113.method1987(local223 & 0x3FFFFFFF).method334(this.aBoolean100);
						if (local240 != null) {
							local215[local212++] = local240;
						}
					} else if ((local223 & Integer.MIN_VALUE) != 0) {
						local240 = Static32.method671(local223 & 0x3FFFFFFF).method2301();
						if (local240 != null) {
							local215[local212++] = local240;
						}
					}
				}
				@Pc(281) Class24_Sub7 local281 = new Class24_Sub7(local215, local212);
				for (@Pc(283) int local283 = 0; local283 < 5; local283++) {
					if (this.anIntArray183[local283] < Static105.aShortArrayArray3[local283].length) {
						local281.method2986(Static3.aShortArray1[local283], Static105.aShortArrayArray3[local283][this.anIntArray183[local283]]);
					}
					if (this.anIntArray183[local283] < Static3.aShortArrayArray1[local283].length) {
						local281.method2986(Static46.aShortArray13[local283], Static3.aShortArrayArray1[local283][this.anIntArray183[local283]]);
					}
				}
				local133 = local281.method2991(64, 850, -30, -50, -30);
				Static99.aClass91_6.method2710(local26, local133);
				this.aLong62 = local26;
			}
		}
		if (arg2 == null && arg0 == null) {
			return local133;
		}
		@Pc(373) Class24_Sub3 local373;
		if (arg2 != null && arg0 != null) {
			local373 = arg2.method1760(arg0, local133, arg1, arg3);
		} else if (arg2 == null) {
			local373 = arg0.method1765(arg3, local133);
		} else {
			local373 = arg2.method1765(arg1, local133);
		}
		return local373;
	}
}
