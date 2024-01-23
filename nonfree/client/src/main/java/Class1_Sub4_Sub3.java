import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
	private int anInt1942;

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
	public int anInt1944;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
	private int anInt1945;

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
	public int anInt1949;

	@OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
	public int anInt1953;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
	public int anInt1954;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
	public int anInt1955;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
	private int anInt1946;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
	private int anInt1948;

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
	private int anInt1952;

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
	private int anInt1951;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
	private int anInt1950;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
	public int anInt1947;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ec;II)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) Class1_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub7_5 = arg0;
		this.anInt1946 = arg0.anInt1533;
		this.anInt1948 = arg0.anInt1535;
		this.aBoolean115 = arg0.aBoolean88;
		this.anInt1952 = arg1;
		this.anInt1951 = arg2;
		this.anInt1950 = 8192;
		this.anInt1947 = 0;
		this.method1387();
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ec;III)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) Class1_Sub7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub7_5 = arg0;
		this.anInt1946 = arg0.anInt1533;
		this.anInt1948 = arg0.anInt1535;
		this.aBoolean115 = arg0.aBoolean88;
		this.anInt1952 = arg1;
		this.anInt1951 = arg2;
		this.anInt1950 = arg3;
		this.anInt1947 = 0;
		this.method1387();
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	public synchronized void method1386(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1412();
			this.method4186();
		} else if (this.anInt1949 == 0 && this.anInt1955 == 0) {
			this.anInt1945 = 0;
			this.anInt1951 = 0;
			this.anInt1943 = 0;
			this.method4186();
		} else {
			@Pc(31) int local31 = -this.anInt1943;
			if (this.anInt1943 > local31) {
				local31 = this.anInt1943;
			}
			if (-this.anInt1949 > local31) {
				local31 = -this.anInt1949;
			}
			if (this.anInt1949 > local31) {
				local31 = this.anInt1949;
			}
			if (-this.anInt1955 > local31) {
				local31 = -this.anInt1955;
			}
			if (this.anInt1955 > local31) {
				local31 = this.anInt1955;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1945 = arg0;
			this.anInt1951 = Integer.MIN_VALUE;
			this.anInt1954 = -this.anInt1943 / arg0;
			this.anInt1953 = -this.anInt1949 / arg0;
			this.anInt1944 = -this.anInt1955 / arg0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "()V")
	private void method1387() {
		this.anInt1943 = this.anInt1951;
		this.anInt1949 = Static269.method1396(this.anInt1951, this.anInt1950);
		this.anInt1955 = Static269.method1419(this.anInt1951, this.anInt1950);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "()I")
	public synchronized int method1389() {
		return this.anInt1950 < 0 ? -1 : this.anInt1950;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "()Z")
	private boolean method1391() {
		@Pc(2) int local2 = this.anInt1951;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static269.method1396(local2, this.anInt1950);
			local8 = Static269.method1419(local2, this.anInt1950);
		}
		if (this.anInt1943 != local2 || this.anInt1949 != local10 || this.anInt1955 != local8) {
			if (this.anInt1943 < local2) {
				this.anInt1954 = 1;
				this.anInt1945 = local2 - this.anInt1943;
			} else if (this.anInt1943 > local2) {
				this.anInt1954 = -1;
				this.anInt1945 = this.anInt1943 - local2;
			} else {
				this.anInt1954 = 0;
			}
			if (this.anInt1949 < local10) {
				this.anInt1953 = 1;
				if (this.anInt1945 == 0 || this.anInt1945 > local10 - this.anInt1949) {
					this.anInt1945 = local10 - this.anInt1949;
				}
			} else if (this.anInt1949 > local10) {
				this.anInt1953 = -1;
				if (this.anInt1945 == 0 || this.anInt1945 > this.anInt1949 - local10) {
					this.anInt1945 = this.anInt1949 - local10;
				}
			} else {
				this.anInt1953 = 0;
			}
			if (this.anInt1955 < local8) {
				this.anInt1944 = 1;
				if (this.anInt1945 == 0 || this.anInt1945 > local8 - this.anInt1955) {
					this.anInt1945 = local8 - this.anInt1955;
				}
			} else if (this.anInt1955 > local8) {
				this.anInt1944 = -1;
				if (this.anInt1945 == 0 || this.anInt1945 > this.anInt1955 - local8) {
					this.anInt1945 = this.anInt1955 - local8;
				}
			} else {
				this.anInt1944 = 0;
			}
			return false;
		} else if (this.anInt1951 == Integer.MIN_VALUE) {
			this.anInt1951 = 0;
			this.anInt1943 = this.anInt1949 = this.anInt1955 = 0;
			this.method4186();
			return true;
		} else {
			this.method1387();
			return false;
		}
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "()V")
	private void method1392() {
		if (this.anInt1945 == 0) {
			return;
		}
		if (this.anInt1951 == Integer.MIN_VALUE) {
			this.anInt1951 = 0;
		}
		this.anInt1945 = 0;
		this.method1387();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3072(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1951 == 0 && this.anInt1945 == 0) {
			this.method3074(arg2);
			return;
		}
		@Pc(13) Class1_Sub7_Sub1 local13 = (Class1_Sub7_Sub1) super.aClass1_Sub7_5;
		@Pc(18) int local18 = this.anInt1946 << 8;
		@Pc(23) int local23 = this.anInt1948 << 8;
		@Pc(29) int local29 = local13.aByteArray21.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1942 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1947 < 0) {
			if (this.anInt1952 <= 0) {
				this.method1392();
				this.method4186();
				return;
			}
			this.anInt1947 = 0;
		}
		if (this.anInt1947 >= local29) {
			if (this.anInt1952 >= 0) {
				this.method1392();
				this.method4186();
				return;
			}
			this.anInt1947 = local29 - 1;
		}
		if (this.anInt1942 >= 0) {
			if (this.anInt1942 > 0) {
				if (this.aBoolean115) {
					label130: {
						if (this.anInt1952 < 0) {
							local40 = this.method1414(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt1946]);
							if (this.anInt1947 >= local18) {
								return;
							}
							this.anInt1947 = local18 + local18 - this.anInt1947 - 1;
							this.anInt1952 = -this.anInt1952;
							if (--this.anInt1942 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1418(arg0, local40, local23, local44, local13.aByteArray21[this.anInt1948 - 1]);
							if (this.anInt1947 < local23) {
								return;
							}
							this.anInt1947 = local23 + local23 - this.anInt1947 - 1;
							this.anInt1952 = -this.anInt1952;
							if (--this.anInt1942 == 0) {
								break;
							}
							local40 = this.method1414(arg0, local40, local18, local44, local13.aByteArray21[this.anInt1946]);
							if (this.anInt1947 >= local18) {
								return;
							}
							this.anInt1947 = local18 + local18 - this.anInt1947 - 1;
							this.anInt1952 = -this.anInt1952;
						} while (--this.anInt1942 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1952 < 0) {
						while (true) {
							local40 = this.method1414(arg0, local40, local18, local44, local13.aByteArray21[this.anInt1948 - 1]);
							if (this.anInt1947 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1947 - 1) / local33;
							if (local416 >= this.anInt1942) {
								this.anInt1947 += local33 * this.anInt1942;
								this.anInt1942 = 0;
								break;
							}
							this.anInt1947 += local33 * local416;
							this.anInt1942 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1418(arg0, local40, local23, local44, local13.aByteArray21[this.anInt1946]);
							if (this.anInt1947 < local23) {
								return;
							}
							local416 = (this.anInt1947 - local18) / local33;
							if (local416 >= this.anInt1942) {
								this.anInt1947 -= local33 * this.anInt1942;
								this.anInt1942 = 0;
								break;
							}
							this.anInt1947 -= local33 * local416;
							this.anInt1942 -= local416;
						}
					}
				}
			}
			if (this.anInt1952 < 0) {
				this.method1414(arg0, local40, 0, local44, 0);
				if (this.anInt1947 < 0) {
					this.anInt1947 = -1;
					this.method1392();
					this.method4186();
					return;
				}
			} else {
				this.method1418(arg0, local40, local29, local44, 0);
				if (this.anInt1947 >= local29) {
					this.anInt1947 = local29;
					this.method1392();
					this.method4186();
				}
			}
		} else if (this.aBoolean115) {
			if (this.anInt1952 < 0) {
				local40 = this.method1414(arg0, arg1, local18, local44, local13.aByteArray21[this.anInt1946]);
				if (this.anInt1947 >= local18) {
					return;
				}
				this.anInt1947 = local18 + local18 - this.anInt1947 - 1;
				this.anInt1952 = -this.anInt1952;
			}
			while (true) {
				local40 = this.method1418(arg0, local40, local23, local44, local13.aByteArray21[this.anInt1948 - 1]);
				if (this.anInt1947 < local23) {
					return;
				}
				this.anInt1947 = local23 + local23 - this.anInt1947 - 1;
				this.anInt1952 = -this.anInt1952;
				local40 = this.method1414(arg0, local40, local18, local44, local13.aByteArray21[this.anInt1946]);
				if (this.anInt1947 >= local18) {
					return;
				}
				this.anInt1947 = local18 + local18 - this.anInt1947 - 1;
				this.anInt1952 = -this.anInt1952;
			}
		} else if (this.anInt1952 < 0) {
			while (true) {
				local40 = this.method1414(arg0, local40, local18, local44, local13.aByteArray21[this.anInt1948 - 1]);
				if (this.anInt1947 >= local18) {
					return;
				}
				this.anInt1947 = local23 - (local23 - 1 - this.anInt1947) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1418(arg0, local40, local23, local44, local13.aByteArray21[this.anInt1946]);
				if (this.anInt1947 < local23) {
					return;
				}
				this.anInt1947 = local18 + (this.anInt1947 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "()I")
	public synchronized int method1393() {
		return this.anInt1952 < 0 ? -this.anInt1952 : this.anInt1952;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method3074(@OriginalArg(0) int arg0) {
		if (this.anInt1945 > 0) {
			if (arg0 >= this.anInt1945) {
				if (this.anInt1951 == Integer.MIN_VALUE) {
					this.anInt1951 = 0;
					this.anInt1943 = this.anInt1949 = this.anInt1955 = 0;
					this.method4186();
					arg0 = this.anInt1945;
				}
				this.anInt1945 = 0;
				this.method1387();
			} else {
				this.anInt1943 += this.anInt1954 * arg0;
				this.anInt1949 += this.anInt1953 * arg0;
				this.anInt1955 += this.anInt1944 * arg0;
				this.anInt1945 -= arg0;
			}
		}
		@Pc(71) Class1_Sub7_Sub1 local71 = (Class1_Sub7_Sub1) super.aClass1_Sub7_5;
		@Pc(76) int local76 = this.anInt1946 << 8;
		@Pc(81) int local81 = this.anInt1948 << 8;
		@Pc(87) int local87 = local71.aByteArray21.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1942 = 0;
		}
		if (this.anInt1947 < 0) {
			if (this.anInt1952 <= 0) {
				this.method1392();
				this.method4186();
				return;
			}
			this.anInt1947 = 0;
		}
		if (this.anInt1947 >= local87) {
			if (this.anInt1952 >= 0) {
				this.method1392();
				this.method4186();
				return;
			}
			this.anInt1947 = local87 - 1;
		}
		this.anInt1947 += this.anInt1952 * arg0;
		if (this.anInt1942 >= 0) {
			if (this.anInt1942 > 0) {
				if (this.aBoolean115) {
					label125: {
						if (this.anInt1952 < 0) {
							if (this.anInt1947 >= local76) {
								return;
							}
							this.anInt1947 = local76 + local76 - this.anInt1947 - 1;
							this.anInt1952 = -this.anInt1952;
							if (--this.anInt1942 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1947 < local81) {
								return;
							}
							this.anInt1947 = local81 + local81 - this.anInt1947 - 1;
							this.anInt1952 = -this.anInt1952;
							if (--this.anInt1942 == 0) {
								break;
							}
							if (this.anInt1947 >= local76) {
								return;
							}
							this.anInt1947 = local76 + local76 - this.anInt1947 - 1;
							this.anInt1952 = -this.anInt1952;
						} while (--this.anInt1942 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1952 < 0) {
						if (this.anInt1947 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1947 - 1) / local91;
						if (local361 < this.anInt1942) {
							this.anInt1947 += local91 * local361;
							this.anInt1942 -= local361;
							return;
						}
						this.anInt1947 += local91 * this.anInt1942;
						this.anInt1942 = 0;
					} else if (this.anInt1947 >= local81) {
						local361 = (this.anInt1947 - local76) / local91;
						if (local361 < this.anInt1942) {
							this.anInt1947 -= local91 * local361;
							this.anInt1942 -= local361;
							return;
						}
						this.anInt1947 -= local91 * this.anInt1942;
						this.anInt1942 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1952 < 0) {
				if (this.anInt1947 < 0) {
					this.anInt1947 = -1;
					this.method1392();
					this.method4186();
					return;
				}
			} else if (this.anInt1947 >= local87) {
				this.anInt1947 = local87;
				this.method1392();
				this.method4186();
			}
		} else if (this.aBoolean115) {
			if (this.anInt1952 < 0) {
				if (this.anInt1947 >= local76) {
					return;
				}
				this.anInt1947 = local76 + local76 - this.anInt1947 - 1;
				this.anInt1952 = -this.anInt1952;
			}
			while (this.anInt1947 >= local81) {
				this.anInt1947 = local81 + local81 - this.anInt1947 - 1;
				this.anInt1952 = -this.anInt1952;
				if (this.anInt1947 >= local76) {
					return;
				}
				this.anInt1947 = local76 + local76 - this.anInt1947 - 1;
				this.anInt1952 = -this.anInt1952;
			}
		} else if (this.anInt1952 < 0) {
			if (this.anInt1947 < local76) {
				this.anInt1947 = local81 - (local81 - 1 - this.anInt1947) % local91 - 1;
			}
		} else if (this.anInt1947 >= local81) {
			this.anInt1947 = local76 + (this.anInt1947 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "()Lclient!ta;")
	@Override
	public Class1_Sub4 method3075() {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "()I")
	public synchronized int method1400() {
		return this.anInt1951 == Integer.MIN_VALUE ? 0 : this.anInt1951;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	public synchronized void method1401(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1947 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
	@Override
	public int method3071() {
		@Pc(6) int local6 = this.anInt1943 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1942 == 0) {
			local6 -= local6 * this.anInt1947 / (((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21.length << 8);
		} else if (this.anInt1942 >= 0) {
			local6 -= local6 * this.anInt1946 / ((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
	public synchronized void method1402(@OriginalArg(0) int arg0) {
		if (this.anInt1952 < 0) {
			this.anInt1952 = -arg0;
		} else {
			this.anInt1952 = arg0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
	public synchronized void method1406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1423(arg0, arg1, this.method1389());
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "()Z")
	public boolean method1409() {
		return this.anInt1947 < 0 || this.anInt1947 >= ((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21.length << 8;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public synchronized void method1410() {
		this.anInt1952 = (this.anInt1952 ^ this.anInt1952 >> 31) + (this.anInt1952 >>> 31);
		this.anInt1952 = -this.anInt1952;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V")
	private synchronized void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1951 = arg0;
		this.anInt1950 = arg1;
		this.anInt1945 = 0;
		this.method1387();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()I")
	@Override
	public int method3076() {
		return this.anInt1951 == 0 && this.anInt1945 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
	private synchronized void method1412() {
		this.method1411(0, this.method1389());
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "()Z")
	public boolean method1413() {
		return this.anInt1945 != 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([IIIII)I")
	private int method1414(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1945 <= 0) {
				if (this.anInt1952 == -256 && (this.anInt1947 & 0xFF) == 0) {
					if (Static121.aBoolean167) {
						return Static269.method1390(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, arg3, arg2, this);
					}
					return Static269.method1397(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, arg3, arg2, this);
				}
				if (Static121.aBoolean167) {
					return Static269.method1415(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, arg3, arg2, this, this.anInt1952, arg4);
				}
				return Static269.method1388(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, arg3, arg2, this, this.anInt1952, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1945;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1945 += arg1;
			if (this.anInt1952 == -256 && (this.anInt1947 & 0xFF) == 0) {
				if (Static121.aBoolean167) {
					arg1 = Static269.method1395(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, this.anInt1953, this.anInt1944, local5, arg2, this);
				} else {
					arg1 = Static269.method1399(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, this.anInt1954, local5, arg2, this);
				}
			} else if (Static121.aBoolean167) {
				arg1 = Static269.method1416(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, this.anInt1953, this.anInt1944, local5, arg2, this, this.anInt1952, arg4);
			} else {
				arg1 = Static269.method1403(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, this.anInt1954, local5, arg2, this, this.anInt1952, arg4);
			}
			this.anInt1945 -= arg1;
			if (this.anInt1945 != 0) {
				return arg1;
			}
		} while (!this.method1391());
		return arg3;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "([IIIII)I")
	private int method1418(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1945 <= 0) {
				if (this.anInt1952 == 256 && (this.anInt1947 & 0xFF) == 0) {
					if (Static121.aBoolean167) {
						return Static269.method1417(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, arg3, arg2, this);
					}
					return Static269.method1407(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, arg3, arg2, this);
				}
				if (Static121.aBoolean167) {
					return Static269.method1405(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, arg3, arg2, this, this.anInt1952, arg4);
				}
				return Static269.method1424(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, arg3, arg2, this, this.anInt1952, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1945;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1945 += arg1;
			if (this.anInt1952 == 256 && (this.anInt1947 & 0xFF) == 0) {
				if (Static121.aBoolean167) {
					arg1 = Static269.method1404(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, this.anInt1953, this.anInt1944, local5, arg2, this);
				} else {
					arg1 = Static269.method1398(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, this.anInt1954, local5, arg2, this);
				}
			} else if (Static121.aBoolean167) {
				arg1 = Static269.method1385(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1949, this.anInt1955, this.anInt1953, this.anInt1944, local5, arg2, this, this.anInt1952, arg4);
			} else {
				arg1 = Static269.method1394(((Class1_Sub7_Sub1) super.aClass1_Sub7_5).aByteArray21, arg0, this.anInt1947, arg1, this.anInt1943, this.anInt1954, local5, arg2, this, this.anInt1952, arg4);
			}
			this.anInt1945 -= arg1;
			if (this.anInt1945 != 0) {
				return arg1;
			}
		} while (!this.method1391());
		return arg3;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lclient!ta;")
	@Override
	public Class1_Sub4 method3073() {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V")
	public synchronized void method1421(@OriginalArg(0) int arg0) {
		this.method1411(arg0 << 6, this.method1389());
	}

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V")
	public synchronized void method1422(@OriginalArg(0) int arg0) {
		this.anInt1942 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	public synchronized void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1411(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static269.method1396(arg1, arg2);
		@Pc(14) int local14 = Static269.method1419(arg1, arg2);
		if (this.anInt1949 == local10 && this.anInt1955 == local14) {
			this.anInt1945 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1943;
		if (this.anInt1943 - arg1 > local31) {
			local31 = this.anInt1943 - arg1;
		}
		if (local10 - this.anInt1949 > local31) {
			local31 = local10 - this.anInt1949;
		}
		if (this.anInt1949 - local10 > local31) {
			local31 = this.anInt1949 - local10;
		}
		if (local14 - this.anInt1955 > local31) {
			local31 = local14 - this.anInt1955;
		}
		if (this.anInt1955 - local14 > local31) {
			local31 = this.anInt1955 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1945 = arg0;
		this.anInt1951 = arg1;
		this.anInt1950 = arg2;
		this.anInt1954 = (arg1 - this.anInt1943) / arg0;
		this.anInt1953 = (local10 - this.anInt1949) / arg0;
		this.anInt1944 = (local14 - this.anInt1955) / arg0;
	}
}
