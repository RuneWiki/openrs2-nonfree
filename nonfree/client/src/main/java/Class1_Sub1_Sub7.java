import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
	private int anInt1018;

	@OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!dj", name = "nb", descriptor = "I")
	private int anInt1024;

	@OriginalMember(owner = "client!dj", name = "ob", descriptor = "I")
	private int anInt1025;

	@OriginalMember(owner = "client!dj", name = "rb", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!dj", name = "sb", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
	private int anInt1015 = 0;

	@OriginalMember(owner = "client!dj", name = "pb", descriptor = "I")
	private int anInt1026 = 0;

	@OriginalMember(owner = "client!dj", name = "tb", descriptor = "I")
	private int anInt1030 = 0;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBI)V")
	private void method757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg1 <= 2048 ? arg1 * (arg2 + 4096) >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local31 <= 0) {
			this.anInt1024 = this.anInt1018 = this.anInt1025 = arg1;
			return;
		}
		@Pc(40) int local40 = arg0 * 6;
		@Pc(46) int local46 = arg1 + arg1 - local31;
		@Pc(55) int local55 = (local31 - local46 << 12) / local31;
		@Pc(59) int local59 = local40 >> 12;
		@Pc(65) int local65 = local40 - (local59 << 12);
		@Pc(73) int local73 = local31 * local55 >> 12;
		@Pc(79) int local79 = local73 * local65 >> 12;
		@Pc(84) int local84 = local46 + local79;
		@Pc(89) int local89 = local31 - local79;
		if (local59 == 0) {
			this.anInt1018 = local84;
			this.anInt1025 = local46;
			this.anInt1024 = local31;
			return;
		}
		if (local59 == 1) {
			this.anInt1018 = local31;
			this.anInt1025 = local46;
			this.anInt1024 = local89;
			return;
		}
		if (local59 == 2) {
			this.anInt1024 = local46;
			this.anInt1018 = local31;
			this.anInt1025 = local84;
			return;
		}
		if (local59 == 3) {
			this.anInt1018 = local89;
			this.anInt1024 = local46;
			this.anInt1025 = local31;
			return;
		}
		if (local59 == 4) {
			this.anInt1018 = local46;
			this.anInt1024 = local84;
			this.anInt1025 = local31;
			return;
		}
		if (local59 == 5) {
			this.anInt1018 = local46;
			this.anInt1024 = local31;
			this.anInt1025 = local89;
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(30) int[][] local30 = this.method3737(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static157.anInt3431; local56++) {
				this.method759(local38[local56], local34[local56], local42[local56]);
				this.anInt1021 += this.anInt1030;
				this.anInt1028 += this.anInt1026;
				while (this.anInt1021 < 0) {
					this.anInt1021 += 4096;
				}
				while (this.anInt1021 > 4096) {
					this.anInt1021 -= 4096;
				}
				this.anInt1029 += this.anInt1015;
				if (this.anInt1028 < 0) {
					this.anInt1028 = 0;
				}
				if (this.anInt1029 < 0) {
					this.anInt1029 = 0;
				}
				if (this.anInt1028 > 4096) {
					this.anInt1028 = 4096;
				}
				if (this.anInt1029 > 4096) {
					this.anInt1029 = 4096;
				}
				this.method757(this.anInt1021, this.anInt1029, this.anInt1028);
				local46[local56] = this.anInt1024;
				local50[local56] = this.anInt1018;
				local54[local56] = this.anInt1025;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1030 = arg0.method3817();
		} else if (arg1 == 1) {
			this.anInt1026 = (arg0.method3802() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1015 = (arg0.method3802() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
	private void method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg1 >= arg0 ? arg0 : arg1;
		@Pc(27) int local27 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(34) int local34 = arg2 <= local27 ? local27 : arg2;
		@Pc(41) int local41 = local16 > arg2 ? arg2 : local16;
		@Pc(45) int local45 = local34 - local41;
		if (local45 <= 0) {
			this.anInt1021 = 0;
		} else {
			@Pc(64) int local64 = (local34 - arg0 << 12) / local45;
			@Pc(73) int local73 = (local34 - arg2 << 12) / local45;
			@Pc(82) int local82 = (local34 - arg1 << 12) / local45;
			if (arg1 == local34) {
				this.anInt1021 = arg0 == local41 ? local73 + 20480 : -local64 + 4096;
			} else if (local34 == arg0) {
				this.anInt1021 = arg2 == local41 ? local82 + 4096 : 12288 - local73;
			} else {
				this.anInt1021 = local41 == arg1 ? local64 + 12288 : -local82 + 20480;
			}
			this.anInt1021 /= 6;
		}
		this.anInt1029 = (local34 + local41) / 2;
		if (this.anInt1029 > 0 && this.anInt1029 < 4096) {
			this.anInt1028 = (local45 << 12) / (this.anInt1029 > 2048 ? 8192 - (this.anInt1029 * 2) : this.anInt1029 * 2);
		} else {
			this.anInt1028 = 0;
		}
	}
}
