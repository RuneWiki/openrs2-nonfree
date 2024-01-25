import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class175 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Lclient!cl;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
	public int anInt5031;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!jba", name = "B", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "[I")
	public int[] anIntArray291;

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "[I")
	public int[] anIntArray292;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
	public int anInt5024 = 99;

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "I")
	public int anInt5018 = 5;

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
	public int anInt5026 = -1;

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "Z")
	public boolean aBoolean425 = false;

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
	public int anInt5022 = 2;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "Z")
	public boolean aBoolean426 = false;

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
	public int anInt5029 = -1;

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
	public int anInt5035 = -1;

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
	public int anInt5032 = -1;

	@OriginalMember(owner = "client!jba", name = "H", descriptor = "I")
	public int anInt5036 = -1;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIILclient!ka;I)Lclient!ka;")
	public Class153 method4248(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class153 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray291[arg4];
		@Pc(13) int local13 = this.anIntArray288[arg4];
		@Pc(27) Class5_Sub3_Sub9 local27 = this.aClass66_1.method1767(local13 >> 16);
		@Pc(31) int local31 = local13 & 0xFFFF;
		if (local27 == null) {
			return arg3.method8580((byte) 1, arg0, true);
		}
		@Pc(41) Class5_Sub3_Sub9 local41 = null;
		if ((this.aBoolean426 || Static31.aBoolean30) && arg2 != -1 && this.anIntArray288.length > arg2) {
			@Pc(60) int local60 = this.anIntArray288[arg2];
			local41 = this.aClass66_1.method1767(local60 >> 16);
			arg2 = local60 & 0xFFFF;
		}
		@Pc(74) Class5_Sub3_Sub9 local74 = null;
		@Pc(76) Class5_Sub3_Sub9 local76 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray287 != null) {
			if (arg4 < this.anIntArray287.length) {
				local78 = this.anIntArray287[arg4];
				if (local78 != 65535) {
					local74 = this.aClass66_1.method1767(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean426 || Static31.aBoolean30) && arg2 != -1 && arg2 < this.anIntArray287.length) {
				local80 = this.anIntArray287[arg2];
				if (local80 != 65535) {
					local76 = this.aClass66_1.method1767(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean424) {
			arg0 |= 0x200;
		}
		if (local27.method4152(local31)) {
			arg0 |= 0x80;
		}
		if (local27.method4156(local31)) {
			arg0 |= 0x100;
		}
		if (local27.method4151(local31)) {
			arg0 |= 0x400;
		}
		if (local74 != null) {
			if (local74.method4152(local78)) {
				arg0 |= 0x80;
			}
			if (local74.method4156(local78)) {
				arg0 |= 0x100;
			}
			if (local74.method4151(local78)) {
				arg0 |= 0x400;
			}
		}
		if (local41 != null) {
			if (local41.method4152(arg2)) {
				arg0 |= 0x80;
			}
			if (local41.method4156(arg2)) {
				arg0 |= 0x100;
			}
			if (local41.method4151(arg2)) {
				arg0 |= 0x400;
			}
		}
		if (local76 != null) {
			if (local76.method4152(local80)) {
				arg0 |= 0x80;
			}
			if (local76.method4156(local80)) {
				arg0 |= 0x100;
			}
			if (local76.method4151(local80)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(286) Class153 local286 = arg3.method8580((byte) 1, arg0, true);
		local286.method8599(arg1 - 1, local8, local41, 0, local31, arg2, this.aBoolean424, local27);
		if (local74 != null) {
			local286.method8599(arg1 - 1, local8, local76, 0, local78, local80, this.aBoolean424, local74);
		}
		return local286;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BILclient!mc;)V")
	private void method4250(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		@Pc(34) int local34;
		@Pc(52) int local52;
		if (arg0 == 1) {
			local6 = arg1.method7860();
			this.anIntArray291 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray291[local12] = arg1.method7860();
			}
			this.anIntArray288 = new int[local6];
			for (local34 = 0; local34 < local6; local34++) {
				this.anIntArray288[local34] = arg1.method7860();
			}
			for (local52 = 0; local52 < local6; local52++) {
				this.anIntArray288[local52] = (arg1.method7860() << 16) + this.anIntArray288[local52];
			}
		} else if (arg0 == 2) {
			this.anInt5029 = arg1.method7860();
		} else if (arg0 == 3) {
			this.aBooleanArray21 = new boolean[256];
			local6 = arg1.method7816();
			for (local12 = 0; local12 < local6; local12++) {
				this.aBooleanArray21[arg1.method7816()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt5018 = arg1.method7816();
		} else if (arg0 == 6) {
			this.anInt5036 = arg1.method7860();
		} else if (arg0 == 7) {
			this.anInt5035 = arg1.method7860();
		} else if (arg0 == 8) {
			this.anInt5024 = arg1.method7816();
		} else if (arg0 == 9) {
			this.anInt5026 = arg1.method7816();
		} else if (arg0 == 10) {
			this.anInt5032 = arg1.method7816();
		} else if (arg0 == 11) {
			this.anInt5022 = arg1.method7816();
		} else if (arg0 == 12) {
			local6 = arg1.method7816();
			this.anIntArray287 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray287[local12] = arg1.method7860();
			}
			for (local34 = 0; local34 < local6; local34++) {
				this.anIntArray287[local34] = (arg1.method7860() << 16) + this.anIntArray287[local34];
			}
		} else if (arg0 == 13) {
			local6 = arg1.method7860();
			this.anIntArrayArray24 = new int[local6][];
			for (local12 = 0; local12 < local6; local12++) {
				local34 = arg1.method7816();
				if (local34 > 0) {
					this.anIntArrayArray24[local12] = new int[local34];
					this.anIntArrayArray24[local12][0] = arg1.method7807();
					for (local52 = 1; local52 < local34; local52++) {
						this.anIntArrayArray24[local12][local52] = arg1.method7860();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean424 = true;
		} else if (arg0 == 15) {
			this.aBoolean426 = true;
		} else if (arg0 == 16) {
			this.aBoolean423 = true;
		} else if (arg0 == 18) {
			this.aBoolean425 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray292 == null) {
				this.anIntArray292 = new int[this.anIntArrayArray24.length];
				for (local6 = 0; local6 < this.anIntArrayArray24.length; local6++) {
					this.anIntArray292[local6] = 255;
				}
			}
			this.anIntArray292[arg1.method7816()] = arg1.method7816();
		} else if (arg0 == 20) {
			if (this.anIntArray290 == null || this.anIntArray289 == null) {
				this.anIntArray290 = new int[this.anIntArrayArray24.length];
				this.anIntArray289 = new int[this.anIntArrayArray24.length];
				for (local6 = 0; local6 < this.anIntArrayArray24.length; local6++) {
					this.anIntArray290[local6] = 256;
					this.anIntArray289[local6] = 256;
				}
			}
			local6 = arg1.method7816();
			this.anIntArray290[local6] = arg1.method7860();
			this.anIntArray289[local6] = arg1.method7860();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZII)I")
	public int method4252(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray288[arg2];
		@Pc(14) Class5_Sub3_Sub9 local14 = null;
		@Pc(22) Class5_Sub3_Sub9 local22 = this.aClass66_1.method1767(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean426 || Static31.aBoolean30) && arg1 != -1 && this.anIntArray288.length > arg1) {
			local7 = this.anIntArray288[arg1];
			local14 = this.aClass66_1.method1767(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean424) {
			local5 = 512;
		}
		if (local22.method4152(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4156(local26)) {
			local5 |= 0x100;
		}
		if (local22.method4151(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method4152(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4156(local7)) {
				local5 |= 0x100;
			}
			if (local14.method4151(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray287 != null && arg0) {
			@Pc(146) int local146;
			@Pc(161) Class5_Sub3_Sub9 local161;
			if (this.anIntArray287.length > arg2) {
				local146 = this.anIntArray287[arg2];
				if (local146 != 65535) {
					local161 = this.aClass66_1.method1767(local146 >> 16);
					local146 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method4152(local146)) {
							local5 |= 0x80;
						}
						if (local161.method4156(local146)) {
							local5 |= 0x100;
						}
						if (local161.method4151(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean426 || Static31.aBoolean30) && arg1 != -1 && this.anIntArray287.length > arg1) {
				local146 = this.anIntArray287[arg1];
				if (local146 != 65535) {
					local161 = this.aClass66_1.method1767(local146 >> 16);
					local146 &= 0xFFFF;
					if (local161 != null) {
						if (local161.method4152(local146)) {
							local5 |= 0x80;
						}
						if (local161.method4156(local146)) {
							local5 |= 0x100;
						}
						if (local161.method4151(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IBIILclient!ka;III)Lclient!ka;")
	public Class153 method4254(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class153 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray291[arg3];
		@Pc(13) int local13 = this.anIntArray288[arg3];
		@Pc(21) Class5_Sub3_Sub9 local21 = this.aClass66_1.method1767(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method8580(arg1, arg5, true);
		}
		@Pc(35) Class5_Sub3_Sub9 local35 = null;
		if ((this.aBoolean426 || Static31.aBoolean30) && arg6 != -1 && this.anIntArray288.length > arg6) {
			@Pc(57) int local57 = this.anIntArray288[arg6];
			local35 = this.aClass66_1.method1767(local57 >> 16);
			arg6 = local57 & 0xFFFF;
		}
		if (this.aBoolean424) {
			arg5 |= 0x200;
		}
		if (local21.method4152(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method4156(local25)) {
			arg5 |= 0x100;
		}
		if (local21.method4151(local25)) {
			arg5 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method4152(arg6)) {
				arg5 |= 0x80;
			}
			if (local35.method4156(arg6)) {
				arg5 |= 0x100;
			}
			if (local35.method4151(arg6)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(164) Class153 local164 = arg4.method8580(arg1, arg5, true);
		local164.method8599(arg2 - 1, local8, local35, arg0, local25, arg6, this.aBoolean424, local21);
		return local164;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	public void method4256() {
		if (this.anInt5032 == -1) {
			if (this.aBooleanArray21 == null) {
				this.anInt5032 = 0;
			} else {
				this.anInt5032 = 2;
			}
		}
		if (this.anInt5026 != -1) {
			return;
		}
		if (this.aBooleanArray21 == null) {
			this.anInt5026 = 0;
		} else {
			this.anInt5026 = 2;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method4257(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7816();
			if (local7 == 0) {
				return;
			}
			this.method4250(local7, arg0);
		}
	}
}
