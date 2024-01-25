import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class4_Sub5_Sub6_Sub2 extends Class4_Sub5_Sub6 {

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
	public int anInt9187;

	@OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
	public int anInt9191;

	@OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
	public int anInt9193;

	@OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
	public int anInt9194;

	@OriginalMember(owner = "client!tm", name = "G", descriptor = "[B")
	public final byte[] aByteArray101;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!kga;II)V")
	public Class4_Sub5_Sub6_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray101 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIBI)V")
	public void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = 0;
		if (arg1 != arg4) {
			local15 = (arg0 - arg3 << 16) / (arg4 - arg1);
		}
		@Pc(35) int local35 = 0;
		if (arg4 != arg5) {
			local35 = (arg2 - arg0 << 16) / (arg5 - arg4);
		}
		@Pc(55) int local55 = 0;
		if (arg5 != arg1) {
			local55 = (arg3 - arg2 << 16) / (arg1 - arg5);
		}
		if (arg1 <= arg4 && arg5 >= arg1) {
			if (arg4 >= arg5) {
				arg0 = arg3 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local55 * arg1;
					arg3 -= local15 * arg1;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg2 -= local35 * arg5;
					arg5 = 0;
				}
				if (arg5 != arg1 && local55 < local15 || arg1 == arg5 && local15 < local35) {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt9194;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static405.method6367(arg1, this.aByteArray101, arg3 >> 16, arg2 >> 16);
								arg2 += local35;
								arg1 += this.anInt9194;
								arg3 += local15;
							}
						}
						Static405.method6367(arg1, this.aByteArray101, arg3 >> 16, arg0 >> 16);
						arg0 += local55;
						arg3 += local15;
						arg1 += this.anInt9194;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg1;
					arg1 *= this.anInt9194;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static405.method6367(arg1, this.aByteArray101, arg2 >> 16, arg3 >> 16);
								arg2 += local35;
								arg3 += local15;
								arg1 += this.anInt9194;
							}
						}
						Static405.method6367(arg1, this.aByteArray101, arg0 >> 16, arg3 >> 16);
						arg0 += local55;
						arg1 += this.anInt9194;
						arg3 += local15;
					}
				}
			} else {
				arg2 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg2 -= arg1 * local55;
					arg3 -= local15 * arg1;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg0 -= local35 * arg4;
					arg4 = 0;
				}
				if ((arg1 == arg4 || local55 >= local15) && (arg1 != arg4 || local35 >= local55)) {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt9194;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static405.method6367(arg1, this.aByteArray101, arg2 >> 16, arg0 >> 16);
								arg1 += this.anInt9194;
								arg0 += local35;
								arg2 += local55;
							}
						}
						Static405.method6367(arg1, this.aByteArray101, arg2 >> 16, arg3 >> 16);
						arg3 += local15;
						arg1 += this.anInt9194;
						arg2 += local55;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt9194;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static405.method6367(arg1, this.aByteArray101, arg0 >> 16, arg2 >> 16);
								arg2 += local55;
								arg1 += this.anInt9194;
								arg0 += local35;
							}
						}
						Static405.method6367(arg1, this.aByteArray101, arg3 >> 16, arg2 >> 16);
						arg2 += local55;
						arg1 += this.anInt9194;
						arg3 += local15;
					}
				}
			}
		} else if (arg5 < arg4) {
			if (arg1 >= arg4) {
				arg3 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local55 * arg5;
					arg3 -= arg5 * local35;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg4 < 0) {
					arg0 -= arg4 * local15;
					arg4 = 0;
				}
				if (local35 >= local55) {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt9194 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static405.method6367(arg5, this.aByteArray101, arg0 >> 16, arg2 >> 16);
								arg5 += this.anInt9194;
								arg2 += local55;
								arg0 += local15;
							}
						}
						Static405.method6367(arg5, this.aByteArray101, arg3 >> 16, arg2 >> 16);
						arg3 += local35;
						arg5 += this.anInt9194;
						arg2 += local55;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt9194 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static405.method6367(arg5, this.aByteArray101, arg2 >> 16, arg0 >> 16);
								arg5 += this.anInt9194;
								arg0 += local15;
								arg2 += local55;
							}
						}
						Static405.method6367(arg5, this.aByteArray101, arg2 >> 16, arg3 >> 16);
						arg2 += local55;
						arg5 += this.anInt9194;
						arg3 += local35;
					}
				}
			} else {
				arg0 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local55;
					arg0 -= arg5 * local35;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local15;
					arg1 = 0;
				}
				if (local35 >= local55) {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt9194 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static405.method6367(arg5, this.aByteArray101, arg0 >> 16, arg3 >> 16);
								arg5 += this.anInt9194;
								arg3 += local15;
								arg0 += local35;
							}
						}
						Static405.method6367(arg5, this.aByteArray101, arg0 >> 16, arg2 >> 16);
						arg2 += local55;
						arg5 += this.anInt9194;
						arg0 += local35;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt9194;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static405.method6367(arg5, this.aByteArray101, arg3 >> 16, arg0 >> 16);
								arg0 += local35;
								arg3 += local15;
								arg5 += this.anInt9194;
							}
						}
						Static405.method6367(arg5, this.aByteArray101, arg2 >> 16, arg0 >> 16);
						arg0 += local35;
						arg2 += local55;
						arg5 += this.anInt9194;
					}
				}
			}
		} else if (arg5 >= arg1) {
			arg2 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg4 < 0) {
				arg0 -= arg4 * local35;
				arg2 -= arg4 * local15;
				arg4 = 0;
			}
			if (arg1 < 0) {
				arg3 -= local55 * arg1;
				arg1 = 0;
			}
			if (local35 <= local15) {
				arg5 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt9194;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static405.method6367(arg4, this.aByteArray101, arg3 >> 16, arg0 >> 16);
							arg4 += this.anInt9194;
							arg3 += local55;
							arg0 += local35;
						}
					}
					Static405.method6367(arg4, this.aByteArray101, arg2 >> 16, arg0 >> 16);
					arg4 += this.anInt9194;
					arg2 += local15;
					arg0 += local35;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt9194;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static405.method6367(arg4, this.aByteArray101, arg0 >> 16, arg3 >> 16);
							arg0 += local35;
							arg4 += this.anInt9194;
							arg3 += local55;
						}
					}
					Static405.method6367(arg4, this.aByteArray101, arg0 >> 16, arg2 >> 16);
					arg0 += local35;
					arg4 += this.anInt9194;
					arg2 += local15;
				}
			}
		} else {
			arg3 = arg0 <<= 0x10;
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg3 -= arg4 * local15;
				arg0 -= arg4 * local35;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg2 -= local55 * arg5;
				arg5 = 0;
			}
			if (arg5 != arg4 && local15 < local35 || arg5 == arg4 && local55 < local15) {
				arg1 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt9194 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static405.method6367(arg4, this.aByteArray101, arg2 >> 16, arg3 >> 16);
							arg3 += local15;
							arg4 += this.anInt9194;
							arg2 += local55;
						}
					}
					Static405.method6367(arg4, this.aByteArray101, arg0 >> 16, arg3 >> 16);
					arg3 += local15;
					arg0 += local35;
					arg4 += this.anInt9194;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg4;
				arg4 = this.anInt9194 * arg4;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static405.method6367(arg4, this.aByteArray101, arg3 >> 16, arg2 >> 16);
							arg2 += local55;
							arg3 += local15;
							arg4 += this.anInt9194;
						}
					}
					Static405.method6367(arg4, this.aByteArray101, arg3 >> 16, arg0 >> 16);
					arg3 += local15;
					arg4 += this.anInt9194;
					arg0 += local35;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIZ)Z")
	public boolean method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 * arg1 <= this.aByteArray101.length;
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V")
	public void method7484() {
		@Pc(7) int local7 = -1;
		@Pc(18) int local18 = this.aByteArray101.length - 8;
		while (local18 > local7) {
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
			local7++;
			this.aByteArray101[local7] = 0;
		}
		while (this.aByteArray101.length - 1 > local7) {
			local7++;
			this.aByteArray101[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)V")
	public void method7486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9187 = arg0;
		this.anInt9191 = arg2;
		this.anInt9194 = arg3 - arg0;
		this.anInt9193 = arg1 - arg2;
	}
}
