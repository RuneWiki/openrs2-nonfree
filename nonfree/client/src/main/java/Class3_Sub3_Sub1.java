import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	private int anInt549;

	@OriginalMember(owner = "client!de", name = "V", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	private final int anInt544;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "I")
	private final int anInt542;

	@OriginalMember(owner = "client!de", name = "T", descriptor = "I")
	private int anInt548;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!ta;II)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) Class3_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass3_Sub9_3 = arg0;
		this.anInt544 = arg0.anInt2417;
		this.anInt542 = arg0.anInt2416;
		this.anInt548 = arg1;
		this.anInt541 = arg2;
		this.anInt543 = 0;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public synchronized void method337(@OriginalArg(0) int arg0) {
		this.anInt541 = arg0;
		this.anInt545 = 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1049(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt541 == 0 && (this.anInt545 == 0 || this.anInt547 == 0 || this.anInt547 == Integer.MIN_VALUE)) {
			this.method1047(arg2);
			return 0;
		}
		@Pc(21) Class3_Sub9_Sub1 local21 = (Class3_Sub9_Sub1) super.aClass3_Sub9_3;
		@Pc(26) int local26 = this.anInt544 << 8;
		@Pc(31) int local31 = this.anInt542 << 8;
		@Pc(37) int local37 = local21.aByteArray21.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt549 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt549 >= 0) {
			if (this.anInt549 > 0) {
				if (this.aBoolean39) {
					label118: {
						if (this.anInt548 < 0) {
							local48 = this.method348(arg0, arg1, local26, local52, local21.aByteArray21[this.anInt544]);
							if (this.anInt543 >= local26) {
								return 1;
							}
							this.anInt543 = local26 + local26 - this.anInt543 - 1;
							this.anInt548 = -this.anInt548;
							if (--this.anInt549 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method349(arg0, local48, local31, local52, local21.aByteArray21[this.anInt542 - 1]);
							if (this.anInt543 < local31) {
								return 1;
							}
							this.anInt543 = local31 + local31 - this.anInt543 - 1;
							this.anInt548 = -this.anInt548;
							if (--this.anInt549 == 0) {
								break;
							}
							local48 = this.method348(arg0, local48, local26, local52, local21.aByteArray21[this.anInt544]);
							if (this.anInt543 >= local26) {
								return 1;
							}
							this.anInt543 = local26 + local26 - this.anInt543 - 1;
							this.anInt548 = -this.anInt548;
						} while (--this.anInt549 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt548 < 0) {
						while (true) {
							local48 = this.method348(arg0, local48, local26, local52, local21.aByteArray21[this.anInt542 - 1]);
							if (this.anInt543 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt543 - 1) / local41;
							if (local398 >= this.anInt549) {
								this.anInt543 += local41 * this.anInt549;
								this.anInt549 = 0;
								break;
							}
							this.anInt543 += local41 * local398;
							this.anInt549 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method349(arg0, local48, local31, local52, local21.aByteArray21[this.anInt544]);
							if (this.anInt543 < local31) {
								return 1;
							}
							local398 = (this.anInt543 - local26) / local41;
							if (local398 >= this.anInt549) {
								this.anInt543 -= local41 * this.anInt549;
								this.anInt549 = 0;
								break;
							}
							this.anInt543 -= local41 * local398;
							this.anInt549 -= local398;
						}
					}
				}
			}
			if (this.anInt548 < 0) {
				this.method348(arg0, local48, 0, local52, 0);
				if (this.anInt543 < 0) {
					this.anInt543 = 0;
					this.method1930();
				}
			} else {
				this.method349(arg0, local48, local37, local52, 0);
				if (this.anInt543 >= local37) {
					this.anInt543 = local37 - 1;
					this.method1930();
				}
			}
			return 1;
		} else if (this.aBoolean39) {
			if (this.anInt548 < 0) {
				local48 = this.method348(arg0, arg1, local26, local52, local21.aByteArray21[this.anInt544]);
				if (this.anInt543 >= local26) {
					return 1;
				}
				this.anInt543 = local26 + local26 - this.anInt543 - 1;
				this.anInt548 = -this.anInt548;
			}
			while (true) {
				local48 = this.method349(arg0, local48, local31, local52, local21.aByteArray21[this.anInt542 - 1]);
				if (this.anInt543 < local31) {
					return 1;
				}
				this.anInt543 = local31 + local31 - this.anInt543 - 1;
				this.anInt548 = -this.anInt548;
				local48 = this.method348(arg0, local48, local26, local52, local21.aByteArray21[this.anInt544]);
				if (this.anInt543 >= local26) {
					return 1;
				}
				this.anInt543 = local26 + local26 - this.anInt543 - 1;
				this.anInt548 = -this.anInt548;
			}
		} else if (this.anInt548 < 0) {
			while (true) {
				local48 = this.method348(arg0, local48, local26, local52, local21.aByteArray21[this.anInt542 - 1]);
				if (this.anInt543 >= local26) {
					return 1;
				}
				this.anInt543 = local31 - (local31 - 1 - this.anInt543) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method349(arg0, local48, local31, local52, local21.aByteArray21[this.anInt544]);
				if (this.anInt543 < local31) {
					return 1;
				}
				this.anInt543 = local26 + (this.anInt543 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public synchronized void method343(@OriginalArg(0) int arg0) {
		this.anInt549 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
	@Override
	public int method1048() {
		@Pc(4) int local4 = this.anInt541 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt549 == 0) {
			local4 -= local4 * this.anInt543 / (((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21.length << 8);
		} else if (this.anInt549 >= 0) {
			local4 -= local4 * this.anInt544 / ((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1047(@OriginalArg(0) int arg0) {
		if (this.anInt545 > 0) {
			if (arg0 >= this.anInt545) {
				if (this.anInt547 == Integer.MIN_VALUE) {
					this.method1930();
					arg0 = this.anInt545;
				} else {
					this.anInt541 = this.anInt547;
				}
				this.anInt545 = 0;
			} else {
				this.anInt541 += this.anInt546 * arg0;
				this.anInt545 -= arg0;
			}
		}
		this.anInt543 += this.anInt548 * arg0;
		@Pc(53) Class3_Sub9_Sub1 local53 = (Class3_Sub9_Sub1) super.aClass3_Sub9_3;
		@Pc(58) int local58 = this.anInt544 << 8;
		@Pc(63) int local63 = this.anInt542 << 8;
		@Pc(69) int local69 = local53.aByteArray21.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt549 = 0;
		}
		if (this.anInt549 >= 0) {
			if (this.anInt549 > 0) {
				if (this.aBoolean39) {
					label113: {
						if (this.anInt548 < 0) {
							if (this.anInt543 >= local58) {
								return;
							}
							this.anInt543 = local58 + local58 - this.anInt543 - 1;
							this.anInt548 = -this.anInt548;
							if (--this.anInt549 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt543 < local63) {
								return;
							}
							this.anInt543 = local63 + local63 - this.anInt543 - 1;
							this.anInt548 = -this.anInt548;
							if (--this.anInt549 == 0) {
								break;
							}
							if (this.anInt543 >= local58) {
								return;
							}
							this.anInt543 = local58 + local58 - this.anInt543 - 1;
							this.anInt548 = -this.anInt548;
						} while (--this.anInt549 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt548 < 0) {
						if (this.anInt543 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt543 - 1) / local73;
						if (local299 < this.anInt549) {
							this.anInt543 += local73 * local299;
							this.anInt549 -= local299;
							return;
						}
						this.anInt543 += local73 * this.anInt549;
						this.anInt549 = 0;
					} else if (this.anInt543 >= local63) {
						local299 = (this.anInt543 - local58) / local73;
						if (local299 < this.anInt549) {
							this.anInt543 -= local73 * local299;
							this.anInt549 -= local299;
							return;
						}
						this.anInt543 -= local73 * this.anInt549;
						this.anInt549 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt548 < 0) {
				if (this.anInt543 < 0) {
					this.anInt543 = 0;
					this.method1930();
					return;
				}
			} else if (this.anInt543 >= local69) {
				this.anInt543 = local69 - 1;
				this.method1930();
			}
		} else if (this.aBoolean39) {
			if (this.anInt548 < 0) {
				if (this.anInt543 >= local58) {
					return;
				}
				this.anInt543 = local58 + local58 - this.anInt543 - 1;
				this.anInt548 = -this.anInt548;
			}
			while (this.anInt543 >= local63) {
				this.anInt543 = local63 + local63 - this.anInt543 - 1;
				this.anInt548 = -this.anInt548;
				if (this.anInt543 >= local58) {
					return;
				}
				this.anInt543 = local58 + local58 - this.anInt543 - 1;
				this.anInt548 = -this.anInt548;
			}
		} else if (this.anInt548 < 0) {
			if (this.anInt543 < local58) {
				this.anInt543 = local63 - (local63 - 1 - this.anInt543) % local73 - 1;
			}
		} else if (this.anInt543 >= local63) {
			this.anInt543 = local58 + (this.anInt543 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()Z")
	public boolean method347() {
		return this.method1926();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([IIIII)I")
	private int method348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt545 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt545;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt545 += arg1;
			if (this.anInt548 == -256 && (this.anInt543 & 0xFF) == 0) {
				arg1 = Static115.method346(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, this.anInt550, this.anInt546, local7, arg2, this);
			} else {
				arg1 = Static115.method339(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, this.anInt550, this.anInt546, local7, arg2, this, this.anInt548, arg4);
			}
			this.anInt545 -= arg1;
			if (this.anInt545 != 0) {
				return arg1;
			}
			if (this.anInt547 == Integer.MIN_VALUE) {
				this.method1930();
				return arg3;
			}
			this.anInt541 = this.anInt547;
		}
		return this.anInt548 == -256 && (this.anInt543 & 0xFF) == 0 ? Static115.method340(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, arg3, arg2, this) : Static115.method344(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, arg3, arg2, this, this.anInt548, arg4);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "([IIIII)I")
	private int method349(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt545 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt545;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt545 += arg1;
			if (this.anInt548 == 256 && (this.anInt543 & 0xFF) == 0) {
				arg1 = Static115.method338(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, this.anInt550, this.anInt546, local7, arg2, this);
			} else {
				arg1 = Static115.method341(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, this.anInt550, this.anInt546, local7, arg2, this, this.anInt548, arg4);
			}
			this.anInt545 -= arg1;
			if (this.anInt545 != 0) {
				return arg1;
			}
			if (this.anInt547 == Integer.MIN_VALUE) {
				this.method1930();
				return arg3;
			}
			this.anInt541 = this.anInt547;
		}
		return this.anInt548 == 256 && (this.anInt543 & 0xFF) == 0 ? Static115.method342(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, arg3, arg2, this) : Static115.method336(((Class3_Sub9_Sub1) super.aClass3_Sub9_3).aByteArray21, arg0, this.anInt543, arg1, this.anInt541, arg3, arg2, this, this.anInt548, arg4);
	}
}
