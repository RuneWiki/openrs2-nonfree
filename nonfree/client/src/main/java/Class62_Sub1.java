import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!tb;")
	private Class304 aClass304_1;

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	private int anInt2274 = 0;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "Lclient!bc;")
	private final Class25 aClass25_9 = new Class25(16);

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	private int anInt2287 = 0;

	@OriginalMember(owner = "client!dj", name = "M", descriptor = "Lclient!ki;")
	private final Class183 aClass183_11 = new Class183();

	@OriginalMember(owner = "client!dj", name = "Q", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	private final int anInt2277;

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "Lclient!sd;")
	private final Class294 aClass294_5;

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!dj", name = "K", descriptor = "Lclient!ki;")
	private Class183 aClass183_10;

	@OriginalMember(owner = "client!dj", name = "P", descriptor = "Z")
	private final boolean aBoolean179;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "Lclient!rs;")
	private final Class289 aClass289_1;

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
	private final int anInt2280;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "Lclient!sd;")
	private final Class294 aClass294_4;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!wb;")
	private final Class349 aClass349_2;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
	private final int anInt2286;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "Lclient!el;")
	private Class3_Sub4_Sub8 aClass3_Sub4_Sub8_1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILclient!sd;Lclient!sd;Lclient!rs;Lclient!wb;I[BIZ)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class294 arg1, @OriginalArg(2) Class294 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) Class349 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2277 = arg0;
		this.aClass294_5 = arg1;
		if (this.aClass294_5 == null) {
			this.aBoolean178 = false;
		} else {
			this.aBoolean178 = true;
			this.aClass183_10 = new Class183();
		}
		this.aBoolean179 = arg8;
		this.aClass289_1 = arg3;
		this.anInt2280 = arg7;
		this.aClass294_4 = arg2;
		this.aClass349_2 = arg4;
		this.aByteArray29 = arg6;
		this.anInt2286 = arg5;
		if (this.aClass294_4 != null) {
			this.aClass3_Sub4_Sub8_1 = this.aClass349_2.method8175(this.aClass294_4, this.anInt2277);
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I")
	public int method2081() {
		return this.anInt2274;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)I")
	public int method2082() {
		if (this.aClass304_1 == null) {
			return 0;
		} else if (this.aBoolean178) {
			@Pc(25) Class3 local25 = this.aClass183_10.method4795();
			return local25 == null ? 0 : (int) local25.aLong262;
		} else {
			return this.aClass304_1.anInt9148;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Lclient!el;")
	private Class3_Sub4_Sub8 method2083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class3_Sub4_Sub8 local11 = (Class3_Sub4_Sub8) this.aClass25_9.method946((long) arg1);
		if (local11 != null && arg0 == 0 && !local11.aBoolean780 && local11.aBoolean781) {
			local11.method8412();
			local11 = null;
		}
		if (local11 == null) {
			if (arg0 == 0) {
				if (this.aClass294_5 == null || this.aByteArray30[arg1] == -1) {
					if (this.aClass289_1.method7100()) {
						return null;
					}
					local11 = this.aClass289_1.method7091(true, arg1, this.anInt2277, (byte) 2);
				} else {
					local11 = this.aClass349_2.method8175(this.aClass294_5, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass294_5 == null) {
					throw new RuntimeException();
				}
				local11 = this.aClass349_2.method8177(this.aClass294_5, arg1);
			} else if (arg0 == 2) {
				if (this.aClass294_5 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray30[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass289_1.method7093()) {
					return null;
				}
				local11 = this.aClass289_1.method7091(false, arg1, this.anInt2277, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass25_9.method945(local11, (long) arg1);
		}
		if (local11.aBoolean781) {
			return null;
		}
		@Pc(152) byte[] local152 = local11.method7551();
		@Pc(184) int local184;
		@Pc(215) byte[] local215;
		@Pc(224) byte[] local224;
		@Pc(226) int local226;
		@Pc(335) Class3_Sub4_Sub8_Sub2 local335;
		if (!(local11 instanceof Class3_Sub4_Sub8_Sub1)) {
			try {
				label157: {
					if (local152 != null && local152.length > 2) {
						Static365.aCRC32_1.reset();
						Static365.aCRC32_1.update(local152, 0, local152.length - 2);
						local184 = (int) Static365.aCRC32_1.getValue();
						if (this.aClass304_1.anIntArray591[arg1] != local184) {
							throw new RuntimeException();
						}
						if (this.aClass304_1.aByteArrayArray29 == null || this.aClass304_1.aByteArrayArray29[arg1] == null) {
							break label157;
						}
						local215 = this.aClass304_1.aByteArrayArray29[arg1];
						local224 = Static284.method6244(local152.length - 2, local152, 0);
						local226 = 0;
						while (true) {
							if (local226 >= 64) {
								break label157;
							}
							if (local224[local226] != local215[local226]) {
								throw new RuntimeException();
							}
							local226++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass289_1.anInt8681 = 0;
				this.aClass289_1.anInt8680 = 0;
			} catch (@Pc(440) RuntimeException local440) {
				this.aClass289_1.method7095();
				local11.method8412();
				if (local11.aBoolean780 && !this.aClass289_1.method7100()) {
					local335 = this.aClass289_1.method7091(true, arg1, this.anInt2277, (byte) 2);
					this.aClass25_9.method945(local335, (long) arg1);
				}
				return null;
			}
			local152[local152.length - 2] = (byte) (this.aClass304_1.anIntArray594[arg1] >>> 8);
			local152[local152.length - 1] = (byte) this.aClass304_1.anIntArray594[arg1];
			if (this.aClass294_5 != null) {
				this.aClass349_2.method8178(arg1, this.aClass294_5, local152);
				if (this.aByteArray30[arg1] != 1) {
					this.anInt2274++;
					this.aByteArray30[arg1] = 1;
				}
			}
			if (!local11.aBoolean780) {
				local11.method8412();
			}
			return local11;
		}
		try {
			if (local152 == null || local152.length <= 2) {
				throw new RuntimeException();
			}
			Static365.aCRC32_1.reset();
			Static365.aCRC32_1.update(local152, 0, local152.length - 2);
			local184 = (int) Static365.aCRC32_1.getValue();
			if (local184 != this.aClass304_1.anIntArray591[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass304_1.aByteArrayArray29 != null && this.aClass304_1.aByteArrayArray29[arg1] != null) {
				local215 = this.aClass304_1.aByteArrayArray29[arg1];
				local224 = Static284.method6244(local152.length - 2, local152, 0);
				for (local226 = 0; local226 < 64; local226++) {
					if (local215[local226] != local224[local226]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(266) int local266 = (local152[local152.length - 1] & 0xFF) + ((local152[local152.length - 2] & 0xFF) << 8);
			if (local266 != (this.aClass304_1.anIntArray594[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray30[arg1] != 1) {
				this.anInt2274++;
				this.aByteArray30[arg1] = 1;
			}
			if (!local11.aBoolean780) {
				local11.method8412();
			}
			return local11;
		} catch (@Pc(309) Exception local309) {
			this.aByteArray30[arg1] = -1;
			local11.method8412();
			if (local11.aBoolean780 && !this.aClass289_1.method7100()) {
				local335 = this.aClass289_1.method7091(true, arg1, this.anInt2277, (byte) 2);
				this.aClass25_9.method945(local335, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lclient!tb;")
	@Override
	public Class304 method2080() {
		if (this.aClass304_1 != null) {
			return this.aClass304_1;
		}
		if (this.aClass3_Sub4_Sub8_1 == null) {
			if (this.aClass289_1.method7100()) {
				return null;
			}
			this.aClass3_Sub4_Sub8_1 = this.aClass289_1.method7091(true, this.anInt2277, 255, (byte) 0);
		}
		if (this.aClass3_Sub4_Sub8_1.aBoolean781) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass3_Sub4_Sub8_1.method7551();
		if (this.aClass3_Sub4_Sub8_1 instanceof Class3_Sub4_Sub8_Sub1) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass304_1 = new Class304(local49, this.anInt2286, this.aByteArray29);
				if (this.aClass304_1.anInt9153 != this.anInt2280) {
					throw new RuntimeException();
				}
			} catch (@Pc(143) RuntimeException local143) {
				this.aClass304_1 = null;
				if (this.aClass289_1.method7100()) {
					this.aClass3_Sub4_Sub8_1 = null;
				} else {
					this.aClass3_Sub4_Sub8_1 = this.aClass289_1.method7091(true, this.anInt2277, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass304_1 = new Class304(local49, this.anInt2286, this.aByteArray29);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass289_1.method7095();
				this.aClass304_1 = null;
				if (this.aClass289_1.method7100()) {
					this.aClass3_Sub4_Sub8_1 = null;
				} else {
					this.aClass3_Sub4_Sub8_1 = this.aClass289_1.method7091(true, this.anInt2277, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass294_4 != null) {
				this.aClass349_2.method8178(this.anInt2277, this.aClass294_4, local49);
			}
		}
		this.aClass3_Sub4_Sub8_1 = null;
		if (this.aClass294_5 != null) {
			this.anInt2274 = 0;
			this.aByteArray30 = new byte[this.aClass304_1.anInt9149];
		}
		return this.aClass304_1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	@Override
	public int method2074(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub8 local11 = (Class3_Sub4_Sub8) this.aClass25_9.method946((long) arg0);
		return local11 == null ? 0 : local11.method7554();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)I")
	public int method2085() {
		return this.aClass304_1 == null ? 0 : this.aClass304_1.anInt9148;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
	@Override
	public void method2073(@OriginalArg(1) int arg0) {
		if (this.aClass294_5 == null) {
			return;
		}
		for (@Pc(14) Class3 local14 = this.aClass183_11.method4795(); local14 != null; local14 = this.aClass183_11.method4793()) {
			if ((long) arg0 == local14.aLong262) {
				return;
			}
		}
		@Pc(46) Class3 local46 = new Class3();
		local46.aLong262 = arg0;
		this.aClass183_11.method4792(local46);
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I")
	public int method2086() {
		if (this.method2080() == null) {
			return this.aClass3_Sub4_Sub8_1 == null ? 0 : this.aClass3_Sub4_Sub8_1.method7554();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
	public void method2087() {
		if (this.aClass183_10 != null) {
			if (this.method2080() == null) {
				return;
			}
			@Pc(30) boolean local30;
			@Pc(35) Class3 local35;
			@Pc(41) int local41;
			@Pc(131) Class3 local131;
			if (this.aBoolean178) {
				local30 = true;
				for (local35 = this.aClass183_10.method4795(); local35 != null; local35 = this.aClass183_10.method4793()) {
					local41 = (int) local35.aLong262;
					if (this.aByteArray30[local41] == 0) {
						this.method2083(1, local41);
					}
					if (this.aByteArray30[local41] == 0) {
						local30 = false;
					} else {
						local35.method8412();
					}
				}
				while (this.anInt2287 < this.aClass304_1.anIntArray590.length) {
					if (this.aClass304_1.anIntArray590[this.anInt2287] == 0) {
						this.anInt2287++;
					} else {
						if (this.aClass349_2.anInt10080 >= 250) {
							local30 = false;
							break;
						}
						if (this.aByteArray30[this.anInt2287] == 0) {
							this.method2083(1, this.anInt2287);
						}
						if (this.aByteArray30[this.anInt2287] == 0) {
							local131 = new Class3();
							local131.aLong262 = this.anInt2287;
							this.aClass183_10.method4792(local131);
							local30 = false;
						}
						this.anInt2287++;
					}
				}
				if (local30) {
					this.anInt2287 = 0;
					this.aBoolean178 = false;
				}
			} else if (this.aBoolean177) {
				local30 = true;
				for (local35 = this.aClass183_10.method4795(); local35 != null; local35 = this.aClass183_10.method4793()) {
					local41 = (int) local35.aLong262;
					if (this.aByteArray30[local41] != 1) {
						this.method2083(2, local41);
					}
					if (this.aByteArray30[local41] == 1) {
						local35.method8412();
					} else {
						local30 = false;
					}
				}
				while (this.anInt2287 < this.aClass304_1.anIntArray590.length) {
					if (this.aClass304_1.anIntArray590[this.anInt2287] == 0) {
						this.anInt2287++;
					} else {
						if (this.aClass289_1.method7093()) {
							local30 = false;
							break;
						}
						if (this.aByteArray30[this.anInt2287] != 1) {
							this.method2083(2, this.anInt2287);
						}
						if (this.aByteArray30[this.anInt2287] != 1) {
							local131 = new Class3();
							local131.aLong262 = this.anInt2287;
							this.aClass183_10.method4792(local131);
							local30 = false;
						}
						this.anInt2287++;
					}
				}
				if (local30) {
					this.aBoolean177 = false;
					this.anInt2287 = 0;
				}
			} else {
				this.aClass183_10 = null;
			}
		}
		if (!this.aBoolean179 || Static376.method6088() < this.aLong75) {
			return;
		}
		for (@Pc(326) Class3_Sub4_Sub8 local326 = (Class3_Sub4_Sub8) this.aClass25_9.method949(); local326 != null; local326 = (Class3_Sub4_Sub8) this.aClass25_9.method947()) {
			if (!local326.aBoolean781) {
				if (local326.aBoolean779) {
					if (!local326.aBoolean780) {
						throw new RuntimeException();
					}
					local326.method8412();
				} else {
					local326.aBoolean779 = true;
				}
			}
		}
		this.aLong75 = Static376.method6088() + 1000L;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
	public void method2088() {
		if (this.aClass183_10 == null || this.method2080() == null) {
			return;
		}
		for (@Pc(27) Class3 local27 = this.aClass183_11.method4795(); local27 != null; local27 = this.aClass183_11.method4793()) {
			@Pc(33) int local33 = (int) local27.aLong262;
			if (local33 < 0 || this.aClass304_1.anInt9149 <= local33 || this.aClass304_1.anIntArray590[local33] == 0) {
				local27.method8412();
			} else {
				if (this.aByteArray30[local33] == 0) {
					this.method2083(1, local33);
				}
				if (this.aByteArray30[local33] == -1) {
					this.method2083(2, local33);
				}
				if (this.aByteArray30[local33] == 1) {
					local27.method8412();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method2078(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub4_Sub8 local9 = this.method2083(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method7551();
			local9.method8412();
			return local23;
		}
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
	public void method2089() {
		if (this.aClass294_5 != null) {
			this.aBoolean177 = true;
			if (this.aClass183_10 == null) {
				this.aClass183_10 = new Class183();
			}
		}
	}
}
