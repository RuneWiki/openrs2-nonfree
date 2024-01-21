import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub1_Sub35 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
	private int anInt3957 = 0;

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
	private int anInt3956 = 1365;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	private int anInt3955 = 20;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
	private int anInt3964 = 0;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3956 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt3955 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt3957 = arg0.method3023();
		} else if (arg1 == 3) {
			this.anInt3964 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			for (@Pc(23) int local23 = 0; local23 < Static107.anInt2321; local23++) {
				@Pc(37) int local37 = this.anInt3957 + (Static204.anIntArray179[local23] << 12) / this.anInt3956;
				@Pc(49) int local49 = (Static193.anIntArray277[arg0] << 12) / this.anInt3956 + this.anInt3964;
				@Pc(55) int local55 = local37;
				@Pc(61) int local61 = local37 * local37 >> 12;
				@Pc(63) int local63 = 0;
				@Pc(65) int local65 = local49;
				@Pc(71) int local71 = local49 * local49 >> 12;
				while (local71 + local61 < 16384 && local63 < this.anInt3955) {
					local65 = (local65 * local55 >> 12) * 2 + local49;
					local55 = local61 + local37 - local71;
					local71 = local65 * local65 >> 12;
					local63++;
					local61 = local55 * local55 >> 12;
				}
				local13[local23] = local63 < this.anInt3955 - 1 ? (local63 << 12) / this.anInt3955 : 0;
			}
		}
		return local13;
	}
}
