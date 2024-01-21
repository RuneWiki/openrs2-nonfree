import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class4_Sub1_Sub3_Sub4 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!p", name = "T", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!p", name = "U", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!p", name = "V", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!p", name = "W", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!p", name = "X", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!p", name = "Z", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!p", name = "fb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!p", name = "gb", descriptor = "[Lclient!kb;")
	public Class37[] aClass37Array1;

	@OriginalMember(owner = "client!p", name = "ib", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!p", name = "jb", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!p", name = "kb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!p", name = "lb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!p", name = "mb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!p", name = "nb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!p", name = "ob", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!p", name = "pb", descriptor = "I")
	public int anInt2308;

	@OriginalMember(owner = "client!p", name = "qb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!p", name = "rb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!p", name = "sb", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!p", name = "tb", descriptor = "[Lclient!kb;")
	public Class37[] aClass37Array2;

	@OriginalMember(owner = "client!p", name = "ub", descriptor = "I")
	private int anInt2309;

	@OriginalMember(owner = "client!p", name = "wb", descriptor = "I")
	public int anInt2310;

	@OriginalMember(owner = "client!p", name = "xb", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!p", name = "Ab", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!p", name = "Bb", descriptor = "I")
	public int anInt2312;

	@OriginalMember(owner = "client!p", name = "Cb", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!p", name = "Db", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!p", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!p", name = "Fb", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!p", name = "Hb", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!p", name = "Ib", descriptor = "I")
	public int anInt2313;

	@OriginalMember(owner = "client!p", name = "Jb", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!p", name = "Kb", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!p", name = "Lb", descriptor = "[Lclient!na;")
	private Class51[] aClass51Array1;

	@OriginalMember(owner = "client!p", name = "Mb", descriptor = "I")
	public int anInt2314;

	@OriginalMember(owner = "client!p", name = "Nb", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
	public int anInt2306 = 0;

	@OriginalMember(owner = "client!p", name = "yb", descriptor = "I")
	public int anInt2311 = 0;

	@OriginalMember(owner = "client!p", name = "vb", descriptor = "B")
	private byte aByte6 = 0;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	private Class4_Sub1_Sub3_Sub4() {
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
	public Class4_Sub1_Sub3_Sub4(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1519(arg0);
		} else {
			this.method1525(arg0);
		}
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "([Lclient!p;I)V")
	public Class4_Sub1_Sub3_Sub4(@OriginalArg(0) Class4_Sub1_Sub3_Sub4[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2306 = 0;
		this.anInt2311 = 0;
		this.anInt2309 = 0;
		this.aByte6 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class4_Sub1_Sub3_Sub4 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2306 += local44.anInt2306;
				this.anInt2311 += local44.anInt2311;
				this.anInt2309 += local44.anInt2309;
				if (local44.aByteArray38 == null) {
					if (this.aByte6 == -1) {
						this.aByte6 = local44.aByte6;
					}
					if (this.aByte6 != local44.aByte6) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray37 != null;
				local19 |= local44.aByteArray36 != null;
				local21 |= local44.anIntArray268 != null;
				local23 |= local44.aShortArray26 != null;
				local25 |= local44.aByteArray35 != null;
			}
		}
		this.anIntArray261 = new int[this.anInt2306];
		this.anIntArray264 = new int[this.anInt2306];
		this.anIntArray258 = new int[this.anInt2306];
		this.anIntArray263 = new int[this.anInt2306];
		this.anIntArray259 = new int[this.anInt2311];
		this.anIntArray269 = new int[this.anInt2311];
		this.anIntArray266 = new int[this.anInt2311];
		if (local15) {
			this.aByteArray37 = new byte[this.anInt2311];
		}
		if (local17) {
			this.aByteArray38 = new byte[this.anInt2311];
		}
		if (local19) {
			this.aByteArray36 = new byte[this.anInt2311];
		}
		if (local21) {
			this.anIntArray268 = new int[this.anInt2311];
		}
		if (local23) {
			this.aShortArray26 = new short[this.anInt2311];
		}
		if (local25) {
			this.aByteArray35 = new byte[this.anInt2311];
		}
		this.aShortArray25 = new short[this.anInt2311];
		if (this.anInt2309 > 0) {
			this.aByteArray39 = new byte[this.anInt2309];
			this.aShortArray35 = new short[this.anInt2309];
			this.aShortArray27 = new short[this.anInt2309];
			this.aShortArray29 = new short[this.anInt2309];
			this.aShortArray34 = new short[this.anInt2309];
			this.aShortArray30 = new short[this.anInt2309];
			this.aShortArray32 = new short[this.anInt2309];
			this.aShortArray31 = new short[this.anInt2309];
			this.aByteArray40 = new byte[this.anInt2309];
			this.aShortArray33 = new short[this.anInt2309];
			this.aShortArray28 = new short[this.anInt2309];
		}
		this.anInt2306 = 0;
		this.anInt2311 = 0;
		this.anInt2309 = 0;
		for (@Pc(288) int local288 = 0; local288 < arg1; local288++) {
			@Pc(293) Class4_Sub1_Sub3_Sub4 local293 = arg0[local288];
			if (local293 != null) {
				for (@Pc(297) int local297 = 0; local297 < local293.anInt2311; local297++) {
					if (local15 && local293.aByteArray37 != null) {
						this.aByteArray37[this.anInt2311] = local293.aByteArray37[local297];
					}
					if (local17) {
						if (local293.aByteArray38 == null) {
							this.aByteArray38[this.anInt2311] = local293.aByte6;
						} else {
							this.aByteArray38[this.anInt2311] = local293.aByteArray38[local297];
						}
					}
					if (local19 && local293.aByteArray36 != null) {
						this.aByteArray36[this.anInt2311] = local293.aByteArray36[local297];
					}
					if (local21 && local293.anIntArray268 != null) {
						this.anIntArray268[this.anInt2311] = local293.anIntArray268[local297];
					}
					if (local23) {
						if (local293.aShortArray26 == null) {
							this.aShortArray26[this.anInt2311] = -1;
						} else {
							this.aShortArray26[this.anInt2311] = local293.aShortArray26[local297];
						}
					}
					if (local25) {
						if (local293.aByteArray35 == null || local293.aByteArray35[local297] == -1) {
							this.aByteArray35[this.anInt2311] = -1;
						} else {
							this.aByteArray35[this.anInt2311] = (byte) (local293.aByteArray35[local297] + this.anInt2309);
						}
					}
					this.aShortArray25[this.anInt2311] = local293.aShortArray25[local297];
					this.anIntArray259[this.anInt2311] = this.method1529(local293, local293.anIntArray259[local297]);
					this.anIntArray269[this.anInt2311] = this.method1529(local293, local293.anIntArray269[local297]);
					this.anIntArray266[this.anInt2311] = this.method1529(local293, local293.anIntArray266[local297]);
					this.anInt2311++;
				}
				for (@Pc(472) int local472 = 0; local472 < local293.anInt2309; local472++) {
					@Pc(484) byte local484 = this.aByteArray39[this.anInt2309] = local293.aByteArray39[local472];
					if (local484 == 0) {
						this.aShortArray35[this.anInt2309] = (short) this.method1529(local293, local293.aShortArray35[local472]);
						this.aShortArray27[this.anInt2309] = (short) this.method1529(local293, local293.aShortArray27[local472]);
						this.aShortArray29[this.anInt2309] = (short) this.method1529(local293, local293.aShortArray29[local472]);
					}
					if (local484 >= 1 && local484 <= 3) {
						this.aShortArray35[this.anInt2309] = local293.aShortArray35[local472];
						this.aShortArray27[this.anInt2309] = local293.aShortArray27[local472];
						this.aShortArray29[this.anInt2309] = local293.aShortArray29[local472];
						this.aShortArray34[this.anInt2309] = local293.aShortArray34[local472];
						this.aShortArray30[this.anInt2309] = local293.aShortArray30[local472];
						this.aShortArray32[this.anInt2309] = local293.aShortArray32[local472];
						this.aShortArray31[this.anInt2309] = local293.aShortArray31[local472];
						this.aByteArray40[this.anInt2309] = local293.aByteArray40[local472];
						this.aShortArray33[this.anInt2309] = local293.aShortArray33[local472];
					}
					if (local484 == 2) {
						this.aShortArray28[this.anInt2309] = local293.aShortArray28[local472];
					}
					this.anInt2309++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!p;ZZZZ)V")
	public Class4_Sub1_Sub3_Sub4(@OriginalArg(0) Class4_Sub1_Sub3_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2306 = arg0.anInt2306;
		this.anInt2311 = arg0.anInt2311;
		this.anInt2309 = arg0.anInt2309;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray261 = arg0.anIntArray261;
			this.anIntArray264 = arg0.anIntArray264;
			this.anIntArray258 = arg0.anIntArray258;
		} else {
			this.anIntArray261 = new int[this.anInt2306];
			this.anIntArray264 = new int[this.anInt2306];
			this.anIntArray258 = new int[this.anInt2306];
			for (local57 = 0; local57 < this.anInt2306; local57++) {
				this.anIntArray261[local57] = arg0.anIntArray261[local57];
				this.anIntArray264[local57] = arg0.anIntArray264[local57];
				this.anIntArray258[local57] = arg0.anIntArray258[local57];
			}
		}
		if (arg2) {
			this.aShortArray25 = arg0.aShortArray25;
		} else {
			this.aShortArray25 = new short[this.anInt2311];
			for (local57 = 0; local57 < this.anInt2311; local57++) {
				this.aShortArray25[local57] = arg0.aShortArray25[local57];
			}
		}
		if (arg3 || arg0.aShortArray26 == null) {
			this.aShortArray26 = arg0.aShortArray26;
		} else {
			this.aShortArray26 = new short[this.anInt2311];
			for (local57 = 0; local57 < this.anInt2311; local57++) {
				this.aShortArray26[local57] = arg0.aShortArray26[local57];
			}
		}
		this.aByteArray36 = arg0.aByteArray36;
		this.anIntArray259 = arg0.anIntArray259;
		this.anIntArray269 = arg0.anIntArray269;
		this.anIntArray266 = arg0.anIntArray266;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray38 = arg0.aByteArray38;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByte6 = arg0.aByte6;
		this.aByteArray39 = arg0.aByteArray39;
		this.aShortArray35 = arg0.aShortArray35;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray34 = arg0.aShortArray34;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray32 = arg0.aShortArray32;
		this.aShortArray31 = arg0.aShortArray31;
		this.aByteArray40 = arg0.aByteArray40;
		this.aShortArray33 = arg0.aShortArray33;
		this.aShortArray28 = arg0.aShortArray28;
		this.anIntArray263 = arg0.anIntArray263;
		this.anIntArray268 = arg0.anIntArray268;
		this.anIntArrayArray25 = arg0.anIntArrayArray25;
		this.anIntArrayArray26 = arg0.anIntArrayArray26;
		this.aClass37Array1 = arg0.aClass37Array1;
		this.aClass51Array1 = arg0.aClass51Array1;
		this.aClass37Array2 = arg0.aClass37Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method1516() {
		@Pc(3) Class4_Sub1_Sub3_Sub4 local3 = new Class4_Sub1_Sub3_Sub4();
		if (this.aByteArray37 != null) {
			local3.aByteArray37 = new byte[this.anInt2311];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2311; local13++) {
				local3.aByteArray37[local13] = this.aByteArray37[local13];
			}
		}
		local3.anInt2306 = this.anInt2306;
		local3.anInt2311 = this.anInt2311;
		local3.anInt2309 = this.anInt2309;
		local3.anIntArray261 = this.anIntArray261;
		local3.anIntArray264 = this.anIntArray264;
		local3.anIntArray258 = this.anIntArray258;
		local3.anIntArray259 = this.anIntArray259;
		local3.anIntArray269 = this.anIntArray269;
		local3.anIntArray266 = this.anIntArray266;
		local3.aByteArray38 = this.aByteArray38;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray35 = this.aByteArray35;
		local3.aShortArray25 = this.aShortArray25;
		local3.aShortArray26 = this.aShortArray26;
		local3.aByte6 = this.aByte6;
		local3.aByteArray39 = this.aByteArray39;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray32 = this.aShortArray32;
		local3.aShortArray31 = this.aShortArray31;
		local3.aByteArray40 = this.aByteArray40;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray28 = this.aShortArray28;
		local3.anIntArray263 = this.anIntArray263;
		local3.anIntArray268 = this.anIntArray268;
		local3.anIntArrayArray25 = this.anIntArrayArray25;
		local3.anIntArrayArray26 = this.anIntArrayArray26;
		local3.aClass37Array1 = this.aClass37Array1;
		local3.aClass51Array1 = this.aClass51Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(SS)V")
	public void method1517(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2311; local1++) {
			if (this.aShortArray25[local1] == arg0) {
				this.aShortArray25[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(III)V")
	public void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2306; local1++) {
			this.anIntArray261[local1] += arg0;
			this.anIntArray264[local1] += arg1;
			this.anIntArray258[local1] += arg2;
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([B)V")
	private void method1519(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub11 local4 = new Class4_Sub11(arg0);
		@Pc(9) Class4_Sub11 local9 = new Class4_Sub11(arg0);
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(arg0);
		@Pc(24) Class4_Sub11 local24 = new Class4_Sub11(arg0);
		@Pc(29) Class4_Sub11 local29 = new Class4_Sub11(arg0);
		@Pc(34) Class4_Sub11 local34 = new Class4_Sub11(arg0);
		local4.anInt1099 = arg0.length - 23;
		@Pc(44) int local44 = local4.method718();
		@Pc(48) int local48 = local4.method718();
		@Pc(52) int local52 = local4.method719();
		@Pc(56) int local56 = local4.method719();
		@Pc(60) int local60 = local4.method719();
		@Pc(64) int local64 = local4.method719();
		@Pc(68) int local68 = local4.method719();
		@Pc(72) int local72 = local4.method719();
		@Pc(76) int local76 = local4.method719();
		@Pc(80) int local80 = local4.method718();
		@Pc(84) int local84 = local4.method718();
		@Pc(88) int local88 = local4.method718();
		@Pc(92) int local92 = local4.method718();
		@Pc(96) int local96 = local4.method718();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray39 = new byte[local52];
			local4.anInt1099 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray39[local113] = local4.method731();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100 * 2;
		@Pc(283) int local283 = local113;
		local113 += local100;
		@Pc(289) int local289 = local113;
		local113 += local100 * 2 + local102 * 2;
		this.anInt2306 = local44;
		this.anInt2311 = local48;
		this.anInt2309 = local52;
		this.anIntArray261 = new int[local44];
		this.anIntArray264 = new int[local44];
		this.anIntArray258 = new int[local44];
		this.anIntArray259 = new int[local48];
		this.anIntArray269 = new int[local48];
		this.anIntArray266 = new int[local48];
		if (local76 == 1) {
			this.anIntArray263 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray37 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray38 = new byte[local48];
		} else {
			this.aByte6 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray36 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray268 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray26 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray35 = new byte[local48];
		}
		this.aShortArray25 = new short[local48];
		if (local52 > 0) {
			this.aShortArray35 = new short[local52];
			this.aShortArray27 = new short[local52];
			this.aShortArray29 = new short[local52];
			if (local100 > 0) {
				this.aShortArray34 = new short[local100];
				this.aShortArray30 = new short[local100];
				this.aShortArray32 = new short[local100];
				this.aShortArray31 = new short[local100];
				this.aByteArray40 = new byte[local100];
				this.aShortArray33 = new short[local100];
			}
			if (local102 > 0) {
				this.aShortArray28 = new short[local102];
			}
		}
		local4.anInt1099 = local52;
		local9.anInt1099 = local233;
		local14.anInt1099 = local239;
		local19.anInt1099 = local245;
		local24.anInt1099 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method719();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method703();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method703();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method703();
			}
			this.anIntArray261[local463] = local457 + local470;
			this.anIntArray264[local463] = local459 + local480;
			this.anIntArray258[local463] = local461 + local490;
			local457 = this.anIntArray261[local463];
			local459 = this.anIntArray264[local463];
			local461 = this.anIntArray258[local463];
			if (local76 == 1) {
				this.anIntArray263[local463] = local24.method719();
			}
		}
		local4.anInt1099 = local225;
		local9.anInt1099 = local151;
		local14.anInt1099 = local166;
		local19.anInt1099 = local193;
		local24.anInt1099 = local175;
		local29.anInt1099 = local208;
		local34.anInt1099 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray25[local468] = (short) local4.method718();
			if (local56 == 1) {
				this.aByteArray37[local468] = local9.method731();
			}
			if (local60 == 255) {
				this.aByteArray38[local468] = local14.method731();
			}
			if (local64 == 1) {
				this.aByteArray36[local468] = local19.method731();
			}
			if (local68 == 1) {
				this.anIntArray268[local468] = local24.method719();
			}
			if (local72 == 1) {
				this.aShortArray26[local468] = (short) (local29.method718() - 1);
			}
			if (this.aByteArray35 != null && this.aShortArray26[local468] != -1) {
				this.aByteArray35[local468] = (byte) (local34.method719() - 1);
			}
		}
		local4.anInt1099 = local202;
		local9.anInt1099 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(670) int local670 = 0;
		@Pc(677) int local677;
		@Pc(780) int local780;
		for (@Pc(672) int local672 = 0; local672 < local48; local672++) {
			local677 = local9.method719();
			if (local677 == 1) {
				local470 = local4.method703() + local670;
				local480 = local4.method703() + local470;
				local490 = local4.method703() + local480;
				local670 = local490;
				this.anIntArray259[local672] = local470;
				this.anIntArray269[local672] = local480;
				this.anIntArray266[local672] = local490;
			}
			if (local677 == 2) {
				local480 = local490;
				local490 = local4.method703() + local670;
				local670 = local490;
				this.anIntArray259[local672] = local470;
				this.anIntArray269[local672] = local480;
				this.anIntArray266[local672] = local490;
			}
			if (local677 == 3) {
				local470 = local490;
				local490 = local4.method703() + local670;
				local670 = local490;
				this.anIntArray259[local672] = local470;
				this.anIntArray269[local672] = local480;
				this.anIntArray266[local672] = local490;
			}
			if (local677 == 4) {
				local780 = local470;
				local470 = local480;
				local480 = local780;
				local490 = local4.method703() + local670;
				local670 = local490;
				this.anIntArray259[local672] = local470;
				this.anIntArray269[local672] = local780;
				this.anIntArray266[local672] = local490;
			}
		}
		local4.anInt1099 = local251;
		local9.anInt1099 = local259;
		local14.anInt1099 = local267;
		local19.anInt1099 = local275;
		local24.anInt1099 = local283;
		local29.anInt1099 = local289;
		for (local677 = 0; local677 < local52; local677++) {
			local780 = this.aByteArray39[local677] & 0xFF;
			if (local780 == 0) {
				this.aShortArray35[local677] = (short) local4.method718();
				this.aShortArray27[local677] = (short) local4.method718();
				this.aShortArray29[local677] = (short) local4.method718();
			}
			if (local780 == 1) {
				this.aShortArray35[local677] = (short) local9.method718();
				this.aShortArray27[local677] = (short) local9.method718();
				this.aShortArray29[local677] = (short) local9.method718();
				this.aShortArray34[local677] = (short) local14.method718();
				this.aShortArray30[local677] = (short) local14.method718();
				this.aShortArray32[local677] = (short) local14.method718();
				this.aShortArray31[local677] = (short) local19.method718();
				this.aByteArray40[local677] = local24.method731();
				this.aShortArray33[local677] = (short) local29.method718();
			}
			if (local780 == 2) {
				this.aShortArray35[local677] = (short) local9.method718();
				this.aShortArray27[local677] = (short) local9.method718();
				this.aShortArray29[local677] = (short) local9.method718();
				this.aShortArray34[local677] = (short) local14.method718();
				this.aShortArray30[local677] = (short) local14.method718();
				this.aShortArray32[local677] = (short) local14.method718();
				this.aShortArray31[local677] = (short) local19.method718();
				this.aByteArray40[local677] = local24.method731();
				this.aShortArray33[local677] = (short) local29.method718();
				this.aShortArray28[local677] = (short) local29.method718();
			}
			if (local780 == 3) {
				this.aShortArray35[local677] = (short) local9.method718();
				this.aShortArray27[local677] = (short) local9.method718();
				this.aShortArray29[local677] = (short) local9.method718();
				this.aShortArray34[local677] = (short) local14.method718();
				this.aShortArray30[local677] = (short) local14.method718();
				this.aShortArray32[local677] = (short) local14.method718();
				this.aShortArray31[local677] = (short) local19.method718();
				this.aByteArray40[local677] = local24.method731();
				this.aShortArray33[local677] = (short) local29.method718();
			}
		}
		local4.anInt1099 = local113;
		local780 = local4.method719();
		if (local780 == 0) {
			return;
		}
		new Class53();
		local4.method718();
		local4.method718();
		local4.method718();
		local4.method725();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "([[IIIIZI)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method1520(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1527();
		@Pc(6) int local6 = arg1 + this.anInt2314;
		@Pc(11) int local11 = arg1 + this.anInt2312;
		@Pc(16) int local16 = arg3 + this.anInt2308;
		@Pc(21) int local21 = arg3 + this.anInt2310;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class4_Sub1_Sub3_Sub4 local101 = new Class4_Sub1_Sub3_Sub4();
		local101.anInt2306 = this.anInt2306;
		local101.anInt2311 = this.anInt2311;
		local101.anInt2309 = this.anInt2309;
		local101.anIntArray261 = this.anIntArray261;
		local101.anIntArray258 = this.anIntArray258;
		local101.anIntArray259 = this.anIntArray259;
		local101.anIntArray269 = this.anIntArray269;
		local101.anIntArray266 = this.anIntArray266;
		local101.aByteArray37 = this.aByteArray37;
		local101.aByteArray38 = this.aByteArray38;
		local101.aByteArray36 = this.aByteArray36;
		local101.aByteArray35 = this.aByteArray35;
		local101.aShortArray25 = this.aShortArray25;
		local101.aShortArray26 = this.aShortArray26;
		local101.aByte6 = this.aByte6;
		local101.aByteArray39 = this.aByteArray39;
		local101.aShortArray35 = this.aShortArray35;
		local101.aShortArray27 = this.aShortArray27;
		local101.aShortArray29 = this.aShortArray29;
		local101.aShortArray34 = this.aShortArray34;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray32 = this.aShortArray32;
		local101.aShortArray31 = this.aShortArray31;
		local101.aByteArray40 = this.aByteArray40;
		local101.aShortArray33 = this.aShortArray33;
		local101.aShortArray28 = this.aShortArray28;
		local101.anIntArray263 = this.anIntArray263;
		local101.anIntArray268 = this.anIntArray268;
		local101.anIntArrayArray25 = this.anIntArrayArray25;
		local101.anIntArrayArray26 = this.anIntArrayArray26;
		local101.aShort1 = this.aShort1;
		local101.aShort2 = this.aShort2;
		local101.anIntArray264 = new int[local101.anInt2306];
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(294) int local294;
		@Pc(320) int local320;
		@Pc(332) int local332;
		if (arg4 == 0) {
			for (local241 = 0; local241 < local101.anInt2306; local241++) {
				local249 = this.anIntArray261[local241] + arg1;
				local256 = this.anIntArray258[local241] + arg3;
				local260 = local249 & 0x7F;
				local264 = local256 & 0x7F;
				local268 = local249 >> 7;
				local272 = local256 >> 7;
				local294 = arg0[local268][local272] * (128 - local260) + arg0[local268 + 1][local272] * local260 >> 7;
				local320 = arg0[local268][local272 + 1] * (128 - local260) + arg0[local268 + 1][local272 + 1] * local260 >> 7;
				local332 = local294 * (128 - local264) + local320 * local264 >> 7;
				local101.anIntArray264[local241] = this.anIntArray264[local241] + local332 - arg2;
			}
		} else {
			for (local241 = 0; local241 < local101.anInt2306; local241++) {
				local249 = (-this.anIntArray264[local241] << 16) / super.anInt2808;
				if (local249 < arg4) {
					local256 = this.anIntArray261[local241] + arg1;
					local260 = this.anIntArray258[local241] + arg3;
					local264 = local256 & 0x7F;
					local268 = local260 & 0x7F;
					local272 = local256 >> 7;
					local294 = local260 >> 7;
					local320 = arg0[local272][local294] * (128 - local264) + arg0[local272 + 1][local294] * local264 >> 7;
					local332 = arg0[local272][local294 + 1] * (128 - local264) + arg0[local272 + 1][local294 + 1] * local264 >> 7;
					@Pc(457) int local457 = local320 * (128 - local268) + local332 * local268 >> 7;
					local101.anIntArray264[local241] = this.anIntArray264[local241] + (local457 - arg2) * (arg4 - local249) / arg4;
				}
			}
		}
		local101.method1538();
		return local101;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()V")
	public void method1521() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2306; local1++) {
			@Pc(7) int local7 = this.anIntArray261[local1];
			this.anIntArray261[local1] = this.anIntArray258[local1];
			this.anIntArray258[local1] = -local7;
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "()V")
	public void method1522() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2306; local1++) {
			@Pc(7) int local7 = this.anIntArray258[local1];
			this.anIntArray258[local1] = this.anIntArray261[local1];
			this.anIntArray261[local1] = -local7;
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "()V")
	public void method1523() {
		if (this.aClass37Array1 != null) {
			return;
		}
		this.aClass37Array1 = new Class37[this.anInt2306];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2306; local10++) {
			this.aClass37Array1[local10] = new Class37();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2311; local25++) {
			@Pc(31) int local31 = this.anIntArray259[local25];
			@Pc(36) int local36 = this.anIntArray269[local25];
			@Pc(41) int local41 = this.anIntArray266[local25];
			@Pc(51) int local51 = this.anIntArray261[local36] - this.anIntArray261[local31];
			@Pc(61) int local61 = this.anIntArray264[local36] - this.anIntArray264[local31];
			@Pc(71) int local71 = this.anIntArray258[local36] - this.anIntArray258[local31];
			@Pc(81) int local81 = this.anIntArray261[local41] - this.anIntArray261[local31];
			@Pc(91) int local91 = this.anIntArray264[local41] - this.anIntArray264[local31];
			@Pc(101) int local101 = this.anIntArray258[local41] - this.anIntArray258[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray37 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray37[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class37 local211 = this.aClass37Array1[local31];
				local211.anInt1761 += local109;
				local211.anInt1759 += local117;
				local211.anInt1755 += local125;
				local211.anInt1756++;
				@Pc(240) Class37 local240 = this.aClass37Array1[local36];
				local240.anInt1761 += local109;
				local240.anInt1759 += local117;
				local240.anInt1755 += local125;
				local240.anInt1756++;
				@Pc(269) Class37 local269 = this.aClass37Array1[local41];
				local269.anInt1761 += local109;
				local269.anInt1759 += local117;
				local269.anInt1755 += local125;
				local269.anInt1756++;
			} else if (local198 == 1) {
				if (this.aClass51Array1 == null) {
					this.aClass51Array1 = new Class51[this.anInt2311];
				}
				@Pc(314) Class51 local314 = this.aClass51Array1[local25] = new Class51();
				local314.anInt1994 = local109;
				local314.anInt2002 = local117;
				local314.anInt1997 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "([B)V")
	private void method1525(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(arg0);
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(arg0);
		@Pc(18) Class4_Sub11 local18 = new Class4_Sub11(arg0);
		@Pc(23) Class4_Sub11 local23 = new Class4_Sub11(arg0);
		@Pc(28) Class4_Sub11 local28 = new Class4_Sub11(arg0);
		local8.anInt1099 = arg0.length - 18;
		@Pc(38) int local38 = local8.method718();
		@Pc(42) int local42 = local8.method718();
		@Pc(46) int local46 = local8.method719();
		@Pc(50) int local50 = local8.method719();
		@Pc(54) int local54 = local8.method719();
		@Pc(58) int local58 = local8.method719();
		@Pc(62) int local62 = local8.method719();
		@Pc(66) int local66 = local8.method719();
		@Pc(70) int local70 = local8.method718();
		@Pc(74) int local74 = local8.method718();
		@Pc(78) int local78 = local8.method718();
		@Pc(82) int local82 = local8.method718();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt2306 = local38;
		this.anInt2311 = local42;
		this.anInt2309 = local46;
		this.anIntArray261 = new int[local38];
		this.anIntArray264 = new int[local38];
		this.anIntArray258 = new int[local38];
		this.anIntArray259 = new int[local42];
		this.anIntArray269 = new int[local42];
		this.anIntArray266 = new int[local42];
		if (local46 > 0) {
			this.aByteArray39 = new byte[local46];
			this.aShortArray35 = new short[local46];
			this.aShortArray27 = new short[local46];
			this.aShortArray29 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray263 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray37 = new byte[local42];
			this.aByteArray35 = new byte[local42];
			this.aShortArray26 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray38 = new byte[local42];
		} else {
			this.aByte6 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray36 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray268 = new int[local42];
		}
		this.aShortArray25 = new short[local42];
		local8.anInt1099 = 0;
		local13.anInt1099 = local165;
		local18.anInt1099 = local171;
		local23.anInt1099 = local90;
		local28.anInt1099 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method719();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method703();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method703();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method703();
			}
			this.anIntArray261[local307] = local301 + local314;
			this.anIntArray264[local307] = local303 + local324;
			this.anIntArray258[local307] = local305 + local334;
			local301 = this.anIntArray261[local307];
			local303 = this.anIntArray264[local307];
			local305 = this.anIntArray258[local307];
			if (local66 == 1) {
				this.anIntArray263[local307] = local28.method719();
			}
		}
		local8.anInt1099 = local149;
		local13.anInt1099 = local116;
		local18.anInt1099 = local98;
		local23.anInt1099 = local134;
		local28.anInt1099 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray25[local312] = (short) local8.method718();
			if (local50 == 1) {
				local314 = local13.method719();
				if ((local314 & 0x1) == 1) {
					this.aByteArray37[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray37[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray35[local312] = (byte) (local314 >> 2);
					this.aShortArray26[local312] = this.aShortArray25[local312];
					this.aShortArray25[local312] = 127;
					if (this.aShortArray26[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray35[local312] = -1;
					this.aShortArray26[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray38[local312] = local18.method731();
			}
			if (local58 == 1) {
				this.aByteArray36[local312] = local23.method731();
			}
			if (local62 == 1) {
				this.anIntArray268[local312] = local28.method719();
			}
		}
		local8.anInt1099 = local143;
		local13.anInt1099 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method719();
			if (local543 == 1) {
				local314 = local8.method703() + local536;
				local324 = local8.method703() + local314;
				local334 = local8.method703() + local324;
				local536 = local334;
				this.anIntArray259[local538] = local314;
				this.anIntArray269[local538] = local324;
				this.anIntArray266[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method703() + local536;
				local536 = local334;
				this.anIntArray259[local538] = local314;
				this.anIntArray269[local538] = local324;
				this.anIntArray266[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method703() + local536;
				local536 = local334;
				this.anIntArray259[local538] = local314;
				this.anIntArray269[local538] = local324;
				this.anIntArray266[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method703() + local536;
				local536 = local334;
				this.anIntArray259[local538] = local314;
				this.anIntArray269[local538] = local646;
				this.anIntArray266[local538] = local334;
			}
		}
		local8.anInt1099 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray39[local543] = 0;
			this.aShortArray35[local543] = (short) local8.method718();
			this.aShortArray27[local543] = (short) local8.method718();
			this.aShortArray29[local543] = (short) local8.method718();
		}
		if (this.aByteArray35 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray35[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray35[local731] & 0xFFFF) == this.anIntArray259[local723] && (this.aShortArray27[local731] & 0xFFFF) == this.anIntArray269[local723] && (this.aShortArray29[local731] & 0xFFFF) == this.anIntArray266[local723]) {
						this.aByteArray35[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray35 = null;
			}
		}
		if (!local3) {
			this.aShortArray26 = null;
		}
		if (!local1) {
			this.aByteArray37 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "()V")
	public void method1526() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2306; local1++) {
			this.anIntArray261[local1] = -this.anIntArray261[local1];
			this.anIntArray258[local1] = -this.anIntArray258[local1];
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "()V")
	public void method1527() {
		if (this.aBoolean206) {
			return;
		}
		super.anInt2808 = 0;
		this.anInt2313 = 0;
		this.anInt2314 = 999999;
		this.anInt2312 = -999999;
		this.anInt2310 = -99999;
		this.anInt2308 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt2306; local23++) {
			@Pc(29) int local29 = this.anIntArray261[local23];
			@Pc(34) int local34 = this.anIntArray264[local23];
			@Pc(39) int local39 = this.anIntArray258[local23];
			if (local29 < this.anInt2314) {
				this.anInt2314 = local29;
			}
			if (local29 > this.anInt2312) {
				this.anInt2312 = local29;
			}
			if (local39 < this.anInt2308) {
				this.anInt2308 = local39;
			}
			if (local39 > this.anInt2310) {
				this.anInt2310 = local39;
			}
			if (-local34 > super.anInt2808) {
				super.anInt2808 = -local34;
			}
			if (local34 > this.anInt2313) {
				this.anInt2313 = local34;
			}
		}
		this.aBoolean206 = true;
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "()V")
	public void method1528() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2306; local1++) {
			this.anIntArray258[local1] = -this.anIntArray258[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2311; local18++) {
			@Pc(24) int local24 = this.anIntArray259[local18];
			this.anIntArray259[local18] = this.anIntArray266[local18];
			this.anIntArray266[local18] = local24;
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!p;I)I")
	private int method1529(@OriginalArg(0) Class4_Sub1_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray261[arg1];
		@Pc(11) int local11 = arg0.anIntArray264[arg1];
		@Pc(16) int local16 = arg0.anIntArray258[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2306; local18++) {
			if (local6 == this.anIntArray261[local18] && local11 == this.anIntArray264[local18] && local16 == this.anIntArray258[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray261[this.anInt2306] = local6;
			this.anIntArray264[this.anInt2306] = local11;
			this.anIntArray258[this.anInt2306] = local16;
			if (arg0.anIntArray263 != null) {
				this.anIntArray263[this.anInt2306] = arg0.anIntArray263[arg1];
			}
			local1 = this.anInt2306++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method1523();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class4_Sub1_Sub3_Sub3 local26 = new Class4_Sub1_Sub3_Sub3();
		local26.anIntArray235 = new int[this.anInt2311];
		local26.anIntArray229 = new int[this.anInt2311];
		local26.anIntArray227 = new int[this.anInt2311];
		@Pc(184) int local184;
		if (this.anInt2309 > 0 && this.aByteArray35 != null) {
			@Pc(51) int[] local51 = new int[this.anInt2309];
			for (@Pc(53) int local53 = 0; local53 < this.anInt2311; local53++) {
				if (this.aByteArray35[local53] != -1) {
					local51[this.aByteArray35[local53] & 0xFF]++;
				}
			}
			local26.anInt2234 = 0;
			for (@Pc(82) int local82 = 0; local82 < this.anInt2309; local82++) {
				if (local51[local82] > 0 && this.aByteArray39[local82] == 0) {
					local26.anInt2234++;
				}
			}
			local26.anIntArray237 = new int[local26.anInt2234];
			local26.anIntArray232 = new int[local26.anInt2234];
			local26.anIntArray228 = new int[local26.anInt2234];
			@Pc(120) int local120 = 0;
			for (@Pc(122) int local122 = 0; local122 < this.anInt2309; local122++) {
				if (local51[local122] > 0 && this.aByteArray39[local122] == 0) {
					local26.anIntArray237[local120] = this.aShortArray35[local122] & 0xFFFF;
					local26.anIntArray232[local120] = this.aShortArray27[local122] & 0xFFFF;
					local26.anIntArray228[local120] = this.aShortArray29[local122] & 0xFFFF;
					local51[local122] = local120++;
				} else {
					local51[local122] = -1;
				}
			}
			local26.aByteArray31 = new byte[this.anInt2311];
			for (local184 = 0; local184 < this.anInt2311; local184++) {
				if (this.aByteArray35[local184] == -1) {
					local26.aByteArray31[local184] = -1;
				} else {
					local26.aByteArray31[local184] = (byte) local51[this.aByteArray35[local184] & 0xFF];
				}
			}
		}
		for (@Pc(217) int local217 = 0; local217 < this.anInt2311; local217++) {
			@Pc(223) byte local223;
			if (this.aByteArray37 == null) {
				local223 = 0;
			} else {
				local223 = this.aByteArray37[local217];
			}
			@Pc(234) byte local234;
			if (this.aByteArray36 == null) {
				local234 = 0;
			} else {
				local234 = this.aByteArray36[local217];
			}
			@Pc(245) short local245;
			if (this.aShortArray26 == null) {
				local245 = -1;
			} else {
				local245 = this.aShortArray26[local217];
			}
			if (local234 == -2) {
				local223 = 3;
			}
			if (local234 == -1) {
				local223 = 2;
			}
			@Pc(292) Class37 local292;
			@Pc(453) Class51 local453;
			if (local245 == -1) {
				if (local223 == 0) {
					@Pc(273) int local273 = this.aShortArray25[local217] & 0xFFFF;
					if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray259[local217]] == null) {
						local292 = this.aClass37Array1[this.anIntArray259[local217]];
					} else {
						local292 = this.aClass37Array2[this.anIntArray259[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1761 + arg3 * local292.anInt1759 + arg4 * local292.anInt1755) / (local22 * local292.anInt1756);
					local26.anIntArray235[local217] = Static86.method1530(local273, local184);
					if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray269[local217]] == null) {
						local292 = this.aClass37Array1[this.anIntArray269[local217]];
					} else {
						local292 = this.aClass37Array2[this.anIntArray269[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1761 + arg3 * local292.anInt1759 + arg4 * local292.anInt1755) / (local22 * local292.anInt1756);
					local26.anIntArray229[local217] = Static86.method1530(local273, local184);
					if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray266[local217]] == null) {
						local292 = this.aClass37Array1[this.anIntArray266[local217]];
					} else {
						local292 = this.aClass37Array2[this.anIntArray266[local217]];
					}
					local184 = arg0 + (arg2 * local292.anInt1761 + arg3 * local292.anInt1759 + arg4 * local292.anInt1755) / (local22 * local292.anInt1756);
					local26.anIntArray227[local217] = Static86.method1530(local273, local184);
				} else if (local223 == 1) {
					local453 = this.aClass51Array1[local217];
					local184 = arg0 + (arg2 * local453.anInt1994 + arg3 * local453.anInt2002 + arg4 * local453.anInt1997) / (local22 + local22 / 2);
					local26.anIntArray235[local217] = Static86.method1530(this.aShortArray25[local217] & 0xFFFF, local184);
					local26.anIntArray227[local217] = -1;
				} else if (local223 == 3) {
					local26.anIntArray235[local217] = 128;
					local26.anIntArray227[local217] = -1;
				} else {
					local26.anIntArray227[local217] = -2;
				}
			} else if (local223 == 0) {
				if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray259[local217]] == null) {
					local292 = this.aClass37Array1[this.anIntArray259[local217]];
				} else {
					local292 = this.aClass37Array2[this.anIntArray259[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1761 + arg3 * local292.anInt1759 + arg4 * local292.anInt1755) / (local22 * local292.anInt1756);
				local26.anIntArray235[local217] = Static86.method1533(local184);
				if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray269[local217]] == null) {
					local292 = this.aClass37Array1[this.anIntArray269[local217]];
				} else {
					local292 = this.aClass37Array2[this.anIntArray269[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1761 + arg3 * local292.anInt1759 + arg4 * local292.anInt1755) / (local22 * local292.anInt1756);
				local26.anIntArray229[local217] = Static86.method1533(local184);
				if (this.aClass37Array2 == null || this.aClass37Array2[this.anIntArray266[local217]] == null) {
					local292 = this.aClass37Array1[this.anIntArray266[local217]];
				} else {
					local292 = this.aClass37Array2[this.anIntArray266[local217]];
				}
				local184 = arg0 + (arg2 * local292.anInt1761 + arg3 * local292.anInt1759 + arg4 * local292.anInt1755) / (local22 * local292.anInt1756);
				local26.anIntArray227[local217] = Static86.method1533(local184);
			} else if (local223 == 1) {
				local453 = this.aClass51Array1[local217];
				local184 = arg0 + (arg2 * local453.anInt1994 + arg3 * local453.anInt2002 + arg4 * local453.anInt1997) / (local22 + local22 / 2);
				local26.anIntArray235[local217] = Static86.method1533(local184);
				local26.anIntArray227[local217] = -1;
			} else {
				local26.anIntArray227[local217] = -2;
			}
		}
		this.method1536();
		local26.anInt2238 = this.anInt2306;
		local26.anIntArray233 = this.anIntArray261;
		local26.anIntArray226 = this.anIntArray264;
		local26.anIntArray230 = this.anIntArray258;
		local26.anInt2239 = this.anInt2311;
		local26.anIntArray234 = this.anIntArray259;
		local26.anIntArray231 = this.anIntArray269;
		local26.anIntArray236 = this.anIntArray266;
		local26.aByteArray33 = this.aByteArray38;
		local26.aByteArray30 = this.aByteArray36;
		local26.aByte4 = this.aByte6;
		local26.anIntArrayArray22 = this.anIntArrayArray25;
		local26.anIntArrayArray21 = this.anIntArrayArray26;
		local26.aShortArray24 = this.aShortArray26;
		return local26;
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
	public void method1535() {
		@Pc(3) int local3 = Static86.anIntArray262[256];
		@Pc(7) int local7 = Static86.anIntArray260[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2306; local9++) {
			@Pc(26) int local26 = this.anIntArray258[local9] * local3 + this.anIntArray261[local9] * local7 >> 16;
			this.anIntArray258[local9] = this.anIntArray258[local9] * local7 - this.anIntArray261[local9] * local3 >> 16;
			this.anIntArray261[local9] = local26;
		}
		this.method1538();
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "()V")
	private void method1536() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray263 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2306; local9++) {
				local15 = this.anIntArray263[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray25 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray25[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2306) {
				local65 = this.anIntArray263[local59];
				this.anIntArrayArray25[local65][local5[local65]++] = local59++;
			}
			this.anIntArray263 = null;
		}
		if (this.anIntArray268 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2311; local9++) {
			local15 = this.anIntArray268[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray26 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray26[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2311) {
			local65 = this.anIntArray268[local59];
			this.anIntArrayArray26[local65][local5[local65]++] = local59++;
		}
		this.anIntArray268 = null;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(SS)V")
	public void method1537(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray26 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2311; local5++) {
			if (this.aShortArray26[local5] == arg0) {
				this.aShortArray26[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "()V")
	private void method1538() {
		this.aClass37Array1 = null;
		this.aClass37Array2 = null;
		this.aClass51Array1 = null;
		this.aBoolean206 = false;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(III)V")
	public void method1539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2306; local1++) {
			this.anIntArray261[local1] = this.anIntArray261[local1] * arg0 / 128;
			this.anIntArray264[local1] = this.anIntArray264[local1] * arg1 / 128;
			this.anIntArray258[local1] = this.anIntArray258[local1] * arg2 / 128;
		}
		this.method1538();
	}
}
