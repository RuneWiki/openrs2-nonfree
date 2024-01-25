import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class260_Sub1 extends Class260 {

	@OriginalMember(owner = "client!oga", name = "H", descriptor = "Lclient!gj;")
	private Class145 aClass145_2;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!oga", name = "J", descriptor = "Z")
	private boolean aBoolean558;

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
	private int anInt7226 = 0;

	@OriginalMember(owner = "client!oga", name = "F", descriptor = "Lclient!qha;")
	private final Class291 aClass291_28 = new Class291(16);

	@OriginalMember(owner = "client!oga", name = "z", descriptor = "I")
	private int anInt7242 = 0;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "Lclient!ef;")
	private final Class102 aClass102_47 = new Class102();

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "J")
	private long aLong216 = 0L;

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "Lclient!lp;")
	private final Class223 aClass223_1;

	@OriginalMember(owner = "client!oga", name = "y", descriptor = "I")
	private final int anInt7232;

	@OriginalMember(owner = "client!oga", name = "E", descriptor = "Z")
	private boolean aBoolean557;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "Lclient!ef;")
	private Class102 aClass102_48;

	@OriginalMember(owner = "client!oga", name = "I", descriptor = "Lclient!lp;")
	private final Class223 aClass223_2;

	@OriginalMember(owner = "client!oga", name = "G", descriptor = "Lclient!wd;")
	private final Class381 aClass381_1;

	@OriginalMember(owner = "client!oga", name = "A", descriptor = "Lclient!cg;")
	private final Class65 aClass65_2;

	@OriginalMember(owner = "client!oga", name = "C", descriptor = "[B")
	private final byte[] aByteArray66;

	@OriginalMember(owner = "client!oga", name = "w", descriptor = "Z")
	private final boolean aBoolean559;

	@OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
	private final int anInt7241;

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
	private final int anInt7236;

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Lclient!gh;")
	private Class5_Sub5_Sub7 aClass5_Sub5_Sub7_1;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(ILclient!lp;Lclient!lp;Lclient!cg;Lclient!wd;I[BIZ)V")
	public Class260_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) Class381 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass223_1 = arg1;
		this.anInt7232 = arg0;
		if (this.aClass223_1 == null) {
			this.aBoolean557 = false;
		} else {
			this.aBoolean557 = true;
			this.aClass102_48 = new Class102();
		}
		this.aClass223_2 = arg2;
		this.aClass381_1 = arg4;
		this.aClass65_2 = arg3;
		this.aByteArray66 = arg6;
		this.aBoolean559 = arg8;
		this.anInt7241 = arg5;
		this.anInt7236 = arg7;
		if (this.aClass223_2 != null) {
			this.aClass5_Sub5_Sub7_1 = this.aClass381_1.method9067(this.aClass223_2, this.anInt7232);
		}
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)I")
	public int method6256() {
		return this.anInt7226;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)Lclient!gj;")
	@Override
	public Class145 method6255() {
		if (this.aClass145_2 != null) {
			return this.aClass145_2;
		}
		if (this.aClass5_Sub5_Sub7_1 == null) {
			if (this.aClass65_2.method1126()) {
				return null;
			}
			this.aClass5_Sub5_Sub7_1 = this.aClass65_2.method1138(true, 255, this.anInt7232, (byte) 0);
		}
		if (this.aClass5_Sub5_Sub7_1.aBoolean613) {
			return null;
		}
		@Pc(55) byte[] local55 = this.aClass5_Sub5_Sub7_1.method7061();
		if (this.aClass5_Sub5_Sub7_1 instanceof Class5_Sub5_Sub7_Sub2) {
			try {
				if (local55 == null) {
					throw new RuntimeException();
				}
				this.aClass145_2 = new Class145(local55, this.anInt7241, this.aByteArray66);
				if (this.anInt7236 != this.aClass145_2.anInt3197) {
					throw new RuntimeException();
				}
			} catch (@Pc(162) RuntimeException local162) {
				this.aClass145_2 = null;
				if (this.aClass65_2.method1126()) {
					this.aClass5_Sub5_Sub7_1 = null;
				} else {
					this.aClass5_Sub5_Sub7_1 = this.aClass65_2.method1138(true, 255, this.anInt7232, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local55 == null) {
					throw new RuntimeException();
				}
				this.aClass145_2 = new Class145(local55, this.anInt7241, this.aByteArray66);
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass65_2.method1137();
				this.aClass145_2 = null;
				if (this.aClass65_2.method1126()) {
					this.aClass5_Sub5_Sub7_1 = null;
				} else {
					this.aClass5_Sub5_Sub7_1 = this.aClass65_2.method1138(true, 255, this.anInt7232, (byte) 0);
				}
				return null;
			}
			if (this.aClass223_2 != null) {
				this.aClass381_1.method9065(this.aClass223_2, this.anInt7232, local55);
			}
		}
		if (this.aClass223_1 != null) {
			this.aByteArray67 = new byte[this.aClass145_2.anInt3194];
			this.anInt7226 = 0;
		}
		this.aClass5_Sub5_Sub7_1 = null;
		return this.aClass145_2;
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)I")
	public int method6257() {
		if (this.aClass145_2 == null) {
			return 0;
		} else if (this.aBoolean557) {
			@Pc(33) Class5 local33 = this.aClass102_48.method1916();
			return local33 == null ? 0 : (int) local33.aLong314;
		} else {
			return this.aClass145_2.anInt3201;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)V")
	@Override
	public void method6254(@OriginalArg(1) int arg0) {
		if (this.aClass223_1 == null) {
			return;
		}
		for (@Pc(15) Class5 local15 = this.aClass102_47.method1916(); local15 != null; local15 = this.aClass102_47.method1915()) {
			if (local15.aLong314 == (long) arg0) {
				return;
			}
		}
		@Pc(37) Class5 local37 = new Class5();
		if (125 >= 25) {
			local37.aLong314 = (long) arg0;
			this.aClass102_47.method1921(local37);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)Lclient!gh;")
	private Class5_Sub5_Sub7 method6258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class5_Sub5_Sub7 local21 = (Class5_Sub5_Sub7) this.aClass291_28.method6993((long) arg0, 1);
		if (local21 != null && arg1 == 0 && !local21.aBoolean615 && local21.aBoolean613) {
			local21.method9327(1);
			local21 = null;
		}
		if (local21 == null) {
			if (arg1 == 0) {
				if (this.aClass223_1 == null || this.aByteArray67[arg0] == -1) {
					if (this.aClass65_2.method1126()) {
						return null;
					}
					local21 = this.aClass65_2.method1138(true, this.anInt7232, arg0, (byte) 2);
				} else {
					local21 = this.aClass381_1.method9067(this.aClass223_1, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass223_1 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass381_1.method9068(this.aClass223_1, arg0);
			} else if (arg1 == 2) {
				if (this.aClass223_1 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray67[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass65_2.method1125()) {
					return null;
				}
				local21 = this.aClass65_2.method1138(false, this.anInt7232, arg0, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass291_28.method6984((long) arg0, local21);
		}
		if (local21.aBoolean613) {
			return null;
		}
		@Pc(184) byte[] local184 = local21.method7061();
		@Pc(216) int local216;
		@Pc(250) byte[] local250;
		@Pc(259) byte[] local259;
		@Pc(261) int local261;
		@Pc(318) Class5_Sub5_Sub7_Sub1 local318;
		if (!(local21 instanceof Class5_Sub5_Sub7_Sub2)) {
			try {
				if (local184 == null || local184.length <= 2) {
					throw new RuntimeException();
				}
				Static380.aCRC32_1.reset();
				Static380.aCRC32_1.update(local184, 0, local184.length - 2);
				local216 = (int) Static380.aCRC32_1.getValue();
				if (this.aClass145_2.anIntArray184[arg0] != local216) {
					throw new RuntimeException();
				}
				if (this.aClass145_2.aByteArrayArray7 != null && this.aClass145_2.aByteArrayArray7[arg0] != null) {
					local250 = this.aClass145_2.aByteArrayArray7[arg0];
					local259 = Static470.method7564(local184.length - 2, 0, local184);
					for (local261 = 0; local261 < 64; local261++) {
						if (local250[local261] != local259[local261]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass65_2.anInt1148 = 0;
				this.aClass65_2.anInt1149 = 0;
			} catch (@Pc(291) RuntimeException local291) {
				this.aClass65_2.method1137();
				local21.method9327(1);
				if (local21.aBoolean615 && !this.aClass65_2.method1126()) {
					local318 = this.aClass65_2.method1138(true, this.anInt7232, arg0, (byte) 2);
					this.aClass291_28.method6984((long) arg0, local318);
				}
				return null;
			}
			local184[local184.length - 2] = (byte) (this.aClass145_2.anIntArray188[arg0] >>> 8);
			local184[local184.length - 1] = (byte) this.aClass145_2.anIntArray188[arg0];
			if (this.aClass223_1 != null) {
				this.aClass381_1.method9065(this.aClass223_1, arg0, local184);
				if (this.aByteArray67[arg0] != 1) {
					this.anInt7226++;
					this.aByteArray67[arg0] = 1;
				}
			}
			if (!local21.aBoolean615) {
				local21.method9327(1);
			}
			return local21;
		}
		try {
			if (local184 == null || local184.length <= 2) {
				throw new RuntimeException();
			}
			Static380.aCRC32_1.reset();
			Static380.aCRC32_1.update(local184, 0, local184.length - 2);
			local216 = (int) Static380.aCRC32_1.getValue();
			if (this.aClass145_2.anIntArray184[arg0] != local216) {
				throw new RuntimeException();
			}
			if (this.aClass145_2.aByteArrayArray7 != null && this.aClass145_2.aByteArrayArray7[arg0] != null) {
				local250 = this.aClass145_2.aByteArrayArray7[arg0];
				local259 = Static470.method7564(local184.length - 2, 0, local184);
				for (local261 = 0; local261 < 64; local261++) {
					if (local259[local261] != local250[local261]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(512) int local512 = ((local184[local184.length - 2] & 0xFF) << 8) + (local184[local184.length - 1] & 0xFF);
			if ((this.aClass145_2.anIntArray188[arg0] & 0xFFFF) != local512) {
				throw new RuntimeException();
			}
			if (this.aByteArray67[arg0] != 1) {
				this.anInt7226++;
				this.aByteArray67[arg0] = 1;
			}
			if (!local21.aBoolean615) {
				local21.method9327(1);
			}
			return local21;
		} catch (@Pc(560) Exception local560) {
			this.aByteArray67[arg0] = -1;
			local21.method9327(1);
			if (local21.aBoolean615 && !this.aClass65_2.method1126()) {
				local318 = this.aClass65_2.method1138(true, this.anInt7232, arg0, (byte) 2);
				this.aClass291_28.method6984((long) arg0, local318);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
	public void method6259() {
		if (this.aClass223_1 != null) {
			this.aBoolean558 = true;
			if (this.aClass102_48 == null) {
				this.aClass102_48 = new Class102();
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IB)I")
	@Override
	public int method6251(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub5_Sub7 local17 = (Class5_Sub5_Sub7) this.aClass291_28.method6993((long) arg0, 1);
		return local17 == null ? 0 : local17.method7065();
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method6250(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub5_Sub7 local9 = this.method6258(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = local9.method7061();
			local9.method9327(1);
			return local18;
		}
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)I")
	public int method6261() {
		return this.aClass145_2 == null ? 0 : this.aClass145_2.anInt3201;
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)I")
	public int method6262() {
		if (this.method6255() == null) {
			return this.aClass5_Sub5_Sub7_1 == null ? 0 : this.aClass5_Sub5_Sub7_1.method7065();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "(I)V")
	public void method6263() {
		if (this.aClass102_48 == null || this.method6255() == null) {
			return;
		}
		for (@Pc(21) Class5 local21 = this.aClass102_47.method1916(); local21 != null; local21 = this.aClass102_47.method1915()) {
			@Pc(35) int local35 = (int) local21.aLong314;
			if (local35 < 0 || this.aClass145_2.anInt3194 <= local35 || this.aClass145_2.anIntArray187[local35] == 0) {
				local21.method9327(1);
			} else {
				if (this.aByteArray67[local35] == 0) {
					this.method6258(local35, 1);
				}
				if (this.aByteArray67[local35] == -1) {
					this.method6258(local35, 2);
				}
				if (this.aByteArray67[local35] == 1) {
					local21.method9327(1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
	public void method6264() {
		if (this.aClass102_48 != null) {
			if (this.method6255() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class5 local26;
			@Pc(32) int local32;
			@Pc(131) Class5 local131;
			if (this.aBoolean557) {
				local21 = true;
				for (local26 = this.aClass102_48.method1916(); local26 != null; local26 = this.aClass102_48.method1915()) {
					local32 = (int) local26.aLong314;
					if (this.aByteArray67[local32] == 0) {
						this.method6258(local32, 1);
					}
					if (this.aByteArray67[local32] == 0) {
						local21 = false;
					} else {
						local26.method9327(1);
					}
				}
				while (this.anInt7242 < this.aClass145_2.anIntArray187.length) {
					if (this.aClass145_2.anIntArray187[this.anInt7242] == 0) {
						this.anInt7242++;
					} else {
						if (this.aClass381_1.anInt10570 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray67[this.anInt7242] == 0) {
							this.method6258(this.anInt7242, 1);
						}
						if (this.aByteArray67[this.anInt7242] == 0) {
							local131 = new Class5();
							local131.aLong314 = (long) this.anInt7242;
							local21 = false;
							this.aClass102_48.method1921(local131);
						}
						this.anInt7242++;
					}
				}
				if (local21) {
					this.aBoolean557 = false;
					this.anInt7242 = 0;
				}
			} else if (this.aBoolean558) {
				local21 = true;
				for (local26 = this.aClass102_48.method1916(); local26 != null; local26 = this.aClass102_48.method1915()) {
					local32 = (int) local26.aLong314;
					if (this.aByteArray67[local32] != 1) {
						this.method6258(local32, 2);
					}
					if (this.aByteArray67[local32] == 1) {
						local26.method9327(1);
					} else {
						local21 = false;
					}
				}
				while (this.anInt7242 < this.aClass145_2.anIntArray187.length) {
					if (this.aClass145_2.anIntArray187[this.anInt7242] == 0) {
						this.anInt7242++;
					} else {
						if (this.aClass65_2.method1125()) {
							local21 = false;
							break;
						}
						if (this.aByteArray67[this.anInt7242] != 1) {
							this.method6258(this.anInt7242, 2);
						}
						if (this.aByteArray67[this.anInt7242] != 1) {
							local131 = new Class5();
							local131.aLong314 = (long) this.anInt7242;
							local21 = false;
							this.aClass102_48.method1921(local131);
						}
						this.anInt7242++;
					}
				}
				if (local21) {
					this.anInt7242 = 0;
					this.aBoolean558 = false;
				}
			} else {
				this.aClass102_48 = null;
			}
		}
		if (!this.aBoolean559 || this.aLong216 > Static515.method7499(81)) {
			return;
		}
		for (@Pc(368) Class5_Sub5_Sub7 local368 = (Class5_Sub5_Sub7) this.aClass291_28.method6987(); local368 != null; local368 = (Class5_Sub5_Sub7) this.aClass291_28.method6989()) {
			if (!local368.aBoolean613) {
				if (local368.aBoolean614) {
					if (!local368.aBoolean615) {
						throw new RuntimeException();
					}
					local368.method9327(1);
				} else {
					local368.aBoolean614 = true;
				}
			}
		}
		this.aLong216 = Static515.method7499(123) + 1000L;
	}
}
