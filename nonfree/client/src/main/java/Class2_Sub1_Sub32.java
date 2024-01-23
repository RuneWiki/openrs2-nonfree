import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
	private int anInt5582 = 4096;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(31) int[] local31 = this.method4946(arg0 - 1 & Static39.anInt939, 0);
			@Pc(37) int[] local37 = this.method4946(arg0, 0);
			@Pc(47) int[] local47 = this.method4946(arg0 + 1 & Static39.anInt939, 0);
			for (@Pc(49) int local49 = 0; local49 < Static114.anInt1359; local49++) {
				@Pc(68) int local68 = this.anInt5582 * (local47[local49] - local31[local49]);
				@Pc(88) int local88 = (local37[Static129.anInt2676 & local49 + 1] - local37[Static129.anInt2676 & local49 - 1]) * this.anInt5582;
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local68 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((float) (local102 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(131) int local131 = local122 == 0 ? 0 : 16777216 / local122;
				local16[local49] = 4096 - local131;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5582 = arg0.method4242();
		}
	}
}
