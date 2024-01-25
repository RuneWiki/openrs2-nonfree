import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "Lclient!hd;")
	private Class101 aClass101_1;

	@OriginalMember(owner = "client!kr", name = "J", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!kr", name = "O", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
	private int anInt3960 = 0;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!gu;")
	private final Class96 aClass96_25 = new Class96(16);

	@OriginalMember(owner = "client!kr", name = "L", descriptor = "I")
	private int anInt3975 = 0;

	@OriginalMember(owner = "client!kr", name = "N", descriptor = "Lclient!oe;")
	private final Class181 aClass181_41 = new Class181();

	@OriginalMember(owner = "client!kr", name = "Q", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	private final int anInt3962;

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "Lclient!eo;")
	private final Class65 aClass65_6;

	@OriginalMember(owner = "client!kr", name = "K", descriptor = "Z")
	private boolean aBoolean283;

	@OriginalMember(owner = "client!kr", name = "M", descriptor = "Lclient!oe;")
	private Class181 aClass181_40;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!eo;")
	private final Class65 aClass65_5;

	@OriginalMember(owner = "client!kr", name = "D", descriptor = "Lclient!pr;")
	private final Class195 aClass195_1;

	@OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
	private final int anInt3965;

	@OriginalMember(owner = "client!kr", name = "H", descriptor = "Lclient!tj;")
	private final Class230 aClass230_2;

	@OriginalMember(owner = "client!kr", name = "P", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
	private final int anInt3961;

	@OriginalMember(owner = "client!kr", name = "w", descriptor = "Lclient!ku;")
	private Class1_Sub2_Sub8 aClass1_Sub2_Sub8_1;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(ILclient!eo;Lclient!eo;Lclient!pr;Lclient!tj;IIZ)V")
	public Class90_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class195 arg3, @OriginalArg(4) Class230 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3962 = arg0;
		this.aClass65_6 = arg1;
		if (this.aClass65_6 == null) {
			this.aBoolean283 = false;
		} else {
			this.aBoolean283 = true;
			this.aClass181_40 = new Class181();
		}
		this.aClass65_5 = arg2;
		this.aClass195_1 = arg3;
		this.anInt3965 = arg6;
		this.aClass230_2 = arg4;
		this.aBoolean285 = arg7;
		this.anInt3961 = arg5;
		if (this.aClass65_5 != null) {
			this.aClass1_Sub2_Sub8_1 = this.aClass230_2.method5212(this.aClass65_5, this.anInt3962);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method3339(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub2_Sub8 local9 = this.method3350(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local9.method4412();
			local9.method6020();
			return local22;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public void method3344() {
		if (this.aClass65_6 != null) {
			this.aBoolean284 = true;
			if (this.aClass181_40 == null) {
				this.aClass181_40 = new Class181();
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	public void method3345() {
		if (this.aClass181_40 != null) {
			if (this.method3335() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(27) Class1 local27;
			@Pc(33) int local33;
			@Pc(121) Class1 local121;
			if (this.aBoolean283) {
				local22 = true;
				for (local27 = this.aClass181_40.method4112(); local27 != null; local27 = this.aClass181_40.method4104()) {
					local33 = (int) local27.aLong222;
					if (this.aByteArray62[local33] == 0) {
						this.method3350(local33, 1);
					}
					if (this.aByteArray62[local33] == 0) {
						local22 = false;
					} else {
						local27.method6020();
					}
				}
				while (this.aClass101_1.anIntArray219.length > this.anInt3975) {
					if (this.aClass101_1.anIntArray219[this.anInt3975] == 0) {
						this.anInt3975++;
					} else {
						if (this.aClass230_2.anInt6264 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray62[this.anInt3975] == 0) {
							this.method3350(this.anInt3975, 1);
						}
						if (this.aByteArray62[this.anInt3975] == 0) {
							local121 = new Class1();
							local121.aLong222 = this.anInt3975;
							this.aClass181_40.method4102(local121);
							local22 = false;
						}
						this.anInt3975++;
					}
				}
				if (local22) {
					this.aBoolean283 = false;
					this.anInt3975 = 0;
				}
			} else if (this.aBoolean284) {
				local22 = true;
				for (local27 = this.aClass181_40.method4112(); local27 != null; local27 = this.aClass181_40.method4104()) {
					local33 = (int) local27.aLong222;
					if (this.aByteArray62[local33] != 1) {
						this.method3350(local33, 2);
					}
					if (this.aByteArray62[local33] == 1) {
						local27.method6020();
					} else {
						local22 = false;
					}
				}
				while (this.anInt3975 < this.aClass101_1.anIntArray219.length) {
					if (this.aClass101_1.anIntArray219[this.anInt3975] == 0) {
						this.anInt3975++;
					} else {
						if (this.aClass195_1.method4445()) {
							local22 = false;
							break;
						}
						if (this.aByteArray62[this.anInt3975] != 1) {
							this.method3350(this.anInt3975, 2);
						}
						if (this.aByteArray62[this.anInt3975] != 1) {
							local121 = new Class1();
							local121.aLong222 = this.anInt3975;
							local22 = false;
							this.aClass181_40.method4102(local121);
						}
						this.anInt3975++;
					}
				}
				if (local22) {
					this.anInt3975 = 0;
					this.aBoolean284 = false;
				}
			} else {
				this.aClass181_40 = null;
			}
		}
		if (!this.aBoolean285 || Static279.method4058() < this.aLong122) {
			return;
		}
		for (@Pc(331) Class1_Sub2_Sub8 local331 = (Class1_Sub2_Sub8) this.aClass96_25.method2342(); local331 != null; local331 = (Class1_Sub2_Sub8) this.aClass96_25.method2339()) {
			if (!local331.aBoolean385) {
				if (local331.aBoolean383) {
					if (!local331.aBoolean384) {
						throw new RuntimeException();
					}
					local331.method6020();
				} else {
					local331.aBoolean383 = true;
				}
			}
		}
		this.aLong122 = Static279.method4058() + 1000L;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)V")
	@Override
	public void method3336(@OriginalArg(1) int arg0) {
		if (this.aClass65_6 == null) {
			return;
		}
		for (@Pc(21) Class1 local21 = this.aClass181_41.method4112(); local21 != null; local21 = this.aClass181_41.method4104()) {
			if ((long) arg0 == local21.aLong222) {
				return;
			}
		}
		@Pc(41) Class1 local41 = new Class1();
		local41.aLong222 = arg0;
		this.aClass181_41.method4102(local41);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lclient!hd;")
	@Override
	public Class101 method3335() {
		if (this.aClass101_1 != null) {
			return this.aClass101_1;
		}
		if (this.aClass1_Sub2_Sub8_1 == null) {
			if (this.aClass195_1.method4450()) {
				return null;
			}
			this.aClass1_Sub2_Sub8_1 = this.aClass195_1.method4451(255, (byte) 0, true, this.anInt3962);
		}
		if (this.aClass1_Sub2_Sub8_1.aBoolean385) {
			return null;
		}
		@Pc(52) byte[] local52 = this.aClass1_Sub2_Sub8_1.method4412();
		if (this.aClass1_Sub2_Sub8_1 instanceof Class1_Sub2_Sub8_Sub1) {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass101_1 = new Class101(local52, this.anInt3961);
				if (this.anInt3965 != this.aClass101_1.anInt2773) {
					throw new RuntimeException();
				}
			} catch (@Pc(146) RuntimeException local146) {
				this.aClass101_1 = null;
				if (this.aClass195_1.method4450()) {
					this.aClass1_Sub2_Sub8_1 = null;
				} else {
					this.aClass1_Sub2_Sub8_1 = this.aClass195_1.method4451(255, (byte) 0, true, this.anInt3962);
				}
				return null;
			}
		} else {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass101_1 = new Class101(local52, this.anInt3961);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass195_1.method4447();
				this.aClass101_1 = null;
				if (this.aClass195_1.method4450()) {
					this.aClass1_Sub2_Sub8_1 = null;
				} else {
					this.aClass1_Sub2_Sub8_1 = this.aClass195_1.method4451(255, (byte) 0, true, this.anInt3962);
				}
				return null;
			}
			if (this.aClass65_5 != null) {
				this.aClass230_2.method5215(local52, this.aClass65_5, this.anInt3962);
			}
		}
		this.aClass1_Sub2_Sub8_1 = null;
		if (this.aClass65_6 != null) {
			this.aByteArray62 = new byte[this.aClass101_1.anInt2769];
			this.anInt3960 = 0;
		}
		return this.aClass101_1;
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
	public void method3347() {
		if (this.aClass181_40 == null || this.method3335() == null) {
			return;
		}
		for (@Pc(23) Class1 local23 = this.aClass181_41.method4112(); local23 != null; local23 = this.aClass181_41.method4104()) {
			@Pc(29) int local29 = (int) local23.aLong222;
			if (local29 < 0 || this.aClass101_1.anInt2769 <= local29 || this.aClass101_1.anIntArray219[local29] == 0) {
				local23.method6020();
			} else {
				if (this.aByteArray62[local29] == 0) {
					this.method3350(local29, 1);
				}
				if (this.aByteArray62[local29] == -1) {
					this.method3350(local29, 2);
				}
				if (this.aByteArray62[local29] == 1) {
					local23.method6020();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(Z)I")
	public int method3348() {
		if (this.method3335() == null) {
			return this.aClass1_Sub2_Sub8_1 == null ? 0 : this.aClass1_Sub2_Sub8_1.method4411();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)I")
	public int method3349() {
		return this.anInt3960;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)Lclient!ku;")
	private Class1_Sub2_Sub8 method3350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub8 local13 = (Class1_Sub2_Sub8) this.aClass96_25.method2335((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean384 && local13.aBoolean385) {
			local13.method6020();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass65_6 == null || this.aByteArray62[arg0] == -1) {
					if (this.aClass195_1.method4450()) {
						return null;
					}
					local13 = this.aClass195_1.method4451(this.anInt3962, (byte) 2, true, arg0);
				} else {
					local13 = this.aClass230_2.method5212(this.aClass65_6, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass65_6 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass230_2.method5218(arg0, this.aClass65_6);
			} else if (arg1 == 2) {
				if (this.aClass65_6 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray62[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass195_1.method4445()) {
					return null;
				}
				local13 = this.aClass195_1.method4451(this.anInt3962, (byte) 2, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass96_25.method2341((long) arg0, local13);
		}
		if (local13.aBoolean385) {
			return null;
		}
		@Pc(167) byte[] local167 = local13.method4412();
		@Pc(194) int local194;
		@Pc(240) Class1_Sub2_Sub8_Sub2 local240;
		if (!(local13 instanceof Class1_Sub2_Sub8_Sub1)) {
			try {
				if (local167 == null || local167.length <= 2) {
					throw new RuntimeException();
				}
				Static405.aCRC32_1.reset();
				Static405.aCRC32_1.update(local167, 0, local167.length - 2);
				local194 = (int) Static405.aCRC32_1.getValue();
				if (this.aClass101_1.anIntArray217[arg0] != local194) {
					throw new RuntimeException();
				}
				this.aClass195_1.anInt5404 = 0;
				this.aClass195_1.anInt5403 = 0;
			} catch (@Pc(215) RuntimeException local215) {
				this.aClass195_1.method4447();
				local13.method6020();
				if (local13.aBoolean384 && !this.aClass195_1.method4450()) {
					local240 = this.aClass195_1.method4451(this.anInt3962, (byte) 2, true, arg0);
					this.aClass96_25.method2341((long) arg0, local240);
				}
				return null;
			}
			local167[local167.length - 2] = (byte) (this.aClass101_1.anIntArray220[arg0] >>> 8);
			local167[local167.length - 1] = (byte) this.aClass101_1.anIntArray220[arg0];
			if (this.aClass65_6 != null) {
				this.aClass230_2.method5215(local167, this.aClass65_6, arg0);
				if (this.aByteArray62[arg0] != 1) {
					this.anInt3960++;
					this.aByteArray62[arg0] = 1;
				}
			}
			if (!local13.aBoolean384) {
				local13.method6020();
			}
			return local13;
		}
		try {
			if (local167 == null || local167.length <= 2) {
				throw new RuntimeException();
			}
			Static405.aCRC32_1.reset();
			Static405.aCRC32_1.update(local167, 0, local167.length - 2);
			local194 = (int) Static405.aCRC32_1.getValue();
			if (local194 != this.aClass101_1.anIntArray217[arg0]) {
				throw new RuntimeException();
			}
			@Pc(373) int local373 = ((local167[local167.length - 2] & 0xFF) << 8) + (local167[local167.length - 1] & 0xFF);
			if (local373 != (this.aClass101_1.anIntArray220[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray62[arg0] != 1) {
				this.anInt3960++;
				this.aByteArray62[arg0] = 1;
			}
			if (!local13.aBoolean384) {
				local13.method6020();
			}
			return local13;
		} catch (@Pc(418) Exception local418) {
			this.aByteArray62[arg0] = -1;
			local13.method6020();
			if (local13.aBoolean384 && !this.aClass195_1.method4450()) {
				local240 = this.aClass195_1.method4451(this.anInt3962, (byte) 2, true, arg0);
				this.aClass96_25.method2341((long) arg0, local240);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)I")
	@Override
	public int method3341(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub8 local16 = (Class1_Sub2_Sub8) this.aClass96_25.method2335((long) arg0);
		return local16 == null ? 0 : local16.method4411();
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)I")
	public int method3351() {
		if (this.aClass101_1 == null) {
			return 0;
		} else if (this.aBoolean283) {
			@Pc(28) Class1 local28 = this.aClass181_40.method4112();
			return local28 == null ? 0 : (int) local28.aLong222;
		} else {
			return this.aClass101_1.anInt2770;
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)I")
	public int method3352() {
		return this.aClass101_1 == null ? 0 : this.aClass101_1.anInt2770;
	}
}
