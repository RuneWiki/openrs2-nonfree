import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class191 {

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
	private int anInt5730;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Lclient!h;")
	private Class76 aClass76_4;

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "Lclient!bl;")
	private Class1_Sub4_Sub2_Sub1 aClass1_Sub4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Lclient!ig;")
	private final Class89 aClass89_7 = new Class89();

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!ig;")
	private final Class89 aClass89_8 = new Class89();

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "Lclient!ig;")
	private final Class89 aClass89_9 = new Class89();

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Lclient!ig;")
	private final Class89 aClass89_10 = new Class89();

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Lclient!at;")
	private final Class1_Sub7 aClass1_Sub7_6 = new Class1_Sub7(4);

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
	public volatile int anInt5732 = 0;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
	public volatile int anInt5731 = 0;

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "Lclient!at;")
	private final Class1_Sub7 aClass1_Sub7_7 = new Class1_Sub7(8);

	static {
		new Class106(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
		new Class106("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public void method5178() {
		if (this.aClass76_4 != null) {
			this.aClass76_4.method2378();
		}
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)I")
	public int method5180() {
		return this.aClass89_7.method2721() + this.aClass89_8.method2721();
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)Z")
	public boolean method5181() {
		return this.method5180() >= 20;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!h;Z)V")
	public void method5182(@OriginalArg(1) Class76 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass76_4 != null) {
			try {
				this.aClass76_4.method2377();
			} catch (@Pc(20) Exception local20) {
			}
			this.aClass76_4 = null;
		}
		this.aClass76_4 = arg0;
		this.method5192();
		this.method5187(arg1);
		this.aClass1_Sub7_7.anInt2219 = 0;
		this.aClass1_Sub4_Sub2_Sub1_1 = null;
		while (true) {
			@Pc(50) Class1_Sub4_Sub2_Sub1 local50 = (Class1_Sub4_Sub2_Sub1) this.aClass89_8.method2722();
			if (local50 == null) {
				while (true) {
					local50 = (Class1_Sub4_Sub2_Sub1) this.aClass89_10.method2722();
					if (local50 == null) {
						if (this.aByte63 != 0) {
							try {
								this.aClass1_Sub7_6.anInt2219 = 0;
								this.aClass1_Sub7_6.method2121(4);
								this.aClass1_Sub7_6.method2121(this.aByte63);
								this.aClass1_Sub7_6.method2144(0);
								this.aClass76_4.method2376(4, this.aClass1_Sub7_6.aByteArray41);
							} catch (@Pc(112) IOException local112) {
								try {
									this.aClass76_4.method2377();
								} catch (@Pc(118) Exception local118) {
								}
								this.aClass76_4 = null;
								this.anInt5731 = -2;
								this.anInt5732++;
							}
						}
						this.anInt5730 = 0;
						this.aLong196 = Static183.method3462();
						return;
					}
					this.aClass89_9.method2720(local50);
				}
			}
			this.aClass89_7.method2720(local50);
		}
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)Z")
	public boolean method5183() {
		@Pc(17) int local17;
		if (this.aClass76_4 != null) {
			@Pc(11) long local11 = Static183.method3462();
			local17 = (int) (local11 - this.aLong196);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong196 = local11;
			this.anInt5730 += local17;
			if (this.anInt5730 > 30000) {
				try {
					this.aClass76_4.method2377();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass76_4 = null;
			}
		}
		if (this.aClass76_4 == null) {
			return this.method5180() == 0 && this.method5194() == 0;
		}
		try {
			this.aClass76_4.method2386();
			for (@Pc(74) Class1_Sub4_Sub2_Sub1 local74 = (Class1_Sub4_Sub2_Sub1) this.aClass89_7.method2718(); local74 != null; local74 = (Class1_Sub4_Sub2_Sub1) this.aClass89_7.method2726()) {
				this.aClass1_Sub7_6.anInt2219 = 0;
				this.aClass1_Sub7_6.method2121(1);
				this.aClass1_Sub7_6.method2118((int) local74.aLong211);
				this.aClass76_4.method2376(4, this.aClass1_Sub7_6.aByteArray41);
				this.aClass89_8.method2720(local74);
			}
			for (@Pc(122) Class1_Sub4_Sub2_Sub1 local122 = (Class1_Sub4_Sub2_Sub1) this.aClass89_9.method2718(); local122 != null; local122 = (Class1_Sub4_Sub2_Sub1) this.aClass89_9.method2726()) {
				this.aClass1_Sub7_6.anInt2219 = 0;
				this.aClass1_Sub7_6.method2121(0);
				this.aClass1_Sub7_6.method2118((int) local122.aLong211);
				this.aClass76_4.method2376(4, this.aClass1_Sub7_6.aByteArray41);
				this.aClass89_10.method2720(local122);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(171) int local171 = this.aClass76_4.method2387();
				if (local171 < 0) {
					throw new IOException();
				}
				if (local171 == 0) {
					break;
				}
				this.anInt5730 = 0;
				@Pc(184) byte local184 = 0;
				if (this.aClass1_Sub4_Sub2_Sub1_1 == null) {
					local184 = 8;
				} else if (this.aClass1_Sub4_Sub2_Sub1_1.anInt663 == 0) {
					local184 = 1;
				}
				@Pc(209) int local209;
				@Pc(234) int local234;
				@Pc(299) int local299;
				if (local184 > 0) {
					local209 = local184 - this.aClass1_Sub7_7.anInt2219;
					if (local209 > local171) {
						local209 = local171;
					}
					this.aClass76_4.method2384(this.aClass1_Sub7_7.anInt2219, local209, this.aClass1_Sub7_7.aByteArray41);
					if (this.aByte63 != 0) {
						for (local234 = 0; local234 < local209; local234++) {
							this.aClass1_Sub7_7.aByteArray41[this.aClass1_Sub7_7.anInt2219 + local234] ^= this.aByte63;
						}
					}
					this.aClass1_Sub7_7.anInt2219 += local209;
					if (this.aClass1_Sub7_7.anInt2219 >= local184) {
						if (this.aClass1_Sub4_Sub2_Sub1_1 == null) {
							this.aClass1_Sub7_7.anInt2219 = 0;
							local234 = this.aClass1_Sub7_7.method2132();
							local299 = this.aClass1_Sub7_7.method2161();
							@Pc(304) int local304 = this.aClass1_Sub7_7.method2132();
							@Pc(309) int local309 = this.aClass1_Sub7_7.method2140();
							@Pc(313) int local313 = local304 & 0x7F;
							@Pc(321) boolean local321 = (local304 & 0x80) != 0;
							@Pc(329) long local329 = (long) ((local234 << 16) + local299);
							@Pc(339) Class1_Sub4_Sub2_Sub1 local339;
							if (local321) {
								for (local339 = (Class1_Sub4_Sub2_Sub1) this.aClass89_10.method2718(); local339 != null && local339.aLong211 != local329; local339 = (Class1_Sub4_Sub2_Sub1) this.aClass89_10.method2726()) {
								}
							} else {
								for (local339 = (Class1_Sub4_Sub2_Sub1) this.aClass89_8.method2718(); local339 != null && local329 != local339.aLong211; local339 = (Class1_Sub4_Sub2_Sub1) this.aClass89_8.method2726()) {
								}
							}
							if (local339 == null) {
								throw new IOException();
							}
							this.aClass1_Sub4_Sub2_Sub1_1 = local339;
							@Pc(404) int local404 = local313 == 0 ? 5 : 9;
							this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1 = new Class1_Sub7(this.aClass1_Sub4_Sub2_Sub1_1.aByte8 + local404 + local309);
							this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.method2121(local313);
							this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.method2115(local309);
							this.aClass1_Sub7_7.anInt2219 = 0;
							this.aClass1_Sub4_Sub2_Sub1_1.anInt663 = 8;
						} else if (this.aClass1_Sub4_Sub2_Sub1_1.anInt663 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub7_7.aByteArray41[0] == -1) {
							this.aClass1_Sub7_7.anInt2219 = 0;
							this.aClass1_Sub4_Sub2_Sub1_1.anInt663 = 1;
						} else {
							this.aClass1_Sub4_Sub2_Sub1_1 = null;
						}
					}
				} else {
					local209 = this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.aByteArray41.length - this.aClass1_Sub4_Sub2_Sub1_1.aByte8;
					local234 = 512 - this.aClass1_Sub4_Sub2_Sub1_1.anInt663;
					if (local234 > local209 - this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219) {
						local234 = local209 - this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219;
					}
					if (local234 > local171) {
						local234 = local171;
					}
					this.aClass76_4.method2384(this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219, local234, this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.aByteArray41);
					if (this.aByte63 != 0) {
						for (local299 = 0; local299 < local234; local299++) {
							this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.aByteArray41[this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219 + local299] = (byte) (this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.aByteArray41[this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219 + local299] ^ this.aByte63);
						}
					}
					this.aClass1_Sub4_Sub2_Sub1_1.anInt663 += local234;
					this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219 += local234;
					if (local209 == this.aClass1_Sub4_Sub2_Sub1_1.aClass1_Sub7_1.anInt2219) {
						this.aClass1_Sub4_Sub2_Sub1_1.method5714();
						this.aClass1_Sub4_Sub2_Sub1_1.aBoolean367 = false;
						this.aClass1_Sub4_Sub2_Sub1_1 = null;
					} else if (this.aClass1_Sub4_Sub2_Sub1_1.anInt663 == 512) {
						this.aClass1_Sub4_Sub2_Sub1_1.anInt663 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(622) IOException local622) {
			try {
				this.aClass76_4.method2377();
			} catch (@Pc(628) Exception local628) {
			}
			this.anInt5731 = -2;
			this.aClass76_4 = null;
			this.anInt5732++;
			return this.method5180() == 0 && this.method5194() == 0;
		}
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V")
	public void method5185() {
		if (this.aClass76_4 != null) {
			this.aClass76_4.method2377();
		}
	}

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "(I)Z")
	public boolean method5186() {
		return this.method5194() >= 20;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZB)V")
	public void method5187(@OriginalArg(0) boolean arg0) {
		if (this.aClass76_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub7_6.anInt2219 = 0;
			this.aClass1_Sub7_6.method2121(arg0 ? 2 : 3);
			this.aClass1_Sub7_6.method2118(0);
			this.aClass76_4.method2376(4, this.aClass1_Sub7_6.aByteArray41);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass76_4.method2377();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass76_4 = null;
			this.anInt5731 = -2;
			this.anInt5732++;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	public void method5188() {
		try {
			this.aClass76_4.method2377();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte63 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass76_4 = null;
		this.anInt5732++;
		this.anInt5731 = -1;
	}

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)V")
	public void method5190() {
		if (this.aClass76_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub7_6.anInt2219 = 0;
			this.aClass1_Sub7_6.method2121(7);
			this.aClass1_Sub7_6.method2118(0);
			this.aClass76_4.method2376(4, this.aClass1_Sub7_6.aByteArray41);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass76_4.method2377();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass76_4 = null;
			this.anInt5732++;
			this.anInt5731 = -2;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIZB)Lclient!bl;")
	public Class1_Sub4_Sub2_Sub1 method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg0);
		@Pc(14) Class1_Sub4_Sub2_Sub1 local14 = new Class1_Sub4_Sub2_Sub1();
		local14.aBoolean368 = arg2;
		local14.aByte8 = arg3;
		local14.aLong211 = local10;
		if (arg2) {
			if (this.method5180() >= 20) {
				throw new RuntimeException();
			}
			this.aClass89_7.method2720(local14);
		} else if (this.method5194() < 20) {
			this.aClass89_9.method2720(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "(I)V")
	private void method5192() {
		if (this.aClass76_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub7_6.anInt2219 = 0;
			this.aClass1_Sub7_6.method2121(6);
			this.aClass1_Sub7_6.method2118(3);
			this.aClass76_4.method2376(4, this.aClass1_Sub7_6.aByteArray41);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass76_4.method2377();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt5731 = -2;
			this.aClass76_4 = null;
			this.anInt5732++;
		}
	}

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "(I)I")
	private int method5194() {
		return this.aClass89_9.method2721() + this.aClass89_10.method2721();
	}
}
