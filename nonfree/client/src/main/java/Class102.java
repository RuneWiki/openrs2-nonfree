import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class102 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public int anInt2982;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!dd;")
	public Class50 aClass50_1;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "[Z")
	public boolean[] aBooleanArray14;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
	public int anInt2983 = -1;

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "Z")
	public boolean aBoolean210 = false;

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "I")
	public int anInt2990 = 99;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "Z")
	public boolean aBoolean211 = false;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
	public int anInt2985 = 2;

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
	public int anInt2992 = 5;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
	public int anInt2987 = -1;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Z")
	public boolean aBoolean209 = false;

	@OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
	public int anInt2997 = -1;

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "I")
	public int anInt2996 = -1;

	@OriginalMember(owner = "client!hu", name = "D", descriptor = "Z")
	public boolean aBoolean212 = false;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
	public int anInt2988 = -1;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIII)I")
	public int method2409(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(18) int local18 = this.anIntArray231[arg1];
		@Pc(20) Class2_Sub7_Sub10 local20 = null;
		@Pc(30) Class2_Sub7_Sub10 local30 = this.aClass50_1.method1173(local18 >> 16);
		@Pc(34) int local34 = local18 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean212 || Static314.aBoolean420) && arg2 != -1 && this.anIntArray231.length > arg2) {
			local7 = this.anIntArray231[arg2];
			local20 = this.aClass50_1.method1173(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean210) {
			local5 = 512;
		}
		if (local30.method2904(local34)) {
			local5 |= 0x80;
		}
		if (local30.method2909(local34)) {
			local5 |= 0x100;
		}
		if (local20 != null) {
			if (local20.method2904(local7)) {
				local5 |= 0x80;
			}
			if (local20.method2909(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray230 != null && arg0) {
			@Pc(128) int local128;
			@Pc(141) Class2_Sub7_Sub10 local141;
			if (arg1 < this.anIntArray230.length) {
				local128 = this.anIntArray230[arg1];
				if (local128 != 65535) {
					local141 = this.aClass50_1.method1173(local128 >> 16);
					local128 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method2904(local128)) {
							local5 |= 0x80;
						}
						if (local141.method2909(local128)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean212 || Static314.aBoolean420) && arg2 != -1 && arg2 < this.anIntArray230.length) {
				local128 = this.anIntArray230[arg2];
				if (local128 != 65535) {
					local141 = this.aClass50_1.method1173(local128 >> 16);
					local128 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method2904(local128)) {
							local5 |= 0x80;
						}
						if (local141.method2909(local128)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public void method2412() {
		if (this.anInt2983 == -1) {
			if (this.aBooleanArray14 == null) {
				this.anInt2983 = 0;
			} else {
				this.anInt2983 = 2;
			}
		}
		if (this.anInt2988 != -1) {
			return;
		}
		if (this.aBooleanArray14 == null) {
			this.anInt2988 = 0;
		} else {
			this.anInt2988 = 2;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!vt;B)V")
	public void method2413(@OriginalArg(0) Class2_Sub24 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5732();
			if (local9 == 0) {
				return;
			}
			this.method2416(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!qh;IIIII)Lclient!qh;")
	public Class159 method2414(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray229[arg2];
		@Pc(13) int local13 = this.anIntArray231[arg2];
		@Pc(23) Class2_Sub7_Sub10 local23 = this.aClass50_1.method1173(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg0.method4927((byte) 1, arg1, true);
		}
		@Pc(37) Class2_Sub7_Sub10 local37 = null;
		if ((this.aBoolean212 || Static314.aBoolean420) && arg3 != -1 && arg3 < this.anIntArray231.length) {
			@Pc(59) int local59 = this.anIntArray231[arg3];
			local37 = this.aClass50_1.method1173(local59 >> 16);
			arg3 = local59 & 0xFFFF;
		}
		@Pc(73) Class2_Sub7_Sub10 local73 = null;
		@Pc(75) Class2_Sub7_Sub10 local75 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (this.anIntArray230 != null) {
			if (this.anIntArray230.length > arg2) {
				local77 = this.anIntArray230[arg2];
				if (local77 != 65535) {
					local73 = this.aClass50_1.method1173(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean212 || Static314.aBoolean420) && arg3 != -1 && this.anIntArray230.length > arg3) {
				local79 = this.anIntArray230[arg3];
				if (local79 != 65535) {
					local75 = this.aClass50_1.method1173(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean210) {
			arg1 |= 0x200;
		}
		if (local23.method2904(local27)) {
			arg1 |= 0x80;
		}
		if (local23.method2909(local27)) {
			arg1 |= 0x100;
		}
		if (local73 != null) {
			if (local73.method2904(local77)) {
				arg1 |= 0x80;
			}
			if (local73.method2909(local77)) {
				arg1 |= 0x100;
			}
		}
		if (local37 != null) {
			if (local37.method2904(arg3)) {
				arg1 |= 0x80;
			}
			if (local37.method2909(arg3)) {
				arg1 |= 0x100;
			}
		}
		if (local75 != null) {
			if (local75.method2904(local79)) {
				arg1 |= 0x80;
			}
			if (local75.method2909(local79)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(245) Class159 local245 = arg0.method4927((byte) 1, arg1, true);
		local245.method4955(0, arg3, this.aBoolean210, local8, local37, arg4 - 1, local27, local23);
		if (local73 != null) {
			local245.method4955(0, local79, this.aBoolean210, local8, local75, arg4 - 1, local77, local73);
		}
		return local245;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BILclient!qh;IIIII)Lclient!qh;")
	public Class159 method2415(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray229[arg3];
		@Pc(13) int local13 = this.anIntArray231[arg3];
		@Pc(21) Class2_Sub7_Sub10 local21 = this.aClass50_1.method1173(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method4927(arg0, arg5, true);
		}
		@Pc(35) Class2_Sub7_Sub10 local35 = null;
		if ((this.aBoolean212 || Static314.aBoolean420) && arg1 != -1 && arg1 < this.anIntArray231.length) {
			@Pc(57) int local57 = this.anIntArray231[arg1];
			local35 = this.aClass50_1.method1173(local57 >> 16);
			arg1 = local57 & 0xFFFF;
		}
		if (this.aBoolean210) {
			arg5 |= 0x200;
		}
		if (local21.method2904(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method2909(local25)) {
			arg5 |= 0x100;
		}
		if (local35 != null) {
			if (local35.method2904(arg1)) {
				arg5 |= 0x80;
			}
			if (local35.method2909(arg1)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(131) Class159 local131 = arg2.method4927(arg0, arg5, true);
		local131.method4955(arg4, arg1, this.aBoolean210, local8, local35, arg6 - 1, local25, local21);
		return local131;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILclient!vt;)V")
	private void method2416(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(144) int local144;
		@Pc(230) int local230;
		if (arg0 == 1) {
			local34 = arg1.method5753();
			this.anIntArray229 = new int[local34];
			for (local36 = 0; local36 < local34; local36++) {
				this.anIntArray229[local36] = arg1.method5753();
			}
			this.anIntArray231 = new int[local34];
			for (local144 = 0; local144 < local34; local144++) {
				this.anIntArray231[local144] = arg1.method5753();
			}
			for (local230 = 0; local230 < local34; local230++) {
				this.anIntArray231[local230] += arg1.method5753() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2996 = arg1.method5753();
		} else if (arg0 == 3) {
			this.aBooleanArray14 = new boolean[256];
			local34 = arg1.method5732();
			for (local36 = 0; local36 < local34; local36++) {
				this.aBooleanArray14[arg1.method5732()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean211 = true;
		} else if (arg0 == 5) {
			this.anInt2992 = arg1.method5732();
		} else if (arg0 == 6) {
			this.anInt2997 = arg1.method5753();
		} else if (arg0 == 7) {
			this.anInt2987 = arg1.method5753();
		} else if (arg0 == 8) {
			this.anInt2990 = arg1.method5732();
		} else if (arg0 == 9) {
			this.anInt2983 = arg1.method5732();
		} else if (arg0 == 10) {
			this.anInt2988 = arg1.method5732();
		} else if (arg0 == 11) {
			this.anInt2985 = arg1.method5732();
		} else if (arg0 == 12) {
			local34 = arg1.method5732();
			this.anIntArray230 = new int[local34];
			for (local36 = 0; local36 < local34; local36++) {
				this.anIntArray230[local36] = arg1.method5753();
			}
			for (local144 = 0; local144 < local34; local144++) {
				this.anIntArray230[local144] += arg1.method5753() << 16;
			}
		} else if (arg0 == 13) {
			local34 = arg1.method5753();
			this.anIntArrayArray14 = new int[local34][];
			for (local36 = 0; local36 < local34; local36++) {
				local144 = arg1.method5732();
				if (local144 > 0) {
					this.anIntArrayArray14[local36] = new int[local144];
					this.anIntArrayArray14[local36][0] = arg1.method5736();
					for (local230 = 1; local230 < local144; local230++) {
						this.anIntArrayArray14[local36][local230] = arg1.method5753();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean210 = true;
		} else if (arg0 == 15) {
			this.aBoolean212 = true;
		} else if (arg0 == 16) {
			this.aBoolean209 = true;
			return;
		}
	}
}
