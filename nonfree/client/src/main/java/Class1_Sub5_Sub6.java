import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class1_Sub5_Sub6 extends Class1_Sub5 {

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
	public int anInt1688 = 4;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "[B")
	private byte[] aByteArray12 = new byte[512];

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
	public int anInt1696 = 1638;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public int anInt1691 = 0;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
	public int anInt1694 = 4;

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
	public int anInt1698 = 4;

	@OriginalMember(owner = "client!fl", name = "Y", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean119 = arg0.method5720() == 1;
		} else if (arg1 == 1) {
			this.anInt1694 = arg0.method5720();
		} else if (arg1 == 2) {
			this.anInt1696 = arg0.method5691();
			if (this.anInt1696 < 0) {
				this.aShortArray9 = new short[this.anInt1694];
				for (@Pc(78) int local78 = 0; local78 < this.anInt1694; local78++) {
					this.aShortArray9[local78] = (short) arg0.method5691();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt1698 = this.anInt1688 = arg0.method5720();
			return;
		} else if (arg1 == 4) {
			this.anInt1691 = arg0.method5720();
			return;
		} else if (arg1 == 5) {
			this.anInt1698 = arg0.method5720();
			return;
		} else if (arg1 == 6) {
			this.anInt1688 = arg0.method5720();
			return;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			this.method1427(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		this.aByteArray12 = Static218.method4016(this.anInt1691);
		this.method1429();
		for (@Pc(19) int local19 = this.anInt1694 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray9[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt1694--;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)I")
	private int method1426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		if (local13 >= arg1) {
			local13 = 0;
		}
		@Pc(26) int local26 = arg2 & 0xFFF;
		@Pc(30) int local30 = arg5 - 4096;
		@Pc(34) int local34 = local26 - 4096;
		local13 &= 0xFF;
		@Pc(53) int local53 = this.aByteArray12[local17 + arg0] & 0x3;
		@Pc(57) int local57 = Class168_Sub2.anIntArray620[local26];
		@Pc(74) int local74;
		if (local53 <= 1) {
			local74 = local53 == 0 ? arg5 + local26 : -local26 + arg5;
		} else {
			local74 = local53 == 2 ? local26 - arg5 : -local26 + -arg5;
		}
		local53 = this.aByteArray12[arg0 + local13] & 0x3;
		@Pc(117) int local117;
		if (local53 > 1) {
			local117 = local53 == 2 ? local34 - arg5 : -arg5 + -local34;
		} else {
			local117 = local53 == 0 ? arg5 + local34 : -local34 + arg5;
		}
		local53 = this.aByteArray12[local17 + arg4] & 0x3;
		@Pc(155) int local155 = local74 + (local57 * (local117 - local74) >> 12);
		if (local53 > 1) {
			local74 = local53 == 2 ? local26 - local30 : -local26 - local30;
		} else {
			local74 = local53 == 0 ? local26 + local30 : local30 - local26;
		}
		local53 = this.aByteArray12[arg4 + local13] & 0x3;
		if (local53 <= 1) {
			local117 = local53 == 0 ? local30 + local34 : local30 + -local34;
		} else {
			local117 = local53 == 2 ? local34 - local30 : -local30 + -local34;
		}
		@Pc(239) int local239 = (local57 * (local117 - local74) >> 12) + local74;
		return local155 + ((local239 - local155) * arg3 >> 12);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[II)V")
	public void method1427(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static191.anIntArray379[arg1] * this.anInt1688;
		@Pc(118) int local118;
		@Pc(132) int local132;
		@Pc(44) int local44;
		@Pc(29) short local29;
		@Pc(109) int local109;
		@Pc(57) int local57;
		@Pc(51) int local51;
		@Pc(64) int local64;
		@Pc(98) int local98;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(94) int local94;
		@Pc(107) int local107;
		if (this.anInt1694 == 1) {
			local29 = this.aShortArray9[0];
			local44 = this.aShortArray8[0] << 12;
			local57 = local44 * local12 >> 12;
			local51 = this.anInt1698 * local44 >> 12;
			local64 = local44 * this.anInt1688 >> 12;
			local68 = local57 >> 12;
			local72 = local68 + 1;
			@Pc(386) int local386 = local57 & 0xFFF;
			if (local72 >= local64) {
				local72 = 0;
			}
			local107 = this.aByteArray12[local72 & 0xFF] & 0xFF;
			local98 = Class168_Sub2.anIntArray620[local386];
			local94 = this.aByteArray12[local68 & 0xFF] & 0xFF;
			if (this.aBoolean119) {
				for (local109 = 0; local109 < Static75.anInt1566; local109++) {
					local118 = this.anInt1698 * Static49.anIntArray492[local109];
					local132 = this.method1426(local94, local51, local118 * local44 >> 12, local98, local107, local386);
					local132 = local132 * local29 >> 12;
					arg0[local109] = (local132 >> 1) + 2048;
				}
			} else {
				for (local109 = 0; local109 < Static75.anInt1566; local109++) {
					local118 = Static49.anIntArray492[local109] * this.anInt1698;
					local132 = this.method1426(local94, local51, local44 * local118 >> 12, local98, local107, local386);
					arg0[local109] = local132 * local29 >> 12;
				}
			}
			return;
		}
		local29 = this.aShortArray9[0];
		if (local29 > 8 || local29 < -8) {
			local44 = this.aShortArray8[0] << 12;
			local51 = this.anInt1698 * local44 >> 12;
			local57 = local12 * local44 >> 12;
			local64 = local44 * this.anInt1688 >> 12;
			local68 = local57 >> 12;
			local72 = local68 + 1;
			if (local72 >= local64) {
				local72 = 0;
			}
			local57 &= 0xFFF;
			local94 = this.aByteArray12[local68 & 0xFF] & 0xFF;
			local98 = Class168_Sub2.anIntArray620[local57];
			local107 = this.aByteArray12[local72 & 0xFF] & 0xFF;
			for (local109 = 0; local109 < Static75.anInt1566; local109++) {
				local118 = this.anInt1698 * Static49.anIntArray492[local109];
				local132 = this.method1426(local94, local51, local44 * local118 >> 12, local98, local107, local57);
				arg0[local109] = local29 * local132 >> 12;
			}
		}
		for (@Pc(150) int local150 = 1; local150 < this.anInt1694; local150++) {
			local29 = this.aShortArray9[local150];
			if (local29 > 8 || local29 < -8) {
				local44 = this.aShortArray8[local150] << 12;
				local64 = local44 * this.anInt1688 >> 12;
				local57 = local44 * local12 >> 12;
				local51 = this.anInt1698 * local44 >> 12;
				local68 = local57 >> 12;
				local72 = local68 + 1;
				local57 &= 0xFFF;
				if (local72 >= local64) {
					local72 = 0;
				}
				local98 = Class168_Sub2.anIntArray620[local57];
				local107 = this.aByteArray12[local72 & 0xFF] & 0xFF;
				local94 = this.aByteArray12[local68 & 0xFF] & 0xFF;
				if (this.aBoolean119 && local150 == this.anInt1694 - 1) {
					for (local109 = 0; local109 < Static75.anInt1566; local109++) {
						local118 = this.anInt1698 * Static49.anIntArray492[local109];
						local132 = this.method1426(local94, local51, local118 * local44 >> 12, local98, local107, local57);
						local132 = (local29 * local132 >> 12) + arg0[local109];
						arg0[local109] = (local132 >> 1) + 2048;
					}
				} else {
					for (local109 = 0; local109 < Static75.anInt1566; local109++) {
						local118 = Static49.anIntArray492[local109] * this.anInt1698;
						local132 = this.method1426(local94, local51, local44 * local118 >> 12, local98, local107, local57);
						arg0[local109] += local132 * local29 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	private void method1429() {
		@Pc(23) int local23;
		if (this.anInt1696 > 0) {
			this.aShortArray9 = new short[this.anInt1694];
			this.aShortArray8 = new short[this.anInt1694];
			for (local23 = 0; local23 < this.anInt1694; local23++) {
				this.aShortArray9[local23] = (short) (Math.pow((double) ((float) this.anInt1696 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray8[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray9 != null && this.aShortArray9.length == this.anInt1694) {
			this.aShortArray8 = new short[this.anInt1694];
			for (local23 = 0; local23 < this.anInt1694; local23++) {
				this.aShortArray8[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}
}
