import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class4_Sub6_Sub7 extends Class4_Sub6 {

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	private int anInt1504 = 0;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt1506 = 4096;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1504 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt1506 = arg1.method3401();
		} else if (arg0 == 2) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(31) int[][] local31 = this.method5693(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static31.anInt797; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(67) int local67 = local39[local57];
				@Pc(71) int local71 = local43[local57];
				if (this.anInt1504 > local63) {
					local47[local57] = this.anInt1504;
				} else if (this.anInt1506 >= local63) {
					local47[local57] = local63;
				} else {
					local47[local57] = this.anInt1506;
				}
				if (this.anInt1504 > local67) {
					local51[local57] = this.anInt1504;
				} else if (this.anInt1506 >= local67) {
					local51[local57] = local67;
				} else {
					local51[local57] = this.anInt1506;
				}
				if (local71 < this.anInt1504) {
					local55[local57] = this.anInt1504;
				} else if (this.anInt1506 >= local71) {
					local55[local57] = local71;
				} else {
					local55[local57] = this.anInt1506;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(26) int[] local26 = this.method5702(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static31.anInt797; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt1504) {
					local16[local28] = this.anInt1504;
				} else if (local34 > this.anInt1506) {
					local16[local28] = this.anInt1506;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}
}
