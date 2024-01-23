import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "R", descriptor = "Z")
	private boolean aBoolean3 = true;

	@OriginalMember(owner = "client!a", name = "X", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean4 = arg0.method2655() == 1;
		} else if (arg1 == 1) {
			this.aBoolean3 = arg0.method2655() == 1;
		} else if (arg1 == 2) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(35) int[] local35 = this.method4746(0, this.aBoolean3 ? Static178.anInt4007 - arg0 : arg0);
			if (this.aBoolean4) {
				for (@Pc(40) int local40 = 0; local40 < Static75.anInt1848; local40++) {
					local17[local40] = local35[Static145.anInt3482 - local40];
				}
			} else {
				Static302.method1374(local35, 0, local17, 0, Static75.anInt1848);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(25) int[][] local25 = this.method4758(0, this.aBoolean3 ? Static178.anInt4007 - arg0 : arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local7[0];
			@Pc(41) int[] local41 = local25[2];
			@Pc(45) int[] local45 = local7[2];
			@Pc(49) int[] local49 = local7[1];
			@Pc(54) int local54;
			if (this.aBoolean4) {
				for (local54 = 0; local54 < Static75.anInt1848; local54++) {
					local37[local54] = local29[Static145.anInt3482 - local54];
					local49[local54] = local33[Static145.anInt3482 - local54];
					local45[local54] = local41[Static145.anInt3482 - local54];
				}
			} else {
				for (local54 = 0; local54 < Static75.anInt1848; local54++) {
					local37[local54] = local29[local54];
					local49[local54] = local33[local54];
					local45[local54] = local41[local54];
				}
			}
		}
		return local7;
	}
}
