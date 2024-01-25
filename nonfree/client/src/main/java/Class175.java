import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class175 {

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
	private int anInt4359;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "Lclient!dr;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "Lclient!ie;")
	private Class6_Sub1_Sub10_Sub1 aClass6_Sub1_Sub10_Sub1_1;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_8 = new Class144();

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_9 = new Class144();

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_10 = new Class144();

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "Lclient!ifa;")
	private final Class144 aClass144_11 = new Class144();

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "Lclient!dga;")
	private final Class6_Sub14 aClass6_Sub14_4 = new Class6_Sub14(4);

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "B")
	private byte aByte57 = 0;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
	public volatile int anInt4360 = 0;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
	public volatile int anInt4361 = 0;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "Lclient!dga;")
	private final Class6_Sub14 aClass6_Sub14_5 = new Class6_Sub14(8);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
	public boolean method3734() {
		return this.method3738() >= 20;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public void method3735() {
		if (this.aClass73_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub14_4.anInt7244 = 0;
			this.aClass6_Sub14_4.method6035(7);
			this.aClass6_Sub14_4.method6016(0);
			this.aClass73_1.method1489(4, this.aClass6_Sub14_4.aByteArray88);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass73_1.method1484();
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass73_1 = null;
			this.anInt4361 = -2;
			this.anInt4360++;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZBII)Lclient!ie;")
	public Class6_Sub1_Sub10_Sub1 method3736(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg3 << 16));
		@Pc(22) Class6_Sub1_Sub10_Sub1 local22 = new Class6_Sub1_Sub10_Sub1();
		local22.aByte51 = arg2;
		local22.aBoolean605 = arg1;
		local22.aLong250 = local10;
		if (arg1) {
			if (this.method3748() >= 20) {
				throw new RuntimeException();
			}
			this.aClass144_8.method3114(local22);
		} else if (this.method3738() < 20) {
			this.aClass144_10.method3114(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLclient!dr;I)V")
	public void method3737(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class73 arg1) {
		if (this.aClass73_1 != null) {
			try {
				this.aClass73_1.method1484();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass73_1 = null;
		}
		this.aClass73_1 = arg1;
		this.method3740();
		this.method3742(arg0);
		this.aClass6_Sub1_Sub10_Sub1_1 = null;
		this.aClass6_Sub14_5.anInt7244 = 0;
		while (true) {
			@Pc(40) Class6_Sub1_Sub10_Sub1 local40 = (Class6_Sub1_Sub10_Sub1) this.aClass144_9.method3115();
			if (local40 == null) {
				while (true) {
					local40 = (Class6_Sub1_Sub10_Sub1) this.aClass144_11.method3115();
					if (local40 == null) {
						if (this.aByte57 != 0) {
							try {
								this.aClass6_Sub14_4.anInt7244 = 0;
								this.aClass6_Sub14_4.method6035(4);
								this.aClass6_Sub14_4.method6035(this.aByte57);
								this.aClass6_Sub14_4.method5999(0);
								this.aClass73_1.method1489(4, this.aClass6_Sub14_4.aByteArray88);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass73_1.method1484();
								} catch (@Pc(108) Exception local108) {
								}
								this.anInt4360++;
								this.anInt4361 = -2;
								this.aClass73_1 = null;
							}
						}
						this.anInt4359 = 0;
						this.aLong122 = Static137.method2058();
						return;
					}
					this.aClass144_10.method3114(local40);
				}
			}
			this.aClass144_8.method3114(local40);
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)I")
	private int method3738() {
		return this.aClass144_10.method3110() + this.aClass144_11.method3110();
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	private void method3740() {
		if (this.aClass73_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub14_4.anInt7244 = 0;
			this.aClass6_Sub14_4.method6035(6);
			this.aClass6_Sub14_4.method6016(3);
			this.aClass73_1.method1489(4, this.aClass6_Sub14_4.aByteArray88);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass73_1.method1484();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass73_1 = null;
			this.anInt4360++;
			this.anInt4361 = -2;
		}
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	public void method3741() {
		if (this.aClass73_1 != null) {
			this.aClass73_1.method1491();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V")
	public void method3742(@OriginalArg(1) boolean arg0) {
		if (this.aClass73_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub14_4.anInt7244 = 0;
			this.aClass6_Sub14_4.method6035(arg0 ? 2 : 3);
			this.aClass6_Sub14_4.method6016(0);
			this.aClass73_1.method1489(4, this.aClass6_Sub14_4.aByteArray88);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass73_1.method1484();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4361 = -2;
			this.anInt4360++;
			this.aClass73_1 = null;
		}
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	public void method3744() {
		try {
			this.aClass73_1.method1484();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass73_1 = null;
		this.aByte57 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt4360++;
		this.anInt4361 = -1;
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
	public void method3745() {
		if (this.aClass73_1 != null) {
			this.aClass73_1.method1484();
		}
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z")
	public boolean method3746() {
		return this.method3748() >= 20;
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)I")
	public int method3748() {
		return this.aClass144_8.method3110() + this.aClass144_9.method3110();
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)Z")
	public boolean method3749() {
		@Pc(18) int local18;
		if (this.aClass73_1 != null) {
			@Pc(11) long local11 = Static137.method2058();
			local18 = (int) (local11 - this.aLong122);
			this.aLong122 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt4359 += local18;
			if (this.anInt4359 > 30000) {
				try {
					this.aClass73_1.method1484();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass73_1 = null;
			}
		}
		if (this.aClass73_1 == null) {
			return this.method3748() == 0 && this.method3738() == 0;
		}
		try {
			this.aClass73_1.method1483();
			for (@Pc(73) Class6_Sub1_Sub10_Sub1 local73 = (Class6_Sub1_Sub10_Sub1) this.aClass144_8.method3116(); local73 != null; local73 = (Class6_Sub1_Sub10_Sub1) this.aClass144_8.method3113()) {
				this.aClass6_Sub14_4.anInt7244 = 0;
				this.aClass6_Sub14_4.method6035(1);
				this.aClass6_Sub14_4.method6016((int) local73.aLong250);
				this.aClass73_1.method1489(4, this.aClass6_Sub14_4.aByteArray88);
				this.aClass144_9.method3114(local73);
			}
			for (@Pc(119) Class6_Sub1_Sub10_Sub1 local119 = (Class6_Sub1_Sub10_Sub1) this.aClass144_10.method3116(); local119 != null; local119 = (Class6_Sub1_Sub10_Sub1) this.aClass144_10.method3113()) {
				this.aClass6_Sub14_4.anInt7244 = 0;
				this.aClass6_Sub14_4.method6035(0);
				this.aClass6_Sub14_4.method6016((int) local119.aLong250);
				this.aClass73_1.method1489(4, this.aClass6_Sub14_4.aByteArray88);
				this.aClass144_11.method3114(local119);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(176) int local176 = this.aClass73_1.method1490();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt4359 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass6_Sub1_Sub10_Sub1_1 == null) {
					local195 = 8;
				} else if (this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 == 0) {
					local195 = 1;
				}
				@Pc(220) int local220;
				@Pc(244) int local244;
				@Pc(306) int local306;
				if (local195 > 0) {
					local220 = local195 - this.aClass6_Sub14_5.anInt7244;
					if (local220 > local176) {
						local220 = local176;
					}
					this.aClass73_1.method1487(this.aClass6_Sub14_5.anInt7244, local220, this.aClass6_Sub14_5.aByteArray88);
					if (this.aByte57 != 0) {
						for (local244 = 0; local244 < local220; local244++) {
							this.aClass6_Sub14_5.aByteArray88[this.aClass6_Sub14_5.anInt7244 + local244] = (byte) (this.aClass6_Sub14_5.aByteArray88[this.aClass6_Sub14_5.anInt7244 + local244] ^ this.aByte57);
						}
					}
					this.aClass6_Sub14_5.anInt7244 += local220;
					if (local195 <= this.aClass6_Sub14_5.anInt7244) {
						if (this.aClass6_Sub1_Sub10_Sub1_1 == null) {
							this.aClass6_Sub14_5.anInt7244 = 0;
							local244 = this.aClass6_Sub14_5.method6041();
							local306 = this.aClass6_Sub14_5.method6006();
							@Pc(311) int local311 = this.aClass6_Sub14_5.method6041();
							@Pc(316) int local316 = this.aClass6_Sub14_5.method6027();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(331) boolean local331 = (local311 & 0x80) != 0;
							@Pc(338) long local338 = (long) (local306 + (local244 << 16));
							@Pc(348) Class6_Sub1_Sub10_Sub1 local348;
							if (local331) {
								for (local348 = (Class6_Sub1_Sub10_Sub1) this.aClass144_11.method3116(); local348 != null && local338 != local348.aLong250; local348 = (Class6_Sub1_Sub10_Sub1) this.aClass144_11.method3113()) {
								}
							} else {
								for (local348 = (Class6_Sub1_Sub10_Sub1) this.aClass144_9.method3116(); local348 != null && local348.aLong250 != local338; local348 = (Class6_Sub1_Sub10_Sub1) this.aClass144_9.method3113()) {
								}
							}
							if (local348 == null) {
								throw new IOException();
							}
							this.aClass6_Sub1_Sub10_Sub1_1 = local348;
							@Pc(404) int local404 = local320 == 0 ? 5 : 9;
							this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3 = new Class6_Sub14(this.aClass6_Sub1_Sub10_Sub1_1.aByte51 + local316 + local404);
							this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.method6035(local320);
							this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.method5990(local316);
							this.aClass6_Sub14_5.anInt7244 = 0;
							this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 = 8;
						} else if (this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub14_5.aByteArray88[0] == -1) {
							this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 = 1;
							this.aClass6_Sub14_5.anInt7244 = 0;
						} else {
							this.aClass6_Sub1_Sub10_Sub1_1 = null;
						}
					}
				} else {
					local220 = this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.aByteArray88.length - this.aClass6_Sub1_Sub10_Sub1_1.aByte51;
					local244 = 512 - this.aClass6_Sub1_Sub10_Sub1_1.anInt3611;
					if (local220 - this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.anInt7244 < local244) {
						local244 = local220 - this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.anInt7244;
					}
					if (local244 > local176) {
						local244 = local176;
					}
					this.aClass73_1.method1487(this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.anInt7244, local244, this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.aByteArray88);
					if (this.aByte57 != 0) {
						for (local306 = 0; local306 < local244; local306++) {
							this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.aByteArray88[local306 + this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.anInt7244] ^= this.aByte57;
						}
					}
					this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.anInt7244 += local244;
					this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 += local244;
					if (this.aClass6_Sub1_Sub10_Sub1_1.aClass6_Sub14_3.anInt7244 == local220) {
						this.aClass6_Sub1_Sub10_Sub1_1.method7852();
						this.aClass6_Sub1_Sub10_Sub1_1.aBoolean607 = false;
						this.aClass6_Sub1_Sub10_Sub1_1 = null;
					} else if (this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 == 512) {
						this.aClass6_Sub1_Sub10_Sub1_1.anInt3611 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(624) IOException local624) {
			try {
				this.aClass73_1.method1484();
			} catch (@Pc(630) Exception local630) {
			}
			this.anInt4360++;
			this.aClass73_1 = null;
			this.anInt4361 = -2;
			return this.method3748() == 0 && this.method3738() == 0;
		}
	}
}
