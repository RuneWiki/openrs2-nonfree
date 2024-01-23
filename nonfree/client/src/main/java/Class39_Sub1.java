import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!on;")
	private Class125 aClass125_2;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	private int anInt1342 = 0;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!tm;")
	private Class163 aClass163_17 = new Class163(16);

	@OriginalMember(owner = "client!ed", name = "L", descriptor = "I")
	private int anInt1360 = 0;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "Lclient!c;")
	private Class17 aClass17_8 = new Class17();

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "J")
	private long aLong51 = 0L;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	private int anInt1350;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!g;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "Lclient!c;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "Lclient!g;")
	private Class55 aClass55_3;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!je;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "I")
	private int anInt1355;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "Lclient!ho;")
	private Class70 aClass70_1;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	private int anInt1351;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "Z")
	private boolean aBoolean78;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!ki;")
	private Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(ILclient!g;Lclient!g;Lclient!ho;Lclient!je;IIZ)V")
	public Class39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1350 = arg0;
		this.aClass55_2 = arg1;
		if (this.aClass55_2 == null) {
			this.aBoolean76 = false;
		} else {
			this.aBoolean76 = true;
			this.aClass17_7 = new Class17();
		}
		this.aClass55_3 = arg2;
		this.aClass82_1 = arg4;
		this.anInt1355 = arg6;
		this.aClass70_1 = arg3;
		this.anInt1351 = arg5;
		this.aBoolean78 = arg7;
		if (this.aClass55_3 != null) {
			this.aClass4_Sub2_Sub1_1 = this.aClass82_1.method2049(this.aClass55_3, this.anInt1350);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	@Override
	public int method1131(@OriginalArg(1) int arg0) {
		@Pc(18) Class4_Sub2_Sub1 local18 = (Class4_Sub2_Sub1) this.aClass163_17.method4188((long) arg0);
		return local18 == null ? 0 : local18.method4498();
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
	public int method1139() {
		return this.aClass125_2 == null ? 0 : this.aClass125_2.anInt4008;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public void method1140() {
		if (this.aClass55_2 != null) {
			this.aBoolean77 = true;
			if (this.aClass17_7 == null) {
				this.aClass17_7 = new Class17();
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public void method1141() {
		if (this.aClass17_7 != null) {
			if (this.method1135() == null) {
				return;
			}
			@Pc(20) boolean local20;
			@Pc(25) Class4 local25;
			@Pc(31) int local31;
			if (this.aBoolean76) {
				local20 = true;
				for (local25 = this.aClass17_7.method613(); local25 != null; local25 = this.aClass17_7.method607()) {
					local31 = (int) local25.aLong211;
					if (this.aByteArray18[local31] == 0) {
						this.method1145(1, local31);
					}
					if (this.aByteArray18[local31] == 0) {
						local20 = false;
					} else {
						local25.method4690();
					}
				}
				while (this.aClass125_2.anIntArray321.length > this.anInt1360) {
					if (this.aClass125_2.anIntArray321[this.anInt1360] == 0) {
						this.anInt1360++;
					} else {
						if (this.aClass82_1.anInt2529 >= 250) {
							local20 = false;
							break;
						}
						if (this.aByteArray18[this.anInt1360] == 0) {
							this.method1145(1, this.anInt1360);
						}
						if (this.aByteArray18[this.anInt1360] == 0) {
							local20 = false;
							local25 = new Class4();
							local25.aLong211 = this.anInt1360;
							this.aClass17_7.method619(local25);
						}
						this.anInt1360++;
					}
				}
				if (local20) {
					this.aBoolean76 = false;
					this.anInt1360 = 0;
				}
			} else if (this.aBoolean77) {
				local20 = true;
				for (local25 = this.aClass17_7.method613(); local25 != null; local25 = this.aClass17_7.method607()) {
					local31 = (int) local25.aLong211;
					if (this.aByteArray18[local31] != 1) {
						this.method1145(2, local31);
					}
					if (this.aByteArray18[local31] == 1) {
						local25.method4690();
					} else {
						local20 = false;
					}
				}
				while (this.aClass125_2.anIntArray321.length > this.anInt1360) {
					if (this.aClass125_2.anIntArray321[this.anInt1360] == 0) {
						this.anInt1360++;
					} else {
						if (this.aClass70_1.method1842()) {
							local20 = false;
							break;
						}
						if (this.aByteArray18[this.anInt1360] != 1) {
							this.method1145(2, this.anInt1360);
						}
						if (this.aByteArray18[this.anInt1360] != 1) {
							local20 = false;
							local25 = new Class4();
							local25.aLong211 = this.anInt1360;
							this.aClass17_7.method619(local25);
						}
						this.anInt1360++;
					}
				}
				if (local20) {
					this.anInt1360 = 0;
					this.aBoolean77 = false;
				}
			} else {
				this.aClass17_7 = null;
			}
		}
		if (!this.aBoolean78 || Static61.method1150() < this.aLong51) {
			return;
		}
		for (@Pc(336) Class4_Sub2_Sub1 local336 = (Class4_Sub2_Sub1) this.aClass163_17.method4192(); local336 != null; local336 = (Class4_Sub2_Sub1) this.aClass163_17.method4183()) {
			if (!local336.aBoolean388) {
				if (local336.aBoolean387) {
					if (!local336.aBoolean389) {
						throw new RuntimeException();
					}
					local336.method4690();
				} else {
					local336.aBoolean387 = true;
				}
			}
		}
		this.aLong51 = Static61.method1150() + 1000L;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lclient!on;")
	@Override
	public Class125 method1135() {
		if (this.aClass125_2 != null) {
			return this.aClass125_2;
		}
		if (this.aClass4_Sub2_Sub1_1 == null) {
			if (this.aClass70_1.method1838()) {
				return null;
			}
			this.aClass4_Sub2_Sub1_1 = this.aClass70_1.method1833(255, true, (byte) 0, this.anInt1350);
		}
		if (this.aClass4_Sub2_Sub1_1.aBoolean388) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass4_Sub2_Sub1_1.method4495();
		if (this.aClass4_Sub2_Sub1_1 instanceof Class4_Sub2_Sub1_Sub1) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass125_2 = new Class125(local51, this.anInt1351);
				if (this.anInt1355 != this.aClass125_2.anInt4009) {
					throw new RuntimeException();
				}
			} catch (@Pc(81) RuntimeException local81) {
				this.aClass125_2 = null;
				if (this.aClass70_1.method1838()) {
					this.aClass4_Sub2_Sub1_1 = null;
				} else {
					this.aClass4_Sub2_Sub1_1 = this.aClass70_1.method1833(255, true, (byte) 0, this.anInt1350);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass125_2 = new Class125(local51, this.anInt1351);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass70_1.method1835();
				this.aClass125_2 = null;
				if (this.aClass70_1.method1838()) {
					this.aClass4_Sub2_Sub1_1 = null;
				} else {
					this.aClass4_Sub2_Sub1_1 = this.aClass70_1.method1833(255, true, (byte) 0, this.anInt1350);
				}
				return null;
			}
			if (this.aClass55_3 != null) {
				this.aClass82_1.method2053(this.anInt1350, local51, this.aClass55_3);
			}
		}
		this.aClass4_Sub2_Sub1_1 = null;
		if (this.aClass55_2 != null) {
			this.aByteArray18 = new byte[this.aClass125_2.anInt4007];
			this.anInt1342 = 0;
		}
		return this.aClass125_2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	@Override
	public void method1132(@OriginalArg(1) int arg0) {
		if (this.aClass55_2 == null) {
			return;
		}
		@Pc(25) Class4 local25;
		for (local25 = this.aClass17_8.method613(); local25 != null; local25 = this.aClass17_8.method607()) {
			if (local25.aLong211 == (long) arg0) {
				return;
			}
		}
		local25 = new Class4();
		local25.aLong211 = arg0;
		this.aClass17_8.method619(local25);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method1133(@OriginalArg(0) int arg0) {
		@Pc(5) Class4_Sub2_Sub1 local5 = this.method1145(0, arg0);
		if (local5 == null) {
			return null;
		} else {
			@Pc(27) byte[] local27 = local5.method4495();
			local5.method4690();
			return local27;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
	public void method1143() {
		if (this.aClass17_7 == null || this.method1135() == null) {
			return;
		}
		for (@Pc(26) Class4 local26 = this.aClass17_8.method613(); local26 != null; local26 = this.aClass17_8.method607()) {
			@Pc(33) int local33 = (int) local26.aLong211;
			if (local33 < 0 || this.aClass125_2.anInt4007 <= local33 || this.aClass125_2.anIntArray321[local33] == 0) {
				local26.method4690();
			} else {
				if (this.aByteArray18[local33] == 0) {
					this.method1145(1, local33);
				}
				if (this.aByteArray18[local33] == -1) {
					this.method1145(2, local33);
				}
				if (this.aByteArray18[local33] == 1) {
					local26.method4690();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZI)Lclient!ki;")
	private Class4_Sub2_Sub1 method1145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub2_Sub1 local13 = (Class4_Sub2_Sub1) this.aClass163_17.method4188((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean389 && local13.aBoolean388) {
			local13.method4690();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass55_2 == null || this.aByteArray18[arg1] == -1) {
					if (this.aClass70_1.method1838()) {
						return null;
					}
					local13 = this.aClass70_1.method1833(this.anInt1350, true, (byte) 2, arg1);
				} else {
					local13 = this.aClass82_1.method2049(this.aClass55_2, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass55_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass82_1.method2054(this.aClass55_2, arg1);
			} else if (arg0 == 2) {
				if (this.aClass55_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray18[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass70_1.method1842()) {
					return null;
				}
				local13 = this.aClass70_1.method1833(this.anInt1350, false, (byte) 2, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass163_17.method4181((long) arg1, local13);
		}
		if (local13.aBoolean388) {
			return null;
		}
		@Pc(165) byte[] local165 = local13.method4495();
		@Pc(199) int local199;
		@Pc(249) Class4_Sub2_Sub1_Sub2 local249;
		if (!(local13 instanceof Class4_Sub2_Sub1_Sub1)) {
			try {
				if (local165 == null || local165.length <= 2) {
					throw new RuntimeException();
				}
				Static181.aCRC32_34.reset();
				Static181.aCRC32_34.update(local165, 0, local165.length - 2);
				local199 = (int) Static181.aCRC32_34.getValue();
				if (local199 != this.aClass125_2.anIntArray318[arg1]) {
					throw new RuntimeException();
				}
				this.aClass70_1.anInt2165 = 0;
				this.aClass70_1.anInt2166 = 0;
			} catch (@Pc(224) RuntimeException local224) {
				this.aClass70_1.method1835();
				local13.method4690();
				if (local13.aBoolean389 && !this.aClass70_1.method1838()) {
					local249 = this.aClass70_1.method1833(this.anInt1350, true, (byte) 2, arg1);
					this.aClass163_17.method4181((long) arg1, local249);
				}
				return null;
			}
			local165[local165.length - 2] = (byte) (this.aClass125_2.anIntArray323[arg1] >>> 8);
			local165[local165.length - 1] = (byte) this.aClass125_2.anIntArray323[arg1];
			if (this.aClass55_2 != null) {
				this.aClass82_1.method2053(arg1, local165, this.aClass55_2);
				if (this.aByteArray18[arg1] != 1) {
					this.anInt1342++;
					this.aByteArray18[arg1] = 1;
				}
			}
			if (!local13.aBoolean389) {
				local13.method4690();
			}
			return local13;
		}
		try {
			if (local165 == null || local165.length <= 2) {
				throw new RuntimeException();
			}
			Static181.aCRC32_34.reset();
			Static181.aCRC32_34.update(local165, 0, local165.length - 2);
			local199 = (int) Static181.aCRC32_34.getValue();
			if (local199 != this.aClass125_2.anIntArray318[arg1]) {
				throw new RuntimeException();
			}
			@Pc(384) int local384 = (local165[local165.length - 1] & 0xFF) + ((local165[local165.length - 2] & 0xFF) << 8);
			if (local384 != (this.aClass125_2.anIntArray323[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray18[arg1] != 1) {
				if (this.aByteArray18[arg1] != 0) {
				}
				this.anInt1342++;
				this.aByteArray18[arg1] = 1;
			}
			if (!local13.aBoolean389) {
				local13.method4690();
			}
			return local13;
		} catch (@Pc(430) Exception local430) {
			this.aByteArray18[arg1] = -1;
			local13.method4690();
			if (local13.aBoolean389 && !this.aClass70_1.method1838()) {
				local249 = this.aClass70_1.method1833(this.anInt1350, true, (byte) 2, arg1);
				this.aClass163_17.method4181((long) arg1, local249);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)I")
	public int method1146() {
		return this.anInt1342;
	}

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)I")
	public int method1147() {
		if (this.method1135() == null) {
			return this.aClass4_Sub2_Sub1_1 == null ? 0 : this.aClass4_Sub2_Sub1_1.method4498();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)I")
	public int method1148() {
		if (this.aClass125_2 == null) {
			return 0;
		} else if (this.aBoolean76) {
			@Pc(21) Class4 local21 = this.aClass17_7.method613();
			return local21 == null ? 0 : (int) local21.aLong211;
		} else {
			return this.aClass125_2.anInt4008;
		}
	}
}
