import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class5_Sub2_Sub28 extends Class5_Sub2 {

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
	private int anInt5096 = 4096;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(27) int[] local27 = this.method5808(0, arg0 - 1 & Static19.anInt547);
			@Pc(33) int[] local33 = this.method5808(0, arg0);
			@Pc(43) int[] local43 = this.method5808(0, Static19.anInt547 & arg0 + 1);
			for (@Pc(45) int local45 = 0; local45 < Static15.anInt493; local45++) {
				@Pc(59) int local59 = this.anInt5096 * (local43[local45] - local27[local45]);
				@Pc(78) int local78 = (local33[Static317.anInt6151 & local45 + 1] - local33[Static317.anInt6151 & local45 - 1]) * this.anInt5096;
				@Pc(82) int local82 = local78 >> 12;
				@Pc(86) int local86 = local59 >> 12;
				@Pc(92) int local92 = local82 * local82 >> 12;
				@Pc(98) int local98 = local86 * local86 >> 12;
				@Pc(112) int local112 = (int) (Math.sqrt((double) ((float) (local98 + local92 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(120) int local120 = local112 == 0 ? 0 : 16777216 / local112;
				local13[local45] = 4096 - local120;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5096 = arg0.method1845();
		}
	}
}
