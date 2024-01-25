import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class54 {

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "Lclient!kq;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
	private int anInt1520;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "Lclient!dv;")
	private Class4_Sub2_Sub2_Sub1 aClass4_Sub2_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Lclient!tk;")
	private final Class239 aClass239_1 = new Class239();

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Lclient!tk;")
	private final Class239 aClass239_2 = new Class239();

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Lclient!tk;")
	private final Class239 aClass239_3 = new Class239();

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Lclient!tk;")
	private final Class239 aClass239_4 = new Class239();

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "Lclient!fh;")
	private final Class4_Sub9 aClass4_Sub9_1 = new Class4_Sub9(4);

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
	public volatile int anInt1521 = 0;

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
	public volatile int anInt1522 = 0;

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Lclient!fh;")
	private final Class4_Sub9 aClass4_Sub9_2 = new Class4_Sub9(8);

	static {
		new Class15("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!kq;IZ)V")
	public void method1232(@OriginalArg(0) Class152 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass152_1 != null) {
			try {
				this.aClass152_1.method2924();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass152_1 = null;
		}
		this.aClass152_1 = arg0;
		this.method1236();
		this.method1235(arg1);
		this.aClass4_Sub2_Sub2_Sub1_1 = null;
		this.aClass4_Sub9_2.anInt6207 = 0;
		while (true) {
			@Pc(40) Class4_Sub2_Sub2_Sub1 local40 = (Class4_Sub2_Sub2_Sub1) this.aClass239_2.method5119();
			if (local40 == null) {
				while (true) {
					local40 = (Class4_Sub2_Sub2_Sub1) this.aClass239_4.method5119();
					if (local40 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aClass4_Sub9_1.anInt6207 = 0;
								this.aClass4_Sub9_1.method4999(4);
								this.aClass4_Sub9_1.method4999(this.aByte22);
								this.aClass4_Sub9_1.method5029(0);
								this.aClass152_1.method2926(4, this.aClass4_Sub9_1.aByteArray81);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass152_1.method2924();
								} catch (@Pc(107) Exception local107) {
								}
								this.anInt1522 = -2;
								this.aClass152_1 = null;
								this.anInt1521++;
							}
						}
						this.anInt1520 = 0;
						this.aLong47 = Static266.method3498();
						return;
					}
					this.aClass239_3.method5126(local40);
				}
			}
			this.aClass239_1.method5126(local40);
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)Z")
	public boolean method1234() {
		@Pc(14) int local14;
		if (this.aClass152_1 != null) {
			@Pc(7) long local7 = Static266.method3498();
			local14 = (int) (local7 - this.aLong47);
			this.aLong47 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt1520 += local14;
			if (this.anInt1520 > 30000) {
				try {
					this.aClass152_1.method2924();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass152_1 = null;
			}
		}
		if (this.aClass152_1 == null) {
			return this.method1238() == 0 && this.method1244() == 0;
		}
		try {
			this.aClass152_1.method2928();
			for (@Pc(78) Class4_Sub2_Sub2_Sub1 local78 = (Class4_Sub2_Sub2_Sub1) this.aClass239_1.method5125(); local78 != null; local78 = (Class4_Sub2_Sub2_Sub1) this.aClass239_1.method5120()) {
				this.aClass4_Sub9_1.anInt6207 = 0;
				this.aClass4_Sub9_1.method4999(1);
				this.aClass4_Sub9_1.method5001((int) local78.aLong208);
				this.aClass152_1.method2926(4, this.aClass4_Sub9_1.aByteArray81);
				this.aClass239_2.method5126(local78);
			}
			for (@Pc(124) Class4_Sub2_Sub2_Sub1 local124 = (Class4_Sub2_Sub2_Sub1) this.aClass239_3.method5125(); local124 != null; local124 = (Class4_Sub2_Sub2_Sub1) this.aClass239_3.method5120()) {
				this.aClass4_Sub9_1.anInt6207 = 0;
				this.aClass4_Sub9_1.method4999(0);
				this.aClass4_Sub9_1.method5001((int) local124.aLong208);
				this.aClass152_1.method2926(4, this.aClass4_Sub9_1.aByteArray81);
				this.aClass239_4.method5126(local124);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(179) int local179 = this.aClass152_1.method2921();
				if (local179 < 0) {
					throw new IOException();
				}
				if (local179 == 0) {
					break;
				}
				this.anInt1520 = 0;
				@Pc(198) byte local198 = 0;
				if (this.aClass4_Sub2_Sub2_Sub1_1 == null) {
					local198 = 8;
				} else if (this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 == 0) {
					local198 = 1;
				}
				@Pc(224) int local224;
				@Pc(230) int local230;
				@Pc(273) int local273;
				if (local198 <= 0) {
					local224 = this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.aByteArray81.length - this.aClass4_Sub2_Sub2_Sub1_1.aByte23;
					local230 = 512 - this.aClass4_Sub2_Sub2_Sub1_1.anInt1600;
					if (local224 - this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.anInt6207 < local230) {
						local230 = local224 - this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.anInt6207;
					}
					if (local179 < local230) {
						local230 = local179;
					}
					this.aClass152_1.method2923(local230, this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.aByteArray81, this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.anInt6207);
					if (this.aByte22 != 0) {
						for (local273 = 0; local273 < local230; local273++) {
							this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.aByteArray81[local273 + this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.anInt6207] ^= this.aByte22;
						}
					}
					this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.anInt6207 += local230;
					this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 += local230;
					if (local224 == this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.anInt6207) {
						this.aClass4_Sub2_Sub2_Sub1_1.method5538();
						this.aClass4_Sub2_Sub2_Sub1_1.aBoolean113 = false;
						this.aClass4_Sub2_Sub2_Sub1_1 = null;
					} else if (this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 == 512) {
						this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 = 0;
					}
				} else {
					local224 = local198 - this.aClass4_Sub9_2.anInt6207;
					if (local224 > local179) {
						local224 = local179;
					}
					this.aClass152_1.method2923(local224, this.aClass4_Sub9_2.aByteArray81, this.aClass4_Sub9_2.anInt6207);
					if (this.aByte22 != 0) {
						for (local230 = 0; local230 < local224; local230++) {
							this.aClass4_Sub9_2.aByteArray81[local230 + this.aClass4_Sub9_2.anInt6207] ^= this.aByte22;
						}
					}
					this.aClass4_Sub9_2.anInt6207 += local224;
					if (this.aClass4_Sub9_2.anInt6207 >= local198) {
						if (this.aClass4_Sub2_Sub2_Sub1_1 == null) {
							this.aClass4_Sub9_2.anInt6207 = 0;
							local230 = this.aClass4_Sub9_2.method5007();
							local273 = this.aClass4_Sub9_2.method5028();
							@Pc(457) int local457 = this.aClass4_Sub9_2.method5007();
							@Pc(462) int local462 = this.aClass4_Sub9_2.method4997();
							@Pc(466) int local466 = local457 & 0x7F;
							@Pc(474) boolean local474 = (local457 & 0x80) != 0;
							@Pc(481) long local481 = (long) ((local230 << 16) + local273);
							@Pc(491) Class4_Sub2_Sub2_Sub1 local491;
							if (local474) {
								for (local491 = (Class4_Sub2_Sub2_Sub1) this.aClass239_4.method5125(); local491 != null && local481 != local491.aLong208; local491 = (Class4_Sub2_Sub2_Sub1) this.aClass239_4.method5120()) {
								}
							} else {
								for (local491 = (Class4_Sub2_Sub2_Sub1) this.aClass239_2.method5125(); local491 != null && local491.aLong208 != local481; local491 = (Class4_Sub2_Sub2_Sub1) this.aClass239_2.method5120()) {
								}
							}
							if (local491 == null) {
								throw new IOException();
							}
							@Pc(544) int local544 = local466 == 0 ? 5 : 9;
							this.aClass4_Sub2_Sub2_Sub1_1 = local491;
							this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3 = new Class4_Sub9(local544 + local462 + this.aClass4_Sub2_Sub2_Sub1_1.aByte23);
							this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.method4999(local466);
							this.aClass4_Sub2_Sub2_Sub1_1.aClass4_Sub9_3.method5047(local462);
							this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 = 8;
							this.aClass4_Sub9_2.anInt6207 = 0;
						} else if (this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub9_2.aByteArray81[0] == -1) {
							this.aClass4_Sub2_Sub2_Sub1_1.anInt1600 = 1;
							this.aClass4_Sub9_2.anInt6207 = 0;
						} else {
							this.aClass4_Sub2_Sub2_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(620) IOException local620) {
			try {
				this.aClass152_1.method2924();
			} catch (@Pc(626) Exception local626) {
			}
			this.anInt1522 = -2;
			this.anInt1521++;
			this.aClass152_1 = null;
			return this.method1238() == 0 && this.method1244() == 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
	public void method1235(@OriginalArg(0) boolean arg0) {
		if (this.aClass152_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub9_1.anInt6207 = 0;
			this.aClass4_Sub9_1.method4999(arg0 ? 2 : 3);
			this.aClass4_Sub9_1.method5001(0);
			this.aClass152_1.method2926(4, this.aClass4_Sub9_1.aByteArray81);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass152_1.method2924();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass152_1 = null;
			this.anInt1522 = -2;
			this.anInt1521++;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	private void method1236() {
		if (this.aClass152_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub9_1.anInt6207 = 0;
			this.aClass4_Sub9_1.method4999(6);
			this.aClass4_Sub9_1.method5001(3);
			this.aClass152_1.method2926(4, this.aClass4_Sub9_1.aByteArray81);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass152_1.method2924();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass152_1 = null;
			this.anInt1522 = -2;
			this.anInt1521++;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Z")
	public boolean method1237() {
		return this.method1244() >= 20;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I")
	public int method1238() {
		return this.aClass239_1.method5124() + this.aClass239_2.method5124();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIIZB)Lclient!dv;")
	public Class4_Sub2_Sub2_Sub1 method1239(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(11) long local11 = (long) ((arg2 << 16) + arg1);
		@Pc(15) Class4_Sub2_Sub2_Sub1 local15 = new Class4_Sub2_Sub2_Sub1();
		local15.aBoolean114 = arg0;
		local15.aLong208 = local11;
		local15.aByte23 = arg3;
		if (arg0) {
			if (this.method1238() >= 20) {
				throw new RuntimeException();
			}
			this.aClass239_1.method5126(local15);
		} else if (this.method1244() < 20) {
			this.aClass239_3.method5126(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)V")
	public void method1240() {
		if (this.aClass152_1 != null) {
			this.aClass152_1.method2924();
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	public void method1241() {
		if (this.aClass152_1 == null) {
			return;
		}
		try {
			this.aClass4_Sub9_1.anInt6207 = 0;
			this.aClass4_Sub9_1.method4999(7);
			this.aClass4_Sub9_1.method5001(0);
			this.aClass152_1.method2926(4, this.aClass4_Sub9_1.aByteArray81);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass152_1.method2924();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass152_1 = null;
			this.anInt1521++;
			this.anInt1522 = -2;
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	public void method1242() {
		try {
			this.aClass152_1.method2924();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1522 = -1;
		this.anInt1521++;
		this.aClass152_1 = null;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public void method1243() {
		if (this.aClass152_1 != null) {
			this.aClass152_1.method2922();
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)I")
	private int method1244() {
		return this.aClass239_3.method5124() + this.aClass239_4.method5124();
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z")
	public boolean method1245() {
		return this.method1238() >= 20;
	}
}
