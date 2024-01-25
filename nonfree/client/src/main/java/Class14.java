import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class14 {

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public int anInt348 = -1;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	public int anInt350 = -1;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public int anInt351 = 2;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	public int anInt356 = -1;

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	public int anInt357 = 99;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public int anInt352 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "I")
	public int anInt344 = 5;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "I")
	public int anInt361 = -1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public void method304() {
		if (this.anInt361 == -1) {
			if (this.aBooleanArray1 == null) {
				this.anInt361 = 0;
			} else {
				this.anInt361 = 2;
			}
		}
		if (this.anInt352 != -1) {
			return;
		}
		if (this.aBooleanArray1 == null) {
			this.anInt352 = 0;
		} else {
			this.anInt352 = 2;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ni;IBIIBII)Lclient!ni;")
	public Class38 method307(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray11[arg5];
		@Pc(13) int local13 = this.anIntArray12[arg5];
		@Pc(19) Class4_Sub4_Sub15 local19 = Static287.method3916(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method1915((byte) 1, arg3, true);
		}
		@Pc(41) Class4_Sub4_Sub15 local41 = null;
		if ((this.aBoolean30 || Static246.aBoolean378) && arg6 != -1 && arg6 < this.anIntArray12.length) {
			@Pc(59) int local59 = this.anIntArray12[arg6];
			local41 = Static287.method3916(local59 >> 16);
			arg6 = local59 & 0xFFFF;
		}
		if (this.aBoolean29) {
			arg3 |= 0x200;
		}
		if (local19.method4670(local23)) {
			arg3 |= 0x80;
		}
		if (local19.method4673(local23)) {
			arg3 |= 0x100;
		}
		if (local41 != null) {
			if (local41.method4670(arg6)) {
				arg3 |= 0x80;
			}
			if (local41.method4673(arg6)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(124) Class38 local124 = arg0.method1915(arg4, arg3, true);
		local124.method1887(arg2, arg6, local19, local41, local8, arg1 - 1, this.aBoolean29, local23);
		return local124;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!lf;)V")
	public void method308(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3440();
			if (local5 == 0) {
				return;
			}
			this.method312(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ni;IIIZI)Lclient!ni;")
	public Class38 method310(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(16) int local16 = this.anIntArray11[arg2];
		@Pc(21) int local21 = this.anIntArray12[arg2];
		@Pc(27) Class4_Sub4_Sub15 local27 = Static287.method3916(local21 >> 16);
		@Pc(31) int local31 = local21 & 0xFFFF;
		if (local27 == null) {
			return arg0.method1915((byte) 1, arg3, true);
		}
		@Pc(41) Class4_Sub4_Sub15 local41 = null;
		if ((this.aBoolean30 || Static246.aBoolean378) && arg1 != -1 && arg1 < this.anIntArray12.length) {
			@Pc(60) int local60 = this.anIntArray12[arg1];
			local41 = Static287.method3916(local60 >> 16);
			arg1 = local60 & 0xFFFF;
		}
		@Pc(72) Class4_Sub4_Sub15 local72 = null;
		@Pc(74) Class4_Sub4_Sub15 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray10 != null) {
			if (arg2 < this.anIntArray10.length) {
				local76 = this.anIntArray10[arg2];
				if (local76 != 65535) {
					local72 = Static287.method3916(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean30 || Static246.aBoolean378) && arg1 != -1 && this.anIntArray10.length > arg1) {
				local78 = this.anIntArray10[arg1];
				if (local78 != 65535) {
					local74 = Static287.method3916(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean29) {
			arg3 |= 0x200;
		}
		if (local27.method4670(local31)) {
			arg3 |= 0x80;
		}
		if (local27.method4673(local31)) {
			arg3 |= 0x100;
		}
		if (local72 != null) {
			if (local72.method4670(local76)) {
				arg3 |= 0x80;
			}
			if (local72.method4673(local76)) {
				arg3 |= 0x100;
			}
		}
		if (local41 != null) {
			if (local41.method4670(arg1)) {
				arg3 |= 0x80;
			}
			if (local41.method4673(arg1)) {
				arg3 |= 0x100;
			}
		}
		if (local74 != null) {
			if (local74.method4670(local78)) {
				arg3 |= 0x80;
			}
			if (local74.method4673(local78)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(236) Class38 local236 = arg0.method1915((byte) 1, arg3, true);
		local236.method1887(0, arg1, local27, local41, local16, arg4 - 1, this.aBoolean29, local31);
		if (local72 != null) {
			local236.method1887(0, local78, local72, local74, local16, arg4 - 1, this.aBoolean29, local76);
		}
		return local236;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZZI)I")
	public int method311(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray12[arg0];
		@Pc(14) Class4_Sub4_Sub15 local14 = null;
		@Pc(26) Class4_Sub4_Sub15 local26 = Static287.method3916(local12 >> 16);
		@Pc(30) int local30 = local12 & 0xFFFF;
		if (local26 == null) {
			return 0;
		}
		if ((this.aBoolean30 || Static246.aBoolean378) && arg2 != -1 && this.anIntArray12.length > arg2) {
			local7 = this.anIntArray12[arg2];
			local14 = Static287.method3916(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean29) {
			local5 = 512;
		}
		if (local26.method4670(local30)) {
			local5 |= 0x80;
		}
		if (local26.method4673(local30)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method4670(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4673(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray10 != null && arg1) {
			@Pc(130) int local130;
			@Pc(141) Class4_Sub4_Sub15 local141;
			if (this.anIntArray10.length > arg0) {
				local130 = this.anIntArray10[arg0];
				if (local130 != 65535) {
					local141 = Static287.method3916(local130 >> 16);
					local130 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method4670(local130)) {
							local5 |= 0x80;
						}
						if (local141.method4673(local130)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean30 || Static246.aBoolean378) && arg2 != -1 && this.anIntArray10.length > arg2) {
				local130 = this.anIntArray10[arg2];
				if (local130 != 65535) {
					local141 = Static287.method3916(local130 >> 16);
					local130 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method4670(local130)) {
							local5 |= 0x80;
						}
						if (local141.method4673(local130)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!lf;II)V")
	private void method312(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(49) int local49;
		@Pc(64) int local64;
		if (arg1 == 1) {
			local20 = arg0.method3401();
			this.anIntArray11 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray11[local26] = arg0.method3401();
			}
			this.anIntArray12 = new int[local20];
			for (local49 = 0; local49 < local20; local49++) {
				this.anIntArray12[local49] = arg0.method3401();
			}
			for (local64 = 0; local64 < local20; local64++) {
				this.anIntArray12[local64] = (arg0.method3401() << 16) + this.anIntArray12[local64];
			}
		} else if (arg1 == 2) {
			this.anInt348 = arg0.method3401();
		} else if (arg1 == 3) {
			this.aBooleanArray1 = new boolean[256];
			local20 = arg0.method3440();
			for (local26 = 0; local26 < local20; local26++) {
				this.aBooleanArray1[arg0.method3440()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean32 = true;
		} else if (arg1 == 5) {
			this.anInt344 = arg0.method3440();
		} else if (arg1 == 6) {
			this.anInt356 = arg0.method3401();
		} else if (arg1 == 7) {
			this.anInt350 = arg0.method3401();
		} else if (arg1 == 8) {
			this.anInt357 = arg0.method3440();
		} else if (arg1 == 9) {
			this.anInt361 = arg0.method3440();
		} else if (arg1 == 10) {
			this.anInt352 = arg0.method3440();
		} else if (arg1 == 11) {
			this.anInt351 = arg0.method3440();
		} else if (arg1 == 12) {
			local20 = arg0.method3440();
			this.anIntArray10 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray10[local26] = arg0.method3401();
			}
			for (local49 = 0; local49 < local20; local49++) {
				this.anIntArray10[local49] = (arg0.method3401() << 16) + this.anIntArray10[local49];
			}
		} else if (arg1 == 13) {
			local20 = arg0.method3401();
			this.anIntArrayArray8 = new int[local20][];
			for (local26 = 0; local26 < local20; local26++) {
				local49 = arg0.method3440();
				if (local49 > 0) {
					this.anIntArrayArray8[local26] = new int[local49];
					this.anIntArrayArray8[local26][0] = arg0.method3442();
					for (local64 = 1; local64 < local49; local64++) {
						this.anIntArrayArray8[local26][local64] = arg0.method3401();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean29 = true;
		} else if (arg1 == 15) {
			this.aBoolean30 = true;
			return;
		} else if (arg1 == 16) {
			this.aBoolean31 = true;
			return;
		}
	}
}
