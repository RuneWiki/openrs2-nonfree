import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!br", name = "N", descriptor = "Z")
	private boolean aBoolean60 = true;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(37) int[][] local37 = this.method5818(this.aBoolean61 ? Static19.anInt547 - arg0 : arg0, 0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean60) {
				for (local66 = 0; local66 < Static15.anInt493; local66++) {
					local53[local66] = local41[Static317.anInt6151 - local66];
					local57[local66] = local45[Static317.anInt6151 - local66];
					local61[local66] = local49[Static317.anInt6151 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static15.anInt493; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean60 = arg0.method1832() == 1;
		} else if (arg1 == 1) {
			this.aBoolean61 = arg0.method1832() == 1;
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(35) int[] local35 = this.method5808(0, this.aBoolean61 ? Static19.anInt547 - arg0 : arg0);
			if (this.aBoolean60) {
				for (@Pc(40) int local40 = 0; local40 < Static15.anInt493; local40++) {
					local18[local40] = local35[Static317.anInt6151 - local40];
				}
			} else {
				Static359.method758(local35, 0, local18, 0, Static15.anInt493);
			}
		}
		return local18;
	}
}
