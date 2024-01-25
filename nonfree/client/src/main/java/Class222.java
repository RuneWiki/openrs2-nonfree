import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class222 {

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
	private int anInt6357;

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Lclient!ue;")
	private Class226 aClass226_3;

	@OriginalMember(owner = "client!ua", name = "A", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "Lclient!wo;")
	private Class2_Sub7_Sub17_Sub2 aClass2_Sub7_Sub17_Sub2_2;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!pf;")
	private final Class179 aClass179_8 = new Class179();

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!pf;")
	private final Class179 aClass179_9 = new Class179();

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Lclient!pf;")
	private final Class179 aClass179_10 = new Class179();

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!pf;")
	private final Class179 aClass179_11 = new Class179();

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Lclient!vt;")
	private final Class2_Sub24 aClass2_Sub24_6 = new Class2_Sub24(4);

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "B")
	private byte aByte68 = 0;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
	public volatile int anInt6359 = 0;

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
	public volatile int anInt6358 = 0;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "Lclient!vt;")
	private final Class2_Sub24 aClass2_Sub24_7 = new Class2_Sub24(8);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method5517() {
		if (this.aClass226_3 != null) {
			this.aClass226_3.method5544();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!ue;B)V")
	public void method5518(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class226 arg1) {
		if (this.aClass226_3 != null) {
			try {
				this.aClass226_3.method5543();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass226_3 = null;
		}
		this.aClass226_3 = arg1;
		this.method5522();
		this.method5526(arg0);
		this.aClass2_Sub7_Sub17_Sub2_2 = null;
		this.aClass2_Sub24_7.anInt6669 = 0;
		while (true) {
			@Pc(40) Class2_Sub7_Sub17_Sub2 local40 = (Class2_Sub7_Sub17_Sub2) this.aClass179_9.method4490();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub7_Sub17_Sub2) this.aClass179_11.method4490();
					if (local40 == null) {
						if (this.aByte68 != 0) {
							try {
								this.aClass2_Sub24_6.anInt6669 = 0;
								this.aClass2_Sub24_6.method5746(4);
								this.aClass2_Sub24_6.method5746(this.aByte68);
								this.aClass2_Sub24_6.method5721(0);
								this.aClass226_3.method5549(4, this.aClass2_Sub24_6.aByteArray100);
							} catch (@Pc(98) IOException local98) {
								try {
									this.aClass226_3.method5543();
								} catch (@Pc(104) Exception local104) {
								}
								this.anInt6358 = -2;
								this.aClass226_3 = null;
								this.anInt6359++;
							}
						}
						this.anInt6357 = 0;
						this.aLong188 = Static101.method1805();
						return;
					}
					this.aClass179_10.method4491(local40);
				}
			}
			this.aClass179_8.method4491(local40);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public void method5519() {
		if (this.aClass226_3 != null) {
			this.aClass226_3.method5543();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Z")
	public boolean method5520() {
		return this.method5521() >= 20;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I")
	public int method5521() {
		return this.aClass179_8.method4493() + this.aClass179_9.method4493();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	private void method5522() {
		if (this.aClass226_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub24_6.anInt6669 = 0;
			this.aClass2_Sub24_6.method5746(6);
			this.aClass2_Sub24_6.method5741(3);
			this.aClass226_3.method5549(4, this.aClass2_Sub24_6.aByteArray100);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass226_3.method5543();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt6359++;
			this.aClass226_3 = null;
			this.anInt6358 = -2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public void method5523() {
		try {
			this.aClass226_3.method5543();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass226_3 = null;
		this.anInt6359++;
		this.aByte68 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt6358 = -1;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z")
	public boolean method5524() {
		return this.method5528() >= 20;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	public void method5525() {
		if (this.aClass226_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub24_6.anInt6669 = 0;
			this.aClass2_Sub24_6.method5746(7);
			this.aClass2_Sub24_6.method5741(0);
			this.aClass226_3.method5549(4, this.aClass2_Sub24_6.aByteArray100);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass226_3.method5543();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6359++;
			this.aClass226_3 = null;
			this.anInt6358 = -2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V")
	public void method5526(@OriginalArg(0) boolean arg0) {
		if (this.aClass226_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub24_6.anInt6669 = 0;
			this.aClass2_Sub24_6.method5746(arg0 ? 2 : 3);
			this.aClass2_Sub24_6.method5741(0);
			this.aClass226_3.method5549(4, this.aClass2_Sub24_6.aByteArray100);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass226_3.method5543();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass226_3 = null;
			this.anInt6358 = -2;
			this.anInt6359++;
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)I")
	private int method5528() {
		return this.aClass179_10.method4493() + this.aClass179_11.method4493();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BIIIZ)Lclient!wo;")
	public Class2_Sub7_Sub17_Sub2 method5529(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg2);
		@Pc(15) Class2_Sub7_Sub17_Sub2 local15 = new Class2_Sub7_Sub17_Sub2();
		local15.aByte78 = arg0;
		local15.aBoolean500 = arg3;
		local15.aLong209 = local11;
		if (arg3) {
			if (this.method5521() >= 20) {
				throw new RuntimeException();
			}
			this.aClass179_8.method4491(local15);
		} else if (this.method5528() < 20) {
			this.aClass179_10.method4491(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)Z")
	public boolean method5530() {
		@Pc(17) int local17;
		if (this.aClass226_3 != null) {
			@Pc(11) long local11 = Static101.method1805();
			local17 = (int) (local11 - this.aLong188);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong188 = local11;
			this.anInt6357 += local17;
			if (this.anInt6357 > 30000) {
				try {
					this.aClass226_3.method5543();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass226_3 = null;
			}
		}
		if (this.aClass226_3 == null) {
			return this.method5521() == 0 && this.method5528() == 0;
		}
		try {
			this.aClass226_3.method5542();
			for (@Pc(81) Class2_Sub7_Sub17_Sub2 local81 = (Class2_Sub7_Sub17_Sub2) this.aClass179_8.method4487(); local81 != null; local81 = (Class2_Sub7_Sub17_Sub2) this.aClass179_8.method4494()) {
				this.aClass2_Sub24_6.anInt6669 = 0;
				this.aClass2_Sub24_6.method5746(1);
				this.aClass2_Sub24_6.method5741((int) local81.aLong209);
				this.aClass226_3.method5549(4, this.aClass2_Sub24_6.aByteArray100);
				this.aClass179_9.method4491(local81);
			}
			for (@Pc(129) Class2_Sub7_Sub17_Sub2 local129 = (Class2_Sub7_Sub17_Sub2) this.aClass179_10.method4487(); local129 != null; local129 = (Class2_Sub7_Sub17_Sub2) this.aClass179_10.method4494()) {
				this.aClass2_Sub24_6.anInt6669 = 0;
				this.aClass2_Sub24_6.method5746(0);
				this.aClass2_Sub24_6.method5741((int) local129.aLong209);
				this.aClass226_3.method5549(4, this.aClass2_Sub24_6.aByteArray100);
				this.aClass179_11.method4491(local129);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(180) int local180 = this.aClass226_3.method5550();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt6357 = 0;
				@Pc(196) byte local196 = 0;
				if (this.aClass2_Sub7_Sub17_Sub2_2 == null) {
					local196 = 8;
				} else if (this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 == 0) {
					local196 = 1;
				}
				@Pc(225) int local225;
				@Pc(231) int local231;
				@Pc(275) int local275;
				if (local196 <= 0) {
					local225 = this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.aByteArray100.length - this.aClass2_Sub7_Sub17_Sub2_2.aByte78;
					local231 = 512 - this.aClass2_Sub7_Sub17_Sub2_2.anInt7074;
					if (local225 - this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.anInt6669 < local231) {
						local231 = local225 - this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.anInt6669;
					}
					if (local231 > local180) {
						local231 = local180;
					}
					this.aClass226_3.method5546(this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.aByteArray100, this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.anInt6669, local231);
					if (this.aByte68 != 0) {
						for (local275 = 0; local275 < local231; local275++) {
							this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.aByteArray100[local275 + this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.anInt6669] ^= this.aByte68;
						}
					}
					this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 += local231;
					this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.anInt6669 += local231;
					if (this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.anInt6669 == local225) {
						this.aClass2_Sub7_Sub17_Sub2_2.method6085();
						this.aClass2_Sub7_Sub17_Sub2_2.aBoolean502 = false;
						this.aClass2_Sub7_Sub17_Sub2_2 = null;
					} else if (this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 == 512) {
						this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 = 0;
					}
				} else {
					local225 = local196 - this.aClass2_Sub24_7.anInt6669;
					if (local180 < local225) {
						local225 = local180;
					}
					this.aClass226_3.method5546(this.aClass2_Sub24_7.aByteArray100, this.aClass2_Sub24_7.anInt6669, local225);
					if (this.aByte68 != 0) {
						for (local231 = 0; local231 < local225; local231++) {
							this.aClass2_Sub24_7.aByteArray100[this.aClass2_Sub24_7.anInt6669 + local231] ^= this.aByte68;
						}
					}
					this.aClass2_Sub24_7.anInt6669 += local225;
					if (this.aClass2_Sub24_7.anInt6669 >= local196) {
						if (this.aClass2_Sub7_Sub17_Sub2_2 == null) {
							this.aClass2_Sub24_7.anInt6669 = 0;
							local231 = this.aClass2_Sub24_7.method5732();
							local275 = this.aClass2_Sub24_7.method5753();
							@Pc(461) int local461 = this.aClass2_Sub24_7.method5732();
							@Pc(466) int local466 = this.aClass2_Sub24_7.method5776();
							@Pc(470) int local470 = local461 & 0x7F;
							@Pc(478) boolean local478 = (local461 & 0x80) != 0;
							@Pc(485) long local485 = (long) (local275 + (local231 << 16));
							@Pc(495) Class2_Sub7_Sub17_Sub2 local495;
							if (local478) {
								for (local495 = (Class2_Sub7_Sub17_Sub2) this.aClass179_11.method4487(); local495 != null && local485 != local495.aLong209; local495 = (Class2_Sub7_Sub17_Sub2) this.aClass179_11.method4494()) {
								}
							} else {
								for (local495 = (Class2_Sub7_Sub17_Sub2) this.aClass179_9.method4487(); local495 != null && local485 != local495.aLong209; local495 = (Class2_Sub7_Sub17_Sub2) this.aClass179_9.method4494()) {
								}
							}
							if (local495 == null) {
								throw new IOException();
							}
							this.aClass2_Sub7_Sub17_Sub2_2 = local495;
							@Pc(562) int local562 = local470 == 0 ? 5 : 9;
							this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8 = new Class2_Sub24(this.aClass2_Sub7_Sub17_Sub2_2.aByte78 + local562 + local466);
							this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.method5746(local470);
							this.aClass2_Sub7_Sub17_Sub2_2.aClass2_Sub24_8.method5734(local466);
							this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 = 8;
							this.aClass2_Sub24_7.anInt6669 = 0;
						} else if (this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub24_7.aByteArray100[0] == -1) {
							this.aClass2_Sub7_Sub17_Sub2_2.anInt7074 = 1;
							this.aClass2_Sub24_7.anInt6669 = 0;
						} else {
							this.aClass2_Sub7_Sub17_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(636) IOException local636) {
			try {
				this.aClass226_3.method5543();
			} catch (@Pc(642) Exception local642) {
			}
			this.anInt6358 = -2;
			this.anInt6359++;
			this.aClass226_3 = null;
			return this.method5521() == 0 && this.method5528() == 0;
		}
	}
}
