import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	public int anInt1319;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	private int anInt1322;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
	private int anInt1323;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	public int anInt1326;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public int anInt1328;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	public int anInt1329;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	public int anInt1331;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	public int anInt1332;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	private final int anInt1330;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	private final int anInt1325;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
	private int anInt1320;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	private int anInt1321;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	private int anInt1327;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public int anInt1324;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!vb;II)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.aClass1_Sub9_5 = arg0;
		this.anInt1330 = arg0.anInt3157;
		this.anInt1325 = arg0.anInt3156;
		this.aBoolean39 = arg0.aBoolean121;
		this.anInt1320 = arg1;
		this.anInt1321 = arg2;
		this.anInt1327 = 8192;
		this.anInt1324 = 0;
		this.method983();
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!vb;III)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super.aClass1_Sub9_5 = arg0;
		this.anInt1330 = arg0.anInt3157;
		this.anInt1325 = arg0.anInt3156;
		this.aBoolean39 = arg0.aBoolean121;
		this.anInt1320 = arg1;
		this.anInt1321 = arg2;
		this.anInt1327 = arg3;
		this.anInt1324 = 0;
		this.method983();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()Lclient!ja;")
	@Override
	public Class1_Sub1 method1357() {
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1321 == 0 && this.anInt1322 == 0) {
			this.method1358(arg2);
			return;
		}
		@Pc(13) Class1_Sub9_Sub1 local13 = (Class1_Sub9_Sub1) super.aClass1_Sub9_5;
		@Pc(18) int local18 = this.anInt1330 << 8;
		@Pc(23) int local23 = this.anInt1325 << 8;
		@Pc(29) int local29 = local13.aByteArray39.length << 8;
		@Pc(33) int local33 = local23 - local18;
		if (local33 <= 0) {
			this.anInt1323 = 0;
		}
		@Pc(40) int local40 = arg1;
		@Pc(44) int local44 = arg2 + arg1;
		if (this.anInt1324 < 0) {
			if (this.anInt1320 <= 0) {
				this.method999();
				this.method2220();
				return;
			}
			this.anInt1324 = 0;
		}
		if (this.anInt1324 >= local29) {
			if (this.anInt1320 >= 0) {
				this.method999();
				this.method2220();
				return;
			}
			this.anInt1324 = local29 - 1;
		}
		if (this.anInt1323 >= 0) {
			if (this.anInt1323 > 0) {
				if (this.aBoolean39) {
					label130: {
						if (this.anInt1320 < 0) {
							local40 = this.method975(arg0, arg1, local18, local44, local13.aByteArray39[this.anInt1330]);
							if (this.anInt1324 >= local18) {
								return;
							}
							this.anInt1324 = local18 + local18 - this.anInt1324 - 1;
							this.anInt1320 = -this.anInt1320;
							if (--this.anInt1323 == 0) {
								break label130;
							}
						}
						do {
							local40 = this.method995(arg0, local40, local23, local44, local13.aByteArray39[this.anInt1325 - 1]);
							if (this.anInt1324 < local23) {
								return;
							}
							this.anInt1324 = local23 + local23 - this.anInt1324 - 1;
							this.anInt1320 = -this.anInt1320;
							if (--this.anInt1323 == 0) {
								break;
							}
							local40 = this.method975(arg0, local40, local18, local44, local13.aByteArray39[this.anInt1330]);
							if (this.anInt1324 >= local18) {
								return;
							}
							this.anInt1324 = local18 + local18 - this.anInt1324 - 1;
							this.anInt1320 = -this.anInt1320;
						} while (--this.anInt1323 != 0);
					}
				} else {
					@Pc(416) int local416;
					if (this.anInt1320 < 0) {
						while (true) {
							local40 = this.method975(arg0, local40, local18, local44, local13.aByteArray39[this.anInt1325 - 1]);
							if (this.anInt1324 >= local18) {
								return;
							}
							local416 = (local23 - this.anInt1324 - 1) / local33;
							if (local416 >= this.anInt1323) {
								this.anInt1324 += local33 * this.anInt1323;
								this.anInt1323 = 0;
								break;
							}
							this.anInt1324 += local33 * local416;
							this.anInt1323 -= local416;
						}
					} else {
						while (true) {
							local40 = this.method995(arg0, local40, local23, local44, local13.aByteArray39[this.anInt1330]);
							if (this.anInt1324 < local23) {
								return;
							}
							local416 = (this.anInt1324 - local18) / local33;
							if (local416 >= this.anInt1323) {
								this.anInt1324 -= local33 * this.anInt1323;
								this.anInt1323 = 0;
								break;
							}
							this.anInt1324 -= local33 * local416;
							this.anInt1323 -= local416;
						}
					}
				}
			}
			if (this.anInt1320 < 0) {
				this.method975(arg0, local40, 0, local44, 0);
				if (this.anInt1324 < 0) {
					this.anInt1324 = -1;
					this.method999();
					this.method2220();
					return;
				}
			} else {
				this.method995(arg0, local40, local29, local44, 0);
				if (this.anInt1324 >= local29) {
					this.anInt1324 = local29;
					this.method999();
					this.method2220();
				}
			}
		} else if (this.aBoolean39) {
			if (this.anInt1320 < 0) {
				local40 = this.method975(arg0, arg1, local18, local44, local13.aByteArray39[this.anInt1330]);
				if (this.anInt1324 >= local18) {
					return;
				}
				this.anInt1324 = local18 + local18 - this.anInt1324 - 1;
				this.anInt1320 = -this.anInt1320;
			}
			while (true) {
				local40 = this.method995(arg0, local40, local23, local44, local13.aByteArray39[this.anInt1325 - 1]);
				if (this.anInt1324 < local23) {
					return;
				}
				this.anInt1324 = local23 + local23 - this.anInt1324 - 1;
				this.anInt1320 = -this.anInt1320;
				local40 = this.method975(arg0, local40, local18, local44, local13.aByteArray39[this.anInt1330]);
				if (this.anInt1324 >= local18) {
					return;
				}
				this.anInt1324 = local18 + local18 - this.anInt1324 - 1;
				this.anInt1320 = -this.anInt1320;
			}
		} else if (this.anInt1320 < 0) {
			while (true) {
				local40 = this.method975(arg0, local40, local18, local44, local13.aByteArray39[this.anInt1325 - 1]);
				if (this.anInt1324 >= local18) {
					return;
				}
				this.anInt1324 = local23 - (local23 - 1 - this.anInt1324) % local33 - 1;
			}
		} else {
			while (true) {
				local40 = this.method995(arg0, local40, local23, local44, local13.aByteArray39[this.anInt1330]);
				if (this.anInt1324 < local23) {
					return;
				}
				this.anInt1324 = local18 + (this.anInt1324 - local18) % local33;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "()I")
	public synchronized int method967() {
		return this.anInt1321 == Integer.MIN_VALUE ? 0 : this.anInt1321;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
	private synchronized void method968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1321 = arg0;
		this.anInt1327 = arg1;
		this.anInt1322 = 0;
		this.method983();
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "()I")
	@Override
	public int method1361() {
		@Pc(6) int local6 = this.anInt1326 * 3 >> 6;
		local6 = (local6 ^ local6 >> 31) + (local6 >>> 31);
		if (this.anInt1323 == 0) {
			local6 -= local6 * this.anInt1324 / (((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39.length << 8);
		} else if (this.anInt1323 >= 0) {
			local6 -= local6 * this.anInt1330 / ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39.length;
		}
		return local6 > 255 ? 255 : local6;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "()Lclient!ja;")
	@Override
	public Class1_Sub1 method1362() {
		return null;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "()Z")
	private boolean method973() {
		@Pc(2) int local2 = this.anInt1321;
		@Pc(10) int local10;
		@Pc(8) int local8;
		if (local2 == Integer.MIN_VALUE) {
			local8 = 0;
			local10 = 0;
			local2 = 0;
		} else {
			local10 = Static133.method993(local2, this.anInt1327);
			local8 = Static133.method971(local2, this.anInt1327);
		}
		if (this.anInt1326 != local2 || this.anInt1332 != local10 || this.anInt1319 != local8) {
			if (this.anInt1326 < local2) {
				this.anInt1329 = 1;
				this.anInt1322 = local2 - this.anInt1326;
			} else if (this.anInt1326 > local2) {
				this.anInt1329 = -1;
				this.anInt1322 = this.anInt1326 - local2;
			} else {
				this.anInt1329 = 0;
			}
			if (this.anInt1332 < local10) {
				this.anInt1328 = 1;
				if (this.anInt1322 == 0 || this.anInt1322 > local10 - this.anInt1332) {
					this.anInt1322 = local10 - this.anInt1332;
				}
			} else if (this.anInt1332 > local10) {
				this.anInt1328 = -1;
				if (this.anInt1322 == 0 || this.anInt1322 > this.anInt1332 - local10) {
					this.anInt1322 = this.anInt1332 - local10;
				}
			} else {
				this.anInt1328 = 0;
			}
			if (this.anInt1319 < local8) {
				this.anInt1331 = 1;
				if (this.anInt1322 == 0 || this.anInt1322 > local8 - this.anInt1319) {
					this.anInt1322 = local8 - this.anInt1319;
				}
			} else if (this.anInt1319 > local8) {
				this.anInt1331 = -1;
				if (this.anInt1322 == 0 || this.anInt1322 > this.anInt1319 - local8) {
					this.anInt1322 = this.anInt1319 - local8;
				}
			} else {
				this.anInt1331 = 0;
			}
			return false;
		} else if (this.anInt1321 == Integer.MIN_VALUE) {
			this.anInt1321 = 0;
			this.anInt1326 = this.anInt1332 = this.anInt1319 = 0;
			this.method2220();
			return true;
		} else {
			this.method983();
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIIII)I")
	private int method975(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1322 <= 0) {
				if (this.anInt1320 == -256 && (this.anInt1324 & 0xFF) == 0) {
					if (Static69.aBoolean49) {
						return Static133.method979(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, arg3, arg2, this);
					}
					return Static133.method969(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, arg3, arg2, this);
				}
				if (Static69.aBoolean49) {
					return Static133.method996(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, arg3, arg2, this, this.anInt1320, arg4);
				}
				return Static133.method1004(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, arg3, arg2, this, this.anInt1320, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1322;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1322 += arg1;
			if (this.anInt1320 == -256 && (this.anInt1324 & 0xFF) == 0) {
				if (Static69.aBoolean49) {
					arg1 = Static133.method982(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, this.anInt1328, this.anInt1331, local5, arg2, this);
				} else {
					arg1 = Static133.method989(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, this.anInt1329, local5, arg2, this);
				}
			} else if (Static69.aBoolean49) {
				arg1 = Static133.method965(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, this.anInt1328, this.anInt1331, local5, arg2, this, this.anInt1320, arg4);
			} else {
				arg1 = Static133.method984(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, this.anInt1329, local5, arg2, this, this.anInt1320, arg4);
			}
			this.anInt1322 -= arg1;
			if (this.anInt1322 != 0) {
				return arg1;
			}
		} while (!this.method973());
		return arg3;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "()I")
	public synchronized int method976() {
		return this.anInt1327 < 0 ? -1 : this.anInt1327;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	public synchronized void method977(@OriginalArg(0) int arg0) {
		this.method968(arg0 << 6, this.method976());
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "()Z")
	public boolean method978() {
		return this.anInt1322 != 0;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public synchronized void method980(@OriginalArg(0) int arg0) {
		this.anInt1323 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)V")
	public synchronized void method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method1003(arg0, arg1, this.method976());
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1358(@OriginalArg(0) int arg0) {
		if (this.anInt1322 > 0) {
			if (arg0 >= this.anInt1322) {
				if (this.anInt1321 == Integer.MIN_VALUE) {
					this.anInt1321 = 0;
					this.anInt1326 = this.anInt1332 = this.anInt1319 = 0;
					this.method2220();
					arg0 = this.anInt1322;
				}
				this.anInt1322 = 0;
				this.method983();
			} else {
				this.anInt1326 += this.anInt1329 * arg0;
				this.anInt1332 += this.anInt1328 * arg0;
				this.anInt1319 += this.anInt1331 * arg0;
				this.anInt1322 -= arg0;
			}
		}
		@Pc(71) Class1_Sub9_Sub1 local71 = (Class1_Sub9_Sub1) super.aClass1_Sub9_5;
		@Pc(76) int local76 = this.anInt1330 << 8;
		@Pc(81) int local81 = this.anInt1325 << 8;
		@Pc(87) int local87 = local71.aByteArray39.length << 8;
		@Pc(91) int local91 = local81 - local76;
		if (local91 <= 0) {
			this.anInt1323 = 0;
		}
		if (this.anInt1324 < 0) {
			if (this.anInt1320 <= 0) {
				this.method999();
				this.method2220();
				return;
			}
			this.anInt1324 = 0;
		}
		if (this.anInt1324 >= local87) {
			if (this.anInt1320 >= 0) {
				this.method999();
				this.method2220();
				return;
			}
			this.anInt1324 = local87 - 1;
		}
		this.anInt1324 += this.anInt1320 * arg0;
		if (this.anInt1323 >= 0) {
			if (this.anInt1323 > 0) {
				if (this.aBoolean39) {
					label125: {
						if (this.anInt1320 < 0) {
							if (this.anInt1324 >= local76) {
								return;
							}
							this.anInt1324 = local76 + local76 - this.anInt1324 - 1;
							this.anInt1320 = -this.anInt1320;
							if (--this.anInt1323 == 0) {
								break label125;
							}
						}
						do {
							if (this.anInt1324 < local81) {
								return;
							}
							this.anInt1324 = local81 + local81 - this.anInt1324 - 1;
							this.anInt1320 = -this.anInt1320;
							if (--this.anInt1323 == 0) {
								break;
							}
							if (this.anInt1324 >= local76) {
								return;
							}
							this.anInt1324 = local76 + local76 - this.anInt1324 - 1;
							this.anInt1320 = -this.anInt1320;
						} while (--this.anInt1323 != 0);
					}
				} else {
					@Pc(361) int local361;
					if (this.anInt1320 < 0) {
						if (this.anInt1324 >= local76) {
							return;
						}
						local361 = (local81 - this.anInt1324 - 1) / local91;
						if (local361 < this.anInt1323) {
							this.anInt1324 += local91 * local361;
							this.anInt1323 -= local361;
							return;
						}
						this.anInt1324 += local91 * this.anInt1323;
						this.anInt1323 = 0;
					} else if (this.anInt1324 >= local81) {
						local361 = (this.anInt1324 - local76) / local91;
						if (local361 < this.anInt1323) {
							this.anInt1324 -= local91 * local361;
							this.anInt1323 -= local361;
							return;
						}
						this.anInt1324 -= local91 * this.anInt1323;
						this.anInt1323 = 0;
					} else {
						return;
					}
				}
			}
			if (this.anInt1320 < 0) {
				if (this.anInt1324 < 0) {
					this.anInt1324 = -1;
					this.method999();
					this.method2220();
					return;
				}
			} else if (this.anInt1324 >= local87) {
				this.anInt1324 = local87;
				this.method999();
				this.method2220();
			}
		} else if (this.aBoolean39) {
			if (this.anInt1320 < 0) {
				if (this.anInt1324 >= local76) {
					return;
				}
				this.anInt1324 = local76 + local76 - this.anInt1324 - 1;
				this.anInt1320 = -this.anInt1320;
			}
			while (this.anInt1324 >= local81) {
				this.anInt1324 = local81 + local81 - this.anInt1324 - 1;
				this.anInt1320 = -this.anInt1320;
				if (this.anInt1324 >= local76) {
					return;
				}
				this.anInt1324 = local76 + local76 - this.anInt1324 - 1;
				this.anInt1320 = -this.anInt1320;
			}
		} else if (this.anInt1320 < 0) {
			if (this.anInt1324 < local76) {
				this.anInt1324 = local81 - (local81 - 1 - this.anInt1324) % local91 - 1;
			}
		} else if (this.anInt1324 >= local81) {
			this.anInt1324 = local76 + (this.anInt1324 - local76) % local91;
		}
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "()V")
	private void method983() {
		this.anInt1326 = this.anInt1321;
		this.anInt1332 = Static133.method993(this.anInt1321, this.anInt1327);
		this.anInt1319 = Static133.method971(this.anInt1321, this.anInt1327);
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public synchronized void method985(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method987();
			this.method2220();
		} else if (this.anInt1332 == 0 && this.anInt1319 == 0) {
			this.anInt1322 = 0;
			this.anInt1321 = 0;
			this.anInt1326 = 0;
			this.method2220();
		} else {
			@Pc(31) int local31 = -this.anInt1326;
			if (this.anInt1326 > local31) {
				local31 = this.anInt1326;
			}
			if (-this.anInt1332 > local31) {
				local31 = -this.anInt1332;
			}
			if (this.anInt1332 > local31) {
				local31 = this.anInt1332;
			}
			if (-this.anInt1319 > local31) {
				local31 = -this.anInt1319;
			}
			if (this.anInt1319 > local31) {
				local31 = this.anInt1319;
			}
			if (arg0 > local31) {
				arg0 = local31;
			}
			this.anInt1322 = arg0;
			this.anInt1321 = Integer.MIN_VALUE;
			this.anInt1329 = -this.anInt1326 / arg0;
			this.anInt1328 = -this.anInt1332 / arg0;
			this.anInt1331 = -this.anInt1319 / arg0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	private synchronized void method987() {
		this.method968(0, this.method976());
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
	@Override
	public int method1360() {
		return this.anInt1321 == 0 && this.anInt1322 == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "()I")
	public synchronized int method990() {
		return this.anInt1320 < 0 ? -this.anInt1320 : this.anInt1320;
	}

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "()Z")
	public boolean method994() {
		return this.anInt1324 < 0 || this.anInt1324 >= ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39.length << 8;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "([IIIII)I")
	private int method995(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		do {
			if (this.anInt1322 <= 0) {
				if (this.anInt1320 == 256 && (this.anInt1324 & 0xFF) == 0) {
					if (Static69.aBoolean49) {
						return Static133.method974(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, arg3, arg2, this);
					}
					return Static133.method970(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, arg3, arg2, this);
				}
				if (Static69.aBoolean49) {
					return Static133.method998(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, arg3, arg2, this, this.anInt1320, arg4);
				}
				return Static133.method992(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, arg3, arg2, this, this.anInt1320, arg4);
			}
			@Pc(5) int local5 = arg1 + this.anInt1322;
			if (local5 > arg3) {
				local5 = arg3;
			}
			this.anInt1322 += arg1;
			if (this.anInt1320 == 256 && (this.anInt1324 & 0xFF) == 0) {
				if (Static69.aBoolean49) {
					arg1 = Static133.method991(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, this.anInt1328, this.anInt1331, local5, arg2, this);
				} else {
					arg1 = Static133.method972(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, this.anInt1329, local5, arg2, this);
				}
			} else if (Static69.aBoolean49) {
				arg1 = Static133.method997(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1332, this.anInt1319, this.anInt1328, this.anInt1331, local5, arg2, this, this.anInt1320, arg4);
			} else {
				arg1 = Static133.method966(((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39, arg0, this.anInt1324, arg1, this.anInt1326, this.anInt1329, local5, arg2, this, this.anInt1320, arg4);
			}
			this.anInt1322 -= arg1;
			if (this.anInt1322 != 0) {
				return arg1;
			}
		} while (!this.method973());
		return arg3;
	}

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "()V")
	private void method999() {
		if (this.anInt1322 == 0) {
			return;
		}
		if (this.anInt1321 == Integer.MIN_VALUE) {
			this.anInt1321 = 0;
		}
		this.anInt1322 = 0;
		this.method983();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public synchronized void method1000() {
		this.anInt1320 = (this.anInt1320 ^ this.anInt1320 >> 31) + (this.anInt1320 >>> 31);
		this.anInt1320 = -this.anInt1320;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
	public synchronized void method1001(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = ((Class1_Sub9_Sub1) super.aClass1_Sub9_5).aByteArray39.length << 8;
		if (arg0 < -1) {
			arg0 = -1;
		}
		if (arg0 > local7) {
			arg0 = local7;
		}
		this.anInt1324 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V")
	public synchronized void method1002(@OriginalArg(0) int arg0) {
		if (this.anInt1320 < 0) {
			this.anInt1320 = -arg0;
		} else {
			this.anInt1320 = arg0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public synchronized void method1003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			this.method968(arg1, arg2);
			return;
		}
		@Pc(10) int local10 = Static133.method993(arg1, arg2);
		@Pc(14) int local14 = Static133.method971(arg1, arg2);
		if (this.anInt1332 == local10 && this.anInt1319 == local14) {
			this.anInt1322 = 0;
			return;
		}
		@Pc(31) int local31 = arg1 - this.anInt1326;
		if (this.anInt1326 - arg1 > local31) {
			local31 = this.anInt1326 - arg1;
		}
		if (local10 - this.anInt1332 > local31) {
			local31 = local10 - this.anInt1332;
		}
		if (this.anInt1332 - local10 > local31) {
			local31 = this.anInt1332 - local10;
		}
		if (local14 - this.anInt1319 > local31) {
			local31 = local14 - this.anInt1319;
		}
		if (this.anInt1319 - local14 > local31) {
			local31 = this.anInt1319 - local14;
		}
		if (arg0 > local31) {
			arg0 = local31;
		}
		this.anInt1322 = arg0;
		this.anInt1321 = arg1;
		this.anInt1327 = arg2;
		this.anInt1329 = (arg1 - this.anInt1326) / arg0;
		this.anInt1328 = (local10 - this.anInt1332) / arg0;
		this.anInt1331 = (local14 - this.anInt1319) / arg0;
	}
}
