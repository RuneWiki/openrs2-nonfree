import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!es", name = "m", descriptor = "I")
	public int anInt1944;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "I")
	private int anInt1946;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	public int anInt1947;

	@OriginalMember(owner = "client!es", name = "r", descriptor = "I")
	public int anInt1949;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "I")
	public int anInt1951;

	@OriginalMember(owner = "client!es", name = "u", descriptor = "I")
	public int anInt1952;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "I")
	private int anInt1953;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "I")
	public int anInt1954;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "I")
	private final int anInt1948;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "I")
	private final int anInt1955;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Z")
	private final boolean aBoolean137;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	private int anInt1945;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "I")
	private int anInt1950;

	@OriginalMember(owner = "client!es", name = "A", descriptor = "I")
	private int anInt1957;

	@OriginalMember(owner = "client!es", name = "z", descriptor = "I")
	public int anInt1956;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!he;II)V")
	public Class2_Sub1_Sub3(@OriginalArg(0) Class2_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub22_5 = arg0;
		this.anInt1948 = arg0.anInt2623;
		this.anInt1955 = arg0.anInt2621;
		this.aBoolean137 = arg0.aBoolean170;
		this.anInt1945 = arg1;
		this.anInt1950 = arg2;
		this.anInt1957 = 8192;
		this.anInt1956 = 0;
		this.method1591();
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!he;III)V")
	public Class2_Sub1_Sub3(@OriginalArg(0) Class2_Sub22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass2_Sub22_5 = arg0;
		this.anInt1948 = arg0.anInt2623;
		this.anInt1955 = arg0.anInt2621;
		this.aBoolean137 = arg0.aBoolean170;
		this.anInt1945 = arg1;
		this.anInt1950 = arg2;
		this.anInt1957 = arg3;
		this.anInt1956 = 0;
		this.method1591();
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	public synchronized void method1566(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1582();
			this.method5703();
		} else if (this.anInt1951 == 0 && this.anInt1954 == 0) {
			this.anInt1946 = 0;
			this.anInt1950 = 0;
			this.anInt1947 = 0;
			this.method5703();
		} else {
			@Pc(31) int local31 = -this.anInt1947;
			if (this.anInt1947 > local31) {
				local31 = this.anInt1947;
			}
			if (-this.anInt1951 > local31) {
				local31 = -this.anInt1951;
			}
			if (this.anInt1951 > local31) {
				local31 = this.anInt1951;
			}
			if (-this.anInt1954 > local31) {
				local31 = -this.anInt1954;
			}
			if (this.anInt1954 > local31) {
				local31 = this.anInt1954;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1946 = arg0;
			this.anInt1950 = Integer.MIN_VALUE;
			this.anInt1944 = -this.anInt1947 / arg0;
			this.anInt1949 = -this.anInt1951 / arg0;
			this.anInt1952 = -this.anInt1954 / arg0;
		}
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "()Z")
	public boolean method1567() {
		return this.anInt1946 != 0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([IIIII)I")
	private int method1569(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1946 <= 0) {
				if (this.anInt1945 == 256 && (this.anInt1956 & 0xFF) == 0) {
					if (Static257.aBoolean291) {
						return Static462.method1589(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, arg3, arg2, this);
					}
					return Static462.method1576(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, arg3, arg2, this);
				}
				if (Static257.aBoolean291) {
					return Static462.method1580(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, arg3, arg2, this, this.anInt1945, arg4);
				}
				return Static462.method1574(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, arg3, arg2, this, this.anInt1945, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1946;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1946 += arg1;
			if (this.anInt1945 == 256 && (this.anInt1956 & 0xFF) == 0) {
				if (Static257.aBoolean291) {
					arg1 = Static462.method1603(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, this.anInt1949, this.anInt1952, local5, arg2, this);
				} else {
					arg1 = Static462.method1602(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, this.anInt1944, local5, arg2, this);
				}
			} else if (Static257.aBoolean291) {
				arg1 = Static462.method1586(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, this.anInt1949, this.anInt1952, local5, arg2, this, this.anInt1945, arg4);
			} else {
				arg1 = Static462.method1604(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, this.anInt1944, local5, arg2, this, this.anInt1945, arg4);
			}
			this.anInt1946 -= arg1;
			if (this.anInt1946 != 0) {
				return arg1;
			}
		} while (!this.method1577());
		return arg3;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public synchronized void method1571() {
		this.anInt1945 = (this.anInt1945 ^ this.anInt1945 >> 31) + (this.anInt1945 >>> 31);
		this.anInt1945 = -this.anInt1945;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "()Lclient!oo;")
	@Override
	public Class2_Sub1 method3224() {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "()Z")
	public boolean method1573() {
		return this.anInt1956 < 0 || this.anInt1956 >= ((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18.length << 8;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3228(@OriginalArg(0) int arg0) {
		if (this.anInt1946 > 0) {
			if (arg0 >= this.anInt1946) {
				if (this.anInt1950 == Integer.MIN_VALUE) {
					this.anInt1950 = 0;
					this.anInt1947 = this.anInt1951 = this.anInt1954 = 0;
					this.method5703();
					arg0 = this.anInt1946;
				}
				this.anInt1946 = 0;
				this.method1591();
			} else {
				this.anInt1947 += this.anInt1944 * arg0;
				this.anInt1951 += this.anInt1949 * arg0;
				this.anInt1954 += this.anInt1952 * arg0;
				this.anInt1946 -= arg0;
			}
		}
		@Pc(71) Class2_Sub22_Sub1 local71 = (Class2_Sub22_Sub1) super.aClass2_Sub22_5;
		@Pc(76) int local76 = this.anInt1948 << 8;
		@Pc(81) int local81 = this.anInt1955 << 8;
		@Pc(87) int local87 = local71.aByteArray18.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1953 = 0;
		}
		if (this.anInt1956 < 0) {
			if (this.anInt1945 <= 0) {
				this.method1584();
				this.method5703();
				return;
			}
			this.anInt1956 = 0;
		}
		if (this.anInt1956 >= local87) {
			if (this.anInt1945 >= 0) {
				this.method1584();
				this.method5703();
				return;
			}
			this.anInt1956 = local87 - 1;
		}
		this.anInt1956 += this.anInt1945 * arg0;
		if (this.anInt1953 >= 0) {
			if (this.anInt1953 > 0) {
				if (this.aBoolean137) {
					label125: {
						if (this.anInt1945 < 0) {
							if (this.anInt1956 >= local76) {
								return;
							}
							this.anInt1956 = local76 + local76 - this.anInt1956 - 1;
							this.anInt1945 = -this.anInt1945;
							if (--this.anInt1953 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1956 < local81) {
								return;
							}
							this.anInt1956 = local81 + local81 - this.anInt1956 - 1;
							this.anInt1945 = -this.anInt1945;
							if (--this.anInt1953 == 0) {
								break;
							}
							if (this.anInt1956 >= local76) {
								return;
							}
							this.anInt1956 = local76 + local76 - this.anInt1956 - 1;
							this.anInt1945 = -this.anInt1945;
						} while (--this.anInt1953 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1945 < 0) {
						if (this.anInt1956 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1956 - 1) / local91;
						if (local361 < this.anInt1953) {
							this.anInt1956 += local91 * local361;
							this.anInt1953 -= local361;
							return;
						}
						this.anInt1956 += local91 * this.anInt1953;
						this.anInt1953 = 0;
					} else if (this.anInt1956 >= local81) {
						local361 = (this.anInt1956 - local76) / local91;
						if (local361 < this.anInt1953) {
							this.anInt1956 -= local91 * local361;
							this.anInt1953 -= local361;
							return;
						}
						this.anInt1956 -= local91 * this.anInt1953;
						this.anInt1953 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1945 < 0) {
				if (this.anInt1956 < 0) {
					this.anInt1956 = -1;
					this.method1584();
					this.method5703();
					return;
				}
			} else if (this.anInt1956 >= local87) {
				this.anInt1956 = local87;
				this.method1584();
				this.method5703();
			}
		} else if (this.aBoolean137) {
			if (this.anInt1945 < 0) {
				if (this.anInt1956 >= local76) {
					return;
				}
				this.anInt1956 = local76 + local76 - this.anInt1956 - 1;
				this.anInt1945 = -this.anInt1945;
			}
			while (this.anInt1956 >= local81) {
				this.anInt1956 = local81 + local81 - this.anInt1956 - 1;
				this.anInt1945 = -this.anInt1945;
				if (this.anInt1956 >= local76) {
					return;
				}
				this.anInt1956 = local76 + local76 - this.anInt1956 - 1;
				this.anInt1945 = -this.anInt1945;
			}
		} else if (this.anInt1945 < 0) {
			if (this.anInt1956 < local76) {
				this.anInt1956 = local81 - (local81 - 1 - this.anInt1956) % local91 - 1;
			}
		} else if (this.anInt1956 >= local81) {
			this.anInt1956 = local76 + (this.anInt1956 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
	public synchronized void method1575(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1956 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "()Z")
	private boolean method1577() {
		@Pc(2) int local2 = this.anInt1950;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static462.method1595(local2, this.anInt1957);
			local8 = Static462.method1599(local2, this.anInt1957);
		}
		if (this.anInt1947 != local2 || this.anInt1951 != local10 || this.anInt1954 != local8) {
			if (this.anInt1947 < local2) {
				this.anInt1944 = 1;
				this.anInt1946 = local2 - this.anInt1947;
			} else if (this.anInt1947 > local2) {
				this.anInt1944 = -1;
				this.anInt1946 = this.anInt1947 - local2;
			} else {
				this.anInt1944 = 0;
			}
			if (this.anInt1951 < local10) {
				this.anInt1949 = 1;
				if (this.anInt1946 == 0 || this.anInt1946 > local10 - this.anInt1951) {
					this.anInt1946 = local10 - this.anInt1951;
				}
			} else if (this.anInt1951 > local10) {
				this.anInt1949 = -1;
				if (this.anInt1946 == 0 || this.anInt1946 > this.anInt1951 - local10) {
					this.anInt1946 = this.anInt1951 - local10;
				}
			} else {
				this.anInt1949 = 0;
			}
			if (this.anInt1954 < local8) {
				this.anInt1952 = 1;
				if (this.anInt1946 == 0 || this.anInt1946 > local8 - this.anInt1954) {
					this.anInt1946 = local8 - this.anInt1954;
				}
			} else if (this.anInt1954 > local8) {
				this.anInt1952 = -1;
				if (this.anInt1946 == 0 || this.anInt1946 > this.anInt1954 - local8) {
					this.anInt1946 = this.anInt1954 - local8;
				}
			} else {
				this.anInt1952 = 0;
			}
			return false;
		} else if (this.anInt1950 == Integer.MIN_VALUE) {
			this.anInt1950 = 0;
			this.anInt1947 = this.anInt1951 = this.anInt1954 = 0;
			this.method5703();
			return true;
		} else {
			this.method1591();
			return false;
		}
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "()I")
	public synchronized int method1578() {
		return this.anInt1945 < 0 ? -this.anInt1945 : this.anInt1945;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "()I")
	public synchronized int method1579() {
		return this.anInt1957 < 0 ? -1 : this.anInt1957;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
	private synchronized void method1582() {
		this.method1601(0, this.method1579());
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public synchronized void method1583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1597(arg0, arg1, this.method1579());
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "()V")
	private void method1584() {
		if (this.anInt1946 == 0) {
			return;
		}
		if (this.anInt1950 == Integer.MIN_VALUE) {
			this.anInt1950 = 0;
		}
		this.anInt1946 = 0;
		this.method1591();
	}

	@OriginalMember(owner = "client!es", name = "k", descriptor = "()I")
	public synchronized int method1590() {
		return this.anInt1950 == Integer.MIN_VALUE ? 0 : this.anInt1950;
	}

	@OriginalMember(owner = "client!es", name = "l", descriptor = "()V")
	private void method1591() {
		this.anInt1947 = this.anInt1950;
		this.anInt1951 = Static462.method1595(this.anInt1950, this.anInt1957);
		this.anInt1954 = Static462.method1599(this.anInt1950, this.anInt1957);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "([IIIII)I")
	private int method1592(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1946 <= 0) {
				if (this.anInt1945 == -256 && (this.anInt1956 & 0xFF) == 0) {
					if (Static257.aBoolean291) {
						return Static462.method1588(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, arg3, arg2, this);
					}
					return Static462.method1596(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, arg3, arg2, this);
				}
				if (Static257.aBoolean291) {
					return Static462.method1570(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, arg3, arg2, this, this.anInt1945, arg4);
				}
				return Static462.method1600(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, arg3, arg2, this, this.anInt1945, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1946;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1946 += arg1;
			if (this.anInt1945 == -256 && (this.anInt1956 & 0xFF) == 0) {
				if (Static257.aBoolean291) {
					arg1 = Static462.method1572(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, this.anInt1949, this.anInt1952, local5, arg2, this);
				} else {
					arg1 = Static462.method1568(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, this.anInt1944, local5, arg2, this);
				}
			} else if (Static257.aBoolean291) {
				arg1 = Static462.method1587(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1951, this.anInt1954, this.anInt1949, this.anInt1952, local5, arg2, this, this.anInt1945, arg4);
			} else {
				arg1 = Static462.method1585(((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18, arg0, this.anInt1956, arg1, this.anInt1947, this.anInt1944, local5, arg2, this, this.anInt1945, arg4);
			}
			this.anInt1946 -= arg1;
			if (this.anInt1946 != 0) {
				return arg1;
			}
		} while (!this.method1577());
		return arg3;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "()Lclient!oo;")
	@Override
	public Class2_Sub1 method3226() {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V")
	public synchronized void method1594(@OriginalArg(0) int arg0) {
		this.method1601(arg0 << 6, this.method1579());
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()I")
	@Override
	public int method3223() {
		return this.anInt1950 == 0 && this.anInt1946 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
	public synchronized void method1597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1601(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static462.method1595(arg1, arg2);
		@Pc(14) int local14 = Static462.method1599(arg1, arg2);
		if (this.anInt1951 == local10 && this.anInt1954 == local14) {
			this.anInt1946 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1947;
		if (this.anInt1947 - arg1 > local31) {
			local31 = this.anInt1947 - arg1;
		}
		if (local10 - this.anInt1951 > local31) {
			local31 = local10 - this.anInt1951;
		}
		if (this.anInt1951 - local10 > local31) {
			local31 = this.anInt1951 - local10;
		}
		if (local14 - this.anInt1954 > local31) {
			local31 = local14 - this.anInt1954;
		}
		if (this.anInt1954 - local14 > local31) {
			local31 = this.anInt1954 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1946 = arg0;
		this.anInt1950 = arg1;
		this.anInt1957 = arg2;
		this.anInt1944 = (arg1 - this.anInt1947) / arg0;
		this.anInt1949 = (local10 - this.anInt1951) / arg0;
		this.anInt1952 = (local14 - this.anInt1954) / arg0;
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(I)V")
	public synchronized void method1598(@OriginalArg(0) int arg0) {
		this.anInt1953 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(II)V")
	private synchronized void method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1950 = arg0;
		this.anInt1957 = arg1;
		this.anInt1946 = 0;
		this.method1591();
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3229(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1950 == 0 && this.anInt1946 == 0) {
			this.method3228(arg2);
			return;
		}
		@Pc(13) Class2_Sub22_Sub1 local13 = (Class2_Sub22_Sub1) super.aClass2_Sub22_5;
		@Pc(18) int local18 = this.anInt1948 << 8;
		@Pc(23) int local23 = this.anInt1955 << 8;
		@Pc(29) int local29 = local13.aByteArray18.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1953 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1956 < 0) {
			if (this.anInt1945 <= 0) {
				this.method1584();
				this.method5703();
				return;
			}
			this.anInt1956 = 0;
		}
		if (this.anInt1956 >= local29) {
			if (this.anInt1945 >= 0) {
				this.method1584();
				this.method5703();
				return;
			}
			this.anInt1956 = local29 - 1;
		}
		if (this.anInt1953 >= 0) {
			if (this.anInt1953 > 0) {
				if (this.aBoolean137) {
					label130: {
						if (this.anInt1945 < 0) {
							local40 = this.method1592(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt1948]);
							if (this.anInt1956 >= local18) {
								return;
							}
							this.anInt1956 = local18 + local18 - this.anInt1956 - 1;
							this.anInt1945 = -this.anInt1945;
							if (--this.anInt1953 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1569(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1955 - 1]);
							if (this.anInt1956 < local23) {
								return;
							}
							this.anInt1956 = local23 + local23 - this.anInt1956 - 1;
							this.anInt1945 = -this.anInt1945;
							if (--this.anInt1953 == 0) {
								break;
							}
							local40 = this.method1592(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1948]);
							if (this.anInt1956 >= local18) {
								return;
							}
							this.anInt1956 = local18 + local18 - this.anInt1956 - 1;
							this.anInt1945 = -this.anInt1945;
						} while (--this.anInt1953 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1945 < 0) {
						while (true) {
							local40 = this.method1592(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1955 - 1]);
							if (this.anInt1956 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1956 - 1) / local33;
							if (local416 >= this.anInt1953) {
								this.anInt1956 += local33 * this.anInt1953;
								this.anInt1953 = 0;
								break;
							}
							this.anInt1956 += local33 * local416;
							this.anInt1953 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1569(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1948]);
							if (this.anInt1956 < local23) {
								return;
							}
							local416 = (this.anInt1956 - local18) / local33;
							if (local416 >= this.anInt1953) {
								this.anInt1956 -= local33 * this.anInt1953;
								this.anInt1953 = 0;
								break;
							}
							this.anInt1956 -= local33 * local416;
							this.anInt1953 -= local416;
						}
					}
				}
			}
			if (this.anInt1945 < 0) {
				this.method1592(arg0, local40, 0, local44, 0);
				if (this.anInt1956 < 0) {
					this.anInt1956 = -1;
					this.method1584();
					this.method5703();
					return;
				}
			} else {
				this.method1569(arg0, local40, local29, local44, 0);
				if (this.anInt1956 >= local29) {
					this.anInt1956 = local29;
					this.method1584();
					this.method5703();
				}
			}
		} else if (this.aBoolean137) {
			if (this.anInt1945 < 0) {
				local40 = this.method1592(arg0, arg1, local18, local44, local13.aByteArray18[this.anInt1948]);
				if (this.anInt1956 >= local18) {
					return;
				}
				this.anInt1956 = local18 + local18 - this.anInt1956 - 1;
				this.anInt1945 = -this.anInt1945;
			}
			while (true) {
				local40 = this.method1569(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1955 - 1]);
				if (this.anInt1956 < local23) {
					return;
				}
				this.anInt1956 = local23 + local23 - this.anInt1956 - 1;
				this.anInt1945 = -this.anInt1945;
				local40 = this.method1592(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1948]);
				if (this.anInt1956 >= local18) {
					return;
				}
				this.anInt1956 = local18 + local18 - this.anInt1956 - 1;
				this.anInt1945 = -this.anInt1945;
			}
		} else if (this.anInt1945 < 0) {
			while (true) {
				local40 = this.method1592(arg0, local40, local18, local44, local13.aByteArray18[this.anInt1955 - 1]);
				if (this.anInt1956 >= local18) {
					return;
				}
				this.anInt1956 = local23 - (local23 - 1 - this.anInt1956) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1569(arg0, local40, local23, local44, local13.aByteArray18[this.anInt1948]);
				if (this.anInt1956 < local23) {
					return;
				}
				this.anInt1956 = local18 + (this.anInt1956 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(I)V")
	public synchronized void method1605(@OriginalArg(0) int arg0) {
		if (this.anInt1945 < 0) {
			this.anInt1945 = -arg0;
		} else {
			this.anInt1945 = arg0;
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "()I")
	@Override
	public int method3225() {
		@Pc(6) int local6 = this.anInt1947 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1953 == 0) {
			local6 -= local6 * this.anInt1956 / (((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18.length << 8);
		} else if (this.anInt1953 >= 0) {
			local6 -= local6 * this.anInt1948 / ((Class2_Sub22_Sub1) super.aClass2_Sub22_5).aByteArray18.length;
		}
		return local6 > 255 ? 255 : local6;
	}
}
