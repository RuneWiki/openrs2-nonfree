import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class48 {

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!bw;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public int anInt1222;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
	private int anInt1226;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	private int anInt1216 = 0;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	private int anInt1212 = 0;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	private int anInt1220 = 128;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public int anInt1218 = -1;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	private int anInt1219 = 0;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	private int anInt1215 = 128;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	private int anInt1224 = -1;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "B")
	public byte aByte31 = 0;

	static {
		new Class40(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIILclient!qa;ILclient!eca;)Lclient!r;")
	public Class36 method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class62 arg4, @OriginalArg(6) Class76 arg5) {
		return this.method1170(arg2, null, arg5, arg3, (byte) 2, 0, arg1, arg4, 0, 0, arg0, null, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!co;B)V")
	public void method1169(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method1172(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!sa;Lclient!eca;IBIIILclient!qa;IIILclient!sa;Z)Lclient!r;")
	private Class36 method1170(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class62 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class131 arg11, @OriginalArg(13) boolean arg12) {
		@Pc(15) int local15 = arg10;
		@Pc(31) Class31 local31 = this.anInt1218 == -1 || arg0 == -1 ? null : arg2.method2152(this.anInt1218);
		@Pc(40) boolean local40 = arg12 & this.aByte31 != 0;
		if (local31 != null) {
			local15 = arg10 | local31.method853(false, arg0, arg6);
		}
		if (local40) {
			local15 |= this.aByte31 == 3 ? 7 : 2;
		}
		if (this.anInt1215 != 128) {
			local15 |= 0x2;
		}
		if (this.anInt1220 != 128 || this.anInt1216 != 0) {
			local15 |= 0x5;
		}
		@Pc(89) Class288 local89 = this.aClass41_1.aClass288_4;
		@Pc(109) Class36 local109;
		synchronized (this.aClass41_1.aClass288_4) {
			local109 = (Class36) this.aClass41_1.aClass288_4.method6745((long) (this.anInt1222 |= arg7.anInt8664 << 29));
		}
		if (local109 == null || arg7.method7017(local109.ba(), local15) != 0) {
			if (local109 != null) {
				local15 = arg7.method7024(local15, local109.ba());
			}
			@Pc(133) int local133 = local15;
			if (this.aShortArray20 != null) {
				local133 = local15 | 0x4000;
			}
			if (this.aShortArray22 != null) {
				local133 |= 0x8000;
			}
			@Pc(156) Class184 local156 = Static287.method4830(this.anInt1226, this.aClass41_1.aClass117_24);
			if (local156 == null) {
				return null;
			}
			if (local156.anInt5413 < 13) {
				local156.method4518();
			}
			local109 = arg7.method7012(local156, local133, this.aClass41_1.anInt1107, this.anInt1219 + 64, this.anInt1212 + 850);
			@Pc(189) int local189;
			if (this.aShortArray20 != null) {
				for (local189 = 0; local189 < this.aShortArray20.length; local189++) {
					local109.pa(this.aShortArray20[local189], this.aShortArray19[local189]);
				}
			}
			if (this.aShortArray22 != null) {
				for (local189 = 0; local189 < this.aShortArray22.length; local189++) {
					local109.L(this.aShortArray22[local189], this.aShortArray21[local189]);
				}
			}
			local109.m(local15);
			@Pc(241) Class288 local241 = this.aClass41_1.aClass288_4;
			synchronized (this.aClass41_1.aClass288_4) {
				this.aClass41_1.aClass288_4.method6746(local109, (long) (this.anInt1222 |= arg7.anInt8664 << 29));
			}
		}
		@Pc(285) Class36 local285 = local31 == null ? local109.method7356(arg4, local15, true) : local31.method856(arg4, arg6, arg0, local109, local15, arg3, 0);
		if (this.anInt1220 != 128 || this.anInt1215 != 128) {
			local285.V(this.anInt1220, this.anInt1215, this.anInt1220);
		}
		if (this.anInt1216 != 0) {
			if (this.anInt1216 == 90) {
				local285.OA(4096);
			}
			if (this.anInt1216 == 180) {
				local285.OA(8192);
			}
			if (this.anInt1216 == 270) {
				local285.OA(12288);
			}
		}
		if (local40) {
			local285.RA(this.aByte31, this.anInt1224, arg11, arg1, arg8, arg5, arg9);
		}
		local285.m(arg10);
		return local285;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILclient!sa;IBLclient!sa;Lclient!qa;ILclient!eca;IIII)Lclient!r;")
	public Class36 method1171(@OriginalArg(1) int arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class131 arg3, @OriginalArg(6) Class62 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class76 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method1170(arg10, arg1, arg6, arg0, (byte) 2, arg2, arg7, arg4, arg8, arg9, arg5, arg3, true);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!co;II)V")
	private void method1172(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1226 = arg0.method4227();
		} else if (arg1 == 2) {
			this.anInt1218 = arg0.method4227();
		} else if (arg1 == 4) {
			this.anInt1220 = arg0.method4227();
		} else if (arg1 == 5) {
			this.anInt1215 = arg0.method4227();
		} else if (arg1 == 6) {
			this.anInt1216 = arg0.method4227();
		} else if (arg1 == 7) {
			this.anInt1219 = arg0.method4220();
		} else if (arg1 == 8) {
			this.anInt1212 = arg0.method4220();
		} else if (arg1 == 9) {
			this.aByte31 = 3;
			this.anInt1224 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean68 = true;
		} else if (arg1 == 11) {
			this.aByte31 = 1;
		} else if (arg1 == 12) {
			this.aByte31 = 4;
		} else if (arg1 == 13) {
			this.aByte31 = 5;
		} else if (arg1 == 14) {
			this.aByte31 = 2;
			this.anInt1224 = arg0.method4220() * 256;
		} else if (arg1 == 15) {
			this.aByte31 = 3;
			this.anInt1224 = arg0.method4227();
		} else if (arg1 == 16) {
			this.aByte31 = 3;
			this.anInt1224 = arg0.method4230();
		} else {
			@Pc(127) int local127;
			@Pc(137) int local137;
			if (arg1 == 40) {
				local127 = arg0.method4220();
				this.aShortArray20 = new short[local127];
				this.aShortArray19 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray20[local137] = (short) arg0.method4227();
					this.aShortArray19[local137] = (short) arg0.method4227();
				}
			} else if (arg1 == 41) {
				local127 = arg0.method4220();
				this.aShortArray21 = new short[local127];
				this.aShortArray22 = new short[local127];
				for (local137 = 0; local137 < local127; local137++) {
					this.aShortArray22[local137] = (short) arg0.method4227();
					this.aShortArray21[local137] = (short) arg0.method4227();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!qa;ILclient!eca;IIIB)Lclient!r;")
	public Class36 method1173(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method1170(arg1, null, arg2, arg5, (byte) 5, 0, arg4, arg0, 0, 0, arg3, null, false);
	}
}
