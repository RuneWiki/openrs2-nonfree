import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class200 {

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
	private int anInt5919;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
	public int anInt5922;

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "Lclient!ma;")
	public Class213 aClass213_1;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	private int anInt5916 = 0;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
	private int anInt5918 = 0;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
	private int anInt5917 = 128;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "Z")
	public boolean aBoolean441 = false;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	private int anInt5921 = 0;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
	private int anInt5920 = 128;

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
	private int anInt5923 = -1;

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
	public int anInt5925 = -1;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "B")
	public byte aByte64 = 0;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!un;)V")
	public void method5066(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method5069(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!i;ZILclient!r;BIIIBILclient!i;ILclient!cf;)Lclient!da;")
	private Class57 method5067(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class44 arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class83 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class48 arg12) {
		@Pc(7) int local7 = arg6;
		@Pc(24) Class365 local24 = this.anInt5925 == -1 || arg11 == -1 ? null : arg12.method1016(this.anInt5925);
		@Pc(36) boolean local36 = arg2 & this.aByte64 != 0;
		if (local24 != null) {
			local7 = arg6 | local24.method8358(false, arg11, arg7);
		}
		if (local36) {
			local7 |= this.aByte64 == 3 ? 7 : 2;
		}
		if (this.anInt5920 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt5917 != 128 || this.anInt5916 != 0) {
			local7 |= 0x5;
		}
		@Pc(82) Class223 local82 = this.aClass213_1.aClass223_42;
		@Pc(102) Class57 local102;
		synchronized (this.aClass213_1.aClass223_42) {
			local102 = (Class57) this.aClass213_1.aClass223_42.method5388((long) (this.anInt5922 |= arg4.anInt5872 << 29));
		}
		if (local102 == null || arg4.method5010(local102.PA(), local7) != 0) {
			if (local102 != null) {
				local7 = arg4.method5023(local7, local102.PA());
			}
			@Pc(126) int local126 = local7;
			if (this.aShortArray70 != null) {
				local126 = local7 | 0x4000;
			}
			if (this.aShortArray72 != null) {
				local126 |= 0x8000;
			}
			@Pc(149) Class191 local149 = Static91.method5485(this.aClass213_1.aClass176_83, this.anInt5919);
			if (local149 == null) {
				return null;
			}
			if (local149.anInt5621 < 13) {
				local149.method4770();
			}
			local102 = arg4.method5016(local149, local126, this.aClass213_1.anInt6225, this.anInt5918 + 64, this.anInt5921 + 850);
			@Pc(184) int local184;
			if (this.aShortArray70 != null) {
				for (local184 = 0; local184 < this.aShortArray70.length; local184++) {
					local102.d(this.aShortArray70[local184], this.aShortArray73[local184]);
				}
			}
			if (this.aShortArray72 != null) {
				for (local184 = 0; local184 < this.aShortArray72.length; local184++) {
					local102.DA(this.aShortArray72[local184], this.aShortArray71[local184]);
				}
			}
			local102.SA(local7);
			@Pc(236) Class223 local236 = this.aClass213_1.aClass223_42;
			synchronized (this.aClass213_1.aClass223_42) {
				this.aClass213_1.aClass223_42.method5394(local102, (long) (this.anInt5922 |= arg4.anInt5872 << 29));
			}
		}
		@Pc(285) Class57 local285 = local24 == null ? local102.method7912(arg5, local7, true) : local24.method8364(0, arg7, local7, local102, arg9, arg5, arg11);
		if (this.anInt5917 != 128 || this.anInt5920 != 128) {
			local285.R(this.anInt5917, this.anInt5920, this.anInt5917);
		}
		if (this.anInt5916 != 0) {
			if (this.anInt5916 == 90) {
				local285.M(4096);
			}
			if (this.anInt5916 == 180) {
				local285.M(8192);
			}
			if (this.anInt5916 == 270) {
				local285.M(12288);
			}
		}
		if (local36) {
			local285.ba(this.aByte64, this.anInt5923, arg10, arg1, arg3, arg0, arg8);
		}
		local285.SA(arg6);
		return local285;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!un;B)V")
	private void method5069(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5919 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt5925 = arg1.method4936();
		} else if (arg0 == 4) {
			this.anInt5917 = arg1.method4936();
		} else if (arg0 == 5) {
			this.anInt5920 = arg1.method4936();
		} else if (arg0 == 6) {
			this.anInt5916 = arg1.method4936();
		} else if (arg0 == 7) {
			this.anInt5918 = arg1.method4905();
		} else if (arg0 == 8) {
			this.anInt5921 = arg1.method4905();
		} else if (arg0 == 9) {
			this.aByte64 = 3;
			this.anInt5923 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean441 = true;
		} else if (arg0 == 11) {
			this.aByte64 = 1;
		} else if (arg0 == 12) {
			this.aByte64 = 4;
		} else if (arg0 == 13) {
			this.aByte64 = 5;
		} else if (arg0 == 14) {
			this.aByte64 = 2;
			this.anInt5923 = arg1.method4905() * 256;
		} else if (arg0 == 15) {
			this.aByte64 = 3;
			this.anInt5923 = arg1.method4936();
		} else if (arg0 == 16) {
			this.aByte64 = 3;
			this.anInt5923 = arg1.method4931();
		} else {
			@Pc(128) int local128;
			@Pc(138) int local138;
			if (arg0 == 40) {
				local128 = arg1.method4905();
				this.aShortArray70 = new short[local128];
				this.aShortArray73 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray70[local138] = (short) arg1.method4936();
					this.aShortArray73[local138] = (short) arg1.method4936();
				}
			} else if (arg0 == 41) {
				local128 = arg1.method4905();
				this.aShortArray71 = new short[local128];
				this.aShortArray72 = new short[local128];
				for (local138 = 0; local138 < local128; local138++) {
					this.aShortArray72[local138] = (short) arg1.method4936();
					this.aShortArray71[local138] = (short) arg1.method4936();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!r;ILclient!cf;II)Lclient!da;")
	public Class57 method5070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(4) Class48 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method5067(0, null, false, 0, arg2, (byte) 2, arg1, arg5, 0, arg0, null, arg4, arg3);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIZILclient!i;Lclient!cf;ILclient!r;ZILclient!i;I)Lclient!da;")
	public Class57 method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class83 arg4, @OriginalArg(6) Class48 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class44 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class83 arg9, @OriginalArg(12) int arg10) {
		return this.method5067(arg10, arg9, true, arg1, arg7, (byte) 2, arg6, arg2, arg3, arg8, arg4, arg0, arg5);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!cf;ILclient!r;II)Lclient!da;")
	public Class57 method5072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class44 arg4, @OriginalArg(5) int arg5) {
		return this.method5067(0, null, false, 0, arg4, (byte) 5, arg3, arg1, 0, arg5, null, arg0, arg2);
	}
}
