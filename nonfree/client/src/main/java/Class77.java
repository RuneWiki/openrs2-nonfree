import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class77 {

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Lclient!uc;")
	public Class327 aClass327_1;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "[Z")
	public boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public int anInt2576 = -1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	public int anInt2572 = -1;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
	public int anInt2582 = 5;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	public int anInt2575 = -1;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public int anInt2581 = -1;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
	public int anInt2577 = 99;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
	public int anInt2584 = 0;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "Z")
	public boolean aBoolean207 = false;

	@OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
	public int anInt2587 = -1;

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
	public int anInt2586 = 2;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "Z")
	public boolean aBoolean205 = false;

	@OriginalMember(owner = "client!dv", name = "B", descriptor = "Z")
	public boolean aBoolean208 = false;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIBIBILclient!ba;)Lclient!ba;")
	public Class9 method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6) {
		@Pc(8) int local8 = this.anIntArray240[arg5];
		@Pc(13) int local13 = this.anIntArray238[arg5];
		@Pc(27) Class4_Sub7_Sub19 local27 = this.aClass327_1.method7324(local13 >> 16);
		@Pc(31) int local31 = local13 & 0xFFFF;
		if (local27 == null) {
			return arg6.method4006(arg4, arg2, true);
		}
		@Pc(41) Class4_Sub7_Sub19 local41 = null;
		if ((this.aBoolean206 || Static244.aBoolean365) && arg0 != -1 && arg0 < this.anIntArray238.length) {
			@Pc(64) int local64 = this.anIntArray238[arg0];
			local41 = this.aClass327_1.method7324(local64 >> 16);
			arg0 = local64 & 0xFFFF;
		}
		if (this.aBoolean207) {
			arg2 |= 0x200;
		}
		if (local27.method7969(local31)) {
			arg2 |= 0x80;
		}
		if (local27.method7967(local31)) {
			arg2 |= 0x100;
		}
		if (local27.method7970(local31)) {
			arg2 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method7969(arg0)) {
				arg2 |= 0x80;
			}
			if (local41.method7967(arg0)) {
				arg2 |= 0x100;
			}
			if (local41.method7970(arg0)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(151) Class9 local151 = arg6.method4006(arg4, arg2, true);
		local151.method4005(this.aBoolean207, arg1, local8, arg0, local41, local31, local27, arg3 - 1);
		return local151;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BLclient!eh;)V")
	public void method2293(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6015();
			if (local5 == 0) {
				return;
			}
			this.method2297(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBIIILclient!ba;)Lclient!ba;")
	public Class9 method2294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9 arg4) {
		@Pc(8) int local8 = this.anIntArray240[arg0];
		@Pc(13) int local13 = this.anIntArray238[arg0];
		@Pc(21) Class4_Sub7_Sub19 local21 = this.aClass327_1.method7324(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method4006((byte) 1, arg1, true);
		}
		@Pc(35) Class4_Sub7_Sub19 local35 = null;
		if ((this.aBoolean206 || Static244.aBoolean365) && arg3 != -1 && arg3 < this.anIntArray238.length) {
			@Pc(54) int local54 = this.anIntArray238[arg3];
			local35 = this.aClass327_1.method7324(local54 >> 16);
			arg3 = local54 & 0xFFFF;
		}
		@Pc(68) Class4_Sub7_Sub19 local68 = null;
		@Pc(70) Class4_Sub7_Sub19 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray239 != null) {
			if (this.anIntArray239.length > arg0) {
				local72 = this.anIntArray239[arg0];
				if (local72 != 65535) {
					local68 = this.aClass327_1.method7324(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean206 || Static244.aBoolean365) && arg3 != -1 && this.anIntArray239.length > arg3) {
				local74 = this.anIntArray239[arg3];
				if (local74 != 65535) {
					local70 = this.aClass327_1.method7324(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean207) {
			arg1 |= 0x200;
		}
		if (local21.method7969(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method7967(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method7970(local25)) {
			arg1 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method7969(local72)) {
				arg1 |= 0x80;
			}
			if (local68.method7967(local72)) {
				arg1 |= 0x100;
			}
			if (local68.method7970(local72)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method7969(arg3)) {
				arg1 |= 0x80;
			}
			if (local35.method7967(arg3)) {
				arg1 |= 0x100;
			}
			if (local35.method7970(arg3)) {
				arg1 |= 0x400;
			}
		}
		if (local70 != null) {
			if (local70.method7969(local74)) {
				arg1 |= 0x80;
			}
			if (local70.method7967(local74)) {
				arg1 |= 0x100;
			}
			if (local70.method7970(local74)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(281) Class9 local281 = arg4.method4006((byte) 1, arg1, true);
		local281.method4005(this.aBoolean207, 0, local8, arg3, local35, local25, local21, arg2 - 1);
		if (local68 != null) {
			local281.method4005(this.aBoolean207, 0, local8, local74, local70, local72, local68, arg2 - 1);
		}
		return local281;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZII)I")
	public int method2295(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = this.anIntArray238[arg2];
		@Pc(19) Class4_Sub7_Sub19 local19 = null;
		@Pc(27) Class4_Sub7_Sub19 local27 = this.aClass327_1.method7324(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean206 || Static244.aBoolean365) && arg1 != -1 && arg1 < this.anIntArray238.length) {
			local7 = this.anIntArray238[arg1];
			local19 = this.aClass327_1.method7324(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean207) {
			local5 = 512;
		}
		if (local27.method7969(local31)) {
			local5 |= 0x80;
		}
		if (local27.method7967(local31)) {
			local5 |= 0x100;
		}
		if (local27.method7970(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method7969(local7)) {
				local5 |= 0x80;
			}
			if (local19.method7967(local7)) {
				local5 |= 0x100;
			}
			if (local19.method7970(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray239 != null && arg0) {
			@Pc(144) int local144;
			@Pc(155) Class4_Sub7_Sub19 local155;
			if (arg2 < this.anIntArray239.length) {
				local144 = this.anIntArray239[arg2];
				if (local144 != 65535) {
					local155 = this.aClass327_1.method7324(local144 >> 16);
					local144 &= 0xFFFF;
					if (local155 != null) {
						if (local155.method7969(local144)) {
							local5 |= 0x80;
						}
						if (local155.method7967(local144)) {
							local5 |= 0x100;
						}
						if (local155.method7970(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean206 || Static244.aBoolean365) && arg1 != -1 && this.anIntArray239.length > arg1) {
				local144 = this.anIntArray239[arg1];
				if (local144 != 65535) {
					local155 = this.aClass327_1.method7324(local144 >> 16);
					local144 &= 0xFFFF;
					if (local155 != null) {
						if (local155.method7969(local144)) {
							local5 |= 0x80;
						}
						if (local155.method7967(local144)) {
							local5 |= 0x100;
						}
						if (local155.method7970(local144)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
	public void method2296() {
		if (this.anInt2587 == -1) {
			if (this.aBooleanArray10 == null) {
				this.anInt2587 = 0;
			} else {
				this.anInt2587 = 2;
			}
		}
		if (this.anInt2581 != -1) {
			return;
		}
		if (this.aBooleanArray10 == null) {
			this.anInt2581 = 0;
		} else {
			this.anInt2581 = 2;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method2297(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(92) int local92;
		@Pc(98) int local98;
		@Pc(117) int local117;
		@Pc(182) int local182;
		if (arg1 == 1) {
			local92 = arg0.method5982();
			this.anIntArray240 = new int[local92];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray240[local98] = arg0.method5982();
			}
			this.anIntArray238 = new int[local92];
			for (local117 = 0; local117 < local92; local117++) {
				this.anIntArray238[local117] = arg0.method5982();
			}
			for (local182 = 0; local182 < local92; local182++) {
				this.anIntArray238[local182] = (arg0.method5982() << 16) + this.anIntArray238[local182];
			}
		} else if (arg1 == 2) {
			this.anInt2575 = arg0.method5982();
		} else if (arg1 == 3) {
			this.aBooleanArray10 = new boolean[256];
			local92 = arg0.method6015();
			for (local98 = 0; local98 < local92; local98++) {
				this.aBooleanArray10[arg0.method6015()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt2582 = arg0.method6015();
		} else if (arg1 == 6) {
			this.anInt2576 = arg0.method5982();
		} else if (arg1 == 7) {
			this.anInt2572 = arg0.method5982();
		} else if (arg1 == 8) {
			this.anInt2577 = arg0.method6015();
		} else if (arg1 == 9) {
			this.anInt2587 = arg0.method6015();
		} else if (arg1 == 10) {
			this.anInt2581 = arg0.method6015();
		} else if (arg1 == 11) {
			this.anInt2586 = arg0.method6015();
		} else if (arg1 == 12) {
			local92 = arg0.method6015();
			this.anIntArray239 = new int[local92];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray239[local98] = arg0.method5982();
			}
			for (local117 = 0; local117 < local92; local117++) {
				this.anIntArray239[local117] = (arg0.method5982() << 16) + this.anIntArray239[local117];
			}
		} else if (arg1 == 13) {
			local92 = arg0.method5982();
			this.anIntArrayArray36 = new int[local92][];
			for (local98 = 0; local98 < local92; local98++) {
				local117 = arg0.method6015();
				if (local117 > 0) {
					this.anIntArrayArray36[local98] = new int[local117];
					this.anIntArrayArray36[local98][0] = arg0.method6023();
					for (local182 = 1; local182 < local117; local182++) {
						this.anIntArrayArray36[local98][local182] = arg0.method5982();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean207 = true;
		} else if (arg1 == 15) {
			this.aBoolean206 = true;
		} else if (arg1 == 16) {
			this.aBoolean205 = true;
		} else if (arg1 == 17) {
			this.anInt2584 = arg0.method6015();
		} else if (arg1 == 18) {
			this.aBoolean208 = true;
		}
	}
}
