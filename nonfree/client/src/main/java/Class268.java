import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class268 {

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public int anInt8065;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!uo;")
	public Class343 aClass343_2;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
	private int anInt8072;

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	private int anInt8062 = -1;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "B")
	public byte aByte97 = 0;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	private int anInt8066 = 128;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	private int anInt8069 = 0;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
	private int anInt8070 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	private int anInt8054 = 0;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	private int anInt8057 = 128;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
	public boolean aBoolean688 = false;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public int anInt8068 = -1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!tn;)V")
	private void method6738(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt8072 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt8068 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt8066 = arg1.method8414();
		} else if (arg0 == 5) {
			this.anInt8057 = arg1.method8414();
		} else if (arg0 == 6) {
			this.anInt8069 = arg1.method8414();
		} else if (arg0 == 7) {
			this.anInt8054 = arg1.method8401();
		} else if (arg0 == 8) {
			this.anInt8070 = arg1.method8401();
		} else if (arg0 == 9) {
			this.anInt8062 = 8224;
			this.aByte97 = 3;
		} else if (arg0 == 10) {
			this.aBoolean688 = true;
		} else if (arg0 == 11) {
			this.aByte97 = 1;
		} else if (arg0 == 12) {
			this.aByte97 = 4;
		} else if (arg0 == 13) {
			this.aByte97 = 5;
		} else if (arg0 == 14) {
			this.aByte97 = 2;
			this.anInt8062 = arg1.method8401() * 256;
		} else if (arg0 == 15) {
			this.aByte97 = 3;
			this.anInt8062 = arg1.method8414();
		} else if (arg0 == 16) {
			this.aByte97 = 3;
			this.anInt8062 = arg1.method8402();
		} else {
			@Pc(131) int local131;
			@Pc(141) int local141;
			if (arg0 == 40) {
				local131 = arg1.method8401();
				this.aShortArray126 = new short[local131];
				this.aShortArray127 = new short[local131];
				for (local141 = 0; local141 < local131; local141++) {
					this.aShortArray127[local141] = (short) arg1.method8414();
					this.aShortArray126[local141] = (short) arg1.method8414();
				}
			} else if (arg0 == 41) {
				local131 = arg1.method8401();
				this.aShortArray128 = new short[local131];
				this.aShortArray125 = new short[local131];
				for (local141 = 0; local141 < local131; local141++) {
					this.aShortArray125[local141] = (short) arg1.method8414();
					this.aShortArray128[local141] = (short) arg1.method8414();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tn;B)V")
	public void method6739(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method6738(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!ha;IIILclient!naa;Lclient!s;ILclient!s;IZI)Lclient!ka;")
	public Class128 method6742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class222 arg5, @OriginalArg(7) Class274 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class274 arg8, @OriginalArg(10) int arg9, @OriginalArg(12) int arg10) {
		return this.method6743(arg1, arg2, arg7, arg9, arg6, true, arg4, arg3, arg8, arg10, arg5, arg0, (byte) 2);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ha;IILclient!s;ZIILclient!s;ILclient!naa;IIB)Lclient!ka;")
	private Class128 method6743(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class274 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class274 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class222 arg10, @OriginalArg(11) int arg11, @OriginalArg(13) byte arg12) {
		@Pc(7) int local7 = arg3;
		@Pc(23) Class290 local23 = this.anInt8068 == -1 || arg0 == -1 ? null : arg10.method5867(this.anInt8068);
		@Pc(35) boolean local35 = arg5 & this.aByte97 != 0;
		if (local23 != null) {
			local7 = arg3 | local23.method7174(arg0, arg2, false);
		}
		if (local35) {
			local7 |= this.aByte97 == 3 ? 7 : 2;
		}
		if (this.anInt8057 != 128) {
			local7 |= 0x2;
		}
		if (this.anInt8066 != 128 || this.anInt8069 != 0) {
			local7 |= 0x5;
		}
		@Pc(83) Class112 local83 = this.aClass343_2.aClass112_63;
		@Pc(103) Class128 local103;
		synchronized (this.aClass343_2.aClass112_63) {
			local103 = (Class128) this.aClass343_2.aClass112_63.method3640((long) (this.anInt8065 |= arg1.anInt7410 << 29));
		}
		if (local103 == null || arg1.method6220(local103.ua(), local7) != 0) {
			if (local103 != null) {
				local7 = arg1.method6176(local7, local103.ua());
			}
			@Pc(130) int local130 = local7;
			if (this.aShortArray127 != null) {
				local130 = local7 | 0x4000;
			}
			if (this.aShortArray125 != null) {
				local130 |= 0x8000;
			}
			@Pc(153) Class142 local153 = Static579.method8023(this.anInt8072, this.aClass343_2.aClass181_119);
			if (local153 == null) {
				return null;
			}
			if (local153.anInt5151 < 13) {
				local153.method4357();
			}
			local103 = arg1.method6157(local153, local130, this.aClass343_2.anInt9721, this.anInt8054 + 64, this.anInt8070 - -850);
			@Pc(188) int local188;
			if (this.aShortArray127 != null) {
				for (local188 = 0; local188 < this.aShortArray127.length; local188++) {
					local103.ia(this.aShortArray127[local188], this.aShortArray126[local188]);
				}
			}
			if (this.aShortArray125 != null) {
				for (local188 = 0; local188 < this.aShortArray125.length; local188++) {
					local103.aa(this.aShortArray125[local188], this.aShortArray128[local188]);
				}
			}
			local103.s(local7);
			@Pc(240) Class112 local240 = this.aClass343_2.aClass112_63;
			synchronized (this.aClass343_2.aClass112_63) {
				this.aClass343_2.aClass112_63.method3636((long) (this.anInt8065 |= arg1.anInt7410 << 29), local103);
			}
		}
		@Pc(284) Class128 local284 = local23 == null ? local103.method6279(arg12, local7, true) : local23.method7172(arg2, 0, local7, local103, arg0, arg9, arg12);
		if (this.anInt8066 != 128 || this.anInt8057 != 128) {
			local284.O(this.anInt8066, this.anInt8057, this.anInt8066);
		}
		if (this.anInt8069 != 0) {
			if (this.anInt8069 == 90) {
				local284.a(4096);
			}
			if (this.anInt8069 == 180) {
				local284.a(8192);
			}
			if (this.anInt8069 == 270) {
				local284.a(12288);
			}
		}
		if (local35) {
			local284.p(this.aByte97, this.anInt8062, arg8, arg4, arg7, arg11, arg6);
		}
		local284.s(arg3);
		return local284;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!naa;ILclient!ha;IIII)Lclient!ka;")
	public Class128 method6745(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return this.method6743(arg1, arg2, arg3, arg5, null, false, 0, 0, null, arg4, arg0, 0, (byte) 5);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ha;Lclient!naa;IIIIB)Lclient!ka;")
	public Class128 method6746(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6743(arg3, arg0, arg4, arg2, null, false, 0, 0, null, arg5, arg1, 0, (byte) 2);
	}
}
