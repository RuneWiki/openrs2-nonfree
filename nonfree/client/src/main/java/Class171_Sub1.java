import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class171_Sub1 extends Class171 {

	@OriginalMember(owner = "client!ik", name = "q", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "Lclient!c;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Z")
	private boolean aBoolean436;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
	private int anInt5035 = 0;

	@OriginalMember(owner = "client!ik", name = "M", descriptor = "Lclient!gn;")
	private final Class136 aClass136_25 = new Class136(16);

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	private int anInt5051 = 0;

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "Lclient!tj;")
	private final Class357 aClass357_24 = new Class357();

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "Lclient!dka;")
	private final Class73 aClass73_2;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
	private final int anInt5050;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Z")
	private boolean aBoolean435;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "Lclient!tj;")
	private Class357 aClass357_25;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "Lclient!nn;")
	private final Class259 aClass259_1;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	private final int anInt5044;

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "Z")
	private final boolean aBoolean437;

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Lclient!dka;")
	private final Class73 aClass73_3;

	@OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
	private final int anInt5047;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "Lclient!hja;")
	private final Class153 aClass153_1;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!id;")
	private Class3_Sub4_Sub10 aClass3_Sub4_Sub10_1;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ILclient!dka;Lclient!dka;Lclient!hja;Lclient!nn;I[BIZ)V")
	public Class171_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) Class153 arg3, @OriginalArg(4) Class259 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass73_2 = arg1;
		this.anInt5050 = arg0;
		if (this.aClass73_2 == null) {
			this.aBoolean435 = false;
		} else {
			this.aBoolean435 = true;
			this.aClass357_25 = new Class357();
		}
		this.aClass259_1 = arg4;
		this.anInt5044 = arg7;
		this.aBoolean437 = arg8;
		this.aClass73_3 = arg2;
		this.anInt5047 = arg5;
		this.aClass153_1 = arg3;
		this.aByteArray35 = arg6;
		if (this.aClass73_3 != null) {
			this.aClass3_Sub4_Sub10_1 = this.aClass259_1.method6366(this.anInt5050, this.aClass73_3);
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)I")
	public int method4220() {
		return this.anInt5035;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(Z)V")
	public void method4221() {
		if (this.aClass357_25 == null || this.method4217() == null) {
			return;
		}
		for (@Pc(21) Class3 local21 = this.aClass357_24.method8391(); local21 != null; local21 = this.aClass357_24.method8392()) {
			@Pc(27) int local27 = (int) local21.aLong382;
			if (local27 < 0 || this.aClass41_1.anInt1031 <= local27 || this.aClass41_1.anIntArray75[local27] == 0) {
				local21.method9446();
			} else {
				if (this.aByteArray34[local27] == 0) {
					this.method4231(1, local27);
				}
				if (this.aByteArray34[local27] == -1) {
					this.method4231(2, local27);
				}
				if (this.aByteArray34[local27] == 1) {
					local21.method9446();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(Z)V")
	public void method4223() {
		if (this.aClass357_25 != null) {
			if (this.method4217() == null) {
				return;
			}
			@Pc(41) boolean local41;
			@Pc(46) Class3 local46;
			@Pc(52) int local52;
			@Pc(151) Class3 local151;
			if (this.aBoolean435) {
				local41 = true;
				for (local46 = this.aClass357_25.method8391(); local46 != null; local46 = this.aClass357_25.method8392()) {
					local52 = (int) local46.aLong382;
					if (this.aByteArray34[local52] == 0) {
						this.method4231(1, local52);
					}
					if (this.aByteArray34[local52] == 0) {
						local41 = false;
					} else {
						local46.method9446();
					}
				}
				while (this.aClass41_1.anIntArray75.length > this.anInt5051) {
					if (this.aClass41_1.anIntArray75[this.anInt5051] == 0) {
						this.anInt5051++;
					} else {
						if (this.aClass259_1.anInt7604 >= 250) {
							local41 = false;
							break;
						}
						if (this.aByteArray34[this.anInt5051] == 0) {
							this.method4231(1, this.anInt5051);
						}
						if (this.aByteArray34[this.anInt5051] == 0) {
							local151 = new Class3();
							local151.aLong382 = (long) this.anInt5051;
							this.aClass357_25.method8401(local151);
							local41 = false;
						}
						this.anInt5051++;
					}
				}
				if (local41) {
					this.aBoolean435 = false;
					this.anInt5051 = 0;
				}
			} else if (this.aBoolean436) {
				local41 = true;
				for (local46 = this.aClass357_25.method8391(); local46 != null; local46 = this.aClass357_25.method8392()) {
					local52 = (int) local46.aLong382;
					if (this.aByteArray34[local52] != 1) {
						this.method4231(2, local52);
					}
					if (this.aByteArray34[local52] == 1) {
						local46.method9446();
					} else {
						local41 = false;
					}
				}
				while (this.aClass41_1.anIntArray75.length > this.anInt5051) {
					if (this.aClass41_1.anIntArray75[this.anInt5051] == 0) {
						this.anInt5051++;
					} else {
						if (this.aClass153_1.method3734()) {
							local41 = false;
							break;
						}
						if (this.aByteArray34[this.anInt5051] != 1) {
							this.method4231(2, this.anInt5051);
						}
						if (this.aByteArray34[this.anInt5051] != 1) {
							local151 = new Class3();
							local151.aLong382 = (long) this.anInt5051;
							local41 = false;
							this.aClass357_25.method8401(local151);
						}
						this.anInt5051++;
					}
				}
				if (local41) {
					this.anInt5051 = 0;
					this.aBoolean436 = false;
				}
			} else {
				this.aClass357_25 = null;
			}
		}
		if (!this.aBoolean437 || Static626.method8479() < this.aLong172) {
			return;
		}
		for (@Pc(359) Class3_Sub4_Sub10 local359 = (Class3_Sub4_Sub10) this.aClass136_25.method3509(); local359 != null; local359 = (Class3_Sub4_Sub10) this.aClass136_25.method3506()) {
			if (!local359.aBoolean389) {
				if (local359.aBoolean390) {
					if (!local359.aBoolean388) {
						throw new RuntimeException();
					}
					local359.method9446();
				} else {
					local359.aBoolean390 = true;
				}
			}
		}
		this.aLong172 = Static626.method8479() + 1000L;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I")
	public int method4226() {
		if (this.method4217() == null) {
			return this.aClass3_Sub4_Sub10_1 == null ? 0 : this.aClass3_Sub4_Sub10_1.method3688();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)I")
	public int method4227() {
		return this.aClass41_1 == null ? 0 : this.aClass41_1.anInt1032;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V")
	@Override
	public void method4214(@OriginalArg(0) int arg0) {
		if (this.aClass73_2 == null) {
			return;
		}
		for (@Pc(15) Class3 local15 = this.aClass357_24.method8391(); local15 != null; local15 = this.aClass357_24.method8392()) {
			if ((long) arg0 == local15.aLong382) {
				return;
			}
		}
		@Pc(43) Class3 local43 = new Class3();
		local43.aLong382 = (long) arg0;
		this.aClass357_24.method8401(local43);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(Z)V")
	public void method4228() {
		if (this.aClass73_2 != null) {
			this.aBoolean436 = true;
			if (this.aClass357_25 == null) {
				this.aClass357_25 = new Class357();
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4219(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub10 local11 = (Class3_Sub4_Sub10) this.aClass136_25.method3503((long) arg0);
		return local11 == null ? 0 : local11.method3688();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4216(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub10 local9 = this.method4231(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method3686();
			local9.method9446();
			return local18;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)Lclient!c;")
	@Override
	public Class41 method4217() {
		if (this.aClass41_1 != null) {
			return this.aClass41_1;
		}
		if (this.aClass3_Sub4_Sub10_1 == null) {
			if (this.aClass153_1.method3743()) {
				return null;
			}
			this.aClass3_Sub4_Sub10_1 = this.aClass153_1.method3747(255, true, this.anInt5050, (byte) 0);
		}
		if (this.aClass3_Sub4_Sub10_1.aBoolean389) {
			return null;
		}
		@Pc(57) byte[] local57 = this.aClass3_Sub4_Sub10_1.method3686();
		if (this.aClass3_Sub4_Sub10_1 instanceof Class3_Sub4_Sub10_Sub2) {
			try {
				if (local57 == null) {
					throw new RuntimeException();
				}
				this.aClass41_1 = new Class41(local57, this.anInt5047, this.aByteArray35);
				if (this.aClass41_1.anInt1030 != this.anInt5044) {
					throw new RuntimeException();
				}
			} catch (@Pc(160) RuntimeException local160) {
				this.aClass41_1 = null;
				if (this.aClass153_1.method3743()) {
					this.aClass3_Sub4_Sub10_1 = null;
				} else {
					this.aClass3_Sub4_Sub10_1 = this.aClass153_1.method3747(255, true, this.anInt5050, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local57 == null) {
					throw new RuntimeException();
				}
				this.aClass41_1 = new Class41(local57, this.anInt5047, this.aByteArray35);
			} catch (@Pc(80) RuntimeException local80) {
				this.aClass153_1.method3746();
				this.aClass41_1 = null;
				if (this.aClass153_1.method3743()) {
					this.aClass3_Sub4_Sub10_1 = null;
				} else {
					this.aClass3_Sub4_Sub10_1 = this.aClass153_1.method3747(255, true, this.anInt5050, (byte) 0);
				}
				return null;
			}
			if (this.aClass73_3 != null) {
				this.aClass259_1.method6362(local57, this.aClass73_3, this.anInt5050);
			}
		}
		if (this.aClass73_2 != null) {
			this.aByteArray34 = new byte[this.aClass41_1.anInt1031];
			this.anInt5035 = 0;
		}
		this.aClass3_Sub4_Sub10_1 = null;
		return this.aClass41_1;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)I")
	public int method4229() {
		if (this.aClass41_1 == null) {
			return 0;
		} else if (this.aBoolean435) {
			@Pc(30) Class3 local30 = this.aClass357_25.method8391();
			return local30 == null ? 0 : (int) local30.aLong382;
		} else {
			return this.aClass41_1.anInt1032;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Lclient!id;")
	private Class3_Sub4_Sub10 method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub4_Sub10 local13 = (Class3_Sub4_Sub10) this.aClass136_25.method3503((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean388 && local13.aBoolean389) {
			local13.method9446();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass73_2 == null || this.aByteArray34[arg1] == -1) {
					if (this.aClass153_1.method3743()) {
						return null;
					}
					local13 = this.aClass153_1.method3747(this.anInt5050, true, arg1, (byte) 2);
				} else {
					local13 = this.aClass259_1.method6366(arg1, this.aClass73_2);
				}
			} else if (arg0 == 1) {
				if (this.aClass73_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass259_1.method6367(arg1, this.aClass73_2);
			} else if (arg0 == 2) {
				if (this.aClass73_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray34[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass153_1.method3734()) {
					return null;
				}
				local13 = this.aClass153_1.method3747(this.anInt5050, false, arg1, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass136_25.method3508((long) arg1, local13);
		}
		if (local13.aBoolean389) {
			return null;
		}
		@Pc(184) byte[] local184 = local13.method3686();
		@Pc(222) int local222;
		@Pc(252) byte[] local252;
		@Pc(261) byte[] local261;
		@Pc(263) int local263;
		@Pc(324) Class3_Sub4_Sub10_Sub1 local324;
		if (!(local13 instanceof Class3_Sub4_Sub10_Sub2)) {
			try {
				if (local184 == null || local184.length <= 2) {
					throw new RuntimeException();
				}
				Static78.aCRC32_1.reset();
				Static78.aCRC32_1.update(local184, 0, local184.length - 2);
				local222 = (int) Static78.aCRC32_1.getValue();
				if (this.aClass41_1.anIntArray72[arg1] != local222) {
					throw new RuntimeException();
				}
				if (this.aClass41_1.aByteArrayArray1 != null && this.aClass41_1.aByteArrayArray1[arg1] != null) {
					local252 = this.aClass41_1.aByteArrayArray1[arg1];
					local261 = Static79.method1032(0, local184.length - 2, local184);
					for (local263 = 0; local263 < 64; local263++) {
						if (local261[local263] != local252[local263]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass153_1.anInt4578 = 0;
				this.aClass153_1.anInt4577 = 0;
			} catch (@Pc(297) RuntimeException local297) {
				this.aClass153_1.method3746();
				local13.method9446();
				if (local13.aBoolean388 && !this.aClass153_1.method3743()) {
					local324 = this.aClass153_1.method3747(this.anInt5050, true, arg1, (byte) 2);
					this.aClass136_25.method3508((long) arg1, local324);
				}
				return null;
			}
			local184[local184.length - 2] = (byte) (this.aClass41_1.anIntArray74[arg1] >>> 8);
			local184[local184.length - 1] = (byte) this.aClass41_1.anIntArray74[arg1];
			if (this.aClass73_2 != null) {
				this.aClass259_1.method6362(local184, this.aClass73_2, arg1);
				if (this.aByteArray34[arg1] != 1) {
					this.anInt5035++;
					this.aByteArray34[arg1] = 1;
				}
			}
			if (!local13.aBoolean388) {
				local13.method9446();
			}
			return local13;
		}
		try {
			if (local184 == null || local184.length <= 2) {
				throw new RuntimeException();
			}
			Static78.aCRC32_1.reset();
			Static78.aCRC32_1.update(local184, 0, local184.length - 2);
			local222 = (int) Static78.aCRC32_1.getValue();
			if (local222 != this.aClass41_1.anIntArray72[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass41_1.aByteArrayArray1 != null && this.aClass41_1.aByteArrayArray1[arg1] != null) {
				local252 = this.aClass41_1.aByteArrayArray1[arg1];
				local261 = Static79.method1032(0, local184.length - 2, local184);
				for (local263 = 0; local263 < 64; local263++) {
					if (local252[local263] != local261[local263]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(517) int local517 = ((local184[local184.length - 2] & 0xFF) << 8) + (local184[local184.length - 1] & 0xFF);
			if (local517 != (this.aClass41_1.anIntArray74[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray34[arg1] != 1) {
				this.anInt5035++;
				this.aByteArray34[arg1] = 1;
			}
			if (!local13.aBoolean388) {
				local13.method9446();
			}
			return local13;
		} catch (@Pc(561) Exception local561) {
			this.aByteArray34[arg1] = -1;
			local13.method9446();
			if (local13.aBoolean388 && !this.aClass153_1.method3743()) {
				local324 = this.aClass153_1.method3747(this.anInt5050, true, arg1, (byte) 2);
				this.aClass136_25.method3508((long) arg1, local324);
			}
			return null;
		}
	}
}
