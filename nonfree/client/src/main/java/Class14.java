import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class14 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "Lclient!ph;")
	public Class190 aClass190_1;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	private int anInt319 = 128;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	private int anInt321 = -1;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	private int anInt320 = 0;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	private int anInt315 = 128;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	private int anInt327 = 0;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "B")
	public byte aByte2 = 0;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	public int anInt325 = -1;

	@OriginalMember(owner = "client!as", name = "B", descriptor = "I")
	private int anInt333 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!na;IIZILclient!rh;IIILclient!qa;ILclient!na;I)Lclient!c;")
	public Class33 method267(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class213 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class128 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class163 arg9, @OriginalArg(12) int arg10) {
		return this.method273(arg0, arg5, arg4, arg1, arg10, arg8, (byte) 2, arg6, true, arg2, arg7, arg9, arg3);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!qa;IILclient!rh;IB)Lclient!c;")
	public Class33 method268(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class213 arg4, @OriginalArg(5) int arg5) {
		return this.method273(null, arg5, 0, 0, arg3, arg0, (byte) 2, 0, false, arg2, arg1, null, arg4);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!dh;I)V")
	private void method270(@OriginalArg(1) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt318 = arg0.method4485();
		} else if (arg1 == 2) {
			this.anInt325 = arg0.method4485();
		} else if (arg1 == 4) {
			this.anInt319 = arg0.method4485();
		} else if (arg1 == 5) {
			this.anInt315 = arg0.method4485();
		} else if (arg1 == 6) {
			this.anInt333 = arg0.method4485();
		} else if (arg1 == 7) {
			this.anInt320 = arg0.method4463();
		} else if (arg1 == 8) {
			this.anInt327 = arg0.method4463();
		} else if (arg1 == 9) {
			this.aByte2 = 3;
			this.anInt321 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean27 = true;
		} else if (arg1 == 11) {
			this.aByte2 = 1;
		} else if (arg1 == 12) {
			this.aByte2 = 4;
		} else if (arg1 == 13) {
			this.aByte2 = 5;
		} else if (arg1 == 14) {
			this.aByte2 = 2;
			this.anInt321 = arg0.method4463() * 256;
		} else if (arg1 == 15) {
			this.aByte2 = 3;
			this.anInt321 = arg0.method4485();
		} else if (arg1 == 16) {
			this.aByte2 = 3;
			this.anInt321 = arg0.method4487();
		} else {
			@Pc(130) int local130;
			@Pc(140) int local140;
			if (arg1 == 40) {
				local130 = arg0.method4463();
				this.aShortArray9 = new short[local130];
				this.aShortArray7 = new short[local130];
				for (local140 = 0; local140 < local130; local140++) {
					this.aShortArray9[local140] = (short) arg0.method4485();
					this.aShortArray7[local140] = (short) arg0.method4485();
				}
			} else if (arg1 == 41) {
				local130 = arg0.method4463();
				this.aShortArray10 = new short[local130];
				this.aShortArray8 = new short[local130];
				for (local140 = 0; local140 < local130; local140++) {
					this.aShortArray8[local140] = (short) arg0.method4485();
					this.aShortArray10[local140] = (short) arg0.method4485();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!na;ZIIIIIBIZILclient!qa;Lclient!na;Lclient!rh;)Lclient!c;")
	private Class33 method273(@OriginalArg(0) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class128 arg10, @OriginalArg(12) Class163 arg11, @OriginalArg(13) Class213 arg12) {
		@Pc(7) int local7 = arg1;
		@Pc(24) Class171 local24 = this.anInt325 == -1 || arg5 == -1 ? null : arg12.method4410(this.anInt325);
		@Pc(36) boolean local36 = arg8 & this.aByte2 != 0;
		if (local24 != null) {
			local7 = arg1 | local24.method3428(arg5, arg4, false);
		}
		if (local36) {
			local7 |= this.aByte2 == 3 ? 7 : 2;
		}
		if (this.anInt315 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt319 != 128 || this.anInt333 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class167 local86 = this.aClass190_1.aClass167_72;
		@Pc(106) Class33 local106;
		synchronized (this.aClass190_1.aClass167_72) {
			local106 = (Class33) this.aClass190_1.aClass167_72.method3386((long) (this.anInt322 |= arg10.anInt4410 << 29));
		}
		if (local106 == null || arg10.method3605(local106.n(), local7) != 0) {
			if (local106 != null) {
				local7 = arg10.method3554(local7, local106.n());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray9 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray8 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class199 local153 = Static443.method4784(this.aClass190_1.aClass113_94, this.anInt318);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt5301 < 13) {
				local153.method4137();
			}
			local106 = arg10.method3602(local153, local130, this.aClass190_1.anInt5118, this.anInt320 + 64, this.anInt327 + 850);
			@Pc(186) int local186;
			if (this.aShortArray9 != null) {
				for (local186 = 0; local186 < this.aShortArray9.length; local186++) {
					local106.N(this.aShortArray9[local186], this.aShortArray7[local186]);
				}
			}
			if (this.aShortArray8 != null) {
				for (local186 = 0; local186 < this.aShortArray8.length; local186++) {
					local106.YA(this.aShortArray8[local186], this.aShortArray10[local186]);
				}
			}
			local106.u(local7);
			@Pc(238) Class167 local238 = this.aClass190_1.aClass167_72;
			synchronized (this.aClass190_1.aClass167_72) {
				this.aClass190_1.aClass167_72.method3392(local106, (long) (this.anInt322 |= arg10.anInt4410 << 29));
			}
		}
		@Pc(282) Class33 local282 = local24 == null ? local106.method5383(arg6, local7, true) : local24.method3431(arg4, local7, arg6, 0, arg9, local106, arg5);
		if (this.anInt319 != 128 || this.anInt315 != 128) {
			local282.XA(this.anInt319, this.anInt315, this.anInt319);
		}
		if (this.anInt333 != 0) {
			if (this.anInt333 == 90) {
				local282.k(4096);
			}
			if (this.anInt333 == 180) {
				local282.k(8192);
			}
			if (this.anInt333 == 270) {
				local282.k(12288);
			}
		}
		if (local36) {
			local282.ea(this.aByte2, this.anInt321, arg0, arg11, arg7, arg2, arg3);
		}
		local282.u(arg1);
		return local282;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!dh;B)V")
	public void method275(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method270(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!rh;Lclient!qa;III)Lclient!c;")
	public Class33 method276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class213 arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method273(null, arg4, 0, 0, arg0, arg5, (byte) 5, 0, false, arg1, arg3, null, arg2);
	}
}
