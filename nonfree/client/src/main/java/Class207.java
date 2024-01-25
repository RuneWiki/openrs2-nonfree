import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class207 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	private int anInt6214;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
	public int anInt6224;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "Lclient!gu;")
	public Class135 aClass135_2;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	private int anInt6210 = 0;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	private int anInt6212 = 128;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	private int anInt6216 = 0;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	private int anInt6215 = -1;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	private int anInt6221 = 128;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "B")
	public byte aByte75 = 0;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
	public int anInt6225 = -1;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "Z")
	public boolean aBoolean457 = false;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	private int anInt6220 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method5368(@OriginalArg(1) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6214 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt6225 = arg0.method5610();
		} else if (arg1 == 4) {
			this.anInt6212 = arg0.method5610();
		} else if (arg1 == 5) {
			this.anInt6221 = arg0.method5610();
		} else if (arg1 == 6) {
			this.anInt6210 = arg0.method5610();
		} else if (arg1 == 7) {
			this.anInt6220 = arg0.method5633();
		} else if (arg1 == 8) {
			this.anInt6216 = arg0.method5633();
		} else if (arg1 == 9) {
			this.aByte75 = 3;
			this.anInt6215 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean457 = true;
		} else if (arg1 == 11) {
			this.aByte75 = 1;
		} else if (arg1 == 12) {
			this.aByte75 = 4;
		} else if (arg1 == 13) {
			this.aByte75 = 5;
		} else if (arg1 == 14) {
			this.aByte75 = 2;
			this.anInt6215 = arg0.method5633() * 256;
		} else if (arg1 == 15) {
			this.aByte75 = 3;
			this.anInt6215 = arg0.method5610();
		} else if (arg1 == 16) {
			this.aByte75 = 3;
			this.anInt6215 = arg0.method5585();
		} else {
			@Pc(102) int local102;
			@Pc(112) int local112;
			if (arg1 == 40) {
				local102 = arg0.method5633();
				this.aShortArray53 = new short[local102];
				this.aShortArray52 = new short[local102];
				for (local112 = 0; local112 < local102; local112++) {
					this.aShortArray52[local112] = (short) arg0.method5610();
					this.aShortArray53[local112] = (short) arg0.method5610();
				}
			} else if (arg1 == 41) {
				local102 = arg0.method5633();
				this.aShortArray51 = new short[local102];
				this.aShortArray50 = new short[local102];
				for (local112 = 0; local112 < local102; local112++) {
					this.aShortArray50[local112] = (short) arg0.method5610();
					this.aShortArray51[local112] = (short) arg0.method5610();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILclient!pga;ZIIILclient!s;Lclient!ha;Lclient!s;II)Lclient!ka;")
	public Class75 method5372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class264 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class91 arg7, @OriginalArg(9) Class82 arg8, @OriginalArg(10) Class91 arg9, @OriginalArg(12) int arg10) {
		return this.method5376(arg3, arg10, arg1, arg0, arg8, arg4, arg2, arg6, arg5, (byte) 2, arg9, true, arg7);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!pga;IBIIILclient!ha;)Lclient!ka;")
	public Class75 method5373(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class82 arg5) {
		return this.method5376(arg0, arg2, arg3, 0, arg5, 0, arg1, 0, arg4, (byte) 2, (Class91) null, false, (Class91) null);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(ILclient!dc;)V")
	public void method5374(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(25) int local25 = arg0.method5633();
			if (local25 == 0) {
				return;
			}
			this.method5368(arg0, local25);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!pga;IIILclient!ha;IIIIBLclient!s;ZILclient!s;)Lclient!ka;")
	private Class75 method5376(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) Class91 arg10, @OriginalArg(11) boolean arg11, @OriginalArg(13) Class91 arg12) {
		@Pc(7) int local7 = arg2;
		@Pc(23) Class267 local23 = this.anInt6225 == -1 || arg6 == -1 ? null : arg0.method6574(this.anInt6225);
		@Pc(35) boolean local35 = arg11 & this.aByte75 != 0;
		if (local23 != null) {
			local7 = arg2 | local23.method6605(arg6, false, arg8);
		}
		if (local35) {
			local7 |= this.aByte75 == 3 ? 7 : 2;
		}
		if (this.anInt6221 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt6212 != 128 || this.anInt6210 != 0) {
			local7 |= 0x5;
		}
		@Pc(85) Class136 local85 = this.aClass135_2.aClass136_29;
		@Pc(105) Class75 local105;
		synchronized (this.aClass135_2.aClass136_29) {
			local105 = (Class75) this.aClass135_2.aClass136_29.method3134((long) (this.anInt6224 |= arg4.anInt7008 << 29));
		}
		if (local105 == null || arg4.method6105(local105.ua(), local7) != 0) {
			if (local105 != null) {
				local7 = arg4.method6169(local7, local105.ua());
			}
			@Pc(132) int local132 = local7;
			if (this.aShortArray52 != null) {
				local132 = local7 | 0x4000;
			}
			if (this.aShortArray50 != null) {
				local132 |= 0x8000;
			}
			@Pc(155) Class359 local155 = Static11.method201(this.aClass135_2.aClass343_100, this.anInt6214);
			if (local155 == null) {
				return null;
			}
			if (local155.anInt9841 < 13) {
				local155.method8347();
			}
			local105 = arg4.method6176(local155, local132, this.aClass135_2.anInt3633, this.anInt6220 + 64, this.anInt6216 + 850);
			@Pc(190) int local190;
			if (this.aShortArray52 != null) {
				for (local190 = 0; local190 < this.aShortArray52.length; local190++) {
					local105.ia(this.aShortArray52[local190], this.aShortArray53[local190]);
				}
			}
			if (this.aShortArray50 != null) {
				for (local190 = 0; local190 < this.aShortArray50.length; local190++) {
					local105.aa(this.aShortArray50[local190], this.aShortArray51[local190]);
				}
			}
			local105.s(local7);
			@Pc(242) Class136 local242 = this.aClass135_2.aClass136_29;
			synchronized (this.aClass135_2.aClass136_29) {
				this.aClass135_2.aClass136_29.method3135(local105, (long) (this.anInt6224 |= arg4.anInt7008 << 29));
			}
		}
		@Pc(286) Class75 local286 = local23 == null ? local105.method6805(arg9, local7, true) : local23.method6603(arg1, 0, local7, arg6, arg8, arg9, local105);
		if (this.anInt6212 != 128 || this.anInt6221 != 128) {
			local286.O(this.anInt6212, this.anInt6221, this.anInt6212);
		}
		if (this.anInt6210 != 0) {
			if (this.anInt6210 == 90) {
				local286.a(4096);
			}
			if (this.anInt6210 == 180) {
				local286.a(8192);
			}
			if (this.anInt6210 == 270) {
				local286.a(12288);
			}
		}
		if (local35) {
			local286.p(this.aByte75, this.anInt6215, arg10, arg12, arg5, arg7, arg3);
		}
		local286.s(arg2);
		return local286;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZIBIILclient!pga;Lclient!ha;)Lclient!ka;")
	public Class75 method5377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class264 arg5, @OriginalArg(7) Class82 arg6) {
		return this.method5376(arg5, arg3, arg4, 0, arg6, 0, arg1, 0, arg0, arg2, (Class91) null, false, (Class91) null);
	}
}
