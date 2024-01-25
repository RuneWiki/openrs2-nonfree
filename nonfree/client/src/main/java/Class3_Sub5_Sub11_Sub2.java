import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class3_Sub5_Sub11_Sub2 extends Class3_Sub5_Sub11 {

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
	public int anInt8266;

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
	public int anInt8268;

	@OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
	public int anInt8273;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
	public int anInt8274;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!ee;II)V")
	public Class3_Sub5_Sub11_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray69 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)Z")
	public boolean method6796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray69.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIIIIII)V")
	public void method6798(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg5) {
			local7 = (arg3 - arg2 << 16) / (arg4 - arg5);
		}
		@Pc(36) int local36 = 0;
		if (arg4 != arg0) {
			local36 = (arg1 - arg3 << 16) / (arg0 - arg4);
		}
		@Pc(53) int local53 = 0;
		if (arg5 != arg0) {
			local53 = (arg2 - arg1 << 16) / (arg5 - arg0);
		}
		if (arg5 <= arg4 && arg0 >= arg5) {
			if (arg0 > arg4) {
				arg1 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local53;
					arg2 -= arg5 * local7;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local36;
					arg4 = 0;
				}
				if (arg5 != arg4 && local7 > local53 || arg5 == arg4 && local36 < local53) {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt8268 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg1 >> 16, arg3 >> 16, arg5);
								arg5 += this.anInt8268;
								arg1 += local53;
								arg3 += local36;
							}
						}
						Static469.method6285(this.aByteArray69, arg1 >> 16, arg2 >> 16, arg5);
						arg2 += local7;
						arg1 += local53;
						arg5 += this.anInt8268;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt8268 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg3 >> 16, arg1 >> 16, arg5);
								arg3 += local36;
								arg1 += local53;
								arg5 += this.anInt8268;
							}
						}
						Static469.method6285(this.aByteArray69, arg2 >> 16, arg1 >> 16, arg5);
						arg5 += this.anInt8268;
						arg1 += local53;
						arg2 += local7;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local7 * arg5;
					arg3 -= arg5 * local53;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg1 -= local36 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg5 || local53 >= local7) && (arg5 != arg0 || local36 <= local7)) {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt8268;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg2 >> 16, arg1 >> 16, arg5);
								arg1 += local36;
								arg2 += local7;
								arg5 += this.anInt8268;
							}
						}
						Static469.method6285(this.aByteArray69, arg2 >> 16, arg3 >> 16, arg5);
						arg5 += this.anInt8268;
						arg2 += local7;
						arg3 += local53;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt8268 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg1 >> 16, arg2 >> 16, arg5);
								arg5 += this.anInt8268;
								arg2 += local7;
								arg1 += local36;
							}
						}
						Static469.method6285(this.aByteArray69, arg3 >> 16, arg2 >> 16, arg5);
						arg5 += this.anInt8268;
						arg2 += local7;
						arg3 += local53;
					}
				}
			}
		} else if (arg4 <= arg0) {
			if (arg5 > arg0) {
				arg2 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= arg4 * local36;
					arg2 -= local7 * arg4;
					arg4 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local53 * arg0;
					arg0 = 0;
				}
				if (arg4 != arg0 && local7 < local36 || arg0 == arg4 && local53 < local7) {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt8268;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg2 >> 16, arg1 >> 16, arg4);
								arg4 += this.anInt8268;
								arg2 += local7;
								arg1 += local53;
							}
						}
						Static469.method6285(this.aByteArray69, arg2 >> 16, arg3 >> 16, arg4);
						arg3 += local36;
						arg2 += local7;
						arg4 += this.anInt8268;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg4;
					arg4 *= this.anInt8268;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg1 >> 16, arg2 >> 16, arg4);
								arg1 += local53;
								arg2 += local7;
								arg4 += this.anInt8268;
							}
						}
						Static469.method6285(this.aByteArray69, arg3 >> 16, arg2 >> 16, arg4);
						arg2 += local7;
						arg4 += this.anInt8268;
						arg3 += local36;
					}
				}
			} else {
				arg1 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg1 -= arg4 * local7;
					arg3 -= arg4 * local36;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local53 * arg5;
					arg5 = 0;
				}
				if (local36 <= local7) {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt8268 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg3 >> 16, arg2 >> 16, arg4);
								arg4 += this.anInt8268;
								arg3 += local36;
								arg2 += local53;
							}
						}
						Static469.method6285(this.aByteArray69, arg3 >> 16, arg1 >> 16, arg4);
						arg1 += local7;
						arg4 += this.anInt8268;
						arg3 += local36;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg4;
					arg4 *= this.anInt8268;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static469.method6285(this.aByteArray69, arg2 >> 16, arg3 >> 16, arg4);
								arg3 += local36;
								arg4 += this.anInt8268;
								arg2 += local53;
							}
						}
						Static469.method6285(this.aByteArray69, arg1 >> 16, arg3 >> 16, arg4);
						arg1 += local7;
						arg3 += local36;
						arg4 += this.anInt8268;
					}
				}
			}
		} else if (arg5 < arg4) {
			arg3 = arg1 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= local36 * arg0;
				arg1 -= arg0 * local53;
				arg0 = 0;
			}
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= local7 * arg5;
				arg5 = 0;
			}
			if (local36 < local53) {
				arg4 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt8268 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static469.method6285(this.aByteArray69, arg3 >> 16, arg2 >> 16, arg0);
							arg3 += local36;
							arg2 += local7;
							arg0 += this.anInt8268;
						}
					}
					Static469.method6285(this.aByteArray69, arg3 >> 16, arg1 >> 16, arg0);
					arg3 += local36;
					arg0 += this.anInt8268;
					arg1 += local53;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt8268 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static469.method6285(this.aByteArray69, arg2 >> 16, arg3 >> 16, arg0);
							arg2 += local7;
							arg3 += local36;
							arg0 += this.anInt8268;
						}
					}
					Static469.method6285(this.aByteArray69, arg1 >> 16, arg3 >> 16, arg0);
					arg3 += local36;
					arg0 += this.anInt8268;
					arg1 += local53;
				}
			}
		} else {
			arg2 = arg1 <<= 0x10;
			arg3 <<= 0x10;
			if (arg0 < 0) {
				arg2 -= arg0 * local36;
				arg1 -= local53 * arg0;
				arg0 = 0;
			}
			if (arg4 < 0) {
				arg3 -= local7 * arg4;
				arg4 = 0;
			}
			if (local36 < local53) {
				arg5 -= arg4;
				arg4 -= arg0;
				arg0 = this.anInt8268 * arg0;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static469.method6285(this.aByteArray69, arg3 >> 16, arg1 >> 16, arg0);
							arg0 += this.anInt8268;
							arg1 += local53;
							arg3 += local7;
						}
					}
					Static469.method6285(this.aByteArray69, arg2 >> 16, arg1 >> 16, arg0);
					arg1 += local53;
					arg2 += local36;
					arg0 += this.anInt8268;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg0;
				arg0 *= this.anInt8268;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static469.method6285(this.aByteArray69, arg1 >> 16, arg3 >> 16, arg0);
							arg1 += local53;
							arg3 += local7;
							arg0 += this.anInt8268;
						}
					}
					Static469.method6285(this.aByteArray69, arg1 >> 16, arg2 >> 16, arg0);
					arg2 += local36;
					arg1 += local53;
					arg0 += this.anInt8268;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public void method6800() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray69.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
			local7++;
			this.aByteArray69[local7] = 0;
		}
		while (this.aByteArray69.length - 1 > local7) {
			local7++;
			this.aByteArray69[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	public void method6803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt8266 = arg2;
		this.anInt8274 = arg0;
		this.anInt8273 = arg3 - arg2;
		this.anInt8268 = arg1 - arg0;
	}
}
