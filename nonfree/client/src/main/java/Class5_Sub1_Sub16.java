import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	private int anInt5923 = 4096;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(37) int[] local37 = this.method9210(0, arg0 - 1 & Static542.anInt9254);
			@Pc(43) int[] local43 = this.method9210(0, arg0);
			@Pc(55) int[] local55 = this.method9210(0, arg0 + 1 & Static542.anInt9254);
			for (@Pc(57) int local57 = 0; local57 < Static648.anInt9588; local57++) {
				@Pc(71) int local71 = this.anInt5923 * (local55[local57] - local37[local57]);
				@Pc(91) int local91 = this.anInt5923 * (local43[Static116.anInt3312 & local57 + 1] - local43[local57 - 1 & Static116.anInt3312]);
				@Pc(95) int local95 = local91 >> 12;
				@Pc(99) int local99 = local71 >> 12;
				@Pc(105) int local105 = local95 * local95 >> 12;
				@Pc(111) int local111 = local99 * local99 >> 12;
				@Pc(125) int local125 = (int) (Math.sqrt((double) ((float) (local111 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137 = local125 == 0 ? 0 : 16777216 / local125;
				local21[local57] = 4096 - local137;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt5923 = arg1.method8519();
		}
	}
}
