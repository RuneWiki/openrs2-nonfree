import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "Lclient!ea;")
	private Class64 aClass64_1;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "Z")
	private boolean aBoolean263;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	private int anInt3929 = 0;

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "Lclient!mn;")
	private final Class167 aClass167_19 = new Class167(16);

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
	private int anInt3946 = 0;

	@OriginalMember(owner = "client!jl", name = "M", descriptor = "Lclient!mf;")
	private final Class163 aClass163_30 = new Class163();

	@OriginalMember(owner = "client!jl", name = "O", descriptor = "J")
	private long aLong128 = 0L;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
	private final int anInt3943;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "Lclient!fq;")
	private final Class84 aClass84_2;

	@OriginalMember(owner = "client!jl", name = "L", descriptor = "Z")
	private boolean aBoolean264;

	@OriginalMember(owner = "client!jl", name = "N", descriptor = "Lclient!mf;")
	private Class163 aClass163_31;

	@OriginalMember(owner = "client!jl", name = "P", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	private final int anInt3926;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!rm;")
	private final Class209 aClass209_1;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
	private final int anInt3936;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "Lclient!hf;")
	private final Class103 aClass103_2;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "Lclient!fq;")
	private final Class84 aClass84_1;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Lclient!nr;")
	private Class10_Sub1_Sub13 aClass10_Sub1_Sub13_1;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(ILclient!fq;Lclient!fq;Lclient!hf;Lclient!rm;IIZ)V")
	public Class131_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class103 arg3, @OriginalArg(4) Class209 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3943 = arg0;
		this.aClass84_2 = arg1;
		if (this.aClass84_2 == null) {
			this.aBoolean264 = false;
		} else {
			this.aBoolean264 = true;
			this.aClass163_31 = new Class163();
		}
		this.aBoolean265 = arg7;
		this.anInt3926 = arg5;
		this.aClass209_1 = arg4;
		this.anInt3936 = arg6;
		this.aClass103_2 = arg3;
		this.aClass84_1 = arg2;
		if (this.aClass84_1 != null) {
			this.aClass10_Sub1_Sub13_1 = this.aClass209_1.method4774(this.aClass84_1, this.anInt3943);
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public void method3127() {
		if (this.aClass163_31 != null) {
			if (this.method3125() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(28) Class10 local28;
			@Pc(34) int local34;
			@Pc(121) Class10 local121;
			if (this.aBoolean264) {
				local21 = true;
				for (local28 = this.aClass163_31.method3620(); local28 != null; local28 = this.aClass163_31.method3621()) {
					local34 = (int) local28.aLong264;
					if (this.aByteArray50[local34] == 0) {
						this.method3136(1, local34);
					}
					if (this.aByteArray50[local34] == 0) {
						local21 = false;
					} else {
						local28.method6033();
					}
				}
				while (this.aClass64_1.anIntArray141.length > this.anInt3946) {
					if (this.aClass64_1.anIntArray141[this.anInt3946] == 0) {
						this.anInt3946++;
					} else {
						if (this.aClass209_1.anInt6040 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray50[this.anInt3946] == 0) {
							this.method3136(1, this.anInt3946);
						}
						if (this.aByteArray50[this.anInt3946] == 0) {
							local121 = new Class10();
							local121.aLong264 = this.anInt3946;
							local21 = false;
							this.aClass163_31.method3613(local121);
						}
						this.anInt3946++;
					}
				}
				if (local21) {
					this.anInt3946 = 0;
					this.aBoolean264 = false;
				}
			} else if (this.aBoolean263) {
				local21 = true;
				for (local28 = this.aClass163_31.method3620(); local28 != null; local28 = this.aClass163_31.method3621()) {
					local34 = (int) local28.aLong264;
					if (this.aByteArray50[local34] != 1) {
						this.method3136(2, local34);
					}
					if (this.aByteArray50[local34] == 1) {
						local28.method6033();
					} else {
						local21 = false;
					}
				}
				while (this.aClass64_1.anIntArray141.length > this.anInt3946) {
					if (this.aClass64_1.anIntArray141[this.anInt3946] == 0) {
						this.anInt3946++;
					} else {
						if (this.aClass103_2.method2593()) {
							local21 = false;
							break;
						}
						if (this.aByteArray50[this.anInt3946] != 1) {
							this.method3136(2, this.anInt3946);
						}
						if (this.aByteArray50[this.anInt3946] != 1) {
							local121 = new Class10();
							local121.aLong264 = this.anInt3946;
							local21 = false;
							this.aClass163_31.method3613(local121);
						}
						this.anInt3946++;
					}
				}
				if (local21) {
					this.anInt3946 = 0;
					this.aBoolean263 = false;
				}
			} else {
				this.aClass163_31 = null;
			}
		}
		if (!this.aBoolean265 || Static220.method3314() < this.aLong128) {
			return;
		}
		for (@Pc(314) Class10_Sub1_Sub13 local314 = (Class10_Sub1_Sub13) this.aClass167_19.method3702(); local314 != null; local314 = (Class10_Sub1_Sub13) this.aClass167_19.method3708()) {
			if (!local314.aBoolean383) {
				if (local314.aBoolean381) {
					if (!local314.aBoolean382) {
						throw new RuntimeException();
					}
					local314.method6033();
				} else {
					local314.aBoolean381 = true;
				}
			}
		}
		this.aLong128 = Static220.method3314() + 1000L;
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	public void method3129() {
		if (this.aClass84_2 != null) {
			this.aBoolean263 = true;
			if (this.aClass163_31 == null) {
				this.aClass163_31 = new Class163();
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)I")
	@Override
	public int method3126(@OriginalArg(0) int arg0) {
		@Pc(17) Class10_Sub1_Sub13 local17 = (Class10_Sub1_Sub13) this.aClass167_19.method3709((long) arg0);
		return local17 == null ? 0 : local17.method4708();
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lclient!ea;")
	@Override
	public Class64 method3125() {
		if (this.aClass64_1 != null) {
			return this.aClass64_1;
		}
		if (this.aClass10_Sub1_Sub13_1 == null) {
			if (this.aClass103_2.method2589()) {
				return null;
			}
			this.aClass10_Sub1_Sub13_1 = this.aClass103_2.method2592(255, this.anInt3943, true, (byte) 0);
		}
		if (this.aClass10_Sub1_Sub13_1.aBoolean383) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass10_Sub1_Sub13_1.method4709();
		if (this.aClass10_Sub1_Sub13_1 instanceof Class10_Sub1_Sub13_Sub2) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass64_1 = new Class64(local50, this.anInt3926);
				if (this.aClass64_1.anInt1832 != this.anInt3936) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass64_1 = null;
				if (this.aClass103_2.method2589()) {
					this.aClass10_Sub1_Sub13_1 = null;
				} else {
					this.aClass10_Sub1_Sub13_1 = this.aClass103_2.method2592(255, this.anInt3943, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass64_1 = new Class64(local50, this.anInt3926);
			} catch (@Pc(121) RuntimeException local121) {
				this.aClass103_2.method2601();
				this.aClass64_1 = null;
				if (this.aClass103_2.method2589()) {
					this.aClass10_Sub1_Sub13_1 = null;
				} else {
					this.aClass10_Sub1_Sub13_1 = this.aClass103_2.method2592(255, this.anInt3943, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass84_1 != null) {
				this.aClass209_1.method4769(this.anInt3943, this.aClass84_1, local50);
			}
		}
		if (this.aClass84_2 != null) {
			this.aByteArray50 = new byte[this.aClass64_1.anInt1829];
			this.anInt3929 = 0;
		}
		this.aClass10_Sub1_Sub13_1 = null;
		return this.aClass64_1;
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
	public void method3131() {
		if (this.aClass163_31 == null || this.method3125() == null) {
			return;
		}
		for (@Pc(27) Class10 local27 = this.aClass163_30.method3620(); local27 != null; local27 = this.aClass163_30.method3621()) {
			@Pc(33) int local33 = (int) local27.aLong264;
			if (local33 < 0 || local33 >= this.aClass64_1.anInt1829 || this.aClass64_1.anIntArray141[local33] == 0) {
				local27.method6033();
			} else {
				if (this.aByteArray50[local33] == 0) {
					this.method3136(1, local33);
				}
				if (this.aByteArray50[local33] == -1) {
					this.method3136(2, local33);
				}
				if (this.aByteArray50[local33] == 1) {
					local27.method6033();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method3124(@OriginalArg(0) int arg0) {
		@Pc(9) Class10_Sub1_Sub13 local9 = this.method3136(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method4709();
			local9.method6033();
			return local25;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	@Override
	public void method3123(@OriginalArg(0) int arg0) {
		if (this.aClass84_2 == null) {
			return;
		}
		for (@Pc(19) Class10 local19 = this.aClass163_30.method3620(); local19 != null; local19 = this.aClass163_30.method3621()) {
			if ((long) arg0 == local19.aLong264) {
				return;
			}
		}
		@Pc(43) Class10 local43 = new Class10();
		local43.aLong264 = arg0;
		this.aClass163_30.method3613(local43);
	}

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)I")
	public int method3133() {
		return this.anInt3929;
	}

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)I")
	public int method3134() {
		if (this.aClass64_1 == null) {
			return 0;
		} else if (this.aBoolean264) {
			@Pc(20) Class10 local20 = this.aClass163_31.method3620();
			return local20 == null ? 0 : (int) local20.aLong264;
		} else {
			return this.aClass64_1.anInt1828;
		}
	}

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "(I)I")
	public int method3135() {
		return this.aClass64_1 == null ? 0 : this.aClass64_1.anInt1828;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)Lclient!nr;")
	private Class10_Sub1_Sub13 method3136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class10_Sub1_Sub13 local13 = (Class10_Sub1_Sub13) this.aClass167_19.method3709((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean382 && local13.aBoolean383) {
			local13.method6033();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass84_2 == null || this.aByteArray50[arg1] == -1) {
					if (this.aClass103_2.method2589()) {
						return null;
					}
					local13 = this.aClass103_2.method2592(this.anInt3943, arg1, true, (byte) 2);
				} else {
					local13 = this.aClass209_1.method4774(this.aClass84_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass84_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass209_1.method4767(this.aClass84_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass84_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray50[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass103_2.method2593()) {
					return null;
				}
				local13 = this.aClass103_2.method2592(this.anInt3943, arg1, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass167_19.method3705(local13, (long) arg1);
		}
		if (local13.aBoolean383) {
			return null;
		}
		@Pc(153) byte[] local153 = local13.method4709();
		@Pc(187) int local187;
		@Pc(290) Class10_Sub1_Sub13_Sub1 local290;
		if (!(local13 instanceof Class10_Sub1_Sub13_Sub2)) {
			try {
				if (local153 == null || local153.length <= 2) {
					throw new RuntimeException();
				}
				Static95.aCRC32_1.reset();
				Static95.aCRC32_1.update(local153, 0, local153.length - 2);
				local187 = (int) Static95.aCRC32_1.getValue();
				if (local187 != this.aClass64_1.anIntArray145[arg1]) {
					throw new RuntimeException();
				}
				this.aClass103_2.anInt3119 = 0;
				this.aClass103_2.anInt3120 = 0;
			} catch (@Pc(348) RuntimeException local348) {
				this.aClass103_2.method2601();
				local13.method6033();
				if (local13.aBoolean382 && !this.aClass103_2.method2589()) {
					local290 = this.aClass103_2.method2592(this.anInt3943, arg1, true, (byte) 2);
					this.aClass167_19.method3705(local290, (long) arg1);
				}
				return null;
			}
			local153[local153.length - 2] = (byte) (this.aClass64_1.anIntArray143[arg1] >>> 8);
			local153[local153.length - 1] = (byte) this.aClass64_1.anIntArray143[arg1];
			if (this.aClass84_2 != null) {
				this.aClass209_1.method4769(arg1, this.aClass84_2, local153);
				if (this.aByteArray50[arg1] != 1) {
					this.anInt3929++;
					this.aByteArray50[arg1] = 1;
				}
			}
			if (!local13.aBoolean382) {
				local13.method6033();
			}
			return local13;
		}
		try {
			if (local153 == null || local153.length <= 2) {
				throw new RuntimeException();
			}
			Static95.aCRC32_1.reset();
			Static95.aCRC32_1.update(local153, 0, local153.length - 2);
			local187 = (int) Static95.aCRC32_1.getValue();
			if (this.aClass64_1.anIntArray145[arg1] != local187) {
				throw new RuntimeException();
			}
			@Pc(223) int local223 = ((local153[local153.length - 2] & 0xFF) << 8) + (local153[local153.length - 1] & 0xFF);
			if ((this.aClass64_1.anIntArray143[arg1] & 0xFFFF) != local223) {
				throw new RuntimeException();
			}
			if (this.aByteArray50[arg1] != 1) {
				this.anInt3929++;
				this.aByteArray50[arg1] = 1;
			}
			if (!local13.aBoolean382) {
				local13.method6033();
			}
			return local13;
		} catch (@Pc(264) Exception local264) {
			this.aByteArray50[arg1] = -1;
			local13.method6033();
			if (local13.aBoolean382 && !this.aClass103_2.method2589()) {
				local290 = this.aClass103_2.method2592(this.anInt3943, arg1, true, (byte) 2);
				this.aClass167_19.method3705(local290, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "(I)I")
	public int method3137() {
		if (this.method3125() == null) {
			return this.aClass10_Sub1_Sub13_1 == null ? 0 : this.aClass10_Sub1_Sub13_1.method4708();
		} else {
			return 100;
		}
	}
}
