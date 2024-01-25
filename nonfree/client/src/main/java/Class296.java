import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class296 {

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "Lclient!le;")
	private Class185 aClass185_2;

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
	private int anInt8632;

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!ro", name = "E", descriptor = "Lclient!dia;")
	private Class6_Sub2_Sub3_Sub2 aClass6_Sub2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!re;")
	private final Class286 aClass286_8 = new Class286();

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "Lclient!re;")
	private final Class286 aClass286_9 = new Class286();

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "Lclient!re;")
	private final Class286 aClass286_10 = new Class286();

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "Lclient!re;")
	private final Class286 aClass286_11 = new Class286();

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "Lclient!rg;")
	private final Class6_Sub40 aClass6_Sub40_7 = new Class6_Sub40(4);

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
	public volatile int anInt8633 = 0;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "B")
	private byte aByte99 = 0;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
	public volatile int anInt8634 = 0;

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "Lclient!rg;")
	private final Class6_Sub40 aClass6_Sub40_8 = new Class6_Sub40(8);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Z")
	public boolean method7424() {
		@Pc(14) int local14;
		if (this.aClass185_2 != null) {
			@Pc(7) long local7 = Static32.method595();
			local14 = (int) (local7 - this.aLong221);
			this.aLong221 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt8632 += local14;
			if (this.anInt8632 > 30000) {
				try {
					this.aClass185_2.method5222();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass185_2 = null;
			}
		}
		if (this.aClass185_2 == null) {
			return this.method7431() == 0 && this.method7429() == 0;
		}
		try {
			this.aClass185_2.method5215();
			for (@Pc(82) Class6_Sub2_Sub3_Sub2 local82 = (Class6_Sub2_Sub3_Sub2) this.aClass286_8.method7242(); local82 != null; local82 = (Class6_Sub2_Sub3_Sub2) this.aClass286_8.method7241()) {
				this.aClass6_Sub40_7.anInt10169 = 0;
				this.aClass6_Sub40_7.method8589(1);
				this.aClass6_Sub40_7.method8613((int) local82.aLong272);
				this.aClass185_2.method5219(this.aClass6_Sub40_7.aByteArray113, 4);
				this.aClass286_9.method7239(local82);
			}
			for (@Pc(128) Class6_Sub2_Sub3_Sub2 local128 = (Class6_Sub2_Sub3_Sub2) this.aClass286_10.method7242(); local128 != null; local128 = (Class6_Sub2_Sub3_Sub2) this.aClass286_10.method7241()) {
				this.aClass6_Sub40_7.anInt10169 = 0;
				this.aClass6_Sub40_7.method8589(0);
				this.aClass6_Sub40_7.method8613((int) local128.aLong272);
				this.aClass185_2.method5219(this.aClass6_Sub40_7.aByteArray113, 4);
				this.aClass286_11.method7239(local128);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(177) int local177 = this.aClass185_2.method5220();
				if (local177 < 0) {
					throw new IOException();
				}
				if (local177 == 0) {
					break;
				}
				this.anInt8632 = 0;
				@Pc(193) byte local193 = 0;
				if (this.aClass6_Sub2_Sub3_Sub2_2 == null) {
					local193 = 8;
				} else if (this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 == 0) {
					local193 = 1;
				}
				@Pc(217) int local217;
				@Pc(241) int local241;
				@Pc(302) int local302;
				if (local193 > 0) {
					local217 = local193 - this.aClass6_Sub40_8.anInt10169;
					if (local217 > local177) {
						local217 = local177;
					}
					this.aClass185_2.method5217(local217, this.aClass6_Sub40_8.anInt10169, this.aClass6_Sub40_8.aByteArray113);
					if (this.aByte99 != 0) {
						for (local241 = 0; local241 < local217; local241++) {
							this.aClass6_Sub40_8.aByteArray113[local241 + this.aClass6_Sub40_8.anInt10169] ^= this.aByte99;
						}
					}
					this.aClass6_Sub40_8.anInt10169 += local217;
					if (this.aClass6_Sub40_8.anInt10169 >= local193) {
						if (this.aClass6_Sub2_Sub3_Sub2_2 == null) {
							this.aClass6_Sub40_8.anInt10169 = 0;
							local241 = this.aClass6_Sub40_8.method8604();
							local302 = this.aClass6_Sub40_8.method8571();
							@Pc(307) int local307 = this.aClass6_Sub40_8.method8604();
							@Pc(312) int local312 = this.aClass6_Sub40_8.method8579();
							@Pc(316) int local316 = local307 & 0x7F;
							@Pc(327) boolean local327 = (local307 & 0x80) != 0;
							@Pc(334) long local334 = (long) (local302 + (local241 << 16));
							@Pc(344) Class6_Sub2_Sub3_Sub2 local344;
							if (local327) {
								for (local344 = (Class6_Sub2_Sub3_Sub2) this.aClass286_11.method7242(); local344 != null && local344.aLong272 != local334; local344 = (Class6_Sub2_Sub3_Sub2) this.aClass286_11.method7241()) {
								}
							} else {
								for (local344 = (Class6_Sub2_Sub3_Sub2) this.aClass286_9.method7242(); local344 != null && local344.aLong272 != local334; local344 = (Class6_Sub2_Sub3_Sub2) this.aClass286_9.method7241()) {
								}
							}
							if (local344 == null) {
								throw new IOException();
							}
							this.aClass6_Sub2_Sub3_Sub2_2 = local344;
							@Pc(403) int local403 = local316 == 0 ? 5 : 9;
							this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1 = new Class6_Sub40(this.aClass6_Sub2_Sub3_Sub2_2.aByte49 + local312 + local403);
							this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.method8589(local316);
							this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.method8554(local312);
							this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 = 8;
							this.aClass6_Sub40_8.anInt10169 = 0;
						} else if (this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub40_8.aByteArray113[0] == -1) {
							this.aClass6_Sub40_8.anInt10169 = 0;
							this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 = 1;
						} else {
							this.aClass6_Sub2_Sub3_Sub2_2 = null;
						}
					}
				} else {
					local217 = this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.aByteArray113.length - this.aClass6_Sub2_Sub3_Sub2_2.aByte49;
					local241 = 512 - this.aClass6_Sub2_Sub3_Sub2_2.anInt2085;
					if (local217 - this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169 < local241) {
						local241 = local217 - this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169;
					}
					if (local241 > local177) {
						local241 = local177;
					}
					this.aClass185_2.method5217(local241, this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169, this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.aByteArray113);
					if (this.aByte99 != 0) {
						for (local302 = 0; local302 < local241; local302++) {
							this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.aByteArray113[this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169 + local302] = (byte) (this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.aByteArray113[this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169 + local302] ^ this.aByte99);
						}
					}
					this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 += local241;
					this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169 += local241;
					if (local217 == this.aClass6_Sub2_Sub3_Sub2_2.aClass6_Sub40_1.anInt10169) {
						this.aClass6_Sub2_Sub3_Sub2_2.method8754();
						this.aClass6_Sub2_Sub3_Sub2_2.aBoolean158 = false;
						this.aClass6_Sub2_Sub3_Sub2_2 = null;
					} else if (this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 == 512) {
						this.aClass6_Sub2_Sub3_Sub2_2.anInt2085 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(620) IOException local620) {
			try {
				this.aClass185_2.method5222();
			} catch (@Pc(626) Exception local626) {
			}
			this.anInt8634 = -2;
			this.anInt8633++;
			this.aClass185_2 = null;
			return this.method7431() == 0 && this.method7429() == 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public void method7425() {
		if (this.aClass185_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub40_7.anInt10169 = 0;
			this.aClass6_Sub40_7.method8589(7);
			this.aClass6_Sub40_7.method8613(0);
			this.aClass185_2.method5219(this.aClass6_Sub40_7.aByteArray113, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass185_2.method5222();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt8633++;
			this.aClass185_2 = null;
			this.anInt8634 = -2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!le;BZ)V")
	public void method7426(@OriginalArg(0) Class185 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass185_2 != null) {
			try {
				this.aClass185_2.method5222();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass185_2 = null;
		}
		this.aClass185_2 = arg0;
		this.method7439();
		this.method7438(arg1);
		this.aClass6_Sub40_8.anInt10169 = 0;
		this.aClass6_Sub2_Sub3_Sub2_2 = null;
		while (true) {
			@Pc(48) Class6_Sub2_Sub3_Sub2 local48 = (Class6_Sub2_Sub3_Sub2) this.aClass286_9.method7244();
			if (local48 == null) {
				while (true) {
					local48 = (Class6_Sub2_Sub3_Sub2) this.aClass286_11.method7244();
					if (local48 == null) {
						if (this.aByte99 != 0) {
							try {
								this.aClass6_Sub40_7.anInt10169 = 0;
								this.aClass6_Sub40_7.method8589(4);
								this.aClass6_Sub40_7.method8589(this.aByte99);
								this.aClass6_Sub40_7.method8561(0);
								this.aClass185_2.method5219(this.aClass6_Sub40_7.aByteArray113, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass185_2.method5222();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass185_2 = null;
								this.anInt8633++;
								this.anInt8634 = -2;
							}
						}
						this.anInt8632 = 0;
						this.aLong221 = Static32.method595();
						return;
					}
					this.aClass286_10.method7239(local48);
				}
			}
			this.aClass286_8.method7239(local48);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Z")
	public boolean method7427() {
		return this.method7431() >= 20;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
	private int method7429() {
		return this.aClass286_10.method7240() + this.aClass286_11.method7240();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
	public void method7430() {
		if (this.aClass185_2 != null) {
			this.aClass185_2.method5216();
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)I")
	public int method7431() {
		return this.aClass286_8.method7240() + this.aClass286_9.method7240();
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)Z")
	public boolean method7432() {
		return this.method7429() >= 20;
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(B)V")
	public void method7433() {
		try {
			this.aClass185_2.method5222();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt8634 = -1;
		this.aByte99 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt8633++;
		this.aClass185_2 = null;
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	public void method7434() {
		if (this.aClass185_2 != null) {
			this.aClass185_2.method5222();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBIZI)Lclient!dia;")
	public Class6_Sub2_Sub3_Sub2 method7437(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(11) long local11 = (long) ((arg3 << 16) + arg0);
		@Pc(15) Class6_Sub2_Sub3_Sub2 local15 = new Class6_Sub2_Sub3_Sub2();
		local15.aLong272 = local11;
		local15.aBoolean159 = arg2;
		local15.aByte49 = arg1;
		if (arg2) {
			if (this.method7431() >= 20) {
				throw new RuntimeException();
			}
			this.aClass286_8.method7239(local15);
		} else if (this.method7429() < 20) {
			this.aClass286_10.method7239(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
	public void method7438(@OriginalArg(0) boolean arg0) {
		if (this.aClass185_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub40_7.anInt10169 = 0;
			this.aClass6_Sub40_7.method8589(arg0 ? 2 : 3);
			this.aClass6_Sub40_7.method8613(0);
			this.aClass185_2.method5219(this.aClass6_Sub40_7.aByteArray113, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass185_2.method5222();
			} catch (@Pc(49) Exception local49) {
			}
			this.aClass185_2 = null;
			this.anInt8634 = -2;
			this.anInt8633++;
		}
	}

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V")
	private void method7439() {
		if (this.aClass185_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub40_7.anInt10169 = 0;
			this.aClass6_Sub40_7.method8589(6);
			this.aClass6_Sub40_7.method8613(3);
			this.aClass185_2.method5219(this.aClass6_Sub40_7.aByteArray113, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass185_2.method5222();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass185_2 = null;
			this.anInt8633++;
			this.anInt8634 = -2;
		}
	}
}
