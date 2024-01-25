import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class3_Sub6_Sub12_Sub1 extends Class3_Sub6_Sub12 {

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "I")
	public int anInt4912;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "I")
	public int anInt4915;

	@OriginalMember(owner = "client!ip", name = "F", descriptor = "I")
	public int anInt4916;

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
	public int anInt4918;

	@OriginalMember(owner = "client!ip", name = "M", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!sf;II)V")
	public Class3_Sub6_Sub12_Sub1(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBIIIII)V")
	public void method4117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg3) {
			local7 = (arg5 - arg1 << 16) / (arg4 - arg3);
		}
		@Pc(27) int local27 = 0;
		if (arg2 != arg4) {
			local27 = (arg0 - arg5 << 16) / (arg2 - arg4);
		}
		@Pc(52) int local52 = 0;
		if (arg3 != arg2) {
			local52 = (arg1 - arg0 << 16) / (arg3 - arg2);
		}
		if (arg4 >= arg3 && arg2 >= arg3) {
			if (arg4 < arg2) {
				arg0 = arg1 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local7;
					arg0 -= local52 * arg3;
					arg3 = 0;
				}
				if (arg4 < 0) {
					arg5 -= local27 * arg4;
					arg4 = 0;
				}
				if (arg4 != arg3 && local7 > local52 || arg3 == arg4 && local27 < local52) {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt4915 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg3, arg0 >> 16, arg5 >> 16);
								arg5 += local27;
								arg0 += local52;
								arg3 += this.anInt4915;
							}
						}
						Static117.method2137(this.aByteArray49, arg3, arg0 >> 16, arg1 >> 16);
						arg1 += local7;
						arg3 += this.anInt4915;
						arg0 += local52;
					}
				} else {
					arg2 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt4915 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg3, arg5 >> 16, arg0 >> 16);
								arg5 += local27;
								arg0 += local52;
								arg3 += this.anInt4915;
							}
						}
						Static117.method2137(this.aByteArray49, arg3, arg1 >> 16, arg0 >> 16);
						arg0 += local52;
						arg1 += local7;
						arg3 += this.anInt4915;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local52 * arg3;
					arg1 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local27 * arg2;
					arg2 = 0;
				}
				if ((arg3 == arg2 || local52 >= local7) && (arg2 != arg3 || local27 <= local7)) {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt4915;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg3, arg1 >> 16, arg0 >> 16);
								arg0 += local27;
								arg1 += local7;
								arg3 += this.anInt4915;
							}
						}
						Static117.method2137(this.aByteArray49, arg3, arg1 >> 16, arg5 >> 16);
						arg1 += local7;
						arg5 += local52;
						arg3 += this.anInt4915;
					}
				} else {
					arg4 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt4915;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg3, arg0 >> 16, arg1 >> 16);
								arg3 += this.anInt4915;
								arg0 += local27;
								arg1 += local7;
							}
						}
						Static117.method2137(this.aByteArray49, arg3, arg5 >> 16, arg1 >> 16);
						arg1 += local7;
						arg3 += this.anInt4915;
						arg5 += local52;
					}
				}
			}
		} else if (arg4 <= arg2) {
			if (arg2 >= arg3) {
				arg0 = arg5 <<= 0x10;
				arg1 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= local7 * arg4;
					arg5 -= arg4 * local27;
					arg4 = 0;
				}
				if (arg3 < 0) {
					arg1 -= arg3 * local52;
					arg3 = 0;
				}
				if (local7 < local27) {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 = this.anInt4915 * arg4;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg4, arg1 >> 16, arg5 >> 16);
								arg5 += local27;
								arg1 += local52;
								arg4 += this.anInt4915;
							}
						}
						Static117.method2137(this.aByteArray49, arg4, arg0 >> 16, arg5 >> 16);
						arg5 += local27;
						arg4 += this.anInt4915;
						arg0 += local7;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg4;
					arg4 *= this.anInt4915;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg4, arg5 >> 16, arg1 >> 16);
								arg1 += local52;
								arg4 += this.anInt4915;
								arg5 += local27;
							}
						}
						Static117.method2137(this.aByteArray49, arg4, arg5 >> 16, arg0 >> 16);
						arg5 += local27;
						arg4 += this.anInt4915;
						arg0 += local7;
					}
				}
			} else {
				arg1 = arg5 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local7;
					arg5 -= arg4 * local27;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= local52 * arg2;
					arg2 = 0;
				}
				if ((arg2 == arg4 || local27 <= local7) && (arg2 != arg4 || local7 <= local52)) {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt4915 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg4, arg0 >> 16, arg1 >> 16);
								arg0 += local52;
								arg1 += local7;
								arg4 += this.anInt4915;
							}
						}
						Static117.method2137(this.aByteArray49, arg4, arg5 >> 16, arg1 >> 16);
						arg1 += local7;
						arg4 += this.anInt4915;
						arg5 += local27;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg4;
					arg4 = this.anInt4915 * arg4;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static117.method2137(this.aByteArray49, arg4, arg1 >> 16, arg0 >> 16);
								arg0 += local52;
								arg1 += local7;
								arg4 += this.anInt4915;
							}
						}
						Static117.method2137(this.aByteArray49, arg4, arg1 >> 16, arg5 >> 16);
						arg4 += this.anInt4915;
						arg5 += local27;
						arg1 += local7;
					}
				}
			}
		} else if (arg3 >= arg4) {
			arg1 = arg0 <<= 0x10;
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= local27 * arg2;
				arg0 -= arg2 * local52;
				arg2 = 0;
			}
			if (arg4 < 0) {
				arg5 -= arg4 * local7;
				arg4 = 0;
			}
			if (local52 <= local27) {
				arg3 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt4915;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static117.method2137(this.aByteArray49, arg2, arg0 >> 16, arg5 >> 16);
							arg2 += this.anInt4915;
							arg0 += local52;
							arg5 += local7;
						}
					}
					Static117.method2137(this.aByteArray49, arg2, arg0 >> 16, arg1 >> 16);
					arg0 += local52;
					arg1 += local27;
					arg2 += this.anInt4915;
				}
			} else {
				arg3 -= arg4;
				arg4 -= arg2;
				arg2 *= this.anInt4915;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static117.method2137(this.aByteArray49, arg2, arg5 >> 16, arg0 >> 16);
							arg2 += this.anInt4915;
							arg5 += local7;
							arg0 += local52;
						}
					}
					Static117.method2137(this.aByteArray49, arg2, arg1 >> 16, arg0 >> 16);
					arg2 += this.anInt4915;
					arg0 += local52;
					arg1 += local27;
				}
			}
		} else {
			arg5 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local52 * arg2;
				arg5 -= local27 * arg2;
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg1 -= arg3 * local7;
				arg3 = 0;
			}
			if (local52 > local27) {
				arg4 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt4915 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static117.method2137(this.aByteArray49, arg2, arg5 >> 16, arg1 >> 16);
							arg5 += local27;
							arg1 += local7;
							arg2 += this.anInt4915;
						}
					}
					Static117.method2137(this.aByteArray49, arg2, arg5 >> 16, arg0 >> 16);
					arg2 += this.anInt4915;
					arg0 += local52;
					arg5 += local27;
				}
			} else {
				arg4 -= arg3;
				arg3 -= arg2;
				arg2 *= this.anInt4915;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static117.method2137(this.aByteArray49, arg2, arg1 >> 16, arg5 >> 16);
							arg5 += local27;
							arg2 += this.anInt4915;
							arg1 += local7;
						}
					}
					Static117.method2137(this.aByteArray49, arg2, arg0 >> 16, arg5 >> 16);
					arg0 += local52;
					arg2 += this.anInt4915;
					arg5 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public void method4119() {
		@Pc(15) int local15 = -1;
		@Pc(21) int local21 = this.aByteArray49.length - 8;
		while (local21 > local15) {
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
			local15++;
			this.aByteArray49[local15] = 0;
		}
		while (local15 < this.aByteArray49.length - 1) {
			local15++;
			this.aByteArray49[local15] = 0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)Z")
	public boolean method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray49.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII)V")
	public void method4122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4916 = arg2;
		this.anInt4918 = arg3;
		this.anInt4915 = arg0 - arg3;
		this.anInt4912 = arg1 - arg2;
	}
}
