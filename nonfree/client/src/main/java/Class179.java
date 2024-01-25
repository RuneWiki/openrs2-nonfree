import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class179 {

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
	public int anInt5310;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	private int anInt5322;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
	private int anInt5326;

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public int anInt5328;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
	private int anInt5330;

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
	public int anInt5335;

	@OriginalMember(owner = "client!jo", name = "O", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!jo", name = "Q", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
	public int anInt5339;

	@OriginalMember(owner = "client!jo", name = "T", descriptor = "I")
	public int anInt5341;

	@OriginalMember(owner = "client!jo", name = "V", descriptor = "I")
	public int anInt5343;

	@OriginalMember(owner = "client!jo", name = "W", descriptor = "Lclient!ib;")
	public Class154 aClass154_4;

	@OriginalMember(owner = "client!jo", name = "Y", descriptor = "Lclient!baa;")
	private Class25 aClass25_25;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	private int anInt5309 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	private int anInt5308 = -1;

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "Z")
	public boolean aBoolean390 = true;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
	private int anInt5327 = -1;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "Z")
	public boolean aBoolean391 = false;

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
	public int anInt5318 = -1;

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
	private int anInt5329 = -1;

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
	public int anInt5333 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
	public int anInt5332 = 0;

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
	public int anInt5336 = -1;

	@OriginalMember(owner = "client!jo", name = "S", descriptor = "I")
	public int anInt5340 = -1;

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Z")
	public boolean aBoolean389 = true;

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
	public int anInt5314 = -1;

	@OriginalMember(owner = "client!jo", name = "U", descriptor = "I")
	public int anInt5342 = -1;

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
	public int anInt5334 = -1;

	@OriginalMember(owner = "client!jo", name = "N", descriptor = "I")
	public int anInt5338 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
	public int anInt5337 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
	public int anInt5331 = -1;

	@OriginalMember(owner = "client!jo", name = "X", descriptor = "I")
	private int anInt5344 = -1;

	@OriginalMember(owner = "client!jo", name = "Z", descriptor = "I")
	public int anInt5345 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
	public void method4531() {
		if (this.anIntArray294 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray294.length; local6 += 2) {
			if (this.anInt5338 > this.anIntArray294[local6]) {
				this.anInt5338 = this.anIntArray294[local6];
			} else if (this.anInt5333 < this.anIntArray294[local6]) {
				this.anInt5333 = this.anIntArray294[local6];
			}
			if (this.anInt5337 > this.anIntArray294[local6 + 1]) {
				this.anInt5337 = this.anIntArray294[local6 + 1];
			} else if (this.anInt5345 < this.anIntArray294[local6 + 1]) {
				this.anInt5345 = this.anIntArray294[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLclient!mm;)Z")
	public boolean method4532(@OriginalArg(1) Interface16 arg0) {
		@Pc(20) int local20;
		if (this.anInt5309 == -1) {
			if (this.anInt5327 == -1) {
				return true;
			}
			local20 = arg0.method6938(this.anInt5327);
		} else {
			local20 = arg0.method6939(this.anInt5309);
		}
		if (this.anInt5322 > local20 || this.anInt5330 < local20) {
			return false;
		}
		@Pc(52) int local52;
		if (this.anInt5344 == -1) {
			if (this.anInt5329 == -1) {
				return true;
			}
			local52 = arg0.method6938(this.anInt5329);
		} else {
			local52 = arg0.method6939(this.anInt5344);
		}
		return this.anInt5312 <= local52 && this.anInt5326 >= local52;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ha;Z)Lclient!fd;")
	public Class103 method4533(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt5318 : this.anInt5340;
		@Pc(24) int local24 = arg0.anInt7008 << 29 | local11;
		@Pc(33) Class103 local33 = (Class103) this.aClass154_4.aClass136_31.method3134((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass154_4.aClass343_115.method8138(local11)) {
			@Pc(53) Class251 local53 = Static656.method6331(this.aClass154_4.aClass343_115, local11, 0);
			if (local53 != null) {
				local33 = arg0.method6106(local53, true);
				this.aClass154_4.aClass136_31.method3135(local33, (long) local24);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method4534(@OriginalArg(1) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5340 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt5318 = arg0.method5610();
		} else if (arg1 == 3) {
			this.aString42 = arg0.method5607();
		} else if (arg1 == 4) {
			this.anInt5335 = arg0.method5604();
		} else if (arg1 == 5) {
			this.anInt5342 = arg0.method5604();
		} else if (arg1 == 6) {
			this.anInt5332 = arg0.method5633();
		} else {
			@Pc(61) int local61;
			if (arg1 == 7) {
				local61 = arg0.method5633();
				if ((local61 & 0x1) == 0) {
					this.aBoolean389 = false;
				}
				if ((local61 & 0x2) == 2) {
					this.aBoolean391 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean388 = arg0.method5633() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt5327 = arg0.method5610();
				if (this.anInt5327 == 65535) {
					this.anInt5327 = -1;
				}
				this.anInt5309 = arg0.method5610();
				if (this.anInt5309 == 65535) {
					this.anInt5309 = -1;
				}
				this.anInt5322 = arg0.method5585();
				this.anInt5330 = arg0.method5585();
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(224) int local224;
				@Pc(247) int local247;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 != 18) {
								if (arg1 == 19) {
									this.anInt5334 = arg0.method5610();
									return;
								}
								if (arg1 == 20) {
									this.anInt5329 = arg0.method5610();
									if (this.anInt5329 == 65535) {
										this.anInt5329 = -1;
									}
									this.anInt5344 = arg0.method5610();
									if (this.anInt5344 == 65535) {
										this.anInt5344 = -1;
									}
									this.anInt5312 = arg0.method5585();
									this.anInt5326 = arg0.method5585();
									return;
								}
								if (arg1 != 21) {
									if (arg1 == 22) {
										this.anInt5328 = arg0.method5585();
										return;
									}
									if (arg1 != 23) {
										if (arg1 == 24) {
											this.anInt5339 = arg0.method5624();
											this.anInt5343 = arg0.method5624();
										} else if (arg1 == 249) {
											local61 = arg0.method5633();
											if (this.aClass25_25 == null) {
												local224 = Static533.method1203(local61);
												this.aClass25_25 = new Class25(local224);
											}
											for (local224 = 0; local224 < local61; local224++) {
												@Pc(243) boolean local243 = arg0.method5633() == 1;
												local247 = arg0.method5604();
												@Pc(258) Class3 local258;
												if (local243) {
													local258 = new Class3_Sub14(arg0.method5607());
												} else {
													local258 = new Class3_Sub51(arg0.method5585());
												}
												this.aClass25_25.method434((long) local247, local258);
											}
											return;
										}
										return;
									}
									this.anInt5331 = arg0.method5633();
									this.anInt5336 = arg0.method5633();
									this.anInt5314 = arg0.method5633();
									return;
								}
								this.anInt5321 = arg0.method5585();
								return;
							}
							this.anInt5308 = arg0.method5610();
							return;
						}
						this.aString43 = arg0.method5607();
						return;
					}
					this.aBoolean390 = false;
					return;
				}
				local61 = arg0.method5633();
				this.anIntArray294 = new int[local61 * 2];
				for (local224 = 0; local224 < local61 * 2; local224++) {
					this.anIntArray294[local224] = arg0.method5624();
				}
				this.anInt5310 = arg0.method5585();
				@Pc(378) int local378 = arg0.method5633();
				this.anIntArray295 = new int[local378];
				for (local247 = 0; local247 < this.anIntArray295.length; local247++) {
					this.anIntArray295[local247] = arg0.method5585();
				}
				this.aByteArray43 = new byte[local61];
				for (@Pc(405) int local405 = 0; local405 < local61; local405++) {
					this.aByteArray43[local405] = arg0.method5619();
				}
				return;
			} else {
				this.aStringArray40[arg1 - 10] = arg0.method5607();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZ)I")
	public int method4536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass25_25 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub51 local21 = (Class3_Sub51) this.aClass25_25.method426((long) arg0);
			return local21 == null ? arg1 : local21.anInt9787;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!ha;)Lclient!fd;")
	public Class103 method4537(@OriginalArg(1) Class82 arg0) {
		@Pc(25) Class103 local25 = (Class103) this.aClass154_4.aClass136_31.method3134((long) (this.anInt5308 | 0x20000 | arg0.anInt7008 << 29));
		if (local25 != null) {
			return local25;
		}
		this.aClass154_4.aClass343_115.method8138(this.anInt5308);
		@Pc(45) Class251 local45 = Static656.method6331(this.aClass154_4.aClass343_115, this.anInt5308, 0);
		if (local45 != null) {
			local25 = arg0.method6106(local45, true);
			this.aClass154_4.aClass136_31.method3135(local25, (long) (this.anInt5308 | 0x20000 | arg0.anInt7008 << 29));
		}
		return local25;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4538(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass25_25 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub14 local16 = (Class3_Sub14) this.aClass25_25.method426((long) arg1);
			return local16 == null ? arg0 : local16.aString16;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method4539(@OriginalArg(0) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method4534(arg0, local5);
		}
	}
}
