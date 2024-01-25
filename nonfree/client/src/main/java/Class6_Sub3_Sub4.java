import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class6_Sub3_Sub4 extends Class6_Sub3 {

	@OriginalMember(owner = "client!jo", name = "Hb", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!jo", name = "Ib", descriptor = "I")
	private int anInt5296;

	@OriginalMember(owner = "client!jo", name = "Jb", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!jo", name = "Kb", descriptor = "I")
	private int anInt5297;

	@OriginalMember(owner = "client!jo", name = "Lb", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!jo", name = "Mb", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!jo", name = "Nb", descriptor = "Lclient!bl;")
	private Class6_Sub5 aClass6_Sub5_2;

	@OriginalMember(owner = "client!jo", name = "Ob", descriptor = "I")
	private int anInt5298;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "[I")
	private final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "[I")
	private final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "[I")
	private final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!jo", name = "X", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!jo", name = "bb", descriptor = "[I")
	private final int[] anIntArray311 = new int[16];

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!jo", name = "kb", descriptor = "I")
	private final int anInt5282 = 1000000;

	@OriginalMember(owner = "client!jo", name = "cb", descriptor = "[[Lclient!pg;")
	private final Class6_Sub33[][] aClass6_Sub33ArrayArray2 = new Class6_Sub33[16][128];

	@OriginalMember(owner = "client!jo", name = "rb", descriptor = "[I")
	private final int[] anIntArray314 = new int[16];

	@OriginalMember(owner = "client!jo", name = "U", descriptor = "[[Lclient!pg;")
	private final Class6_Sub33[][] aClass6_Sub33ArrayArray1 = new Class6_Sub33[16][128];

	@OriginalMember(owner = "client!jo", name = "tb", descriptor = "I")
	private int anInt5287 = 256;

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!jo", name = "wb", descriptor = "[I")
	private final int[] anIntArray315 = new int[16];

	@OriginalMember(owner = "client!jo", name = "ob", descriptor = "[I")
	public final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "[I")
	private final int[] anIntArray305 = new int[16];

	@OriginalMember(owner = "client!jo", name = "T", descriptor = "[I")
	public final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!jo", name = "qb", descriptor = "[I")
	public final int[] anIntArray313 = new int[16];

	@OriginalMember(owner = "client!jo", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!jo", name = "zb", descriptor = "[I")
	private final int[] anIntArray316 = new int[16];

	@OriginalMember(owner = "client!jo", name = "Db", descriptor = "[I")
	private final int[] anIntArray317 = new int[16];

	@OriginalMember(owner = "client!jo", name = "Cb", descriptor = "Lclient!je;")
	private final Class159 aClass159_1 = new Class159();

	@OriginalMember(owner = "client!jo", name = "Gb", descriptor = "Lclient!sm;")
	private final Class6_Sub3_Sub5 aClass6_Sub3_Sub5_1 = new Class6_Sub3_Sub5(this);

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!he;")
	private final Class128 aClass128_15;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub4() {
		this.aClass128_15 = new Class128(128);
		this.method4712(-1, 256);
		this.method4740(true);
	}

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!jo;)V")
	public Class6_Sub3_Sub4(@OriginalArg(0) Class6_Sub3_Sub4 arg0) {
		this.aClass128_15 = arg0.aClass128_15;
		this.method4712(-1, 256);
		this.method4740(true);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V")
	private synchronized void method4702(@OriginalArg(0) boolean arg0) {
		this.aClass159_1.method4595();
		this.aClass6_Sub5_2 = null;
		this.method4740(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)V")
	public synchronized void method4703() {
		this.method4737();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!pg;IZ)V")
	public void method4704(@OriginalArg(0) Class6_Sub33 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass6_Sub37_Sub1_2.aByteArray111.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass6_Sub37_Sub1_2.aBoolean673) {
			@Pc(46) int local46 = local16 + local16 - arg0.aClass6_Sub37_Sub1_2.anInt9841;
			local16 <<= 0x8;
			local35 = (int) ((long) this.anIntArray312[arg0.anInt7850] * (long) local46 >> 6);
			if (local35 >= local16) {
				arg0.aClass6_Sub3_Sub3_2.method3837();
				local35 = local16 + local16 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) this.anIntArray312[arg0.anInt7850] * (long) local16 >> 6);
		}
		arg0.aClass6_Sub3_Sub3_2.method3836(local35);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!pg;B)I")
	private int method4705(@OriginalArg(0) Class6_Sub33 arg0) {
		@Pc(14) int local14 = this.anIntArray303[arg0.anInt7850];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt7859 + 128) + 32 >> 6) : arg0.anInt7859 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7801(@OriginalArg(0) int arg0) {
		if (this.aClass159_1.method4594()) {
			@Pc(14) int local14 = this.anInt5282 * this.aClass159_1.anInt5142 / Static78.anInt1661;
			do {
				@Pc(23) long local23 = this.aLong133 + (long) local14 * (long) arg0;
				if (this.aLong134 - local23 >= 0L) {
					this.aLong133 = local23;
					break;
				}
				@Pc(51) int local51 = (int) ((this.aLong134 + (long) local14 - this.aLong133 - 1L) / (long) local14);
				this.aLong133 += (long) local14 * (long) local51;
				this.aClass6_Sub3_Sub5_1.method7801(local51);
				arg0 -= local51;
				this.method4734();
			} while (this.aClass159_1.method4594());
		}
		this.aClass6_Sub3_Sub5_1.method7801(arg0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "()Lclient!ca;")
	@Override
	public synchronized Class6_Sub3 method7800() {
		return this.aClass6_Sub3_Sub5_1;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(Lclient!pg;B)Z")
	public boolean method4706(@OriginalArg(0) Class6_Sub33 arg0) {
		if (arg0.aClass6_Sub3_Sub3_2 != null) {
			return false;
		}
		if (arg0.anInt7841 >= 0) {
			arg0.method9043();
			if (arg0.anInt7846 > 0 && this.aClass6_Sub33ArrayArray2[arg0.anInt7850][arg0.anInt7846] == arg0) {
				this.aClass6_Sub33ArrayArray2[arg0.anInt7850][arg0.anInt7846] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIB)V")
	private void method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public synchronized void method4708() {
		for (@Pc(7) Class6_Sub32 local7 = (Class6_Sub32) this.aClass128_15.method3556(); local7 != null; local7 = (Class6_Sub32) this.aClass128_15.method3555()) {
			local7.method6533();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)V")
	private void method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub33 local12 = this.aClass6_Sub33ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub33ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray309[arg1] & 0x2) == 0) {
			local12.anInt7841 = 0;
			return;
		}
		for (@Pc(36) Class6_Sub33 local36 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method149(); local36 != null; local36 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method155()) {
			if (local12.anInt7850 == local36.anInt7850 && local36.anInt7841 < 0 && local36 != local12) {
				local12.anInt7841 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	private void method4710(@OriginalArg(1) int arg0) {
		if ((this.anIntArray309[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub33 local22 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method149(); local22 != null; local22 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method155()) {
			if (arg0 == local22.anInt7850 && this.aClass6_Sub33ArrayArray1[arg0][local22.anInt7853] == null && local22.anInt7841 < 0) {
				local22.anInt7841 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	private void method4711(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class6_Sub33 local8 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method149(); local8 != null; local8 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method155()) {
			if ((arg0 < 0 || arg0 == local8.anInt7850) && local8.anInt7841 < 0) {
				this.aClass6_Sub33ArrayArray1[local8.anInt7850][local8.anInt7853] = null;
				local8.anInt7841 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V")
	public synchronized void method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0) {
			this.lb[arg0] = arg1;
		} else {
			for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
				this.lb[local16] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLclient!pg;)I")
	private int method4713(@OriginalArg(1) Class6_Sub33 arg0) {
		@Pc(15) int local15 = arg0.anInt7843 + (arg0.anInt7848 * arg0.anInt7851 >> 12);
		local15 += (this.anIntArray304[arg0.anInt7850] - 8192) * this.anIntArray315[arg0.anInt7850] >> 12;
		@Pc(45) Class306 local45 = arg0.aClass306_1;
		@Pc(65) int local65;
		if (local45.anInt9118 > 0 && (local45.anInt9112 > 0 || this.anIntArray308[arg0.anInt7850] > 0)) {
			local65 = local45.anInt9112 << 2;
			@Pc(70) int local70 = local45.anInt9113 << 1;
			if (local70 > arg0.anInt7856) {
				local65 = local65 * arg0.anInt7856 / local70;
			}
			local65 += this.anIntArray308[arg0.anInt7850] >> 7;
			@Pc(104) double local104 = Math.sin((double) (arg0.anInt7847 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local104 * (double) local65);
		}
		local65 = (int) ((double) (arg0.aClass6_Sub37_Sub1_2.anInt9842 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static78.anInt1661 + 0.5D);
		return local65 < 1 ? 1 : local65;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[IILclient!pg;I)Z")
	public boolean method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class6_Sub33 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt7844 = Static78.anInt1661 / 100;
		if (arg2.anInt7841 >= 0 && (arg2.aClass6_Sub3_Sub3_2 == null || arg2.aClass6_Sub3_Sub3_2.method3864())) {
			arg2.method6751();
			arg2.method9043();
			if (arg2.anInt7846 > 0 && this.aClass6_Sub33ArrayArray2[arg2.anInt7850][arg2.anInt7846] == arg2) {
				this.aClass6_Sub33ArrayArray2[arg2.anInt7850][arg2.anInt7846] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt7851;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray311[arg2.anInt7850] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt7851 = local56;
		}
		arg2.aClass6_Sub3_Sub3_2.method3863(this.method4713(arg2));
		@Pc(96) Class306 local96 = arg2.aClass306_1;
		arg2.anInt7856++;
		arg2.anInt7847 += local96.anInt9118;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg2.anInt7851 * arg2.anInt7848 >> 12) + (arg2.anInt7853 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt9114 > 0) {
			if (local96.anInt9115 > 0) {
				arg2.anInt7860 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt9115) * 128.0D + 0.5D);
			} else {
				arg2.anInt7860 += 128;
			}
			if (arg2.anInt7860 * local96.anInt9114 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray102 != null) {
			if (local96.anInt9116 > 0) {
				arg2.anInt7857 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt9116) * 128.0D + 0.5D);
			} else {
				arg2.anInt7857 += 128;
			}
			while (arg2.anInt7849 < local96.aByteArray102.length - 2 && (local96.aByteArray102[arg2.anInt7849 + 2] & 0xFF) << 8 < arg2.anInt7857) {
				arg2.anInt7849 += 2;
			}
			if (local96.aByteArray102.length - 2 == arg2.anInt7849 && local96.aByteArray102[arg2.anInt7849 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt7841 >= 0 && local96.aByteArray103 != null && (this.anIntArray309[arg2.anInt7850] & 0x1) == 0 && (arg2.anInt7846 < 0 || arg2 != this.aClass6_Sub33ArrayArray2[arg2.anInt7850][arg2.anInt7846])) {
			if (local96.anInt9111 <= 0) {
				arg2.anInt7841 += 128;
			} else {
				arg2.anInt7841 += (int) (Math.pow(2.0D, (double) local96.anInt9111 * local129) * 128.0D + 0.5D);
			}
			while (local96.aByteArray103.length - 2 > arg2.anInt7842 && arg2.anInt7841 > (local96.aByteArray103[arg2.anInt7842 + 2] & 0xFF) << 8) {
				arg2.anInt7842 += 2;
			}
			if (arg2.anInt7842 == local96.aByteArray103.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass6_Sub3_Sub3_2.method3844(arg2.anInt7844, this.method4727(arg2), this.method4705(arg2));
			return false;
		}
		arg2.aClass6_Sub3_Sub3_2.method3860(arg2.anInt7844);
		if (arg1 == null) {
			arg2.aClass6_Sub3_Sub3_2.method7801(arg3);
		} else {
			arg2.aClass6_Sub3_Sub3_2.method7805(arg1, arg0, arg3);
		}
		if (arg2.aClass6_Sub3_Sub3_2.method3853()) {
			this.aClass6_Sub3_Sub5_1.aClass6_Sub3_Sub1_2.method271(arg2.aClass6_Sub3_Sub3_2);
		}
		arg2.method6751();
		if (arg2.anInt7841 >= 0) {
			arg2.method9043();
			if (arg2.anInt7846 > 0 && this.aClass6_Sub33ArrayArray2[arg2.anInt7850][arg2.anInt7846] == arg2) {
				this.aClass6_Sub33ArrayArray2[arg2.anInt7850][arg2.anInt7846] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass159_1.method4594()) {
			@Pc(14) int local14 = this.aClass159_1.anInt5142 * this.anInt5282 / Static78.anInt1661;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong133;
				if (this.aLong134 - local23 >= 0L) {
					this.aLong133 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong134 + (long) local14 - this.aLong133 - 1L) / (long) local14);
				this.aLong133 += (long) local14 * (long) local55;
				this.aClass6_Sub3_Sub5_1.method7805(arg0, arg1, local55);
				this.method4734();
				arg2 -= local55;
				arg1 += local55;
			} while (this.aClass159_1.method4594());
		}
		this.aClass6_Sub3_Sub5_1.method7805(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V")
	public synchronized void method4715(@OriginalArg(0) int arg0) {
		this.anInt5287 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Z")
	public synchronized boolean method4717() {
		return this.aClass159_1.method4594();
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)V")
	private void method4718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray304[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLclient!bl;ZB)V")
	private synchronized void method4719(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub5 arg1, @OriginalArg(2) boolean arg2) {
		this.method4702(arg2);
		this.aClass159_1.method4598(arg1.aByteArray13);
		this.aLong133 = 0L;
		this.aBoolean360 = arg0;
		@Pc(24) int local24 = this.aClass159_1.method4593();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass159_1.method4587(local26);
			this.aClass159_1.method4597(local26);
			this.aClass159_1.method4600(local26);
		}
		this.anInt5297 = this.aClass159_1.method4586();
		this.anInt5296 = this.aClass159_1.anIntArray297[this.anInt5297];
		this.aLong134 = this.aClass159_1.method4589(this.anInt5296);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLclient!bl;ZJZ)V")
	public synchronized void method4720(@OriginalArg(1) Class6_Sub5 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) boolean arg2) {
		this.method4719(arg2, arg0, true);
		this.method4721((long) this.aClass159_1.anInt5142 * arg1);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)V")
	private void method4721(@OriginalArg(0) long arg0) {
		while (arg0 >= this.aLong134) {
			@Pc(16) int local16 = this.anInt5297;
			@Pc(19) int local19 = this.anInt5296;
			@Pc(22) long local22 = this.aLong134;
			while (this.anInt5296 == local19) {
				while (local19 == this.aClass159_1.anIntArray297[local16]) {
					this.aClass159_1.method4587(local16);
					@Pc(33) int local33 = this.aClass159_1.method4596(local16);
					if (local33 == 1) {
						this.aClass159_1.method4590();
						this.aClass159_1.method4600(local16);
						if (this.aClass159_1.method4601()) {
							if (!this.aBoolean360 || local19 == 0) {
								this.method4740(true);
								this.aClass159_1.method4595();
								return;
							}
							this.aClass159_1.method4591(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method4729(local33);
					}
					this.aClass159_1.method4597(local16);
					this.aClass159_1.method4600(local16);
				}
				this.aLong133 = local22;
				local16 = this.aClass159_1.method4586();
				local19 = this.aClass159_1.anIntArray297[local16];
				local22 = this.aClass159_1.method4589(local19);
			}
			this.aLong134 = local22;
			this.anInt5296 = local19;
			this.anInt5297 = local16;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIII)V")
	private void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(II)V")
	private void method4724(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class6_Sub33 local6 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method149(); local6 != null; local6 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method155()) {
			if (arg0 < 0 || arg0 == local6.anInt7850) {
				if (local6.aClass6_Sub3_Sub3_2 != null) {
					local6.aClass6_Sub3_Sub3_2.method3860(Static78.anInt1661 / 100);
					if (local6.aClass6_Sub3_Sub3_2.method3853()) {
						this.aClass6_Sub3_Sub5_1.aClass6_Sub3_Sub1_2.method271(local6.aClass6_Sub3_Sub3_2);
					}
					local6.method6751();
				}
				if (local6.anInt7841 < 0) {
					this.aClass6_Sub33ArrayArray1[local6.anInt7850][local6.anInt7853] = null;
				}
				local6.method9043();
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
	private void method4725(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4725(local12);
			}
			return;
		}
		this.anIntArray310[arg0] = 12800;
		this.anIntArray303[arg0] = 8192;
		this.anIntArray317[arg0] = 16383;
		this.anIntArray304[arg0] = 8192;
		this.anIntArray308[arg0] = 0;
		this.anIntArray311[arg0] = 8192;
		this.method4710(arg0);
		this.method4731(arg0);
		this.anIntArray309[arg0] = 0;
		this.anIntArray305[arg0] = 32767;
		this.anIntArray315[arg0] = 256;
		this.anIntArray312[arg0] = 0;
		this.method4739(8192, arg0);
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(IIII)V")
	private void method4726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4709(arg0, arg1, 64);
		if ((this.anIntArray309[arg1] & 0x2) != 0) {
			for (@Pc(28) Class6_Sub33 local28 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method159(); local28 != null; local28 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method148()) {
				if (local28.anInt7850 == arg1 && local28.anInt7841 < 0) {
					this.aClass6_Sub33ArrayArray1[arg1][local28.anInt7853] = null;
					this.aClass6_Sub33ArrayArray1[arg1][arg0] = local28;
					@Pc(66) int local66 = (local28.anInt7851 * local28.anInt7848 >> 12) + local28.anInt7843;
					local28.anInt7843 += arg0 - local28.anInt7853 << 8;
					local28.anInt7848 = local66 - local28.anInt7843;
					local28.anInt7853 = arg0;
					local28.anInt7851 = 4096;
					return;
				}
			}
		}
		@Pc(112) Class6_Sub32 local112 = (Class6_Sub32) this.aClass128_15.method3560((long) this.anIntArray314[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class6_Sub37_Sub1 local120 = local112.aClass6_Sub37_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class6_Sub33 local127 = new Class6_Sub33();
		local127.anInt7850 = arg1;
		local127.aClass6_Sub37_Sub1_2 = local120;
		local127.aClass6_Sub32_1 = local112;
		local127.aClass306_1 = local112.aClass306Array1[arg0];
		local127.anInt7846 = local112.aByteArray87[arg0];
		local127.anInt7853 = arg0;
		local127.anInt7840 = local112.anInt7572 * arg2 * arg2 * local112.aByteArray86[arg0] + 1024 >> 11;
		local127.anInt7859 = local112.aByteArray85[arg0] & 0xFF;
		local127.anInt7843 = (arg0 << 8) - (local112.aShortArray93[arg0] & 0x7FFF);
		local127.anInt7849 = 0;
		local127.anInt7860 = 0;
		local127.anInt7841 = -1;
		local127.anInt7842 = 0;
		local127.anInt7857 = 0;
		if (this.anIntArray312[arg1] == 0) {
			local127.aClass6_Sub3_Sub3_2 = Static653.method3866(local120, this.method4713(local127), this.method4727(local127), this.method4705(local127));
		} else {
			local127.aClass6_Sub3_Sub3_2 = Static653.method3866(local120, this.method4713(local127), 0, this.method4705(local127));
			this.method4704(local127, local112.aShortArray93[arg0] < 0);
		}
		if (local112.aShortArray93[arg0] < 0) {
			local127.aClass6_Sub3_Sub3_2.method3841(-1);
		}
		if (local127.anInt7846 >= 0) {
			@Pc(282) Class6_Sub33 local282 = this.aClass6_Sub33ArrayArray2[arg1][local127.anInt7846];
			if (local282 != null && local282.anInt7841 < 0) {
				this.aClass6_Sub33ArrayArray1[arg1][local282.anInt7853] = null;
				local282.anInt7841 = 0;
			}
			this.aClass6_Sub33ArrayArray2[arg1][local127.anInt7846] = local127;
		}
		this.aClass6_Sub3_Sub5_1.aClass8_61.method157(local127);
		this.aClass6_Sub33ArrayArray1[arg1][arg0] = local127;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!pg;I)I")
	private int method4727(@OriginalArg(0) Class6_Sub33 arg0) {
		if (this.lb[arg0.anInt7850] == 0) {
			return 0;
		}
		@Pc(22) Class306 local22 = arg0.aClass306_1;
		@Pc(38) int local38 = this.anIntArray310[arg0.anInt7850] * this.anIntArray317[arg0.anInt7850] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt7840 * local46 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt5287 * local55 + 128 >> 8;
		local38 = this.lb[arg0.anInt7850] * local64 + 128 >> 8;
		if (local22.anInt9114 > 0) {
			local38 = (int) ((double) local38 * Math.pow(0.5D, (double) local22.anInt9114 * 1.953125E-5D * (double) arg0.anInt7860) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local22.aByteArray102 != null) {
			local103 = arg0.anInt7857;
			local111 = local22.aByteArray102[arg0.anInt7849 + 1];
			if (arg0.anInt7849 < local22.aByteArray102.length - 2) {
				local133 = (local22.aByteArray102[arg0.anInt7849] & 0xFF) << 8;
				local145 = (local22.aByteArray102[arg0.anInt7849 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (-local111 + local22.aByteArray102[arg0.anInt7849 + 3]) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		if (arg0.anInt7841 > 0 && local22.aByteArray103 != null) {
			local103 = arg0.anInt7841;
			local111 = local22.aByteArray103[arg0.anInt7842 + 1];
			if (local22.aByteArray103.length - 2 > arg0.anInt7842) {
				local133 = (local22.aByteArray103[arg0.anInt7842] & 0xFF) << 8;
				local145 = (local22.aByteArray103[arg0.anInt7842 + 2] & 0xFF) << 8;
				local111 += (local22.aByteArray103[arg0.anInt7842 + 3] - local111) * (-local133 + local103) / (local145 - local133);
			}
			local38 = local38 * local111 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "()Lclient!ca;")
	@Override
	public synchronized Class6_Sub3 method7803() {
		return null;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(II)V")
	private void method4729(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4709(local24, local18, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method4709(local24, local18, 64);
			} else {
				this.method4726(local24, local18, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4723(local24, local18, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray307[local18] = (local30 << 14) + (this.anIntArray307[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray307[local18] = (local30 << 7) + (this.anIntArray307[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray308[local18] = (this.anIntArray308[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray308[local18] = (this.anIntArray308[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray311[local18] = (this.anIntArray311[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray311[local18] = (this.anIntArray311[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray310[local18] = (local30 << 7) + (this.anIntArray310[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray310[local18] = local30 + (this.anIntArray310[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray303[local18] = (this.anIntArray303[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray303[local18] = (this.anIntArray303[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray317[local18] = (this.anIntArray317[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray317[local18] = (this.anIntArray317[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray309[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray309[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray309[local18] |= 0x2;
				} else {
					this.method4710(local18);
					this.anIntArray309[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray305[local18] = (this.anIntArray305[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray305[local18] = (this.anIntArray305[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray305[local18] = (local30 << 7) + ((this.anIntArray305[local18] & 0x7F) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray305[local18] = local30 + (this.anIntArray305[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method4724(local18);
			}
			if (local24 == 121) {
				this.method4725(local18);
			}
			if (local24 == 123) {
				this.method4711(local18);
			}
			@Pc(501) int local501;
			if (local24 == 6) {
				local501 = this.anIntArray305[local18];
				if (local501 == 16384) {
					this.anIntArray315[local18] = (this.anIntArray315[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local501 = this.anIntArray305[local18];
				if (local501 == 16384) {
					this.anIntArray315[local18] = (this.anIntArray315[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray312[local18] = (local30 << 7) + (this.anIntArray312[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray312[local18] = local30 + (this.anIntArray312[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method4731(local18);
					this.anIntArray309[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray309[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method4739((this.anIntArray316[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method4739((this.anIntArray316[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4732(local18, local24 + this.anIntArray307[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4707(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F005A) >> 9);
			this.method4718(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4740(true);
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!vd;Lclient!bl;IILclient!pea;)Z")
	public synchronized boolean method4730(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class6_Sub5 arg1, @OriginalArg(4) Class253 arg2) {
		arg1.method870();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class6_Sub24 local27 = (Class6_Sub24) arg1.aClass128_6.method3556(); local27 != null; local27 = (Class6_Sub24) arg1.aClass128_6.method3555()) {
			@Pc(33) int local33 = (int) local27.aLong278;
			@Pc(41) Class6_Sub32 local41 = (Class6_Sub32) this.aClass128_15.method3560((long) local33);
			if (local41 == null) {
				local41 = Static533.method7868(local33, arg0);
				if (local41 == null) {
					local9 = false;
					continue;
				}
				this.aClass128_15.method3551((long) local33, local41);
			}
			if (!local41.method6535(local21, arg2, local27.aByteArray53)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method868();
		}
		return local9;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(II)V")
	private void method4731(@OriginalArg(1) int arg0) {
		if ((this.anIntArray309[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class6_Sub33 local26 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method149(); local26 != null; local26 = (Class6_Sub33) this.aClass6_Sub3_Sub5_1.aClass8_61.method155()) {
			if (arg0 == local26.anInt7850) {
				local26.anInt7852 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(III)V")
	private void method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray314[arg0]) {
			this.anIntArray314[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass6_Sub33ArrayArray2[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	public synchronized void method4733() {
		for (@Pc(18) Class6_Sub32 local18 = (Class6_Sub32) this.aClass128_15.method3556(); local18 != null; local18 = (Class6_Sub32) this.aClass128_15.method3555()) {
			local18.method9043();
		}
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "()I")
	@Override
	public synchronized int method7804() {
		return 0;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	private void method4734() {
		@Pc(8) int local8 = this.anInt5297;
		@Pc(11) int local11 = this.anInt5296;
		@Pc(21) long local21 = this.aLong134;
		if (this.aClass6_Sub5_2 != null && local11 == this.anInt5298) {
			this.method4719(this.aBoolean360, this.aClass6_Sub5_2, this.aBoolean361);
			this.method4734();
			return;
		}
		while (local11 == this.anInt5296) {
			while (local11 == this.aClass159_1.anIntArray297[local8]) {
				this.aClass159_1.method4587(local8);
				@Pc(50) int local50 = this.aClass159_1.method4596(local8);
				if (local50 == 1) {
					this.aClass159_1.method4590();
					this.aClass159_1.method4600(local8);
					if (this.aClass159_1.method4601()) {
						if (this.aClass6_Sub5_2 != null) {
							this.method4735(this.aClass6_Sub5_2, this.aBoolean360);
							this.method4734();
							return;
						}
						if (!this.aBoolean360 || local11 == 0) {
							this.method4740(true);
							this.aClass159_1.method4595();
							return;
						}
						this.aClass159_1.method4591(local21);
					}
					break;
				}
				if ((local50 & 0x80) != 0) {
					this.method4729(local50);
				}
				this.aClass159_1.method4597(local8);
				this.aClass159_1.method4600(local8);
			}
			local8 = this.aClass159_1.method4586();
			local11 = this.aClass159_1.anIntArray297[local8];
			local21 = this.aClass159_1.method4589(local11);
		}
		this.aLong134 = local21;
		this.anInt5297 = local8;
		this.anInt5296 = local11;
		if (this.aClass6_Sub5_2 != null && local11 > this.anInt5298) {
			this.anInt5296 = this.anInt5298;
			this.anInt5297 = -1;
			this.aLong134 = this.aClass159_1.method4589(this.anInt5296);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!bl;ZB)V")
	public synchronized void method4735(@OriginalArg(0) Class6_Sub5 arg0, @OriginalArg(1) boolean arg1) {
		this.method4719(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
	public int method4736() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(III)V")
	private void method4737() {
		this.anIntArray306[9] = 128;
		this.anIntArray307[9] = 128;
		this.method4732(9, 128);
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V")
	public synchronized void method4738() {
		this.method4702(true);
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(III)V")
	private void method4739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray316[arg1] = arg0;
		this.anIntArray313[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(ZI)V")
	private void method4740(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4724(-1);
		} else {
			this.method4711(-1);
		}
		this.method4725(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray314[local23] = this.anIntArray306[local23];
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			this.anIntArray307[local48] = this.anIntArray306[local48] & 0xFFFFFF80;
		}
	}
}
