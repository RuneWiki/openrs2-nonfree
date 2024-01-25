import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class349 {

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	private int anInt9190;

	@OriginalMember(owner = "client!su", name = "z", descriptor = "Lclient!ss;")
	private Class348 aClass348_2;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "J")
	private long aLong303;

	@OriginalMember(owner = "client!su", name = "E", descriptor = "Lclient!jga;")
	private Class3_Sub7_Sub7_Sub1 aClass3_Sub7_Sub7_Sub1_2;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "Lclient!gw;")
	private final Class147 aClass147_8 = new Class147();

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Lclient!gw;")
	private final Class147 aClass147_9 = new Class147();

	@OriginalMember(owner = "client!su", name = "m", descriptor = "Lclient!gw;")
	private final Class147 aClass147_10 = new Class147();

	@OriginalMember(owner = "client!su", name = "h", descriptor = "Lclient!gw;")
	private final Class147 aClass147_11 = new Class147();

	@OriginalMember(owner = "client!su", name = "C", descriptor = "Lclient!ika;")
	private final Class3_Sub2 aClass3_Sub2_10 = new Class3_Sub2(4);

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	public volatile int anInt9191 = 0;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "B")
	private byte aByte134 = 0;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "I")
	public volatile int anInt9192 = 0;

	@OriginalMember(owner = "client!su", name = "H", descriptor = "Lclient!ika;")
	private final Class3_Sub2 aClass3_Sub2_11 = new Class3_Sub2(8);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZLclient!ss;)V")
	public void method7762(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class348 arg1) {
		if (this.aClass348_2 != null) {
			try {
				this.aClass348_2.method7741();
			} catch (@Pc(22) Exception local22) {
			}
			this.aClass348_2 = null;
		}
		this.aClass348_2 = arg1;
		this.method7775();
		this.method7769(arg0);
		this.aClass3_Sub7_Sub7_Sub1_2 = null;
		this.aClass3_Sub2_11.anInt2178 = 0;
		while (true) {
			@Pc(48) Class3_Sub7_Sub7_Sub1 local48 = (Class3_Sub7_Sub7_Sub1) this.aClass147_9.method3333();
			if (local48 == null) {
				while (true) {
					local48 = (Class3_Sub7_Sub7_Sub1) this.aClass147_11.method3333();
					if (local48 == null) {
						if (this.aByte134 != 0) {
							try {
								this.aClass3_Sub2_10.anInt2178 = 0;
								this.aClass3_Sub2_10.method2065(4);
								this.aClass3_Sub2_10.method2065(this.aByte134);
								this.aClass3_Sub2_10.method2032(0);
								this.aClass348_2.method7738(4, this.aClass3_Sub2_10.aByteArray20);
							} catch (@Pc(117) IOException local117) {
								try {
									this.aClass348_2.method7741();
								} catch (@Pc(123) Exception local123) {
								}
								this.anInt9192 = -2;
								this.anInt9191++;
								this.aClass348_2 = null;
							}
						}
						this.anInt9190 = 0;
						this.aLong303 = Static517.method6965();
						return;
					}
					this.aClass147_10.method3335(local48);
				}
			}
			this.aClass147_8.method3335(local48);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	public void method7763() {
		if (this.aClass348_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub2_10.anInt2178 = 0;
			this.aClass3_Sub2_10.method2065(7);
			this.aClass3_Sub2_10.method2045(0);
			this.aClass348_2.method7738(4, this.aClass3_Sub2_10.aByteArray20);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass348_2.method7741();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt9191++;
			this.anInt9192 = -2;
			this.aClass348_2 = null;
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
	public void method7765() {
		try {
			this.aClass348_2.method7741();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass348_2 = null;
		this.aByte134 = (byte) (int) ((double) 1 + Math.random() * 255.0D);
		this.anInt9192 = -1;
		this.anInt9191++;
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)I")
	private int method7766() {
		return this.aClass147_10.method3330() + this.aClass147_11.method3330();
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(I)Z")
	public boolean method7767() {
		return this.method7766() >= 20;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)V")
	public void method7769(@OriginalArg(1) boolean arg0) {
		if (this.aClass348_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub2_10.anInt2178 = 0;
			this.aClass3_Sub2_10.method2065(arg0 ? 2 : 3);
			this.aClass3_Sub2_10.method2045(0);
			this.aClass348_2.method7738(4, this.aClass3_Sub2_10.aByteArray20);
		} catch (@Pc(48) IOException local48) {
			try {
				this.aClass348_2.method7741();
			} catch (@Pc(54) Exception local54) {
			}
			this.aClass348_2 = null;
			this.anInt9191++;
			this.anInt9192 = -2;
		}
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)V")
	public void method7771() {
		if (this.aClass348_2 != null) {
			this.aClass348_2.method7741();
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(Z)Z")
	public boolean method7772() {
		@Pc(25) int local25;
		if (this.aClass348_2 != null) {
			@Pc(19) long local19 = Static517.method6965();
			local25 = (int) (local19 - this.aLong303);
			if (local25 > 200) {
				local25 = 200;
			}
			this.aLong303 = local19;
			this.anInt9190 += local25;
			if (this.anInt9190 > 30000) {
				try {
					this.aClass348_2.method7741();
				} catch (@Pc(51) Exception local51) {
				}
				this.aClass348_2 = null;
			}
		}
		if (this.aClass348_2 == null) {
			return this.method7779() == 0 && this.method7766() == 0;
		}
		try {
			this.aClass348_2.method7739();
			for (@Pc(87) Class3_Sub7_Sub7_Sub1 local87 = (Class3_Sub7_Sub7_Sub1) this.aClass147_8.method3334(); local87 != null; local87 = (Class3_Sub7_Sub7_Sub1) this.aClass147_8.method3332()) {
				this.aClass3_Sub2_10.anInt2178 = 0;
				this.aClass3_Sub2_10.method2065(1);
				this.aClass3_Sub2_10.method2045((int) local87.aLong336);
				this.aClass348_2.method7738(4, this.aClass3_Sub2_10.aByteArray20);
				this.aClass147_9.method3335(local87);
			}
			for (@Pc(135) Class3_Sub7_Sub7_Sub1 local135 = (Class3_Sub7_Sub7_Sub1) this.aClass147_10.method3334(); local135 != null; local135 = (Class3_Sub7_Sub7_Sub1) this.aClass147_10.method3332()) {
				this.aClass3_Sub2_10.anInt2178 = 0;
				this.aClass3_Sub2_10.method2065(0);
				this.aClass3_Sub2_10.method2045((int) local135.aLong336);
				this.aClass348_2.method7738(4, this.aClass3_Sub2_10.aByteArray20);
				this.aClass147_11.method3335(local135);
			}
			for (local25 = 0; local25 < 100; local25++) {
				@Pc(192) int local192 = this.aClass348_2.method7737();
				if (local192 < 0) {
					throw new IOException();
				}
				if (local192 == 0) {
					break;
				}
				this.anInt9190 = 0;
				@Pc(208) byte local208 = 0;
				if (this.aClass3_Sub7_Sub7_Sub1_2 == null) {
					local208 = 8;
				} else if (this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 == 0) {
					local208 = 1;
				}
				@Pc(236) int local236;
				@Pc(243) int local243;
				@Pc(290) int local290;
				if (local208 <= 0) {
					local236 = this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.aByteArray20.length - this.aClass3_Sub7_Sub7_Sub1_2.aByte67;
					local243 = 512 - this.aClass3_Sub7_Sub7_Sub1_2.anInt4923;
					if (local243 > local236 - this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.anInt2178) {
						local243 = local236 - this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.anInt2178;
					}
					if (local192 < local243) {
						local243 = local192;
					}
					this.aClass348_2.method7740(this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.aByteArray20, local243, this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.anInt2178);
					if (this.aByte134 != 0) {
						for (local290 = 0; local290 < local243; local290++) {
							this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.aByteArray20[local290 + this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.anInt2178] ^= this.aByte134;
						}
					}
					this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.anInt2178 += local243;
					this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 += local243;
					if (local236 == this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.anInt2178) {
						this.aClass3_Sub7_Sub7_Sub1_2.method9251();
						this.aClass3_Sub7_Sub7_Sub1_2.aBoolean537 = false;
						this.aClass3_Sub7_Sub7_Sub1_2 = null;
					} else if (this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 == 512) {
						this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 = 0;
					}
				} else {
					local236 = local208 - this.aClass3_Sub2_11.anInt2178;
					if (local236 > local192) {
						local236 = local192;
					}
					this.aClass348_2.method7740(this.aClass3_Sub2_11.aByteArray20, local236, this.aClass3_Sub2_11.anInt2178);
					if (this.aByte134 != 0) {
						for (local243 = 0; local243 < local236; local243++) {
							this.aClass3_Sub2_11.aByteArray20[local243 + this.aClass3_Sub2_11.anInt2178] ^= this.aByte134;
						}
					}
					this.aClass3_Sub2_11.anInt2178 += local236;
					if (this.aClass3_Sub2_11.anInt2178 >= local208) {
						if (this.aClass3_Sub7_Sub7_Sub1_2 == null) {
							this.aClass3_Sub2_11.anInt2178 = 0;
							local243 = this.aClass3_Sub2_11.method2048(255);
							local290 = this.aClass3_Sub2_11.method2028(-14795);
							@Pc(485) int local485 = this.aClass3_Sub2_11.method2048(255);
							@Pc(490) int local490 = this.aClass3_Sub2_11.method2036();
							@Pc(494) int local494 = local485 & 0x7F;
							@Pc(506) boolean local506 = (local485 & 0x80) != 0;
							@Pc(513) long local513 = (long) ((local243 << 16) + local290);
							@Pc(523) Class3_Sub7_Sub7_Sub1 local523;
							if (local506) {
								for (local523 = (Class3_Sub7_Sub7_Sub1) this.aClass147_11.method3334(); local523 != null && local513 != local523.aLong336; local523 = (Class3_Sub7_Sub7_Sub1) this.aClass147_11.method3332()) {
								}
							} else {
								for (local523 = (Class3_Sub7_Sub7_Sub1) this.aClass147_9.method3334(); local523 != null && local523.aLong336 != local513; local523 = (Class3_Sub7_Sub7_Sub1) this.aClass147_9.method3332()) {
								}
							}
							if (local523 == null) {
								throw new IOException();
							}
							this.aClass3_Sub7_Sub7_Sub1_2 = local523;
							@Pc(598) int local598 = local494 == 0 ? 5 : 9;
							this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3 = new Class3_Sub2(local490 + local598 + this.aClass3_Sub7_Sub7_Sub1_2.aByte67);
							this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.method2065(local494);
							this.aClass3_Sub7_Sub7_Sub1_2.aClass3_Sub2_3.method2018(local490);
							this.aClass3_Sub2_11.anInt2178 = 0;
							this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 = 8;
						} else if (this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub2_11.aByteArray20[0] == -1) {
							this.aClass3_Sub7_Sub7_Sub1_2.anInt4923 = 1;
							this.aClass3_Sub2_11.anInt2178 = 0;
						} else {
							this.aClass3_Sub7_Sub7_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(684) IOException local684) {
			try {
				this.aClass348_2.method7741();
			} catch (@Pc(690) Exception local690) {
			}
			this.anInt9191++;
			this.anInt9192 = -2;
			this.aClass348_2 = null;
			return this.method7779() == 0 && this.method7766() == 0;
		}
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Z")
	public boolean method7773() {
		return this.method7779() >= 20;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZIB)Lclient!jga;")
	public Class3_Sub7_Sub7_Sub1 method7774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(14) Class3_Sub7_Sub7_Sub1 local14 = new Class3_Sub7_Sub7_Sub1();
		local14.aByte67 = arg3;
		local14.aLong336 = local10;
		local14.aBoolean538 = arg2;
		if (arg2) {
			if (this.method7779() >= 20) {
				throw new RuntimeException();
			}
			this.aClass147_8.method3335(local14);
		} else if (this.method7766() < 20) {
			this.aClass147_10.method3335(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
	private void method7775() {
		if (this.aClass348_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub2_10.anInt2178 = 0;
			this.aClass3_Sub2_10.method2065(6);
			this.aClass3_Sub2_10.method2045(3);
			this.aClass348_2.method7738(4, this.aClass3_Sub2_10.aByteArray20);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass348_2.method7741();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt9192 = -2;
			this.aClass348_2 = null;
			this.anInt9191++;
		}
	}

	@OriginalMember(owner = "client!su", name = "h", descriptor = "(I)V")
	public void method7778() {
		if (this.aClass348_2 != null) {
			this.aClass348_2.method7736();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)I")
	public int method7779() {
		return this.aClass147_8.method3330() + this.aClass147_9.method3330();
	}
}
