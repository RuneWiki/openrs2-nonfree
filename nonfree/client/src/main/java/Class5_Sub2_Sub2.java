import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
	private int anInt306 = 4;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
	private int anInt294 = 4;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(28) int local28 = Static15.anInt493 / this.anInt306;
			@Pc(33) int local33 = Static88.anInt1584 / this.anInt294;
			@Pc(52) int[][] local52;
			if (local33 > 0) {
				@Pc(42) int local42 = arg0 % local33;
				local52 = this.method5818(Static88.anInt1584 * local42 / local33, 0);
			} else {
				local52 = this.method5818(0, 0);
			}
			@Pc(64) int[] local64 = local52[0];
			@Pc(68) int[] local68 = local52[1];
			@Pc(72) int[] local72 = local52[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static15.anInt493; local86++) {
				@Pc(95) int local95;
				if (local28 <= 0) {
					local95 = 0;
				} else {
					@Pc(101) int local101 = local86 % local28;
					local95 = local101 * Static15.anInt493 / local28;
				}
				local76[local86] = local64[local95];
				local80[local86] = local68[local95];
				local84[local86] = local72[local95];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt306 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt294 = arg0.method1832();
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(24) int local24 = Static15.anInt493 / this.anInt306;
			@Pc(29) int local29 = Static88.anInt1584 / this.anInt294;
			@Pc(45) int[] local45;
			@Pc(35) int local35;
			if (local29 > 0) {
				local35 = arg0 % local29;
				local45 = this.method5808(0, local35 * Static88.anInt1584 / local29);
			} else {
				local45 = this.method5808(0, 0);
			}
			for (local35 = 0; local35 < Static15.anInt493; local35++) {
				if (local24 > 0) {
					@Pc(63) int local63 = local35 % local24;
					local15[local35] = local45[local63 * Static15.anInt493 / local24];
				} else {
					local15[local35] = local45[0];
				}
			}
		}
		return local15;
	}
}
