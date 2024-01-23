import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class15 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[Z")
	public boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
	private int[] anIntArray34;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
	public int anInt416 = -1;

	@OriginalMember(owner = "client!bg", name = "u", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	public int anInt420 = 5;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
	public int anInt419 = -1;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
	public int anInt422 = 99;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
	public int anInt409 = -1;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public int anInt412 = 2;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
	public int anInt426 = -1;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
	public int anInt424 = -1;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	public void method351() {
		if (this.anInt419 == -1) {
			if (this.aBooleanArray11 == null) {
				this.anInt419 = 0;
			} else {
				this.anInt419 = 2;
			}
		}
		if (this.anInt426 != -1) {
			return;
		}
		if (this.aBooleanArray11 == null) {
			this.anInt426 = 0;
		} else {
			this.anInt426 = 2;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLclient!ug;)V")
	private void method352(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		@Pc(100) int local100;
		@Pc(106) int local106;
		if (arg0 == 1) {
			local100 = arg1.method3948();
			this.anIntArray36 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray36[local106] = arg1.method3948();
			}
			this.anIntArray35 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray35[local106] = arg1.method3948();
			}
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray35[local106] = (arg1.method3948() << 16) + this.anIntArray35[local106];
			}
		} else if (arg0 == 2) {
			this.anInt424 = arg1.method3948();
		} else if (arg0 == 3) {
			this.aBooleanArray11 = new boolean[256];
			local100 = arg1.method3915();
			for (local106 = 0; local106 < local100; local106++) {
				this.aBooleanArray11[arg1.method3915()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean37 = true;
		} else if (arg0 == 5) {
			this.anInt420 = arg1.method3915();
		} else if (arg0 == 6) {
			this.anInt409 = arg1.method3948();
		} else if (arg0 == 7) {
			this.anInt416 = arg1.method3948();
		} else if (arg0 == 8) {
			this.anInt422 = arg1.method3915();
		} else if (arg0 == 9) {
			this.anInt419 = arg1.method3915();
		} else if (arg0 == 10) {
			this.anInt426 = arg1.method3915();
		} else if (arg0 == 11) {
			this.anInt412 = arg1.method3915();
		} else if (arg0 == 12) {
			local100 = arg1.method3915();
			this.anIntArray34 = new int[local100];
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray34[local106] = arg1.method3948();
			}
			for (local106 = 0; local106 < local100; local106++) {
				this.anIntArray34[local106] = (arg1.method3948() << 16) + this.anIntArray34[local106];
			}
		} else if (arg0 == 13) {
			local100 = arg1.method3948();
			this.anIntArrayArray3 = new int[local100][];
			for (local106 = 0; local106 < local100; local106++) {
				@Pc(199) int local199 = arg1.method3915();
				if (local199 > 0) {
					this.anIntArrayArray3[local106] = new int[local199];
					this.anIntArrayArray3[local106][0] = arg1.method3899();
					for (@Pc(222) int local222 = 1; local222 < local199; local222++) {
						this.anIntArrayArray3[local106][local222] = arg1.method3948();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean40 = true;
		} else if (arg0 == 15) {
			this.aBoolean39 = true;
		} else if (arg0 == 16) {
			this.aBoolean38 = true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILclient!hm;I)Lclient!hm;")
	public Class10_Sub4 method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class10_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray36[arg0];
		@Pc(9) int local9 = this.anIntArray35[arg0];
		@Pc(15) Class3_Sub4_Sub11 local15 = Static288.method4748(local9 >> 16);
		@Pc(35) int local35 = local9 & 0xFFFF;
		if (local15 == null) {
			return arg2.method1962(true, true, true);
		}
		@Pc(46) Class3_Sub4_Sub11 local46 = null;
		if ((this.aBoolean39 || Static146.aBoolean417) && arg3 != -1 && arg3 < this.anIntArray35.length) {
			@Pc(64) int local64 = this.anIntArray35[arg3];
			local46 = Static288.method4748(local64 >> 16);
			arg3 = local64 & 0xFFFF;
		}
		@Pc(120) Class10_Sub4 local120;
		if (local46 == null) {
			local120 = arg2.method1962(!local15.method1716(local35), !local15.method1715(local35), !this.aBoolean40);
		} else {
			local120 = arg2.method1962(!local15.method1716(local35) & !local46.method1716(arg3), !local15.method1715(local35) & !local46.method1715(arg3), !this.aBoolean40);
		}
		local120.method1945(local15, local35, local46, arg3, arg1 - 1, local4, this.aBoolean40);
		return local120;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!hm;IIIIB)Lclient!hm;")
	public Class10_Sub4 method355(@OriginalArg(0) Class10_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = this.anIntArray36[arg1];
		@Pc(11) int local11 = this.anIntArray35[arg1];
		@Pc(23) Class3_Sub4_Sub11 local23 = Static288.method4748(local11 >> 16);
		@Pc(27) int local27 = local11 & 0xFFFF;
		if (local23 == null) {
			return arg0.method1965(true, true, true);
		}
		@Pc(42) Class3_Sub4_Sub11 local42 = null;
		if ((this.aBoolean39 || Static146.aBoolean417) && arg4 != -1 && arg4 < this.anIntArray35.length) {
			@Pc(64) int local64 = this.anIntArray35[arg4];
			local42 = Static288.method4748(local64 >> 16);
			arg4 = local64 & 0xFFFF;
		}
		@Pc(78) int local78 = arg3 & 0x3;
		@Pc(124) Class10_Sub4 local124;
		if (local42 == null) {
			local124 = arg0.method1965(!local23.method1716(local27), !local23.method1715(local27), !this.aBoolean40);
		} else {
			local124 = arg0.method1965(!local23.method1716(local27) & !local42.method1716(arg4), !local23.method1715(local27) & !local42.method1715(arg4), !this.aBoolean40);
		}
		if (this.aBoolean40 && Static283.aBoolean393) {
			if (local78 == 1) {
				((Class10_Sub4_Sub1) local124).method1549();
			} else if (local78 == 2) {
				((Class10_Sub4_Sub1) local124).method1543();
			} else if (local78 == 3) {
				((Class10_Sub4_Sub1) local124).method1531();
			}
		} else if (local78 == 1) {
			local124.method1956();
		} else if (local78 == 2) {
			local124.method1942();
		} else if (local78 == 3) {
			local124.method1950();
		}
		local124.method1945(local23, local27, local42, arg4, arg2 - 1, local6, this.aBoolean40);
		if (this.aBoolean40 && Static283.aBoolean393) {
			if (local78 == 1) {
				((Class10_Sub4_Sub1) local124).method1531();
			} else if (local78 == 2) {
				((Class10_Sub4_Sub1) local124).method1543();
			} else if (local78 == 3) {
				((Class10_Sub4_Sub1) local124).method1549();
			}
		} else if (local78 == 1) {
			local124.method1950();
		} else if (local78 == 2) {
			local124.method1942();
		} else if (local78 == 3) {
			local124.method1956();
		}
		return local124;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILclient!hm;)Lclient!hm;")
	public Class10_Sub4 method356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class10_Sub4 arg3) {
		@Pc(4) int local4 = this.anIntArray36[arg0];
		@Pc(13) int local13 = this.anIntArray35[arg0];
		@Pc(19) Class3_Sub4_Sub11 local19 = Static288.method4748(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method1965(true, true, true);
		}
		@Pc(33) Class3_Sub4_Sub11 local33 = null;
		@Pc(35) int local35 = 0;
		@Pc(42) Class3_Sub4_Sub11 local42 = null;
		@Pc(44) int local44 = 0;
		@Pc(46) Class3_Sub4_Sub11 local46 = null;
		if ((this.aBoolean39 || Static146.aBoolean417) && arg1 != -1 && arg1 < this.anIntArray35.length) {
			@Pc(67) int local67 = this.anIntArray35[arg1];
			local46 = Static288.method4748(local67 >> 16);
			arg1 = local67 & 0xFFFF;
		}
		if (this.anIntArray34 != null) {
			if (arg0 < this.anIntArray34.length) {
				local35 = this.anIntArray34[arg0];
				if (local35 != 65535) {
					local33 = Static288.method4748(local35 >> 16);
					local35 &= 0xFFFF;
				}
			}
			if ((this.aBoolean39 || Static146.aBoolean417) && arg1 != -1 && this.anIntArray34.length > arg1) {
				local44 = this.anIntArray34[arg1];
				if (local44 != 65535) {
					local42 = Static288.method4748(local44 >> 16);
					local44 &= 0xFFFF;
				}
			}
		}
		@Pc(157) boolean local157 = !local19.method1716(local23);
		@Pc(166) boolean local166 = !local19.method1715(local23);
		if (local33 != null) {
			local157 &= !local33.method1716(local35);
			local166 &= !local33.method1715(local35);
		}
		if (local46 != null) {
			local157 &= !local46.method1716(arg1);
			local166 &= !local46.method1715(arg1);
		}
		if (local42 != null) {
			local157 &= !local42.method1716(local44);
			local166 &= !local42.method1715(local44);
		}
		@Pc(254) Class10_Sub4 local254 = arg3.method1965(local157, local166, !this.aBoolean40);
		local254.method1945(local19, local23, local46, arg1, arg2 - 1, local4, this.aBoolean40);
		if (local33 != null) {
			local254.method1945(local33, local35, local42, local44, arg2 - 1, local4, this.aBoolean40);
		}
		return local254;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!ug;)V")
	public void method357(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3915();
			if (local9 == 0) {
				return;
			}
			this.method352(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!hm;BIII)Lclient!hm;")
	public Class10_Sub4 method358(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray36[arg2];
		@Pc(15) int local15 = this.anIntArray35[arg2];
		@Pc(21) Class3_Sub4_Sub11 local21 = Static288.method4748(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg1.method1953(true, true, true);
		}
		@Pc(45) int local45 = arg4 & 0x3;
		@Pc(47) Class3_Sub4_Sub11 local47 = null;
		if ((this.aBoolean39 || Static146.aBoolean417) && arg0 != -1 && arg0 < this.anIntArray35.length) {
			@Pc(67) int local67 = this.anIntArray35[arg0];
			local47 = Static288.method4748(local67 >> 16);
			arg0 = local67 & 0xFFFF;
		}
		@Pc(105) Class10_Sub4 local105;
		if (local47 == null) {
			local105 = arg1.method1953(!local21.method1716(local25), !local21.method1715(local25), !this.aBoolean40);
		} else {
			local105 = arg1.method1953(!local21.method1716(local25) & !local47.method1716(arg0), !local21.method1715(local25) & !local47.method1715(arg0), !this.aBoolean40);
		}
		if (Static283.aBoolean393 && this.aBoolean40) {
			if (local45 == 1) {
				((Class10_Sub4_Sub1) local105).method1549();
			} else if (local45 == 2) {
				((Class10_Sub4_Sub1) local105).method1543();
			} else if (local45 == 3) {
				((Class10_Sub4_Sub1) local105).method1531();
			}
		} else if (local45 == 1) {
			local105.method1956();
		} else if (local45 == 2) {
			local105.method1942();
		} else if (local45 == 3) {
			local105.method1950();
		}
		local105.method1945(local21, local25, local47, arg0, arg3 - 1, local10, this.aBoolean40);
		if (Static283.aBoolean393 && this.aBoolean40) {
			if (local45 == 1) {
				((Class10_Sub4_Sub1) local105).method1531();
			} else if (local45 == 2) {
				((Class10_Sub4_Sub1) local105).method1543();
			} else if (local45 == 3) {
				((Class10_Sub4_Sub1) local105).method1549();
			}
		} else if (local45 == 1) {
			local105.method1950();
		} else if (local45 == 2) {
			local105.method1942();
		} else if (local45 == 3) {
			local105.method1956();
		}
		return local105;
	}
}
