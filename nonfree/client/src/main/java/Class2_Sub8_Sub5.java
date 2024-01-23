import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public abstract class Class2_Sub8_Sub5 extends Class2_Sub8 {

	@OriginalMember(owner = "client!je", name = "y", descriptor = "[Lclient!ob;")
	private Class93[] aClass93Array4;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "[I")
	private int[] anIntArray140;

	@OriginalMember(owner = "client!je", name = "E", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!je", name = "F", descriptor = "I")
	public int anInt1619 = 0;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
	protected int[] anIntArray137;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "[I")
	protected int[] anIntArray141;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "I")
	public int anInt1617;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "I")
	private int anInt1618;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class2_Sub8_Sub5(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray139 = arg1;
		this.anIntArray138 = arg2;
		this.anIntArray137 = arg3;
		this.anIntArray141 = arg4;
		this.method1234(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray138[local25] < local21 && this.anIntArray141[local25] != 0) {
				local21 = this.anIntArray138[local25];
			}
			if (this.anIntArray138[local25] + this.anIntArray141[local25] > local23) {
				local23 = this.anIntArray138[local25] + this.anIntArray141[local25];
			}
		}
		this.anInt1617 = this.anInt1619 - local21;
		this.anInt1618 = local23 - this.anInt1619;
	}

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([B)V")
	public Class2_Sub8_Sub5(@OriginalArg(0) byte[] arg0) {
		this.method1234(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method1220(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1236(arg3, arg4);
			this.method1246(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(C)I")
	private int method1222(@OriginalArg(0) char arg0) {
		return this.anIntArray140[Static223.method3683(arg0) & 0xFF];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIZ)V")
	protected abstract void method1224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([Lclient!ob;[I)V")
	public final void method1225(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass93Array4 = arg0;
		this.anIntArray142 = arg1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	private void method1226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static135.anInt1620 = -1;
		Static135.anInt1624 = -1;
		Static135.anInt1622 = arg1;
		Static135.anInt1627 = arg1;
		Static135.anInt1626 = arg0;
		Static135.anInt1623 = arg0;
		Static135.anInt1621 = arg2;
		Static135.anInt1625 = arg2;
		Static135.anInt1629 = 0;
		Static135.anInt1628 = 0;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method1227(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1236(arg3, arg4);
			this.method1246(arg0, arg1 - this.method1237(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I)I")
	public final int method1228(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		this.method1226(arg5, arg6, (arg9.nextInt() & 0x1F) + 192);
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
		@Pc(49) int local49 = arg2 + this.anInt1617;
		@Pc(51) int local51 = -1;
		if (arg8 == 1) {
			local49 += (arg4 - this.anInt1617 - this.anInt1618) / 2;
		} else if (arg8 == 2) {
			local49 = arg2 + arg4 - this.anInt1618;
		}
		if (arg7 == 1) {
			local51 = this.method1237(arg0) + local25;
			local27 = arg1 + (arg3 - local51) / 2;
		} else if (arg7 == 2) {
			local51 = this.method1237(arg0) + local25;
			local27 = arg1 + arg3 - local51;
		}
		this.method1244(arg0, local27, local49, local23, null);
		if (arg11 != null) {
			if (local51 == -1) {
				local51 = this.method1237(arg0) + local25;
			}
			arg11[0] = local27;
			arg11[1] = local49 - this.anInt1617;
			arg11[2] = local51;
			arg11[3] = this.anInt1617 + this.anInt1618;
		}
		return local25;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method1229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1236(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(22) int local22 = arg0.length();
		@Pc(25) int[] local25 = new int[local22];
		for (@Pc(27) int local27 = 0; local27 < local22; local27++) {
			local25[local27] = (int) (Math.sin((double) local27 / 1.5D + (double) arg4 / 1.0D) * local13);
		}
		this.method1244(arg0, arg1 - this.method1237(arg0) / 2, arg2, null, local25);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method1230(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1236(arg3, arg4);
			this.method1246(arg0, arg1 - this.method1237(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public final int method1231(@OriginalArg(0) String arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) String[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		Static131.method2426(Static135.aStringBuffer3);
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
					@Pc(57) String local57 = arg0.substring(local21 + 1, local30).toLowerCase();
					local21 = -1;
					Static135.aStringBuffer3.append('<');
					Static135.aStringBuffer3.append(local57);
					Static135.aStringBuffer3.append('>');
					if (local57.equals("br")) {
						arg2[local25] = Static135.aStringBuffer3.toString().substring(local13, Static135.aStringBuffer3.length());
						local25++;
						local13 = Static135.aStringBuffer3.length();
						local11 = 0;
						local15 = -1;
						local23 = '\u0000';
					} else if (local57.equals("lt")) {
						local11 += this.method1222('<');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 60];
						}
						local23 = '<';
					} else if (local57.equals("gt")) {
						local11 += this.method1222('>');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 62];
						}
						local23 = '>';
					} else if (local57.equals("nbsp")) {
						local11 += this.method1222(' ');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 160];
						}
						local23 = ' ';
					} else if (local57.equals("shy")) {
						local11 += this.method1222('\u00ad');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 173];
						}
						local23 = '\u00ad';
					} else if (local57.equals("times")) {
						local11 += this.method1222('×');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 215];
						}
						local23 = '×';
					} else if (local57.equals("euro")) {
						local11 += this.method1222('€');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 128];
						}
						local23 = '€';
					} else if (local57.equals("copy")) {
						local11 += this.method1222('©');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 169];
						}
						local23 = '©';
					} else if (local57.equals("reg")) {
						local11 += this.method1222('®');
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + 174];
						}
						local23 = '®';
					} else if (local57.startsWith("img=")) {
						try {
							@Pc(337) int local337 = Static100.method1729(local57.substring(4));
							local11 += this.aClass93Array4[local337].anInt4361;
							local23 = '\u0000';
						} catch (@Pc(349) Exception local349) {
						}
					}
					local37 = '\u0000';
				}
				if (local21 == -1) {
					if (local37 != '\u0000') {
						Static135.aStringBuffer3.append(local37);
						local37 = (char) (Static223.method3683(local37) & 0xFF);
						local11 += this.anIntArray140[local37];
						if (this.aByteArray10 != null && local23 != '\u0000') {
							local11 += this.aByteArray10[(local23 << 8) + local37];
						}
						local23 = local37;
					}
					if (local37 == ' ') {
						local15 = Static135.aStringBuffer3.length();
						local17 = local11;
						local19 = 1;
					}
					if (arg1 != null && local11 > arg1[local25 < arg1.length ? local25 : arg1.length - 1] && local15 >= 0) {
						arg2[local25] = Static135.aStringBuffer3.toString().substring(local13, local15 - local19);
						local25++;
						local13 = local15;
						local15 = -1;
						local11 -= local17;
						local23 = '\u0000';
					}
					if (local37 == '-') {
						local15 = Static135.aStringBuffer3.length();
						local17 = local11;
						local19 = 0;
					}
				}
			}
		}
		if (Static135.aStringBuffer3.length() > local13) {
			arg2[local25] = Static135.aStringBuffer3.toString().substring(local13, Static135.aStringBuffer3.length());
			local25++;
		}
		return local25;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method1233(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			Static135.anInt1629 = (arg1 - this.method1237(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([B)V")
	private void method1234(@OriginalArg(0) byte[] arg0) {
		this.anIntArray140 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray140.length; local9++) {
				this.anIntArray140[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1619 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray140[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray10 = new byte[65536];
		for (local138 = 0; local138 < 256; local138++) {
			if (local138 != 32 && local138 != 160) {
				for (local109 = 0; local109 < 256; local109++) {
					if (local109 != 32 && local109 != 160) {
						this.aByteArray10[(local138 << 8) + local109] = (byte) Static135.method1221(local93, local136, local58, this.anIntArray140, local55, local138, local109);
					}
				}
			}
		}
		this.anInt1619 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIII)I")
	public final int method1235(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1242(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	private void method1236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static135.anInt1620 = -1;
		Static135.anInt1624 = -1;
		Static135.anInt1622 = arg1;
		Static135.anInt1627 = arg1;
		Static135.anInt1626 = arg0;
		Static135.anInt1623 = arg0;
		Static135.anInt1621 = 256;
		Static135.anInt1625 = 256;
		Static135.anInt1629 = 0;
		Static135.anInt1628 = 0;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;)I")
	public final int method1237(@OriginalArg(0) String arg0) {
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
					@Pc(41) String local41 = arg0.substring(local5 + 1, local14).toLowerCase();
					local5 = -1;
					if (local41.equals("lt")) {
						local21 = '<';
					} else if (local41.equals("gt")) {
						local21 = '>';
					} else if (local41.equals("nbsp")) {
						local21 = ' ';
					} else if (local41.equals("shy")) {
						local21 = '\u00ad';
					} else if (local41.equals("times")) {
						local21 = '×';
					} else if (local41.equals("euro")) {
						local21 = '€';
					} else if (local41.equals("copy")) {
						local21 = '©';
					} else {
						if (!local41.equals("reg")) {
							if (local41.startsWith("img=")) {
								try {
									@Pc(109) int local109 = Static100.method1729(local41.substring(4));
									local9 += this.aClass93Array4[local109].anInt4361;
									local7 = '\u0000';
								} catch (@Pc(121) Exception local121) {
								}
							}
							continue;
						}
						local21 = '®';
					}
				}
				if (local5 == -1) {
					local21 = (char) (Static223.method3683(local21) & 0xFF);
					local9 += this.anIntArray140[local21];
					if (this.aByteArray10 != null && local7 != '\u0000') {
						local9 += this.aByteArray10[(local7 << 8) + local21];
					}
					local7 = local21;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public final int method1238(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.anInt1619;
		@Pc(15) int local15 = this.method1231(arg0, new int[] { 100 }, Static135.aStringArray9);
		@Pc(21) int local21 = (local15 - 1) * local4;
		return this.anInt1617 + local21 + this.anInt1618;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIZ)V")
	protected abstract void method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I)I")
	public final int method1240(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1226(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(20) int local20 = arg0.length();
		@Pc(23) int[] local23 = new int[local20];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local20; local27++) {
			local23[local27] = local25;
			if ((arg3.nextInt() & 0x3) == 0) {
				local25++;
			}
		}
		this.method1244(arg0, arg1, arg2, local23, null);
		return local25;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method1241(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1236(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			local12[local14] = (int) (Math.sin((double) local14 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1244(arg0, arg1 - this.method1237(arg0) / 2, arg2, null, local12);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
	public final int method1242(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1226(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1619;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1617 + this.anInt1618 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1231(arg0, local20, Static135.aStringArray9);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1617;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1617 + (arg4 - this.anInt1617 - this.anInt1618 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1618 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1617 - this.anInt1618 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1617 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1246(Static135.aStringArray9[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1246(Static135.aStringArray9[local118], arg1 + (arg3 - this.method1237(Static135.aStringArray9[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1246(Static135.aStringArray9[local118], arg1 + arg3 - this.method1237(Static135.aStringArray9[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1246(Static135.aStringArray9[local118], arg1, local57);
			} else {
				this.method1233(Static135.aStringArray9[local118], arg3);
				this.method1246(Static135.aStringArray9[local118], arg1, local57);
				Static135.anInt1629 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public final int method1243(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.method1231(arg0, new int[] { arg1 }, Static135.aStringArray9);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II[I[I)V")
	private void method1244(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1619;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(22) char local22 = arg0.charAt(local15);
			if (local22 == '<') {
				local6 = local15;
			} else {
				@Pc(110) int local110;
				@Pc(119) int local119;
				@Pc(129) int local129;
				if (local22 == '>' && local6 != -1) {
					@Pc(42) String local42 = arg0.substring(local6 + 1, local15).toLowerCase();
					local6 = -1;
					if (local42.equals("lt")) {
						local22 = '<';
					} else if (local42.equals("gt")) {
						local22 = '>';
					} else if (local42.equals("nbsp")) {
						local22 = ' ';
					} else if (local42.equals("shy")) {
						local22 = '\u00ad';
					} else if (local42.equals("times")) {
						local22 = '×';
					} else if (local42.equals("euro")) {
						local22 = '€';
					} else if (local42.equals("copy")) {
						local22 = '©';
					} else {
						if (!local42.equals("reg")) {
							if (local42.startsWith("img=")) {
								try {
									if (arg3 == null) {
										local110 = 0;
									} else {
										local110 = arg3[local10];
									}
									if (arg4 == null) {
										local119 = 0;
									} else {
										local119 = arg4[local10];
									}
									local10++;
									local129 = Static100.method1729(local42.substring(4));
									@Pc(134) Class93 local134 = this.aClass93Array4[local129];
									@Pc(145) int local145 = this.anIntArray142 == null ? local134.anInt4354 : this.anIntArray142[local129];
									if (Static135.anInt1625 == 256) {
										local134.method3562(arg1 + local110, local4 + this.anInt1619 - local145 + local119);
									} else {
										local134.method3563(arg1 + local110, local4 + this.anInt1619 - local145 + local119, Static135.anInt1625);
									}
									arg1 += local134.anInt4361;
									local8 = '\u0000';
								} catch (@Pc(185) Exception local185) {
								}
							} else {
								this.method1247(local42);
							}
							continue;
						}
						local22 = '®';
					}
				}
				if (local6 == -1) {
					local22 = (char) (Static223.method3683(local22) & 0xFF);
					if (this.aByteArray10 != null && local8 != '\u0000') {
						arg1 += this.aByteArray10[(local8 << 8) + local22];
					}
					@Pc(221) int local221 = this.anIntArray137[local22];
					local110 = this.anIntArray141[local22];
					if (arg3 == null) {
						local119 = 0;
					} else {
						local119 = arg3[local10];
					}
					if (arg4 == null) {
						local129 = 0;
					} else {
						local129 = arg4[local10];
					}
					local10++;
					if (local22 == ' ') {
						if (Static135.anInt1629 > 0) {
							Static135.anInt1628 += Static135.anInt1629;
							arg1 += Static135.anInt1628 >> 8;
							Static135.anInt1628 &= 0xFF;
						}
					} else if (Static135.anInt1625 == 256) {
						if (Static135.anInt1627 != -1) {
							this.method1224(local22, arg1 + this.anIntArray139[local22] + local119 + 1, local4 + this.anIntArray138[local22] + 1 + local129, local221, local110, Static135.anInt1627);
						}
						this.method1224(local22, arg1 + this.anIntArray139[local22] + local119, local4 + this.anIntArray138[local22] + local129, local221, local110, Static135.anInt1623);
					} else {
						if (Static135.anInt1627 != -1) {
							this.method1239(local22, arg1 + this.anIntArray139[local22] + local119 + 1, local4 + this.anIntArray138[local22] + 1 + local129, local221, local110, Static135.anInt1627, Static135.anInt1625);
						}
						this.method1239(local22, arg1 + this.anIntArray139[local22] + local119, local4 + this.anIntArray138[local22] + local129, local221, local110, Static135.anInt1623, Static135.anInt1625);
					}
					@Pc(382) int local382 = this.anIntArray140[local22];
					if (Static135.anInt1620 != -1) {
						if (Static116.aBoolean184) {
							Static111.method1881(arg1, local4 + (int) ((double) this.anInt1619 * 0.7D), local382, Static135.anInt1620);
						} else {
							Static77.method1450(arg1, local4 + (int) ((double) this.anInt1619 * 0.7D), local382, Static135.anInt1620);
						}
					}
					if (Static135.anInt1624 != -1) {
						if (Static116.aBoolean184) {
							Static111.method1881(arg1, local4 + this.anInt1619, local382, Static135.anInt1624);
						} else {
							Static77.method1450(arg1, local4 + this.anInt1619, local382, Static135.anInt1624);
						}
					}
					arg1 += local382;
					local8 = local22;
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method1245(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1236(arg3, 0);
		@Pc(9) int local9 = arg0.length();
		@Pc(12) int[] local12 = new int[local9];
		@Pc(15) int[] local15 = new int[local9];
		for (@Pc(17) int local17 = 0; local17 < local9; local17++) {
			local12[local17] = (int) (Math.sin((double) local17 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local15[local17] = (int) (Math.sin((double) local17 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1244(arg0, arg1 - this.method1237(arg0) / 2, arg2, local12, local15);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Ljava/lang/String;II)V")
	private void method1246(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1619;
		@Pc(6) int local6 = -1;
		@Pc(8) char local8 = 0;
		@Pc(11) int local11 = arg0.length();
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(20) char local20 = arg0.charAt(local13);
			if (local20 == '<') {
				local6 = local13;
			} else {
				@Pc(108) int local108;
				if (local20 == '>' && local6 != -1) {
					@Pc(40) String local40 = arg0.substring(local6 + 1, local13).toLowerCase();
					local6 = -1;
					if (local40.equals("lt")) {
						local20 = '<';
					} else if (local40.equals("gt")) {
						local20 = '>';
					} else if (local40.equals("nbsp")) {
						local20 = ' ';
					} else if (local40.equals("shy")) {
						local20 = '\u00ad';
					} else if (local40.equals("times")) {
						local20 = '×';
					} else if (local40.equals("euro")) {
						local20 = '€';
					} else if (local40.equals("copy")) {
						local20 = '©';
					} else {
						if (!local40.equals("reg")) {
							if (local40.startsWith("img=")) {
								try {
									local108 = Static100.method1729(local40.substring(4));
									@Pc(113) Class93 local113 = this.aClass93Array4[local108];
									@Pc(124) int local124 = this.anIntArray142 == null ? local113.anInt4354 : this.anIntArray142[local108];
									if (Static135.anInt1625 == 256) {
										local113.method3562(arg1, local4 + this.anInt1619 - local124);
									} else {
										local113.method3563(arg1, local4 + this.anInt1619 - local124, Static135.anInt1625);
									}
									arg1 += local113.anInt4361;
									local8 = '\u0000';
								} catch (@Pc(156) Exception local156) {
								}
							} else {
								this.method1247(local40);
							}
							continue;
						}
						local20 = '®';
					}
				}
				if (local6 == -1) {
					local20 = (char) (Static223.method3683(local20) & 0xFF);
					if (this.aByteArray10 != null && local8 != '\u0000') {
						arg1 += this.aByteArray10[(local8 << 8) + local20];
					}
					@Pc(192) int local192 = this.anIntArray137[local20];
					local108 = this.anIntArray141[local20];
					if (local20 == ' ') {
						if (Static135.anInt1629 > 0) {
							Static135.anInt1628 += Static135.anInt1629;
							arg1 += Static135.anInt1628 >> 8;
							Static135.anInt1628 &= 0xFF;
						}
					} else if (Static135.anInt1625 == 256) {
						if (Static135.anInt1627 != -1) {
							this.method1224(local20, arg1 + this.anIntArray139[local20] + 1, local4 + this.anIntArray138[local20] + 1, local192, local108, Static135.anInt1627);
						}
						this.method1224(local20, arg1 + this.anIntArray139[local20], local4 + this.anIntArray138[local20], local192, local108, Static135.anInt1623);
					} else {
						if (Static135.anInt1627 != -1) {
							this.method1239(local20, arg1 + this.anIntArray139[local20] + 1, local4 + this.anIntArray138[local20] + 1, local192, local108, Static135.anInt1627, Static135.anInt1625);
						}
						this.method1239(local20, arg1 + this.anIntArray139[local20], local4 + this.anIntArray138[local20], local192, local108, Static135.anInt1623, Static135.anInt1625);
					}
					@Pc(318) int local318 = this.anIntArray140[local20];
					if (Static135.anInt1620 != -1) {
						if (Static116.aBoolean184) {
							Static111.method1881(arg1, local4 + (int) ((double) this.anInt1619 * 0.7D), local318, Static135.anInt1620);
						} else {
							Static77.method1450(arg1, local4 + (int) ((double) this.anInt1619 * 0.7D), local318, Static135.anInt1620);
						}
					}
					if (Static135.anInt1624 != -1) {
						if (Static116.aBoolean184) {
							Static111.method1881(arg1, local4 + this.anInt1619 + 1, local318, Static135.anInt1624);
						} else {
							Static77.method1450(arg1, local4 + this.anInt1619 + 1, local318, Static135.anInt1624);
						}
					}
					arg1 += local318;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Ljava/lang/String;)V")
	private void method1247(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				Static135.anInt1623 = Static47.method884(arg0.substring(4));
			} else if (arg0.equals("/col")) {
				Static135.anInt1623 = Static135.anInt1626;
			} else if (arg0.startsWith("trans=")) {
				Static135.anInt1625 = Static100.method1729(arg0.substring(6));
			} else if (arg0.equals("/trans")) {
				Static135.anInt1625 = Static135.anInt1621;
			} else if (arg0.startsWith("str=")) {
				Static135.anInt1620 = Static47.method884(arg0.substring(4));
			} else if (arg0.equals("str")) {
				Static135.anInt1620 = 8388608;
			} else if (arg0.equals("/str")) {
				Static135.anInt1620 = -1;
			} else if (arg0.startsWith("u=")) {
				Static135.anInt1624 = Static47.method884(arg0.substring(2));
			} else if (arg0.equals("u")) {
				Static135.anInt1624 = 0;
			} else if (arg0.equals("/u")) {
				Static135.anInt1624 = -1;
			} else if (arg0.startsWith("shad=")) {
				Static135.anInt1627 = Static47.method884(arg0.substring(5));
			} else if (arg0.equals("shad")) {
				Static135.anInt1627 = 0;
			} else if (arg0.equals("/shad")) {
				Static135.anInt1627 = Static135.anInt1622;
			} else if (arg0.equals("br")) {
				this.method1226(Static135.anInt1626, Static135.anInt1622, Static135.anInt1621);
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public final int method1248(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1231(arg0, new int[] { arg1 }, Static135.aStringArray9);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(23) int local23 = this.method1237(Static135.aStringArray9[local14]);
			if (local23 > local12) {
				local12 = local23;
			}
		}
		return local12;
	}
}
