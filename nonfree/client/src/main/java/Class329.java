import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class329 {

	@OriginalMember(owner = "client!uh", name = "A", descriptor = "J")
	private long aLong250;

	@OriginalMember(owner = "client!uh", name = "B", descriptor = "Lclient!qg;")
	private Class272 aClass272_2;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
	private int anInt9521;

	@OriginalMember(owner = "client!uh", name = "H", descriptor = "Lclient!cga;")
	private Class4_Sub5_Sub3_Sub1 aClass4_Sub5_Sub3_Sub1_2;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!an;")
	private final Class18 aClass18_8 = new Class18();

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!an;")
	private final Class18 aClass18_9 = new Class18();

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!an;")
	private final Class18 aClass18_10 = new Class18();

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Lclient!an;")
	private final Class18 aClass18_11 = new Class18();

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "Lclient!un;")
	private final Class4_Sub11 aClass4_Sub11_6 = new Class4_Sub11(4);

	@OriginalMember(owner = "client!uh", name = "F", descriptor = "B")
	private byte aByte121 = 0;

	@OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
	public volatile int anInt9523 = 0;

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
	public volatile int anInt9522 = 0;

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "Lclient!un;")
	private final Class4_Sub11 aClass4_Sub11_7 = new Class4_Sub11(8);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)V")
	public void method7760(@OriginalArg(0) boolean arg0) {
		if (this.aClass272_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_6.anInt5831 = 0;
			this.aClass4_Sub11_6.method4957(arg0 ? 2 : 3);
			this.aClass4_Sub11_6.method4893(0);
			this.aClass272_2.method6615(this.aClass4_Sub11_6.aByteArray68, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass272_2.method6618();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt9523++;
			this.anInt9522 = -2;
			this.aClass272_2 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I")
	public int method7761() {
		return this.aClass18_8.method224() + this.aClass18_9.method224();
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Z")
	public boolean method7762() {
		return this.method7769() >= 20;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	public void method7763() {
		try {
			this.aClass272_2.method6618();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass272_2 = null;
		this.aByte121 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt9522 = -1;
		this.anInt9523++;
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	public void method7764() {
		if (this.aClass272_2 != null) {
			this.aClass272_2.method6619();
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V")
	public void method7765() {
		if (this.aClass272_2 != null) {
			this.aClass272_2.method6618();
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZLclient!qg;)V")
	public void method7766(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class272 arg1) {
		if (this.aClass272_2 != null) {
			try {
				this.aClass272_2.method6618();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass272_2 = null;
		}
		this.aClass272_2 = arg1;
		this.method7774();
		this.method7760(arg0);
		this.aClass4_Sub11_7.anInt5831 = 0;
		this.aClass4_Sub5_Sub3_Sub1_2 = null;
		while (true) {
			@Pc(40) Class4_Sub5_Sub3_Sub1 local40 = (Class4_Sub5_Sub3_Sub1) this.aClass18_9.method226();
			if (local40 == null) {
				while (true) {
					@Pc(63) Class4_Sub5_Sub3_Sub1 local63 = (Class4_Sub5_Sub3_Sub1) this.aClass18_11.method226();
					if (local63 == null) {
						if (this.aByte121 != 0) {
							try {
								this.aClass4_Sub11_6.anInt5831 = 0;
								this.aClass4_Sub11_6.method4957(4);
								this.aClass4_Sub11_6.method4957(this.aByte121);
								this.aClass4_Sub11_6.method4937(0);
								this.aClass272_2.method6615(this.aClass4_Sub11_6.aByteArray68, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass272_2.method6618();
								} catch (@Pc(115) Exception local115) {
								}
								this.anInt9522 = -2;
								this.anInt9523++;
								this.aClass272_2 = null;
							}
						}
						this.anInt9521 = 0;
						this.aLong250 = Static574.method8210();
						return;
					}
					this.aClass18_10.method219(local63);
				}
			}
			this.aClass18_8.method219(local40);
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)Z")
	public boolean method7767() {
		return this.method7761() >= 20;
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)I")
	private int method7769() {
		return this.aClass18_10.method224() + this.aClass18_11.method224();
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(B)V")
	public void method7771() {
		if (this.aClass272_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_6.anInt5831 = 0;
			this.aClass4_Sub11_6.method4957(7);
			this.aClass4_Sub11_6.method4893(0);
			this.aClass272_2.method6615(this.aClass4_Sub11_6.aByteArray68, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass272_2.method6618();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt9522 = -2;
			this.anInt9523++;
			this.aClass272_2 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZBB)Lclient!cga;")
	public Class4_Sub5_Sub3_Sub1 method7772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg0);
		@Pc(15) Class4_Sub5_Sub3_Sub1 local15 = new Class4_Sub5_Sub3_Sub1();
		local15.aBoolean278 = arg2;
		local15.aLong257 = local11;
		local15.aByte12 = arg3;
		if (arg2) {
			if (this.method7761() >= 20) {
				throw new RuntimeException();
			}
			this.aClass18_8.method219(local15);
		} else if (this.method7769() < 20) {
			this.aClass18_10.method219(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Z")
	public boolean method7773() {
		@Pc(14) int local14;
		if (this.aClass272_2 != null) {
			@Pc(7) long local7 = Static574.method8210();
			local14 = (int) (local7 - this.aLong250);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong250 = local7;
			this.anInt9521 += local14;
			if (this.anInt9521 > 30000) {
				try {
					this.aClass272_2.method6618();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass272_2 = null;
			}
		}
		if (this.aClass272_2 == null) {
			return this.method7761() == 0 && this.method7769() == 0;
		}
		try {
			this.aClass272_2.method6613();
			for (@Pc(79) Class4_Sub5_Sub3_Sub1 local79 = (Class4_Sub5_Sub3_Sub1) this.aClass18_8.method221(); local79 != null; local79 = (Class4_Sub5_Sub3_Sub1) this.aClass18_8.method218()) {
				this.aClass4_Sub11_6.anInt5831 = 0;
				this.aClass4_Sub11_6.method4957(1);
				this.aClass4_Sub11_6.method4893((int) local79.aLong257);
				this.aClass272_2.method6615(this.aClass4_Sub11_6.aByteArray68, 4);
				this.aClass18_9.method219(local79);
			}
			for (@Pc(125) Class4_Sub5_Sub3_Sub1 local125 = (Class4_Sub5_Sub3_Sub1) this.aClass18_10.method221(); local125 != null; local125 = (Class4_Sub5_Sub3_Sub1) this.aClass18_10.method218()) {
				this.aClass4_Sub11_6.anInt5831 = 0;
				this.aClass4_Sub11_6.method4957(0);
				this.aClass4_Sub11_6.method4893((int) local125.aLong257);
				this.aClass272_2.method6615(this.aClass4_Sub11_6.aByteArray68, 4);
				this.aClass18_11.method219(local125);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(174) int local174 = this.aClass272_2.method6621();
				if (local174 < 0) {
					throw new IOException();
				}
				if (local174 == 0) {
					break;
				}
				this.anInt9521 = 0;
				@Pc(187) byte local187 = 0;
				if (this.aClass4_Sub5_Sub3_Sub1_2 == null) {
					local187 = 8;
				} else if (this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 == 0) {
					local187 = 1;
				}
				@Pc(213) int local213;
				@Pc(220) int local220;
				@Pc(267) int local267;
				if (local187 <= 0) {
					local213 = this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.aByteArray68.length - this.aClass4_Sub5_Sub3_Sub1_2.aByte12;
					local220 = 512 - this.aClass4_Sub5_Sub3_Sub1_2.anInt1036;
					if (local213 - this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.anInt5831 < local220) {
						local220 = local213 - this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.anInt5831;
					}
					if (local174 < local220) {
						local220 = local174;
					}
					this.aClass272_2.method6620(this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.anInt5831, this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.aByteArray68, local220);
					if (this.aByte121 != 0) {
						for (local267 = 0; local267 < local220; local267++) {
							this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.aByteArray68[local267 + this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.anInt5831] ^= this.aByte121;
						}
					}
					this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.anInt5831 += local220;
					this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 += local220;
					if (this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.anInt5831 == local213) {
						this.aClass4_Sub5_Sub3_Sub1_2.method8015();
						this.aClass4_Sub5_Sub3_Sub1_2.aBoolean279 = false;
						this.aClass4_Sub5_Sub3_Sub1_2 = null;
					} else if (this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 == 512) {
						this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 = 0;
					}
				} else {
					local213 = local187 - this.aClass4_Sub11_7.anInt5831;
					if (local174 < local213) {
						local213 = local174;
					}
					this.aClass272_2.method6620(this.aClass4_Sub11_7.anInt5831, this.aClass4_Sub11_7.aByteArray68, local213);
					if (this.aByte121 != 0) {
						for (local220 = 0; local220 < local213; local220++) {
							this.aClass4_Sub11_7.aByteArray68[this.aClass4_Sub11_7.anInt5831 + local220] = (byte) (this.aClass4_Sub11_7.aByteArray68[this.aClass4_Sub11_7.anInt5831 + local220] ^ this.aByte121);
						}
					}
					this.aClass4_Sub11_7.anInt5831 += local213;
					if (this.aClass4_Sub11_7.anInt5831 >= local187) {
						if (this.aClass4_Sub5_Sub3_Sub1_2 == null) {
							this.aClass4_Sub11_7.anInt5831 = 0;
							local220 = this.aClass4_Sub11_7.method4905();
							local267 = this.aClass4_Sub11_7.method4936();
							@Pc(448) int local448 = this.aClass4_Sub11_7.method4905();
							@Pc(453) int local453 = this.aClass4_Sub11_7.method4931();
							@Pc(457) int local457 = local448 & 0x7F;
							@Pc(465) boolean local465 = (local448 & 0x80) != 0;
							@Pc(472) long local472 = (long) (local267 + (local220 << 16));
							@Pc(482) Class4_Sub5_Sub3_Sub1 local482;
							if (local465) {
								for (local482 = (Class4_Sub5_Sub3_Sub1) this.aClass18_11.method221(); local482 != null && local482.aLong257 != local472; local482 = (Class4_Sub5_Sub3_Sub1) this.aClass18_11.method218()) {
								}
							} else {
								for (local482 = (Class4_Sub5_Sub3_Sub1) this.aClass18_9.method221(); local482 != null && local472 != local482.aLong257; local482 = (Class4_Sub5_Sub3_Sub1) this.aClass18_9.method218()) {
								}
							}
							if (local482 == null) {
								throw new IOException();
							}
							this.aClass4_Sub5_Sub3_Sub1_2 = local482;
							@Pc(538) int local538 = local457 == 0 ? 5 : 9;
							this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1 = new Class4_Sub11(local453 + local538 + this.aClass4_Sub5_Sub3_Sub1_2.aByte12);
							this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.method4957(local457);
							this.aClass4_Sub5_Sub3_Sub1_2.aClass4_Sub11_1.method4909(local453);
							this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 = 8;
							this.aClass4_Sub11_7.anInt5831 = 0;
						} else if (this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub11_7.aByteArray68[0] == -1) {
							this.aClass4_Sub11_7.anInt5831 = 0;
							this.aClass4_Sub5_Sub3_Sub1_2.anInt1036 = 1;
						} else {
							this.aClass4_Sub5_Sub3_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(612) IOException local612) {
			try {
				this.aClass272_2.method6618();
			} catch (@Pc(620) Exception local620) {
			}
			this.aClass272_2 = null;
			this.anInt9523++;
			this.anInt9522 = -2;
			return this.method7761() == 0 && this.method7769() == 0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
	private void method7774() {
		if (this.aClass272_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_6.anInt5831 = 0;
			this.aClass4_Sub11_6.method4957(6);
			this.aClass4_Sub11_6.method4893(3);
			this.aClass272_2.method6615(this.aClass4_Sub11_6.aByteArray68, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass272_2.method6618();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt9523++;
			this.anInt9522 = -2;
			this.aClass272_2 = null;
		}
	}
}
