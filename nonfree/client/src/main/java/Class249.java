import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class249 {

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Lclient!hl;")
	private Class113 aClass113_7;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "I")
	private int anInt7126;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "J")
	private long aLong370;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "Lclient!jn;")
	private Class2_Sub1_Sub7_Sub2 aClass2_Sub1_Sub7_Sub2_2;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!em;")
	private final Class71 aClass71_6 = new Class71();

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Lclient!em;")
	private final Class71 aClass71_7 = new Class71();

	@OriginalMember(owner = "client!un", name = "r", descriptor = "Lclient!em;")
	private final Class71 aClass71_8 = new Class71();

	@OriginalMember(owner = "client!un", name = "t", descriptor = "Lclient!em;")
	private final Class71 aClass71_9 = new Class71();

	@OriginalMember(owner = "client!un", name = "y", descriptor = "Lclient!hw;")
	private final Class2_Sub17 aClass2_Sub17_7 = new Class2_Sub17(4);

	@OriginalMember(owner = "client!un", name = "E", descriptor = "B")
	private byte aByte84 = 0;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "I")
	public volatile int anInt7128 = 0;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "I")
	public volatile int anInt7127 = 0;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "Lclient!hw;")
	private final Class2_Sub17 aClass2_Sub17_8 = new Class2_Sub17(8);

	static {
		new Class231("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)V")
	public void method5691(@OriginalArg(0) boolean arg0) {
		if (this.aClass113_7 == null) {
			return;
		}
		try {
			this.aClass2_Sub17_7.anInt7523 = 0;
			this.aClass2_Sub17_7.method6172(arg0 ? 2 : 3);
			this.aClass2_Sub17_7.method6111(0);
			this.aClass113_7.method2333(this.aClass2_Sub17_7.aByteArray94, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass113_7.method2337();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt7127 = -2;
			this.aClass113_7 = null;
			this.anInt7128++;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I")
	private int method5692() {
		return this.aClass71_8.method1433() + this.aClass71_9.method1433();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Z")
	public boolean method5693() {
		@Pc(18) int local18;
		if (this.aClass113_7 != null) {
			@Pc(11) long local11 = Static432.method5870();
			local18 = (int) (local11 - this.aLong370);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong370 = local11;
			this.anInt7126 += local18;
			if (this.anInt7126 > 30000) {
				try {
					this.aClass113_7.method2337();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass113_7 = null;
			}
		}
		if (this.aClass113_7 == null) {
			return this.method5702() == 0 && this.method5692() == 0;
		}
		try {
			this.aClass113_7.method2335();
			for (@Pc(84) Class2_Sub1_Sub7_Sub2 local84 = (Class2_Sub1_Sub7_Sub2) this.aClass71_6.method1431(); local84 != null; local84 = (Class2_Sub1_Sub7_Sub2) this.aClass71_6.method1428()) {
				this.aClass2_Sub17_7.anInt7523 = 0;
				this.aClass2_Sub17_7.method6172(1);
				this.aClass2_Sub17_7.method6111((int) local84.aLong378);
				this.aClass113_7.method2333(this.aClass2_Sub17_7.aByteArray94, 4);
				this.aClass71_7.method1430(local84);
			}
			for (@Pc(130) Class2_Sub1_Sub7_Sub2 local130 = (Class2_Sub1_Sub7_Sub2) this.aClass71_8.method1431(); local130 != null; local130 = (Class2_Sub1_Sub7_Sub2) this.aClass71_8.method1428()) {
				this.aClass2_Sub17_7.anInt7523 = 0;
				this.aClass2_Sub17_7.method6172(0);
				this.aClass2_Sub17_7.method6111((int) local130.aLong378);
				this.aClass113_7.method2333(this.aClass2_Sub17_7.aByteArray94, 4);
				this.aClass71_9.method1430(local130);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(179) int local179 = this.aClass113_7.method2338();
				if (local179 < 0) {
					throw new IOException();
				}
				if (local179 == 0) {
					break;
				}
				this.anInt7126 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass2_Sub1_Sub7_Sub2_2 == null) {
					local195 = 8;
				} else if (this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 == 0) {
					local195 = 1;
				}
				@Pc(223) int local223;
				@Pc(230) int local230;
				@Pc(273) int local273;
				if (local195 <= 0) {
					local223 = this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.aByteArray94.length - this.aClass2_Sub1_Sub7_Sub2_2.aByte57;
					local230 = 512 - this.aClass2_Sub1_Sub7_Sub2_2.anInt3435;
					if (local223 - this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.anInt7523 < local230) {
						local230 = local223 - this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.anInt7523;
					}
					if (local230 > local179) {
						local230 = local179;
					}
					this.aClass113_7.method2332(this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.anInt7523, this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.aByteArray94, local230);
					if (this.aByte84 != 0) {
						for (local273 = 0; local273 < local230; local273++) {
							this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.aByteArray94[local273 + this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.anInt7523] ^= this.aByte84;
						}
					}
					this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.anInt7523 += local230;
					this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 += local230;
					if (this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.anInt7523 == local223) {
						this.aClass2_Sub1_Sub7_Sub2_2.method5838();
						this.aClass2_Sub1_Sub7_Sub2_2.aBoolean225 = false;
						this.aClass2_Sub1_Sub7_Sub2_2 = null;
					} else if (this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 == 512) {
						this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 = 0;
					}
				} else {
					local223 = local195 - this.aClass2_Sub17_8.anInt7523;
					if (local179 < local223) {
						local223 = local179;
					}
					this.aClass113_7.method2332(this.aClass2_Sub17_8.anInt7523, this.aClass2_Sub17_8.aByteArray94, local223);
					if (this.aByte84 != 0) {
						for (local230 = 0; local230 < local223; local230++) {
							this.aClass2_Sub17_8.aByteArray94[this.aClass2_Sub17_8.anInt7523 + local230] = (byte) (this.aClass2_Sub17_8.aByteArray94[this.aClass2_Sub17_8.anInt7523 + local230] ^ this.aByte84);
						}
					}
					this.aClass2_Sub17_8.anInt7523 += local223;
					if (local195 <= this.aClass2_Sub17_8.anInt7523) {
						if (this.aClass2_Sub1_Sub7_Sub2_2 == null) {
							this.aClass2_Sub17_8.anInt7523 = 0;
							local230 = this.aClass2_Sub17_8.method6138();
							local273 = this.aClass2_Sub17_8.method6148();
							@Pc(468) int local468 = this.aClass2_Sub17_8.method6138();
							@Pc(473) int local473 = this.aClass2_Sub17_8.method6129();
							@Pc(477) int local477 = local468 & 0x7F;
							@Pc(488) boolean local488 = (local468 & 0x80) != 0;
							@Pc(495) long local495 = (long) (local273 + (local230 << 16));
							@Pc(505) Class2_Sub1_Sub7_Sub2 local505;
							if (local488) {
								for (local505 = (Class2_Sub1_Sub7_Sub2) this.aClass71_9.method1431(); local505 != null && local505.aLong378 != local495; local505 = (Class2_Sub1_Sub7_Sub2) this.aClass71_9.method1428()) {
								}
							} else {
								for (local505 = (Class2_Sub1_Sub7_Sub2) this.aClass71_7.method1431(); local505 != null && local505.aLong378 != local495; local505 = (Class2_Sub1_Sub7_Sub2) this.aClass71_7.method1428()) {
								}
							}
							if (local505 == null) {
								throw new IOException();
							}
							this.aClass2_Sub1_Sub7_Sub2_2 = local505;
							@Pc(571) int local571 = local477 == 0 ? 5 : 9;
							this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3 = new Class2_Sub17(local571 + local473 + this.aClass2_Sub1_Sub7_Sub2_2.aByte57);
							this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.method6172(local477);
							this.aClass2_Sub1_Sub7_Sub2_2.aClass2_Sub17_3.method6170(local473);
							this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 = 8;
							this.aClass2_Sub17_8.anInt7523 = 0;
						} else if (this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub17_8.aByteArray94[0] == -1) {
							this.aClass2_Sub1_Sub7_Sub2_2.anInt3435 = 1;
							this.aClass2_Sub17_8.anInt7523 = 0;
						} else {
							this.aClass2_Sub1_Sub7_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(647) IOException local647) {
			try {
				this.aClass113_7.method2337();
			} catch (@Pc(653) Exception local653) {
			}
			this.anInt7127 = -2;
			this.aClass113_7 = null;
			this.anInt7128++;
			return this.method5702() == 0 && this.method5692() == 0;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	private void method5694() {
		if (this.aClass113_7 == null) {
			return;
		}
		try {
			this.aClass2_Sub17_7.anInt7523 = 0;
			this.aClass2_Sub17_7.method6172(6);
			this.aClass2_Sub17_7.method6111(3);
			this.aClass113_7.method2333(this.aClass2_Sub17_7.aByteArray94, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass113_7.method2337();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass113_7 = null;
			this.anInt7127 = -2;
			this.anInt7128++;
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	public void method5695() {
		if (this.aClass113_7 != null) {
			this.aClass113_7.method2337();
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	public void method5696() {
		if (this.aClass113_7 != null) {
			this.aClass113_7.method2334();
		}
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
	public void method5697() {
		try {
			this.aClass113_7.method2337();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte84 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass113_7 = null;
		this.anInt7128++;
		this.anInt7127 = -1;
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)Z")
	public boolean method5698() {
		return this.method5692() >= 20;
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)Z")
	public boolean method5699() {
		return this.method5702() >= 20;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIIIB)Lclient!jn;")
	public Class2_Sub1_Sub7_Sub2 method5700(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(15) long local15 = (long) (arg2 + (arg1 << 16));
		@Pc(19) Class2_Sub1_Sub7_Sub2 local19 = new Class2_Sub1_Sub7_Sub2();
		local19.aByte57 = arg3;
		local19.aLong378 = local15;
		local19.aBoolean226 = arg0;
		if (arg0) {
			if (this.method5702() >= 20) {
				throw new RuntimeException();
			}
			this.aClass71_6.method1430(local19);
		} else if (this.method5692() < 20) {
			this.aClass71_8.method1430(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public void method5701() {
		if (this.aClass113_7 == null) {
			return;
		}
		try {
			this.aClass2_Sub17_7.anInt7523 = 0;
			this.aClass2_Sub17_7.method6172(7);
			this.aClass2_Sub17_7.method6111(0);
			this.aClass113_7.method2333(this.aClass2_Sub17_7.aByteArray94, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass113_7.method2337();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt7127 = -2;
			this.aClass113_7 = null;
			this.anInt7128++;
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)I")
	public int method5702() {
		return this.aClass71_6.method1433() + this.aClass71_7.method1433();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZLclient!hl;I)V")
	public void method5703(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class113 arg1) {
		if (this.aClass113_7 != null) {
			try {
				this.aClass113_7.method2337();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass113_7 = null;
		}
		this.aClass113_7 = arg1;
		this.method5694();
		this.method5691(arg0);
		this.aClass2_Sub1_Sub7_Sub2_2 = null;
		this.aClass2_Sub17_8.anInt7523 = 0;
		while (true) {
			@Pc(44) Class2_Sub1_Sub7_Sub2 local44 = (Class2_Sub1_Sub7_Sub2) this.aClass71_7.method1434();
			if (local44 == null) {
				while (true) {
					local44 = (Class2_Sub1_Sub7_Sub2) this.aClass71_9.method1434();
					if (local44 == null) {
						if (this.aByte84 != 0) {
							try {
								this.aClass2_Sub17_7.anInt7523 = 0;
								this.aClass2_Sub17_7.method6172(4);
								this.aClass2_Sub17_7.method6172(this.aByte84);
								this.aClass2_Sub17_7.method6130(0);
								this.aClass113_7.method2333(this.aClass2_Sub17_7.aByteArray94, 4);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass113_7.method2337();
								} catch (@Pc(111) Exception local111) {
								}
								this.aClass113_7 = null;
								this.anInt7128++;
								this.anInt7127 = -2;
							}
						}
						this.anInt7126 = 0;
						this.aLong370 = Static432.method5870();
						return;
					}
					this.aClass71_8.method1430(local44);
				}
			}
			this.aClass71_6.method1430(local44);
		}
	}
}
