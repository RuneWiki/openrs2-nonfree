import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class2_Sub4_Sub19 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
	private int anInt5048 = 4096;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5048 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(33) int[] local33 = this.method8892(arg0 - 1 & Static463.anInt7489, 0);
			@Pc(39) int[] local39 = this.method8892(arg0, 0);
			@Pc(49) int[] local49 = this.method8892(Static463.anInt7489 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static395.anInt6816; local51++) {
				@Pc(64) int local64 = (local49[local51] - local33[local51]) * this.anInt5048;
				@Pc(84) int local84 = this.anInt5048 * (local39[Static104.anInt2340 & local51 + 1] - local39[local51 - 1 & Static104.anInt2340]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local98 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(130) int local130 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local130;
			}
		}
		return local19;
	}
}
