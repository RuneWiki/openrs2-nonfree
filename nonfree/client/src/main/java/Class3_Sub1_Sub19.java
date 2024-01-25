import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class3_Sub1_Sub19 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ns", name = "G", descriptor = "I")
	private int anInt6948 = 20;

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
	private int anInt6950 = 0;

	@OriginalMember(owner = "client!ns", name = "D", descriptor = "I")
	private int anInt6951 = 1365;

	@OriginalMember(owner = "client!ns", name = "B", descriptor = "I")
	private int anInt6955 = 0;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			for (@Pc(23) int local23 = 0; local23 < Static379.anInt5859; local23++) {
				@Pc(37) int local37 = this.anInt6950 + (Static497.anIntArray579[local23] << 12) / this.anInt6951;
				@Pc(49) int local49 = (Static121.anIntArray145[arg0] << 12) / this.anInt6951 + this.anInt6955;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71;
				for (local71 = 0; local69 + local63 < 16384 && local71 < this.anInt6948; local71++) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local63 + local37 - local69;
					local69 = local57 * local57 >> 12;
					local63 = local55 * local55 >> 12;
				}
				local11[local23] = local71 >= this.anInt6948 - 1 ? 0 : (local71 << 12) / this.anInt6948;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt6951 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt6948 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt6950 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.anInt6955 = arg1.method2028(-14795);
		}
	}
}
