import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class84 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
	public int anInt2448;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gr", name = "B", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
	public int anInt2447 = -1;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public int anInt2452 = -1;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public int anInt2450 = -1;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "Z")
	public boolean aBoolean233 = false;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
	public int anInt2456 = 2;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Z")
	public boolean aBoolean232 = false;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public int anInt2443 = -1;

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public int anInt2459 = 5;

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Z")
	public boolean aBoolean235 = false;

	@OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
	public int anInt2463 = -1;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	public int anInt2462 = 99;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ef;I)V")
	public void method2271(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3124();
			if (local14 == 0) {
				return;
			}
			this.method2273(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!wp;IIIBI)Lclient!wp;")
	public Class49 method2272(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray198[arg1];
		@Pc(13) int local13 = this.anIntArray197[arg1];
		@Pc(19) Class2_Sub9_Sub2 local19 = Static276.method4760(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method5810((byte) 1, arg3, true);
		}
		@Pc(33) Class2_Sub9_Sub2 local33 = null;
		if ((this.aBoolean235 || Static263.aBoolean483) && arg2 != -1 && this.anIntArray197.length > arg2) {
			@Pc(56) int local56 = this.anIntArray197[arg2];
			local33 = Static276.method4760(local56 >> 16);
			arg2 = local56 & 0xFFFF;
		}
		@Pc(68) Class2_Sub9_Sub2 local68 = null;
		@Pc(78) Class2_Sub9_Sub2 local78 = null;
		@Pc(80) int local80 = 0;
		@Pc(82) int local82 = 0;
		if (this.anIntArray196 != null) {
			if (arg1 < this.anIntArray196.length) {
				local80 = this.anIntArray196[arg1];
				if (local80 != 65535) {
					local68 = Static276.method4760(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
			if ((this.aBoolean235 || Static263.aBoolean483) && arg2 != -1 && this.anIntArray196.length > arg2) {
				local82 = this.anIntArray196[arg2];
				if (local82 != 65535) {
					local78 = Static276.method4760(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean233) {
			arg3 |= 0x200;
		}
		if (local19.method1315(local23)) {
			arg3 |= 0x80;
		}
		if (local19.method1314(local23)) {
			arg3 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method1315(local80)) {
				arg3 |= 0x80;
			}
			if (local68.method1314(local80)) {
				arg3 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method1315(arg2)) {
				arg3 |= 0x80;
			}
			if (local33.method1314(arg2)) {
				arg3 |= 0x100;
			}
		}
		if (local78 != null) {
			if (local78.method1315(local82)) {
				arg3 |= 0x80;
			}
			if (local78.method1314(local82)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(239) Class49 local239 = arg0.method5810((byte) 1, arg3, true);
		local239.method5848(local8, arg2, 0, local33, arg4 - 1, local19, this.aBoolean233, local23);
		if (local68 != null) {
			local239.method5848(local8, local82, 0, local78, arg4 - 1, local68, this.aBoolean233, local80);
		}
		return local239;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ef;BI)V")
	private void method2273(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(95) int local95;
		@Pc(101) int local101;
		@Pc(120) int local120;
		@Pc(206) int local206;
		if (arg1 == 1) {
			local95 = arg0.method3104();
			this.anIntArray198 = new int[local95];
			for (local101 = 0; local101 < local95; local101++) {
				this.anIntArray198[local101] = arg0.method3104();
			}
			this.anIntArray197 = new int[local95];
			for (local120 = 0; local120 < local95; local120++) {
				this.anIntArray197[local120] = arg0.method3104();
			}
			for (local206 = 0; local206 < local95; local206++) {
				this.anIntArray197[local206] = (arg0.method3104() << 16) + this.anIntArray197[local206];
			}
		} else if (arg1 == 2) {
			this.anInt2452 = arg0.method3104();
		} else if (arg1 == 3) {
			this.aBooleanArray8 = new boolean[256];
			local95 = arg0.method3124();
			for (local101 = 0; local101 < local95; local101++) {
				this.aBooleanArray8[arg0.method3124()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean232 = true;
		} else if (arg1 == 5) {
			this.anInt2459 = arg0.method3124();
		} else if (arg1 == 6) {
			this.anInt2447 = arg0.method3104();
		} else if (arg1 == 7) {
			this.anInt2450 = arg0.method3104();
		} else if (arg1 == 8) {
			this.anInt2462 = arg0.method3124();
		} else if (arg1 == 9) {
			this.anInt2443 = arg0.method3124();
		} else if (arg1 == 10) {
			this.anInt2463 = arg0.method3124();
		} else if (arg1 == 11) {
			this.anInt2456 = arg0.method3124();
		} else if (arg1 == 12) {
			local95 = arg0.method3124();
			this.anIntArray196 = new int[local95];
			for (local101 = 0; local101 < local95; local101++) {
				this.anIntArray196[local101] = arg0.method3104();
			}
			for (local120 = 0; local120 < local95; local120++) {
				this.anIntArray196[local120] = (arg0.method3104() << 16) + this.anIntArray196[local120];
			}
		} else if (arg1 == 13) {
			local95 = arg0.method3104();
			this.anIntArrayArray22 = new int[local95][];
			for (local101 = 0; local101 < local95; local101++) {
				local120 = arg0.method3124();
				if (local120 > 0) {
					this.anIntArrayArray22[local101] = new int[local120];
					this.anIntArrayArray22[local101][0] = arg0.method3163();
					for (local206 = 1; local206 < local120; local206++) {
						this.anIntArrayArray22[local101][local206] = arg0.method3104();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean233 = true;
		} else if (arg1 == 15) {
			this.aBoolean235 = true;
		} else if (arg1 == 16) {
			this.aBoolean234 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method2275() {
		if (this.anInt2463 == -1) {
			if (this.aBooleanArray8 == null) {
				this.anInt2463 = 0;
			} else {
				this.anInt2463 = 2;
			}
		}
		if (this.anInt2443 != -1) {
			return;
		}
		if (this.aBooleanArray8 == null) {
			this.anInt2443 = 0;
		} else {
			this.anInt2443 = 2;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIZI)I")
	public int method2276(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray197[arg2];
		@Pc(14) Class2_Sub9_Sub2 local14 = null;
		@Pc(20) Class2_Sub9_Sub2 local20 = Static276.method4760(local12 >> 16);
		@Pc(24) int local24 = local12 & 0xFFFF;
		if (local20 == null) {
			return 0;
		}
		if ((this.aBoolean235 || Static263.aBoolean483) && arg0 != -1 && arg0 < this.anIntArray197.length) {
			local7 = this.anIntArray197[arg0];
			local14 = Static276.method4760(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean233) {
			local5 = 512;
		}
		if (local20.method1315(local24)) {
			local5 |= 0x80;
		}
		if (local20.method1314(local24)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method1315(local7)) {
				local5 |= 0x80;
			}
			if (local14.method1314(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray196 != null && arg1) {
			@Pc(128) int local128;
			@Pc(139) Class2_Sub9_Sub2 local139;
			if (arg2 < this.anIntArray196.length) {
				local128 = this.anIntArray196[arg2];
				if (local128 != 65535) {
					local139 = Static276.method4760(local128 >> 16);
					local128 &= 0xFFFF;
					if (local139 != null) {
						if (local139.method1315(local128)) {
							local5 |= 0x80;
						}
						if (local139.method1314(local128)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean235 || Static263.aBoolean483) && arg0 != -1 && this.anIntArray196.length > arg0) {
				local128 = this.anIntArray196[arg0];
				if (local128 != 65535) {
					local139 = Static276.method4760(local128 >> 16);
					local128 &= 0xFFFF;
					if (local139 != null) {
						if (local139.method1315(local128)) {
							local5 |= 0x80;
						}
						if (local139.method1314(local128)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!wp;IBIIII)Lclient!wp;")
	public Class49 method2279(@OriginalArg(0) byte arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray198[arg3];
		@Pc(13) int local13 = this.anIntArray197[arg3];
		@Pc(19) Class2_Sub9_Sub2 local19 = Static276.method4760(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method5810(arg0, arg6, true);
		}
		@Pc(38) Class2_Sub9_Sub2 local38 = null;
		if ((this.aBoolean235 || Static263.aBoolean483) && arg2 != -1 && this.anIntArray197.length > arg2) {
			@Pc(61) int local61 = this.anIntArray197[arg2];
			local38 = Static276.method4760(local61 >> 16);
			arg2 = local61 & 0xFFFF;
		}
		if (this.aBoolean233) {
			arg6 |= 0x200;
		}
		if (local19.method1315(local23)) {
			arg6 |= 0x80;
		}
		if (local19.method1314(local23)) {
			arg6 |= 0x100;
		}
		if (local38 != null) {
			if (local38.method1315(arg2)) {
				arg6 |= 0x80;
			}
			if (local38.method1314(arg2)) {
				arg6 |= 0x100;
			}
		}
		arg6 |= 0x20;
		@Pc(126) Class49 local126 = arg1.method5810(arg0, arg6, true);
		local126.method5848(local8, arg2, arg5, local38, arg4 - 1, local19, this.aBoolean233, local23);
		return local126;
	}
}
