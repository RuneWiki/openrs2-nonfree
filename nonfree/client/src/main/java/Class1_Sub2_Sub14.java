import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!pb", name = "ab", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!pb", name = "wb", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!pb", name = "yb", descriptor = "I")
	public int anInt3329;

	@OriginalMember(owner = "client!pb", name = "Cb", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
	private int anInt3307 = 128;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "Z")
	public boolean aBoolean249 = false;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
	public int anInt3302 = 1;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
	public int anInt3301 = 0;

	@OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
	public int anInt3314 = 1;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
	public int anInt3319 = -1;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
	private int anInt3309 = 0;

	@OriginalMember(owner = "client!pb", name = "gb", descriptor = "Lclient!dd;")
	public Class13 aClass13_1114 = Static117.aClass13_1040;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
	private int anInt3321 = 128;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
	public int anInt3304 = 0;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
	private int anInt3316 = 0;

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
	public int anInt3317 = -1;

	@OriginalMember(owner = "client!pb", name = "ub", descriptor = "Z")
	public boolean aBoolean253 = true;

	@OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
	private int anInt3313 = 0;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "Z")
	public boolean aBoolean252 = false;

	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
	public int anInt3326 = -1;

	@OriginalMember(owner = "client!pb", name = "xb", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
	private int anInt3312 = -1;

	@OriginalMember(owner = "client!pb", name = "Ab", descriptor = "I")
	private int anInt3331 = -1;

	@OriginalMember(owner = "client!pb", name = "Db", descriptor = "I")
	public int anInt3333 = 0;

	@OriginalMember(owner = "client!pb", name = "Fb", descriptor = "I")
	private int anInt3335 = 0;

	@OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
	public int anInt3322 = 0;

	@OriginalMember(owner = "client!pb", name = "Jb", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "client!pb", name = "db", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!pb", name = "Hb", descriptor = "I")
	public int anInt3337 = 16;

	@OriginalMember(owner = "client!pb", name = "Bb", descriptor = "I")
	private int anInt3332 = 0;

	@OriginalMember(owner = "client!pb", name = "Ib", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!pb", name = "Gb", descriptor = "I")
	public int anInt3336 = -1;

	@OriginalMember(owner = "client!pb", name = "Eb", descriptor = "I")
	public int anInt3334 = -1;

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
	public int anInt3320 = 2;

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
	public int anInt3324 = -1;

	@OriginalMember(owner = "client!pb", name = "Pb", descriptor = "Z")
	public boolean aBoolean257 = true;

	@OriginalMember(owner = "client!pb", name = "Mb", descriptor = "[Lclient!dd;")
	public final Class13[] aClass13Array23 = new Class13[5];

	@OriginalMember(owner = "client!pb", name = "Qb", descriptor = "I")
	private int anInt3340 = -1;

	@OriginalMember(owner = "client!pb", name = "Lb", descriptor = "I")
	private int anInt3339 = 128;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII[[II)Lclient!pe;")
	public Class1_Sub2_Sub15 method2372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(26) long local26;
		if (this.anIntArray328 == null) {
			local26 = arg3 + (this.anInt3329 << 10);
		} else {
			local26 = (this.anInt3329 << 10) + (arg5 << 3) + arg3;
		}
		@Pc(42) Class1_Sub2_Sub15 local42 = (Class1_Sub2_Sub15) Static166.aClass47_30.method1999(local26);
		if (local42 == null) {
			local42 = new Class1_Sub2_Sub15();
			@Pc(54) Class1_Sub2_Sub2_Sub1 local54 = this.method2387(arg5, arg3);
			if (local54 == null) {
				return local42;
			}
			if (this.aBoolean256) {
				local54.aShort4 = (short) (this.anInt3316 + 64);
				local54.aShort7 = (short) (this.anInt3313 * 5 + 768);
				local54.method507();
				local42.aClass1_Sub2_Sub2_8 = local54;
			} else {
				local42.aClass1_Sub2_Sub2_8 = local54.method511(this.anInt3316 + 64, this.anInt3313 * 5 + 768, -50, -10, -50, this.anInt3340 >= 0);
			}
			Static166.aClass47_30.method1998(local42, local26);
		}
		if (this.aBoolean256 || this.anInt3340 >= 0) {
			@Pc(126) Class1_Sub2_Sub15 local126 = new Class1_Sub2_Sub15();
			local126.aClass1_Sub2_Sub2_8 = local42.aClass1_Sub2_Sub2_8;
			local42 = local126;
			if (this.aBoolean256) {
				local126.aClass1_Sub2_Sub2_8 = ((Class1_Sub2_Sub2_Sub1) local126.aClass1_Sub2_Sub2_8).method499();
			}
			if (this.anInt3340 >= 0) {
				if (local126.aClass1_Sub2_Sub2_8 instanceof Class1_Sub2_Sub2_Sub5) {
					local126.aClass1_Sub2_Sub2_8 = ((Class1_Sub2_Sub2_Sub5) local126.aClass1_Sub2_Sub2_8).method2712(arg4, arg1, arg0, arg2, true, this.anInt3340);
				} else if (local126.aClass1_Sub2_Sub2_8 instanceof Class1_Sub2_Sub2_Sub1) {
					local126.aClass1_Sub2_Sub2_8 = ((Class1_Sub2_Sub2_Sub1) local126.aClass1_Sub2_Sub2_8).method515(arg4, arg1, arg0, arg2, this.anInt3340);
				}
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[[IIII)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method2373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray328 == null) {
			local14 = (this.anInt3329 << 10) + arg0;
		} else {
			local14 = (arg4 << 3) + (this.anInt3329 << 10) + arg0;
		}
		@Pc(39) Class1_Sub2_Sub2_Sub5 local39 = (Class1_Sub2_Sub2_Sub5) Static58.aClass47_13.method1999(local14);
		if (local39 == null) {
			@Pc(51) Class1_Sub2_Sub2_Sub1 local51 = this.method2387(arg4, arg0);
			if (local51 == null) {
				return null;
			}
			local39 = local51.method511(this.anInt3316 + 64, this.anInt3313 * 5 + 768, -50, -10, -50, this.anInt3340 >= 0);
			Static58.aClass47_13.method1998(local39, local14);
		}
		if (this.anInt3340 >= 0) {
			local39 = local39.method2712(arg2, arg5, arg1, arg3, true, this.anInt3340);
		}
		return local39;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ce;B)V")
	private void method2374(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		@Pc(138) int local138;
		@Pc(148) int local148;
		if (arg0 == 1) {
			local138 = arg1.method1607();
			if (local138 > 0) {
				if (this.anIntArray327 == null || Static179.aBoolean316) {
					this.anIntArray327 = new int[local138];
					this.anIntArray328 = new int[local138];
					for (local148 = 0; local148 < local138; local148++) {
						this.anIntArray327[local148] = arg1.method1642();
						this.anIntArray328[local148] = arg1.method1607();
					}
				} else {
					arg1.anInt2195 += local138 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass13_1114 = arg1.method1622();
		} else if (arg0 == 5) {
			local138 = arg1.method1607();
			if (local138 > 0) {
				if (this.anIntArray327 == null || Static179.aBoolean316) {
					this.anIntArray328 = null;
					this.anIntArray327 = new int[local138];
					for (local148 = 0; local148 < local138; local148++) {
						this.anIntArray327[local148] = arg1.method1642();
					}
				} else {
					arg1.anInt2195 += local138 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt3302 = arg1.method1607();
		} else if (arg0 == 15) {
			this.anInt3314 = arg1.method1607();
		} else if (arg0 == 17) {
			this.anInt3320 = 0;
			this.aBoolean257 = false;
		} else if (arg0 == 18) {
			this.aBoolean257 = false;
		} else if (arg0 == 19) {
			this.anInt3319 = arg1.method1607();
		} else if (arg0 == 21) {
			this.anInt3340 = 0;
		} else if (arg0 == 22) {
			this.aBoolean256 = true;
		} else if (arg0 == 23) {
			this.aBoolean252 = true;
		} else if (arg0 == 24) {
			this.anInt3336 = arg1.method1642();
			if (this.anInt3336 == 65535) {
				this.anInt3336 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt3320 = 1;
		} else if (arg0 == 28) {
			this.anInt3337 = arg1.method1607();
		} else if (arg0 == 29) {
			this.anInt3316 = arg1.method1611();
		} else if (arg0 == 39) {
			this.anInt3313 = arg1.method1611() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass13Array23[arg0 - 30] = arg1.method1622();
			if (this.aClass13Array23[arg0 - 30].method894(Static42.aClass13_486)) {
				this.aClass13Array23[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local138 = arg1.method1607();
			this.aShortArray39 = new short[local138];
			this.aShortArray37 = new short[local138];
			for (local148 = 0; local148 < local138; local148++) {
				this.aShortArray39[local148] = (short) arg1.method1642();
				this.aShortArray37[local148] = (short) arg1.method1642();
			}
		} else if (arg0 == 41) {
			local138 = arg1.method1607();
			this.aShortArray36 = new short[local138];
			this.aShortArray38 = new short[local138];
			for (local148 = 0; local148 < local138; local148++) {
				this.aShortArray36[local148] = (short) arg1.method1642();
				this.aShortArray38[local148] = (short) arg1.method1642();
			}
		} else if (arg0 == 60) {
			this.anInt3317 = arg1.method1642();
		} else if (arg0 == 62) {
			this.aBoolean254 = true;
		} else if (arg0 == 64) {
			this.aBoolean253 = false;
		} else if (arg0 == 65) {
			this.anInt3321 = arg1.method1642();
		} else if (arg0 == 66) {
			this.anInt3307 = arg1.method1642();
		} else if (arg0 == 67) {
			this.anInt3339 = arg1.method1642();
		} else if (arg0 == 68) {
			this.anInt3334 = arg1.method1642();
		} else if (arg0 == 69) {
			this.anInt3304 = arg1.method1607();
		} else if (arg0 == 70) {
			this.anInt3332 = arg1.method1627();
		} else if (arg0 == 71) {
			this.anInt3309 = arg1.method1627();
		} else if (arg0 == 72) {
			this.anInt3335 = arg1.method1627();
		} else if (arg0 == 73) {
			this.aBoolean249 = true;
		} else if (arg0 == 74) {
			this.aBoolean251 = true;
		} else if (arg0 == 75) {
			this.anInt3326 = arg1.method1607();
		} else if (arg0 == 77) {
			this.anInt3331 = arg1.method1642();
			if (this.anInt3331 == 65535) {
				this.anInt3331 = -1;
			}
			this.anInt3312 = arg1.method1642();
			if (this.anInt3312 == 65535) {
				this.anInt3312 = -1;
			}
			local138 = arg1.method1607();
			this.anIntArray326 = new int[local138 + 1];
			for (local148 = 0; local148 <= local138; local148++) {
				this.anIntArray326[local148] = arg1.method1642();
				if (this.anIntArray326[local148] == 65535) {
					this.anIntArray326[local148] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt3324 = arg1.method1642();
			this.anInt3333 = arg1.method1607();
		} else if (arg0 == 79) {
			this.anInt3322 = arg1.method1642();
			this.anInt3301 = arg1.method1642();
			this.anInt3333 = arg1.method1607();
			local138 = arg1.method1607();
			this.anIntArray329 = new int[local138];
			for (local148 = 0; local148 < local138; local148++) {
				this.anIntArray329[local148] = arg1.method1642();
			}
		} else if (arg0 == 81) {
			this.anInt3340 = arg1.method1607() * 256;
		} else if (arg0 != 82) {
			if (arg0 == 83) {
				arg1.method1607();
			} else if (arg0 == 84) {
				arg1.method1627();
			} else if (arg0 == 85) {
				arg1.method1627();
			} else if (arg0 == 86) {
				arg1.method1627();
			} else if (arg0 == 87) {
				arg1.method1642();
			} else if (arg0 != 88) {
				if (arg0 == 89) {
					this.aBoolean250 = false;
				} else if (arg0 == 90) {
					this.aBoolean255 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	public void method2375() {
		if (this.anInt3319 == -1) {
			this.anInt3319 = 0;
			if (this.anIntArray327 != null && (this.anIntArray328 == null || this.anIntArray328[0] == 10)) {
				this.anInt3319 = 1;
			}
			for (@Pc(30) int local30 = 0; local30 < 5; local30++) {
				if (this.aClass13Array23[local30] != null) {
					this.anInt3319 = 1;
				}
			}
		}
		if (this.anInt3326 == -1) {
			this.anInt3326 = this.anInt3320 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)Z")
	public boolean method2378() {
		if (this.anIntArray326 == null) {
			return this.anInt3324 != -1 || this.anIntArray329 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray326.length; local22++) {
			if (this.anIntArray326[local22] != -1) {
				@Pc(44) Class1_Sub2_Sub14 local44 = Static4.method79(this.anIntArray326[local22]);
				if (local44.anInt3324 != -1 || local44.anIntArray329 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)Z")
	public boolean method2382() {
		if (this.anIntArray327 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray327.length; local20++) {
			local18 &= Static103.aClass4_66.method2247(this.anIntArray327[local20] & 0xFFFF, 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIILclient!fa;I[[III)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method2383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub8 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray328 == null) {
			local16 = arg7 + (this.anInt3329 << 10);
		} else {
			local16 = (arg1 << 3) + (this.anInt3329 << 10) + arg7;
		}
		@Pc(37) Class1_Sub2_Sub2_Sub5 local37 = (Class1_Sub2_Sub2_Sub5) Static159.aClass47_27.method1999(local16);
		if (local37 == null) {
			@Pc(50) Class1_Sub2_Sub2_Sub1 local50 = this.method2387(arg1, arg7);
			if (local50 == null) {
				return null;
			}
			local37 = local50.method511(this.anInt3316 + 64, 768 - -(this.anInt3313 * 5), -50, -10, -50, true);
			Static159.aClass47_27.method1998(local37, local16);
		}
		if (arg4 == null && this.anInt3340 == -1) {
			return local37;
		}
		if (arg4 == null) {
			local37 = local37.method2721(true);
		} else {
			local37 = arg4.method1201(local37, arg2, arg7);
		}
		if (this.anInt3340 >= 0) {
			local37 = local37.method2712(arg6, arg0, arg5, arg3, false, this.anInt3340);
		}
		return local37;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ce;B)V")
	public void method2384(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1607();
			if (local5 == 0) {
				return;
			}
			this.method2374(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)Lclient!pb;")
	public Class1_Sub2_Sub14 method2385() {
		@Pc(5) int local5 = -1;
		if (this.anInt3331 != -1) {
			local5 = Static108.method2112(this.anInt3331);
		} else if (this.anInt3312 != -1) {
			local5 = Static103.anIntArray266[this.anInt3312];
		}
		return local5 < 0 || local5 >= this.anIntArray326.length || this.anIntArray326[local5] == -1 ? null : Static4.method79(this.anIntArray326[local5]);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public boolean method2386(@OriginalArg(0) int arg0) {
		if (this.anIntArray328 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray328.length; local15++) {
				if (this.anIntArray328[local15] == arg0) {
					return Static103.aClass4_66.method2247(this.anIntArray327[local15] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray327 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < this.anIntArray327.length; local64++) {
				local62 &= Static103.aClass4_66.method2247(this.anIntArray327[local64] & 0xFFFF, 0);
			}
			return local62;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ)Lclient!be;")
	private Class1_Sub2_Sub2_Sub1 method2387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub2_Sub2_Sub1 local7 = null;
		@Pc(10) boolean local10 = this.aBoolean254;
		if (arg0 == 2 && arg1 > 3) {
			local10 = !local10;
		}
		@Pc(31) int local31;
		@Pc(33) int local33;
		@Pc(65) int local65;
		if (this.anIntArray328 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray327 == null) {
				return null;
			}
			local31 = this.anIntArray327.length;
			for (local33 = 0; local33 < local31; local33++) {
				local65 = this.anIntArray327[local33];
				if (local10) {
					local65 += 65536;
				}
				local7 = (Class1_Sub2_Sub2_Sub1) Static166.aClass47_28.method1999((long) local65);
				if (local7 == null) {
					local7 = Static13.method505(Static103.aClass4_66, local65 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local10) {
						local7.method496();
					}
					Static166.aClass47_28.method1998(local7, (long) local65);
				}
				if (local31 > 1) {
					Static99.aClass1_Sub2_Sub2_Sub1Array1[local33] = local7;
				}
			}
			if (local31 > 1) {
				local7 = new Class1_Sub2_Sub2_Sub1(Static99.aClass1_Sub2_Sub2_Sub1Array1, local31);
			}
		} else {
			local31 = -1;
			for (local33 = 0; local33 < this.anIntArray328.length; local33++) {
				if (this.anIntArray328[local33] == arg0) {
					local31 = local33;
					break;
				}
			}
			if (local31 == -1) {
				return null;
			}
			local65 = this.anIntArray327[local31];
			if (local10) {
				local65 += 65536;
			}
			local7 = (Class1_Sub2_Sub2_Sub1) Static166.aClass47_28.method1999((long) local65);
			if (local7 == null) {
				local7 = Static13.method505(Static103.aClass4_66, local65 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local10) {
					local7.method496();
				}
				Static166.aClass47_28.method1998(local7, (long) local65);
			}
		}
		@Pc(198) boolean local198;
		if (this.anInt3321 == 128 && this.anInt3307 == 128 && this.anInt3339 == 128) {
			local198 = false;
		} else {
			local198 = true;
		}
		@Pc(219) boolean local219;
		if (this.anInt3332 == 0 && this.anInt3309 == 0 && this.anInt3335 == 0) {
			local219 = false;
		} else {
			local219 = true;
		}
		@Pc(255) Class1_Sub2_Sub2_Sub1 local255 = new Class1_Sub2_Sub2_Sub1(local7, arg1 == 0 && !local198 && !local219 && !local10, this.aShortArray39 == null, this.aShortArray36 == null, true);
		if (local10) {
			local255.method500();
		}
		if (arg0 == 4 && arg1 > 3) {
			local255.method506();
			local255.method509(45, 0, -45);
		}
		@Pc(279) int local279 = arg1 & 0x3;
		if (local279 == 1) {
			local255.method497();
		} else if (local279 == 2) {
			local255.method501();
		} else if (local279 == 3) {
			local255.method517();
		}
		@Pc(305) int local305;
		if (this.aShortArray39 != null) {
			for (local305 = 0; local305 < this.aShortArray39.length; local305++) {
				local255.method513(this.aShortArray39[local305], this.aShortArray37[local305]);
			}
		}
		if (this.aShortArray36 != null) {
			for (local305 = 0; local305 < this.aShortArray36.length; local305++) {
				local255.method503(this.aShortArray36[local305], this.aShortArray38[local305]);
			}
		}
		if (local198) {
			local255.method514(this.anInt3321, this.anInt3307, this.anInt3339);
		}
		if (local219) {
			local255.method509(this.anInt3332, this.anInt3309, this.anInt3335);
		}
		return local255;
	}
}
