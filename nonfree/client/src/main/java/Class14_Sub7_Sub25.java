import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class14_Sub7_Sub25 extends Class14_Sub7 {

	@OriginalMember(owner = "client!mv", name = "N", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!mv", name = "L", descriptor = "I")
	private int anInt6886;

	@OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
	private int anInt6888;

	@OriginalMember(owner = "client!mv", name = "P", descriptor = "I")
	private int anInt6889 = -1;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub25() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)I")
	@Override
	public int method9389() {
		return this.anInt6889;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt6889 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)V")
	@Override
	public void method9380() {
		super.method9380();
		this.anIntArray354 = null;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(34) int local34 = (Static497.anInt8633 == this.anInt6886 ? arg0 : arg0 * this.anInt6886 / Static497.anInt8633) * this.anInt6888;
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(56) int local56;
			@Pc(64) int local64;
			if (Static613.anInt10114 == this.anInt6888) {
				for (local56 = 0; local56 < Static613.anInt10114; local56++) {
					local64 = this.anIntArray354[local34++];
					local46[local56] = (local64 & 0xFF) << 4;
					local42[local56] = local64 >> 4 & 0xFF0;
					local38[local56] = local64 >> 12 & 0xFF0;
				}
			} else {
				for (local56 = 0; local56 < Static613.anInt10114; local56++) {
					local64 = this.anInt6888 * local56 / Static613.anInt10114;
					@Pc(118) int local118 = this.anIntArray354[local34 + local64];
					local46[local56] = (local118 & 0xFF) << 4;
					local42[local56] = local118 >> 4 & 0xFF0;
					local38[local56] = local118 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(BII)V")
	@Override
	public void method9378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method9378(arg0, arg1);
		if (this.anInt6889 >= 0 && Static338.anInterface4_8 != null) {
			@Pc(37) int local37 = Static338.anInterface4_8.method8975(this.anInt6889).aBoolean113 ? 64 : 128;
			this.anIntArray354 = Static338.anInterface4_8.method8977(1.0F, this.anInt6889, local37, local37, false);
			this.anInt6888 = local37;
			this.anInt6886 = local37;
		}
	}
}
