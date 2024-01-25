import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class1_Sub4_Sub24 extends Class1_Sub4 {

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	private int anInt4829 = 4;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
	private int anInt4823 = 4;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt4823 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt4829 = arg1.method5366();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(22) int local22 = Static66.anInt1511 / this.anInt4823;
			@Pc(27) int local27 = Static61.anInt1456 / this.anInt4829;
			@Pc(43) int[] local43;
			@Pc(33) int local33;
			if (local27 > 0) {
				local33 = arg0 % local27;
				local43 = this.method5958(local33 * Static61.anInt1456 / local27, 0);
			} else {
				local43 = this.method5958(0, 0);
			}
			for (local33 = 0; local33 < Static66.anInt1511; local33++) {
				if (local22 > 0) {
					@Pc(66) int local66 = local33 % local22;
					local13[local33] = local43[Static66.anInt1511 * local66 / local22];
				} else {
					local13[local33] = local43[0];
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(28) int local28 = Static66.anInt1511 / this.anInt4823;
			@Pc(33) int local33 = Static61.anInt1456 / this.anInt4829;
			@Pc(52) int[][] local52;
			if (local33 > 0) {
				@Pc(42) int local42 = arg0 % local33;
				local52 = this.method5956(local42 * Static61.anInt1456 / local33, 0);
			} else {
				local52 = this.method5956(0, 0);
			}
			@Pc(64) int[] local64 = local52[0];
			@Pc(68) int[] local68 = local52[1];
			@Pc(72) int[] local72 = local52[2];
			@Pc(76) int[] local76 = local11[0];
			@Pc(80) int[] local80 = local11[1];
			@Pc(84) int[] local84 = local11[2];
			for (@Pc(86) int local86 = 0; local86 < Static66.anInt1511; local86++) {
				@Pc(103) int local103;
				if (local28 > 0) {
					@Pc(97) int local97 = local86 % local28;
					local103 = Static66.anInt1511 * local97 / local28;
				} else {
					local103 = 0;
				}
				local76[local86] = local64[local103];
				local80[local86] = local68[local103];
				local84[local86] = local72[local103];
			}
		}
		return local11;
	}
}
