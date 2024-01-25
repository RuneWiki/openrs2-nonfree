import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!uo;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Z")
	private boolean aBoolean198;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	private int anInt3117 = 0;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!lb;")
	private final Class174 aClass174_6 = new Class174(16);

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	private int anInt3121 = 0;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "Lclient!bu;")
	private final Class38 aClass38_25 = new Class38();

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "J")
	private long aLong81 = 0L;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "Lclient!cw;")
	private final Class51 aClass51_2;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	private final int anInt3113;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Lclient!bu;")
	private Class38 aClass38_24;

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!je;")
	private final Class147 aClass147_1;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "[B")
	private final byte[] aByteArray41;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	private final int anInt3116;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "Z")
	private final boolean aBoolean200;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!cw;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	private final int anInt3107;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!hca;")
	private final Class115 aClass115_1;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!sda;")
	private Class1_Sub1_Sub11 aClass1_Sub1_Sub11_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILclient!cw;Lclient!cw;Lclient!hca;Lclient!je;I[BIZ)V")
	public Class87_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(4) Class147 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass51_2 = arg1;
		this.anInt3113 = arg0;
		if (this.aClass51_2 == null) {
			this.aBoolean199 = false;
		} else {
			this.aBoolean199 = true;
			this.aClass38_24 = new Class38();
		}
		this.aClass147_1 = arg4;
		this.aByteArray41 = arg6;
		this.anInt3116 = arg7;
		this.aBoolean200 = arg8;
		this.aClass51_1 = arg2;
		this.anInt3107 = arg5;
		this.aClass115_1 = arg3;
		if (this.aClass51_1 != null) {
			this.aClass1_Sub1_Sub11_1 = this.aClass147_1.method3951(this.aClass51_1, this.anInt3113);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public void method2842() {
		if (this.aClass38_24 == null || this.method2837() == null) {
			return;
		}
		for (@Pc(17) Class1 local17 = this.aClass38_25.method1419(); local17 != null; local17 = this.aClass38_25.method1415()) {
			@Pc(22) int local22 = (int) local17.aLong244;
			if (local22 < 0 || local22 >= this.aClass293_1.anInt8408 || this.aClass293_1.anIntArray656[local22] == 0) {
				local17.method7983();
			} else {
				if (this.aByteArray42[local22] == 0) {
					this.method2845(local22, 1);
				}
				if (this.aByteArray42[local22] == -1) {
					this.method2845(local22, 2);
				}
				if (this.aByteArray42[local22] == 1) {
					local17.method7983();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public void method2843() {
		if (this.aClass38_24 != null) {
			if (this.method2837() == null) {
				return;
			}
			@Pc(31) boolean local31;
			@Pc(36) Class1 local36;
			@Pc(41) int local41;
			@Pc(126) Class1 local126;
			if (this.aBoolean199) {
				local31 = true;
				for (local36 = this.aClass38_24.method1419(); local36 != null; local36 = this.aClass38_24.method1415()) {
					local41 = (int) local36.aLong244;
					if (this.aByteArray42[local41] == 0) {
						this.method2845(local41, 1);
					}
					if (this.aByteArray42[local41] == 0) {
						local31 = false;
					} else {
						local36.method7983();
					}
				}
				while (this.anInt3121 < this.aClass293_1.anIntArray656.length) {
					if (this.aClass293_1.anIntArray656[this.anInt3121] == 0) {
						this.anInt3121++;
					} else {
						if (this.aClass147_1.anInt4523 >= 250) {
							local31 = false;
							break;
						}
						if (this.aByteArray42[this.anInt3121] == 0) {
							this.method2845(this.anInt3121, 1);
						}
						if (this.aByteArray42[this.anInt3121] == 0) {
							local126 = new Class1();
							local126.aLong244 = this.anInt3121;
							local31 = false;
							this.aClass38_24.method1426(local126);
						}
						this.anInt3121++;
					}
				}
				if (local31) {
					this.aBoolean199 = false;
					this.anInt3121 = 0;
				}
			} else if (this.aBoolean198) {
				local31 = true;
				for (local36 = this.aClass38_24.method1419(); local36 != null; local36 = this.aClass38_24.method1415()) {
					local41 = (int) local36.aLong244;
					if (this.aByteArray42[local41] != 1) {
						this.method2845(local41, 2);
					}
					if (this.aByteArray42[local41] == 1) {
						local36.method7983();
					} else {
						local31 = false;
					}
				}
				while (this.aClass293_1.anIntArray656.length > this.anInt3121) {
					if (this.aClass293_1.anIntArray656[this.anInt3121] == 0) {
						this.anInt3121++;
					} else {
						if (this.aClass115_1.method3354()) {
							local31 = false;
							break;
						}
						if (this.aByteArray42[this.anInt3121] != 1) {
							this.method2845(this.anInt3121, 2);
						}
						if (this.aByteArray42[this.anInt3121] != 1) {
							local126 = new Class1();
							local126.aLong244 = this.anInt3121;
							local31 = false;
							this.aClass38_24.method1426(local126);
						}
						this.anInt3121++;
					}
				}
				if (local31) {
					this.anInt3121 = 0;
					this.aBoolean198 = false;
				}
			} else {
				this.aClass38_24 = null;
			}
		}
		if (!this.aBoolean200 || Static93.method2172() < this.aLong81) {
			return;
		}
		for (@Pc(308) Class1_Sub1_Sub11 local308 = (Class1_Sub1_Sub11) this.aClass174_6.method4421(); local308 != null; local308 = (Class1_Sub1_Sub11) this.aClass174_6.method4429()) {
			if (!local308.aBoolean562) {
				if (local308.aBoolean561) {
					if (!local308.aBoolean563) {
						throw new RuntimeException();
					}
					local308.method7983();
				} else {
					local308.aBoolean561 = true;
				}
			}
		}
		this.aLong81 = Static93.method2172() + 1000L;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)I")
	public int method2844() {
		if (this.aClass293_1 == null) {
			return 0;
		} else if (this.aBoolean199) {
			@Pc(25) Class1 local25 = this.aClass38_24.method1419();
			return local25 == null ? 0 : (int) local25.aLong244;
		} else {
			return this.aClass293_1.anInt8406;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)Lclient!sda;")
	private Class1_Sub1_Sub11 method2845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class1_Sub1_Sub11 local16 = (Class1_Sub1_Sub11) this.aClass174_6.method4422((long) arg0);
		if (local16 != null && arg1 == 0 && !local16.aBoolean563 && local16.aBoolean562) {
			local16.method7983();
			local16 = null;
		}
		if (local16 == null) {
			if (arg1 == 0) {
				if (this.aClass51_2 == null || this.aByteArray42[arg0] == -1) {
					if (this.aClass115_1.method3353()) {
						return null;
					}
					local16 = this.aClass115_1.method3355(arg0, this.anInt3113, true, (byte) 2);
				} else {
					local16 = this.aClass147_1.method3951(this.aClass51_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass51_2 == null) {
					throw new RuntimeException();
				}
				local16 = this.aClass147_1.method3955(arg0, this.aClass51_2);
			} else if (arg1 == 2) {
				if (this.aClass51_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray42[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass115_1.method3354()) {
					return null;
				}
				local16 = this.aClass115_1.method3355(arg0, this.anInt3113, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass174_6.method4420(local16, (long) arg0);
		}
		if (local16.aBoolean562) {
			return null;
		}
		@Pc(148) byte[] local148 = local16.method6987();
		@Pc(175) int local175;
		@Pc(202) byte[] local202;
		@Pc(213) byte[] local213;
		@Pc(215) int local215;
		@Pc(266) Class1_Sub1_Sub11_Sub2 local266;
		if (!(local16 instanceof Class1_Sub1_Sub11_Sub1)) {
			try {
				if (local148 == null || local148.length <= 2) {
					throw new RuntimeException();
				}
				Static142.aCRC32_2.reset();
				Static142.aCRC32_2.update(local148, 0, local148.length - 2);
				local175 = (int) Static142.aCRC32_2.getValue();
				if (local175 != this.aClass293_1.anIntArray659[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass293_1.aByteArrayArray31 != null && this.aClass293_1.aByteArrayArray31[arg0] != null) {
					local202 = this.aClass293_1.aByteArrayArray31[arg0];
					local213 = Static528.method7532(local148, local148.length - 2, 0);
					for (local215 = 0; local215 < 64; local215++) {
						if (local202[local215] != local213[local215]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass115_1.anInt3776 = 0;
				this.aClass115_1.anInt3777 = 0;
			} catch (@Pc(241) RuntimeException local241) {
				this.aClass115_1.method3360();
				local16.method7983();
				if (local16.aBoolean563 && !this.aClass115_1.method3353()) {
					local266 = this.aClass115_1.method3355(arg0, this.anInt3113, true, (byte) 2);
					this.aClass174_6.method4420(local266, (long) arg0);
				}
				return null;
			}
			local148[local148.length - 2] = (byte) (this.aClass293_1.anIntArray658[arg0] >>> 8);
			local148[local148.length - 1] = (byte) this.aClass293_1.anIntArray658[arg0];
			if (this.aClass51_2 != null) {
				this.aClass147_1.method3948(local148, this.aClass51_2, arg0);
				if (this.aByteArray42[arg0] != 1) {
					this.anInt3117++;
					this.aByteArray42[arg0] = 1;
				}
			}
			if (!local16.aBoolean563) {
				local16.method7983();
			}
			return local16;
		}
		try {
			if (local148 == null || local148.length <= 2) {
				throw new RuntimeException();
			}
			Static142.aCRC32_2.reset();
			Static142.aCRC32_2.update(local148, 0, local148.length - 2);
			local175 = (int) Static142.aCRC32_2.getValue();
			if (this.aClass293_1.anIntArray659[arg0] != local175) {
				throw new RuntimeException();
			}
			if (this.aClass293_1.aByteArrayArray31 != null && this.aClass293_1.aByteArrayArray31[arg0] != null) {
				local202 = this.aClass293_1.aByteArrayArray31[arg0];
				local213 = Static528.method7532(local148, local148.length - 2, 0);
				for (local215 = 0; local215 < 64; local215++) {
					if (local213[local215] != local202[local215]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(447) int local447 = ((local148[local148.length - 2] & 0xFF) << 8) + (local148[local148.length - 1] & 0xFF);
			if (local447 != (this.aClass293_1.anIntArray658[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray42[arg0] != 1) {
				this.anInt3117++;
				this.aByteArray42[arg0] = 1;
			}
			if (!local16.aBoolean563) {
				local16.method7983();
			}
			return local16;
		} catch (@Pc(494) Exception local494) {
			this.aByteArray42[arg0] = -1;
			local16.method7983();
			if (local16.aBoolean563 && !this.aClass115_1.method3353()) {
				local266 = this.aClass115_1.method3355(arg0, this.anInt3113, true, (byte) 2);
				this.aClass174_6.method4420(local266, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	public void method2846() {
		if (this.aClass51_2 != null) {
			this.aBoolean198 = true;
			if (this.aClass38_24 == null) {
				this.aClass38_24 = new Class38();
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I")
	public int method2847() {
		if (this.method2837() == null) {
			return this.aClass1_Sub1_Sub11_1 == null ? 0 : this.aClass1_Sub1_Sub11_1.method6986();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method2836(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub1_Sub11 local9 = this.method2845(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = local9.method6987();
			local9.method7983();
			return local19;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
	@Override
	public void method2838(@OriginalArg(0) int arg0) {
		if (this.aClass51_2 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass38_25.method1419(); local14 != null; local14 = this.aClass38_25.method1415()) {
			if (local14.aLong244 == (long) arg0) {
				return;
			}
		}
		@Pc(38) Class1 local38 = new Class1();
		local38.aLong244 = arg0;
		this.aClass38_25.method1426(local38);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Lclient!uo;")
	@Override
	public Class293 method2837() {
		if (this.aClass293_1 != null) {
			return this.aClass293_1;
		}
		if (this.aClass1_Sub1_Sub11_1 == null) {
			if (this.aClass115_1.method3353()) {
				return null;
			}
			this.aClass1_Sub1_Sub11_1 = this.aClass115_1.method3355(this.anInt3113, 255, true, (byte) 0);
		}
		if (this.aClass1_Sub1_Sub11_1.aBoolean562) {
			return null;
		}
		@Pc(41) byte[] local41 = this.aClass1_Sub1_Sub11_1.method6987();
		if (this.aClass1_Sub1_Sub11_1 instanceof Class1_Sub1_Sub11_Sub1) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.aClass293_1 = new Class293(local41, this.anInt3107, this.aByteArray41);
				if (this.anInt3116 != this.aClass293_1.anInt8405) {
					throw new RuntimeException();
				}
			} catch (@Pc(141) RuntimeException local141) {
				this.aClass293_1 = null;
				if (this.aClass115_1.method3353()) {
					this.aClass1_Sub1_Sub11_1 = null;
				} else {
					this.aClass1_Sub1_Sub11_1 = this.aClass115_1.method3355(this.anInt3113, 255, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.aClass293_1 = new Class293(local41, this.anInt3107, this.aByteArray41);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass115_1.method3360();
				this.aClass293_1 = null;
				if (this.aClass115_1.method3353()) {
					this.aClass1_Sub1_Sub11_1 = null;
				} else {
					this.aClass1_Sub1_Sub11_1 = this.aClass115_1.method3355(this.anInt3113, 255, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass51_1 != null) {
				this.aClass147_1.method3948(local41, this.aClass51_1, this.anInt3113);
			}
		}
		this.aClass1_Sub1_Sub11_1 = null;
		if (this.aClass51_2 != null) {
			this.anInt3117 = 0;
			this.aByteArray42 = new byte[this.aClass293_1.anInt8408];
		}
		return this.aClass293_1;
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)I")
	public int method2850() {
		return this.aClass293_1 == null ? 0 : this.aClass293_1.anInt8406;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)I")
	@Override
	public int method2841(@OriginalArg(0) int arg0) {
		@Pc(18) Class1_Sub1_Sub11 local18 = (Class1_Sub1_Sub11) this.aClass174_6.method4422((long) arg0);
		return local18 == null ? 0 : local18.method6986();
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)I")
	public int method2851() {
		return this.anInt3117;
	}
}
