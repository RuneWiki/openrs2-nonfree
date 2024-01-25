import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class2_Sub6_Sub28 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
	private int anInt8740 = 0;

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
	private int anInt8744 = 4096;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(23) int[] local23 = this.method8461(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static51.anInt1085; local25++) {
				@Pc(31) int local31 = local23[local25];
				local13[local25] = this.anInt8740 <= local31 && this.anInt8744 >= local31 ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt8740 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt8744 = arg1.method8546();
		}
	}
}
