import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "[I")
	private int[] anIntArray294 = new int[3];

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
	private int anInt3273 = 409;

	@OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
	private int anInt3266 = 4096;

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
	private int anInt3274 = 4096;

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
	private int anInt3268 = 4096;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(27) int[][] local27 = this.method4456(arg0, 0);
			@Pc(31) int[] local31 = local27[2];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[0];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static6.anInt4960; local53++) {
				@Pc(60) int local60 = local39[local53];
				@Pc(68) int local68 = local60 - this.anIntArray294[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt3273 < local68) {
					local43[local53] = local60;
					local47[local53] = local35[local53];
					local51[local53] = local31[local53];
				} else {
					@Pc(100) int local100 = local35[local53];
					local68 = local100 - this.anIntArray294[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt3273 >= local68) {
						@Pc(138) int local138 = local31[local53];
						local68 = local138 - this.anIntArray294[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt3273 >= local68) {
							local43[local53] = local60 * this.anInt3274 >> 12;
							local47[local53] = this.anInt3268 * local100 >> 12;
							local51[local53] = this.anInt3266 * local138 >> 12;
						} else {
							local43[local53] = local60;
							local47[local53] = local100;
							local51[local53] = local138;
						}
					} else {
						local43[local53] = local60;
						local47[local53] = local100;
						local51[local53] = local31[local53];
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3273 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt3266 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt3268 = arg0.method1879();
		} else if (arg1 == 3) {
			this.anInt3274 = arg0.method1879();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method1878();
			this.anIntArray294[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray294[2] = local62 >> 12 & 0x0;
			this.anIntArray294[1] = local62 >> 4 & 0xFF0;
		}
	}
}
