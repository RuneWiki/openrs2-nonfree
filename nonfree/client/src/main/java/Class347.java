import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tba")
public final class Class347 {

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!tba", name = "o", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "I")
	public int anInt9349;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Lclient!kga;")
	public Class209 aClass209_2;

	@OriginalMember(owner = "client!tba", name = "r", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
	private int anInt9358;

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
	private int anInt9347 = 128;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
	private int anInt9350 = 0;

	@OriginalMember(owner = "client!tba", name = "v", descriptor = "I")
	private int anInt9357 = 0;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
	private int anInt9353 = 0;

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "Z")
	public boolean aBoolean800 = false;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
	private int anInt9359 = -1;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
	public int anInt9356 = -1;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "B")
	public byte aByte124 = 0;

	@OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
	private int anInt9354 = 128;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!ha;ILclient!cb;I)Lclient!ka;")
	public Class45 method8247(@OriginalArg(0) byte arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class53 arg3) {
		return this.method8251((Class133) null, arg0, arg2, 0, arg3, (Class133) null, arg1, 0, 0, false);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!et;II)V")
	private void method8248(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9358 = arg0.method8575();
		} else if (arg1 == 2) {
			this.anInt9356 = arg0.method8575();
		} else if (arg1 == 4) {
			this.anInt9354 = arg0.method8575();
		} else if (arg1 == 5) {
			this.anInt9347 = arg0.method8575();
		} else if (arg1 == 6) {
			this.anInt9353 = arg0.method8575();
		} else if (arg1 == 7) {
			this.anInt9357 = arg0.method8581(-17416);
		} else if (arg1 == 8) {
			this.anInt9350 = arg0.method8581(-17416);
		} else if (arg1 == 9) {
			this.aByte124 = 3;
			this.anInt9359 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean800 = true;
		} else if (arg1 == 11) {
			this.aByte124 = 1;
		} else if (arg1 == 12) {
			this.aByte124 = 4;
		} else if (arg1 == 13) {
			this.aByte124 = 5;
		} else if (arg1 == 14) {
			this.aByte124 = 2;
			this.anInt9359 = arg0.method8581(-17416) * 256;
		} else if (arg1 == 15) {
			this.aByte124 = 3;
			this.anInt9359 = arg0.method8575();
		} else if (arg1 == 16) {
			this.aByte124 = 3;
			this.anInt9359 = arg0.method8555(-9372);
		} else {
			@Pc(189) int local189;
			@Pc(199) int local199;
			if (arg1 == 40) {
				local189 = arg0.method8581(-17416);
				this.aShortArray139 = new short[local189];
				this.aShortArray140 = new short[local189];
				for (local199 = 0; local199 < local189; local199++) {
					this.aShortArray139[local199] = (short) arg0.method8575();
					this.aShortArray140[local199] = (short) arg0.method8575();
				}
			} else if (arg1 == 41) {
				local189 = arg0.method8581(-17416);
				this.aShortArray137 = new short[local189];
				this.aShortArray138 = new short[local189];
				for (local199 = 0; local199 < local189; local199++) {
					this.aShortArray137[local199] = (short) arg0.method8575();
					this.aShortArray138[local199] = (short) arg0.method8575();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!et;I)V")
	public void method8249(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8581(-17416);
			if (local5 == 0) {
				return;
			}
			this.method8248(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!s;BIIILclient!cb;Lclient!s;Lclient!ha;IIZ)Lclient!ka;")
	public Class45 method8251(@OriginalArg(0) Class133 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class53 arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) Class145 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(13) int local13 = arg2;
		@Pc(26) boolean local26 = arg9 & this.aByte124 != 0;
		if (arg4 != null) {
			local13 = arg2 | arg4.method4082();
		}
		if (local26) {
			local13 |= this.aByte124 == 3 ? 7 : 2;
		}
		if (this.anInt9347 != 128) {
			local13 |= 0x2;
		}
		if (this.anInt9354 != 128 || this.anInt9353 != 0) {
			local13 |= 0x5;
		}
		@Pc(78) Class85 local78 = this.aClass209_2.aClass85_37;
		@Pc(98) Class45 local98;
		synchronized (this.aClass209_2.aClass85_37) {
			local98 = (Class45) this.aClass209_2.aClass85_37.method1737((long) (this.anInt9349 |= arg6.anInt11056 << 29));
		}
		if (local98 == null || arg6.method9686(local98.ua(), local13) != 0) {
			if (local98 != null) {
				local13 = arg6.method9695(local13, local98.ua());
			}
			@Pc(126) int local126 = local13;
			if (this.aShortArray139 != null) {
				local126 = local13 | 0x4000;
			}
			if (this.aShortArray137 != null) {
				local126 |= 0x8000;
			}
			@Pc(149) Class229 local149 = Static594.method8178(this.anInt9358, this.aClass209_2.aClass254_97);
			if (local149 == null) {
				return null;
			}
			if (local149.anInt5933 < 13) {
				local149.method5315();
			}
			local98 = arg6.method9700(local149, local126, this.aClass209_2.anInt5036, this.anInt9357 + 64, this.anInt9350 + 850);
			@Pc(187) int local187;
			if (this.aShortArray139 != null) {
				for (local187 = 0; local187 < this.aShortArray139.length; local187++) {
					local98.ia(this.aShortArray139[local187], this.aShortArray140[local187]);
				}
			}
			if (this.aShortArray137 != null) {
				for (local187 = 0; local187 < this.aShortArray137.length; local187++) {
					local98.aa(this.aShortArray137[local187], this.aShortArray138[local187]);
				}
			}
			local98.s(local13);
			@Pc(241) Class85 local241 = this.aClass209_2.aClass85_37;
			synchronized (this.aClass209_2.aClass85_37) {
				this.aClass209_2.aClass85_37.method1745((long) (this.anInt9349 |= arg6.anInt11056 << 29), 16383, local98);
			}
		}
		@Pc(274) Class45 local274 = local98.method5768(arg1, local13, true);
		if (arg4 != null) {
			arg4.method4097(0, local274);
		}
		if (this.anInt9354 != 128 || this.anInt9347 != 128) {
			local274.O(this.anInt9354, this.anInt9347, this.anInt9354);
		}
		if (this.anInt9353 != 0) {
			if (this.anInt9353 == 90) {
				local274.a(4096);
			}
			if (this.anInt9353 == 180) {
				local274.a(8192);
			}
			if (this.anInt9353 == 270) {
				local274.a(12288);
			}
		}
		if (local26) {
			local274.p(this.aByte124, this.anInt9359, arg0, arg5, arg3, arg7, arg8);
		}
		local274.s(arg2);
		return local274;
	}
}
