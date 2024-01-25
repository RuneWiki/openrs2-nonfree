import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!lr;")
	private Class135 aClass135_1;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "Z")
	private boolean aBoolean251;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
	private int anInt3420 = 0;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "Lclient!aj;")
	private final Class10 aClass10_31 = new Class10(16);

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
	private int anInt3423 = 0;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "Lclient!fi;")
	private final Class74 aClass74_25 = new Class74();

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "J")
	private long aLong119 = 0L;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	private final int anInt3417;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!an;")
	private final Class13 aClass13_2;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "Z")
	private boolean aBoolean250;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "Lclient!fi;")
	private Class74 aClass74_24;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private final int anInt3411;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!ps;")
	private final Class167 aClass167_1;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "Lclient!p;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "Lclient!an;")
	private final Class13 aClass13_3;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
	private final int anInt3422;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "Z")
	private final boolean aBoolean252;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!qc;")
	private Class7_Sub1_Sub8 aClass7_Sub1_Sub8_1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILclient!an;Lclient!an;Lclient!p;Lclient!ps;IIZ)V")
	public Class119_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) Class160 arg3, @OriginalArg(4) Class167 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3417 = arg0;
		this.aClass13_2 = arg1;
		if (this.aClass13_2 == null) {
			this.aBoolean250 = false;
		} else {
			this.aBoolean250 = true;
			this.aClass74_24 = new Class74();
		}
		this.anInt3411 = arg5;
		this.aClass167_1 = arg4;
		this.aClass160_1 = arg3;
		this.aClass13_3 = arg2;
		this.anInt3422 = arg6;
		this.aBoolean252 = arg7;
		if (this.aClass13_3 != null) {
			this.aClass7_Sub1_Sub8_1 = this.aClass167_1.method4283(this.aClass13_3, this.anInt3417);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)Lclient!qc;")
	private Class7_Sub1_Sub8 method3144(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class7_Sub1_Sub8 local11 = (Class7_Sub1_Sub8) this.aClass10_31.method163((long) arg0);
		if (local11 != null && arg1 == 0 && !local11.aBoolean445 && local11.aBoolean447) {
			local11.method5648();
			local11 = null;
		}
		if (local11 == null) {
			if (arg1 == 0) {
				if (this.aClass13_2 == null || this.aByteArray49[arg0] == -1) {
					if (this.aClass160_1.method4109()) {
						return null;
					}
					local11 = this.aClass160_1.method4110((byte) 2, true, arg0, this.anInt3417);
				} else {
					local11 = this.aClass167_1.method4283(this.aClass13_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass13_2 == null) {
					throw new RuntimeException();
				}
				local11 = this.aClass167_1.method4276(this.aClass13_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass13_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray49[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass160_1.method4119()) {
					return null;
				}
				local11 = this.aClass160_1.method4110((byte) 2, false, arg0, this.anInt3417);
			} else {
				throw new RuntimeException();
			}
			this.aClass10_31.method161((long) arg0, local11);
		}
		if (local11.aBoolean447) {
			return null;
		}
		@Pc(152) byte[] local152 = local11.method5172();
		@Pc(181) int local181;
		@Pc(231) Class7_Sub1_Sub8_Sub2 local231;
		if (!(local11 instanceof Class7_Sub1_Sub8_Sub1)) {
			try {
				if (local152 == null || local152.length <= 2) {
					throw new RuntimeException();
				}
				Static44.aCRC32_1.reset();
				Static44.aCRC32_1.update(local152, 0, local152.length - 2);
				local181 = (int) Static44.aCRC32_1.getValue();
				if (this.aClass135_1.anIntArray528[arg0] != local181) {
					throw new RuntimeException();
				}
				this.aClass160_1.anInt4734 = 0;
				this.aClass160_1.anInt4735 = 0;
			} catch (@Pc(206) RuntimeException local206) {
				this.aClass160_1.method4106();
				local11.method5648();
				if (local11.aBoolean445 && !this.aClass160_1.method4109()) {
					local231 = this.aClass160_1.method4110((byte) 2, true, arg0, this.anInt3417);
					this.aClass10_31.method161((long) arg0, local231);
				}
				return null;
			}
			local152[local152.length - 2] = (byte) (this.aClass135_1.anIntArray527[arg0] >>> 8);
			local152[local152.length - 1] = (byte) this.aClass135_1.anIntArray527[arg0];
			if (this.aClass13_2 != null) {
				this.aClass167_1.method4279(arg0, this.aClass13_2, local152);
				if (this.aByteArray49[arg0] != 1) {
					this.anInt3420++;
					this.aByteArray49[arg0] = 1;
				}
			}
			if (!local11.aBoolean445) {
				local11.method5648();
			}
			return local11;
		}
		try {
			if (local152 == null || local152.length <= 2) {
				throw new RuntimeException();
			}
			Static44.aCRC32_1.reset();
			Static44.aCRC32_1.update(local152, 0, local152.length - 2);
			local181 = (int) Static44.aCRC32_1.getValue();
			if (this.aClass135_1.anIntArray528[arg0] != local181) {
				throw new RuntimeException();
			}
			@Pc(364) int local364 = ((local152[local152.length - 2] & 0xFF) << 8) + (local152[local152.length - 1] & 0xFF);
			if ((this.aClass135_1.anIntArray527[arg0] & 0xFFFF) != local364) {
				throw new RuntimeException();
			}
			if (this.aByteArray49[arg0] != 1) {
				this.anInt3420++;
				this.aByteArray49[arg0] = 1;
			}
			if (!local11.aBoolean445) {
				local11.method5648();
			}
			return local11;
		} catch (@Pc(407) Exception local407) {
			this.aByteArray49[arg0] = -1;
			local11.method5648();
			if (local11.aBoolean445 && !this.aClass160_1.method4109()) {
				local231 = this.aClass160_1.method4110((byte) 2, true, arg0, this.anInt3417);
				this.aClass10_31.method161((long) arg0, local231);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public void method3146() {
		if (this.aClass13_2 != null) {
			this.aBoolean251 = true;
			if (this.aClass74_24 == null) {
				this.aClass74_24 = new Class74();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)I")
	public int method3147() {
		return this.anInt3420;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
	@Override
	public int method3142(@OriginalArg(0) int arg0) {
		@Pc(15) Class7_Sub1_Sub8 local15 = (Class7_Sub1_Sub8) this.aClass10_31.method163((long) arg0);
		return local15 == null ? 0 : local15.method5169();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I")
	public int method3148() {
		if (this.aClass135_1 == null) {
			return 0;
		} else if (this.aBoolean250) {
			@Pc(28) Class7 local28 = this.aClass74_24.method1793();
			return local28 == null ? 0 : (int) local28.aLong232;
		} else {
			return this.aClass135_1.anInt3835;
		}
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I")
	public int method3149() {
		if (this.method3138() == null) {
			return this.aClass7_Sub1_Sub8_1 == null ? 0 : this.aClass7_Sub1_Sub8_1.method5169();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
	public void method3150() {
		if (this.aClass74_24 == null || this.method3138() == null) {
			return;
		}
		for (@Pc(19) Class7 local19 = this.aClass74_25.method1793(); local19 != null; local19 = this.aClass74_25.method1798()) {
			@Pc(32) int local32 = (int) local19.aLong232;
			if (local32 < 0 || this.aClass135_1.anInt3837 <= local32 || this.aClass135_1.anIntArray525[local32] == 0) {
				local19.method5648();
			} else {
				if (this.aByteArray49[local32] == 0) {
					this.method3144(local32, 1);
				}
				if (this.aByteArray49[local32] == -1) {
					this.method3144(local32, 2);
				}
				if (this.aByteArray49[local32] == 1) {
					local19.method5648();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
	public void method3151() {
		if (this.aClass74_24 != null) {
			if (this.method3138() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class7 local30;
			@Pc(36) int local36;
			@Pc(126) Class7 local126;
			if (this.aBoolean250) {
				local25 = true;
				for (local30 = this.aClass74_24.method1793(); local30 != null; local30 = this.aClass74_24.method1798()) {
					local36 = (int) local30.aLong232;
					if (this.aByteArray49[local36] == 0) {
						this.method3144(local36, 1);
					}
					if (this.aByteArray49[local36] == 0) {
						local25 = false;
					} else {
						local30.method5648();
					}
				}
				while (this.aClass135_1.anIntArray525.length > this.anInt3423) {
					if (this.aClass135_1.anIntArray525[this.anInt3423] == 0) {
						this.anInt3423++;
					} else {
						if (this.aClass167_1.anInt4914 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray49[this.anInt3423] == 0) {
							this.method3144(this.anInt3423, 1);
						}
						if (this.aByteArray49[this.anInt3423] == 0) {
							local126 = new Class7();
							local126.aLong232 = this.anInt3423;
							this.aClass74_24.method1802(local126);
							local25 = false;
						}
						this.anInt3423++;
					}
				}
				if (local25) {
					this.aBoolean250 = false;
					this.anInt3423 = 0;
				}
			} else if (this.aBoolean251) {
				local25 = true;
				for (local30 = this.aClass74_24.method1793(); local30 != null; local30 = this.aClass74_24.method1798()) {
					local36 = (int) local30.aLong232;
					if (this.aByteArray49[local36] != 1) {
						this.method3144(local36, 2);
					}
					if (this.aByteArray49[local36] == 1) {
						local30.method5648();
					} else {
						local25 = false;
					}
				}
				while (this.anInt3423 < this.aClass135_1.anIntArray525.length) {
					if (this.aClass135_1.anIntArray525[this.anInt3423] == 0) {
						this.anInt3423++;
					} else {
						if (this.aClass160_1.method4119()) {
							local25 = false;
							break;
						}
						if (this.aByteArray49[this.anInt3423] != 1) {
							this.method3144(this.anInt3423, 2);
						}
						if (this.aByteArray49[this.anInt3423] != 1) {
							local126 = new Class7();
							local126.aLong232 = this.anInt3423;
							local25 = false;
							this.aClass74_24.method1802(local126);
						}
						this.anInt3423++;
					}
				}
				if (local25) {
					this.aBoolean251 = false;
					this.anInt3423 = 0;
				}
			} else {
				this.aClass74_24 = null;
			}
		}
		if (!this.aBoolean252 || Static335.method5308() < this.aLong119) {
			return;
		}
		for (@Pc(329) Class7_Sub1_Sub8 local329 = (Class7_Sub1_Sub8) this.aClass10_31.method157(); local329 != null; local329 = (Class7_Sub1_Sub8) this.aClass10_31.method155()) {
			if (!local329.aBoolean447) {
				if (local329.aBoolean446) {
					if (!local329.aBoolean445) {
						throw new RuntimeException();
					}
					local329.method5648();
				} else {
					local329.aBoolean446 = true;
				}
			}
		}
		this.aLong119 = Static335.method5308() + 1000L;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method3140(@OriginalArg(0) int arg0) {
		@Pc(9) Class7_Sub1_Sub8 local9 = this.method3144(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5172();
			local9.method5648();
			return local17;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!lr;")
	@Override
	public Class135 method3138() {
		if (this.aClass135_1 != null) {
			return this.aClass135_1;
		}
		if (this.aClass7_Sub1_Sub8_1 == null) {
			if (this.aClass160_1.method4109()) {
				return null;
			}
			this.aClass7_Sub1_Sub8_1 = this.aClass160_1.method4110((byte) 0, true, this.anInt3417, 255);
		}
		if (this.aClass7_Sub1_Sub8_1.aBoolean447) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass7_Sub1_Sub8_1.method5172();
		if (this.aClass7_Sub1_Sub8_1 instanceof Class7_Sub1_Sub8_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass135_1 = new Class135(local43, this.anInt3411);
				if (this.aClass135_1.anInt3836 != this.anInt3422) {
					throw new RuntimeException();
				}
			} catch (@Pc(82) RuntimeException local82) {
				this.aClass135_1 = null;
				if (this.aClass160_1.method4109()) {
					this.aClass7_Sub1_Sub8_1 = null;
				} else {
					this.aClass7_Sub1_Sub8_1 = this.aClass160_1.method4110((byte) 0, true, this.anInt3417, 255);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass135_1 = new Class135(local43, this.anInt3411);
			} catch (@Pc(124) RuntimeException local124) {
				this.aClass160_1.method4106();
				this.aClass135_1 = null;
				if (this.aClass160_1.method4109()) {
					this.aClass7_Sub1_Sub8_1 = null;
				} else {
					this.aClass7_Sub1_Sub8_1 = this.aClass160_1.method4110((byte) 0, true, this.anInt3417, 255);
				}
				return null;
			}
			if (this.aClass13_3 != null) {
				this.aClass167_1.method4279(this.anInt3417, this.aClass13_3, local43);
			}
		}
		if (this.aClass13_2 != null) {
			this.aByteArray49 = new byte[this.aClass135_1.anInt3837];
			this.anInt3420 = 0;
		}
		this.aClass7_Sub1_Sub8_1 = null;
		return this.aClass135_1;
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)I")
	public int method3153() {
		return this.aClass135_1 == null ? 0 : this.aClass135_1.anInt3835;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0) {
		if (this.aClass13_2 == null) {
			return;
		}
		for (@Pc(18) Class7 local18 = this.aClass74_25.method1793(); local18 != null; local18 = this.aClass74_25.method1798()) {
			if ((long) arg0 == local18.aLong232) {
				return;
			}
		}
		@Pc(42) Class7 local42 = new Class7();
		local42.aLong232 = arg0;
		this.aClass74_25.method1802(local42);
	}
}
