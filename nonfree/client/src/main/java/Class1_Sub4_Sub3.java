import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub4_Sub3 extends Class1_Sub4 {

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	private int anInt1863;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	private int anInt1864;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	public int anInt1867;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	public int anInt1869;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public int anInt1870;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
	public int anInt1873;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	private final int anInt1861;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	private final int anInt1860;

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	private int anInt1868;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	private int anInt1862;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!m;II)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) Class1_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub17_5 = arg0;
		this.anInt1861 = arg0.anInt1968;
		this.anInt1860 = arg0.anInt1966;
		this.aBoolean99 = arg0.aBoolean104;
		this.anInt1868 = arg1;
		this.anInt1862 = arg2;
		this.anInt1865 = 8192;
		this.anInt1871 = 0;
		this.method1250();
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!m;III)V")
	public Class1_Sub4_Sub3(@OriginalArg(0) Class1_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub17_5 = arg0;
		this.anInt1861 = arg0.anInt1968;
		this.anInt1860 = arg0.anInt1966;
		this.aBoolean99 = arg0.aBoolean104;
		this.anInt1868 = arg1;
		this.anInt1862 = arg2;
		this.anInt1865 = arg3;
		this.anInt1871 = 0;
		this.method1250();
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "()Z")
	private boolean method1216() {
		@Pc(2) int local2 = this.anInt1862;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static137.method1234(local2, this.anInt1865);
			local8 = Static137.method1237(local2, this.anInt1865);
		}
		if (this.anInt1869 != local2 || this.anInt1870 != local10 || this.anInt1872 != local8) {
			if (this.anInt1869 < local2) {
				this.anInt1867 = 1;
				this.anInt1864 = local2 - this.anInt1869;
			} else if (this.anInt1869 > local2) {
				this.anInt1867 = -1;
				this.anInt1864 = this.anInt1869 - local2;
			} else {
				this.anInt1867 = 0;
			}
			if (this.anInt1870 < local10) {
				this.anInt1873 = 1;
				if (this.anInt1864 == 0 || this.anInt1864 > local10 - this.anInt1870) {
					this.anInt1864 = local10 - this.anInt1870;
				}
			} else if (this.anInt1870 > local10) {
				this.anInt1873 = -1;
				if (this.anInt1864 == 0 || this.anInt1864 > this.anInt1870 - local10) {
					this.anInt1864 = this.anInt1870 - local10;
				}
			} else {
				this.anInt1873 = 0;
			}
			if (this.anInt1872 < local8) {
				this.anInt1866 = 1;
				if (this.anInt1864 == 0 || this.anInt1864 > local8 - this.anInt1872) {
					this.anInt1864 = local8 - this.anInt1872;
				}
			} else if (this.anInt1872 > local8) {
				this.anInt1866 = -1;
				if (this.anInt1864 == 0 || this.anInt1864 > this.anInt1872 - local8) {
					this.anInt1864 = this.anInt1872 - local8;
				}
			} else {
				this.anInt1866 = 0;
			}
			return false;
		} else if (this.anInt1862 == Integer.MIN_VALUE) {
			this.anInt1862 = 0;
			this.anInt1869 = this.anInt1870 = this.anInt1872 = 0;
			this.method2039();
			return true;
		} else {
			this.method1250();
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public synchronized void method1217(@OriginalArg(0) int arg0) {
		if (this.anInt1868 < 0) {
			this.anInt1868 = -arg0;
		} else {
			this.anInt1868 = arg0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public synchronized void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1242(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static137.method1234(arg1, arg2);
		@Pc(14) int local14 = Static137.method1237(arg1, arg2);
		if (this.anInt1870 == local10 && this.anInt1872 == local14) {
			this.anInt1864 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1869;
		if (this.anInt1869 - arg1 > local31) {
			local31 = this.anInt1869 - arg1;
		}
		if (local10 - this.anInt1870 > local31) {
			local31 = local10 - this.anInt1870;
		}
		if (this.anInt1870 - local10 > local31) {
			local31 = this.anInt1870 - local10;
		}
		if (local14 - this.anInt1872 > local31) {
			local31 = local14 - this.anInt1872;
		}
		if (this.anInt1872 - local14 > local31) {
			local31 = this.anInt1872 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1864 = arg0;
		this.anInt1862 = arg1;
		this.anInt1865 = arg2;
		this.anInt1867 = (arg1 - this.anInt1869) / arg0;
		this.anInt1873 = (local10 - this.anInt1870) / arg0;
		this.anInt1866 = (local14 - this.anInt1872) / arg0;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "()V")
	private void method1219() {
		if (this.anInt1864 == 0) {
			return;
		}
		if (this.anInt1862 == Integer.MIN_VALUE) {
			this.anInt1862 = 0;
		}
		this.anInt1864 = 0;
		this.method1250();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public Class1_Sub4 method1894() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public synchronized void method1221() {
		this.anInt1868 = (this.anInt1868 ^ this.anInt1868 >> 31) + (this.anInt1868 >>> 31);
		this.anInt1868 = -this.anInt1868;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	public synchronized void method1226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1218(arg0, arg1, this.method1238());
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()I")
	public synchronized int method1229() {
		return this.anInt1862 == Integer.MIN_VALUE ? 0 : this.anInt1862;
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "()I")
	public synchronized int method1230() {
		return this.anInt1868 < 0 ? -this.anInt1868 : this.anInt1868;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1895(@OriginalArg(0) int arg0) {
		if (this.anInt1864 > 0) {
			if (arg0 >= this.anInt1864) {
				if (this.anInt1862 == Integer.MIN_VALUE) {
					this.anInt1862 = 0;
					this.anInt1869 = this.anInt1870 = this.anInt1872 = 0;
					this.method2039();
					arg0 = this.anInt1864;
				}
				this.anInt1864 = 0;
				this.method1250();
			} else {
				this.anInt1869 += this.anInt1867 * arg0;
				this.anInt1870 += this.anInt1873 * arg0;
				this.anInt1872 += this.anInt1866 * arg0;
				this.anInt1864 -= arg0;
			}
		}
		@Pc(71) Class1_Sub17_Sub1 local71 = (Class1_Sub17_Sub1) super.aClass1_Sub17_5;
		@Pc(76) int local76 = this.anInt1861 << 8;
		@Pc(81) int local81 = this.anInt1860 << 8;
		@Pc(87) int local87 = local71.aByteArray32.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1863 = 0;
		}
		if (this.anInt1871 < 0) {
			if (this.anInt1868 <= 0) {
				this.method1219();
				this.method2039();
				return;
			}
			this.anInt1871 = 0;
		}
		if (this.anInt1871 >= local87) {
			if (this.anInt1868 >= 0) {
				this.method1219();
				this.method2039();
				return;
			}
			this.anInt1871 = local87 - 1;
		}
		this.anInt1871 += this.anInt1868 * arg0;
		if (this.anInt1863 >= 0) {
			if (this.anInt1863 > 0) {
				if (this.aBoolean99) {
					label125: {
						if (this.anInt1868 < 0) {
							if (this.anInt1871 >= local76) {
								return;
							}
							this.anInt1871 = local76 + local76 - this.anInt1871 - 1;
							this.anInt1868 = -this.anInt1868;
							if (--this.anInt1863 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1871 < local81) {
								return;
							}
							this.anInt1871 = local81 + local81 - this.anInt1871 - 1;
							this.anInt1868 = -this.anInt1868;
							if (--this.anInt1863 == 0) {
								break;
							}
							if (this.anInt1871 >= local76) {
								return;
							}
							this.anInt1871 = local76 + local76 - this.anInt1871 - 1;
							this.anInt1868 = -this.anInt1868;
						} while (--this.anInt1863 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1868 < 0) {
						if (this.anInt1871 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1871 - 1) / local91;
						if (local361 < this.anInt1863) {
							this.anInt1871 += local91 * local361;
							this.anInt1863 -= local361;
							return;
						}
						this.anInt1871 += local91 * this.anInt1863;
						this.anInt1863 = 0;
					} else if (this.anInt1871 >= local81) {
						local361 = (this.anInt1871 - local76) / local91;
						if (local361 < this.anInt1863) {
							this.anInt1871 -= local91 * local361;
							this.anInt1863 -= local361;
							return;
						}
						this.anInt1871 -= local91 * this.anInt1863;
						this.anInt1863 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1868 < 0) {
				if (this.anInt1871 < 0) {
					this.anInt1871 = -1;
					this.method1219();
					this.method2039();
					return;
				}
			} else if (this.anInt1871 >= local87) {
				this.anInt1871 = local87;
				this.method1219();
				this.method2039();
			}
		} else if (this.aBoolean99) {
			if (this.anInt1868 < 0) {
				if (this.anInt1871 >= local76) {
					return;
				}
				this.anInt1871 = local76 + local76 - this.anInt1871 - 1;
				this.anInt1868 = -this.anInt1868;
			}
			while (this.anInt1871 >= local81) {
				this.anInt1871 = local81 + local81 - this.anInt1871 - 1;
				this.anInt1868 = -this.anInt1868;
				if (this.anInt1871 >= local76) {
					return;
				}
				this.anInt1871 = local76 + local76 - this.anInt1871 - 1;
				this.anInt1868 = -this.anInt1868;
			}
		} else if (this.anInt1868 < 0) {
			if (this.anInt1871 < local76) {
				this.anInt1871 = local81 - (local81 - 1 - this.anInt1871) % local91 - 1;
			}
		} else if (this.anInt1871 >= local81) {
			this.anInt1871 = local76 + (this.anInt1871 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
	public synchronized void method1231(@OriginalArg(0) int arg0) {
		this.method1242(arg0 << 6, this.method1238());
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1897(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1862 == 0 && this.anInt1864 == 0) {
			this.method1895(arg2);
			return;
		}
		@Pc(13) Class1_Sub17_Sub1 local13 = (Class1_Sub17_Sub1) super.aClass1_Sub17_5;
		@Pc(18) int local18 = this.anInt1861 << 8;
		@Pc(23) int local23 = this.anInt1860 << 8;
		@Pc(29) int local29 = local13.aByteArray32.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1863 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1871 < 0) {
			if (this.anInt1868 <= 0) {
				this.method1219();
				this.method2039();
				return;
			}
			this.anInt1871 = 0;
		}
		if (this.anInt1871 >= local29) {
			if (this.anInt1868 >= 0) {
				this.method1219();
				this.method2039();
				return;
			}
			this.anInt1871 = local29 - 1;
		}
		if (this.anInt1863 >= 0) {
			if (this.anInt1863 > 0) {
				if (this.aBoolean99) {
					label130: {
						if (this.anInt1868 < 0) {
							local40 = this.method1248(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt1861]);
							if (this.anInt1871 >= local18) {
								return;
							}
							this.anInt1871 = local18 + local18 - this.anInt1871 - 1;
							this.anInt1868 = -this.anInt1868;
							if (--this.anInt1863 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1244(arg0, local40, local23, local44, local13.aByteArray32[this.anInt1860 - 1]);
							if (this.anInt1871 < local23) {
								return;
							}
							this.anInt1871 = local23 + local23 - this.anInt1871 - 1;
							this.anInt1868 = -this.anInt1868;
							if (--this.anInt1863 == 0) {
								break;
							}
							local40 = this.method1248(arg0, local40, local18, local44, local13.aByteArray32[this.anInt1861]);
							if (this.anInt1871 >= local18) {
								return;
							}
							this.anInt1871 = local18 + local18 - this.anInt1871 - 1;
							this.anInt1868 = -this.anInt1868;
						} while (--this.anInt1863 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1868 < 0) {
						while (true) {
							local40 = this.method1248(arg0, local40, local18, local44, local13.aByteArray32[this.anInt1860 - 1]);
							if (this.anInt1871 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1871 - 1) / local33;
							if (local416 >= this.anInt1863) {
								this.anInt1871 += local33 * this.anInt1863;
								this.anInt1863 = 0;
								break;
							}
							this.anInt1871 += local33 * local416;
							this.anInt1863 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1244(arg0, local40, local23, local44, local13.aByteArray32[this.anInt1861]);
							if (this.anInt1871 < local23) {
								return;
							}
							local416 = (this.anInt1871 - local18) / local33;
							if (local416 >= this.anInt1863) {
								this.anInt1871 -= local33 * this.anInt1863;
								this.anInt1863 = 0;
								break;
							}
							this.anInt1871 -= local33 * local416;
							this.anInt1863 -= local416;
						}
					}
				}
			}
			if (this.anInt1868 < 0) {
				this.method1248(arg0, local40, 0, local44, 0);
				if (this.anInt1871 < 0) {
					this.anInt1871 = -1;
					this.method1219();
					this.method2039();
					return;
				}
			} else {
				this.method1244(arg0, local40, local29, local44, 0);
				if (this.anInt1871 >= local29) {
					this.anInt1871 = local29;
					this.method1219();
					this.method2039();
				}
			}
		} else if (this.aBoolean99) {
			if (this.anInt1868 < 0) {
				local40 = this.method1248(arg0, arg1, local18, local44, local13.aByteArray32[this.anInt1861]);
				if (this.anInt1871 >= local18) {
					return;
				}
				this.anInt1871 = local18 + local18 - this.anInt1871 - 1;
				this.anInt1868 = -this.anInt1868;
			}
			while (true) {
				local40 = this.method1244(arg0, local40, local23, local44, local13.aByteArray32[this.anInt1860 - 1]);
				if (this.anInt1871 < local23) {
					return;
				}
				this.anInt1871 = local23 + local23 - this.anInt1871 - 1;
				this.anInt1868 = -this.anInt1868;
				local40 = this.method1248(arg0, local40, local18, local44, local13.aByteArray32[this.anInt1861]);
				if (this.anInt1871 >= local18) {
					return;
				}
				this.anInt1871 = local18 + local18 - this.anInt1871 - 1;
				this.anInt1868 = -this.anInt1868;
			}
		} else if (this.anInt1868 < 0) {
			while (true) {
				local40 = this.method1248(arg0, local40, local18, local44, local13.aByteArray32[this.anInt1860 - 1]);
				if (this.anInt1871 >= local18) {
					return;
				}
				this.anInt1871 = local23 - (local23 - 1 - this.anInt1871) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1244(arg0, local40, local23, local44, local13.aByteArray32[this.anInt1861]);
				if (this.anInt1871 < local23) {
					return;
				}
				this.anInt1871 = local18 + (this.anInt1871 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()I")
	@Override
	public int method1899() {
		@Pc(6) int local6 = this.anInt1869 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1863 == 0) {
			local6 -= local6 * this.anInt1871 / (((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32.length << 8);
		} else if (this.anInt1863 >= 0) {
			local6 -= local6 * this.anInt1861 / ((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()I")
	@Override
	public int method1898() {
		return this.anInt1862 == 0 && this.anInt1864 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "()I")
	public synchronized int method1238() {
		return this.anInt1865 < 0 ? -1 : this.anInt1865;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public synchronized void method1239(@OriginalArg(0) int arg0) {
		this.anInt1863 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public Class1_Sub4 method1896() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "()Z")
	public boolean method1241() {
		return this.anInt1864 != 0;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
	private synchronized void method1242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1862 = arg0;
		this.anInt1865 = arg1;
		this.anInt1864 = 0;
		this.method1250();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([IIIII)I")
	private int method1244(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1864 <= 0) {
				if (this.anInt1868 == 256 && (this.anInt1871 & 0xFF) == 0) {
					if (Static121.aBoolean163) {
						return Static137.method1227(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, arg3, arg2, this);
					}
					return Static137.method1214(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, arg3, arg2, this);
				}
				if (Static121.aBoolean163) {
					return Static137.method1228(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, arg3, arg2, this, this.anInt1868, arg4);
				}
				return Static137.method1215(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, arg3, arg2, this, this.anInt1868, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1864;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1864 += arg1;
			if (this.anInt1868 == 256 && (this.anInt1871 & 0xFF) == 0) {
				if (Static121.aBoolean163) {
					arg1 = Static137.method1243(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, this.anInt1873, this.anInt1866, local5, arg2, this);
				} else {
					arg1 = Static137.method1249(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, this.anInt1867, local5, arg2, this);
				}
			} else if (Static121.aBoolean163) {
				arg1 = Static137.method1223(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, this.anInt1873, this.anInt1866, local5, arg2, this, this.anInt1868, arg4);
			} else {
				arg1 = Static137.method1224(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, this.anInt1867, local5, arg2, this, this.anInt1868, arg4);
			}
			this.anInt1864 -= arg1;
			if (this.anInt1864 != 0) {
				return arg1;
			}
		} while (!this.method1216());
		return arg3;
	}

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "()Z")
	public boolean method1246() {
		return this.anInt1871 < 0 || this.anInt1871 >= ((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32.length << 8;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public synchronized void method1247(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1871 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "([IIIII)I")
	private int method1248(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1864 <= 0) {
				if (this.anInt1868 == -256 && (this.anInt1871 & 0xFF) == 0) {
					if (Static121.aBoolean163) {
						return Static137.method1240(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, arg3, arg2, this);
					}
					return Static137.method1252(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, arg3, arg2, this);
				}
				if (Static121.aBoolean163) {
					return Static137.method1232(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, arg3, arg2, this, this.anInt1868, arg4);
				}
				return Static137.method1236(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, arg3, arg2, this, this.anInt1868, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1864;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1864 += arg1;
			if (this.anInt1868 == -256 && (this.anInt1871 & 0xFF) == 0) {
				if (Static121.aBoolean163) {
					arg1 = Static137.method1245(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, this.anInt1873, this.anInt1866, local5, arg2, this);
				} else {
					arg1 = Static137.method1220(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, this.anInt1867, local5, arg2, this);
				}
			} else if (Static121.aBoolean163) {
				arg1 = Static137.method1233(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1870, this.anInt1872, this.anInt1873, this.anInt1866, local5, arg2, this, this.anInt1868, arg4);
			} else {
				arg1 = Static137.method1222(((Class1_Sub17_Sub1) super.aClass1_Sub17_5).aByteArray32, arg0, this.anInt1871, arg1, this.anInt1869, this.anInt1867, local5, arg2, this, this.anInt1868, arg4);
			}
			this.anInt1864 -= arg1;
			if (this.anInt1864 != 0) {
				return arg1;
			}
		} while (!this.method1216());
		return arg3;
	}

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "()V")
	private void method1250() {
		this.anInt1869 = this.anInt1862;
		this.anInt1870 = Static137.method1234(this.anInt1862, this.anInt1865);
		this.anInt1872 = Static137.method1237(this.anInt1862, this.anInt1865);
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	private synchronized void method1251() {
		this.method1242(0, this.method1238());
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V")
	public synchronized void method1253(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1251();
			this.method2039();
		} else if (this.anInt1870 == 0 && this.anInt1872 == 0) {
			this.anInt1864 = 0;
			this.anInt1862 = 0;
			this.anInt1869 = 0;
			this.method2039();
		} else {
			@Pc(31) int local31 = -this.anInt1869;
			if (this.anInt1869 > local31) {
				local31 = this.anInt1869;
			}
			if (-this.anInt1870 > local31) {
				local31 = -this.anInt1870;
			}
			if (this.anInt1870 > local31) {
				local31 = this.anInt1870;
			}
			if (-this.anInt1872 > local31) {
				local31 = -this.anInt1872;
			}
			if (this.anInt1872 > local31) {
				local31 = this.anInt1872;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1864 = arg0;
			this.anInt1862 = Integer.MIN_VALUE;
			this.anInt1867 = -this.anInt1869 / arg0;
			this.anInt1873 = -this.anInt1870 / arg0;
			this.anInt1866 = -this.anInt1872 / arg0;
		}
	}
}
