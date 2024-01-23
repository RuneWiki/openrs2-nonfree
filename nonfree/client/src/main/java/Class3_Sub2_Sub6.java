import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cm", name = "db", descriptor = "[I")
	public static int[] anIntArray64 = new int[32];

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!cm", name = "bb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
	public int anInt801 = 4;

	@OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
	public int anInt806 = 0;

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
	public int anInt799 = 4;

	@OriginalMember(owner = "client!cm", name = "X", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
	public int anInt803 = 1638;

	@OriginalMember(owner = "client!cm", name = "cb", descriptor = "I")
	public int anInt811 = 4;

	@OriginalMember(owner = "client!cm", name = "Z", descriptor = "[B")
	private byte[] aByteArray3 = new byte[512];

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray64[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIIIII)I")
	private int method655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 - 4096;
		@Pc(17) int local17 = arg5 >> 12;
		@Pc(21) int local21 = local17 + 1;
		if (local21 >= arg4) {
			local21 = 0;
		}
		@Pc(31) int local31 = arg5 & 0xFFF;
		local17 &= 0xFF;
		@Pc(39) int local39 = local31 - 4096;
		local21 &= 0xFF;
		@Pc(53) int local53 = this.aByteArray3[local17 + arg3] & 0x3;
		@Pc(57) int local57 = Class49.anIntArray133[local31];
		@Pc(76) int local76;
		if (local53 <= 1) {
			local76 = local53 == 0 ? arg1 + local31 : -local31 + arg1;
		} else {
			local76 = local53 == 2 ? local31 - arg1 : -arg1 + -local31;
		}
		local53 = this.aByteArray3[local21 + arg3] & 0x3;
		@Pc(116) int local116;
		if (local53 <= 1) {
			local116 = local53 == 0 ? local39 + arg1 : arg1 - local39;
		} else {
			local116 = local53 == 2 ? local39 - arg1 : -arg1 + -local39;
		}
		@Pc(143) int local143 = (local57 * (local116 - local76) >> 12) + local76;
		local53 = this.aByteArray3[arg0 + local17] & 0x3;
		if (local53 <= 1) {
			local76 = local53 == 0 ? local31 + local9 : local9 + -local31;
		} else {
			local76 = local53 == 2 ? local31 - local9 : -local31 + -local9;
		}
		local53 = this.aByteArray3[arg0 + local21] & 0x3;
		if (local53 > 1) {
			local116 = local53 == 2 ? local39 - local9 : -local9 + -local39;
		} else {
			local116 = local53 == 0 ? local39 + local9 : local9 - local39;
		}
		@Pc(243) int local243 = local76 + ((local116 - local76) * local57 >> 12);
		return local143 + (arg2 * (local243 - local143) >> 12);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[I)V")
	public void method656(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(19) int local19 = Static205.anIntArray450[arg0] * this.anInt811;
		@Pc(125) int local125;
		@Pc(139) int local139;
		@Pc(45) int local45;
		@Pc(30) short local30;
		@Pc(111) int local111;
		@Pc(51) int local51;
		@Pc(65) int local65;
		@Pc(58) int local58;
		@Pc(91) int local91;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(100) int local100;
		@Pc(109) int local109;
		if (this.anInt801 == 1) {
			local30 = this.aShortArray13[0];
			local45 = this.aShortArray12[0] << 12;
			local65 = local45 * this.anInt799 >> 12;
			local58 = local45 * this.anInt811 >> 12;
			local51 = local45 * local19 >> 12;
			local69 = local51 >> 12;
			local51 &= 0xFFF;
			local100 = this.aByteArray3[local69 & 0xFF] & 0xFF;
			local91 = Class49.anIntArray133[local51];
			local77 = local69 + 1;
			if (local77 >= local58) {
				local77 = 0;
			}
			local109 = this.aByteArray3[local77 & 0xFF] & 0xFF;
			if (this.aBoolean69) {
				for (local111 = 0; local111 < Static22.anInt421; local111++) {
					local125 = this.anInt799 * Static185.anIntArray424[local111];
					local139 = this.method655(local109, local51, local91, local100, local65, local45 * local125 >> 12);
					local139 = local139 * local30 >> 12;
					arg1[local111] = (local139 >> 1) + 2048;
				}
			} else {
				for (local111 = 0; local111 < Static22.anInt421; local111++) {
					local125 = this.anInt799 * Static185.anIntArray424[local111];
					local139 = this.method655(local109, local51, local91, local100, local65, local45 * local125 >> 12);
					arg1[local111] = local139 * local30 >> 12;
				}
			}
			return;
		}
		local30 = this.aShortArray13[0];
		if (local30 > 8 || local30 < -8) {
			local45 = this.aShortArray12[0] << 12;
			local51 = local19 * local45 >> 12;
			local58 = local45 * this.anInt811 >> 12;
			local65 = this.anInt799 * local45 >> 12;
			local69 = local51 >> 12;
			@Pc(73) int local73 = local51 & 0xFFF;
			local77 = local69 + 1;
			if (local77 >= local58) {
				local77 = 0;
			}
			local91 = Class49.anIntArray133[local73];
			local100 = this.aByteArray3[local69 & 0xFF] & 0xFF;
			local109 = this.aByteArray3[local77 & 0xFF] & 0xFF;
			for (local111 = 0; local111 < Static22.anInt421; local111++) {
				local125 = this.anInt799 * Static185.anIntArray424[local111];
				local139 = this.method655(local109, local73, local91, local100, local65, local125 * local45 >> 12);
				arg1[local111] = local30 * local139 >> 12;
			}
		}
		for (@Pc(152) int local152 = 1; local152 < this.anInt801; local152++) {
			local30 = this.aShortArray13[local152];
			if (local30 > 8 || local30 < -8) {
				local45 = this.aShortArray12[local152] << 12;
				local58 = this.anInt811 * local45 >> 12;
				local51 = local19 * local45 >> 12;
				local65 = local45 * this.anInt799 >> 12;
				local69 = local51 >> 12;
				local51 &= 0xFFF;
				local100 = this.aByteArray3[local69 & 0xFF] & 0xFF;
				local77 = local69 + 1;
				if (local77 >= local58) {
					local77 = 0;
				}
				local91 = Class49.anIntArray133[local51];
				local109 = this.aByteArray3[local77 & 0xFF] & 0xFF;
				if (this.aBoolean69 && local152 == this.anInt801 - 1) {
					for (local111 = 0; local111 < Static22.anInt421; local111++) {
						local125 = Static185.anIntArray424[local111] * this.anInt799;
						local139 = this.method655(local109, local51, local91, local100, local65, local45 * local125 >> 12);
						local139 = arg1[local111] + (local139 * local30 >> 12);
						arg1[local111] = (local139 >> 1) + 2048;
					}
				} else {
					for (local111 = 0; local111 < Static22.anInt421; local111++) {
						local125 = this.anInt799 * Static185.anIntArray424[local111];
						local139 = this.method655(local109, local51, local91, local100, local65, local45 * local125 >> 12);
						arg1[local111] += local139 * local30 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean69 = arg1.method3915() == 1;
		} else if (arg0 == 1) {
			this.anInt801 = arg1.method3915();
		} else if (arg0 == 2) {
			this.anInt803 = arg1.method3930();
			if (this.anInt803 < 0) {
				this.aShortArray13 = new short[this.anInt801];
				for (@Pc(80) int local80 = 0; local80 < this.anInt801; local80++) {
					this.aShortArray13[local80] = (short) arg1.method3930();
				}
			}
		} else if (arg0 == 3) {
			this.anInt799 = this.anInt811 = arg1.method3915();
		} else if (arg0 == 4) {
			this.anInt806 = arg1.method3915();
		} else if (arg0 == 5) {
			this.anInt799 = arg1.method3915();
		} else if (arg0 == 6) {
			this.anInt811 = arg1.method3915();
		}
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		this.aByteArray3 = Static100.method1605(this.anInt806);
		this.method659();
		for (@Pc(31) int local31 = this.anInt801 - 1; local31 >= 1; local31--) {
			@Pc(39) short local39 = this.aShortArray13[local31];
			if (local39 > 8 || local39 < -8) {
				break;
			}
			this.anInt801--;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	private void method659() {
		@Pc(32) int local32;
		if (this.anInt803 > 0) {
			this.aShortArray12 = new short[this.anInt801];
			this.aShortArray13 = new short[this.anInt801];
			for (local32 = 0; local32 < this.anInt801; local32++) {
				this.aShortArray13[local32] = (short) (Math.pow((double) ((float) this.anInt803 / 4096.0F), (double) local32) * 4096.0D);
				this.aShortArray12[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		} else if (this.aShortArray13 != null && this.anInt801 == this.aShortArray13.length) {
			this.aShortArray12 = new short[this.anInt801];
			for (local32 = 0; local32 < this.anInt801; local32++) {
				this.aShortArray12[local32] = (short) Math.pow(2.0D, (double) local32);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			this.method656(arg0, local16);
		}
		return local16;
	}
}
