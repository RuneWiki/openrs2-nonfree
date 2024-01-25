import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class6_Sub4_Sub23 extends Class6_Sub4 {

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
	private int anInt6108 = 0;

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	private int anInt6112 = 0;

	@OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
	private int anInt6110 = 1;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt6108 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt6112 = arg1.method8604();
		} else if (arg0 == 3) {
			this.anInt6110 = arg1.method8604();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		Static381.method5939();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(27) int local27 = Static629.anIntArray635[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static6.anInt111; local35++) {
				@Pc(41) int local41 = Static284.anIntArray482[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt6108 == 0) {
					local71 = this.anInt6110 * (local41 - local27);
				} else {
					@Pc(61) int local61 = local47 * local47 + local33 * local33 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (this.anInt6110 * local71) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt6112 == 0) {
					local71 = Static343.anIntArray404[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6112 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local19[local35] = local71;
			}
		}
		return local19;
	}
}
