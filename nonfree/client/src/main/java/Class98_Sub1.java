import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class98_Sub1 extends Class98 {

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[B")
	private byte[] aByteArray144;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!it;")
	private Class151 aClass151_1;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "Z")
	private boolean aBoolean386;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	private int anInt5693 = 0;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Lclient!sba;")
	private final Class297 aClass297_24 = new Class297(16);

	@OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
	private int anInt5706 = 0;

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "Lclient!or;")
	private final Class244 aClass244_45 = new Class244();

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "J")
	private long aLong156 = 0L;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	private final int anInt5692;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!mu;")
	private final Class215 aClass215_8;

	@OriginalMember(owner = "client!lh", name = "L", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "Lclient!or;")
	private Class244 aClass244_46;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	private final int anInt5703;

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "[B")
	private final byte[] aByteArray145;

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "Lclient!rs;")
	private final Class291 aClass291_1;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Lclient!mu;")
	private final Class215 aClass215_9;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "Lclient!gq;")
	private final Class117 aClass117_2;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	private final int anInt5688;

	@OriginalMember(owner = "client!lh", name = "N", descriptor = "Z")
	private final boolean aBoolean388;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!dm;")
	private Class3_Sub7_Sub5 aClass3_Sub7_Sub5_1;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILclient!mu;Lclient!mu;Lclient!gq;Lclient!rs;I[BIZ)V")
	public Class98_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class215 arg1, @OriginalArg(2) Class215 arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) Class291 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt5692 = arg0;
		this.aClass215_8 = arg1;
		if (this.aClass215_8 == null) {
			this.aBoolean387 = false;
		} else {
			this.aBoolean387 = true;
			this.aClass244_46 = new Class244();
		}
		this.anInt5703 = arg7;
		this.aByteArray145 = arg6;
		this.aClass291_1 = arg4;
		this.aClass215_9 = arg2;
		this.aClass117_2 = arg3;
		this.anInt5688 = arg5;
		this.aBoolean388 = arg8;
		if (this.aClass215_9 != null) {
			this.aClass3_Sub7_Sub5_1 = this.aClass291_1.method6419(this.aClass215_9, this.anInt5692);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4611(@OriginalArg(1) int arg0) {
		if (this.aClass215_8 == null) {
			return;
		}
		for (@Pc(18) Class3 local18 = this.aClass244_45.method5572(); local18 != null; local18 = this.aClass244_45.method5576()) {
			if ((long) arg0 == local18.aLong262) {
				return;
			}
		}
		@Pc(42) Class3 local42 = new Class3();
		local42.aLong262 = arg0;
		this.aClass244_45.method5570(local42);
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public void method4618() {
		if (this.aClass215_8 != null) {
			this.aBoolean386 = true;
			if (this.aClass244_46 == null) {
				this.aClass244_46 = new Class244();
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
	public void method4620() {
		if (this.aClass244_46 == null || this.method4613() == null) {
			return;
		}
		for (@Pc(25) Class3 local25 = this.aClass244_45.method5572(); local25 != null; local25 = this.aClass244_45.method5576()) {
			@Pc(31) int local31 = (int) local25.aLong262;
			if (local31 < 0 || local31 >= this.aClass151_1.anInt4713 || this.aClass151_1.anIntArray218[local31] == 0) {
				local25.method8128();
			} else {
				if (this.aByteArray144[local31] == 0) {
					this.method4626(1, local31);
				}
				if (this.aByteArray144[local31] == -1) {
					this.method4626(2, local31);
				}
				if (this.aByteArray144[local31] == 1) {
					local25.method8128();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)I")
	public int method4621() {
		if (this.aClass151_1 == null) {
			return 0;
		} else if (this.aBoolean387) {
			@Pc(26) Class3 local26 = this.aClass244_46.method5572();
			return local26 == null ? 0 : (int) local26.aLong262;
		} else {
			return this.aClass151_1.anInt4716;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(ZI)[B")
	@Override
	public byte[] method4617(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub7_Sub5 local9 = this.method4626(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local9.method7579();
			local9.method8128();
			return local24;
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
	public void method4623() {
		if (this.aClass244_46 != null) {
			if (this.method4613() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class3 local23;
			@Pc(29) int local29;
			@Pc(110) Class3 local110;
			if (this.aBoolean387) {
				local18 = true;
				for (local23 = this.aClass244_46.method5572(); local23 != null; local23 = this.aClass244_46.method5576()) {
					local29 = (int) local23.aLong262;
					if (this.aByteArray144[local29] == 0) {
						this.method4626(1, local29);
					}
					if (this.aByteArray144[local29] == 0) {
						local18 = false;
					} else {
						local23.method8128();
					}
				}
				while (this.aClass151_1.anIntArray218.length > this.anInt5706) {
					if (this.aClass151_1.anIntArray218[this.anInt5706] == 0) {
						this.anInt5706++;
					} else {
						if (this.aClass291_1.anInt8181 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray144[this.anInt5706] == 0) {
							this.method4626(1, this.anInt5706);
						}
						if (this.aByteArray144[this.anInt5706] == 0) {
							local110 = new Class3();
							local110.aLong262 = this.anInt5706;
							this.aClass244_46.method5570(local110);
							local18 = false;
						}
						this.anInt5706++;
					}
				}
				if (local18) {
					this.anInt5706 = 0;
					this.aBoolean387 = false;
				}
			} else if (this.aBoolean386) {
				local18 = true;
				for (local23 = this.aClass244_46.method5572(); local23 != null; local23 = this.aClass244_46.method5576()) {
					local29 = (int) local23.aLong262;
					if (this.aByteArray144[local29] != 1) {
						this.method4626(2, local29);
					}
					if (this.aByteArray144[local29] == 1) {
						local23.method8128();
					} else {
						local18 = false;
					}
				}
				while (this.anInt5706 < this.aClass151_1.anIntArray218.length) {
					if (this.aClass151_1.anIntArray218[this.anInt5706] == 0) {
						this.anInt5706++;
					} else {
						if (this.aClass117_2.method3168()) {
							local18 = false;
							break;
						}
						if (this.aByteArray144[this.anInt5706] != 1) {
							this.method4626(2, this.anInt5706);
						}
						if (this.aByteArray144[this.anInt5706] != 1) {
							local110 = new Class3();
							local110.aLong262 = this.anInt5706;
							local18 = false;
							this.aClass244_46.method5570(local110);
						}
						this.anInt5706++;
					}
				}
				if (local18) {
					this.anInt5706 = 0;
					this.aBoolean386 = false;
				}
			} else {
				this.aClass244_46 = null;
			}
		}
		if (!this.aBoolean388 || this.aLong156 > Static96.method2000()) {
			return;
		}
		for (@Pc(318) Class3_Sub7_Sub5 local318 = (Class3_Sub7_Sub5) this.aClass297_24.method6529(); local318 != null; local318 = (Class3_Sub7_Sub5) this.aClass297_24.method6532()) {
			if (!local318.aBoolean636) {
				if (local318.aBoolean635) {
					if (!local318.aBoolean638) {
						throw new RuntimeException();
					}
					local318.method8128();
				} else {
					local318.aBoolean635 = true;
				}
			}
		}
		this.aLong156 = Static96.method2000() + 1000L;
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)I")
	public int method4624() {
		return this.anInt5693;
	}

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)I")
	public int method4625() {
		if (this.method4613() == null) {
			return this.aClass3_Sub7_Sub5_1 == null ? 0 : this.aClass3_Sub7_Sub5_1.method7580();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lclient!dm;")
	private Class3_Sub7_Sub5 method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub7_Sub5 local13 = (Class3_Sub7_Sub5) this.aClass297_24.method6531((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean638 && local13.aBoolean636) {
			local13.method8128();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass215_8 == null || this.aByteArray144[arg1] == -1) {
					if (this.aClass117_2.method3170()) {
						return null;
					}
					local13 = this.aClass117_2.method3176(this.anInt5692, true, (byte) 2, arg1);
				} else {
					local13 = this.aClass291_1.method6419(this.aClass215_8, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass215_8 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass291_1.method6418(arg1, this.aClass215_8);
			} else if (arg0 == 2) {
				if (this.aClass215_8 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray144[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass117_2.method3168()) {
					return null;
				}
				local13 = this.aClass117_2.method3176(this.anInt5692, false, (byte) 2, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass297_24.method6537((long) arg1, local13);
		}
		if (local13.aBoolean636) {
			return null;
		}
		@Pc(165) byte[] local165 = local13.method7579();
		@Pc(192) int local192;
		@Pc(219) byte[] local219;
		@Pc(228) byte[] local228;
		@Pc(230) int local230;
		@Pc(290) Class3_Sub7_Sub5_Sub1 local290;
		if (!(local13 instanceof Class3_Sub7_Sub5_Sub2)) {
			try {
				if (local165 == null || local165.length <= 2) {
					throw new RuntimeException();
				}
				Static75.aCRC32_1.reset();
				Static75.aCRC32_1.update(local165, 0, local165.length - 2);
				local192 = (int) Static75.aCRC32_1.getValue();
				if (this.aClass151_1.anIntArray221[arg1] != local192) {
					throw new RuntimeException();
				}
				if (this.aClass151_1.aByteArrayArray24 != null && this.aClass151_1.aByteArrayArray24[arg1] != null) {
					local219 = this.aClass151_1.aByteArrayArray24[arg1];
					local228 = Static345.method5013(local165, local165.length - 2, 0);
					for (local230 = 0; local230 < 64; local230++) {
						if (local219[local230] != local228[local230]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass117_2.anInt3916 = 0;
				this.aClass117_2.anInt3917 = 0;
			} catch (@Pc(263) RuntimeException local263) {
				this.aClass117_2.method3171();
				local13.method8128();
				if (local13.aBoolean638 && !this.aClass117_2.method3170()) {
					local290 = this.aClass117_2.method3176(this.anInt5692, true, (byte) 2, arg1);
					this.aClass297_24.method6537((long) arg1, local290);
				}
				return null;
			}
			local165[local165.length - 2] = (byte) (this.aClass151_1.anIntArray223[arg1] >>> 8);
			local165[local165.length - 1] = (byte) this.aClass151_1.anIntArray223[arg1];
			if (this.aClass215_8 != null) {
				this.aClass291_1.method6422(local165, arg1, this.aClass215_8);
				if (this.aByteArray144[arg1] != 1) {
					this.anInt5693++;
					this.aByteArray144[arg1] = 1;
				}
			}
			if (!local13.aBoolean638) {
				local13.method8128();
			}
			return local13;
		}
		try {
			if (local165 == null || local165.length <= 2) {
				throw new RuntimeException();
			}
			Static75.aCRC32_1.reset();
			Static75.aCRC32_1.update(local165, 0, local165.length - 2);
			local192 = (int) Static75.aCRC32_1.getValue();
			if (local192 != this.aClass151_1.anIntArray221[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass151_1.aByteArrayArray24 != null && this.aClass151_1.aByteArrayArray24[arg1] != null) {
				local219 = this.aClass151_1.aByteArrayArray24[arg1];
				local228 = Static345.method5013(local165, local165.length - 2, 0);
				for (local230 = 0; local230 < 64; local230++) {
					if (local228[local230] != local219[local230]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(465) int local465 = ((local165[local165.length - 2] & 0xFF) << 8) + (local165[local165.length - 1] & 0xFF);
			if ((this.aClass151_1.anIntArray223[arg1] & 0xFFFF) != local465) {
				throw new RuntimeException();
			}
			if (this.aByteArray144[arg1] != 1) {
				this.anInt5693++;
				this.aByteArray144[arg1] = 1;
			}
			if (!local13.aBoolean638) {
				local13.method8128();
			}
			return local13;
		} catch (@Pc(506) Exception local506) {
			this.aByteArray144[arg1] = -1;
			local13.method8128();
			if (local13.aBoolean638 && !this.aClass117_2.method3170()) {
				local290 = this.aClass117_2.method3176(this.anInt5692, true, (byte) 2, arg1);
				this.aClass297_24.method6537((long) arg1, local290);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I")
	public int method4628() {
		return this.aClass151_1 == null ? 0 : this.aClass151_1.anInt4716;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
	@Override
	public int method4610(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub7_Sub5 local11 = (Class3_Sub7_Sub5) this.aClass297_24.method6531((long) arg0);
		return local11 == null ? 0 : local11.method7580();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lclient!it;")
	@Override
	public Class151 method4613() {
		if (this.aClass151_1 != null) {
			return this.aClass151_1;
		}
		if (this.aClass3_Sub7_Sub5_1 == null) {
			if (this.aClass117_2.method3170()) {
				return null;
			}
			this.aClass3_Sub7_Sub5_1 = this.aClass117_2.method3176(255, true, (byte) 0, this.anInt5692);
		}
		if (this.aClass3_Sub7_Sub5_1.aBoolean636) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass3_Sub7_Sub5_1.method7579();
		if (this.aClass3_Sub7_Sub5_1 instanceof Class3_Sub7_Sub5_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass151_1 = new Class151(local43, this.anInt5688, this.aByteArray145);
				if (this.aClass151_1.anInt4714 != this.anInt5703) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass151_1 = null;
				if (this.aClass117_2.method3170()) {
					this.aClass3_Sub7_Sub5_1 = null;
				} else {
					this.aClass3_Sub7_Sub5_1 = this.aClass117_2.method3176(255, true, (byte) 0, this.anInt5692);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass151_1 = new Class151(local43, this.anInt5688, this.aByteArray145);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass117_2.method3171();
				this.aClass151_1 = null;
				if (this.aClass117_2.method3170()) {
					this.aClass3_Sub7_Sub5_1 = null;
				} else {
					this.aClass3_Sub7_Sub5_1 = this.aClass117_2.method3176(255, true, (byte) 0, this.anInt5692);
				}
				return null;
			}
			if (this.aClass215_9 != null) {
				this.aClass291_1.method6422(local43, this.anInt5692, this.aClass215_9);
			}
		}
		this.aClass3_Sub7_Sub5_1 = null;
		if (this.aClass215_8 != null) {
			this.aByteArray144 = new byte[this.aClass151_1.anInt4713];
			this.anInt5693 = 0;
		}
		return this.aClass151_1;
	}
}
