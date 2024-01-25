import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class143 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Lclient!sb;")
	public Class219 aClass219_3;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "[I")
	public int[] anIntArray241;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	public int anInt3770 = -1;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
	public int anInt3776 = 0;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	public int anInt3772 = 2;

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
	public int anInt3778 = -1;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
	public int anInt3779 = 99;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
	public int anInt3782 = -1;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
	public int anInt3786 = -1;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	public int anInt3784 = -1;

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
	public int anInt3783 = 5;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!e;BIIII)Lclient!e;")
	public Class57 method2987(@OriginalArg(0) Class57 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = this.anIntArray239[arg3];
		@Pc(18) int local18 = this.anIntArray241[arg3];
		@Pc(26) Class5_Sub2_Sub6 local26 = this.aClass219_3.method4756(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg0.method6066((byte) 1, arg1, true);
		}
		@Pc(40) Class5_Sub2_Sub6 local40 = null;
		if ((this.aBoolean245 || Static17.aBoolean33) && arg2 != -1 && arg2 < this.anIntArray241.length) {
			@Pc(63) int local63 = this.anIntArray241[arg2];
			local40 = this.aClass219_3.method4756(local63 >> 16);
			arg2 = local63 & 0xFFFF;
		}
		@Pc(77) Class5_Sub2_Sub6 local77 = null;
		@Pc(79) Class5_Sub2_Sub6 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray240 != null) {
			if (arg3 < this.anIntArray240.length) {
				local81 = this.anIntArray240[arg3];
				if (local81 != 65535) {
					local77 = this.aClass219_3.method4756(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean245 || Static17.aBoolean33) && arg2 != -1 && arg2 < this.anIntArray240.length) {
				local83 = this.anIntArray240[arg2];
				if (local83 != 65535) {
					local79 = this.aClass219_3.method4756(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean243) {
			arg1 |= 0x200;
		}
		if (local26.method2002(local30)) {
			arg1 |= 0x80;
		}
		if (local26.method2000(local30)) {
			arg1 |= 0x100;
		}
		if (local26.method1999(local30)) {
			arg1 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method2002(local81)) {
				arg1 |= 0x80;
			}
			if (local77.method2000(local81)) {
				arg1 |= 0x100;
			}
			if (local77.method1999(local81)) {
				arg1 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method2002(arg2)) {
				arg1 |= 0x80;
			}
			if (local40.method2000(arg2)) {
				arg1 |= 0x100;
			}
			if (local40.method1999(arg2)) {
				arg1 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method2002(local83)) {
				arg1 |= 0x80;
			}
			if (local79.method2000(local83)) {
				arg1 |= 0x100;
			}
			if (local79.method1999(local83)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(279) Class57 local279 = arg0.method6066((byte) 1, arg1, true);
		local279.method6059(local40, this.aBoolean243, local26, arg4 - 1, local13, arg2, local30, 0);
		if (local77 != null) {
			local279.method6059(local79, this.aBoolean243, local77, arg4 - 1, local13, local83, local81, 0);
		}
		return local279;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V")
	public void method2989() {
		if (this.anInt3786 == -1) {
			if (this.aBooleanArray13 == null) {
				this.anInt3786 = 0;
			} else {
				this.anInt3786 = 2;
			}
		}
		if (this.anInt3770 != -1) {
			return;
		}
		if (this.aBooleanArray13 == null) {
			this.anInt3770 = 0;
		} else {
			this.anInt3770 = 2;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZILclient!fh;)V")
	private void method2990(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(128) int local128;
		@Pc(228) int local228;
		if (arg0 == 1) {
			local22 = arg1.method5598();
			this.anIntArray239 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray239[local24] = arg1.method5598();
			}
			this.anIntArray241 = new int[local22];
			for (local128 = 0; local128 < local22; local128++) {
				this.anIntArray241[local128] = arg1.method5598();
			}
			for (local228 = 0; local228 < local22; local228++) {
				this.anIntArray241[local228] = (arg1.method5598() << 16) + this.anIntArray241[local228];
			}
		} else if (arg0 == 2) {
			this.anInt3784 = arg1.method5598();
		} else if (arg0 == 3) {
			this.aBooleanArray13 = new boolean[256];
			local22 = arg1.method5539();
			for (local24 = 0; local24 < local22; local24++) {
				this.aBooleanArray13[arg1.method5539()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3783 = arg1.method5539();
		} else if (arg0 == 6) {
			this.anInt3778 = arg1.method5598();
		} else if (arg0 == 7) {
			this.anInt3782 = arg1.method5598();
		} else if (arg0 == 8) {
			this.anInt3779 = arg1.method5539();
		} else if (arg0 == 9) {
			this.anInt3786 = arg1.method5539();
		} else if (arg0 == 10) {
			this.anInt3770 = arg1.method5539();
		} else if (arg0 == 11) {
			this.anInt3772 = arg1.method5539();
		} else if (arg0 == 12) {
			local22 = arg1.method5539();
			this.anIntArray240 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray240[local24] = arg1.method5598();
			}
			for (local128 = 0; local128 < local22; local128++) {
				this.anIntArray240[local128] += arg1.method5598() << 16;
			}
		} else if (arg0 == 13) {
			local22 = arg1.method5598();
			this.anIntArrayArray30 = new int[local22][];
			for (local24 = 0; local24 < local22; local24++) {
				local128 = arg1.method5539();
				if (local128 > 0) {
					this.anIntArrayArray30[local24] = new int[local128];
					this.anIntArrayArray30[local24][0] = arg1.method5541();
					for (local228 = 1; local228 < local128; local228++) {
						this.anIntArrayArray30[local24][local228] = arg1.method5598();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean243 = true;
		} else if (arg0 == 15) {
			this.aBoolean245 = true;
		} else if (arg0 == 16) {
			this.aBoolean244 = true;
		} else if (arg0 == 17) {
			this.anInt3776 = arg1.method5539();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZI)I")
	public int method2992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray241[arg1];
		@Pc(19) Class5_Sub2_Sub6 local19 = null;
		@Pc(27) Class5_Sub2_Sub6 local27 = this.aClass219_3.method4756(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean245 || Static17.aBoolean33) && arg0 != -1 && arg0 < this.anIntArray241.length) {
			local12 = this.anIntArray241[arg0];
			local19 = this.aClass219_3.method4756(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean243) {
			local10 = 512;
		}
		if (local27.method2002(local31)) {
			local10 |= 0x80;
		}
		if (local27.method2000(local31)) {
			local10 |= 0x100;
		}
		if (local27.method1999(local31)) {
			local10 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method2002(local12)) {
				local10 |= 0x80;
			}
			if (local19.method2000(local12)) {
				local10 |= 0x100;
			}
			if (local19.method1999(local12)) {
				local10 |= 0x400;
			}
		}
		if (this.anIntArray240 != null && arg2) {
			@Pc(151) int local151;
			@Pc(164) Class5_Sub2_Sub6 local164;
			if (arg1 < this.anIntArray240.length) {
				local151 = this.anIntArray240[arg1];
				if (local151 != 65535) {
					local164 = this.aClass219_3.method4756(local151 >> 16);
					local151 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method2002(local151)) {
							local10 |= 0x80;
						}
						if (local164.method2000(local151)) {
							local10 |= 0x100;
						}
						if (local164.method1999(local151)) {
							local10 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean245 || Static17.aBoolean33) && arg0 != -1 && this.anIntArray240.length > arg0) {
				local151 = this.anIntArray240[arg0];
				if (local151 != 65535) {
					local164 = this.aClass219_3.method4756(local151 >> 16);
					local151 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method2002(local151)) {
							local10 |= 0x80;
						}
						if (local164.method2000(local151)) {
							local10 |= 0x100;
						}
						if (local164.method1999(local151)) {
							local10 |= 0x400;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIBIILclient!e;I)Lclient!e;")
	public Class57 method2995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray239[arg2];
		@Pc(13) int local13 = this.anIntArray241[arg2];
		@Pc(21) Class5_Sub2_Sub6 local21 = this.aClass219_3.method4756(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method6066(arg3, arg6, true);
		}
		@Pc(35) Class5_Sub2_Sub6 local35 = null;
		if ((this.aBoolean245 || Static17.aBoolean33) && arg0 != -1 && this.anIntArray241.length > arg0) {
			@Pc(58) int local58 = this.anIntArray241[arg0];
			local35 = this.aClass219_3.method4756(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		if (this.aBoolean243) {
			arg6 |= 0x200;
		}
		if (local21.method2002(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method2000(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method1999(local25)) {
			arg6 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method2002(arg0)) {
				arg6 |= 0x80;
			}
			if (local35.method2000(arg0)) {
				arg6 |= 0x100;
			}
			if (local35.method1999(arg0)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(147) Class57 local147 = arg5.method6066(arg3, arg6, true);
		local147.method6059(local35, this.aBoolean243, local21, arg1 - 1, local8, arg0, local25, arg4);
		return local147;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method2996(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method2990(local5, arg0);
		}
	}
}
