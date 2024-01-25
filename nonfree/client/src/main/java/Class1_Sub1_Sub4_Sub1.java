import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	public int anInt1644;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
	public int anInt1646;

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
	public int anInt1647;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
	public int anInt1648;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!cb;II)V")
	public Class1_Sub1_Sub4_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray21 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	public void method1635() {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = this.aByteArray21.length - 8;
		while (local13 > local7) {
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
			local7++;
			this.aByteArray21[local7] = 0;
		}
		while (this.aByteArray21.length - 1 > local7) {
			local7++;
			this.aByteArray21[local7] = 0;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
	public boolean method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray21.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
	public void method1641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg1 != arg5) {
			local7 = (arg4 - arg3 << 16) / (arg5 - arg1);
		}
		@Pc(28) int local28 = 0;
		if (arg2 != arg5) {
			local28 = (arg0 - arg4 << 16) / (arg2 - arg5);
		}
		@Pc(49) int local49 = 0;
		if (arg2 != arg1) {
			local49 = (arg3 - arg0 << 16) / (arg1 - arg2);
		}
		if (arg1 <= arg5 && arg2 >= arg1) {
			if (arg5 >= arg2) {
				arg4 = arg3 <<= 0x10;
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local49 * arg1;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local28;
					arg2 = 0;
				}
				if (arg1 != arg2 && local49 < local7 || arg2 == arg1 && local28 > local7) {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt1647 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static207.method7956(arg1, arg3 >> 16, arg0 >> 16, this.aByteArray21);
								arg0 += local28;
								arg1 += this.anInt1647;
								arg3 += local7;
							}
						}
						Static207.method7956(arg1, arg3 >> 16, arg4 >> 16, this.aByteArray21);
						arg1 += this.anInt1647;
						arg4 += local49;
						arg3 += local7;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt1647;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static207.method7956(arg1, arg0 >> 16, arg3 >> 16, this.aByteArray21);
								arg1 += this.anInt1647;
								arg0 += local28;
								arg3 += local7;
							}
						}
						Static207.method7956(arg1, arg4 >> 16, arg3 >> 16, this.aByteArray21);
						arg3 += local7;
						arg4 += local49;
						arg1 += this.anInt1647;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local49 * arg1;
					arg3 -= arg1 * local7;
					arg1 = 0;
				}
				if (arg5 < 0) {
					arg4 -= arg5 * local28;
					arg5 = 0;
				}
				if ((arg1 == arg5 || local49 >= local7) && (arg5 != arg1 || local28 >= local49)) {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt1647 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static207.method7956(arg1, arg0 >> 16, arg4 >> 16, this.aByteArray21);
								arg1 += this.anInt1647;
								arg4 += local28;
								arg0 += local49;
							}
						}
						Static207.method7956(arg1, arg0 >> 16, arg3 >> 16, this.aByteArray21);
						arg3 += local7;
						arg0 += local49;
						arg1 += this.anInt1647;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg1;
					arg1 = this.anInt1647 * arg1;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static207.method7956(arg1, arg4 >> 16, arg0 >> 16, this.aByteArray21);
								arg1 += this.anInt1647;
								arg0 += local49;
								arg4 += local28;
							}
						}
						Static207.method7956(arg1, arg3 >> 16, arg0 >> 16, this.aByteArray21);
						arg0 += local49;
						arg1 += this.anInt1647;
						arg3 += local7;
					}
				}
			}
		} else if (arg5 <= arg2) {
			if (arg2 < arg1) {
				arg3 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local28 * arg5;
					arg3 -= local7 * arg5;
					arg5 = 0;
				}
				if (arg2 < 0) {
					arg0 -= arg2 * local49;
					arg2 = 0;
				}
				if (arg2 != arg5 && local28 > local7 || arg5 == arg2 && local7 > local49) {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt1647;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static207.method7956(arg5, arg0 >> 16, arg3 >> 16, this.aByteArray21);
								arg0 += local49;
								arg5 += this.anInt1647;
								arg3 += local7;
							}
						}
						Static207.method7956(arg5, arg4 >> 16, arg3 >> 16, this.aByteArray21);
						arg4 += local28;
						arg5 += this.anInt1647;
						arg3 += local7;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt1647 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static207.method7956(arg5, arg3 >> 16, arg0 >> 16, this.aByteArray21);
								arg5 += this.anInt1647;
								arg0 += local49;
								arg3 += local7;
							}
						}
						Static207.method7956(arg5, arg3 >> 16, arg4 >> 16, this.aByteArray21);
						arg4 += local28;
						arg3 += local7;
						arg5 += this.anInt1647;
					}
				}
			} else {
				arg0 = arg4 <<= 0x10;
				if (arg5 < 0) {
					arg4 -= local28 * arg5;
					arg0 -= arg5 * local7;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local49 * arg1;
					arg1 = 0;
				}
				if (local28 <= local7) {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt1647;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static207.method7956(arg5, arg3 >> 16, arg4 >> 16, this.aByteArray21);
								arg3 += local49;
								arg5 += this.anInt1647;
								arg4 += local28;
							}
						}
						Static207.method7956(arg5, arg0 >> 16, arg4 >> 16, this.aByteArray21);
						arg0 += local7;
						arg4 += local28;
						arg5 += this.anInt1647;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg5;
					arg5 = this.anInt1647 * arg5;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static207.method7956(arg5, arg4 >> 16, arg3 >> 16, this.aByteArray21);
								arg5 += this.anInt1647;
								arg3 += local49;
								arg4 += local28;
							}
						}
						Static207.method7956(arg5, arg4 >> 16, arg0 >> 16, this.aByteArray21);
						arg0 += local7;
						arg4 += local28;
						arg5 += this.anInt1647;
					}
				}
			}
		} else if (arg1 >= arg5) {
			arg3 = arg0 <<= 0x10;
			arg4 <<= 0x10;
			if (arg2 < 0) {
				arg3 -= local28 * arg2;
				arg0 -= local49 * arg2;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg4 -= local7 * arg5;
				arg5 = 0;
			}
			if (local49 <= local28) {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt1647;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static207.method7956(arg2, arg4 >> 16, arg0 >> 16, this.aByteArray21);
							arg2 += this.anInt1647;
							arg0 += local49;
							arg4 += local7;
						}
					}
					Static207.method7956(arg2, arg3 >> 16, arg0 >> 16, this.aByteArray21);
					arg0 += local49;
					arg2 += this.anInt1647;
					arg3 += local28;
				}
			} else {
				arg1 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt1647;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static207.method7956(arg2, arg0 >> 16, arg4 >> 16, this.aByteArray21);
							arg4 += local7;
							arg0 += local49;
							arg2 += this.anInt1647;
						}
					}
					Static207.method7956(arg2, arg0 >> 16, arg3 >> 16, this.aByteArray21);
					arg3 += local28;
					arg2 += this.anInt1647;
					arg0 += local49;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local49 * arg2;
				arg4 -= arg2 * local28;
				arg2 = 0;
			}
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg3 -= arg1 * local7;
				arg1 = 0;
			}
			if (local28 < local49) {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt1647 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static207.method7956(arg2, arg3 >> 16, arg4 >> 16, this.aByteArray21);
							arg3 += local7;
							arg2 += this.anInt1647;
							arg4 += local28;
						}
					}
					Static207.method7956(arg2, arg0 >> 16, arg4 >> 16, this.aByteArray21);
					arg4 += local28;
					arg2 += this.anInt1647;
					arg0 += local49;
				}
			} else {
				arg5 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt1647 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static207.method7956(arg2, arg4 >> 16, arg3 >> 16, this.aByteArray21);
							arg4 += local28;
							arg2 += this.anInt1647;
							arg3 += local7;
						}
					}
					Static207.method7956(arg2, arg4 >> 16, arg0 >> 16, this.aByteArray21);
					arg0 += local49;
					arg4 += local28;
					arg2 += this.anInt1647;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
	public void method1642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1646 = arg1;
		this.anInt1644 = arg0;
		this.anInt1647 = arg3 - arg0;
		this.anInt1648 = arg2 - arg1;
	}
}
