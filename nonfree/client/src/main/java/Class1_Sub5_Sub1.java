import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
	private int anInt227;

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt235 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt236 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt227 = arg0.method359();
		} else if (arg1 == 3) {
			this.anInt226 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(23) int local23 = 0; local23 < Static177.anInt4018; local23++) {
				@Pc(37) int local37 = (Static116.anIntArray275[local23] << 12) / this.anInt235 + this.anInt227;
				@Pc(41) int local41 = local37;
				@Pc(47) int local47 = local37 * local37 >> 12;
				@Pc(49) int local49 = 0;
				@Pc(62) int local62 = (Static34.anIntArray75[arg0] << 12) / this.anInt235 + this.anInt226;
				@Pc(68) int local68 = local62 * local62 >> 12;
				@Pc(70) int local70 = local62;
				while (local47 + local68 < 16384 && this.anInt236 > local49) {
					local49++;
					local70 = local62 + (local70 * local41 >> 12) * 2;
					local41 = local37 + local47 - local68;
					local47 = local41 * local41 >> 12;
					local68 = local70 * local70 >> 12;
				}
				local17[local23] = local49 >= this.anInt236 - 1 ? 0 : (local49 << 12) / this.anInt236;
			}
		}
		return local17;
	}
}
