import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class255 {

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "Lclient!al;")
	private Class11 aClass11_13;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "J")
	private long aLong217;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	private int anInt7061;

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "Lclient!je;")
	private Class4_Sub1_Sub6_Sub1 aClass4_Sub1_Sub6_Sub1_2;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!tn;")
	private final Class229 aClass229_7 = new Class229();

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Lclient!tn;")
	private final Class229 aClass229_8 = new Class229();

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "Lclient!tn;")
	private final Class229 aClass229_9 = new Class229();

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Lclient!tn;")
	private final Class229 aClass229_10 = new Class229();

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "Lclient!iv;")
	private final Class4_Sub12 aClass4_Sub12_8 = new Class4_Sub12(4);

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "I")
	public volatile int anInt7062 = 0;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "B")
	private byte aByte94 = 0;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
	public volatile int anInt7063 = 0;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "Lclient!iv;")
	private final Class4_Sub12 aClass4_Sub12_9 = new Class4_Sub12(8);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
	private int method5459() {
		return this.aClass229_9.method5093() + this.aClass229_10.method5093();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
	public boolean method5460() {
		return this.method5469() >= 20;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!al;Z)V")
	public void method5461(@OriginalArg(1) Class11 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass11_13 != null) {
			try {
				this.aClass11_13.method138();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass11_13 = null;
		}
		this.aClass11_13 = arg0;
		this.method5462();
		this.method5463(arg1);
		this.aClass4_Sub12_9.anInt2997 = 0;
		this.aClass4_Sub1_Sub6_Sub1_2 = null;
		while (true) {
			@Pc(40) Class4_Sub1_Sub6_Sub1 local40 = (Class4_Sub1_Sub6_Sub1) this.aClass229_8.method5091();
			if (local40 == null) {
				while (true) {
					local40 = (Class4_Sub1_Sub6_Sub1) this.aClass229_10.method5091();
					if (local40 == null) {
						if (this.aByte94 != 0) {
							try {
								this.aClass4_Sub12_8.anInt2997 = 0;
								this.aClass4_Sub12_8.method2551(4);
								this.aClass4_Sub12_8.method2551(this.aByte94);
								this.aClass4_Sub12_8.method2524(0);
								this.aClass11_13.method142(4, this.aClass4_Sub12_8.aByteArray36);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass11_13.method138();
								} catch (@Pc(108) Exception local108) {
								}
								this.anInt7063 = -2;
								this.anInt7062++;
								this.aClass11_13 = null;
							}
						}
						this.anInt7061 = 0;
						this.aLong217 = Static282.method3962();
						return;
					}
					this.aClass229_9.method5088(local40);
				}
			}
			this.aClass229_7.method5088(local40);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
	private void method5462() {
		if (this.aClass11_13 == null) {
			return;
		}
		try {
			this.aClass4_Sub12_8.anInt2997 = 0;
			this.aClass4_Sub12_8.method2551(6);
			this.aClass4_Sub12_8.method2517(3);
			this.aClass11_13.method142(4, this.aClass4_Sub12_8.aByteArray36);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass11_13.method138();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass11_13 = null;
			this.anInt7062++;
			this.anInt7063 = -2;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZB)V")
	public void method5463(@OriginalArg(0) boolean arg0) {
		if (this.aClass11_13 == null) {
			return;
		}
		try {
			this.aClass4_Sub12_8.anInt2997 = 0;
			this.aClass4_Sub12_8.method2551(arg0 ? 2 : 3);
			this.aClass4_Sub12_8.method2517(0);
			this.aClass11_13.method142(4, this.aClass4_Sub12_8.aByteArray36);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass11_13.method138();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt7063 = -2;
			this.aClass11_13 = null;
			this.anInt7062++;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
	public void method5464() {
		try {
			this.aClass11_13.method138();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass11_13 = null;
		this.anInt7063 = -1;
		this.aByte94 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt7062++;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBBZI)Lclient!je;")
	public Class4_Sub1_Sub6_Sub1 method5465(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(19) long local19 = (long) ((arg0 << 16) + arg3);
		@Pc(23) Class4_Sub1_Sub6_Sub1 local23 = new Class4_Sub1_Sub6_Sub1();
		local23.aLong198 = local19;
		local23.aBoolean384 = arg2;
		local23.aByte24 = arg1;
		if (arg2) {
			if (this.method5469() >= 20) {
				throw new RuntimeException();
			}
			this.aClass229_7.method5088(local23);
		} else if (this.method5459() < 20) {
			this.aClass229_9.method5088(local23);
		} else {
			throw new RuntimeException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V")
	public void method5466() {
		if (this.aClass11_13 != null) {
			this.aClass11_13.method132();
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(B)V")
	public void method5467() {
		if (this.aClass11_13 == null) {
			return;
		}
		try {
			this.aClass4_Sub12_8.anInt2997 = 0;
			this.aClass4_Sub12_8.method2551(7);
			this.aClass4_Sub12_8.method2517(0);
			this.aClass11_13.method142(4, this.aClass4_Sub12_8.aByteArray36);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass11_13.method138();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt7063 = -2;
			this.aClass11_13 = null;
			this.anInt7062++;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Z")
	public boolean method5468() {
		@Pc(18) int local18;
		if (this.aClass11_13 != null) {
			@Pc(11) long local11 = Static282.method3962();
			local18 = (int) (local11 - this.aLong217);
			this.aLong217 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt7061 += local18;
			if (this.anInt7061 > 30000) {
				try {
					this.aClass11_13.method138();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass11_13 = null;
			}
		}
		if (this.aClass11_13 == null) {
			return this.method5469() == 0 && this.method5459() == 0;
		}
		try {
			this.aClass11_13.method141();
			for (@Pc(76) Class4_Sub1_Sub6_Sub1 local76 = (Class4_Sub1_Sub6_Sub1) this.aClass229_7.method5089(); local76 != null; local76 = (Class4_Sub1_Sub6_Sub1) this.aClass229_7.method5092()) {
				this.aClass4_Sub12_8.anInt2997 = 0;
				this.aClass4_Sub12_8.method2551(1);
				this.aClass4_Sub12_8.method2517((int) local76.aLong198);
				this.aClass11_13.method142(4, this.aClass4_Sub12_8.aByteArray36);
				this.aClass229_8.method5088(local76);
			}
			for (@Pc(122) Class4_Sub1_Sub6_Sub1 local122 = (Class4_Sub1_Sub6_Sub1) this.aClass229_9.method5089(); local122 != null; local122 = (Class4_Sub1_Sub6_Sub1) this.aClass229_9.method5092()) {
				this.aClass4_Sub12_8.anInt2997 = 0;
				this.aClass4_Sub12_8.method2551(0);
				this.aClass4_Sub12_8.method2517((int) local122.aLong198);
				this.aClass11_13.method142(4, this.aClass4_Sub12_8.aByteArray36);
				this.aClass229_10.method5088(local122);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(177) int local177 = this.aClass11_13.method133();
				if (local177 < 0) {
					throw new IOException();
				}
				if (local177 == 0) {
					break;
				}
				this.anInt7061 = 0;
				@Pc(190) byte local190 = 0;
				if (this.aClass4_Sub1_Sub6_Sub1_2 == null) {
					local190 = 8;
				} else if (this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 == 0) {
					local190 = 1;
				}
				@Pc(219) int local219;
				@Pc(226) int local226;
				@Pc(275) int local275;
				if (local190 <= 0) {
					local219 = this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.aByteArray36.length - this.aClass4_Sub1_Sub6_Sub1_2.aByte24;
					local226 = 512 - this.aClass4_Sub1_Sub6_Sub1_2.anInt3510;
					if (local219 - this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.anInt2997 < local226) {
						local226 = local219 - this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.anInt2997;
					}
					if (local226 > local177) {
						local226 = local177;
					}
					this.aClass11_13.method131(this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.anInt2997, local226, this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.aByteArray36);
					if (this.aByte94 != 0) {
						for (local275 = 0; local275 < local226; local275++) {
							this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.aByteArray36[local275 + this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.anInt2997] ^= this.aByte94;
						}
					}
					this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.anInt2997 += local226;
					this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 += local226;
					if (this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.anInt2997 == local219) {
						this.aClass4_Sub1_Sub6_Sub1_2.method4662();
						this.aClass4_Sub1_Sub6_Sub1_2.aBoolean381 = false;
						this.aClass4_Sub1_Sub6_Sub1_2 = null;
					} else if (this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 == 512) {
						this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 = 0;
					}
				} else {
					local219 = local190 - this.aClass4_Sub12_9.anInt2997;
					if (local219 > local177) {
						local219 = local177;
					}
					this.aClass11_13.method131(this.aClass4_Sub12_9.anInt2997, local219, this.aClass4_Sub12_9.aByteArray36);
					if (this.aByte94 != 0) {
						for (local226 = 0; local226 < local219; local226++) {
							this.aClass4_Sub12_9.aByteArray36[this.aClass4_Sub12_9.anInt2997 + local226] ^= this.aByte94;
						}
					}
					this.aClass4_Sub12_9.anInt2997 += local219;
					if (local190 <= this.aClass4_Sub12_9.anInt2997) {
						if (this.aClass4_Sub1_Sub6_Sub1_2 == null) {
							this.aClass4_Sub12_9.anInt2997 = 0;
							local226 = this.aClass4_Sub12_9.method2490();
							local275 = this.aClass4_Sub12_9.method2536();
							@Pc(459) int local459 = this.aClass4_Sub12_9.method2490();
							@Pc(464) int local464 = this.aClass4_Sub12_9.method2529();
							@Pc(468) int local468 = local459 & 0x7F;
							@Pc(479) boolean local479 = (local459 & 0x80) != 0;
							@Pc(486) long local486 = (long) ((local226 << 16) + local275);
							@Pc(496) Class4_Sub1_Sub6_Sub1 local496;
							if (local479) {
								for (local496 = (Class4_Sub1_Sub6_Sub1) this.aClass229_10.method5089(); local496 != null && local496.aLong198 != local486; local496 = (Class4_Sub1_Sub6_Sub1) this.aClass229_10.method5092()) {
								}
							} else {
								for (local496 = (Class4_Sub1_Sub6_Sub1) this.aClass229_8.method5089(); local496 != null && local496.aLong198 != local486; local496 = (Class4_Sub1_Sub6_Sub1) this.aClass229_8.method5092()) {
								}
							}
							if (local496 == null) {
								throw new IOException();
							}
							@Pc(549) int local549 = local468 == 0 ? 5 : 9;
							this.aClass4_Sub1_Sub6_Sub1_2 = local496;
							this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4 = new Class4_Sub12(local549 + local464 + this.aClass4_Sub1_Sub6_Sub1_2.aByte24);
							this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.method2551(local468);
							this.aClass4_Sub1_Sub6_Sub1_2.aClass4_Sub12_4.method2531(local464);
							this.aClass4_Sub12_9.anInt2997 = 0;
							this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 = 8;
						} else if (this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub12_9.aByteArray36[0] == -1) {
							this.aClass4_Sub1_Sub6_Sub1_2.anInt3510 = 1;
							this.aClass4_Sub12_9.anInt2997 = 0;
						} else {
							this.aClass4_Sub1_Sub6_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass11_13.method138();
			} catch (@Pc(633) Exception local633) {
			}
			this.anInt7062++;
			this.anInt7063 = -2;
			this.aClass11_13 = null;
			return this.method5469() == 0 && this.method5459() == 0;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)I")
	public int method5469() {
		return this.aClass229_7.method5093() + this.aClass229_8.method5093();
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(B)Z")
	public boolean method5472() {
		return this.method5459() >= 20;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	public void method5474() {
		if (this.aClass11_13 != null) {
			this.aClass11_13.method138();
		}
	}
}
