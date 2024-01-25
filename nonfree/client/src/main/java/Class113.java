import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class113 {

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "Lclient!ak;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	private int anInt2951;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "Lclient!ma;")
	private Class6_Sub2_Sub11_Sub1 aClass6_Sub2_Sub11_Sub1_1;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!nk;")
	private final Class143 aClass143_8 = new Class143();

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!nk;")
	private final Class143 aClass143_9 = new Class143();

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!nk;")
	private final Class143 aClass143_10 = new Class143();

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "Lclient!nk;")
	private final Class143 aClass143_11 = new Class143();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!ec;")
	private final Class6_Sub10 aClass6_Sub10_1 = new Class6_Sub10(4);

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public volatile int anInt2953 = 0;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public volatile int anInt2952 = 0;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "B")
	private byte aByte44 = 0;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!ec;")
	private final Class6_Sub10 aClass6_Sub10_2 = new Class6_Sub10(8);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZLclient!ak;)V")
	public void method3129(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class11 arg1) {
		if (this.aClass11_4 != null) {
			try {
				this.aClass11_4.method159();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass11_4 = null;
		}
		this.aClass11_4 = arg1;
		this.method3135();
		this.method3137(arg0);
		this.aClass6_Sub2_Sub11_Sub1_1 = null;
		this.aClass6_Sub10_2.anInt4188 = 0;
		while (true) {
			@Pc(44) Class6_Sub2_Sub11_Sub1 local44 = (Class6_Sub2_Sub11_Sub1) this.aClass143_9.method3759();
			if (local44 == null) {
				while (true) {
					local44 = (Class6_Sub2_Sub11_Sub1) this.aClass143_11.method3759();
					if (local44 == null) {
						if (this.aByte44 != 0) {
							try {
								this.aClass6_Sub10_1.anInt4188 = 0;
								this.aClass6_Sub10_1.method3968(4);
								this.aClass6_Sub10_1.method3968(this.aByte44);
								this.aClass6_Sub10_1.method4025(0);
								this.aClass11_4.method158(this.aClass6_Sub10_1.aByteArray67, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									this.aClass11_4.method159();
								} catch (@Pc(119) Exception local119) {
								}
								this.anInt2952 = -2;
								this.anInt2953++;
								this.aClass11_4 = null;
							}
						}
						this.anInt2951 = 0;
						this.aLong102 = Static245.method4300();
						return;
					}
					this.aClass143_10.method3765(local44);
				}
			}
			this.aClass143_8.method3765(local44);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
	public boolean method3130() {
		return this.method3132() >= 20;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
	public void method3131() {
		if (this.aClass11_4 != null) {
			this.aClass11_4.method162();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
	public int method3132() {
		return this.aClass143_8.method3760() + this.aClass143_9.method3760();
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)Z")
	public boolean method3133() {
		return this.method3134() >= 20;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)I")
	private int method3134() {
		return this.aClass143_10.method3760() + this.aClass143_11.method3760();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	private void method3135() {
		if (this.aClass11_4 == null) {
			return;
		}
		try {
			this.aClass6_Sub10_1.anInt4188 = 0;
			this.aClass6_Sub10_1.method3968(6);
			this.aClass6_Sub10_1.method4009(3);
			this.aClass11_4.method158(this.aClass6_Sub10_1.aByteArray67, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass11_4.method159();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt2952 = -2;
			this.anInt2953++;
			this.aClass11_4 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public void method3136() {
		if (this.aClass11_4 == null) {
			return;
		}
		try {
			this.aClass6_Sub10_1.anInt4188 = 0;
			this.aClass6_Sub10_1.method3968(7);
			this.aClass6_Sub10_1.method4009(0);
			this.aClass11_4.method158(this.aClass6_Sub10_1.aByteArray67, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass11_4.method159();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt2952 = -2;
			this.aClass11_4 = null;
			this.anInt2953++;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	public void method3137(@OriginalArg(1) boolean arg0) {
		if (this.aClass11_4 == null) {
			return;
		}
		try {
			this.aClass6_Sub10_1.anInt4188 = 0;
			this.aClass6_Sub10_1.method3968(arg0 ? 2 : 3);
			this.aClass6_Sub10_1.method4009(0);
			this.aClass11_4.method158(this.aClass6_Sub10_1.aByteArray67, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass11_4.method159();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass11_4 = null;
			this.anInt2952 = -2;
			this.anInt2953++;
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
	public void method3138() {
		if (this.aClass11_4 != null) {
			this.aClass11_4.method159();
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)Z")
	public boolean method3139() {
		@Pc(18) int local18;
		if (this.aClass11_4 != null) {
			@Pc(11) long local11 = Static245.method4300();
			local18 = (int) (local11 - this.aLong102);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong102 = local11;
			this.anInt2951 += local18;
			if (this.anInt2951 > 30000) {
				try {
					this.aClass11_4.method159();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass11_4 = null;
			}
		}
		if (this.aClass11_4 == null) {
			return this.method3132() == 0 && this.method3134() == 0;
		}
		try {
			this.aClass11_4.method169();
			for (@Pc(80) Class6_Sub2_Sub11_Sub1 local80 = (Class6_Sub2_Sub11_Sub1) this.aClass143_8.method3766(); local80 != null; local80 = (Class6_Sub2_Sub11_Sub1) this.aClass143_8.method3763()) {
				this.aClass6_Sub10_1.anInt4188 = 0;
				this.aClass6_Sub10_1.method3968(1);
				this.aClass6_Sub10_1.method4009((int) local80.aLong219);
				this.aClass11_4.method158(this.aClass6_Sub10_1.aByteArray67, 4);
				this.aClass143_9.method3765(local80);
			}
			for (@Pc(126) Class6_Sub2_Sub11_Sub1 local126 = (Class6_Sub2_Sub11_Sub1) this.aClass143_10.method3766(); local126 != null; local126 = (Class6_Sub2_Sub11_Sub1) this.aClass143_10.method3763()) {
				this.aClass6_Sub10_1.anInt4188 = 0;
				this.aClass6_Sub10_1.method3968(0);
				this.aClass6_Sub10_1.method4009((int) local126.aLong219);
				this.aClass11_4.method158(this.aClass6_Sub10_1.aByteArray67, 4);
				this.aClass143_11.method3765(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.aClass11_4.method160();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt2951 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass6_Sub2_Sub11_Sub1_1 == null) {
					local191 = 8;
				} else if (this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 == 0) {
					local191 = 1;
				}
				@Pc(213) int local213;
				@Pc(234) int local234;
				@Pc(291) int local291;
				if (local191 > 0) {
					local213 = local191 - this.aClass6_Sub10_2.anInt4188;
					if (local213 > local175) {
						local213 = local175;
					}
					this.aClass11_4.method164(this.aClass6_Sub10_2.aByteArray67, local213, this.aClass6_Sub10_2.anInt4188);
					if (this.aByte44 != 0) {
						for (local234 = 0; local234 < local213; local234++) {
							this.aClass6_Sub10_2.aByteArray67[local234 + this.aClass6_Sub10_2.anInt4188] ^= this.aByte44;
						}
					}
					this.aClass6_Sub10_2.anInt4188 += local213;
					if (local191 <= this.aClass6_Sub10_2.anInt4188) {
						if (this.aClass6_Sub2_Sub11_Sub1_1 == null) {
							this.aClass6_Sub10_2.anInt4188 = 0;
							local234 = this.aClass6_Sub10_2.method3972();
							local291 = this.aClass6_Sub10_2.method4021();
							@Pc(296) int local296 = this.aClass6_Sub10_2.method3972();
							@Pc(301) int local301 = this.aClass6_Sub10_2.method3979();
							@Pc(305) int local305 = local296 & 0x7F;
							@Pc(316) boolean local316 = (local296 & 0x80) != 0;
							@Pc(323) long local323 = (long) ((local234 << 16) + local291);
							@Pc(333) Class6_Sub2_Sub11_Sub1 local333;
							if (local316) {
								for (local333 = (Class6_Sub2_Sub11_Sub1) this.aClass143_11.method3766(); local333 != null && local323 != local333.aLong219; local333 = (Class6_Sub2_Sub11_Sub1) this.aClass143_11.method3763()) {
								}
							} else {
								for (local333 = (Class6_Sub2_Sub11_Sub1) this.aClass143_9.method3766(); local333 != null && local323 != local333.aLong219; local333 = (Class6_Sub2_Sub11_Sub1) this.aClass143_9.method3763()) {
								}
							}
							if (local333 == null) {
								throw new IOException();
							}
							@Pc(393) int local393 = local305 == 0 ? 5 : 9;
							this.aClass6_Sub2_Sub11_Sub1_1 = local333;
							this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4 = new Class6_Sub10(this.aClass6_Sub2_Sub11_Sub1_1.aByte53 + local393 + local301);
							this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.method3968(local305);
							this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.method3976(local301);
							this.aClass6_Sub10_2.anInt4188 = 0;
							this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 = 8;
						} else if (this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub10_2.aByteArray67[0] == -1) {
							this.aClass6_Sub10_2.anInt4188 = 0;
							this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 = 1;
						} else {
							this.aClass6_Sub2_Sub11_Sub1_1 = null;
						}
					}
				} else {
					local213 = this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.aByteArray67.length - this.aClass6_Sub2_Sub11_Sub1_1.aByte53;
					local234 = 512 - this.aClass6_Sub2_Sub11_Sub1_1.anInt3483;
					if (local234 > local213 - this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.anInt4188) {
						local234 = local213 - this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.anInt4188;
					}
					if (local175 < local234) {
						local234 = local175;
					}
					this.aClass11_4.method164(this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.aByteArray67, local234, this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.anInt4188);
					if (this.aByte44 != 0) {
						for (local291 = 0; local291 < local234; local291++) {
							this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.aByteArray67[this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.anInt4188 + local291] ^= this.aByte44;
						}
					}
					this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.anInt4188 += local234;
					this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 += local234;
					if (this.aClass6_Sub2_Sub11_Sub1_1.aClass6_Sub10_4.anInt4188 == local213) {
						this.aClass6_Sub2_Sub11_Sub1_1.method5761();
						this.aClass6_Sub2_Sub11_Sub1_1.aBoolean366 = false;
						this.aClass6_Sub2_Sub11_Sub1_1 = null;
					} else if (this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 == 512) {
						this.aClass6_Sub2_Sub11_Sub1_1.anInt3483 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(615) IOException local615) {
			try {
				this.aClass11_4.method159();
			} catch (@Pc(621) Exception local621) {
			}
			this.aClass11_4 = null;
			this.anInt2952 = -2;
			this.anInt2953++;
			return this.method3132() == 0 && this.method3134() == 0;
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public void method3140() {
		try {
			this.aClass11_4.method159();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte44 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2952 = -1;
		this.aClass11_4 = null;
		this.anInt2953++;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZIZ)Lclient!ma;")
	public Class6_Sub2_Sub11_Sub1 method3141(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg3);
		@Pc(20) Class6_Sub2_Sub11_Sub1 local20 = new Class6_Sub2_Sub11_Sub1();
		local20.aByte53 = arg0;
		local20.aLong219 = local16;
		local20.aBoolean365 = arg2;
		if (arg2) {
			if (this.method3132() >= 20) {
				throw new RuntimeException();
			}
			this.aClass143_8.method3765(local20);
		} else if (this.method3134() < 20) {
			this.aClass143_10.method3765(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}
}
