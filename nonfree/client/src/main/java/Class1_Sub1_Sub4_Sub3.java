import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub1_Sub4_Sub3 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!gd", name = "qb", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
	public int anInt1203 = 0;

	@OriginalMember(owner = "client!gd", name = "Ib", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "[I")
	private final int[] anIntArray171;

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
	private int anInt1211;

	@OriginalMember(owner = "client!gd", name = "Cb", descriptor = "I")
	private int anInt1213;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I[I[I[I[[B)V")
	public Class1_Sub1_Sub4_Sub3(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[][] arg4) {
		this.anIntArray173 = arg0;
		this.anIntArray171 = arg1;
		this.anIntArray172 = arg2;
		@Pc(19) byte local19 = 0;
		for (@Pc(21) int local21 = 1; local21 < arg3.length; local21++) {
			if (arg3[local21] == 1) {
				local19 = (byte) local21;
			}
		}
		this.aByteArrayArray4 = arg4;
		@Pc(40) int local40 = Integer.MAX_VALUE;
		@Pc(42) int local42 = Integer.MIN_VALUE;
		for (@Pc(44) int local44 = 0; local44 < 256; local44++) {
			if (this.anIntArray173[local44] < local40 && this.anIntArray172[local44] != 0) {
				local40 = this.anIntArray173[local44];
			}
			if (this.anIntArray173[local44] + this.anIntArray172[local44] > local42) {
				local42 = this.anIntArray173[local44] + this.anIntArray172[local44];
			}
			@Pc(87) byte[] local87 = this.aByteArrayArray4[local44];
			@Pc(90) int local90 = local87.length;
			for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
				local87[local92] = (byte) (local87[local92] == local19 ? 0 : 1);
			}
		}
		this.anInt1203 = this.anIntArray173[32] + this.anIntArray172[32];
		this.anInt1211 = this.anInt1203 - local40;
		this.anInt1213 = local42 - this.anInt1203;
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub4_Sub3(@OriginalArg(0) byte[] arg0) {
		this.anIntArray171 = new int[arg0.length];
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray171.length; local15++) {
			this.anIntArray171[local15] = arg0[local15] & 0xFF;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;IIIII)V")
	public void method738(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method756(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1707];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt1707; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method754(arg0, arg1 - this.method755(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;[I[Lclient!kd;)I")
	private int method740(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class39[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class39 local11 = Static76.method1310();
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		@Pc(25) int local25 = arg0.method1175();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(33) int local33 = arg0.method1167(local27);
			if (local33 == 60) {
				local19 = local27;
			} else {
				if (local33 == 62 && local19 != -1) {
					@Pc(53) Class39 local53 = arg0.method1173(local27, local19 + 1);
					local19 = -1;
					local11.method1184(60);
					local11.method1169(local53);
					local11.method1184(62);
					if (local53.method1159(Static42.aClass39_585)) {
						arg2[local21++] = local11.method1173(local11.method1175(), local7);
						local7 = local11.method1175();
						local5 = 0;
						local13 = -1;
					} else if (local53.method1159(Static42.aClass39_584)) {
						local5 += this.method761(60);
					} else if (local53.method1159(Static42.aClass39_579)) {
						local5 += this.method761(62);
					} else if (local53.method1185(Static42.aClass39_580)) {
						try {
							@Pc(131) int local131 = local53.method1181(4).method1161();
							local5 += Static42.aClass1_Sub1_Sub4_Sub1Array4[local131].anInt869;
						} catch (@Pc(140) Exception local140) {
						}
					}
					local33 = -1;
				}
				if (local19 == -1) {
					if (local33 != -1) {
						local11.method1184(local33);
						local5 += this.method761(local33);
					}
					if (local33 == 32) {
						local13 = local11.method1175();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local21 < arg1.length ? local21 : arg1.length - 1] && local13 >= 0) {
						arg2[local21++] = local11.method1173(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
					}
					if (local33 == 45) {
						local13 = local11.method1175();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1175() > local7) {
			arg2[local21++] = local11.method1173(local11.method1175(), local7);
		}
		return local21;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;IIII)V")
	public void method741(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method756(arg3, arg4);
			this.method750(arg0, arg1 - this.method755(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!kd;IIIII)V")
	public void method742(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method756(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt1707];
		@Pc(14) int[] local14 = new int[arg0.anInt1707];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt1707; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method754(arg0, arg1 - this.method755(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;I)I")
	public int method743(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		return this.method740(arg0, new int[] { arg1 }, Static42.aClass39Array11);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!kd;)V")
	private void method745(@OriginalArg(0) Class39 arg0) {
		try {
			if (arg0.method1185(Static42.aClass39_573)) {
				Static42.anInt1209 = arg0.method1181(4).method1172(16);
				return;
			}
			if (arg0.method1159(Static42.aClass39_577)) {
				Static42.anInt1209 = Static42.anInt1210;
				return;
			}
			if (arg0.method1185(Static42.aClass39_567)) {
				Static42.anInt1212 = arg0.method1181(4).method1172(16);
				return;
			}
			if (arg0.method1159(Static42.aClass39_569)) {
				Static42.anInt1212 = 8388608;
				return;
			}
			if (arg0.method1159(Static42.aClass39_574)) {
				Static42.anInt1212 = -1;
				return;
			}
			if (!arg0.method1159(Static42.aClass39_571) && !arg0.method1159(Static42.aClass39_572) && !arg0.method1159(Static42.aClass39_568) && !arg0.method1159(Static42.aClass39_582)) {
				if (arg0.method1185(Static42.aClass39_578)) {
					Static42.anInt1207 = arg0.method1181(2).method1172(16);
					return;
				}
				if (arg0.method1159(Static42.aClass39_581)) {
					Static42.anInt1207 = 0;
					return;
				}
				if (arg0.method1159(Static42.aClass39_583)) {
					Static42.anInt1207 = -1;
					return;
				}
				if (arg0.method1185(Static42.aClass39_576)) {
					Static42.anInt1206 = arg0.method1181(5).method1172(16);
					return;
				}
				if (arg0.method1159(Static42.aClass39_575)) {
					Static42.anInt1206 = 0;
					return;
				}
				if (arg0.method1159(Static42.aClass39_570)) {
					Static42.anInt1206 = Static42.anInt1204;
					return;
				}
				if (arg0.method1159(Static42.aClass39_585)) {
					this.method756(Static42.anInt1210, Static42.anInt1204);
					return;
				}
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!kd;IIIII)V")
	public void method747(@OriginalArg(0) Class39 arg0, @OriginalArg(5) int arg1) {
		if (arg0 == null) {
			return;
		}
		this.method756(16777215, 0);
		Static42.aRandom1.setSeed((long) arg1);
		Static42.anInt1205 = (Static42.aRandom1.nextInt() & 0x1F) + 192;
		@Pc(21) int[] local21 = new int[arg0.anInt1707];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1707; local25++) {
			local21[local25] = local23;
			if ((Static42.aRandom1.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method754(arg0, 4, 15, local21, null);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;IIIIII)V")
	public void method748(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method756(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt1707];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt1707; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method754(arg0, arg1 - this.method755(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!kd;I)I")
	public int method749(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method740(arg0, new int[] { arg1 }, Static42.aClass39Array11);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method755(Static42.aClass39Array11[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;II)V")
	private void method750(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1203;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt1707; local8++) {
			@Pc(16) int local16 = arg0.aByteArray50[local8] & 0xFF;
			if (local16 == 60) {
				local6 = local8;
			} else {
				@Pc(66) int local66;
				if (local16 == 62 && local6 != -1) {
					@Pc(36) Class39 local36 = arg0.method1173(local8, local6 + 1);
					local6 = -1;
					if (local36.method1159(Static42.aClass39_584)) {
						local16 = 60;
					} else {
						if (!local36.method1159(Static42.aClass39_579)) {
							if (local36.method1185(Static42.aClass39_580)) {
								try {
									local66 = local36.method1181(4).method1161();
									@Pc(70) Class1_Sub1_Sub4_Sub1 local70 = Static42.aClass1_Sub1_Sub4_Sub1Array4[local66];
									local70.method492(arg1, local4 + this.anInt1203 - local70.anInt870);
									arg1 += local70.anInt869;
								} catch (@Pc(87) Exception local87) {
								}
							} else {
								this.method745(local36);
							}
							continue;
						}
						local16 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(100) int local100 = this.anIntArray171[local16];
					local66 = this.anIntArray172[local16];
					if (local16 == 32) {
						if (Static42.anInt1214 > 0) {
							Static42.anInt1208 += Static42.anInt1214;
							arg1 += Static42.anInt1208 >> 8;
							Static42.anInt1208 &= 0xFF;
						}
					} else if (Static42.anInt1205 == 256) {
						if (Static42.anInt1206 != -1) {
							Static42.method739(this.aByteArrayArray4[local16], arg1 + 1, local4 + this.anIntArray173[local16] + 1, local100, local66, Static42.anInt1206);
						}
						Static42.method739(this.aByteArrayArray4[local16], arg1, local4 + this.anIntArray173[local16], local100, local66, Static42.anInt1209);
					} else {
						if (Static42.anInt1206 != -1) {
							Static42.method758(this.aByteArrayArray4[local16], arg1 + 1, local4 + this.anIntArray173[local16] + 1, local100, local66, Static42.anInt1206, Static42.anInt1205);
						}
						Static42.method758(this.aByteArrayArray4[local16], arg1, local4 + this.anIntArray173[local16], local100, local66, Static42.anInt1209, Static42.anInt1205);
					}
					if (Static42.anInt1212 != -1) {
						Static15.method1506(arg1, local4 + (int) ((double) this.anInt1203 * 0.7D), local100, Static42.anInt1212);
					}
					if (Static42.anInt1207 != -1) {
						Static15.method1506(arg1, local4 + this.anInt1203 + 1, local100, Static42.anInt1207);
					}
					arg1 += local100;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!kd;I)V")
	private void method751(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1175(); local5++) {
			@Pc(11) int local11 = arg0.method1167(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static42.anInt1214 = (arg1 - this.method755(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!kd;IIII)V")
	public void method753(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method756(arg3, arg4);
			this.method750(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;II[I[I)V")
	private void method754(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1203;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt1707; local10++) {
			@Pc(18) int local18 = arg0.aByteArray50[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(67) int local67;
				@Pc(76) int local76;
				@Pc(87) int local87;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class39 local38 = arg0.method1173(local10, local6 + 1);
					local6 = -1;
					if (local38.method1159(Static42.aClass39_584)) {
						local18 = 60;
					} else {
						if (!local38.method1159(Static42.aClass39_579)) {
							if (local38.method1185(Static42.aClass39_580)) {
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
									local87 = local38.method1181(4).method1161();
									@Pc(91) Class1_Sub1_Sub4_Sub1 local91 = Static42.aClass1_Sub1_Sub4_Sub1Array4[local87];
									local91.method492(arg1 + local67, local4 + this.anInt1203 - local91.anInt870 + local76);
									arg1 += local91.anInt869;
								} catch (@Pc(112) Exception local112) {
								}
							} else {
								this.method745(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					@Pc(125) int local125 = this.anIntArray171[local18];
					local67 = this.anIntArray172[local18];
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
						if (Static42.anInt1214 > 0) {
							Static42.anInt1208 += Static42.anInt1214;
							arg1 += Static42.anInt1208 >> 8;
							Static42.anInt1208 &= 0xFF;
						}
					} else if (Static42.anInt1205 == 256) {
						if (Static42.anInt1206 != -1) {
							Static42.method739(this.aByteArrayArray4[local18], arg1 + local76 + 1, local4 + this.anIntArray173[local18] + 1 + local87, local125, local67, Static42.anInt1206);
						}
						Static42.method739(this.aByteArrayArray4[local18], arg1 + local76, local4 + this.anIntArray173[local18] + local87, local125, local67, Static42.anInt1209);
					} else {
						if (Static42.anInt1206 != -1) {
							Static42.method758(this.aByteArrayArray4[local18], arg1 + local76 + 1, local4 + this.anIntArray173[local18] + 1 + local87, local125, local67, Static42.anInt1206, Static42.anInt1205);
						}
						Static42.method758(this.aByteArrayArray4[local18], arg1 + local76, local4 + this.anIntArray173[local18] + local87, local125, local67, Static42.anInt1209, Static42.anInt1205);
					}
					if (Static42.anInt1212 != -1) {
						Static15.method1506(arg1, local4 + (int) ((double) this.anInt1203 * 0.7D), local125, Static42.anInt1212);
					}
					if (Static42.anInt1207 != -1) {
						Static15.method1506(arg1, local4 + this.anInt1203, local125, Static42.anInt1207);
					}
					arg1 += local125;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!kd;)I")
	public int method755(@OriginalArg(0) Class39 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.anInt1707; local9++) {
			@Pc(17) int local17 = arg0.aByteArray50[local9] & 0xFF;
			if (local17 == 60) {
				local5 = local9;
			} else if (local17 == 62 && local5 != -1) {
				@Pc(37) Class39 local37 = arg0.method1173(local9, local5 + 1);
				local5 = -1;
				if (local37.method1159(Static42.aClass39_584)) {
					local7 += this.anIntArray171[60];
				} else if (local37.method1159(Static42.aClass39_579)) {
					local7 += this.anIntArray171[62];
				} else if (local37.method1185(Static42.aClass39_580)) {
					try {
						@Pc(77) int local77 = local37.method1181(4).method1161();
						local7 += Static42.aClass1_Sub1_Sub4_Sub1Array4[local77].anInt869;
					} catch (@Pc(86) Exception local86) {
					}
				}
			} else if (local5 == -1) {
				local7 += this.anIntArray171[local17];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	private void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static42.anInt1212 = -1;
		Static42.anInt1207 = -1;
		Static42.anInt1204 = arg1;
		Static42.anInt1206 = arg1;
		Static42.anInt1210 = arg0;
		Static42.anInt1209 = arg0;
		Static42.anInt1205 = 256;
		Static42.anInt1214 = 0;
		Static42.anInt1208 = 0;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!kd;IIII)V")
	public void method759(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method756(arg3, arg4);
			this.method750(arg0, arg1 - this.method755(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!kd;IIIIIIIII)V")
	public void method760(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return;
		}
		this.method756(arg5, arg6);
		if (arg9 == 0) {
			arg9 = this.anInt1203;
		}
		@Pc(18) int[] local18 = new int[] { arg3 };
		if (arg4 < this.anInt1211 + this.anInt1213 + arg9 && arg4 < arg9 + arg9) {
			local18 = null;
		}
		@Pc(40) int local40 = this.method740(arg0, local18, Static42.aClass39Array11);
		if (arg8 == 3 && local40 == 1) {
			arg8 = 1;
		}
		@Pc(55) int local55;
		@Pc(116) int local116;
		if (arg8 == 0) {
			local55 = arg2 + this.anInt1211;
		} else if (arg8 == 1) {
			local55 = arg2 + this.anInt1211 + (arg4 - this.anInt1211 - this.anInt1213 - (local40 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local55 = arg2 + arg4 - this.anInt1213 - (local40 - 1) * arg9;
		} else {
			local116 = (arg4 - this.anInt1211 - this.anInt1213 - (local40 - 1) * arg9) / (local40 + 1);
			if (local116 < 0) {
				local116 = 0;
			}
			local55 = arg2 + this.anInt1211 + local116;
			arg9 += local116;
		}
		for (local116 = 0; local116 < local40; local116++) {
			if (arg7 == 0) {
				this.method750(Static42.aClass39Array11[local116], arg1, local55);
			} else if (arg7 == 1) {
				this.method750(Static42.aClass39Array11[local116], arg1 + (arg3 - this.method755(Static42.aClass39Array11[local116])) / 2, local55);
			} else if (arg7 == 2) {
				this.method750(Static42.aClass39Array11[local116], arg1 + arg3 - this.method755(Static42.aClass39Array11[local116]), local55);
			} else if (local116 == local40 - 1) {
				this.method750(Static42.aClass39Array11[local116], arg1, local55);
			} else {
				this.method751(Static42.aClass39Array11[local116], arg3);
				this.method750(Static42.aClass39Array11[local116], arg1, local55);
				Static42.anInt1214 = 0;
			}
			local55 += arg9;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
	public int method761(@OriginalArg(0) int arg0) {
		return this.anIntArray171[arg0 & 0xFF];
	}
}
