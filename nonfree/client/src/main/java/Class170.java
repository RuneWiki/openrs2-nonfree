import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class170 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public int anInt4955;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "[I")
	public int[] anIntArray650;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
	private int[] anIntArray651;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "[I")
	public int[] anIntArray652;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Z")
	public boolean aBoolean363 = false;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public int anInt4956 = -1;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	public int anInt4963 = 5;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "Z")
	public boolean aBoolean364 = false;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public int anInt4959 = -1;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
	public int anInt4964 = 99;

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
	public int anInt4967 = -1;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public int anInt4962 = -1;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	public int anInt4965 = -1;

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
	public int anInt4968 = 2;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ap;I)V")
	private void method4318(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(118) int local118;
		@Pc(140) int local140;
		if (arg0 == 1) {
			local26 = arg1.method2764();
			this.anIntArray650 = new int[local26];
			for (local28 = 0; local28 < local26; local28++) {
				this.anIntArray650[local28] = arg1.method2764();
			}
			this.anIntArray652 = new int[local26];
			for (local118 = 0; local118 < local26; local118++) {
				this.anIntArray652[local118] = arg1.method2764();
			}
			for (local140 = 0; local140 < local26; local140++) {
				this.anIntArray652[local140] = (arg1.method2764() << 16) + this.anIntArray652[local140];
			}
		} else if (arg0 == 2) {
			this.anInt4956 = arg1.method2764();
		} else if (arg0 == 3) {
			this.aBooleanArray23 = new boolean[256];
			local26 = arg1.method2772();
			for (local28 = 0; local28 < local26; local28++) {
				this.aBooleanArray23[arg1.method2772()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean366 = true;
		} else if (arg0 == 5) {
			this.anInt4963 = arg1.method2772();
		} else if (arg0 == 6) {
			this.anInt4962 = arg1.method2764();
		} else if (arg0 == 7) {
			this.anInt4967 = arg1.method2764();
		} else if (arg0 == 8) {
			this.anInt4964 = arg1.method2772();
		} else if (arg0 == 9) {
			this.anInt4965 = arg1.method2772();
		} else if (arg0 == 10) {
			this.anInt4959 = arg1.method2772();
		} else if (arg0 == 11) {
			this.anInt4968 = arg1.method2772();
		} else if (arg0 == 12) {
			local26 = arg1.method2772();
			this.anIntArray651 = new int[local26];
			for (local28 = 0; local28 < local26; local28++) {
				this.anIntArray651[local28] = arg1.method2764();
			}
			for (local118 = 0; local118 < local26; local118++) {
				this.anIntArray651[local118] += arg1.method2764() << 16;
			}
		} else if (arg0 == 13) {
			local26 = arg1.method2764();
			this.anIntArrayArray44 = new int[local26][];
			for (local28 = 0; local28 < local26; local28++) {
				local118 = arg1.method2772();
				if (local118 > 0) {
					this.anIntArrayArray44[local28] = new int[local118];
					this.anIntArrayArray44[local28][0] = arg1.method2791();
					for (local140 = 1; local140 < local118; local140++) {
						this.anIntArrayArray44[local28][local140] = arg1.method2764();
					}
				}
			}
			return;
		} else if (arg0 == 14) {
			this.aBoolean365 = true;
			return;
		} else if (arg0 == 15) {
			this.aBoolean364 = true;
			return;
		} else if (arg0 == 16) {
			this.aBoolean363 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZIB)I")
	public int method4319(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray652[arg0];
		@Pc(14) Class7_Sub1_Sub14 local14 = null;
		@Pc(20) Class7_Sub1_Sub14 local20 = Static85.method1807(local12 >> 16);
		@Pc(24) int local24 = local12 & 0xFFFF;
		if (local20 == null) {
			return 0;
		}
		if ((this.aBoolean364 || Static214.aBoolean327) && arg2 != -1 && this.anIntArray652.length > arg2) {
			local7 = this.anIntArray652[arg2];
			local14 = Static85.method1807(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean365) {
			local5 = 512;
		}
		if (local20.method4053(local24)) {
			local5 |= 0x80;
		}
		if (local20.method4058(local24)) {
			local5 |= 0x100;
		}
		if (local14 != null) {
			if (local14.method4053(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4058(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray651 != null && arg1) {
			@Pc(122) int local122;
			@Pc(133) Class7_Sub1_Sub14 local133;
			if (this.anIntArray651.length > arg0) {
				local122 = this.anIntArray651[arg0];
				if (local122 != 65535) {
					local133 = Static85.method1807(local122 >> 16);
					local122 &= 0xFFFF;
					if (local133 != null) {
						if (local133.method4053(local122)) {
							local5 |= 0x80;
						}
						if (local133.method4058(local122)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean364 || Static214.aBoolean327) && arg2 != -1 && this.anIntArray651.length > arg2) {
				local122 = this.anIntArray651[arg2];
				if (local122 != 65535) {
					local133 = Static85.method1807(local122 >> 16);
					local122 &= 0xFFFF;
					if (local133 != null) {
						if (local133.method4053(local122)) {
							local5 |= 0x80;
						}
						if (local133.method4058(local122)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIIIIIILclient!sj;)Lclient!sj;")
	public Class31 method4321(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class31 arg6) {
		@Pc(8) int local8 = this.anIntArray650[arg1];
		@Pc(13) int local13 = this.anIntArray652[arg1];
		@Pc(19) Class7_Sub1_Sub14 local19 = Static85.method1807(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg6.method1917((byte) 1, arg5, true);
		}
		@Pc(33) Class7_Sub1_Sub14 local33 = null;
		if ((this.aBoolean364 || Static214.aBoolean327) && arg2 != -1 && arg2 < this.anIntArray652.length) {
			@Pc(56) int local56 = this.anIntArray652[arg2];
			local33 = Static85.method1807(local56 >> 16);
			arg2 = local56 & 0xFFFF;
		}
		if (this.aBoolean365) {
			arg5 |= 0x200;
		}
		if (local19.method4053(local23)) {
			arg5 |= 0x80;
		}
		if (local19.method4058(local23)) {
			arg5 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method4053(arg2)) {
				arg5 |= 0x80;
			}
			if (local33.method4058(arg2)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(127) Class31 local127 = arg6.method1917(arg0, arg5, true);
		local127.method1931(arg4 - 1, local19, local8, local33, arg2, local23, this.aBoolean365, arg3);
		return local127;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method4323() {
		if (this.anInt4959 == -1) {
			if (this.aBooleanArray23 == null) {
				this.anInt4959 = 0;
			} else {
				this.anInt4959 = 2;
			}
		}
		if (this.anInt4965 != -1) {
			return;
		}
		if (this.aBooleanArray23 == null) {
			this.anInt4965 = 0;
		} else {
			this.anInt4965 = 2;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBILclient!sj;I)Lclient!sj;")
	public Class31 method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray650[arg1];
		@Pc(13) int local13 = this.anIntArray652[arg1];
		@Pc(19) Class7_Sub1_Sub14 local19 = Static85.method1807(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg3.method1917((byte) 1, arg4, true);
		}
		@Pc(33) Class7_Sub1_Sub14 local33 = null;
		if ((this.aBoolean364 || Static214.aBoolean327) && arg2 != -1 && this.anIntArray652.length > arg2) {
			@Pc(56) int local56 = this.anIntArray652[arg2];
			local33 = Static85.method1807(local56 >> 16);
			arg2 = local56 & 0xFFFF;
		}
		@Pc(68) Class7_Sub1_Sub14 local68 = null;
		@Pc(70) Class7_Sub1_Sub14 local70 = null;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		if (this.anIntArray651 != null) {
			if (arg1 < this.anIntArray651.length) {
				local72 = this.anIntArray651[arg1];
				if (local72 != 65535) {
					local68 = Static85.method1807(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
			if ((this.aBoolean364 || Static214.aBoolean327) && arg2 != -1 && this.anIntArray651.length > arg2) {
				local74 = this.anIntArray651[arg2];
				if (local74 != 65535) {
					local70 = Static85.method1807(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean365) {
			arg4 |= 0x200;
		}
		if (local19.method4053(local23)) {
			arg4 |= 0x80;
		}
		if (local19.method4058(local23)) {
			arg4 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method4053(local72)) {
				arg4 |= 0x80;
			}
			if (local68.method4058(local72)) {
				arg4 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method4053(arg2)) {
				arg4 |= 0x80;
			}
			if (local33.method4058(arg2)) {
				arg4 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method4053(local74)) {
				arg4 |= 0x80;
			}
			if (local70.method4058(local74)) {
				arg4 |= 0x100;
			}
		}
		arg4 |= 0x20;
		@Pc(237) Class31 local237 = arg3.method1917((byte) 1, arg4, true);
		local237.method1931(arg0 - 1, local19, local8, local33, arg2, local23, this.aBoolean365, 0);
		if (local68 != null) {
			local237.method1931(arg0 - 1, local68, local8, local70, local74, local72, this.aBoolean365, 0);
		}
		return local237;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ap;I)V")
	public void method4325(@OriginalArg(0) Class7_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2772();
			if (local3 == 0) {
				return;
			}
			this.method4318(local3, arg0);
		}
	}
}
