import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
	private int anInt1129;

	@OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
	private int anInt1136;

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
	private int anInt1137;

	@OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!bt", name = "R", descriptor = "I")
	private int anInt1143;

	@OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
	private int anInt1146;

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
	private int anInt1134 = 0;

	@OriginalMember(owner = "client!bt", name = "S", descriptor = "I")
	private int anInt1144 = 0;

	@OriginalMember(owner = "client!bt", name = "T", descriptor = "I")
	private int anInt1145 = 0;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(21) int[][] local21 = this.method9167(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static62.anInt1251; local47++) {
				this.method1206(local33[local47], local25[local47], local29[local47]);
				this.anInt1129 += this.anInt1145;
				this.anInt1146 += this.anInt1144;
				this.anInt1143 += this.anInt1134;
				while (this.anInt1129 < 0) {
					this.anInt1129 += 4096;
				}
				if (this.anInt1146 < 0) {
					this.anInt1146 = 0;
				}
				while (this.anInt1129 > 4096) {
					this.anInt1129 -= 4096;
				}
				if (this.anInt1143 < 0) {
					this.anInt1143 = 0;
				}
				if (this.anInt1146 > 4096) {
					this.anInt1146 = 4096;
				}
				if (this.anInt1143 > 4096) {
					this.anInt1143 = 4096;
				}
				this.method1203(this.anInt1129, this.anInt1146, this.anInt1143);
				local37[local47] = this.anInt1136;
				local41[local47] = this.anInt1138;
				local45[local47] = this.anInt1137;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIBI)V")
	private void method1203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg2 <= 2048 ? arg2 * (arg1 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local32 <= 0) {
			this.anInt1136 = this.anInt1138 = this.anInt1137 = arg2;
			return;
		}
		@Pc(41) int local41 = arg0 * 6;
		@Pc(48) int local48 = arg2 + arg2 - local32;
		@Pc(57) int local57 = (local32 - local48 << 12) / local32;
		@Pc(61) int local61 = local41 >> 12;
		@Pc(68) int local68 = local41 - (local61 << 12);
		@Pc(76) int local76 = local57 * local32 >> 12;
		@Pc(82) int local82 = local76 * local68 >> 12;
		@Pc(86) int local86 = local82 + local48;
		@Pc(90) int local90 = local32 - local82;
		if (local61 == 0) {
			this.anInt1137 = local48;
			this.anInt1138 = local86;
			this.anInt1136 = local32;
			return;
		}
		if (local61 == 1) {
			this.anInt1138 = local32;
			this.anInt1136 = local90;
			this.anInt1137 = local48;
			return;
		}
		if (local61 == 2) {
			this.anInt1136 = local48;
			this.anInt1137 = local86;
			this.anInt1138 = local32;
			return;
		}
		if (local61 == 3) {
			this.anInt1138 = local90;
			this.anInt1137 = local32;
			this.anInt1136 = local48;
			return;
		}
		if (local61 == 4) {
			this.anInt1137 = local32;
			this.anInt1138 = local48;
			this.anInt1136 = local86;
			return;
		}
		if (local61 == 5) {
			this.anInt1137 = local90;
			this.anInt1138 = local48;
			this.anInt1136 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1145 = arg0.method8589();
		} else if (arg1 == 1) {
			this.anInt1144 = (arg0.method8621() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1134 = (arg0.method8621() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIZ)V")
	private void method1206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg2 >= arg1 ? arg2 : arg1;
		@Pc(32) int local32 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(39) int local39 = arg0 > local16 ? arg0 : local16;
		@Pc(50) int local50 = local32 > arg0 ? arg0 : local32;
		@Pc(55) int local55 = local39 - local50;
		this.anInt1143 = (local50 + local39) / 2;
		if (local55 <= 0) {
			this.anInt1129 = 0;
		} else {
			@Pc(80) int local80 = (local39 - arg1 << 12) / local55;
			@Pc(88) int local88 = (local39 - arg2 << 12) / local55;
			@Pc(96) int local96 = (local39 - arg0 << 12) / local55;
			if (local39 == arg1) {
				this.anInt1129 = local50 == arg2 ? local96 + 20480 : 4096 - local88;
			} else if (arg2 == local39) {
				this.anInt1129 = arg0 == local50 ? local80 + 4096 : -local96 + 12288;
			} else {
				this.anInt1129 = local50 == arg1 ? local88 + 12288 : -local80 + 20480;
			}
			this.anInt1129 /= 6;
		}
		if (this.anInt1143 > 0 && this.anInt1143 < 4096) {
			this.anInt1146 = (local55 << 12) / (this.anInt1143 <= 2048 ? this.anInt1143 * 2 : 8192 - (this.anInt1143 * 2));
		} else {
			this.anInt1146 = 0;
		}
	}
}
