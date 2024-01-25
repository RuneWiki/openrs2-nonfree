import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!er;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "Z")
	private boolean aBoolean491;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	private int anInt5471 = 0;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!va;")
	private final Class199 aClass199_24 = new Class199(16);

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	private int anInt5481 = 0;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!wq;")
	private final Class216 aClass216_42 = new Class216();

	@OriginalMember(owner = "client!re", name = "T", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "I")
	private final int anInt5480;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "Lclient!gb;")
	private final Class71 aClass71_4;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "Lclient!wq;")
	private Class216 aClass216_41;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	private final int anInt5476;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!gb;")
	private final Class71 aClass71_3;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Lclient!qs;")
	private final Class165 aClass165_3;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	private final int anInt5461;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!nh;")
	private final Class136 aClass136_3;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
	private final boolean aBoolean493;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!ia;")
	private Class2_Sub11_Sub4 aClass2_Sub11_Sub4_1;

	static {
		new Class93("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILclient!gb;Lclient!gb;Lclient!qs;Lclient!nh;IIZ)V")
	public Class121_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) Class136 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5480 = arg0;
		this.aClass71_4 = arg1;
		if (this.aClass71_4 == null) {
			this.aBoolean492 = false;
		} else {
			this.aBoolean492 = true;
			this.aClass216_41 = new Class216();
		}
		this.anInt5476 = arg5;
		this.aClass71_3 = arg2;
		this.aClass165_3 = arg3;
		this.anInt5461 = arg6;
		this.aClass136_3 = arg4;
		this.aBoolean493 = arg7;
		if (this.aClass71_3 != null) {
			this.aClass2_Sub11_Sub4_1 = this.aClass136_3.method3783(this.anInt5480, this.aClass71_3);
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public int method4863() {
		if (this.aClass58_1 == null) {
			return 0;
		} else if (this.aBoolean492) {
			@Pc(25) Class2 local25 = this.aClass216_41.method5992();
			return local25 == null ? 0 : (int) local25.aLong213;
		} else {
			return this.aClass58_1.anInt1736;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	public int method4866() {
		return this.anInt5471;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I")
	public int method4867() {
		if (this.method4858() == null) {
			return this.aClass2_Sub11_Sub4_1 == null ? 0 : this.aClass2_Sub11_Sub4_1.method4518();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lclient!er;")
	@Override
	public Class58 method4858() {
		if (this.aClass58_1 != null) {
			return this.aClass58_1;
		}
		if (this.aClass2_Sub11_Sub4_1 == null) {
			if (this.aClass165_3.method4810()) {
				return null;
			}
			this.aClass2_Sub11_Sub4_1 = this.aClass165_3.method4809(255, (byte) 0, true, this.anInt5480);
		}
		if (this.aClass2_Sub11_Sub4_1.aBoolean446) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass2_Sub11_Sub4_1.method4520();
		if (this.aClass2_Sub11_Sub4_1 instanceof Class2_Sub11_Sub4_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass58_1 = new Class58(local48, this.anInt5476);
				if (this.anInt5461 != this.aClass58_1.anInt1743) {
					throw new RuntimeException();
				}
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass58_1 = null;
				if (this.aClass165_3.method4810()) {
					this.aClass2_Sub11_Sub4_1 = null;
				} else {
					this.aClass2_Sub11_Sub4_1 = this.aClass165_3.method4809(255, (byte) 0, true, this.anInt5480);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass58_1 = new Class58(local48, this.anInt5476);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass165_3.method4811();
				this.aClass58_1 = null;
				if (this.aClass165_3.method4810()) {
					this.aClass2_Sub11_Sub4_1 = null;
				} else {
					this.aClass2_Sub11_Sub4_1 = this.aClass165_3.method4809(255, (byte) 0, true, this.anInt5480);
				}
				return null;
			}
			if (this.aClass71_3 != null) {
				this.aClass136_3.method3780(local48, this.anInt5480, this.aClass71_3);
			}
		}
		if (this.aClass71_4 != null) {
			this.anInt5471 = 0;
			this.aByteArray61 = new byte[this.aClass58_1.anInt1738];
		}
		this.aClass2_Sub11_Sub4_1 = null;
		return this.aClass58_1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)Lclient!ia;")
	private Class2_Sub11_Sub4 method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class2_Sub11_Sub4 local13 = (Class2_Sub11_Sub4) this.aClass199_24.method5751((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean448 && local13.aBoolean446) {
			local13.method5945();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass71_4 == null || this.aByteArray61[arg0] == -1) {
					if (this.aClass165_3.method4810()) {
						return null;
					}
					local13 = this.aClass165_3.method4809(this.anInt5480, (byte) 2, true, arg0);
				} else {
					local13 = this.aClass136_3.method3783(arg0, this.aClass71_4);
				}
			} else if (arg1 == 1) {
				if (this.aClass71_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass136_3.method3782(this.aClass71_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass71_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray61[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass165_3.method4798()) {
					return null;
				}
				local13 = this.aClass165_3.method4809(this.anInt5480, (byte) 2, false, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass199_24.method5749(local13, (long) arg0);
		}
		if (local13.aBoolean446) {
			return null;
		}
		@Pc(166) byte[] local166 = local13.method4520();
		@Pc(193) int local193;
		@Pc(245) Class2_Sub11_Sub4_Sub2 local245;
		if (!(local13 instanceof Class2_Sub11_Sub4_Sub1)) {
			try {
				if (local166 == null || local166.length <= 2) {
					throw new RuntimeException();
				}
				Static141.aCRC32_1.reset();
				Static141.aCRC32_1.update(local166, 0, local166.length - 2);
				local193 = (int) Static141.aCRC32_1.getValue();
				if (this.aClass58_1.anIntArray189[arg0] != local193) {
					throw new RuntimeException();
				}
				this.aClass165_3.anInt5431 = 0;
				this.aClass165_3.anInt5432 = 0;
			} catch (@Pc(218) RuntimeException local218) {
				this.aClass165_3.method4811();
				local13.method5945();
				if (local13.aBoolean448 && !this.aClass165_3.method4810()) {
					local245 = this.aClass165_3.method4809(this.anInt5480, (byte) 2, true, arg0);
					this.aClass199_24.method5749(local245, (long) arg0);
				}
				return null;
			}
			local166[local166.length - 2] = (byte) (this.aClass58_1.anIntArray186[arg0] >>> 8);
			local166[local166.length - 1] = (byte) this.aClass58_1.anIntArray186[arg0];
			if (this.aClass71_4 != null) {
				this.aClass136_3.method3780(local166, arg0, this.aClass71_4);
				if (this.aByteArray61[arg0] != 1) {
					this.anInt5471++;
					this.aByteArray61[arg0] = 1;
				}
			}
			if (!local13.aBoolean448) {
				local13.method5945();
			}
			return local13;
		}
		try {
			if (local166 == null || local166.length <= 2) {
				throw new RuntimeException();
			}
			Static141.aCRC32_1.reset();
			Static141.aCRC32_1.update(local166, 0, local166.length - 2);
			local193 = (int) Static141.aCRC32_1.getValue();
			if (local193 != this.aClass58_1.anIntArray189[arg0]) {
				throw new RuntimeException();
			}
			@Pc(377) int local377 = ((local166[local166.length - 2] & 0xFF) << 8) + (local166[local166.length - 1] & 0xFF);
			if ((this.aClass58_1.anIntArray186[arg0] & 0xFFFF) != local377) {
				throw new RuntimeException();
			}
			if (this.aByteArray61[arg0] != 1) {
				this.anInt5471++;
				this.aByteArray61[arg0] = 1;
			}
			if (!local13.aBoolean448) {
				local13.method5945();
			}
			return local13;
		} catch (@Pc(422) Exception local422) {
			this.aByteArray61[arg0] = -1;
			local13.method5945();
			if (local13.aBoolean448 && !this.aClass165_3.method4810()) {
				local245 = this.aClass165_3.method4809(this.anInt5480, (byte) 2, true, arg0);
				this.aClass199_24.method5749(local245, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	public void method4870() {
		if (this.aClass216_41 != null) {
			if (this.method4858() == null) {
				return;
			}
			@Pc(24) boolean local24;
			@Pc(29) Class2 local29;
			@Pc(35) int local35;
			@Pc(126) Class2 local126;
			if (this.aBoolean492) {
				local24 = true;
				for (local29 = this.aClass216_41.method5992(); local29 != null; local29 = this.aClass216_41.method6000()) {
					local35 = (int) local29.aLong213;
					if (this.aByteArray61[local35] == 0) {
						this.method4869(local35, 1);
					}
					if (this.aByteArray61[local35] == 0) {
						local24 = false;
					} else {
						local29.method5945();
					}
				}
				while (this.aClass58_1.anIntArray188.length > this.anInt5481) {
					if (this.aClass58_1.anIntArray188[this.anInt5481] == 0) {
						this.anInt5481++;
					} else {
						if (this.aClass136_3.anInt4100 >= 250) {
							local24 = false;
							break;
						}
						if (this.aByteArray61[this.anInt5481] == 0) {
							this.method4869(this.anInt5481, 1);
						}
						if (this.aByteArray61[this.anInt5481] == 0) {
							local126 = new Class2();
							local126.aLong213 = this.anInt5481;
							this.aClass216_41.method5995(local126);
							local24 = false;
						}
						this.anInt5481++;
					}
				}
				if (local24) {
					this.aBoolean492 = false;
					this.anInt5481 = 0;
				}
			} else if (this.aBoolean491) {
				local24 = true;
				for (local29 = this.aClass216_41.method5992(); local29 != null; local29 = this.aClass216_41.method6000()) {
					local35 = (int) local29.aLong213;
					if (this.aByteArray61[local35] != 1) {
						this.method4869(local35, 2);
					}
					if (this.aByteArray61[local35] == 1) {
						local29.method5945();
					} else {
						local24 = false;
					}
				}
				while (this.aClass58_1.anIntArray188.length > this.anInt5481) {
					if (this.aClass58_1.anIntArray188[this.anInt5481] == 0) {
						this.anInt5481++;
					} else {
						if (this.aClass165_3.method4798()) {
							local24 = false;
							break;
						}
						if (this.aByteArray61[this.anInt5481] != 1) {
							this.method4869(this.anInt5481, 2);
						}
						if (this.aByteArray61[this.anInt5481] != 1) {
							local126 = new Class2();
							local126.aLong213 = this.anInt5481;
							local24 = false;
							this.aClass216_41.method5995(local126);
						}
						this.anInt5481++;
					}
				}
				if (local24) {
					this.aBoolean491 = false;
					this.anInt5481 = 0;
				}
			} else {
				this.aClass216_41 = null;
			}
		}
		if (!this.aBoolean493 || this.aLong161 > Static51.method1197()) {
			return;
		}
		for (@Pc(324) Class2_Sub11_Sub4 local324 = (Class2_Sub11_Sub4) this.aClass199_24.method5747(); local324 != null; local324 = (Class2_Sub11_Sub4) this.aClass199_24.method5753()) {
			if (!local324.aBoolean446) {
				if (local324.aBoolean447) {
					if (!local324.aBoolean448) {
						throw new RuntimeException();
					}
					local324.method5945();
				} else {
					local324.aBoolean447 = true;
				}
			}
		}
		this.aLong161 = Static51.method1197() + 1000L;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	public void method4871() {
		if (this.aClass71_4 != null) {
			this.aBoolean491 = true;
			if (this.aClass216_41 == null) {
				this.aClass216_41 = new Class216();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	public void method4872() {
		if (this.aClass216_41 == null || this.method4858() == null) {
			return;
		}
		for (@Pc(23) Class2 local23 = this.aClass216_42.method5992(); local23 != null; local23 = this.aClass216_42.method6000()) {
			@Pc(29) int local29 = (int) local23.aLong213;
			if (local29 < 0 || this.aClass58_1.anInt1738 <= local29 || this.aClass58_1.anIntArray188[local29] == 0) {
				local23.method5945();
			} else {
				if (this.aByteArray61[local29] == 0) {
					this.method4869(local29, 1);
				}
				if (this.aByteArray61[local29] == -1) {
					this.method4869(local29, 2);
				}
				if (this.aByteArray61[local29] == 1) {
					local23.method5945();
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
	@Override
	public int method4861(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub11_Sub4 local11 = (Class2_Sub11_Sub4) this.aClass199_24.method5751((long) arg0);
		return local11 == null ? 0 : local11.method4518();
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)V")
	@Override
	public void method4862(@OriginalArg(0) int arg0) {
		if (this.aClass71_4 == null) {
			return;
		}
		for (@Pc(20) Class2 local20 = this.aClass216_42.method5992(); local20 != null; local20 = this.aClass216_42.method6000()) {
			if (local20.aLong213 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class2 local44 = new Class2();
		local44.aLong213 = arg0;
		this.aClass216_42.method5995(local44);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(B)I")
	public int method4876() {
		return this.aClass58_1 == null ? 0 : this.aClass58_1.anInt1736;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)[B")
	@Override
	public byte[] method4857(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub11_Sub4 local15 = this.method4869(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method4520();
			local15.method5945();
			return local23;
		}
	}
}
