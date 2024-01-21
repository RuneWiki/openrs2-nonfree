import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class3_Sub1_Sub5_Sub7 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
	private int anInt2320;

	@OriginalMember(owner = "client!oa", name = "qb", descriptor = "I")
	private int anInt2321;

	@OriginalMember(owner = "client!oa", name = "rb", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!oa", name = "sb", descriptor = "I")
	private int anInt2322;

	@OriginalMember(owner = "client!oa", name = "tb", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!oa", name = "ub", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!oa", name = "vb", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!oa", name = "wb", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
	private int anInt2323;

	@OriginalMember(owner = "client!oa", name = "zb", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!oa", name = "Bb", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!oa", name = "Cb", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!oa", name = "Db", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!oa", name = "Eb", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!oa", name = "Fb", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!oa", name = "Gb", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!oa", name = "Jb", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!oa", name = "Lb", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!oa", name = "Pb", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!oa", name = "Vb", descriptor = "[[I")
	public int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!oa", name = "dc", descriptor = "[S")
	public short[] aShortArray18;

	@OriginalMember(owner = "client!oa", name = "mc", descriptor = "[I")
	public int[] anIntArray270;

	@OriginalMember(owner = "client!oa", name = "pc", descriptor = "[I")
	public int[] anIntArray271;

	@OriginalMember(owner = "client!oa", name = "Mb", descriptor = "I")
	public int anInt2326 = 0;

	@OriginalMember(owner = "client!oa", name = "Wb", descriptor = "I")
	public int anInt2327 = 0;

	@OriginalMember(owner = "client!oa", name = "yb", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!oa", name = "Ib", descriptor = "I")
	public int anInt2324 = 0;

	@OriginalMember(owner = "client!oa", name = "tc", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5_Sub7() {
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([Lclient!oa;I)V")
	public Class3_Sub1_Sub5_Sub7(@OriginalArg(0) Class3_Sub1_Sub5_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt2327 = 0;
		this.anInt2324 = 0;
		this.anInt2326 = 0;
		this.aByte7 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class3_Sub1_Sub5_Sub7 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt2327 += local41.anInt2327;
				this.anInt2324 += local41.anInt2324;
				this.anInt2326 += local41.anInt2326;
				if (local41.aByteArray27 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local41.aByte7;
					}
					if (this.aByte7 != local41.aByte7) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray25 != null;
				local22 |= local41.aByteArray24 != null;
			}
		}
		this.anIntArray270 = new int[this.anInt2327];
		this.anIntArray248 = new int[this.anInt2327];
		this.anIntArray247 = new int[this.anInt2327];
		this.anIntArray252 = new int[this.anInt2324];
		this.anIntArray249 = new int[this.anInt2324];
		this.anIntArray251 = new int[this.anInt2324];
		this.anIntArray250 = new int[this.anInt2324];
		this.anIntArray255 = new int[this.anInt2324];
		this.anIntArray246 = new int[this.anInt2324];
		if (this.anInt2326 > 0) {
			this.anIntArray271 = new int[this.anInt2326];
			this.anIntArray253 = new int[this.anInt2326];
			this.anIntArray254 = new int[this.anInt2326];
		}
		if (local18) {
			this.aByteArray27 = new byte[this.anInt2324];
		}
		if (local20) {
			this.aByteArray25 = new byte[this.anInt2324];
		}
		if (local22) {
			this.aByteArray24 = new byte[this.anInt2324];
			this.aShortArray18 = new short[this.anInt2324];
		}
		this.anInt2327 = 0;
		this.anInt2324 = 0;
		this.anInt2326 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class3_Sub1_Sub5_Sub7 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt2327;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt2327; local221++) {
					this.anIntArray270[this.anInt2327] = local214.anIntArray270[local221];
					this.anIntArray248[this.anInt2327] = local214.anIntArray248[local221];
					this.anIntArray247[this.anInt2327] = local214.anIntArray247[local221];
					this.anInt2327++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt2324; local262++) {
					this.anIntArray252[this.anInt2324] = local214.anIntArray252[local262] + local219;
					this.anIntArray249[this.anInt2324] = local214.anIntArray249[local262] + local219;
					this.anIntArray251[this.anInt2324] = local214.anIntArray251[local262] + local219;
					this.anIntArray250[this.anInt2324] = local214.anIntArray250[local262];
					this.anIntArray255[this.anInt2324] = local214.anIntArray255[local262];
					this.anIntArray246[this.anInt2324] = local214.anIntArray246[local262];
					if (local18) {
						if (local214.aByteArray27 == null) {
							this.aByteArray27[this.anInt2324] = local214.aByte7;
						} else {
							this.aByteArray27[this.anInt2324] = local214.aByteArray27[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray25 == null) {
							this.aByteArray25[this.anInt2324] = 0;
						} else {
							this.aByteArray25[this.anInt2324] = local214.aByteArray25[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray24 == null || local214.aByteArray24[local262] == -1) {
							this.aByteArray24[this.anInt2324] = -1;
						} else {
							this.aByteArray24[this.anInt2324] = (byte) (local214.aByteArray24[local262] + local207);
							this.aShortArray18[this.anInt2324] = local214.aShortArray18[local262];
						}
					}
					this.anInt2324++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt2326; local418++) {
					this.anIntArray271[this.anInt2326] = local214.anIntArray271[local418] + local219;
					this.anIntArray253[this.anInt2326] = local214.anIntArray253[local418] + local219;
					this.anIntArray254[this.anInt2326] = local214.anIntArray254[local418] + local219;
					this.anInt2326++;
				}
				local207 += local214.anInt2326;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pc;ILclient!pc;I[I)V")
	public void method1465(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1482(arg0, arg1);
			return;
		}
		@Pc(18) Class44 local18 = arg0.aClass44Array1[arg1];
		@Pc(23) Class44 local23 = arg2.aClass44Array1[arg3];
		@Pc(26) Class3_Sub24 local26 = local18.aClass3_Sub24_1;
		Static84.anInt2333 = 0;
		Static84.anInt2332 = 0;
		Static84.anInt2329 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1999; local41++) {
			local47 = local18.anIntArray189[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray379[local47] == 0) {
				this.method1468(local26.anIntArray379[local47], local26.anIntArrayArray28[local47], local18.anIntArray190[local41], local18.anIntArray188[local41], local18.anIntArray194[local41]);
			}
		}
		Static84.anInt2333 = 0;
		Static84.anInt2332 = 0;
		Static84.anInt2329 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1999; local47++) {
			@Pc(112) int local112 = local23.anIntArray189[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray379[local112] == 0) {
				this.method1468(local26.anIntArray379[local112], local26.anIntArrayArray28[local112], local23.anIntArray190[local47], local23.anIntArray188[local47], local23.anIntArray194[local47]);
			}
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public void method1466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static84.anIntArray256[0] = -1;
		if (this.anInt2325 != 2 && this.anInt2325 != 1) {
			this.method1485();
		}
		@Pc(15) int local15 = Static127.anInt3251;
		@Pc(17) int local17 = Static127.anInt3248;
		@Pc(21) int local21 = Static84.anIntArray273[0];
		@Pc(25) int local25 = Static84.anIntArray265[0];
		@Pc(29) int local29 = Static84.anIntArray273[arg0];
		@Pc(33) int local33 = Static84.anIntArray265[arg0];
		@Pc(37) int local37 = Static84.anIntArray273[arg1];
		@Pc(41) int local41 = Static84.anIntArray265[arg1];
		@Pc(45) int local45 = Static84.anIntArray273[arg2];
		@Pc(49) int local49 = Static84.anIntArray265[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2327; local61++) {
			@Pc(67) int local67 = this.anIntArray270[local61];
			@Pc(72) int local72 = this.anIntArray248[local61];
			@Pc(77) int local77 = this.anIntArray247[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static84.anIntArray267[local61] = local77 - local59;
			Static84.anIntArray264[local61] = local15 + (local67 << 9) / local77;
			Static84.anIntArray268[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2326 > 0) {
				Static84.anIntArray276[local61] = local67;
				Static84.anIntArray260[local61] = local89;
				Static84.anIntArray258[local61] = local77;
			}
		}
		try {
			this.method1477(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLclient!oa;[B)Lclient!oa;")
	private Class3_Sub1_Sub5_Sub7 method1467(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2327 = this.anInt2327;
		arg1.anInt2324 = this.anInt2324;
		arg1.anInt2326 = this.anInt2326;
		if (arg1.anIntArray270 == null || arg1.anIntArray270.length < this.anInt2327) {
			arg1.anIntArray270 = new int[this.anInt2327 + 100];
			arg1.anIntArray248 = new int[this.anInt2327 + 100];
			arg1.anIntArray247 = new int[this.anInt2327 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2327; local43++) {
			arg1.anIntArray270[local43] = this.anIntArray270[local43];
			arg1.anIntArray248[local43] = this.anIntArray248[local43];
			arg1.anIntArray247[local43] = this.anIntArray247[local43];
		}
		if (arg0) {
			arg1.aByteArray25 = this.aByteArray25;
		} else {
			arg1.aByteArray25 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray25 == null) {
				for (local88 = 0; local88 < this.anInt2324; local88++) {
					arg1.aByteArray25[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2324; local88++) {
					arg1.aByteArray25[local88] = this.aByteArray25[local88];
				}
			}
		}
		arg1.anIntArray252 = this.anIntArray252;
		arg1.anIntArray249 = this.anIntArray249;
		arg1.anIntArray251 = this.anIntArray251;
		arg1.anIntArray250 = this.anIntArray250;
		arg1.anIntArray255 = this.anIntArray255;
		arg1.anIntArray246 = this.anIntArray246;
		arg1.aByteArray27 = this.aByteArray27;
		arg1.aByteArray24 = this.aByteArray24;
		arg1.aShortArray18 = this.aShortArray18;
		arg1.aByte7 = this.aByte7;
		arg1.anIntArray271 = this.anIntArray271;
		arg1.anIntArray253 = this.anIntArray253;
		arg1.anIntArray254 = this.anIntArray254;
		arg1.anIntArrayArray21 = this.anIntArrayArray21;
		arg1.anIntArrayArray23 = this.anIntArrayArray23;
		arg1.aBoolean130 = this.aBoolean130;
		arg1.anInt2325 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[IIII)V")
	private void method1468(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static84.anInt2333 = 0;
			Static84.anInt2332 = 0;
			Static84.anInt2329 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray21.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray21[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static84.anInt2333 += this.anIntArray270[local36];
						Static84.anInt2332 += this.anIntArray248[local36];
						Static84.anInt2329 += this.anIntArray247[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static84.anInt2333 = Static84.anInt2333 / local6 + arg2;
				Static84.anInt2332 = Static84.anInt2332 / local6 + arg3;
				Static84.anInt2329 = Static84.anInt2329 / local6 + arg4;
			} else {
				Static84.anInt2333 = arg2;
				Static84.anInt2332 = arg3;
				Static84.anInt2329 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray270[local31] += arg2;
						this.anIntArray248[local31] += arg3;
						this.anIntArray247[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray270[local31] -= Static84.anInt2333;
						this.anIntArray248[local31] -= Static84.anInt2332;
						this.anIntArray247[local31] -= Static84.anInt2329;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static84.anIntArray273[local225];
							local235 = Static84.anIntArray265[local225];
							local251 = this.anIntArray248[local31] * local231 + this.anIntArray270[local31] * local235 >> 16;
							this.anIntArray248[local31] = this.anIntArray248[local31] * local235 - this.anIntArray270[local31] * local231 >> 16;
							this.anIntArray270[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static84.anIntArray273[local36];
							local235 = Static84.anIntArray265[local36];
							local251 = this.anIntArray248[local31] * local235 - this.anIntArray247[local31] * local231 >> 16;
							this.anIntArray247[local31] = this.anIntArray248[local31] * local231 + this.anIntArray247[local31] * local235 >> 16;
							this.anIntArray248[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static84.anIntArray273[local219];
							local235 = Static84.anIntArray265[local219];
							local251 = this.anIntArray247[local31] * local231 + this.anIntArray270[local31] * local235 >> 16;
							this.anIntArray247[local31] = this.anIntArray247[local31] * local235 - this.anIntArray270[local31] * local231 >> 16;
							this.anIntArray270[local31] = local251;
						}
						this.anIntArray270[local31] += Static84.anInt2333;
						this.anIntArray248[local31] += Static84.anInt2332;
						this.anIntArray247[local31] += Static84.anInt2329;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray270[local31] -= Static84.anInt2333;
						this.anIntArray248[local31] -= Static84.anInt2332;
						this.anIntArray247[local31] -= Static84.anInt2329;
						this.anIntArray270[local31] = this.anIntArray270[local31] * arg2 / 128;
						this.anIntArray248[local31] = this.anIntArray248[local31] * arg3 / 128;
						this.anIntArray247[local31] = this.anIntArray247[local31] * arg4 / 128;
						this.anIntArray270[local31] += Static84.anInt2333;
						this.anIntArray248[local31] += Static84.anInt2332;
						this.anIntArray247[local31] += Static84.anInt2329;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray23 != null && this.aByteArray25 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray25[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray25[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	public void method1469() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2327; local1++) {
			this.anIntArray270[local1] = -this.anIntArray270[local1];
			this.anIntArray247[local1] = -this.anIntArray247[local1];
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	private void method1470(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static127.anInt3251;
		@Pc(3) int local3 = Static127.anInt3248;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray252[arg0];
		@Pc(15) int local15 = this.anIntArray249[arg0];
		@Pc(20) int local20 = this.anIntArray251[arg0];
		@Pc(24) int local24 = Static84.anIntArray258[local10];
		@Pc(28) int local28 = Static84.anIntArray258[local15];
		@Pc(32) int local32 = Static84.anIntArray258[local20];
		if (this.aByteArray25 == null) {
			Static127.anInt3247 = 0;
		} else {
			Static127.anInt3247 = this.aByteArray25[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static84.anIntArray275[0] = Static84.anIntArray264[local10];
			Static84.anIntArray257[0] = Static84.anIntArray268[local10];
			local5++;
			Static84.anIntArray272[0] = this.anIntArray250[arg0];
		} else {
			local73 = Static84.anIntArray276[local10];
			local77 = Static84.anIntArray260[local10];
			local82 = this.anIntArray250[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static84.anIntArray263[local32 - local24];
				Static84.anIntArray275[0] = local1 + (local73 + ((Static84.anIntArray276[local20] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray257[0] = local3 + (local77 + ((Static84.anIntArray260[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static84.anIntArray272[0] = local82 + ((this.anIntArray246[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static84.anIntArray263[local28 - local24];
				Static84.anIntArray275[local5] = local1 + (local73 + ((Static84.anIntArray276[local15] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray257[local5] = local3 + (local77 + ((Static84.anIntArray260[local15] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray272[local5++] = local82 + ((this.anIntArray255[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static84.anIntArray275[local5] = Static84.anIntArray264[local15];
			Static84.anIntArray257[local5] = Static84.anIntArray268[local15];
			Static84.anIntArray272[local5++] = this.anIntArray255[arg0];
		} else {
			local73 = Static84.anIntArray276[local15];
			local77 = Static84.anIntArray260[local15];
			local82 = this.anIntArray255[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static84.anIntArray263[local24 - local28];
				Static84.anIntArray275[local5] = local1 + (local73 + ((Static84.anIntArray276[local10] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray257[local5] = local3 + (local77 + ((Static84.anIntArray260[local10] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray272[local5++] = local82 + ((this.anIntArray250[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static84.anIntArray263[local32 - local28];
				Static84.anIntArray275[local5] = local1 + (local73 + ((Static84.anIntArray276[local20] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray257[local5] = local3 + (local77 + ((Static84.anIntArray260[local20] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray272[local5++] = local82 + ((this.anIntArray246[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static84.anIntArray275[local5] = Static84.anIntArray264[local20];
			Static84.anIntArray257[local5] = Static84.anIntArray268[local20];
			Static84.anIntArray272[local5++] = this.anIntArray246[arg0];
		} else {
			local73 = Static84.anIntArray276[local20];
			local77 = Static84.anIntArray260[local20];
			local82 = this.anIntArray246[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static84.anIntArray263[local28 - local32];
				Static84.anIntArray275[local5] = local1 + (local73 + ((Static84.anIntArray276[local15] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray257[local5] = local3 + (local77 + ((Static84.anIntArray260[local15] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray272[local5++] = local82 + ((this.anIntArray255[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static84.anIntArray263[local24 - local32];
				Static84.anIntArray275[local5] = local1 + (local73 + ((Static84.anIntArray276[local10] - local73) * local95 >> 16) << 9) / 50;
				Static84.anIntArray257[local5] = local3 + (local77 + ((Static84.anIntArray260[local10] - local77) * local95 >> 16) << 9) / 50;
				Static84.anIntArray272[local5++] = local82 + ((this.anIntArray250[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static84.anIntArray275[0];
		local77 = Static84.anIntArray275[1];
		local82 = Static84.anIntArray275[2];
		local95 = Static84.anIntArray257[0];
		@Pc(590) int local590 = Static84.anIntArray257[1];
		@Pc(594) int local594 = Static84.anIntArray257[2];
		Static127.aBoolean181 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static127.anInt3244 || local77 > Static127.anInt3244 || local82 > Static127.anInt3244) {
				Static127.aBoolean181 = true;
			}
			if (this.aByteArray24 != null && this.aByteArray24[arg0] != -1) {
				local669 = this.aByteArray24[arg0] & 0xFF;
				local674 = this.anIntArray271[local669];
				local679 = this.anIntArray253[local669];
				local684 = this.anIntArray254[local669];
				if (this.anIntArray246[arg0] == -1) {
					Static127.method2236(local95, local590, local594, local73, local77, local82, this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static84.anIntArray276[local674], Static84.anIntArray276[local679], Static84.anIntArray276[local684], Static84.anIntArray260[local674], Static84.anIntArray260[local679], Static84.anIntArray260[local684], Static84.anIntArray258[local674], Static84.anIntArray258[local679], Static84.anIntArray258[local684], this.aShortArray18[arg0]);
				} else {
					Static127.method2236(local95, local590, local594, local73, local77, local82, Static84.anIntArray272[0], Static84.anIntArray272[1], Static84.anIntArray272[2], Static84.anIntArray276[local674], Static84.anIntArray276[local679], Static84.anIntArray276[local684], Static84.anIntArray260[local674], Static84.anIntArray260[local679], Static84.anIntArray260[local684], Static84.anIntArray258[local674], Static84.anIntArray258[local679], Static84.anIntArray258[local684], this.aShortArray18[arg0]);
				}
			} else if (this.anIntArray246[arg0] == -1) {
				Static127.method2242(local95, local590, local594, local73, local77, local82, Static84.anIntArray262[this.anIntArray250[arg0]]);
			} else {
				Static127.method2244(local95, local590, local594, local73, local77, local82, Static84.anIntArray272[0], Static84.anIntArray272[1], Static84.anIntArray272[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static127.anInt3244 || local77 > Static127.anInt3244 || local82 > Static127.anInt3244 || Static84.anIntArray275[3] < 0 || Static84.anIntArray275[3] > Static127.anInt3244) {
			Static127.aBoolean181 = true;
		}
		if (this.aByteArray24 == null || this.aByteArray24[arg0] == -1) {
			if (this.anIntArray246[arg0] == -1) {
				local669 = Static84.anIntArray262[this.anIntArray250[arg0]];
				Static127.method2242(local95, local590, local594, local73, local77, local82, local669);
				Static127.method2242(local95, local594, Static84.anIntArray257[3], local73, local82, Static84.anIntArray275[3], local669);
				return;
			}
			Static127.method2244(local95, local590, local594, local73, local77, local82, Static84.anIntArray272[0], Static84.anIntArray272[1], Static84.anIntArray272[2]);
			Static127.method2244(local95, local594, Static84.anIntArray257[3], local73, local82, Static84.anIntArray275[3], Static84.anIntArray272[0], Static84.anIntArray272[2], Static84.anIntArray272[3]);
			return;
		}
		local669 = this.aByteArray24[arg0] & 0xFF;
		local674 = this.anIntArray271[local669];
		local679 = this.anIntArray253[local669];
		local684 = this.anIntArray254[local669];
		@Pc(924) short local924 = this.aShortArray18[arg0];
		if (this.anIntArray246[arg0] == -1) {
			Static127.method2236(local95, local590, local594, local73, local77, local82, this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static84.anIntArray276[local674], Static84.anIntArray276[local679], Static84.anIntArray276[local684], Static84.anIntArray260[local674], Static84.anIntArray260[local679], Static84.anIntArray260[local684], Static84.anIntArray258[local674], Static84.anIntArray258[local679], Static84.anIntArray258[local684], local924);
			Static127.method2236(local95, local594, Static84.anIntArray257[3], local73, local82, Static84.anIntArray275[3], this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static84.anIntArray276[local674], Static84.anIntArray276[local679], Static84.anIntArray276[local684], Static84.anIntArray260[local674], Static84.anIntArray260[local679], Static84.anIntArray260[local684], Static84.anIntArray258[local674], Static84.anIntArray258[local679], Static84.anIntArray258[local684], local924);
			return;
		}
		Static127.method2236(local95, local590, local594, local73, local77, local82, Static84.anIntArray272[0], Static84.anIntArray272[1], Static84.anIntArray272[2], Static84.anIntArray276[local674], Static84.anIntArray276[local679], Static84.anIntArray276[local684], Static84.anIntArray260[local674], Static84.anIntArray260[local679], Static84.anIntArray260[local684], Static84.anIntArray258[local674], Static84.anIntArray258[local679], Static84.anIntArray258[local684], local924);
		Static127.method2236(local95, local594, Static84.anIntArray257[3], local73, local82, Static84.anIntArray275[3], Static84.anIntArray272[0], Static84.anIntArray272[2], Static84.anIntArray272[3], Static84.anIntArray276[local674], Static84.anIntArray276[local679], Static84.anIntArray276[local684], Static84.anIntArray260[local674], Static84.anIntArray260[local679], Static84.anIntArray260[local684], Static84.anIntArray258[local674], Static84.anIntArray258[local679], Static84.anIntArray258[local684], local924);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub5_Sub7 local16;
		if (arg4) {
			local16 = new Class3_Sub1_Sub5_Sub7();
			local16.anInt2327 = this.anInt2327;
			local16.anInt2324 = this.anInt2324;
			local16.anInt2326 = this.anInt2326;
			local16.anIntArray270 = this.anIntArray270;
			local16.anIntArray247 = this.anIntArray247;
			local16.anIntArray252 = this.anIntArray252;
			local16.anIntArray249 = this.anIntArray249;
			local16.anIntArray251 = this.anIntArray251;
			local16.anIntArray250 = this.anIntArray250;
			local16.anIntArray255 = this.anIntArray255;
			local16.anIntArray246 = this.anIntArray246;
			local16.aByteArray27 = this.aByteArray27;
			local16.aByteArray25 = this.aByteArray25;
			local16.aByteArray24 = this.aByteArray24;
			local16.aShortArray18 = this.aShortArray18;
			local16.aByte7 = this.aByte7;
			local16.anIntArray271 = this.anIntArray271;
			local16.anIntArray253 = this.anIntArray253;
			local16.anIntArray254 = this.anIntArray254;
			local16.anIntArrayArray21 = this.anIntArrayArray21;
			local16.anIntArrayArray23 = this.anIntArrayArray23;
			local16.aBoolean130 = this.aBoolean130;
			local16.anIntArray248 = new int[local16.anInt2327];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt2327; local124++) {
			@Pc(130) int local130 = this.anIntArray270[local124];
			@Pc(135) int local135 = this.anIntArray248[local124];
			@Pc(140) int local140 = this.anIntArray247[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray248[local124] = local135 + local176 - local122;
		}
		local16.anInt2325 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(Z)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method1472(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static84.aByteArray28.length < this.anInt2324) {
			Static84.aByteArray28 = new byte[this.anInt2324 + 100];
		}
		return this.method1467(arg0, Static84.aClass3_Sub1_Sub5_Sub7_3, Static84.aByteArray28);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	public void method1473() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2327; local1++) {
			@Pc(7) int local7 = this.anIntArray270[local1];
			this.anIntArray270[local1] = this.anIntArray247[local1];
			this.anIntArray247[local1] = -local7;
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public void method1474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2327; local1++) {
			this.anIntArray270[local1] += arg0;
			this.anIntArray248[local1] += arg1;
			this.anIntArray247[local1] += arg2;
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	public void method1475() {
		if (this.anInt2325 == 1) {
			return;
		}
		this.anInt2325 = 1;
		super.anInt2680 = 0;
		this.anInt2321 = 0;
		this.anInt2322 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2327; local18++) {
			@Pc(24) int local24 = this.anIntArray270[local18];
			@Pc(29) int local29 = this.anIntArray248[local18];
			@Pc(34) int local34 = this.anIntArray247[local18];
			if (-local29 > super.anInt2680) {
				super.anInt2680 = -local29;
			}
			if (local29 > this.anInt2321) {
				this.anInt2321 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2322) {
				this.anInt2322 = local58;
			}
		}
		this.anInt2322 = (int) (Math.sqrt((double) this.anInt2322) + 0.99D);
		this.anInt2323 = (int) (Math.sqrt((double) (this.anInt2322 * this.anInt2322 + super.anInt2680 * super.anInt2680)) + 0.99D);
		this.anInt2320 = this.anInt2323 + (int) (Math.sqrt((double) (this.anInt2322 * this.anInt2322 + this.anInt2321 * this.anInt2321)) + 0.99D);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
	public void method1476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2327; local1++) {
			this.anIntArray270[local1] = this.anIntArray270[local1] * arg0 / 128;
			this.anIntArray248[local1] = this.anIntArray248[local1] * arg1 / 128;
			this.anIntArray247[local1] = this.anIntArray247[local1] * arg2 / 128;
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZZI)V")
	private void method1477(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2320 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2320; local6++) {
			Static84.anIntArray256[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2324; local18++) {
			if (this.anIntArray246[local18] != -2) {
				local30 = this.anIntArray252[local18];
				local35 = this.anIntArray249[local18];
				local40 = this.anIntArray251[local18];
				local44 = Static84.anIntArray264[local30];
				local48 = Static84.anIntArray264[local35];
				local52 = Static84.anIntArray264[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static84.anIntArray276[local30];
					local71 = Static84.anIntArray276[local35];
					@Pc(75) int local75 = Static84.anIntArray276[local40];
					@Pc(79) int local79 = Static84.anIntArray260[local30];
					local83 = Static84.anIntArray260[local35];
					local87 = Static84.anIntArray260[local40];
					@Pc(91) int local91 = Static84.anIntArray258[local30];
					local95 = Static84.anIntArray258[local35];
					@Pc(99) int local99 = Static84.anIntArray258[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static84.aBooleanArray23[local18] = true;
						@Pc(180) int local180 = (Static84.anIntArray267[local30] + Static84.anIntArray267[local35] + Static84.anIntArray267[local40]) / 3 + this.anInt2323;
						Static84.anIntArrayArray22[local180][Static84.anIntArray256[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1480(Static84.anInt2330, Static84.anInt2328, Static84.anIntArray268[local30], Static84.anIntArray268[local35], Static84.anIntArray268[local40], local44, local48, local52)) {
						Static84.anIntArray261[Static84.anInt2331++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static84.anIntArray268[local40] - Static84.anIntArray268[local35]) - (Static84.anIntArray268[local30] - Static84.anIntArray268[local35]) * (local52 - local48) > 0) {
						Static84.aBooleanArray23[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static127.anInt3244 && local48 <= Static127.anInt3244 && local52 <= Static127.anInt3244) {
							Static84.aBooleanArray22[local18] = false;
						} else {
							Static84.aBooleanArray22[local18] = true;
						}
						local67 = (Static84.anIntArray267[local30] + Static84.anIntArray267[local35] + Static84.anIntArray267[local40]) / 3 + this.anInt2323;
						Static84.anIntArrayArray22[local67][Static84.anIntArray256[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray27 == null) {
			for (local30 = this.anInt2320 - 1; local30 >= 0; local30--) {
				local35 = Static84.anIntArray256[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static84.anIntArrayArray22[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1487(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static84.anIntArray274[local30] = 0;
			Static84.anIntArray266[local30] = 0;
		}
		for (local35 = this.anInt2320 - 1; local35 >= 0; local35--) {
			local40 = Static84.anIntArray256[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static84.anIntArrayArray22[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray27[local52];
					local71 = Static84.anIntArray274[local388]++;
					Static84.anIntArrayArray24[local388][local71] = local52;
					if (local388 < 10) {
						Static84.anIntArray266[local388] += local35;
					} else if (local388 == 10) {
						Static84.anIntArray269[local71] = local35;
					} else {
						Static84.anIntArray259[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static84.anIntArray274[1] > 0 || Static84.anIntArray274[2] > 0) {
			local40 = (Static84.anIntArray266[1] + Static84.anIntArray266[2]) / (Static84.anIntArray274[1] + Static84.anIntArray274[2]);
		}
		local44 = 0;
		if (Static84.anIntArray274[3] > 0 || Static84.anIntArray274[4] > 0) {
			local44 = (Static84.anIntArray266[3] + Static84.anIntArray266[4]) / (Static84.anIntArray274[3] + Static84.anIntArray274[4]);
		}
		local48 = 0;
		if (Static84.anIntArray274[6] > 0 || Static84.anIntArray274[8] > 0) {
			local48 = (Static84.anIntArray266[6] + Static84.anIntArray266[8]) / (Static84.anIntArray274[6] + Static84.anIntArray274[8]);
		}
		local67 = 0;
		local71 = Static84.anIntArray274[10];
		@Pc(521) int[] local521 = Static84.anIntArrayArray24[10];
		@Pc(523) int[] local523 = Static84.anIntArray269;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static84.anIntArray274[11];
			local521 = Static84.anIntArrayArray24[11];
			local523 = Static84.anIntArray259;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1487(local521[local67++]);
				if (local67 == local71 && local521 != Static84.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static84.anIntArray274[11];
					local521 = Static84.anIntArrayArray24[11];
					local523 = Static84.anIntArray259;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1487(local521[local67++]);
				if (local67 == local71 && local521 != Static84.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static84.anIntArray274[11];
					local521 = Static84.anIntArrayArray24[11];
					local523 = Static84.anIntArray259;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1487(local521[local67++]);
				if (local67 == local71 && local521 != Static84.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static84.anIntArray274[11];
					local521 = Static84.anIntArrayArray24[11];
					local523 = Static84.anIntArray259;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static84.anIntArray274[local83];
			@Pc(686) int[] local686 = Static84.anIntArrayArray24[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1487(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1487(local521[local67++]);
			if (local67 == local71 && local521 != Static84.anIntArrayArray24[11]) {
				local67 = 0;
				local521 = Static84.anIntArrayArray24[11];
				local71 = Static84.anIntArray274[11];
				local523 = Static84.anIntArray259;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	public void method1478() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2327; local1++) {
			@Pc(7) int local7 = this.anIntArray247[local1];
			this.anIntArray247[local1] = this.anIntArray270[local1];
			this.anIntArray270[local1] = -local7;
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)V")
	public void method1479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static84.anIntArray256[0] = -1;
		if (this.anInt2325 != 2 && this.anInt2325 != 1) {
			this.method1485();
		}
		@Pc(15) int local15 = Static127.anInt3251;
		@Pc(17) int local17 = Static127.anInt3248;
		@Pc(21) int local21 = Static84.anIntArray273[0];
		@Pc(25) int local25 = Static84.anIntArray265[0];
		@Pc(29) int local29 = Static84.anIntArray273[arg0];
		@Pc(33) int local33 = Static84.anIntArray265[arg0];
		@Pc(37) int local37 = Static84.anIntArray273[arg1];
		@Pc(41) int local41 = Static84.anIntArray265[arg1];
		@Pc(45) int local45 = Static84.anIntArray273[arg2];
		@Pc(49) int local49 = Static84.anIntArray265[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2327; local61++) {
			@Pc(67) int local67 = this.anIntArray270[local61];
			@Pc(72) int local72 = this.anIntArray248[local61];
			@Pc(77) int local77 = this.anIntArray247[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static84.anIntArray267[local61] = local77 - local59;
			Static84.anIntArray264[local61] = local15 + (local67 << 9) / arg6;
			Static84.anIntArray268[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2326 > 0) {
				Static84.anIntArray276[local61] = local67;
				Static84.anIntArray260[local61] = local89;
				Static84.anIntArray258[local61] = local77;
			}
		}
		try {
			this.method1477(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(Z)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method1481(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static84.aByteArray26.length < this.anInt2324) {
			Static84.aByteArray26 = new byte[this.anInt2324 + 100];
		}
		return this.method1467(arg0, Static84.aClass3_Sub1_Sub5_Sub7_2, Static84.aByteArray26);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pc;I)V")
	public void method1482(@OriginalArg(0) Class3_Sub1_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray21 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class44 local12 = arg0.aClass44Array1[arg1];
		@Pc(15) Class3_Sub24 local15 = local12.aClass3_Sub24_1;
		Static84.anInt2333 = 0;
		Static84.anInt2332 = 0;
		Static84.anInt2329 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1999; local23++) {
			@Pc(29) int local29 = local12.anIntArray189[local23];
			this.method1468(local15.anIntArray379[local29], local15.anIntArrayArray28[local29], local12.anIntArray190[local23], local12.anIntArray188[local23], local12.anIntArray194[local23]);
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public void method1484(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static84.anIntArray273[arg0];
		@Pc(7) int local7 = Static84.anIntArray265[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2327; local9++) {
			@Pc(26) int local26 = this.anIntArray248[local9] * local7 - this.anIntArray247[local9] * local3 >> 16;
			this.anIntArray247[local9] = this.anIntArray248[local9] * local3 + this.anIntArray247[local9] * local7 >> 16;
			this.anIntArray248[local9] = local26;
		}
		this.anInt2325 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	private void method1485() {
		if (this.anInt2325 == 2) {
			return;
		}
		this.anInt2325 = 2;
		this.anInt2322 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2327; local12++) {
			@Pc(18) int local18 = this.anIntArray270[local12];
			@Pc(23) int local23 = this.anIntArray248[local12];
			@Pc(28) int local28 = this.anIntArray247[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2322) {
				this.anInt2322 = local40;
			}
		}
		this.anInt2322 = (int) (Math.sqrt((double) this.anInt2322) + 0.99D);
		this.anInt2323 = this.anInt2322;
		this.anInt2320 = this.anInt2322 + this.anInt2322;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()I")
	public int method1486() {
		this.method1475();
		return this.anInt2322;
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	private void method1487(@OriginalArg(0) int arg0) {
		if (Static84.aBooleanArray23[arg0]) {
			this.method1470(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray252[arg0];
		@Pc(17) int local17 = this.anIntArray249[arg0];
		@Pc(22) int local22 = this.anIntArray251[arg0];
		Static127.aBoolean181 = Static84.aBooleanArray22[arg0];
		if (this.aByteArray25 == null) {
			Static127.anInt3247 = 0;
		} else {
			Static127.anInt3247 = this.aByteArray25[arg0] & 0xFF;
		}
		if (this.aByteArray24 != null && this.aByteArray24[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray24[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray271[local119];
			@Pc(129) int local129 = this.anIntArray253[local119];
			@Pc(134) int local134 = this.anIntArray254[local119];
			if (this.anIntArray246[arg0] == -1) {
				Static127.method2236(Static84.anIntArray268[local12], Static84.anIntArray268[local17], Static84.anIntArray268[local22], Static84.anIntArray264[local12], Static84.anIntArray264[local17], Static84.anIntArray264[local22], this.anIntArray250[arg0], this.anIntArray250[arg0], this.anIntArray250[arg0], Static84.anIntArray276[local124], Static84.anIntArray276[local129], Static84.anIntArray276[local134], Static84.anIntArray260[local124], Static84.anIntArray260[local129], Static84.anIntArray260[local134], Static84.anIntArray258[local124], Static84.anIntArray258[local129], Static84.anIntArray258[local134], this.aShortArray18[arg0]);
			} else {
				Static127.method2236(Static84.anIntArray268[local12], Static84.anIntArray268[local17], Static84.anIntArray268[local22], Static84.anIntArray264[local12], Static84.anIntArray264[local17], Static84.anIntArray264[local22], this.anIntArray250[arg0], this.anIntArray255[arg0], this.anIntArray246[arg0], Static84.anIntArray276[local124], Static84.anIntArray276[local129], Static84.anIntArray276[local134], Static84.anIntArray260[local124], Static84.anIntArray260[local129], Static84.anIntArray260[local134], Static84.anIntArray258[local124], Static84.anIntArray258[local129], Static84.anIntArray258[local134], this.aShortArray18[arg0]);
			}
		} else if (this.anIntArray246[arg0] == -1) {
			Static127.method2242(Static84.anIntArray268[local12], Static84.anIntArray268[local17], Static84.anIntArray268[local22], Static84.anIntArray264[local12], Static84.anIntArray264[local17], Static84.anIntArray264[local22], Static84.anIntArray262[this.anIntArray250[arg0]]);
		} else {
			Static127.method2244(Static84.anIntArray268[local12], Static84.anIntArray268[local17], Static84.anIntArray268[local22], Static84.anIntArray264[local12], Static84.anIntArray264[local17], Static84.anIntArray264[local22], this.anIntArray250[arg0], this.anIntArray255[arg0], this.anIntArray246[arg0]);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static84.anIntArray256[0] = -1;
		if (this.anInt2325 != 1) {
			this.method1475();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2322 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2322 << 9;
		if (local64 / local40 >= Static127.anInt3252) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2322 << 9;
		if (local77 / local40 <= Static127.anInt3245) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2322 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static127.anInt3249) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2680 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static127.anInt3250) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2680 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2326 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static84.aBoolean131) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static84.anInt2330 - Static127.anInt3251;
			local223 = Static84.anInt2328 - Static127.anInt3248;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean130) {
					Static84.anIntArray261[Static84.anInt2331++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static127.anInt3251;
		local219 = Static127.anInt3248;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static84.anIntArray273[arg0];
			local257 = Static84.anIntArray265[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2327; local269++) {
			@Pc(275) int local275 = this.anIntArray270[local269];
			@Pc(280) int local280 = this.anIntArray248[local269];
			@Pc(285) int local285 = this.anIntArray247[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static84.anIntArray267[local269] = local285 - local29;
			if (local285 >= 50) {
				Static84.anIntArray264[local269] = local172 + (local275 << 9) / local285;
				Static84.anIntArray268[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static84.anIntArray264[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static84.anIntArray276[local269] = local275;
				Static84.anIntArray260[local269] = local297;
				Static84.anIntArray258[local269] = local285;
			}
		}
		try {
			this.method1477(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}
}
