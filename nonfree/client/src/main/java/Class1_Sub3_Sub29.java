import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
	private int anInt7100 = 4096;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(30) int[] local30 = this.method7128(0, arg0 - 1 & Static323.anInt5914);
			@Pc(36) int[] local36 = this.method7128(0, arg0);
			@Pc(48) int[] local48 = this.method7128(0, Static323.anInt5914 & arg0 + 1);
			for (@Pc(50) int local50 = 0; local50 < Static452.anInt7734; local50++) {
				@Pc(63) int local63 = this.anInt7100 * (local48[local50] - local30[local50]);
				@Pc(83) int local83 = (local36[local50 + 1 & Static80.anInt1453] - local36[Static80.anInt1453 & local50 - 1]) * this.anInt7100;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local11[local50] = 4096 - local129;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7100 = arg0.method3967();
		}
	}
}
