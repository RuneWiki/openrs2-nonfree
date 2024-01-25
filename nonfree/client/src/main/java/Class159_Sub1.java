import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "Lclient!uk;")
	private Class202 aClass202_1;

	@OriginalMember(owner = "client!pi", name = "Q", descriptor = "Z")
	private boolean aBoolean338;

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
	private int anInt4652 = 0;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!cs;")
	private final Class42 aClass42_40 = new Class42(16);

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
	private int anInt4654 = 0;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "Lclient!vn;")
	private final Class211 aClass211_22 = new Class211();

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "J")
	private long aLong157 = 0L;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	private final int anInt4647;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "Lclient!wq;")
	private final Class219 aClass219_4;

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "Z")
	private boolean aBoolean337;

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "Lclient!vn;")
	private Class211 aClass211_21;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "Lclient!sj;")
	private final Class185 aClass185_2;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	private final int anInt4637;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "Lclient!wq;")
	private final Class219 aClass219_3;

	@OriginalMember(owner = "client!pi", name = "U", descriptor = "Z")
	private final boolean aBoolean339;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
	private final int anInt4642;

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "Lclient!ah;")
	private final Class7 aClass7_2;

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "Lclient!vp;")
	private Class5_Sub9_Sub3 aClass5_Sub9_Sub3_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(ILclient!wq;Lclient!wq;Lclient!ah;Lclient!sj;IIZ)V")
	public Class159_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class219 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) Class185 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4647 = arg0;
		this.aClass219_4 = arg1;
		if (this.aClass219_4 == null) {
			this.aBoolean337 = false;
		} else {
			this.aBoolean337 = true;
			this.aClass211_21 = new Class211();
		}
		this.aClass185_2 = arg4;
		this.anInt4637 = arg6;
		this.aClass219_3 = arg2;
		this.aBoolean339 = arg7;
		this.anInt4642 = arg5;
		this.aClass7_2 = arg3;
		if (this.aClass219_3 != null) {
			this.aClass5_Sub9_Sub3_1 = this.aClass185_2.method4974(this.anInt4647, this.aClass219_3);
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public void method4072() {
		if (this.aClass211_21 == null || this.method4063() == null) {
			return;
		}
		for (@Pc(21) Class5 local21 = this.aClass211_22.method5608(); local21 != null; local21 = this.aClass211_22.method5603()) {
			@Pc(27) int local27 = (int) local21.aLong218;
			if (local27 < 0 || this.aClass202_1.anInt6065 <= local27 || this.aClass202_1.anIntArray520[local27] == 0) {
				local21.method5803();
			} else {
				if (this.aByteArray68[local27] == 0) {
					this.method4077(local27, 1);
				}
				if (this.aByteArray68[local27] == -1) {
					this.method4077(local27, 2);
				}
				if (this.aByteArray68[local27] == 1) {
					local21.method5803();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
	public void method4073() {
		if (this.aClass219_4 != null) {
			this.aBoolean338 = true;
			if (this.aClass211_21 == null) {
				this.aClass211_21 = new Class211();
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	public void method4074() {
		if (this.aClass211_21 != null) {
			if (this.method4063() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class5 local31;
			@Pc(37) int local37;
			@Pc(131) Class5 local131;
			if (this.aBoolean337) {
				local26 = true;
				for (local31 = this.aClass211_21.method5608(); local31 != null; local31 = this.aClass211_21.method5603()) {
					local37 = (int) local31.aLong218;
					if (this.aByteArray68[local37] == 0) {
						this.method4077(local37, 1);
					}
					if (this.aByteArray68[local37] == 0) {
						local26 = false;
					} else {
						local31.method5803();
					}
				}
				while (this.aClass202_1.anIntArray520.length > this.anInt4654) {
					if (this.aClass202_1.anIntArray520[this.anInt4654] == 0) {
						this.anInt4654++;
					} else {
						if (this.aClass185_2.anInt5612 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray68[this.anInt4654] == 0) {
							this.method4077(this.anInt4654, 1);
						}
						if (this.aByteArray68[this.anInt4654] == 0) {
							local131 = new Class5();
							local131.aLong218 = this.anInt4654;
							local26 = false;
							this.aClass211_21.method5609(local131);
						}
						this.anInt4654++;
					}
				}
				if (local26) {
					this.anInt4654 = 0;
					this.aBoolean337 = false;
				}
			} else if (this.aBoolean338) {
				local26 = true;
				for (local31 = this.aClass211_21.method5608(); local31 != null; local31 = this.aClass211_21.method5603()) {
					local37 = (int) local31.aLong218;
					if (this.aByteArray68[local37] != 1) {
						this.method4077(local37, 2);
					}
					if (this.aByteArray68[local37] == 1) {
						local31.method5803();
					} else {
						local26 = false;
					}
				}
				while (this.aClass202_1.anIntArray520.length > this.anInt4654) {
					if (this.aClass202_1.anIntArray520[this.anInt4654] == 0) {
						this.anInt4654++;
					} else {
						if (this.aClass7_2.method250()) {
							local26 = false;
							break;
						}
						if (this.aByteArray68[this.anInt4654] != 1) {
							this.method4077(this.anInt4654, 2);
						}
						if (this.aByteArray68[this.anInt4654] != 1) {
							local131 = new Class5();
							local131.aLong218 = this.anInt4654;
							local26 = false;
							this.aClass211_21.method5609(local131);
						}
						this.anInt4654++;
					}
				}
				if (local26) {
					this.aBoolean338 = false;
					this.anInt4654 = 0;
				}
			} else {
				this.aClass211_21 = null;
			}
		}
		if (!this.aBoolean339 || Static284.method4783() < this.aLong157) {
			return;
		}
		for (@Pc(318) Class5_Sub9_Sub3 local318 = (Class5_Sub9_Sub3) this.aClass42_40.method1060(); local318 != null; local318 = (Class5_Sub9_Sub3) this.aClass42_40.method1055()) {
			if (!local318.aBoolean408) {
				if (local318.aBoolean409) {
					if (!local318.aBoolean410) {
						throw new RuntimeException();
					}
					local318.method5803();
				} else {
					local318.aBoolean409 = true;
				}
			}
		}
		this.aLong157 = Static284.method4783() + 1000L;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Lclient!uk;")
	@Override
	public Class202 method4063() {
		if (this.aClass202_1 != null) {
			return this.aClass202_1;
		}
		if (this.aClass5_Sub9_Sub3_1 == null) {
			if (this.aClass7_2.method243()) {
				return null;
			}
			this.aClass5_Sub9_Sub3_1 = this.aClass7_2.method248(255, (byte) 0, this.anInt4647, true);
		}
		if (this.aClass5_Sub9_Sub3_1.aBoolean408) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass5_Sub9_Sub3_1.method4725();
		if (this.aClass5_Sub9_Sub3_1 instanceof Class5_Sub9_Sub3_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass202_1 = new Class202(local48, this.anInt4642);
				if (this.anInt4637 != this.aClass202_1.anInt6066) {
					throw new RuntimeException();
				}
			} catch (@Pc(138) RuntimeException local138) {
				this.aClass202_1 = null;
				if (this.aClass7_2.method243()) {
					this.aClass5_Sub9_Sub3_1 = null;
				} else {
					this.aClass5_Sub9_Sub3_1 = this.aClass7_2.method248(255, (byte) 0, this.anInt4647, true);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass202_1 = new Class202(local48, this.anInt4642);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass7_2.method240();
				this.aClass202_1 = null;
				if (this.aClass7_2.method243()) {
					this.aClass5_Sub9_Sub3_1 = null;
				} else {
					this.aClass5_Sub9_Sub3_1 = this.aClass7_2.method248(255, (byte) 0, this.anInt4647, true);
				}
				return null;
			}
			if (this.aClass219_3 != null) {
				this.aClass185_2.method4972(local48, this.anInt4647, this.aClass219_3);
			}
		}
		if (this.aClass219_4 != null) {
			this.aByteArray68 = new byte[this.aClass202_1.anInt6065];
			this.anInt4652 = 0;
		}
		this.aClass5_Sub9_Sub3_1 = null;
		return this.aClass202_1;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I")
	public int method4076() {
		return this.aClass202_1 == null ? 0 : this.aClass202_1.anInt6058;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)Lclient!vp;")
	private Class5_Sub9_Sub3 method4077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub9_Sub3 local13 = (Class5_Sub9_Sub3) this.aClass42_40.method1052((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean410 && local13.aBoolean408) {
			local13.method5803();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass219_4 == null || this.aByteArray68[arg0] == -1) {
					if (this.aClass7_2.method243()) {
						return null;
					}
					local13 = this.aClass7_2.method248(this.anInt4647, (byte) 2, arg0, true);
				} else {
					local13 = this.aClass185_2.method4974(arg0, this.aClass219_4);
				}
			} else if (arg1 == 1) {
				if (this.aClass219_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass185_2.method4970(arg0, this.aClass219_4);
			} else if (arg1 == 2) {
				if (this.aClass219_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray68[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass7_2.method250()) {
					return null;
				}
				local13 = this.aClass7_2.method248(this.anInt4647, (byte) 2, arg0, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass42_40.method1050((long) arg0, local13);
		}
		if (local13.aBoolean408) {
			return null;
		}
		@Pc(165) byte[] local165 = local13.method4725();
		@Pc(194) int local194;
		@Pc(240) Class5_Sub9_Sub3_Sub2 local240;
		if (!(local13 instanceof Class5_Sub9_Sub3_Sub1)) {
			try {
				if (local165 == null || local165.length <= 2) {
					throw new RuntimeException();
				}
				Static232.aCRC32_1.reset();
				Static232.aCRC32_1.update(local165, 0, local165.length - 2);
				local194 = (int) Static232.aCRC32_1.getValue();
				if (local194 != this.aClass202_1.anIntArray518[arg0]) {
					throw new RuntimeException();
				}
				this.aClass7_2.anInt269 = 0;
				this.aClass7_2.anInt270 = 0;
			} catch (@Pc(215) RuntimeException local215) {
				this.aClass7_2.method240();
				local13.method5803();
				if (local13.aBoolean410 && !this.aClass7_2.method243()) {
					local240 = this.aClass7_2.method248(this.anInt4647, (byte) 2, arg0, true);
					this.aClass42_40.method1050((long) arg0, local240);
				}
				return null;
			}
			local165[local165.length - 2] = (byte) (this.aClass202_1.anIntArray521[arg0] >>> 8);
			local165[local165.length - 1] = (byte) this.aClass202_1.anIntArray521[arg0];
			if (this.aClass219_4 != null) {
				this.aClass185_2.method4972(local165, arg0, this.aClass219_4);
				if (this.aByteArray68[arg0] != 1) {
					this.anInt4652++;
					this.aByteArray68[arg0] = 1;
				}
			}
			if (!local13.aBoolean410) {
				local13.method5803();
			}
			return local13;
		}
		try {
			if (local165 == null || local165.length <= 2) {
				throw new RuntimeException();
			}
			Static232.aCRC32_1.reset();
			Static232.aCRC32_1.update(local165, 0, local165.length - 2);
			local194 = (int) Static232.aCRC32_1.getValue();
			if (local194 != this.aClass202_1.anIntArray518[arg0]) {
				throw new RuntimeException();
			}
			@Pc(375) int local375 = (local165[local165.length - 1] & 0xFF) + ((local165[local165.length - 2] & 0xFF) << 8);
			if ((this.aClass202_1.anIntArray521[arg0] & 0xFFFF) != local375) {
				throw new RuntimeException();
			}
			if (this.aByteArray68[arg0] != 1) {
				this.anInt4652++;
				this.aByteArray68[arg0] = 1;
			}
			if (!local13.aBoolean410) {
				local13.method5803();
			}
			return local13;
		} catch (@Pc(416) Exception local416) {
			this.aByteArray68[arg0] = -1;
			local13.method5803();
			if (local13.aBoolean410 && !this.aClass7_2.method243()) {
				local240 = this.aClass7_2.method248(this.anInt4647, (byte) 2, arg0, true);
				this.aClass42_40.method1050((long) arg0, local240);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)I")
	public int method4078() {
		if (this.aClass202_1 == null) {
			return 0;
		} else if (this.aBoolean337) {
			@Pc(20) Class5 local20 = this.aClass211_21.method5608();
			return local20 == null ? 0 : (int) local20.aLong218;
		} else {
			return this.aClass202_1.anInt6058;
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)I")
	public int method4080() {
		if (this.method4063() == null) {
			return this.aClass5_Sub9_Sub3_1 == null ? 0 : this.aClass5_Sub9_Sub3_1.method4722();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I")
	@Override
	public int method4070(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub9_Sub3 local15 = (Class5_Sub9_Sub3) this.aClass42_40.method1052((long) arg0);
		return local15 == null ? 0 : local15.method4722();
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)I")
	public int method4081() {
		return this.anInt4652;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method4064(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub9_Sub3 local9 = this.method4077(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method4725();
			local9.method5803();
			return local17;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	@Override
	public void method4071(@OriginalArg(0) int arg0) {
		if (this.aClass219_4 == null) {
			return;
		}
		for (@Pc(17) Class5 local17 = this.aClass211_22.method5608(); local17 != null; local17 = this.aClass211_22.method5603()) {
			if (local17.aLong218 == (long) arg0) {
				return;
			}
		}
		@Pc(41) Class5 local41 = new Class5();
		local41.aLong218 = arg0;
		this.aClass211_22.method5609(local41);
	}
}
