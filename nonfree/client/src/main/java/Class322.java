import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class322 {

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "Lclient!vj;")
	private Class367 aClass367_2;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
	private int anInt8637;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "J")
	private long aLong232;

	@OriginalMember(owner = "client!sw", name = "E", descriptor = "Lclient!ue;")
	private Class2_Sub7_Sub9_Sub2 aClass2_Sub7_Sub9_Sub2_2;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "Lclient!qk;")
	private final Class290 aClass290_8 = new Class290();

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "Lclient!qk;")
	private final Class290 aClass290_9 = new Class290();

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "Lclient!qk;")
	private final Class290 aClass290_10 = new Class290();

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "Lclient!qk;")
	private final Class290 aClass290_11 = new Class290();

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "Lclient!sl;")
	private final Class2_Sub17 aClass2_Sub17_7 = new Class2_Sub17(4);

	@OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
	public volatile int anInt8638 = 0;

	@OriginalMember(owner = "client!sw", name = "B", descriptor = "I")
	public volatile int anInt8639 = 0;

	@OriginalMember(owner = "client!sw", name = "D", descriptor = "B")
	private byte aByte124 = 0;

	@OriginalMember(owner = "client!sw", name = "C", descriptor = "Lclient!sl;")
	private final Class2_Sub17 aClass2_Sub17_8 = new Class2_Sub17(8);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZIIB)Lclient!ue;")
	public Class2_Sub7_Sub9_Sub2 method7428(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg2);
		@Pc(15) Class2_Sub7_Sub9_Sub2 local15 = new Class2_Sub7_Sub9_Sub2();
		local15.aLong260 = local11;
		local15.aBoolean670 = arg1;
		local15.aByte127 = arg3;
		if (arg1) {
			if (this.method7436() >= 20) {
				throw new RuntimeException();
			}
			this.aClass290_8.method6678(local15);
		} else if (this.method7438() < 20) {
			this.aClass290_10.method6678(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
	public boolean method7429() {
		return this.method7436() >= 20;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
	public void method7430() {
		if (this.aClass367_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub17_7.anInt3378 = 0;
			this.aClass2_Sub17_7.method2837(7);
			this.aClass2_Sub17_7.method2848(0);
			this.aClass367_2.method8567(4, this.aClass2_Sub17_7.aByteArray26);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass367_2.method8569();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt8638++;
			this.aClass367_2 = null;
			this.anInt8639 = -2;
		}
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
	public void method7433() {
		if (this.aClass367_2 != null) {
			this.aClass367_2.method8569();
		}
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)V")
	public void method7434() {
		if (this.aClass367_2 != null) {
			this.aClass367_2.method8572();
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!vj;IZ)V")
	public void method7435(@OriginalArg(0) Class367 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass367_2 != null) {
			try {
				this.aClass367_2.method8569();
			} catch (@Pc(12) Exception local12) {
			}
			this.aClass367_2 = null;
		}
		this.aClass367_2 = arg0;
		this.method7440();
		this.method7442(arg1);
		this.aClass2_Sub7_Sub9_Sub2_2 = null;
		this.aClass2_Sub17_8.anInt3378 = 0;
		while (true) {
			@Pc(38) Class2_Sub7_Sub9_Sub2 local38 = (Class2_Sub7_Sub9_Sub2) this.aClass290_9.method6676();
			if (local38 == null) {
				while (true) {
					local38 = (Class2_Sub7_Sub9_Sub2) this.aClass290_11.method6676();
					if (local38 == null) {
						if (this.aByte124 != 0) {
							try {
								this.aClass2_Sub17_7.anInt3378 = 0;
								this.aClass2_Sub17_7.method2837(4);
								this.aClass2_Sub17_7.method2837(this.aByte124);
								this.aClass2_Sub17_7.method2879(0);
								this.aClass367_2.method8567(4, this.aClass2_Sub17_7.aByteArray26);
							} catch (@Pc(97) IOException local97) {
								try {
									this.aClass367_2.method8569();
								} catch (@Pc(103) Exception local103) {
								}
								this.aClass367_2 = null;
								this.anInt8638++;
								this.anInt8639 = -2;
							}
						}
						this.anInt8637 = 0;
						this.aLong232 = Static48.method1203();
						return;
					}
					this.aClass290_10.method6678(local38);
				}
			}
			this.aClass290_8.method6678(local38);
		}
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)I")
	public int method7436() {
		return this.aClass290_8.method6677() + this.aClass290_9.method6677();
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)Z")
	public boolean method7437() {
		return this.method7438() >= 20;
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)I")
	private int method7438() {
		return this.aClass290_10.method6677() + this.aClass290_11.method6677();
	}

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "(I)Z")
	public boolean method7439() {
		@Pc(17) int local17;
		if (this.aClass367_2 != null) {
			@Pc(11) long local11 = Static48.method1203();
			local17 = (int) (local11 - this.aLong232);
			this.aLong232 = local11;
			if (local17 > 200) {
				local17 = 200;
			}
			this.anInt8637 += local17;
			if (this.anInt8637 > 30000) {
				try {
					this.aClass367_2.method8569();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass367_2 = null;
			}
		}
		if (this.aClass367_2 == null) {
			return this.method7436() == 0 && this.method7438() == 0;
		}
		try {
			this.aClass367_2.method8575();
			for (@Pc(74) Class2_Sub7_Sub9_Sub2 local74 = (Class2_Sub7_Sub9_Sub2) this.aClass290_8.method6680(); local74 != null; local74 = (Class2_Sub7_Sub9_Sub2) this.aClass290_8.method6673()) {
				this.aClass2_Sub17_7.anInt3378 = 0;
				this.aClass2_Sub17_7.method2837(1);
				this.aClass2_Sub17_7.method2848((int) local74.aLong260);
				this.aClass367_2.method8567(4, this.aClass2_Sub17_7.aByteArray26);
				this.aClass290_9.method6678(local74);
			}
			for (@Pc(126) Class2_Sub7_Sub9_Sub2 local126 = (Class2_Sub7_Sub9_Sub2) this.aClass290_10.method6680(); local126 != null; local126 = (Class2_Sub7_Sub9_Sub2) this.aClass290_10.method6673()) {
				this.aClass2_Sub17_7.anInt3378 = 0;
				this.aClass2_Sub17_7.method2837(0);
				this.aClass2_Sub17_7.method2848((int) local126.aLong260);
				this.aClass367_2.method8567(4, this.aClass2_Sub17_7.aByteArray26);
				this.aClass290_11.method6678(local126);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(175) int local175 = this.aClass367_2.method8570();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt8637 = 0;
				@Pc(188) byte local188 = 0;
				if (this.aClass2_Sub7_Sub9_Sub2_2 == null) {
					local188 = 8;
				} else if (this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 == 0) {
					local188 = 1;
				}
				@Pc(213) int local213;
				@Pc(237) int local237;
				@Pc(302) int local302;
				if (local188 > 0) {
					local213 = local188 - this.aClass2_Sub17_8.anInt3378;
					if (local213 > local175) {
						local213 = local175;
					}
					this.aClass367_2.method8568(this.aClass2_Sub17_8.anInt3378, this.aClass2_Sub17_8.aByteArray26, local213);
					if (this.aByte124 != 0) {
						for (local237 = 0; local237 < local213; local237++) {
							this.aClass2_Sub17_8.aByteArray26[local237 + this.aClass2_Sub17_8.anInt3378] ^= this.aByte124;
						}
					}
					this.aClass2_Sub17_8.anInt3378 += local213;
					if (local188 <= this.aClass2_Sub17_8.anInt3378) {
						if (this.aClass2_Sub7_Sub9_Sub2_2 == null) {
							this.aClass2_Sub17_8.anInt3378 = 0;
							local237 = this.aClass2_Sub17_8.method2859();
							local302 = this.aClass2_Sub17_8.method2825();
							@Pc(307) int local307 = this.aClass2_Sub17_8.method2859();
							@Pc(314) int local314 = this.aClass2_Sub17_8.method2881();
							@Pc(318) int local318 = local307 & 0x7F;
							@Pc(326) boolean local326 = (local307 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local237 << 16) + local302);
							@Pc(343) Class2_Sub7_Sub9_Sub2 local343;
							if (local326) {
								for (local343 = (Class2_Sub7_Sub9_Sub2) this.aClass290_11.method6680(); local343 != null && local343.aLong260 != local333; local343 = (Class2_Sub7_Sub9_Sub2) this.aClass290_11.method6673()) {
								}
							} else {
								for (local343 = (Class2_Sub7_Sub9_Sub2) this.aClass290_9.method6680(); local343 != null && local343.aLong260 != local333; local343 = (Class2_Sub7_Sub9_Sub2) this.aClass290_9.method6673()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							@Pc(401) int local401 = local318 == 0 ? 5 : 9;
							this.aClass2_Sub7_Sub9_Sub2_2 = local343;
							this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9 = new Class2_Sub17(this.aClass2_Sub7_Sub9_Sub2_2.aByte127 + local314 + local401);
							this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.method2837(local318);
							this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.method2827(local314);
							this.aClass2_Sub17_8.anInt3378 = 0;
							this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 = 8;
						} else if (this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub17_8.aByteArray26[0] == -1) {
							this.aClass2_Sub17_8.anInt3378 = 0;
							this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 = 1;
						} else {
							this.aClass2_Sub7_Sub9_Sub2_2 = null;
						}
					}
				} else {
					local213 = this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.aByteArray26.length - this.aClass2_Sub7_Sub9_Sub2_2.aByte127;
					local237 = 512 - this.aClass2_Sub7_Sub9_Sub2_2.anInt9374;
					if (local213 - this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.anInt3378 < local237) {
						local237 = local213 - this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.anInt3378;
					}
					if (local237 > local175) {
						local237 = local175;
					}
					this.aClass367_2.method8568(this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.anInt3378, this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.aByteArray26, local237);
					if (this.aByte124 != 0) {
						for (local302 = 0; local302 < local237; local302++) {
							this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.aByteArray26[local302 + this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.anInt3378] ^= this.aByte124;
						}
					}
					this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.anInt3378 += local237;
					this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 += local237;
					if (this.aClass2_Sub7_Sub9_Sub2_2.aClass2_Sub17_9.anInt3378 == local213) {
						this.aClass2_Sub7_Sub9_Sub2_2.method8504();
						this.aClass2_Sub7_Sub9_Sub2_2.aBoolean672 = false;
						this.aClass2_Sub7_Sub9_Sub2_2 = null;
					} else if (this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 == 512) {
						this.aClass2_Sub7_Sub9_Sub2_2.anInt9374 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(624) IOException local624) {
			try {
				this.aClass367_2.method8569();
			} catch (@Pc(630) Exception local630) {
			}
			this.anInt8638++;
			this.anInt8639 = -2;
			this.aClass367_2 = null;
			return this.method7436() == 0 && this.method7438() == 0;
		}
	}

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "(I)V")
	private void method7440() {
		if (this.aClass367_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub17_7.anInt3378 = 0;
			this.aClass2_Sub17_7.method2837(6);
			this.aClass2_Sub17_7.method2848(3);
			this.aClass367_2.method8567(4, this.aClass2_Sub17_7.aByteArray26);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass367_2.method8569();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt8638++;
			this.anInt8639 = -2;
			this.aClass367_2 = null;
		}
	}

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "(I)V")
	public void method7441() {
		try {
			this.aClass367_2.method8569();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass367_2 = null;
		this.aByte124 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt8638++;
		this.anInt8639 = -1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZI)V")
	public void method7442(@OriginalArg(0) boolean arg0) {
		if (this.aClass367_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub17_7.anInt3378 = 0;
			this.aClass2_Sub17_7.method2837(arg0 ? 2 : 3);
			this.aClass2_Sub17_7.method2848(0);
			this.aClass367_2.method8567(4, this.aClass2_Sub17_7.aByteArray26);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass367_2.method8569();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt8638++;
			this.aClass367_2 = null;
			this.anInt8639 = -2;
		}
	}
}
