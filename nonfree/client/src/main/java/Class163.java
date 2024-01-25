import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class163 {

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	private int anInt4854;

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "Lclient!as;")
	private Class16 aClass16_4;

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "Lclient!qn;")
	private Class3_Sub7_Sub17_Sub2 aClass3_Sub7_Sub17_Sub2_2;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Lclient!tr;")
	private final Class195 aClass195_4 = new Class195();

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Lclient!tr;")
	private final Class195 aClass195_5 = new Class195();

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "Lclient!tr;")
	private final Class195 aClass195_6 = new Class195();

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Lclient!tr;")
	private final Class195 aClass195_7 = new Class195();

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "Lclient!fb;")
	private final Class3_Sub4 aClass3_Sub4_5 = new Class3_Sub4(4);

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
	public volatile int anInt4855 = 0;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "B")
	private byte aByte44 = 0;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
	public volatile int anInt4856 = 0;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "Lclient!fb;")
	private final Class3_Sub4 aClass3_Sub4_6 = new Class3_Sub4(8);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	public boolean method4165() {
		return this.method4170() >= 20;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)I")
	public int method4166() {
		return this.aClass195_4.method5209() + this.aClass195_5.method5209();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BIZIB)Lclient!qn;")
	public Class3_Sub7_Sub17_Sub2 method4167(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg1);
		@Pc(14) Class3_Sub7_Sub17_Sub2 local14 = new Class3_Sub7_Sub17_Sub2();
		local14.aByte50 = arg0;
		local14.aLong198 = local10;
		local14.aBoolean299 = arg2;
		if (arg2) {
			if (this.method4166() >= 20) {
				throw new RuntimeException();
			}
			this.aClass195_4.method5213(local14);
		} else if (this.method4170() < 20) {
			this.aClass195_6.method5213(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Z")
	public boolean method4168() {
		return this.method4166() >= 20;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	public void method4169() {
		if (this.aClass16_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub4_5.anInt4268 = 0;
			this.aClass3_Sub4_5.method3614(7);
			this.aClass3_Sub4_5.method3644(0);
			this.aClass16_4.method397(this.aClass3_Sub4_5.aByteArray70, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass16_4.method392();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass16_4 = null;
			this.anInt4855++;
			this.anInt4856 = -2;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I")
	private int method4170() {
		return this.aClass195_6.method5209() + this.aClass195_7.method5209();
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V")
	public void method4171() {
		if (this.aClass16_4 != null) {
			this.aClass16_4.method392();
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Z")
	public boolean method4172() {
		@Pc(18) int local18;
		if (this.aClass16_4 != null) {
			@Pc(11) long local11 = Static53.method898();
			local18 = (int) (local11 - this.aLong158);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong158 = local11;
			this.anInt4854 += local18;
			if (this.anInt4854 > 30000) {
				try {
					this.aClass16_4.method392();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass16_4 = null;
			}
		}
		if (this.aClass16_4 == null) {
			return this.method4166() == 0 && this.method4170() == 0;
		}
		try {
			this.aClass16_4.method399();
			for (@Pc(86) Class3_Sub7_Sub17_Sub2 local86 = (Class3_Sub7_Sub17_Sub2) this.aClass195_4.method5216(); local86 != null; local86 = (Class3_Sub7_Sub17_Sub2) this.aClass195_4.method5210()) {
				this.aClass3_Sub4_5.anInt4268 = 0;
				this.aClass3_Sub4_5.method3614(1);
				this.aClass3_Sub4_5.method3644((int) local86.aLong198);
				this.aClass16_4.method397(this.aClass3_Sub4_5.aByteArray70, 4);
				this.aClass195_5.method5213(local86);
			}
			for (@Pc(134) Class3_Sub7_Sub17_Sub2 local134 = (Class3_Sub7_Sub17_Sub2) this.aClass195_6.method5216(); local134 != null; local134 = (Class3_Sub7_Sub17_Sub2) this.aClass195_6.method5210()) {
				this.aClass3_Sub4_5.anInt4268 = 0;
				this.aClass3_Sub4_5.method3614(0);
				this.aClass3_Sub4_5.method3644((int) local134.aLong198);
				this.aClass16_4.method397(this.aClass3_Sub4_5.aByteArray70, 4);
				this.aClass195_7.method5213(local134);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(187) int local187 = this.aClass16_4.method391();
				if (local187 < 0) {
					throw new IOException();
				}
				if (local187 == 0) {
					break;
				}
				this.anInt4854 = 0;
				@Pc(203) byte local203 = 0;
				if (this.aClass3_Sub7_Sub17_Sub2_2 == null) {
					local203 = 8;
				} else if (this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 == 0) {
					local203 = 1;
				}
				@Pc(229) int local229;
				@Pc(236) int local236;
				@Pc(275) int local275;
				if (local203 <= 0) {
					local229 = this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.aByteArray70.length - this.aClass3_Sub7_Sub17_Sub2_2.aByte50;
					local236 = 512 - this.aClass3_Sub7_Sub17_Sub2_2.anInt5180;
					if (local229 - this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.anInt4268 < local236) {
						local236 = local229 - this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.anInt4268;
					}
					if (local236 > local187) {
						local236 = local187;
					}
					this.aClass16_4.method398(this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.aByteArray70, this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.anInt4268, local236);
					if (this.aByte44 != 0) {
						for (local275 = 0; local275 < local236; local275++) {
							this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.aByteArray70[this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.anInt4268 + local275] ^= this.aByte44;
						}
					}
					this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.anInt4268 += local236;
					this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 += local236;
					if (local229 == this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.anInt4268) {
						this.aClass3_Sub7_Sub17_Sub2_2.method5385();
						this.aClass3_Sub7_Sub17_Sub2_2.aBoolean300 = false;
						this.aClass3_Sub7_Sub17_Sub2_2 = null;
					} else if (this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 == 512) {
						this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 = 0;
					}
				} else {
					local229 = local203 - this.aClass3_Sub4_6.anInt4268;
					if (local187 < local229) {
						local229 = local187;
					}
					this.aClass16_4.method398(this.aClass3_Sub4_6.aByteArray70, this.aClass3_Sub4_6.anInt4268, local229);
					if (this.aByte44 != 0) {
						for (local236 = 0; local236 < local229; local236++) {
							this.aClass3_Sub4_6.aByteArray70[this.aClass3_Sub4_6.anInt4268 + local236] ^= this.aByte44;
						}
					}
					this.aClass3_Sub4_6.anInt4268 += local229;
					if (local203 <= this.aClass3_Sub4_6.anInt4268) {
						if (this.aClass3_Sub7_Sub17_Sub2_2 == null) {
							this.aClass3_Sub4_6.anInt4268 = 0;
							local236 = this.aClass3_Sub4_6.method3643();
							local275 = this.aClass3_Sub4_6.method3649();
							@Pc(453) int local453 = this.aClass3_Sub4_6.method3643();
							@Pc(460) int local460 = this.aClass3_Sub4_6.method3642();
							@Pc(464) int local464 = local453 & 0x7F;
							@Pc(475) boolean local475 = (local453 & 0x80) != 0;
							@Pc(482) long local482 = (long) (local275 + (local236 << 16));
							@Pc(492) Class3_Sub7_Sub17_Sub2 local492;
							if (local475) {
								for (local492 = (Class3_Sub7_Sub17_Sub2) this.aClass195_7.method5216(); local492 != null && local492.aLong198 != local482; local492 = (Class3_Sub7_Sub17_Sub2) this.aClass195_7.method5210()) {
								}
							} else {
								for (local492 = (Class3_Sub7_Sub17_Sub2) this.aClass195_5.method5216(); local492 != null && local492.aLong198 != local482; local492 = (Class3_Sub7_Sub17_Sub2) this.aClass195_5.method5210()) {
								}
							}
							if (local492 == null) {
								throw new IOException();
							}
							@Pc(549) int local549 = local464 == 0 ? 5 : 9;
							this.aClass3_Sub7_Sub17_Sub2_2 = local492;
							this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7 = new Class3_Sub4(this.aClass3_Sub7_Sub17_Sub2_2.aByte50 + local549 + local460);
							this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.method3614(local464);
							this.aClass3_Sub7_Sub17_Sub2_2.aClass3_Sub4_7.method3650(local460);
							this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 = 8;
							this.aClass3_Sub4_6.anInt4268 = 0;
						} else if (this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub4_6.aByteArray70[0] == -1) {
							this.aClass3_Sub7_Sub17_Sub2_2.anInt5180 = 1;
							this.aClass3_Sub4_6.anInt4268 = 0;
						} else {
							this.aClass3_Sub7_Sub17_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass16_4.method392();
			} catch (@Pc(633) Exception local633) {
			}
			this.anInt4856 = -2;
			this.anInt4855++;
			this.aClass16_4 = null;
			return this.method4166() == 0 && this.method4170() == 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
	public void method4173() {
		try {
			this.aClass16_4.method392();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt4855++;
		this.anInt4856 = -1;
		this.aByte44 = (byte) (Math.random() * 255.0D + (double) 1);
		this.aClass16_4 = null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
	public void method4174(@OriginalArg(0) boolean arg0) {
		if (this.aClass16_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub4_5.anInt4268 = 0;
			this.aClass3_Sub4_5.method3614(arg0 ? 2 : 3);
			this.aClass3_Sub4_5.method3644(0);
			this.aClass16_4.method397(this.aClass3_Sub4_5.aByteArray70, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass16_4.method392();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass16_4 = null;
			this.anInt4856 = -2;
			this.anInt4855++;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!as;Z)V")
	public void method4176(@OriginalArg(1) Class16 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass16_4 != null) {
			try {
				this.aClass16_4.method392();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass16_4 = null;
		}
		this.aClass16_4 = arg0;
		this.method4178();
		this.method4174(arg1);
		this.aClass3_Sub7_Sub17_Sub2_2 = null;
		this.aClass3_Sub4_6.anInt4268 = 0;
		while (true) {
			@Pc(47) Class3_Sub7_Sub17_Sub2 local47 = (Class3_Sub7_Sub17_Sub2) this.aClass195_5.method5208();
			if (local47 == null) {
				while (true) {
					local47 = (Class3_Sub7_Sub17_Sub2) this.aClass195_7.method5208();
					if (local47 == null) {
						if (this.aByte44 != 0) {
							try {
								this.aClass3_Sub4_5.anInt4268 = 0;
								this.aClass3_Sub4_5.method3614(4);
								this.aClass3_Sub4_5.method3614(this.aByte44);
								this.aClass3_Sub4_5.method3660(0);
								this.aClass16_4.method397(this.aClass3_Sub4_5.aByteArray70, 4);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass16_4.method392();
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass16_4 = null;
								this.anInt4856 = -2;
								this.anInt4855++;
							}
						}
						this.anInt4854 = 0;
						this.aLong158 = Static53.method898();
						return;
					}
					this.aClass195_6.method5213(local47);
				}
			}
			this.aClass195_4.method5213(local47);
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)V")
	public void method4177() {
		if (this.aClass16_4 != null) {
			this.aClass16_4.method395();
		}
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V")
	private void method4178() {
		if (this.aClass16_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub4_5.anInt4268 = 0;
			this.aClass3_Sub4_5.method3614(6);
			this.aClass3_Sub4_5.method3644(3);
			this.aClass16_4.method397(this.aClass3_Sub4_5.aByteArray70, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass16_4.method392();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4855++;
			this.aClass16_4 = null;
			this.anInt4856 = -2;
		}
	}
}
