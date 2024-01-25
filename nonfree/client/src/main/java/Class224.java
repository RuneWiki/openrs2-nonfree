import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class224 {

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
	private int anInt6267;

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "Lclient!ke;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!sn", name = "H", descriptor = "Lclient!ul;")
	private Class1_Sub5_Sub9_Sub2 aClass1_Sub5_Sub9_Sub2_2;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!so;")
	private final Class225 aClass225_6 = new Class225();

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Lclient!so;")
	private final Class225 aClass225_7 = new Class225();

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "Lclient!so;")
	private final Class225 aClass225_8 = new Class225();

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "Lclient!so;")
	private final Class225 aClass225_9 = new Class225();

	@OriginalMember(owner = "client!sn", name = "A", descriptor = "Lclient!ug;")
	private final Class1_Sub28 aClass1_Sub28_7 = new Class1_Sub28(4);

	@OriginalMember(owner = "client!sn", name = "F", descriptor = "B")
	private byte aByte98 = 0;

	@OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
	public volatile int anInt6268 = 0;

	@OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
	public volatile int anInt6269 = 0;

	@OriginalMember(owner = "client!sn", name = "D", descriptor = "Lclient!ug;")
	private final Class1_Sub28 aClass1_Sub28_8 = new Class1_Sub28(8);

	static {
		new Class119("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!ke;B)V")
	public void method4922(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class131 arg1) {
		if (this.aClass131_2 != null) {
			try {
				this.aClass131_2.method2933();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass131_2 = null;
		}
		this.aClass131_2 = arg1;
		this.method4934();
		this.method4932(arg0);
		this.aClass1_Sub28_8.anInt6812 = 0;
		this.aClass1_Sub5_Sub9_Sub2_2 = null;
		while (true) {
			@Pc(40) Class1_Sub5_Sub9_Sub2 local40 = (Class1_Sub5_Sub9_Sub2) this.aClass225_7.method4939();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub5_Sub9_Sub2) this.aClass225_9.method4939();
					if (local40 == null) {
						if (this.aByte98 != 0) {
							try {
								this.aClass1_Sub28_7.anInt6812 = 0;
								this.aClass1_Sub28_7.method5398(4);
								this.aClass1_Sub28_7.method5398(this.aByte98);
								this.aClass1_Sub28_7.method5393(0);
								this.aClass131_2.method2928(this.aClass1_Sub28_7.aByteArray86, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass131_2.method2933();
								} catch (@Pc(115) Exception local115) {
								}
								this.anInt6268++;
								this.anInt6269 = -2;
								this.aClass131_2 = null;
							}
						}
						this.anInt6267 = 0;
						this.aLong196 = Static27.method359();
						return;
					}
					this.aClass225_8.method4943(local40);
				}
			}
			this.aClass225_6.method4943(local40);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIBBZ)Lclient!ul;")
	public Class1_Sub5_Sub9_Sub2 method4923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(18) long local18 = (long) (arg0 + (arg1 << 16));
		@Pc(22) Class1_Sub5_Sub9_Sub2 local22 = new Class1_Sub5_Sub9_Sub2();
		local22.aLong211 = local18;
		local22.aBoolean741 = arg3;
		local22.aByte103 = arg2;
		if (arg3) {
			if (this.method4926() >= 20) {
				throw new RuntimeException();
			}
			this.aClass225_6.method4943(local22);
		} else if (this.method4936() < 20) {
			this.aClass225_8.method4943(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)Z")
	public boolean method4924() {
		return this.method4936() >= 20;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method4925() {
		if (this.aClass131_2 != null) {
			this.aClass131_2.method2931();
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)I")
	public int method4926() {
		return this.aClass225_6.method4941() + this.aClass225_7.method4941();
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public void method4927() {
		if (this.aClass131_2 != null) {
			this.aClass131_2.method2933();
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)Z")
	public boolean method4928() {
		@Pc(18) int local18;
		if (this.aClass131_2 != null) {
			@Pc(11) long local11 = Static27.method359();
			local18 = (int) (local11 - this.aLong196);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong196 = local11;
			this.anInt6267 += local18;
			if (this.anInt6267 > 30000) {
				try {
					this.aClass131_2.method2933();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass131_2 = null;
			}
		}
		if (this.aClass131_2 == null) {
			return this.method4926() == 0 && this.method4936() == 0;
		}
		try {
			this.aClass131_2.method2930();
			for (@Pc(76) Class1_Sub5_Sub9_Sub2 local76 = (Class1_Sub5_Sub9_Sub2) this.aClass225_6.method4942(); local76 != null; local76 = (Class1_Sub5_Sub9_Sub2) this.aClass225_6.method4937()) {
				this.aClass1_Sub28_7.anInt6812 = 0;
				this.aClass1_Sub28_7.method5398(1);
				this.aClass1_Sub28_7.method5348((int) local76.aLong211);
				this.aClass131_2.method2928(this.aClass1_Sub28_7.aByteArray86, 4);
				this.aClass225_7.method4943(local76);
			}
			for (@Pc(122) Class1_Sub5_Sub9_Sub2 local122 = (Class1_Sub5_Sub9_Sub2) this.aClass225_8.method4942(); local122 != null; local122 = (Class1_Sub5_Sub9_Sub2) this.aClass225_8.method4937()) {
				this.aClass1_Sub28_7.anInt6812 = 0;
				this.aClass1_Sub28_7.method5398(0);
				this.aClass1_Sub28_7.method5348((int) local122.aLong211);
				this.aClass131_2.method2928(this.aClass1_Sub28_7.aByteArray86, 4);
				this.aClass225_9.method4943(local122);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(171) int local171 = this.aClass131_2.method2932();
				if (local171 < 0) {
					throw new IOException();
				}
				if (local171 == 0) {
					break;
				}
				this.anInt6267 = 0;
				@Pc(190) byte local190 = 0;
				if (this.aClass1_Sub5_Sub9_Sub2_2 == null) {
					local190 = 8;
				} else if (this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 == 0) {
					local190 = 1;
				}
				@Pc(212) int local212;
				@Pc(240) int local240;
				@Pc(301) int local301;
				if (local190 > 0) {
					local212 = local190 - this.aClass1_Sub28_8.anInt6812;
					if (local171 < local212) {
						local212 = local171;
					}
					this.aClass131_2.method2929(this.aClass1_Sub28_8.anInt6812, local212, this.aClass1_Sub28_8.aByteArray86);
					if (this.aByte98 != 0) {
						for (local240 = 0; local240 < local212; local240++) {
							this.aClass1_Sub28_8.aByteArray86[this.aClass1_Sub28_8.anInt6812 + local240] ^= this.aByte98;
						}
					}
					this.aClass1_Sub28_8.anInt6812 += local212;
					if (this.aClass1_Sub28_8.anInt6812 >= local190) {
						if (this.aClass1_Sub5_Sub9_Sub2_2 == null) {
							this.aClass1_Sub28_8.anInt6812 = 0;
							local240 = this.aClass1_Sub28_8.method5337();
							local301 = this.aClass1_Sub28_8.method5335();
							@Pc(306) int local306 = this.aClass1_Sub28_8.method5337();
							@Pc(311) int local311 = this.aClass1_Sub28_8.method5355();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(323) boolean local323 = (local306 & 0x80) != 0;
							@Pc(330) long local330 = (long) (local301 + (local240 << 16));
							@Pc(340) Class1_Sub5_Sub9_Sub2 local340;
							if (local323) {
								for (local340 = (Class1_Sub5_Sub9_Sub2) this.aClass225_9.method4942(); local340 != null && local330 != local340.aLong211; local340 = (Class1_Sub5_Sub9_Sub2) this.aClass225_9.method4937()) {
								}
							} else {
								for (local340 = (Class1_Sub5_Sub9_Sub2) this.aClass225_7.method4942(); local340 != null && local330 != local340.aLong211; local340 = (Class1_Sub5_Sub9_Sub2) this.aClass225_7.method4937()) {
								}
							}
							if (local340 == null) {
								throw new IOException();
							}
							@Pc(400) int local400 = local315 == 0 ? 5 : 9;
							this.aClass1_Sub5_Sub9_Sub2_2 = local340;
							this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9 = new Class1_Sub28(local400 + local311 + this.aClass1_Sub5_Sub9_Sub2_2.aByte103);
							this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.method5398(local315);
							this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.method5347(local311);
							this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 = 8;
							this.aClass1_Sub28_8.anInt6812 = 0;
						} else if (this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub28_8.aByteArray86[0] == -1) {
							this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 = 1;
							this.aClass1_Sub28_8.anInt6812 = 0;
						} else {
							this.aClass1_Sub5_Sub9_Sub2_2 = null;
						}
					}
				} else {
					local212 = this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.aByteArray86.length - this.aClass1_Sub5_Sub9_Sub2_2.aByte103;
					local240 = 512 - this.aClass1_Sub5_Sub9_Sub2_2.anInt6768;
					if (local212 - this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.anInt6812 < local240) {
						local240 = local212 - this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.anInt6812;
					}
					if (local240 > local171) {
						local240 = local171;
					}
					this.aClass131_2.method2929(this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.anInt6812, local240, this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.aByteArray86);
					if (this.aByte98 != 0) {
						for (local301 = 0; local301 < local240; local301++) {
							this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.aByteArray86[this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.anInt6812 + local301] ^= this.aByte98;
						}
					}
					this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.anInt6812 += local240;
					this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 += local240;
					if (this.aClass1_Sub5_Sub9_Sub2_2.aClass1_Sub28_9.anInt6812 == local212) {
						this.aClass1_Sub5_Sub9_Sub2_2.method5305();
						this.aClass1_Sub5_Sub9_Sub2_2.aBoolean740 = false;
						this.aClass1_Sub5_Sub9_Sub2_2 = null;
					} else if (this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 == 512) {
						this.aClass1_Sub5_Sub9_Sub2_2.anInt6768 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(634) IOException local634) {
			try {
				this.aClass131_2.method2933();
			} catch (@Pc(640) Exception local640) {
			}
			this.aClass131_2 = null;
			this.anInt6268++;
			this.anInt6269 = -2;
			return this.method4926() == 0 && this.method4936() == 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V")
	public void method4929() {
		if (this.aClass131_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub28_7.anInt6812 = 0;
			this.aClass1_Sub28_7.method5398(7);
			this.aClass1_Sub28_7.method5348(0);
			this.aClass131_2.method2928(this.aClass1_Sub28_7.aByteArray86, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass131_2.method2933();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6268++;
			this.anInt6269 = -2;
			this.aClass131_2 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)Z")
	public boolean method4931() {
		return this.method4926() >= 20;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V")
	public void method4932(@OriginalArg(0) boolean arg0) {
		if (this.aClass131_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub28_7.anInt6812 = 0;
			this.aClass1_Sub28_7.method5398(arg0 ? 2 : 3);
			this.aClass1_Sub28_7.method5348(0);
			this.aClass131_2.method2928(this.aClass1_Sub28_7.aByteArray86, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass131_2.method2933();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt6268++;
			this.anInt6269 = -2;
			this.aClass131_2 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public void method4933() {
		try {
			this.aClass131_2.method2933();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte98 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt6269 = -1;
		this.aClass131_2 = null;
		this.anInt6268++;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	private void method4934() {
		if (this.aClass131_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub28_7.anInt6812 = 0;
			this.aClass1_Sub28_7.method5398(6);
			this.aClass1_Sub28_7.method5348(3);
			this.aClass131_2.method2928(this.aClass1_Sub28_7.aByteArray86, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass131_2.method2933();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6268++;
			this.aClass131_2 = null;
			this.anInt6269 = -2;
		}
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)I")
	private int method4936() {
		return this.aClass225_8.method4941() + this.aClass225_9.method4941();
	}
}
