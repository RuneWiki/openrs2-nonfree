import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			super.aBoolean794 = arg1.method5322(-90) == 1;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass293_41.method7200(arg0);
		if (super.aClass293_41.aBoolean641) {
			@Pc(27) int[] local27 = this.method9204(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static636.anInt10302; local29++) {
				local11[local29] = 4096 - local27[local29];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(31) int[][] local31 = this.method9212(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static636.anInt10302; local57++) {
				local47[local57] = 4096 - local35[local57];
				local51[local57] = 4096 - local39[local57];
				local55[local57] = 4096 - local43[local57];
			}
		}
		return local13;
	}
}
