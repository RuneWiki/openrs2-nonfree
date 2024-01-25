import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class8_Sub2_Sub17 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	private int anInt5054 = 4096;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "Z")
	private boolean aBoolean376 = true;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5054 = arg1.method8578();
		} else if (arg0 == 1) {
			this.aBoolean376 = arg1.method8525() == 1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(33) int[] local33 = this.method8505(Static17.anInt866 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method8505(arg0, 0);
			@Pc(49) int[] local49 = this.method8505(arg0 + 1 & Static17.anInt866, 0);
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			for (@Pc(63) int local63 = 0; local63 < Static538.anInt9297; local63++) {
				@Pc(76) int local76 = this.anInt5054 * (local49[local63] - local33[local63]);
				@Pc(95) int local95 = this.anInt5054 * (local39[local63 + 1 & Static263.anInt5634] - local39[Static263.anInt5634 & local63 - 1]);
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local76 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(130) int local130 = (int) (Math.sqrt((double) ((float) (local109 + local115 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(136) int local136;
				@Pc(134) int local134;
				if (local130 == 0) {
					local134 = 0;
					local136 = 0;
					local138 = 0;
				} else {
					local136 = local76 / local130;
					local138 = local95 / local130;
					local134 = 16777216 / local130;
				}
				if (this.aBoolean376) {
					local138 = (local138 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local53[local63] = local138;
				local57[local63] = local136;
				local61[local63] = local134;
			}
		}
		return local19;
	}
}
