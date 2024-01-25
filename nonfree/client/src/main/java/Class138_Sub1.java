import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!at;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	private int anInt4726 = 0;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Lclient!cm;")
	private final Class41 aClass41_25 = new Class41(16);

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "I")
	private int anInt4748 = 0;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "Lclient!sf;")
	private final Class180 aClass180_30 = new Class180();

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "J")
	private long aLong149 = 0L;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	private final int anInt4728;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Lclient!uj;")
	private final Class204 aClass204_1;

	@OriginalMember(owner = "client!nh", name = "J", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "Lclient!sf;")
	private Class180 aClass180_29;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "Lclient!gh;")
	private final Class79 aClass79_2;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	private final int anInt4738;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "Z")
	private final boolean aBoolean409;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!p;")
	private final Class152 aClass152_2;

	@OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
	private final int anInt4741;

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "Lclient!uj;")
	private final Class204 aClass204_2;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!n;")
	private Class2_Sub9_Sub14 aClass2_Sub9_Sub14_1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILclient!uj;Lclient!uj;Lclient!gh;Lclient!p;IIZ)V")
	public Class138_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) Class79 arg3, @OriginalArg(4) Class152 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4728 = arg0;
		this.aClass204_1 = arg1;
		if (this.aClass204_1 == null) {
			this.aBoolean407 = false;
		} else {
			this.aBoolean407 = true;
			this.aClass180_29 = new Class180();
		}
		this.aClass79_2 = arg3;
		this.anInt4738 = arg6;
		this.aBoolean409 = arg7;
		this.aClass152_2 = arg4;
		this.anInt4741 = arg5;
		this.aClass204_2 = arg2;
		if (this.aClass204_2 != null) {
			this.aClass2_Sub9_Sub14_1 = this.aClass152_2.method4373(this.anInt4728, this.aClass204_2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I")
	public int method4070() {
		return this.anInt4726;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I")
	public int method4071() {
		if (this.aClass16_2 == null) {
			return 0;
		} else if (this.aBoolean407) {
			@Pc(26) Class2 local26 = this.aClass180_29.method4919();
			return local26 == null ? 0 : (int) local26.aLong219;
		} else {
			return this.aClass16_2.anInt313;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4064(@OriginalArg(0) int arg0) {
		if (this.aClass204_1 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass180_30.method4919(); local14 != null; local14 = this.aClass180_30.method4916()) {
			if (local14.aLong219 == (long) arg0) {
				return;
			}
		}
		@Pc(40) Class2 local40 = new Class2();
		local40.aLong219 = arg0;
		this.aClass180_30.method4909(local40);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4065(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub9_Sub14 local9 = this.method4081(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5297();
			local9.method5723();
			return local17;
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	public void method4073() {
		if (this.aClass204_1 != null) {
			this.aBoolean408 = true;
			if (this.aClass180_29 == null) {
				this.aClass180_29 = new Class180();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)I")
	@Override
	public int method4067(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub9_Sub14 local11 = (Class2_Sub9_Sub14) this.aClass41_25.method902((long) arg0);
		return local11 == null ? 0 : local11.method5298();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lclient!at;")
	@Override
	public Class16 method4068() {
		if (this.aClass16_2 != null) {
			return this.aClass16_2;
		}
		if (this.aClass2_Sub9_Sub14_1 == null) {
			if (this.aClass79_2.method2109()) {
				return null;
			}
			this.aClass2_Sub9_Sub14_1 = this.aClass79_2.method2108(255, true, this.anInt4728, (byte) 0);
		}
		if (this.aClass2_Sub9_Sub14_1.aBoolean557) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass2_Sub9_Sub14_1.method5297();
		if (this.aClass2_Sub9_Sub14_1 instanceof Class2_Sub9_Sub14_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass16_2 = new Class16(local43, this.anInt4741);
				if (this.anInt4738 != this.aClass16_2.anInt315) {
					throw new RuntimeException();
				}
			} catch (@Pc(137) RuntimeException local137) {
				this.aClass16_2 = null;
				if (this.aClass79_2.method2109()) {
					this.aClass2_Sub9_Sub14_1 = null;
				} else {
					this.aClass2_Sub9_Sub14_1 = this.aClass79_2.method2108(255, true, this.anInt4728, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass16_2 = new Class16(local43, this.anInt4741);
			} catch (@Pc(63) RuntimeException local63) {
				this.aClass79_2.method2110();
				this.aClass16_2 = null;
				if (this.aClass79_2.method2109()) {
					this.aClass2_Sub9_Sub14_1 = null;
				} else {
					this.aClass2_Sub9_Sub14_1 = this.aClass79_2.method2108(255, true, this.anInt4728, (byte) 0);
				}
				return null;
			}
			if (this.aClass204_2 != null) {
				this.aClass152_2.method4376(this.aClass204_2, local43, this.anInt4728);
			}
		}
		this.aClass2_Sub9_Sub14_1 = null;
		if (this.aClass204_1 != null) {
			this.anInt4726 = 0;
			this.aByteArray60 = new byte[this.aClass16_2.anInt309];
		}
		return this.aClass16_2;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
	public int method4075() {
		return this.aClass16_2 == null ? 0 : this.aClass16_2.anInt313;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	public void method4078() {
		if (this.aClass180_29 != null) {
			if (this.method4068() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class2 local29;
			@Pc(35) int local35;
			@Pc(126) Class2 local126;
			if (this.aBoolean407) {
				local24 = true;
				for (local29 = this.aClass180_29.method4919(); local29 != null; local29 = this.aClass180_29.method4916()) {
					local35 = (int) local29.aLong219;
					if (this.aByteArray60[local35] == 0) {
						this.method4081(local35, 1);
					}
					if (this.aByteArray60[local35] == 0) {
						local24 = false;
					} else {
						local29.method5723();
					}
				}
				while (this.aClass16_2.anIntArray34.length > this.anInt4748) {
					if (this.aClass16_2.anIntArray34[this.anInt4748] == 0) {
						this.anInt4748++;
					} else {
						if (this.aClass152_2.anInt5184 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray60[this.anInt4748] == 0) {
							this.method4081(this.anInt4748, 1);
						}
						if (this.aByteArray60[this.anInt4748] == 0) {
							local126 = new Class2();
							local126.aLong219 = this.anInt4748;
							this.aClass180_29.method4909(local126);
							local24 = false;
						}
						this.anInt4748++;
					}
				}
				if (local24) {
					this.aBoolean407 = false;
					this.anInt4748 = 0;
				}
			} else if (this.aBoolean408) {
				local24 = true;
				for (local29 = this.aClass180_29.method4919(); local29 != null; local29 = this.aClass180_29.method4916()) {
					local35 = (int) local29.aLong219;
					if (this.aByteArray60[local35] != 1) {
						this.method4081(local35, 2);
					}
					if (this.aByteArray60[local35] == 1) {
						local29.method5723();
					} else {
						local24 = false;
					}
				}
				while (this.aClass16_2.anIntArray34.length > this.anInt4748) {
					if (this.aClass16_2.anIntArray34[this.anInt4748] == 0) {
						this.anInt4748++;
					} else {
						if (this.aClass79_2.method2117()) {
							local24 = false;
							break;
						}
						if (this.aByteArray60[this.anInt4748] != 1) {
							this.method4081(this.anInt4748, 2);
						}
						if (this.aByteArray60[this.anInt4748] != 1) {
							local126 = new Class2();
							local126.aLong219 = this.anInt4748;
							this.aClass180_29.method4909(local126);
							local24 = false;
						}
						this.anInt4748++;
					}
				}
				if (local24) {
					this.anInt4748 = 0;
					this.aBoolean408 = false;
				}
			} else {
				this.aClass180_29 = null;
			}
		}
		if (!this.aBoolean409 || Static22.method285() < this.aLong149) {
			return;
		}
		for (@Pc(331) Class2_Sub9_Sub14 local331 = (Class2_Sub9_Sub14) this.aClass41_25.method896(); local331 != null; local331 = (Class2_Sub9_Sub14) this.aClass41_25.method904()) {
			if (!local331.aBoolean557) {
				if (local331.aBoolean558) {
					if (!local331.aBoolean559) {
						throw new RuntimeException();
					}
					local331.method5723();
				} else {
					local331.aBoolean558 = true;
				}
			}
		}
		this.aLong149 = Static22.method285() + 1000L;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I")
	public int method4079() {
		if (this.method4068() == null) {
			return this.aClass2_Sub9_Sub14_1 == null ? 0 : this.aClass2_Sub9_Sub14_1.method5298();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
	public void method4080() {
		if (this.aClass180_29 == null || this.method4068() == null) {
			return;
		}
		for (@Pc(25) Class2 local25 = this.aClass180_30.method4919(); local25 != null; local25 = this.aClass180_30.method4916()) {
			@Pc(31) int local31 = (int) local25.aLong219;
			if (local31 < 0 || this.aClass16_2.anInt309 <= local31 || this.aClass16_2.anIntArray34[local31] == 0) {
				local25.method5723();
			} else {
				if (this.aByteArray60[local31] == 0) {
					this.method4081(local31, 1);
				}
				if (this.aByteArray60[local31] == -1) {
					this.method4081(local31, 2);
				}
				if (this.aByteArray60[local31] == 1) {
					local25.method5723();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)Lclient!n;")
	private Class2_Sub9_Sub14 method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class2_Sub9_Sub14 local18 = (Class2_Sub9_Sub14) this.aClass41_25.method902((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean559 && local18.aBoolean557) {
			local18.method5723();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass204_1 == null || this.aByteArray60[arg0] == -1) {
					if (this.aClass79_2.method2109()) {
						return null;
					}
					local18 = this.aClass79_2.method2108(this.anInt4728, true, arg0, (byte) 2);
				} else {
					local18 = this.aClass152_2.method4373(arg0, this.aClass204_1);
				}
			} else if (arg1 == 1) {
				if (this.aClass204_1 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass152_2.method4372(this.aClass204_1, arg0);
			} else if (arg1 == 2) {
				if (this.aClass204_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray60[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass79_2.method2117()) {
					return null;
				}
				local18 = this.aClass79_2.method2108(this.anInt4728, false, arg0, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass41_25.method901(local18, (long) arg0);
		}
		if (local18.aBoolean557) {
			return null;
		}
		@Pc(163) byte[] local163 = local18.method5297();
		@Pc(192) int local192;
		@Pc(240) Class2_Sub9_Sub14_Sub1 local240;
		if (!(local18 instanceof Class2_Sub9_Sub14_Sub2)) {
			try {
				if (local163 == null || local163.length <= 2) {
					throw new RuntimeException();
				}
				Static241.aCRC32_1.reset();
				Static241.aCRC32_1.update(local163, 0, local163.length - 2);
				local192 = (int) Static241.aCRC32_1.getValue();
				if (local192 != this.aClass16_2.anIntArray37[arg0]) {
					throw new RuntimeException();
				}
				this.aClass79_2.anInt2290 = 0;
				this.aClass79_2.anInt2289 = 0;
			} catch (@Pc(213) RuntimeException local213) {
				this.aClass79_2.method2110();
				local18.method5723();
				if (local18.aBoolean559 && !this.aClass79_2.method2109()) {
					local240 = this.aClass79_2.method2108(this.anInt4728, true, arg0, (byte) 2);
					this.aClass41_25.method901(local240, (long) arg0);
				}
				return null;
			}
			local163[local163.length - 2] = (byte) (this.aClass16_2.anIntArray36[arg0] >>> 8);
			local163[local163.length - 1] = (byte) this.aClass16_2.anIntArray36[arg0];
			if (this.aClass204_1 != null) {
				this.aClass152_2.method4376(this.aClass204_1, local163, arg0);
				if (this.aByteArray60[arg0] != 1) {
					this.anInt4726++;
					this.aByteArray60[arg0] = 1;
				}
			}
			if (!local18.aBoolean559) {
				local18.method5723();
			}
			return local18;
		}
		try {
			if (local163 == null || local163.length <= 2) {
				throw new RuntimeException();
			}
			Static241.aCRC32_1.reset();
			Static241.aCRC32_1.update(local163, 0, local163.length - 2);
			local192 = (int) Static241.aCRC32_1.getValue();
			if (this.aClass16_2.anIntArray37[arg0] != local192) {
				throw new RuntimeException();
			}
			@Pc(374) int local374 = ((local163[local163.length - 2] & 0xFF) << 8) + (local163[local163.length - 1] & 0xFF);
			if (local374 != (this.aClass16_2.anIntArray36[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray60[arg0] != 1) {
				this.anInt4726++;
				this.aByteArray60[arg0] = 1;
			}
			if (!local18.aBoolean559) {
				local18.method5723();
			}
			return local18;
		} catch (@Pc(419) Exception local419) {
			this.aByteArray60[arg0] = -1;
			local18.method5723();
			if (local18.aBoolean559 && !this.aClass79_2.method2109()) {
				local240 = this.aClass79_2.method2108(this.anInt4728, true, arg0, (byte) 2);
				this.aClass41_25.method901(local240, (long) arg0);
			}
			return null;
		}
	}
}
