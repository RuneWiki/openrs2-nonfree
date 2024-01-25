import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	private int anInt3974 = 0;

	@OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
	private int anInt3980 = 1;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
	private int anInt3981 = 0;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3974 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt3981 = arg0.method6138();
		} else if (arg1 == 3) {
			this.anInt3980 = arg0.method6138();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		Static193.method2769();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(27) int local27 = Static168.anIntArray524[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static398.anInt6955; local35++) {
				@Pc(41) int local41 = Static427.anIntArray587[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt3974 == 0) {
					local58 = (local41 - local27) * this.anInt3980;
				} else {
					@Pc(70) int local70 = local47 * local47 + local33 * local33 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt3980) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt3981 == 0) {
					local58 = Static55.anIntArray70[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3981 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local11[local35] = local58;
			}
		}
		return local11;
	}
}
