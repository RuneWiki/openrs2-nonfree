import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
	private int anInt6143 = 4096;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "Z")
	private boolean aBoolean457 = true;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6143 = arg1.method2161();
		} else if (arg0 == 1) {
			this.aBoolean457 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(25) int[] local25 = this.method6013(arg0 - 1 & Static279.anInt5435, 0);
			@Pc(31) int[] local31 = this.method6013(arg0, 0);
			@Pc(41) int[] local41 = this.method6013(Static279.anInt5435 & arg0 + 1, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static85.anInt1910; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt6143;
				@Pc(88) int local88 = (local31[local55 + 1 & Static346.anInt6542] - local31[Static346.anInt6542 & local55 - 1]) * this.anInt6143;
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local69 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local102 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(132) int local132;
				@Pc(130) int local130;
				if (local123 == 0) {
					local130 = 0;
					local132 = 0;
					local134 = 0;
				} else {
					local130 = 16777216 / local123;
					local132 = local69 / local123;
					local134 = local88 / local123;
				}
				if (this.aBoolean457) {
					local132 = (local132 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local45[local55] = local134;
				local49[local55] = local132;
				local53[local55] = local130;
			}
		}
		return local11;
	}
}
