import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class4_Sub4_Sub24 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
	private int anInt4541 = 4096;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(30) int[] local30 = this.method5386(0, Static59.anInt1278 & arg0 - 1);
			@Pc(38) int[] local38 = this.method5386(0, arg0);
			@Pc(48) int[] local48 = this.method5386(0, arg0 + 1 & Static59.anInt1278);
			for (@Pc(50) int local50 = 0; local50 < Static124.anInt3576; local50++) {
				@Pc(63) int local63 = (local48[local50] - local30[local50]) * this.anInt4541;
				@Pc(83) int local83 = (local38[local50 + 1 & Static350.anInt6802] - local38[local50 - 1 & Static350.anInt6802]) * this.anInt4541;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local103 + local97 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local11[local50] = 4096 - local128;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4541 = arg1.method2404();
		}
	}
}
