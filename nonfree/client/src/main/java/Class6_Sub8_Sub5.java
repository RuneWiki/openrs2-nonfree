import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class6_Sub8_Sub5 extends Class6_Sub8 {

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
	public int anInt10802;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public int anInt10803;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
	public int anInt10804;

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
	public int anInt10806;

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
	public int anInt10807;

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
	private int anInt10808;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
	public int anInt10809;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
	private int anInt10814;

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
	private final int anInt10813;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	private final int anInt10805;

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "Z")
	private final boolean aBoolean745;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
	private int anInt10801;

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
	private int anInt10811;

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	private int anInt10810;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	public int anInt10812;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!fk;III)V")
	public Class6_Sub8_Sub5(@OriginalArg(0) Class6_Sub21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass6_Sub21_6 = arg0;
		this.anInt10813 = arg0.anInt2711;
		this.anInt10805 = arg0.anInt2710;
		this.aBoolean745 = arg0.aBoolean169;
		this.anInt10801 = arg1;
		this.anInt10811 = arg2;
		this.anInt10810 = arg3;
		this.anInt10812 = 0;
		this.method9140();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIIII)I")
	private int method9126(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10814 <= 0) {
				if (this.anInt10801 == 256 && (this.anInt10812 & 0xFF) == 0) {
					if (Static555.aBoolean676) {
						return Static687.method9157(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, arg3, arg2, this);
					}
					return Static687.method9142(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, arg3, arg2, this);
				}
				if (Static555.aBoolean676) {
					return Static687.method9154(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, arg3, arg2, this, this.anInt10801, arg4);
				}
				return Static687.method9155(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, arg3, arg2, this, this.anInt10801, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10814;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10814 += arg1;
			if (this.anInt10801 == 256 && (this.anInt10812 & 0xFF) == 0) {
				if (Static555.aBoolean676) {
					arg1 = Static687.method9163(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, this.anInt10809, this.anInt10803, local5, arg2, this);
				} else {
					arg1 = Static687.method9161(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, this.anInt10802, local5, arg2, this);
				}
			} else if (Static555.aBoolean676) {
				arg1 = Static687.method9159(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, this.anInt10809, this.anInt10803, local5, arg2, this, this.anInt10801, arg4);
			} else {
				arg1 = Static687.method9141(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, this.anInt10802, local5, arg2, this, this.anInt10801, arg4);
			}
			this.anInt10814 -= arg1;
			if (this.anInt10814 != 0) {
				return arg1;
			}
		} while (!this.method9160());
		return arg3;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "([IIIII)I")
	private int method9127(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt10814 <= 0) {
				if (this.anInt10801 == -256 && (this.anInt10812 & 0xFF) == 0) {
					if (Static555.aBoolean676) {
						return Static687.method9137(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, arg3, arg2, this);
					}
					return Static687.method9130(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, arg3, arg2, this);
				}
				if (Static555.aBoolean676) {
					return Static687.method9146(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, arg3, arg2, this, this.anInt10801, arg4);
				}
				return Static687.method9156(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, arg3, arg2, this, this.anInt10801, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt10814;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt10814 += arg1;
			if (this.anInt10801 == -256 && (this.anInt10812 & 0xFF) == 0) {
				if (Static555.aBoolean676) {
					arg1 = Static687.method9147(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, this.anInt10809, this.anInt10803, local5, arg2, this);
				} else {
					arg1 = Static687.method9158(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, this.anInt10802, local5, arg2, this);
				}
			} else if (Static555.aBoolean676) {
				arg1 = Static687.method9139(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10806, this.anInt10804, this.anInt10809, this.anInt10803, local5, arg2, this, this.anInt10801, arg4);
			} else {
				arg1 = Static687.method9133(((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29, arg0, this.anInt10812, arg1, this.anInt10807, this.anInt10802, local5, arg2, this, this.anInt10801, arg4);
			}
			this.anInt10814 -= arg1;
			if (this.anInt10814 != 0) {
				return arg1;
			}
		} while (!this.method9160());
		return arg3;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V")
	public synchronized void method9128() {
		this.anInt10801 = (this.anInt10801 ^ this.anInt10801 >> 31) + (this.anInt10801 >>> 31);
		this.anInt10801 = -this.anInt10801;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public synchronized void method9129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method9148(arg0, arg1, this.method9138());
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	public synchronized void method9131(@OriginalArg(0) int arg0) {
		this.anInt10808 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "()V")
	private void method9132() {
		if (this.anInt10814 == 0) {
			return;
		}
		if (this.anInt10811 == Integer.MIN_VALUE) {
			this.anInt10811 = 0;
		}
		this.anInt10814 = 0;
		this.method9140();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10811 == 0 && this.anInt10814 == 0) {
			this.method9119(arg2);
			return;
		}
		@Pc(13) Class6_Sub21_Sub1 local13 = (Class6_Sub21_Sub1) super.aClass6_Sub21_6;
		@Pc(18) int local18 = this.anInt10813 << 8;
		@Pc(23) int local23 = this.anInt10805 << 8;
		@Pc(29) int local29 = local13.aByteArray29.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt10808 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt10812 < 0) {
			if (this.anInt10801 <= 0) {
				this.method9132();
				this.method9174();
				return;
			}
			this.anInt10812 = 0;
		}
		if (this.anInt10812 >= local29) {
			if (this.anInt10801 >= 0) {
				this.method9132();
				this.method9174();
				return;
			}
			this.anInt10812 = local29 - 1;
		}
		if (this.anInt10808 >= 0) {
			if (this.anInt10808 > 0) {
				if (this.aBoolean745) {
					label130: {
						if (this.anInt10801 < 0) {
							local40 = this.method9127(arg0, arg1, local18, local44, local13.aByteArray29[this.anInt10813]);
							if (this.anInt10812 >= local18) {
								return;
							}
							this.anInt10812 = local18 + local18 - this.anInt10812 - 1;
							this.anInt10801 = -this.anInt10801;
							if (--this.anInt10808 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method9126(arg0, local40, local23, local44, local13.aByteArray29[this.anInt10805 - 1]);
							if (this.anInt10812 < local23) {
								return;
							}
							this.anInt10812 = local23 + local23 - this.anInt10812 - 1;
							this.anInt10801 = -this.anInt10801;
							if (--this.anInt10808 == 0) {
								break;
							}
							local40 = this.method9127(arg0, local40, local18, local44, local13.aByteArray29[this.anInt10813]);
							if (this.anInt10812 >= local18) {
								return;
							}
							this.anInt10812 = local18 + local18 - this.anInt10812 - 1;
							this.anInt10801 = -this.anInt10801;
						} while (--this.anInt10808 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt10801 < 0) {
						while (true) {
							local40 = this.method9127(arg0, local40, local18, local44, local13.aByteArray29[this.anInt10805 - 1]);
							if (this.anInt10812 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt10812 - 1) / local33;
							if (local416 >= this.anInt10808) {
								this.anInt10812 += local33 * this.anInt10808;
								this.anInt10808 = 0;
								break;
							}
							this.anInt10812 += local33 * local416;
							this.anInt10808 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method9126(arg0, local40, local23, local44, local13.aByteArray29[this.anInt10813]);
							if (this.anInt10812 < local23) {
								return;
							}
							local416 = (this.anInt10812 - local18) / local33;
							if (local416 >= this.anInt10808) {
								this.anInt10812 -= local33 * this.anInt10808;
								this.anInt10808 = 0;
								break;
							}
							this.anInt10812 -= local33 * local416;
							this.anInt10808 -= local416;
						}
					}
				}
			}
			if (this.anInt10801 < 0) {
				this.method9127(arg0, local40, 0, local44, 0);
				if (this.anInt10812 < 0) {
					this.anInt10812 = -1;
					this.method9132();
					this.method9174();
					return;
				}
			} else {
				this.method9126(arg0, local40, local29, local44, 0);
				if (this.anInt10812 >= local29) {
					this.anInt10812 = local29;
					this.method9132();
					this.method9174();
				}
			}
		} else if (this.aBoolean745) {
			if (this.anInt10801 < 0) {
				local40 = this.method9127(arg0, arg1, local18, local44, local13.aByteArray29[this.anInt10813]);
				if (this.anInt10812 >= local18) {
					return;
				}
				this.anInt10812 = local18 + local18 - this.anInt10812 - 1;
				this.anInt10801 = -this.anInt10801;
			}
			while (true) {
				local40 = this.method9126(arg0, local40, local23, local44, local13.aByteArray29[this.anInt10805 - 1]);
				if (this.anInt10812 < local23) {
					return;
				}
				this.anInt10812 = local23 + local23 - this.anInt10812 - 1;
				this.anInt10801 = -this.anInt10801;
				local40 = this.method9127(arg0, local40, local18, local44, local13.aByteArray29[this.anInt10813]);
				if (this.anInt10812 >= local18) {
					return;
				}
				this.anInt10812 = local18 + local18 - this.anInt10812 - 1;
				this.anInt10801 = -this.anInt10801;
			}
		} else if (this.anInt10801 < 0) {
			while (true) {
				local40 = this.method9127(arg0, local40, local18, local44, local13.aByteArray29[this.anInt10805 - 1]);
				if (this.anInt10812 >= local18) {
					return;
				}
				this.anInt10812 = local23 - (local23 - 1 - this.anInt10812) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method9126(arg0, local40, local23, local44, local13.aByteArray29[this.anInt10813]);
				if (this.anInt10812 < local23) {
					return;
				}
				this.anInt10812 = local18 + (this.anInt10812 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "()Z")
	public boolean method9134() {
		return this.anInt10814 != 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9119(@OriginalArg(0) int arg0) {
		if (this.anInt10814 > 0) {
			if (arg0 >= this.anInt10814) {
				if (this.anInt10811 == Integer.MIN_VALUE) {
					this.anInt10811 = 0;
					this.anInt10807 = this.anInt10806 = this.anInt10804 = 0;
					this.method9174();
					arg0 = this.anInt10814;
				}
				this.anInt10814 = 0;
				this.method9140();
			} else {
				this.anInt10807 += this.anInt10802 * arg0;
				this.anInt10806 += this.anInt10809 * arg0;
				this.anInt10804 += this.anInt10803 * arg0;
				this.anInt10814 -= arg0;
			}
		}
		@Pc(71) Class6_Sub21_Sub1 local71 = (Class6_Sub21_Sub1) super.aClass6_Sub21_6;
		@Pc(76) int local76 = this.anInt10813 << 8;
		@Pc(81) int local81 = this.anInt10805 << 8;
		@Pc(87) int local87 = local71.aByteArray29.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt10808 = 0;
		}
		if (this.anInt10812 < 0) {
			if (this.anInt10801 <= 0) {
				this.method9132();
				this.method9174();
				return;
			}
			this.anInt10812 = 0;
		}
		if (this.anInt10812 >= local87) {
			if (this.anInt10801 >= 0) {
				this.method9132();
				this.method9174();
				return;
			}
			this.anInt10812 = local87 - 1;
		}
		this.anInt10812 += this.anInt10801 * arg0;
		if (this.anInt10808 >= 0) {
			if (this.anInt10808 > 0) {
				if (this.aBoolean745) {
					label125: {
						if (this.anInt10801 < 0) {
							if (this.anInt10812 >= local76) {
								return;
							}
							this.anInt10812 = local76 + local76 - this.anInt10812 - 1;
							this.anInt10801 = -this.anInt10801;
							if (--this.anInt10808 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt10812 < local81) {
								return;
							}
							this.anInt10812 = local81 + local81 - this.anInt10812 - 1;
							this.anInt10801 = -this.anInt10801;
							if (--this.anInt10808 == 0) {
								break;
							}
							if (this.anInt10812 >= local76) {
								return;
							}
							this.anInt10812 = local76 + local76 - this.anInt10812 - 1;
							this.anInt10801 = -this.anInt10801;
						} while (--this.anInt10808 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt10801 < 0) {
						if (this.anInt10812 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt10812 - 1) / local91;
						if (local361 < this.anInt10808) {
							this.anInt10812 += local91 * local361;
							this.anInt10808 -= local361;
							return;
						}
						this.anInt10812 += local91 * this.anInt10808;
						this.anInt10808 = 0;
					} else if (this.anInt10812 >= local81) {
						local361 = (this.anInt10812 - local76) / local91;
						if (local361 < this.anInt10808) {
							this.anInt10812 -= local91 * local361;
							this.anInt10808 -= local361;
							return;
						}
						this.anInt10812 -= local91 * this.anInt10808;
						this.anInt10808 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt10801 < 0) {
				if (this.anInt10812 < 0) {
					this.anInt10812 = -1;
					this.method9132();
					this.method9174();
					return;
				}
			} else if (this.anInt10812 >= local87) {
				this.anInt10812 = local87;
				this.method9132();
				this.method9174();
			}
		} else if (this.aBoolean745) {
			if (this.anInt10801 < 0) {
				if (this.anInt10812 >= local76) {
					return;
				}
				this.anInt10812 = local76 + local76 - this.anInt10812 - 1;
				this.anInt10801 = -this.anInt10801;
			}
			while (this.anInt10812 >= local81) {
				this.anInt10812 = local81 + local81 - this.anInt10812 - 1;
				this.anInt10801 = -this.anInt10801;
				if (this.anInt10812 >= local76) {
					return;
				}
				this.anInt10812 = local76 + local76 - this.anInt10812 - 1;
				this.anInt10801 = -this.anInt10801;
			}
		} else if (this.anInt10801 < 0) {
			if (this.anInt10812 < local76) {
				this.anInt10812 = local81 - (local81 - 1 - this.anInt10812) % local91 - 1;
			}
		} else if (this.anInt10812 >= local81) {
			this.anInt10812 = local76 + (this.anInt10812 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "()I")
	public synchronized int method9135() {
		return this.anInt10811 == Integer.MIN_VALUE ? 0 : this.anInt10811;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
	public synchronized void method9136(@OriginalArg(0) int arg0) {
		this.method9149(arg0 << 6, this.method9138());
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "()I")
	public synchronized int method9138() {
		return this.anInt10810 < 0 ? -1 : this.anInt10810;
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "()V")
	private void method9140() {
		this.anInt10807 = this.anInt10811;
		this.anInt10806 = Static687.method9144(this.anInt10811, this.anInt10810);
		this.anInt10804 = Static687.method9150(this.anInt10811, this.anInt10810);
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V")
	public synchronized void method9143(@OriginalArg(0) int arg0) {
		if (this.anInt10801 < 0) {
			this.anInt10801 = -arg0;
		} else {
			this.anInt10801 = arg0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(I)V")
	public synchronized void method9145(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method9165();
			this.method9174();
		} else if (this.anInt10806 == 0 && this.anInt10804 == 0) {
			this.anInt10814 = 0;
			this.anInt10811 = 0;
			this.anInt10807 = 0;
			this.method9174();
		} else {
			@Pc(31) int local31 = -this.anInt10807;
			if (this.anInt10807 > local31) {
				local31 = this.anInt10807;
			}
			if (-this.anInt10806 > local31) {
				local31 = -this.anInt10806;
			}
			if (this.anInt10806 > local31) {
				local31 = this.anInt10806;
			}
			if (-this.anInt10804 > local31) {
				local31 = -this.anInt10804;
			}
			if (this.anInt10804 > local31) {
				local31 = this.anInt10804;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt10814 = arg0;
			this.anInt10811 = Integer.MIN_VALUE;
			this.anInt10802 = -this.anInt10807 / arg0;
			this.anInt10809 = -this.anInt10806 / arg0;
			this.anInt10803 = -this.anInt10804 / arg0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)V")
	public synchronized void method9148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method9149(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static687.method9144(arg1, arg2);
		@Pc(14) int local14 = Static687.method9150(arg1, arg2);
		if (this.anInt10806 == local10 && this.anInt10804 == local14) {
			this.anInt10814 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt10807;
		if (this.anInt10807 - arg1 > local31) {
			local31 = this.anInt10807 - arg1;
		}
		if (local10 - this.anInt10806 > local31) {
			local31 = local10 - this.anInt10806;
		}
		if (this.anInt10806 - local10 > local31) {
			local31 = this.anInt10806 - local10;
		}
		if (local14 - this.anInt10804 > local31) {
			local31 = local14 - this.anInt10804;
		}
		if (this.anInt10804 - local14 > local31) {
			local31 = this.anInt10804 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt10814 = arg0;
		this.anInt10811 = arg1;
		this.anInt10810 = arg2;
		this.anInt10802 = (arg1 - this.anInt10807) / arg0;
		this.anInt10809 = (local10 - this.anInt10806) / arg0;
		this.anInt10803 = (local14 - this.anInt10804) / arg0;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)V")
	private synchronized void method9149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10811 = arg0;
		this.anInt10810 = arg1;
		this.anInt10814 = 0;
		this.method9140();
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "(I)V")
	public synchronized void method9152(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt10812 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(I)V")
	public synchronized void method9153(@OriginalArg(0) int arg0) {
		this.method9149(this.method9135(), arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9121() {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9124() {
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "()Z")
	private boolean method9160() {
		@Pc(2) int local2 = this.anInt10811;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static687.method9144(local2, this.anInt10810);
			local8 = Static687.method9150(local2, this.anInt10810);
		}
		if (this.anInt10807 != local2 || this.anInt10806 != local10 || this.anInt10804 != local8) {
			if (this.anInt10807 < local2) {
				this.anInt10802 = 1;
				this.anInt10814 = local2 - this.anInt10807;
			} else if (this.anInt10807 > local2) {
				this.anInt10802 = -1;
				this.anInt10814 = this.anInt10807 - local2;
			} else {
				this.anInt10802 = 0;
			}
			if (this.anInt10806 < local10) {
				this.anInt10809 = 1;
				if (this.anInt10814 == 0 || this.anInt10814 > local10 - this.anInt10806) {
					this.anInt10814 = local10 - this.anInt10806;
				}
			} else if (this.anInt10806 > local10) {
				this.anInt10809 = -1;
				if (this.anInt10814 == 0 || this.anInt10814 > this.anInt10806 - local10) {
					this.anInt10814 = this.anInt10806 - local10;
				}
			} else {
				this.anInt10809 = 0;
			}
			if (this.anInt10804 < local8) {
				this.anInt10803 = 1;
				if (this.anInt10814 == 0 || this.anInt10814 > local8 - this.anInt10804) {
					this.anInt10814 = local8 - this.anInt10804;
				}
			} else if (this.anInt10804 > local8) {
				this.anInt10803 = -1;
				if (this.anInt10814 == 0 || this.anInt10814 > this.anInt10804 - local8) {
					this.anInt10814 = this.anInt10804 - local8;
				}
			} else {
				this.anInt10803 = 0;
			}
			return false;
		} else if (this.anInt10811 == Integer.MIN_VALUE) {
			this.anInt10811 = 0;
			this.anInt10807 = this.anInt10806 = this.anInt10804 = 0;
			this.method9174();
			return true;
		} else {
			this.method9140();
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "()I")
	public synchronized int method9162() {
		return this.anInt10801 < 0 ? -this.anInt10801 : this.anInt10801;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "()I")
	@Override
	public int method9123() {
		@Pc(6) int local6 = this.anInt10807 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt10808 == 0) {
			local6 -= local6 * this.anInt10812 / (((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29.length << 8);
		} else if (this.anInt10808 >= 0) {
			local6 -= local6 * this.anInt10813 / ((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "()Z")
	public boolean method9164() {
		return this.anInt10812 < 0 || this.anInt10812 >= ((Class6_Sub21_Sub1) super.aClass6_Sub21_6).aByteArray29.length << 8;
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(I)V")
	private synchronized void method9165() {
		this.method9149(0, this.method9138());
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "()I")
	@Override
	public int method9125() {
		return this.anInt10811 == 0 && this.anInt10814 == 0 ? 0 : 1;
	}
}
