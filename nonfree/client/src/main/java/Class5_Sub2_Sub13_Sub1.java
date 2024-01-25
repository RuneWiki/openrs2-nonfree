import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class5_Sub2_Sub13_Sub1 extends Class5_Sub2_Sub13 {

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
	public int anInt2322;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public int anInt2323;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[B")
	public final byte[] aByteArray33;

	static {
		new Class40("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!jj;II)V")
	public Class5_Sub2_Sub13_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray33 = new byte[arg1 * arg2];
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
	public void method2141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2324 = arg3;
		this.anInt2322 = arg2 - arg3;
		this.anInt2326 = arg0;
		this.anInt2323 = arg1 - arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)Z")
	public boolean method2142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aByteArray33.length >= arg0 * arg1;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public void method2143() {
		@Pc(19) int local19 = -1;
		@Pc(25) int local25 = this.aByteArray33.length - 8;
		while (local19 < local25) {
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
			local19++;
			this.aByteArray33[local19] = 0;
		}
		while (this.aByteArray33.length - 1 > local19) {
			local19++;
			this.aByteArray33[local19] = 0;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)V")
	public void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = 0;
		if (arg5 != arg2) {
			local11 = (arg0 - arg1 << 16) / (arg2 - arg5);
		}
		@Pc(28) int local28 = 0;
		if (arg2 != arg3) {
			local28 = (arg4 - arg0 << 16) / (arg3 - arg2);
		}
		@Pc(48) int local48 = 0;
		if (arg3 != arg5) {
			local48 = (arg1 - arg4 << 16) / (arg5 - arg3);
		}
		if (arg5 <= arg2 && arg3 >= arg5) {
			if (arg2 >= arg3) {
				arg0 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= arg5 * local11;
					arg0 -= arg5 * local48;
					arg5 = 0;
				}
				arg4 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local28;
					arg3 = 0;
				}
				if (arg3 != arg5 && local11 > local48 || arg3 == arg5 && local28 > local11) {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 = this.anInt2323 * arg5;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static495.method6853(arg5, arg1 >> 16, arg4 >> 16, this.aByteArray33);
								arg5 += this.anInt2323;
								arg1 += local11;
								arg4 += local28;
							}
						}
						Static495.method6853(arg5, arg1 >> 16, arg0 >> 16, this.aByteArray33);
						arg0 += local48;
						arg5 += this.anInt2323;
						arg1 += local11;
					}
				} else {
					arg2 -= arg3;
					arg3 -= arg5;
					arg5 *= this.anInt2323;
					while (true) {
						arg3--;
						if (arg3 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static495.method6853(arg5, arg4 >> 16, arg1 >> 16, this.aByteArray33);
								arg1 += local11;
								arg5 += this.anInt2323;
								arg4 += local28;
							}
						}
						Static495.method6853(arg5, arg0 >> 16, arg1 >> 16, this.aByteArray33);
						arg5 += this.anInt2323;
						arg0 += local48;
						arg1 += local11;
					}
				}
			} else {
				arg4 = arg1 <<= 0x10;
				if (arg5 < 0) {
					arg1 -= local11 * arg5;
					arg4 -= arg5 * local48;
					arg5 = 0;
				}
				arg0 <<= 0x10;
				if (arg2 < 0) {
					arg0 -= arg2 * local28;
					arg2 = 0;
				}
				if ((arg5 == arg2 || local11 <= local48) && (arg5 != arg2 || local28 >= local48)) {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 *= this.anInt2323;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static495.method6853(arg5, arg4 >> 16, arg0 >> 16, this.aByteArray33);
								arg0 += local28;
								arg5 += this.anInt2323;
								arg4 += local48;
							}
						}
						Static495.method6853(arg5, arg4 >> 16, arg1 >> 16, this.aByteArray33);
						arg1 += local11;
						arg5 += this.anInt2323;
						arg4 += local48;
					}
				} else {
					arg3 -= arg2;
					arg2 -= arg5;
					arg5 = this.anInt2323 * arg5;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg3--;
								if (arg3 < 0) {
									return;
								}
								Static495.method6853(arg5, arg0 >> 16, arg4 >> 16, this.aByteArray33);
								arg5 += this.anInt2323;
								arg4 += local48;
								arg0 += local28;
							}
						}
						Static495.method6853(arg5, arg1 >> 16, arg4 >> 16, this.aByteArray33);
						arg4 += local48;
						arg5 += this.anInt2323;
						arg1 += local11;
					}
				}
			}
		} else if (arg3 < arg2) {
			if (arg2 > arg5) {
				arg0 = arg4 <<= 0x10;
				arg1 <<= 0x10;
				if (arg3 < 0) {
					arg4 -= arg3 * local48;
					arg0 -= arg3 * local28;
					arg3 = 0;
				}
				if (arg5 < 0) {
					arg1 -= local11 * arg5;
					arg5 = 0;
				}
				if (local48 > local28) {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 *= this.anInt2323;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static495.method6853(arg3, arg1 >> 16, arg0 >> 16, this.aByteArray33);
								arg0 += local28;
								arg1 += local11;
								arg3 += this.anInt2323;
							}
						}
						Static495.method6853(arg3, arg4 >> 16, arg0 >> 16, this.aByteArray33);
						arg0 += local28;
						arg4 += local48;
						arg3 += this.anInt2323;
					}
				} else {
					arg2 -= arg5;
					arg5 -= arg3;
					arg3 = this.anInt2323 * arg3;
					while (true) {
						arg5--;
						if (arg5 < 0) {
							while (true) {
								arg2--;
								if (arg2 < 0) {
									return;
								}
								Static495.method6853(arg3, arg0 >> 16, arg1 >> 16, this.aByteArray33);
								arg0 += local28;
								arg3 += this.anInt2323;
								arg1 += local11;
							}
						}
						Static495.method6853(arg3, arg0 >> 16, arg4 >> 16, this.aByteArray33);
						arg4 += local48;
						arg0 += local28;
						arg3 += this.anInt2323;
					}
				}
			} else {
				arg1 = arg4 <<= 0x10;
				arg0 <<= 0x10;
				if (arg3 < 0) {
					arg1 -= local28 * arg3;
					arg4 -= local48 * arg3;
					arg3 = 0;
				}
				if (arg2 < 0) {
					arg0 -= local11 * arg2;
					arg2 = 0;
				}
				if (local48 <= local28) {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 *= this.anInt2323;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static495.method6853(arg3, arg0 >> 16, arg4 >> 16, this.aByteArray33);
								arg4 += local48;
								arg0 += local11;
								arg3 += this.anInt2323;
							}
						}
						Static495.method6853(arg3, arg1 >> 16, arg4 >> 16, this.aByteArray33);
						arg3 += this.anInt2323;
						arg4 += local48;
						arg1 += local28;
					}
				} else {
					arg5 -= arg2;
					arg2 -= arg3;
					arg3 = this.anInt2323 * arg3;
					while (true) {
						arg2--;
						if (arg2 < 0) {
							while (true) {
								arg5--;
								if (arg5 < 0) {
									return;
								}
								Static495.method6853(arg3, arg4 >> 16, arg0 >> 16, this.aByteArray33);
								arg3 += this.anInt2323;
								arg0 += local11;
								arg4 += local48;
							}
						}
						Static495.method6853(arg3, arg4 >> 16, arg1 >> 16, this.aByteArray33);
						arg3 += this.anInt2323;
						arg1 += local28;
						arg4 += local48;
					}
				}
			}
		} else if (arg3 < arg5) {
			arg1 = arg0 <<= 0x10;
			if (arg2 < 0) {
				arg0 -= local28 * arg2;
				arg1 -= local11 * arg2;
				arg2 = 0;
			}
			arg4 <<= 0x10;
			if (arg3 < 0) {
				arg4 -= arg3 * local48;
				arg3 = 0;
			}
			if ((arg3 == arg2 || local28 <= local11) && (arg2 != arg3 || local11 <= local48)) {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt2323 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static495.method6853(arg2, arg1 >> 16, arg4 >> 16, this.aByteArray33);
							arg4 += local48;
							arg2 += this.anInt2323;
							arg1 += local11;
						}
					}
					Static495.method6853(arg2, arg1 >> 16, arg0 >> 16, this.aByteArray33);
					arg1 += local11;
					arg2 += this.anInt2323;
					arg0 += local28;
				}
			} else {
				arg5 -= arg3;
				arg3 -= arg2;
				arg2 = this.anInt2323 * arg2;
				while (true) {
					arg3--;
					if (arg3 < 0) {
						while (true) {
							arg5--;
							if (arg5 < 0) {
								return;
							}
							Static495.method6853(arg2, arg4 >> 16, arg1 >> 16, this.aByteArray33);
							arg4 += local48;
							arg1 += local11;
							arg2 += this.anInt2323;
						}
					}
					Static495.method6853(arg2, arg0 >> 16, arg1 >> 16, this.aByteArray33);
					arg0 += local28;
					arg2 += this.anInt2323;
					arg1 += local11;
				}
			}
		} else {
			arg4 = arg0 <<= 0x10;
			arg1 <<= 0x10;
			if (arg2 < 0) {
				arg4 -= local11 * arg2;
				arg0 -= arg2 * local28;
				arg2 = 0;
			}
			if (arg5 < 0) {
				arg1 -= local48 * arg5;
				arg5 = 0;
			}
			if (local11 >= local28) {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 = this.anInt2323 * arg2;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static495.method6853(arg2, arg1 >> 16, arg0 >> 16, this.aByteArray33);
							arg0 += local28;
							arg2 += this.anInt2323;
							arg1 += local48;
						}
					}
					Static495.method6853(arg2, arg4 >> 16, arg0 >> 16, this.aByteArray33);
					arg2 += this.anInt2323;
					arg0 += local28;
					arg4 += local11;
				}
			} else {
				arg3 -= arg5;
				arg5 -= arg2;
				arg2 *= this.anInt2323;
				while (true) {
					arg5--;
					if (arg5 < 0) {
						while (true) {
							arg3--;
							if (arg3 < 0) {
								return;
							}
							Static495.method6853(arg2, arg0 >> 16, arg1 >> 16, this.aByteArray33);
							arg1 += local48;
							arg0 += local28;
							arg2 += this.anInt2323;
						}
					}
					Static495.method6853(arg2, arg0 >> 16, arg4 >> 16, this.aByteArray33);
					arg0 += local28;
					arg4 += local11;
					arg2 += this.anInt2323;
				}
			}
		}
	}
}
