import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class149 {

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "[I")
	public int[] anIntArray307;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "Lclient!sd;")
	public Class303 aClass303_2;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
	public int anInt4520;

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "[Z")
	public boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Z")
	public boolean aBoolean376 = false;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	public int anInt4508 = -1;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Z")
	public boolean aBoolean375 = false;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "Z")
	public boolean aBoolean378 = false;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	public int anInt4516 = 2;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
	public int anInt4505 = -1;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	public int anInt4517 = -1;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	public int anInt4518 = 5;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
	public int anInt4504 = -1;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	public int anInt4506 = 99;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	public int anInt4510 = -1;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIILclient!ka;II)Lclient!ka;")
	public Class25 method3735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray306[arg4];
		@Pc(13) int local13 = this.anIntArray308[arg4];
		@Pc(21) Class2_Sub5_Sub5 local21 = this.aClass303_2.method7206(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method7732((byte) 1, arg1, true);
		}
		@Pc(41) Class2_Sub5_Sub5 local41 = null;
		if ((this.aBoolean379 || Static424.aBoolean577) && arg0 != -1 && arg0 < this.anIntArray308.length) {
			@Pc(64) int local64 = this.anIntArray308[arg0];
			local41 = this.aClass303_2.method7206(local64 >> 16);
			arg0 = local64 & 0xFFFF;
		}
		@Pc(78) Class2_Sub5_Sub5 local78 = null;
		@Pc(80) Class2_Sub5_Sub5 local80 = null;
		@Pc(82) int local82 = 0;
		@Pc(84) int local84 = 0;
		if (this.anIntArray305 != null) {
			if (arg4 < this.anIntArray305.length) {
				local82 = this.anIntArray305[arg4];
				if (local82 != 65535) {
					local78 = this.aClass303_2.method7206(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
			if ((this.aBoolean379 || Static424.aBoolean577) && arg0 != -1 && this.anIntArray305.length > arg0) {
				local84 = this.anIntArray305[arg0];
				if (local84 != 65535) {
					local80 = this.aClass303_2.method7206(local84 >> 16);
					local84 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean375) {
			arg1 |= 0x200;
		}
		if (local21.method1835(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method1838(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method1837(local25)) {
			arg1 |= 0x400;
		}
		if (local78 != null) {
			if (local78.method1835(local82)) {
				arg1 |= 0x80;
			}
			if (local78.method1838(local82)) {
				arg1 |= 0x100;
			}
			if (local78.method1837(local82)) {
				arg1 |= 0x400;
			}
		}
		if (local41 != null) {
			if (local41.method1835(arg0)) {
				arg1 |= 0x80;
			}
			if (local41.method1838(arg0)) {
				arg1 |= 0x100;
			}
			if (local41.method1837(arg0)) {
				arg1 |= 0x400;
			}
		}
		if (local80 != null) {
			if (local80.method1835(local84)) {
				arg1 |= 0x80;
			}
			if (local80.method1838(local84)) {
				arg1 |= 0x100;
			}
			if (local80.method1837(local84)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(278) Class25 local278 = arg2.method7732((byte) 1, arg1, true);
		local278.method7715(this.aBoolean375, local21, local25, 0, arg0, arg3 - 1, local41, local8);
		if (local78 != null) {
			local278.method7715(this.aBoolean375, local78, local82, 0, local84, arg3 - 1, local80, local8);
		}
		return local278;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public void method3736() {
		if (this.anInt4517 == -1) {
			if (this.aBooleanArray30 == null) {
				this.anInt4517 = 0;
			} else {
				this.anInt4517 = 2;
			}
		}
		if (this.anInt4510 != -1) {
			return;
		}
		if (this.aBooleanArray30 == null) {
			this.anInt4510 = 0;
		} else {
			this.anInt4510 = 2;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ka;BIIIIIB)Lclient!ka;")
	public Class25 method3737(@OriginalArg(0) Class25 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray306[arg1];
		@Pc(13) int local13 = this.anIntArray308[arg1];
		@Pc(21) Class2_Sub5_Sub5 local21 = this.aClass303_2.method7206(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method7732(arg6, arg5, true);
		}
		@Pc(35) Class2_Sub5_Sub5 local35 = null;
		if ((this.aBoolean379 || Static424.aBoolean577) && arg4 != -1 && arg4 < this.anIntArray308.length) {
			@Pc(58) int local58 = this.anIntArray308[arg4];
			local35 = this.aClass303_2.method7206(local58 >> 16);
			arg4 = local58 & 0xFFFF;
		}
		if (this.aBoolean375) {
			arg5 |= 0x200;
		}
		if (local21.method1835(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method1838(local25)) {
			arg5 |= 0x100;
		}
		if (local21.method1837(local25)) {
			arg5 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method1835(arg4)) {
				arg5 |= 0x80;
			}
			if (local35.method1838(arg4)) {
				arg5 |= 0x100;
			}
			if (local35.method1837(arg4)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(148) Class25 local148 = arg0.method7732(arg6, arg5, true);
		local148.method7715(this.aBoolean375, local21, local25, arg2, arg4, arg3 - 1, local35, local8);
		return local148;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ud;I)V")
	public void method3738(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6904();
			if (local3 == 0) {
				return;
			}
			this.method3739(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!ud;)V")
	private void method3739(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		@Pc(29) int local29;
		@Pc(31) int local31;
		@Pc(128) int local128;
		@Pc(324) int local324;
		if (arg0 == 1) {
			local29 = arg1.method6884();
			this.anIntArray306 = new int[local29];
			for (local31 = 0; local31 < local29; local31++) {
				this.anIntArray306[local31] = arg1.method6884();
			}
			this.anIntArray308 = new int[local29];
			for (local128 = 0; local128 < local29; local128++) {
				this.anIntArray308[local128] = arg1.method6884();
			}
			for (local324 = 0; local324 < local29; local324++) {
				this.anIntArray308[local324] += arg1.method6884() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt4505 = arg1.method6884();
		} else if (arg0 == 3) {
			this.aBooleanArray30 = new boolean[256];
			local29 = arg1.method6904();
			for (local31 = 0; local31 < local29; local31++) {
				this.aBooleanArray30[arg1.method6904()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt4518 = arg1.method6904();
		} else if (arg0 == 6) {
			this.anInt4508 = arg1.method6884();
		} else if (arg0 == 7) {
			this.anInt4504 = arg1.method6884();
		} else if (arg0 == 8) {
			this.anInt4506 = arg1.method6904();
		} else if (arg0 == 9) {
			this.anInt4510 = arg1.method6904();
		} else if (arg0 == 10) {
			this.anInt4517 = arg1.method6904();
		} else if (arg0 == 11) {
			this.anInt4516 = arg1.method6904();
		} else if (arg0 == 12) {
			local29 = arg1.method6904();
			this.anIntArray305 = new int[local29];
			for (local31 = 0; local31 < local29; local31++) {
				this.anIntArray305[local31] = arg1.method6884();
			}
			for (local128 = 0; local128 < local29; local128++) {
				this.anIntArray305[local128] = (arg1.method6884() << 16) + this.anIntArray305[local128];
			}
		} else if (arg0 == 13) {
			local29 = arg1.method6884();
			this.anIntArrayArray34 = new int[local29][];
			for (local31 = 0; local31 < local29; local31++) {
				local128 = arg1.method6904();
				if (local128 > 0) {
					this.anIntArrayArray34[local31] = new int[local128];
					this.anIntArrayArray34[local31][0] = arg1.method6870();
					for (local324 = 1; local324 < local128; local324++) {
						this.anIntArrayArray34[local31][local324] = arg1.method6884();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean375 = true;
		} else if (arg0 == 15) {
			this.aBoolean379 = true;
		} else if (arg0 == 16) {
			this.aBoolean376 = true;
		} else if (arg0 == 18) {
			this.aBoolean378 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray309 == null) {
				this.anIntArray309 = new int[this.anIntArrayArray34.length];
				for (local29 = 0; local29 < this.anIntArrayArray34.length; local29++) {
					this.anIntArray309[local29] = 255;
				}
			}
			this.anIntArray309[arg1.method6904()] = arg1.method6904();
			return;
		} else if (arg0 == 20) {
			if (this.anIntArray307 == null || this.anIntArray310 == null) {
				this.anIntArray307 = new int[this.anIntArrayArray34.length];
				this.anIntArray310 = new int[this.anIntArrayArray34.length];
				for (local29 = 0; local29 < this.anIntArrayArray34.length; local29++) {
					this.anIntArray307[local29] = 256;
					this.anIntArray310[local29] = 256;
				}
			}
			local29 = arg1.method6904();
			this.anIntArray307[local29] = arg1.method6884();
			this.anIntArray310[local29] = arg1.method6884();
			return;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIZ)I")
	public int method3741(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray308[arg1];
		@Pc(14) Class2_Sub5_Sub5 local14 = null;
		@Pc(22) Class2_Sub5_Sub5 local22 = this.aClass303_2.method7206(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean379 || Static424.aBoolean577) && arg0 != -1 && this.anIntArray308.length > arg0) {
			local7 = this.anIntArray308[arg0];
			local14 = this.aClass303_2.method7206(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean375) {
			local5 = 512;
		}
		if (local22.method1835(local26)) {
			local5 |= 0x80;
		}
		if (local22.method1838(local26)) {
			local5 |= 0x100;
		}
		if (local22.method1837(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method1835(local7)) {
				local5 |= 0x80;
			}
			if (local14.method1838(local7)) {
				local5 |= 0x100;
			}
			if (local14.method1837(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray305 != null && arg2) {
			@Pc(146) int local146;
			@Pc(159) Class2_Sub5_Sub5 local159;
			if (this.anIntArray305.length > arg1) {
				local146 = this.anIntArray305[arg1];
				if (local146 != 65535) {
					local159 = this.aClass303_2.method7206(local146 >> 16);
					local146 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method1835(local146)) {
							local5 |= 0x80;
						}
						if (local159.method1838(local146)) {
							local5 |= 0x100;
						}
						if (local159.method1837(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean379 || Static424.aBoolean577) && arg0 != -1 && arg0 < this.anIntArray305.length) {
				local146 = this.anIntArray305[arg0];
				if (local146 != 65535) {
					local159 = this.aClass303_2.method7206(local146 >> 16);
					local146 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method1835(local146)) {
							local5 |= 0x80;
						}
						if (local159.method1838(local146)) {
							local5 |= 0x100;
						}
						if (local159.method1837(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
