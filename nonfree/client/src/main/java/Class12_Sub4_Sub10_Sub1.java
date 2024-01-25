import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class12_Sub4_Sub10_Sub1 extends Class12_Sub4_Sub10 {

	@OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
	public int anInt4517;

	@OriginalMember(owner = "client!iba", name = "K", descriptor = "I")
	public int anInt4519;

	@OriginalMember(owner = "client!iba", name = "P", descriptor = "I")
	public int anInt4523;

	@OriginalMember(owner = "client!iba", name = "R", descriptor = "I")
	public int anInt4525;

	@OriginalMember(owner = "client!iba", name = "J", descriptor = "[B")
	public final byte[] aByteArray52;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!wr;II)V")
	public Class12_Sub4_Sub10_Sub1(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray52 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(Z)V")
	public void method3807() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray52.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
			local7++;
			this.aByteArray52[local7] = 0;
		}
		while (this.aByteArray52.length - 1 > local7) {
			local7++;
			this.aByteArray52[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIIII)V")
	public void method3808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg0 != arg2) {
			local7 = (arg3 - arg1 << 16) / (arg0 - arg2);
		}
		@Pc(35) int local35 = 0;
		if (arg5 != arg0) {
			local35 = (arg4 - arg3 << 16) / (arg5 - arg0);
		}
		@Pc(56) int local56 = 0;
		if (arg5 != arg2) {
			local56 = (arg1 - arg4 << 16) / (arg2 - arg5);
		}
		if (arg2 <= arg0 && arg5 >= arg2) {
			if (arg5 <= arg0) {
				arg3 = arg1 <<= 0x10;
				arg4 <<= 0x10;
				if (arg2 < 0) {
					arg3 -= arg2 * local56;
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg5 < 0) {
					arg4 -= arg5 * local35;
					arg5 = 0;
				}
				if (arg2 != arg5 && local56 < local7 || arg5 == arg2 && local35 > local7) {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt4517;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static339.method5406(arg2, this.aByteArray52, arg4 >> 16, arg1 >> 16);
								arg2 += this.anInt4517;
								arg4 += local35;
								arg1 += local7;
							}
						}
						Static339.method5406(arg2, this.aByteArray52, arg3 >> 16, arg1 >> 16);
						arg3 += local56;
						arg1 += local7;
						arg2 += this.anInt4517;
					}
				} else {
					arg0 -= arg5;
					arg5 -= arg2;
					arg2 *= this.anInt4517;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static339.method5406(arg2, this.aByteArray52, arg1 >> 16, arg4 >> 16);
								arg4 += local35;
								arg1 += local7;
								arg2 += this.anInt4517;
							}
						}
						Static339.method5406(arg2, this.aByteArray52, arg1 >> 16, arg3 >> 16);
						arg1 += local7;
						arg2 += this.anInt4517;
						arg3 += local56;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= local56 * arg2;
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (arg0 < 0) {
					arg3 -= local35 * arg0;
					arg0 = 0;
				}
				if ((arg0 == arg2 || local7 <= local56) && (arg0 != arg2 || local35 >= local56)) {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt4517;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static339.method5406(arg2, this.aByteArray52, arg3 >> 16, arg4 >> 16);
								arg4 += local56;
								arg3 += local35;
								arg2 += this.anInt4517;
							}
						}
						Static339.method5406(arg2, this.aByteArray52, arg1 >> 16, arg4 >> 16);
						arg4 += local56;
						arg2 += this.anInt4517;
						arg1 += local7;
					}
				} else {
					arg5 -= arg0;
					arg0 -= arg2;
					arg2 = this.anInt4517 * arg2;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static339.method5406(arg2, this.aByteArray52, arg4 >> 16, arg3 >> 16);
								arg4 += local56;
								arg2 += this.anInt4517;
								arg3 += local35;
							}
						}
						Static339.method5406(arg2, this.aByteArray52, arg4 >> 16, arg1 >> 16);
						arg1 += local7;
						arg2 += this.anInt4517;
						arg4 += local56;
					}
				}
			}
		} else if (arg5 < arg0) {
			if (arg2 < arg0) {
				arg3 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg3 -= local35 * arg5;
					arg4 -= local56 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg1 -= arg2 * local7;
					arg2 = 0;
				}
				if (local56 <= local35) {
					arg0 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt4517;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static339.method5406(arg5, this.aByteArray52, arg1 >> 16, arg3 >> 16);
								arg3 += local35;
								arg5 += this.anInt4517;
								arg1 += local7;
							}
						}
						Static339.method5406(arg5, this.aByteArray52, arg4 >> 16, arg3 >> 16);
						arg5 += this.anInt4517;
						arg3 += local35;
						arg4 += local56;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt4517 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static339.method5406(arg5, this.aByteArray52, arg3 >> 16, arg1 >> 16);
								arg3 += local35;
								arg1 += local7;
								arg5 += this.anInt4517;
							}
						}
						Static339.method5406(arg5, this.aByteArray52, arg3 >> 16, arg4 >> 16);
						arg4 += local56;
						arg5 += this.anInt4517;
						arg3 += local35;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local56 * arg5;
					arg1 -= local35 * arg5;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg3 -= local7 * arg0;
					arg0 = 0;
				}
				if (local35 < local56) {
					arg2 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt4517;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static339.method5406(arg5, this.aByteArray52, arg3 >> 16, arg4 >> 16);
								arg4 += local56;
								arg3 += local7;
								arg5 += this.anInt4517;
							}
						}
						Static339.method5406(arg5, this.aByteArray52, arg1 >> 16, arg4 >> 16);
						arg1 += local35;
						arg4 += local56;
						arg5 += this.anInt4517;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt4517;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static339.method5406(arg5, this.aByteArray52, arg4 >> 16, arg3 >> 16);
								arg5 += this.anInt4517;
								arg3 += local7;
								arg4 += local56;
							}
						}
						Static339.method5406(arg5, this.aByteArray52, arg4 >> 16, arg1 >> 16);
						arg4 += local56;
						arg1 += local35;
						arg5 += this.anInt4517;
					}
				}
			}
		} else if (arg5 < arg2) {
			arg1 = arg3 <<= 0x10;
			arg4 <<= 0x10;
			if (arg0 < 0) {
				arg3 -= arg0 * local35;
				arg1 -= arg0 * local7;
				arg0 = 0;
			}
			if (arg5 < 0) {
				arg4 -= arg5 * local56;
				arg5 = 0;
			}
			if ((arg0 == arg5 || local7 >= local35) && (arg0 != arg5 || local56 >= local7)) {
				arg2 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt4517 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static339.method5406(arg0, this.aByteArray52, arg4 >> 16, arg1 >> 16);
							arg0 += this.anInt4517;
							arg4 += local56;
							arg1 += local7;
						}
					}
					Static339.method5406(arg0, this.aByteArray52, arg3 >> 16, arg1 >> 16);
					arg0 += this.anInt4517;
					arg1 += local7;
					arg3 += local35;
				}
			} else {
				arg2 -= arg5;
				arg5 -= arg0;
				arg0 = this.anInt4517 * arg0;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static339.method5406(arg0, this.aByteArray52, arg1 >> 16, arg4 >> 16);
							arg1 += local7;
							arg0 += this.anInt4517;
							arg4 += local56;
						}
					}
					Static339.method5406(arg0, this.aByteArray52, arg1 >> 16, arg3 >> 16);
					arg1 += local7;
					arg3 += local35;
					arg0 += this.anInt4517;
				}
			}
		} else {
			arg4 = arg3 <<= 0x10;
			if (arg0 < 0) {
				arg4 -= local7 * arg0;
				arg3 -= arg0 * local35;
				arg0 = 0;
			}
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg1 -= arg2 * local56;
				arg2 = 0;
			}
			if (local7 < local35) {
				arg5 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt4517;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static339.method5406(arg0, this.aByteArray52, arg1 >> 16, arg3 >> 16);
							arg3 += local35;
							arg0 += this.anInt4517;
							arg1 += local56;
						}
					}
					Static339.method5406(arg0, this.aByteArray52, arg4 >> 16, arg3 >> 16);
					arg0 += this.anInt4517;
					arg3 += local35;
					arg4 += local7;
				}
			} else {
				arg5 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt4517;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static339.method5406(arg0, this.aByteArray52, arg3 >> 16, arg1 >> 16);
							arg3 += local35;
							arg1 += local56;
							arg0 += this.anInt4517;
						}
					}
					Static339.method5406(arg0, this.aByteArray52, arg3 >> 16, arg4 >> 16);
					arg3 += local35;
					arg4 += local7;
					arg0 += this.anInt4517;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIII)V")
	public void method3809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4525 = arg1 - arg2;
		this.anInt4519 = arg2;
		this.anInt4523 = arg0;
		this.anInt4517 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(III)Z")
	public boolean method3813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray52.length >= arg0 * arg1;
	}
}
