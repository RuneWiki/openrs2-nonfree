import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	private int anInt7037 = 4096;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
	private int anInt7038 = 409;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "[I")
	private final int[] anIntArray519 = new int[3];

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	private int anInt7035 = 4096;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
	private int anInt7043 = 4096;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(23) int[][] local23 = this.method5968(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static218.anInt3990; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(63) int local63 = local55 - this.anIntArray519[0];
				if (local63 < 0) {
					local63 = -local63;
				}
				if (this.anInt7038 < local63) {
					local39[local49] = local55;
					local43[local49] = local31[local49];
					local47[local49] = local35[local49];
				} else {
					@Pc(97) int local97 = local31[local49];
					local63 = local97 - this.anIntArray519[1];
					if (local63 < 0) {
						local63 = -local63;
					}
					if (local63 > this.anInt7038) {
						local39[local49] = local55;
						local43[local49] = local97;
						local47[local49] = local35[local49];
					} else {
						@Pc(141) int local141 = local35[local49];
						local63 = local141 - this.anIntArray519[2];
						if (local63 < 0) {
							local63 = -local63;
						}
						if (local63 > this.anInt7038) {
							local39[local49] = local55;
							local43[local49] = local97;
							local47[local49] = local141;
						} else {
							local39[local49] = local55 * this.anInt7035 >> 12;
							local43[local49] = this.anInt7043 * local97 >> 12;
							local47[local49] = local141 * this.anInt7037 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7038 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt7037 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt7043 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt7035 = arg0.method2896();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method2881();
			this.anIntArray519[1] = local62 >> 4 & 0xFF0;
			this.anIntArray519[2] = local62 >> 12 & 0x0;
			this.anIntArray519[0] = (local62 & 0xFF0000) << 4;
		}
	}
}
