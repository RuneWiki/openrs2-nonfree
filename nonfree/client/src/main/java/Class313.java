import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class313 {

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	private int anInt8165;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "I")
	public int anInt8166;

	@OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
	public int anInt8168;

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
	public int anInt8173;

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "[I")
	public int[] anIntArray472;

	@OriginalMember(owner = "client!rfa", name = "X", descriptor = "I")
	private int anInt8178;

	@OriginalMember(owner = "client!rfa", name = "K", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!rfa", name = "P", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
	private int anInt8181;

	@OriginalMember(owner = "client!rfa", name = "J", descriptor = "I")
	private int anInt8182;

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
	public int anInt8183;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
	public int anInt8190;

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "I")
	public int anInt8193;

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "Lclient!qr;")
	private Class306 aClass306_36;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
	public int anInt8198;

	@OriginalMember(owner = "client!rfa", name = "T", descriptor = "Lclient!sda;")
	public Class327 aClass327_3;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	public int anInt8167 = -1;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
	public int anInt8172 = -1;

	@OriginalMember(owner = "client!rfa", name = "V", descriptor = "Z")
	public boolean aBoolean548 = false;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Z")
	public boolean aBoolean547 = true;

	@OriginalMember(owner = "client!rfa", name = "S", descriptor = "Z")
	public boolean aBoolean546 = true;

	@OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
	public int anInt8176 = -1;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "Z")
	public boolean aBoolean549 = true;

	@OriginalMember(owner = "client!rfa", name = "R", descriptor = "I")
	private int anInt8164 = -1;

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
	private int anInt8170 = -1;

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "I")
	public int anInt8180 = -1;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
	public int anInt8179 = -1;

	@OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
	private int anInt8185 = -1;

	@OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
	private int anInt8188 = -1;

	@OriginalMember(owner = "client!rfa", name = "Y", descriptor = "I")
	public int anInt8171 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rfa", name = "N", descriptor = "I")
	public int anInt8187 = -1;

	@OriginalMember(owner = "client!rfa", name = "O", descriptor = "I")
	public int anInt8184 = -1;

	@OriginalMember(owner = "client!rfa", name = "Z", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray34 = new String[5];

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
	private int anInt8191 = -1;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
	public int anInt8192 = 0;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
	public int anInt8197 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rfa", name = "U", descriptor = "I")
	public int anInt8200 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rfa", name = "M", descriptor = "I")
	public int anInt8201 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!wq;)V")
	public void method7056(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7291();
			if (local17 == 0) {
				return;
			}
			this.method7062(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ada;Z)Z")
	public boolean method7057(@OriginalArg(0) Interface1 arg0) {
		@Pc(15) int local15;
		if (this.anInt8170 == -1) {
			if (this.anInt8188 == -1) {
				return true;
			}
			local15 = arg0.method5699(this.anInt8188);
		} else {
			local15 = arg0.method5700(this.anInt8170);
		}
		if (local15 < this.anInt8182 || local15 > this.anInt8165) {
			return false;
		}
		@Pc(75) int local75;
		if (this.anInt8191 == -1) {
			if (this.anInt8164 == -1) {
				return true;
			}
			local75 = arg0.method5699(this.anInt8164);
		} else {
			local75 = arg0.method5700(this.anInt8191);
		}
		return this.anInt8178 <= local75 && this.anInt8181 >= local75;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!ha;)Lclient!hk;")
	public Class155 method7058(@OriginalArg(1) Class100 arg0) {
		@Pc(22) Class155 local22 = (Class155) this.aClass327_3.aClass168_78.method3860((long) (this.anInt8185 | 0x20000 | arg0.anInt10048 << 29));
		if (local22 != null) {
			return local22;
		}
		this.aClass327_3.aClass126_243.method3077(this.anInt8185);
		@Pc(50) Class362 local50 = Static692.method8275(this.aClass327_3.aClass126_243, this.anInt8185, 0);
		if (local50 != null) {
			local22 = arg0.method8640(local50, true);
			this.aClass327_3.aClass168_78.method3853((long) (this.anInt8185 | 0x20000 | arg0.anInt10048 << 29), local22);
		}
		return local22;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	public void method7060() {
		if (this.anIntArray472 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray472.length; local21 += 2) {
			if (this.anIntArray472[local21] < this.anInt8201) {
				this.anInt8201 = this.anIntArray472[local21];
			} else if (this.anIntArray472[local21] > this.anInt8200) {
				this.anInt8200 = this.anIntArray472[local21];
			}
			if (this.anIntArray472[local21 + 1] < this.anInt8171) {
				this.anInt8171 = this.anIntArray472[local21 + 1];
			} else if (this.anInt8197 < this.anIntArray472[local21 + 1]) {
				this.anInt8197 = this.anIntArray472[local21 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method7061(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass306_36 == null) {
			return arg1;
		} else {
			@Pc(24) Class5_Sub46 local24 = (Class5_Sub46) this.aClass306_36.method6943((long) arg0);
			return local24 == null ? arg1 : local24.aString87;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!wq;II)V")
	private void method7062(@OriginalArg(0) Class5_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8179 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt8172 = arg0.method7333();
		} else if (arg1 == 3) {
			this.aString93 = arg0.method7281();
		} else if (arg1 == 4) {
			this.anInt8173 = arg0.method7331();
		} else if (arg1 == 5) {
			this.anInt8167 = arg0.method7331();
		} else if (arg1 == 6) {
			this.anInt8192 = arg0.method7291();
			return;
		} else {
			@Pc(299) int local299;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean549 = arg0.method7291() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt8188 = arg0.method7333();
					if (this.anInt8188 == 65535) {
						this.anInt8188 = -1;
					}
					this.anInt8170 = arg0.method7333();
					if (this.anInt8170 == 65535) {
						this.anInt8170 = -1;
					}
					this.anInt8182 = arg0.method7268();
					this.anInt8165 = arg0.method7268();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray34[arg1 - 10] = arg0.method7281();
					return;
				}
				@Pc(306) int local306;
				@Pc(334) int local334;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean547 = false;
						return;
					}
					if (arg1 != 17) {
						if (arg1 == 18) {
							this.anInt8185 = arg0.method7333();
						} else if (arg1 == 19) {
							this.anInt8176 = arg0.method7333();
							return;
						} else if (arg1 == 20) {
							this.anInt8164 = arg0.method7333();
							if (this.anInt8164 == 65535) {
								this.anInt8164 = -1;
							}
							this.anInt8191 = arg0.method7333();
							if (this.anInt8191 == 65535) {
								this.anInt8191 = -1;
							}
							this.anInt8178 = arg0.method7268();
							this.anInt8181 = arg0.method7268();
							return;
						} else if (arg1 == 21) {
							this.anInt8190 = arg0.method7268();
							return;
						} else if (arg1 == 22) {
							this.anInt8166 = arg0.method7268();
							return;
						} else if (arg1 == 23) {
							this.anInt8187 = arg0.method7291();
							this.anInt8184 = arg0.method7291();
							this.anInt8180 = arg0.method7291();
							return;
						} else if (arg1 == 24) {
							this.anInt8183 = arg0.method7303();
							this.anInt8198 = arg0.method7303();
							return;
						} else if (arg1 == 249) {
							local299 = arg0.method7291();
							if (this.aClass306_36 == null) {
								local306 = Static146.method2737(local299);
								this.aClass306_36 = new Class306(local306);
							}
							for (local306 = 0; local306 < local299; local306++) {
								@Pc(330) boolean local330 = arg0.method7291() == 1;
								local334 = arg0.method7331();
								@Pc(343) Class5 local343;
								if (local330) {
									local343 = new Class5_Sub46(arg0.method7281());
								} else {
									local343 = new Class5_Sub43(arg0.method7268());
								}
								this.aClass306_36.method6944(local343, (long) local334, -12002);
							}
							return;
						}
						return;
					}
					this.aString94 = arg0.method7281();
					return;
				}
				local299 = arg0.method7291();
				this.anIntArray472 = new int[local299 * 2];
				for (local306 = 0; local306 < local299 * 2; local306++) {
					this.anIntArray472[local306] = arg0.method7303();
				}
				this.anInt8193 = arg0.method7268();
				@Pc(424) int local424 = arg0.method7291();
				this.anIntArray473 = new int[local424];
				for (local334 = 0; local334 < this.anIntArray473.length; local334++) {
					this.anIntArray473[local334] = arg0.method7268();
				}
				this.aByteArray88 = new byte[local299];
				for (@Pc(461) int local461 = 0; local461 < local299; local461++) {
					this.aByteArray88[local461] = arg0.method7318();
				}
				return;
			}
			local299 = arg0.method7291();
			if ((local299 & 0x2) == 2) {
				this.aBoolean548 = true;
			}
			if ((local299 & 0x1) == 0) {
				this.aBoolean546 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZILclient!ha;)Lclient!hk;")
	public Class155 method7063(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(12) int local12 = arg0 ? this.anInt8172 : this.anInt8179;
		@Pc(19) int local19 = arg1.anInt10048 << 29 | local12;
		@Pc(28) Class155 local28 = (Class155) this.aClass327_3.aClass168_78.method3860((long) local19);
		if (local28 != null) {
			return local28;
		} else if (this.aClass327_3.aClass126_243.method3077(local12)) {
			@Pc(50) Class362 local50 = Static692.method8275(this.aClass327_3.aClass126_243, local12, 0);
			if (local50 != null) {
				local28 = arg1.method8640(local50, true);
				this.aClass327_3.aClass168_78.method3853((long) local19, local28);
			}
			return local28;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIB)I")
	public int method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass306_36 == null) {
			return arg1;
		} else {
			@Pc(24) Class5_Sub43 local24 = (Class5_Sub43) this.aClass306_36.method6943((long) arg0);
			return local24 == null ? arg1 : local24.anInt6989;
		}
	}
}
