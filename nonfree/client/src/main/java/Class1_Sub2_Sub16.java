import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(25) int[][] local25 = this.method5514(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static158.anInt2658; local51++) {
				local41[local51] = 4096 - local29[local51];
				local45[local51] = 4096 - local33[local51];
				local49[local51] = 4096 - local37[local51];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(31) int[] local31 = this.method5510(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static158.anInt2658; local33++) {
				local11[local33] = 4096 - local31[local33];
			}
		}
		return local11;
	}
}
