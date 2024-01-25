import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!og;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "I")
	private int anInt5702 = 0;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "Lclient!vk;")
	private final Class207 aClass207_34 = new Class207(16);

	@OriginalMember(owner = "client!si", name = "L", descriptor = "I")
	private int anInt5705 = 0;

	@OriginalMember(owner = "client!si", name = "I", descriptor = "Lclient!ar;")
	private final Class14 aClass14_31 = new Class14();

	@OriginalMember(owner = "client!si", name = "O", descriptor = "J")
	private long aLong177 = 0L;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "Lclient!v;")
	private final Class203 aClass203_9;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "I")
	private final int anInt5696;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!si", name = "N", descriptor = "Lclient!ar;")
	private Class14 aClass14_32;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private final int anInt5692;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	private final int anInt5694;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "Lclient!v;")
	private final Class203 aClass203_10;

	@OriginalMember(owner = "client!si", name = "t", descriptor = "Lclient!ro;")
	private final Class178 aClass178_2;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "Lclient!p;")
	private final Class154 aClass154_2;

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Lclient!vd;")
	private Class1_Sub2_Sub10 aClass1_Sub2_Sub10_1;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(ILclient!v;Lclient!v;Lclient!p;Lclient!ro;IIZ)V")
	public Class113_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass203_9 = arg1;
		this.anInt5696 = arg0;
		if (this.aClass203_9 == null) {
			this.aBoolean478 = false;
		} else {
			this.aBoolean478 = true;
			this.aClass14_32 = new Class14();
		}
		this.anInt5692 = arg6;
		this.aBoolean479 = arg7;
		this.anInt5694 = arg5;
		this.aClass203_10 = arg2;
		this.aClass178_2 = arg4;
		this.aClass154_2 = arg3;
		if (this.aClass203_10 != null) {
			this.aClass1_Sub2_Sub10_1 = this.aClass178_2.method4822(this.anInt5696, this.aClass203_10);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I")
	public int method4972() {
		return this.aClass150_2 == null ? 0 : this.aClass150_2.anInt4535;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4971(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub10 local17 = this.method4976(0, arg0);
		if (local17 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local17.method4947();
			local17.method5796();
			return local25;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public int method4973() {
		if (this.method4966() == null) {
			return this.aClass1_Sub2_Sub10_1 == null ? 0 : this.aClass1_Sub2_Sub10_1.method4949();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	public void method4974() {
		if (this.aClass203_9 != null) {
			this.aBoolean477 = true;
			if (this.aClass14_32 == null) {
				this.aClass14_32 = new Class14();
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)I")
	public int method4975() {
		return this.anInt5702;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Lclient!vd;")
	private Class1_Sub2_Sub10 method4976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub10 local13 = (Class1_Sub2_Sub10) this.aClass207_34.method5555((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean470 && local13.aBoolean471) {
			local13.method5796();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass203_9 == null || this.aByteArray66[arg1] == -1) {
					if (this.aClass154_2.method4101()) {
						return null;
					}
					local13 = this.aClass154_2.method4100(arg1, (byte) 2, true, this.anInt5696);
				} else {
					local13 = this.aClass178_2.method4822(arg1, this.aClass203_9);
				}
			} else if (arg0 == 1) {
				if (this.aClass203_9 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass178_2.method4817(arg1, this.aClass203_9);
			} else if (arg0 == 2) {
				if (this.aClass203_9 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray66[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass154_2.method4098()) {
					return null;
				}
				local13 = this.aClass154_2.method4100(arg1, (byte) 2, false, this.anInt5696);
			} else {
				throw new RuntimeException();
			}
			this.aClass207_34.method5552(local13, (long) arg1);
		}
		if (local13.aBoolean471) {
			return null;
		}
		@Pc(156) byte[] local156 = local13.method4947();
		@Pc(188) int local188;
		@Pc(234) Class1_Sub2_Sub10_Sub2 local234;
		if (!(local13 instanceof Class1_Sub2_Sub10_Sub1)) {
			try {
				if (local156 == null || local156.length <= 2) {
					throw new RuntimeException();
				}
				Static221.aCRC32_1.reset();
				Static221.aCRC32_1.update(local156, 0, local156.length - 2);
				local188 = (int) Static221.aCRC32_1.getValue();
				if (local188 != this.aClass150_2.anIntArray417[arg1]) {
					throw new RuntimeException();
				}
				this.aClass154_2.anInt4730 = 0;
				this.aClass154_2.anInt4731 = 0;
			} catch (@Pc(209) RuntimeException local209) {
				this.aClass154_2.method4107();
				local13.method5796();
				if (local13.aBoolean470 && !this.aClass154_2.method4101()) {
					local234 = this.aClass154_2.method4100(arg1, (byte) 2, true, this.anInt5696);
					this.aClass207_34.method5552(local234, (long) arg1);
				}
				return null;
			}
			local156[local156.length - 2] = (byte) (this.aClass150_2.anIntArray419[arg1] >>> 8);
			local156[local156.length - 1] = (byte) this.aClass150_2.anIntArray419[arg1];
			if (this.aClass203_9 != null) {
				this.aClass178_2.method4814(this.aClass203_9, arg1, local156);
				if (this.aByteArray66[arg1] != 1) {
					this.anInt5702++;
					this.aByteArray66[arg1] = 1;
				}
			}
			if (!local13.aBoolean470) {
				local13.method5796();
			}
			return local13;
		}
		try {
			if (local156 == null || local156.length <= 2) {
				throw new RuntimeException();
			}
			Static221.aCRC32_1.reset();
			Static221.aCRC32_1.update(local156, 0, local156.length - 2);
			local188 = (int) Static221.aCRC32_1.getValue();
			if (local188 != this.aClass150_2.anIntArray417[arg1]) {
				throw new RuntimeException();
			}
			@Pc(369) int local369 = (local156[local156.length - 1] & 0xFF) + ((local156[local156.length - 2] & 0xFF) << 8);
			if ((this.aClass150_2.anIntArray419[arg1] & 0xFFFF) != local369) {
				throw new RuntimeException();
			}
			if (this.aByteArray66[arg1] != 1) {
				this.anInt5702++;
				this.aByteArray66[arg1] = 1;
			}
			if (!local13.aBoolean470) {
				local13.method5796();
			}
			return local13;
		} catch (@Pc(414) Exception local414) {
			this.aByteArray66[arg1] = -1;
			local13.method5796();
			if (local13.aBoolean470 && !this.aClass154_2.method4101()) {
				local234 = this.aClass154_2.method4100(arg1, (byte) 2, true, this.anInt5696);
				this.aClass207_34.method5552(local234, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
	public void method4977() {
		if (this.aClass14_32 != null) {
			if (this.method4966() == null) {
				return;
			}
			@Pc(23) boolean local23;
			@Pc(28) Class1 local28;
			@Pc(34) int local34;
			@Pc(116) Class1 local116;
			if (this.aBoolean478) {
				local23 = true;
				for (local28 = this.aClass14_32.method302(); local28 != null; local28 = this.aClass14_32.method313()) {
					local34 = (int) local28.aLong214;
					if (this.aByteArray66[local34] == 0) {
						this.method4976(1, local34);
					}
					if (this.aByteArray66[local34] == 0) {
						local23 = false;
					} else {
						local28.method5796();
					}
				}
				while (this.anInt5705 < this.aClass150_2.anIntArray416.length) {
					if (this.aClass150_2.anIntArray416[this.anInt5705] == 0) {
						this.anInt5705++;
					} else {
						if (this.aClass178_2.anInt5507 >= 250) {
							local23 = false;
							break;
						}
						if (this.aByteArray66[this.anInt5705] == 0) {
							this.method4976(1, this.anInt5705);
						}
						if (this.aByteArray66[this.anInt5705] == 0) {
							local116 = new Class1();
							local116.aLong214 = this.anInt5705;
							this.aClass14_32.method300(local116);
							local23 = false;
						}
						this.anInt5705++;
					}
				}
				if (local23) {
					this.aBoolean478 = false;
					this.anInt5705 = 0;
				}
			} else if (this.aBoolean477) {
				local23 = true;
				for (local28 = this.aClass14_32.method302(); local28 != null; local28 = this.aClass14_32.method313()) {
					local34 = (int) local28.aLong214;
					if (this.aByteArray66[local34] != 1) {
						this.method4976(2, local34);
					}
					if (this.aByteArray66[local34] == 1) {
						local28.method5796();
					} else {
						local23 = false;
					}
				}
				while (this.aClass150_2.anIntArray416.length > this.anInt5705) {
					if (this.aClass150_2.anIntArray416[this.anInt5705] == 0) {
						this.anInt5705++;
					} else {
						if (this.aClass154_2.method4098()) {
							local23 = false;
							break;
						}
						if (this.aByteArray66[this.anInt5705] != 1) {
							this.method4976(2, this.anInt5705);
						}
						if (this.aByteArray66[this.anInt5705] != 1) {
							local116 = new Class1();
							local116.aLong214 = this.anInt5705;
							local23 = false;
							this.aClass14_32.method300(local116);
						}
						this.anInt5705++;
					}
				}
				if (local23) {
					this.aBoolean477 = false;
					this.anInt5705 = 0;
				}
			} else {
				this.aClass14_32 = null;
			}
		}
		if (!this.aBoolean479 || this.aLong177 > Static292.method5114()) {
			return;
		}
		for (@Pc(319) Class1_Sub2_Sub10 local319 = (Class1_Sub2_Sub10) this.aClass207_34.method5560(); local319 != null; local319 = (Class1_Sub2_Sub10) this.aClass207_34.method5559()) {
			if (!local319.aBoolean471) {
				if (local319.aBoolean469) {
					if (!local319.aBoolean470) {
						throw new RuntimeException();
					}
					local319.method5796();
				} else {
					local319.aBoolean469 = true;
				}
			}
		}
		this.aLong177 = Static292.method5114() + 1000L;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Lclient!og;")
	@Override
	public Class150 method4966() {
		if (this.aClass150_2 != null) {
			return this.aClass150_2;
		}
		if (this.aClass1_Sub2_Sub10_1 == null) {
			if (this.aClass154_2.method4101()) {
				return null;
			}
			this.aClass1_Sub2_Sub10_1 = this.aClass154_2.method4100(this.anInt5696, (byte) 0, true, 255);
		}
		if (this.aClass1_Sub2_Sub10_1.aBoolean471) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass1_Sub2_Sub10_1.method4947();
		if (this.aClass1_Sub2_Sub10_1 instanceof Class1_Sub2_Sub10_Sub1) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass150_2 = new Class150(local49, this.anInt5694);
				if (this.anInt5692 != this.aClass150_2.anInt4530) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass150_2 = null;
				if (this.aClass154_2.method4101()) {
					this.aClass1_Sub2_Sub10_1 = null;
				} else {
					this.aClass1_Sub2_Sub10_1 = this.aClass154_2.method4100(this.anInt5696, (byte) 0, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass150_2 = new Class150(local49, this.anInt5694);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass154_2.method4107();
				this.aClass150_2 = null;
				if (this.aClass154_2.method4101()) {
					this.aClass1_Sub2_Sub10_1 = null;
				} else {
					this.aClass1_Sub2_Sub10_1 = this.aClass154_2.method4100(this.anInt5696, (byte) 0, true, 255);
				}
				return null;
			}
			if (this.aClass203_10 != null) {
				this.aClass178_2.method4814(this.aClass203_10, this.anInt5696, local49);
			}
		}
		this.aClass1_Sub2_Sub10_1 = null;
		if (this.aClass203_9 != null) {
			this.anInt5702 = 0;
			this.aByteArray66 = new byte[this.aClass150_2.anInt4533];
		}
		return this.aClass150_2;
	}

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)V")
	public void method4978() {
		if (this.aClass14_32 == null || this.method4966() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass14_31.method302(); local19 != null; local19 = this.aClass14_31.method313()) {
			@Pc(25) int local25 = (int) local19.aLong214;
			if (local25 < 0 || this.aClass150_2.anInt4533 <= local25 || this.aClass150_2.anIntArray416[local25] == 0) {
				local19.method5796();
			} else {
				if (this.aByteArray66[local25] == 0) {
					this.method4976(1, local25);
				}
				if (this.aByteArray66[local25] == -1) {
					this.method4976(2, local25);
				}
				if (this.aByteArray66[local25] == 1) {
					local19.method5796();
				}
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "f", descriptor = "(I)I")
	public int method4979() {
		if (this.aClass150_2 == null) {
			return 0;
		} else if (this.aBoolean478) {
			@Pc(20) Class1 local20 = this.aClass14_32.method302();
			return local20 == null ? 0 : (int) local20.aLong214;
		} else {
			return this.aClass150_2.anInt4535;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)I")
	@Override
	public int method4964(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub2_Sub10 local16 = (Class1_Sub2_Sub10) this.aClass207_34.method5555((long) arg0);
		return local16 == null ? 0 : local16.method4949();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4968(@OriginalArg(1) int arg0) {
		if (this.aClass203_9 == null) {
			return;
		}
		for (@Pc(21) Class1 local21 = this.aClass14_31.method302(); local21 != null; local21 = this.aClass14_31.method313()) {
			if (local21.aLong214 == (long) arg0) {
				return;
			}
		}
		@Pc(45) Class1 local45 = new Class1();
		local45.aLong214 = arg0;
		this.aClass14_31.method300(local45);
	}
}
