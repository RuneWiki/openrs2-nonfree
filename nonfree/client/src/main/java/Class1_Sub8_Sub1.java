import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!bga", name = "n", descriptor = "I")
	public int anInt1038;

	@OriginalMember(owner = "client!bga", name = "o", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!bga", name = "q", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!bga", name = "y", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!bga", name = "z", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "I")
	private final int anInt1037;

	@OriginalMember(owner = "client!bga", name = "t", descriptor = "I")
	private final int anInt1044;

	@OriginalMember(owner = "client!bga", name = "A", descriptor = "Z")
	private final boolean aBoolean85;

	@OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!bga", name = "x", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!bga", name = "r", descriptor = "I")
	private int anInt1042;

	@OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!ql;II)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class1_Sub40_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub40_5 = arg0;
		this.anInt1037 = arg0.anInt7666;
		this.anInt1044 = arg0.anInt7668;
		this.aBoolean85 = arg0.aBoolean560;
		this.anInt1045 = arg1;
		this.anInt1048 = arg2;
		this.anInt1042 = 8192;
		this.anInt1040 = 0;
		this.method938();
	}

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lclient!ql;III)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) Class1_Sub40_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub40_5 = arg0;
		this.anInt1037 = arg0.anInt7666;
		this.anInt1044 = arg0.anInt7668;
		this.aBoolean85 = arg0.aBoolean560;
		this.anInt1045 = arg1;
		this.anInt1048 = arg2;
		this.anInt1042 = arg3;
		this.anInt1040 = 0;
		this.method938();
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "()I")
	@Override
	public int method6021() {
		return this.anInt1048 == 0 && this.anInt1043 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "()Lclient!eg;")
	@Override
	public Class1_Sub8 method6023() {
		return null;
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
	public synchronized void method932(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method962();
			this.method7878();
		} else if (this.anInt1050 == 0 && this.anInt1038 == 0) {
			this.anInt1043 = 0;
			this.anInt1048 = 0;
			this.anInt1047 = 0;
			this.method7878();
		} else {
			@Pc(31) int local31 = -this.anInt1047;
			if (this.anInt1047 > local31) {
				local31 = this.anInt1047;
			}
			if (-this.anInt1050 > local31) {
				local31 = -this.anInt1050;
			}
			if (this.anInt1050 > local31) {
				local31 = this.anInt1050;
			}
			if (-this.anInt1038 > local31) {
				local31 = -this.anInt1038;
			}
			if (this.anInt1038 > local31) {
				local31 = this.anInt1038;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1043 = arg0;
			this.anInt1048 = Integer.MIN_VALUE;
			this.anInt1039 = -this.anInt1047 / arg0;
			this.anInt1049 = -this.anInt1050 / arg0;
			this.anInt1046 = -this.anInt1038 / arg0;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6024(@OriginalArg(0) int arg0) {
		if (this.anInt1043 > 0) {
			if (arg0 >= this.anInt1043) {
				if (this.anInt1048 == Integer.MIN_VALUE) {
					this.anInt1048 = 0;
					this.anInt1047 = this.anInt1050 = this.anInt1038 = 0;
					this.method7878();
					arg0 = this.anInt1043;
				}
				this.anInt1043 = 0;
				this.method938();
			} else {
				this.anInt1047 += this.anInt1039 * arg0;
				this.anInt1050 += this.anInt1049 * arg0;
				this.anInt1038 += this.anInt1046 * arg0;
				this.anInt1043 -= arg0;
			}
		}
		@Pc(71) Class1_Sub40_Sub1 local71 = (Class1_Sub40_Sub1) super.aClass1_Sub40_5;
		@Pc(76) int local76 = this.anInt1037 << 8;
		@Pc(81) int local81 = this.anInt1044 << 8;
		@Pc(87) int local87 = local71.aByteArray79.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1041 = 0;
		}
		if (this.anInt1040 < 0) {
			if (this.anInt1045 <= 0) {
				this.method946();
				this.method7878();
				return;
			}
			this.anInt1040 = 0;
		}
		if (this.anInt1040 >= local87) {
			if (this.anInt1045 >= 0) {
				this.method946();
				this.method7878();
				return;
			}
			this.anInt1040 = local87 - 1;
		}
		this.anInt1040 += this.anInt1045 * arg0;
		if (this.anInt1041 >= 0) {
			if (this.anInt1041 > 0) {
				if (this.aBoolean85) {
					label125: {
						if (this.anInt1045 < 0) {
							if (this.anInt1040 >= local76) {
								return;
							}
							this.anInt1040 = local76 + local76 - this.anInt1040 - 1;
							this.anInt1045 = -this.anInt1045;
							if (--this.anInt1041 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1040 < local81) {
								return;
							}
							this.anInt1040 = local81 + local81 - this.anInt1040 - 1;
							this.anInt1045 = -this.anInt1045;
							if (--this.anInt1041 == 0) {
								break;
							}
							if (this.anInt1040 >= local76) {
								return;
							}
							this.anInt1040 = local76 + local76 - this.anInt1040 - 1;
							this.anInt1045 = -this.anInt1045;
						} while (--this.anInt1041 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1045 < 0) {
						if (this.anInt1040 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1040 - 1) / local91;
						if (local361 < this.anInt1041) {
							this.anInt1040 += local91 * local361;
							this.anInt1041 -= local361;
							return;
						}
						this.anInt1040 += local91 * this.anInt1041;
						this.anInt1041 = 0;
					} else if (this.anInt1040 >= local81) {
						local361 = (this.anInt1040 - local76) / local91;
						if (local361 < this.anInt1041) {
							this.anInt1040 -= local91 * local361;
							this.anInt1041 -= local361;
							return;
						}
						this.anInt1040 -= local91 * this.anInt1041;
						this.anInt1041 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1045 < 0) {
				if (this.anInt1040 < 0) {
					this.anInt1040 = -1;
					this.method946();
					this.method7878();
					return;
				}
			} else if (this.anInt1040 >= local87) {
				this.anInt1040 = local87;
				this.method946();
				this.method7878();
			}
		} else if (this.aBoolean85) {
			if (this.anInt1045 < 0) {
				if (this.anInt1040 >= local76) {
					return;
				}
				this.anInt1040 = local76 + local76 - this.anInt1040 - 1;
				this.anInt1045 = -this.anInt1045;
			}
			while (this.anInt1040 >= local81) {
				this.anInt1040 = local81 + local81 - this.anInt1040 - 1;
				this.anInt1045 = -this.anInt1045;
				if (this.anInt1040 >= local76) {
					return;
				}
				this.anInt1040 = local76 + local76 - this.anInt1040 - 1;
				this.anInt1045 = -this.anInt1045;
			}
		} else if (this.anInt1045 < 0) {
			if (this.anInt1040 < local76) {
				this.anInt1040 = local81 - (local81 - 1 - this.anInt1040) % local91 - 1;
			}
		} else if (this.anInt1040 >= local81) {
			this.anInt1040 = local76 + (this.anInt1040 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([IIIII)I")
	private int method935(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1043 <= 0) {
				if (this.anInt1045 == 256 && (this.anInt1040 & 0xFF) == 0) {
					if (Static582.aBoolean692) {
						return Static597.method931(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, arg3, arg2, this);
					}
					return Static597.method933(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, arg3, arg2, this);
				}
				if (Static582.aBoolean692) {
					return Static597.method957(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, arg3, arg2, this, this.anInt1045, arg4);
				}
				return Static597.method928(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, arg3, arg2, this, this.anInt1045, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1043;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1043 += arg1;
			if (this.anInt1045 == 256 && (this.anInt1040 & 0xFF) == 0) {
				if (Static582.aBoolean692) {
					arg1 = Static597.method941(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, this.anInt1049, this.anInt1046, local5, arg2, this);
				} else {
					arg1 = Static597.method953(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, this.anInt1039, local5, arg2, this);
				}
			} else if (Static582.aBoolean692) {
				arg1 = Static597.method960(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, this.anInt1049, this.anInt1046, local5, arg2, this, this.anInt1045, arg4);
			} else {
				arg1 = Static597.method943(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, this.anInt1039, local5, arg2, this, this.anInt1045, arg4);
			}
			this.anInt1043 -= arg1;
			if (this.anInt1043 != 0) {
				return arg1;
			}
		} while (!this.method940());
		return arg3;
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "([IIIII)I")
	private int method936(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1043 <= 0) {
				if (this.anInt1045 == -256 && (this.anInt1040 & 0xFF) == 0) {
					if (Static582.aBoolean692) {
						return Static597.method930(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, arg3, arg2, this);
					}
					return Static597.method934(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, arg3, arg2, this);
				}
				if (Static582.aBoolean692) {
					return Static597.method929(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, arg3, arg2, this, this.anInt1045, arg4);
				}
				return Static597.method965(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, arg3, arg2, this, this.anInt1045, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1043;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1043 += arg1;
			if (this.anInt1045 == -256 && (this.anInt1040 & 0xFF) == 0) {
				if (Static582.aBoolean692) {
					arg1 = Static597.method954(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, this.anInt1049, this.anInt1046, local5, arg2, this);
				} else {
					arg1 = Static597.method966(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, this.anInt1039, local5, arg2, this);
				}
			} else if (Static582.aBoolean692) {
				arg1 = Static597.method927(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1050, this.anInt1038, this.anInt1049, this.anInt1046, local5, arg2, this, this.anInt1045, arg4);
			} else {
				arg1 = Static597.method949(((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79, arg0, this.anInt1040, arg1, this.anInt1047, this.anInt1039, local5, arg2, this, this.anInt1045, arg4);
			}
			this.anInt1043 -= arg1;
			if (this.anInt1043 != 0) {
				return arg1;
			}
		} while (!this.method940());
		return arg3;
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)V")
	public synchronized void method937(@OriginalArg(0) int arg0) {
		if (this.anInt1045 < 0) {
			this.anInt1045 = -arg0;
		} else {
			this.anInt1045 = arg0;
		}
	}

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "()V")
	private void method938() {
		this.anInt1047 = this.anInt1048;
		this.anInt1050 = Static597.method955(this.anInt1048, this.anInt1042);
		this.anInt1038 = Static597.method947(this.anInt1048, this.anInt1042);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)V")
	private synchronized void method939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1048 = arg0;
		this.anInt1042 = arg1;
		this.anInt1043 = 0;
		this.method938();
	}

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "()Z")
	private boolean method940() {
		@Pc(2) int local2 = this.anInt1048;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static597.method955(local2, this.anInt1042);
			local8 = Static597.method947(local2, this.anInt1042);
		}
		if (this.anInt1047 != local2 || this.anInt1050 != local10 || this.anInt1038 != local8) {
			if (this.anInt1047 < local2) {
				this.anInt1039 = 1;
				this.anInt1043 = local2 - this.anInt1047;
			} else if (this.anInt1047 > local2) {
				this.anInt1039 = -1;
				this.anInt1043 = this.anInt1047 - local2;
			} else {
				this.anInt1039 = 0;
			}
			if (this.anInt1050 < local10) {
				this.anInt1049 = 1;
				if (this.anInt1043 == 0 || this.anInt1043 > local10 - this.anInt1050) {
					this.anInt1043 = local10 - this.anInt1050;
				}
			} else if (this.anInt1050 > local10) {
				this.anInt1049 = -1;
				if (this.anInt1043 == 0 || this.anInt1043 > this.anInt1050 - local10) {
					this.anInt1043 = this.anInt1050 - local10;
				}
			} else {
				this.anInt1049 = 0;
			}
			if (this.anInt1038 < local8) {
				this.anInt1046 = 1;
				if (this.anInt1043 == 0 || this.anInt1043 > local8 - this.anInt1038) {
					this.anInt1043 = local8 - this.anInt1038;
				}
			} else if (this.anInt1038 > local8) {
				this.anInt1046 = -1;
				if (this.anInt1043 == 0 || this.anInt1043 > this.anInt1038 - local8) {
					this.anInt1043 = this.anInt1038 - local8;
				}
			} else {
				this.anInt1046 = 0;
			}
			return false;
		} else if (this.anInt1048 == Integer.MIN_VALUE) {
			this.anInt1048 = 0;
			this.anInt1047 = this.anInt1050 = this.anInt1038 = 0;
			this.method7878();
			return true;
		} else {
			this.method938();
			return false;
		}
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "()Lclient!eg;")
	@Override
	public Class1_Sub8 method6026() {
		return null;
	}

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "()I")
	public synchronized int method942() {
		return this.anInt1048 == Integer.MIN_VALUE ? 0 : this.anInt1048;
	}

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "()Z")
	public boolean method944() {
		return this.anInt1043 != 0;
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "()I")
	@Override
	public int method6025() {
		@Pc(6) int local6 = this.anInt1047 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1041 == 0) {
			local6 -= local6 * this.anInt1040 / (((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79.length << 8);
		} else if (this.anInt1041 >= 0) {
			local6 -= local6 * this.anInt1037 / ((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
	public synchronized void method945() {
		this.anInt1045 = (this.anInt1045 ^ this.anInt1045 >> 31) + (this.anInt1045 >>> 31);
		this.anInt1045 = -this.anInt1045;
	}

	@OriginalMember(owner = "client!bga", name = "i", descriptor = "()V")
	private void method946() {
		if (this.anInt1043 == 0) {
			return;
		}
		if (this.anInt1048 == Integer.MIN_VALUE) {
			this.anInt1048 = 0;
		}
		this.anInt1043 = 0;
		this.method938();
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(II)V")
	public synchronized void method948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method958(arg0, arg1, this.method950());
	}

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "()I")
	public synchronized int method950() {
		return this.anInt1042 < 0 ? -1 : this.anInt1042;
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
	public synchronized void method952(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1040 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "(I)V")
	public synchronized void method956(@OriginalArg(0) int arg0) {
		this.anInt1041 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V")
	public synchronized void method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method939(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static597.method955(arg1, arg2);
		@Pc(14) int local14 = Static597.method947(arg1, arg2);
		if (this.anInt1050 == local10 && this.anInt1038 == local14) {
			this.anInt1043 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1047;
		if (this.anInt1047 - arg1 > local31) {
			local31 = this.anInt1047 - arg1;
		}
		if (local10 - this.anInt1050 > local31) {
			local31 = local10 - this.anInt1050;
		}
		if (this.anInt1050 - local10 > local31) {
			local31 = this.anInt1050 - local10;
		}
		if (local14 - this.anInt1038 > local31) {
			local31 = local14 - this.anInt1038;
		}
		if (this.anInt1038 - local14 > local31) {
			local31 = this.anInt1038 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1043 = arg0;
		this.anInt1048 = arg1;
		this.anInt1042 = arg2;
		this.anInt1039 = (arg1 - this.anInt1047) / arg0;
		this.anInt1049 = (local10 - this.anInt1050) / arg0;
		this.anInt1046 = (local14 - this.anInt1038) / arg0;
	}

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "()I")
	public synchronized int method961() {
		return this.anInt1045 < 0 ? -this.anInt1045 : this.anInt1045;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6022(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1048 == 0 && this.anInt1043 == 0) {
			this.method6024(arg2);
			return;
		}
		@Pc(13) Class1_Sub40_Sub1 local13 = (Class1_Sub40_Sub1) super.aClass1_Sub40_5;
		@Pc(18) int local18 = this.anInt1037 << 8;
		@Pc(23) int local23 = this.anInt1044 << 8;
		@Pc(29) int local29 = local13.aByteArray79.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1041 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1040 < 0) {
			if (this.anInt1045 <= 0) {
				this.method946();
				this.method7878();
				return;
			}
			this.anInt1040 = 0;
		}
		if (this.anInt1040 >= local29) {
			if (this.anInt1045 >= 0) {
				this.method946();
				this.method7878();
				return;
			}
			this.anInt1040 = local29 - 1;
		}
		if (this.anInt1041 >= 0) {
			if (this.anInt1041 > 0) {
				if (this.aBoolean85) {
					label130: {
						if (this.anInt1045 < 0) {
							local40 = this.method936(arg0, arg1, local18, local44, local13.aByteArray79[this.anInt1037]);
							if (this.anInt1040 >= local18) {
								return;
							}
							this.anInt1040 = local18 + local18 - this.anInt1040 - 1;
							this.anInt1045 = -this.anInt1045;
							if (--this.anInt1041 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method935(arg0, local40, local23, local44, local13.aByteArray79[this.anInt1044 - 1]);
							if (this.anInt1040 < local23) {
								return;
							}
							this.anInt1040 = local23 + local23 - this.anInt1040 - 1;
							this.anInt1045 = -this.anInt1045;
							if (--this.anInt1041 == 0) {
								break;
							}
							local40 = this.method936(arg0, local40, local18, local44, local13.aByteArray79[this.anInt1037]);
							if (this.anInt1040 >= local18) {
								return;
							}
							this.anInt1040 = local18 + local18 - this.anInt1040 - 1;
							this.anInt1045 = -this.anInt1045;
						} while (--this.anInt1041 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1045 < 0) {
						while (true) {
							local40 = this.method936(arg0, local40, local18, local44, local13.aByteArray79[this.anInt1044 - 1]);
							if (this.anInt1040 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1040 - 1) / local33;
							if (local416 >= this.anInt1041) {
								this.anInt1040 += local33 * this.anInt1041;
								this.anInt1041 = 0;
								break;
							}
							this.anInt1040 += local33 * local416;
							this.anInt1041 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method935(arg0, local40, local23, local44, local13.aByteArray79[this.anInt1037]);
							if (this.anInt1040 < local23) {
								return;
							}
							local416 = (this.anInt1040 - local18) / local33;
							if (local416 >= this.anInt1041) {
								this.anInt1040 -= local33 * this.anInt1041;
								this.anInt1041 = 0;
								break;
							}
							this.anInt1040 -= local33 * local416;
							this.anInt1041 -= local416;
						}
					}
				}
			}
			if (this.anInt1045 < 0) {
				this.method936(arg0, local40, 0, local44, 0);
				if (this.anInt1040 < 0) {
					this.anInt1040 = -1;
					this.method946();
					this.method7878();
					return;
				}
			} else {
				this.method935(arg0, local40, local29, local44, 0);
				if (this.anInt1040 >= local29) {
					this.anInt1040 = local29;
					this.method946();
					this.method7878();
				}
			}
		} else if (this.aBoolean85) {
			if (this.anInt1045 < 0) {
				local40 = this.method936(arg0, arg1, local18, local44, local13.aByteArray79[this.anInt1037]);
				if (this.anInt1040 >= local18) {
					return;
				}
				this.anInt1040 = local18 + local18 - this.anInt1040 - 1;
				this.anInt1045 = -this.anInt1045;
			}
			while (true) {
				local40 = this.method935(arg0, local40, local23, local44, local13.aByteArray79[this.anInt1044 - 1]);
				if (this.anInt1040 < local23) {
					return;
				}
				this.anInt1040 = local23 + local23 - this.anInt1040 - 1;
				this.anInt1045 = -this.anInt1045;
				local40 = this.method936(arg0, local40, local18, local44, local13.aByteArray79[this.anInt1037]);
				if (this.anInt1040 >= local18) {
					return;
				}
				this.anInt1040 = local18 + local18 - this.anInt1040 - 1;
				this.anInt1045 = -this.anInt1045;
			}
		} else if (this.anInt1045 < 0) {
			while (true) {
				local40 = this.method936(arg0, local40, local18, local44, local13.aByteArray79[this.anInt1044 - 1]);
				if (this.anInt1040 >= local18) {
					return;
				}
				this.anInt1040 = local23 - (local23 - 1 - this.anInt1040) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method935(arg0, local40, local23, local44, local13.aByteArray79[this.anInt1037]);
				if (this.anInt1040 < local23) {
					return;
				}
				this.anInt1040 = local18 + (this.anInt1040 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "(I)V")
	private synchronized void method962() {
		this.method939(0, this.method950());
	}

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "(I)V")
	public synchronized void method963(@OriginalArg(0) int arg0) {
		this.method939(arg0 << 6, this.method950());
	}

	@OriginalMember(owner = "client!bga", name = "l", descriptor = "()Z")
	public boolean method964() {
		return this.anInt1040 < 0 || this.anInt1040 >= ((Class1_Sub40_Sub1) super.aClass1_Sub40_5).aByteArray79.length << 8;
	}
}
