import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class14_Sub5_Sub2 extends Class14_Sub5 {

	@OriginalMember(owner = "client!jc", name = "qb", descriptor = "[I")
	public static final int[] anIntArray370 = new int[32];

	@OriginalMember(owner = "client!jc", name = "Cb", descriptor = "I")
	private int anInt4665;

	@OriginalMember(owner = "client!jc", name = "Db", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!jc", name = "Eb", descriptor = "I")
	private int anInt4666;

	@OriginalMember(owner = "client!jc", name = "Fb", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!jc", name = "Ib", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!jc", name = "Jb", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!jc", name = "Kb", descriptor = "I")
	private int anInt4668;

	@OriginalMember(owner = "client!jc", name = "Lb", descriptor = "Lclient!uea;")
	private Class14_Sub51 aClass14_Sub51_2;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "[I")
	private final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
	public final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[I")
	private final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	private final int anInt4623 = 1000000;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "[I")
	private final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "[I")
	public final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "[I")
	private final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "[[Lclient!eu;")
	private final Class14_Sub20[][] aClass14_Sub20ArrayArray1 = new Class14_Sub20[16][128];

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "[I")
	private final int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!jc", name = "Z", descriptor = "[I")
	private final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!jc", name = "mb", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
	private int anInt4643 = 256;

	@OriginalMember(owner = "client!jc", name = "vb", descriptor = "[I")
	private final int[] anIntArray371 = new int[16];

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "[[Lclient!eu;")
	private final Class14_Sub20[][] aClass14_Sub20ArrayArray2 = new Class14_Sub20[16][128];

	@OriginalMember(owner = "client!jc", name = "Bb", descriptor = "[I")
	public final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "Lclient!nha;")
	private final Class244 aClass244_1 = new Class244();

	@OriginalMember(owner = "client!jc", name = "Gb", descriptor = "Lclient!vb;")
	private final Class14_Sub5_Sub5 aClass14_Sub5_Sub5_1 = new Class14_Sub5_Sub5(this);

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!jo;")
	private final Class187 aClass187_35;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray370[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class14_Sub5_Sub2() {
		this.aClass187_35 = new Class187(128);
		this.method3894(-1, 256);
		this.method3877(true);
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class14_Sub5_Sub2(@OriginalArg(0) Class14_Sub5_Sub2 arg0) {
		this.aClass187_35 = arg0.aClass187_35;
		this.method3894(-1, 256);
		this.method3877(true);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	private void method3870() {
		@Pc(16) int local16 = this.anInt4666;
		@Pc(19) int local19 = this.anInt4665;
		@Pc(22) long local22 = this.aLong136;
		if (this.aClass14_Sub51_2 != null && this.anInt4668 == local19) {
			this.method3903(this.aBoolean321, this.aClass14_Sub51_2, this.aBoolean320);
			this.method3870();
			return;
		}
		while (this.anInt4665 == local19) {
			while (this.aClass244_1.anIntArray531[local16] == local19) {
				this.aClass244_1.method5920(local16);
				@Pc(51) int local51 = this.aClass244_1.method5933(local16);
				if (local51 == 1) {
					this.aClass244_1.method5929();
					this.aClass244_1.method5924(local16);
					if (this.aClass244_1.method5934()) {
						if (this.aClass14_Sub51_2 != null) {
							this.method3895(this.aClass14_Sub51_2, this.aBoolean320);
							this.method3870();
							return;
						}
						if (!this.aBoolean320 || local19 == 0) {
							this.method3877(true);
							this.aClass244_1.method5923();
							return;
						}
						this.aClass244_1.method5922(local22);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method3891(local51);
				}
				this.aClass244_1.method5932(local16);
				this.aClass244_1.method5924(local16);
			}
			local16 = this.aClass244_1.method5931();
			local19 = this.aClass244_1.anIntArray531[local16];
			local22 = this.aClass244_1.method5927(local19);
		}
		this.aLong136 = local22;
		this.anInt4666 = local16;
		this.anInt4665 = local19;
		if (this.aClass14_Sub51_2 != null && this.anInt4668 < local19) {
			this.anInt4665 = this.anInt4668;
			this.anInt4666 = -1;
			this.aLong136 = this.aClass244_1.method5927(this.anInt4665);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)V")
	private void method3871(@OriginalArg(0) int arg0) {
		if ((this.anIntArray363[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class14_Sub20 local19 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6318(); local19 != null; local19 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6311()) {
			if (arg0 == local19.anInt2798 && this.aClass14_Sub20ArrayArray2[arg0][local19.anInt2796] == null && local19.anInt2804 < 0) {
				local19.anInt2804 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
	public int method3872() {
		return this.anInt4643;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
	private void method3873(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class14_Sub20 local8 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6318(); local8 != null; local8 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6311()) {
			if (arg0 < 0 || local8.anInt2798 == arg0) {
				if (local8.aClass14_Sub5_Sub4_1 != null) {
					local8.aClass14_Sub5_Sub4_1.method7188(Static515.anInt9036 / 100);
					if (local8.aClass14_Sub5_Sub4_1.method7207()) {
						this.aClass14_Sub5_Sub5_1.aClass14_Sub5_Sub3_2.method6027(local8.aClass14_Sub5_Sub4_1);
					}
					local8.method2327();
				}
				if (local8.anInt2804 < 0) {
					this.aClass14_Sub20ArrayArray2[local8.anInt2798][local8.anInt2796] = null;
				}
				local8.method9315();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIBLclient!eu;[I)Z")
	public boolean method3874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class14_Sub20 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt2800 = Static515.anInt9036 / 100;
		if (arg2.anInt2804 >= 0 && (arg2.aClass14_Sub5_Sub4_1 == null || arg2.aClass14_Sub5_Sub4_1.method7204())) {
			arg2.method2327();
			arg2.method9315();
			if (arg2.anInt2799 > 0 && arg2 == this.aClass14_Sub20ArrayArray1[arg2.anInt2798][arg2.anInt2799]) {
				this.aClass14_Sub20ArrayArray1[arg2.anInt2798][arg2.anInt2799] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg2.anInt2806;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray364[arg2.anInt2798] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg2.anInt2806 = local59;
		}
		arg2.aClass14_Sub5_Sub4_1.method7210(this.method3876(arg2));
		@Pc(102) Class375 local102 = arg2.aClass375_1;
		arg2.anInt2808 += local102.anInt10799;
		@Pc(117) boolean local117 = false;
		arg2.anInt2801++;
		@Pc(141) double local141 = (double) ((arg2.anInt2795 * arg2.anInt2806 >> 12) + (arg2.anInt2796 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt10804 > 0) {
			if (local102.anInt10805 <= 0) {
				arg2.anInt2809 += 128;
			} else {
				arg2.anInt2809 += (int) (Math.pow(2.0D, local141 * (double) local102.anInt10805) * 128.0D + 0.5D);
			}
			if (local102.anInt10804 * arg2.anInt2809 >= 819200) {
				local117 = true;
			}
		}
		if (local102.aByteArray138 != null) {
			if (local102.anInt10800 > 0) {
				arg2.anInt2810 += (int) (Math.pow(2.0D, local141 * (double) local102.anInt10800) * 128.0D + 0.5D);
			} else {
				arg2.anInt2810 += 128;
			}
			while (local102.aByteArray138.length - 2 > arg2.anInt2807 && (local102.aByteArray138[arg2.anInt2807 + 2] & 0xFF) << 8 < arg2.anInt2810) {
				arg2.anInt2807 += 2;
			}
			if (arg2.anInt2807 == local102.aByteArray138.length - 2 && local102.aByteArray138[arg2.anInt2807 + 1] == 0) {
				local117 = true;
			}
		}
		if (arg2.anInt2804 >= 0 && local102.aByteArray139 != null && (this.anIntArray363[arg2.anInt2798] & 0x1) == 0 && (arg2.anInt2799 < 0 || arg2 != this.aClass14_Sub20ArrayArray1[arg2.anInt2798][arg2.anInt2799])) {
			if (local102.anInt10801 <= 0) {
				arg2.anInt2804 += 128;
			} else {
				arg2.anInt2804 += (int) (Math.pow(2.0D, (double) local102.anInt10801 * local141) * 128.0D + 0.5D);
			}
			while (local102.aByteArray139.length - 2 > arg2.anInt2802 && (local102.aByteArray139[arg2.anInt2802 + 2] & 0xFF) << 8 < arg2.anInt2804) {
				arg2.anInt2802 += 2;
			}
			if (arg2.anInt2802 == local102.aByteArray139.length - 2) {
				local117 = true;
			}
		}
		if (!local117) {
			arg2.aClass14_Sub5_Sub4_1.method7183(arg2.anInt2800, this.method3905(arg2), this.method3887(arg2));
			return false;
		}
		arg2.aClass14_Sub5_Sub4_1.method7188(arg2.anInt2800);
		if (arg3 == null) {
			arg2.aClass14_Sub5_Sub4_1.method8688(arg1);
		} else {
			arg2.aClass14_Sub5_Sub4_1.method8693(arg3, arg0, arg1);
		}
		if (arg2.aClass14_Sub5_Sub4_1.method7207()) {
			this.aClass14_Sub5_Sub5_1.aClass14_Sub5_Sub3_2.method6027(arg2.aClass14_Sub5_Sub4_1);
		}
		arg2.method2327();
		if (arg2.anInt2804 >= 0) {
			arg2.method9315();
			if (arg2.anInt2799 > 0 && this.aClass14_Sub20ArrayArray1[arg2.anInt2798][arg2.anInt2799] == arg2) {
				this.aClass14_Sub20ArrayArray1[arg2.anInt2798][arg2.anInt2799] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Z")
	public synchronized boolean method3875() {
		return this.aClass244_1.method5928();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!eu;Z)I")
	private int method3876(@OriginalArg(0) Class14_Sub20 arg0) {
		@Pc(15) int local15 = arg0.anInt2813 + (arg0.anInt2795 * arg0.anInt2806 >> 12);
		local15 += this.anIntArray362[arg0.anInt2798] * (this.anIntArray361[arg0.anInt2798] - 8192) >> 12;
		@Pc(41) Class375 local41 = arg0.aClass375_1;
		@Pc(67) int local67;
		if (local41.anInt10799 > 0 && (local41.anInt10806 > 0 || this.anIntArray367[arg0.anInt2798] > 0)) {
			local67 = local41.anInt10806 << 2;
			@Pc(72) int local72 = local41.anInt10798 << 1;
			if (local72 > arg0.anInt2801) {
				local67 = arg0.anInt2801 * local67 / local72;
			}
			local67 += this.anIntArray367[arg0.anInt2798] >> 7;
			@Pc(106) double local106 = Math.sin((double) (arg0.anInt2808 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local67 * local106);
		}
		local67 = (int) ((double) (arg0.aClass14_Sub14_Sub1_1.anInt2150 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static515.anInt9036 + 0.5D);
		return local67 < 1 ? 1 : local67;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
	private void method3877(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method3873(-1);
		} else {
			this.method3901(-1);
		}
		this.method3879(-1);
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.anIntArray358[local25] = this.anIntArray365[local25];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray360[local47] = this.anIntArray365[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	private void method3878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray371[arg0] = arg1;
		this.anIntArray372[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8688(@OriginalArg(0) int arg0) {
		if (this.aClass244_1.method5928()) {
			@Pc(18) int local18 = this.anInt4623 * this.aClass244_1.anInt7294 / Static515.anInt9036;
			do {
				@Pc(27) long local27 = this.aLong137 + (long) local18 * (long) arg0;
				if (this.aLong136 - local27 >= 0L) {
					this.aLong137 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong136 + (long) local18 - this.aLong137 - 1L) / (long) local18);
				this.aLong137 += (long) local18 * (long) local57;
				this.aClass14_Sub5_Sub5_1.method8688(local57);
				arg0 -= local57;
				this.method3870();
			} while (this.aClass244_1.method5928());
		}
		this.aClass14_Sub5_Sub5_1.method8688(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)V")
	private void method3879(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
				this.method3879(local20);
			}
			return;
		}
		this.anIntArray356[arg0] = 12800;
		this.anIntArray369[arg0] = 8192;
		this.anIntArray368[arg0] = 16383;
		this.anIntArray361[arg0] = 8192;
		this.anIntArray367[arg0] = 0;
		this.anIntArray364[arg0] = 8192;
		this.method3871(arg0);
		this.method3882(arg0);
		this.anIntArray363[arg0] = 0;
		this.anIntArray366[arg0] = 32767;
		this.anIntArray362[arg0] = 256;
		this.anIntArray357[arg0] = 0;
		this.method3878(arg0, 8192);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)V")
	private void method3880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray358[arg1]) {
			this.anIntArray358[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass14_Sub20ArrayArray1[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	private void method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(II)V")
	private void method3882(@OriginalArg(1) int arg0) {
		if ((this.anIntArray363[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class14_Sub20 local18 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6318(); local18 != null; local18 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6311()) {
			if (arg0 == local18.anInt2798) {
				local18.anInt2814 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
	public synchronized void method3883() {
		this.method3892();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V")
	private void method3884(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong136) {
			@Pc(18) int local18 = this.anInt4666;
			@Pc(21) int local21 = this.anInt4665;
			@Pc(24) long local24 = this.aLong136;
			while (this.anInt4665 == local21) {
				while (this.aClass244_1.anIntArray531[local18] == local21) {
					this.aClass244_1.method5920(local18);
					@Pc(35) int local35 = this.aClass244_1.method5933(local18);
					if (local35 == 1) {
						this.aClass244_1.method5929();
						this.aClass244_1.method5924(local18);
						if (this.aClass244_1.method5934()) {
							if (!this.aBoolean320 || local21 == 0) {
								this.method3877(true);
								this.aClass244_1.method5923();
								return;
							}
							this.aClass244_1.method5922(local24);
						}
						break;
					}
					if ((local35 & 0x80) != 0 && (local35 & 0xF0) != 144) {
						this.method3891(local35);
					}
					this.aClass244_1.method5932(local18);
					this.aClass244_1.method5924(local18);
				}
				this.aLong137 = local24;
				local18 = this.aClass244_1.method5931();
				local21 = this.aClass244_1.anIntArray531[local18];
				local24 = this.aClass244_1.method5927(local21);
			}
			this.aLong136 = local24;
			this.anInt4666 = local18;
			this.anInt4665 = local21;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIB)V")
	private void method3885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray361[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public synchronized Class14_Sub5 method8692() {
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!eu;)I")
	private int method3887(@OriginalArg(1) Class14_Sub20 arg0) {
		@Pc(9) int local9 = this.anIntArray369[arg0.anInt2798];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (128 - arg0.anInt2812) + 32 >> 6) : local9 * arg0.anInt2812 - -32 >> 6;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZLclient!eu;)V")
	public void method3888(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class14_Sub20 arg1) {
		@Pc(12) int local12 = arg1.aClass14_Sub14_Sub1_1.aByteArray35.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass14_Sub14_Sub1_1.aBoolean178) {
			@Pc(27) int local27 = local12 + local12 - arg1.aClass14_Sub14_Sub1_1.anInt2151;
			local12 <<= 0x8;
			local44 = (int) ((long) this.anIntArray357[arg1.anInt2798] * (long) local27 >> 6);
			if (local12 <= local44) {
				arg1.aClass14_Sub5_Sub4_1.method7196();
				local44 = local12 + local12 - local44 - 1;
			}
		} else {
			local44 = (int) ((long) this.anIntArray357[arg1.anInt2798] * (long) local12 >> 6);
		}
		arg1.aClass14_Sub5_Sub4_1.method7198(local44);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass244_1.method5928()) {
			@Pc(14) int local14 = this.aClass244_1.anInt7294 * this.anInt4623 / Static515.anInt9036;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong137;
				if (this.aLong136 - local23 >= 0L) {
					this.aLong137 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong136 + (long) local14 - this.aLong137 - 1L) / (long) local14);
				this.aLong137 += (long) local52 * (long) local14;
				this.aClass14_Sub5_Sub5_1.method8693(arg0, arg1, local52);
				this.method3870();
				arg1 += local52;
				arg2 -= local52;
			} while (this.aClass244_1.method5928());
		}
		this.aClass14_Sub5_Sub5_1.method8693(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
	private void method3889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method3897(arg2, arg0, 64);
		if ((this.anIntArray363[arg0] & 0x2) != 0) {
			for (@Pc(25) Class14_Sub20 local25 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6320(); local25 != null; local25 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6319()) {
				if (local25.anInt2798 == arg0 && local25.anInt2804 < 0) {
					this.aClass14_Sub20ArrayArray2[arg0][local25.anInt2796] = null;
					this.aClass14_Sub20ArrayArray2[arg0][arg2] = local25;
					@Pc(65) int local65 = local25.anInt2813 + (local25.anInt2795 * local25.anInt2806 >> 12);
					local25.anInt2813 += arg2 - local25.anInt2796 << 8;
					local25.anInt2806 = 4096;
					local25.anInt2796 = arg2;
					local25.anInt2795 = local65 - local25.anInt2813;
					return;
				}
			}
		}
		@Pc(111) Class14_Sub53 local111 = (Class14_Sub53) this.aClass187_35.method4078((long) this.anIntArray358[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class14_Sub14_Sub1 local119 = local111.aClass14_Sub14_Sub1Array1[arg2];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class14_Sub20 local126 = new Class14_Sub20();
		local126.anInt2798 = arg0;
		local126.aClass14_Sub53_1 = local111;
		local126.aClass14_Sub14_Sub1_1 = local119;
		local126.aClass375_1 = local111.aClass375Array1[arg2];
		local126.anInt2799 = local111.aByteArray135[arg2];
		local126.anInt2796 = arg2;
		local126.anInt2811 = local111.aByteArray136[arg2] * local111.anInt10689 * arg1 * arg1 + 1024 >> 11;
		local126.anInt2812 = local111.aByteArray137[arg2] & 0xFF;
		local126.anInt2813 = (arg2 << 8) - (local111.aShortArray158[arg2] & 0x7FFF);
		local126.anInt2807 = 0;
		local126.anInt2809 = 0;
		local126.anInt2802 = 0;
		local126.anInt2804 = -1;
		local126.anInt2810 = 0;
		if (this.anIntArray357[arg0] == 0) {
			local126.aClass14_Sub5_Sub4_1 = Static684.method7205(local119, this.method3876(local126), this.method3905(local126), this.method3887(local126));
		} else {
			local126.aClass14_Sub5_Sub4_1 = Static684.method7205(local119, this.method3876(local126), 0, this.method3887(local126));
			this.method3888(local111.aShortArray158[arg2] < 0, local126);
		}
		if (local111.aShortArray158[arg2] < 0) {
			local126.aClass14_Sub5_Sub4_1.method7192(-1);
		}
		if (local126.anInt2799 >= 0) {
			@Pc(286) Class14_Sub20 local286 = this.aClass14_Sub20ArrayArray1[arg0][local126.anInt2799];
			if (local286 != null && local286.anInt2804 < 0) {
				this.aClass14_Sub20ArrayArray2[arg0][local286.anInt2796] = null;
				local286.anInt2804 = 0;
			}
			this.aClass14_Sub20ArrayArray1[arg0][local126.anInt2799] = local126;
		}
		this.aClass14_Sub5_Sub5_1.aClass262_71.method6314(local126);
		this.aClass14_Sub20ArrayArray2[arg0][arg2] = local126;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILclient!eu;)Z")
	public boolean method3890(@OriginalArg(1) Class14_Sub20 arg0) {
		if (arg0.aClass14_Sub5_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt2804 >= 0) {
			arg0.method9315();
			if (arg0.anInt2799 > 0 && this.aClass14_Sub20ArrayArray1[arg0.anInt2798][arg0.anInt2799] == arg0) {
				this.aClass14_Sub20ArrayArray1[arg0.anInt2798][arg0.anInt2799] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IZ)V")
	private void method3891(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method3897(local30, local24, local36);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 <= 0) {
				this.method3897(local30, local24, 64);
			} else {
				this.method3889(local24, local36, local30);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method3902(local30, local36, local24);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray360[local24] = (local36 << 14) + (this.anIntArray360[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray360[local24] = (this.anIntArray360[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 1) {
				this.anIntArray367[local24] = (this.anIntArray367[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray367[local24] = (this.anIntArray367[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 5) {
				this.anIntArray364[local24] = (local36 << 7) + (this.anIntArray364[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray364[local24] = (this.anIntArray364[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray356[local24] = (local36 << 7) + (this.anIntArray356[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray356[local24] = local36 + (this.anIntArray356[local24] & 0xFFFFFF80);
			}
			if (local30 == 10) {
				this.anIntArray369[local24] = (this.anIntArray369[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 42) {
				this.anIntArray369[local24] = local36 + (this.anIntArray369[local24] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray368[local24] = (local36 << 7) + (this.anIntArray368[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray368[local24] = local36 + (this.anIntArray368[local24] & 0xFFFFFF80);
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray363[local24] |= 0x1;
				} else {
					this.anIntArray363[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 >= 64) {
					this.anIntArray363[local24] |= 0x2;
				} else {
					this.method3871(local24);
					this.anIntArray363[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray366[local24] = (local36 << 7) + (this.anIntArray366[local24] & 0x7F);
			}
			if (local30 == 98) {
				this.anIntArray366[local24] = local36 + (this.anIntArray366[local24] & 0x3F80);
			}
			if (local30 == 101) {
				this.anIntArray366[local24] = (this.anIntArray366[local24] & 0x7F) + (local36 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray366[local24] = (this.anIntArray366[local24] & 0x3F80) + local36 + 16384;
			}
			if (local30 == 120) {
				this.method3873(local24);
			}
			if (local30 == 121) {
				this.method3879(local24);
			}
			if (local30 == 123) {
				this.method3901(local24);
			}
			@Pc(508) int local508;
			if (local30 == 6) {
				local508 = this.anIntArray366[local24];
				if (local508 == 16384) {
					this.anIntArray362[local24] = (local36 << 7) + (this.anIntArray362[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local508 = this.anIntArray366[local24];
				if (local508 == 16384) {
					this.anIntArray362[local24] = (this.anIntArray362[local24] & 0xFFFFFF80) + local36;
				}
			}
			if (local30 == 16) {
				this.anIntArray357[local24] = (this.anIntArray357[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 48) {
				this.anIntArray357[local24] = (this.anIntArray357[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 81) {
				if (local36 >= 64) {
					this.anIntArray363[local24] |= 0x4;
				} else {
					this.method3882(local24);
					this.anIntArray363[local24] &= 0xFFFFFFFB;
				}
			}
			if (local30 == 17) {
				this.method3878(local24, (local36 << 7) + (this.anIntArray371[local24] & 0xFFFFC07F));
			}
			if (local30 == 49) {
				this.method3878(local24, (this.anIntArray371[local24] & 0xFFFFFF80) + local36);
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method3880(this.anIntArray360[local24] + local30, local24);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method3881(local30, local24);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method3885(local30, local24);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method3877(true);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(BII)V")
	private void method3892() {
		this.anIntArray365[9] = 128;
		this.anIntArray360[9] = 128;
		this.method3880(128, 9);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(IZ)V")
	private synchronized void method3893(@OriginalArg(1) boolean arg0) {
		this.aClass244_1.method5923();
		this.aClass14_Sub51_2 = null;
		this.method3877(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(BII)V")
	public synchronized void method3894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0) {
			for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
				this.anIntArray359[local8] = arg1;
			}
		} else {
			this.anIntArray359[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!uea;ZB)V")
	public synchronized void method3895(@OriginalArg(0) Class14_Sub51 arg0, @OriginalArg(1) boolean arg1) {
		this.method3903(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)V")
	private void method3897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class14_Sub20 local12 = this.aClass14_Sub20ArrayArray2[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass14_Sub20ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray363[arg1] & 0x2) == 0) {
			local12.anInt2804 = 0;
			return;
		}
		for (@Pc(39) Class14_Sub20 local39 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6318(); local39 != null; local39 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6311()) {
			if (local12.anInt2798 == local39.anInt2798 && local39.anInt2804 < 0 && local39 != local12) {
				local12.anInt2804 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public synchronized void method3898() {
		for (@Pc(5) Class14_Sub53 local5 = (Class14_Sub53) this.aClass187_35.method4079(); local5 != null; local5 = (Class14_Sub53) this.aClass187_35.method4084()) {
			local5.method8916();
		}
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
	public synchronized void method3899() {
		this.method3893(true);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!wia;IILclient!gm;Lclient!uea;)Z")
	public synchronized boolean method3900(@OriginalArg(0) Class386 arg0, @OriginalArg(3) Class129 arg1, @OriginalArg(4) Class14_Sub51 arg2) {
		arg2.method8457();
		@Pc(16) boolean local16 = true;
		@Pc(27) int[] local27 = new int[] { 22050 };
		for (@Pc(33) Class14_Sub26 local33 = (Class14_Sub26) arg2.aClass187_77.method4079(); local33 != null; local33 = (Class14_Sub26) arg2.aClass187_77.method4084()) {
			@Pc(39) int local39 = (int) local33.aLong305;
			@Pc(47) Class14_Sub53 local47 = (Class14_Sub53) this.aClass187_35.method4078((long) local39);
			if (local47 == null) {
				local47 = Static236.method3558(arg0, local39);
				if (local47 == null) {
					local16 = false;
					continue;
				}
				this.aClass187_35.method4077((long) local39, local47);
			}
			if (!local47.method8915(local27, arg1, local33.aByteArray57)) {
				local16 = false;
			}
		}
		if (local16) {
			arg2.method8459();
		}
		return local16;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "()Lclient!sd;")
	@Override
	public synchronized Class14_Sub5 method8691() {
		return this.aClass14_Sub5_Sub5_1;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(IZ)V")
	private void method3901(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class14_Sub20 local12 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6318(); local12 != null; local12 = (Class14_Sub20) this.aClass14_Sub5_Sub5_1.aClass262_71.method6311()) {
			if ((arg0 < 0 || arg0 == local12.anInt2798) && local12.anInt2804 < 0) {
				this.aClass14_Sub20ArrayArray2[local12.anInt2798][local12.anInt2796] = null;
				local12.anInt2804 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZI)V")
	private void method3902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZZLclient!uea;Z)V")
	private synchronized void method3903(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class14_Sub51 arg1, @OriginalArg(3) boolean arg2) {
		this.method3893(arg0);
		this.aClass244_1.method5921(arg1.aByteArray124);
		this.aLong137 = 0L;
		this.aBoolean320 = arg2;
		@Pc(30) int local30 = this.aClass244_1.method5919();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass244_1.method5920(local32);
			this.aClass244_1.method5932(local32);
			this.aClass244_1.method5924(local32);
		}
		this.anInt4666 = this.aClass244_1.method5931();
		this.anInt4665 = this.aClass244_1.anIntArray531[this.anInt4666];
		this.aLong136 = this.aClass244_1.method5927(this.anInt4665);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
	public synchronized void method3904(@OriginalArg(1) int arg0) {
		this.anInt4643 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!eu;)I")
	private int method3905(@OriginalArg(1) Class14_Sub20 arg0) {
		if (this.anIntArray359[arg0.anInt2798] == 0) {
			return 0;
		}
		@Pc(23) Class375 local23 = arg0.aClass375_1;
		@Pc(39) int local39 = this.anIntArray356[arg0.anInt2798] * this.anIntArray368[arg0.anInt2798] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = local47 * arg0.anInt2811 + 16384 >> 15;
		@Pc(65) int local65 = local56 * this.anInt4643 + 128 >> 8;
		local39 = local65 * this.anIntArray359[arg0.anInt2798] + 128 >> 8;
		if (local23.anInt10804 > 0) {
			local39 = (int) ((double) local39 * Math.pow(0.5D, (double) arg0.anInt2809 * 1.953125E-5D * (double) local23.anInt10804) + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local23.aByteArray138 != null) {
			local104 = arg0.anInt2810;
			local112 = local23.aByteArray138[arg0.anInt2807 + 1];
			if (arg0.anInt2807 < local23.aByteArray138.length - 2) {
				local134 = (local23.aByteArray138[arg0.anInt2807] & 0xFF) << 8;
				local146 = (local23.aByteArray138[arg0.anInt2807 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (-local112 + local23.aByteArray138[arg0.anInt2807 - -3]) / (local146 - local134);
			}
			local39 = local39 * local112 + 32 >> 6;
		}
		if (arg0.anInt2804 > 0 && local23.aByteArray139 != null) {
			local104 = arg0.anInt2804;
			local112 = local23.aByteArray139[arg0.anInt2802 + 1];
			if (arg0.anInt2802 < local23.aByteArray139.length - 2) {
				local134 = (local23.aByteArray139[arg0.anInt2802] & 0xFF) << 8;
				local146 = (local23.aByteArray139[arg0.anInt2802 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (local23.aByteArray139[arg0.anInt2802 + 3] + -local112) / (local146 - local134);
			}
			local39 = local39 * local112 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	public synchronized void method3906() {
		for (@Pc(13) Class14_Sub53 local13 = (Class14_Sub53) this.aClass187_35.method4079(); local13 != null; local13 = (Class14_Sub53) this.aClass187_35.method4084()) {
			local13.method9315();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "()I")
	@Override
	public synchronized int method8687() {
		return 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!uea;ZJZI)V")
	public synchronized void method3907(@OriginalArg(0) Class14_Sub51 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2) {
		this.method3903(true, arg0, arg2);
		this.method3884(arg1 * (long) this.aClass244_1.anInt7294);
	}
}
