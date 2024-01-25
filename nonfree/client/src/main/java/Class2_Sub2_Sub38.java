import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class2_Sub2_Sub38 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
	public int anInt7380 = 0;

	@OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
	public int anInt7383 = 1638;

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
	public int anInt7385 = 4;

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
	public int anInt7386 = 4;

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
	public int anInt7379 = 4;

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "[B")
	private byte[] aByteArray135 = new byte[512];

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "Z")
	public boolean aBoolean485 = true;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB[I)V")
	public void method5815(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static318.anIntArray565[arg0] * this.anInt7385;
		@Pc(111) int local111;
		@Pc(125) int local125;
		@Pc(33) int local33;
		@Pc(38) short local38;
		@Pc(102) int local102;
		@Pc(58) int local58;
		@Pc(52) int local52;
		@Pc(45) int local45;
		@Pc(79) int local79;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(88) int local88;
		@Pc(97) int local97;
		if (this.anInt7386 == 1) {
			local33 = this.aShortArray113[0] << 12;
			local38 = this.aShortArray114[0];
			local45 = this.anInt7385 * local33 >> 12;
			local52 = local33 * this.anInt7379 >> 12;
			local58 = local33 * local12 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			local58 &= 0xFFF;
			if (local45 <= local66) {
				local66 = 0;
			}
			local79 = Class2_Sub5_Sub14.anIntArray496[local58];
			local88 = this.aByteArray135[local62 & 0xFF] & 0xFF;
			local97 = this.aByteArray135[local66 & 0xFF] & 0xFF;
			if (this.aBoolean485) {
				for (local102 = 0; local102 < Static429.anInt6518; local102++) {
					local111 = Static365.anIntArray535[local102] * this.anInt7379;
					local125 = this.method5818(local58, local79, local97, local111 * local33 >> 12, local88, local52);
					local125 = local125 * local38 >> 12;
					arg1[local102] = (local125 >> 1) + 2048;
				}
			} else {
				for (local102 = 0; local102 < Static429.anInt6518; local102++) {
					local111 = Static365.anIntArray535[local102] * this.anInt7379;
					local125 = this.method5818(local58, local79, local97, local33 * local111 >> 12, local88, local52);
					arg1[local102] = local125 * local38 >> 12;
				}
			}
			return;
		}
		local38 = this.aShortArray114[0];
		if (local38 > 8 || local38 < -8) {
			local33 = this.aShortArray113[0] << 12;
			local58 = local12 * local33 >> 12;
			local45 = local33 * this.anInt7385 >> 12;
			local52 = this.anInt7379 * local33 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			@Pc(232) int local232 = local58 & 0xFFF;
			if (local66 >= local45) {
				local66 = 0;
			}
			local79 = Class2_Sub5_Sub14.anIntArray496[local232];
			local97 = this.aByteArray135[local66 & 0xFF] & 0xFF;
			local88 = this.aByteArray135[local62 & 0xFF] & 0xFF;
			for (local102 = 0; local102 < Static429.anInt6518; local102++) {
				local111 = Static365.anIntArray535[local102] * this.anInt7379;
				local125 = this.method5818(local232, local79, local97, local111 * local33 >> 12, local88, local52);
				arg1[local102] = local125 * local38 >> 12;
			}
		}
		for (@Pc(302) int local302 = 1; local302 < this.anInt7386; local302++) {
			local38 = this.aShortArray114[local302];
			if (local38 > 8 || local38 < -8) {
				local33 = this.aShortArray113[local302] << 12;
				local58 = local12 * local33 >> 12;
				local52 = local33 * this.anInt7379 >> 12;
				local45 = this.anInt7385 * local33 >> 12;
				local62 = local58 >> 12;
				local66 = local62 + 1;
				if (local45 <= local66) {
					local66 = 0;
				}
				local58 &= 0xFFF;
				local79 = Class2_Sub5_Sub14.anIntArray496[local58];
				local97 = this.aByteArray135[local66 & 0xFF] & 0xFF;
				local88 = this.aByteArray135[local62 & 0xFF] & 0xFF;
				if (this.aBoolean485 && this.anInt7386 - 1 == local302) {
					for (local102 = 0; local102 < Static429.anInt6518; local102++) {
						local111 = Static365.anIntArray535[local102] * this.anInt7379;
						local125 = this.method5818(local58, local79, local97, local33 * local111 >> 12, local88, local52);
						local125 = (local125 * local38 >> 12) + arg1[local102];
						arg1[local102] = (local125 >> 1) + 2048;
					}
				} else {
					for (local102 = 0; local102 < Static429.anInt6518; local102++) {
						local111 = this.anInt7379 * Static365.anIntArray535[local102];
						local125 = this.method5818(local58, local79, local97, local33 * local111 >> 12, local88, local52);
						arg1[local102] += local38 * local125 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			this.method5815(arg0, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean485 = arg0.method5495() == 1;
		} else if (arg1 == 1) {
			this.anInt7386 = arg0.method5495();
		} else if (arg1 == 2) {
			this.anInt7383 = arg0.method5458();
			if (this.anInt7383 < 0) {
				this.aShortArray114 = new short[this.anInt7386];
				for (@Pc(66) int local66 = 0; local66 < this.anInt7386; local66++) {
					this.aShortArray114[local66] = (short) arg0.method5458();
				}
			}
		} else if (arg1 == 3) {
			this.anInt7379 = this.anInt7385 = arg0.method5495();
		} else if (arg1 == 4) {
			this.anInt7380 = arg0.method5495();
		} else if (arg1 == 5) {
			this.anInt7379 = arg0.method5495();
		} else if (arg1 == 6) {
			this.anInt7385 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)V")
	private void method5817() {
		@Pc(21) int local21;
		if (this.anInt7383 > 0) {
			this.aShortArray113 = new short[this.anInt7386];
			this.aShortArray114 = new short[this.anInt7386];
			for (local21 = 0; local21 < this.anInt7386; local21++) {
				this.aShortArray114[local21] = (short) (Math.pow((double) ((float) this.anInt7383 / 4096.0F), (double) local21) * 4096.0D);
				this.aShortArray113[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		} else if (this.aShortArray114 != null && this.aShortArray114.length == this.anInt7386) {
			this.aShortArray113 = new short[this.anInt7386];
			for (local21 = 0; local21 < this.anInt7386; local21++) {
				this.aShortArray113[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		this.aByteArray135 = Static390.method5183(this.anInt7380);
		this.method5817();
		for (@Pc(25) int local25 = this.anInt7386 - 1; local25 >= 1; local25--) {
			@Pc(32) short local32 = this.aShortArray114[local25];
			if (local32 > 8 || local32 < -8) {
				return;
			}
			this.anInt7386--;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIZ)I")
	private int method5818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17 = arg3 >> 12;
		@Pc(21) int local21 = local17 + 1;
		@Pc(25) int local25 = arg3 & 0xFFF;
		if (local21 >= arg5) {
			local21 = 0;
		}
		local17 &= 0xFF;
		@Pc(42) int local42 = local25 - 4096;
		local21 &= 0xFF;
		@Pc(50) int local50 = arg0 - 4096;
		@Pc(59) int local59 = this.aByteArray135[arg4 + local17] & 0x3;
		@Pc(63) int local63 = Class2_Sub5_Sub14.anIntArray496[local25];
		@Pc(79) int local79;
		if (local59 > 1) {
			local79 = local59 == 2 ? local25 - arg0 : -arg0 + -local25;
		} else {
			local79 = local59 == 0 ? arg0 + local25 : arg0 + -local25;
		}
		local59 = this.aByteArray135[arg4 + local21] & 0x3;
		@Pc(121) int local121;
		if (local59 > 1) {
			local121 = local59 == 2 ? local42 - arg0 : -local42 - arg0;
		} else {
			local121 = local59 == 0 ? local42 + arg0 : -local42 + arg0;
		}
		@Pc(148) int local148 = (local63 * (local121 - local79) >> 12) + local79;
		local59 = this.aByteArray135[local17 + arg2] & 0x3;
		if (local59 > 1) {
			local79 = local59 == 2 ? local25 - local50 : -local50 + -local25;
		} else {
			local79 = local59 == 0 ? local25 + local50 : local50 - local25;
		}
		local59 = this.aByteArray135[local21 + arg2] & 0x3;
		if (local59 > 1) {
			local121 = local59 == 2 ? local42 - local50 : -local50 + -local42;
		} else {
			local121 = local59 == 0 ? local42 + local50 : local50 + -local42;
		}
		@Pc(243) int local243 = (local63 * (local121 - local79) >> 12) + local79;
		return ((local243 - local148) * arg1 >> 12) + local148;
	}
}
