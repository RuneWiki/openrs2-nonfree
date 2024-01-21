import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public abstract class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!ta", name = "qb", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!ta", name = "Mb", descriptor = "I")
	public int anInt968 = 0;

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!ta", name = "kb", descriptor = "[I")
	private int[] anIntArray137;

	@OriginalMember(owner = "client!ta", name = "tb", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!ta", name = "Bb", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!ta", name = "xb", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!ta", name = "sb", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray138 = arg1;
		this.anIntArray137 = arg2;
		this.anIntArray140 = arg3;
		this.anIntArray141 = arg4;
		this.method788(arg0);
		this.aByteArrayArray4 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray137[local32] < local28 && this.anIntArray141[local32] != 0) {
				local28 = this.anIntArray137[local32];
			}
			if (this.anIntArray137[local32] + this.anIntArray141[local32] > local30) {
				local30 = this.anIntArray137[local32] + this.anIntArray141[local32];
			}
		}
		this.anInt965 = this.anInt968 - local28;
		this.anInt961 = local30 - this.anInt968;
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0) {
		this.method788(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;I)V")
	private void method763(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1847(); local5++) {
			@Pc(11) int local11 = arg0.method1814(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static110.anInt962 = (arg1 - this.method791(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;[I[Lclient!sc;)I")
	private int method764(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class66[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class66 local11 = Static42.method942(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1847();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1814(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class66 local55 = arg0.method1807(local19 + 1, local29);
					local19 = -1;
					local11.method1805(60);
					local11.method1825(local55);
					local11.method1805(62);
					if (local55.method1824(Static110.aClass66_576)) {
						arg2[local23++] = local11.method1807(local7, local11.method1847());
						local7 = local11.method1847();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1824(Static110.aClass66_583)) {
						local5 += this.method777(60);
						if (this.aByteArray8 != null && local21 != -1) {
							local5 += this.aByteArray8[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1824(Static110.aClass66_588)) {
						local5 += this.method777(62);
						if (this.aByteArray8 != null && local21 != -1) {
							local5 += this.aByteArray8[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1829(Static110.aClass66_587)) {
						try {
							@Pc(173) int local173 = local55.method1831(4).method1840();
							local5 += Static110.aClass1_Sub1_Sub2_Sub3Array5[local173].anInt1430;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1805(local35);
						local5 += this.method777(local35);
						if (this.aByteArray8 != null && local21 != -1) {
							local5 += this.aByteArray8[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1847();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1807(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1847();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1847() > local7) {
			arg2[local23++] = local11.method1807(local7, local11.method1847());
		}
		return local23;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	private void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static110.anInt966 = -1;
		Static110.anInt964 = -1;
		Static110.anInt958 = arg1;
		Static110.anInt957 = arg1;
		Static110.anInt967 = arg0;
		Static110.anInt959 = arg0;
		Static110.anInt956 = arg2;
		Static110.anInt963 = arg2;
		Static110.anInt962 = 0;
		Static110.anInt960 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IIIIIIIIII)I")
	private int method767(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method765(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt968;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt965 + this.anInt961 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method764(arg0, local20, Static110.aClass66Array4);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt965;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt965 + (arg4 - this.anInt965 - this.anInt961 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt961 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt965 - this.anInt961 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt965 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method775(Static110.aClass66Array4[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method775(Static110.aClass66Array4[local118], arg1 + (arg3 - this.method791(Static110.aClass66Array4[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method775(Static110.aClass66Array4[local118], arg1 + arg3 - this.method791(Static110.aClass66Array4[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method775(Static110.aClass66Array4[local118], arg1, local57);
			} else {
				this.method763(Static110.aClass66Array4[local118], arg3);
				this.method775(Static110.aClass66Array4[local118], arg1, local57);
				Static110.anInt962 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IIIIII)V")
	public final void method771(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method783(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2583];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2583; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method785(arg0, arg1 - this.method791(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IIIIIIIII)I")
	public final int method773(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method767(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!sc;I)I")
	public final int method774(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method764(arg0, new int[] { arg1 }, Static110.aClass66Array4);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method791(Static110.aClass66Array4[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;II)V")
	private void method775(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt968;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2583; local10++) {
			@Pc(18) int local18 = arg0.aByteArray29[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class66 local38 = arg0.method1807(local6 + 1, local10);
					local6 = -1;
					if (local38.method1824(Static110.aClass66_583)) {
						local18 = 60;
					} else {
						if (!local38.method1824(Static110.aClass66_588)) {
							if (local38.method1829(Static110.aClass66_587)) {
								try {
									local68 = local38.method1831(4).method1840();
									@Pc(72) Class1_Sub1_Sub2_Sub3 local72 = Static110.aClass1_Sub1_Sub2_Sub3Array5[local68];
									local72.method997(arg1, local4 + this.anInt968 - local72.anInt1431);
									arg1 += local72.anInt1430;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method778(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray8 != null && local8 != -1) {
						arg1 += this.aByteArray8[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray140[local18];
					local68 = this.anIntArray141[local18];
					if (local18 == 32) {
						if (Static110.anInt962 > 0) {
							Static110.anInt960 += Static110.anInt962;
							arg1 += Static110.anInt960 >> 8;
							Static110.anInt960 &= 0xFF;
						}
					} else if (Static110.anInt963 == 256) {
						if (Static110.anInt957 != -1) {
							Static110.method766(this.aByteArrayArray4[local18], arg1 + this.anIntArray138[local18] + 1, local4 + this.anIntArray137[local18] + 1, local121, local68, Static110.anInt957);
						}
						this.method789(this.aByteArrayArray4[local18], arg1 + this.anIntArray138[local18], local4 + this.anIntArray137[local18], local121, local68, Static110.anInt959);
					} else {
						if (Static110.anInt957 != -1) {
							Static110.method769(this.aByteArrayArray4[local18], arg1 + this.anIntArray138[local18] + 1, local4 + this.anIntArray137[local18] + 1, local121, local68, Static110.anInt957, Static110.anInt963);
						}
						this.method792(this.aByteArrayArray4[local18], arg1 + this.anIntArray138[local18], local4 + this.anIntArray137[local18], local121, local68, Static110.anInt959, Static110.anInt963);
					}
					@Pc(253) int local253 = this.anIntArray139[local18];
					if (Static110.anInt966 != -1) {
						Static115.method1676(arg1, local4 + (int) ((double) this.anInt968 * 0.7D), local253, Static110.anInt966);
					}
					if (Static110.anInt964 != -1) {
						Static115.method1676(arg1, local4 + this.anInt968 + 1, local253, Static110.anInt964);
					}
					arg1 += local253;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IIII)V")
	public final void method776(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method783(arg3, arg4);
			this.method775(arg0, arg1 - this.method791(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)I")
	private int method777(@OriginalArg(0) int arg0) {
		return this.anIntArray139[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!sc;)V")
	private void method778(@OriginalArg(0) Class66 arg0) {
		try {
			if (arg0.method1829(Static110.aClass66_582)) {
				Static110.anInt959 = arg0.method1831(4).method1811(16);
				return;
			}
			if (arg0.method1824(Static110.aClass66_577)) {
				Static110.anInt959 = Static110.anInt967;
				return;
			}
			if (arg0.method1829(Static110.aClass66_584)) {
				Static110.anInt966 = arg0.method1831(4).method1811(16);
				return;
			}
			if (arg0.method1824(Static110.aClass66_585)) {
				Static110.anInt966 = 8388608;
				return;
			}
			if (arg0.method1824(Static110.aClass66_578)) {
				Static110.anInt966 = -1;
				return;
			}
			if (arg0.method1829(Static110.aClass66_586)) {
				Static110.anInt964 = arg0.method1831(2).method1811(16);
				return;
			}
			if (arg0.method1824(Static110.aClass66_580)) {
				Static110.anInt964 = 0;
				return;
			}
			if (arg0.method1824(Static110.aClass66_574)) {
				Static110.anInt964 = -1;
				return;
			}
			if (arg0.method1829(Static110.aClass66_575)) {
				Static110.anInt957 = arg0.method1831(5).method1811(16);
				return;
			}
			if (arg0.method1824(Static110.aClass66_579)) {
				Static110.anInt957 = 0;
				return;
			}
			if (arg0.method1824(Static110.aClass66_581)) {
				Static110.anInt957 = Static110.anInt958;
				return;
			}
			if (arg0.method1824(Static110.aClass66_576)) {
				this.method765(Static110.anInt967, Static110.anInt958, Static110.anInt956);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IIIILjava/util/Random;I)I")
	public final int method779(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method765(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2583];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2583; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method785(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!sc;I)I")
	public final int method780(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		return this.method764(arg0, new int[] { arg1 }, Static110.aClass66Array4);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!sc;IIII)V")
	public final void method781(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method783(arg3, arg4);
			this.method775(arg0, arg1 - this.method791(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;IIIII)V")
	public final void method782(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method783(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2583];
		@Pc(14) int[] local14 = new int[arg0.anInt2583];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2583; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method785(arg0, arg1 - this.method791(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	private void method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static110.anInt966 = -1;
		Static110.anInt964 = -1;
		Static110.anInt958 = arg1;
		Static110.anInt957 = arg1;
		Static110.anInt967 = arg0;
		Static110.anInt959 = arg0;
		Static110.anInt956 = 256;
		Static110.anInt963 = 256;
		Static110.anInt962 = 0;
		Static110.anInt960 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;II[I[I)V")
	private void method785(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt968;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2583; local12++) {
			@Pc(20) int local20 = arg0.aByteArray29[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class66 local40 = arg0.method1807(local6 + 1, local12);
					local6 = -1;
					if (local40.method1824(Static110.aClass66_583)) {
						local20 = 60;
					} else {
						if (!local40.method1824(Static110.aClass66_588)) {
							if (local40.method1829(Static110.aClass66_587)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method1831(4).method1840();
									@Pc(93) Class1_Sub1_Sub2_Sub3 local93 = Static110.aClass1_Sub1_Sub2_Sub3Array5[local89];
									local93.method997(arg1 + local69, local4 + this.anInt968 - local93.anInt1431 + local78);
									arg1 += local93.anInt1430;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method778(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray8 != null && local8 != -1) {
						arg1 += this.aByteArray8[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray140[local20];
					local69 = this.anIntArray141[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static110.anInt962 > 0) {
							Static110.anInt960 += Static110.anInt962;
							arg1 += Static110.anInt960 >> 8;
							Static110.anInt960 &= 0xFF;
						}
					} else if (Static110.anInt963 == 256) {
						if (Static110.anInt957 != -1) {
							Static110.method766(this.aByteArrayArray4[local20], arg1 + this.anIntArray138[local20] + local78 + 1, local4 + this.anIntArray137[local20] + 1 + local89, local146, local69, Static110.anInt957);
						}
						this.method789(this.aByteArrayArray4[local20], arg1 + this.anIntArray138[local20] + local78, local4 + this.anIntArray137[local20] + local89, local146, local69, Static110.anInt959);
					} else {
						if (Static110.anInt957 != -1) {
							Static110.method769(this.aByteArrayArray4[local20], arg1 + this.anIntArray138[local20] + local78 + 1, local4 + this.anIntArray137[local20] + 1 + local89, local146, local69, Static110.anInt957, Static110.anInt963);
						}
						this.method792(this.aByteArrayArray4[local20], arg1 + this.anIntArray138[local20] + local78, local4 + this.anIntArray137[local20] + local89, local146, local69, Static110.anInt959, Static110.anInt963);
					}
					@Pc(313) int local313 = this.anIntArray139[local20];
					if (Static110.anInt966 != -1) {
						Static115.method1676(arg1, local4 + (int) ((double) this.anInt968 * 0.7D), local313, Static110.anInt966);
					}
					if (Static110.anInt964 != -1) {
						Static115.method1676(arg1, local4 + this.anInt968, local313, Static110.anInt964);
					}
					arg1 += local313;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!sc;IIIII)V")
	public final void method787(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method783(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2583];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2583; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method785(arg0, arg1 - this.method791(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([B)V")
	private void method788(@OriginalArg(0) byte[] arg0) {
		this.anIntArray139 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray139.length; local9++) {
				this.anIntArray139[local9] = arg0[local9] & 0xFF;
			}
			this.anInt968 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray139[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray8 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray8[(local182 << 8) + local150] = (byte) Static110.method768(local93, local136, local58, this.anIntArray139, local55, local182, local150);
					}
				}
			}
		}
		this.anInt968 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([BIIIII)V")
	protected abstract void method789(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!sc;IIII)V")
	public final void method790(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method783(arg3, arg4);
			this.method775(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!sc;)I")
	public final int method791(@OriginalArg(0) Class66 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2583; local11++) {
			@Pc(19) int local19 = arg0.aByteArray29[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class66 local39 = arg0.method1807(local5 + 1, local11);
					local5 = -1;
					if (local39.method1824(Static110.aClass66_583)) {
						local19 = 60;
					} else {
						if (!local39.method1824(Static110.aClass66_588)) {
							if (local39.method1829(Static110.aClass66_587)) {
								try {
									@Pc(69) int local69 = local39.method1831(4).method1840();
									local9 += Static110.aClass1_Sub1_Sub2_Sub3Array5[local69].anInt1430;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray139[local19];
					if (this.aByteArray8 != null && local7 != -1) {
						local9 += this.aByteArray8[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([BIIIIII)V")
	protected abstract void method792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
