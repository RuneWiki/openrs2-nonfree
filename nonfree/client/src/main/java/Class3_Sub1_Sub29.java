import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
	private int anInt6959 = 4096;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(25) int[] local25 = this.method7765(0, arg0 - 1 & Static469.anInt7679);
			@Pc(31) int[] local31 = this.method7765(0, arg0);
			@Pc(43) int[] local43 = this.method7765(0, arg0 + 1 & Static469.anInt7679);
			for (@Pc(45) int local45 = 0; local45 < Static206.anInt4182; local45++) {
				@Pc(59) int local59 = this.anInt6959 * (local43[local45] - local25[local45]);
				@Pc(79) int local79 = this.anInt6959 * (local31[Static439.anInt7283 & local45 + 1] - local31[local45 - 1 & Static439.anInt7283]);
				@Pc(83) int local83 = local79 >> 12;
				@Pc(87) int local87 = local59 >> 12;
				@Pc(93) int local93 = local83 * local83 >> 12;
				@Pc(99) int local99 = local87 * local87 >> 12;
				@Pc(114) int local114 = (int) (Math.sqrt((double) ((float) (local93 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local114 == 0 ? 0 : 16777216 / local114;
				local11[local45] = 4096 - local125;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6959 = arg0.method3109();
		}
	}
}
