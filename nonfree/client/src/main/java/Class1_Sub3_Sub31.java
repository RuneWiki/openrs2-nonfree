import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!uaa", name = "C", descriptor = "I")
	private int anInt8167 = 4096;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(31) int[] local31 = this.method7911(arg0 - 1 & Static226.anInt4534, 0);
			@Pc(37) int[] local37 = this.method7911(arg0, 0);
			@Pc(47) int[] local47 = this.method7911(arg0 + 1 & Static226.anInt4534, 0);
			for (@Pc(49) int local49 = 0; local49 < Static236.anInt4609; local49++) {
				@Pc(63) int local63 = this.anInt8167 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = this.anInt8167 * (local37[Static36.anInt1319 & local49 + 1] - local37[Static36.anInt1319 & local49 - 1]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local117 == 0 ? 0 : 16777216 / local117;
				local11[local49] = 4096 - local125;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8167 = arg0.method3056();
		}
	}
}
