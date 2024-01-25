import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
	private int anInt4711 = 4096;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(31) int[] local31 = this.method7836(arg0 - 1 & Static98.anInt1743, 0);
			@Pc(37) int[] local37 = this.method7836(arg0, 0);
			@Pc(47) int[] local47 = this.method7836(Static98.anInt1743 & arg0 + 1, 0);
			for (@Pc(49) int local49 = 0; local49 < Static501.anInt8748; local49++) {
				@Pc(63) int local63 = this.anInt4711 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = (local37[Static326.anInt4973 & local49 + 1] - local37[local49 - 1 & Static326.anInt4973]) * this.anInt4711;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local17[local49] = 4096 - local126;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4711 = arg1.method7945();
		}
	}
}
