import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(26) int[] local26 = this.method8201(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static254.anInt4973; local28++) {
				local16[local28] = 4096 - local26[local28];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(29) int[][] local29 = this.method8199(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static254.anInt4973; local55++) {
				local45[local55] = 4096 - local33[local55];
				local49[local55] = 4096 - local37[local55];
				local53[local55] = 4096 - local41[local55];
			}
		}
		return local19;
	}
}
