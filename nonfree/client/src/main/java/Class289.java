import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class289 {

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "Lclient!tg;")
	private Class310 aClass310_2;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
	private int anInt8679;

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!rs", name = "B", descriptor = "Lclient!tf;")
	private Class3_Sub4_Sub8_Sub2 aClass3_Sub4_Sub8_Sub2_1;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "Lclient!ca;")
	private final Class39 aClass39_5 = new Class39();

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!ca;")
	private final Class39 aClass39_6 = new Class39();

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "Lclient!ca;")
	private final Class39 aClass39_7 = new Class39();

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "Lclient!ca;")
	private final Class39 aClass39_8 = new Class39();

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "Lclient!fd;")
	private final Class3_Sub7 aClass3_Sub7_3 = new Class3_Sub7(4);

	@OriginalMember(owner = "client!rs", name = "x", descriptor = "B")
	private byte aByte88 = 0;

	@OriginalMember(owner = "client!rs", name = "A", descriptor = "I")
	public volatile int anInt8681 = 0;

	@OriginalMember(owner = "client!rs", name = "y", descriptor = "I")
	public volatile int anInt8680 = 0;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "Lclient!fd;")
	private final Class3_Sub7 aClass3_Sub7_4 = new Class3_Sub7(8);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BZIIB)Lclient!tf;")
	public Class3_Sub4_Sub8_Sub2 method7091(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) ((arg2 << 16) + arg1);
		@Pc(14) Class3_Sub4_Sub8_Sub2 local14 = new Class3_Sub4_Sub8_Sub2();
		local14.aBoolean780 = arg0;
		local14.aLong259 = local10;
		local14.aByte102 = arg3;
		if (arg0) {
			if (this.method7101() >= 20) {
				throw new RuntimeException();
			}
			this.aClass39_5.method1273(local14);
		} else if (this.method7102() < 20) {
			this.aClass39_7.method1273(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public void method7092() {
		if (this.aClass310_2 != null) {
			this.aClass310_2.method7571();
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)Z")
	public boolean method7093() {
		return this.method7102() >= 20;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)Z")
	public boolean method7094() {
		@Pc(14) int local14;
		if (this.aClass310_2 != null) {
			@Pc(7) long local7 = Static376.method6088();
			local14 = (int) (local7 - this.aLong214);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong214 = local7;
			this.anInt8679 += local14;
			if (this.anInt8679 > 30000) {
				try {
					this.aClass310_2.method7568();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass310_2 = null;
			}
		}
		if (this.aClass310_2 == null) {
			return this.method7101() == 0 && this.method7102() == 0;
		}
		try {
			this.aClass310_2.method7576();
			for (@Pc(73) Class3_Sub4_Sub8_Sub2 local73 = (Class3_Sub4_Sub8_Sub2) this.aClass39_5.method1270(); local73 != null; local73 = (Class3_Sub4_Sub8_Sub2) this.aClass39_5.method1275()) {
				this.aClass3_Sub7_3.anInt7869 = 0;
				this.aClass3_Sub7_3.method6494(1);
				this.aClass3_Sub7_3.method6509((int) local73.aLong259);
				this.aClass310_2.method7573(4, this.aClass3_Sub7_3.aByteArray86);
				this.aClass39_6.method1273(local73);
			}
			for (@Pc(119) Class3_Sub4_Sub8_Sub2 local119 = (Class3_Sub4_Sub8_Sub2) this.aClass39_7.method1270(); local119 != null; local119 = (Class3_Sub4_Sub8_Sub2) this.aClass39_7.method1275()) {
				this.aClass3_Sub7_3.anInt7869 = 0;
				this.aClass3_Sub7_3.method6494(0);
				this.aClass3_Sub7_3.method6509((int) local119.aLong259);
				this.aClass310_2.method7573(4, this.aClass3_Sub7_3.aByteArray86);
				this.aClass39_8.method1273(local119);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(176) int local176 = this.aClass310_2.method7570();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt8679 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass3_Sub4_Sub8_Sub2_1 == null) {
					local192 = 8;
				} else if (this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 == 0) {
					local192 = 1;
				}
				@Pc(220) int local220;
				@Pc(244) int local244;
				@Pc(305) int local305;
				if (local192 > 0) {
					local220 = local192 - this.aClass3_Sub7_4.anInt7869;
					if (local176 < local220) {
						local220 = local176;
					}
					this.aClass310_2.method7574(local220, this.aClass3_Sub7_4.aByteArray86, this.aClass3_Sub7_4.anInt7869);
					if (this.aByte88 != 0) {
						for (local244 = 0; local244 < local220; local244++) {
							this.aClass3_Sub7_4.aByteArray86[this.aClass3_Sub7_4.anInt7869 + local244] ^= this.aByte88;
						}
					}
					this.aClass3_Sub7_4.anInt7869 += local220;
					if (this.aClass3_Sub7_4.anInt7869 >= local192) {
						if (this.aClass3_Sub4_Sub8_Sub2_1 == null) {
							this.aClass3_Sub7_4.anInt7869 = 0;
							local244 = this.aClass3_Sub7_4.method6538();
							local305 = this.aClass3_Sub7_4.method6535();
							@Pc(310) int local310 = this.aClass3_Sub7_4.method6538();
							@Pc(315) int local315 = this.aClass3_Sub7_4.method6497();
							@Pc(319) int local319 = local310 & 0x7F;
							@Pc(327) boolean local327 = (local310 & 0x80) != 0;
							@Pc(334) long local334 = (long) (local305 + (local244 << 16));
							@Pc(344) Class3_Sub4_Sub8_Sub2 local344;
							if (local327) {
								for (local344 = (Class3_Sub4_Sub8_Sub2) this.aClass39_8.method1270(); local344 != null && local344.aLong259 != local334; local344 = (Class3_Sub4_Sub8_Sub2) this.aClass39_8.method1275()) {
								}
							} else {
								for (local344 = (Class3_Sub4_Sub8_Sub2) this.aClass39_6.method1270(); local344 != null && local344.aLong259 != local334; local344 = (Class3_Sub4_Sub8_Sub2) this.aClass39_6.method1275()) {
								}
							}
							if (local344 == null) {
								throw new IOException();
							}
							this.aClass3_Sub4_Sub8_Sub2_1 = local344;
							@Pc(404) int local404 = local319 == 0 ? 5 : 9;
							this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6 = new Class3_Sub7(local315 + local404 + this.aClass3_Sub4_Sub8_Sub2_1.aByte102);
							this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.method6494(local319);
							this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.method6495(local315);
							this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 = 8;
							this.aClass3_Sub7_4.anInt7869 = 0;
						} else if (this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub7_4.aByteArray86[0] == -1) {
							this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 = 1;
							this.aClass3_Sub7_4.anInt7869 = 0;
						} else {
							this.aClass3_Sub4_Sub8_Sub2_1 = null;
						}
					}
				} else {
					local220 = this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.aByteArray86.length - this.aClass3_Sub4_Sub8_Sub2_1.aByte102;
					local244 = 512 - this.aClass3_Sub4_Sub8_Sub2_1.anInt9302;
					if (local244 > local220 - this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.anInt7869) {
						local244 = local220 - this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.anInt7869;
					}
					if (local244 > local176) {
						local244 = local176;
					}
					this.aClass310_2.method7574(local244, this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.aByteArray86, this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.anInt7869);
					if (this.aByte88 != 0) {
						for (local305 = 0; local305 < local244; local305++) {
							this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.aByteArray86[local305 + this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.anInt7869] ^= this.aByte88;
						}
					}
					this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 += local244;
					this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.anInt7869 += local244;
					if (local220 == this.aClass3_Sub4_Sub8_Sub2_1.aClass3_Sub7_6.anInt7869) {
						this.aClass3_Sub4_Sub8_Sub2_1.method8309();
						this.aClass3_Sub4_Sub8_Sub2_1.aBoolean781 = false;
						this.aClass3_Sub4_Sub8_Sub2_1 = null;
					} else if (this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 == 512) {
						this.aClass3_Sub4_Sub8_Sub2_1.anInt9302 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.aClass310_2.method7568();
			} catch (@Pc(625) Exception local625) {
			}
			this.anInt8680 = -2;
			this.anInt8681++;
			this.aClass310_2 = null;
			return this.method7101() == 0 && this.method7102() == 0;
		}
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)V")
	public void method7095() {
		try {
			this.aClass310_2.method7568();
		} catch (@Pc(17) Exception local17) {
		}
		this.aClass310_2 = null;
		this.aByte88 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt8680 = -1;
		this.anInt8681++;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)V")
	public void method7096(@OriginalArg(0) boolean arg0) {
		if (this.aClass310_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub7_3.anInt7869 = 0;
			this.aClass3_Sub7_3.method6494(arg0 ? 2 : 3);
			this.aClass3_Sub7_3.method6509(0);
			this.aClass310_2.method7573(4, this.aClass3_Sub7_3.aByteArray86);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass310_2.method7568();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt8680 = -2;
			this.aClass310_2 = null;
			this.anInt8681++;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZZLclient!tg;)V")
	public void method7097(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class310 arg1) {
		if (this.aClass310_2 != null) {
			try {
				this.aClass310_2.method7568();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass310_2 = null;
		}
		this.aClass310_2 = arg1;
		this.method7104();
		this.method7096(arg0);
		this.aClass3_Sub7_4.anInt7869 = 0;
		this.aClass3_Sub4_Sub8_Sub2_1 = null;
		while (true) {
			@Pc(42) Class3_Sub4_Sub8_Sub2 local42 = (Class3_Sub4_Sub8_Sub2) this.aClass39_6.method1276();
			if (local42 == null) {
				while (true) {
					local42 = (Class3_Sub4_Sub8_Sub2) this.aClass39_8.method1276();
					if (local42 == null) {
						if (this.aByte88 != 0) {
							try {
								this.aClass3_Sub7_3.anInt7869 = 0;
								this.aClass3_Sub7_3.method6494(4);
								this.aClass3_Sub7_3.method6494(this.aByte88);
								this.aClass3_Sub7_3.method6528(0);
								this.aClass310_2.method7573(4, this.aClass3_Sub7_3.aByteArray86);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass310_2.method7568();
								} catch (@Pc(108) Exception local108) {
								}
								this.aClass310_2 = null;
								this.anInt8680 = -2;
								this.anInt8681++;
							}
						}
						this.anInt8679 = 0;
						this.aLong214 = Static376.method6088();
						return;
					}
					this.aClass39_7.method1273(local42);
				}
			}
			this.aClass39_5.method1273(local42);
		}
	}

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "(B)V")
	public void method7098() {
		if (this.aClass310_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub7_3.anInt7869 = 0;
			this.aClass3_Sub7_3.method6494(7);
			this.aClass3_Sub7_3.method6509(0);
			this.aClass310_2.method7573(4, this.aClass3_Sub7_3.aByteArray86);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass310_2.method7568();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass310_2 = null;
			this.anInt8681++;
			this.anInt8680 = -2;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Z")
	public boolean method7100() {
		return this.method7101() >= 20;
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(B)I")
	public int method7101() {
		return this.aClass39_5.method1278() + this.aClass39_6.method1278();
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)I")
	private int method7102() {
		return this.aClass39_7.method1278() + this.aClass39_8.method1278();
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(B)V")
	public void method7103() {
		if (this.aClass310_2 != null) {
			this.aClass310_2.method7568();
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V")
	private void method7104() {
		if (this.aClass310_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub7_3.anInt7869 = 0;
			this.aClass3_Sub7_3.method6494(6);
			this.aClass3_Sub7_3.method6509(3);
			this.aClass310_2.method7573(4, this.aClass3_Sub7_3.aByteArray86);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass310_2.method7568();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt8680 = -2;
			this.aClass310_2 = null;
			this.anInt8681++;
		}
	}
}
