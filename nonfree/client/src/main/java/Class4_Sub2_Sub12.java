import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public abstract class Class4_Sub2_Sub12 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "[Lclient!hi;")
	private Class59[] aClass59Array5;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	public int anInt5274 = 0;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "[I")
	protected int[] anIntArray467;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
	protected int[] anIntArray465;

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
	private int anInt5270;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	private int anInt5269;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class4_Sub2_Sub12(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray468 = arg1;
		this.anIntArray469 = arg2;
		this.anIntArray467 = arg3;
		this.anIntArray465 = arg4;
		this.method4176(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray469[local25] < local21 && this.anIntArray465[local25] != 0) {
				local21 = this.anIntArray469[local25];
			}
			if (this.anIntArray469[local25] + this.anIntArray465[local25] > local23) {
				local23 = this.anIntArray469[local25] + this.anIntArray465[local25];
			}
		}
		this.anInt5270 = this.anInt5274 - local21;
		this.anInt5269 = local23 - this.anInt5274;
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V")
	public Class4_Sub2_Sub12(@OriginalArg(0) byte[] arg0) {
		this.method4176(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method4173(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method4181(arg3, arg4);
			this.method4189(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method4174(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt5274;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				@Pc(109) int local109;
				@Pc(118) int local118;
				@Pc(128) int local128;
				if (local22 == '>' && local6 != -1) {
					@Pc(41) String local41 = arg0.substring(local6 + 1, local15);
					local6 = -1;
					if (local41.equals("lt")) {
						local22 = '<';
					} else if (local41.equals("gt")) {
						local22 = '>';
					} else if (local41.equals("nbsp")) {
						local22 = ' ';
					} else if (local41.equals("shy")) {
						local22 = '\u00ad';
					} else if (local41.equals("times")) {
						local22 = '×';
					} else if (local41.equals("euro")) {
						local22 = '€';
					} else if (local41.equals("copy")) {
						local22 = '©';
					} else {
						if (!local41.equals("reg")) {
							if (local41.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local109 = 0;
									} else {
										local109 = arg3[local10];
									}
									if (arg4 == null) {
										local118 = 0;
									} else {
										local118 = arg4[local10];
									}
									local10++;
									local128 = Static224.method3585(local41.substring(4));
									@Pc(133) Class59 local133 = this.aClass59Array5[local128];
									@Pc(144) int local144 = this.anIntArray470 == null ? local133.anInt4749 : this.anIntArray470[local128];
									if (Static293.anInt5275 == 256) {
										local133.method3790(arg1 + local109, local4 + this.anInt5274 - local144 + local118);
									} else {
										local133.method3792(arg1 + local109, local4 + this.anInt5274 - local144 + local118, Static293.anInt5275);
									}
									arg1 += local133.anInt4747;
									local8 = '\u0000';
								} catch (@Pc(184) Exception local184) {
								}
							} else {
								this.method4188(local41);
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local22 = (char) (Static33.method482(local22) & 0xFF);
					if (this.aByteArray70 != null && local8 != '\u0000') {
						arg1 += this.aByteArray70[(local8 << 8) + local22];
					}
					@Pc(220) int local220 = this.anIntArray467[local22];
					local109 = this.anIntArray465[local22];
					if (arg3 == null) {
						local118 = 0;
					} else {
						local118 = arg3[local10];
					}
					if (arg4 == null) {
						local128 = 0;
					} else {
						local128 = arg4[local10];
					}
					local10++;
					if (local22 == ' ') {
						if (Static293.anInt5271 > 0) {
							Static293.anInt5272 += Static293.anInt5271;
							arg1 += Static293.anInt5272 >> 8;
							Static293.anInt5272 &= 0xFF;
						}
					} else if (Static293.anInt5275 == 256) {
						if (Static293.anInt5277 != -1) {
							this.method4183(local22, arg1 + this.anIntArray468[local22] + local118 + 1, local4 + this.anIntArray469[local22] + 1 + local128, local220, local109, Static293.anInt5277);
						}
						this.method4183(local22, arg1 + this.anIntArray468[local22] + local118, local4 + this.anIntArray469[local22] + local128, local220, local109, Static293.anInt5281);
					} else {
						if (Static293.anInt5277 != -1) {
							this.method4175(local22, arg1 + this.anIntArray468[local22] + local118 + 1, local4 + this.anIntArray469[local22] + 1 + local128, local220, local109, Static293.anInt5277, Static293.anInt5275);
						}
						this.method4175(local22, arg1 + this.anIntArray468[local22] + local118, local4 + this.anIntArray469[local22] + local128, local220, local109, Static293.anInt5281, Static293.anInt5275);
					}
					@Pc(381) int local381 = this.anIntArray466[local22];
					if (Static293.anInt5273 != -1) {
						if (Static178.aBoolean216) {
							Static186.method2960(arg1, local4 + (int) ((double) this.anInt5274 * 0.7D), local381, Static293.anInt5273);
						} else {
							Static166.method2615(arg1, local4 + (int) ((double) this.anInt5274 * 0.7D), local381, Static293.anInt5273);
						}
					}
					if (Static293.anInt5280 != -1) {
						if (Static178.aBoolean216) {
							Static186.method2960(arg1, local4 + this.anInt5274, local381, Static293.anInt5280);
						} else {
							Static166.method2615(arg1, local4 + this.anInt5274, local381, Static293.anInt5280);
						}
					}
					arg1 += local381;
					local8 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([B)V")
	private void method4176(@OriginalArg(0) byte[] arg0) {
		this.anIntArray466 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray466.length; local9++) {
				this.anIntArray466[local9] = arg0[local9] & 0xFF;
			}
			this.anInt5274 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray466[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		@Pc(60) int local60;
		for (local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (local60 = 0; local60 < 256; local60++) {
			local58[local60] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(109) int local109;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(107) byte local107 = 0;
			for (local109 = 0; local109 < local93[local95].length; local109++) {
				local107 += arg0[local9++];
				local93[local95][local109] = local107;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(138) int local138;
		for (local138 = 0; local138 < 256; local138++) {
			local136[local138] = new byte[local55[local138]];
			@Pc(150) byte local150 = 0;
			for (@Pc(152) int local152 = 0; local152 < local136[local138].length; local152++) {
				local150 += arg0[local9++];
				local136[local138][local152] = local150;
			}
		}
		this.aByteArray70 = new byte[65536];
		for (local138 = 0; local138 < 256; local138++) {
			if (local138 != 32 && local138 != 160) {
				for (local109 = 0; local109 < 256; local109++) {
					if (local109 != 32 && local109 != 160) {
						this.aByteArray70[(local138 << 8) + local109] = (byte) Static293.method4193(local93, local136, local58, this.anIntArray466, local55, local138, local109);
					}
				}
			}
		}
		this.anInt5274 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	private void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static293.anInt5273 = -1;
		Static293.anInt5280 = -1;
		Static293.anInt5279 = arg1;
		Static293.anInt5277 = arg1;
		Static293.anInt5278 = arg0;
		Static293.anInt5281 = arg0;
		Static293.anInt5276 = arg2;
		Static293.anInt5275 = arg2;
		Static293.anInt5271 = 0;
		Static293.anInt5272 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public final int method4178(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method4190(arg0, new int[] { arg1 }, Static293.aStringArray37);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.method4195(Static293.aStringArray37[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method4179(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method4181(arg3, arg4);
			this.method4189(arg0, arg1 - this.method4195(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method4180(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4181(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4174(arg0, arg1 - this.method4195(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	private void method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static293.anInt5273 = -1;
		Static293.anInt5280 = -1;
		Static293.anInt5279 = arg1;
		Static293.anInt5277 = arg1;
		Static293.anInt5278 = arg0;
		Static293.anInt5281 = arg0;
		Static293.anInt5276 = 256;
		Static293.anInt5275 = 256;
		Static293.anInt5271 = 0;
		Static293.anInt5272 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method4182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method4177(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method4174(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method4184(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method4181(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.method4174(arg0, arg1 - this.method4195(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int method4185(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method4190(arg0, new int[] { arg1 }, Static293.aStringArray37);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method4186(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method4181(arg3, arg4);
			this.method4189(arg0, arg1 - this.method4195(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method4187(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method4177(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27;
		for (local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg9.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		local27 = arg1;
		@Pc(49) int local49 = arg2 + this.anInt5270;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt5270 - this.anInt5269) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt5269;
		}
		if (arg7 == 1) {
			local51 = this.method4195(arg0) + local25;
			local27 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method4195(arg0) + local25;
			local27 = arg1 + arg3 - local51;
		}
		this.method4174(arg0, local27, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method4195(arg0) + local25;
			}
			arg11[0] = local27;
			arg11[1] = local49 - this.anInt5270;
			arg11[2] = local51;
			arg11[3] = this.anInt5270 + this.anInt5269;
		}
		return local25;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;)V")
	private void method4188(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static293.anInt5281 = Static249.method3765(arg0.substring(4));
			} else if (arg0.equals("/col")) {
				Static293.anInt5281 = Static293.anInt5278;
			} else if (arg0.startsWith("trans=")) {
				Static293.anInt5275 = Static224.method3585(arg0.substring(6));
			} else if (arg0.equals("/trans")) {
				Static293.anInt5275 = Static293.anInt5276;
			} else if (arg0.startsWith("str=")) {
				Static293.anInt5273 = Static249.method3765(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static293.anInt5273 = 8388608;
			} else if (arg0.equals("/str")) {
				Static293.anInt5273 = -1;
			} else if (arg0.startsWith("u=")) {
				Static293.anInt5280 = Static249.method3765(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static293.anInt5280 = 0;
			} else if (arg0.equals("/u")) {
				Static293.anInt5280 = -1;
			} else if (arg0.startsWith("shad=")) {
				Static293.anInt5277 = Static249.method3765(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static293.anInt5277 = 0;
			} else if (arg0.equals("/shad")) {
				Static293.anInt5277 = Static293.anInt5279;
			} else if (arg0.equals("br")) {
				this.method4177(Static293.anInt5278, Static293.anInt5279, Static293.anInt5276);
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;II)V")
	private void method4189(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt5274;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(20) char local20 = arg0.charAt(local13);
			if (local20 == '<') {
				local6 = local13;
			} else {
				@Pc(107) int local107;
				if (local20 == '>' && local6 != -1) {
					@Pc(39) String local39 = arg0.substring(local6 + 1, local13);
					local6 = -1;
					if (local39.equals("lt")) {
						local20 = '<';
					} else if (local39.equals("gt")) {
						local20 = '>';
					} else if (local39.equals("nbsp")) {
						local20 = ' ';
					} else if (local39.equals("shy")) {
						local20 = '\u00ad';
					} else if (local39.equals("times")) {
						local20 = '×';
					} else if (local39.equals("euro")) {
						local20 = '€';
					} else if (local39.equals("copy")) {
						local20 = '©';
					} else {
						if (!local39.equals("reg")) {
							if (local39.startsWith("img=")) {
								try {
									local107 = Static224.method3585(local39.substring(4));
									@Pc(112) Class59 local112 = this.aClass59Array5[local107];
									@Pc(123) int local123 = this.anIntArray470 == null ? local112.anInt4749 : this.anIntArray470[local107];
									if (Static293.anInt5275 == 256) {
										local112.method3790(arg1, local4 + this.anInt5274 - local123);
									} else {
										local112.method3792(arg1, local4 + this.anInt5274 - local123, Static293.anInt5275);
									}
									arg1 += local112.anInt4747;
									local8 = '\u0000';
								} catch (@Pc(155) Exception local155) {
								}
							} else {
								this.method4188(local39);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					local20 = (char) (Static33.method482(local20) & 0xFF);
					if (this.aByteArray70 != null && local8 != '\u0000') {
						arg1 += this.aByteArray70[(local8 << 8) + local20];
					}
					@Pc(191) int local191 = this.anIntArray467[local20];
					local107 = this.anIntArray465[local20];
					if (local20 == ' ') {
						if (Static293.anInt5271 > 0) {
							Static293.anInt5272 += Static293.anInt5271;
							arg1 += Static293.anInt5272 >> 8;
							Static293.anInt5272 &= 0xFF;
						}
					} else if (Static293.anInt5275 == 256) {
						if (Static293.anInt5277 != -1) {
							this.method4183(local20, arg1 + this.anIntArray468[local20] + 1, local4 + this.anIntArray469[local20] + 1, local191, local107, Static293.anInt5277);
						}
						this.method4183(local20, arg1 + this.anIntArray468[local20], local4 + this.anIntArray469[local20], local191, local107, Static293.anInt5281);
					} else {
						if (Static293.anInt5277 != -1) {
							this.method4175(local20, arg1 + this.anIntArray468[local20] + 1, local4 + this.anIntArray469[local20] + 1, local191, local107, Static293.anInt5277, Static293.anInt5275);
						}
						this.method4175(local20, arg1 + this.anIntArray468[local20], local4 + this.anIntArray469[local20], local191, local107, Static293.anInt5281, Static293.anInt5275);
					}
					@Pc(317) int local317 = this.anIntArray466[local20];
					if (Static293.anInt5273 != -1) {
						if (Static178.aBoolean216) {
							Static186.method2960(arg1, local4 + (int) ((double) this.anInt5274 * 0.7D), local317, Static293.anInt5273);
						} else {
							Static166.method2615(arg1, local4 + (int) ((double) this.anInt5274 * 0.7D), local317, Static293.anInt5273);
						}
					}
					if (Static293.anInt5280 != -1) {
						if (Static178.aBoolean216) {
							Static186.method2960(arg1, local4 + this.anInt5274 + 1, local317, Static293.anInt5280);
						} else {
							Static166.method2615(arg1, local4 + this.anInt5274 + 1, local317, Static293.anInt5280);
						}
					}
					arg1 += local317;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method4190(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static45.method711(Static293.aStringBuffer3);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		@Pc(19) byte local19 = 0;
		@Pc(21) int local21 = -1;
		@Pc(23) char local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = arg0.length();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(37) char local37 = arg0.charAt(local30);
			if (local37 == '<') {
				local21 = local30;
			} else {
				if (local37 == '>' && local21 != -1) {
					@Pc(56) String local56 = arg0.substring(local21 + 1, local30);
					local21 = -1;
					Static293.aStringBuffer3.append('<');
					Static293.aStringBuffer3.append(local56);
					Static293.aStringBuffer3.append('>');
					if (local56.equals("br")) {
						arg2[local25] = Static293.aStringBuffer3.toString().substring(local13, Static293.aStringBuffer3.length());
						local25++;
						local13 = Static293.aStringBuffer3.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local56.equals("lt")) {
						local11 += this.method4191('<');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local56.equals("gt")) {
						local11 += this.method4191('>');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local56.equals("nbsp")) {
						local11 += this.method4191(' ');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local56.equals("shy")) {
						local11 += this.method4191('\u00ad');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local56.equals("times")) {
						local11 += this.method4191('×');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local56.equals("euro")) {
						local11 += this.method4191('€');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local56.equals("copy")) {
						local11 += this.method4191('©');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local56.equals("reg")) {
						local11 += this.method4191('®');
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local56.startsWith("img=")) {
						try {
							@Pc(336) int local336 = Static224.method3585(local56.substring(4));
							local11 += this.aClass59Array5[local336].anInt4747;
							local23 = '\u0000';
						} catch (@Pc(348) Exception local348) {
						}
					}
					local37 = '\u0000';
				}
				if (local21 == -1) {
					if (local37 != '\u0000') {
						Static293.aStringBuffer3.append(local37);
						local37 = (char) (Static33.method482(local37) & 0xFF);
						local11 += this.anIntArray466[local37];
						if (this.aByteArray70 != null && local23 != '\u0000') {
							local11 += this.aByteArray70[(local23 << 8) + local37];
						}
						local23 = local37;
					}
					if (local37 == ' ') {
						local15 = Static293.aStringBuffer3.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static293.aStringBuffer3.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local37 == '-') {
						local15 = Static293.aStringBuffer3.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static293.aStringBuffer3.length() > local13) {
			arg2[local25] = Static293.aStringBuffer3.toString().substring(local13, Static293.aStringBuffer3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(C)I")
	private int method4191(@OriginalArg(0) char arg0) {
		return this.anIntArray466[Static33.method482(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method4194(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method4177(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt5274;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt5270 + this.anInt5269 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method4190(arg0, local20, Static293.aStringArray37);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt5270;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt5270 + (arg4 - this.anInt5270 - this.anInt5269 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt5269 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt5270 - this.anInt5269 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt5270 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method4189(Static293.aStringArray37[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method4189(Static293.aStringArray37[local118], arg1 + (arg3 - this.method4195(Static293.aStringArray37[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method4189(Static293.aStringArray37[local118], arg1 + arg3 - this.method4195(Static293.aStringArray37[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method4189(Static293.aStringArray37[local118], arg1, local57);
			} else {
				this.method4197(Static293.aStringArray37[local118], arg3);
				this.method4189(Static293.aStringArray37[local118], arg1, local57);
				Static293.anInt5271 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Ljava/lang/String;)I")
	public final int method4195(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) char local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(21) char local21 = arg0.charAt(local14);
			if (local21 == '<') {
				local5 = local14;
			} else {
				if (local21 == '>' && local5 != -1) {
					@Pc(40) String local40 = arg0.substring(local5 + 1, local14);
					local5 = -1;
					if (local40.equals("lt")) {
						local21 = '<';
					} else if (local40.equals("gt")) {
						local21 = '>';
					} else if (local40.equals("nbsp")) {
						local21 = ' ';
					} else if (local40.equals("shy")) {
						local21 = '\u00ad';
					} else if (local40.equals("times")) {
						local21 = '×';
					} else if (local40.equals("euro")) {
						local21 = '€';
					} else if (local40.equals("copy")) {
						local21 = '©';
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=")) {
								try {
									@Pc(108) int local108 = Static224.method3585(local40.substring(4));
									local9 += this.aClass59Array5[local108].anInt4747;
									local7 = '\u0000';
								} catch (@Pc(120) Exception local120) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local21 = (char) (Static33.method482(local21) & 0xFF);
					local9 += this.anIntArray466[local21];
					if (this.aByteArray70 != null && local7 != '\u0000') {
						local9 += this.aByteArray70[(local7 << 8) + local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method4196(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method4181(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method4174(arg0, arg1 - this.method4195(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Ljava/lang/String;I)V")
	private void method4197(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(15) char local15 = arg0.charAt(local8);
			if (local15 == '<') {
				local3 = true;
			} else if (local15 == '>') {
				local3 = false;
			} else if (!local3 && local15 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			Static293.anInt5271 = (arg1 - this.method4195(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method4198(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method4194(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([Lclient!hi;[I)V")
	public final void method4199(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass59Array5 = arg0;
		this.anIntArray470 = arg1;
	}
}
