import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class21 {

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Lclient!dk;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "Lclient!cg;")
	private Class2_Sub8_Sub2_Sub1 aClass2_Sub8_Sub2_Sub1_1;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "Lclient!ea;")
	private Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!ea;")
	private Class37 aClass37_2 = new Class37();

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Lclient!ea;")
	private Class37 aClass37_3 = new Class37();

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "Lclient!ea;")
	private Class37 aClass37_4 = new Class37();

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "Lclient!oe;")
	private Class2_Sub16 aClass2_Sub16_1 = new Class2_Sub16(4);

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	public volatile int anInt641 = 0;

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
	public volatile int anInt640 = 0;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Lclient!oe;")
	private Class2_Sub16 aClass2_Sub16_2 = new Class2_Sub16(8);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	public void method550() {
		if (this.aClass34_1 != null) {
			this.aClass34_1.method1077();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z")
	public boolean method551() {
		return this.method555() >= 20;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Z")
	public boolean method552() {
		if (this.aClass34_1 != null) {
			@Pc(12) long local12 = Static221.method3670();
			@Pc(19) int local19 = (int) (local12 - this.aLong26);
			this.aLong26 = local12;
			if (local19 > 200) {
				local19 = 200;
			}
			this.anInt639 += local19;
			if (this.anInt639 > 30000) {
				try {
					this.aClass34_1.method1077();
				} catch (@Pc(49) Exception local49) {
				}
				this.aClass34_1 = null;
			}
		}
		if (this.aClass34_1 == null) {
			return this.method559() == 0 && this.method555() == 0;
		}
		try {
			this.aClass34_1.method1072();
			@Pc(88) Class2_Sub8_Sub2_Sub1 local88;
			for (local88 = (Class2_Sub8_Sub2_Sub1) this.aClass37_1.method1139(); local88 != null; local88 = (Class2_Sub8_Sub2_Sub1) this.aClass37_1.method1145()) {
				this.aClass2_Sub16_1.anInt2789 = 0;
				this.aClass2_Sub16_1.method2168(1);
				this.aClass2_Sub16_1.method2190((int) local88.aLong212);
				this.aClass34_1.method1076(this.aClass2_Sub16_1.aByteArray17, 4);
				this.aClass37_2.method1144(local88);
			}
			for (local88 = (Class2_Sub8_Sub2_Sub1) this.aClass37_3.method1139(); local88 != null; local88 = (Class2_Sub8_Sub2_Sub1) this.aClass37_3.method1145()) {
				this.aClass2_Sub16_1.anInt2789 = 0;
				this.aClass2_Sub16_1.method2168(0);
				this.aClass2_Sub16_1.method2190((int) local88.aLong212);
				this.aClass34_1.method1076(this.aClass2_Sub16_1.aByteArray17, 4);
				this.aClass37_4.method1144(local88);
			}
			for (@Pc(176) int local176 = 0; local176 < 100; local176++) {
				@Pc(186) int local186 = this.aClass34_1.method1073();
				if (local186 < 0) {
					throw new IOException();
				}
				if (local186 == 0) {
					break;
				}
				this.anInt639 = 0;
				@Pc(207) byte local207 = 0;
				if (this.aClass2_Sub8_Sub2_Sub1_1 == null) {
					local207 = 8;
				} else if (this.aClass2_Sub8_Sub2_Sub1_1.anInt934 == 0) {
					local207 = 1;
				}
				@Pc(233) int local233;
				@Pc(261) int local261;
				@Pc(320) int local320;
				if (local207 > 0) {
					local233 = local207 - this.aClass2_Sub16_2.anInt2789;
					if (local233 > local186) {
						local233 = local186;
					}
					this.aClass34_1.method1074(this.aClass2_Sub16_2.anInt2789, local233, this.aClass2_Sub16_2.aByteArray17);
					if (this.aByte1 != 0) {
						for (local261 = 0; local261 < local233; local261++) {
							this.aClass2_Sub16_2.aByteArray17[local261 + this.aClass2_Sub16_2.anInt2789] ^= this.aByte1;
						}
					}
					this.aClass2_Sub16_2.anInt2789 += local233;
					if (this.aClass2_Sub16_2.anInt2789 >= local207) {
						if (this.aClass2_Sub8_Sub2_Sub1_1 == null) {
							this.aClass2_Sub16_2.anInt2789 = 0;
							local261 = this.aClass2_Sub16_2.method2146();
							local320 = this.aClass2_Sub16_2.method2130();
							@Pc(325) int local325 = this.aClass2_Sub16_2.method2146();
							@Pc(336) boolean local336 = (local325 & 0x80) != 0;
							@Pc(341) int local341 = this.aClass2_Sub16_2.method2145();
							@Pc(348) long local348 = (long) (local320 + (local261 << 16));
							@Pc(352) int local352 = local325 & 0x7F;
							@Pc(362) Class2_Sub8_Sub2_Sub1 local362;
							if (local336) {
								for (local362 = (Class2_Sub8_Sub2_Sub1) this.aClass37_4.method1139(); local362 != null && local362.aLong212 != local348; local362 = (Class2_Sub8_Sub2_Sub1) this.aClass37_4.method1145()) {
								}
							} else {
								for (local362 = (Class2_Sub8_Sub2_Sub1) this.aClass37_2.method1139(); local362 != null && local348 != local362.aLong212; local362 = (Class2_Sub8_Sub2_Sub1) this.aClass37_2.method1145()) {
								}
							}
							if (local362 == null) {
								throw new IOException();
							}
							@Pc(421) int local421 = local352 == 0 ? 5 : 9;
							this.aClass2_Sub8_Sub2_Sub1_1 = local362;
							this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3 = new Class2_Sub16(local421 + local341 + this.aClass2_Sub8_Sub2_Sub1_1.aByte2);
							this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.method2168(local352);
							this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.method2186(local341);
							this.aClass2_Sub8_Sub2_Sub1_1.anInt934 = 8;
							this.aClass2_Sub16_2.anInt2789 = 0;
						} else if (this.aClass2_Sub8_Sub2_Sub1_1.anInt934 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub16_2.aByteArray17[0] == -1) {
							this.aClass2_Sub8_Sub2_Sub1_1.anInt934 = 1;
							this.aClass2_Sub16_2.anInt2789 = 0;
						} else {
							this.aClass2_Sub8_Sub2_Sub1_1 = null;
						}
					}
				} else {
					local261 = 512 - this.aClass2_Sub8_Sub2_Sub1_1.anInt934;
					local233 = this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.aByteArray17.length - this.aClass2_Sub8_Sub2_Sub1_1.aByte2;
					if (local261 > local233 - this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.anInt2789) {
						local261 = local233 - this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.anInt2789;
					}
					if (local186 < local261) {
						local261 = local186;
					}
					this.aClass34_1.method1074(this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.anInt2789, local261, this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.aByteArray17);
					if (this.aByte1 != 0) {
						for (local320 = 0; local320 < local261; local320++) {
							this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.aByteArray17[local320 + this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.anInt2789] ^= this.aByte1;
						}
					}
					this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.anInt2789 += local261;
					this.aClass2_Sub8_Sub2_Sub1_1.anInt934 += local261;
					if (local233 == this.aClass2_Sub8_Sub2_Sub1_1.aClass2_Sub16_3.anInt2789) {
						this.aClass2_Sub8_Sub2_Sub1_1.method4686();
						this.aClass2_Sub8_Sub2_Sub1_1.aBoolean272 = false;
						this.aClass2_Sub8_Sub2_Sub1_1 = null;
					} else if (this.aClass2_Sub8_Sub2_Sub1_1.anInt934 == 512) {
						this.aClass2_Sub8_Sub2_Sub1_1.anInt934 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(653) IOException local653) {
			try {
				this.aClass34_1.method1077();
			} catch (@Pc(659) Exception local659) {
			}
			this.anInt641++;
			this.aClass34_1 = null;
			this.anInt640 = -2;
			return this.method559() == 0 && this.method555() == 0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method554() {
		if (this.aClass34_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub16_1.anInt2789 = 0;
			this.aClass2_Sub16_1.method2168(7);
			this.aClass2_Sub16_1.method2190(0);
			this.aClass34_1.method1076(this.aClass2_Sub16_1.aByteArray17, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass34_1.method1077();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass34_1 = null;
			this.anInt641++;
			this.anInt640 = -2;
		}
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)I")
	private int method555() {
		return this.aClass37_3.method1143() + this.aClass37_4.method1143();
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V")
	public void method556() {
		try {
			this.aClass34_1.method1077();
		} catch (@Pc(10) Exception local10) {
		}
		this.aClass34_1 = null;
		this.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt640 = -1;
		this.anInt641++;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZILclient!dk;)V")
	public void method557(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class34 arg1) {
		if (this.aClass34_1 != null) {
			try {
				this.aClass34_1.method1077();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass34_1 = null;
		}
		this.aClass34_1 = arg1;
		this.method562();
		this.method563(arg0);
		this.aClass2_Sub8_Sub2_Sub1_1 = null;
		this.aClass2_Sub16_2.anInt2789 = 0;
		while (true) {
			@Pc(46) Class2_Sub8_Sub2_Sub1 local46 = (Class2_Sub8_Sub2_Sub1) this.aClass37_2.method1146();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub8_Sub2_Sub1) this.aClass37_4.method1146();
					if (local46 == null) {
						if (this.aByte1 != 0) {
							try {
								this.aClass2_Sub16_1.anInt2789 = 0;
								this.aClass2_Sub16_1.method2168(4);
								this.aClass2_Sub16_1.method2168(this.aByte1);
								this.aClass2_Sub16_1.method2143(0);
								this.aClass34_1.method1076(this.aClass2_Sub16_1.aByteArray17, 4);
							} catch (@Pc(112) IOException local112) {
								try {
									this.aClass34_1.method1077();
								} catch (@Pc(118) Exception local118) {
								}
								this.anInt641++;
								this.anInt640 = -2;
								this.aClass34_1 = null;
							}
						}
						this.anInt639 = 0;
						this.aLong26 = Static221.method3670();
						return;
					}
					this.aClass37_3.method1144(local46);
				}
			}
			this.aClass37_1.method1144(local46);
		}
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)I")
	public int method559() {
		return this.aClass37_1.method1143() + this.aClass37_2.method1143();
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V")
	public void method560() {
		if (this.aClass34_1 != null) {
			this.aClass34_1.method1075();
		}
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z")
	public boolean method561() {
		return this.method559() >= 20;
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V")
	private void method562() {
		if (this.aClass34_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub16_1.anInt2789 = 0;
			this.aClass2_Sub16_1.method2168(6);
			this.aClass2_Sub16_1.method2190(3);
			this.aClass34_1.method1076(this.aClass2_Sub16_1.aByteArray17, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass34_1.method1077();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt640 = -2;
			this.anInt641++;
			this.aClass34_1 = null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V")
	public void method563(@OriginalArg(1) boolean arg0) {
		if (this.aClass34_1 == null) {
			return;
		}
		try {
			this.aClass2_Sub16_1.anInt2789 = 0;
			this.aClass2_Sub16_1.method2168(arg0 ? 2 : 3);
			this.aClass2_Sub16_1.method2190(0);
			this.aClass34_1.method1076(this.aClass2_Sub16_1.aByteArray17, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass34_1.method1077();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass34_1 = null;
			this.anInt640 = -2;
			this.anInt641++;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBIIZ)Lclient!cg;")
	public Class2_Sub8_Sub2_Sub1 method564(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) long local6 = (long) (arg1 + (arg2 << 16));
		@Pc(14) Class2_Sub8_Sub2_Sub1 local14 = new Class2_Sub8_Sub2_Sub1();
		local14.aLong212 = local6;
		local14.aBoolean271 = arg3;
		local14.aByte2 = arg0;
		if (arg3) {
			if (this.method559() >= 20) {
				throw new RuntimeException();
			}
			this.aClass37_1.method1144(local14);
		} else if (this.method555() < 20) {
			this.aClass37_3.method1144(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}
}
