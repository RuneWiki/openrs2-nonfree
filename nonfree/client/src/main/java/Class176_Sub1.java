import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class176_Sub1 extends Class176 {

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "[B")
	private byte[] aByteArray210;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Lclient!eh;")
	private Class66 aClass66_2;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Z")
	private boolean aBoolean646;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	private int anInt7558 = 0;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!ub;")
	private final Class240 aClass240_38 = new Class240(16);

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
	private int anInt7579 = 0;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "Lclient!wl;")
	private final Class265 aClass265_54 = new Class265();

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "J")
	private long aLong221 = 0L;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
	private final int anInt7560;

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "Lclient!oc;")
	private final Class175 aClass175_6;

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "Z")
	private boolean aBoolean647;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "Lclient!wl;")
	private Class265 aClass265_53;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
	private final boolean aBoolean648;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
	private final int anInt7563;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
	private final int anInt7564;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "Lclient!oc;")
	private final Class175 aClass175_5;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!fn;")
	private final Class87 aClass87_3;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!oj;")
	private final Class179 aClass179_3;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Lclient!ud;")
	private Class2_Sub2_Sub12 aClass2_Sub2_Sub12_1;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(ILclient!oc;Lclient!oc;Lclient!oj;Lclient!fn;IIZ)V")
	public Class176_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class175 arg2, @OriginalArg(3) Class179 arg3, @OriginalArg(4) Class87 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7560 = arg0;
		this.aClass175_6 = arg1;
		if (this.aClass175_6 == null) {
			this.aBoolean647 = false;
		} else {
			this.aBoolean647 = true;
			this.aClass265_53 = new Class265();
		}
		this.aBoolean648 = arg7;
		this.anInt7563 = arg5;
		this.anInt7564 = arg6;
		this.aClass175_5 = arg2;
		this.aClass87_3 = arg4;
		this.aClass179_3 = arg3;
		if (this.aClass175_5 != null) {
			this.aClass2_Sub2_Sub12_1 = this.aClass87_3.method1749(this.anInt7560, this.aClass175_5);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)I")
	public int method5864() {
		return this.aClass66_2 == null ? 0 : this.aClass66_2.anInt2067;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public void method5866() {
		if (this.aClass175_6 != null) {
			this.aBoolean646 = true;
			if (this.aClass265_53 == null) {
				this.aClass265_53 = new Class265();
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
	public void method5868() {
		if (this.aClass265_53 != null) {
			if (this.method5858() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class2 local26;
			@Pc(32) int local32;
			@Pc(124) Class2 local124;
			if (this.aBoolean647) {
				local21 = true;
				for (local26 = this.aClass265_53.method6005(); local26 != null; local26 = this.aClass265_53.method6001()) {
					local32 = (int) local26.aLong227;
					if (this.aByteArray210[local32] == 0) {
						this.method5871(1, local32);
					}
					if (this.aByteArray210[local32] == 0) {
						local21 = false;
					} else {
						local26.method6072();
					}
				}
				while (this.anInt7579 < this.aClass66_2.anIntArray114.length) {
					if (this.aClass66_2.anIntArray114[this.anInt7579] == 0) {
						this.anInt7579++;
					} else {
						if (this.aClass87_3.anInt2392 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray210[this.anInt7579] == 0) {
							this.method5871(1, this.anInt7579);
						}
						if (this.aByteArray210[this.anInt7579] == 0) {
							local124 = new Class2();
							local124.aLong227 = this.anInt7579;
							local21 = false;
							this.aClass265_53.method5999(local124);
						}
						this.anInt7579++;
					}
				}
				if (local21) {
					this.anInt7579 = 0;
					this.aBoolean647 = false;
				}
			} else if (this.aBoolean646) {
				local21 = true;
				for (local26 = this.aClass265_53.method6005(); local26 != null; local26 = this.aClass265_53.method6001()) {
					local32 = (int) local26.aLong227;
					if (this.aByteArray210[local32] != 1) {
						this.method5871(2, local32);
					}
					if (this.aByteArray210[local32] == 1) {
						local26.method6072();
					} else {
						local21 = false;
					}
				}
				while (this.anInt7579 < this.aClass66_2.anIntArray114.length) {
					if (this.aClass66_2.anIntArray114[this.anInt7579] == 0) {
						this.anInt7579++;
					} else {
						if (this.aClass179_3.method4132()) {
							local21 = false;
							break;
						}
						if (this.aByteArray210[this.anInt7579] != 1) {
							this.method5871(2, this.anInt7579);
						}
						if (this.aByteArray210[this.anInt7579] != 1) {
							local124 = new Class2();
							local124.aLong227 = this.anInt7579;
							local21 = false;
							this.aClass265_53.method5999(local124);
						}
						this.anInt7579++;
					}
				}
				if (local21) {
					this.anInt7579 = 0;
					this.aBoolean646 = false;
				}
			} else {
				this.aClass265_53 = null;
			}
		}
		if (!this.aBoolean648 || this.aLong221 > Static208.method3182()) {
			return;
		}
		for (@Pc(318) Class2_Sub2_Sub12 local318 = (Class2_Sub2_Sub12) this.aClass240_38.method5438(); local318 != null; local318 = (Class2_Sub2_Sub12) this.aClass240_38.method5436()) {
			if (!local318.aBoolean526) {
				if (local318.aBoolean524) {
					if (!local318.aBoolean525) {
						throw new RuntimeException();
					}
					local318.method6072();
				} else {
					local318.aBoolean524 = true;
				}
			}
		}
		this.aLong221 = Static208.method3182() + 1000L;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	@Override
	public void method5859(@OriginalArg(0) int arg0) {
		if (this.aClass175_6 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass265_54.method6005(); local14 != null; local14 = this.aClass265_54.method6001()) {
			if ((long) arg0 == local14.aLong227) {
				return;
			}
		}
		@Pc(47) Class2 local47 = new Class2();
		local47.aLong227 = arg0;
		this.aClass265_54.method5999(local47);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I")
	@Override
	public int method5860(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub12 local11 = (Class2_Sub2_Sub12) this.aClass240_38.method5439((long) arg0);
		return local11 == null ? 0 : local11.method4777();
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method5861(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub2_Sub12 local14 = this.method5871(0, arg0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method4775();
			local14.method6072();
			return local22;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)I")
	public int method5870() {
		if (this.method5858() == null) {
			return this.aClass2_Sub2_Sub12_1 == null ? 0 : this.aClass2_Sub2_Sub12_1.method4777();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)Lclient!ud;")
	private Class2_Sub2_Sub12 method5871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub12 local13 = (Class2_Sub2_Sub12) this.aClass240_38.method5439((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean525 && local13.aBoolean526) {
			local13.method6072();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass175_6 == null || this.aByteArray210[arg1] == -1) {
					if (this.aClass179_3.method4140()) {
						return null;
					}
					local13 = this.aClass179_3.method4128(arg1, (byte) 2, true, this.anInt7560);
				} else {
					local13 = this.aClass87_3.method1749(arg1, this.aClass175_6);
				}
			} else if (arg0 == 1) {
				if (this.aClass175_6 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass87_3.method1750(arg1, this.aClass175_6);
			} else if (arg0 == 2) {
				if (this.aClass175_6 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray210[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass179_3.method4132()) {
					return null;
				}
				local13 = this.aClass179_3.method4128(arg1, (byte) 2, false, this.anInt7560);
			} else {
				throw new RuntimeException();
			}
			this.aClass240_38.method5430((long) arg1, local13);
		}
		if (local13.aBoolean526) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.method4775();
		@Pc(188) int local188;
		@Pc(293) Class2_Sub2_Sub12_Sub1 local293;
		if (!(local13 instanceof Class2_Sub2_Sub12_Sub2)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				Static270.aCRC32_1.reset();
				Static270.aCRC32_1.update(local161, 0, local161.length - 2);
				local188 = (int) Static270.aCRC32_1.getValue();
				if (local188 != this.aClass66_2.anIntArray115[arg1]) {
					throw new RuntimeException();
				}
				this.aClass179_3.anInt5124 = 0;
				this.aClass179_3.anInt5123 = 0;
			} catch (@Pc(349) RuntimeException local349) {
				this.aClass179_3.method4134();
				local13.method6072();
				if (local13.aBoolean525 && !this.aClass179_3.method4140()) {
					local293 = this.aClass179_3.method4128(arg1, (byte) 2, true, this.anInt7560);
					this.aClass240_38.method5430((long) arg1, local293);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass66_2.anIntArray113[arg1] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass66_2.anIntArray113[arg1];
			if (this.aClass175_6 != null) {
				this.aClass87_3.method1747(local161, arg1, this.aClass175_6);
				if (this.aByteArray210[arg1] != 1) {
					this.anInt7558++;
					this.aByteArray210[arg1] = 1;
				}
			}
			if (!local13.aBoolean525) {
				local13.method6072();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static270.aCRC32_1.reset();
			Static270.aCRC32_1.update(local161, 0, local161.length - 2);
			local188 = (int) Static270.aCRC32_1.getValue();
			if (local188 != this.aClass66_2.anIntArray115[arg1]) {
				throw new RuntimeException();
			}
			@Pc(224) int local224 = ((local161[local161.length - 2] & 0xFF) << 8) + (local161[local161.length - 1] & 0xFF);
			if (local224 != (this.aClass66_2.anIntArray113[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray210[arg1] != 1) {
				this.anInt7558++;
				this.aByteArray210[arg1] = 1;
			}
			if (!local13.aBoolean525) {
				local13.method6072();
			}
			return local13;
		} catch (@Pc(265) Exception local265) {
			this.aByteArray210[arg1] = -1;
			local13.method6072();
			if (local13.aBoolean525 && !this.aClass179_3.method4140()) {
				local293 = this.aClass179_3.method4128(arg1, (byte) 2, true, this.anInt7560);
				this.aClass240_38.method5430((long) arg1, local293);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
	public int method5872() {
		return this.anInt7558;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
	public void method5873() {
		if (this.aClass265_53 == null || this.method5858() == null) {
			return;
		}
		for (@Pc(27) Class2 local27 = this.aClass265_54.method6005(); local27 != null; local27 = this.aClass265_54.method6001()) {
			@Pc(33) int local33 = (int) local27.aLong227;
			if (local33 < 0 || local33 >= this.aClass66_2.anInt2062 || this.aClass66_2.anIntArray114[local33] == 0) {
				local27.method6072();
			} else {
				if (this.aByteArray210[local33] == 0) {
					this.method5871(1, local33);
				}
				if (this.aByteArray210[local33] == -1) {
					this.method5871(2, local33);
				}
				if (this.aByteArray210[local33] == 1) {
					local27.method6072();
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)I")
	public int method5874() {
		if (this.aClass66_2 == null) {
			return 0;
		} else if (this.aBoolean647) {
			@Pc(20) Class2 local20 = this.aClass265_53.method6005();
			return local20 == null ? 0 : (int) local20.aLong227;
		} else {
			return this.aClass66_2.anInt2067;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!eh;")
	@Override
	public Class66 method5858() {
		if (this.aClass66_2 != null) {
			return this.aClass66_2;
		}
		if (this.aClass2_Sub2_Sub12_1 == null) {
			if (this.aClass179_3.method4140()) {
				return null;
			}
			this.aClass2_Sub2_Sub12_1 = this.aClass179_3.method4128(this.anInt7560, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub2_Sub12_1.aBoolean526) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass2_Sub2_Sub12_1.method4775();
		if (this.aClass2_Sub2_Sub12_1 instanceof Class2_Sub2_Sub12_Sub2) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass66_2 = new Class66(local51, this.anInt7563);
				if (this.anInt7564 != this.aClass66_2.anInt2069) {
					throw new RuntimeException();
				}
			} catch (@Pc(143) RuntimeException local143) {
				this.aClass66_2 = null;
				if (this.aClass179_3.method4140()) {
					this.aClass2_Sub2_Sub12_1 = null;
				} else {
					this.aClass2_Sub2_Sub12_1 = this.aClass179_3.method4128(this.anInt7560, (byte) 0, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass66_2 = new Class66(local51, this.anInt7563);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass179_3.method4134();
				this.aClass66_2 = null;
				if (this.aClass179_3.method4140()) {
					this.aClass2_Sub2_Sub12_1 = null;
				} else {
					this.aClass2_Sub2_Sub12_1 = this.aClass179_3.method4128(this.anInt7560, (byte) 0, true, 255);
				}
				return null;
			}
			if (this.aClass175_5 != null) {
				this.aClass87_3.method1747(local51, this.anInt7560, this.aClass175_5);
			}
		}
		this.aClass2_Sub2_Sub12_1 = null;
		if (this.aClass175_6 != null) {
			this.anInt7558 = 0;
			this.aByteArray210 = new byte[this.aClass66_2.anInt2062];
		}
		return this.aClass66_2;
	}
}
