import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class2_Sub8_Sub2 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public int anInt1164;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	public int anInt1165;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	private int anInt1168;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	public int anInt1170;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "I")
	private int anInt1173;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
	public int anInt1174;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	public int anInt1176;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
	public int anInt1177;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	private final int anInt1171;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
	private final int anInt1167;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "Z")
	private final boolean aBoolean53;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
	private int anInt1169;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	private int anInt1166;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
	private int anInt1172;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "I")
	public int anInt1175;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!nc;II)V")
	public Class2_Sub8_Sub2(@OriginalArg(0) Class2_Sub18_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub18_5 = arg0;
		this.anInt1171 = arg0.anInt2663;
		this.anInt1167 = arg0.anInt2662;
		this.aBoolean53 = arg0.aBoolean124;
		this.anInt1169 = arg1;
		this.anInt1166 = arg2;
		this.anInt1172 = 8192;
		this.anInt1175 = 0;
		this.method826();
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!nc;III)V")
	public Class2_Sub8_Sub2(@OriginalArg(0) Class2_Sub18_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub18_5 = arg0;
		this.anInt1171 = arg0.anInt2663;
		this.anInt1167 = arg0.anInt2662;
		this.aBoolean53 = arg0.aBoolean124;
		this.anInt1169 = arg1;
		this.anInt1166 = arg2;
		this.anInt1172 = arg3;
		this.anInt1175 = 0;
		this.method826();
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public synchronized void method814(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1175 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "()Z")
	private boolean method815() {
		@Pc(2) int local2 = this.anInt1166;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static182.method836(local2, this.anInt1172);
			local8 = Static182.method839(local2, this.anInt1172);
		}
		if (this.anInt1165 != local2 || this.anInt1164 != local10 || this.anInt1177 != local8) {
			if (this.anInt1165 < local2) {
				this.anInt1174 = 1;
				this.anInt1168 = local2 - this.anInt1165;
			} else if (this.anInt1165 > local2) {
				this.anInt1174 = -1;
				this.anInt1168 = this.anInt1165 - local2;
			} else {
				this.anInt1174 = 0;
			}
			if (this.anInt1164 < local10) {
				this.anInt1170 = 1;
				if (this.anInt1168 == 0 || this.anInt1168 > local10 - this.anInt1164) {
					this.anInt1168 = local10 - this.anInt1164;
				}
			} else if (this.anInt1164 > local10) {
				this.anInt1170 = -1;
				if (this.anInt1168 == 0 || this.anInt1168 > this.anInt1164 - local10) {
					this.anInt1168 = this.anInt1164 - local10;
				}
			} else {
				this.anInt1170 = 0;
			}
			if (this.anInt1177 < local8) {
				this.anInt1176 = 1;
				if (this.anInt1168 == 0 || this.anInt1168 > local8 - this.anInt1177) {
					this.anInt1168 = local8 - this.anInt1177;
				}
			} else if (this.anInt1177 > local8) {
				this.anInt1176 = -1;
				if (this.anInt1168 == 0 || this.anInt1168 > this.anInt1177 - local8) {
					this.anInt1168 = this.anInt1177 - local8;
				}
			} else {
				this.anInt1176 = 0;
			}
			return false;
		} else if (this.anInt1166 == Integer.MIN_VALUE) {
			this.anInt1166 = 0;
			this.anInt1165 = this.anInt1164 = this.anInt1177 = 0;
			this.method2888();
			return true;
		} else {
			this.method826();
			return false;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public synchronized void method817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method823(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static182.method836(arg1, arg2);
		@Pc(14) int local14 = Static182.method839(arg1, arg2);
		if (this.anInt1164 == local10 && this.anInt1177 == local14) {
			this.anInt1168 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1165;
		if (this.anInt1165 - arg1 > local31) {
			local31 = this.anInt1165 - arg1;
		}
		if (local10 - this.anInt1164 > local31) {
			local31 = local10 - this.anInt1164;
		}
		if (this.anInt1164 - local10 > local31) {
			local31 = this.anInt1164 - local10;
		}
		if (local14 - this.anInt1177 > local31) {
			local31 = local14 - this.anInt1177;
		}
		if (this.anInt1177 - local14 > local31) {
			local31 = this.anInt1177 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1168 = arg0;
		this.anInt1166 = arg1;
		this.anInt1172 = arg2;
		this.anInt1174 = (arg1 - this.anInt1165) / arg0;
		this.anInt1170 = (local10 - this.anInt1164) / arg0;
		this.anInt1176 = (local14 - this.anInt1177) / arg0;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	public synchronized void method819(@OriginalArg(0) int arg0) {
		this.anInt1173 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public synchronized void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method817(arg0, arg1, this.method837());
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Z)V")
	public synchronized void method822() {
		this.anInt1169 = (this.anInt1169 ^ this.anInt1169 >> 31) + (this.anInt1169 >>> 31);
		this.anInt1169 = -this.anInt1169;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
	private synchronized void method823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1166 = arg0;
		this.anInt1172 = arg1;
		this.anInt1168 = 0;
		this.method826();
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public synchronized void method825(@OriginalArg(0) int arg0) {
		if (this.anInt1169 < 0) {
			this.anInt1169 = -arg0;
		} else {
			this.anInt1169 = arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1166 == 0 && this.anInt1168 == 0) {
			this.method2182(arg2);
			return;
		}
		@Pc(13) Class2_Sub18_Sub1 local13 = (Class2_Sub18_Sub1) super.aClass2_Sub18_5;
		@Pc(18) int local18 = this.anInt1171 << 8;
		@Pc(23) int local23 = this.anInt1167 << 8;
		@Pc(29) int local29 = local13.aByteArray36.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1173 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1175 < 0) {
			if (this.anInt1169 <= 0) {
				this.method845();
				this.method2888();
				return;
			}
			this.anInt1175 = 0;
		}
		if (this.anInt1175 >= local29) {
			if (this.anInt1169 >= 0) {
				this.method845();
				this.method2888();
				return;
			}
			this.anInt1175 = local29 - 1;
		}
		if (this.anInt1173 >= 0) {
			if (this.anInt1173 > 0) {
				if (this.aBoolean53) {
					label130: {
						if (this.anInt1169 < 0) {
							local40 = this.method835(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt1171]);
							if (this.anInt1175 >= local18) {
								return;
							}
							this.anInt1175 = local18 + local18 - this.anInt1175 - 1;
							this.anInt1169 = -this.anInt1169;
							if (--this.anInt1173 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method834(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1167 - 1]);
							if (this.anInt1175 < local23) {
								return;
							}
							this.anInt1175 = local23 + local23 - this.anInt1175 - 1;
							this.anInt1169 = -this.anInt1169;
							if (--this.anInt1173 == 0) {
								break;
							}
							local40 = this.method835(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1171]);
							if (this.anInt1175 >= local18) {
								return;
							}
							this.anInt1175 = local18 + local18 - this.anInt1175 - 1;
							this.anInt1169 = -this.anInt1169;
						} while (--this.anInt1173 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1169 < 0) {
						while (true) {
							local40 = this.method835(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1167 - 1]);
							if (this.anInt1175 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1175 - 1) / local33;
							if (local416 >= this.anInt1173) {
								this.anInt1175 += local33 * this.anInt1173;
								this.anInt1173 = 0;
								break;
							}
							this.anInt1175 += local33 * local416;
							this.anInt1173 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method834(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1171]);
							if (this.anInt1175 < local23) {
								return;
							}
							local416 = (this.anInt1175 - local18) / local33;
							if (local416 >= this.anInt1173) {
								this.anInt1175 -= local33 * this.anInt1173;
								this.anInt1173 = 0;
								break;
							}
							this.anInt1175 -= local33 * local416;
							this.anInt1173 -= local416;
						}
					}
				}
			}
			if (this.anInt1169 < 0) {
				this.method835(arg0, local40, 0, local44, 0);
				if (this.anInt1175 < 0) {
					this.anInt1175 = -1;
					this.method845();
					this.method2888();
					return;
				}
			} else {
				this.method834(arg0, local40, local29, local44, 0);
				if (this.anInt1175 >= local29) {
					this.anInt1175 = local29;
					this.method845();
					this.method2888();
				}
			}
		} else if (this.aBoolean53) {
			if (this.anInt1169 < 0) {
				local40 = this.method835(arg0, arg1, local18, local44, local13.aByteArray36[this.anInt1171]);
				if (this.anInt1175 >= local18) {
					return;
				}
				this.anInt1175 = local18 + local18 - this.anInt1175 - 1;
				this.anInt1169 = -this.anInt1169;
			}
			while (true) {
				local40 = this.method834(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1167 - 1]);
				if (this.anInt1175 < local23) {
					return;
				}
				this.anInt1175 = local23 + local23 - this.anInt1175 - 1;
				this.anInt1169 = -this.anInt1169;
				local40 = this.method835(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1171]);
				if (this.anInt1175 >= local18) {
					return;
				}
				this.anInt1175 = local18 + local18 - this.anInt1175 - 1;
				this.anInt1169 = -this.anInt1169;
			}
		} else if (this.anInt1169 < 0) {
			while (true) {
				local40 = this.method835(arg0, local40, local18, local44, local13.aByteArray36[this.anInt1167 - 1]);
				if (this.anInt1175 >= local18) {
					return;
				}
				this.anInt1175 = local23 - (local23 - 1 - this.anInt1175) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method834(arg0, local40, local23, local44, local13.aByteArray36[this.anInt1171]);
				if (this.anInt1175 < local23) {
					return;
				}
				this.anInt1175 = local18 + (this.anInt1175 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "()V")
	private void method826() {
		this.anInt1165 = this.anInt1166;
		this.anInt1164 = Static182.method836(this.anInt1166, this.anInt1172);
		this.anInt1177 = Static182.method839(this.anInt1166, this.anInt1172);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "()Lclient!qa;")
	@Override
	public Class2_Sub8 method2179() {
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "()I")
	public synchronized int method830() {
		return this.anInt1169 < 0 ? -this.anInt1169 : this.anInt1169;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "()Z")
	public boolean method831() {
		return this.anInt1168 != 0;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public synchronized void method832(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method847();
			this.method2888();
		} else if (this.anInt1164 == 0 && this.anInt1177 == 0) {
			this.anInt1168 = 0;
			this.anInt1166 = 0;
			this.anInt1165 = 0;
			this.method2888();
		} else {
			@Pc(31) int local31 = -this.anInt1165;
			if (this.anInt1165 > local31) {
				local31 = this.anInt1165;
			}
			if (-this.anInt1164 > local31) {
				local31 = -this.anInt1164;
			}
			if (this.anInt1164 > local31) {
				local31 = this.anInt1164;
			}
			if (-this.anInt1177 > local31) {
				local31 = -this.anInt1177;
			}
			if (this.anInt1177 > local31) {
				local31 = this.anInt1177;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1168 = arg0;
			this.anInt1166 = Integer.MIN_VALUE;
			this.anInt1174 = -this.anInt1165 / arg0;
			this.anInt1170 = -this.anInt1164 / arg0;
			this.anInt1176 = -this.anInt1177 / arg0;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIIII)I")
	private int method834(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1168 <= 0) {
				if (this.anInt1169 == 256 && (this.anInt1175 & 0xFF) == 0) {
					if (Static114.aBoolean125) {
						return Static182.method841(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, arg3, arg2, this);
					}
					return Static182.method829(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, arg3, arg2, this);
				}
				if (Static114.aBoolean125) {
					return Static182.method818(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, arg3, arg2, this, this.anInt1169, arg4);
				}
				return Static182.method821(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, arg3, arg2, this, this.anInt1169, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1168;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1168 += arg1;
			if (this.anInt1169 == 256 && (this.anInt1175 & 0xFF) == 0) {
				if (Static114.aBoolean125) {
					arg1 = Static182.method824(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, this.anInt1170, this.anInt1176, local5, arg2, this);
				} else {
					arg1 = Static182.method816(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, this.anInt1174, local5, arg2, this);
				}
			} else if (Static114.aBoolean125) {
				arg1 = Static182.method828(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, this.anInt1170, this.anInt1176, local5, arg2, this, this.anInt1169, arg4);
			} else {
				arg1 = Static182.method853(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, this.anInt1174, local5, arg2, this, this.anInt1169, arg4);
			}
			this.anInt1168 -= arg1;
			if (this.anInt1168 != 0) {
				return arg1;
			}
		} while (!this.method815());
		return arg3;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "([IIIII)I")
	private int method835(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1168 <= 0) {
				if (this.anInt1169 == -256 && (this.anInt1175 & 0xFF) == 0) {
					if (Static114.aBoolean125) {
						return Static182.method851(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, arg3, arg2, this);
					}
					return Static182.method827(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, arg3, arg2, this);
				}
				if (Static114.aBoolean125) {
					return Static182.method846(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, arg3, arg2, this, this.anInt1169, arg4);
				}
				return Static182.method833(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, arg3, arg2, this, this.anInt1169, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1168;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1168 += arg1;
			if (this.anInt1169 == -256 && (this.anInt1175 & 0xFF) == 0) {
				if (Static114.aBoolean125) {
					arg1 = Static182.method850(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, this.anInt1170, this.anInt1176, local5, arg2, this);
				} else {
					arg1 = Static182.method840(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, this.anInt1174, local5, arg2, this);
				}
			} else if (Static114.aBoolean125) {
				arg1 = Static182.method843(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1164, this.anInt1177, this.anInt1170, this.anInt1176, local5, arg2, this, this.anInt1169, arg4);
			} else {
				arg1 = Static182.method849(((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36, arg0, this.anInt1175, arg1, this.anInt1165, this.anInt1174, local5, arg2, this, this.anInt1169, arg4);
			}
			this.anInt1168 -= arg1;
			if (this.anInt1168 != 0) {
				return arg1;
			}
		} while (!this.method815());
		return arg3;
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "()I")
	public synchronized int method837() {
		return this.anInt1172 < 0 ? -1 : this.anInt1172;
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "()I")
	public synchronized int method838() {
		return this.anInt1166 == Integer.MIN_VALUE ? 0 : this.anInt1166;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()I")
	@Override
	public int method2177() {
		@Pc(6) int local6 = this.anInt1165 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1173 == 0) {
			local6 -= local6 * this.anInt1175 / (((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36.length << 8);
		} else if (this.anInt1173 >= 0) {
			local6 -= local6 * this.anInt1171 / ((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public synchronized void method842(@OriginalArg(0) int arg0) {
		this.method823(arg0 << 6, this.method837());
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "()Lclient!qa;")
	@Override
	public Class2_Sub8 method2178() {
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "()V")
	private void method845() {
		if (this.anInt1168 == 0) {
			return;
		}
		if (this.anInt1166 == Integer.MIN_VALUE) {
			this.anInt1166 = 0;
		}
		this.anInt1168 = 0;
		this.method826();
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)V")
	private synchronized void method847() {
		this.method823(0, this.method837());
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2182(@OriginalArg(0) int arg0) {
		if (this.anInt1168 > 0) {
			if (arg0 >= this.anInt1168) {
				if (this.anInt1166 == Integer.MIN_VALUE) {
					this.anInt1166 = 0;
					this.anInt1165 = this.anInt1164 = this.anInt1177 = 0;
					this.method2888();
					arg0 = this.anInt1168;
				}
				this.anInt1168 = 0;
				this.method826();
			} else {
				this.anInt1165 += this.anInt1174 * arg0;
				this.anInt1164 += this.anInt1170 * arg0;
				this.anInt1177 += this.anInt1176 * arg0;
				this.anInt1168 -= arg0;
			}
		}
		@Pc(71) Class2_Sub18_Sub1 local71 = (Class2_Sub18_Sub1) super.aClass2_Sub18_5;
		@Pc(76) int local76 = this.anInt1171 << 8;
		@Pc(81) int local81 = this.anInt1167 << 8;
		@Pc(87) int local87 = local71.aByteArray36.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1173 = 0;
		}
		if (this.anInt1175 < 0) {
			if (this.anInt1169 <= 0) {
				this.method845();
				this.method2888();
				return;
			}
			this.anInt1175 = 0;
		}
		if (this.anInt1175 >= local87) {
			if (this.anInt1169 >= 0) {
				this.method845();
				this.method2888();
				return;
			}
			this.anInt1175 = local87 - 1;
		}
		this.anInt1175 += this.anInt1169 * arg0;
		if (this.anInt1173 >= 0) {
			if (this.anInt1173 > 0) {
				if (this.aBoolean53) {
					label125: {
						if (this.anInt1169 < 0) {
							if (this.anInt1175 >= local76) {
								return;
							}
							this.anInt1175 = local76 + local76 - this.anInt1175 - 1;
							this.anInt1169 = -this.anInt1169;
							if (--this.anInt1173 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1175 < local81) {
								return;
							}
							this.anInt1175 = local81 + local81 - this.anInt1175 - 1;
							this.anInt1169 = -this.anInt1169;
							if (--this.anInt1173 == 0) {
								break;
							}
							if (this.anInt1175 >= local76) {
								return;
							}
							this.anInt1175 = local76 + local76 - this.anInt1175 - 1;
							this.anInt1169 = -this.anInt1169;
						} while (--this.anInt1173 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1169 < 0) {
						if (this.anInt1175 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1175 - 1) / local91;
						if (local361 < this.anInt1173) {
							this.anInt1175 += local91 * local361;
							this.anInt1173 -= local361;
							return;
						}
						this.anInt1175 += local91 * this.anInt1173;
						this.anInt1173 = 0;
					} else if (this.anInt1175 >= local81) {
						local361 = (this.anInt1175 - local76) / local91;
						if (local361 < this.anInt1173) {
							this.anInt1175 -= local91 * local361;
							this.anInt1173 -= local361;
							return;
						}
						this.anInt1175 -= local91 * this.anInt1173;
						this.anInt1173 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1169 < 0) {
				if (this.anInt1175 < 0) {
					this.anInt1175 = -1;
					this.method845();
					this.method2888();
					return;
				}
			} else if (this.anInt1175 >= local87) {
				this.anInt1175 = local87;
				this.method845();
				this.method2888();
			}
		} else if (this.aBoolean53) {
			if (this.anInt1169 < 0) {
				if (this.anInt1175 >= local76) {
					return;
				}
				this.anInt1175 = local76 + local76 - this.anInt1175 - 1;
				this.anInt1169 = -this.anInt1169;
			}
			while (this.anInt1175 >= local81) {
				this.anInt1175 = local81 + local81 - this.anInt1175 - 1;
				this.anInt1169 = -this.anInt1169;
				if (this.anInt1175 >= local76) {
					return;
				}
				this.anInt1175 = local76 + local76 - this.anInt1175 - 1;
				this.anInt1169 = -this.anInt1169;
			}
		} else if (this.anInt1169 < 0) {
			if (this.anInt1175 < local76) {
				this.anInt1175 = local81 - (local81 - 1 - this.anInt1175) % local91 - 1;
			}
		} else if (this.anInt1175 >= local81) {
			this.anInt1175 = local76 + (this.anInt1175 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "()I")
	@Override
	public int method2183() {
		return this.anInt1166 == 0 && this.anInt1168 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "()Z")
	public boolean method852() {
		return this.anInt1175 < 0 || this.anInt1175 >= ((Class2_Sub18_Sub1) super.aClass2_Sub18_5).aByteArray36.length << 8;
	}
}
