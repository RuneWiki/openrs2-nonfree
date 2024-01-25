import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(29) int[] local29 = this.method5876(0, this.aBoolean74 ? Static285.anInt5782 - arg0 : arg0);
			if (this.aBoolean75) {
				for (@Pc(42) int local42 = 0; local42 < Static339.anInt6735; local42++) {
					local11[local42] = local29[Static25.anInt1346 - local42];
				}
			} else {
				Static359.method684(local29, 0, local11, 0, Static339.anInt6735);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.aBoolean75 = arg1.method4421() == 1;
		} else if (arg0 == 1) {
			this.aBoolean74 = arg1.method4421() == 1;
		} else if (arg0 == 2) {
			super.aBoolean597 = arg1.method4421() == 1;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(29) int[][] local29 = this.method5887(this.aBoolean74 ? Static285.anInt5782 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean75) {
				for (local58 = 0; local58 < Static339.anInt6735; local58++) {
					local45[local58] = local33[Static25.anInt1346 - local58];
					local49[local58] = local37[Static25.anInt1346 - local58];
					local53[local58] = local41[Static25.anInt1346 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static339.anInt6735; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}
}
