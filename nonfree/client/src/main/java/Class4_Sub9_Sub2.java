import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class4_Sub9_Sub2 extends Class4_Sub9 {

	@OriginalMember(owner = "client!fg", name = "Db", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!fg", name = "Fb", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!fg", name = "Gb", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!fg", name = "Hb", descriptor = "I")
	private int anInt1504;

	@OriginalMember(owner = "client!fg", name = "Ib", descriptor = "I")
	private int anInt1505;

	@OriginalMember(owner = "client!fg", name = "Jb", descriptor = "Z")
	private boolean aBoolean119;

	@OriginalMember(owner = "client!fg", name = "Kb", descriptor = "Lclient!kb;")
	private Class4_Sub18 aClass4_Sub18_1;

	@OriginalMember(owner = "client!fg", name = "Lb", descriptor = "I")
	private int anInt1506;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "[I")
	private int[] anIntArray146 = new int[16];

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "[I")
	private int[] anIntArray147 = new int[16];

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "[I")
	private int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "[I")
	private int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	private int anInt1464 = 1000000;

	@OriginalMember(owner = "client!fg", name = "ib", descriptor = "[I")
	private int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "[I")
	public int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!fg", name = "lb", descriptor = "I")
	private int anInt1493 = 256;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "[I")
	private int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "[[Lclient!ad;")
	private Class4_Sub1[][] aClass4_Sub1ArrayArray1 = new Class4_Sub1[16][128];

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "[I")
	private int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!fg", name = "gb", descriptor = "[I")
	private int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!fg", name = "ob", descriptor = "[I")
	public int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!fg", name = "yb", descriptor = "[I")
	private int[] anIntArray160 = new int[16];

	@OriginalMember(owner = "client!fg", name = "wb", descriptor = "[I")
	private int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "[I")
	public int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!fg", name = "Bb", descriptor = "[I")
	private int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!fg", name = "zb", descriptor = "[I")
	private int[] anIntArray161 = new int[16];

	@OriginalMember(owner = "client!fg", name = "vb", descriptor = "[I")
	private int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!fg", name = "mb", descriptor = "[[Lclient!ad;")
	private Class4_Sub1[][] aClass4_Sub1ArrayArray2 = new Class4_Sub1[16][128];

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "Lclient!rd;")
	private Class146 aClass146_1 = new Class146();

	@OriginalMember(owner = "client!fg", name = "Eb", descriptor = "Lclient!fi;")
	private Class4_Sub9_Sub3 aClass4_Sub9_Sub3_1 = new Class4_Sub9_Sub3(this);

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Lclient!lb;")
	private Class97 aClass97_4 = new Class97(128);

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class4_Sub9_Sub2() {
		this.method1196();
		this.method1190(true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public synchronized void method1169(@OriginalArg(0) int arg0) {
		this.anInt1493 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!ad;)I")
	private int method1170(@OriginalArg(1) Class4_Sub1 arg0) {
		@Pc(9) int local9 = this.anIntArray159[arg0.anInt73];
		return local9 < 8192 ? arg0.anInt69 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt69 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[IILclient!ad;)Z")
	public boolean method1171(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1 arg3) {
		arg3.anInt67 = Static79.anInt1529 / 100;
		if (arg3.anInt46 >= 0 && (arg3.aClass4_Sub9_Sub1_1 == null || arg3.aClass4_Sub9_Sub1_1.method775())) {
			arg3.method49();
			arg3.method4391();
			if (arg3.anInt61 > 0 && this.aClass4_Sub1ArrayArray1[arg3.anInt73][arg3.anInt61] == arg3) {
				this.aClass4_Sub1ArrayArray1[arg3.anInt73][arg3.anInt61] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt52;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray155[arg3.anInt73] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt52 = local59;
		}
		arg3.aClass4_Sub9_Sub1_1.method787(this.method1177(arg3));
		arg3.anInt55++;
		@Pc(109) boolean local109 = false;
		@Pc(112) Class122 local112 = arg3.aClass122_1;
		@Pc(131) double local131 = (double) ((arg3.anInt63 - 60 << 8) + (arg3.anInt53 * arg3.anInt52 >> 12)) * 5.086263020833333E-6D;
		arg3.anInt62 += local112.anInt3781;
		if (local112.anInt3780 > 0) {
			if (local112.anInt3787 <= 0) {
				arg3.anInt66 += 128;
			} else {
				arg3.anInt66 += (int) (Math.pow(2.0D, local131 * (double) local112.anInt3787) * 128.0D + 0.5D);
			}
			if (arg3.anInt66 * local112.anInt3780 >= 819200) {
				local109 = true;
			}
		}
		if (local112.aByteArray45 != null) {
			if (local112.anInt3789 <= 0) {
				arg3.anInt71 += 128;
			} else {
				arg3.anInt71 += (int) (Math.pow(2.0D, (double) local112.anInt3789 * local131) * 128.0D + 0.5D);
			}
			while (local112.aByteArray45.length - 2 > arg3.anInt72 && arg3.anInt71 > (local112.aByteArray45[arg3.anInt72 + 2] & 0xFF) << 8) {
				arg3.anInt72 += 2;
			}
			if (arg3.anInt72 == local112.aByteArray45.length - 2 && local112.aByteArray45[arg3.anInt72 + 1] == 0) {
				local109 = true;
			}
		}
		if (arg3.anInt46 >= 0 && local112.aByteArray44 != null && (this.anIntArray148[arg3.anInt73] & 0x1) == 0 && (arg3.anInt61 < 0 || arg3 != this.aClass4_Sub1ArrayArray1[arg3.anInt73][arg3.anInt61])) {
			if (local112.anInt3782 <= 0) {
				arg3.anInt46 += 128;
			} else {
				arg3.anInt46 += (int) (Math.pow(2.0D, (double) local112.anInt3782 * local131) * 128.0D + 0.5D);
			}
			while (arg3.anInt49 < local112.aByteArray44.length - 2 && arg3.anInt46 > (local112.aByteArray44[arg3.anInt49 + 2] & 0xFF) << 8) {
				arg3.anInt49 += 2;
			}
			if (local112.aByteArray44.length - 2 == arg3.anInt49) {
				local109 = true;
			}
		}
		if (!local109) {
			arg3.aClass4_Sub9_Sub1_1.method783(arg3.anInt67, this.method1184(arg3), this.method1170(arg3));
			return false;
		}
		arg3.aClass4_Sub9_Sub1_1.method779(arg3.anInt67);
		if (arg1 == null) {
			arg3.aClass4_Sub9_Sub1_1.method1465(arg0);
		} else {
			arg3.aClass4_Sub9_Sub1_1.method1469(arg1, arg2, arg0);
		}
		if (arg3.aClass4_Sub9_Sub1_1.method798()) {
			this.aClass4_Sub9_Sub3_1.aClass4_Sub9_Sub4_1.method1473(arg3.aClass4_Sub9_Sub1_1);
		}
		arg3.method49();
		if (arg3.anInt46 >= 0) {
			arg3.method4391();
			if (arg3.anInt61 > 0 && arg3 == this.aClass4_Sub1ArrayArray1[arg3.anInt73][arg3.anInt61]) {
				this.aClass4_Sub1ArrayArray1[arg3.anInt73][arg3.anInt61] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	private void method1172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	private void method1173() {
		@Pc(7) int local7 = this.anInt1505;
		@Pc(14) long local14 = this.aLong51;
		@Pc(17) int local17 = this.anInt1504;
		if (this.aClass4_Sub18_1 != null && this.anInt1506 == local7) {
			this.method1179(this.aBoolean119, this.aClass4_Sub18_1, this.aBoolean118);
			this.method1173();
			return;
		}
		while (local7 == this.anInt1505) {
			while (local7 == this.aClass146_1.anIntArray402[local17]) {
				this.aClass146_1.method3601(local17);
				@Pc(68) int local68 = this.aClass146_1.method3594(local17);
				if (local68 == 1) {
					this.aClass146_1.method3600();
					this.aClass146_1.method3598(local17);
					if (this.aClass146_1.method3591()) {
						if (this.aClass4_Sub18_1 != null) {
							this.method1174(this.aBoolean118, this.aClass4_Sub18_1);
							this.method1173();
							return;
						}
						if (!this.aBoolean118 || local7 == 0) {
							this.method1190(true);
							this.aClass146_1.method3604();
							return;
						}
						this.aClass146_1.method3599(local14);
					}
					break;
				}
				if ((local68 & 0x80) != 0) {
					this.method1187(local68);
				}
				this.aClass146_1.method3593(local17);
				this.aClass146_1.method3598(local17);
			}
			local17 = this.aClass146_1.method3590();
			local7 = this.aClass146_1.anIntArray402[local17];
			local14 = this.aClass146_1.method3592(local7);
		}
		this.anInt1505 = local7;
		this.aLong51 = local14;
		this.anInt1504 = local17;
		if (this.aClass4_Sub18_1 != null && this.anInt1506 < local7) {
			this.anInt1505 = this.anInt1506;
			this.anInt1504 = -1;
			this.aLong51 = this.aClass146_1.method3592(this.anInt1505);
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1469(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass146_1.method3603()) {
			@Pc(18) int local18 = this.aClass146_1.anInt4483 * this.anInt1464 / Static79.anInt1529;
			do {
				@Pc(27) long local27 = this.aLong50 + (long) local18 * (long) arg2;
				if (this.aLong51 - local27 >= 0L) {
					this.aLong50 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong51 - this.aLong50 - 1L) / (long) local18);
				this.aLong50 += (long) local57 * (long) local18;
				this.aClass4_Sub9_Sub3_1.method1469(arg0, arg1, local57);
				arg2 -= local57;
				this.method1173();
				arg1 += local57;
			} while (this.aClass146_1.method3603());
		}
		this.aClass4_Sub9_Sub3_1.method1469(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZILclient!kb;)V")
	public synchronized void method1174(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub18 arg1) {
		this.method1179(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "()Lclient!fb;")
	@Override
	public synchronized Class4_Sub9 method1468() {
		return this.aClass4_Sub9_Sub3_1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Z")
	public synchronized boolean method1175() {
		return this.aClass146_1.method3603();
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)I")
	public int method1176() {
		return this.anInt1493;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ad;I)I")
	private int method1177(@OriginalArg(0) Class4_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt50 + (arg0.anInt52 * arg0.anInt53 >> 12);
		@Pc(17) Class122 local17 = arg0.aClass122_1;
		local14 += (this.anIntArray152[arg0.anInt73] - 8192) * this.anIntArray160[arg0.anInt73] >> 12;
		@Pc(58) int local58;
		if (local17.anInt3781 > 0 && (local17.anInt3784 > 0 || this.anIntArray150[arg0.anInt73] > 0)) {
			local58 = local17.anInt3784 << 2;
			@Pc(63) int local63 = local17.anInt3788 << 1;
			if (local63 > arg0.anInt55) {
				local58 = local58 * arg0.anInt55 / local63;
			}
			local58 += this.anIntArray150[arg0.anInt73] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt62 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local93);
		}
		local58 = (int) ((double) (arg0.aClass4_Sub15_Sub1_1.anInt1904 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static79.anInt1529 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
	public synchronized void method1178() {
		for (@Pc(18) Class4_Sub26 local18 = (Class4_Sub26) this.aClass97_4.method2363(); local18 != null; local18 = (Class4_Sub26) this.aClass97_4.method2367()) {
			local18.method4391();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLclient!kb;ZI)V")
	private synchronized void method1179(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub18 arg1, @OriginalArg(2) boolean arg2) {
		this.method1206(arg0);
		this.aClass146_1.method3605(arg1.aByteArray32);
		this.aLong50 = 0L;
		this.aBoolean118 = arg2;
		@Pc(24) int local24 = this.aClass146_1.method3602();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass146_1.method3601(local26);
			this.aClass146_1.method3593(local26);
			this.aClass146_1.method3598(local26);
		}
		this.anInt1504 = this.aClass146_1.method3590();
		this.anInt1505 = this.aClass146_1.anIntArray402[this.anInt1504];
		this.aLong51 = this.aClass146_1.method3592(this.anInt1505);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1465(@OriginalArg(0) int arg0) {
		if (this.aClass146_1.method3603()) {
			@Pc(14) int local14 = this.anInt1464 * this.aClass146_1.anInt4483 / Static79.anInt1529;
			do {
				@Pc(23) long local23 = this.aLong50 + (long) local14 * (long) arg0;
				if (this.aLong51 - local23 >= 0L) {
					this.aLong50 = local23;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local14 + this.aLong51 - this.aLong50 - 1L) / (long) local14);
				arg0 -= local55;
				this.aLong50 += (long) local14 * (long) local55;
				this.aClass4_Sub9_Sub3_1.method1465(local55);
				this.method1173();
			} while (this.aClass146_1.method3603());
		}
		this.aClass4_Sub9_Sub3_1.method1465(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()Lclient!fb;")
	@Override
	public synchronized Class4_Sub9 method1463() {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBII)V")
	private void method1180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class4_Sub1 local18 = this.aClass4_Sub1ArrayArray2[arg2][arg1];
		if (local18 == null) {
			return;
		}
		this.aClass4_Sub1ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray148[arg2] & 0x2) == 0) {
			local18.anInt46 = 0;
			return;
		}
		for (@Pc(43) Class4_Sub1 local43 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method190(); local43 != null; local43 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method191()) {
			if (local18.anInt73 == local43.anInt73 && local43.anInt46 < 0 && local18 != local43) {
				local18.anInt46 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
	private void method1181(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method1181(local10);
			}
			return;
		}
		this.anIntArray158[arg0] = 12800;
		this.anIntArray159[arg0] = 8192;
		this.anIntArray149[arg0] = 16383;
		this.anIntArray152[arg0] = 8192;
		this.anIntArray150[arg0] = 0;
		this.anIntArray155[arg0] = 8192;
		this.method1195(arg0);
		this.method1201(arg0);
		this.anIntArray148[arg0] = 0;
		this.anIntArray162[arg0] = 32767;
		this.anIntArray160[arg0] = 256;
		this.anIntArray151[arg0] = 0;
		this.method1197(8192, arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ll;ILclient!kb;Lclient!lc;I)Z")
	public synchronized boolean method1183(@OriginalArg(0) Class102 arg0, @OriginalArg(2) Class4_Sub18 arg1, @OriginalArg(3) Class98 arg2) {
		arg1.method2169();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(35) Class4_Sub28 local35 = (Class4_Sub28) arg1.aClass97_11.method2363(); local35 != null; local35 = (Class4_Sub28) arg1.aClass97_11.method2367()) {
			@Pc(41) int local41 = (int) local35.aLong200;
			@Pc(49) Class4_Sub26 local49 = (Class4_Sub26) this.aClass97_4.method2360((long) local41);
			if (local49 == null) {
				local49 = Static261.method3956(local41, arg2);
				if (local49 == null) {
					local9 = false;
					continue;
				}
				this.aClass97_4.method2364(local49, (long) local41);
			}
			if (!local49.method2861(local35.aByteArray66, local21, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method2170();
		}
		return local9;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ad;)I")
	private int method1184(@OriginalArg(1) Class4_Sub1 arg0) {
		if (this.anIntArray153[arg0.anInt73] == 0) {
			return 0;
		}
		@Pc(20) Class122 local20 = arg0.aClass122_1;
		@Pc(36) int local36 = this.anIntArray149[arg0.anInt73] * this.anIntArray158[arg0.anInt73] + 4096 >> 13;
		@Pc(44) int local44 = local36 * local36 + 16384 >> 15;
		@Pc(53) int local53 = local44 * arg0.anInt47 + 16384 >> 15;
		@Pc(62) int local62 = local53 * this.anInt1493 + 128 >> 8;
		local36 = local62 * this.anIntArray153[arg0.anInt73] + 128 >> 8;
		if (local20.anInt3780 > 0) {
			local36 = (int) ((double) local36 * Math.pow(0.5D, (double) local20.anInt3780 * (double) arg0.anInt66 * 1.953125E-5D) + 0.5D);
		}
		@Pc(113) int local113;
		@Pc(110) int local110;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local20.aByteArray45 != null) {
			local110 = local20.aByteArray45[arg0.anInt72 + 1];
			local113 = arg0.anInt71;
			if (arg0.anInt72 < local20.aByteArray45.length - 2) {
				local135 = (local20.aByteArray45[arg0.anInt72] & 0xFF) << 8;
				local147 = (local20.aByteArray45[arg0.anInt72 + 2] & 0xFF) << 8;
				local110 += (local113 - local135) * (-local110 + local20.aByteArray45[arg0.anInt72 + 3]) / (local147 - local135);
			}
			local36 = local110 * local36 + 32 >> 6;
		}
		if (arg0.anInt46 > 0 && local20.aByteArray44 != null) {
			local113 = arg0.anInt46;
			local110 = local20.aByteArray44[arg0.anInt49 + 1];
			if (local20.aByteArray44.length - 2 > arg0.anInt49) {
				local147 = (local20.aByteArray44[arg0.anInt49 + 2] & 0xFF) << 8;
				local135 = (local20.aByteArray44[arg0.anInt49] & 0xFF) << 8;
				local110 += (local20.aByteArray44[arg0.anInt49 + 3] - local110) * (-local135 + local113) / (local147 - local135);
			}
			local36 = local110 * local36 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)V")
	public synchronized void method1185() {
		this.method1189();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI)V")
	private void method1186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray146[arg1]) {
			this.anIntArray146[arg1] = arg0;
			for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
				this.aClass4_Sub1ArrayArray1[arg1][local21] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IB)V")
	private void method1187(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (local9 == 128) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			this.method1180(local31, local25, local19);
		} else if (local9 == 144) {
			local19 = arg0 & 0xF;
			local31 = arg0 >> 16 & 0x7F;
			local25 = arg0 >> 8 & 0x7F;
			if (local31 <= 0) {
				this.method1180(64, local25, local19);
			} else {
				this.method1194(local25, local31, local19);
			}
		} else if (local9 == 160) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			this.method1205(local25, local19, local31);
		} else if (local9 == 176) {
			local25 = arg0 >> 8 & 0x7F;
			local19 = arg0 & 0xF;
			local31 = arg0 >> 16 & 0x7F;
			if (local25 == 0) {
				this.anIntArray156[local19] = (this.anIntArray156[local19] & 0xFFE03FFF) + (local31 << 14);
			}
			if (local25 == 32) {
				this.anIntArray156[local19] = (this.anIntArray156[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 1) {
				this.anIntArray150[local19] = (local31 << 7) + (this.anIntArray150[local19] & 0xFFFFC07F);
			}
			if (local25 == 33) {
				this.anIntArray150[local19] = local31 + (this.anIntArray150[local19] & 0xFFFFFF80);
			}
			if (local25 == 5) {
				this.anIntArray155[local19] = (this.anIntArray155[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 37) {
				this.anIntArray155[local19] = local31 + (this.anIntArray155[local19] & 0xFFFFFF80);
			}
			if (local25 == 7) {
				this.anIntArray158[local19] = (this.anIntArray158[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 39) {
				this.anIntArray158[local19] = local31 + (this.anIntArray158[local19] & 0xFFFFFF80);
			}
			if (local25 == 10) {
				this.anIntArray159[local19] = (local31 << 7) + (this.anIntArray159[local19] & 0xFFFFC07F);
			}
			if (local25 == 42) {
				this.anIntArray159[local19] = (this.anIntArray159[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 11) {
				this.anIntArray149[local19] = (this.anIntArray149[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 43) {
				this.anIntArray149[local19] = local31 + (this.anIntArray149[local19] & 0xFFFFFF80);
			}
			if (local25 == 64) {
				if (local31 < 64) {
					this.anIntArray148[local19] &= 0xFFFFFFFE;
				} else {
					this.anIntArray148[local19] |= 0x1;
				}
			}
			if (local25 == 65) {
				if (local31 < 64) {
					this.method1195(local19);
					this.anIntArray148[local19] &= 0xFFFFFFFD;
				} else {
					this.anIntArray148[local19] |= 0x2;
				}
			}
			if (local25 == 99) {
				this.anIntArray162[local19] = (local31 << 7) + (this.anIntArray162[local19] & 0x7F);
			}
			if (local25 == 98) {
				this.anIntArray162[local19] = (this.anIntArray162[local19] & 0x3F80) + local31;
			}
			if (local25 == 101) {
				this.anIntArray162[local19] = (this.anIntArray162[local19] & 0x7F) + (local31 << 7) + 16384;
			}
			if (local25 == 100) {
				this.anIntArray162[local19] = (this.anIntArray162[local19] & 0x3F80) + local31 + 16384;
			}
			if (local25 == 120) {
				this.method1204(local19);
			}
			if (local25 == 121) {
				this.method1181(local19);
			}
			if (local25 == 123) {
				this.method1203(local19);
			}
			@Pc(512) int local512;
			if (local25 == 6) {
				local512 = this.anIntArray162[local19];
				if (local512 == 16384) {
					this.anIntArray160[local19] = (this.anIntArray160[local19] & 0xFFFFC07F) + (local31 << 7);
				}
			}
			if (local25 == 38) {
				local512 = this.anIntArray162[local19];
				if (local512 == 16384) {
					this.anIntArray160[local19] = local31 + (this.anIntArray160[local19] & 0xFFFFFF80);
				}
			}
			if (local25 == 16) {
				this.anIntArray151[local19] = (local31 << 7) + (this.anIntArray151[local19] & 0xFFFFC07F);
			}
			if (local25 == 48) {
				this.anIntArray151[local19] = local31 + (this.anIntArray151[local19] & 0xFFFFFF80);
			}
			if (local25 == 81) {
				if (local31 < 64) {
					this.method1201(local19);
					this.anIntArray148[local19] &= 0xFFFFFFFB;
				} else {
					this.anIntArray148[local19] |= 0x4;
				}
			}
			if (local25 == 17) {
				this.method1197((this.anIntArray147[local19] & 0xFFFFC07F) + (local31 << 7), local19);
			}
			if (local25 == 49) {
				this.method1197(local31 + (this.anIntArray147[local19] & 0xFFFFFF80), local19);
			}
		} else if (local9 == 192) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			this.method1186(this.anIntArray156[local19] + local25, local19);
		} else if (local9 == 208) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			this.method1172(local25, local19);
		} else if (local9 == 224) {
			local19 = arg0 & 0xF;
			local25 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1199(local19, local25);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1190(true);
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
	public synchronized void method1188() {
		for (@Pc(15) Class4_Sub26 local15 = (Class4_Sub26) this.aClass97_4.method2363(); local15 != null; local15 = (Class4_Sub26) this.aClass97_4.method2367()) {
			local15.method2859();
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)V")
	private void method1189() {
		this.anIntArray161[9] = 128;
		this.anIntArray156[9] = 128;
		this.method1186(128, 9);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
	private void method1190(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1204(-1);
		} else {
			this.method1203(-1);
		}
		this.method1181(-1);
		@Pc(27) int local27;
		for (local27 = 0; local27 < 16; local27++) {
			this.anIntArray146[local27] = this.anIntArray161[local27];
		}
		for (local27 = 0; local27 < 16; local27++) {
			this.anIntArray156[local27] = this.anIntArray161[local27] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIBI)V")
	private void method1194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1180(64, arg0, arg2);
		if ((this.anIntArray148[arg2] & 0x2) != 0) {
			for (@Pc(29) Class4_Sub1 local29 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method187(); local29 != null; local29 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method180()) {
				if (arg2 == local29.anInt73 && local29.anInt46 < 0) {
					this.aClass4_Sub1ArrayArray2[arg2][local29.anInt63] = null;
					this.aClass4_Sub1ArrayArray2[arg2][arg0] = local29;
					@Pc(71) int local71 = (local29.anInt52 * local29.anInt53 >> 12) + local29.anInt50;
					local29.anInt52 = 4096;
					local29.anInt50 += arg0 - local29.anInt63 << 8;
					local29.anInt63 = arg0;
					local29.anInt53 = local71 - local29.anInt50;
					return;
				}
			}
		}
		@Pc(117) Class4_Sub26 local117 = (Class4_Sub26) this.aClass97_4.method2360((long) this.anIntArray146[arg2]);
		if (local117 == null) {
			return;
		}
		@Pc(126) Class4_Sub15_Sub1 local126 = local117.aClass4_Sub15_Sub1Array1[arg0];
		if (local126 == null) {
			return;
		}
		@Pc(140) Class4_Sub1 local140 = new Class4_Sub1();
		local140.aClass4_Sub15_Sub1_1 = local126;
		local140.anInt73 = arg2;
		local140.aClass4_Sub26_1 = local117;
		local140.aClass122_1 = local117.aClass122Array1[arg0];
		local140.anInt61 = local117.aByteArray38[arg0];
		local140.anInt63 = arg0;
		local140.anInt47 = local117.aByteArray39[arg0] * local117.anInt3588 * arg1 * arg1 + 1024 >> 11;
		local140.anInt69 = local117.aByteArray40[arg0] & 0xFF;
		local140.anInt50 = (arg0 << 8) - (local117.aShortArray34[arg0] & 0x7FFF);
		local140.anInt46 = -1;
		local140.anInt72 = 0;
		local140.anInt49 = 0;
		local140.anInt71 = 0;
		local140.anInt66 = 0;
		if (this.anIntArray151[arg2] == 0) {
			local140.aClass4_Sub9_Sub1_1 = Static302.method811(local126, this.method1177(local140), this.method1184(local140), this.method1170(local140));
		} else {
			local140.aClass4_Sub9_Sub1_1 = Static302.method811(local126, this.method1177(local140), 0, this.method1170(local140));
			this.method1202(local117.aShortArray34[arg0] < 0, local140);
		}
		if (local117.aShortArray34[arg0] < 0) {
			local140.aClass4_Sub9_Sub1_1.method781(-1);
		}
		if (local140.anInt61 >= 0) {
			@Pc(292) Class4_Sub1 local292 = this.aClass4_Sub1ArrayArray1[arg2][local140.anInt61];
			if (local292 != null && local292.anInt46 < 0) {
				this.aClass4_Sub1ArrayArray2[arg2][local292.anInt63] = null;
				local292.anInt46 = 0;
			}
			this.aClass4_Sub1ArrayArray1[arg2][local140.anInt61] = local140;
		}
		this.aClass4_Sub9_Sub3_1.aClass10_11.method184(local140);
		this.aClass4_Sub1ArrayArray2[arg2][arg0] = local140;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)V")
	private void method1195(@OriginalArg(1) int arg0) {
		if ((this.anIntArray148[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(30) Class4_Sub1 local30 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method190(); local30 != null; local30 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method191()) {
			if (local30.anInt73 == arg0 && this.aClass4_Sub1ArrayArray2[arg0][local30.anInt63] == null && local30.anInt46 < 0) {
				local30.anInt46 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(III)V")
	private synchronized void method1196() {
		for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
			this.anIntArray153[local10] = 256;
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
	@Override
	public synchronized int method1467() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IBI)V")
	private void method1197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray147[arg1] = arg0;
		this.anIntArray157[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(III)V")
	private void method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray152[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ad;Z)Z")
	public boolean method1200(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub9_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt46 >= 0) {
			arg0.method4391();
			if (arg0.anInt61 > 0 && arg0 == this.aClass4_Sub1ArrayArray1[arg0.anInt73][arg0.anInt61]) {
				this.aClass4_Sub1ArrayArray1[arg0.anInt73][arg0.anInt61] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)V")
	private void method1201(@OriginalArg(1) int arg0) {
		if ((this.anIntArray148[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class4_Sub1 local15 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method190(); local15 != null; local15 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method191()) {
			if (local15.anInt73 == arg0) {
				local15.anInt48 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZILclient!ad;)V")
	public void method1202(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(4) int local4 = arg1.aClass4_Sub15_Sub1_1.aByteArray26.length;
		@Pc(23) int local23;
		if (arg0 && arg1.aClass4_Sub15_Sub1_1.aBoolean143) {
			@Pc(34) int local34 = local4 + local4 - arg1.aClass4_Sub15_Sub1_1.anInt1906;
			local23 = (int) ((long) local34 * (long) this.anIntArray151[arg1.anInt73] >> 6);
			local4 <<= 0x8;
			if (local23 >= local4) {
				local23 = local4 + local4 - local23 - 1;
				arg1.aClass4_Sub9_Sub1_1.method797();
			}
		} else {
			local23 = (int) ((long) this.anIntArray151[arg1.anInt73] * (long) local4 >> 6);
		}
		arg1.aClass4_Sub9_Sub1_1.method785(local23);
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(II)V")
	private void method1203(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class4_Sub1 local11 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method190(); local11 != null; local11 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method191()) {
			if ((arg0 < 0 || arg0 == local11.anInt73) && local11.anInt46 < 0) {
				this.aClass4_Sub1ArrayArray2[local11.anInt73][local11.anInt63] = null;
				local11.anInt46 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(II)V")
	private void method1204(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class4_Sub1 local20 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method190(); local20 != null; local20 = (Class4_Sub1) this.aClass4_Sub9_Sub3_1.aClass10_11.method191()) {
			if (arg0 < 0 || local20.anInt73 == arg0) {
				if (local20.aClass4_Sub9_Sub1_1 != null) {
					local20.aClass4_Sub9_Sub1_1.method779(Static79.anInt1529 / 100);
					if (local20.aClass4_Sub9_Sub1_1.method798()) {
						this.aClass4_Sub9_Sub3_1.aClass4_Sub9_Sub4_1.method1473(local20.aClass4_Sub9_Sub1_1);
					}
					local20.method49();
				}
				if (local20.anInt46 < 0) {
					this.aClass4_Sub1ArrayArray2[local20.anInt73][local20.anInt63] = null;
				}
				local20.method4391();
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	private void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)V")
	private synchronized void method1206(@OriginalArg(1) boolean arg0) {
		this.aClass146_1.method3604();
		this.aClass4_Sub18_1 = null;
		this.method1190(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)V")
	public synchronized void method1208() {
		this.method1206(true);
	}
}
