import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class238 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
	public int[] anIntArray717;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "[Lclient!qt;")
	public Class197[] aClass197Array3;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "[I")
	public int[] anIntArray718;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "[I")
	public int[] anIntArray719;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "[I")
	public int[] anIntArray720;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "[Lclient!am;")
	public Class12[] aClass12Array3;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "[I")
	public int[] anIntArray721;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!vn", name = "K", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!vn", name = "L", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "[S")
	public short[] aShortArray117;

	@OriginalMember(owner = "client!vn", name = "S", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!vn", name = "T", descriptor = "[S")
	public short[] aShortArray118;

	@OriginalMember(owner = "client!vn", name = "U", descriptor = "[S")
	public short[] aShortArray119;

	@OriginalMember(owner = "client!vn", name = "Y", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!vn", name = "Z", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "B")
	public byte aByte68 = 0;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	public int anInt6059 = 0;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
	public int anInt6062 = 0;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
	public int anInt6058 = 0;

	@OriginalMember(owner = "client!vn", name = "W", descriptor = "I")
	public int anInt6071 = 0;

	static {
		new Class169("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
	public Class238(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5222(arg0);
		} else {
			this.method5220(arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(III)V")
	public Class238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray719 = new int[arg0];
		this.aByteArray89 = new byte[arg1];
		this.aShortArray110 = new short[arg1];
		this.aByteArray88 = new byte[arg1];
		this.anIntArray721 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray92 = new byte[arg2];
			this.aShortArray119 = new short[arg2];
			this.aShortArray116 = new short[arg2];
			this.aByteArray90 = new byte[arg2];
			this.aShortArray112 = new short[arg2];
			this.aByteArray93 = new byte[arg2];
			this.aShortArray111 = new short[arg2];
			this.aByteArray94 = new byte[arg2];
			this.aShortArray114 = new short[arg2];
			this.aByteArray96 = new byte[arg2];
			this.aByteArray91 = new byte[arg2];
			this.aShortArray113 = new short[arg2];
		}
		this.aByteArray95 = new byte[arg1];
		this.anIntArray720 = new int[arg0];
		this.aByteArray87 = new byte[arg1];
		this.aShortArray109 = new short[arg1];
		this.aShortArray118 = new short[arg1];
		this.anIntArray718 = new int[arg1];
		this.anIntArray717 = new int[arg0];
		this.aShortArray120 = new short[arg1];
		this.aShortArray117 = new short[arg1];
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([Lclient!vn;I)V")
	public Class238(@OriginalArg(0) Class238[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6059 = 0;
		this.anInt6062 = 0;
		this.anInt6071 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte68 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class238 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt6059 += local54.anInt6059;
				this.anInt6071 += local54.anInt6071;
				this.anInt6062 += local54.anInt6062;
				if (local54.aClass12Array3 != null) {
					local31 += local54.aClass12Array3.length;
				}
				if (local54.aClass197Array3 != null) {
					local29 += local54.aClass197Array3.length;
				}
				local33 |= local54.aByteArray87 != null;
				local39 |= local54.aByteArray88 != null;
				if (local54.aByteArray89 == null) {
					if (this.aByte68 == -1) {
						this.aByte68 = local54.aByte68;
					}
					if (this.aByte68 != local54.aByte68) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray117 != null;
				local37 |= local54.aByteArray95 != null;
				local46 |= local54.anIntArray718 != null;
			}
		}
		this.aShortArray109 = new short[this.anInt6071];
		this.aShortArray108 = new short[this.anInt6059];
		if (local33) {
			this.aByteArray87 = new byte[this.anInt6071];
		}
		this.aShortArray120 = new short[this.anInt6071];
		if (local39) {
			this.aByteArray88 = new byte[this.anInt6071];
		}
		if (local31 > 0) {
			this.aClass12Array3 = new Class12[local31];
		}
		if (local46) {
			this.anIntArray718 = new int[this.anInt6071];
		}
		this.anIntArray717 = new int[this.anInt6059];
		if (this.anInt6062 > 0) {
			this.aByteArray93 = new byte[this.anInt6062];
			this.aShortArray113 = new short[this.anInt6062];
			this.aByteArray94 = new byte[this.anInt6062];
			this.aShortArray119 = new short[this.anInt6062];
			this.aShortArray111 = new short[this.anInt6062];
			this.aShortArray112 = new short[this.anInt6062];
			this.aShortArray114 = new short[this.anInt6062];
			this.aByteArray92 = new byte[this.anInt6062];
			this.aShortArray116 = new short[this.anInt6062];
			this.aByteArray90 = new byte[this.anInt6062];
			this.aByteArray91 = new byte[this.anInt6062];
			this.aByteArray96 = new byte[this.anInt6062];
		}
		this.anIntArray720 = new int[this.anInt6059];
		this.anIntArray721 = new int[this.anInt6059];
		this.aShortArray110 = new short[this.anInt6071];
		if (local35) {
			this.aByteArray89 = new byte[this.anInt6071];
		}
		if (local41) {
			this.aShortArray117 = new short[this.anInt6071];
		}
		this.aShortArray118 = new short[this.anInt6071];
		if (local37) {
			this.aByteArray95 = new byte[this.anInt6071];
		}
		if (local29 > 0) {
			this.aClass197Array3 = new Class197[local29];
		}
		this.anIntArray719 = new int[this.anInt6059];
		this.aShortArray115 = new short[this.anInt6071];
		this.anInt6059 = 0;
		this.anInt6071 = 0;
		this.anInt6062 = 0;
		local29 = 0;
		local31 = 0;
		@Pc(559) int local559;
		@Pc(570) int local570;
		for (@Pc(354) int local354 = 0; local354 < arg1; local354++) {
			@Pc(361) short local361 = (short) (0x1 << local354);
			@Pc(365) Class238 local365 = arg0[local354];
			if (local365 != null) {
				for (@Pc(369) int local369 = 0; local369 < local365.anInt6071; local369++) {
					if (local33 && local365.aByteArray87 != null) {
						this.aByteArray87[this.anInt6071] = local365.aByteArray87[local369];
					}
					if (local35) {
						if (local365.aByteArray89 == null) {
							this.aByteArray89[this.anInt6071] = local365.aByte68;
						} else {
							this.aByteArray89[this.anInt6071] = local365.aByteArray89[local369];
						}
					}
					if (local37 && local365.aByteArray95 != null) {
						this.aByteArray95[this.anInt6071] = local365.aByteArray95[local369];
					}
					if (local41) {
						if (local365.aShortArray117 == null) {
							this.aShortArray117[this.anInt6071] = -1;
						} else {
							this.aShortArray117[this.anInt6071] = local365.aShortArray117[local369];
						}
					}
					if (local46) {
						if (local365.anIntArray718 == null) {
							this.anIntArray718[this.anInt6071] = -1;
						} else {
							this.anIntArray718[this.anInt6071] = local365.anIntArray718[local369];
						}
					}
					this.aShortArray118[this.anInt6071] = (short) this.method5215(local365.aShortArray118[local369], local365, local361);
					this.aShortArray120[this.anInt6071] = (short) this.method5215(local365.aShortArray120[local369], local365, local361);
					this.aShortArray110[this.anInt6071] = (short) this.method5215(local365.aShortArray110[local369], local365, local361);
					this.aShortArray115[this.anInt6071] = local361;
					this.aShortArray109[this.anInt6071] = local365.aShortArray109[local369];
					this.anInt6071++;
				}
				@Pc(546) int local546;
				if (local365.aClass197Array3 != null) {
					for (local546 = 0; local546 < local365.aClass197Array3.length; local546++) {
						local559 = this.method5215(local365.aClass197Array3[local546].anInt5076, local365, local361);
						local570 = this.method5215(local365.aClass197Array3[local546].anInt5074, local365, local361);
						@Pc(581) int local581 = this.method5215(local365.aClass197Array3[local546].anInt5069, local365, local361);
						this.aClass197Array3[local29] = new Class197(local365.aClass197Array3[local546].anInt5068, local559, local570, local581, local365.aClass197Array3[local546].aByte63);
						local29++;
					}
				}
				if (local365.aClass12Array3 != null) {
					for (local546 = 0; local546 < local365.aClass12Array3.length; local546++) {
						local559 = this.method5215(local365.aClass12Array3[local546].anInt186, local365, local361);
						this.aClass12Array3[local31] = new Class12(local365.aClass12Array3[local546].anInt187, local559);
						local31++;
					}
				}
			}
		}
		this.anInt6058 = this.anInt6059;
		@Pc(660) int local660 = 0;
		for (@Pc(662) int local662 = 0; local662 < arg1; local662++) {
			@Pc(669) short local669 = (short) (0x1 << local662);
			@Pc(673) Class238 local673 = arg0[local662];
			if (local673 != null) {
				for (local559 = 0; local559 < local673.anInt6071; local559++) {
					if (local39) {
						this.aByteArray88[local660++] = (byte) (local673.aByteArray88 == null || local673.aByteArray88[local559] == -1 ? -1 : local673.aByteArray88[local559] + this.anInt6062);
					}
				}
				for (local570 = 0; local570 < local673.anInt6062; local570++) {
					@Pc(729) byte local729 = this.aByteArray92[this.anInt6062] = local673.aByteArray92[local570];
					if (local729 == 0) {
						this.aShortArray112[this.anInt6062] = (short) this.method5215(local673.aShortArray112[local570], local673, local669);
						this.aShortArray114[this.anInt6062] = (short) this.method5215(local673.aShortArray114[local570], local673, local669);
						this.aShortArray116[this.anInt6062] = (short) this.method5215(local673.aShortArray116[local570], local673, local669);
					}
					if (local729 >= 1 && local729 <= 3) {
						this.aShortArray112[this.anInt6062] = local673.aShortArray112[local570];
						this.aShortArray114[this.anInt6062] = local673.aShortArray114[local570];
						this.aShortArray116[this.anInt6062] = local673.aShortArray116[local570];
						this.aShortArray113[this.anInt6062] = local673.aShortArray113[local570];
						this.aShortArray119[this.anInt6062] = local673.aShortArray119[local570];
						this.aShortArray111[this.anInt6062] = local673.aShortArray111[local570];
						this.aByteArray93[this.anInt6062] = local673.aByteArray93[local570];
						this.aByteArray90[this.anInt6062] = local673.aByteArray90[local570];
						this.aByteArray96[this.anInt6062] = local673.aByteArray96[local570];
					}
					if (local729 == 2) {
						this.aByteArray91[this.anInt6062] = local673.aByteArray91[local570];
						this.aByteArray94[this.anInt6062] = local673.aByteArray94[local570];
					}
					this.anInt6062++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(SIS)V")
	public void method5213(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6071; local3++) {
			if (this.aShortArray109[local3] == arg0) {
				this.aShortArray109[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BSBISIBII)I")
	public int method5214(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray118[this.anInt6071] = (short) arg6;
		this.aShortArray120[this.anInt6071] = (short) arg7;
		this.aShortArray110[this.anInt6071] = (short) arg3;
		this.aByteArray87[this.anInt6071] = arg2;
		this.aByteArray88[this.anInt6071] = arg0;
		this.aShortArray109[this.anInt6071] = arg4;
		this.aByteArray95[this.anInt6071] = arg5;
		this.aShortArray117[this.anInt6071] = arg1;
		return this.anInt6071++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!vn;IS)I")
	private int method5215(@OriginalArg(0) int arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray717[arg0];
		@Pc(15) int local15 = arg1.anIntArray721[arg0];
		@Pc(20) int local20 = arg1.anIntArray720[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6059; local22++) {
			if (this.anIntArray717[local22] == local10 && local15 == this.anIntArray721[local22] && local20 == this.anIntArray720[local22]) {
				this.aShortArray108[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray717[this.anInt6059] = local10;
		this.anIntArray721[this.anInt6059] = local15;
		this.anIntArray720[this.anInt6059] = local20;
		this.aShortArray108[this.anInt6059] = arg2;
		this.anIntArray719[this.anInt6059] = arg1.anIntArray719 == null ? -1 : arg1.anIntArray719[arg0];
		return this.anInt6059++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)[[I")
	public int[][] method5216() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6058; local12++) {
			@Pc(19) int local19 = this.anIntArray719[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local50[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < this.anInt6058; local84++) {
			@Pc(91) int local91 = this.anIntArray719[local84];
			if (local91 >= 0) {
				local50[local91][local8[local91]++] = local84;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)V")
	public void method5219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6059; local7++) {
			this.anIntArray717[local7] += arg1;
			this.anIntArray721[local7] += arg0;
			this.anIntArray720[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BB)V")
	private void method5220(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub33 local14 = new Class1_Sub33(arg0);
		@Pc(19) Class1_Sub33 local19 = new Class1_Sub33(arg0);
		@Pc(24) Class1_Sub33 local24 = new Class1_Sub33(arg0);
		@Pc(29) Class1_Sub33 local29 = new Class1_Sub33(arg0);
		@Pc(34) Class1_Sub33 local34 = new Class1_Sub33(arg0);
		local14.lb = arg0.length - 18;
		this.anInt6059 = local14.method5177();
		this.anInt6071 = local14.method5177();
		this.anInt6062 = local14.method5174();
		@Pc(59) int local59 = local14.method5174();
		@Pc(63) int local63 = local14.method5174();
		@Pc(67) int local67 = local14.method5174();
		@Pc(71) int local71 = local14.method5174();
		@Pc(77) int local77 = local14.method5174();
		@Pc(83) int local83 = local14.method5177();
		@Pc(87) int local87 = local14.method5177();
		@Pc(93) int local93 = local14.method5177();
		@Pc(97) int local97 = local14.method5177();
		@Pc(106) int local106 = this.anInt6059;
		@Pc(108) int local108 = local106;
		local106 += this.anInt6071;
		@Pc(121) int local121 = local106;
		if (local63 == 255) {
			local106 += this.anInt6071;
		}
		@Pc(133) int local133 = local106;
		if (local71 == 1) {
			local106 += this.anInt6071;
		}
		@Pc(143) int local143 = local106;
		if (local59 == 1) {
			local106 += this.anInt6071;
		}
		@Pc(155) int local155 = local106;
		if (local77 == 1) {
			local106 += this.anInt6059;
		}
		@Pc(167) int local167 = local106;
		if (local67 == 1) {
			local106 += this.anInt6071;
		}
		@Pc(177) int local177 = local106;
		local106 += local97;
		@Pc(183) int local183 = local106;
		local106 += this.anInt6071 * 2;
		@Pc(192) int local192 = local106;
		local106 += this.anInt6062 * 6;
		@Pc(201) int local201 = local106;
		local106 += local83;
		@Pc(207) int local207 = local106;
		local106 += local87;
		this.anIntArray720 = new int[this.anInt6059];
		this.anIntArray717 = new int[this.anInt6059];
		if (local71 == 1) {
			this.anIntArray718 = new int[this.anInt6071];
		}
		if (local67 == 1) {
			this.aByteArray95 = new byte[this.anInt6071];
		}
		if (local77 == 1) {
			this.anIntArray719 = new int[this.anInt6059];
		}
		this.aShortArray118 = new short[this.anInt6071];
		if (this.anInt6062 > 0) {
			this.aShortArray112 = new short[this.anInt6062];
			this.aShortArray114 = new short[this.anInt6062];
			this.aByteArray92 = new byte[this.anInt6062];
			this.aShortArray116 = new short[this.anInt6062];
		}
		local14.lb = 0;
		if (local59 == 1) {
			this.aByteArray87 = new byte[this.anInt6071];
			this.aByteArray88 = new byte[this.anInt6071];
			this.aShortArray117 = new short[this.anInt6071];
		}
		this.aShortArray109 = new short[this.anInt6071];
		this.anIntArray721 = new int[this.anInt6059];
		this.aShortArray110 = new short[this.anInt6071];
		this.aShortArray120 = new short[this.anInt6071];
		if (local63 == 255) {
			this.aByteArray89 = new byte[this.anInt6071];
		} else {
			this.aByte68 = (byte) local63;
		}
		local19.lb = local201;
		local24.lb = local207;
		local29.lb = local106;
		local34.lb = local155;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(363) int local363;
		@Pc(365) int local365;
		for (@Pc(357) int local357 = 0; local357 < this.anInt6059; local357++) {
			local363 = local14.method5174();
			local365 = 0;
			if ((local363 & 0x1) != 0) {
				local365 = local19.method5136();
			}
			@Pc(378) int local378 = 0;
			if ((local363 & 0x2) != 0) {
				local378 = local24.method5136();
			}
			@Pc(388) int local388 = 0;
			if ((local363 & 0x4) != 0) {
				local388 = local29.method5136();
			}
			this.anIntArray717[local357] = local351 + local365;
			this.anIntArray721[local357] = local378 + local353;
			this.anIntArray720[local357] = local355 + local388;
			local351 = this.anIntArray717[local357];
			local353 = this.anIntArray721[local357];
			local355 = this.anIntArray720[local357];
			if (local77 == 1) {
				this.anIntArray719[local357] = local34.method5174();
			}
		}
		local14.lb = local183;
		local19.lb = local143;
		local24.lb = local121;
		local29.lb = local167;
		local34.lb = local133;
		for (local363 = 0; local363 < this.anInt6071; local363++) {
			this.aShortArray109[local363] = (short) local14.method5177();
			if (local59 == 1) {
				local365 = local19.method5174();
				if ((local365 & 0x1) == 1) {
					local7 = true;
					this.aByteArray87[local363] = 1;
				} else {
					this.aByteArray87[local363] = 0;
				}
				if ((local365 & 0x2) == 2) {
					this.aByteArray88[local363] = (byte) (local365 >> 2);
					this.aShortArray117[local363] = this.aShortArray109[local363];
					this.aShortArray109[local363] = 127;
					if (this.aShortArray117[local363] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray88[local363] = -1;
					this.aShortArray117[local363] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray89[local363] = local24.method5188();
			}
			if (local67 == 1) {
				this.aByteArray95[local363] = local29.method5188();
			}
			if (local71 == 1) {
				this.anIntArray718[local363] = local34.method5174();
			}
		}
		this.anInt6058 = -1;
		local14.lb = local177;
		local19.lb = local108;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(613) short local613 = 0;
		@Pc(621) int local621;
		for (@Pc(615) int local615 = 0; local615 < this.anInt6071; local615++) {
			local621 = local19.method5174();
			if (local621 == 1) {
				local607 = (short) (local14.method5136() + local613);
				local609 = (short) (local14.method5136() + local607);
				local611 = (short) (local609 + local14.method5136());
				local613 = local611;
				this.aShortArray118[local615] = local607;
				this.aShortArray120[local615] = local609;
				this.aShortArray110[local615] = local611;
				if (this.anInt6058 < local607) {
					this.anInt6058 = local607;
				}
				if (local609 > this.anInt6058) {
					this.anInt6058 = local609;
				}
				if (this.anInt6058 < local611) {
					this.anInt6058 = local611;
				}
			}
			if (local621 == 2) {
				local609 = local611;
				local611 = (short) (local14.method5136() + local613);
				local613 = local611;
				this.aShortArray118[local615] = local607;
				this.aShortArray120[local615] = local609;
				this.aShortArray110[local615] = local611;
				if (local611 > this.anInt6058) {
					this.anInt6058 = local611;
				}
			}
			if (local621 == 3) {
				local607 = local611;
				local611 = (short) (local14.method5136() + local613);
				this.aShortArray118[local615] = local607;
				local613 = local611;
				this.aShortArray120[local615] = local609;
				this.aShortArray110[local615] = local611;
				if (local611 > this.anInt6058) {
					this.anInt6058 = local611;
				}
			}
			if (local621 == 4) {
				@Pc(786) short local786 = local607;
				local607 = local609;
				local609 = local786;
				local611 = (short) (local14.method5136() + local613);
				this.aShortArray118[local615] = local607;
				local613 = local611;
				this.aShortArray120[local615] = local786;
				this.aShortArray110[local615] = local611;
				if (local611 > this.anInt6058) {
					this.anInt6058 = local611;
				}
			}
		}
		local14.lb = local192;
		this.anInt6058++;
		for (local621 = 0; local621 < this.anInt6062; local621++) {
			this.aByteArray92[local621] = 0;
			this.aShortArray112[local621] = (short) local14.method5177();
			this.aShortArray114[local621] = (short) local14.method5177();
			this.aShortArray116[local621] = (short) local14.method5177();
		}
		if (this.aByteArray88 != null) {
			@Pc(888) boolean local888 = false;
			for (@Pc(890) int local890 = 0; local890 < this.anInt6071; local890++) {
				@Pc(899) int local899 = this.aByteArray88[local890] & 0xFF;
				if (local899 != 255) {
					if (this.aShortArray118[local890] == (this.aShortArray112[local899] & 0xFFFF) && (this.aShortArray114[local899] & 0xFFFF) == this.aShortArray120[local890] && (this.aShortArray116[local899] & 0xFFFF) == this.aShortArray110[local890]) {
						this.aByteArray88[local890] = -1;
					} else {
						local888 = true;
					}
				}
			}
			if (!local888) {
				this.aByteArray88 = null;
			}
		}
		if (!local9) {
			this.aShortArray117 = null;
		}
		if (!local7) {
			this.aByteArray87 = null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIII)V")
	public void method5221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class13.anIntArray20[arg2];
			local14 = Class13.anIntArray21[arg2];
			for (local16 = 0; local16 < this.anInt6059; local16++) {
				local34 = local14 * this.anIntArray717[local16] + local10 * this.anIntArray721[local16] >> 15;
				this.anIntArray721[local16] = this.anIntArray721[local16] * local14 - this.anIntArray717[local16] * local10 >> 15;
				this.anIntArray717[local16] = local34;
			}
		}
		if (arg1 != 0) {
			local10 = Class13.anIntArray20[arg1];
			local14 = Class13.anIntArray21[arg1];
			for (local16 = 0; local16 < this.anInt6059; local16++) {
				local34 = local14 * this.anIntArray721[local16] - local10 * this.anIntArray720[local16] >> 15;
				this.anIntArray720[local16] = this.anIntArray720[local16] * local14 + local10 * this.anIntArray721[local16] >> 15;
				this.anIntArray721[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class13.anIntArray20[arg0];
		local14 = Class13.anIntArray21[arg0];
		for (local16 = 0; local16 < this.anInt6059; local16++) {
			local34 = local14 * this.anIntArray717[local16] + local10 * this.anIntArray720[local16] >> 15;
			this.anIntArray720[local16] = local14 * this.anIntArray720[local16] - this.anIntArray717[local16] * local10 >> 15;
			this.anIntArray717[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BI)V")
	private void method5222(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub33 local10 = new Class1_Sub33(arg0);
		@Pc(15) Class1_Sub33 local15 = new Class1_Sub33(arg0);
		@Pc(20) Class1_Sub33 local20 = new Class1_Sub33(arg0);
		@Pc(25) Class1_Sub33 local25 = new Class1_Sub33(arg0);
		@Pc(34) Class1_Sub33 local34 = new Class1_Sub33(arg0);
		@Pc(39) Class1_Sub33 local39 = new Class1_Sub33(arg0);
		@Pc(44) Class1_Sub33 local44 = new Class1_Sub33(arg0);
		local10.lb = arg0.length - 23;
		this.anInt6059 = local10.method5177();
		this.anInt6071 = local10.method5177();
		this.anInt6062 = local10.method5174();
		@Pc(69) int local69 = local10.method5174();
		@Pc(78) boolean local78 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(93) int local93 = local10.method5174();
		@Pc(97) int local97 = local10.method5174();
		@Pc(101) int local101 = local10.method5174();
		@Pc(105) int local105 = local10.method5174();
		@Pc(109) int local109 = local10.method5174();
		@Pc(113) int local113 = local10.method5177();
		@Pc(117) int local117 = local10.method5177();
		@Pc(121) int local121 = local10.method5177();
		@Pc(125) int local125 = local10.method5177();
		@Pc(129) int local129 = local10.method5177();
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(135) int local135 = 0;
		@Pc(151) int local151;
		if (this.anInt6062 > 0) {
			this.aByteArray92 = new byte[this.anInt6062];
			local10.lb = 0;
			for (local151 = 0; local151 < this.anInt6062; local151++) {
				@Pc(162) byte local162 = this.aByteArray92[local151] = local10.method5188();
				if (local162 == 0) {
					local131++;
				}
				if (local162 >= 1 && local162 <= 3) {
					local133++;
				}
				if (local162 == 2) {
					local135++;
				}
			}
		}
		local151 = this.anInt6062;
		@Pc(194) int local194 = local151;
		local151 += this.anInt6059;
		@Pc(201) int local201 = local151;
		if (local78) {
			local151 += this.anInt6071;
		}
		@Pc(210) int local210 = local151;
		local151 += this.anInt6071;
		@Pc(217) int local217 = local151;
		if (local93 == 255) {
			local151 += this.anInt6071;
		}
		@Pc(227) int local227 = local151;
		if (local101 == 1) {
			local151 += this.anInt6071;
		}
		@Pc(239) int local239 = local151;
		if (local109 == 1) {
			local151 += this.anInt6059;
		}
		@Pc(251) int local251 = local151;
		if (local97 == 1) {
			local151 += this.anInt6071;
		}
		@Pc(263) int local263 = local151;
		local151 += local125;
		@Pc(269) int local269 = local151;
		if (local105 == 1) {
			local151 += this.anInt6071 * 2;
		}
		@Pc(281) int local281 = local151;
		local151 += local129;
		@Pc(287) int local287 = local151;
		local151 += this.anInt6071 * 2;
		@Pc(296) int local296 = local151;
		local151 += local113;
		@Pc(302) int local302 = local151;
		local151 += local117;
		@Pc(308) int local308 = local151;
		local151 += local121;
		@Pc(314) int local314 = local151;
		local151 += local131 * 6;
		@Pc(322) int local322 = local151;
		local151 += local133 * 6;
		@Pc(330) int local330 = local151;
		local151 += local133 * 6;
		@Pc(338) int local338 = local151;
		local151 += local133;
		@Pc(344) int local344 = local151;
		local151 += local133;
		@Pc(350) int local350 = local151;
		local151 += local133 + local135 * 2;
		if (local105 == 1) {
			this.aShortArray117 = new short[this.anInt6071];
		}
		this.aShortArray120 = new short[this.anInt6071];
		this.anIntArray721 = new int[this.anInt6059];
		this.anIntArray717 = new int[this.anInt6059];
		this.aShortArray109 = new short[this.anInt6071];
		local10.lb = local194;
		if (local97 == 1) {
			this.aByteArray95 = new byte[this.anInt6071];
		}
		if (this.anInt6062 > 0) {
			this.aShortArray116 = new short[this.anInt6062];
			this.aShortArray112 = new short[this.anInt6062];
			if (local133 > 0) {
				this.aShortArray113 = new short[local133];
				this.aByteArray93 = new byte[local133];
				this.aByteArray90 = new byte[local133];
				this.aShortArray111 = new short[local133];
				this.aShortArray119 = new short[local133];
				this.aByteArray96 = new byte[local133];
			}
			if (local135 > 0) {
				this.aByteArray91 = new byte[local135];
				this.aByteArray94 = new byte[local135];
			}
			this.aShortArray114 = new short[this.anInt6062];
		}
		this.anIntArray720 = new int[this.anInt6059];
		if (local109 == 1) {
			this.anIntArray719 = new int[this.anInt6059];
		}
		this.aShortArray110 = new short[this.anInt6071];
		if (local105 == 1 && this.anInt6062 > 0) {
			this.aByteArray88 = new byte[this.anInt6071];
		}
		if (local101 == 1) {
			this.anIntArray718 = new int[this.anInt6071];
		}
		if (local93 == 255) {
			this.aByteArray89 = new byte[this.anInt6071];
		} else {
			this.aByte68 = (byte) local93;
		}
		this.aShortArray118 = new short[this.anInt6071];
		if (local78) {
			this.aByteArray87 = new byte[this.anInt6071];
		}
		local15.lb = local296;
		local20.lb = local302;
		local25.lb = local308;
		local34.lb = local239;
		@Pc(544) int local544 = 0;
		@Pc(546) int local546 = 0;
		@Pc(548) int local548 = 0;
		@Pc(556) int local556;
		for (@Pc(550) int local550 = 0; local550 < this.anInt6059; local550++) {
			local556 = local10.method5174();
			@Pc(558) int local558 = 0;
			if ((local556 & 0x1) != 0) {
				local558 = local15.method5136();
			}
			@Pc(571) int local571 = 0;
			if ((local556 & 0x2) != 0) {
				local571 = local20.method5136();
			}
			@Pc(584) int local584 = 0;
			if ((local556 & 0x4) != 0) {
				local584 = local25.method5136();
			}
			this.anIntArray717[local550] = local544 + local558;
			this.anIntArray721[local550] = local546 + local571;
			this.anIntArray720[local550] = local548 + local584;
			local548 = this.anIntArray720[local550];
			local544 = this.anIntArray717[local550];
			local546 = this.anIntArray721[local550];
			if (local109 == 1) {
				this.anIntArray719[local550] = local34.method5174();
			}
		}
		local10.lb = local287;
		local15.lb = local201;
		local20.lb = local217;
		local25.lb = local251;
		local34.lb = local227;
		local39.lb = local269;
		local44.lb = local281;
		for (local556 = 0; local556 < this.anInt6071; local556++) {
			this.aShortArray109[local556] = (short) local10.method5177();
			if (local78) {
				this.aByteArray87[local556] = local15.method5188();
			}
			if (local93 == 255) {
				this.aByteArray89[local556] = local20.method5188();
			}
			if (local97 == 1) {
				this.aByteArray95[local556] = local25.method5188();
			}
			if (local101 == 1) {
				this.anIntArray718[local556] = local34.method5174();
			}
			if (local105 == 1) {
				this.aShortArray117[local556] = (short) (local39.method5177() - 1);
			}
			if (this.aByteArray88 != null) {
				if (this.aShortArray117[local556] == -1) {
					this.aByteArray88[local556] = -1;
				} else {
					this.aByteArray88[local556] = (byte) (local44.method5174() - 1);
				}
			}
		}
		this.anInt6058 = -1;
		local10.lb = local263;
		local15.lb = local210;
		@Pc(788) short local788 = 0;
		@Pc(790) short local790 = 0;
		@Pc(792) short local792 = 0;
		@Pc(794) short local794 = 0;
		@Pc(802) int local802;
		for (@Pc(796) int local796 = 0; local796 < this.anInt6071; local796++) {
			local802 = local15.method5174();
			if (local802 == 1) {
				local788 = (short) (local794 + local10.method5136());
				local790 = (short) (local788 + local10.method5136());
				local792 = (short) (local10.method5136() + local790);
				this.aShortArray118[local796] = local788;
				local794 = local792;
				this.aShortArray120[local796] = local790;
				this.aShortArray110[local796] = local792;
				if (this.anInt6058 < local788) {
					this.anInt6058 = local788;
				}
				if (local790 > this.anInt6058) {
					this.anInt6058 = local790;
				}
				if (local792 > this.anInt6058) {
					this.anInt6058 = local792;
				}
			}
			if (local802 == 2) {
				local790 = local792;
				local792 = (short) (local794 + local10.method5136());
				this.aShortArray118[local796] = local788;
				local794 = local792;
				this.aShortArray120[local796] = local790;
				this.aShortArray110[local796] = local792;
				if (this.anInt6058 < local792) {
					this.anInt6058 = local792;
				}
			}
			if (local802 == 3) {
				local788 = local792;
				local792 = (short) (local10.method5136() + local794);
				this.aShortArray118[local796] = local788;
				local794 = local792;
				this.aShortArray120[local796] = local790;
				this.aShortArray110[local796] = local792;
				if (this.anInt6058 < local792) {
					this.anInt6058 = local792;
				}
			}
			if (local802 == 4) {
				@Pc(969) short local969 = local788;
				local788 = local790;
				local790 = local969;
				local792 = (short) (local794 + local10.method5136());
				local794 = local792;
				this.aShortArray118[local796] = local788;
				this.aShortArray120[local796] = local969;
				this.aShortArray110[local796] = local792;
				if (this.anInt6058 < local792) {
					this.anInt6058 = local792;
				}
			}
		}
		this.anInt6058++;
		local10.lb = local314;
		local15.lb = local322;
		local20.lb = local330;
		local25.lb = local338;
		local34.lb = local344;
		local39.lb = local350;
		@Pc(1044) int local1044;
		for (local802 = 0; local802 < this.anInt6062; local802++) {
			local1044 = this.aByteArray92[local802] & 0xFF;
			if (local1044 == 0) {
				this.aShortArray112[local802] = (short) local10.method5177();
				this.aShortArray114[local802] = (short) local10.method5177();
				this.aShortArray116[local802] = (short) local10.method5177();
			}
			if (local1044 == 1) {
				this.aShortArray112[local802] = (short) local15.method5177();
				this.aShortArray114[local802] = (short) local15.method5177();
				this.aShortArray116[local802] = (short) local15.method5177();
				this.aShortArray113[local802] = (short) local20.method5177();
				this.aShortArray119[local802] = (short) local20.method5177();
				this.aShortArray111[local802] = (short) local20.method5177();
				this.aByteArray93[local802] = local25.method5188();
				this.aByteArray90[local802] = local34.method5188();
				this.aByteArray96[local802] = local39.method5188();
			}
			if (local1044 == 2) {
				this.aShortArray112[local802] = (short) local15.method5177();
				this.aShortArray114[local802] = (short) local15.method5177();
				this.aShortArray116[local802] = (short) local15.method5177();
				this.aShortArray113[local802] = (short) local20.method5177();
				this.aShortArray119[local802] = (short) local20.method5177();
				this.aShortArray111[local802] = (short) local20.method5177();
				this.aByteArray93[local802] = local25.method5188();
				this.aByteArray90[local802] = local34.method5188();
				this.aByteArray96[local802] = local39.method5188();
				this.aByteArray91[local802] = local39.method5188();
				this.aByteArray94[local802] = local39.method5188();
			}
			if (local1044 == 3) {
				this.aShortArray112[local802] = (short) local15.method5177();
				this.aShortArray114[local802] = (short) local15.method5177();
				this.aShortArray116[local802] = (short) local15.method5177();
				this.aShortArray113[local802] = (short) local20.method5177();
				this.aShortArray119[local802] = (short) local20.method5177();
				this.aShortArray111[local802] = (short) local20.method5177();
				this.aByteArray93[local802] = local25.method5188();
				this.aByteArray90[local802] = local34.method5188();
				this.aByteArray96[local802] = local39.method5188();
			}
		}
		if (!local89) {
			return;
		}
		local10.lb = local151;
		local1044 = local10.method5174();
		@Pc(1332) int local1332;
		@Pc(1338) int local1338;
		if (local1044 > 0) {
			this.aClass197Array3 = new Class197[local1044];
			for (local1332 = 0; local1332 < local1044; local1332++) {
				local1338 = local10.method5177();
				@Pc(1342) int local1342 = local10.method5177();
				@Pc(1352) byte local1352;
				if (local93 == 255) {
					local1352 = this.aByteArray89[local1342];
				} else {
					local1352 = (byte) local93;
				}
				this.aClass197Array3[local1332] = new Class197(local1338, this.aShortArray118[local1342], this.aShortArray120[local1342], this.aShortArray110[local1342], local1352);
			}
		}
		local1332 = local10.method5174();
		if (local1332 <= 0) {
			return;
		}
		this.aClass12Array3 = new Class12[local1332];
		for (local1338 = 0; local1338 < local1332; local1338++) {
			this.aClass12Array3[local1338] = new Class12(local10.method5177(), local10.method5177());
		}
		return;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIII)I")
	public int method5223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6059; local7++) {
			if (this.anIntArray717[local7] == arg2 && arg0 == this.anIntArray721[local7] && this.anIntArray720[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray717[this.anInt6059] = arg2;
		this.anIntArray721[this.anInt6059] = arg0;
		this.anIntArray720[this.anInt6059] = arg1;
		this.anInt6058 = this.anInt6059 + 1;
		return this.anInt6059++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)[[I")
	public int[][] method5224() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6071; local12++) {
			@Pc(19) int local19 = this.anIntArray718[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local54[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt6071; local80++) {
			@Pc(87) int local87 = this.anIntArray718[local80];
			if (local87 >= 0) {
				local54[local87][local8[local87]++] = local80;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ISS)V")
	public void method5227(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray117 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt6071; local11++) {
			if (this.aShortArray117[local11] == arg1) {
				this.aShortArray117[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BBSSSSSSBI)B")
	public byte method5228() {
		if (this.anInt6062 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray92[this.anInt6062] = 3;
		this.aShortArray112[this.anInt6062] = 0;
		this.aShortArray114[this.anInt6062] = 32767;
		this.aShortArray116[this.anInt6062] = 0;
		this.aShortArray113[this.anInt6062] = 1024;
		this.aShortArray119[this.anInt6062] = 1024;
		this.aShortArray111[this.anInt6062] = 1024;
		this.aByteArray93[this.anInt6062] = 0;
		this.aByteArray90[this.anInt6062] = 0;
		this.aByteArray96[this.anInt6062] = 0;
		return (byte) this.anInt6062++;
	}
}
