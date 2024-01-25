import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!os", name = "q", descriptor = "Lclient!l;")
	private Class121 aClass121_2;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "I")
	private int anInt4338 = 0;

	@OriginalMember(owner = "client!os", name = "D", descriptor = "Lclient!jj;")
	private final Class108 aClass108_27 = new Class108(16);

	@OriginalMember(owner = "client!os", name = "K", descriptor = "I")
	private int anInt4347 = 0;

	@OriginalMember(owner = "client!os", name = "Q", descriptor = "Lclient!vq;")
	private final Class211 aClass211_27 = new Class211();

	@OriginalMember(owner = "client!os", name = "V", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!uf;")
	private final Class197 aClass197_1;

	@OriginalMember(owner = "client!os", name = "E", descriptor = "I")
	private final int anInt4342;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!os", name = "P", descriptor = "Lclient!vq;")
	private Class211 aClass211_26;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "I")
	private final int anInt4346;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "Lclient!uf;")
	private final Class197 aClass197_2;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "I")
	private final int anInt4337;

	@OriginalMember(owner = "client!os", name = "U", descriptor = "Z")
	private final boolean aBoolean304;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "Lclient!id;")
	private final Class99 aClass99_3;

	@OriginalMember(owner = "client!os", name = "t", descriptor = "Lclient!ka;")
	private final Class113 aClass113_3;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "Lclient!mm;")
	private Class6_Sub2_Sub11 aClass6_Sub2_Sub11_1;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILclient!uf;Lclient!uf;Lclient!ka;Lclient!id;IIZ)V")
	public Class98_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) Class99 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass197_1 = arg1;
		this.anInt4342 = arg0;
		if (this.aClass197_1 == null) {
			this.aBoolean302 = false;
		} else {
			this.aBoolean302 = true;
			this.aClass211_26 = new Class211();
		}
		this.anInt4346 = arg6;
		this.aClass197_2 = arg2;
		this.anInt4337 = arg5;
		this.aBoolean304 = arg7;
		this.aClass99_3 = arg4;
		this.aClass113_3 = arg3;
		if (this.aClass197_2 != null) {
			this.aClass6_Sub2_Sub11_1 = this.aClass99_3.method2531(this.anInt4342, this.aClass197_2);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	public void method4137() {
		if (this.aClass211_26 == null || this.method4131() == null) {
			return;
		}
		for (@Pc(26) Class6 local26 = this.aClass211_27.method5594(); local26 != null; local26 = this.aClass211_27.method5582()) {
			@Pc(32) int local32 = (int) local26.aLong218;
			if (local32 < 0 || this.aClass121_2.anInt3157 <= local32 || this.aClass121_2.anIntArray382[local32] == 0) {
				local26.method5756();
			} else {
				if (this.aByteArray70[local32] == 0) {
					this.method4141(local32, 1);
				}
				if (this.aByteArray70[local32] == -1) {
					this.method4141(local32, 2);
				}
				if (this.aByteArray70[local32] == 1) {
					local26.method5756();
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Lclient!l;")
	@Override
	public Class121 method4131() {
		if (this.aClass121_2 != null) {
			return this.aClass121_2;
		}
		if (this.aClass6_Sub2_Sub11_1 == null) {
			if (this.aClass113_3.method3130()) {
				return null;
			}
			this.aClass6_Sub2_Sub11_1 = this.aClass113_3.method3141((byte) 0, 255, true, this.anInt4342);
		}
		if (this.aClass6_Sub2_Sub11_1.aBoolean366) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass6_Sub2_Sub11_1.method4802();
		if (this.aClass6_Sub2_Sub11_1 instanceof Class6_Sub2_Sub11_Sub2) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass121_2 = new Class121(local49, this.anInt4337);
				if (this.anInt4346 != this.aClass121_2.anInt3162) {
					throw new RuntimeException();
				}
			} catch (@Pc(145) RuntimeException local145) {
				this.aClass121_2 = null;
				if (this.aClass113_3.method3130()) {
					this.aClass6_Sub2_Sub11_1 = null;
				} else {
					this.aClass6_Sub2_Sub11_1 = this.aClass113_3.method3141((byte) 0, 255, true, this.anInt4342);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass121_2 = new Class121(local49, this.anInt4337);
			} catch (@Pc(69) RuntimeException local69) {
				this.aClass113_3.method3140();
				this.aClass121_2 = null;
				if (this.aClass113_3.method3130()) {
					this.aClass6_Sub2_Sub11_1 = null;
				} else {
					this.aClass6_Sub2_Sub11_1 = this.aClass113_3.method3141((byte) 0, 255, true, this.anInt4342);
				}
				return null;
			}
			if (this.aClass197_2 != null) {
				this.aClass99_3.method2525(this.anInt4342, local49, this.aClass197_2);
			}
		}
		this.aClass6_Sub2_Sub11_1 = null;
		if (this.aClass197_1 != null) {
			this.aByteArray70 = new byte[this.aClass121_2.anInt3157];
			this.anInt4338 = 0;
		}
		return this.aClass121_2;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method4133(@OriginalArg(0) int arg0) {
		@Pc(18) Class6_Sub2_Sub11 local18 = this.method4141(arg0, 0);
		if (local18 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local18.method4802();
			local18.method5756();
			return local26;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
	@Override
	public int method4128(@OriginalArg(0) int arg0) {
		@Pc(17) Class6_Sub2_Sub11 local17 = (Class6_Sub2_Sub11) this.aClass108_27.method2900((long) arg0);
		return local17 == null ? 0 : local17.method4804();
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)I")
	public int method4140() {
		return this.aClass121_2 == null ? 0 : this.aClass121_2.anInt3160;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Lclient!mm;")
	private Class6_Sub2_Sub11 method4141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class6_Sub2_Sub11 local19 = (Class6_Sub2_Sub11) this.aClass108_27.method2900((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean365 && local19.aBoolean366) {
			local19.method5756();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass197_1 == null || this.aByteArray70[arg0] == -1) {
					if (this.aClass113_3.method3130()) {
						return null;
					}
					local19 = this.aClass113_3.method3141((byte) 2, this.anInt4342, true, arg0);
				} else {
					local19 = this.aClass99_3.method2531(arg0, this.aClass197_1);
				}
			} else if (arg1 == 1) {
				if (this.aClass197_1 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass99_3.method2528(arg0, this.aClass197_1);
			} else if (arg1 == 2) {
				if (this.aClass197_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray70[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass113_3.method3133()) {
					return null;
				}
				local19 = this.aClass113_3.method3141((byte) 2, this.anInt4342, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass108_27.method2898((long) arg0, local19);
		}
		if (local19.aBoolean366) {
			return null;
		}
		@Pc(159) byte[] local159 = local19.method4802();
		@Pc(186) int local186;
		@Pc(288) Class6_Sub2_Sub11_Sub1 local288;
		if (!(local19 instanceof Class6_Sub2_Sub11_Sub2)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static113.aCRC32_1.reset();
				Static113.aCRC32_1.update(local159, 0, local159.length - 2);
				local186 = (int) Static113.aCRC32_1.getValue();
				if (this.aClass121_2.anIntArray380[arg0] != local186) {
					throw new RuntimeException();
				}
				this.aClass113_3.anInt2953 = 0;
				this.aClass113_3.anInt2952 = 0;
			} catch (@Pc(344) RuntimeException local344) {
				this.aClass113_3.method3140();
				local19.method5756();
				if (local19.aBoolean365 && !this.aClass113_3.method3130()) {
					local288 = this.aClass113_3.method3141((byte) 2, this.anInt4342, true, arg0);
					this.aClass108_27.method2898((long) arg0, local288);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass121_2.anIntArray383[arg0] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass121_2.anIntArray383[arg0];
			if (this.aClass197_1 != null) {
				this.aClass99_3.method2525(arg0, local159, this.aClass197_1);
				if (this.aByteArray70[arg0] != 1) {
					this.anInt4338++;
					this.aByteArray70[arg0] = 1;
				}
			}
			if (!local19.aBoolean365) {
				local19.method5756();
			}
			return local19;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static113.aCRC32_1.reset();
			Static113.aCRC32_1.update(local159, 0, local159.length - 2);
			local186 = (int) Static113.aCRC32_1.getValue();
			if (local186 != this.aClass121_2.anIntArray380[arg0]) {
				throw new RuntimeException();
			}
			@Pc(217) int local217 = (local159[local159.length - 1] & 0xFF) + ((local159[local159.length - 2] & 0xFF) << 8);
			if ((this.aClass121_2.anIntArray383[arg0] & 0xFFFF) != local217) {
				throw new RuntimeException();
			}
			if (this.aByteArray70[arg0] != 1) {
				this.anInt4338++;
				this.aByteArray70[arg0] = 1;
			}
			if (!local19.aBoolean365) {
				local19.method5756();
			}
			return local19;
		} catch (@Pc(262) Exception local262) {
			this.aByteArray70[arg0] = -1;
			local19.method5756();
			if (local19.aBoolean365 && !this.aClass113_3.method3130()) {
				local288 = this.aClass113_3.method3141((byte) 2, this.anInt4342, true, arg0);
				this.aClass108_27.method2898((long) arg0, local288);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
	public void method4143() {
		if (this.aClass211_26 != null) {
			if (this.method4131() == null) {
				return;
			}
			@Pc(28) boolean local28;
			@Pc(33) Class6 local33;
			@Pc(39) int local39;
			@Pc(127) Class6 local127;
			if (this.aBoolean302) {
				local28 = true;
				for (local33 = this.aClass211_26.method5594(); local33 != null; local33 = this.aClass211_26.method5582()) {
					local39 = (int) local33.aLong218;
					if (this.aByteArray70[local39] == 0) {
						this.method4141(local39, 1);
					}
					if (this.aByteArray70[local39] == 0) {
						local28 = false;
					} else {
						local33.method5756();
					}
				}
				while (this.aClass121_2.anIntArray382.length > this.anInt4347) {
					if (this.aClass121_2.anIntArray382[this.anInt4347] == 0) {
						this.anInt4347++;
					} else {
						if (this.aClass99_3.anInt2382 >= 250) {
							local28 = false;
							break;
						}
						if (this.aByteArray70[this.anInt4347] == 0) {
							this.method4141(this.anInt4347, 1);
						}
						if (this.aByteArray70[this.anInt4347] == 0) {
							local127 = new Class6();
							local127.aLong218 = this.anInt4347;
							this.aClass211_26.method5585(local127);
							local28 = false;
						}
						this.anInt4347++;
					}
				}
				if (local28) {
					this.anInt4347 = 0;
					this.aBoolean302 = false;
				}
			} else if (this.aBoolean303) {
				local28 = true;
				for (local33 = this.aClass211_26.method5594(); local33 != null; local33 = this.aClass211_26.method5582()) {
					local39 = (int) local33.aLong218;
					if (this.aByteArray70[local39] != 1) {
						this.method4141(local39, 2);
					}
					if (this.aByteArray70[local39] == 1) {
						local33.method5756();
					} else {
						local28 = false;
					}
				}
				while (this.anInt4347 < this.aClass121_2.anIntArray382.length) {
					if (this.aClass121_2.anIntArray382[this.anInt4347] == 0) {
						this.anInt4347++;
					} else {
						if (this.aClass113_3.method3133()) {
							local28 = false;
							break;
						}
						if (this.aByteArray70[this.anInt4347] != 1) {
							this.method4141(this.anInt4347, 2);
						}
						if (this.aByteArray70[this.anInt4347] != 1) {
							local127 = new Class6();
							local127.aLong218 = this.anInt4347;
							local28 = false;
							this.aClass211_26.method5585(local127);
						}
						this.anInt4347++;
					}
				}
				if (local28) {
					this.aBoolean303 = false;
					this.anInt4347 = 0;
				}
			} else {
				this.aClass211_26 = null;
			}
		}
		if (!this.aBoolean304 || Static245.method4300() < this.aLong144) {
			return;
		}
		for (@Pc(319) Class6_Sub2_Sub11 local319 = (Class6_Sub2_Sub11) this.aClass108_27.method2903(); local319 != null; local319 = (Class6_Sub2_Sub11) this.aClass108_27.method2905()) {
			if (!local319.aBoolean366) {
				if (local319.aBoolean364) {
					if (!local319.aBoolean365) {
						throw new RuntimeException();
					}
					local319.method5756();
				} else {
					local319.aBoolean364 = true;
				}
			}
		}
		this.aLong144 = Static245.method4300() + 1000L;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
	public int method4144() {
		if (this.aClass121_2 == null) {
			return 0;
		} else if (this.aBoolean302) {
			@Pc(26) Class6 local26 = this.aClass211_26.method5594();
			return local26 == null ? 0 : (int) local26.aLong218;
		} else {
			return this.aClass121_2.anInt3160;
		}
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)I")
	public int method4145() {
		return this.anInt4338;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
	@Override
	public void method4130(@OriginalArg(0) int arg0) {
		if (this.aClass197_1 == null) {
			return;
		}
		for (@Pc(14) Class6 local14 = this.aClass211_27.method5594(); local14 != null; local14 = this.aClass211_27.method5582()) {
			if ((long) arg0 == local14.aLong218) {
				return;
			}
		}
		@Pc(45) Class6 local45 = new Class6();
		local45.aLong218 = arg0;
		this.aClass211_27.method5585(local45);
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(I)I")
	public int method4146() {
		if (this.method4131() == null) {
			return this.aClass6_Sub2_Sub11_1 == null ? 0 : this.aClass6_Sub2_Sub11_1.method4804();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
	public void method4147() {
		if (this.aClass197_1 != null) {
			this.aBoolean303 = true;
			if (this.aClass211_26 == null) {
				this.aClass211_26 = new Class211();
			}
		}
	}
}
