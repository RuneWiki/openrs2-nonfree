import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class10_Sub5_Sub2 extends Class10_Sub5 {

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	private int anInt1579;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	private int anInt1580;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private int anInt1581;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	private int anInt1582;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	private int anInt1587;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
	private final int anInt1585;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	private final int anInt1586;

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
	private int anInt1588;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public int anInt1584;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	public int anInt1583;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!oc;II)V")
	public Class10_Sub5_Sub2(@OriginalArg(0) Class10_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass10_Sub9_3 = arg0;
		this.anInt1585 = arg0.anInt1841;
		this.anInt1586 = arg0.anInt1840;
		this.anInt1588 = arg1;
		this.anInt1584 = arg2;
		this.anInt1583 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()I")
	@Override
	public int method880() {
		@Pc(4) int local4 = this.anInt1584 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt1579 == 0) {
			local4 -= local4 * this.anInt1583 / (((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6.length << 8);
		} else if (this.anInt1579 >= 0) {
			local4 -= local4 * this.anInt1585 / ((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method879(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1584 == 0 && (this.anInt1582 == 0 || this.anInt1587 == 0 || this.anInt1587 == Integer.MIN_VALUE)) {
			this.method881(arg2);
			return 0;
		}
		@Pc(21) Class10_Sub9_Sub1 local21 = (Class10_Sub9_Sub1) super.aClass10_Sub9_3;
		@Pc(26) int local26 = this.anInt1585 << 8;
		@Pc(31) int local31 = this.anInt1586 << 8;
		@Pc(37) int local37 = local21.aByteArray6.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt1579 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt1579 >= 0) {
			if (this.anInt1579 > 0) {
				if (this.aBoolean78) {
					label118: {
						if (this.anInt1588 < 0) {
							local48 = this.method889(arg0, arg1, local26, local52, local21.aByteArray6[this.anInt1585]);
							if (this.anInt1583 >= local26) {
								return 1;
							}
							this.anInt1583 = local26 + local26 - this.anInt1583 - 1;
							this.anInt1588 = -this.anInt1588;
							if (--this.anInt1579 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method892(arg0, local48, local31, local52, local21.aByteArray6[this.anInt1586 - 1]);
							if (this.anInt1583 < local31) {
								return 1;
							}
							this.anInt1583 = local31 + local31 - this.anInt1583 - 1;
							this.anInt1588 = -this.anInt1588;
							if (--this.anInt1579 == 0) {
								break;
							}
							local48 = this.method889(arg0, local48, local26, local52, local21.aByteArray6[this.anInt1585]);
							if (this.anInt1583 >= local26) {
								return 1;
							}
							this.anInt1583 = local26 + local26 - this.anInt1583 - 1;
							this.anInt1588 = -this.anInt1588;
						} while (--this.anInt1579 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt1588 < 0) {
						while (true) {
							local48 = this.method889(arg0, local48, local26, local52, local21.aByteArray6[this.anInt1586 - 1]);
							if (this.anInt1583 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt1583 - 1) / local41;
							if (local398 >= this.anInt1579) {
								this.anInt1583 += local41 * this.anInt1579;
								this.anInt1579 = 0;
								break;
							}
							this.anInt1583 += local41 * local398;
							this.anInt1579 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method892(arg0, local48, local31, local52, local21.aByteArray6[this.anInt1585]);
							if (this.anInt1583 < local31) {
								return 1;
							}
							local398 = (this.anInt1583 - local26) / local41;
							if (local398 >= this.anInt1579) {
								this.anInt1583 -= local41 * this.anInt1579;
								this.anInt1579 = 0;
								break;
							}
							this.anInt1583 -= local41 * local398;
							this.anInt1579 -= local398;
						}
					}
				}
			}
			if (this.anInt1588 < 0) {
				this.method889(arg0, local48, 0, local52, 0);
				if (this.anInt1583 < 0) {
					this.anInt1583 = 0;
					this.method1654();
				}
			} else {
				this.method892(arg0, local48, local37, local52, 0);
				if (this.anInt1583 >= local37) {
					this.anInt1583 = local37 - 1;
					this.method1654();
				}
			}
			return 1;
		} else if (this.aBoolean78) {
			if (this.anInt1588 < 0) {
				local48 = this.method889(arg0, arg1, local26, local52, local21.aByteArray6[this.anInt1585]);
				if (this.anInt1583 >= local26) {
					return 1;
				}
				this.anInt1583 = local26 + local26 - this.anInt1583 - 1;
				this.anInt1588 = -this.anInt1588;
			}
			while (true) {
				local48 = this.method892(arg0, local48, local31, local52, local21.aByteArray6[this.anInt1586 - 1]);
				if (this.anInt1583 < local31) {
					return 1;
				}
				this.anInt1583 = local31 + local31 - this.anInt1583 - 1;
				this.anInt1588 = -this.anInt1588;
				local48 = this.method889(arg0, local48, local26, local52, local21.aByteArray6[this.anInt1585]);
				if (this.anInt1583 >= local26) {
					return 1;
				}
				this.anInt1583 = local26 + local26 - this.anInt1583 - 1;
				this.anInt1588 = -this.anInt1588;
			}
		} else if (this.anInt1588 < 0) {
			while (true) {
				local48 = this.method889(arg0, local48, local26, local52, local21.aByteArray6[this.anInt1586 - 1]);
				if (this.anInt1583 >= local26) {
					return 1;
				}
				this.anInt1583 = local31 - (local31 - 1 - this.anInt1583) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method892(arg0, local48, local31, local52, local21.aByteArray6[this.anInt1585]);
				if (this.anInt1583 < local31) {
					return 1;
				}
				this.anInt1583 = local26 + (this.anInt1583 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public synchronized void method888(@OriginalArg(0) int arg0) {
		this.anInt1579 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIII)I")
	private int method889(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1582 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1582;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1582 += arg1;
			if (this.anInt1588 == -256 && (this.anInt1583 & 0xFF) == 0) {
				arg1 = Static113.method886(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, this.anInt1581, this.anInt1580, local7, arg2, this);
			} else {
				arg1 = Static113.method885(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, this.anInt1581, this.anInt1580, local7, arg2, this, this.anInt1588, arg4);
			}
			this.anInt1582 -= arg1;
			if (this.anInt1582 != 0) {
				return arg1;
			}
			if (this.anInt1587 == Integer.MIN_VALUE) {
				this.method1654();
				return arg3;
			}
			this.anInt1584 = this.anInt1587;
		}
		return this.anInt1588 == -256 && (this.anInt1583 & 0xFF) == 0 ? Static113.method891(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, arg3, arg2, this) : Static113.method882(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, arg3, arg2, this, this.anInt1588, arg4);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method881(@OriginalArg(0) int arg0) {
		if (this.anInt1582 > 0) {
			if (arg0 >= this.anInt1582) {
				if (this.anInt1587 == Integer.MIN_VALUE) {
					this.method1654();
					arg0 = this.anInt1582;
				} else {
					this.anInt1584 = this.anInt1587;
				}
				this.anInt1582 = 0;
			} else {
				this.anInt1584 += this.anInt1580 * arg0;
				this.anInt1582 -= arg0;
			}
		}
		this.anInt1583 += this.anInt1588 * arg0;
		@Pc(53) Class10_Sub9_Sub1 local53 = (Class10_Sub9_Sub1) super.aClass10_Sub9_3;
		@Pc(58) int local58 = this.anInt1585 << 8;
		@Pc(63) int local63 = this.anInt1586 << 8;
		@Pc(69) int local69 = local53.aByteArray6.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt1579 = 0;
		}
		if (this.anInt1579 >= 0) {
			if (this.anInt1579 > 0) {
				if (this.aBoolean78) {
					label113: {
						if (this.anInt1588 < 0) {
							if (this.anInt1583 >= local58) {
								return;
							}
							this.anInt1583 = local58 + local58 - this.anInt1583 - 1;
							this.anInt1588 = -this.anInt1588;
							if (--this.anInt1579 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt1583 < local63) {
								return;
							}
							this.anInt1583 = local63 + local63 - this.anInt1583 - 1;
							this.anInt1588 = -this.anInt1588;
							if (--this.anInt1579 == 0) {
								break;
							}
							if (this.anInt1583 >= local58) {
								return;
							}
							this.anInt1583 = local58 + local58 - this.anInt1583 - 1;
							this.anInt1588 = -this.anInt1588;
						} while (--this.anInt1579 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt1588 < 0) {
						if (this.anInt1583 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt1583 - 1) / local73;
						if (local299 < this.anInt1579) {
							this.anInt1583 += local73 * local299;
							this.anInt1579 -= local299;
							return;
						}
						this.anInt1583 += local73 * this.anInt1579;
						this.anInt1579 = 0;
					} else if (this.anInt1583 >= local63) {
						local299 = (this.anInt1583 - local58) / local73;
						if (local299 < this.anInt1579) {
							this.anInt1583 -= local73 * local299;
							this.anInt1579 -= local299;
							return;
						}
						this.anInt1583 -= local73 * this.anInt1579;
						this.anInt1579 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1588 < 0) {
				if (this.anInt1583 < 0) {
					this.anInt1583 = 0;
					this.method1654();
					return;
				}
			} else if (this.anInt1583 >= local69) {
				this.anInt1583 = local69 - 1;
				this.method1654();
			}
		} else if (this.aBoolean78) {
			if (this.anInt1588 < 0) {
				if (this.anInt1583 >= local58) {
					return;
				}
				this.anInt1583 = local58 + local58 - this.anInt1583 - 1;
				this.anInt1588 = -this.anInt1588;
			}
			while (this.anInt1583 >= local63) {
				this.anInt1583 = local63 + local63 - this.anInt1583 - 1;
				this.anInt1588 = -this.anInt1588;
				if (this.anInt1583 >= local58) {
					return;
				}
				this.anInt1583 = local58 + local58 - this.anInt1583 - 1;
				this.anInt1588 = -this.anInt1588;
			}
		} else if (this.anInt1588 < 0) {
			if (this.anInt1583 < local58) {
				this.anInt1583 = local63 - (local63 - 1 - this.anInt1583) % local73 - 1;
			}
		} else if (this.anInt1583 >= local63) {
			this.anInt1583 = local58 + (this.anInt1583 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "([IIIII)I")
	private int method892(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1582 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1582;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1582 += arg1;
			if (this.anInt1588 == 256 && (this.anInt1583 & 0xFF) == 0) {
				arg1 = Static113.method893(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, this.anInt1581, this.anInt1580, local7, arg2, this);
			} else {
				arg1 = Static113.method884(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, this.anInt1581, this.anInt1580, local7, arg2, this, this.anInt1588, arg4);
			}
			this.anInt1582 -= arg1;
			if (this.anInt1582 != 0) {
				return arg1;
			}
			if (this.anInt1587 == Integer.MIN_VALUE) {
				this.method1654();
				return arg3;
			}
			this.anInt1584 = this.anInt1587;
		}
		return this.anInt1588 == 256 && (this.anInt1583 & 0xFF) == 0 ? Static113.method883(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, arg3, arg2, this) : Static113.method887(((Class10_Sub9_Sub1) super.aClass10_Sub9_3).aByteArray6, arg0, this.anInt1583, arg1, this.anInt1584, arg3, arg2, this, this.anInt1588, arg4);
	}
}
