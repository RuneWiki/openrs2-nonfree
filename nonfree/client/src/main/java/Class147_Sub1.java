import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!m;")
	private Class211 aClass211_2;

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	private int anInt8563 = 0;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "Lclient!qp;")
	private final Class280 aClass280_39 = new Class280(16);

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
	private int anInt8566 = 0;

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "Lclient!mr;")
	private final Class223 aClass223_54 = new Class223();

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "J")
	private long aLong229 = 0L;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	private final int anInt8553;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!lp;")
	private final Class209 aClass209_6;

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!rl", name = "K", descriptor = "Lclient!mr;")
	private Class223 aClass223_53;

	@OriginalMember(owner = "client!rl", name = "N", descriptor = "Z")
	private final boolean aBoolean592;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	private final int anInt8549;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
	private final int anInt8557;

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "Lclient!pt;")
	private final Class266 aClass266_4;

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "[B")
	private final byte[] aByteArray97;

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "Lclient!lp;")
	private final Class209 aClass209_7;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "Lclient!oh;")
	private final Class248 aClass248_3;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Lclient!gf;")
	private Class3_Sub4_Sub9 aClass3_Sub4_Sub9_1;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(ILclient!lp;Lclient!lp;Lclient!oh;Lclient!pt;I[BIZ)V")
	public Class147_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Class248 arg3, @OriginalArg(4) Class266 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt8553 = arg0;
		this.aClass209_6 = arg1;
		if (this.aClass209_6 == null) {
			this.aBoolean590 = false;
		} else {
			this.aBoolean590 = true;
			this.aClass223_53 = new Class223();
		}
		this.aBoolean592 = arg8;
		this.anInt8549 = arg5;
		this.anInt8557 = arg7;
		this.aClass266_4 = arg4;
		this.aByteArray97 = arg6;
		this.aClass209_7 = arg2;
		this.aClass248_3 = arg3;
		if (this.aClass209_7 != null) {
			this.aClass3_Sub4_Sub9_1 = this.aClass266_4.method6909(this.anInt8553, this.aClass209_7);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V")
	public void method7346() {
		if (this.aClass223_53 != null) {
			if (this.method7344() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class3 local26;
			@Pc(32) int local32;
			@Pc(124) Class3 local124;
			if (this.aBoolean590) {
				local21 = true;
				for (local26 = this.aClass223_53.method5874(); local26 != null; local26 = this.aClass223_53.method5870()) {
					local32 = (int) local26.aLong276;
					if (this.aByteArray98[local32] == 0) {
						this.method7347(local32, 1);
					}
					if (this.aByteArray98[local32] == 0) {
						local21 = false;
					} else {
						local26.method8769();
					}
				}
				while (this.anInt8566 < this.aClass211_2.anIntArray384.length) {
					if (this.aClass211_2.anIntArray384[this.anInt8566] == 0) {
						this.anInt8566++;
					} else {
						if (this.aClass266_4.anInt7947 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray98[this.anInt8566] == 0) {
							this.method7347(this.anInt8566, 1);
						}
						if (this.aByteArray98[this.anInt8566] == 0) {
							local124 = new Class3();
							local124.aLong276 = this.anInt8566;
							local21 = false;
							this.aClass223_53.method5868(local124);
						}
						this.anInt8566++;
					}
				}
				if (local21) {
					this.aBoolean590 = false;
					this.anInt8566 = 0;
				}
			} else if (this.aBoolean591) {
				local21 = true;
				for (local26 = this.aClass223_53.method5874(); local26 != null; local26 = this.aClass223_53.method5870()) {
					local32 = (int) local26.aLong276;
					if (this.aByteArray98[local32] != 1) {
						this.method7347(local32, 2);
					}
					if (this.aByteArray98[local32] == 1) {
						local26.method8769();
					} else {
						local21 = false;
					}
				}
				while (this.aClass211_2.anIntArray384.length > this.anInt8566) {
					if (this.aClass211_2.anIntArray384[this.anInt8566] == 0) {
						this.anInt8566++;
					} else {
						if (this.aClass248_3.method6452()) {
							local21 = false;
							break;
						}
						if (this.aByteArray98[this.anInt8566] != 1) {
							this.method7347(this.anInt8566, 2);
						}
						if (this.aByteArray98[this.anInt8566] != 1) {
							local124 = new Class3();
							local124.aLong276 = this.anInt8566;
							local21 = false;
							this.aClass223_53.method5868(local124);
						}
						this.anInt8566++;
					}
				}
				if (local21) {
					this.aBoolean591 = false;
					this.anInt8566 = 0;
				}
			} else {
				this.aClass223_53 = null;
			}
		}
		if (!this.aBoolean592 || this.aLong229 > Static374.method6036()) {
			return;
		}
		for (@Pc(329) Class3_Sub4_Sub9 local329 = (Class3_Sub4_Sub9) this.aClass280_39.method7110(); local329 != null; local329 = (Class3_Sub4_Sub9) this.aClass280_39.method7108()) {
			if (!local329.aBoolean724) {
				if (local329.aBoolean722) {
					if (!local329.aBoolean723) {
						throw new RuntimeException();
					}
					local329.method8769();
				} else {
					local329.aBoolean722 = true;
				}
			}
		}
		this.aLong229 = Static374.method6036() + 1000L;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)Lclient!gf;")
	private Class3_Sub4_Sub9 method7347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub4_Sub9 local13 = (Class3_Sub4_Sub9) this.aClass280_39.method7107((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean723 && local13.aBoolean724) {
			local13.method8769();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass209_6 == null || this.aByteArray98[arg0] == -1) {
					if (this.aClass248_3.method6457()) {
						return null;
					}
					local13 = this.aClass248_3.method6461((byte) 2, this.anInt8553, true, arg0);
				} else {
					local13 = this.aClass266_4.method6909(arg0, this.aClass209_6);
				}
			} else if (arg1 == 1) {
				if (this.aClass209_6 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass266_4.method6902(this.aClass209_6, arg0);
			} else if (arg1 == 2) {
				if (this.aClass209_6 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray98[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass248_3.method6452()) {
					return null;
				}
				local13 = this.aClass248_3.method6461((byte) 2, this.anInt8553, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass280_39.method7109(local13, (long) arg0);
		}
		if (local13.aBoolean724) {
			return null;
		}
		@Pc(162) byte[] local162 = local13.method8677();
		@Pc(191) int local191;
		@Pc(218) byte[] local218;
		@Pc(227) byte[] local227;
		@Pc(229) int local229;
		@Pc(283) Class3_Sub4_Sub9_Sub2 local283;
		if (!(local13 instanceof Class3_Sub4_Sub9_Sub1)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static393.aCRC32_1.reset();
				Static393.aCRC32_1.update(local162, 0, local162.length - 2);
				local191 = (int) Static393.aCRC32_1.getValue();
				if (local191 != this.aClass211_2.anIntArray385[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass211_2.aByteArrayArray18 != null && this.aClass211_2.aByteArrayArray18[arg0] != null) {
					local218 = this.aClass211_2.aByteArrayArray18[arg0];
					local227 = Static331.method5406(local162.length - 2, local162, 0);
					for (local229 = 0; local229 < 64; local229++) {
						if (local218[local229] != local227[local229]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass248_3.anInt7432 = 0;
				this.aClass248_3.anInt7431 = 0;
			} catch (@Pc(258) RuntimeException local258) {
				this.aClass248_3.method6450();
				local13.method8769();
				if (local13.aBoolean723 && !this.aClass248_3.method6457()) {
					local283 = this.aClass248_3.method6461((byte) 2, this.anInt8553, true, arg0);
					this.aClass280_39.method7109(local283, (long) arg0);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass211_2.anIntArray386[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass211_2.anIntArray386[arg0];
			if (this.aClass209_6 != null) {
				this.aClass266_4.method6903(local162, arg0, this.aClass209_6);
				if (this.aByteArray98[arg0] != 1) {
					this.anInt8563++;
					this.aByteArray98[arg0] = 1;
				}
			}
			if (!local13.aBoolean723) {
				local13.method8769();
			}
			return local13;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static393.aCRC32_1.reset();
			Static393.aCRC32_1.update(local162, 0, local162.length - 2);
			local191 = (int) Static393.aCRC32_1.getValue();
			if (this.aClass211_2.anIntArray385[arg0] != local191) {
				throw new RuntimeException();
			}
			if (this.aClass211_2.aByteArrayArray18 != null && this.aClass211_2.aByteArrayArray18[arg0] != null) {
				local218 = this.aClass211_2.aByteArrayArray18[arg0];
				local227 = Static331.method5406(local162.length - 2, local162, 0);
				for (local229 = 0; local229 < 64; local229++) {
					if (local218[local229] != local227[local229]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(458) int local458 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if (local458 != (this.aClass211_2.anIntArray386[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray98[arg0] != 1) {
				this.anInt8563++;
				this.aByteArray98[arg0] = 1;
			}
			if (!local13.aBoolean723) {
				local13.method8769();
			}
			return local13;
		} catch (@Pc(499) Exception local499) {
			this.aByteArray98[arg0] = -1;
			local13.method8769();
			if (local13.aBoolean723 && !this.aClass248_3.method6457()) {
				local283 = this.aClass248_3.method6461((byte) 2, this.anInt8553, true, arg0);
				this.aClass280_39.method7109(local283, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
	public void method7348() {
		if (this.aClass223_53 == null || this.method7344() == null) {
			return;
		}
		for (@Pc(25) Class3 local25 = this.aClass223_54.method5874(); local25 != null; local25 = this.aClass223_54.method5870()) {
			@Pc(31) int local31 = (int) local25.aLong276;
			if (local31 < 0 || local31 >= this.aClass211_2.anInt6282 || this.aClass211_2.anIntArray384[local31] == 0) {
				local25.method8769();
			} else {
				if (this.aByteArray98[local31] == 0) {
					this.method7347(local31, 1);
				}
				if (this.aByteArray98[local31] == -1) {
					this.method7347(local31, 2);
				}
				if (this.aByteArray98[local31] == 1) {
					local25.method8769();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I")
	public int method7349() {
		return this.aClass211_2 == null ? 0 : this.aClass211_2.anInt6283;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)I")
	@Override
	public int method7339(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub9 local11 = (Class3_Sub4_Sub9) this.aClass280_39.method7107((long) arg0);
		return local11 == null ? 0 : local11.method8676();
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
	public int method7350() {
		return this.anInt8563;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Lclient!m;")
	@Override
	public Class211 method7344() {
		if (this.aClass211_2 != null) {
			return this.aClass211_2;
		}
		if (this.aClass3_Sub4_Sub9_1 == null) {
			if (this.aClass248_3.method6457()) {
				return null;
			}
			this.aClass3_Sub4_Sub9_1 = this.aClass248_3.method6461((byte) 0, 255, true, this.anInt8553);
		}
		if (this.aClass3_Sub4_Sub9_1.aBoolean724) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass3_Sub4_Sub9_1.method8677();
		if (this.aClass3_Sub4_Sub9_1 instanceof Class3_Sub4_Sub9_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass211_2 = new Class211(local50, this.anInt8549, this.aByteArray97);
				if (this.anInt8557 != this.aClass211_2.anInt6280) {
					throw new RuntimeException();
				}
			} catch (@Pc(144) RuntimeException local144) {
				this.aClass211_2 = null;
				if (this.aClass248_3.method6457()) {
					this.aClass3_Sub4_Sub9_1 = null;
				} else {
					this.aClass3_Sub4_Sub9_1 = this.aClass248_3.method6461((byte) 0, 255, true, this.anInt8553);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass211_2 = new Class211(local50, this.anInt8549, this.aByteArray97);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass248_3.method6450();
				this.aClass211_2 = null;
				if (this.aClass248_3.method6457()) {
					this.aClass3_Sub4_Sub9_1 = null;
				} else {
					this.aClass3_Sub4_Sub9_1 = this.aClass248_3.method6461((byte) 0, 255, true, this.anInt8553);
				}
				return null;
			}
			if (this.aClass209_7 != null) {
				this.aClass266_4.method6903(local50, this.anInt8553, this.aClass209_7);
			}
		}
		if (this.aClass209_6 != null) {
			this.anInt8563 = 0;
			this.aByteArray98 = new byte[this.aClass211_2.anInt6282];
		}
		this.aClass3_Sub4_Sub9_1 = null;
		return this.aClass211_2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7341(@OriginalArg(0) int arg0) {
		if (this.aClass209_6 == null) {
			return;
		}
		for (@Pc(18) Class3 local18 = this.aClass223_54.method5874(); local18 != null; local18 = this.aClass223_54.method5870()) {
			if ((long) arg0 == local18.aLong276) {
				return;
			}
		}
		@Pc(38) Class3 local38 = new Class3();
		local38.aLong276 = arg0;
		this.aClass223_54.method5868(local38);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method7343(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub4_Sub9 local17 = this.method7347(arg0, 0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local17.method8677();
			local17.method8769();
			return local25;
		}
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I")
	public int method7352() {
		if (this.method7344() == null) {
			return this.aClass3_Sub4_Sub9_1 == null ? 0 : this.aClass3_Sub4_Sub9_1.method8676();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)I")
	public int method7353() {
		if (this.aClass211_2 == null) {
			return 0;
		} else if (this.aBoolean590) {
			@Pc(26) Class3 local26 = this.aClass223_53.method5874();
			return local26 == null ? 0 : (int) local26.aLong276;
		} else {
			return this.aClass211_2.anInt6283;
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
	public void method7354() {
		if (this.aClass209_6 != null) {
			this.aBoolean591 = true;
			if (this.aClass223_53 == null) {
				this.aClass223_53 = new Class223();
			}
		}
	}
}
