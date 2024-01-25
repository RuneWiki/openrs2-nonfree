import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class5_Sub1_Sub15_Sub2 extends Class5_Sub1_Sub15 {

	@OriginalMember(owner = "client!uha", name = "C", descriptor = "I")
	public int anInt9739;

	@OriginalMember(owner = "client!uha", name = "B", descriptor = "I")
	public int anInt9743;

	@OriginalMember(owner = "client!uha", name = "F", descriptor = "I")
	public int anInt9746;

	@OriginalMember(owner = "client!uha", name = "I", descriptor = "I")
	public int anInt9747;

	@OriginalMember(owner = "client!uha", name = "x", descriptor = "[B")
	public final byte[] aByteArray100;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Lclient!gca;II)V")
	public Class5_Sub1_Sub15_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray100 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)V")
	public void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9743 = arg3 - arg2;
		this.anInt9739 = arg2;
		this.anInt9746 = arg0;
		this.anInt9747 = arg1 - arg0;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BII)Z")
	public boolean method8296(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray100.length;
	}

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(B)V")
	public void method8297() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray100.length - 8;
		while (local7 < local13) {
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
			local7++;
			this.aByteArray100[local7] = 0;
		}
		while (local7 < this.aByteArray100.length - 1) {
			local7++;
			this.aByteArray100[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIIII)V")
	public void method8298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg3 != arg2) {
			local7 = (arg1 - arg4 << 16) / (arg2 - arg3);
		}
		@Pc(28) int local28 = 0;
		if (arg2 != arg0) {
			local28 = (arg5 - arg1 << 16) / (arg0 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg0 != arg3) {
			local48 = (arg4 - arg5 << 16) / (arg3 - arg0);
		}
		if (arg2 >= arg3 && arg0 >= arg3) {
			if (arg0 <= arg2) {
				arg1 = arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local7;
					arg1 -= arg3 * local48;
					arg3 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local28;
					arg0 = 0;
				}
				if (arg3 != arg0 && local48 < local7 || arg3 == arg0 && local7 < local28) {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt9747;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static561.method7582(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray100);
								arg4 += local7;
								arg5 += local28;
								arg3 += this.anInt9747;
							}
						}
						Static561.method7582(arg1 >> 16, arg3, arg4 >> 16, this.aByteArray100);
						arg4 += local7;
						arg3 += this.anInt9747;
						arg1 += local48;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg3;
					arg3 *= this.anInt9747;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static561.method7582(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray100);
								arg4 += local7;
								arg5 += local28;
								arg3 += this.anInt9747;
							}
						}
						Static561.method7582(arg4 >> 16, arg3, arg1 >> 16, this.aByteArray100);
						arg3 += this.anInt9747;
						arg1 += local48;
						arg4 += local7;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local48;
					arg4 -= arg3 * local7;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg1 -= local28 * arg2;
					arg2 = 0;
				}
				if ((arg3 == arg2 || local7 <= local48) && (arg2 != arg3 || local28 >= local48)) {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt9747;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static561.method7582(arg1 >> 16, arg3, arg5 >> 16, this.aByteArray100);
								arg1 += local28;
								arg3 += this.anInt9747;
								arg5 += local48;
							}
						}
						Static561.method7582(arg4 >> 16, arg3, arg5 >> 16, this.aByteArray100);
						arg4 += local7;
						arg5 += local48;
						arg3 += this.anInt9747;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt9747;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static561.method7582(arg5 >> 16, arg3, arg1 >> 16, this.aByteArray100);
								arg5 += local48;
								arg3 += this.anInt9747;
								arg1 += local28;
							}
						}
						Static561.method7582(arg5 >> 16, arg3, arg4 >> 16, this.aByteArray100);
						arg3 += this.anInt9747;
						arg5 += local48;
						arg4 += local7;
					}
				}
			}
		} else if (arg0 >= arg2) {
			if (arg3 > arg0) {
				arg4 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= arg2 * local28;
					arg4 -= local7 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= arg0 * local48;
					arg0 = 0;
				}
				if (arg2 != arg0 && local7 < local28 || arg0 == arg2 && local7 > local48) {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt9747;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static561.method7582(arg4 >> 16, arg2, arg5 >> 16, this.aByteArray100);
								arg5 += local48;
								arg2 += this.anInt9747;
								arg4 += local7;
							}
						}
						Static561.method7582(arg4 >> 16, arg2, arg1 >> 16, this.aByteArray100);
						arg2 += this.anInt9747;
						arg1 += local28;
						arg4 += local7;
					}
				} else {
					arg3 -= arg0;
					arg0 -= arg2;
					arg2 *= this.anInt9747;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static561.method7582(arg5 >> 16, arg2, arg4 >> 16, this.aByteArray100);
								arg2 += this.anInt9747;
								arg4 += local7;
								arg5 += local48;
							}
						}
						Static561.method7582(arg1 >> 16, arg2, arg4 >> 16, this.aByteArray100);
						arg4 += local7;
						arg1 += local28;
						arg2 += this.anInt9747;
					}
				}
			} else {
				arg5 = arg1 <<= 0x10;
				if (arg2 < 0) {
					arg1 -= local28 * arg2;
					arg5 -= local7 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local48;
					arg3 = 0;
				}
				if (local28 <= local7) {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt9747 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static561.method7582(arg1 >> 16, arg2, arg4 >> 16, this.aByteArray100);
								arg4 += local48;
								arg2 += this.anInt9747;
								arg1 += local28;
							}
						}
						Static561.method7582(arg1 >> 16, arg2, arg5 >> 16, this.aByteArray100);
						arg2 += this.anInt9747;
						arg5 += local7;
						arg1 += local28;
					}
				} else {
					arg0 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt9747;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static561.method7582(arg4 >> 16, arg2, arg1 >> 16, this.aByteArray100);
								arg4 += local48;
								arg1 += local28;
								arg2 += this.anInt9747;
							}
						}
						Static561.method7582(arg5 >> 16, arg2, arg1 >> 16, this.aByteArray100);
						arg5 += local7;
						arg1 += local28;
						arg2 += this.anInt9747;
					}
				}
			}
		} else if (arg3 < arg2) {
			arg1 = arg5 <<= 0x10;
			if (arg0 < 0) {
				arg1 -= arg0 * local28;
				arg5 -= arg0 * local48;
				arg0 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local7;
				arg3 = 0;
			}
			if (local48 > local28) {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 *= this.anInt9747;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static561.method7582(arg1 >> 16, arg0, arg4 >> 16, this.aByteArray100);
							arg0 += this.anInt9747;
							arg4 += local7;
							arg1 += local28;
						}
					}
					Static561.method7582(arg1 >> 16, arg0, arg5 >> 16, this.aByteArray100);
					arg0 += this.anInt9747;
					arg1 += local28;
					arg5 += local48;
				}
			} else {
				arg2 -= arg3;
				arg3 -= arg0;
				arg0 = this.anInt9747 * arg0;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static561.method7582(arg4 >> 16, arg0, arg1 >> 16, this.aByteArray100);
							arg1 += local28;
							arg0 += this.anInt9747;
							arg4 += local7;
						}
					}
					Static561.method7582(arg5 >> 16, arg0, arg1 >> 16, this.aByteArray100);
					arg0 += this.anInt9747;
					arg1 += local28;
					arg5 += local48;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			arg1 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local48 * arg0;
				arg4 -= arg0 * local28;
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg1 -= arg2 * local7;
				arg2 = 0;
			}
			if (local48 > local28) {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 = this.anInt9747 * arg0;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static561.method7582(arg1 >> 16, arg0, arg5 >> 16, this.aByteArray100);
							arg1 += local7;
							arg5 += local48;
							arg0 += this.anInt9747;
						}
					}
					Static561.method7582(arg4 >> 16, arg0, arg5 >> 16, this.aByteArray100);
					arg5 += local48;
					arg4 += local28;
					arg0 += this.anInt9747;
				}
			} else {
				arg3 -= arg2;
				arg2 -= arg0;
				arg0 *= this.anInt9747;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static561.method7582(arg5 >> 16, arg0, arg1 >> 16, this.aByteArray100);
							arg0 += this.anInt9747;
							arg1 += local7;
							arg5 += local48;
						}
					}
					Static561.method7582(arg5 >> 16, arg0, arg4 >> 16, this.aByteArray100);
					arg0 += this.anInt9747;
					arg5 += local48;
					arg4 += local28;
				}
			}
		}
	}
}
