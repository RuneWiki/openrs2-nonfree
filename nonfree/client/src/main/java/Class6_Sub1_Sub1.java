import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
	private int anInt452 = 4096;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(32) int[] local32 = this.method8731(arg0 - 1 & Static117.anInt3013, 0);
			@Pc(38) int[] local38 = this.method8731(arg0, 0);
			@Pc(48) int[] local48 = this.method8731(Static117.anInt3013 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static53.anInt1787; local50++) {
				@Pc(63) int local63 = this.anInt452 * (local48[local50] - local32[local50]);
				@Pc(82) int local82 = (local38[local50 + 1 & Static564.anInt9697] - local38[Static564.anInt9697 & local50 - 1]) * this.anInt452;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local63 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local11[local50] = 4096 - local128;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt452 = arg1.method8220();
		}
	}
}
