import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class5_Sub2_Sub13_Sub2 extends Class5_Sub2_Sub13 {

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
	public int anInt5857;

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	public int anInt5859;

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
	public int anInt5862;

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
	public int anInt5863;

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!nd;II)V")
	public Class5_Sub2_Sub13_Sub2(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray80 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	public void method4848() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray80.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
			local7++;
			this.aByteArray80[local7] = 0;
		}
		while (local7 < this.aByteArray80.length - 1) {
			local7++;
			this.aByteArray80[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIII)V")
	public void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg4 - arg5 << 16) / (arg2 - arg0);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg2) {
			local27 = (arg1 - arg4 << 16) / (arg3 - arg2);
		}
		@Pc(43) int local43 = 0;
		if (arg3 != arg0) {
			local43 = (arg5 - arg1 << 16) / (arg0 - arg3);
		}
		if (arg0 <= arg2 && arg0 <= arg3) {
			if (arg3 > arg2) {
				arg1 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local43 * arg0;
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local27;
					arg2 = 0;
				}
				if (arg0 != arg2 && local7 > local43 || arg0 == arg2 && local27 < local43) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt5863;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg1 >> 16, arg4 >> 16, arg0);
								arg0 += this.anInt5863;
								arg1 += local43;
								arg4 += local27;
							}
						}
						Static343.method5315(this.aByteArray80, arg1 >> 16, arg5 >> 16, arg0);
						arg1 += local43;
						arg5 += local7;
						arg0 += this.anInt5863;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt5863;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg4 >> 16, arg1 >> 16, arg0);
								arg1 += local43;
								arg0 += this.anInt5863;
								arg4 += local27;
							}
						}
						Static343.method5315(this.aByteArray80, arg5 >> 16, arg1 >> 16, arg0);
						arg5 += local7;
						arg0 += this.anInt5863;
						arg1 += local43;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local43 * arg0;
					arg5 -= local7 * arg0;
					arg0 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local27 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg0 || local7 <= local43) && (arg3 != arg0 || local7 >= local27)) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt5863;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg5 >> 16, arg1 >> 16, arg0);
								arg0 += this.anInt5863;
								arg1 += local27;
								arg5 += local7;
							}
						}
						Static343.method5315(this.aByteArray80, arg5 >> 16, arg4 >> 16, arg0);
						arg0 += this.anInt5863;
						arg4 += local43;
						arg5 += local7;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt5863 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg1 >> 16, arg5 >> 16, arg0);
								arg5 += local7;
								arg0 += this.anInt5863;
								arg1 += local27;
							}
						}
						Static343.method5315(this.aByteArray80, arg4 >> 16, arg5 >> 16, arg0);
						arg4 += local43;
						arg0 += this.anInt5863;
						arg5 += local7;
					}
				}
			}
		} else if (arg2 <= arg3) {
			if (arg3 < arg0) {
				arg5 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local27 * arg2;
					arg5 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg3 < 0) {
					arg1 -= local43 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg2 && local7 < local27 || arg2 == arg3 && local7 > local43) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt5863;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg5 >> 16, arg1 >> 16, arg2);
								arg1 += local43;
								arg5 += local7;
								arg2 += this.anInt5863;
							}
						}
						Static343.method5315(this.aByteArray80, arg5 >> 16, arg4 >> 16, arg2);
						arg4 += local27;
						arg2 += this.anInt5863;
						arg5 += local7;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt5863 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg1 >> 16, arg5 >> 16, arg2);
								arg1 += local43;
								arg2 += this.anInt5863;
								arg5 += local7;
							}
						}
						Static343.method5315(this.aByteArray80, arg4 >> 16, arg5 >> 16, arg2);
						arg2 += this.anInt5863;
						arg5 += local7;
						arg4 += local27;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local27 * arg2;
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local43;
					arg0 = 0;
				}
				if (local27 <= local7) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt5863 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg4 >> 16, arg5 >> 16, arg2);
								arg4 += local27;
								arg2 += this.anInt5863;
								arg5 += local43;
							}
						}
						Static343.method5315(this.aByteArray80, arg4 >> 16, arg1 >> 16, arg2);
						arg1 += local7;
						arg4 += local27;
						arg2 += this.anInt5863;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt5863;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static343.method5315(this.aByteArray80, arg5 >> 16, arg4 >> 16, arg2);
								arg5 += local43;
								arg2 += this.anInt5863;
								arg4 += local27;
							}
						}
						Static343.method5315(this.aByteArray80, arg1 >> 16, arg4 >> 16, arg2);
						arg4 += local27;
						arg1 += local7;
						arg2 += this.anInt5863;
					}
				}
			}
		} else if (arg0 >= arg2) {
			arg5 = arg1 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= local27 * arg3;
				arg1 -= local43 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local7;
				arg2 = 0;
			}
			if (local43 <= local27) {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt5863 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static343.method5315(this.aByteArray80, arg1 >> 16, arg4 >> 16, arg3);
							arg1 += local43;
							arg4 += local7;
							arg3 += this.anInt5863;
						}
					}
					Static343.method5315(this.aByteArray80, arg1 >> 16, arg5 >> 16, arg3);
					arg1 += local43;
					arg5 += local27;
					arg3 += this.anInt5863;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt5863 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static343.method5315(this.aByteArray80, arg4 >> 16, arg1 >> 16, arg3);
							arg3 += this.anInt5863;
							arg4 += local7;
							arg1 += local43;
						}
					}
					Static343.method5315(this.aByteArray80, arg5 >> 16, arg1 >> 16, arg3);
					arg1 += local43;
					arg3 += this.anInt5863;
					arg5 += local27;
				}
			}
		} else {
			arg4 = arg1 <<= 0x10;
			arg5 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local43 * arg3;
				arg4 -= arg3 * local27;
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg5 -= local7 * arg0;
				arg0 = 0;
			}
			if (local27 < local43) {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt5863;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static343.method5315(this.aByteArray80, arg4 >> 16, arg5 >> 16, arg3);
							arg3 += this.anInt5863;
							arg4 += local27;
							arg5 += local7;
						}
					}
					Static343.method5315(this.aByteArray80, arg4 >> 16, arg1 >> 16, arg3);
					arg1 += local43;
					arg3 += this.anInt5863;
					arg4 += local27;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt5863 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static343.method5315(this.aByteArray80, arg5 >> 16, arg4 >> 16, arg3);
							arg3 += this.anInt5863;
							arg4 += local27;
							arg5 += local7;
						}
					}
					Static343.method5315(this.aByteArray80, arg1 >> 16, arg4 >> 16, arg3);
					arg1 += local43;
					arg3 += this.anInt5863;
					arg4 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)Z")
	public boolean method4851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray80.length;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	public void method4854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5862 = arg0;
		this.anInt5859 = arg2 - arg0;
		this.anInt5863 = arg3 - arg1;
		this.anInt5857 = arg1;
	}
}
