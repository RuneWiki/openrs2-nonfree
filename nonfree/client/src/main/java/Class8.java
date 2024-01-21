import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DWRVLVYL")
public final class Class8 {

	@OriginalMember(owner = "client!DWRVLVYL", name = "s", descriptor = "[I")
	private static int[] anIntArray28;

	@OriginalMember(owner = "client!DWRVLVYL", name = "t", descriptor = "[I")
	private static int[] anIntArray29;

	@OriginalMember(owner = "client!DWRVLVYL", name = "u", descriptor = "[I")
	private static int[] anIntArray30;

	@OriginalMember(owner = "client!DWRVLVYL", name = "v", descriptor = "[I")
	private static int[] anIntArray31 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "w", descriptor = "[I")
	private static int[] anIntArray32 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "x", descriptor = "[I")
	private static int[] anIntArray33 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "y", descriptor = "[I")
	private static int[] anIntArray34 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "z", descriptor = "[I")
	private static int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "b", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!DWRVLVYL", name = "c", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_2;

	@OriginalMember(owner = "client!DWRVLVYL", name = "d", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_3;

	@OriginalMember(owner = "client!DWRVLVYL", name = "e", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_4;

	@OriginalMember(owner = "client!DWRVLVYL", name = "f", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_5;

	@OriginalMember(owner = "client!DWRVLVYL", name = "g", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_6;

	@OriginalMember(owner = "client!DWRVLVYL", name = "h", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_7;

	@OriginalMember(owner = "client!DWRVLVYL", name = "i", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_8;

	@OriginalMember(owner = "client!DWRVLVYL", name = "m", descriptor = "I")
	private int anInt142;

	@OriginalMember(owner = "client!DWRVLVYL", name = "o", descriptor = "Lclient!EWUYFKZT;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!DWRVLVYL", name = "p", descriptor = "Lclient!VRTTZTTM;")
	private Class43 aClass43_9;

	@OriginalMember(owner = "client!DWRVLVYL", name = "r", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!DWRVLVYL", name = "j", descriptor = "[I")
	private int[] anIntArray25 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "k", descriptor = "[I")
	private int[] anIntArray26 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "l", descriptor = "[I")
	private int[] anIntArray27 = new int[5];

	@OriginalMember(owner = "client!DWRVLVYL", name = "n", descriptor = "I")
	private int anInt143 = 100;

	@OriginalMember(owner = "client!DWRVLVYL", name = "q", descriptor = "I")
	public int anInt144 = 500;

	@OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "()V")
	public static void method61() {
		anIntArray29 = new int[32768];
		for (@Pc(6) int local6 = 0; local6 < 32768; local6++) {
			if (Math.random() > 0.5D) {
				anIntArray29[local6] = 1;
			} else {
				anIntArray29[local6] = -1;
			}
		}
		anIntArray30 = new int[32768];
		for (@Pc(31) int local31 = 0; local31 < 32768; local31++) {
			anIntArray30[local31] = (int) (Math.sin((double) local31 / 5215.1903D) * 16384.0D);
		}
		anIntArray28 = new int[220500];
	}

	@OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "(II)[I")
	public int[] method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			anIntArray28[local3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray28;
		}
		@Pc(26) double local26 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass43_1.method547(406);
		this.aClass43_2.method547(406);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (this.aClass43_3 != null) {
			this.aClass43_3.method547(406);
			this.aClass43_4.method547(406);
			local36 = (int) ((double) (this.aClass43_3.anInt700 - this.aClass43_3.anInt699) * 32.768D / local26);
			local38 = (int) ((double) this.aClass43_3.anInt699 * 32.768D / local26);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.aClass43_5 != null) {
			this.aClass43_5.method547(406);
			this.aClass43_6.method547(406);
			local77 = (int) ((double) (this.aClass43_5.anInt700 - this.aClass43_5.anInt699) * 32.768D / local26);
			local79 = (int) ((double) this.aClass43_5.anInt699 * 32.768D / local26);
		}
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (this.anIntArray25[local118] != 0) {
				anIntArray31[local118] = 0;
				anIntArray32[local118] = (int) ((double) this.anIntArray27[local118] * local26);
				anIntArray33[local118] = (this.anIntArray25[local118] << 14) / 100;
				anIntArray34[local118] = (int) ((double) (this.aClass43_1.anInt700 - this.aClass43_1.anInt699) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray26[local118]) / local26);
				anIntArray35[local118] = (int) ((double) this.aClass43_1.anInt699 * 32.768D / local26);
			}
		}
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(216) int local216;
		@Pc(222) int local222;
		for (@Pc(193) int local193 = 0; local193 < arg0; local193++) {
			local201 = this.aClass43_1.method548(arg0);
			local207 = this.aClass43_2.method548(arg0);
			if (this.aClass43_3 != null) {
				local216 = this.aClass43_3.method548(arg0);
				local222 = this.aClass43_4.method548(arg0);
				local201 += this.method63(this.aClass43_3.anInt701, local222, local40) >> 1;
				local40 += (local216 * local36 >> 16) + local38;
			}
			if (this.aClass43_5 != null) {
				local216 = this.aClass43_5.method548(arg0);
				local222 = this.aClass43_6.method548(arg0);
				local207 = local207 * ((this.method63(this.aClass43_5.anInt701, local222, local81) >> 1) + 32768) >> 15;
				local81 += (local216 * local77 >> 16) + local79;
			}
			for (local216 = 0; local216 < 5; local216++) {
				if (this.anIntArray25[local216] != 0) {
					local222 = local193 + anIntArray32[local216];
					if (local222 < arg0) {
						anIntArray28[local222] += this.method63(this.aClass43_1.anInt701, local207 * anIntArray33[local216] >> 15, anIntArray31[local216]);
						anIntArray31[local216] += (local201 * anIntArray34[local216] >> 16) + anIntArray35[local216];
					}
				}
			}
		}
		@Pc(379) int local379;
		@Pc(385) int local385;
		if (this.aClass43_7 != null) {
			this.aClass43_7.method547(406);
			this.aClass43_8.method547(406);
			local201 = 0;
			@Pc(369) boolean local369 = true;
			for (local222 = 0; local222 < arg0; local222++) {
				local379 = this.aClass43_7.method548(arg0);
				local385 = this.aClass43_8.method548(arg0);
				if (local369) {
					local207 = this.aClass43_7.anInt699 + ((this.aClass43_7.anInt700 - this.aClass43_7.anInt699) * local379 >> 8);
				} else {
					local207 = this.aClass43_7.anInt699 + ((this.aClass43_7.anInt700 - this.aClass43_7.anInt699) * local385 >> 8);
				}
				local201 += 256;
				if (local201 >= local207) {
					local201 = 0;
					local369 = !local369;
				}
				if (local369) {
					anIntArray28[local222] = 0;
				}
			}
		}
		if (this.anInt142 > 0 && this.anInt143 > 0) {
			local201 = (int) ((double) this.anInt142 * local26);
			for (local207 = local201; local207 < arg0; local207++) {
				anIntArray28[local207] += anIntArray28[local207 - local201] * this.anInt143 / 100;
			}
		}
		if (this.aClass10_1.anIntArray36[0] > 0 || this.aClass10_1.anIntArray36[1] > 0) {
			this.aClass43_9.method547(406);
			local201 = this.aClass43_9.method548(arg0 + 1);
			local207 = this.aClass10_1.method72(0, (float) local201 / 65536.0F);
			local216 = this.aClass10_1.method72(1, (float) local201 / 65536.0F);
			if (arg0 >= local207 + local216) {
				local222 = 0;
				local379 = local216;
				if (local216 > arg0 - local207) {
					local379 = arg0 - local207;
				}
				@Pc(559) int local559;
				@Pc(590) int local590;
				while (local222 < local379) {
					local385 = (int) ((long) anIntArray28[local222 + local207] * (long) Class10.anInt164 >> 16);
					for (local559 = 0; local559 < local207; local559++) {
						local385 += (int) ((long) anIntArray28[local222 + local207 - local559 - 1] * (long) Class10.anIntArrayArray5[0][local559] >> 16);
					}
					for (local590 = 0; local590 < local222; local590++) {
						local385 -= (int) ((long) anIntArray28[local222 - local590 - 1] * (long) Class10.anIntArrayArray5[1][local590] >> 16);
					}
					anIntArray28[local222] = local385;
					local201 = this.aClass43_9.method548(arg0 + 1);
					local222++;
				}
				local379 = 128;
				while (true) {
					if (local379 > arg0 - local207) {
						local379 = arg0 - local207;
					}
					@Pc(694) int local694;
					while (local222 < local379) {
						local559 = (int) ((long) anIntArray28[local222 + local207] * (long) Class10.anInt164 >> 16);
						for (local590 = 0; local590 < local207; local590++) {
							local559 += (int) ((long) anIntArray28[local222 + local207 - local590 - 1] * (long) Class10.anIntArrayArray5[0][local590] >> 16);
						}
						for (local694 = 0; local694 < local216; local694++) {
							local559 -= (int) ((long) anIntArray28[local222 - local694 - 1] * (long) Class10.anIntArrayArray5[1][local694] >> 16);
						}
						anIntArray28[local222] = local559;
						local201 = this.aClass43_9.method548(arg0 + 1);
						local222++;
					}
					if (local222 >= arg0 - local207) {
						while (local222 < arg0) {
							local559 = 0;
							for (local590 = local222 + local207 - arg0; local590 < local207; local590++) {
								local559 += (int) ((long) anIntArray28[local222 + local207 - local590 - 1] * (long) Class10.anIntArrayArray5[0][local590] >> 16);
							}
							for (local694 = 0; local694 < local216; local694++) {
								local559 -= (int) ((long) anIntArray28[local222 - local694 - 1] * (long) Class10.anIntArrayArray5[1][local694] >> 16);
							}
							anIntArray28[local222] = local559;
							this.aClass43_9.method548(arg0 + 1);
							local222++;
						}
						break;
					}
					local207 = this.aClass10_1.method72(0, (float) local201 / 65536.0F);
					local216 = this.aClass10_1.method72(1, (float) local201 / 65536.0F);
					local379 += 128;
				}
			}
		}
		for (local201 = 0; local201 < arg0; local201++) {
			if (anIntArray28[local201] < -32768) {
				anIntArray28[local201] = -32768;
			}
			if (anIntArray28[local201] > 32767) {
				anIntArray28[local201] = 32767;
			}
		}
		return anIntArray28;
	}

	@OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "(IIZI)I")
	private int method63(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 == 1) {
				return (arg2 & 0x7FFF) < 16384 ? arg1 : -arg1;
			} else if (arg0 == 2) {
				return anIntArray30[arg2 & 0x7FFF] * arg1 >> 14;
			} else if (arg0 == 3) {
				return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
			} else if (arg0 == 4) {
				return anIntArray29[arg2 / 2607 & 0x7FFF] * arg1;
			} else {
				return 0;
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("39868, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DWRVLVYL", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	public void method64(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.aClass43_1 = new Class43();
			this.aClass43_1.method545(arg0);
			this.aClass43_2 = new Class43();
			this.aClass43_2.method545(arg0);
			@Pc(24) int local24 = arg0.method492();
			if (local24 != 0) {
				arg0.anInt672--;
				this.aClass43_3 = new Class43();
				this.aClass43_3.method545(arg0);
				this.aClass43_4 = new Class43();
				this.aClass43_4.method545(arg0);
			}
			local24 = arg0.method492();
			if (local24 != 0) {
				arg0.anInt672--;
				this.aClass43_5 = new Class43();
				this.aClass43_5.method545(arg0);
				this.aClass43_6 = new Class43();
				this.aClass43_6.method545(arg0);
			}
			local24 = arg0.method492();
			if (local24 != 0) {
				arg0.anInt672--;
				this.aClass43_7 = new Class43();
				this.aClass43_7.method545(arg0);
				this.aClass43_8 = new Class43();
				this.aClass43_8.method545(arg0);
			}
			for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
				@Pc(137) int local137 = arg0.method506();
				if (local137 == 0) {
					break;
				}
				this.anIntArray25[local132] = local137;
				this.anIntArray26[local132] = arg0.method505();
				this.anIntArray27[local132] = arg0.method506();
			}
			this.anInt142 = arg0.method506();
			this.anInt143 = arg0.method506();
			this.anInt144 = arg0.method494();
			this.anInt145 = arg0.method494();
			this.aClass10_1 = new Class10();
			this.aClass43_9 = new Class43();
			this.aClass10_1.method73(arg0, this.aClass43_9);
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("20153, " + arg0 + ", " + 4 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}
}
