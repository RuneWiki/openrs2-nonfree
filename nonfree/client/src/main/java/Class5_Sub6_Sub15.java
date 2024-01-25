import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class5_Sub6_Sub15 extends Class5_Sub6 {

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
	private int anInt2957 = 0;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
	private int anInt2959 = 1365;

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "I")
	private int anInt2961 = 20;

	@OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
	private int anInt2964 = 0;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2959 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt2961 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt2957 = arg0.method3698();
		} else if (arg1 == 3) {
			this.anInt2964 = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			for (@Pc(23) int local23 = 0; local23 < Static421.anInt7443; local23++) {
				@Pc(37) int local37 = (Static207.anIntArray185[local23] << 12) / this.anInt2959 + this.anInt2957;
				@Pc(49) int local49 = this.anInt2964 + (Static508.anIntArray471[arg0] << 12) / this.anInt2959;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && local71 < this.anInt2961) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local37 + local63 - local69;
					local71++;
					local69 = local57 * local57 >> 12;
					local63 = local55 * local55 >> 12;
				}
				local11[local23] = local71 >= this.anInt2961 - 1 ? 0 : (local71 << 12) / this.anInt2961;
			}
		}
		return local11;
	}
}
