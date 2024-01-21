import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class4_Sub12_Sub3 extends Class4_Sub12 {

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	public int anInt1804;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
	public int anInt1807;

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
	public int anInt1808;

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
	public int anInt1809;

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
	public int anInt1814;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
	private int anInt1816;

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
	private final int anInt1810;

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
	private final int anInt1806;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Z")
	private final boolean aBoolean114;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
	private int anInt1811;

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
	public int anInt1803;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!pe;II)V")
	public Class4_Sub12_Sub3(@OriginalArg(0) Class4_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass4_Sub6_5 = arg0;
		this.anInt1810 = arg0.anInt2132;
		this.anInt1806 = arg0.anInt2134;
		this.aBoolean114 = arg0.aBoolean131;
		this.anInt1812 = arg1;
		this.anInt1811 = arg2;
		this.anInt1815 = 8192;
		this.anInt1803 = 0;
		this.method1191();
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!pe;III)V")
	public Class4_Sub12_Sub3(@OriginalArg(0) Class4_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass4_Sub6_5 = arg0;
		this.anInt1810 = arg0.anInt2132;
		this.anInt1806 = arg0.anInt2134;
		this.aBoolean114 = arg0.aBoolean131;
		this.anInt1812 = arg1;
		this.anInt1811 = arg2;
		this.anInt1815 = arg3;
		this.anInt1803 = 0;
		this.method1191();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIII)I")
	private int method1186(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1805 <= 0) {
				if (this.anInt1812 == -256 && (this.anInt1803 & 0xFF) == 0) {
					if (Static72.aBoolean117) {
						return Static139.method1217(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, arg3, arg2, this);
					}
					return Static139.method1199(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, arg3, arg2, this);
				}
				if (Static72.aBoolean117) {
					return Static139.method1205(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, arg3, arg2, this, this.anInt1812, arg4);
				}
				return Static139.method1190(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, arg3, arg2, this, this.anInt1812, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1805;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1805 += arg1;
			if (this.anInt1812 == -256 && (this.anInt1803 & 0xFF) == 0) {
				if (Static72.aBoolean117) {
					arg1 = Static139.method1218(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, this.anInt1808, this.anInt1804, local5, arg2, this);
				} else {
					arg1 = Static139.method1195(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, this.anInt1813, local5, arg2, this);
				}
			} else if (Static72.aBoolean117) {
				arg1 = Static139.method1219(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, this.anInt1808, this.anInt1804, local5, arg2, this, this.anInt1812, arg4);
			} else {
				arg1 = Static139.method1203(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, this.anInt1813, local5, arg2, this, this.anInt1812, arg4);
			}
			this.anInt1805 -= arg1;
			if (this.anInt1805 != 0) {
				return arg1;
			}
		} while (!this.method1222());
		return arg3;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	private synchronized void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1811 = arg0;
		this.anInt1815 = arg1;
		this.anInt1805 = 0;
		this.method1191();
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()V")
	private void method1191() {
		this.anInt1807 = this.anInt1811;
		this.anInt1814 = Static139.method1189(this.anInt1811, this.anInt1815);
		this.anInt1809 = Static139.method1194(this.anInt1811, this.anInt1815);
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1693(@OriginalArg(0) int arg0) {
		if (this.anInt1805 > 0) {
			if (arg0 >= this.anInt1805) {
				if (this.anInt1811 == Integer.MIN_VALUE) {
					this.anInt1811 = 0;
					this.anInt1807 = this.anInt1814 = this.anInt1809 = 0;
					this.method2004();
					arg0 = this.anInt1805;
				}
				this.anInt1805 = 0;
				this.method1191();
			} else {
				this.anInt1807 += this.anInt1813 * arg0;
				this.anInt1814 += this.anInt1808 * arg0;
				this.anInt1809 += this.anInt1804 * arg0;
				this.anInt1805 -= arg0;
			}
		}
		@Pc(71) Class4_Sub6_Sub1 local71 = (Class4_Sub6_Sub1) super.aClass4_Sub6_5;
		@Pc(76) int local76 = this.anInt1810 << 8;
		@Pc(81) int local81 = this.anInt1806 << 8;
		@Pc(87) int local87 = local71.aByteArray46.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1816 = 0;
		}
		if (this.anInt1803 < 0) {
			if (this.anInt1812 <= 0) {
				this.method1216();
				this.method2004();
				return;
			}
			this.anInt1803 = 0;
		}
		if (this.anInt1803 >= local87) {
			if (this.anInt1812 >= 0) {
				this.method1216();
				this.method2004();
				return;
			}
			this.anInt1803 = local87 - 1;
		}
		this.anInt1803 += this.anInt1812 * arg0;
		if (this.anInt1816 >= 0) {
			if (this.anInt1816 > 0) {
				if (this.aBoolean114) {
					label125: {
						if (this.anInt1812 < 0) {
							if (this.anInt1803 >= local76) {
								return;
							}
							this.anInt1803 = local76 + local76 - this.anInt1803 - 1;
							this.anInt1812 = -this.anInt1812;
							if (--this.anInt1816 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1803 < local81) {
								return;
							}
							this.anInt1803 = local81 + local81 - this.anInt1803 - 1;
							this.anInt1812 = -this.anInt1812;
							if (--this.anInt1816 == 0) {
								break;
							}
							if (this.anInt1803 >= local76) {
								return;
							}
							this.anInt1803 = local76 + local76 - this.anInt1803 - 1;
							this.anInt1812 = -this.anInt1812;
						} while (--this.anInt1816 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1812 < 0) {
						if (this.anInt1803 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1803 - 1) / local91;
						if (local361 < this.anInt1816) {
							this.anInt1803 += local91 * local361;
							this.anInt1816 -= local361;
							return;
						}
						this.anInt1803 += local91 * this.anInt1816;
						this.anInt1816 = 0;
					} else if (this.anInt1803 >= local81) {
						local361 = (this.anInt1803 - local76) / local91;
						if (local361 < this.anInt1816) {
							this.anInt1803 -= local91 * local361;
							this.anInt1816 -= local361;
							return;
						}
						this.anInt1803 -= local91 * this.anInt1816;
						this.anInt1816 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1812 < 0) {
				if (this.anInt1803 < 0) {
					this.anInt1803 = -1;
					this.method1216();
					this.method2004();
					return;
				}
			} else if (this.anInt1803 >= local87) {
				this.anInt1803 = local87;
				this.method1216();
				this.method2004();
			}
		} else if (this.aBoolean114) {
			if (this.anInt1812 < 0) {
				if (this.anInt1803 >= local76) {
					return;
				}
				this.anInt1803 = local76 + local76 - this.anInt1803 - 1;
				this.anInt1812 = -this.anInt1812;
			}
			while (this.anInt1803 >= local81) {
				this.anInt1803 = local81 + local81 - this.anInt1803 - 1;
				this.anInt1812 = -this.anInt1812;
				if (this.anInt1803 >= local76) {
					return;
				}
				this.anInt1803 = local76 + local76 - this.anInt1803 - 1;
				this.anInt1812 = -this.anInt1812;
			}
		} else if (this.anInt1812 < 0) {
			if (this.anInt1803 < local76) {
				this.anInt1803 = local81 - (local81 - 1 - this.anInt1803) % local91 - 1;
			}
		} else if (this.anInt1803 >= local81) {
			this.anInt1803 = local76 + (this.anInt1803 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()Lclient!ld;")
	@Override
	public Class4_Sub12 method1696() {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public synchronized void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1204(arg0, arg1, this.method1213());
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "()I")
	public synchronized int method1196() {
		return this.anInt1811 == Integer.MIN_VALUE ? 0 : this.anInt1811;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()I")
	@Override
	public int method1695() {
		@Pc(6) int local6 = this.anInt1807 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1816 == 0) {
			local6 -= local6 * this.anInt1803 / (((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46.length << 8);
		} else if (this.anInt1816 >= 0) {
			local6 -= local6 * this.anInt1810 / ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()I")
	@Override
	public int method1691() {
		return this.anInt1811 == 0 && this.anInt1805 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	public synchronized void method1197(@OriginalArg(0) int arg0) {
		this.anInt1816 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	public synchronized void method1198(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1208();
			this.method2004();
		} else if (this.anInt1814 == 0 && this.anInt1809 == 0) {
			this.anInt1805 = 0;
			this.anInt1811 = 0;
			this.anInt1807 = 0;
			this.method2004();
		} else {
			@Pc(31) int local31 = -this.anInt1807;
			if (this.anInt1807 > local31) {
				local31 = this.anInt1807;
			}
			if (-this.anInt1814 > local31) {
				local31 = -this.anInt1814;
			}
			if (this.anInt1814 > local31) {
				local31 = this.anInt1814;
			}
			if (-this.anInt1809 > local31) {
				local31 = -this.anInt1809;
			}
			if (this.anInt1809 > local31) {
				local31 = this.anInt1809;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1805 = arg0;
			this.anInt1811 = Integer.MIN_VALUE;
			this.anInt1813 = -this.anInt1807 / arg0;
			this.anInt1808 = -this.anInt1814 / arg0;
			this.anInt1804 = -this.anInt1809 / arg0;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public synchronized void method1200() {
		this.anInt1812 = (this.anInt1812 ^ this.anInt1812 >> 31) + (this.anInt1812 >>> 31);
		this.anInt1812 = -this.anInt1812;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "([IIIII)I")
	private int method1201(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1805 <= 0) {
				if (this.anInt1812 == 256 && (this.anInt1803 & 0xFF) == 0) {
					if (Static72.aBoolean117) {
						return Static139.method1224(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, arg3, arg2, this);
					}
					return Static139.method1192(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, arg3, arg2, this);
				}
				if (Static72.aBoolean117) {
					return Static139.method1214(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, arg3, arg2, this, this.anInt1812, arg4);
				}
				return Static139.method1202(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, arg3, arg2, this, this.anInt1812, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1805;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1805 += arg1;
			if (this.anInt1812 == 256 && (this.anInt1803 & 0xFF) == 0) {
				if (Static72.aBoolean117) {
					arg1 = Static139.method1206(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, this.anInt1808, this.anInt1804, local5, arg2, this);
				} else {
					arg1 = Static139.method1187(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, this.anInt1813, local5, arg2, this);
				}
			} else if (Static72.aBoolean117) {
				arg1 = Static139.method1210(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1814, this.anInt1809, this.anInt1808, this.anInt1804, local5, arg2, this, this.anInt1812, arg4);
			} else {
				arg1 = Static139.method1225(((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46, arg0, this.anInt1803, arg1, this.anInt1807, this.anInt1813, local5, arg2, this, this.anInt1812, arg4);
			}
			this.anInt1805 -= arg1;
			if (this.anInt1805 != 0) {
				return arg1;
			}
		} while (!this.method1222());
		return arg3;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	public synchronized void method1204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1188(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static139.method1189(arg1, arg2);
		@Pc(14) int local14 = Static139.method1194(arg1, arg2);
		if (this.anInt1814 == local10 && this.anInt1809 == local14) {
			this.anInt1805 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1807;
		if (this.anInt1807 - arg1 > local31) {
			local31 = this.anInt1807 - arg1;
		}
		if (local10 - this.anInt1814 > local31) {
			local31 = local10 - this.anInt1814;
		}
		if (this.anInt1814 - local10 > local31) {
			local31 = this.anInt1814 - local10;
		}
		if (local14 - this.anInt1809 > local31) {
			local31 = local14 - this.anInt1809;
		}
		if (this.anInt1809 - local14 > local31) {
			local31 = this.anInt1809 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1805 = arg0;
		this.anInt1811 = arg1;
		this.anInt1815 = arg2;
		this.anInt1813 = (arg1 - this.anInt1807) / arg0;
		this.anInt1808 = (local10 - this.anInt1814) / arg0;
		this.anInt1804 = (local14 - this.anInt1809) / arg0;
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V")
	private synchronized void method1208() {
		this.method1188(0, this.method1213());
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "()I")
	public synchronized int method1209() {
		return this.anInt1812 < 0 ? -this.anInt1812 : this.anInt1812;
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "()Z")
	public boolean method1211() {
		return this.anInt1805 != 0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()Lclient!ld;")
	@Override
	public Class4_Sub12 method1694() {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)V")
	public synchronized void method1212(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1803 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "()I")
	public synchronized int method1213() {
		return this.anInt1815 < 0 ? -1 : this.anInt1815;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1811 == 0 && this.anInt1805 == 0) {
			this.method1693(arg2);
			return;
		}
		@Pc(13) Class4_Sub6_Sub1 local13 = (Class4_Sub6_Sub1) super.aClass4_Sub6_5;
		@Pc(18) int local18 = this.anInt1810 << 8;
		@Pc(23) int local23 = this.anInt1806 << 8;
		@Pc(29) int local29 = local13.aByteArray46.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1816 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1803 < 0) {
			if (this.anInt1812 <= 0) {
				this.method1216();
				this.method2004();
				return;
			}
			this.anInt1803 = 0;
		}
		if (this.anInt1803 >= local29) {
			if (this.anInt1812 >= 0) {
				this.method1216();
				this.method2004();
				return;
			}
			this.anInt1803 = local29 - 1;
		}
		if (this.anInt1816 >= 0) {
			if (this.anInt1816 > 0) {
				if (this.aBoolean114) {
					label130: {
						if (this.anInt1812 < 0) {
							local40 = this.method1186(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt1810]);
							if (this.anInt1803 >= local18) {
								return;
							}
							this.anInt1803 = local18 + local18 - this.anInt1803 - 1;
							this.anInt1812 = -this.anInt1812;
							if (--this.anInt1816 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method1201(arg0, local40, local23, local44, local13.aByteArray46[this.anInt1806 - 1]);
							if (this.anInt1803 < local23) {
								return;
							}
							this.anInt1803 = local23 + local23 - this.anInt1803 - 1;
							this.anInt1812 = -this.anInt1812;
							if (--this.anInt1816 == 0) {
								break;
							}
							local40 = this.method1186(arg0, local40, local18, local44, local13.aByteArray46[this.anInt1810]);
							if (this.anInt1803 >= local18) {
								return;
							}
							this.anInt1803 = local18 + local18 - this.anInt1803 - 1;
							this.anInt1812 = -this.anInt1812;
						} while (--this.anInt1816 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1812 < 0) {
						while (true) {
							local40 = this.method1186(arg0, local40, local18, local44, local13.aByteArray46[this.anInt1806 - 1]);
							if (this.anInt1803 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1803 - 1) / local33;
							if (local416 >= this.anInt1816) {
								this.anInt1803 += local33 * this.anInt1816;
								this.anInt1816 = 0;
								break;
							}
							this.anInt1803 += local33 * local416;
							this.anInt1816 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method1201(arg0, local40, local23, local44, local13.aByteArray46[this.anInt1810]);
							if (this.anInt1803 < local23) {
								return;
							}
							local416 = (this.anInt1803 - local18) / local33;
							if (local416 >= this.anInt1816) {
								this.anInt1803 -= local33 * this.anInt1816;
								this.anInt1816 = 0;
								break;
							}
							this.anInt1803 -= local33 * local416;
							this.anInt1816 -= local416;
						}
					}
				}
			}
			if (this.anInt1812 < 0) {
				this.method1186(arg0, local40, 0, local44, 0);
				if (this.anInt1803 < 0) {
					this.anInt1803 = -1;
					this.method1216();
					this.method2004();
					return;
				}
			} else {
				this.method1201(arg0, local40, local29, local44, 0);
				if (this.anInt1803 >= local29) {
					this.anInt1803 = local29;
					this.method1216();
					this.method2004();
				}
			}
		} else if (this.aBoolean114) {
			if (this.anInt1812 < 0) {
				local40 = this.method1186(arg0, arg1, local18, local44, local13.aByteArray46[this.anInt1810]);
				if (this.anInt1803 >= local18) {
					return;
				}
				this.anInt1803 = local18 + local18 - this.anInt1803 - 1;
				this.anInt1812 = -this.anInt1812;
			}
			while (true) {
				local40 = this.method1201(arg0, local40, local23, local44, local13.aByteArray46[this.anInt1806 - 1]);
				if (this.anInt1803 < local23) {
					return;
				}
				this.anInt1803 = local23 + local23 - this.anInt1803 - 1;
				this.anInt1812 = -this.anInt1812;
				local40 = this.method1186(arg0, local40, local18, local44, local13.aByteArray46[this.anInt1810]);
				if (this.anInt1803 >= local18) {
					return;
				}
				this.anInt1803 = local18 + local18 - this.anInt1803 - 1;
				this.anInt1812 = -this.anInt1812;
			}
		} else if (this.anInt1812 < 0) {
			while (true) {
				local40 = this.method1186(arg0, local40, local18, local44, local13.aByteArray46[this.anInt1806 - 1]);
				if (this.anInt1803 >= local18) {
					return;
				}
				this.anInt1803 = local23 - (local23 - 1 - this.anInt1803) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1201(arg0, local40, local23, local44, local13.aByteArray46[this.anInt1810]);
				if (this.anInt1803 < local23) {
					return;
				}
				this.anInt1803 = local18 + (this.anInt1803 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "()V")
	private void method1216() {
		if (this.anInt1805 == 0) {
			return;
		}
		if (this.anInt1811 == Integer.MIN_VALUE) {
			this.anInt1811 = 0;
		}
		this.anInt1805 = 0;
		this.method1191();
	}

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)V")
	public synchronized void method1220(@OriginalArg(0) int arg0) {
		if (this.anInt1812 < 0) {
			this.anInt1812 = -arg0;
		} else {
			this.anInt1812 = arg0;
		}
	}

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "(I)V")
	public synchronized void method1221(@OriginalArg(0) int arg0) {
		this.method1188(arg0 << 6, this.method1213());
	}

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "()Z")
	private boolean method1222() {
		@Pc(2) int local2 = this.anInt1811;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static139.method1189(local2, this.anInt1815);
			local8 = Static139.method1194(local2, this.anInt1815);
		}
		if (this.anInt1807 != local2 || this.anInt1814 != local10 || this.anInt1809 != local8) {
			if (this.anInt1807 < local2) {
				this.anInt1813 = 1;
				this.anInt1805 = local2 - this.anInt1807;
			} else if (this.anInt1807 > local2) {
				this.anInt1813 = -1;
				this.anInt1805 = this.anInt1807 - local2;
			} else {
				this.anInt1813 = 0;
			}
			if (this.anInt1814 < local10) {
				this.anInt1808 = 1;
				if (this.anInt1805 == 0 || this.anInt1805 > local10 - this.anInt1814) {
					this.anInt1805 = local10 - this.anInt1814;
				}
			} else if (this.anInt1814 > local10) {
				this.anInt1808 = -1;
				if (this.anInt1805 == 0 || this.anInt1805 > this.anInt1814 - local10) {
					this.anInt1805 = this.anInt1814 - local10;
				}
			} else {
				this.anInt1808 = 0;
			}
			if (this.anInt1809 < local8) {
				this.anInt1804 = 1;
				if (this.anInt1805 == 0 || this.anInt1805 > local8 - this.anInt1809) {
					this.anInt1805 = local8 - this.anInt1809;
				}
			} else if (this.anInt1809 > local8) {
				this.anInt1804 = -1;
				if (this.anInt1805 == 0 || this.anInt1805 > this.anInt1809 - local8) {
					this.anInt1805 = this.anInt1809 - local8;
				}
			} else {
				this.anInt1804 = 0;
			}
			return false;
		} else if (this.anInt1811 == Integer.MIN_VALUE) {
			this.anInt1811 = 0;
			this.anInt1807 = this.anInt1814 = this.anInt1809 = 0;
			this.method2004();
			return true;
		} else {
			this.method1191();
			return false;
		}
	}

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "()Z")
	public boolean method1223() {
		return this.anInt1803 < 0 || this.anInt1803 >= ((Class4_Sub6_Sub1) super.aClass4_Sub6_5).aByteArray46.length << 8;
	}
}
