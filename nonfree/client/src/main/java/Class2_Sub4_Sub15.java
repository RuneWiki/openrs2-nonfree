import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class2_Sub4_Sub15 extends Class2_Sub4 {

	@OriginalMember(owner = "client!kfa", name = "C", descriptor = "I")
	private int anInt4775 = 4096;

	@OriginalMember(owner = "client!kfa", name = "F", descriptor = "I")
	private int anInt4777 = 409;

	@OriginalMember(owner = "client!kfa", name = "G", descriptor = "[I")
	private final int[] anIntArray321 = new int[3];

	@OriginalMember(owner = "client!kfa", name = "L", descriptor = "I")
	private int anInt4782 = 4096;

	@OriginalMember(owner = "client!kfa", name = "M", descriptor = "I")
	private int anInt4783 = 4096;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(27) int[][] local27 = this.method7567(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static143.anInt7434; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(66) int local66 = local59 - this.anIntArray321[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt4777 < local66) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(100) int local100 = local35[local53];
					local66 = local100 - this.anIntArray321[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt4777) {
						local43[local53] = local59;
						local47[local53] = local100;
						local51[local53] = local39[local53];
					} else {
						@Pc(141) int local141 = local39[local53];
						local66 = local141 - this.anIntArray321[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt4777 < local66) {
							local43[local53] = local59;
							local47[local53] = local100;
							local51[local53] = local141;
						} else {
							local43[local53] = local59 * this.anInt4782 >> 12;
							local47[local53] = local100 * this.anInt4775 >> 12;
							local51[local53] = this.anInt4783 * local141 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4777 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt4783 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt4775 = arg1.method4518();
		} else if (arg0 == 3) {
			this.anInt4782 = arg1.method4518();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method4503();
			this.anIntArray321[2] = local59 >> 12 & 0x0;
			this.anIntArray321[1] = local59 >> 4 & 0xFF0;
			this.anIntArray321[0] = (local59 & 0xFF0000) << 4;
		}
	}
}
