import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class5_Sub14_Sub4 extends Class5_Sub14 {

	@OriginalMember(owner = "client!hk", name = "Eb", descriptor = "J")
	private long aLong131;

	@OriginalMember(owner = "client!hk", name = "Gb", descriptor = "I")
	private int anInt3670;

	@OriginalMember(owner = "client!hk", name = "Hb", descriptor = "J")
	private long aLong132;

	@OriginalMember(owner = "client!hk", name = "Ib", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!hk", name = "Jb", descriptor = "I")
	private int anInt3671;

	@OriginalMember(owner = "client!hk", name = "Kb", descriptor = "Lclient!jm;")
	private Class5_Sub31 aClass5_Sub31_1;

	@OriginalMember(owner = "client!hk", name = "Lb", descriptor = "I")
	private int anInt3672;

	@OriginalMember(owner = "client!hk", name = "Mb", descriptor = "Z")
	private boolean aBoolean255;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "[I")
	private final int[] anIntArray205 = new int[16];

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "[I")
	public final int[] anIntArray209 = new int[16];

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "[I")
	private final int[] anIntArray208 = new int[16];

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
	private final int[] anIntArray212 = new int[16];

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "[I")
	private final int[] anIntArray215 = new int[16];

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "[I")
	private final int[] anIntArray203 = new int[16];

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "[I")
	public final int[] anIntArray214 = new int[16];

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	private int anInt3625 = 256;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "[I")
	private final int[] anIntArray211 = new int[16];

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "[[Lclient!uw;")
	private final Class5_Sub53[][] aClass5_Sub53ArrayArray1 = new Class5_Sub53[16][128];

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "[I")
	private final int[] anIntArray213 = new int[16];

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "[I")
	private final int[] anIntArray217 = new int[16];

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "[I")
	private final int[] anIntArray207 = new int[16];

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "[I")
	private final int[] anIntArray216 = new int[16];

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
	private final int[] anIntArray206 = new int[16];

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "[I")
	private final int[] anIntArray210 = new int[16];

	@OriginalMember(owner = "client!hk", name = "ub", descriptor = "I")
	private final int anInt3663 = 1000000;

	@OriginalMember(owner = "client!hk", name = "mb", descriptor = "[[Lclient!uw;")
	private final Class5_Sub53[][] aClass5_Sub53ArrayArray2 = new Class5_Sub53[16][128];

	@OriginalMember(owner = "client!hk", name = "gb", descriptor = "[I")
	private final int[] anIntArray218 = new int[16];

	@OriginalMember(owner = "client!hk", name = "Cb", descriptor = "[I")
	public final int[] anIntArray219 = new int[16];

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Lclient!ufa;")
	private final Class354 aClass354_1 = new Class354();

	@OriginalMember(owner = "client!hk", name = "Fb", descriptor = "Lclient!wt;")
	private final Class5_Sub14_Sub5 aClass5_Sub14_Sub5_1 = new Class5_Sub14_Sub5(this);

	@OriginalMember(owner = "client!hk", name = "vb", descriptor = "Lclient!tga;")
	private final Class335 aClass335_20;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class5_Sub14_Sub4() {
		this.aClass335_20 = new Class335(128);
		this.method3248(-1, 256);
		this.method3243(true);
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class5_Sub14_Sub4(@OriginalArg(0) Class5_Sub14_Sub4 arg0) {
		this.aClass335_20 = arg0.aClass335_20;
		this.method3248(-1, 256);
		this.method3243(true);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIB)V")
	public synchronized void method3220() {
		this.method3223();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	public synchronized void method3221() {
		for (@Pc(11) Class5_Sub46 local11 = (Class5_Sub46) this.aClass335_20.method7768(); local11 != null; local11 = (Class5_Sub46) this.aClass335_20.method7777()) {
			local11.method7498();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZLclient!uw;)V")
	public void method3222(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub53 arg1) {
		@Pc(8) int local8 = arg1.aClass5_Sub9_Sub1_4.aByteArray4.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass5_Sub9_Sub1_4.aBoolean20) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass5_Sub9_Sub1_4.anInt489;
			local8 <<= 0x8;
			local40 = (int) ((long) this.anIntArray209[arg1.anInt9937] * (long) local23 >> 6);
			if (local40 >= local8) {
				local40 = local8 + local8 - local40 - 1;
				arg1.aClass5_Sub14_Sub1_4.method1357();
			}
		} else {
			local40 = (int) ((long) this.anIntArray209[arg1.anInt9937] * (long) local8 >> 6);
		}
		arg1.aClass5_Sub14_Sub1_4.method1360(local40);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	private void method3223() {
		this.anIntArray217[9] = 128;
		this.anIntArray218[9] = 128;
		this.method3225(9, 128);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIB)V")
	private void method3224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
	private void method3225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray210[arg0] != arg1) {
			this.anIntArray210[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass5_Sub53ArrayArray2[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
	private void method3226(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class5_Sub53 local12 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2572(); local12 != null; local12 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2569()) {
			if ((arg0 < 0 || local12.anInt9937 == arg0) && local12.anInt9942 < 0) {
				this.aClass5_Sub53ArrayArray1[local12.anInt9937][local12.anInt9934] = null;
				local12.anInt9942 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)I")
	public int method3227() {
		return this.anInt3625;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()Lclient!eha;")
	@Override
	public synchronized Class5_Sub14 method8780() {
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	private void method3228(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method3228(local7);
			}
			return;
		}
		this.anIntArray215[arg0] = 12800;
		this.anIntArray212[arg0] = 8192;
		this.anIntArray205[arg0] = 16383;
		this.anIntArray203[arg0] = 8192;
		this.anIntArray211[arg0] = 0;
		this.anIntArray208[arg0] = 8192;
		this.method3236(arg0);
		this.method3231(arg0);
		this.anIntArray219[arg0] = 0;
		this.anIntArray207[arg0] = 32767;
		this.anIntArray213[arg0] = 256;
		this.anIntArray209[arg0] = 0;
		this.method3244(8192, arg0);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	private void method3229() {
		@Pc(6) int local6 = this.anInt3671;
		@Pc(9) int local9 = this.anInt3670;
		@Pc(12) long local12 = this.aLong132;
		if (this.aClass5_Sub31_1 != null && this.anInt3672 == local9) {
			this.method3233(this.aBoolean255, this.aClass5_Sub31_1, this.aBoolean254);
			this.method3229();
			return;
		}
		while (this.anInt3670 == local9) {
			while (this.aClass354_1.anIntArray548[local6] == local9) {
				this.aClass354_1.method8088(local6);
				@Pc(49) int local49 = this.aClass354_1.method8085(local6);
				if (local49 == 1) {
					this.aClass354_1.method8092();
					this.aClass354_1.method8083(local6);
					if (this.aClass354_1.method8087()) {
						if (this.aClass5_Sub31_1 != null) {
							this.method3258(this.aBoolean254, this.aClass5_Sub31_1);
							this.method3229();
							return;
						}
						if (!this.aBoolean254 || local9 == 0) {
							this.method3243(true);
							this.aClass354_1.method8094();
							return;
						}
						this.aClass354_1.method8082(local12);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method3240(local49);
				}
				this.aClass354_1.method8081(local6);
				this.aClass354_1.method8083(local6);
			}
			local6 = this.aClass354_1.method8080();
			local9 = this.aClass354_1.anIntArray548[local6];
			local12 = this.aClass354_1.method8084(local9);
		}
		this.anInt3670 = local9;
		this.aLong132 = local12;
		this.anInt3671 = local6;
		if (this.aClass5_Sub31_1 != null && local9 > this.anInt3672) {
			this.anInt3670 = this.anInt3672;
			this.anInt3671 = -1;
			this.aLong132 = this.aClass354_1.method8084(this.anInt3670);
		}
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "()I")
	@Override
	public synchronized int method8783() {
		return 0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	private void method3230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3256(64, arg2, arg1);
		if ((this.anIntArray219[arg2] & 0x2) != 0) {
			for (@Pc(26) Class5_Sub53 local26 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2573(); local26 != null; local26 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2579()) {
				if (local26.anInt9937 == arg2 && local26.anInt9942 < 0) {
					this.aClass5_Sub53ArrayArray1[arg2][local26.anInt9934] = null;
					this.aClass5_Sub53ArrayArray1[arg2][arg1] = local26;
					@Pc(64) int local64 = (local26.anInt9922 * local26.anInt9926 >> 12) + local26.anInt9928;
					local26.anInt9928 += arg1 - local26.anInt9934 << 8;
					local26.anInt9934 = arg1;
					local26.anInt9922 = 4096;
					local26.anInt9926 = local64 - local26.anInt9928;
					return;
				}
			}
		}
		@Pc(109) Class5_Sub46 local109 = (Class5_Sub46) this.aClass335_20.method7766((long) this.anIntArray210[arg2]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class5_Sub9_Sub1 local117 = local109.aClass5_Sub9_Sub1Array1[arg1];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class5_Sub53 local124 = new Class5_Sub53();
		local124.anInt9937 = arg2;
		local124.aClass5_Sub9_Sub1_4 = local117;
		local124.aClass5_Sub46_1 = local109;
		local124.aClass163_1 = local109.aClass163Array1[arg1];
		local124.anInt9925 = local109.aByteArray85[arg1];
		local124.anInt9934 = arg1;
		local124.anInt9939 = local109.anInt8894 * arg0 * arg0 * local109.aByteArray86[arg1] + 1024 >> 11;
		local124.anInt9941 = local109.aByteArray84[arg1] & 0xFF;
		local124.anInt9928 = (arg1 << 8) - (local109.aShortArray104[arg1] & 0x7FFF);
		local124.anInt9942 = -1;
		local124.anInt9936 = 0;
		local124.anInt9930 = 0;
		local124.anInt9935 = 0;
		local124.anInt9929 = 0;
		if (this.anIntArray209[arg2] == 0) {
			local124.aClass5_Sub14_Sub1_4 = Static678.method1349(local117, this.method3246(local124), this.method3237(local124), this.method3238(local124));
		} else {
			local124.aClass5_Sub14_Sub1_4 = Static678.method1349(local117, this.method3246(local124), 0, this.method3238(local124));
			this.method3222(local109.aShortArray104[arg1] < 0, local124);
		}
		if (local109.aShortArray104[arg1] < 0) {
			local124.aClass5_Sub14_Sub1_4.method1361(-1);
		}
		if (local124.anInt9925 >= 0) {
			@Pc(277) Class5_Sub53 local277 = this.aClass5_Sub53ArrayArray2[arg2][local124.anInt9925];
			if (local277 != null && local277.anInt9942 < 0) {
				this.aClass5_Sub53ArrayArray1[arg2][local277.anInt9934] = null;
				local277.anInt9942 = 0;
			}
			this.aClass5_Sub53ArrayArray2[arg2][local124.anInt9925] = local124;
		}
		this.aClass5_Sub14_Sub5_1.aClass124_108.method2574(local124);
		this.aClass5_Sub53ArrayArray1[arg2][arg1] = local124;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
	private void method3231(@OriginalArg(0) int arg0) {
		if ((this.anIntArray219[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class5_Sub53 local20 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2572(); local20 != null; local20 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2569()) {
			if (arg0 == local20.anInt9937) {
				local20.anInt9921 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V")
	private void method3232(@OriginalArg(1) long arg0) {
		while (this.aLong132 <= arg0) {
			@Pc(17) int local17 = this.anInt3671;
			@Pc(20) int local20 = this.anInt3670;
			@Pc(23) long local23 = this.aLong132;
			while (local20 == this.anInt3670) {
				while (local20 == this.aClass354_1.anIntArray548[local17]) {
					this.aClass354_1.method8088(local17);
					@Pc(34) int local34 = this.aClass354_1.method8085(local17);
					if (local34 == 1) {
						this.aClass354_1.method8092();
						this.aClass354_1.method8083(local17);
						if (this.aClass354_1.method8087()) {
							if (!this.aBoolean254 || local20 == 0) {
								this.method3243(true);
								this.aClass354_1.method8094();
								return;
							}
							this.aClass354_1.method8082(local23);
						}
						break;
					}
					if ((local34 & 0x80) != 0 && (local34 & 0xF0) != 144) {
						this.method3240(local34);
					}
					this.aClass354_1.method8081(local17);
					this.aClass354_1.method8083(local17);
				}
				this.aLong131 = local23;
				local17 = this.aClass354_1.method8080();
				local20 = this.aClass354_1.anIntArray548[local17];
				local23 = this.aClass354_1.method8084(local20);
			}
			this.anInt3671 = local17;
			this.aLong132 = local23;
			this.anInt3670 = local20;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLclient!jm;Z)V")
	private synchronized void method3233(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub31 arg1, @OriginalArg(3) boolean arg2) {
		this.method3257(arg0);
		this.aClass354_1.method8095(arg1.aByteArray47);
		this.aBoolean254 = arg2;
		this.aLong131 = 0L;
		@Pc(28) int local28 = this.aClass354_1.method8091();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass354_1.method8088(local30);
			this.aClass354_1.method8081(local30);
			this.aClass354_1.method8083(local30);
		}
		this.anInt3671 = this.aClass354_1.method8080();
		this.anInt3670 = this.aClass354_1.anIntArray548[this.anInt3671];
		this.aLong132 = this.aClass354_1.method8084(this.anInt3670);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!uw;B)Z")
	public boolean method3234(@OriginalArg(0) Class5_Sub53 arg0) {
		if (arg0.aClass5_Sub14_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt9942 >= 0) {
			arg0.method8829();
			if (arg0.anInt9925 > 0 && this.aClass5_Sub53ArrayArray2[arg0.anInt9937][arg0.anInt9925] == arg0) {
				this.aClass5_Sub53ArrayArray2[arg0.anInt9937][arg0.anInt9925] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V")
	private void method3236(@OriginalArg(1) int arg0) {
		if ((this.anIntArray219[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class5_Sub53 local18 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2572(); local18 != null; local18 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2569()) {
			if (local18.anInt9937 == arg0 && this.aClass5_Sub53ArrayArray1[arg0][local18.anInt9934] == null && local18.anInt9942 < 0) {
				local18.anInt9942 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!uw;I)I")
	private int method3237(@OriginalArg(0) Class5_Sub53 arg0) {
		if (this.anIntArray216[arg0.anInt9937] == 0) {
			return 0;
		}
		@Pc(22) Class163 local22 = arg0.aClass163_1;
		@Pc(38) int local38 = this.anIntArray205[arg0.anInt9937] * this.anIntArray215[arg0.anInt9937] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt9939 * local46 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt3625 + 128 >> 8;
		local38 = local64 * this.anIntArray216[arg0.anInt9937] + 128 >> 8;
		if (local22.anInt3965 > 0) {
			local38 = (int) ((double) local38 * Math.pow(0.5D, (double) local22.anInt3965 * (double) arg0.anInt9929 * 1.953125E-5D) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local22.aByteArray44 != null) {
			local103 = arg0.anInt9935;
			local111 = local22.aByteArray44[arg0.anInt9930 + 1];
			if (arg0.anInt9930 < local22.aByteArray44.length - 2) {
				local133 = (local22.aByteArray44[arg0.anInt9930] & 0xFF) << 8;
				local145 = (local22.aByteArray44[arg0.anInt9930 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (local22.aByteArray44[arg0.anInt9930 + 3] - local111) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		if (arg0.anInt9942 > 0 && local22.aByteArray43 != null) {
			local103 = arg0.anInt9942;
			local111 = local22.aByteArray43[arg0.anInt9936 + 1];
			if (arg0.anInt9936 < local22.aByteArray43.length - 2) {
				local133 = (local22.aByteArray43[arg0.anInt9936] & 0xFF) << 8;
				local145 = (local22.aByteArray43[arg0.anInt9936 + 2] & 0xFF) << 8;
				local111 += (local22.aByteArray43[arg0.anInt9936 + 3] - local111) * (local103 + -local133) / (local145 - local133);
			}
			local38 = local38 * local111 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!uw;)I")
	private int method3238(@OriginalArg(1) Class5_Sub53 arg0) {
		@Pc(16) int local16 = this.anIntArray212[arg0.anInt9937];
		return local16 >= 8192 ? 16384 - ((128 - arg0.anInt9941) * (-local16 + 16384) + 32 >> 6) : arg0.anInt9941 * local16 + 32 >> 6;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass354_1.method8093()) {
			@Pc(12) int local12 = this.anInt3663 * this.aClass354_1.anInt9717 / Static227.anInt3654;
			do {
				@Pc(21) long local21 = (long) local12 * (long) arg2 + this.aLong131;
				if (this.aLong132 - local21 >= 0L) {
					this.aLong131 = local21;
					break;
				}
				@Pc(50) int local50 = (int) ((this.aLong132 + (long) local12 - this.aLong131 - 1L) / (long) local12);
				this.aLong131 += (long) local50 * (long) local12;
				this.aClass5_Sub14_Sub5_1.method8781(arg0, arg1, local50);
				arg2 -= local50;
				arg1 += local50;
				this.method3229();
			} while (this.aClass354_1.method8093());
		}
		this.aClass5_Sub14_Sub5_1.method8781(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8778(@OriginalArg(0) int arg0) {
		if (this.aClass354_1.method8093()) {
			@Pc(18) int local18 = this.aClass354_1.anInt9717 * this.anInt3663 / Static227.anInt3654;
			do {
				@Pc(27) long local27 = this.aLong131 + (long) arg0 * (long) local18;
				if (this.aLong132 - local27 >= 0L) {
					this.aLong131 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong132 + (long) local18 - this.aLong131 - 1L) / (long) local18);
				this.aLong131 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass5_Sub14_Sub5_1.method8778(local57);
				this.method3229();
			} while (this.aClass354_1.method8093());
		}
		this.aClass5_Sub14_Sub5_1.method8778(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!jm;ZJZ)V")
	public synchronized void method3239(@OriginalArg(1) Class5_Sub31 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) boolean arg2) {
		this.method3233(true, arg0, arg2);
		this.method3232(arg1 * (long) this.aClass354_1.anInt9717);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)V")
	private void method3240(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method3256(local32, local20, local26);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 > 0) {
				this.method3230(local32, local26, local20);
			} else {
				this.method3256(64, local20, local26);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method3224(local20, local26, local32);
		} else if (local13 == 176) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray218[local20] = (this.anIntArray218[local20] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray218[local20] = (this.anIntArray218[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray211[local20] = (local32 << 7) + (this.anIntArray211[local20] & 0xFFFFC07F);
			}
			if (local26 == 33) {
				this.anIntArray211[local20] = local32 + (this.anIntArray211[local20] & 0xFFFFFF80);
			}
			if (local26 == 5) {
				this.anIntArray208[local20] = (local32 << 7) + (this.anIntArray208[local20] & 0xFFFFC07F);
			}
			if (local26 == 37) {
				this.anIntArray208[local20] = (this.anIntArray208[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 7) {
				this.anIntArray215[local20] = (this.anIntArray215[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 39) {
				this.anIntArray215[local20] = local32 + (this.anIntArray215[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray212[local20] = (this.anIntArray212[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray212[local20] = (this.anIntArray212[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 11) {
				this.anIntArray205[local20] = (local32 << 7) + (this.anIntArray205[local20] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray205[local20] = (this.anIntArray205[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 64) {
				if (local32 >= 64) {
					this.anIntArray219[local20] |= 0x1;
				} else {
					this.anIntArray219[local20] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local32 >= 64) {
					this.anIntArray219[local20] |= 0x2;
				} else {
					this.method3236(local20);
					this.anIntArray219[local20] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray207[local20] = (this.anIntArray207[local20] & 0x7F) + (local32 << 7);
			}
			if (local26 == 98) {
				this.anIntArray207[local20] = (this.anIntArray207[local20] & 0x3F80) + local32;
			}
			if (local26 == 101) {
				this.anIntArray207[local20] = (local32 << 7) + ((this.anIntArray207[local20] & 0x7F) + 16384);
			}
			if (local26 == 100) {
				this.anIntArray207[local20] = (this.anIntArray207[local20] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method3250(local20);
			}
			if (local26 == 121) {
				this.method3228(local20);
			}
			if (local26 == 123) {
				this.method3226(local20);
			}
			@Pc(507) int local507;
			if (local26 == 6) {
				local507 = this.anIntArray207[local20];
				if (local507 == 16384) {
					this.anIntArray213[local20] = (local32 << 7) + (this.anIntArray213[local20] & 0xFFFFC07F);
				}
			}
			if (local26 == 38) {
				local507 = this.anIntArray207[local20];
				if (local507 == 16384) {
					this.anIntArray213[local20] = (this.anIntArray213[local20] & 0xFFFFFF80) + local32;
				}
			}
			if (local26 == 16) {
				this.anIntArray209[local20] = (local32 << 7) + (this.anIntArray209[local20] & 0xFFFFC07F);
			}
			if (local26 == 48) {
				this.anIntArray209[local20] = local32 + (this.anIntArray209[local20] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local32 < 64) {
					this.method3231(local20);
					this.anIntArray219[local20] &= 0xFFFFFFFB;
				} else {
					this.anIntArray219[local20] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method3244((local32 << 7) + (this.anIntArray206[local20] & 0xFFFFC07F), local20);
			}
			if (local26 == 49) {
				this.method3244((this.anIntArray206[local20] & 0xFFFFFF80) + local32, local20);
			}
		} else if (local13 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method3225(local20, local26 + this.anIntArray218[local20]);
		} else if (local13 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method3253(local26, local20);
		} else if (local13 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F3E) >> 8);
			this.method3249(local20, local26);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method3243(true);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()Lclient!eha;")
	@Override
	public synchronized Class5_Sub14 method8779() {
		return this.aClass5_Sub14_Sub5_1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z")
	public synchronized boolean method3241() {
		return this.aClass354_1.method8093();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
	private void method3243(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method3250(-1);
		} else {
			this.method3226(-1);
		}
		this.method3228(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray210[local20] = this.anIntArray217[local20];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray218[local43] = this.anIntArray217[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
	private void method3244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray206[arg1] = arg0;
		this.anIntArray214[arg1] = (int) ((double) 2097152 * Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(II)V")
	public synchronized void method3245(@OriginalArg(1) int arg0) {
		this.anInt3625 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!uw;I)I")
	private int method3246(@OriginalArg(0) Class5_Sub53 arg0) {
		@Pc(14) int local14 = (arg0.anInt9922 * arg0.anInt9926 >> 12) + arg0.anInt9928;
		local14 += (this.anIntArray203[arg0.anInt9937] - 8192) * this.anIntArray213[arg0.anInt9937] >> 12;
		@Pc(35) Class163 local35 = arg0.aClass163_1;
		@Pc(52) int local52;
		if (local35.anInt3964 > 0 && (local35.anInt3967 > 0 || this.anIntArray211[arg0.anInt9937] > 0)) {
			local52 = local35.anInt3967 << 2;
			@Pc(57) int local57 = local35.anInt3966 << 1;
			if (arg0.anInt9938 < local57) {
				local52 = arg0.anInt9938 * local52 / local57;
			}
			local52 += this.anIntArray211[arg0.anInt9937] >> 7;
			@Pc(87) double local87 = Math.sin((double) (arg0.anInt9933 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local87 * (double) local52);
		}
		local52 = (int) ((double) (arg0.aClass5_Sub9_Sub1_4.anInt490 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static227.anInt3654 + 0.5D);
		return local52 >= 1 ? local52 : 1;
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	public synchronized void method3247() {
		this.method3257(true);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)V")
	public synchronized void method3248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray216[arg0] = arg1;
		} else {
			for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
				this.anIntArray216[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(III)V")
	private void method3249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray203[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IB)V")
	private void method3250(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class5_Sub53 local16 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2572(); local16 != null; local16 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2569()) {
			if (arg0 < 0 || local16.anInt9937 == arg0) {
				if (local16.aClass5_Sub14_Sub1_4 != null) {
					local16.aClass5_Sub14_Sub1_4.method1340(Static227.anInt3654 / 100);
					if (local16.aClass5_Sub14_Sub1_4.method1371()) {
						this.aClass5_Sub14_Sub5_1.aClass5_Sub14_Sub3_2.method2298(local16.aClass5_Sub14_Sub1_4);
					}
					local16.method8267();
				}
				if (local16.anInt9942 < 0) {
					this.aClass5_Sub53ArrayArray1[local16.anInt9937][local16.anInt9934] = null;
				}
				local16.method8829();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!bia;ILclient!jm;BLclient!cb;)Z")
	public synchronized boolean method3251(@OriginalArg(0) Class37 arg0, @OriginalArg(2) Class5_Sub31 arg1, @OriginalArg(4) Class50 arg2) {
		arg1.method3897();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(31) Class5_Sub32 local31 = (Class5_Sub32) arg1.aClass335_22.method7768(); local31 != null; local31 = (Class5_Sub32) arg1.aClass335_22.method7777()) {
			@Pc(43) int local43 = (int) local31.aLong329;
			@Pc(51) Class5_Sub46 local51 = (Class5_Sub46) this.aClass335_20.method7766((long) local43);
			if (local51 == null) {
				local51 = Static99.method1645(arg2, local43);
				if (local51 == null) {
					local9 = false;
					continue;
				}
				this.aClass335_20.method7770((long) local43, local51);
			}
			if (!local51.method7499(arg0, local31.aByteArray58, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method3896();
		}
		return local9;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[IIILclient!uw;)Z")
	public boolean method3252(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class5_Sub53 arg3) {
		arg3.anInt9923 = Static227.anInt3654 / 100;
		if (arg3.anInt9942 >= 0 && (arg3.aClass5_Sub14_Sub1_4 == null || arg3.aClass5_Sub14_Sub1_4.method1343())) {
			arg3.method8267();
			arg3.method8829();
			if (arg3.anInt9925 > 0 && this.aClass5_Sub53ArrayArray2[arg3.anInt9937][arg3.anInt9925] == arg3) {
				this.aClass5_Sub53ArrayArray2[arg3.anInt9937][arg3.anInt9925] = null;
			}
			return true;
		}
		@Pc(57) int local57 = arg3.anInt9922;
		if (local57 > 0) {
			local57 -= (int) (Math.pow(2.0D, (double) this.anIntArray208[arg3.anInt9937] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local57 < 0) {
				local57 = 0;
			}
			arg3.anInt9922 = local57;
		}
		arg3.aClass5_Sub14_Sub1_4.method1375(this.method3246(arg3));
		@Pc(97) Class163 local97 = arg3.aClass163_1;
		@Pc(99) boolean local99 = false;
		arg3.anInt9933 += local97.anInt3964;
		arg3.anInt9938++;
		@Pc(130) double local130 = (double) ((arg3.anInt9922 * arg3.anInt9926 >> 12) + (arg3.anInt9934 - 60 << 8)) * 5.086263020833333E-6D;
		if (local97.anInt3965 > 0) {
			if (local97.anInt3962 <= 0) {
				arg3.anInt9929 += 128;
			} else {
				arg3.anInt9929 += (int) (Math.pow(2.0D, (double) local97.anInt3962 * local130) * 128.0D + 0.5D);
			}
			if (local97.anInt3965 * arg3.anInt9929 >= 819200) {
				local99 = true;
			}
		}
		if (local97.aByteArray44 != null) {
			if (local97.anInt3963 <= 0) {
				arg3.anInt9935 += 128;
			} else {
				arg3.anInt9935 += (int) (Math.pow(2.0D, (double) local97.anInt3963 * local130) * 128.0D + 0.5D);
			}
			while (arg3.anInt9930 < local97.aByteArray44.length - 2 && (local97.aByteArray44[arg3.anInt9930 + 2] & 0xFF) << 8 < arg3.anInt9935) {
				arg3.anInt9930 += 2;
			}
			if (local97.aByteArray44.length - 2 == arg3.anInt9930 && local97.aByteArray44[arg3.anInt9930 + 1] == 0) {
				local99 = true;
			}
		}
		if (arg3.anInt9942 >= 0 && local97.aByteArray43 != null && (this.anIntArray219[arg3.anInt9937] & 0x1) == 0 && (arg3.anInt9925 < 0 || this.aClass5_Sub53ArrayArray2[arg3.anInt9937][arg3.anInt9925] != arg3)) {
			if (local97.anInt3969 <= 0) {
				arg3.anInt9942 += 128;
			} else {
				arg3.anInt9942 += (int) (Math.pow(2.0D, (double) local97.anInt3969 * local130) * 128.0D + 0.5D);
			}
			while (arg3.anInt9936 < local97.aByteArray43.length - 2 && arg3.anInt9942 > (local97.aByteArray43[arg3.anInt9936 + 2] & 0xFF) << 8) {
				arg3.anInt9936 += 2;
			}
			if (arg3.anInt9936 == local97.aByteArray43.length - 2) {
				local99 = true;
			}
		}
		if (!local99) {
			arg3.aClass5_Sub14_Sub1_4.method1366(arg3.anInt9923, this.method3237(arg3), this.method3238(arg3));
			return false;
		}
		arg3.aClass5_Sub14_Sub1_4.method1340(arg3.anInt9923);
		if (arg1 == null) {
			arg3.aClass5_Sub14_Sub1_4.method8778(arg2);
		} else {
			arg3.aClass5_Sub14_Sub1_4.method8781(arg1, arg0, arg2);
		}
		if (arg3.aClass5_Sub14_Sub1_4.method1371()) {
			this.aClass5_Sub14_Sub5_1.aClass5_Sub14_Sub3_2.method2298(arg3.aClass5_Sub14_Sub1_4);
		}
		arg3.method8267();
		if (arg3.anInt9942 >= 0) {
			arg3.method8829();
			if (arg3.anInt9925 > 0 && this.aClass5_Sub53ArrayArray2[arg3.anInt9937][arg3.anInt9925] == arg3) {
				this.aClass5_Sub53ArrayArray2[arg3.anInt9937][arg3.anInt9925] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BII)V")
	private void method3253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)V")
	public synchronized void method3255() {
		for (@Pc(12) Class5_Sub46 local12 = (Class5_Sub46) this.aClass335_20.method7768(); local12 != null; local12 = (Class5_Sub46) this.aClass335_20.method7777()) {
			local12.method8829();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIBI)V")
	private void method3256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class5_Sub53 local10 = this.aClass5_Sub53ArrayArray1[arg1][arg2];
		if (local10 == null) {
			return;
		}
		this.aClass5_Sub53ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray219[arg1] & 0x2) == 0) {
			local10.anInt9942 = 0;
			return;
		}
		for (@Pc(43) Class5_Sub53 local43 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2572(); local43 != null; local43 = (Class5_Sub53) this.aClass5_Sub14_Sub5_1.aClass124_108.method2569()) {
			if (local43.anInt9937 == local10.anInt9937 && local43.anInt9942 < 0 && local10 != local43) {
				local10.anInt9942 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	private synchronized void method3257(@OriginalArg(0) boolean arg0) {
		this.aClass354_1.method8094();
		this.aClass5_Sub31_1 = null;
		this.method3243(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLclient!jm;)V")
	public synchronized void method3258(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub31 arg1) {
		this.method3233(true, arg1, arg0);
	}
}
