import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Z")
	private boolean aBoolean273 = true;

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
	private int anInt3660 = 4096;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3660 = arg0.method5771();
		} else if (arg1 == 1) {
			this.aBoolean273 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(36) int[] local36 = this.method7709(Static171.anInt3020 & arg0 - 1, 0);
			@Pc(42) int[] local42 = this.method7709(arg0, 0);
			@Pc(52) int[] local52 = this.method7709(arg0 + 1 & Static171.anInt3020, 0);
			@Pc(56) int[] local56 = local20[0];
			@Pc(60) int[] local60 = local20[1];
			@Pc(64) int[] local64 = local20[2];
			for (@Pc(66) int local66 = 0; local66 < Static279.anInt4906; local66++) {
				@Pc(80) int local80 = this.anInt3660 * (local52[local66] - local36[local66]);
				@Pc(100) int local100 = this.anInt3660 * (local42[local66 + 1 & Static216.anInt4134] - local42[local66 - 1 & Static216.anInt4134]);
				@Pc(104) int local104 = local100 >> 12;
				@Pc(108) int local108 = local80 >> 12;
				@Pc(114) int local114 = local104 * local104 >> 12;
				@Pc(120) int local120 = local108 * local108 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((float) (local120 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(141) int local141;
				@Pc(143) int local143;
				@Pc(145) int local145;
				if (local134 == 0) {
					local141 = 0;
					local143 = 0;
					local145 = 0;
				} else {
					local141 = local100 / local134;
					local145 = 16777216 / local134;
					local143 = local80 / local134;
				}
				if (this.aBoolean273) {
					local143 = (local143 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local56[local66] = local141;
				local60[local66] = local143;
				local64[local66] = local145;
			}
		}
		return local20;
	}
}
