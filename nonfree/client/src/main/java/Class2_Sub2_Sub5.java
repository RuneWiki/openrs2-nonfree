import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	public int anInt9000;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public int anInt9001;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public int anInt9003;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	public int anInt9006;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	public int anInt9007;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	private int anInt9009;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	public int anInt9010;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	private int anInt9013;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	private final int anInt9012;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
	private final int anInt9005;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "Z")
	private final boolean aBoolean660;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
	private int anInt9011;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	private int anInt9002;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
	private int anInt9004;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	public int anInt9008;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!cj;III)V")
	public Class2_Sub2_Sub5(@OriginalArg(0) Class2_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub12_6 = arg0;
		this.anInt9012 = arg0.anInt1416;
		this.anInt9005 = arg0.anInt1414;
		this.aBoolean660 = arg0.aBoolean117;
		this.anInt9011 = arg1;
		this.anInt9002 = arg2;
		this.anInt9004 = arg3;
		this.anInt9008 = 0;
		this.method7550();
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "()V")
	private void method7545() {
		if (this.anInt9013 == 0) {
			return;
		}
		if (this.anInt9002 == Integer.MIN_VALUE) {
			this.anInt9002 = 0;
		}
		this.anInt9013 = 0;
		this.method7550();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([IIIII)I")
	private int method7549(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt9013 <= 0) {
				if (this.anInt9011 == -256 && (this.anInt9008 & 0xFF) == 0) {
					if (Static440.aBoolean586) {
						return Static652.method7575(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, arg3, arg2, this);
					}
					return Static652.method7547(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, arg3, arg2, this);
				}
				if (Static440.aBoolean586) {
					return Static652.method7567(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, arg3, arg2, this, this.anInt9011, arg4);
				}
				return Static652.method7551(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, arg3, arg2, this, this.anInt9011, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt9013;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt9013 += arg1;
			if (this.anInt9011 == -256 && (this.anInt9008 & 0xFF) == 0) {
				if (Static440.aBoolean586) {
					arg1 = Static652.method7573(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, this.anInt9007, this.anInt9001, local5, arg2, this);
				} else {
					arg1 = Static652.method7576(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, this.anInt9010, local5, arg2, this);
				}
			} else if (Static440.aBoolean586) {
				arg1 = Static652.method7578(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, this.anInt9007, this.anInt9001, local5, arg2, this, this.anInt9011, arg4);
			} else {
				arg1 = Static652.method7572(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, this.anInt9010, local5, arg2, this, this.anInt9011, arg4);
			}
			this.anInt9013 -= arg1;
			if (this.anInt9013 != 0) {
				return arg1;
			}
		} while (!this.method7557());
		return arg3;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7542() {
		return null;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "()V")
	private void method7550() {
		this.anInt9000 = this.anInt9002;
		this.anInt9006 = Static652.method7561(this.anInt9002, this.anInt9004);
		this.anInt9003 = Static652.method7564(this.anInt9002, this.anInt9004);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public synchronized void method7552(@OriginalArg(0) int arg0) {
		this.anInt9009 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public synchronized void method7553() {
		this.anInt9011 = (this.anInt9011 ^ this.anInt9011 >> 31) + (this.anInt9011 >>> 31);
		this.anInt9011 = -this.anInt9011;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public synchronized void method7554(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt9008 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "()I")
	@Override
	public int method7541() {
		return this.anInt9002 == 0 && this.anInt9013 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V")
	private synchronized void method7556() {
		this.method7583(0, this.method7558());
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()Z")
	private boolean method7557() {
		@Pc(2) int local2 = this.anInt9002;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static652.method7561(local2, this.anInt9004);
			local8 = Static652.method7564(local2, this.anInt9004);
		}
		if (this.anInt9000 != local2 || this.anInt9006 != local10 || this.anInt9003 != local8) {
			if (this.anInt9000 < local2) {
				this.anInt9010 = 1;
				this.anInt9013 = local2 - this.anInt9000;
			} else if (this.anInt9000 > local2) {
				this.anInt9010 = -1;
				this.anInt9013 = this.anInt9000 - local2;
			} else {
				this.anInt9010 = 0;
			}
			if (this.anInt9006 < local10) {
				this.anInt9007 = 1;
				if (this.anInt9013 == 0 || this.anInt9013 > local10 - this.anInt9006) {
					this.anInt9013 = local10 - this.anInt9006;
				}
			} else if (this.anInt9006 > local10) {
				this.anInt9007 = -1;
				if (this.anInt9013 == 0 || this.anInt9013 > this.anInt9006 - local10) {
					this.anInt9013 = this.anInt9006 - local10;
				}
			} else {
				this.anInt9007 = 0;
			}
			if (this.anInt9003 < local8) {
				this.anInt9001 = 1;
				if (this.anInt9013 == 0 || this.anInt9013 > local8 - this.anInt9003) {
					this.anInt9013 = local8 - this.anInt9003;
				}
			} else if (this.anInt9003 > local8) {
				this.anInt9001 = -1;
				if (this.anInt9013 == 0 || this.anInt9013 > this.anInt9003 - local8) {
					this.anInt9013 = this.anInt9003 - local8;
				}
			} else {
				this.anInt9001 = 0;
			}
			return false;
		} else if (this.anInt9002 == Integer.MIN_VALUE) {
			this.anInt9002 = 0;
			this.anInt9000 = this.anInt9006 = this.anInt9003 = 0;
			this.method8599();
			return true;
		} else {
			this.method7550();
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "()I")
	public synchronized int method7558() {
		return this.anInt9004 < 0 ? -1 : this.anInt9004;
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()I")
	public synchronized int method7559() {
		return this.anInt9002 == Integer.MIN_VALUE ? 0 : this.anInt9002;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9002 == 0 && this.anInt9013 == 0) {
			this.method7544(arg2);
			return;
		}
		@Pc(13) Class2_Sub12_Sub1 local13 = (Class2_Sub12_Sub1) super.aClass2_Sub12_6;
		@Pc(18) int local18 = this.anInt9012 << 8;
		@Pc(23) int local23 = this.anInt9005 << 8;
		@Pc(29) int local29 = local13.aByteArray21.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt9009 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt9008 < 0) {
			if (this.anInt9011 <= 0) {
				this.method7545();
				this.method8599();
				return;
			}
			this.anInt9008 = 0;
		}
		if (this.anInt9008 >= local29) {
			if (this.anInt9011 >= 0) {
				this.method7545();
				this.method8599();
				return;
			}
			this.anInt9008 = local29 - 1;
		}
		if (this.anInt9009 >= 0) {
			if (this.anInt9009 > 0) {
				if (this.aBoolean660) {
					label130: {
						if (this.anInt9011 < 0) {
							local40 = this.method7549(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt9012]);
							if (this.anInt9008 >= local18) {
								return;
							}
							this.anInt9008 = local18 + local18 - this.anInt9008 - 1;
							this.anInt9011 = -this.anInt9011;
							if (--this.anInt9009 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method7579(arg0, local40, local23, local44, local13.aByteArray21[this.anInt9005 - 1]);
							if (this.anInt9008 < local23) {
								return;
							}
							this.anInt9008 = local23 + local23 - this.anInt9008 - 1;
							this.anInt9011 = -this.anInt9011;
							if (--this.anInt9009 == 0) {
								break;
							}
							local40 = this.method7549(arg0, local40, local18, local44, local13.aByteArray21[this.anInt9012]);
							if (this.anInt9008 >= local18) {
								return;
							}
							this.anInt9008 = local18 + local18 - this.anInt9008 - 1;
							this.anInt9011 = -this.anInt9011;
						} while (--this.anInt9009 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt9011 < 0) {
						while (true) {
							local40 = this.method7549(arg0, local40, local18, local44, local13.aByteArray21[this.anInt9005 - 1]);
							if (this.anInt9008 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt9008 - 1) / local33;
							if (local416 >= this.anInt9009) {
								this.anInt9008 += local33 * this.anInt9009;
								this.anInt9009 = 0;
								break;
							}
							this.anInt9008 += local33 * local416;
							this.anInt9009 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method7579(arg0, local40, local23, local44, local13.aByteArray21[this.anInt9012]);
							if (this.anInt9008 < local23) {
								return;
							}
							local416 = (this.anInt9008 - local18) / local33;
							if (local416 >= this.anInt9009) {
								this.anInt9008 -= local33 * this.anInt9009;
								this.anInt9009 = 0;
								break;
							}
							this.anInt9008 -= local33 * local416;
							this.anInt9009 -= local416;
						}
					}
				}
			}
			if (this.anInt9011 < 0) {
				this.method7549(arg0, local40, 0, local44, 0);
				if (this.anInt9008 < 0) {
					this.anInt9008 = -1;
					this.method7545();
					this.method8599();
					return;
				}
			} else {
				this.method7579(arg0, local40, local29, local44, 0);
				if (this.anInt9008 >= local29) {
					this.anInt9008 = local29;
					this.method7545();
					this.method8599();
				}
			}
		} else if (this.aBoolean660) {
			if (this.anInt9011 < 0) {
				local40 = this.method7549(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt9012]);
				if (this.anInt9008 >= local18) {
					return;
				}
				this.anInt9008 = local18 + local18 - this.anInt9008 - 1;
				this.anInt9011 = -this.anInt9011;
			}
			while (true) {
				local40 = this.method7579(arg0, local40, local23, local44, local13.aByteArray21[this.anInt9005 - 1]);
				if (this.anInt9008 < local23) {
					return;
				}
				this.anInt9008 = local23 + local23 - this.anInt9008 - 1;
				this.anInt9011 = -this.anInt9011;
				local40 = this.method7549(arg0, local40, local18, local44, local13.aByteArray21[this.anInt9012]);
				if (this.anInt9008 >= local18) {
					return;
				}
				this.anInt9008 = local18 + local18 - this.anInt9008 - 1;
				this.anInt9011 = -this.anInt9011;
			}
		} else if (this.anInt9011 < 0) {
			while (true) {
				local40 = this.method7549(arg0, local40, local18, local44, local13.aByteArray21[this.anInt9005 - 1]);
				if (this.anInt9008 >= local18) {
					return;
				}
				this.anInt9008 = local23 - (local23 - 1 - this.anInt9008) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method7579(arg0, local40, local23, local44, local13.aByteArray21[this.anInt9012]);
				if (this.anInt9008 < local23) {
					return;
				}
				this.anInt9008 = local18 + (this.anInt9008 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)V")
	public synchronized void method7562(@OriginalArg(0) int arg0) {
		this.method7583(this.method7559(), arg0);
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "()Z")
	public boolean method7563() {
		return this.anInt9008 < 0 || this.anInt9008 >= ((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21.length << 8;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7544(@OriginalArg(0) int arg0) {
		if (this.anInt9013 > 0) {
			if (arg0 >= this.anInt9013) {
				if (this.anInt9002 == Integer.MIN_VALUE) {
					this.anInt9002 = 0;
					this.anInt9000 = this.anInt9006 = this.anInt9003 = 0;
					this.method8599();
					arg0 = this.anInt9013;
				}
				this.anInt9013 = 0;
				this.method7550();
			} else {
				this.anInt9000 += this.anInt9010 * arg0;
				this.anInt9006 += this.anInt9007 * arg0;
				this.anInt9003 += this.anInt9001 * arg0;
				this.anInt9013 -= arg0;
			}
		}
		@Pc(71) Class2_Sub12_Sub1 local71 = (Class2_Sub12_Sub1) super.aClass2_Sub12_6;
		@Pc(76) int local76 = this.anInt9012 << 8;
		@Pc(81) int local81 = this.anInt9005 << 8;
		@Pc(87) int local87 = local71.aByteArray21.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt9009 = 0;
		}
		if (this.anInt9008 < 0) {
			if (this.anInt9011 <= 0) {
				this.method7545();
				this.method8599();
				return;
			}
			this.anInt9008 = 0;
		}
		if (this.anInt9008 >= local87) {
			if (this.anInt9011 >= 0) {
				this.method7545();
				this.method8599();
				return;
			}
			this.anInt9008 = local87 - 1;
		}
		this.anInt9008 += this.anInt9011 * arg0;
		if (this.anInt9009 >= 0) {
			if (this.anInt9009 > 0) {
				if (this.aBoolean660) {
					label125: {
						if (this.anInt9011 < 0) {
							if (this.anInt9008 >= local76) {
								return;
							}
							this.anInt9008 = local76 + local76 - this.anInt9008 - 1;
							this.anInt9011 = -this.anInt9011;
							if (--this.anInt9009 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt9008 < local81) {
								return;
							}
							this.anInt9008 = local81 + local81 - this.anInt9008 - 1;
							this.anInt9011 = -this.anInt9011;
							if (--this.anInt9009 == 0) {
								break;
							}
							if (this.anInt9008 >= local76) {
								return;
							}
							this.anInt9008 = local76 + local76 - this.anInt9008 - 1;
							this.anInt9011 = -this.anInt9011;
						} while (--this.anInt9009 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt9011 < 0) {
						if (this.anInt9008 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt9008 - 1) / local91;
						if (local361 < this.anInt9009) {
							this.anInt9008 += local91 * local361;
							this.anInt9009 -= local361;
							return;
						}
						this.anInt9008 += local91 * this.anInt9009;
						this.anInt9009 = 0;
					} else if (this.anInt9008 >= local81) {
						local361 = (this.anInt9008 - local76) / local91;
						if (local361 < this.anInt9009) {
							this.anInt9008 -= local91 * local361;
							this.anInt9009 -= local361;
							return;
						}
						this.anInt9008 -= local91 * this.anInt9009;
						this.anInt9009 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt9011 < 0) {
				if (this.anInt9008 < 0) {
					this.anInt9008 = -1;
					this.method7545();
					this.method8599();
					return;
				}
			} else if (this.anInt9008 >= local87) {
				this.anInt9008 = local87;
				this.method7545();
				this.method8599();
			}
		} else if (this.aBoolean660) {
			if (this.anInt9011 < 0) {
				if (this.anInt9008 >= local76) {
					return;
				}
				this.anInt9008 = local76 + local76 - this.anInt9008 - 1;
				this.anInt9011 = -this.anInt9011;
			}
			while (this.anInt9008 >= local81) {
				this.anInt9008 = local81 + local81 - this.anInt9008 - 1;
				this.anInt9011 = -this.anInt9011;
				if (this.anInt9008 >= local76) {
					return;
				}
				this.anInt9008 = local76 + local76 - this.anInt9008 - 1;
				this.anInt9011 = -this.anInt9011;
			}
		} else if (this.anInt9011 < 0) {
			if (this.anInt9008 < local76) {
				this.anInt9008 = local81 - (local81 - 1 - this.anInt9008) % local91 - 1;
			}
		} else if (this.anInt9008 >= local81) {
			this.anInt9008 = local76 + (this.anInt9008 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)V")
	public synchronized void method7568(@OriginalArg(0) int arg0) {
		this.method7583(arg0 << 6, this.method7558());
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "(I)V")
	public synchronized void method7569(@OriginalArg(0) int arg0) {
		if (this.anInt9011 < 0) {
			this.anInt9011 = -arg0;
		} else {
			this.anInt9011 = arg0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
	@Override
	public int method7543() {
		@Pc(6) int local6 = this.anInt9000 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt9009 == 0) {
			local6 -= local6 * this.anInt9008 / (((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21.length << 8);
		} else if (this.anInt9009 >= 0) {
			local6 -= local6 * this.anInt9012 / ((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7539() {
		return null;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V")
	public synchronized void method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method7581(arg0, arg1, this.method7558());
	}

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "()I")
	public synchronized int method7577() {
		return this.anInt9011 < 0 ? -this.anInt9011 : this.anInt9011;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "([IIIII)I")
	private int method7579(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt9013 <= 0) {
				if (this.anInt9011 == 256 && (this.anInt9008 & 0xFF) == 0) {
					if (Static440.aBoolean586) {
						return Static652.method7571(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, arg3, arg2, this);
					}
					return Static652.method7566(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, arg3, arg2, this);
				}
				if (Static440.aBoolean586) {
					return Static652.method7546(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, arg3, arg2, this, this.anInt9011, arg4);
				}
				return Static652.method7584(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, arg3, arg2, this, this.anInt9011, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt9013;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt9013 += arg1;
			if (this.anInt9011 == 256 && (this.anInt9008 & 0xFF) == 0) {
				if (Static440.aBoolean586) {
					arg1 = Static652.method7565(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, this.anInt9007, this.anInt9001, local5, arg2, this);
				} else {
					arg1 = Static652.method7555(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, this.anInt9010, local5, arg2, this);
				}
			} else if (Static440.aBoolean586) {
				arg1 = Static652.method7548(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9006, this.anInt9003, this.anInt9007, this.anInt9001, local5, arg2, this, this.anInt9011, arg4);
			} else {
				arg1 = Static652.method7570(((Class2_Sub12_Sub1) super.aClass2_Sub12_6).aByteArray21, arg0, this.anInt9008, arg1, this.anInt9000, this.anInt9010, local5, arg2, this, this.anInt9011, arg4);
			}
			this.anInt9013 -= arg1;
			if (this.anInt9013 != 0) {
				return arg1;
			}
		} while (!this.method7557());
		return arg3;
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()Z")
	public boolean method7580() {
		return this.anInt9013 != 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public synchronized void method7581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method7583(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static652.method7561(arg1, arg2);
		@Pc(14) int local14 = Static652.method7564(arg1, arg2);
		if (this.anInt9006 == local10 && this.anInt9003 == local14) {
			this.anInt9013 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt9000;
		if (this.anInt9000 - arg1 > local31) {
			local31 = this.anInt9000 - arg1;
		}
		if (local10 - this.anInt9006 > local31) {
			local31 = local10 - this.anInt9006;
		}
		if (this.anInt9006 - local10 > local31) {
			local31 = this.anInt9006 - local10;
		}
		if (local14 - this.anInt9003 > local31) {
			local31 = local14 - this.anInt9003;
		}
		if (this.anInt9003 - local14 > local31) {
			local31 = this.anInt9003 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt9013 = arg0;
		this.anInt9002 = arg1;
		this.anInt9004 = arg2;
		this.anInt9010 = (arg1 - this.anInt9000) / arg0;
		this.anInt9007 = (local10 - this.anInt9006) / arg0;
		this.anInt9001 = (local14 - this.anInt9003) / arg0;
	}

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "(I)V")
	public synchronized void method7582(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method7556();
			this.method8599();
		} else if (this.anInt9006 == 0 && this.anInt9003 == 0) {
			this.anInt9013 = 0;
			this.anInt9002 = 0;
			this.anInt9000 = 0;
			this.method8599();
		} else {
			@Pc(31) int local31 = -this.anInt9000;
			if (this.anInt9000 > local31) {
				local31 = this.anInt9000;
			}
			if (-this.anInt9006 > local31) {
				local31 = -this.anInt9006;
			}
			if (this.anInt9006 > local31) {
				local31 = this.anInt9006;
			}
			if (-this.anInt9003 > local31) {
				local31 = -this.anInt9003;
			}
			if (this.anInt9003 > local31) {
				local31 = this.anInt9003;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt9013 = arg0;
			this.anInt9002 = Integer.MIN_VALUE;
			this.anInt9010 = -this.anInt9000 / arg0;
			this.anInt9007 = -this.anInt9006 / arg0;
			this.anInt9001 = -this.anInt9003 / arg0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)V")
	private synchronized void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9002 = arg0;
		this.anInt9004 = arg1;
		this.anInt9013 = 0;
		this.method7550();
	}
}
