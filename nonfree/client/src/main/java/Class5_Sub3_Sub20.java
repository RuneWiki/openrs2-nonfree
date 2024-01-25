import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class5_Sub3_Sub20 extends Class5_Sub3 {

	@OriginalMember(owner = "client!l", name = "L", descriptor = "[I")
	public static final int[] anIntArray320 = new int[4096];

	@OriginalMember(owner = "client!l", name = "J", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "Z")
	private boolean aBoolean355 = true;

	static {
		for (@Pc(61) int local61 = 0; local61 < 4096; local61++) {
			anIntArray320[local61] = Static115.method1733(local61);
		}
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(31) int[][] local31 = this.method9207(this.aBoolean354 ? Static652.anInt10663 - arg0 : arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(60) int local60;
			if (this.aBoolean355) {
				for (local60 = 0; local60 < Static7.anInt102; local60++) {
					local47[local60] = local35[Static517.anInt8205 - local60];
					local51[local60] = local39[Static517.anInt8205 - local60];
					local55[local60] = local43[Static517.anInt8205 - local60];
				}
			} else {
				for (local60 = 0; local60 < Static7.anInt102; local60++) {
					local47[local60] = local35[local60];
					local51[local60] = local39[local60];
					local55[local60] = local43[local60];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(42) int[] local42 = this.method9205(this.aBoolean354 ? Static652.anInt10663 - arg0 : arg0, 0);
			if (this.aBoolean355) {
				for (@Pc(57) int local57 = 0; local57 < Static7.anInt102; local57++) {
					local19[local57] = local42[Static517.anInt8205 - local57];
				}
			} else {
				Static693.method8323(local42, 0, local19, 0, Static7.anInt102);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean355 = arg0.method7291() == 1;
		} else if (arg1 == 1) {
			this.aBoolean354 = arg0.method7291() == 1;
		} else if (arg1 == 2) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}
}
