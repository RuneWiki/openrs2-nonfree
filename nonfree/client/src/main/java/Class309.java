import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class309 {

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "Lclient!wha;")
	private Class374 aClass374_2;

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
	private int anInt8591;

	@OriginalMember(owner = "client!rt", name = "x", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!rt", name = "C", descriptor = "Lclient!vea;")
	private Class5_Sub5_Sub8_Sub2 aClass5_Sub5_Sub8_Sub2_2;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!vu;")
	private final Class368 aClass368_7 = new Class368();

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "Lclient!vu;")
	private final Class368 aClass368_8 = new Class368();

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Lclient!vu;")
	private final Class368 aClass368_9 = new Class368();

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "Lclient!vu;")
	private final Class368 aClass368_10 = new Class368();

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "Lclient!ofa;")
	private final Class5_Sub22 aClass5_Sub22_14 = new Class5_Sub22(4);

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
	public volatile int anInt8593 = 0;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
	public volatile int anInt8592 = 0;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "B")
	private byte aByte120 = 0;

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "Lclient!ofa;")
	private final Class5_Sub22 aClass5_Sub22_15 = new Class5_Sub22(8);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZIIBI)Lclient!vea;")
	public Class5_Sub5_Sub8_Sub2 method7409(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg1);
		@Pc(14) Class5_Sub5_Sub8_Sub2 local14 = new Class5_Sub5_Sub8_Sub2();
		local14.aBoolean707 = arg0;
		local14.aLong274 = local10;
		local14.aByte129 = arg2;
		if (arg0) {
			if (this.method7416() >= 20) {
				throw new RuntimeException();
			}
			this.aClass368_7.method8709(local14);
		} else if (this.method7423() < 20) {
			this.aClass368_9.method8709(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Z")
	public boolean method7411() {
		return this.method7423() >= 20;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZILclient!wha;)V")
	public void method7412(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class374 arg1) {
		if (this.aClass374_2 != null) {
			try {
				this.aClass374_2.method8905();
			} catch (@Pc(19) Exception local19) {
			}
			this.aClass374_2 = null;
		}
		this.aClass374_2 = arg1;
		this.method7415();
		this.method7420(arg0);
		this.aClass5_Sub22_15.anInt6629 = 0;
		this.aClass5_Sub5_Sub8_Sub2_2 = null;
		while (true) {
			@Pc(45) Class5_Sub5_Sub8_Sub2 local45 = (Class5_Sub5_Sub8_Sub2) this.aClass368_8.method8705();
			if (local45 == null) {
				while (true) {
					local45 = (Class5_Sub5_Sub8_Sub2) this.aClass368_10.method8705();
					if (local45 == null) {
						if (this.aByte120 != 0) {
							try {
								this.aClass5_Sub22_14.anInt6629 = 0;
								this.aClass5_Sub22_14.method5905(4);
								this.aClass5_Sub22_14.method5905(this.aByte120);
								this.aClass5_Sub22_14.method5918(0);
								this.aClass374_2.method8911(this.aClass5_Sub22_14.aByteArray71, 4);
							} catch (@Pc(107) IOException local107) {
								try {
									this.aClass374_2.method8905();
								} catch (@Pc(113) Exception local113) {
								}
								this.aClass374_2 = null;
								this.anInt8593++;
								this.anInt8592 = -2;
							}
						}
						this.anInt8591 = 0;
						this.aLong212 = Static95.method1587();
						return;
					}
					this.aClass368_9.method8709(local45);
				}
			}
			this.aClass368_7.method8709(local45);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Z")
	public boolean method7413() {
		return this.method7416() >= 20;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
	public void method7414() {
		if (this.aClass374_2 != null) {
			this.aClass374_2.method8909();
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
	private void method7415() {
		if (this.aClass374_2 == null) {
			return;
		}
		try {
			this.aClass5_Sub22_14.anInt6629 = 0;
			this.aClass5_Sub22_14.method5905(6);
			this.aClass5_Sub22_14.method5929(3);
			this.aClass374_2.method8911(this.aClass5_Sub22_14.aByteArray71, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass374_2.method8905();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt8592 = -2;
			this.anInt8593++;
			this.aClass374_2 = null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I")
	public int method7416() {
		return this.aClass368_7.method8711() + this.aClass368_8.method8711();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V")
	public void method7417() {
		try {
			this.aClass374_2.method8905();
		} catch (@Pc(15) Exception local15) {
		}
		this.aClass374_2 = null;
		this.anInt8592 = -1;
		this.anInt8593++;
		this.aByte120 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
	public void method7418() {
		if (this.aClass374_2 != null) {
			this.aClass374_2.method8905();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BZ)V")
	public void method7420(@OriginalArg(1) boolean arg0) {
		if (this.aClass374_2 == null) {
			return;
		}
		try {
			this.aClass5_Sub22_14.anInt6629 = 0;
			this.aClass5_Sub22_14.method5905(arg0 ? 2 : 3);
			this.aClass5_Sub22_14.method5929(0);
			this.aClass374_2.method8911(this.aClass5_Sub22_14.aByteArray71, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass374_2.method8905();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass374_2 = null;
			this.anInt8592 = -2;
			this.anInt8593++;
		}
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)Z")
	public boolean method7421() {
		@Pc(16) int local16;
		if (this.aClass374_2 != null) {
			@Pc(9) long local9 = Static95.method1587();
			local16 = (int) (local9 - this.aLong212);
			if (local16 > 200) {
				local16 = 200;
			}
			this.aLong212 = local9;
			this.anInt8591 += local16;
			if (this.anInt8591 > 30000) {
				try {
					this.aClass374_2.method8905();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass374_2 = null;
			}
		}
		if (this.aClass374_2 == null) {
			return this.method7416() == 0 && this.method7423() == 0;
		}
		try {
			this.aClass374_2.method8914();
			for (@Pc(78) Class5_Sub5_Sub8_Sub2 local78 = (Class5_Sub5_Sub8_Sub2) this.aClass368_7.method8702(); local78 != null; local78 = (Class5_Sub5_Sub8_Sub2) this.aClass368_7.method8710()) {
				this.aClass5_Sub22_14.anInt6629 = 0;
				this.aClass5_Sub22_14.method5905(1);
				this.aClass5_Sub22_14.method5929((int) local78.aLong274);
				this.aClass374_2.method8911(this.aClass5_Sub22_14.aByteArray71, 4);
				this.aClass368_8.method8709(local78);
			}
			for (@Pc(124) Class5_Sub5_Sub8_Sub2 local124 = (Class5_Sub5_Sub8_Sub2) this.aClass368_9.method8702(); local124 != null; local124 = (Class5_Sub5_Sub8_Sub2) this.aClass368_9.method8710()) {
				this.aClass5_Sub22_14.anInt6629 = 0;
				this.aClass5_Sub22_14.method5905(0);
				this.aClass5_Sub22_14.method5929((int) local124.aLong274);
				this.aClass374_2.method8911(this.aClass5_Sub22_14.aByteArray71, 4);
				this.aClass368_10.method8709(local124);
			}
			for (local16 = 0; local16 < 100; local16++) {
				@Pc(177) int local177 = this.aClass374_2.method8913();
				if (local177 < 0) {
					throw new IOException();
				}
				if (local177 == 0) {
					break;
				}
				this.anInt8591 = 0;
				@Pc(193) byte local193 = 0;
				if (this.aClass5_Sub5_Sub8_Sub2_2 == null) {
					local193 = 8;
				} else if (this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 == 0) {
					local193 = 1;
				}
				@Pc(222) int local222;
				@Pc(229) int local229;
				@Pc(268) int local268;
				if (local193 <= 0) {
					local222 = this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.aByteArray71.length - this.aClass5_Sub5_Sub8_Sub2_2.aByte129;
					local229 = 512 - this.aClass5_Sub5_Sub8_Sub2_2.anInt9921;
					if (local229 > local222 - this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.anInt6629) {
						local229 = local222 - this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.anInt6629;
					}
					if (local177 < local229) {
						local229 = local177;
					}
					this.aClass374_2.method8906(local229, this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.anInt6629, this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.aByteArray71);
					if (this.aByte120 != 0) {
						for (local268 = 0; local268 < local229; local268++) {
							this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.aByteArray71[local268 + this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.anInt6629] ^= this.aByte120;
						}
					}
					this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 += local229;
					this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.anInt6629 += local229;
					if (this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.anInt6629 == local222) {
						this.aClass5_Sub5_Sub8_Sub2_2.method8952();
						this.aClass5_Sub5_Sub8_Sub2_2.aBoolean706 = false;
						this.aClass5_Sub5_Sub8_Sub2_2 = null;
					} else if (this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 == 512) {
						this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 = 0;
					}
				} else {
					local222 = local193 - this.aClass5_Sub22_15.anInt6629;
					if (local222 > local177) {
						local222 = local177;
					}
					this.aClass374_2.method8906(local222, this.aClass5_Sub22_15.anInt6629, this.aClass5_Sub22_15.aByteArray71);
					if (this.aByte120 != 0) {
						for (local229 = 0; local229 < local222; local229++) {
							this.aClass5_Sub22_15.aByteArray71[this.aClass5_Sub22_15.anInt6629 + local229] = (byte) (this.aClass5_Sub22_15.aByteArray71[this.aClass5_Sub22_15.anInt6629 + local229] ^ this.aByte120);
						}
					}
					this.aClass5_Sub22_15.anInt6629 += local222;
					if (this.aClass5_Sub22_15.anInt6629 >= local193) {
						if (this.aClass5_Sub5_Sub8_Sub2_2 == null) {
							this.aClass5_Sub22_15.anInt6629 = 0;
							local229 = this.aClass5_Sub22_15.method5966();
							local268 = this.aClass5_Sub22_15.method5968();
							@Pc(445) int local445 = this.aClass5_Sub22_15.method5966();
							@Pc(450) int local450 = this.aClass5_Sub22_15.method5913();
							@Pc(454) int local454 = local445 & 0x7F;
							@Pc(462) boolean local462 = (local445 & 0x80) != 0;
							@Pc(469) long local469 = (long) (local268 + (local229 << 16));
							@Pc(479) Class5_Sub5_Sub8_Sub2 local479;
							if (local462) {
								for (local479 = (Class5_Sub5_Sub8_Sub2) this.aClass368_10.method8702(); local479 != null && local469 != local479.aLong274; local479 = (Class5_Sub5_Sub8_Sub2) this.aClass368_10.method8710()) {
								}
							} else {
								for (local479 = (Class5_Sub5_Sub8_Sub2) this.aClass368_8.method8702(); local479 != null && local479.aLong274 != local469; local479 = (Class5_Sub5_Sub8_Sub2) this.aClass368_8.method8710()) {
								}
							}
							if (local479 == null) {
								throw new IOException();
							}
							@Pc(545) int local545 = local454 == 0 ? 5 : 9;
							this.aClass5_Sub5_Sub8_Sub2_2 = local479;
							this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16 = new Class5_Sub22(local450 + local545 + this.aClass5_Sub5_Sub8_Sub2_2.aByte129);
							this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.method5905(local454);
							this.aClass5_Sub5_Sub8_Sub2_2.aClass5_Sub22_16.method5949(local450);
							this.aClass5_Sub22_15.anInt6629 = 0;
							this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 = 8;
						} else if (this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub22_15.aByteArray71[0] == -1) {
							this.aClass5_Sub22_15.anInt6629 = 0;
							this.aClass5_Sub5_Sub8_Sub2_2.anInt9921 = 1;
						} else {
							this.aClass5_Sub5_Sub8_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(632) IOException local632) {
			try {
				this.aClass374_2.method8905();
			} catch (@Pc(638) Exception local638) {
			}
			this.anInt8592 = -2;
			this.aClass374_2 = null;
			this.anInt8593++;
			return this.method7416() == 0 && this.method7423() == 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V")
	public void method7422() {
		if (this.aClass374_2 == null) {
			return;
		}
		try {
			this.aClass5_Sub22_14.anInt6629 = 0;
			this.aClass5_Sub22_14.method5905(7);
			this.aClass5_Sub22_14.method5929(0);
			this.aClass374_2.method8911(this.aClass5_Sub22_14.aByteArray71, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass374_2.method8905();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass374_2 = null;
			this.anInt8593++;
			this.anInt8592 = -2;
		}
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)I")
	private int method7423() {
		return this.aClass368_9.method8711() + this.aClass368_10.method8711();
	}
}
