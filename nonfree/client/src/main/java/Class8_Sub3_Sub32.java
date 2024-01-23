import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class8_Sub3_Sub32 extends Class8_Sub3 {

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(21) int[] local21 = this.method4230(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static239.anInt4789; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(27) int[][] local27 = this.method4224(arg0, 0);
			@Pc(31) int[] local31 = local27[1];
			@Pc(35) int[] local35 = local27[0];
			@Pc(39) int[] local39 = local16[0];
			@Pc(43) int[] local43 = local16[1];
			@Pc(47) int[] local47 = local27[2];
			@Pc(51) int[] local51 = local16[2];
			for (@Pc(53) int local53 = 0; local53 < Static239.anInt4789; local53++) {
				local39[local53] = 4096 - local35[local53];
				local43[local53] = 4096 - local31[local53];
				local51[local53] = 4096 - local47[local53];
			}
		}
		return local16;
	}
}
