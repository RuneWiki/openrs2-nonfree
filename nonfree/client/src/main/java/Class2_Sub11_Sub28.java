import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class2_Sub11_Sub28 extends Class2_Sub11 {

	@OriginalMember(owner = "client!tu", name = "H", descriptor = "I")
	private int anInt9622 = 20;

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "I")
	private int anInt9627 = 0;

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "I")
	private int anInt9626 = 1365;

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
	private int anInt9628 = 0;

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			for (@Pc(17) int local17 = 0; local17 < Static301.anInt10214; local17++) {
				@Pc(31) int local31 = (Static523.anIntArray461[local17] << 12) / this.anInt9626 + this.anInt9628;
				@Pc(43) int local43 = this.anInt9627 + (Static137.anIntArray170[arg0] << 12) / this.anInt9626;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65;
				for (local65 = 0; local57 + local63 < 16384 && this.anInt9622 > local65; local65++) {
					local51 = (local49 * local51 >> 12) * 2 + local43;
					local49 = local31 + local57 - local63;
					local63 = local51 * local51 >> 12;
					local57 = local49 * local49 >> 12;
				}
				local11[local17] = local65 >= this.anInt9622 - 1 ? 0 : (local65 << 12) / this.anInt9622;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt9626 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt9622 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt9628 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt9627 = arg1.method8575();
		}
	}
}
