import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class2_Sub4_Sub17 extends Class2_Sub4 {

	@OriginalMember(owner = "client!haa", name = "M", descriptor = "I")
	private int anInt3973 = 0;

	@OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
	private int anInt3972 = 20;

	@OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
	private int anInt3970 = 1365;

	@OriginalMember(owner = "client!haa", name = "Q", descriptor = "I")
	private int anInt3976 = 0;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			for (@Pc(22) int local22 = 0; local22 < Static395.anInt6816; local22++) {
				@Pc(37) int local37 = (Static20.anIntArray40[local22] << 12) / this.anInt3970 + this.anInt3976;
				@Pc(49) int local49 = this.anInt3973 + (Static415.anIntArray482[arg0] << 12) / this.anInt3970;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && this.anInt3972 > local71) {
					local57 = (local55 * local57 >> 12) * 2 + local49;
					local55 = local37 + local63 - local69;
					local71++;
					local69 = local57 * local57 >> 12;
					local63 = local55 * local55 >> 12;
				}
				local16[local22] = this.anInt3972 - 1 <= local71 ? 0 : (local71 << 12) / this.anInt3972;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3970 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt3972 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt3976 = arg0.method2825();
		} else if (arg1 == 3) {
			this.anInt3973 = arg0.method2825();
		}
	}
}
