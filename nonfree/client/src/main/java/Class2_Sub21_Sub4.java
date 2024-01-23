import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub21_Sub4 extends Class2_Sub21 {

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	private int anInt4781;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	public int anInt4784;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
	public int anInt4785;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	private int anInt4786;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt4789;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
	public int anInt4791;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public int anInt4792;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
	public int anInt4793;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt4788;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	private int anInt4787;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "Z")
	private boolean aBoolean207;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	private int anInt4790;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	private int anInt4782;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	private int anInt4783;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	public int anInt4794;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!kh;II)V")
	public Class2_Sub21_Sub4(@OriginalArg(0) Class2_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub22_5 = arg0;
		this.anInt4788 = arg0.anInt2519;
		this.anInt4787 = arg0.anInt2517;
		this.aBoolean207 = arg0.aBoolean108;
		this.anInt4790 = arg1;
		this.anInt4782 = arg2;
		this.anInt4783 = 8192;
		this.anInt4794 = 0;
		this.method3867();
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!kh;III)V")
	public Class2_Sub21_Sub4(@OriginalArg(0) Class2_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub22_5 = arg0;
		this.anInt4788 = arg0.anInt2519;
		this.anInt4787 = arg0.anInt2517;
		this.aBoolean207 = arg0.aBoolean108;
		this.anInt4790 = arg1;
		this.anInt4782 = arg2;
		this.anInt4783 = arg3;
		this.anInt4794 = 0;
		this.method3867();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4782 == 0 && this.anInt4781 == 0) {
			this.method3845(arg2);
			return;
		}
		@Pc(13) Class2_Sub22_Sub1 local13 = (Class2_Sub22_Sub1) super.aClass2_Sub22_5;
		@Pc(18) int local18 = this.anInt4788 << 8;
		@Pc(23) int local23 = this.anInt4787 << 8;
		@Pc(29) int local29 = local13.aByteArray39.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt4786 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt4794 < 0) {
			if (this.anInt4790 <= 0) {
				this.method3846();
				this.method3986();
				return;
			}
			this.anInt4794 = 0;
		}
		if (this.anInt4794 >= local29) {
			if (this.anInt4790 >= 0) {
				this.method3846();
				this.method3986();
				return;
			}
			this.anInt4794 = local29 - 1;
		}
		if (this.anInt4786 >= 0) {
			if (this.anInt4786 > 0) {
				if (this.aBoolean207) {
					label130: {
						if (this.anInt4790 < 0) {
							local40 = this.method3880(arg0, arg1, local18, local44, local13.aByteArray39[this.anInt4788]);
							if (this.anInt4794 >= local18) {
								return;
							}
							this.anInt4794 = local18 + local18 - this.anInt4794 - 1;
							this.anInt4790 = -this.anInt4790;
							if (--this.anInt4786 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method3879(arg0, local40, local23, local44, local13.aByteArray39[this.anInt4787 - 1]);
							if (this.anInt4794 < local23) {
								return;
							}
							this.anInt4794 = local23 + local23 - this.anInt4794 - 1;
							this.anInt4790 = -this.anInt4790;
							if (--this.anInt4786 == 0) {
								break;
							}
							local40 = this.method3880(arg0, local40, local18, local44, local13.aByteArray39[this.anInt4788]);
							if (this.anInt4794 >= local18) {
								return;
							}
							this.anInt4794 = local18 + local18 - this.anInt4794 - 1;
							this.anInt4790 = -this.anInt4790;
						} while (--this.anInt4786 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt4790 < 0) {
						while (true) {
							local40 = this.method3880(arg0, local40, local18, local44, local13.aByteArray39[this.anInt4787 - 1]);
							if (this.anInt4794 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt4794 - 1) / local33;
							if (local416 >= this.anInt4786) {
								this.anInt4794 += local33 * this.anInt4786;
								this.anInt4786 = 0;
								break;
							}
							this.anInt4794 += local33 * local416;
							this.anInt4786 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method3879(arg0, local40, local23, local44, local13.aByteArray39[this.anInt4788]);
							if (this.anInt4794 < local23) {
								return;
							}
							local416 = (this.anInt4794 - local18) / local33;
							if (local416 >= this.anInt4786) {
								this.anInt4794 -= local33 * this.anInt4786;
								this.anInt4786 = 0;
								break;
							}
							this.anInt4794 -= local33 * local416;
							this.anInt4786 -= local416;
						}
					}
				}
			}
			if (this.anInt4790 < 0) {
				this.method3880(arg0, local40, 0, local44, 0);
				if (this.anInt4794 < 0) {
					this.anInt4794 = -1;
					this.method3846();
					this.method3986();
					return;
				}
			} else {
				this.method3879(arg0, local40, local29, local44, 0);
				if (this.anInt4794 >= local29) {
					this.anInt4794 = local29;
					this.method3846();
					this.method3986();
				}
			}
		} else if (this.aBoolean207) {
			if (this.anInt4790 < 0) {
				local40 = this.method3880(arg0, arg1, local18, local44, local13.aByteArray39[this.anInt4788]);
				if (this.anInt4794 >= local18) {
					return;
				}
				this.anInt4794 = local18 + local18 - this.anInt4794 - 1;
				this.anInt4790 = -this.anInt4790;
			}
			while (true) {
				local40 = this.method3879(arg0, local40, local23, local44, local13.aByteArray39[this.anInt4787 - 1]);
				if (this.anInt4794 < local23) {
					return;
				}
				this.anInt4794 = local23 + local23 - this.anInt4794 - 1;
				this.anInt4790 = -this.anInt4790;
				local40 = this.method3880(arg0, local40, local18, local44, local13.aByteArray39[this.anInt4788]);
				if (this.anInt4794 >= local18) {
					return;
				}
				this.anInt4794 = local18 + local18 - this.anInt4794 - 1;
				this.anInt4790 = -this.anInt4790;
			}
		} else if (this.anInt4790 < 0) {
			while (true) {
				local40 = this.method3880(arg0, local40, local18, local44, local13.aByteArray39[this.anInt4787 - 1]);
				if (this.anInt4794 >= local18) {
					return;
				}
				this.anInt4794 = local23 - (local23 - 1 - this.anInt4794) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method3879(arg0, local40, local23, local44, local13.aByteArray39[this.anInt4788]);
				if (this.anInt4794 < local23) {
					return;
				}
				this.anInt4794 = local18 + (this.anInt4794 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()V")
	private void method3846() {
		if (this.anInt4781 == 0) {
			return;
		}
		if (this.anInt4782 == Integer.MIN_VALUE) {
			this.anInt4782 = 0;
		}
		this.anInt4781 = 0;
		this.method3867();
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	private synchronized void method3848() {
		this.method3873(0, this.method3855());
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
	public synchronized void method3849(@OriginalArg(0) int arg0) {
		this.anInt4786 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()Z")
	private boolean method3850() {
		@Pc(2) int local2 = this.anInt4782;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static237.method3856(local2, this.anInt4783);
			local8 = Static237.method3851(local2, this.anInt4783);
		}
		if (this.anInt4791 != local2 || this.anInt4789 != local10 || this.anInt4793 != local8) {
			if (this.anInt4791 < local2) {
				this.anInt4785 = 1;
				this.anInt4781 = local2 - this.anInt4791;
			} else if (this.anInt4791 > local2) {
				this.anInt4785 = -1;
				this.anInt4781 = this.anInt4791 - local2;
			} else {
				this.anInt4785 = 0;
			}
			if (this.anInt4789 < local10) {
				this.anInt4792 = 1;
				if (this.anInt4781 == 0 || this.anInt4781 > local10 - this.anInt4789) {
					this.anInt4781 = local10 - this.anInt4789;
				}
			} else if (this.anInt4789 > local10) {
				this.anInt4792 = -1;
				if (this.anInt4781 == 0 || this.anInt4781 > this.anInt4789 - local10) {
					this.anInt4781 = this.anInt4789 - local10;
				}
			} else {
				this.anInt4792 = 0;
			}
			if (this.anInt4793 < local8) {
				this.anInt4784 = 1;
				if (this.anInt4781 == 0 || this.anInt4781 > local8 - this.anInt4793) {
					this.anInt4781 = local8 - this.anInt4793;
				}
			} else if (this.anInt4793 > local8) {
				this.anInt4784 = -1;
				if (this.anInt4781 == 0 || this.anInt4781 > this.anInt4793 - local8) {
					this.anInt4781 = this.anInt4793 - local8;
				}
			} else {
				this.anInt4784 = 0;
			}
			return false;
		} else if (this.anInt4782 == Integer.MIN_VALUE) {
			this.anInt4782 = 0;
			this.anInt4791 = this.anInt4789 = this.anInt4793 = 0;
			this.method3986();
			return true;
		} else {
			this.method3867();
			return false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	public synchronized void method3853(@OriginalArg(0) int arg0) {
		this.method3873(arg0 << 6, this.method3855());
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()Z")
	public boolean method3854() {
		return this.anInt4794 < 0 || this.anInt4794 >= ((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39.length << 8;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "()I")
	public synchronized int method3855() {
		return this.anInt4783 < 0 ? -1 : this.anInt4783;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	@Override
	public int method3843() {
		return this.anInt4782 == 0 && this.anInt4781 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public synchronized void method3858() {
		this.anInt4790 = (this.anInt4790 ^ this.anInt4790 >> 31) + (this.anInt4790 >>> 31);
		this.anInt4790 = -this.anInt4790;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lclient!lc;")
	@Override
	public Class2_Sub21 method3840() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "()I")
	public synchronized int method3861() {
		return this.anInt4790 < 0 ? -this.anInt4790 : this.anInt4790;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "()I")
	public synchronized int method3864() {
		return this.anInt4782 == Integer.MIN_VALUE ? 0 : this.anInt4782;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
	public synchronized void method3865(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt4794 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public synchronized void method3866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method3873(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static237.method3856(arg1, arg2);
		@Pc(14) int local14 = Static237.method3851(arg1, arg2);
		if (this.anInt4789 == local10 && this.anInt4793 == local14) {
			this.anInt4781 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt4791;
		if (this.anInt4791 - arg1 > local31) {
			local31 = this.anInt4791 - arg1;
		}
		if (local10 - this.anInt4789 > local31) {
			local31 = local10 - this.anInt4789;
		}
		if (this.anInt4789 - local10 > local31) {
			local31 = this.anInt4789 - local10;
		}
		if (local14 - this.anInt4793 > local31) {
			local31 = local14 - this.anInt4793;
		}
		if (this.anInt4793 - local14 > local31) {
			local31 = this.anInt4793 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt4781 = arg0;
		this.anInt4782 = arg1;
		this.anInt4783 = arg2;
		this.anInt4785 = (arg1 - this.anInt4791) / arg0;
		this.anInt4792 = (local10 - this.anInt4789) / arg0;
		this.anInt4784 = (local14 - this.anInt4793) / arg0;
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "()V")
	private void method3867() {
		this.anInt4791 = this.anInt4782;
		this.anInt4789 = Static237.method3856(this.anInt4782, this.anInt4783);
		this.anInt4793 = Static237.method3851(this.anInt4782, this.anInt4783);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()Lclient!lc;")
	@Override
	public Class2_Sub21 method3842() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
	private synchronized void method3873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4782 = arg0;
		this.anInt4783 = arg1;
		this.anInt4781 = 0;
		this.method3867();
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3845(@OriginalArg(0) int arg0) {
		if (this.anInt4781 > 0) {
			if (arg0 >= this.anInt4781) {
				if (this.anInt4782 == Integer.MIN_VALUE) {
					this.anInt4782 = 0;
					this.anInt4791 = this.anInt4789 = this.anInt4793 = 0;
					this.method3986();
					arg0 = this.anInt4781;
				}
				this.anInt4781 = 0;
				this.method3867();
			} else {
				this.anInt4791 += this.anInt4785 * arg0;
				this.anInt4789 += this.anInt4792 * arg0;
				this.anInt4793 += this.anInt4784 * arg0;
				this.anInt4781 -= arg0;
			}
		}
		@Pc(71) Class2_Sub22_Sub1 local71 = (Class2_Sub22_Sub1) super.aClass2_Sub22_5;
		@Pc(76) int local76 = this.anInt4788 << 8;
		@Pc(81) int local81 = this.anInt4787 << 8;
		@Pc(87) int local87 = local71.aByteArray39.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt4786 = 0;
		}
		if (this.anInt4794 < 0) {
			if (this.anInt4790 <= 0) {
				this.method3846();
				this.method3986();
				return;
			}
			this.anInt4794 = 0;
		}
		if (this.anInt4794 >= local87) {
			if (this.anInt4790 >= 0) {
				this.method3846();
				this.method3986();
				return;
			}
			this.anInt4794 = local87 - 1;
		}
		this.anInt4794 += this.anInt4790 * arg0;
		if (this.anInt4786 >= 0) {
			if (this.anInt4786 > 0) {
				if (this.aBoolean207) {
					label125: {
						if (this.anInt4790 < 0) {
							if (this.anInt4794 >= local76) {
								return;
							}
							this.anInt4794 = local76 + local76 - this.anInt4794 - 1;
							this.anInt4790 = -this.anInt4790;
							if (--this.anInt4786 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt4794 < local81) {
								return;
							}
							this.anInt4794 = local81 + local81 - this.anInt4794 - 1;
							this.anInt4790 = -this.anInt4790;
							if (--this.anInt4786 == 0) {
								break;
							}
							if (this.anInt4794 >= local76) {
								return;
							}
							this.anInt4794 = local76 + local76 - this.anInt4794 - 1;
							this.anInt4790 = -this.anInt4790;
						} while (--this.anInt4786 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt4790 < 0) {
						if (this.anInt4794 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt4794 - 1) / local91;
						if (local361 < this.anInt4786) {
							this.anInt4794 += local91 * local361;
							this.anInt4786 -= local361;
							return;
						}
						this.anInt4794 += local91 * this.anInt4786;
						this.anInt4786 = 0;
					} else if (this.anInt4794 >= local81) {
						local361 = (this.anInt4794 - local76) / local91;
						if (local361 < this.anInt4786) {
							this.anInt4794 -= local91 * local361;
							this.anInt4786 -= local361;
							return;
						}
						this.anInt4794 -= local91 * this.anInt4786;
						this.anInt4786 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt4790 < 0) {
				if (this.anInt4794 < 0) {
					this.anInt4794 = -1;
					this.method3846();
					this.method3986();
					return;
				}
			} else if (this.anInt4794 >= local87) {
				this.anInt4794 = local87;
				this.method3846();
				this.method3986();
			}
		} else if (this.aBoolean207) {
			if (this.anInt4790 < 0) {
				if (this.anInt4794 >= local76) {
					return;
				}
				this.anInt4794 = local76 + local76 - this.anInt4794 - 1;
				this.anInt4790 = -this.anInt4790;
			}
			while (this.anInt4794 >= local81) {
				this.anInt4794 = local81 + local81 - this.anInt4794 - 1;
				this.anInt4790 = -this.anInt4790;
				if (this.anInt4794 >= local76) {
					return;
				}
				this.anInt4794 = local76 + local76 - this.anInt4794 - 1;
				this.anInt4790 = -this.anInt4790;
			}
		} else if (this.anInt4790 < 0) {
			if (this.anInt4794 < local76) {
				this.anInt4794 = local81 - (local81 - 1 - this.anInt4794) % local91 - 1;
			}
		} else if (this.anInt4794 >= local81) {
			this.anInt4794 = local76 + (this.anInt4794 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V")
	public synchronized void method3878(@OriginalArg(0) int arg0) {
		if (this.anInt4790 < 0) {
			this.anInt4790 = -arg0;
		} else {
			this.anInt4790 = arg0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)I")
	private int method3879(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4781 <= 0) {
				if (this.anInt4790 == 256 && (this.anInt4794 & 0xFF) == 0) {
					if (Static40.aBoolean26) {
						return Static237.method3863(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, arg3, arg2, this);
					}
					return Static237.method3875(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, arg3, arg2, this);
				}
				if (Static40.aBoolean26) {
					return Static237.method3876(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, arg3, arg2, this, this.anInt4790, arg4);
				}
				return Static237.method3852(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, arg3, arg2, this, this.anInt4790, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4781;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4781 += arg1;
			if (this.anInt4790 == 256 && (this.anInt4794 & 0xFF) == 0) {
				if (Static40.aBoolean26) {
					arg1 = Static237.method3857(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, this.anInt4792, this.anInt4784, local5, arg2, this);
				} else {
					arg1 = Static237.method3860(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, this.anInt4785, local5, arg2, this);
				}
			} else if (Static40.aBoolean26) {
				arg1 = Static237.method3859(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, this.anInt4792, this.anInt4784, local5, arg2, this, this.anInt4790, arg4);
			} else {
				arg1 = Static237.method3868(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, this.anInt4785, local5, arg2, this, this.anInt4790, arg4);
			}
			this.anInt4781 -= arg1;
			if (this.anInt4781 != 0) {
				return arg1;
			}
		} while (!this.method3850());
		return arg3;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([IIIII)I")
	private int method3880(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt4781 <= 0) {
				if (this.anInt4790 == -256 && (this.anInt4794 & 0xFF) == 0) {
					if (Static40.aBoolean26) {
						return Static237.method3874(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, arg3, arg2, this);
					}
					return Static237.method3847(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, arg3, arg2, this);
				}
				if (Static40.aBoolean26) {
					return Static237.method3870(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, arg3, arg2, this, this.anInt4790, arg4);
				}
				return Static237.method3869(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, arg3, arg2, this, this.anInt4790, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt4781;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt4781 += arg1;
			if (this.anInt4790 == -256 && (this.anInt4794 & 0xFF) == 0) {
				if (Static40.aBoolean26) {
					arg1 = Static237.method3871(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, this.anInt4792, this.anInt4784, local5, arg2, this);
				} else {
					arg1 = Static237.method3881(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, this.anInt4785, local5, arg2, this);
				}
			} else if (Static40.aBoolean26) {
				arg1 = Static237.method3877(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4789, this.anInt4793, this.anInt4792, this.anInt4784, local5, arg2, this, this.anInt4790, arg4);
			} else {
				arg1 = Static237.method3872(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39, arg0, this.anInt4794, arg1, this.anInt4791, this.anInt4785, local5, arg2, this, this.anInt4790, arg4);
			}
			this.anInt4781 -= arg1;
			if (this.anInt4781 != 0) {
				return arg1;
			}
		} while (!this.method3850());
		return arg3;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()I")
	@Override
	public int method3841() {
		@Pc(6) int local6 = this.anInt4791 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt4786 == 0) {
			local6 -= local6 * this.anInt4794 / (((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39.length << 8);
		} else if (this.anInt4786 >= 0) {
			local6 -= local6 * this.anInt4788 / ((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray39.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
	public synchronized void method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method3866(arg0, arg1, this.method3855());
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "()Z")
	public boolean method3883() {
		return this.anInt4781 != 0;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V")
	public synchronized void method3885(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3848();
			this.method3986();
		} else if (this.anInt4789 == 0 && this.anInt4793 == 0) {
			this.anInt4781 = 0;
			this.anInt4782 = 0;
			this.anInt4791 = 0;
			this.method3986();
		} else {
			@Pc(31) int local31 = -this.anInt4791;
			if (this.anInt4791 > local31) {
				local31 = this.anInt4791;
			}
			if (-this.anInt4789 > local31) {
				local31 = -this.anInt4789;
			}
			if (this.anInt4789 > local31) {
				local31 = this.anInt4789;
			}
			if (-this.anInt4793 > local31) {
				local31 = -this.anInt4793;
			}
			if (this.anInt4793 > local31) {
				local31 = this.anInt4793;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt4781 = arg0;
			this.anInt4782 = Integer.MIN_VALUE;
			this.anInt4785 = -this.anInt4791 / arg0;
			this.anInt4792 = -this.anInt4789 / arg0;
			this.anInt4784 = -this.anInt4793 / arg0;
		}
	}
}
