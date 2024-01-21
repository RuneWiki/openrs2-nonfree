import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(28) int[] local28 = this.method3303(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static176.anInt3921; local30++) {
				local18[local30] = 4096 - local28[local30];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(28) int[][] local28 = this.method3307(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local13[0];
			@Pc(44) int[] local44 = local28[2];
			@Pc(48) int[] local48 = local13[1];
			@Pc(52) int[] local52 = local13[2];
			for (@Pc(54) int local54 = 0; local54 < Static176.anInt3921; local54++) {
				local40[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local44[local54];
			}
		}
		return local13;
	}
}
