import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class6_Sub4_Sub17 extends Class6_Sub4 {

	@OriginalMember(owner = "client!hv", name = "A", descriptor = "Z")
	private boolean aBoolean281 = true;

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "Z")
	private boolean aBoolean282 = true;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(36) int[] local36 = this.method7748(0, this.aBoolean281 ? Static457.anInt7873 - arg0 : arg0);
			if (this.aBoolean282) {
				for (@Pc(41) int local41 = 0; local41 < Static408.anInt7209; local41++) {
					local11[local41] = local36[Static368.anInt6505 - local41];
				}
			} else {
				Static601.method2937(local36, 0, local11, 0, Static408.anInt7209);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.aBoolean282 = arg1.method6069() == 1;
		} else if (arg0 == 1) {
			this.aBoolean281 = arg1.method6069() == 1;
		} else if (arg0 == 2) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(37) int[][] local37 = this.method7747(this.aBoolean281 ? Static457.anInt7873 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean282) {
				for (local66 = 0; local66 < Static408.anInt7209; local66++) {
					local53[local66] = local41[Static368.anInt6505 - local66];
					local57[local66] = local45[Static368.anInt6505 - local66];
					local61[local66] = local49[Static368.anInt6505 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static408.anInt7209; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}
}
