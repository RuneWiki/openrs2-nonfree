import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class212 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int anInt6057;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	private int anInt6059;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Lclient!rm;")
	public Class278 aClass278_1;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	private int anInt6061 = 0;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "B")
	public byte aByte56 = 0;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	private int anInt6065 = 128;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	private int anInt6060 = 128;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	private int anInt6066 = -1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public int anInt6056 = -1;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	public boolean aBoolean450 = false;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
	private int anInt6071 = 0;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
	private int anInt6072 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!d;Lclient!oa;ILclient!ir;IIZILclient!d;IIII)Lclient!ba;")
	public Class23 method5185(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class156 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class62 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		return this.method5190(arg9, arg1, arg3, arg0, arg2, (byte) 2, arg7, arg5, true, arg10, arg4, arg6, arg8);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!iaa;B)V")
	private void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt6059 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt6056 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt6065 = arg1.method4999();
		} else if (arg0 == 5) {
			this.anInt6060 = arg1.method4999();
		} else if (arg0 == 6) {
			this.anInt6061 = arg1.method4999();
		} else if (arg0 == 7) {
			this.anInt6072 = arg1.method4966();
		} else if (arg0 == 8) {
			this.anInt6071 = arg1.method4966();
		} else if (arg0 == 9) {
			this.anInt6066 = 8224;
			this.aByte56 = 3;
		} else if (arg0 == 10) {
			this.aBoolean450 = true;
		} else if (arg0 == 11) {
			this.aByte56 = 1;
		} else if (arg0 == 12) {
			this.aByte56 = 4;
		} else if (arg0 == 13) {
			this.aByte56 = 5;
		} else if (arg0 == 14) {
			this.aByte56 = 2;
			this.anInt6066 = arg1.method4966() * 256;
		} else if (arg0 == 15) {
			this.aByte56 = 3;
			this.anInt6066 = arg1.method4999();
		} else if (arg0 == 16) {
			this.aByte56 = 3;
			this.anInt6066 = arg1.method5000();
		} else {
			@Pc(143) int local143;
			@Pc(153) int local153;
			if (arg0 == 40) {
				local143 = arg1.method4966();
				this.aShortArray67 = new short[local143];
				this.aShortArray68 = new short[local143];
				for (local153 = 0; local153 < local143; local153++) {
					this.aShortArray67[local153] = (short) arg1.method4999();
					this.aShortArray68[local153] = (short) arg1.method4999();
				}
			} else if (arg0 == 41) {
				local143 = arg1.method4966();
				this.aShortArray66 = new short[local143];
				this.aShortArray69 = new short[local143];
				for (local153 = 0; local153 < local143; local153++) {
					this.aShortArray66[local153] = (short) arg1.method4999();
					this.aShortArray69[local153] = (short) arg1.method4999();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method5189(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4966();
			if (local7 == 0) {
				return;
			}
			this.method5187(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBLclient!oa;Lclient!ir;Lclient!d;IBLclient!d;IZIIII)Lclient!ba;")
	private Class23 method5190(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) Class156 arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) Class62 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg4;
		@Pc(23) Class16 local23 = this.anInt6056 == -1 || arg11 == -1 ? null : arg2.method4101(this.anInt6056);
		@Pc(32) boolean local32 = arg8 & this.aByte56 != 0;
		if (local23 != null) {
			local7 = arg4 | local23.method645(arg11, false, arg7);
		}
		if (local32) {
			local7 |= this.aByte56 == 3 ? 7 : 2;
		}
		if (this.anInt6060 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6065 != 128 || this.anInt6061 != 0) {
			local7 |= 0x5;
		}
		@Pc(80) Class245 local80 = this.aClass278_1.aClass245_57;
		@Pc(100) Class23 local100;
		synchronized (this.aClass278_1.aClass245_57) {
			local100 = (Class23) this.aClass278_1.aClass245_57.method6082((long) (this.anInt6057 |= arg1.anInt6348 << 29));
		}
		if (local100 == null || arg1.method5468(local100.h(), local7) != 0) {
			if (local100 != null) {
				local7 = arg1.method5416(local7, local100.h());
			}
			@Pc(124) int local124 = local7;
			if (this.aShortArray67 != null) {
				local124 = local7 | 0x4000;
			}
			if (this.aShortArray66 != null) {
				local124 |= 0x8000;
			}
			@Pc(147) Class260 local147 = Static198.method3731(this.anInt6059, this.aClass278_1.aClass168_101);
			if (local147 == null) {
				return null;
			}
			if (local147.anInt7693 < 13) {
				local147.method6423();
			}
			local100 = arg1.method5404(local147, local124, this.aClass278_1.anInt8191, this.anInt6072 + 64, this.anInt6071 + 850);
			@Pc(180) int local180;
			if (this.aShortArray67 != null) {
				for (local180 = 0; local180 < this.aShortArray67.length; local180++) {
					local100.UA(this.aShortArray67[local180], this.aShortArray68[local180]);
				}
			}
			if (this.aShortArray66 != null) {
				for (local180 = 0; local180 < this.aShortArray66.length; local180++) {
					local100.ka(this.aShortArray66[local180], this.aShortArray69[local180]);
				}
			}
			local100.ia(local7);
			@Pc(232) Class245 local232 = this.aClass278_1.aClass245_57;
			synchronized (this.aClass278_1.aClass245_57) {
				this.aClass278_1.aClass245_57.method6075(local100, (long) (this.anInt6057 |= arg1.anInt6348 << 29));
			}
		}
		@Pc(276) Class23 local276 = local23 == null ? local100.method7068(arg5, local7, true) : local23.method648(arg5, local100, 0, arg12, local7, arg7, arg11);
		if (this.anInt6065 != 128 || this.anInt6060 != 128) {
			local276.l(this.anInt6065, this.anInt6060, this.anInt6065);
		}
		if (this.anInt6061 != 0) {
			if (this.anInt6061 == 90) {
				local276.I(4096);
			}
			if (this.anInt6061 == 180) {
				local276.I(8192);
			}
			if (this.anInt6061 == 270) {
				local276.I(12288);
			}
		}
		if (local32) {
			local276.OA(this.aByte56, this.anInt6066, arg6, arg3, arg10, arg9, arg0);
		}
		local276.ia(arg4);
		return local276;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!oa;IILclient!ir;II)Lclient!ba;")
	public Class23 method5191(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class156 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method5190(0, arg1, arg3, null, arg4, (byte) 2, null, arg5, false, 0, 0, arg0, arg2);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ir;IIILclient!oa;II)Lclient!ba;")
	public Class23 method5192(@OriginalArg(0) Class156 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method5190(0, arg3, arg0, null, arg4, (byte) 5, null, arg2, false, 0, 0, arg5, arg1);
	}
}
