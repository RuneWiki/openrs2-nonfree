import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class172 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	private int anInt4315;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public int anInt4318;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	private int anInt4325;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "Lclient!gca;")
	private Class118 aClass118_26;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!kq;")
	public Class197 aClass197_3;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
	private int anInt4342;

	@OriginalMember(owner = "client!jk", name = "O", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
	public int anInt4346;

	@OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
	public int anInt4347;

	@OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
	public int anInt4348;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	private int anInt4319 = -1;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
	public int anInt4326 = -1;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
	private int anInt4323 = -1;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
	public int anInt4336 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
	public int anInt4335 = -1;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
	public int anInt4322 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public int anInt4314 = -1;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	private int anInt4320 = -1;

	@OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
	public int anInt4332 = -1;

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
	public int anInt4340 = -1;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "Z")
	public boolean aBoolean297 = true;

	@OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
	public int anInt4343 = 0;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Z")
	public boolean aBoolean295 = false;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Z")
	public boolean aBoolean294 = true;

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
	public int anInt4330 = -1;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray23 = new String[5];

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
	public int anInt4321 = -1;

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "Z")
	public boolean aBoolean296 = true;

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
	private int anInt4345 = -1;

	@OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
	public int anInt4349 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
	public int anInt4341 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
	private int anInt4350 = -1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!ha;Z)Lclient!cw;")
	public Class61 method3765(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class95 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt4340 : this.anInt4332;
		@Pc(18) int local18 = local11 | arg1.anInt8154 << 29;
		@Pc(27) Class61 local27 = (Class61) this.aClass197_3.aClass32_50.method630((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass197_3.aClass380_72.method8638(local11)) {
			@Pc(47) Class329 local47 = Static655.method7423(this.aClass197_3.aClass380_72, local11, 0);
			if (local47 != null) {
				local27 = arg1.method6980(local47, true);
				this.aClass197_3.aClass32_50.method629(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!vj;B)V")
	private void method3766(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt4332 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt4340 = arg1.method8546();
		} else if (arg0 == 3) {
			this.aString42 = arg1.method8549();
		} else if (arg0 == 4) {
			this.anInt4328 = arg1.method8539();
		} else if (arg0 == 5) {
			this.anInt4335 = arg1.method8539();
		} else if (arg0 == 6) {
			this.anInt4343 = arg1.method8547();
		} else {
			@Pc(64) int local64;
			if (arg0 == 7) {
				local64 = arg1.method8547();
				if ((local64 & 0x1) == 0) {
					this.aBoolean294 = false;
				}
				if ((local64 & 0x2) == 2) {
					this.aBoolean295 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean297 = arg1.method8547() == 1;
			} else if (arg0 == 9) {
				this.anInt4323 = arg1.method8546();
				if (this.anInt4323 == 65535) {
					this.anInt4323 = -1;
				}
				this.anInt4319 = arg1.method8546();
				if (this.anInt4319 == 65535) {
					this.anInt4319 = -1;
				}
				this.anInt4315 = arg1.method8542();
				this.anInt4325 = arg1.method8542();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray23[arg0 - 10] = arg1.method8549();
			} else {
				@Pc(123) int local123;
				@Pc(153) int local153;
				if (arg0 == 15) {
					local64 = arg1.method8547();
					this.anIntArray286 = new int[local64 * 2];
					for (local123 = 0; local123 < local64 * 2; local123++) {
						this.anIntArray286[local123] = arg1.method8526();
					}
					this.anInt4329 = arg1.method8542();
					@Pc(147) int local147 = arg1.method8547();
					this.anIntArray285 = new int[local147];
					for (local153 = 0; local153 < this.anIntArray285.length; local153++) {
						this.anIntArray285[local153] = arg1.method8542();
					}
					this.aByteArray48 = new byte[local64];
					for (@Pc(180) int local180 = 0; local180 < local64; local180++) {
						this.aByteArray48[local180] = arg1.method8548();
					}
				} else if (arg0 == 16) {
					this.aBoolean296 = false;
				} else if (arg0 == 17) {
					this.aString41 = arg1.method8549();
				} else if (arg0 == 18) {
					this.anInt4345 = arg1.method8546();
				} else if (arg0 == 19) {
					this.anInt4330 = arg1.method8546();
				} else if (arg0 == 20) {
					this.anInt4320 = arg1.method8546();
					if (this.anInt4320 == 65535) {
						this.anInt4320 = -1;
					}
					this.anInt4350 = arg1.method8546();
					if (this.anInt4350 == 65535) {
						this.anInt4350 = -1;
					}
					this.anInt4342 = arg1.method8542();
					this.anInt4333 = arg1.method8542();
				} else if (arg0 == 21) {
					this.anInt4346 = arg1.method8542();
				} else if (arg0 == 22) {
					this.anInt4348 = arg1.method8542();
				} else if (arg0 == 23) {
					this.anInt4321 = arg1.method8547();
					this.anInt4314 = arg1.method8547();
					this.anInt4326 = arg1.method8547();
				} else if (arg0 == 24) {
					this.anInt4347 = arg1.method8526();
					this.anInt4334 = arg1.method8526();
				} else if (arg0 == 249) {
					local64 = arg1.method8547();
					if (this.aClass118_26 == null) {
						local123 = Static350.method4699(local64);
						this.aClass118_26 = new Class118(local123);
					}
					for (local123 = 0; local123 < local64; local123++) {
						@Pc(344) boolean local344 = arg1.method8547() == 1;
						local153 = arg1.method8539();
						@Pc(357) Class2 local357;
						if (local344) {
							local357 = new Class2_Sub29(arg1.method8549());
						} else {
							local357 = new Class2_Sub30(arg1.method8542());
						}
						this.aClass118_26.method2601(local357, (long) local153);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!ha;I)Lclient!cw;")
	public Class61 method3767(@OriginalArg(0) Class95 arg0) {
		@Pc(20) Class61 local20 = (Class61) this.aClass197_3.aClass32_50.method630((long) (this.anInt4345 | 0x20000 | arg0.anInt8154 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass197_3.aClass380_72.method8638(this.anInt4345);
		@Pc(48) Class329 local48 = Static655.method7423(this.aClass197_3.aClass380_72, this.anInt4345, 0);
		if (local48 != null) {
			local20 = arg0.method6980(local48, true);
			this.aClass197_3.aClass32_50.method629(local20, (long) (this.anInt4345 | 0x20000 | arg0.anInt8154 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public void method3768() {
		if (this.anIntArray286 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray286.length; local10 += 2) {
			if (this.anInt4349 > this.anIntArray286[local10]) {
				this.anInt4349 = this.anIntArray286[local10];
			} else if (this.anInt4322 < this.anIntArray286[local10]) {
				this.anInt4322 = this.anIntArray286[local10];
			}
			if (this.anIntArray286[local10 + 1] < this.anInt4341) {
				this.anInt4341 = this.anIntArray286[local10 + 1];
			} else if (this.anInt4336 < this.anIntArray286[local10 + 1]) {
				this.anInt4336 = this.anIntArray286[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method3770(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass118_26 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub29 local22 = (Class2_Sub29) this.aClass118_26.method2595((long) arg0);
			return local22 == null ? arg1 : local22.aString63;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!aca;B)Z")
	public boolean method3771(@OriginalArg(0) Interface1 arg0) {
		@Pc(23) int local23;
		if (this.anInt4319 == -1) {
			if (this.anInt4323 == -1) {
				return true;
			}
			local23 = arg0.method4251(this.anInt4323);
		} else {
			local23 = arg0.method4252(this.anInt4319);
		}
		if (this.anInt4315 > local23 || this.anInt4325 < local23) {
			return false;
		}
		@Pc(58) int local58;
		if (this.anInt4350 == -1) {
			if (this.anInt4320 == -1) {
				return true;
			}
			local58 = arg0.method4251(this.anInt4320);
		} else {
			local58 = arg0.method4252(this.anInt4350);
		}
		return local58 >= this.anInt4342 && local58 <= this.anInt4333;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)I")
	public int method3773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass118_26 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub30 local16 = (Class2_Sub30) this.aClass118_26.method2595((long) arg0);
			return local16 == null ? arg1 : local16.anInt5508;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method3774(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8547();
			if (local15 == 0) {
				return;
			}
			this.method3766(local15, arg0);
		}
	}
}
