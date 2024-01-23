import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hf", name = "Fb", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!hf", name = "Gb", descriptor = "Z")
	private boolean aBoolean141;

	@OriginalMember(owner = "client!hf", name = "Hb", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!hf", name = "Ib", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!hf", name = "Jb", descriptor = "I")
	private int anInt1871;

	@OriginalMember(owner = "client!hf", name = "Kb", descriptor = "I")
	private int anInt1872;

	@OriginalMember(owner = "client!hf", name = "Lb", descriptor = "Lclient!ma;")
	private Class1_Sub16 aClass1_Sub16_1;

	@OriginalMember(owner = "client!hf", name = "Mb", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "[I")
	private int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "[I")
	private int[] anIntArray154 = new int[16];

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
	private int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "[I")
	private int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "[I")
	private int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
	private int anInt1846 = 256;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "[I")
	private int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!hf", name = "ob", descriptor = "[[Lclient!lk;")
	private Class1_Sub15[][] aClass1_Sub15ArrayArray1 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!hf", name = "hb", descriptor = "[I")
	public int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "[I")
	public int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!hf", name = "nb", descriptor = "[I")
	private int[] anIntArray161 = new int[16];

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "[I")
	private int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!hf", name = "sb", descriptor = "[I")
	private int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!hf", name = "yb", descriptor = "[I")
	public int[] anIntArray163 = new int[16];

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "[I")
	private int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!hf", name = "Ab", descriptor = "[[Lclient!lk;")
	private Class1_Sub15[][] aClass1_Sub15ArrayArray2 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	private int anInt1830 = 1000000;

	@OriginalMember(owner = "client!hf", name = "jb", descriptor = "[I")
	private int[] anIntArray160 = new int[16];

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "[I")
	private int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!hf", name = "Db", descriptor = "[I")
	private int[] anIntArray164 = new int[16];

	@OriginalMember(owner = "client!hf", name = "vb", descriptor = "Lclient!ij;")
	private Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!hf", name = "Eb", descriptor = "Lclient!uc;")
	private Class1_Sub4_Sub4 aClass1_Sub4_Sub4_1 = new Class1_Sub4_Sub4(this);

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!s;")
	private Class156 aClass156_9 = new Class156(128);

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub3() {
		this.method1468();
		this.method1493(true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	private void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1479(arg0, 64, arg1);
		if ((this.anIntArray159[arg0] & 0x2) != 0) {
			for (@Pc(29) Class1_Sub15 local29 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method461(); local29 != null; local29 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method471()) {
				if (local29.anInt3354 == arg0 && local29.anInt3343 < 0) {
					this.aClass1_Sub15ArrayArray2[arg0][local29.anInt3362] = null;
					this.aClass1_Sub15ArrayArray2[arg0][arg1] = local29;
					@Pc(72) int local72 = (local29.anInt3360 * local29.anInt3366 >> 12) + local29.anInt3357;
					local29.anInt3360 = 4096;
					local29.anInt3357 += arg1 - local29.anInt3362 << 8;
					local29.anInt3366 = local72 - local29.anInt3357;
					local29.anInt3362 = arg1;
					return;
				}
			}
		}
		@Pc(118) Class1_Sub23 local118 = (Class1_Sub23) this.aClass156_9.method3821((long) this.anIntArray160[arg0]);
		if (local118 == null) {
			return;
		}
		@Pc(127) Class1_Sub7_Sub1 local127 = local118.aClass1_Sub7_Sub1Array1[arg1];
		if (local127 == null) {
			return;
		}
		@Pc(141) Class1_Sub15 local141 = new Class1_Sub15();
		local141.aClass1_Sub23_1 = local118;
		local141.anInt3354 = arg0;
		local141.aClass1_Sub7_Sub1_1 = local127;
		local141.aClass193_1 = local118.aClass193Array1[arg1];
		local141.anInt3346 = local118.aByteArray43[arg1];
		local141.anInt3362 = arg1;
		local141.anInt3365 = arg2 * arg2 * local118.anInt4231 * local118.aByteArray41[arg1] + 1024 >> 11;
		local141.anInt3361 = local118.aByteArray42[arg1] & 0xFF;
		local141.anInt3357 = (arg1 << 8) - (local118.aShortArray60[arg1] & 0x7FFF);
		local141.anInt3341 = 0;
		local141.anInt3363 = 0;
		local141.anInt3359 = 0;
		local141.anInt3342 = 0;
		local141.anInt3343 = -1;
		if (this.anIntArray153[arg0] == 0) {
			local141.aClass1_Sub4_Sub1_3 = Static317.method263(local127, this.method1492(local141), this.method1476(local141), this.method1470(local141));
		} else {
			local141.aClass1_Sub4_Sub1_3 = Static317.method263(local127, this.method1492(local141), 0, this.method1470(local141));
			this.method1496(local141, local118.aShortArray60[arg1] < 0);
		}
		if (local118.aShortArray60[arg1] < 0) {
			local141.aClass1_Sub4_Sub1_3.method241(-1);
		}
		if (local141.anInt3346 >= 0) {
			@Pc(293) Class1_Sub15 local293 = this.aClass1_Sub15ArrayArray1[arg0][local141.anInt3346];
			if (local293 != null && local293.anInt3343 < 0) {
				this.aClass1_Sub15ArrayArray2[arg0][local293.anInt3362] = null;
				local293.anInt3343 = 0;
			}
			this.aClass1_Sub15ArrayArray1[arg0][local141.anInt3346] = local141;
		}
		this.aClass1_Sub4_Sub4_1.aClass24_29.method473(local141);
		this.aClass1_Sub15ArrayArray2[arg0][arg1] = local141;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BZ)V")
	private synchronized void method1465(@OriginalArg(1) boolean arg0) {
		this.aClass84_1.method1848();
		this.aClass1_Sub16_1 = null;
		this.method1493(arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLclient!ma;Z)V")
	private synchronized void method1466(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub16 arg1, @OriginalArg(3) boolean arg2) {
		this.method1465(arg0);
		this.aClass84_1.method1847(arg1.aByteArray35);
		this.aLong72 = 0L;
		this.aBoolean141 = arg2;
		@Pc(24) int local24 = this.aClass84_1.method1859();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass84_1.method1852(local26);
			this.aClass84_1.method1853(local26);
			this.aClass84_1.method1856(local26);
		}
		this.anInt1870 = this.aClass84_1.method1854();
		this.anInt1871 = this.aClass84_1.anIntArray189[this.anInt1870];
		this.aLong73 = this.aClass84_1.method1845(this.anInt1871);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZLclient!ma;)V")
	public synchronized void method1467(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		this.method1466(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)V")
	private synchronized void method1468() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray150[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)V")
	private void method1469(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0xF0;
		@Pc(36) int local36;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local12 == 128) {
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			local36 = arg0 & 0xF;
			this.method1479(local36, local32, local26);
		} else if (local12 == 144) {
			local36 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 > 0) {
				this.method1464(local36, local26, local32);
			} else {
				this.method1479(local36, 64, local26);
			}
		} else if (local12 == 160) {
			local26 = arg0 >> 8 & 0x7F;
			local36 = arg0 & 0xF;
			local32 = arg0 >> 16 & 0x7F;
			this.method1472(local26, local36, local32);
		} else if (local12 == 176) {
			local36 = arg0 & 0xF;
			local32 = arg0 >> 16 & 0x7F;
			local26 = arg0 >> 8 & 0x7F;
			if (local26 == 0) {
				this.anIntArray164[local36] = (this.anIntArray164[local36] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray164[local36] = (this.anIntArray164[local36] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray151[local36] = (this.anIntArray151[local36] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 33) {
				this.anIntArray151[local36] = (this.anIntArray151[local36] & 0xFFFFFF80) + local32;
			}
			if (local26 == 5) {
				this.anIntArray158[local36] = (local32 << 7) + (this.anIntArray158[local36] & 0xFFFFC07F);
			}
			if (local26 == 37) {
				this.anIntArray158[local36] = local32 + (this.anIntArray158[local36] & 0xFFFFFF80);
			}
			if (local26 == 7) {
				this.anIntArray155[local36] = (local32 << 7) + (this.anIntArray155[local36] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray155[local36] = (this.anIntArray155[local36] & 0xFFFFFF80) + local32;
			}
			if (local26 == 10) {
				this.anIntArray154[local36] = (local32 << 7) + (this.anIntArray154[local36] & 0xFFFFC07F);
			}
			if (local26 == 42) {
				this.anIntArray154[local36] = (this.anIntArray154[local36] & 0xFFFFFF80) + local32;
			}
			if (local26 == 11) {
				this.anIntArray157[local36] = (this.anIntArray157[local36] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 43) {
				this.anIntArray157[local36] = (this.anIntArray157[local36] & 0xFFFFFF80) + local32;
			}
			if (local26 == 64) {
				if (local32 >= 64) {
					this.anIntArray159[local36] |= 0x1;
				} else {
					this.anIntArray159[local36] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local32 < 64) {
					this.method1495(local36);
					this.anIntArray159[local36] &= 0xFFFFFFFD;
				} else {
					this.anIntArray159[local36] |= 0x2;
				}
			}
			if (local26 == 99) {
				this.anIntArray162[local36] = (local32 << 7) + (this.anIntArray162[local36] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray162[local36] = (this.anIntArray162[local36] & 0x3F80) + local32;
			}
			if (local26 == 101) {
				this.anIntArray162[local36] = (this.anIntArray162[local36] & 0x7F) + (local32 << 7) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray162[local36] = (this.anIntArray162[local36] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method1489(local36);
			}
			if (local26 == 121) {
				this.method1482(local36);
			}
			if (local26 == 123) {
				this.method1488(local36);
			}
			@Pc(521) int local521;
			if (local26 == 6) {
				local521 = this.anIntArray162[local36];
				if (local521 == 16384) {
					this.anIntArray149[local36] = (this.anIntArray149[local36] & 0xFFFFC07F) + (local32 << 7);
				}
			}
			if (local26 == 38) {
				local521 = this.anIntArray162[local36];
				if (local521 == 16384) {
					this.anIntArray149[local36] = local32 + (this.anIntArray149[local36] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray153[local36] = (this.anIntArray153[local36] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 48) {
				this.anIntArray153[local36] = local32 + (this.anIntArray153[local36] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local32 < 64) {
					this.method1477(local36);
					this.anIntArray159[local36] &= 0xFFFFFFFB;
				} else {
					this.anIntArray159[local36] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method1480(local36, (this.anIntArray152[local36] & 0xFFFFC07F) + (local32 << 7));
			}
			if (local26 == 49) {
				this.method1480(local36, local32 + (this.anIntArray152[local36] & 0xFFFFFF80));
			}
		} else if (local12 == 192) {
			local26 = arg0 >> 8 & 0x7F;
			local36 = arg0 & 0xF;
			this.method1500(local36, local26 + this.anIntArray164[local36]);
		} else if (local12 == 208) {
			local36 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method1481(local26, local36);
		} else if (local12 == 224) {
			local36 = arg0 & 0xF;
			local26 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0074) >> 9);
			this.method1478(local26, local36);
		} else {
			local12 = arg0 & 0xFF;
			if (local12 == 255) {
				this.method1493(true);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!lk;I)I")
	private int method1470(@OriginalArg(0) Class1_Sub15 arg0) {
		@Pc(9) int local9 = this.anIntArray154[arg0.anInt3354];
		return local9 < 8192 ? arg0.anInt3361 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt3361 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1471() {
		return this.aClass84_1.method1844();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V")
	private void method1472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)I")
	public int method1473() {
		return this.anInt1846;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!lk;B)Z")
	public boolean method1474(@OriginalArg(0) Class1_Sub15 arg0) {
		if (arg0.aClass1_Sub4_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt3343 >= 0) {
			arg0.method4616();
			if (arg0.anInt3346 > 0 && arg0 == this.aClass1_Sub15ArrayArray1[arg0.anInt3354][arg0.anInt3346]) {
				this.aClass1_Sub15ArrayArray1[arg0.anInt3354][arg0.anInt3346] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()I")
	@Override
	public synchronized int method4188() {
		return 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!lk;)I")
	private int method1476(@OriginalArg(1) Class1_Sub15 arg0) {
		if (this.anIntArray150[arg0.anInt3354] == 0) {
			return 0;
		}
		@Pc(23) Class193 local23 = arg0.aClass193_1;
		@Pc(39) int local39 = this.anIntArray157[arg0.anInt3354] * this.anIntArray155[arg0.anInt3354] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = local47 * arg0.anInt3365 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt1846 * local56 + 128 >> 8;
		local39 = local65 * this.anIntArray150[arg0.anInt3354] + 128 >> 8;
		if (local23.anInt5904 > 0) {
			local39 = (int) (Math.pow(0.5D, (double) local23.anInt5904 * 1.953125E-5D * (double) arg0.anInt3341) * (double) local39 + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local23.aByteArray76 != null) {
			local109 = arg0.anInt3342;
			local117 = local23.aByteArray76[arg0.anInt3359 + 1];
			if (local23.aByteArray76.length - 2 > arg0.anInt3359) {
				local135 = (local23.aByteArray76[arg0.anInt3359] & 0xFF) << 8;
				local147 = (local23.aByteArray76[arg0.anInt3359 + 2] & 0xFF) << 8;
				local117 += (local109 - local135) * (local23.aByteArray76[arg0.anInt3359 - -3] - local117) / (local147 - local135);
			}
			local39 = local39 * local117 + 32 >> 6;
		}
		if (arg0.anInt3343 > 0 && local23.aByteArray75 != null) {
			local109 = arg0.anInt3343;
			local117 = local23.aByteArray75[arg0.anInt3363 + 1];
			if (arg0.anInt3363 < local23.aByteArray75.length - 2) {
				local135 = (local23.aByteArray75[arg0.anInt3363] & 0xFF) << 8;
				local147 = (local23.aByteArray75[arg0.anInt3363 + 2] & 0xFF) << 8;
				local117 += (local23.aByteArray75[arg0.anInt3363 + 3] - local117) * (local109 - local135) / (local147 - local135);
			}
			local39 = local39 * local117 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
	private void method1477(@OriginalArg(0) int arg0) {
		if ((this.anIntArray159[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class1_Sub15 local16 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method460(); local16 != null; local16 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method464()) {
			if (local16.anInt3354 == arg0) {
				local16.anInt3350 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
	private void method1478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray156[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIII)V")
	private void method1479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub15 local8 = this.aClass1_Sub15ArrayArray2[arg0][arg2];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub15ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray159[arg0] & 0x2) == 0) {
			local8.anInt3343 = 0;
			return;
		}
		for (@Pc(47) Class1_Sub15 local47 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method460(); local47 != null; local47 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method464()) {
			if (local47.anInt3354 == local8.anInt3354 && local47.anInt3343 < 0 && local8 != local47) {
				local8.anInt3343 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)V")
	private void method1480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray152[arg0] = arg1;
		this.anIntArray163[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(III)V")
	private void method1481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IB)V")
	private void method1482(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.method1482(local13);
			}
			return;
		}
		this.anIntArray155[arg0] = 12800;
		this.anIntArray154[arg0] = 8192;
		this.anIntArray157[arg0] = 16383;
		this.anIntArray156[arg0] = 8192;
		this.anIntArray151[arg0] = 0;
		this.anIntArray158[arg0] = 8192;
		this.method1495(arg0);
		this.method1477(arg0);
		this.anIntArray159[arg0] = 0;
		this.anIntArray162[arg0] = 32767;
		this.anIntArray149[arg0] = 256;
		this.anIntArray153[arg0] = 0;
		this.method1480(arg0, 8192);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lclient!vc;")
	@Override
	public synchronized Class1_Sub4 method4186() {
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4192(@OriginalArg(0) int arg0) {
		if (this.aClass84_1.method1844()) {
			@Pc(19) int local19 = this.aClass84_1.anInt2305 * this.anInt1830 / Static152.anInt3130;
			do {
				@Pc(28) long local28 = (long) arg0 * (long) local19 + this.aLong72;
				if (this.aLong73 - local28 >= 0L) {
					this.aLong72 = local28;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local19 + this.aLong73 - this.aLong72 - 1L) / (long) local19);
				arg0 -= local59;
				this.aLong72 += (long) local59 * (long) local19;
				this.aClass1_Sub4_Sub4_1.method4192(local59);
				this.method1498();
			} while (this.aClass84_1.method1844());
		}
		this.aClass1_Sub4_Sub4_1.method4192(arg0);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
	public synchronized void method1483() {
		for (@Pc(18) Class1_Sub23 local18 = (Class1_Sub23) this.aClass156_9.method3822(); local18 != null; local18 = (Class1_Sub23) this.aClass156_9.method3820()) {
			local18.method4616();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI[ILclient!lk;I)Z")
	public boolean method1484(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class1_Sub15 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt3352 = Static152.anInt3130 / 100;
		if (arg2.anInt3343 >= 0 && (arg2.aClass1_Sub4_Sub1_3 == null || arg2.aClass1_Sub4_Sub1_3.method258())) {
			arg2.method2689();
			arg2.method4616();
			if (arg2.anInt3346 > 0 && this.aClass1_Sub15ArrayArray1[arg2.anInt3354][arg2.anInt3346] == arg2) {
				this.aClass1_Sub15ArrayArray1[arg2.anInt3354][arg2.anInt3346] = null;
			}
			return true;
		}
		@Pc(57) int local57 = arg2.anInt3360;
		@Pc(66) boolean local66 = false;
		if (local57 > 0) {
			local57 -= (int) (Math.pow(2.0D, (double) this.anIntArray158[arg2.anInt3354] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local57 < 0) {
				local57 = 0;
			}
			arg2.anInt3360 = local57;
		}
		arg2.aClass1_Sub4_Sub1_3.method271(this.method1492(arg2));
		@Pc(124) double local124 = (double) ((arg2.anInt3360 * arg2.anInt3366 >> 12) + (arg2.anInt3362 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(127) Class193 local127 = arg2.aClass193_1;
		arg2.anInt3364 += local127.anInt5903;
		arg2.anInt3355++;
		if (local127.anInt5904 > 0) {
			if (local127.anInt5905 > 0) {
				arg2.anInt3341 += (int) (Math.pow(2.0D, local124 * (double) local127.anInt5905) * 128.0D + 0.5D);
			} else {
				arg2.anInt3341 += 128;
			}
			if (arg2.anInt3341 * local127.anInt5904 >= 819200) {
				local66 = true;
			}
		}
		if (local127.aByteArray76 != null) {
			if (local127.anInt5897 <= 0) {
				arg2.anInt3342 += 128;
			} else {
				arg2.anInt3342 += (int) (Math.pow(2.0D, (double) local127.anInt5897 * local124) * 128.0D + 0.5D);
			}
			while (local127.aByteArray76.length - 2 > arg2.anInt3359 && (local127.aByteArray76[arg2.anInt3359 + 2] & 0xFF) << 8 < arg2.anInt3342) {
				arg2.anInt3359 += 2;
			}
			if (local127.aByteArray76.length - 2 == arg2.anInt3359 && local127.aByteArray76[arg2.anInt3359 + 1] == 0) {
				local66 = true;
			}
		}
		if (arg2.anInt3343 >= 0 && local127.aByteArray75 != null && (this.anIntArray159[arg2.anInt3354] & 0x1) == 0 && (arg2.anInt3346 < 0 || arg2 != this.aClass1_Sub15ArrayArray1[arg2.anInt3354][arg2.anInt3346])) {
			if (local127.anInt5898 <= 0) {
				arg2.anInt3343 += 128;
			} else {
				arg2.anInt3343 += (int) (Math.pow(2.0D, local124 * (double) local127.anInt5898) * 128.0D + 0.5D);
			}
			while (local127.aByteArray75.length - 2 > arg2.anInt3363 && arg2.anInt3343 > (local127.aByteArray75[arg2.anInt3363 + 2] & 0xFF) << 8) {
				arg2.anInt3363 += 2;
			}
			if (arg2.anInt3363 == local127.aByteArray75.length - 2) {
				local66 = true;
			}
		}
		if (!local66) {
			arg2.aClass1_Sub4_Sub1_3.method267(arg2.anInt3352, this.method1476(arg2), this.method1470(arg2));
			return false;
		}
		arg2.aClass1_Sub4_Sub1_3.method259(arg2.anInt3352);
		if (arg1 == null) {
			arg2.aClass1_Sub4_Sub1_3.method4192(arg3);
		} else {
			arg2.aClass1_Sub4_Sub1_3.method4190(arg1, arg0, arg3);
		}
		if (arg2.aClass1_Sub4_Sub1_3.method250()) {
			this.aClass1_Sub4_Sub4_1.aClass1_Sub4_Sub2_1.method775(arg2.aClass1_Sub4_Sub1_3);
		}
		arg2.method2689();
		if (arg2.anInt3343 >= 0) {
			arg2.method4616();
			if (arg2.anInt3346 > 0 && this.aClass1_Sub15ArrayArray1[arg2.anInt3354][arg2.anInt3346] == arg2) {
				this.aClass1_Sub15ArrayArray1[arg2.anInt3354][arg2.anInt3346] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(III)V")
	public synchronized void method1486() {
		this.method1491();
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(BI)V")
	private void method1488(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub15 local16 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method460(); local16 != null; local16 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method464()) {
			if ((arg0 < 0 || local16.anInt3354 == arg0) && local16.anInt3343 < 0) {
				this.aClass1_Sub15ArrayArray2[local16.anInt3354][local16.anInt3362] = null;
				local16.anInt3343 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	private void method1489(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub15 local16 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method460(); local16 != null; local16 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method464()) {
			if (arg0 < 0 || local16.anInt3354 == arg0) {
				if (local16.aClass1_Sub4_Sub1_3 != null) {
					local16.aClass1_Sub4_Sub1_3.method259(Static152.anInt3130 / 100);
					if (local16.aClass1_Sub4_Sub1_3.method250()) {
						this.aClass1_Sub4_Sub4_1.aClass1_Sub4_Sub2_1.method775(local16.aClass1_Sub4_Sub1_3);
					}
					local16.method2689();
				}
				if (local16.anInt3343 < 0) {
					this.aClass1_Sub15ArrayArray2[local16.anInt3354][local16.anInt3362] = null;
				}
				local16.method4616();
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass84_1.method1844()) {
			@Pc(15) int local15 = this.aClass84_1.anInt2305 * this.anInt1830 / Static152.anInt3130;
			do {
				@Pc(24) long local24 = (long) arg2 * (long) local15 + this.aLong72;
				if (this.aLong73 - local24 >= 0L) {
					this.aLong72 = local24;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong73 + (long) local15 - this.aLong72 - 1L) / (long) local15);
				this.aLong72 += (long) local57 * (long) local15;
				arg2 -= local57;
				this.aClass1_Sub4_Sub4_1.method4190(arg0, arg1, local57);
				arg1 += local57;
				this.method1498();
			} while (this.aClass84_1.method1844());
		}
		this.aClass1_Sub4_Sub4_1.method4190(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V")
	public synchronized void method1490() {
		for (@Pc(11) Class1_Sub23 local11 = (Class1_Sub23) this.aClass156_9.method3822(); local11 != null; local11 = (Class1_Sub23) this.aClass156_9.method3820()) {
			local11.method3399();
		}
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(III)V")
	private void method1491() {
		this.anIntArray161[9] = 128;
		this.anIntArray164[9] = 128;
		this.method1500(9, 128);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()Lclient!vc;")
	@Override
	public synchronized Class1_Sub4 method4189() {
		return this.aClass1_Sub4_Sub4_1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!lk;)I")
	private int method1492(@OriginalArg(1) Class1_Sub15 arg0) {
		@Pc(6) Class193 local6 = arg0.aClass193_1;
		@Pc(24) int local24 = arg0.anInt3357 + (arg0.anInt3366 * arg0.anInt3360 >> 12);
		local24 += this.anIntArray149[arg0.anInt3354] * (this.anIntArray156[arg0.anInt3354] - 8192) >> 12;
		@Pc(66) int local66;
		if (local6.anInt5903 > 0 && (local6.anInt5902 > 0 || this.anIntArray151[arg0.anInt3354] > 0)) {
			local66 = local6.anInt5902 << 2;
			@Pc(71) int local71 = local6.anInt5901 << 1;
			if (arg0.anInt3355 < local71) {
				local66 = arg0.anInt3355 * local66 / local71;
			}
			local66 += this.anIntArray151[arg0.anInt3354] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt3364 & 0x1FF) * 0.01227184630308513D);
			local24 += (int) (local102 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub7_Sub1_1.anInt808 * 256) * Math.pow(2.0D, (double) local24 * 3.255208333333333E-4D) / (double) Static152.anInt3130 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	private void method1493(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1489(-1);
		} else {
			this.method1488(-1);
		}
		this.method1482(-1);
		@Pc(23) int local23;
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray160[local23] = this.anIntArray161[local23];
		}
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray164[local23] = this.anIntArray161[local23] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "(I)V")
	public synchronized void method1494() {
		this.method1465(true);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	private void method1495(@OriginalArg(1) int arg0) {
		if ((this.anIntArray159[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub15 local23 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method460(); local23 != null; local23 = (Class1_Sub15) this.aClass1_Sub4_Sub4_1.aClass24_29.method464()) {
			if (local23.anInt3354 == arg0 && this.aClass1_Sub15ArrayArray2[arg0][local23.anInt3362] == null && local23.anInt3343 < 0) {
				local23.anInt3343 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!lk;Z)V")
	public void method1496(@OriginalArg(1) Class1_Sub15 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg0.aClass1_Sub7_Sub1_1.aByteArray5.length;
		@Pc(36) int local36;
		if (arg1 && arg0.aClass1_Sub7_Sub1_1.aBoolean65) {
			@Pc(48) int local48 = local17 + local17 - arg0.aClass1_Sub7_Sub1_1.anInt810;
			local36 = (int) ((long) this.anIntArray153[arg0.anInt3354] * (long) local48 >> 6);
			local17 <<= 0x8;
			if (local17 <= local36) {
				local36 = local17 + local17 - local36 - 1;
				arg0.aClass1_Sub4_Sub1_3.method269();
			}
		} else {
			local36 = (int) ((long) local17 * (long) this.anIntArray153[arg0.anInt3354] >> 6);
		}
		arg0.aClass1_Sub4_Sub1_3.method247(local36);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ph;Lclient!ma;IILclient!on;)Z")
	public synchronized boolean method1497(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class1_Sub16 arg1, @OriginalArg(4) Class131 arg2) {
		@Pc(17) int[] local17 = new int[] { 22050 };
		@Pc(19) boolean local19 = true;
		arg1.method2759();
		for (@Pc(34) Class1_Sub9 local34 = (Class1_Sub9) arg1.aClass156_14.method3822(); local34 != null; local34 = (Class1_Sub9) arg1.aClass156_14.method3820()) {
			@Pc(40) int local40 = (int) local34.aLong223;
			@Pc(48) Class1_Sub23 local48 = (Class1_Sub23) this.aClass156_9.method3821((long) local40);
			if (local48 == null) {
				local48 = Static269.method417(local40, arg0);
				if (local48 == null) {
					local19 = false;
					continue;
				}
				this.aClass156_9.method3816((long) local40, local48);
			}
			if (!local48.method3397(local34.aByteArray8, arg2, local17)) {
				local19 = false;
			}
		}
		if (local19) {
			arg1.method2760();
		}
		return local19;
	}

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "(I)V")
	private void method1498() {
		@Pc(4) int local4 = this.anInt1870;
		@Pc(11) long local11 = this.aLong73;
		@Pc(18) int local18 = this.anInt1871;
		if (this.aClass1_Sub16_1 != null && this.anInt1872 == local18) {
			this.method1466(this.aBoolean142, this.aClass1_Sub16_1, this.aBoolean141);
			this.method1498();
			return;
		}
		while (local18 == this.anInt1871) {
			while (this.aClass84_1.anIntArray189[local4] == local18) {
				this.aClass84_1.method1852(local4);
				@Pc(63) int local63 = this.aClass84_1.method1858(local4);
				if (local63 == 1) {
					this.aClass84_1.method1850();
					this.aClass84_1.method1856(local4);
					if (this.aClass84_1.method1849()) {
						if (this.aClass1_Sub16_1 != null) {
							this.method1467(this.aBoolean141, this.aClass1_Sub16_1);
							this.method1498();
							return;
						}
						if (!this.aBoolean141 || local18 == 0) {
							this.method1493(true);
							this.aClass84_1.method1848();
							return;
						}
						this.aClass84_1.method1857(local11);
					}
					break;
				}
				if ((local63 & 0x80) != 0) {
					this.method1469(local63);
				}
				this.aClass84_1.method1853(local4);
				this.aClass84_1.method1856(local4);
			}
			local4 = this.aClass84_1.method1854();
			local18 = this.aClass84_1.anIntArray189[local4];
			local11 = this.aClass84_1.method1845(local18);
		}
		this.aLong73 = local11;
		this.anInt1871 = local18;
		this.anInt1870 = local4;
		if (this.aClass1_Sub16_1 != null && local18 > this.anInt1872) {
			this.anInt1870 = -1;
			this.anInt1871 = this.anInt1872;
			this.aLong73 = this.aClass84_1.method1845(this.anInt1871);
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IB)V")
	public synchronized void method1499(@OriginalArg(0) int arg0) {
		this.anInt1846 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(III)V")
	private void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray160[arg0] != arg1) {
			this.anIntArray160[arg0] = arg1;
			for (@Pc(23) int local23 = 0; local23 < 128; local23++) {
				this.aClass1_Sub15ArrayArray1[arg0][local23] = null;
			}
		}
	}
}
