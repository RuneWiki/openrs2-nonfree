import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	private int anInt6896 = 0;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	private int anInt6898 = 1;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
	private int anInt6897 = 0;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6896 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt6897 = arg0.method3580();
		} else if (arg1 == 3) {
			this.anInt6898 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		Static51.method703();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(25) int local25 = Static405.anIntArray555[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static217.anInt3574; local33++) {
				@Pc(39) int local39 = Static145.anIntArray199[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(56) int local56;
				if (this.anInt6896 == 0) {
					local56 = (local39 - local25) * this.anInt6898;
				} else {
					@Pc(68) int local68 = local45 * local45 + local31 * local31 >> 12;
					local56 = (int) (Math.sqrt((double) ((float) local68 / 4096.0F)) * 4096.0D);
					local56 = (int) ((double) (this.anInt6898 * local56) * 3.141592653589793D);
				}
				local56 -= local56 & 0xFFFFF000;
				if (this.anInt6897 == 0) {
					local56 = Static114.anIntArray157[local56 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6897 == 2) {
					local56 -= 2048;
					if (local56 < 0) {
						local56 = -local56;
					}
					local56 = 2048 - local56 << 1;
				}
				local17[local33] = local56;
			}
		}
		return local17;
	}
}
