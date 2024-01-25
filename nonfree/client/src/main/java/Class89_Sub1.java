import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class89_Sub1 extends Class89 {

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Lclient!kd;")
	private Class191 aClass191_2;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
	private int anInt2350 = 0;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "Lclient!dj;")
	private final Class66 aClass66_11 = new Class66(16);

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	private int anInt2356 = 0;

	@OriginalMember(owner = "client!eh", name = "G", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_15 = new Class163();

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
	private final int anInt2346;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "Lclient!tc;")
	private final Class343 aClass343_2;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "Lclient!ifa;")
	private Class163 aClass163_16;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "Lclient!ob;")
	private final Class260 aClass260_1;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	private final int anInt2351;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!rda;")
	private final Class309 aClass309_1;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "Z")
	private final boolean aBoolean167;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	private final int anInt2353;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!tc;")
	private final Class343 aClass343_1;

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "Lclient!an;")
	private Class4_Sub5_Sub2 aClass4_Sub5_Sub2_1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(ILclient!tc;Lclient!tc;Lclient!ob;Lclient!rda;I[BIZ)V")
	public Class89_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class260 arg3, @OriginalArg(4) Class309 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2346 = arg0;
		this.aClass343_2 = arg1;
		if (this.aClass343_2 == null) {
			this.aBoolean166 = false;
		} else {
			this.aBoolean166 = true;
			this.aClass163_16 = new Class163();
		}
		this.aByteArray32 = arg6;
		this.aClass260_1 = arg3;
		this.anInt2351 = arg5;
		this.aClass309_1 = arg4;
		this.aBoolean167 = arg8;
		this.anInt2353 = arg7;
		this.aClass343_1 = arg2;
		if (this.aClass343_1 != null) {
			this.aClass4_Sub5_Sub2_1 = this.aClass309_1.method6950(this.aClass343_1, this.anInt2346);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public void method2237() {
		if (this.aClass163_16 != null) {
			if (this.method2233() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class4 local26;
			@Pc(32) int local32;
			@Pc(119) Class4 local119;
			if (this.aBoolean166) {
				local21 = true;
				for (local26 = this.aClass163_16.method3639(); local26 != null; local26 = this.aClass163_16.method3640()) {
					local32 = (int) local26.aLong307;
					if (this.aByteArray31[local32] == 0) {
						this.method2239(1, local32);
					}
					if (this.aByteArray31[local32] == 0) {
						local21 = false;
					} else {
						local26.method9000();
					}
				}
				while (this.anInt2356 < this.aClass191_2.anIntArray359.length) {
					if (this.aClass191_2.anIntArray359[this.anInt2356] == 0) {
						this.anInt2356++;
					} else {
						if (this.aClass309_1.anInt7987 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray31[this.anInt2356] == 0) {
							this.method2239(1, this.anInt2356);
						}
						if (this.aByteArray31[this.anInt2356] == 0) {
							local119 = new Class4();
							local119.aLong307 = (long) this.anInt2356;
							this.aClass163_16.method3646(local119);
							local21 = false;
						}
						this.anInt2356++;
					}
				}
				if (local21) {
					this.aBoolean166 = false;
					this.anInt2356 = 0;
				}
			} else if (this.aBoolean165) {
				local21 = true;
				for (local26 = this.aClass163_16.method3639(); local26 != null; local26 = this.aClass163_16.method3640()) {
					local32 = (int) local26.aLong307;
					if (this.aByteArray31[local32] != 1) {
						this.method2239(2, local32);
					}
					if (this.aByteArray31[local32] == 1) {
						local26.method9000();
					} else {
						local21 = false;
					}
				}
				while (this.anInt2356 < this.aClass191_2.anIntArray359.length) {
					if (this.aClass191_2.anIntArray359[this.anInt2356] == 0) {
						this.anInt2356++;
					} else {
						if (this.aClass260_1.method5877()) {
							local21 = false;
							break;
						}
						if (this.aByteArray31[this.anInt2356] != 1) {
							this.method2239(2, this.anInt2356);
						}
						if (this.aByteArray31[this.anInt2356] != 1) {
							local119 = new Class4();
							local119.aLong307 = (long) this.anInt2356;
							local21 = false;
							this.aClass163_16.method3646(local119);
						}
						this.anInt2356++;
					}
				}
				if (local21) {
					this.aBoolean165 = false;
					this.anInt2356 = 0;
				}
			} else {
				this.aClass163_16 = null;
			}
		}
		if (!this.aBoolean167 || this.aLong82 > Static429.method5935()) {
			return;
		}
		for (@Pc(326) Class4_Sub5_Sub2 local326 = (Class4_Sub5_Sub2) this.aClass66_11.method1992(); local326 != null; local326 = (Class4_Sub5_Sub2) this.aClass66_11.method1984()) {
			if (!local326.aBoolean535) {
				if (local326.aBoolean536) {
					if (!local326.aBoolean537) {
						throw new RuntimeException();
					}
					local326.method9000();
				} else {
					local326.aBoolean536 = true;
				}
			}
		}
		this.aLong82 = Static429.method5935() + 1000L;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
	public void method2238() {
		if (this.aClass163_16 == null || this.method2233() == null) {
			return;
		}
		for (@Pc(19) Class4 local19 = this.aClass163_15.method3639(); local19 != null; local19 = this.aClass163_15.method3640()) {
			@Pc(25) int local25 = (int) local19.aLong307;
			if (local25 < 0 || local25 >= this.aClass191_2.anInt4782 || this.aClass191_2.anIntArray359[local25] == 0) {
				local19.method9000();
			} else {
				if (this.aByteArray31[local25] == 0) {
					this.method2239(1, local25);
				}
				if (this.aByteArray31[local25] == -1) {
					this.method2239(2, local25);
				}
				if (this.aByteArray31[local25] == 1) {
					local19.method9000();
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lclient!an;")
	private Class4_Sub5_Sub2 method2239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class4_Sub5_Sub2 local18 = (Class4_Sub5_Sub2) this.aClass66_11.method1994((long) arg1);
		if (local18 != null && arg0 == 0 && !local18.aBoolean537 && local18.aBoolean535) {
			local18.method9000();
			local18 = null;
		}
		if (local18 == null) {
			if (arg0 == 0) {
				if (this.aClass343_2 == null || this.aByteArray31[arg1] == -1) {
					if (this.aClass260_1.method5879()) {
						return null;
					}
					local18 = this.aClass260_1.method5880(arg1, true, (byte) 2, this.anInt2346);
				} else {
					local18 = this.aClass309_1.method6950(this.aClass343_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass343_2 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass309_1.method6949(arg1, this.aClass343_2);
			} else if (arg0 == 2) {
				if (this.aClass343_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray31[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass260_1.method5877()) {
					return null;
				}
				local18 = this.aClass260_1.method5880(arg1, false, (byte) 2, this.anInt2346);
			} else {
				throw new RuntimeException();
			}
			this.aClass66_11.method1985(local18, (long) arg1);
		}
		if (local18.aBoolean535) {
			return null;
		}
		@Pc(158) byte[] local158 = local18.method6084();
		@Pc(185) int local185;
		@Pc(212) byte[] local212;
		@Pc(221) byte[] local221;
		@Pc(223) int local223;
		@Pc(277) Class4_Sub5_Sub2_Sub1 local277;
		if (!(local18 instanceof Class4_Sub5_Sub2_Sub2)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static461.aCRC32_1.reset();
				Static461.aCRC32_1.update(local158, 0, local158.length - 2);
				local185 = (int) Static461.aCRC32_1.getValue();
				if (local185 != this.aClass191_2.anIntArray364[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass191_2.aByteArrayArray15 != null && this.aClass191_2.aByteArrayArray15[arg1] != null) {
					local212 = this.aClass191_2.aByteArrayArray15[arg1];
					local221 = Static249.method3664(local158, 0, local158.length - 2);
					for (local223 = 0; local223 < 64; local223++) {
						if (local212[local223] != local221[local223]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass260_1.anInt6703 = 0;
				this.aClass260_1.anInt6704 = 0;
			} catch (@Pc(252) RuntimeException local252) {
				this.aClass260_1.method5878();
				local18.method9000();
				if (local18.aBoolean537 && !this.aClass260_1.method5879()) {
					local277 = this.aClass260_1.method5880(arg1, true, (byte) 2, this.anInt2346);
					this.aClass66_11.method1985(local277, (long) arg1);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass191_2.anIntArray362[arg1] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass191_2.anIntArray362[arg1];
			if (this.aClass343_2 != null) {
				this.aClass309_1.method6948(this.aClass343_2, local158, arg1);
				if (this.aByteArray31[arg1] != 1) {
					this.anInt2350++;
					this.aByteArray31[arg1] = 1;
				}
			}
			if (!local18.aBoolean537) {
				local18.method9000();
			}
			return local18;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static461.aCRC32_1.reset();
			Static461.aCRC32_1.update(local158, 0, local158.length - 2);
			local185 = (int) Static461.aCRC32_1.getValue();
			if (local185 != this.aClass191_2.anIntArray364[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass191_2.aByteArrayArray15 != null && this.aClass191_2.aByteArrayArray15[arg1] != null) {
				local212 = this.aClass191_2.aByteArrayArray15[arg1];
				local221 = Static249.method3664(local158, 0, local158.length - 2);
				for (local223 = 0; local223 < 64; local223++) {
					if (local221[local223] != local212[local223]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(456) int local456 = (local158[local158.length - 1] & 0xFF) + ((local158[local158.length - 2] & 0xFF) << 8);
			if ((this.aClass191_2.anIntArray362[arg1] & 0xFFFF) != local456) {
				throw new RuntimeException();
			}
			if (this.aByteArray31[arg1] != 1) {
				this.anInt2350++;
				this.aByteArray31[arg1] = 1;
			}
			if (!local18.aBoolean537) {
				local18.method9000();
			}
			return local18;
		} catch (@Pc(499) Exception local499) {
			this.aByteArray31[arg1] = -1;
			local18.method9000();
			if (local18.aBoolean537 && !this.aClass260_1.method5879()) {
				local277 = this.aClass260_1.method5880(arg1, true, (byte) 2, this.anInt2346);
				this.aClass66_11.method1985(local277, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2234(@OriginalArg(1) int arg0) {
		@Pc(17) Class4_Sub5_Sub2 local17 = (Class4_Sub5_Sub2) this.aClass66_11.method1994((long) arg0);
		return local17 == null ? 0 : local17.method6087();
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)I")
	public int method2240() {
		return this.anInt2350;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)V")
	public void method2241() {
		if (this.aClass343_2 != null) {
			this.aBoolean165 = true;
			if (this.aClass163_16 == null) {
				this.aClass163_16 = new Class163();
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Lclient!kd;")
	@Override
	public Class191 method2233() {
		if (this.aClass191_2 != null) {
			return this.aClass191_2;
		}
		if (this.aClass4_Sub5_Sub2_1 == null) {
			if (this.aClass260_1.method5879()) {
				return null;
			}
			this.aClass4_Sub5_Sub2_1 = this.aClass260_1.method5880(this.anInt2346, true, (byte) 0, 255);
		}
		if (this.aClass4_Sub5_Sub2_1.aBoolean535) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub5_Sub2_1.method6084();
		if (this.aClass4_Sub5_Sub2_1 instanceof Class4_Sub5_Sub2_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass191_2 = new Class191(local43, this.anInt2351, this.aByteArray32);
				if (this.anInt2353 != this.aClass191_2.anInt4787) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass191_2 = null;
				if (this.aClass260_1.method5879()) {
					this.aClass4_Sub5_Sub2_1 = null;
				} else {
					this.aClass4_Sub5_Sub2_1 = this.aClass260_1.method5880(this.anInt2346, true, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass191_2 = new Class191(local43, this.anInt2351, this.aByteArray32);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass260_1.method5878();
				this.aClass191_2 = null;
				if (this.aClass260_1.method5879()) {
					this.aClass4_Sub5_Sub2_1 = null;
				} else {
					this.aClass4_Sub5_Sub2_1 = this.aClass260_1.method5880(this.anInt2346, true, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass343_1 != null) {
				this.aClass309_1.method6948(this.aClass343_1, local43, this.anInt2346);
			}
		}
		if (this.aClass343_2 != null) {
			this.aByteArray31 = new byte[this.aClass191_2.anInt4782];
			this.anInt2350 = 0;
		}
		this.aClass4_Sub5_Sub2_1 = null;
		return this.aClass191_2;
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(Z)I")
	public int method2242() {
		if (this.aClass191_2 == null) {
			return 0;
		} else if (this.aBoolean166) {
			@Pc(26) Class4 local26 = this.aClass163_16.method3639();
			return local26 == null ? 0 : (int) local26.aLong307;
		} else {
			return this.aClass191_2.anInt4780;
		}
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(Z)I")
	public int method2244() {
		return this.aClass191_2 == null ? 0 : this.aClass191_2.anInt4780;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)I")
	public int method2246() {
		if (this.method2233() == null) {
			return this.aClass4_Sub5_Sub2_1 == null ? 0 : this.aClass4_Sub5_Sub2_1.method6087();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method2231(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub5_Sub2 local9 = this.method2239(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method6084();
			local9.method9000();
			return local25;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(ZI)V")
	@Override
	public void method2235(@OriginalArg(1) int arg0) {
		if (this.aClass343_2 == null) {
			return;
		}
		for (@Pc(18) Class4 local18 = this.aClass163_15.method3639(); local18 != null; local18 = this.aClass163_15.method3640()) {
			if ((long) arg0 == local18.aLong307) {
				return;
			}
		}
		@Pc(38) Class4 local38 = new Class4();
		local38.aLong307 = (long) arg0;
		this.aClass163_15.method3646(local38);
	}
}
