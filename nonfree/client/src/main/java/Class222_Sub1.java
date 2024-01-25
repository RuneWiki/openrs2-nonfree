import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class222_Sub1 extends Class222 {

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Lclient!ia;")
	private Class162 aClass162_2;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
	private boolean aBoolean597;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	private int anInt8978 = 0;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!qr;")
	private final Class306 aClass306_41 = new Class306(16);

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	private int anInt8993 = 0;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!at;")
	private final Class20 aClass20_50 = new Class20();

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "J")
	private long aLong265 = 0L;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	private final int anInt8976;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "Lclient!dca;")
	private final Class75 aClass75_4;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
	private boolean aBoolean598;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Lclient!at;")
	private Class20 aClass20_51;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "Lclient!mo;")
	private final Class241 aClass241_3;

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "Lclient!qh;")
	private final Class301 aClass301_7;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	private final int anInt8989;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
	private final int anInt8992;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Z")
	private final boolean aBoolean599;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "Lclient!dca;")
	private final Class75 aClass75_3;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "[B")
	private final byte[] aByteArray93;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Lclient!fm;")
	private Class5_Sub1_Sub4 aClass5_Sub1_Sub4_1;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILclient!dca;Lclient!dca;Lclient!mo;Lclient!qh;I[BIZ)V")
	public Class222_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class241 arg3, @OriginalArg(4) Class301 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt8976 = arg0;
		this.aClass75_4 = arg1;
		if (this.aClass75_4 == null) {
			this.aBoolean598 = false;
		} else {
			this.aBoolean598 = true;
			this.aClass20_51 = new Class20();
		}
		this.aClass241_3 = arg3;
		this.aClass301_7 = arg4;
		this.anInt8989 = arg5;
		this.anInt8992 = arg7;
		this.aBoolean599 = arg8;
		this.aClass75_3 = arg2;
		this.aByteArray93 = arg6;
		if (this.aClass75_3 != null) {
			this.aClass5_Sub1_Sub4_1 = this.aClass301_7.method6826(this.anInt8976, this.aClass75_3);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I")
	public int method7709() {
		return this.anInt8978;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBI)Lclient!fm;")
	private Class5_Sub1_Sub4 method7710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(26) Class5_Sub1_Sub4 local26 = (Class5_Sub1_Sub4) this.aClass306_41.method6943((long) arg1);
		if (local26 != null && arg0 == 0 && !local26.aBoolean587 && local26.aBoolean589) {
			local26.method9222();
			local26 = null;
		}
		if (local26 == null) {
			if (arg0 == 0) {
				if (this.aClass75_4 == null || this.aByteArray94[arg1] == -1) {
					if (this.aClass241_3.method5539()) {
						return null;
					}
					local26 = this.aClass241_3.method5532(this.anInt8976, (byte) 2, arg1, true);
				} else {
					local26 = this.aClass301_7.method6826(arg1, this.aClass75_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass75_4 == null) {
					throw new RuntimeException();
				}
				local26 = this.aClass301_7.method6824(arg1, this.aClass75_4);
			} else if (arg0 == 2) {
				if (this.aClass75_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray94[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass241_3.method5540()) {
					return null;
				}
				local26 = this.aClass241_3.method5532(this.anInt8976, (byte) 2, arg1, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass306_41.method6944(local26, (long) arg1, -12002);
		}
		if (local26.aBoolean589) {
			return null;
		}
		@Pc(194) byte[] local194 = local26.method7596();
		@Pc(226) int local226;
		@Pc(256) byte[] local256;
		@Pc(265) byte[] local265;
		@Pc(267) int local267;
		@Pc(324) Class5_Sub1_Sub4_Sub2 local324;
		if (!(local26 instanceof Class5_Sub1_Sub4_Sub1)) {
			try {
				if (local194 == null || local194.length <= 2) {
					throw new RuntimeException();
				}
				Static277.aCRC32_1.reset();
				Static277.aCRC32_1.update(local194, 0, local194.length - 2);
				local226 = (int) Static277.aCRC32_1.getValue();
				if (this.aClass162_2.anIntArray200[arg1] != local226) {
					throw new RuntimeException();
				}
				if (this.aClass162_2.aByteArrayArray11 != null && this.aClass162_2.aByteArrayArray11[arg1] != null) {
					local256 = this.aClass162_2.aByteArrayArray11[arg1];
					local265 = Static645.method8911(local194.length - 2, local194, 0);
					for (local267 = 0; local267 < 64; local267++) {
						if (local256[local267] != local265[local267]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass241_3.anInt6269 = 0;
				this.aClass241_3.anInt6268 = 0;
			} catch (@Pc(297) RuntimeException local297) {
				this.aClass241_3.method5543();
				local26.method9222();
				if (local26.aBoolean587 && !this.aClass241_3.method5539()) {
					local324 = this.aClass241_3.method5532(this.anInt8976, (byte) 2, arg1, true);
					this.aClass306_41.method6944(local324, (long) arg1, -12002);
				}
				return null;
			}
			local194[local194.length - 2] = (byte) (this.aClass162_2.anIntArray201[arg1] >>> 8);
			local194[local194.length - 1] = (byte) this.aClass162_2.anIntArray201[arg1];
			if (this.aClass75_4 != null) {
				this.aClass301_7.method6822(local194, this.aClass75_4, arg1);
				if (this.aByteArray94[arg1] != 1) {
					this.anInt8978++;
					this.aByteArray94[arg1] = 1;
				}
			}
			if (!local26.aBoolean587) {
				local26.method9222();
			}
			return local26;
		}
		try {
			if (local194 == null || local194.length <= 2) {
				throw new RuntimeException();
			}
			Static277.aCRC32_1.reset();
			Static277.aCRC32_1.update(local194, 0, local194.length - 2);
			local226 = (int) Static277.aCRC32_1.getValue();
			if (local226 != this.aClass162_2.anIntArray200[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass162_2.aByteArrayArray11 != null && this.aClass162_2.aByteArrayArray11[arg1] != null) {
				local256 = this.aClass162_2.aByteArrayArray11[arg1];
				local265 = Static645.method8911(local194.length - 2, local194, 0);
				for (local267 = 0; local267 < 64; local267++) {
					if (local256[local267] != local265[local267]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(517) int local517 = ((local194[local194.length - 2] & 0xFF) << 8) + (local194[local194.length - 1] & 0xFF);
			if (local517 != (this.aClass162_2.anIntArray201[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray94[arg1] != 1) {
				this.anInt8978++;
				this.aByteArray94[arg1] = 1;
			}
			if (!local26.aBoolean587) {
				local26.method9222();
			}
			return local26;
		} catch (@Pc(561) Exception local561) {
			this.aByteArray94[arg1] = -1;
			local26.method9222();
			if (local26.aBoolean587 && !this.aClass241_3.method5539()) {
				local324 = this.aClass241_3.method5532(this.anInt8976, (byte) 2, arg1, true);
				this.aClass306_41.method6944(local324, (long) arg1, -12002);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
	public void method7713() {
		if (this.aClass20_51 != null) {
			if (this.method7703() == null) {
				return;
			}
			@Pc(33) boolean local33;
			@Pc(38) Class5 local38;
			@Pc(44) int local44;
			@Pc(143) Class5 local143;
			if (this.aBoolean598) {
				local33 = true;
				for (local38 = this.aClass20_51.method378(); local38 != null; local38 = this.aClass20_51.method366()) {
					local44 = (int) local38.aLong312;
					if (this.aByteArray94[local44] == 0) {
						this.method7710(1, local44);
					}
					if (this.aByteArray94[local44] == 0) {
						local33 = false;
					} else {
						local38.method9222();
					}
				}
				while (this.anInt8993 < this.aClass162_2.anIntArray198.length) {
					if (this.aClass162_2.anIntArray198[this.anInt8993] == 0) {
						this.anInt8993++;
					} else {
						if (this.aClass301_7.anInt7865 >= 250) {
							local33 = false;
							break;
						}
						if (this.aByteArray94[this.anInt8993] == 0) {
							this.method7710(1, this.anInt8993);
						}
						if (this.aByteArray94[this.anInt8993] == 0) {
							local143 = new Class5();
							local143.aLong312 = (long) this.anInt8993;
							local33 = false;
							this.aClass20_51.method370(local143);
						}
						this.anInt8993++;
					}
				}
				if (local33) {
					this.anInt8993 = 0;
					this.aBoolean598 = false;
				}
			} else if (this.aBoolean597) {
				local33 = true;
				for (local38 = this.aClass20_51.method378(); local38 != null; local38 = this.aClass20_51.method366()) {
					local44 = (int) local38.aLong312;
					if (this.aByteArray94[local44] != 1) {
						this.method7710(2, local44);
					}
					if (this.aByteArray94[local44] == 1) {
						local38.method9222();
					} else {
						local33 = false;
					}
				}
				while (this.anInt8993 < this.aClass162_2.anIntArray198.length) {
					if (this.aClass162_2.anIntArray198[this.anInt8993] == 0) {
						this.anInt8993++;
					} else {
						if (this.aClass241_3.method5540()) {
							local33 = false;
							break;
						}
						if (this.aByteArray94[this.anInt8993] != 1) {
							this.method7710(2, this.anInt8993);
						}
						if (this.aByteArray94[this.anInt8993] != 1) {
							local143 = new Class5();
							local143.aLong312 = (long) this.anInt8993;
							local33 = false;
							this.aClass20_51.method370(local143);
						}
						this.anInt8993++;
					}
				}
				if (local33) {
					this.anInt8993 = 0;
					this.aBoolean597 = false;
				}
			} else {
				this.aClass20_51 = null;
			}
		}
		if (!this.aBoolean599 || Static480.method6763() < this.aLong265) {
			return;
		}
		for (@Pc(358) Class5_Sub1_Sub4 local358 = (Class5_Sub1_Sub4) this.aClass306_41.method6941(); local358 != null; local358 = (Class5_Sub1_Sub4) this.aClass306_41.method6940()) {
			if (!local358.aBoolean589) {
				if (local358.aBoolean586) {
					if (!local358.aBoolean587) {
						throw new RuntimeException();
					}
					local358.method9222();
				} else {
					local358.aBoolean586 = true;
				}
			}
		}
		this.aLong265 = Static480.method6763() + 1000L;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
	public int method7714() {
		if (this.aClass162_2 == null) {
			return 0;
		} else if (this.aBoolean598) {
			@Pc(22) Class5 local22 = this.aClass20_51.method378();
			return local22 == null ? 0 : (int) local22.aLong312;
		} else {
			return this.aClass162_2.anInt3979;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method7704(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub1_Sub4 local9 = this.method7710(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method7596();
			local9.method9222();
			return local18;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public void method7716() {
		if (this.aClass20_51 == null || this.method7703() == null) {
			return;
		}
		for (@Pc(26) Class5 local26 = this.aClass20_50.method378(); local26 != null; local26 = this.aClass20_50.method366()) {
			@Pc(32) int local32 = (int) local26.aLong312;
			if (local32 < 0 || local32 >= this.aClass162_2.anInt3981 || this.aClass162_2.anIntArray198[local32] == 0) {
				local26.method9222();
			} else {
				if (this.aByteArray94[local32] == 0) {
					this.method7710(1, local32);
				}
				if (this.aByteArray94[local32] == -1) {
					this.method7710(2, local32);
				}
				if (this.aByteArray94[local32] == 1) {
					local26.method9222();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	@Override
	public void method7708(@OriginalArg(0) int arg0) {
		if (this.aClass75_4 == null) {
			return;
		}
		for (@Pc(15) Class5 local15 = this.aClass20_50.method378(); local15 != null; local15 = this.aClass20_50.method366()) {
			if (local15.aLong312 == (long) arg0) {
				return;
			}
		}
		@Pc(41) Class5 local41 = new Class5();
		local41.aLong312 = (long) arg0;
		this.aClass20_50.method370(local41);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lclient!ia;")
	@Override
	public Class162 method7703() {
		if (this.aClass162_2 != null) {
			return this.aClass162_2;
		}
		if (this.aClass5_Sub1_Sub4_1 == null) {
			if (this.aClass241_3.method5539()) {
				return null;
			}
			this.aClass5_Sub1_Sub4_1 = this.aClass241_3.method5532(255, (byte) 0, this.anInt8976, true);
		}
		if (this.aClass5_Sub1_Sub4_1.aBoolean589) {
			return null;
		}
		@Pc(56) byte[] local56 = this.aClass5_Sub1_Sub4_1.method7596();
		if (this.aClass5_Sub1_Sub4_1 instanceof Class5_Sub1_Sub4_Sub1) {
			try {
				if (local56 == null) {
					throw new RuntimeException();
				}
				this.aClass162_2 = new Class162(local56, this.anInt8989, this.aByteArray93);
				if (this.anInt8992 != this.aClass162_2.anInt3980) {
					throw new RuntimeException();
				}
			} catch (@Pc(93) RuntimeException local93) {
				this.aClass162_2 = null;
				if (this.aClass241_3.method5539()) {
					this.aClass5_Sub1_Sub4_1 = null;
				} else {
					this.aClass5_Sub1_Sub4_1 = this.aClass241_3.method5532(255, (byte) 0, this.anInt8976, true);
				}
				return null;
			}
		} else {
			try {
				if (local56 == null) {
					throw new RuntimeException();
				}
				this.aClass162_2 = new Class162(local56, this.anInt8989, this.aByteArray93);
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass241_3.method5543();
				this.aClass162_2 = null;
				if (this.aClass241_3.method5539()) {
					this.aClass5_Sub1_Sub4_1 = null;
				} else {
					this.aClass5_Sub1_Sub4_1 = this.aClass241_3.method5532(255, (byte) 0, this.anInt8976, true);
				}
				return null;
			}
			if (this.aClass75_3 != null) {
				this.aClass301_7.method6822(local56, this.aClass75_3, this.anInt8976);
			}
		}
		if (this.aClass75_4 != null) {
			this.aByteArray94 = new byte[this.aClass162_2.anInt3981];
			this.anInt8978 = 0;
		}
		this.aClass5_Sub1_Sub4_1 = null;
		return this.aClass162_2;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)I")
	@Override
	public int method7707(@OriginalArg(1) int arg0) {
		@Pc(19) Class5_Sub1_Sub4 local19 = (Class5_Sub1_Sub4) this.aClass306_41.method6943((long) arg0);
		return local19 == null ? 0 : local19.method7594();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public void method7717() {
		if (this.aClass75_4 != null) {
			this.aBoolean597 = true;
			if (this.aClass20_51 == null) {
				this.aClass20_51 = new Class20();
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
	public int method7718() {
		if (this.method7703() == null) {
			return this.aClass5_Sub1_Sub4_1 == null ? 0 : this.aClass5_Sub1_Sub4_1.method7594();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	public int method7719() {
		return this.aClass162_2 == null ? 0 : this.aClass162_2.anInt3979;
	}
}
