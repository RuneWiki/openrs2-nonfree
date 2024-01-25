import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	private int anInt6255 = 4096;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6255 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(27) int[] local27 = this.method9156(Static591.anInt6375 & arg0 - 1, 0);
			@Pc(33) int[] local33 = this.method9156(arg0, 0);
			@Pc(43) int[] local43 = this.method9156(arg0 + 1 & Static591.anInt6375, 0);
			for (@Pc(45) int local45 = 0; local45 < Static222.anInt4971; local45++) {
				@Pc(59) int local59 = this.anInt6255 * (local43[local45] - local27[local45]);
				@Pc(79) int local79 = this.anInt6255 * (local33[Static620.anInt10845 & local45 + 1] - local33[Static620.anInt10845 & local45 - 1]);
				@Pc(83) int local83 = local79 >> 12;
				@Pc(87) int local87 = local59 >> 12;
				@Pc(93) int local93 = local83 * local83 >> 12;
				@Pc(99) int local99 = local87 * local87 >> 12;
				@Pc(113) int local113 = (int) (Math.sqrt((double) ((float) (local99 + local93 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(121) int local121 = local113 == 0 ? 0 : 16777216 / local113;
				local13[local45] = 4096 - local121;
			}
		}
		return local13;
	}
}
