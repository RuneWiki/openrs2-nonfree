import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	public int anInt1359;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
	public int anInt1360;

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
	public int anInt1363;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
	public int anInt1364;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
	private int anInt1366;

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
	private int anInt1370;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
	private int anInt1357;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
	private int anInt1358;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	private int anInt1361;

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
	public int anInt1365;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!cc;II)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) Class1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub10_5 = arg0;
		this.anInt1362 = arg0.anInt648;
		this.anInt1370 = arg0.anInt649;
		this.aBoolean97 = arg0.aBoolean52;
		this.anInt1357 = arg1;
		this.anInt1358 = arg2;
		this.anInt1361 = 8192;
		this.anInt1365 = 0;
		this.method1159();
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!cc;III)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) Class1_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass1_Sub10_5 = arg0;
		this.anInt1362 = arg0.anInt648;
		this.anInt1370 = arg0.anInt649;
		this.aBoolean97 = arg0.aBoolean52;
		this.anInt1357 = arg1;
		this.anInt1358 = arg2;
		this.anInt1361 = arg3;
		this.anInt1365 = 0;
		this.method1159();
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public synchronized void method1143(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1365 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "()Z")
	public boolean method1145() {
		return this.anInt1365 < 0 || this.anInt1365 >= ((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10.length << 8;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([IIIII)I")
	private int method1146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt1366 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt1366;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt1366 += arg1;
				if (this.anInt1357 == -256 && (this.anInt1365 & 0xFF) == 0) {
					if (Static166.aBoolean261) {
						arg1 = Static301.method1175(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, this.anInt1367, this.anInt1368, local7, arg2, this);
					} else {
						arg1 = Static301.method1158(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, this.anInt1359, local7, arg2, this);
					}
				} else if (Static166.aBoolean261) {
					arg1 = Static301.method1181(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, this.anInt1367, this.anInt1368, local7, arg2, this, this.anInt1357, arg4);
				} else {
					arg1 = Static301.method1156(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, this.anInt1359, local7, arg2, this, this.anInt1357, arg4);
				}
				this.anInt1366 -= arg1;
				if (this.anInt1366 != 0) {
					return arg1;
				}
				if (!this.method1162()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt1357 == -256 && (this.anInt1365 & 0xFF) == 0) {
				if (Static166.aBoolean261) {
					return Static301.method1157(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, arg3, arg2, this);
				}
				return Static301.method1151(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, arg3, arg2, this);
			}
			if (Static166.aBoolean261) {
				return Static301.method1153(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, arg3, arg2, this, this.anInt1357, arg4);
			}
			return Static301.method1150(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, arg3, arg2, this, this.anInt1357, arg4);
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	public synchronized void method1147(@OriginalArg(0) int arg0) {
		this.method1178(arg0 << 6, this.method1152());
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4372(@OriginalArg(0) int arg0) {
		if (this.anInt1366 > 0) {
			if (arg0 >= this.anInt1366) {
				if (this.anInt1358 == Integer.MIN_VALUE) {
					this.anInt1358 = 0;
					this.anInt1363 = this.anInt1360 = this.anInt1364 = 0;
					this.method4441();
					arg0 = this.anInt1366;
				}
				this.anInt1366 = 0;
				this.method1159();
			} else {
				this.anInt1363 += this.anInt1359 * arg0;
				this.anInt1360 += this.anInt1367 * arg0;
				this.anInt1364 += this.anInt1368 * arg0;
				this.anInt1366 -= arg0;
			}
		}
		@Pc(71) Class1_Sub10_Sub1 local71 = (Class1_Sub10_Sub1) this.aClass1_Sub10_5;
		@Pc(76) int local76 = this.anInt1362 << 8;
		@Pc(81) int local81 = this.anInt1370 << 8;
		@Pc(87) int local87 = local71.aByteArray10.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1369 = 0;
		}
		if (this.anInt1365 < 0) {
			if (this.anInt1357 <= 0) {
				this.method1180();
				this.method4441();
				return;
			}
			this.anInt1365 = 0;
		}
		if (this.anInt1365 >= local87) {
			if (this.anInt1357 >= 0) {
				this.method1180();
				this.method4441();
				return;
			}
			this.anInt1365 = local87 - 1;
		}
		this.anInt1365 += this.anInt1357 * arg0;
		if (this.anInt1369 >= 0) {
			if (this.anInt1369 > 0) {
				if (this.aBoolean97) {
					label121: {
						if (this.anInt1357 < 0) {
							if (this.anInt1365 >= local76) {
								return;
							}
							this.anInt1365 = local76 + local76 - this.anInt1365 - 1;
							this.anInt1357 = -this.anInt1357;
							if (--this.anInt1369 == 0) {
								break label121;
							}
						}
						do {
							if (this.anInt1365 < local81) {
								return;
							}
							this.anInt1365 = local81 + local81 - this.anInt1365 - 1;
							this.anInt1357 = -this.anInt1357;
							if (--this.anInt1369 == 0) {
								break;
							}
							if (this.anInt1365 >= local76) {
								return;
							}
							this.anInt1365 = local76 + local76 - this.anInt1365 - 1;
							this.anInt1357 = -this.anInt1357;
						} while (--this.anInt1369 != 0);
					}
				} else {
					label153: {
						@Pc(362) int local362;
						if (this.anInt1357 < 0) {
							if (this.anInt1365 >= local76) {
								return;
							}
							local362 = (local81 - this.anInt1365 - 1) / local91;
							if (local362 >= this.anInt1369) {
								this.anInt1365 += local91 * this.anInt1369;
								this.anInt1369 = 0;
								break label153;
							}
							this.anInt1365 += local91 * local362;
							this.anInt1369 -= local362;
						} else if (this.anInt1365 >= local81) {
							local362 = (this.anInt1365 - local76) / local91;
							if (local362 >= this.anInt1369) {
								this.anInt1365 -= local91 * this.anInt1369;
								this.anInt1369 = 0;
								break label153;
							}
							this.anInt1365 -= local91 * local362;
							this.anInt1369 -= local362;
						} else {
							return;
						}
						return;
					}
				}
			}
			if (this.anInt1357 < 0) {
				if (this.anInt1365 < 0) {
					this.anInt1365 = -1;
					this.method1180();
					this.method4441();
				}
			} else if (this.anInt1365 >= local87) {
				this.anInt1365 = local87;
				this.method1180();
				this.method4441();
			}
		} else if (this.aBoolean97) {
			if (this.anInt1357 < 0) {
				if (this.anInt1365 >= local76) {
					return;
				}
				this.anInt1365 = local76 + local76 - this.anInt1365 - 1;
				this.anInt1357 = -this.anInt1357;
			}
			while (this.anInt1365 >= local81) {
				this.anInt1365 = local81 + local81 - this.anInt1365 - 1;
				this.anInt1357 = -this.anInt1357;
				if (this.anInt1365 >= local76) {
					return;
				}
				this.anInt1365 = local76 + local76 - this.anInt1365 - 1;
				this.anInt1357 = -this.anInt1357;
			}
		} else if (this.anInt1357 < 0) {
			if (this.anInt1365 >= local76) {
				return;
			}
			this.anInt1365 = local81 - (local81 - 1 - this.anInt1365) % local91 - 1;
		} else if (this.anInt1365 >= local81) {
			this.anInt1365 = local76 + (this.anInt1365 - local76) % local91;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "()I")
	public synchronized int method1152() {
		return this.anInt1361 < 0 ? -1 : this.anInt1361;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()I")
	@Override
	public int method4373() {
		return this.anInt1358 == 0 && this.anInt1366 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()Lclient!an;")
	@Override
	public Class1_Sub5 method4370() {
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "()I")
	public synchronized int method1155() {
		return this.anInt1358 == Integer.MIN_VALUE ? 0 : this.anInt1358;
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "()V")
	private void method1159() {
		this.anInt1363 = this.anInt1358;
		this.anInt1360 = Static301.method1154(this.anInt1358, this.anInt1361);
		this.anInt1364 = Static301.method1169(this.anInt1358, this.anInt1361);
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public synchronized void method1160(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method1168();
			this.method4441();
		} else if (this.anInt1360 == 0 && this.anInt1364 == 0) {
			this.anInt1366 = 0;
			this.anInt1358 = 0;
			this.anInt1363 = 0;
			this.method4441();
		} else {
			@Pc(31) int local31 = -this.anInt1363;
			if (this.anInt1363 > local31) {
				local31 = this.anInt1363;
			}
			if (-this.anInt1360 > local31) {
				local31 = -this.anInt1360;
			}
			if (this.anInt1360 > local31) {
				local31 = this.anInt1360;
			}
			if (-this.anInt1364 > local31) {
				local31 = -this.anInt1364;
			}
			if (this.anInt1364 > local31) {
				local31 = this.anInt1364;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1366 = arg0;
			this.anInt1358 = Integer.MIN_VALUE;
			this.anInt1359 = -this.anInt1363 / arg0;
			this.anInt1367 = -this.anInt1360 / arg0;
			this.anInt1368 = -this.anInt1364 / arg0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	public synchronized void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method1178(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static301.method1154(arg1, arg2);
		@Pc(14) int local14 = Static301.method1169(arg1, arg2);
		if (this.anInt1360 == local10 && this.anInt1364 == local14) {
			this.anInt1366 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1363;
		if (this.anInt1363 - arg1 > local31) {
			local31 = this.anInt1363 - arg1;
		}
		if (local10 - this.anInt1360 > local31) {
			local31 = local10 - this.anInt1360;
		}
		if (this.anInt1360 - local10 > local31) {
			local31 = this.anInt1360 - local10;
		}
		if (local14 - this.anInt1364 > local31) {
			local31 = local14 - this.anInt1364;
		}
		if (this.anInt1364 - local14 > local31) {
			local31 = this.anInt1364 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1366 = arg0;
		this.anInt1358 = arg1;
		this.anInt1361 = arg2;
		this.anInt1359 = (arg1 - this.anInt1363) / arg0;
		this.anInt1367 = (local10 - this.anInt1360) / arg0;
		this.anInt1368 = (local14 - this.anInt1364) / arg0;
	}

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "()Z")
	private boolean method1162() {
		@Pc(2) int local2 = this.anInt1358;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static301.method1154(local2, this.anInt1361);
			local8 = Static301.method1169(local2, this.anInt1361);
		}
		if (this.anInt1363 != local2 || this.anInt1360 != local10 || this.anInt1364 != local8) {
			if (this.anInt1363 < local2) {
				this.anInt1359 = 1;
				this.anInt1366 = local2 - this.anInt1363;
			} else if (this.anInt1363 > local2) {
				this.anInt1359 = -1;
				this.anInt1366 = this.anInt1363 - local2;
			} else {
				this.anInt1359 = 0;
			}
			if (this.anInt1360 < local10) {
				this.anInt1367 = 1;
				if (this.anInt1366 == 0 || this.anInt1366 > local10 - this.anInt1360) {
					this.anInt1366 = local10 - this.anInt1360;
				}
			} else if (this.anInt1360 > local10) {
				this.anInt1367 = -1;
				if (this.anInt1366 == 0 || this.anInt1366 > this.anInt1360 - local10) {
					this.anInt1366 = this.anInt1360 - local10;
				}
			} else {
				this.anInt1367 = 0;
			}
			if (this.anInt1364 < local8) {
				this.anInt1368 = 1;
				if (this.anInt1366 == 0 || this.anInt1366 > local8 - this.anInt1364) {
					this.anInt1366 = local8 - this.anInt1364;
				}
			} else if (this.anInt1364 > local8) {
				this.anInt1368 = -1;
				if (this.anInt1366 == 0 || this.anInt1366 > this.anInt1364 - local8) {
					this.anInt1366 = this.anInt1364 - local8;
				}
			} else {
				this.anInt1368 = 0;
			}
			return false;
		} else if (this.anInt1358 == Integer.MIN_VALUE) {
			this.anInt1358 = 0;
			this.anInt1363 = this.anInt1360 = this.anInt1364 = 0;
			this.method4441();
			return true;
		} else {
			this.method1159();
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
	public synchronized void method1166() {
		this.anInt1357 = (this.anInt1357 ^ this.anInt1357 >> 31) + (this.anInt1357 >>> 31);
		this.anInt1357 = -this.anInt1357;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "()Lclient!an;")
	@Override
	public Class1_Sub5 method4375() {
		return null;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
	public synchronized void method1167(@OriginalArg(0) int arg0) {
		if (this.anInt1357 < 0) {
			this.anInt1357 = -arg0;
		} else {
			this.anInt1357 = arg0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
	private synchronized void method1168() {
		this.method1178(0, this.method1152());
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()I")
	@Override
	public int method4371() {
		@Pc(6) int local6 = this.anInt1363 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1369 == 0) {
			local6 -= local6 * this.anInt1365 / (((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10.length << 8);
		} else if (this.anInt1369 >= 0) {
			local6 -= local6 * this.anInt1362 / ((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V")
	public synchronized void method1170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1161(arg0, arg1, this.method1152());
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1358 == 0 && this.anInt1366 == 0) {
			this.method4372(arg2);
			return;
		}
		@Pc(13) Class1_Sub10_Sub1 local13 = (Class1_Sub10_Sub1) this.aClass1_Sub10_5;
		@Pc(18) int local18 = this.anInt1362 << 8;
		@Pc(23) int local23 = this.anInt1370 << 8;
		@Pc(29) int local29 = local13.aByteArray10.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1369 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1365 < 0) {
			if (this.anInt1357 <= 0) {
				this.method1180();
				this.method4441();
				return;
			}
			this.anInt1365 = 0;
		}
		if (this.anInt1365 >= local29) {
			if (this.anInt1357 >= 0) {
				this.method1180();
				this.method4441();
				return;
			}
			this.anInt1365 = local29 - 1;
		}
		if (this.anInt1369 >= 0) {
			if (this.anInt1369 > 0) {
				if (this.aBoolean97) {
					label131: {
						if (this.anInt1357 < 0) {
							local40 = this.method1146(arg0, arg1, local18, local44, local13.aByteArray10[this.anInt1362]);
							if (this.anInt1365 >= local18) {
								return;
							}
							this.anInt1365 = local18 + local18 - this.anInt1365 - 1;
							this.anInt1357 = -this.anInt1357;
							if (--this.anInt1369 == 0) {
								break label131;
							}
						}
						do {
							local40 = this.method1177(arg0, local40, local23, local44, local13.aByteArray10[this.anInt1370 - 1]);
							if (this.anInt1365 < local23) {
								return;
							}
							this.anInt1365 = local23 + local23 - this.anInt1365 - 1;
							this.anInt1357 = -this.anInt1357;
							if (--this.anInt1369 == 0) {
								break;
							}
							local40 = this.method1146(arg0, local40, local18, local44, local13.aByteArray10[this.anInt1362]);
							if (this.anInt1365 >= local18) {
								return;
							}
							this.anInt1365 = local18 + local18 - this.anInt1365 - 1;
							this.anInt1357 = -this.anInt1357;
						} while (--this.anInt1369 != 0);
					}
				} else {
					@Pc(417) int local417;
					if (this.anInt1357 < 0) {
						while (true) {
							local40 = this.method1146(arg0, local40, local18, local44, local13.aByteArray10[this.anInt1370 - 1]);
							if (this.anInt1365 >= local18) {
								return;
							}
							local417 = (local23 - this.anInt1365 - 1) / local33;
							if (local417 >= this.anInt1369) {
								this.anInt1365 += local33 * this.anInt1369;
								this.anInt1369 = 0;
								break;
							}
							this.anInt1365 += local33 * local417;
							this.anInt1369 -= local417;
						}
					} else {
						while (true) {
							local40 = this.method1177(arg0, local40, local23, local44, local13.aByteArray10[this.anInt1362]);
							if (this.anInt1365 < local23) {
								return;
							}
							local417 = (this.anInt1365 - local18) / local33;
							if (local417 >= this.anInt1369) {
								this.anInt1365 -= local33 * this.anInt1369;
								this.anInt1369 = 0;
								break;
							}
							this.anInt1365 -= local33 * local417;
							this.anInt1369 -= local417;
						}
					}
				}
			}
			if (this.anInt1357 < 0) {
				this.method1146(arg0, local40, 0, local44, 0);
				if (this.anInt1365 < 0) {
					this.anInt1365 = -1;
					this.method1180();
					this.method4441();
				}
			} else {
				this.method1177(arg0, local40, local29, local44, 0);
				if (this.anInt1365 >= local29) {
					this.anInt1365 = local29;
					this.method1180();
					this.method4441();
				}
			}
		} else if (this.aBoolean97) {
			if (this.anInt1357 < 0) {
				local40 = this.method1146(arg0, arg1, local18, local44, local13.aByteArray10[this.anInt1362]);
				if (this.anInt1365 >= local18) {
					return;
				}
				this.anInt1365 = local18 + local18 - this.anInt1365 - 1;
				this.anInt1357 = -this.anInt1357;
			}
			while (true) {
				local40 = this.method1177(arg0, local40, local23, local44, local13.aByteArray10[this.anInt1370 - 1]);
				if (this.anInt1365 < local23) {
					return;
				}
				this.anInt1365 = local23 + local23 - this.anInt1365 - 1;
				this.anInt1357 = -this.anInt1357;
				local40 = this.method1146(arg0, local40, local18, local44, local13.aByteArray10[this.anInt1362]);
				if (this.anInt1365 >= local18) {
					return;
				}
				this.anInt1365 = local18 + local18 - this.anInt1365 - 1;
				this.anInt1357 = -this.anInt1357;
			}
		} else if (this.anInt1357 < 0) {
			while (true) {
				local40 = this.method1146(arg0, local40, local18, local44, local13.aByteArray10[this.anInt1370 - 1]);
				if (this.anInt1365 >= local18) {
					return;
				}
				this.anInt1365 = local23 - (local23 - 1 - this.anInt1365) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method1177(arg0, local40, local23, local44, local13.aByteArray10[this.anInt1362]);
				if (this.anInt1365 < local23) {
					return;
				}
				this.anInt1365 = local18 + (this.anInt1365 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "()Z")
	public boolean method1172() {
		return this.anInt1366 != 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "([IIIII)I")
	private int method1177(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		while (true) {
			if (this.anInt1366 > 0) {
				@Pc(7) int local7 = arg1 + this.anInt1366;
				if (local7 > arg3) {
					local7 = arg3;
				}
				this.anInt1366 += arg1;
				if (this.anInt1357 == 256 && (this.anInt1365 & 0xFF) == 0) {
					if (Static166.aBoolean261) {
						arg1 = Static301.method1164(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, this.anInt1367, this.anInt1368, local7, arg2, this);
					} else {
						arg1 = Static301.method1171(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, this.anInt1359, local7, arg2, this);
					}
				} else if (Static166.aBoolean261) {
					arg1 = Static301.method1174(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, this.anInt1367, this.anInt1368, local7, arg2, this, this.anInt1357, arg4);
				} else {
					arg1 = Static301.method1165(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, this.anInt1359, local7, arg2, this, this.anInt1357, arg4);
				}
				this.anInt1366 -= arg1;
				if (this.anInt1366 != 0) {
					return arg1;
				}
				if (!this.method1162()) {
					continue;
				}
				return arg3;
			}
			if (this.anInt1357 == 256 && (this.anInt1365 & 0xFF) == 0) {
				if (Static166.aBoolean261) {
					return Static301.method1144(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, arg3, arg2, this);
				}
				return Static301.method1176(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, arg3, arg2, this);
			}
			if (Static166.aBoolean261) {
				return Static301.method1149(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1360, this.anInt1364, arg3, arg2, this, this.anInt1357, arg4);
			}
			return Static301.method1148(((Class1_Sub10_Sub1) this.aClass1_Sub10_5).aByteArray10, arg0, this.anInt1365, arg1, this.anInt1363, arg3, arg2, this, this.anInt1357, arg4);
		}
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)V")
	private synchronized void method1178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1358 = arg0;
		this.anInt1361 = arg1;
		this.anInt1366 = 0;
		this.method1159();
	}

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "()I")
	public synchronized int method1179() {
		return this.anInt1357 < 0 ? -this.anInt1357 : this.anInt1357;
	}

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "()V")
	private void method1180() {
		if (this.anInt1366 == 0) {
			return;
		}
		if (this.anInt1358 == Integer.MIN_VALUE) {
			this.anInt1358 = 0;
		}
		this.anInt1366 = 0;
		this.method1159();
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V")
	public synchronized void method1182(@OriginalArg(0) int arg0) {
		this.anInt1369 = arg0;
	}
}
