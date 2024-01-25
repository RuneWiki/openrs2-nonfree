import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class5_Sub1_Sub15_Sub1 extends Class5_Sub1_Sub15 {

	@OriginalMember(owner = "client!or", name = "G", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "I")
	public int anInt7194;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "I")
	public int anInt7196;

	@OriginalMember(owner = "client!or", name = "D", descriptor = "I")
	public int anInt7199;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "[B")
	public final byte[] aByteArray80;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!vf;II)V")
	public Class5_Sub1_Sub15_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray80 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)V")
	public void method6259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7196 = arg3 - arg0;
		this.anInt7193 = arg0;
		this.anInt7199 = arg1;
		this.anInt7194 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)Z")
	public boolean method6260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 * arg0 <= this.aByteArray80.length;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
	public void method6262() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray80.length - 8;
		while (local7 < local13) {
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

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIZII)V")
	public void method6263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg5) {
			local7 = (arg0 - arg1 << 16) / (arg5 - arg3);
		}
		@Pc(27) int local27 = 0;
		if (arg4 != arg5) {
			local27 = (arg2 - arg0 << 16) / (arg4 - arg5);
		}
		@Pc(55) int local55 = 0;
		if (arg3 != arg4) {
			local55 = (arg1 - arg2 << 16) / (arg3 - arg4);
		}
		if (arg5 >= arg3 && arg3 <= arg4) {
			if (arg5 < arg4) {
				arg2 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local55;
					arg1 -= local7 * arg3;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local27;
					arg5 = 0;
				}
				if (arg3 != arg5 && local7 > local55 || arg3 == arg5 && local55 > local27) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt7194 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static579.method7773(arg0 >> 16, this.aByteArray80, arg2 >> 16, arg3);
								arg2 += local55;
								arg3 += this.anInt7194;
								arg0 += local27;
							}
						}
						Static579.method7773(arg1 >> 16, this.aByteArray80, arg2 >> 16, arg3);
						arg3 += this.anInt7194;
						arg1 += local7;
						arg2 += local55;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt7194 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static579.method7773(arg2 >> 16, this.aByteArray80, arg0 >> 16, arg3);
								arg0 += local27;
								arg3 += this.anInt7194;
								arg2 += local55;
							}
						}
						Static579.method7773(arg2 >> 16, this.aByteArray80, arg1 >> 16, arg3);
						arg1 += local7;
						arg2 += local55;
						arg3 += this.anInt7194;
					}
				}
			} else {
				arg0 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local7 * arg3;
					arg0 -= arg3 * local55;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg2 -= arg4 * local27;
					arg4 = 0;
				}
				if ((arg4 == arg3 || local7 <= local55) && (arg3 != arg4 || local27 <= local7)) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt7194;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static579.method7773(arg2 >> 16, this.aByteArray80, arg1 >> 16, arg3);
								arg3 += this.anInt7194;
								arg2 += local27;
								arg1 += local7;
							}
						}
						Static579.method7773(arg0 >> 16, this.aByteArray80, arg1 >> 16, arg3);
						arg1 += local7;
						arg0 += local55;
						arg3 += this.anInt7194;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt7194 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static579.method7773(arg1 >> 16, this.aByteArray80, arg2 >> 16, arg3);
								arg1 += local7;
								arg3 += this.anInt7194;
								arg2 += local27;
							}
						}
						Static579.method7773(arg1 >> 16, this.aByteArray80, arg0 >> 16, arg3);
						arg3 += this.anInt7194;
						arg0 += local55;
						arg1 += local7;
					}
				}
			}
		} else if (arg4 >= arg5) {
			if (arg3 > arg4) {
				arg1 = arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local27 * arg5;
					arg1 -= arg5 * local7;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local55;
					arg4 = 0;
				}
				if (arg4 != arg5 && local27 > local7 || arg5 == arg4 && local55 < local7) {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt7194;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static579.method7773(arg2 >> 16, this.aByteArray80, arg1 >> 16, arg5);
								arg5 += this.anInt7194;
								arg1 += local7;
								arg2 += local55;
							}
						}
						Static579.method7773(arg0 >> 16, this.aByteArray80, arg1 >> 16, arg5);
						arg5 += this.anInt7194;
						arg0 += local27;
						arg1 += local7;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt7194 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static579.method7773(arg1 >> 16, this.aByteArray80, arg2 >> 16, arg5);
								arg1 += local7;
								arg2 += local55;
								arg5 += this.anInt7194;
							}
						}
						Static579.method7773(arg1 >> 16, this.aByteArray80, arg0 >> 16, arg5);
						arg1 += local7;
						arg5 += this.anInt7194;
						arg0 += local27;
					}
				}
			} else {
				arg2 = arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= local27 * arg5;
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local55;
					arg3 = 0;
				}
				if (local27 <= local7) {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt7194;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static579.method7773(arg1 >> 16, this.aByteArray80, arg0 >> 16, arg5);
								arg0 += local27;
								arg1 += local55;
								arg5 += this.anInt7194;
							}
						}
						Static579.method7773(arg2 >> 16, this.aByteArray80, arg0 >> 16, arg5);
						arg2 += local7;
						arg0 += local27;
						arg5 += this.anInt7194;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt7194 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static579.method7773(arg0 >> 16, this.aByteArray80, arg1 >> 16, arg5);
								arg1 += local55;
								arg0 += local27;
								arg5 += this.anInt7194;
							}
						}
						Static579.method7773(arg0 >> 16, this.aByteArray80, arg2 >> 16, arg5);
						arg0 += local27;
						arg2 += local7;
						arg5 += this.anInt7194;
					}
				}
			}
		} else if (arg5 > arg3) {
			arg0 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local55 * arg4;
				arg0 -= local27 * arg4;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg1 -= arg3 * local7;
				arg3 = 0;
			}
			if (local55 <= local27) {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt7194;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static579.method7773(arg0 >> 16, this.aByteArray80, arg1 >> 16, arg4);
							arg4 += this.anInt7194;
							arg1 += local7;
							arg0 += local27;
						}
					}
					Static579.method7773(arg0 >> 16, this.aByteArray80, arg2 >> 16, arg4);
					arg0 += local27;
					arg2 += local55;
					arg4 += this.anInt7194;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt7194;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static579.method7773(arg1 >> 16, this.aByteArray80, arg0 >> 16, arg4);
							arg1 += local7;
							arg0 += local27;
							arg4 += this.anInt7194;
						}
					}
					Static579.method7773(arg2 >> 16, this.aByteArray80, arg0 >> 16, arg4);
					arg0 += local27;
					arg2 += local55;
					arg4 += this.anInt7194;
				}
			}
		} else {
			arg1 = arg2 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local55 * arg4;
				arg1 -= arg4 * local27;
				arg4 = 0;
			}
			arg0 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local7;
				arg5 = 0;
			}
			if (local55 > local27) {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt7194;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static579.method7773(arg2 >> 16, this.aByteArray80, arg0 >> 16, arg4);
							arg2 += local55;
							arg0 += local7;
							arg4 += this.anInt7194;
						}
					}
					Static579.method7773(arg2 >> 16, this.aByteArray80, arg1 >> 16, arg4);
					arg2 += local55;
					arg1 += local27;
					arg4 += this.anInt7194;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt7194;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static579.method7773(arg0 >> 16, this.aByteArray80, arg2 >> 16, arg4);
							arg4 += this.anInt7194;
							arg2 += local55;
							arg0 += local7;
						}
					}
					Static579.method7773(arg1 >> 16, this.aByteArray80, arg2 >> 16, arg4);
					arg4 += this.anInt7194;
					arg1 += local27;
					arg2 += local55;
				}
			}
		}
	}
}
