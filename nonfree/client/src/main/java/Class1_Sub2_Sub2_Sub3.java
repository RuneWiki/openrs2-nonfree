import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class1_Sub2_Sub2_Sub3 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!ma", name = "ub", descriptor = "I")
	public int anInt1519 = 0;

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "[I")
	private int[] anIntArray283;

	@OriginalMember(owner = "client!ma", name = "rb", descriptor = "[I")
	private final int[] anIntArray285;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "[I")
	private int[] anIntArray284;

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!ma", name = "yb", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class1_Sub2_Sub2_Sub3(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray283 = arg0;
		this.anIntArray285 = arg1;
		this.anIntArray284 = arg2;
		@Pc(19) byte local19 = 0;
		for (@Pc(21) int local21 = 1; local21 < arg3.length; local21++) {
			if (arg3[local21] == 1) {
				local19 = (byte) local21;
			}
		}
		this.aByteArrayArray5 = arg4;
		@Pc(40) int local40 = Integer.MAX_VALUE;
		@Pc(42) int local42 = Integer.MIN_VALUE;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			if (this.anIntArray283[local44] < local40 && this.anIntArray284[local44] != 0) {
				local40 = this.anIntArray283[local44];
			}
			if (this.anIntArray283[local44] + this.anIntArray284[local44] > local42) {
				local42 = this.anIntArray283[local44] + this.anIntArray284[local44];
			}
			@Pc(87) byte[] local87 = this.aByteArrayArray5[local44];
			@Pc(90) int local90 = local87.length;
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				local87[local92] = (byte) (local87[local92] == local19 ? 0 : 1);
			}
		}
		this.anInt1519 = this.anIntArray283[32] + this.anIntArray284[32];
		this.anInt1513 = this.anInt1519 - local40;
		this.anInt1521 = local42 - this.anInt1519;
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub2_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anIntArray285 = new int[arg0.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray285.length; local15++) {
			this.anIntArray285[local15] = arg0[local15] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;IIIIIIIII)V")
	public void method1179(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		this.method1181(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt1519;
		}
		@Pc(18) int[] local18 = new int[] { arg3 };
		if (arg4 < this.anInt1513 + this.anInt1521 + arg9 && arg4 < arg9 + arg9) {
			local18 = null;
		}
		@Pc(40) int local40 = this.method1189(arg0, local18, Static72.aClass25Array8);
		if (arg8 == 3 && local40 == 1) {
			arg8 = 1;
		}
		@Pc(55) int local55;
		@Pc(116) int local116;
		if (arg8 == 0) {
			local55 = arg2 + this.anInt1513;
		} else if (arg8 == 1) {
			local55 = arg2 + this.anInt1513 + (arg4 - this.anInt1513 - this.anInt1521 - (local40 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local55 = arg2 + arg4 - this.anInt1521 - (local40 - 1) * arg9;
		} else {
			local116 = (arg4 - this.anInt1513 - this.anInt1521 - (local40 - 1) * arg9) / (local40 + 1);
			if (local116 < 0) {
				local116 = 0;
			}
			local55 = arg2 + this.anInt1513 + local116;
			arg9 += local116;
		}
		for (local116 = 0; local116 < local40; local116++) {
			if (arg7 == 0) {
				this.method1182(Static72.aClass25Array8[local116], arg1, local55);
			} else if (arg7 == 1) {
				this.method1182(Static72.aClass25Array8[local116], arg1 + (arg3 - this.method1187(Static72.aClass25Array8[local116])) / 2, local55);
			} else if (arg7 == 2) {
				this.method1182(Static72.aClass25Array8[local116], arg1 + arg3 - this.method1187(Static72.aClass25Array8[local116]), local55);
			} else if (local116 == local40 - 1) {
				this.method1182(Static72.aClass25Array8[local116], arg1, local55);
			} else {
				this.method1183(Static72.aClass25Array8[local116], arg3);
				this.method1182(Static72.aClass25Array8[local116], arg1, local55);
				Static72.anInt1516 = 0;
			}
			local55 += arg9;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;IIII)V")
	public void method1180(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1181(arg3, arg4);
			this.method1182(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	private void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static72.anInt1522 = -1;
		Static72.anInt1515 = -1;
		Static72.anInt1517 = arg1;
		Static72.anInt1518 = arg1;
		Static72.anInt1524 = arg0;
		Static72.anInt1520 = arg0;
		Static72.anInt1514 = 256;
		Static72.anInt1516 = 0;
		Static72.anInt1523 = 0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;II)V")
	private void method1182(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1519;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt956; local8++) {
			@Pc(16) int local16 = arg0.aByteArray15[local8] & 0xFF;
			if (local16 == 60) {
				local6 = local8;
			} else {
				@Pc(66) int local66;
				if (local16 == 62 && local6 != -1) {
					@Pc(36) Class25 local36 = arg0.method781(local6 + 1, local8);
					local6 = -1;
					if (local36.method787(Static72.aClass25_720)) {
						local16 = 60;
					} else {
						if (!local36.method787(Static72.aClass25_719)) {
							if (local36.method797(Static72.aClass25_725)) {
								try {
									local66 = local36.method794(4).method782();
									@Pc(70) Class1_Sub2_Sub2_Sub4 local70 = Static72.aClass1_Sub2_Sub2_Sub4Array4[local66];
									local70.method1953(arg1, local4 + this.anInt1519 - local70.anInt2758);
									arg1 += local70.anInt2756;
								} catch (@Pc(87) Exception local87) {
								}
							} else {
								this.method1196(local36);
							}
							continue;
						}
						local16 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(100) int local100 = this.anIntArray285[local16];
					local66 = this.anIntArray284[local16];
					if (local16 == 32) {
						if (Static72.anInt1516 > 0) {
							Static72.anInt1523 += Static72.anInt1516;
							arg1 += Static72.anInt1523 >> 8;
							Static72.anInt1523 &= 0xFF;
						}
					} else if (Static72.anInt1514 == 256) {
						if (Static72.anInt1518 != -1) {
							Static72.method1185(this.aByteArrayArray5[local16], arg1 + 1, local4 + this.anIntArray283[local16] + 1, local100, local66, Static72.anInt1518);
						}
						Static72.method1185(this.aByteArrayArray5[local16], arg1, local4 + this.anIntArray283[local16], local100, local66, Static72.anInt1520);
					} else {
						if (Static72.anInt1518 != -1) {
							Static72.method1199(this.aByteArrayArray5[local16], arg1 + 1, local4 + this.anIntArray283[local16] + 1, local100, local66, Static72.anInt1518, Static72.anInt1514);
						}
						Static72.method1199(this.aByteArrayArray5[local16], arg1, local4 + this.anIntArray283[local16], local100, local66, Static72.anInt1520, Static72.anInt1514);
					}
					if (Static72.anInt1522 != -1) {
						Static128.method1944(arg1, local4 + (int) ((double) this.anInt1519 * 0.7D), local100, Static72.anInt1522);
					}
					if (Static72.anInt1515 != -1) {
						Static128.method1944(arg1, local4 + this.anInt1519 + 1, local100, Static72.anInt1515);
					}
					arg1 += local100;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;I)V")
	private void method1183(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method762(); local5++) {
			@Pc(11) int local11 = arg0.method767(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static72.anInt1516 = (arg1 - this.method1187(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!fc;IIII)V")
	public void method1184(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1181(arg3, arg4);
			this.method1182(arg0, arg1 - this.method1187(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!fc;I)I")
	public int method1186(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1189(arg0, new int[] { arg1 }, Static72.aClass25Array8);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1187(Static72.aClass25Array8[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;)I")
	public int method1187(@OriginalArg(0) Class25 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt956; local9++) {
			@Pc(17) int local17 = arg0.aByteArray15[local9] & 0xFF;
			if (local17 == 60) {
				local5 = local9;
			} else if (local17 == 62 && local5 != -1) {
				@Pc(37) Class25 local37 = arg0.method781(local5 + 1, local9);
				local5 = -1;
				if (local37.method787(Static72.aClass25_720)) {
					local7 += this.anIntArray285[60];
				} else if (local37.method787(Static72.aClass25_719)) {
					local7 += this.anIntArray285[62];
				} else if (local37.method797(Static72.aClass25_725)) {
					try {
						@Pc(77) int local77 = local37.method794(4).method782();
						local7 += Static72.aClass1_Sub2_Sub2_Sub4Array4[local77].anInt2756;
					} catch (@Pc(86) Exception local86) {
					}
				}
			} else if (local5 == -1) {
				local7 += this.anIntArray285[local17];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;[I[Lclient!fc;)I")
	private int method1189(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class25[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class25 local11 = Static107.method1730();
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method762();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method767(local27);
			if (local33 == 60) {
				local19 = local27;
			} else {
				if (local33 == 62 && local19 != -1) {
					@Pc(53) Class25 local53 = arg0.method781(local19 + 1, local27);
					local19 = -1;
					local11.method791(60);
					local11.method783(local53);
					local11.method791(62);
					if (local53.method787(Static72.aClass25_727)) {
						arg2[local21++] = local11.method781(local7, local11.method762());
						local7 = local11.method762();
						local5 = 0;
						local13 = -1;
					} else if (local53.method787(Static72.aClass25_720)) {
						local5 += this.method1201(60);
					} else if (local53.method787(Static72.aClass25_719)) {
						local5 += this.method1201(62);
					} else if (local53.method797(Static72.aClass25_725)) {
						try {
							@Pc(131) int local131 = local53.method794(4).method782();
							local5 += Static72.aClass1_Sub2_Sub2_Sub4Array4[local131].anInt2756;
						} catch (@Pc(140) Exception local140) {
						}
					}
					local33 = -1;
				}
				if (local19 == -1) {
					if (local33 != -1) {
						local11.method791(local33);
						local5 += this.method1201(local33);
					}
					if (local33 == 32) {
						local13 = local11.method762();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local21 < arg1.length ? local21 : arg1.length - 1] && local13 >= 0) {
						arg2[local21++] = local11.method781(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
					}
					if (local33 == 45) {
						local13 = local11.method762();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method762() > local7) {
			arg2[local21++] = local11.method781(local7, local11.method762());
		}
		return local21;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;IIIII)V")
	public void method1190(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1181(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt956];
		@Pc(14) int[] local14 = new int[arg0.anInt956];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt956; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1197(arg0, arg1 - this.method1187(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!fc;IIIII)V")
	public void method1191(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1181(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt956];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt956; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1197(arg0, arg1 - this.method1187(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lclient!fc;IIIII)V")
	public void method1192(@OriginalArg(0) Class25 arg0, @OriginalArg(5) int arg1) {
		if (arg0 == null) {
			return;
		}
		this.method1181(16777215, 0);
		Static72.aRandom1.setSeed((long) arg1);
		Static72.anInt1514 = (Static72.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt956];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt956; local25++) {
			local21[local25] = local23;
			if ((Static72.aRandom1.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1197(arg0, 4, 15, local21, null);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;IIIIII)V")
	public void method1193(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1181(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt956];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt956; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1197(arg0, arg1 - this.method1187(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lclient!fc;)V")
	private void method1196(@OriginalArg(0) Class25 arg0) {
		try {
			if (arg0.method797(Static72.aClass25_726)) {
				Static72.anInt1520 = arg0.method794(4).method763(16);
				return;
			}
			if (arg0.method787(Static72.aClass25_712)) {
				Static72.anInt1520 = Static72.anInt1524;
				return;
			}
			if (arg0.method797(Static72.aClass25_717)) {
				Static72.anInt1522 = arg0.method794(4).method763(16);
				return;
			}
			if (arg0.method787(Static72.aClass25_715)) {
				Static72.anInt1522 = 8388608;
				return;
			}
			if (arg0.method787(Static72.aClass25_722)) {
				Static72.anInt1522 = -1;
				return;
			}
			if (!arg0.method787(Static72.aClass25_724) && !arg0.method787(Static72.aClass25_714) && !arg0.method787(Static72.aClass25_718) && !arg0.method787(Static72.aClass25_711)) {
				if (arg0.method797(Static72.aClass25_716)) {
					Static72.anInt1515 = arg0.method794(2).method763(16);
					return;
				}
				if (arg0.method787(Static72.aClass25_728)) {
					Static72.anInt1515 = 0;
					return;
				}
				if (arg0.method787(Static72.aClass25_713)) {
					Static72.anInt1515 = -1;
					return;
				}
				if (arg0.method797(Static72.aClass25_721)) {
					Static72.anInt1518 = arg0.method794(5).method763(16);
					return;
				}
				if (arg0.method787(Static72.aClass25_710)) {
					Static72.anInt1518 = 0;
					return;
				}
				if (arg0.method787(Static72.aClass25_723)) {
					Static72.anInt1518 = Static72.anInt1517;
					return;
				}
				if (arg0.method787(Static72.aClass25_727)) {
					this.method1181(Static72.anInt1524, Static72.anInt1517);
					return;
				}
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!fc;II[I[I)V")
	private void method1197(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1519;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt956; local10++) {
			@Pc(18) int local18 = arg0.aByteArray15[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(87) int local87;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class25 local38 = arg0.method781(local6 + 1, local10);
					local6 = -1;
					if (local38.method787(Static72.aClass25_720)) {
						local18 = 60;
					} else {
						if (!local38.method787(Static72.aClass25_719)) {
							if (local38.method797(Static72.aClass25_725)) {
								try {
									if (arg3 == null) {
										local67 = 0;
									} else {
										local67 = arg3[local8];
									}
									if (arg4 == null) {
										local76 = 0;
									} else {
										local76 = arg4[local8];
									}
									local8++;
									local87 = local38.method794(4).method782();
									@Pc(91) Class1_Sub2_Sub2_Sub4 local91 = Static72.aClass1_Sub2_Sub2_Sub4Array4[local87];
									local91.method1953(arg1 + local67, local4 + this.anInt1519 - local91.anInt2758 + local76);
									arg1 += local91.anInt2756;
								} catch (@Pc(112) Exception local112) {
								}
							} else {
								this.method1196(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(125) int local125 = this.anIntArray285[local18];
					local67 = this.anIntArray284[local18];
					if (arg3 == null) {
						local76 = 0;
					} else {
						local76 = arg3[local8];
					}
					if (arg4 == null) {
						local87 = 0;
					} else {
						local87 = arg4[local8];
					}
					local8++;
					if (local18 == 32) {
						if (Static72.anInt1516 > 0) {
							Static72.anInt1523 += Static72.anInt1516;
							arg1 += Static72.anInt1523 >> 8;
							Static72.anInt1523 &= 0xFF;
						}
					} else if (Static72.anInt1514 == 256) {
						if (Static72.anInt1518 != -1) {
							Static72.method1185(this.aByteArrayArray5[local18], arg1 + local76 + 1, local4 + this.anIntArray283[local18] + 1 + local87, local125, local67, Static72.anInt1518);
						}
						Static72.method1185(this.aByteArrayArray5[local18], arg1 + local76, local4 + this.anIntArray283[local18] + local87, local125, local67, Static72.anInt1520);
					} else {
						if (Static72.anInt1518 != -1) {
							Static72.method1199(this.aByteArrayArray5[local18], arg1 + local76 + 1, local4 + this.anIntArray283[local18] + 1 + local87, local125, local67, Static72.anInt1518, Static72.anInt1514);
						}
						Static72.method1199(this.aByteArrayArray5[local18], arg1 + local76, local4 + this.anIntArray283[local18] + local87, local125, local67, Static72.anInt1520, Static72.anInt1514);
					}
					if (Static72.anInt1522 != -1) {
						Static128.method1944(arg1, local4 + (int) ((double) this.anInt1519 * 0.7D), local125, Static72.anInt1522);
					}
					if (Static72.anInt1515 != -1) {
						Static128.method1944(arg1, local4 + this.anInt1519, local125, Static72.anInt1515);
					}
					arg1 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lclient!fc;I)I")
	public int method1198(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1) {
		return this.method1189(arg0, new int[] { arg1 }, Static72.aClass25Array8);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Lclient!fc;IIII)V")
	public void method1200(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1181(arg3, arg4);
			this.method1182(arg0, arg1 - this.method1187(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)I")
	public int method1201(@OriginalArg(0) int arg0) {
		return this.anIntArray285[arg0 & 0xFF];
	}
}
