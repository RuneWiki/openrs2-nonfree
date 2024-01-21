import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class5_Sub5_Sub2 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public int anInt1168;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
	private int anInt1170;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt1171;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public int anInt1174;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	private int anInt1176;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	public int anInt1177;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	public int anInt1178;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	public int anInt1179;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	private final int anInt1172;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	private final int anInt1166;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	private int anInt1175;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	private int anInt1169;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	private int anInt1167;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public int anInt1173;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!qf;II)V")
	public Class5_Sub5_Sub2(@OriginalArg(0) Class5_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass5_Sub21_5 = arg0;
		this.anInt1172 = arg0.anInt2645;
		this.anInt1166 = arg0.anInt2646;
		this.aBoolean39 = arg0.aBoolean96;
		this.anInt1175 = arg1;
		this.anInt1169 = arg2;
		this.anInt1167 = 8192;
		this.anInt1173 = 0;
		this.method813();
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!qf;III)V")
	public Class5_Sub5_Sub2(@OriginalArg(0) Class5_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass5_Sub21_5 = arg0;
		this.anInt1172 = arg0.anInt2645;
		this.anInt1166 = arg0.anInt2646;
		this.aBoolean39 = arg0.aBoolean96;
		this.anInt1175 = arg1;
		this.anInt1169 = arg2;
		this.anInt1167 = arg3;
		this.anInt1173 = 0;
		this.method813();
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public boolean method798() {
		return this.anInt1173 < 0 || this.anInt1173 >= ((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37.length << 8;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	private synchronized void method802() {
		this.method805(0, this.method829());
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1556(@OriginalArg(0) int arg0) {
		if (this.anInt1170 > 0) {
			if (arg0 >= this.anInt1170) {
				if (this.anInt1169 == Integer.MIN_VALUE) {
					this.anInt1169 = 0;
					this.anInt1177 = this.anInt1168 = this.anInt1179 = 0;
					this.method2189();
					arg0 = this.anInt1170;
				}
				this.anInt1170 = 0;
				this.method813();
			} else {
				this.anInt1177 += this.anInt1171 * arg0;
				this.anInt1168 += this.anInt1174 * arg0;
				this.anInt1179 += this.anInt1178 * arg0;
				this.anInt1170 -= arg0;
			}
		}
		@Pc(71) Class5_Sub21_Sub1 local71 = (Class5_Sub21_Sub1) super.aClass5_Sub21_5;
		@Pc(76) int local76 = this.anInt1172 << 8;
		@Pc(81) int local81 = this.anInt1166 << 8;
		@Pc(87) int local87 = local71.aByteArray37.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1176 = 0;
		}
		if (this.anInt1173 < 0) {
			if (this.anInt1175 <= 0) {
				this.method807();
				this.method2189();
				return;
			}
			this.anInt1173 = 0;
		}
		if (this.anInt1173 >= local87) {
			if (this.anInt1175 >= 0) {
				this.method807();
				this.method2189();
				return;
			}
			this.anInt1173 = local87 - 1;
		}
		this.anInt1173 += this.anInt1175 * arg0;
		if (this.anInt1176 >= 0) {
			if (this.anInt1176 > 0) {
				if (this.aBoolean39) {
					label125: {
						if (this.anInt1175 < 0) {
							if (this.anInt1173 >= local76) {
								return;
							}
							this.anInt1173 = local76 + local76 - this.anInt1173 - 1;
							this.anInt1175 = -this.anInt1175;
							if (--this.anInt1176 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1173 < local81) {
								return;
							}
							this.anInt1173 = local81 + local81 - this.anInt1173 - 1;
							this.anInt1175 = -this.anInt1175;
							if (--this.anInt1176 == 0) {
								break;
							}
							if (this.anInt1173 >= local76) {
								return;
							}
							this.anInt1173 = local76 + local76 - this.anInt1173 - 1;
							this.anInt1175 = -this.anInt1175;
						} while (--this.anInt1176 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1175 < 0) {
						if (this.anInt1173 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1173 - 1) / local91;
						if (local361 < this.anInt1176) {
							this.anInt1173 += local91 * local361;
							this.anInt1176 -= local361;
							return;
						}
						this.anInt1173 += local91 * this.anInt1176;
						this.anInt1176 = 0;
					} else if (this.anInt1173 >= local81) {
						local361 = (this.anInt1173 - local76) / local91;
						if (local361 < this.anInt1176) {
							this.anInt1173 -= local91 * local361;
							this.anInt1176 -= local361;
							return;
						}
						this.anInt1173 -= local91 * this.anInt1176;
						this.anInt1176 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1175 < 0) {
				if (this.anInt1173 < 0) {
					this.anInt1173 = -1;
					this.method807();
					this.method2189();
					return;
				}
			} else if (this.anInt1173 >= local87) {
				this.anInt1173 = local87;
				this.method807();
				this.method2189();
			}
		} else if (this.aBoolean39) {
			if (this.anInt1175 < 0) {
				if (this.anInt1173 >= local76) {
					return;
				}
				this.anInt1173 = local76 + local76 - this.anInt1173 - 1;
				this.anInt1175 = -this.anInt1175;
			}
			while (this.anInt1173 >= local81) {
				this.anInt1173 = local81 + local81 - this.anInt1173 - 1;
				this.anInt1175 = -this.anInt1175;
				if (this.anInt1173 >= local76) {
					return;
				}
				this.anInt1173 = local76 + local76 - this.anInt1173 - 1;
				this.anInt1175 = -this.anInt1175;
			}
		} else if (this.anInt1175 < 0) {
			if (this.anInt1173 < local76) {
				this.anInt1173 = local81 - (local81 - 1 - this.anInt1173) % local91 - 1;
			}
		} else if (this.anInt1173 >= local81) {
			this.anInt1173 = local76 + (this.anInt1173 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1561(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1169 == 0 && this.anInt1170 == 0) {
			this.method1556(arg2);
			return;
		}
		@Pc(13) Class5_Sub21_Sub1 local13 = (Class5_Sub21_Sub1) super.aClass5_Sub21_5;
		@Pc(18) int local18 = this.anInt1172 << 8;
		@Pc(23) int local23 = this.anInt1166 << 8;
		@Pc(29) int local29 = local13.aByteArray37.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1176 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1173 < 0) {
			if (this.anInt1175 <= 0) {
				this.method807();
				this.method2189();
				return;
			}
			this.anInt1173 = 0;
		}
		if (this.anInt1173 >= local29) {
			if (this.anInt1175 >= 0) {
				this.method807();
				this.method2189();
				return;
			}
			this.anInt1173 = local29 - 1;
		}
		if (this.anInt1176 >= 0) {
			if (this.anInt1176 > 0) {
				if (this.aBoolean39) {
					label130: {
						if (this.anInt1175 < 0) {
							local40 = this.method808(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt1172]);
							if (this.anInt1173 >= local18) {
								return;
							}
							this.anInt1173 = local18 + local18 - this.anInt1173 - 1;
							this.anInt1175 = -this.anInt1175;
							if (--this.anInt1176 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method824(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1166 - 1]);
							if (this.anInt1173 < local23) {
								return;
							}
							this.anInt1173 = local23 + local23 - this.anInt1173 - 1;
							this.anInt1175 = -this.anInt1175;
							if (--this.anInt1176 == 0) {
								break;
							}
							local40 = this.method808(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1172]);
							if (this.anInt1173 >= local18) {
								return;
							}
							this.anInt1173 = local18 + local18 - this.anInt1173 - 1;
							this.anInt1175 = -this.anInt1175;
						} while (--this.anInt1176 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1175 < 0) {
						while (true) {
							local40 = this.method808(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1166 - 1]);
							if (this.anInt1173 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1173 - 1) / local33;
							if (local416 >= this.anInt1176) {
								this.anInt1173 += local33 * this.anInt1176;
								this.anInt1176 = 0;
								break;
							}
							this.anInt1173 += local33 * local416;
							this.anInt1176 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method824(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1172]);
							if (this.anInt1173 < local23) {
								return;
							}
							local416 = (this.anInt1173 - local18) / local33;
							if (local416 >= this.anInt1176) {
								this.anInt1173 -= local33 * this.anInt1176;
								this.anInt1176 = 0;
								break;
							}
							this.anInt1173 -= local33 * local416;
							this.anInt1176 -= local416;
						}
					}
				}
			}
			if (this.anInt1175 < 0) {
				this.method808(arg0, local40, 0, local44, 0);
				if (this.anInt1173 < 0) {
					this.anInt1173 = -1;
					this.method807();
					this.method2189();
					return;
				}
			} else {
				this.method824(arg0, local40, local29, local44, 0);
				if (this.anInt1173 >= local29) {
					this.anInt1173 = local29;
					this.method807();
					this.method2189();
				}
			}
		} else if (this.aBoolean39) {
			if (this.anInt1175 < 0) {
				local40 = this.method808(arg0, arg1, local18, local44, local13.aByteArray37[this.anInt1172]);
				if (this.anInt1173 >= local18) {
					return;
				}
				this.anInt1173 = local18 + local18 - this.anInt1173 - 1;
				this.anInt1175 = -this.anInt1175;
			}
			while (true) {
				local40 = this.method824(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1166 - 1]);
				if (this.anInt1173 < local23) {
					return;
				}
				this.anInt1173 = local23 + local23 - this.anInt1173 - 1;
				this.anInt1175 = -this.anInt1175;
				local40 = this.method808(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1172]);
				if (this.anInt1173 >= local18) {
					return;
				}
				this.anInt1173 = local18 + local18 - this.anInt1173 - 1;
				this.anInt1175 = -this.anInt1175;
			}
		} else if (this.anInt1175 < 0) {
			while (true) {
				local40 = this.method808(arg0, local40, local18, local44, local13.aByteArray37[this.anInt1166 - 1]);
				if (this.anInt1173 >= local18) {
					return;
				}
				this.anInt1173 = local23 - (local23 - 1 - this.anInt1173) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method824(arg0, local40, local23, local44, local13.aByteArray37[this.anInt1172]);
				if (this.anInt1173 < local23) {
					return;
				}
				this.anInt1173 = local18 + (this.anInt1173 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
	@Override
	public int method1559() {
		@Pc(6) int local6 = this.anInt1177 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1176 == 0) {
			local6 -= local6 * this.anInt1173 / (((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37.length << 8);
		} else if (this.anInt1176 >= 0) {
			local6 -= local6 * this.anInt1172 / ((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	private synchronized void method805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1169 = arg0;
		this.anInt1167 = arg1;
		this.anInt1170 = 0;
		this.method813();
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	private void method807() {
		if (this.anInt1170 == 0) {
			return;
		}
		if (this.anInt1169 == Integer.MIN_VALUE) {
			this.anInt1169 = 0;
		}
		this.anInt1170 = 0;
		this.method813();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIII)I")
	private int method808(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1170 <= 0) {
				if (this.anInt1175 == -256 && (this.anInt1173 & 0xFF) == 0) {
					if (Static37.aBoolean28) {
						return Static135.method826(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, arg3, arg2, this);
					}
					return Static135.method811(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, arg3, arg2, this);
				}
				if (Static37.aBoolean28) {
					return Static135.method806(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, arg3, arg2, this, this.anInt1175, arg4);
				}
				return Static135.method816(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, arg3, arg2, this, this.anInt1175, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1170;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1170 += arg1;
			if (this.anInt1175 == -256 && (this.anInt1173 & 0xFF) == 0) {
				if (Static37.aBoolean28) {
					arg1 = Static135.method801(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, this.anInt1174, this.anInt1178, local5, arg2, this);
				} else {
					arg1 = Static135.method830(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, this.anInt1171, local5, arg2, this);
				}
			} else if (Static37.aBoolean28) {
				arg1 = Static135.method834(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, this.anInt1174, this.anInt1178, local5, arg2, this, this.anInt1175, arg4);
			} else {
				arg1 = Static135.method827(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, this.anInt1171, local5, arg2, this, this.anInt1175, arg4);
			}
			this.anInt1170 -= arg1;
			if (this.anInt1170 != 0) {
				return arg1;
			}
		} while (!this.method812());
		return arg3;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public synchronized void method810(@OriginalArg(0) int arg0) {
		this.method805(arg0 << 6, this.method829());
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "()Z")
	private boolean method812() {
		@Pc(2) int local2 = this.anInt1169;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static135.method814(local2, this.anInt1167);
			local8 = Static135.method809(local2, this.anInt1167);
		}
		if (this.anInt1177 != local2 || this.anInt1168 != local10 || this.anInt1179 != local8) {
			if (this.anInt1177 < local2) {
				this.anInt1171 = 1;
				this.anInt1170 = local2 - this.anInt1177;
			} else if (this.anInt1177 > local2) {
				this.anInt1171 = -1;
				this.anInt1170 = this.anInt1177 - local2;
			} else {
				this.anInt1171 = 0;
			}
			if (this.anInt1168 < local10) {
				this.anInt1174 = 1;
				if (this.anInt1170 == 0 || this.anInt1170 > local10 - this.anInt1168) {
					this.anInt1170 = local10 - this.anInt1168;
				}
			} else if (this.anInt1168 > local10) {
				this.anInt1174 = -1;
				if (this.anInt1170 == 0 || this.anInt1170 > this.anInt1168 - local10) {
					this.anInt1170 = this.anInt1168 - local10;
				}
			} else {
				this.anInt1174 = 0;
			}
			if (this.anInt1179 < local8) {
				this.anInt1178 = 1;
				if (this.anInt1170 == 0 || this.anInt1170 > local8 - this.anInt1179) {
					this.anInt1170 = local8 - this.anInt1179;
				}
			} else if (this.anInt1179 > local8) {
				this.anInt1178 = -1;
				if (this.anInt1170 == 0 || this.anInt1170 > this.anInt1179 - local8) {
					this.anInt1170 = this.anInt1179 - local8;
				}
			} else {
				this.anInt1178 = 0;
			}
			return false;
		} else if (this.anInt1169 == Integer.MIN_VALUE) {
			this.anInt1169 = 0;
			this.anInt1177 = this.anInt1168 = this.anInt1179 = 0;
			this.method2189();
			return true;
		} else {
			this.method813();
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
	private void method813() {
		this.anInt1177 = this.anInt1169;
		this.anInt1168 = Static135.method814(this.anInt1169, this.anInt1167);
		this.anInt1179 = Static135.method809(this.anInt1169, this.anInt1167);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public synchronized void method815() {
		this.anInt1175 = (this.anInt1175 ^ this.anInt1175 >> 31) + (this.anInt1175 >>> 31);
		this.anInt1175 = -this.anInt1175;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	public synchronized void method817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method805(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static135.method814(arg1, arg2);
		@Pc(14) int local14 = Static135.method809(arg1, arg2);
		if (this.anInt1168 == local10 && this.anInt1179 == local14) {
			this.anInt1170 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1177;
		if (this.anInt1177 - arg1 > local31) {
			local31 = this.anInt1177 - arg1;
		}
		if (local10 - this.anInt1168 > local31) {
			local31 = local10 - this.anInt1168;
		}
		if (this.anInt1168 - local10 > local31) {
			local31 = this.anInt1168 - local10;
		}
		if (local14 - this.anInt1179 > local31) {
			local31 = local14 - this.anInt1179;
		}
		if (this.anInt1179 - local14 > local31) {
			local31 = this.anInt1179 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1170 = arg0;
		this.anInt1169 = arg1;
		this.anInt1167 = arg2;
		this.anInt1171 = (arg1 - this.anInt1177) / arg0;
		this.anInt1174 = (local10 - this.anInt1168) / arg0;
		this.anInt1178 = (local14 - this.anInt1179) / arg0;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public synchronized int method818() {
		return this.anInt1169 == Integer.MIN_VALUE ? 0 : this.anInt1169;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
	public synchronized void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method817(arg0, arg1, this.method829());
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public synchronized void method821(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1173 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public synchronized void method823(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method802();
			this.method2189();
		} else if (this.anInt1168 == 0 && this.anInt1179 == 0) {
			this.anInt1170 = 0;
			this.anInt1169 = 0;
			this.anInt1177 = 0;
			this.method2189();
		} else {
			@Pc(31) int local31 = -this.anInt1177;
			if (this.anInt1177 > local31) {
				local31 = this.anInt1177;
			}
			if (-this.anInt1168 > local31) {
				local31 = -this.anInt1168;
			}
			if (this.anInt1168 > local31) {
				local31 = this.anInt1168;
			}
			if (-this.anInt1179 > local31) {
				local31 = -this.anInt1179;
			}
			if (this.anInt1179 > local31) {
				local31 = this.anInt1179;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1170 = arg0;
			this.anInt1169 = Integer.MIN_VALUE;
			this.anInt1171 = -this.anInt1177 / arg0;
			this.anInt1174 = -this.anInt1168 / arg0;
			this.anInt1178 = -this.anInt1179 / arg0;
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "([IIIII)I")
	private int method824(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1170 <= 0) {
				if (this.anInt1175 == 256 && (this.anInt1173 & 0xFF) == 0) {
					if (Static37.aBoolean28) {
						return Static135.method825(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, arg3, arg2, this);
					}
					return Static135.method804(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, arg3, arg2, this);
				}
				if (Static37.aBoolean28) {
					return Static135.method799(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, arg3, arg2, this, this.anInt1175, arg4);
				}
				return Static135.method822(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, arg3, arg2, this, this.anInt1175, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1170;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1170 += arg1;
			if (this.anInt1175 == 256 && (this.anInt1173 & 0xFF) == 0) {
				if (Static37.aBoolean28) {
					arg1 = Static135.method837(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, this.anInt1174, this.anInt1178, local5, arg2, this);
				} else {
					arg1 = Static135.method800(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, this.anInt1171, local5, arg2, this);
				}
			} else if (Static37.aBoolean28) {
				arg1 = Static135.method819(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1168, this.anInt1179, this.anInt1174, this.anInt1178, local5, arg2, this, this.anInt1175, arg4);
			} else {
				arg1 = Static135.method803(((Class5_Sub21_Sub1) super.aClass5_Sub21_5).aByteArray37, arg0, this.anInt1173, arg1, this.anInt1177, this.anInt1171, local5, arg2, this, this.anInt1175, arg4);
			}
			this.anInt1170 -= arg1;
			if (this.anInt1170 != 0) {
				return arg1;
			}
		} while (!this.method812());
		return arg3;
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public synchronized void method828(@OriginalArg(0) int arg0) {
		if (this.anInt1175 < 0) {
			this.anInt1175 = -arg0;
		} else {
			this.anInt1175 = arg0;
		}
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()I")
	public synchronized int method829() {
		return this.anInt1167 < 0 ? -1 : this.anInt1167;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()I")
	@Override
	public int method1557() {
		return this.anInt1169 == 0 && this.anInt1170 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public synchronized void method831(@OriginalArg(0) int arg0) {
		this.anInt1176 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lclient!sd;")
	@Override
	public Class5_Sub5 method1558() {
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public boolean method833() {
		return this.anInt1170 != 0;
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()I")
	public synchronized int method835() {
		return this.anInt1175 < 0 ? -this.anInt1175 : this.anInt1175;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class5_Sub5 method1560() {
		return null;
	}
}
