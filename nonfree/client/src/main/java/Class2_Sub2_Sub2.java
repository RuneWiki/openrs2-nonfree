import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
	private int anInt1739;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "I")
	private int anInt1740;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
	private int anInt1742;

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
	private int anInt1744;

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
	private int anInt1745;

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "Z")
	private boolean aBoolean96;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
	private final int anInt1741;

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
	private final int anInt1747;

	@OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
	private int anInt1743;

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "I")
	public int anInt1746;

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
	public int anInt1748;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!wd;II)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class2_Sub12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass2_Sub12_3 = arg0;
		this.anInt1741 = arg0.anInt2817;
		this.anInt1747 = arg0.anInt2818;
		this.anInt1743 = arg1;
		this.anInt1746 = arg2;
		this.anInt1748 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIII)I")
	private int method1200(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1742 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1742;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1742 += arg1;
			if (this.anInt1743 == -256 && (this.anInt1748 & 0xFF) == 0) {
				arg1 = Static118.method1205(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, this.anInt1739, this.anInt1740, local7, arg2, this);
			} else {
				arg1 = Static118.method1202(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, this.anInt1739, this.anInt1740, local7, arg2, this, this.anInt1743, arg4);
			}
			this.anInt1742 -= arg1;
			if (this.anInt1742 != 0) {
				return arg1;
			}
			if (this.anInt1744 == Integer.MIN_VALUE) {
				this.method1820();
				return arg3;
			}
			this.anInt1746 = this.anInt1744;
		}
		return this.anInt1743 == -256 && (this.anInt1748 & 0xFF) == 0 ? Static118.method1207(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, arg3, arg2, this) : Static118.method1204(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, arg3, arg2, this, this.anInt1743, arg4);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1198(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1746 == 0 && (this.anInt1742 == 0 || this.anInt1744 == 0 || this.anInt1744 == Integer.MIN_VALUE)) {
			this.method1197(arg2);
			return 0;
		}
		@Pc(21) Class2_Sub12_Sub1 local21 = (Class2_Sub12_Sub1) super.aClass2_Sub12_3;
		@Pc(26) int local26 = this.anInt1741 << 8;
		@Pc(31) int local31 = this.anInt1747 << 8;
		@Pc(37) int local37 = local21.aByteArray24.length << 8;
		@Pc(41) int local41 = local31 - local26;
		if (local41 <= 0) {
			this.anInt1745 = 0;
		}
		@Pc(48) int local48 = arg1;
		@Pc(52) int local52 = arg2 + arg1;
		if (this.anInt1745 >= 0) {
			if (this.anInt1745 > 0) {
				if (this.aBoolean96) {
					label118: {
						if (this.anInt1743 < 0) {
							local48 = this.method1200(arg0, arg1, local26, local52, local21.aByteArray24[this.anInt1741]);
							if (this.anInt1748 >= local26) {
								return 1;
							}
							this.anInt1748 = local26 + local26 - this.anInt1748 - 1;
							this.anInt1743 = -this.anInt1743;
							if (--this.anInt1745 == 0) {
								break label118;
							}
						}
						do {
							local48 = this.method1212(arg0, local48, local31, local52, local21.aByteArray24[this.anInt1747 - 1]);
							if (this.anInt1748 < local31) {
								return 1;
							}
							this.anInt1748 = local31 + local31 - this.anInt1748 - 1;
							this.anInt1743 = -this.anInt1743;
							if (--this.anInt1745 == 0) {
								break;
							}
							local48 = this.method1200(arg0, local48, local26, local52, local21.aByteArray24[this.anInt1741]);
							if (this.anInt1748 >= local26) {
								return 1;
							}
							this.anInt1748 = local26 + local26 - this.anInt1748 - 1;
							this.anInt1743 = -this.anInt1743;
						} while (--this.anInt1745 != 0);
					}
				} else {
					@Pc(398) int local398;
					if (this.anInt1743 < 0) {
						while (true) {
							local48 = this.method1200(arg0, local48, local26, local52, local21.aByteArray24[this.anInt1747 - 1]);
							if (this.anInt1748 >= local26) {
								return 1;
							}
							local398 = (local31 - this.anInt1748 - 1) / local41;
							if (local398 >= this.anInt1745) {
								this.anInt1748 += local41 * this.anInt1745;
								this.anInt1745 = 0;
								break;
							}
							this.anInt1748 += local41 * local398;
							this.anInt1745 -= local398;
						}
					} else {
						while (true) {
							local48 = this.method1212(arg0, local48, local31, local52, local21.aByteArray24[this.anInt1741]);
							if (this.anInt1748 < local31) {
								return 1;
							}
							local398 = (this.anInt1748 - local26) / local41;
							if (local398 >= this.anInt1745) {
								this.anInt1748 -= local41 * this.anInt1745;
								this.anInt1745 = 0;
								break;
							}
							this.anInt1748 -= local41 * local398;
							this.anInt1745 -= local398;
						}
					}
				}
			}
			if (this.anInt1743 < 0) {
				this.method1200(arg0, local48, 0, local52, 0);
				if (this.anInt1748 < 0) {
					this.anInt1748 = 0;
					this.method1820();
				}
			} else {
				this.method1212(arg0, local48, local37, local52, 0);
				if (this.anInt1748 >= local37) {
					this.anInt1748 = local37 - 1;
					this.method1820();
				}
			}
			return 1;
		} else if (this.aBoolean96) {
			if (this.anInt1743 < 0) {
				local48 = this.method1200(arg0, arg1, local26, local52, local21.aByteArray24[this.anInt1741]);
				if (this.anInt1748 >= local26) {
					return 1;
				}
				this.anInt1748 = local26 + local26 - this.anInt1748 - 1;
				this.anInt1743 = -this.anInt1743;
			}
			while (true) {
				local48 = this.method1212(arg0, local48, local31, local52, local21.aByteArray24[this.anInt1747 - 1]);
				if (this.anInt1748 < local31) {
					return 1;
				}
				this.anInt1748 = local31 + local31 - this.anInt1748 - 1;
				this.anInt1743 = -this.anInt1743;
				local48 = this.method1200(arg0, local48, local26, local52, local21.aByteArray24[this.anInt1741]);
				if (this.anInt1748 >= local26) {
					return 1;
				}
				this.anInt1748 = local26 + local26 - this.anInt1748 - 1;
				this.anInt1743 = -this.anInt1743;
			}
		} else if (this.anInt1743 < 0) {
			while (true) {
				local48 = this.method1200(arg0, local48, local26, local52, local21.aByteArray24[this.anInt1747 - 1]);
				if (this.anInt1748 >= local26) {
					return 1;
				}
				this.anInt1748 = local31 - (local31 - 1 - this.anInt1748) % local41 - 1;
			}
		} else {
			while (true) {
				local48 = this.method1212(arg0, local48, local31, local52, local21.aByteArray24[this.anInt1741]);
				if (this.anInt1748 < local31) {
					return 1;
				}
				this.anInt1748 = local26 + (this.anInt1748 - local26) % local41;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
	public synchronized void method1203(@OriginalArg(0) int arg0) {
		this.anInt1746 = arg0;
		this.anInt1742 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public synchronized void method1206(@OriginalArg(0) int arg0) {
		this.anInt1745 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()I")
	@Override
	public int method1199() {
		@Pc(4) int local4 = this.anInt1746 * 3;
		local4 = (local4 ^ local4 >> 31) + (local4 >>> 31);
		if (this.anInt1745 == 0) {
			local4 -= local4 * this.anInt1748 / (((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24.length << 8);
		} else if (this.anInt1745 >= 0) {
			local4 -= local4 * this.anInt1741 / ((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24.length;
		}
		return local4 > 255 ? 255 : local4;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public boolean method1209() {
		return this.method1817();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1197(@OriginalArg(0) int arg0) {
		if (this.anInt1742 > 0) {
			if (arg0 >= this.anInt1742) {
				if (this.anInt1744 == Integer.MIN_VALUE) {
					this.method1820();
					arg0 = this.anInt1742;
				} else {
					this.anInt1746 = this.anInt1744;
				}
				this.anInt1742 = 0;
			} else {
				this.anInt1746 += this.anInt1740 * arg0;
				this.anInt1742 -= arg0;
			}
		}
		this.anInt1748 += this.anInt1743 * arg0;
		@Pc(53) Class2_Sub12_Sub1 local53 = (Class2_Sub12_Sub1) super.aClass2_Sub12_3;
		@Pc(58) int local58 = this.anInt1741 << 8;
		@Pc(63) int local63 = this.anInt1747 << 8;
		@Pc(69) int local69 = local53.aByteArray24.length << 8;
		@Pc(73) int local73 = local63 - local58;
		if (local73 <= 0) {
			this.anInt1745 = 0;
		}
		if (this.anInt1745 >= 0) {
			if (this.anInt1745 > 0) {
				if (this.aBoolean96) {
					label113: {
						if (this.anInt1743 < 0) {
							if (this.anInt1748 >= local58) {
								return;
							}
							this.anInt1748 = local58 + local58 - this.anInt1748 - 1;
							this.anInt1743 = -this.anInt1743;
							if (--this.anInt1745 == 0) {
								break label113;
							}
						}
						do {
							if (this.anInt1748 < local63) {
								return;
							}
							this.anInt1748 = local63 + local63 - this.anInt1748 - 1;
							this.anInt1743 = -this.anInt1743;
							if (--this.anInt1745 == 0) {
								break;
							}
							if (this.anInt1748 >= local58) {
								return;
							}
							this.anInt1748 = local58 + local58 - this.anInt1748 - 1;
							this.anInt1743 = -this.anInt1743;
						} while (--this.anInt1745 != 0);
					}
				} else {
					@Pc(299) int local299;
					if (this.anInt1743 < 0) {
						if (this.anInt1748 >= local58) {
							return;
						}
						local299 = (local63 - this.anInt1748 - 1) / local73;
						if (local299 < this.anInt1745) {
							this.anInt1748 += local73 * local299;
							this.anInt1745 -= local299;
							return;
						}
						this.anInt1748 += local73 * this.anInt1745;
						this.anInt1745 = 0;
					} else if (this.anInt1748 >= local63) {
						local299 = (this.anInt1748 - local58) / local73;
						if (local299 < this.anInt1745) {
							this.anInt1748 -= local73 * local299;
							this.anInt1745 -= local299;
							return;
						}
						this.anInt1748 -= local73 * this.anInt1745;
						this.anInt1745 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1743 < 0) {
				if (this.anInt1748 < 0) {
					this.anInt1748 = 0;
					this.method1820();
					return;
				}
			} else if (this.anInt1748 >= local69) {
				this.anInt1748 = local69 - 1;
				this.method1820();
			}
		} else if (this.aBoolean96) {
			if (this.anInt1743 < 0) {
				if (this.anInt1748 >= local58) {
					return;
				}
				this.anInt1748 = local58 + local58 - this.anInt1748 - 1;
				this.anInt1743 = -this.anInt1743;
			}
			while (this.anInt1748 >= local63) {
				this.anInt1748 = local63 + local63 - this.anInt1748 - 1;
				this.anInt1743 = -this.anInt1743;
				if (this.anInt1748 >= local58) {
					return;
				}
				this.anInt1748 = local58 + local58 - this.anInt1748 - 1;
				this.anInt1743 = -this.anInt1743;
			}
		} else if (this.anInt1743 < 0) {
			if (this.anInt1748 < local58) {
				this.anInt1748 = local63 - (local63 - 1 - this.anInt1748) % local73 - 1;
			}
		} else if (this.anInt1748 >= local63) {
			this.anInt1748 = local58 + (this.anInt1748 - local58) % local73;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([IIIII)I")
	private int method1212(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1742 > 0) {
			@Pc(7) int local7 = arg1 + this.anInt1742;
			if (local7 > arg3) {
				local7 = arg3;
			}
			this.anInt1742 += arg1;
			if (this.anInt1743 == 256 && (this.anInt1748 & 0xFF) == 0) {
				arg1 = Static118.method1208(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, this.anInt1739, this.anInt1740, local7, arg2, this);
			} else {
				arg1 = Static118.method1201(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, this.anInt1739, this.anInt1740, local7, arg2, this, this.anInt1743, arg4);
			}
			this.anInt1742 -= arg1;
			if (this.anInt1742 != 0) {
				return arg1;
			}
			if (this.anInt1744 == Integer.MIN_VALUE) {
				this.method1820();
				return arg3;
			}
			this.anInt1746 = this.anInt1744;
		}
		return this.anInt1743 == 256 && (this.anInt1748 & 0xFF) == 0 ? Static118.method1213(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, arg3, arg2, this) : Static118.method1211(((Class2_Sub12_Sub1) super.aClass2_Sub12_3).aByteArray24, arg0, this.anInt1748, arg1, this.anInt1746, arg3, arg2, this, this.anInt1743, arg4);
	}
}
