import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class1_Sub4_Sub30 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
	private int anInt5702 = 4096;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(27) int[] local27 = this.method5958(arg0 - 1 & Static67.anInt1514, 0);
			@Pc(33) int[] local33 = this.method5958(arg0, 0);
			@Pc(43) int[] local43 = this.method5958(arg0 + 1 & Static67.anInt1514, 0);
			for (@Pc(45) int local45 = 0; local45 < Static66.anInt1511; local45++) {
				@Pc(58) int local58 = this.anInt5702 * (local43[local45] - local27[local45]);
				@Pc(78) int local78 = this.anInt5702 * (local33[local45 + 1 & Static393.anInt6315] - local33[local45 - 1 & Static393.anInt6315]);
				@Pc(82) int local82 = local78 >> 12;
				@Pc(86) int local86 = local58 >> 12;
				@Pc(92) int local92 = local82 * local82 >> 12;
				@Pc(98) int local98 = local86 * local86 >> 12;
				@Pc(112) int local112 = (int) (Math.sqrt((double) ((float) (local98 + local92 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(120) int local120 = local112 == 0 ? 0 : 16777216 / local112;
				local11[local45] = 4096 - local120;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt5702 = arg1.method5362();
		}
	}
}
