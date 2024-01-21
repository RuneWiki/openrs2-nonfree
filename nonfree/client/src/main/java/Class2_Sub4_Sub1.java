import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
	private int anInt651;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	private final int anInt646;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
	private final int anInt648;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!qa;II)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) Class2_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub8_3 = arg0;
		this.anInt646 = arg0.anInt2288;
		this.anInt648 = arg0.anInt2287;
		this.anInt643 = arg1;
		this.anInt650 = arg2;
		this.anInt649 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIII)I")
	private int method477(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt645 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt645;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt645 += arg1;
			if (this.anInt643 == 256 && (this.anInt649 & 0xFF) == 0) {
				arg1 = Static111.method483(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, this.anInt651, this.anInt644, local7, arg2, this);
			} else {
				arg1 = Static111.method482(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, this.anInt651, this.anInt644, local7, arg2, this, this.anInt643, arg4);
			}
			this.anInt645 -= arg1;
			if (this.anInt645 != 0) {
				return arg1;
			}
			if (this.anInt652 == Integer.MIN_VALUE) {
				this.method2045();
				return arg3;
			}
			this.anInt650 = this.anInt652;
		}
		return this.anInt643 == 256 && (this.anInt649 & 0xFF) == 0 ? Static111.method476(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, arg3, arg2, this) : Static111.method479(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, arg3, arg2, this, this.anInt643, arg4);
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public synchronized void method480(@OriginalArg(0) int arg0) {
		this.anInt650 = arg0;
		this.anInt645 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
	@Override
	public int method1657() {
		@Pc(4) int local4 = this.anInt650 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt647 == 0) {
			local4 -= local4 * this.anInt649 / (((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19.length << 8);
		} else if (this.anInt647 >= 0) {
			local4 -= local4 * this.anInt646 / ((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public synchronized void method484(@OriginalArg(0) int arg0) {
		this.anInt647 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "([IIIII)I")
	private int method485(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt645 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt645;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt645 += arg1;
			if (this.anInt643 == -256 && (this.anInt649 & 0xFF) == 0) {
				arg1 = Static111.method475(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, this.anInt651, this.anInt644, local7, arg2, this);
			} else {
				arg1 = Static111.method478(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, this.anInt651, this.anInt644, local7, arg2, this, this.anInt643, arg4);
			}
			this.anInt645 -= arg1;
			if (this.anInt645 != 0) {
				return arg1;
			}
			if (this.anInt652 == Integer.MIN_VALUE) {
				this.method2045();
				return arg3;
			}
			this.anInt650 = this.anInt652;
		}
		return this.anInt643 == -256 && (this.anInt649 & 0xFF) == 0 ? Static111.method481(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, arg3, arg2, this) : Static111.method473(((Class2_Sub8_Sub1) super.aClass2_Sub8_3).aByteArray19, arg0, this.anInt649, arg1, this.anInt650, arg3, arg2, this, this.anInt643, arg4);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1655(@OriginalArg(0) int arg0) {
		if (this.anInt645 > 0) {
			if (arg0 >= this.anInt645) {
				if (this.anInt652 == Integer.MIN_VALUE) {
					this.method2045();
					arg0 = this.anInt645;
				} else {
					this.anInt650 = this.anInt652;
				}
				this.anInt645 = 0;
			} else {
				this.anInt650 += this.anInt644 * arg0;
				this.anInt645 -= arg0;
			}
		}
		this.anInt649 += this.anInt643 * arg0;
		@Pc(53) Class2_Sub8_Sub1 local53 = (Class2_Sub8_Sub1) super.aClass2_Sub8_3;
		@Pc(58) int local58 = this.anInt646 << 8;
		@Pc(63) int local63 = this.anInt648 << 8;
		@Pc(69) int local69 = local53.aByteArray19.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt647 = 0;
		}
		if (this.anInt647 >= 0) {
			if (this.anInt647 > 0) {
				if (this.aBoolean39) {
					label113: {
						if (this.anInt643 < 0) {
							if (this.anInt649 >= local58) {
								return;
							}
							this.anInt649 = local58 + local58 - this.anInt649 - 1;
							this.anInt643 = -this.anInt643;
							if (--this.anInt647 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt649 < local63) {
								return;
							}
							this.anInt649 = local63 + local63 - this.anInt649 - 1;
							this.anInt643 = -this.anInt643;
							if (--this.anInt647 == 0) {
								break;
							}
							if (this.anInt649 >= local58) {
								return;
							}
							this.anInt649 = local58 + local58 - this.anInt649 - 1;
							this.anInt643 = -this.anInt643;
						} while (--this.anInt647 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt643 < 0) {
						if (this.anInt649 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt649 - 1) / local73;
						if (local299 < this.anInt647) {
							this.anInt649 += local73 * local299;
							this.anInt647 -= local299;
							return;
						}
						this.anInt649 += local73 * this.anInt647;
						this.anInt647 = 0;
					} else if (this.anInt649 >= local63) {
						local299 = (this.anInt649 - local58) / local73;
						if (local299 < this.anInt647) {
							this.anInt649 -= local73 * local299;
							this.anInt647 -= local299;
							return;
						}
						this.anInt649 -= local73 * this.anInt647;
						this.anInt647 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt643 < 0) {
				if (this.anInt649 < 0) {
					this.anInt649 = 0;
					this.method2045();
					return;
				}
			} else if (this.anInt649 >= local69) {
				this.anInt649 = local69 - 1;
				this.method2045();
			}
		} else if (this.aBoolean39) {
			if (this.anInt643 < 0) {
				if (this.anInt649 >= local58) {
					return;
				}
				this.anInt649 = local58 + local58 - this.anInt649 - 1;
				this.anInt643 = -this.anInt643;
			}
			while (this.anInt649 >= local63) {
				this.anInt649 = local63 + local63 - this.anInt649 - 1;
				this.anInt643 = -this.anInt643;
				if (this.anInt649 >= local58) {
					return;
				}
				this.anInt649 = local58 + local58 - this.anInt649 - 1;
				this.anInt643 = -this.anInt643;
			}
		} else if (this.anInt643 < 0) {
			if (this.anInt649 < local58) {
				this.anInt649 = local63 - (local63 - 1 - this.anInt649) % local73 - 1;
			}
		} else if (this.anInt649 >= local63) {
			this.anInt649 = local58 + (this.anInt649 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1656(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt650 == 0 && (this.anInt645 == 0 || this.anInt652 == 0 || this.anInt652 == Integer.MIN_VALUE)) {
			this.method1655(arg2);
			return 0;
		}
		@Pc(21) Class2_Sub8_Sub1 local21 = (Class2_Sub8_Sub1) super.aClass2_Sub8_3;
		@Pc(26) int local26 = this.anInt646 << 8;
		@Pc(31) int local31 = this.anInt648 << 8;
		@Pc(37) int local37 = local21.aByteArray19.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt647 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt647 >= 0) {
			if (this.anInt647 > 0) {
				if (this.aBoolean39) {
					label118: {
						if (this.anInt643 < 0) {
							local48 = this.method485(arg0, arg1, local26, local52, local21.aByteArray19[this.anInt646]);
							if (this.anInt649 >= local26) {
								return 1;
							}
							this.anInt649 = local26 + local26 - this.anInt649 - 1;
							this.anInt643 = -this.anInt643;
							if (--this.anInt647 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method477(arg0, local48, local31, local52, local21.aByteArray19[this.anInt648 - 1]);
							if (this.anInt649 < local31) {
								return 1;
							}
							this.anInt649 = local31 + local31 - this.anInt649 - 1;
							this.anInt643 = -this.anInt643;
							if (--this.anInt647 == 0) {
								break;
							}
							local48 = this.method485(arg0, local48, local26, local52, local21.aByteArray19[this.anInt646]);
							if (this.anInt649 >= local26) {
								return 1;
							}
							this.anInt649 = local26 + local26 - this.anInt649 - 1;
							this.anInt643 = -this.anInt643;
						} while (--this.anInt647 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt643 < 0) {
						while (true) {
							local48 = this.method485(arg0, local48, local26, local52, local21.aByteArray19[this.anInt648 - 1]);
							if (this.anInt649 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt649 - 1) / local41;
							if (local398 >= this.anInt647) {
								this.anInt649 += local41 * this.anInt647;
								this.anInt647 = 0;
								break;
							}
							this.anInt649 += local41 * local398;
							this.anInt647 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method477(arg0, local48, local31, local52, local21.aByteArray19[this.anInt646]);
							if (this.anInt649 < local31) {
								return 1;
							}
							local398 = (this.anInt649 - local26) / local41;
							if (local398 >= this.anInt647) {
								this.anInt649 -= local41 * this.anInt647;
								this.anInt647 = 0;
								break;
							}
							this.anInt649 -= local41 * local398;
							this.anInt647 -= local398;
						}
					}
				}
			}
			if (this.anInt643 < 0) {
				this.method485(arg0, local48, 0, local52, 0);
				if (this.anInt649 < 0) {
					this.anInt649 = 0;
					this.method2045();
				}
			} else {
				this.method477(arg0, local48, local37, local52, 0);
				if (this.anInt649 >= local37) {
					this.anInt649 = local37 - 1;
					this.method2045();
				}
			}
			return 1;
		} else if (this.aBoolean39) {
			if (this.anInt643 < 0) {
				local48 = this.method485(arg0, arg1, local26, local52, local21.aByteArray19[this.anInt646]);
				if (this.anInt649 >= local26) {
					return 1;
				}
				this.anInt649 = local26 + local26 - this.anInt649 - 1;
				this.anInt643 = -this.anInt643;
			}
			while (true) {
				local48 = this.method477(arg0, local48, local31, local52, local21.aByteArray19[this.anInt648 - 1]);
				if (this.anInt649 < local31) {
					return 1;
				}
				this.anInt649 = local31 + local31 - this.anInt649 - 1;
				this.anInt643 = -this.anInt643;
				local48 = this.method485(arg0, local48, local26, local52, local21.aByteArray19[this.anInt646]);
				if (this.anInt649 >= local26) {
					return 1;
				}
				this.anInt649 = local26 + local26 - this.anInt649 - 1;
				this.anInt643 = -this.anInt643;
			}
		} else if (this.anInt643 < 0) {
			while (true) {
				local48 = this.method485(arg0, local48, local26, local52, local21.aByteArray19[this.anInt648 - 1]);
				if (this.anInt649 >= local26) {
					return 1;
				}
				this.anInt649 = local31 - (local31 - 1 - this.anInt649) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method477(arg0, local48, local31, local52, local21.aByteArray19[this.anInt646]);
				if (this.anInt649 < local31) {
					return 1;
				}
				this.anInt649 = local26 + (this.anInt649 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()Z")
	public boolean method486() {
		return this.method2046();
	}
}
