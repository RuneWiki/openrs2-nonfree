import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class3_Sub7_Sub17_Sub1 extends Class3_Sub7_Sub17 {

	@OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
	public int anInt7076;

	@OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
	public int anInt7084;

	@OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
	public int anInt7086;

	@OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
	public int anInt7087;

	@OriginalMember(owner = "client!oca", name = "w", descriptor = "[B")
	public final byte[] aByteArray63;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!rl;II)V")
	public Class3_Sub7_Sub17_Sub1(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray63 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)Z")
	public boolean method6243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray63.length;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZIIII)V")
	public void method6244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7076 = arg2;
		this.anInt7087 = arg3 - arg2;
		this.anInt7084 = arg1;
		this.anInt7086 = arg0 - arg1;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIBII)V")
	public void method6245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg2) {
			local7 = (arg3 - arg4 << 16) / (arg1 - arg2);
		}
		@Pc(28) int local28 = 0;
		if (arg0 != arg1) {
			local28 = (arg5 - arg3 << 16) / (arg0 - arg1);
		}
		@Pc(50) int local50 = 0;
		if (arg0 != arg2) {
			local50 = (arg4 - arg5 << 16) / (arg2 - arg0);
		}
		if (arg1 >= arg2 && arg2 <= arg0) {
			if (arg1 >= arg0) {
				arg3 = arg4 <<= 0x10;
				arg5 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg3 -= arg2 * local50;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg5 -= local28 * arg0;
					arg0 = 0;
				}
				if (arg2 != arg0 && local7 > local50 || arg0 == arg2 && local28 > local7) {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt7087;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static394.method6218(arg2, arg4 >> 16, arg5 >> 16, this.aByteArray63);
								arg5 += local28;
								arg4 += local7;
								arg2 += this.anInt7087;
							}
						}
						Static394.method6218(arg2, arg4 >> 16, arg3 >> 16, this.aByteArray63);
						arg4 += local7;
						arg3 += local50;
						arg2 += this.anInt7087;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt7087 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static394.method6218(arg2, arg5 >> 16, arg4 >> 16, this.aByteArray63);
								arg4 += local7;
								arg2 += this.anInt7087;
								arg5 += local28;
							}
						}
						Static394.method6218(arg2, arg3 >> 16, arg4 >> 16, this.aByteArray63);
						arg4 += local7;
						arg3 += local50;
						arg2 += this.anInt7087;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local7;
					arg5 -= local50 * arg2;
					arg2 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local28;
					arg1 = 0;
				}
				if ((arg2 == arg1 || local50 >= local7) && (arg2 != arg1 || local28 >= local50)) {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt7087 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static394.method6218(arg2, arg5 >> 16, arg3 >> 16, this.aByteArray63);
								arg2 += this.anInt7087;
								arg3 += local28;
								arg5 += local50;
							}
						}
						Static394.method6218(arg2, arg5 >> 16, arg4 >> 16, this.aByteArray63);
						arg2 += this.anInt7087;
						arg4 += local7;
						arg5 += local50;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt7087;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static394.method6218(arg2, arg3 >> 16, arg5 >> 16, this.aByteArray63);
								arg3 += local28;
								arg2 += this.anInt7087;
								arg5 += local50;
							}
						}
						Static394.method6218(arg2, arg4 >> 16, arg5 >> 16, this.aByteArray63);
						arg4 += local7;
						arg2 += this.anInt7087;
						arg5 += local50;
					}
				}
			}
		} else if (arg0 < arg1) {
			if (arg1 <= arg2) {
				arg4 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local28;
					arg5 -= arg0 * local50;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg3 -= local7 * arg1;
					arg1 = 0;
				}
				if (local28 < local50) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt7087;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static394.method6218(arg0, arg5 >> 16, arg3 >> 16, this.aByteArray63);
								arg5 += local50;
								arg0 += this.anInt7087;
								arg3 += local7;
							}
						}
						Static394.method6218(arg0, arg5 >> 16, arg4 >> 16, this.aByteArray63);
						arg0 += this.anInt7087;
						arg4 += local28;
						arg5 += local50;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 = this.anInt7087 * arg0;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static394.method6218(arg0, arg3 >> 16, arg5 >> 16, this.aByteArray63);
								arg0 += this.anInt7087;
								arg5 += local50;
								arg3 += local7;
							}
						}
						Static394.method6218(arg0, arg4 >> 16, arg5 >> 16, this.aByteArray63);
						arg5 += local50;
						arg0 += this.anInt7087;
						arg4 += local28;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local50 * arg0;
					arg3 -= arg0 * local28;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg2 = 0;
				}
				if (local50 > local28) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 = this.anInt7087 * arg0;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static394.method6218(arg0, arg4 >> 16, arg3 >> 16, this.aByteArray63);
								arg4 += local7;
								arg0 += this.anInt7087;
								arg3 += local28;
							}
						}
						Static394.method6218(arg0, arg5 >> 16, arg3 >> 16, this.aByteArray63);
						arg5 += local50;
						arg0 += this.anInt7087;
						arg3 += local28;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt7087;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static394.method6218(arg0, arg3 >> 16, arg4 >> 16, this.aByteArray63);
								arg3 += local28;
								arg0 += this.anInt7087;
								arg4 += local7;
							}
						}
						Static394.method6218(arg0, arg3 >> 16, arg5 >> 16, this.aByteArray63);
						arg3 += local28;
						arg0 += this.anInt7087;
						arg5 += local50;
					}
				}
			}
		} else if (arg0 >= arg2) {
			arg5 = arg3 <<= 0x10;
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= local7 * arg1;
				arg3 -= arg1 * local28;
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg4 -= local50 * arg2;
				arg2 = 0;
			}
			if (local7 >= local28) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt7087;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static394.method6218(arg1, arg4 >> 16, arg3 >> 16, this.aByteArray63);
							arg1 += this.anInt7087;
							arg3 += local28;
							arg4 += local50;
						}
					}
					Static394.method6218(arg1, arg5 >> 16, arg3 >> 16, this.aByteArray63);
					arg5 += local7;
					arg1 += this.anInt7087;
					arg3 += local28;
				}
			} else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 *= this.anInt7087;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static394.method6218(arg1, arg3 >> 16, arg4 >> 16, this.aByteArray63);
							arg4 += local50;
							arg3 += local28;
							arg1 += this.anInt7087;
						}
					}
					Static394.method6218(arg1, arg3 >> 16, arg5 >> 16, this.aByteArray63);
					arg5 += local7;
					arg1 += this.anInt7087;
					arg3 += local28;
				}
			}
		} else {
			arg4 = arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local28;
				arg4 -= arg1 * local7;
				arg1 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local50 * arg0;
				arg0 = 0;
			}
			if (arg0 != arg1 && local28 > local7 || arg1 == arg0 && local50 < local7) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt7087 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static394.method6218(arg1, arg5 >> 16, arg4 >> 16, this.aByteArray63);
							arg1 += this.anInt7087;
							arg4 += local7;
							arg5 += local50;
						}
					}
					Static394.method6218(arg1, arg3 >> 16, arg4 >> 16, this.aByteArray63);
					arg4 += local7;
					arg1 += this.anInt7087;
					arg3 += local28;
				}
			} else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt7087 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static394.method6218(arg1, arg4 >> 16, arg5 >> 16, this.aByteArray63);
							arg4 += local7;
							arg5 += local50;
							arg1 += this.anInt7087;
						}
					}
					Static394.method6218(arg1, arg4 >> 16, arg3 >> 16, this.aByteArray63);
					arg3 += local28;
					arg4 += local7;
					arg1 += this.anInt7087;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(B)V")
	public void method6247() {
		@Pc(7) int local7 = -1;
		@Pc(21) int local21 = this.aByteArray63.length - 8;
		while (local21 > local7) {
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
			local7++;
			this.aByteArray63[local7] = 0;
		}
		while (local7 < this.aByteArray63.length - 1) {
			local7++;
			this.aByteArray63[local7] = 0;
		}
	}
}
