import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class42 {

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Lclient!dm;")
	private Class41 aClass41_2;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
	private int anInt1425;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "Lclient!fl;")
	private Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "Lclient!nb;")
	private Class104 aClass104_2 = new Class104();

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "Lclient!nb;")
	private Class104 aClass104_3 = new Class104();

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Lclient!nb;")
	private Class104 aClass104_4 = new Class104();

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Lclient!nb;")
	private Class104 aClass104_5 = new Class104();

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "Lclient!im;")
	private Class1_Sub16 aClass1_Sub16_2 = new Class1_Sub16(4);

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
	public volatile int anInt1426 = 0;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "B")
	private byte aByte7 = 0;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
	public volatile int anInt1427 = 0;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Lclient!im;")
	private Class1_Sub16 aClass1_Sub16_3 = new Class1_Sub16(8);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIBIB)Lclient!fl;")
	public Class1_Sub2_Sub1_Sub2 method1070(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg1 + (arg2 << 16));
		@Pc(14) Class1_Sub2_Sub1_Sub2 local14 = new Class1_Sub2_Sub1_Sub2();
		local14.aLong198 = local10;
		local14.aByte9 = arg3;
		local14.aBoolean103 = arg0;
		if (arg0) {
			if (this.method1083() >= 20) {
				throw new RuntimeException();
			}
			this.aClass104_2.method3145(local14);
		} else if (this.method1075() < 20) {
			this.aClass104_4.method3145(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)V")
	public void method1071(@OriginalArg(1) boolean arg0) {
		if (this.aClass41_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub16_2.anInt3328 = 0;
			this.aClass1_Sub16_2.method2621(arg0 ? 2 : 3);
			this.aClass1_Sub16_2.method2628(0);
			this.aClass41_2.method1068(this.aClass1_Sub16_2.aByteArray39, 4);
		} catch (@Pc(45) IOException local45) {
			try {
				this.aClass41_2.method1062();
			} catch (@Pc(51) Exception local51) {
			}
			this.anInt1427 = -2;
			this.aClass41_2 = null;
			this.anInt1426++;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method1073() {
		if (this.aClass41_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub16_2.anInt3328 = 0;
			this.aClass1_Sub16_2.method2621(7);
			this.aClass1_Sub16_2.method2628(0);
			this.aClass41_2.method1068(this.aClass1_Sub16_2.aByteArray39, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass41_2.method1062();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass41_2 = null;
			this.anInt1426++;
			this.anInt1427 = -2;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
	public boolean method1074() {
		if (this.aClass41_2 != null) {
			@Pc(8) long local8 = Static294.method4792();
			@Pc(15) int local15 = (int) (local8 - this.aLong52);
			this.aLong52 = local8;
			if (local15 > 200) {
				local15 = 200;
			}
			this.anInt1425 += local15;
			if (this.anInt1425 > 30000) {
				try {
					this.aClass41_2.method1062();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass41_2 = null;
			}
		}
		if (this.aClass41_2 == null) {
			return this.method1083() == 0 && this.method1075() == 0;
		}
		try {
			this.aClass41_2.method1063();
			@Pc(87) Class1_Sub2_Sub1_Sub2 local87;
			for (local87 = (Class1_Sub2_Sub1_Sub2) this.aClass104_2.method3152(); local87 != null; local87 = (Class1_Sub2_Sub1_Sub2) this.aClass104_2.method3151()) {
				this.aClass1_Sub16_2.anInt3328 = 0;
				this.aClass1_Sub16_2.method2621(1);
				this.aClass1_Sub16_2.method2628((int) local87.aLong198);
				this.aClass41_2.method1068(this.aClass1_Sub16_2.aByteArray39, 4);
				this.aClass104_3.method3145(local87);
			}
			for (local87 = (Class1_Sub2_Sub1_Sub2) this.aClass104_4.method3152(); local87 != null; local87 = (Class1_Sub2_Sub1_Sub2) this.aClass104_4.method3151()) {
				this.aClass1_Sub16_2.anInt3328 = 0;
				this.aClass1_Sub16_2.method2621(0);
				this.aClass1_Sub16_2.method2628((int) local87.aLong198);
				this.aClass41_2.method1068(this.aClass1_Sub16_2.aByteArray39, 4);
				this.aClass104_5.method3145(local87);
			}
			for (@Pc(175) int local175 = 0; local175 < 100; local175++) {
				@Pc(185) int local185 = this.aClass41_2.method1067();
				if (local185 < 0) {
					throw new IOException();
				}
				if (local185 == 0) {
					break;
				}
				this.anInt1425 = 0;
				@Pc(207) byte local207 = 0;
				if (this.aClass1_Sub2_Sub1_Sub2_1 == null) {
					local207 = 8;
				} else if (this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 == 0) {
					local207 = 1;
				}
				@Pc(232) int local232;
				@Pc(260) int local260;
				@Pc(320) int local320;
				if (local207 > 0) {
					local232 = local207 - this.aClass1_Sub16_3.anInt3328;
					if (local232 > local185) {
						local232 = local185;
					}
					this.aClass41_2.method1059(local232, this.aClass1_Sub16_3.aByteArray39, this.aClass1_Sub16_3.anInt3328);
					if (this.aByte7 != 0) {
						for (local260 = 0; local260 < local232; local260++) {
							this.aClass1_Sub16_3.aByteArray39[this.aClass1_Sub16_3.anInt3328 + local260] = (byte) (this.aClass1_Sub16_3.aByteArray39[this.aClass1_Sub16_3.anInt3328 + local260] ^ this.aByte7);
						}
					}
					this.aClass1_Sub16_3.anInt3328 += local232;
					if (local207 <= this.aClass1_Sub16_3.anInt3328) {
						if (this.aClass1_Sub2_Sub1_Sub2_1 == null) {
							this.aClass1_Sub16_3.anInt3328 = 0;
							local260 = this.aClass1_Sub16_3.method2655();
							local320 = this.aClass1_Sub16_3.method2652();
							@Pc(325) int local325 = this.aClass1_Sub16_3.method2655();
							@Pc(332) long local332 = (long) (local320 + (local260 << 16));
							@Pc(339) int local339 = this.aClass1_Sub16_3.method2610();
							@Pc(343) int local343 = local325 & 0x7F;
							@Pc(354) boolean local354 = (local325 & 0x80) != 0;
							@Pc(362) Class1_Sub2_Sub1_Sub2 local362;
							if (local354) {
								for (local362 = (Class1_Sub2_Sub1_Sub2) this.aClass104_5.method3152(); local362 != null && local362.aLong198 != local332; local362 = (Class1_Sub2_Sub1_Sub2) this.aClass104_5.method3151()) {
								}
							} else {
								for (local362 = (Class1_Sub2_Sub1_Sub2) this.aClass104_3.method3152(); local362 != null && local362.aLong198 != local332; local362 = (Class1_Sub2_Sub1_Sub2) this.aClass104_3.method3151()) {
								}
							}
							if (local362 == null) {
								throw new IOException();
							}
							this.aClass1_Sub2_Sub1_Sub2_1 = local362;
							@Pc(420) int local420 = local343 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6 = new Class1_Sub16(this.aClass1_Sub2_Sub1_Sub2_1.aByte9 + local339 + local420);
							this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.method2621(local343);
							this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.method2606(local339);
							this.aClass1_Sub16_3.anInt3328 = 0;
							this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 = 8;
						} else if (this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub16_3.aByteArray39[0] == -1) {
							this.aClass1_Sub16_3.anInt3328 = 0;
							this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 = 1;
						} else {
							this.aClass1_Sub2_Sub1_Sub2_1 = null;
						}
					}
				} else {
					local260 = 512 - this.aClass1_Sub2_Sub1_Sub2_1.anInt1877;
					local232 = this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.aByteArray39.length - this.aClass1_Sub2_Sub1_Sub2_1.aByte9;
					if (local232 - this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.anInt3328 < local260) {
						local260 = local232 - this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.anInt3328;
					}
					if (local260 > local185) {
						local260 = local185;
					}
					this.aClass41_2.method1059(local260, this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.aByteArray39, this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.anInt3328);
					if (this.aByte7 != 0) {
						for (local320 = 0; local320 < local260; local320++) {
							this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.aByteArray39[local320 + this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.anInt3328] ^= this.aByte7;
						}
					}
					this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 += local260;
					this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.anInt3328 += local260;
					if (this.aClass1_Sub2_Sub1_Sub2_1.aClass1_Sub16_6.anInt3328 == local232) {
						this.aClass1_Sub2_Sub1_Sub2_1.method4661();
						this.aClass1_Sub2_Sub1_Sub2_1.aBoolean102 = false;
						this.aClass1_Sub2_Sub1_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 == 512) {
						this.aClass1_Sub2_Sub1_Sub2_1.anInt1877 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(641) IOException local641) {
			try {
				this.aClass41_2.method1062();
			} catch (@Pc(647) Exception local647) {
			}
			this.aClass41_2 = null;
			this.anInt1426++;
			this.anInt1427 = -2;
			return this.method1083() == 0 && this.method1075() == 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I")
	private int method1075() {
		return this.aClass104_4.method3150() + this.aClass104_5.method3150();
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)Z")
	public boolean method1076() {
		return this.method1083() >= 20;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z")
	public boolean method1077() {
		return this.method1075() >= 20;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!dm;ZZ)V")
	public void method1078(@OriginalArg(0) Class41 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass41_2 != null) {
			try {
				this.aClass41_2.method1062();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass41_2 = null;
		}
		this.aClass41_2 = arg0;
		this.method1084();
		this.method1071(arg1);
		this.aClass1_Sub16_3.anInt3328 = 0;
		this.aClass1_Sub2_Sub1_Sub2_1 = null;
		while (true) {
			@Pc(42) Class1_Sub2_Sub1_Sub2 local42 = (Class1_Sub2_Sub1_Sub2) this.aClass104_3.method3149();
			if (local42 == null) {
				while (true) {
					local42 = (Class1_Sub2_Sub1_Sub2) this.aClass104_5.method3149();
					if (local42 == null) {
						if (this.aByte7 != 0) {
							try {
								this.aClass1_Sub16_2.anInt3328 = 0;
								this.aClass1_Sub16_2.method2621(4);
								this.aClass1_Sub16_2.method2621(this.aByte7);
								this.aClass1_Sub16_2.method2624(0);
								this.aClass41_2.method1068(this.aClass1_Sub16_2.aByteArray39, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass41_2.method1062();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt1427 = -2;
								this.aClass41_2 = null;
								this.anInt1426++;
							}
						}
						this.anInt1425 = 0;
						this.aLong52 = Static294.method4792();
						return;
					}
					this.aClass104_4.method3145(local42);
				}
			}
			this.aClass104_2.method3145(local42);
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)V")
	public void method1080() {
		if (this.aClass41_2 != null) {
			this.aClass41_2.method1062();
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	public void method1081() {
		try {
			this.aClass41_2.method1062();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt1427 = -1;
		this.anInt1426++;
		this.aClass41_2 = null;
		this.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	public void method1082() {
		if (this.aClass41_2 != null) {
			this.aClass41_2.method1069();
		}
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)I")
	public int method1083() {
		return this.aClass104_2.method3150() + this.aClass104_3.method3150();
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
	private void method1084() {
		if (this.aClass41_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub16_2.anInt3328 = 0;
			this.aClass1_Sub16_2.method2621(6);
			this.aClass1_Sub16_2.method2628(3);
			this.aClass41_2.method1068(this.aClass1_Sub16_2.aByteArray39, 4);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass41_2.method1062();
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass41_2 = null;
			this.anInt1427 = -2;
			this.anInt1426++;
		}
	}
}
