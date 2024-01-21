import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public abstract class Class3_Sub3_Sub2_Sub4 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "[I")
	private int[] anIntArray348;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "[Lclient!qc;")
	private Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array11;

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "[[B")
	protected byte[][] aByteArrayArray8 = new byte[256][];

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
	public int anInt4004 = 0;

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!sc", name = "Bb", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!sc", name = "Eb", descriptor = "[I")
	private int[] anIntArray353;

	@OriginalMember(owner = "client!sc", name = "ub", descriptor = "[I")
	private int[] anIntArray351;

	@OriginalMember(owner = "client!sc", name = "xb", descriptor = "I")
	private int anInt4011;

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	private int anInt4001;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class3_Sub3_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray349 = arg1;
		this.anIntArray352 = arg2;
		this.anIntArray353 = arg3;
		this.anIntArray351 = arg4;
		this.method3102(arg0);
		this.aByteArrayArray8 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray352[local32] < local28 && this.anIntArray351[local32] != 0) {
				local28 = this.anIntArray352[local32];
			}
			if (this.anIntArray352[local32] + this.anIntArray351[local32] > local30) {
				local30 = this.anIntArray352[local32] + this.anIntArray351[local32];
			}
		}
		this.anInt4011 = this.anInt4004 - local28;
		this.anInt4001 = local30 - this.anInt4004;
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.method3102(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
	private void method3102(@OriginalArg(0) byte[] arg0) {
		this.anIntArray348 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray348.length; local9++) {
				this.anIntArray348[local9] = arg0[local9] & 0xFF;
			}
			this.anInt4004 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray348[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray49 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray49[(local182 << 8) + local150] = (byte) Static173.method3120(local93, local136, local58, this.anIntArray348, local55, local182, local150);
					}
				}
			}
		}
		this.anInt4004 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([Lclient!qc;[I)V")
	public final void method3103(@OriginalArg(0) Class3_Sub3_Sub2_Sub2[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass3_Sub3_Sub2_Sub2Array11 = arg0;
		this.anIntArray350 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;IIIIII)V")
	public final void method3104(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method3122(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2899];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2899; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method3118(arg0, arg1 - this.method3115(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;II)V")
	private void method3105(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt4004;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2899; local10++) {
			@Pc(18) int local18 = arg0.aByteArray30[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class70 local38 = arg0.method2023(local10, local6 + 1);
					local6 = -1;
					if (local38.method2032(Static173.aClass70_1946)) {
						local18 = 60;
					} else if (local38.method2032(Static173.aClass70_1953)) {
						local18 = 62;
					} else if (local38.method2032(Static173.aClass70_1964)) {
						local18 = 160;
					} else if (local38.method2032(Static173.aClass70_1947)) {
						local18 = 173;
					} else if (local38.method2032(Static173.aClass70_1948)) {
						local18 = 215;
					} else if (local38.method2032(Static173.aClass70_1945)) {
						local18 = 128;
					} else if (local38.method2032(Static173.aClass70_1956)) {
						local18 = 169;
					} else {
						if (!local38.method2032(Static173.aClass70_1951)) {
							if (local38.method2042(Static173.aClass70_1960)) {
								try {
									local116 = local38.method2019(4).method2025();
									@Pc(121) Class3_Sub3_Sub2_Sub2 local121 = this.aClass3_Sub3_Sub2_Sub2Array11[local116];
									@Pc(132) int local132 = this.anIntArray350 == null ? local121.anInt3221 : this.anIntArray350[local116];
									if (Static173.anInt4007 == 256) {
										local121.method2333(arg1, local4 + this.anInt4004 - local132);
									} else {
										local121.method2332(arg1, local4 + this.anInt4004 - local132, Static173.anInt4007);
									}
									arg1 += local121.anInt3217;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method3123(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray49 != null && local8 != -1) {
						arg1 += this.aByteArray49[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray353[local18];
					local116 = this.anIntArray351[local18];
					if (local18 == 32) {
						if (Static173.anInt4003 > 0) {
							Static173.anInt4009 += Static173.anInt4003;
							arg1 += Static173.anInt4009 >> 8;
							Static173.anInt4009 &= 0xFF;
						}
					} else if (Static173.anInt4007 == 256) {
						if (Static173.anInt4008 != -1) {
							this.method3112(local18, arg1 + this.anIntArray349[local18] + 1, local4 + this.anIntArray352[local18] + 1, local194, local116, Static173.anInt4008);
						}
						this.method3127(local18, arg1 + this.anIntArray349[local18], local4 + this.anIntArray352[local18], local194, local116, Static173.anInt4000);
					} else {
						if (Static173.anInt4008 != -1) {
							this.method3125(local18, arg1 + this.anIntArray349[local18] + 1, local4 + this.anIntArray352[local18] + 1, local194, local116, Static173.anInt4008, Static173.anInt4007);
						}
						this.method3124(local18, arg1 + this.anIntArray349[local18], local4 + this.anIntArray352[local18], local194, local116, Static173.anInt4000, Static173.anInt4007);
					}
					@Pc(316) int local316 = this.anIntArray348[local18];
					if (Static173.anInt4005 != -1) {
						Static104.method3098(arg1, local4 + (int) ((double) this.anInt4004 * 0.7D), local316, Static173.anInt4005);
					}
					if (Static173.anInt4006 != -1) {
						Static104.method3098(arg1, local4 + this.anInt4004 + 1, local316, Static173.anInt4006);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	private void method3106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static173.anInt4005 = -1;
		Static173.anInt4006 = -1;
		Static173.anInt4012 = arg1;
		Static173.anInt4008 = arg1;
		Static173.anInt4010 = arg0;
		Static173.anInt4000 = arg0;
		Static173.anInt4002 = arg2;
		Static173.anInt4007 = arg2;
		Static173.anInt4003 = 0;
		Static173.anInt4009 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;I)I")
	public final int method3107(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method3111(arg0, new int[] { arg1 }, Static173.aClass70Array73);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method3115(Static173.aClass70Array73[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;IIIII)V")
	public final void method3108(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3122(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2899];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2899; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3118(arg0, arg1 - this.method3115(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!oc;I)V")
	private void method3109(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method2045(); local5++) {
			@Pc(11) int local11 = arg0.method2055(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static173.anInt4003 = (arg1 - this.method3115(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Lclient!oc;I)I")
	public final int method3110(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		return this.method3111(arg0, new int[] { arg1 }, Static173.aClass70Array73);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;[I[Lclient!oc;)I")
	private int method3111(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class70[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class70 local11 = Static180.method2794(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method2045();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method2055(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class70 local55 = arg0.method2023(local29, local19 + 1);
					local19 = -1;
					local11.method2048(60);
					local11.method2031(local55);
					local11.method2048(62);
					if (local55.method2032(Static173.aClass70_1962)) {
						arg2[local23++] = local11.method2023(local11.method2045(), local7);
						local7 = local11.method2045();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method2032(Static173.aClass70_1946)) {
						local5 += this.method3116(60);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method2032(Static173.aClass70_1953)) {
						local5 += this.method3116(62);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method2032(Static173.aClass70_1964)) {
						local5 += this.method3116(160);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method2032(Static173.aClass70_1947)) {
						local5 += this.method3116(173);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method2032(Static173.aClass70_1948)) {
						local5 += this.method3116(215);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method2032(Static173.aClass70_1945)) {
						local5 += this.method3116(128);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method2032(Static173.aClass70_1956)) {
						local5 += this.method3116(169);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method2032(Static173.aClass70_1951)) {
						local5 += this.method3116(174);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method2042(Static173.aClass70_1960)) {
						try {
							@Pc(359) int local359 = local55.method2019(4).method2025();
							local5 += this.aClass3_Sub3_Sub2_Sub2Array11[local359].anInt3217;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method2048(local35);
						local5 += this.method3116(local35);
						if (this.aByteArray49 != null && local21 != -1) {
							local5 += this.aByteArray49[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method2045();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method2023(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method2045();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method2045() > local7) {
			arg2[local23++] = local11.method2023(local11.method2045(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(IIIIII)V")
	private void method3112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static104.anInt3996;
		@Pc(9) int local9 = Static104.anInt3996 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static104.anInt3994) {
			local20 = Static104.anInt3994 - arg2;
			arg4 -= local20;
			arg2 = Static104.anInt3994;
			local13 = local20 * arg3;
			local5 += local20 * Static104.anInt3996;
		}
		if (arg2 + arg4 > Static104.anInt3998) {
			arg4 -= arg2 + arg4 - Static104.anInt3998;
		}
		if (arg1 < Static104.anInt3999) {
			local20 = Static104.anInt3999 - arg1;
			arg3 -= local20;
			arg1 = Static104.anInt3999;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static104.anInt3995) {
			local20 = arg1 + arg3 - Static104.anInt3995;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static173.method3117(Static104.anIntArray347, this.aByteArrayArray8[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;IIII)V")
	public final void method3113(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3122(arg3, arg4);
			this.method3105(arg0, arg1 - this.method3115(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!oc;)I")
	public final int method3115(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2899; local11++) {
			@Pc(19) int local19 = arg0.aByteArray30[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class70 local39 = arg0.method2023(local11, local5 + 1);
					local5 = -1;
					if (local39.method2032(Static173.aClass70_1946)) {
						local19 = 60;
					} else if (local39.method2032(Static173.aClass70_1953)) {
						local19 = 62;
					} else if (local39.method2032(Static173.aClass70_1964)) {
						local19 = 160;
					} else if (local39.method2032(Static173.aClass70_1947)) {
						local19 = 173;
					} else if (local39.method2032(Static173.aClass70_1948)) {
						local19 = 215;
					} else if (local39.method2032(Static173.aClass70_1945)) {
						local19 = 128;
					} else if (local39.method2032(Static173.aClass70_1956)) {
						local19 = 169;
					} else {
						if (!local39.method2032(Static173.aClass70_1951)) {
							if (local39.method2042(Static173.aClass70_1960)) {
								try {
									@Pc(117) int local117 = local39.method2019(4).method2025();
									local9 += this.aClass3_Sub3_Sub2_Sub2Array11[local117].anInt3217;
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
					local9 += this.anIntArray348[local19];
					if (this.aByteArray49 != null && local7 != -1) {
						local9 += this.aByteArray49[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
	private int method3116(@OriginalArg(0) int arg0) {
		return this.anIntArray348[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;II[I[I)V")
	private void method3118(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt4004;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2899; local12++) {
			@Pc(20) int local20 = arg0.aByteArray30[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class70 local40 = arg0.method2023(local12, local6 + 1);
					local6 = -1;
					if (local40.method2032(Static173.aClass70_1946)) {
						local20 = 60;
					} else if (local40.method2032(Static173.aClass70_1953)) {
						local20 = 62;
					} else if (local40.method2032(Static173.aClass70_1964)) {
						local20 = 160;
					} else if (local40.method2032(Static173.aClass70_1947)) {
						local20 = 173;
					} else if (local40.method2032(Static173.aClass70_1948)) {
						local20 = 215;
					} else if (local40.method2032(Static173.aClass70_1945)) {
						local20 = 128;
					} else if (local40.method2032(Static173.aClass70_1956)) {
						local20 = 169;
					} else {
						if (!local40.method2032(Static173.aClass70_1951)) {
							if (local40.method2042(Static173.aClass70_1960)) {
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
									local137 = local40.method2019(4).method2025();
									@Pc(142) Class3_Sub3_Sub2_Sub2 local142 = this.aClass3_Sub3_Sub2_Sub2Array11[local137];
									@Pc(153) int local153 = this.anIntArray350 == null ? local142.anInt3221 : this.anIntArray350[local137];
									if (Static173.anInt4007 == 256) {
										local142.method2333(arg1 + local117, local4 + this.anInt4004 - local153 + local126);
									} else {
										local142.method2332(arg1 + local117, local4 + this.anInt4004 - local153 + local126, Static173.anInt4007);
									}
									arg1 += local142.anInt3217;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method3123(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray49 != null && local8 != -1) {
						arg1 += this.aByteArray49[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray353[local20];
					local117 = this.anIntArray351[local20];
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
						if (Static173.anInt4003 > 0) {
							Static173.anInt4009 += Static173.anInt4003;
							arg1 += Static173.anInt4009 >> 8;
							Static173.anInt4009 &= 0xFF;
						}
					} else if (Static173.anInt4007 == 256) {
						if (Static173.anInt4008 != -1) {
							this.method3112(local20, arg1 + this.anIntArray349[local20] + local126 + 1, local4 + this.anIntArray352[local20] + 1 + local137, local223, local117, Static173.anInt4008);
						}
						this.method3127(local20, arg1 + this.anIntArray349[local20] + local126, local4 + this.anIntArray352[local20] + local137, local223, local117, Static173.anInt4000);
					} else {
						if (Static173.anInt4008 != -1) {
							this.method3125(local20, arg1 + this.anIntArray349[local20] + local126 + 1, local4 + this.anIntArray352[local20] + 1 + local137, local223, local117, Static173.anInt4008, Static173.anInt4007);
						}
						this.method3124(local20, arg1 + this.anIntArray349[local20] + local126, local4 + this.anIntArray352[local20] + local137, local223, local117, Static173.anInt4000, Static173.anInt4007);
					}
					@Pc(380) int local380 = this.anIntArray348[local20];
					if (Static173.anInt4005 != -1) {
						Static104.method3098(arg1, local4 + (int) ((double) this.anInt4004 * 0.7D), local380, Static173.anInt4005);
					}
					if (Static173.anInt4006 != -1) {
						Static104.method3098(arg1, local4 + this.anInt4004, local380, Static173.anInt4006);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!oc;IIIII)V")
	public final void method3119(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method3122(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2899];
		@Pc(14) int[] local14 = new int[arg0.anInt2899];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2899; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method3118(arg0, arg1 - this.method3115(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!oc;IIII)V")
	public final void method3121(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3122(arg3, arg4);
			this.method3105(arg0, arg1 - this.method3115(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	private void method3122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static173.anInt4005 = -1;
		Static173.anInt4006 = -1;
		Static173.anInt4012 = arg1;
		Static173.anInt4008 = arg1;
		Static173.anInt4010 = arg0;
		Static173.anInt4000 = arg0;
		Static173.anInt4002 = 256;
		Static173.anInt4007 = 256;
		Static173.anInt4003 = 0;
		Static173.anInt4009 = 0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Lclient!oc;)V")
	private void method3123(@OriginalArg(0) Class70 arg0) {
		try {
			if (arg0.method2042(Static173.aClass70_1961)) {
				Static173.anInt4000 = arg0.method2019(4).method2029(16);
				return;
			}
			if (arg0.method2032(Static173.aClass70_1965)) {
				Static173.anInt4000 = Static173.anInt4010;
				return;
			}
			if (arg0.method2042(Static173.aClass70_1958)) {
				Static173.anInt4007 = arg0.method2019(6).method2025();
				return;
			}
			if (arg0.method2032(Static173.aClass70_1943)) {
				Static173.anInt4007 = Static173.anInt4002;
				return;
			}
			if (arg0.method2042(Static173.aClass70_1954)) {
				Static173.anInt4005 = arg0.method2019(4).method2029(16);
				return;
			}
			if (arg0.method2032(Static173.aClass70_1944)) {
				Static173.anInt4005 = 8388608;
				return;
			}
			if (arg0.method2032(Static173.aClass70_1950)) {
				Static173.anInt4005 = -1;
				return;
			}
			if (arg0.method2042(Static173.aClass70_1963)) {
				Static173.anInt4006 = arg0.method2019(2).method2029(16);
				return;
			}
			if (arg0.method2032(Static173.aClass70_1955)) {
				Static173.anInt4006 = 0;
				return;
			}
			if (arg0.method2032(Static173.aClass70_1949)) {
				Static173.anInt4006 = -1;
				return;
			}
			if (arg0.method2042(Static173.aClass70_1957)) {
				Static173.anInt4008 = arg0.method2019(5).method2029(16);
				return;
			}
			if (arg0.method2032(Static173.aClass70_1952)) {
				Static173.anInt4008 = 0;
				return;
			}
			if (arg0.method2032(Static173.aClass70_1959)) {
				Static173.anInt4008 = Static173.anInt4012;
				return;
			}
			if (arg0.method2032(Static173.aClass70_1962)) {
				this.method3106(Static173.anInt4010, Static173.anInt4012, Static173.anInt4002);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIIIIII)V")
	private void method3125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static104.anInt3996;
		@Pc(9) int local9 = Static104.anInt3996 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static104.anInt3994) {
			local20 = Static104.anInt3994 - arg2;
			arg4 -= local20;
			arg2 = Static104.anInt3994;
			local13 = local20 * arg3;
			local5 += local20 * Static104.anInt3996;
		}
		if (arg2 + arg4 > Static104.anInt3998) {
			arg4 -= arg2 + arg4 - Static104.anInt3998;
		}
		if (arg1 < Static104.anInt3999) {
			local20 = Static104.anInt3999 - arg1;
			arg3 -= local20;
			arg1 = Static104.anInt3999;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static104.anInt3995) {
			local20 = arg1 + arg3 - Static104.anInt3995;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static173.method3100(Static104.anIntArray347, this.aByteArrayArray8[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(Lclient!oc;IIII)V")
	public final void method3126(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method3122(arg3, arg4);
			this.method3105(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(IIIIII)V")
	protected abstract void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;IIIIIIIII)I")
	public final int method3128(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method3129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;IIIIIIIIII)I")
	private int method3129(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method3106(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt4004;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt4011 + this.anInt4001 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method3111(arg0, local20, Static173.aClass70Array73);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt4011;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt4011 + (arg4 - this.anInt4011 - this.anInt4001 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt4001 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt4011 - this.anInt4001 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt4011 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method3105(Static173.aClass70Array73[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method3105(Static173.aClass70Array73[local118], arg1 + (arg3 - this.method3115(Static173.aClass70Array73[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method3105(Static173.aClass70Array73[local118], arg1 + arg3 - this.method3115(Static173.aClass70Array73[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method3105(Static173.aClass70Array73[local118], arg1, local57);
			} else {
				this.method3109(Static173.aClass70Array73[local118], arg3);
				this.method3105(Static173.aClass70Array73[local118], arg1, local57);
				Static173.anInt4003 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oc;IIIILjava/util/Random;I)I")
	public final int method3130(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method3106(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2899];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2899; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method3118(arg0, arg1, arg2, local21, null);
		return local23;
	}
}
