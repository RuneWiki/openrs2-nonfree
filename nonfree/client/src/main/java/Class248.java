import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class248 {

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "J")
	private long aLong195;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Lclient!sda;")
	private Class305 aClass305_2;

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
	private int anInt7430;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "Lclient!wl;")
	private Class3_Sub4_Sub9_Sub2 aClass3_Sub4_Sub9_Sub2_1;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!ak;")
	private final Class15 aClass15_8 = new Class15();

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "Lclient!ak;")
	private final Class15 aClass15_9 = new Class15();

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Lclient!ak;")
	private final Class15 aClass15_10 = new Class15();

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "Lclient!ak;")
	private final Class15 aClass15_11 = new Class15();

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Lclient!sl;")
	private final Class3_Sub3 aClass3_Sub3_5 = new Class3_Sub3(4);

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "B")
	private byte aByte104 = 0;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
	public volatile int anInt7432 = 0;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
	public volatile int anInt7431 = 0;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Lclient!sl;")
	private final Class3_Sub3 aClass3_Sub3_6 = new Class3_Sub3(8);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!sda;ZI)V")
	public void method6448(@OriginalArg(0) Class305 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass305_2 != null) {
			try {
				this.aClass305_2.method7637();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass305_2 = null;
		}
		this.aClass305_2 = arg0;
		this.method6460();
		this.method6456(arg1);
		this.aClass3_Sub3_6.anInt4736 = 0;
		this.aClass3_Sub4_Sub9_Sub2_1 = null;
		while (true) {
			@Pc(48) Class3_Sub4_Sub9_Sub2 local48 = (Class3_Sub4_Sub9_Sub2) this.aClass15_9.method902();
			if (local48 == null) {
				while (true) {
					local48 = (Class3_Sub4_Sub9_Sub2) this.aClass15_11.method902();
					if (local48 == null) {
						if (this.aByte104 != 0) {
							try {
								this.aClass3_Sub3_5.anInt4736 = 0;
								this.aClass3_Sub3_5.method4220(4);
								this.aClass3_Sub3_5.method4220(this.aByte104);
								this.aClass3_Sub3_5.method4201(0);
								this.aClass305_2.method7636(4, this.aClass3_Sub3_5.aByteArray54);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass305_2.method7637();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt7432++;
								this.anInt7431 = -2;
								this.aClass305_2 = null;
							}
						}
						this.anInt7430 = 0;
						this.aLong195 = Static374.method6036();
						return;
					}
					this.aClass15_10.method901(local48);
				}
			}
			this.aClass15_8.method901(local48);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
	private int method6449() {
		return this.aClass15_10.method896() + this.aClass15_11.method896();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public void method6450() {
		try {
			this.aClass305_2.method7637();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass305_2 = null;
		this.anInt7431 = -1;
		this.aByte104 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt7432++;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z")
	public boolean method6451() {
		@Pc(19) int local19;
		if (this.aClass305_2 != null) {
			@Pc(12) long local12 = Static374.method6036();
			local19 = (int) (local12 - this.aLong195);
			this.aLong195 = local12;
			if (local19 > 200) {
				local19 = 200;
			}
			this.anInt7430 += local19;
			if (this.anInt7430 > 30000) {
				try {
					this.aClass305_2.method7637();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass305_2 = null;
			}
		}
		if (this.aClass305_2 == null) {
			return this.method6458() == 0 && this.method6449() == 0;
		}
		try {
			this.aClass305_2.method7638();
			for (@Pc(78) Class3_Sub4_Sub9_Sub2 local78 = (Class3_Sub4_Sub9_Sub2) this.aClass15_8.method897(); local78 != null; local78 = (Class3_Sub4_Sub9_Sub2) this.aClass15_8.method898()) {
				this.aClass3_Sub3_5.anInt4736 = 0;
				this.aClass3_Sub3_5.method4220(1);
				this.aClass3_Sub3_5.method4248((int) local78.aLong274);
				this.aClass305_2.method7636(4, this.aClass3_Sub3_5.aByteArray54);
				this.aClass15_9.method901(local78);
			}
			for (@Pc(124) Class3_Sub4_Sub9_Sub2 local124 = (Class3_Sub4_Sub9_Sub2) this.aClass15_10.method897(); local124 != null; local124 = (Class3_Sub4_Sub9_Sub2) this.aClass15_10.method898()) {
				this.aClass3_Sub3_5.anInt4736 = 0;
				this.aClass3_Sub3_5.method4220(0);
				this.aClass3_Sub3_5.method4248((int) local124.aLong274);
				this.aClass305_2.method7636(4, this.aClass3_Sub3_5.aByteArray54);
				this.aClass15_11.method901(local124);
			}
			for (local19 = 0; local19 < 100; local19++) {
				@Pc(173) int local173 = this.aClass305_2.method7635();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt7430 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass3_Sub4_Sub9_Sub2_1 == null) {
					local192 = 8;
				} else if (this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 == 0) {
					local192 = 1;
				}
				@Pc(216) int local216;
				@Pc(244) int local244;
				@Pc(305) int local305;
				if (local192 > 0) {
					local216 = local192 - this.aClass3_Sub3_6.anInt4736;
					if (local173 < local216) {
						local216 = local173;
					}
					this.aClass305_2.method7634(this.aClass3_Sub3_6.aByteArray54, local216, this.aClass3_Sub3_6.anInt4736);
					if (this.aByte104 != 0) {
						for (local244 = 0; local244 < local216; local244++) {
							this.aClass3_Sub3_6.aByteArray54[this.aClass3_Sub3_6.anInt4736 + local244] ^= this.aByte104;
						}
					}
					this.aClass3_Sub3_6.anInt4736 += local216;
					if (local192 <= this.aClass3_Sub3_6.anInt4736) {
						if (this.aClass3_Sub4_Sub9_Sub2_1 == null) {
							this.aClass3_Sub3_6.anInt4736 = 0;
							local244 = this.aClass3_Sub3_6.method4225();
							local305 = this.aClass3_Sub3_6.method4221();
							@Pc(310) int local310 = this.aClass3_Sub3_6.method4225();
							@Pc(315) int local315 = this.aClass3_Sub3_6.method4207();
							@Pc(319) int local319 = local310 & 0x7F;
							@Pc(330) boolean local330 = (local310 & 0x80) != 0;
							@Pc(337) long local337 = (long) ((local244 << 16) + local305);
							@Pc(347) Class3_Sub4_Sub9_Sub2 local347;
							if (local330) {
								for (local347 = (Class3_Sub4_Sub9_Sub2) this.aClass15_11.method897(); local347 != null && local337 != local347.aLong274; local347 = (Class3_Sub4_Sub9_Sub2) this.aClass15_11.method898()) {
								}
							} else {
								for (local347 = (Class3_Sub4_Sub9_Sub2) this.aClass15_9.method897(); local347 != null && local347.aLong274 != local337; local347 = (Class3_Sub4_Sub9_Sub2) this.aClass15_9.method898()) {
								}
							}
							if (local347 == null) {
								throw new IOException();
							}
							this.aClass3_Sub4_Sub9_Sub2_1 = local347;
							@Pc(406) int local406 = local319 == 0 ? 5 : 9;
							this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9 = new Class3_Sub3(local406 + local315 + this.aClass3_Sub4_Sub9_Sub2_1.aByte130);
							this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.method4220(local319);
							this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.method4265(local315);
							this.aClass3_Sub3_6.anInt4736 = 0;
							this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 = 8;
						} else if (this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub3_6.aByteArray54[0] == -1) {
							this.aClass3_Sub3_6.anInt4736 = 0;
							this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 = 1;
						} else {
							this.aClass3_Sub4_Sub9_Sub2_1 = null;
						}
					}
				} else {
					local216 = this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.aByteArray54.length - this.aClass3_Sub4_Sub9_Sub2_1.aByte130;
					local244 = 512 - this.aClass3_Sub4_Sub9_Sub2_1.anInt10125;
					if (local216 - this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.anInt4736 < local244) {
						local244 = local216 - this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.anInt4736;
					}
					if (local173 < local244) {
						local244 = local173;
					}
					this.aClass305_2.method7634(this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.aByteArray54, local244, this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.anInt4736);
					if (this.aByte104 != 0) {
						for (local305 = 0; local305 < local244; local305++) {
							this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.aByteArray54[local305 + this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.anInt4736] ^= this.aByte104;
						}
					}
					this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.anInt4736 += local244;
					this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 += local244;
					if (local216 == this.aClass3_Sub4_Sub9_Sub2_1.aClass3_Sub3_9.anInt4736) {
						this.aClass3_Sub4_Sub9_Sub2_1.method8732();
						this.aClass3_Sub4_Sub9_Sub2_1.aBoolean724 = false;
						this.aClass3_Sub4_Sub9_Sub2_1 = null;
					} else if (this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 == 512) {
						this.aClass3_Sub4_Sub9_Sub2_1.anInt10125 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(620) IOException local620) {
			try {
				this.aClass305_2.method7637();
			} catch (@Pc(626) Exception local626) {
			}
			this.aClass305_2 = null;
			this.anInt7431 = -2;
			this.anInt7432++;
			return this.method6458() == 0 && this.method6449() == 0;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Z")
	public boolean method6452() {
		return this.method6449() >= 20;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
	public void method6454() {
		if (this.aClass305_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub3_5.anInt4736 = 0;
			this.aClass3_Sub3_5.method4220(7);
			this.aClass3_Sub3_5.method4248(0);
			this.aClass305_2.method7636(4, this.aClass3_Sub3_5.aByteArray54);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass305_2.method7637();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt7432++;
			this.anInt7431 = -2;
			this.aClass305_2 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
	public void method6455() {
		if (this.aClass305_2 != null) {
			this.aClass305_2.method7637();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZB)V")
	public void method6456(@OriginalArg(0) boolean arg0) {
		if (this.aClass305_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub3_5.anInt4736 = 0;
			this.aClass3_Sub3_5.method4220(arg0 ? 2 : 3);
			this.aClass3_Sub3_5.method4248(0);
			this.aClass305_2.method7636(4, this.aClass3_Sub3_5.aByteArray54);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass305_2.method7637();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass305_2 = null;
			this.anInt7432++;
			this.anInt7431 = -2;
		}
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(I)Z")
	public boolean method6457() {
		return this.method6458() >= 20;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)I")
	public int method6458() {
		return this.aClass15_8.method896() + this.aClass15_9.method896();
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)V")
	private void method6460() {
		if (this.aClass305_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub3_5.anInt4736 = 0;
			this.aClass3_Sub3_5.method4220(6);
			this.aClass3_Sub3_5.method4248(3);
			this.aClass305_2.method7636(4, this.aClass3_Sub3_5.aByteArray54);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass305_2.method7637();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt7432++;
			this.anInt7431 = -2;
			this.aClass305_2 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIZII)Lclient!wl;")
	public Class3_Sub4_Sub9_Sub2 method6461(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg3);
		@Pc(19) Class3_Sub4_Sub9_Sub2 local19 = new Class3_Sub4_Sub9_Sub2();
		local19.aLong274 = local10;
		local19.aBoolean723 = arg2;
		local19.aByte130 = arg0;
		if (arg2) {
			if (this.method6458() >= 20) {
				throw new RuntimeException();
			}
			this.aClass15_8.method901(local19);
		} else if (this.method6449() < 20) {
			this.aClass15_10.method901(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V")
	public void method6462() {
		if (this.aClass305_2 != null) {
			this.aClass305_2.method7639();
		}
	}
}
