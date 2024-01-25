import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!aia", name = "I", descriptor = "I")
	private int anInt242 = 4096;

	@OriginalMember(owner = "client!aia", name = "K", descriptor = "[I")
	private final int[] anIntArray16 = new int[3];

	@OriginalMember(owner = "client!aia", name = "P", descriptor = "I")
	private int anInt246 = 4096;

	@OriginalMember(owner = "client!aia", name = "Q", descriptor = "I")
	private int anInt247 = 4096;

	@OriginalMember(owner = "client!aia", name = "S", descriptor = "I")
	private int anInt249 = 409;

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt249 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt242 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt246 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt247 = arg0.method8326();
		} else if (arg1 == 4) {
			@Pc(65) int local65 = arg0.method8347();
			this.anIntArray16[2] = local65 >> 12 & 0x0;
			this.anIntArray16[1] = local65 >> 4 & 0xFF0;
			this.anIntArray16[0] = (local65 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(27) int[][] local27 = this.method9147(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static222.anInt4971; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(66) int local66 = local59 - this.anIntArray16[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt249) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(104) int local104 = local35[local53];
					local66 = local104 - this.anIntArray16[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt249) {
						local43[local53] = local59;
						local47[local53] = local104;
						local51[local53] = local39[local53];
					} else {
						@Pc(145) int local145 = local39[local53];
						local66 = local145 - this.anIntArray16[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt249) {
							local43[local53] = local59;
							local47[local53] = local104;
							local51[local53] = local145;
						} else {
							local43[local53] = local59 * this.anInt247 >> 12;
							local47[local53] = local104 * this.anInt246 >> 12;
							local51[local53] = local145 * this.anInt242 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
