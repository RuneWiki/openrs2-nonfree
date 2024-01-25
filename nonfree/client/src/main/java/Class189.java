import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class189 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public int anInt5152;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "[I")
	private int[] anIntArray638;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "[I")
	public int[] anIntArray639;

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "[Z")
	public boolean[] aBooleanArray118;

	@OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
	public int[] anIntArray640;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "Lclient!p;")
	public Class175 aClass175_4;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public int anInt5151 = -1;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public int anInt5155 = -1;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public int anInt5157 = 5;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "Z")
	public boolean aBoolean386 = false;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
	public int anInt5169 = -1;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Z")
	public boolean aBoolean385 = false;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	public int anInt5163 = 99;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	public int anInt5165 = 2;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
	public boolean aBoolean383 = false;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	public int anInt5167 = -1;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
	public int anInt5156 = -1;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public void method4432() {
		if (this.anInt5156 == -1) {
			if (this.aBooleanArray118 == null) {
				this.anInt5156 = 0;
			} else {
				this.anInt5156 = 2;
			}
		}
		if (this.anInt5167 != -1) {
			return;
		}
		if (this.aBooleanArray118 == null) {
			this.anInt5167 = 0;
		} else {
			this.anInt5167 = 2;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZI)I")
	public int method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray639[arg0];
		@Pc(19) Class2_Sub1_Sub1 local19 = null;
		@Pc(27) Class2_Sub1_Sub1 local27 = this.aClass175_4.method4106(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean384 || Static151.aBoolean203) && arg1 != -1 && arg1 < this.anIntArray639.length) {
			local12 = this.anIntArray639[arg1];
			local19 = this.aClass175_4.method4106(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean385) {
			local10 = 512;
		}
		if (local27.method34(local31)) {
			local10 |= 0x80;
		}
		if (local27.method31(local31)) {
			local10 |= 0x100;
		}
		if (local19 != null) {
			if (local19.method34(local12)) {
				local10 |= 0x80;
			}
			if (local19.method31(local12)) {
				local10 |= 0x100;
			}
		}
		if (this.anIntArray638 != null && arg2) {
			@Pc(126) int local126;
			@Pc(139) Class2_Sub1_Sub1 local139;
			if (this.anIntArray638.length > arg0) {
				local126 = this.anIntArray638[arg0];
				if (local126 != 65535) {
					local139 = this.aClass175_4.method4106(local126 >> 16);
					local126 &= 0xFFFF;
					if (local139 != null) {
						if (local139.method34(local126)) {
							local10 |= 0x80;
						}
						if (local139.method31(local126)) {
							local10 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean384 || Static151.aBoolean203) && arg1 != -1 && this.anIntArray638.length > arg1) {
				local126 = this.anIntArray638[arg1];
				if (local126 != 65535) {
					local139 = this.aClass175_4.method4106(local126 >> 16);
					local126 &= 0xFFFF;
					if (local139 != null) {
						if (local139.method34(local126)) {
							local10 |= 0x80;
						}
						if (local139.method31(local126)) {
							local10 |= 0x100;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!lk;I)V")
	public void method4435(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4240();
			if (local13 == 0) {
				return;
			}
			this.method4439(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILclient!ab;I)Lclient!ab;")
	public Class3 method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray640[arg0];
		@Pc(13) int local13 = this.anIntArray639[arg0];
		@Pc(21) Class2_Sub1_Sub1 local21 = this.aClass175_4.method4106(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method3481((byte) 1, arg4, true);
		}
		@Pc(35) Class2_Sub1_Sub1 local35 = null;
		if ((this.aBoolean384 || Static151.aBoolean203) && arg2 != -1 && arg2 < this.anIntArray639.length) {
			@Pc(54) int local54 = this.anIntArray639[arg2];
			local35 = this.aClass175_4.method4106(local54 >> 16);
			arg2 = local54 & 0xFFFF;
		}
		@Pc(68) Class2_Sub1_Sub1 local68 = null;
		@Pc(70) Class2_Sub1_Sub1 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray638 != null) {
			if (this.anIntArray638.length > arg0) {
				local72 = this.anIntArray638[arg0];
				if (local72 != 65535) {
					local68 = this.aClass175_4.method4106(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean384 || Static151.aBoolean203) && arg2 != -1 && arg2 < this.anIntArray638.length) {
				local74 = this.anIntArray638[arg2];
				if (local74 != 65535) {
					local70 = this.aClass175_4.method4106(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean385) {
			arg4 |= 0x200;
		}
		if (local21.method34(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method31(local25)) {
			arg4 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method34(local72)) {
				arg4 |= 0x80;
			}
			if (local68.method31(local72)) {
				arg4 |= 0x100;
			}
		}
		if (local35 != null) {
			if (local35.method34(arg2)) {
				arg4 |= 0x80;
			}
			if (local35.method31(arg2)) {
				arg4 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method34(local74)) {
				arg4 |= 0x80;
			}
			if (local70.method31(local74)) {
				arg4 |= 0x100;
			}
		}
		arg4 |= 0x20;
		@Pc(234) Class3 local234 = arg3.method3481((byte) 1, arg4, true);
		local234.method3455(local21, local25, arg2, this.aBoolean385, local8, local35, arg1 - 1, 0);
		if (local68 != null) {
			local234.method3455(local68, local72, local74, this.aBoolean385, local8, local70, arg1 - 1, 0);
		}
		return local234;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILclient!lk;)V")
	private void method4439(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(47) int local47;
		@Pc(62) int local62;
		if (arg0 == 1) {
			local22 = arg1.method4245();
			this.anIntArray640 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray640[local28] = arg1.method4245();
			}
			this.anIntArray639 = new int[local22];
			for (local47 = 0; local47 < local22; local47++) {
				this.anIntArray639[local47] = arg1.method4245();
			}
			for (local62 = 0; local62 < local22; local62++) {
				this.anIntArray639[local62] += arg1.method4245() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt5151 = arg1.method4245();
		} else if (arg0 == 3) {
			this.aBooleanArray118 = new boolean[256];
			local22 = arg1.method4240();
			for (local28 = 0; local28 < local22; local28++) {
				this.aBooleanArray118[arg1.method4240()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean386 = true;
		} else if (arg0 == 5) {
			this.anInt5157 = arg1.method4240();
		} else if (arg0 == 6) {
			this.anInt5169 = arg1.method4245();
		} else if (arg0 == 7) {
			this.anInt5155 = arg1.method4245();
		} else if (arg0 == 8) {
			this.anInt5163 = arg1.method4240();
		} else if (arg0 == 9) {
			this.anInt5156 = arg1.method4240();
		} else if (arg0 == 10) {
			this.anInt5167 = arg1.method4240();
		} else if (arg0 == 11) {
			this.anInt5165 = arg1.method4240();
		} else if (arg0 == 12) {
			local22 = arg1.method4240();
			this.anIntArray638 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray638[local28] = arg1.method4245();
			}
			for (local47 = 0; local47 < local22; local47++) {
				this.anIntArray638[local47] += arg1.method4245() << 16;
			}
		} else if (arg0 == 13) {
			local22 = arg1.method4245();
			this.anIntArrayArray45 = new int[local22][];
			for (local28 = 0; local28 < local22; local28++) {
				local47 = arg1.method4240();
				if (local47 > 0) {
					this.anIntArrayArray45[local28] = new int[local47];
					this.anIntArrayArray45[local28][0] = arg1.method4235();
					for (local62 = 1; local62 < local47; local62++) {
						this.anIntArrayArray45[local28][local62] = arg1.method4245();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean385 = true;
		} else if (arg0 == 15) {
			this.aBoolean384 = true;
		} else if (arg0 == 16) {
			this.aBoolean383 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILclient!ab;IIIII)Lclient!ab;")
	public Class3 method4440(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = this.anIntArray640[arg3];
		@Pc(19) int local19 = this.anIntArray639[arg3];
		@Pc(27) Class2_Sub1_Sub1 local27 = this.aClass175_4.method4106(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg2.method3481(arg0, arg1, true);
		}
		@Pc(41) Class2_Sub1_Sub1 local41 = null;
		if ((this.aBoolean384 || Static151.aBoolean203) && arg4 != -1 && this.anIntArray639.length > arg4) {
			@Pc(63) int local63 = this.anIntArray639[arg4];
			local41 = this.aClass175_4.method4106(local63 >> 16);
			arg4 = local63 & 0xFFFF;
		}
		if (this.aBoolean385) {
			arg1 |= 0x200;
		}
		if (local27.method34(local31)) {
			arg1 |= 0x80;
		}
		if (local27.method31(local31)) {
			arg1 |= 0x100;
		}
		if (local41 != null) {
			if (local41.method34(arg4)) {
				arg1 |= 0x80;
			}
			if (local41.method31(arg4)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(130) Class3 local130 = arg2.method3481(arg0, arg1, true);
		local130.method3455(local27, local31, arg4, this.aBoolean385, local14, local41, arg6 - 1, arg5);
		return local130;
	}
}
