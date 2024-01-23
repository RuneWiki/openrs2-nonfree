import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class111 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "J")
	private long aLong147;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "I")
	private int anInt4227;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V")
	public void method3274(@OriginalArg(0) boolean arg0) {
		this.aBoolean191 = arg0;
		this.method3284();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!fc;IB)Lclient!ei;")
	public Class5_Sub2 method3276(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4227 != -1) {
			return Static168.method2871(this.anInt4227).method597(arg1, arg0);
		}
		@Pc(33) Class5_Sub2 local33 = (Class5_Sub2) Static76.aClass53_15.method1501(this.aLong146);
		if (local33 == null) {
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				@Pc(46) int local46 = this.anIntArray323[local39];
				if ((local46 & 0x40000000) == 0) {
					if ((local46 & Integer.MIN_VALUE) != 0 && !Static164.method2799(local46 & 0x3FFFFFFF).method1463()) {
						local37 = true;
					}
				} else if (!Static36.method637(local46 & 0x3FFFFFFF).method2820(this.aBoolean191)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(96) int local96 = 0;
			@Pc(99) Class5_Sub6[] local99 = new Class5_Sub6[12];
			for (@Pc(101) int local101 = 0; local101 < 12; local101++) {
				@Pc(108) int local108 = this.anIntArray323[local101];
				@Pc(127) Class5_Sub6 local127;
				if ((local108 & 0x40000000) != 0) {
					local127 = Static36.method637(local108 & 0x3FFFFFFF).method2809(this.aBoolean191);
					if (local127 != null) {
						local99[local96++] = local127;
					}
				} else if ((local108 & Integer.MIN_VALUE) != 0) {
					local127 = Static164.method2799(local108 & 0x3FFFFFFF).method1467();
					if (local127 != null) {
						local99[local96++] = local127;
					}
				}
			}
			@Pc(165) Class5_Sub6 local165 = new Class5_Sub6(local99, local96);
			for (@Pc(167) int local167 = 0; local167 < 5; local167++) {
				if (this.anIntArray324[local167] < Static212.aShortArrayArray6[local167].length) {
					local165.method3566(Static83.aShortArray15[local167], Static212.aShortArrayArray6[local167][this.anIntArray324[local167]]);
				}
				if (Static131.aShortArrayArray3[local167].length > this.anIntArray324[local167]) {
					local165.method3566(Static81.aShortArray14[local167], Static131.aShortArrayArray3[local167][this.anIntArray324[local167]]);
				}
			}
			local33 = local165.method3582(64, 768, -50, -10, -50);
			Static76.aClass53_15.method1497(local33, this.aLong146);
		}
		if (arg0 != null) {
			local33 = arg0.method934(local33, arg1);
		}
		return local33;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!fc;IILclient!fc;)Lclient!ei;")
	public Class5_Sub2 method3278(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class40 arg3) {
		if (this.anInt4227 != -1) {
			return Static168.method2871(this.anInt4227).method599(arg2, arg0, arg3, arg1);
		}
		@Pc(31) int[] local31 = this.anIntArray323;
		@Pc(34) long local34 = this.aLong146;
		if (arg3 != null && (arg3.anInt1243 >= 0 || arg3.anInt1260 >= 0)) {
			local31 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local31[local47] = this.anIntArray323[local47];
			}
			if (arg3.anInt1243 >= 0) {
				if (arg3.anInt1243 == 65535) {
					local31[5] = 0;
					local34 ^= 0xFFFFFFFF00000000L;
				} else {
					local31[5] = arg3.anInt1243 | 0x40000000;
					local34 ^= (long) local31[5] << 32;
				}
			}
			if (arg3.anInt1260 >= 0) {
				if (arg3.anInt1260 == 65535) {
					local34 ^= 0xFFFFFFFFL;
					local31[3] = 0;
				} else {
					local31[3] = arg3.anInt1260 | 0x40000000;
					local34 ^= local31[3];
				}
			}
		}
		@Pc(135) Class5_Sub2 local135 = (Class5_Sub2) Static140.aClass53_22.method1501(local34);
		if (local135 == null) {
			@Pc(139) boolean local139 = false;
			for (@Pc(141) int local141 = 0; local141 < 12; local141++) {
				@Pc(147) int local147 = local31[local141];
				if ((local147 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local147) != 0 && !Static164.method2799(local147 & 0x3FFFFFFF).method1470()) {
						local139 = true;
					}
				} else if (!Static36.method637(local147 & 0x3FFFFFFF).method2808(this.aBoolean191)) {
					local139 = true;
				}
			}
			if (local139) {
				if (this.aLong147 != -1L) {
					local135 = (Class5_Sub2) Static140.aClass53_22.method1501(this.aLong147);
				}
				if (local135 == null) {
					return null;
				}
			}
			if (local135 == null) {
				@Pc(214) Class5_Sub6[] local214 = new Class5_Sub6[12];
				@Pc(216) int local216 = 0;
				@Pc(224) int local224;
				@Pc(238) Class5_Sub6 local238;
				for (@Pc(218) int local218 = 0; local218 < 12; local218++) {
					local224 = local31[local218];
					if ((local224 & 0x40000000) != 0) {
						local238 = Static36.method637(local224 & 0x3FFFFFFF).method2811(this.aBoolean191);
						if (local238 != null) {
							local214[local216++] = local238;
						}
					} else if ((Integer.MIN_VALUE & local224) != 0) {
						local238 = Static164.method2799(local224 & 0x3FFFFFFF).method1469();
						if (local238 != null) {
							local214[local216++] = local238;
						}
					}
				}
				local224 = local31[0];
				@Pc(292) int local292;
				if ((local224 & 0x40000000) != 0) {
					@Pc(287) Class92 local287 = Static36.method637(local224 & 0x3FFFFFFF);
					if (local287.anIntArrayArray23 != null) {
						for (local292 = 0; local292 < local287.anIntArrayArray23.length; local292++) {
							if (local287.anIntArrayArray23[local292] != null && local214[local292 + 1] != null) {
								@Pc(314) int local314 = local287.anIntArrayArray23[local292][0];
								@Pc(321) int local321 = local287.anIntArrayArray23[local292][2];
								@Pc(328) int local328 = local287.anIntArrayArray23[local292][1];
								@Pc(335) int local335 = local287.anIntArrayArray23[local292][5];
								@Pc(342) int local342 = local287.anIntArrayArray23[local292][4];
								@Pc(349) int local349 = local287.anIntArrayArray23[local292][3];
								local214[local292 + 1].method3568(local314, local328, local321);
								local214[local292 + 1].method3584(local349, local342, local335);
							}
						}
					}
				}
				local238 = new Class5_Sub6(local214, local216);
				for (local292 = 0; local292 < 5; local292++) {
					if (this.anIntArray324[local292] < Static212.aShortArrayArray6[local292].length) {
						local238.method3566(Static83.aShortArray15[local292], Static212.aShortArrayArray6[local292][this.anIntArray324[local292]]);
					}
					if (Static131.aShortArrayArray3[local292].length > this.anIntArray324[local292]) {
						local238.method3566(Static81.aShortArray14[local292], Static131.aShortArrayArray3[local292][this.anIntArray324[local292]]);
					}
				}
				local135 = local238.method3582(64, 850, -30, -50, -30);
				Static140.aClass53_22.method1497(local135, local34);
				this.aLong147 = local34;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local135;
		}
		@Pc(467) Class5_Sub2 local467;
		if (arg3 != null && arg1 != null) {
			local467 = arg3.method935(arg2, arg0, arg1, local135);
		} else if (arg3 == null) {
			local467 = arg1.method940(arg2, local135);
		} else {
			local467 = arg3.method940(arg0, local135);
		}
		return local467;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public void method3279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray324[arg0] = arg1;
		this.method3284();
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
	public int method3281() {
		return this.anInt4227 == -1 ? (this.anIntArray323[8] << 10) + (this.anIntArray324[4] << 20) + (this.anIntArray324[0] << 25) - (-(this.anIntArray323[0] << 15) + -(this.anIntArray323[11] << 5) + -this.anIntArray323[1]) : Static168.method2871(this.anInt4227).anInt799 + 305419896;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[II[IZ)V")
	public void method3282(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static114.anInt2490; local16++) {
					@Pc(22) Class52 local22 = Static164.method2799(local16);
					if (local22 != null && !local22.aBoolean86 && (arg3 ? 7 : 0) + local12 == local22.anInt1966) {
						arg2[Static2.anIntArray1[local12]] = local16 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray323 = arg2;
		this.anInt4227 = arg0;
		this.aBoolean191 = arg3;
		this.anIntArray324 = arg1;
		this.method3284();
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public void method3283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static2.anIntArray1[arg1];
		if (this.anIntArray323[local8] != 0 && Static164.method2799(arg0) != null) {
			this.anIntArray323[local8] = arg0 | Integer.MIN_VALUE;
			this.method3284();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	private void method3284() {
		@Pc(3) long[] local3 = Class1_Sub14.aLongArray6;
		@Pc(6) long local6 = this.aLong146;
		this.aLong146 = -1L;
		for (@Pc(15) int local15 = 0; local15 < 12; local15++) {
			this.aLong146 = local3[(int) (((long) (this.anIntArray323[local15] >> 24) ^ this.aLong146) & 0xFFL)] ^ this.aLong146 >>> 8;
			this.aLong146 = local3[(int) ((this.aLong146 ^ (long) (this.anIntArray323[local15] >> 16)) & 0xFFL)] ^ this.aLong146 >>> 8;
			this.aLong146 = this.aLong146 >>> 8 ^ local3[(int) ((this.aLong146 ^ (long) (this.anIntArray323[local15] >> 8)) & 0xFFL)];
			this.aLong146 = this.aLong146 >>> 8 ^ local3[(int) (((long) this.anIntArray323[local15] ^ this.aLong146) & 0xFFL)];
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong146 = this.aLong146 >>> 8 ^ local3[(int) (((long) this.anIntArray324[local109] ^ this.aLong146) & 0xFFL)];
		}
		this.aLong146 = this.aLong146 >>> 8 ^ local3[(int) (((long) (this.aBoolean191 ? 1 : 0) ^ this.aLong146) & 0xFFL)];
		if (local6 != 0L && this.aLong146 != local6) {
			Static140.aClass53_22.method1500(local6);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLclient!fc;II)Lclient!ei;")
	public Class5_Sub2 method3285(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) arg3 | (long) (arg2 << 16) | (long) arg3 << 32;
		@Pc(29) Class5_Sub2 local29 = (Class5_Sub2) Static76.aClass53_15.method1501(local23);
		if (local29 == null) {
			@Pc(34) Class5_Sub6[] local34 = new Class5_Sub6[2];
			@Pc(36) int local36 = 0;
			if (!Static164.method2799(arg3).method1463() || !Static164.method2799(arg2).method1463()) {
				return null;
			}
			@Pc(54) Class5_Sub6 local54 = Static164.method2799(arg3).method1467();
			if (local54 != null) {
				local36++;
				local34[0] = local54;
			}
			local54 = Static164.method2799(arg2).method1467();
			if (local54 != null) {
				local34[local36++] = local54;
			}
			local54 = new Class5_Sub6(local34, local36);
			for (@Pc(82) int local82 = 0; local82 < 5; local82++) {
				if (Static212.aShortArrayArray6[local82].length > this.anIntArray324[local82]) {
					local54.method3566(Static83.aShortArray15[local82], Static212.aShortArrayArray6[local82][this.anIntArray324[local82]]);
				}
				if (this.anIntArray324[local82] < Static131.aShortArrayArray3[local82].length) {
					local54.method3566(Static81.aShortArray14[local82], Static131.aShortArrayArray3[local82][this.anIntArray324[local82]]);
				}
			}
			local29 = local54.method3582(64, 768, -50, -10, -50);
			Static76.aClass53_15.method1497(local29, local23);
		}
		if (arg1 != null) {
			local29 = arg1.method934(local29, arg0);
		}
		return local29;
	}
}
