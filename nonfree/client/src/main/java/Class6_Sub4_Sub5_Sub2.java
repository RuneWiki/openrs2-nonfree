import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class6_Sub4_Sub5_Sub2 extends Class6_Sub4_Sub5 {

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
	public int anInt9644;

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
	public int anInt9645;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	public int anInt9646;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	public int anInt9648;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[B")
	public final byte[] aByteArray100;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!lba;II)V")
	public Class6_Sub4_Sub5_Sub2(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray100 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	public void method8138() {
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

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
	public boolean method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray100.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
	public void method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg4 != arg1) {
			local7 = (arg0 - arg3 << 16) / (arg1 - arg4);
		}
		@Pc(27) int local27 = 0;
		if (arg1 != arg5) {
			local27 = (arg2 - arg0 << 16) / (arg5 - arg1);
		}
		@Pc(49) int local49 = 0;
		if (arg4 != arg5) {
			local49 = (arg3 - arg2 << 16) / (arg4 - arg5);
		}
		if (arg1 >= arg4 && arg5 >= arg4) {
			if (arg5 > arg1) {
				arg2 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg2 -= arg4 * local49;
					arg3 -= arg4 * local7;
					arg4 = 0;
				}
				arg0 <<= 0x10;
				if (arg1 < 0) {
					arg0 -= local27 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg4 && local49 < local7 || arg4 == arg1 && local49 > local27) {
					arg5 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt9644;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg0 >> 16, arg2 >> 16, arg4);
								arg4 += this.anInt9644;
								arg0 += local27;
								arg2 += local49;
							}
						}
						Static45.method944(this.aByteArray100, arg3 >> 16, arg2 >> 16, arg4);
						arg4 += this.anInt9644;
						arg3 += local7;
						arg2 += local49;
					}
				} else {
					arg5 -= arg1;
					arg1 -= arg4;
					arg4 *= this.anInt9644;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg2 >> 16, arg0 >> 16, arg4);
								arg4 += this.anInt9644;
								arg2 += local49;
								arg0 += local27;
							}
						}
						Static45.method944(this.aByteArray100, arg2 >> 16, arg3 >> 16, arg4);
						arg4 += this.anInt9644;
						arg3 += local7;
						arg2 += local49;
					}
				}
			} else {
				arg0 = arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local7 * arg4;
					arg0 -= arg4 * local49;
					arg4 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local27 * arg5;
					arg5 = 0;
				}
				if ((arg5 == arg4 || local7 <= local49) && (arg4 != arg5 || local27 <= local7)) {
					arg1 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9644 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg2 >> 16, arg3 >> 16, arg4);
								arg4 += this.anInt9644;
								arg3 += local7;
								arg2 += local27;
							}
						}
						Static45.method944(this.aByteArray100, arg0 >> 16, arg3 >> 16, arg4);
						arg3 += local7;
						arg4 += this.anInt9644;
						arg0 += local49;
					}
				} else {
					arg1 -= arg5;
					arg5 -= arg4;
					arg4 = this.anInt9644 * arg4;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg3 >> 16, arg2 >> 16, arg4);
								arg4 += this.anInt9644;
								arg3 += local7;
								arg2 += local27;
							}
						}
						Static45.method944(this.aByteArray100, arg3 >> 16, arg0 >> 16, arg4);
						arg3 += local7;
						arg4 += this.anInt9644;
						arg0 += local49;
					}
				}
			}
		} else if (arg5 < arg1) {
			if (arg1 > arg4) {
				arg0 = arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local49 * arg5;
					arg0 -= arg5 * local27;
					arg5 = 0;
				}
				arg3 <<= 0x10;
				if (arg4 < 0) {
					arg3 -= local7 * arg4;
					arg4 = 0;
				}
				if (local27 >= local49) {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt9644;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg0 >> 16, arg3 >> 16, arg5);
								arg5 += this.anInt9644;
								arg0 += local27;
								arg3 += local7;
							}
						}
						Static45.method944(this.aByteArray100, arg0 >> 16, arg2 >> 16, arg5);
						arg2 += local49;
						arg5 += this.anInt9644;
						arg0 += local27;
					}
				} else {
					arg1 -= arg4;
					arg4 -= arg5;
					arg5 = this.anInt9644 * arg5;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg3 >> 16, arg0 >> 16, arg5);
								arg0 += local27;
								arg3 += local7;
								arg5 += this.anInt9644;
							}
						}
						Static45.method944(this.aByteArray100, arg2 >> 16, arg0 >> 16, arg5);
						arg0 += local27;
						arg2 += local49;
						arg5 += this.anInt9644;
					}
				}
			} else {
				arg3 = arg2 <<= 0x10;
				arg0 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local49;
					arg3 -= arg5 * local27;
					arg5 = 0;
				}
				if (arg1 < 0) {
					arg0 -= arg1 * local7;
					arg1 = 0;
				}
				if (local27 >= local49) {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt9644;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg0 >> 16, arg2 >> 16, arg5);
								arg0 += local7;
								arg2 += local49;
								arg5 += this.anInt9644;
							}
						}
						Static45.method944(this.aByteArray100, arg3 >> 16, arg2 >> 16, arg5);
						arg5 += this.anInt9644;
						arg3 += local27;
						arg2 += local49;
					}
				} else {
					arg4 -= arg1;
					arg1 -= arg5;
					arg5 *= this.anInt9644;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static45.method944(this.aByteArray100, arg2 >> 16, arg0 >> 16, arg5);
								arg2 += local49;
								arg0 += local7;
								arg5 += this.anInt9644;
							}
						}
						Static45.method944(this.aByteArray100, arg2 >> 16, arg3 >> 16, arg5);
						arg5 += this.anInt9644;
						arg2 += local49;
						arg3 += local27;
					}
				}
			}
		} else if (arg5 < arg4) {
			arg3 = arg0 <<= 0x10;
			if (arg1 < 0) {
				arg0 -= arg1 * local27;
				arg3 -= local7 * arg1;
				arg1 = 0;
			}
			arg2 <<= 0x10;
			if (arg5 < 0) {
				arg2 -= arg5 * local49;
				arg5 = 0;
			}
			if ((arg1 == arg5 || local7 >= local27) && (arg1 != arg5 || local49 >= local7)) {
				arg4 -= arg5;
				arg5 -= arg1;
				arg1 = this.anInt9644 * arg1;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static45.method944(this.aByteArray100, arg3 >> 16, arg2 >> 16, arg1);
							arg2 += local49;
							arg3 += local7;
							arg1 += this.anInt9644;
						}
					}
					Static45.method944(this.aByteArray100, arg3 >> 16, arg0 >> 16, arg1);
					arg3 += local7;
					arg0 += local27;
					arg1 += this.anInt9644;
				}
			} else {
				arg4 -= arg5;
				arg5 -= arg1;
				arg1 *= this.anInt9644;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg4--;
							if (arg4 < 0) {
								return;
							}
							Static45.method944(this.aByteArray100, arg2 >> 16, arg3 >> 16, arg1);
							arg1 += this.anInt9644;
							arg2 += local49;
							arg3 += local7;
						}
					}
					Static45.method944(this.aByteArray100, arg0 >> 16, arg3 >> 16, arg1);
					arg0 += local27;
					arg1 += this.anInt9644;
					arg3 += local7;
				}
			}
		} else {
			arg2 = arg0 <<= 0x10;
			arg3 <<= 0x10;
			if (arg1 < 0) {
				arg2 -= local7 * arg1;
				arg0 -= arg1 * local27;
				arg1 = 0;
			}
			if (arg4 < 0) {
				arg3 -= local49 * arg4;
				arg4 = 0;
			}
			if (local7 < local27) {
				arg5 -= arg4;
				arg4 -= arg1;
				arg1 *= this.anInt9644;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static45.method944(this.aByteArray100, arg0 >> 16, arg3 >> 16, arg1);
							arg3 += local49;
							arg1 += this.anInt9644;
							arg0 += local27;
						}
					}
					Static45.method944(this.aByteArray100, arg0 >> 16, arg2 >> 16, arg1);
					arg0 += local27;
					arg1 += this.anInt9644;
					arg2 += local7;
				}
			} else {
				arg5 -= arg4;
				arg4 -= arg1;
				arg1 *= this.anInt9644;
				while (true) {
					arg4--;
					if (arg4 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static45.method944(this.aByteArray100, arg3 >> 16, arg0 >> 16, arg1);
							arg1 += this.anInt9644;
							arg3 += local49;
							arg0 += local27;
						}
					}
					Static45.method944(this.aByteArray100, arg2 >> 16, arg0 >> 16, arg1);
					arg1 += this.anInt9644;
					arg2 += local7;
					arg0 += local27;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZ)V")
	public void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9644 = arg3 - arg1;
		this.anInt9645 = arg0;
		this.anInt9648 = arg2 - arg0;
		this.anInt9646 = arg1;
	}
}
