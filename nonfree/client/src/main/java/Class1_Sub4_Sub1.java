import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bh", name = "Ob", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bh", name = "Pb", descriptor = "Z")
	private boolean aBoolean18;

	@OriginalMember(owner = "client!bh", name = "Qb", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!bh", name = "Rb", descriptor = "J")
	private long aLong19;

	@OriginalMember(owner = "client!bh", name = "Tb", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "[I")
	private int[] anIntArray22 = new int[16];

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "[I")
	public int[] anIntArray23 = new int[16];

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[[Lclient!bc;")
	private Class1_Sub3[][] aClass1_Sub3ArrayArray1 = new Class1_Sub3[16][128];

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
	private int anInt462 = 1000000;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "[I")
	private int[] anIntArray21 = new int[16];

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "[I")
	private int[] anIntArray28 = new int[16];

	@OriginalMember(owner = "client!bh", name = "nb", descriptor = "I")
	private int anInt473 = 256;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "[I")
	private int[] anIntArray26 = new int[16];

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "[I")
	private int[] anIntArray25 = new int[16];

	@OriginalMember(owner = "client!bh", name = "qb", descriptor = "[I")
	private int[] anIntArray31 = new int[16];

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "[I")
	public int[] anIntArray24 = new int[16];

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "[[Lclient!bc;")
	private Class1_Sub3[][] aClass1_Sub3ArrayArray2 = new Class1_Sub3[16][128];

	@OriginalMember(owner = "client!bh", name = "gb", descriptor = "[I")
	private int[] anIntArray29 = new int[16];

	@OriginalMember(owner = "client!bh", name = "Hb", descriptor = "[I")
	public int[] anIntArray33 = new int[16];

	@OriginalMember(owner = "client!bh", name = "Jb", descriptor = "[I")
	private int[] anIntArray34 = new int[16];

	@OriginalMember(owner = "client!bh", name = "pb", descriptor = "[I")
	private int[] anIntArray30 = new int[16];

	@OriginalMember(owner = "client!bh", name = "yb", descriptor = "[I")
	private int[] anIntArray32 = new int[16];

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "[I")
	private int[] anIntArray27 = new int[16];

	@OriginalMember(owner = "client!bh", name = "Nb", descriptor = "[I")
	private int[] anIntArray35 = new int[16];

	@OriginalMember(owner = "client!bh", name = "sb", descriptor = "Lclient!df;")
	private Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!bh", name = "Sb", descriptor = "Lclient!gi;")
	private Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1 = new Class1_Sub4_Sub2(this);

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Lclient!sc;")
	private Class102 aClass102_1 = new Class102(128);

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub1() {
		this.method371();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZILclient!bc;)V")
	public void method361(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub6_Sub1_1.aByteArray32.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass1_Sub6_Sub1_1.aBoolean142) {
			@Pc(42) int local42 = local8 + local8 - arg1.aClass1_Sub6_Sub1_1.anInt3210;
			local8 <<= 0x8;
			local31 = (int) ((long) this.anIntArray33[arg1.anInt352] * (long) local42 >> 6);
			if (local31 >= local8) {
				arg1.aClass1_Sub4_Sub4_1.method2372();
				local31 = local8 + local8 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local8 * (long) this.anIntArray33[arg1.anInt352] >> 6);
		}
		arg1.aClass1_Sub4_Sub4_1.method2365(local31);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V")
	public synchronized void method362(@OriginalArg(1) int arg0) {
		this.anInt473 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)V")
	private void method363(@OriginalArg(1) int arg0) {
		if ((this.anIntArray24[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class1_Sub3 local19 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3120(); local19 != null; local19 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3109()) {
			if (arg0 == local19.anInt352 && this.aClass1_Sub3ArrayArray2[arg0][local19.anInt366] == null && local19.anInt369 < 0) {
				local19.anInt369 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBII)V")
	private void method364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method380(arg1, arg2, 64);
		if ((this.anIntArray24[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub3 local28 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3112(); local28 != null; local28 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3111()) {
				if (local28.anInt352 == arg1 && local28.anInt369 < 0) {
					this.aClass1_Sub3ArrayArray2[arg1][local28.anInt366] = null;
					this.aClass1_Sub3ArrayArray2[arg1][arg2] = local28;
					@Pc(70) int local70 = (local28.anInt361 * local28.anInt364 >> 12) + local28.anInt359;
					local28.anInt361 = 4096;
					local28.anInt359 += arg2 - local28.anInt366 << 8;
					local28.anInt364 = local70 - local28.anInt359;
					local28.anInt366 = arg2;
					return;
				}
			}
		}
		@Pc(116) Class1_Sub9 local116 = (Class1_Sub9) this.aClass102_1.method3093((long) this.anIntArray26[arg1]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class1_Sub6_Sub1 local124 = local116.aClass1_Sub6_Sub1Array1[arg2];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class1_Sub3 local131 = new Class1_Sub3();
		local131.anInt352 = arg1;
		local131.aClass1_Sub9_1 = local116;
		local131.aClass1_Sub6_Sub1_1 = local124;
		local131.aClass13_1 = local116.aClass13Array1[arg2];
		local131.anInt367 = local116.aByteArray12[arg2];
		local131.anInt366 = arg2;
		local131.anInt372 = local116.aByteArray11[arg2] * arg0 * arg0 * local116.anInt1276 + 1024 >> 11;
		local131.anInt365 = local116.aByteArray13[arg2] & 0xFF;
		local131.anInt359 = (arg2 << 8) - (local116.aShortArray8[arg2] & 0x7FFF);
		local131.anInt369 = -1;
		local131.anInt353 = 0;
		local131.anInt363 = 0;
		local131.anInt362 = 0;
		local131.anInt375 = 0;
		if (this.anIntArray33[arg1] == 0) {
			local131.aClass1_Sub4_Sub4_1 = Static237.method2378(local124, this.method368(local131), this.method372(local131), this.method384(local131));
		} else {
			local131.aClass1_Sub4_Sub4_1 = Static237.method2378(local124, this.method368(local131), 0, this.method384(local131));
			this.method361(local116.aShortArray8[arg2] < 0, local131);
		}
		if (local116.aShortArray8[arg2] < 0) {
			local131.aClass1_Sub4_Sub4_1.method2389(-1);
		}
		if (local131.anInt367 >= 0) {
			@Pc(287) Class1_Sub3 local287 = this.aClass1_Sub3ArrayArray1[arg1][local131.anInt367];
			if (local287 != null && local287.anInt369 < 0) {
				this.aClass1_Sub3ArrayArray2[arg1][local287.anInt366] = null;
				local287.anInt369 = 0;
			}
			this.aClass1_Sub3ArrayArray1[arg1][local131.anInt367] = local131;
		}
		this.aClass1_Sub4_Sub2_1.aClass105_9.method3119(local131);
		this.aClass1_Sub3ArrayArray2[arg1][arg2] = local131;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	public synchronized void method366() {
		for (@Pc(17) Class1_Sub9 local17 = (Class1_Sub9) this.aClass102_1.method3086(); local17 != null; local17 = (Class1_Sub9) this.aClass102_1.method3087()) {
			local17.method3758();
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2355(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass29_1.method709()) {
			@Pc(18) int local18 = this.anInt462 * this.aClass29_1.anInt969 / Static31.anInt702;
			do {
				@Pc(28) long local28 = this.aLong19 + (long) arg2 * (long) local18;
				if (this.aLong18 - local28 >= 0L) {
					this.aLong19 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong18 - this.aLong19 - 1L) / (long) local18);
				arg2 -= local57;
				this.aLong19 += (long) local18 * (long) local57;
				this.aClass1_Sub4_Sub2_1.method2355(arg0, arg1, local57);
				arg1 += local57;
				this.method393();
			} while (this.aClass29_1.method709());
		}
		this.aClass1_Sub4_Sub2_1.method2355(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!bc;)I")
	private int method368(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(14) int local14 = (arg0.anInt361 * arg0.anInt364 >> 12) + arg0.anInt359;
		local14 += this.anIntArray22[arg0.anInt352] * (this.anIntArray32[arg0.anInt352] - 8192) >> 12;
		@Pc(35) Class13 local35 = arg0.aClass13_1;
		@Pc(66) int local66;
		if (local35.anInt381 > 0 && (local35.anInt389 > 0 || this.anIntArray30[arg0.anInt352] > 0)) {
			local66 = local35.anInt389 << 2;
			@Pc(71) int local71 = local35.anInt382 << 1;
			if (arg0.anInt351 < local71) {
				local66 = local66 * arg0.anInt351 / local71;
			}
			local66 += this.anIntArray30[arg0.anInt352] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt368 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local66 * local101);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub6_Sub1_1.anInt3211 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static31.anInt702 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)V")
	private void method369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	private void method370() {
		this.anIntArray25[9] = 128;
		this.anIntArray29[9] = 128;
		this.method387(9, 128);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
	private void method371() {
		this.method391(-1);
		this.method389(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray26[local15] = this.anIntArray25[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray29[local33] = this.anIntArray25[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bc;B)I")
	private int method372(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(19) int local19 = this.anIntArray28[arg0.anInt352] * this.anIntArray27[arg0.anInt352] + 4096 >> 13;
		@Pc(27) int local27 = local19 * local19 + 16384 >> 15;
		@Pc(38) Class13 local38 = arg0.aClass13_1;
		@Pc(47) int local47 = local27 * arg0.anInt372 + 16384 >> 15;
		local19 = this.anInt473 * local47 + 128 >> 8;
		if (local38.anInt390 > 0) {
			local19 = (int) ((double) local19 * Math.pow(0.5D, (double) arg0.anInt375 * 1.953125E-5D * (double) local38.anInt390) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(113) int local113;
		@Pc(125) int local125;
		if (local38.aByteArray6 != null) {
			local83 = arg0.anInt363;
			local91 = local38.aByteArray6[arg0.anInt353 + 1];
			if (local38.aByteArray6.length - 2 > arg0.anInt353) {
				local113 = (local38.aByteArray6[arg0.anInt353] & 0xFF) << 8;
				local125 = (local38.aByteArray6[arg0.anInt353 + 2] & 0xFF) << 8;
				local91 += (local38.aByteArray6[arg0.anInt353 + 3] - local91) * (local83 - local113) / (local125 - local113);
			}
			local19 = local91 * local19 + 32 >> 6;
		}
		if (arg0.anInt369 > 0 && local38.aByteArray7 != null) {
			local83 = arg0.anInt369;
			local91 = local38.aByteArray7[arg0.anInt362 + 1];
			if (arg0.anInt362 < local38.aByteArray7.length - 2) {
				local113 = (local38.aByteArray7[arg0.anInt362] & 0xFF) << 8;
				local125 = (local38.aByteArray7[arg0.anInt362 + 2] & 0xFF) << 8;
				local91 += (local38.aByteArray7[arg0.anInt362 + 3] - local91) * (local83 - local113) / (local125 - local113);
			}
			local19 = local91 * local19 + 32 >> 6;
		}
		return local19;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)I")
	public int method373() {
		return this.anInt473;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bc;I)Z")
	public boolean method374(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub4_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt369 >= 0) {
			arg0.method3758();
			if (arg0.anInt367 > 0 && this.aClass1_Sub3ArrayArray1[arg0.anInt352][arg0.anInt367] == arg0) {
				this.aClass1_Sub3ArrayArray1[arg0.anInt352][arg0.anInt367] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(III)V")
	private void method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray32[arg1] = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!pi;Lclient!wf;Lclient!mb;)Z")
	public synchronized boolean method377(@OriginalArg(2) Class88 arg0, @OriginalArg(3) Class1_Sub28 arg1, @OriginalArg(4) Class70 arg2) {
		arg1.method3714();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class1_Sub27 local27 = (Class1_Sub27) arg1.aClass102_23.method3086(); local27 != null; local27 = (Class1_Sub27) arg1.aClass102_23.method3087()) {
			@Pc(33) int local33 = (int) local27.aLong170;
			@Pc(41) Class1_Sub9 local41 = (Class1_Sub9) this.aClass102_1.method3093((long) local33);
			if (local41 == null) {
				local41 = Static24.method479(local33, arg2);
				if (local41 == null) {
					local9 = false;
					continue;
				}
				this.aClass102_1.method3083(local41, (long) local33);
			}
			if (!local41.method956(local21, local27.aByteArray60, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method3716();
		}
		return local9;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ[IILclient!bc;)Z")
	public boolean method378(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub3 arg3) {
		arg3.anInt374 = Static31.anInt702 / 100;
		if (arg3.anInt369 >= 0 && (arg3.aClass1_Sub4_Sub4_1 == null || arg3.aClass1_Sub4_Sub4_1.method2384())) {
			arg3.method290();
			arg3.method3758();
			if (arg3.anInt367 > 0 && this.aClass1_Sub3ArrayArray1[arg3.anInt352][arg3.anInt367] == arg3) {
				this.aClass1_Sub3ArrayArray1[arg3.anInt352][arg3.anInt367] = null;
			}
			return true;
		}
		@Pc(63) boolean local63 = false;
		@Pc(66) int local66 = arg3.anInt361;
		if (local66 > 0) {
			local66 -= (int) (Math.pow(2.0D, (double) this.anIntArray35[arg3.anInt352] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local66 < 0) {
				local66 = 0;
			}
			arg3.anInt361 = local66;
		}
		arg3.aClass1_Sub4_Sub4_1.method2396(this.method368(arg3));
		arg3.anInt351++;
		@Pc(124) double local124 = (double) ((arg3.anInt366 - 60 << 8) + (arg3.anInt361 * arg3.anInt364 >> 12)) * 5.086263020833333E-6D;
		@Pc(127) Class13 local127 = arg3.aClass13_1;
		arg3.anInt368 += local127.anInt381;
		if (local127.anInt390 > 0) {
			if (local127.anInt377 > 0) {
				arg3.anInt375 += (int) (Math.pow(2.0D, (double) local127.anInt377 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt375 += 128;
			}
			if (arg3.anInt375 * local127.anInt390 >= 819200) {
				local63 = true;
			}
		}
		if (local127.aByteArray6 != null) {
			if (local127.anInt378 > 0) {
				arg3.anInt363 += (int) (Math.pow(2.0D, (double) local127.anInt378 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt363 += 128;
			}
			while (arg3.anInt353 < local127.aByteArray6.length - 2 && arg3.anInt363 > (local127.aByteArray6[arg3.anInt353 + 2] & 0xFF) << 8) {
				arg3.anInt353 += 2;
			}
			if (arg3.anInt353 == local127.aByteArray6.length - 2 && local127.aByteArray6[arg3.anInt353 + 1] == 0) {
				local63 = true;
			}
		}
		if (arg3.anInt369 >= 0 && local127.aByteArray7 != null && (this.anIntArray24[arg3.anInt352] & 0x1) == 0 && (arg3.anInt367 < 0 || arg3 != this.aClass1_Sub3ArrayArray1[arg3.anInt352][arg3.anInt367])) {
			if (local127.anInt380 > 0) {
				arg3.anInt369 += (int) (Math.pow(2.0D, (double) local127.anInt380 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt369 += 128;
			}
			while (arg3.anInt362 < local127.aByteArray7.length - 2 && (local127.aByteArray7[arg3.anInt362 + 2] & 0xFF) << 8 < arg3.anInt369) {
				arg3.anInt362 += 2;
			}
			if (arg3.anInt362 == local127.aByteArray7.length - 2) {
				local63 = true;
			}
		}
		if (!local63) {
			arg3.aClass1_Sub4_Sub4_1.method2375(arg3.anInt374, this.method372(arg3), this.method384(arg3));
			return false;
		}
		arg3.aClass1_Sub4_Sub4_1.method2394(arg3.anInt374);
		if (arg1 == null) {
			arg3.aClass1_Sub4_Sub4_1.method2357(arg2);
		} else {
			arg3.aClass1_Sub4_Sub4_1.method2355(arg1, arg0, arg2);
		}
		if (arg3.aClass1_Sub4_Sub4_1.method2393()) {
			this.aClass1_Sub4_Sub2_1.aClass1_Sub4_Sub3_1.method2306(arg3.aClass1_Sub4_Sub4_1);
		}
		arg3.method290();
		if (arg3.anInt369 >= 0) {
			arg3.method3758();
			if (arg3.anInt367 > 0 && arg3 == this.aClass1_Sub3ArrayArray1[arg3.anInt352][arg3.anInt367]) {
				this.aClass1_Sub3ArrayArray1[arg3.anInt352][arg3.anInt367] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()Lclient!r;")
	@Override
	public synchronized Class1_Sub4 method2354() {
		return null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	public synchronized void method379() {
		this.aClass29_1.method703();
		this.method371();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
	private void method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub3 local8 = this.aClass1_Sub3ArrayArray2[arg0][arg1];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub3ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray24[arg0] & 0x2) == 0) {
			local8.anInt369 = 0;
			return;
		}
		for (@Pc(49) Class1_Sub3 local49 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3120(); local49 != null; local49 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3109()) {
			if (local49.anInt352 == local8.anInt352 && local49.anInt369 < 0 && local49 != local8) {
				local8.anInt369 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()Lclient!r;")
	@Override
	public synchronized Class1_Sub4 method2353() {
		return this.aClass1_Sub4_Sub2_1;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(III)V")
	private void method381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray31[arg1] = arg0;
		this.anIntArray23[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)V")
	private void method382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!bc;I)I")
	private int method384(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(14) int local14 = this.anIntArray21[arg0.anInt352];
		return local14 < 8192 ? local14 * arg0.anInt365 + 32 >> 6 : 16384 - ((128 - arg0.anInt365) * (-local14 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)Z")
	public synchronized boolean method385() {
		return this.aClass29_1.method709();
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)V")
	private void method386(@OriginalArg(1) int arg0) {
		if ((this.anIntArray24[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3120(); local15 != null; local15 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3109()) {
			if (local15.anInt352 == arg0) {
				local15.anInt358 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(III)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray26[arg0] != arg1) {
			this.anIntArray26[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass1_Sub3ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)V")
	private void method388(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1_Sub3 local14 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3120(); local14 != null; local14 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3109()) {
			if ((arg0 < 0 || local14.anInt352 == arg0) && local14.anInt369 < 0) {
				this.aClass1_Sub3ArrayArray2[local14.anInt352][local14.anInt366] = null;
				local14.anInt369 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)V")
	private void method389(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
				this.method389(local16);
			}
			return;
		}
		this.anIntArray27[arg0] = 12800;
		this.anIntArray21[arg0] = 8192;
		this.anIntArray28[arg0] = 16383;
		this.anIntArray32[arg0] = 8192;
		this.anIntArray30[arg0] = 0;
		this.anIntArray35[arg0] = 8192;
		this.method363(arg0);
		this.method386(arg0);
		this.anIntArray24[arg0] = 0;
		this.anIntArray34[arg0] = 32767;
		this.anIntArray22[arg0] = 256;
		this.anIntArray33[arg0] = 0;
		this.method381(8192, arg0);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()I")
	@Override
	public synchronized int method2356() {
		return 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
	private void method390(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method380(local20, local26, local32);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 > 0) {
				this.method364(local32, local20, local26);
			} else {
				this.method380(local20, local26, 64);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method382(local20, local26, local32);
		} else if (local13 == 176) {
			local26 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray29[local20] = (this.anIntArray29[local20] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray29[local20] = (this.anIntArray29[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray30[local20] = (this.anIntArray30[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 33) {
				this.anIntArray30[local20] = local32 + (this.anIntArray30[local20] & 0xFFFFFF80);
			}
			if (local26 == 5) {
				this.anIntArray35[local20] = (this.anIntArray35[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 37) {
				this.anIntArray35[local20] = local32 + (this.anIntArray35[local20] & 0xFFFFFF80);
			}
			if (local26 == 7) {
				this.anIntArray27[local20] = (local32 << 7) + (this.anIntArray27[local20] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray27[local20] = local32 + (this.anIntArray27[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray21[local20] = (this.anIntArray21[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray21[local20] = local32 + (this.anIntArray21[local20] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.anIntArray28[local20] = (local32 << 7) + (this.anIntArray28[local20] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray28[local20] = local32 + (this.anIntArray28[local20] & 0xFFFFFF80);
			}
			if (local26 == 64) {
				if (local32 >= 64) {
					this.anIntArray24[local20] |= 0x1;
				} else {
					this.anIntArray24[local20] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local32 < 64) {
					this.method363(local20);
					this.anIntArray24[local20] &= 0xFFFFFFFD;
				} else {
					this.anIntArray24[local20] |= 0x2;
				}
			}
			if (local26 == 99) {
				this.anIntArray34[local20] = (this.anIntArray34[local20] & 0x7F) + (local32 << 7);
			}
			if (local26 == 98) {
				this.anIntArray34[local20] = (this.anIntArray34[local20] & 0x3F80) + local32;
			}
			if (local26 == 101) {
				this.anIntArray34[local20] = (local32 << 7) + ((this.anIntArray34[local20] & 0x7F) + 16384);
			}
			if (local26 == 100) {
				this.anIntArray34[local20] = (this.anIntArray34[local20] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method391(local20);
			}
			if (local26 == 121) {
				this.method389(local20);
			}
			if (local26 == 123) {
				this.method388(local20);
			}
			@Pc(507) int local507;
			if (local26 == 6) {
				local507 = this.anIntArray34[local20];
				if (local507 == 16384) {
					this.anIntArray22[local20] = (this.anIntArray22[local20] & 0xFFFFC07F) + (local32 << 7);
				}
			}
			if (local26 == 38) {
				local507 = this.anIntArray34[local20];
				if (local507 == 16384) {
					this.anIntArray22[local20] = local32 + (this.anIntArray22[local20] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray33[local20] = (local32 << 7) + (this.anIntArray33[local20] & 0xFFFFC07F);
			}
			if (local26 == 48) {
				this.anIntArray33[local20] = local32 + (this.anIntArray33[local20] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local32 < 64) {
					this.method386(local20);
					this.anIntArray24[local20] &= 0xFFFFFFFB;
				} else {
					this.anIntArray24[local20] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method381((local32 << 7) + (this.anIntArray31[local20] & 0xFFFFC07F), local20);
			}
			if (local26 == 49) {
				this.method381(local32 + (this.anIntArray31[local20] & 0xFFFFFF80), local20);
			}
		} else if (local13 == 192) {
			local26 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			this.method387(local20, this.anIntArray29[local20] + local26);
		} else if (local13 == 208) {
			local26 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			this.method369(local20, local26);
		} else if (local13 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method376(local26, local20);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method371();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(BI)V")
	private void method391(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub3 local8 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3120(); local8 != null; local8 = (Class1_Sub3) this.aClass1_Sub4_Sub2_1.aClass105_9.method3109()) {
			if (arg0 < 0 || arg0 == local8.anInt352) {
				if (local8.aClass1_Sub4_Sub4_1 != null) {
					local8.aClass1_Sub4_Sub4_1.method2394(Static31.anInt702 / 100);
					if (local8.aClass1_Sub4_Sub4_1.method2393()) {
						this.aClass1_Sub4_Sub2_1.aClass1_Sub4_Sub3_1.method2306(local8.aClass1_Sub4_Sub4_1);
					}
					local8.method290();
				}
				if (local8.anInt369 < 0) {
					this.aClass1_Sub3ArrayArray2[local8.anInt352][local8.anInt366] = null;
				}
				local8.method3758();
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method2357(@OriginalArg(0) int arg0) {
		if (this.aClass29_1.method709()) {
			@Pc(14) int local14 = this.aClass29_1.anInt969 * this.anInt462 / Static31.anInt702;
			do {
				@Pc(23) long local23 = this.aLong19 + (long) arg0 * (long) local14;
				if (this.aLong18 - local23 >= 0L) {
					this.aLong19 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong18 + (long) local14 - this.aLong19 - 1L) / (long) local14);
				this.aLong19 += (long) local14 * (long) local54;
				this.aClass1_Sub4_Sub2_1.method2357(local54);
				this.method393();
				arg0 -= local54;
			} while (this.aClass29_1.method709());
		}
		this.aClass1_Sub4_Sub2_1.method2357(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!wf;ZI)V")
	public synchronized void method392(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(1) boolean arg1) {
		this.method379();
		this.aClass29_1.method707(arg0.aByteArray61);
		this.aLong19 = 0L;
		this.aBoolean18 = arg1;
		@Pc(23) int local23 = this.aClass29_1.method705();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass29_1.method714(local25);
			this.aClass29_1.method713(local25);
			this.aClass29_1.method715(local25);
		}
		this.anInt491 = this.aClass29_1.method718();
		this.anInt490 = this.aClass29_1.anIntArray58[this.anInt491];
		this.aLong18 = this.aClass29_1.method712(this.anInt490);
	}

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "(I)V")
	private void method393() {
		@Pc(14) int local14 = this.anInt491;
		@Pc(17) int local17 = this.anInt490;
		@Pc(20) long local20 = this.aLong18;
		while (local17 == this.anInt490) {
			while (local17 == this.aClass29_1.anIntArray58[local14]) {
				this.aClass29_1.method714(local14);
				@Pc(31) int local31 = this.aClass29_1.method710(local14);
				if (local31 == 1) {
					this.aClass29_1.method708();
					this.aClass29_1.method715(local14);
					if (this.aClass29_1.method706()) {
						if (!this.aBoolean18 || local17 == 0) {
							this.method371();
							this.aClass29_1.method703();
							return;
						}
						this.aClass29_1.method717(local20);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method390(local31);
				}
				this.aClass29_1.method713(local14);
				this.aClass29_1.method715(local14);
			}
			local14 = this.aClass29_1.method718();
			local17 = this.aClass29_1.anIntArray58[local14];
			local20 = this.aClass29_1.method712(local17);
		}
		this.anInt490 = local17;
		this.anInt491 = local14;
		this.aLong18 = local20;
	}

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "(I)V")
	public synchronized void method394() {
		for (@Pc(18) Class1_Sub9 local18 = (Class1_Sub9) this.aClass102_1.method3086(); local18 != null; local18 = (Class1_Sub9) this.aClass102_1.method3087()) {
			local18.method953();
		}
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(III)V")
	public synchronized void method395() {
		this.method370();
	}
}
