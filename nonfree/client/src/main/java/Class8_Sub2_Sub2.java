import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class8_Sub2_Sub2 extends Class8_Sub2 {

	@OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
	private int anInt1127;

	@OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
	private int anInt1128;

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
	private int anInt1130;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "I")
	private int anInt1131;

	@OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
	private int anInt1133;

	@OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
	private int anInt1135;

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
	private int anInt1129 = 0;

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "I")
	private int anInt1125 = 0;

	@OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
	private int anInt1134 = 0;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(29) int[][] local29 = this.method8510(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static538.anInt9297; local55++) {
				this.method1033(local41[local55], local37[local55], local33[local55]);
				this.anInt1130 += this.anInt1125;
				this.anInt1128 += this.anInt1134;
				this.anInt1131 += this.anInt1129;
				while (this.anInt1130 < 0) {
					this.anInt1130 += 4096;
				}
				while (this.anInt1130 > 4096) {
					this.anInt1130 -= 4096;
				}
				if (this.anInt1131 < 0) {
					this.anInt1131 = 0;
				}
				if (this.anInt1131 > 4096) {
					this.anInt1131 = 4096;
				}
				if (this.anInt1128 < 0) {
					this.anInt1128 = 0;
				}
				if (this.anInt1128 > 4096) {
					this.anInt1128 = 4096;
				}
				this.method1034(this.anInt1130, this.anInt1131, this.anInt1128);
				local45[local55] = this.anInt1127;
				local49[local55] = this.anInt1135;
				local53[local55] = this.anInt1133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1125 = arg1.method8568();
		} else if (arg0 == 1) {
			this.anInt1129 = (arg1.method8550() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1134 = (arg1.method8550() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)V")
	private void method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg2 > arg1 ? arg2 : arg1;
		@Pc(31) int local31 = arg0 <= local20 ? local20 : arg0;
		@Pc(42) int local42 = arg1 > arg2 ? arg2 : arg1;
		@Pc(49) int local49 = arg0 >= local42 ? local42 : arg0;
		this.anInt1128 = (local49 + local31) / 2;
		@Pc(62) int local62 = local31 - local49;
		if (this.anInt1128 > 0 && this.anInt1128 < 4096) {
			this.anInt1131 = (local62 << 12) / (this.anInt1128 <= 2048 ? this.anInt1128 * 2 : 8192 - (this.anInt1128 * 2));
		} else {
			this.anInt1131 = 0;
		}
		if (local62 <= 0) {
			this.anInt1130 = 0;
			return;
		}
		@Pc(121) int local121 = (local31 - arg2 << 12) / local62;
		@Pc(130) int local130 = (local31 - arg1 << 12) / local62;
		@Pc(139) int local139 = (local31 - arg0 << 12) / local62;
		if (arg2 == local31) {
			this.anInt1130 = local49 == arg1 ? local139 + 20480 : 4096 - local130;
		} else if (arg1 == local31) {
			this.anInt1130 = arg0 == local49 ? local121 + 4096 : 12288 - local139;
		} else {
			this.anInt1130 = local49 == arg2 ? local130 + 12288 : -local121 + 20480;
		}
		this.anInt1130 /= 6;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIBI)V")
	private void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg2 <= 2048 ? (arg1 + 4096) * arg2 >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local25 <= 0) {
			this.anInt1127 = this.anInt1135 = this.anInt1133 = arg2;
			return;
		}
		@Pc(43) int local43 = arg0 * 6;
		@Pc(50) int local50 = arg2 + arg2 - local25;
		@Pc(59) int local59 = (local25 - local50 << 12) / local25;
		@Pc(63) int local63 = local43 >> 12;
		@Pc(70) int local70 = local43 - (local63 << 12);
		@Pc(78) int local78 = local59 * local25 >> 12;
		@Pc(84) int local84 = local70 * local78 >> 12;
		@Pc(88) int local88 = local84 + local50;
		@Pc(93) int local93 = local25 - local84;
		if (local63 == 0) {
			this.anInt1135 = local88;
			this.anInt1133 = local50;
			this.anInt1127 = local25;
			return;
		}
		if (local63 == 1) {
			this.anInt1133 = local50;
			this.anInt1135 = local25;
			this.anInt1127 = local93;
			return;
		}
		if (local63 == 2) {
			this.anInt1133 = local88;
			this.anInt1135 = local25;
			this.anInt1127 = local50;
			return;
		}
		if (local63 == 3) {
			this.anInt1127 = local50;
			this.anInt1135 = local93;
			this.anInt1133 = local25;
			return;
		}
		if (local63 == 4) {
			this.anInt1127 = local88;
			this.anInt1135 = local50;
			this.anInt1133 = local25;
			return;
		}
		if (local63 == 5) {
			this.anInt1127 = local25;
			this.anInt1133 = local93;
			this.anInt1135 = local50;
			return;
		}
	}
}
