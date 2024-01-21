import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	public int anInt1240;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	private int anInt1241;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	private int anInt1242;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	public int anInt1243;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "I")
	public int anInt1245;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public int anInt1252;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	public int anInt1253;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	private final int anInt1249;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	private final int anInt1246;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	private int anInt1244;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "I")
	private int anInt1247;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!qe;II)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) Class2_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub19_5 = arg0;
		this.anInt1249 = arg0.anInt3160;
		this.anInt1246 = arg0.anInt3161;
		this.aBoolean51 = arg0.aBoolean129;
		this.anInt1244 = arg1;
		this.anInt1251 = arg2;
		this.anInt1247 = 8192;
		this.anInt1248 = 0;
		this.method801();
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!qe;III)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) Class2_Sub19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub19_5 = arg0;
		this.anInt1249 = arg0.anInt3160;
		this.anInt1246 = arg0.anInt3161;
		this.aBoolean51 = arg0.aBoolean129;
		this.anInt1244 = arg1;
		this.anInt1251 = arg2;
		this.anInt1247 = arg3;
		this.anInt1248 = 0;
		this.method801();
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public synchronized void method775(@OriginalArg(0) int arg0) {
		this.anInt1241 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()Z")
	public boolean method777() {
		return this.anInt1242 != 0;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
	private synchronized void method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1251 = arg0;
		this.anInt1247 = arg1;
		this.anInt1242 = 0;
		this.method801();
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
	public synchronized void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method806(arg0, arg1, this.method798());
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "()Z")
	public boolean method781() {
		return this.anInt1248 < 0 || this.anInt1248 >= ((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38.length << 8;
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "()I")
	public synchronized int method782() {
		return this.anInt1244 < 0 ? -this.anInt1244 : this.anInt1244;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public Class2_Sub10 method2737() {
		return null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([IIIII)I")
	private int method785(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1242 <= 0) {
				if (this.anInt1244 == -256 && (this.anInt1248 & 0xFF) == 0) {
					if (Static23.aBoolean20) {
						return Static186.method802(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, arg3, arg2, this);
					}
					return Static186.method795(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, arg3, arg2, this);
				}
				if (Static23.aBoolean20) {
					return Static186.method787(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, arg3, arg2, this, this.anInt1244, arg4);
				}
				return Static186.method788(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, arg3, arg2, this, this.anInt1244, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1242;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1242 += arg1;
			if (this.anInt1244 == -256 && (this.anInt1248 & 0xFF) == 0) {
				if (Static23.aBoolean20) {
					arg1 = Static186.method791(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, this.anInt1245, this.anInt1243, local5, arg2, this);
				} else {
					arg1 = Static186.method807(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, this.anInt1240, local5, arg2, this);
				}
			} else if (Static23.aBoolean20) {
				arg1 = Static186.method810(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, this.anInt1245, this.anInt1243, local5, arg2, this, this.anInt1244, arg4);
			} else {
				arg1 = Static186.method813(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, this.anInt1240, local5, arg2, this, this.anInt1244, arg4);
			}
			this.anInt1242 -= arg1;
			if (this.anInt1242 != 0) {
				return arg1;
			}
		} while (!this.method805());
		return arg3;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)V")
	public synchronized void method786() {
		this.anInt1244 = (this.anInt1244 ^ this.anInt1244 >> 31) + (this.anInt1244 >>> 31);
		this.anInt1244 = -this.anInt1244;
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "()V")
	private void method789() {
		if (this.anInt1242 == 0) {
			return;
		}
		if (this.anInt1251 == Integer.MIN_VALUE) {
			this.anInt1251 = 0;
		}
		this.anInt1242 = 0;
		this.method801();
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public synchronized void method790(@OriginalArg(0) int arg0) {
		this.method778(arg0 << 6, this.method798());
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1251 == 0 && this.anInt1242 == 0) {
			this.method2741(arg2);
			return;
		}
		@Pc(13) Class2_Sub19_Sub1 local13 = (Class2_Sub19_Sub1) super.aClass2_Sub19_5;
		@Pc(18) int local18 = this.anInt1249 << 8;
		@Pc(23) int local23 = this.anInt1246 << 8;
		@Pc(29) int local29 = local13.aByteArray38.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1241 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1248 < 0) {
			if (this.anInt1244 <= 0) {
				this.method789();
				this.method2808();
				return;
			}
			this.anInt1248 = 0;
		}
		if (this.anInt1248 >= local29) {
			if (this.anInt1244 >= 0) {
				this.method789();
				this.method2808();
				return;
			}
			this.anInt1248 = local29 - 1;
		}
		if (this.anInt1241 >= 0) {
			if (this.anInt1241 > 0) {
				if (this.aBoolean51) {
					label130: {
						if (this.anInt1244 < 0) {
							local40 = this.method785(arg0, arg1, local18, local44, local13.aByteArray38[this.anInt1249]);
							if (this.anInt1248 >= local18) {
								return;
							}
							this.anInt1248 = local18 + local18 - this.anInt1248 - 1;
							this.anInt1244 = -this.anInt1244;
							if (--this.anInt1241 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method792(arg0, local40, local23, local44, local13.aByteArray38[this.anInt1246 - 1]);
							if (this.anInt1248 < local23) {
								return;
							}
							this.anInt1248 = local23 + local23 - this.anInt1248 - 1;
							this.anInt1244 = -this.anInt1244;
							if (--this.anInt1241 == 0) {
								break;
							}
							local40 = this.method785(arg0, local40, local18, local44, local13.aByteArray38[this.anInt1249]);
							if (this.anInt1248 >= local18) {
								return;
							}
							this.anInt1248 = local18 + local18 - this.anInt1248 - 1;
							this.anInt1244 = -this.anInt1244;
						} while (--this.anInt1241 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1244 < 0) {
						while (true) {
							local40 = this.method785(arg0, local40, local18, local44, local13.aByteArray38[this.anInt1246 - 1]);
							if (this.anInt1248 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1248 - 1) / local33;
							if (local416 >= this.anInt1241) {
								this.anInt1248 += local33 * this.anInt1241;
								this.anInt1241 = 0;
								break;
							}
							this.anInt1248 += local33 * local416;
							this.anInt1241 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method792(arg0, local40, local23, local44, local13.aByteArray38[this.anInt1249]);
							if (this.anInt1248 < local23) {
								return;
							}
							local416 = (this.anInt1248 - local18) / local33;
							if (local416 >= this.anInt1241) {
								this.anInt1248 -= local33 * this.anInt1241;
								this.anInt1241 = 0;
								break;
							}
							this.anInt1248 -= local33 * local416;
							this.anInt1241 -= local416;
						}
					}
				}
			}
			if (this.anInt1244 < 0) {
				this.method785(arg0, local40, 0, local44, 0);
				if (this.anInt1248 < 0) {
					this.anInt1248 = -1;
					this.method789();
					this.method2808();
					return;
				}
			} else {
				this.method792(arg0, local40, local29, local44, 0);
				if (this.anInt1248 >= local29) {
					this.anInt1248 = local29;
					this.method789();
					this.method2808();
				}
			}
		} else if (this.aBoolean51) {
			if (this.anInt1244 < 0) {
				local40 = this.method785(arg0, arg1, local18, local44, local13.aByteArray38[this.anInt1249]);
				if (this.anInt1248 >= local18) {
					return;
				}
				this.anInt1248 = local18 + local18 - this.anInt1248 - 1;
				this.anInt1244 = -this.anInt1244;
			}
			while (true) {
				local40 = this.method792(arg0, local40, local23, local44, local13.aByteArray38[this.anInt1246 - 1]);
				if (this.anInt1248 < local23) {
					return;
				}
				this.anInt1248 = local23 + local23 - this.anInt1248 - 1;
				this.anInt1244 = -this.anInt1244;
				local40 = this.method785(arg0, local40, local18, local44, local13.aByteArray38[this.anInt1249]);
				if (this.anInt1248 >= local18) {
					return;
				}
				this.anInt1248 = local18 + local18 - this.anInt1248 - 1;
				this.anInt1244 = -this.anInt1244;
			}
		} else if (this.anInt1244 < 0) {
			while (true) {
				local40 = this.method785(arg0, local40, local18, local44, local13.aByteArray38[this.anInt1246 - 1]);
				if (this.anInt1248 >= local18) {
					return;
				}
				this.anInt1248 = local23 - (local23 - 1 - this.anInt1248) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method792(arg0, local40, local23, local44, local13.aByteArray38[this.anInt1249]);
				if (this.anInt1248 < local23) {
					return;
				}
				this.anInt1248 = local18 + (this.anInt1248 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "([IIIII)I")
	private int method792(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1242 <= 0) {
				if (this.anInt1244 == 256 && (this.anInt1248 & 0xFF) == 0) {
					if (Static23.aBoolean20) {
						return Static186.method780(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, arg3, arg2, this);
					}
					return Static186.method796(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, arg3, arg2, this);
				}
				if (Static23.aBoolean20) {
					return Static186.method803(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, arg3, arg2, this, this.anInt1244, arg4);
				}
				return Static186.method783(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, arg3, arg2, this, this.anInt1244, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1242;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1242 += arg1;
			if (this.anInt1244 == 256 && (this.anInt1248 & 0xFF) == 0) {
				if (Static23.aBoolean20) {
					arg1 = Static186.method808(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, this.anInt1245, this.anInt1243, local5, arg2, this);
				} else {
					arg1 = Static186.method784(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, this.anInt1240, local5, arg2, this);
				}
			} else if (Static23.aBoolean20) {
				arg1 = Static186.method793(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1250, this.anInt1252, this.anInt1245, this.anInt1243, local5, arg2, this, this.anInt1244, arg4);
			} else {
				arg1 = Static186.method804(((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38, arg0, this.anInt1248, arg1, this.anInt1253, this.anInt1240, local5, arg2, this, this.anInt1244, arg4);
			}
			this.anInt1242 -= arg1;
			if (this.anInt1242 != 0) {
				return arg1;
			}
		} while (!this.method805());
		return arg3;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public synchronized void method794(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1248 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "()I")
	public synchronized int method798() {
		return this.anInt1247 < 0 ? -1 : this.anInt1247;
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	private synchronized void method799() {
		this.method778(0, this.method798());
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
	public synchronized void method800(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method799();
			this.method2808();
		} else if (this.anInt1250 == 0 && this.anInt1252 == 0) {
			this.anInt1242 = 0;
			this.anInt1251 = 0;
			this.anInt1253 = 0;
			this.method2808();
		} else {
			@Pc(31) int local31 = -this.anInt1253;
			if (this.anInt1253 > local31) {
				local31 = this.anInt1253;
			}
			if (-this.anInt1250 > local31) {
				local31 = -this.anInt1250;
			}
			if (this.anInt1250 > local31) {
				local31 = this.anInt1250;
			}
			if (-this.anInt1252 > local31) {
				local31 = -this.anInt1252;
			}
			if (this.anInt1252 > local31) {
				local31 = this.anInt1252;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1242 = arg0;
			this.anInt1251 = Integer.MIN_VALUE;
			this.anInt1240 = -this.anInt1253 / arg0;
			this.anInt1245 = -this.anInt1250 / arg0;
			this.anInt1243 = -this.anInt1252 / arg0;
		}
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "()V")
	private void method801() {
		this.anInt1253 = this.anInt1251;
		this.anInt1250 = Static186.method774(this.anInt1251, this.anInt1247);
		this.anInt1252 = Static186.method797(this.anInt1251, this.anInt1247);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2741(@OriginalArg(0) int arg0) {
		if (this.anInt1242 > 0) {
			if (arg0 >= this.anInt1242) {
				if (this.anInt1251 == Integer.MIN_VALUE) {
					this.anInt1251 = 0;
					this.anInt1253 = this.anInt1250 = this.anInt1252 = 0;
					this.method2808();
					arg0 = this.anInt1242;
				}
				this.anInt1242 = 0;
				this.method801();
			} else {
				this.anInt1253 += this.anInt1240 * arg0;
				this.anInt1250 += this.anInt1245 * arg0;
				this.anInt1252 += this.anInt1243 * arg0;
				this.anInt1242 -= arg0;
			}
		}
		@Pc(71) Class2_Sub19_Sub1 local71 = (Class2_Sub19_Sub1) super.aClass2_Sub19_5;
		@Pc(76) int local76 = this.anInt1249 << 8;
		@Pc(81) int local81 = this.anInt1246 << 8;
		@Pc(87) int local87 = local71.aByteArray38.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1241 = 0;
		}
		if (this.anInt1248 < 0) {
			if (this.anInt1244 <= 0) {
				this.method789();
				this.method2808();
				return;
			}
			this.anInt1248 = 0;
		}
		if (this.anInt1248 >= local87) {
			if (this.anInt1244 >= 0) {
				this.method789();
				this.method2808();
				return;
			}
			this.anInt1248 = local87 - 1;
		}
		this.anInt1248 += this.anInt1244 * arg0;
		if (this.anInt1241 >= 0) {
			if (this.anInt1241 > 0) {
				if (this.aBoolean51) {
					label125: {
						if (this.anInt1244 < 0) {
							if (this.anInt1248 >= local76) {
								return;
							}
							this.anInt1248 = local76 + local76 - this.anInt1248 - 1;
							this.anInt1244 = -this.anInt1244;
							if (--this.anInt1241 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1248 < local81) {
								return;
							}
							this.anInt1248 = local81 + local81 - this.anInt1248 - 1;
							this.anInt1244 = -this.anInt1244;
							if (--this.anInt1241 == 0) {
								break;
							}
							if (this.anInt1248 >= local76) {
								return;
							}
							this.anInt1248 = local76 + local76 - this.anInt1248 - 1;
							this.anInt1244 = -this.anInt1244;
						} while (--this.anInt1241 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1244 < 0) {
						if (this.anInt1248 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1248 - 1) / local91;
						if (local361 < this.anInt1241) {
							this.anInt1248 += local91 * local361;
							this.anInt1241 -= local361;
							return;
						}
						this.anInt1248 += local91 * this.anInt1241;
						this.anInt1241 = 0;
					} else if (this.anInt1248 >= local81) {
						local361 = (this.anInt1248 - local76) / local91;
						if (local361 < this.anInt1241) {
							this.anInt1248 -= local91 * local361;
							this.anInt1241 -= local361;
							return;
						}
						this.anInt1248 -= local91 * this.anInt1241;
						this.anInt1241 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1244 < 0) {
				if (this.anInt1248 < 0) {
					this.anInt1248 = -1;
					this.method789();
					this.method2808();
					return;
				}
			} else if (this.anInt1248 >= local87) {
				this.anInt1248 = local87;
				this.method789();
				this.method2808();
			}
		} else if (this.aBoolean51) {
			if (this.anInt1244 < 0) {
				if (this.anInt1248 >= local76) {
					return;
				}
				this.anInt1248 = local76 + local76 - this.anInt1248 - 1;
				this.anInt1244 = -this.anInt1244;
			}
			while (this.anInt1248 >= local81) {
				this.anInt1248 = local81 + local81 - this.anInt1248 - 1;
				this.anInt1244 = -this.anInt1244;
				if (this.anInt1248 >= local76) {
					return;
				}
				this.anInt1248 = local76 + local76 - this.anInt1248 - 1;
				this.anInt1244 = -this.anInt1244;
			}
		} else if (this.anInt1244 < 0) {
			if (this.anInt1248 < local76) {
				this.anInt1248 = local81 - (local81 - 1 - this.anInt1248) % local91 - 1;
			}
		} else if (this.anInt1248 >= local81) {
			this.anInt1248 = local76 + (this.anInt1248 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
	@Override
	public int method2743() {
		return this.anInt1251 == 0 && this.anInt1242 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!f", name = "k", descriptor = "()Z")
	private boolean method805() {
		@Pc(2) int local2 = this.anInt1251;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static186.method774(local2, this.anInt1247);
			local8 = Static186.method797(local2, this.anInt1247);
		}
		if (this.anInt1253 != local2 || this.anInt1250 != local10 || this.anInt1252 != local8) {
			if (this.anInt1253 < local2) {
				this.anInt1240 = 1;
				this.anInt1242 = local2 - this.anInt1253;
			} else if (this.anInt1253 > local2) {
				this.anInt1240 = -1;
				this.anInt1242 = this.anInt1253 - local2;
			} else {
				this.anInt1240 = 0;
			}
			if (this.anInt1250 < local10) {
				this.anInt1245 = 1;
				if (this.anInt1242 == 0 || this.anInt1242 > local10 - this.anInt1250) {
					this.anInt1242 = local10 - this.anInt1250;
				}
			} else if (this.anInt1250 > local10) {
				this.anInt1245 = -1;
				if (this.anInt1242 == 0 || this.anInt1242 > this.anInt1250 - local10) {
					this.anInt1242 = this.anInt1250 - local10;
				}
			} else {
				this.anInt1245 = 0;
			}
			if (this.anInt1252 < local8) {
				this.anInt1243 = 1;
				if (this.anInt1242 == 0 || this.anInt1242 > local8 - this.anInt1252) {
					this.anInt1242 = local8 - this.anInt1252;
				}
			} else if (this.anInt1252 > local8) {
				this.anInt1243 = -1;
				if (this.anInt1242 == 0 || this.anInt1242 > this.anInt1252 - local8) {
					this.anInt1242 = this.anInt1252 - local8;
				}
			} else {
				this.anInt1243 = 0;
			}
			return false;
		} else if (this.anInt1251 == Integer.MIN_VALUE) {
			this.anInt1251 = 0;
			this.anInt1253 = this.anInt1250 = this.anInt1252 = 0;
			this.method2808();
			return true;
		} else {
			this.method801();
			return false;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public synchronized void method806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method778(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static186.method774(arg1, arg2);
		@Pc(14) int local14 = Static186.method797(arg1, arg2);
		if (this.anInt1250 == local10 && this.anInt1252 == local14) {
			this.anInt1242 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1253;
		if (this.anInt1253 - arg1 > local31) {
			local31 = this.anInt1253 - arg1;
		}
		if (local10 - this.anInt1250 > local31) {
			local31 = local10 - this.anInt1250;
		}
		if (this.anInt1250 - local10 > local31) {
			local31 = this.anInt1250 - local10;
		}
		if (local14 - this.anInt1252 > local31) {
			local31 = local14 - this.anInt1252;
		}
		if (this.anInt1252 - local14 > local31) {
			local31 = this.anInt1252 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1242 = arg0;
		this.anInt1251 = arg1;
		this.anInt1247 = arg2;
		this.anInt1240 = (arg1 - this.anInt1253) / arg0;
		this.anInt1245 = (local10 - this.anInt1250) / arg0;
		this.anInt1243 = (local14 - this.anInt1252) / arg0;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()I")
	@Override
	public int method2739() {
		@Pc(6) int local6 = this.anInt1253 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1241 == 0) {
			local6 -= local6 * this.anInt1248 / (((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38.length << 8);
		} else if (this.anInt1241 >= 0) {
			local6 -= local6 * this.anInt1249 / ((Class2_Sub19_Sub1) super.aClass2_Sub19_5).aByteArray38.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "()I")
	public synchronized int method811() {
		return this.anInt1251 == Integer.MIN_VALUE ? 0 : this.anInt1251;
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
	public synchronized void method812(@OriginalArg(0) int arg0) {
		if (this.anInt1244 < 0) {
			this.anInt1244 = -arg0;
		} else {
			this.anInt1244 = arg0;
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()Lclient!tf;")
	@Override
	public Class2_Sub10 method2738() {
		return null;
	}
}
