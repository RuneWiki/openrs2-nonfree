import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class111 {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "[Z")
	public boolean[] aBooleanArray15;

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public int anInt2708 = -1;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public int anInt2711 = -1;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
	public int anInt2716 = 5;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
	public int anInt2714 = 99;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
	public int anInt2713 = -1;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
	public int anInt2720 = 2;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
	public int anInt2724 = -1;

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
	public int anInt2723 = -1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!kh;)V")
	public void method2267(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method2269(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIII)I")
	public int method2268(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(20) int local20 = this.anIntArray191[arg1];
		@Pc(22) Class11_Sub4_Sub14 local22 = null;
		@Pc(28) Class11_Sub4_Sub14 local28 = Static36.method537(local20 >> 16);
		@Pc(32) int local32 = local20 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean188 || Static256.aBoolean339) && arg2 != -1 && this.anIntArray191.length > arg2) {
			local7 = this.anIntArray191[arg2];
			local22 = Static36.method537(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean186) {
			local5 = 512;
		}
		if (local28.method4230(local32)) {
			local5 |= 0x80;
		}
		if (local28.method4229(local32)) {
			local5 |= 0x100;
		}
		if (local22 != null) {
			if (local22.method4230(local7)) {
				local5 |= 0x80;
			}
			if (local22.method4229(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray189 != null && arg0) {
			@Pc(124) int local124;
			@Pc(135) Class11_Sub4_Sub14 local135;
			if (this.anIntArray189.length > arg1) {
				local124 = this.anIntArray189[arg1];
				if (local124 != 65535) {
					local135 = Static36.method537(local124 >> 16);
					local124 &= 0xFFFF;
					if (local135 != null) {
						if (local135.method4230(local124)) {
							local5 |= 0x80;
						}
						if (local135.method4229(local124)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean188 || Static256.aBoolean339) && arg2 != -1 && arg2 < this.anIntArray189.length) {
				local124 = this.anIntArray189[arg2];
				if (local124 != 65535) {
					local135 = Static36.method537(local124 >> 16);
					local124 &= 0xFFFF;
					if (local135 != null) {
						if (local135.method4230(local124)) {
							local5 |= 0x80;
						}
						if (local135.method4229(local124)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!kh;II)V")
	private void method2269(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(45) int local45;
		@Pc(64) int local64;
		if (arg1 == 1) {
			local20 = arg0.method5187();
			this.anIntArray190 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray190[local26] = arg0.method5187();
			}
			this.anIntArray191 = new int[local20];
			for (local45 = 0; local45 < local20; local45++) {
				this.anIntArray191[local45] = arg0.method5187();
			}
			for (local64 = 0; local64 < local20; local64++) {
				this.anIntArray191[local64] = (arg0.method5187() << 16) + this.anIntArray191[local64];
			}
		} else if (arg1 == 2) {
			this.anInt2723 = arg0.method5187();
		} else if (arg1 == 3) {
			this.aBooleanArray15 = new boolean[256];
			local20 = arg0.method5185();
			for (local26 = 0; local26 < local20; local26++) {
				this.aBooleanArray15[arg0.method5185()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean187 = true;
		} else if (arg1 == 5) {
			this.anInt2716 = arg0.method5185();
		} else if (arg1 == 6) {
			this.anInt2724 = arg0.method5187();
		} else if (arg1 == 7) {
			this.anInt2708 = arg0.method5187();
		} else if (arg1 == 8) {
			this.anInt2714 = arg0.method5185();
		} else if (arg1 == 9) {
			this.anInt2713 = arg0.method5185();
		} else if (arg1 == 10) {
			this.anInt2711 = arg0.method5185();
		} else if (arg1 == 11) {
			this.anInt2720 = arg0.method5185();
		} else if (arg1 == 12) {
			local20 = arg0.method5185();
			this.anIntArray189 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray189[local26] = arg0.method5187();
			}
			for (local45 = 0; local45 < local20; local45++) {
				this.anIntArray189[local45] += arg0.method5187() << 16;
			}
		} else if (arg1 == 13) {
			local20 = arg0.method5187();
			this.anIntArrayArray30 = new int[local20][];
			for (local26 = 0; local26 < local20; local26++) {
				local45 = arg0.method5185();
				if (local45 > 0) {
					this.anIntArrayArray30[local26] = new int[local45];
					this.anIntArrayArray30[local26][0] = arg0.method5221();
					for (local64 = 1; local64 < local45; local64++) {
						this.anIntArrayArray30[local26][local64] = arg0.method5187();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean186 = true;
		} else if (arg1 == 15) {
			this.aBoolean188 = true;
		} else if (arg1 == 16) {
			this.aBoolean185 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBIILclient!mj;BII)Lclient!mj;")
	public Class126 method2270(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class126 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray190[arg0];
		@Pc(13) int local13 = this.anIntArray191[arg0];
		@Pc(19) Class11_Sub4_Sub14 local19 = Static36.method537(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method3158(arg1, arg6, true);
		}
		@Pc(41) Class11_Sub4_Sub14 local41 = null;
		if ((this.aBoolean188 || Static256.aBoolean339) && arg3 != -1 && this.anIntArray191.length > arg3) {
			@Pc(63) int local63 = this.anIntArray191[arg3];
			local41 = Static36.method537(local63 >> 16);
			arg3 = local63 & 0xFFFF;
		}
		if (this.aBoolean186) {
			arg6 |= 0x200;
		}
		if (local19.method4230(local23)) {
			arg6 |= 0x80;
		}
		if (local19.method4229(local23)) {
			arg6 |= 0x100;
		}
		if (local41 != null) {
			if (local41.method4230(arg3)) {
				arg6 |= 0x80;
			}
			if (local41.method4229(arg3)) {
				arg6 |= 0x100;
			}
		}
		arg6 |= 0x20;
		@Pc(128) Class126 local128 = arg4.method3158(arg1, arg6, true);
		local128.method3144(arg3, local19, this.aBoolean186, local23, local41, arg2, local8, arg5 - 1);
		return local128;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIBILclient!mj;)Lclient!mj;")
	public Class126 method2272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class126 arg4) {
		@Pc(8) int local8 = this.anIntArray190[arg2];
		@Pc(13) int local13 = this.anIntArray191[arg2];
		@Pc(19) Class11_Sub4_Sub14 local19 = Static36.method537(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method3158((byte) 1, arg0, true);
		}
		@Pc(33) Class11_Sub4_Sub14 local33 = null;
		if ((this.aBoolean188 || Static256.aBoolean339) && arg3 != -1 && arg3 < this.anIntArray191.length) {
			@Pc(56) int local56 = this.anIntArray191[arg3];
			local33 = Static36.method537(local56 >> 16);
			arg3 = local56 & 0xFFFF;
		}
		@Pc(68) Class11_Sub4_Sub14 local68 = null;
		@Pc(70) Class11_Sub4_Sub14 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray189 != null) {
			if (arg2 < this.anIntArray189.length) {
				local72 = this.anIntArray189[arg2];
				if (local72 != 65535) {
					local68 = Static36.method537(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean188 || Static256.aBoolean339) && arg3 != -1 && arg3 < this.anIntArray189.length) {
				local74 = this.anIntArray189[arg3];
				if (local74 != 65535) {
					local70 = Static36.method537(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean186) {
			arg0 |= 0x200;
		}
		if (local19.method4230(local23)) {
			arg0 |= 0x80;
		}
		if (local19.method4229(local23)) {
			arg0 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method4230(local72)) {
				arg0 |= 0x80;
			}
			if (local68.method4229(local72)) {
				arg0 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method4230(arg3)) {
				arg0 |= 0x80;
			}
			if (local33.method4229(arg3)) {
				arg0 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method4230(local74)) {
				arg0 |= 0x80;
			}
			if (local70.method4229(local74)) {
				arg0 |= 0x100;
			}
		}
		arg0 |= 0x20;
		@Pc(240) Class126 local240 = arg4.method3158((byte) 1, arg0, true);
		local240.method3144(arg3, local19, this.aBoolean186, local23, local33, 0, local8, arg1 - 1);
		if (local68 != null) {
			local240.method3144(local74, local68, this.aBoolean186, local72, local70, 0, local8, arg1 - 1);
		}
		return local240;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public void method2273() {
		if (this.anInt2711 == -1) {
			if (this.aBooleanArray15 == null) {
				this.anInt2711 = 0;
			} else {
				this.anInt2711 = 2;
			}
		}
		if (this.anInt2713 != -1) {
			return;
		}
		if (this.aBooleanArray15 == null) {
			this.anInt2713 = 0;
		} else {
			this.anInt2713 = 2;
		}
	}
}
