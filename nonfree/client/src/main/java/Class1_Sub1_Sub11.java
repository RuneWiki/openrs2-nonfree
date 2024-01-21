import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fa", name = "ub", descriptor = "I")
	private int anInt1443 = 4;

	@OriginalMember(owner = "client!fa", name = "vb", descriptor = "I")
	private int anInt1444 = 4;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1443 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt1444 = arg1.method1738();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(22) int local22 = Static176.anInt3921 / this.anInt1443;
			@Pc(27) int local27 = Static112.anInt2736 / this.anInt1444;
			@Pc(38) int[][] local38;
			if (local27 <= 0) {
				local38 = this.method3307(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local27;
				local38 = this.method3307(0, Static112.anInt2736 * local44 / local27);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local38[2];
			@Pc(70) int[] local70 = local13[1];
			@Pc(74) int[] local74 = local13[0];
			@Pc(78) int[] local78 = local13[2];
			for (@Pc(80) int local80 = 0; local80 < Static176.anInt3921; local80++) {
				@Pc(94) int local94;
				if (local22 > 0) {
					@Pc(88) int local88 = local80 % local22;
					local94 = Static176.anInt3921 * local88 / local22;
				} else {
					local94 = 0;
				}
				local74[local80] = local58[local94];
				local70[local80] = local62[local94];
				local78[local80] = local66[local94];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(27) int local27 = Static176.anInt3921 / this.anInt1443;
			@Pc(32) int local32 = Static112.anInt2736 / this.anInt1444;
			@Pc(45) int[] local45;
			@Pc(51) int local51;
			if (local32 <= 0) {
				local45 = this.method3303(0, 0);
			} else {
				local51 = arg0 % local32;
				local45 = this.method3303(Static112.anInt2736 * local51 / local32, 0);
			}
			for (local51 = 0; local51 < Static176.anInt3921; local51++) {
				if (local27 <= 0) {
					local18[local51] = local45[0];
				} else {
					@Pc(82) int local82 = local51 % local27;
					local18[local51] = local45[Static176.anInt3921 * local82 / local27];
				}
			}
		}
		return local18;
	}
}
