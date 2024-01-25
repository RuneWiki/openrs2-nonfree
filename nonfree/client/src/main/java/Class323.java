import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class323 {

	@OriginalMember(owner = "client!th", name = "A", descriptor = "J")
	private long aLong246;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "I")
	private int anInt9131;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "Lclient!ru;")
	private Class299 aClass299_2;

	@OriginalMember(owner = "client!th", name = "I", descriptor = "Lclient!ch;")
	private Class3_Sub7_Sub4_Sub1 aClass3_Sub7_Sub4_Sub1_2;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Lclient!vu;")
	private final Class363 aClass363_49 = new Class363();

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!vu;")
	private final Class363 aClass363_50 = new Class363();

	@OriginalMember(owner = "client!th", name = "x", descriptor = "Lclient!vu;")
	private final Class363 aClass363_51 = new Class363();

	@OriginalMember(owner = "client!th", name = "z", descriptor = "Lclient!vu;")
	private final Class363 aClass363_52 = new Class363();

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Lclient!dc;")
	private final Class3_Sub9 aClass3_Sub9_11 = new Class3_Sub9(4);

	@OriginalMember(owner = "client!th", name = "E", descriptor = "B")
	private byte aByte107 = 0;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "I")
	public volatile int anInt9132 = 0;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "I")
	public volatile int anInt9133 = 0;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "Lclient!dc;")
	private final Class3_Sub9 aClass3_Sub9_12 = new Class3_Sub9(8);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public void method7823() {
		try {
			this.aClass299_2.method7360();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte107 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.aClass299_2 = null;
		this.anInt9133 = -1;
		this.anInt9132++;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public void method7824() {
		if (this.aClass299_2 != null) {
			this.aClass299_2.method7361();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public void method7825() {
		if (this.aClass299_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub9_11.anInt6453 = 0;
			this.aClass3_Sub9_11.method5572(7);
			this.aClass3_Sub9_11.method5592(0);
			this.aClass299_2.method7353(4, this.aClass3_Sub9_11.aByteArray51);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass299_2.method7360();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt9133 = -2;
			this.aClass299_2 = null;
			this.anInt9132++;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ru;IZ)V")
	public void method7826(@OriginalArg(0) Class299 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass299_2 != null) {
			try {
				this.aClass299_2.method7360();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass299_2 = null;
		}
		this.aClass299_2 = arg0;
		this.method7836();
		this.method7833(arg1);
		this.aClass3_Sub9_12.anInt6453 = 0;
		this.aClass3_Sub7_Sub4_Sub1_2 = null;
		while (true) {
			@Pc(44) Class3_Sub7_Sub4_Sub1 local44 = (Class3_Sub7_Sub4_Sub1) this.aClass363_50.method8420();
			if (local44 == null) {
				while (true) {
					local44 = (Class3_Sub7_Sub4_Sub1) this.aClass363_52.method8420();
					if (local44 == null) {
						if (this.aByte107 != 0) {
							try {
								this.aClass3_Sub9_11.anInt6453 = 0;
								this.aClass3_Sub9_11.method5572(4);
								this.aClass3_Sub9_11.method5572(this.aByte107);
								this.aClass3_Sub9_11.method5620(0);
								this.aClass299_2.method7353(4, this.aClass3_Sub9_11.aByteArray51);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass299_2.method7360();
								} catch (@Pc(108) Exception local108) {
								}
								this.anInt9133 = -2;
								this.aClass299_2 = null;
								this.anInt9132++;
							}
						}
						this.anInt9131 = 0;
						this.aLong246 = Static191.method3071();
						return;
					}
					this.aClass363_51.method8413(local44);
				}
			}
			this.aClass363_49.method8413(local44);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	public void method7827() {
		if (this.aClass299_2 != null) {
			this.aClass299_2.method7360();
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)Z")
	public boolean method7830() {
		@Pc(13) int local13;
		if (this.aClass299_2 != null) {
			@Pc(7) long local7 = Static191.method3071();
			local13 = (int) (local7 - this.aLong246);
			this.aLong246 = local7;
			if (local13 > 200) {
				local13 = 200;
			}
			this.anInt9131 += local13;
			if (this.anInt9131 > 30000) {
				try {
					this.aClass299_2.method7360();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass299_2 = null;
			}
		}
		if (this.aClass299_2 == null) {
			return this.method7840() == 0 && this.method7837() == 0;
		}
		try {
			this.aClass299_2.method7357();
			for (@Pc(73) Class3_Sub7_Sub4_Sub1 local73 = (Class3_Sub7_Sub4_Sub1) this.aClass363_49.method8414(); local73 != null; local73 = (Class3_Sub7_Sub4_Sub1) this.aClass363_49.method8415()) {
				this.aClass3_Sub9_11.anInt6453 = 0;
				this.aClass3_Sub9_11.method5572(1);
				this.aClass3_Sub9_11.method5592((int) local73.aLong251);
				this.aClass299_2.method7353(4, this.aClass3_Sub9_11.aByteArray51);
				this.aClass363_50.method8413(local73);
			}
			for (@Pc(127) Class3_Sub7_Sub4_Sub1 local127 = (Class3_Sub7_Sub4_Sub1) this.aClass363_51.method8414(); local127 != null; local127 = (Class3_Sub7_Sub4_Sub1) this.aClass363_51.method8415()) {
				this.aClass3_Sub9_11.anInt6453 = 0;
				this.aClass3_Sub9_11.method5572(0);
				this.aClass3_Sub9_11.method5592((int) local127.aLong251);
				this.aClass299_2.method7353(4, this.aClass3_Sub9_11.aByteArray51);
				this.aClass363_52.method8413(local127);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(180) int local180 = this.aClass299_2.method7354();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt9131 = 0;
				@Pc(196) byte local196 = 0;
				if (this.aClass3_Sub7_Sub4_Sub1_2 == null) {
					local196 = 8;
				} else if (this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 == 0) {
					local196 = 1;
				}
				@Pc(220) int local220;
				@Pc(248) int local248;
				@Pc(306) int local306;
				if (local196 > 0) {
					local220 = local196 - this.aClass3_Sub9_12.anInt6453;
					if (local180 < local220) {
						local220 = local180;
					}
					this.aClass299_2.method7355(this.aClass3_Sub9_12.aByteArray51, local220, this.aClass3_Sub9_12.anInt6453);
					if (this.aByte107 != 0) {
						for (local248 = 0; local248 < local220; local248++) {
							this.aClass3_Sub9_12.aByteArray51[this.aClass3_Sub9_12.anInt6453 + local248] = (byte) (this.aClass3_Sub9_12.aByteArray51[this.aClass3_Sub9_12.anInt6453 + local248] ^ this.aByte107);
						}
					}
					this.aClass3_Sub9_12.anInt6453 += local220;
					if (this.aClass3_Sub9_12.anInt6453 >= local196) {
						if (this.aClass3_Sub7_Sub4_Sub1_2 == null) {
							this.aClass3_Sub9_12.anInt6453 = 0;
							local248 = this.aClass3_Sub9_12.method5633();
							local306 = this.aClass3_Sub9_12.method5610();
							@Pc(311) int local311 = this.aClass3_Sub9_12.method5633();
							@Pc(316) int local316 = this.aClass3_Sub9_12.method5585();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(331) boolean local331 = (local311 & 0x80) != 0;
							@Pc(338) long local338 = (long) ((local248 << 16) + local306);
							@Pc(348) Class3_Sub7_Sub4_Sub1 local348;
							if (local331) {
								for (local348 = (Class3_Sub7_Sub4_Sub1) this.aClass363_52.method8414(); local348 != null && local338 != local348.aLong251; local348 = (Class3_Sub7_Sub4_Sub1) this.aClass363_52.method8415()) {
								}
							} else {
								for (local348 = (Class3_Sub7_Sub4_Sub1) this.aClass363_50.method8414(); local348 != null && local338 != local348.aLong251; local348 = (Class3_Sub7_Sub4_Sub1) this.aClass363_50.method8415()) {
								}
							}
							if (local348 == null) {
								throw new IOException();
							}
							this.aClass3_Sub7_Sub4_Sub1_2 = local348;
							@Pc(411) int local411 = local320 == 0 ? 5 : 9;
							this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3 = new Class3_Sub9(this.aClass3_Sub7_Sub4_Sub1_2.aByte34 + local316 + local411);
							this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.method5572(local320);
							this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.method5601(local316);
							this.aClass3_Sub9_12.anInt6453 = 0;
							this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 = 8;
						} else if (this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub9_12.aByteArray51[0] == -1) {
							this.aClass3_Sub9_12.anInt6453 = 0;
							this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 = 1;
						} else {
							this.aClass3_Sub7_Sub4_Sub1_2 = null;
						}
					}
				} else {
					local220 = this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.aByteArray51.length - this.aClass3_Sub7_Sub4_Sub1_2.aByte34;
					local248 = 512 - this.aClass3_Sub7_Sub4_Sub1_2.anInt1398;
					if (local220 - this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.anInt6453 < local248) {
						local248 = local220 - this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.anInt6453;
					}
					if (local180 < local248) {
						local248 = local180;
					}
					this.aClass299_2.method7355(this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.aByteArray51, local248, this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.anInt6453);
					if (this.aByte107 != 0) {
						for (local306 = 0; local306 < local248; local306++) {
							this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.aByteArray51[local306 + this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.anInt6453] ^= this.aByte107;
						}
					}
					this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.anInt6453 += local248;
					this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 += local248;
					if (this.aClass3_Sub7_Sub4_Sub1_2.aClass3_Sub9_3.anInt6453 == local220) {
						this.aClass3_Sub7_Sub4_Sub1_2.method7907();
						this.aClass3_Sub7_Sub4_Sub1_2.aBoolean126 = false;
						this.aClass3_Sub7_Sub4_Sub1_2 = null;
					} else if (this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 == 512) {
						this.aClass3_Sub7_Sub4_Sub1_2.anInt1398 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(641) IOException local641) {
			try {
				this.aClass299_2.method7360();
			} catch (@Pc(647) Exception local647) {
			}
			this.anInt9133 = -2;
			this.anInt9132++;
			this.aClass299_2 = null;
			return this.method7840() == 0 && this.method7837() == 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
	public boolean method7832() {
		return this.method7837() >= 20;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V")
	public void method7833(@OriginalArg(0) boolean arg0) {
		if (this.aClass299_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub9_11.anInt6453 = 0;
			this.aClass3_Sub9_11.method5572(arg0 ? 2 : 3);
			this.aClass3_Sub9_11.method5592(0);
			this.aClass299_2.method7353(4, this.aClass3_Sub9_11.aByteArray51);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass299_2.method7360();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt9132++;
			this.aClass299_2 = null;
			this.anInt9133 = -2;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIBB)Lclient!ch;")
	public Class3_Sub7_Sub4_Sub1 method7834(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(14) Class3_Sub7_Sub4_Sub1 local14 = new Class3_Sub7_Sub4_Sub1();
		local14.aBoolean127 = arg1;
		local14.aByte34 = arg3;
		local14.aLong251 = local10;
		if (arg1) {
			if (this.method7840() >= 20) {
				throw new RuntimeException();
			}
			this.aClass363_49.method8413(local14);
		} else if (this.method7837() < 20) {
			this.aClass363_51.method8413(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	private void method7836() {
		if (this.aClass299_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub9_11.anInt6453 = 0;
			this.aClass3_Sub9_11.method5572(6);
			this.aClass3_Sub9_11.method5592(3);
			this.aClass299_2.method7353(4, this.aClass3_Sub9_11.aByteArray51);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass299_2.method7360();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt9133 = -2;
			this.aClass299_2 = null;
			this.anInt9132++;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)I")
	private int method7837() {
		return this.aClass363_51.method8417() + this.aClass363_52.method8417();
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)Z")
	public boolean method7839() {
		return this.method7840() >= 20;
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)I")
	public int method7840() {
		return this.aClass363_49.method8417() + this.aClass363_50.method8417();
	}
}
