import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class7_Sub3_Sub37 extends Class7_Sub3 {

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "[I")
	private int[] anIntArray596;

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
	private int anInt6991;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	private int anInt6993;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
	private int anInt6988 = -1;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub37() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6988 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5592() {
		super.method5592();
		this.anIntArray596 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5601(arg0, arg1);
		if (this.anInt6988 >= 0 && Static411.anInterface4_7 != null) {
			@Pc(35) int local35 = Static411.anInterface4_7.method3138(this.anInt6988).aBoolean365 ? 64 : 128;
			this.anIntArray596 = Static411.anInterface4_7.method3142(false, local35, 1.0F, this.anInt6988, local35);
			this.anInt6993 = local35;
			this.anInt6991 = local35;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	@Override
	public int method5590() {
		return this.anInt6988;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(41) int local41 = this.anInt6993 * (this.anInt6991 == Static383.anInt6175 ? arg0 : arg0 * this.anInt6991 / Static383.anInt6175);
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (this.anInt6993 == Static58.anInt1052) {
				for (local63 = 0; local63 < Static58.anInt1052; local63++) {
					local72 = this.anIntArray596[local41++];
					local53[local63] = (local72 & 0xFF) << 4;
					local49[local63] = local72 >> 4 & 0xFF0;
					local45[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static58.anInt1052; local63++) {
					local72 = this.anInt6993 * local63 / Static58.anInt1052;
					@Pc(79) int local79 = this.anIntArray596[local41 + local72];
					local53[local63] = (local79 & 0xFF) << 4;
					local49[local63] = local79 >> 4 & 0xFF0;
					local45[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
