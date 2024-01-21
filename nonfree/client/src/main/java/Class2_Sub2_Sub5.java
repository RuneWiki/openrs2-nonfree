import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public abstract class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "[Lclient!fc;")
	private Class29[] aClass29Array4;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "I")
	public int anInt1400 = 0;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
	private int anInt1405;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	private int anInt1401;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class2_Sub2_Sub5(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray114 = arg1;
		this.anIntArray118 = arg2;
		this.anIntArray115 = arg3;
		this.anIntArray117 = arg4;
		this.method1097(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray118[local25] < local21 && this.anIntArray117[local25] != 0) {
				local21 = this.anIntArray118[local25];
			}
			if (this.anIntArray118[local25] + this.anIntArray117[local25] > local23) {
				local23 = this.anIntArray118[local25] + this.anIntArray117[local25];
			}
		}
		this.anInt1405 = this.anInt1400 - local21;
		this.anInt1401 = local23 - this.anInt1400;
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) byte[] arg0) {
		this.method1097(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;IIIII)V")
	public final void method1075(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1093(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3158];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3158; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1087(arg0, arg1 - this.method1089(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!qe;IIIII)V")
	public final void method1076(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1093(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt3158];
		@Pc(14) int[] local14 = new int[arg0.anInt3158];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt3158; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1087(arg0, arg1 - this.method1089(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	private void method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static136.anInt1406 = -1;
		Static136.anInt1404 = -1;
		Static136.anInt1408 = arg1;
		Static136.anInt1409 = arg1;
		Static136.anInt1407 = arg0;
		Static136.anInt1398 = arg0;
		Static136.anInt1403 = arg2;
		Static136.anInt1399 = arg2;
		Static136.anInt1397 = 0;
		Static136.anInt1402 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;I)I")
	public final int method1078(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1) {
		return this.method1079(arg0, new int[] { arg1 }, Static136.aClass83Array27);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;[I[Lclient!qe;)I")
	private int method1079(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class83[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class83 local11 = Static102.method1759(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2428();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2421(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class83 local55 = arg0.method2416(local29, local19 + 1);
					local19 = -1;
					local11.method2409(60);
					local11.method2417(local55);
					local11.method2409(62);
					if (local55.method2402(Static136.aClass83_436)) {
						arg2[local23++] = local11.method2416(local11.method2428(), local7);
						local7 = local11.method2428();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2402(Static136.aClass83_433)) {
						local5 += this.method1102(60);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2402(Static136.aClass83_430)) {
						local5 += this.method1102(62);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2402(Static136.aClass83_435)) {
						local5 += this.method1102(160);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method2402(Static136.aClass83_428)) {
						local5 += this.method1102(173);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method2402(Static136.aClass83_449)) {
						local5 += this.method1102(215);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method2402(Static136.aClass83_448)) {
						local5 += this.method1102(128);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method2402(Static136.aClass83_431)) {
						local5 += this.method1102(169);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method2402(Static136.aClass83_444)) {
						local5 += this.method1102(174);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method2415(Static136.aClass83_427)) {
						try {
							@Pc(359) int local359 = local55.method2422(4).method2399();
							local5 += this.aClass29Array4[local359].anInt1523;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2409(local35);
						local5 += this.method1102(local35);
						if (this.aByteArray16 != null && local21 != -1) {
							local5 += this.aByteArray16[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2428();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2416(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2428();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2428() > local7) {
			arg2[local23++] = local11.method2416(local11.method2428(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method1080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;IIII)V")
	public final void method1082(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1093(arg3, arg4);
			this.method1101(arg0, arg1 - this.method1089(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!qe;IIII)V")
	public final void method1083(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1093(arg3, arg4);
			this.method1101(arg0, arg1 - this.method1089(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!fc;[I)V")
	public final void method1085(@OriginalArg(0) Class29[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass29Array4 = arg0;
		this.anIntArray116 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;II[I[I)V")
	private void method1087(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1400;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt3158; local12++) {
			@Pc(20) int local20 = arg0.aByteArray36[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class83 local40 = arg0.method2416(local12, local6 + 1);
					local6 = -1;
					if (local40.method2402(Static136.aClass83_433)) {
						local20 = 60;
					} else if (local40.method2402(Static136.aClass83_430)) {
						local20 = 62;
					} else if (local40.method2402(Static136.aClass83_435)) {
						local20 = 160;
					} else if (local40.method2402(Static136.aClass83_428)) {
						local20 = 173;
					} else if (local40.method2402(Static136.aClass83_449)) {
						local20 = 215;
					} else if (local40.method2402(Static136.aClass83_448)) {
						local20 = 128;
					} else if (local40.method2402(Static136.aClass83_431)) {
						local20 = 169;
					} else {
						if (!local40.method2402(Static136.aClass83_444)) {
							if (local40.method2415(Static136.aClass83_427)) {
								try {
									if (arg3 == null) {
										local117 = 0;
									} else {
										local117 = arg3[local10];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local10];
									}
									local10++;
									local137 = local40.method2422(4).method2399();
									@Pc(142) Class29 local142 = this.aClass29Array4[local137];
									@Pc(153) int local153 = this.anIntArray116 == null ? local142.anInt1521 : this.anIntArray116[local137];
									if (Static136.anInt1399 == 256) {
										local142.method1184(arg1 + local117, local4 + this.anInt1400 - local153 + local126);
									} else {
										local142.method1186(arg1 + local117, local4 + this.anInt1400 - local153 + local126, Static136.anInt1399);
									}
									arg1 += local142.anInt1523;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1088(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray16 != null && local8 != -1) {
						arg1 += this.aByteArray16[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray115[local20];
					local117 = this.anIntArray117[local20];
					if (arg3 == null) {
						local126 = 0;
					} else {
						local126 = arg3[local10];
					}
					if (arg4 == null) {
						local137 = 0;
					} else {
						local137 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static136.anInt1397 > 0) {
							Static136.anInt1402 += Static136.anInt1397;
							arg1 += Static136.anInt1402 >> 8;
							Static136.anInt1402 &= 0xFF;
						}
					} else if (Static136.anInt1399 == 256) {
						if (Static136.anInt1409 != -1) {
							this.method1084(local20, arg1 + this.anIntArray114[local20] + local126 + 1, local4 + this.anIntArray118[local20] + 1 + local137, local223, local117, Static136.anInt1409);
						}
						this.method1096(local20, arg1 + this.anIntArray114[local20] + local126, local4 + this.anIntArray118[local20] + local137, local223, local117, Static136.anInt1398);
					} else {
						if (Static136.anInt1409 != -1) {
							this.method1080(local20, arg1 + this.anIntArray114[local20] + local126 + 1, local4 + this.anIntArray118[local20] + 1 + local137, local223, local117, Static136.anInt1409, Static136.anInt1399);
						}
						this.method1081(local20, arg1 + this.anIntArray114[local20] + local126, local4 + this.anIntArray118[local20] + local137, local223, local117, Static136.anInt1398, Static136.anInt1399);
					}
					@Pc(380) int local380 = this.anIntArray113[local20];
					if (Static136.anInt1406 != -1) {
						Static126.method2132(arg1, local4 + (int) ((double) this.anInt1400 * 0.7D), local380, Static136.anInt1406);
					}
					if (Static136.anInt1404 != -1) {
						Static126.method2132(arg1, local4 + this.anInt1400, local380, Static136.anInt1404);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;)V")
	private void method1088(@OriginalArg(0) Class83 arg0) {
		try {
			if (arg0.method2415(Static136.aClass83_446)) {
				Static136.anInt1398 = arg0.method2422(4).method2412(16);
				return;
			}
			if (arg0.method2402(Static136.aClass83_440)) {
				Static136.anInt1398 = Static136.anInt1407;
				return;
			}
			if (arg0.method2415(Static136.aClass83_434)) {
				Static136.anInt1399 = arg0.method2422(6).method2399();
				return;
			}
			if (arg0.method2402(Static136.aClass83_447)) {
				Static136.anInt1399 = Static136.anInt1403;
				return;
			}
			if (arg0.method2415(Static136.aClass83_443)) {
				Static136.anInt1406 = arg0.method2422(4).method2412(16);
				return;
			}
			if (arg0.method2402(Static136.aClass83_439)) {
				Static136.anInt1406 = 8388608;
				return;
			}
			if (arg0.method2402(Static136.aClass83_442)) {
				Static136.anInt1406 = -1;
				return;
			}
			if (arg0.method2415(Static136.aClass83_438)) {
				Static136.anInt1404 = arg0.method2422(2).method2412(16);
				return;
			}
			if (arg0.method2402(Static136.aClass83_437)) {
				Static136.anInt1404 = 0;
				return;
			}
			if (arg0.method2402(Static136.aClass83_432)) {
				Static136.anInt1404 = -1;
				return;
			}
			if (arg0.method2415(Static136.aClass83_445)) {
				Static136.anInt1409 = arg0.method2422(5).method2412(16);
				return;
			}
			if (arg0.method2402(Static136.aClass83_429)) {
				Static136.anInt1409 = 0;
				return;
			}
			if (arg0.method2402(Static136.aClass83_441)) {
				Static136.anInt1409 = Static136.anInt1408;
				return;
			}
			if (arg0.method2402(Static136.aClass83_436)) {
				this.method1077(Static136.anInt1407, Static136.anInt1408, Static136.anInt1403);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!qe;)I")
	public final int method1089(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt3158; local11++) {
			@Pc(19) int local19 = arg0.aByteArray36[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class83 local39 = arg0.method2416(local11, local5 + 1);
					local5 = -1;
					if (local39.method2402(Static136.aClass83_433)) {
						local19 = 60;
					} else if (local39.method2402(Static136.aClass83_430)) {
						local19 = 62;
					} else if (local39.method2402(Static136.aClass83_435)) {
						local19 = 160;
					} else if (local39.method2402(Static136.aClass83_428)) {
						local19 = 173;
					} else if (local39.method2402(Static136.aClass83_449)) {
						local19 = 215;
					} else if (local39.method2402(Static136.aClass83_448)) {
						local19 = 128;
					} else if (local39.method2402(Static136.aClass83_431)) {
						local19 = 169;
					} else {
						if (!local39.method2402(Static136.aClass83_444)) {
							if (local39.method2415(Static136.aClass83_427)) {
								try {
									@Pc(117) int local117 = local39.method2422(4).method2399();
									local9 += this.aClass29Array4[local117].anInt1523;
									local7 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray113[local19];
					if (this.aByteArray16 != null && local7 != -1) {
						local9 += this.aByteArray16[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!qe;I)V")
	private void method1090(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2428(); local5++) {
			@Pc(11) int local11 = arg0.method2421(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static136.anInt1397 = (arg1 - this.method1089(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;IIIIIIIIII)I")
	private int method1091(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1077(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1400;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1405 + this.anInt1401 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1079(arg0, local20, Static136.aClass83Array27);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1405;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1405 + (arg4 - this.anInt1405 - this.anInt1401 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1401 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1405 - this.anInt1401 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1405 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1101(Static136.aClass83Array27[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1101(Static136.aClass83Array27[local118], arg1 + (arg3 - this.method1089(Static136.aClass83Array27[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1101(Static136.aClass83Array27[local118], arg1 + arg3 - this.method1089(Static136.aClass83Array27[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1101(Static136.aClass83Array27[local118], arg1, local57);
			} else {
				this.method1090(Static136.aClass83Array27[local118], arg3);
				this.method1101(Static136.aClass83Array27[local118], arg1, local57);
				Static136.anInt1397 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;IIIIII)V")
	public final void method1092(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1093(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt3158];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3158; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1087(arg0, arg1 - this.method1089(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	private void method1093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static136.anInt1406 = -1;
		Static136.anInt1404 = -1;
		Static136.anInt1408 = arg1;
		Static136.anInt1409 = arg1;
		Static136.anInt1407 = arg0;
		Static136.anInt1398 = arg0;
		Static136.anInt1403 = 256;
		Static136.anInt1399 = 256;
		Static136.anInt1397 = 0;
		Static136.anInt1402 = 0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Lclient!qe;I)I")
	public final int method1094(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1079(arg0, new int[] { arg1 }, Static136.aClass83Array27);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1089(Static136.aClass83Array27[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;IIIILjava/util/Random;I)I")
	public final int method1095(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1077(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt3158];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt3158; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1087(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([B)V")
	private void method1097(@OriginalArg(0) byte[] arg0) {
		this.anIntArray113 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray113.length; local9++) {
				this.anIntArray113[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1400 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray113[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray16 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray16[(local182 << 8) + local150] = (byte) Static136.method1086(local93, local136, local58, this.anIntArray113, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1400 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;IIIIIIIII)I")
	public final int method1099(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1091(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Lclient!qe;IIII)V")
	public final void method1100(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1093(arg3, arg4);
			this.method1101(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qe;II)V")
	private void method1101(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1400;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt3158; local10++) {
			@Pc(18) int local18 = arg0.aByteArray36[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class83 local38 = arg0.method2416(local10, local6 + 1);
					local6 = -1;
					if (local38.method2402(Static136.aClass83_433)) {
						local18 = 60;
					} else if (local38.method2402(Static136.aClass83_430)) {
						local18 = 62;
					} else if (local38.method2402(Static136.aClass83_435)) {
						local18 = 160;
					} else if (local38.method2402(Static136.aClass83_428)) {
						local18 = 173;
					} else if (local38.method2402(Static136.aClass83_449)) {
						local18 = 215;
					} else if (local38.method2402(Static136.aClass83_448)) {
						local18 = 128;
					} else if (local38.method2402(Static136.aClass83_431)) {
						local18 = 169;
					} else {
						if (!local38.method2402(Static136.aClass83_444)) {
							if (local38.method2415(Static136.aClass83_427)) {
								try {
									local116 = local38.method2422(4).method2399();
									@Pc(121) Class29 local121 = this.aClass29Array4[local116];
									@Pc(132) int local132 = this.anIntArray116 == null ? local121.anInt1521 : this.anIntArray116[local116];
									if (Static136.anInt1399 == 256) {
										local121.method1184(arg1, local4 + this.anInt1400 - local132);
									} else {
										local121.method1186(arg1, local4 + this.anInt1400 - local132, Static136.anInt1399);
									}
									arg1 += local121.anInt1523;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1088(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray16 != null && local8 != -1) {
						arg1 += this.aByteArray16[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray115[local18];
					local116 = this.anIntArray117[local18];
					if (local18 == 32) {
						if (Static136.anInt1397 > 0) {
							Static136.anInt1402 += Static136.anInt1397;
							arg1 += Static136.anInt1402 >> 8;
							Static136.anInt1402 &= 0xFF;
						}
					} else if (Static136.anInt1399 == 256) {
						if (Static136.anInt1409 != -1) {
							this.method1084(local18, arg1 + this.anIntArray114[local18] + 1, local4 + this.anIntArray118[local18] + 1, local194, local116, Static136.anInt1409);
						}
						this.method1096(local18, arg1 + this.anIntArray114[local18], local4 + this.anIntArray118[local18], local194, local116, Static136.anInt1398);
					} else {
						if (Static136.anInt1409 != -1) {
							this.method1080(local18, arg1 + this.anIntArray114[local18] + 1, local4 + this.anIntArray118[local18] + 1, local194, local116, Static136.anInt1409, Static136.anInt1399);
						}
						this.method1081(local18, arg1 + this.anIntArray114[local18], local4 + this.anIntArray118[local18], local194, local116, Static136.anInt1398, Static136.anInt1399);
					}
					@Pc(316) int local316 = this.anIntArray113[local18];
					if (Static136.anInt1406 != -1) {
						Static126.method2132(arg1, local4 + (int) ((double) this.anInt1400 * 0.7D), local316, Static136.anInt1406);
					}
					if (Static136.anInt1404 != -1) {
						Static126.method2132(arg1, local4 + this.anInt1400 + 1, local316, Static136.anInt1404);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
	private int method1102(@OriginalArg(0) int arg0) {
		return this.anIntArray113[arg0 & 0xFF];
	}
}
