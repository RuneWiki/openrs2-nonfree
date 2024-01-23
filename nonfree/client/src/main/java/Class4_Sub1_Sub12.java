import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean392 = arg1.method3110() == 1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(27) int[] local27 = this.method4538(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static68.anInt1753; local29++) {
				local16[local29] = 4096 - local27[local29];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(30) int[][] local30 = this.method4549(0, arg0);
			@Pc(34) int[] local34 = local30[1];
			@Pc(38) int[] local38 = local30[0];
			@Pc(42) int[] local42 = local18[0];
			@Pc(46) int[] local46 = local30[2];
			@Pc(50) int[] local50 = local18[1];
			@Pc(54) int[] local54 = local18[2];
			for (@Pc(56) int local56 = 0; local56 < Static68.anInt1753; local56++) {
				local42[local56] = 4096 - local38[local56];
				local50[local56] = 4096 - local34[local56];
				local54[local56] = 4096 - local46[local56];
			}
		}
		return local18;
	}
}
