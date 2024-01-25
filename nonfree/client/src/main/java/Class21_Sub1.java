import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "Lclient!lca;")
	private Class220 aClass220_1;

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "Z")
	private boolean aBoolean384;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "I")
	private int anInt5058 = 0;

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_32 = new Class74(16);

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
	private int anInt5072 = 0;

	@OriginalMember(owner = "client!jba", name = "C", descriptor = "Lclient!tf;")
	private final Class340 aClass340_36 = new Class340();

	@OriginalMember(owner = "client!jba", name = "I", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
	private final int anInt5060;

	@OriginalMember(owner = "client!jba", name = "N", descriptor = "Lclient!nha;")
	private final Class251 aClass251_2;

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "Lclient!tf;")
	private Class340 aClass340_35;

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
	private final int anInt5062;

	@OriginalMember(owner = "client!jba", name = "P", descriptor = "I")
	private final int anInt5059;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "Lclient!nha;")
	private final Class251 aClass251_3;

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "Lclient!jh;")
	private final Class189 aClass189_3;

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "Lclient!jg;")
	private final Class188 aClass188_3;

	@OriginalMember(owner = "client!jba", name = "L", descriptor = "Lclient!qv;")
	private Class6_Sub2_Sub1 aClass6_Sub2_Sub1_1;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(ILclient!nha;Lclient!nha;Lclient!jh;Lclient!jg;I[BIZ)V")
	public Class21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class189 arg3, @OriginalArg(4) Class188 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt5060 = arg0;
		this.aClass251_2 = arg1;
		if (this.aClass251_2 == null) {
			this.aBoolean383 = false;
		} else {
			this.aBoolean383 = true;
			this.aClass340_35 = new Class340();
		}
		this.anInt5062 = arg5;
		this.anInt5059 = arg7;
		this.aBoolean385 = arg8;
		this.aByteArray40 = arg6;
		this.aClass251_3 = arg2;
		this.aClass189_3 = arg3;
		this.aClass188_3 = arg4;
		if (this.aClass251_3 != null) {
			this.aClass6_Sub2_Sub1_1 = this.aClass188_3.method4667(this.anInt5060, this.aClass251_3);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)I")
	public int method4620() {
		return this.anInt5058;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Lclient!lca;")
	@Override
	public Class220 method4614() {
		if (this.aClass220_1 != null) {
			return this.aClass220_1;
		}
		if (this.aClass6_Sub2_Sub1_1 == null) {
			if (this.aClass189_3.method4685()) {
				return null;
			}
			this.aClass6_Sub2_Sub1_1 = this.aClass189_3.method4688((byte) 0, this.anInt5060, 255, true);
		}
		if (this.aClass6_Sub2_Sub1_1.aBoolean259) {
			return null;
		}
		@Pc(58) byte[] local58 = this.aClass6_Sub2_Sub1_1.method3112();
		if (this.aClass6_Sub2_Sub1_1 instanceof Class6_Sub2_Sub1_Sub2) {
			try {
				if (local58 == null) {
					throw new RuntimeException();
				}
				this.aClass220_1 = new Class220(local58, this.anInt5062, this.aByteArray40);
				if (this.aClass220_1.anInt5739 != this.anInt5059) {
					throw new RuntimeException();
				}
			} catch (@Pc(91) RuntimeException local91) {
				this.aClass220_1 = null;
				if (this.aClass189_3.method4685()) {
					this.aClass6_Sub2_Sub1_1 = null;
				} else {
					this.aClass6_Sub2_Sub1_1 = this.aClass189_3.method4688((byte) 0, this.anInt5060, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local58 == null) {
					throw new RuntimeException();
				}
				this.aClass220_1 = new Class220(local58, this.anInt5062, this.aByteArray40);
			} catch (@Pc(140) RuntimeException local140) {
				this.aClass189_3.method4689();
				this.aClass220_1 = null;
				if (this.aClass189_3.method4685()) {
					this.aClass6_Sub2_Sub1_1 = null;
				} else {
					this.aClass6_Sub2_Sub1_1 = this.aClass189_3.method4688((byte) 0, this.anInt5060, 255, true);
				}
				return null;
			}
			if (this.aClass251_3 != null) {
				this.aClass188_3.method4665(local58, this.anInt5060, this.aClass251_3);
			}
		}
		this.aClass6_Sub2_Sub1_1 = null;
		if (this.aClass251_2 != null) {
			this.anInt5058 = 0;
			this.aByteArray41 = new byte[this.aClass220_1.anInt5735];
		}
		return this.aClass220_1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method4617(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub2_Sub1 local9 = this.method4623(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method3112();
			local9.method9051();
			return local18;
		}
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)V")
	public void method4622() {
		if (this.aClass340_35 == null || this.method4614() == null) {
			return;
		}
		for (@Pc(21) Class6 local21 = this.aClass340_36.method8124(); local21 != null; local21 = this.aClass340_36.method8134()) {
			@Pc(36) int local36 = (int) local21.aLong346;
			if (local36 < 0 || local36 >= this.aClass220_1.anInt5735 || this.aClass220_1.anIntArray338[local36] == 0) {
				local21.method9051();
			} else {
				if (this.aByteArray41[local36] == 0) {
					this.method4623(1, local36);
				}
				if (this.aByteArray41[local36] == -1) {
					this.method4623(2, local36);
				}
				if (this.aByteArray41[local36] == 1) {
					local21.method9051();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BII)Lclient!qv;")
	private Class6_Sub2_Sub1 method4623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub1 local13 = (Class6_Sub2_Sub1) this.aClass74_32.method1401((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean257 && local13.aBoolean259) {
			local13.method9051();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass251_2 == null || this.aByteArray41[arg1] == -1) {
					if (this.aClass189_3.method4685()) {
						return null;
					}
					local13 = this.aClass189_3.method4688((byte) 2, arg1, this.anInt5060, true);
				} else {
					local13 = this.aClass188_3.method4667(arg1, this.aClass251_2);
				}
			} else if (arg0 == 1) {
				if (this.aClass251_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass188_3.method4666(this.aClass251_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass251_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray41[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass189_3.method4677()) {
					return null;
				}
				local13 = this.aClass189_3.method4688((byte) 2, arg1, this.anInt5060, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass74_32.method1399(local13, (long) arg1);
		}
		if (local13.aBoolean259) {
			return null;
		}
		@Pc(180) byte[] local180 = local13.method3112();
		@Pc(220) int local220;
		@Pc(254) byte[] local254;
		@Pc(263) byte[] local263;
		@Pc(265) int local265;
		@Pc(382) Class6_Sub2_Sub1_Sub1 local382;
		if (!(local13 instanceof Class6_Sub2_Sub1_Sub2)) {
			try {
				label157: {
					if (local180 != null && local180.length > 2) {
						Static210.aCRC32_1.reset();
						Static210.aCRC32_1.update(local180, 0, local180.length - 2);
						local220 = (int) Static210.aCRC32_1.getValue();
						if (this.aClass220_1.anIntArray339[arg1] != local220) {
							throw new RuntimeException();
						}
						if (this.aClass220_1.aByteArrayArray105 == null || this.aClass220_1.aByteArrayArray105[arg1] == null) {
							break label157;
						}
						local254 = this.aClass220_1.aByteArrayArray105[arg1];
						local263 = Static269.method4566(local180.length - 2, 0, local180);
						local265 = 0;
						while (true) {
							if (local265 >= 64) {
								break label157;
							}
							if (local263[local265] != local254[local265]) {
								throw new RuntimeException();
							}
							local265++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass189_3.anInt5126 = 0;
				this.aClass189_3.anInt5127 = 0;
			} catch (@Pc(493) RuntimeException local493) {
				this.aClass189_3.method4689();
				local13.method9051();
				if (local13.aBoolean257 && !this.aClass189_3.method4685()) {
					local382 = this.aClass189_3.method4688((byte) 2, arg1, this.anInt5060, true);
					this.aClass74_32.method1399(local382, (long) arg1);
				}
				return null;
			}
			local180[local180.length - 2] = (byte) (this.aClass220_1.anIntArray335[arg1] >>> 8);
			local180[local180.length - 1] = (byte) this.aClass220_1.anIntArray335[arg1];
			if (this.aClass251_2 != null) {
				this.aClass188_3.method4665(local180, arg1, this.aClass251_2);
				if (this.aByteArray41[arg1] != 1) {
					this.anInt5058++;
					this.aByteArray41[arg1] = 1;
				}
			}
			if (!local13.aBoolean257) {
				local13.method9051();
			}
			return local13;
		}
		try {
			if (local180 == null || local180.length <= 2) {
				throw new RuntimeException();
			}
			Static210.aCRC32_1.reset();
			Static210.aCRC32_1.update(local180, 0, local180.length - 2);
			local220 = (int) Static210.aCRC32_1.getValue();
			if (this.aClass220_1.anIntArray339[arg1] != local220) {
				throw new RuntimeException();
			}
			if (this.aClass220_1.aByteArrayArray105 != null && this.aClass220_1.aByteArrayArray105[arg1] != null) {
				local254 = this.aClass220_1.aByteArrayArray105[arg1];
				local263 = Static269.method4566(local180.length - 2, 0, local180);
				for (local265 = 0; local265 < 64; local265++) {
					if (local254[local265] != local263[local265]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(306) int local306 = ((local180[local180.length - 2] & 0xFF) << 8) + (local180[local180.length - 1] & 0xFF);
			if ((this.aClass220_1.anIntArray335[arg1] & 0xFFFF) != local306) {
				throw new RuntimeException();
			}
			if (this.aByteArray41[arg1] != 1) {
				this.anInt5058++;
				this.aByteArray41[arg1] = 1;
			}
			if (!local13.aBoolean257) {
				local13.method9051();
			}
			return local13;
		} catch (@Pc(354) Exception local354) {
			this.aByteArray41[arg1] = -1;
			local13.method9051();
			if (local13.aBoolean257 && !this.aClass189_3.method4685()) {
				local382 = this.aClass189_3.method4688((byte) 2, arg1, this.anInt5060, true);
				this.aClass74_32.method1399(local382, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZI)I")
	@Override
	public int method4618(@OriginalArg(1) int arg0) {
		@Pc(19) Class6_Sub2_Sub1 local19 = (Class6_Sub2_Sub1) this.aClass74_32.method1401((long) arg0);
		return local19 == null ? 0 : local19.method3115();
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)I")
	public int method4626() {
		if (this.method4614() == null) {
			return this.aClass6_Sub2_Sub1_1 == null ? 0 : this.aClass6_Sub2_Sub1_1.method3115();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)V")
	public void method4627() {
		if (this.aClass251_2 != null) {
			this.aBoolean384 = true;
			if (this.aClass340_35 == null) {
				this.aClass340_35 = new Class340();
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)V")
	public void method4628() {
		if (this.aClass340_35 != null) {
			if (this.method4614() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class6 local26;
			@Pc(32) int local32;
			@Pc(134) Class6 local134;
			if (this.aBoolean383) {
				local21 = true;
				for (local26 = this.aClass340_35.method8124(); local26 != null; local26 = this.aClass340_35.method8134()) {
					local32 = (int) local26.aLong346;
					if (this.aByteArray41[local32] == 0) {
						this.method4623(1, local32);
					}
					if (this.aByteArray41[local32] == 0) {
						local21 = false;
					} else {
						local26.method9051();
					}
				}
				while (this.anInt5072 < this.aClass220_1.anIntArray338.length) {
					if (this.aClass220_1.anIntArray338[this.anInt5072] == 0) {
						this.anInt5072++;
					} else {
						if (this.aClass188_3.anInt5101 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray41[this.anInt5072] == 0) {
							this.method4623(1, this.anInt5072);
						}
						if (this.aByteArray41[this.anInt5072] == 0) {
							local134 = new Class6();
							local134.aLong346 = (long) this.anInt5072;
							this.aClass340_35.method8131(local134);
							local21 = false;
						}
						this.anInt5072++;
					}
				}
				if (local21) {
					this.anInt5072 = 0;
					this.aBoolean383 = false;
				}
			} else if (this.aBoolean384) {
				local21 = true;
				for (local26 = this.aClass340_35.method8124(); local26 != null; local26 = this.aClass340_35.method8134()) {
					local32 = (int) local26.aLong346;
					if (this.aByteArray41[local32] != 1) {
						this.method4623(2, local32);
					}
					if (this.aByteArray41[local32] == 1) {
						local26.method9051();
					} else {
						local21 = false;
					}
				}
				while (this.anInt5072 < this.aClass220_1.anIntArray338.length) {
					if (this.aClass220_1.anIntArray338[this.anInt5072] == 0) {
						this.anInt5072++;
					} else {
						if (this.aClass189_3.method4677()) {
							local21 = false;
							break;
						}
						if (this.aByteArray41[this.anInt5072] != 1) {
							this.method4623(2, this.anInt5072);
						}
						if (this.aByteArray41[this.anInt5072] != 1) {
							local134 = new Class6();
							local134.aLong346 = (long) this.anInt5072;
							local21 = false;
							this.aClass340_35.method8131(local134);
						}
						this.anInt5072++;
					}
				}
				if (local21) {
					this.anInt5072 = 0;
					this.aBoolean384 = false;
				}
			} else {
				this.aClass340_35 = null;
			}
		}
		if (!this.aBoolean385 || this.aLong161 > Static549.method7758()) {
			return;
		}
		for (@Pc(361) Class6_Sub2_Sub1 local361 = (Class6_Sub2_Sub1) this.aClass74_32.method1404(); local361 != null; local361 = (Class6_Sub2_Sub1) this.aClass74_32.method1405()) {
			if (!local361.aBoolean259) {
				if (local361.aBoolean256) {
					if (!local361.aBoolean257) {
						throw new RuntimeException();
					}
					local361.method9051();
				} else {
					local361.aBoolean256 = true;
				}
			}
		}
		this.aLong161 = Static549.method7758() + 1000L;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)V")
	@Override
	public void method4616(@OriginalArg(0) int arg0) {
		if (this.aClass251_2 == null) {
			return;
		}
		for (@Pc(15) Class6 local15 = this.aClass340_36.method8124(); local15 != null; local15 = this.aClass340_36.method8134()) {
			if (local15.aLong346 == (long) arg0) {
				return;
			}
		}
		@Pc(42) Class6 local42 = new Class6();
		local42.aLong346 = (long) arg0;
		this.aClass340_36.method8131(local42);
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(B)I")
	public int method4629() {
		if (this.aClass220_1 == null) {
			return 0;
		} else if (this.aBoolean383) {
			@Pc(22) Class6 local22 = this.aClass340_35.method8124();
			return local22 == null ? 0 : (int) local22.aLong346;
		} else {
			return this.aClass220_1.anInt5738;
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I")
	public int method4630() {
		return this.aClass220_1 == null ? 0 : this.aClass220_1.anInt5738;
	}
}
