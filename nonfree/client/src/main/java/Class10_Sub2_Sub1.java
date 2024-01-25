import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean499 = arg1.method2502() == 1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method6037(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass102_41.method2566(arg0);
		if (super.aClass102_41.aBoolean216) {
			@Pc(28) int[][] local28 = this.method6045(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static121.anInt2458; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local40[local54];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(21) int[] local21 = this.method6041(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static121.anInt2458; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}
}
