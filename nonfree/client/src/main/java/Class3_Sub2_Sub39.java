import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class3_Sub2_Sub39 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
	private int anInt10299 = 4096;

	@OriginalMember(owner = "client!wq", name = "C", descriptor = "I")
	private int anInt10302 = 4096;

	@OriginalMember(owner = "client!wq", name = "E", descriptor = "I")
	private int anInt10303 = 4096;

	@OriginalMember(owner = "client!wq", name = "L", descriptor = "[I")
	private final int[] anIntArray667 = new int[3];

	@OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
	private int anInt10305 = 409;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(29) int[][] local29 = this.method8718(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static30.anInt908; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray667[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt10305 < local68) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(102) int local102 = local37[local55];
					local68 = local102 - this.anIntArray667[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (local68 > this.anInt10305) {
						local45[local55] = local61;
						local49[local55] = local102;
						local53[local55] = local41[local55];
					} else {
						@Pc(145) int local145 = local41[local55];
						local68 = local145 - this.anIntArray667[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt10305 < local68) {
							local45[local55] = local61;
							local49[local55] = local102;
							local53[local55] = local145;
						} else {
							local45[local55] = local61 * this.anInt10302 >> 12;
							local49[local55] = this.anInt10299 * local102 >> 12;
							local53[local55] = this.anInt10303 * local145 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10305 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt10303 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt10299 = arg0.method4858();
		} else if (arg1 == 3) {
			this.anInt10302 = arg0.method4858();
		} else if (arg1 == 4) {
			@Pc(64) int local64 = arg0.method4862();
			this.anIntArray667[0] = (local64 & 0xFF0000) << 4;
			this.anIntArray667[2] = local64 >> 12 & 0x0;
			this.anIntArray667[1] = local64 >> 4 & 0xFF0;
		}
	}
}
