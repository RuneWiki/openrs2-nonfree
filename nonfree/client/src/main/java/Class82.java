import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class82 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Lclient!cda;")
	public Class49 aClass49_2;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	private int anInt1826;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	public int anInt1827 = -1;

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
	private int anInt1832 = 128;

	@OriginalMember(owner = "client!dw", name = "u", descriptor = "Z")
	public boolean aBoolean116 = false;

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "I")
	private int anInt1835 = 0;

	@OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
	private int anInt1838 = 0;

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
	private int anInt1825 = 0;

	@OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
	private int anInt1837 = 128;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
	private int anInt1834 = -1;

	@OriginalMember(owner = "client!dw", name = "y", descriptor = "B")
	public byte aByte23 = 0;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLclient!gk;)V")
	public void method1539(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method1545(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIZIILclient!r;Lclient!i;Lclient!ar;IBILclient!i;II)Lclient!da;")
	private Class33 method1540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class162 arg5, @OriginalArg(6) Class151 arg6, @OriginalArg(7) Class18 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(11) Class151 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg12;
		@Pc(24) Class148 local24 = this.anInt1827 == -1 || arg1 == -1 ? null : arg7.method296(this.anInt1827);
		@Pc(33) boolean local33 = arg2 & this.aByte23 != 0;
		if (local24 != null) {
			local7 = arg12 | local24.method2587(false, arg1, arg8);
		}
		if (local33) {
			local7 |= this.aByte23 == 3 ? 7 : 2;
		}
		if (this.anInt1832 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt1837 != 128 || this.anInt1825 != 0) {
			local7 |= 0x5;
		}
		@Pc(91) Class21 local91 = this.aClass49_2.aClass21_14;
		@Pc(111) Class33 local111;
		synchronized (this.aClass49_2.aClass21_14) {
			local111 = (Class33) this.aClass49_2.aClass21_14.method324((long) (this.anInt1831 |= arg5.anInt8492 << 29));
		}
		if (local111 == null || arg5.method6881(local111.PA(), local7) != 0) {
			if (local111 != null) {
				local7 = arg5.method6846(local7, local111.PA());
			}
			@Pc(135) int local135 = local7;
			if (this.aShortArray51 != null) {
				local135 = local7 | 0x4000;
			}
			if (this.aShortArray54 != null) {
				local135 |= 0x8000;
			}
			@Pc(158) Class13 local158 = Static25.method356(this.anInt1826, this.aClass49_2.aClass229_15);
			if (local158 == null) {
				return null;
			}
			if (local158.anInt319 < 13) {
				local158.method245();
			}
			local111 = arg5.method6839(local158, local135, this.aClass49_2.anInt1075, this.anInt1835 + 64, this.anInt1838 + 850);
			@Pc(191) int local191;
			if (this.aShortArray51 != null) {
				for (local191 = 0; local191 < this.aShortArray51.length; local191++) {
					local111.d(this.aShortArray51[local191], this.aShortArray52[local191]);
				}
			}
			if (this.aShortArray54 != null) {
				for (local191 = 0; local191 < this.aShortArray54.length; local191++) {
					local111.DA(this.aShortArray54[local191], this.aShortArray53[local191]);
				}
			}
			local111.SA(local7);
			@Pc(243) Class21 local243 = this.aClass49_2.aClass21_14;
			synchronized (this.aClass49_2.aClass21_14) {
				this.aClass49_2.aClass21_14.method317(local111, (long) (this.anInt1831 |= arg5.anInt8492 << 29));
			}
		}
		@Pc(287) Class33 local287 = local24 == null ? local111.method7200(arg9, local7, true) : local24.method2585(local7, arg11, arg1, arg9, 0, local111, arg8);
		if (this.anInt1837 != 128 || this.anInt1832 != 128) {
			local287.R(this.anInt1837, this.anInt1832, this.anInt1837);
		}
		if (this.anInt1825 != 0) {
			if (this.anInt1825 == 90) {
				local287.M(4096);
			}
			if (this.anInt1825 == 180) {
				local287.M(8192);
			}
			if (this.anInt1825 == 270) {
				local287.M(12288);
			}
		}
		if (local33) {
			local287.ba(this.aByte23, this.anInt1834, arg6, arg10, arg0, arg4, arg3);
		}
		local287.SA(arg12);
		return local287;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILclient!ar;Lclient!r;II)Lclient!da;")
	public Class33 method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class18 arg2, @OriginalArg(4) Class162 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method1540(0, arg1, false, 0, 0, arg3, null, arg2, arg5, (byte) 5, null, arg0, arg4);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IBLclient!ar;IILclient!r;I)Lclient!da;")
	public Class33 method1544(@OriginalArg(0) int arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class162 arg4, @OriginalArg(6) int arg5) {
		return this.method1540(0, arg5, false, 0, 0, arg4, null, arg1, arg2, (byte) 2, null, arg0, arg3);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method1545(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt1826 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt1827 = arg1.method4518();
		} else if (arg0 == 4) {
			this.anInt1837 = arg1.method4518();
		} else if (arg0 == 5) {
			this.anInt1832 = arg1.method4518();
		} else if (arg0 == 6) {
			this.anInt1825 = arg1.method4518();
		} else if (arg0 == 7) {
			this.anInt1835 = arg1.method4464();
		} else if (arg0 == 8) {
			this.anInt1838 = arg1.method4464();
		} else if (arg0 == 9) {
			this.aByte23 = 3;
			this.anInt1834 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean116 = true;
		} else if (arg0 == 11) {
			this.aByte23 = 1;
		} else if (arg0 == 12) {
			this.aByte23 = 4;
		} else if (arg0 == 13) {
			this.aByte23 = 5;
		} else if (arg0 == 14) {
			this.aByte23 = 2;
			this.anInt1834 = arg1.method4464() * 256;
		} else if (arg0 == 15) {
			this.aByte23 = 3;
			this.anInt1834 = arg1.method4518();
		} else if (arg0 == 16) {
			this.aByte23 = 3;
			this.anInt1834 = arg1.method4509();
		} else {
			@Pc(130) int local130;
			@Pc(140) int local140;
			if (arg0 == 40) {
				local130 = arg1.method4464();
				this.aShortArray51 = new short[local130];
				this.aShortArray52 = new short[local130];
				for (local140 = 0; local140 < local130; local140++) {
					this.aShortArray51[local140] = (short) arg1.method4518();
					this.aShortArray52[local140] = (short) arg1.method4518();
				}
			} else if (arg0 == 41) {
				local130 = arg1.method4464();
				this.aShortArray54 = new short[local130];
				this.aShortArray53 = new short[local130];
				for (local140 = 0; local140 < local130; local140++) {
					this.aShortArray54[local140] = (short) arg1.method4518();
					this.aShortArray53[local140] = (short) arg1.method4518();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!r;IIIIIZIILclient!i;ILclient!i;Lclient!ar;)Lclient!da;")
	public Class33 method1546(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class151 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class151 arg9, @OriginalArg(12) Class18 arg10) {
		return this.method1540(arg1, arg5, true, arg4, arg6, arg0, arg9, arg10, arg8, (byte) 2, arg7, arg2, arg3);
	}
}
