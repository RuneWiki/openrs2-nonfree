import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
	private int anInt99;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	private final int anInt105;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
	private final int anInt111;

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "Z")
	private final boolean aBoolean8;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
	public int anInt110;

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!na;II)V")
	public Class1_Sub2_Sub1(@OriginalArg(0) Class1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub4_3 = arg0;
		this.anInt105 = arg0.anInt1631;
		this.anInt111 = arg0.anInt1629;
		this.aBoolean8 = arg0.aBoolean90;
		this.anInt108 = arg1;
		this.anInt101 = arg2;
		this.anInt110 = 128;
		this.anInt102 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIII)I")
	private int method98(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt100 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt100;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt100 += arg1;
			if (this.anInt108 == -256 && (this.anInt102 & 0xFF) == 0) {
				if (Static86.aBoolean123) {
					arg1 = Static122.method101(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt110, this.anInt109, this.anInt103, this.anInt107, local7, arg2, this);
				} else {
					arg1 = Static122.method103(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt109, this.anInt103, local7, arg2, this);
				}
			} else if (Static86.aBoolean123) {
				arg1 = Static122.method102(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt110, this.anInt109, this.anInt103, this.anInt107, local7, arg2, this, this.anInt108, arg4);
			} else {
				arg1 = Static122.method123(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt109, this.anInt103, local7, arg2, this, this.anInt108, arg4);
			}
			this.anInt100 -= arg1;
			if (this.anInt100 != 0) {
				return arg1;
			}
			this.anInt110 = this.anInt106;
			if (this.anInt104 == Integer.MIN_VALUE) {
				this.anInt101 = 0;
				this.method2076();
				return arg3;
			}
			this.anInt101 = this.anInt104;
		}
		if (this.anInt108 == -256 && (this.anInt102 & 0xFF) == 0) {
			return Static86.aBoolean123 ? Static122.method119(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.method118(), this.method109(), arg3, arg2, this) : Static122.method110(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, arg3, arg2, this);
		} else if (Static86.aBoolean123) {
			return Static122.method121(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.method118(), this.method109(), arg3, arg2, this, this.anInt108, arg4);
		} else {
			return Static122.method117(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, arg3, arg2, this, this.anInt108, arg4);
		}
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	public synchronized void method99(@OriginalArg(0) int arg0) {
		this.anInt99 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
	@Override
	public int method1517() {
		@Pc(4) int local4 = this.anInt101 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt99 == 0) {
			local4 -= local4 * this.anInt102 / (((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21.length << 8);
		} else if (this.anInt99 >= 0) {
			local4 -= local4 * this.anInt105 / ((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()I")
	@Override
	public int method1513() {
		return this.anInt101 == 0 && (this.anInt100 == 0 || this.anInt104 == 0 || this.anInt104 == Integer.MIN_VALUE) ? 0 : 1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	private synchronized void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt101 = arg0;
		this.anInt110 = arg1;
		this.anInt100 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method1515(@OriginalArg(0) int arg0) {
		if (this.method108()) {
			return;
		}
		if (this.anInt100 > 0) {
			if (arg0 >= this.anInt100) {
				if (this.anInt104 == Integer.MIN_VALUE) {
					this.anInt101 = 0;
					this.method2076();
					arg0 = this.anInt100;
				} else {
					this.anInt101 = this.anInt104;
				}
				this.anInt110 = this.anInt106;
				this.anInt100 = 0;
			} else {
				this.anInt101 += this.anInt103 * arg0;
				if (Static86.aBoolean123) {
					this.anInt110 += this.anInt107 * arg0;
				}
				this.anInt100 -= arg0;
			}
		}
		@Pc(66) Class1_Sub4_Sub1 local66 = (Class1_Sub4_Sub1) super.aClass1_Sub4_3;
		@Pc(71) int local71 = this.anInt105 << 8;
		@Pc(76) int local76 = this.anInt111 << 8;
		@Pc(82) int local82 = local66.aByteArray21.length << 8;
		@Pc(86) int local86 = local76 - local71;
		if (local86 <= 0) {
			this.anInt99 = 0;
		}
		if (this.anInt102 < 0) {
			if (this.anInt108 <= 0) {
				this.method112();
				this.method2076();
				return;
			}
			this.anInt102 = 0;
		}
		if (this.anInt102 >= local82) {
			if (this.anInt108 >= 0) {
				this.method112();
				this.method2076();
				return;
			}
			this.anInt102 = local82 - 1;
		}
		this.anInt102 += this.anInt108 * arg0;
		if (this.anInt99 >= 0) {
			if (this.anInt99 > 0) {
				if (this.aBoolean8) {
					label133: {
						if (this.anInt108 < 0) {
							if (this.anInt102 >= local71) {
								return;
							}
							this.anInt102 = local71 + local71 - this.anInt102 - 1;
							this.anInt108 = -this.anInt108;
							if (--this.anInt99 == 0) {
								break label133;
							}
						}
						do {
							if (this.anInt102 < local76) {
								return;
							}
							this.anInt102 = local76 + local76 - this.anInt102 - 1;
							this.anInt108 = -this.anInt108;
							if (--this.anInt99 == 0) {
								break;
							}
							if (this.anInt102 >= local71) {
								return;
							}
							this.anInt102 = local71 + local71 - this.anInt102 - 1;
							this.anInt108 = -this.anInt108;
						} while (--this.anInt99 != 0);
					}
				} else {
					@Pc(356) int local356;
					if (this.anInt108 < 0) {
						if (this.anInt102 >= local71) {
							return;
						}
						local356 = (local76 - this.anInt102 - 1) / local86;
						if (local356 < this.anInt99) {
							this.anInt102 += local86 * local356;
							this.anInt99 -= local356;
							return;
						}
						this.anInt102 += local86 * this.anInt99;
						this.anInt99 = 0;
					} else if (this.anInt102 >= local76) {
						local356 = (this.anInt102 - local71) / local86;
						if (local356 < this.anInt99) {
							this.anInt102 -= local86 * local356;
							this.anInt99 -= local356;
							return;
						}
						this.anInt102 -= local86 * this.anInt99;
						this.anInt99 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt108 < 0) {
				if (this.anInt102 < 0) {
					this.anInt102 = -1;
					this.method112();
					this.method2076();
					return;
				}
			} else if (this.anInt102 >= local82) {
				this.anInt102 = local82;
				this.method112();
				this.method2076();
			}
		} else if (this.aBoolean8) {
			if (this.anInt108 < 0) {
				if (this.anInt102 >= local71) {
					return;
				}
				this.anInt102 = local71 + local71 - this.anInt102 - 1;
				this.anInt108 = -this.anInt108;
			}
			while (this.anInt102 >= local76) {
				this.anInt102 = local76 + local76 - this.anInt102 - 1;
				this.anInt108 = -this.anInt108;
				if (this.anInt102 >= local71) {
					return;
				}
				this.anInt102 = local71 + local71 - this.anInt102 - 1;
				this.anInt108 = -this.anInt108;
			}
		} else if (this.anInt108 < 0) {
			if (this.anInt102 < local71) {
				this.anInt102 = local76 - (local76 - 1 - this.anInt102) % local86 - 1;
			}
		} else if (this.anInt102 >= local76) {
			this.anInt102 = local71 + (this.anInt102 - local71) % local86;
		}
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "()Z")
	private boolean method108() {
		if (this.anInt100 != 0 && Static86.aBoolean123 != (this.anInt107 != Integer.MIN_VALUE)) {
			this.anInt101 = this.anInt104 == Integer.MIN_VALUE ? 0 : this.anInt104;
			this.anInt110 = this.anInt106;
			this.anInt100 = 0;
			if (this.anInt104 == Integer.MIN_VALUE) {
				this.method2076();
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "()I")
	private int method109() {
		return this.anInt110 < 0 ? -this.anInt101 : (int) ((double) this.anInt101 * Math.sqrt((double) this.anInt110 * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()Lclient!mc;")
	@Override
	public Class1_Sub2 method1518() {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "()V")
	private void method112() {
		if (this.anInt100 != 0) {
			this.anInt101 = this.anInt104 == Integer.MIN_VALUE ? 0 : this.anInt104;
			this.anInt110 = this.anInt106;
			this.anInt100 = 0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "()I")
	private synchronized int method113() {
		return this.anInt100 > 0 ? this.anInt106 : this.anInt110;
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
	public synchronized void method115(@OriginalArg(0) int arg0) {
		this.method106(arg0, this.method113());
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.method108()) {
			return;
		}
		if (this.anInt101 == 0 && (this.anInt100 == 0 || this.anInt104 == 0 || this.anInt104 == Integer.MIN_VALUE)) {
			this.method1515(arg2);
			return;
		}
		@Pc(24) Class1_Sub4_Sub1 local24 = (Class1_Sub4_Sub1) super.aClass1_Sub4_3;
		@Pc(29) int local29 = this.anInt105 << 8;
		@Pc(34) int local34 = this.anInt111 << 8;
		@Pc(40) int local40 = local24.aByteArray21.length << 8;
		@Pc(44) int local44 = local34 - local29;
		if (local44 <= 0) {
			this.anInt99 = 0;
		}
		@Pc(51) int local51 = arg1;
		@Pc(55) int local55 = arg2 + arg1;
		if (this.anInt102 < 0) {
			if (this.anInt108 <= 0) {
				this.method112();
				this.method2076();
				return;
			}
			this.anInt102 = 0;
		}
		if (this.anInt102 >= local40) {
			if (this.anInt108 >= 0) {
				this.method112();
				this.method2076();
				return;
			}
			this.anInt102 = local40 - 1;
		}
		if (this.anInt99 >= 0) {
			if (this.anInt99 > 0) {
				if (this.aBoolean8) {
					label134: {
						if (this.anInt108 < 0) {
							local51 = this.method98(arg0, arg1, local29, local55, local24.aByteArray21[this.anInt105]);
							if (this.anInt102 >= local29) {
								return;
							}
							this.anInt102 = local29 + local29 - this.anInt102 - 1;
							this.anInt108 = -this.anInt108;
							if (--this.anInt99 == 0) {
								break label134;
							}
						}
						do {
							local51 = this.method116(arg0, local51, local34, local55, local24.aByteArray21[this.anInt111 - 1]);
							if (this.anInt102 < local34) {
								return;
							}
							this.anInt102 = local34 + local34 - this.anInt102 - 1;
							this.anInt108 = -this.anInt108;
							if (--this.anInt99 == 0) {
								break;
							}
							local51 = this.method98(arg0, local51, local29, local55, local24.aByteArray21[this.anInt105]);
							if (this.anInt102 >= local29) {
								return;
							}
							this.anInt102 = local29 + local29 - this.anInt102 - 1;
							this.anInt108 = -this.anInt108;
						} while (--this.anInt99 != 0);
					}
				} else {
					@Pc(427) int local427;
					if (this.anInt108 < 0) {
						while (true) {
							local51 = this.method98(arg0, local51, local29, local55, local24.aByteArray21[this.anInt111 - 1]);
							if (this.anInt102 >= local29) {
								return;
							}
							local427 = (local34 - this.anInt102 - 1) / local44;
							if (local427 >= this.anInt99) {
								this.anInt102 += local44 * this.anInt99;
								this.anInt99 = 0;
								break;
							}
							this.anInt102 += local44 * local427;
							this.anInt99 -= local427;
						}
					} else {
						while (true) {
							local51 = this.method116(arg0, local51, local34, local55, local24.aByteArray21[this.anInt105]);
							if (this.anInt102 < local34) {
								return;
							}
							local427 = (this.anInt102 - local29) / local44;
							if (local427 >= this.anInt99) {
								this.anInt102 -= local44 * this.anInt99;
								this.anInt99 = 0;
								break;
							}
							this.anInt102 -= local44 * local427;
							this.anInt99 -= local427;
						}
					}
				}
			}
			if (this.anInt108 < 0) {
				this.method98(arg0, local51, 0, local55, 0);
				if (this.anInt102 < 0) {
					this.anInt102 = -1;
					this.method112();
					this.method2076();
					return;
				}
			} else {
				this.method116(arg0, local51, local40, local55, 0);
				if (this.anInt102 >= local40) {
					this.anInt102 = local40;
					this.method112();
					this.method2076();
				}
			}
		} else if (this.aBoolean8) {
			if (this.anInt108 < 0) {
				local51 = this.method98(arg0, arg1, local29, local55, local24.aByteArray21[this.anInt105]);
				if (this.anInt102 >= local29) {
					return;
				}
				this.anInt102 = local29 + local29 - this.anInt102 - 1;
				this.anInt108 = -this.anInt108;
			}
			while (true) {
				local51 = this.method116(arg0, local51, local34, local55, local24.aByteArray21[this.anInt111 - 1]);
				if (this.anInt102 < local34) {
					return;
				}
				this.anInt102 = local34 + local34 - this.anInt102 - 1;
				this.anInt108 = -this.anInt108;
				local51 = this.method98(arg0, local51, local29, local55, local24.aByteArray21[this.anInt105]);
				if (this.anInt102 >= local29) {
					return;
				}
				this.anInt102 = local29 + local29 - this.anInt102 - 1;
				this.anInt108 = -this.anInt108;
			}
		} else if (this.anInt108 < 0) {
			while (true) {
				local51 = this.method98(arg0, local51, local29, local55, local24.aByteArray21[this.anInt111 - 1]);
				if (this.anInt102 >= local29) {
					return;
				}
				this.anInt102 = local34 - (local34 - 1 - this.anInt102) % local44 - 1;
			}
		} else {
			while (true) {
				local51 = this.method116(arg0, local51, local34, local55, local24.aByteArray21[this.anInt105]);
				if (this.anInt102 < local34) {
					return;
				}
				this.anInt102 = local29 + (this.anInt102 - local29) % local44;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "([IIIII)I")
	private int method116(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt100 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt100;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt100 += arg1;
			if (this.anInt108 == 256 && (this.anInt102 & 0xFF) == 0) {
				if (Static86.aBoolean123) {
					arg1 = Static122.method120(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt110, this.anInt109, this.anInt103, this.anInt107, local7, arg2, this);
				} else {
					arg1 = Static122.method100(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt109, this.anInt103, local7, arg2, this);
				}
			} else if (Static86.aBoolean123) {
				arg1 = Static122.method107(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt110, this.anInt109, this.anInt103, this.anInt107, local7, arg2, this, this.anInt108, arg4);
			} else {
				arg1 = Static122.method105(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, this.anInt109, this.anInt103, local7, arg2, this, this.anInt108, arg4);
			}
			this.anInt100 -= arg1;
			if (this.anInt100 != 0) {
				return arg1;
			}
			this.anInt110 = this.anInt106;
			if (this.anInt104 == Integer.MIN_VALUE) {
				this.anInt101 = 0;
				this.method2076();
				return arg3;
			}
			this.anInt101 = this.anInt104;
		}
		if (this.anInt108 == 256 && (this.anInt102 & 0xFF) == 0) {
			return Static86.aBoolean123 ? Static122.method111(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.method118(), this.method109(), arg3, arg2, this) : Static122.method114(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, arg3, arg2, this);
		} else if (Static86.aBoolean123) {
			return Static122.method104(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.method118(), this.method109(), arg3, arg2, this, this.anInt108, arg4);
		} else {
			return Static122.method122(((Class1_Sub4_Sub1) super.aClass1_Sub4_3).aByteArray21, arg0, this.anInt102, arg1, this.anInt101, arg3, arg2, this, this.anInt108, arg4);
		}
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "()I")
	private int method118() {
		return this.anInt110 < 0 ? this.anInt101 : (int) ((double) this.anInt101 * Math.sqrt((double) (256 - this.anInt110) * 0.0078125D) + 0.5D);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()Lclient!mc;")
	@Override
	public Class1_Sub2 method1514() {
		return null;
	}
}
