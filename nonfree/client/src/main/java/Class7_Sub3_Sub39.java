import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class7_Sub3_Sub39 extends Class7_Sub3 {

	@OriginalMember(owner = "client!vr", name = "J", descriptor = "I")
	private int anInt7287 = 4096;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(31) int[] local31 = this.method5591(0, arg0 - 1 & Static25.anInt366);
			@Pc(37) int[] local37 = this.method5591(0, arg0);
			@Pc(47) int[] local47 = this.method5591(0, Static25.anInt366 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static58.anInt1052; local49++) {
				@Pc(63) int local63 = (local47[local49] - local31[local49]) * this.anInt7287;
				@Pc(83) int local83 = this.anInt7287 * (local37[local49 + 1 & Static410.anInt6497] - local37[local49 - 1 & Static410.anInt6497]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local117 == 0 ? 0 : 16777216 / local117;
				local17[local49] = 4096 - local125;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt7287 = arg1.method3943();
		}
	}
}
