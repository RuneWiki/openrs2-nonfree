import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class196 {

	@OriginalMember(owner = "client!kga", name = "v", descriptor = "[B")
	private final byte[] aByteArray58;

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
	public final int anInt5167;

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "I")
	public final int anInt5173;

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
	public final int anInt5177;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "([B)V")
	public Class196(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(12) int local12 = local8.method6015();
		if (local12 != 0) {
			throw new RuntimeException("");
		}
		@Pc(30) boolean local30 = local8.method6015() == 1;
		this.aByteArray58 = new byte[256];
		local8.method5966(256, this.aByteArray58);
		if (local30) {
			@Pc(53) int[] local53 = new int[256];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				local53[local55] = local8.method6015();
			}
			@Pc(70) int[] local70 = new int[256];
			for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
				local70[local72] = local8.method6015();
			}
			@Pc(89) byte[][] local89 = new byte[256][];
			@Pc(104) int local104;
			for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
				local89[local91] = new byte[local53[local91]];
				@Pc(102) byte local102 = 0;
				for (local104 = 0; local104 < local89[local91].length; local104++) {
					local102 += local8.method6021();
					local89[local91][local104] = local102;
				}
			}
			@Pc(137) byte[][] local137 = new byte[256][];
			@Pc(152) int local152;
			for (local104 = 0; local104 < 256; local104++) {
				local137[local104] = new byte[local53[local104]];
				@Pc(150) byte local150 = 0;
				for (local152 = 0; local152 < local137[local104].length; local152++) {
					local150 += local8.method6021();
					local137[local104][local152] = local150;
				}
			}
			this.aByteArrayArray24 = new byte[256][256];
			for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
				if (local185 != 32 && local185 != 160) {
					for (local152 = 0; local152 < 256; local152++) {
						if (local152 != 32 && local152 != 160) {
							this.aByteArrayArray24[local185][local152] = (byte) Static374.method5594(local137, local185, local70, local53, local152, local89, this.aByteArray58);
						}
					}
				}
			}
			this.anInt5167 = local70[32] + local53[32];
		} else {
			this.anInt5167 = local8.method6015();
		}
		local8.method6015();
		local8.method6015();
		this.anInt5173 = local8.method6015();
		this.anInt5177 = local8.method6015();
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLjava/lang/String;[Lclient!xa;I)Ljava/lang/String;")
	public String method4375(@OriginalArg(1) String arg0, @OriginalArg(2) Class13[] arg1, @OriginalArg(3) int arg2) {
		if (this.method4377(arg1, arg0) <= arg2) {
			return arg0;
		}
		@Pc(26) int local26 = arg2 - this.method4377(null, "...");
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		@Pc(42) String local42 = "";
		for (@Pc(44) int local44 = 0; local44 < local40; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local33 = local44;
			} else {
				if (local50 == '>' && local33 != -1) {
					@Pc(70) String local70 = arg0.substring(local33 + 1, local44);
					local33 = -1;
					if (local70.equals("lt")) {
						local50 = '<';
					} else if (local70.equals("gt")) {
						local50 = '>';
					} else if (local70.equals("nbsp")) {
						local50 = ' ';
					} else if (local70.equals("shy")) {
						local50 = '\u00ad';
					} else if (local70.equals("times")) {
						local50 = '×';
					} else if (local70.equals("euro")) {
						local50 = '€';
					} else if (local70.equals("copy")) {
						local50 = '©';
					} else {
						if (!local70.equals("reg")) {
							if (local70.startsWith("img=") && arg1 != null) {
								try {
									@Pc(128) int local128 = Static272.method4392(local70.substring(4));
									local35 = -1;
									local37 += arg1[local128].AA();
									if (local26 < local37) {
										return local42 + "...";
									}
									local42 = arg0.substring(0, local44 + 1);
								} catch (@Pc(158) Exception local158) {
								}
							}
							continue;
						}
						local50 = '®';
					}
				}
				if (local33 == -1) {
					local37 += this.aByteArray58[Static22.method428(local50) & 0xFF] & 0xFF;
					if (this.aByteArrayArray24 != null && local35 != -1) {
						local37 += this.aByteArrayArray24[local35][local50];
					}
					local35 = local50;
					@Pc(215) int local215 = local37;
					if (this.aByteArrayArray24 != null) {
						local215 = local37 + this.aByteArrayArray24[local50][46];
					}
					if (local26 < local215) {
						return local42 + "...";
					}
					local42 = arg0.substring(0, local44 + 1);
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)I")
	public int method4376(@OriginalArg(0) int arg0) {
		return this.aByteArray58[arg0] & 0xFF;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([Lclient!xa;Ljava/lang/String;B)I")
	public int method4377(@OriginalArg(0) Class13[] arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(27) int local27 = arg1.length();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) char local35 = arg1.charAt(local29);
			if (local35 == '<') {
				local11 = local29;
			} else {
				if (local35 == '>' && local11 != -1) {
					@Pc(55) String local55 = arg1.substring(local11 + 1, local29);
					local11 = -1;
					if (local55.equals("lt")) {
						local35 = '<';
					} else if (local55.equals("gt")) {
						local35 = '>';
					} else if (local55.equals("nbsp")) {
						local35 = ' ';
					} else if (local55.equals("shy")) {
						local35 = '\u00ad';
					} else if (local55.equals("times")) {
						local35 = '×';
					} else if (local55.equals("euro")) {
						local35 = '€';
					} else if (local55.equals("copy")) {
						local35 = '©';
					} else {
						if (!local55.equals("reg")) {
							if (local55.startsWith("img=") && arg0 != null) {
								try {
									@Pc(109) int local109 = Static272.method4392(local55.substring(4));
									local15 += arg0[local109].AA();
									local13 = -1;
								} catch (@Pc(120) Exception local120) {
								}
							}
							continue;
						}
						local35 = '®';
					}
				}
				if (local11 == -1) {
					local15 += this.aByteArray58[Static22.method428(local35) & 0xFF] & 0xFF;
					if (this.aByteArrayArray24 != null && local13 != -1) {
						local15 += this.aByteArrayArray24[local13][local35];
					}
					local13 = local35;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[Lclient!xa;Ljava/lang/String;I)I")
	public int method4379(@OriginalArg(1) int arg0, @OriginalArg(2) Class13[] arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		if (arg0 == 0) {
			arg0 = this.anInt5167;
		}
		@Pc(34) int local34 = this.method4385(new int[] { arg3 }, Static390.aStringArray30, arg1, arg2);
		@Pc(40) int local40 = arg0 * (local34 - 1);
		return this.anInt5173 + local40 + this.anInt5177;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;B[Lclient!xa;I)I")
	public int method4380(@OriginalArg(0) String arg0, @OriginalArg(2) Class13[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = this.method4385(new int[] { arg2 }, Static390.aStringArray30, arg1, arg0);
		@Pc(20) int local20 = 0;
		for (@Pc(30) int local30 = 0; local30 < local18; local30++) {
			@Pc(40) int local40 = this.method4377(arg1, Static390.aStringArray30[local30]);
			if (local20 < local40) {
				local20 = local40;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILjava/lang/String;I[Lclient!xa;)I")
	public int method4382(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13[] arg2) {
		return this.method4385(new int[] { arg1 }, Static390.aStringArray30, arg2, arg0);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZIC)I")
	public int method4384(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		return this.aByteArrayArray24 == null ? 0 : this.aByteArrayArray24[arg0][arg1];
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z[I[Ljava/lang/String;[Lclient!xa;Ljava/lang/String;)I")
	public int method4385(@OriginalArg(1) int[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) Class13[] arg2, @OriginalArg(4) String arg3) {
		if (arg3 == null) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = -1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg3.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(40) int local40 = Static22.method428(arg3.charAt(local30)) & 0xFF;
			@Pc(42) int local42 = 0;
			if (local40 == 60) {
				local21 = local30;
			} else {
				@Pc(62) int local62;
				if (local21 == -1) {
					local42 = this.method4376(local40);
					local62 = local30;
					if (this.aByteArrayArray24 != null && local23 != -1) {
						local42 += this.aByteArrayArray24[local23][local40];
					}
					local23 = local40;
				} else {
					if (local40 != 62) {
						continue;
					}
					local62 = local21;
					@Pc(69) String local69 = arg3.substring(local21 + 1, local30);
					local21 = -1;
					if (local69.equals("br")) {
						arg1[local25] = arg3.substring(local13, local30 + 1);
						local25++;
						if (arg1.length <= local25) {
							return 0;
						}
						local11 = 0;
						local23 = -1;
						local13 = local30 + 1;
						local15 = -1;
						continue;
					}
					if (local69.equals("lt")) {
						local42 = this.method4376(60);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][60];
						}
						local23 = 60;
					} else if (local69.equals("gt")) {
						local42 = this.method4376(62);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][62];
						}
						local23 = 62;
					} else if (local69.equals("nbsp")) {
						local42 = this.method4376(160);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][160];
						}
						local23 = 160;
					} else if (local69.equals("shy")) {
						local42 = this.method4376(173);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][173];
						}
						local23 = 173;
					} else if (local69.equals("times")) {
						local42 = this.method4376(215);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][215];
						}
						local23 = 215;
					} else if (local69.equals("euro")) {
						local42 = this.method4376(8364);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][8364];
						}
						local23 = 8364;
					} else if (local69.equals("copy")) {
						local42 = this.method4376(169);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][169];
						}
						local23 = 169;
					} else if (local69.equals("reg")) {
						local42 = this.method4376(174);
						if (this.aByteArrayArray24 != null && local23 != -1) {
							local42 += this.aByteArrayArray24[local23][174];
						}
						local23 = 174;
					} else if (local69.startsWith("img=") && arg2 != null) {
						try {
							@Pc(200) int local200 = Static272.method4392(local69.substring(4));
							local23 = -1;
							local42 = arg2[local200].AA();
						} catch (@Pc(211) Exception local211) {
						}
					}
					local40 = -1;
				}
				if (local42 > 0) {
					local11 += local42;
					if (arg0 != null) {
						if (local40 == 32) {
							local17 = local11;
							local19 = 1;
							local15 = local30;
						}
						if (local11 > arg0[arg0.length > local25 ? local25 : arg0.length - 1]) {
							if (local15 >= 0) {
								arg1[local25] = arg3.substring(local13, local15 + 1 - local19);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local13 = local15 + 1;
								local23 = -1;
								local15 = -1;
								local11 -= local17;
							} else {
								arg1[local25] = arg3.substring(local13, local62);
								local25++;
								if (local25 >= arg1.length) {
									return 0;
								}
								local13 = local62;
								local11 = local42;
								local23 = -1;
								local15 = -1;
							}
						}
						if (local40 == 45) {
							local19 = 0;
							local17 = local11;
							local15 = local30;
						}
					}
				}
			}
		}
		if (arg3.length() > local13) {
			arg1[local25] = arg3.substring(local13, arg3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method4386(@OriginalArg(0) String arg0) {
		return this.method4377(null, arg0);
	}
}
