import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class2_Sub13_Sub6_Sub2 extends Class2_Sub13_Sub6 {

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	public int anInt8861;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	public int anInt8863;

	@OriginalMember(owner = "client!vh", name = "F", descriptor = "I")
	public int anInt8866;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	public int anInt8870;

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "[B")
	public final byte[] aByteArray115;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!kw;II)V")
	public Class2_Sub13_Sub6_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray115 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	public void method7447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8861 = arg0 - arg2;
		this.anInt8866 = arg2;
		this.anInt8863 = arg3;
		this.anInt8870 = arg1 - arg3;
	}

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "(I)V")
	public void method7448() {
		@Pc(7) int local7 = -1;
		@Pc(19) int local19 = this.aByteArray115.length - 8;
		while (local7 < local19) {
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
			local7++;
			this.aByteArray115[local7] = 0;
		}
		while (local7 < this.aByteArray115.length - 1) {
			local7++;
			this.aByteArray115[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIIIIII)V")
	public void method7449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg1 != arg5) {
			local13 = (arg3 - arg2 << 16) / (arg5 - arg1);
		}
		@Pc(30) int local30 = 0;
		if (arg5 != arg4) {
			local30 = (arg0 - arg3 << 16) / (arg4 - arg5);
		}
		@Pc(50) int local50 = 0;
		if (arg4 != arg1) {
			local50 = (arg2 - arg0 << 16) / (arg1 - arg4);
		}
		if (arg1 <= arg5 && arg1 <= arg4) {
			if (arg5 >= arg4) {
				arg3 = arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local13 * arg1;
					arg3 -= local50 * arg1;
					arg1 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local30;
					arg4 = 0;
				}
				if (arg1 != arg4 && local50 < local13 || arg4 == arg1 && local13 < local30) {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt8861 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static502.method7396(arg1, arg0 >> 16, this.aByteArray115, arg2 >> 16);
								arg1 += this.anInt8861;
								arg2 += local13;
								arg0 += local30;
							}
						}
						Static502.method7396(arg1, arg3 >> 16, this.aByteArray115, arg2 >> 16);
						arg1 += this.anInt8861;
						arg3 += local50;
						arg2 += local13;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 = this.anInt8861 * arg1;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static502.method7396(arg1, arg2 >> 16, this.aByteArray115, arg0 >> 16);
								arg1 += this.anInt8861;
								arg0 += local30;
								arg2 += local13;
							}
						}
						Static502.method7396(arg1, arg2 >> 16, this.aByteArray115, arg3 >> 16);
						arg1 += this.anInt8861;
						arg3 += local50;
						arg2 += local13;
					}
				}
			} else {
				arg0 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local13 * arg1;
					arg0 -= arg1 * local50;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg3 -= arg5 * local30;
					arg5 = 0;
				}
				if ((arg5 == arg1 || local13 <= local50) && (arg5 != arg1 || local30 >= local50)) {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt8861 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static502.method7396(arg1, arg3 >> 16, this.aByteArray115, arg0 >> 16);
								arg0 += local50;
								arg3 += local30;
								arg1 += this.anInt8861;
							}
						}
						Static502.method7396(arg1, arg2 >> 16, this.aByteArray115, arg0 >> 16);
						arg0 += local50;
						arg2 += local13;
						arg1 += this.anInt8861;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt8861 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static502.method7396(arg1, arg0 >> 16, this.aByteArray115, arg3 >> 16);
								arg1 += this.anInt8861;
								arg3 += local30;
								arg0 += local50;
							}
						}
						Static502.method7396(arg1, arg0 >> 16, this.aByteArray115, arg2 >> 16);
						arg1 += this.anInt8861;
						arg2 += local13;
						arg0 += local50;
					}
				}
			}
		} else if (arg5 > arg4) {
			if (arg1 >= arg5) {
				arg2 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local30;
					arg0 -= local50 * arg4;
					arg4 = 0;
				}
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local13 * arg5;
					arg5 = 0;
				}
				if (local50 > local30) {
					arg1 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt8861 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static502.method7396(arg4, arg3 >> 16, this.aByteArray115, arg0 >> 16);
								arg0 += local50;
								arg4 += this.anInt8861;
								arg3 += local13;
							}
						}
						Static502.method7396(arg4, arg2 >> 16, this.aByteArray115, arg0 >> 16);
						arg2 += local30;
						arg0 += local50;
						arg4 += this.anInt8861;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8861;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static502.method7396(arg4, arg0 >> 16, this.aByteArray115, arg3 >> 16);
								arg4 += this.anInt8861;
								arg3 += local13;
								arg0 += local50;
							}
						}
						Static502.method7396(arg4, arg0 >> 16, this.aByteArray115, arg2 >> 16);
						arg4 += this.anInt8861;
						arg2 += local30;
						arg0 += local50;
					}
				}
			} else {
				arg3 = arg0 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local30 * arg4;
					arg0 -= arg4 * local50;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= local13 * arg1;
					arg1 = 0;
				}
				if (local50 > local30) {
					arg5 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt8861;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static502.method7396(arg4, arg3 >> 16, this.aByteArray115, arg2 >> 16);
								arg2 += local13;
								arg4 += this.anInt8861;
								arg3 += local30;
							}
						}
						Static502.method7396(arg4, arg3 >> 16, this.aByteArray115, arg0 >> 16);
						arg4 += this.anInt8861;
						arg0 += local50;
						arg3 += local30;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt8861;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static502.method7396(arg4, arg2 >> 16, this.aByteArray115, arg3 >> 16);
								arg4 += this.anInt8861;
								arg2 += local13;
								arg3 += local30;
							}
						}
						Static502.method7396(arg4, arg0 >> 16, this.aByteArray115, arg3 >> 16);
						arg0 += local50;
						arg3 += local30;
						arg4 += this.anInt8861;
					}
				}
			}
		} else if (arg4 < arg1) {
			arg2 = arg3 <<= 0x10;
			if (arg5 < 0) {
				arg3 -= local30 * arg5;
				arg2 -= local13 * arg5;
				arg5 = 0;
			}
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local50;
				arg4 = 0;
			}
			if ((arg4 == arg5 || local13 >= local30) && (arg5 != arg4 || local50 >= local13)) {
				arg1 -= arg4;
				arg4 -= arg5;
				arg5 *= this.anInt8861;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static502.method7396(arg5, arg0 >> 16, this.aByteArray115, arg2 >> 16);
							arg5 += this.anInt8861;
							arg0 += local50;
							arg2 += local13;
						}
					}
					Static502.method7396(arg5, arg3 >> 16, this.aByteArray115, arg2 >> 16);
					arg2 += local13;
					arg3 += local30;
					arg5 += this.anInt8861;
				}
			} else {
				arg1 -= arg4;
				arg4 -= arg5;
				arg5 = this.anInt8861 * arg5;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static502.method7396(arg5, arg2 >> 16, this.aByteArray115, arg0 >> 16);
							arg2 += local13;
							arg5 += this.anInt8861;
							arg0 += local50;
						}
					}
					Static502.method7396(arg5, arg2 >> 16, this.aByteArray115, arg3 >> 16);
					arg5 += this.anInt8861;
					arg3 += local30;
					arg2 += local13;
				}
			}
		} else {
			arg0 = arg3 <<= 0x10;
			if (arg5 < 0) {
				arg0 -= arg5 * local13;
				arg3 -= arg5 * local30;
				arg5 = 0;
			}
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local50 * arg1;
				arg1 = 0;
			}
			if (local30 <= local13) {
				arg4 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt8861;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static502.method7396(arg5, arg3 >> 16, this.aByteArray115, arg2 >> 16);
							arg2 += local50;
							arg5 += this.anInt8861;
							arg3 += local30;
						}
					}
					Static502.method7396(arg5, arg3 >> 16, this.aByteArray115, arg0 >> 16);
					arg3 += local30;
					arg0 += local13;
					arg5 += this.anInt8861;
				}
			} else {
				arg4 -= arg1;
				arg1 -= arg5;
				arg5 *= this.anInt8861;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static502.method7396(arg5, arg2 >> 16, this.aByteArray115, arg3 >> 16);
							arg3 += local30;
							arg2 += local50;
							arg5 += this.anInt8861;
						}
					}
					Static502.method7396(arg5, arg0 >> 16, this.aByteArray115, arg3 >> 16);
					arg5 += this.anInt8861;
					arg3 += local30;
					arg0 += local13;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZ)Z")
	public boolean method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray115.length >= arg0 * arg1;
	}
}
