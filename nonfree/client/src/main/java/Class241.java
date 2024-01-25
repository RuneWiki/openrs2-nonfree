import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class241 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
	private int anInt6267;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "Lclient!gl;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "Lclient!sv;")
	private Class5_Sub1_Sub4_Sub2 aClass5_Sub1_Sub4_Sub2_1;

	@OriginalMember(owner = "client!mo", name = "B", descriptor = "Lclient!wca;")
	private final Class388 aClass388_8 = new Class388();

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "Lclient!wca;")
	private final Class388 aClass388_9 = new Class388();

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "Lclient!wca;")
	private final Class388 aClass388_10 = new Class388();

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "Lclient!wca;")
	private final Class388 aClass388_11 = new Class388();

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Lclient!wq;")
	private final Class5_Sub36 aClass5_Sub36_2 = new Class5_Sub36(4);

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	public volatile int anInt6269 = 0;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
	public volatile int anInt6268 = 0;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "B")
	private byte aByte87 = 0;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "Lclient!wq;")
	private final Class5_Sub36 aClass5_Sub36_3 = new Class5_Sub36(8);

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BZ)V")
	public void method5529(@OriginalArg(1) boolean arg0) {
		if (this.aClass136_2 == null) {
			return;
		}
		try {
			this.aClass5_Sub36_2.anInt8456 = 0;
			this.aClass5_Sub36_2.method7324(arg0 ? 2 : 3);
			this.aClass5_Sub36_2.method7317(0);
			this.aClass136_2.method3206(this.aClass5_Sub36_2.aByteArray89, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass136_2.method3207();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt6269++;
			this.anInt6268 = -2;
			this.aClass136_2 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLclient!gl;)V")
	public void method5530(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class136 arg1) {
		if (this.aClass136_2 != null) {
			try {
				this.aClass136_2.method3207();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass136_2 = null;
		}
		this.aClass136_2 = arg1;
		this.method5537();
		this.method5529(arg0);
		this.aClass5_Sub36_3.anInt8456 = 0;
		this.aClass5_Sub1_Sub4_Sub2_1 = null;
		while (true) {
			@Pc(47) Class5_Sub1_Sub4_Sub2 local47 = (Class5_Sub1_Sub4_Sub2) this.aClass388_9.method9029();
			if (local47 == null) {
				while (true) {
					local47 = (Class5_Sub1_Sub4_Sub2) this.aClass388_11.method9029();
					if (local47 == null) {
						if (this.aByte87 != 0) {
							try {
								this.aClass5_Sub36_2.anInt8456 = 0;
								this.aClass5_Sub36_2.method7324(4);
								this.aClass5_Sub36_2.method7324(this.aByte87);
								this.aClass5_Sub36_2.method7296(0);
								this.aClass136_2.method3206(this.aClass5_Sub36_2.aByteArray89, 4);
							} catch (@Pc(119) IOException local119) {
								try {
									this.aClass136_2.method3207();
								} catch (@Pc(127) Exception local127) {
								}
								this.anInt6269++;
								this.aClass136_2 = null;
								this.anInt6268 = -2;
							}
						}
						this.anInt6267 = 0;
						this.aLong182 = Static480.method6763();
						return;
					}
					this.aClass388_10.method9022(local47);
				}
			}
			this.aClass388_8.method9022(local47);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIBIZ)Lclient!sv;")
	public Class5_Sub1_Sub4_Sub2 method5532(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(18) long local18 = (long) (arg2 + (arg0 << 16));
		@Pc(22) Class5_Sub1_Sub4_Sub2 local22 = new Class5_Sub1_Sub4_Sub2();
		local22.aLong298 = local18;
		local22.aByte126 = arg1;
		local22.aBoolean587 = arg3;
		if (arg3) {
			if (this.method5541() >= 20) {
				throw new RuntimeException();
			}
			this.aClass388_8.method9022(local22);
		} else if (this.method5536() < 20) {
			this.aClass388_10.method9022(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public void method5533() {
		if (this.aClass136_2 != null) {
			this.aClass136_2.method3210();
		}
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)Z")
	public boolean method5534() {
		if (this.aClass136_2 != null) {
			@Pc(11) long local11 = Static480.method6763();
			@Pc(18) int local18 = (int) (local11 - this.aLong182);
			this.aLong182 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt6267 += local18;
			if (this.anInt6267 > 30000) {
				try {
					this.aClass136_2.method3207();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass136_2 = null;
			}
		}
		if (this.aClass136_2 == null) {
			return this.method5541() == 0 && this.method5536() == 0;
		}
		try {
			this.aClass136_2.method3209();
			for (@Pc(78) Class5_Sub1_Sub4_Sub2 local78 = (Class5_Sub1_Sub4_Sub2) this.aClass388_8.method9027(); local78 != null; local78 = (Class5_Sub1_Sub4_Sub2) this.aClass388_8.method9024()) {
				this.aClass5_Sub36_2.anInt8456 = 0;
				this.aClass5_Sub36_2.method7324(1);
				this.aClass5_Sub36_2.method7317((int) local78.aLong298);
				this.aClass136_2.method3206(this.aClass5_Sub36_2.aByteArray89, 4);
				this.aClass388_9.method9022(local78);
			}
			for (@Pc(134) Class5_Sub1_Sub4_Sub2 local134 = (Class5_Sub1_Sub4_Sub2) this.aClass388_10.method9027(); local134 != null; local134 = (Class5_Sub1_Sub4_Sub2) this.aClass388_10.method9024()) {
				this.aClass5_Sub36_2.anInt8456 = 0;
				this.aClass5_Sub36_2.method7324(0);
				this.aClass5_Sub36_2.method7317((int) local134.aLong298);
				this.aClass136_2.method3206(this.aClass5_Sub36_2.aByteArray89, 4);
				this.aClass388_11.method9022(local134);
			}
			for (@Pc(180) int local180 = 0; local180 < 100; local180++) {
				@Pc(191) int local191 = this.aClass136_2.method3205();
				if (local191 < 0) {
					throw new IOException();
				}
				if (local191 == 0) {
					break;
				}
				this.anInt6267 = 0;
				@Pc(207) byte local207 = 0;
				if (this.aClass5_Sub1_Sub4_Sub2_1 == null) {
					local207 = 8;
				} else if (this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 == 0) {
					local207 = 1;
				}
				@Pc(230) int local230;
				@Pc(255) int local255;
				@Pc(318) int local318;
				if (local207 > 0) {
					local230 = local207 - this.aClass5_Sub36_3.anInt8456;
					if (local191 < local230) {
						local230 = local191;
					}
					this.aClass136_2.method3211(local230, this.aClass5_Sub36_3.aByteArray89, this.aClass5_Sub36_3.anInt8456);
					if (this.aByte87 != 0) {
						for (local255 = 0; local255 < local230; local255++) {
							this.aClass5_Sub36_3.aByteArray89[this.aClass5_Sub36_3.anInt8456 + local255] ^= this.aByte87;
						}
					}
					this.aClass5_Sub36_3.anInt8456 += local230;
					if (local207 <= this.aClass5_Sub36_3.anInt8456) {
						if (this.aClass5_Sub1_Sub4_Sub2_1 == null) {
							this.aClass5_Sub36_3.anInt8456 = 0;
							local255 = this.aClass5_Sub36_3.method7291();
							local318 = this.aClass5_Sub36_3.method7333();
							@Pc(323) int local323 = this.aClass5_Sub36_3.method7291();
							@Pc(328) int local328 = this.aClass5_Sub36_3.method7268();
							@Pc(332) int local332 = local323 & 0x7F;
							@Pc(344) boolean local344 = (local323 & 0x80) != 0;
							@Pc(352) long local352 = (long) ((local255 << 16) + local318);
							@Pc(362) Class5_Sub1_Sub4_Sub2 local362;
							if (local344) {
								for (local362 = (Class5_Sub1_Sub4_Sub2) this.aClass388_11.method9027(); local362 != null && local352 != local362.aLong298; local362 = (Class5_Sub1_Sub4_Sub2) this.aClass388_11.method9024()) {
								}
							} else {
								for (local362 = (Class5_Sub1_Sub4_Sub2) this.aClass388_9.method9027(); local362 != null && local352 != local362.aLong298; local362 = (Class5_Sub1_Sub4_Sub2) this.aClass388_9.method9024()) {
								}
							}
							if (local362 == null) {
								throw new IOException();
							}
							@Pc(438) int local438 = local332 == 0 ? 5 : 9;
							this.aClass5_Sub1_Sub4_Sub2_1 = local362;
							this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8 = new Class5_Sub36(this.aClass5_Sub1_Sub4_Sub2_1.aByte126 + local438 + local328);
							this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.method7324(local332);
							this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.method7287(local328);
							this.aClass5_Sub36_3.anInt8456 = 0;
							this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 = 8;
						} else if (this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub36_3.aByteArray89[0] == -1) {
							this.aClass5_Sub36_3.anInt8456 = 0;
							this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 = 1;
						} else {
							this.aClass5_Sub1_Sub4_Sub2_1 = null;
						}
					}
				} else {
					local230 = this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.aByteArray89.length - this.aClass5_Sub1_Sub4_Sub2_1.aByte126;
					local255 = 512 - this.aClass5_Sub1_Sub4_Sub2_1.anInt8871;
					if (local255 > local230 - this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.anInt8456) {
						local255 = local230 - this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.anInt8456;
					}
					if (local255 > local191) {
						local255 = local191;
					}
					this.aClass136_2.method3211(local255, this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.aByteArray89, this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.anInt8456);
					if (this.aByte87 != 0) {
						for (local318 = 0; local318 < local255; local318++) {
							this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.aByteArray89[local318 + this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.anInt8456] ^= this.aByte87;
						}
					}
					this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 += local255;
					this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.anInt8456 += local255;
					if (local230 == this.aClass5_Sub1_Sub4_Sub2_1.aClass5_Sub36_8.anInt8456) {
						this.aClass5_Sub1_Sub4_Sub2_1.method8955();
						this.aClass5_Sub1_Sub4_Sub2_1.aBoolean589 = false;
						this.aClass5_Sub1_Sub4_Sub2_1 = null;
					} else if (this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 == 512) {
						this.aClass5_Sub1_Sub4_Sub2_1.anInt8871 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(678) IOException local678) {
			try {
				this.aClass136_2.method3207();
			} catch (@Pc(684) Exception local684) {
			}
			this.aClass136_2 = null;
			this.anInt6268 = -2;
			this.anInt6269++;
			return this.method5541() == 0 && this.method5536() == 0;
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)I")
	private int method5536() {
		return this.aClass388_10.method9026() + this.aClass388_11.method9026();
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V")
	private void method5537() {
		if (this.aClass136_2 == null) {
			return;
		}
		try {
			this.aClass5_Sub36_2.anInt8456 = 0;
			this.aClass5_Sub36_2.method7324(6);
			this.aClass5_Sub36_2.method7317(3);
			this.aClass136_2.method3206(this.aClass5_Sub36_2.aByteArray89, 4);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass136_2.method3207();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt6269++;
			this.anInt6268 = -2;
			this.aClass136_2 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
	public void method5538() {
		if (this.aClass136_2 != null) {
			this.aClass136_2.method3207();
		}
	}

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "(I)Z")
	public boolean method5539() {
		return this.method5541() >= 20;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)Z")
	public boolean method5540() {
		return this.method5536() >= 20;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	public int method5541() {
		return this.aClass388_8.method9026() + this.aClass388_9.method9026();
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)V")
	public void method5542() {
		if (this.aClass136_2 == null) {
			return;
		}
		try {
			this.aClass5_Sub36_2.anInt8456 = 0;
			this.aClass5_Sub36_2.method7324(7);
			this.aClass5_Sub36_2.method7317(0);
			this.aClass136_2.method3206(this.aClass5_Sub36_2.aByteArray89, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass136_2.method3207();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt6269++;
			this.anInt6268 = -2;
			this.aClass136_2 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
	public void method5543() {
		try {
			this.aClass136_2.method3207();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt6268 = -1;
		this.aClass136_2 = null;
		this.aByte87 = (byte) (int) (Math.random() * (double) 255 + 1.0D);
		this.anInt6269++;
	}
}
