import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class138 {

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "[B")
	private final byte[] aByteArray54;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public final int anInt4172;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	public final int anInt4180;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public final int anInt4175;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V")
	public Class138(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub1 local8 = new Class5_Sub1(arg0);
		@Pc(12) int local12 = local8.method1832();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(33) boolean local33 = local8.method1832() == 1;
		this.aByteArray54 = new byte[256];
		local8.method1860(this.aByteArray54, 256);
		if (local33) {
			@Pc(49) int[] local49 = new int[256];
			for (@Pc(51) int local51 = 0; local51 < 256; local51++) {
				local49[local51] = local8.method1832();
			}
			@Pc(68) int[] local68 = new int[256];
			for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
				local68[local70] = local8.method1832();
			}
			@Pc(85) byte[][] local85 = new byte[256][];
			@Pc(100) int local100;
			for (@Pc(87) int local87 = 0; local87 < 256; local87++) {
				local85[local87] = new byte[local49[local87]];
				@Pc(98) byte local98 = 0;
				for (local100 = 0; local100 < local85[local87].length; local100++) {
					local98 += local8.method1863();
					local85[local87][local100] = local98;
				}
			}
			@Pc(131) byte[][] local131 = new byte[256][];
			@Pc(146) int local146;
			for (local100 = 0; local100 < 256; local100++) {
				local131[local100] = new byte[local49[local100]];
				@Pc(144) byte local144 = 0;
				for (local146 = 0; local146 < local131[local100].length; local146++) {
					local144 += local8.method1863();
					local131[local100][local146] = local144;
				}
			}
			this.aByteArrayArray14 = new byte[256][256];
			for (@Pc(183) int local183 = 0; local183 < 256; local183++) {
				if (local183 != 32 && local183 != 160) {
					for (local146 = 0; local146 < 256; local146++) {
						if (local146 != 32 && local146 != 160) {
							this.aByteArrayArray14[local183][local146] = (byte) Static345.method5682(local131, local146, local85, this.aByteArray54, local68, local49, local183);
						}
					}
				}
			}
			this.anInt4172 = local49[32] + local68[32];
		} else {
			this.anInt4172 = local8.method1832();
		}
		local8.method1832();
		local8.method1832();
		this.anInt4180 = local8.method1832();
		this.anInt4175 = local8.method1832();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)I")
	public int method3721(@OriginalArg(0) int arg0) {
		return this.aByteArray54[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;I[Lclient!kh;I)I")
	public int method3722(@OriginalArg(0) String arg0, @OriginalArg(2) Class54[] arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = this.method3729(new int[] { arg2 }, arg0, Static76.aStringArray40, arg1);
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local16; local25++) {
			@Pc(33) int local33 = this.method3725(Static76.aStringArray40[local25]);
			if (local23 < local33) {
				local23 = local33;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIC)I")
	public int method3723(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray14 == null ? 0 : this.aByteArrayArray14[arg0][arg1];
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3725(@OriginalArg(0) String arg0) {
		return this.method3727(null, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B[Lclient!kh;Ljava/lang/String;)I")
	public int method3727(@OriginalArg(1) Class54[] arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(24) int local24 = 0; local24 < local16; local24++) {
			@Pc(29) char local29 = arg1.charAt(local24);
			if (local29 == '<') {
				local9 = local24;
			} else {
				if (local29 == '>' && local9 != -1) {
					@Pc(48) String local48 = arg1.substring(local9 + 1, local24);
					local9 = -1;
					if (local48.equals("lt")) {
						local29 = '<';
					} else if (local48.equals("gt")) {
						local29 = '>';
					} else if (local48.equals("nbsp")) {
						local29 = ' ';
					} else if (local48.equals("shy")) {
						local29 = '\u00ad';
					} else if (local48.equals("times")) {
						local29 = '×';
					} else if (local48.equals("euro")) {
						local29 = '€';
					} else if (local48.equals("copy")) {
						local29 = '©';
					} else {
						if (!local48.equals("reg")) {
							if (local48.startsWith("img=") && arg0 != null) {
								try {
									@Pc(112) int local112 = Static269.method4544(local48.substring(4));
									local11 = -1;
									local13 += arg0[local112].method5560();
								} catch (@Pc(123) Exception local123) {
								}
							}
							continue;
						}
						local29 = '®';
					}
				}
				if (local9 == -1) {
					local13 += this.aByteArray54[Static17.method5328(local29) & 0xFF] & 0xFF;
					if (this.aByteArrayArray14 != null && local11 != -1) {
						local13 += this.aByteArrayArray14[local11][local29];
					}
					local11 = local29;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/lang/String;[Lclient!kh;II)I")
	public int method3728(@OriginalArg(1) String arg0, @OriginalArg(2) Class54[] arg1) {
		@Pc(7) int local7 = this.anInt4172;
		@Pc(31) int local31 = this.method3729(new int[] { 100 }, arg0, Static76.aStringArray40, arg1);
		@Pc(37) int local37 = local7 * (local31 - 1);
		return this.anInt4180 + local37 + this.anInt4175;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([ILjava/lang/String;[Ljava/lang/String;[Lclient!kh;I)I")
	public int method3729(@OriginalArg(0) int[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) Class54[] arg3) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = arg1.length();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(43) int local43 = Static17.method5328(arg1.charAt(local34)) & 0xFF;
			@Pc(45) int local45 = 0;
			if (local43 == 60) {
				local19 = local34;
			} else {
				@Pc(56) int local56;
				if (local19 == -1) {
					local56 = local34;
					local45 = this.method3721(local43);
					if (this.aByteArrayArray14 != null && local27 != -1) {
						local45 += this.aByteArrayArray14[local27][local43];
					}
					local27 = local43;
				} else {
					if (local43 != 62) {
						continue;
					}
					local56 = local19;
					@Pc(95) String local95 = arg1.substring(local19 + 1, local34);
					local19 = -1;
					if (local95.equals("br")) {
						arg2[local29] = arg1.substring(local11, local34 + 1);
						local9 = 0;
						local11 = local34 + 1;
						local27 = -1;
						local13 = -1;
						local29++;
						continue;
					}
					if (local95.equals("lt")) {
						local45 = this.method3721(60);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][60];
						}
						local27 = 60;
					} else if (local95.equals("gt")) {
						local45 = this.method3721(62);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][62];
						}
						local27 = 62;
					} else if (local95.equals("nbsp")) {
						local45 = this.method3721(160);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][160];
						}
						local27 = 160;
					} else if (local95.equals("shy")) {
						local45 = this.method3721(173);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][173];
						}
						local27 = 173;
					} else if (local95.equals("times")) {
						local45 = this.method3721(215);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][215];
						}
						local27 = 215;
					} else if (local95.equals("euro")) {
						local45 = this.method3721(8364);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][8364];
						}
						local27 = 8364;
					} else if (local95.equals("copy")) {
						local45 = this.method3721(169);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][169];
						}
						local27 = 169;
					} else if (local95.equals("reg")) {
						local45 = this.method3721(174);
						if (this.aByteArrayArray14 != null && local27 != -1) {
							local45 += this.aByteArrayArray14[local27][174];
						}
						local27 = 174;
					} else if (local95.startsWith("img=") && arg3 != null) {
						try {
							@Pc(245) int local245 = Static269.method4544(local95.substring(4));
							local45 = arg3[local245].method5560();
							local27 = -1;
						} catch (@Pc(256) Exception local256) {
						}
					}
					local43 = -1;
				}
				if (local45 > 0) {
					local9 += local45;
					if (arg0 != null) {
						if (local43 == 32) {
							local17 = 1;
							local15 = local9;
							local13 = local34;
						}
						if (arg0[local29 >= arg0.length ? arg0.length - 1 : local29] < local9) {
							if (local13 >= 0) {
								arg2[local29] = arg1.substring(local11, local13 + 1 - local17);
								local29++;
								local11 = local13 + 1;
								local13 = -1;
								local27 = -1;
								local9 -= local15;
							} else {
								arg2[local29] = arg1.substring(local11, local56);
								local27 = -1;
								local9 = local45;
								local13 = -1;
								local11 = local56;
								local29++;
							}
						}
						if (local43 == 45) {
							local15 = local9;
							local13 = local34;
							local17 = 0;
						}
					}
				}
			}
		}
		if (arg1.length() > local11) {
			arg2[local29] = arg1.substring(local11, arg1.length());
			local29++;
		}
		return local29;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;[Lclient!kh;II)I")
	public int method3732(@OriginalArg(0) String arg0, @OriginalArg(1) Class54[] arg1, @OriginalArg(3) int arg2) {
		return this.method3729(new int[] { arg2 }, arg0, Static76.aStringArray40, arg1);
	}
}
