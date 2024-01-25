import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class11 {

	@OriginalMember(owner = "client!al", name = "D", descriptor = "Lclient!lh;")
	private Class145 aClass145_3;

	@OriginalMember(owner = "client!al", name = "H", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!al", name = "I", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!al", name = "N", descriptor = "Lclient!qj;")
	private Class3_Sub7_Sub2_Sub2 aClass3_Sub7_Sub2_Sub2_1;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!mt;")
	private final Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!al", name = "p", descriptor = "Lclient!mt;")
	private final Class162 aClass162_2 = new Class162();

	@OriginalMember(owner = "client!al", name = "A", descriptor = "Lclient!mt;")
	private final Class162 aClass162_3 = new Class162();

	@OriginalMember(owner = "client!al", name = "B", descriptor = "Lclient!mt;")
	private final Class162 aClass162_4 = new Class162();

	@OriginalMember(owner = "client!al", name = "F", descriptor = "Lclient!rp;")
	private final Class3_Sub5 aClass3_Sub5_2 = new Class3_Sub5(4);

	@OriginalMember(owner = "client!al", name = "J", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!al", name = "L", descriptor = "I")
	public volatile int anInt177 = 0;

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	public volatile int anInt176 = 0;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "Lclient!rp;")
	private final Class3_Sub5 aClass3_Sub5_3 = new Class3_Sub5(8);

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public void method156() {
		try {
			this.aClass145_3.method3136();
		} catch (@Pc(17) Exception local17) {
		}
		this.aClass145_3 = null;
		this.anInt177++;
		this.anInt176 = -1;
		this.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIB)Lclient!qj;")
	public Class3_Sub7_Sub2_Sub2 method157(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(17) long local17 = (long) (arg1 + (arg2 << 16));
		@Pc(21) Class3_Sub7_Sub2_Sub2 local21 = new Class3_Sub7_Sub2_Sub2();
		local21.aByte66 = arg3;
		local21.aBoolean388 = arg0;
		local21.aLong231 = local17;
		if (arg0) {
			if (this.method165() >= 20) {
				throw new RuntimeException();
			}
			this.aClass162_1.method3729(local21);
		} else if (this.method166() < 20) {
			this.aClass162_3.method3729(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
	public boolean method158() {
		return this.method165() >= 20;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!lh;ZB)V")
	public void method159(@OriginalArg(0) Class145 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass145_3 != null) {
			try {
				this.aClass145_3.method3136();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass145_3 = null;
		}
		this.aClass145_3 = arg0;
		this.method168();
		this.method160(arg1);
		this.aClass3_Sub5_3.anInt3121 = 0;
		this.aClass3_Sub7_Sub2_Sub2_1 = null;
		while (true) {
			@Pc(40) Class3_Sub7_Sub2_Sub2 local40 = (Class3_Sub7_Sub2_Sub2) this.aClass162_2.method3735();
			if (local40 == null) {
				while (true) {
					@Pc(63) Class3_Sub7_Sub2_Sub2 local63 = (Class3_Sub7_Sub2_Sub2) this.aClass162_4.method3735();
					if (local63 == null) {
						if (this.aByte1 != 0) {
							try {
								this.aClass3_Sub5_2.anInt3121 = 0;
								this.aClass3_Sub5_2.method2791(4);
								this.aClass3_Sub5_2.method2791(this.aByte1);
								this.aClass3_Sub5_2.method2749(0);
								this.aClass145_3.method3143(4, this.aClass3_Sub5_2.aByteArray42);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass145_3.method3136();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt177++;
								this.aClass145_3 = null;
								this.anInt176 = -2;
							}
						}
						this.anInt175 = 0;
						this.aLong5 = Static288.method4512();
						return;
					}
					this.aClass162_3.method3729(local63);
				}
			}
			this.aClass162_1.method3729(local40);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V")
	public void method160(@OriginalArg(0) boolean arg0) {
		if (this.aClass145_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub5_2.anInt3121 = 0;
			this.aClass3_Sub5_2.method2791(arg0 ? 2 : 3);
			this.aClass3_Sub5_2.method2772(0);
			this.aClass145_3.method3143(4, this.aClass3_Sub5_2.aByteArray42);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass145_3.method3136();
			} catch (@Pc(50) Exception local50) {
			}
			this.aClass145_3 = null;
			this.anInt176 = -2;
			this.anInt177++;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)Z")
	public boolean method163() {
		@Pc(18) int local18;
		if (this.aClass145_3 != null) {
			@Pc(11) long local11 = Static288.method4512();
			local18 = (int) (local11 - this.aLong5);
			this.aLong5 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt175 += local18;
			if (this.anInt175 > 30000) {
				try {
					this.aClass145_3.method3136();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass145_3 = null;
			}
		}
		if (this.aClass145_3 == null) {
			return this.method165() == 0 && this.method166() == 0;
		}
		try {
			this.aClass145_3.method3144();
			for (@Pc(75) Class3_Sub7_Sub2_Sub2 local75 = (Class3_Sub7_Sub2_Sub2) this.aClass162_1.method3734(); local75 != null; local75 = (Class3_Sub7_Sub2_Sub2) this.aClass162_1.method3730()) {
				this.aClass3_Sub5_2.anInt3121 = 0;
				this.aClass3_Sub5_2.method2791(1);
				this.aClass3_Sub5_2.method2772((int) local75.aLong231);
				this.aClass145_3.method3143(4, this.aClass3_Sub5_2.aByteArray42);
				this.aClass162_2.method3729(local75);
			}
			for (@Pc(121) Class3_Sub7_Sub2_Sub2 local121 = (Class3_Sub7_Sub2_Sub2) this.aClass162_3.method3734(); local121 != null; local121 = (Class3_Sub7_Sub2_Sub2) this.aClass162_3.method3730()) {
				this.aClass3_Sub5_2.anInt3121 = 0;
				this.aClass3_Sub5_2.method2791(0);
				this.aClass3_Sub5_2.method2772((int) local121.aLong231);
				this.aClass145_3.method3143(4, this.aClass3_Sub5_2.aByteArray42);
				this.aClass162_4.method3729(local121);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(170) int local170 = this.aClass145_3.method3139();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt175 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass3_Sub7_Sub2_Sub2_1 == null) {
					local189 = 8;
				} else if (this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 == 0) {
					local189 = 1;
				}
				@Pc(213) int local213;
				@Pc(234) int local234;
				@Pc(296) int local296;
				if (local189 > 0) {
					local213 = local189 - this.aClass3_Sub5_3.anInt3121;
					if (local170 < local213) {
						local213 = local170;
					}
					this.aClass145_3.method3141(this.aClass3_Sub5_3.anInt3121, this.aClass3_Sub5_3.aByteArray42, local213);
					if (this.aByte1 != 0) {
						for (local234 = 0; local234 < local213; local234++) {
							this.aClass3_Sub5_3.aByteArray42[this.aClass3_Sub5_3.anInt3121 + local234] = (byte) (this.aClass3_Sub5_3.aByteArray42[this.aClass3_Sub5_3.anInt3121 + local234] ^ this.aByte1);
						}
					}
					this.aClass3_Sub5_3.anInt3121 += local213;
					if (this.aClass3_Sub5_3.anInt3121 >= local189) {
						if (this.aClass3_Sub7_Sub2_Sub2_1 == null) {
							this.aClass3_Sub5_3.anInt3121 = 0;
							local234 = this.aClass3_Sub5_3.method2739();
							local296 = this.aClass3_Sub5_3.method2767();
							@Pc(301) int local301 = this.aClass3_Sub5_3.method2739();
							@Pc(306) int local306 = this.aClass3_Sub5_3.method2726();
							@Pc(310) int local310 = local301 & 0x7F;
							@Pc(321) boolean local321 = (local301 & 0x80) != 0;
							@Pc(328) long local328 = (long) (local296 + (local234 << 16));
							@Pc(338) Class3_Sub7_Sub2_Sub2 local338;
							if (local321) {
								for (local338 = (Class3_Sub7_Sub2_Sub2) this.aClass162_4.method3734(); local338 != null && local328 != local338.aLong231; local338 = (Class3_Sub7_Sub2_Sub2) this.aClass162_4.method3730()) {
								}
							} else {
								for (local338 = (Class3_Sub7_Sub2_Sub2) this.aClass162_2.method3734(); local338 != null && local338.aLong231 != local328; local338 = (Class3_Sub7_Sub2_Sub2) this.aClass162_2.method3730()) {
								}
							}
							if (local338 == null) {
								throw new IOException();
							}
							this.aClass3_Sub7_Sub2_Sub2_1 = local338;
							@Pc(402) int local402 = local310 == 0 ? 5 : 9;
							this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8 = new Class3_Sub5(local402 + local306 + this.aClass3_Sub7_Sub2_Sub2_1.aByte66);
							this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.method2791(local310);
							this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.method2782(local306);
							this.aClass3_Sub5_3.anInt3121 = 0;
							this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 = 8;
						} else if (this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub5_3.aByteArray42[0] == -1) {
							this.aClass3_Sub5_3.anInt3121 = 0;
							this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 = 1;
						} else {
							this.aClass3_Sub7_Sub2_Sub2_1 = null;
						}
					}
				} else {
					local213 = this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.aByteArray42.length - this.aClass3_Sub7_Sub2_Sub2_1.aByte66;
					local234 = 512 - this.aClass3_Sub7_Sub2_Sub2_1.anInt4967;
					if (local213 - this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.anInt3121 < local234) {
						local234 = local213 - this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.anInt3121;
					}
					if (local234 > local170) {
						local234 = local170;
					}
					this.aClass145_3.method3141(this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.anInt3121, this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.aByteArray42, local234);
					if (this.aByte1 != 0) {
						for (local296 = 0; local296 < local234; local296++) {
							this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.aByteArray42[this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.anInt3121 + local296] ^= this.aByte1;
						}
					}
					this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.anInt3121 += local234;
					this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 += local234;
					if (local213 == this.aClass3_Sub7_Sub2_Sub2_1.aClass3_Sub5_8.anInt3121) {
						this.aClass3_Sub7_Sub2_Sub2_1.method5673();
						this.aClass3_Sub7_Sub2_Sub2_1.aBoolean387 = false;
						this.aClass3_Sub7_Sub2_Sub2_1 = null;
					} else if (this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 == 512) {
						this.aClass3_Sub7_Sub2_Sub2_1.anInt4967 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(617) IOException local617) {
			try {
				this.aClass145_3.method3136();
			} catch (@Pc(623) Exception local623) {
			}
			this.aClass145_3 = null;
			this.anInt177++;
			this.anInt176 = -2;
			return this.method165() == 0 && this.method166() == 0;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public void method164() {
		if (this.aClass145_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub5_2.anInt3121 = 0;
			this.aClass3_Sub5_2.method2791(7);
			this.aClass3_Sub5_2.method2772(0);
			this.aClass145_3.method3143(4, this.aClass3_Sub5_2.aByteArray42);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass145_3.method3136();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt177++;
			this.aClass145_3 = null;
			this.anInt176 = -2;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
	public int method165() {
		return this.aClass162_1.method3732() + this.aClass162_2.method3732();
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I")
	private int method166() {
		return this.aClass162_3.method3732() + this.aClass162_4.method3732();
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	public void method167() {
		if (this.aClass145_3 != null) {
			this.aClass145_3.method3140();
		}
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
	private void method168() {
		if (this.aClass145_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub5_2.anInt3121 = 0;
			this.aClass3_Sub5_2.method2791(6);
			this.aClass3_Sub5_2.method2772(3);
			this.aClass145_3.method3143(4, this.aClass3_Sub5_2.aByteArray42);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass145_3.method3136();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt176 = -2;
			this.aClass145_3 = null;
			this.anInt177++;
		}
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)Z")
	public boolean method169() {
		return this.method166() >= 20;
	}

	@OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
	public void method170() {
		if (this.aClass145_3 != null) {
			this.aClass145_3.method3136();
		}
	}
}
