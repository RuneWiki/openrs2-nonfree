import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class203 {

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public int anInt5603;

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "Lclient!uv;")
	public Class247 aClass247_1;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
	private int anInt5612;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	private int anInt5598 = 128;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	private int anInt5606 = 0;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	private int anInt5601 = 0;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	private int anInt5607 = 128;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "B")
	public byte aByte86 = 0;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
	private int anInt5614 = -1;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	private int anInt5600 = 0;

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
	public int anInt5615 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!an;IIILclient!ya;I)Lclient!t;")
	public Class91 method4517(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class49 arg5) {
		return this.method4525(arg5, 0, null, 0, arg4, arg3, arg2, arg1, (byte) 2, 0, arg0, false, null);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ya;IIZIILclient!an;)Lclient!t;")
	public Class91 method4518(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class12 arg5) {
		return this.method4525(arg0, 0, null, 0, arg4, arg1, arg2, arg5, (byte) 5, 0, arg3, false, null);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!si;IB)V")
	private void method4521(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5612 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt5615 = arg0.method5500();
		} else if (arg1 == 4) {
			this.anInt5607 = arg0.method5500();
		} else if (arg1 == 5) {
			this.anInt5598 = arg0.method5500();
		} else if (arg1 == 6) {
			this.anInt5601 = arg0.method5500();
		} else if (arg1 == 7) {
			this.anInt5600 = arg0.method5495();
		} else if (arg1 == 8) {
			this.anInt5606 = arg0.method5495();
		} else if (arg1 == 9) {
			this.anInt5614 = 8224;
			this.aByte86 = 3;
		} else if (arg1 == 10) {
			this.aBoolean398 = true;
		} else if (arg1 == 11) {
			this.aByte86 = 1;
		} else if (arg1 == 12) {
			this.aByte86 = 4;
		} else if (arg1 == 13) {
			this.aByte86 = 5;
		} else if (arg1 == 14) {
			this.aByte86 = 2;
			this.anInt5614 = arg0.method5495() * 256;
		} else if (arg1 == 15) {
			this.aByte86 = 3;
			this.anInt5614 = arg0.method5500();
		} else if (arg1 == 16) {
			this.aByte86 = 3;
			this.anInt5614 = arg0.method5508();
		} else {
			@Pc(138) int local138;
			@Pc(148) int local148;
			if (arg1 == 40) {
				local138 = arg0.method5495();
				this.aShortArray106 = new short[local138];
				this.aShortArray104 = new short[local138];
				for (local148 = 0; local148 < local138; local148++) {
					this.aShortArray106[local148] = (short) arg0.method5500();
					this.aShortArray104[local148] = (short) arg0.method5500();
				}
			} else if (arg1 == 41) {
				local138 = arg0.method5495();
				this.aShortArray107 = new short[local138];
				this.aShortArray105 = new short[local138];
				for (local148 = 0; local148 < local138; local148++) {
					this.aShortArray107[local148] = (short) arg0.method5500();
					this.aShortArray105[local148] = (short) arg0.method5500();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ya;ILclient!an;ZILclient!ta;IIIIILclient!ta;I)Lclient!t;")
	public Class91 method4522(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(5) Class64 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class64 arg9, @OriginalArg(12) int arg10) {
		return this.method4525(arg0, arg7, arg9, arg4, arg6, arg5, arg10, arg2, (byte) 2, arg1, arg8, true, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ya;ILclient!ta;IIIILclient!an;BIIIZLclient!ta;)Lclient!t;")
	private Class91 method4525(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class12 arg7, @OriginalArg(8) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class64 arg12) {
		@Pc(7) int local7 = arg6;
		@Pc(22) Class250 local22 = this.anInt5615 == -1 || arg5 == -1 ? null : arg7.method255(this.anInt5615);
		@Pc(32) boolean local32 = arg11 & this.aByte86 != 0;
		if (local22 != null) {
			local7 = arg6 | local22.method5547(false, arg10, arg5);
		}
		if (local32) {
			local7 |= this.aByte86 == 3 ? 7 : 2;
		}
		if (this.anInt5598 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5607 != 128 || this.anInt5601 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class171 local83 = this.aClass247_1.aClass171_55;
		@Pc(103) Class91 local103;
		synchronized (this.aClass247_1.aClass171_55) {
			local103 = (Class91) this.aClass247_1.aClass171_55.method3941((long) (this.anInt5603 |= arg0.anInt5543 << 29));
		}
		if (local103 == null || arg0.method4429(local103.P(), local7) != 0) {
			if (local103 != null) {
				local7 = arg0.method4451(local7, local103.P());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray106 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray107 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class146 local153 = Static152.method2537(this.aClass247_1.aClass160_79, this.anInt5612);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt4095 < 13) {
				local153.method3325();
			}
			local103 = arg0.method4414(local153, local130, this.aClass247_1.anInt6853, this.anInt5600 + 64, this.anInt5606 + 850);
			@Pc(188) int local188;
			if (this.aShortArray106 != null) {
				for (local188 = 0; local188 < this.aShortArray106.length; local188++) {
					local103.BA(this.aShortArray106[local188], this.aShortArray104[local188]);
				}
			}
			if (this.aShortArray107 != null) {
				for (local188 = 0; local188 < this.aShortArray107.length; local188++) {
					local103.I(this.aShortArray107[local188], this.aShortArray105[local188]);
				}
			}
			local103.UA(local7);
			@Pc(236) Class171 local236 = this.aClass247_1.aClass171_55;
			synchronized (this.aClass247_1.aClass171_55) {
				this.aClass247_1.aClass171_55.method3940((long) (this.anInt5603 |= arg0.anInt5543 << 29), local103);
			}
		}
		@Pc(280) Class91 local280 = local22 == null ? local103.method3285(arg8, local7, true) : local22.method5548(local7, arg4, 0, local103, arg5, arg10, arg8);
		if (this.anInt5607 != 128 || this.anInt5598 != 128) {
			local280.H(this.anInt5607, this.anInt5598, this.anInt5607);
		}
		if (this.anInt5601 != 0) {
			if (this.anInt5601 == 90) {
				local280.Q(4096);
			}
			if (this.anInt5601 == 180) {
				local280.Q(8192);
			}
			if (this.anInt5601 == 270) {
				local280.Q(12288);
			}
		}
		if (local32) {
			local280.h(this.aByte86, this.anInt5614, arg12, arg2, arg9, arg1, arg3);
		}
		local280.UA(arg6);
		return local280;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!si;I)V")
	public void method4529(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5495();
			if (local9 == 0) {
				return;
			}
			this.method4521(arg0, local9);
		}
	}
}
