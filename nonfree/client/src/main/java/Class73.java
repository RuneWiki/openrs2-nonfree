import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class73 {

	@OriginalMember(owner = "client!du", name = "y", descriptor = "Lclient!qu;")
	private Class295 aClass295_1;

	@OriginalMember(owner = "client!du", name = "A", descriptor = "I")
	private int anInt2061;

	@OriginalMember(owner = "client!du", name = "B", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!du", name = "G", descriptor = "Lclient!rha;")
	private Class6_Sub4_Sub11_Sub2 aClass6_Sub4_Sub11_Sub2_1;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "Lclient!wd;")
	private final Class384 aClass384_2 = new Class384();

	@OriginalMember(owner = "client!du", name = "v", descriptor = "Lclient!wd;")
	private final Class384 aClass384_3 = new Class384();

	@OriginalMember(owner = "client!du", name = "w", descriptor = "Lclient!wd;")
	private final Class384 aClass384_4 = new Class384();

	@OriginalMember(owner = "client!du", name = "x", descriptor = "Lclient!wd;")
	private final Class384 aClass384_5 = new Class384();

	@OriginalMember(owner = "client!du", name = "z", descriptor = "Lclient!gga;")
	private final Class6_Sub23 aClass6_Sub23_1 = new Class6_Sub23(4);

	@OriginalMember(owner = "client!du", name = "E", descriptor = "I")
	public volatile int anInt2063 = 0;

	@OriginalMember(owner = "client!du", name = "D", descriptor = "I")
	public volatile int anInt2062 = 0;

	@OriginalMember(owner = "client!du", name = "F", descriptor = "B")
	private byte aByte31 = 0;

	@OriginalMember(owner = "client!du", name = "C", descriptor = "Lclient!gga;")
	private final Class6_Sub23 aClass6_Sub23_2 = new Class6_Sub23(8);

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V")
	public void method1801() {
		if (this.aClass295_1 != null) {
			this.aClass295_1.method7102();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)Z")
	public boolean method1802() {
		return this.method1812() >= 20;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	private void method1803() {
		if (this.aClass295_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub23_1.anInt9901 = 0;
			this.aClass6_Sub23_1.method8366(6);
			this.aClass6_Sub23_1.method8387(3);
			this.aClass295_1.method7105(4, this.aClass6_Sub23_1.aByteArray101);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass295_1.method7101();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass295_1 = null;
			this.anInt2062 = -2;
			this.anInt2063++;
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)V")
	public void method1804() {
		if (this.aClass295_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub23_1.anInt9901 = 0;
			this.aClass6_Sub23_1.method8366(7);
			this.aClass6_Sub23_1.method8387(0);
			this.aClass295_1.method7105(4, this.aClass6_Sub23_1.aByteArray101);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass295_1.method7101();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt2063++;
			this.anInt2062 = -2;
			this.aClass295_1 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public void method1805() {
		if (this.aClass295_1 != null) {
			this.aClass295_1.method7101();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)V")
	public void method1807(@OriginalArg(0) boolean arg0) {
		if (this.aClass295_1 == null) {
			return;
		}
		try {
			this.aClass6_Sub23_1.anInt9901 = 0;
			this.aClass6_Sub23_1.method8366(arg0 ? 2 : 3);
			this.aClass6_Sub23_1.method8387(0);
			this.aClass295_1.method7105(4, this.aClass6_Sub23_1.aByteArray101);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass295_1.method7101();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt2062 = -2;
			this.anInt2063++;
			this.aClass295_1 = null;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZBIII)Lclient!rha;")
	public Class6_Sub4_Sub11_Sub2 method1809(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) long local15 = (long) (arg2 + (arg3 << 16));
		@Pc(19) Class6_Sub4_Sub11_Sub2 local19 = new Class6_Sub4_Sub11_Sub2();
		local19.aBoolean589 = arg0;
		local19.aLong310 = local15;
		local19.aByte123 = arg1;
		if (arg0) {
			if (this.method1813() >= 20) {
				throw new RuntimeException();
			}
			this.aClass384_2.method8909(local19);
		} else if (this.method1812() < 20) {
			this.aClass384_4.method8909(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IZLclient!qu;)V")
	public void method1810(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class295 arg1) {
		if (this.aClass295_1 != null) {
			try {
				this.aClass295_1.method7101();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass295_1 = null;
		}
		this.aClass295_1 = arg1;
		this.method1803();
		this.method1807(arg0);
		this.aClass6_Sub23_2.anInt9901 = 0;
		this.aClass6_Sub4_Sub11_Sub2_1 = null;
		while (true) {
			@Pc(40) Class6_Sub4_Sub11_Sub2 local40 = (Class6_Sub4_Sub11_Sub2) this.aClass384_3.method8907();
			if (local40 == null) {
				while (true) {
					local40 = (Class6_Sub4_Sub11_Sub2) this.aClass384_5.method8907();
					if (local40 == null) {
						if (this.aByte31 != 0) {
							try {
								this.aClass6_Sub23_1.anInt9901 = 0;
								this.aClass6_Sub23_1.method8366(4);
								this.aClass6_Sub23_1.method8366(this.aByte31);
								this.aClass6_Sub23_1.method8347(0);
								this.aClass295_1.method7105(4, this.aClass6_Sub23_1.aByteArray101);
							} catch (@Pc(101) IOException local101) {
								try {
									this.aClass295_1.method7101();
								} catch (@Pc(107) Exception local107) {
								}
								this.anInt2063++;
								this.aClass295_1 = null;
								this.anInt2062 = -2;
							}
						}
						this.anInt2061 = 0;
						this.aLong72 = Static566.method7936();
						return;
					}
					this.aClass384_4.method8909(local40);
				}
			}
			this.aClass384_2.method8909(local40);
		}
	}

	@OriginalMember(owner = "client!du", name = "d", descriptor = "(I)Z")
	public boolean method1811() {
		@Pc(18) int local18;
		if (this.aClass295_1 != null) {
			@Pc(11) long local11 = Static566.method7936();
			local18 = (int) (local11 - this.aLong72);
			this.aLong72 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt2061 += local18;
			if (this.anInt2061 > 30000) {
				try {
					this.aClass295_1.method7101();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass295_1 = null;
			}
		}
		if (this.aClass295_1 == null) {
			return this.method1813() == 0 && this.method1812() == 0;
		}
		try {
			this.aClass295_1.method7098();
			for (@Pc(77) Class6_Sub4_Sub11_Sub2 local77 = (Class6_Sub4_Sub11_Sub2) this.aClass384_2.method8910(); local77 != null; local77 = (Class6_Sub4_Sub11_Sub2) this.aClass384_2.method8908()) {
				this.aClass6_Sub23_1.anInt9901 = 0;
				this.aClass6_Sub23_1.method8366(1);
				this.aClass6_Sub23_1.method8387((int) local77.aLong310);
				this.aClass295_1.method7105(4, this.aClass6_Sub23_1.aByteArray101);
				this.aClass384_3.method8909(local77);
			}
			for (@Pc(123) Class6_Sub4_Sub11_Sub2 local123 = (Class6_Sub4_Sub11_Sub2) this.aClass384_4.method8910(); local123 != null; local123 = (Class6_Sub4_Sub11_Sub2) this.aClass384_4.method8908()) {
				this.aClass6_Sub23_1.anInt9901 = 0;
				this.aClass6_Sub23_1.method8366(0);
				this.aClass6_Sub23_1.method8387((int) local123.aLong310);
				this.aClass295_1.method7105(4, this.aClass6_Sub23_1.aByteArray101);
				this.aClass384_5.method8909(local123);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(182) int local182 = this.aClass295_1.method7103();
				if (local182 < 0) {
					throw new IOException();
				}
				if (local182 == 0) {
					break;
				}
				this.anInt2061 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass6_Sub4_Sub11_Sub2_1 == null) {
					local195 = 8;
				} else if (this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 == 0) {
					local195 = 1;
				}
				@Pc(216) int local216;
				@Pc(244) int local244;
				@Pc(301) int local301;
				if (local195 > 0) {
					local216 = local195 - this.aClass6_Sub23_2.anInt9901;
					if (local216 > local182) {
						local216 = local182;
					}
					this.aClass295_1.method7107(local216, this.aClass6_Sub23_2.aByteArray101, this.aClass6_Sub23_2.anInt9901);
					if (this.aByte31 != 0) {
						for (local244 = 0; local244 < local216; local244++) {
							this.aClass6_Sub23_2.aByteArray101[local244 + this.aClass6_Sub23_2.anInt9901] ^= this.aByte31;
						}
					}
					this.aClass6_Sub23_2.anInt9901 += local216;
					if (this.aClass6_Sub23_2.anInt9901 >= local195) {
						if (this.aClass6_Sub4_Sub11_Sub2_1 == null) {
							this.aClass6_Sub23_2.anInt9901 = 0;
							local244 = this.aClass6_Sub23_2.method8374();
							local301 = this.aClass6_Sub23_2.method8363();
							@Pc(306) int local306 = this.aClass6_Sub23_2.method8374();
							@Pc(311) int local311 = this.aClass6_Sub23_2.method8369();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(323) boolean local323 = (local306 & 0x80) != 0;
							@Pc(330) long local330 = (long) (local301 + (local244 << 16));
							@Pc(340) Class6_Sub4_Sub11_Sub2 local340;
							if (local323) {
								for (local340 = (Class6_Sub4_Sub11_Sub2) this.aClass384_5.method8910(); local340 != null && local340.aLong310 != local330; local340 = (Class6_Sub4_Sub11_Sub2) this.aClass384_5.method8908()) {
								}
							} else {
								for (local340 = (Class6_Sub4_Sub11_Sub2) this.aClass384_3.method8910(); local340 != null && local330 != local340.aLong310; local340 = (Class6_Sub4_Sub11_Sub2) this.aClass384_3.method8908()) {
								}
							}
							if (local340 == null) {
								throw new IOException();
							}
							this.aClass6_Sub4_Sub11_Sub2_1 = local340;
							@Pc(400) int local400 = local315 == 0 ? 5 : 9;
							this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7 = new Class6_Sub23(this.aClass6_Sub4_Sub11_Sub2_1.aByte123 + local311 + local400);
							this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.method8366(local315);
							this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.method8364(local311);
							this.aClass6_Sub23_2.anInt9901 = 0;
							this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 = 8;
						} else if (this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub23_2.aByteArray101[0] == -1) {
							this.aClass6_Sub23_2.anInt9901 = 0;
							this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 = 1;
						} else {
							this.aClass6_Sub4_Sub11_Sub2_1 = null;
						}
					}
				} else {
					local216 = this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.aByteArray101.length - this.aClass6_Sub4_Sub11_Sub2_1.aByte123;
					local244 = 512 - this.aClass6_Sub4_Sub11_Sub2_1.anInt8504;
					if (local244 > local216 - this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901) {
						local244 = local216 - this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901;
					}
					if (local244 > local182) {
						local244 = local182;
					}
					this.aClass295_1.method7107(local244, this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.aByteArray101, this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901);
					if (this.aByte31 != 0) {
						for (local301 = 0; local301 < local244; local301++) {
							this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.aByteArray101[this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901 + local301] = (byte) (this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.aByteArray101[this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901 + local301] ^ this.aByte31);
						}
					}
					this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901 += local244;
					this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 += local244;
					if (local216 == this.aClass6_Sub4_Sub11_Sub2_1.aClass6_Sub23_7.anInt9901) {
						this.aClass6_Sub4_Sub11_Sub2_1.method9043();
						this.aClass6_Sub4_Sub11_Sub2_1.aBoolean588 = false;
						this.aClass6_Sub4_Sub11_Sub2_1 = null;
					} else if (this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 == 512) {
						this.aClass6_Sub4_Sub11_Sub2_1.anInt8504 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass295_1.method7101();
			} catch (@Pc(622) Exception local622) {
			}
			this.anInt2063++;
			this.anInt2062 = -2;
			this.aClass295_1 = null;
			return this.method1813() == 0 && this.method1812() == 0;
		}
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(I)I")
	private int method1812() {
		return this.aClass384_4.method8911() + this.aClass384_5.method8911();
	}

	@OriginalMember(owner = "client!du", name = "f", descriptor = "(I)I")
	public int method1813() {
		return this.aClass384_2.method8911() + this.aClass384_3.method8911();
	}

	@OriginalMember(owner = "client!du", name = "g", descriptor = "(I)V")
	public void method1815() {
		try {
			this.aClass295_1.method7101();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt2063++;
		this.aByte31 = (byte) (int) ((double) 1 + Math.random() * 255.0D);
		this.aClass295_1 = null;
		this.anInt2062 = -1;
	}

	@OriginalMember(owner = "client!du", name = "h", descriptor = "(I)Z")
	public boolean method1816() {
		return this.method1813() >= 20;
	}
}
