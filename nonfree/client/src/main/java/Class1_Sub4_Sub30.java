import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub4_Sub30 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "Z")
	private boolean aBoolean280 = true;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "Z")
	private boolean aBoolean279 = true;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(29) int[] local29 = this.method4750(this.aBoolean280 ? Static171.anInt3359 - arg0 : arg0, 0);
			if (this.aBoolean279) {
				for (@Pc(42) int local42 = 0; local42 < Static182.anInt3492; local42++) {
					local11[local42] = local29[Static61.anInt1166 - local42];
				}
			} else {
				Static319.method1771(local29, 0, local11, 0, Static182.anInt3492);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(29) int[][] local29 = this.method4749(0, this.aBoolean280 ? Static171.anInt3359 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local29[1];
			@Pc(58) int local58;
			if (this.aBoolean279) {
				for (local58 = 0; local58 < Static182.anInt3492; local58++) {
					local41[local58] = local33[Static61.anInt1166 - local58];
					local49[local58] = local53[Static61.anInt1166 - local58];
					local45[local58] = local37[Static61.anInt1166 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static182.anInt3492; local58++) {
					local41[local58] = local33[local58];
					local49[local58] = local53[local58];
					local45[local58] = local37[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean279 = arg0.method1378() == 1;
		} else if (arg1 == 1) {
			this.aBoolean280 = arg0.method1378() == 1;
		} else if (arg1 == 2) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}
}
