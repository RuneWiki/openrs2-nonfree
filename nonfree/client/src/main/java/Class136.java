import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class136 {

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	private int anInt4247;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
	private int anInt4249;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
	public int anInt4254;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	public int anInt4255;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	private int anInt4256;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
	private int anInt4267;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
	public int anInt4270;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
	public int anInt4272;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
	public int anInt4274;

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
	public int anInt4276;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
	public int anInt4257 = 0;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49 = new String[5];

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
	public int anInt4248 = -1;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
	private int anInt4262 = -1;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
	private int anInt4258 = -1;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	private int anInt4266 = -1;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	public int anInt4264 = -1;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
	private int anInt4253 = -1;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	public int anInt4268 = -1;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	public int anInt4265 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Z")
	public boolean aBoolean329 = true;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
	private int anInt4246 = -1;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "Z")
	public boolean aBoolean330 = true;

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	public int anInt4250 = -1;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
	public int anInt4260 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "Z")
	public boolean aBoolean328 = true;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
	public int anInt4271 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "Z")
	public boolean aBoolean327 = false;

	@OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
	public int anInt4278 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
	public void method3846() {
		if (this.anIntArray363 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray363.length; local10 += 2) {
			if (this.anInt4265 > this.anIntArray363[local10]) {
				this.anInt4265 = this.anIntArray363[local10];
			} else if (this.anIntArray363[local10] > this.anInt4260) {
				this.anInt4260 = this.anIntArray363[local10];
			}
			if (this.anInt4271 > this.anIntArray363[local10 + 1]) {
				this.anInt4271 = this.anIntArray363[local10 + 1];
			} else if (this.anIntArray363[local10 + 1] > this.anInt4278) {
				this.anInt4278 = this.anIntArray363[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!vq;)Lclient!vj;")
	public Class58 method3847(@OriginalArg(1) Class47 arg0) {
		@Pc(18) Class58 local18 = (Class58) Static334.aClass198_140.method5210((long) (arg0.anInt3056 << 29 | this.anInt4262 | 0x20000));
		if (local18 != null) {
			return local18;
		}
		Static306.aClass193_96.method5064(this.anInt4262);
		@Pc(34) Class110 local34 = Static362.method3098(Static306.aClass193_96, this.anInt4262, 0);
		if (local34 != null) {
			local18 = arg0.method2677(local34);
			Static334.aClass198_140.method5201(local18, (long) (arg0.anInt3056 << 29 | 0x20000 | this.anInt4262));
		}
		return local18;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!vq;ZI)Lclient!vj;")
	public Class58 method3848(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt4250 : this.anInt4264;
		@Pc(18) int local18 = arg0.anInt3056 << 29 | local11;
		@Pc(25) Class58 local25 = (Class58) Static334.aClass198_140.method5210((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static306.aClass193_96.method5064(local11)) {
			@Pc(46) Class110 local46 = Static362.method3098(Static306.aClass193_96, local11, 0);
			if (local46 != null) {
				local25 = arg0.method2677(local46);
				Static334.aClass198_140.method5201(local25, (long) local18);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)Z")
	public boolean method3851() {
		if (this.anInt4266 == -1 && this.anInt4246 == -1) {
			return true;
		}
		@Pc(30) int local30;
		if (this.anInt4266 == -1) {
			local30 = Static81.method2009(this.anInt4246);
		} else {
			local30 = Static328.anIntArray485[this.anInt4266];
		}
		if (local30 < this.anInt4247 || this.anInt4256 < local30) {
			return false;
		} else if (this.anInt4258 == -1 && this.anInt4253 == -1) {
			return true;
		} else {
			if (this.anInt4258 == -1) {
				local30 = Static81.method2009(this.anInt4253);
			} else {
				local30 = Static328.anIntArray485[this.anInt4258];
			}
			return this.anInt4249 <= local30 && local30 <= this.anInt4267;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!lf;B)V")
	public void method3852(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3440();
			if (local15 == 0) {
				return;
			}
			this.method3853(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!lf;BI)V")
	private void method3853(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4264 = arg0.method3401();
		} else if (arg1 == 2) {
			this.anInt4250 = arg0.method3401();
		} else if (arg1 == 3) {
			this.aString44 = arg0.method3446();
		} else if (arg1 == 4) {
			this.anInt4270 = arg0.method3442();
		} else if (arg1 == 5) {
			this.anInt4268 = arg0.method3442();
		} else if (arg1 == 6) {
			this.anInt4257 = arg0.method3440();
		} else {
			@Pc(70) int local70;
			if (arg1 == 7) {
				local70 = arg0.method3440();
				if ((local70 & 0x1) == 0) {
					this.aBoolean329 = false;
				}
				if ((local70 & 0x2) == 2) {
					this.aBoolean327 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean330 = arg0.method3440() == 1;
			} else if (arg1 == 9) {
				this.anInt4246 = arg0.method3401();
				if (this.anInt4246 == 65535) {
					this.anInt4246 = -1;
				}
				this.anInt4266 = arg0.method3401();
				if (this.anInt4266 == 65535) {
					this.anInt4266 = -1;
				}
				this.anInt4247 = arg0.method3418();
				this.anInt4256 = arg0.method3418();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean328 = false;
						return;
					}
					if (arg1 != 17) {
						if (arg1 == 18) {
							this.anInt4262 = arg0.method3401();
							return;
						}
						if (arg1 == 19) {
							this.anInt4248 = arg0.method3401();
							return;
						}
						if (arg1 == 20) {
							this.anInt4253 = arg0.method3401();
							if (this.anInt4253 == 65535) {
								this.anInt4253 = -1;
							}
							this.anInt4258 = arg0.method3401();
							if (this.anInt4258 == 65535) {
								this.anInt4258 = -1;
							}
							this.anInt4249 = arg0.method3418();
							this.anInt4267 = arg0.method3418();
						} else if (arg1 == 21) {
							this.anInt4255 = arg0.method3418();
							return;
						} else if (arg1 == 22) {
							this.anInt4274 = arg0.method3418();
							return;
						}
						return;
					}
					this.aString45 = arg0.method3446();
					return;
				}
				local70 = arg0.method3440();
				this.anIntArray363 = new int[local70 * 2];
				for (@Pc(169) int local169 = 0; local169 < local70 * 2; local169++) {
					this.anIntArray363[local169] = arg0.method3447();
				}
				this.anInt4276 = arg0.method3418();
				this.anInt4254 = arg0.method3418();
				return;
			} else {
				this.aStringArray49[arg1 - 10] = arg0.method3446();
				return;
			}
		}
	}
}
