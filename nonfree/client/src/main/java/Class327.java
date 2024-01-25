import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class327 {

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "Lclient!rfa;")
	private Class285 aClass285_2;

	@OriginalMember(owner = "client!uaa", name = "z", descriptor = "J")
	private long aLong238;

	@OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
	private int anInt8670;

	@OriginalMember(owner = "client!uaa", name = "G", descriptor = "Lclient!nf;")
	private Class2_Sub3_Sub5_Sub2 aClass2_Sub3_Sub5_Sub2_2;

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lclient!je;")
	private final Class171 aClass171_8 = new Class171();

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "Lclient!je;")
	private final Class171 aClass171_9 = new Class171();

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "Lclient!je;")
	private final Class171 aClass171_10 = new Class171();

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "Lclient!je;")
	private final Class171 aClass171_11 = new Class171();

	@OriginalMember(owner = "client!uaa", name = "A", descriptor = "Lclient!es;")
	private final Class2_Sub15 aClass2_Sub15_6 = new Class2_Sub15(4);

	@OriginalMember(owner = "client!uaa", name = "F", descriptor = "B")
	private byte aByte107 = 0;

	@OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
	public volatile int anInt8672 = 0;

	@OriginalMember(owner = "client!uaa", name = "D", descriptor = "I")
	public volatile int anInt8671 = 0;

	@OriginalMember(owner = "client!uaa", name = "C", descriptor = "Lclient!es;")
	private final Class2_Sub15 aClass2_Sub15_7 = new Class2_Sub15(8);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIZB)Lclient!nf;")
	public Class2_Sub3_Sub5_Sub2 method7221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(14) Class2_Sub3_Sub5_Sub2 local14 = new Class2_Sub3_Sub5_Sub2();
		local14.aBoolean499 = arg2;
		local14.aLong260 = local10;
		local14.aByte86 = arg3;
		if (arg2) {
			if (this.method7235() >= 20) {
				throw new RuntimeException();
			}
			this.aClass171_8.method3791(local14);
		} else if (this.method7234() < 20) {
			this.aClass171_10.method3791(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z")
	public boolean method7222() {
		if (this.aClass285_2 != null) {
			@Pc(11) long local11 = Static548.method7437();
			@Pc(18) int local18 = (int) (local11 - this.aLong238);
			this.aLong238 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt8670 += local18;
			if (this.anInt8670 > 30000) {
				try {
					this.aClass285_2.method6502();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass285_2 = null;
			}
		}
		if (this.aClass285_2 == null) {
			return this.method7235() == 0 && this.method7234() == 0;
		}
		try {
			this.aClass285_2.method6503();
			for (@Pc(70) Class2_Sub3_Sub5_Sub2 local70 = (Class2_Sub3_Sub5_Sub2) this.aClass171_8.method3796(); local70 != null; local70 = (Class2_Sub3_Sub5_Sub2) this.aClass171_8.method3786()) {
				this.aClass2_Sub15_6.anInt5241 = 0;
				this.aClass2_Sub15_6.method4333(1);
				this.aClass2_Sub15_6.method4339((int) local70.aLong260);
				this.aClass285_2.method6501(4, this.aClass2_Sub15_6.aByteArray62);
				this.aClass171_9.method3791(local70);
			}
			for (@Pc(116) Class2_Sub3_Sub5_Sub2 local116 = (Class2_Sub3_Sub5_Sub2) this.aClass171_10.method3796(); local116 != null; local116 = (Class2_Sub3_Sub5_Sub2) this.aClass171_10.method3786()) {
				this.aClass2_Sub15_6.anInt5241 = 0;
				this.aClass2_Sub15_6.method4333(0);
				this.aClass2_Sub15_6.method4339((int) local116.aLong260);
				this.aClass285_2.method6501(4, this.aClass2_Sub15_6.aByteArray62);
				this.aClass171_11.method3791(local116);
			}
			for (@Pc(166) int local166 = 0; local166 < 100; local166++) {
				@Pc(173) int local173 = this.aClass285_2.method6504();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt8670 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass2_Sub3_Sub5_Sub2_2 == null) {
					local192 = 8;
				} else if (this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 == 0) {
					local192 = 1;
				}
				@Pc(213) int local213;
				@Pc(241) int local241;
				@Pc(302) int local302;
				if (local192 > 0) {
					local213 = local192 - this.aClass2_Sub15_7.anInt5241;
					if (local213 > local173) {
						local213 = local173;
					}
					this.aClass285_2.method6499(this.aClass2_Sub15_7.anInt5241, this.aClass2_Sub15_7.aByteArray62, local213);
					if (this.aByte107 != 0) {
						for (local241 = 0; local241 < local213; local241++) {
							this.aClass2_Sub15_7.aByteArray62[this.aClass2_Sub15_7.anInt5241 + local241] ^= this.aByte107;
						}
					}
					this.aClass2_Sub15_7.anInt5241 += local213;
					if (this.aClass2_Sub15_7.anInt5241 >= local192) {
						if (this.aClass2_Sub3_Sub5_Sub2_2 == null) {
							this.aClass2_Sub15_7.anInt5241 = 0;
							local241 = this.aClass2_Sub15_7.method4325();
							local302 = this.aClass2_Sub15_7.method4294();
							@Pc(307) int local307 = this.aClass2_Sub15_7.method4325();
							@Pc(312) int local312 = this.aClass2_Sub15_7.method4307();
							@Pc(316) int local316 = local307 & 0x7F;
							@Pc(327) boolean local327 = (local307 & 0x80) != 0;
							@Pc(335) long local335 = (long) ((local241 << 16) + local302);
							@Pc(345) Class2_Sub3_Sub5_Sub2 local345;
							if (local327) {
								for (local345 = (Class2_Sub3_Sub5_Sub2) this.aClass171_11.method3796(); local345 != null && local335 != local345.aLong260; local345 = (Class2_Sub3_Sub5_Sub2) this.aClass171_11.method3786()) {
								}
							} else {
								for (local345 = (Class2_Sub3_Sub5_Sub2) this.aClass171_9.method3796(); local345 != null && local345.aLong260 != local335; local345 = (Class2_Sub3_Sub5_Sub2) this.aClass171_9.method3786()) {
								}
							}
							if (local345 == null) {
								throw new IOException();
							}
							this.aClass2_Sub3_Sub5_Sub2_2 = local345;
							@Pc(408) int local408 = local316 == 0 ? 5 : 9;
							this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4 = new Class2_Sub15(local408 + local312 + this.aClass2_Sub3_Sub5_Sub2_2.aByte86);
							this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.method4333(local316);
							this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.method4288(local312);
							this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 = 8;
							this.aClass2_Sub15_7.anInt5241 = 0;
						} else if (this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub15_7.aByteArray62[0] == -1) {
							this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 = 1;
							this.aClass2_Sub15_7.anInt5241 = 0;
						} else {
							this.aClass2_Sub3_Sub5_Sub2_2 = null;
						}
					}
				} else {
					local213 = this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.aByteArray62.length - this.aClass2_Sub3_Sub5_Sub2_2.aByte86;
					local241 = 512 - this.aClass2_Sub3_Sub5_Sub2_2.anInt6386;
					if (local213 - this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.anInt5241 < local241) {
						local241 = local213 - this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.anInt5241;
					}
					if (local241 > local173) {
						local241 = local173;
					}
					this.aClass285_2.method6499(this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.anInt5241, this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.aByteArray62, local241);
					if (this.aByte107 != 0) {
						for (local302 = 0; local302 < local241; local302++) {
							this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.aByteArray62[local302 + this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.anInt5241] ^= this.aByte107;
						}
					}
					this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.anInt5241 += local241;
					this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 += local241;
					if (local213 == this.aClass2_Sub3_Sub5_Sub2_2.aClass2_Sub15_4.anInt5241) {
						this.aClass2_Sub3_Sub5_Sub2_2.method7767();
						this.aClass2_Sub3_Sub5_Sub2_2.aBoolean501 = false;
						this.aClass2_Sub3_Sub5_Sub2_2 = null;
					} else if (this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 == 512) {
						this.aClass2_Sub3_Sub5_Sub2_2.anInt6386 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(641) IOException local641) {
			try {
				this.aClass285_2.method6502();
			} catch (@Pc(647) Exception local647) {
			}
			this.anInt8672++;
			this.anInt8671 = -2;
			this.aClass285_2 = null;
			return this.method7235() == 0 && this.method7234() == 0;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	public void method7224() {
		if (this.aClass285_2 != null) {
			this.aClass285_2.method6502();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)V")
	public void method7225() {
		if (this.aClass285_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub15_6.anInt5241 = 0;
			this.aClass2_Sub15_6.method4333(7);
			this.aClass2_Sub15_6.method4339(0);
			this.aClass285_2.method6501(4, this.aClass2_Sub15_6.aByteArray62);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass285_2.method6502();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt8671 = -2;
			this.anInt8672++;
			this.aClass285_2 = null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IZ)V")
	public void method7226(@OriginalArg(1) boolean arg0) {
		if (this.aClass285_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub15_6.anInt5241 = 0;
			this.aClass2_Sub15_6.method4333(arg0 ? 2 : 3);
			this.aClass2_Sub15_6.method4339(0);
			this.aClass285_2.method6501(4, this.aClass2_Sub15_6.aByteArray62);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass285_2.method6502();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt8672++;
			this.aClass285_2 = null;
			this.anInt8671 = -2;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
	public void method7227() {
		try {
			this.aClass285_2.method6502();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt8672++;
		this.anInt8671 = -1;
		this.aClass285_2 = null;
		this.aByte107 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IZLclient!rfa;)V")
	public void method7228(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class285 arg1) {
		if (this.aClass285_2 != null) {
			try {
				this.aClass285_2.method6502();
			} catch (@Pc(21) Exception local21) {
			}
			this.aClass285_2 = null;
		}
		this.aClass285_2 = arg1;
		this.method7231();
		this.method7226(arg0);
		this.aClass2_Sub15_7.anInt5241 = 0;
		this.aClass2_Sub3_Sub5_Sub2_2 = null;
		while (true) {
			@Pc(47) Class2_Sub3_Sub5_Sub2 local47 = (Class2_Sub3_Sub5_Sub2) this.aClass171_9.method3787();
			if (local47 == null) {
				while (true) {
					local47 = (Class2_Sub3_Sub5_Sub2) this.aClass171_11.method3787();
					if (local47 == null) {
						if (this.aByte107 != 0) {
							try {
								this.aClass2_Sub15_6.anInt5241 = 0;
								this.aClass2_Sub15_6.method4333(4);
								this.aClass2_Sub15_6.method4333(this.aByte107);
								this.aClass2_Sub15_6.method4350(0);
								this.aClass285_2.method6501(4, this.aClass2_Sub15_6.aByteArray62);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass285_2.method6502();
								} catch (@Pc(114) Exception local114) {
								}
								this.anInt8671 = -2;
								this.anInt8672++;
								this.aClass285_2 = null;
							}
						}
						this.anInt8670 = 0;
						this.aLong238 = Static548.method7437();
						return;
					}
					this.aClass171_10.method3791(local47);
				}
			}
			this.aClass171_8.method3791(local47);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)Z")
	public boolean method7230() {
		return this.method7234() >= 20;
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	private void method7231() {
		if (this.aClass285_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub15_6.anInt5241 = 0;
			this.aClass2_Sub15_6.method4333(6);
			this.aClass2_Sub15_6.method4339(3);
			this.aClass285_2.method6501(4, this.aClass2_Sub15_6.aByteArray62);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass285_2.method6502();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt8672++;
			this.anInt8671 = -2;
			this.aClass285_2 = null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)Z")
	public boolean method7232() {
		return this.method7235() >= 20;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V")
	public void method7233() {
		if (this.aClass285_2 != null) {
			this.aClass285_2.method6497();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)I")
	private int method7234() {
		return this.aClass171_10.method3793() + this.aClass171_11.method3793();
	}

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)I")
	public int method7235() {
		return this.aClass171_8.method3793() + this.aClass171_9.method3793();
	}
}
