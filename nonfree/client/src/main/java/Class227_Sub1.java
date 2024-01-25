import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class227_Sub1 extends Class227 {

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!bj;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
	private int anInt9233 = 0;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!ee;")
	private final Class83 aClass83_40 = new Class83(16);

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
	private int anInt9243 = 0;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "Lclient!tm;")
	private final Class338 aClass338_213 = new Class338();

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "J")
	private long aLong270 = 0L;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
	private final int anInt9241;

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "Lclient!tk;")
	private final Class337 aClass337_6;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Lclient!tm;")
	private Class338 aClass338_214;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	private final int anInt9227;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!nja;")
	private final Class240 aClass240_3;

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	private final int anInt9231;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!tv;")
	private final Class341 aClass341_5;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "[B")
	private final byte[] aByteArray96;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Lclient!tk;")
	private final Class337 aClass337_5;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Z")
	private final boolean aBoolean719;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Lclient!ev;")
	private Class3_Sub11_Sub2 aClass3_Sub11_Sub2_1;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILclient!tk;Lclient!tk;Lclient!tv;Lclient!nja;I[BIZ)V")
	public Class227_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class337 arg1, @OriginalArg(2) Class337 arg2, @OriginalArg(3) Class341 arg3, @OriginalArg(4) Class240 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt9241 = arg0;
		this.aClass337_6 = arg1;
		if (this.aClass337_6 == null) {
			this.aBoolean717 = false;
		} else {
			this.aBoolean717 = true;
			this.aClass338_214 = new Class338();
		}
		this.anInt9227 = arg5;
		this.aClass240_3 = arg4;
		this.anInt9231 = arg7;
		this.aClass341_5 = arg3;
		this.aByteArray96 = arg6;
		this.aClass337_5 = arg2;
		this.aBoolean719 = arg8;
		if (this.aClass337_5 != null) {
			this.aClass3_Sub11_Sub2_1 = this.aClass240_3.method5739(this.anInt9241, this.aClass337_5);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public void method8074() {
		if (this.aClass338_214 == null || this.method8069() == null) {
			return;
		}
		for (@Pc(23) Class3 local23 = this.aClass338_213.method8177(); local23 != null; local23 = this.aClass338_213.method8168()) {
			@Pc(29) int local29 = (int) local23.aLong311;
			if (local29 < 0 || local29 >= this.aClass37_2.anInt1033 || this.aClass37_2.anIntArray86[local29] == 0) {
				local23.method9380();
			} else {
				if (this.aByteArray97[local29] == 0) {
					this.method8081(local29, 1);
				}
				if (this.aByteArray97[local29] == -1) {
					this.method8081(local29, 2);
				}
				if (this.aByteArray97[local29] == 1) {
					local23.method9380();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
	public int method8075() {
		return this.anInt9233;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method8071(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub11_Sub2 local9 = this.method8081(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method2889();
			local9.method9380();
			return local17;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public int method8076() {
		if (this.aClass37_2 == null) {
			return 0;
		} else if (this.aBoolean717) {
			@Pc(20) Class3 local20 = this.aClass338_214.method8177();
			return local20 == null ? 0 : (int) local20.aLong311;
		} else {
			return this.aClass37_2.anInt1038;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public void method8077() {
		if (this.aClass337_6 != null) {
			this.aBoolean718 = true;
			if (this.aClass338_214 == null) {
				this.aClass338_214 = new Class338();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I")
	@Override
	public int method8068(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub11_Sub2 local17 = (Class3_Sub11_Sub2) this.aClass83_40.method2368((long) arg0);
		return local17 == null ? 0 : local17.method2891();
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	public void method8078() {
		if (this.aClass338_214 != null) {
			if (this.method8069() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class3 local30;
			@Pc(36) int local36;
			@Pc(128) Class3 local128;
			if (this.aBoolean717) {
				local25 = true;
				for (local30 = this.aClass338_214.method8177(); local30 != null; local30 = this.aClass338_214.method8168()) {
					local36 = (int) local30.aLong311;
					if (this.aByteArray97[local36] == 0) {
						this.method8081(local36, 1);
					}
					if (this.aByteArray97[local36] == 0) {
						local25 = false;
					} else {
						local30.method9380();
					}
				}
				while (this.anInt9243 < this.aClass37_2.anIntArray86.length) {
					if (this.aClass37_2.anIntArray86[this.anInt9243] == 0) {
						this.anInt9243++;
					} else {
						if (this.aClass240_3.anInt6452 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray97[this.anInt9243] == 0) {
							this.method8081(this.anInt9243, 1);
						}
						if (this.aByteArray97[this.anInt9243] == 0) {
							local128 = new Class3();
							local128.aLong311 = (long) this.anInt9243;
							this.aClass338_214.method8171(local128);
							local25 = false;
						}
						this.anInt9243++;
					}
				}
				if (local25) {
					this.aBoolean717 = false;
					this.anInt9243 = 0;
				}
			} else if (this.aBoolean718) {
				local25 = true;
				for (local30 = this.aClass338_214.method8177(); local30 != null; local30 = this.aClass338_214.method8168()) {
					local36 = (int) local30.aLong311;
					if (this.aByteArray97[local36] != 1) {
						this.method8081(local36, 2);
					}
					if (this.aByteArray97[local36] == 1) {
						local30.method9380();
					} else {
						local25 = false;
					}
				}
				while (this.anInt9243 < this.aClass37_2.anIntArray86.length) {
					if (this.aClass37_2.anIntArray86[this.anInt9243] == 0) {
						this.anInt9243++;
					} else {
						if (this.aClass341_5.method8294()) {
							local25 = false;
							break;
						}
						if (this.aByteArray97[this.anInt9243] != 1) {
							this.method8081(this.anInt9243, 2);
						}
						if (this.aByteArray97[this.anInt9243] != 1) {
							local128 = new Class3();
							local128.aLong311 = (long) this.anInt9243;
							local25 = false;
							this.aClass338_214.method8171(local128);
						}
						this.anInt9243++;
					}
				}
				if (local25) {
					this.aBoolean718 = false;
					this.anInt9243 = 0;
				}
			} else {
				this.aClass338_214 = null;
			}
		}
		if (!this.aBoolean719 || Static524.method7320() < this.aLong270) {
			return;
		}
		for (@Pc(318) Class3_Sub11_Sub2 local318 = (Class3_Sub11_Sub2) this.aClass83_40.method2375(); local318 != null; local318 = (Class3_Sub11_Sub2) this.aClass83_40.method2370()) {
			if (!local318.aBoolean237) {
				if (local318.aBoolean239) {
					if (!local318.aBoolean238) {
						throw new RuntimeException();
					}
					local318.method9380();
				} else {
					local318.aBoolean239 = true;
				}
			}
		}
		this.aLong270 = Static524.method7320() + 1000L;
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I")
	public int method8079() {
		return this.aClass37_2 == null ? 0 : this.aClass37_2.anInt1038;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!bj;")
	@Override
	public Class37 method8069() {
		if (this.aClass37_2 != null) {
			return this.aClass37_2;
		}
		if (this.aClass3_Sub11_Sub2_1 == null) {
			if (this.aClass341_5.method8303()) {
				return null;
			}
			this.aClass3_Sub11_Sub2_1 = this.aClass341_5.method8302((byte) 0, true, this.anInt9241, 255);
		}
		if (this.aClass3_Sub11_Sub2_1.aBoolean237) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass3_Sub11_Sub2_1.method2889();
		if (this.aClass3_Sub11_Sub2_1 instanceof Class3_Sub11_Sub2_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass37_2 = new Class37(local43, this.anInt9227, this.aByteArray96);
				if (this.aClass37_2.anInt1034 != this.anInt9231) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass37_2 = null;
				if (this.aClass341_5.method8303()) {
					this.aClass3_Sub11_Sub2_1 = null;
				} else {
					this.aClass3_Sub11_Sub2_1 = this.aClass341_5.method8302((byte) 0, true, this.anInt9241, 255);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass37_2 = new Class37(local43, this.anInt9227, this.aByteArray96);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass341_5.method8292();
				this.aClass37_2 = null;
				if (this.aClass341_5.method8303()) {
					this.aClass3_Sub11_Sub2_1 = null;
				} else {
					this.aClass3_Sub11_Sub2_1 = this.aClass341_5.method8302((byte) 0, true, this.anInt9241, 255);
				}
				return null;
			}
			if (this.aClass337_5 != null) {
				this.aClass240_3.method5737(this.anInt9241, this.aClass337_5, local43);
			}
		}
		this.aClass3_Sub11_Sub2_1 = null;
		if (this.aClass337_6 != null) {
			this.aByteArray97 = new byte[this.aClass37_2.anInt1033];
			this.anInt9233 = 0;
		}
		return this.aClass37_2;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	@Override
	public void method8070(@OriginalArg(1) int arg0) {
		if (this.aClass337_6 == null) {
			return;
		}
		for (@Pc(12) Class3 local12 = this.aClass338_213.method8177(); local12 != null; local12 = this.aClass338_213.method8168()) {
			if ((long) arg0 == local12.aLong311) {
				return;
			}
		}
		@Pc(37) Class3 local37 = new Class3();
		local37.aLong311 = (long) arg0;
		this.aClass338_213.method8171(local37);
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)I")
	public int method8080() {
		if (this.method8069() == null) {
			return this.aClass3_Sub11_Sub2_1 == null ? 0 : this.aClass3_Sub11_Sub2_1.method2891();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)Lclient!ev;")
	private Class3_Sub11_Sub2 method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub11_Sub2 local13 = (Class3_Sub11_Sub2) this.aClass83_40.method2368((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean238 && local13.aBoolean237) {
			local13.method9380();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass337_6 == null || this.aByteArray97[arg0] == -1) {
					if (this.aClass341_5.method8303()) {
						return null;
					}
					local13 = this.aClass341_5.method8302((byte) 2, true, arg0, this.anInt9241);
				} else {
					local13 = this.aClass240_3.method5739(arg0, this.aClass337_6);
				}
			} else if (arg1 == 1) {
				if (this.aClass337_6 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass240_3.method5738(this.aClass337_6, arg0);
			} else if (arg1 == 2) {
				if (this.aClass337_6 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray97[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass341_5.method8294()) {
					return null;
				}
				local13 = this.aClass341_5.method8302((byte) 2, false, arg0, this.anInt9241);
			} else {
				throw new RuntimeException();
			}
			this.aClass83_40.method2377((long) arg0, local13);
		}
		if (local13.aBoolean237) {
			return null;
		}
		@Pc(153) byte[] local153 = local13.method2889();
		@Pc(188) int local188;
		@Pc(215) byte[] local215;
		@Pc(224) byte[] local224;
		@Pc(226) int local226;
		@Pc(280) Class3_Sub11_Sub2_Sub2 local280;
		if (!(local13 instanceof Class3_Sub11_Sub2_Sub1)) {
			try {
				if (local153 == null || local153.length <= 2) {
					throw new RuntimeException();
				}
				Static19.aCRC32_1.reset();
				Static19.aCRC32_1.update(local153, 0, local153.length - 2);
				local188 = (int) Static19.aCRC32_1.getValue();
				if (local188 != this.aClass37_2.anIntArray88[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass37_2.aByteArrayArray3 != null && this.aClass37_2.aByteArrayArray3[arg0] != null) {
					local215 = this.aClass37_2.aByteArrayArray3[arg0];
					local224 = Static492.method7091(0, local153, local153.length - 2);
					for (local226 = 0; local226 < 64; local226++) {
						if (local215[local226] != local224[local226]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass341_5.anInt9492 = 0;
				this.aClass341_5.anInt9491 = 0;
			} catch (@Pc(255) RuntimeException local255) {
				this.aClass341_5.method8292();
				local13.method9380();
				if (local13.aBoolean238 && !this.aClass341_5.method8303()) {
					local280 = this.aClass341_5.method8302((byte) 2, true, arg0, this.anInt9241);
					this.aClass83_40.method2377((long) arg0, local280);
				}
				return null;
			}
			local153[local153.length - 2] = (byte) (this.aClass37_2.anIntArray91[arg0] >>> 8);
			local153[local153.length - 1] = (byte) this.aClass37_2.anIntArray91[arg0];
			if (this.aClass337_6 != null) {
				this.aClass240_3.method5737(arg0, this.aClass337_6, local153);
				if (this.aByteArray97[arg0] != 1) {
					this.anInt9233++;
					this.aByteArray97[arg0] = 1;
				}
			}
			if (!local13.aBoolean238) {
				local13.method9380();
			}
			return local13;
		}
		try {
			if (local153 == null || local153.length <= 2) {
				throw new RuntimeException();
			}
			Static19.aCRC32_1.reset();
			Static19.aCRC32_1.update(local153, 0, local153.length - 2);
			local188 = (int) Static19.aCRC32_1.getValue();
			if (local188 != this.aClass37_2.anIntArray88[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass37_2.aByteArrayArray3 != null && this.aClass37_2.aByteArrayArray3[arg0] != null) {
				local215 = this.aClass37_2.aByteArrayArray3[arg0];
				local224 = Static492.method7091(0, local153, local153.length - 2);
				for (local226 = 0; local226 < 64; local226++) {
					if (local215[local226] != local224[local226]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(459) int local459 = (local153[local153.length - 1] & 0xFF) + ((local153[local153.length - 2] & 0xFF) << 8);
			if (local459 != (this.aClass37_2.anIntArray91[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray97[arg0] != 1) {
				this.anInt9233++;
				this.aByteArray97[arg0] = 1;
			}
			if (!local13.aBoolean238) {
				local13.method9380();
			}
			return local13;
		} catch (@Pc(502) Exception local502) {
			this.aByteArray97[arg0] = -1;
			local13.method9380();
			if (local13.aBoolean238 && !this.aClass341_5.method8303()) {
				local280 = this.aClass341_5.method8302((byte) 2, true, arg0, this.anInt9241);
				this.aClass83_40.method2377((long) arg0, local280);
			}
			return null;
		}
	}
}
