import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class185 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "[Z")
	public boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!ei;")
	public Class67 aClass67_2;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
	public int anInt4803;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "[[I")
	public int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
	public int[] anIntArray582;

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Z")
	public boolean aBoolean465 = false;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Z")
	public boolean aBoolean467 = false;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "Z")
	public boolean aBoolean466 = false;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
	public int anInt4791 = 99;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
	public int anInt4788 = -1;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	public int anInt4792 = -1;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	public int anInt4801 = -1;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	public int anInt4802 = 2;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Z")
	public boolean aBoolean464 = false;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public int anInt4804 = -1;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	public int anInt4797 = -1;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
	public int anInt4805 = 5;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLclient!re;)V")
	public void method4227(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method4232(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIILclient!ns;I)Lclient!ns;")
	public Class22 method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4) {
		@Pc(8) int local8 = this.anIntArray582[arg1];
		@Pc(13) int local13 = this.anIntArray579[arg1];
		@Pc(21) Class1_Sub6_Sub15 local21 = this.aClass67_2.method1221(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method1598((byte) 1, arg0, true);
		}
		@Pc(35) Class1_Sub6_Sub15 local35 = null;
		if ((this.aBoolean465 || Static261.aBoolean446) && arg3 != -1 && arg3 < this.anIntArray579.length) {
			@Pc(58) int local58 = this.anIntArray579[arg3];
			local35 = this.aClass67_2.method1221(local58 >> 16);
			arg3 = local58 & 0xFFFF;
		}
		@Pc(74) Class1_Sub6_Sub15 local74 = null;
		@Pc(76) Class1_Sub6_Sub15 local76 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray580 != null) {
			if (this.anIntArray580.length > arg1) {
				local78 = this.anIntArray580[arg1];
				if (local78 != 65535) {
					local74 = this.aClass67_2.method1221(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean465 || Static261.aBoolean446) && arg3 != -1 && arg3 < this.anIntArray580.length) {
				local80 = this.anIntArray580[arg3];
				if (local80 != 65535) {
					local76 = this.aClass67_2.method1221(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean466) {
			arg0 |= 0x200;
		}
		if (local21.method5015(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method5014(local25)) {
			arg0 |= 0x100;
		}
		if (local74 != null) {
			if (local74.method5015(local78)) {
				arg0 |= 0x80;
			}
			if (local74.method5014(local78)) {
				arg0 |= 0x100;
			}
		}
		if (local35 != null) {
			if (local35.method5015(arg3)) {
				arg0 |= 0x80;
			}
			if (local35.method5014(arg3)) {
				arg0 |= 0x100;
			}
		}
		if (local76 != null) {
			if (local76.method5015(local80)) {
				arg0 |= 0x80;
			}
			if (local76.method5014(local80)) {
				arg0 |= 0x100;
			}
		}
		arg0 |= 0x20;
		@Pc(257) Class22 local257 = arg4.method1598((byte) 1, arg0, true);
		local257.method1571(local21, 0, local35, arg3, this.aBoolean466, local25, local8, arg2 - 1);
		if (local74 != null) {
			local257.method1571(local74, 0, local76, local80, this.aBoolean466, local78, local8, arg2 - 1);
		}
		return local257;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIBLclient!ns;)Lclient!ns;")
	public Class22 method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) Class22 arg6) {
		@Pc(8) int local8 = this.anIntArray582[arg1];
		@Pc(13) int local13 = this.anIntArray579[arg1];
		@Pc(21) Class1_Sub6_Sub15 local21 = this.aClass67_2.method1221(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method1598(arg5, arg0, true);
		}
		@Pc(35) Class1_Sub6_Sub15 local35 = null;
		if ((this.aBoolean465 || Static261.aBoolean446) && arg2 != -1 && this.anIntArray579.length > arg2) {
			@Pc(58) int local58 = this.anIntArray579[arg2];
			local35 = this.aClass67_2.method1221(local58 >> 16);
			arg2 = local58 & 0xFFFF;
		}
		if (this.aBoolean466) {
			arg0 |= 0x200;
		}
		if (local21.method5015(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method5014(local25)) {
			arg0 |= 0x100;
		}
		if (local35 != null) {
			if (local35.method5015(arg2)) {
				arg0 |= 0x80;
			}
			if (local35.method5014(arg2)) {
				arg0 |= 0x100;
			}
		}
		arg0 |= 0x20;
		@Pc(132) Class22 local132 = arg6.method1598(arg5, arg0, true);
		local132.method1571(local21, arg4, local35, arg2, this.aBoolean466, local25, local8, arg3 - 1);
		return local132;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIIZ)I")
	public int method4231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = this.anIntArray579[arg0];
		@Pc(28) Class1_Sub6_Sub15 local28 = null;
		@Pc(36) Class1_Sub6_Sub15 local36 = this.aClass67_2.method1221(local26 >> 16);
		@Pc(40) int local40 = local26 & 0xFFFF;
		if (local36 == null) {
			return 0;
		}
		if ((this.aBoolean465 || Static261.aBoolean446) && arg1 != -1 && this.anIntArray579.length > arg1) {
			local21 = this.anIntArray579[arg1];
			local28 = this.aClass67_2.method1221(local21 >> 16);
			local21 &= 0xFFFF;
		}
		if (this.aBoolean466) {
			local19 = 512;
		}
		if (local36.method5015(local40)) {
			local19 |= 0x80;
		}
		if (local36.method5014(local40)) {
			local19 |= 0x100;
		}
		if (local28 != null) {
			if (local28.method5015(local21)) {
				local19 |= 0x80;
			}
			if (local28.method5014(local21)) {
				local19 |= 0x100;
			}
		}
		if (this.anIntArray580 != null && arg2) {
			@Pc(135) int local135;
			@Pc(146) Class1_Sub6_Sub15 local146;
			if (this.anIntArray580.length > arg0) {
				local135 = this.anIntArray580[arg0];
				if (local135 != 65535) {
					local146 = this.aClass67_2.method1221(local135 >> 16);
					local135 &= 0xFFFF;
					if (local146 != null) {
						if (local146.method5015(local135)) {
							local19 |= 0x80;
						}
						if (local146.method5014(local135)) {
							local19 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean465 || Static261.aBoolean446) && arg1 != -1 && arg1 < this.anIntArray580.length) {
				local135 = this.anIntArray580[arg1];
				if (local135 != 65535) {
					local146 = this.aClass67_2.method1221(local135 >> 16);
					local135 &= 0xFFFF;
					if (local146 != null) {
						if (local146.method5015(local135)) {
							local19 |= 0x80;
						}
						if (local146.method5014(local135)) {
							local19 |= 0x100;
						}
					}
				}
			}
		}
		return local19 | 0x20;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!re;II)V")
	private void method4232(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(45) int local45;
		@Pc(64) int local64;
		if (arg1 == 1) {
			local16 = arg0.method5177();
			this.anIntArray582 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray582[local22] = arg0.method5177();
			}
			this.anIntArray579 = new int[local16];
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray579[local45] = arg0.method5177();
			}
			for (local64 = 0; local64 < local16; local64++) {
				this.anIntArray579[local64] = (arg0.method5177() << 16) + this.anIntArray579[local64];
			}
		} else if (arg1 == 2) {
			this.anInt4801 = arg0.method5177();
		} else if (arg1 == 3) {
			this.aBooleanArray24 = new boolean[256];
			local16 = arg0.method5174();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray24[arg0.method5174()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean464 = true;
		} else if (arg1 == 5) {
			this.anInt4805 = arg0.method5174();
		} else if (arg1 == 6) {
			this.anInt4788 = arg0.method5177();
		} else if (arg1 == 7) {
			this.anInt4792 = arg0.method5177();
		} else if (arg1 == 8) {
			this.anInt4791 = arg0.method5174();
		} else if (arg1 == 9) {
			this.anInt4797 = arg0.method5174();
		} else if (arg1 == 10) {
			this.anInt4804 = arg0.method5174();
		} else if (arg1 == 11) {
			this.anInt4802 = arg0.method5174();
		} else if (arg1 == 12) {
			local16 = arg0.method5174();
			this.anIntArray580 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray580[local22] = arg0.method5177();
			}
			for (local45 = 0; local45 < local16; local45++) {
				this.anIntArray580[local45] = (arg0.method5177() << 16) + this.anIntArray580[local45];
			}
		} else if (arg1 == 13) {
			local16 = arg0.method5177();
			this.anIntArrayArray54 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local45 = arg0.method5174();
				if (local45 > 0) {
					this.anIntArrayArray54[local22] = new int[local45];
					this.anIntArrayArray54[local22][0] = arg0.method5159();
					for (local64 = 1; local64 < local45; local64++) {
						this.anIntArrayArray54[local22][local64] = arg0.method5177();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean466 = true;
		} else if (arg1 == 15) {
			this.aBoolean465 = true;
		} else if (arg1 == 16) {
			this.aBoolean467 = true;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method4235() {
		if (this.anInt4797 == -1) {
			if (this.aBooleanArray24 == null) {
				this.anInt4797 = 0;
			} else {
				this.anInt4797 = 2;
			}
		}
		if (this.anInt4804 != -1) {
			return;
		}
		if (this.aBooleanArray24 == null) {
			this.anInt4804 = 0;
		} else {
			this.anInt4804 = 2;
		}
	}
}
