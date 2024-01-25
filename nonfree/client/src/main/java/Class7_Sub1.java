import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Lclient!ew;")
	private Class106 aClass106_1;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
	private boolean aBoolean4;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	private int anInt155 = 0;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Lclient!tga;")
	private final Class335 aClass335_1 = new Class335(16);

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	private int anInt171 = 0;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "Lclient!ga;")
	private final Class124 aClass124_2 = new Class124();

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "J")
	private long aLong15 = 0L;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	private final int anInt159;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "Lclient!qia;")
	private final Class287 aClass287_2;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "Lclient!ga;")
	private Class124 aClass124_1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!qia;")
	private final Class287 aClass287_1;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Lclient!ql;")
	private final Class288 aClass288_1;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	private final int anInt163;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!cca;")
	private final Class52 aClass52_1;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
	private final int anInt168;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "Z")
	private final boolean aBoolean5;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!ne;")
	private Class5_Sub2_Sub14 aClass5_Sub2_Sub14_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(ILclient!qia;Lclient!qia;Lclient!ql;Lclient!cca;I[BIZ)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class287 arg1, @OriginalArg(2) Class287 arg2, @OriginalArg(3) Class288 arg3, @OriginalArg(4) Class52 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt159 = arg0;
		this.aClass287_2 = arg1;
		if (this.aClass287_2 == null) {
			this.aBoolean3 = false;
		} else {
			this.aBoolean3 = true;
			this.aClass124_1 = new Class124();
		}
		this.aClass287_1 = arg2;
		this.aClass288_1 = arg3;
		this.aByteArray2 = arg6;
		this.anInt163 = arg7;
		this.aClass52_1 = arg4;
		this.anInt168 = arg5;
		this.aBoolean5 = arg8;
		if (this.aClass287_1 != null) {
			this.aClass5_Sub2_Sub14_1 = this.aClass52_1.method951(this.anInt159, this.aClass287_1);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)I")
	@Override
	public int method154(@OriginalArg(1) int arg0) {
		@Pc(19) Class5_Sub2_Sub14 local19 = (Class5_Sub2_Sub14) this.aClass335_1.method7766((long) arg0);
		return local19 == null ? 0 : local19.method8574();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method155(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub2_Sub14 local9 = this.method162(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method8575();
			local9.method8829();
			return local25;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
	public int method159() {
		return this.aClass106_1 == null ? 0 : this.aClass106_1.anInt2406;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)I")
	public int method160() {
		if (this.method157() == null) {
			return this.aClass5_Sub2_Sub14_1 == null ? 0 : this.aClass5_Sub2_Sub14_1.method8574();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)I")
	public int method161() {
		if (this.aClass106_1 == null) {
			return 0;
		} else if (this.aBoolean3) {
			@Pc(26) Class5 local26 = this.aClass124_1.method2572();
			return local26 == null ? 0 : (int) local26.aLong329;
		} else {
			return this.aClass106_1.anInt2406;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lclient!ne;")
	private Class5_Sub2_Sub14 method162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class5_Sub2_Sub14 local18 = (Class5_Sub2_Sub14) this.aClass335_1.method7766((long) arg0);
		if (local18 != null && arg1 == 0 && !local18.aBoolean747 && local18.aBoolean746) {
			local18.method8829();
			local18 = null;
		}
		if (local18 == null) {
			if (arg1 == 0) {
				if (this.aClass287_2 == null || this.aByteArray1[arg0] == -1) {
					if (this.aClass288_1.method7047()) {
						return null;
					}
					local18 = this.aClass288_1.method7042(true, arg0, (byte) 2, this.anInt159);
				} else {
					local18 = this.aClass52_1.method951(arg0, this.aClass287_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass287_2 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass52_1.method947(arg0, this.aClass287_2);
			} else if (arg1 == 2) {
				if (this.aClass287_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray1[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass288_1.method7050()) {
					return null;
				}
				local18 = this.aClass288_1.method7042(false, arg0, (byte) 2, this.anInt159);
			} else {
				throw new RuntimeException();
			}
			this.aClass335_1.method7770((long) arg0, local18);
		}
		if (local18.aBoolean746) {
			return null;
		}
		@Pc(154) byte[] local154 = local18.method8575();
		@Pc(183) int local183;
		@Pc(214) byte[] local214;
		@Pc(223) byte[] local223;
		@Pc(225) int local225;
		@Pc(282) Class5_Sub2_Sub14_Sub1 local282;
		if (!(local18 instanceof Class5_Sub2_Sub14_Sub2)) {
			try {
				if (local154 == null || local154.length <= 2) {
					throw new RuntimeException();
				}
				Static524.aCRC32_4.reset();
				Static524.aCRC32_4.update(local154, 0, local154.length - 2);
				local183 = (int) Static524.aCRC32_4.getValue();
				if (this.aClass106_1.anIntArray123[arg0] != local183) {
					throw new RuntimeException();
				}
				if (this.aClass106_1.aByteArrayArray7 != null && this.aClass106_1.aByteArrayArray7[arg0] != null) {
					local214 = this.aClass106_1.aByteArrayArray7[arg0];
					local223 = Static52.method800(local154.length - 2, 0, local154);
					for (local225 = 0; local225 < 64; local225++) {
						if (local214[local225] != local223[local225]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass288_1.anInt8301 = 0;
				this.aClass288_1.anInt8302 = 0;
			} catch (@Pc(255) RuntimeException local255) {
				this.aClass288_1.method7046();
				local18.method8829();
				if (local18.aBoolean747 && !this.aClass288_1.method7047()) {
					local282 = this.aClass288_1.method7042(true, arg0, (byte) 2, this.anInt159);
					this.aClass335_1.method7770((long) arg0, local282);
				}
				return null;
			}
			local154[local154.length - 2] = (byte) (this.aClass106_1.anIntArray121[arg0] >>> 8);
			local154[local154.length - 1] = (byte) this.aClass106_1.anIntArray121[arg0];
			if (this.aClass287_2 != null) {
				this.aClass52_1.method948(local154, arg0, this.aClass287_2);
				if (this.aByteArray1[arg0] != 1) {
					this.anInt155++;
					this.aByteArray1[arg0] = 1;
				}
			}
			if (!local18.aBoolean747) {
				local18.method8829();
			}
			return local18;
		}
		try {
			if (local154 == null || local154.length <= 2) {
				throw new RuntimeException();
			}
			Static524.aCRC32_4.reset();
			Static524.aCRC32_4.update(local154, 0, local154.length - 2);
			local183 = (int) Static524.aCRC32_4.getValue();
			if (local183 != this.aClass106_1.anIntArray123[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass106_1.aByteArrayArray7 != null && this.aClass106_1.aByteArrayArray7[arg0] != null) {
				local214 = this.aClass106_1.aByteArrayArray7[arg0];
				local223 = Static52.method800(local154.length - 2, 0, local154);
				for (local225 = 0; local225 < 64; local225++) {
					if (local214[local225] != local223[local225]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(464) int local464 = ((local154[local154.length - 2] & 0xFF) << 8) + (local154[local154.length - 1] & 0xFF);
			if (local464 != (this.aClass106_1.anIntArray121[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray1[arg0] != 1) {
				this.anInt155++;
				this.aByteArray1[arg0] = 1;
			}
			if (!local18.aBoolean747) {
				local18.method8829();
			}
			return local18;
		} catch (@Pc(505) Exception local505) {
			this.aByteArray1[arg0] = -1;
			local18.method8829();
			if (local18.aBoolean747 && !this.aClass288_1.method7047()) {
				local282 = this.aClass288_1.method7042(true, arg0, (byte) 2, this.anInt159);
				this.aClass335_1.method7770((long) arg0, local282);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public void method163() {
		if (this.aClass124_1 != null) {
			if (this.method157() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class5 local30;
			@Pc(36) int local36;
			@Pc(117) Class5 local117;
			if (this.aBoolean3) {
				local25 = true;
				for (local30 = this.aClass124_1.method2572(); local30 != null; local30 = this.aClass124_1.method2569()) {
					local36 = (int) local30.aLong329;
					if (this.aByteArray1[local36] == 0) {
						this.method162(local36, 1);
					}
					if (this.aByteArray1[local36] == 0) {
						local25 = false;
					} else {
						local30.method8829();
					}
				}
				while (this.aClass106_1.anIntArray119.length > this.anInt171) {
					if (this.aClass106_1.anIntArray119[this.anInt171] == 0) {
						this.anInt171++;
					} else {
						if (this.aClass52_1.anInt1024 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray1[this.anInt171] == 0) {
							this.method162(this.anInt171, 1);
						}
						if (this.aByteArray1[this.anInt171] == 0) {
							local117 = new Class5();
							local117.aLong329 = (long) this.anInt171;
							this.aClass124_1.method2574(local117);
							local25 = false;
						}
						this.anInt171++;
					}
				}
				if (local25) {
					this.anInt171 = 0;
					this.aBoolean3 = false;
				}
			} else if (this.aBoolean4) {
				local25 = true;
				for (local30 = this.aClass124_1.method2572(); local30 != null; local30 = this.aClass124_1.method2569()) {
					local36 = (int) local30.aLong329;
					if (this.aByteArray1[local36] != 1) {
						this.method162(local36, 2);
					}
					if (this.aByteArray1[local36] == 1) {
						local30.method8829();
					} else {
						local25 = false;
					}
				}
				while (this.anInt171 < this.aClass106_1.anIntArray119.length) {
					if (this.aClass106_1.anIntArray119[this.anInt171] == 0) {
						this.anInt171++;
					} else {
						if (this.aClass288_1.method7050()) {
							local25 = false;
							break;
						}
						if (this.aByteArray1[this.anInt171] != 1) {
							this.method162(this.anInt171, 2);
						}
						if (this.aByteArray1[this.anInt171] != 1) {
							local117 = new Class5();
							local117.aLong329 = (long) this.anInt171;
							this.aClass124_1.method2574(local117);
							local25 = false;
						}
						this.anInt171++;
					}
				}
				if (local25) {
					this.anInt171 = 0;
					this.aBoolean4 = false;
				}
			} else {
				this.aClass124_1 = null;
			}
		}
		if (!this.aBoolean5 || this.aLong15 > Static124.method1947()) {
			return;
		}
		for (@Pc(319) Class5_Sub2_Sub14 local319 = (Class5_Sub2_Sub14) this.aClass335_1.method7768(); local319 != null; local319 = (Class5_Sub2_Sub14) this.aClass335_1.method7777()) {
			if (!local319.aBoolean746) {
				if (local319.aBoolean745) {
					if (!local319.aBoolean747) {
						throw new RuntimeException();
					}
					local319.method8829();
				} else {
					local319.aBoolean745 = true;
				}
			}
		}
		this.aLong15 = Static124.method1947() + 1000L;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V")
	@Override
	public void method158(@OriginalArg(0) int arg0) {
		if (this.aClass287_2 == null) {
			return;
		}
		for (@Pc(18) Class5 local18 = this.aClass124_2.method2572(); local18 != null; local18 = this.aClass124_2.method2569()) {
			if ((long) arg0 == local18.aLong329) {
				return;
			}
		}
		@Pc(37) Class5 local37 = new Class5();
		local37.aLong329 = (long) arg0;
		this.aClass124_2.method2574(local37);
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public void method164() {
		if (this.aClass124_1 == null || this.method157() == null) {
			return;
		}
		for (@Pc(22) Class5 local22 = this.aClass124_2.method2572(); local22 != null; local22 = this.aClass124_2.method2569()) {
			@Pc(27) int local27 = (int) local22.aLong329;
			if (local27 < 0 || this.aClass106_1.anInt2411 <= local27 || this.aClass106_1.anIntArray119[local27] == 0) {
				local22.method8829();
			} else {
				if (this.aByteArray1[local27] == 0) {
					this.method162(local27, 1);
				}
				if (this.aByteArray1[local27] == -1) {
					this.method162(local27, 2);
				}
				if (this.aByteArray1[local27] == 1) {
					local22.method8829();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lclient!ew;")
	@Override
	public Class106 method157() {
		if (this.aClass106_1 != null) {
			return this.aClass106_1;
		}
		if (this.aClass5_Sub2_Sub14_1 == null) {
			if (this.aClass288_1.method7047()) {
				return null;
			}
			this.aClass5_Sub2_Sub14_1 = this.aClass288_1.method7042(true, this.anInt159, (byte) 0, 255);
		}
		if (this.aClass5_Sub2_Sub14_1.aBoolean746) {
			return null;
		}
		@Pc(41) byte[] local41 = this.aClass5_Sub2_Sub14_1.method8575();
		if (this.aClass5_Sub2_Sub14_1 instanceof Class5_Sub2_Sub14_Sub2) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.aClass106_1 = new Class106(local41, this.anInt168, this.aByteArray2);
				if (this.aClass106_1.anInt2408 != this.anInt163) {
					throw new RuntimeException();
				}
			} catch (@Pc(77) RuntimeException local77) {
				this.aClass106_1 = null;
				if (this.aClass288_1.method7047()) {
					this.aClass5_Sub2_Sub14_1 = null;
				} else {
					this.aClass5_Sub2_Sub14_1 = this.aClass288_1.method7042(true, this.anInt159, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.aClass106_1 = new Class106(local41, this.anInt168, this.aByteArray2);
			} catch (@Pc(120) RuntimeException local120) {
				this.aClass288_1.method7046();
				this.aClass106_1 = null;
				if (this.aClass288_1.method7047()) {
					this.aClass5_Sub2_Sub14_1 = null;
				} else {
					this.aClass5_Sub2_Sub14_1 = this.aClass288_1.method7042(true, this.anInt159, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass287_1 != null) {
				this.aClass52_1.method948(local41, this.anInt159, this.aClass287_1);
			}
		}
		this.aClass5_Sub2_Sub14_1 = null;
		if (this.aClass287_2 != null) {
			this.anInt155 = 0;
			this.aByteArray1 = new byte[this.aClass106_1.anInt2411];
		}
		return this.aClass106_1;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)I")
	public int method165() {
		return this.anInt155;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
	public void method166() {
		if (this.aClass287_2 != null) {
			this.aBoolean4 = true;
			if (this.aClass124_1 == null) {
				this.aClass124_1 = new Class124();
			}
		}
	}
}
