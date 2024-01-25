import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class3_Sub4_Sub30 extends Class3_Sub4 {

	@OriginalMember(owner = "client!rv", name = "Q", descriptor = "I")
	private int anInt6392 = 4096;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(31) int[] local31 = this.method5960(0, Static311.anInt5681 & arg0 - 1);
			@Pc(37) int[] local37 = this.method5960(0, arg0);
			@Pc(47) int[] local47 = this.method5960(0, Static311.anInt5681 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static106.anInt2356; local49++) {
				@Pc(63) int local63 = this.anInt6392 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = this.anInt6392 * (local37[local49 + 1 & Static396.anInt6840] - local37[Static396.anInt6840 & local49 - 1]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local17[local49] = 4096 - local128;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6392 = arg1.method6004();
		}
	}
}
