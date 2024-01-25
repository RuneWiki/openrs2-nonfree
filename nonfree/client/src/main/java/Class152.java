import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class152 {

	@OriginalMember(owner = "client!hga", name = "X", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
	public int anInt4291;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
	public int anInt4294;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
	public int anInt4295;

	@OriginalMember(owner = "client!hga", name = "N", descriptor = "Lclient!fw;")
	private Class125 aClass125_13;

	@OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
	public int anInt4300;

	@OriginalMember(owner = "client!hga", name = "y", descriptor = "I")
	public int anInt4303;

	@OriginalMember(owner = "client!hga", name = "K", descriptor = "I")
	private int anInt4305;

	@OriginalMember(owner = "client!hga", name = "s", descriptor = "I")
	private int anInt4311;

	@OriginalMember(owner = "client!hga", name = "H", descriptor = "I")
	private int anInt4312;

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!hga", name = "F", descriptor = "Lclient!om;")
	public Class274 aClass274_5;

	@OriginalMember(owner = "client!hga", name = "S", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!hga", name = "P", descriptor = "I")
	public int anInt4316;

	@OriginalMember(owner = "client!hga", name = "W", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!hga", name = "R", descriptor = "I")
	public int anInt4319;

	@OriginalMember(owner = "client!hga", name = "E", descriptor = "I")
	private int anInt4320;

	@OriginalMember(owner = "client!hga", name = "v", descriptor = "I")
	public int anInt4293 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hga", name = "V", descriptor = "I")
	public int anInt4296 = -1;

	@OriginalMember(owner = "client!hga", name = "B", descriptor = "Z")
	public boolean aBoolean328 = false;

	@OriginalMember(owner = "client!hga", name = "u", descriptor = "I")
	public int anInt4301 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "Z")
	public boolean aBoolean330 = true;

	@OriginalMember(owner = "client!hga", name = "O", descriptor = "I")
	private int anInt4313 = -1;

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
	public int anInt4306 = -1;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
	private int anInt4308 = -1;

	@OriginalMember(owner = "client!hga", name = "J", descriptor = "I")
	private int anInt4302 = -1;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	public int anInt4309 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "Z")
	public boolean aBoolean329 = true;

	@OriginalMember(owner = "client!hga", name = "L", descriptor = "I")
	private int anInt4297 = -1;

	@OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
	public int anInt4318 = 0;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	public int anInt4317 = -1;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	public int anInt4323 = -1;

	@OriginalMember(owner = "client!hga", name = "Q", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray21 = new String[5];

	@OriginalMember(owner = "client!hga", name = "Z", descriptor = "I")
	public int anInt4322 = -1;

	@OriginalMember(owner = "client!hga", name = "I", descriptor = "I")
	public int anInt4324 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "Z")
	public boolean aBoolean331 = true;

	@OriginalMember(owner = "client!hga", name = "Y", descriptor = "I")
	public int anInt4325 = -1;

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	public int anInt4328 = -1;

	@OriginalMember(owner = "client!hga", name = "w", descriptor = "I")
	private int anInt4326 = -1;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!bfa;)Z")
	public boolean method3796(@OriginalArg(1) Interface2 arg0) {
		@Pc(13) int local13;
		if (this.anInt4302 == -1) {
			if (this.anInt4308 == -1) {
				return true;
			}
			local13 = arg0.method5864(this.anInt4308);
		} else {
			local13 = arg0.method5865(this.anInt4302);
		}
		if (this.anInt4312 > local13 || this.anInt4320 < local13) {
			return false;
		}
		@Pc(74) int local74;
		if (this.anInt4326 == -1) {
			if (this.anInt4297 == -1) {
				return true;
			}
			local74 = arg0.method5864(this.anInt4297);
		} else {
			local74 = arg0.method5865(this.anInt4326);
		}
		return local74 >= this.anInt4305 && local74 <= this.anInt4311;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	public void method3797() {
		if (this.anIntArray221 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray221.length; local4 += 2) {
			if (this.anInt4301 > this.anIntArray221[local4]) {
				this.anInt4301 = this.anIntArray221[local4];
			} else if (this.anIntArray221[local4] > this.anInt4293) {
				this.anInt4293 = this.anIntArray221[local4];
			}
			if (this.anIntArray221[local4 + 1] < this.anInt4309) {
				this.anInt4309 = this.anIntArray221[local4 + 1];
			} else if (this.anInt4324 < this.anIntArray221[local4 + 1]) {
				this.anInt4324 = this.anIntArray221[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)I")
	public int method3798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass125_13 == null) {
			return arg0;
		} else {
			@Pc(29) Class14_Sub30 local29 = (Class14_Sub30) this.aClass125_13.method2630((long) arg1);
			return local29 == null ? arg0 : local29.anInt6793;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ZLclient!ha;)Lclient!fia;")
	public Class45 method3800(@OriginalArg(1) Class144 arg0) {
		@Pc(28) Class45 local28 = (Class45) this.aClass274_5.aClass317_49.method7882((long) (this.anInt4313 | 0x20000 | arg0.anInt7839 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass274_5.aClass310_94.method7785(this.anInt4313);
		@Pc(49) Class266 local49 = Static697.method6466(this.aClass274_5.aClass310_94, this.anInt4313, 0);
		if (local49 != null) {
			local28 = arg0.method6964(local49, true);
			this.aClass274_5.aClass317_49.method7875((long) (this.anInt4313 | 0x20000 | arg0.anInt7839 << 29), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method3801(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass125_13 == null) {
			return arg0;
		} else {
			@Pc(17) Class14_Sub45 local17 = (Class14_Sub45) this.aClass125_13.method2630((long) arg1);
			return local17 == null ? arg0 : local17.aString109;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!jc;)V")
	public void method3802(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7695(123);
			if (local11 == 0) {
				return;
			}
			this.method3804(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method3804(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt4322 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt4317 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.aString43 = arg1.method7703(0);
		} else if (arg0 == 4) {
			this.anInt4291 = arg1.method7719();
		} else if (arg0 == 5) {
			this.anInt4328 = arg1.method7719();
		} else if (arg0 == 6) {
			this.anInt4318 = arg1.method7695(100);
		} else {
			@Pc(61) int local61;
			if (arg0 == 7) {
				local61 = arg1.method7695(100);
				if ((local61 & 0x2) == 2) {
					this.aBoolean328 = true;
				}
				if ((local61 & 0x1) == 0) {
					this.aBoolean330 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean329 = arg1.method7695(108) == 1;
			} else if (arg0 == 9) {
				this.anInt4308 = arg1.method7717(-1978450544);
				if (this.anInt4308 == 65535) {
					this.anInt4308 = -1;
				}
				this.anInt4302 = arg1.method7717(-1978450544);
				if (this.anInt4302 == 65535) {
					this.anInt4302 = -1;
				}
				this.anInt4312 = arg1.method7748();
				this.anInt4320 = arg1.method7748();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray21[arg0 - 10] = arg1.method7703(0);
			} else {
				@Pc(315) int local315;
				@Pc(338) int local338;
				if (arg0 == 15) {
					local61 = arg1.method7695(115);
					this.anIntArray221 = new int[local61 * 2];
					for (local315 = 0; local315 < local61 * 2; local315++) {
						this.anIntArray221[local315] = arg1.method7752();
					}
					this.anInt4295 = arg1.method7748();
					@Pc(456) int local456 = arg1.method7695(113);
					this.anIntArray222 = new int[local456];
					for (local338 = 0; local338 < this.anIntArray222.length; local338++) {
						this.anIntArray222[local338] = arg1.method7748();
					}
					this.aByteArray52 = new byte[local61];
					for (@Pc(482) int local482 = 0; local482 < local61; local482++) {
						this.aByteArray52[local482] = arg1.method7720();
					}
				} else if (arg0 == 16) {
					this.aBoolean331 = false;
				} else if (arg0 == 17) {
					this.aString44 = arg1.method7703(0);
				} else if (arg0 == 18) {
					this.anInt4313 = arg1.method7717(-1978450544);
				} else if (arg0 == 19) {
					this.anInt4296 = arg1.method7717(-1978450544);
				} else if (arg0 == 20) {
					this.anInt4297 = arg1.method7717(-1978450544);
					if (this.anInt4297 == 65535) {
						this.anInt4297 = -1;
					}
					this.anInt4326 = arg1.method7717(-1978450544);
					if (this.anInt4326 == 65535) {
						this.anInt4326 = -1;
					}
					this.anInt4305 = arg1.method7748();
					this.anInt4311 = arg1.method7748();
				} else if (arg0 == 21) {
					this.anInt4319 = arg1.method7748();
				} else if (arg0 == 22) {
					this.anInt4303 = arg1.method7748();
				} else if (arg0 == 23) {
					this.anInt4323 = arg1.method7695(99);
					this.anInt4306 = arg1.method7695(109);
					this.anInt4325 = arg1.method7695(125);
				} else if (arg0 == 24) {
					this.anInt4294 = arg1.method7752();
					this.anInt4316 = arg1.method7752();
				} else if (arg0 == 249) {
					local61 = arg1.method7695(117);
					if (this.aClass125_13 == null) {
						local315 = Static255.method4294(local61);
						this.aClass125_13 = new Class125(local315);
					}
					for (local315 = 0; local315 < local61; local315++) {
						@Pc(334) boolean local334 = arg1.method7695(94) == 1;
						local338 = arg1.method7719();
						@Pc(347) Class14 local347;
						if (local334) {
							local347 = new Class14_Sub45(arg1.method7703(0));
						} else {
							local347 = new Class14_Sub30(arg1.method7748());
						}
						this.aClass125_13.method2626(local347, (long) local338);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!ha;ZZ)Lclient!fia;")
	public Class45 method3805(@OriginalArg(0) Class144 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg1 ? this.anInt4317 : this.anInt4322;
		@Pc(25) int local25 = arg0.anInt7839 << 29 | local12;
		@Pc(34) Class45 local34 = (Class45) this.aClass274_5.aClass317_49.method7882((long) local25);
		if (local34 != null) {
			return local34;
		} else if (this.aClass274_5.aClass310_94.method7785(local12)) {
			@Pc(56) Class266 local56 = Static697.method6466(this.aClass274_5.aClass310_94, local12, 0);
			if (local56 != null) {
				local34 = arg0.method6964(local56, true);
				this.aClass274_5.aClass317_49.method7875((long) local25, local34);
			}
			return local34;
		} else {
			return null;
		}
	}
}
