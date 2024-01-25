import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "Z")
	private boolean aBoolean60 = true;

	@OriginalMember(owner = "client!bq", name = "S", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.aBoolean61 = arg1.method5174() == 1;
		} else if (arg0 == 1) {
			this.aBoolean60 = arg1.method5174() == 1;
		} else if (arg0 == 2) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(31) int[][] local31 = this.method5514(this.aBoolean60 ? Static13.anInt189 - arg0 : arg0, 0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			@Pc(60) int local60;
			if (this.aBoolean61) {
				for (local60 = 0; local60 < Static158.anInt2658; local60++) {
					local47[local60] = local35[Static271.anInt4721 - local60];
					local51[local60] = local39[Static271.anInt4721 - local60];
					local55[local60] = local43[Static271.anInt4721 - local60];
				}
			} else {
				for (local60 = 0; local60 < Static158.anInt2658; local60++) {
					local47[local60] = local35[local60];
					local51[local60] = local39[local60];
					local55[local60] = local43[local60];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(29) int[] local29 = this.method5510(this.aBoolean60 ? Static13.anInt189 - arg0 : arg0, 0);
			if (this.aBoolean61) {
				for (@Pc(34) int local34 = 0; local34 < Static158.anInt2658; local34++) {
					local11[local34] = local29[Static271.anInt4721 - local34];
				}
			} else {
				Static404.method4339(local29, 0, local11, 0, Static158.anInt2658);
			}
		}
		return local11;
	}
}
