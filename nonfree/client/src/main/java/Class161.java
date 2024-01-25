import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class161 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!ge;")
	public Class89 aClass89_2;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
	private int anInt4709;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	private int anInt4696 = 0;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public int anInt4699 = -1;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	private int anInt4700 = 0;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	private int anInt4707 = 0;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "B")
	public byte aByte75 = 0;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "Z")
	public boolean aBoolean340 = false;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
	private int anInt4702 = -1;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	private int anInt4706 = 128;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	private int anInt4712 = 128;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!aj;Lclient!na;IIIIILclient!na;IZZILclient!qa;)Lclient!c;")
	public Class7 method3580(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class146 arg7, @OriginalArg(8) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class30 arg10) {
		return this.method3582(arg1, arg5, arg0, arg7, arg8, true, arg9, arg10, (byte) 2, arg3, arg2, arg6, arg4);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!na;ZILclient!aj;Lclient!na;IZILclient!qa;BIIII)Lclient!c;")
	private Class7 method3582(@OriginalArg(0) Class146 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2, @OriginalArg(4) Class146 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class30 arg7, @OriginalArg(9) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg12;
		@Pc(23) Class233 local23 = this.anInt4699 == -1 || arg6 == -1 ? null : arg2.method286(this.anInt4699);
		@Pc(35) boolean local35 = arg5 & this.aByte75 != 0;
		if (local23 != null) {
			local7 = arg12 | local23.method5246(false, arg6, arg1);
		}
		if (local35) {
			local7 |= this.aByte75 == 3 ? 7 : 2;
		}
		if (this.anInt4706 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4712 != 128 || this.anInt4696 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class69 local86 = this.aClass89_2.aClass69_33;
		@Pc(106) Class7 local106;
		synchronized (this.aClass89_2.aClass69_33) {
			local106 = (Class7) this.aClass89_2.aClass69_33.method1591((long) (this.anInt4698 |= arg7.anInt5975 << 29));
		}
		if (local106 == null || arg7.method4674(local106.n(), local7) != 0) {
			if (local106 != null) {
				local7 = arg7.method4665(local7, local106.n());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray67 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray65 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class208 local153 = Static219.method3103(this.anInt4709, this.aClass89_2.aClass166_98);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt6202 < 13) {
				local153.method4813();
			}
			local106 = arg7.method4655(local153, local130, this.aClass89_2.anInt2591, this.anInt4700 + 64, this.anInt4707 + 850);
			@Pc(186) int local186;
			if (this.aShortArray67 != null) {
				for (local186 = 0; local186 < this.aShortArray67.length; local186++) {
					local106.N(this.aShortArray67[local186], this.aShortArray68[local186]);
				}
			}
			if (this.aShortArray65 != null) {
				for (local186 = 0; local186 < this.aShortArray65.length; local186++) {
					local106.YA(this.aShortArray65[local186], this.aShortArray66[local186]);
				}
			}
			local106.u(local7);
			@Pc(242) Class69 local242 = this.aClass89_2.aClass69_33;
			synchronized (this.aClass89_2.aClass69_33) {
				this.aClass89_2.aClass69_33.method1590((long) (this.anInt4698 |= arg7.anInt5975 << 29), local106);
			}
		}
		@Pc(286) Class7 local286 = local23 == null ? local106.method4077(arg8, local7, true) : local23.method5249(local106, 0, arg4, arg1, arg8, local7, arg6);
		if (this.anInt4712 != 128 || this.anInt4706 != 128) {
			local286.XA(this.anInt4712, this.anInt4706, this.anInt4712);
		}
		if (this.anInt4696 != 0) {
			if (this.anInt4696 == 90) {
				local286.k(4096);
			}
			if (this.anInt4696 == 180) {
				local286.k(8192);
			}
			if (this.anInt4696 == 270) {
				local286.k(12288);
			}
		}
		if (local35) {
			local286.ea(this.aByte75, this.anInt4702, arg3, arg0, arg10, arg11, arg9);
		}
		local286.u(arg12);
		return local286;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method3585(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4709 = arg0.method4877();
		} else if (arg1 == 2) {
			this.anInt4699 = arg0.method4877();
		} else if (arg1 == 4) {
			this.anInt4712 = arg0.method4877();
		} else if (arg1 == 5) {
			this.anInt4706 = arg0.method4877();
		} else if (arg1 == 6) {
			this.anInt4696 = arg0.method4877();
		} else if (arg1 == 7) {
			this.anInt4700 = arg0.method4864();
		} else if (arg1 == 8) {
			this.anInt4707 = arg0.method4864();
		} else if (arg1 == 9) {
			this.aByte75 = 3;
			this.anInt4702 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean340 = true;
		} else if (arg1 == 11) {
			this.aByte75 = 1;
		} else if (arg1 == 12) {
			this.aByte75 = 4;
		} else if (arg1 == 13) {
			this.aByte75 = 5;
		} else if (arg1 == 14) {
			this.aByte75 = 2;
			this.anInt4702 = arg0.method4864() * 256;
		} else if (arg1 == 15) {
			this.aByte75 = 3;
			this.anInt4702 = arg0.method4877();
		} else if (arg1 == 16) {
			this.aByte75 = 3;
			this.anInt4702 = arg0.method4872();
		} else {
			@Pc(118) int local118;
			@Pc(128) int local128;
			if (arg1 == 40) {
				local118 = arg0.method4864();
				this.aShortArray68 = new short[local118];
				this.aShortArray67 = new short[local118];
				for (local128 = 0; local128 < local118; local128++) {
					this.aShortArray67[local128] = (short) arg0.method4877();
					this.aShortArray68[local128] = (short) arg0.method4877();
				}
			} else if (arg1 == 41) {
				local118 = arg0.method4864();
				this.aShortArray66 = new short[local118];
				this.aShortArray65 = new short[local118];
				for (local128 = 0; local128 < local118; local128++) {
					this.aShortArray65[local128] = (short) arg0.method4877();
					this.aShortArray66[local128] = (short) arg0.method4877();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!qa;IBIIILclient!aj;)Lclient!c;")
	public Class7 method3586(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class10 arg5) {
		return this.method3582(null, arg2, arg5, null, arg1, false, arg4, arg0, (byte) 5, 0, 0, 0, arg3);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIILclient!qa;Lclient!aj;)Lclient!c;")
	public Class7 method3587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) Class10 arg5) {
		return this.method3582(null, arg0, arg5, null, arg3, false, arg1, arg4, (byte) 2, 0, 0, 0, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!tl;I)V")
	public void method3588(@OriginalArg(0) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method3585(arg0, local5);
		}
	}
}
