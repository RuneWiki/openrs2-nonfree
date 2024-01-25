import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class166 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!jg;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	private int anInt4336;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public int anInt4340;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	private int anInt4333 = -1;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	private int anInt4335 = 128;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	private int anInt4328 = 0;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public int anInt4334 = -1;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	private int anInt4332 = 0;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
	private int anInt4341 = 128;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "B")
	public byte aByte65 = 0;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	private int anInt4330 = 0;

	static {
		new Class96("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!na;IILclient!na;Lclient!cl;ZIILclient!qa;III)Lclient!c;")
	public Class37 method3598(@OriginalArg(1) Class70 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class70 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class121 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method3602(arg0, arg7, arg6, arg3, arg4, arg8, arg10, arg1, arg2, (byte) 2, arg5, arg9, true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!qa;Lclient!cl;IIZII)Lclient!c;")
	public Class37 method3600(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method3602(null, arg0, arg3, null, arg1, arg5, 0, arg2, 0, (byte) 5, arg4, 0, false);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!ti;)V")
	public void method3601(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method4548();
			if (local18 == 0) {
				return;
			}
			this.method3605(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!na;Lclient!qa;ILclient!na;Lclient!cl;IIIIIBIIZ)Lclient!c;")
	private Class37 method3602(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) Class45 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12) {
		@Pc(7) int local7 = arg7;
		@Pc(24) Class58 local24 = this.anInt4334 == -1 || arg10 == -1 ? null : arg4.method690(this.anInt4334);
		@Pc(33) boolean local33 = arg12 & this.aByte65 != 0;
		if (local24 != null) {
			local7 = arg7 | local24.method1133(arg5, false, arg10);
		}
		if (local33) {
			local7 |= this.aByte65 == 3 ? 7 : 2;
		}
		if (this.anInt4335 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt4341 != 128 || this.anInt4330 != 0) {
			local7 |= 0x5;
		}
		@Pc(88) Class151 local88 = this.aClass125_1.aClass151_90;
		@Pc(108) Class37 local108;
		synchronized (this.aClass125_1.aClass151_90) {
			local108 = (Class37) this.aClass125_1.aClass151_90.method3288((long) (this.anInt4340 |= arg1.anInt5745 << 29));
		}
		if (local108 == null || arg1.method4634(local108.n(), local7) != 0) {
			if (local108 != null) {
				local7 = arg1.method4643(local7, local108.n());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray71 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray73 != null) {
				local132 |= 0x8000;
			}
			@Pc(157) Class155 local157 = Static106.method1704(this.anInt4336, this.aClass125_1.aClass109_49);
			if (local157 == null) {
				return null;
			}
			if (local157.anInt4075 < 13) {
				local157.method3405();
			}
			local108 = arg1.method4617(local157, local132, this.aClass125_1.anInt3454, this.anInt4332 + 64, this.anInt4328 + 850);
			@Pc(190) int local190;
			if (this.aShortArray71 != null) {
				for (local190 = 0; local190 < this.aShortArray71.length; local190++) {
					local108.N(this.aShortArray71[local190], this.aShortArray74[local190]);
				}
			}
			if (this.aShortArray73 != null) {
				for (local190 = 0; local190 < this.aShortArray73.length; local190++) {
					local108.YA(this.aShortArray73[local190], this.aShortArray72[local190]);
				}
			}
			local108.u(local7);
			@Pc(246) Class151 local246 = this.aClass125_1.aClass151_90;
			synchronized (this.aClass125_1.aClass151_90) {
				this.aClass125_1.aClass151_90.method3291((long) (this.anInt4340 |= arg1.anInt5745 << 29), local108);
			}
		}
		@Pc(294) Class37 local294 = local24 == null ? local108.method4155(arg9, local7, true) : local24.method1134(arg10, local7, 0, arg9, arg5, local108, arg2);
		if (this.anInt4341 != 128 || this.anInt4335 != 128) {
			local294.XA(this.anInt4341, this.anInt4335, this.anInt4341);
		}
		if (this.anInt4330 != 0) {
			if (this.anInt4330 == 90) {
				local294.k(4096);
			}
			if (this.anInt4330 == 180) {
				local294.k(8192);
			}
			if (this.anInt4330 == 270) {
				local294.k(12288);
			}
		}
		if (local33) {
			local294.ea(this.aByte65, this.anInt4333, arg0, arg3, arg6, arg11, arg8);
		}
		local294.u(arg7);
		return local294;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!cl;Lclient!qa;IIIII)Lclient!c;")
	public Class37 method3603(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3602(null, arg1, arg2, null, arg0, arg3, 0, arg5, 0, (byte) 2, arg4, 0, false);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZLclient!ti;)V")
	private void method3605(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4336 = arg1.method4498();
		} else if (arg0 == 2) {
			this.anInt4334 = arg1.method4498();
		} else if (arg0 == 4) {
			this.anInt4341 = arg1.method4498();
		} else if (arg0 == 5) {
			this.anInt4335 = arg1.method4498();
		} else if (arg0 == 6) {
			this.anInt4330 = arg1.method4498();
		} else if (arg0 == 7) {
			this.anInt4332 = arg1.method4548();
		} else if (arg0 == 8) {
			this.anInt4328 = arg1.method4548();
		} else if (arg0 == 9) {
			this.aByte65 = 3;
			this.anInt4333 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean344 = true;
		} else if (arg0 == 11) {
			this.aByte65 = 1;
		} else if (arg0 == 12) {
			this.aByte65 = 4;
		} else if (arg0 == 13) {
			this.aByte65 = 5;
		} else if (arg0 == 14) {
			this.aByte65 = 2;
			this.anInt4333 = arg1.method4548() * 256;
		} else if (arg0 == 15) {
			this.aByte65 = 3;
			this.anInt4333 = arg1.method4498();
		} else if (arg0 == 16) {
			this.aByte65 = 3;
			this.anInt4333 = arg1.method4500();
		} else {
			@Pc(150) int local150;
			@Pc(160) int local160;
			if (arg0 == 40) {
				local150 = arg1.method4548();
				this.aShortArray74 = new short[local150];
				this.aShortArray71 = new short[local150];
				for (local160 = 0; local160 < local150; local160++) {
					this.aShortArray71[local160] = (short) arg1.method4498();
					this.aShortArray74[local160] = (short) arg1.method4498();
				}
			} else if (arg0 == 41) {
				local150 = arg1.method4548();
				this.aShortArray72 = new short[local150];
				this.aShortArray73 = new short[local150];
				for (local160 = 0; local160 < local150; local160++) {
					this.aShortArray73[local160] = (short) arg1.method4498();
					this.aShortArray72[local160] = (short) arg1.method4498();
				}
			}
		}
	}
}
