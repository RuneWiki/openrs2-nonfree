import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
	private int anInt6325 = 1024;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
	private int anInt6324 = 3072;

	@OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
	private int anInt6329 = 2048;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6325 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt6324 = arg0.method8326();
		} else if (arg1 == 2) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		this.anInt6329 = this.anInt6324 - this.anInt6325;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(21) int[] local21 = this.method9156(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static222.anInt4971; local23++) {
				local11[local23] = this.anInt6325 + (this.anInt6329 * local21[local23] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(29) int[][] local29 = this.method9147(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static222.anInt4971; local55++) {
				local45[local55] = (this.anInt6329 * local33[local55] >> 12) + this.anInt6325;
				local49[local55] = (this.anInt6329 * local37[local55] >> 12) + this.anInt6325;
				local53[local55] = (local41[local55] * this.anInt6329 >> 12) + this.anInt6325;
			}
		}
		return local11;
	}
}
