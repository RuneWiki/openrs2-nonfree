import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "Lclient!vh;")
	private Class352 aClass352_1;

	@OriginalMember(owner = "client!rt", name = "O", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
	private int anInt8516 = 0;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!baa;")
	private final Class25 aClass25_38 = new Class25(16);

	@OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
	private int anInt8529 = 0;

	@OriginalMember(owner = "client!rt", name = "Q", descriptor = "Lclient!mba;")
	private final Class216 aClass216_59 = new Class216();

	@OriginalMember(owner = "client!rt", name = "T", descriptor = "J")
	private long aLong224 = 0L;

	@OriginalMember(owner = "client!rt", name = "E", descriptor = "Lclient!kv;")
	private final Class196 aClass196_4;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
	private final int anInt8511;

	@OriginalMember(owner = "client!rt", name = "N", descriptor = "Z")
	private boolean aBoolean616;

	@OriginalMember(owner = "client!rt", name = "R", descriptor = "Lclient!mba;")
	private Class216 aClass216_60;

	@OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
	private final int anInt8523;

	@OriginalMember(owner = "client!rt", name = "S", descriptor = "Z")
	private final boolean aBoolean618;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	private final int anInt8510;

	@OriginalMember(owner = "client!rt", name = "C", descriptor = "[B")
	private final byte[] aByteArray85;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!qw;")
	private final Class286 aClass286_3;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "Lclient!kv;")
	private final Class196 aClass196_3;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!th;")
	private final Class323 aClass323_3;

	@OriginalMember(owner = "client!rt", name = "J", descriptor = "Lclient!gf;")
	private Class3_Sub7_Sub4 aClass3_Sub7_Sub4_1;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILclient!kv;Lclient!kv;Lclient!th;Lclient!qw;I[BIZ)V")
	public Class40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class323 arg3, @OriginalArg(4) Class286 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass196_4 = arg1;
		this.anInt8511 = arg0;
		if (this.aClass196_4 == null) {
			this.aBoolean616 = false;
		} else {
			this.aBoolean616 = true;
			this.aClass216_60 = new Class216();
		}
		this.anInt8523 = arg7;
		this.aBoolean618 = arg8;
		this.anInt8510 = arg5;
		this.aByteArray85 = arg6;
		this.aClass286_3 = arg4;
		this.aClass196_3 = arg2;
		this.aClass323_3 = arg3;
		if (this.aClass196_3 != null) {
			this.aClass3_Sub7_Sub4_1 = this.aClass286_3.method7061(this.anInt8511, this.aClass196_3);
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)I")
	public int method7340() {
		return this.aClass352_1 == null ? 0 : this.aClass352_1.anInt9747;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I")
	public int method7341() {
		if (this.method7335() == null) {
			return this.aClass3_Sub7_Sub4_1 == null ? 0 : this.aClass3_Sub7_Sub4_1.method1502();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)V")
	@Override
	public void method7337(@OriginalArg(1) int arg0) {
		if (this.aClass196_4 == null) {
			return;
		}
		for (@Pc(22) Class3 local22 = this.aClass216_59.method5457(); local22 != null; local22 = this.aClass216_59.method5458()) {
			if (local22.aLong277 == (long) arg0) {
				return;
			}
		}
		@Pc(46) Class3 local46 = new Class3();
		local46.aLong277 = (long) arg0;
		this.aClass216_59.method5449(local46);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
	public void method7343() {
		if (this.aClass196_4 != null) {
			this.aBoolean617 = true;
			if (this.aClass216_60 == null) {
				this.aClass216_60 = new Class216();
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method7334(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub7_Sub4 local16 = this.method7351(0, arg0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method1504();
			local16.method8682();
			return local24;
		}
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
	public void method7345() {
		if (this.aClass216_60 != null) {
			if (this.method7335() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class3 local26;
			@Pc(32) int local32;
			@Pc(124) Class3 local124;
			if (this.aBoolean616) {
				local21 = true;
				for (local26 = this.aClass216_60.method5457(); local26 != null; local26 = this.aClass216_60.method5458()) {
					local32 = (int) local26.aLong277;
					if (this.aByteArray84[local32] == 0) {
						this.method7351(1, local32);
					}
					if (this.aByteArray84[local32] == 0) {
						local21 = false;
					} else {
						local26.method8682();
					}
				}
				while (this.aClass352_1.anIntArray618.length > this.anInt8529) {
					if (this.aClass352_1.anIntArray618[this.anInt8529] == 0) {
						this.anInt8529++;
					} else {
						if (this.aClass286_3.anInt8168 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray84[this.anInt8529] == 0) {
							this.method7351(1, this.anInt8529);
						}
						if (this.aByteArray84[this.anInt8529] == 0) {
							local124 = new Class3();
							local124.aLong277 = (long) this.anInt8529;
							local21 = false;
							this.aClass216_60.method5449(local124);
						}
						this.anInt8529++;
					}
				}
				if (local21) {
					this.anInt8529 = 0;
					this.aBoolean616 = false;
				}
			} else if (this.aBoolean617) {
				local21 = true;
				for (local26 = this.aClass216_60.method5457(); local26 != null; local26 = this.aClass216_60.method5458()) {
					local32 = (int) local26.aLong277;
					if (this.aByteArray84[local32] != 1) {
						this.method7351(2, local32);
					}
					if (this.aByteArray84[local32] == 1) {
						local26.method8682();
					} else {
						local21 = false;
					}
				}
				while (this.anInt8529 < this.aClass352_1.anIntArray618.length) {
					if (this.aClass352_1.anIntArray618[this.anInt8529] == 0) {
						this.anInt8529++;
					} else {
						if (this.aClass323_3.method7832()) {
							local21 = false;
							break;
						}
						if (this.aByteArray84[this.anInt8529] != 1) {
							this.method7351(2, this.anInt8529);
						}
						if (this.aByteArray84[this.anInt8529] != 1) {
							local124 = new Class3();
							local124.aLong277 = (long) this.anInt8529;
							local21 = false;
							this.aClass216_60.method5449(local124);
						}
						this.anInt8529++;
					}
				}
				if (local21) {
					this.anInt8529 = 0;
					this.aBoolean617 = false;
				}
			} else {
				this.aClass216_60 = null;
			}
		}
		if (!this.aBoolean618 || this.aLong224 > Static191.method3071()) {
			return;
		}
		for (@Pc(336) Class3_Sub7_Sub4 local336 = (Class3_Sub7_Sub4) this.aClass25_38.method435(); local336 != null; local336 = (Class3_Sub7_Sub4) this.aClass25_38.method432()) {
			if (!local336.aBoolean126) {
				if (local336.aBoolean125) {
					if (!local336.aBoolean127) {
						throw new RuntimeException();
					}
					local336.method8682();
				} else {
					local336.aBoolean125 = true;
				}
			}
		}
		this.aLong224 = Static191.method3071() + 1000L;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BI)I")
	@Override
	public int method7339(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub4 local11 = (Class3_Sub7_Sub4) this.aClass25_38.method426((long) arg0);
		return local11 == null ? 0 : local11.method1502();
	}

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)V")
	public void method7346() {
		if (this.aClass216_60 == null || this.method7335() == null) {
			return;
		}
		for (@Pc(25) Class3 local25 = this.aClass216_59.method5457(); local25 != null; local25 = this.aClass216_59.method5458()) {
			@Pc(31) int local31 = (int) local25.aLong277;
			if (local31 < 0 || this.aClass352_1.anInt9751 <= local31 || this.aClass352_1.anIntArray618[local31] == 0) {
				local25.method8682();
			} else {
				if (this.aByteArray84[local31] == 0) {
					this.method7351(1, local31);
				}
				if (this.aByteArray84[local31] == -1) {
					this.method7351(2, local31);
				}
				if (this.aByteArray84[local31] == 1) {
					local25.method8682();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)I")
	public int method7349() {
		return this.anInt8516;
	}

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)I")
	public int method7350() {
		if (this.aClass352_1 == null) {
			return 0;
		} else if (this.aBoolean616) {
			@Pc(26) Class3 local26 = this.aClass216_60.method5457();
			return local26 == null ? 0 : (int) local26.aLong277;
		} else {
			return this.aClass352_1.anInt9747;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)Lclient!vh;")
	@Override
	public Class352 method7335() {
		if (this.aClass352_1 != null) {
			return this.aClass352_1;
		}
		if (this.aClass3_Sub7_Sub4_1 == null) {
			if (this.aClass323_3.method7839()) {
				return null;
			}
			this.aClass3_Sub7_Sub4_1 = this.aClass323_3.method7834(this.anInt8511, true, 255, (byte) 0);
		}
		if (this.aClass3_Sub7_Sub4_1.aBoolean126) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass3_Sub7_Sub4_1.method1504();
		if (this.aClass3_Sub7_Sub4_1 instanceof Class3_Sub7_Sub4_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass352_1 = new Class352(local50, this.anInt8510, this.aByteArray85);
				if (this.aClass352_1.anInt9748 != this.anInt8523) {
					throw new RuntimeException();
				}
			} catch (@Pc(148) RuntimeException local148) {
				this.aClass352_1 = null;
				if (this.aClass323_3.method7839()) {
					this.aClass3_Sub7_Sub4_1 = null;
				} else {
					this.aClass3_Sub7_Sub4_1 = this.aClass323_3.method7834(this.anInt8511, true, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass352_1 = new Class352(local50, this.anInt8510, this.aByteArray85);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass323_3.method7823();
				this.aClass352_1 = null;
				if (this.aClass323_3.method7839()) {
					this.aClass3_Sub7_Sub4_1 = null;
				} else {
					this.aClass3_Sub7_Sub4_1 = this.aClass323_3.method7834(this.anInt8511, true, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass196_3 != null) {
				this.aClass286_3.method7063(local50, this.aClass196_3, this.anInt8511);
			}
		}
		this.aClass3_Sub7_Sub4_1 = null;
		if (this.aClass196_4 != null) {
			this.anInt8516 = 0;
			this.aByteArray84 = new byte[this.aClass352_1.anInt9751];
		}
		return this.aClass352_1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Lclient!gf;")
	private Class3_Sub7_Sub4 method7351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub7_Sub4 local13 = (Class3_Sub7_Sub4) this.aClass25_38.method426((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean127 && local13.aBoolean126) {
			local13.method8682();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass196_4 == null || this.aByteArray84[arg1] == -1) {
					if (this.aClass323_3.method7839()) {
						return null;
					}
					local13 = this.aClass323_3.method7834(arg1, true, this.anInt8511, (byte) 2);
				} else {
					local13 = this.aClass286_3.method7061(arg1, this.aClass196_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass196_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass286_3.method7058(arg1, this.aClass196_4);
			} else if (arg0 == 2) {
				if (this.aClass196_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray84[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass323_3.method7832()) {
					return null;
				}
				local13 = this.aClass323_3.method7834(arg1, false, this.anInt8511, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass25_38.method434((long) arg1, local13);
		}
		if (local13.aBoolean126) {
			return null;
		}
		@Pc(164) byte[] local164 = local13.method1504();
		@Pc(191) int local191;
		@Pc(222) byte[] local222;
		@Pc(231) byte[] local231;
		@Pc(233) int local233;
		@Pc(339) Class3_Sub7_Sub4_Sub1 local339;
		if (!(local13 instanceof Class3_Sub7_Sub4_Sub2)) {
			try {
				label157: {
					if (local164 != null && local164.length > 2) {
						Static619.aCRC32_1.reset();
						Static619.aCRC32_1.update(local164, 0, local164.length - 2);
						local191 = (int) Static619.aCRC32_1.getValue();
						if (this.aClass352_1.anIntArray617[arg1] != local191) {
							throw new RuntimeException();
						}
						if (this.aClass352_1.aByteArrayArray26 == null || this.aClass352_1.aByteArrayArray26[arg1] == null) {
							break label157;
						}
						local222 = this.aClass352_1.aByteArrayArray26[arg1];
						local231 = Static152.method2720(0, local164, local164.length - 2);
						local233 = 0;
						while (true) {
							if (local233 >= 64) {
								break label157;
							}
							if (local231[local233] != local222[local233]) {
								throw new RuntimeException();
							}
							local233++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass323_3.anInt9132 = 0;
				this.aClass323_3.anInt9133 = 0;
			} catch (@Pc(439) RuntimeException local439) {
				this.aClass323_3.method7823();
				local13.method8682();
				if (local13.aBoolean127 && !this.aClass323_3.method7839()) {
					local339 = this.aClass323_3.method7834(arg1, true, this.anInt8511, (byte) 2);
					this.aClass25_38.method434((long) arg1, local339);
				}
				return null;
			}
			local164[local164.length - 2] = (byte) (this.aClass352_1.anIntArray615[arg1] >>> 8);
			local164[local164.length - 1] = (byte) this.aClass352_1.anIntArray615[arg1];
			if (this.aClass196_4 != null) {
				this.aClass286_3.method7063(local164, this.aClass196_4, arg1);
				if (this.aByteArray84[arg1] != 1) {
					this.anInt8516++;
					this.aByteArray84[arg1] = 1;
				}
			}
			if (!local13.aBoolean127) {
				local13.method8682();
			}
			return local13;
		}
		try {
			if (local164 == null || local164.length <= 2) {
				throw new RuntimeException();
			}
			Static619.aCRC32_1.reset();
			Static619.aCRC32_1.update(local164, 0, local164.length - 2);
			local191 = (int) Static619.aCRC32_1.getValue();
			if (this.aClass352_1.anIntArray617[arg1] != local191) {
				throw new RuntimeException();
			}
			if (this.aClass352_1.aByteArrayArray26 != null && this.aClass352_1.aByteArrayArray26[arg1] != null) {
				local222 = this.aClass352_1.aByteArrayArray26[arg1];
				local231 = Static152.method2720(0, local164, local164.length - 2);
				for (local233 = 0; local233 < 64; local233++) {
					if (local231[local233] != local222[local233]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(270) int local270 = (local164[local164.length - 1] & 0xFF) + ((local164[local164.length - 2] & 0xFF) << 8);
			if ((this.aClass352_1.anIntArray615[arg1] & 0xFFFF) != local270) {
				throw new RuntimeException();
			}
			if (this.aByteArray84[arg1] != 1) {
				this.anInt8516++;
				this.aByteArray84[arg1] = 1;
			}
			if (!local13.aBoolean127) {
				local13.method8682();
			}
			return local13;
		} catch (@Pc(311) Exception local311) {
			this.aByteArray84[arg1] = -1;
			local13.method8682();
			if (local13.aBoolean127 && !this.aClass323_3.method7839()) {
				local339 = this.aClass323_3.method7834(arg1, true, this.anInt8511, (byte) 2);
				this.aClass25_38.method434((long) arg1, local339);
			}
			return null;
		}
	}
}
