import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class11_Sub2_Sub6 extends Class11_Sub2 {

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
	private int anInt1080 = 0;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
	private int anInt1081 = 20;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	private int anInt1088 = 1365;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
	private int anInt1085 = 0;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1088 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt1081 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt1080 = arg0.method5187();
		} else if (arg1 == 3) {
			this.anInt1085 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			for (@Pc(22) int local22 = 0; local22 < Static339.anInt6549; local22++) {
				@Pc(36) int local36 = (Static73.anIntArray91[local22] << 12) / this.anInt1088 + this.anInt1080;
				@Pc(49) int local49 = (Static155.anIntArray196[arg0] << 12) / this.anInt1088 + this.anInt1085;
				@Pc(55) int local55 = local36;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local36 * local36 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && local71 < this.anInt1081) {
					local57 = local49 + (local55 * local57 >> 12) * 2;
					local55 = local63 + local36 - local69;
					local71++;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local11[local22] = local71 >= this.anInt1081 - 1 ? 0 : (local71 << 12) / this.anInt1081;
			}
		}
		return local11;
	}
}
