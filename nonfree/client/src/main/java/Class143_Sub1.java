import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "Lclient!rt;")
	private Class209 aClass209_2;

	@OriginalMember(owner = "client!lv", name = "F", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
	private int anInt4482 = 0;

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "Lclient!ib;")
	private final Class102 aClass102_20 = new Class102(16);

	@OriginalMember(owner = "client!lv", name = "J", descriptor = "I")
	private int anInt4489 = 0;

	@OriginalMember(owner = "client!lv", name = "G", descriptor = "Lclient!pk;")
	private final Class183 aClass183_30 = new Class183();

	@OriginalMember(owner = "client!lv", name = "L", descriptor = "J")
	private long aLong149 = 0L;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "Lclient!st;")
	private final Class222 aClass222_3;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	private final int anInt4474;

	@OriginalMember(owner = "client!lv", name = "D", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!lv", name = "H", descriptor = "Lclient!pk;")
	private Class183 aClass183_31;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	private final int anInt4473;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	private final int anInt4475;

	@OriginalMember(owner = "client!lv", name = "K", descriptor = "Z")
	private final boolean aBoolean414;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "Lclient!st;")
	private final Class222 aClass222_4;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "Lclient!vn;")
	private final Class255 aClass255_1;

	@OriginalMember(owner = "client!lv", name = "B", descriptor = "Lclient!vl;")
	private final Class254 aClass254_1;

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "Lclient!ec;")
	private Class4_Sub1_Sub6 aClass4_Sub1_Sub6_1;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(ILclient!st;Lclient!st;Lclient!vn;Lclient!vl;IIZ)V")
	public Class143_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class222 arg2, @OriginalArg(3) Class255 arg3, @OriginalArg(4) Class254 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass222_3 = arg1;
		this.anInt4474 = arg0;
		if (this.aClass222_3 == null) {
			this.aBoolean412 = false;
		} else {
			this.aBoolean412 = true;
			this.aClass183_31 = new Class183();
		}
		this.anInt4473 = arg5;
		this.anInt4475 = arg6;
		this.aBoolean414 = arg7;
		this.aClass222_4 = arg2;
		this.aClass255_1 = arg3;
		this.aClass254_1 = arg4;
		if (this.aClass222_4 != null) {
			this.aClass4_Sub1_Sub6_1 = this.aClass254_1.method5432(this.aClass222_4, this.anInt4474);
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)I")
	public int method3517() {
		return this.aClass209_2 == null ? 0 : this.aClass209_2.anInt6109;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Lclient!ec;")
	private Class4_Sub1_Sub6 method3518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub6 local13 = (Class4_Sub1_Sub6) this.aClass102_20.method2700((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean384 && local13.aBoolean381) {
			local13.method5684();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass222_3 == null || this.aByteArray56[arg1] == -1) {
					if (this.aClass255_1.method5460()) {
						return null;
					}
					local13 = this.aClass255_1.method5465(this.anInt4474, (byte) 2, true, arg1);
				} else {
					local13 = this.aClass254_1.method5432(this.aClass222_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass222_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass254_1.method5431(this.aClass222_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass222_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray56[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass255_1.method5472()) {
					return null;
				}
				local13 = this.aClass255_1.method5465(this.anInt4474, (byte) 2, false, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass102_20.method2703((long) arg1, local13);
		}
		if (local13.aBoolean381) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.method3343();
		@Pc(188) int local188;
		@Pc(238) Class4_Sub1_Sub6_Sub1 local238;
		if (!(local13 instanceof Class4_Sub1_Sub6_Sub2)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				Static327.aCRC32_1.reset();
				Static327.aCRC32_1.update(local161, 0, local161.length - 2);
				local188 = (int) Static327.aCRC32_1.getValue();
				if (local188 != this.aClass209_2.anIntArray430[arg1]) {
					throw new RuntimeException();
				}
				this.aClass255_1.anInt7062 = 0;
				this.aClass255_1.anInt7063 = 0;
			} catch (@Pc(213) RuntimeException local213) {
				this.aClass255_1.method5464();
				local13.method5684();
				if (local13.aBoolean384 && !this.aClass255_1.method5460()) {
					local238 = this.aClass255_1.method5465(this.anInt4474, (byte) 2, true, arg1);
					this.aClass102_20.method2703((long) arg1, local238);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass209_2.anIntArray429[arg1] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass209_2.anIntArray429[arg1];
			if (this.aClass222_3 != null) {
				this.aClass254_1.method5435(arg1, local161, this.aClass222_3);
				if (this.aByteArray56[arg1] != 1) {
					this.anInt4482++;
					this.aByteArray56[arg1] = 1;
				}
			}
			if (!local13.aBoolean384) {
				local13.method5684();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static327.aCRC32_1.reset();
			Static327.aCRC32_1.update(local161, 0, local161.length - 2);
			local188 = (int) Static327.aCRC32_1.getValue();
			if (this.aClass209_2.anIntArray430[arg1] != local188) {
				throw new RuntimeException();
			}
			@Pc(371) int local371 = ((local161[local161.length - 2] & 0xFF) << 8) + (local161[local161.length - 1] & 0xFF);
			if (local371 != (this.aClass209_2.anIntArray429[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray56[arg1] != 1) {
				this.anInt4482++;
				this.aByteArray56[arg1] = 1;
			}
			if (!local13.aBoolean384) {
				local13.method5684();
			}
			return local13;
		} catch (@Pc(412) Exception local412) {
			this.aByteArray56[arg1] = -1;
			local13.method5684();
			if (local13.aBoolean384 && !this.aClass255_1.method5460()) {
				local238 = this.aClass255_1.method5465(this.anInt4474, (byte) 2, true, arg1);
				this.aClass102_20.method2703((long) arg1, local238);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3516(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub1_Sub6 local16 = this.method3518(0, arg0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method3343();
			local16.method5684();
			return local24;
		}
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)V")
	public void method3520() {
		if (this.aClass183_31 != null) {
			if (this.method3514() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(28) Class4 local28;
			@Pc(34) int local34;
			@Pc(127) Class4 local127;
			if (this.aBoolean412) {
				local21 = true;
				for (local28 = this.aClass183_31.method4140(); local28 != null; local28 = this.aClass183_31.method4144()) {
					local34 = (int) local28.aLong224;
					if (this.aByteArray56[local34] == 0) {
						this.method3518(1, local34);
					}
					if (this.aByteArray56[local34] == 0) {
						local21 = false;
					} else {
						local28.method5684();
					}
				}
				while (this.anInt4489 < this.aClass209_2.anIntArray428.length) {
					if (this.aClass209_2.anIntArray428[this.anInt4489] == 0) {
						this.anInt4489++;
					} else {
						if (this.aClass254_1.anInt7015 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray56[this.anInt4489] == 0) {
							this.method3518(1, this.anInt4489);
						}
						if (this.aByteArray56[this.anInt4489] == 0) {
							local127 = new Class4();
							local127.aLong224 = this.anInt4489;
							local21 = false;
							this.aClass183_31.method4137(local127);
						}
						this.anInt4489++;
					}
				}
				if (local21) {
					this.anInt4489 = 0;
					this.aBoolean412 = false;
				}
			} else if (this.aBoolean413) {
				local21 = true;
				for (local28 = this.aClass183_31.method4140(); local28 != null; local28 = this.aClass183_31.method4144()) {
					local34 = (int) local28.aLong224;
					if (this.aByteArray56[local34] != 1) {
						this.method3518(2, local34);
					}
					if (this.aByteArray56[local34] == 1) {
						local28.method5684();
					} else {
						local21 = false;
					}
				}
				while (this.anInt4489 < this.aClass209_2.anIntArray428.length) {
					if (this.aClass209_2.anIntArray428[this.anInt4489] == 0) {
						this.anInt4489++;
					} else {
						if (this.aClass255_1.method5472()) {
							local21 = false;
							break;
						}
						if (this.aByteArray56[this.anInt4489] != 1) {
							this.method3518(2, this.anInt4489);
						}
						if (this.aByteArray56[this.anInt4489] != 1) {
							local127 = new Class4();
							local127.aLong224 = this.anInt4489;
							local21 = false;
							this.aClass183_31.method4137(local127);
						}
						this.anInt4489++;
					}
				}
				if (local21) {
					this.anInt4489 = 0;
					this.aBoolean413 = false;
				}
			} else {
				this.aClass183_31 = null;
			}
		}
		if (!this.aBoolean414 || this.aLong149 > Static282.method3962()) {
			return;
		}
		for (@Pc(325) Class4_Sub1_Sub6 local325 = (Class4_Sub1_Sub6) this.aClass102_20.method2705(); local325 != null; local325 = (Class4_Sub1_Sub6) this.aClass102_20.method2704()) {
			if (!local325.aBoolean381) {
				if (local325.aBoolean382) {
					if (!local325.aBoolean384) {
						throw new RuntimeException();
					}
					local325.method5684();
				} else {
					local325.aBoolean382 = true;
				}
			}
		}
		this.aLong149 = Static282.method3962() + 1000L;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)I")
	public int method3521() {
		if (this.aClass209_2 == null) {
			return 0;
		} else if (this.aBoolean412) {
			@Pc(25) Class4 local25 = this.aClass183_31.method4140();
			return local25 == null ? 0 : (int) local25.aLong224;
		} else {
			return this.aClass209_2.anInt6109;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IB)I")
	@Override
	public int method3515(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub1_Sub6 local11 = (Class4_Sub1_Sub6) this.aClass102_20.method2700((long) arg0);
		return local11 == null ? 0 : local11.method3342();
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(B)V")
	public void method3522() {
		if (this.aClass183_31 == null || this.method3514() == null) {
			return;
		}
		for (@Pc(23) Class4 local23 = this.aClass183_30.method4140(); local23 != null; local23 = this.aClass183_30.method4144()) {
			@Pc(29) int local29 = (int) local23.aLong224;
			if (local29 < 0 || local29 >= this.aClass209_2.anInt6112 || this.aClass209_2.anIntArray428[local29] == 0) {
				local23.method5684();
			} else {
				if (this.aByteArray56[local29] == 0) {
					this.method3518(1, local29);
				}
				if (this.aByteArray56[local29] == -1) {
					this.method3518(2, local29);
				}
				if (this.aByteArray56[local29] == 1) {
					local23.method5684();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "(I)I")
	public int method3525() {
		if (this.method3514() == null) {
			return this.aClass4_Sub1_Sub6_1 == null ? 0 : this.aClass4_Sub1_Sub6_1.method3342();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V")
	@Override
	public void method3512(@OriginalArg(0) int arg0) {
		if (this.aClass222_3 == null) {
			return;
		}
		for (@Pc(14) Class4 local14 = this.aClass183_30.method4140(); local14 != null; local14 = this.aClass183_30.method4144()) {
			if (local14.aLong224 == (long) arg0) {
				return;
			}
		}
		@Pc(43) Class4 local43 = new Class4();
		local43.aLong224 = arg0;
		this.aClass183_30.method4137(local43);
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(B)V")
	public void method3526() {
		if (this.aClass222_3 != null) {
			this.aBoolean413 = true;
			if (this.aClass183_31 == null) {
				this.aClass183_31 = new Class183();
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)I")
	public int method3527() {
		return this.anInt4482;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Lclient!rt;")
	@Override
	public Class209 method3514() {
		if (this.aClass209_2 != null) {
			return this.aClass209_2;
		}
		if (this.aClass4_Sub1_Sub6_1 == null) {
			if (this.aClass255_1.method5460()) {
				return null;
			}
			this.aClass4_Sub1_Sub6_1 = this.aClass255_1.method5465(255, (byte) 0, true, this.anInt4474);
		}
		if (this.aClass4_Sub1_Sub6_1.aBoolean381) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass4_Sub1_Sub6_1.method3343();
		if (this.aClass4_Sub1_Sub6_1 instanceof Class4_Sub1_Sub6_Sub2) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass209_2 = new Class209(local43, this.anInt4473);
				if (this.aClass209_2.anInt6113 != this.anInt4475) {
					throw new RuntimeException();
				}
			} catch (@Pc(133) RuntimeException local133) {
				this.aClass209_2 = null;
				if (this.aClass255_1.method5460()) {
					this.aClass4_Sub1_Sub6_1 = null;
				} else {
					this.aClass4_Sub1_Sub6_1 = this.aClass255_1.method5465(255, (byte) 0, true, this.anInt4474);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass209_2 = new Class209(local43, this.anInt4473);
			} catch (@Pc(63) RuntimeException local63) {
				this.aClass255_1.method5464();
				this.aClass209_2 = null;
				if (this.aClass255_1.method5460()) {
					this.aClass4_Sub1_Sub6_1 = null;
				} else {
					this.aClass4_Sub1_Sub6_1 = this.aClass255_1.method5465(255, (byte) 0, true, this.anInt4474);
				}
				return null;
			}
			if (this.aClass222_4 != null) {
				this.aClass254_1.method5435(this.anInt4474, local43, this.aClass222_4);
			}
		}
		this.aClass4_Sub1_Sub6_1 = null;
		if (this.aClass222_3 != null) {
			this.aByteArray56 = new byte[this.aClass209_2.anInt6112];
			this.anInt4482 = 0;
		}
		return this.aClass209_2;
	}
}
