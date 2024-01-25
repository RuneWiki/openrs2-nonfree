import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class109 {

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public int anInt3970;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	private int anInt3973;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "Lclient!cn;")
	public Class62 aClass62_1;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "B")
	public byte aByte63 = 0;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
	private int anInt3969 = 128;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Z")
	public boolean aBoolean296 = false;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
	private int anInt3975 = 0;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt3971 = -1;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	private int anInt3974 = -1;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	private int anInt3963 = 128;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	private int anInt3961 = 0;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
	private int anInt3979 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!ha;IILclient!lfa;I)Lclient!ka;")
	public Class166 method3481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class193 arg4, @OriginalArg(6) int arg5) {
		return this.method3489(arg2, arg5, arg3, null, 0, arg4, arg0, (byte) 5, null, 0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!cea;)V")
	public void method3482(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8383();
			if (local13 == 0) {
				return;
			}
			this.method3487(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!ha;IIILclient!lfa;B)Lclient!ka;")
	public Class166 method3485(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class193 arg5) {
		return this.method3489(arg1, arg0, arg3, null, 0, arg5, arg2, (byte) 2, null, 0, false, 0, arg4);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!cea;I)V")
	private void method3487(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3973 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt3971 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt3969 = arg0.method8326();
		} else if (arg1 == 5) {
			this.anInt3963 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt3975 = arg0.method8326();
		} else if (arg1 == 7) {
			this.anInt3961 = arg0.method8383();
		} else if (arg1 == 8) {
			this.anInt3979 = arg0.method8383();
		} else if (arg1 == 9) {
			this.anInt3974 = 8224;
			this.aByte63 = 3;
		} else if (arg1 == 10) {
			this.aBoolean296 = true;
		} else if (arg1 == 11) {
			this.aByte63 = 1;
		} else if (arg1 == 12) {
			this.aByte63 = 4;
		} else if (arg1 == 13) {
			this.aByte63 = 5;
		} else if (arg1 == 14) {
			this.aByte63 = 2;
			this.anInt3974 = arg0.method8383() * 256;
		} else if (arg1 == 15) {
			this.aByte63 = 3;
			this.anInt3974 = arg0.method8326();
		} else if (arg1 == 16) {
			this.aByte63 = 3;
			this.anInt3974 = arg0.method8381();
		} else {
			@Pc(124) int local124;
			@Pc(134) int local134;
			if (arg1 == 40) {
				local124 = arg0.method8383();
				this.aShortArray34 = new short[local124];
				this.aShortArray36 = new short[local124];
				for (local134 = 0; local134 < local124; local134++) {
					this.aShortArray34[local134] = (short) arg0.method8326();
					this.aShortArray36[local134] = (short) arg0.method8326();
				}
			} else if (arg1 == 41) {
				local124 = arg0.method8383();
				this.aShortArray37 = new short[local124];
				this.aShortArray35 = new short[local124];
				for (local134 = 0; local134 < local124; local134++) {
					this.aShortArray35[local134] = (short) arg0.method8326();
					this.aShortArray37[local134] = (short) arg0.method8326();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIZLclient!ha;IIILclient!lfa;Lclient!s;ILclient!s;)Lclient!ka;")
	public Class166 method3488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class193 arg7, @OriginalArg(10) Class65 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class65 arg10) {
		return this.method3489(arg4, arg1, arg3, arg8, arg9, arg7, arg0, (byte) 2, arg10, arg2, true, arg6, arg5);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ha;IILclient!s;ILclient!lfa;IBLclient!s;IZIBI)Lclient!ka;")
	private Class166 method3489(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class193 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class65 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		@Pc(7) int local7 = arg2;
		@Pc(22) Class130 local22 = this.anInt3971 == -1 || arg1 == -1 ? null : arg5.method5573(this.anInt3971);
		@Pc(31) boolean local31 = arg10 & this.aByte63 != 0;
		if (local22 != null) {
			local7 = arg2 | local22.method4093(arg12, arg1, false);
		}
		if (local31) {
			local7 |= this.aByte63 == 3 ? 7 : 2;
		}
		if (this.anInt3963 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt3969 != 128 || this.anInt3975 != 0) {
			local7 |= 0x5;
		}
		@Pc(86) Class169 local86 = this.aClass62_1.aClass169_12;
		@Pc(106) Class166 local106;
		synchronized (this.aClass62_1.aClass169_12) {
			local106 = (Class166) this.aClass62_1.aClass169_12.method5002((long) (this.anInt3970 |= arg0.anInt8557 << 29));
		}
		if (local106 == null || arg0.method7270(local106.ua(), local7) != 0) {
			if (local106 != null) {
				local7 = arg0.method7282(local7, local106.ua());
			}
			@Pc(133) int local133 = local7;
			if (this.aShortArray34 != null) {
				local133 = local7 | 0x4000;
			}
			if (this.aShortArray35 != null) {
				local133 |= 0x8000;
			}
			@Pc(156) Class32 local156 = Static630.method9136(this.aClass62_1.aClass157_50, this.anInt3973);
			if (local156 == null) {
				return null;
			}
			if (local156.anInt1677 < 13) {
				local156.method1592();
			}
			local106 = arg0.method7228(local156, local133, this.aClass62_1.anInt2419, this.anInt3961 + 64, this.anInt3979 - -850);
			@Pc(191) int local191;
			if (this.aShortArray34 != null) {
				for (local191 = 0; local191 < this.aShortArray34.length; local191++) {
					local106.ia(this.aShortArray34[local191], this.aShortArray36[local191]);
				}
			}
			if (this.aShortArray35 != null) {
				for (local191 = 0; local191 < this.aShortArray35.length; local191++) {
					local106.aa(this.aShortArray35[local191], this.aShortArray37[local191]);
				}
			}
			local106.s(local7);
			@Pc(247) Class169 local247 = this.aClass62_1.aClass169_12;
			synchronized (this.aClass62_1.aClass169_12) {
				this.aClass62_1.aClass169_12.method5001(local106, (long) (this.anInt3970 |= arg0.anInt8557 << 29));
			}
		}
		@Pc(296) Class166 local296 = local22 == null ? local106.method6684(arg7, local7, true) : local22.method4096(local106, 0, arg12, arg7, arg1, arg6, local7);
		if (this.anInt3969 != 128 || this.anInt3963 != 128) {
			local296.O(this.anInt3969, this.anInt3963, this.anInt3969);
		}
		if (this.anInt3975 != 0) {
			if (this.anInt3975 == 90) {
				local296.a(4096);
			}
			if (this.anInt3975 == 180) {
				local296.a(8192);
			}
			if (this.anInt3975 == 270) {
				local296.a(12288);
			}
		}
		if (local31) {
			local296.p(this.aByte63, this.anInt3974, arg8, arg3, arg11, arg9, arg4);
		}
		local296.s(arg2);
		return local296;
	}
}
