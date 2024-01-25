import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class6_Sub12_Sub1 extends Class6_Sub12 {

	@OriginalMember(owner = "client!fh", name = "Bb", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!fh", name = "Cb", descriptor = "Z")
	private boolean aBoolean116;

	@OriginalMember(owner = "client!fh", name = "Db", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!fh", name = "Eb", descriptor = "I")
	private int anInt1589;

	@OriginalMember(owner = "client!fh", name = "Fb", descriptor = "I")
	private int anInt1590;

	@OriginalMember(owner = "client!fh", name = "Gb", descriptor = "Lclient!ms;")
	private Class6_Sub27 aClass6_Sub27_1;

	@OriginalMember(owner = "client!fh", name = "Hb", descriptor = "I")
	private int anInt1591;

	@OriginalMember(owner = "client!fh", name = "Ib", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "[I")
	private final int[] anIntArray174 = new int[16];

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "[I")
	private final int[] anIntArray175 = new int[16];

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "[I")
	private final int[] anIntArray177 = new int[16];

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "[I")
	public final int[] anIntArray176 = new int[16];

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "[I")
	private final int[] anIntArray171 = new int[16];

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "[I")
	private final int[] anIntArray172 = new int[16];

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "[I")
	private final int[] anIntArray179 = new int[16];

	@OriginalMember(owner = "client!fh", name = "fb", descriptor = "[I")
	private final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	private final int anInt1559 = 1000000;

	@OriginalMember(owner = "client!fh", name = "nb", descriptor = "[[Lclient!ea;")
	private final Class6_Sub9[][] aClass6_Sub9ArrayArray1 = new Class6_Sub9[16][128];

	@OriginalMember(owner = "client!fh", name = "kb", descriptor = "[I")
	private final int[] anIntArray183 = new int[16];

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
	private int anInt1563 = 256;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "[I")
	private final int[] anIntArray173 = new int[16];

	@OriginalMember(owner = "client!fh", name = "sb", descriptor = "[I")
	public final int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!fh", name = "gb", descriptor = "[I")
	private final int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!fh", name = "Z", descriptor = "[I")
	private final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!fh", name = "qb", descriptor = "[I")
	private final int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!fh", name = "jb", descriptor = "[I")
	private final int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!fh", name = "vb", descriptor = "[[Lclient!ea;")
	private final Class6_Sub9[][] aClass6_Sub9ArrayArray2 = new Class6_Sub9[16][128];

	@OriginalMember(owner = "client!fh", name = "rb", descriptor = "[I")
	public final int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "Lclient!rf;")
	private final Class176 aClass176_1 = new Class176();

	@OriginalMember(owner = "client!fh", name = "Ab", descriptor = "Lclient!hr;")
	private final Class6_Sub12_Sub2 aClass6_Sub12_Sub2_1 = new Class6_Sub12_Sub2(this);

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "Lclient!jj;")
	private final Class108 aClass108_16 = new Class108(128);

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class6_Sub12_Sub1() {
		this.method1467();
		this.method1437(true);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5656() {
		return 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ea;I)I")
	private int method1435(@OriginalArg(0) Class6_Sub9 arg0) {
		@Pc(14) int local14 = (arg0.anInt1234 * arg0.anInt1217 >> 12) + arg0.anInt1221;
		local14 += (this.anIntArray173[arg0.anInt1233] - 8192) * this.anIntArray177[arg0.anInt1233] >> 12;
		@Pc(40) Class195 local40 = arg0.aClass195_1;
		@Pc(63) int local63;
		if (local40.anInt5845 > 0 && (local40.anInt5847 > 0 || this.anIntArray182[arg0.anInt1233] > 0)) {
			local63 = local40.anInt5847 << 2;
			@Pc(68) int local68 = local40.anInt5842 << 1;
			if (local68 > arg0.anInt1212) {
				local63 = local63 * arg0.anInt1212 / local68;
			}
			local63 += this.anIntArray182[arg0.anInt1233] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt1215 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local98 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass6_Sub11_Sub1_1.anInt2222 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static22.anInt358 + 0.5D);
		return local63 >= 1 ? local63 : 1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIB)V")
	private void method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class6_Sub9 local12 = this.aClass6_Sub9ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub9ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray186[arg1] & 0x2) == 0) {
			local12.anInt1230 = 0;
			return;
		}
		for (@Pc(46) Class6_Sub9 local46 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5594(); local46 != null; local46 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5582()) {
			if (local12.anInt1233 == local46.anInt1233 && local46.anInt1230 < 0 && local12 != local46) {
				local12.anInt1230 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
	private void method1437(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1445(-1);
		} else {
			this.method1440(-1);
		}
		this.method1458(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray171[local31] = this.anIntArray180[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray179[local47] = this.anIntArray180[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ea;)I")
	private int method1438(@OriginalArg(1) Class6_Sub9 arg0) {
		@Pc(9) int local9 = this.anIntArray183[arg0.anInt1233];
		return local9 < 8192 ? local9 * arg0.anInt1223 + 32 >> 6 : 16384 - ((128 - arg0.anInt1223) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	private void method1440(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class6_Sub9 local8 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5594(); local8 != null; local8 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5582()) {
			if ((arg0 < 0 || arg0 == local8.anInt1233) && local8.anInt1230 < 0) {
				this.aClass6_Sub9ArrayArray1[local8.anInt1233][local8.anInt1231] = null;
				local8.anInt1230 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
	private void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([IIIILclient!ea;)Z")
	public boolean method1442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub9 arg3) {
		arg3.anInt1235 = Static22.anInt358 / 100;
		if (arg3.anInt1230 >= 0 && (arg3.aClass6_Sub12_Sub4_1 == null || arg3.aClass6_Sub12_Sub4_1.method5660())) {
			arg3.method1122();
			arg3.method5756();
			if (arg3.anInt1211 > 0 && this.aClass6_Sub9ArrayArray2[arg3.anInt1233][arg3.anInt1211] == arg3) {
				this.aClass6_Sub9ArrayArray2[arg3.anInt1233][arg3.anInt1211] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt1234;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray184[arg3.anInt1233] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt1234 = local56;
		}
		arg3.aClass6_Sub12_Sub4_1.method5685(this.method1435(arg3));
		@Pc(98) Class195 local98 = arg3.aClass195_1;
		arg3.anInt1212++;
		@Pc(106) boolean local106 = false;
		arg3.anInt1215 += local98.anInt5845;
		@Pc(131) double local131 = (double) ((arg3.anInt1234 * arg3.anInt1217 >> 12) + (arg3.anInt1231 - 60 << 8)) * 5.086263020833333E-6D;
		if (local98.anInt5843 > 0) {
			if (local98.anInt5849 > 0) {
				arg3.anInt1213 += (int) (Math.pow(2.0D, (double) local98.anInt5849 * local131) * 128.0D + 0.5D);
			} else {
				arg3.anInt1213 += 128;
			}
			if (arg3.anInt1213 * local98.anInt5843 >= 819200) {
				local106 = true;
			}
		}
		if (local98.aByteArray91 != null) {
			if (local98.anInt5846 <= 0) {
				arg3.anInt1228 += 128;
			} else {
				arg3.anInt1228 += (int) (Math.pow(2.0D, (double) local98.anInt5846 * local131) * 128.0D + 0.5D);
			}
			while (local98.aByteArray91.length - 2 > arg3.anInt1236 && (local98.aByteArray91[arg3.anInt1236 + 2] & 0xFF) << 8 < arg3.anInt1228) {
				arg3.anInt1236 += 2;
			}
			if (local98.aByteArray91.length - 2 == arg3.anInt1236 && local98.aByteArray91[arg3.anInt1236 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg3.anInt1230 >= 0 && local98.aByteArray90 != null && (this.anIntArray186[arg3.anInt1233] & 0x1) == 0 && (arg3.anInt1211 < 0 || arg3 != this.aClass6_Sub9ArrayArray2[arg3.anInt1233][arg3.anInt1211])) {
			if (local98.anInt5844 > 0) {
				arg3.anInt1230 += (int) (Math.pow(2.0D, (double) local98.anInt5844 * local131) * 128.0D + 0.5D);
			} else {
				arg3.anInt1230 += 128;
			}
			while (local98.aByteArray90.length - 2 > arg3.anInt1227 && arg3.anInt1230 > (local98.aByteArray90[arg3.anInt1227 + 2] & 0xFF) << 8) {
				arg3.anInt1227 += 2;
			}
			if (arg3.anInt1227 == local98.aByteArray90.length - 2) {
				local106 = true;
			}
		}
		if (!local106) {
			arg3.aClass6_Sub12_Sub4_1.method5677(arg3.anInt1235, this.method1448(arg3), this.method1438(arg3));
			return false;
		}
		arg3.aClass6_Sub12_Sub4_1.method5695(arg3.anInt1235);
		if (arg0 == null) {
			arg3.aClass6_Sub12_Sub4_1.method5654(arg2);
		} else {
			arg3.aClass6_Sub12_Sub4_1.method5657(arg0, arg1, arg2);
		}
		if (arg3.aClass6_Sub12_Sub4_1.method5672()) {
			this.aClass6_Sub12_Sub2_1.aClass6_Sub12_Sub3_4.method4904(arg3.aClass6_Sub12_Sub4_1);
		}
		arg3.method1122();
		if (arg3.anInt1230 >= 0) {
			arg3.method5756();
			if (arg3.anInt1211 > 0 && this.aClass6_Sub9ArrayArray2[arg3.anInt1233][arg3.anInt1211] == arg3) {
				this.aClass6_Sub9ArrayArray2[arg3.anInt1233][arg3.anInt1211] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()Lclient!wm;")
	@Override
	public synchronized Class6_Sub12 method5652() {
		return this.aClass6_Sub12_Sub2_1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	private void method1443(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1436(local24, local18, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1436(local24, local18, 64);
			} else {
				this.method1462(local24, local30, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1441(local18, local30, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray179[local18] = (this.anIntArray179[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray179[local18] = (this.anIntArray179[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray182[local18] = (this.anIntArray182[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray182[local18] = (this.anIntArray182[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray184[local18] = (this.anIntArray184[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray184[local18] = local30 + (this.anIntArray184[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray172[local18] = (local30 << 7) + (this.anIntArray172[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray172[local18] = (this.anIntArray172[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray183[local18] = (this.anIntArray183[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray183[local18] = (this.anIntArray183[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray181[local18] = (this.anIntArray181[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray181[local18] = local30 + (this.anIntArray181[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray186[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray186[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray186[local18] |= 0x2;
				} else {
					this.method1455(local18);
					this.anIntArray186[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray178[local18] = (local30 << 7) + (this.anIntArray178[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray178[local18] = local30 + (this.anIntArray178[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray178[local18] = (this.anIntArray178[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray178[local18] = local30 + (this.anIntArray178[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1445(local18);
			}
			if (local24 == 121) {
				this.method1458(local18);
			}
			if (local24 == 123) {
				this.method1440(local18);
			}
			@Pc(513) int local513;
			if (local24 == 6) {
				local513 = this.anIntArray178[local18];
				if (local513 == 16384) {
					this.anIntArray177[local18] = (this.anIntArray177[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local513 = this.anIntArray178[local18];
				if (local513 == 16384) {
					this.anIntArray177[local18] = local30 + (this.anIntArray177[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray176[local18] = (local30 << 7) + (this.anIntArray176[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray176[local18] = local30 + (this.anIntArray176[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray186[local18] |= 0x4;
				} else {
					this.method1464(local18);
					this.anIntArray186[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1461(local18, (local30 << 7) + (this.anIntArray175[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method1461(local18, local30 + (this.anIntArray175[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1463(local18, this.anIntArray179[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1460(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1459(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1437(true);
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZBLclient!ms;)V")
	public synchronized void method1444(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub27 arg1) {
		this.method1452(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V")
	private void method1445(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class6_Sub9 local16 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5594(); local16 != null; local16 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5582()) {
			if (arg0 < 0 || local16.anInt1233 == arg0) {
				if (local16.aClass6_Sub12_Sub4_1 != null) {
					local16.aClass6_Sub12_Sub4_1.method5695(Static22.anInt358 / 100);
					if (local16.aClass6_Sub12_Sub4_1.method5672()) {
						this.aClass6_Sub12_Sub2_1.aClass6_Sub12_Sub3_4.method4904(local16.aClass6_Sub12_Sub4_1);
					}
					local16.method1122();
				}
				if (local16.anInt1230 < 0) {
					this.aClass6_Sub9ArrayArray1[local16.anInt1233][local16.anInt1231] = null;
				}
				local16.method5756();
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)V")
	public synchronized void method1446(@OriginalArg(1) int arg0) {
		this.anInt1563 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)V")
	public synchronized void method1447() {
		for (@Pc(9) Class6_Sub26 local9 = (Class6_Sub26) this.aClass108_16.method2903(); local9 != null; local9 = (Class6_Sub26) this.aClass108_16.method2905()) {
			local9.method3597();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ILclient!ea;)I")
	private int method1448(@OriginalArg(1) Class6_Sub9 arg0) {
		if (this.anIntArray174[arg0.anInt1233] == 0) {
			return 0;
		}
		@Pc(17) Class195 local17 = arg0.aClass195_1;
		@Pc(33) int local33 = this.anIntArray172[arg0.anInt1233] * this.anIntArray181[arg0.anInt1233] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt1224 * local41 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt1563 + 128 >> 8;
		local33 = local59 * this.anIntArray174[arg0.anInt1233] + 128 >> 8;
		if (local17.anInt5843 > 0) {
			local33 = (int) ((double) local33 * Math.pow(0.5D, (double) arg0.anInt1213 * 1.953125E-5D * (double) local17.anInt5843) + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(124) int local124;
		@Pc(136) int local136;
		if (local17.aByteArray91 != null) {
			local98 = arg0.anInt1228;
			local106 = local17.aByteArray91[arg0.anInt1236 + 1];
			if (local17.aByteArray91.length - 2 > arg0.anInt1236) {
				local124 = (local17.aByteArray91[arg0.anInt1236] & 0xFF) << 8;
				local136 = (local17.aByteArray91[arg0.anInt1236 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (-local106 + local17.aByteArray91[arg0.anInt1236 + 3]) / (local136 - local124);
			}
			local33 = local106 * local33 + 32 >> 6;
		}
		if (arg0.anInt1230 > 0 && local17.aByteArray90 != null) {
			local98 = arg0.anInt1230;
			local106 = local17.aByteArray90[arg0.anInt1227 + 1];
			if (local17.aByteArray90.length - 2 > arg0.anInt1227) {
				local124 = (local17.aByteArray90[arg0.anInt1227] & 0xFF) << 8;
				local136 = (local17.aByteArray90[arg0.anInt1227 + 2] & 0xFF) << 8;
				local106 += (local98 - local124) * (local17.aByteArray90[arg0.anInt1227 + 3] + -local106) / (local136 - local124);
			}
			local33 = local33 * local106 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public synchronized void method1449() {
		this.method1456();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lclient!ea;I)Z")
	public boolean method1450(@OriginalArg(0) Class6_Sub9 arg0) {
		if (arg0.aClass6_Sub12_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1230 >= 0) {
			arg0.method5756();
			if (arg0.anInt1211 > 0 && arg0 == this.aClass6_Sub9ArrayArray2[arg0.anInt1233][arg0.anInt1211]) {
				this.aClass6_Sub9ArrayArray2[arg0.anInt1233][arg0.anInt1211] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()Lclient!wm;")
	@Override
	public synchronized Class6_Sub12 method5655() {
		return null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	private void method1451() {
		@Pc(12) int local12 = this.anInt1589;
		@Pc(15) int local15 = this.anInt1590;
		@Pc(18) long local18 = this.aLong54;
		if (this.aClass6_Sub27_1 != null && local15 == this.anInt1591) {
			this.method1452(this.aBoolean116, this.aClass6_Sub27_1, this.aBoolean117);
			this.method1451();
			return;
		}
		while (this.anInt1590 == local15) {
			while (local15 == this.aClass176_1.anIntArray545[local12]) {
				this.aClass176_1.method4612(local12);
				@Pc(47) int local47 = this.aClass176_1.method4615(local12);
				if (local47 == 1) {
					this.aClass176_1.method4609();
					this.aClass176_1.method4608(local12);
					if (this.aClass176_1.method4606()) {
						if (this.aClass6_Sub27_1 != null) {
							this.method1444(this.aBoolean116, this.aClass6_Sub27_1);
							this.method1451();
							return;
						}
						if (!this.aBoolean116 || local15 == 0) {
							this.method1437(true);
							this.aClass176_1.method4605();
							return;
						}
						this.aClass176_1.method4613(local18);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1443(local47);
				}
				this.aClass176_1.method4610(local12);
				this.aClass176_1.method4608(local12);
			}
			local12 = this.aClass176_1.method4617();
			local15 = this.aClass176_1.anIntArray545[local12];
			local18 = this.aClass176_1.method4611(local15);
		}
		this.anInt1590 = local15;
		this.aLong54 = local18;
		this.anInt1589 = local12;
		if (this.aClass6_Sub27_1 != null && local15 > this.anInt1591) {
			this.anInt1589 = -1;
			this.anInt1590 = this.anInt1591;
			this.aLong54 = this.aClass176_1.method4611(this.anInt1590);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass176_1.method4607()) {
			@Pc(14) int local14 = this.aClass176_1.anInt5046 * this.anInt1559 / Static22.anInt358;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong55;
				if (this.aLong54 - local23 >= 0L) {
					this.aLong55 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong54 - this.aLong55 - 1L) / (long) local14);
				this.aLong55 += (long) local52 * (long) local14;
				this.aClass6_Sub12_Sub2_1.method5657(arg0, arg1, local52);
				arg2 -= local52;
				this.method1451();
				arg1 += local52;
			} while (this.aClass176_1.method4607());
		}
		this.aClass6_Sub12_Sub2_1.method5657(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLclient!ms;IZ)V")
	private synchronized void method1452(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub27 arg1, @OriginalArg(3) boolean arg2) {
		this.method1466(arg2);
		this.aClass176_1.method4616(arg1.aByteArray64);
		this.aLong55 = 0;
		this.aBoolean116 = arg0;
		@Pc(25) int local25 = this.aClass176_1.method4603();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass176_1.method4612(local27);
			this.aClass176_1.method4610(local27);
			this.aClass176_1.method4608(local27);
		}
		this.anInt1589 = this.aClass176_1.method4617();
		this.anInt1590 = this.aClass176_1.anIntArray545[this.anInt1589];
		this.aLong54 = this.aClass176_1.method4611(this.anInt1590);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ea;IZ)V")
	public void method1453(@OriginalArg(0) Class6_Sub9 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass6_Sub11_Sub1_1.aByteArray47.length;
		@Pc(48) int local48;
		if (arg1 && arg0.aClass6_Sub11_Sub1_1.aBoolean188) {
			@Pc(31) int local31 = local8 + local8 - arg0.aClass6_Sub11_Sub1_1.anInt2220;
			local8 <<= 0x8;
			local48 = (int) ((long) this.anIntArray176[arg0.anInt1233] * (long) local31 >> 6);
			if (local48 >= local8) {
				arg0.aClass6_Sub12_Sub4_1.method5683();
				local48 = local8 + local8 - local48 - 1;
			}
		} else {
			local48 = (int) ((long) local8 * (long) this.anIntArray176[arg0.anInt1233] >> 6);
		}
		arg0.aClass6_Sub12_Sub4_1.method5696(local48);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!wc;Lclient!ms;Lclient!dp;BI)Z")
	public synchronized boolean method1454(@OriginalArg(0) Class213 arg0, @OriginalArg(1) Class6_Sub27 arg1, @OriginalArg(2) Class53 arg2) {
		arg1.method3653();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class6_Sub16 local29 = (Class6_Sub16) arg1.aClass108_23.method2903(); local29 != null; local29 = (Class6_Sub16) arg1.aClass108_23.method2905()) {
			@Pc(35) int local35 = (int) local29.aLong218;
			@Pc(43) Class6_Sub26 local43 = (Class6_Sub26) this.aClass108_16.method2900((long) local35);
			if (local43 == null) {
				local43 = Static158.method5098(local35, arg2);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass108_16.method2898((long) local35, local43);
			}
			if (!local43.method3595(local23, arg0, local29.aByteArray46)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method3652();
		}
		return local9;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(II)V")
	private void method1455(@OriginalArg(0) int arg0) {
		if ((this.anIntArray186[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub9 local22 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5594(); local22 != null; local22 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5582()) {
			if (arg0 == local22.anInt1233 && this.aClass6_Sub9ArrayArray1[arg0][local22.anInt1231] == null && local22.anInt1230 < 0) {
				local22.anInt1230 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
	private void method1456() {
		this.anIntArray180[9] = 128;
		this.anIntArray179[9] = 128;
		this.method1463(9, 128);
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
	public int method1457() {
		return this.anInt1563;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
	private void method1458(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1458(local12);
			}
			return;
		}
		this.anIntArray172[arg0] = 12800;
		this.anIntArray183[arg0] = 8192;
		this.anIntArray181[arg0] = 16383;
		this.anIntArray173[arg0] = 8192;
		this.anIntArray182[arg0] = 0;
		this.anIntArray184[arg0] = 8192;
		this.method1455(arg0);
		this.method1464(arg0);
		this.anIntArray186[arg0] = 0;
		this.anIntArray178[arg0] = 32767;
		this.anIntArray177[arg0] = 256;
		this.anIntArray176[arg0] = 0;
		this.method1461(arg0, 8192);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
	private void method1459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray173[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
	private void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(III)V")
	private void method1461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray175[arg0] = arg1;
		this.anIntArray185[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5654(@OriginalArg(0) int arg0) {
		if (this.aClass176_1.method4607()) {
			@Pc(14) int local14 = this.anInt1559 * this.aClass176_1.anInt5046 / Static22.anInt358;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong55;
				if (this.aLong54 - local23 >= 0L) {
					this.aLong55 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong54 - this.aLong55 - 1L) / (long) local14);
				this.aLong55 += (long) local53 * (long) local14;
				arg0 -= local53;
				this.aClass6_Sub12_Sub2_1.method5654(local53);
				this.method1451();
			} while (this.aClass176_1.method4607());
		}
		this.aClass6_Sub12_Sub2_1.method5654(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBI)V")
	private void method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1436(arg0, arg2, 64);
		if ((this.anIntArray186[arg2] & 0x2) != 0) {
			for (@Pc(25) Class6_Sub9 local25 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5590(); local25 != null; local25 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5593()) {
				if (local25.anInt1233 == arg2 && local25.anInt1230 < 0) {
					this.aClass6_Sub9ArrayArray1[arg2][local25.anInt1231] = null;
					this.aClass6_Sub9ArrayArray1[arg2][arg0] = local25;
					@Pc(65) int local65 = local25.anInt1221 + (local25.anInt1217 * local25.anInt1234 >> 12);
					local25.anInt1221 += arg0 - local25.anInt1231 << 8;
					local25.anInt1217 = local65 - local25.anInt1221;
					local25.anInt1234 = 4096;
					local25.anInt1231 = arg0;
					return;
				}
			}
		}
		@Pc(111) Class6_Sub26 local111 = (Class6_Sub26) this.aClass108_16.method2900((long) this.anIntArray171[arg2]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class6_Sub11_Sub1 local119 = local111.aClass6_Sub11_Sub1Array1[arg0];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class6_Sub9 local126 = new Class6_Sub9();
		local126.aClass6_Sub11_Sub1_1 = local119;
		local126.aClass6_Sub26_1 = local111;
		local126.anInt1233 = arg2;
		local126.aClass195_1 = local111.aClass195Array1[arg0];
		local126.anInt1211 = local111.aByteArray60[arg0];
		local126.anInt1231 = arg0;
		local126.anInt1224 = arg1 * arg1 * local111.anInt3655 * local111.aByteArray62[arg0] + 1024 >> 11;
		local126.anInt1223 = local111.aByteArray61[arg0] & 0xFF;
		local126.anInt1221 = (arg0 << 8) - (local111.aShortArray69[arg0] & 0x7FFF);
		local126.anInt1236 = 0;
		local126.anInt1230 = -1;
		local126.anInt1228 = 0;
		local126.anInt1213 = 0;
		local126.anInt1227 = 0;
		if (this.anIntArray176[arg2] == 0) {
			local126.aClass6_Sub12_Sub4_1 = Static369.method5661(local119, this.method1435(local126), this.method1448(local126), this.method1438(local126));
		} else {
			local126.aClass6_Sub12_Sub4_1 = Static369.method5661(local119, this.method1435(local126), 0, this.method1438(local126));
			this.method1453(local126, local111.aShortArray69[arg0] < 0);
		}
		if (local111.aShortArray69[arg0] < 0) {
			local126.aClass6_Sub12_Sub4_1.method5675(-1);
		}
		if (local126.anInt1211 >= 0) {
			@Pc(281) Class6_Sub9 local281 = this.aClass6_Sub9ArrayArray2[arg2][local126.anInt1211];
			if (local281 != null && local281.anInt1230 < 0) {
				this.aClass6_Sub9ArrayArray1[arg2][local281.anInt1231] = null;
				local281.anInt1230 = 0;
			}
			this.aClass6_Sub9ArrayArray2[arg2][local126.anInt1211] = local126;
		}
		this.aClass6_Sub12_Sub2_1.aClass211_21.method5585(local126);
		this.aClass6_Sub9ArrayArray1[arg2][arg0] = local126;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)V")
	private void method1463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray171[arg0]) {
			this.anIntArray171[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass6_Sub9ArrayArray2[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)V")
	private void method1464(@OriginalArg(0) int arg0) {
		if ((this.anIntArray186[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class6_Sub9 local15 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5594(); local15 != null; local15 = (Class6_Sub9) this.aClass6_Sub12_Sub2_1.aClass211_21.method5582()) {
			if (arg0 == local15.anInt1233) {
				local15.anInt1225 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)V")
	public synchronized void method1465() {
		for (@Pc(15) Class6_Sub26 local15 = (Class6_Sub26) this.aClass108_16.method2903(); local15 != null; local15 = (Class6_Sub26) this.aClass108_16.method2905()) {
			local15.method5756();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZ)V")
	private synchronized void method1466(@OriginalArg(1) boolean arg0) {
		this.aClass176_1.method4605();
		this.aClass6_Sub27_1 = null;
		this.method1437(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(III)V")
	private synchronized void method1467() {
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			this.anIntArray174[local17] = 256;
		}
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)Z")
	public synchronized boolean method1468() {
		return this.aClass176_1.method4607();
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)V")
	public synchronized void method1469() {
		this.method1466(true);
	}
}
