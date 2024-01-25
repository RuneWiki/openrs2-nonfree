import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class4_Sub6_Sub33 extends Class4_Sub6 {

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	private int anInt6441 = 0;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
	private int anInt6444 = 1;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	private int anInt6439 = 0;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		Static101.method1784();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6439 = arg1.method2490();
		} else if (arg0 == 1) {
			this.anInt6441 = arg1.method2490();
		} else if (arg0 == 3) {
			this.anInt6444 = arg1.method2490();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(27) int local27 = Static165.anIntArray209[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static80.anInt1616; local35++) {
				@Pc(41) int local41 = Static341.anIntArray504[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt6439 == 0) {
					local70 = (local41 - local27) * this.anInt6444;
				} else {
					@Pc(60) int local60 = local33 * local33 + local47 * local47 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt6444) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt6441 == 0) {
					local70 = Static277.anIntArray336[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6441 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local19[local35] = local70;
			}
		}
		return local19;
	}
}
