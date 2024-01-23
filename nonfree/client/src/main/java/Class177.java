import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class177 {

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!pl;")
	private Class139 aClass139_4;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	private int anInt5590;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!pj;")
	private Class3_Sub4_Sub1_Sub2 aClass3_Sub4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Lclient!mm;")
	private Class115 aClass115_9 = new Class115();

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!mm;")
	private Class115 aClass115_10 = new Class115();

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!mm;")
	private Class115 aClass115_11 = new Class115();

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Lclient!mm;")
	private Class115 aClass115_12 = new Class115();

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!ug;")
	private Class3_Sub26 aClass3_Sub26_7 = new Class3_Sub26(4);

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	public volatile int anInt5592 = 0;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
	public volatile int anInt5591 = 0;

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "B")
	private byte aByte29 = 0;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Lclient!ug;")
	private Class3_Sub26 aClass3_Sub26_8 = new Class3_Sub26(8);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)Z")
	public boolean method4535() {
		return this.method4540() >= 20;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public void method4536() {
		if (this.aClass139_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub26_7.anInt4615 = 0;
			this.aClass3_Sub26_7.method3907(7);
			this.aClass3_Sub26_7.method3894(0);
			this.aClass139_4.method3556(this.aClass3_Sub26_7.aByteArray64, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass139_4.method3559();
			} catch (@Pc(47) Exception local47) {
			}
			this.aClass139_4 = null;
			this.anInt5592++;
			this.anInt5591 = -2;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public void method4537() {
		if (this.aClass139_4 != null) {
			this.aClass139_4.method3550();
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Z")
	public boolean method4538() {
		return this.method4543() >= 20;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I")
	public int method4540() {
		return this.aClass115_9.method2880() + this.aClass115_10.method2880();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
	public void method4542(@OriginalArg(1) boolean arg0) {
		if (this.aClass139_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub26_7.anInt4615 = 0;
			this.aClass3_Sub26_7.method3907(arg0 ? 2 : 3);
			this.aClass3_Sub26_7.method3894(0);
			this.aClass139_4.method3556(this.aClass3_Sub26_7.aByteArray64, 4);
		} catch (@Pc(45) IOException local45) {
			try {
				this.aClass139_4.method3559();
			} catch (@Pc(51) Exception local51) {
			}
			this.aClass139_4 = null;
			this.anInt5591 = -2;
			this.anInt5592++;
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)I")
	private int method4543() {
		return this.aClass115_11.method2880() + this.aClass115_12.method2880();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!pl;IZ)V")
	public void method4544(@OriginalArg(0) Class139 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass139_4 != null) {
			try {
				this.aClass139_4.method3559();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass139_4 = null;
		}
		this.aClass139_4 = arg0;
		this.method4547();
		this.method4542(arg1);
		this.aClass3_Sub4_Sub1_Sub2_1 = null;
		this.aClass3_Sub26_8.anInt4615 = 0;
		while (true) {
			@Pc(44) Class3_Sub4_Sub1_Sub2 local44 = (Class3_Sub4_Sub1_Sub2) this.aClass115_10.method2882();
			if (local44 == null) {
				while (true) {
					local44 = (Class3_Sub4_Sub1_Sub2) this.aClass115_12.method2882();
					if (local44 == null) {
						if (this.aByte29 != 0) {
							try {
								this.aClass3_Sub26_7.anInt4615 = 0;
								this.aClass3_Sub26_7.method3907(4);
								this.aClass3_Sub26_7.method3907(this.aByte29);
								this.aClass3_Sub26_7.method3938(0);
								this.aClass139_4.method3556(this.aClass3_Sub26_7.aByteArray64, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass139_4.method3559();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass139_4 = null;
								this.anInt5591 = -2;
								this.anInt5592++;
							}
						}
						this.anInt5590 = 0;
						this.aLong214 = Static128.method2196();
						return;
					}
					this.aClass115_11.method2875(local44);
				}
			}
			this.aClass115_9.method2875(local44);
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public void method4545() {
		try {
			this.aClass139_4.method3559();
		} catch (@Pc(14) Exception local14) {
		}
		this.aClass139_4 = null;
		this.anInt5591 = -1;
		this.aByte29 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5592++;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	private void method4547() {
		if (this.aClass139_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub26_7.anInt4615 = 0;
			this.aClass3_Sub26_7.method3907(6);
			this.aClass3_Sub26_7.method3894(3);
			this.aClass139_4.method3556(this.aClass3_Sub26_7.aByteArray64, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass139_4.method3559();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass139_4 = null;
			this.anInt5591 = -2;
			this.anInt5592++;
		}
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
	public void method4548() {
		if (this.aClass139_4 != null) {
			this.aClass139_4.method3559();
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)Z")
	public boolean method4549() {
		if (this.aClass139_4 != null) {
			@Pc(12) long local12 = Static128.method2196();
			@Pc(19) int local19 = (int) (local12 - this.aLong214);
			this.aLong214 = local12;
			if (local19 > 200) {
				local19 = 200;
			}
			this.anInt5590 += local19;
			if (this.anInt5590 > 30000) {
				try {
					this.aClass139_4.method3559();
				} catch (@Pc(45) Exception local45) {
				}
				this.aClass139_4 = null;
			}
		}
		if (this.aClass139_4 == null) {
			return this.method4540() == 0 && this.method4543() == 0;
		}
		try {
			this.aClass139_4.method3549();
			@Pc(80) Class3_Sub4_Sub1_Sub2 local80;
			for (local80 = (Class3_Sub4_Sub1_Sub2) this.aClass115_9.method2879(); local80 != null; local80 = (Class3_Sub4_Sub1_Sub2) this.aClass115_9.method2885()) {
				this.aClass3_Sub26_7.anInt4615 = 0;
				this.aClass3_Sub26_7.method3907(1);
				this.aClass3_Sub26_7.method3894((int) local80.aLong245);
				this.aClass139_4.method3556(this.aClass3_Sub26_7.aByteArray64, 4);
				this.aClass115_10.method2875(local80);
			}
			for (local80 = (Class3_Sub4_Sub1_Sub2) this.aClass115_11.method2879(); local80 != null; local80 = (Class3_Sub4_Sub1_Sub2) this.aClass115_11.method2885()) {
				this.aClass3_Sub26_7.anInt4615 = 0;
				this.aClass3_Sub26_7.method3907(0);
				this.aClass3_Sub26_7.method3894((int) local80.aLong245);
				this.aClass139_4.method3556(this.aClass3_Sub26_7.aByteArray64, 4);
				this.aClass115_12.method2875(local80);
			}
			for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
				@Pc(182) int local182 = this.aClass139_4.method3554();
				if (local182 < 0) {
					throw new IOException();
				}
				if (local182 == 0) {
					break;
				}
				this.anInt5590 = 0;
				@Pc(197) byte local197 = 0;
				if (this.aClass3_Sub4_Sub1_Sub2_1 == null) {
					local197 = 8;
				} else if (this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 == 0) {
					local197 = 1;
				}
				@Pc(222) int local222;
				@Pc(249) int local249;
				@Pc(315) int local315;
				if (local197 > 0) {
					local222 = local197 - this.aClass3_Sub26_8.anInt4615;
					if (local182 < local222) {
						local222 = local182;
					}
					this.aClass139_4.method3558(local222, this.aClass3_Sub26_8.aByteArray64, this.aClass3_Sub26_8.anInt4615);
					if (this.aByte29 != 0) {
						for (local249 = 0; local249 < local222; local249++) {
							this.aClass3_Sub26_8.aByteArray64[local249 + this.aClass3_Sub26_8.anInt4615] ^= this.aByte29;
						}
					}
					this.aClass3_Sub26_8.anInt4615 += local222;
					if (local197 <= this.aClass3_Sub26_8.anInt4615) {
						if (this.aClass3_Sub4_Sub1_Sub2_1 == null) {
							this.aClass3_Sub26_8.anInt4615 = 0;
							local249 = this.aClass3_Sub26_8.method3915();
							local315 = this.aClass3_Sub26_8.method3948();
							@Pc(320) int local320 = this.aClass3_Sub26_8.method3915();
							@Pc(325) int local325 = this.aClass3_Sub26_8.method3896();
							@Pc(329) int local329 = local320 & 0x7F;
							@Pc(336) long local336 = (long) ((local249 << 16) + local315);
							@Pc(347) boolean local347 = (local320 & 0x80) != 0;
							@Pc(355) Class3_Sub4_Sub1_Sub2 local355;
							if (local347) {
								for (local355 = (Class3_Sub4_Sub1_Sub2) this.aClass115_12.method2879(); local355 != null && local336 != local355.aLong245; local355 = (Class3_Sub4_Sub1_Sub2) this.aClass115_12.method2885()) {
								}
							} else {
								for (local355 = (Class3_Sub4_Sub1_Sub2) this.aClass115_10.method2879(); local355 != null && local336 != local355.aLong245; local355 = (Class3_Sub4_Sub1_Sub2) this.aClass115_10.method2885()) {
								}
							}
							if (local355 == null) {
								throw new IOException();
							}
							@Pc(409) int local409 = local329 == 0 ? 5 : 9;
							this.aClass3_Sub4_Sub1_Sub2_1 = local355;
							this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5 = new Class3_Sub26(this.aClass3_Sub4_Sub1_Sub2_1.aByte23 + local409 + local325);
							this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.method3907(local329);
							this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.method3944(local325);
							this.aClass3_Sub26_8.anInt4615 = 0;
							this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 = 8;
						} else if (this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub26_8.aByteArray64[0] == -1) {
							this.aClass3_Sub26_8.anInt4615 = 0;
							this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 = 1;
						} else {
							this.aClass3_Sub4_Sub1_Sub2_1 = null;
						}
					}
				} else {
					local249 = 512 - this.aClass3_Sub4_Sub1_Sub2_1.anInt4217;
					local222 = this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.aByteArray64.length - this.aClass3_Sub4_Sub1_Sub2_1.aByte23;
					if (local222 - this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615 < local249) {
						local249 = local222 - this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615;
					}
					if (local182 < local249) {
						local249 = local182;
					}
					this.aClass139_4.method3558(local249, this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.aByteArray64, this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615);
					if (this.aByte29 != 0) {
						for (local315 = 0; local315 < local249; local315++) {
							this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.aByteArray64[this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615 + local315] = (byte) (this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.aByteArray64[this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615 + local315] ^ this.aByte29);
						}
					}
					this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 += local249;
					this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615 += local249;
					if (this.aClass3_Sub4_Sub1_Sub2_1.aClass3_Sub26_5.anInt4615 == local222) {
						this.aClass3_Sub4_Sub1_Sub2_1.method5022();
						this.aClass3_Sub4_Sub1_Sub2_1.aBoolean297 = false;
						this.aClass3_Sub4_Sub1_Sub2_1 = null;
					} else if (this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 == 512) {
						this.aClass3_Sub4_Sub1_Sub2_1.anInt4217 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(634) IOException local634) {
			try {
				this.aClass139_4.method3559();
			} catch (@Pc(640) Exception local640) {
			}
			this.anInt5592++;
			this.aClass139_4 = null;
			this.anInt5591 = -2;
			return this.method4540() == 0 && this.method4543() == 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIIBI)Lclient!pj;")
	public Class3_Sub4_Sub1_Sub2 method4550(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(7) Class3_Sub4_Sub1_Sub2 local7 = new Class3_Sub4_Sub1_Sub2();
		local7.aByte23 = arg3;
		@Pc(23) long local23 = (long) (arg2 + (arg1 << 16));
		local7.aBoolean298 = arg0;
		local7.aLong245 = local23;
		if (arg0) {
			if (this.method4540() >= 20) {
				throw new RuntimeException();
			}
			this.aClass115_9.method2875(local7);
		} else if (this.method4543() < 20) {
			this.aClass115_11.method2875(local7);
		} else {
			throw new RuntimeException();
		}
		return local7;
	}
}
