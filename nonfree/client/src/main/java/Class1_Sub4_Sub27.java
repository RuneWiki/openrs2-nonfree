import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub4_Sub27 extends Class1_Sub4 {

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
	private int anInt3844;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	private int anInt3845;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	private int anInt3849;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	private int anInt3850;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	private int anInt3853;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
	private int anInt3859;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	private int anInt3851 = 0;

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
	private int anInt3857 = 0;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
	private int anInt3860 = 0;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3851 = arg0.method1356();
		} else if (arg1 == 1) {
			this.anInt3860 = (arg0.method1363() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3857 = (arg0.method1363() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIII)V")
	private void method3226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 < arg0 ? arg1 : arg0;
		@Pc(27) int local27 = arg1 <= arg0 ? arg0 : arg1;
		@Pc(34) int local34 = local27 >= arg2 ? local27 : arg2;
		@Pc(45) int local45 = arg2 >= local12 ? local12 : arg2;
		@Pc(50) int local50 = local34 - local45;
		if (local50 > 0) {
			@Pc(63) int local63 = (local34 - arg1 << 12) / local50;
			@Pc(72) int local72 = (local34 - arg0 << 12) / local50;
			@Pc(81) int local81 = (local34 - arg2 << 12) / local50;
			if (local34 == arg1) {
				this.anInt3853 = arg0 == local45 ? local81 + 20480 : 4096 - local72;
			} else if (arg0 == local34) {
				this.anInt3853 = local45 == arg2 ? local63 + 4096 : -local81 + 12288;
			} else {
				this.anInt3853 = arg1 == local45 ? local72 + 12288 : -local63 + 20480;
			}
			this.anInt3853 /= 6;
		} else {
			this.anInt3853 = 0;
		}
		this.anInt3859 = (local45 + local34) / 2;
		if (this.anInt3859 > 0 && this.anInt3859 < 4096) {
			this.anInt3849 = (local50 << 12) / (this.anInt3859 > 2048 ? 8192 - (this.anInt3859 * 2) : this.anInt3859 * 2);
		} else {
			this.anInt3849 = 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(IIII)V")
	private void method3227(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = arg1 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : arg1 * (arg2 + 4096) >> 12;
		if (local23 <= 0) {
			this.anInt3850 = this.anInt3845 = this.anInt3844 = arg1;
			return;
		}
		@Pc(44) int local44 = arg0 * 6;
		@Pc(52) int local52 = arg1 + arg1 - local23;
		@Pc(61) int local61 = (local23 - local52 << 12) / local23;
		@Pc(65) int local65 = local44 >> 12;
		@Pc(71) int local71 = local44 - (local65 << 12);
		@Pc(79) int local79 = local23 * local61 >> 12;
		@Pc(85) int local85 = local79 * local71 >> 12;
		@Pc(90) int local90 = local23 - local85;
		@Pc(94) int local94 = local52 + local85;
		if (local65 == 0) {
			this.anInt3844 = local52;
			this.anInt3845 = local94;
			this.anInt3850 = local23;
		} else if (local65 == 1) {
			this.anInt3844 = local52;
			this.anInt3845 = local23;
			this.anInt3850 = local90;
		} else if (local65 == 2) {
			this.anInt3844 = local94;
			this.anInt3845 = local23;
			this.anInt3850 = local52;
		} else if (local65 == 3) {
			this.anInt3845 = local90;
			this.anInt3844 = local23;
			this.anInt3850 = local52;
		} else if (local65 == 4) {
			this.anInt3844 = local23;
			this.anInt3845 = local52;
			this.anInt3850 = local94;
		} else if (local65 == 5) {
			this.anInt3844 = local90;
			this.anInt3845 = local52;
			this.anInt3850 = local23;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(21) int[][] local21 = this.method4749(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[0];
			for (@Pc(47) int local47 = 0; local47 < Static182.anInt3492; local47++) {
				this.method3226(local29[local47], local25[local47], local33[local47]);
				this.anInt3849 += this.anInt3860;
				if (this.anInt3849 < 0) {
					this.anInt3849 = 0;
				}
				if (this.anInt3849 > 4096) {
					this.anInt3849 = 4096;
				}
				this.anInt3859 += this.anInt3857;
				this.anInt3853 += this.anInt3851;
				if (this.anInt3859 < 0) {
					this.anInt3859 = 0;
				}
				if (this.anInt3859 > 4096) {
					this.anInt3859 = 4096;
				}
				while (this.anInt3853 < 0) {
					this.anInt3853 += 4096;
				}
				while (this.anInt3853 > 4096) {
					this.anInt3853 -= 4096;
				}
				this.method3227(this.anInt3853, this.anInt3859, this.anInt3849);
				local45[local47] = this.anInt3850;
				local37[local47] = this.anInt3845;
				local41[local47] = this.anInt3844;
			}
		}
		return local11;
	}
}
