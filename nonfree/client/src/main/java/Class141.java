import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class141 {

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
	public int anInt4357;

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "[Z")
	public boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public int anInt4349 = 2;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	public int anInt4352 = -1;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
	public int anInt4351 = -1;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
	public boolean aBoolean289 = false;

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	public int anInt4361 = -1;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public int anInt4350 = 99;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "Z")
	public boolean aBoolean291 = false;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "Z")
	public boolean aBoolean290 = false;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	public int anInt4367 = -1;

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	public int anInt4358 = 5;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "Z")
	public boolean aBoolean292 = false;

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
	public int anInt4366 = -1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!uc;BIII)Lclient!uc;")
	public Class12_Sub2 method3519(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray392[arg2];
		@Pc(9) int local9 = this.anIntArray390[arg2];
		@Pc(33) Class4_Sub2_Sub19 local33 = Static57.method928(local9 >> 16);
		@Pc(37) int local37 = local9 & 0xFFFF;
		if (local33 == null) {
			return arg0.method3156(true, true, true);
		}
		@Pc(48) Class4_Sub2_Sub19 local48 = null;
		if ((this.aBoolean290 || Static112.aBoolean164) && arg3 != -1 && arg3 < this.anIntArray390.length) {
			@Pc(71) int local71 = this.anIntArray390[arg3];
			local48 = Static57.method928(local71 >> 16);
			arg3 = local71 & 0xFFFF;
		}
		@Pc(110) Class12_Sub2 local110;
		if (local48 == null) {
			local110 = arg0.method3156(!local33.method3716(local37), !local33.method3714(local37), !this.aBoolean292);
		} else {
			local110 = arg0.method3156(!local33.method3716(local37) & !local48.method3716(arg3), !local33.method3714(local37) & !local48.method3714(arg3), !this.aBoolean292);
		}
		local110.method3166(local33, local37, local48, arg3, arg1 - 1, local4, this.aBoolean292);
		return local110;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!p;)V")
	public void method3520(@OriginalArg(1) Class4_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1874();
			if (local5 == 0) {
				return;
			}
			this.method3524(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!uc;IIIZ)Lclient!uc;")
	public Class12_Sub2 method3521(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.anIntArray390[arg1];
		@Pc(13) int local13 = this.anIntArray392[arg1];
		@Pc(19) Class4_Sub2_Sub19 local19 = Static57.method928(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg0.method3154(true, true, true);
		}
		@Pc(35) Class4_Sub2_Sub19 local35 = null;
		@Pc(37) Class4_Sub2_Sub19 local37 = null;
		@Pc(39) Class4_Sub2_Sub19 local39 = null;
		if ((this.aBoolean290 || Static112.aBoolean164) && arg3 != -1 && this.anIntArray390.length > arg3) {
			@Pc(63) int local63 = this.anIntArray390[arg3];
			local37 = Static57.method928(local63 >> 16);
			arg3 = local63 & 0xFFFF;
		}
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray391 != null) {
			if (arg1 < this.anIntArray391.length) {
				local77 = this.anIntArray391[arg1];
				if (local77 != 65535) {
					local35 = Static57.method928(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean290 || Static112.aBoolean164) && arg3 != -1 && arg3 < this.anIntArray391.length) {
				local75 = this.anIntArray391[arg3];
				if (local75 != 65535) {
					local39 = Static57.method928(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
		}
		@Pc(154) boolean local154 = !local19.method3716(local23);
		@Pc(163) boolean local163 = !local19.method3714(local23);
		if (local35 != null) {
			local154 &= !local35.method3716(local77);
			local163 &= !local35.method3714(local77);
		}
		if (local37 != null) {
			local154 &= !local37.method3716(arg3);
			local163 &= !local37.method3714(arg3);
		}
		if (local39 != null) {
			local154 &= !local39.method3716(local75);
			local163 &= !local39.method3714(local75);
		}
		@Pc(248) Class12_Sub2 local248 = arg0.method3154(local154, local163, !this.aBoolean292);
		local248.method3166(local19, local23, local37, arg3, arg2 - 1, local13, this.aBoolean292);
		if (local35 != null) {
			local248.method3166(local35, local77, local39, local75, arg2 - 1, local13, this.aBoolean292);
		}
		return local248;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIILclient!uc;I)Lclient!uc;")
	public Class12_Sub2 method3523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class12_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = this.anIntArray392[arg1];
		@Pc(11) int local11 = this.anIntArray390[arg1];
		@Pc(17) Class4_Sub2_Sub19 local17 = Static57.method928(local11 >> 16);
		@Pc(21) int local21 = local11 & 0xFFFF;
		if (local17 == null) {
			return arg3.method3154(true, true, true);
		}
		@Pc(37) Class4_Sub2_Sub19 local37 = null;
		if ((this.aBoolean290 || Static112.aBoolean164) && arg4 != -1 && this.anIntArray390.length > arg4) {
			@Pc(59) int local59 = this.anIntArray390[arg4];
			local37 = Static57.method928(local59 >> 16);
			arg4 = local59 & 0xFFFF;
		}
		@Pc(81) int local81 = arg0 & 0x3;
		@Pc(127) Class12_Sub2 local127;
		if (local37 == null) {
			local127 = arg3.method3154(!local17.method3716(local21), !local17.method3714(local21), !this.aBoolean292);
		} else {
			local127 = arg3.method3154(!local17.method3716(local21) & !local37.method3716(arg4), !local17.method3714(local21) & !local37.method3714(arg4), !this.aBoolean292);
		}
		if (this.aBoolean292 && Static178.aBoolean216) {
			if (local81 == 1) {
				((Class12_Sub2_Sub2) local127).method3179();
			} else if (local81 == 2) {
				((Class12_Sub2_Sub2) local127).method3176();
			} else if (local81 == 3) {
				((Class12_Sub2_Sub2) local127).method3169();
			}
		} else if (local81 == 1) {
			local127.method3140();
		} else if (local81 == 2) {
			local127.method3164();
		} else if (local81 == 3) {
			local127.method3141();
		}
		local127.method3166(local17, local21, local37, arg4, arg2 - 1, local6, this.aBoolean292);
		if (this.aBoolean292 && Static178.aBoolean216) {
			if (local81 == 1) {
				((Class12_Sub2_Sub2) local127).method3169();
			} else if (local81 == 2) {
				((Class12_Sub2_Sub2) local127).method3176();
			} else if (local81 == 3) {
				((Class12_Sub2_Sub2) local127).method3179();
			}
		} else if (local81 == 1) {
			local127.method3141();
		} else if (local81 == 2) {
			local127.method3164();
		} else if (local81 == 3) {
			local127.method3140();
		}
		return local127;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!p;)V")
	private void method3524(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub17 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		if (arg0 == 1) {
			local10 = arg1.method1837();
			this.anIntArray392 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray392[local16] = arg1.method1837();
			}
			this.anIntArray390 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray390[local16] = arg1.method1837();
			}
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray390[local16] = (arg1.method1837() << 16) + this.anIntArray390[local16];
			}
		} else if (arg0 == 2) {
			this.anInt4367 = arg1.method1837();
		} else if (arg0 == 3) {
			this.aBooleanArray19 = new boolean[256];
			local10 = arg1.method1874();
			for (local16 = 0; local16 < local10; local16++) {
				this.aBooleanArray19[arg1.method1874()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean289 = true;
		} else if (arg0 == 5) {
			this.anInt4358 = arg1.method1874();
		} else if (arg0 == 6) {
			this.anInt4352 = arg1.method1837();
		} else if (arg0 == 7) {
			this.anInt4351 = arg1.method1837();
		} else if (arg0 == 8) {
			this.anInt4350 = arg1.method1874();
		} else if (arg0 == 9) {
			this.anInt4366 = arg1.method1874();
		} else if (arg0 == 10) {
			this.anInt4361 = arg1.method1874();
		} else if (arg0 == 11) {
			this.anInt4349 = arg1.method1874();
		} else if (arg0 == 12) {
			local10 = arg1.method1874();
			this.anIntArray391 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray391[local16] = arg1.method1837();
			}
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray391[local16] += arg1.method1837() << 16;
			}
		} else if (arg0 == 13) {
			local10 = arg1.method1837();
			this.anIntArrayArray34 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				@Pc(319) int local319 = arg1.method1874();
				if (local319 > 0) {
					this.anIntArrayArray34[local16] = new int[local319];
					this.anIntArrayArray34[local16][0] = arg1.method1835();
					for (@Pc(342) int local342 = 1; local342 < local319; local342++) {
						this.anIntArrayArray34[local16][local342] = arg1.method1837();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean292 = true;
		} else if (arg0 == 15) {
			this.aBoolean290 = true;
		} else if (arg0 == 16) {
			this.aBoolean291 = true;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
	public void method3525() {
		if (this.anInt4366 == -1) {
			if (this.aBooleanArray19 == null) {
				this.anInt4366 = 0;
			} else {
				this.anInt4366 = 2;
			}
		}
		if (this.anInt4361 != -1) {
			return;
		}
		if (this.aBooleanArray19 == null) {
			this.anInt4361 = 0;
		} else {
			this.anInt4361 = 2;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!uc;IIII)Lclient!uc;")
	public Class12_Sub2 method3526(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = this.anIntArray392[arg4];
		@Pc(19) int local19 = this.anIntArray390[arg4];
		@Pc(29) Class4_Sub2_Sub19 local29 = Static57.method928(local19 >> 16);
		@Pc(33) int local33 = local19 & 0xFFFF;
		if (local29 == null) {
			return arg1.method3167(true, true, true);
		}
		@Pc(47) int local47 = arg3 & 0x3;
		@Pc(49) Class4_Sub2_Sub19 local49 = null;
		if ((this.aBoolean290 || Static112.aBoolean164) && arg0 != -1 && arg0 < this.anIntArray390.length) {
			@Pc(71) int local71 = this.anIntArray390[arg0];
			local49 = Static57.method928(local71 >> 16);
			arg0 = local71 & 0xFFFF;
		}
		@Pc(109) Class12_Sub2 local109;
		if (local49 == null) {
			local109 = arg1.method3167(!local29.method3716(local33), !local29.method3714(local33), !this.aBoolean292);
		} else {
			local109 = arg1.method3167(!local29.method3716(local33) & !local49.method3716(arg0), !local29.method3714(local33) & !local49.method3714(arg0), !this.aBoolean292);
		}
		if (Static178.aBoolean216 && this.aBoolean292) {
			if (local47 == 1) {
				((Class12_Sub2_Sub2) local109).method3179();
			} else if (local47 == 2) {
				((Class12_Sub2_Sub2) local109).method3176();
			} else if (local47 == 3) {
				((Class12_Sub2_Sub2) local109).method3169();
			}
		} else if (local47 == 1) {
			local109.method3140();
		} else if (local47 == 2) {
			local109.method3164();
		} else if (local47 == 3) {
			local109.method3141();
		}
		local109.method3166(local29, local33, local49, arg0, arg2 - 1, local14, this.aBoolean292);
		if (Static178.aBoolean216 && this.aBoolean292) {
			if (local47 == 1) {
				((Class12_Sub2_Sub2) local109).method3169();
			} else if (local47 == 2) {
				((Class12_Sub2_Sub2) local109).method3176();
			} else if (local47 == 3) {
				((Class12_Sub2_Sub2) local109).method3179();
			}
		} else if (local47 == 1) {
			local109.method3141();
		} else if (local47 == 2) {
			local109.method3164();
		} else if (local47 == 3) {
			local109.method3140();
		}
		return local109;
	}
}
