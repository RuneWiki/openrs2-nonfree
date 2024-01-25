import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class79 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
	public int anInt2347;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "[Z")
	public boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Z")
	public boolean aBoolean165 = false;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	public int anInt2349 = -1;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	public int anInt2350 = 99;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	public int anInt2353 = -1;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
	public int anInt2361 = 2;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public int anInt2360 = -1;

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "Z")
	public boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	public int anInt2363 = -1;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	public int anInt2357 = 5;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	public int anInt2359 = -1;

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!jg;)V")
	public void method2294(@OriginalArg(1) Class14_Sub4 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2548();
			if (local13 == 0) {
				return;
			}
			this.method2299(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZIII)I")
	public int method2295(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = this.anIntArray217[arg2];
		@Pc(20) Class14_Sub2_Sub15 local20 = null;
		@Pc(26) Class14_Sub2_Sub15 local26 = Static203.method5589(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return 0;
		}
		if ((this.aBoolean164 || Static308.aBoolean300) && arg1 != -1 && this.anIntArray217.length > arg1) {
			local13 = this.anIntArray217[arg1];
			local20 = Static203.method5589(local13 >> 16);
			local13 &= 0xFFFF;
		}
		if (this.aBoolean166) {
			local5 = 512;
		}
		if (local26.method4107(local30)) {
			local5 |= 0x80;
		}
		if (local26.method4103(local30)) {
			local5 |= 0x100;
		}
		if (local20 != null) {
			if (local20.method4107(local13)) {
				local5 |= 0x80;
			}
			if (local20.method4103(local13)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray216 != null && arg0) {
			@Pc(122) int local122;
			@Pc(133) Class14_Sub2_Sub15 local133;
			if (this.anIntArray216.length > arg2) {
				local122 = this.anIntArray216[arg2];
				if (local122 != 65535) {
					local133 = Static203.method5589(local122 >> 16);
					local122 &= 0xFFFF;
					if (local133 != null) {
						if (local133.method4107(local122)) {
							local5 |= 0x80;
						}
						if (local133.method4103(local122)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean164 || Static308.aBoolean300) && arg1 != -1 && this.anIntArray216.length > arg1) {
				local122 = this.anIntArray216[arg1];
				if (local122 != 65535) {
					local133 = Static203.method5589(local122 >> 16);
					local122 &= 0xFFFF;
					if (local133 != null) {
						if (local133.method4107(local122)) {
							local5 |= 0x80;
						}
						if (local133.method4103(local122)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILclient!id;)Lclient!id;")
	public Class45 method2297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class45 arg4) {
		@Pc(8) int local8 = this.anIntArray215[arg1];
		@Pc(13) int local13 = this.anIntArray217[arg1];
		@Pc(19) Class14_Sub2_Sub15 local19 = Static203.method5589(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method1793((byte) 1, arg2, true);
		}
		@Pc(33) Class14_Sub2_Sub15 local33 = null;
		if ((this.aBoolean164 || Static308.aBoolean300) && arg3 != -1 && this.anIntArray217.length > arg3) {
			@Pc(55) int local55 = this.anIntArray217[arg3];
			local33 = Static203.method5589(local55 >> 16);
			arg3 = local55 & 0xFFFF;
		}
		@Pc(67) Class14_Sub2_Sub15 local67 = null;
		@Pc(69) Class14_Sub2_Sub15 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray216 != null) {
			if (arg1 < this.anIntArray216.length) {
				local71 = this.anIntArray216[arg1];
				if (local71 != 65535) {
					local67 = Static203.method5589(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean164 || Static308.aBoolean300) && arg3 != -1 && this.anIntArray216.length > arg3) {
				local73 = this.anIntArray216[arg3];
				if (local73 != 65535) {
					local69 = Static203.method5589(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean166) {
			arg2 |= 0x200;
		}
		if (local19.method4107(local23)) {
			arg2 |= 0x80;
		}
		if (local19.method4103(local23)) {
			arg2 |= 0x100;
		}
		if (local67 != null) {
			if (local67.method4107(local71)) {
				arg2 |= 0x80;
			}
			if (local67.method4103(local71)) {
				arg2 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method4107(arg3)) {
				arg2 |= 0x80;
			}
			if (local33.method4103(arg3)) {
				arg2 |= 0x100;
			}
		}
		if (local69 != null) {
			if (local69.method4107(local73)) {
				arg2 |= 0x80;
			}
			if (local69.method4103(local73)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(241) Class45 local241 = arg4.method1793((byte) 1, arg2, true);
		local241.method1817(0, local19, local8, this.aBoolean166, local33, local23, arg3, arg0 - 1);
		if (local67 != null) {
			local241.method1817(0, local67, local8, this.aBoolean166, local69, local71, local73, arg0 - 1);
		}
		return local241;
	}

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	public void method2298() {
		if (this.anInt2363 == -1) {
			if (this.aBooleanArray10 == null) {
				this.anInt2363 = 0;
			} else {
				this.anInt2363 = 2;
			}
		}
		if (this.anInt2360 != -1) {
			return;
		}
		if (this.aBooleanArray10 == null) {
			this.anInt2360 = 0;
		} else {
			this.anInt2360 = 2;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!jg;IZ)V")
	private void method2299(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(121) int local121;
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(152) int local152;
		if (arg1 == 1) {
			local121 = arg0.method2498();
			this.anIntArray215 = new int[local121];
			for (local127 = 0; local127 < local121; local127++) {
				this.anIntArray215[local127] = arg0.method2498();
			}
			this.anIntArray217 = new int[local121];
			for (local133 = 0; local133 < local121; local133++) {
				this.anIntArray217[local133] = arg0.method2498();
			}
			for (local152 = 0; local152 < local121; local152++) {
				this.anIntArray217[local152] += arg0.method2498() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt2353 = arg0.method2498();
		} else if (arg1 == 3) {
			this.aBooleanArray10 = new boolean[256];
			local121 = arg0.method2548();
			for (local127 = 0; local127 < local121; local127++) {
				this.aBooleanArray10[arg0.method2548()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean165 = true;
		} else if (arg1 == 5) {
			this.anInt2357 = arg0.method2548();
		} else if (arg1 == 6) {
			this.anInt2359 = arg0.method2498();
		} else if (arg1 == 7) {
			this.anInt2349 = arg0.method2498();
		} else if (arg1 == 8) {
			this.anInt2350 = arg0.method2548();
		} else if (arg1 == 9) {
			this.anInt2363 = arg0.method2548();
		} else if (arg1 == 10) {
			this.anInt2360 = arg0.method2548();
		} else if (arg1 == 11) {
			this.anInt2361 = arg0.method2548();
		} else if (arg1 == 12) {
			local121 = arg0.method2548();
			this.anIntArray216 = new int[local121];
			for (local127 = 0; local127 < local121; local127++) {
				this.anIntArray216[local127] = arg0.method2498();
			}
			for (local133 = 0; local133 < local121; local133++) {
				this.anIntArray216[local133] = (arg0.method2498() << 16) + this.anIntArray216[local133];
			}
		} else if (arg1 == 13) {
			local121 = arg0.method2498();
			this.anIntArrayArray32 = new int[local121][];
			for (local127 = 0; local127 < local121; local127++) {
				local133 = arg0.method2548();
				if (local133 > 0) {
					this.anIntArrayArray32[local127] = new int[local133];
					this.anIntArrayArray32[local127][0] = arg0.method2501();
					for (local152 = 1; local152 < local133; local152++) {
						this.anIntArrayArray32[local127][local152] = arg0.method2498();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean166 = true;
		} else if (arg1 == 15) {
			this.aBoolean164 = true;
		} else if (arg1 == 16) {
			this.aBoolean167 = true;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILclient!id;II)Lclient!id;")
	public Class45 method2301(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class45 arg5, @OriginalArg(6) int arg6) {
		@Pc(8) int local8 = this.anIntArray215[arg4];
		@Pc(13) int local13 = this.anIntArray217[arg4];
		@Pc(19) Class14_Sub2_Sub15 local19 = Static203.method5589(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg5.method1793((byte) 1, arg2, true);
		}
		@Pc(33) Class14_Sub2_Sub15 local33 = null;
		if ((this.aBoolean164 || Static308.aBoolean300) && arg3 != -1 && this.anIntArray217.length > arg3) {
			@Pc(55) int local55 = this.anIntArray217[arg3];
			local33 = Static203.method5589(local55 >> 16);
			arg3 = local55 & 0xFFFF;
		}
		if (this.aBoolean166) {
			arg2 |= 0x200;
		}
		if (local19.method4107(local23)) {
			arg2 |= 0x80;
		}
		if (local19.method4103(local23)) {
			arg2 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method4107(arg3)) {
				arg2 |= 0x80;
			}
			if (local33.method4103(arg3)) {
				arg2 |= 0x100;
			}
		}
		arg2 |= 0x20;
		@Pc(129) Class45 local129 = arg5.method1793(arg1, arg2, true);
		local129.method1817(arg6, local19, local8, this.aBoolean166, local33, local23, arg3, arg0 - 1);
		return local129;
	}
}
