import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class2_Sub5_Sub12_Sub1 extends Class2_Sub5_Sub12 {

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
	public int anInt5308;

	@OriginalMember(owner = "client!jt", name = "S", descriptor = "I")
	public int anInt5312;

	@OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
	public int anInt5313;

	@OriginalMember(owner = "client!jt", name = "U", descriptor = "[B")
	public final byte[] aByteArray49;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!gt;II)V")
	public Class2_Sub5_Sub12_Sub1(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIII)V")
	public void method4438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5313 = arg1;
		this.anInt5307 = arg3 - arg0;
		this.anInt5312 = arg0;
		this.anInt5308 = arg2 - arg1;
	}

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "(I)V")
	public void method4439() {
		@Pc(7) int local7 = -1;
		@Pc(19) int local19 = this.aByteArray49.length - 8;
		while (local19 > local7) {
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
			local7++;
			this.aByteArray49[local7] = 0;
		}
		while (this.aByteArray49.length - 1 > local7) {
			local7++;
			this.aByteArray49[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)Z")
	public boolean method4440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray49.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIZI)V")
	public void method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = 0;
		if (arg3 != arg5) {
			local13 = (arg0 - arg1 << 16) / (arg5 - arg3);
		}
		@Pc(30) int local30 = 0;
		if (arg5 != arg4) {
			local30 = (arg2 - arg0 << 16) / (arg4 - arg5);
		}
		@Pc(51) int local51 = 0;
		if (arg3 != arg4) {
			local51 = (arg1 - arg2 << 16) / (arg3 - arg4);
		}
		if (arg3 <= arg5 && arg3 <= arg4) {
			if (arg4 <= arg5) {
				arg0 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= arg3 * local13;
					arg0 -= arg3 * local51;
					arg3 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local30;
					arg4 = 0;
				}
				if (arg3 != arg4 && local13 > local51 || arg4 == arg3 && local30 > local13) {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt5308 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg1 >> 16, arg2 >> 16, arg3);
								arg2 += local30;
								arg1 += local13;
								arg3 += this.anInt5308;
							}
						}
						Static182.method3301(this.aByteArray49, arg1 >> 16, arg0 >> 16, arg3);
						arg3 += this.anInt5308;
						arg1 += local13;
						arg0 += local51;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg3;
					arg3 = this.anInt5308 * arg3;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg2 >> 16, arg1 >> 16, arg3);
								arg2 += local30;
								arg3 += this.anInt5308;
								arg1 += local13;
							}
						}
						Static182.method3301(this.aByteArray49, arg0 >> 16, arg1 >> 16, arg3);
						arg0 += local51;
						arg1 += local13;
						arg3 += this.anInt5308;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local51 * arg3;
					arg1 -= arg3 * local13;
					arg3 = 0;
				}
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local30;
					arg5 = 0;
				}
				if ((arg5 == arg3 || local51 >= local13) && (arg3 != arg5 || local30 >= local51)) {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt5308;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg2 >> 16, arg0 >> 16, arg3);
								arg2 += local51;
								arg0 += local30;
								arg3 += this.anInt5308;
							}
						}
						Static182.method3301(this.aByteArray49, arg2 >> 16, arg1 >> 16, arg3);
						arg3 += this.anInt5308;
						arg1 += local13;
						arg2 += local51;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt5308 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg0 >> 16, arg2 >> 16, arg3);
								arg0 += local30;
								arg3 += this.anInt5308;
								arg2 += local51;
							}
						}
						Static182.method3301(this.aByteArray49, arg1 >> 16, arg2 >> 16, arg3);
						arg2 += local51;
						arg3 += this.anInt5308;
						arg1 += local13;
					}
				}
			}
		} else if (arg5 <= arg4) {
			if (arg4 >= arg3) {
				arg2 = arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local30;
					arg2 -= local13 * arg5;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local51 * arg3;
					arg3 = 0;
				}
				if (local13 < local30) {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt5308;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg0 >> 16, arg1 >> 16, arg5);
								arg0 += local30;
								arg5 += this.anInt5308;
								arg1 += local51;
							}
						}
						Static182.method3301(this.aByteArray49, arg0 >> 16, arg2 >> 16, arg5);
						arg5 += this.anInt5308;
						arg2 += local13;
						arg0 += local30;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt5308;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg1 >> 16, arg0 >> 16, arg5);
								arg5 += this.anInt5308;
								arg0 += local30;
								arg1 += local51;
							}
						}
						Static182.method3301(this.aByteArray49, arg2 >> 16, arg0 >> 16, arg5);
						arg0 += local30;
						arg2 += local13;
						arg5 += this.anInt5308;
					}
				}
			} else {
				arg1 = arg0 <<= 0x10;
				if (arg5 < 0) {
					arg0 -= arg5 * local30;
					arg1 -= arg5 * local13;
					arg5 = 0;
				}
				arg2 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local51;
					arg4 = 0;
				}
				if ((arg4 == arg5 || local13 >= local30) && (arg4 != arg5 || local13 <= local51)) {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt5308 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg1 >> 16, arg2 >> 16, arg5);
								arg5 += this.anInt5308;
								arg2 += local51;
								arg1 += local13;
							}
						}
						Static182.method3301(this.aByteArray49, arg1 >> 16, arg0 >> 16, arg5);
						arg5 += this.anInt5308;
						arg1 += local13;
						arg0 += local30;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt5308;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static182.method3301(this.aByteArray49, arg2 >> 16, arg1 >> 16, arg5);
								arg1 += local13;
								arg2 += local51;
								arg5 += this.anInt5308;
							}
						}
						Static182.method3301(this.aByteArray49, arg0 >> 16, arg1 >> 16, arg5);
						arg0 += local30;
						arg5 += this.anInt5308;
						arg1 += local13;
					}
				}
			}
		} else if (arg3 >= arg5) {
			arg1 = arg2 <<= 0x10;
			arg0 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= arg4 * local30;
				arg2 -= local51 * arg4;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg0 -= local13 * arg5;
				arg5 = 0;
			}
			if (local51 > local30) {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt5308 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static182.method3301(this.aByteArray49, arg2 >> 16, arg0 >> 16, arg4);
							arg2 += local51;
							arg4 += this.anInt5308;
							arg0 += local13;
						}
					}
					Static182.method3301(this.aByteArray49, arg2 >> 16, arg1 >> 16, arg4);
					arg1 += local30;
					arg4 += this.anInt5308;
					arg2 += local51;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt5308;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static182.method3301(this.aByteArray49, arg0 >> 16, arg2 >> 16, arg4);
							arg4 += this.anInt5308;
							arg2 += local51;
							arg0 += local13;
						}
					}
					Static182.method3301(this.aByteArray49, arg1 >> 16, arg2 >> 16, arg4);
					arg2 += local51;
					arg1 += local30;
					arg4 += this.anInt5308;
				}
			}
		} else {
			arg0 = arg2 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local30;
				arg2 -= local51 * arg4;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg1 -= local13 * arg3;
				arg3 = 0;
			}
			if (local30 >= local51) {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt5308;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static182.method3301(this.aByteArray49, arg0 >> 16, arg1 >> 16, arg4);
							arg4 += this.anInt5308;
							arg0 += local30;
							arg1 += local13;
						}
					}
					Static182.method3301(this.aByteArray49, arg0 >> 16, arg2 >> 16, arg4);
					arg4 += this.anInt5308;
					arg2 += local51;
					arg0 += local30;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt5308 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static182.method3301(this.aByteArray49, arg1 >> 16, arg0 >> 16, arg4);
							arg4 += this.anInt5308;
							arg0 += local30;
							arg1 += local13;
						}
					}
					Static182.method3301(this.aByteArray49, arg2 >> 16, arg0 >> 16, arg4);
					arg4 += this.anInt5308;
					arg0 += local30;
					arg2 += local51;
				}
			}
		}
	}
}
