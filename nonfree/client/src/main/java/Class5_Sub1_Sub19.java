import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class5_Sub1_Sub19 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mv", name = "H", descriptor = "I")
	private int anInt6525 = 4;

	@OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
	private int anInt6529 = 4;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(30) int local30 = Static648.anInt9588 / this.anInt6529;
			@Pc(35) int local35 = Static269.anInt4686 / this.anInt6525;
			@Pc(54) int[][] local54;
			if (local35 > 0) {
				@Pc(44) int local44 = arg0 % local35;
				local54 = this.method9203(0, local44 * Static269.anInt4686 / local35);
			} else {
				local54 = this.method9203(0, 0);
			}
			@Pc(66) int[] local66 = local54[0];
			@Pc(70) int[] local70 = local54[1];
			@Pc(74) int[] local74 = local54[2];
			@Pc(78) int[] local78 = local11[0];
			@Pc(82) int[] local82 = local11[1];
			@Pc(86) int[] local86 = local11[2];
			for (@Pc(88) int local88 = 0; local88 < Static648.anInt9588; local88++) {
				@Pc(104) int local104;
				if (local30 > 0) {
					@Pc(98) int local98 = local88 % local30;
					local104 = Static648.anInt9588 * local98 / local30;
				} else {
					local104 = 0;
				}
				local78[local88] = local66[local104];
				local82[local88] = local70[local104];
				local86[local88] = local74[local104];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt6529 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt6525 = arg1.method8529();
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(26) int local26 = Static648.anInt9588 / this.anInt6529;
			@Pc(31) int local31 = Static269.anInt4686 / this.anInt6525;
			@Pc(39) int[] local39;
			@Pc(45) int local45;
			if (local31 <= 0) {
				local39 = this.method9210(0, 0);
			} else {
				local45 = arg0 % local31;
				local39 = this.method9210(0, local45 * Static269.anInt4686 / local31);
			}
			for (local45 = 0; local45 < Static648.anInt9588; local45++) {
				if (local26 <= 0) {
					local17[local45] = local39[0];
				} else {
					@Pc(80) int local80 = local45 % local26;
					local17[local45] = local39[local80 * Static648.anInt9588 / local26];
				}
			}
		}
		return local17;
	}
}
