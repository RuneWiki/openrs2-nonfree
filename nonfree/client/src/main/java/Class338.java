import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class338 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "[S")
	private short[] aShortArray120;

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "Lclient!dv;")
	public Class91 aClass91_2;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "[S")
	private short[] aShortArray121;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	private int anInt9384;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	public int anInt9386;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public int anInt9376 = -1;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	private int anInt9381 = 128;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	private int anInt9383 = 0;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "B")
	public byte aByte128 = 0;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	private int anInt9388 = 0;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	private int anInt9379 = 128;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	private int anInt9382 = -1;

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "Z")
	public boolean aBoolean794 = false;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	private int anInt9385 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!mc;I)V")
	private void method7930(@OriginalArg(1) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9384 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt9376 = arg0.method7860();
		} else if (arg1 == 4) {
			this.anInt9379 = arg0.method7860();
		} else if (arg1 == 5) {
			this.anInt9381 = arg0.method7860();
		} else if (arg1 == 6) {
			this.anInt9388 = arg0.method7860();
		} else if (arg1 == 7) {
			this.anInt9385 = arg0.method7816();
		} else if (arg1 == 8) {
			this.anInt9383 = arg0.method7816();
		} else if (arg1 == 9) {
			this.anInt9382 = 8224;
			this.aByte128 = 3;
		} else if (arg1 == 10) {
			this.aBoolean794 = true;
		} else if (arg1 == 11) {
			this.aByte128 = 1;
		} else if (arg1 == 12) {
			this.aByte128 = 4;
		} else if (arg1 == 13) {
			this.aByte128 = 5;
		} else if (arg1 == 14) {
			this.aByte128 = 2;
			this.anInt9382 = arg0.method7816() * 256;
		} else if (arg1 == 15) {
			this.aByte128 = 3;
			this.anInt9382 = arg0.method7860();
		} else if (arg1 == 16) {
			this.aByte128 = 3;
			this.anInt9382 = arg0.method7804();
		} else {
			@Pc(98) int local98;
			@Pc(108) int local108;
			if (arg1 == 40) {
				local98 = arg0.method7816();
				this.aShortArray122 = new short[local98];
				this.aShortArray123 = new short[local98];
				for (local108 = 0; local108 < local98; local108++) {
					this.aShortArray123[local108] = (short) arg0.method7860();
					this.aShortArray122[local108] = (short) arg0.method7860();
				}
			} else if (arg1 == 41) {
				local98 = arg0.method7816();
				this.aShortArray121 = new short[local98];
				this.aShortArray120 = new short[local98];
				for (local108 = 0; local108 < local98; local108++) {
					this.aShortArray120[local108] = (short) arg0.method7860();
					this.aShortArray121[local108] = (short) arg0.method7860();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!s;Lclient!cl;IIIZIIIILclient!s;Lclient!ha;B)Lclient!ka;")
	public Class153 method7931(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class109 arg9, @OriginalArg(11) Class65 arg10) {
		return this.method7932(arg8, arg1, arg3, arg9, true, arg6, (byte) 2, arg5, arg4, arg10, arg2, arg0, arg7);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!cl;ILclient!s;ZIBIILclient!ha;ZILclient!s;I)Lclient!ka;")
	private Class153 method7932(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class65 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class109 arg11, @OriginalArg(13) int arg12) {
		@Pc(10) int local10 = arg2;
		@Pc(26) Class175 local26 = this.anInt9376 == -1 || arg12 == -1 ? null : arg1.method1768(this.anInt9376);
		@Pc(35) boolean local35 = arg4 & this.aByte128 != 0;
		if (local26 != null) {
			local10 = arg2 | local26.method4252(false, arg5, arg12);
		}
		if (local35) {
			local10 |= this.aByte128 == 3 ? 7 : 2;
		}
		if (this.anInt9381 != 128) {
			local10 |= 0x2;
		}
		if (this.anInt9379 != 128 || this.anInt9388 != 0) {
			local10 |= 0x5;
		}
		@Pc(85) Class340 local85 = this.aClass91_2.aClass340_11;
		@Pc(105) Class153 local105;
		synchronized (this.aClass91_2.aClass340_11) {
			local105 = (Class153) this.aClass91_2.aClass340_11.method7999((long) (this.anInt9386 |= arg9.anInt8116 << 29));
		}
		if (local105 == null || arg9.method6885(local105.ua(), local10) != 0) {
			if (local105 != null) {
				local10 = arg9.method6882(local10, local105.ua());
			}
			@Pc(129) int local129 = local10;
			if (this.aShortArray123 != null) {
				local129 = local10 | 0x4000;
			}
			if (this.aShortArray120 != null) {
				local129 |= 0x8000;
			}
			@Pc(152) Class329 local152 = Static347.method5290(this.anInt9384, this.aClass91_2.aClass390_24);
			if (local152 == null) {
				return null;
			}
			if (local152.anInt9048 < 13) {
				local152.method7672();
			}
			local105 = arg9.method6964(local152, local129, this.aClass91_2.anInt2502, this.anInt9385 + 64, this.anInt9383 + 850);
			@Pc(185) int local185;
			if (this.aShortArray123 != null) {
				for (local185 = 0; local185 < this.aShortArray123.length; local185++) {
					local105.ia(this.aShortArray123[local185], this.aShortArray122[local185]);
				}
			}
			if (this.aShortArray120 != null) {
				for (local185 = 0; local185 < this.aShortArray120.length; local185++) {
					local105.aa(this.aShortArray120[local185], this.aShortArray121[local185]);
				}
			}
			local105.s(local10);
			@Pc(231) Class340 local231 = this.aClass91_2.aClass340_11;
			synchronized (this.aClass91_2.aClass340_11) {
				this.aClass91_2.aClass340_11.method7986((long) (this.anInt9386 |= arg9.anInt8116 << 29), local105);
			}
		}
		@Pc(275) Class153 local275 = local26 == null ? local105.method8580(arg6, local10, true) : local26.method4254(0, arg6, arg10, arg12, local105, local10, arg5);
		if (this.anInt9379 != 128 || this.anInt9381 != 128) {
			local275.O(this.anInt9379, this.anInt9381, this.anInt9379);
		}
		if (this.anInt9388 != 0) {
			if (this.anInt9388 == 90) {
				local275.a(4096);
			}
			if (this.anInt9388 == 180) {
				local275.a(8192);
			}
			if (this.anInt9388 == 270) {
				local275.a(12288);
			}
		}
		if (local35) {
			local275.p(this.aByte128, this.anInt9382, arg3, arg11, arg8, arg7, arg0);
		}
		local275.s(arg2);
		return local275;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBLclient!cl;BILclient!ha;I)Lclient!ka;")
	public Class153 method7934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class65 arg5, @OriginalArg(7) int arg6) {
		return this.method7932(0, arg2, arg6, (Class109) null, false, arg1, arg3, 0, 0, arg5, arg0, (Class109) null, arg4);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method7935(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(26) int local26 = arg0.method7816();
			if (local26 == 0) {
				return;
			}
			this.method7930(arg0, local26);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!cl;IILclient!ha;III)Lclient!ka;")
	public Class153 method7936(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method7932(0, arg0, arg1, (Class109) null, false, arg4, (byte) 2, 0, 0, arg3, arg5, (Class109) null, arg2);
	}
}
