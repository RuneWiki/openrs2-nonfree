import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class4_Sub6_Sub32 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ss", name = "D", descriptor = "I")
	private int anInt6370 = 4;

	@OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
	private int anInt6374 = 4;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6374 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt6370 = arg1.method2490();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(26) int local26 = Static80.anInt1616 / this.anInt6374;
			@Pc(31) int local31 = Static262.anInt4939 / this.anInt6370;
			@Pc(50) int[][] local50;
			if (local31 > 0) {
				@Pc(40) int local40 = arg0 % local31;
				local50 = this.method5516(0, local40 * Static262.anInt4939 / local31);
			} else {
				local50 = this.method5516(0, 0);
			}
			@Pc(62) int[] local62 = local50[0];
			@Pc(66) int[] local66 = local50[1];
			@Pc(70) int[] local70 = local50[2];
			@Pc(74) int[] local74 = local17[0];
			@Pc(78) int[] local78 = local17[1];
			@Pc(82) int[] local82 = local17[2];
			for (@Pc(84) int local84 = 0; local84 < Static80.anInt1616; local84++) {
				@Pc(90) int local90;
				if (local26 <= 0) {
					local90 = 0;
				} else {
					@Pc(96) int local96 = local84 % local26;
					local90 = Static80.anInt1616 * local96 / local26;
				}
				local74[local84] = local62[local90];
				local78[local84] = local66[local90];
				local82[local84] = local70[local90];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(28) int local28 = Static80.anInt1616 / this.anInt6374;
			@Pc(33) int local33 = Static262.anInt4939 / this.anInt6370;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method5508(local42 * Static262.anInt4939 / local33, 0);
			} else {
				local52 = this.method5508(0, 0);
			}
			for (local42 = 0; local42 < Static80.anInt1616; local42++) {
				if (local28 <= 0) {
					local19[local42] = local52[0];
				} else {
					@Pc(81) int local81 = local42 % local28;
					local19[local42] = local52[Static80.anInt1616 * local81 / local28];
				}
			}
		}
		return local19;
	}
}
