import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class76 {

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "[I")
	private int[] anIntArray160;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public int anInt2215 = 99;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public int anInt2212 = -1;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public int anInt2214 = -1;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
	public int anInt2222 = -1;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
	public int anInt2220 = 2;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
	public int anInt2225 = -1;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	public int anInt2224 = 5;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public int anInt2216 = -1;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!aj;)V")
	public void method1713(@OriginalArg(1) Class8_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2334();
			if (local15 == 0) {
				return;
			}
			this.method1715(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BILclient!aj;)V")
	private void method1715(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		@Pc(112) int local112;
		@Pc(118) int local118;
		if (arg0 == 1) {
			local112 = arg1.method2375();
			this.anIntArray158 = new int[local112];
			for (local118 = 0; local118 < local112; local118++) {
				this.anIntArray158[local118] = arg1.method2375();
			}
			this.anIntArray159 = new int[local112];
			for (local118 = 0; local118 < local112; local118++) {
				this.anIntArray159[local118] = arg1.method2375();
			}
			for (local118 = 0; local118 < local112; local118++) {
				this.anIntArray159[local118] += arg1.method2375() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2214 = arg1.method2375();
		} else if (arg0 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local112 = arg1.method2334();
			for (local118 = 0; local118 < local112; local118++) {
				this.aBooleanArray6[arg1.method2334()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean175 = true;
		} else if (arg0 == 5) {
			this.anInt2224 = arg1.method2334();
		} else if (arg0 == 6) {
			this.anInt2212 = arg1.method2375();
		} else if (arg0 == 7) {
			this.anInt2222 = arg1.method2375();
		} else if (arg0 == 8) {
			this.anInt2215 = arg1.method2334();
		} else if (arg0 == 9) {
			this.anInt2225 = arg1.method2334();
		} else if (arg0 == 10) {
			this.anInt2216 = arg1.method2334();
		} else if (arg0 == 11) {
			this.anInt2220 = arg1.method2334();
		} else if (arg0 == 12) {
			local112 = arg1.method2334();
			this.anIntArray160 = new int[local112];
			for (local118 = 0; local118 < local112; local118++) {
				this.anIntArray160[local118] = arg1.method2375();
			}
			for (local118 = 0; local118 < local112; local118++) {
				this.anIntArray160[local118] = (arg1.method2375() << 16) + this.anIntArray160[local118];
			}
		} else if (arg0 == 13) {
			local112 = arg1.method2375();
			this.anIntArrayArray12 = new int[local112][];
			for (local118 = 0; local118 < local112; local118++) {
				@Pc(129) int local129 = arg1.method2334();
				if (local129 > 0) {
					this.anIntArrayArray12[local118] = new int[local129];
					this.anIntArrayArray12[local118][0] = arg1.method2323();
					for (@Pc(149) int local149 = 1; local149 < local129; local149++) {
						this.anIntArrayArray12[local118][local149] = arg1.method2375();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean172 = true;
		} else if (arg0 == 15) {
			this.aBoolean174 = true;
		} else if (arg0 == 16) {
			this.aBoolean173 = true;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIILclient!ie;I)Lclient!ie;")
	public Class36_Sub2 method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36_Sub2 arg4) {
		@Pc(10) int local10 = this.anIntArray158[arg3];
		@Pc(21) int local21 = this.anIntArray159[arg3];
		@Pc(29) Class8_Sub1_Sub22 local29 = Static15.method289(local21 >> 16);
		@Pc(33) int local33 = local21 & 0xFFFF;
		if (local29 == null) {
			return arg4.method3936(true, true, true);
		}
		@Pc(45) int local45 = arg2 & 0x3;
		@Pc(47) Class8_Sub1_Sub22 local47 = null;
		if ((this.aBoolean174 || Static48.aBoolean74) && arg1 != -1 && this.anIntArray159.length > arg1) {
			@Pc(70) int local70 = this.anIntArray159[arg1];
			local47 = Static15.method289(local70 >> 16);
			arg1 = local70 & 0xFFFF;
		}
		@Pc(110) Class36_Sub2 local110;
		if (local47 == null) {
			local110 = arg4.method3936(!local29.method4281(local33), !local29.method4285(local33), !this.aBoolean172);
		} else {
			local110 = arg4.method3936(!local29.method4281(local33) & !local47.method4281(arg1), !local29.method4285(local33) & !local47.method4285(arg1), !this.aBoolean172);
		}
		if (this.aBoolean172 && Static116.aBoolean188) {
			if (local45 == 1) {
				((Class36_Sub2_Sub1) local110).method3234();
			} else if (local45 == 2) {
				((Class36_Sub2_Sub1) local110).method3246();
			} else if (local45 == 3) {
				((Class36_Sub2_Sub1) local110).method3258();
			}
		} else if (local45 == 1) {
			local110.method3940();
		} else if (local45 == 2) {
			local110.method3942();
		} else if (local45 == 3) {
			local110.method3941();
		}
		local110.method3944(local29, local33, local47, arg1, arg0 - 1, local10, this.aBoolean172);
		if (this.aBoolean172 && Static116.aBoolean188) {
			if (local45 == 1) {
				((Class36_Sub2_Sub1) local110).method3258();
			} else if (local45 == 2) {
				((Class36_Sub2_Sub1) local110).method3246();
			} else if (local45 == 3) {
				((Class36_Sub2_Sub1) local110).method3234();
			}
		} else if (local45 == 1) {
			local110.method3941();
		} else if (local45 == 2) {
			local110.method3942();
		} else if (local45 == 3) {
			local110.method3940();
		}
		return local110;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!ie;II)Lclient!ie;")
	public Class36_Sub2 method1718(@OriginalArg(1) int arg0, @OriginalArg(2) Class36_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray158[arg0];
		@Pc(13) int local13 = this.anIntArray159[arg0];
		@Pc(19) Class8_Sub1_Sub22 local19 = Static15.method289(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method3936(true, true, true);
		}
		@Pc(35) Class8_Sub1_Sub22 local35 = null;
		@Pc(37) Class8_Sub1_Sub22 local37 = null;
		@Pc(39) Class8_Sub1_Sub22 local39 = null;
		@Pc(41) int local41 = 0;
		if ((this.aBoolean174 || Static48.aBoolean74) && arg2 != -1 && arg2 < this.anIntArray159.length) {
			@Pc(59) int local59 = this.anIntArray159[arg2];
			local39 = Static15.method289(local59 >> 16);
			arg2 = local59 & 0xFFFF;
		}
		@Pc(71) int local71 = 0;
		if (this.anIntArray160 != null) {
			if (this.anIntArray160.length > arg0) {
				local41 = this.anIntArray160[arg0];
				if (local41 != 65535) {
					local35 = Static15.method289(local41 >> 16);
					local41 &= 0xFFFF;
				}
			}
			if ((this.aBoolean174 || Static48.aBoolean74) && arg2 != -1 && arg2 < this.anIntArray160.length) {
				local71 = this.anIntArray160[arg2];
				if (local71 != 65535) {
					local37 = Static15.method289(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
		}
		@Pc(153) boolean local153 = !local19.method4281(local23);
		@Pc(167) boolean local167 = !local19.method4285(local23);
		if (local35 != null) {
			local153 &= !local35.method4281(local41);
			local167 &= !local35.method4285(local41);
		}
		if (local39 != null) {
			local153 &= !local39.method4281(arg2);
			local167 &= !local39.method4285(arg2);
		}
		if (local37 != null) {
			local153 &= !local37.method4281(local71);
			local167 &= !local37.method4285(local71);
		}
		@Pc(256) Class36_Sub2 local256 = arg1.method3936(local153, local167, !this.aBoolean172);
		local256.method3944(local19, local23, local39, arg2, arg3 - 1, local8, this.aBoolean172);
		if (local35 != null) {
			local256.method3944(local35, local41, local37, local71, arg3 - 1, local8, this.aBoolean172);
		}
		return local256;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public void method1720() {
		if (this.anInt2216 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt2216 = 0;
			} else {
				this.anInt2216 = 2;
			}
		}
		if (this.anInt2225 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt2225 = 0;
		} else {
			this.anInt2225 = 2;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIBLclient!ie;)Lclient!ie;")
	public Class36_Sub2 method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class36_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray158[arg1];
		@Pc(21) int local21 = this.anIntArray159[arg1];
		@Pc(27) Class8_Sub1_Sub22 local27 = Static15.method289(local21 >> 16);
		@Pc(31) int local31 = local21 & 0xFFFF;
		if (local27 == null) {
			return arg3.method3957(true, true, true);
		}
		@Pc(42) Class8_Sub1_Sub22 local42 = null;
		if ((this.aBoolean174 || Static48.aBoolean74) && arg0 != -1 && arg0 < this.anIntArray159.length) {
			@Pc(64) int local64 = this.anIntArray159[arg0];
			local42 = Static15.method289(local64 >> 16);
			arg0 = local64 & 0xFFFF;
		}
		@Pc(119) Class36_Sub2 local119;
		if (local42 == null) {
			local119 = arg3.method3957(!local27.method4281(local31), !local27.method4285(local31), !this.aBoolean172);
		} else {
			local119 = arg3.method3957(!local27.method4281(local31) & !local42.method4281(arg0), !local27.method4285(local31) & !local42.method4285(arg0), !this.aBoolean172);
		}
		local119.method3944(local27, local31, local42, arg0, arg2 - 1, local8, this.aBoolean172);
		return local119;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIIILclient!ie;I)Lclient!ie;")
	public Class36_Sub2 method1722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = this.anIntArray158[arg2];
		@Pc(23) int local23 = this.anIntArray159[arg2];
		@Pc(29) Class8_Sub1_Sub22 local29 = Static15.method289(local23 >> 16);
		@Pc(33) int local33 = local23 & 0xFFFF;
		if (local29 == null) {
			return arg3.method3962(true, true, true);
		}
		@Pc(46) int local46 = arg1 & 0x3;
		@Pc(48) Class8_Sub1_Sub22 local48 = null;
		if ((this.aBoolean174 || Static48.aBoolean74) && arg0 != -1 && this.anIntArray159.length > arg0) {
			@Pc(71) int local71 = this.anIntArray159[arg0];
			local48 = Static15.method289(local71 >> 16);
			arg0 = local71 & 0xFFFF;
		}
		@Pc(127) Class36_Sub2 local127;
		if (local48 == null) {
			local127 = arg3.method3962(!local29.method4281(local33), !local29.method4285(local33), !this.aBoolean172);
		} else {
			local127 = arg3.method3962(!local29.method4281(local33) & !local48.method4281(arg0), !local29.method4285(local33) & !local48.method4285(arg0), !this.aBoolean172);
		}
		if (Static116.aBoolean188 && this.aBoolean172) {
			if (local46 == 1) {
				((Class36_Sub2_Sub1) local127).method3234();
			} else if (local46 == 2) {
				((Class36_Sub2_Sub1) local127).method3246();
			} else if (local46 == 3) {
				((Class36_Sub2_Sub1) local127).method3258();
			}
		} else if (local46 == 1) {
			local127.method3940();
		} else if (local46 == 2) {
			local127.method3942();
		} else if (local46 == 3) {
			local127.method3941();
		}
		local127.method3944(local29, local33, local48, arg0, arg4 - 1, local18, this.aBoolean172);
		if (Static116.aBoolean188 && this.aBoolean172) {
			if (local46 == 1) {
				((Class36_Sub2_Sub1) local127).method3258();
			} else if (local46 == 2) {
				((Class36_Sub2_Sub1) local127).method3246();
			} else if (local46 == 3) {
				((Class36_Sub2_Sub1) local127).method3234();
			}
		} else if (local46 == 1) {
			local127.method3941();
		} else if (local46 == 2) {
			local127.method3942();
		} else if (local46 == 3) {
			local127.method3940();
		}
		return local127;
	}
}
