import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class116 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[S")
	private short[] aShortArray40;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "Lclient!ff;")
	public Class98 aClass98_1;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
	public int anInt3013;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	private int anInt3004 = -1;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	private int anInt3006 = 128;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
	public int anInt3012 = -1;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
	private int anInt3015 = 128;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	private int anInt3005 = 0;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	private int anInt3014 = 0;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	private int anInt3007 = 0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "B")
	public byte aByte43 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!io;B)V")
	public void method2539(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method2540(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLclient!io;I)V")
	private void method2540(@OriginalArg(1) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3000 = arg0.method4426();
		} else if (arg1 == 2) {
			this.anInt3012 = arg0.method4426();
		} else if (arg1 == 4) {
			this.anInt3006 = arg0.method4426();
		} else if (arg1 == 5) {
			this.anInt3015 = arg0.method4426();
		} else if (arg1 == 6) {
			this.anInt3005 = arg0.method4426();
		} else if (arg1 == 7) {
			this.anInt3014 = arg0.method4393();
		} else if (arg1 == 8) {
			this.anInt3007 = arg0.method4393();
		} else if (arg1 == 9) {
			this.anInt3004 = 8224;
			this.aByte43 = 3;
		} else if (arg1 == 10) {
			this.aBoolean216 = true;
		} else if (arg1 == 11) {
			this.aByte43 = 1;
		} else if (arg1 == 12) {
			this.aByte43 = 4;
		} else if (arg1 == 13) {
			this.aByte43 = 5;
		} else if (arg1 == 14) {
			this.aByte43 = 2;
			this.anInt3004 = arg0.method4393() * 256;
		} else if (arg1 == 15) {
			this.aByte43 = 3;
			this.anInt3004 = arg0.method4426();
		} else if (arg1 == 16) {
			this.aByte43 = 3;
			this.anInt3004 = arg0.method4371();
			return;
		} else {
			@Pc(140) int local140;
			@Pc(150) int local150;
			if (arg1 == 40) {
				local140 = arg0.method4393();
				this.aShortArray41 = new short[local140];
				this.aShortArray40 = new short[local140];
				for (local150 = 0; local150 < local140; local150++) {
					this.aShortArray41[local150] = (short) arg0.method4426();
					this.aShortArray40[local150] = (short) arg0.method4426();
				}
				return;
			}
			if (arg1 == 41) {
				local140 = arg0.method4393();
				this.aShortArray39 = new short[local140];
				this.aShortArray42 = new short[local140];
				for (local150 = 0; local150 < local140; local150++) {
					this.aShortArray39[local150] = (short) arg0.method4426();
					this.aShortArray42[local150] = (short) arg0.method4426();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIZILclient!tfa;ILclient!i;Lclient!i;IIBLclient!r;)Lclient!da;")
	private Class61 method2542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class311 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class17 arg7, @OriginalArg(9) Class17 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte arg11, @OriginalArg(13) Class12 arg12) {
		@Pc(7) int local7 = arg2;
		@Pc(22) Class131 local22 = this.anInt3012 == -1 || arg6 == -1 ? null : arg5.method7009(this.anInt3012);
		@Pc(31) boolean local31 = arg3 & this.aByte43 != 0;
		if (local22 != null) {
			local7 = arg2 | local22.method3243(arg6, false, arg9);
		}
		if (local31) {
			local7 |= this.aByte43 == 3 ? 7 : 2;
		}
		if (this.anInt3015 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3006 != 128 || this.anInt3005 != 0) {
			local7 |= 0x5;
		}
		@Pc(89) Class326 local89 = this.aClass98_1.aClass326_11;
		@Pc(109) Class61 local109;
		synchronized (this.aClass98_1.aClass326_11) {
			local109 = (Class61) this.aClass98_1.aClass326_11.method7238((long) (this.anInt3013 |= arg12.anInt7780 << 29));
		}
		if (local109 == null || arg12.method6467(local109.PA(), local7) != 0) {
			if (local109 != null) {
				local7 = arg12.method6445(local7, local109.PA());
			}
			@Pc(136) int local136 = local7;
			if (this.aShortArray41 != null) {
				local136 = local7 | 0x4000;
			}
			if (this.aShortArray39 != null) {
				local136 |= 0x8000;
			}
			@Pc(159) Class43 local159 = Static83.method1704(this.aClass98_1.aClass111_31, this.anInt3000);
			if (local159 == null) {
				return null;
			}
			if (local159.anInt1481 < 13) {
				local159.method1366();
			}
			local109 = arg12.method6407(local159, local136, this.aClass98_1.anInt2721, this.anInt3014 + 64, this.anInt3007 - -850);
			@Pc(194) int local194;
			if (this.aShortArray41 != null) {
				for (local194 = 0; local194 < this.aShortArray41.length; local194++) {
					local109.d(this.aShortArray41[local194], this.aShortArray40[local194]);
				}
			}
			if (this.aShortArray39 != null) {
				for (local194 = 0; local194 < this.aShortArray39.length; local194++) {
					local109.DA(this.aShortArray39[local194], this.aShortArray42[local194]);
				}
			}
			local109.SA(local7);
			@Pc(250) Class326 local250 = this.aClass98_1.aClass326_11;
			synchronized (this.aClass98_1.aClass326_11) {
				this.aClass98_1.aClass326_11.method7236(local109, (long) (this.anInt3013 |= arg12.anInt7780 << 29));
			}
		}
		@Pc(294) Class61 local294 = local22 == null ? local109.method7591(arg11, local7, true) : local22.method3237(local7, arg0, 0, arg6, arg11, local109, arg9);
		if (this.anInt3006 != 128 || this.anInt3015 != 128) {
			local294.R(this.anInt3006, this.anInt3015, this.anInt3006);
		}
		if (this.anInt3005 != 0) {
			if (this.anInt3005 == 90) {
				local294.M(4096);
			}
			if (this.anInt3005 == 180) {
				local294.M(8192);
			}
			if (this.anInt3005 == 270) {
				local294.M(12288);
			}
		}
		if (local31) {
			local294.ba(this.aByte43, this.anInt3004, arg7, arg8, arg4, arg10, arg1);
		}
		local294.SA(arg2);
		return local294;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILclient!r;ILclient!tfa;I)Lclient!da;")
	public Class61 method2544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class311 arg4, @OriginalArg(6) int arg5) {
		return this.method2542(arg3, 0, arg1, false, 0, arg4, arg5, null, null, arg0, 0, (byte) 5, arg2);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!tfa;Lclient!i;ILclient!r;IIZIIILclient!i;II)Lclient!da;")
	public Class61 method2545(@OriginalArg(0) Class311 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class17 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method2542(arg6, arg7, arg2, true, arg10, arg0, arg4, arg8, arg1, arg9, arg5, (byte) 2, arg3);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIILclient!tfa;IILclient!r;)Lclient!da;")
	public Class61 method2546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class311 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class12 arg5) {
		return this.method2542(arg1, 0, arg4, false, 0, arg2, arg0, null, null, arg3, 0, (byte) 2, arg5);
	}
}
