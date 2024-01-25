import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "Lclient!ma;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	private int anInt3435 = 0;

	@OriginalMember(owner = "client!hs", name = "n", descriptor = "Lclient!bu;")
	private final Class38 aClass38_17 = new Class38(16);

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
	private int anInt3448 = 0;

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "Lclient!pu;")
	private final Class203 aClass203_20 = new Class203();

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "J")
	private long aLong96 = 0L;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	private final int anInt3432;

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "Lclient!pd;")
	private final Class195 aClass195_2;

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "Z")
	private boolean aBoolean203;

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "Lclient!pu;")
	private Class203 aClass203_21;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "Z")
	private final boolean aBoolean204;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!pd;")
	private final Class195 aClass195_3;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "Lclient!lq;")
	private final Class159 aClass159_1;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	private final int anInt3436;

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
	private final int anInt3431;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!dk;")
	private final Class58 aClass58_1;

	@OriginalMember(owner = "client!hs", name = "m", descriptor = "Lclient!dn;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILclient!pd;Lclient!pd;Lclient!lq;Lclient!dk;IIZ)V")
	public Class111_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class195 arg1, @OriginalArg(2) Class195 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) Class58 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3432 = arg0;
		this.aClass195_2 = arg1;
		if (this.aClass195_2 == null) {
			this.aBoolean203 = false;
		} else {
			this.aBoolean203 = true;
			this.aClass203_21 = new Class203();
		}
		this.aBoolean204 = arg7;
		this.aClass195_3 = arg2;
		this.aClass159_1 = arg3;
		this.anInt3436 = arg5;
		this.anInt3431 = arg6;
		this.aClass58_1 = arg4;
		if (this.aClass195_3 != null) {
			this.aClass1_Sub1_Sub6_1 = this.aClass58_1.method1424(this.anInt3432, this.aClass195_3);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BII)Lclient!dn;")
	private Class1_Sub1_Sub6 method2677(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub1_Sub6 local13 = (Class1_Sub1_Sub6) this.aClass38_17.method765((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean511 && local13.aBoolean512) {
			local13.method6178();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass195_2 == null || this.aByteArray43[arg0] == -1) {
					if (this.aClass159_1.method3617()) {
						return null;
					}
					local13 = this.aClass159_1.method3610(arg0, true, this.anInt3432, (byte) 2);
				} else {
					local13 = this.aClass58_1.method1424(arg0, this.aClass195_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass195_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass58_1.method1423(arg0, this.aClass195_2);
			} else if (arg1 == 2) {
				if (this.aClass195_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray43[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass159_1.method3618()) {
					return null;
				}
				local13 = this.aClass159_1.method3610(arg0, false, this.anInt3432, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass38_17.method766(local13, (long) arg0);
		}
		if (local13.aBoolean512) {
			return null;
		}
		@Pc(164) byte[] local164 = local13.method6095();
		@Pc(193) int local193;
		@Pc(243) Class1_Sub1_Sub6_Sub2 local243;
		if (!(local13 instanceof Class1_Sub1_Sub6_Sub1)) {
			try {
				if (local164 == null || local164.length <= 2) {
					throw new RuntimeException();
				}
				Static434.aCRC32_1.reset();
				Static434.aCRC32_1.update(local164, 0, local164.length - 2);
				local193 = (int) Static434.aCRC32_1.getValue();
				if (local193 != this.aClass165_1.anIntArray446[arg0]) {
					throw new RuntimeException();
				}
				this.aClass159_1.anInt4705 = 0;
				this.aClass159_1.anInt4704 = 0;
			} catch (@Pc(218) RuntimeException local218) {
				this.aClass159_1.method3620();
				local13.method6178();
				if (local13.aBoolean511 && !this.aClass159_1.method3617()) {
					local243 = this.aClass159_1.method3610(arg0, true, this.anInt3432, (byte) 2);
					this.aClass38_17.method766(local243, (long) arg0);
				}
				return null;
			}
			local164[local164.length - 2] = (byte) (this.aClass165_1.anIntArray444[arg0] >>> 8);
			local164[local164.length - 1] = (byte) this.aClass165_1.anIntArray444[arg0];
			if (this.aClass195_2 != null) {
				this.aClass58_1.method1419(arg0, local164, this.aClass195_2);
				if (this.aByteArray43[arg0] != 1) {
					this.anInt3435++;
					this.aByteArray43[arg0] = 1;
				}
			}
			if (!local13.aBoolean511) {
				local13.method6178();
			}
			return local13;
		}
		try {
			if (local164 == null || local164.length <= 2) {
				throw new RuntimeException();
			}
			Static434.aCRC32_1.reset();
			Static434.aCRC32_1.update(local164, 0, local164.length - 2);
			local193 = (int) Static434.aCRC32_1.getValue();
			if (local193 != this.aClass165_1.anIntArray446[arg0]) {
				throw new RuntimeException();
			}
			@Pc(370) int local370 = ((local164[local164.length - 2] & 0xFF) << 8) + (local164[local164.length - 1] & 0xFF);
			if (local370 != (this.aClass165_1.anIntArray444[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray43[arg0] != 1) {
				this.anInt3435++;
				this.aByteArray43[arg0] = 1;
			}
			if (!local13.aBoolean511) {
				local13.method6178();
			}
			return local13;
		} catch (@Pc(415) Exception local415) {
			this.aByteArray43[arg0] = -1;
			local13.method6178();
			if (local13.aBoolean511 && !this.aClass159_1.method3617()) {
				local243 = this.aClass159_1.method3610(arg0, true, this.anInt3432, (byte) 2);
				this.aClass38_17.method766(local243, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)V")
	@Override
	public void method2673(@OriginalArg(0) int arg0) {
		if (this.aClass195_2 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass203_20.method4548(); local14 != null; local14 = this.aClass203_20.method4545()) {
			if (local14.aLong228 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong228 = arg0;
		this.aClass203_20.method4551(local38);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	public void method2678() {
		if (this.aClass203_21 != null) {
			if (this.method2675() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class1 local29;
			@Pc(35) int local35;
			@Pc(122) Class1 local122;
			if (this.aBoolean203) {
				local24 = true;
				for (local29 = this.aClass203_21.method4548(); local29 != null; local29 = this.aClass203_21.method4545()) {
					local35 = (int) local29.aLong228;
					if (this.aByteArray43[local35] == 0) {
						this.method2677(local35, 1);
					}
					if (this.aByteArray43[local35] == 0) {
						local24 = false;
					} else {
						local29.method6178();
					}
				}
				while (this.aClass165_1.anIntArray447.length > this.anInt3448) {
					if (this.aClass165_1.anIntArray447[this.anInt3448] == 0) {
						this.anInt3448++;
					} else {
						if (this.aClass58_1.anInt1951 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray43[this.anInt3448] == 0) {
							this.method2677(this.anInt3448, 1);
						}
						if (this.aByteArray43[this.anInt3448] == 0) {
							local122 = new Class1();
							local122.aLong228 = this.anInt3448;
							local24 = false;
							this.aClass203_21.method4551(local122);
						}
						this.anInt3448++;
					}
				}
				if (local24) {
					this.aBoolean203 = false;
					this.anInt3448 = 0;
				}
			} else if (this.aBoolean202) {
				local24 = true;
				for (local29 = this.aClass203_21.method4548(); local29 != null; local29 = this.aClass203_21.method4545()) {
					local35 = (int) local29.aLong228;
					if (this.aByteArray43[local35] != 1) {
						this.method2677(local35, 2);
					}
					if (this.aByteArray43[local35] == 1) {
						local29.method6178();
					} else {
						local24 = false;
					}
				}
				while (this.aClass165_1.anIntArray447.length > this.anInt3448) {
					if (this.aClass165_1.anIntArray447[this.anInt3448] == 0) {
						this.anInt3448++;
					} else {
						if (this.aClass159_1.method3618()) {
							local24 = false;
							break;
						}
						if (this.aByteArray43[this.anInt3448] != 1) {
							this.method2677(this.anInt3448, 2);
						}
						if (this.aByteArray43[this.anInt3448] != 1) {
							local122 = new Class1();
							local122.aLong228 = this.anInt3448;
							this.aClass203_21.method4551(local122);
							local24 = false;
						}
						this.anInt3448++;
					}
				}
				if (local24) {
					this.aBoolean202 = false;
					this.anInt3448 = 0;
				}
			} else {
				this.aClass203_21 = null;
			}
		}
		if (!this.aBoolean204 || Static250.method3737() < this.aLong96) {
			return;
		}
		for (@Pc(327) Class1_Sub1_Sub6 local327 = (Class1_Sub1_Sub6) this.aClass38_17.method767(); local327 != null; local327 = (Class1_Sub1_Sub6) this.aClass38_17.method773()) {
			if (!local327.aBoolean512) {
				if (local327.aBoolean513) {
					if (!local327.aBoolean511) {
						throw new RuntimeException();
					}
					local327.method6178();
				} else {
					local327.aBoolean513 = true;
				}
			}
		}
		this.aLong96 = Static250.method3737() + 1000L;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)I")
	public int method2680() {
		if (this.method2675() == null) {
			return this.aClass1_Sub1_Sub6_1 == null ? 0 : this.aClass1_Sub1_Sub6_1.method6098();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I")
	public int method2681() {
		return this.anInt3435;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)I")
	@Override
	public int method2674(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub6 local11 = (Class1_Sub1_Sub6) this.aClass38_17.method765((long) arg0);
		return local11 == null ? 0 : local11.method6098();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Lclient!ma;")
	@Override
	public Class165 method2675() {
		if (this.aClass165_1 != null) {
			return this.aClass165_1;
		}
		if (this.aClass1_Sub1_Sub6_1 == null) {
			if (this.aClass159_1.method3617()) {
				return null;
			}
			this.aClass1_Sub1_Sub6_1 = this.aClass159_1.method3610(this.anInt3432, true, 255, (byte) 0);
		}
		if (this.aClass1_Sub1_Sub6_1.aBoolean512) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass1_Sub1_Sub6_1.method6095();
		if (this.aClass1_Sub1_Sub6_1 instanceof Class1_Sub1_Sub6_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass165_1 = new Class165(local43, this.anInt3436);
				if (this.anInt3431 != this.aClass165_1.anInt4734) {
					throw new RuntimeException();
				}
			} catch (@Pc(133) RuntimeException local133) {
				this.aClass165_1 = null;
				if (this.aClass159_1.method3617()) {
					this.aClass1_Sub1_Sub6_1 = null;
				} else {
					this.aClass1_Sub1_Sub6_1 = this.aClass159_1.method3610(this.anInt3432, true, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass165_1 = new Class165(local43, this.anInt3436);
			} catch (@Pc(63) RuntimeException local63) {
				this.aClass159_1.method3620();
				this.aClass165_1 = null;
				if (this.aClass159_1.method3617()) {
					this.aClass1_Sub1_Sub6_1 = null;
				} else {
					this.aClass1_Sub1_Sub6_1 = this.aClass159_1.method3610(this.anInt3432, true, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass195_3 != null) {
				this.aClass58_1.method1419(this.anInt3432, local43, this.aClass195_3);
			}
		}
		if (this.aClass195_2 != null) {
			this.aByteArray43 = new byte[this.aClass165_1.anInt4738];
			this.anInt3435 = 0;
		}
		this.aClass1_Sub1_Sub6_1 = null;
		return this.aClass165_1;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
	public void method2683() {
		if (this.aClass203_21 == null || this.method2675() == null) {
			return;
		}
		for (@Pc(27) Class1 local27 = this.aClass203_20.method4548(); local27 != null; local27 = this.aClass203_20.method4545()) {
			@Pc(33) int local33 = (int) local27.aLong228;
			if (local33 < 0 || local33 >= this.aClass165_1.anInt4738 || this.aClass165_1.anIntArray447[local33] == 0) {
				local27.method6178();
			} else {
				if (this.aByteArray43[local33] == 0) {
					this.method2677(local33, 1);
				}
				if (this.aByteArray43[local33] == -1) {
					this.method2677(local33, 2);
				}
				if (this.aByteArray43[local33] == 1) {
					local27.method6178();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	public void method2684() {
		if (this.aClass195_2 != null) {
			this.aBoolean202 = true;
			if (this.aClass203_21 == null) {
				this.aClass203_21 = new Class203();
			}
		}
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)I")
	public int method2686() {
		if (this.aClass165_1 == null) {
			return 0;
		} else if (this.aBoolean203) {
			@Pc(28) Class1 local28 = this.aClass203_21.method4548();
			return local28 == null ? 0 : (int) local28.aLong228;
		} else {
			return this.aClass165_1.anInt4737;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(BI)[B")
	@Override
	public byte[] method2676(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub1_Sub6 local9 = this.method2677(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method6095();
			local9.method6178();
			return local23;
		}
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)I")
	public int method2687() {
		return this.aClass165_1 == null ? 0 : this.aClass165_1.anInt4737;
	}
}
