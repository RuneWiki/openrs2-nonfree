import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!fd;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!on", name = "L", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "I")
	private int anInt4076 = 0;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "Lclient!cn;")
	private Class30 aClass30_24 = new Class30(16);

	@OriginalMember(owner = "client!on", name = "O", descriptor = "I")
	private int anInt4080 = 0;

	@OriginalMember(owner = "client!on", name = "N", descriptor = "Lclient!fk;")
	private Class56 aClass56_20 = new Class56();

	@OriginalMember(owner = "client!on", name = "U", descriptor = "J")
	private long aLong175 = 0L;

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "Lclient!th;")
	private Class171 aClass171_4;

	@OriginalMember(owner = "client!on", name = "S", descriptor = "Z")
	private boolean aBoolean290;

	@OriginalMember(owner = "client!on", name = "M", descriptor = "Lclient!fk;")
	private Class56 aClass56_19;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	private int anInt4068;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Lclient!th;")
	private Class171 aClass171_3;

	@OriginalMember(owner = "client!on", name = "D", descriptor = "Lclient!uc;")
	private Class177 aClass177_2;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private int anInt4061;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Lclient!na;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!on", name = "V", descriptor = "Z")
	private boolean aBoolean291;

	@OriginalMember(owner = "client!on", name = "J", descriptor = "Lclient!ao;")
	private Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(ILclient!th;Lclient!th;Lclient!uc;Lclient!na;IIZ)V")
	public Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class177 arg3, @OriginalArg(4) Class117 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4077 = arg0;
		this.aClass171_4 = arg1;
		if (this.aClass171_4 == null) {
			this.aBoolean290 = false;
		} else {
			this.aBoolean290 = true;
			this.aClass56_19 = new Class56();
		}
		this.anInt4068 = arg6;
		this.aClass171_3 = arg2;
		this.aClass177_2 = arg3;
		this.anInt4061 = arg5;
		this.aClass117_1 = arg4;
		this.aBoolean291 = arg7;
		if (this.aClass171_3 != null) {
			this.aClass3_Sub4_Sub1_1 = this.aClass117_1.method2953(this.aClass171_3, this.anInt4077);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Lclient!ao;")
	private Class3_Sub4_Sub1 method3426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub4_Sub1 local15 = (Class3_Sub4_Sub1) this.aClass30_24.method663((long) arg1);
		if (local15 != null && arg0 == 0 && !local15.aBoolean298 && local15.aBoolean297) {
			local15.method5013();
			local15 = null;
		}
		if (local15 == null) {
			if (arg0 == 0) {
				if (this.aClass171_4 == null || this.aByteArray51[arg1] == -1) {
					if (this.aClass177_2.method4535()) {
						return null;
					}
					local15 = this.aClass177_2.method4550(true, this.anInt4077, arg1, (byte) 2);
				} else {
					local15 = this.aClass117_1.method2953(this.aClass171_4, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass171_4 == null) {
					throw new RuntimeException();
				}
				local15 = this.aClass117_1.method2952(this.aClass171_4, arg1);
			} else if (arg0 == 2) {
				if (this.aClass171_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray51[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass177_2.method4538()) {
					return null;
				}
				local15 = this.aClass177_2.method4550(false, this.anInt4077, arg1, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass30_24.method668(local15, (long) arg1);
		}
		if (local15.aBoolean297) {
			return null;
		}
		@Pc(177) byte[] local177 = local15.method3528();
		@Pc(207) int local207;
		@Pc(256) Class3_Sub4_Sub1_Sub2 local256;
		if (!(local15 instanceof Class3_Sub4_Sub1_Sub1)) {
			try {
				if (local177 == null || local177.length <= 2) {
					throw new RuntimeException();
				}
				Static218.aCRC32_1.reset();
				Static218.aCRC32_1.update(local177, 0, local177.length - 2);
				local207 = (int) Static218.aCRC32_1.getValue();
				if (this.aClass52_1.anIntArray144[arg1] != local207) {
					throw new RuntimeException();
				}
				this.aClass177_2.anInt5592 = 0;
				this.aClass177_2.anInt5591 = 0;
			} catch (@Pc(228) RuntimeException local228) {
				this.aClass177_2.method4545();
				local15.method5013();
				if (local15.aBoolean298 && !this.aClass177_2.method4535()) {
					local256 = this.aClass177_2.method4550(true, this.anInt4077, arg1, (byte) 2);
					this.aClass30_24.method668(local256, (long) arg1);
				}
				return null;
			}
			local177[local177.length - 2] = (byte) (this.aClass52_1.anIntArray142[arg1] >>> 8);
			local177[local177.length - 1] = (byte) this.aClass52_1.anIntArray142[arg1];
			if (this.aClass171_4 != null) {
				this.aClass117_1.method2950(this.aClass171_4, arg1, local177);
				if (this.aByteArray51[arg1] != 1) {
					this.anInt4076++;
					this.aByteArray51[arg1] = 1;
				}
			}
			if (!local15.aBoolean298) {
				local15.method5013();
			}
			return local15;
		}
		try {
			if (local177 == null || local177.length <= 2) {
				throw new RuntimeException();
			}
			Static218.aCRC32_1.reset();
			Static218.aCRC32_1.update(local177, 0, local177.length - 2);
			local207 = (int) Static218.aCRC32_1.getValue();
			if (local207 != this.aClass52_1.anIntArray144[arg1]) {
				throw new RuntimeException();
			}
			@Pc(390) int local390 = ((local177[local177.length - 2] & 0xFF) << 8) + (local177[local177.length - 1] & 0xFF);
			if ((this.aClass52_1.anIntArray142[arg1] & 0xFFFF) != local390) {
				throw new RuntimeException();
			}
			if (this.aByteArray51[arg1] != 1) {
				if (this.aByteArray51[arg1] != 0) {
				}
				this.anInt4076++;
				this.aByteArray51[arg1] = 1;
			}
			if (!local15.aBoolean298) {
				local15.method5013();
			}
			return local15;
		} catch (@Pc(439) Exception local439) {
			this.aByteArray51[arg1] = -1;
			local15.method5013();
			if (local15.aBoolean298 && !this.aClass177_2.method4535()) {
				local256 = this.aClass177_2.method4550(true, this.anInt4077, arg1, (byte) 2);
				this.aClass30_24.method668(local256, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V")
	@Override
	public void method3420(@OriginalArg(0) int arg0) {
		if (this.aClass171_4 == null) {
			return;
		}
		@Pc(16) Class3 local16;
		for (local16 = this.aClass56_20.method1281(); local16 != null; local16 = this.aClass56_20.method1278()) {
			if ((long) arg0 == local16.aLong243) {
				return;
			}
		}
		local16 = new Class3();
		local16.aLong243 = arg0;
		this.aClass56_20.method1282(local16);
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public void method3428() {
		if (this.aClass56_19 != null) {
			if (this.method3425() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(27) Class3 local27;
			@Pc(34) int local34;
			if (this.aBoolean290) {
				local22 = true;
				for (local27 = this.aClass56_19.method1281(); local27 != null; local27 = this.aClass56_19.method1278()) {
					local34 = (int) local27.aLong243;
					if (this.aByteArray51[local34] == 0) {
						this.method3426(1, local34);
					}
					if (this.aByteArray51[local34] == 0) {
						local22 = false;
					} else {
						local27.method5013();
					}
				}
				while (this.anInt4080 < this.aClass52_1.anIntArray145.length) {
					if (this.aClass52_1.anIntArray145[this.anInt4080] == 0) {
						this.anInt4080++;
					} else {
						if (this.aClass117_1.anInt3345 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray51[this.anInt4080] == 0) {
							this.method3426(1, this.anInt4080);
						}
						if (this.aByteArray51[this.anInt4080] == 0) {
							local22 = false;
							local27 = new Class3();
							local27.aLong243 = this.anInt4080;
							this.aClass56_19.method1282(local27);
						}
						this.anInt4080++;
					}
				}
				if (local22) {
					this.aBoolean290 = false;
					this.anInt4080 = 0;
				}
			} else if (this.aBoolean288) {
				local22 = true;
				for (local27 = this.aClass56_19.method1281(); local27 != null; local27 = this.aClass56_19.method1278()) {
					local34 = (int) local27.aLong243;
					if (this.aByteArray51[local34] != 1) {
						this.method3426(2, local34);
					}
					if (this.aByteArray51[local34] == 1) {
						local27.method5013();
					} else {
						local22 = false;
					}
				}
				while (this.aClass52_1.anIntArray145.length > this.anInt4080) {
					if (this.aClass52_1.anIntArray145[this.anInt4080] == 0) {
						this.anInt4080++;
					} else {
						if (this.aClass177_2.method4538()) {
							local22 = false;
							break;
						}
						if (this.aByteArray51[this.anInt4080] != 1) {
							this.method3426(2, this.anInt4080);
						}
						if (this.aByteArray51[this.anInt4080] != 1) {
							local22 = false;
							local27 = new Class3();
							local27.aLong243 = this.anInt4080;
							this.aClass56_19.method1282(local27);
						}
						this.anInt4080++;
					}
				}
				if (local22) {
					this.aBoolean288 = false;
					this.anInt4080 = 0;
				}
			} else {
				this.aClass56_19 = null;
			}
		}
		if (!this.aBoolean291 || this.aLong175 > Static128.method2196()) {
			return;
		}
		for (@Pc(339) Class3_Sub4_Sub1 local339 = (Class3_Sub4_Sub1) this.aClass30_24.method664(); local339 != null; local339 = (Class3_Sub4_Sub1) this.aClass30_24.method671()) {
			if (!local339.aBoolean297) {
				if (local339.aBoolean299) {
					if (!local339.aBoolean298) {
						throw new RuntimeException();
					}
					local339.method5013();
				} else {
					local339.aBoolean299 = true;
				}
			}
		}
		this.aLong175 = Static128.method2196() + 1000L;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)I")
	public int method3429() {
		if (this.aClass52_1 == null) {
			return 0;
		} else if (this.aBoolean290) {
			@Pc(26) Class3 local26 = this.aClass56_19.method1281();
			return local26 == null ? 0 : (int) local26.aLong243;
		} else {
			return this.aClass52_1.anInt1451;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
	public int method3431() {
		return this.anInt4076;
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)I")
	public int method3432() {
		if (this.method3425() == null) {
			return this.aClass3_Sub4_Sub1_1 == null ? 0 : this.aClass3_Sub4_Sub1_1.method3534();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Lclient!fd;")
	@Override
	public Class52 method3425() {
		if (this.aClass52_1 != null) {
			return this.aClass52_1;
		}
		if (this.aClass3_Sub4_Sub1_1 == null) {
			if (this.aClass177_2.method4535()) {
				return null;
			}
			this.aClass3_Sub4_Sub1_1 = this.aClass177_2.method4550(true, 255, this.anInt4077, (byte) 0);
		}
		if (this.aClass3_Sub4_Sub1_1.aBoolean297) {
			return null;
		}
		@Pc(54) byte[] local54 = this.aClass3_Sub4_Sub1_1.method3528();
		if (this.aClass3_Sub4_Sub1_1 instanceof Class3_Sub4_Sub1_Sub1) {
			try {
				if (local54 == null) {
					throw new RuntimeException();
				}
				this.aClass52_1 = new Class52(local54, this.anInt4061);
				if (this.aClass52_1.anInt1454 != this.anInt4068) {
					throw new RuntimeException();
				}
			} catch (@Pc(86) RuntimeException local86) {
				this.aClass52_1 = null;
				if (this.aClass177_2.method4535()) {
					this.aClass3_Sub4_Sub1_1 = null;
				} else {
					this.aClass3_Sub4_Sub1_1 = this.aClass177_2.method4550(true, 255, this.anInt4077, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local54 == null) {
					throw new RuntimeException();
				}
				this.aClass52_1 = new Class52(local54, this.anInt4061);
			} catch (@Pc(129) RuntimeException local129) {
				this.aClass177_2.method4545();
				this.aClass52_1 = null;
				if (this.aClass177_2.method4535()) {
					this.aClass3_Sub4_Sub1_1 = null;
				} else {
					this.aClass3_Sub4_Sub1_1 = this.aClass177_2.method4550(true, 255, this.anInt4077, (byte) 0);
				}
				return null;
			}
			if (this.aClass171_3 != null) {
				this.aClass117_1.method2950(this.aClass171_3, this.anInt4077, local54);
			}
		}
		if (this.aClass171_4 != null) {
			this.anInt4076 = 0;
			this.aByteArray51 = new byte[this.aClass52_1.anInt1455];
		}
		this.aClass3_Sub4_Sub1_1 = null;
		return this.aClass52_1;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
	@Override
	public int method3422(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub4_Sub1 local14 = (Class3_Sub4_Sub1) this.aClass30_24.method663((long) arg0);
		return local14 == null ? 0 : local14.method3534();
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	public void method3433() {
		if (this.aClass171_4 != null) {
			this.aBoolean288 = true;
			if (this.aClass56_19 == null) {
				this.aClass56_19 = new Class56();
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "h", descriptor = "(I)I")
	public int method3435() {
		return this.aClass52_1 == null ? 0 : this.aClass52_1.anInt1451;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3424(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub4_Sub1 local17 = this.method3426(0, arg0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local17.method3528();
			local17.method5013();
			return local26;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	public void method3436() {
		if (this.aClass56_19 == null || this.method3425() == null) {
			return;
		}
		for (@Pc(25) Class3 local25 = this.aClass56_20.method1281(); local25 != null; local25 = this.aClass56_20.method1278()) {
			@Pc(31) int local31 = (int) local25.aLong243;
			if (local31 < 0 || this.aClass52_1.anInt1455 <= local31 || this.aClass52_1.anIntArray145[local31] == 0) {
				local25.method5013();
			} else {
				if (this.aByteArray51[local31] == 0) {
					this.method3426(1, local31);
				}
				if (this.aByteArray51[local31] == -1) {
					this.method3426(2, local31);
				}
				if (this.aByteArray51[local31] == 1) {
					local25.method5013();
				}
			}
		}
	}
}
