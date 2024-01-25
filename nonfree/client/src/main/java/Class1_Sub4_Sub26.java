import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class1_Sub4_Sub26 extends Class1_Sub4 {

	@OriginalMember(owner = "client!oo", name = "B", descriptor = "Z")
	private boolean aBoolean349 = true;

	@OriginalMember(owner = "client!oo", name = "D", descriptor = "Z")
	private boolean aBoolean350 = true;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(29) int[] local29 = this.method5958(this.aBoolean349 ? Static67.anInt1514 - arg0 : arg0, 0);
			if (this.aBoolean350) {
				for (@Pc(34) int local34 = 0; local34 < Static66.anInt1511; local34++) {
					local11[local34] = local29[Static393.anInt6315 - local34];
				}
			} else {
				Static468.method4335(local29, 0, local11, 0, Static66.anInt1511);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[][] local29 = this.method5956(this.aBoolean349 ? Static67.anInt1514 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean350) {
				for (local58 = 0; local58 < Static66.anInt1511; local58++) {
					local45[local58] = local33[Static393.anInt6315 - local58];
					local49[local58] = local37[Static393.anInt6315 - local58];
					local53[local58] = local41[Static393.anInt6315 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static66.anInt1511; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.aBoolean350 = arg1.method5366() == 1;
		} else if (arg0 == 1) {
			this.aBoolean349 = arg1.method5366() == 1;
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method5366() == 1;
		}
	}
}
