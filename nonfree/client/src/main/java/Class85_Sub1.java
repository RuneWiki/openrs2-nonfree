import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
	public static int[] anIntArray295 = new int[99];

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "Lclient!wf;")
	private Class176 aClass176_2;

	@OriginalMember(owner = "client!ki", name = "O", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	private int anInt3216 = 0;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "Lclient!ol;")
	private Class117 aClass117_10 = new Class117(16);

	@OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
	private int anInt3228 = 0;

	@OriginalMember(owner = "client!ki", name = "S", descriptor = "Lclient!qg;")
	private Class131 aClass131_11 = new Class131();

	@OriginalMember(owner = "client!ki", name = "U", descriptor = "J")
	private long aLong115 = 0L;

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
	private int anInt3225;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "Lclient!lc;")
	private Class90 aClass90_5;

	@OriginalMember(owner = "client!ki", name = "P", descriptor = "Z")
	private boolean aBoolean167;

	@OriginalMember(owner = "client!ki", name = "R", descriptor = "Lclient!qg;")
	private Class131 aClass131_10;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!lc;")
	private Class90 aClass90_4;

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
	private int anInt3226;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private int anInt3212;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!dn;")
	private Class42 aClass42_3;

	@OriginalMember(owner = "client!ki", name = "T", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "Lclient!jm;")
	private Class80 aClass80_2;

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "Lclient!tc;")
	private Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 99; local14++) {
			@Pc(23) int local23 = local14 + 1;
			@Pc(36) int local36 = (int) ((double) local23 + Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D);
			local12 += local36;
			anIntArray295[local14] = local12 / 4;
		}
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(ILclient!lc;Lclient!lc;Lclient!dn;Lclient!jm;IIZ)V")
	public Class85_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) Class80 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3225 = arg0;
		this.aClass90_5 = arg1;
		if (this.aClass90_5 == null) {
			this.aBoolean167 = false;
		} else {
			this.aBoolean167 = true;
			this.aClass131_10 = new Class131();
		}
		this.aClass90_4 = arg2;
		this.anInt3226 = arg6;
		this.anInt3212 = arg5;
		this.aClass42_3 = arg3;
		this.aBoolean168 = arg7;
		this.aClass80_2 = arg4;
		if (this.aClass90_4 != null) {
			this.aClass1_Sub2_Sub1_1 = this.aClass80_2.method2267(this.aClass90_4, this.anInt3225);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII)Lclient!tc;")
	private Class1_Sub2_Sub1 method2509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub1 local13 = (Class1_Sub2_Sub1) this.aClass117_10.method3438((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean103 && local13.aBoolean102) {
			local13.method4742();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass90_5 == null || this.aByteArray38[arg1] == -1) {
					if (this.aClass42_3.method1076()) {
						return null;
					}
					local13 = this.aClass42_3.method1070(true, arg1, this.anInt3225, (byte) 2);
				} else {
					local13 = this.aClass80_2.method2267(this.aClass90_5, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass90_5 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass80_2.method2279(arg1, this.aClass90_5);
			} else if (arg0 == 2) {
				if (this.aClass90_5 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray38[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass42_3.method1077()) {
					return null;
				}
				local13 = this.aClass42_3.method1070(false, arg1, this.anInt3225, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass117_10.method3445(local13, (long) arg1);
		}
		if (local13.aBoolean102) {
			return null;
		}
		@Pc(168) byte[] local168 = local13.method1408();
		@Pc(196) int local196;
		@Pc(305) Class1_Sub2_Sub1_Sub2 local305;
		if (!(local13 instanceof Class1_Sub2_Sub1_Sub1)) {
			try {
				if (local168 == null || local168.length <= 2) {
					throw new RuntimeException();
				}
				Static14.aCRC32_1.reset();
				Static14.aCRC32_1.update(local168, 0, local168.length - 2);
				local196 = (int) Static14.aCRC32_1.getValue();
				if (local196 != this.aClass176_2.anIntArray611[arg1]) {
					throw new RuntimeException();
				}
				this.aClass42_3.anInt1426 = 0;
				this.aClass42_3.anInt1427 = 0;
			} catch (@Pc(367) RuntimeException local367) {
				this.aClass42_3.method1081();
				local13.method4742();
				if (local13.aBoolean103 && !this.aClass42_3.method1076()) {
					local305 = this.aClass42_3.method1070(true, arg1, this.anInt3225, (byte) 2);
					this.aClass117_10.method3445(local305, (long) arg1);
				}
				return null;
			}
			local168[local168.length - 2] = (byte) (this.aClass176_2.anIntArray615[arg1] >>> 8);
			local168[local168.length - 1] = (byte) this.aClass176_2.anIntArray615[arg1];
			if (this.aClass90_5 != null) {
				this.aClass80_2.method2269(this.aClass90_5, local168, arg1);
				if (this.aByteArray38[arg1] != 1) {
					this.anInt3216++;
					this.aByteArray38[arg1] = 1;
				}
			}
			if (!local13.aBoolean103) {
				local13.method4742();
			}
			return local13;
		}
		try {
			if (local168 == null || local168.length <= 2) {
				throw new RuntimeException();
			}
			Static14.aCRC32_1.reset();
			Static14.aCRC32_1.update(local168, 0, local168.length - 2);
			local196 = (int) Static14.aCRC32_1.getValue();
			if (local196 != this.aClass176_2.anIntArray611[arg1]) {
				throw new RuntimeException();
			}
			@Pc(227) int local227 = (local168[local168.length - 1] & 0xFF) + ((local168[local168.length - 2] & 0xFF) << 8);
			if ((this.aClass176_2.anIntArray615[arg1] & 0xFFFF) != local227) {
				throw new RuntimeException();
			}
			if (this.aByteArray38[arg1] != 1) {
				if (this.aByteArray38[arg1] == 0) {
				}
				this.anInt3216++;
				this.aByteArray38[arg1] = 1;
			}
			if (!local13.aBoolean103) {
				local13.method4742();
			}
			return local13;
		} catch (@Pc(278) Exception local278) {
			this.aByteArray38[arg1] = -1;
			local13.method4742();
			if (local13.aBoolean103 && !this.aClass42_3.method1076()) {
				local305 = this.aClass42_3.method1070(true, arg1, this.anInt3225, (byte) 2);
				this.aClass117_10.method3445(local305, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	public int method2510() {
		if (this.method2503() == null) {
			return this.aClass1_Sub2_Sub1_1 == null ? 0 : this.aClass1_Sub2_Sub1_1.method1411();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lclient!wf;")
	@Override
	public Class176 method2503() {
		if (this.aClass176_2 != null) {
			return this.aClass176_2;
		}
		if (this.aClass1_Sub2_Sub1_1 == null) {
			if (this.aClass42_3.method1076()) {
				return null;
			}
			this.aClass1_Sub2_Sub1_1 = this.aClass42_3.method1070(true, this.anInt3225, 255, (byte) 0);
		}
		if (this.aClass1_Sub2_Sub1_1.aBoolean102) {
			return null;
		}
		@Pc(52) byte[] local52 = this.aClass1_Sub2_Sub1_1.method1408();
		if (this.aClass1_Sub2_Sub1_1 instanceof Class1_Sub2_Sub1_Sub1) {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass176_2 = new Class176(local52, this.anInt3212);
				if (this.aClass176_2.anInt6188 != this.anInt3226) {
					throw new RuntimeException();
				}
			} catch (@Pc(89) RuntimeException local89) {
				this.aClass176_2 = null;
				if (this.aClass42_3.method1076()) {
					this.aClass1_Sub2_Sub1_1 = null;
				} else {
					this.aClass1_Sub2_Sub1_1 = this.aClass42_3.method1070(true, this.anInt3225, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local52 == null) {
					throw new RuntimeException();
				}
				this.aClass176_2 = new Class176(local52, this.anInt3212);
			} catch (@Pc(132) RuntimeException local132) {
				this.aClass42_3.method1081();
				this.aClass176_2 = null;
				if (this.aClass42_3.method1076()) {
					this.aClass1_Sub2_Sub1_1 = null;
				} else {
					this.aClass1_Sub2_Sub1_1 = this.aClass42_3.method1070(true, this.anInt3225, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass90_4 != null) {
				this.aClass80_2.method2269(this.aClass90_4, local52, this.anInt3225);
			}
		}
		this.aClass1_Sub2_Sub1_1 = null;
		if (this.aClass90_5 != null) {
			this.anInt3216 = 0;
			this.aByteArray38 = new byte[this.aClass176_2.anInt6191];
		}
		return this.aClass176_2;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public void method2513() {
		if (this.aClass90_5 != null) {
			this.aBoolean166 = true;
			if (this.aClass131_10 == null) {
				this.aClass131_10 = new Class131();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
	@Override
	public void method2507(@OriginalArg(0) int arg0) {
		if (this.aClass90_5 == null) {
			return;
		}
		@Pc(20) Class1 local20;
		for (local20 = this.aClass131_11.method3791(); local20 != null; local20 = this.aClass131_11.method3792()) {
			if (local20.aLong201 == (long) arg0) {
				return;
			}
		}
		local20 = new Class1();
		local20.aLong201 = arg0;
		this.aClass131_11.method3799(local20);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
	public int method2514() {
		return this.anInt3216;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
	public void method2515() {
		if (this.aClass131_10 != null) {
			if (this.method2503() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class1 local31;
			@Pc(38) int local38;
			if (this.aBoolean167) {
				local26 = true;
				for (local31 = this.aClass131_10.method3791(); local31 != null; local31 = this.aClass131_10.method3792()) {
					local38 = (int) local31.aLong201;
					if (this.aByteArray38[local38] == 0) {
						this.method2509(1, local38);
					}
					if (this.aByteArray38[local38] == 0) {
						local26 = false;
					} else {
						local31.method4742();
					}
				}
				while (this.anInt3228 < this.aClass176_2.anIntArray613.length) {
					if (this.aClass176_2.anIntArray613[this.anInt3228] == 0) {
						this.anInt3228++;
					} else {
						if (this.aClass80_2.anInt2993 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray38[this.anInt3228] == 0) {
							this.method2509(1, this.anInt3228);
						}
						if (this.aByteArray38[this.anInt3228] == 0) {
							local26 = false;
							local31 = new Class1();
							local31.aLong201 = this.anInt3228;
							this.aClass131_10.method3799(local31);
						}
						this.anInt3228++;
					}
				}
				if (local26) {
					this.anInt3228 = 0;
					this.aBoolean167 = false;
				}
			} else if (this.aBoolean166) {
				local26 = true;
				for (local31 = this.aClass131_10.method3791(); local31 != null; local31 = this.aClass131_10.method3792()) {
					local38 = (int) local31.aLong201;
					if (this.aByteArray38[local38] != 1) {
						this.method2509(2, local38);
					}
					if (this.aByteArray38[local38] == 1) {
						local31.method4742();
					} else {
						local26 = false;
					}
				}
				while (this.aClass176_2.anIntArray613.length > this.anInt3228) {
					if (this.aClass176_2.anIntArray613[this.anInt3228] == 0) {
						this.anInt3228++;
					} else {
						if (this.aClass42_3.method1077()) {
							local26 = false;
							break;
						}
						if (this.aByteArray38[this.anInt3228] != 1) {
							this.method2509(2, this.anInt3228);
						}
						if (this.aByteArray38[this.anInt3228] != 1) {
							local26 = false;
							local31 = new Class1();
							local31.aLong201 = this.anInt3228;
							this.aClass131_10.method3799(local31);
						}
						this.anInt3228++;
					}
				}
				if (local26) {
					this.aBoolean166 = false;
					this.anInt3228 = 0;
				}
			} else {
				this.aClass131_10 = null;
			}
		}
		if (!this.aBoolean168 || Static294.method4792() < this.aLong115) {
			return;
		}
		for (@Pc(331) Class1_Sub2_Sub1 local331 = (Class1_Sub2_Sub1) this.aClass117_10.method3441(); local331 != null; local331 = (Class1_Sub2_Sub1) this.aClass117_10.method3444()) {
			if (!local331.aBoolean102) {
				if (local331.aBoolean101) {
					if (!local331.aBoolean103) {
						throw new RuntimeException();
					}
					local331.method4742();
				} else {
					local331.aBoolean101 = true;
				}
			}
		}
		this.aLong115 = Static294.method4792() + 1000L;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)I")
	@Override
	public int method2504(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub2_Sub1 local19 = (Class1_Sub2_Sub1) this.aClass117_10.method3438((long) arg0);
		return local19 == null ? 0 : local19.method1411();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method2505(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub2_Sub1 local9 = this.method2509(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method1408();
			local9.method4742();
			return local18;
		}
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)I")
	public int method2517() {
		if (this.aClass176_2 == null) {
			return 0;
		} else if (this.aBoolean167) {
			@Pc(30) Class1 local30 = this.aClass131_10.method3791();
			return local30 == null ? 0 : (int) local30.aLong201;
		} else {
			return this.aClass176_2.anInt6186;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public void method2518() {
		if (this.aClass131_10 == null || this.method2503() == null) {
			return;
		}
		for (@Pc(24) Class1 local24 = this.aClass131_11.method3791(); local24 != null; local24 = this.aClass131_11.method3792()) {
			@Pc(30) int local30 = (int) local24.aLong201;
			if (local30 < 0 || local30 >= this.aClass176_2.anInt6191 || this.aClass176_2.anIntArray613[local30] == 0) {
				local24.method4742();
			} else {
				if (this.aByteArray38[local30] == 0) {
					this.method2509(1, local30);
				}
				if (this.aByteArray38[local30] == -1) {
					this.method2509(2, local30);
				}
				if (this.aByteArray38[local30] == 1) {
					local24.method4742();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(B)I")
	public int method2519() {
		return this.aClass176_2 == null ? 0 : this.aClass176_2.anInt6186;
	}
}
