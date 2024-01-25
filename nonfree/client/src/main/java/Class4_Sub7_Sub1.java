import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class4_Sub7_Sub1 extends Class4_Sub7 {

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public int anInt1024;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	public int anInt1025;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
	public int anInt1030;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
	public int anInt1034;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	public int anInt1035;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	public int anInt1036;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
	private final int anInt1031;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	private final int anInt1029;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Z")
	private final boolean aBoolean72;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!cv;II)V")
	public Class4_Sub7_Sub1(@OriginalArg(0) Class4_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub9_5 = arg0;
		this.anInt1031 = arg0.anInt1420;
		this.anInt1029 = arg0.anInt1418;
		this.aBoolean72 = arg0.aBoolean99;
		this.anInt1028 = arg1;
		this.anInt1027 = arg2;
		this.anInt1032 = 8192;
		this.anInt1033 = 0;
		this.method961();
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!cv;III)V")
	public Class4_Sub7_Sub1(@OriginalArg(0) Class4_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub9_5 = arg0;
		this.anInt1031 = arg0.anInt1420;
		this.anInt1029 = arg0.anInt1418;
		this.aBoolean72 = arg0.aBoolean99;
		this.anInt1028 = arg1;
		this.anInt1027 = arg2;
		this.anInt1032 = arg3;
		this.anInt1033 = 0;
		this.method961();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
	public synchronized void method960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method970(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static470.method983(arg1, arg2);
		@Pc(14) int local14 = Static470.method969(arg1, arg2);
		if (this.anInt1025 == local10 && this.anInt1035 == local14) {
			this.anInt1026 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1036;
		if (this.anInt1036 - arg1 > local31) {
			local31 = this.anInt1036 - arg1;
		}
		if (local10 - this.anInt1025 > local31) {
			local31 = local10 - this.anInt1025;
		}
		if (this.anInt1025 - local10 > local31) {
			local31 = this.anInt1025 - local10;
		}
		if (local14 - this.anInt1035 > local31) {
			local31 = local14 - this.anInt1035;
		}
		if (this.anInt1035 - local14 > local31) {
			local31 = this.anInt1035 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1026 = arg0;
		this.anInt1027 = arg1;
		this.anInt1032 = arg2;
		this.anInt1024 = (arg1 - this.anInt1036) / arg0;
		this.anInt1030 = (local10 - this.anInt1025) / arg0;
		this.anInt1034 = (local14 - this.anInt1035) / arg0;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "()V")
	private void method961() {
		this.anInt1036 = this.anInt1027;
		this.anInt1025 = Static470.method983(this.anInt1027, this.anInt1032);
		this.anInt1035 = Static470.method969(this.anInt1027, this.anInt1032);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIIII)I")
	private int method962(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1026 <= 0) {
				if (this.anInt1028 == -256 && (this.anInt1033 & 0xFF) == 0) {
					if (Static3.aBoolean91) {
						return Static470.method992(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, arg3, arg2, this);
					}
					return Static470.method976(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, arg3, arg2, this);
				}
				if (Static3.aBoolean91) {
					return Static470.method967(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, arg3, arg2, this, this.anInt1028, arg4);
				}
				return Static470.method966(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, arg3, arg2, this, this.anInt1028, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1026;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1026 += arg1;
			if (this.anInt1028 == -256 && (this.anInt1033 & 0xFF) == 0) {
				if (Static3.aBoolean91) {
					arg1 = Static470.method987(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, this.anInt1030, this.anInt1034, local5, arg2, this);
				} else {
					arg1 = Static470.method998(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, this.anInt1024, local5, arg2, this);
				}
			} else if (Static3.aBoolean91) {
				arg1 = Static470.method982(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, this.anInt1030, this.anInt1034, local5, arg2, this, this.anInt1028, arg4);
			} else {
				arg1 = Static470.method994(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, this.anInt1024, local5, arg2, this, this.anInt1028, arg4);
			}
			this.anInt1026 -= arg1;
			if (this.anInt1026 != 0) {
				return arg1;
			}
		} while (!this.method985());
		return arg3;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public synchronized void method963(@OriginalArg(0) int arg0) {
		if (this.anInt1028 < 0) {
			this.anInt1028 = -arg0;
		} else {
			this.anInt1028 = arg0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "()Z")
	public boolean method968() {
		return this.anInt1033 < 0 || this.anInt1033 >= ((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18.length << 8;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
	private synchronized void method970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1027 = arg0;
		this.anInt1032 = arg1;
		this.anInt1026 = 0;
		this.method961();
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "()I")
	public synchronized int method972() {
		return this.anInt1032 < 0 ? -1 : this.anInt1032;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	public synchronized void method973(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method980();
			this.method6330();
		} else if (this.anInt1025 == 0 && this.anInt1035 == 0) {
			this.anInt1026 = 0;
			this.anInt1027 = 0;
			this.anInt1036 = 0;
			this.method6330();
		} else {
			@Pc(31) int local31 = -this.anInt1036;
			if (this.anInt1036 > local31) {
				local31 = this.anInt1036;
			}
			if (-this.anInt1025 > local31) {
				local31 = -this.anInt1025;
			}
			if (this.anInt1025 > local31) {
				local31 = this.anInt1025;
			}
			if (-this.anInt1035 > local31) {
				local31 = -this.anInt1035;
			}
			if (this.anInt1035 > local31) {
				local31 = this.anInt1035;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1026 = arg0;
			this.anInt1027 = Integer.MIN_VALUE;
			this.anInt1024 = -this.anInt1036 / arg0;
			this.anInt1030 = -this.anInt1025 / arg0;
			this.anInt1034 = -this.anInt1035 / arg0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	public synchronized void method974(@OriginalArg(0) int arg0) {
		this.anInt1023 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()I")
	@Override
	public int method5464() {
		return this.anInt1027 == 0 && this.anInt1026 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()Lclient!po;")
	@Override
	public Class4_Sub7 method5466() {
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "()I")
	public synchronized int method975() {
		return this.anInt1027 == Integer.MIN_VALUE ? 0 : this.anInt1027;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5465(@OriginalArg(0) int arg0) {
		if (this.anInt1026 > 0) {
			if (arg0 >= this.anInt1026) {
				if (this.anInt1027 == Integer.MIN_VALUE) {
					this.anInt1027 = 0;
					this.anInt1036 = this.anInt1025 = this.anInt1035 = 0;
					this.method6330();
					arg0 = this.anInt1026;
				}
				this.anInt1026 = 0;
				this.method961();
			} else {
				this.anInt1036 += this.anInt1024 * arg0;
				this.anInt1025 += this.anInt1030 * arg0;
				this.anInt1035 += this.anInt1034 * arg0;
				this.anInt1026 -= arg0;
			}
		}
		@Pc(71) Class4_Sub9_Sub1 local71 = (Class4_Sub9_Sub1) super.aClass4_Sub9_5;
		@Pc(76) int local76 = this.anInt1031 << 8;
		@Pc(81) int local81 = this.anInt1029 << 8;
		@Pc(87) int local87 = local71.aByteArray18.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1023 = 0;
		}
		if (this.anInt1033 < 0) {
			if (this.anInt1028 <= 0) {
				this.method989();
				this.method6330();
				return;
			}
			this.anInt1033 = 0;
		}
		if (this.anInt1033 >= local87) {
			if (this.anInt1028 >= 0) {
				this.method989();
				this.method6330();
				return;
			}
			this.anInt1033 = local87 - 1;
		}
		this.anInt1033 += this.anInt1028 * arg0;
		if (this.anInt1023 >= 0) {
			if (this.anInt1023 > 0) {
				if (this.aBoolean72) {
					label125: {
						if (this.anInt1028 < 0) {
							if (this.anInt1033 >= local76) {
								return;
							}
							this.anInt1033 = local76 + local76 - this.anInt1033 - 1;
							this.anInt1028 = -this.anInt1028;
							if (--this.anInt1023 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1033 < local81) {
								return;
							}
							this.anInt1033 = local81 + local81 - this.anInt1033 - 1;
							this.anInt1028 = -this.anInt1028;
							if (--this.anInt1023 == 0) {
								break;
							}
							if (this.anInt1033 >= local76) {
								return;
							}
							this.anInt1033 = local76 + local76 - this.anInt1033 - 1;
							this.anInt1028 = -this.anInt1028;
						} while (--this.anInt1023 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1028 < 0) {
						if (this.anInt1033 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1033 - 1) / local91;
						if (local361 < this.anInt1023) {
							this.anInt1033 += local91 * local361;
							this.anInt1023 -= local361;
							return;
						}
						this.anInt1033 += local91 * this.anInt1023;
						this.anInt1023 = 0;
					} else if (this.anInt1033 >= local81) {
						local361 = (this.anInt1033 - local76) / local91;
						if (local361 < this.anInt1023) {
							this.anInt1033 -= local91 * local361;
							this.anInt1023 -= local361;
							return;
						}
						this.anInt1033 -= local91 * this.anInt1023;
						this.anInt1023 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1028 < 0) {
				if (this.anInt1033 < 0) {
					this.anInt1033 = -1;
					this.method989();
					this.method6330();
					return;
				}
			} else if (this.anInt1033 >= local87) {
				this.anInt1033 = local87;
				this.method989();
				this.method6330();
			}
		} else if (this.aBoolean72) {
			if (this.anInt1028 < 0) {
				if (this.anInt1033 >= local76) {
					return;
				}
				this.anInt1033 = local76 + local76 - this.anInt1033 - 1;
				this.anInt1028 = -this.anInt1028;
			}
			while (this.anInt1033 >= local81) {
				this.anInt1033 = local81 + local81 - this.anInt1033 - 1;
				this.anInt1028 = -this.anInt1028;
				if (this.anInt1033 >= local76) {
					return;
				}
				this.anInt1033 = local76 + local76 - this.anInt1033 - 1;
				this.anInt1028 = -this.anInt1028;
			}
		} else if (this.anInt1028 < 0) {
			if (this.anInt1033 < local76) {
				this.anInt1033 = local81 - (local81 - 1 - this.anInt1033) % local91 - 1;
			}
		} else if (this.anInt1033 >= local81) {
			this.anInt1033 = local76 + (this.anInt1033 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public synchronized void method978() {
		this.anInt1028 = (this.anInt1028 ^ this.anInt1028 >> 31) + (this.anInt1028 >>> 31);
		this.anInt1028 = -this.anInt1028;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V")
	public synchronized void method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method960(arg0, arg1, this.method972());
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()Lclient!po;")
	@Override
	public Class4_Sub7 method5468() {
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
	private synchronized void method980() {
		this.method970(0, this.method972());
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()I")
	@Override
	public int method5469() {
		@Pc(6) int local6 = this.anInt1036 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1023 == 0) {
			local6 -= local6 * this.anInt1033 / (((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18.length << 8);
		} else if (this.anInt1023 >= 0) {
			local6 -= local6 * this.anInt1031 / ((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "([IIIII)I")
	private int method981(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1026 <= 0) {
				if (this.anInt1028 == 256 && (this.anInt1033 & 0xFF) == 0) {
					if (Static3.aBoolean91) {
						return Static470.method965(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, arg3, arg2, this);
					}
					return Static470.method984(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, arg3, arg2, this);
				}
				if (Static3.aBoolean91) {
					return Static470.method990(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, arg3, arg2, this, this.anInt1028, arg4);
				}
				return Static470.method986(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, arg3, arg2, this, this.anInt1028, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1026;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1026 += arg1;
			if (this.anInt1028 == 256 && (this.anInt1033 & 0xFF) == 0) {
				if (Static3.aBoolean91) {
					arg1 = Static470.method964(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, this.anInt1030, this.anInt1034, local5, arg2, this);
				} else {
					arg1 = Static470.method995(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, this.anInt1024, local5, arg2, this);
				}
			} else if (Static3.aBoolean91) {
				arg1 = Static470.method959(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1025, this.anInt1035, this.anInt1030, this.anInt1034, local5, arg2, this, this.anInt1028, arg4);
			} else {
				arg1 = Static470.method997(((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18, arg0, this.anInt1033, arg1, this.anInt1036, this.anInt1024, local5, arg2, this, this.anInt1028, arg4);
			}
			this.anInt1026 -= arg1;
			if (this.anInt1026 != 0) {
				return arg1;
			}
		} while (!this.method985());
		return arg3;
	}

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "()Z")
	private boolean method985() {
		@Pc(2) int local2 = this.anInt1027;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static470.method983(local2, this.anInt1032);
			local8 = Static470.method969(local2, this.anInt1032);
		}
		if (this.anInt1036 != local2 || this.anInt1025 != local10 || this.anInt1035 != local8) {
			if (this.anInt1036 < local2) {
				this.anInt1024 = 1;
				this.anInt1026 = local2 - this.anInt1036;
			} else if (this.anInt1036 > local2) {
				this.anInt1024 = -1;
				this.anInt1026 = this.anInt1036 - local2;
			} else {
				this.anInt1024 = 0;
			}
			if (this.anInt1025 < local10) {
				this.anInt1030 = 1;
				if (this.anInt1026 == 0 || this.anInt1026 > local10 - this.anInt1025) {
					this.anInt1026 = local10 - this.anInt1025;
				}
			} else if (this.anInt1025 > local10) {
				this.anInt1030 = -1;
				if (this.anInt1026 == 0 || this.anInt1026 > this.anInt1025 - local10) {
					this.anInt1026 = this.anInt1025 - local10;
				}
			} else {
				this.anInt1030 = 0;
			}
			if (this.anInt1035 < local8) {
				this.anInt1034 = 1;
				if (this.anInt1026 == 0 || this.anInt1026 > local8 - this.anInt1035) {
					this.anInt1026 = local8 - this.anInt1035;
				}
			} else if (this.anInt1035 > local8) {
				this.anInt1034 = -1;
				if (this.anInt1026 == 0 || this.anInt1026 > this.anInt1035 - local8) {
					this.anInt1026 = this.anInt1035 - local8;
				}
			} else {
				this.anInt1034 = 0;
			}
			return false;
		} else if (this.anInt1027 == Integer.MIN_VALUE) {
			this.anInt1027 = 0;
			this.anInt1036 = this.anInt1025 = this.anInt1035 = 0;
			this.method6330();
			return true;
		} else {
			this.method961();
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "()Z")
	public boolean method988() {
		return this.anInt1026 != 0;
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "()V")
	private void method989() {
		if (this.anInt1026 == 0) {
			return;
		}
		if (this.anInt1027 == Integer.MIN_VALUE) {
			this.anInt1027 = 0;
		}
		this.anInt1026 = 0;
		this.method961();
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
	public synchronized void method991(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub9_Sub1) super.aClass4_Sub9_5).aByteArray18.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1033 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V")
	public synchronized void method993(@OriginalArg(0) int arg0) {
		this.method970(arg0 << 6, this.method972());
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5463(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1027 == 0 && this.anInt1026 == 0) {
			this.method5465(arg2);
			return;
		}
		@Pc(13) Class4_Sub9_Sub1 local13 = (Class4_Sub9_Sub1) super.aClass4_Sub9_5;
		@Pc(18) int local18 = this.anInt1031 << 8;
		@Pc(23) int local23 = this.anInt1029 << 8;
		@Pc(29) int local29 = local13.aByteArray18.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1023 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1033 < 0) {
			if (this.anInt1028 <= 0) {
				this.method989();
				this.method6330();
				return;
			}
			this.anInt1033 = 0;
		}
		if (this.anInt1033 >= local29) {
			if (this.anInt1028 >= 0) {
				this.method989();
				this.method6330();
				return;
			}
			this.anInt1033 = local29 - 1;
		}
		if (this.anInt1023 >= 0) {
			if (this.anInt1023 > 0) {
				if (this.aBoolean72) {
					label130: {
						if (this.anInt1028 < 0) {
							local40 = this.method962(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt1031]);
							if (this.anInt1033 >= local18) {
								return;
							}
							this.anInt1033 = local18 + local18 - this.anInt1033 - 1;
							this.anInt1028 = -this.anInt1028;
							if (--this.anInt1023 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method981(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1029 - 1]);
							if (this.anInt1033 < local23) {
								return;
							}
							this.anInt1033 = local23 + local23 - this.anInt1033 - 1;
							this.anInt1028 = -this.anInt1028;
							if (--this.anInt1023 == 0) {
								break;
							}
							local40 = this.method962(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1031]);
							if (this.anInt1033 >= local18) {
								return;
							}
							this.anInt1033 = local18 + local18 - this.anInt1033 - 1;
							this.anInt1028 = -this.anInt1028;
						} while (--this.anInt1023 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1028 < 0) {
						while (true) {
							local40 = this.method962(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1029 - 1]);
							if (this.anInt1033 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1033 - 1) / local33;
							if (local416 >= this.anInt1023) {
								this.anInt1033 += local33 * this.anInt1023;
								this.anInt1023 = 0;
								break;
							}
							this.anInt1033 += local33 * local416;
							this.anInt1023 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method981(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1031]);
							if (this.anInt1033 < local23) {
								return;
							}
							local416 = (this.anInt1033 - local18) / local33;
							if (local416 >= this.anInt1023) {
								this.anInt1033 -= local33 * this.anInt1023;
								this.anInt1023 = 0;
								break;
							}
							this.anInt1033 -= local33 * local416;
							this.anInt1023 -= local416;
						}
					}
				}
			}
			if (this.anInt1028 < 0) {
				this.method962(arg0, local40, 0, local44, 0);
				if (this.anInt1033 < 0) {
					this.anInt1033 = -1;
					this.method989();
					this.method6330();
					return;
				}
			} else {
				this.method981(arg0, local40, local29, local44, 0);
				if (this.anInt1033 >= local29) {
					this.anInt1033 = local29;
					this.method989();
					this.method6330();
				}
			}
		} else if (this.aBoolean72) {
			if (this.anInt1028 < 0) {
				local40 = this.method962(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt1031]);
				if (this.anInt1033 >= local18) {
					return;
				}
				this.anInt1033 = local18 + local18 - this.anInt1033 - 1;
				this.anInt1028 = -this.anInt1028;
			}
			while (true) {
				local40 = this.method981(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1029 - 1]);
				if (this.anInt1033 < local23) {
					return;
				}
				this.anInt1033 = local23 + local23 - this.anInt1033 - 1;
				this.anInt1028 = -this.anInt1028;
				local40 = this.method962(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1031]);
				if (this.anInt1033 >= local18) {
					return;
				}
				this.anInt1033 = local18 + local18 - this.anInt1033 - 1;
				this.anInt1028 = -this.anInt1028;
			}
		} else if (this.anInt1028 < 0) {
			while (true) {
				local40 = this.method962(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1029 - 1]);
				if (this.anInt1033 >= local18) {
					return;
				}
				this.anInt1033 = local23 - (local23 - 1 - this.anInt1033) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method981(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1031]);
				if (this.anInt1033 < local23) {
					return;
				}
				this.anInt1033 = local18 + (this.anInt1033 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "()I")
	public synchronized int method996() {
		return this.anInt1028 < 0 ? -this.anInt1028 : this.anInt1028;
	}
}
