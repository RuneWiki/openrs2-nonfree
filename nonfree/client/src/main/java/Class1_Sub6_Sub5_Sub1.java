import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub6_Sub5_Sub1 extends Class1_Sub6_Sub5 {

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
	public int anInt5817;

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public int anInt5818;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	public int anInt5819;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	public int anInt5820;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "[B")
	public final byte[] aByteArray83;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!nm;II)V")
	public Class1_Sub6_Sub5_Sub1(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray83 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public void method4996() {
		@Pc(12) int local12 = -1;
		@Pc(18) int local18 = this.aByteArray83.length - 8;
		while (local12 < local18) {
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
			local12++;
			this.aByteArray83[local12] = 0;
		}
		while (local12 < this.aByteArray83.length - 1) {
			local12++;
			this.aByteArray83[local12] = 0;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBIIII)V")
	public void method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = 0;
		if (arg3 != arg0) {
			local8 = (arg2 - arg5 << 16) / (arg3 - arg0);
		}
		@Pc(28) int local28 = 0;
		if (arg3 != arg1) {
			local28 = (arg4 - arg2 << 16) / (arg1 - arg3);
		}
		@Pc(49) int local49 = 0;
		if (arg0 != arg1) {
			local49 = (arg5 - arg4 << 16) / (arg0 - arg1);
		}
		if (arg3 >= arg0 && arg0 <= arg1) {
			if (arg3 >= arg1) {
				arg2 = arg5 <<= 0x10;
				if (arg0 < 0) {
					arg2 -= arg0 * local49;
					arg5 -= arg0 * local8;
					arg0 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= local28 * arg1;
					arg1 = 0;
				}
				if (arg1 != arg0 && local49 < local8 || arg1 == arg0 && local28 > local8) {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt5817;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static405.method4995(arg5 >> 16, arg4 >> 16, arg0, this.aByteArray83);
								arg5 += local8;
								arg4 += local28;
								arg0 += this.anInt5817;
							}
						}
						Static405.method4995(arg5 >> 16, arg2 >> 16, arg0, this.aByteArray83);
						arg2 += local49;
						arg0 += this.anInt5817;
						arg5 += local8;
					}
				} else {
					arg3 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt5817;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static405.method4995(arg4 >> 16, arg5 >> 16, arg0, this.aByteArray83);
								arg5 += local8;
								arg0 += this.anInt5817;
								arg4 += local28;
							}
						}
						Static405.method4995(arg2 >> 16, arg5 >> 16, arg0, this.aByteArray83);
						arg5 += local8;
						arg2 += local49;
						arg0 += this.anInt5817;
					}
				}
			} else {
				arg4 = arg5 <<= 0x10;
				arg2 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local49;
					arg5 -= local8 * arg0;
					arg0 = 0;
				}
				if (arg3 < 0) {
					arg2 -= arg3 * local28;
					arg3 = 0;
				}
				if (arg3 != arg0 && local49 < local8 || arg3 == arg0 && local28 < local49) {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 = this.anInt5817 * arg0;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static405.method4995(arg2 >> 16, arg4 >> 16, arg0, this.aByteArray83);
								arg4 += local49;
								arg2 += local28;
								arg0 += this.anInt5817;
							}
						}
						Static405.method4995(arg5 >> 16, arg4 >> 16, arg0, this.aByteArray83);
						arg4 += local49;
						arg5 += local8;
						arg0 += this.anInt5817;
					}
				} else {
					arg1 -= arg3;
					arg3 -= arg0;
					arg0 *= this.anInt5817;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static405.method4995(arg4 >> 16, arg2 >> 16, arg0, this.aByteArray83);
								arg0 += this.anInt5817;
								arg2 += local28;
								arg4 += local49;
							}
						}
						Static405.method4995(arg4 >> 16, arg5 >> 16, arg0, this.aByteArray83);
						arg4 += local49;
						arg0 += this.anInt5817;
						arg5 += local8;
					}
				}
			}
		} else if (arg1 >= arg3) {
			if (arg1 < arg0) {
				arg5 = arg2 <<= 0x10;
				if (arg3 < 0) {
					arg5 -= arg3 * local8;
					arg2 -= arg3 * local28;
					arg3 = 0;
				}
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg4 -= arg1 * local49;
					arg1 = 0;
				}
				if (arg3 != arg1 && local28 > local8 || arg3 == arg1 && local49 < local8) {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt5817 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static405.method4995(arg4 >> 16, arg5 >> 16, arg3, this.aByteArray83);
								arg4 += local49;
								arg5 += local8;
								arg3 += this.anInt5817;
							}
						}
						Static405.method4995(arg2 >> 16, arg5 >> 16, arg3, this.aByteArray83);
						arg2 += local28;
						arg5 += local8;
						arg3 += this.anInt5817;
					}
				} else {
					arg0 -= arg1;
					arg1 -= arg3;
					arg3 = this.anInt5817 * arg3;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static405.method4995(arg5 >> 16, arg4 >> 16, arg3, this.aByteArray83);
								arg4 += local49;
								arg5 += local8;
								arg3 += this.anInt5817;
							}
						}
						Static405.method4995(arg5 >> 16, arg2 >> 16, arg3, this.aByteArray83);
						arg5 += local8;
						arg2 += local28;
						arg3 += this.anInt5817;
					}
				}
			} else {
				arg4 = arg2 <<= 0x10;
				arg5 <<= 0x10;
				if (arg3 < 0) {
					arg2 -= arg3 * local28;
					arg4 -= arg3 * local8;
					arg3 = 0;
				}
				if (arg0 < 0) {
					arg5 -= local49 * arg0;
					arg0 = 0;
				}
				if (local8 >= local28) {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt5817 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static405.method4995(arg5 >> 16, arg2 >> 16, arg3, this.aByteArray83);
								arg5 += local49;
								arg3 += this.anInt5817;
								arg2 += local28;
							}
						}
						Static405.method4995(arg4 >> 16, arg2 >> 16, arg3, this.aByteArray83);
						arg3 += this.anInt5817;
						arg2 += local28;
						arg4 += local8;
					}
				} else {
					arg1 -= arg0;
					arg0 -= arg3;
					arg3 = this.anInt5817 * arg3;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static405.method4995(arg2 >> 16, arg5 >> 16, arg3, this.aByteArray83);
								arg5 += local49;
								arg3 += this.anInt5817;
								arg2 += local28;
							}
						}
						Static405.method4995(arg2 >> 16, arg4 >> 16, arg3, this.aByteArray83);
						arg3 += this.anInt5817;
						arg4 += local8;
						arg2 += local28;
					}
				}
			}
		} else if (arg3 > arg0) {
			arg2 = arg4 <<= 0x10;
			if (arg1 < 0) {
				arg4 -= arg1 * local49;
				arg2 -= arg1 * local28;
				arg1 = 0;
			}
			arg5 <<= 0x10;
			if (arg0 < 0) {
				arg5 -= local8 * arg0;
				arg0 = 0;
			}
			if (local49 > local28) {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt5817 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static405.method4995(arg5 >> 16, arg2 >> 16, arg1, this.aByteArray83);
							arg2 += local28;
							arg5 += local8;
							arg1 += this.anInt5817;
						}
					}
					Static405.method4995(arg4 >> 16, arg2 >> 16, arg1, this.aByteArray83);
					arg4 += local49;
					arg1 += this.anInt5817;
					arg2 += local28;
				}
			} else {
				arg3 -= arg0;
				arg0 -= arg1;
				arg1 = this.anInt5817 * arg1;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static405.method4995(arg2 >> 16, arg5 >> 16, arg1, this.aByteArray83);
							arg1 += this.anInt5817;
							arg5 += local8;
							arg2 += local28;
						}
					}
					Static405.method4995(arg2 >> 16, arg4 >> 16, arg1, this.aByteArray83);
					arg4 += local49;
					arg2 += local28;
					arg1 += this.anInt5817;
				}
			}
		} else {
			arg5 = arg4 <<= 0x10;
			arg2 <<= 0x10;
			if (arg1 < 0) {
				arg5 -= local28 * arg1;
				arg4 -= arg1 * local49;
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg2 -= local8 * arg3;
				arg3 = 0;
			}
			if (local28 < local49) {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt5817 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static405.method4995(arg4 >> 16, arg2 >> 16, arg1, this.aByteArray83);
							arg1 += this.anInt5817;
							arg2 += local8;
							arg4 += local49;
						}
					}
					Static405.method4995(arg4 >> 16, arg5 >> 16, arg1, this.aByteArray83);
					arg1 += this.anInt5817;
					arg4 += local49;
					arg5 += local28;
				}
			} else {
				arg0 -= arg3;
				arg3 -= arg1;
				arg1 = this.anInt5817 * arg1;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static405.method4995(arg2 >> 16, arg4 >> 16, arg1, this.aByteArray83);
							arg4 += local49;
							arg2 += local8;
							arg1 += this.anInt5817;
						}
					}
					Static405.method4995(arg5 >> 16, arg4 >> 16, arg1, this.aByteArray83);
					arg4 += local49;
					arg1 += this.anInt5817;
					arg5 += local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Z")
	public boolean method4998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 * arg1 <= this.aByteArray83.length;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIBI)V")
	public void method4999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5817 = arg0 - arg3;
		this.anInt5819 = arg3;
		this.anInt5820 = arg1 - arg2;
		this.anInt5818 = arg2;
	}
}
