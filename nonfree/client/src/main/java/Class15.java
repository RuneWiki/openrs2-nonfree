import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class15 {

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public int anInt420;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "[Z")
	public boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public int anInt413 = 5;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	public int anInt417 = -1;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public int anInt422 = 99;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	public int anInt428 = 2;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public int anInt416 = -1;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
	public int anInt430 = -1;

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
	public int anInt432 = -1;

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
	public int anInt433 = -1;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZIIILclient!r;)Lclient!r;")
	public Class36_Sub2 method354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray28[arg2];
		@Pc(13) int local13 = this.anIntArray26[arg2];
		@Pc(19) Class2_Sub3_Sub13 local19 = Static67.method4883(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method3856(true, true, true);
		}
		@Pc(33) Class2_Sub3_Sub13 local33 = null;
		if ((this.aBoolean31 || Static176.aBoolean324) && arg1 != -1 && this.anIntArray26.length > arg1) {
			@Pc(51) int local51 = this.anIntArray26[arg1];
			local33 = Static67.method4883(local51 >> 16);
			arg1 = local51 & 0xFFFF;
		}
		@Pc(88) Class36_Sub2 local88;
		if (local33 == null) {
			local88 = arg3.method3856(!local19.method2470(local23), !local19.method2467(local23), !this.aBoolean32);
		} else {
			local88 = arg3.method3856(!local19.method2470(local23) & !local33.method2470(arg1), !local19.method2467(local23) & !local33.method2467(arg1), !this.aBoolean32);
		}
		local88.method3849(local19, local23, local33, arg1, arg0 - 1, local8, this.aBoolean32);
		return local88;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(Z)V")
	public void method357() {
		if (this.anInt432 == -1) {
			if (this.aBooleanArray3 == null) {
				this.anInt432 = 0;
			} else {
				this.anInt432 = 2;
			}
		}
		if (this.anInt417 != -1) {
			return;
		}
		if (this.aBooleanArray3 == null) {
			this.anInt417 = 0;
		} else {
			this.anInt417 = 2;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!r;IIIZ)Lclient!r;")
	public Class36_Sub2 method360(@OriginalArg(0) int arg0, @OriginalArg(1) Class36_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = this.anIntArray28[arg4];
		@Pc(15) int local15 = this.anIntArray26[arg4];
		@Pc(21) Class2_Sub3_Sub13 local21 = Static67.method4883(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg1.method3851(true, true, true);
		}
		@Pc(37) Class2_Sub3_Sub13 local37 = null;
		@Pc(41) int local41 = arg0 & 0x3;
		if ((this.aBoolean31 || Static176.aBoolean324) && arg2 != -1 && this.anIntArray26.length > arg2) {
			@Pc(64) int local64 = this.anIntArray26[arg2];
			local37 = Static67.method4883(local64 >> 16);
			arg2 = local64 & 0xFFFF;
		}
		@Pc(101) Class36_Sub2 local101;
		if (local37 == null) {
			local101 = arg1.method3851(!local21.method2470(local25), !local21.method2467(local25), !this.aBoolean32);
		} else {
			local101 = arg1.method3851(!local21.method2470(local25) & !local37.method2470(arg2), !local21.method2467(local25) & !local37.method2467(arg2), !this.aBoolean32);
		}
		if (this.aBoolean32 && Static60.aBoolean106) {
			if (local41 == 1) {
				((Class36_Sub2_Sub1) local101).method940();
			} else if (local41 == 2) {
				((Class36_Sub2_Sub1) local101).method970();
			} else if (local41 == 3) {
				((Class36_Sub2_Sub1) local101).method943();
			}
		} else if (local41 == 1) {
			local101.method3837();
		} else if (local41 == 2) {
			local101.method3839();
		} else if (local41 == 3) {
			local101.method3840();
		}
		local101.method3849(local21, local25, local37, arg2, arg3 - 1, local10, this.aBoolean32);
		if (this.aBoolean32 && Static60.aBoolean106) {
			if (local41 == 1) {
				((Class36_Sub2_Sub1) local101).method943();
			} else if (local41 == 2) {
				((Class36_Sub2_Sub1) local101).method970();
			} else if (local41 == 3) {
				((Class36_Sub2_Sub1) local101).method940();
			}
		} else if (local41 == 1) {
			local101.method3840();
		} else if (local41 == 2) {
			local101.method3839();
		} else if (local41 == 3) {
			local101.method3837();
		}
		return local101;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!r;III)Lclient!r;")
	public Class36_Sub2 method365(@OriginalArg(0) int arg0, @OriginalArg(1) Class36_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray28[arg2];
		@Pc(13) int local13 = this.anIntArray26[arg2];
		@Pc(19) Class2_Sub3_Sub13 local19 = Static67.method4883(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method3851(true, true, true);
		}
		@Pc(34) Class2_Sub3_Sub13 local34 = null;
		if ((this.aBoolean31 || Static176.aBoolean324) && arg0 != -1 && this.anIntArray26.length > arg0) {
			@Pc(52) int local52 = this.anIntArray26[arg0];
			local34 = Static67.method4883(local52 >> 16);
			arg0 = local52 & 0xFFFF;
		}
		@Pc(64) Class2_Sub3_Sub13 local64 = null;
		@Pc(66) int local66 = 0;
		@Pc(68) Class2_Sub3_Sub13 local68 = null;
		@Pc(70) int local70 = 0;
		if (this.anIntArray27 != null) {
			if (this.anIntArray27.length > arg2) {
				local66 = this.anIntArray27[arg2];
				if (local66 != 65535) {
					local64 = Static67.method4883(local66 >> 16);
					local66 &= 0xFFFF;
				}
			}
			if ((this.aBoolean31 || Static176.aBoolean324) && arg0 != -1 && this.anIntArray27.length > arg0) {
				local70 = this.anIntArray27[arg0];
				if (local70 != 65535) {
					local68 = Static67.method4883(local70 >> 16);
					local70 &= 0xFFFF;
				}
			}
		}
		@Pc(144) boolean local144 = !local19.method2470(local23);
		@Pc(153) boolean local153 = !local19.method2467(local23);
		if (local64 != null) {
			local144 &= !local64.method2470(local66);
			local153 &= !local64.method2467(local66);
		}
		if (local34 != null) {
			local144 &= !local34.method2470(arg0);
			local153 &= !local34.method2467(arg0);
		}
		if (local68 != null) {
			local144 &= !local68.method2470(local70);
			local153 &= !local68.method2467(local70);
		}
		@Pc(243) Class36_Sub2 local243 = arg1.method3851(local144, local153, !this.aBoolean32);
		local243.method3849(local19, local23, local34, arg0, arg3 - 1, local8, this.aBoolean32);
		if (local64 != null) {
			local243.method3849(local64, local66, local68, local70, arg3 - 1, local8, this.aBoolean32);
		}
		return local243;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method366(@OriginalArg(0) Class2_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4261();
			if (local13 == 0) {
				return;
			}
			this.method368(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILclient!r;II)Lclient!r;")
	public Class36_Sub2 method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36_Sub2 arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = this.anIntArray28[arg1];
		@Pc(15) int local15 = this.anIntArray26[arg1];
		@Pc(21) Class2_Sub3_Sub13 local21 = Static67.method4883(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg3.method3854(true, true, true);
		}
		@Pc(37) int local37 = arg0 & 0x3;
		@Pc(39) Class2_Sub3_Sub13 local39 = null;
		if ((this.aBoolean31 || Static176.aBoolean324) && arg2 != -1 && this.anIntArray26.length > arg2) {
			@Pc(62) int local62 = this.anIntArray26[arg2];
			local39 = Static67.method4883(local62 >> 16);
			arg2 = local62 & 0xFFFF;
		}
		@Pc(120) Class36_Sub2 local120;
		if (local39 == null) {
			local120 = arg3.method3854(!local21.method2470(local25), !local21.method2467(local25), !this.aBoolean32);
		} else {
			local120 = arg3.method3854(!local21.method2470(local25) & !local39.method2470(arg2), !local21.method2467(local25) & !local39.method2467(arg2), !this.aBoolean32);
		}
		if (Static60.aBoolean106 && this.aBoolean32) {
			if (local37 == 1) {
				((Class36_Sub2_Sub1) local120).method940();
			} else if (local37 == 2) {
				((Class36_Sub2_Sub1) local120).method970();
			} else if (local37 == 3) {
				((Class36_Sub2_Sub1) local120).method943();
			}
		} else if (local37 == 1) {
			local120.method3837();
		} else if (local37 == 2) {
			local120.method3839();
		} else if (local37 == 3) {
			local120.method3840();
		}
		local120.method3849(local21, local25, local39, arg2, arg4 - 1, local10, this.aBoolean32);
		if (Static60.aBoolean106 && this.aBoolean32) {
			if (local37 == 1) {
				((Class36_Sub2_Sub1) local120).method943();
			} else if (local37 == 2) {
				((Class36_Sub2_Sub1) local120).method970();
			} else if (local37 == 3) {
				((Class36_Sub2_Sub1) local120).method940();
			}
		} else if (local37 == 1) {
			local120.method3840();
		} else if (local37 == 2) {
			local120.method3839();
		} else if (local37 == 3) {
			local120.method3837();
		}
		return local120;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!wm;I)V")
	private void method368(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1) {
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (arg0 == 1) {
			local106 = arg1.method4242();
			this.anIntArray28 = new int[local106];
			for (local112 = 0; local112 < local106; local112++) {
				this.anIntArray28[local112] = arg1.method4242();
			}
			this.anIntArray26 = new int[local106];
			for (local112 = 0; local112 < local106; local112++) {
				this.anIntArray26[local112] = arg1.method4242();
			}
			for (local112 = 0; local112 < local106; local112++) {
				this.anIntArray26[local112] = (arg1.method4242() << 16) + this.anIntArray26[local112];
			}
		} else if (arg0 == 2) {
			this.anInt430 = arg1.method4242();
		} else if (arg0 == 3) {
			this.aBooleanArray3 = new boolean[256];
			local106 = arg1.method4261();
			for (local112 = 0; local112 < local106; local112++) {
				this.aBooleanArray3[arg1.method4261()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean30 = true;
		} else if (arg0 == 5) {
			this.anInt413 = arg1.method4261();
		} else if (arg0 == 6) {
			this.anInt416 = arg1.method4242();
		} else if (arg0 == 7) {
			this.anInt433 = arg1.method4242();
		} else if (arg0 == 8) {
			this.anInt422 = arg1.method4261();
		} else if (arg0 == 9) {
			this.anInt432 = arg1.method4261();
		} else if (arg0 == 10) {
			this.anInt417 = arg1.method4261();
		} else if (arg0 == 11) {
			this.anInt428 = arg1.method4261();
		} else if (arg0 == 12) {
			local106 = arg1.method4261();
			this.anIntArray27 = new int[local106];
			for (local112 = 0; local112 < local106; local112++) {
				this.anIntArray27[local112] = arg1.method4242();
			}
			for (local112 = 0; local112 < local106; local112++) {
				this.anIntArray27[local112] += arg1.method4242() << 16;
			}
		} else if (arg0 == 13) {
			local106 = arg1.method4242();
			this.anIntArrayArray2 = new int[local106][];
			for (local112 = 0; local112 < local106; local112++) {
				@Pc(123) int local123 = arg1.method4261();
				if (local123 > 0) {
					this.anIntArrayArray2[local112] = new int[local123];
					this.anIntArrayArray2[local112][0] = arg1.method4245();
					for (@Pc(146) int local146 = 1; local146 < local123; local146++) {
						this.anIntArrayArray2[local112][local146] = arg1.method4242();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean32 = true;
		} else if (arg0 == 15) {
			this.aBoolean31 = true;
		} else if (arg0 == 16) {
			this.aBoolean33 = true;
		}
	}
}
