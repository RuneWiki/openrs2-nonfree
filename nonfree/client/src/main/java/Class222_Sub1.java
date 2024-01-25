import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!oga;")
	private Class254 aClass254_2;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	private int anInt6261 = 0;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "Lclient!lk;")
	private final Class209 aClass209_36 = new Class209(16);

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
	private int anInt6272 = 0;

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "Lclient!v;")
	private final Class362 aClass362_32 = new Class362();

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "J")
	private long aLong178 = 0L;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
	private final int anInt6267;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "Lclient!pn;")
	private final Class274 aClass274_3;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "Lclient!v;")
	private Class362 aClass362_33;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!pn;")
	private final Class274 aClass274_2;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "Z")
	private final boolean aBoolean416;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "Lclient!du;")
	private final Class73 aClass73_1;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Lclient!eda;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "[B")
	private final byte[] aByteArray71;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
	private final int anInt6266;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
	private final int anInt6263;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "Lclient!sr;")
	private Class6_Sub4_Sub11 aClass6_Sub4_Sub11_1;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(ILclient!pn;Lclient!pn;Lclient!du;Lclient!eda;I[BIZ)V")
	public Class222_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(4) Class80 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt6267 = arg0;
		this.aClass274_3 = arg1;
		if (this.aClass274_3 == null) {
			this.aBoolean414 = false;
		} else {
			this.aBoolean414 = true;
			this.aClass362_33 = new Class362();
		}
		this.aClass274_2 = arg2;
		this.aBoolean416 = arg8;
		this.aClass73_1 = arg3;
		this.aClass80_1 = arg4;
		this.aByteArray71 = arg6;
		this.anInt6266 = arg5;
		this.anInt6263 = arg7;
		if (this.aClass274_2 != null) {
			this.aClass6_Sub4_Sub11_1 = this.aClass80_1.method1903(this.anInt6267, this.aClass274_2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method5289() {
		if (this.aClass274_3 != null) {
			this.aBoolean415 = true;
			if (this.aClass362_33 == null) {
				this.aClass362_33 = new Class362();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)Lclient!oga;")
	@Override
	public Class254 method5285() {
		if (this.aClass254_2 != null) {
			return this.aClass254_2;
		}
		if (this.aClass6_Sub4_Sub11_1 == null) {
			if (this.aClass73_1.method1816()) {
				return null;
			}
			this.aClass6_Sub4_Sub11_1 = this.aClass73_1.method1809(true, (byte) 0, this.anInt6267, 255);
		}
		if (this.aClass6_Sub4_Sub11_1.aBoolean588) {
			return null;
		}
		@Pc(47) byte[] local47 = this.aClass6_Sub4_Sub11_1.method7235();
		if (this.aClass6_Sub4_Sub11_1 instanceof Class6_Sub4_Sub11_Sub1) {
			try {
				if (local47 == null) {
					throw new RuntimeException();
				}
				this.aClass254_2 = new Class254(local47, this.anInt6266, this.aByteArray71);
				if (this.anInt6263 != this.aClass254_2.anInt7293) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass254_2 = null;
				if (this.aClass73_1.method1816()) {
					this.aClass6_Sub4_Sub11_1 = null;
				} else {
					this.aClass6_Sub4_Sub11_1 = this.aClass73_1.method1809(true, (byte) 0, this.anInt6267, 255);
				}
				return null;
			}
		} else {
			try {
				if (local47 == null) {
					throw new RuntimeException();
				}
				this.aClass254_2 = new Class254(local47, this.anInt6266, this.aByteArray71);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass73_1.method1815();
				this.aClass254_2 = null;
				if (this.aClass73_1.method1816()) {
					this.aClass6_Sub4_Sub11_1 = null;
				} else {
					this.aClass6_Sub4_Sub11_1 = this.aClass73_1.method1809(true, (byte) 0, this.anInt6267, 255);
				}
				return null;
			}
			if (this.aClass274_2 != null) {
				this.aClass80_1.method1901(this.anInt6267, this.aClass274_2, local47);
			}
		}
		this.aClass6_Sub4_Sub11_1 = null;
		if (this.aClass274_3 != null) {
			this.anInt6261 = 0;
			this.aByteArray72 = new byte[this.aClass254_2.anInt7291];
		}
		return this.aClass254_2;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method5290() {
		if (this.aClass362_33 == null || this.method5285() == null) {
			return;
		}
		for (@Pc(23) Class6 local23 = this.aClass362_32.method8538(); local23 != null; local23 = this.aClass362_32.method8530()) {
			@Pc(29) int local29 = (int) local23.aLong314;
			if (local29 < 0 || local29 >= this.aClass254_2.anInt7291 || this.aClass254_2.anIntArray450[local29] == 0) {
				local23.method9174();
			} else {
				if (this.aByteArray72[local29] == 0) {
					this.method5292(1, local29);
				}
				if (this.aByteArray72[local29] == -1) {
					this.method5292(2, local29);
				}
				if (this.aByteArray72[local29] == 1) {
					local23.method9174();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
	@Override
	public void method5287(@OriginalArg(1) int arg0) {
		if (this.aClass274_3 == null) {
			return;
		}
		for (@Pc(14) Class6 local14 = this.aClass362_32.method8538(); local14 != null; local14 = this.aClass362_32.method8530()) {
			if (local14.aLong314 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class6 local38 = new Class6();
		local38.aLong314 = (long) arg0;
		this.aClass362_32.method8536(local38);
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
	public int method5291() {
		if (this.aClass254_2 == null) {
			return 0;
		} else if (this.aBoolean414) {
			@Pc(20) Class6 local20 = this.aClass362_33.method8538();
			return local20 == null ? 0 : (int) local20.aLong314;
		} else {
			return this.aClass254_2.anInt7288;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)Lclient!sr;")
	private Class6_Sub4_Sub11 method5292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub4_Sub11 local13 = (Class6_Sub4_Sub11) this.aClass209_36.method5038((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean589 && local13.aBoolean588) {
			local13.method9174();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass274_3 == null || this.aByteArray72[arg1] == -1) {
					if (this.aClass73_1.method1816()) {
						return null;
					}
					local13 = this.aClass73_1.method1809(true, (byte) 2, arg1, this.anInt6267);
				} else {
					local13 = this.aClass80_1.method1903(arg1, this.aClass274_3);
				}
			} else if (arg0 == 1) {
				if (this.aClass274_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass80_1.method1900(arg1, this.aClass274_3);
			} else if (arg0 == 2) {
				if (this.aClass274_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray72[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass73_1.method1802()) {
					return null;
				}
				local13 = this.aClass73_1.method1809(false, (byte) 2, arg1, this.anInt6267);
			} else {
				throw new RuntimeException();
			}
			this.aClass209_36.method5035((long) arg1, local13);
		}
		if (local13.aBoolean588) {
			return null;
		}
		@Pc(166) byte[] local166 = local13.method7235();
		@Pc(195) int local195;
		@Pc(226) byte[] local226;
		@Pc(237) byte[] local237;
		@Pc(239) int local239;
		@Pc(297) Class6_Sub4_Sub11_Sub2 local297;
		if (!(local13 instanceof Class6_Sub4_Sub11_Sub1)) {
			try {
				if (local166 == null || local166.length <= 2) {
					throw new RuntimeException();
				}
				Static435.aCRC32_1.reset();
				Static435.aCRC32_1.update(local166, 0, local166.length - 2);
				local195 = (int) Static435.aCRC32_1.getValue();
				if (local195 != this.aClass254_2.anIntArray451[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass254_2.aByteArrayArray19 != null && this.aClass254_2.aByteArrayArray19[arg1] != null) {
					local226 = this.aClass254_2.aByteArrayArray19[arg1];
					local237 = Static474.method6311(local166.length - 2, 0, local166);
					for (local239 = 0; local239 < 64; local239++) {
						if (local237[local239] != local226[local239]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass73_1.anInt2063 = 0;
				this.aClass73_1.anInt2062 = 0;
			} catch (@Pc(268) RuntimeException local268) {
				this.aClass73_1.method1815();
				local13.method9174();
				if (local13.aBoolean589 && !this.aClass73_1.method1816()) {
					local297 = this.aClass73_1.method1809(true, (byte) 2, arg1, this.anInt6267);
					this.aClass209_36.method5035((long) arg1, local297);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass254_2.anIntArray448[arg1] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass254_2.anIntArray448[arg1];
			if (this.aClass274_3 != null) {
				this.aClass80_1.method1901(arg1, this.aClass274_3, local166);
				if (this.aByteArray72[arg1] != 1) {
					this.anInt6261++;
					this.aByteArray72[arg1] = 1;
				}
			}
			if (!local13.aBoolean589) {
				local13.method9174();
			}
			return local13;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static435.aCRC32_1.reset();
			Static435.aCRC32_1.update(local166, 0, local166.length - 2);
			local195 = (int) Static435.aCRC32_1.getValue();
			if (this.aClass254_2.anIntArray451[arg1] != local195) {
				throw new RuntimeException();
			}
			if (this.aClass254_2.aByteArrayArray19 != null && this.aClass254_2.aByteArrayArray19[arg1] != null) {
				local226 = this.aClass254_2.aByteArrayArray19[arg1];
				local237 = Static474.method6311(local166.length - 2, 0, local166);
				for (local239 = 0; local239 < 64; local239++) {
					if (local237[local239] != local226[local239]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(477) int local477 = ((local166[local166.length - 2] & 0xFF) << 8) + (local166[local166.length - 1] & 0xFF);
			if (local477 != (this.aClass254_2.anIntArray448[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray72[arg1] != 1) {
				this.anInt6261++;
				this.aByteArray72[arg1] = 1;
			}
			if (!local13.aBoolean589) {
				local13.method9174();
			}
			return local13;
		} catch (@Pc(520) Exception local520) {
			this.aByteArray72[arg1] = -1;
			local13.method9174();
			if (local13.aBoolean589 && !this.aClass73_1.method1816()) {
				local297 = this.aClass73_1.method1809(true, (byte) 2, arg1, this.anInt6267);
				this.aClass209_36.method5035((long) arg1, local297);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
	public void method5294() {
		if (this.aClass362_33 != null) {
			if (this.method5285() == null) {
				return;
			}
			@Pc(34) boolean local34;
			@Pc(39) Class6 local39;
			@Pc(45) int local45;
			@Pc(131) Class6 local131;
			if (this.aBoolean414) {
				local34 = true;
				for (local39 = this.aClass362_33.method8538(); local39 != null; local39 = this.aClass362_33.method8530()) {
					local45 = (int) local39.aLong314;
					if (this.aByteArray72[local45] == 0) {
						this.method5292(1, local45);
					}
					if (this.aByteArray72[local45] == 0) {
						local34 = false;
					} else {
						local39.method9174();
					}
				}
				while (this.anInt6272 < this.aClass254_2.anIntArray450.length) {
					if (this.aClass254_2.anIntArray450[this.anInt6272] == 0) {
						this.anInt6272++;
					} else {
						if (this.aClass80_1.anInt2170 >= 250) {
							local34 = false;
							break;
						}
						if (this.aByteArray72[this.anInt6272] == 0) {
							this.method5292(1, this.anInt6272);
						}
						if (this.aByteArray72[this.anInt6272] == 0) {
							local131 = new Class6();
							local131.aLong314 = (long) this.anInt6272;
							local34 = false;
							this.aClass362_33.method8536(local131);
						}
						this.anInt6272++;
					}
				}
				if (local34) {
					this.aBoolean414 = false;
					this.anInt6272 = 0;
				}
			} else if (this.aBoolean415) {
				local34 = true;
				for (local39 = this.aClass362_33.method8538(); local39 != null; local39 = this.aClass362_33.method8530()) {
					local45 = (int) local39.aLong314;
					if (this.aByteArray72[local45] != 1) {
						this.method5292(2, local45);
					}
					if (this.aByteArray72[local45] == 1) {
						local39.method9174();
					} else {
						local34 = false;
					}
				}
				while (this.aClass254_2.anIntArray450.length > this.anInt6272) {
					if (this.aClass254_2.anIntArray450[this.anInt6272] == 0) {
						this.anInt6272++;
					} else {
						if (this.aClass73_1.method1802()) {
							local34 = false;
							break;
						}
						if (this.aByteArray72[this.anInt6272] != 1) {
							this.method5292(2, this.anInt6272);
						}
						if (this.aByteArray72[this.anInt6272] != 1) {
							local131 = new Class6();
							local131.aLong314 = (long) this.anInt6272;
							local34 = false;
							this.aClass362_33.method8536(local131);
						}
						this.anInt6272++;
					}
				}
				if (local34) {
					this.aBoolean415 = false;
					this.anInt6272 = 0;
				}
			} else {
				this.aClass362_33 = null;
			}
		}
		if (!this.aBoolean416 || Static566.method7936() < this.aLong178) {
			return;
		}
		for (@Pc(325) Class6_Sub4_Sub11 local325 = (Class6_Sub4_Sub11) this.aClass209_36.method5037(); local325 != null; local325 = (Class6_Sub4_Sub11) this.aClass209_36.method5036()) {
			if (!local325.aBoolean588) {
				if (local325.aBoolean587) {
					if (!local325.aBoolean589) {
						throw new RuntimeException();
					}
					local325.method9174();
				} else {
					local325.aBoolean587 = true;
				}
			}
		}
		this.aLong178 = Static566.method7936() + 1000L;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)I")
	public int method5295() {
		return this.aClass254_2 == null ? 0 : this.aClass254_2.anInt7288;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)I")
	public int method5296() {
		if (this.method5285() == null) {
			return this.aClass6_Sub4_Sub11_1 == null ? 0 : this.aClass6_Sub4_Sub11_1.method7236();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
	@Override
	public int method5284(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub4_Sub11 local17 = (Class6_Sub4_Sub11) this.aClass209_36.method5038((long) arg0);
		return local17 == null ? 0 : local17.method7236();
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)I")
	public int method5298() {
		return this.anInt6261;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method5283(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub4_Sub11 local9 = this.method5292(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method7235();
			local9.method9174();
			return local17;
		}
	}
}
