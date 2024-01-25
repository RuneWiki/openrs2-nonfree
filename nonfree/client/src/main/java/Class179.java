import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class179 {

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "Lclient!qe;")
	private Class199 aClass199_7;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "J")
	private long aLong148;

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
	private int anInt5122;

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "Lclient!li;")
	private Class2_Sub2_Sub12_Sub1 aClass2_Sub2_Sub12_Sub1_1;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!ld;")
	private final Class145 aClass145_6 = new Class145();

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!ld;")
	private final Class145 aClass145_7 = new Class145();

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Lclient!ld;")
	private final Class145 aClass145_8 = new Class145();

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Lclient!ld;")
	private final Class145 aClass145_9 = new Class145();

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "Lclient!md;")
	private final Class2_Sub20 aClass2_Sub20_6 = new Class2_Sub20(4);

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
	public volatile int anInt5124 = 0;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
	public volatile int anInt5123 = 0;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "Lclient!md;")
	private final Class2_Sub20 aClass2_Sub20_7 = new Class2_Sub20(8);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBZI)Lclient!li;")
	public Class2_Sub2_Sub12_Sub1 method4128(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg0);
		@Pc(14) Class2_Sub2_Sub12_Sub1 local14 = new Class2_Sub2_Sub12_Sub1();
		local14.aByte50 = arg1;
		local14.aBoolean525 = arg2;
		local14.aLong223 = local10;
		if (arg2) {
			if (this.method4135() >= 20) {
				throw new RuntimeException();
			}
			this.aClass145_6.method3387(local14);
		} else if (this.method4139() < 20) {
			this.aClass145_8.method3387(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Z")
	public boolean method4130() {
		@Pc(14) int local14;
		if (this.aClass199_7 != null) {
			@Pc(7) long local7 = Static208.method3182();
			local14 = (int) (local7 - this.aLong148);
			this.aLong148 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt5122 += local14;
			if (this.anInt5122 > 30000) {
				try {
					this.aClass199_7.method4490();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass199_7 = null;
			}
		}
		if (this.aClass199_7 == null) {
			return this.method4135() == 0 && this.method4139() == 0;
		}
		try {
			this.aClass199_7.method4486();
			for (@Pc(75) Class2_Sub2_Sub12_Sub1 local75 = (Class2_Sub2_Sub12_Sub1) this.aClass145_6.method3390(); local75 != null; local75 = (Class2_Sub2_Sub12_Sub1) this.aClass145_6.method3384()) {
				this.aClass2_Sub20_6.anInt4608 = 0;
				this.aClass2_Sub20_6.method3699(1);
				this.aClass2_Sub20_6.method3684((int) local75.aLong223);
				this.aClass199_7.method4484(this.aClass2_Sub20_6.aByteArray136, 4);
				this.aClass145_7.method3387(local75);
			}
			for (@Pc(127) Class2_Sub2_Sub12_Sub1 local127 = (Class2_Sub2_Sub12_Sub1) this.aClass145_8.method3390(); local127 != null; local127 = (Class2_Sub2_Sub12_Sub1) this.aClass145_8.method3384()) {
				this.aClass2_Sub20_6.anInt4608 = 0;
				this.aClass2_Sub20_6.method3699(0);
				this.aClass2_Sub20_6.method3684((int) local127.aLong223);
				this.aClass199_7.method4484(this.aClass2_Sub20_6.aByteArray136, 4);
				this.aClass145_9.method3387(local127);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(176) int local176 = this.aClass199_7.method4483();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt5122 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass2_Sub2_Sub12_Sub1_1 == null) {
					local192 = 8;
				} else if (this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 == 0) {
					local192 = 1;
				}
				@Pc(220) int local220;
				@Pc(248) int local248;
				@Pc(306) int local306;
				if (local192 > 0) {
					local220 = local192 - this.aClass2_Sub20_7.anInt4608;
					if (local176 < local220) {
						local220 = local176;
					}
					this.aClass199_7.method4488(local220, this.aClass2_Sub20_7.aByteArray136, this.aClass2_Sub20_7.anInt4608);
					if (this.aByte63 != 0) {
						for (local248 = 0; local248 < local220; local248++) {
							this.aClass2_Sub20_7.aByteArray136[this.aClass2_Sub20_7.anInt4608 + local248] = (byte) (this.aClass2_Sub20_7.aByteArray136[this.aClass2_Sub20_7.anInt4608 + local248] ^ this.aByte63);
						}
					}
					this.aClass2_Sub20_7.anInt4608 += local220;
					if (this.aClass2_Sub20_7.anInt4608 >= local192) {
						if (this.aClass2_Sub2_Sub12_Sub1_1 == null) {
							this.aClass2_Sub20_7.anInt4608 = 0;
							local248 = this.aClass2_Sub20_7.method3737();
							local306 = this.aClass2_Sub20_7.method3711();
							@Pc(311) int local311 = this.aClass2_Sub20_7.method3737();
							@Pc(316) int local316 = this.aClass2_Sub20_7.method3731();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(331) boolean local331 = (local311 & 0x80) != 0;
							@Pc(338) long local338 = (long) (local306 + (local248 << 16));
							@Pc(348) Class2_Sub2_Sub12_Sub1 local348;
							if (local331) {
								for (local348 = (Class2_Sub2_Sub12_Sub1) this.aClass145_9.method3390(); local348 != null && local338 != local348.aLong223; local348 = (Class2_Sub2_Sub12_Sub1) this.aClass145_9.method3384()) {
								}
							} else {
								for (local348 = (Class2_Sub2_Sub12_Sub1) this.aClass145_7.method3390(); local348 != null && local348.aLong223 != local338; local348 = (Class2_Sub2_Sub12_Sub1) this.aClass145_7.method3384()) {
								}
							}
							if (local348 == null) {
								throw new IOException();
							}
							@Pc(405) int local405 = local320 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub12_Sub1_1 = local348;
							this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4 = new Class2_Sub20(local405 + local316 + this.aClass2_Sub2_Sub12_Sub1_1.aByte50);
							this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.method3699(local320);
							this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.method3713(local316);
							this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 = 8;
							this.aClass2_Sub20_7.anInt4608 = 0;
						} else if (this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub20_7.aByteArray136[0] == -1) {
							this.aClass2_Sub20_7.anInt4608 = 0;
							this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 = 1;
						} else {
							this.aClass2_Sub2_Sub12_Sub1_1 = null;
						}
					}
				} else {
					local220 = this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.aByteArray136.length - this.aClass2_Sub2_Sub12_Sub1_1.aByte50;
					local248 = 512 - this.aClass2_Sub2_Sub12_Sub1_1.anInt4284;
					if (local248 > local220 - this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.anInt4608) {
						local248 = local220 - this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.anInt4608;
					}
					if (local176 < local248) {
						local248 = local176;
					}
					this.aClass199_7.method4488(local248, this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.aByteArray136, this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.anInt4608);
					if (this.aByte63 != 0) {
						for (local306 = 0; local306 < local248; local306++) {
							this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.aByteArray136[local306 + this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.anInt4608] ^= this.aByte63;
						}
					}
					this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 += local248;
					this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.anInt4608 += local248;
					if (this.aClass2_Sub2_Sub12_Sub1_1.aClass2_Sub20_4.anInt4608 == local220) {
						this.aClass2_Sub2_Sub12_Sub1_1.method5934();
						this.aClass2_Sub2_Sub12_Sub1_1.aBoolean526 = false;
						this.aClass2_Sub2_Sub12_Sub1_1 = null;
					} else if (this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 == 512) {
						this.aClass2_Sub2_Sub12_Sub1_1.anInt4284 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(633) IOException local633) {
			try {
				this.aClass199_7.method4490();
			} catch (@Pc(639) Exception local639) {
			}
			this.anInt5123 = -2;
			this.aClass199_7 = null;
			this.anInt5124++;
			return this.method4135() == 0 && this.method4139() == 0;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLclient!qe;I)V")
	public void method4131(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class199 arg1) {
		if (this.aClass199_7 != null) {
			try {
				this.aClass199_7.method4490();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass199_7 = null;
		}
		this.aClass199_7 = arg1;
		this.method4137();
		this.method4142(arg0);
		this.aClass2_Sub20_7.anInt4608 = 0;
		this.aClass2_Sub2_Sub12_Sub1_1 = null;
		while (true) {
			@Pc(47) Class2_Sub2_Sub12_Sub1 local47 = (Class2_Sub2_Sub12_Sub1) this.aClass145_7.method3391();
			if (local47 == null) {
				while (true) {
					local47 = (Class2_Sub2_Sub12_Sub1) this.aClass145_9.method3391();
					if (local47 == null) {
						if (this.aByte63 != 0) {
							try {
								this.aClass2_Sub20_6.anInt4608 = 0;
								this.aClass2_Sub20_6.method3699(4);
								this.aClass2_Sub20_6.method3699(this.aByte63);
								this.aClass2_Sub20_6.method3745(0);
								this.aClass199_7.method4484(this.aClass2_Sub20_6.aByteArray136, 4);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass199_7.method4490();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt5124++;
								this.aClass199_7 = null;
								this.anInt5123 = -2;
							}
						}
						this.anInt5122 = 0;
						this.aLong148 = Static208.method3182();
						return;
					}
					this.aClass145_8.method3387(local47);
				}
			}
			this.aClass145_6.method3387(local47);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z")
	public boolean method4132() {
		return this.method4139() >= 20;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public void method4133() {
		if (this.aClass199_7 != null) {
			this.aClass199_7.method4490();
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
	public void method4134() {
		try {
			this.aClass199_7.method4490();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass199_7 = null;
		this.aByte63 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5124++;
		this.anInt5123 = -1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
	public int method4135() {
		return this.aClass145_6.method3389() + this.aClass145_7.method3389();
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	public void method4136() {
		if (this.aClass199_7 != null) {
			this.aClass199_7.method4487();
		}
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(Z)V")
	private void method4137() {
		if (this.aClass199_7 == null) {
			return;
		}
		try {
			this.aClass2_Sub20_6.anInt4608 = 0;
			this.aClass2_Sub20_6.method3699(6);
			this.aClass2_Sub20_6.method3684(3);
			this.aClass199_7.method4484(this.aClass2_Sub20_6.aByteArray136, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass199_7.method4490();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass199_7 = null;
			this.anInt5124++;
			this.anInt5123 = -2;
		}
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(Z)I")
	private int method4139() {
		return this.aClass145_8.method3389() + this.aClass145_9.method3389();
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)Z")
	public boolean method4140() {
		return this.method4135() >= 20;
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(Z)V")
	public void method4141() {
		if (this.aClass199_7 == null) {
			return;
		}
		try {
			this.aClass2_Sub20_6.anInt4608 = 0;
			this.aClass2_Sub20_6.method3699(7);
			this.aClass2_Sub20_6.method3684(0);
			this.aClass199_7.method4484(this.aClass2_Sub20_6.aByteArray136, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass199_7.method4490();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt5124++;
			this.aClass199_7 = null;
			this.anInt5123 = -2;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZ)V")
	public void method4142(@OriginalArg(1) boolean arg0) {
		if (this.aClass199_7 == null) {
			return;
		}
		try {
			this.aClass2_Sub20_6.anInt4608 = 0;
			this.aClass2_Sub20_6.method3699(arg0 ? 2 : 3);
			this.aClass2_Sub20_6.method3684(0);
			this.aClass199_7.method4484(this.aClass2_Sub20_6.aByteArray136, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass199_7.method4490();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt5124++;
			this.aClass199_7 = null;
			this.anInt5123 = -2;
		}
	}
}
