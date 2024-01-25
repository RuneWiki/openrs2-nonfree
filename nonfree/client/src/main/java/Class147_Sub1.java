import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "Lclient!lia;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "client!hba", name = "C", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
	private int anInt3608 = 0;

	@OriginalMember(owner = "client!hba", name = "K", descriptor = "Lclient!lba;")
	private final Class218 aClass218_19 = new Class218(16);

	@OriginalMember(owner = "client!hba", name = "H", descriptor = "I")
	private int anInt3610 = 0;

	@OriginalMember(owner = "client!hba", name = "u", descriptor = "Lclient!cga;")
	private final Class60 aClass60_76 = new Class60();

	@OriginalMember(owner = "client!hba", name = "E", descriptor = "J")
	private long aLong126 = 0L;

	@OriginalMember(owner = "client!hba", name = "M", descriptor = "I")
	private final int anInt3595;

	@OriginalMember(owner = "client!hba", name = "z", descriptor = "Lclient!wia;")
	private final Class402 aClass402_2;

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "Lclient!cga;")
	private Class60 aClass60_75;

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "Lclient!wia;")
	private final Class402 aClass402_1;

	@OriginalMember(owner = "client!hba", name = "J", descriptor = "Z")
	private final boolean aBoolean324;

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
	private final int anInt3605;

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
	private final int anInt3601;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "Lclient!dw;")
	private final Class92 aClass92_1;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "Lclient!qfa;")
	private final Class309 aClass309_2;

	@OriginalMember(owner = "client!hba", name = "w", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!hba", name = "q", descriptor = "Lclient!gt;")
	private Class2_Sub6_Sub1 aClass2_Sub6_Sub1_1;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(ILclient!wia;Lclient!wia;Lclient!qfa;Lclient!dw;I[BIZ)V")
	public Class147_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) Class402 arg2, @OriginalArg(3) Class309 arg3, @OriginalArg(4) Class92 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt3595 = arg0;
		this.aClass402_2 = arg1;
		if (this.aClass402_2 == null) {
			this.aBoolean323 = false;
		} else {
			this.aBoolean323 = true;
			this.aClass60_75 = new Class60();
		}
		this.aClass402_1 = arg2;
		this.aBoolean324 = arg8;
		this.anInt3605 = arg5;
		this.anInt3601 = arg7;
		this.aClass92_1 = arg4;
		this.aClass309_2 = arg3;
		this.aByteArray46 = arg6;
		if (this.aClass402_1 != null) {
			this.aClass2_Sub6_Sub1_1 = this.aClass92_1.method1897(this.aClass402_1, this.anInt3595);
		}
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(II)I")
	@Override
	public int method3241(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub6_Sub1 local11 = (Class2_Sub6_Sub1) this.aClass218_19.method5095((long) arg0, 0);
		return local11 == null ? 0 : local11.method8702();
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	@Override
	public void method3243(@OriginalArg(1) int arg0) {
		if (this.aClass402_2 == null) {
			return;
		}
		for (@Pc(27) Class2 local27 = this.aClass60_76.method1226(7); local27 != null; local27 = this.aClass60_76.method1228()) {
			if (local27.aLong352 == (long) arg0) {
				return;
			}
		}
		@Pc(50) Class2 local50 = new Class2();
		local50.aLong352 = (long) arg0;
		this.aClass60_76.method1233(local50);
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)I")
	public int method3245() {
		return this.anInt3608;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BII)Lclient!gt;")
	private Class2_Sub6_Sub1 method3246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub6_Sub1 local13 = (Class2_Sub6_Sub1) this.aClass218_19.method5095((long) arg1, 0);
		if (local13 != null && arg0 == 0 && !local13.aBoolean843 && local13.aBoolean842) {
			local13.method9872();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass402_2 == null || this.aByteArray45[arg1] == -1) {
					if (this.aClass309_2.method7256()) {
						return null;
					}
					local13 = this.aClass309_2.method7259(arg1, (byte) 2, true, this.anInt3595);
				} else {
					local13 = this.aClass92_1.method1897(this.aClass402_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass402_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass92_1.method1901(arg1, this.aClass402_2);
			} else if (arg0 == 2) {
				if (this.aClass402_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray45[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass309_2.method7269()) {
					return null;
				}
				local13 = this.aClass309_2.method7259(arg1, (byte) 2, false, this.anInt3595);
			} else {
				throw new RuntimeException();
			}
			this.aClass218_19.method5099(local13, (long) arg1);
		}
		if (local13.aBoolean842) {
			return null;
		}
		@Pc(188) byte[] local188 = local13.method8700();
		@Pc(218) int local218;
		@Pc(252) byte[] local252;
		@Pc(261) byte[] local261;
		@Pc(263) int local263;
		@Pc(382) Class2_Sub6_Sub1_Sub1 local382;
		if (!(local13 instanceof Class2_Sub6_Sub1_Sub2)) {
			try {
				label157: {
					if (local188 != null && local188.length > 2) {
						Static71.aCRC32_4.reset();
						Static71.aCRC32_4.update(local188, 0, local188.length - 2);
						local218 = (int) Static71.aCRC32_4.getValue();
						if (local218 != this.aClass224_1.anIntArray385[arg1]) {
							throw new RuntimeException();
						}
						if (this.aClass224_1.aByteArrayArray11 == null || this.aClass224_1.aByteArrayArray11[arg1] == null) {
							break label157;
						}
						local252 = this.aClass224_1.aByteArrayArray11[arg1];
						local261 = Static323.method4463(local188, 0, local188.length - 2);
						local263 = 0;
						while (true) {
							if (local263 >= 64) {
								break label157;
							}
							if (local252[local263] != local261[local263]) {
								throw new RuntimeException();
							}
							local263++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass309_2.anInt8154 = 0;
				this.aClass309_2.anInt8155 = 0;
			} catch (@Pc(495) RuntimeException local495) {
				this.aClass309_2.method7255();
				local13.method9872();
				if (local13.aBoolean843 && !this.aClass309_2.method7256()) {
					local382 = this.aClass309_2.method7259(arg1, (byte) 2, true, this.anInt3595);
					this.aClass218_19.method5099(local382, (long) arg1);
				}
				return null;
			}
			local188[local188.length - 2] = (byte) (this.aClass224_1.anIntArray389[arg1] >>> 8);
			local188[local188.length - 1] = (byte) this.aClass224_1.anIntArray389[arg1];
			if (this.aClass402_2 != null) {
				this.aClass92_1.method1900(local188, this.aClass402_2, arg1);
				if (this.aByteArray45[arg1] != 1) {
					this.anInt3608++;
					this.aByteArray45[arg1] = 1;
				}
			}
			if (!local13.aBoolean843) {
				local13.method9872();
			}
			return local13;
		}
		try {
			if (local188 == null || local188.length <= 2) {
				throw new RuntimeException();
			}
			Static71.aCRC32_4.reset();
			Static71.aCRC32_4.update(local188, 0, local188.length - 2);
			local218 = (int) Static71.aCRC32_4.getValue();
			if (this.aClass224_1.anIntArray385[arg1] != local218) {
				throw new RuntimeException();
			}
			if (this.aClass224_1.aByteArrayArray11 != null && this.aClass224_1.aByteArrayArray11[arg1] != null) {
				local252 = this.aClass224_1.aByteArrayArray11[arg1];
				local261 = Static323.method4463(local188, 0, local188.length - 2);
				for (local263 = 0; local263 < 64; local263++) {
					if (local252[local263] != local261[local263]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(308) int local308 = ((local188[local188.length - 2] & 0xFF) << 8) + (local188[local188.length - 1] & 0xFF);
			if ((this.aClass224_1.anIntArray389[arg1] & 0xFFFF) != local308) {
				throw new RuntimeException();
			}
			if (this.aByteArray45[arg1] != 1) {
				this.anInt3608++;
				this.aByteArray45[arg1] = 1;
			}
			if (!local13.aBoolean843) {
				local13.method9872();
			}
			return local13;
		} catch (@Pc(354) Exception local354) {
			this.aByteArray45[arg1] = -1;
			local13.method9872();
			if (local13.aBoolean843 && !this.aClass309_2.method7256()) {
				local382 = this.aClass309_2.method7259(arg1, (byte) 2, true, this.anInt3595);
				this.aClass218_19.method5099(local382, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3240(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub6_Sub1 local9 = this.method3246(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method8700();
			local9.method9872();
			return local18;
		}
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(B)V")
	public void method3247() {
		if (this.aClass402_2 != null) {
			this.aBoolean322 = true;
			if (this.aClass60_75 == null) {
				this.aClass60_75 = new Class60();
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(B)I")
	public int method3248() {
		if (this.method3237() == null) {
			return this.aClass2_Sub6_Sub1_1 == null ? 0 : this.aClass2_Sub6_Sub1_1.method8702();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)Lclient!lia;")
	@Override
	public Class224 method3237() {
		if (this.aClass224_1 != null) {
			return this.aClass224_1;
		}
		if (this.aClass2_Sub6_Sub1_1 == null) {
			if (this.aClass309_2.method7256()) {
				return null;
			}
			this.aClass2_Sub6_Sub1_1 = this.aClass309_2.method7259(this.anInt3595, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub6_Sub1_1.aBoolean842) {
			return null;
		}
		@Pc(54) byte[] local54 = this.aClass2_Sub6_Sub1_1.method8700();
		if (this.aClass2_Sub6_Sub1_1 instanceof Class2_Sub6_Sub1_Sub2) {
			try {
				if (local54 == null) {
					throw new RuntimeException();
				}
				this.aClass224_1 = new Class224(local54, this.anInt3605, this.aByteArray46);
				if (this.aClass224_1.anInt5831 != this.anInt3601) {
					throw new RuntimeException();
				}
			} catch (@Pc(161) RuntimeException local161) {
				this.aClass224_1 = null;
				if (this.aClass309_2.method7256()) {
					this.aClass2_Sub6_Sub1_1 = null;
				} else {
					this.aClass2_Sub6_Sub1_1 = this.aClass309_2.method7259(this.anInt3595, (byte) 0, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local54 == null) {
					throw new RuntimeException();
				}
				this.aClass224_1 = new Class224(local54, this.anInt3605, this.aByteArray46);
			} catch (@Pc(77) RuntimeException local77) {
				this.aClass309_2.method7255();
				this.aClass224_1 = null;
				if (this.aClass309_2.method7256()) {
					this.aClass2_Sub6_Sub1_1 = null;
				} else {
					this.aClass2_Sub6_Sub1_1 = this.aClass309_2.method7259(this.anInt3595, (byte) 0, true, 255);
				}
				return null;
			}
			if (this.aClass402_1 != null) {
				this.aClass92_1.method1900(local54, this.aClass402_1, this.anInt3595);
			}
		}
		if (this.aClass402_2 != null) {
			this.anInt3608 = 0;
			this.aByteArray45 = new byte[this.aClass224_1.anInt5834];
		}
		this.aClass2_Sub6_Sub1_1 = null;
		return this.aClass224_1;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)I")
	public int method3249() {
		if (this.aClass224_1 == null) {
			return 0;
		} else if (this.aBoolean323) {
			@Pc(30) Class2 local30 = this.aClass60_75.method1226(7);
			return local30 == null ? 0 : (int) local30.aLong352;
		} else {
			return this.aClass224_1.anInt5835;
		}
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
	public void method3250() {
		if (this.aClass60_75 != null) {
			if (this.method3237() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class2 local31;
			@Pc(37) int local37;
			@Pc(143) Class2 local143;
			if (this.aBoolean323) {
				local26 = true;
				for (local31 = this.aClass60_75.method1226(7); local31 != null; local31 = this.aClass60_75.method1228()) {
					local37 = (int) local31.aLong352;
					if (this.aByteArray45[local37] == 0) {
						this.method3246(1, local37);
					}
					if (this.aByteArray45[local37] == 0) {
						local26 = false;
					} else {
						local31.method9872();
					}
				}
				while (this.anInt3610 < this.aClass224_1.anIntArray386.length) {
					if (this.aClass224_1.anIntArray386[this.anInt3610] == 0) {
						this.anInt3610++;
					} else {
						if (this.aClass92_1.anInt2156 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray45[this.anInt3610] == 0) {
							this.method3246(1, this.anInt3610);
						}
						if (this.aByteArray45[this.anInt3610] == 0) {
							local143 = new Class2();
							local143.aLong352 = (long) this.anInt3610;
							this.aClass60_75.method1233(local143);
							local26 = false;
						}
						this.anInt3610++;
					}
				}
				if (local26) {
					this.anInt3610 = 0;
					this.aBoolean323 = false;
				}
			} else if (this.aBoolean322) {
				local26 = true;
				for (local31 = this.aClass60_75.method1226(7); local31 != null; local31 = this.aClass60_75.method1228()) {
					local37 = (int) local31.aLong352;
					if (this.aByteArray45[local37] != 1) {
						this.method3246(2, local37);
					}
					if (this.aByteArray45[local37] == 1) {
						local31.method9872();
					} else {
						local26 = false;
					}
				}
				while (this.anInt3610 < this.aClass224_1.anIntArray386.length) {
					if (this.aClass224_1.anIntArray386[this.anInt3610] == 0) {
						this.anInt3610++;
					} else {
						if (this.aClass309_2.method7269()) {
							local26 = false;
							break;
						}
						if (this.aByteArray45[this.anInt3610] != 1) {
							this.method3246(2, this.anInt3610);
						}
						if (this.aByteArray45[this.anInt3610] != 1) {
							local143 = new Class2();
							local143.aLong352 = (long) this.anInt3610;
							this.aClass60_75.method1233(local143);
							local26 = false;
						}
						this.anInt3610++;
					}
				}
				if (local26) {
					this.aBoolean322 = false;
					this.anInt3610 = 0;
				}
			} else {
				this.aClass60_75 = null;
			}
		}
		if (!this.aBoolean324 || Static567.method7863() < this.aLong126) {
			return;
		}
		for (@Pc(366) Class2_Sub6_Sub1 local366 = (Class2_Sub6_Sub1) this.aClass218_19.method5092(); local366 != null; local366 = (Class2_Sub6_Sub1) this.aClass218_19.method5096()) {
			if (!local366.aBoolean842) {
				if (local366.aBoolean844) {
					if (!local366.aBoolean843) {
						throw new RuntimeException();
					}
					local366.method9872();
				} else {
					local366.aBoolean844 = true;
				}
			}
		}
		this.aLong126 = Static567.method7863() + 1000L;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	public void method3251(@OriginalArg(0) int arg0) {
		if (this.aClass60_75 == null || this.method3237() == null) {
			return;
		}
		for (@Pc(23) Class2 local23 = this.aClass60_76.method1226(arg0 + 29980); local23 != null; local23 = this.aClass60_76.method1228()) {
			@Pc(31) int local31 = (int) local23.aLong352;
			if (local31 < 0 || local31 >= this.aClass224_1.anInt5834 || this.aClass224_1.anIntArray386[local31] == 0) {
				local23.method9872();
			} else {
				if (this.aByteArray45[local31] == 0) {
					this.method3246(1, local31);
				}
				if (this.aByteArray45[local31] == -1) {
					this.method3246(2, local31);
				}
				if (this.aByteArray45[local31] == 1) {
					local23.method9872();
				}
			}
		}
		if (arg0 != -29973) {
			this.method3251(105);
		}
	}

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "(B)I")
	public int method3252() {
		return this.aClass224_1 == null ? 0 : this.aClass224_1.anInt5835;
	}
}
