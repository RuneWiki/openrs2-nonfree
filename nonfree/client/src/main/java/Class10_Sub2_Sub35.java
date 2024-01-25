import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class10_Sub2_Sub35 extends Class10_Sub2 {

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "Z")
	private boolean aBoolean483 = true;

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "Z")
	private boolean aBoolean484 = true;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(31) int[][] local31 = this.method6045(0, this.aBoolean484 ? Static140.anInt2877 - arg0 : arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			@Pc(60) int local60;
			if (this.aBoolean483) {
				for (local60 = 0; local60 < Static121.anInt2458; local60++) {
					local47[local60] = local35[Static429.anInt7203 - local60];
					local51[local60] = local39[Static429.anInt7203 - local60];
					local55[local60] = local43[Static429.anInt7203 - local60];
				}
			} else {
				for (local60 = 0; local60 < Static121.anInt2458; local60++) {
					local47[local60] = local35[local60];
					local51[local60] = local39[local60];
					local55[local60] = local43[local60];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean483 = arg1.method2502() == 1;
		} else if (arg0 == 1) {
			this.aBoolean484 = arg1.method2502() == 1;
		} else if (arg0 == 2) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(28) int[] local28 = this.method6041(this.aBoolean484 ? Static140.anInt2877 - arg0 : arg0, 0);
			if (this.aBoolean483) {
				for (@Pc(41) int local41 = 0; local41 < Static121.anInt2458; local41++) {
					local11[local41] = local28[Static429.anInt7203 - local41];
				}
			} else {
				Static468.method4349(local28, 0, local11, 0, Static121.anInt2458);
			}
		}
		return local11;
	}
}
