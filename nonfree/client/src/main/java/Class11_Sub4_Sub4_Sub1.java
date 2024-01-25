import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class11_Sub4_Sub4_Sub1 extends Class11_Sub4_Sub4 {

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "[B")
	public final byte[] aByteArray17;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!tb;II)V")
	public Class11_Sub4_Sub4_Sub1(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray17 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public void method498() {
		@Pc(1) int local1 = -1;
		@Pc(7) int local7 = this.aByteArray17.length - 8;
		while (local7 > local1) {
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
			local1++;
			this.aByteArray17[local1] = 0;
		}
		while (this.aByteArray17.length - 1 > local1) {
			local1++;
			this.aByteArray17[local1] = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)Z")
	public boolean method499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 * arg0 <= this.aByteArray17.length;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
	public void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt627 = arg0;
		this.anInt629 = arg1 - arg2;
		this.anInt626 = arg2;
		this.anInt628 = arg3 - arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIB)V")
	public void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg3 != arg1) {
			local1 = (arg5 - arg4 << 16) / (arg3 - arg1);
		}
		@Pc(18) int local18 = 0;
		if (arg2 != arg3) {
			local18 = (arg0 - arg5 << 16) / (arg2 - arg3);
		}
		@Pc(42) int local42 = 0;
		if (arg2 != arg1) {
			local42 = (arg4 - arg0 << 16) / (arg1 - arg2);
		}
		if (arg3 >= arg1 && arg2 >= arg1) {
			if (arg2 > arg3) {
				arg0 = arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg0 -= local42 * arg1;
					arg1 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local18;
					arg3 = 0;
				}
				if (arg1 != arg3 && local42 < local1 || arg1 == arg3 && local18 < local42) {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt628;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static359.method497(arg5 >> 16, arg0 >> 16, this.aByteArray17, arg1);
								arg5 += local18;
								arg1 += this.anInt628;
								arg0 += local42;
							}
						}
						Static359.method497(arg4 >> 16, arg0 >> 16, this.aByteArray17, arg1);
						arg4 += local1;
						arg0 += local42;
						arg1 += this.anInt628;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg1;
					arg1 *= this.anInt628;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static359.method497(arg0 >> 16, arg5 >> 16, this.aByteArray17, arg1);
								arg1 += this.anInt628;
								arg0 += local42;
								arg5 += local18;
							}
						}
						Static359.method497(arg0 >> 16, arg4 >> 16, this.aByteArray17, arg1);
						arg0 += local42;
						arg4 += local1;
						arg1 += this.anInt628;
					}
				}
			} else {
				arg5 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local1 * arg1;
					arg5 -= local42 * arg1;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local18;
					arg2 = 0;
				}
				if ((arg2 == arg1 || local42 >= local1) && (arg1 != arg2 || local1 >= local18)) {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt628 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static359.method497(arg0 >> 16, arg4 >> 16, this.aByteArray17, arg1);
								arg4 += local1;
								arg1 += this.anInt628;
								arg0 += local18;
							}
						}
						Static359.method497(arg5 >> 16, arg4 >> 16, this.aByteArray17, arg1);
						arg1 += this.anInt628;
						arg4 += local1;
						arg5 += local42;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt628 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static359.method497(arg4 >> 16, arg0 >> 16, this.aByteArray17, arg1);
								arg4 += local1;
								arg0 += local18;
								arg1 += this.anInt628;
							}
						}
						Static359.method497(arg4 >> 16, arg5 >> 16, this.aByteArray17, arg1);
						arg4 += local1;
						arg5 += local42;
						arg1 += this.anInt628;
					}
				}
			}
		} else if (arg3 > arg2) {
			if (arg1 >= arg3) {
				arg4 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg4 -= arg2 * local18;
					arg0 -= local42 * arg2;
					arg2 = 0;
				}
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= local1 * arg3;
					arg3 = 0;
				}
				if (local18 < local42) {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 = this.anInt628 * arg2;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static359.method497(arg0 >> 16, arg5 >> 16, this.aByteArray17, arg2);
								arg0 += local42;
								arg2 += this.anInt628;
								arg5 += local1;
							}
						}
						Static359.method497(arg0 >> 16, arg4 >> 16, this.aByteArray17, arg2);
						arg4 += local18;
						arg0 += local42;
						arg2 += this.anInt628;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg2;
					arg2 *= this.anInt628;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static359.method497(arg5 >> 16, arg0 >> 16, this.aByteArray17, arg2);
								arg5 += local1;
								arg2 += this.anInt628;
								arg0 += local42;
							}
						}
						Static359.method497(arg4 >> 16, arg0 >> 16, this.aByteArray17, arg2);
						arg4 += local18;
						arg2 += this.anInt628;
						arg0 += local42;
					}
				}
			} else {
				arg5 = arg0 <<= 0x10;
				if (arg2 < 0) {
					arg5 -= local18 * arg2;
					arg0 -= local42 * arg2;
					arg2 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local1;
					arg1 = 0;
				}
				if (local18 >= local42) {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 *= this.anInt628;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static359.method497(arg5 >> 16, arg4 >> 16, this.aByteArray17, arg2);
								arg2 += this.anInt628;
								arg4 += local1;
								arg5 += local18;
							}
						}
						Static359.method497(arg5 >> 16, arg0 >> 16, this.aByteArray17, arg2);
						arg0 += local42;
						arg2 += this.anInt628;
						arg5 += local18;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg2;
					arg2 = this.anInt628 * arg2;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static359.method497(arg4 >> 16, arg5 >> 16, this.aByteArray17, arg2);
								arg2 += this.anInt628;
								arg4 += local1;
								arg5 += local18;
							}
						}
						Static359.method497(arg0 >> 16, arg5 >> 16, this.aByteArray17, arg2);
						arg0 += local42;
						arg5 += local18;
						arg2 += this.anInt628;
					}
				}
			}
		} else if (arg2 >= arg1) {
			arg0 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg5 -= arg3 * local18;
				arg0 -= local1 * arg3;
				arg3 = 0;
			}
			arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local42;
				arg1 = 0;
			}
			if (local18 > local1) {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt628 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static359.method497(arg5 >> 16, arg4 >> 16, this.aByteArray17, arg3);
							arg3 += this.anInt628;
							arg5 += local18;
							arg4 += local42;
						}
					}
					Static359.method497(arg5 >> 16, arg0 >> 16, this.aByteArray17, arg3);
					arg5 += local18;
					arg3 += this.anInt628;
					arg0 += local1;
				}
			} else {
				arg2 -= arg1;
				arg1 -= arg3;
				arg3 = this.anInt628 * arg3;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg2--;
							if (arg2 < 0) {
								return;
							}
							Static359.method497(arg4 >> 16, arg5 >> 16, this.aByteArray17, arg3);
							arg5 += local18;
							arg3 += this.anInt628;
							arg4 += local42;
						}
					}
					Static359.method497(arg0 >> 16, arg5 >> 16, this.aByteArray17, arg3);
					arg5 += local18;
					arg3 += this.anInt628;
					arg0 += local1;
				}
			}
		} else {
			arg4 = arg5 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local1;
				arg5 -= local18 * arg3;
				arg3 = 0;
			}
			arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= arg2 * local42;
				arg2 = 0;
			}
			if (arg2 != arg3 && local1 < local18 || arg3 == arg2 && local1 > local42) {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 = this.anInt628 * arg3;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static359.method497(arg0 >> 16, arg4 >> 16, this.aByteArray17, arg3);
							arg4 += local1;
							arg0 += local42;
							arg3 += this.anInt628;
						}
					}
					Static359.method497(arg5 >> 16, arg4 >> 16, this.aByteArray17, arg3);
					arg4 += local1;
					arg3 += this.anInt628;
					arg5 += local18;
				}
			} else {
				arg1 -= arg2;
				arg2 -= arg3;
				arg3 *= this.anInt628;
				while (true) {
					arg2--;
					if (arg2 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static359.method497(arg4 >> 16, arg0 >> 16, this.aByteArray17, arg3);
							arg4 += local1;
							arg0 += local42;
							arg3 += this.anInt628;
						}
					}
					Static359.method497(arg4 >> 16, arg5 >> 16, this.aByteArray17, arg3);
					arg5 += local18;
					arg4 += local1;
					arg3 += this.anInt628;
				}
			}
		}
	}
}
