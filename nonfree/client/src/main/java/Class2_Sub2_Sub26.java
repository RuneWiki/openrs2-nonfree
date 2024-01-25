import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
	private int anInt5875;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
	private int anInt5876;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
	private int anInt5877;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
	private int anInt5886;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
	private int anInt5879 = 0;

	@OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
	private int anInt5888 = 0;

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
	private int anInt5887 = 0;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method5840(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static429.anInt6518; local55++) {
				this.method4740(local41[local55], local33[local55], local37[local55]);
				this.anInt5875 += this.anInt5879;
				this.anInt5886 += this.anInt5888;
				this.anInt5876 += this.anInt5887;
				while (this.anInt5886 < 0) {
					this.anInt5886 += 4096;
				}
				while (this.anInt5886 > 4096) {
					this.anInt5886 -= 4096;
				}
				if (this.anInt5875 < 0) {
					this.anInt5875 = 0;
				}
				if (this.anInt5876 < 0) {
					this.anInt5876 = 0;
				}
				if (this.anInt5875 > 4096) {
					this.anInt5875 = 4096;
				}
				if (this.anInt5876 > 4096) {
					this.anInt5876 = 4096;
				}
				this.method4739(this.anInt5876, this.anInt5886, this.anInt5875);
				local45[local55] = this.anInt5877;
				local49[local55] = this.anInt5881;
				local53[local55] = this.anInt5884;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIII)V")
	private void method4739(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg0 + arg2 - (arg2 * arg0 >> 12);
		if (local28 <= 0) {
			this.anInt5877 = this.anInt5881 = this.anInt5884 = arg0;
			return;
		}
		@Pc(38) int local38 = arg1 * 6;
		@Pc(46) int local46 = arg0 + arg0 - local28;
		@Pc(55) int local55 = (local28 - local46 << 12) / local28;
		@Pc(59) int local59 = local38 >> 12;
		@Pc(66) int local66 = local38 - (local59 << 12);
		@Pc(74) int local74 = local28 * local55 >> 12;
		@Pc(80) int local80 = local74 * local66 >> 12;
		@Pc(85) int local85 = local46 + local80;
		@Pc(90) int local90 = local28 - local80;
		if (local59 == 0) {
			this.anInt5884 = local46;
			this.anInt5877 = local28;
			this.anInt5881 = local85;
			return;
		}
		if (local59 == 1) {
			this.anInt5884 = local46;
			this.anInt5881 = local28;
			this.anInt5877 = local90;
			return;
		}
		if (local59 == 2) {
			this.anInt5877 = local46;
			this.anInt5884 = local85;
			this.anInt5881 = local28;
			return;
		}
		if (local59 == 3) {
			this.anInt5884 = local28;
			this.anInt5877 = local46;
			this.anInt5881 = local90;
			return;
		}
		if (local59 == 4) {
			this.anInt5881 = local46;
			this.anInt5877 = local85;
			this.anInt5884 = local28;
			return;
		}
		if (local59 == 5) {
			this.anInt5884 = local90;
			this.anInt5881 = local46;
			this.anInt5877 = local28;
			return;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBI)V")
	private void method4740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 <= arg2 ? arg2 : arg1;
		@Pc(23) int local23 = local16 >= arg0 ? local16 : arg0;
		@Pc(34) int local34 = arg1 < arg2 ? arg1 : arg2;
		@Pc(45) int local45 = arg0 < local34 ? arg0 : local34;
		this.anInt5876 = (local23 + local45) / 2;
		@Pc(62) int local62 = local23 - local45;
		if (this.anInt5876 > 0 && this.anInt5876 < 4096) {
			this.anInt5875 = (local62 << 12) / (this.anInt5876 > 2048 ? 8192 - (this.anInt5876 * 2) : this.anInt5876 * 2);
		} else {
			this.anInt5875 = 0;
		}
		if (local62 <= 0) {
			this.anInt5886 = 0;
			return;
		}
		@Pc(114) int local114 = (local23 - arg1 << 12) / local62;
		@Pc(123) int local123 = (local23 - arg2 << 12) / local62;
		@Pc(132) int local132 = (local23 - arg0 << 12) / local62;
		if (arg1 == local23) {
			this.anInt5886 = arg2 == local45 ? local132 + 20480 : -local123 + 4096;
		} else if (local23 == arg2) {
			this.anInt5886 = arg0 == local45 ? local114 + 4096 : -local132 + 12288;
		} else {
			this.anInt5886 = arg1 == local45 ? local123 + 12288 : -local114 + 20480;
		}
		this.anInt5886 /= 6;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5888 = arg0.method5458();
		} else if (arg1 == 1) {
			this.anInt5879 = (arg0.method5484() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt5887 = (arg0.method5484() << 12) / 100;
		}
	}
}
