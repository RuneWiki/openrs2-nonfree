import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class32 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "[Z")
	public boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public int anInt964 = -1;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public int anInt967 = 5;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public int anInt963 = -1;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public int anInt971 = 99;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	public int anInt966 = -1;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "I")
	public int anInt973 = -1;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public int anInt972 = 2;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public int anInt968 = -1;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!o;IZII)Lclient!o;")
	public Class2_Sub1 method802(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray121[arg3];
		@Pc(13) int local13 = this.anIntArray123[arg3];
		@Pc(19) Class1_Sub3_Sub21 local19 = Static256.method3953(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method564(true, true, true);
		}
		@Pc(40) Class1_Sub3_Sub21 local40 = null;
		if ((this.aBoolean69 || Static150.aBoolean218) && arg1 != -1 && arg1 < this.anIntArray123.length) {
			@Pc(60) int local60 = this.anIntArray123[arg1];
			local40 = Static256.method3953(local60 >> 16);
			arg1 = local60 & 0xFFFF;
		}
		@Pc(115) Class2_Sub1 local115;
		if (local40 == null) {
			local115 = arg0.method564(!local19.method4307(local23), !local19.method4311(local23), !this.aBoolean70);
		} else {
			local115 = arg0.method564(!local19.method4307(local23) & !local40.method4307(arg1), !local19.method4311(local23) & !local40.method4311(arg1), !this.aBoolean70);
		}
		local115.method551(local19, local23, local40, arg1, arg2 - 1, local8, this.aBoolean70);
		return local115;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!o;III)Lclient!o;")
	public Class2_Sub1 method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray121[arg3];
		@Pc(15) int local15 = this.anIntArray123[arg3];
		@Pc(21) Class1_Sub3_Sub21 local21 = Static256.method3953(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg2.method569(true, true, true);
		}
		@Pc(39) int local39 = arg4 & 0x3;
		@Pc(47) Class1_Sub3_Sub21 local47 = null;
		if ((this.aBoolean69 || Static150.aBoolean218) && arg0 != -1 && this.anIntArray123.length > arg0) {
			@Pc(70) int local70 = this.anIntArray123[arg0];
			local47 = Static256.method3953(local70 >> 16);
			arg0 = local70 & 0xFFFF;
		}
		@Pc(125) Class2_Sub1 local125;
		if (local47 == null) {
			local125 = arg2.method569(!local21.method4307(local25), !local21.method4311(local25), !this.aBoolean70);
		} else {
			local125 = arg2.method569(!local21.method4307(local25) & !local47.method4307(arg0), !local21.method4311(local25) & !local47.method4311(arg0), !this.aBoolean70);
		}
		if (Static294.aBoolean367 && this.aBoolean70) {
			if (local39 == 1) {
				((Class2_Sub1_Sub1) local125).method145();
			} else if (local39 == 2) {
				((Class2_Sub1_Sub1) local125).method147();
			} else if (local39 == 3) {
				((Class2_Sub1_Sub1) local125).method149();
			}
		} else if (local39 == 1) {
			local125.method562();
		} else if (local39 == 2) {
			local125.method567();
		} else if (local39 == 3) {
			local125.method565();
		}
		local125.method551(local21, local25, local47, arg0, arg1 - 1, local10, this.aBoolean70);
		if (Static294.aBoolean367 && this.aBoolean70) {
			if (local39 == 1) {
				((Class2_Sub1_Sub1) local125).method149();
			} else if (local39 == 2) {
				((Class2_Sub1_Sub1) local125).method147();
			} else if (local39 == 3) {
				((Class2_Sub1_Sub1) local125).method145();
			}
		} else if (local39 == 1) {
			local125.method565();
		} else if (local39 == 2) {
			local125.method567();
		} else if (local39 == 3) {
			local125.method562();
		}
		return local125;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qm;I)V")
	public void method805(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2199();
			if (local5 == 0) {
				return;
			}
			this.method808(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!o;III)Lclient!o;")
	public Class2_Sub1 method806(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray123[arg1];
		@Pc(13) int local13 = this.anIntArray121[arg1];
		@Pc(19) Class1_Sub3_Sub21 local19 = Static256.method3953(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg0.method560(true, true, true);
		}
		@Pc(35) Class1_Sub3_Sub21 local35 = null;
		@Pc(37) Class1_Sub3_Sub21 local37 = null;
		@Pc(39) Class1_Sub3_Sub21 local39 = null;
		if ((this.aBoolean69 || Static150.aBoolean218) && arg3 != -1 && arg3 < this.anIntArray123.length) {
			@Pc(62) int local62 = this.anIntArray123[arg3];
			local35 = Static256.method3953(local62 >> 16);
			arg3 = local62 & 0xFFFF;
		}
		@Pc(74) int local74 = 0;
		@Pc(76) int local76 = 0;
		if (this.anIntArray124 != null) {
			if (this.anIntArray124.length > arg1) {
				local74 = this.anIntArray124[arg1];
				if (local74 != 65535) {
					local37 = Static256.method3953(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
			if ((this.aBoolean69 || Static150.aBoolean218) && arg3 != -1 && this.anIntArray124.length > arg3) {
				local76 = this.anIntArray124[arg3];
				if (local76 != 65535) {
					local39 = Static256.method3953(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
		}
		@Pc(150) boolean local150 = !local19.method4307(local23);
		@Pc(159) boolean local159 = !local19.method4311(local23);
		if (local37 != null) {
			local150 &= !local37.method4307(local74);
			local159 &= !local37.method4311(local74);
		}
		if (local35 != null) {
			local150 &= !local35.method4307(arg3);
			local159 &= !local35.method4311(arg3);
		}
		if (local39 != null) {
			local150 &= !local39.method4307(local76);
			local159 &= !local39.method4311(local76);
		}
		@Pc(252) Class2_Sub1 local252 = arg0.method560(local150, local159, !this.aBoolean70);
		local252.method551(local19, local23, local35, arg3, arg2 - 1, local13, this.aBoolean70);
		if (local37 != null) {
			local252.method551(local37, local74, local39, local76, arg2 - 1, local13, this.aBoolean70);
		}
		return local252;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!o;IIBII)Lclient!o;")
	public Class2_Sub1 method807(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = this.anIntArray121[arg3];
		@Pc(15) int local15 = this.anIntArray123[arg3];
		@Pc(21) Class1_Sub3_Sub21 local21 = Static256.method3953(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method560(true, true, true);
		}
		@Pc(38) int local38 = arg4 & 0x3;
		@Pc(40) Class1_Sub3_Sub21 local40 = null;
		if ((this.aBoolean69 || Static150.aBoolean218) && arg1 != -1 && this.anIntArray123.length > arg1) {
			@Pc(62) int local62 = this.anIntArray123[arg1];
			local40 = Static256.method3953(local62 >> 16);
			arg1 = local62 & 0xFFFF;
		}
		@Pc(118) Class2_Sub1 local118;
		if (local40 == null) {
			local118 = arg0.method560(!local21.method4307(local25), !local21.method4311(local25), !this.aBoolean70);
		} else {
			local118 = arg0.method560(!local21.method4307(local25) & !local40.method4307(arg1), !local21.method4311(local25) & !local40.method4311(arg1), !this.aBoolean70);
		}
		if (this.aBoolean70 && Static294.aBoolean367) {
			if (local38 == 1) {
				((Class2_Sub1_Sub1) local118).method145();
			} else if (local38 == 2) {
				((Class2_Sub1_Sub1) local118).method147();
			} else if (local38 == 3) {
				((Class2_Sub1_Sub1) local118).method149();
			}
		} else if (local38 == 1) {
			local118.method562();
		} else if (local38 == 2) {
			local118.method567();
		} else if (local38 == 3) {
			local118.method565();
		}
		local118.method551(local21, local25, local40, arg1, arg2 - 1, local6, this.aBoolean70);
		if (this.aBoolean70 && Static294.aBoolean367) {
			if (local38 == 1) {
				((Class2_Sub1_Sub1) local118).method149();
			} else if (local38 == 2) {
				((Class2_Sub1_Sub1) local118).method147();
			} else if (local38 == 3) {
				((Class2_Sub1_Sub1) local118).method145();
			}
		} else if (local38 == 1) {
			local118.method565();
		} else if (local38 == 2) {
			local118.method567();
		} else if (local38 == 3) {
			local118.method562();
		}
		return local118;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!qm;I)V")
	private void method808(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 1) {
			local14 = arg0.method2244();
			this.anIntArray121 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray121[local20] = arg0.method2244();
			}
			this.anIntArray123 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray123[local20] = arg0.method2244();
			}
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray123[local20] += arg0.method2244() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt968 = arg0.method2244();
		} else if (arg1 == 3) {
			this.aBooleanArray9 = new boolean[256];
			local14 = arg0.method2199();
			for (local20 = 0; local20 < local14; local20++) {
				this.aBooleanArray9[arg0.method2199()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean68 = true;
		} else if (arg1 == 5) {
			this.anInt967 = arg0.method2199();
		} else if (arg1 == 6) {
			this.anInt966 = arg0.method2244();
		} else if (arg1 == 7) {
			this.anInt964 = arg0.method2244();
		} else if (arg1 == 8) {
			this.anInt971 = arg0.method2199();
		} else if (arg1 == 9) {
			this.anInt963 = arg0.method2199();
		} else if (arg1 == 10) {
			this.anInt973 = arg0.method2199();
		} else if (arg1 == 11) {
			this.anInt972 = arg0.method2199();
		} else if (arg1 == 12) {
			local14 = arg0.method2199();
			this.anIntArray124 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray124[local20] = arg0.method2244();
			}
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray124[local20] = (arg0.method2244() << 16) + this.anIntArray124[local20];
			}
		} else if (arg1 == 13) {
			local14 = arg0.method2244();
			this.anIntArrayArray19 = new int[local14][];
			for (local20 = 0; local20 < local14; local20++) {
				@Pc(222) int local222 = arg0.method2199();
				if (local222 > 0) {
					this.anIntArrayArray19[local20] = new int[local222];
					this.anIntArrayArray19[local20][0] = arg0.method2215();
					for (@Pc(245) int local245 = 1; local245 < local222; local245++) {
						this.anIntArrayArray19[local20][local245] = arg0.method2244();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean70 = true;
		} else if (arg1 == 15) {
			this.aBoolean69 = true;
		} else if (arg1 == 16) {
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public void method811() {
		if (this.anInt973 == -1) {
			if (this.aBooleanArray9 == null) {
				this.anInt973 = 0;
			} else {
				this.anInt973 = 2;
			}
		}
		if (this.anInt963 != -1) {
			return;
		}
		if (this.aBooleanArray9 == null) {
			this.anInt963 = 0;
		} else {
			this.anInt963 = 2;
		}
	}
}
