import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class14_Sub3_Sub14_Sub2 extends Class14_Sub3_Sub14 {

	@OriginalMember(owner = "client!vba", name = "G", descriptor = "I")
	public int anInt10448;

	@OriginalMember(owner = "client!vba", name = "I", descriptor = "I")
	public int anInt10449;

	@OriginalMember(owner = "client!vba", name = "N", descriptor = "I")
	public int anInt10453;

	@OriginalMember(owner = "client!vba", name = "P", descriptor = "I")
	public int anInt10455;

	@OriginalMember(owner = "client!vba", name = "H", descriptor = "[B")
	public final byte[] aByteArray131;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!qfa;II)V")
	public Class14_Sub3_Sub14_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray131 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "(B)V")
	public void method8716() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray131.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
			local7++;
			this.aByteArray131[local7] = 0;
		}
		while (this.aByteArray131.length - 1 > local7) {
			local7++;
			this.aByteArray131[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIII)V")
	public void method8717(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg4) {
			local7 = (arg5 - arg0 << 16) / (arg4 - arg1);
		}
		@Pc(27) int local27 = 0;
		if (arg3 != arg4) {
			local27 = (arg2 - arg5 << 16) / (arg3 - arg4);
		}
		@Pc(47) int local47 = 0;
		if (arg3 != arg1) {
			local47 = (arg0 - arg2 << 16) / (arg1 - arg3);
		}
		if (arg4 >= arg1 && arg1 <= arg3) {
			if (arg3 > arg4) {
				arg2 = arg0 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= arg1 * local7;
					arg2 -= arg1 * local47;
					arg1 = 0;
				}
				if (arg4 < 0) {
					arg5 -= arg4 * local27;
					arg4 = 0;
				}
				if (arg4 != arg1 && local47 < local7 || arg1 == arg4 && local47 > local27) {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt10455;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static30.method692(arg2 >> 16, arg1, this.aByteArray131, arg5 >> 16);
								arg5 += local27;
								arg1 += this.anInt10455;
								arg2 += local47;
							}
						}
						Static30.method692(arg2 >> 16, arg1, this.aByteArray131, arg0 >> 16);
						arg0 += local7;
						arg2 += local47;
						arg1 += this.anInt10455;
					}
				} else {
					arg3 -= arg4;
					arg4 -= arg1;
					arg1 *= this.anInt10455;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static30.method692(arg5 >> 16, arg1, this.aByteArray131, arg2 >> 16);
								arg2 += local47;
								arg5 += local27;
								arg1 += this.anInt10455;
							}
						}
						Static30.method692(arg0 >> 16, arg1, this.aByteArray131, arg2 >> 16);
						arg0 += local7;
						arg2 += local47;
						arg1 += this.anInt10455;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				arg2 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local7 * arg1;
					arg5 -= local47 * arg1;
					arg1 = 0;
				}
				if (arg3 < 0) {
					arg2 -= local27 * arg3;
					arg3 = 0;
				}
				if ((arg3 == arg1 || local47 >= local7) && (arg1 != arg3 || local27 <= local7)) {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 = this.anInt10455 * arg1;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static30.method692(arg0 >> 16, arg1, this.aByteArray131, arg2 >> 16);
								arg2 += local27;
								arg0 += local7;
								arg1 += this.anInt10455;
							}
						}
						Static30.method692(arg0 >> 16, arg1, this.aByteArray131, arg5 >> 16);
						arg5 += local47;
						arg1 += this.anInt10455;
						arg0 += local7;
					}
				} else {
					arg4 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt10455;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static30.method692(arg2 >> 16, arg1, this.aByteArray131, arg0 >> 16);
								arg0 += local7;
								arg2 += local27;
								arg1 += this.anInt10455;
							}
						}
						Static30.method692(arg5 >> 16, arg1, this.aByteArray131, arg0 >> 16);
						arg1 += this.anInt10455;
						arg0 += local7;
						arg5 += local47;
					}
				}
			}
		} else if (arg4 > arg3) {
			if (arg1 >= arg4) {
				arg0 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg0 -= arg3 * local27;
					arg2 -= local47 * arg3;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg4 < 0) {
					arg5 -= local7 * arg4;
					arg4 = 0;
				}
				if (local47 <= local27) {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt10455;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static30.method692(arg2 >> 16, arg3, this.aByteArray131, arg5 >> 16);
								arg5 += local7;
								arg2 += local47;
								arg3 += this.anInt10455;
							}
						}
						Static30.method692(arg2 >> 16, arg3, this.aByteArray131, arg0 >> 16);
						arg0 += local27;
						arg2 += local47;
						arg3 += this.anInt10455;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg3;
					arg3 *= this.anInt10455;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static30.method692(arg5 >> 16, arg3, this.aByteArray131, arg2 >> 16);
								arg3 += this.anInt10455;
								arg5 += local7;
								arg2 += local47;
							}
						}
						Static30.method692(arg0 >> 16, arg3, this.aByteArray131, arg2 >> 16);
						arg0 += local27;
						arg2 += local47;
						arg3 += this.anInt10455;
					}
				}
			} else {
				arg5 = arg2 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= local47 * arg3;
					arg5 -= local27 * arg3;
					arg3 = 0;
				}
				if (arg1 < 0) {
					arg0 -= arg1 * local7;
					arg1 = 0;
				}
				if (local27 >= local47) {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt10455 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static30.method692(arg0 >> 16, arg3, this.aByteArray131, arg5 >> 16);
								arg3 += this.anInt10455;
								arg0 += local7;
								arg5 += local27;
							}
						}
						Static30.method692(arg2 >> 16, arg3, this.aByteArray131, arg5 >> 16);
						arg3 += this.anInt10455;
						arg2 += local47;
						arg5 += local27;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt10455 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static30.method692(arg5 >> 16, arg3, this.aByteArray131, arg0 >> 16);
								arg3 += this.anInt10455;
								arg0 += local7;
								arg5 += local27;
							}
						}
						Static30.method692(arg5 >> 16, arg3, this.aByteArray131, arg2 >> 16);
						arg5 += local27;
						arg2 += local47;
						arg3 += this.anInt10455;
					}
				}
			}
		} else if (arg3 < arg1) {
			arg0 = arg5 <<= 0x10;
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg5 -= local27 * arg4;
				arg0 -= local7 * arg4;
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg2 -= local47 * arg3;
				arg3 = 0;
			}
			if ((arg4 == arg3 || local7 >= local27) && (arg4 != arg3 || local7 <= local47)) {
				arg1 -= arg3;
				arg3 -= arg4;
				arg4 *= this.anInt10455;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static30.method692(arg2 >> 16, arg4, this.aByteArray131, arg0 >> 16);
							arg4 += this.anInt10455;
							arg2 += local47;
							arg0 += local7;
						}
					}
					Static30.method692(arg5 >> 16, arg4, this.aByteArray131, arg0 >> 16);
					arg4 += this.anInt10455;
					arg0 += local7;
					arg5 += local27;
				}
			} else {
				arg1 -= arg3;
				arg3 -= arg4;
				arg4 = this.anInt10455 * arg4;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static30.method692(arg0 >> 16, arg4, this.aByteArray131, arg2 >> 16);
							arg4 += this.anInt10455;
							arg2 += local47;
							arg0 += local7;
						}
					}
					Static30.method692(arg0 >> 16, arg4, this.aByteArray131, arg5 >> 16);
					arg5 += local27;
					arg4 += this.anInt10455;
					arg0 += local7;
				}
			}
		} else {
			arg2 = arg5 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= arg4 * local7;
				arg5 -= arg4 * local27;
				arg4 = 0;
			}
			arg0 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= local47 * arg1;
				arg1 = 0;
			}
			if (local27 > local7) {
				arg3 -= arg1;
				arg1 -= arg4;
				arg4 = this.anInt10455 * arg4;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static30.method692(arg0 >> 16, arg4, this.aByteArray131, arg5 >> 16);
							arg4 += this.anInt10455;
							arg5 += local27;
							arg0 += local47;
						}
					}
					Static30.method692(arg2 >> 16, arg4, this.aByteArray131, arg5 >> 16);
					arg2 += local7;
					arg5 += local27;
					arg4 += this.anInt10455;
				}
			} else {
				arg3 -= arg1;
				arg1 -= arg4;
				arg4 *= this.anInt10455;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static30.method692(arg5 >> 16, arg4, this.aByteArray131, arg0 >> 16);
							arg0 += local47;
							arg4 += this.anInt10455;
							arg5 += local27;
						}
					}
					Static30.method692(arg5 >> 16, arg4, this.aByteArray131, arg2 >> 16);
					arg2 += local7;
					arg4 += this.anInt10455;
					arg5 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
	public void method8718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt10453 = arg0 - arg2;
		this.anInt10449 = arg1;
		this.anInt10455 = arg3 - arg1;
		this.anInt10448 = arg2;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z")
	public boolean method8719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray131.length >= arg1 * arg0;
	}
}
