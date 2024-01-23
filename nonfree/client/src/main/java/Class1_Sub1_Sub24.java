import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!n", name = "S", descriptor = "I")
	private int anInt3939 = 1365;

	@OriginalMember(owner = "client!n", name = "N", descriptor = "I")
	private int anInt3936 = 0;

	@OriginalMember(owner = "client!n", name = "T", descriptor = "I")
	private int anInt3940 = 0;

	@OriginalMember(owner = "client!n", name = "V", descriptor = "I")
	private int anInt3941 = 20;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			for (@Pc(24) int local24 = 0; local24 < Static62.anInt1350; local24++) {
				@Pc(39) int local39 = this.anInt3940 + (Static3.anIntArray3[local24] << 12) / this.anInt3939;
				@Pc(51) int local51 = (Static256.anIntArray474[arg0] << 12) / this.anInt3939 + this.anInt3936;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(67) int local67 = 0;
				for (@Pc(73) int local73 = local51 * local51 >> 12; local73 + local65 < 16384 && this.anInt3941 > local67; local73 = local59 * local59 >> 12) {
					local59 = (local57 * local59 >> 12) * 2 + local51;
					local67++;
					local57 = local39 + local65 - local73;
					local65 = local57 * local57 >> 12;
				}
				local17[local24] = this.anInt3941 - 1 > local67 ? (local67 << 12) / this.anInt3941 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3939 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt3941 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt3940 = arg0.method2244();
		} else if (arg1 == 3) {
			this.anInt3936 = arg0.method2244();
		}
	}
}
