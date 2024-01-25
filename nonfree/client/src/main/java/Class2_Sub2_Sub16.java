import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
	private int anInt3240 = 0;

	@OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
	private int anInt3242 = 1365;

	@OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
	private int anInt3245 = 0;

	@OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
	private int anInt3244 = 20;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3242 = arg0.method6148();
		} else if (arg1 == 1) {
			this.anInt3244 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt3245 = arg0.method6148();
		} else if (arg1 == 3) {
			this.anInt3240 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			for (@Pc(22) int local22 = 0; local22 < Static398.anInt6955; local22++) {
				@Pc(37) int local37 = (Static427.anIntArray587[local22] << 12) / this.anInt3242 + this.anInt3245;
				@Pc(49) int local49 = this.anInt3240 + (Static168.anIntArray524[arg0] << 12) / this.anInt3242;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && local71 < this.anInt3244) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local63 + local37 - local69;
					local63 = local55 * local55 >> 12;
					local71++;
					local69 = local57 * local57 >> 12;
				}
				local11[local22] = this.anInt3244 - 1 > local71 ? (local71 << 12) / this.anInt3244 : 0;
			}
		}
		return local11;
	}
}
