import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class2_Sub7_Sub30 extends Class2_Sub7 {

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	private int anInt7487 = 1;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
	private int anInt7488 = 0;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	private int anInt7486 = 0;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt7488 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt7486 = arg1.method5170();
		} else if (arg0 == 3) {
			this.anInt7487 = arg1.method5170();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		Static50.method896();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(24) int local24 = Static313.anIntArray521[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static352.anInt6485; local32++) {
				@Pc(38) int local38 = Static427.anIntArray602[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt7488 == 0) {
					local57 = this.anInt7487 * (local38 - local24);
				} else {
					@Pc(70) int local70 = local44 * local44 + local30 * local30 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt7487 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt7486 == 0) {
					local57 = Static336.anIntArray502[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7486 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local11[local32] = local57;
			}
		}
		return local11;
	}
}
