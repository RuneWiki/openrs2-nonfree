import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vja")
public final class Class14_Sub2_Sub5_Sub2 extends Class14_Sub2_Sub5 {

	@OriginalMember(owner = "client!vja", name = "J", descriptor = "I")
	public int anInt10649;

	@OriginalMember(owner = "client!vja", name = "D", descriptor = "I")
	public int anInt10650;

	@OriginalMember(owner = "client!vja", name = "K", descriptor = "I")
	public int anInt10655;

	@OriginalMember(owner = "client!vja", name = "M", descriptor = "I")
	public int anInt10658;

	@OriginalMember(owner = "client!vja", name = "O", descriptor = "[B")
	public final byte[] aByteArray107;

	@OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Lclient!pi;II)V")
	public Class14_Sub2_Sub5_Sub2(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray107 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIIIII)V")
	public void method9102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		if (arg2 != arg0) {
			local7 = (arg4 - arg5 << 16) / (arg2 - arg0);
		}
		@Pc(31) int local31 = 0;
		if (arg1 != arg2) {
			local31 = (arg3 - arg4 << 16) / (arg1 - arg2);
		}
		@Pc(52) int local52 = 0;
		if (arg1 != arg0) {
			local52 = (arg5 - arg3 << 16) / (arg0 - arg1);
		}
		if (arg2 >= arg0 && arg1 >= arg0) {
			if (arg2 >= arg1) {
				arg4 = arg5 <<= 0x10;
				arg3 <<= 0x10;
				if (arg0 < 0) {
					arg4 -= arg0 * local52;
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				if (arg1 < 0) {
					arg3 -= arg1 * local31;
					arg1 = 0;
				}
				if (arg0 != arg1 && local7 > local52 || arg0 == arg1 && local31 > local7) {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt10658;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg0, arg3 >> 16, arg5 >> 16);
								arg0 += this.anInt10658;
								arg3 += local31;
								arg5 += local7;
							}
						}
						Static241.method4040(this.aByteArray107, arg0, arg4 >> 16, arg5 >> 16);
						arg5 += local7;
						arg4 += local52;
						arg0 += this.anInt10658;
					}
				} else {
					arg2 -= arg1;
					arg1 -= arg0;
					arg0 *= this.anInt10658;
					while (true) {
						arg1--;
						if (arg1 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg0, arg5 >> 16, arg3 >> 16);
								arg5 += local7;
								arg3 += local31;
								arg0 += this.anInt10658;
							}
						}
						Static241.method4040(this.aByteArray107, arg0, arg5 >> 16, arg4 >> 16);
						arg0 += this.anInt10658;
						arg4 += local52;
						arg5 += local7;
					}
				}
			} else {
				arg3 = arg5 <<= 0x10;
				arg4 <<= 0x10;
				if (arg0 < 0) {
					arg5 -= local7 * arg0;
					arg3 -= local52 * arg0;
					arg0 = 0;
				}
				if (arg2 < 0) {
					arg4 -= arg2 * local31;
					arg2 = 0;
				}
				if ((arg0 == arg2 || local52 >= local7) && (arg2 != arg0 || local31 >= local52)) {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt10658;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg0, arg4 >> 16, arg3 >> 16);
								arg0 += this.anInt10658;
								arg3 += local52;
								arg4 += local31;
							}
						}
						Static241.method4040(this.aByteArray107, arg0, arg5 >> 16, arg3 >> 16);
						arg3 += local52;
						arg5 += local7;
						arg0 += this.anInt10658;
					}
				} else {
					arg1 -= arg2;
					arg2 -= arg0;
					arg0 *= this.anInt10658;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg1--;
								if (arg1 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg0, arg3 >> 16, arg4 >> 16);
								arg3 += local52;
								arg4 += local31;
								arg0 += this.anInt10658;
							}
						}
						Static241.method4040(this.aByteArray107, arg0, arg3 >> 16, arg5 >> 16);
						arg3 += local52;
						arg0 += this.anInt10658;
						arg5 += local7;
					}
				}
			}
		} else if (arg1 < arg2) {
			if (arg0 < arg2) {
				arg4 = arg3 <<= 0x10;
				arg5 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= arg1 * local52;
					arg4 -= local31 * arg1;
					arg1 = 0;
				}
				if (arg0 < 0) {
					arg5 -= arg0 * local7;
					arg0 = 0;
				}
				if (local31 < local52) {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt10658 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg1, arg4 >> 16, arg5 >> 16);
								arg5 += local7;
								arg1 += this.anInt10658;
								arg4 += local31;
							}
						}
						Static241.method4040(this.aByteArray107, arg1, arg4 >> 16, arg3 >> 16);
						arg4 += local31;
						arg3 += local52;
						arg1 += this.anInt10658;
					}
				} else {
					arg2 -= arg0;
					arg0 -= arg1;
					arg1 = this.anInt10658 * arg1;
					while (true) {
						arg0--;
						if (arg0 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg1, arg5 >> 16, arg4 >> 16);
								arg5 += local7;
								arg1 += this.anInt10658;
								arg4 += local31;
							}
						}
						Static241.method4040(this.aByteArray107, arg1, arg3 >> 16, arg4 >> 16);
						arg1 += this.anInt10658;
						arg4 += local31;
						arg3 += local52;
					}
				}
			} else {
				arg5 = arg3 <<= 0x10;
				arg4 <<= 0x10;
				if (arg1 < 0) {
					arg3 -= local52 * arg1;
					arg5 -= local31 * arg1;
					arg1 = 0;
				}
				if (arg2 < 0) {
					arg4 -= local7 * arg2;
					arg2 = 0;
				}
				if (local31 >= local52) {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 *= this.anInt10658;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg1, arg3 >> 16, arg4 >> 16);
								arg3 += local52;
								arg1 += this.anInt10658;
								arg4 += local7;
							}
						}
						Static241.method4040(this.aByteArray107, arg1, arg3 >> 16, arg5 >> 16);
						arg5 += local31;
						arg1 += this.anInt10658;
						arg3 += local52;
					}
				} else {
					arg0 -= arg2;
					arg2 -= arg1;
					arg1 = this.anInt10658 * arg1;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg0--;
								if (arg0 < 0) {
									return;
								}
								Static241.method4040(this.aByteArray107, arg1, arg4 >> 16, arg3 >> 16);
								arg3 += local52;
								arg4 += local7;
								arg1 += this.anInt10658;
							}
						}
						Static241.method4040(this.aByteArray107, arg1, arg5 >> 16, arg3 >> 16);
						arg1 += this.anInt10658;
						arg3 += local52;
						arg5 += local31;
					}
				}
			}
		} else if (arg1 >= arg0) {
			arg3 = arg4 <<= 0x10;
			arg5 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local31 * arg2;
				arg3 -= arg2 * local7;
				arg2 = 0;
			}
			if (arg0 < 0) {
				arg5 -= local52 * arg0;
				arg0 = 0;
			}
			if (local31 > local7) {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 *= this.anInt10658;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static241.method4040(this.aByteArray107, arg2, arg5 >> 16, arg4 >> 16);
							arg2 += this.anInt10658;
							arg4 += local31;
							arg5 += local52;
						}
					}
					Static241.method4040(this.aByteArray107, arg2, arg3 >> 16, arg4 >> 16);
					arg3 += local7;
					arg4 += local31;
					arg2 += this.anInt10658;
				}
			} else {
				arg1 -= arg0;
				arg0 -= arg2;
				arg2 = this.anInt10658 * arg2;
				while (true) {
					arg0--;
					if (arg0 < 0) {
						while (true) {
							arg1--;
							if (arg1 < 0) {
								return;
							}
							Static241.method4040(this.aByteArray107, arg2, arg4 >> 16, arg5 >> 16);
							arg4 += local31;
							arg5 += local52;
							arg2 += this.anInt10658;
						}
					}
					Static241.method4040(this.aByteArray107, arg2, arg4 >> 16, arg3 >> 16);
					arg3 += local7;
					arg2 += this.anInt10658;
					arg4 += local31;
				}
			}
		} else {
			arg5 = arg4 <<= 0x10;
			arg3 <<= 0x10;
			if (arg2 < 0) {
				arg5 -= arg2 * local7;
				arg4 -= arg2 * local31;
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg3 -= local52 * arg1;
				arg1 = 0;
			}
			if (arg1 != arg2 && local31 > local7 || arg2 == arg1 && local7 > local52) {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 = this.anInt10658 * arg2;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static241.method4040(this.aByteArray107, arg2, arg5 >> 16, arg3 >> 16);
							arg5 += local7;
							arg3 += local52;
							arg2 += this.anInt10658;
						}
					}
					Static241.method4040(this.aByteArray107, arg2, arg5 >> 16, arg4 >> 16);
					arg4 += local31;
					arg5 += local7;
					arg2 += this.anInt10658;
				}
			} else {
				arg0 -= arg1;
				arg1 -= arg2;
				arg2 *= this.anInt10658;
				while (true) {
					arg1--;
					if (arg1 < 0) {
						while (true) {
							arg0--;
							if (arg0 < 0) {
								return;
							}
							Static241.method4040(this.aByteArray107, arg2, arg3 >> 16, arg5 >> 16);
							arg5 += local7;
							arg2 += this.anInt10658;
							arg3 += local52;
						}
					}
					Static241.method4040(this.aByteArray107, arg2, arg4 >> 16, arg5 >> 16);
					arg2 += this.anInt10658;
					arg4 += local31;
					arg5 += local7;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vja", name = "b", descriptor = "(III)Z")
	public boolean method9103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray107.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIBII)V")
	public void method9106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt10658 = arg3 - arg1;
		this.anInt10655 = arg2;
		this.anInt10649 = arg0 - arg2;
		this.anInt10650 = arg1;
	}

	@OriginalMember(owner = "client!vja", name = "g", descriptor = "(I)V")
	public void method9107() {
		@Pc(14) int local14 = -1;
		@Pc(20) int local20 = this.aByteArray107.length - 8;
		while (local14 < local20) {
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
			local14++;
			this.aByteArray107[local14] = 0;
		}
		while (local14 < this.aByteArray107.length - 1) {
			local14++;
			this.aByteArray107[local14] = 0;
		}
	}
}
