import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	private int anInt931 = 4096;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
	private int anInt929 = 0;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(31) int[][] local31 = this.method5528(arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static153.anInt3378; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(67) int local67 = local39[local57];
				@Pc(71) int local71 = local43[local57];
				if (this.anInt929 > local63) {
					local47[local57] = this.anInt929;
				} else if (this.anInt931 < local63) {
					local47[local57] = this.anInt931;
				} else {
					local47[local57] = local63;
				}
				if (local67 < this.anInt929) {
					local51[local57] = this.anInt929;
				} else if (local67 > this.anInt931) {
					local51[local57] = this.anInt931;
				} else {
					local51[local57] = local67;
				}
				if (this.anInt929 > local71) {
					local55[local57] = this.anInt929;
				} else if (this.anInt931 < local71) {
					local55[local57] = this.anInt931;
				} else {
					local55[local57] = local71;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3378; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt929) {
					local19[local31] = this.anInt929;
				} else if (this.anInt931 < local37) {
					local19[local31] = this.anInt931;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt929 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt931 = arg1.method4556();
		} else if (arg0 == 2) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}
}
