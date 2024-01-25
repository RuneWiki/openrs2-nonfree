import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class3_Sub11_Sub3_Sub2 extends Class3_Sub11_Sub3 {

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
	public int anInt7822;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
	public int anInt7823;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
	public int anInt7827;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	public int anInt7829;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!dia;II)V")
	public Class3_Sub11_Sub3_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray84 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)Z")
	public boolean method6861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray84.length;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIIII)V")
	public void method6862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg5) {
			local7 = (arg1 - arg4 << 16) / (arg0 - arg5);
		}
		@Pc(29) int local29 = 0;
		if (arg3 != arg0) {
			local29 = (arg2 - arg1 << 16) / (arg3 - arg0);
		}
		@Pc(45) int local45 = 0;
		if (arg3 != arg5) {
			local45 = (arg4 - arg2 << 16) / (arg5 - arg3);
		}
		if (arg0 >= arg5 && arg5 <= arg3) {
			if (arg0 >= arg3) {
				arg1 = arg4 <<= 0x10;
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local7 * arg5;
					arg1 -= arg5 * local45;
					arg5 = 0;
				}
				if (arg3 < 0) {
					arg2 -= local29 * arg3;
					arg3 = 0;
				}
				if (arg5 != arg3 && local7 > local45 || arg3 == arg5 && local7 < local29) {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt7823 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static385.method5504(arg2 >> 16, arg4 >> 16, arg5, this.aByteArray84);
								arg4 += local7;
								arg5 += this.anInt7823;
								arg2 += local29;
							}
						}
						Static385.method5504(arg1 >> 16, arg4 >> 16, arg5, this.aByteArray84);
						arg5 += this.anInt7823;
						arg1 += local45;
						arg4 += local7;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt7823 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static385.method5504(arg4 >> 16, arg2 >> 16, arg5, this.aByteArray84);
								arg4 += local7;
								arg2 += local29;
								arg5 += this.anInt7823;
							}
						}
						Static385.method5504(arg4 >> 16, arg1 >> 16, arg5, this.aByteArray84);
						arg5 += this.anInt7823;
						arg1 += local45;
						arg4 += local7;
					}
				}
			} else {
				arg2 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local45;
					arg4 -= local7 * arg5;
					arg5 = 0;
				}
				arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local29 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg5 || local7 <= local45) && (arg0 != arg5 || local45 <= local29)) {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt7823 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static385.method5504(arg1 >> 16, arg2 >> 16, arg5, this.aByteArray84);
								arg2 += local45;
								arg5 += this.anInt7823;
								arg1 += local29;
							}
						}
						Static385.method5504(arg4 >> 16, arg2 >> 16, arg5, this.aByteArray84);
						arg2 += local45;
						arg4 += local7;
						arg5 += this.anInt7823;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt7823;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static385.method5504(arg2 >> 16, arg1 >> 16, arg5, this.aByteArray84);
								arg5 += this.anInt7823;
								arg2 += local45;
								arg1 += local29;
							}
						}
						Static385.method5504(arg2 >> 16, arg4 >> 16, arg5, this.aByteArray84);
						arg2 += local45;
						arg4 += local7;
						arg5 += this.anInt7823;
					}
				}
			}
		} else if (arg0 <= arg3) {
			if (arg5 > arg3) {
				arg4 = arg1 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= local7 * arg0;
					arg1 -= local29 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg2 -= local45 * arg3;
					arg3 = 0;
				}
				if (arg3 != arg0 && local7 < local29 || arg0 == arg3 && local45 < local7) {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt7823 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static385.method5504(arg4 >> 16, arg2 >> 16, arg0, this.aByteArray84);
								arg2 += local45;
								arg0 += this.anInt7823;
								arg4 += local7;
							}
						}
						Static385.method5504(arg4 >> 16, arg1 >> 16, arg0, this.aByteArray84);
						arg4 += local7;
						arg1 += local29;
						arg0 += this.anInt7823;
					}
				} else {
					arg5 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt7823 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static385.method5504(arg2 >> 16, arg4 >> 16, arg0, this.aByteArray84);
								arg2 += local45;
								arg4 += local7;
								arg0 += this.anInt7823;
							}
						}
						Static385.method5504(arg1 >> 16, arg4 >> 16, arg0, this.aByteArray84);
						arg4 += local7;
						arg0 += this.anInt7823;
						arg1 += local29;
					}
				}
			} else {
				arg2 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local29 * arg0;
					arg2 -= arg0 * local7;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local45 * arg5;
					arg5 = 0;
				}
				if (local29 <= local7) {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt7823;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static385.method5504(arg1 >> 16, arg4 >> 16, arg0, this.aByteArray84);
								arg0 += this.anInt7823;
								arg1 += local29;
								arg4 += local45;
							}
						}
						Static385.method5504(arg1 >> 16, arg2 >> 16, arg0, this.aByteArray84);
						arg0 += this.anInt7823;
						arg1 += local29;
						arg2 += local7;
					}
				} else {
					arg3 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt7823 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static385.method5504(arg4 >> 16, arg1 >> 16, arg0, this.aByteArray84);
								arg0 += this.anInt7823;
								arg4 += local45;
								arg1 += local29;
							}
						}
						Static385.method5504(arg2 >> 16, arg1 >> 16, arg0, this.aByteArray84);
						arg1 += local29;
						arg2 += local7;
						arg0 += this.anInt7823;
					}
				}
			}
		} else if (arg0 <= arg5) {
			arg4 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= arg3 * local45;
				arg4 -= arg3 * local29;
				arg3 = 0;
			}
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local7;
				arg0 = 0;
			}
			if (local29 >= local45) {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 *= this.anInt7823;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static385.method5504(arg2 >> 16, arg1 >> 16, arg3, this.aByteArray84);
							arg2 += local45;
							arg3 += this.anInt7823;
							arg1 += local7;
						}
					}
					Static385.method5504(arg2 >> 16, arg4 >> 16, arg3, this.aByteArray84);
					arg3 += this.anInt7823;
					arg2 += local45;
					arg4 += local29;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg3;
				arg3 = this.anInt7823 * arg3;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static385.method5504(arg1 >> 16, arg2 >> 16, arg3, this.aByteArray84);
							arg1 += local7;
							arg2 += local45;
							arg3 += this.anInt7823;
						}
					}
					Static385.method5504(arg4 >> 16, arg2 >> 16, arg3, this.aByteArray84);
					arg2 += local45;
					arg4 += local29;
					arg3 += this.anInt7823;
				}
			}
		} else {
			arg1 = arg2 <<= 0x10;
			if (arg3 < 0) {
				arg2 -= local45 * arg3;
				arg1 -= local29 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg5 < 0) {
				arg4 -= arg5 * local7;
				arg5 = 0;
			}
			if (local45 > local29) {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt7823;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static385.method5504(arg1 >> 16, arg4 >> 16, arg3, this.aByteArray84);
							arg3 += this.anInt7823;
							arg4 += local7;
							arg1 += local29;
						}
					}
					Static385.method5504(arg1 >> 16, arg2 >> 16, arg3, this.aByteArray84);
					arg1 += local29;
					arg3 += this.anInt7823;
					arg2 += local45;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg3;
				arg3 *= this.anInt7823;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static385.method5504(arg4 >> 16, arg1 >> 16, arg3, this.aByteArray84);
							arg1 += local29;
							arg3 += this.anInt7823;
							arg4 += local7;
						}
					}
					Static385.method5504(arg2 >> 16, arg1 >> 16, arg3, this.aByteArray84);
					arg1 += local29;
					arg2 += local45;
					arg3 += this.anInt7823;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public void method6864() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray84.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
			local7++;
			this.aByteArray84[local7] = 0;
		}
		while (this.aByteArray84.length - 1 > local7) {
			local7++;
			this.aByteArray84[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIII)V")
	public void method6865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7827 = arg0;
		this.anInt7822 = arg2 - arg3;
		this.anInt7823 = arg1 - arg0;
		this.anInt7829 = arg3;
	}
}
