import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
	public int anInt374;

	@OriginalMember(owner = "client!bd", name = "sb", descriptor = "[I")
	public int[] anIntArray60;

	@OriginalMember(owner = "client!bd", name = "Bb", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!bd", name = "Jb", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!bd", name = "Pb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!bd", name = "Xb", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!bd", name = "ac", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
	public int anInt376 = 0;

	@OriginalMember(owner = "client!bd", name = "vb", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
	public int anInt382 = -1;

	@OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
	public int anInt377 = 0;

	@OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
	public int anInt383 = 0;

	@OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
	private int anInt379 = -1;

	@OriginalMember(owner = "client!bd", name = "Fb", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!bd", name = "Lb", descriptor = "Lclient!rd;")
	public Class64 aClass64_279 = Static67.aClass64_957;

	@OriginalMember(owner = "client!bd", name = "Tb", descriptor = "I")
	public int anInt405 = 16;

	@OriginalMember(owner = "client!bd", name = "Wb", descriptor = "I")
	private int anInt407 = 128;

	@OriginalMember(owner = "client!bd", name = "Gb", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bd", name = "bb", descriptor = "Z")
	public boolean aBoolean24 = true;

	@OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
	private int anInt380 = 0;

	@OriginalMember(owner = "client!bd", name = "Rb", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bd", name = "Hb", descriptor = "I")
	public int anInt398 = -1;

	@OriginalMember(owner = "client!bd", name = "Yb", descriptor = "I")
	public int anInt408 = 0;

	@OriginalMember(owner = "client!bd", name = "ib", descriptor = "Z")
	public boolean aBoolean25 = true;

	@OriginalMember(owner = "client!bd", name = "Cb", descriptor = "I")
	public int anInt395 = -1;

	@OriginalMember(owner = "client!bd", name = "Db", descriptor = "I")
	private int anInt396 = 0;

	@OriginalMember(owner = "client!bd", name = "gc", descriptor = "I")
	private int anInt414 = 0;

	@OriginalMember(owner = "client!bd", name = "Ub", descriptor = "Z")
	public boolean aBoolean31 = true;

	@OriginalMember(owner = "client!bd", name = "ec", descriptor = "I")
	private int anInt412 = -1;

	@OriginalMember(owner = "client!bd", name = "Mb", descriptor = "I")
	public int anInt401 = -1;

	@OriginalMember(owner = "client!bd", name = "yb", descriptor = "I")
	private int anInt392 = 128;

	@OriginalMember(owner = "client!bd", name = "dc", descriptor = "I")
	public int anInt411 = 1;

	@OriginalMember(owner = "client!bd", name = "Zb", descriptor = "[Lclient!rd;")
	public final Class64[] aClass64Array5 = new Class64[5];

	@OriginalMember(owner = "client!bd", name = "fc", descriptor = "I")
	public int anInt413 = -1;

	@OriginalMember(owner = "client!bd", name = "bc", descriptor = "I")
	private int anInt409 = 0;

	@OriginalMember(owner = "client!bd", name = "Sb", descriptor = "I")
	private int anInt404 = 0;

	@OriginalMember(owner = "client!bd", name = "wb", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bd", name = "rc", descriptor = "I")
	private int anInt419 = 128;

	@OriginalMember(owner = "client!bd", name = "tc", descriptor = "I")
	public int anInt420 = 1;

	@OriginalMember(owner = "client!bd", name = "ic", descriptor = "I")
	public int anInt416 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public boolean method246(@OriginalArg(1) int arg0) {
		if (this.anIntArray62 != null) {
			for (@Pc(52) int local52 = 0; local52 < this.anIntArray62.length; local52++) {
				if (this.anIntArray62[local52] == arg0) {
					return Static85.aClass41_73.method1072(0, this.anIntArray63[local52] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray63 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(25) boolean local25 = true;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray63.length; local27++) {
				local25 &= Static85.aClass41_73.method1072(0, this.anIntArray63[local27] & 0xFFFF);
			}
			return local25;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)Z")
	public boolean method247() {
		if (this.anIntArray63 == null) {
			return true;
		}
		@Pc(23) boolean local23 = true;
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray63.length; local25++) {
			local23 &= Static85.aClass41_73.method1072(0, this.anIntArray63[local25] & 0xFFFF);
		}
		return local23;
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)Lclient!bd;")
	public Class1_Sub1_Sub3 method248() {
		@Pc(5) int local5 = -1;
		if (this.anInt412 != -1) {
			local5 = Static75.method1253(this.anInt412);
		} else if (this.anInt379 != -1) {
			local5 = Static101.anIntArray333[this.anInt379];
		}
		return local5 < 0 || this.anIntArray61.length <= local5 || this.anIntArray61[local5] == -1 ? null : Static108.method1807(this.anIntArray61[local5]);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!id;)V")
	public void method250(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1837();
			if (local17 == 0) {
				return;
			}
			this.method256(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)Lclient!ha;")
	public Class1_Sub1_Sub2 method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray62 == null) {
			local16 = arg0 + (this.anInt374 << 10);
		} else {
			local16 = arg0 + (arg5 << 3) + (this.anInt374 << 10);
		}
		@Pc(36) Class1_Sub1_Sub2 local36 = (Class1_Sub1_Sub2) Static104.aClass19_94.method410(local16);
		if (local36 == null) {
			@Pc(49) Class1_Sub1_Sub2_Sub3 local49 = this.method263(arg5, arg0);
			if (local49 == null) {
				return null;
			}
			if (this.aBoolean26) {
				local49.aShort1 = (short) (this.anInt414 * 5 + 768);
				local36 = local49;
				local49.aShort2 = (short) (this.anInt396 + 64);
				local49.method1005();
			} else {
				local36 = local49.method1002(this.anInt396 + 64, this.anInt414 * 5 + 768, -50, -10, -50);
			}
			Static104.aClass19_94.method409(local36, local16);
		}
		if (this.aBoolean26) {
			local36 = ((Class1_Sub1_Sub2_Sub3) local36).method1001();
		}
		if (this.aBoolean28) {
			if (local36 instanceof Class1_Sub1_Sub2_Sub7) {
				local36 = ((Class1_Sub1_Sub2_Sub7) local36).method1931(arg4, arg1, arg2, arg3, true);
			} else if (local36 instanceof Class1_Sub1_Sub2_Sub3) {
				local36 = ((Class1_Sub1_Sub2_Sub3) local36).method1012(arg4, arg1, arg2, arg3);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)Z")
	public boolean method253() {
		if (this.anIntArray61 == null) {
			return this.anInt413 != -1 || this.anIntArray60 != null;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray61.length; local27++) {
			if (this.anIntArray61[local27] != -1) {
				@Pc(45) Class1_Sub1_Sub3 local45 = Static108.method1807(this.anIntArray61[local27]);
				if (local45.anInt413 != -1 || local45.anIntArray60 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIIIII)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) long local24;
		if (this.anIntArray62 == null) {
			local24 = (this.anInt374 << 10) + arg0;
		} else {
			local24 = (this.anInt374 << 10) - (-(arg3 << 3) - arg0);
		}
		@Pc(41) Class1_Sub1_Sub2_Sub7 local41 = (Class1_Sub1_Sub2_Sub7) Static87.aClass19_72.method410(local24);
		if (local41 == null) {
			@Pc(53) Class1_Sub1_Sub2_Sub3 local53 = this.method263(arg3, arg0);
			if (local53 == null) {
				return null;
			}
			local41 = local53.method1002(this.anInt396 + 64, this.anInt414 * 5 + 768, -50, -10, -50);
			Static87.aClass19_72.method409(local41, local24);
		}
		if (this.aBoolean28) {
			local41 = local41.method1931(arg1, arg2, arg4, arg5, true);
		}
		return local41;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!id;II)V")
	private void method256(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		@Pc(41) int local41;
		if (arg1 == 1) {
			local14 = arg0.method1837();
			if (local14 > 0) {
				if (this.anIntArray63 == null || Static80.aBoolean117) {
					this.anIntArray63 = new int[local14];
					this.anIntArray62 = new int[local14];
					for (local41 = 0; local41 < local14; local41++) {
						this.anIntArray63[local41] = arg0.method1842();
						this.anIntArray62[local41] = arg0.method1837();
					}
				} else {
					arg0.anInt2574 += local14 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass64_279 = arg0.method1831();
		} else if (arg1 == 5) {
			local14 = arg0.method1837();
			if (local14 > 0) {
				if (this.anIntArray63 == null || Static80.aBoolean117) {
					this.anIntArray63 = new int[local14];
					this.anIntArray62 = null;
					for (local41 = 0; local41 < local14; local41++) {
						this.anIntArray63[local41] = arg0.method1842();
					}
				} else {
					arg0.anInt2574 += local14 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt420 = arg0.method1837();
		} else if (arg1 == 15) {
			this.anInt411 = arg0.method1837();
		} else if (arg1 == 17) {
			this.aBoolean25 = false;
		} else if (arg1 == 18) {
			this.aBoolean31 = false;
		} else if (arg1 == 19) {
			this.anInt401 = arg0.method1837();
		} else if (arg1 == 21) {
			this.aBoolean28 = true;
		} else if (arg1 == 22) {
			this.aBoolean26 = true;
		} else if (arg1 == 23) {
			this.aBoolean30 = true;
		} else if (arg1 == 24) {
			this.anInt382 = arg0.method1842();
			if (this.anInt382 == 65535) {
				this.anInt382 = -1;
			}
		} else if (arg1 == 28) {
			this.anInt405 = arg0.method1837();
		} else if (arg1 == 29) {
			this.anInt396 = arg0.method1824();
		} else if (arg1 == 39) {
			this.anInt414 = arg0.method1824() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass64Array5[arg1 - 30] = arg0.method1831();
			if (this.aClass64Array5[arg1 - 30].method1501(Static25.aClass64_1772)) {
				this.aClass64Array5[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local14 = arg0.method1837();
			this.aShortArray2 = new short[local14];
			this.aShortArray1 = new short[local14];
			for (local41 = 0; local41 < local14; local41++) {
				this.aShortArray2[local41] = (short) arg0.method1842();
				this.aShortArray1[local41] = (short) arg0.method1842();
			}
		} else if (arg1 == 60) {
			this.anInt416 = arg0.method1842();
		} else if (arg1 == 62) {
			this.aBoolean27 = true;
		} else if (arg1 == 64) {
			this.aBoolean24 = false;
		} else if (arg1 == 65) {
			this.anInt407 = arg0.method1842();
		} else if (arg1 == 66) {
			this.anInt419 = arg0.method1842();
		} else if (arg1 == 67) {
			this.anInt392 = arg0.method1842();
		} else if (arg1 == 68) {
			this.anInt398 = arg0.method1842();
		} else if (arg1 == 69) {
			this.anInt376 = arg0.method1837();
		} else if (arg1 == 70) {
			this.anInt409 = arg0.method1861();
		} else if (arg1 == 71) {
			this.anInt404 = arg0.method1861();
		} else if (arg1 == 72) {
			this.anInt380 = arg0.method1861();
		} else if (arg1 == 73) {
			this.aBoolean29 = true;
		} else if (arg1 == 74) {
			this.aBoolean23 = true;
		} else if (arg1 == 75) {
			this.anInt395 = arg0.method1837();
		} else if (arg1 == 77) {
			this.anInt412 = arg0.method1842();
			if (this.anInt412 == 65535) {
				this.anInt412 = -1;
			}
			this.anInt379 = arg0.method1842();
			if (this.anInt379 == 65535) {
				this.anInt379 = -1;
			}
			local14 = arg0.method1837();
			this.anIntArray61 = new int[local14 + 1];
			for (local41 = 0; local41 <= local14; local41++) {
				this.anIntArray61[local41] = arg0.method1842();
				if (this.anIntArray61[local41] == 65535) {
					this.anIntArray61[local41] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt413 = arg0.method1842();
			this.anInt408 = arg0.method1837();
		} else if (arg1 == 79) {
			this.anInt377 = arg0.method1842();
			this.anInt383 = arg0.method1842();
			this.anInt408 = arg0.method1837();
			local14 = arg0.method1837();
			this.anIntArray60 = new int[local14];
			for (local41 = 0; local41 < local14; local41++) {
				this.anIntArray60[local41] = arg0.method1842();
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILclient!e;IIIII)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) long local13;
		if (this.anIntArray62 == null) {
			local13 = (this.anInt374 << 10) + arg6;
		} else {
			local13 = (arg1 << 3) + (this.anInt374 << 10) + arg6;
		}
		@Pc(37) Class1_Sub1_Sub2_Sub7 local37 = (Class1_Sub1_Sub2_Sub7) Static87.aClass19_72.method410(local13);
		if (local37 == null) {
			@Pc(45) Class1_Sub1_Sub2_Sub3 local45 = this.method263(arg1, arg6);
			if (local45 == null) {
				return null;
			}
			local37 = local45.method1002(this.anInt396 + 64, this.anInt414 * 5 + 768, -50, -10, -50);
			Static87.aClass19_72.method409(local37, local13);
		}
		if (arg3 == null && !this.aBoolean28) {
			return local37;
		}
		if (arg3 == null) {
			local37 = local37.method1923(true);
		} else {
			local37 = arg3.method455(arg2, arg6, local37);
		}
		if (this.aBoolean28) {
			local37.method1931(arg0, arg4, arg5, arg7, false);
		}
		return local37;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public void method262() {
		if (this.anInt401 == -1) {
			this.anInt401 = 0;
			if (this.anIntArray63 != null && (this.anIntArray62 == null || this.anIntArray62[0] == 10)) {
				this.anInt401 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < 5; local33++) {
				if (this.aClass64Array5[local33] != null) {
					this.anInt401 = 1;
				}
			}
		}
		if (this.anInt395 == -1) {
			this.anInt395 = this.aBoolean25 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)Lclient!kc;")
	private Class1_Sub1_Sub2_Sub3 method263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub1_Sub2_Sub3 local7 = null;
		@Pc(32) boolean local32;
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (this.anIntArray62 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray63 == null) {
				return null;
			}
			local32 = this.aBoolean27 ^ arg1 > 3;
			local36 = this.anIntArray63.length;
			for (local38 = 0; local38 < local36; local38++) {
				@Pc(44) int local44 = this.anIntArray63[local38];
				if (local32) {
					local44 += 65536;
				}
				local7 = (Class1_Sub1_Sub2_Sub3) Static26.aClass19_27.method410((long) local44);
				if (local7 == null) {
					local7 = Static59.method1010(Static85.aClass41_73, local44 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local32) {
						local7.method1006();
					}
					Static26.aClass19_27.method409(local7, (long) local44);
				}
				if (local36 > 1) {
					Static98.aClass1_Sub1_Sub2_Sub3Array1[local38] = local7;
				}
			}
			if (local36 > 1) {
				local7 = new Class1_Sub1_Sub2_Sub3(Static98.aClass1_Sub1_Sub2_Sub3Array1, local36);
			}
		} else {
			@Pc(109) int local109 = -1;
			for (local36 = 0; local36 < this.anIntArray62.length; local36++) {
				if (arg0 == this.anIntArray62[local36]) {
					local109 = local36;
					break;
				}
			}
			if (local109 == -1) {
				return null;
			}
			local38 = this.anIntArray63[local109];
			@Pc(155) boolean local155 = this.aBoolean27 ^ arg1 > 3;
			if (local155) {
				local38 += 65536;
			}
			local7 = (Class1_Sub1_Sub2_Sub3) Static26.aClass19_27.method410((long) local38);
			if (local7 == null) {
				local7 = Static59.method1010(Static85.aClass41_73, local38 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local155) {
					local7.method1006();
				}
				Static26.aClass19_27.method409(local7, (long) local38);
			}
		}
		@Pc(205) boolean local205;
		if (this.anInt409 == 0 && this.anInt404 == 0 && this.anInt380 == 0) {
			local205 = false;
		} else {
			local205 = true;
		}
		if (this.anInt407 == 128 && this.anInt419 == 128 && this.anInt392 == 128) {
			local32 = false;
		} else {
			local32 = true;
		}
		@Pc(260) Class1_Sub1_Sub2_Sub3 local260 = new Class1_Sub1_Sub2_Sub3(local7, arg1 == 0 && !local32 && !local205, this.aShortArray2 == null, true);
		@Pc(264) int local264 = arg1 & 0x3;
		if (local264 == 1) {
			local260.method997();
		} else if (local264 == 2) {
			local260.method1004();
		} else if (local264 == 3) {
			local260.method1014();
		}
		if (this.aShortArray2 != null) {
			for (@Pc(292) int local292 = 0; local292 < this.aShortArray2.length; local292++) {
				local260.method1013(this.aShortArray2[local292], this.aShortArray1[local292]);
			}
		}
		if (local32) {
			local260.method1008(this.anInt407, this.anInt419, this.anInt392);
		}
		if (local205) {
			local260.method1009(this.anInt409, this.anInt404, this.anInt380);
		}
		return local260;
	}
}
