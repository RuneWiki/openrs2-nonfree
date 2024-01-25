import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class166 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!mb", name = "K", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!mb", name = "M", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "[Lclient!fs;")
	public Class88[] aClass88Array4;

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "[Lclient!ew;")
	public Class76[] aClass76Array4;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "[Lclient!v;")
	public Class254[] aClass254Array1;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt4010 = 12;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	public int anInt4016 = 0;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "B")
	public byte aByte71 = 0;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt4011 = 0;

	@OriginalMember(owner = "client!mb", name = "O", descriptor = "I")
	public int anInt4024 = 0;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt4013 = 0;

	static {
		new Class15("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
	public Class166(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3196(arg0);
		} else {
			this.method3205(arg0);
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(III)V")
	public Class166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray324 = new int[arg0];
		this.aShortArray69 = new short[arg1];
		this.anIntArray332 = new int[arg0];
		this.aShortArray73 = new short[arg1];
		this.aShortArray68 = new short[arg1];
		this.aShortArray74 = new short[arg1];
		this.aByteArray51 = new byte[arg1];
		this.anIntArray329 = new int[arg0];
		this.aByteArray54 = new byte[arg1];
		this.anIntArray326 = new int[arg0];
		this.aShortArray71 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray48 = new byte[arg2];
			this.anIntArray335 = new int[arg2];
			this.anIntArray325 = new int[arg2];
			this.aByteArray49 = new byte[arg2];
			this.aByteArray53 = new byte[arg2];
			this.anIntArray333 = new int[arg2];
			this.aShortArray72 = new short[arg2];
			this.anIntArray331 = new int[arg2];
			this.anIntArray327 = new int[arg2];
			this.aShortArray67 = new short[arg2];
			this.anIntArray328 = new int[arg2];
			this.aShortArray75 = new short[arg2];
		}
		this.aByteArray52 = new byte[arg1];
		this.anIntArray330 = new int[arg1];
		this.aByteArray50 = new byte[arg1];
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([Lclient!mb;I)V")
	public Class166(@OriginalArg(0) Class166[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4024 = 0;
		this.anInt4011 = 0;
		this.anInt4016 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte71 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class166 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4016 += local59.anInt4016;
				this.anInt4011 += local59.anInt4011;
				this.anInt4024 += local59.anInt4024;
				if (local59.aClass88Array4 != null) {
					local34 += local59.aClass88Array4.length;
				}
				if (local59.aClass76Array4 != null) {
					local32 += local59.aClass76Array4.length;
				}
				local38 |= local59.aByteArray54 != null;
				if (local59.aClass254Array1 != null) {
					local36 += local59.aClass254Array1.length;
				}
				local51 |= local59.anIntArray330 != null;
				local42 |= local59.aByteArray51 != null;
				local44 |= local59.aByteArray50 != null;
				local46 |= local59.aShortArray74 != null;
				if (local59.aByteArray52 == null) {
					if (this.aByte71 == -1) {
						this.aByte71 = local59.aByte71;
					}
					if (local59.aByte71 != this.aByte71) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local38) {
			this.aByteArray54 = new byte[this.anInt4024];
		}
		this.aShortArray68 = new short[this.anInt4024];
		this.aShortArray71 = new short[this.anInt4024];
		this.aShortArray70 = new short[this.anInt4024];
		this.aShortArray66 = new short[this.anInt4011];
		if (local36 > 0) {
			this.aClass254Array1 = new Class254[local36];
		}
		if (local46) {
			this.aShortArray74 = new short[this.anInt4024];
		}
		if (local51) {
			this.anIntArray330 = new int[this.anInt4024];
		}
		if (local44) {
			this.aByteArray50 = new byte[this.anInt4024];
		}
		if (local34 > 0) {
			this.aClass88Array4 = new Class88[local34];
		}
		this.anIntArray326 = new int[this.anInt4011];
		this.anIntArray329 = new int[this.anInt4011];
		if (local32 > 0) {
			this.aClass76Array4 = new Class76[local32];
		}
		this.anIntArray324 = new int[this.anInt4011];
		if (local42) {
			this.aByteArray51 = new byte[this.anInt4024];
		}
		if (local40) {
			this.aByteArray52 = new byte[this.anInt4024];
		}
		this.aShortArray69 = new short[this.anInt4024];
		this.anIntArray332 = new int[this.anInt4011];
		this.aShortArray73 = new short[this.anInt4024];
		if (this.anInt4016 > 0) {
			this.aByteArray49 = new byte[this.anInt4016];
			this.aShortArray72 = new short[this.anInt4016];
			this.aByteArray48 = new byte[this.anInt4016];
			this.anIntArray333 = new int[this.anInt4016];
			this.anIntArray328 = new int[this.anInt4016];
			this.anIntArray331 = new int[this.anInt4016];
			this.aByteArray53 = new byte[this.anInt4016];
			this.aShortArray67 = new short[this.anInt4016];
			this.anIntArray335 = new int[this.anInt4016];
			this.anIntArray327 = new int[this.anInt4016];
			this.aShortArray75 = new short[this.anInt4016];
			this.anIntArray325 = new int[this.anInt4016];
		}
		local32 = 0;
		local34 = 0;
		local36 = 0;
		this.anInt4016 = 0;
		this.anInt4024 = 0;
		this.anInt4011 = 0;
		@Pc(621) int local621;
		@Pc(632) int local632;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(388) short local388 = (short) (0x1 << local381);
			@Pc(392) Class166 local392 = arg0[local381];
			if (local392 != null) {
				@Pc(399) int local399;
				if (local392.aClass254Array1 != null) {
					for (local399 = 0; local399 < local392.aClass254Array1.length; local399++) {
						@Pc(406) Class254 local406 = local392.aClass254Array1[local399];
						this.aClass254Array1[local36++] = local406.method5667(this.anInt4024 + local406.anInt7065);
					}
				}
				for (local399 = 0; local399 < local392.anInt4024; local399++) {
					if (local38 && local392.aByteArray54 != null) {
						this.aByteArray54[this.anInt4024] = local392.aByteArray54[local399];
					}
					if (local40) {
						if (local392.aByteArray52 == null) {
							this.aByteArray52[this.anInt4024] = local392.aByte71;
						} else {
							this.aByteArray52[this.anInt4024] = local392.aByteArray52[local399];
						}
					}
					if (local42 && local392.aByteArray51 != null) {
						this.aByteArray51[this.anInt4024] = local392.aByteArray51[local399];
					}
					if (local46) {
						if (local392.aShortArray74 == null) {
							this.aShortArray74[this.anInt4024] = -1;
						} else {
							this.aShortArray74[this.anInt4024] = local392.aShortArray74[local399];
						}
					}
					if (local51) {
						if (local392.anIntArray330 == null) {
							this.anIntArray330[this.anInt4024] = -1;
						} else {
							this.anIntArray330[this.anInt4024] = local392.anIntArray330[local399];
						}
					}
					this.aShortArray69[this.anInt4024] = (short) this.method3202(local392.aShortArray69[local399], local392, local388);
					this.aShortArray71[this.anInt4024] = (short) this.method3202(local392.aShortArray71[local399], local392, local388);
					this.aShortArray73[this.anInt4024] = (short) this.method3202(local392.aShortArray73[local399], local392, local388);
					this.aShortArray70[this.anInt4024] = local388;
					this.aShortArray68[this.anInt4024] = local392.aShortArray68[local399];
					this.anInt4024++;
				}
				@Pc(608) int local608;
				if (local392.aClass76Array4 != null) {
					for (local608 = 0; local608 < local392.aClass76Array4.length; local608++) {
						local621 = this.method3202(local392.aClass76Array4[local608].anInt1844, local392, local388);
						local632 = this.method3202(local392.aClass76Array4[local608].anInt1845, local392, local388);
						@Pc(643) int local643 = this.method3202(local392.aClass76Array4[local608].anInt1840, local392, local388);
						this.aClass76Array4[local32] = local392.aClass76Array4[local608].method1516(local643, local621, local632);
						local32++;
					}
				}
				if (local392.aClass88Array4 != null) {
					for (local608 = 0; local608 < local392.aClass88Array4.length; local608++) {
						local621 = this.method3202(local392.aClass88Array4[local608].anInt2132, local392, local388);
						this.aClass88Array4[local34] = local392.aClass88Array4[local608].method1699(local621);
						local34++;
					}
				}
			}
		}
		this.anInt4013 = this.anInt4011;
		@Pc(713) int local713 = 0;
		for (@Pc(715) int local715 = 0; local715 < arg1; local715++) {
			@Pc(722) short local722 = (short) (0x1 << local715);
			@Pc(726) Class166 local726 = arg0[local715];
			if (local726 != null) {
				for (local621 = 0; local621 < local726.anInt4024; local621++) {
					if (local44) {
						this.aByteArray50[local713++] = (byte) (local726.aByteArray50 == null || local726.aByteArray50[local621] == -1 ? -1 : this.anInt4016 + local726.aByteArray50[local621]);
					}
				}
				for (local632 = 0; local632 < local726.anInt4016; local632++) {
					@Pc(779) byte local779 = this.aByteArray48[this.anInt4016] = local726.aByteArray48[local632];
					if (local779 == 0) {
						this.aShortArray72[this.anInt4016] = (short) this.method3202(local726.aShortArray72[local632], local726, local722);
						this.aShortArray75[this.anInt4016] = (short) this.method3202(local726.aShortArray75[local632], local726, local722);
						this.aShortArray67[this.anInt4016] = (short) this.method3202(local726.aShortArray67[local632], local726, local722);
					}
					if (local779 >= 1 && local779 <= 3) {
						this.aShortArray72[this.anInt4016] = local726.aShortArray72[local632];
						this.aShortArray75[this.anInt4016] = local726.aShortArray75[local632];
						this.aShortArray67[this.anInt4016] = local726.aShortArray67[local632];
						this.anIntArray325[this.anInt4016] = local726.anIntArray325[local632];
						this.anIntArray328[this.anInt4016] = local726.anIntArray328[local632];
						this.anIntArray327[this.anInt4016] = local726.anIntArray327[local632];
						this.aByteArray49[this.anInt4016] = local726.aByteArray49[local632];
						this.aByteArray53[this.anInt4016] = local726.aByteArray53[local632];
						this.anIntArray331[this.anInt4016] = local726.anIntArray331[local632];
					}
					if (local779 == 2) {
						this.anIntArray335[this.anInt4016] = local726.anIntArray335[local632];
						this.anIntArray333[this.anInt4016] = local726.anIntArray333[local632];
					}
					this.anInt4016++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BSS)V")
	public void method3191(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray74 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt4024; local27++) {
			if (arg0 == this.aShortArray74[local27]) {
				this.aShortArray74[local27] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)[[I")
	public int[][] method3192() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4013; local12++) {
			@Pc(19) int local19 = this.anIntArray332[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(43) int[][] local43 = new int[local10 + 1][];
		for (@Pc(45) int local45 = 0; local45 <= local10; local45++) {
			local43[local45] = new int[local8[local45]];
			local8[local45] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt4013; local74++) {
			@Pc(81) int local81 = this.anIntArray332[local74];
			if (local81 >= 0) {
				local43[local81][local8[local81]++] = local74;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)[[I")
	public int[][] method3193() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4024; local12++) {
			@Pc(19) int local19 = this.anIntArray330[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt4024; local80++) {
			@Pc(87) int local87 = this.anIntArray330[local80];
			if (local87 >= 0) {
				local47[local87][local8[local87]++] = local80;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ISS)V")
	public void method3194(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4024; local7++) {
			if (this.aShortArray68[local7] == arg1) {
				this.aShortArray68[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BI)V")
	private void method3196(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class4_Sub9 local10 = new Class4_Sub9(arg0);
		@Pc(15) Class4_Sub9 local15 = new Class4_Sub9(arg0);
		@Pc(20) Class4_Sub9 local20 = new Class4_Sub9(arg0);
		@Pc(25) Class4_Sub9 local25 = new Class4_Sub9(arg0);
		@Pc(30) Class4_Sub9 local30 = new Class4_Sub9(arg0);
		@Pc(35) Class4_Sub9 local35 = new Class4_Sub9(arg0);
		@Pc(40) Class4_Sub9 local40 = new Class4_Sub9(arg0);
		local10.anInt6207 = arg0.length - 23;
		this.anInt4011 = local10.method5028();
		this.anInt4024 = local10.method5028();
		this.anInt4016 = local10.method5007();
		@Pc(65) int local65 = local10.method5007();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt6207 -= 7;
			this.anInt4010 = local10.method5007();
			local10.anInt6207 += 6;
		}
		@Pc(128) int local128 = local10.method5007();
		@Pc(132) int local132 = local10.method5007();
		@Pc(136) int local136 = local10.method5007();
		@Pc(140) int local140 = local10.method5007();
		@Pc(144) int local144 = local10.method5007();
		@Pc(148) int local148 = local10.method5028();
		@Pc(152) int local152 = local10.method5028();
		@Pc(156) int local156 = local10.method5028();
		@Pc(160) int local160 = local10.method5028();
		@Pc(164) int local164 = local10.method5028();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(186) int local186;
		if (this.anInt4016 > 0) {
			local10.anInt6207 = 0;
			this.aByteArray48 = new byte[this.anInt4016];
			for (local186 = 0; local186 < this.anInt4016; local186++) {
				@Pc(199) byte local199 = this.aByteArray48[local186] = local10.method5063();
				if (local199 >= 1 && local199 <= 3) {
					local168++;
				}
				if (local199 == 0) {
					local166++;
				}
				if (local199 == 2) {
					local170++;
				}
			}
		}
		local186 = this.anInt4016;
		@Pc(233) int local233 = local186;
		local186 += this.anInt4011;
		@Pc(240) int local240 = local186;
		if (local76) {
			local186 += this.anInt4024;
		}
		@Pc(249) int local249 = local186;
		local186 += this.anInt4024;
		@Pc(256) int local256 = local186;
		if (local128 == 255) {
			local186 += this.anInt4024;
		}
		@Pc(268) int local268 = local186;
		if (local136 == 1) {
			local186 += this.anInt4024;
		}
		@Pc(280) int local280 = local186;
		if (local144 == 1) {
			local186 += this.anInt4011;
		}
		@Pc(292) int local292 = local186;
		if (local132 == 1) {
			local186 += this.anInt4024;
		}
		@Pc(304) int local304 = local186;
		local186 += local160;
		@Pc(310) int local310 = local186;
		if (local140 == 1) {
			local186 += this.anInt4024 * 2;
		}
		@Pc(322) int local322 = local186;
		local186 += local164;
		@Pc(328) int local328 = local186;
		local186 += this.anInt4024 * 2;
		@Pc(337) int local337 = local186;
		local186 += local148;
		@Pc(343) int local343 = local186;
		local186 += local152;
		@Pc(349) int local349 = local186;
		local186 += local156;
		@Pc(355) int local355 = local186;
		local186 += local166 * 6;
		@Pc(363) int local363 = local186;
		local186 += local168 * 6;
		@Pc(379) int local379 = this.anInt4010 >= 14 ? 7 : 6;
		@Pc(381) int local381 = local186;
		local186 += local379 * local168;
		@Pc(389) int local389 = local186;
		local186 += local168;
		@Pc(395) int local395 = local186;
		local186 += local168;
		@Pc(401) int local401 = local186;
		local186 += local170 * 2 + local168;
		if (local140 == 1) {
			this.aShortArray74 = new short[this.anInt4024];
		}
		if (local136 == 1) {
			this.anIntArray330 = new int[this.anInt4024];
		}
		this.anIntArray326 = new int[this.anInt4011];
		if (this.anInt4016 > 0) {
			if (local168 > 0) {
				this.anIntArray325 = new int[local168];
				this.aByteArray49 = new byte[local168];
				this.anIntArray328 = new int[local168];
				this.anIntArray327 = new int[local168];
				this.anIntArray331 = new int[local168];
				this.aByteArray53 = new byte[local168];
			}
			this.aShortArray75 = new short[this.anInt4016];
			this.aShortArray72 = new short[this.anInt4016];
			if (local170 > 0) {
				this.anIntArray335 = new int[local170];
				this.anIntArray333 = new int[local170];
			}
			this.aShortArray67 = new short[this.anInt4016];
		}
		if (local76) {
			this.aByteArray54 = new byte[this.anInt4024];
		}
		if (local144 == 1) {
			this.anIntArray332 = new int[this.anInt4011];
		}
		if (local140 == 1 && this.anInt4016 > 0) {
			this.aByteArray50 = new byte[this.anInt4024];
		}
		if (local132 == 1) {
			this.aByteArray51 = new byte[this.anInt4024];
		}
		this.aShortArray69 = new short[this.anInt4024];
		this.anIntArray329 = new int[this.anInt4011];
		local10.anInt6207 = local233;
		if (local128 == 255) {
			this.aByteArray52 = new byte[this.anInt4024];
		} else {
			this.aByte71 = (byte) local128;
		}
		this.aShortArray73 = new short[this.anInt4024];
		this.anIntArray324 = new int[this.anInt4011];
		this.aShortArray68 = new short[this.anInt4024];
		this.aShortArray71 = new short[this.anInt4024];
		local15.anInt6207 = local337;
		local20.anInt6207 = local343;
		local25.anInt6207 = local349;
		local30.anInt6207 = local280;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(605) int local605;
		for (@Pc(599) int local599 = 0; local599 < this.anInt4011; local599++) {
			local605 = local10.method5007();
			@Pc(607) int local607 = 0;
			if ((local605 & 0x1) != 0) {
				local607 = local15.method5020();
			}
			@Pc(617) int local617 = 0;
			if ((local605 & 0x2) != 0) {
				local617 = local20.method5020();
			}
			@Pc(630) int local630 = 0;
			if ((local605 & 0x4) != 0) {
				local630 = local25.method5020();
			}
			this.anIntArray324[local599] = local607 + local593;
			this.anIntArray326[local599] = local595 + local617;
			this.anIntArray329[local599] = local597 + local630;
			local593 = this.anIntArray324[local599];
			local595 = this.anIntArray326[local599];
			local597 = this.anIntArray329[local599];
			if (local144 == 1) {
				this.anIntArray332[local599] = local30.method5007();
			}
		}
		local10.anInt6207 = local328;
		local15.anInt6207 = local240;
		local20.anInt6207 = local256;
		local25.anInt6207 = local292;
		local30.anInt6207 = local268;
		local35.anInt6207 = local310;
		local40.anInt6207 = local322;
		for (local605 = 0; local605 < this.anInt4024; local605++) {
			this.aShortArray68[local605] = (short) local10.method5028();
			if (local76) {
				this.aByteArray54[local605] = local15.method5063();
			}
			if (local128 == 255) {
				this.aByteArray52[local605] = local20.method5063();
			}
			if (local132 == 1) {
				this.aByteArray51[local605] = local25.method5063();
			}
			if (local136 == 1) {
				this.anIntArray330[local605] = local30.method5007();
			}
			if (local140 == 1) {
				this.aShortArray74[local605] = (short) (local35.method5028() - 1);
			}
			if (this.aByteArray50 != null) {
				if (this.aShortArray74[local605] == -1) {
					this.aByteArray50[local605] = -1;
				} else {
					this.aByteArray50[local605] = (byte) (local40.method5007() - 1);
				}
			}
		}
		local10.anInt6207 = local304;
		this.anInt4013 = -1;
		local15.anInt6207 = local249;
		@Pc(833) short local833 = 0;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(847) int local847;
		for (@Pc(841) int local841 = 0; local841 < this.anInt4024; local841++) {
			local847 = local15.method5007();
			if (local847 == 1) {
				local833 = (short) (local839 + local10.method5020());
				local835 = (short) (local10.method5020() + local833);
				local837 = (short) (local10.method5020() + local835);
				this.aShortArray69[local841] = local833;
				local839 = local837;
				this.aShortArray71[local841] = local835;
				this.aShortArray73[local841] = local837;
				if (local833 > this.anInt4013) {
					this.anInt4013 = local833;
				}
				if (this.anInt4013 < local835) {
					this.anInt4013 = local835;
				}
				if (local837 > this.anInt4013) {
					this.anInt4013 = local837;
				}
			}
			if (local847 == 2) {
				local835 = local837;
				local837 = (short) (local10.method5020() + local839);
				local839 = local837;
				this.aShortArray69[local841] = local833;
				this.aShortArray71[local841] = local835;
				this.aShortArray73[local841] = local837;
				if (local837 > this.anInt4013) {
					this.anInt4013 = local837;
				}
			}
			if (local847 == 3) {
				local833 = local837;
				local837 = (short) (local10.method5020() + local839);
				local839 = local837;
				this.aShortArray69[local841] = local833;
				this.aShortArray71[local841] = local835;
				this.aShortArray73[local841] = local837;
				if (local837 > this.anInt4013) {
					this.anInt4013 = local837;
				}
			}
			if (local847 == 4) {
				@Pc(1010) short local1010 = local833;
				local833 = local835;
				local835 = local1010;
				local837 = (short) (local10.method5020() + local839);
				this.aShortArray69[local841] = local833;
				local839 = local837;
				this.aShortArray71[local841] = local1010;
				this.aShortArray73[local841] = local837;
				if (local837 > this.anInt4013) {
					this.anInt4013 = local837;
				}
			}
		}
		this.anInt4013++;
		local10.anInt6207 = local355;
		local15.anInt6207 = local363;
		local20.anInt6207 = local381;
		local25.anInt6207 = local389;
		local30.anInt6207 = local395;
		local35.anInt6207 = local401;
		@Pc(1085) int local1085;
		for (local847 = 0; local847 < this.anInt4016; local847++) {
			local1085 = this.aByteArray48[local847] & 0xFF;
			if (local1085 == 0) {
				this.aShortArray72[local847] = (short) local10.method5028();
				this.aShortArray75[local847] = (short) local10.method5028();
				this.aShortArray67[local847] = (short) local10.method5028();
			}
			if (local1085 == 1) {
				this.aShortArray72[local847] = (short) local15.method5028();
				this.aShortArray75[local847] = (short) local15.method5028();
				this.aShortArray67[local847] = (short) local15.method5028();
				this.anIntArray325[local847] = local20.method5028();
				if (this.anInt4010 < 14) {
					this.anIntArray328[local847] = local20.method5028();
				} else {
					this.anIntArray328[local847] = local20.method5008();
				}
				this.anIntArray327[local847] = local20.method5028();
				this.aByteArray49[local847] = local25.method5063();
				this.aByteArray53[local847] = local30.method5063();
				this.anIntArray331[local847] = local35.method5063();
			}
			if (local1085 == 2) {
				this.aShortArray72[local847] = (short) local15.method5028();
				this.aShortArray75[local847] = (short) local15.method5028();
				this.aShortArray67[local847] = (short) local15.method5028();
				this.anIntArray325[local847] = local20.method5028();
				if (this.anInt4010 < 14) {
					this.anIntArray328[local847] = local20.method5028();
				} else {
					this.anIntArray328[local847] = local20.method5008();
				}
				this.anIntArray327[local847] = local20.method5028();
				this.aByteArray49[local847] = local25.method5063();
				this.aByteArray53[local847] = local30.method5063();
				this.anIntArray331[local847] = local35.method5063();
				this.anIntArray335[local847] = local35.method5063();
				this.anIntArray333[local847] = local35.method5063();
			}
			if (local1085 == 3) {
				this.aShortArray72[local847] = (short) local15.method5028();
				this.aShortArray75[local847] = (short) local15.method5028();
				this.aShortArray67[local847] = (short) local15.method5028();
				this.anIntArray325[local847] = local20.method5028();
				if (this.anInt4010 >= 14) {
					this.anIntArray328[local847] = local20.method5008();
				} else {
					this.anIntArray328[local847] = local20.method5028();
				}
				this.anIntArray327[local847] = local20.method5028();
				this.aByteArray49[local847] = local25.method5063();
				this.aByteArray53[local847] = local30.method5063();
				this.anIntArray331[local847] = local35.method5063();
			}
		}
		local10.anInt6207 = local186;
		@Pc(1419) int local1419;
		@Pc(1425) int local1425;
		@Pc(1429) int local1429;
		@Pc(1489) int local1489;
		if (local85) {
			local1085 = local10.method5007();
			if (local1085 > 0) {
				this.aClass76Array4 = new Class76[local1085];
				for (local1419 = 0; local1419 < local1085; local1419++) {
					local1425 = local10.method5028();
					local1429 = local10.method5028();
					@Pc(1437) byte local1437;
					if (local128 == 255) {
						local1437 = this.aByteArray52[local1429];
					} else {
						local1437 = (byte) local128;
					}
					this.aClass76Array4[local1419] = new Class76(local1425, this.aShortArray69[local1429], this.aShortArray71[local1429], this.aShortArray73[local1429], local1437);
				}
			}
			local1419 = local10.method5007();
			if (local1419 > 0) {
				this.aClass88Array4 = new Class88[local1419];
				for (local1425 = 0; local1425 < local1419; local1425++) {
					local1429 = local10.method5028();
					local1489 = local10.method5028();
					this.aClass88Array4[local1425] = new Class88(local1429, local1489);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1085 = local10.method5007();
		if (local1085 <= 0) {
			return;
		}
		this.aClass254Array1 = new Class254[local1085];
		for (local1419 = 0; local1419 < local1085; local1419++) {
			local1425 = local10.method5028();
			local1429 = local10.method5028();
			local1489 = local10.method5007();
			@Pc(1534) byte local1534 = local10.method5063();
			this.aClass254Array1[local1419] = new Class254(local1425, local1429, local1489, local1534);
		}
		return;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIB)V")
	public void method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class100.anIntArray206[arg2];
			local14 = Class100.anIntArray208[arg2];
			for (local16 = 0; local16 < this.anInt4011; local16++) {
				local34 = this.anIntArray324[local16] * local14 + local10 * this.anIntArray326[local16] >> 15;
				this.anIntArray326[local16] = this.anIntArray326[local16] * local14 - local10 * this.anIntArray324[local16] >> 15;
				this.anIntArray324[local16] = local34;
			}
		}
		if (arg1 != 0) {
			local10 = Class100.anIntArray206[arg1];
			local14 = Class100.anIntArray208[arg1];
			for (local16 = 0; local16 < this.anInt4011; local16++) {
				local34 = this.anIntArray326[local16] * local14 - local10 * this.anIntArray329[local16] >> 15;
				this.anIntArray329[local16] = this.anIntArray326[local16] * local10 + this.anIntArray329[local16] * local14 >> 15;
				this.anIntArray326[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class100.anIntArray206[arg0];
		local14 = Class100.anIntArray208[arg0];
		for (local16 = 0; local16 < this.anInt4011; local16++) {
			local34 = local10 * this.anIntArray329[local16] + this.anIntArray324[local16] * local14 >> 15;
			this.anIntArray329[local16] = local14 * this.anIntArray329[local16] - local10 * this.anIntArray324[local16] >> 15;
			this.anIntArray324[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)I")
	public int method3198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4011; local7++) {
			if (this.anIntArray324[local7] == arg2 && arg0 == this.anIntArray326[local7] && arg1 == this.anIntArray329[local7]) {
				return local7;
			}
		}
		this.anIntArray324[this.anInt4011] = arg2;
		this.anIntArray326[this.anInt4011] = arg0;
		this.anIntArray329[this.anInt4011] = arg1;
		this.anInt4013 = this.anInt4011 + 1;
		return this.anInt4011++;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(SSBSBSBSIS)B")
	public byte method3199() {
		if (this.anInt4016 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray48[this.anInt4016] = 3;
		this.aShortArray72[this.anInt4016] = 0;
		this.aShortArray75[this.anInt4016] = 32767;
		this.aShortArray67[this.anInt4016] = 0;
		this.anIntArray325[this.anInt4016] = 1024;
		this.anIntArray328[this.anInt4016] = 1024;
		this.anIntArray327[this.anInt4016] = 1024;
		this.aByteArray49[this.anInt4016] = 0;
		this.aByteArray53[this.anInt4016] = 0;
		this.anIntArray331[this.anInt4016] = 0;
		return (byte) this.anInt4016++;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)[[I")
	public int[][] method3200() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass254Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass254Array1[local12].anInt7066;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(66) int[][] local66 = new int[local10 + 1][];
		for (@Pc(68) int local68 = 0; local68 <= local10; local68++) {
			local66[local68] = new int[local8[local68]];
			local8[local68] = 0;
		}
		for (@Pc(91) int local91 = 0; local91 < this.aClass254Array1.length; local91++) {
			@Pc(99) int local99 = this.aClass254Array1[local91].anInt7066;
			if (local99 >= 0) {
				local66[local99][local8[local99]++] = local91;
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBBISSBI)I")
	public int method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) short arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray69[this.anInt4024] = (short) arg1;
		this.aShortArray71[this.anInt4024] = (short) arg0;
		this.aShortArray73[this.anInt4024] = (short) arg7;
		this.aByteArray54[this.anInt4024] = arg3;
		this.aByteArray50[this.anInt4024] = arg6;
		this.aShortArray68[this.anInt4024] = arg4;
		this.aByteArray51[this.anInt4024] = arg2;
		this.aShortArray74[this.anInt4024] = arg5;
		return this.anInt4024++;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mb;BS)I")
	private int method3202(@OriginalArg(0) int arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray324[arg0];
		@Pc(15) int local15 = arg1.anIntArray326[arg0];
		@Pc(28) int local28 = arg1.anIntArray329[arg0];
		for (@Pc(30) int local30 = 0; local30 < this.anInt4011; local30++) {
			if (this.anIntArray324[local30] == local10 && local15 == this.anIntArray326[local30] && local28 == this.anIntArray329[local30]) {
				this.aShortArray66[local30] |= arg2;
				return local30;
			}
		}
		this.anIntArray324[this.anInt4011] = local10;
		this.anIntArray326[this.anInt4011] = local15;
		this.anIntArray329[this.anInt4011] = local28;
		this.aShortArray66[this.anInt4011] = arg2;
		this.anIntArray332[this.anInt4011] = arg1.anIntArray332 == null ? -1 : arg1.anIntArray332[arg0];
		return this.anInt4011++;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method3203() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4011; local7++) {
			this.anIntArray324[local7] <<= 0x0;
			this.anIntArray326[local7] <<= 0x0;
			this.anIntArray329[local7] <<= 0x0;
		}
		if (this.anInt4016 <= 0 || this.anIntArray325 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray325.length; local57++) {
			this.anIntArray325[local57] <<= 0x0;
			this.anIntArray328[local57] <<= 0x0;
			if (this.aByteArray48[local57] != 1) {
				this.anIntArray327[local57] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIII)V")
	public void method3204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4011; local3++) {
			this.anIntArray324[local3] += arg1;
			this.anIntArray326[local3] += arg2;
			this.anIntArray329[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[B)V")
	private void method3205(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		@Pc(19) Class4_Sub9 local19 = new Class4_Sub9(arg0);
		@Pc(24) Class4_Sub9 local24 = new Class4_Sub9(arg0);
		@Pc(29) Class4_Sub9 local29 = new Class4_Sub9(arg0);
		@Pc(34) Class4_Sub9 local34 = new Class4_Sub9(arg0);
		local14.anInt6207 = arg0.length - 18;
		this.anInt4011 = local14.method5028();
		this.anInt4024 = local14.method5028();
		this.anInt4016 = local14.method5007();
		@Pc(59) int local59 = local14.method5007();
		@Pc(63) int local63 = local14.method5007();
		@Pc(67) int local67 = local14.method5007();
		@Pc(71) int local71 = local14.method5007();
		@Pc(75) int local75 = local14.method5007();
		@Pc(79) int local79 = local14.method5028();
		@Pc(90) int local90 = local14.method5028();
		@Pc(94) int local94 = local14.method5028();
		@Pc(98) int local98 = local14.method5028();
		@Pc(107) int local107 = this.anInt4011;
		@Pc(109) int local109 = local107;
		local107 += this.anInt4024;
		@Pc(116) int local116 = local107;
		if (local63 == 255) {
			local107 += this.anInt4024;
		}
		@Pc(126) int local126 = local107;
		if (local71 == 1) {
			local107 += this.anInt4024;
		}
		@Pc(138) int local138 = local107;
		if (local59 == 1) {
			local107 += this.anInt4024;
		}
		@Pc(150) int local150 = local107;
		if (local75 == 1) {
			local107 += this.anInt4011;
		}
		@Pc(160) int local160 = local107;
		if (local67 == 1) {
			local107 += this.anInt4024;
		}
		@Pc(170) int local170 = local107;
		local107 += local98;
		@Pc(176) int local176 = local107;
		local107 += this.anInt4024 * 2;
		@Pc(185) int local185 = local107;
		local107 += this.anInt4016 * 6;
		@Pc(194) int local194 = local107;
		local107 += local79;
		@Pc(200) int local200 = local107;
		local107 += local90;
		this.aShortArray73 = new short[this.anInt4024];
		this.aShortArray71 = new short[this.anInt4024];
		this.anIntArray324 = new int[this.anInt4011];
		if (local63 == 255) {
			this.aByteArray52 = new byte[this.anInt4024];
		} else {
			this.aByte71 = (byte) local63;
		}
		local14.anInt6207 = 0;
		if (local59 == 1) {
			this.aByteArray50 = new byte[this.anInt4024];
			this.aShortArray74 = new short[this.anInt4024];
			this.aByteArray54 = new byte[this.anInt4024];
		}
		if (local71 == 1) {
			this.anIntArray330 = new int[this.anInt4024];
		}
		this.anIntArray326 = new int[this.anInt4011];
		if (local75 == 1) {
			this.anIntArray332 = new int[this.anInt4011];
		}
		if (this.anInt4016 > 0) {
			this.aShortArray72 = new short[this.anInt4016];
			this.aByteArray48 = new byte[this.anInt4016];
			this.aShortArray67 = new short[this.anInt4016];
			this.aShortArray75 = new short[this.anInt4016];
		}
		this.aShortArray69 = new short[this.anInt4024];
		this.anIntArray329 = new int[this.anInt4011];
		this.aShortArray68 = new short[this.anInt4024];
		if (local67 == 1) {
			this.aByteArray51 = new byte[this.anInt4024];
		}
		local19.anInt6207 = local194;
		local24.anInt6207 = local200;
		local29.anInt6207 = local107;
		local34.anInt6207 = local150;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(360) int local360;
		@Pc(362) int local362;
		for (@Pc(354) int local354 = 0; local354 < this.anInt4011; local354++) {
			local360 = local14.method5007();
			local362 = 0;
			if ((local360 & 0x1) != 0) {
				local362 = local19.method5020();
			}
			@Pc(375) int local375 = 0;
			if ((local360 & 0x2) != 0) {
				local375 = local24.method5020();
			}
			@Pc(385) int local385 = 0;
			if ((local360 & 0x4) != 0) {
				local385 = local29.method5020();
			}
			this.anIntArray324[local354] = local362 + local348;
			this.anIntArray326[local354] = local375 + local350;
			this.anIntArray329[local354] = local385 + local352;
			local348 = this.anIntArray324[local354];
			local352 = this.anIntArray329[local354];
			local350 = this.anIntArray326[local354];
			if (local75 == 1) {
				this.anIntArray332[local354] = local34.method5007();
			}
		}
		local14.anInt6207 = local176;
		local19.anInt6207 = local138;
		local24.anInt6207 = local116;
		local29.anInt6207 = local160;
		local34.anInt6207 = local126;
		for (local360 = 0; local360 < this.anInt4024; local360++) {
			this.aShortArray68[local360] = (short) local14.method5028();
			if (local59 == 1) {
				local362 = local19.method5007();
				if ((local362 & 0x1) == 1) {
					local7 = true;
					this.aByteArray54[local360] = 1;
				} else {
					this.aByteArray54[local360] = 0;
				}
				if ((local362 & 0x2) == 2) {
					this.aByteArray50[local360] = (byte) (local362 >> 2);
					this.aShortArray74[local360] = this.aShortArray68[local360];
					this.aShortArray68[local360] = 127;
					if (this.aShortArray74[local360] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray50[local360] = -1;
					this.aShortArray74[local360] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray52[local360] = local24.method5063();
			}
			if (local67 == 1) {
				this.aByteArray51[local360] = local29.method5063();
			}
			if (local71 == 1) {
				this.anIntArray330[local360] = local34.method5007();
			}
		}
		local14.anInt6207 = local170;
		this.anInt4013 = -1;
		local19.anInt6207 = local109;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(618) short local618 = 0;
		@Pc(620) short local620 = 0;
		@Pc(628) int local628;
		for (@Pc(622) int local622 = 0; local622 < this.anInt4024; local622++) {
			local628 = local19.method5007();
			if (local628 == 1) {
				local614 = (short) (local620 + local14.method5020());
				local616 = (short) (local14.method5020() + local614);
				local618 = (short) (local14.method5020() + local616);
				this.aShortArray69[local622] = local614;
				local620 = local618;
				this.aShortArray71[local622] = local616;
				this.aShortArray73[local622] = local618;
				if (local614 > this.anInt4013) {
					this.anInt4013 = local614;
				}
				if (this.anInt4013 < local616) {
					this.anInt4013 = local616;
				}
				if (local618 > this.anInt4013) {
					this.anInt4013 = local618;
				}
			}
			if (local628 == 2) {
				local616 = local618;
				local618 = (short) (local620 + local14.method5020());
				this.aShortArray69[local622] = local614;
				local620 = local618;
				this.aShortArray71[local622] = local616;
				this.aShortArray73[local622] = local618;
				if (local618 > this.anInt4013) {
					this.anInt4013 = local618;
				}
			}
			if (local628 == 3) {
				local614 = local618;
				local618 = (short) (local620 + local14.method5020());
				local620 = local618;
				this.aShortArray69[local622] = local614;
				this.aShortArray71[local622] = local616;
				this.aShortArray73[local622] = local618;
				if (this.anInt4013 < local618) {
					this.anInt4013 = local618;
				}
			}
			if (local628 == 4) {
				@Pc(787) short local787 = local614;
				local614 = local616;
				local616 = local787;
				local618 = (short) (local14.method5020() + local620);
				this.aShortArray69[local622] = local614;
				local620 = local618;
				this.aShortArray71[local622] = local787;
				this.aShortArray73[local622] = local618;
				if (local618 > this.anInt4013) {
					this.anInt4013 = local618;
				}
			}
		}
		this.anInt4013++;
		local14.anInt6207 = local185;
		for (local628 = 0; local628 < this.anInt4016; local628++) {
			this.aByteArray48[local628] = 0;
			this.aShortArray72[local628] = (short) local14.method5028();
			this.aShortArray75[local628] = (short) local14.method5028();
			this.aShortArray67[local628] = (short) local14.method5028();
		}
		if (this.aByteArray50 != null) {
			@Pc(883) boolean local883 = false;
			for (@Pc(885) int local885 = 0; local885 < this.anInt4024; local885++) {
				@Pc(894) int local894 = this.aByteArray50[local885] & 0xFF;
				if (local894 != 255) {
					if (this.aShortArray69[local885] == (this.aShortArray72[local894] & 0xFFFF) && this.aShortArray71[local885] == (this.aShortArray75[local894] & 0xFFFF) && (this.aShortArray67[local894] & 0xFFFF) == this.aShortArray73[local885]) {
						this.aByteArray50[local885] = -1;
					} else {
						local883 = true;
					}
				}
			}
			if (!local883) {
				this.aByteArray50 = null;
			}
		}
		if (!local7) {
			this.aByteArray54 = null;
		}
		if (!local9) {
			this.aShortArray74 = null;
		}
	}
}
