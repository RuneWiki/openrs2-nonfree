import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!in", name = "K", descriptor = "Z")
	private boolean aBoolean288 = true;

	@OriginalMember(owner = "client!in", name = "I", descriptor = "I")
	private int anInt4095 = 4096;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(31) int[] local31 = this.method7128(0, arg0 - 1 & Static323.anInt5914);
			@Pc(37) int[] local37 = this.method7128(0, arg0);
			@Pc(47) int[] local47 = this.method7128(0, Static323.anInt5914 & arg0 + 1);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static452.anInt7734; local61++) {
				@Pc(75) int local75 = this.anInt4095 * (local47[local61] - local31[local61]);
				@Pc(95) int local95 = (local37[Static80.anInt1453 & local61 + 1] - local37[local61 - 1 & Static80.anInt1453]) * this.anInt4095;
				@Pc(99) int local99 = local95 >> 12;
				@Pc(103) int local103 = local75 >> 12;
				@Pc(109) int local109 = local99 * local99 >> 12;
				@Pc(115) int local115 = local103 * local103 >> 12;
				@Pc(129) int local129 = (int) (Math.sqrt((double) ((float) (local109 + local115 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(137) int local137;
				@Pc(133) int local133;
				@Pc(135) int local135;
				if (local129 == 0) {
					local133 = 0;
					local135 = 0;
					local137 = 0;
				} else {
					local133 = local75 / local129;
					local137 = local95 / local129;
					local135 = 16777216 / local129;
				}
				if (this.aBoolean288) {
					local135 = (local135 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
				}
				local51[local61] = local137;
				local55[local61] = local133;
				local59[local61] = local135;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4095 = arg0.method3967();
		} else if (arg1 == 1) {
			this.aBoolean288 = arg0.method3922() == 1;
		}
	}
}
