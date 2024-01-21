import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class4_Sub4_Sub1_Sub6 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "[I")
	public int[] anIntArray245;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
	private int anInt2450;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	private int anInt2452;

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "[I")
	public int[] anIntArray246;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	private int anInt2453;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "[I")
	public int[] anIntArray248;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "[I")
	public int[] anIntArray249;

	@OriginalMember(owner = "client!rb", name = "hb", descriptor = "[I")
	public int[] anIntArray250;

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
	private int anInt2455;

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "I")
	private int anInt2456;

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "[[I")
	public int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!rb", name = "qb", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!rb", name = "vb", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!rb", name = "wb", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!rb", name = "xb", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!rb", name = "yb", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!rb", name = "zb", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
	public int anInt2451 = 0;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	public int anInt2454 = 0;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!rb", name = "ub", descriptor = "I")
	public int anInt2457 = 0;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([Lclient!rb;I)V")
	public Class4_Sub4_Sub1_Sub6(@OriginalArg(0) Class4_Sub4_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt2454 = 0;
		this.anInt2457 = 0;
		this.anInt2451 = 0;
		this.aByte4 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class4_Sub4_Sub1_Sub6 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt2454 += local41.anInt2454;
				this.anInt2457 += local41.anInt2457;
				this.anInt2451 += local41.anInt2451;
				if (local41.aByteArray104 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local41.aByte4;
					}
					if (this.aByte4 != local41.aByte4) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray102 != null;
				local22 |= local41.aByteArray101 != null;
			}
		}
		this.anIntArray256 = new int[this.anInt2454];
		this.anIntArray246 = new int[this.anInt2454];
		this.anIntArray254 = new int[this.anInt2454];
		this.anIntArray245 = new int[this.anInt2457];
		this.anIntArray252 = new int[this.anInt2457];
		this.anIntArray247 = new int[this.anInt2457];
		this.anIntArray251 = new int[this.anInt2457];
		this.anIntArray253 = new int[this.anInt2457];
		this.anIntArray249 = new int[this.anInt2457];
		if (this.anInt2451 > 0) {
			this.anIntArray250 = new int[this.anInt2451];
			this.anIntArray255 = new int[this.anInt2451];
			this.anIntArray248 = new int[this.anInt2451];
		}
		if (local18) {
			this.aByteArray104 = new byte[this.anInt2457];
		}
		if (local20) {
			this.aByteArray102 = new byte[this.anInt2457];
		}
		if (local22) {
			this.aByteArray101 = new byte[this.anInt2457];
			this.aShortArray13 = new short[this.anInt2457];
		}
		this.anInt2454 = 0;
		this.anInt2457 = 0;
		this.anInt2451 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class4_Sub4_Sub1_Sub6 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt2454;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt2454; local221++) {
					this.anIntArray256[this.anInt2454] = local214.anIntArray256[local221];
					this.anIntArray246[this.anInt2454] = local214.anIntArray246[local221];
					this.anIntArray254[this.anInt2454] = local214.anIntArray254[local221];
					this.anInt2454++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt2457; local262++) {
					this.anIntArray245[this.anInt2457] = local214.anIntArray245[local262] + local219;
					this.anIntArray252[this.anInt2457] = local214.anIntArray252[local262] + local219;
					this.anIntArray247[this.anInt2457] = local214.anIntArray247[local262] + local219;
					this.anIntArray251[this.anInt2457] = local214.anIntArray251[local262];
					this.anIntArray253[this.anInt2457] = local214.anIntArray253[local262];
					this.anIntArray249[this.anInt2457] = local214.anIntArray249[local262];
					if (local18) {
						if (local214.aByteArray104 == null) {
							this.aByteArray104[this.anInt2457] = local214.aByte4;
						} else {
							this.aByteArray104[this.anInt2457] = local214.aByteArray104[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray102 == null) {
							this.aByteArray102[this.anInt2457] = 0;
						} else {
							this.aByteArray102[this.anInt2457] = local214.aByteArray102[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray101 == null || local214.aByteArray101[local262] == -1) {
							this.aByteArray101[this.anInt2457] = -1;
						} else {
							this.aByteArray101[this.anInt2457] = (byte) (local214.aByteArray101[local262] + local207);
							this.aShortArray13[this.anInt2457] = local214.aShortArray13[local262];
						}
					}
					this.anInt2457++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt2451; local418++) {
					this.anIntArray250[this.anInt2451] = local214.anIntArray250[local418] + local219;
					this.anIntArray255[this.anInt2451] = local214.anIntArray255[local418] + local219;
					this.anIntArray248[this.anInt2451] = local214.anIntArray248[local418] + local219;
					this.anInt2451++;
				}
				local207 += local214.anInt2451;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	private void method1782(@OriginalArg(0) int arg0) {
		if (Static100.aBooleanArray14[arg0]) {
			this.method1788(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray245[arg0];
		@Pc(17) int local17 = this.anIntArray252[arg0];
		@Pc(22) int local22 = this.anIntArray247[arg0];
		Static91.aBoolean91 = Static100.aBooleanArray15[arg0];
		if (this.aByteArray102 == null) {
			Static91.anInt2169 = 0;
		} else {
			Static91.anInt2169 = this.aByteArray102[arg0] & 0xFF;
		}
		if (this.aByteArray101 != null && this.aByteArray101[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray101[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray250[local119];
			@Pc(129) int local129 = this.anIntArray255[local119];
			@Pc(134) int local134 = this.anIntArray248[local119];
			if (this.anIntArray249[arg0] == -1) {
				Static91.method1596(Static100.anIntArray259[local12], Static100.anIntArray259[local17], Static100.anIntArray259[local22], Static100.anIntArray275[local12], Static100.anIntArray275[local17], Static100.anIntArray275[local22], this.anIntArray251[arg0], this.anIntArray251[arg0], this.anIntArray251[arg0], Static100.anIntArray273[local124], Static100.anIntArray273[local129], Static100.anIntArray273[local134], Static100.anIntArray274[local124], Static100.anIntArray274[local129], Static100.anIntArray274[local134], Static100.anIntArray263[local124], Static100.anIntArray263[local129], Static100.anIntArray263[local134], this.aShortArray13[arg0]);
			} else {
				Static91.method1596(Static100.anIntArray259[local12], Static100.anIntArray259[local17], Static100.anIntArray259[local22], Static100.anIntArray275[local12], Static100.anIntArray275[local17], Static100.anIntArray275[local22], this.anIntArray251[arg0], this.anIntArray253[arg0], this.anIntArray249[arg0], Static100.anIntArray273[local124], Static100.anIntArray273[local129], Static100.anIntArray273[local134], Static100.anIntArray274[local124], Static100.anIntArray274[local129], Static100.anIntArray274[local134], Static100.anIntArray263[local124], Static100.anIntArray263[local129], Static100.anIntArray263[local134], this.aShortArray13[arg0]);
			}
		} else if (this.anIntArray249[arg0] == -1) {
			Static91.method1593(Static100.anIntArray259[local12], Static100.anIntArray259[local17], Static100.anIntArray259[local22], Static100.anIntArray275[local12], Static100.anIntArray275[local17], Static100.anIntArray275[local22], Static100.anIntArray265[this.anIntArray251[arg0]]);
		} else {
			Static91.method1599(Static100.anIntArray259[local12], Static100.anIntArray259[local17], Static100.anIntArray259[local22], Static100.anIntArray275[local12], Static100.anIntArray275[local17], Static100.anIntArray275[local22], this.anIntArray251[arg0], this.anIntArray253[arg0], this.anIntArray249[arg0]);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)V")
	public void method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2454; local1++) {
			this.anIntArray256[local1] += arg0;
			this.anIntArray246[local1] += arg1;
			this.anIntArray254[local1] += arg2;
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mb;ILclient!mb;I[I)V")
	public void method1784(@OriginalArg(0) Class4_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1804(arg0, arg1);
			return;
		}
		@Pc(18) Class76 local18 = arg0.aClass76Array1[arg1];
		@Pc(23) Class76 local23 = arg2.aClass76Array1[arg3];
		@Pc(26) Class4_Sub3 local26 = local18.aClass4_Sub3_1;
		Static100.anInt2460 = 0;
		Static100.anInt2462 = 0;
		Static100.anInt2461 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2923; local41++) {
			local47 = local18.anIntArray327[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray15[local47] == 0) {
				this.method1787(local26.anIntArray15[local47], local26.anIntArrayArray1[local47], local18.anIntArray324[local41], local18.anIntArray322[local41], local18.anIntArray325[local41]);
			}
		}
		Static100.anInt2460 = 0;
		Static100.anInt2462 = 0;
		Static100.anInt2461 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2923; local47++) {
			@Pc(112) int local112 = local23.anIntArray327[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray15[local112] == 0) {
				this.method1787(local26.anIntArray15[local112], local26.anIntArrayArray1[local112], local23.anIntArray324[local47], local23.anIntArray322[local47], local23.anIntArray325[local47]);
			}
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()V")
	public void method1785() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2454; local1++) {
			@Pc(7) int local7 = this.anIntArray254[local1];
			this.anIntArray254[local1] = this.anIntArray256[local1];
			this.anIntArray256[local1] = -local7;
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
	public void method1786() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2454; local1++) {
			@Pc(7) int local7 = this.anIntArray256[local1];
			this.anIntArray256[local1] = this.anIntArray254[local1];
			this.anIntArray254[local1] = -local7;
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[IIII)V")
	private void method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static100.anInt2460 = 0;
			Static100.anInt2462 = 0;
			Static100.anInt2461 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray25.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray25[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static100.anInt2460 += this.anIntArray256[local36];
						Static100.anInt2462 += this.anIntArray246[local36];
						Static100.anInt2461 += this.anIntArray254[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static100.anInt2460 = Static100.anInt2460 / local6 + arg2;
				Static100.anInt2462 = Static100.anInt2462 / local6 + arg3;
				Static100.anInt2461 = Static100.anInt2461 / local6 + arg4;
			} else {
				Static100.anInt2460 = arg2;
				Static100.anInt2462 = arg3;
				Static100.anInt2461 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray256[local31] += arg2;
						this.anIntArray246[local31] += arg3;
						this.anIntArray254[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray256[local31] -= Static100.anInt2460;
						this.anIntArray246[local31] -= Static100.anInt2462;
						this.anIntArray254[local31] -= Static100.anInt2461;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static100.anIntArray262[local225];
							local235 = Static100.anIntArray267[local225];
							local251 = this.anIntArray246[local31] * local231 + this.anIntArray256[local31] * local235 >> 16;
							this.anIntArray246[local31] = this.anIntArray246[local31] * local235 - this.anIntArray256[local31] * local231 >> 16;
							this.anIntArray256[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static100.anIntArray262[local36];
							local235 = Static100.anIntArray267[local36];
							local251 = this.anIntArray246[local31] * local235 - this.anIntArray254[local31] * local231 >> 16;
							this.anIntArray254[local31] = this.anIntArray246[local31] * local231 + this.anIntArray254[local31] * local235 >> 16;
							this.anIntArray246[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static100.anIntArray262[local219];
							local235 = Static100.anIntArray267[local219];
							local251 = this.anIntArray254[local31] * local231 + this.anIntArray256[local31] * local235 >> 16;
							this.anIntArray254[local31] = this.anIntArray254[local31] * local235 - this.anIntArray256[local31] * local231 >> 16;
							this.anIntArray256[local31] = local251;
						}
						this.anIntArray256[local31] += Static100.anInt2460;
						this.anIntArray246[local31] += Static100.anInt2462;
						this.anIntArray254[local31] += Static100.anInt2461;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray25.length) {
					local115 = this.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray256[local31] -= Static100.anInt2460;
						this.anIntArray246[local31] -= Static100.anInt2462;
						this.anIntArray254[local31] -= Static100.anInt2461;
						this.anIntArray256[local31] = this.anIntArray256[local31] * arg2 / 128;
						this.anIntArray246[local31] = this.anIntArray246[local31] * arg3 / 128;
						this.anIntArray254[local31] = this.anIntArray254[local31] * arg4 / 128;
						this.anIntArray256[local31] += Static100.anInt2460;
						this.anIntArray246[local31] += Static100.anInt2462;
						this.anIntArray254[local31] += Static100.anInt2461;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray24 != null && this.aByteArray102 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray24.length) {
					local115 = this.anIntArrayArray24[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray102[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray102[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
	private void method1788(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static91.anInt2162;
		@Pc(3) int local3 = Static91.anInt2164;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray245[arg0];
		@Pc(15) int local15 = this.anIntArray252[arg0];
		@Pc(20) int local20 = this.anIntArray247[arg0];
		@Pc(24) int local24 = Static100.anIntArray263[local10];
		@Pc(28) int local28 = Static100.anIntArray263[local15];
		@Pc(32) int local32 = Static100.anIntArray263[local20];
		if (this.aByteArray102 == null) {
			Static91.anInt2169 = 0;
		} else {
			Static91.anInt2169 = this.aByteArray102[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static100.anIntArray260[0] = Static100.anIntArray275[local10];
			Static100.anIntArray272[0] = Static100.anIntArray259[local10];
			local5++;
			Static100.anIntArray261[0] = this.anIntArray251[arg0];
		} else {
			local73 = Static100.anIntArray273[local10];
			local77 = Static100.anIntArray274[local10];
			local82 = this.anIntArray251[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static100.anIntArray266[local32 - local24];
				Static100.anIntArray260[0] = local1 + (local73 + ((Static100.anIntArray273[local20] - local73) * local95 >> 16) << 9) / 50;
				Static100.anIntArray272[0] = local3 + (local77 + ((Static100.anIntArray274[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static100.anIntArray261[0] = local82 + ((this.anIntArray249[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static100.anIntArray266[local28 - local24];
				Static100.anIntArray260[local5] = local1 + (local73 + ((Static100.anIntArray273[local15] - local73) * local95 >> 16) << 9) / 50;
				Static100.anIntArray272[local5] = local3 + (local77 + ((Static100.anIntArray274[local15] - local77) * local95 >> 16) << 9) / 50;
				Static100.anIntArray261[local5++] = local82 + ((this.anIntArray253[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static100.anIntArray260[local5] = Static100.anIntArray275[local15];
			Static100.anIntArray272[local5] = Static100.anIntArray259[local15];
			Static100.anIntArray261[local5++] = this.anIntArray253[arg0];
		} else {
			local73 = Static100.anIntArray273[local15];
			local77 = Static100.anIntArray274[local15];
			local82 = this.anIntArray253[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static100.anIntArray266[local24 - local28];
				Static100.anIntArray260[local5] = local1 + (local73 + ((Static100.anIntArray273[local10] - local73) * local95 >> 16) << 9) / 50;
				Static100.anIntArray272[local5] = local3 + (local77 + ((Static100.anIntArray274[local10] - local77) * local95 >> 16) << 9) / 50;
				Static100.anIntArray261[local5++] = local82 + ((this.anIntArray251[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static100.anIntArray266[local32 - local28];
				Static100.anIntArray260[local5] = local1 + (local73 + ((Static100.anIntArray273[local20] - local73) * local95 >> 16) << 9) / 50;
				Static100.anIntArray272[local5] = local3 + (local77 + ((Static100.anIntArray274[local20] - local77) * local95 >> 16) << 9) / 50;
				Static100.anIntArray261[local5++] = local82 + ((this.anIntArray249[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static100.anIntArray260[local5] = Static100.anIntArray275[local20];
			Static100.anIntArray272[local5] = Static100.anIntArray259[local20];
			Static100.anIntArray261[local5++] = this.anIntArray249[arg0];
		} else {
			local73 = Static100.anIntArray273[local20];
			local77 = Static100.anIntArray274[local20];
			local82 = this.anIntArray249[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static100.anIntArray266[local28 - local32];
				Static100.anIntArray260[local5] = local1 + (local73 + ((Static100.anIntArray273[local15] - local73) * local95 >> 16) << 9) / 50;
				Static100.anIntArray272[local5] = local3 + (local77 + ((Static100.anIntArray274[local15] - local77) * local95 >> 16) << 9) / 50;
				Static100.anIntArray261[local5++] = local82 + ((this.anIntArray253[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static100.anIntArray266[local24 - local32];
				Static100.anIntArray260[local5] = local1 + (local73 + ((Static100.anIntArray273[local10] - local73) * local95 >> 16) << 9) / 50;
				Static100.anIntArray272[local5] = local3 + (local77 + ((Static100.anIntArray274[local10] - local77) * local95 >> 16) << 9) / 50;
				Static100.anIntArray261[local5++] = local82 + ((this.anIntArray251[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static100.anIntArray260[0];
		local77 = Static100.anIntArray260[1];
		local82 = Static100.anIntArray260[2];
		local95 = Static100.anIntArray272[0];
		@Pc(590) int local590 = Static100.anIntArray272[1];
		@Pc(594) int local594 = Static100.anIntArray272[2];
		Static91.aBoolean91 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static91.anInt2167 || local77 > Static91.anInt2167 || local82 > Static91.anInt2167) {
				Static91.aBoolean91 = true;
			}
			if (this.aByteArray101 != null && this.aByteArray101[arg0] != -1) {
				local669 = this.aByteArray101[arg0] & 0xFF;
				local674 = this.anIntArray250[local669];
				local679 = this.anIntArray255[local669];
				local684 = this.anIntArray248[local669];
				if (this.anIntArray249[arg0] == -1) {
					Static91.method1596(local95, local590, local594, local73, local77, local82, this.anIntArray251[arg0], this.anIntArray251[arg0], this.anIntArray251[arg0], Static100.anIntArray273[local674], Static100.anIntArray273[local679], Static100.anIntArray273[local684], Static100.anIntArray274[local674], Static100.anIntArray274[local679], Static100.anIntArray274[local684], Static100.anIntArray263[local674], Static100.anIntArray263[local679], Static100.anIntArray263[local684], this.aShortArray13[arg0]);
				} else {
					Static91.method1596(local95, local590, local594, local73, local77, local82, Static100.anIntArray261[0], Static100.anIntArray261[1], Static100.anIntArray261[2], Static100.anIntArray273[local674], Static100.anIntArray273[local679], Static100.anIntArray273[local684], Static100.anIntArray274[local674], Static100.anIntArray274[local679], Static100.anIntArray274[local684], Static100.anIntArray263[local674], Static100.anIntArray263[local679], Static100.anIntArray263[local684], this.aShortArray13[arg0]);
				}
			} else if (this.anIntArray249[arg0] == -1) {
				Static91.method1593(local95, local590, local594, local73, local77, local82, Static100.anIntArray265[this.anIntArray251[arg0]]);
			} else {
				Static91.method1599(local95, local590, local594, local73, local77, local82, Static100.anIntArray261[0], Static100.anIntArray261[1], Static100.anIntArray261[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static91.anInt2167 || local77 > Static91.anInt2167 || local82 > Static91.anInt2167 || Static100.anIntArray260[3] < 0 || Static100.anIntArray260[3] > Static91.anInt2167) {
			Static91.aBoolean91 = true;
		}
		if (this.aByteArray101 == null || this.aByteArray101[arg0] == -1) {
			if (this.anIntArray249[arg0] == -1) {
				local669 = Static100.anIntArray265[this.anIntArray251[arg0]];
				Static91.method1593(local95, local590, local594, local73, local77, local82, local669);
				Static91.method1593(local95, local594, Static100.anIntArray272[3], local73, local82, Static100.anIntArray260[3], local669);
				return;
			}
			Static91.method1599(local95, local590, local594, local73, local77, local82, Static100.anIntArray261[0], Static100.anIntArray261[1], Static100.anIntArray261[2]);
			Static91.method1599(local95, local594, Static100.anIntArray272[3], local73, local82, Static100.anIntArray260[3], Static100.anIntArray261[0], Static100.anIntArray261[2], Static100.anIntArray261[3]);
			return;
		}
		local669 = this.aByteArray101[arg0] & 0xFF;
		local674 = this.anIntArray250[local669];
		local679 = this.anIntArray255[local669];
		local684 = this.anIntArray248[local669];
		@Pc(924) short local924 = this.aShortArray13[arg0];
		if (this.anIntArray249[arg0] == -1) {
			Static91.method1596(local95, local590, local594, local73, local77, local82, this.anIntArray251[arg0], this.anIntArray251[arg0], this.anIntArray251[arg0], Static100.anIntArray273[local674], Static100.anIntArray273[local679], Static100.anIntArray273[local684], Static100.anIntArray274[local674], Static100.anIntArray274[local679], Static100.anIntArray274[local684], Static100.anIntArray263[local674], Static100.anIntArray263[local679], Static100.anIntArray263[local684], local924);
			Static91.method1596(local95, local594, Static100.anIntArray272[3], local73, local82, Static100.anIntArray260[3], this.anIntArray251[arg0], this.anIntArray251[arg0], this.anIntArray251[arg0], Static100.anIntArray273[local674], Static100.anIntArray273[local679], Static100.anIntArray273[local684], Static100.anIntArray274[local674], Static100.anIntArray274[local679], Static100.anIntArray274[local684], Static100.anIntArray263[local674], Static100.anIntArray263[local679], Static100.anIntArray263[local684], local924);
			return;
		}
		Static91.method1596(local95, local590, local594, local73, local77, local82, Static100.anIntArray261[0], Static100.anIntArray261[1], Static100.anIntArray261[2], Static100.anIntArray273[local674], Static100.anIntArray273[local679], Static100.anIntArray273[local684], Static100.anIntArray274[local674], Static100.anIntArray274[local679], Static100.anIntArray274[local684], Static100.anIntArray263[local674], Static100.anIntArray263[local679], Static100.anIntArray263[local684], local924);
		Static91.method1596(local95, local594, Static100.anIntArray272[3], local73, local82, Static100.anIntArray260[3], Static100.anIntArray261[0], Static100.anIntArray261[2], Static100.anIntArray261[3], Static100.anIntArray273[local674], Static100.anIntArray273[local679], Static100.anIntArray273[local684], Static100.anIntArray274[local674], Static100.anIntArray274[local679], Static100.anIntArray274[local684], Static100.anIntArray263[local674], Static100.anIntArray263[local679], Static100.anIntArray263[local684], local924);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
	public void method1789() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2454; local1++) {
			this.anIntArray256[local1] = -this.anIntArray256[local1];
			this.anIntArray254[local1] = -this.anIntArray254[local1];
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V")
	public void method1790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static100.anIntArray257[0] = -1;
		if (this.anInt2456 != 2 && this.anInt2456 != 1) {
			this.method1792();
		}
		@Pc(15) int local15 = Static91.anInt2162;
		@Pc(17) int local17 = Static91.anInt2164;
		@Pc(21) int local21 = Static100.anIntArray262[0];
		@Pc(25) int local25 = Static100.anIntArray267[0];
		@Pc(29) int local29 = Static100.anIntArray262[arg0];
		@Pc(33) int local33 = Static100.anIntArray267[arg0];
		@Pc(37) int local37 = Static100.anIntArray262[arg1];
		@Pc(41) int local41 = Static100.anIntArray267[arg1];
		@Pc(45) int local45 = Static100.anIntArray262[arg2];
		@Pc(49) int local49 = Static100.anIntArray267[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2454; local61++) {
			@Pc(67) int local67 = this.anIntArray256[local61];
			@Pc(72) int local72 = this.anIntArray246[local61];
			@Pc(77) int local77 = this.anIntArray254[local61];
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
			Static100.anIntArray269[local61] = local77 - local59;
			Static100.anIntArray275[local61] = local15 + (local67 << 9) / local77;
			Static100.anIntArray259[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2451 > 0) {
				Static100.anIntArray273[local61] = local67;
				Static100.anIntArray274[local61] = local89;
				Static100.anIntArray263[local61] = local77;
			}
		}
		try {
			this.method1803(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1791(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static100.aByteArray105.length < this.anInt2457) {
			Static100.aByteArray105 = new byte[this.anInt2457 + 100];
		}
		return this.method1801(arg0, Static100.aClass4_Sub4_Sub1_Sub6_2, Static100.aByteArray105);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()V")
	private void method1792() {
		if (this.anInt2456 == 2) {
			return;
		}
		this.anInt2456 = 2;
		this.anInt2455 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2454; local12++) {
			@Pc(18) int local18 = this.anIntArray256[local12];
			@Pc(23) int local23 = this.anIntArray246[local12];
			@Pc(28) int local28 = this.anIntArray254[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2455) {
				this.anInt2455 = local40;
			}
		}
		this.anInt2455 = (int) (Math.sqrt((double) this.anInt2455) + 0.99D);
		this.anInt2452 = this.anInt2455;
		this.anInt2453 = this.anInt2455 + this.anInt2455;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)V")
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2454; local1++) {
			this.anIntArray256[local1] = this.anIntArray256[local1] * arg0 / 128;
			this.anIntArray246[local1] = this.anIntArray246[local1] * arg1 / 128;
			this.anIntArray254[local1] = this.anIntArray254[local1] * arg2 / 128;
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIZ)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class4_Sub4_Sub1_Sub6 local16;
		if (arg4) {
			local16 = new Class4_Sub4_Sub1_Sub6();
			local16.anInt2454 = this.anInt2454;
			local16.anInt2457 = this.anInt2457;
			local16.anInt2451 = this.anInt2451;
			local16.anIntArray256 = this.anIntArray256;
			local16.anIntArray254 = this.anIntArray254;
			local16.anIntArray245 = this.anIntArray245;
			local16.anIntArray252 = this.anIntArray252;
			local16.anIntArray247 = this.anIntArray247;
			local16.anIntArray251 = this.anIntArray251;
			local16.anIntArray253 = this.anIntArray253;
			local16.anIntArray249 = this.anIntArray249;
			local16.aByteArray104 = this.aByteArray104;
			local16.aByteArray102 = this.aByteArray102;
			local16.aByteArray101 = this.aByteArray101;
			local16.aShortArray13 = this.aShortArray13;
			local16.aByte4 = this.aByte4;
			local16.anIntArray250 = this.anIntArray250;
			local16.anIntArray255 = this.anIntArray255;
			local16.anIntArray248 = this.anIntArray248;
			local16.anIntArrayArray25 = this.anIntArrayArray25;
			local16.anIntArrayArray24 = this.anIntArrayArray24;
			local16.aBoolean110 = this.aBoolean110;
			local16.anIntArray246 = new int[local16.anInt2454];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt2454; local124++) {
			@Pc(130) int local130 = this.anIntArray256[local124];
			@Pc(135) int local135 = this.anIntArray246[local124];
			@Pc(140) int local140 = this.anIntArray254[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray246[local124] = local135 + local176 - local122;
		}
		local16.anInt2456 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "()I")
	public int method1795() {
		this.method1799();
		return this.anInt2455;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static100.anIntArray257[0] = -1;
		if (this.anInt2456 != 1) {
			this.method1799();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2455 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2455 << 9;
		if (local64 / local40 >= Static91.anInt2170) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2455 << 9;
		if (local77 / local40 <= Static91.anInt2166) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2455 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static91.anInt2168) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2816 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static91.anInt2165) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2816 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2451 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static100.aBoolean111) {
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
			local219 = Static100.anInt2463 - Static91.anInt2162;
			local223 = Static100.anInt2459 - Static91.anInt2164;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean110) {
					Static100.anIntArray258[Static100.anInt2458++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static91.anInt2162;
		local219 = Static91.anInt2164;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static100.anIntArray262[arg0];
			local257 = Static100.anIntArray267[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2454; local269++) {
			@Pc(275) int local275 = this.anIntArray256[local269];
			@Pc(280) int local280 = this.anIntArray246[local269];
			@Pc(285) int local285 = this.anIntArray254[local269];
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
			Static100.anIntArray269[local269] = local285 - local29;
			if (local285 >= 50) {
				Static100.anIntArray275[local269] = local172 + (local275 << 9) / local285;
				Static100.anIntArray259[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static100.anIntArray275[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static100.anIntArray273[local269] = local275;
				Static100.anIntArray274[local269] = local297;
				Static100.anIntArray263[local269] = local285;
			}
		}
		try {
			this.method1803(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public void method1796(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static100.anIntArray262[arg0];
		@Pc(7) int local7 = Static100.anIntArray267[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2454; local9++) {
			@Pc(26) int local26 = this.anIntArray246[local9] * local7 - this.anIntArray254[local9] * local3 >> 16;
			this.anIntArray254[local9] = this.anIntArray246[local9] * local3 + this.anIntArray254[local9] * local7 >> 16;
			this.anIntArray246[local9] = local26;
		}
		this.anInt2456 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V")
	public void method1797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static100.anIntArray257[0] = -1;
		if (this.anInt2456 != 2 && this.anInt2456 != 1) {
			this.method1792();
		}
		@Pc(15) int local15 = Static91.anInt2162;
		@Pc(17) int local17 = Static91.anInt2164;
		@Pc(21) int local21 = Static100.anIntArray262[0];
		@Pc(25) int local25 = Static100.anIntArray267[0];
		@Pc(29) int local29 = Static100.anIntArray262[arg0];
		@Pc(33) int local33 = Static100.anIntArray267[arg0];
		@Pc(37) int local37 = Static100.anIntArray262[arg1];
		@Pc(41) int local41 = Static100.anIntArray267[arg1];
		@Pc(45) int local45 = Static100.anIntArray262[arg2];
		@Pc(49) int local49 = Static100.anIntArray267[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2454; local61++) {
			@Pc(67) int local67 = this.anIntArray256[local61];
			@Pc(72) int local72 = this.anIntArray246[local61];
			@Pc(77) int local77 = this.anIntArray254[local61];
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
			Static100.anIntArray269[local61] = local77 - local59;
			Static100.anIntArray275[local61] = local15 + (local67 << 9) / arg6;
			Static100.anIntArray259[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2451 > 0) {
				Static100.anIntArray273[local61] = local67;
				Static100.anIntArray274[local61] = local89;
				Static100.anIntArray263[local61] = local77;
			}
		}
		try {
			this.method1803(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(Z)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1798(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static100.aByteArray103.length < this.anInt2457) {
			Static100.aByteArray103 = new byte[this.anInt2457 + 100];
		}
		return this.method1801(arg0, Static100.aClass4_Sub4_Sub1_Sub6_1, Static100.aByteArray103);
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "()V")
	public void method1799() {
		if (this.anInt2456 == 1) {
			return;
		}
		this.anInt2456 = 1;
		super.anInt2816 = 0;
		this.anInt2450 = 0;
		this.anInt2455 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2454; local18++) {
			@Pc(24) int local24 = this.anIntArray256[local18];
			@Pc(29) int local29 = this.anIntArray246[local18];
			@Pc(34) int local34 = this.anIntArray254[local18];
			if (-local29 > super.anInt2816) {
				super.anInt2816 = -local29;
			}
			if (local29 > this.anInt2450) {
				this.anInt2450 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2455) {
				this.anInt2455 = local58;
			}
		}
		this.anInt2455 = (int) (Math.sqrt((double) this.anInt2455) + 0.99D);
		this.anInt2452 = (int) (Math.sqrt((double) (this.anInt2455 * this.anInt2455 + super.anInt2816 * super.anInt2816)) + 0.99D);
		this.anInt2453 = this.anInt2452 + (int) (Math.sqrt((double) (this.anInt2455 * this.anInt2455 + this.anInt2450 * this.anInt2450)) + 0.99D);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!rb;[B)Lclient!rb;")
	private Class4_Sub4_Sub1_Sub6 method1801(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub4_Sub1_Sub6 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2454 = this.anInt2454;
		arg1.anInt2457 = this.anInt2457;
		arg1.anInt2451 = this.anInt2451;
		if (arg1.anIntArray256 == null || arg1.anIntArray256.length < this.anInt2454) {
			arg1.anIntArray256 = new int[this.anInt2454 + 100];
			arg1.anIntArray246 = new int[this.anInt2454 + 100];
			arg1.anIntArray254 = new int[this.anInt2454 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2454; local43++) {
			arg1.anIntArray256[local43] = this.anIntArray256[local43];
			arg1.anIntArray246[local43] = this.anIntArray246[local43];
			arg1.anIntArray254[local43] = this.anIntArray254[local43];
		}
		if (arg0) {
			arg1.aByteArray102 = this.aByteArray102;
		} else {
			arg1.aByteArray102 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray102 == null) {
				for (local88 = 0; local88 < this.anInt2457; local88++) {
					arg1.aByteArray102[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2457; local88++) {
					arg1.aByteArray102[local88] = this.aByteArray102[local88];
				}
			}
		}
		arg1.anIntArray245 = this.anIntArray245;
		arg1.anIntArray252 = this.anIntArray252;
		arg1.anIntArray247 = this.anIntArray247;
		arg1.anIntArray251 = this.anIntArray251;
		arg1.anIntArray253 = this.anIntArray253;
		arg1.anIntArray249 = this.anIntArray249;
		arg1.aByteArray104 = this.aByteArray104;
		arg1.aByteArray101 = this.aByteArray101;
		arg1.aShortArray13 = this.aShortArray13;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray250 = this.anIntArray250;
		arg1.anIntArray255 = this.anIntArray255;
		arg1.anIntArray248 = this.anIntArray248;
		arg1.anIntArrayArray25 = this.anIntArrayArray25;
		arg1.anIntArrayArray24 = this.anIntArrayArray24;
		arg1.aBoolean110 = this.aBoolean110;
		arg1.anInt2456 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZI)V")
	private void method1803(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2453 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2453; local6++) {
			Static100.anIntArray257[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2457; local18++) {
			if (this.anIntArray249[local18] != -2) {
				local30 = this.anIntArray245[local18];
				local35 = this.anIntArray252[local18];
				local40 = this.anIntArray247[local18];
				local44 = Static100.anIntArray275[local30];
				local48 = Static100.anIntArray275[local35];
				local52 = Static100.anIntArray275[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static100.anIntArray273[local30];
					local71 = Static100.anIntArray273[local35];
					@Pc(75) int local75 = Static100.anIntArray273[local40];
					@Pc(79) int local79 = Static100.anIntArray274[local30];
					local83 = Static100.anIntArray274[local35];
					local87 = Static100.anIntArray274[local40];
					@Pc(91) int local91 = Static100.anIntArray263[local30];
					local95 = Static100.anIntArray263[local35];
					@Pc(99) int local99 = Static100.anIntArray263[local40];
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
						Static100.aBooleanArray14[local18] = true;
						@Pc(180) int local180 = (Static100.anIntArray269[local30] + Static100.anIntArray269[local35] + Static100.anIntArray269[local40]) / 3 + this.anInt2452;
						Static100.anIntArrayArray26[local180][Static100.anIntArray257[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1800(Static100.anInt2463, Static100.anInt2459, Static100.anIntArray259[local30], Static100.anIntArray259[local35], Static100.anIntArray259[local40], local44, local48, local52)) {
						Static100.anIntArray258[Static100.anInt2458++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static100.anIntArray259[local40] - Static100.anIntArray259[local35]) - (Static100.anIntArray259[local30] - Static100.anIntArray259[local35]) * (local52 - local48) > 0) {
						Static100.aBooleanArray14[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static91.anInt2167 && local48 <= Static91.anInt2167 && local52 <= Static91.anInt2167) {
							Static100.aBooleanArray15[local18] = false;
						} else {
							Static100.aBooleanArray15[local18] = true;
						}
						local67 = (Static100.anIntArray269[local30] + Static100.anIntArray269[local35] + Static100.anIntArray269[local40]) / 3 + this.anInt2452;
						Static100.anIntArrayArray26[local67][Static100.anIntArray257[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray104 == null) {
			for (local30 = this.anInt2453 - 1; local30 >= 0; local30--) {
				local35 = Static100.anIntArray257[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static100.anIntArrayArray26[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1782(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static100.anIntArray271[local30] = 0;
			Static100.anIntArray268[local30] = 0;
		}
		for (local35 = this.anInt2453 - 1; local35 >= 0; local35--) {
			local40 = Static100.anIntArray257[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static100.anIntArrayArray26[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray104[local52];
					local71 = Static100.anIntArray271[local388]++;
					Static100.anIntArrayArray27[local388][local71] = local52;
					if (local388 < 10) {
						Static100.anIntArray268[local388] += local35;
					} else if (local388 == 10) {
						Static100.anIntArray264[local71] = local35;
					} else {
						Static100.anIntArray270[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static100.anIntArray271[1] > 0 || Static100.anIntArray271[2] > 0) {
			local40 = (Static100.anIntArray268[1] + Static100.anIntArray268[2]) / (Static100.anIntArray271[1] + Static100.anIntArray271[2]);
		}
		local44 = 0;
		if (Static100.anIntArray271[3] > 0 || Static100.anIntArray271[4] > 0) {
			local44 = (Static100.anIntArray268[3] + Static100.anIntArray268[4]) / (Static100.anIntArray271[3] + Static100.anIntArray271[4]);
		}
		local48 = 0;
		if (Static100.anIntArray271[6] > 0 || Static100.anIntArray271[8] > 0) {
			local48 = (Static100.anIntArray268[6] + Static100.anIntArray268[8]) / (Static100.anIntArray271[6] + Static100.anIntArray271[8]);
		}
		local67 = 0;
		local71 = Static100.anIntArray271[10];
		@Pc(521) int[] local521 = Static100.anIntArrayArray27[10];
		@Pc(523) int[] local523 = Static100.anIntArray264;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static100.anIntArray271[11];
			local521 = Static100.anIntArrayArray27[11];
			local523 = Static100.anIntArray270;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1782(local521[local67++]);
				if (local67 == local71 && local521 != Static100.anIntArrayArray27[11]) {
					local67 = 0;
					local71 = Static100.anIntArray271[11];
					local521 = Static100.anIntArrayArray27[11];
					local523 = Static100.anIntArray270;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1782(local521[local67++]);
				if (local67 == local71 && local521 != Static100.anIntArrayArray27[11]) {
					local67 = 0;
					local71 = Static100.anIntArray271[11];
					local521 = Static100.anIntArrayArray27[11];
					local523 = Static100.anIntArray270;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1782(local521[local67++]);
				if (local67 == local71 && local521 != Static100.anIntArrayArray27[11]) {
					local67 = 0;
					local71 = Static100.anIntArray271[11];
					local521 = Static100.anIntArrayArray27[11];
					local523 = Static100.anIntArray270;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static100.anIntArray271[local83];
			@Pc(686) int[] local686 = Static100.anIntArrayArray27[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1782(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1782(local521[local67++]);
			if (local67 == local71 && local521 != Static100.anIntArrayArray27[11]) {
				local67 = 0;
				local521 = Static100.anIntArrayArray27[11];
				local71 = Static100.anIntArray271[11];
				local523 = Static100.anIntArray270;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method1804(@OriginalArg(0) Class4_Sub4_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray25 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class76 local12 = arg0.aClass76Array1[arg1];
		@Pc(15) Class4_Sub3 local15 = local12.aClass4_Sub3_1;
		Static100.anInt2460 = 0;
		Static100.anInt2462 = 0;
		Static100.anInt2461 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2923; local23++) {
			@Pc(29) int local29 = local12.anIntArray327[local23];
			this.method1787(local15.anIntArray15[local29], local15.anIntArrayArray1[local29], local12.anIntArray324[local23], local12.anIntArray322[local23], local12.anIntArray325[local23]);
		}
		this.anInt2456 = 0;
	}
}
