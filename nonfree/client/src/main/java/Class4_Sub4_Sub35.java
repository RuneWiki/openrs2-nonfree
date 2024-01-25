import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class4_Sub4_Sub35 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tj", name = "S", descriptor = "I")
	private int anInt6199 = 20;

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
	private int anInt6195 = 1365;

	@OriginalMember(owner = "client!tj", name = "X", descriptor = "I")
	private int anInt6203 = 0;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
	private int anInt6197 = 0;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			for (@Pc(22) int local22 = 0; local22 < Static124.anInt3576; local22++) {
				@Pc(37) int local37 = (Static149.anIntArray298[local22] << 12) / this.anInt6195 + this.anInt6203;
				@Pc(49) int local49 = this.anInt6197 + (Static64.anIntArray148[arg0] << 12) / this.anInt6195;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && local71 < this.anInt6199) {
					local57 = local49 + (local55 * local57 >> 12) * 2;
					local55 = local63 + local37 - local69;
					local71++;
					local69 = local57 * local57 >> 12;
					local63 = local55 * local55 >> 12;
				}
				local16[local22] = this.anInt6199 - 1 > local71 ? (local71 << 12) / this.anInt6199 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6195 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt6199 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt6203 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt6197 = arg1.method2404();
		}
	}
}
