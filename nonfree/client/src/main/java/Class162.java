import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class162 {

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!nj;")
	private Class113 aClass113_5;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	private int anInt5161;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!qf;")
	private Class1_Sub2_Sub6_Sub2 aClass1_Sub2_Sub6_Sub2_2;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!qk;")
	private Class140 aClass140_6 = new Class140();

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Lclient!qk;")
	private Class140 aClass140_7 = new Class140();

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!qk;")
	private Class140 aClass140_8 = new Class140();

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!qk;")
	private Class140 aClass140_9 = new Class140();

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!cg;")
	private Class1_Sub11 aClass1_Sub11_8 = new Class1_Sub11(4);

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	public volatile int anInt5162 = 0;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	public volatile int anInt5163 = 0;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!cg;")
	private Class1_Sub11 aClass1_Sub11_9 = new Class1_Sub11(8);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public void method4031() {
		if (this.aClass113_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub11_8.anInt3264 = 0;
			this.aClass1_Sub11_8.method2655(7);
			this.aClass1_Sub11_8.method2676(0);
			this.aClass113_5.method3017(4, this.aClass1_Sub11_8.aByteArray47);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass113_5.method3019();
			} catch (@Pc(47) Exception local47) {
			}
			this.aClass113_5 = null;
			this.anInt5162++;
			this.anInt5163 = -2;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	private void method4033() {
		if (this.aClass113_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub11_8.anInt3264 = 0;
			this.aClass1_Sub11_8.method2655(6);
			this.aClass1_Sub11_8.method2676(3);
			this.aClass113_5.method3017(4, this.aClass1_Sub11_8.aByteArray47);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass113_5.method3019();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt5162++;
			this.anInt5163 = -2;
			this.aClass113_5 = null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Z")
	public boolean method4034() {
		@Pc(17) int local17;
		if (this.aClass113_5 != null) {
			@Pc(11) long local11 = Static294.method4413();
			local17 = (int) (local11 - this.aLong185);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong185 = local11;
			this.anInt5161 += local17;
			if (this.anInt5161 > 30000) {
				try {
					this.aClass113_5.method3019();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass113_5 = null;
			}
		}
		if (this.aClass113_5 == null) {
			return this.method4043() == 0 && this.method4035() == 0;
		}
		try {
			this.aClass113_5.method3018();
			for (@Pc(75) Class1_Sub2_Sub6_Sub2 local75 = (Class1_Sub2_Sub6_Sub2) this.aClass140_6.method3413(); local75 != null; local75 = (Class1_Sub2_Sub6_Sub2) this.aClass140_6.method3415()) {
				this.aClass1_Sub11_8.anInt3264 = 0;
				this.aClass1_Sub11_8.method2655(1);
				this.aClass1_Sub11_8.method2676((int) local75.aLong201);
				this.aClass113_5.method3017(4, this.aClass1_Sub11_8.aByteArray47);
				this.aClass140_7.method3414(local75);
			}
			for (@Pc(130) Class1_Sub2_Sub6_Sub2 local130 = (Class1_Sub2_Sub6_Sub2) this.aClass140_8.method3413(); local130 != null; local130 = (Class1_Sub2_Sub6_Sub2) this.aClass140_8.method3415()) {
				this.aClass1_Sub11_8.anInt3264 = 0;
				this.aClass1_Sub11_8.method2655(0);
				this.aClass1_Sub11_8.method2676((int) local130.aLong201);
				this.aClass113_5.method3017(4, this.aClass1_Sub11_8.aByteArray47);
				this.aClass140_9.method3414(local130);
			}
			for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
				local17 = this.aClass113_5.method3014();
				if (local17 < 0) {
					throw new IOException();
				}
				if (local17 == 0) {
					break;
				}
				@Pc(195) byte local195 = 0;
				if (this.aClass1_Sub2_Sub6_Sub2_2 == null) {
					local195 = 8;
				} else if (this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 == 0) {
					local195 = 1;
				}
				this.anInt5161 = 0;
				@Pc(225) int local225;
				@Pc(248) int local248;
				@Pc(310) int local310;
				if (local195 > 0) {
					local225 = local195 - this.aClass1_Sub11_9.anInt3264;
					if (local225 > local17) {
						local225 = local17;
					}
					this.aClass113_5.method3015(this.aClass1_Sub11_9.aByteArray47, local225, this.aClass1_Sub11_9.anInt3264);
					if (this.aByte22 != 0) {
						for (local248 = 0; local248 < local225; local248++) {
							this.aClass1_Sub11_9.aByteArray47[this.aClass1_Sub11_9.anInt3264 + local248] = (byte) (this.aClass1_Sub11_9.aByteArray47[this.aClass1_Sub11_9.anInt3264 + local248] ^ this.aByte22);
						}
					}
					this.aClass1_Sub11_9.anInt3264 += local225;
					if (local195 <= this.aClass1_Sub11_9.anInt3264) {
						if (this.aClass1_Sub2_Sub6_Sub2_2 == null) {
							this.aClass1_Sub11_9.anInt3264 = 0;
							local248 = this.aClass1_Sub11_9.method2690();
							local310 = this.aClass1_Sub11_9.method2691();
							@Pc(315) int local315 = this.aClass1_Sub11_9.method2690();
							@Pc(319) int local319 = local315 & 0x7F;
							@Pc(330) boolean local330 = (local315 & 0x80) != 0;
							@Pc(340) long local340 = (long) ((local248 << 16) + local310);
							@Pc(345) int local345 = this.aClass1_Sub11_9.method2643();
							@Pc(353) Class1_Sub2_Sub6_Sub2 local353;
							if (local330) {
								for (local353 = (Class1_Sub2_Sub6_Sub2) this.aClass140_9.method3413(); local353 != null && local340 != local353.aLong201; local353 = (Class1_Sub2_Sub6_Sub2) this.aClass140_9.method3415()) {
								}
							} else {
								for (local353 = (Class1_Sub2_Sub6_Sub2) this.aClass140_7.method3413(); local353 != null && local353.aLong201 != local340; local353 = (Class1_Sub2_Sub6_Sub2) this.aClass140_7.method3415()) {
								}
							}
							if (local353 == null) {
								throw new IOException();
							}
							this.aClass1_Sub2_Sub6_Sub2_2 = local353;
							@Pc(407) int local407 = local319 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5 = new Class1_Sub11(this.aClass1_Sub2_Sub6_Sub2_2.aByte15 + local407 + local345);
							this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.method2655(local319);
							this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.method2659(local345);
							this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 = 8;
							this.aClass1_Sub11_9.anInt3264 = 0;
						} else if (this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub11_9.aByteArray47[0] == -1) {
							this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 = 1;
							this.aClass1_Sub11_9.anInt3264 = 0;
						} else {
							this.aClass1_Sub2_Sub6_Sub2_2 = null;
						}
					}
				} else {
					local225 = this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.aByteArray47.length - this.aClass1_Sub2_Sub6_Sub2_2.aByte15;
					local248 = 512 - this.aClass1_Sub2_Sub6_Sub2_2.anInt4227;
					if (local225 - this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.anInt3264 < local248) {
						local248 = local225 - this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.anInt3264;
					}
					if (local248 > local17) {
						local248 = local17;
					}
					this.aClass113_5.method3015(this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.aByteArray47, local248, this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.anInt3264);
					if (this.aByte22 != 0) {
						for (local310 = 0; local310 < local248; local310++) {
							this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.aByteArray47[this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.anInt3264 + local310] ^= this.aByte22;
						}
					}
					this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 += local248;
					this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.anInt3264 += local248;
					if (this.aClass1_Sub2_Sub6_Sub2_2.aClass1_Sub11_5.anInt3264 == local225) {
						this.aClass1_Sub2_Sub6_Sub2_2.method4347();
						this.aClass1_Sub2_Sub6_Sub2_2.aBoolean325 = false;
						this.aClass1_Sub2_Sub6_Sub2_2 = null;
					} else if (this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 == 512) {
						this.aClass1_Sub2_Sub6_Sub2_2.anInt4227 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(626) IOException local626) {
			try {
				this.aClass113_5.method3019();
			} catch (@Pc(632) Exception local632) {
			}
			this.anInt5163 = -2;
			this.aClass113_5 = null;
			this.anInt5162++;
			return this.method4043() == 0 && this.method4035() == 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)I")
	private int method4035() {
		return this.aClass140_8.method3418() + this.aClass140_9.method3418();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBZIZ)Lclient!qf;")
	public Class1_Sub2_Sub6_Sub2 method4036(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(14) Class1_Sub2_Sub6_Sub2 local14 = new Class1_Sub2_Sub6_Sub2();
		local14.aBoolean327 = arg3;
		local14.aLong201 = local10;
		local14.aByte15 = arg1;
		if (arg3) {
			if (this.method4043() >= 20) {
				throw new RuntimeException();
			}
			this.aClass140_6.method3414(local14);
		} else if (this.method4035() < 20) {
			this.aClass140_8.method3414(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public void method4037() {
		try {
			this.aClass113_5.method3019();
		} catch (@Pc(16) Exception local16) {
		}
		this.aByte22 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt5162++;
		this.aClass113_5 = null;
		this.anInt5163 = -1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Z")
	public boolean method4039() {
		return this.method4043() >= 20;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public void method4040() {
		if (this.aClass113_5 != null) {
			this.aClass113_5.method3020();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)Z")
	public boolean method4041() {
		return this.method4035() >= 20;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V")
	public void method4042() {
		if (this.aClass113_5 != null) {
			this.aClass113_5.method3019();
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(B)I")
	public int method4043() {
		return this.aClass140_6.method3418() + this.aClass140_7.method3418();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!nj;ZI)V")
	public void method4044(@OriginalArg(0) Class113 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass113_5 != null) {
			try {
				this.aClass113_5.method3019();
			} catch (@Pc(12) Exception local12) {
			}
			this.aClass113_5 = null;
		}
		this.aClass113_5 = arg0;
		this.method4033();
		this.method4046(arg1);
		this.aClass1_Sub11_9.anInt3264 = 0;
		this.aClass1_Sub2_Sub6_Sub2_2 = null;
		while (true) {
			@Pc(42) Class1_Sub2_Sub6_Sub2 local42 = (Class1_Sub2_Sub6_Sub2) this.aClass140_7.method3416();
			if (local42 == null) {
				while (true) {
					local42 = (Class1_Sub2_Sub6_Sub2) this.aClass140_9.method3416();
					if (local42 == null) {
						if (this.aByte22 != 0) {
							try {
								this.aClass1_Sub11_8.anInt3264 = 0;
								this.aClass1_Sub11_8.method2655(4);
								this.aClass1_Sub11_8.method2655(this.aByte22);
								this.aClass1_Sub11_8.method2660(0);
								this.aClass113_5.method3017(4, this.aClass1_Sub11_8.aByteArray47);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass113_5.method3019();
								} catch (@Pc(109) Exception local109) {
								}
								this.aClass113_5 = null;
								this.anInt5163 = -2;
								this.anInt5162++;
							}
						}
						this.anInt5161 = 0;
						this.aLong185 = Static294.method4413();
						return;
					}
					this.aClass140_8.method3414(local42);
				}
			}
			this.aClass140_6.method3414(local42);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
	public void method4046(@OriginalArg(1) boolean arg0) {
		if (this.aClass113_5 == null) {
			return;
		}
		try {
			this.aClass1_Sub11_8.anInt3264 = 0;
			this.aClass1_Sub11_8.method2655(arg0 ? 2 : 3);
			this.aClass1_Sub11_8.method2676(0);
			this.aClass113_5.method3017(4, this.aClass1_Sub11_8.aByteArray47);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass113_5.method3019();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5162++;
			this.aClass113_5 = null;
			this.anInt5163 = -2;
		}
	}
}
