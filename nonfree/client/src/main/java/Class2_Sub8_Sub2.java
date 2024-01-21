import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub8_Sub2 extends Class2_Sub8 {

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	private int anInt2658;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
	private int anInt2659;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
	private int anInt2660;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	private int anInt2663;

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	private int anInt2664;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "Z")
	private boolean aBoolean141;

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
	private final int anInt2662;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
	private final int anInt2667;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	private int anInt2661;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public int anInt2665;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
	public int anInt2666;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ga;II)V")
	public Class2_Sub8_Sub2(@OriginalArg(0) Class2_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub9_3 = arg0;
		this.anInt2662 = arg0.anInt1217;
		this.anInt2667 = arg0.anInt1218;
		this.anInt2661 = arg1;
		this.anInt2665 = arg2;
		this.anInt2666 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([IIIII)I")
	private int method1674(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2659 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2659;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2659 += arg1;
			if (this.anInt2661 == -256 && (this.anInt2666 & 0xFF) == 0) {
				arg1 = Static115.method1680(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, this.anInt2660, this.anInt2663, local7, arg2, this);
			} else {
				arg1 = Static115.method1677(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, this.anInt2660, this.anInt2663, local7, arg2, this, this.anInt2661, arg4);
			}
			this.anInt2659 -= arg1;
			if (this.anInt2659 != 0) {
				return arg1;
			}
			if (this.anInt2658 == Integer.MIN_VALUE) {
				this.method1695();
				return arg3;
			}
			this.anInt2665 = this.anInt2658;
		}
		return this.anInt2661 == -256 && (this.anInt2666 & 0xFF) == 0 ? Static115.method1682(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, arg3, arg2, this) : Static115.method1673(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, arg3, arg2, this, this.anInt2661, arg4);
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public synchronized void method1675(@OriginalArg(0) int arg0) {
		this.anInt2664 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1670(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2665 == 0 && (this.anInt2659 == 0 || this.anInt2658 == 0 || this.anInt2658 == Integer.MIN_VALUE)) {
			this.method1671(arg2);
			return 0;
		}
		@Pc(21) Class2_Sub9_Sub1 local21 = (Class2_Sub9_Sub1) super.aClass2_Sub9_3;
		@Pc(26) int local26 = this.anInt2662 << 8;
		@Pc(31) int local31 = this.anInt2667 << 8;
		@Pc(37) int local37 = local21.aByteArray12.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt2664 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt2664 >= 0) {
			if (this.anInt2664 > 0) {
				if (this.aBoolean141) {
					label118: {
						if (this.anInt2661 < 0) {
							local48 = this.method1674(arg0, arg1, local26, local52, local21.aByteArray12[this.anInt2662]);
							if (this.anInt2666 >= local26) {
								return 1;
							}
							this.anInt2666 = local26 + local26 - this.anInt2666 - 1;
							this.anInt2661 = -this.anInt2661;
							if (--this.anInt2664 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1681(arg0, local48, local31, local52, local21.aByteArray12[this.anInt2667 - 1]);
							if (this.anInt2666 < local31) {
								return 1;
							}
							this.anInt2666 = local31 + local31 - this.anInt2666 - 1;
							this.anInt2661 = -this.anInt2661;
							if (--this.anInt2664 == 0) {
								break;
							}
							local48 = this.method1674(arg0, local48, local26, local52, local21.aByteArray12[this.anInt2662]);
							if (this.anInt2666 >= local26) {
								return 1;
							}
							this.anInt2666 = local26 + local26 - this.anInt2666 - 1;
							this.anInt2661 = -this.anInt2661;
						} while (--this.anInt2664 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt2661 < 0) {
						while (true) {
							local48 = this.method1674(arg0, local48, local26, local52, local21.aByteArray12[this.anInt2667 - 1]);
							if (this.anInt2666 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt2666 - 1) / local41;
							if (local398 >= this.anInt2664) {
								this.anInt2666 += local41 * this.anInt2664;
								this.anInt2664 = 0;
								break;
							}
							this.anInt2666 += local41 * local398;
							this.anInt2664 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1681(arg0, local48, local31, local52, local21.aByteArray12[this.anInt2662]);
							if (this.anInt2666 < local31) {
								return 1;
							}
							local398 = (this.anInt2666 - local26) / local41;
							if (local398 >= this.anInt2664) {
								this.anInt2666 -= local41 * this.anInt2664;
								this.anInt2664 = 0;
								break;
							}
							this.anInt2666 -= local41 * local398;
							this.anInt2664 -= local398;
						}
					}
				}
			}
			if (this.anInt2661 < 0) {
				this.method1674(arg0, local48, 0, local52, 0);
				if (this.anInt2666 < 0) {
					this.anInt2666 = 0;
					this.method1695();
				}
			} else {
				this.method1681(arg0, local48, local37, local52, 0);
				if (this.anInt2666 >= local37) {
					this.anInt2666 = local37 - 1;
					this.method1695();
				}
			}
			return 1;
		} else if (this.aBoolean141) {
			if (this.anInt2661 < 0) {
				local48 = this.method1674(arg0, arg1, local26, local52, local21.aByteArray12[this.anInt2662]);
				if (this.anInt2666 >= local26) {
					return 1;
				}
				this.anInt2666 = local26 + local26 - this.anInt2666 - 1;
				this.anInt2661 = -this.anInt2661;
			}
			while (true) {
				local48 = this.method1681(arg0, local48, local31, local52, local21.aByteArray12[this.anInt2667 - 1]);
				if (this.anInt2666 < local31) {
					return 1;
				}
				this.anInt2666 = local31 + local31 - this.anInt2666 - 1;
				this.anInt2661 = -this.anInt2661;
				local48 = this.method1674(arg0, local48, local26, local52, local21.aByteArray12[this.anInt2662]);
				if (this.anInt2666 >= local26) {
					return 1;
				}
				this.anInt2666 = local26 + local26 - this.anInt2666 - 1;
				this.anInt2661 = -this.anInt2661;
			}
		} else if (this.anInt2661 < 0) {
			while (true) {
				local48 = this.method1674(arg0, local48, local26, local52, local21.aByteArray12[this.anInt2667 - 1]);
				if (this.anInt2666 >= local26) {
					return 1;
				}
				this.anInt2666 = local31 - (local31 - 1 - this.anInt2666) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1681(arg0, local48, local31, local52, local21.aByteArray12[this.anInt2662]);
				if (this.anInt2666 < local31) {
					return 1;
				}
				this.anInt2666 = local26 + (this.anInt2666 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1671(@OriginalArg(0) int arg0) {
		if (this.anInt2659 > 0) {
			if (arg0 >= this.anInt2659) {
				if (this.anInt2658 == Integer.MIN_VALUE) {
					this.method1695();
					arg0 = this.anInt2659;
				} else {
					this.anInt2665 = this.anInt2658;
				}
				this.anInt2659 = 0;
			} else {
				this.anInt2665 += this.anInt2663 * arg0;
				this.anInt2659 -= arg0;
			}
		}
		this.anInt2666 += this.anInt2661 * arg0;
		@Pc(53) Class2_Sub9_Sub1 local53 = (Class2_Sub9_Sub1) super.aClass2_Sub9_3;
		@Pc(58) int local58 = this.anInt2662 << 8;
		@Pc(63) int local63 = this.anInt2667 << 8;
		@Pc(69) int local69 = local53.aByteArray12.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt2664 = 0;
		}
		if (this.anInt2664 >= 0) {
			if (this.anInt2664 > 0) {
				if (this.aBoolean141) {
					label113: {
						if (this.anInt2661 < 0) {
							if (this.anInt2666 >= local58) {
								return;
							}
							this.anInt2666 = local58 + local58 - this.anInt2666 - 1;
							this.anInt2661 = -this.anInt2661;
							if (--this.anInt2664 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt2666 < local63) {
								return;
							}
							this.anInt2666 = local63 + local63 - this.anInt2666 - 1;
							this.anInt2661 = -this.anInt2661;
							if (--this.anInt2664 == 0) {
								break;
							}
							if (this.anInt2666 >= local58) {
								return;
							}
							this.anInt2666 = local58 + local58 - this.anInt2666 - 1;
							this.anInt2661 = -this.anInt2661;
						} while (--this.anInt2664 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt2661 < 0) {
						if (this.anInt2666 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt2666 - 1) / local73;
						if (local299 < this.anInt2664) {
							this.anInt2666 += local73 * local299;
							this.anInt2664 -= local299;
							return;
						}
						this.anInt2666 += local73 * this.anInt2664;
						this.anInt2664 = 0;
					} else if (this.anInt2666 >= local63) {
						local299 = (this.anInt2666 - local58) / local73;
						if (local299 < this.anInt2664) {
							this.anInt2666 -= local73 * local299;
							this.anInt2664 -= local299;
							return;
						}
						this.anInt2666 -= local73 * this.anInt2664;
						this.anInt2664 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt2661 < 0) {
				if (this.anInt2666 < 0) {
					this.anInt2666 = 0;
					this.method1695();
					return;
				}
			} else if (this.anInt2666 >= local69) {
				this.anInt2666 = local69 - 1;
				this.method1695();
			}
		} else if (this.aBoolean141) {
			if (this.anInt2661 < 0) {
				if (this.anInt2666 >= local58) {
					return;
				}
				this.anInt2666 = local58 + local58 - this.anInt2666 - 1;
				this.anInt2661 = -this.anInt2661;
			}
			while (this.anInt2666 >= local63) {
				this.anInt2666 = local63 + local63 - this.anInt2666 - 1;
				this.anInt2661 = -this.anInt2661;
				if (this.anInt2666 >= local58) {
					return;
				}
				this.anInt2666 = local58 + local58 - this.anInt2666 - 1;
				this.anInt2661 = -this.anInt2661;
			}
		} else if (this.anInt2661 < 0) {
			if (this.anInt2666 < local58) {
				this.anInt2666 = local63 - (local63 - 1 - this.anInt2666) % local73 - 1;
			}
		} else if (this.anInt2666 >= local63) {
			this.anInt2666 = local58 + (this.anInt2666 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
	@Override
	public int method1672() {
		@Pc(4) int local4 = this.anInt2665 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt2664 == 0) {
			local4 -= local4 * this.anInt2666 / (((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12.length << 8);
		} else if (this.anInt2664 >= 0) {
			local4 -= local4 * this.anInt2662 / ((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "([IIIII)I")
	private int method1681(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt2659 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt2659;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt2659 += arg1;
			if (this.anInt2661 == 256 && (this.anInt2666 & 0xFF) == 0) {
				arg1 = Static115.method1676(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, this.anInt2660, this.anInt2663, local7, arg2, this);
			} else {
				arg1 = Static115.method1683(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, this.anInt2660, this.anInt2663, local7, arg2, this, this.anInt2661, arg4);
			}
			this.anInt2659 -= arg1;
			if (this.anInt2659 != 0) {
				return arg1;
			}
			if (this.anInt2658 == Integer.MIN_VALUE) {
				this.method1695();
				return arg3;
			}
			this.anInt2665 = this.anInt2658;
		}
		return this.anInt2661 == 256 && (this.anInt2666 & 0xFF) == 0 ? Static115.method1679(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, arg3, arg2, this) : Static115.method1684(((Class2_Sub9_Sub1) super.aClass2_Sub9_3).aByteArray12, arg0, this.anInt2666, arg1, this.anInt2665, arg3, arg2, this, this.anInt2661, arg4);
	}
}
