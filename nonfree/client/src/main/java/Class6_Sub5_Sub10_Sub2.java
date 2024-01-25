import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class6_Sub5_Sub10_Sub2 extends Class6_Sub5_Sub10 {

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	public int anInt4129;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	public int anInt4130;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
	public int anInt4135;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
	public int anInt4137;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!uv;II)V")
	public Class6_Sub5_Sub10_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray29 = new byte[arg2 * arg1];
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public void method3508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4130 = arg3 - arg2;
		this.anInt4137 = arg0 - arg1;
		this.anInt4129 = arg1;
		this.anInt4135 = arg2;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public boolean method3509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aByteArray29.length >= arg1 * arg0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIBI)V")
	public void method3510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg5 != arg0) {
			local11 = (arg2 - arg1 << 16) / (arg5 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg5 != arg4) {
			local28 = (arg3 - arg2 << 16) / (arg4 - arg5);
		}
		@Pc(45) int local45 = 0;
		if (arg0 != arg4) {
			local45 = (arg1 - arg3 << 16) / (arg0 - arg4);
		}
		if (arg5 >= arg0 && arg0 <= arg4) {
			if (arg4 <= arg5) {
				arg2 = arg1 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local11 * arg0;
					arg2 -= arg0 * local45;
					arg0 = 0;
				}
				if (arg4 < 0) {
					arg3 -= arg4 * local28;
					arg4 = 0;
				}
				if (arg0 != arg4 && local45 < local11 || arg0 == arg4 && local28 > local11) {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt4130 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static547.method479(arg0, arg3 >> 16, arg1 >> 16, this.aByteArray29);
								arg0 += this.anInt4130;
								arg1 += local11;
								arg3 += local28;
							}
						}
						Static547.method479(arg0, arg2 >> 16, arg1 >> 16, this.aByteArray29);
						arg2 += local45;
						arg1 += local11;
						arg0 += this.anInt4130;
					}
				} else {
					arg5 -= arg4;
					arg4 -= arg0;
					arg0 = this.anInt4130 * arg0;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static547.method479(arg0, arg1 >> 16, arg3 >> 16, this.aByteArray29);
								arg0 += this.anInt4130;
								arg1 += local11;
								arg3 += local28;
							}
						}
						Static547.method479(arg0, arg1 >> 16, arg2 >> 16, this.aByteArray29);
						arg2 += local45;
						arg0 += this.anInt4130;
						arg1 += local11;
					}
				}
			} else {
				arg3 = arg1 <<= 0x10;
				if (arg0 < 0) {
					arg1 -= local11 * arg0;
					arg3 -= arg0 * local45;
					arg0 = 0;
				}
				arg2 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local28;
					arg5 = 0;
				}
				if ((arg0 == arg5 || local45 >= local11) && (arg0 != arg5 || local45 <= local28)) {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 *= this.anInt4130;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static547.method479(arg0, arg2 >> 16, arg3 >> 16, this.aByteArray29);
								arg0 += this.anInt4130;
								arg2 += local28;
								arg3 += local45;
							}
						}
						Static547.method479(arg0, arg1 >> 16, arg3 >> 16, this.aByteArray29);
						arg0 += this.anInt4130;
						arg3 += local45;
						arg1 += local11;
					}
				} else {
					arg4 -= arg5;
					arg5 -= arg0;
					arg0 = this.anInt4130 * arg0;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static547.method479(arg0, arg3 >> 16, arg2 >> 16, this.aByteArray29);
								arg2 += local28;
								arg0 += this.anInt4130;
								arg3 += local45;
							}
						}
						Static547.method479(arg0, arg3 >> 16, arg1 >> 16, this.aByteArray29);
						arg1 += local11;
						arg0 += this.anInt4130;
						arg3 += local45;
					}
				}
			}
		} else if (arg4 >= arg5) {
			if (arg0 <= arg4) {
				arg3 = arg2 <<= 0x10;
				arg1 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= local28 * arg5;
					arg3 -= arg5 * local11;
					arg5 = 0;
				}
				if (arg0 < 0) {
					arg1 -= local45 * arg0;
					arg0 = 0;
				}
				if (local11 < local28) {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 *= this.anInt4130;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static547.method479(arg5, arg1 >> 16, arg2 >> 16, this.aByteArray29);
								arg5 += this.anInt4130;
								arg1 += local45;
								arg2 += local28;
							}
						}
						Static547.method479(arg5, arg3 >> 16, arg2 >> 16, this.aByteArray29);
						arg5 += this.anInt4130;
						arg2 += local28;
						arg3 += local11;
					}
				} else {
					arg4 -= arg0;
					arg0 -= arg5;
					arg5 = this.anInt4130 * arg5;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg4--;
								if (arg4 < 0) {
									return;
								}
								Static547.method479(arg5, arg2 >> 16, arg1 >> 16, this.aByteArray29);
								arg5 += this.anInt4130;
								arg1 += local45;
								arg2 += local28;
							}
						}
						Static547.method479(arg5, arg2 >> 16, arg3 >> 16, this.aByteArray29);
						arg2 += local28;
						arg5 += this.anInt4130;
						arg3 += local11;
					}
				}
			} else {
				arg1 = arg2 <<= 0x10;
				arg3 <<= 0x10;
				if (arg5 < 0) {
					arg2 -= arg5 * local28;
					arg1 -= arg5 * local11;
					arg5 = 0;
				}
				if (arg4 < 0) {
					arg3 -= local45 * arg4;
					arg4 = 0;
				}
				if ((arg4 == arg5 || local11 >= local28) && (arg4 != arg5 || local45 >= local11)) {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt4130;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static547.method479(arg5, arg3 >> 16, arg1 >> 16, this.aByteArray29);
								arg1 += local11;
								arg5 += this.anInt4130;
								arg3 += local45;
							}
						}
						Static547.method479(arg5, arg2 >> 16, arg1 >> 16, this.aByteArray29);
						arg1 += local11;
						arg5 += this.anInt4130;
						arg2 += local28;
					}
				} else {
					arg0 -= arg4;
					arg4 -= arg5;
					arg5 *= this.anInt4130;
					while (true) {
						arg4--;
						if (arg4 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static547.method479(arg5, arg1 >> 16, arg3 >> 16, this.aByteArray29);
								arg1 += local11;
								arg3 += local45;
								arg5 += this.anInt4130;
							}
						}
						Static547.method479(arg5, arg1 >> 16, arg2 >> 16, this.aByteArray29);
						arg2 += local28;
						arg5 += this.anInt4130;
						arg1 += local11;
					}
				}
			}
		} else if (arg0 >= arg5) {
			arg1 = arg3 <<= 0x10;
			arg2 <<= 0x10;
			if (arg4 < 0) {
				arg1 -= local28 * arg4;
				arg3 -= arg4 * local45;
				arg4 = 0;
			}
			if (arg5 < 0) {
				arg2 -= arg5 * local11;
				arg5 = 0;
			}
			if (local28 >= local45) {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt4130;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static547.method479(arg4, arg3 >> 16, arg2 >> 16, this.aByteArray29);
							arg4 += this.anInt4130;
							arg2 += local11;
							arg3 += local45;
						}
					}
					Static547.method479(arg4, arg3 >> 16, arg1 >> 16, this.aByteArray29);
					arg4 += this.anInt4130;
					arg1 += local28;
					arg3 += local45;
				}
			} else {
				arg0 -= arg5;
				arg5 -= arg4;
				arg4 *= this.anInt4130;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static547.method479(arg4, arg2 >> 16, arg3 >> 16, this.aByteArray29);
							arg3 += local45;
							arg2 += local11;
							arg4 += this.anInt4130;
						}
					}
					Static547.method479(arg4, arg1 >> 16, arg3 >> 16, this.aByteArray29);
					arg3 += local45;
					arg1 += local28;
					arg4 += this.anInt4130;
				}
			}
		} else {
			arg2 = arg3 <<= 0x10;
			arg1 <<= 0x10;
			if (arg4 < 0) {
				arg2 -= local28 * arg4;
				arg3 -= local45 * arg4;
				arg4 = 0;
			}
			if (arg0 < 0) {
				arg1 -= arg0 * local11;
				arg0 = 0;
			}
			if (local45 <= local28) {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt4130 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static547.method479(arg4, arg1 >> 16, arg2 >> 16, this.aByteArray29);
							arg4 += this.anInt4130;
							arg2 += local28;
							arg1 += local11;
						}
					}
					Static547.method479(arg4, arg3 >> 16, arg2 >> 16, this.aByteArray29);
					arg4 += this.anInt4130;
					arg3 += local45;
					arg2 += local28;
				}
			} else {
				arg5 -= arg0;
				arg0 -= arg4;
				arg4 = this.anInt4130 * arg4;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static547.method479(arg4, arg2 >> 16, arg1 >> 16, this.aByteArray29);
							arg4 += this.anInt4130;
							arg2 += local28;
							arg1 += local11;
						}
					}
					Static547.method479(arg4, arg2 >> 16, arg3 >> 16, this.aByteArray29);
					arg2 += local28;
					arg3 += local45;
					arg4 += this.anInt4130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public void method3511() {
		@Pc(13) int local13 = -1;
		@Pc(19) int local19 = this.aByteArray29.length - 8;
		while (local13 < local19) {
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
			local13++;
			this.aByteArray29[local13] = 0;
		}
		while (this.aByteArray29.length - 1 > local13) {
			local13++;
			this.aByteArray29[local13] = 0;
		}
	}
}
