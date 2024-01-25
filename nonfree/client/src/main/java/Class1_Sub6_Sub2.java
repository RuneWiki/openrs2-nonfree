import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!qm", name = "Eb", descriptor = "Z")
	private boolean aBoolean647;

	@OriginalMember(owner = "client!qm", name = "Fb", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!qm", name = "Gb", descriptor = "I")
	private int anInt5688;

	@OriginalMember(owner = "client!qm", name = "Ib", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!qm", name = "Jb", descriptor = "I")
	private int anInt5689;

	@OriginalMember(owner = "client!qm", name = "Kb", descriptor = "Lclient!m;")
	private Class1_Sub31 aClass1_Sub31_2;

	@OriginalMember(owner = "client!qm", name = "Lb", descriptor = "I")
	private int anInt5690;

	@OriginalMember(owner = "client!qm", name = "Mb", descriptor = "Z")
	private boolean aBoolean648;

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "[I")
	private final int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "[I")
	public final int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "[I")
	private final int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!qm", name = "Z", descriptor = "[I")
	private final int[] anIntArray381 = new int[16];

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "[I")
	public final int[] anIntArray378 = new int[16];

	@OriginalMember(owner = "client!qm", name = "fb", descriptor = "[I")
	private final int[] anIntArray383 = new int[16];

	@OriginalMember(owner = "client!qm", name = "eb", descriptor = "[I")
	private final int[] anIntArray382 = new int[16];

	@OriginalMember(owner = "client!qm", name = "jb", descriptor = "I")
	private int anInt5673 = 256;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "[I")
	public final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "[I")
	private final int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!qm", name = "nb", descriptor = "[I")
	private final int[] anIntArray385 = new int[16];

	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "[I")
	private final int[] anIntArray380 = new int[16];

	@OriginalMember(owner = "client!qm", name = "mb", descriptor = "[I")
	private final int[] anIntArray384 = new int[16];

	@OriginalMember(owner = "client!qm", name = "W", descriptor = "[[Lclient!ig;")
	private final Class1_Sub23[][] aClass1_Sub23ArrayArray2 = new Class1_Sub23[16][128];

	@OriginalMember(owner = "client!qm", name = "vb", descriptor = "I")
	private final int anInt5682 = 1000000;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "[[Lclient!ig;")
	private final Class1_Sub23[][] aClass1_Sub23ArrayArray1 = new Class1_Sub23[16][128];

	@OriginalMember(owner = "client!qm", name = "Ab", descriptor = "[I")
	private final int[] anIntArray387 = new int[16];

	@OriginalMember(owner = "client!qm", name = "Cb", descriptor = "[I")
	private final int[] anIntArray388 = new int[16];

	@OriginalMember(owner = "client!qm", name = "xb", descriptor = "[I")
	private final int[] anIntArray386 = new int[16];

	@OriginalMember(owner = "client!qm", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "Lclient!pd;")
	private final Class185 aClass185_1 = new Class185();

	@OriginalMember(owner = "client!qm", name = "Hb", descriptor = "Lclient!bf;")
	private final Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1(this);

	@OriginalMember(owner = "client!qm", name = "J", descriptor = "Lclient!qh;")
	private final Class199 aClass199_153 = new Class199(128);

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class1_Sub6_Sub2() {
		this.method4457();
		this.method4473(true);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ig;B[II)Z")
	public boolean method4448(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub23 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt2763 = Static228.anInt4846 / 100;
		if (arg1.anInt2777 >= 0 && (arg1.aClass1_Sub6_Sub3_3 == null || arg1.aClass1_Sub6_Sub3_3.method4644())) {
			arg1.method2393();
			arg1.method5915();
			if (arg1.anInt2758 > 0 && this.aClass1_Sub23ArrayArray1[arg1.anInt2778][arg1.anInt2758] == arg1) {
				this.aClass1_Sub23ArrayArray1[arg1.anInt2778][arg1.anInt2758] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt2779;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray381[arg1.anInt2778] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt2779 = local56;
		}
		arg1.aClass1_Sub6_Sub3_3.method4674(this.method4469(arg1));
		@Pc(99) Class210 local99 = arg1.aClass210_1;
		arg1.anInt2775 += local99.anInt5956;
		arg1.anInt2768++;
		@Pc(120) boolean local120 = false;
		@Pc(139) double local139 = (double) ((arg1.anInt2761 - 60 << 8) + (arg1.anInt2779 * arg1.anInt2767 >> 12)) * 5.086263020833333E-6D;
		if (local99.anInt5955 > 0) {
			if (local99.anInt5957 <= 0) {
				arg1.anInt2771 += 128;
			} else {
				arg1.anInt2771 += (int) (Math.pow(2.0D, local139 * (double) local99.anInt5957) * 128.0D + 0.5D);
			}
			if (local99.anInt5955 * arg1.anInt2771 >= 819200) {
				local120 = true;
			}
		}
		if (local99.aByteArray72 != null) {
			if (local99.anInt5951 > 0) {
				arg1.anInt2770 += (int) (Math.pow(2.0D, local139 * (double) local99.anInt5951) * 128.0D + 0.5D);
			} else {
				arg1.anInt2770 += 128;
			}
			while (local99.aByteArray72.length - 2 > arg1.anInt2765 && (local99.aByteArray72[arg1.anInt2765 + 2] & 0xFF) << 8 < arg1.anInt2770) {
				arg1.anInt2765 += 2;
			}
			if (local99.aByteArray72.length - 2 == arg1.anInt2765 && local99.aByteArray72[arg1.anInt2765 + 1] == 0) {
				local120 = true;
			}
		}
		if (arg1.anInt2777 >= 0 && local99.aByteArray73 != null && (this.anIntArray376[arg1.anInt2778] & 0x1) == 0 && (arg1.anInt2758 < 0 || arg1 != this.aClass1_Sub23ArrayArray1[arg1.anInt2778][arg1.anInt2758])) {
			if (local99.anInt5949 > 0) {
				arg1.anInt2777 += (int) (Math.pow(2.0D, (double) local99.anInt5949 * local139) * 128.0D + 0.5D);
			} else {
				arg1.anInt2777 += 128;
			}
			while (local99.aByteArray73.length - 2 > arg1.anInt2760 && arg1.anInt2777 > (local99.aByteArray73[arg1.anInt2760 + 2] & 0xFF) << 8) {
				arg1.anInt2760 += 2;
			}
			if (local99.aByteArray73.length - 2 == arg1.anInt2760) {
				local120 = true;
			}
		}
		if (!local120) {
			arg1.aClass1_Sub6_Sub3_3.method4660(arg1.anInt2763, this.method4454(arg1), this.method4451(arg1));
			return false;
		}
		arg1.aClass1_Sub6_Sub3_3.method4653(arg1.anInt2763);
		if (arg2 == null) {
			arg1.aClass1_Sub6_Sub3_3.method5166(arg3);
		} else {
			arg1.aClass1_Sub6_Sub3_3.method5171(arg2, arg0, arg3);
		}
		if (arg1.aClass1_Sub6_Sub3_3.method4675()) {
			this.aClass1_Sub6_Sub1_1.aClass1_Sub6_Sub4_1.method5175(arg1.aClass1_Sub6_Sub3_3);
		}
		arg1.method2393();
		if (arg1.anInt2777 >= 0) {
			arg1.method5915();
			if (arg1.anInt2758 > 0 && this.aClass1_Sub23ArrayArray1[arg1.anInt2778][arg1.anInt2758] == arg1) {
				this.aClass1_Sub23ArrayArray1[arg1.anInt2778][arg1.anInt2758] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZLclient!ig;)V")
	public void method4449(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub23 arg1) {
		@Pc(16) int local16 = arg1.aClass1_Sub25_Sub1_1.aByteArray37.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass1_Sub25_Sub1_1.aBoolean384) {
			@Pc(46) int local46 = local16 + local16 - arg1.aClass1_Sub25_Sub1_1.anInt3340;
			local35 = (int) ((long) this.anIntArray379[arg1.anInt2778] * (long) local46 >> 6);
			local16 <<= 0x8;
			if (local16 <= local35) {
				arg1.aClass1_Sub6_Sub3_3.method4642();
				local35 = local16 + local16 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) this.anIntArray379[arg1.anInt2778] * (long) local16 >> 6);
		}
		arg1.aClass1_Sub6_Sub3_3.method4637(local35);
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
	public synchronized void method4450() {
		for (@Pc(7) Class1_Sub41 local7 = (Class1_Sub41) this.aClass199_153.method4392(); local7 != null; local7 = (Class1_Sub41) this.aClass199_153.method4393()) {
			local7.method5639();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ig;I)I")
	private int method4451(@OriginalArg(0) Class1_Sub23 arg0) {
		@Pc(18) int local18 = this.anIntArray377[arg0.anInt2778];
		return local18 < 8192 ? local18 * arg0.anInt2766 + 32 >> 6 : 16384 - ((16384 - local18) * (-arg0.anInt2766 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)V")
	private void method4452(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub23 local8 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4967(); local8 != null; local8 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4973()) {
			if (arg0 < 0 || local8.anInt2778 == arg0) {
				if (local8.aClass1_Sub6_Sub3_3 != null) {
					local8.aClass1_Sub6_Sub3_3.method4653(Static228.anInt4846 / 100);
					if (local8.aClass1_Sub6_Sub3_3.method4675()) {
						this.aClass1_Sub6_Sub1_1.aClass1_Sub6_Sub4_1.method5175(local8.aClass1_Sub6_Sub3_3);
					}
					local8.method2393();
				}
				if (local8.anInt2777 < 0) {
					this.aClass1_Sub23ArrayArray2[local8.anInt2778][local8.anInt2761] = null;
				}
				local8.method5915();
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ig;)I")
	private int method4454(@OriginalArg(1) Class1_Sub23 arg0) {
		if (this.anIntArray383[arg0.anInt2778] == 0) {
			return 0;
		}
		@Pc(14) Class210 local14 = arg0.aClass210_1;
		@Pc(30) int local30 = this.anIntArray380[arg0.anInt2778] * this.anIntArray374[arg0.anInt2778] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt2774 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt5673 + 128 >> 8;
		local30 = this.anIntArray383[arg0.anInt2778] * local56 + 128 >> 8;
		if (local14.anInt5955 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt5955 * (double) arg0.anInt2771 * 1.953125E-5D) * (double) local30 + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(128) int local128;
		@Pc(140) int local140;
		if (local14.aByteArray72 != null) {
			local98 = arg0.anInt2770;
			local106 = local14.aByteArray72[arg0.anInt2765 + 1];
			if (arg0.anInt2765 < local14.aByteArray72.length - 2) {
				local128 = (local14.aByteArray72[arg0.anInt2765] & 0xFF) << 8;
				local140 = (local14.aByteArray72[arg0.anInt2765 + 2] & 0xFF) << 8;
				local106 += (local98 - local128) * (-local106 + local14.aByteArray72[arg0.anInt2765 + 3]) / (local140 - local128);
			}
			local30 = local106 * local30 + 32 >> 6;
		}
		if (arg0.anInt2777 > 0 && local14.aByteArray73 != null) {
			local98 = arg0.anInt2777;
			local106 = local14.aByteArray73[arg0.anInt2760 + 1];
			if (arg0.anInt2760 < local14.aByteArray73.length - 2) {
				local128 = (local14.aByteArray73[arg0.anInt2760] & 0xFF) << 8;
				local140 = (local14.aByteArray73[arg0.anInt2760 + 2] & 0xFF) << 8;
				local106 += (local98 - local128) * (-local106 + local14.aByteArray73[arg0.anInt2760 - -3]) / (local140 - local128);
			}
			local30 = local106 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V")
	private void method4455(@OriginalArg(0) int arg0) {
		if ((this.anIntArray376[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub23 local15 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4967(); local15 != null; local15 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4973()) {
			if (local15.anInt2778 == arg0 && this.aClass1_Sub23ArrayArray2[arg0][local15.anInt2761] == null && local15.anInt2777 < 0) {
				local15.anInt2777 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	private void method4456(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4456(local12);
			}
			return;
		}
		this.anIntArray374[arg0] = 12800;
		this.anIntArray377[arg0] = 8192;
		this.anIntArray380[arg0] = 16383;
		this.anIntArray384[arg0] = 8192;
		this.anIntArray385[arg0] = 0;
		this.anIntArray381[arg0] = 8192;
		this.method4455(arg0);
		this.method4474(arg0);
		this.anIntArray376[arg0] = 0;
		this.anIntArray382[arg0] = 32767;
		this.anIntArray388[arg0] = 256;
		this.anIntArray379[arg0] = 0;
		this.method4483(arg0, 8192);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)V")
	private synchronized void method4457() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray383[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5171(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass185_1.method4124()) {
			@Pc(14) int local14 = this.anInt5682 * this.aClass185_1.anInt5247 / Static228.anInt4846;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong171;
				if (this.aLong172 - local23 >= 0L) {
					this.aLong171 = local23;
					break;
				}
				@Pc(51) int local51 = (int) ((this.aLong172 + (long) local14 - this.aLong171 - 1L) / (long) local14);
				this.aLong171 += (long) local14 * (long) local51;
				this.aClass1_Sub6_Sub1_1.method5171(arg0, arg1, local51);
				arg2 -= local51;
				arg1 += local51;
				this.method4460();
			} while (this.aClass185_1.method4124());
		}
		this.aClass1_Sub6_Sub1_1.method5171(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZB)V")
	private synchronized void method4459(@OriginalArg(0) boolean arg0) {
		this.aClass185_1.method4132();
		this.aClass1_Sub31_2 = null;
		this.method4473(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
	private void method4460() {
		@Pc(8) int local8 = this.anInt5689;
		@Pc(17) int local17 = this.anInt5688;
		@Pc(20) long local20 = this.aLong172;
		if (this.aClass1_Sub31_2 != null && local17 == this.anInt5690) {
			this.method4470(this.aClass1_Sub31_2, this.aBoolean648, this.aBoolean647);
			this.method4460();
			return;
		}
		while (local17 == this.anInt5688) {
			while (this.aClass185_1.anIntArray346[local8] == local17) {
				this.aClass185_1.method4128(local8);
				@Pc(53) int local53 = this.aClass185_1.method4131(local8);
				if (local53 == 1) {
					this.aClass185_1.method4127();
					this.aClass185_1.method4123(local8);
					if (this.aClass185_1.method4129()) {
						if (this.aClass1_Sub31_2 != null) {
							this.method4466(this.aBoolean647, this.aClass1_Sub31_2);
							this.method4460();
							return;
						}
						if (!this.aBoolean647 || local17 == 0) {
							this.method4473(true);
							this.aClass185_1.method4132();
							return;
						}
						this.aClass185_1.method4138(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method4477(local53);
				}
				this.aClass185_1.method4125(local8);
				this.aClass185_1.method4123(local8);
			}
			local8 = this.aClass185_1.method4133();
			local17 = this.aClass185_1.anIntArray346[local8];
			local20 = this.aClass185_1.method4126(local17);
		}
		this.anInt5689 = local8;
		this.aLong172 = local20;
		this.anInt5688 = local17;
		if (this.aClass1_Sub31_2 != null && this.anInt5690 < local17) {
			this.anInt5688 = this.anInt5690;
			this.anInt5689 = -1;
			this.aLong172 = this.aClass185_1.method4126(this.anInt5688);
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method4461() {
		return this.aClass185_1.method4124();
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(BI)V")
	private void method4462(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub23 local16 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4967(); local16 != null; local16 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4973()) {
			if ((arg0 < 0 || arg0 == local16.anInt2778) && local16.anInt2777 < 0) {
				this.aClass1_Sub23ArrayArray2[local16.anInt2778][local16.anInt2761] = null;
				local16.anInt2777 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ig;B)Z")
	public boolean method4463(@OriginalArg(0) Class1_Sub23 arg0) {
		if (arg0.aClass1_Sub6_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt2777 >= 0) {
			arg0.method5915();
			if (arg0.anInt2758 > 0 && this.aClass1_Sub23ArrayArray1[arg0.anInt2778][arg0.anInt2758] == arg0) {
				this.aClass1_Sub23ArrayArray1[arg0.anInt2778][arg0.anInt2758] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
	private void method4464() {
		this.anIntArray387[9] = 128;
		this.lb[9] = 128;
		this.method4472(128, 9);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIII)V")
	private void method4465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub23 local12 = this.aClass1_Sub23ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub23ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray376[arg0] & 0x2) == 0) {
			local12.anInt2777 = 0;
			return;
		}
		for (@Pc(39) Class1_Sub23 local39 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4967(); local39 != null; local39 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4973()) {
			if (local12.anInt2778 == local39.anInt2778 && local39.anInt2777 < 0 && local12 != local39) {
				local12.anInt2777 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5166(@OriginalArg(0) int arg0) {
		if (this.aClass185_1.method4124()) {
			@Pc(18) int local18 = this.aClass185_1.anInt5247 * this.anInt5682 / Static228.anInt4846;
			do {
				@Pc(28) long local28 = this.aLong171 + (long) local18 * (long) arg0;
				if (this.aLong172 - local28 >= 0L) {
					this.aLong171 = local28;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local18 + this.aLong172 - this.aLong171 - 1L) / (long) local18);
				this.aLong171 += (long) local59 * (long) local18;
				arg0 -= local59;
				this.aClass1_Sub6_Sub1_1.method5166(local59);
				this.method4460();
			} while (this.aClass185_1.method4124());
		}
		this.aClass1_Sub6_Sub1_1.method5166(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!m;Z)V")
	public synchronized void method4466(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub31 arg1) {
		this.method4470(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(III)V")
	private void method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray384[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBI)V")
	private void method4468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!ig;)I")
	private int method4469(@OriginalArg(1) Class1_Sub23 arg0) {
		@Pc(22) int local22 = (arg0.anInt2779 * arg0.anInt2767 >> 12) + arg0.anInt2764;
		local22 += this.anIntArray388[arg0.anInt2778] * (this.anIntArray384[arg0.anInt2778] - 8192) >> 12;
		@Pc(43) Class210 local43 = arg0.aClass210_1;
		@Pc(66) int local66;
		if (local43.anInt5956 > 0 && (local43.anInt5952 > 0 || this.anIntArray385[arg0.anInt2778] > 0)) {
			local66 = local43.anInt5952 << 2;
			@Pc(71) int local71 = local43.anInt5953 << 1;
			if (local71 > arg0.anInt2768) {
				local66 = arg0.anInt2768 * local66 / local71;
			}
			local66 += this.anIntArray385[arg0.anInt2778] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt2775 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local105 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub25_Sub1_1.anInt3338 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static228.anInt4846 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!m;ZZI)V")
	private synchronized void method4470(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method4459(arg1);
		this.aClass185_1.method4130(arg0.aByteArray52);
		this.aBoolean647 = arg2;
		this.aLong171 = 0;
		@Pc(25) int local25 = this.aClass185_1.method4137();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass185_1.method4128(local27);
			this.aClass185_1.method4125(local27);
			this.aClass185_1.method4123(local27);
		}
		this.anInt5689 = this.aClass185_1.method4133();
		this.anInt5688 = this.aClass185_1.anIntArray346[this.anInt5689];
		this.aLong172 = this.aClass185_1.method4126(this.anInt5688);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IIII)V")
	private void method4471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4465(arg1, arg0, 64);
		if ((this.anIntArray376[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub23 local28 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4978(); local28 != null; local28 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4969()) {
				if (arg1 == local28.anInt2778 && local28.anInt2777 < 0) {
					this.aClass1_Sub23ArrayArray2[arg1][local28.anInt2761] = null;
					this.aClass1_Sub23ArrayArray2[arg1][arg0] = local28;
					@Pc(70) int local70 = (local28.anInt2767 * local28.anInt2779 >> 12) + local28.anInt2764;
					local28.anInt2764 += arg0 - local28.anInt2761 << 8;
					local28.anInt2767 = local70 - local28.anInt2764;
					local28.anInt2761 = arg0;
					local28.anInt2779 = 4096;
					return;
				}
			}
		}
		@Pc(116) Class1_Sub41 local116 = (Class1_Sub41) this.aClass199_153.method4387((long) this.anIntArray386[arg1]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class1_Sub25_Sub1 local124 = local116.aClass1_Sub25_Sub1Array1[arg0];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class1_Sub23 local131 = new Class1_Sub23();
		local131.aClass1_Sub25_Sub1_1 = local124;
		local131.anInt2778 = arg1;
		local131.aClass1_Sub41_1 = local116;
		local131.aClass210_1 = local116.aClass210Array1[arg0];
		local131.anInt2758 = local116.aByteArray90[arg0];
		local131.anInt2761 = arg0;
		local131.anInt2774 = local116.aByteArray91[arg0] * arg2 * arg2 * local116.anInt7193 + 1024 >> 11;
		local131.anInt2766 = local116.aByteArray92[arg0] & 0xFF;
		local131.anInt2764 = (arg0 << 8) - (local116.aShortArray113[arg0] & 0x7FFF);
		local131.anInt2777 = -1;
		local131.anInt2765 = 0;
		local131.anInt2770 = 0;
		local131.anInt2760 = 0;
		local131.anInt2771 = 0;
		if (this.anIntArray379[arg1] == 0) {
			local131.aClass1_Sub6_Sub3_3 = Static466.method4640(local124, this.method4469(local131), this.method4454(local131), this.method4451(local131));
		} else {
			local131.aClass1_Sub6_Sub3_3 = Static466.method4640(local124, this.method4469(local131), 0, this.method4451(local131));
			this.method4449(local116.aShortArray113[arg0] < 0, local131);
		}
		if (local116.aShortArray113[arg0] < 0) {
			local131.aClass1_Sub6_Sub3_3.method4638(-1);
		}
		if (local131.anInt2758 >= 0) {
			@Pc(281) Class1_Sub23 local281 = this.aClass1_Sub23ArrayArray1[arg1][local131.anInt2758];
			if (local281 != null && local281.anInt2777 < 0) {
				this.aClass1_Sub23ArrayArray2[arg1][local281.anInt2761] = null;
				local281.anInt2777 = 0;
			}
			this.aClass1_Sub23ArrayArray1[arg1][local131.anInt2758] = local131;
		}
		this.aClass1_Sub6_Sub1_1.aClass227_4.method4972(local131);
		this.aClass1_Sub23ArrayArray2[arg1][arg0] = local131;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)V")
	private void method4472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray386[arg1]) {
			this.anIntArray386[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass1_Sub23ArrayArray1[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
	private void method4473(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4452(-1);
		} else {
			this.method4462(-1);
		}
		this.method4456(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray386[local23] = this.anIntArray387[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.lb[local41] = this.anIntArray387[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
	private void method4474(@OriginalArg(0) int arg0) {
		if ((this.anIntArray376[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub23 local15 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4967(); local15 != null; local15 = (Class1_Sub23) this.aClass1_Sub6_Sub1_1.aClass227_4.method4973()) {
			if (arg0 == local15.anInt2778) {
				local15.anInt2772 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)I")
	public int method4475() {
		return this.anInt5673;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(III)V")
	private void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(BI)V")
	private void method4477(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4465(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method4471(local24, local18, local30);
			} else {
				this.method4465(local18, local24, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4468(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.lb[local18] = (this.lb[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.lb[local18] = (local30 << 7) + (this.lb[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray385[local18] = (this.anIntArray385[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray385[local18] = (this.anIntArray385[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray381[local18] = (this.anIntArray381[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray381[local18] = (this.anIntArray381[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray374[local18] = (local30 << 7) + (this.anIntArray374[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray374[local18] = (this.anIntArray374[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray377[local18] = (local30 << 7) + (this.anIntArray377[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray377[local18] = (this.anIntArray377[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray380[local18] = (local30 << 7) + (this.anIntArray380[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray380[local18] = (this.anIntArray380[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray376[local18] |= 0x1;
				} else {
					this.anIntArray376[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4455(local18);
					this.anIntArray376[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray376[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray382[local18] = (local30 << 7) + (this.anIntArray382[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray382[local18] = local30 + (this.anIntArray382[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray382[local18] = (this.anIntArray382[local18] & 0x7F) + ((local30 << 7) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray382[local18] = (this.anIntArray382[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method4452(local18);
			}
			if (local24 == 121) {
				this.method4456(local18);
			}
			if (local24 == 123) {
				this.method4462(local18);
			}
			@Pc(506) int local506;
			if (local24 == 6) {
				local506 = this.anIntArray382[local18];
				if (local506 == 16384) {
					this.anIntArray388[local18] = (local30 << 7) + (this.anIntArray388[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local506 = this.anIntArray382[local18];
				if (local506 == 16384) {
					this.anIntArray388[local18] = local30 + (this.anIntArray388[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray379[local18] = (this.anIntArray379[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray379[local18] = (this.anIntArray379[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method4474(local18);
					this.anIntArray376[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray376[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method4483(local18, (local30 << 7) + (this.anIntArray375[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method4483(local18, local30 + (this.anIntArray375[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4472(local24 + this.lb[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4476(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4467(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4473(true);
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)V")
	public synchronized void method4478() {
		this.method4459(true);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5165() {
		return 0;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V")
	public synchronized void method4479(@OriginalArg(0) int arg0) {
		this.anInt5673 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "()Lclient!vb;")
	@Override
	public synchronized Class1_Sub6 method5168() {
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "(I)V")
	public synchronized void method4481() {
		for (@Pc(14) Class1_Sub41 local14 = (Class1_Sub41) this.aClass199_153.method4392(); local14 != null; local14 = (Class1_Sub41) this.aClass199_153.method4393()) {
			local14.method5915();
		}
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(III)V")
	public synchronized void method4482() {
		this.method4464();
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(III)V")
	private void method4483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray375[arg0] = arg1;
		this.anIntArray378[arg0] = (int) (Math.pow((double) 2, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!cg;ILclient!m;Lclient!fo;)Z")
	public synchronized boolean method4484(@OriginalArg(1) Class36 arg0, @OriginalArg(3) Class1_Sub31 arg1, @OriginalArg(4) Class82 arg2) {
		arg1.method3479();
		@Pc(17) boolean local17 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class1_Sub35 local34 = (Class1_Sub35) arg1.aClass199_126.method4392(); local34 != null; local34 = (Class1_Sub35) arg1.aClass199_126.method4393()) {
			@Pc(40) int local40 = (int) local34.aLong230;
			@Pc(48) Class1_Sub41 local48 = (Class1_Sub41) this.aClass199_153.method4387((long) local40);
			if (local48 == null) {
				local48 = Static207.method4751(arg2, local40);
				if (local48 == null) {
					local17 = false;
					continue;
				}
				this.aClass199_153.method4383((long) local40, local48);
			}
			if (!local48.method5636(local28, local34.aByteArray70, arg0)) {
				local17 = false;
			}
		}
		if (local17) {
			arg1.method3481();
		}
		return local17;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "()Lclient!vb;")
	@Override
	public synchronized Class1_Sub6 method5167() {
		return this.aClass1_Sub6_Sub1_1;
	}
}
