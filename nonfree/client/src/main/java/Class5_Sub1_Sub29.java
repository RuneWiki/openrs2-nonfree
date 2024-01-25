import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class5_Sub1_Sub29 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	private int anInt7170 = 0;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
	private int anInt7171 = 1;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	private int anInt7169 = 0;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(27) int local27 = Static295.anIntArray403[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static147.anInt3075; local35++) {
				@Pc(41) int local41 = Static315.anIntArray425[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt7169 == 0) {
					local57 = this.anInt7171 * (local41 - local27);
				} else {
					@Pc(69) int local69 = local33 * local33 + local47 * local47 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local69 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt7171 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt7170 == 0) {
					local57 = Static480.anIntArray648[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7170 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local19[local35] = local57;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		Static340.method5294();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7169 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt7170 = arg1.method4220();
		} else if (arg0 == 3) {
			this.anInt7171 = arg1.method4220();
		}
	}
}
