import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class310 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "Lclient!qo;")
	public Class307 aClass307_1;

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public int anInt8988;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	private int anInt8995;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
	private int anInt8985 = 0;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	private int anInt8981 = 0;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "B")
	public byte aByte137 = 0;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	private int anInt8978 = 0;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public int anInt8987 = -1;

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "Z")
	public boolean aBoolean661 = false;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	private int anInt8984 = 128;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	private int anInt8990 = 128;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	private int anInt8994 = -1;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLclient!js;BLclient!ha;I)Lclient!ka;")
	public Class157 method7502(@OriginalArg(1) Class100 arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) int arg3) {
		return this.method7510(arg2, 0, (Class313) null, (Class313) null, arg0, arg3, 0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!rba;II)V")
	private void method7505(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8995 = arg0.method5272();
		} else if (arg1 == 2) {
			this.anInt8987 = arg0.method5272();
		} else if (arg1 == 4) {
			this.anInt8990 = arg0.method5272();
		} else if (arg1 == 5) {
			this.anInt8984 = arg0.method5272();
		} else if (arg1 == 6) {
			this.anInt8978 = arg0.method5272();
		} else if (arg1 == 7) {
			this.anInt8985 = arg0.method5322(-61);
		} else if (arg1 == 8) {
			this.anInt8981 = arg0.method5322(-99);
		} else if (arg1 == 9) {
			this.aByte137 = 3;
			this.anInt8994 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean661 = true;
		} else if (arg1 == 11) {
			this.aByte137 = 1;
		} else if (arg1 == 12) {
			this.aByte137 = 4;
		} else if (arg1 == 13) {
			this.aByte137 = 5;
		} else if (arg1 == 14) {
			this.aByte137 = 2;
			this.anInt8994 = arg0.method5322(-61) * 256;
		} else if (arg1 == 15) {
			this.aByte137 = 3;
			this.anInt8994 = arg0.method5272();
		} else if (arg1 == 16) {
			this.aByte137 = 3;
			this.anInt8994 = arg0.method5312();
		} else {
			@Pc(165) int local165;
			@Pc(175) int local175;
			if (arg1 == 40) {
				local165 = arg0.method5322(-115);
				this.aShortArray142 = new short[local165];
				this.aShortArray143 = new short[local165];
				for (local175 = 0; local175 < local165; local175++) {
					this.aShortArray143[local175] = (short) arg0.method5272();
					this.aShortArray142[local175] = (short) arg0.method5272();
				}
			} else if (arg1 == 41) {
				local165 = arg0.method5322(-77);
				this.aShortArray144 = new short[local165];
				this.aShortArray145 = new short[local165];
				for (local175 = 0; local175 < local165; local175++) {
					this.aShortArray145[local175] = (short) arg0.method5272();
					this.aShortArray144[local175] = (short) arg0.method5272();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!rba;)V")
	public void method7509(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5322(-104);
			if (local13 == 0) {
				return;
			}
			this.method7505(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLclient!ha;ILclient!s;Lclient!s;Lclient!js;IIIBZ)Lclient!ka;")
	public Class157 method7510(@OriginalArg(1) Class67 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class313 arg2, @OriginalArg(4) Class313 arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) boolean arg9) {
		@Pc(18) boolean local18 = arg9 & this.aByte137 != 0;
		@Pc(20) int local20 = arg5;
		if (arg4 != null) {
			local20 = arg5 | arg4.method8967();
		}
		if (local18) {
			local20 |= this.aByte137 == 3 ? 7 : 2;
		}
		if (this.anInt8984 != 128) {
			local20 |= 0x2;
		}
		if (this.anInt8990 != 128 || this.anInt8978 != 0) {
			local20 |= 0x5;
		}
		@Pc(78) Class338 local78 = this.aClass307_1.aClass338_46;
		@Pc(98) Class157 local98;
		synchronized (this.aClass307_1.aClass338_46) {
			local98 = (Class157) this.aClass307_1.aClass338_46.method8049((long) (this.anInt8988 |= arg0.anInt9130 << 29));
		}
		if (local98 == null || arg0.method7660(local98.ua(), local20) != 0) {
			if (local98 != null) {
				local20 = arg0.method7671(local20, local98.ua());
			}
			@Pc(126) int local126 = local20;
			if (this.aShortArray143 != null) {
				local126 = local20 | 0x4000;
			}
			if (this.aShortArray145 != null) {
				local126 |= 0x8000;
			}
			@Pc(149) Class178 local149 = Static542.method7606(this.aClass307_1.aClass221_136, 0, true, this.anInt8995);
			if (local149 == null) {
				return null;
			}
			if (local149.anInt5137 < 13) {
				local149.method4270();
			}
			local98 = arg0.method7653(local149, local126, this.aClass307_1.anInt8965, this.anInt8985 + 64, this.anInt8981 - -850);
			@Pc(187) int local187;
			if (this.aShortArray143 != null) {
				for (local187 = 0; local187 < this.aShortArray143.length; local187++) {
					local98.ia(this.aShortArray143[local187], this.aShortArray142[local187]);
				}
			}
			if (this.aShortArray145 != null) {
				for (local187 = 0; local187 < this.aShortArray145.length; local187++) {
					local98.aa(this.aShortArray145[local187], this.aShortArray144[local187]);
				}
			}
			local98.s(local20);
			@Pc(245) Class338 local245 = this.aClass307_1.aClass338_46;
			synchronized (this.aClass307_1.aClass338_46) {
				this.aClass307_1.aClass338_46.method8044((long) (this.anInt8988 |= arg0.anInt9130 << 29), local98);
			}
		}
		@Pc(276) Class157 local276 = local98.method5211(arg8, local20, true);
		if (arg4 != null) {
			arg4.method8978(0, local276);
		}
		if (this.anInt8990 != 128 || this.anInt8984 != 128) {
			local276.O(this.anInt8990, this.anInt8984, this.anInt8990);
		}
		if (this.anInt8978 != 0) {
			if (this.anInt8978 == 90) {
				local276.a(4096);
			}
			if (this.anInt8978 == 180) {
				local276.a(8192);
			}
			if (this.anInt8978 == 270) {
				local276.a(12288);
			}
		}
		if (local18) {
			local276.p(this.aByte137, this.anInt8994, arg3, arg2, arg7, arg6, arg1);
		}
		local276.s(arg5);
		return local276;
	}
}
