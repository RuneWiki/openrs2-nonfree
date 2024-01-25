import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
	private int anInt6132 = 0;

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "I")
	private int anInt6139 = 1;

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
	private int anInt6138 = 0;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6138 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt6132 = arg1.method4463();
		} else if (arg0 == 3) {
			this.anInt6139 = arg1.method4463();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(24) int local24 = Static221.anIntArray194[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static434.anInt4326; local32++) {
				@Pc(38) int local38 = Static280.anIntArray238[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt6138 == 0) {
					local68 = this.anInt6139 * (local38 - local24);
				} else {
					@Pc(58) int local58 = local44 * local44 + local30 * local30 >> 12;
					local68 = (int) (Math.sqrt((double) ((float) local58 / 4096.0F)) * 4096.0D);
					local68 = (int) ((double) (local68 * this.anInt6139) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt6132 == 0) {
					local68 = Static54.anIntArray46[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6132 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local16[local32] = local68;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		Static103.method1475();
	}
}
