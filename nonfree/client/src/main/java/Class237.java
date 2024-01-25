import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class237 {

	@OriginalMember(owner = "client!p", name = "b", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	public int anInt6457;

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	private int anInt6460;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!gda;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "B")
	public byte aByte63 = 0;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "I")
	private int anInt6456 = 128;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "I")
	private int anInt6455 = 0;

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	public int anInt6458 = -1;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	private int anInt6463 = -1;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Z")
	public boolean aBoolean443 = false;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	private int anInt6462 = 0;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "I")
	private int anInt6468 = 128;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "I")
	private int anInt6470 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!d;IILclient!wm;IZLclient!d;Lclient!oa;IIBZII)Lclient!ba;")
	private Class22 method5493(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class345 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class60 arg6, @OriginalArg(7) Class121 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg12;
		@Pc(23) Class108 local23 = this.anInt6458 == -1 || arg2 == -1 ? null : arg3.method7798(this.anInt6458);
		@Pc(35) boolean local35 = arg5 & this.aByte63 != 0;
		if (local23 != null) {
			local7 = arg12 | local23.method2189(arg9, false, arg2);
		}
		if (local35) {
			local7 |= this.aByte63 == 3 ? 7 : 2;
		}
		if (this.anInt6468 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6456 != 128 || this.anInt6462 != 0) {
			local7 |= 0x5;
		}
		@Pc(88) Class332 local88 = this.aClass117_1.aClass332_73;
		@Pc(108) Class22 local108;
		synchronized (this.aClass117_1.aClass332_73) {
			local108 = (Class22) this.aClass117_1.aClass332_73.method7502((long) (this.anInt6457 |= arg7.anInt8715 << 29));
		}
		if (local108 == null || arg7.method7150(local108.h(), local7) != 0) {
			if (local108 != null) {
				local7 = arg7.method7099(local7, local108.h());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray107 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray106 != null) {
				local132 |= 0x8000;
			}
			@Pc(155) Class274 local155 = Static250.method3550(this.aClass117_1.aClass251_52, this.anInt6460);
			if (local155 == null) {
				return null;
			}
			if (local155.anInt7670 < 13) {
				local155.method6335();
			}
			local108 = arg7.method7088(local155, local132, this.aClass117_1.anInt2786, this.anInt6470 + 64, this.anInt6455 + 850);
			@Pc(188) int local188;
			if (this.aShortArray107 != null) {
				for (local188 = 0; local188 < this.aShortArray107.length; local188++) {
					local108.UA(this.aShortArray107[local188], this.aShortArray108[local188]);
				}
			}
			if (this.aShortArray106 != null) {
				for (local188 = 0; local188 < this.aShortArray106.length; local188++) {
					local108.ka(this.aShortArray106[local188], this.aShortArray109[local188]);
				}
			}
			local108.ia(local7);
			@Pc(244) Class332 local244 = this.aClass117_1.aClass332_73;
			synchronized (this.aClass117_1.aClass332_73) {
				this.aClass117_1.aClass332_73.method7498((long) (this.anInt6457 |= arg7.anInt8715 << 29), local108);
			}
		}
		@Pc(288) Class22 local288 = local23 == null ? local108.method4699(arg10, local7, true) : local23.method2185(local7, arg10, local108, arg2, 0, arg9, arg11);
		if (this.anInt6456 != 128 || this.anInt6468 != 128) {
			local288.l(this.anInt6456, this.anInt6468, this.anInt6456);
		}
		if (this.anInt6462 != 0) {
			if (this.anInt6462 == 90) {
				local288.I(4096);
			}
			if (this.anInt6462 == 180) {
				local288.I(8192);
			}
			if (this.anInt6462 == 270) {
				local288.I(12288);
			}
		}
		if (local35) {
			local288.OA(this.aByte63, this.anInt6463, arg6, arg0, arg1, arg4, arg8);
		}
		local288.ia(arg12);
		return local288;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!dga;)V")
	public void method5494(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6041();
			if (local9 == 0) {
				return;
			}
			this.method5500(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILclient!oa;Lclient!wm;I)Lclient!ba;")
	public Class22 method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) Class345 arg5) {
		return this.method5493(null, 0, arg2, arg5, 0, false, null, arg4, 0, arg1, (byte) 2, arg0, arg3);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIBLclient!wm;ILclient!oa;I)Lclient!ba;")
	public Class22 method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class345 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class121 arg4, @OriginalArg(6) int arg5) {
		return this.method5493(null, 0, arg3, arg2, 0, false, null, arg4, 0, arg5, (byte) 5, arg0, arg1);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!wm;ZIIILclient!d;IILclient!d;Lclient!oa;II)Lclient!ba;")
	public Class22 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class60 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class60 arg8, @OriginalArg(10) Class121 arg9, @OriginalArg(12) int arg10) {
		return this.method5493(arg8, arg4, arg10, arg1, arg0, true, arg5, arg9, arg6, arg7, (byte) 2, arg3, arg2);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!dga;I)V")
	private void method5500(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt6460 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt6458 = arg1.method6006();
		} else if (arg0 == 4) {
			this.anInt6456 = arg1.method6006();
		} else if (arg0 == 5) {
			this.anInt6468 = arg1.method6006();
		} else if (arg0 == 6) {
			this.anInt6462 = arg1.method6006();
		} else if (arg0 == 7) {
			this.anInt6470 = arg1.method6041();
		} else if (arg0 == 8) {
			this.anInt6455 = arg1.method6041();
		} else if (arg0 == 9) {
			this.anInt6463 = 8224;
			this.aByte63 = 3;
		} else if (arg0 == 10) {
			this.aBoolean443 = true;
		} else if (arg0 == 11) {
			this.aByte63 = 1;
		} else if (arg0 == 12) {
			this.aByte63 = 4;
		} else if (arg0 == 13) {
			this.aByte63 = 5;
		} else if (arg0 == 14) {
			this.aByte63 = 2;
			this.anInt6463 = arg1.method6041() * 256;
		} else if (arg0 == 15) {
			this.aByte63 = 3;
			this.anInt6463 = arg1.method6006();
		} else if (arg0 == 16) {
			this.aByte63 = 3;
			this.anInt6463 = arg1.method6027();
		} else {
			@Pc(129) int local129;
			@Pc(139) int local139;
			if (arg0 == 40) {
				local129 = arg1.method6041();
				this.aShortArray107 = new short[local129];
				this.aShortArray108 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray107[local139] = (short) arg1.method6006();
					this.aShortArray108[local139] = (short) arg1.method6006();
				}
			} else if (arg0 == 41) {
				local129 = arg1.method6041();
				this.aShortArray106 = new short[local129];
				this.aShortArray109 = new short[local129];
				for (local139 = 0; local139 < local129; local139++) {
					this.aShortArray106[local139] = (short) arg1.method6006();
					this.aShortArray109[local139] = (short) arg1.method6006();
				}
			}
		}
	}
}
