import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class288 {

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "J")
	private long aLong256;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "Lclient!qm;")
	private Class289 aClass289_1;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
	private int anInt8300;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "Lclient!te;")
	private Class5_Sub2_Sub14_Sub1 aClass5_Sub2_Sub14_Sub1_1;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!hf;")
	private final Class150 aClass150_12 = new Class150();

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!hf;")
	private final Class150 aClass150_13 = new Class150();

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Lclient!hf;")
	private final Class150 aClass150_14 = new Class150();

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "Lclient!hf;")
	private final Class150 aClass150_15 = new Class150();

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "Lclient!rv;")
	private final Class5_Sub15 aClass5_Sub15_6 = new Class5_Sub15(4);

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	public volatile int anInt8301 = 0;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "B")
	private byte aByte96 = 0;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
	public volatile int anInt8302 = 0;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "Lclient!rv;")
	private final Class5_Sub15 aClass5_Sub15_7 = new Class5_Sub15(8);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
	public boolean method7040() {
		@Pc(18) int local18;
		if (this.aClass289_1 != null) {
			@Pc(11) long local11 = Static124.method1947();
			local18 = (int) (local11 - this.aLong256);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong256 = local11;
			this.anInt8300 += local18;
			if (this.anInt8300 > 30000) {
				try {
					this.aClass289_1.method7061();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass289_1 = null;
			}
		}
		if (this.aClass289_1 == null) {
			return this.method7049() == 0 && this.method7052() == 0;
		}
		try {
			this.aClass289_1.method7060();
			for (@Pc(75) Class5_Sub2_Sub14_Sub1 local75 = (Class5_Sub2_Sub14_Sub1) this.aClass150_12.method3100(); local75 != null; local75 = (Class5_Sub2_Sub14_Sub1) this.aClass150_12.method3096()) {
				this.aClass5_Sub15_6.anInt4144 = 0;
				this.aClass5_Sub15_6.method3651(1);
				this.aClass5_Sub15_6.method3676((int) local75.aLong319);
				this.aClass289_1.method7057(this.aClass5_Sub15_6.aByteArray45, 4);
				this.aClass150_13.method3095(local75);
			}
			for (@Pc(120) Class5_Sub2_Sub14_Sub1 local120 = (Class5_Sub2_Sub14_Sub1) this.aClass150_14.method3100(); local120 != null; local120 = (Class5_Sub2_Sub14_Sub1) this.aClass150_14.method3096()) {
				this.aClass5_Sub15_6.anInt4144 = 0;
				this.aClass5_Sub15_6.method3651(0);
				this.aClass5_Sub15_6.method3676((int) local120.aLong319);
				this.aClass289_1.method7057(this.aClass5_Sub15_6.aByteArray45, 4);
				this.aClass150_15.method3095(local120);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(169) int local169 = this.aClass289_1.method7056();
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.anInt8300 = 0;
				@Pc(182) byte local182 = 0;
				if (this.aClass5_Sub2_Sub14_Sub1_1 == null) {
					local182 = 8;
				} else if (this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 == 0) {
					local182 = 1;
				}
				@Pc(209) int local209;
				@Pc(230) int local230;
				@Pc(286) int local286;
				if (local182 > 0) {
					local209 = local182 - this.aClass5_Sub15_7.anInt4144;
					if (local209 > local169) {
						local209 = local169;
					}
					this.aClass289_1.method7062(local209, this.aClass5_Sub15_7.anInt4144, this.aClass5_Sub15_7.aByteArray45);
					if (this.aByte96 != 0) {
						for (local230 = 0; local230 < local209; local230++) {
							this.aClass5_Sub15_7.aByteArray45[local230 + this.aClass5_Sub15_7.anInt4144] ^= this.aByte96;
						}
					}
					this.aClass5_Sub15_7.anInt4144 += local209;
					if (this.aClass5_Sub15_7.anInt4144 >= local182) {
						if (this.aClass5_Sub2_Sub14_Sub1_1 == null) {
							this.aClass5_Sub15_7.anInt4144 = 0;
							local230 = this.aClass5_Sub15_7.method3642();
							local286 = this.aClass5_Sub15_7.method3698();
							@Pc(291) int local291 = this.aClass5_Sub15_7.method3642();
							@Pc(296) int local296 = this.aClass5_Sub15_7.method3671();
							@Pc(300) int local300 = local291 & 0x7F;
							@Pc(311) boolean local311 = (local291 & 0x80) != 0;
							@Pc(318) long local318 = (long) (local286 + (local230 << 16));
							@Pc(328) Class5_Sub2_Sub14_Sub1 local328;
							if (local311) {
								for (local328 = (Class5_Sub2_Sub14_Sub1) this.aClass150_15.method3100(); local328 != null && local328.aLong319 != local318; local328 = (Class5_Sub2_Sub14_Sub1) this.aClass150_15.method3096()) {
								}
							} else {
								for (local328 = (Class5_Sub2_Sub14_Sub1) this.aClass150_13.method3100(); local328 != null && local318 != local328.aLong319; local328 = (Class5_Sub2_Sub14_Sub1) this.aClass150_13.method3096()) {
								}
							}
							if (local328 == null) {
								throw new IOException();
							}
							this.aClass5_Sub2_Sub14_Sub1_1 = local328;
							@Pc(383) int local383 = local300 == 0 ? 5 : 9;
							this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9 = new Class5_Sub15(this.aClass5_Sub2_Sub14_Sub1_1.aByte120 + local296 + local383);
							this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.method3651(local300);
							this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.method3679(local296);
							this.aClass5_Sub15_7.anInt4144 = 0;
							this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 = 8;
						} else if (this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub15_7.aByteArray45[0] == -1) {
							this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 = 1;
							this.aClass5_Sub15_7.anInt4144 = 0;
						} else {
							this.aClass5_Sub2_Sub14_Sub1_1 = null;
						}
					}
				} else {
					local209 = this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.aByteArray45.length - this.aClass5_Sub2_Sub14_Sub1_1.aByte120;
					local230 = 512 - this.aClass5_Sub2_Sub14_Sub1_1.anInt9172;
					if (local230 > local209 - this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144) {
						local230 = local209 - this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144;
					}
					if (local169 < local230) {
						local230 = local169;
					}
					this.aClass289_1.method7062(local230, this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144, this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.aByteArray45);
					if (this.aByte96 != 0) {
						for (local286 = 0; local286 < local230; local286++) {
							this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.aByteArray45[this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144 + local286] = (byte) (this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.aByteArray45[this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144 + local286] ^ this.aByte96);
						}
					}
					this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 += local230;
					this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144 += local230;
					if (local209 == this.aClass5_Sub2_Sub14_Sub1_1.aClass5_Sub15_9.anInt4144) {
						this.aClass5_Sub2_Sub14_Sub1_1.method8569();
						this.aClass5_Sub2_Sub14_Sub1_1.aBoolean746 = false;
						this.aClass5_Sub2_Sub14_Sub1_1 = null;
					} else if (this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 == 512) {
						this.aClass5_Sub2_Sub14_Sub1_1.anInt9172 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(613) IOException local613) {
			try {
				this.aClass289_1.method7061();
			} catch (@Pc(621) Exception local621) {
			}
			this.anInt8302 = -2;
			this.anInt8301++;
			this.aClass289_1 = null;
			return this.method7049() == 0 && this.method7052() == 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZ)V")
	public void method7041(@OriginalArg(0) boolean arg0) {
		if (this.aClass289_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub15_6.anInt4144 = 0;
			this.aClass5_Sub15_6.method3651(arg0 ? 2 : 3);
			this.aClass5_Sub15_6.method3676(0);
			this.aClass289_1.method7057(this.aClass5_Sub15_6.aByteArray45, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass289_1.method7061();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt8302 = -2;
			this.aClass289_1 = null;
			this.anInt8301++;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZIBBI)Lclient!te;")
	public Class5_Sub2_Sub14_Sub1 method7042(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(15) long local15 = (long) ((arg3 << 16) + arg1);
		@Pc(19) Class5_Sub2_Sub14_Sub1 local19 = new Class5_Sub2_Sub14_Sub1();
		local19.aByte120 = arg2;
		local19.aBoolean747 = arg0;
		local19.aLong319 = local15;
		if (arg0) {
			if (this.method7049() >= 20) {
				throw new RuntimeException();
			}
			this.aClass150_12.method3095(local19);
		} else if (this.method7052() < 20) {
			this.aClass150_14.method3095(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!qm;ZB)V")
	public void method7044(@OriginalArg(0) Class289 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass289_1 != null) {
			try {
				this.aClass289_1.method7061();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass289_1 = null;
		}
		this.aClass289_1 = arg0;
		this.method7045();
		this.method7041(arg1);
		this.aClass5_Sub15_7.anInt4144 = 0;
		this.aClass5_Sub2_Sub14_Sub1_1 = null;
		while (true) {
			@Pc(46) Class5_Sub2_Sub14_Sub1 local46 = (Class5_Sub2_Sub14_Sub1) this.aClass150_13.method3101();
			if (local46 == null) {
				while (true) {
					local46 = (Class5_Sub2_Sub14_Sub1) this.aClass150_15.method3101();
					if (local46 == null) {
						if (this.aByte96 != 0) {
							try {
								this.aClass5_Sub15_6.anInt4144 = 0;
								this.aClass5_Sub15_6.method3651(4);
								this.aClass5_Sub15_6.method3651(this.aByte96);
								this.aClass5_Sub15_6.method3660(0);
								this.aClass289_1.method7057(this.aClass5_Sub15_6.aByteArray45, 4);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass289_1.method7061();
								} catch (@Pc(110) Exception local110) {
								}
								this.aClass289_1 = null;
								this.anInt8301++;
								this.anInt8302 = -2;
							}
						}
						this.anInt8300 = 0;
						this.aLong256 = Static124.method1947();
						return;
					}
					this.aClass150_14.method3095(local46);
				}
			}
			this.aClass150_12.method3095(local46);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	private void method7045() {
		if (this.aClass289_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub15_6.anInt4144 = 0;
			this.aClass5_Sub15_6.method3651(6);
			this.aClass5_Sub15_6.method3676(3);
			this.aClass289_1.method7057(this.aClass5_Sub15_6.aByteArray45, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass289_1.method7061();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass289_1 = null;
			this.anInt8302 = -2;
			this.anInt8301++;
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
	public void method7046() {
		try {
			this.aClass289_1.method7061();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt8302 = -1;
		this.aByte96 = (byte) (int) ((double) 1 + Math.random() * 255.0D);
		this.anInt8301++;
		this.aClass289_1 = null;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z")
	public boolean method7047() {
		return this.method7049() >= 20;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method7048() {
		if (this.aClass289_1 != null) {
			this.aClass289_1.method7058();
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)I")
	public int method7049() {
		return this.aClass150_12.method3099() + this.aClass150_13.method3099();
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)Z")
	public boolean method7050() {
		return this.method7052() >= 20;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public void method7051() {
		if (this.aClass289_1 != null) {
			this.aClass289_1.method7061();
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I")
	private int method7052() {
		return this.aClass150_14.method3099() + this.aClass150_15.method3099();
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	public void method7053() {
		if (this.aClass289_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub15_6.anInt4144 = 0;
			this.aClass5_Sub15_6.method3651(7);
			this.aClass5_Sub15_6.method3676(0);
			this.aClass289_1.method7057(this.aClass5_Sub15_6.aByteArray45, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass289_1.method7061();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt8301++;
			this.anInt8302 = -2;
			this.aClass289_1 = null;
		}
	}
}
