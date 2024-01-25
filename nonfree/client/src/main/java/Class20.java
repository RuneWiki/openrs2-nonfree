import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class20 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Lclient!mt;")
	private Class164 aClass164_2;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "[I")
	public int[] anIntArray29;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Lclient!ed;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public int anInt287 = 0;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	private int anInt294 = -1;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	private int anInt298 = -1;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public int anInt295 = -1;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	public int anInt310 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Z")
	public boolean aBoolean8 = true;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	private int anInt304 = -1;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	public int anInt302 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	private int anInt306 = -1;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "I")
	public int anInt307 = -1;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Z")
	public boolean aBoolean10 = true;

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	public int anInt314 = -1;

	@OriginalMember(owner = "client!b", name = "N", descriptor = "Z")
	public boolean aBoolean11 = true;

	@OriginalMember(owner = "client!b", name = "R", descriptor = "I")
	public int anInt317 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	public int anInt316 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "I")
	private int anInt318 = -1;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	public int anInt319 = -1;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public void method216() {
		if (this.anIntArray29 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray29.length; local10 += 2) {
			if (this.anIntArray29[local10] < this.anInt302) {
				this.anInt302 = this.anIntArray29[local10];
			} else if (this.anInt317 < this.anIntArray29[local10]) {
				this.anInt317 = this.anIntArray29[local10];
			}
			if (this.anInt310 > this.anIntArray29[local10 + 1]) {
				this.anInt310 = this.anIntArray29[local10 + 1];
			} else if (this.anInt316 < this.anIntArray29[local10 + 1]) {
				this.anInt316 = this.anIntArray29[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method217(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass164_2 == null) {
			return arg0;
		} else {
			@Pc(16) Class7_Sub17 local16 = (Class7_Sub17) this.aClass164_2.method3512((long) arg1);
			return local16 == null ? arg0 : local16.aString22;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!gk;)V")
	public void method219(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3981();
			if (local5 == 0) {
				return;
			}
			this.method226(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ya;ZZ)Lclient!l;")
	public Class11 method220(@OriginalArg(0) Class51 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt307 : this.anInt295;
		@Pc(18) int local18 = arg0.anInt6714 << 29 | local11;
		@Pc(27) Class11 local27 = (Class11) this.aClass62_1.aClass126_14.method2822((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass62_1.aClass178_25.method3848(local11)) {
			@Pc(47) Class246 local47 = Static469.method5145(this.aClass62_1.aClass178_25, local11, 0);
			if (local47 != null) {
				local27 = arg0.method5308(local47);
				this.aClass62_1.aClass126_14.method2824((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ya;)Lclient!l;")
	public Class11 method223(@OriginalArg(1) Class51 arg0) {
		@Pc(25) Class11 local25 = (Class11) this.aClass62_1.aClass126_14.method2822((long) (this.anInt298 | 0x20000 | arg0.anInt6714 << 29));
		if (local25 != null) {
			return local25;
		}
		this.aClass62_1.aClass178_25.method3848(this.anInt298);
		@Pc(45) Class246 local45 = Static469.method5145(this.aClass62_1.aClass178_25, this.anInt298, 0);
		if (local45 != null) {
			local25 = arg0.method5308(local45);
			this.aClass62_1.aClass126_14.method2824((long) (this.anInt298 | 0x20000 | arg0.anInt6714 << 29), local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)I")
	public int method224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass164_2 == null) {
			return arg1;
		} else {
			@Pc(21) Class7_Sub2 local21 = (Class7_Sub2) this.aClass164_2.method3512((long) arg0);
			return local21 == null ? arg1 : local21.anInt128;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!gk;II)V")
	private void method226(@OriginalArg(0) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt295 = arg0.method3943();
		} else if (arg1 == 2) {
			this.anInt307 = arg0.method3943();
		} else if (arg1 == 3) {
			this.aString2 = arg0.method3986();
		} else if (arg1 == 4) {
			this.anInt296 = arg0.method3975();
		} else if (arg1 == 5) {
			this.anInt319 = arg0.method3975();
		} else if (arg1 == 6) {
			this.anInt287 = arg0.method3981();
		} else {
			@Pc(73) int local73;
			if (arg1 == 7) {
				local73 = arg0.method3981();
				if ((local73 & 0x2) == 2) {
					this.aBoolean9 = true;
				}
				if ((local73 & 0x1) == 0) {
					this.aBoolean11 = false;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean10 = arg0.method3981() == 1;
			} else if (arg1 == 9) {
				this.anInt304 = arg0.method3943();
				if (this.anInt304 == 65535) {
					this.anInt304 = -1;
				}
				this.anInt294 = arg0.method3943();
				if (this.anInt294 == 65535) {
					this.anInt294 = -1;
				}
				this.anInt313 = arg0.method3938();
				this.anInt308 = arg0.method3938();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(124) int local124;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean8 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString1 = arg0.method3986();
						return;
					}
					if (arg1 == 18) {
						this.anInt298 = arg0.method3943();
						return;
					}
					if (arg1 != 19) {
						if (arg1 == 20) {
							this.anInt306 = arg0.method3943();
							if (this.anInt306 == 65535) {
								this.anInt306 = -1;
							}
							this.anInt318 = arg0.method3943();
							if (this.anInt318 == 65535) {
								this.anInt318 = -1;
							}
							this.anInt286 = arg0.method3938();
							this.anInt297 = arg0.method3938();
							return;
						}
						if (arg1 == 21) {
							this.anInt311 = arg0.method3938();
						} else if (arg1 == 22) {
							this.anInt292 = arg0.method3938();
							return;
						} else if (arg1 == 249) {
							local73 = arg0.method3981();
							if (this.aClass164_2 == null) {
								local124 = Static444.method5654(local73);
								this.aClass164_2 = new Class164(local124);
							}
							for (local124 = 0; local124 < local73; local124++) {
								@Pc(279) boolean local279 = arg0.method3981() == 1;
								@Pc(283) int local283 = arg0.method3975();
								@Pc(292) Class7 local292;
								if (local279) {
									local292 = new Class7_Sub17(arg0.method3986());
								} else {
									local292 = new Class7_Sub2(arg0.method3938());
								}
								this.aClass164_2.method3508((long) local283, local292);
							}
							return;
						}
						return;
					}
					this.anInt314 = arg0.method3943();
					return;
				}
				local73 = arg0.method3981();
				this.anIntArray29 = new int[local73 * 2];
				for (local124 = 0; local124 < local73 * 2; local124++) {
					this.anIntArray29[local124] = arg0.method3961();
				}
				this.anInt299 = arg0.method3938();
				this.anInt288 = arg0.method3938();
				return;
			} else {
				this.aStringArray1[arg1 - 10] = arg0.method3986();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ac;I)Z")
	public boolean method228(@OriginalArg(0) Interface1 arg0) {
		@Pc(25) int local25;
		if (this.anInt294 == -1) {
			if (this.anInt304 == -1) {
				return true;
			}
			local25 = arg0.method4992(this.anInt304);
		} else {
			local25 = arg0.method4993(this.anInt294);
		}
		if (local25 < this.anInt313 || local25 > this.anInt308) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt318 == -1) {
			if (this.anInt306 == -1) {
				return true;
			}
			local67 = arg0.method4992(this.anInt306);
		} else {
			local67 = arg0.method4993(this.anInt318);
		}
		return this.anInt286 <= local67 && this.anInt297 >= local67;
	}
}
