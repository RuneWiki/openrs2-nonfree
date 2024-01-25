import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!wu;")
	private Class394 aClass394_2;

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!rn", name = "L", descriptor = "Z")
	private boolean aBoolean668;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
	private int anInt9201 = 0;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "Lclient!si;")
	private final Class335 aClass335_37 = new Class335(16);

	@OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
	private int anInt9206 = 0;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "Lclient!ow;")
	private final Class271 aClass271_54 = new Class271();

	@OriginalMember(owner = "client!rn", name = "P", descriptor = "J")
	private long aLong254 = 0L;

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
	private final int anInt9200;

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "Lclient!ce;")
	private final Class47 aClass47_4;

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "Z")
	private boolean aBoolean669;

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "Lclient!ow;")
	private Class271 aClass271_53;

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "Lclient!ce;")
	private final Class47 aClass47_3;

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
	private final int anInt9197;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[B")
	private final byte[] aByteArray80;

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Lclient!cda;")
	private final Class46 aClass46_2;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
	private final int anInt9195;

	@OriginalMember(owner = "client!rn", name = "Q", descriptor = "Z")
	private final boolean aBoolean670;

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "Lclient!l;")
	private final Class206 aClass206_2;

	@OriginalMember(owner = "client!rn", name = "A", descriptor = "Lclient!jl;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_1;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(ILclient!ce;Lclient!ce;Lclient!l;Lclient!cda;I[BIZ)V")
	public Class51_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) Class206 arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt9200 = arg0;
		this.aClass47_4 = arg1;
		if (this.aClass47_4 == null) {
			this.aBoolean669 = false;
		} else {
			this.aBoolean669 = true;
			this.aClass271_53 = new Class271();
		}
		this.aClass47_3 = arg2;
		this.anInt9197 = arg5;
		this.aByteArray80 = arg6;
		this.aClass46_2 = arg4;
		this.anInt9195 = arg7;
		this.aBoolean670 = arg8;
		this.aClass206_2 = arg3;
		if (this.aClass47_3 != null) {
			this.aClass2_Sub1_Sub6_1 = this.aClass46_2.method1298(this.aClass47_3, this.anInt9200);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method8045(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub6 local9 = this.method8051(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method6765();
			local9.method9825();
			return local23;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)Lclient!jl;")
	private Class2_Sub1_Sub6 method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub1_Sub6 local13 = (Class2_Sub1_Sub6) this.aClass335_37.method8357((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean567 && local13.aBoolean566) {
			local13.method9825();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass47_4 == null || this.aByteArray81[arg0] == -1) {
					if (this.aClass206_2.method5425()) {
						return null;
					}
					local13 = this.aClass206_2.method5417((byte) 2, arg0, this.anInt9200, true);
				} else {
					local13 = this.aClass46_2.method1298(this.aClass47_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass47_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass46_2.method1295(arg0, this.aClass47_4);
			} else if (arg1 == 2) {
				if (this.aClass47_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray81[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass206_2.method5421()) {
					return null;
				}
				local13 = this.aClass206_2.method5417((byte) 2, arg0, this.anInt9200, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass335_37.method8356(local13, (long) arg0);
		}
		if (local13.aBoolean566) {
			return null;
		}
		@Pc(166) byte[] local166 = local13.method6765();
		@Pc(193) int local193;
		@Pc(220) byte[] local220;
		@Pc(229) byte[] local229;
		@Pc(231) int local231;
		@Pc(336) Class2_Sub1_Sub6_Sub1 local336;
		if (!(local13 instanceof Class2_Sub1_Sub6_Sub2)) {
			try {
				label157: {
					if (local166 != null && local166.length > 2) {
						Static264.aCRC32_1.reset();
						Static264.aCRC32_1.update(local166, 0, local166.length - 2);
						local193 = (int) Static264.aCRC32_1.getValue();
						if (local193 != this.aClass394_2.anIntArray599[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass394_2.aByteArrayArray28 == null || this.aClass394_2.aByteArrayArray28[arg0] == null) {
							break label157;
						}
						local220 = this.aClass394_2.aByteArrayArray28[arg0];
						local229 = Static590.method8900(local166, 0, local166.length - 2);
						local231 = 0;
						while (true) {
							if (local231 >= 64) {
								break label157;
							}
							if (local220[local231] != local229[local231]) {
								throw new RuntimeException();
							}
							local231++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass206_2.anInt6003 = 0;
				this.aClass206_2.anInt6002 = 0;
			} catch (@Pc(446) RuntimeException local446) {
				this.aClass206_2.method5415();
				local13.method9825();
				if (local13.aBoolean567 && !this.aClass206_2.method5425()) {
					local336 = this.aClass206_2.method5417((byte) 2, arg0, this.anInt9200, true);
					this.aClass335_37.method8356(local336, (long) arg0);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass394_2.anIntArray602[arg0] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass394_2.anIntArray602[arg0];
			if (this.aClass47_4 != null) {
				this.aClass46_2.method1296(this.aClass47_4, local166, arg0);
				if (this.aByteArray81[arg0] != 1) {
					this.anInt9201++;
					this.aByteArray81[arg0] = 1;
				}
			}
			if (!local13.aBoolean567) {
				local13.method9825();
			}
			return local13;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static264.aCRC32_1.reset();
			Static264.aCRC32_1.update(local166, 0, local166.length - 2);
			local193 = (int) Static264.aCRC32_1.getValue();
			if (local193 != this.aClass394_2.anIntArray599[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass394_2.aByteArrayArray28 != null && this.aClass394_2.aByteArrayArray28[arg0] != null) {
				local220 = this.aClass394_2.aByteArrayArray28[arg0];
				local229 = Static590.method8900(local166, 0, local166.length - 2);
				for (local231 = 0; local231 < 64; local231++) {
					if (local220[local231] != local229[local231]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(269) int local269 = ((local166[local166.length - 2] & 0xFF) << 8) + (local166[local166.length - 1] & 0xFF);
			if ((this.aClass394_2.anIntArray602[arg0] & 0xFFFF) != local269) {
				throw new RuntimeException();
			}
			if (this.aByteArray81[arg0] != 1) {
				this.anInt9201++;
				this.aByteArray81[arg0] = 1;
			}
			if (!local13.aBoolean567) {
				local13.method9825();
			}
			return local13;
		} catch (@Pc(310) Exception local310) {
			this.aByteArray81[arg0] = -1;
			local13.method9825();
			if (local13.aBoolean567 && !this.aClass206_2.method5425()) {
				local336 = this.aClass206_2.method5417((byte) 2, arg0, this.anInt9200, true);
				this.aClass335_37.method8356(local336, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)I")
	public int method8053() {
		return this.aClass394_2 == null ? 0 : this.aClass394_2.anInt11410;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)I")
	public int method8054() {
		if (this.aClass394_2 == null) {
			return 0;
		} else if (this.aBoolean669) {
			@Pc(25) Class2 local25 = this.aClass271_53.method7177();
			return local25 == null ? 0 : (int) local25.aLong313;
		} else {
			return this.aClass394_2.anInt11410;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)V")
	@Override
	public void method8047(@OriginalArg(1) int arg0) {
		if (this.aClass47_4 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass271_54.method7177(); local14 != null; local14 = this.aClass271_54.method7175()) {
			if (local14.aLong313 == (long) arg0) {
				return;
			}
		}
		@Pc(42) Class2 local42 = new Class2();
		local42.aLong313 = (long) arg0;
		this.aClass271_54.method7174(local42);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lclient!wu;")
	@Override
	public Class394 method8046() {
		if (this.aClass394_2 != null) {
			return this.aClass394_2;
		}
		if (this.aClass2_Sub1_Sub6_1 == null) {
			if (this.aClass206_2.method5425()) {
				return null;
			}
			this.aClass2_Sub1_Sub6_1 = this.aClass206_2.method5417((byte) 0, this.anInt9200, 255, true);
		}
		if (this.aClass2_Sub1_Sub6_1.aBoolean566) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass2_Sub1_Sub6_1.method6765();
		if (this.aClass2_Sub1_Sub6_1 instanceof Class2_Sub1_Sub6_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass394_2 = new Class394(local43, this.anInt9197, this.aByteArray80);
				if (this.aClass394_2.anInt11415 != this.anInt9195) {
					throw new RuntimeException();
				}
			} catch (@Pc(139) RuntimeException local139) {
				this.aClass394_2 = null;
				if (this.aClass206_2.method5425()) {
					this.aClass2_Sub1_Sub6_1 = null;
				} else {
					this.aClass2_Sub1_Sub6_1 = this.aClass206_2.method5417((byte) 0, this.anInt9200, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass394_2 = new Class394(local43, this.anInt9197, this.aByteArray80);
			} catch (@Pc(65) RuntimeException local65) {
				this.aClass206_2.method5415();
				this.aClass394_2 = null;
				if (this.aClass206_2.method5425()) {
					this.aClass2_Sub1_Sub6_1 = null;
				} else {
					this.aClass2_Sub1_Sub6_1 = this.aClass206_2.method5417((byte) 0, this.anInt9200, 255, true);
				}
				return null;
			}
			if (this.aClass47_3 != null) {
				this.aClass46_2.method1296(this.aClass47_3, local43, this.anInt9200);
			}
		}
		if (this.aClass47_4 != null) {
			this.aByteArray81 = new byte[this.aClass394_2.anInt11411];
			this.anInt9201 = 0;
		}
		this.aClass2_Sub1_Sub6_1 = null;
		return this.aClass394_2;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)I")
	public int method8055() {
		return this.anInt9201;
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I")
	public int method8056() {
		if (this.method8046() == null) {
			return this.aClass2_Sub1_Sub6_1 == null ? 0 : this.aClass2_Sub1_Sub6_1.method6761();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)I")
	@Override
	public int method8049(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub1_Sub6 local11 = (Class2_Sub1_Sub6) this.aClass335_37.method8357((long) arg0);
		return local11 == null ? 0 : local11.method6761();
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)V")
	public void method8057() {
		if (this.aClass271_53 == null || this.method8046() == null) {
			return;
		}
		for (@Pc(23) Class2 local23 = this.aClass271_54.method7177(); local23 != null; local23 = this.aClass271_54.method7175()) {
			@Pc(29) int local29 = (int) local23.aLong313;
			if (local29 < 0 || this.aClass394_2.anInt11411 <= local29 || this.aClass394_2.anIntArray598[local29] == 0) {
				local23.method9825();
			} else {
				if (this.aByteArray81[local29] == 0) {
					this.method8051(local29, 1);
				}
				if (this.aByteArray81[local29] == -1) {
					this.method8051(local29, 2);
				}
				if (this.aByteArray81[local29] == 1) {
					local23.method9825();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
	public void method8058() {
		if (this.aClass47_4 != null) {
			this.aBoolean668 = true;
			if (this.aClass271_53 == null) {
				this.aClass271_53 = new Class271();
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
	public void method8059() {
		if (this.aClass271_53 != null) {
			if (this.method8046() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class2 local30;
			@Pc(36) int local36;
			@Pc(125) Class2 local125;
			if (this.aBoolean669) {
				local25 = true;
				for (local30 = this.aClass271_53.method7177(); local30 != null; local30 = this.aClass271_53.method7175()) {
					local36 = (int) local30.aLong313;
					if (this.aByteArray81[local36] == 0) {
						this.method8051(local36, 1);
					}
					if (this.aByteArray81[local36] == 0) {
						local25 = false;
					} else {
						local30.method9825();
					}
				}
				while (this.aClass394_2.anIntArray598.length > this.anInt9206) {
					if (this.aClass394_2.anIntArray598[this.anInt9206] == 0) {
						this.anInt9206++;
					} else {
						if (this.aClass46_2.anInt1357 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray81[this.anInt9206] == 0) {
							this.method8051(this.anInt9206, 1);
						}
						if (this.aByteArray81[this.anInt9206] == 0) {
							local125 = new Class2();
							local125.aLong313 = (long) this.anInt9206;
							this.aClass271_53.method7174(local125);
							local25 = false;
						}
						this.anInt9206++;
					}
				}
				if (local25) {
					this.aBoolean669 = false;
					this.anInt9206 = 0;
				}
			} else if (this.aBoolean668) {
				local25 = true;
				for (local30 = this.aClass271_53.method7177(); local30 != null; local30 = this.aClass271_53.method7175()) {
					local36 = (int) local30.aLong313;
					if (this.aByteArray81[local36] != 1) {
						this.method8051(local36, 2);
					}
					if (this.aByteArray81[local36] == 1) {
						local30.method9825();
					} else {
						local25 = false;
					}
				}
				while (this.aClass394_2.anIntArray598.length > this.anInt9206) {
					if (this.aClass394_2.anIntArray598[this.anInt9206] == 0) {
						this.anInt9206++;
					} else {
						if (this.aClass206_2.method5421()) {
							local25 = false;
							break;
						}
						if (this.aByteArray81[this.anInt9206] != 1) {
							this.method8051(this.anInt9206, 2);
						}
						if (this.aByteArray81[this.anInt9206] != 1) {
							local125 = new Class2();
							local125.aLong313 = (long) this.anInt9206;
							local25 = false;
							this.aClass271_53.method7174(local125);
						}
						this.anInt9206++;
					}
				}
				if (local25) {
					this.anInt9206 = 0;
					this.aBoolean668 = false;
				}
			} else {
				this.aClass271_53 = null;
			}
		}
		if (!this.aBoolean670 || Static99.method1701() < this.aLong254) {
			return;
		}
		for (@Pc(322) Class2_Sub1_Sub6 local322 = (Class2_Sub1_Sub6) this.aClass335_37.method8358(); local322 != null; local322 = (Class2_Sub1_Sub6) this.aClass335_37.method8355()) {
			if (!local322.aBoolean566) {
				if (local322.aBoolean568) {
					if (!local322.aBoolean567) {
						throw new RuntimeException();
					}
					local322.method9825();
				} else {
					local322.aBoolean568 = true;
				}
			}
		}
		this.aLong254 = Static99.method1701() + 1000L;
	}
}
