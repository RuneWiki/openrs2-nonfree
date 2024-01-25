import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class5_Sub1_Sub38 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(27) int[] local27 = this.method9210(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static648.anInt9588; local29++) {
				local11[local29] = 4096 - local27[local29];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(28) int[][] local28 = this.method9203(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static648.anInt9588; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local40[local54];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}
}
