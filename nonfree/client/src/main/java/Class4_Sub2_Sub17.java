import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	private int anInt6079 = 4096;

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "I")
	private int anInt6080 = 4096;

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "[I")
	private final int[] anIntArray331 = new int[3];

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
	private int anInt6082 = 409;

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
	private int anInt6085 = 4096;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(23) int[][] local23 = this.method8202(arg0, 0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static417.anInt5248; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(63) int local63 = local55 - this.anIntArray331[0];
				if (local63 < 0) {
					local63 = -local63;
				}
				if (this.anInt6082 < local63) {
					local39[local49] = local55;
					local43[local49] = local31[local49];
					local47[local49] = local35[local49];
				} else {
					@Pc(97) int local97 = local31[local49];
					local63 = local97 - this.anIntArray331[1];
					if (local63 < 0) {
						local63 = -local63;
					}
					if (local63 > this.anInt6082) {
						local39[local49] = local55;
						local43[local49] = local97;
						local47[local49] = local35[local49];
					} else {
						@Pc(141) int local141 = local35[local49];
						local63 = local141 - this.anIntArray331[2];
						if (local63 < 0) {
							local63 = -local63;
						}
						if (local63 > this.anInt6082) {
							local39[local49] = local55;
							local43[local49] = local97;
							local47[local49] = local141;
						} else {
							local39[local49] = local55 * this.anInt6079 >> 12;
							local43[local49] = this.anInt6080 * local97 >> 12;
							local47[local49] = this.anInt6085 * local141 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6082 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt6085 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt6080 = arg0.method7054();
		} else if (arg1 == 3) {
			this.anInt6079 = arg0.method7054();
		} else if (arg1 == 4) {
			@Pc(61) int local61 = arg0.method7013();
			this.anIntArray331[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray331[1] = local61 >> 4 & 0xFF0;
			this.anIntArray331[2] = local61 >> 12 & 0x0;
		}
	}
}
