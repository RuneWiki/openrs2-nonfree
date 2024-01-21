import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class2_Sub4_Sub36 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
	private int anInt4215 = 1365;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
	private int anInt4213 = 0;

	@OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
	private int anInt4211 = 20;

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
	private int anInt4214 = 0;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4215 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt4211 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt4213 = arg1.method1557();
		} else if (arg0 == 3) {
			this.anInt4214 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			for (@Pc(17) int local17 = 0; local17 < Static118.anInt2608; local17++) {
				@Pc(31) int local31 = this.anInt4214 + (Static2.anIntArray5[arg0] << 12) / this.anInt4215;
				@Pc(44) int local44 = (Static141.anIntArray130[local17] << 12) / this.anInt4215 + this.anInt4213;
				@Pc(48) int local48 = local31;
				@Pc(52) int local52 = local44;
				@Pc(54) int local54 = 0;
				@Pc(60) int local60 = local44 * local44 >> 12;
				@Pc(66) int local66 = local31 * local31 >> 12;
				while (local66 + local60 < 16384 && local54 < this.anInt4211) {
					local54++;
					local48 = (local52 * local48 >> 12) * 2 + local31;
					local52 = local44 + local60 - local66;
					local66 = local48 * local48 >> 12;
					local60 = local52 * local52 >> 12;
				}
				local11[local17] = this.anInt4211 - 1 <= local54 ? 0 : (local54 << 12) / this.anInt4211;
			}
		}
		return local11;
	}
}
