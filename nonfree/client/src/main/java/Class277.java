import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class277 {

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "Lclient!vea;")
	private Class349 aClass349_2;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
	private int anInt7301;

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "Lclient!nu;")
	private Class3_Sub7_Sub1_Sub2 aClass3_Sub7_Sub1_Sub2_1;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!th;")
	private final Class325 aClass325_5 = new Class325();

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "Lclient!th;")
	private final Class325 aClass325_6 = new Class325();

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!th;")
	private final Class325 aClass325_7 = new Class325();

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!th;")
	private final Class325 aClass325_8 = new Class325();

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!np;")
	private final Class3_Sub11 aClass3_Sub11_5 = new Class3_Sub11(4);

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "B")
	private byte aByte90 = 0;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
	public volatile int anInt7302 = 0;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	public volatile int anInt7303 = 0;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "Lclient!np;")
	private final Class3_Sub11 aClass3_Sub11_6 = new Class3_Sub11(8);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
	public void method6110(@OriginalArg(1) boolean arg0) {
		if (this.aClass349_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub11_5.anInt6128 = 0;
			this.aClass3_Sub11_5.method5213(arg0 ? 2 : 3);
			this.aClass3_Sub11_5.method5179(0);
			this.aClass349_2.method7307(4, this.aClass3_Sub11_5.aByteArray62);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass349_2.method7313();
			} catch (@Pc(47) Exception local47) {
			}
			this.aClass349_2 = null;
			this.anInt7302++;
			this.anInt7303 = -2;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	public void method6111() {
		if (this.aClass349_2 != null) {
			this.aClass349_2.method7308();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z")
	public boolean method6112() {
		@Pc(20) int local20;
		if (this.aClass349_2 != null) {
			@Pc(13) long local13 = Static158.method2936();
			local20 = (int) (local13 - this.aLong208);
			this.aLong208 = local13;
			if (local20 > 200) {
				local20 = 200;
			}
			this.anInt7301 += local20;
			if (this.anInt7301 > 30000) {
				try {
					this.aClass349_2.method7313();
				} catch (@Pc(48) Exception local48) {
				}
				this.aClass349_2 = null;
			}
		}
		if (this.aClass349_2 == null) {
			return this.method6113() == 0 && this.method6115() == 0;
		}
		try {
			this.aClass349_2.method7314();
			for (@Pc(84) Class3_Sub7_Sub1_Sub2 local84 = (Class3_Sub7_Sub1_Sub2) this.aClass325_5.method6859(); local84 != null; local84 = (Class3_Sub7_Sub1_Sub2) this.aClass325_5.method6863()) {
				this.aClass3_Sub11_5.anInt6128 = 0;
				this.aClass3_Sub11_5.method5213(1);
				this.aClass3_Sub11_5.method5179((int) local84.aLong263);
				this.aClass349_2.method7307(4, this.aClass3_Sub11_5.aByteArray62);
				this.aClass325_6.method6862(local84);
			}
			for (@Pc(130) Class3_Sub7_Sub1_Sub2 local130 = (Class3_Sub7_Sub1_Sub2) this.aClass325_7.method6859(); local130 != null; local130 = (Class3_Sub7_Sub1_Sub2) this.aClass325_7.method6863()) {
				this.aClass3_Sub11_5.anInt6128 = 0;
				this.aClass3_Sub11_5.method5213(0);
				this.aClass3_Sub11_5.method5179((int) local130.aLong263);
				this.aClass349_2.method7307(4, this.aClass3_Sub11_5.aByteArray62);
				this.aClass325_8.method6862(local130);
			}
			for (local20 = 0; local20 < 100; local20++) {
				@Pc(187) int local187 = this.aClass349_2.method7310();
				if (local187 < 0) {
					throw new IOException();
				}
				if (local187 == 0) {
					break;
				}
				this.anInt7301 = 0;
				@Pc(203) byte local203 = 0;
				if (this.aClass3_Sub7_Sub1_Sub2_1 == null) {
					local203 = 8;
				} else if (this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 == 0) {
					local203 = 1;
				}
				@Pc(228) int local228;
				@Pc(255) int local255;
				@Pc(316) int local316;
				if (local203 > 0) {
					local228 = local203 - this.aClass3_Sub11_6.anInt6128;
					if (local228 > local187) {
						local228 = local187;
					}
					this.aClass349_2.method7309(this.aClass3_Sub11_6.anInt6128, this.aClass3_Sub11_6.aByteArray62, local228);
					if (this.aByte90 != 0) {
						for (local255 = 0; local255 < local228; local255++) {
							this.aClass3_Sub11_6.aByteArray62[this.aClass3_Sub11_6.anInt6128 + local255] ^= this.aByte90;
						}
					}
					this.aClass3_Sub11_6.anInt6128 += local228;
					if (local203 <= this.aClass3_Sub11_6.anInt6128) {
						if (this.aClass3_Sub7_Sub1_Sub2_1 == null) {
							this.aClass3_Sub11_6.anInt6128 = 0;
							local255 = this.aClass3_Sub11_6.method5175();
							local316 = this.aClass3_Sub11_6.method5198();
							@Pc(321) int local321 = this.aClass3_Sub11_6.method5175();
							@Pc(326) int local326 = this.aClass3_Sub11_6.method5186();
							@Pc(330) int local330 = local321 & 0x7F;
							@Pc(341) boolean local341 = (local321 & 0x80) != 0;
							@Pc(348) long local348 = (long) (local316 + (local255 << 16));
							@Pc(360) Class3_Sub7_Sub1_Sub2 local360;
							if (local341) {
								for (local360 = (Class3_Sub7_Sub1_Sub2) this.aClass325_8.method6859(); local360 != null && local348 != local360.aLong263; local360 = (Class3_Sub7_Sub1_Sub2) this.aClass325_8.method6863()) {
								}
							} else {
								for (local360 = (Class3_Sub7_Sub1_Sub2) this.aClass325_6.method6859(); local360 != null && local360.aLong263 != local348; local360 = (Class3_Sub7_Sub1_Sub2) this.aClass325_6.method6863()) {
								}
							}
							if (local360 == null) {
								throw new IOException();
							}
							this.aClass3_Sub7_Sub1_Sub2_1 = local360;
							@Pc(422) int local422 = local330 == 0 ? 5 : 9;
							this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4 = new Class3_Sub11(this.aClass3_Sub7_Sub1_Sub2_1.aByte64 + local422 + local326);
							this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.method5213(local330);
							this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.method5215(local326);
							this.aClass3_Sub11_6.anInt6128 = 0;
							this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 = 8;
						} else if (this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub11_6.aByteArray62[0] == -1) {
							this.aClass3_Sub11_6.anInt6128 = 0;
							this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 = 1;
						} else {
							this.aClass3_Sub7_Sub1_Sub2_1 = null;
						}
					}
				} else {
					local228 = this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.aByteArray62.length - this.aClass3_Sub7_Sub1_Sub2_1.aByte64;
					local255 = 512 - this.aClass3_Sub7_Sub1_Sub2_1.anInt6343;
					if (local255 > local228 - this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.anInt6128) {
						local255 = local228 - this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.anInt6128;
					}
					if (local187 < local255) {
						local255 = local187;
					}
					this.aClass349_2.method7309(this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.anInt6128, this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.aByteArray62, local255);
					if (this.aByte90 != 0) {
						for (local316 = 0; local316 < local255; local316++) {
							this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.aByteArray62[this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.anInt6128 + local316] ^= this.aByte90;
						}
					}
					this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 += local255;
					this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.anInt6128 += local255;
					if (local228 == this.aClass3_Sub7_Sub1_Sub2_1.aClass3_Sub11_4.anInt6128) {
						this.aClass3_Sub7_Sub1_Sub2_1.method7614();
						this.aClass3_Sub7_Sub1_Sub2_1.aBoolean458 = false;
						this.aClass3_Sub7_Sub1_Sub2_1 = null;
					} else if (this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 == 512) {
						this.aClass3_Sub7_Sub1_Sub2_1.anInt6343 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(649) IOException local649) {
			try {
				this.aClass349_2.method7313();
			} catch (@Pc(657) Exception local657) {
			}
			this.aClass349_2 = null;
			this.anInt7302++;
			this.anInt7303 = -2;
			return this.method6113() == 0 && this.method6115() == 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I")
	public int method6113() {
		return this.aClass325_5.method6857() + this.aClass325_6.method6857();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(B)I")
	private int method6115() {
		return this.aClass325_7.method6857() + this.aClass325_8.method6857();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILclient!vea;)V")
	public void method6116(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class349 arg1) {
		if (this.aClass349_2 != null) {
			try {
				this.aClass349_2.method7313();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass349_2 = null;
		}
		this.aClass349_2 = arg1;
		this.method6122();
		this.method6110(arg0);
		this.aClass3_Sub11_6.anInt6128 = 0;
		this.aClass3_Sub7_Sub1_Sub2_1 = null;
		while (true) {
			@Pc(42) Class3_Sub7_Sub1_Sub2 local42 = (Class3_Sub7_Sub1_Sub2) this.aClass325_6.method6860();
			if (local42 == null) {
				while (true) {
					local42 = (Class3_Sub7_Sub1_Sub2) this.aClass325_8.method6860();
					if (local42 == null) {
						if (this.aByte90 != 0) {
							try {
								this.aClass3_Sub11_5.anInt6128 = 0;
								this.aClass3_Sub11_5.method5213(4);
								this.aClass3_Sub11_5.method5213(this.aByte90);
								this.aClass3_Sub11_5.method5200(0);
								this.aClass349_2.method7307(4, this.aClass3_Sub11_5.aByteArray62);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass349_2.method7313();
								} catch (@Pc(108) Exception local108) {
								}
								this.anInt7303 = -2;
								this.anInt7302++;
								this.aClass349_2 = null;
							}
						}
						this.anInt7301 = 0;
						this.aLong208 = Static158.method2936();
						return;
					}
					this.aClass325_7.method6862(local42);
				}
			}
			this.aClass325_5.method6862(local42);
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(B)V")
	public void method6118() {
		if (this.aClass349_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub11_5.anInt6128 = 0;
			this.aClass3_Sub11_5.method5213(7);
			this.aClass3_Sub11_5.method5179(0);
			this.aClass349_2.method7307(4, this.aClass3_Sub11_5.aByteArray62);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass349_2.method7313();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass349_2 = null;
			this.anInt7302++;
			this.anInt7303 = -2;
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
	public void method6119() {
		if (this.aClass349_2 != null) {
			this.aClass349_2.method7313();
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)Z")
	public boolean method6120() {
		return this.method6115() >= 20;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IBIZI)Lclient!nu;")
	public Class3_Sub7_Sub1_Sub2 method6121(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(15) long local15 = (long) (arg1 + (arg3 << 16));
		@Pc(19) Class3_Sub7_Sub1_Sub2 local19 = new Class3_Sub7_Sub1_Sub2();
		local19.aLong263 = local15;
		local19.aBoolean460 = arg2;
		local19.aByte64 = arg0;
		if (arg2) {
			if (this.method6113() >= 20) {
				throw new RuntimeException();
			}
			this.aClass325_5.method6862(local19);
		} else if (this.method6115() < 20) {
			this.aClass325_7.method6862(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	private void method6122() {
		if (this.aClass349_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub11_5.anInt6128 = 0;
			this.aClass3_Sub11_5.method5213(6);
			this.aClass3_Sub11_5.method5179(3);
			this.aClass349_2.method7307(4, this.aClass3_Sub11_5.aByteArray62);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass349_2.method7313();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt7303 = -2;
			this.aClass349_2 = null;
			this.anInt7302++;
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	public void method6123() {
		try {
			this.aClass349_2.method7313();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt7302++;
		this.anInt7303 = -1;
		this.aClass349_2 = null;
		this.aByte90 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z")
	public boolean method6124() {
		return this.method6113() >= 20;
	}
}
