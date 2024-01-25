import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public final class Class251_Sub1 extends Class251 {

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "Lclient!ds;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!pda", name = "G", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!pda", name = "S", descriptor = "Z")
	private boolean aBoolean542;

	@OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
	private int anInt7007 = 0;

	@OriginalMember(owner = "client!pda", name = "D", descriptor = "Lclient!il;")
	private final Class162 aClass162_27 = new Class162(16);

	@OriginalMember(owner = "client!pda", name = "Q", descriptor = "I")
	private int anInt7023 = 0;

	@OriginalMember(owner = "client!pda", name = "P", descriptor = "Lclient!ae;")
	private final Class8 aClass8_41 = new Class8();

	@OriginalMember(owner = "client!pda", name = "U", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
	private final int anInt7012;

	@OriginalMember(owner = "client!pda", name = "N", descriptor = "Lclient!lf;")
	private final Class207 aClass207_4;

	@OriginalMember(owner = "client!pda", name = "O", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!pda", name = "R", descriptor = "Lclient!ae;")
	private Class8 aClass8_42;

	@OriginalMember(owner = "client!pda", name = "T", descriptor = "Z")
	private final boolean aBoolean543;

	@OriginalMember(owner = "client!pda", name = "B", descriptor = "Lclient!lf;")
	private final Class207 aClass207_3;

	@OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
	private final int anInt7018;

	@OriginalMember(owner = "client!pda", name = "M", descriptor = "Lclient!th;")
	private final Class319 aClass319_3;

	@OriginalMember(owner = "client!pda", name = "H", descriptor = "Lclient!uaa;")
	private final Class327 aClass327_3;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
	private final int anInt7006;

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "[B")
	private final byte[] aByteArray71;

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "Lclient!ft;")
	private Class2_Sub3_Sub5 aClass2_Sub3_Sub5_1;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILclient!lf;Lclient!lf;Lclient!uaa;Lclient!th;I[BIZ)V")
	public Class251_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) Class319 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt7012 = arg0;
		this.aClass207_4 = arg1;
		if (this.aClass207_4 == null) {
			this.aBoolean541 = false;
		} else {
			this.aBoolean541 = true;
			this.aClass8_42 = new Class8();
		}
		this.aBoolean543 = arg8;
		this.aClass207_3 = arg2;
		this.anInt7018 = arg7;
		this.aClass319_3 = arg4;
		this.aClass327_3 = arg3;
		this.anInt7006 = arg5;
		this.aByteArray71 = arg6;
		if (this.aClass207_3 != null) {
			this.aClass2_Sub3_Sub5_1 = this.aClass319_3.method7080(this.aClass207_3, this.anInt7012);
		}
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)I")
	public int method5863() {
		if (this.method5860() == null) {
			return this.aClass2_Sub3_Sub5_1 == null ? 0 : this.aClass2_Sub3_Sub5_1.method5299();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(B)V")
	public void method5864() {
		if (this.aClass207_4 != null) {
			this.aBoolean542 = true;
			if (this.aClass8_42 == null) {
				this.aClass8_42 = new Class8();
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V")
	public void method5865() {
		if (this.aClass8_42 == null || this.method5860() == null) {
			return;
		}
		for (@Pc(19) Class2 local19 = this.aClass8_41.method210(); local19 != null; local19 = this.aClass8_41.method218()) {
			@Pc(25) int local25 = (int) local19.aLong268;
			if (local25 < 0 || this.aClass85_1.anInt2074 <= local25 || this.aClass85_1.anIntArray117[local25] == 0) {
				local19.method7966();
			} else {
				if (this.aByteArray72[local25] == 0) {
					this.method5866(local25, 1);
				}
				if (this.aByteArray72[local25] == -1) {
					this.method5866(local25, 2);
				}
				if (this.aByteArray72[local25] == 1) {
					local19.method7966();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)Lclient!ft;")
	private Class2_Sub3_Sub5 method5866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub3_Sub5 local13 = (Class2_Sub3_Sub5) this.aClass162_27.method3519((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean499 && local13.aBoolean501) {
			local13.method7966();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass207_4 == null || this.aByteArray72[arg0] == -1) {
					if (this.aClass327_3.method7232()) {
						return null;
					}
					local13 = this.aClass327_3.method7221(arg0, this.anInt7012, true, (byte) 2);
				} else {
					local13 = this.aClass319_3.method7080(this.aClass207_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass207_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass319_3.method7078(arg0, this.aClass207_4);
			} else if (arg1 == 2) {
				if (this.aClass207_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray72[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass327_3.method7230()) {
					return null;
				}
				local13 = this.aClass327_3.method7221(arg0, this.anInt7012, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass162_27.method3522(local13, (long) arg0);
		}
		if (local13.aBoolean501) {
			return null;
		}
		@Pc(159) byte[] local159 = local13.method5301();
		@Pc(188) int local188;
		@Pc(215) byte[] local215;
		@Pc(224) byte[] local224;
		@Pc(226) int local226;
		@Pc(278) Class2_Sub3_Sub5_Sub2 local278;
		if (!(local13 instanceof Class2_Sub3_Sub5_Sub1)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static535.aCRC32_1.reset();
				Static535.aCRC32_1.update(local159, 0, local159.length - 2);
				local188 = (int) Static535.aCRC32_1.getValue();
				if (this.aClass85_1.anIntArray116[arg0] != local188) {
					throw new RuntimeException();
				}
				if (this.aClass85_1.aByteArrayArray7 != null && this.aClass85_1.aByteArrayArray7[arg0] != null) {
					local215 = this.aClass85_1.aByteArrayArray7[arg0];
					local224 = Static1.method1(local159.length - 2, local159, 0);
					for (local226 = 0; local226 < 64; local226++) {
						if (local215[local226] != local224[local226]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass327_3.anInt8672 = 0;
				this.aClass327_3.anInt8671 = 0;
			} catch (@Pc(253) RuntimeException local253) {
				this.aClass327_3.method7227();
				local13.method7966();
				if (local13.aBoolean499 && !this.aClass327_3.method7232()) {
					local278 = this.aClass327_3.method7221(arg0, this.anInt7012, true, (byte) 2);
					this.aClass162_27.method3522(local278, (long) arg0);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass85_1.anIntArray112[arg0] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass85_1.anIntArray112[arg0];
			if (this.aClass207_4 != null) {
				this.aClass319_3.method7079(local159, this.aClass207_4, arg0);
				if (this.aByteArray72[arg0] != 1) {
					this.anInt7007++;
					this.aByteArray72[arg0] = 1;
				}
			}
			if (!local13.aBoolean499) {
				local13.method7966();
			}
			return local13;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static535.aCRC32_1.reset();
			Static535.aCRC32_1.update(local159, 0, local159.length - 2);
			local188 = (int) Static535.aCRC32_1.getValue();
			if (local188 != this.aClass85_1.anIntArray116[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass85_1.aByteArrayArray7 != null && this.aClass85_1.aByteArrayArray7[arg0] != null) {
				local215 = this.aClass85_1.aByteArrayArray7[arg0];
				local224 = Static1.method1(local159.length - 2, local159, 0);
				for (local226 = 0; local226 < 64; local226++) {
					if (local215[local226] != local224[local226]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(453) int local453 = ((local159[local159.length - 2] & 0xFF) << 8) + (local159[local159.length - 1] & 0xFF);
			if ((this.aClass85_1.anIntArray112[arg0] & 0xFFFF) != local453) {
				throw new RuntimeException();
			}
			if (this.aByteArray72[arg0] != 1) {
				this.anInt7007++;
				this.aByteArray72[arg0] = 1;
			}
			if (!local13.aBoolean499) {
				local13.method7966();
			}
			return local13;
		} catch (@Pc(498) Exception local498) {
			this.aByteArray72[arg0] = -1;
			local13.method7966();
			if (local13.aBoolean499 && !this.aClass327_3.method7232()) {
				local278 = this.aClass327_3.method7221(arg0, this.anInt7012, true, (byte) 2);
				this.aClass162_27.method3522(local278, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)I")
	public int method5867() {
		return this.anInt7007;
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)V")
	public void method5868() {
		if (this.aClass8_42 != null) {
			if (this.method5860() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class2 local31;
			@Pc(37) int local37;
			@Pc(126) Class2 local126;
			if (this.aBoolean541) {
				local26 = true;
				for (local31 = this.aClass8_42.method210(); local31 != null; local31 = this.aClass8_42.method218()) {
					local37 = (int) local31.aLong268;
					if (this.aByteArray72[local37] == 0) {
						this.method5866(local37, 1);
					}
					if (this.aByteArray72[local37] == 0) {
						local26 = false;
					} else {
						local31.method7966();
					}
				}
				while (this.aClass85_1.anIntArray117.length > this.anInt7023) {
					if (this.aClass85_1.anIntArray117[this.anInt7023] == 0) {
						this.anInt7023++;
					} else {
						if (this.aClass319_3.anInt8522 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray72[this.anInt7023] == 0) {
							this.method5866(this.anInt7023, 1);
						}
						if (this.aByteArray72[this.anInt7023] == 0) {
							local126 = new Class2();
							local126.aLong268 = this.anInt7023;
							this.aClass8_42.method212(local126);
							local26 = false;
						}
						this.anInt7023++;
					}
				}
				if (local26) {
					this.anInt7023 = 0;
					this.aBoolean541 = false;
				}
			} else if (this.aBoolean542) {
				local26 = true;
				for (local31 = this.aClass8_42.method210(); local31 != null; local31 = this.aClass8_42.method218()) {
					local37 = (int) local31.aLong268;
					if (this.aByteArray72[local37] != 1) {
						this.method5866(local37, 2);
					}
					if (this.aByteArray72[local37] == 1) {
						local31.method7966();
					} else {
						local26 = false;
					}
				}
				while (this.aClass85_1.anIntArray117.length > this.anInt7023) {
					if (this.aClass85_1.anIntArray117[this.anInt7023] == 0) {
						this.anInt7023++;
					} else {
						if (this.aClass327_3.method7230()) {
							local26 = false;
							break;
						}
						if (this.aByteArray72[this.anInt7023] != 1) {
							this.method5866(this.anInt7023, 2);
						}
						if (this.aByteArray72[this.anInt7023] != 1) {
							local126 = new Class2();
							local126.aLong268 = this.anInt7023;
							this.aClass8_42.method212(local126);
							local26 = false;
						}
						this.anInt7023++;
					}
				}
				if (local26) {
					this.aBoolean542 = false;
					this.anInt7023 = 0;
				}
			} else {
				this.aClass8_42 = null;
			}
		}
		if (!this.aBoolean543 || Static548.method7437() < this.aLong195) {
			return;
		}
		for (@Pc(320) Class2_Sub3_Sub5 local320 = (Class2_Sub3_Sub5) this.aClass162_27.method3527(); local320 != null; local320 = (Class2_Sub3_Sub5) this.aClass162_27.method3523()) {
			if (!local320.aBoolean501) {
				if (local320.aBoolean500) {
					if (!local320.aBoolean499) {
						throw new RuntimeException();
					}
					local320.method7966();
				} else {
					local320.aBoolean500 = true;
				}
			}
		}
		this.aLong195 = Static548.method7437() + 1000L;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z)I")
	public int method5870() {
		if (this.aClass85_1 == null) {
			return 0;
		} else if (this.aBoolean541) {
			@Pc(20) Class2 local20 = this.aClass8_42.method210();
			return local20 == null ? 0 : (int) local20.aLong268;
		} else {
			return this.aClass85_1.anInt2076;
		}
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(Z)I")
	public int method5871() {
		return this.aClass85_1 == null ? 0 : this.aClass85_1.anInt2076;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Lclient!ds;")
	@Override
	public Class85 method5860() {
		if (this.aClass85_1 != null) {
			return this.aClass85_1;
		}
		if (this.aClass2_Sub3_Sub5_1 == null) {
			if (this.aClass327_3.method7232()) {
				return null;
			}
			this.aClass2_Sub3_Sub5_1 = this.aClass327_3.method7221(this.anInt7012, 255, true, (byte) 0);
		}
		if (this.aClass2_Sub3_Sub5_1.aBoolean501) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass2_Sub3_Sub5_1.method5301();
		if (this.aClass2_Sub3_Sub5_1 instanceof Class2_Sub3_Sub5_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass85_1 = new Class85(local50, this.anInt7006, this.aByteArray71);
				if (this.anInt7018 != this.aClass85_1.anInt2073) {
					throw new RuntimeException();
				}
			} catch (@Pc(146) RuntimeException local146) {
				this.aClass85_1 = null;
				if (this.aClass327_3.method7232()) {
					this.aClass2_Sub3_Sub5_1 = null;
				} else {
					this.aClass2_Sub3_Sub5_1 = this.aClass327_3.method7221(this.anInt7012, 255, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass85_1 = new Class85(local50, this.anInt7006, this.aByteArray71);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass327_3.method7227();
				this.aClass85_1 = null;
				if (this.aClass327_3.method7232()) {
					this.aClass2_Sub3_Sub5_1 = null;
				} else {
					this.aClass2_Sub3_Sub5_1 = this.aClass327_3.method7221(this.anInt7012, 255, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass207_3 != null) {
				this.aClass319_3.method7079(local50, this.aClass207_3, this.anInt7012);
			}
		}
		if (this.aClass207_4 != null) {
			this.anInt7007 = 0;
			this.aByteArray72 = new byte[this.aClass85_1.anInt2074];
		}
		this.aClass2_Sub3_Sub5_1 = null;
		return this.aClass85_1;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)V")
	@Override
	public void method5854(@OriginalArg(1) int arg0) {
		if (this.aClass207_4 == null) {
			return;
		}
		for (@Pc(20) Class2 local20 = this.aClass8_41.method210(); local20 != null; local20 = this.aClass8_41.method218()) {
			if ((long) arg0 == local20.aLong268) {
				return;
			}
		}
		@Pc(44) Class2 local44 = new Class2();
		local44.aLong268 = arg0;
		this.aClass8_41.method212(local44);
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method5855(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub3_Sub5 local14 = this.method5866(arg0, 0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method5301();
			local14.method7966();
			return local22;
		}
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(II)I")
	@Override
	public int method5861(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub3_Sub5 local17 = (Class2_Sub3_Sub5) this.aClass162_27.method3519((long) arg0);
		return local17 == null ? 0 : local17.method5299();
	}
}
