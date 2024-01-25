import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class172 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!uf;")
	public Class246 aClass246_1;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
	private int anInt4075 = -1;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "B")
	public byte aByte72 = 0;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
	private int anInt4082 = 0;

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
	private int anInt4083 = 0;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
	private int anInt4085 = 0;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
	private int anInt4079 = 128;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
	private int anInt4086 = 128;

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
	public int anInt4088 = -1;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method3239(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4077 = arg0.method5028();
		} else if (arg1 == 2) {
			this.anInt4088 = arg0.method5028();
		} else if (arg1 == 4) {
			this.anInt4086 = arg0.method5028();
		} else if (arg1 == 5) {
			this.anInt4079 = arg0.method5028();
		} else if (arg1 == 6) {
			this.anInt4085 = arg0.method5028();
		} else if (arg1 == 7) {
			this.anInt4083 = arg0.method5007();
		} else if (arg1 == 8) {
			this.anInt4082 = arg0.method5007();
		} else if (arg1 == 9) {
			this.aByte72 = 3;
			this.anInt4075 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean302 = true;
		} else if (arg1 == 11) {
			this.aByte72 = 1;
		} else if (arg1 == 12) {
			this.aByte72 = 4;
		} else if (arg1 == 13) {
			this.aByte72 = 5;
		} else if (arg1 == 14) {
			this.aByte72 = 2;
			this.anInt4075 = arg0.method5007() * 256;
		} else if (arg1 == 15) {
			this.aByte72 = 3;
			this.anInt4075 = arg0.method5028();
		} else if (arg1 == 16) {
			this.aByte72 = 3;
			this.anInt4075 = arg0.method4997();
		} else {
			@Pc(148) int local148;
			@Pc(158) int local158;
			if (arg1 == 40) {
				local148 = arg0.method5007();
				this.aShortArray79 = new short[local148];
				this.aShortArray77 = new short[local148];
				for (local158 = 0; local158 < local148; local158++) {
					this.aShortArray79[local158] = (short) arg0.method5028();
					this.aShortArray77[local158] = (short) arg0.method5028();
				}
			} else if (arg1 == 41) {
				local148 = arg0.method5007();
				this.aShortArray76 = new short[local148];
				this.aShortArray78 = new short[local148];
				for (local158 = 0; local158 < local148; local158++) {
					this.aShortArray76[local158] = (short) arg0.method5028();
					this.aShortArray78[local158] = (short) arg0.method5028();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZLclient!ya;ILclient!in;I)Lclient!t;")
	public Class116 method3240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class135 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class125 arg4, @OriginalArg(6) int arg5) {
		return this.method3246(null, arg3, arg4, null, arg2, arg1, 0, (byte) 5, arg5, 0, 0, arg0, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method3243(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5007();
			if (local9 == 0) {
				return;
			}
			this.method3239(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!in;IBIILclient!ya;I)Lclient!t;")
	public Class116 method3245(@OriginalArg(0) Class125 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class135 arg4, @OriginalArg(6) int arg5) {
		return this.method3246(null, arg5, arg0, null, arg4, arg3, 0, (byte) 2, arg1, 0, 0, arg2, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ta;ILclient!in;Lclient!ta;Lclient!ya;IIBIIIBIZ)Lclient!t;")
	private Class116 method3246(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) Class41 arg3, @OriginalArg(4) Class135 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(12) int local12 = arg11;
		@Pc(28) Class119 local28 = this.anInt4088 == -1 || arg1 == -1 ? null : arg2.method2389(this.anInt4088);
		@Pc(37) boolean local37 = arg12 & this.aByte72 != 0;
		if (local28 != null) {
			local12 = arg11 | local28.method2293(false, arg1, arg5);
		}
		if (local37) {
			local12 |= this.aByte72 == 3 ? 7 : 2;
		}
		if (this.anInt4079 != 128) {
			local12 |= 0x2;
		}
		if (this.anInt4086 != 128 || this.anInt4085 != 0) {
			local12 |= 0x5;
		}
		@Pc(90) Class137 local90 = this.aClass246_1.aClass137_55;
		@Pc(110) Class116 local110;
		synchronized (this.aClass246_1.aClass137_55) {
			local110 = (Class116) this.aClass246_1.aClass137_55.method2744((long) (this.anInt4076 |= arg4.anInt6589 << 29));
		}
		if (local110 == null || arg4.method5356(local110.P(), local12) != 0) {
			if (local110 != null) {
				local12 = arg4.method5399(local12, local110.P());
			}
			@Pc(137) int local137 = local12;
			if (this.aShortArray79 != null) {
				local137 = local12 | 0x4000;
			}
			if (this.aShortArray76 != null) {
				local137 |= 0x8000;
			}
			@Pc(160) Class166 local160 = Static305.method3992(this.anInt4077, this.aClass246_1.aClass211_89);
			if (local160 == null) {
				return null;
			}
			if (local160.anInt4010 < 13) {
				local160.method3203();
			}
			local110 = arg4.method5391(local160, local137, this.aClass246_1.anInt6579, this.anInt4083 + 64, this.anInt4082 + 850);
			@Pc(193) int local193;
			if (this.aShortArray79 != null) {
				for (local193 = 0; local193 < this.aShortArray79.length; local193++) {
					local110.BA(this.aShortArray79[local193], this.aShortArray77[local193]);
				}
			}
			if (this.aShortArray76 != null) {
				for (local193 = 0; local193 < this.aShortArray76.length; local193++) {
					local110.I(this.aShortArray76[local193], this.aShortArray78[local193]);
				}
			}
			local110.UA(local12);
			@Pc(249) Class137 local249 = this.aClass246_1.aClass137_55;
			synchronized (this.aClass246_1.aClass137_55) {
				this.aClass246_1.aClass137_55.method2732((long) (this.anInt4076 |= arg4.anInt6589 << 29), local110);
			}
		}
		@Pc(293) Class116 local293 = local28 == null ? local110.method3123(arg7, local12, true) : local28.method2295(0, local12, arg7, arg5, arg1, arg8, local110);
		if (this.anInt4086 != 128 || this.anInt4079 != 128) {
			local293.H(this.anInt4086, this.anInt4079, this.anInt4086);
		}
		if (this.anInt4085 != 0) {
			if (this.anInt4085 == 90) {
				local293.Q(4096);
			}
			if (this.anInt4085 == 180) {
				local293.Q(8192);
			}
			if (this.anInt4085 == 270) {
				local293.Q(12288);
			}
		}
		if (local37) {
			local293.h(this.aByte72, this.anInt4075, arg0, arg3, arg10, arg9, arg6);
		}
		local293.UA(arg11);
		return local293;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ya;ILclient!ta;Lclient!in;ILclient!ta;ZIIBIII)Lclient!t;")
	public Class116 method3247(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class41 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3246(arg2, arg6, arg3, arg5, arg0, arg7, arg10, (byte) 2, arg8, arg9, arg1, arg4, true);
	}
}
