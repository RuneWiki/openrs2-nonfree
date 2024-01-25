import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class7_Sub1_Sub4_Sub1 extends Class7_Sub1_Sub4 {

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!bj", name = "N", descriptor = "[B")
	public final byte[] aByteArray9;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!hd;II)V")
	public Class7_Sub1_Sub4_Sub1(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray9 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(III)Z")
	public boolean method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray9.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIZI)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg5 != arg3) {
			local1 = (arg2 - arg1 << 16) / (arg5 - arg3);
		}
		@Pc(29) int local29 = 0;
		if (arg5 != arg4) {
			local29 = (arg0 - arg2 << 16) / (arg4 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg4 != arg3) {
			local49 = (arg1 - arg0 << 16) / (arg3 - arg4);
		}
		if (arg3 <= arg5 && arg4 >= arg3) {
			if (arg5 >= arg4) {
				arg2 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local1 * arg3;
					arg2 -= local49 * arg3;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg0 -= local29 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg3 && local49 < local1 || arg3 == arg4 && local29 > local1) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt618;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg0 >> 16, arg1 >> 16, arg3);
								arg1 += local1;
								arg0 += local29;
								arg3 += this.anInt618;
							}
						}
						Static356.method477(this.aByteArray9, arg2 >> 16, arg1 >> 16, arg3);
						arg1 += local1;
						arg2 += local49;
						arg3 += this.anInt618;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt618;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg1 >> 16, arg0 >> 16, arg3);
								arg1 += local1;
								arg3 += this.anInt618;
								arg0 += local29;
							}
						}
						Static356.method477(this.aByteArray9, arg1 >> 16, arg2 >> 16, arg3);
						arg3 += this.anInt618;
						arg2 += local49;
						arg1 += local1;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local1;
					arg0 -= arg3 * local49;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local29 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg3 && local1 > local49 || arg3 == arg5 && local29 < local49) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt618;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg0 >> 16, arg2 >> 16, arg3);
								arg3 += this.anInt618;
								arg2 += local29;
								arg0 += local49;
							}
						}
						Static356.method477(this.aByteArray9, arg0 >> 16, arg1 >> 16, arg3);
						arg0 += local49;
						arg1 += local1;
						arg3 += this.anInt618;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt618;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg2 >> 16, arg0 >> 16, arg3);
								arg3 += this.anInt618;
								arg0 += local49;
								arg2 += local29;
							}
						}
						Static356.method477(this.aByteArray9, arg1 >> 16, arg0 >> 16, arg3);
						arg0 += local49;
						arg3 += this.anInt618;
						arg1 += local1;
					}
				}
			}
		} else if (arg5 > arg4) {
			if (arg3 < arg5) {
				arg2 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local49 * arg4;
					arg2 -= local29 * arg4;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local1;
					arg3 = 0;
				}
				if (local49 > local29) {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt618 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg2 >> 16, arg1 >> 16, arg4);
								arg1 += local1;
								arg4 += this.anInt618;
								arg2 += local29;
							}
						}
						Static356.method477(this.aByteArray9, arg2 >> 16, arg0 >> 16, arg4);
						arg4 += this.anInt618;
						arg0 += local49;
						arg2 += local29;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt618 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg1 >> 16, arg2 >> 16, arg4);
								arg1 += local1;
								arg2 += local29;
								arg4 += this.anInt618;
							}
						}
						Static356.method477(this.aByteArray9, arg0 >> 16, arg2 >> 16, arg4);
						arg4 += this.anInt618;
						arg0 += local49;
						arg2 += local29;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local49;
					arg1 -= arg4 * local29;
					arg4 = 0;
				}
				if (arg5 < 0) {
					arg2 -= local1 * arg5;
					arg5 = 0;
				}
				if (local49 > local29) {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt618;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg2 >> 16, arg0 >> 16, arg4);
								arg0 += local49;
								arg4 += this.anInt618;
								arg2 += local1;
							}
						}
						Static356.method477(this.aByteArray9, arg1 >> 16, arg0 >> 16, arg4);
						arg0 += local49;
						arg1 += local29;
						arg4 += this.anInt618;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt618 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static356.method477(this.aByteArray9, arg0 >> 16, arg2 >> 16, arg4);
								arg2 += local1;
								arg4 += this.anInt618;
								arg0 += local49;
							}
						}
						Static356.method477(this.aByteArray9, arg0 >> 16, arg1 >> 16, arg4);
						arg4 += this.anInt618;
						arg0 += local49;
						arg1 += local29;
					}
				}
			}
		} else if (arg4 < arg3) {
			arg1 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local29 * arg5;
				arg1 -= local1 * arg5;
				arg5 = 0;
			}
			if (arg4 < 0) {
				arg0 -= local49 * arg4;
				arg4 = 0;
			}
			if (arg4 != arg5 && local1 < local29 || arg4 == arg5 && local49 < local1) {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt618 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static356.method477(this.aByteArray9, arg1 >> 16, arg0 >> 16, arg5);
							arg0 += local49;
							arg5 += this.anInt618;
							arg1 += local1;
						}
					}
					Static356.method477(this.aByteArray9, arg1 >> 16, arg2 >> 16, arg5);
					arg1 += local1;
					arg2 += local29;
					arg5 += this.anInt618;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt618 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static356.method477(this.aByteArray9, arg0 >> 16, arg1 >> 16, arg5);
							arg1 += local1;
							arg0 += local49;
							arg5 += this.anInt618;
						}
					}
					Static356.method477(this.aByteArray9, arg2 >> 16, arg1 >> 16, arg5);
					arg5 += this.anInt618;
					arg1 += local1;
					arg2 += local29;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local29;
				arg0 -= arg5 * local1;
				arg5 = 0;
			}
			if (arg3 < 0) {
				arg1 -= arg3 * local49;
				arg3 = 0;
			}
			if (local1 < local29) {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 *= this.anInt618;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static356.method477(this.aByteArray9, arg1 >> 16, arg2 >> 16, arg5);
							arg2 += local29;
							arg1 += local49;
							arg5 += this.anInt618;
						}
					}
					Static356.method477(this.aByteArray9, arg0 >> 16, arg2 >> 16, arg5);
					arg0 += local1;
					arg5 += this.anInt618;
					arg2 += local29;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg5;
				arg5 = this.anInt618 * arg5;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static356.method477(this.aByteArray9, arg2 >> 16, arg1 >> 16, arg5);
							arg1 += local49;
							arg5 += this.anInt618;
							arg2 += local29;
						}
					}
					Static356.method477(this.aByteArray9, arg2 >> 16, arg0 >> 16, arg5);
					arg2 += local29;
					arg5 += this.anInt618;
					arg0 += local1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
	public void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt619 = arg2;
		this.anInt616 = arg0;
		this.anInt618 = arg1 - arg2;
		this.anInt617 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	public void method478() {
		@Pc(9) int local9 = -1;
		@Pc(15) int local15 = this.aByteArray9.length - 8;
		while (local9 < local15) {
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
			local9++;
			this.aByteArray9[local9] = 0;
		}
		while (local9 < this.aByteArray9.length - 1) {
			local9++;
			this.aByteArray9[local9] = 0;
		}
	}
}
