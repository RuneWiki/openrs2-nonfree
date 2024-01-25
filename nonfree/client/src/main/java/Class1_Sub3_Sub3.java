import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	private int anInt1318 = 4;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
	private int anInt1329 = 4;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1329 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt1318 = arg0.method3043();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(28) int local28 = Static236.anInt4609 / this.anInt1329;
			@Pc(33) int local33 = Static95.anInt2365 / this.anInt1318;
			@Pc(44) int[][] local44;
			if (local33 <= 0) {
				local44 = this.method7910(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local33;
				local44 = this.method7910(0, Static95.anInt2365 * local50 / local33);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static236.anInt4609; local86++) {
				@Pc(100) int local100;
				if (local28 > 0) {
					@Pc(94) int local94 = local86 % local28;
					local100 = Static236.anInt4609 * local94 / local28;
				} else {
					local100 = 0;
				}
				local76[local86] = local64[local100];
				local80[local86] = local68[local100];
				local84[local86] = local72[local100];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(28) int local28 = Static236.anInt4609 / this.anInt1329;
			@Pc(33) int local33 = Static95.anInt2365 / this.anInt1318;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method7911(Static95.anInt2365 * local42 / local33, 0);
			} else {
				local52 = this.method7911(0, 0);
			}
			for (local42 = 0; local42 < Static236.anInt4609; local42++) {
				if (local28 <= 0) {
					local19[local42] = local52[0];
				} else {
					@Pc(81) int local81 = local42 % local28;
					local19[local42] = local52[local81 * Static236.anInt4609 / local28];
				}
			}
		}
		return local19;
	}
}
