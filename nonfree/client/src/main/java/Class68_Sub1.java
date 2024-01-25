import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "Lclient!vn;")
	private Class252 aClass252_2;

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
	private int anInt6280 = 0;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "Lclient!fe;")
	private final Class74 aClass74_24 = new Class74(16);

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
	private int anInt6293 = 0;

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "Lclient!um;")
	private final Class244 aClass244_37 = new Class244();

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
	private final int anInt6289;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "Lclient!ek;")
	private final Class63 aClass63_4;

	@OriginalMember(owner = "client!rr", name = "E", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Lclient!um;")
	private Class244 aClass244_38;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	private final int anInt6286;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "Lclient!t;")
	private final Class227 aClass227_2;

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "Lclient!ek;")
	private final Class63 aClass63_3;

	@OriginalMember(owner = "client!rr", name = "M", descriptor = "Z")
	private final boolean aBoolean403;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	private final int anInt6288;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!qc;")
	private final Class203 aClass203_3;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "Lclient!mc;")
	private Class6_Sub2_Sub11 aClass6_Sub2_Sub11_1;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(ILclient!ek;Lclient!ek;Lclient!t;Lclient!qc;IIZ)V")
	public Class68_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(3) Class227 arg3, @OriginalArg(4) Class203 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6289 = arg0;
		this.aClass63_4 = arg1;
		if (this.aClass63_4 == null) {
			this.aBoolean401 = false;
		} else {
			this.aBoolean401 = true;
			this.aClass244_38 = new Class244();
		}
		this.anInt6286 = arg6;
		this.aClass227_2 = arg3;
		this.aClass63_3 = arg2;
		this.aBoolean403 = arg7;
		this.anInt6288 = arg5;
		this.aClass203_3 = arg4;
		if (this.aClass63_3 != null) {
			this.aClass6_Sub2_Sub11_1 = this.aClass203_3.method4596(this.aClass63_3, this.anInt6289);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
	public int method5217() {
		if (this.aClass252_2 == null) {
			return 0;
		} else if (this.aBoolean401) {
			@Pc(26) Class6 local26 = this.aClass244_38.method5976();
			return local26 == null ? 0 : (int) local26.aLong229;
		} else {
			return this.aClass252_2.anInt7590;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method5213(@OriginalArg(0) int arg0) {
		@Pc(15) Class6_Sub2_Sub11 local15 = this.method5220(arg0, 0);
		if (local15 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local15.method6374();
			local15.method6525();
			return local23;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V")
	public void method5218() {
		if (this.aClass244_38 != null) {
			if (this.method5216() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class6 local26;
			@Pc(32) int local32;
			@Pc(124) Class6 local124;
			if (this.aBoolean401) {
				local21 = true;
				for (local26 = this.aClass244_38.method5976(); local26 != null; local26 = this.aClass244_38.method5964()) {
					local32 = (int) local26.aLong229;
					if (this.aByteArray78[local32] == 0) {
						this.method5220(local32, 1);
					}
					if (this.aByteArray78[local32] == 0) {
						local21 = false;
					} else {
						local26.method6525();
					}
				}
				while (this.anInt6293 < this.aClass252_2.anIntArray520.length) {
					if (this.aClass252_2.anIntArray520[this.anInt6293] == 0) {
						this.anInt6293++;
					} else {
						if (this.aClass203_3.anInt5504 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray78[this.anInt6293] == 0) {
							this.method5220(this.anInt6293, 1);
						}
						if (this.aByteArray78[this.anInt6293] == 0) {
							local124 = new Class6();
							local124.aLong229 = this.anInt6293;
							this.aClass244_38.method5966(local124);
							local21 = false;
						}
						this.anInt6293++;
					}
				}
				if (local21) {
					this.anInt6293 = 0;
					this.aBoolean401 = false;
				}
			} else if (this.aBoolean402) {
				local21 = true;
				for (local26 = this.aClass244_38.method5976(); local26 != null; local26 = this.aClass244_38.method5964()) {
					local32 = (int) local26.aLong229;
					if (this.aByteArray78[local32] != 1) {
						this.method5220(local32, 2);
					}
					if (this.aByteArray78[local32] == 1) {
						local26.method6525();
					} else {
						local21 = false;
					}
				}
				while (this.aClass252_2.anIntArray520.length > this.anInt6293) {
					if (this.aClass252_2.anIntArray520[this.anInt6293] == 0) {
						this.anInt6293++;
					} else {
						if (this.aClass227_2.method5583()) {
							local21 = false;
							break;
						}
						if (this.aByteArray78[this.anInt6293] != 1) {
							this.method5220(this.anInt6293, 2);
						}
						if (this.aByteArray78[this.anInt6293] != 1) {
							local124 = new Class6();
							local124.aLong229 = this.anInt6293;
							local21 = false;
							this.aClass244_38.method5966(local124);
						}
						this.anInt6293++;
					}
				}
				if (local21) {
					this.anInt6293 = 0;
					this.aBoolean402 = false;
				}
			} else {
				this.aClass244_38 = null;
			}
		}
		if (!this.aBoolean403 || Static449.method6552() < this.aLong181) {
			return;
		}
		for (@Pc(320) Class6_Sub2_Sub11 local320 = (Class6_Sub2_Sub11) this.aClass74_24.method1889(); local320 != null; local320 = (Class6_Sub2_Sub11) this.aClass74_24.method1881()) {
			if (!local320.aBoolean491) {
				if (local320.aBoolean489) {
					if (!local320.aBoolean490) {
						throw new RuntimeException();
					}
					local320.method6525();
				} else {
					local320.aBoolean489 = true;
				}
			}
		}
		this.aLong181 = Static449.method6552() + 1000L;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public void method5219() {
		if (this.aClass244_38 == null || this.method5216() == null) {
			return;
		}
		for (@Pc(19) Class6 local19 = this.aClass244_37.method5976(); local19 != null; local19 = this.aClass244_37.method5964()) {
			@Pc(32) int local32 = (int) local19.aLong229;
			if (local32 < 0 || this.aClass252_2.anInt7592 <= local32 || this.aClass252_2.anIntArray520[local32] == 0) {
				local19.method6525();
			} else {
				if (this.aByteArray78[local32] == 0) {
					this.method5220(local32, 1);
				}
				if (this.aByteArray78[local32] == -1) {
					this.method5220(local32, 2);
				}
				if (this.aByteArray78[local32] == 1) {
					local19.method6525();
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Lclient!mc;")
	private Class6_Sub2_Sub11 method5220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class6_Sub2_Sub11 local19 = (Class6_Sub2_Sub11) this.aClass74_24.method1883((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean490 && local19.aBoolean491) {
			local19.method6525();
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass63_4 == null || this.aByteArray78[arg0] == -1) {
					if (this.aClass227_2.method5582()) {
						return null;
					}
					local19 = this.aClass227_2.method5574(arg0, this.anInt6289, (byte) 2, true);
				} else {
					local19 = this.aClass203_3.method4596(this.aClass63_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass63_4 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass203_3.method4594(this.aClass63_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass63_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray78[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass227_2.method5583()) {
					return null;
				}
				local19 = this.aClass227_2.method5574(arg0, this.anInt6289, (byte) 2, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass74_24.method1890((long) arg0, local19);
		}
		if (local19.aBoolean491) {
			return null;
		}
		@Pc(162) byte[] local162 = local19.method6374();
		@Pc(189) int local189;
		@Pc(291) Class6_Sub2_Sub11_Sub1 local291;
		if (!(local19 instanceof Class6_Sub2_Sub11_Sub2)) {
			try {
				if (local162 == null || local162.length <= 2) {
					throw new RuntimeException();
				}
				Static168.aCRC32_1.reset();
				Static168.aCRC32_1.update(local162, 0, local162.length - 2);
				local189 = (int) Static168.aCRC32_1.getValue();
				if (local189 != this.aClass252_2.anIntArray521[arg0]) {
					throw new RuntimeException();
				}
				this.aClass227_2.anInt6699 = 0;
				this.aClass227_2.anInt6698 = 0;
			} catch (@Pc(351) RuntimeException local351) {
				this.aClass227_2.method5580();
				local19.method6525();
				if (local19.aBoolean490 && !this.aClass227_2.method5582()) {
					local291 = this.aClass227_2.method5574(arg0, this.anInt6289, (byte) 2, true);
					this.aClass74_24.method1890((long) arg0, local291);
				}
				return null;
			}
			local162[local162.length - 2] = (byte) (this.aClass252_2.anIntArray518[arg0] >>> 8);
			local162[local162.length - 1] = (byte) this.aClass252_2.anIntArray518[arg0];
			if (this.aClass63_4 != null) {
				this.aClass203_3.method4599(this.aClass63_4, arg0, local162);
				if (this.aByteArray78[arg0] != 1) {
					this.anInt6280++;
					this.aByteArray78[arg0] = 1;
				}
			}
			if (!local19.aBoolean490) {
				local19.method6525();
			}
			return local19;
		}
		try {
			if (local162 == null || local162.length <= 2) {
				throw new RuntimeException();
			}
			Static168.aCRC32_1.reset();
			Static168.aCRC32_1.update(local162, 0, local162.length - 2);
			local189 = (int) Static168.aCRC32_1.getValue();
			if (local189 != this.aClass252_2.anIntArray521[arg0]) {
				throw new RuntimeException();
			}
			@Pc(224) int local224 = (local162[local162.length - 1] & 0xFF) + ((local162[local162.length - 2] & 0xFF) << 8);
			if (local224 != (this.aClass252_2.anIntArray518[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray78[arg0] != 1) {
				this.anInt6280++;
				this.aByteArray78[arg0] = 1;
			}
			if (!local19.aBoolean490) {
				local19.method6525();
			}
			return local19;
		} catch (@Pc(265) Exception local265) {
			this.aByteArray78[arg0] = -1;
			local19.method6525();
			if (local19.aBoolean490 && !this.aClass227_2.method5582()) {
				local291 = this.aClass227_2.method5574(arg0, this.anInt6289, (byte) 2, true);
				this.aClass74_24.method1890((long) arg0, local291);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public void method5221() {
		if (this.aClass63_4 != null) {
			this.aBoolean402 = true;
			if (this.aClass244_38 == null) {
				this.aClass244_38 = new Class244();
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5215(@OriginalArg(0) int arg0) {
		@Pc(17) Class6_Sub2_Sub11 local17 = (Class6_Sub2_Sub11) this.aClass74_24.method1883((long) arg0);
		return local17 == null ? 0 : local17.method6376();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
	@Override
	public void method5214(@OriginalArg(1) int arg0) {
		if (this.aClass63_4 == null) {
			return;
		}
		for (@Pc(22) Class6 local22 = this.aClass244_37.method5976(); local22 != null; local22 = this.aClass244_37.method5964()) {
			if ((long) arg0 == local22.aLong229) {
				return;
			}
		}
		@Pc(42) Class6 local42 = new Class6();
		local42.aLong229 = arg0;
		this.aClass244_37.method5966(local42);
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)I")
	public int method5223() {
		if (this.method5216() == null) {
			return this.aClass6_Sub2_Sub11_1 == null ? 0 : this.aClass6_Sub2_Sub11_1.method6376();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lclient!vn;")
	@Override
	public Class252 method5216() {
		if (this.aClass252_2 != null) {
			return this.aClass252_2;
		}
		if (this.aClass6_Sub2_Sub11_1 == null) {
			if (this.aClass227_2.method5582()) {
				return null;
			}
			this.aClass6_Sub2_Sub11_1 = this.aClass227_2.method5574(this.anInt6289, 255, (byte) 0, true);
		}
		if (this.aClass6_Sub2_Sub11_1.aBoolean491) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass6_Sub2_Sub11_1.method6374();
		if (this.aClass6_Sub2_Sub11_1 instanceof Class6_Sub2_Sub11_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass252_2 = new Class252(local48, this.anInt6288);
				if (this.aClass252_2.anInt7589 != this.anInt6286) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.aClass252_2 = null;
				if (this.aClass227_2.method5582()) {
					this.aClass6_Sub2_Sub11_1 = null;
				} else {
					this.aClass6_Sub2_Sub11_1 = this.aClass227_2.method5574(this.anInt6289, 255, (byte) 0, true);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass252_2 = new Class252(local48, this.anInt6288);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass227_2.method5580();
				this.aClass252_2 = null;
				if (this.aClass227_2.method5582()) {
					this.aClass6_Sub2_Sub11_1 = null;
				} else {
					this.aClass6_Sub2_Sub11_1 = this.aClass227_2.method5574(this.anInt6289, 255, (byte) 0, true);
				}
				return null;
			}
			if (this.aClass63_3 != null) {
				this.aClass203_3.method4599(this.aClass63_3, this.anInt6289, local48);
			}
		}
		if (this.aClass63_4 != null) {
			this.anInt6280 = 0;
			this.aByteArray78 = new byte[this.aClass252_2.anInt7592];
		}
		this.aClass6_Sub2_Sub11_1 = null;
		return this.aClass252_2;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)I")
	public int method5224() {
		return this.aClass252_2 == null ? 0 : this.aClass252_2.anInt7590;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)I")
	public int method5225() {
		return this.anInt6280;
	}
}
