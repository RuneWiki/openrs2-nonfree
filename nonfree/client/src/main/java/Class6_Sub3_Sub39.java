import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class6_Sub3_Sub39 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
	private int anInt9987 = 1365;

	@OriginalMember(owner = "client!ww", name = "F", descriptor = "I")
	private int anInt9986 = 0;

	@OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
	private int anInt9992 = 20;

	@OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
	private int anInt9993 = 0;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			for (@Pc(17) int local17 = 0; local17 < Static35.anInt670; local17++) {
				@Pc(31) int local31 = this.anInt9993 + (Static372.anIntArray481[local17] << 12) / this.anInt9987;
				@Pc(43) int local43 = this.anInt9986 + (Static77.anIntArray116[arg0] << 12) / this.anInt9987;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local63 + local57 < 16384 && local65 < this.anInt9992) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local57 + local31 - local63;
					local63 = local51 * local51 >> 12;
					local65++;
					local57 = local49 * local49 >> 12;
				}
				local11[local17] = local65 < this.anInt9992 - 1 ? (local65 << 12) / this.anInt9992 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt9987 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt9992 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt9993 = arg1.method6044();
		} else if (arg0 == 3) {
			this.anInt9986 = arg1.method6044();
		}
	}
}
