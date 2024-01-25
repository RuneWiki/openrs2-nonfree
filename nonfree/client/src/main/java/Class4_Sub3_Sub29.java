import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class4_Sub3_Sub29 extends Class4_Sub3 {

	@OriginalMember(owner = "client!pq", name = "H", descriptor = "Z")
	private boolean aBoolean424 = true;

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "Z")
	private boolean aBoolean425 = true;

	static {
		new Class21("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.aBoolean425 = arg1.method4614() == 1;
		} else if (arg0 == 1) {
			this.aBoolean424 = arg1.method4614() == 1;
		} else if (arg0 == 2) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(29) int[][] local29 = this.method6331(this.aBoolean424 ? Static429.anInt7355 - arg0 : arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			@Pc(58) int local58;
			if (this.aBoolean425) {
				for (local58 = 0; local58 < Static304.anInt5637; local58++) {
					local45[local58] = local33[Static279.anInt5254 - local58];
					local49[local58] = local37[Static279.anInt5254 - local58];
					local53[local58] = local41[Static279.anInt5254 - local58];
				}
			} else {
				for (local58 = 0; local58 < Static304.anInt5637; local58++) {
					local45[local58] = local33[local58];
					local49[local58] = local37[local58];
					local53[local58] = local41[local58];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(29) int[] local29 = this.method6337(0, this.aBoolean424 ? Static429.anInt7355 - arg0 : arg0);
			if (this.aBoolean425) {
				for (@Pc(34) int local34 = 0; local34 < Static304.anInt5637; local34++) {
					local11[local34] = local29[Static279.anInt5254 - local34];
				}
			} else {
				Static474.method3333(local29, 0, local11, 0, Static304.anInt5637);
			}
		}
		return local11;
	}
}
