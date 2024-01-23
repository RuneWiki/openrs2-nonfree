import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class112 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public int anInt3850;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "[Z")
	public boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public int anInt3855 = -1;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public int anInt3858 = 99;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	public int anInt3857 = 2;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	public int anInt3853 = -1;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "Z")
	public boolean aBoolean260 = false;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public int anInt3856 = -1;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
	public int anInt3859 = -1;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
	public int anInt3860 = -1;

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
	public int anInt3870 = 5;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public void method3160() {
		if (this.anInt3855 == -1) {
			if (this.aBooleanArray14 == null) {
				this.anInt3855 = 0;
			} else {
				this.anInt3855 = 2;
			}
		}
		if (this.anInt3859 != -1) {
			return;
		}
		if (this.aBooleanArray14 == null) {
			this.anInt3859 = 0;
		} else {
			this.anInt3859 = 2;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!hb;III)Lclient!hb;")
	public Class15_Sub5 method3161(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray378[arg2];
		@Pc(13) int local13 = this.anIntArray377[arg2];
		@Pc(19) Class2_Sub8_Sub6 local19 = Static152.method2798(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg1.method2352(true, true, true);
		}
		@Pc(34) Class2_Sub8_Sub6 local34 = null;
		@Pc(36) Class2_Sub8_Sub6 local36 = null;
		if ((this.aBoolean259 || Static104.aBoolean160) && arg3 != -1 && arg3 < this.anIntArray378.length) {
			@Pc(57) int local57 = this.anIntArray378[arg3];
			local36 = Static152.method2798(local57 >> 16);
			arg3 = local57 & 0xFFFF;
		}
		@Pc(69) Class2_Sub8_Sub6 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray376 != null) {
			if (arg2 < this.anIntArray376.length) {
				local71 = this.anIntArray376[arg2];
				if (local71 != 65535) {
					local34 = Static152.method2798(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean259 || Static104.aBoolean160) && arg3 != -1 && this.anIntArray376.length > arg3) {
				local73 = this.anIntArray376[arg3];
				if (local73 != 65535) {
					local69 = Static152.method2798(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		@Pc(151) boolean local151 = !local19.method1160(local23);
		@Pc(160) boolean local160 = !local19.method1163(local23);
		if (local34 != null) {
			local151 &= !local34.method1160(local71);
			local160 &= !local34.method1163(local71);
		}
		if (local36 != null) {
			local151 &= !local36.method1160(arg3);
			local160 &= !local36.method1163(arg3);
		}
		if (local69 != null) {
			local151 &= !local69.method1160(local73);
			local160 &= !local69.method1163(local73);
		}
		@Pc(247) Class15_Sub5 local247 = arg1.method2352(local151, local160, !this.aBoolean260);
		local247.method2339(local19, local23, local36, arg3, arg0 - 1, local13, this.aBoolean260);
		if (local34 != null) {
			local247.method2339(local34, local71, local69, local73, arg0 - 1, local13, this.aBoolean260);
		}
		return local247;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILclient!hb;I)Lclient!hb;")
	public Class15_Sub5 method3162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15_Sub5 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray377[arg1];
		@Pc(13) int local13 = this.anIntArray378[arg1];
		@Pc(19) Class2_Sub8_Sub6 local19 = Static152.method2798(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method2358(true, true, true);
		}
		@Pc(34) Class2_Sub8_Sub6 local34 = null;
		if ((this.aBoolean259 || Static104.aBoolean160) && arg0 != -1 && this.anIntArray378.length > arg0) {
			@Pc(57) int local57 = this.anIntArray378[arg0];
			local34 = Static152.method2798(local57 >> 16);
			arg0 = local57 & 0xFFFF;
		}
		@Pc(95) Class15_Sub5 local95;
		if (local34 == null) {
			local95 = arg2.method2358(!local19.method1160(local23), !local19.method1163(local23), !this.aBoolean260);
		} else {
			local95 = arg2.method2358(!local19.method1160(local23) & !local34.method1160(arg0), !local19.method1163(local23) & !local34.method1163(arg0), !this.aBoolean260);
		}
		local95.method2339(local19, local23, local34, arg0, arg3 - 1, local8, this.aBoolean260);
		return local95;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!oe;)V")
	public void method3164(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2146();
			if (local15 == 0) {
				return;
			}
			this.method3166(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!oe;I)V")
	private void method3166(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local41 = arg0.method2130();
			this.anIntArray377 = new int[local41];
			for (local43 = 0; local43 < local41; local43++) {
				this.anIntArray377[local43] = arg0.method2130();
			}
			this.anIntArray378 = new int[local41];
			for (local43 = 0; local43 < local41; local43++) {
				this.anIntArray378[local43] = arg0.method2130();
			}
			for (local43 = 0; local43 < local41; local43++) {
				this.anIntArray378[local43] = (arg0.method2130() << 16) + this.anIntArray378[local43];
			}
		} else if (arg1 == 2) {
			this.anInt3856 = arg0.method2130();
		} else if (arg1 == 3) {
			this.aBooleanArray14 = new boolean[256];
			local41 = arg0.method2146();
			for (local43 = 0; local43 < local41; local43++) {
				this.aBooleanArray14[arg0.method2146()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean262 = true;
		} else if (arg1 == 5) {
			this.anInt3870 = arg0.method2146();
		} else if (arg1 == 6) {
			this.anInt3853 = arg0.method2130();
		} else if (arg1 == 7) {
			this.anInt3860 = arg0.method2130();
		} else if (arg1 == 8) {
			this.anInt3858 = arg0.method2146();
		} else if (arg1 == 9) {
			this.anInt3855 = arg0.method2146();
		} else if (arg1 == 10) {
			this.anInt3859 = arg0.method2146();
		} else if (arg1 == 11) {
			this.anInt3857 = arg0.method2146();
		} else if (arg1 == 12) {
			local41 = arg0.method2146();
			this.anIntArray376 = new int[local41];
			for (local43 = 0; local43 < local41; local43++) {
				this.anIntArray376[local43] = arg0.method2130();
			}
			for (local43 = 0; local43 < local41; local43++) {
				this.anIntArray376[local43] = (arg0.method2130() << 16) + this.anIntArray376[local43];
			}
		} else if (arg1 == 13) {
			local41 = arg0.method2130();
			this.anIntArrayArray24 = new int[local41][];
			for (local43 = 0; local43 < local41; local43++) {
				@Pc(231) int local231 = arg0.method2146();
				if (local231 > 0) {
					this.anIntArrayArray24[local43] = new int[local231];
					this.anIntArrayArray24[local43][0] = arg0.method2166();
					for (@Pc(254) int local254 = 1; local254 < local231; local254++) {
						this.anIntArrayArray24[local43][local254] = arg0.method2130();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean260 = true;
		} else if (arg1 == 15) {
			this.aBoolean259 = true;
		} else if (arg1 == 16) {
			this.aBoolean261 = true;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!hb;IIB)Lclient!hb;")
	public Class15_Sub5 method3167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = this.anIntArray377[arg0];
		@Pc(15) int local15 = this.anIntArray378[arg0];
		@Pc(21) Class2_Sub8_Sub6 local21 = Static152.method2798(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg2.method2352(true, true, true);
		}
		@Pc(37) int local37 = arg1 & 0x3;
		@Pc(39) Class2_Sub8_Sub6 local39 = null;
		if ((this.aBoolean259 || Static104.aBoolean160) && arg4 != -1 && arg4 < this.anIntArray378.length) {
			@Pc(61) int local61 = this.anIntArray378[arg4];
			local39 = Static152.method2798(local61 >> 16);
			arg4 = local61 & 0xFFFF;
		}
		@Pc(99) Class15_Sub5 local99;
		if (local39 == null) {
			local99 = arg2.method2352(!local21.method1160(local25), !local21.method1163(local25), !this.aBoolean260);
		} else {
			local99 = arg2.method2352(!local21.method1160(local25) & !local39.method1160(arg4), !local21.method1163(local25) & !local39.method1163(arg4), !this.aBoolean260);
		}
		if (this.aBoolean260 && Static116.aBoolean184) {
			if (local37 == 1) {
				((Class15_Sub5_Sub2) local99).method2393();
			} else if (local37 == 2) {
				((Class15_Sub5_Sub2) local99).method2361();
			} else if (local37 == 3) {
				((Class15_Sub5_Sub2) local99).method2365();
			}
		} else if (local37 == 1) {
			local99.method2357();
		} else if (local37 == 2) {
			local99.method2344();
		} else if (local37 == 3) {
			local99.method2346();
		}
		local99.method2339(local21, local25, local39, arg4, arg3 - 1, local6, this.aBoolean260);
		if (this.aBoolean260 && Static116.aBoolean184) {
			if (local37 == 1) {
				((Class15_Sub5_Sub2) local99).method2365();
			} else if (local37 == 2) {
				((Class15_Sub5_Sub2) local99).method2361();
			} else if (local37 == 3) {
				((Class15_Sub5_Sub2) local99).method2393();
			}
		} else if (local37 == 1) {
			local99.method2346();
		} else if (local37 == 2) {
			local99.method2344();
		} else if (local37 == 3) {
			local99.method2357();
		}
		return local99;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!hb;IIIIB)Lclient!hb;")
	public Class15_Sub5 method3168(@OriginalArg(0) Class15_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = this.anIntArray377[arg1];
		@Pc(15) int local15 = this.anIntArray378[arg1];
		@Pc(21) Class2_Sub8_Sub6 local21 = Static152.method2798(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method2350(true, true, true);
		}
		@Pc(37) int local37 = arg4 & 0x3;
		@Pc(44) Class2_Sub8_Sub6 local44 = null;
		if ((this.aBoolean259 || Static104.aBoolean160) && arg2 != -1 && this.anIntArray378.length > arg2) {
			@Pc(68) int local68 = this.anIntArray378[arg2];
			local44 = Static152.method2798(local68 >> 16);
			arg2 = local68 & 0xFFFF;
		}
		@Pc(105) Class15_Sub5 local105;
		if (local44 == null) {
			local105 = arg0.method2350(!local21.method1160(local25), !local21.method1163(local25), !this.aBoolean260);
		} else {
			local105 = arg0.method2350(!local21.method1160(local25) & !local44.method1160(arg2), !local21.method1163(local25) & !local44.method1163(arg2), !this.aBoolean260);
		}
		if (Static116.aBoolean184 && this.aBoolean260) {
			if (local37 == 1) {
				((Class15_Sub5_Sub2) local105).method2393();
			} else if (local37 == 2) {
				((Class15_Sub5_Sub2) local105).method2361();
			} else if (local37 == 3) {
				((Class15_Sub5_Sub2) local105).method2365();
			}
		} else if (local37 == 1) {
			local105.method2357();
		} else if (local37 == 2) {
			local105.method2344();
		} else if (local37 == 3) {
			local105.method2346();
		}
		local105.method2339(local21, local25, local44, arg2, arg3 - 1, local10, this.aBoolean260);
		if (Static116.aBoolean184 && this.aBoolean260) {
			if (local37 == 1) {
				((Class15_Sub5_Sub2) local105).method2365();
			} else if (local37 == 2) {
				((Class15_Sub5_Sub2) local105).method2361();
			} else if (local37 == 3) {
				((Class15_Sub5_Sub2) local105).method2393();
			}
		} else if (local37 == 1) {
			local105.method2346();
		} else if (local37 == 2) {
			local105.method2344();
		} else if (local37 == 3) {
			local105.method2357();
		}
		return local105;
	}
}
