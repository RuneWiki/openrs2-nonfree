import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class341 {

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
	private int anInt9490;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "J")
	private long aLong279;

	@OriginalMember(owner = "client!tv", name = "A", descriptor = "Lclient!qk;")
	private Class289 aClass289_2;

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "Lclient!fea;")
	private Class3_Sub11_Sub2_Sub2 aClass3_Sub11_Sub2_Sub2_2;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Lclient!dha;")
	private final Class74 aClass74_9 = new Class74();

	@OriginalMember(owner = "client!tv", name = "u", descriptor = "Lclient!dha;")
	private final Class74 aClass74_10 = new Class74();

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "Lclient!dha;")
	private final Class74 aClass74_11 = new Class74();

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "Lclient!dha;")
	private final Class74 aClass74_12 = new Class74();

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "Lclient!jp;")
	private final Class3_Sub25 aClass3_Sub25_8 = new Class3_Sub25(4);

	@OriginalMember(owner = "client!tv", name = "B", descriptor = "B")
	private byte aByte141 = 0;

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
	public volatile int anInt9492 = 0;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
	public volatile int anInt9491 = 0;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "Lclient!jp;")
	private final Class3_Sub25 aClass3_Sub25_9 = new Class3_Sub25(8);

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public void method8291() {
		if (this.aClass289_2 != null) {
			this.aClass289_2.method7101();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
	public void method8292() {
		try {
			this.aClass289_2.method7097();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass289_2 = null;
		this.aByte141 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt9492++;
		this.anInt9491 = -1;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)Z")
	public boolean method8294() {
		return this.method8298() >= 20;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!qk;BZ)V")
	public void method8295(@OriginalArg(0) Class289 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass289_2 != null) {
			try {
				this.aClass289_2.method7097();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass289_2 = null;
		}
		this.aClass289_2 = arg0;
		this.method8300();
		this.method8305(arg1);
		this.aClass3_Sub25_9.anInt9765 = 0;
		this.aClass3_Sub11_Sub2_Sub2_2 = null;
		while (true) {
			@Pc(42) Class3_Sub11_Sub2_Sub2 local42 = (Class3_Sub11_Sub2_Sub2) this.aClass74_10.method1843();
			if (local42 == null) {
				while (true) {
					local42 = (Class3_Sub11_Sub2_Sub2) this.aClass74_12.method1843();
					if (local42 == null) {
						if (this.aByte141 != 0) {
							try {
								this.aClass3_Sub25_8.anInt9765 = 0;
								this.aClass3_Sub25_8.method8614(4);
								this.aClass3_Sub25_8.method8614(this.aByte141);
								this.aClass3_Sub25_8.method8649(0);
								this.aClass289_2.method7099(4, this.aClass3_Sub25_8.aByteArray106);
							} catch (@Pc(113) IOException local113) {
								try {
									this.aClass289_2.method7097();
								} catch (@Pc(119) Exception local119) {
								}
								this.anInt9491 = -2;
								this.anInt9492++;
								this.aClass289_2 = null;
							}
						}
						this.anInt9490 = 0;
						this.aLong279 = Static524.method7320();
						return;
					}
					this.aClass74_11.method1840(local42);
				}
			}
			this.aClass74_9.method1840(local42);
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	public void method8297() {
		if (this.aClass289_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub25_8.anInt9765 = 0;
			this.aClass3_Sub25_8.method8614(7);
			this.aClass3_Sub25_8.method8642(0);
			this.aClass289_2.method7099(4, this.aClass3_Sub25_8.aByteArray106);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass289_2.method7097();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass289_2 = null;
			this.anInt9492++;
			this.anInt9491 = -2;
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)I")
	private int method8298() {
		return this.aClass74_11.method1841() + this.aClass74_12.method1841();
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)V")
	public void method8299() {
		if (this.aClass289_2 != null) {
			this.aClass289_2.method7097();
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(Z)V")
	private void method8300() {
		if (this.aClass289_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub25_8.anInt9765 = 0;
			this.aClass3_Sub25_8.method8614(6);
			this.aClass3_Sub25_8.method8642(3);
			this.aClass289_2.method7099(4, this.aClass3_Sub25_8.aByteArray106);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass289_2.method7097();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt9491 = -2;
			this.aClass289_2 = null;
			this.anInt9492++;
		}
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)Z")
	public boolean method8301() {
		@Pc(18) int local18;
		if (this.aClass289_2 != null) {
			@Pc(11) long local11 = Static524.method7320();
			local18 = (int) (local11 - this.aLong279);
			this.aLong279 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt9490 += local18;
			if (this.anInt9490 > 30000) {
				try {
					this.aClass289_2.method7097();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass289_2 = null;
			}
		}
		if (this.aClass289_2 == null) {
			return this.method8304() == 0 && this.method8298() == 0;
		}
		try {
			this.aClass289_2.method7106();
			for (@Pc(76) Class3_Sub11_Sub2_Sub2 local76 = (Class3_Sub11_Sub2_Sub2) this.aClass74_9.method1842(); local76 != null; local76 = (Class3_Sub11_Sub2_Sub2) this.aClass74_9.method1844()) {
				this.aClass3_Sub25_8.anInt9765 = 0;
				this.aClass3_Sub25_8.method8614(1);
				this.aClass3_Sub25_8.method8642((int) local76.aLong310);
				this.aClass289_2.method7099(4, this.aClass3_Sub25_8.aByteArray106);
				this.aClass74_10.method1840(local76);
			}
			for (@Pc(126) Class3_Sub11_Sub2_Sub2 local126 = (Class3_Sub11_Sub2_Sub2) this.aClass74_11.method1842(); local126 != null; local126 = (Class3_Sub11_Sub2_Sub2) this.aClass74_11.method1844()) {
				this.aClass3_Sub25_8.anInt9765 = 0;
				this.aClass3_Sub25_8.method8614(0);
				this.aClass3_Sub25_8.method8642((int) local126.aLong310);
				this.aClass289_2.method7099(4, this.aClass3_Sub25_8.aByteArray106);
				this.aClass74_12.method1840(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.aClass289_2.method7105();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt9490 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass3_Sub11_Sub2_Sub2_2 == null) {
					local191 = 8;
				} else if (this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(226) int local226;
				@Pc(270) int local270;
				if (local191 <= 0) {
					local219 = this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.aByteArray106.length - this.aClass3_Sub11_Sub2_Sub2_2.aByte42;
					local226 = 512 - this.aClass3_Sub11_Sub2_Sub2_2.anInt3121;
					if (local219 - this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.anInt9765 < local226) {
						local226 = local219 - this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.anInt9765;
					}
					if (local226 > local175) {
						local226 = local175;
					}
					this.aClass289_2.method7098(this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.anInt9765, local226, this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.aByteArray106);
					if (this.aByte141 != 0) {
						for (local270 = 0; local270 < local226; local270++) {
							this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.aByteArray106[this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.anInt9765 + local270] ^= this.aByte141;
						}
					}
					this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.anInt9765 += local226;
					this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 += local226;
					if (this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.anInt9765 == local219) {
						this.aClass3_Sub11_Sub2_Sub2_2.method9345();
						this.aClass3_Sub11_Sub2_Sub2_2.aBoolean237 = false;
						this.aClass3_Sub11_Sub2_Sub2_2 = null;
					} else if (this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 == 512) {
						this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 = 0;
					}
				} else {
					local219 = local191 - this.aClass3_Sub25_9.anInt9765;
					if (local175 < local219) {
						local219 = local175;
					}
					this.aClass289_2.method7098(this.aClass3_Sub25_9.anInt9765, local219, this.aClass3_Sub25_9.aByteArray106);
					if (this.aByte141 != 0) {
						for (local226 = 0; local226 < local219; local226++) {
							this.aClass3_Sub25_9.aByteArray106[local226 + this.aClass3_Sub25_9.anInt9765] ^= this.aByte141;
						}
					}
					this.aClass3_Sub25_9.anInt9765 += local219;
					if (this.aClass3_Sub25_9.anInt9765 >= local191) {
						if (this.aClass3_Sub11_Sub2_Sub2_2 == null) {
							this.aClass3_Sub25_9.anInt9765 = 0;
							local226 = this.aClass3_Sub25_9.method8632();
							local270 = this.aClass3_Sub25_9.method8593();
							@Pc(462) int local462 = this.aClass3_Sub25_9.method8632();
							@Pc(469) int local469 = this.aClass3_Sub25_9.method8618();
							@Pc(473) int local473 = local462 & 0x7F;
							@Pc(484) boolean local484 = (local462 & 0x80) != 0;
							@Pc(491) long local491 = (long) ((local226 << 16) + local270);
							@Pc(501) Class3_Sub11_Sub2_Sub2 local501;
							if (local484) {
								for (local501 = (Class3_Sub11_Sub2_Sub2) this.aClass74_12.method1842(); local501 != null && local501.aLong310 != local491; local501 = (Class3_Sub11_Sub2_Sub2) this.aClass74_12.method1844()) {
								}
							} else {
								for (local501 = (Class3_Sub11_Sub2_Sub2) this.aClass74_10.method1842(); local501 != null && local491 != local501.aLong310; local501 = (Class3_Sub11_Sub2_Sub2) this.aClass74_10.method1844()) {
								}
							}
							if (local501 == null) {
								throw new IOException();
							}
							@Pc(558) int local558 = local473 == 0 ? 5 : 9;
							this.aClass3_Sub11_Sub2_Sub2_2 = local501;
							this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2 = new Class3_Sub25(this.aClass3_Sub11_Sub2_Sub2_2.aByte42 + local558 + local469);
							this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.method8614(local473);
							this.aClass3_Sub11_Sub2_Sub2_2.aClass3_Sub25_2.method8588(local469);
							this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 = 8;
							this.aClass3_Sub25_9.anInt9765 = 0;
						} else if (this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub25_9.aByteArray106[0] == -1) {
							this.aClass3_Sub25_9.anInt9765 = 0;
							this.aClass3_Sub11_Sub2_Sub2_2.anInt3121 = 1;
						} else {
							this.aClass3_Sub11_Sub2_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(634) IOException local634) {
			try {
				this.aClass289_2.method7097();
			} catch (@Pc(640) Exception local640) {
			}
			this.aClass289_2 = null;
			this.anInt9492++;
			this.anInt9491 = -2;
			return this.method8304() == 0 && this.method8298() == 0;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIZII)Lclient!fea;")
	public Class3_Sub11_Sub2_Sub2 method8302(@OriginalArg(0) byte arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) long local17 = (long) ((arg3 << 16) + arg2);
		@Pc(21) Class3_Sub11_Sub2_Sub2 local21 = new Class3_Sub11_Sub2_Sub2();
		local21.aBoolean238 = arg1;
		local21.aLong310 = local17;
		local21.aByte42 = arg0;
		if (arg1) {
			if (this.method8304() >= 20) {
				throw new RuntimeException();
			}
			this.aClass74_9.method1840(local21);
		} else if (this.method8298() < 20) {
			this.aClass74_11.method1840(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(Z)Z")
	public boolean method8303() {
		return this.method8304() >= 20;
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)I")
	public int method8304() {
		return this.aClass74_9.method1841() + this.aClass74_10.method1841();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)V")
	public void method8305(@OriginalArg(0) boolean arg0) {
		if (this.aClass289_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub25_8.anInt9765 = 0;
			this.aClass3_Sub25_8.method8614(arg0 ? 2 : 3);
			this.aClass3_Sub25_8.method8642(0);
			this.aClass289_2.method7099(4, this.aClass3_Sub25_8.aByteArray106);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass289_2.method7097();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt9491 = -2;
			this.aClass289_2 = null;
			this.anInt9492++;
		}
	}
}
