import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nn", name = "R", descriptor = "Z")
	private boolean aBoolean252 = true;

	@OriginalMember(owner = "client!nn", name = "V", descriptor = "Z")
	private boolean aBoolean253 = true;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean253 = arg0.method3122() == 1;
		} else if (arg1 == 1) {
			this.aBoolean252 = arg0.method3122() == 1;
		} else if (arg1 == 2) {
			this.aBoolean434 = arg0.method3122() == 1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(36) int[] local36 = this.method4450(0, this.aBoolean252 ? Static9.anInt244 - arg0 : arg0);
			if (this.aBoolean253) {
				for (@Pc(41) int local41 = 0; local41 < Static131.anInt2513; local41++) {
					local13[local41] = local36[Static11.anInt321 - local41];
				}
			} else {
				Static300.method491(local36, 0, local13, 0, Static131.anInt2513);
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(14) int[][] local14 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(37) int[][] local37 = this.method4457(0, this.aBoolean252 ? Static9.anInt244 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[2];
			@Pc(49) int[] local49 = local14[0];
			@Pc(53) int[] local53 = local37[1];
			@Pc(57) int[] local57 = local14[1];
			@Pc(61) int[] local61 = local14[2];
			@Pc(66) int local66;
			if (this.aBoolean253) {
				for (local66 = 0; local66 < Static131.anInt2513; local66++) {
					local49[local66] = local41[Static11.anInt321 - local66];
					local57[local66] = local53[Static11.anInt321 - local66];
					local61[local66] = local45[Static11.anInt321 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static131.anInt2513; local66++) {
					local49[local66] = local41[local66];
					local57[local66] = local53[local66];
					local61[local66] = local45[local66];
				}
			}
		}
		return local14;
	}
}
