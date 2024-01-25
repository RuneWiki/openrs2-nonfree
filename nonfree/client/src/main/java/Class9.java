import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class9 {

	@OriginalMember(owner = "client!aga", name = "w", descriptor = "Lclient!mea;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "J")
	private long aLong16;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!aga", name = "D", descriptor = "Lclient!uh;")
	private Class1_Sub6_Sub2_Sub2 aClass1_Sub6_Sub2_Sub2_1;

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "Lclient!gm;")
	private final Class125 aClass125_1 = new Class125();

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "Lclient!gm;")
	private final Class125 aClass125_2 = new Class125();

	@OriginalMember(owner = "client!aga", name = "t", descriptor = "Lclient!gm;")
	private final Class125 aClass125_3 = new Class125();

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "Lclient!gm;")
	private final Class125 aClass125_4 = new Class125();

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "Lclient!mo;")
	private final Class1_Sub35 aClass1_Sub35_1 = new Class1_Sub35(4);

	@OriginalMember(owner = "client!aga", name = "C", descriptor = "B")
	private byte aByte10 = 0;

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
	public volatile int anInt190 = 0;

	@OriginalMember(owner = "client!aga", name = "B", descriptor = "I")
	public volatile int anInt191 = 0;

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "Lclient!mo;")
	private final Class1_Sub35 aClass1_Sub35_2 = new Class1_Sub35(8);

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)I")
	public int method129() {
		return this.aClass125_1.method2419() + this.aClass125_2.method2419();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	public void method131() {
		if (this.aClass221_1 != null) {
			this.aClass221_1.method4421();
		}
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V")
	private void method133() {
		if (this.aClass221_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub35_1.anInt7214 = 0;
			this.aClass1_Sub35_1.method5777(6);
			this.aClass1_Sub35_1.method5755(3);
			this.aClass221_1.method4414(this.aClass1_Sub35_1.aByteArray85, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass221_1.method4421();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt191 = -2;
			this.anInt190++;
			this.aClass221_1 = null;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
	public void method134() {
		if (this.aClass221_1 != null) {
			this.aClass221_1.method4417();
		}
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)I")
	private int method135() {
		return this.aClass125_3.method2419() + this.aClass125_4.method2419();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)Z")
	public boolean method136() {
		return this.method129() >= 20;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)V")
	public void method137() {
		if (this.aClass221_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub35_1.anInt7214 = 0;
			this.aClass1_Sub35_1.method5777(7);
			this.aClass1_Sub35_1.method5755(0);
			this.aClass221_1.method4414(this.aClass1_Sub35_1.aByteArray85, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass221_1.method4421();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass221_1 = null;
			this.anInt190++;
			this.anInt191 = -2;
		}
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)V")
	public void method138() {
		try {
			this.aClass221_1.method4421();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt191 = -1;
		this.anInt190++;
		this.aByte10 = (byte) ((double) 1 + Math.random() * 255.0D);
		this.aClass221_1 = null;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIBBZ)Lclient!uh;")
	public Class1_Sub6_Sub2_Sub2 method140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(16) long local16 = (long) ((arg0 << 16) + arg1);
		@Pc(20) Class1_Sub6_Sub2_Sub2 local20 = new Class1_Sub6_Sub2_Sub2();
		local20.aBoolean689 = arg3;
		local20.aByte114 = arg2;
		local20.aLong293 = local16;
		if (arg3) {
			if (this.method129() >= 20) {
				throw new RuntimeException();
			}
			this.aClass125_1.method2426(local20);
		} else if (this.method135() < 20) {
			this.aClass125_3.method2426(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZLclient!mea;)V")
	public void method141(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class221 arg1) {
		if (this.aClass221_1 != null) {
			try {
				this.aClass221_1.method4421();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass221_1 = null;
		}
		this.aClass221_1 = arg1;
		this.method133();
		this.method144(arg0);
		this.aClass1_Sub35_2.anInt7214 = 0;
		this.aClass1_Sub6_Sub2_Sub2_1 = null;
		while (true) {
			@Pc(48) Class1_Sub6_Sub2_Sub2 local48 = (Class1_Sub6_Sub2_Sub2) this.aClass125_2.method2421();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub6_Sub2_Sub2) this.aClass125_4.method2421();
					if (local48 == null) {
						if (this.aByte10 != 0) {
							try {
								this.aClass1_Sub35_1.anInt7214 = 0;
								this.aClass1_Sub35_1.method5777(4);
								this.aClass1_Sub35_1.method5777(this.aByte10);
								this.aClass1_Sub35_1.method5776(0);
								this.aClass221_1.method4414(this.aClass1_Sub35_1.aByteArray85, 4);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass221_1.method4421();
								} catch (@Pc(116) Exception local116) {
								}
								this.anInt191 = -2;
								this.aClass221_1 = null;
								this.anInt190++;
							}
						}
						this.anInt189 = 0;
						this.aLong16 = Static413.method5668();
						return;
					}
					this.aClass125_3.method2426(local48);
				}
			}
			this.aClass125_1.method2426(local48);
		}
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(B)Z")
	public boolean method142() {
		if (this.aClass221_1 != null) {
			@Pc(7) long local7 = Static413.method5668();
			@Pc(14) int local14 = (int) (local7 - this.aLong16);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong16 = local7;
			this.anInt189 += local14;
			if (this.anInt189 > 30000) {
				try {
					this.aClass221_1.method4421();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass221_1 = null;
			}
		}
		if (this.aClass221_1 == null) {
			return this.method129() == 0 && this.method135() == 0;
		}
		try {
			this.aClass221_1.method4415();
			for (@Pc(80) Class1_Sub6_Sub2_Sub2 local80 = (Class1_Sub6_Sub2_Sub2) this.aClass125_1.method2423(); local80 != null; local80 = (Class1_Sub6_Sub2_Sub2) this.aClass125_1.method2428()) {
				this.aClass1_Sub35_1.anInt7214 = 0;
				this.aClass1_Sub35_1.method5777(1);
				this.aClass1_Sub35_1.method5755((int) local80.aLong293);
				this.aClass221_1.method4414(this.aClass1_Sub35_1.aByteArray85, 4);
				this.aClass125_2.method2426(local80);
			}
			for (@Pc(126) Class1_Sub6_Sub2_Sub2 local126 = (Class1_Sub6_Sub2_Sub2) this.aClass125_3.method2423(); local126 != null; local126 = (Class1_Sub6_Sub2_Sub2) this.aClass125_3.method2428()) {
				this.aClass1_Sub35_1.anInt7214 = 0;
				this.aClass1_Sub35_1.method5777(0);
				this.aClass1_Sub35_1.method5755((int) local126.aLong293);
				this.aClass221_1.method4414(this.aClass1_Sub35_1.aByteArray85, 4);
				this.aClass125_4.method2426(local126);
			}
			for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
				@Pc(175) int local175 = this.aClass221_1.method4420();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt189 = 0;
				@Pc(188) byte local188 = 0;
				if (this.aClass1_Sub6_Sub2_Sub2_1 == null) {
					local188 = 8;
				} else if (this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 == 0) {
					local188 = 1;
				}
				@Pc(217) int local217;
				@Pc(224) int local224;
				@Pc(263) int local263;
				if (local188 <= 0) {
					local217 = this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.aByteArray85.length - this.aClass1_Sub6_Sub2_Sub2_1.aByte114;
					local224 = 512 - this.aClass1_Sub6_Sub2_Sub2_1.anInt8892;
					if (local217 - this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.anInt7214 < local224) {
						local224 = local217 - this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.anInt7214;
					}
					if (local175 < local224) {
						local224 = local175;
					}
					this.aClass221_1.method4413(this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.aByteArray85, local224, this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.anInt7214);
					if (this.aByte10 != 0) {
						for (local263 = 0; local263 < local224; local263++) {
							this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.aByteArray85[local263 + this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.anInt7214] ^= this.aByte10;
						}
					}
					this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.anInt7214 += local224;
					this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 += local224;
					if (local217 == this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.anInt7214) {
						this.aClass1_Sub6_Sub2_Sub2_1.method7811();
						this.aClass1_Sub6_Sub2_Sub2_1.aBoolean688 = false;
						this.aClass1_Sub6_Sub2_Sub2_1 = null;
					} else if (this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 == 512) {
						this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 = 0;
					}
				} else {
					local217 = local188 - this.aClass1_Sub35_2.anInt7214;
					if (local175 < local217) {
						local217 = local175;
					}
					this.aClass221_1.method4413(this.aClass1_Sub35_2.aByteArray85, local217, this.aClass1_Sub35_2.anInt7214);
					if (this.aByte10 != 0) {
						for (local224 = 0; local224 < local217; local224++) {
							this.aClass1_Sub35_2.aByteArray85[local224 + this.aClass1_Sub35_2.anInt7214] ^= this.aByte10;
						}
					}
					this.aClass1_Sub35_2.anInt7214 += local217;
					if (this.aClass1_Sub35_2.anInt7214 >= local188) {
						if (this.aClass1_Sub6_Sub2_Sub2_1 == null) {
							this.aClass1_Sub35_2.anInt7214 = 0;
							local224 = this.aClass1_Sub35_2.method5750();
							local263 = this.aClass1_Sub35_2.method5771();
							@Pc(444) int local444 = this.aClass1_Sub35_2.method5750();
							@Pc(449) int local449 = this.aClass1_Sub35_2.method5804();
							@Pc(453) int local453 = local444 & 0x7F;
							@Pc(464) boolean local464 = (local444 & 0x80) != 0;
							@Pc(471) long local471 = (long) ((local224 << 16) + local263);
							@Pc(481) Class1_Sub6_Sub2_Sub2 local481;
							if (local464) {
								for (local481 = (Class1_Sub6_Sub2_Sub2) this.aClass125_4.method2423(); local481 != null && local481.aLong293 != local471; local481 = (Class1_Sub6_Sub2_Sub2) this.aClass125_4.method2428()) {
								}
							} else {
								for (local481 = (Class1_Sub6_Sub2_Sub2) this.aClass125_2.method2423(); local481 != null && local481.aLong293 != local471; local481 = (Class1_Sub6_Sub2_Sub2) this.aClass125_2.method2428()) {
								}
							}
							if (local481 == null) {
								throw new IOException();
							}
							@Pc(545) int local545 = local453 == 0 ? 5 : 9;
							this.aClass1_Sub6_Sub2_Sub2_1 = local481;
							this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7 = new Class1_Sub35(this.aClass1_Sub6_Sub2_Sub2_1.aByte114 + local545 + local449);
							this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.method5777(local453);
							this.aClass1_Sub6_Sub2_Sub2_1.aClass1_Sub35_7.method5792(local449);
							this.aClass1_Sub35_2.anInt7214 = 0;
							this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 = 8;
						} else if (this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub35_2.aByteArray85[0] == -1) {
							this.aClass1_Sub6_Sub2_Sub2_1.anInt8892 = 1;
							this.aClass1_Sub35_2.anInt7214 = 0;
						} else {
							this.aClass1_Sub6_Sub2_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(621) IOException local621) {
			try {
				this.aClass221_1.method4421();
			} catch (@Pc(627) Exception local627) {
			}
			this.aClass221_1 = null;
			this.anInt191 = -2;
			this.anInt190++;
			return this.method129() == 0 && this.method135() == 0;
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)Z")
	public boolean method143() {
		return this.method135() >= 20;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IZ)V")
	public void method144(@OriginalArg(1) boolean arg0) {
		if (this.aClass221_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub35_1.anInt7214 = 0;
			this.aClass1_Sub35_1.method5777(arg0 ? 2 : 3);
			this.aClass1_Sub35_1.method5755(0);
			this.aClass221_1.method4414(this.aClass1_Sub35_1.aByteArray85, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass221_1.method4421();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt190++;
			this.aClass221_1 = null;
			this.anInt191 = -2;
		}
	}
}
