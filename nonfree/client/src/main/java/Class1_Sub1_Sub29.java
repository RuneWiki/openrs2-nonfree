import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(24) int[][] local24 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(35) int[][] local35 = this.method4715(arg0, 0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[1];
			@Pc(47) int[] local47 = local24[0];
			@Pc(51) int[] local51 = local35[2];
			@Pc(55) int[] local55 = local24[1];
			@Pc(59) int[] local59 = local24[2];
			for (@Pc(61) int local61 = 0; local61 < Static62.anInt1350; local61++) {
				local47[local61] = 4096 - local39[local61];
				local55[local61] = 4096 - local43[local61];
				local59[local61] = 4096 - local51[local61];
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(27) int[] local27 = this.method4716(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1350; local29++) {
				local11[local29] = 4096 - local27[local29];
			}
		}
		return local11;
	}
}
