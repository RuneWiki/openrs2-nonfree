import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class117 {

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "Lclient!dv;")
	private Class76 aClass76_2;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
	private int anInt3915;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "Lclient!nn;")
	private Class3_Sub7_Sub5_Sub1 aClass3_Sub7_Sub5_Sub1_1;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!ce;")
	private final Class49 aClass49_3 = new Class49();

	@OriginalMember(owner = "client!gq", name = "f", descriptor = "Lclient!ce;")
	private final Class49 aClass49_4 = new Class49();

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "Lclient!ce;")
	private final Class49 aClass49_5 = new Class49();

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "Lclient!ce;")
	private final Class49 aClass49_6 = new Class49();

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "Lclient!ie;")
	private final Class3_Sub26 aClass3_Sub26_1 = new Class3_Sub26(4);

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
	public volatile int anInt3916 = 0;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
	public volatile int anInt3917 = 0;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "Lclient!ie;")
	private final Class3_Sub26 aClass3_Sub26_2 = new Class3_Sub26(8);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	public boolean method3167() {
		@Pc(14) int local14;
		if (this.aClass76_2 != null) {
			@Pc(7) long local7 = Static96.method2000();
			local14 = (int) (local7 - this.aLong88);
			this.aLong88 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt3915 += local14;
			if (this.anInt3915 > 30000) {
				try {
					this.aClass76_2.method2193();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass76_2 = null;
			}
		}
		if (this.aClass76_2 == null) {
			return this.method3172() == 0 && this.method3178() == 0;
		}
		try {
			this.aClass76_2.method2187();
			for (@Pc(72) Class3_Sub7_Sub5_Sub1 local72 = (Class3_Sub7_Sub5_Sub1) this.aClass49_3.method1448(); local72 != null; local72 = (Class3_Sub7_Sub5_Sub1) this.aClass49_3.method1451()) {
				this.aClass3_Sub26_1.anInt8703 = 0;
				this.aClass3_Sub26_1.method6809(1);
				this.aClass3_Sub26_1.method6791((int) local72.aLong263);
				this.aClass76_2.method2191(this.aClass3_Sub26_1.aByteArray213, 4);
				this.aClass49_4.method1455(local72);
			}
			for (@Pc(120) Class3_Sub7_Sub5_Sub1 local120 = (Class3_Sub7_Sub5_Sub1) this.aClass49_5.method1448(); local120 != null; local120 = (Class3_Sub7_Sub5_Sub1) this.aClass49_5.method1451()) {
				this.aClass3_Sub26_1.anInt8703 = 0;
				this.aClass3_Sub26_1.method6809(0);
				this.aClass3_Sub26_1.method6791((int) local120.aLong263);
				this.aClass76_2.method2191(this.aClass3_Sub26_1.aByteArray213, 4);
				this.aClass49_6.method1455(local120);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(181) int local181 = this.aClass76_2.method2185();
				if (local181 < 0) {
					throw new IOException();
				}
				if (local181 == 0) {
					break;
				}
				this.anInt3915 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass3_Sub7_Sub5_Sub1_1 == null) {
					local194 = 8;
				} else if (this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 == 0) {
					local194 = 1;
				}
				@Pc(216) int local216;
				@Pc(237) int local237;
				@Pc(304) int local304;
				if (local194 > 0) {
					local216 = local194 - this.aClass3_Sub26_2.anInt8703;
					if (local181 < local216) {
						local216 = local181;
					}
					this.aClass76_2.method2194(this.aClass3_Sub26_2.aByteArray213, local216, this.aClass3_Sub26_2.anInt8703);
					if (this.aByte39 != 0) {
						for (local237 = 0; local237 < local216; local237++) {
							this.aClass3_Sub26_2.aByteArray213[this.aClass3_Sub26_2.anInt8703 + local237] ^= this.aByte39;
						}
					}
					this.aClass3_Sub26_2.anInt8703 += local216;
					if (local194 <= this.aClass3_Sub26_2.anInt8703) {
						if (this.aClass3_Sub7_Sub5_Sub1_1 == null) {
							this.aClass3_Sub26_2.anInt8703 = 0;
							local237 = this.aClass3_Sub26_2.method6814();
							local304 = this.aClass3_Sub26_2.method6811();
							@Pc(311) int local311 = this.aClass3_Sub26_2.method6814();
							@Pc(318) int local318 = this.aClass3_Sub26_2.method6816();
							@Pc(322) int local322 = local311 & 0x7F;
							@Pc(333) boolean local333 = (local311 & 0x80) != 0;
							@Pc(340) long local340 = (long) (local304 + (local237 << 16));
							@Pc(350) Class3_Sub7_Sub5_Sub1 local350;
							if (local333) {
								for (local350 = (Class3_Sub7_Sub5_Sub1) this.aClass49_6.method1448(); local350 != null && local340 != local350.aLong263; local350 = (Class3_Sub7_Sub5_Sub1) this.aClass49_6.method1451()) {
								}
							} else {
								for (local350 = (Class3_Sub7_Sub5_Sub1) this.aClass49_4.method1448(); local350 != null && local340 != local350.aLong263; local350 = (Class3_Sub7_Sub5_Sub1) this.aClass49_4.method1451()) {
								}
							}
							if (local350 == null) {
								throw new IOException();
							}
							@Pc(411) int local411 = local322 == 0 ? 5 : 9;
							this.aClass3_Sub7_Sub5_Sub1_1 = local350;
							this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4 = new Class3_Sub26(local318 + local411 + this.aClass3_Sub7_Sub5_Sub1_1.aByte88);
							this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.method6809(local322);
							this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.method6826(local318);
							this.aClass3_Sub26_2.anInt8703 = 0;
							this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 = 8;
						} else if (this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub26_2.aByteArray213[0] == -1) {
							this.aClass3_Sub26_2.anInt8703 = 0;
							this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 = 1;
						} else {
							this.aClass3_Sub7_Sub5_Sub1_1 = null;
						}
					}
				} else {
					local216 = this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.aByteArray213.length - this.aClass3_Sub7_Sub5_Sub1_1.aByte88;
					local237 = 512 - this.aClass3_Sub7_Sub5_Sub1_1.anInt6455;
					if (local237 > local216 - this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703) {
						local237 = local216 - this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703;
					}
					if (local181 < local237) {
						local237 = local181;
					}
					this.aClass76_2.method2194(this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.aByteArray213, local237, this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703);
					if (this.aByte39 != 0) {
						for (local304 = 0; local304 < local237; local304++) {
							this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.aByteArray213[this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703 + local304] = (byte) (this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.aByteArray213[this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703 + local304] ^ this.aByte39);
						}
					}
					this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703 += local237;
					this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 += local237;
					if (local216 == this.aClass3_Sub7_Sub5_Sub1_1.aClass3_Sub26_4.anInt8703) {
						this.aClass3_Sub7_Sub5_Sub1_1.method8136();
						this.aClass3_Sub7_Sub5_Sub1_1.aBoolean636 = false;
						this.aClass3_Sub7_Sub5_Sub1_1 = null;
					} else if (this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 == 512) {
						this.aClass3_Sub7_Sub5_Sub1_1.anInt6455 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(634) IOException local634) {
			try {
				this.aClass76_2.method2193();
			} catch (@Pc(640) Exception local640) {
			}
			this.anInt3916++;
			this.anInt3917 = -2;
			this.aClass76_2 = null;
			return this.method3172() == 0 && this.method3178() == 0;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)Z")
	public boolean method3168() {
		return this.method3178() >= 20;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILclient!dv;)V")
	public void method3169(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class76 arg1) {
		if (this.aClass76_2 != null) {
			try {
				this.aClass76_2.method2193();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass76_2 = null;
		}
		this.aClass76_2 = arg1;
		this.method3174();
		this.method3180(arg0);
		this.aClass3_Sub7_Sub5_Sub1_1 = null;
		this.aClass3_Sub26_2.anInt8703 = 0;
		while (true) {
			@Pc(40) Class3_Sub7_Sub5_Sub1 local40 = (Class3_Sub7_Sub5_Sub1) this.aClass49_4.method1452();
			if (local40 == null) {
				while (true) {
					local40 = (Class3_Sub7_Sub5_Sub1) this.aClass49_6.method1452();
					if (local40 == null) {
						if (this.aByte39 != 0) {
							try {
								this.aClass3_Sub26_1.anInt8703 = 0;
								this.aClass3_Sub26_1.method6809(4);
								this.aClass3_Sub26_1.method6809(this.aByte39);
								this.aClass3_Sub26_1.method6769(0);
								this.aClass76_2.method2191(this.aClass3_Sub26_1.aByteArray213, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass76_2.method2193();
								} catch (@Pc(113) Exception local113) {
								}
								this.anInt3917 = -2;
								this.aClass76_2 = null;
								this.anInt3916++;
							}
						}
						this.anInt3915 = 0;
						this.aLong88 = Static96.method2000();
						return;
					}
					this.aClass49_5.method1455(local40);
				}
			}
			this.aClass49_3.method1455(local40);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)Z")
	public boolean method3170() {
		return this.method3172() >= 20;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	public void method3171() {
		try {
			this.aClass76_2.method2193();
		} catch (@Pc(10) Exception local10) {
		}
		this.aClass76_2 = null;
		this.anInt3917 = -1;
		this.anInt3916++;
		this.aByte39 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)I")
	public int method3172() {
		return this.aClass49_3.method1449() + this.aClass49_4.method1449();
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V")
	public void method3173() {
		if (this.aClass76_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub26_1.anInt8703 = 0;
			this.aClass3_Sub26_1.method6809(7);
			this.aClass3_Sub26_1.method6791(0);
			this.aClass76_2.method2191(this.aClass3_Sub26_1.aByteArray213, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass76_2.method2193();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass76_2 = null;
			this.anInt3917 = -2;
			this.anInt3916++;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
	private void method3174() {
		if (this.aClass76_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub26_1.anInt8703 = 0;
			this.aClass3_Sub26_1.method6809(6);
			this.aClass3_Sub26_1.method6791(3);
			this.aClass76_2.method2191(this.aClass3_Sub26_1.aByteArray213, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass76_2.method2193();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass76_2 = null;
			this.anInt3916++;
			this.anInt3917 = -2;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIZBI)Lclient!nn;")
	public Class3_Sub7_Sub5_Sub1 method3176(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(18) long local18 = (long) (arg3 + (arg0 << 16));
		@Pc(22) Class3_Sub7_Sub5_Sub1 local22 = new Class3_Sub7_Sub5_Sub1();
		local22.aByte88 = arg2;
		local22.aBoolean638 = arg1;
		local22.aLong263 = local18;
		if (arg1) {
			if (this.method3172() >= 20) {
				throw new RuntimeException();
			}
			this.aClass49_3.method1455(local22);
		} else if (this.method3178() < 20) {
			this.aClass49_5.method1455(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(Z)I")
	private int method3178() {
		return this.aClass49_5.method1449() + this.aClass49_6.method1449();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZI)V")
	public void method3180(@OriginalArg(0) boolean arg0) {
		if (this.aClass76_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub26_1.anInt8703 = 0;
			this.aClass3_Sub26_1.method6809(arg0 ? 2 : 3);
			this.aClass3_Sub26_1.method6791(0);
			this.aClass76_2.method2191(this.aClass3_Sub26_1.aByteArray213, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass76_2.method2193();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt3916++;
			this.aClass76_2 = null;
			this.anInt3917 = -2;
		}
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)V")
	public void method3181() {
		if (this.aClass76_2 != null) {
			this.aClass76_2.method2193();
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(Z)V")
	public void method3182() {
		if (this.aClass76_2 != null) {
			this.aClass76_2.method2186();
		}
	}
}
