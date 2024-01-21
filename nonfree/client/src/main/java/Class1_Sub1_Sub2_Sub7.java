import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class1_Sub1_Sub2_Sub7 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ue", name = "rb", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ue", name = "sb", descriptor = "I")
	private int anInt2679;

	@OriginalMember(owner = "client!ue", name = "tb", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!ue", name = "ub", descriptor = "[S")
	public short[] aShortArray11;

	@OriginalMember(owner = "client!ue", name = "vb", descriptor = "[I")
	public int[] anIntArray391;

	@OriginalMember(owner = "client!ue", name = "zb", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!ue", name = "Ab", descriptor = "[B")
	public byte[] aByteArray28;

	@OriginalMember(owner = "client!ue", name = "Bb", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!ue", name = "Cb", descriptor = "I")
	private int anInt2683;

	@OriginalMember(owner = "client!ue", name = "Eb", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!ue", name = "Gb", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!ue", name = "Hb", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!ue", name = "Ib", descriptor = "I")
	private int anInt2684;

	@OriginalMember(owner = "client!ue", name = "Jb", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!ue", name = "Lb", descriptor = "[I")
	public int[] anIntArray397;

	@OriginalMember(owner = "client!ue", name = "Mb", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!ue", name = "Ob", descriptor = "[I")
	public int[] anIntArray399;

	@OriginalMember(owner = "client!ue", name = "Pb", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!ue", name = "Rb", descriptor = "[I")
	public int[] anIntArray400;

	@OriginalMember(owner = "client!ue", name = "Sb", descriptor = "I")
	private int anInt2686;

	@OriginalMember(owner = "client!ue", name = "dc", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!ue", name = "kc", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!ue", name = "wc", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ue", name = "xb", descriptor = "B")
	public byte aByte5 = 0;

	@OriginalMember(owner = "client!ue", name = "Db", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ue", name = "yb", descriptor = "I")
	public int anInt2681 = 0;

	@OriginalMember(owner = "client!ue", name = "wb", descriptor = "I")
	public int anInt2680 = 0;

	@OriginalMember(owner = "client!ue", name = "Kb", descriptor = "I")
	public int anInt2685 = 0;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2_Sub7() {
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([Lclient!ue;I)V")
	public Class1_Sub1_Sub2_Sub7(@OriginalArg(0) Class1_Sub1_Sub2_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt2685 = 0;
		this.anInt2681 = 0;
		this.anInt2680 = 0;
		this.aByte5 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class1_Sub1_Sub2_Sub7 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt2685 += local41.anInt2685;
				this.anInt2681 += local41.anInt2681;
				this.anInt2680 += local41.anInt2680;
				if (local41.aByteArray28 == null) {
					if (this.aByte5 == -1) {
						this.aByte5 = local41.aByte5;
					}
					if (this.aByte5 != local41.aByte5) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray30 != null;
				local22 |= local41.aByteArray31 != null;
			}
		}
		this.anIntArray399 = new int[this.anInt2685];
		this.anIntArray392 = new int[this.anInt2685];
		this.anIntArray397 = new int[this.anInt2685];
		this.anIntArray396 = new int[this.anInt2681];
		this.anIntArray390 = new int[this.anInt2681];
		this.anIntArray391 = new int[this.anInt2681];
		this.anIntArray394 = new int[this.anInt2681];
		this.anIntArray400 = new int[this.anInt2681];
		this.anIntArray393 = new int[this.anInt2681];
		if (this.anInt2680 > 0) {
			this.anIntArray398 = new int[this.anInt2680];
			this.anIntArray395 = new int[this.anInt2680];
			this.anIntArray411 = new int[this.anInt2680];
		}
		if (local18) {
			this.aByteArray28 = new byte[this.anInt2681];
		}
		if (local20) {
			this.aByteArray30 = new byte[this.anInt2681];
		}
		if (local22) {
			this.aByteArray31 = new byte[this.anInt2681];
			this.aShortArray11 = new short[this.anInt2681];
		}
		this.anInt2685 = 0;
		this.anInt2681 = 0;
		this.anInt2680 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class1_Sub1_Sub2_Sub7 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt2685;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt2685; local221++) {
					this.anIntArray399[this.anInt2685] = local214.anIntArray399[local221];
					this.anIntArray392[this.anInt2685] = local214.anIntArray392[local221];
					this.anIntArray397[this.anInt2685] = local214.anIntArray397[local221];
					this.anInt2685++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt2681; local262++) {
					this.anIntArray396[this.anInt2681] = local214.anIntArray396[local262] + local219;
					this.anIntArray390[this.anInt2681] = local214.anIntArray390[local262] + local219;
					this.anIntArray391[this.anInt2681] = local214.anIntArray391[local262] + local219;
					this.anIntArray394[this.anInt2681] = local214.anIntArray394[local262];
					this.anIntArray400[this.anInt2681] = local214.anIntArray400[local262];
					this.anIntArray393[this.anInt2681] = local214.anIntArray393[local262];
					if (local18) {
						if (local214.aByteArray28 == null) {
							this.aByteArray28[this.anInt2681] = local214.aByte5;
						} else {
							this.aByteArray28[this.anInt2681] = local214.aByteArray28[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray30 == null) {
							this.aByteArray30[this.anInt2681] = 0;
						} else {
							this.aByteArray30[this.anInt2681] = local214.aByteArray30[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray31 == null || local214.aByteArray31[local262] == -1) {
							this.aByteArray31[this.anInt2681] = -1;
						} else {
							this.aByteArray31[this.anInt2681] = (byte) (local214.aByteArray31[local262] + local207);
							this.aShortArray11[this.anInt2681] = local214.aShortArray11[local262];
						}
					}
					this.anInt2681++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt2680; local418++) {
					this.anIntArray398[this.anInt2680] = local214.anIntArray398[local418] + local219;
					this.anIntArray395[this.anInt2680] = local214.anIntArray395[local418] + local219;
					this.anIntArray411[this.anInt2680] = local214.anIntArray411[local418] + local219;
					this.anInt2680++;
				}
				local207 += local214.anInt2680;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	private void method1912(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static112.anInt2715;
		@Pc(3) int local3 = Static112.anInt2722;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray396[arg0];
		@Pc(15) int local15 = this.anIntArray390[arg0];
		@Pc(20) int local20 = this.anIntArray391[arg0];
		@Pc(24) int local24 = Static111.anIntArray403[local10];
		@Pc(28) int local28 = Static111.anIntArray403[local15];
		@Pc(32) int local32 = Static111.anIntArray403[local20];
		if (this.aByteArray30 == null) {
			Static112.anInt2716 = 0;
		} else {
			Static112.anInt2716 = this.aByteArray30[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static111.anIntArray401[0] = Static111.anIntArray419[local10];
			Static111.anIntArray408[0] = Static111.anIntArray417[local10];
			local5++;
			Static111.anIntArray416[0] = this.anIntArray394[arg0];
		} else {
			local73 = Static111.anIntArray402[local10];
			local77 = Static111.anIntArray413[local10];
			local82 = this.anIntArray394[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static111.anIntArray412[local32 - local24];
				Static111.anIntArray401[0] = local1 + (local73 + ((Static111.anIntArray402[local20] - local73) * local95 >> 16) << 9) / 50;
				Static111.anIntArray408[0] = local3 + (local77 + ((Static111.anIntArray413[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static111.anIntArray416[0] = local82 + ((this.anIntArray393[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static111.anIntArray412[local28 - local24];
				Static111.anIntArray401[local5] = local1 + (local73 + ((Static111.anIntArray402[local15] - local73) * local95 >> 16) << 9) / 50;
				Static111.anIntArray408[local5] = local3 + (local77 + ((Static111.anIntArray413[local15] - local77) * local95 >> 16) << 9) / 50;
				Static111.anIntArray416[local5++] = local82 + ((this.anIntArray400[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static111.anIntArray401[local5] = Static111.anIntArray419[local15];
			Static111.anIntArray408[local5] = Static111.anIntArray417[local15];
			Static111.anIntArray416[local5++] = this.anIntArray400[arg0];
		} else {
			local73 = Static111.anIntArray402[local15];
			local77 = Static111.anIntArray413[local15];
			local82 = this.anIntArray400[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static111.anIntArray412[local24 - local28];
				Static111.anIntArray401[local5] = local1 + (local73 + ((Static111.anIntArray402[local10] - local73) * local95 >> 16) << 9) / 50;
				Static111.anIntArray408[local5] = local3 + (local77 + ((Static111.anIntArray413[local10] - local77) * local95 >> 16) << 9) / 50;
				Static111.anIntArray416[local5++] = local82 + ((this.anIntArray394[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static111.anIntArray412[local32 - local28];
				Static111.anIntArray401[local5] = local1 + (local73 + ((Static111.anIntArray402[local20] - local73) * local95 >> 16) << 9) / 50;
				Static111.anIntArray408[local5] = local3 + (local77 + ((Static111.anIntArray413[local20] - local77) * local95 >> 16) << 9) / 50;
				Static111.anIntArray416[local5++] = local82 + ((this.anIntArray393[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static111.anIntArray401[local5] = Static111.anIntArray419[local20];
			Static111.anIntArray408[local5] = Static111.anIntArray417[local20];
			Static111.anIntArray416[local5++] = this.anIntArray393[arg0];
		} else {
			local73 = Static111.anIntArray402[local20];
			local77 = Static111.anIntArray413[local20];
			local82 = this.anIntArray393[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static111.anIntArray412[local28 - local32];
				Static111.anIntArray401[local5] = local1 + (local73 + ((Static111.anIntArray402[local15] - local73) * local95 >> 16) << 9) / 50;
				Static111.anIntArray408[local5] = local3 + (local77 + ((Static111.anIntArray413[local15] - local77) * local95 >> 16) << 9) / 50;
				Static111.anIntArray416[local5++] = local82 + ((this.anIntArray400[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static111.anIntArray412[local24 - local32];
				Static111.anIntArray401[local5] = local1 + (local73 + ((Static111.anIntArray402[local10] - local73) * local95 >> 16) << 9) / 50;
				Static111.anIntArray408[local5] = local3 + (local77 + ((Static111.anIntArray413[local10] - local77) * local95 >> 16) << 9) / 50;
				Static111.anIntArray416[local5++] = local82 + ((this.anIntArray394[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static111.anIntArray401[0];
		local77 = Static111.anIntArray401[1];
		local82 = Static111.anIntArray401[2];
		local95 = Static111.anIntArray408[0];
		@Pc(590) int local590 = Static111.anIntArray408[1];
		@Pc(594) int local594 = Static111.anIntArray408[2];
		Static112.aBoolean160 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static112.anInt2721 || local77 > Static112.anInt2721 || local82 > Static112.anInt2721) {
				Static112.aBoolean160 = true;
			}
			if (this.aByteArray31 != null && this.aByteArray31[arg0] != -1) {
				local669 = this.aByteArray31[arg0] & 0xFF;
				local674 = this.anIntArray398[local669];
				local679 = this.anIntArray395[local669];
				local684 = this.anIntArray411[local669];
				if (this.anIntArray393[arg0] == -1) {
					Static112.method1964(local95, local590, local594, local73, local77, local82, this.anIntArray394[arg0], this.anIntArray394[arg0], this.anIntArray394[arg0], Static111.anIntArray402[local674], Static111.anIntArray402[local679], Static111.anIntArray402[local684], Static111.anIntArray413[local674], Static111.anIntArray413[local679], Static111.anIntArray413[local684], Static111.anIntArray403[local674], Static111.anIntArray403[local679], Static111.anIntArray403[local684], this.aShortArray11[arg0]);
				} else {
					Static112.method1964(local95, local590, local594, local73, local77, local82, Static111.anIntArray416[0], Static111.anIntArray416[1], Static111.anIntArray416[2], Static111.anIntArray402[local674], Static111.anIntArray402[local679], Static111.anIntArray402[local684], Static111.anIntArray413[local674], Static111.anIntArray413[local679], Static111.anIntArray413[local684], Static111.anIntArray403[local674], Static111.anIntArray403[local679], Static111.anIntArray403[local684], this.aShortArray11[arg0]);
				}
			} else if (this.anIntArray393[arg0] == -1) {
				Static112.method1975(local95, local590, local594, local73, local77, local82, Static111.anIntArray414[this.anIntArray394[arg0]]);
			} else {
				Static112.method1978(local95, local590, local594, local73, local77, local82, Static111.anIntArray416[0], Static111.anIntArray416[1], Static111.anIntArray416[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static112.anInt2721 || local77 > Static112.anInt2721 || local82 > Static112.anInt2721 || Static111.anIntArray401[3] < 0 || Static111.anIntArray401[3] > Static112.anInt2721) {
			Static112.aBoolean160 = true;
		}
		if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
			if (this.anIntArray393[arg0] == -1) {
				local669 = Static111.anIntArray414[this.anIntArray394[arg0]];
				Static112.method1975(local95, local590, local594, local73, local77, local82, local669);
				Static112.method1975(local95, local594, Static111.anIntArray408[3], local73, local82, Static111.anIntArray401[3], local669);
				return;
			}
			Static112.method1978(local95, local590, local594, local73, local77, local82, Static111.anIntArray416[0], Static111.anIntArray416[1], Static111.anIntArray416[2]);
			Static112.method1978(local95, local594, Static111.anIntArray408[3], local73, local82, Static111.anIntArray401[3], Static111.anIntArray416[0], Static111.anIntArray416[2], Static111.anIntArray416[3]);
			return;
		}
		local669 = this.aByteArray31[arg0] & 0xFF;
		local674 = this.anIntArray398[local669];
		local679 = this.anIntArray395[local669];
		local684 = this.anIntArray411[local669];
		@Pc(924) short local924 = this.aShortArray11[arg0];
		if (this.anIntArray393[arg0] == -1) {
			Static112.method1964(local95, local590, local594, local73, local77, local82, this.anIntArray394[arg0], this.anIntArray394[arg0], this.anIntArray394[arg0], Static111.anIntArray402[local674], Static111.anIntArray402[local679], Static111.anIntArray402[local684], Static111.anIntArray413[local674], Static111.anIntArray413[local679], Static111.anIntArray413[local684], Static111.anIntArray403[local674], Static111.anIntArray403[local679], Static111.anIntArray403[local684], local924);
			Static112.method1964(local95, local594, Static111.anIntArray408[3], local73, local82, Static111.anIntArray401[3], this.anIntArray394[arg0], this.anIntArray394[arg0], this.anIntArray394[arg0], Static111.anIntArray402[local674], Static111.anIntArray402[local679], Static111.anIntArray402[local684], Static111.anIntArray413[local674], Static111.anIntArray413[local679], Static111.anIntArray413[local684], Static111.anIntArray403[local674], Static111.anIntArray403[local679], Static111.anIntArray403[local684], local924);
			return;
		}
		Static112.method1964(local95, local590, local594, local73, local77, local82, Static111.anIntArray416[0], Static111.anIntArray416[1], Static111.anIntArray416[2], Static111.anIntArray402[local674], Static111.anIntArray402[local679], Static111.anIntArray402[local684], Static111.anIntArray413[local674], Static111.anIntArray413[local679], Static111.anIntArray413[local684], Static111.anIntArray403[local674], Static111.anIntArray403[local679], Static111.anIntArray403[local684], local924);
		Static112.method1964(local95, local594, Static111.anIntArray408[3], local73, local82, Static111.anIntArray401[3], Static111.anIntArray416[0], Static111.anIntArray416[2], Static111.anIntArray416[3], Static111.anIntArray402[local674], Static111.anIntArray402[local679], Static111.anIntArray402[local684], Static111.anIntArray413[local674], Static111.anIntArray413[local679], Static111.anIntArray413[local684], Static111.anIntArray403[local674], Static111.anIntArray403[local679], Static111.anIntArray403[local684], local924);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
	public void method1913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2685; local1++) {
			this.anIntArray399[local1] = this.anIntArray399[local1] * arg0 / 128;
			this.anIntArray392[local1] = this.anIntArray392[local1] * arg1 / 128;
			this.anIntArray397[local1] = this.anIntArray397[local1] * arg2 / 128;
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	public void method1914() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2685; local1++) {
			this.anIntArray399[local1] = -this.anIntArray399[local1];
			this.anIntArray397[local1] = -this.anIntArray397[local1];
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
	public void method1915() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2685; local1++) {
			@Pc(7) int local7 = this.anIntArray399[local1];
			this.anIntArray399[local1] = this.anIntArray397[local1];
			this.anIntArray397[local1] = -local7;
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
	public void method1916(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static111.anIntArray418[arg0];
		@Pc(7) int local7 = Static111.anIntArray415[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2685; local9++) {
			@Pc(26) int local26 = this.anIntArray392[local9] * local7 - this.anIntArray397[local9] * local3 >> 16;
			this.anIntArray397[local9] = this.anIntArray392[local9] * local3 + this.anIntArray397[local9] * local7 >> 16;
			this.anIntArray392[local9] = local26;
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
	private void method1917(@OriginalArg(0) int arg0) {
		if (Static111.aBooleanArray13[arg0]) {
			this.method1912(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray396[arg0];
		@Pc(17) int local17 = this.anIntArray390[arg0];
		@Pc(22) int local22 = this.anIntArray391[arg0];
		Static112.aBoolean160 = Static111.aBooleanArray12[arg0];
		if (this.aByteArray30 == null) {
			Static112.anInt2716 = 0;
		} else {
			Static112.anInt2716 = this.aByteArray30[arg0] & 0xFF;
		}
		if (this.aByteArray31 != null && this.aByteArray31[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray31[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray398[local119];
			@Pc(129) int local129 = this.anIntArray395[local119];
			@Pc(134) int local134 = this.anIntArray411[local119];
			if (this.anIntArray393[arg0] == -1) {
				Static112.method1964(Static111.anIntArray417[local12], Static111.anIntArray417[local17], Static111.anIntArray417[local22], Static111.anIntArray419[local12], Static111.anIntArray419[local17], Static111.anIntArray419[local22], this.anIntArray394[arg0], this.anIntArray394[arg0], this.anIntArray394[arg0], Static111.anIntArray402[local124], Static111.anIntArray402[local129], Static111.anIntArray402[local134], Static111.anIntArray413[local124], Static111.anIntArray413[local129], Static111.anIntArray413[local134], Static111.anIntArray403[local124], Static111.anIntArray403[local129], Static111.anIntArray403[local134], this.aShortArray11[arg0]);
			} else {
				Static112.method1964(Static111.anIntArray417[local12], Static111.anIntArray417[local17], Static111.anIntArray417[local22], Static111.anIntArray419[local12], Static111.anIntArray419[local17], Static111.anIntArray419[local22], this.anIntArray394[arg0], this.anIntArray400[arg0], this.anIntArray393[arg0], Static111.anIntArray402[local124], Static111.anIntArray402[local129], Static111.anIntArray402[local134], Static111.anIntArray413[local124], Static111.anIntArray413[local129], Static111.anIntArray413[local134], Static111.anIntArray403[local124], Static111.anIntArray403[local129], Static111.anIntArray403[local134], this.aShortArray11[arg0]);
			}
		} else if (this.anIntArray393[arg0] == -1) {
			Static112.method1975(Static111.anIntArray417[local12], Static111.anIntArray417[local17], Static111.anIntArray417[local22], Static111.anIntArray419[local12], Static111.anIntArray419[local17], Static111.anIntArray419[local22], Static111.anIntArray414[this.anIntArray394[arg0]]);
		} else {
			Static112.method1978(Static111.anIntArray417[local12], Static111.anIntArray417[local17], Static111.anIntArray417[local22], Static111.anIntArray419[local12], Static111.anIntArray419[local17], Static111.anIntArray419[local22], this.anIntArray394[arg0], this.anIntArray400[arg0], this.anIntArray393[arg0]);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
	private void method1918() {
		if (this.anInt2684 == 2) {
			return;
		}
		this.anInt2684 = 2;
		this.anInt2682 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2685; local12++) {
			@Pc(18) int local18 = this.anIntArray399[local12];
			@Pc(23) int local23 = this.anIntArray392[local12];
			@Pc(28) int local28 = this.anIntArray397[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2682) {
				this.anInt2682 = local40;
			}
		}
		this.anInt2682 = (int) (Math.sqrt((double) this.anInt2682) + 0.99D);
		this.anInt2679 = this.anInt2682;
		this.anInt2683 = this.anInt2682 + this.anInt2682;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
	public void method1919() {
		if (this.anInt2684 == 1) {
			return;
		}
		this.anInt2684 = 1;
		super.anInt2678 = 0;
		this.anInt2686 = 0;
		this.anInt2682 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2685; local18++) {
			@Pc(24) int local24 = this.anIntArray399[local18];
			@Pc(29) int local29 = this.anIntArray392[local18];
			@Pc(34) int local34 = this.anIntArray397[local18];
			if (-local29 > super.anInt2678) {
				super.anInt2678 = -local29;
			}
			if (local29 > this.anInt2686) {
				this.anInt2686 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2682) {
				this.anInt2682 = local58;
			}
		}
		this.anInt2682 = (int) (Math.sqrt((double) this.anInt2682) + 0.99D);
		this.anInt2679 = (int) (Math.sqrt((double) (this.anInt2682 * this.anInt2682 + super.anInt2678 * super.anInt2678)) + 0.99D);
		this.anInt2683 = this.anInt2679 + (int) (Math.sqrt((double) (this.anInt2682 * this.anInt2682 + this.anInt2686 * this.anInt2686)) + 0.99D);
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(Z)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1920(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static111.aByteArray32.length < this.anInt2681) {
			Static111.aByteArray32 = new byte[this.anInt2681 + 100];
		}
		return this.method1927(arg0, Static111.aClass1_Sub1_Sub2_Sub7_3, Static111.aByteArray32);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZI)V")
	private void method1921(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2683 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2683; local6++) {
			Static111.anIntArray420[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2681; local18++) {
			if (this.anIntArray393[local18] != -2) {
				local30 = this.anIntArray396[local18];
				local35 = this.anIntArray390[local18];
				local40 = this.anIntArray391[local18];
				local44 = Static111.anIntArray419[local30];
				local48 = Static111.anIntArray419[local35];
				local52 = Static111.anIntArray419[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static111.anIntArray402[local30];
					local71 = Static111.anIntArray402[local35];
					@Pc(75) int local75 = Static111.anIntArray402[local40];
					@Pc(79) int local79 = Static111.anIntArray413[local30];
					local83 = Static111.anIntArray413[local35];
					local87 = Static111.anIntArray413[local40];
					@Pc(91) int local91 = Static111.anIntArray403[local30];
					local95 = Static111.anIntArray403[local35];
					@Pc(99) int local99 = Static111.anIntArray403[local40];
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
						Static111.aBooleanArray13[local18] = true;
						@Pc(180) int local180 = (Static111.anIntArray407[local30] + Static111.anIntArray407[local35] + Static111.anIntArray407[local40]) / 3 + this.anInt2679;
						Static111.anIntArrayArray36[local180][Static111.anIntArray420[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1922(Static111.anInt2688, Static111.anInt2690, Static111.anIntArray417[local30], Static111.anIntArray417[local35], Static111.anIntArray417[local40], local44, local48, local52)) {
						Static111.anIntArray409[Static111.anInt2691++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static111.anIntArray417[local40] - Static111.anIntArray417[local35]) - (Static111.anIntArray417[local30] - Static111.anIntArray417[local35]) * (local52 - local48) > 0) {
						Static111.aBooleanArray13[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static112.anInt2721 && local48 <= Static112.anInt2721 && local52 <= Static112.anInt2721) {
							Static111.aBooleanArray12[local18] = false;
						} else {
							Static111.aBooleanArray12[local18] = true;
						}
						local67 = (Static111.anIntArray407[local30] + Static111.anIntArray407[local35] + Static111.anIntArray407[local40]) / 3 + this.anInt2679;
						Static111.anIntArrayArray36[local67][Static111.anIntArray420[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray28 == null) {
			for (local30 = this.anInt2683 - 1; local30 >= 0; local30--) {
				local35 = Static111.anIntArray420[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static111.anIntArrayArray36[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1917(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static111.anIntArray410[local30] = 0;
			Static111.anIntArray404[local30] = 0;
		}
		for (local35 = this.anInt2683 - 1; local35 >= 0; local35--) {
			local40 = Static111.anIntArray420[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static111.anIntArrayArray36[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray28[local52];
					local71 = Static111.anIntArray410[local388]++;
					Static111.anIntArrayArray35[local388][local71] = local52;
					if (local388 < 10) {
						Static111.anIntArray404[local388] += local35;
					} else if (local388 == 10) {
						Static111.anIntArray406[local71] = local35;
					} else {
						Static111.anIntArray405[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static111.anIntArray410[1] > 0 || Static111.anIntArray410[2] > 0) {
			local40 = (Static111.anIntArray404[1] + Static111.anIntArray404[2]) / (Static111.anIntArray410[1] + Static111.anIntArray410[2]);
		}
		local44 = 0;
		if (Static111.anIntArray410[3] > 0 || Static111.anIntArray410[4] > 0) {
			local44 = (Static111.anIntArray404[3] + Static111.anIntArray404[4]) / (Static111.anIntArray410[3] + Static111.anIntArray410[4]);
		}
		local48 = 0;
		if (Static111.anIntArray410[6] > 0 || Static111.anIntArray410[8] > 0) {
			local48 = (Static111.anIntArray404[6] + Static111.anIntArray404[8]) / (Static111.anIntArray410[6] + Static111.anIntArray410[8]);
		}
		local67 = 0;
		local71 = Static111.anIntArray410[10];
		@Pc(521) int[] local521 = Static111.anIntArrayArray35[10];
		@Pc(523) int[] local523 = Static111.anIntArray406;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static111.anIntArray410[11];
			local521 = Static111.anIntArrayArray35[11];
			local523 = Static111.anIntArray405;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1917(local521[local67++]);
				if (local67 == local71 && local521 != Static111.anIntArrayArray35[11]) {
					local67 = 0;
					local71 = Static111.anIntArray410[11];
					local521 = Static111.anIntArrayArray35[11];
					local523 = Static111.anIntArray405;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1917(local521[local67++]);
				if (local67 == local71 && local521 != Static111.anIntArrayArray35[11]) {
					local67 = 0;
					local71 = Static111.anIntArray410[11];
					local521 = Static111.anIntArrayArray35[11];
					local523 = Static111.anIntArray405;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1917(local521[local67++]);
				if (local67 == local71 && local521 != Static111.anIntArrayArray35[11]) {
					local67 = 0;
					local71 = Static111.anIntArray410[11];
					local521 = Static111.anIntArrayArray35[11];
					local523 = Static111.anIntArray405;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static111.anIntArray410[local83];
			@Pc(686) int[] local686 = Static111.anIntArrayArray35[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1917(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1917(local521[local67++]);
			if (local67 == local71 && local521 != Static111.anIntArrayArray35[11]) {
				local67 = 0;
				local521 = Static111.anIntArrayArray35[11];
				local71 = Static111.anIntArray410[11];
				local523 = Static111.anIntArray405;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(Z)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1923(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static111.aByteArray29.length < this.anInt2681) {
			Static111.aByteArray29 = new byte[this.anInt2681 + 100];
		}
		return this.method1927(arg0, Static111.aClass1_Sub1_Sub2_Sub7_2, Static111.aByteArray29);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!a;ILclient!a;I[I)V")
	public void method1925(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1933(arg0, arg1);
			return;
		}
		@Pc(18) Class26 local18 = arg0.aClass26Array1[arg1];
		@Pc(23) Class26 local23 = arg2.aClass26Array1[arg3];
		@Pc(26) Class1_Sub5 local26 = local18.aClass1_Sub5_1;
		Static111.anInt2689 = 0;
		Static111.anInt2692 = 0;
		Static111.anInt2687 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt806; local41++) {
			local47 = local18.anIntArray114[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray155[local47] == 0) {
				this.method1926(local26.anIntArray155[local47], local26.anIntArrayArray9[local47], local18.anIntArray116[local41], local18.anIntArray118[local41], local18.anIntArray117[local41]);
			}
		}
		Static111.anInt2689 = 0;
		Static111.anInt2692 = 0;
		Static111.anInt2687 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt806; local47++) {
			@Pc(112) int local112 = local23.anIntArray114[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray155[local112] == 0) {
				this.method1926(local26.anIntArray155[local112], local26.anIntArrayArray9[local112], local23.anIntArray116[local47], local23.anIntArray118[local47], local23.anIntArray117[local47]);
			}
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[IIII)V")
	private void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static111.anInt2689 = 0;
			Static111.anInt2692 = 0;
			Static111.anInt2687 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray34.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray34[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static111.anInt2689 += this.anIntArray399[local36];
						Static111.anInt2692 += this.anIntArray392[local36];
						Static111.anInt2687 += this.anIntArray397[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static111.anInt2689 = Static111.anInt2689 / local6 + arg2;
				Static111.anInt2692 = Static111.anInt2692 / local6 + arg3;
				Static111.anInt2687 = Static111.anInt2687 / local6 + arg4;
			} else {
				Static111.anInt2689 = arg2;
				Static111.anInt2692 = arg3;
				Static111.anInt2687 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray34.length) {
					local115 = this.anIntArrayArray34[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray399[local31] += arg2;
						this.anIntArray392[local31] += arg3;
						this.anIntArray397[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray34.length) {
					local115 = this.anIntArrayArray34[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray399[local31] -= Static111.anInt2689;
						this.anIntArray392[local31] -= Static111.anInt2692;
						this.anIntArray397[local31] -= Static111.anInt2687;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static111.anIntArray418[local225];
							local235 = Static111.anIntArray415[local225];
							local251 = this.anIntArray392[local31] * local231 + this.anIntArray399[local31] * local235 >> 16;
							this.anIntArray392[local31] = this.anIntArray392[local31] * local235 - this.anIntArray399[local31] * local231 >> 16;
							this.anIntArray399[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static111.anIntArray418[local36];
							local235 = Static111.anIntArray415[local36];
							local251 = this.anIntArray392[local31] * local235 - this.anIntArray397[local31] * local231 >> 16;
							this.anIntArray397[local31] = this.anIntArray392[local31] * local231 + this.anIntArray397[local31] * local235 >> 16;
							this.anIntArray392[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static111.anIntArray418[local219];
							local235 = Static111.anIntArray415[local219];
							local251 = this.anIntArray397[local31] * local231 + this.anIntArray399[local31] * local235 >> 16;
							this.anIntArray397[local31] = this.anIntArray397[local31] * local235 - this.anIntArray399[local31] * local231 >> 16;
							this.anIntArray399[local31] = local251;
						}
						this.anIntArray399[local31] += Static111.anInt2689;
						this.anIntArray392[local31] += Static111.anInt2692;
						this.anIntArray397[local31] += Static111.anInt2687;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray34.length) {
					local115 = this.anIntArrayArray34[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray399[local31] -= Static111.anInt2689;
						this.anIntArray392[local31] -= Static111.anInt2692;
						this.anIntArray397[local31] -= Static111.anInt2687;
						this.anIntArray399[local31] = this.anIntArray399[local31] * arg2 / 128;
						this.anIntArray392[local31] = this.anIntArray392[local31] * arg3 / 128;
						this.anIntArray397[local31] = this.anIntArray397[local31] * arg4 / 128;
						this.anIntArray399[local31] += Static111.anInt2689;
						this.anIntArray392[local31] += Static111.anInt2692;
						this.anIntArray397[local31] += Static111.anInt2687;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray37 != null && this.aByteArray30 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray37.length) {
					local115 = this.anIntArrayArray37[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray30[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray30[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!ue;[B)Lclient!ue;")
	private Class1_Sub1_Sub2_Sub7 method1927(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2685 = this.anInt2685;
		arg1.anInt2681 = this.anInt2681;
		arg1.anInt2680 = this.anInt2680;
		if (arg1.anIntArray399 == null || arg1.anIntArray399.length < this.anInt2685) {
			arg1.anIntArray399 = new int[this.anInt2685 + 100];
			arg1.anIntArray392 = new int[this.anInt2685 + 100];
			arg1.anIntArray397 = new int[this.anInt2685 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2685; local43++) {
			arg1.anIntArray399[local43] = this.anIntArray399[local43];
			arg1.anIntArray392[local43] = this.anIntArray392[local43];
			arg1.anIntArray397[local43] = this.anIntArray397[local43];
		}
		if (arg0) {
			arg1.aByteArray30 = this.aByteArray30;
		} else {
			arg1.aByteArray30 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray30 == null) {
				for (local88 = 0; local88 < this.anInt2681; local88++) {
					arg1.aByteArray30[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2681; local88++) {
					arg1.aByteArray30[local88] = this.aByteArray30[local88];
				}
			}
		}
		arg1.anIntArray396 = this.anIntArray396;
		arg1.anIntArray390 = this.anIntArray390;
		arg1.anIntArray391 = this.anIntArray391;
		arg1.anIntArray394 = this.anIntArray394;
		arg1.anIntArray400 = this.anIntArray400;
		arg1.anIntArray393 = this.anIntArray393;
		arg1.aByteArray28 = this.aByteArray28;
		arg1.aByteArray31 = this.aByteArray31;
		arg1.aShortArray11 = this.aShortArray11;
		arg1.aByte5 = this.aByte5;
		arg1.anIntArray398 = this.anIntArray398;
		arg1.anIntArray395 = this.anIntArray395;
		arg1.anIntArray411 = this.anIntArray411;
		arg1.anIntArrayArray34 = this.anIntArrayArray34;
		arg1.anIntArrayArray37 = this.anIntArrayArray37;
		arg1.aBoolean157 = this.aBoolean157;
		arg1.anInt2684 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIIIIIII)V")
	public void method1928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.anInt2684 != 2 && this.anInt2684 != 1) {
			this.method1918();
		}
		@Pc(11) int local11 = Static112.anInt2715;
		@Pc(13) int local13 = Static112.anInt2722;
		@Pc(17) int local17 = Static111.anIntArray418[0];
		@Pc(21) int local21 = Static111.anIntArray415[0];
		@Pc(25) int local25 = Static111.anIntArray418[arg0];
		@Pc(29) int local29 = Static111.anIntArray415[arg0];
		@Pc(33) int local33 = Static111.anIntArray418[arg1];
		@Pc(37) int local37 = Static111.anIntArray415[arg1];
		@Pc(41) int local41 = Static111.anIntArray418[arg2];
		@Pc(45) int local45 = Static111.anIntArray415[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2685; local57++) {
			@Pc(63) int local63 = this.anIntArray399[local57];
			@Pc(68) int local68 = this.anIntArray392[local57];
			@Pc(73) int local73 = this.anIntArray397[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static111.anIntArray407[local57] = local73 - local55;
			Static111.anIntArray419[local57] = local11 + (local63 << 9) / arg6;
			Static111.anIntArray417[local57] = local13 + (local85 << 9) / arg6;
			if (this.anInt2680 > 0) {
				Static111.anIntArray402[local57] = local63;
				Static111.anIntArray413[local57] = local85;
				Static111.anIntArray403[local57] = local73;
			}
		}
		try {
			this.method1921(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.anInt2684 != 1) {
			this.method1919();
		}
		@Pc(15) int local15 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(25) int local25 = arg6 * arg1 + local15 * arg2 >> 16;
		@Pc(32) int local32 = this.anInt2682 * arg2 >> 16;
		@Pc(36) int local36 = local25 + local32;
		if (local36 <= 50 || local25 >= 3500) {
			return;
		}
		@Pc(53) int local53 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(60) int local60 = local53 - this.anInt2682 << 9;
		if (local60 / local36 >= Static112.anInt2720) {
			return;
		}
		@Pc(73) int local73 = local53 + this.anInt2682 << 9;
		if (local73 / local36 <= Static112.anInt2714) {
			return;
		}
		@Pc(89) int local89 = arg6 * arg2 - local15 * arg1 >> 16;
		@Pc(96) int local96 = this.anInt2682 * arg1 >> 16;
		@Pc(102) int local102 = local89 + local96 << 9;
		if (local102 / local36 <= Static112.anInt2719) {
			return;
		}
		@Pc(117) int local117 = local96 + (super.anInt2678 * arg2 >> 16);
		@Pc(123) int local123 = local89 - local117 << 9;
		if (local123 / local36 >= Static112.anInt2718) {
			return;
		}
		@Pc(138) int local138 = local32 + (super.anInt2678 * arg1 >> 16);
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		if (local25 - local138 <= 50) {
			local142 = true;
		}
		@Pc(158) boolean local158 = local142 || this.anInt2680 > 0;
		@Pc(160) boolean local160 = false;
		@Pc(168) int local168;
		@Pc(215) int local215;
		@Pc(219) int local219;
		if (arg8 > 0 && Static111.aBoolean158) {
			local168 = local25 - local32;
			if (local168 <= 50) {
				local168 = 50;
			}
			if (local53 > 0) {
				local60 /= local36;
				local73 /= local168;
			} else {
				local73 /= local36;
				local60 /= local168;
			}
			if (local89 > 0) {
				local123 /= local36;
				local102 /= local168;
			} else {
				local102 /= local36;
				local123 /= local168;
			}
			local215 = Static111.anInt2688 - Static112.anInt2715;
			local219 = Static111.anInt2690 - Static112.anInt2722;
			if (local215 > local60 && local215 < local73 && local219 > local123 && local219 < local102) {
				if (this.aBoolean157) {
					Static111.anIntArray409[Static111.anInt2691++] = arg8;
				} else {
					local160 = true;
				}
			}
		}
		local168 = Static112.anInt2715;
		local215 = Static112.anInt2722;
		local219 = 0;
		@Pc(253) int local253 = 0;
		if (arg0 != 0) {
			local219 = Static111.anIntArray418[arg0];
			local253 = Static111.anIntArray415[arg0];
		}
		for (@Pc(265) int local265 = 0; local265 < this.anInt2685; local265++) {
			@Pc(271) int local271 = this.anIntArray399[local265];
			@Pc(276) int local276 = this.anIntArray392[local265];
			@Pc(281) int local281 = this.anIntArray397[local265];
			@Pc(293) int local293;
			if (arg0 != 0) {
				local293 = local281 * local219 + local271 * local253 >> 16;
				local281 = local281 * local253 - local271 * local219 >> 16;
				local271 = local293;
			}
			local271 += arg5;
			local276 += arg6;
			local281 += arg7;
			local293 = local281 * arg3 + local271 * arg4 >> 16;
			local281 = local281 * arg4 - local271 * arg3 >> 16;
			local271 = local293;
			local293 = local276 * arg2 - local281 * arg1 >> 16;
			local281 = local276 * arg1 + local281 * arg2 >> 16;
			Static111.anIntArray407[local265] = local281 - local25;
			if (local281 >= 50) {
				Static111.anIntArray419[local265] = local168 + (local271 << 9) / local281;
				Static111.anIntArray417[local265] = local215 + (local293 << 9) / local281;
			} else {
				Static111.anIntArray419[local265] = -5000;
				local140 = true;
			}
			if (local158) {
				Static111.anIntArray402[local265] = local271;
				Static111.anIntArray413[local265] = local293;
				Static111.anIntArray403[local265] = local281;
			}
		}
		try {
			this.method1921(local140, local160, arg8);
		} catch (@Pc(423) Exception local423) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
	public void method1929() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2685; local1++) {
			@Pc(7) int local7 = this.anIntArray397[local1];
			this.anIntArray397[local1] = this.anIntArray399[local1];
			this.anIntArray399[local1] = -local7;
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "()I")
	public int method1930() {
		this.method1919();
		return this.anInt2682;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIZ)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub1_Sub2_Sub7 local16;
		if (arg4) {
			local16 = new Class1_Sub1_Sub2_Sub7();
			local16.anInt2685 = this.anInt2685;
			local16.anInt2681 = this.anInt2681;
			local16.anInt2680 = this.anInt2680;
			local16.anIntArray399 = this.anIntArray399;
			local16.anIntArray397 = this.anIntArray397;
			local16.anIntArray396 = this.anIntArray396;
			local16.anIntArray390 = this.anIntArray390;
			local16.anIntArray391 = this.anIntArray391;
			local16.anIntArray394 = this.anIntArray394;
			local16.anIntArray400 = this.anIntArray400;
			local16.anIntArray393 = this.anIntArray393;
			local16.aByteArray28 = this.aByteArray28;
			local16.aByteArray30 = this.aByteArray30;
			local16.aByteArray31 = this.aByteArray31;
			local16.aShortArray11 = this.aShortArray11;
			local16.aByte5 = this.aByte5;
			local16.anIntArray398 = this.anIntArray398;
			local16.anIntArray395 = this.anIntArray395;
			local16.anIntArray411 = this.anIntArray411;
			local16.anIntArrayArray34 = this.anIntArrayArray34;
			local16.anIntArrayArray37 = this.anIntArrayArray37;
			local16.aBoolean157 = this.aBoolean157;
			local16.anIntArray392 = new int[local16.anInt2685];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt2685; local124++) {
			@Pc(130) int local130 = this.anIntArray399[local124];
			@Pc(135) int local135 = this.anIntArray392[local124];
			@Pc(140) int local140 = this.anIntArray397[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray392[local124] = local135 + local176 - local122;
		}
		local16.anInt2684 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
	public void method1932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.anInt2684 != 2 && this.anInt2684 != 1) {
			this.method1918();
		}
		@Pc(11) int local11 = Static112.anInt2715;
		@Pc(13) int local13 = Static112.anInt2722;
		@Pc(17) int local17 = Static111.anIntArray418[0];
		@Pc(21) int local21 = Static111.anIntArray415[0];
		@Pc(25) int local25 = Static111.anIntArray418[arg0];
		@Pc(29) int local29 = Static111.anIntArray415[arg0];
		@Pc(33) int local33 = Static111.anIntArray418[arg1];
		@Pc(37) int local37 = Static111.anIntArray415[arg1];
		@Pc(41) int local41 = Static111.anIntArray418[arg2];
		@Pc(45) int local45 = Static111.anIntArray415[arg2];
		@Pc(55) int local55 = arg4 * local41 + arg5 * local45 >> 16;
		for (@Pc(57) int local57 = 0; local57 < this.anInt2685; local57++) {
			@Pc(63) int local63 = this.anIntArray399[local57];
			@Pc(68) int local68 = this.anIntArray392[local57];
			@Pc(73) int local73 = this.anIntArray397[local57];
			@Pc(85) int local85;
			if (arg1 != 0) {
				local85 = local68 * local33 + local63 * local37 >> 16;
				local68 = local68 * local37 - local63 * local33 >> 16;
				local63 = local85;
			}
			if (arg0 != 0) {
				local85 = local73 * local25 + local63 * local29 >> 16;
				local73 = local73 * local29 - local63 * local25 >> 16;
				local63 = local85;
			}
			local63 += arg3;
			local68 += arg4;
			local73 += arg5;
			local85 = local68 * local45 - local73 * local41 >> 16;
			local73 = local68 * local41 + local73 * local45 >> 16;
			Static111.anIntArray407[local57] = local73 - local55;
			Static111.anIntArray419[local57] = local11 + (local63 << 9) / local73;
			Static111.anIntArray417[local57] = local13 + (local85 << 9) / local73;
			if (this.anInt2680 > 0) {
				Static111.anIntArray402[local57] = local63;
				Static111.anIntArray413[local57] = local85;
				Static111.anIntArray403[local57] = local73;
			}
		}
		try {
			this.method1921(false, false, 0);
		} catch (@Pc(232) Exception local232) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!a;I)V")
	public void method1933(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray34 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class26 local12 = arg0.aClass26Array1[arg1];
		@Pc(15) Class1_Sub5 local15 = local12.aClass1_Sub5_1;
		Static111.anInt2689 = 0;
		Static111.anInt2692 = 0;
		Static111.anInt2687 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt806; local23++) {
			@Pc(29) int local29 = local12.anIntArray114[local23];
			this.method1926(local15.anIntArray155[local29], local15.anIntArrayArray9[local29], local12.anIntArray116[local23], local12.anIntArray118[local23], local12.anIntArray117[local23]);
		}
		this.anInt2684 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
	public void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2685; local1++) {
			this.anIntArray399[local1] += arg0;
			this.anIntArray392[local1] += arg1;
			this.anIntArray397[local1] += arg2;
		}
		this.anInt2684 = 0;
	}
}
