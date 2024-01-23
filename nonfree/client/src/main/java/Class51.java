import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class51 {

	@OriginalMember(owner = "client!en", name = "z", descriptor = "I")
	private int anInt1357;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "Lclient!eo;")
	private Class52 aClass52_2;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "Lclient!ul;")
	private Class4_Sub3_Sub1_Sub2 aClass4_Sub3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "Lclient!uk;")
	private Class178 aClass178_5 = new Class178();

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!uk;")
	private Class178 aClass178_6 = new Class178();

	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!uk;")
	private Class178 aClass178_7 = new Class178();

	@OriginalMember(owner = "client!en", name = "y", descriptor = "Lclient!uk;")
	private Class178 aClass178_8 = new Class178();

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Lclient!fd;")
	private Class4_Sub10 aClass4_Sub10_1 = new Class4_Sub10(4);

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	public volatile int anInt1358 = 0;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	public volatile int anInt1359 = 0;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "Lclient!fd;")
	private Class4_Sub10 aClass4_Sub10_2 = new Class4_Sub10(8);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	private int method1080() {
		return this.aClass178_7.method4371() + this.aClass178_8.method4371();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public void method1081() {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub10_1.anInt5713 = 0;
			this.aClass4_Sub10_1.method4618(7);
			this.aClass4_Sub10_1.method4639(0);
			this.aClass52_2.method1107(this.aClass4_Sub10_1.aByteArray71, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass52_2 = null;
			this.anInt1358++;
			this.anInt1359 = -2;
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Z")
	public boolean method1083() {
		return this.method1092() >= 20;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public void method1086() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method1104();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!eo;Z)V")
	public void method1087(@OriginalArg(1) Class52 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass52_2 != null) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(15) Exception local15) {
			}
			this.aClass52_2 = null;
		}
		this.aClass52_2 = arg0;
		this.method1096();
		this.method1093(arg1);
		this.aClass4_Sub3_Sub1_Sub2_1 = null;
		this.aClass4_Sub10_2.anInt5713 = 0;
		while (true) {
			@Pc(41) Class4_Sub3_Sub1_Sub2 local41 = (Class4_Sub3_Sub1_Sub2) this.aClass178_6.method4373();
			if (local41 == null) {
				while (true) {
					@Pc(64) Class4_Sub3_Sub1_Sub2 local64 = (Class4_Sub3_Sub1_Sub2) this.aClass178_8.method4373();
					if (local64 == null) {
						if (this.aByte2 != 0) {
							try {
								this.aClass4_Sub10_1.anInt5713 = 0;
								this.aClass4_Sub10_1.method4618(4);
								this.aClass4_Sub10_1.method4618(this.aByte2);
								this.aClass4_Sub10_1.method4668(0);
								this.aClass52_2.method1107(this.aClass4_Sub10_1.aByteArray71, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									this.aClass52_2.method1103();
								} catch (@Pc(119) Exception local119) {
								}
								this.aClass52_2 = null;
								this.anInt1358++;
								this.anInt1359 = -2;
							}
						}
						this.anInt1357 = 0;
						this.aLong54 = Static101.method1677();
						return;
					}
					this.aClass178_7.method4370(local64);
				}
			}
			this.aClass178_5.method4370(local41);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BIZII)Lclient!ul;")
	public Class4_Sub3_Sub1_Sub2 method1088(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg3 + (arg1 << 16));
		@Pc(20) Class4_Sub3_Sub1_Sub2 local20 = new Class4_Sub3_Sub1_Sub2();
		local20.aByte22 = arg0;
		local20.aBoolean364 = arg2;
		local20.aLong218 = local16;
		if (arg2) {
			if (this.method1092() >= 20) {
				throw new RuntimeException();
			}
			this.aClass178_5.method4370(local20);
		} else if (this.method1080() < 20) {
			this.aClass178_7.method4370(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	public void method1090() {
		if (this.aClass52_2 != null) {
			this.aClass52_2.method1103();
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
	public void method1091() {
		try {
			this.aClass52_2.method1103();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass52_2 = null;
		this.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1359 = -1;
		this.anInt1358++;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
	public int method1092() {
		return this.aClass178_5.method4371() + this.aClass178_6.method4371();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V")
	public void method1093(@OriginalArg(1) boolean arg0) {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub10_1.anInt5713 = 0;
			this.aClass4_Sub10_1.method4618(arg0 ? 2 : 3);
			this.aClass4_Sub10_1.method4639(0);
			this.aClass52_2.method1107(this.aClass4_Sub10_1.aByteArray71, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt1358++;
			this.aClass52_2 = null;
			this.anInt1359 = -2;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z")
	public boolean method1095() {
		return this.method1080() >= 20;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	private void method1096() {
		if (this.aClass52_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub10_1.anInt5713 = 0;
			this.aClass4_Sub10_1.method4618(6);
			this.aClass4_Sub10_1.method4639(3);
			this.aClass52_2.method1107(this.aClass4_Sub10_1.aByteArray71, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass52_2 = null;
			this.anInt1359 = -2;
			this.anInt1358++;
		}
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)Z")
	public boolean method1097() {
		if (this.aClass52_2 != null) {
			@Pc(11) long local11 = Static101.method1677();
			@Pc(18) int local18 = (int) (local11 - this.aLong54);
			this.aLong54 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt1357 += local18;
			if (this.anInt1357 > 30000) {
				try {
					this.aClass52_2.method1103();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass52_2 = null;
			}
		}
		if (this.aClass52_2 == null) {
			return this.method1092() == 0 && this.method1080() == 0;
		}
		try {
			this.aClass52_2.method1106();
			@Pc(87) Class4_Sub3_Sub1_Sub2 local87;
			for (local87 = (Class4_Sub3_Sub1_Sub2) this.aClass178_5.method4369(); local87 != null; local87 = (Class4_Sub3_Sub1_Sub2) this.aClass178_5.method4377()) {
				this.aClass4_Sub10_1.anInt5713 = 0;
				this.aClass4_Sub10_1.method4618(1);
				this.aClass4_Sub10_1.method4639((int) local87.aLong218);
				this.aClass52_2.method1107(this.aClass4_Sub10_1.aByteArray71, 4);
				this.aClass178_6.method4370(local87);
			}
			for (local87 = (Class4_Sub3_Sub1_Sub2) this.aClass178_7.method4369(); local87 != null; local87 = (Class4_Sub3_Sub1_Sub2) this.aClass178_7.method4377()) {
				this.aClass4_Sub10_1.anInt5713 = 0;
				this.aClass4_Sub10_1.method4618(0);
				this.aClass4_Sub10_1.method4639((int) local87.aLong218);
				this.aClass52_2.method1107(this.aClass4_Sub10_1.aByteArray71, 4);
				this.aClass178_8.method4370(local87);
			}
			for (@Pc(188) int local188 = 0; local188 < 100; local188++) {
				@Pc(198) int local198 = this.aClass52_2.method1101();
				if (local198 < 0) {
					throw new IOException();
				}
				if (local198 == 0) {
					break;
				}
				@Pc(213) byte local213 = 0;
				if (this.aClass4_Sub3_Sub1_Sub2_1 == null) {
					local213 = 8;
				} else if (this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 == 0) {
					local213 = 1;
				}
				this.anInt1357 = 0;
				@Pc(253) int local253;
				@Pc(242) int local242;
				@Pc(301) int local301;
				if (local213 <= 0) {
					local242 = 512 - this.aClass4_Sub3_Sub1_Sub2_1.anInt5385;
					local253 = this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.aByteArray71.length - this.aClass4_Sub3_Sub1_Sub2_1.aByte22;
					if (local253 - this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.anInt5713 < local242) {
						local242 = local253 - this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.anInt5713;
					}
					if (local198 < local242) {
						local242 = local198;
					}
					this.aClass52_2.method1099(this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.anInt5713, this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.aByteArray71, local242);
					if (this.aByte2 != 0) {
						for (local301 = 0; local301 < local242; local301++) {
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.aByteArray71[local301 + this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.anInt5713] ^= this.aByte2;
						}
					}
					this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.anInt5713 += local242;
					this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 += local242;
					if (local253 == this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.anInt5713) {
						this.aClass4_Sub3_Sub1_Sub2_1.method4856();
						this.aClass4_Sub3_Sub1_Sub2_1.aBoolean365 = false;
						this.aClass4_Sub3_Sub1_Sub2_1 = null;
					} else if (this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 == 512) {
						this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 = 0;
					}
				} else {
					local253 = local213 - this.aClass4_Sub10_2.anInt5713;
					if (local253 > local198) {
						local253 = local198;
					}
					this.aClass52_2.method1099(this.aClass4_Sub10_2.anInt5713, this.aClass4_Sub10_2.aByteArray71, local253);
					if (this.aByte2 != 0) {
						for (local242 = 0; local242 < local253; local242++) {
							this.aClass4_Sub10_2.aByteArray71[this.aClass4_Sub10_2.anInt5713 + local242] = (byte) (this.aClass4_Sub10_2.aByteArray71[this.aClass4_Sub10_2.anInt5713 + local242] ^ this.aByte2);
						}
					}
					this.aClass4_Sub10_2.anInt5713 += local253;
					if (local213 <= this.aClass4_Sub10_2.anInt5713) {
						if (this.aClass4_Sub3_Sub1_Sub2_1 == null) {
							this.aClass4_Sub10_2.anInt5713 = 0;
							local242 = this.aClass4_Sub10_2.method4666();
							local301 = this.aClass4_Sub10_2.method4653();
							@Pc(483) int local483 = this.aClass4_Sub10_2.method4666();
							@Pc(487) int local487 = local483 & 0x7F;
							@Pc(498) boolean local498 = (local483 & 0x80) != 0;
							@Pc(503) int local503 = this.aClass4_Sub10_2.method4632();
							@Pc(510) long local510 = (long) (local301 + (local242 << 16));
							@Pc(520) Class4_Sub3_Sub1_Sub2 local520;
							if (local498) {
								for (local520 = (Class4_Sub3_Sub1_Sub2) this.aClass178_8.method4369(); local520 != null && local520.aLong218 != local510; local520 = (Class4_Sub3_Sub1_Sub2) this.aClass178_8.method4377()) {
								}
							} else {
								for (local520 = (Class4_Sub3_Sub1_Sub2) this.aClass178_6.method4369(); local520 != null && local510 != local520.aLong218; local520 = (Class4_Sub3_Sub1_Sub2) this.aClass178_6.method4377()) {
								}
							}
							if (local520 == null) {
								throw new IOException();
							}
							this.aClass4_Sub3_Sub1_Sub2_1 = local520;
							@Pc(581) int local581 = local487 == 0 ? 5 : 9;
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10 = new Class4_Sub10(this.aClass4_Sub3_Sub1_Sub2_1.aByte22 + local503 + local581);
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.method4618(local487);
							this.aClass4_Sub3_Sub1_Sub2_1.aClass4_Sub10_10.method4654(local503);
							this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 = 8;
							this.aClass4_Sub10_2.anInt5713 = 0;
						} else if (this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub10_2.aByteArray71[0] == -1) {
							this.aClass4_Sub10_2.anInt5713 = 0;
							this.aClass4_Sub3_Sub1_Sub2_1.anInt5385 = 1;
						} else {
							this.aClass4_Sub3_Sub1_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(657) IOException local657) {
			try {
				this.aClass52_2.method1103();
			} catch (@Pc(663) Exception local663) {
			}
			this.aClass52_2 = null;
			this.anInt1358++;
			this.anInt1359 = -2;
			return this.method1092() == 0 && this.method1080() == 0;
		}
	}
}
