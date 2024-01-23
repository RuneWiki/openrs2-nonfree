import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class30 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Lclient!hd;")
	private Class50 aClass50_9;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!di", name = "F", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!di", name = "H", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "[I")
	private int[] anIntArray100;

	@OriginalMember(owner = "client!di", name = "T", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!di", name = "U", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!di", name = "jb", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "I")
	public int anInt962 = -1;

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public int anInt957 = -1;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public int anInt958 = -1;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "B")
	public byte aByte6 = -96;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	public int anInt967 = -1;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "I")
	public int anInt975 = -1;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public int anInt961 = 1;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	private int anInt963 = -1;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "I")
	public int anInt979 = 32;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "I")
	public int anInt973 = -1;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "Z")
	public boolean aBoolean91 = true;

	@OriginalMember(owner = "client!di", name = "M", descriptor = "I")
	public int anInt978 = -1;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "Z")
	public boolean aBoolean94 = true;

	@OriginalMember(owner = "client!di", name = "G", descriptor = "I")
	public int anInt977 = -1;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "S")
	public short aShort19 = 0;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "[Lclient!sc;")
	public Class107[] aClass107Array5 = new Class107[5];

	@OriginalMember(owner = "client!di", name = "V", descriptor = "S")
	public short aShort20 = 0;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "S")
	public short aShort18 = 0;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "B")
	public byte aByte7 = -16;

	@OriginalMember(owner = "client!di", name = "z", descriptor = "I")
	public int anInt972 = 0;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	private int anInt968 = -1;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "I")
	private int anInt966 = 0;

	@OriginalMember(owner = "client!di", name = "C", descriptor = "Z")
	public boolean aBoolean92 = true;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	private int anInt970 = 0;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!di", name = "W", descriptor = "I")
	public int anInt980 = -1;

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
	public int anInt985 = -1;

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "S")
	public short aShort21 = 0;

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
	private int anInt989 = 128;

	@OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
	public int anInt983 = -1;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Lclient!sc;")
	public Class107 aClass107_295 = Static26.aClass107_177;

	@OriginalMember(owner = "client!di", name = "kb", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
	public int anInt987 = -1;

	@OriginalMember(owner = "client!di", name = "nb", descriptor = "I")
	public int anInt992 = -1;

	@OriginalMember(owner = "client!di", name = "db", descriptor = "I")
	private int anInt986 = 128;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!vf;I)V")
	public void method863(@OriginalArg(0) Class1_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2945();
			if (local5 == 0) {
				return;
			}
			this.method875(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZLclient!sc;)Lclient!sc;")
	public Class107 method865(@OriginalArg(0) int arg0, @OriginalArg(2) Class107 arg1) {
		if (this.aClass50_9 == null) {
			return arg1;
		} else {
			@Pc(22) Class1_Sub19 local22 = (Class1_Sub19) this.aClass50_9.method1364((long) arg0);
			return local22 == null ? arg1 : local22.aClass107_816;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public void method866() {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Z")
	public boolean method868() {
		if (this.anIntArray102 == null) {
			return this.anInt962 != -1 || this.anInt975 != -1 || this.anInt987 != -1;
		}
		for (@Pc(34) int local34 = 0; local34 < this.anIntArray102.length; local34++) {
			if (this.anIntArray102[local34] != -1) {
				@Pc(50) Class30 local50 = Static139.method2340(this.anIntArray102[local34]);
				if (local50.anInt962 != -1 || local50.anInt975 != -1 || local50.anInt987 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!qa;ZI)Lclient!nb;")
	public Class5_Sub3 method869(@OriginalArg(0) Class96 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray102 != null) {
			@Pc(12) Class30 local12 = this.method870();
			return local12 == null ? null : local12.method869(arg0, arg1);
		} else if (this.anIntArray100 == null) {
			return null;
		} else {
			@Pc(45) Class5_Sub3 local45 = (Class5_Sub3) Static95.aClass61_34.method1693((long) this.anInt964);
			if (local45 == null) {
				@Pc(49) boolean local49 = false;
				for (@Pc(51) int local51 = 0; local51 < this.anIntArray100.length; local51++) {
					if (!Static115.aClass28_46.method841(this.anIntArray100[local51], 0)) {
						local49 = true;
					}
				}
				if (local49) {
					return null;
				}
				@Pc(83) Class5_Sub1[] local83 = new Class5_Sub1[this.anIntArray100.length];
				for (@Pc(85) int local85 = 0; local85 < this.anIntArray100.length; local85++) {
					local83[local85] = Static9.method277(Static115.aClass28_46, this.anIntArray100[local85]);
				}
				@Pc(111) Class5_Sub1 local111;
				if (local83.length == 1) {
					local111 = local83[0];
				} else {
					local111 = new Class5_Sub1(local83, local83.length);
				}
				@Pc(125) int local125;
				if (this.aShortArray18 != null) {
					for (local125 = 0; local125 < this.aShortArray18.length; local125++) {
						if (this.aByteArray23 == null || local125 >= this.aByteArray23.length) {
							local111.method271(this.aShortArray18[local125], this.aShortArray17[local125]);
						} else {
							local111.method271(this.aShortArray18[local125], Static149.aShortArray44[this.aByteArray23[local125] & 0xFF]);
						}
					}
				}
				if (this.aShortArray16 != null) {
					for (local125 = 0; local125 < this.aShortArray16.length; local125++) {
						local111.method278(this.aShortArray16[local125], this.aShortArray19[local125]);
					}
				}
				local45 = local111.method274(64, 768, -50, -10, -50);
				Static95.aClass61_34.method1694((long) this.anInt964, local45);
			}
			if (arg0 != null) {
				local45 = arg0.method2701(arg1, local45);
			}
			return local45;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)Lclient!di;")
	public Class30 method870() {
		@Pc(6) int local6 = -1;
		if (this.anInt968 != -1) {
			local6 = Static227.method3695(this.anInt968);
		} else if (this.anInt963 != -1) {
			local6 = Static141.anIntArray267[this.anInt963];
		}
		if (local6 < 0 || local6 >= this.anIntArray102.length - 1 || this.anIntArray102[local6] == -1) {
			@Pc(58) int local58 = this.anIntArray102[this.anIntArray102.length - 1];
			return local58 == -1 ? null : Static139.method2340(local58);
		} else {
			return Static139.method2340(this.anIntArray102[local6]);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)I")
	public int method871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass50_9 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub5 local16 = (Class1_Sub5) this.aClass50_9.method1364((long) arg0);
			return local16 == null ? arg1 : local16.anInt782;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Z")
	public boolean method873() {
		if (this.anIntArray102 == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.anInt968 != -1) {
			local16 = Static227.method3695(this.anInt968);
		} else if (this.anInt963 != -1) {
			local16 = Static141.anIntArray267[this.anInt963];
		}
		if (local16 < 0 || this.anIntArray102.length - 1 <= local16 || this.anIntArray102[local16] == -1) {
			@Pc(68) int local68 = this.anIntArray102[this.anIntArray102.length - 1];
			return local68 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!qa;Lclient!qa;II)Lclient!nb;")
	public Class5_Sub3 method874(@OriginalArg(1) Class96 arg0, @OriginalArg(2) Class96 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray102 != null) {
			@Pc(12) Class30 local12 = this.method870();
			return local12 == null ? null : local12.method874(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class5_Sub3 local32 = (Class5_Sub3) Static116.aClass61_47.method1693((long) this.anInt964);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray99.length; local38++) {
				if (!Static115.aClass28_46.method841(this.anIntArray99[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(66) Class5_Sub1[] local66 = new Class5_Sub1[this.anIntArray99.length];
			for (@Pc(68) int local68 = 0; local68 < this.anIntArray99.length; local68++) {
				local66[local68] = Static9.method277(Static115.aClass28_46, this.anIntArray99[local68]);
				if (this.anIntArrayArray17 != null && this.anIntArrayArray17[local68] != null && local66[local68] != null) {
					local66[local68].method285(this.anIntArrayArray17[local68][0], this.anIntArrayArray17[local68][1], this.anIntArrayArray17[local68][2]);
				}
			}
			@Pc(133) Class5_Sub1 local133;
			if (local66.length == 1) {
				local133 = local66[0];
			} else {
				local133 = new Class5_Sub1(local66, local66.length);
			}
			@Pc(144) int local144;
			if (this.aShortArray18 != null) {
				for (local144 = 0; local144 < this.aShortArray18.length; local144++) {
					if (this.aByteArray23 == null || local144 >= this.aByteArray23.length) {
						local133.method271(this.aShortArray18[local144], this.aShortArray17[local144]);
					} else {
						local133.method271(this.aShortArray18[local144], Static149.aShortArray44[this.aByteArray23[local144] & 0xFF]);
					}
				}
			}
			if (this.aShortArray16 != null) {
				for (local144 = 0; local144 < this.aShortArray16.length; local144++) {
					local133.method278(this.aShortArray16[local144], this.aShortArray19[local144]);
				}
			}
			local32 = local133.method274(this.anInt970 + 64, 850 - -this.anInt966, -30, -50, -30);
			Static116.aClass61_47.method1694((long) this.anInt964, local32);
		}
		@Pc(256) Class5_Sub3 local256;
		if (arg1 != null && arg0 != null) {
			local256 = arg1.method2695(arg2, arg3, arg0, local32);
		} else if (arg1 != null) {
			local256 = arg1.method2697(local32, arg2);
		} else if (arg0 == null) {
			local256 = local32.method531(true, true);
		} else {
			local256 = arg0.method2697(local32, arg3);
		}
		if (this.anInt989 != 128 || this.anInt986 != 128) {
			local256.method538(this.anInt989, this.anInt986, this.anInt989);
		}
		return local256;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!vf;I)V")
	private void method875(@OriginalArg(1) Class1_Sub26 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		if (arg1 == 1) {
			local12 = arg0.method2945();
			this.anIntArray99 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray99[local18] = arg0.method2964();
			}
		} else if (arg1 == 2) {
			this.aClass107_295 = arg0.method2978();
		} else if (arg1 == 12) {
			this.anInt961 = arg0.method2945();
		} else if (arg1 == 13) {
			this.anInt973 = arg0.method2964();
		} else if (arg1 == 14) {
			this.anInt977 = arg0.method2964();
		} else if (arg1 == 15) {
			this.anInt957 = arg0.method2964();
		} else if (arg1 == 16) {
			this.anInt985 = arg0.method2964();
		} else if (arg1 == 17) {
			this.anInt977 = arg0.method2964();
			this.anInt967 = arg0.method2964();
			this.anInt992 = arg0.method2964();
			this.anInt983 = arg0.method2964();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass107Array5[arg1 - 30] = arg0.method2978();
			if (this.aClass107Array5[arg1 - 30].method3096(Static82.aClass107_519)) {
				this.aClass107Array5[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local12 = arg0.method2945();
			this.aShortArray18 = new short[local12];
			this.aShortArray17 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray18[local18] = (short) arg0.method2964();
				this.aShortArray17[local18] = (short) arg0.method2964();
			}
		} else if (arg1 == 41) {
			local12 = arg0.method2945();
			this.aShortArray19 = new short[local12];
			this.aShortArray16 = new short[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aShortArray16[local18] = (short) arg0.method2964();
				this.aShortArray19[local18] = (short) arg0.method2964();
			}
			return;
		} else if (arg1 == 42) {
			local12 = arg0.method2945();
			this.aByteArray23 = new byte[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.aByteArray23[local18] = arg0.method2992();
			}
			return;
		} else if (arg1 == 60) {
			local12 = arg0.method2945();
			this.anIntArray100 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray100[local18] = arg0.method2964();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean92 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt980 = arg0.method2964();
			return;
		} else if (arg1 == 97) {
			this.anInt989 = arg0.method2964();
			return;
		} else if (arg1 == 98) {
			this.anInt986 = arg0.method2964();
			return;
		} else if (arg1 == 99) {
			this.aBoolean93 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt970 = arg0.method2992();
			return;
		} else if (arg1 == 101) {
			this.anInt966 = arg0.method2992() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt978 = arg0.method2964();
			return;
		} else if (arg1 == 103) {
			this.anInt979 = arg0.method2964();
			return;
		} else {
			@Pc(399) int local399;
			if (arg1 != 106 && arg1 != 118) {
				if (arg1 == 107) {
					this.aBoolean94 = false;
					return;
				}
				if (arg1 == 109) {
					this.aBoolean95 = false;
					return;
				}
				if (arg1 == 111) {
					this.aBoolean91 = false;
					return;
				}
				if (arg1 == 113) {
					this.aShort21 = (short) arg0.method2964();
					this.aShort20 = (short) arg0.method2964();
					return;
				}
				if (arg1 == 114) {
					this.aByte6 = arg0.method2992();
					this.aByte7 = arg0.method2992();
					return;
				}
				if (arg1 == 115) {
					this.aShort19 = (short) (arg0.method2945() * 4);
					this.aShort18 = (short) (arg0.method2945() * 4);
					return;
				}
				if (arg1 == 119) {
					this.aByte8 = arg0.method2992();
					return;
				}
				if (arg1 == 120) {
					this.anInt962 = arg0.method2964();
					this.anInt975 = arg0.method2964();
					this.anInt987 = arg0.method2964();
					this.anInt972 = arg0.method2945();
					return;
				}
				if (arg1 != 121) {
					if (arg1 == 122) {
						this.anInt958 = arg0.method2964();
					} else if (arg1 == 249) {
						local12 = arg0.method2945();
						if (this.aClass50_9 == null) {
							local18 = Static156.method2529(local12);
							this.aClass50_9 = new Class50(local18);
						}
						for (local18 = 0; local18 < local12; local18++) {
							@Pc(339) boolean local339 = arg0.method2945() == 1;
							@Pc(343) int local343 = arg0.method2937();
							@Pc(352) Class1 local352;
							if (local339) {
								local352 = new Class1_Sub19(arg0.method2978());
							} else {
								local352 = new Class1_Sub5(arg0.method2958());
							}
							this.aClass50_9.method1362((long) local343, local352);
						}
						return;
					}
					return;
				}
				this.anIntArrayArray17 = new int[this.anIntArray99.length][];
				local12 = arg0.method2945();
				for (local18 = 0; local18 < local12; local18++) {
					local399 = arg0.method2945();
					@Pc(407) int[] local407 = this.anIntArrayArray17[local399] = new int[3];
					local407[0] = arg0.method2992();
					local407[1] = arg0.method2992();
					local407[2] = arg0.method2992();
				}
				return;
			}
			this.anInt968 = arg0.method2964();
			if (this.anInt968 == 65535) {
				this.anInt968 = -1;
			}
			this.anInt963 = arg0.method2964();
			if (this.anInt963 == 65535) {
				this.anInt963 = -1;
			}
			local12 = -1;
			if (arg1 == 118) {
				local12 = arg0.method2964();
				if (local12 == 65535) {
					local12 = -1;
				}
			}
			local18 = arg0.method2945();
			this.anIntArray102 = new int[local18 + 2];
			for (local399 = 0; local399 <= local18; local399++) {
				this.anIntArray102[local399] = arg0.method2964();
				if (this.anIntArray102[local399] == 65535) {
					this.anIntArray102[local399] = -1;
				}
			}
			this.anIntArray102[local18 + 1] = local12;
			return;
		}
	}
}
