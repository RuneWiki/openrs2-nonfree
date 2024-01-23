import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class4_Sub1_Sub25 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "Z")
	private boolean aBoolean253 = true;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "Z")
	private boolean aBoolean254 = true;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean253 = arg1.method3110() == 1;
		} else if (arg0 == 1) {
			this.aBoolean254 = arg1.method3110() == 1;
		} else if (arg0 == 2) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(35) int[] local35 = this.method4538(0, this.aBoolean254 ? Static19.anInt437 - arg0 : arg0);
			if (this.aBoolean253) {
				for (@Pc(48) int local48 = 0; local48 < Static68.anInt1753; local48++) {
					local17[local48] = local35[Static295.anInt5711 - local48];
				}
			} else {
				Static317.method3197(local35, 0, local17, 0, Static68.anInt1753);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(29) int[][] local29 = this.method4549(0, this.aBoolean254 ? Static19.anInt437 - arg0 : arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[1];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean253) {
				for (local58 = 0; local58 < Static68.anInt1753; local58++) {
					local45[local58] = local33[Static295.anInt5711 - local58];
					local49[local58] = local41[Static295.anInt5711 - local58];
					local53[local58] = local37[Static295.anInt5711 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static68.anInt1753; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local41[local58];
					local53[local58] = local37[local58];
				}
			}
		}
		return local11;
	}
}
