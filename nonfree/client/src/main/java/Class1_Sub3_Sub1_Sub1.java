import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class1_Sub3_Sub1_Sub1 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
	public int anInt145 = 0;

	@OriginalMember(owner = "client!ad", name = "wb", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!ad", name = "Bb", descriptor = "[I")
	private final int[] anIntArray26;

	@OriginalMember(owner = "client!ad", name = "Jb", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
	private int anInt143;

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class1_Sub3_Sub1_Sub1(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray25 = arg0;
		this.anIntArray26 = arg1;
		this.anIntArray27 = arg2;
		@Pc(19) byte local19 = 0;
		for (@Pc(21) int local21 = 1; local21 < arg3.length; local21++) {
			if (arg3[local21] == 1) {
				local19 = (byte) local21;
			}
		}
		this.aByteArrayArray1 = arg4;
		@Pc(40) int local40 = Integer.MAX_VALUE;
		@Pc(42) int local42 = Integer.MIN_VALUE;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			if (this.anIntArray25[local44] < local40 && this.anIntArray27[local44] != 0) {
				local40 = this.anIntArray25[local44];
			}
			if (this.anIntArray25[local44] + this.anIntArray27[local44] > local42) {
				local42 = this.anIntArray25[local44] + this.anIntArray27[local44];
			}
			@Pc(87) byte[] local87 = this.aByteArrayArray1[local44];
			@Pc(90) int local90 = local87.length;
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				local87[local92] = (byte) (local87[local92] == local19 ? 0 : 1);
			}
		}
		this.anInt145 = this.anIntArray25[32] + this.anIntArray27[32];
		this.anInt143 = this.anInt145 - local40;
		this.anInt151 = local42 - this.anInt145;
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
	public Class1_Sub3_Sub1_Sub1(@OriginalArg(0) byte[] arg0) {
		this.anIntArray26 = new int[arg0.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray26.length; local15++) {
			this.anIntArray26[local15] = arg0[local15] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;I)I")
	public int method152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		return this.method162(arg0, new int[] { arg1 }, Static4.aClass5Array1);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;IIIIIIIII)V")
	public void method153(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		this.method171(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt145;
		}
		@Pc(18) int[] local18 = new int[] { arg3 };
		if (arg4 < this.anInt143 + this.anInt151 + arg9 && arg4 < arg9 + arg9) {
			local18 = null;
		}
		@Pc(40) int local40 = this.method162(arg0, local18, Static4.aClass5Array1);
		if (arg8 == 3 && local40 == 1) {
			arg8 = 1;
		}
		@Pc(55) int local55;
		@Pc(116) int local116;
		if (arg8 == 0) {
			local55 = arg2 + this.anInt143;
		} else if (arg8 == 1) {
			local55 = arg2 + this.anInt143 + (arg4 - this.anInt143 - this.anInt151 - (local40 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local55 = arg2 + arg4 - this.anInt151 - (local40 - 1) * arg9;
		} else {
			local116 = (arg4 - this.anInt143 - this.anInt151 - (local40 - 1) * arg9) / (local40 + 1);
			if (local116 < 0) {
				local116 = 0;
			}
			local55 = arg2 + this.anInt143 + local116;
			arg9 += local116;
		}
		for (local116 = 0; local116 < local40; local116++) {
			if (arg7 == 0) {
				this.method168(Static4.aClass5Array1[local116], arg1, local55);
			} else if (arg7 == 1) {
				this.method168(Static4.aClass5Array1[local116], arg1 + (arg3 - this.method154(Static4.aClass5Array1[local116])) / 2, local55);
			} else if (arg7 == 2) {
				this.method168(Static4.aClass5Array1[local116], arg1 + arg3 - this.method154(Static4.aClass5Array1[local116]), local55);
			} else if (local116 == local40 - 1) {
				this.method168(Static4.aClass5Array1[local116], arg1, local55);
			} else {
				this.method167(Static4.aClass5Array1[local116], arg3);
				this.method168(Static4.aClass5Array1[local116], arg1, local55);
				Static4.anInt140 = 0;
			}
			local55 += arg9;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;)I")
	public int method154(@OriginalArg(0) Class5 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt178; local9++) {
			@Pc(17) int local17 = arg0.aByteArray2[local9] & 0xFF;
			if (local17 == 60) {
				local5 = local9;
			} else if (local17 == 62 && local5 != -1) {
				@Pc(37) Class5 local37 = arg0.method200(local5 + 1, local9);
				local5 = -1;
				if (local37.method199(Static4.aClass5_88)) {
					local7 += this.anIntArray26[60];
				} else if (local37.method199(Static4.aClass5_93)) {
					local7 += this.anIntArray26[62];
				} else if (local37.method217(Static4.aClass5_102)) {
					try {
						@Pc(77) int local77 = local37.method184(4).method196();
						local7 += Static4.aClass1_Sub3_Sub1_Sub3Array1[local77].anInt2445;
					} catch (@Pc(86) Exception local86) {
					}
				}
			} else if (local5 == -1) {
				local7 += this.anIntArray26[local17];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;IIIII)V")
	public void method156(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg0 == null) {
			return;
		}
		this.method171(16777215, 0);
		Static4.aRandom1.setSeed((long) arg3);
		Static4.anInt144 = (Static4.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt178];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt178; local25++) {
			local21[local25] = local23;
			if ((Static4.aRandom1.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method172(arg0, arg1, arg2, local21, null);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!af;)V")
	private void method157(@OriginalArg(0) Class5 arg0) {
		try {
			if (arg0.method217(Static4.aClass5_100)) {
				Static4.anInt146 = arg0.method184(4).method206(16);
				return;
			}
			if (arg0.method199(Static4.aClass5_98)) {
				Static4.anInt146 = Static4.anInt148;
				return;
			}
			if (arg0.method217(Static4.aClass5_99)) {
				Static4.anInt150 = arg0.method184(4).method206(16);
				return;
			}
			if (arg0.method199(Static4.aClass5_89)) {
				Static4.anInt150 = 8388608;
				return;
			}
			if (arg0.method199(Static4.aClass5_101)) {
				Static4.anInt150 = -1;
				return;
			}
			if (!arg0.method199(Static4.aClass5_92) && !arg0.method199(Static4.aClass5_87) && !arg0.method199(Static4.aClass5_90) && !arg0.method199(Static4.aClass5_94)) {
				if (arg0.method217(Static4.aClass5_97)) {
					Static4.anInt141 = arg0.method184(2).method206(16);
					return;
				}
				if (arg0.method199(Static4.aClass5_84)) {
					Static4.anInt141 = 0;
					return;
				}
				if (arg0.method199(Static4.aClass5_91)) {
					Static4.anInt141 = -1;
					return;
				}
				if (arg0.method217(Static4.aClass5_95)) {
					Static4.anInt142 = arg0.method184(5).method206(16);
					return;
				}
				if (arg0.method199(Static4.aClass5_86)) {
					Static4.anInt142 = 0;
					return;
				}
				if (arg0.method199(Static4.aClass5_85)) {
					Static4.anInt142 = Static4.anInt147;
					return;
				}
				if (arg0.method199(Static4.aClass5_96)) {
					this.method171(Static4.anInt148, Static4.anInt147);
					return;
				}
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!af;I)I")
	public int method158(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method162(arg0, new int[] { arg1 }, Static4.aClass5Array1);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method154(Static4.aClass5Array1[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!af;IIIII)V")
	public void method159(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method171(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt178];
		@Pc(14) int[] local14 = new int[arg0.anInt178];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt178; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method172(arg0, arg1 - this.method154(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)I")
	private int method160(@OriginalArg(0) int arg0) {
		return this.anIntArray26[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!af;IIIII)V")
	public void method161(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method171(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt178];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt178; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method172(arg0, arg1 - this.method154(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;[I[Lclient!af;)I")
	private int method162(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class5[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class5 local11 = Static9.method257(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method215();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method202(local27);
			if (local33 == 60) {
				local19 = local27;
			} else {
				if (local33 == 62 && local19 != -1) {
					@Pc(53) Class5 local53 = arg0.method200(local19 + 1, local27);
					local19 = -1;
					local11.method182(60);
					local11.method192(local53);
					local11.method182(62);
					if (local53.method199(Static4.aClass5_96)) {
						arg2[local21++] = local11.method200(local7, local11.method215());
						local7 = local11.method215();
						local5 = 0;
						local13 = -1;
					} else if (local53.method199(Static4.aClass5_88)) {
						local5 += this.method160(60);
					} else if (local53.method199(Static4.aClass5_93)) {
						local5 += this.method160(62);
					} else if (local53.method217(Static4.aClass5_102)) {
						try {
							@Pc(131) int local131 = local53.method184(4).method196();
							local5 += Static4.aClass1_Sub3_Sub1_Sub3Array1[local131].anInt2445;
						} catch (@Pc(140) Exception local140) {
						}
					}
					local33 = -1;
				}
				if (local19 == -1) {
					if (local33 != -1) {
						local11.method182(local33);
						local5 += this.method160(local33);
					}
					if (local33 == 32) {
						local13 = local11.method215();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local21 < arg1.length ? local21 : arg1.length - 1] && local13 >= 0) {
						arg2[local21++] = local11.method200(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
					}
					if (local33 == 45) {
						local13 = local11.method215();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method215() > local7) {
			arg2[local21++] = local11.method200(local7, local11.method215());
		}
		return local21;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;IIIIII)V")
	public void method164(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method171(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt178];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt178; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method172(arg0, arg1 - this.method154(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;IIII)V")
	public void method165(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method171(arg3, arg4);
			this.method168(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!af;I)V")
	private void method167(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method215(); local5++) {
			@Pc(11) int local11 = arg0.method202(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static4.anInt140 = (arg1 - this.method154(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;II)V")
	private void method168(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt145;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt178; local8++) {
			@Pc(16) int local16 = arg0.aByteArray2[local8] & 0xFF;
			if (local16 == 60) {
				local6 = local8;
			} else {
				@Pc(66) int local66;
				if (local16 == 62 && local6 != -1) {
					@Pc(36) Class5 local36 = arg0.method200(local6 + 1, local8);
					local6 = -1;
					if (local36.method199(Static4.aClass5_88)) {
						local16 = 60;
					} else {
						if (!local36.method199(Static4.aClass5_93)) {
							if (local36.method217(Static4.aClass5_102)) {
								try {
									local66 = local36.method184(4).method196();
									@Pc(70) Class1_Sub3_Sub1_Sub3 local70 = Static4.aClass1_Sub3_Sub1_Sub3Array1[local66];
									local70.method1687(arg1, local4 + this.anInt145 - local70.anInt2446);
									arg1 += local70.anInt2445;
								} catch (@Pc(87) Exception local87) {
								}
							} else {
								this.method157(local36);
							}
							continue;
						}
						local16 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(100) int local100 = this.anIntArray26[local16];
					local66 = this.anIntArray27[local16];
					if (local16 == 32) {
						if (Static4.anInt140 > 0) {
							Static4.anInt149 += Static4.anInt140;
							arg1 += Static4.anInt149 >> 8;
							Static4.anInt149 &= 0xFF;
						}
					} else if (Static4.anInt144 == 256) {
						if (Static4.anInt142 != -1) {
							Static4.method166(this.aByteArrayArray1[local16], arg1 + 1, local4 + this.anIntArray25[local16] + 1, local100, local66, Static4.anInt142);
						}
						Static4.method166(this.aByteArrayArray1[local16], arg1, local4 + this.anIntArray25[local16], local100, local66, Static4.anInt146);
					} else {
						if (Static4.anInt142 != -1) {
							Static4.method174(this.aByteArrayArray1[local16], arg1 + 1, local4 + this.anIntArray25[local16] + 1, local100, local66, Static4.anInt142, Static4.anInt144);
						}
						Static4.method174(this.aByteArrayArray1[local16], arg1, local4 + this.anIntArray25[local16], local100, local66, Static4.anInt146, Static4.anInt144);
					}
					if (Static4.anInt150 != -1) {
						Static33.method1971(arg1, local4 + (int) ((double) this.anInt145 * 0.7D), local100, Static4.anInt150);
					}
					if (Static4.anInt141 != -1) {
						Static33.method1971(arg1, local4 + this.anInt145 + 1, local100, Static4.anInt141);
					}
					arg1 += local100;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!af;IIII)V")
	public void method170(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method171(arg3, arg4);
			this.method168(arg0, arg1 - this.method154(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static4.anInt150 = -1;
		Static4.anInt141 = -1;
		Static4.anInt147 = arg1;
		Static4.anInt142 = arg1;
		Static4.anInt148 = arg0;
		Static4.anInt146 = arg0;
		Static4.anInt144 = 256;
		Static4.anInt140 = 0;
		Static4.anInt149 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!af;II[I[I)V")
	private void method172(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt145;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt178; local10++) {
			@Pc(18) int local18 = arg0.aByteArray2[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(87) int local87;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class5 local38 = arg0.method200(local6 + 1, local10);
					local6 = -1;
					if (local38.method199(Static4.aClass5_88)) {
						local18 = 60;
					} else {
						if (!local38.method199(Static4.aClass5_93)) {
							if (local38.method217(Static4.aClass5_102)) {
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
									local87 = local38.method184(4).method196();
									@Pc(91) Class1_Sub3_Sub1_Sub3 local91 = Static4.aClass1_Sub3_Sub1_Sub3Array1[local87];
									local91.method1687(arg1 + local67, local4 + this.anInt145 - local91.anInt2446 + local76);
									arg1 += local91.anInt2445;
								} catch (@Pc(112) Exception local112) {
								}
							} else {
								this.method157(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(125) int local125 = this.anIntArray26[local18];
					local67 = this.anIntArray27[local18];
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
						if (Static4.anInt140 > 0) {
							Static4.anInt149 += Static4.anInt140;
							arg1 += Static4.anInt149 >> 8;
							Static4.anInt149 &= 0xFF;
						}
					} else if (Static4.anInt144 == 256) {
						if (Static4.anInt142 != -1) {
							Static4.method166(this.aByteArrayArray1[local18], arg1 + local76 + 1, local4 + this.anIntArray25[local18] + 1 + local87, local125, local67, Static4.anInt142);
						}
						Static4.method166(this.aByteArrayArray1[local18], arg1 + local76, local4 + this.anIntArray25[local18] + local87, local125, local67, Static4.anInt146);
					} else {
						if (Static4.anInt142 != -1) {
							Static4.method174(this.aByteArrayArray1[local18], arg1 + local76 + 1, local4 + this.anIntArray25[local18] + 1 + local87, local125, local67, Static4.anInt142, Static4.anInt144);
						}
						Static4.method174(this.aByteArrayArray1[local18], arg1 + local76, local4 + this.anIntArray25[local18] + local87, local125, local67, Static4.anInt146, Static4.anInt144);
					}
					if (Static4.anInt150 != -1) {
						Static33.method1971(arg1, local4 + (int) ((double) this.anInt145 * 0.7D), local125, Static4.anInt150);
					}
					if (Static4.anInt141 != -1) {
						Static33.method1971(arg1, local4 + this.anInt145, local125, Static4.anInt141);
					}
					arg1 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!af;IIII)V")
	public void method173(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method171(arg3, arg4);
			this.method168(arg0, arg1 - this.method154(arg0), arg2);
		}
	}
}
