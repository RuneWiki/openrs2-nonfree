import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class1_Sub19_Sub4 extends Class1_Sub19 {

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	public int anInt7649;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	public int anInt7650;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	public int anInt7654;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
	public int anInt7655;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
	private int anInt7657;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
	public int anInt7658;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
	private int anInt7660;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
	public int anInt7661;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
	private final int anInt7653;

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
	private final int anInt7652;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Z")
	private final boolean aBoolean500;

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
	private int anInt7656;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
	private int anInt7659;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
	private int anInt7662;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	public int anInt7651;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!mg;II)V")
	public Class1_Sub19_Sub4(@OriginalArg(0) Class1_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub12_5 = arg0;
		this.anInt7653 = arg0.anInt4816;
		this.anInt7652 = arg0.anInt4815;
		this.aBoolean500 = arg0.aBoolean307;
		this.anInt7656 = arg1;
		this.anInt7659 = arg2;
		this.anInt7662 = 8192;
		this.anInt7651 = 0;
		this.method5838();
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!mg;III)V")
	public Class1_Sub19_Sub4(@OriginalArg(0) Class1_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub12_5 = arg0;
		this.anInt7653 = arg0.anInt4816;
		this.anInt7652 = arg0.anInt4815;
		this.aBoolean500 = arg0.aBoolean307;
		this.anInt7656 = arg1;
		this.anInt7659 = arg2;
		this.anInt7662 = arg3;
		this.anInt7651 = 0;
		this.method5838();
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z")
	public boolean method5809() {
		return this.anInt7657 != 0;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	public synchronized void method5810(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method5842();
			this.method6178();
		} else if (this.anInt7650 == 0 && this.anInt7661 == 0) {
			this.anInt7657 = 0;
			this.anInt7659 = 0;
			this.anInt7658 = 0;
			this.method6178();
		} else {
			@Pc(31) int local31 = -this.anInt7658;
			if (this.anInt7658 > local31) {
				local31 = this.anInt7658;
			}
			if (-this.anInt7650 > local31) {
				local31 = -this.anInt7650;
			}
			if (this.anInt7650 > local31) {
				local31 = this.anInt7650;
			}
			if (-this.anInt7661 > local31) {
				local31 = -this.anInt7661;
			}
			if (this.anInt7661 > local31) {
				local31 = this.anInt7661;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt7657 = arg0;
			this.anInt7659 = Integer.MIN_VALUE;
			this.anInt7655 = -this.anInt7658 / arg0;
			this.anInt7649 = -this.anInt7650 / arg0;
			this.anInt7654 = -this.anInt7661 / arg0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "()I")
	public synchronized int method5811() {
		return this.anInt7659 == Integer.MIN_VALUE ? 0 : this.anInt7659;
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "()I")
	public synchronized int method5812() {
		return this.anInt7656 < 0 ? -this.anInt7656 : this.anInt7656;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "()Lclient!oa;")
	@Override
	public Class1_Sub19 method5807() {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
	public synchronized void method5814(@OriginalArg(0) int arg0) {
		if (this.anInt7656 < 0) {
			this.anInt7656 = -arg0;
		} else {
			this.anInt7656 = arg0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5802(@OriginalArg(0) int arg0) {
		if (this.anInt7657 > 0) {
			if (arg0 >= this.anInt7657) {
				if (this.anInt7659 == Integer.MIN_VALUE) {
					this.anInt7659 = 0;
					this.anInt7658 = this.anInt7650 = this.anInt7661 = 0;
					this.method6178();
					arg0 = this.anInt7657;
				}
				this.anInt7657 = 0;
				this.method5838();
			} else {
				this.anInt7658 += this.anInt7655 * arg0;
				this.anInt7650 += this.anInt7649 * arg0;
				this.anInt7661 += this.anInt7654 * arg0;
				this.anInt7657 -= arg0;
			}
		}
		@Pc(71) Class1_Sub12_Sub1 local71 = (Class1_Sub12_Sub1) super.aClass1_Sub12_5;
		@Pc(76) int local76 = this.anInt7653 << 8;
		@Pc(81) int local81 = this.anInt7652 << 8;
		@Pc(87) int local87 = local71.aByteArray54.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt7660 = 0;
		}
		if (this.anInt7651 < 0) {
			if (this.anInt7656 <= 0) {
				this.method5831();
				this.method6178();
				return;
			}
			this.anInt7651 = 0;
		}
		if (this.anInt7651 >= local87) {
			if (this.anInt7656 >= 0) {
				this.method5831();
				this.method6178();
				return;
			}
			this.anInt7651 = local87 - 1;
		}
		this.anInt7651 += this.anInt7656 * arg0;
		if (this.anInt7660 >= 0) {
			if (this.anInt7660 > 0) {
				if (this.aBoolean500) {
					label125: {
						if (this.anInt7656 < 0) {
							if (this.anInt7651 >= local76) {
								return;
							}
							this.anInt7651 = local76 + local76 - this.anInt7651 - 1;
							this.anInt7656 = -this.anInt7656;
							if (--this.anInt7660 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt7651 < local81) {
								return;
							}
							this.anInt7651 = local81 + local81 - this.anInt7651 - 1;
							this.anInt7656 = -this.anInt7656;
							if (--this.anInt7660 == 0) {
								break;
							}
							if (this.anInt7651 >= local76) {
								return;
							}
							this.anInt7651 = local76 + local76 - this.anInt7651 - 1;
							this.anInt7656 = -this.anInt7656;
						} while (--this.anInt7660 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt7656 < 0) {
						if (this.anInt7651 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt7651 - 1) / local91;
						if (local361 < this.anInt7660) {
							this.anInt7651 += local91 * local361;
							this.anInt7660 -= local361;
							return;
						}
						this.anInt7651 += local91 * this.anInt7660;
						this.anInt7660 = 0;
					} else if (this.anInt7651 >= local81) {
						local361 = (this.anInt7651 - local76) / local91;
						if (local361 < this.anInt7660) {
							this.anInt7651 -= local91 * local361;
							this.anInt7660 -= local361;
							return;
						}
						this.anInt7651 -= local91 * this.anInt7660;
						this.anInt7660 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt7656 < 0) {
				if (this.anInt7651 < 0) {
					this.anInt7651 = -1;
					this.method5831();
					this.method6178();
					return;
				}
			} else if (this.anInt7651 >= local87) {
				this.anInt7651 = local87;
				this.method5831();
				this.method6178();
			}
		} else if (this.aBoolean500) {
			if (this.anInt7656 < 0) {
				if (this.anInt7651 >= local76) {
					return;
				}
				this.anInt7651 = local76 + local76 - this.anInt7651 - 1;
				this.anInt7656 = -this.anInt7656;
			}
			while (this.anInt7651 >= local81) {
				this.anInt7651 = local81 + local81 - this.anInt7651 - 1;
				this.anInt7656 = -this.anInt7656;
				if (this.anInt7651 >= local76) {
					return;
				}
				this.anInt7651 = local76 + local76 - this.anInt7651 - 1;
				this.anInt7656 = -this.anInt7656;
			}
		} else if (this.anInt7656 < 0) {
			if (this.anInt7651 < local76) {
				this.anInt7651 = local81 - (local81 - 1 - this.anInt7651) % local91 - 1;
			}
		} else if (this.anInt7651 >= local81) {
			this.anInt7651 = local76 + (this.anInt7651 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "()I")
	@Override
	public int method5806() {
		@Pc(6) int local6 = this.anInt7658 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt7660 == 0) {
			local6 -= local6 * this.anInt7651 / (((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54.length << 8);
		} else if (this.anInt7660 >= 0) {
			local6 -= local6 * this.anInt7653 / ((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "()I")
	@Override
	public int method5808() {
		return this.anInt7659 == 0 && this.anInt7657 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7659 == 0 && this.anInt7657 == 0) {
			this.method5802(arg2);
			return;
		}
		@Pc(13) Class1_Sub12_Sub1 local13 = (Class1_Sub12_Sub1) super.aClass1_Sub12_5;
		@Pc(18) int local18 = this.anInt7653 << 8;
		@Pc(23) int local23 = this.anInt7652 << 8;
		@Pc(29) int local29 = local13.aByteArray54.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt7660 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt7651 < 0) {
			if (this.anInt7656 <= 0) {
				this.method5831();
				this.method6178();
				return;
			}
			this.anInt7651 = 0;
		}
		if (this.anInt7651 >= local29) {
			if (this.anInt7656 >= 0) {
				this.method5831();
				this.method6178();
				return;
			}
			this.anInt7651 = local29 - 1;
		}
		if (this.anInt7660 >= 0) {
			if (this.anInt7660 > 0) {
				if (this.aBoolean500) {
					label130: {
						if (this.anInt7656 < 0) {
							local40 = this.method5848(arg0, arg1, local18, local44, local13.aByteArray54[this.anInt7653]);
							if (this.anInt7651 >= local18) {
								return;
							}
							this.anInt7651 = local18 + local18 - this.anInt7651 - 1;
							this.anInt7656 = -this.anInt7656;
							if (--this.anInt7660 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method5844(arg0, local40, local23, local44, local13.aByteArray54[this.anInt7652 - 1]);
							if (this.anInt7651 < local23) {
								return;
							}
							this.anInt7651 = local23 + local23 - this.anInt7651 - 1;
							this.anInt7656 = -this.anInt7656;
							if (--this.anInt7660 == 0) {
								break;
							}
							local40 = this.method5848(arg0, local40, local18, local44, local13.aByteArray54[this.anInt7653]);
							if (this.anInt7651 >= local18) {
								return;
							}
							this.anInt7651 = local18 + local18 - this.anInt7651 - 1;
							this.anInt7656 = -this.anInt7656;
						} while (--this.anInt7660 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt7656 < 0) {
						while (true) {
							local40 = this.method5848(arg0, local40, local18, local44, local13.aByteArray54[this.anInt7652 - 1]);
							if (this.anInt7651 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt7651 - 1) / local33;
							if (local416 >= this.anInt7660) {
								this.anInt7651 += local33 * this.anInt7660;
								this.anInt7660 = 0;
								break;
							}
							this.anInt7651 += local33 * local416;
							this.anInt7660 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method5844(arg0, local40, local23, local44, local13.aByteArray54[this.anInt7653]);
							if (this.anInt7651 < local23) {
								return;
							}
							local416 = (this.anInt7651 - local18) / local33;
							if (local416 >= this.anInt7660) {
								this.anInt7651 -= local33 * this.anInt7660;
								this.anInt7660 = 0;
								break;
							}
							this.anInt7651 -= local33 * local416;
							this.anInt7660 -= local416;
						}
					}
				}
			}
			if (this.anInt7656 < 0) {
				this.method5848(arg0, local40, 0, local44, 0);
				if (this.anInt7651 < 0) {
					this.anInt7651 = -1;
					this.method5831();
					this.method6178();
					return;
				}
			} else {
				this.method5844(arg0, local40, local29, local44, 0);
				if (this.anInt7651 >= local29) {
					this.anInt7651 = local29;
					this.method5831();
					this.method6178();
				}
			}
		} else if (this.aBoolean500) {
			if (this.anInt7656 < 0) {
				local40 = this.method5848(arg0, arg1, local18, local44, local13.aByteArray54[this.anInt7653]);
				if (this.anInt7651 >= local18) {
					return;
				}
				this.anInt7651 = local18 + local18 - this.anInt7651 - 1;
				this.anInt7656 = -this.anInt7656;
			}
			while (true) {
				local40 = this.method5844(arg0, local40, local23, local44, local13.aByteArray54[this.anInt7652 - 1]);
				if (this.anInt7651 < local23) {
					return;
				}
				this.anInt7651 = local23 + local23 - this.anInt7651 - 1;
				this.anInt7656 = -this.anInt7656;
				local40 = this.method5848(arg0, local40, local18, local44, local13.aByteArray54[this.anInt7653]);
				if (this.anInt7651 >= local18) {
					return;
				}
				this.anInt7651 = local18 + local18 - this.anInt7651 - 1;
				this.anInt7656 = -this.anInt7656;
			}
		} else if (this.anInt7656 < 0) {
			while (true) {
				local40 = this.method5848(arg0, local40, local18, local44, local13.aByteArray54[this.anInt7652 - 1]);
				if (this.anInt7651 >= local18) {
					return;
				}
				this.anInt7651 = local23 - (local23 - 1 - this.anInt7651) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method5844(arg0, local40, local23, local44, local13.aByteArray54[this.anInt7653]);
				if (this.anInt7651 < local23) {
					return;
				}
				this.anInt7651 = local18 + (this.anInt7651 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "()Z")
	public boolean method5823() {
		return this.anInt7651 < 0 || this.anInt7651 >= ((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54.length << 8;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)V")
	public synchronized void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method5836(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static468.method5840(arg1, arg2);
		@Pc(14) int local14 = Static468.method5816(arg1, arg2);
		if (this.anInt7650 == local10 && this.anInt7661 == local14) {
			this.anInt7657 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt7658;
		if (this.anInt7658 - arg1 > local31) {
			local31 = this.anInt7658 - arg1;
		}
		if (local10 - this.anInt7650 > local31) {
			local31 = local10 - this.anInt7650;
		}
		if (this.anInt7650 - local10 > local31) {
			local31 = this.anInt7650 - local10;
		}
		if (local14 - this.anInt7661 > local31) {
			local31 = local14 - this.anInt7661;
		}
		if (this.anInt7661 - local14 > local31) {
			local31 = this.anInt7661 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt7657 = arg0;
		this.anInt7659 = arg1;
		this.anInt7662 = arg2;
		this.anInt7655 = (arg1 - this.anInt7658) / arg0;
		this.anInt7649 = (local10 - this.anInt7650) / arg0;
		this.anInt7654 = (local14 - this.anInt7661) / arg0;
	}

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "()Z")
	private boolean method5826() {
		@Pc(2) int local2 = this.anInt7659;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static468.method5840(local2, this.anInt7662);
			local8 = Static468.method5816(local2, this.anInt7662);
		}
		if (this.anInt7658 != local2 || this.anInt7650 != local10 || this.anInt7661 != local8) {
			if (this.anInt7658 < local2) {
				this.anInt7655 = 1;
				this.anInt7657 = local2 - this.anInt7658;
			} else if (this.anInt7658 > local2) {
				this.anInt7655 = -1;
				this.anInt7657 = this.anInt7658 - local2;
			} else {
				this.anInt7655 = 0;
			}
			if (this.anInt7650 < local10) {
				this.anInt7649 = 1;
				if (this.anInt7657 == 0 || this.anInt7657 > local10 - this.anInt7650) {
					this.anInt7657 = local10 - this.anInt7650;
				}
			} else if (this.anInt7650 > local10) {
				this.anInt7649 = -1;
				if (this.anInt7657 == 0 || this.anInt7657 > this.anInt7650 - local10) {
					this.anInt7657 = this.anInt7650 - local10;
				}
			} else {
				this.anInt7649 = 0;
			}
			if (this.anInt7661 < local8) {
				this.anInt7654 = 1;
				if (this.anInt7657 == 0 || this.anInt7657 > local8 - this.anInt7661) {
					this.anInt7657 = local8 - this.anInt7661;
				}
			} else if (this.anInt7661 > local8) {
				this.anInt7654 = -1;
				if (this.anInt7657 == 0 || this.anInt7657 > this.anInt7661 - local8) {
					this.anInt7657 = this.anInt7661 - local8;
				}
			} else {
				this.anInt7654 = 0;
			}
			return false;
		} else if (this.anInt7659 == Integer.MIN_VALUE) {
			this.anInt7659 = 0;
			this.anInt7658 = this.anInt7650 = this.anInt7661 = 0;
			this.method6178();
			return true;
		} else {
			this.method5838();
			return false;
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)V")
	public synchronized void method5827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method5824(arg0, arg1, this.method5846());
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)V")
	public synchronized void method5828(@OriginalArg(0) int arg0) {
		this.anInt7660 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "()V")
	private void method5831() {
		if (this.anInt7657 == 0) {
			return;
		}
		if (this.anInt7659 == Integer.MIN_VALUE) {
			this.anInt7659 = 0;
		}
		this.anInt7657 = 0;
		this.method5838();
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
	public synchronized void method5832(@OriginalArg(0) int arg0) {
		this.method5836(arg0 << 6, this.method5846());
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(II)V")
	private synchronized void method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7659 = arg0;
		this.anInt7662 = arg1;
		this.anInt7657 = 0;
		this.method5838();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "()Lclient!oa;")
	@Override
	public Class1_Sub19 method5805() {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	public synchronized void method5837() {
		this.anInt7656 = (this.anInt7656 ^ this.anInt7656 >> 31) + (this.anInt7656 >>> 31);
		this.anInt7656 = -this.anInt7656;
	}

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "()V")
	private void method5838() {
		this.anInt7658 = this.anInt7659;
		this.anInt7650 = Static468.method5840(this.anInt7659, this.anInt7662);
		this.anInt7661 = Static468.method5816(this.anInt7659, this.anInt7662);
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	public synchronized void method5841(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt7651 = arg0;
	}

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "(I)V")
	private synchronized void method5842() {
		this.method5836(0, this.method5846());
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([IIIII)I")
	private int method5844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7657 <= 0) {
				if (this.anInt7656 == 256 && (this.anInt7651 & 0xFF) == 0) {
					if (Static344.aBoolean402) {
						return Static468.method5819(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, arg3, arg2, this);
					}
					return Static468.method5830(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, arg3, arg2, this);
				}
				if (Static344.aBoolean402) {
					return Static468.method5820(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, arg3, arg2, this, this.anInt7656, arg4);
				}
				return Static468.method5839(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, arg3, arg2, this, this.anInt7656, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7657;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7657 += arg1;
			if (this.anInt7656 == 256 && (this.anInt7651 & 0xFF) == 0) {
				if (Static344.aBoolean402) {
					arg1 = Static468.method5843(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, this.anInt7649, this.anInt7654, local5, arg2, this);
				} else {
					arg1 = Static468.method5835(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, this.anInt7655, local5, arg2, this);
				}
			} else if (Static344.aBoolean402) {
				arg1 = Static468.method5829(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, this.anInt7649, this.anInt7654, local5, arg2, this, this.anInt7656, arg4);
			} else {
				arg1 = Static468.method5813(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, this.anInt7655, local5, arg2, this, this.anInt7656, arg4);
			}
			this.anInt7657 -= arg1;
			if (this.anInt7657 != 0) {
				return arg1;
			}
		} while (!this.method5826());
		return arg3;
	}

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "()I")
	public synchronized int method5846() {
		return this.anInt7662 < 0 ? -1 : this.anInt7662;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "([IIIII)I")
	private int method5848(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt7657 <= 0) {
				if (this.anInt7656 == -256 && (this.anInt7651 & 0xFF) == 0) {
					if (Static344.aBoolean402) {
						return Static468.method5818(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, arg3, arg2, this);
					}
					return Static468.method5821(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, arg3, arg2, this);
				}
				if (Static344.aBoolean402) {
					return Static468.method5834(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, arg3, arg2, this, this.anInt7656, arg4);
				}
				return Static468.method5822(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, arg3, arg2, this, this.anInt7656, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt7657;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt7657 += arg1;
			if (this.anInt7656 == -256 && (this.anInt7651 & 0xFF) == 0) {
				if (Static344.aBoolean402) {
					arg1 = Static468.method5847(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, this.anInt7649, this.anInt7654, local5, arg2, this);
				} else {
					arg1 = Static468.method5817(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, this.anInt7655, local5, arg2, this);
				}
			} else if (Static344.aBoolean402) {
				arg1 = Static468.method5815(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7650, this.anInt7661, this.anInt7649, this.anInt7654, local5, arg2, this, this.anInt7656, arg4);
			} else {
				arg1 = Static468.method5833(((Class1_Sub12_Sub1) super.aClass1_Sub12_5).aByteArray54, arg0, this.anInt7651, arg1, this.anInt7658, this.anInt7655, local5, arg2, this, this.anInt7656, arg4);
			}
			this.anInt7657 -= arg1;
			if (this.anInt7657 != 0) {
				return arg1;
			}
		} while (!this.method5826());
		return arg3;
	}
}
