import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public int anInt103;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public int anInt107;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	public int anInt111;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	public int anInt114;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	private final int anInt113;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	private final int anInt115;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "Z")
	private final boolean aBoolean4;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	private int anInt105;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub1_5 = arg0;
		this.anInt113 = arg0.anInt1054;
		this.anInt115 = arg0.anInt1055;
		this.aBoolean4 = arg0.aBoolean31;
		this.anInt105 = arg1;
		this.anInt104 = arg2;
		this.anInt112 = 8192;
		this.anInt106 = 0;
		this.method109();
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!ge;III)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub1_5 = arg0;
		this.anInt113 = arg0.anInt1054;
		this.anInt115 = arg0.anInt1055;
		this.aBoolean4 = arg0.aBoolean31;
		this.anInt105 = arg1;
		this.anInt104 = arg2;
		this.anInt112 = arg3;
		this.anInt106 = 0;
		this.method109();
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	private synchronized void method71() {
		this.method99(0, this.method78());
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	public synchronized void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method99(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static132.method84(arg1, arg2);
		@Pc(14) int local14 = Static132.method98(arg1, arg2);
		if (this.anInt109 == local10 && this.anInt108 == local14) {
			this.anInt102 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt114;
		if (this.anInt114 - arg1 > local31) {
			local31 = this.anInt114 - arg1;
		}
		if (local10 - this.anInt109 > local31) {
			local31 = local10 - this.anInt109;
		}
		if (this.anInt109 - local10 > local31) {
			local31 = this.anInt109 - local10;
		}
		if (local14 - this.anInt108 > local31) {
			local31 = local14 - this.anInt108;
		}
		if (this.anInt108 - local14 > local31) {
			local31 = this.anInt108 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt102 = arg0;
		this.anInt104 = arg1;
		this.anInt112 = arg2;
		this.anInt107 = (arg1 - this.anInt114) / arg0;
		this.anInt111 = (local10 - this.anInt109) / arg0;
		this.anInt103 = (local14 - this.anInt108) / arg0;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()I")
	public synchronized int method77() {
		return this.anInt104 == Integer.MIN_VALUE ? 0 : this.anInt104;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()I")
	public synchronized int method78() {
		return this.anInt112 < 0 ? -1 : this.anInt112;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()Lclient!oc;")
	@Override
	public Class4_Sub2 method967() {
		return null;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()I")
	@Override
	public int method965() {
		return this.anInt104 == 0 && this.anInt102 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
	public synchronized void method79() {
		this.anInt105 = (this.anInt105 ^ this.anInt105 >> 31) + (this.anInt105 >>> 31);
		this.anInt105 = -this.anInt105;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public synchronized void method81(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt106 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIII)I")
	private int method82(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt102 <= 0) {
				if (this.anInt105 == 256 && (this.anInt106 & 0xFF) == 0) {
					if (Static70.aBoolean68) {
						return Static132.method75(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, arg3, arg2, this);
					}
					return Static132.method73(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, arg3, arg2, this);
				}
				if (Static70.aBoolean68) {
					return Static132.method80(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, arg3, arg2, this, this.anInt105, arg4);
				}
				return Static132.method72(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, arg3, arg2, this, this.anInt105, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt102;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt102 += arg1;
			if (this.anInt105 == 256 && (this.anInt106 & 0xFF) == 0) {
				if (Static70.aBoolean68) {
					arg1 = Static132.method83(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, this.anInt111, this.anInt103, local5, arg2, this);
				} else {
					arg1 = Static132.method89(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, this.anInt107, local5, arg2, this);
				}
			} else if (Static70.aBoolean68) {
				arg1 = Static132.method92(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, this.anInt111, this.anInt103, local5, arg2, this, this.anInt105, arg4);
			} else {
				arg1 = Static132.method104(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, this.anInt107, local5, arg2, this, this.anInt105, arg4);
			}
			this.anInt102 -= arg1;
			if (this.anInt102 != 0) {
				return arg1;
			}
		} while (!this.method93());
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public synchronized void method86(@OriginalArg(0) int arg0) {
		this.anInt110 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method964(@OriginalArg(0) int arg0) {
		if (this.anInt102 > 0) {
			if (arg0 >= this.anInt102) {
				if (this.anInt104 == Integer.MIN_VALUE) {
					this.anInt104 = 0;
					this.anInt114 = this.anInt109 = this.anInt108 = 0;
					this.method2124();
					arg0 = this.anInt102;
				}
				this.anInt102 = 0;
				this.method109();
			} else {
				this.anInt114 += this.anInt107 * arg0;
				this.anInt109 += this.anInt111 * arg0;
				this.anInt108 += this.anInt103 * arg0;
				this.anInt102 -= arg0;
			}
		}
		@Pc(71) Class4_Sub1_Sub1 local71 = (Class4_Sub1_Sub1) super.aClass4_Sub1_5;
		@Pc(76) int local76 = this.anInt113 << 8;
		@Pc(81) int local81 = this.anInt115 << 8;
		@Pc(87) int local87 = local71.aByteArray46.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt110 = 0;
		}
		if (this.anInt106 < 0) {
			if (this.anInt105 <= 0) {
				this.method91();
				this.method2124();
				return;
			}
			this.anInt106 = 0;
		}
		if (this.anInt106 >= local87) {
			if (this.anInt105 >= 0) {
				this.method91();
				this.method2124();
				return;
			}
			this.anInt106 = local87 - 1;
		}
		this.anInt106 += this.anInt105 * arg0;
		if (this.anInt110 >= 0) {
			if (this.anInt110 > 0) {
				if (this.aBoolean4) {
					label125: {
						if (this.anInt105 < 0) {
							if (this.anInt106 >= local76) {
								return;
							}
							this.anInt106 = local76 + local76 - this.anInt106 - 1;
							this.anInt105 = -this.anInt105;
							if (--this.anInt110 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt106 < local81) {
								return;
							}
							this.anInt106 = local81 + local81 - this.anInt106 - 1;
							this.anInt105 = -this.anInt105;
							if (--this.anInt110 == 0) {
								break;
							}
							if (this.anInt106 >= local76) {
								return;
							}
							this.anInt106 = local76 + local76 - this.anInt106 - 1;
							this.anInt105 = -this.anInt105;
						} while (--this.anInt110 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt105 < 0) {
						if (this.anInt106 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt106 - 1) / local91;
						if (local361 < this.anInt110) {
							this.anInt106 += local91 * local361;
							this.anInt110 -= local361;
							return;
						}
						this.anInt106 += local91 * this.anInt110;
						this.anInt110 = 0;
					} else if (this.anInt106 >= local81) {
						local361 = (this.anInt106 - local76) / local91;
						if (local361 < this.anInt110) {
							this.anInt106 -= local91 * local361;
							this.anInt110 -= local361;
							return;
						}
						this.anInt106 -= local91 * this.anInt110;
						this.anInt110 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt105 < 0) {
				if (this.anInt106 < 0) {
					this.anInt106 = -1;
					this.method91();
					this.method2124();
					return;
				}
			} else if (this.anInt106 >= local87) {
				this.anInt106 = local87;
				this.method91();
				this.method2124();
			}
		} else if (this.aBoolean4) {
			if (this.anInt105 < 0) {
				if (this.anInt106 >= local76) {
					return;
				}
				this.anInt106 = local76 + local76 - this.anInt106 - 1;
				this.anInt105 = -this.anInt105;
			}
			while (this.anInt106 >= local81) {
				this.anInt106 = local81 + local81 - this.anInt106 - 1;
				this.anInt105 = -this.anInt105;
				if (this.anInt106 >= local76) {
					return;
				}
				this.anInt106 = local76 + local76 - this.anInt106 - 1;
				this.anInt105 = -this.anInt105;
			}
		} else if (this.anInt105 < 0) {
			if (this.anInt106 < local76) {
				this.anInt106 = local81 - (local81 - 1 - this.anInt106) % local91 - 1;
			}
		} else if (this.anInt106 >= local81) {
			this.anInt106 = local76 + (this.anInt106 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt104 == 0 && this.anInt102 == 0) {
			this.method964(arg2);
			return;
		}
		@Pc(13) Class4_Sub1_Sub1 local13 = (Class4_Sub1_Sub1) super.aClass4_Sub1_5;
		@Pc(18) int local18 = this.anInt113 << 8;
		@Pc(23) int local23 = this.anInt115 << 8;
		@Pc(29) int local29 = local13.aByteArray46.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt110 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt106 < 0) {
			if (this.anInt105 <= 0) {
				this.method91();
				this.method2124();
				return;
			}
			this.anInt106 = 0;
		}
		if (this.anInt106 >= local29) {
			if (this.anInt105 >= 0) {
				this.method91();
				this.method2124();
				return;
			}
			this.anInt106 = local29 - 1;
		}
		if (this.anInt110 >= 0) {
			if (this.anInt110 > 0) {
				if (this.aBoolean4) {
					label130: {
						if (this.anInt105 < 0) {
							local40 = this.method103(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt113]);
							if (this.anInt106 >= local18) {
								return;
							}
							this.anInt106 = local18 + local18 - this.anInt106 - 1;
							this.anInt105 = -this.anInt105;
							if (--this.anInt110 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method82(arg0, local40, local23, local44, local13.aByteArray46[this.anInt115 - 1]);
							if (this.anInt106 < local23) {
								return;
							}
							this.anInt106 = local23 + local23 - this.anInt106 - 1;
							this.anInt105 = -this.anInt105;
							if (--this.anInt110 == 0) {
								break;
							}
							local40 = this.method103(arg0, local40, local18, local44, local13.aByteArray46[this.anInt113]);
							if (this.anInt106 >= local18) {
								return;
							}
							this.anInt106 = local18 + local18 - this.anInt106 - 1;
							this.anInt105 = -this.anInt105;
						} while (--this.anInt110 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt105 < 0) {
						while (true) {
							local40 = this.method103(arg0, local40, local18, local44, local13.aByteArray46[this.anInt115 - 1]);
							if (this.anInt106 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt106 - 1) / local33;
							if (local416 >= this.anInt110) {
								this.anInt106 += local33 * this.anInt110;
								this.anInt110 = 0;
								break;
							}
							this.anInt106 += local33 * local416;
							this.anInt110 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method82(arg0, local40, local23, local44, local13.aByteArray46[this.anInt113]);
							if (this.anInt106 < local23) {
								return;
							}
							local416 = (this.anInt106 - local18) / local33;
							if (local416 >= this.anInt110) {
								this.anInt106 -= local33 * this.anInt110;
								this.anInt110 = 0;
								break;
							}
							this.anInt106 -= local33 * local416;
							this.anInt110 -= local416;
						}
					}
				}
			}
			if (this.anInt105 < 0) {
				this.method103(arg0, local40, 0, local44, 0);
				if (this.anInt106 < 0) {
					this.anInt106 = -1;
					this.method91();
					this.method2124();
					return;
				}
			} else {
				this.method82(arg0, local40, local29, local44, 0);
				if (this.anInt106 >= local29) {
					this.anInt106 = local29;
					this.method91();
					this.method2124();
				}
			}
		} else if (this.aBoolean4) {
			if (this.anInt105 < 0) {
				local40 = this.method103(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt113]);
				if (this.anInt106 >= local18) {
					return;
				}
				this.anInt106 = local18 + local18 - this.anInt106 - 1;
				this.anInt105 = -this.anInt105;
			}
			while (true) {
				local40 = this.method82(arg0, local40, local23, local44, local13.aByteArray46[this.anInt115 - 1]);
				if (this.anInt106 < local23) {
					return;
				}
				this.anInt106 = local23 + local23 - this.anInt106 - 1;
				this.anInt105 = -this.anInt105;
				local40 = this.method103(arg0, local40, local18, local44, local13.aByteArray46[this.anInt113]);
				if (this.anInt106 >= local18) {
					return;
				}
				this.anInt106 = local18 + local18 - this.anInt106 - 1;
				this.anInt105 = -this.anInt105;
			}
		} else if (this.anInt105 < 0) {
			while (true) {
				local40 = this.method103(arg0, local40, local18, local44, local13.aByteArray46[this.anInt115 - 1]);
				if (this.anInt106 >= local18) {
					return;
				}
				this.anInt106 = local23 - (local23 - 1 - this.anInt106) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method82(arg0, local40, local23, local44, local13.aByteArray46[this.anInt113]);
				if (this.anInt106 < local23) {
					return;
				}
				this.anInt106 = local18 + (this.anInt106 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "()V")
	private void method91() {
		if (this.anInt102 == 0) {
			return;
		}
		if (this.anInt104 == Integer.MIN_VALUE) {
			this.anInt104 = 0;
		}
		this.anInt102 = 0;
		this.method109();
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "()Z")
	private boolean method93() {
		@Pc(2) int local2 = this.anInt104;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static132.method84(local2, this.anInt112);
			local8 = Static132.method98(local2, this.anInt112);
		}
		if (this.anInt114 != local2 || this.anInt109 != local10 || this.anInt108 != local8) {
			if (this.anInt114 < local2) {
				this.anInt107 = 1;
				this.anInt102 = local2 - this.anInt114;
			} else if (this.anInt114 > local2) {
				this.anInt107 = -1;
				this.anInt102 = this.anInt114 - local2;
			} else {
				this.anInt107 = 0;
			}
			if (this.anInt109 < local10) {
				this.anInt111 = 1;
				if (this.anInt102 == 0 || this.anInt102 > local10 - this.anInt109) {
					this.anInt102 = local10 - this.anInt109;
				}
			} else if (this.anInt109 > local10) {
				this.anInt111 = -1;
				if (this.anInt102 == 0 || this.anInt102 > this.anInt109 - local10) {
					this.anInt102 = this.anInt109 - local10;
				}
			} else {
				this.anInt111 = 0;
			}
			if (this.anInt108 < local8) {
				this.anInt103 = 1;
				if (this.anInt102 == 0 || this.anInt102 > local8 - this.anInt108) {
					this.anInt102 = local8 - this.anInt108;
				}
			} else if (this.anInt108 > local8) {
				this.anInt103 = -1;
				if (this.anInt102 == 0 || this.anInt102 > this.anInt108 - local8) {
					this.anInt102 = this.anInt108 - local8;
				}
			} else {
				this.anInt103 = 0;
			}
			return false;
		} else if (this.anInt104 == Integer.MIN_VALUE) {
			this.anInt104 = 0;
			this.anInt114 = this.anInt109 = this.anInt108 = 0;
			this.method2124();
			return true;
		} else {
			this.method109();
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "()Z")
	public boolean method94() {
		return this.anInt106 < 0 || this.anInt106 >= ((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46.length << 8;
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "()I")
	public synchronized int method96() {
		return this.anInt105 < 0 ? -this.anInt105 : this.anInt105;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	@Override
	public int method963() {
		@Pc(6) int local6 = this.anInt114 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt110 == 0) {
			local6 -= local6 * this.anInt106 / (((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46.length << 8);
		} else if (this.anInt110 >= 0) {
			local6 -= local6 * this.anInt113 / ((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)V")
	private synchronized void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt104 = arg0;
		this.anInt112 = arg1;
		this.anInt102 = 0;
		this.method109();
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	public synchronized void method100(@OriginalArg(0) int arg0) {
		this.method99(arg0 << 6, this.method78());
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
	public synchronized void method101(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method71();
			this.method2124();
		} else if (this.anInt109 == 0 && this.anInt108 == 0) {
			this.anInt102 = 0;
			this.anInt104 = 0;
			this.anInt114 = 0;
			this.method2124();
		} else {
			@Pc(31) int local31 = -this.anInt114;
			if (this.anInt114 > local31) {
				local31 = this.anInt114;
			}
			if (-this.anInt109 > local31) {
				local31 = -this.anInt109;
			}
			if (this.anInt109 > local31) {
				local31 = this.anInt109;
			}
			if (-this.anInt108 > local31) {
				local31 = -this.anInt108;
			}
			if (this.anInt108 > local31) {
				local31 = this.anInt108;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt102 = arg0;
			this.anInt104 = Integer.MIN_VALUE;
			this.anInt107 = -this.anInt114 / arg0;
			this.anInt111 = -this.anInt109 / arg0;
			this.anInt103 = -this.anInt108 / arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)V")
	public synchronized void method102(@OriginalArg(0) int arg0) {
		if (this.anInt105 < 0) {
			this.anInt105 = -arg0;
		} else {
			this.anInt105 = arg0;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([IIIII)I")
	private int method103(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt102 <= 0) {
				if (this.anInt105 == -256 && (this.anInt106 & 0xFF) == 0) {
					if (Static70.aBoolean68) {
						return Static132.method108(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, arg3, arg2, this);
					}
					return Static132.method74(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, arg3, arg2, this);
				}
				if (Static70.aBoolean68) {
					return Static132.method90(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, arg3, arg2, this, this.anInt105, arg4);
				}
				return Static132.method87(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, arg3, arg2, this, this.anInt105, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt102;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt102 += arg1;
			if (this.anInt105 == -256 && (this.anInt106 & 0xFF) == 0) {
				if (Static70.aBoolean68) {
					arg1 = Static132.method85(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, this.anInt111, this.anInt103, local5, arg2, this);
				} else {
					arg1 = Static132.method70(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, this.anInt107, local5, arg2, this);
				}
			} else if (Static70.aBoolean68) {
				arg1 = Static132.method88(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt109, this.anInt108, this.anInt111, this.anInt103, local5, arg2, this, this.anInt105, arg4);
			} else {
				arg1 = Static132.method95(((Class4_Sub1_Sub1) super.aClass4_Sub1_5).aByteArray46, arg0, this.anInt106, arg1, this.anInt114, this.anInt107, local5, arg2, this, this.anInt105, arg4);
			}
			this.anInt102 -= arg1;
			if (this.anInt102 != 0) {
				return arg1;
			}
		} while (!this.method93());
		return arg3;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II)V")
	public synchronized void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method76(arg0, arg1, this.method78());
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "()Z")
	public boolean method107() {
		return this.anInt102 != 0;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()Lclient!oc;")
	@Override
	public Class4_Sub2 method969() {
		return null;
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "()V")
	private void method109() {
		this.anInt114 = this.anInt104;
		this.anInt109 = Static132.method84(this.anInt104, this.anInt112);
		this.anInt108 = Static132.method98(this.anInt104, this.anInt112);
	}
}
