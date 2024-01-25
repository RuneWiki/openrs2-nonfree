import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class2_Sub2_Sub38 extends Class2_Sub2 {

	@OriginalMember(owner = "client!up", name = "L", descriptor = "I")
	private int anInt6574 = 0;

	@OriginalMember(owner = "client!up", name = "O", descriptor = "I")
	private int anInt6577 = 0;

	@OriginalMember(owner = "client!up", name = "P", descriptor = "I")
	private int anInt6578 = 1;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(24) int local24 = Class208.lb[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static339.anInt6735; local32++) {
				@Pc(38) int local38 = Static212.anIntArray325[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt6574 == 0) {
					local55 = this.anInt6578 * (local38 - local24);
				} else {
					@Pc(67) int local67 = local30 * local30 + local44 * local44 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (local55 * this.anInt6578) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt6577 == 0) {
					local55 = Static160.anIntArray273[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6577 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local16[local32] = local55;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		Static71.method1639();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt6574 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt6577 = arg1.method4421();
		} else if (arg0 == 3) {
			this.anInt6578 = arg1.method4421();
		}
	}
}
