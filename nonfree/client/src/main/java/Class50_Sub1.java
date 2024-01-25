import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!jc;")
	private Class118 aClass118_2;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	private int anInt2378 = 0;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "Lclient!jr;")
	private final Class127 aClass127_11 = new Class127(16);

	@OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
	private int anInt2388 = 0;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "Lclient!tu;")
	private final Class229 aClass229_12 = new Class229();

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!jb;")
	private final Class117 aClass117_11;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	private final int anInt2373;

	@OriginalMember(owner = "client!fa", name = "G", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "Lclient!tu;")
	private Class229 aClass229_11;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!au;")
	private final Class15 aClass15_1;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Z")
	private final boolean aBoolean189;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
	private final int anInt2371;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!ph;")
	private final Class183 aClass183_1;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
	private final int anInt2387;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!jb;")
	private final Class117 aClass117_10;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!g;")
	private Class3_Sub3_Sub3 aClass3_Sub3_Sub3_1;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILclient!jb;Lclient!jb;Lclient!ph;Lclient!au;IIZ)V")
	public Class50_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class183 arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass117_11 = arg1;
		this.anInt2373 = arg0;
		if (this.aClass117_11 == null) {
			this.aBoolean187 = false;
		} else {
			this.aBoolean187 = true;
			this.aClass229_11 = new Class229();
		}
		this.aClass15_1 = arg4;
		this.aBoolean189 = arg7;
		this.anInt2371 = arg6;
		this.aClass183_1 = arg3;
		this.anInt2387 = arg5;
		this.aClass117_10 = arg2;
		if (this.aClass117_10 != null) {
			this.aClass3_Sub3_Sub3_1 = this.aClass15_1.method569(this.anInt2373, this.aClass117_10);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public void method1830() {
		if (this.aClass229_11 == null || this.method1829() == null) {
			return;
		}
		for (@Pc(22) Class3 local22 = this.aClass229_12.method5328(); local22 != null; local22 = this.aClass229_12.method5325()) {
			@Pc(28) int local28 = (int) local22.aLong227;
			if (local28 < 0 || this.aClass118_2.anInt3747 <= local28 || this.aClass118_2.anIntArray287[local28] == 0) {
				local22.method5987();
			} else {
				if (this.aByteArray30[local28] == 0) {
					this.method1838(local28, 1);
				}
				if (this.aByteArray30[local28] == -1) {
					this.method1838(local28, 2);
				}
				if (this.aByteArray30[local28] == 1) {
					local22.method5987();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Lclient!jc;")
	@Override
	public Class118 method1829() {
		if (this.aClass118_2 != null) {
			return this.aClass118_2;
		}
		if (this.aClass3_Sub3_Sub3_1 == null) {
			if (this.aClass183_1.method4508()) {
				return null;
			}
			this.aClass3_Sub3_Sub3_1 = this.aClass183_1.method4503(255, this.anInt2373, (byte) 0, true);
		}
		if (this.aClass3_Sub3_Sub3_1.aBoolean272) {
			return null;
		}
		@Pc(52) byte[] local52 = this.aClass3_Sub3_Sub3_1.method2882();
		if (this.aClass3_Sub3_Sub3_1 instanceof Class3_Sub3_Sub3_Sub2) {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass118_2 = new Class118(local52, this.anInt2387);
				if (this.aClass118_2.anInt3748 != this.anInt2371) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass118_2 = null;
				if (this.aClass183_1.method4508()) {
					this.aClass3_Sub3_Sub3_1 = null;
				} else {
					this.aClass3_Sub3_Sub3_1 = this.aClass183_1.method4503(255, this.anInt2373, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass118_2 = new Class118(local52, this.anInt2387);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass183_1.method4509();
				this.aClass118_2 = null;
				if (this.aClass183_1.method4508()) {
					this.aClass3_Sub3_Sub3_1 = null;
				} else {
					this.aClass3_Sub3_Sub3_1 = this.aClass183_1.method4503(255, this.anInt2373, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass117_10 != null) {
				this.aClass15_1.method570(local52, this.anInt2373, this.aClass117_10);
			}
		}
		if (this.aClass117_11 != null) {
			this.anInt2378 = 0;
			this.aByteArray30 = new byte[this.aClass118_2.anInt3747];
		}
		this.aClass3_Sub3_Sub3_1 = null;
		return this.aClass118_2;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public void method1831() {
		if (this.aClass117_11 != null) {
			this.aBoolean188 = true;
			if (this.aClass229_11 == null) {
				this.aClass229_11 = new Class229();
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I")
	public int method1832() {
		return this.anInt2378;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(BI)V")
	@Override
	public void method1828(@OriginalArg(1) int arg0) {
		if (this.aClass117_11 == null) {
			return;
		}
		for (@Pc(20) Class3 local20 = this.aClass229_12.method5328(); local20 != null; local20 = this.aClass229_12.method5325()) {
			if (local20.aLong227 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class3 local44 = new Class3();
		local44.aLong227 = arg0;
		this.aClass229_12.method5321(local44);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
	public void method1833() {
		if (this.aClass229_11 != null) {
			if (this.method1829() == null) {
				return;
			}
			@Pc(29) boolean local29;
			@Pc(34) Class3 local34;
			@Pc(40) int local40;
			@Pc(129) Class3 local129;
			if (this.aBoolean187) {
				local29 = true;
				for (local34 = this.aClass229_11.method5328(); local34 != null; local34 = this.aClass229_11.method5325()) {
					local40 = (int) local34.aLong227;
					if (this.aByteArray30[local40] == 0) {
						this.method1838(local40, 1);
					}
					if (this.aByteArray30[local40] == 0) {
						local29 = false;
					} else {
						local34.method5987();
					}
				}
				while (this.anInt2388 < this.aClass118_2.anIntArray287.length) {
					if (this.aClass118_2.anIntArray287[this.anInt2388] == 0) {
						this.anInt2388++;
					} else {
						if (this.aClass15_1.anInt610 >= 250) {
							local29 = false;
							break;
						}
						if (this.aByteArray30[this.anInt2388] == 0) {
							this.method1838(this.anInt2388, 1);
						}
						if (this.aByteArray30[this.anInt2388] == 0) {
							local129 = new Class3();
							local129.aLong227 = this.anInt2388;
							local29 = false;
							this.aClass229_11.method5321(local129);
						}
						this.anInt2388++;
					}
				}
				if (local29) {
					this.anInt2388 = 0;
					this.aBoolean187 = false;
				}
			} else if (this.aBoolean188) {
				local29 = true;
				for (local34 = this.aClass229_11.method5328(); local34 != null; local34 = this.aClass229_11.method5325()) {
					local40 = (int) local34.aLong227;
					if (this.aByteArray30[local40] != 1) {
						this.method1838(local40, 2);
					}
					if (this.aByteArray30[local40] == 1) {
						local34.method5987();
					} else {
						local29 = false;
					}
				}
				while (this.aClass118_2.anIntArray287.length > this.anInt2388) {
					if (this.aClass118_2.anIntArray287[this.anInt2388] == 0) {
						this.anInt2388++;
					} else {
						if (this.aClass183_1.method4506()) {
							local29 = false;
							break;
						}
						if (this.aByteArray30[this.anInt2388] != 1) {
							this.method1838(this.anInt2388, 2);
						}
						if (this.aByteArray30[this.anInt2388] != 1) {
							local129 = new Class3();
							local129.aLong227 = this.anInt2388;
							local29 = false;
							this.aClass229_11.method5321(local129);
						}
						this.anInt2388++;
					}
				}
				if (local29) {
					this.anInt2388 = 0;
					this.aBoolean188 = false;
				}
			} else {
				this.aClass229_11 = null;
			}
		}
		if (!this.aBoolean189 || this.aLong71 > Static150.method2672()) {
			return;
		}
		for (@Pc(325) Class3_Sub3_Sub3 local325 = (Class3_Sub3_Sub3) this.aClass127_11.method3248(); local325 != null; local325 = (Class3_Sub3_Sub3) this.aClass127_11.method3252()) {
			if (!local325.aBoolean272) {
				if (local325.aBoolean274) {
					if (!local325.aBoolean273) {
						throw new RuntimeException();
					}
					local325.method5987();
				} else {
					local325.aBoolean274 = true;
				}
			}
		}
		this.aLong71 = Static150.method2672() + 1000L;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I")
	@Override
	public int method1826(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub3_Sub3 local17 = (Class3_Sub3_Sub3) this.aClass127_11.method3246((long) arg0);
		return local17 == null ? 0 : local17.method2879();
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I")
	public int method1835() {
		if (this.aClass118_2 == null) {
			return 0;
		} else if (this.aBoolean187) {
			@Pc(20) Class3 local20 = this.aClass229_11.method5328();
			return local20 == null ? 0 : (int) local20.aLong227;
		} else {
			return this.aClass118_2.anInt3743;
		}
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
	public int method1836() {
		if (this.method1829() == null) {
			return this.aClass3_Sub3_Sub3_1 == null ? 0 : this.aClass3_Sub3_Sub3_1.method2879();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)I")
	public int method1837() {
		return this.aClass118_2 == null ? 0 : this.aClass118_2.anInt3743;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)Lclient!g;")
	private Class3_Sub3_Sub3 method1838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class3_Sub3_Sub3 local21 = (Class3_Sub3_Sub3) this.aClass127_11.method3246((long) arg0);
		if (local21 != null && arg1 == 0 && !local21.aBoolean273 && local21.aBoolean272) {
			local21.method5987();
			local21 = null;
		}
		if (local21 == null) {
			if (arg1 == 0) {
				if (this.aClass117_11 == null || this.aByteArray30[arg0] == -1) {
					if (this.aClass183_1.method4508()) {
						return null;
					}
					local21 = this.aClass183_1.method4503(this.anInt2373, arg0, (byte) 2, true);
				} else {
					local21 = this.aClass15_1.method569(arg0, this.aClass117_11);
				}
			} else if (arg1 == 1) {
				if (this.aClass117_11 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass15_1.method566(this.aClass117_11, arg0);
			} else if (arg1 == 2) {
				if (this.aClass117_11 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray30[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass183_1.method4506()) {
					return null;
				}
				local21 = this.aClass183_1.method4503(this.anInt2373, arg0, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass127_11.method3257((long) arg0, local21);
		}
		if (local21.aBoolean272) {
			return null;
		}
		@Pc(163) byte[] local163 = local21.method2882();
		@Pc(190) int local190;
		@Pc(289) Class3_Sub3_Sub3_Sub1 local289;
		if (!(local21 instanceof Class3_Sub3_Sub3_Sub2)) {
			try {
				if (local163 == null || local163.length <= 2) {
					throw new RuntimeException();
				}
				Static140.aCRC32_1.reset();
				Static140.aCRC32_1.update(local163, 0, local163.length - 2);
				local190 = (int) Static140.aCRC32_1.getValue();
				if (local190 != this.aClass118_2.anIntArray286[arg0]) {
					throw new RuntimeException();
				}
				this.aClass183_1.anInt5589 = 0;
				this.aClass183_1.anInt5590 = 0;
			} catch (@Pc(345) RuntimeException local345) {
				this.aClass183_1.method4509();
				local21.method5987();
				if (local21.aBoolean273 && !this.aClass183_1.method4508()) {
					local289 = this.aClass183_1.method4503(this.anInt2373, arg0, (byte) 2, true);
					this.aClass127_11.method3257((long) arg0, local289);
				}
				return null;
			}
			local163[local163.length - 2] = (byte) (this.aClass118_2.anIntArray291[arg0] >>> 8);
			local163[local163.length - 1] = (byte) this.aClass118_2.anIntArray291[arg0];
			if (this.aClass117_11 != null) {
				this.aClass15_1.method570(local163, arg0, this.aClass117_11);
				if (this.aByteArray30[arg0] != 1) {
					this.anInt2378++;
					this.aByteArray30[arg0] = 1;
				}
			}
			if (!local21.aBoolean273) {
				local21.method5987();
			}
			return local21;
		}
		try {
			if (local163 == null || local163.length <= 2) {
				throw new RuntimeException();
			}
			Static140.aCRC32_1.reset();
			Static140.aCRC32_1.update(local163, 0, local163.length - 2);
			local190 = (int) Static140.aCRC32_1.getValue();
			if (local190 != this.aClass118_2.anIntArray286[arg0]) {
				throw new RuntimeException();
			}
			@Pc(222) int local222 = ((local163[local163.length - 2] & 0xFF) << 8) + (local163[local163.length - 1] & 0xFF);
			if (local222 != (this.aClass118_2.anIntArray291[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray30[arg0] != 1) {
				this.anInt2378++;
				this.aByteArray30[arg0] = 1;
			}
			if (!local21.aBoolean273) {
				local21.method5987();
			}
			return local21;
		} catch (@Pc(263) Exception local263) {
			this.aByteArray30[arg0] = -1;
			local21.method5987();
			if (local21.aBoolean273 && !this.aClass183_1.method4508()) {
				local289 = this.aClass183_1.method4503(this.anInt2373, arg0, (byte) 2, true);
				this.aClass127_11.method3257((long) arg0, local289);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method1825(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub3_Sub3 local9 = this.method1838(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local9.method2882();
			local9.method5987();
			return local24;
		}
	}
}
