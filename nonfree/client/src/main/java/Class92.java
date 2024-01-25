import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class92 {

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "Lclient!kc;")
	private Class130 aClass130_2;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
	private int anInt2178;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "Lclient!ml;")
	private Class1_Sub6_Sub10_Sub1 aClass1_Sub6_Sub10_Sub1_1;

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Lclient!oa;")
	private final Class170 aClass170_2 = new Class170();

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "Lclient!oa;")
	private final Class170 aClass170_3 = new Class170();

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "Lclient!oa;")
	private final Class170 aClass170_4 = new Class170();

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Lclient!oa;")
	private final Class170 aClass170_5 = new Class170();

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "Lclient!re;")
	private final Class1_Sub33 aClass1_Sub33_2 = new Class1_Sub33(4);

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
	public volatile int anInt2180 = 0;

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
	public volatile int anInt2179 = 0;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "Lclient!re;")
	private final Class1_Sub33 aClass1_Sub33_3 = new Class1_Sub33(8);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I")
	private int method1775() {
		return this.aClass170_4.method3687() + this.aClass170_5.method3687();
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Z")
	public boolean method1776() {
		@Pc(14) int local14;
		if (this.aClass130_2 != null) {
			@Pc(7) long local7 = Static378.method5293();
			local14 = (int) (local7 - this.aLong67);
			this.aLong67 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt2178 += local14;
			if (this.anInt2178 > 30000) {
				try {
					this.aClass130_2.method2668();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass130_2 = null;
			}
		}
		if (this.aClass130_2 == null) {
			return this.method1781() == 0 && this.method1775() == 0;
		}
		try {
			this.aClass130_2.method2669();
			for (@Pc(70) Class1_Sub6_Sub10_Sub1 local70 = (Class1_Sub6_Sub10_Sub1) this.aClass170_2.method3685(); local70 != null; local70 = (Class1_Sub6_Sub10_Sub1) this.aClass170_2.method3688()) {
				this.aClass1_Sub33_2.lb = 0;
				this.aClass1_Sub33_2.method5165(1);
				this.aClass1_Sub33_2.method5137((int) local70.aLong208);
				this.aClass130_2.method2670(4, this.aClass1_Sub33_2.aByteArray86);
				this.aClass170_3.method3690(local70);
			}
			for (@Pc(116) Class1_Sub6_Sub10_Sub1 local116 = (Class1_Sub6_Sub10_Sub1) this.aClass170_4.method3685(); local116 != null; local116 = (Class1_Sub6_Sub10_Sub1) this.aClass170_4.method3688()) {
				this.aClass1_Sub33_2.lb = 0;
				this.aClass1_Sub33_2.method5165(0);
				this.aClass1_Sub33_2.method5137((int) local116.aLong208);
				this.aClass130_2.method2670(4, this.aClass1_Sub33_2.aByteArray86);
				this.aClass170_5.method3690(local116);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(173) int local173 = this.aClass130_2.method2675();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt2178 = 0;
				@Pc(186) byte local186 = 0;
				if (this.aClass1_Sub6_Sub10_Sub1_1 == null) {
					local186 = 8;
				} else if (this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 == 0) {
					local186 = 1;
				}
				@Pc(218) int local218;
				@Pc(225) int local225;
				@Pc(265) int local265;
				if (local186 <= 0) {
					local218 = this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.aByteArray86.length - this.aClass1_Sub6_Sub10_Sub1_1.aByte53;
					local225 = 512 - this.aClass1_Sub6_Sub10_Sub1_1.anInt3823;
					if (local218 - this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.lb < local225) {
						local225 = local218 - this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.lb;
					}
					if (local173 < local225) {
						local225 = local173;
					}
					this.aClass130_2.method2666(local225, this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.aByteArray86, this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.lb);
					if (this.aByte22 != 0) {
						for (local265 = 0; local265 < local225; local265++) {
							this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.aByteArray86[this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.lb + local265] ^= this.aByte22;
						}
					}
					this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.lb += local225;
					this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 += local225;
					if (local218 == this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.lb) {
						this.aClass1_Sub6_Sub10_Sub1_1.method5580();
						this.aClass1_Sub6_Sub10_Sub1_1.aBoolean595 = false;
						this.aClass1_Sub6_Sub10_Sub1_1 = null;
					} else if (this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 == 512) {
						this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 = 0;
					}
				} else {
					local218 = local186 - this.aClass1_Sub33_3.lb;
					if (local218 > local173) {
						local218 = local173;
					}
					this.aClass130_2.method2666(local218, this.aClass1_Sub33_3.aByteArray86, this.aClass1_Sub33_3.lb);
					if (this.aByte22 != 0) {
						for (local225 = 0; local225 < local218; local225++) {
							this.aClass1_Sub33_3.aByteArray86[this.aClass1_Sub33_3.lb + local225] = (byte) (this.aClass1_Sub33_3.aByteArray86[this.aClass1_Sub33_3.lb + local225] ^ this.aByte22);
						}
					}
					this.aClass1_Sub33_3.lb += local218;
					if (this.aClass1_Sub33_3.lb >= local186) {
						if (this.aClass1_Sub6_Sub10_Sub1_1 == null) {
							this.aClass1_Sub33_3.lb = 0;
							local225 = this.aClass1_Sub33_3.method5174();
							local265 = this.aClass1_Sub33_3.method5177();
							@Pc(451) int local451 = this.aClass1_Sub33_3.method5174();
							@Pc(456) int local456 = this.aClass1_Sub33_3.method5150();
							@Pc(460) int local460 = local451 & 0x7F;
							@Pc(471) boolean local471 = (local451 & 0x80) != 0;
							@Pc(479) long local479 = (long) ((local225 << 16) + local265);
							@Pc(489) Class1_Sub6_Sub10_Sub1 local489;
							if (local471) {
								for (local489 = (Class1_Sub6_Sub10_Sub1) this.aClass170_5.method3685(); local489 != null && local479 != local489.aLong208; local489 = (Class1_Sub6_Sub10_Sub1) this.aClass170_5.method3688()) {
								}
							} else {
								for (local489 = (Class1_Sub6_Sub10_Sub1) this.aClass170_3.method3685(); local489 != null && local489.aLong208 != local479; local489 = (Class1_Sub6_Sub10_Sub1) this.aClass170_3.method3688()) {
								}
							}
							if (local489 == null) {
								throw new IOException();
							}
							this.aClass1_Sub6_Sub10_Sub1_1 = local489;
							@Pc(556) int local556 = local460 == 0 ? 5 : 9;
							this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6 = new Class1_Sub33(this.aClass1_Sub6_Sub10_Sub1_1.aByte53 + local456 + local556);
							this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.method5165(local460);
							this.aClass1_Sub6_Sub10_Sub1_1.aClass1_Sub33_6.method5142(local456);
							this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 = 8;
							this.aClass1_Sub33_3.lb = 0;
						} else if (this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub33_3.aByteArray86[0] == -1) {
							this.aClass1_Sub6_Sub10_Sub1_1.anInt3823 = 1;
							this.aClass1_Sub33_3.lb = 0;
						} else {
							this.aClass1_Sub6_Sub10_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(630) IOException local630) {
			try {
				this.aClass130_2.method2668();
			} catch (@Pc(636) Exception local636) {
			}
			this.anInt2180++;
			this.anInt2179 = -2;
			this.aClass130_2 = null;
			return this.method1781() == 0 && this.method1775() == 0;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method1777() {
		try {
			this.aClass130_2.method2668();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2180++;
		this.aClass130_2 = null;
		this.anInt2179 = -1;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method1778() {
		if (this.aClass130_2 != null) {
			this.aClass130_2.method2668();
		}
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Z")
	public boolean method1779() {
		return this.method1775() >= 20;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)Z")
	public boolean method1780() {
		return this.method1781() >= 20;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)I")
	public int method1781() {
		return this.aClass170_2.method3687() + this.aClass170_3.method3687();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
	public void method1782(@OriginalArg(0) boolean arg0) {
		if (this.aClass130_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub33_2.lb = 0;
			this.aClass1_Sub33_2.method5165(arg0 ? 2 : 3);
			this.aClass1_Sub33_2.method5137(0);
			this.aClass130_2.method2670(4, this.aClass1_Sub33_2.aByteArray86);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass130_2.method2668();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt2179 = -2;
			this.anInt2180++;
			this.aClass130_2 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	private void method1783() {
		if (this.aClass130_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub33_2.lb = 0;
			this.aClass1_Sub33_2.method5165(6);
			this.aClass1_Sub33_2.method5137(3);
			this.aClass130_2.method2670(4, this.aClass1_Sub33_2.aByteArray86);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass130_2.method2668();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt2179 = -2;
			this.anInt2180++;
			this.aClass130_2 = null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V")
	public void method1784() {
		if (this.aClass130_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub33_2.lb = 0;
			this.aClass1_Sub33_2.method5165(7);
			this.aClass1_Sub33_2.method5137(0);
			this.aClass130_2.method2670(4, this.aClass1_Sub33_2.aByteArray86);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass130_2.method2668();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt2180++;
			this.aClass130_2 = null;
			this.anInt2179 = -2;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZBIIZ)Lclient!ml;")
	public Class1_Sub6_Sub10_Sub1 method1785(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg3 << 16));
		@Pc(14) Class1_Sub6_Sub10_Sub1 local14 = new Class1_Sub6_Sub10_Sub1();
		local14.aBoolean596 = arg0;
		local14.aLong208 = local10;
		local14.aByte53 = arg1;
		if (arg0) {
			if (this.method1781() >= 20) {
				throw new RuntimeException();
			}
			this.aClass170_2.method3690(local14);
		} else if (this.method1775() < 20) {
			this.aClass170_4.method3690(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZLclient!kc;)V")
	public void method1786(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class130 arg1) {
		if (this.aClass130_2 != null) {
			try {
				this.aClass130_2.method2668();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass130_2 = null;
		}
		this.aClass130_2 = arg1;
		this.method1783();
		this.method1782(arg0);
		this.aClass1_Sub33_3.lb = 0;
		this.aClass1_Sub6_Sub10_Sub1_1 = null;
		while (true) {
			@Pc(47) Class1_Sub6_Sub10_Sub1 local47 = (Class1_Sub6_Sub10_Sub1) this.aClass170_3.method3684();
			if (local47 == null) {
				while (true) {
					local47 = (Class1_Sub6_Sub10_Sub1) this.aClass170_5.method3684();
					if (local47 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aClass1_Sub33_2.lb = 0;
								this.aClass1_Sub33_2.method5165(4);
								this.aClass1_Sub33_2.method5165(this.aByte22);
								this.aClass1_Sub33_2.method5138(0);
								this.aClass130_2.method2670(4, this.aClass1_Sub33_2.aByteArray86);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass130_2.method2668();
								} catch (@Pc(111) Exception local111) {
								}
								this.anInt2180++;
								this.anInt2179 = -2;
								this.aClass130_2 = null;
							}
						}
						this.anInt2178 = 0;
						this.aLong67 = Static378.method5293();
						return;
					}
					this.aClass170_4.method3690(local47);
				}
			}
			this.aClass170_2.method3690(local47);
		}
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
	public void method1788() {
		if (this.aClass130_2 != null) {
			this.aClass130_2.method2674();
		}
	}
}
