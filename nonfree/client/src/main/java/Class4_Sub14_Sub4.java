import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class4_Sub14_Sub4 extends Class4_Sub14 {

	@OriginalMember(owner = "client!si", name = "n", descriptor = "I")
	private int anInt5996;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "I")
	public int anInt5997;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "I")
	public int anInt5999;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	private int anInt6000;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "I")
	public int anInt6004;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "I")
	public int anInt6005;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "I")
	public int anInt6007;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "I")
	public int anInt6009;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "I")
	private final int anInt6003;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private final int anInt5998;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
	private final boolean aBoolean423;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "I")
	private int anInt6006;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "I")
	public int anInt6008;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!jc;II)V")
	public Class4_Sub14_Sub4(@OriginalArg(0) Class4_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub15_5 = arg0;
		this.anInt6003 = arg0.anInt3296;
		this.anInt5998 = arg0.anInt3297;
		this.aBoolean423 = arg0.aBoolean257;
		this.anInt6001 = arg1;
		this.anInt6002 = arg2;
		this.anInt6006 = 8192;
		this.anInt6008 = 0;
		this.method4818();
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!jc;III)V")
	public Class4_Sub14_Sub4(@OriginalArg(0) Class4_Sub15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub15_5 = arg0;
		this.anInt6003 = arg0.anInt3296;
		this.anInt5998 = arg0.anInt3297;
		this.aBoolean423 = arg0.aBoolean257;
		this.anInt6001 = arg1;
		this.anInt6002 = arg2;
		this.anInt6006 = arg3;
		this.anInt6008 = 0;
		this.method4818();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4788(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6002 == 0 && this.anInt5996 == 0) {
			this.method4783(arg2);
			return;
		}
		@Pc(13) Class4_Sub15_Sub1 local13 = (Class4_Sub15_Sub1) super.aClass4_Sub15_5;
		@Pc(18) int local18 = this.anInt6003 << 8;
		@Pc(23) int local23 = this.anInt5998 << 8;
		@Pc(29) int local29 = local13.aByteArray34.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt6000 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt6008 < 0) {
			if (this.anInt6001 <= 0) {
				this.method4824();
				this.method6059();
				return;
			}
			this.anInt6008 = 0;
		}
		if (this.anInt6008 >= local29) {
			if (this.anInt6001 >= 0) {
				this.method4824();
				this.method6059();
				return;
			}
			this.anInt6008 = local29 - 1;
		}
		if (this.anInt6000 >= 0) {
			if (this.anInt6000 > 0) {
				if (this.aBoolean423) {
					label130: {
						if (this.anInt6001 < 0) {
							local40 = this.method4793(arg0, arg1, local18, local44, local13.aByteArray34[this.anInt6003]);
							if (this.anInt6008 >= local18) {
								return;
							}
							this.anInt6008 = local18 + local18 - this.anInt6008 - 1;
							this.anInt6001 = -this.anInt6001;
							if (--this.anInt6000 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method4809(arg0, local40, local23, local44, local13.aByteArray34[this.anInt5998 - 1]);
							if (this.anInt6008 < local23) {
								return;
							}
							this.anInt6008 = local23 + local23 - this.anInt6008 - 1;
							this.anInt6001 = -this.anInt6001;
							if (--this.anInt6000 == 0) {
								break;
							}
							local40 = this.method4793(arg0, local40, local18, local44, local13.aByteArray34[this.anInt6003]);
							if (this.anInt6008 >= local18) {
								return;
							}
							this.anInt6008 = local18 + local18 - this.anInt6008 - 1;
							this.anInt6001 = -this.anInt6001;
						} while (--this.anInt6000 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt6001 < 0) {
						while (true) {
							local40 = this.method4793(arg0, local40, local18, local44, local13.aByteArray34[this.anInt5998 - 1]);
							if (this.anInt6008 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt6008 - 1) / local33;
							if (local416 >= this.anInt6000) {
								this.anInt6008 += local33 * this.anInt6000;
								this.anInt6000 = 0;
								break;
							}
							this.anInt6008 += local33 * local416;
							this.anInt6000 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method4809(arg0, local40, local23, local44, local13.aByteArray34[this.anInt6003]);
							if (this.anInt6008 < local23) {
								return;
							}
							local416 = (this.anInt6008 - local18) / local33;
							if (local416 >= this.anInt6000) {
								this.anInt6008 -= local33 * this.anInt6000;
								this.anInt6000 = 0;
								break;
							}
							this.anInt6008 -= local33 * local416;
							this.anInt6000 -= local416;
						}
					}
				}
			}
			if (this.anInt6001 < 0) {
				this.method4793(arg0, local40, 0, local44, 0);
				if (this.anInt6008 < 0) {
					this.anInt6008 = -1;
					this.method4824();
					this.method6059();
					return;
				}
			} else {
				this.method4809(arg0, local40, local29, local44, 0);
				if (this.anInt6008 >= local29) {
					this.anInt6008 = local29;
					this.method4824();
					this.method6059();
				}
			}
		} else if (this.aBoolean423) {
			if (this.anInt6001 < 0) {
				local40 = this.method4793(arg0, arg1, local18, local44, local13.aByteArray34[this.anInt6003]);
				if (this.anInt6008 >= local18) {
					return;
				}
				this.anInt6008 = local18 + local18 - this.anInt6008 - 1;
				this.anInt6001 = -this.anInt6001;
			}
			while (true) {
				local40 = this.method4809(arg0, local40, local23, local44, local13.aByteArray34[this.anInt5998 - 1]);
				if (this.anInt6008 < local23) {
					return;
				}
				this.anInt6008 = local23 + local23 - this.anInt6008 - 1;
				this.anInt6001 = -this.anInt6001;
				local40 = this.method4793(arg0, local40, local18, local44, local13.aByteArray34[this.anInt6003]);
				if (this.anInt6008 >= local18) {
					return;
				}
				this.anInt6008 = local18 + local18 - this.anInt6008 - 1;
				this.anInt6001 = -this.anInt6001;
			}
		} else if (this.anInt6001 < 0) {
			while (true) {
				local40 = this.method4793(arg0, local40, local18, local44, local13.aByteArray34[this.anInt5998 - 1]);
				if (this.anInt6008 >= local18) {
					return;
				}
				this.anInt6008 = local23 - (local23 - 1 - this.anInt6008) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method4809(arg0, local40, local23, local44, local13.aByteArray34[this.anInt6003]);
				if (this.anInt6008 < local23) {
					return;
				}
				this.anInt6008 = local18 + (this.anInt6008 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "()I")
	@Override
	public int method4785() {
		@Pc(6) int local6 = this.anInt6007 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt6000 == 0) {
			local6 -= local6 * this.anInt6008 / (((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34.length << 8);
		} else if (this.anInt6000 >= 0) {
			local6 -= local6 * this.anInt6003 / ((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "()Z")
	private boolean method4791() {
		@Pc(2) int local2 = this.anInt6002;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static466.method4799(local2, this.anInt6006);
			local8 = Static466.method4808(local2, this.anInt6006);
		}
		if (this.anInt6007 != local2 || this.anInt6005 != local10 || this.anInt5999 != local8) {
			if (this.anInt6007 < local2) {
				this.anInt6004 = 1;
				this.anInt5996 = local2 - this.anInt6007;
			} else if (this.anInt6007 > local2) {
				this.anInt6004 = -1;
				this.anInt5996 = this.anInt6007 - local2;
			} else {
				this.anInt6004 = 0;
			}
			if (this.anInt6005 < local10) {
				this.anInt5997 = 1;
				if (this.anInt5996 == 0 || this.anInt5996 > local10 - this.anInt6005) {
					this.anInt5996 = local10 - this.anInt6005;
				}
			} else if (this.anInt6005 > local10) {
				this.anInt5997 = -1;
				if (this.anInt5996 == 0 || this.anInt5996 > this.anInt6005 - local10) {
					this.anInt5996 = this.anInt6005 - local10;
				}
			} else {
				this.anInt5997 = 0;
			}
			if (this.anInt5999 < local8) {
				this.anInt6009 = 1;
				if (this.anInt5996 == 0 || this.anInt5996 > local8 - this.anInt5999) {
					this.anInt5996 = local8 - this.anInt5999;
				}
			} else if (this.anInt5999 > local8) {
				this.anInt6009 = -1;
				if (this.anInt5996 == 0 || this.anInt5996 > this.anInt5999 - local8) {
					this.anInt5996 = this.anInt5999 - local8;
				}
			} else {
				this.anInt6009 = 0;
			}
			return false;
		} else if (this.anInt6002 == Integer.MIN_VALUE) {
			this.anInt6002 = 0;
			this.anInt6007 = this.anInt6005 = this.anInt5999 = 0;
			this.method6059();
			return true;
		} else {
			this.method4818();
			return false;
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "()I")
	@Override
	public int method4786() {
		return this.anInt6002 == 0 && this.anInt5996 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([IIIII)I")
	private int method4793(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5996 <= 0) {
				if (this.anInt6001 == -256 && (this.anInt6008 & 0xFF) == 0) {
					if (Static391.aBoolean443) {
						return Static466.method4800(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, arg3, arg2, this);
					}
					return Static466.method4815(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, arg3, arg2, this);
				}
				if (Static391.aBoolean443) {
					return Static466.method4790(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, arg3, arg2, this, this.anInt6001, arg4);
				}
				return Static466.method4803(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, arg3, arg2, this, this.anInt6001, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5996;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5996 += arg1;
			if (this.anInt6001 == -256 && (this.anInt6008 & 0xFF) == 0) {
				if (Static391.aBoolean443) {
					arg1 = Static466.method4820(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, this.anInt5997, this.anInt6009, local5, arg2, this);
				} else {
					arg1 = Static466.method4822(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, this.anInt6004, local5, arg2, this);
				}
			} else if (Static391.aBoolean443) {
				arg1 = Static466.method4821(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, this.anInt5997, this.anInt6009, local5, arg2, this, this.anInt6001, arg4);
			} else {
				arg1 = Static466.method4827(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, this.anInt6004, local5, arg2, this, this.anInt6001, arg4);
			}
			this.anInt5996 -= arg1;
			if (this.anInt5996 != 0) {
				return arg1;
			}
		} while (!this.method4791());
		return arg3;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
	public synchronized void method4796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method4806(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static466.method4799(arg1, arg2);
		@Pc(14) int local14 = Static466.method4808(arg1, arg2);
		if (this.anInt6005 == local10 && this.anInt5999 == local14) {
			this.anInt5996 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt6007;
		if (this.anInt6007 - arg1 > local31) {
			local31 = this.anInt6007 - arg1;
		}
		if (local10 - this.anInt6005 > local31) {
			local31 = local10 - this.anInt6005;
		}
		if (this.anInt6005 - local10 > local31) {
			local31 = this.anInt6005 - local10;
		}
		if (local14 - this.anInt5999 > local31) {
			local31 = local14 - this.anInt5999;
		}
		if (this.anInt5999 - local14 > local31) {
			local31 = this.anInt5999 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt5996 = arg0;
		this.anInt6002 = arg1;
		this.anInt6006 = arg2;
		this.anInt6004 = (arg1 - this.anInt6007) / arg0;
		this.anInt5997 = (local10 - this.anInt6005) / arg0;
		this.anInt6009 = (local14 - this.anInt5999) / arg0;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
	public synchronized void method4797(@OriginalArg(0) int arg0) {
		if (this.anInt6001 < 0) {
			this.anInt6001 = -arg0;
		} else {
			this.anInt6001 = arg0;
		}
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "()I")
	public synchronized int method4798() {
		return this.anInt6002 == Integer.MIN_VALUE ? 0 : this.anInt6002;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "()Lclient!hu;")
	@Override
	public Class4_Sub14 method4787() {
		return null;
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
	public synchronized void method4801(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt6008 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "()I")
	public synchronized int method4802() {
		return this.anInt6001 < 0 ? -this.anInt6001 : this.anInt6001;
	}

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V")
	public synchronized void method4805(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4826();
			this.method6059();
		} else if (this.anInt6005 == 0 && this.anInt5999 == 0) {
			this.anInt5996 = 0;
			this.anInt6002 = 0;
			this.anInt6007 = 0;
			this.method6059();
		} else {
			@Pc(31) int local31 = -this.anInt6007;
			if (this.anInt6007 > local31) {
				local31 = this.anInt6007;
			}
			if (-this.anInt6005 > local31) {
				local31 = -this.anInt6005;
			}
			if (this.anInt6005 > local31) {
				local31 = this.anInt6005;
			}
			if (-this.anInt5999 > local31) {
				local31 = -this.anInt5999;
			}
			if (this.anInt5999 > local31) {
				local31 = this.anInt5999;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt5996 = arg0;
			this.anInt6002 = Integer.MIN_VALUE;
			this.anInt6004 = -this.anInt6007 / arg0;
			this.anInt5997 = -this.anInt6005 / arg0;
			this.anInt6009 = -this.anInt5999 / arg0;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
	private synchronized void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6002 = arg0;
		this.anInt6006 = arg1;
		this.anInt5996 = 0;
		this.method4818();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()Lclient!hu;")
	@Override
	public Class4_Sub14 method4784() {
		return null;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "([IIIII)I")
	private int method4809(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt5996 <= 0) {
				if (this.anInt6001 == 256 && (this.anInt6008 & 0xFF) == 0) {
					if (Static391.aBoolean443) {
						return Static466.method4795(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, arg3, arg2, this);
					}
					return Static466.method4825(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, arg3, arg2, this);
				}
				if (Static391.aBoolean443) {
					return Static466.method4804(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, arg3, arg2, this, this.anInt6001, arg4);
				}
				return Static466.method4807(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, arg3, arg2, this, this.anInt6001, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt5996;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt5996 += arg1;
			if (this.anInt6001 == 256 && (this.anInt6008 & 0xFF) == 0) {
				if (Static391.aBoolean443) {
					arg1 = Static466.method4829(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, this.anInt5997, this.anInt6009, local5, arg2, this);
				} else {
					arg1 = Static466.method4794(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, this.anInt6004, local5, arg2, this);
				}
			} else if (Static391.aBoolean443) {
				arg1 = Static466.method4792(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6005, this.anInt5999, this.anInt5997, this.anInt6009, local5, arg2, this, this.anInt6001, arg4);
			} else {
				arg1 = Static466.method4816(((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34, arg0, this.anInt6008, arg1, this.anInt6007, this.anInt6004, local5, arg2, this, this.anInt6001, arg4);
			}
			this.anInt5996 -= arg1;
			if (this.anInt5996 != 0) {
				return arg1;
			}
		} while (!this.method4791());
		return arg3;
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "()Z")
	public boolean method4810() {
		return this.anInt6008 < 0 || this.anInt6008 >= ((Class4_Sub15_Sub1) super.aClass4_Sub15_5).aByteArray34.length << 8;
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(I)V")
	public synchronized void method4812(@OriginalArg(0) int arg0) {
		this.anInt6000 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
	public synchronized void method4813() {
		this.anInt6001 = (this.anInt6001 ^ this.anInt6001 >> 31) + (this.anInt6001 >>> 31);
		this.anInt6001 = -this.anInt6001;
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(II)V")
	public synchronized void method4817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method4796(arg0, arg1, this.method4828());
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "()V")
	private void method4818() {
		this.anInt6007 = this.anInt6002;
		this.anInt6005 = Static466.method4799(this.anInt6002, this.anInt6006);
		this.anInt5999 = Static466.method4808(this.anInt6002, this.anInt6006);
	}

	@OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V")
	public synchronized void method4819(@OriginalArg(0) int arg0) {
		this.method4806(arg0 << 6, this.method4828());
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "()Z")
	public boolean method4823() {
		return this.anInt5996 != 0;
	}

	@OriginalMember(owner = "client!si", name = "k", descriptor = "()V")
	private void method4824() {
		if (this.anInt5996 == 0) {
			return;
		}
		if (this.anInt6002 == Integer.MIN_VALUE) {
			this.anInt6002 = 0;
		}
		this.anInt5996 = 0;
		this.method4818();
	}

	@OriginalMember(owner = "client!si", name = "j", descriptor = "(I)V")
	private synchronized void method4826() {
		this.method4806(0, this.method4828());
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4783(@OriginalArg(0) int arg0) {
		if (this.anInt5996 > 0) {
			if (arg0 >= this.anInt5996) {
				if (this.anInt6002 == Integer.MIN_VALUE) {
					this.anInt6002 = 0;
					this.anInt6007 = this.anInt6005 = this.anInt5999 = 0;
					this.method6059();
					arg0 = this.anInt5996;
				}
				this.anInt5996 = 0;
				this.method4818();
			} else {
				this.anInt6007 += this.anInt6004 * arg0;
				this.anInt6005 += this.anInt5997 * arg0;
				this.anInt5999 += this.anInt6009 * arg0;
				this.anInt5996 -= arg0;
			}
		}
		@Pc(71) Class4_Sub15_Sub1 local71 = (Class4_Sub15_Sub1) super.aClass4_Sub15_5;
		@Pc(76) int local76 = this.anInt6003 << 8;
		@Pc(81) int local81 = this.anInt5998 << 8;
		@Pc(87) int local87 = local71.aByteArray34.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt6000 = 0;
		}
		if (this.anInt6008 < 0) {
			if (this.anInt6001 <= 0) {
				this.method4824();
				this.method6059();
				return;
			}
			this.anInt6008 = 0;
		}
		if (this.anInt6008 >= local87) {
			if (this.anInt6001 >= 0) {
				this.method4824();
				this.method6059();
				return;
			}
			this.anInt6008 = local87 - 1;
		}
		this.anInt6008 += this.anInt6001 * arg0;
		if (this.anInt6000 >= 0) {
			if (this.anInt6000 > 0) {
				if (this.aBoolean423) {
					label125: {
						if (this.anInt6001 < 0) {
							if (this.anInt6008 >= local76) {
								return;
							}
							this.anInt6008 = local76 + local76 - this.anInt6008 - 1;
							this.anInt6001 = -this.anInt6001;
							if (--this.anInt6000 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt6008 < local81) {
								return;
							}
							this.anInt6008 = local81 + local81 - this.anInt6008 - 1;
							this.anInt6001 = -this.anInt6001;
							if (--this.anInt6000 == 0) {
								break;
							}
							if (this.anInt6008 >= local76) {
								return;
							}
							this.anInt6008 = local76 + local76 - this.anInt6008 - 1;
							this.anInt6001 = -this.anInt6001;
						} while (--this.anInt6000 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt6001 < 0) {
						if (this.anInt6008 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt6008 - 1) / local91;
						if (local361 < this.anInt6000) {
							this.anInt6008 += local91 * local361;
							this.anInt6000 -= local361;
							return;
						}
						this.anInt6008 += local91 * this.anInt6000;
						this.anInt6000 = 0;
					} else if (this.anInt6008 >= local81) {
						local361 = (this.anInt6008 - local76) / local91;
						if (local361 < this.anInt6000) {
							this.anInt6008 -= local91 * local361;
							this.anInt6000 -= local361;
							return;
						}
						this.anInt6008 -= local91 * this.anInt6000;
						this.anInt6000 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt6001 < 0) {
				if (this.anInt6008 < 0) {
					this.anInt6008 = -1;
					this.method4824();
					this.method6059();
					return;
				}
			} else if (this.anInt6008 >= local87) {
				this.anInt6008 = local87;
				this.method4824();
				this.method6059();
			}
		} else if (this.aBoolean423) {
			if (this.anInt6001 < 0) {
				if (this.anInt6008 >= local76) {
					return;
				}
				this.anInt6008 = local76 + local76 - this.anInt6008 - 1;
				this.anInt6001 = -this.anInt6001;
			}
			while (this.anInt6008 >= local81) {
				this.anInt6008 = local81 + local81 - this.anInt6008 - 1;
				this.anInt6001 = -this.anInt6001;
				if (this.anInt6008 >= local76) {
					return;
				}
				this.anInt6008 = local76 + local76 - this.anInt6008 - 1;
				this.anInt6001 = -this.anInt6001;
			}
		} else if (this.anInt6001 < 0) {
			if (this.anInt6008 < local76) {
				this.anInt6008 = local81 - (local81 - 1 - this.anInt6008) % local91 - 1;
			}
		} else if (this.anInt6008 >= local81) {
			this.anInt6008 = local76 + (this.anInt6008 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!si", name = "l", descriptor = "()I")
	public synchronized int method4828() {
		return this.anInt6006 < 0 ? -1 : this.anInt6006;
	}
}
