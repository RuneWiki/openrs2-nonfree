import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	private int anInt1208 = 1365;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
	private int anInt1210 = 0;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
	private int anInt1212 = 0;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
	private int anInt1215 = 20;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			for (@Pc(17) int local17 = 0; local17 < Static18.anInt439; local17++) {
				@Pc(32) int local32 = (Static198.anIntArray749[local17] << 12) / this.anInt1208 + this.anInt1210;
				@Pc(45) int local45 = (Static134.anIntArray308[arg0] << 12) / this.anInt1208 + this.anInt1212;
				@Pc(51) int local51 = local32;
				@Pc(53) int local53 = local45;
				@Pc(59) int local59 = local32 * local32 >> 12;
				@Pc(65) int local65 = local45 * local45 >> 12;
				@Pc(67) int local67 = 0;
				while (local59 + local65 < 16384 && this.anInt1215 > local67) {
					local53 = local45 + (local51 * local53 >> 12) * 2;
					local51 = local59 + local32 - local65;
					local67++;
					local59 = local51 * local51 >> 12;
					local65 = local53 * local53 >> 12;
				}
				local11[local17] = this.anInt1215 - 1 <= local67 ? 0 : (local67 << 12) / this.anInt1215;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1208 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt1215 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt1210 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt1212 = arg1.method1177();
		}
	}
}
