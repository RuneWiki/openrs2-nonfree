import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class113 {

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!ws;")
	private Class375 aClass375_1;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	private int anInt4111;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!oe;")
	private Class8_Sub5_Sub13_Sub1 aClass8_Sub5_Sub13_Sub1_1;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!sc;")
	private final Class302 aClass302_3 = new Class302();

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!sc;")
	private final Class302 aClass302_4 = new Class302();

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!sc;")
	private final Class302 aClass302_5 = new Class302();

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!sc;")
	private final Class302 aClass302_6 = new Class302();

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!ig;")
	private final Class8_Sub8 aClass8_Sub8_2 = new Class8_Sub8(4);

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public volatile int anInt4112 = 0;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "B")
	private byte aByte47 = 0;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
	public volatile int anInt4113 = 0;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!ig;")
	private final Class8_Sub8 aClass8_Sub8_3 = new Class8_Sub8(8);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method3332() {
		try {
			this.aClass375_1.method8605();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass375_1 = null;
		this.anInt4113 = -1;
		this.anInt4112++;
		this.aByte47 = (byte) ((double) 255 * Math.random() + 1.0D);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public void method3333() {
		if (this.aClass375_1 == null) {
			return;
		}
		try {
			this.aClass8_Sub8_2.anInt10588 = 0;
			this.aClass8_Sub8_2.method8562(7);
			this.aClass8_Sub8_2.method8542(0);
			this.aClass375_1.method8609(this.aClass8_Sub8_2.aByteArray107, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass375_1.method8605();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4113 = -2;
			this.aClass375_1 = null;
			this.anInt4112++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	public void method3334(@OriginalArg(1) boolean arg0) {
		if (this.aClass375_1 == null) {
			return;
		}
		try {
			this.aClass8_Sub8_2.anInt10588 = 0;
			this.aClass8_Sub8_2.method8562(arg0 ? 2 : 3);
			this.aClass8_Sub8_2.method8542(0);
			this.aClass375_1.method8609(this.aClass8_Sub8_2.aByteArray107, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass375_1.method8605();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass375_1 = null;
			this.anInt4113 = -2;
			this.anInt4112++;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIZ)Lclient!oe;")
	public Class8_Sub5_Sub13_Sub1 method3335(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg2);
		@Pc(15) Class8_Sub5_Sub13_Sub1 local15 = new Class8_Sub5_Sub13_Sub1();
		local15.aBoolean623 = arg3;
		local15.aByte74 = arg1;
		local15.aLong275 = local11;
		if (arg3) {
			if (this.method3337() >= 20) {
				throw new RuntimeException();
			}
			this.aClass302_3.method7328(local15);
		} else if (this.method3338() < 20) {
			this.aClass302_5.method7328(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	public int method3337() {
		return this.aClass302_3.method7329() + this.aClass302_4.method7329();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
	private int method3338() {
		return this.aClass302_5.method7329() + this.aClass302_6.method7329();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Z")
	public boolean method3339() {
		return this.method3337() >= 20;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!ws;Z)V")
	public void method3341(@OriginalArg(1) Class375 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass375_1 != null) {
			try {
				this.aClass375_1.method8605();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass375_1 = null;
		}
		this.aClass375_1 = arg0;
		this.method3344();
		this.method3334(arg1);
		this.aClass8_Sub8_3.anInt10588 = 0;
		this.aClass8_Sub5_Sub13_Sub1_1 = null;
		while (true) {
			@Pc(42) Class8_Sub5_Sub13_Sub1 local42 = (Class8_Sub5_Sub13_Sub1) this.aClass302_4.method7330();
			if (local42 == null) {
				while (true) {
					local42 = (Class8_Sub5_Sub13_Sub1) this.aClass302_6.method7330();
					if (local42 == null) {
						if (this.aByte47 != 0) {
							try {
								this.aClass8_Sub8_2.anInt10588 = 0;
								this.aClass8_Sub8_2.method8562(4);
								this.aClass8_Sub8_2.method8562(this.aByte47);
								this.aClass8_Sub8_2.method8548(0);
								this.aClass375_1.method8609(this.aClass8_Sub8_2.aByteArray107, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									this.aClass375_1.method8605();
								} catch (@Pc(117) Exception local117) {
								}
								this.aClass375_1 = null;
								this.anInt4113 = -2;
								this.anInt4112++;
							}
						}
						this.anInt4111 = 0;
						this.aLong107 = Static342.method5463();
						return;
					}
					this.aClass302_5.method7328(local42);
				}
			}
			this.aClass302_3.method7328(local42);
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public void method3342() {
		if (this.aClass375_1 != null) {
			this.aClass375_1.method8607();
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
	private void method3344() {
		if (this.aClass375_1 == null) {
			return;
		}
		try {
			this.aClass8_Sub8_2.anInt10588 = 0;
			this.aClass8_Sub8_2.method8562(6);
			this.aClass8_Sub8_2.method8542(3);
			this.aClass375_1.method8609(this.aClass8_Sub8_2.aByteArray107, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass375_1.method8605();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4112++;
			this.anInt4113 = -2;
			this.aClass375_1 = null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
	public void method3345() {
		if (this.aClass375_1 != null) {
			this.aClass375_1.method8605();
		}
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(B)Z")
	public boolean method3346() {
		if (this.aClass375_1 != null) {
			@Pc(11) long local11 = Static342.method5463();
			@Pc(18) int local18 = (int) (local11 - this.aLong107);
			this.aLong107 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt4111 += local18;
			if (this.anInt4111 > 30000) {
				try {
					this.aClass375_1.method8605();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass375_1 = null;
			}
		}
		if (this.aClass375_1 == null) {
			return this.method3337() == 0 && this.method3338() == 0;
		}
		try {
			this.aClass375_1.method8611();
			for (@Pc(70) Class8_Sub5_Sub13_Sub1 local70 = (Class8_Sub5_Sub13_Sub1) this.aClass302_3.method7327(); local70 != null; local70 = (Class8_Sub5_Sub13_Sub1) this.aClass302_3.method7326()) {
				this.aClass8_Sub8_2.anInt10588 = 0;
				this.aClass8_Sub8_2.method8562(1);
				this.aClass8_Sub8_2.method8542((int) local70.aLong275);
				this.aClass375_1.method8609(this.aClass8_Sub8_2.aByteArray107, 4);
				this.aClass302_4.method7328(local70);
			}
			for (@Pc(116) Class8_Sub5_Sub13_Sub1 local116 = (Class8_Sub5_Sub13_Sub1) this.aClass302_5.method7327(); local116 != null; local116 = (Class8_Sub5_Sub13_Sub1) this.aClass302_5.method7326()) {
				this.aClass8_Sub8_2.anInt10588 = 0;
				this.aClass8_Sub8_2.method8562(0);
				this.aClass8_Sub8_2.method8542((int) local116.aLong275);
				this.aClass375_1.method8609(this.aClass8_Sub8_2.aByteArray107, 4);
				this.aClass302_6.method7328(local116);
			}
			for (@Pc(166) int local166 = 0; local166 < 100; local166++) {
				@Pc(173) int local173 = this.aClass375_1.method8608();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt4111 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass8_Sub5_Sub13_Sub1_1 == null) {
					local192 = 8;
				} else if (this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 == 0) {
					local192 = 1;
				}
				@Pc(223) int local223;
				@Pc(230) int local230;
				@Pc(276) int local276;
				if (local192 <= 0) {
					local223 = this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.aByteArray107.length - this.aClass8_Sub5_Sub13_Sub1_1.aByte74;
					local230 = 512 - this.aClass8_Sub5_Sub13_Sub1_1.anInt7543;
					if (local223 - this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.anInt10588 < local230) {
						local230 = local223 - this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.anInt10588;
					}
					if (local230 > local173) {
						local230 = local173;
					}
					this.aClass375_1.method8610(local230, this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.aByteArray107, this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.anInt10588);
					if (this.aByte47 != 0) {
						for (local276 = 0; local276 < local230; local276++) {
							this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.aByteArray107[this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.anInt10588 + local276] ^= this.aByte47;
						}
					}
					this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 += local230;
					this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.anInt10588 += local230;
					if (local223 == this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.anInt10588) {
						this.aClass8_Sub5_Sub13_Sub1_1.method8381();
						this.aClass8_Sub5_Sub13_Sub1_1.aBoolean624 = false;
						this.aClass8_Sub5_Sub13_Sub1_1 = null;
					} else if (this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 == 512) {
						this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 = 0;
					}
				} else {
					local223 = local192 - this.aClass8_Sub8_3.anInt10588;
					if (local173 < local223) {
						local223 = local173;
					}
					this.aClass375_1.method8610(local223, this.aClass8_Sub8_3.aByteArray107, this.aClass8_Sub8_3.anInt10588);
					if (this.aByte47 != 0) {
						for (local230 = 0; local230 < local223; local230++) {
							this.aClass8_Sub8_3.aByteArray107[local230 + this.aClass8_Sub8_3.anInt10588] ^= this.aByte47;
						}
					}
					this.aClass8_Sub8_3.anInt10588 += local223;
					if (local192 <= this.aClass8_Sub8_3.anInt10588) {
						if (this.aClass8_Sub5_Sub13_Sub1_1 == null) {
							this.aClass8_Sub8_3.anInt10588 = 0;
							local230 = this.aClass8_Sub8_3.method8525();
							local276 = this.aClass8_Sub8_3.method8578();
							@Pc(460) int local460 = this.aClass8_Sub8_3.method8525();
							@Pc(465) int local465 = this.aClass8_Sub8_3.method8540();
							@Pc(469) int local469 = local460 & 0x7F;
							@Pc(477) boolean local477 = (local460 & 0x80) != 0;
							@Pc(484) long local484 = (long) (local276 + (local230 << 16));
							@Pc(494) Class8_Sub5_Sub13_Sub1 local494;
							if (local477) {
								for (local494 = (Class8_Sub5_Sub13_Sub1) this.aClass302_6.method7327(); local494 != null && local494.aLong275 != local484; local494 = (Class8_Sub5_Sub13_Sub1) this.aClass302_6.method7326()) {
								}
							} else {
								for (local494 = (Class8_Sub5_Sub13_Sub1) this.aClass302_4.method7327(); local494 != null && local494.aLong275 != local484; local494 = (Class8_Sub5_Sub13_Sub1) this.aClass302_4.method7326()) {
								}
							}
							if (local494 == null) {
								throw new IOException();
							}
							@Pc(550) int local550 = local469 == 0 ? 5 : 9;
							this.aClass8_Sub5_Sub13_Sub1_1 = local494;
							this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9 = new Class8_Sub8(local465 + local550 + this.aClass8_Sub5_Sub13_Sub1_1.aByte74);
							this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.method8562(local469);
							this.aClass8_Sub5_Sub13_Sub1_1.aClass8_Sub8_9.method8523(local465);
							this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 = 8;
							this.aClass8_Sub8_3.anInt10588 = 0;
						} else if (this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 != 0) {
							throw new IOException();
						} else if (this.aClass8_Sub8_3.aByteArray107[0] == -1) {
							this.aClass8_Sub5_Sub13_Sub1_1.anInt7543 = 1;
							this.aClass8_Sub8_3.anInt10588 = 0;
						} else {
							this.aClass8_Sub5_Sub13_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(629) IOException local629) {
			try {
				this.aClass375_1.method8605();
			} catch (@Pc(635) Exception local635) {
			}
			this.aClass375_1 = null;
			this.anInt4112++;
			this.anInt4113 = -2;
			return this.method3337() == 0 && this.method3338() == 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)Z")
	public boolean method3347() {
		return this.method3338() >= 20;
	}
}
