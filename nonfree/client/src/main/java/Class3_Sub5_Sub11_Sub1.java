import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class3_Sub5_Sub11_Sub1 extends Class3_Sub5_Sub11 {

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
	public int anInt5109;

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
	public int anInt5112;

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "I")
	public int anInt5114;

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
	public int anInt5116;

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!lf;II)V")
	public Class3_Sub5_Sub11_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray45 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIII)V")
	public void method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5116 = arg1;
		this.anInt5114 = arg0 - arg2;
		this.anInt5109 = arg3 - arg1;
		this.anInt5112 = arg2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIBIIII)V")
	public void method4400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg3 != arg0) {
			local13 = (arg1 - arg4 << 16) / (arg3 - arg0);
		}
		@Pc(33) int local33 = 0;
		if (arg3 != arg2) {
			local33 = (arg5 - arg1 << 16) / (arg2 - arg3);
		}
		@Pc(50) int local50 = 0;
		if (arg2 != arg0) {
			local50 = (arg4 - arg5 << 16) / (arg0 - arg2);
		}
		if (arg3 >= arg0 && arg2 >= arg0) {
			if (arg3 < arg2) {
				arg5 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local13 * arg0;
					arg5 -= local50 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg1 -= arg3 * local33;
					arg3 = 0;
				}
				if (arg3 != arg0 && local50 < local13 || arg3 == arg0 && local33 < local50) {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt5109 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static590.method7801(arg1 >> 16, arg0, this.aByteArray45, arg5 >> 16);
								arg1 += local33;
								arg5 += local50;
								arg0 += this.anInt5109;
							}
						}
						Static590.method7801(arg4 >> 16, arg0, this.aByteArray45, arg5 >> 16);
						arg4 += local13;
						arg5 += local50;
						arg0 += this.anInt5109;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt5109;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static590.method7801(arg5 >> 16, arg0, this.aByteArray45, arg1 >> 16);
								arg5 += local50;
								arg1 += local33;
								arg0 += this.anInt5109;
							}
						}
						Static590.method7801(arg5 >> 16, arg0, this.aByteArray45, arg4 >> 16);
						arg0 += this.anInt5109;
						arg4 += local13;
						arg5 += local50;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= arg0 * local50;
					arg4 -= arg0 * local13;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg5 -= arg2 * local33;
					arg2 = 0;
				}
				if ((arg2 == arg0 || local13 <= local50) && (arg0 != arg2 || local13 >= local33)) {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt5109 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static590.method7801(arg5 >> 16, arg0, this.aByteArray45, arg4 >> 16);
								arg5 += local33;
								arg4 += local13;
								arg0 += this.anInt5109;
							}
						}
						Static590.method7801(arg1 >> 16, arg0, this.aByteArray45, arg4 >> 16);
						arg4 += local13;
						arg0 += this.anInt5109;
						arg1 += local50;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt5109 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static590.method7801(arg4 >> 16, arg0, this.aByteArray45, arg5 >> 16);
								arg5 += local33;
								arg0 += this.anInt5109;
								arg4 += local13;
							}
						}
						Static590.method7801(arg4 >> 16, arg0, this.aByteArray45, arg1 >> 16);
						arg0 += this.anInt5109;
						arg1 += local50;
						arg4 += local13;
					}
				}
			}
		} else if (arg3 <= arg2) {
			if (arg0 <= arg2) {
				arg5 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local33 * arg3;
					arg5 -= arg3 * local13;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local50 * arg0;
					arg0 = 0;
				}
				if (local13 < local33) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt5109 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static590.method7801(arg1 >> 16, arg3, this.aByteArray45, arg4 >> 16);
								arg1 += local33;
								arg4 += local50;
								arg3 += this.anInt5109;
							}
						}
						Static590.method7801(arg1 >> 16, arg3, this.aByteArray45, arg5 >> 16);
						arg3 += this.anInt5109;
						arg5 += local13;
						arg1 += local33;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt5109 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static590.method7801(arg4 >> 16, arg3, this.aByteArray45, arg1 >> 16);
								arg4 += local50;
								arg3 += this.anInt5109;
								arg1 += local33;
							}
						}
						Static590.method7801(arg5 >> 16, arg3, this.aByteArray45, arg1 >> 16);
						arg5 += local13;
						arg3 += this.anInt5109;
						arg1 += local33;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= local13 * arg3;
					arg1 -= local33 * arg3;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg5 -= local50 * arg2;
					arg2 = 0;
				}
				if ((arg3 == arg2 || local33 <= local13) && (arg2 != arg3 || local50 >= local13)) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt5109 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static590.method7801(arg4 >> 16, arg3, this.aByteArray45, arg5 >> 16);
								arg5 += local50;
								arg4 += local13;
								arg3 += this.anInt5109;
							}
						}
						Static590.method7801(arg4 >> 16, arg3, this.aByteArray45, arg1 >> 16);
						arg4 += local13;
						arg3 += this.anInt5109;
						arg1 += local33;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt5109 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static590.method7801(arg5 >> 16, arg3, this.aByteArray45, arg4 >> 16);
								arg5 += local50;
								arg3 += this.anInt5109;
								arg4 += local13;
							}
						}
						Static590.method7801(arg1 >> 16, arg3, this.aByteArray45, arg4 >> 16);
						arg1 += local33;
						arg4 += local13;
						arg3 += this.anInt5109;
					}
				}
			}
		} else if (arg3 <= arg0) {
			arg4 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= arg2 * local33;
				arg5 -= local50 * arg2;
				arg2 = 0;
			}
			arg1 <<= 0x10;
			if (arg3 < 0) {
				arg1 -= local13 * arg3;
				arg3 = 0;
			}
			if (local50 <= local33) {
				arg0 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt5109 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static590.method7801(arg1 >> 16, arg2, this.aByteArray45, arg5 >> 16);
							arg2 += this.anInt5109;
							arg1 += local13;
							arg5 += local50;
						}
					}
					Static590.method7801(arg4 >> 16, arg2, this.aByteArray45, arg5 >> 16);
					arg5 += local50;
					arg4 += local33;
					arg2 += this.anInt5109;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt5109;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static590.method7801(arg5 >> 16, arg2, this.aByteArray45, arg1 >> 16);
							arg2 += this.anInt5109;
							arg5 += local50;
							arg1 += local13;
						}
					}
					Static590.method7801(arg5 >> 16, arg2, this.aByteArray45, arg4 >> 16);
					arg4 += local33;
					arg2 += this.anInt5109;
					arg5 += local50;
				}
			}
		} else {
			arg1 = arg5 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local33 * arg2;
				arg5 -= local50 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= arg0 * local13;
				arg0 = 0;
			}
			if (local33 >= local50) {
				arg3 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt5109;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static590.method7801(arg1 >> 16, arg2, this.aByteArray45, arg4 >> 16);
							arg4 += local13;
							arg2 += this.anInt5109;
							arg1 += local33;
						}
					}
					Static590.method7801(arg1 >> 16, arg2, this.aByteArray45, arg5 >> 16);
					arg2 += this.anInt5109;
					arg1 += local33;
					arg5 += local50;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt5109;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static590.method7801(arg4 >> 16, arg2, this.aByteArray45, arg1 >> 16);
							arg1 += local33;
							arg2 += this.anInt5109;
							arg4 += local13;
						}
					}
					Static590.method7801(arg5 >> 16, arg2, this.aByteArray45, arg1 >> 16);
					arg1 += local33;
					arg2 += this.anInt5109;
					arg5 += local50;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBI)Z")
	public boolean method4403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray45.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(B)V")
	public void method4404() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray45.length - 8;
		while (local19 > local13) {
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
			local13++;
			this.aByteArray45[local13] = 0;
		}
		while (this.aByteArray45.length - 1 > local13) {
			local13++;
			this.aByteArray45[local13] = 0;
		}
	}
}
